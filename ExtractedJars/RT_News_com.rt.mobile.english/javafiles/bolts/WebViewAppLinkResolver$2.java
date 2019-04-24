// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bolts;

import android.net.Uri;
import android.webkit.*;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package bolts:
//			Continuation, WebViewAppLinkResolver, Task, Capture

class WebViewAppLinkResolver$2
	implements Continuation
{

	public Task then(Task task)
		throws Exception
	{
		final  tcs = Task.create();
	//    0    0:invokestatic    #47  <Method Task$TaskCompletionSource Task.create()>
	//    1    3:astore_2        
		WebView webview = new WebView(WebViewAppLinkResolver.access$200(WebViewAppLinkResolver.this));
	//    2    4:new             #49  <Class WebView>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #27  <Field WebViewAppLinkResolver this$0>
	//    6   12:invokestatic    #53  <Method android.content.Context WebViewAppLinkResolver.access$200(WebViewAppLinkResolver)>
	//    7   15:invokespecial   #56  <Method void WebView(android.content.Context)>
	//    8   18:astore_3        
		webview.getSettings().setJavaScriptEnabled(true);
	//    9   19:aload_3         
	//   10   20:invokevirtual   #60  <Method WebSettings WebView.getSettings()>
	//   11   23:iconst_1        
	//   12   24:invokevirtual   #66  <Method void WebSettings.setJavaScriptEnabled(boolean)>
		webview.setNetworkAvailable(false);
	//   13   27:aload_3         
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #69  <Method void WebView.setNetworkAvailable(boolean)>
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
	//   16   32:aload_3         
	//   17   33:new             #14  <Class WebViewAppLinkResolver$2$1>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokespecial   #72  <Method void WebViewAppLinkResolver$2$1(WebViewAppLinkResolver$2)>
	//   21   41:invokevirtual   #76  <Method void WebView.setWebViewClient(WebViewClient)>
		webview.addJavascriptInterface(((Object) (new Object() {

			public void setValue(String s)
			{
				try
				{
					tcs.trySetResult(((Object) (new JSONArray(s))));
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field Task$TaskCompletionSource val$tcs>
			//    2    4:new             #30  <Class JSONArray>
			//    3    7:dup             
			//    4    8:aload_1         
			//    5    9:invokespecial   #32  <Method void JSONArray(String)>
			//    6   12:invokevirtual   #38  <Method boolean Task$TaskCompletionSource.trySetResult(Object)>
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
			//   11   19:getfield        #19  <Field Task$TaskCompletionSource val$tcs>
			//   12   22:aload_1         
			//   13   23:invokevirtual   #42  <Method boolean Task$TaskCompletionSource.trySetError(Exception)>
			//   14   26:pop             
				}
			//   15   27:return          
			}

			final WebViewAppLinkResolver._cls2 this$1;
			final Task.TaskCompletionSource val$tcs;

			
			{
				this$1 = WebViewAppLinkResolver._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewAppLinkResolver$2 this$1>
				tcs = taskcompletionsource;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Task$TaskCompletionSource val$tcs>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void Object()>
			//    8   14:return          
			}
		}
)), "boltsWebViewAppLinkResolverResult");
	//   22   44:aload_3         
	//   23   45:new             #16  <Class WebViewAppLinkResolver$2$2>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:aload_2         
	//   27   51:invokespecial   #79  <Method void WebViewAppLinkResolver$2$2(WebViewAppLinkResolver$2, Task$TaskCompletionSource)>
	//   28   54:ldc1            #81  <String "boltsWebViewAppLinkResolverResult">
	//   29   56:invokevirtual   #85  <Method void WebView.addJavascriptInterface(Object, String)>
		if(val$contentType.get() != null)
	//*  30   59:aload_0         
	//*  31   60:getfield        #29  <Field Capture val$contentType>
	//*  32   63:invokevirtual   #91  <Method Object Capture.get()>
	//*  33   66:ifnull          90
			task = ((Task) (((String)val$contentType.get()).split(";")[0]));
	//   34   69:aload_0         
	//   35   70:getfield        #29  <Field Capture val$contentType>
	//   36   73:invokevirtual   #91  <Method Object Capture.get()>
	//   37   76:checkcast       #93  <Class String>
	//   38   79:ldc1            #95  <String ";">
	//   39   81:invokevirtual   #99  <Method String[] String.split(String)>
	//   40   84:iconst_0        
	//   41   85:aaload          
	//   42   86:astore_1        
		else
	//*  43   87:goto            92
			task = null;
	//   44   90:aconst_null     
	//   45   91:astore_1        
		webview.loadDataWithBaseURL(val$url.toString(), (String)val$content.get(), ((String) (task)), ((String) (null)), ((String) (null)));
	//   46   92:aload_3         
	//   47   93:aload_0         
	//   48   94:getfield        #31  <Field Uri val$url>
	//   49   97:invokevirtual   #105 <Method String Uri.toString()>
	//   50  100:aload_0         
	//   51  101:getfield        #33  <Field Capture val$content>
	//   52  104:invokevirtual   #91  <Method Object Capture.get()>
	//   53  107:checkcast       #93  <Class String>
	//   54  110:aload_1         
	//   55  111:aconst_null     
	//   56  112:aconst_null     
	//   57  113:invokevirtual   #109 <Method void WebView.loadDataWithBaseURL(String, String, String, String, String)>
		return tcs.getTask();
	//   58  116:aload_2         
	//   59  117:invokevirtual   #115 <Method Task Task$TaskCompletionSource.getTask()>
	//   60  120:areturn         
	}

	public volatile Object then(Task task)
		throws Exception
	{
		return ((Object) (then(task)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #121 <Method Task then(Task)>
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
