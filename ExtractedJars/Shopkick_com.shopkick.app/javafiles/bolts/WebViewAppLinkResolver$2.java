// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.net.Uri;
import android.webkit.*;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package bolts:
//			Continuation, WebViewAppLinkResolver, TaskCompletionSource, Capture, 
//			Task

class WebViewAppLinkResolver$2
	implements Continuation
{

	public Task then(Task task)
		throws Exception
	{
		final TaskCompletionSource tcs = new TaskCompletionSource();
	//    0    0:new             #43  <Class TaskCompletionSource>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void TaskCompletionSource()>
	//    3    7:astore_2        
		WebView webview = new WebView(WebViewAppLinkResolver.access$200(WebViewAppLinkResolver.this));
	//    4    8:new             #46  <Class WebView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field WebViewAppLinkResolver this$0>
	//    8   16:invokestatic    #50  <Method android.content.Context WebViewAppLinkResolver.access$200(WebViewAppLinkResolver)>
	//    9   19:invokespecial   #53  <Method void WebView(android.content.Context)>
	//   10   22:astore_3        
		webview.getSettings().setJavaScriptEnabled(true);
	//   11   23:aload_3         
	//   12   24:invokevirtual   #57  <Method WebSettings WebView.getSettings()>
	//   13   27:iconst_1        
	//   14   28:invokevirtual   #63  <Method void WebSettings.setJavaScriptEnabled(boolean)>
		webview.setNetworkAvailable(false);
	//   15   31:aload_3         
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #66  <Method void WebView.setNetworkAvailable(boolean)>
		webview.setWebViewClient(((WebViewClient) (new WebViewClient() {

			private void runJavaScript(WebView webview1)
			{
				if(!loaded)
			//*   0    0:aload_0         
			//*   1    1:getfield        #22  <Field boolean loaded>
			//*   2    4:ifne            18
				{
					loaded = true;
			//    3    7:aload_0         
			//    4    8:iconst_1        
			//    5    9:putfield        #22  <Field boolean loaded>
					webview1.loadUrl("javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())");
			//    6   12:aload_1         
			//    7   13:ldc1            #27  <String "javascript:boltsWebViewAppLinkResolverResult.setValue((function() {  var metaTags = document.getElementsByTagName('meta');  var results = [];  for (var i = 0; i < metaTags.length; i++) {    var property = metaTags[i].getAttribute('property');    if (property && property.substring(0, 'al:'.length) === 'al:') {      var tag = { \"property\": metaTags[i].getAttribute('property') };      if (metaTags[i].hasAttribute('content')) {        tag['content'] = metaTags[i].getAttribute('content');      }      results.push(tag);    }  }  return JSON.stringify(results);})())">
			//    8   15:invokevirtual   #33  <Method void WebView.loadUrl(String)>
				}
			//    9   18:return          
			}

			public void onLoadResource(WebView webview1, String s)
			{
				super.onLoadResource(webview1, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #37  <Method void WebViewClient.onLoadResource(WebView, String)>
				runJavaScript(webview1);
			//    4    6:aload_0         
			//    5    7:aload_1         
			//    6    8:invokespecial   #39  <Method void runJavaScript(WebView)>
			//    7   11:return          
			}

			public void onPageFinished(WebView webview1, String s)
			{
				super.onPageFinished(webview1, s);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokespecial   #42  <Method void WebViewClient.onPageFinished(WebView, String)>
				runJavaScript(webview1);
			//    4    6:aload_0         
			//    5    7:aload_1         
			//    6    8:invokespecial   #39  <Method void runJavaScript(WebView)>
			//    7   11:return          
			}

			private boolean loaded;
			final WebViewAppLinkResolver._cls2 this$1;

			
			{
				this$1 = WebViewAppLinkResolver._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewAppLinkResolver$2 this$1>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void WebViewClient()>
				loaded = false;
			//    5    9:aload_0         
			//    6   10:iconst_0        
			//    7   11:putfield        #22  <Field boolean loaded>
			//    8   14:return          
			}
		}
)));
	//   18   36:aload_3         
	//   19   37:new             #14  <Class WebViewAppLinkResolver$2$1>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #69  <Method void WebViewAppLinkResolver$2$1(WebViewAppLinkResolver$2)>
	//   23   45:invokevirtual   #73  <Method void WebView.setWebViewClient(WebViewClient)>
		webview.addJavascriptInterface(((Object) (new Object() {

			public void setValue(String s)
			{
				try
				{
					tcs.trySetResult(((Object) (new JSONArray(s))));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field TaskCompletionSource val$tcs>
			//    2    4:new             #30  <Class JSONArray>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #32  <Method void JSONArray(String)>
			//    6   12:invokevirtual   #38  <Method boolean TaskCompletionSource.trySetResult(Object)>
			//    7   15:pop             
					return;
			//    8   16:return          
				}
				// Misplaced declaration of an exception variable
				catch(String s)
			//*   9   17:astore_1        
				{
					tcs.trySetError(((Exception) (s)));
			//   10   18:aload_0         
			//   11   19:getfield        #19  <Field TaskCompletionSource val$tcs>
			//   12   22:aload_1         
			//   13   23:invokevirtual   #42  <Method boolean TaskCompletionSource.trySetError(Exception)>
			//   14   26:pop             
				}
			//   15   27:return          
			}

			final WebViewAppLinkResolver._cls2 this$1;
			final TaskCompletionSource val$tcs;

			
			{
				this$1 = WebViewAppLinkResolver._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewAppLinkResolver$2 this$1>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field TaskCompletionSource val$tcs>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void Object()>
			//    8   14:return          
			}
		}
)), "boltsWebViewAppLinkResolverResult");
	//   24   48:aload_3         
	//   25   49:new             #16  <Class WebViewAppLinkResolver$2$2>
	//   26   52:dup             
	//   27   53:aload_0         
	//   28   54:aload_2         
	//   29   55:invokespecial   #76  <Method void WebViewAppLinkResolver$2$2(WebViewAppLinkResolver$2, TaskCompletionSource)>
	//   30   58:ldc1            #78  <String "boltsWebViewAppLinkResolverResult">
	//   31   60:invokevirtual   #82  <Method void WebView.addJavascriptInterface(Object, String)>
		if(val$contentType.get() != null)
	//*  32   63:aload_0         
	//*  33   64:getfield        #29  <Field Capture val$contentType>
	//*  34   67:invokevirtual   #88  <Method Object Capture.get()>
	//*  35   70:ifnull          94
			task = ((Task) (((String)val$contentType.get()).split(";")[0]));
	//   36   73:aload_0         
	//   37   74:getfield        #29  <Field Capture val$contentType>
	//   38   77:invokevirtual   #88  <Method Object Capture.get()>
	//   39   80:checkcast       #90  <Class String>
	//   40   83:ldc1            #92  <String ";">
	//   41   85:invokevirtual   #96  <Method String[] String.split(String)>
	//   42   88:iconst_0        
	//   43   89:aaload          
	//   44   90:astore_1        
		else
	//*  45   91:goto            96
			task = null;
	//   46   94:aconst_null     
	//   47   95:astore_1        
		webview.loadDataWithBaseURL(val$url.toString(), (String)val$content.get(), ((String) (task)), ((String) (null)), ((String) (null)));
	//   48   96:aload_3         
	//   49   97:aload_0         
	//   50   98:getfield        #31  <Field Uri val$url>
	//   51  101:invokevirtual   #102 <Method String Uri.toString()>
	//   52  104:aload_0         
	//   53  105:getfield        #33  <Field Capture val$content>
	//   54  108:invokevirtual   #88  <Method Object Capture.get()>
	//   55  111:checkcast       #90  <Class String>
	//   56  114:aload_1         
	//   57  115:aconst_null     
	//   58  116:aconst_null     
	//   59  117:invokevirtual   #106 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
		return tcs.getTask();
	//   60  120:aload_2         
	//   61  121:invokevirtual   #110 <Method Task TaskCompletionSource.getTask()>
	//   62  124:areturn         
	}

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #116 <Method Task then(Task)>
	//    3    5:areturn         
	}

	final WebViewAppLinkResolver this$0;
	final Capture val$content;
	final Capture val$contentType;
	final Uri val$url;

	WebViewAppLinkResolver$2()
	{
		this$0 = final_webviewapplinkresolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field WebViewAppLinkResolver this$0>
		val$contentType = capture;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field Capture val$contentType>
		val$url = uri;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field Uri val$url>
		val$content = Capture.this;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #33  <Field Capture val$content>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #36  <Method void Object()>
	//   14   25:return          
	}
}
