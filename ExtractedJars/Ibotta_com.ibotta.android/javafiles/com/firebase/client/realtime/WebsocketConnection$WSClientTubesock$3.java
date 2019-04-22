// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;

import com.firebase.client.utilities.LogWrapper;

// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

class WebsocketConnection$WSClientTubesock$3
	implements Runnable
{

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

	WebsocketConnection$WSClientTubesock$3()
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
