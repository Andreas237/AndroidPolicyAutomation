function doLogin(email, password) {
	if (navigator.userAgent !== 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.167 Safari/537.36') {
		return JSON.stringify({error: 'Incorrect user agent'});
	}

	if (document.getElementById('auth-error-message-box')) {
		var br_error;
		if (document.getElementById('ap_password')) {
			br_error = 'invalid_password';
		} else {
			br_error = 'invalid_email';
		}
		return JSON.stringify({error: br_error});

	} else if (document.getElementById('ap_email') || document.getElementById('ap_password')) {

		if (document.getElementById('ap_email')) {
			document.getElementById('ap_email').value = email;
		}
		if (document.getElementById('ap_password')) {
			document.getElementById('ap_password').value = password;
		}

		document.getElementsByName('signIn')[0].submit();

	} else {
		return JSON.stringify({error: 'invalid_cookie'});
	}
}

//this is deprecated, just for old clients
function parseOrders(lastOrderNum, dayCutoff) {
	var parsedOrders = [];
	var abortedParsing = false;

	if (document.getElementById('ordersContainer')) {
	    var orderContainer = document.getElementById('ordersContainer');

	    var orders = orderContainer.querySelectorAll('.order');

	    var qtyRegex = /^(\d+) of /;
	    var asinRegex = /product\/(.*?)\//;

	    for (var i = 0; i < orders.length; i++) {
	    	var curOrder = orders[i];

	    	var orderStatusSpan = curOrder.querySelector('span.a-text-bold');
	    	if (!orderStatusSpan) continue;

	    	var orderStatus = orderStatusSpan.innerText;

	    	var orderInfo = curOrder.querySelector('.order-info');

	    	if (orderInfo) {

		    	var allValues = orderInfo.querySelectorAll('.value');
		    	if (allValues.length >= 4) {
		    		var orderNum = allValues[3].innerHTML.trim();

		    		if (orderNum == lastOrderNum) {
		    			abortedParsing = true;
		    			break;
		    		}

		    		var orderDateStr = allValues[0].innerHTML.trim();

		    		var orderDateUTC = new Date(orderDateStr).getTime() / 1000;
		    		if ((Date.now() / 1000 - orderDateUTC) > (60 * 60 * 24 * dayCutoff)) {
		    			abortedParsing = true;
		    			break;
		    		}

		    		var totalStr = allValues[1].innerHTML.trim().replace('$','');
		    		var total = parseFloat(totalStr);

		    		var orderObj = {dateUTC: orderDateUTC,
		    						total: total,
		    						orderNum: orderNum,
		    						status: orderStatus,
		    						products: []};

		    		var shipments = curOrder.querySelectorAll('.shipment');

		    		shipments.forEach(function(curShipment) {
		    			var productRows = curShipment.querySelectorAll('.a-fixed-left-grid-inner');

		    			productRows.forEach(function(curRow) {
		    				var productLink = curRow.querySelector('.a-row > .a-link-normal');

		    				if (productLink) {
			    				var prodDesc = productLink.innerText.trim();

			    				var qty = 1;
			    				var qtyMatch = qtyRegex.exec(prodDesc);
			    				if (qtyMatch !== null && qtyMatch.length > 1) {
			    					qty = parseFloat(qtyMatch[1]);
			    					prodDesc = prodDesc.substr(qtyMatch[0].length);
			    				}

			    				var prodURL = productLink.href;

			    				var asinMatch = asinRegex.exec(prodURL);
			    				if (asinMatch !== null && asinMatch.length > 1) {
			    					asin = asinMatch[1];

				    				var priceElement = curRow.querySelector('.a-color-price');
				    				var priceStr = priceElement.innerHTML.trim();
				    				var price = parseFloat(priceStr.replace('$',''));

				    				var curProd = {asin: asin,
				    								desc: prodDesc,
				    								price: price,
				    								qty: qty};

				    				orderObj.products.push(curProd);
				    			}
			    			}
		    			});
		    		});

		    		if (orderObj.products.length > 0) {
		    			parsedOrders.push(orderObj);
		    		}
		    	}
	    	}
	    }

	    //console.log(parsedOrders);

	}

	var nextLink = document.querySelector('.a-last:not(.a-disabled) > a');

	var returnDict = {orders: parsedOrders,
					  aborted: abortedParsing,
					  hasNext: nextLink !== null};

	return JSON.stringify(returnDict);
}

