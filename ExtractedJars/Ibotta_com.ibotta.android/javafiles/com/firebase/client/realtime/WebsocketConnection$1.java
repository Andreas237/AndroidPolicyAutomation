// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;


// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

class WebsocketConnection$1
	implements Runnable
{

	public void run()
	{
		WebsocketConnection.access$800(WebsocketConnection.this);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field WebsocketConnection this$0>
	//    2    4:invokestatic    #24  <Method void WebsocketConnection.access$800(WebsocketConnection)>
	//    3    7:return          
	}

	final WebsocketConnection this$0;

	WebsocketConnection$1()
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
