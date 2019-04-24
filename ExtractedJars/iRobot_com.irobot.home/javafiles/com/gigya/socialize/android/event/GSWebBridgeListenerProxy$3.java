// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.event;

import android.webkit.WebView;
import com.gigya.socialize.GSObject;

// Referenced classes of package com.gigya.socialize.android.event:
//			GSWebBridgeListenerProxy, GSWebBridgeListener

class GSWebBridgeListenerProxy$3
	implements Runnable
{

	public void run()
	{
		GSWebBridgeListenerProxy.access$000(GSWebBridgeListenerProxy.this).onPluginEvent(val$webView, val$event, val$containerID);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field GSWebBridgeListenerProxy this$0>
	//    2    4:invokestatic    #38  <Method GSWebBridgeListener GSWebBridgeListenerProxy.access$000(GSWebBridgeListenerProxy)>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field WebView val$webView>
	//    5   11:aload_0         
	//    6   12:getfield        #27  <Field GSObject val$event>
	//    7   15:aload_0         
	//    8   16:getfield        #29  <Field String val$containerID>
	//    9   19:invokevirtual   #41  <Method void GSWebBridgeListener.onPluginEvent(WebView, GSObject, String)>
	//   10   22:return          
	}

	final GSWebBridgeListenerProxy this$0;
	final String val$containerID;
	final GSObject val$event;
	final WebView val$webView;

	GSWebBridgeListenerProxy$3()
	{
		this$0 = final_gswebbridgelistenerproxy;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field GSWebBridgeListenerProxy this$0>
		val$webView = webview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field WebView val$webView>
		val$event = gsobject;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field GSObject val$event>
		val$containerID = String.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field String val$containerID>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
