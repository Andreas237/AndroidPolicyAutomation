// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.realtime;


// Referenced classes of package com.firebase.client.realtime:
//			WebsocketConnection

class WebsocketConnection$2
	implements Runnable
{

	public void run()
	{
		if(WebsocketConnection.access$900(WebsocketConnection.this) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field WebsocketConnection this$0>
	//*   2    4:invokestatic    #26  <Method WebsocketConnection$WSClient WebsocketConnection.access$900(WebsocketConnection)>
	//*   3    7:ifnull          31
		{
			WebsocketConnection.access$900(WebsocketConnection.this).send("0");
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field WebsocketConnection this$0>
	//    6   14:invokestatic    #26  <Method WebsocketConnection$WSClient WebsocketConnection.access$900(WebsocketConnection)>
	//    7   17:ldc1            #28  <String "0">
	//    8   19:invokeinterface #34  <Method void WebsocketConnection$WSClient.send(String)>
			WebsocketConnection.access$300(WebsocketConnection.this);
	//    9   24:aload_0         
	//   10   25:getfield        #17  <Field WebsocketConnection this$0>
	//   11   28:invokestatic    #37  <Method void WebsocketConnection.access$300(WebsocketConnection)>
		}
	//   12   31:return          
	}

	final WebsocketConnection this$0;

	WebsocketConnection$2()
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
