// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.event;

import android.webkit.WebView;
import com.gigya.socialize.GSResponse;

// Referenced classes of package com.gigya.socialize.android.event:
//			GSWebBridgeListenerProxy, GSWebBridgeListener

class GSWebBridgeListenerProxy$2
	implements Runnable
{

	public void run()
	{
		GSWebBridgeListenerProxy.access$000(GSWebBridgeListenerProxy.this).onLoginResponse(val$webView, val$response);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field GSWebBridgeListenerProxy this$0>
	//    2    4:invokestatic    #34  <Method GSWebBridgeListener GSWebBridgeListenerProxy.access$000(GSWebBridgeListenerProxy)>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field WebView val$webView>
	//    5   11:aload_0         
	//    6   12:getfield        #25  <Field GSResponse val$response>
	//    7   15:invokevirtual   #37  <Method void GSWebBridgeListener.onLoginResponse(WebView, GSResponse)>
	//    8   18:return          
	}

	final GSWebBridgeListenerProxy this$0;
	final GSResponse val$response;
	final WebView val$webView;

	GSWebBridgeListenerProxy$2()
	{
		this$0 = final_gswebbridgelistenerproxy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field GSWebBridgeListenerProxy this$0>
		val$webView = webview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field WebView val$webView>
		val$response = GSResponse.this;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field GSResponse val$response>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
