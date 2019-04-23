// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.overlaycontrollers;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.appscend.overlaycontrollers:
//			APSMediaPlayerJSYoutubeOverlayController

class APSMediaPlayerJSYoutubeOverlayController$1 extends WebChromeClient
{

	public void onCloseWindow(WebView webview)
	{
		super.onCloseWindow(webview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void WebChromeClient.onCloseWindow(WebView)>
	//    3    5:return          
	}

	public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
	{
		super.onShowCustomView(view, customviewcallback);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #27  <Method void WebChromeClient.onShowCustomView(View, android.webkit.WebChromeClient$CustomViewCallback)>
	//    4    6:return          
	}

	final APSMediaPlayerJSYoutubeOverlayController this$0;

	APSMediaPlayerJSYoutubeOverlayController$1()
	{
		this$0 = APSMediaPlayerJSYoutubeOverlayController.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field APSMediaPlayerJSYoutubeOverlayController this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebChromeClient()>
	//    5    9:return          
	}
}