function getPageWithOrderAtIndex(idx) {
	var cloneDoc = document.cloneNode(true);
	var cloneOrderContainer = cloneDoc.getElementById('ordersContainer');
	var cloneOrders = cloneOrderContainer.querySelectorAll('.order');

	for (var j = cloneOrders.length - 1; j >= 0; j--) {
		if (j == idx) continue;

		cloneOrders[j].remove();
	}

	return cloneDoc.documentElement.outerHTML;
}

function parseOrders20180608(lastOrderNum, dayCutoff) {
	if (navigator.userAgent !== 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_13_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/64.0.3282.167 Safari/537.36') {
		return JSON.stringify({error: 'Incorrect user agent'});
	}

	var parsedOrders = [];
	var abortedParsing = false;

	if (document.getElementById('ordersContainer')) {
	    var orderContainer = document.getElementById('ordersContainer');

	    var orders = orderContainer.querySelectorAll('.order');

	    for (var i = 0; i < orders.length; i++) {
	    	var curOrder = orders[i];

	    	var rawHTML = getPageWithOrderAtIndex(i);

	    	var orderInfo = curOrder.querySelector('.order-info');

	    	if (orderInfo) {

		    	var allValues = orderInfo.querySelectorAll('.value');
		    	if (allValues.length >= 4) {
		    		var orderNum = allValues[3].innerHTML.trim();

		    		if (orderNum == lastOrderNum) {
		    			abortedParsing = true;
		    			break;
		    		}

		    		var orderDateStr = allValues[0].innerHTML.trim();

		    		var orderDateUTC = new Date(orderDateStr).getTime() / 1000;
		    		if ((Date.now() / 1000 - orderDateUTC) > (60 * 60 * 24 * dayCutoff)) {
		    			abortedParsing = true;
		    			break;
		    		}

		    		var totalStr = allValues[1].innerHTML.trim().replace('$','');
		    		var total = parseFloat(totalStr);

		    		var detailLink = orderInfo.querySelector('.a-col-right a');

		    		var orderObj = {dateUTC: orderDateUTC,
		    						total: total,
		    						orderNum: orderNum,
		    						shipments: [],
		    						raw_html: rawHTML,
		    						detail_link: detailLink.href};

		    		orderObj.shipments = parseShipments(curOrder);

		    		parsedOrders.push(orderObj);
		    	}
	    	}
	    }

	    //console.log(parsedOrders);

	}

	var nextLink = document.querySelector('.a-last:not(.a-disabled) > a');

	var returnDict = {orders: parsedOrders,
					  aborted: abortedParsing,
					  hasNext: nextLink !== null};

	return JSON.stringify(returnDict);
}

function parseOrderDetails() {
	var subtotalSection = document.querySelector('#od-subtotals');

	var giftCardAmount = 0;
	var totalAfterGC = 0;

	if (subtotalSection) {
		var subtotalRows = subtotalSection.querySelectorAll('.a-row:not(.a-spacing-mini)');

		for (var i = 0; i < subtotalRows.length; i++) {
			var leftTextElem = subtotalRows[i].querySelector('.a-text-left > span');
			var rightTextElem = subtotalRows[i].querySelector('.a-text-right > span');

			if (leftTextElem) {
				if (leftTextElem.innerText.indexOf('Gift Card') >= 0) {
					giftCardAmount = parseFloat(rightTextElem.innerText.replace(/[-$]/g, ''));

				} else if (leftTextElem.innerText.indexOf('Grand Total') >= 0) {
					totalAfterGC = parseFloat(rightTextElem.innerText.replace(/[$]/g, ''));
				}
			}
		}
	}

	var parsedShipments = parseShipments(document);

	var returnDict = {shipments: parsedShipments,
					  raw_html: document.documentElement.outerHTML};

	if (giftCardAmount > 0) {
		returnDict.total = totalAfterGC + giftCardAmount;
	}

	return JSON.stringify(returnDict);
}

