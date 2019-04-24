// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.app.*;
import android.util.SparseArray;
import android.view.*;
import android.webkit.*;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.gigya.socialize.GSObject;
import com.gigya.socialize.android.GSAPI;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.login.providers.PostRequest;
import org.apache.http.util.EncodingUtils;

public class WebViewFragment extends DialogFragment
{
	public static interface WebViewFragmentHandler
	{

		public abstract void onResult(GSObject gsobject);
	}


	public WebViewFragment()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void DialogFragment()>
		webViewWrapContent = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #44  <Field boolean webViewWrapContent>
	//    5    9:return          
	}

	public static WebViewFragment create(FragmentActivity fragmentactivity, String s, String s1, PostRequest postrequest, String s2, WebViewFragmentHandler webviewfragmenthandler, Boolean boolean1)
	{
		WebViewFragment webviewfragment = new WebViewFragment();
	//    0    0:new             #2   <Class WebViewFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void WebViewFragment()>
	//    3    7:astore          8
		webviewfragment.title = s1;
	//    4    9:aload           8
	//    5   11:aload_2         
	//    6   12:putfield        #75  <Field String title>
		webviewfragment.url = postrequest.url;
	//    7   15:aload           8
	//    8   17:aload_3         
	//    9   18:getfield        #79  <Field String PostRequest.url>
	//   10   21:putfield        #80  <Field String url>
		webviewfragment.body = postrequest.body;
	//   11   24:aload           8
	//   12   26:aload_3         
	//   13   27:getfield        #82  <Field String PostRequest.body>
	//   14   30:putfield        #83  <Field String body>
		webviewfragment.resultPrefix = s2;
	//   15   33:aload           8
	//   16   35:aload           4
	//   17   37:putfield        #60  <Field String resultPrefix>
		webviewfragment.tag = s;
	//   18   40:aload           8
	//   19   42:aload_1         
	//   20   43:putfield        #85  <Field String tag>
		webviewfragment.isTransparent = boolean1.booleanValue();
	//   21   46:aload           8
	//   22   48:aload           6
	//   23   50:invokevirtual   #91  <Method boolean Boolean.booleanValue()>
	//   24   53:putfield        #93  <Field boolean isTransparent>
		int i = ((Object) (webviewfragmenthandler)).hashCode();
	//   25   56:aload           5
	//   26   58:invokevirtual   #99  <Method int Object.hashCode()>
	//   27   61:istore          7
		handlers.put(i, ((Object) (webviewfragmenthandler)));
	//   28   63:getstatic       #40  <Field SparseArray handlers>
	//   29   66:iload           7
	//   30   68:aload           5
	//   31   70:invokevirtual   #103 <Method void SparseArray.put(int, Object)>
		webviewfragment.handlerId = i;
	//   32   73:aload           8
	//   33   75:iload           7
	//   34   77:putfield        #105 <Field int handlerId>
		fragmentactivity = ((FragmentActivity) (fragmentactivity.getSupportFragmentManager().beginTransaction()));
	//   35   80:aload_0         
	//   36   81:invokevirtual   #111 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   37   84:invokevirtual   #117 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   38   87:astore_0        
		((FragmentTransaction) (fragmentactivity)).add(((android.support.v4.app.Fragment) (webviewfragment)), s);
	//   39   88:aload_0         
	//   40   89:aload           8
	//   41   91:aload_1         
	//   42   92:invokevirtual   #123 <Method FragmentTransaction FragmentTransaction.add(android.support.v4.app.Fragment, String)>
	//   43   95:pop             
		((FragmentTransaction) (fragmentactivity)).commit();
	//   44   96:aload_0         
	//   45   97:invokevirtual   #126 <Method int FragmentTransaction.commit()>
	//   46  100:pop             
		return webviewfragment;
	//   47  101:aload           8
	//   48  103:areturn         
	}

	public static WebViewFragment create(FragmentActivity fragmentactivity, String s, String s1, String s2, String s3, WebViewFragmentHandler webviewfragmenthandler, Boolean boolean1)
	{
		WebViewFragment webviewfragment = new WebViewFragment();
	//    0    0:new             #2   <Class WebViewFragment>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void WebViewFragment()>
	//    3    7:astore          8
		webviewfragment.title = s1;
	//    4    9:aload           8
	//    5   11:aload_2         
	//    6   12:putfield        #75  <Field String title>
		webviewfragment.url = s2;
	//    7   15:aload           8
	//    8   17:aload_3         
	//    9   18:putfield        #80  <Field String url>
		webviewfragment.resultPrefix = s3;
	//   10   21:aload           8
	//   11   23:aload           4
	//   12   25:putfield        #60  <Field String resultPrefix>
		webviewfragment.tag = s;
	//   13   28:aload           8
	//   14   30:aload_1         
	//   15   31:putfield        #85  <Field String tag>
		webviewfragment.isTransparent = boolean1.booleanValue();
	//   16   34:aload           8
	//   17   36:aload           6
	//   18   38:invokevirtual   #91  <Method boolean Boolean.booleanValue()>
	//   19   41:putfield        #93  <Field boolean isTransparent>
		int i = ((Object) (webviewfragmenthandler)).hashCode();
	//   20   44:aload           5
	//   21   46:invokevirtual   #99  <Method int Object.hashCode()>
	//   22   49:istore          7
		handlers.put(i, ((Object) (webviewfragmenthandler)));
	//   23   51:getstatic       #40  <Field SparseArray handlers>
	//   24   54:iload           7
	//   25   56:aload           5
	//   26   58:invokevirtual   #103 <Method void SparseArray.put(int, Object)>
		webviewfragment.handlerId = i;
	//   27   61:aload           8
	//   28   63:iload           7
	//   29   65:putfield        #105 <Field int handlerId>
		fragmentactivity = ((FragmentActivity) (fragmentactivity.getSupportFragmentManager().beginTransaction()));
	//   30   68:aload_0         
	//   31   69:invokevirtual   #111 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   32   72:invokevirtual   #117 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   33   75:astore_0        
		((FragmentTransaction) (fragmentactivity)).add(((android.support.v4.app.Fragment) (webviewfragment)), s);
	//   34   76:aload_0         
	//   35   77:aload           8
	//   36   79:aload_1         
	//   37   80:invokevirtual   #123 <Method FragmentTransaction FragmentTransaction.add(android.support.v4.app.Fragment, String)>
	//   38   83:pop             
		((FragmentTransaction) (fragmentactivity)).commit();
	//   39   84:aload_0         
	//   40   85:invokevirtual   #126 <Method int FragmentTransaction.commit()>
	//   41   88:pop             
		return webviewfragment;
	//   42   89:aload           8
	//   43   91:areturn         
	}

	private Display getDisplay()
	{
		FragmentActivity fragmentactivity = getActivity();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method FragmentActivity getActivity()>
	//    2    4:astore_1        
		if(fragmentactivity == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return ((WindowManager)((Activity) (fragmentactivity)).getSystemService("window")).getDefaultDisplay();
	//    7   11:aload_1         
	//    8   12:ldc1            #133 <String "window">
	//    9   14:invokevirtual   #139 <Method Object Activity.getSystemService(String)>
	//   10   17:checkcast       #141 <Class WindowManager>
	//   11   20:invokeinterface #144 <Method Display WindowManager.getDefaultDisplay()>
	//   12   25:areturn         
	}

	private void redrawWebViewInDialog(WebView webview1)
	{
		Display display = getDisplay();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method Display getDisplay()>
	//    2    4:astore_2        
		if(display == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       10
		{
			return;
	//    5    9:return          
		} else
		{
			webview1.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams((Math.min(display.getWidth(), display.getHeight()) * 9) / 10, -2))));
	//    6   10:aload_1         
	//    7   11:new             #146 <Class android.widget.FrameLayout$LayoutParams>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokevirtual   #151 <Method int Display.getWidth()>
	//   11   19:aload_2         
	//   12   20:invokevirtual   #154 <Method int Display.getHeight()>
	//   13   23:invokestatic    #160 <Method int Math.min(int, int)>
	//   14   26:bipush          9
	//   15   28:imul            
	//   16   29:bipush          10
	//   17   31:idiv            
	//   18   32:bipush          -2
	//   19   34:invokespecial   #163 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   20   37:invokevirtual   #169 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			webViewWrapContent = true;
	//   21   40:aload_0         
	//   22   41:iconst_1        
	//   23   42:putfield        #44  <Field boolean webViewWrapContent>
			return;
	//   24   45:return          
		}
	}

	private void restoreInstanceState(Bundle bundle)
	{
		url = bundle.getString("url");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #172 <String "url">
	//    3    4:invokevirtual   #178 <Method String Bundle.getString(String)>
	//    4    7:putfield        #80  <Field String url>
		isTransparent = bundle.getBoolean("isTransparent");
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:ldc1            #179 <String "isTransparent">
	//    8   14:invokevirtual   #183 <Method boolean Bundle.getBoolean(String)>
	//    9   17:putfield        #93  <Field boolean isTransparent>
		title = bundle.getString("title");
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:ldc1            #184 <String "title">
	//   13   24:invokevirtual   #178 <Method String Bundle.getString(String)>
	//   14   27:putfield        #75  <Field String title>
		tag = bundle.getString("tag");
	//   15   30:aload_0         
	//   16   31:aload_1         
	//   17   32:ldc1            #185 <String "tag">
	//   18   34:invokevirtual   #178 <Method String Bundle.getString(String)>
	//   19   37:putfield        #85  <Field String tag>
		resultPrefix = bundle.getString("resultPrefix");
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:ldc1            #186 <String "resultPrefix">
	//   23   44:invokevirtual   #178 <Method String Bundle.getString(String)>
	//   24   47:putfield        #60  <Field String resultPrefix>
		handlerId = bundle.getInt("handlerId");
	//   25   50:aload_0         
	//   26   51:aload_1         
	//   27   52:ldc1            #187 <String "handlerId">
	//   28   54:invokevirtual   #191 <Method int Bundle.getInt(String)>
	//   29   57:putfield        #105 <Field int handlerId>
	//   30   60:return          
	}

	public void finish(GSObject gsobject)
	{
		if(GSAPI.OPTION_TRACE)
	//*   0    0:getstatic       #198 <Field boolean GSAPI.OPTION_TRACE>
	//*   1    3:ifeq            39
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    2    6:new             #200 <Class StringBuilder>
	//    3    9:dup             
	//    4   10:invokespecial   #201 <Method void StringBuilder()>
	//    5   13:astore_2        
			stringbuilder.append("Finished with result: ");
	//    6   14:aload_2         
	//    7   15:ldc1            #203 <String "Finished with result: ">
	//    8   17:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//    9   20:pop             
			stringbuilder.append(gsobject.toJsonString());
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #213 <Method String GSObject.toJsonString()>
	//   13   26:invokevirtual   #207 <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
			GigyaLog.d("GigyaWebViewFragment", stringbuilder.toString());
	//   15   30:ldc1            #215 <String "GigyaWebViewFragment">
	//   16   32:aload_2         
	//   17   33:invokevirtual   #218 <Method String StringBuilder.toString()>
	//   18   36:invokestatic    #224 <Method void GigyaLog.d(String, String)>
		}
		((WebViewFragmentHandler)handlers.get(handlerId)).onResult(gsobject);
	//   19   39:getstatic       #40  <Field SparseArray handlers>
	//   20   42:aload_0         
	//   21   43:getfield        #105 <Field int handlerId>
	//   22   46:invokevirtual   #228 <Method Object SparseArray.get(int)>
	//   23   49:checkcast       #12  <Class WebViewFragment$WebViewFragmentHandler>
	//   24   52:aload_1         
	//   25   53:invokeinterface #231 <Method void WebViewFragment$WebViewFragmentHandler.onResult(GSObject)>
		gsobject = ((GSObject) (getActivity().getSupportFragmentManager().beginTransaction()));
	//   26   58:aload_0         
	//   27   59:invokevirtual   #131 <Method FragmentActivity getActivity()>
	//   28   62:invokevirtual   #111 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   29   65:invokevirtual   #117 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//   30   68:astore_1        
		((FragmentTransaction) (gsobject)).remove(((android.support.v4.app.Fragment) (this)));
	//   31   69:aload_1         
	//   32   70:aload_0         
	//   33   71:invokevirtual   #235 <Method FragmentTransaction FragmentTransaction.remove(android.support.v4.app.Fragment)>
	//   34   74:pop             
		((FragmentTransaction) (gsobject)).commitAllowingStateLoss();
	//   35   75:aload_1         
	//   36   76:invokevirtual   #238 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   37   79:pop             
		getActivity().getSupportFragmentManager().executePendingTransactions();
	//   38   80:aload_0         
	//   39   81:invokevirtual   #131 <Method FragmentActivity getActivity()>
	//   40   84:invokevirtual   #111 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//   41   87:invokevirtual   #241 <Method boolean FragmentManager.executePendingTransactions()>
	//   42   90:pop             
	//   43   91:return          
	}

	public void onCancel(DialogInterface dialoginterface)
	{
		getActivity().onBackPressed();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method FragmentActivity getActivity()>
	//    2    4:invokevirtual   #246 <Method void FragmentActivity.onBackPressed()>
		super.onCancel(dialoginterface);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #248 <Method void DialogFragment.onCancel(DialogInterface)>
	//    6   12:return          
	}

	public void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #251 <Method void DialogFragment.onCreate(Bundle)>
		if(bundle != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			restoreInstanceState(bundle);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokespecial   #253 <Method void restoreInstanceState(Bundle)>
		setShowsDialog(isTransparent ^ true);
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #93  <Field boolean isTransparent>
	//   11   19:iconst_1        
	//   12   20:ixor            
	//   13   21:invokevirtual   #257 <Method void setShowsDialog(boolean)>
		webview = new WebView(((android.content.Context) (getActivity())));
	//   14   24:aload_0         
	//   15   25:new             #165 <Class WebView>
	//   16   28:dup             
	//   17   29:aload_0         
	//   18   30:invokevirtual   #131 <Method FragmentActivity getActivity()>
	//   19   33:invokespecial   #260 <Method void WebView(android.content.Context)>
	//   20   36:putfield        #64  <Field WebView webview>
		webview.setVerticalScrollBarEnabled(true);
	//   21   39:aload_0         
	//   22   40:getfield        #64  <Field WebView webview>
	//   23   43:iconst_1        
	//   24   44:invokevirtual   #263 <Method void WebView.setVerticalScrollBarEnabled(boolean)>
		webview.setHorizontalScrollBarEnabled(true);
	//   25   47:aload_0         
	//   26   48:getfield        #64  <Field WebView webview>
	//   27   51:iconst_1        
	//   28   52:invokevirtual   #266 <Method void WebView.setHorizontalScrollBarEnabled(boolean)>
		bundle = ((Bundle) (webview.getSettings()));
	//   29   55:aload_0         
	//   30   56:getfield        #64  <Field WebView webview>
	//   31   59:invokevirtual   #270 <Method WebSettings WebView.getSettings()>
	//   32   62:astore_1        
		((WebSettings) (bundle)).setJavaScriptEnabled(true);
	//   33   63:aload_1         
	//   34   64:iconst_1        
	//   35   65:invokevirtual   #275 <Method void WebSettings.setJavaScriptEnabled(boolean)>
		((WebSettings) (bundle)).setAllowFileAccess(true);
	//   36   68:aload_1         
	//   37   69:iconst_1        
	//   38   70:invokevirtual   #278 <Method void WebSettings.setAllowFileAccess(boolean)>
		((WebSettings) (bundle)).setSupportZoom(true);
	//   39   73:aload_1         
	//   40   74:iconst_1        
	//   41   75:invokevirtual   #281 <Method void WebSettings.setSupportZoom(boolean)>
		((WebSettings) (bundle)).setBuiltInZoomControls(true);
	//   42   78:aload_1         
	//   43   79:iconst_1        
	//   44   80:invokevirtual   #284 <Method void WebSettings.setBuiltInZoomControls(boolean)>
		((WebSettings) (bundle)).setUseWideViewPort(true);
	//   45   83:aload_1         
	//   46   84:iconst_1        
	//   47   85:invokevirtual   #287 <Method void WebSettings.setUseWideViewPort(boolean)>
		webview.setInitialScale(1);
	//   48   88:aload_0         
	//   49   89:getfield        #64  <Field WebView webview>
	//   50   92:iconst_1        
	//   51   93:invokevirtual   #291 <Method void WebView.setInitialScale(int)>
		webview.setFocusable(true);
	//   52   96:aload_0         
	//   53   97:getfield        #64  <Field WebView webview>
	//   54  100:iconst_1        
	//   55  101:invokevirtual   #294 <Method void WebView.setFocusable(boolean)>
		webview.setWebChromeClient(((WebChromeClient) (new WebChromeClient() {

			public boolean onJsAlert(WebView webview1, String s, String s1, JsResult jsresult)
			{
				jsresult.confirm();
			//    0    0:aload           4
			//    1    2:invokevirtual   #26  <Method void JsResult.confirm()>
				return true;
			//    2    5:iconst_1        
			//    3    6:ireturn         
			}

			final WebViewFragment this$0;

			
			{
				this$0 = WebViewFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field WebViewFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void WebChromeClient()>
			//    5    9:return          
			}
		}
)));
	//   56  104:aload_0         
	//   57  105:getfield        #64  <Field WebView webview>
	//   58  108:new             #6   <Class WebViewFragment$1>
	//   59  111:dup             
	//   60  112:aload_0         
	//   61  113:invokespecial   #297 <Method void WebViewFragment$1(WebViewFragment)>
	//   62  116:invokevirtual   #301 <Method void WebView.setWebChromeClient(WebChromeClient)>
		webview.setWebViewClient(((WebViewClient) (new WebViewClient() {

			public void onPageFinished(WebView webview1, String s)
			{
				if(getShowsDialog() && !webViewWrapContent)
			//*   0    0:aload_0         
			//*   1    1:getfield        #15  <Field WebViewFragment this$0>
			//*   2    4:invokevirtual   #25  <Method boolean WebViewFragment.getShowsDialog()>
			//*   3    7:ifeq            28
			//*   4   10:aload_0         
			//*   5   11:getfield        #15  <Field WebViewFragment this$0>
			//*   6   14:invokestatic    #29  <Method boolean WebViewFragment.access$100(WebViewFragment)>
			//*   7   17:ifne            28
					redrawWebViewInDialog(webview1);
			//    8   20:aload_0         
			//    9   21:getfield        #15  <Field WebViewFragment this$0>
			//   10   24:aload_1         
			//   11   25:invokestatic    #33  <Method void WebViewFragment.access$200(WebViewFragment, WebView)>
				progressBar.setVisibility(4);
			//   12   28:aload_0         
			//   13   29:getfield        #15  <Field WebViewFragment this$0>
			//   14   32:invokestatic    #37  <Method ProgressBar WebViewFragment.access$000(WebViewFragment)>
			//   15   35:iconst_4        
			//   16   36:invokevirtual   #43  <Method void ProgressBar.setVisibility(int)>
			//   17   39:return          
			}

			public void onPageStarted(WebView webview1, String s, Bitmap bitmap)
			{
				if(GSAPI.OPTION_TRACE)
			//*   0    0:getstatic       #51  <Field boolean GSAPI.OPTION_TRACE>
			//*   1    3:ifeq            36
				{
					webview1 = ((WebView) (new StringBuilder()));
			//    2    6:new             #53  <Class StringBuilder>
			//    3    9:dup             
			//    4   10:invokespecial   #54  <Method void StringBuilder()>
			//    5   13:astore_1        
					((StringBuilder) (webview1)).append("Navigating to ");
			//    6   14:aload_1         
			//    7   15:ldc1            #56  <String "Navigating to ">
			//    8   17:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
			//    9   20:pop             
					((StringBuilder) (webview1)).append(s);
			//   10   21:aload_1         
			//   11   22:aload_2         
			//   12   23:invokevirtual   #60  <Method StringBuilder StringBuilder.append(String)>
			//   13   26:pop             
					GigyaLog.d("GigyaWebViewFragment", ((StringBuilder) (webview1)).toString());
			//   14   27:ldc1            #62  <String "GigyaWebViewFragment">
			//   15   29:aload_1         
			//   16   30:invokevirtual   #66  <Method String StringBuilder.toString()>
			//   17   33:invokestatic    #72  <Method void GigyaLog.d(String, String)>
				}
				progressBar.setVisibility(0);
			//   18   36:aload_0         
			//   19   37:getfield        #15  <Field WebViewFragment this$0>
			//   20   40:invokestatic    #37  <Method ProgressBar WebViewFragment.access$000(WebViewFragment)>
			//   21   43:iconst_0        
			//   22   44:invokevirtual   #43  <Method void ProgressBar.setVisibility(int)>
			//   23   47:return          
			}

			public void onReceivedError(WebView webview1, int i, String s, String s1)
			{
				super.onReceivedError(webview1, i, s, s1);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:iload_2         
			//    3    3:aload_3         
			//    4    4:aload           4
			//    5    6:invokespecial   #76  <Method void WebViewClient.onReceivedError(WebView, int, String, String)>
				webview1 = ((WebView) (new GSObject()));
			//    6    9:new             #78  <Class GSObject>
			//    7   12:dup             
			//    8   13:invokespecial   #79  <Method void GSObject()>
			//    9   16:astore_1        
				((GSObject) (webview1)).put("errorCode", i);
			//   10   17:aload_1         
			//   11   18:ldc1            #81  <String "errorCode">
			//   12   20:iload_2         
			//   13   21:invokevirtual   #85  <Method void GSObject.put(String, int)>
				((GSObject) (webview1)).put("description", s);
			//   14   24:aload_1         
			//   15   25:ldc1            #87  <String "description">
			//   16   27:aload_3         
			//   17   28:invokevirtual   #89  <Method void GSObject.put(String, String)>
				((GSObject) (webview1)).put("failingUrl", s1);
			//   18   31:aload_1         
			//   19   32:ldc1            #91  <String "failingUrl">
			//   20   34:aload           4
			//   21   36:invokevirtual   #89  <Method void GSObject.put(String, String)>
				finish(((GSObject) (webview1)));
			//   22   39:aload_0         
			//   23   40:getfield        #15  <Field WebViewFragment this$0>
			//   24   43:aload_1         
			//   25   44:invokevirtual   #95  <Method void WebViewFragment.finish(GSObject)>
			//   26   47:return          
			}

			public boolean shouldOverrideUrlLoading(WebView webview1, String s)
			{
				if(s.startsWith(resultPrefix))
			//*   0    0:aload_2         
			//*   1    1:aload_0         
			//*   2    2:getfield        #15  <Field WebViewFragment this$0>
			//*   3    5:invokestatic    #101 <Method String WebViewFragment.access$300(WebViewFragment)>
			//*   4    8:invokevirtual   #107 <Method boolean String.startsWith(String)>
			//*   5   11:ifeq            44
				{
					webview1 = ((WebView) (new GSObject()));
			//    6   14:new             #78  <Class GSObject>
			//    7   17:dup             
			//    8   18:invokespecial   #79  <Method void GSObject()>
			//    9   21:astore_1        
					((GSObject) (webview1)).parseURL(s.replace("gsapi", "http"));
			//   10   22:aload_1         
			//   11   23:aload_2         
			//   12   24:ldc1            #109 <String "gsapi">
			//   13   26:ldc1            #111 <String "http">
			//   14   28:invokevirtual   #115 <Method String String.replace(CharSequence, CharSequence)>
			//   15   31:invokevirtual   #119 <Method void GSObject.parseURL(String)>
					finish(((GSObject) (webview1)));
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
)));
	//   63  119:aload_0         
	//   64  120:getfield        #64  <Field WebView webview>
	//   65  123:new             #8   <Class WebViewFragment$2>
	//   66  126:dup             
	//   67  127:aload_0         
	//   68  128:invokespecial   #302 <Method void WebViewFragment$2(WebViewFragment)>
	//   69  131:invokevirtual   #306 <Method void WebView.setWebViewClient(WebViewClient)>
		webview.getViewTreeObserver().addOnPreDrawListener(new android.view.ViewTreeObserver.OnPreDrawListener() {

			public boolean onPreDraw()
			{
				if(webview.getMeasuredHeight() < 10)
			//*   0    0:aload_0         
			//*   1    1:getfield        #17  <Field WebViewFragment this$0>
			//*   2    4:invokestatic    #27  <Method WebView WebViewFragment.access$400(WebViewFragment)>
			//*   3    7:invokevirtual   #33  <Method int WebView.getMeasuredHeight()>
			//*   4   10:bipush          10
			//*   5   12:icmpge          79
				{
					Display display = getDisplay();
			//    6   15:aload_0         
			//    7   16:getfield        #17  <Field WebViewFragment this$0>
			//    8   19:invokestatic    #37  <Method Display WebViewFragment.access$500(WebViewFragment)>
			//    9   22:astore_3        
					if(display != null)
			//*  10   23:aload_3         
			//*  11   24:ifnull          79
					{
						int i = (Math.min(display.getWidth(), display.getHeight()) * 9) / 10;
			//   12   27:aload_3         
			//   13   28:invokevirtual   #42  <Method int Display.getWidth()>
			//   14   31:aload_3         
			//   15   32:invokevirtual   #45  <Method int Display.getHeight()>
			//   16   35:invokestatic    #51  <Method int Math.min(int, int)>
			//   17   38:bipush          9
			//   18   40:imul            
			//   19   41:bipush          10
			//   20   43:idiv            
			//   21   44:istore_1        
						int j = webview.getContentHeight();
			//   22   45:aload_0         
			//   23   46:getfield        #17  <Field WebViewFragment this$0>
			//   24   49:invokestatic    #27  <Method WebView WebViewFragment.access$400(WebViewFragment)>
			//   25   52:invokevirtual   #54  <Method int WebView.getContentHeight()>
			//   26   55:istore_2        
						if(j > 0)
			//*  27   56:iload_2         
			//*  28   57:ifle            79
							webview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(i, j))));
			//   29   60:aload_0         
			//   30   61:getfield        #17  <Field WebViewFragment this$0>
			//   31   64:invokestatic    #27  <Method WebView WebViewFragment.access$400(WebViewFragment)>
			//   32   67:new             #56  <Class android.widget.FrameLayout$LayoutParams>
			//   33   70:dup             
			//   34   71:iload_1         
			//   35   72:iload_2         
			//   36   73:invokespecial   #59  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
			//   37   76:invokevirtual   #63  <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
					}
				}
				return true;
			//   38   79:iconst_1        
			//   39   80:ireturn         
			}

			final WebViewFragment this$0;

			
			{
				this$0 = WebViewFragment.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field WebViewFragment this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//   70  134:aload_0         
	//   71  135:getfield        #64  <Field WebView webview>
	//   72  138:invokevirtual   #310 <Method ViewTreeObserver WebView.getViewTreeObserver()>
	//   73  141:new             #10  <Class WebViewFragment$3>
	//   74  144:dup             
	//   75  145:aload_0         
	//   76  146:invokespecial   #311 <Method void WebViewFragment$3(WebViewFragment)>
	//   77  149:invokevirtual   #317 <Method void ViewTreeObserver.addOnPreDrawListener(android.view.ViewTreeObserver$OnPreDrawListener)>
		if(body != null)
	//*  78  152:aload_0         
	//*  79  153:getfield        #83  <Field String body>
	//*  80  156:ifnull          181
		{
			webview.postUrl(url, EncodingUtils.getBytes(body, "BASE64"));
	//   81  159:aload_0         
	//   82  160:getfield        #64  <Field WebView webview>
	//   83  163:aload_0         
	//   84  164:getfield        #80  <Field String url>
	//   85  167:aload_0         
	//   86  168:getfield        #83  <Field String body>
	//   87  171:ldc2            #319 <String "BASE64">
	//   88  174:invokestatic    #325 <Method byte[] EncodingUtils.getBytes(String, String)>
	//   89  177:invokevirtual   #329 <Method void WebView.postUrl(String, byte[])>
			return;
	//   90  180:return          
		} else
		{
			webview.loadUrl(url);
	//   91  181:aload_0         
	//   92  182:getfield        #64  <Field WebView webview>
	//   93  185:aload_0         
	//   94  186:getfield        #80  <Field String url>
	//   95  189:invokevirtual   #333 <Method void WebView.loadUrl(String)>
			return;
	//   96  192:return          
		}
	}

	public Dialog onCreateDialog(Bundle bundle)
	{
		bundle = ((Bundle) (super.onCreateDialog(bundle)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #337 <Method Dialog DialogFragment.onCreateDialog(Bundle)>
	//    3    5:astore_1        
		if(title != null && title.length() > 0)
	//*   4    6:aload_0         
	//*   5    7:getfield        #75  <Field String title>
	//*   6   10:ifnull          33
	//*   7   13:aload_0         
	//*   8   14:getfield        #75  <Field String title>
	//*   9   17:invokevirtual   #342 <Method int String.length()>
	//*  10   20:ifle            33
		{
			((Dialog) (bundle)).setTitle(((CharSequence) (title)));
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #75  <Field String title>
	//   14   28:invokevirtual   #348 <Method void Dialog.setTitle(CharSequence)>
			return ((Dialog) (bundle));
	//   15   31:aload_1         
	//   16   32:areturn         
		} else
		{
			((Dialog) (bundle)).requestWindowFeature(1);
	//   17   33:aload_1         
	//   18   34:iconst_1        
	//   19   35:invokevirtual   #352 <Method boolean Dialog.requestWindowFeature(int)>
	//   20   38:pop             
			return ((Dialog) (bundle));
	//   21   39:aload_1         
	//   22   40:areturn         
		}
	}

	public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
	{
		layoutinflater = ((LayoutInflater) (getActivity()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method FragmentActivity getActivity()>
	//    2    4:astore_1        
		viewgroup = ((ViewGroup) (getDisplay()));
	//    3    5:aload_0         
	//    4    6:invokespecial   #70  <Method Display getDisplay()>
	//    5    9:astore_2        
		if(layoutinflater != null && viewgroup != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          228
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       21
	//*  10   18:goto            228
		{
			if(getShowsDialog())
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #357 <Method boolean getShowsDialog()>
	//*  13   25:ifeq            91
			{
				int j = (Math.min(((Display) (viewgroup)).getWidth(), ((Display) (viewgroup)).getHeight()) * 9) / 10;
	//   14   28:aload_2         
	//   15   29:invokevirtual   #151 <Method int Display.getWidth()>
	//   16   32:aload_2         
	//   17   33:invokevirtual   #154 <Method int Display.getHeight()>
	//   18   36:invokestatic    #160 <Method int Math.min(int, int)>
	//   19   39:bipush          9
	//   20   41:imul            
	//   21   42:bipush          10
	//   22   44:idiv            
	//   23   45:istore          5
				int i;
				if(bundle == null)
	//*  24   47:aload_3         
	//*  25   48:ifnonnull       66
					i = (((Display) (viewgroup)).getHeight() * 9) / 10;
	//   26   51:aload_2         
	//   27   52:invokevirtual   #154 <Method int Display.getHeight()>
	//   28   55:bipush          9
	//   29   57:imul            
	//   30   58:bipush          10
	//   31   60:idiv            
	//   32   61:istore          4
				else
	//*  33   63:goto            70
					i = -2;
	//   34   66:bipush          -2
	//   35   68:istore          4
				webview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(j, i))));
	//   36   70:aload_0         
	//   37   71:getfield        #64  <Field WebView webview>
	//   38   74:new             #146 <Class android.widget.FrameLayout$LayoutParams>
	//   39   77:dup             
	//   40   78:iload           5
	//   41   80:iload           4
	//   42   82:invokespecial   #163 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   43   85:invokevirtual   #169 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			} else
	//*  44   88:goto            107
			{
				webview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   45   91:aload_0         
	//   46   92:getfield        #64  <Field WebView webview>
	//   47   95:new             #146 <Class android.widget.FrameLayout$LayoutParams>
	//   48   98:dup             
	//   49   99:iconst_m1       
	//   50  100:iconst_m1       
	//   51  101:invokespecial   #163 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   52  104:invokevirtual   #169 <Method void WebView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			viewgroup = ((ViewGroup) (new FrameLayout(((android.content.Context) (layoutinflater)))));
	//   53  107:new             #359 <Class FrameLayout>
	//   54  110:dup             
	//   55  111:aload_1         
	//   56  112:invokespecial   #360 <Method void FrameLayout(android.content.Context)>
	//   57  115:astore_2        
			((FrameLayout) (viewgroup)).setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, -1))));
	//   58  116:aload_2         
	//   59  117:new             #146 <Class android.widget.FrameLayout$LayoutParams>
	//   60  120:dup             
	//   61  121:iconst_m1       
	//   62  122:iconst_m1       
	//   63  123:invokespecial   #163 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   64  126:invokevirtual   #361 <Method void FrameLayout.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			if(webview.getParent() != null)
	//*  65  129:aload_0         
	//*  66  130:getfield        #64  <Field WebView webview>
	//*  67  133:invokevirtual   #365 <Method android.view.ViewParent WebView.getParent()>
	//*  68  136:ifnull          156
				((FrameLayout)webview.getParent()).removeView(((View) (webview)));
	//   69  139:aload_0         
	//   70  140:getfield        #64  <Field WebView webview>
	//   71  143:invokevirtual   #365 <Method android.view.ViewParent WebView.getParent()>
	//   72  146:checkcast       #359 <Class FrameLayout>
	//   73  149:aload_0         
	//   74  150:getfield        #64  <Field WebView webview>
	//   75  153:invokevirtual   #369 <Method void FrameLayout.removeView(View)>
			((FrameLayout) (viewgroup)).addView(((View) (webview)));
	//   76  156:aload_2         
	//   77  157:aload_0         
	//   78  158:getfield        #64  <Field WebView webview>
	//   79  161:invokevirtual   #372 <Method void FrameLayout.addView(View)>
			bundle = ((Bundle) (new android.widget.FrameLayout.LayoutParams(-2, -2)));
	//   80  164:new             #146 <Class android.widget.FrameLayout$LayoutParams>
	//   81  167:dup             
	//   82  168:bipush          -2
	//   83  170:bipush          -2
	//   84  172:invokespecial   #163 <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   85  175:astore_3        
			bundle.gravity = 17;
	//   86  176:aload_3         
	//   87  177:bipush          17
	//   88  179:putfield        #375 <Field int android.widget.FrameLayout$LayoutParams.gravity>
			progressBar = new ProgressBar(((android.content.Context) (layoutinflater)));
	//   89  182:aload_0         
	//   90  183:new             #377 <Class ProgressBar>
	//   91  186:dup             
	//   92  187:aload_1         
	//   93  188:invokespecial   #378 <Method void ProgressBar(android.content.Context)>
	//   94  191:putfield        #48  <Field ProgressBar progressBar>
			progressBar.setIndeterminate(true);
	//   95  194:aload_0         
	//   96  195:getfield        #48  <Field ProgressBar progressBar>
	//   97  198:iconst_1        
	//   98  199:invokevirtual   #381 <Method void ProgressBar.setIndeterminate(boolean)>
			progressBar.setLayoutParams(((android.view.ViewGroup.LayoutParams) (bundle)));
	//   99  202:aload_0         
	//  100  203:getfield        #48  <Field ProgressBar progressBar>
	//  101  206:aload_3         
	//  102  207:invokevirtual   #382 <Method void ProgressBar.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			progressBar.setVisibility(4);
	//  103  210:aload_0         
	//  104  211:getfield        #48  <Field ProgressBar progressBar>
	//  105  214:iconst_4        
	//  106  215:invokevirtual   #385 <Method void ProgressBar.setVisibility(int)>
			((FrameLayout) (viewgroup)).addView(((View) (progressBar)));
	//  107  218:aload_2         
	//  108  219:aload_0         
	//  109  220:getfield        #48  <Field ProgressBar progressBar>
	//  110  223:invokevirtual   #372 <Method void FrameLayout.addView(View)>
			return ((View) (viewgroup));
	//  111  226:aload_2         
	//  112  227:areturn         
		} else
		{
			return null;
	//  113  228:aconst_null     
	//  114  229:areturn         
		}
	}

	public void onDestroy()
	{
		if(webview != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field WebView webview>
	//*   2    4:ifnull          22
		{
			webview.setWebChromeClient(((WebChromeClient) (null)));
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field WebView webview>
	//    5   11:aconst_null     
	//    6   12:invokevirtual   #301 <Method void WebView.setWebChromeClient(WebChromeClient)>
			webview.stopLoading();
	//    7   15:aload_0         
	//    8   16:getfield        #64  <Field WebView webview>
	//    9   19:invokevirtual   #389 <Method void WebView.stopLoading()>
		}
		super.onDestroy();
	//   10   22:aload_0         
	//   11   23:invokespecial   #391 <Method void DialogFragment.onDestroy()>
	//   12   26:return          
	}

	public void onDestroyView()
	{
		Dialog dialog = getDialog();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #396 <Method Dialog getDialog()>
	//    2    4:astore_1        
		if(dialog != null && getRetainInstance())
	//*   3    5:aload_1         
	//*   4    6:ifnull          21
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #399 <Method boolean getRetainInstance()>
	//*   7   13:ifeq            21
			dialog.setDismissMessage(((android.os.Message) (null)));
	//    8   16:aload_1         
	//    9   17:aconst_null     
	//   10   18:invokevirtual   #403 <Method void Dialog.setDismissMessage(android.os.Message)>
		super.onDestroyView();
	//   11   21:aload_0         
	//   12   22:invokespecial   #405 <Method void DialogFragment.onDestroyView()>
	//   13   25:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #408 <Method void DialogFragment.onSaveInstanceState(Bundle)>
		bundle.putString("url", url);
	//    3    5:aload_1         
	//    4    6:ldc1            #172 <String "url">
	//    5    8:aload_0         
	//    6    9:getfield        #80  <Field String url>
	//    7   12:invokevirtual   #411 <Method void Bundle.putString(String, String)>
		bundle.putBoolean("isTransparent", isTransparent);
	//    8   15:aload_1         
	//    9   16:ldc1            #179 <String "isTransparent">
	//   10   18:aload_0         
	//   11   19:getfield        #93  <Field boolean isTransparent>
	//   12   22:invokevirtual   #415 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putString("title", title);
	//   13   25:aload_1         
	//   14   26:ldc1            #184 <String "title">
	//   15   28:aload_0         
	//   16   29:getfield        #75  <Field String title>
	//   17   32:invokevirtual   #411 <Method void Bundle.putString(String, String)>
		bundle.putString("tag", tag);
	//   18   35:aload_1         
	//   19   36:ldc1            #185 <String "tag">
	//   20   38:aload_0         
	//   21   39:getfield        #85  <Field String tag>
	//   22   42:invokevirtual   #411 <Method void Bundle.putString(String, String)>
		bundle.putString("resultPrefix", resultPrefix);
	//   23   45:aload_1         
	//   24   46:ldc1            #186 <String "resultPrefix">
	//   25   48:aload_0         
	//   26   49:getfield        #60  <Field String resultPrefix>
	//   27   52:invokevirtual   #411 <Method void Bundle.putString(String, String)>
		bundle.putInt("handlerId", handlerId);
	//   28   55:aload_1         
	//   29   56:ldc1            #187 <String "handlerId">
	//   30   58:aload_0         
	//   31   59:getfield        #105 <Field int handlerId>
	//   32   62:invokevirtual   #419 <Method void Bundle.putInt(String, int)>
	//   33   65:return          
	}

	public void show(FragmentActivity fragmentactivity)
	{
		fragmentactivity = ((FragmentActivity) (fragmentactivity.getSupportFragmentManager().beginTransaction()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #111 <Method FragmentManager FragmentActivity.getSupportFragmentManager()>
	//    2    4:invokevirtual   #117 <Method FragmentTransaction FragmentManager.beginTransaction()>
	//    3    7:astore_1        
		((FragmentTransaction) (fragmentactivity)).add(((android.support.v4.app.Fragment) (this)), tag);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #85  <Field String tag>
	//    8   14:invokevirtual   #123 <Method FragmentTransaction FragmentTransaction.add(android.support.v4.app.Fragment, String)>
	//    9   17:pop             
		((FragmentTransaction) (fragmentactivity)).commitAllowingStateLoss();
	//   10   18:aload_1         
	//   11   19:invokevirtual   #238 <Method int FragmentTransaction.commitAllowingStateLoss()>
	//   12   22:pop             
	//   13   23:return          
	}

	private static SparseArray handlers = new SparseArray();
	private String body;
	private int handlerId;
	private boolean isTransparent;
	private ProgressBar progressBar;
	private String resultPrefix;
	private String tag;
	private String title;
	private String url;
	private boolean webViewWrapContent;
	private WebView webview;

	static 
	{
	//    0    0:new             #35  <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #38  <Method void SparseArray()>
	//    3    7:putstatic       #40  <Field SparseArray handlers>
	//*   4   10:return          
	}


/*
	static ProgressBar access$000(WebViewFragment webviewfragment)
	{
		return webviewfragment.progressBar;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field ProgressBar progressBar>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$100(WebViewFragment webviewfragment)
	{
		return webviewfragment.webViewWrapContent;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field boolean webViewWrapContent>
	//    2    4:ireturn         
	}

*/


/*
	static void access$200(WebViewFragment webviewfragment, WebView webview1)
	{
		webviewfragment.redrawWebViewInDialog(webview1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void redrawWebViewInDialog(WebView)>
		return;
	//    3    5:return          
	}

*/


/*
	static String access$300(WebViewFragment webviewfragment)
	{
		return webviewfragment.resultPrefix;
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field String resultPrefix>
	//    2    4:areturn         
	}

*/


/*
	static WebView access$400(WebViewFragment webviewfragment)
	{
		return webviewfragment.webview;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field WebView webview>
	//    2    4:areturn         
	}

*/


/*
	static Display access$500(WebViewFragment webviewfragment)
	{
		return webviewfragment.getDisplay();
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method Display getDisplay()>
	//    2    4:areturn         
	}

*/
}
