// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;

import com.firebase.client.utilities.LogWrapper;
import com.firebase.tubesock.WebSocketException;

// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

class WebsocketConnection$WSClientTubesock$4
	implements Runnable
{

	public void run()
	{
		if(WebsocketConnection.access$200(this$0).logsDebug())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
	//*   2    4:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
	//*   3    7:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
	//*   4   10:invokevirtual   #43  <Method boolean LogWrapper.logsDebug()>
	//*   5   13:ifeq            35
			WebsocketConnection.access$200(this$0).debug("had an error", ((Throwable) (val$e)));
	//    6   16:aload_0         
	//    7   17:getfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
	//    8   20:getfield        #33  <Field WebsocketConnection WebsocketConnection$WSClientTubesock.this$0>
	//    9   23:invokestatic    #37  <Method LogWrapper WebsocketConnection.access$200(WebsocketConnection)>
	//   10   26:ldc1            #45  <String "had an error">
	//   11   28:aload_0         
	//   12   29:getfield        #24  <Field WebSocketException val$e>
	//   13   32:invokevirtual   #49  <Method void LogWrapper.debug(String, Throwable)>
		if(val$e.getMessage().startsWith("unknown host"))
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
			stringbuilder.append(val$e.getMessage());
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

	WebsocketConnection$WSClientTubesock$4()
	{
		this$1 = final_wsclienttubesock;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
		val$e = WebSocketException.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field WebSocketException val$e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
