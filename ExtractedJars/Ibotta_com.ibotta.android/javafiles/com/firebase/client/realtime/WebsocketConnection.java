// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.firebase.client.RunLoop;
import com.firebase.client.core.Context;
import com.firebase.client.core.RepoInfo;
import com.firebase.client.realtime.util.StringListReader;
import com.firebase.client.utilities.LogWrapper;
import com.firebase.client.utilities.Utilities;
import com.firebase.client.utilities.encoding.JsonHelpers;
import com.firebase.tubesock.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class WebsocketConnection
{
	public static interface Delegate
	{

		public abstract void onDisconnect(boolean flag);

		public abstract void onMessage(Map map);
	}

	private static interface WSClient
	{

		public abstract void close();

		public abstract void connect();

		public abstract void send(String s);
	}

	private class WSClientTubesock
		implements WSClient, WebSocketEventHandler
	{

		private void shutdown()
		{
			ws.close();
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field WebSocket ws>
		//    2    4:invokevirtual   #48  <Method void WebSocket.close()>
			try
			{
				ws.blockClose();
		//    3    7:aload_0         
		//    4    8:getfield        #32  <Field WebSocket ws>
		//    5   11:invokevirtual   #51  <Method void WebSocket.blockClose()>
				return;
		//    6   14:return          
			}
			catch(InterruptedException interruptedexception)
		//*   7   15:astore_1        
			{
				logger.error("Interrupted while shutting down websocket threads", ((Throwable) (interruptedexception)));
		//    8   16:aload_0         
		//    9   17:getfield        #27  <Field WebsocketConnection this$0>
		//   10   20:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
		//   11   23:ldc1            #57  <String "Interrupted while shutting down websocket threads">
		//   12   25:aload_1         
		//   13   26:invokevirtual   #63  <Method void LogWrapper.error(String, Throwable)>
			}
		//   14   29:return          
		}

		public void close()
		{
			ws.close();
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field WebSocket ws>
		//    2    4:invokevirtual   #48  <Method void WebSocket.close()>
		//    3    7:return          
		}

		public void connect()
		{
			try
			{
				ws.connect();
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field WebSocket ws>
		//    2    4:invokevirtual   #68  <Method void WebSocket.connect()>
				return;
		//    3    7:return          
			}
			catch(WebSocketException websocketexception)
		//*   4    8:astore_1        
			{
				if(logger.logsDebug())
		//*   5    9:aload_0         
		//*   6   10:getfield        #27  <Field WebsocketConnection this$0>
		//*   7   13:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
		//*   8   16:invokevirtual   #72  <Method boolean LogWrapper.logsDebug()>
		//*   9   19:ifeq            35
					logger.debug("Error connecting", ((Throwable) (websocketexception)));
		//   10   22:aload_0         
		//   11   23:getfield        #27  <Field WebsocketConnection this$0>
		//   12   26:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
		//   13   29:ldc1            #74  <String "Error connecting">
		//   14   31:aload_1         
		//   15   32:invokevirtual   #77  <Method void LogWrapper.debug(String, Throwable)>
			}
			shutdown();
		//   16   35:aload_0         
		//   17   36:invokespecial   #79  <Method void shutdown()>
		//   18   39:return          
		}

		public void onClose()
		{
			ctx.getRunLoop().scheduleNow(new Runnable() {

				public void run()
				{
					if(logger.logsDebug())
				//*   0    0:aload_0         
				//*   1    1:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				//*   2    4:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//*   3    7:invokestatic    #32  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//*   4   10:invokevirtual   #38  <Method boolean LogWrapper.logsDebug()>
				//*   5   13:ifeq            31
						logger.debug("closed");
				//    6   16:aload_0         
				//    7   17:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				//    8   20:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//    9   23:invokestatic    #32  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//   10   26:ldc1            #40  <String "closed">
				//   11   28:invokevirtual   #44  <Method void LogWrapper.debug(String)>
					onClosed();
				//   12   31:aload_0         
				//   13   32:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				//   14   35:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//   15   38:invokestatic    #48  <Method void WebsocketConnection.access$600(WebsocketConnection)>
				//   16   41:return          
				}

				final WSClientTubesock this$1;

			
			{
				this$1 = WSClientTubesock.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WebsocketConnection this$0>
		//    2    4:invokestatic    #84  <Method Context WebsocketConnection.access$400(WebsocketConnection)>
		//    3    7:invokevirtual   #90  <Method RunLoop Context.getRunLoop()>
		//    4   10:new             #17  <Class WebsocketConnection$WSClientTubesock$3>
		//    5   13:dup             
		//    6   14:aload_0         
		//    7   15:invokespecial   #93  <Method void WebsocketConnection$WSClientTubesock$3(WebsocketConnection$WSClientTubesock)>
		//    8   18:invokeinterface #99  <Method void RunLoop.scheduleNow(Runnable)>
		//    9   23:return          
		}

		public void onError(WebSocketException websocketexception)
		{
			ctx.getRunLoop().scheduleNow(((_cls4) (websocketexception)). new Runnable() {

				public void run()
				{
					if(logger.logsDebug())
				//*   0    0:aload_0         
				//*   1    1:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				//*   2    4:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//*   3    7:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//*   4   10:invokevirtual   #43  <Method boolean LogWrapper.logsDebug()>
				//*   5   13:ifeq            35
						logger.debug("had an error", ((Throwable) (e)));
				//    6   16:aload_0         
				//    7   17:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				//    8   20:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//    9   23:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//   10   26:ldc1            #45  <String "had an error">
				//   11   28:aload_0         
				//   12   29:getfield        #24  <Field WebSocketException val$e>
				//   13   32:invokevirtual   #49  <Method void LogWrapper.debug(String, Throwable)>
					if(e.getMessage().startsWith("unknown host"))
				//*  14   35:aload_0         
				//*  15   36:getfield        #24  <Field WebSocketException val$e>
				//*  16   39:invokevirtual   #55  <Method String WebSocketException.getMessage()>
				//*  17   42:ldc1            #57  <String "unknown host">
				//*  18   44:invokevirtual   #63  <Method boolean String.startsWith(String)>
				//*  19   47:ifeq            84
					{
						if(logger.logsDebug())
				//*  20   50:aload_0         
				//*  21   51:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				//*  22   54:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//*  23   57:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//*  24   60:invokevirtual   #43  <Method boolean LogWrapper.logsDebug()>
				//*  25   63:ifeq            153
							logger.debug("If you are running on Android, have you added <uses-permission android:name=\"android.permission.INTERNET\" /> under <manifest> in AndroidManifest.xml?");
				//   26   66:aload_0         
				//   27   67:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				//   28   70:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//   29   73:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//   30   76:ldc1            #65  <String "If you are running on Android, have you added <uses-permission android:name=\"android.permission.INTERNET\" /> under <manifest> in AndroidManifest.xml?">
				//   31   78:invokevirtual   #68  <Method void LogWrapper.debug(String)>
					} else
				//*  32   81:goto            153
					if(logger.logsDebug())
				//*  33   84:aload_0         
				//*  34   85:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				//*  35   88:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//*  36   91:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//*  37   94:invokevirtual   #43  <Method boolean LogWrapper.logsDebug()>
				//*  38   97:ifeq            153
					{
						LogWrapper logwrapper = logger;
				//   39  100:aload_0         
				//   40  101:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				//   41  104:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//   42  107:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//   43  110:astore_1        
						StringBuilder stringbuilder = new StringBuilder();
				//   44  111:new             #70  <Class StringBuilder>
				//   45  114:dup             
				//   46  115:invokespecial   #71  <Method void StringBuilder()>
				//   47  118:astore_2        
						stringbuilder.append("|");
				//   48  119:aload_2         
				//   49  120:ldc1            #73  <String "|">
				//   50  122:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
				//   51  125:pop             
						stringbuilder.append(e.getMessage());
				//   52  126:aload_2         
				//   53  127:aload_0         
				//   54  128:getfield        #24  <Field WebSocketException val$e>
				//   55  131:invokevirtual   #55  <Method String WebSocketException.getMessage()>
				//   56  134:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
				//   57  137:pop             
						stringbuilder.append("|");
				//   58  138:aload_2         
				//   59  139:ldc1            #73  <String "|">
				//   60  141:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
				//   61  144:pop             
						logwrapper.debug(stringbuilder.toString());
				//   62  145:aload_1         
				//   63  146:aload_2         
				//   64  147:invokevirtual   #80  <Method String StringBuilder.toString()>
				//   65  150:invokevirtual   #68  <Method void LogWrapper.debug(String)>
					}
					onClosed();
				//   66  153:aload_0         
				//   67  154:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				//   68  157:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//   69  160:invokestatic    #84  <Method void WebsocketConnection.access$600(WebsocketConnection)>
				//   70  163:return          
				}

				final WSClientTubesock this$1;
				final WebSocketException val$e;

			
			{
				this$1 = final_wsclienttubesock;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				e = WebSocketException.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field WebSocketException val$e>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WebsocketConnection this$0>
		//    2    4:invokestatic    #84  <Method Context WebsocketConnection.access$400(WebsocketConnection)>
		//    3    7:invokevirtual   #90  <Method RunLoop Context.getRunLoop()>
		//    4   10:new             #19  <Class WebsocketConnection$WSClientTubesock$4>
		//    5   13:dup             
		//    6   14:aload_0         
		//    7   15:aload_1         
		//    8   16:invokespecial   #104 <Method void WebsocketConnection$WSClientTubesock$4(WebsocketConnection$WSClientTubesock, WebSocketException)>
		//    9   19:invokeinterface #99  <Method void RunLoop.scheduleNow(Runnable)>
		//   10   24:return          
		}

		public void onLogMessage(String s)
		{
			if(logger.logsDebug())
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field WebsocketConnection this$0>
		//*   2    4:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
		//*   3    7:invokevirtual   #72  <Method boolean LogWrapper.logsDebug()>
		//*   4   10:ifeq            50
			{
				LogWrapper logwrapper = logger;
		//    5   13:aload_0         
		//    6   14:getfield        #27  <Field WebsocketConnection this$0>
		//    7   17:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
		//    8   20:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
		//    9   21:new             #108 <Class StringBuilder>
		//   10   24:dup             
		//   11   25:invokespecial   #109 <Method void StringBuilder()>
		//   12   28:astore_3        
				stringbuilder.append("Tubesock: ");
		//   13   29:aload_3         
		//   14   30:ldc1            #111 <String "Tubesock: ">
		//   15   32:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   16   35:pop             
				stringbuilder.append(s);
		//   17   36:aload_3         
		//   18   37:aload_1         
		//   19   38:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   20   41:pop             
				logwrapper.debug(stringbuilder.toString());
		//   21   42:aload_2         
		//   22   43:aload_3         
		//   23   44:invokevirtual   #119 <Method String StringBuilder.toString()>
		//   24   47:invokevirtual   #121 <Method void LogWrapper.debug(String)>
			}
		//   25   50:return          
		}

		public void onMessage(WebSocketMessage websocketmessage)
		{
			websocketmessage = ((WebSocketMessage) (websocketmessage.getText()));
		//    0    0:aload_1         
		//    1    1:invokevirtual   #128 <Method String WebSocketMessage.getText()>
		//    2    4:astore_1        
			if(logger.logsDebug())
		//*   3    5:aload_0         
		//*   4    6:getfield        #27  <Field WebsocketConnection this$0>
		//*   5    9:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
		//*   6   12:invokevirtual   #72  <Method boolean LogWrapper.logsDebug()>
		//*   7   15:ifeq            55
			{
				LogWrapper logwrapper = logger;
		//    8   18:aload_0         
		//    9   19:getfield        #27  <Field WebsocketConnection this$0>
		//   10   22:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
		//   11   25:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
		//   12   26:new             #108 <Class StringBuilder>
		//   13   29:dup             
		//   14   30:invokespecial   #109 <Method void StringBuilder()>
		//   15   33:astore_3        
				stringbuilder.append("ws message: ");
		//   16   34:aload_3         
		//   17   35:ldc1            #130 <String "ws message: ">
		//   18   37:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   19   40:pop             
				stringbuilder.append(((String) (websocketmessage)));
		//   20   41:aload_3         
		//   21   42:aload_1         
		//   22   43:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
		//   23   46:pop             
				logwrapper.debug(stringbuilder.toString());
		//   24   47:aload_2         
		//   25   48:aload_3         
		//   26   49:invokevirtual   #119 <Method String StringBuilder.toString()>
		//   27   52:invokevirtual   #121 <Method void LogWrapper.debug(String)>
			}
			ctx.getRunLoop().scheduleNow(((_cls2) (websocketmessage)). new Runnable() {

				public void run()
				{
					handleIncomingFrame(str);
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				//    2    4:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//    3    7:aload_0         
				//    4    8:getfield        #24  <Field String val$str>
				//    5   11:invokestatic    #37  <Method void WebsocketConnection.access$500(WebsocketConnection, String)>
				//    6   14:return          
				}

				final WSClientTubesock this$1;
				final String val$str;

			
			{
				this$1 = final_wsclienttubesock;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				str = String.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #24  <Field String val$str>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #27  <Method void Object()>
			//    8   14:return          
			}
			}
);
		//   28   55:aload_0         
		//   29   56:getfield        #27  <Field WebsocketConnection this$0>
		//   30   59:invokestatic    #84  <Method Context WebsocketConnection.access$400(WebsocketConnection)>
		//   31   62:invokevirtual   #90  <Method RunLoop Context.getRunLoop()>
		//   32   65:new             #15  <Class WebsocketConnection$WSClientTubesock$2>
		//   33   68:dup             
		//   34   69:aload_0         
		//   35   70:aload_1         
		//   36   71:invokespecial   #133 <Method void WebsocketConnection$WSClientTubesock$2(WebsocketConnection$WSClientTubesock, String)>
		//   37   74:invokeinterface #99  <Method void RunLoop.scheduleNow(Runnable)>
		//   38   79:return          
		}

		public void onOpen()
		{
			ctx.getRunLoop().scheduleNow(new Runnable() {

				public void run()
				{
					connectTimeout.cancel(false);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				//    2    4:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//    3    7:invokestatic    #32  <Method ScheduledFuture WebsocketConnection.access$000(WebsocketConnection)>
				//    4   10:iconst_0        
				//    5   11:invokeinterface #38  <Method boolean ScheduledFuture.cancel(boolean)>
				//    6   16:pop             
					everConnected = true;
				//    7   17:aload_0         
				//    8   18:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				//    9   21:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//   10   24:iconst_1        
				//   11   25:invokestatic    #42  <Method boolean WebsocketConnection.access$102(WebsocketConnection, boolean)>
				//   12   28:pop             
					if(logger.logsDebug())
				//*  13   29:aload_0         
				//*  14   30:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				//*  15   33:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//*  16   36:invokestatic    #46  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//*  17   39:invokevirtual   #52  <Method boolean LogWrapper.logsDebug()>
				//*  18   42:ifeq            60
						logger.debug("websocket opened");
				//   19   45:aload_0         
				//   20   46:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				//   21   49:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//   22   52:invokestatic    #46  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
				//   23   55:ldc1            #54  <String "websocket opened">
				//   24   57:invokevirtual   #58  <Method void LogWrapper.debug(String)>
					resetKeepAlive();
				//   25   60:aload_0         
				//   26   61:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				//   27   64:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
				//   28   67:invokestatic    #62  <Method void WebsocketConnection.access$300(WebsocketConnection)>
				//   29   70:return          
				}

				final WSClientTubesock this$1;

			
			{
				this$1 = WSClientTubesock.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #22  <Method void Object()>
			//    5    9:return          
			}
			}
);
		//    0    0:aload_0         
		//    1    1:getfield        #27  <Field WebsocketConnection this$0>
		//    2    4:invokestatic    #84  <Method Context WebsocketConnection.access$400(WebsocketConnection)>
		//    3    7:invokevirtual   #90  <Method RunLoop Context.getRunLoop()>
		//    4   10:new             #13  <Class WebsocketConnection$WSClientTubesock$1>
		//    5   13:dup             
		//    6   14:aload_0         
		//    7   15:invokespecial   #135 <Method void WebsocketConnection$WSClientTubesock$1(WebsocketConnection$WSClientTubesock)>
		//    8   18:invokeinterface #99  <Method void RunLoop.scheduleNow(Runnable)>
		//    9   23:return          
		}

		public void send(String s)
		{
			ws.send(s);
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field WebSocket ws>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #138 <Method void WebSocket.send(String)>
		//    4    8:return          
		}

		final WebsocketConnection this$0;
		private WebSocket ws;

		private WSClientTubesock(WebSocket websocket)
		{
			this$0 = WebsocketConnection.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #27  <Field WebsocketConnection this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #30  <Method void Object()>
			ws = websocket;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #32  <Field WebSocket ws>
			ws.setEventHandler(((WebSocketEventHandler) (this)));
		//    8   14:aload_0         
		//    9   15:getfield        #32  <Field WebSocket ws>
		//   10   18:aload_0         
		//   11   19:invokevirtual   #38  <Method void WebSocket.setEventHandler(WebSocketEventHandler)>
		//   12   22:return          
		}

	}


	public WebsocketConnection(Context context, RepoInfo repoinfo, Delegate delegate1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void Object()>
		everConnected = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #66  <Field boolean everConnected>
		isClosed = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #68  <Field boolean isClosed>
		totalFrames = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #70  <Field long totalFrames>
		long l = connectionId;
	//   11   19:getstatic       #72  <Field long connectionId>
	//   12   22:lstore          5
		connectionId = 1L + l;
	//   13   24:lconst_1        
	//   14   25:lload           5
	//   15   27:ladd            
	//   16   28:putstatic       #72  <Field long connectionId>
		mapper = JsonHelpers.getMapper();
	//   17   31:aload_0         
	//   18   32:invokestatic    #78  <Method ObjectMapper JsonHelpers.getMapper()>
	//   19   35:putfield        #80  <Field ObjectMapper mapper>
		mapType = mapper.getTypeFactory().constructMapType(java/util/HashMap, java/lang/String, java/lang/Object);
	//   20   38:aload_0         
	//   21   39:aload_0         
	//   22   40:getfield        #80  <Field ObjectMapper mapper>
	//   23   43:invokevirtual   #86  <Method TypeFactory ObjectMapper.getTypeFactory()>
	//   24   46:ldc1            #88  <Class HashMap>
	//   25   48:ldc1            #90  <Class String>
	//   26   50:ldc1            #4   <Class Object>
	//   27   52:invokevirtual   #96  <Method MapType TypeFactory.constructMapType(Class, Class, Class)>
	//   28   55:putfield        #98  <Field MapType mapType>
		_flddelegate = delegate1;
	//   29   58:aload_0         
	//   30   59:aload_3         
	//   31   60:putfield        #100 <Field WebsocketConnection$Delegate _flddelegate>
		ctx = context;
	//   32   63:aload_0         
	//   33   64:aload_1         
	//   34   65:putfield        #102 <Field Context ctx>
		delegate1 = ((Delegate) (new StringBuilder()));
	//   35   68:new             #104 <Class StringBuilder>
	//   36   71:dup             
	//   37   72:invokespecial   #105 <Method void StringBuilder()>
	//   38   75:astore_3        
		((StringBuilder) (delegate1)).append("ws_");
	//   39   76:aload_3         
	//   40   77:ldc1            #107 <String "ws_">
	//   41   79:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   42   82:pop             
		((StringBuilder) (delegate1)).append(l);
	//   43   83:aload_3         
	//   44   84:lload           5
	//   45   86:invokevirtual   #114 <Method StringBuilder StringBuilder.append(long)>
	//   46   89:pop             
		logger = context.getLogger("WebSocket", ((StringBuilder) (delegate1)).toString());
	//   47   90:aload_0         
	//   48   91:aload_1         
	//   49   92:ldc1            #116 <String "WebSocket">
	//   50   94:aload_3         
	//   51   95:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   52   98:invokevirtual   #126 <Method LogWrapper Context.getLogger(String, String)>
	//   53  101:putfield        #128 <Field LogWrapper logger>
		conn = createConnection(repoinfo, s);
	//   54  104:aload_0         
	//   55  105:aload_0         
	//   56  106:aload_2         
	//   57  107:aload           4
	//   58  109:invokespecial   #132 <Method WebsocketConnection$WSClient createConnection(RepoInfo, String)>
	//   59  112:putfield        #134 <Field WebsocketConnection$WSClient conn>
	//   60  115:return          
	}

	private void appendFrame(String s)
	{
		frameReader.addString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field StringListReader frameReader>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #177 <Method void StringListReader.addString(String)>
		totalFrames = totalFrames - 1L;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #70  <Field long totalFrames>
	//    7   13:lconst_1        
	//    8   14:lsub            
	//    9   15:putfield        #70  <Field long totalFrames>
		if(totalFrames == 0L)
	//*  10   18:aload_0         
	//*  11   19:getfield        #70  <Field long totalFrames>
	//*  12   22:lconst_0        
	//*  13   23:lcmp            
	//*  14   24:ifne            214
		{
			LogWrapper logwrapper2;
			try
			{
				frameReader.freeze();
	//   15   27:aload_0         
	//   16   28:getfield        #172 <Field StringListReader frameReader>
	//   17   31:invokevirtual   #180 <Method void StringListReader.freeze()>
				s = ((String) ((Map)mapper.readValue(((java.io.Reader) (frameReader)), ((com.fasterxml.jackson.databind.JavaType) (mapType)))));
	//   18   34:aload_0         
	//   19   35:getfield        #80  <Field ObjectMapper mapper>
	//   20   38:aload_0         
	//   21   39:getfield        #172 <Field StringListReader frameReader>
	//   22   42:aload_0         
	//   23   43:getfield        #98  <Field MapType mapType>
	//   24   46:invokevirtual   #184 <Method Object ObjectMapper.readValue(java.io.Reader, com.fasterxml.jackson.databind.JavaType)>
	//   25   49:checkcast       #186 <Class Map>
	//   26   52:astore_1        
				frameReader = null;
	//   27   53:aload_0         
	//   28   54:aconst_null     
	//   29   55:putfield        #172 <Field StringListReader frameReader>
				if(logger.logsDebug())
	//*  30   58:aload_0         
	//*  31   59:getfield        #128 <Field LogWrapper logger>
	//*  32   62:invokevirtual   #192 <Method boolean LogWrapper.logsDebug()>
	//*  33   65:ifeq            102
				{
					LogWrapper logwrapper = logger;
	//   34   68:aload_0         
	//   35   69:getfield        #128 <Field LogWrapper logger>
	//   36   72:astore_2        
					StringBuilder stringbuilder = new StringBuilder();
	//   37   73:new             #104 <Class StringBuilder>
	//   38   76:dup             
	//   39   77:invokespecial   #105 <Method void StringBuilder()>
	//   40   80:astore_3        
					stringbuilder.append("handleIncomingFrame complete frame: ");
	//   41   81:aload_3         
	//   42   82:ldc1            #194 <String "handleIncomingFrame complete frame: ">
	//   43   84:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   44   87:pop             
					stringbuilder.append(((Object) (s)));
	//   45   88:aload_3         
	//   46   89:aload_1         
	//   47   90:invokevirtual   #197 <Method StringBuilder StringBuilder.append(Object)>
	//   48   93:pop             
					logwrapper.debug(stringbuilder.toString());
	//   49   94:aload_2         
	//   50   95:aload_3         
	//   51   96:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   52   99:invokevirtual   #200 <Method void LogWrapper.debug(String)>
				}
				_flddelegate.onMessage(((Map) (s)));
	//   53  102:aload_0         
	//   54  103:getfield        #100 <Field WebsocketConnection$Delegate _flddelegate>
	//   55  106:aload_1         
	//   56  107:invokeinterface #204 <Method void WebsocketConnection$Delegate.onMessage(Map)>
				return;
	//   57  112:return          
			}
	//*  58  113:astore_1        
	//*  59  114:aload_0         
	//*  60  115:getfield        #128 <Field LogWrapper logger>
	//*  61  118:astore_2        
	//*  62  119:new             #104 <Class StringBuilder>
	//*  63  122:dup             
	//*  64  123:invokespecial   #105 <Method void StringBuilder()>
	//*  65  126:astore_3        
	//*  66  127:aload_3         
	//*  67  128:ldc1            #206 <String "Error parsing frame (cast error): ">
	//*  68  130:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//*  69  133:pop             
	//*  70  134:aload_3         
	//*  71  135:aload_0         
	//*  72  136:getfield        #172 <Field StringListReader frameReader>
	//*  73  139:invokevirtual   #207 <Method String StringListReader.toString()>
	//*  74  142:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//*  75  145:pop             
	//*  76  146:aload_2         
	//*  77  147:aload_3         
	//*  78  148:invokevirtual   #120 <Method String StringBuilder.toString()>
	//*  79  151:aload_1         
	//*  80  152:invokevirtual   #211 <Method void LogWrapper.error(String, Throwable)>
	//*  81  155:aload_0         
	//*  82  156:invokevirtual   #214 <Method void close()>
	//*  83  159:aload_0         
	//*  84  160:invokespecial   #217 <Method void shutdown()>
	//*  85  163:return          
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  86  164:astore_1        
			{
				logwrapper2 = logger;
	//   87  165:aload_0         
	//   88  166:getfield        #128 <Field LogWrapper logger>
	//   89  169:astore_2        
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				LogWrapper logwrapper1 = logger;
				StringBuilder stringbuilder1 = new StringBuilder();
				stringbuilder1.append("Error parsing frame (cast error): ");
				stringbuilder1.append(frameReader.toString());
				logwrapper1.error(stringbuilder1.toString(), ((Throwable) (s)));
				close();
				shutdown();
				return;
			}
			StringBuilder stringbuilder2 = new StringBuilder();
	//   90  170:new             #104 <Class StringBuilder>
	//   91  173:dup             
	//   92  174:invokespecial   #105 <Method void StringBuilder()>
	//   93  177:astore_3        
			stringbuilder2.append("Error parsing frame: ");
	//   94  178:aload_3         
	//   95  179:ldc1            #219 <String "Error parsing frame: ">
	//   96  181:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   97  184:pop             
			stringbuilder2.append(frameReader.toString());
	//   98  185:aload_3         
	//   99  186:aload_0         
	//  100  187:getfield        #172 <Field StringListReader frameReader>
	//  101  190:invokevirtual   #207 <Method String StringListReader.toString()>
	//  102  193:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//  103  196:pop             
			logwrapper2.error(stringbuilder2.toString(), ((Throwable) (s)));
	//  104  197:aload_2         
	//  105  198:aload_3         
	//  106  199:invokevirtual   #120 <Method String StringBuilder.toString()>
	//  107  202:aload_1         
	//  108  203:invokevirtual   #211 <Method void LogWrapper.error(String, Throwable)>
			close();
	//  109  206:aload_0         
	//  110  207:invokevirtual   #214 <Method void close()>
			shutdown();
	//  111  210:aload_0         
	//  112  211:invokespecial   #217 <Method void shutdown()>
		}
	//  113  214:return          
	}

	private void closeIfNeverConnected()
	{
		if(!everConnected && !isClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field boolean everConnected>
	//*   2    4:ifne            42
	//*   3    7:aload_0         
	//*   4    8:getfield        #68  <Field boolean isClosed>
	//*   5   11:ifne            42
		{
			if(logger.logsDebug())
	//*   6   14:aload_0         
	//*   7   15:getfield        #128 <Field LogWrapper logger>
	//*   8   18:invokevirtual   #192 <Method boolean LogWrapper.logsDebug()>
	//*   9   21:ifeq            33
				logger.debug("timed out on connect");
	//   10   24:aload_0         
	//   11   25:getfield        #128 <Field LogWrapper logger>
	//   12   28:ldc1            #221 <String "timed out on connect">
	//   13   30:invokevirtual   #200 <Method void LogWrapper.debug(String)>
			conn.close();
	//   14   33:aload_0         
	//   15   34:getfield        #134 <Field WebsocketConnection$WSClient conn>
	//   16   37:invokeinterface #222 <Method void WebsocketConnection$WSClient.close()>
		}
	//   17   42:return          
	}

	private WSClient createConnection(RepoInfo repoinfo, String s)
	{
		repoinfo = ((RepoInfo) (repoinfo.getConnectionURL(s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #228 <Method java.net.URI RepoInfo.getConnectionURL(String)>
	//    3    5:astore_1        
		s = ((String) (new HashMap()));
	//    4    6:new             #88  <Class HashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #229 <Method void HashMap()>
	//    7   13:astore_2        
		((Map) (s)).put("User-Agent", ((Object) (ctx.getUserAgent())));
	//    8   14:aload_2         
	//    9   15:ldc1            #231 <String "User-Agent">
	//   10   17:aload_0         
	//   11   18:getfield        #102 <Field Context ctx>
	//   12   21:invokevirtual   #234 <Method String Context.getUserAgent()>
	//   13   24:invokeinterface #238 <Method Object Map.put(Object, Object)>
	//   14   29:pop             
		return ((WSClient) (new WSClientTubesock(new WebSocket(((java.net.URI) (repoinfo)), ((String) (null)), ((Map) (s))))));
	//   15   30:new             #16  <Class WebsocketConnection$WSClientTubesock>
	//   16   33:dup             
	//   17   34:aload_0         
	//   18   35:new             #240 <Class WebSocket>
	//   19   38:dup             
	//   20   39:aload_1         
	//   21   40:aconst_null     
	//   22   41:aload_2         
	//   23   42:invokespecial   #243 <Method void WebSocket(java.net.URI, String, Map)>
	//   24   45:aconst_null     
	//   25   46:invokespecial   #246 <Method void WebsocketConnection$WSClientTubesock(WebsocketConnection, WebSocket, WebsocketConnection$1)>
	//   26   49:areturn         
	}

	private String extractFrameCount(String s)
	{
		if(s.length() > 6)
			break MISSING_BLOCK_LABEL_25;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #254 <Method int String.length()>
	//    2    4:bipush          6
	//    3    6:icmpgt          25
		int i = Integer.parseInt(s);
	//    4    9:aload_1         
	//    5   10:invokestatic    #260 <Method int Integer.parseInt(String)>
	//    6   13:istore_2        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_23;
	//    7   14:iload_2         
	//    8   15:ifle            23
		handleNewFrameCount(i);
	//    9   18:aload_0         
	//   10   19:iload_2         
	//   11   20:invokespecial   #264 <Method void handleNewFrameCount(int)>
		return null;
	//   12   23:aconst_null     
	//   13   24:areturn         
_L2:
		handleNewFrameCount(1);
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:invokespecial   #264 <Method void handleNewFrameCount(int)>
		return s;
	//   17   30:aload_1         
	//   18   31:areturn         
		NumberFormatException numberformatexception;
		numberformatexception;
	//   19   32:astore_3        
		if(true) goto _L2; else goto _L1
_L1:
	//*  20   33:goto            25
	}

	private void handleIncomingFrame(String s)
	{
		if(!isClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean isClosed>
	//*   2    4:ifne            39
		{
			resetKeepAlive();
	//    3    7:aload_0         
	//    4    8:invokespecial   #147 <Method void resetKeepAlive()>
			if(isBuffering())
	//*   5   11:aload_0         
	//*   6   12:invokespecial   #267 <Method boolean isBuffering()>
	//*   7   15:ifeq            24
			{
				appendFrame(s);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokespecial   #269 <Method void appendFrame(String)>
				return;
	//   11   23:return          
			}
			s = extractFrameCount(s);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #271 <Method String extractFrameCount(String)>
	//   15   29:astore_1        
			if(s != null)
	//*  16   30:aload_1         
	//*  17   31:ifnull          39
				appendFrame(s);
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:invokespecial   #269 <Method void appendFrame(String)>
		}
	//   21   39:return          
	}

	private void handleNewFrameCount(int i)
	{
		totalFrames = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:i2l             
	//    3    3:putfield        #70  <Field long totalFrames>
		frameReader = new StringListReader();
	//    4    6:aload_0         
	//    5    7:new             #174 <Class StringListReader>
	//    6   10:dup             
	//    7   11:invokespecial   #272 <Method void StringListReader()>
	//    8   14:putfield        #172 <Field StringListReader frameReader>
		if(logger.logsDebug())
	//*   9   17:aload_0         
	//*  10   18:getfield        #128 <Field LogWrapper logger>
	//*  11   21:invokevirtual   #192 <Method boolean LogWrapper.logsDebug()>
	//*  12   24:ifeq            65
		{
			LogWrapper logwrapper = logger;
	//   13   27:aload_0         
	//   14   28:getfield        #128 <Field LogWrapper logger>
	//   15   31:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//   16   32:new             #104 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #105 <Method void StringBuilder()>
	//   19   39:astore_3        
			stringbuilder.append("HandleNewFrameCount: ");
	//   20   40:aload_3         
	//   21   41:ldc2            #274 <String "HandleNewFrameCount: ">
	//   22   44:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
			stringbuilder.append(totalFrames);
	//   24   48:aload_3         
	//   25   49:aload_0         
	//   26   50:getfield        #70  <Field long totalFrames>
	//   27   53:invokevirtual   #114 <Method StringBuilder StringBuilder.append(long)>
	//   28   56:pop             
			logwrapper.debug(stringbuilder.toString());
	//   29   57:aload_2         
	//   30   58:aload_3         
	//   31   59:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   32   62:invokevirtual   #200 <Method void LogWrapper.debug(String)>
		}
	//   33   65:return          
	}

	private boolean isBuffering()
	{
		return frameReader != null;
	//    0    0:aload_0         
	//    1    1:getfield        #172 <Field StringListReader frameReader>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private Runnable nop()
	{
		return new Runnable() {

			public void run()
			{
				if(conn != null)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field WebsocketConnection this$0>
			//*   2    4:invokestatic    #26  <Method WebsocketConnection$WSClient WebsocketConnection.access$900(WebsocketConnection)>
			//*   3    7:ifnull          31
				{
					conn.send("0");
			//    4   10:aload_0         
			//    5   11:getfield        #17  <Field WebsocketConnection this$0>
			//    6   14:invokestatic    #26  <Method WebsocketConnection$WSClient WebsocketConnection.access$900(WebsocketConnection)>
			//    7   17:ldc1            #28  <String "0">
			//    8   19:invokeinterface #34  <Method void WebsocketConnection$WSClient.send(String)>
					resetKeepAlive();
			//    9   24:aload_0         
			//   10   25:getfield        #17  <Field WebsocketConnection this$0>
			//   11   28:invokestatic    #37  <Method void WebsocketConnection.access$300(WebsocketConnection)>
				}
			//   12   31:return          
			}

			final WebsocketConnection this$0;

			
			{
				this$0 = WebsocketConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebsocketConnection this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class WebsocketConnection$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #278 <Method void WebsocketConnection$2(WebsocketConnection)>
	//    4    8:areturn         
	}

	private void onClosed()
	{
		if(!isClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean isClosed>
	//*   2    4:ifne            31
		{
			if(logger.logsDebug())
	//*   3    7:aload_0         
	//*   4    8:getfield        #128 <Field LogWrapper logger>
	//*   5   11:invokevirtual   #192 <Method boolean LogWrapper.logsDebug()>
	//*   6   14:ifeq            27
				logger.debug("closing itself");
	//    7   17:aload_0         
	//    8   18:getfield        #128 <Field LogWrapper logger>
	//    9   21:ldc2            #280 <String "closing itself">
	//   10   24:invokevirtual   #200 <Method void LogWrapper.debug(String)>
			shutdown();
	//   11   27:aload_0         
	//   12   28:invokespecial   #217 <Method void shutdown()>
		}
		conn = null;
	//   13   31:aload_0         
	//   14   32:aconst_null     
	//   15   33:putfield        #134 <Field WebsocketConnection$WSClient conn>
		ScheduledFuture scheduledfuture = keepAlive;
	//   16   36:aload_0         
	//   17   37:getfield        #282 <Field ScheduledFuture keepAlive>
	//   18   40:astore_1        
		if(scheduledfuture != null)
	//*  19   41:aload_1         
	//*  20   42:ifnull          53
			scheduledfuture.cancel(false);
	//   21   45:aload_1         
	//   22   46:iconst_0        
	//   23   47:invokeinterface #288 <Method boolean ScheduledFuture.cancel(boolean)>
	//   24   52:pop             
	//   25   53:return          
	}

	private void resetKeepAlive()
	{
		if(!isClosed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field boolean isClosed>
	//*   2    4:ifne            126
		{
			ScheduledFuture scheduledfuture = keepAlive;
	//    3    7:aload_0         
	//    4    8:getfield        #282 <Field ScheduledFuture keepAlive>
	//    5   11:astore_1        
			if(scheduledfuture != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          83
			{
				scheduledfuture.cancel(false);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokeinterface #288 <Method boolean ScheduledFuture.cancel(boolean)>
	//   11   23:pop             
				if(logger.logsDebug())
	//*  12   24:aload_0         
	//*  13   25:getfield        #128 <Field LogWrapper logger>
	//*  14   28:invokevirtual   #192 <Method boolean LogWrapper.logsDebug()>
	//*  15   31:ifeq            103
				{
					LogWrapper logwrapper = logger;
	//   16   34:aload_0         
	//   17   35:getfield        #128 <Field LogWrapper logger>
	//   18   38:astore_1        
					StringBuilder stringbuilder = new StringBuilder();
	//   19   39:new             #104 <Class StringBuilder>
	//   20   42:dup             
	//   21   43:invokespecial   #105 <Method void StringBuilder()>
	//   22   46:astore_2        
					stringbuilder.append("Reset keepAlive. Remaining: ");
	//   23   47:aload_2         
	//   24   48:ldc2            #290 <String "Reset keepAlive. Remaining: ">
	//   25   51:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
					stringbuilder.append(keepAlive.getDelay(TimeUnit.MILLISECONDS));
	//   27   55:aload_2         
	//   28   56:aload_0         
	//   29   57:getfield        #282 <Field ScheduledFuture keepAlive>
	//   30   60:getstatic       #296 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   31   63:invokeinterface #300 <Method long ScheduledFuture.getDelay(TimeUnit)>
	//   32   68:invokevirtual   #114 <Method StringBuilder StringBuilder.append(long)>
	//   33   71:pop             
					logwrapper.debug(stringbuilder.toString());
	//   34   72:aload_1         
	//   35   73:aload_2         
	//   36   74:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   37   77:invokevirtual   #200 <Method void LogWrapper.debug(String)>
				}
			} else
	//*  38   80:goto            103
			if(logger.logsDebug())
	//*  39   83:aload_0         
	//*  40   84:getfield        #128 <Field LogWrapper logger>
	//*  41   87:invokevirtual   #192 <Method boolean LogWrapper.logsDebug()>
	//*  42   90:ifeq            103
				logger.debug("Reset keepAlive");
	//   43   93:aload_0         
	//   44   94:getfield        #128 <Field LogWrapper logger>
	//   45   97:ldc2            #302 <String "Reset keepAlive">
	//   46  100:invokevirtual   #200 <Method void LogWrapper.debug(String)>
			keepAlive = ctx.getRunLoop().schedule(nop(), 45000L);
	//   47  103:aload_0         
	//   48  104:aload_0         
	//   49  105:getfield        #102 <Field Context ctx>
	//   50  108:invokevirtual   #306 <Method RunLoop Context.getRunLoop()>
	//   51  111:aload_0         
	//   52  112:invokespecial   #308 <Method Runnable nop()>
	//   53  115:ldc2w           #31  <Long 45000L>
	//   54  118:invokeinterface #314 <Method ScheduledFuture RunLoop.schedule(Runnable, long)>
	//   55  123:putfield        #282 <Field ScheduledFuture keepAlive>
		}
	//   56  126:return          
	}

	private void shutdown()
	{
		isClosed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #68  <Field boolean isClosed>
		_flddelegate.onDisconnect(everConnected);
	//    3    5:aload_0         
	//    4    6:getfield        #100 <Field WebsocketConnection$Delegate _flddelegate>
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field boolean everConnected>
	//    7   13:invokeinterface #318 <Method void WebsocketConnection$Delegate.onDisconnect(boolean)>
	//    8   18:return          
	}

	public void close()
	{
		if(logger.logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field LogWrapper logger>
	//*   2    4:invokevirtual   #192 <Method boolean LogWrapper.logsDebug()>
	//*   3    7:ifeq            20
			logger.debug("websocket is being closed");
	//    4   10:aload_0         
	//    5   11:getfield        #128 <Field LogWrapper logger>
	//    6   14:ldc2            #320 <String "websocket is being closed">
	//    7   17:invokevirtual   #200 <Method void LogWrapper.debug(String)>
		isClosed = true;
	//    8   20:aload_0         
	//    9   21:iconst_1        
	//   10   22:putfield        #68  <Field boolean isClosed>
		conn.close();
	//   11   25:aload_0         
	//   12   26:getfield        #134 <Field WebsocketConnection$WSClient conn>
	//   13   29:invokeinterface #222 <Method void WebsocketConnection$WSClient.close()>
		ScheduledFuture scheduledfuture = connectTimeout;
	//   14   34:aload_0         
	//   15   35:getfield        #138 <Field ScheduledFuture connectTimeout>
	//   16   38:astore_1        
		if(scheduledfuture != null)
	//*  17   39:aload_1         
	//*  18   40:ifnull          51
			scheduledfuture.cancel(true);
	//   19   43:aload_1         
	//   20   44:iconst_1        
	//   21   45:invokeinterface #288 <Method boolean ScheduledFuture.cancel(boolean)>
	//   22   50:pop             
		scheduledfuture = keepAlive;
	//   23   51:aload_0         
	//   24   52:getfield        #282 <Field ScheduledFuture keepAlive>
	//   25   55:astore_1        
		if(scheduledfuture != null)
	//*  26   56:aload_1         
	//*  27   57:ifnull          68
			scheduledfuture.cancel(true);
	//   28   60:aload_1         
	//   29   61:iconst_1        
	//   30   62:invokeinterface #288 <Method boolean ScheduledFuture.cancel(boolean)>
	//   31   67:pop             
	//   32   68:return          
	}

	public void open()
	{
		conn.connect();
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field WebsocketConnection$WSClient conn>
	//    2    4:invokeinterface #324 <Method void WebsocketConnection$WSClient.connect()>
		connectTimeout = ctx.getRunLoop().schedule(new Runnable() {

			public void run()
			{
				closeIfNeverConnected();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field WebsocketConnection this$0>
			//    2    4:invokestatic    #24  <Method void WebsocketConnection.access$800(WebsocketConnection)>
			//    3    7:return          
			}

			final WebsocketConnection this$0;

			
			{
				this$0 = WebsocketConnection.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebsocketConnection this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
, 30000L);
	//    3    9:aload_0         
	//    4   10:aload_0         
	//    5   11:getfield        #102 <Field Context ctx>
	//    6   14:invokevirtual   #306 <Method RunLoop Context.getRunLoop()>
	//    7   17:new             #6   <Class WebsocketConnection$1>
	//    8   20:dup             
	//    9   21:aload_0         
	//   10   22:invokespecial   #325 <Method void WebsocketConnection$1(WebsocketConnection)>
	//   11   25:ldc2w           #28  <Long 30000L>
	//   12   28:invokeinterface #314 <Method ScheduledFuture RunLoop.schedule(Runnable, long)>
	//   13   33:putfield        #138 <Field ScheduledFuture connectTimeout>
	//   14   36:return          
	}

	public void send(Map map)
	{
		resetKeepAlive();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void resetKeepAlive()>
		String as[];
		as = Utilities.splitIntoFrames(mapper.writeValueAsString(((Object) (map))), 16384);
	//    2    4:aload_0         
	//    3    5:getfield        #80  <Field ObjectMapper mapper>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #330 <Method String ObjectMapper.writeValueAsString(Object)>
	//    6   12:sipush          16384
	//    7   15:invokestatic    #336 <Method String[] Utilities.splitIntoFrames(String, int)>
	//    8   18:astore_3        
		if(as.length > 1)
	//*   9   19:aload_3         
	//*  10   20:arraylength     
	//*  11   21:iconst_1        
	//*  12   22:icmple          148
		{
			WSClient wsclient = conn;
	//   13   25:aload_0         
	//   14   26:getfield        #134 <Field WebsocketConnection$WSClient conn>
	//   15   29:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   16   31:new             #104 <Class StringBuilder>
	//   17   34:dup             
	//   18   35:invokespecial   #105 <Method void StringBuilder()>
	//   19   38:astore          5
			stringbuilder.append("");
	//   20   40:aload           5
	//   21   42:ldc2            #338 <String "">
	//   22   45:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			stringbuilder.append(as.length);
	//   24   49:aload           5
	//   25   51:aload_3         
	//   26   52:arraylength     
	//   27   53:invokevirtual   #341 <Method StringBuilder StringBuilder.append(int)>
	//   28   56:pop             
			wsclient.send(stringbuilder.toString());
	//   29   57:aload           4
	//   30   59:aload           5
	//   31   61:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   32   64:invokeinterface #343 <Method void WebsocketConnection$WSClient.send(String)>
		}
		  goto _L1
	//*  33   69:goto            148
_L3:
		int i;
		if(i >= as.length)
			break MISSING_BLOCK_LABEL_147;
	//   34   72:iload_2         
	//   35   73:aload_3         
	//   36   74:arraylength     
	//   37   75:icmpge          147
		conn.send(as[i]);
	//   38   78:aload_0         
	//   39   79:getfield        #134 <Field WebsocketConnection$WSClient conn>
	//   40   82:aload_3         
	//   41   83:iload_2         
	//   42   84:aaload          
	//   43   85:invokeinterface #343 <Method void WebsocketConnection$WSClient.send(String)>
		i++;
	//   44   90:iload_2         
	//   45   91:iconst_1        
	//   46   92:iadd            
	//   47   93:istore_2        
		continue; /* Loop/switch isn't completed */
	//   48   94:goto            72
		IOException ioexception;
		ioexception;
	//   49   97:astore_3        
		LogWrapper logwrapper = logger;
	//   50   98:aload_0         
	//   51   99:getfield        #128 <Field LogWrapper logger>
	//   52  102:astore          4
		StringBuilder stringbuilder1 = new StringBuilder();
	//   53  104:new             #104 <Class StringBuilder>
	//   54  107:dup             
	//   55  108:invokespecial   #105 <Method void StringBuilder()>
	//   56  111:astore          5
		stringbuilder1.append("Failed to serialize message: ");
	//   57  113:aload           5
	//   58  115:ldc2            #345 <String "Failed to serialize message: ">
	//   59  118:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   60  121:pop             
		stringbuilder1.append(((Object) (map)).toString());
	//   61  122:aload           5
	//   62  124:aload_1         
	//   63  125:invokevirtual   #346 <Method String Object.toString()>
	//   64  128:invokevirtual   #111 <Method StringBuilder StringBuilder.append(String)>
	//   65  131:pop             
		logwrapper.error(stringbuilder1.toString(), ((Throwable) (ioexception)));
	//   66  132:aload           4
	//   67  134:aload           5
	//   68  136:invokevirtual   #120 <Method String StringBuilder.toString()>
	//   69  139:aload_3         
	//   70  140:invokevirtual   #211 <Method void LogWrapper.error(String, Throwable)>
		shutdown();
	//   71  143:aload_0         
	//   72  144:invokespecial   #217 <Method void shutdown()>
		return;
	//   73  147:return          
_L1:
		i = 0;
	//   74  148:iconst_0        
	//   75  149:istore_2        
		if(true) goto _L3; else goto _L2
	//   76  150:goto            72
_L2:
	}

	public void start()
	{
	//    0    0:return          
	}

	private static final long CONNECT_TIMEOUT = 30000L;
	private static final long KEEP_ALIVE = 45000L;
	private static final int MAX_FRAME_SIZE = 16384;
	private static long connectionId;
	private WSClient conn;
	private ScheduledFuture connectTimeout;
	private Context ctx;
	private Delegate _flddelegate;
	private boolean everConnected;
	private StringListReader frameReader;
	private boolean isClosed;
	private ScheduledFuture keepAlive;
	private LogWrapper logger;
	private MapType mapType;
	private ObjectMapper mapper;
	private long totalFrames;

	static 
	{
	//    0    0:return          
	}


/*
	static ScheduledFuture access$000(WebsocketConnection websocketconnection)
	{
		return websocketconnection.connectTimeout;
	//    0    0:aload_0         
	//    1    1:getfield        #138 <Field ScheduledFuture connectTimeout>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$102(WebsocketConnection websocketconnection, boolean flag)
	{
		websocketconnection.everConnected = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #66  <Field boolean everConnected>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/


/*
	static LogWrapper access$200(WebsocketConnection websocketconnection)
	{
		return websocketconnection.logger;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field LogWrapper logger>
	//    2    4:areturn         
	}

*/


/*
	static void access$300(WebsocketConnection websocketconnection)
	{
		websocketconnection.resetKeepAlive();
	//    0    0:aload_0         
	//    1    1:invokespecial   #147 <Method void resetKeepAlive()>
		return;
	//    2    4:return          
	}

*/


/*
	static Context access$400(WebsocketConnection websocketconnection)
	{
		return websocketconnection.ctx;
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field Context ctx>
	//    2    4:areturn         
	}

*/


/*
	static void access$500(WebsocketConnection websocketconnection, String s)
	{
		websocketconnection.handleIncomingFrame(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #155 <Method void handleIncomingFrame(String)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$600(WebsocketConnection websocketconnection)
	{
		websocketconnection.onClosed();
	//    0    0:aload_0         
	//    1    1:invokespecial   #159 <Method void onClosed()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$800(WebsocketConnection websocketconnection)
	{
		websocketconnection.closeIfNeverConnected();
	//    0    0:aload_0         
	//    1    1:invokespecial   #163 <Method void closeIfNeverConnected()>
		return;
	//    2    4:return          
	}

*/


/*
	static WSClient access$900(WebsocketConnection websocketconnection)
	{
		return websocketconnection.conn;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field WebsocketConnection$WSClient conn>
	//    2    4:areturn         
	}

*/
}
