// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.graphics.Bitmap;
import android.support.v4.content.a;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			BaseFragmentActivity

public class CustomVideoWebViewActivity extends BaseFragmentActivity
{

	public CustomVideoWebViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void BaseFragmentActivity()>
	//    2    4:aload_0         
	//    3    5:ldc1            #2   <Class CustomVideoWebViewActivity>
	//    4    7:invokevirtual   #28  <Method String Class.getSimpleName()>
	//    5   10:invokestatic    #34  <Method String j.r(String)>
	//    6   13:putfield        #36  <Field String g>
		a = "";
	//    7   16:aload_0         
	//    8   17:ldc1            #38  <String "">
	//    9   19:putfield        #40  <Field String a>
		b = "";
	//   10   22:aload_0         
	//   11   23:ldc1            #38  <String "">
	//   12   25:putfield        #42  <Field String b>
		e = false;
	//   13   28:aload_0         
	//   14   29:iconst_0        
	//   15   30:putfield        #44  <Field boolean e>
		h = true;
	//   16   33:aload_0         
	//   17   34:iconst_1        
	//   18   35:putfield        #46  <Field boolean h>
	//   19   38:return          
	}

	static boolean a(CustomVideoWebViewActivity customvideowebviewactivity)
	{
		return customvideowebviewactivity.h;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean h>
	//    2    4:ireturn         
	}

	static boolean a(CustomVideoWebViewActivity customvideowebviewactivity, boolean flag)
	{
		customvideowebviewactivity.h = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #46  <Field boolean h>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	private void f()
	{
		Window window = getWindow();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Window getWindow()>
	//    2    4:astore_1        
		window.clearFlags(0x4000000);
	//    3    5:aload_1         
	//    4    6:ldc1            #54  <Int 0x4000000>
	//    5    8:invokevirtual   #60  <Method void Window.clearFlags(int)>
		window.addFlags(0x80000000);
	//    6   11:aload_1         
	//    7   12:ldc1            #61  <Int 0x80000000>
	//    8   14:invokevirtual   #64  <Method void Window.addFlags(int)>
		window.setStatusBarColor(android.support.v4.content.a.getColor(((android.content.Context) (this)), 0x7f060023));
	//    9   17:aload_1         
	//   10   18:aload_0         
	//   11   19:ldc1            #65  <Int 0x7f060023>
	//   12   21:invokestatic    #71  <Method int a.getColor(android.content.Context, int)>
	//   13   24:invokevirtual   #74  <Method void Window.setStatusBarColor(int)>
	//   14   27:return          
	}

	public void e()
	{
		f();
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void f()>
		f.setWebViewClient(((WebViewClient) (new WebViewClient() {

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
			//*  17   35:invokestatic    #37  <Method com.irobot.home.model.a j.j()>
			//*  18   38:ifnull          74
						AnalyticsSubsystem.getInstance().trackNotificationCenterVideoViewed(j.j().a(), a.b, a.c, a.d);
			//   19   41:invokestatic    #43  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
			//   20   44:invokestatic    #37  <Method com.irobot.home.model.a j.j()>
			//   21   47:invokevirtual   #48  <Method com.irobot.core.AssetInfo com.irobot.home.model.a.a()>
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

			
			{
				a = CustomVideoWebViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field CustomVideoWebViewActivity a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void WebViewClient()>
			//    5    9:return          
			}
		}
)));
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field WebView f>
	//    4    8:new             #6   <Class CustomVideoWebViewActivity$1>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokespecial   #81  <Method void CustomVideoWebViewActivity$1(CustomVideoWebViewActivity)>
	//    8   16:invokevirtual   #87  <Method void WebView.setWebViewClient(WebViewClient)>
		f.getSettings().setPluginState(android.webkit.WebSettings.PluginState.ON);
	//    9   19:aload_0         
	//   10   20:getfield        #78  <Field WebView f>
	//   11   23:invokevirtual   #91  <Method WebSettings WebView.getSettings()>
	//   12   26:getstatic       #97  <Field android.webkit.WebSettings$PluginState android.webkit.WebSettings$PluginState.ON>
	//   13   29:invokevirtual   #103 <Method void WebSettings.setPluginState(android.webkit.WebSettings$PluginState)>
		f.setWebChromeClient(new WebChromeClient());
	//   14   32:aload_0         
	//   15   33:getfield        #78  <Field WebView f>
	//   16   36:new             #105 <Class WebChromeClient>
	//   17   39:dup             
	//   18   40:invokespecial   #106 <Method void WebChromeClient()>
	//   19   43:invokevirtual   #110 <Method void WebView.setWebChromeClient(WebChromeClient)>
		f.setInitialScale(1);
	//   20   46:aload_0         
	//   21   47:getfield        #78  <Field WebView f>
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #113 <Method void WebView.setInitialScale(int)>
		f.getSettings().setJavaScriptEnabled(true);
	//   24   54:aload_0         
	//   25   55:getfield        #78  <Field WebView f>
	//   26   58:invokevirtual   #91  <Method WebSettings WebView.getSettings()>
	//   27   61:iconst_1        
	//   28   62:invokevirtual   #117 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		f.getSettings().setAppCacheEnabled(true);
	//   29   65:aload_0         
	//   30   66:getfield        #78  <Field WebView f>
	//   31   69:invokevirtual   #91  <Method WebSettings WebView.getSettings()>
	//   32   72:iconst_1        
	//   33   73:invokevirtual   #120 <Method void WebSettings.setAppCacheEnabled(boolean)>
		f.getSettings().setLoadWithOverviewMode(true);
	//   34   76:aload_0         
	//   35   77:getfield        #78  <Field WebView f>
	//   36   80:invokevirtual   #91  <Method WebSettings WebView.getSettings()>
	//   37   83:iconst_1        
	//   38   84:invokevirtual   #123 <Method void WebSettings.setLoadWithOverviewMode(boolean)>
		f.getSettings().setUseWideViewPort(true);
	//   39   87:aload_0         
	//   40   88:getfield        #78  <Field WebView f>
	//   41   91:invokevirtual   #91  <Method WebSettings WebView.getSettings()>
	//   42   94:iconst_1        
	//   43   95:invokevirtual   #126 <Method void WebSettings.setUseWideViewPort(boolean)>
		f.getSettings().setLoadsImagesAutomatically(true);
	//   44   98:aload_0         
	//   45   99:getfield        #78  <Field WebView f>
	//   46  102:invokevirtual   #91  <Method WebSettings WebView.getSettings()>
	//   47  105:iconst_1        
	//   48  106:invokevirtual   #129 <Method void WebSettings.setLoadsImagesAutomatically(boolean)>
		f.getSettings().setSupportZoom(false);
	//   49  109:aload_0         
	//   50  110:getfield        #78  <Field WebView f>
	//   51  113:invokevirtual   #91  <Method WebSettings WebView.getSettings()>
	//   52  116:iconst_0        
	//   53  117:invokevirtual   #132 <Method void WebSettings.setSupportZoom(boolean)>
		f.loadUrl(a);
	//   54  120:aload_0         
	//   55  121:getfield        #78  <Field WebView f>
	//   56  124:aload_0         
	//   57  125:getfield        #40  <Field String a>
	//   58  128:invokevirtual   #136 <Method void WebView.loadUrl(String)>
	//   59  131:return          
	}

	String a;
	String b;
	int c;
	int d;
	boolean e;
	WebView f;
	private final String g = j.r(((Class) (com/irobot/home/CustomVideoWebViewActivity)).getSimpleName());
	private boolean h;
}
