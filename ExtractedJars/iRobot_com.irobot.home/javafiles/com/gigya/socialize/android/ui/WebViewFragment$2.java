// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.ui;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.log.GigyaLog;

// Referenced classes of package com.gigya.socialize.android.ui:
//			WebViewFragment

class WebViewFragment$2 extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		if(getShowsDialog() && !WebViewFragment.access$100(WebViewFragment.this))
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field WebViewFragment this$0>
	//*   2    4:invokevirtual   #25  <Method boolean WebViewFragment.getShowsDialog()>
	//*   3    7:ifeq            28
	//*   4   10:aload_0         
	//*   5   11:getfield        #15  <Field WebViewFragment this$0>
	//*   6   14:invokestatic    #29  <Method boolean WebViewFragment.access$100(WebViewFragment)>
	//*   7   17:ifne            28
			WebViewFragment.access$200(WebViewFragment.this, webview);
	//    8   20:aload_0         
	//    9   21:getfield        #15  <Field WebViewFragment this$0>
	//   10   24:aload_1         
	//   11   25:invokestatic    #33  <Method void WebViewFragment.access$200(WebViewFragment, WebView)>
		WebViewFragment.access$000(WebViewFragment.this).setVisibility(4);
	//   12   28:aload_0         
	//   13   29:getfield        #15  <Field WebViewFragment this$0>
	//   14   32:invokestatic    #37  <Method ProgressBar WebViewFragment.access$000(WebViewFragment)>
	//   15   35:iconst_4        
	//   16   36:invokevirtual   #43  <Method void ProgressBar.setVisibility(int)>
	//   17   39:return          
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		if(GSAPI.OPTION_TRACE)
	//*   0    0:getstatic       #51  <Field boolean GSAPI.OPTION_TRACE>
	//*   1    3:ifeq            36
		{
			webview = ((WebView) (new StringBuilder()));
	//    2    6:new             #53  <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #54  <Method void StringBuilder()>
	//    5   13:astore_1        
			((StringBuilder) (webview)).append("Navigating to ");
	//    6   14:aload_1         
	//    7   15:ldc1            #56  <String "Navigating to ">
	//    8   17:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			((StringBuilder) (webview)).append(s);
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			GigyaLog.d("GigyaWebViewFragment", ((StringBuilder) (webview)).toString());
	//   14   27:ldc1            #62  <String "GigyaWebViewFragment">
	//   15   29:aload_1         
	//   16   30:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   17   33:invokestatic    #72  <Method void GigyaLog.d(String, String)>
		}
		WebViewFragment.access$000(WebViewFragment.this).setVisibility(0);
	//   18   36:aload_0         
	//   19   37:getfield        #15  <Field WebViewFragment this$0>
	//   20   40:invokestatic    #37  <Method ProgressBar WebViewFragment.access$000(WebViewFragment)>
	//   21   43:iconst_0        
	//   22   44:invokevirtual   #43  <Method void ProgressBar.setVisibility(int)>
	//   23   47:return          
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		super.onReceivedError(webview, i, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #76  <Method void WebViewClient.onReceivedError(WebView, int, String, String)>
		webview = ((WebView) (new GSObject()));
	//    6    9:new             #78  <Class GSObject>
	//    7   12:dup             
	//    8   13:invokespecial   #79  <Method void GSObject()>
	//    9   16:astore_1        
		((GSObject) (webview)).put("errorCode", i);
	//   10   17:aload_1         
	//   11   18:ldc1            #81  <String "errorCode">
	//   12   20:iload_2         
	//   13   21:invokevirtual   #85  <Method void GSObject.put(String, int)>
		((GSObject) (webview)).put("description", s);
	//   14   24:aload_1         
	//   15   25:ldc1            #87  <String "description">
	//   16   27:aload_3         
	//   17   28:invokevirtual   #89  <Method void GSObject.put(String, String)>
		((GSObject) (webview)).put("failingUrl", s1);
	//   18   31:aload_1         
	//   19   32:ldc1            #91  <String "failingUrl">
	//   20   34:aload           4
	//   21   36:invokevirtual   #89  <Method void GSObject.put(String, String)>
		finish(((GSObject) (webview)));
	//   22   39:aload_0         
	//   23   40:getfield        #15  <Field WebViewFragment this$0>
	//   24   43:aload_1         
	//   25   44:invokevirtual   #95  <Method void WebViewFragment.finish(GSObject)>
	//   26   47:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		if(s.startsWith(WebViewFragment.access$300(WebViewFragment.this)))
	//*   0    0:aload_2         
	//*   1    1:aload_0         
	//*   2    2:getfield        #15  <Field WebViewFragment this$0>
	//*   3    5:invokestatic    #101 <Method String WebViewFragment.access$300(WebViewFragment)>
	//*   4    8:invokevirtual   #107 <Method boolean String.startsWith(String)>
	//*   5   11:ifeq            44
		{
			webview = ((WebView) (new GSObject()));
	//    6   14:new             #78  <Class GSObject>
	//    7   17:dup             
	//    8   18:invokespecial   #79  <Method void GSObject()>
	//    9   21:astore_1        
			((GSObject) (webview)).parseURL(s.replace("gsapi", "http"));
	//   10   22:aload_1         
	//   11   23:aload_2         
	//   12   24:ldc1            #109 <String "gsapi">
	//   13   26:ldc1            #111 <String "http">
	//   14   28:invokevirtual   #115 <Method String String.replace(CharSequence, CharSequence)>
	//   15   31:invokevirtual   #119 <Method void GSObject.parseURL(String)>
			finish(((GSObject) (webview)));
	//   16   34:aload_0         
	//   17   35:getfield        #15  <Field WebViewFragment this$0>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #95  <Method void WebViewFragment.finish(GSObject)>
			return true;
	//   20   42:iconst_1        
	//   21   43:ireturn         
		} else
		{
			return false;
	//   22   44:iconst_0        
	//   23   45:ireturn         
		}
	}

	final WebViewFragment this$0;

	WebViewFragment$2()
	{
		this$0 = WebViewFragment.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field WebViewFragment this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void WebViewClient()>
	//    5    9:return          
	}
}
