        function printInfo(msg) {
            write("INFO", msg);
        }
	
        function write(type, msg) {
            msg = " [Health StressGame] " + msg;
            try {
                window.JsInteraction.log(type, msg);
            } catch(e) {
                console.log(type + " : "+e + msg);
            }
        }
        function printDebug(msg) {
            write("DEBUG",msg);
        }

        function isBigCD() {
            console.log("request native interface: isBigCD");
            try{
                return window.JsInteraction.isBigCD();
            } catch(e){
                console.log("isBigCD:" + e)
            }
        }

