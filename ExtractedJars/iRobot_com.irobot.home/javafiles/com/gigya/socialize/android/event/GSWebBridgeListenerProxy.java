// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.event;

import android.webkit.WebView;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.GSResponse;

// Referenced classes of package com.gigya.socialize.android.event:
//			GSWebBridgeListener

public class GSWebBridgeListenerProxy extends GSWebBridgeListener
{

	public GSWebBridgeListenerProxy(GSWebBridgeListener gswebbridgelistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void GSWebBridgeListener()>
		setListener(gswebbridgelistener);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #20  <Method void setListener(GSWebBridgeListener)>
	//    5    9:return          
	}

	public void beforeLogin(final WebView webView, final com.gigya.socialize.android.GSLoginRequest.LoginRequestType requestType, final GSObject params)
	{
		if(_listener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field GSWebBridgeListener _listener>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			webView.post(new Runnable() {

				public void run()
				{
					_listener.beforeLogin(webView, requestType, params);
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field GSWebBridgeListenerProxy this$0>
				//    2    4:invokestatic    #38  <Method GSWebBridgeListener GSWebBridgeListenerProxy.access$000(GSWebBridgeListenerProxy)>
				//    3    7:aload_0         
				//    4    8:getfield        #25  <Field WebView val$webView>
				//    5   11:aload_0         
				//    6   12:getfield        #27  <Field com.gigya.socialize.android.GSLoginRequest$LoginRequestType val$requestType>
				//    7   15:aload_0         
				//    8   16:getfield        #29  <Field GSObject val$params>
				//    9   19:invokevirtual   #41  <Method void GSWebBridgeListener.beforeLogin(WebView, com.gigya.socialize.android.GSLoginRequest$LoginRequestType, GSObject)>
				//   10   22:return          
				}

				final GSWebBridgeListenerProxy this$0;
				final GSObject val$params;
				final com.gigya.socialize.android.GSLoginRequest.LoginRequestType val$requestType;
				final WebView val$webView;

			
			{
				this$0 = GSWebBridgeListenerProxy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field GSWebBridgeListenerProxy this$0>
				webView = webview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field WebView val$webView>
				requestType = loginrequesttype;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field com.gigya.socialize.android.GSLoginRequest$LoginRequestType val$requestType>
				params = gsobject;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field GSObject val$params>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    4    8:aload_1         
	//    5    9:new             #6   <Class GSWebBridgeListenerProxy$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokespecial   #30  <Method void GSWebBridgeListenerProxy$1(GSWebBridgeListenerProxy, WebView, com.gigya.socialize.android.GSLoginRequest$LoginRequestType, GSObject)>
	//   12   20:invokevirtual   #36  <Method boolean WebView.post(Runnable)>
	//   13   23:pop             
			return;
	//   14   24:return          
		}
	}

	public void onLoginResponse(final WebView webView, final GSResponse response)
	{
		if(_listener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field GSWebBridgeListener _listener>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			webView.post(new Runnable() {

				public void run()
				{
					_listener.onLoginResponse(webView, response);
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

			
			{
				this$0 = GSWebBridgeListenerProxy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #21  <Field GSWebBridgeListenerProxy this$0>
				webView = webview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #23  <Field WebView val$webView>
				response = gsresponse;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #25  <Field GSResponse val$response>
				super();
			//    9   15:aload_0         
			//   10   16:invokespecial   #28  <Method void Object()>
			//   11   19:return          
			}
			}
);
	//    4    8:aload_1         
	//    5    9:new             #8   <Class GSWebBridgeListenerProxy$2>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokespecial   #41  <Method void GSWebBridgeListenerProxy$2(GSWebBridgeListenerProxy, WebView, GSResponse)>
	//   11   19:invokevirtual   #36  <Method boolean WebView.post(Runnable)>
	//   12   22:pop             
			return;
	//   13   23:return          
		}
	}

	public void onPluginEvent(final WebView webView, final GSObject event, final String containerID)
	{
		if(_listener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field GSWebBridgeListener _listener>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			webView.post(new Runnable() {

				public void run()
				{
					_listener.onPluginEvent(webView, event, containerID);
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

			
			{
				this$0 = GSWebBridgeListenerProxy.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field GSWebBridgeListenerProxy this$0>
				webView = webview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field WebView val$webView>
				event = gsobject;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field GSObject val$event>
				containerID = s;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field String val$containerID>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//    4    8:aload_1         
	//    5    9:new             #10  <Class GSWebBridgeListenerProxy$3>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:aload_3         
	//   11   17:invokespecial   #46  <Method void GSWebBridgeListenerProxy$3(GSWebBridgeListenerProxy, WebView, GSObject, String)>
	//   12   20:invokevirtual   #36  <Method boolean WebView.post(Runnable)>
	//   13   23:pop             
			return;
	//   14   24:return          
		}
	}

	public void setListener(GSWebBridgeListener gswebbridgelistener)
	{
		_listener = gswebbridgelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field GSWebBridgeListener _listener>
	//    3    5:return          
	}

	private GSWebBridgeListener _listener;


/*
	static GSWebBridgeListener access$000(GSWebBridgeListenerProxy gswebbridgelistenerproxy)
	{
		return gswebbridgelistenerproxy._listener;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field GSWebBridgeListener _listener>
	//    2    4:areturn         
	}

*/
}
