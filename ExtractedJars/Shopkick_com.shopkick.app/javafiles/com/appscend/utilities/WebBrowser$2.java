// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.utilities;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.TextView;

// Referenced classes of package com.appscend.utilities:
//			WebBrowser

class WebBrowser$2 extends WebChromeClient
{

	public void onReceivedTitle(WebView webview, String s)
	{
		super.onReceivedTitle(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #23  <Method void WebChromeClient.onReceivedTitle(WebView, String)>
		WebBrowser.access$000(WebBrowser.this).setText(((CharSequence) (s)));
	//    4    6:aload_0         
	//    5    7:getfield        #15  <Field WebBrowser this$0>
	//    6   10:invokestatic    #27  <Method TextView WebBrowser.access$000(WebBrowser)>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #33  <Method void TextView.setText(CharSequence)>
	//    9   17:return          
	}

	final WebBrowser this$0;

	WebBrowser$2()
	{
		this$0 = WebBrowser.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field WebBrowser this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebChromeClient()>
	//    5    9:return          
	}
}
