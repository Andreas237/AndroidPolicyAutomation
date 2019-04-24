// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.irobot.home.util:
//			j

static final class j$4 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		super.onPageFinished(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void WebViewClient.onPageFinished(WebView, String)>
	//    4    6:return          
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		super.onPageStarted(webview, s, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #21  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
	//    5    7:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	j$4()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void WebViewClient()>
	//    2    4:return          
	}
}
