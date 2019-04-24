// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.DialogInterface;
import android.webkit.WebView;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			c

static final class c$3
	implements android.content.ogInterface.OnCancelListener
{

	public void onCancel(DialogInterface dialoginterface)
	{
		a.stopLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field WebView a>
	//    2    4:invokevirtual   #27  <Method void WebView.stopLoading()>
	//    3    7:return          
	}

	final WebView a;

	c$3(WebView webview)
	{
		a = webview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field WebView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
