// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.ui.inappmessage.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.*;
import com.appboy.support.AppboyLogger;
import com.appboy.ui.inappmessage.jsinterface.AppboyInAppMessageHtmlJavascriptInterface;

// Referenced classes of package com.appboy.ui.inappmessage.views:
//			AppboyInAppMessageHtmlBaseView, AppboyInAppMessageWebView

public class AppboyInAppMessageHtmlFullView extends AppboyInAppMessageHtmlBaseView
{

	public AppboyInAppMessageHtmlFullView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void AppboyInAppMessageHtmlBaseView(Context, AttributeSet)>
	//    4    6:return          
	}

	public WebView getMessageWebView()
	{
		if(mMessageWebView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field WebView mMessageWebView>
	//*   2    4:ifnonnull       107
		{
			mMessageWebView = ((WebView) ((AppboyInAppMessageWebView)findViewById(com.appboy.ui.R.id.com_appboy_inappmessage_html_full_webview)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getstatic       #44  <Field int com.appboy.ui.R$id.com_appboy_inappmessage_html_full_webview>
	//    6   12:invokevirtual   #48  <Method android.view.View findViewById(int)>
	//    7   15:checkcast       #50  <Class AppboyInAppMessageWebView>
	//    8   18:putfield        #38  <Field WebView mMessageWebView>
			Object obj = ((Object) (mMessageWebView));
	//    9   21:aload_0         
	//   10   22:getfield        #38  <Field WebView mMessageWebView>
	//   11   25:astore_1        
			if(obj != null)
	//*  12   26:aload_1         
	//*  13   27:ifnull          107
			{
				obj = ((Object) (((WebView) (obj)).getSettings()));
	//   14   30:aload_1         
	//   15   31:invokevirtual   #56  <Method WebSettings WebView.getSettings()>
	//   16   34:astore_1        
				((WebSettings) (obj)).setJavaScriptEnabled(true);
	//   17   35:aload_1         
	//   18   36:iconst_1        
	//   19   37:invokevirtual   #62  <Method void WebSettings.setJavaScriptEnabled(boolean)>
				((WebSettings) (obj)).setUseWideViewPort(true);
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:invokevirtual   #65  <Method void WebSettings.setUseWideViewPort(boolean)>
				((WebSettings) (obj)).setLoadWithOverviewMode(true);
	//   23   45:aload_1         
	//   24   46:iconst_1        
	//   25   47:invokevirtual   #68  <Method void WebSettings.setLoadWithOverviewMode(boolean)>
				((WebSettings) (obj)).setDisplayZoomControls(false);
	//   26   50:aload_1         
	//   27   51:iconst_0        
	//   28   52:invokevirtual   #71  <Method void WebSettings.setDisplayZoomControls(boolean)>
				mMessageWebView.setLayerType(2, ((android.graphics.Paint) (null)));
	//   29   55:aload_0         
	//   30   56:getfield        #38  <Field WebView mMessageWebView>
	//   31   59:iconst_2        
	//   32   60:aconst_null     
	//   33   61:invokevirtual   #75  <Method void WebView.setLayerType(int, android.graphics.Paint)>
				mMessageWebView.setBackgroundColor(0);
	//   34   64:aload_0         
	//   35   65:getfield        #38  <Field WebView mMessageWebView>
	//   36   68:iconst_0        
	//   37   69:invokevirtual   #79  <Method void WebView.setBackgroundColor(int)>
				mMessageWebView.setWebChromeClient(((WebChromeClient) (new WebChromeClient() {

					public boolean onConsoleMessage(ConsoleMessage consolemessage)
					{
						String s = AppboyInAppMessageHtmlFullView.TAG;
					//    0    0:invokestatic    #25  <Method String AppboyInAppMessageHtmlFullView.access$000()>
					//    1    3:astore_2        
						StringBuilder stringbuilder = new StringBuilder();
					//    2    4:new             #27  <Class StringBuilder>
					//    3    7:dup             
					//    4    8:invokespecial   #28  <Method void StringBuilder()>
					//    5   11:astore_3        
						stringbuilder.append("Html In-app log. Line: ");
					//    6   12:aload_3         
					//    7   13:ldc1            #30  <String "Html In-app log. Line: ">
					//    8   15:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
					//    9   18:pop             
						stringbuilder.append(consolemessage.lineNumber());
					//   10   19:aload_3         
					//   11   20:aload_1         
					//   12   21:invokevirtual   #40  <Method int ConsoleMessage.lineNumber()>
					//   13   24:invokevirtual   #43  <Method StringBuilder StringBuilder.append(int)>
					//   14   27:pop             
						stringbuilder.append(". SourceId: ");
					//   15   28:aload_3         
					//   16   29:ldc1            #45  <String ". SourceId: ">
					//   17   31:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
					//   18   34:pop             
						stringbuilder.append(consolemessage.sourceId());
					//   19   35:aload_3         
					//   20   36:aload_1         
					//   21   37:invokevirtual   #48  <Method String ConsoleMessage.sourceId()>
					//   22   40:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
					//   23   43:pop             
						stringbuilder.append(". Log Level: ");
					//   24   44:aload_3         
					//   25   45:ldc1            #50  <String ". Log Level: ">
					//   26   47:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
					//   27   50:pop             
						stringbuilder.append(((Object) (consolemessage.messageLevel())));
					//   28   51:aload_3         
					//   29   52:aload_1         
					//   30   53:invokevirtual   #54  <Method android.webkit.ConsoleMessage$MessageLevel ConsoleMessage.messageLevel()>
					//   31   56:invokevirtual   #57  <Method StringBuilder StringBuilder.append(Object)>
					//   32   59:pop             
						stringbuilder.append(". Message: ");
					//   33   60:aload_3         
					//   34   61:ldc1            #59  <String ". Message: ">
					//   35   63:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
					//   36   66:pop             
						stringbuilder.append(consolemessage.message());
					//   37   67:aload_3         
					//   38   68:aload_1         
					//   39   69:invokevirtual   #62  <Method String ConsoleMessage.message()>
					//   40   72:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
					//   41   75:pop             
						AppboyLogger.d(s, stringbuilder.toString());
					//   42   76:aload_2         
					//   43   77:aload_3         
					//   44   78:invokevirtual   #65  <Method String StringBuilder.toString()>
					//   45   81:invokestatic    #71  <Method int AppboyLogger.d(String, String)>
					//   46   84:pop             
						return true;
					//   47   85:iconst_1        
					//   48   86:ireturn         
					}

					final AppboyInAppMessageHtmlFullView this$0;

			
			{
				this$0 = AppboyInAppMessageHtmlFullView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field AppboyInAppMessageHtmlFullView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebChromeClient()>
			//    5    9:return          
			}
				}
)));
	//   38   72:aload_0         
	//   39   73:getfield        #38  <Field WebView mMessageWebView>
	//   40   76:new             #6   <Class AppboyInAppMessageHtmlFullView$1>
	//   41   79:dup             
	//   42   80:aload_0         
	//   43   81:invokespecial   #82  <Method void AppboyInAppMessageHtmlFullView$1(AppboyInAppMessageHtmlFullView)>
	//   44   84:invokevirtual   #86  <Method void WebView.setWebChromeClient(WebChromeClient)>
				mMessageWebView.addJavascriptInterface(((Object) (new AppboyInAppMessageHtmlJavascriptInterface(getContext()))), "appboyInternalBridge");
	//   45   87:aload_0         
	//   46   88:getfield        #38  <Field WebView mMessageWebView>
	//   47   91:new             #88  <Class AppboyInAppMessageHtmlJavascriptInterface>
	//   48   94:dup             
	//   49   95:aload_0         
	//   50   96:invokevirtual   #92  <Method Context getContext()>
	//   51   99:invokespecial   #95  <Method void AppboyInAppMessageHtmlJavascriptInterface(Context)>
	//   52  102:ldc1            #10  <String "appboyInternalBridge">
	//   53  104:invokevirtual   #99  <Method void WebView.addJavascriptInterface(Object, String)>
			}
		}
		return mMessageWebView;
	//   54  107:aload_0         
	//   55  108:getfield        #38  <Field WebView mMessageWebView>
	//   56  111:areturn         
	}

	public static final String APPBOY_BRIDGE_PREFIX = "appboyInternalBridge";
	private static final String TAG = AppboyLogger.getAppboyLogTag(com/appboy/ui/inappmessage/views/AppboyInAppMessageHtmlFullView);
	private WebView mMessageWebView;

	static 
	{
	//    0    0:ldc1            #2   <Class AppboyInAppMessageHtmlFullView>
	//    1    2:invokestatic    #21  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #23  <Field String TAG>
	//*   3    8:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #23  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
