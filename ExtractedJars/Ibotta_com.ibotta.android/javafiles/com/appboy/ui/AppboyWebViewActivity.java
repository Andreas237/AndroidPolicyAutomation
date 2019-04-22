// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Window;
import android.webkit.*;
import com.appboy.enums.Channel;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.actions.ActionFactory;
import com.appboy.ui.actions.IAction;
import com.appboy.ui.activities.AppboyBaseActivity;
import java.util.List;

public class AppboyWebViewActivity extends AppboyBaseActivity
{

	public AppboyWebViewActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AppboyBaseActivity()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #39  <Method void AppboyBaseActivity.onCreate(Bundle)>
		requestWindowFeature(2);
	//    3    5:aload_0         
	//    4    6:iconst_2        
	//    5    7:invokevirtual   #43  <Method boolean requestWindowFeature(int)>
	//    6   10:pop             
		requestWindowFeature(5);
	//    7   11:aload_0         
	//    8   12:iconst_5        
	//    9   13:invokevirtual   #43  <Method boolean requestWindowFeature(int)>
	//   10   16:pop             
		getWindow().setFlags(0x1000000, 0x1000000);
	//   11   17:aload_0         
	//   12   18:invokevirtual   #47  <Method Window getWindow()>
	//   13   21:ldc1            #48  <Int 0x1000000>
	//   14   23:ldc1            #48  <Int 0x1000000>
	//   15   25:invokevirtual   #54  <Method void Window.setFlags(int, int)>
		setContentView(R.layout.com_appboy_webview_activity);
	//   16   28:aload_0         
	//   17   29:getstatic       #60  <Field int R$layout.com_appboy_webview_activity>
	//   18   32:invokevirtual   #64  <Method void setContentView(int)>
		setProgressBarVisibility(true);
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:invokevirtual   #68  <Method void setProgressBarVisibility(boolean)>
		bundle = ((Bundle) ((WebView)findViewById(R.id.com_appboy_webview_activity_webview)));
	//   22   40:aload_0         
	//   23   41:getstatic       #73  <Field int R$id.com_appboy_webview_activity_webview>
	//   24   44:invokevirtual   #77  <Method android.view.View findViewById(int)>
	//   25   47:checkcast       #79  <Class WebView>
	//   26   50:astore_1        
		Object obj = ((Object) (((WebView) (bundle)).getSettings()));
	//   27   51:aload_1         
	//   28   52:invokevirtual   #83  <Method WebSettings WebView.getSettings()>
	//   29   55:astore_2        
		((WebSettings) (obj)).setJavaScriptEnabled(true);
	//   30   56:aload_2         
	//   31   57:iconst_1        
	//   32   58:invokevirtual   #88  <Method void WebSettings.setJavaScriptEnabled(boolean)>
		((WebSettings) (obj)).setAllowFileAccess(false);
	//   33   61:aload_2         
	//   34   62:iconst_0        
	//   35   63:invokevirtual   #91  <Method void WebSettings.setAllowFileAccess(boolean)>
		((WebSettings) (obj)).setPluginState(android.webkit.WebSettings.PluginState.OFF);
	//   36   66:aload_2         
	//   37   67:getstatic       #97  <Field android.webkit.WebSettings$PluginState android.webkit.WebSettings$PluginState.OFF>
	//   38   70:invokevirtual   #101 <Method void WebSettings.setPluginState(android.webkit.WebSettings$PluginState)>
		((WebSettings) (obj)).setDisplayZoomControls(false);
	//   39   73:aload_2         
	//   40   74:iconst_0        
	//   41   75:invokevirtual   #104 <Method void WebSettings.setDisplayZoomControls(boolean)>
		((WebSettings) (obj)).setBuiltInZoomControls(true);
	//   42   78:aload_2         
	//   43   79:iconst_1        
	//   44   80:invokevirtual   #107 <Method void WebSettings.setBuiltInZoomControls(boolean)>
		((WebSettings) (obj)).setUseWideViewPort(true);
	//   45   83:aload_2         
	//   46   84:iconst_1        
	//   47   85:invokevirtual   #110 <Method void WebSettings.setUseWideViewPort(boolean)>
		((WebSettings) (obj)).setLoadWithOverviewMode(true);
	//   48   88:aload_2         
	//   49   89:iconst_1        
	//   50   90:invokevirtual   #113 <Method void WebSettings.setLoadWithOverviewMode(boolean)>
		((WebSettings) (obj)).setDomStorageEnabled(true);
	//   51   93:aload_2         
	//   52   94:iconst_1        
	//   53   95:invokevirtual   #116 <Method void WebSettings.setDomStorageEnabled(boolean)>
		((WebView) (bundle)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.RelativeLayout.LayoutParams(-1, -1))));
	//   54   98:aload_1         
	//   55   99:new             #118 <Class android.widget.RelativeLayout$LayoutParams>
	//   56  102:dup             
	//   57  103:iconst_m1       
	//   58  104:iconst_m1       
	//   59  105:invokespecial   #120 <Method void android.widget.RelativeLayout$LayoutParams(int, int)>
	//   60  108:invokevirtual   #124 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		((WebView) (bundle)).setWebChromeClient(((WebChromeClient) (new WebChromeClient() {

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
)));
	//   61  111:aload_1         
	//   62  112:new             #6   <Class AppboyWebViewActivity$1>
	//   63  115:dup             
	//   64  116:aload_0         
	//   65  117:invokespecial   #127 <Method void AppboyWebViewActivity$1(AppboyWebViewActivity)>
	//   66  120:invokevirtual   #131 <Method void WebView.setWebChromeClient(WebChromeClient)>
		((WebView) (bundle)).setDownloadListener(new DownloadListener() {

			public void onDownloadStart(String s, String s1, String s2, String s3, long l)
			{
				s1 = ((String) (new Intent("android.intent.action.VIEW")));
			//    0    0:new             #25  <Class Intent>
			//    1    3:dup             
			//    2    4:ldc1            #27  <String "android.intent.action.VIEW">
			//    3    6:invokespecial   #30  <Method void Intent(String)>
			//    4    9:astore_2        
				((Intent) (s1)).setData(Uri.parse(s));
			//    5   10:aload_2         
			//    6   11:aload_1         
			//    7   12:invokestatic    #36  <Method Uri Uri.parse(String)>
			//    8   15:invokevirtual   #40  <Method Intent Intent.setData(Uri)>
			//    9   18:pop             
				startActivity(((Intent) (s1)));
			//   10   19:aload_0         
			//   11   20:getfield        #17  <Field AppboyWebViewActivity this$0>
			//   12   23:aload_2         
			//   13   24:invokevirtual   #44  <Method void AppboyWebViewActivity.startActivity(Intent)>
			//   14   27:return          
			}

			final AppboyWebViewActivity this$0;

			
			{
				this$0 = AppboyWebViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field AppboyWebViewActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   67  123:aload_1         
	//   68  124:new             #8   <Class AppboyWebViewActivity$2>
	//   69  127:dup             
	//   70  128:aload_0         
	//   71  129:invokespecial   #132 <Method void AppboyWebViewActivity$2(AppboyWebViewActivity)>
	//   72  132:invokevirtual   #136 <Method void WebView.setDownloadListener(DownloadListener)>
		((WebView) (bundle)).getSettings().setCacheMode(2);
	//   73  135:aload_1         
	//   74  136:invokevirtual   #83  <Method WebSettings WebView.getSettings()>
	//   75  139:iconst_2        
	//   76  140:invokevirtual   #139 <Method void WebSettings.setCacheMode(int)>
		((WebView) (bundle)).setLayerType(2, ((android.graphics.Paint) (null)));
	//   77  143:aload_1         
	//   78  144:iconst_2        
	//   79  145:aconst_null     
	//   80  146:invokevirtual   #143 <Method void WebView.setLayerType(int, android.graphics.Paint)>
		((WebView) (bundle)).setWebViewClient(((WebViewClient) (new WebViewClient() {

			public boolean shouldOverrideUrlLoading(WebView webview, String s)
			{
				if(AppboyFileUtils.REMOTE_SCHEMES.contains(((Object) (Uri.parse(s).getScheme()))))
					break MISSING_BLOCK_LABEL_104;
			//    0    0:getstatic       #29  <Field List AppboyFileUtils.REMOTE_SCHEMES>
			//    1    3:aload_2         
			//    2    4:invokestatic    #35  <Method Uri Uri.parse(String)>
			//    3    7:invokevirtual   #39  <Method String Uri.getScheme()>
			//    4   10:invokeinterface #45  <Method boolean List.contains(Object)>
			//    5   15:ifne            104
				((IAction) (ActionFactory.createUriActionFromUrlString(s, getIntent().getExtras(), false, Channel.UNKNOWN))).execute(webview.getContext());
			//    6   18:aload_2         
			//    7   19:aload_0         
			//    8   20:getfield        #15  <Field AppboyWebViewActivity this$0>
			//    9   23:invokevirtual   #49  <Method Intent AppboyWebViewActivity.getIntent()>
			//   10   26:invokevirtual   #55  <Method Bundle Intent.getExtras()>
			//   11   29:iconst_0        
			//   12   30:getstatic       #61  <Field Channel Channel.UNKNOWN>
			//   13   33:invokestatic    #67  <Method com.appboy.ui.actions.UriAction ActionFactory.createUriActionFromUrlString(String, Bundle, boolean, Channel)>
			//   14   36:aload_1         
			//   15   37:invokevirtual   #73  <Method android.content.Context WebView.getContext()>
			//   16   40:invokeinterface #79  <Method void IAction.execute(android.content.Context)>
				finish();
			//   17   45:aload_0         
			//   18   46:getfield        #15  <Field AppboyWebViewActivity this$0>
			//   19   49:invokevirtual   #82  <Method void AppboyWebViewActivity.finish()>
				return true;
			//   20   52:iconst_1        
			//   21   53:ireturn         
				Exception exception;
				exception;
			//   22   54:astore_3        
				String s1 = AppboyWebViewActivity.TAG;
			//   23   55:invokestatic    #85  <Method String AppboyWebViewActivity.access$000()>
			//   24   58:astore          4
				StringBuilder stringbuilder = new StringBuilder();
			//   25   60:new             #87  <Class StringBuilder>
			//   26   63:dup             
			//   27   64:invokespecial   #88  <Method void StringBuilder()>
			//   28   67:astore          5
				stringbuilder.append("Unexpected exception while processing url ");
			//   29   69:aload           5
			//   30   71:ldc1            #90  <String "Unexpected exception while processing url ">
			//   31   73:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
			//   32   76:pop             
				stringbuilder.append(s);
			//   33   77:aload           5
			//   34   79:aload_2         
			//   35   80:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
			//   36   83:pop             
				stringbuilder.append(". Passing url back to WebView.");
			//   37   84:aload           5
			//   38   86:ldc1            #96  <String ". Passing url back to WebView.">
			//   39   88:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
			//   40   91:pop             
				AppboyLogger.i(s1, stringbuilder.toString(), ((Throwable) (exception)));
			//   41   92:aload           4
			//   42   94:aload           5
			//   43   96:invokevirtual   #99  <Method String StringBuilder.toString()>
			//   44   99:aload_3         
			//   45  100:invokestatic    #105 <Method int AppboyLogger.i(String, String, Throwable)>
			//   46  103:pop             
				return super.shouldOverrideUrlLoading(webview, s);
			//   47  104:aload_0         
			//   48  105:aload_1         
			//   49  106:aload_2         
			//   50  107:invokespecial   #107 <Method boolean WebViewClient.shouldOverrideUrlLoading(WebView, String)>
			//   51  110:ireturn         
			}

			final AppboyWebViewActivity this$0;

			
			{
				this$0 = AppboyWebViewActivity.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppboyWebViewActivity this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebViewClient()>
			//    5    9:return          
			}
		}
)));
	//   81  149:aload_1         
	//   82  150:new             #10  <Class AppboyWebViewActivity$3>
	//   83  153:dup             
	//   84  154:aload_0         
	//   85  155:invokespecial   #144 <Method void AppboyWebViewActivity$3(AppboyWebViewActivity)>
	//   86  158:invokevirtual   #148 <Method void WebView.setWebViewClient(WebViewClient)>
		obj = ((Object) (getIntent().getExtras()));
	//   87  161:aload_0         
	//   88  162:invokevirtual   #152 <Method Intent getIntent()>
	//   89  165:invokevirtual   #158 <Method Bundle Intent.getExtras()>
	//   90  168:astore_2        
		if(obj != null && ((Bundle) (obj)).containsKey("url"))
	//*  91  169:aload_2         
	//*  92  170:ifnull          192
	//*  93  173:aload_2         
	//*  94  174:ldc1            #18  <String "url">
	//*  95  176:invokevirtual   #164 <Method boolean Bundle.containsKey(String)>
	//*  96  179:ifeq            192
			((WebView) (bundle)).loadUrl(((Bundle) (obj)).getString("url"));
	//   97  182:aload_1         
	//   98  183:aload_2         
	//   99  184:ldc1            #18  <String "url">
	//  100  186:invokevirtual   #168 <Method String Bundle.getString(String)>
	//  101  189:invokevirtual   #172 <Method void WebView.loadUrl(String)>
	//  102  192:return          
	}

	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/AppboyWebViewActivity);
	public static final String URL_EXTRA = "url";

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyWebViewActivity>
	//    1    2:invokestatic    #27  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #29  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #29  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
