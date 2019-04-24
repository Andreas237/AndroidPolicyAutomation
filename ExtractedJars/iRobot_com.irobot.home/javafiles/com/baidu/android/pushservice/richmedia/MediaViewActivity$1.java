// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice.richmedia;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.baidu.android.pushservice.richmedia:
//			MediaViewActivity

class MediaViewActivity$1 extends WebChromeClient
{

	public void onHideCustomView()
	{
	//    0    0:return          
	}

	public void onProgressChanged(WebView webview, int i)
	{
	//    0    0:return          
	}

	public void onShowCustomView(View view, android.webkit.omViewCallback omviewcallback)
	{
	//    0    0:return          
	}

	final MediaViewActivity a;

	MediaViewActivity$1(MediaViewActivity mediaviewactivity)
	{
		a = mediaviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field MediaViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void WebChromeClient()>
	//    5    9:return          
	}
}
