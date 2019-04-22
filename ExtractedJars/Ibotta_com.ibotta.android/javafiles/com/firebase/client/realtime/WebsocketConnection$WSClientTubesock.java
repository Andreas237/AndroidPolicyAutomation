// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;

import com.firebase.client.RunLoop;
import com.firebase.client.core.Context;
import com.firebase.client.utilities.LogWrapper;
import com.firebase.tubesock.*;
import java.util.concurrent.ScheduledFuture;

// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

private class WebsocketConnection$WSClientTubesock
	implements WebsocketConnection.WSClient, WebSocketEventHandler
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
			WebsocketConnection.access$200(WebsocketConnection.this).error("Interrupted while shutting down websocket threads", ((Throwable) (interruptedexception)));
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
			if(WebsocketConnection.access$200(WebsocketConnection.this).logsDebug())
	//*   5    9:aload_0         
	//*   6   10:getfield        #27  <Field WebsocketConnection this$0>
	//*   7   13:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
	//*   8   16:invokevirtual   #72  <Method boolean LogWrapper.logsDebug()>
	//*   9   19:ifeq            35
				WebsocketConnection.access$200(WebsocketConnection.this).debug("Error connecting", ((Throwable) (websocketexception)));
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
		WebsocketConnection.access$400(WebsocketConnection.this).getRunLoop().scheduleNow(new Runnable() {

			public void run()
			{
				if(WebsocketConnection.access$200(this$0).logsDebug())
			//*   0    0:aload_0         
			//*   1    1:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
			//*   2    4:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//*   3    7:invokestatic    #32  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
			//*   4   10:invokevirtual   #38  <Method boolean LogWrapper.logsDebug()>
			//*   5   13:ifeq            31
					WebsocketConnection.access$200(this$0).debug("closed");
			//    6   16:aload_0         
			//    7   17:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
			//    8   20:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//    9   23:invokestatic    #32  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
			//   10   26:ldc1            #40  <String "closed">
			//   11   28:invokevirtual   #44  <Method void LogWrapper.debug(String)>
				WebsocketConnection.access$600(this$0);
			//   12   31:aload_0         
			//   13   32:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
			//   14   35:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//   15   38:invokestatic    #48  <Method void WebsocketConnection.access$600(WebsocketConnection)>
			//   16   41:return          
			}

			final WebsocketConnection.WSClientTubesock this$1;

			
			{
				this$1 = WebsocketConnection.WSClientTubesock.this;
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

	public void onError(final WebSocketException e)
	{
		WebsocketConnection.access$400(WebsocketConnection.this).getRunLoop().scheduleNow(new Runnable() {

			public void run()
			{
				if(WebsocketConnection.access$200(this$0).logsDebug())
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
			//*   2    4:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//*   3    7:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
			//*   4   10:invokevirtual   #43  <Method boolean LogWrapper.logsDebug()>
			//*   5   13:ifeq            35
					WebsocketConnection.access$200(this$0).debug("had an error", ((Throwable) (e)));
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
					if(WebsocketConnection.access$200(this$0).logsDebug())
			//*  20   50:aload_0         
			//*  21   51:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
			//*  22   54:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//*  23   57:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
			//*  24   60:invokevirtual   #43  <Method boolean LogWrapper.logsDebug()>
			//*  25   63:ifeq            153
						WebsocketConnection.access$200(this$0).debug("If you are running on Android, have you added <uses-permission android:name=\"android.permission.INTERNET\" /> under <manifest> in AndroidManifest.xml?");
			//   26   66:aload_0         
			//   27   67:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
			//   28   70:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//   29   73:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
			//   30   76:ldc1            #65  <String "If you are running on Android, have you added <uses-permission android:name=\"android.permission.INTERNET\" /> under <manifest> in AndroidManifest.xml?">
			//   31   78:invokevirtual   #68  <Method void LogWrapper.debug(String)>
				} else
			//*  32   81:goto            153
				if(WebsocketConnection.access$200(this$0).logsDebug())
			//*  33   84:aload_0         
			//*  34   85:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
			//*  35   88:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//*  36   91:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
			//*  37   94:invokevirtual   #43  <Method boolean LogWrapper.logsDebug()>
			//*  38   97:ifeq            153
				{
					LogWrapper logwrapper = WebsocketConnection.access$200(this$0);
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
				WebsocketConnection.access$600(this$0);
			//   66  153:aload_0         
			//   67  154:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
			//   68  157:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//   69  160:invokestatic    #84  <Method void WebsocketConnection.access$600(WebsocketConnection)>
			//   70  163:return          
			}

			final WebsocketConnection.WSClientTubesock this$1;
			final WebSocketException val$e;

			
			{
				this$1 = WebsocketConnection.WSClientTubesock.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				e = websocketexception;
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
		if(WebsocketConnection.access$200(WebsocketConnection.this).logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field WebsocketConnection this$0>
	//*   2    4:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
	//*   3    7:invokevirtual   #72  <Method boolean LogWrapper.logsDebug()>
	//*   4   10:ifeq            50
		{
			LogWrapper logwrapper = WebsocketConnection.access$200(WebsocketConnection.this);
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

	public void onMessage(final WebSocketMessage str)
	{
		str = ((WebSocketMessage) (str.getText()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #128 <Method String WebSocketMessage.getText()>
	//    2    4:astore_1        
		if(WebsocketConnection.access$200(WebsocketConnection.this).logsDebug())
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field WebsocketConnection this$0>
	//*   5    9:invokestatic    #55  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
	//*   6   12:invokevirtual   #72  <Method boolean LogWrapper.logsDebug()>
	//*   7   15:ifeq            55
		{
			LogWrapper logwrapper = WebsocketConnection.access$200(WebsocketConnection.this);
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
			stringbuilder.append(((String) (str)));
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
		WebsocketConnection.access$400(WebsocketConnection.this).getRunLoop().scheduleNow(new Runnable() {

			public void run()
			{
				WebsocketConnection.access$500(this$0, str);
			//    0    0:aload_0         
			//    1    1:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
			//    2    4:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//    3    7:aload_0         
			//    4    8:getfield        #24  <Field String val$str>
			//    5   11:invokestatic    #37  <Method void WebsocketConnection.access$500(WebsocketConnection, String)>
			//    6   14:return          
			}

			final WebsocketConnection.WSClientTubesock this$1;
			final String val$str;

			
			{
				this$1 = WebsocketConnection.WSClientTubesock.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
				str = s;
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
		WebsocketConnection.access$400(WebsocketConnection.this).getRunLoop().scheduleNow(new Runnable() {

			public void run()
			{
				WebsocketConnection.access$000(this$0).cancel(false);
			//    0    0:aload_0         
			//    1    1:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
			//    2    4:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//    3    7:invokestatic    #32  <Method ScheduledFuture WebsocketConnection.access$000(WebsocketConnection)>
			//    4   10:iconst_0        
			//    5   11:invokeinterface #38  <Method boolean ScheduledFuture.cancel(boolean)>
			//    6   16:pop             
				WebsocketConnection.access$102(this$0, true);
			//    7   17:aload_0         
			//    8   18:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
			//    9   21:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//   10   24:iconst_1        
			//   11   25:invokestatic    #42  <Method boolean WebsocketConnection.access$102(WebsocketConnection, boolean)>
			//   12   28:pop             
				if(WebsocketConnection.access$200(this$0).logsDebug())
			//*  13   29:aload_0         
			//*  14   30:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
			//*  15   33:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//*  16   36:invokestatic    #46  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
			//*  17   39:invokevirtual   #52  <Method boolean LogWrapper.logsDebug()>
			//*  18   42:ifeq            60
					WebsocketConnection.access$200(this$0).debug("websocket opened");
			//   19   45:aload_0         
			//   20   46:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
			//   21   49:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//   22   52:invokestatic    #46  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
			//   23   55:ldc1            #54  <String "websocket opened">
			//   24   57:invokevirtual   #58  <Method void LogWrapper.debug(String)>
				WebsocketConnection.access$300(this$0);
			//   25   60:aload_0         
			//   26   61:getfield        #20  <Field WebsocketConnection$WSClientTubesock this$1>
			//   27   64:getfield        #28  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
			//   28   67:invokestatic    #62  <Method void WebsocketConnection.access$300(WebsocketConnection)>
			//   29   70:return          
			}

			final WebsocketConnection.WSClientTubesock this$1;

			
			{
				this$1 = WebsocketConnection.WSClientTubesock.this;
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

	private WebsocketConnection$WSClientTubesock(WebSocket websocket)
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

	WebsocketConnection$WSClientTubesock(WebSocket websocket, WebsocketConnection._cls1 _pcls1)
	{
		this(websocket);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #42  <Method void WebsocketConnection$WSClientTubesock(WebsocketConnection, WebSocket)>
	//    4    6:return          
	}
}
