// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appscend.mraid;

import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

// Referenced classes of package com.appscend.mraid:
//			MadvertiseImageView

class MadvertiseImageView$1 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		webview = ((WebView) (val$loadingCompletedHandler));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Handler val$loadingCompletedHandler>
	//    2    4:astore_1        
		if(webview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
			((Handler) (webview)).sendEmptyMessage(0);
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #30  <Method boolean Handler.sendEmptyMessage(int)>
	//    8   14:pop             
	//    9   15:return          
	}

	final MadvertiseImageView this$0;
	final Handler val$loadingCompletedHandler;

	MadvertiseImageView$1()
	{
		this$0 = final_madvertiseimageview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field MadvertiseImageView this$0>
		val$loadingCompletedHandler = Handler.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Handler val$loadingCompletedHandler>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void WebViewClient()>
	//    8   14:return          
	}
}
