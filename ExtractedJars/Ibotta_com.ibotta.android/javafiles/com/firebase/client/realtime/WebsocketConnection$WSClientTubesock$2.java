// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;


// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

class WebsocketConnection$WSClientTubesock$2
	implements Runnable
{

	public void run()
	{
		WebsocketConnection.access$500(this$0, val$str);
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

	WebsocketConnection$WSClientTubesock$2()
	{
		this$1 = final_wsclienttubesock;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field WebsocketConnection$WSClientTubesock this$1>
		val$str = String.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String val$str>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
