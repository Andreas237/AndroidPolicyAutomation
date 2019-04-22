// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.webkit.WebChromeClient;
import android.webkit.WebView;

// Referenced classes of package com.appboy.ui:
//			AppboyWebViewActivity

class AppboyWebViewActivity$1 extends WebChromeClient
{

	public void onProgressChanged(WebView webview, int i)
	{
		if(i < 100)
	//*   0    0:iload_2         
	//*   1    1:bipush          100
	//*   2    3:icmpge          15
		{
			setProgressBarVisibility(true);
	//    3    6:aload_0         
	//    4    7:getfield        #15  <Field AppboyWebViewActivity this$0>
	//    5   10:iconst_1        
	//    6   11:invokevirtual   #25  <Method void AppboyWebViewActivity.setProgressBarVisibility(boolean)>
			return;
	//    7   14:return          
		} else
		{
			setProgressBarVisibility(false);
	//    8   15:aload_0         
	//    9   16:getfield        #15  <Field AppboyWebViewActivity this$0>
	//   10   19:iconst_0        
	//   11   20:invokevirtual   #25  <Method void AppboyWebViewActivity.setProgressBarVisibility(boolean)>
			return;
	//   12   23:return          
		}
	}

	final AppboyWebViewActivity this$0;

	AppboyWebViewActivity$1()
	{
		this$0 = AppboyWebViewActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field AppboyWebViewActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebChromeClient()>
	//    5    9:return          
	}
}
