    var jumpFailPage= function(){
            printInfo(":进入加载设备图")
            var bestCountImg = "/data/data/com.huawei.health/files/stress/audiosBase/ic_public_info3.png"
            var imgCas = document.getElementById("watchImg");
            imgCas.src = bestCountImg   //"images/"+bestCount+".jpg";
            printDebug(screen.height);
            printDebug(screen.width);
            printDebug(imgCas.height);
            imgCas.style.lineHeight = imgCas.height;
            printDebug(imgCas.width);
            imgCas.style.display = "table-cell";
    }
    var setBackground = function(){
            printInfo("bestCount"+bestCount)
            var bodyImg = localStorage.getItem("bestCountImg");
            printDebug("bodyImg:"+bodyImg)
            printInfo("url('"+bodyImg+"')")
            $("body").css("background-image","url('"+bodyImg+"')");
            //printDebug(document.body.style.backgroundImage)
            }
    var jupgeIsBigCD = function() {
        var isBigCDVar = isBigCD();
        if(isBigCDVar){
            $(".topBlack").css("display","block")
            $(".bottomBlack").css("display","block")
            $(".watch").removeClass("watch").addClass("watch_big");
            $(".fail_button").removeClass("fail_button").addClass("fail_button_big");
            }
    }