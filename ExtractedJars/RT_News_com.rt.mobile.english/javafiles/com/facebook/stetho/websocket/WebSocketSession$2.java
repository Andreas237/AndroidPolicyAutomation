// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.websocket;

import java.io.IOException;

// Referenced classes of package com.facebook.stetho.websocket:
//			WriteCallback, WebSocketSession

class WebSocketSession$2
	implements WriteCallback
{

	public void onFailure(IOException ioexception)
	{
		WebSocketSession.access$000(WebSocketSession.this, ioexception);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field WebSocketSession this$0>
	//    2    4:aload_1         
	//    3    5:invokestatic    #24  <Method void WebSocketSession.access$000(WebSocketSession, IOException)>
	//    4    8:return          
	}

	public void onSuccess()
	{
	//    0    0:return          
	}

	final WebSocketSession this$0;

	WebSocketSession$2()
	{
		this$0 = WebSocketSession.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field WebSocketSession this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