function parseShipments(container) {
	var qtyRegex = /^(\d+) of /;
    var asinRegex = /product\/(.*?)\//;

    var parsedShipments = [];

	var shipments = container.querySelectorAll('.shipment');

	shipments.forEach(function(curShipment) {

		var shipmentStatusSpan = curShipment.querySelector('span.a-text-bold');
    	if (!shipmentStatusSpan) return;

    	var shipmentStatus = shipmentStatusSpan.innerText;

		var shipmentObj = {status: shipmentStatus,
						   products: []};

		var productRows = curShipment.querySelectorAll('.a-fixed-left-grid-inner');

		productRows.forEach(function(curRow) {
			var productLink = curRow.querySelector('.a-row > .a-link-normal');

			if (productLink) {
				var prodDesc = productLink.innerText.trim();

				var qty = 1;
				var qtyMatch = qtyRegex.exec(prodDesc);
				if (qtyMatch !== null && qtyMatch.length > 1) {
					qty = parseFloat(qtyMatch[1]);
					prodDesc = prodDesc.substr(qtyMatch[0].length);
				}

				var prodURL = productLink.href;

				var asinMatch = asinRegex.exec(prodURL);
				if (asinMatch !== null && asinMatch.length > 1) {
					asin = asinMatch[1];

    				var priceElement = curRow.querySelector('.a-color-price');
    				var priceStr = priceElement.innerHTML.trim();
    				var price = parseFloat(priceStr.replace('$',''));

    				var prodObj = {asin: asin,
    								desc: prodDesc,
    								price: price,
    								qty: qty};

    				shipmentObj.products.push(prodObj);
    			}
			}
		});

		//look for the See All link
		var aRowRows = curShipment.querySelectorAll('.a-fixed-right-grid-col > .a-row');
		if (aRowRows.length > 2) {
			var candSeeAllRow = aRowRows[1];
			var candLink = candSeeAllRow.querySelector('a');
			if (candLink && candLink.innerText.indexOf('See all') !== -1) {
				shipmentObj.seeAllLink = candLink.href;
			}
		}

		if (shipmentObj.products.length > 0) {
			parsedShipments.push(shipmentObj);
		}

	});

	return parsedShipments;
}

function goToNext() {
	var nextLink = document.querySelector('.a-last:not(.a-disabled) > a');
	nextLink.click();
}

function parseProduct() {
	var prodDetails = {};

	var upcRegex = /\d{12}/;

	var bulletList = document.querySelectorAll('#detail-bullets .content > ul > li');
	if (bulletList !== null) {
		for (var i = 0; i < bulletList.length; i++) {
			if (bulletList[i].innerHTML.indexOf('UPC') > 0) {
				var upcMatch = upcRegex.exec(bulletList[i].innerHTML);
				if (upcMatch !== null && upcMatch.length > 0) {
					prodDetails.upc = upcMatch[0];
				}
			}
		}
	}

	var imgElem = document.getElementById('landingImage');
	if (imgElem !== null) {
		if (imgElem.src.substring(0,4) == 'http') {
			prodDetails.image_url = imgElem.src;
		}
	}

	var catNodes = document.querySelectorAll('#wayfinding-breadcrumbs_feature_div > ul > li:not(.a-breadcrumb-divider)');
	if (catNodes !== null) {
		var allCats = [];
		for (var i = 0; i < catNodes.length; i++) {
			allCats.push(catNodes[i].innerText);
		}
		prodDetails.category = allCats.join(',');
	}

	return JSON.stringify(prodDetails);
}

function debugPage() {
	return document.getElementsByTagName('html')[0].innerHTML;
}