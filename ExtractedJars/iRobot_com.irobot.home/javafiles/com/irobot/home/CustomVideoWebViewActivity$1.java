// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.model.a;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			CustomVideoWebViewActivity

class CustomVideoWebViewActivity$1 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		super.onPageFinished(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #22  <Method void WebViewClient.onPageFinished(WebView, String)>
		if(com.irobot.home.CustomVideoWebViewActivity.a(a) && a.e)
	//*   4    6:aload_0         
	//*   5    7:getfield        #15  <Field CustomVideoWebViewActivity a>
	//*   6   10:invokestatic    #25  <Method boolean com.irobot.home.CustomVideoWebViewActivity.a(CustomVideoWebViewActivity)>
	//*   7   13:ifeq            74
	//*   8   16:aload_0         
	//*   9   17:getfield        #15  <Field CustomVideoWebViewActivity a>
	//*  10   20:getfield        #28  <Field boolean CustomVideoWebViewActivity.e>
	//*  11   23:ifeq            74
		{
			com.irobot.home.CustomVideoWebViewActivity.a(a, false);
	//   12   26:aload_0         
	//   13   27:getfield        #15  <Field CustomVideoWebViewActivity a>
	//   14   30:iconst_0        
	//   15   31:invokestatic    #31  <Method boolean com.irobot.home.CustomVideoWebViewActivity.a(CustomVideoWebViewActivity, boolean)>
	//   16   34:pop             
			if(j.j() != null)
	//*  17   35:invokestatic    #37  <Method a j.j()>
	//*  18   38:ifnull          74
				AnalyticsSubsystem.getInstance().trackNotificationCenterVideoViewed(j.j().a(), a.b, a.c, a.d);
	//   19   41:invokestatic    #43  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//   20   44:invokestatic    #37  <Method a j.j()>
	//   21   47:invokevirtual   #48  <Method com.irobot.core.AssetInfo a.a()>
	//   22   50:aload_0         
	//   23   51:getfield        #15  <Field CustomVideoWebViewActivity a>
	//   24   54:getfield        #52  <Field String CustomVideoWebViewActivity.b>
	//   25   57:aload_0         
	//   26   58:getfield        #15  <Field CustomVideoWebViewActivity a>
	//   27   61:getfield        #56  <Field int CustomVideoWebViewActivity.c>
	//   28   64:aload_0         
	//   29   65:getfield        #15  <Field CustomVideoWebViewActivity a>
	//   30   68:getfield        #59  <Field int CustomVideoWebViewActivity.d>
	//   31   71:invokevirtual   #63  <Method void AnalyticsSubsystem.trackNotificationCenterVideoViewed(com.irobot.core.AssetInfo, String, int, int)>
		}
		a.f.performClick();
	//   32   74:aload_0         
	//   33   75:getfield        #15  <Field CustomVideoWebViewActivity a>
	//   34   78:getfield        #67  <Field WebView CustomVideoWebViewActivity.f>
	//   35   81:invokevirtual   #73  <Method boolean WebView.performClick()>
	//   36   84:pop             
	//   37   85:return          
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		super.onPageStarted(webview, s, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #77  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
	//    5    7:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final CustomVideoWebViewActivity a;

	CustomVideoWebViewActivity$1(CustomVideoWebViewActivity customvideowebviewactivity)
	{
		a = customvideowebviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field CustomVideoWebViewActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void WebViewClient()>
	//    5    9:return          
	}
}
