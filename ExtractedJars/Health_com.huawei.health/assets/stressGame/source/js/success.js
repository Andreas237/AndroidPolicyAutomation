        var badTalk = "游戏过程您的状态不够放松， 请配合引导调节呼吸，荷花将会随之绽放。";
        var commTalk = "游戏过程您的状态较为放松， 很多荷花已为您绽放。";
        var goodTalk = "游戏过程您的状态非常放松， 满塘荷花已为您绽放。";
//      $(document).ready(function(){
//      //设置body背景图
//      setBackground();
//      //画雷达图
//      drawRadar();
//      //绑定点击事件
//      $("#radar").on("click",function(){
//      alert();
//      });
//      //根据分数来建议
//      drawText();
//      });
        function jupgeBidCD(){
            var isBigCDVar = isBigCD();
            printInfo("isBigCD:"+isBigCDVar)
            if(isBigCDVar){
                $(".topBlack").css("display","block")
                $(".bottomBlack").css("display","block")
                $("#radar").css("margin-top","1.7rem")
                $(".text").css("padding-top","2.5rem")
                $("#phone").css("bottom","2.556rem")
            }
        }
        function setBackground(){
            printInfo("bestCount"+bestCount)
            $("body").css("background-color","#5B8AC2");
            var bodyImg = localStorage.getItem("bestCountImg");
            printDebug("bodyImg:"+bodyImg)
            printInfo("url('"+bodyImg+"')")
            $("body").css("background-image","url('"+bodyImg+"')");
            //printDebug(document.body.style.backgroundImage)
            }
        function drawText(){
            var successScore= localStorage.getItem("score");
            printInfo("score "+score)
//          var successScore =50;
            $("#successScore").html(successScore);
            if(successScore>=0&&successScore<=50){
                $("#language").html(badTalk);
            }else if(successScore>50&&successScore<=80){
                $("#language").html(commTalk);
            }else{
                $("#language").html(goodTalk);
            }
        }
        window.alert = function(){
            var shield = document.createElement("div");
            shield.id="shield";
            shield.style.position = "absolute";
            shield.style.left = "0px";
            shield.style.top = "0px";
            shield.style.width = "100%";
            shield.style.height="100%";
            shield.style.zIndex="199";
            shield.style.background='rgba(0,0,0,.2)';
            var alertFram = document.createElement("DIV");
            var isBigFlag = isBigCD();
            alertFram.id="alertFram";
            alertFram.style.position = "absolute";
            alertFram.style.left = "25%";
            alertFram.style.top = "1.5%";
            alertFram.style.width = "50%";
            alertFram.style.height = "97%";
            if(isBigFlag){
                alertFram.style.top = "2.5rem";
                alertFram.style.height = "auto";
            }
            alertFram.style.background = "#fff";
            alertFram.style.borderRadius = "0.111rem";
            alertFram.style.zIndex = "19901024";
            strHtml = "<div style=\"margin:0px; padding:0px;width:100%;\">";
            strHtml +="<p style=' height:0.222rem;line-height:0.222rem;' >&nbsp;</p>"
            strHtml += " <p style=\"background:#FFF;padding:0 0.333rem;font-size:18px;text-align:left;height:0.334rem;line-height:0.334rem;font-weight:bold;\">放松状态</p>";
            strHtml +="<p style=' height:0.2rem'>&nbsp;</p>"
            //中间弹窗的最大范围
            var contentHieght = (window.screen.height-0.556*window.screen.width/10)*0.97 - (0.778*2)*window.screen.width/10
            printDebug("window.screen.height："+window.screen.height);
            printDebug("此时屏幕div的高度为:"+(window.screen.height-0.556*window.screen.width/10)*0.98);
            printDebug("contentHieght: "+contentHieght);
            if(contentHieght>=15*5*1.5*2){
                contentHieght=15*5*1.5*2
                strHtml += "<div id='contentBar' style='margin-right:0.139rem;'>";
            }else{
                strHtml += "<div id='contentBar' style=' overflow:auto;height:"+contentHieght+"px;margin-right:0.139rem;'>";
            }
            strHtml += " <p style=\"background:#fff;padding:0 0.139rem 0 0.333rem;margin:0;text-align:left;font-size:15px; \">"+"平静度：良好的心境，保持平和安宁状态的时间长短。"+"</p>";
            strHtml += " <p style=\"background:#fff;padding:0 0.139rem 0 0.333rem;margin-right:0;text-align:left;font-size:15px;\">"+"控制力：控制自身情绪状态波动幅度的程度强弱。"+"</p>";
            strHtml += " <p style=\"background:#fff;padding:0 0.139rem 0 0.333rem;margin-right:0;text-align:left;font-size:15px;\">"+"稳定性：保持自身情绪处于同一状态或在其附近波动强弱的能力。"+"</p>";
            strHtml += " <p style=\"background:#fff;padding:0 0.139rem 0 0.333rem;margin-right:0;text-align:left;font-size:15px;\">"+"流畅度：正常状态的保持或良好心态自主调节的能力强弱。"+"</p>";
            strHtml += " <p style=\"background:#fff;padding:0 0.139rem 0 0.333rem;margin-right:0;text-align:left;font-size:15px;\">"+"抵抗力：抵抗外界突发刺激的能力。"+"</p>";
            strHtml += " <p style=\"background:#fff;padding:0 0.139rem 0 0.333rem;margin-right:0;text-align:left;font-size:15px;\">"+"(雷达图面积越大，状态越好。)"+"</p>";
            strHtml += " </div>";
            strHtml += "<p style='height:0.222rem;'>&nbsp;</p>";
            strHtml += " <p class=\"changeColor\" style=\"background:#FFF;text-align:center;font-size:15px;color:#FB6522;height:0.334rem;line-height:0.334rem;\"><span onclick=\"doOk()\" style=\"width: 50%;cursor: pointer;\">知道了</span></p>";
            strHtml += "<p style='height:0.222rem;'>&nbsp;</p>";
            strHtml += "</div>";
            alertFram.innerHTML = strHtml;
            document.body.appendChild(alertFram);
            document.body.appendChild(shield)
            this.doOk = function(){
                shield.style.display = "none";
                alertFram.style.display = "none";
                document.body.removeChild(alertFram);
                document.body.removeChild(shield)
            }
            alertFram.focus();
            document.body.onselectstart = function(){return false;};
        }
        //画雷达图
        function drawRadar(){
            var radar = document.getElementById("radar");
            radar.style.width = $("#radar").height();
            radar.style.height = $("#radar").width();
            var radarChart = echarts.init(document.getElementById('radar'));
            radarChart.clear()
            printInfo("进入画雷达")
            printInfo("window.screen.height "+window.screen.height);
            printInfo("window.screen.width "+window.screen.width);
            var successCalm = localStorage.getItem("calm");
            var successControl = localStorage.getItem("control");
            var successFluency = localStorage.getItem("fluency");
            var successStabilization = localStorage.getItem("stabilization");
            var successResist = localStorage.getItem("resist");
            printDebug("successCalm "+successCalm)
            printDebug("successControl "+successControl)
            printDebug("successFluency "+successFluency)
            printDebug("successStabilization "+successStabilization)
            printDebug("successResist "+successResist)
            if(successCalm>1){
                successCalm=1;
            }else if(successCalm<0){
                successCalm=0;
            }
            if(successControl>1){
                successControl=1;
            }else if(successControl<0){
                successControl=0;
            }
            if(successFluency>1){
                successFluency=1;
            }else if(successFluency<0){
                successFluency=0;
            }
            if(successStabilization>1){
                successStabilization=1;
            }else if(successStabilization<0){
                successStabilization=0;
            }
            if(successResist>1){
                successResist=1;
            }else if(successResist<0){
                successResist=0;
            }
            option = {
//              tooltip: {
//              trigger: 'axis'
//              },
                radar: [
                    {
                        indicator: [
                            {text: '平静度', max: 100,min:0},
                            {text: '控制力', max: 100,min:0},
                            {text: '流畅度',  max: 100,min:0},
                            {text: '稳定性', max: 100,min:0},
                            {text:'抵抗力', max: 100,min:0}
                        ],
                        center: ['50%','50%'],
                        splitNumber:5,
                        radius:"65%",
                        name:{
                            color:"#fff",
                            fontSize:"10px"
                        },
                        nameGap:8,
                        splitArea: {
                            areaStyle: {
                                color: '#000',
                                opacity:0,
                            }
                        },
                        splitLine: {
                            lineStyle: {
                                width:0.5,
                                color: 'white'
                                }
                        },
                        axisLine: {
                            lineStyle: {
                                color: '#fff',
                                type:"solid",
                                width:0.5,
                                }
                        },
                    }
                ],
                series: [
                    {
                        type: 'radar',
                        symbolSize:4,
                        itemStyle:{
                            normal:{
                                color:'#00BFC9',
                                borderWidth:1.5,
                            }
                        },
                        tooltip: {
                            trigger: 'item'
                        },
                        data: [
                            {
                                value: [Math.round(successCalm*100),Math.round(successControl*100),Math.round(successFluency*100),Math.round(successStabilization*100),Math.round(successResist*100)],
	                        lineStyle:{
                                    normal:{
                                        color:"#00BFC9",
                                        width:2,
                                    }
                                },
                                areaStyle: {
                                    normal: {
                                        opacity:0.5,
                                        color: "#00bfc9"
                                    }
                                },
                            }
                        ]
                    },
                ]
            };
            radarChart.setOption(option)
            //雷达图屏幕自适应
            window.onresize = function(){
                printInfo("雷达图   进入onresize函数")
                setTimeout(function(){
                    //printDebug("  进入屏幕变化的定时器")
                    radar.style.width = $("#radar").height();
                    radar.style.height = $("#radar").width();
                    printInfo("window.screen.width:"+window.screen.width+"window.screen.height:"+window.screen.height)
                        if(window.screen.width>window.screen.height){
                            printInfo("雷达图自适应")
                            radarChart.resize();
                        }
                    }, 350)
                }
            }
