// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.ui;

import android.webkit.*;

// Referenced classes of package com.gigya.socialize.android.ui:
//			WebViewFragment

class WebViewFragment$1 extends WebChromeClient
{

	public boolean onJsAlert(WebView webview, String s, String s1, JsResult jsresult)
	{
		jsresult.confirm();
	//    0    0:aload           4
	//    1    2:invokevirtual   #26  <Method void JsResult.confirm()>
		return true;
	//    2    5:iconst_1        
	//    3    6:ireturn         
	}

	final WebViewFragment this$0;

	WebViewFragment$1()
	{
		this$0 = WebViewFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field WebViewFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebChromeClient()>
	//    5    9:return          
	}
}
