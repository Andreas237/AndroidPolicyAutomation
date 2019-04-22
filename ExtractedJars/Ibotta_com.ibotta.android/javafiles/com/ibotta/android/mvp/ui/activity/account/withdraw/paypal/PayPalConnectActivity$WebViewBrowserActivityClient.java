// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.*;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal:
//			PayPalConnectActivity, PayPalConnectPresenter

class PayPalConnectActivity$WebViewBrowserActivityClient extends WebViewClient
{

	public void onPageFinished(WebView webview, String s)
	{
		super.onPageFinished(webview, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #21  <Method void WebViewClient.onPageFinished(WebView, String)>
		((PayPalConnectPresenter)PayPalConnectActivity.access$100(PayPalConnectActivity.this)).onPageLoadFinished();
	//    4    6:aload_0         
	//    5    7:getfield        #13  <Field PayPalConnectActivity this$0>
	//    6   10:invokestatic    #25  <Method com.ibotta.android.mvp.base.MvpPresenter PayPalConnectActivity.access$100(PayPalConnectActivity)>
	//    7   13:checkcast       #27  <Class PayPalConnectPresenter>
	//    8   16:invokeinterface #30  <Method void PayPalConnectPresenter.onPageLoadFinished()>
	//    9   21:return          
	}

	public void onPageStarted(WebView webview, String s, Bitmap bitmap)
	{
		super.onPageStarted(webview, s, bitmap);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #34  <Method void WebViewClient.onPageStarted(WebView, String, Bitmap)>
		((PayPalConnectPresenter)PayPalConnectActivity.access$000(PayPalConnectActivity.this)).onPageLoadStarted();
	//    5    7:aload_0         
	//    6    8:getfield        #13  <Field PayPalConnectActivity this$0>
	//    7   11:invokestatic    #37  <Method com.ibotta.android.mvp.base.MvpPresenter PayPalConnectActivity.access$000(PayPalConnectActivity)>
	//    8   14:checkcast       #27  <Class PayPalConnectPresenter>
	//    9   17:invokeinterface #40  <Method void PayPalConnectPresenter.onPageLoadStarted()>
	//   10   22:return          
	}

	public void onReceivedError(WebView webview, int i, String s, String s1)
	{
		super.onReceivedError(webview, i, s, s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #44  <Method void WebViewClient.onReceivedError(WebView, int, String, String)>
		Timber.e("Failed to load web page: (code=%1$d) %2$s", new Object[] {
			Integer.valueOf(i), s
		});
	//    6    9:ldc1            #46  <String "Failed to load web page: (code=%1$d) %2$s">
	//    7   11:iconst_2        
	//    8   12:anewarray       Object[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:iload_2         
	//   12   18:invokestatic    #54  <Method Integer Integer.valueOf(int)>
	//   13   21:aastore         
	//   14   22:dup             
	//   15   23:iconst_1        
	//   16   24:aload_3         
	//   17   25:aastore         
	//   18   26:invokestatic    #60  <Method void Timber.e(String, Object[])>
		((PayPalConnectPresenter)PayPalConnectActivity.access$400(PayPalConnectActivity.this)).onPageLoadFailed(s);
	//   19   29:aload_0         
	//   20   30:getfield        #13  <Field PayPalConnectActivity this$0>
	//   21   33:invokestatic    #63  <Method com.ibotta.android.mvp.base.MvpPresenter PayPalConnectActivity.access$400(PayPalConnectActivity)>
	//   22   36:checkcast       #27  <Class PayPalConnectPresenter>
	//   23   39:aload_3         
	//   24   40:invokeinterface #67  <Method void PayPalConnectPresenter.onPageLoadFailed(String)>
	//   25   45:return          
	}

	public boolean shouldOverrideUrlLoading(WebView webview, WebResourceRequest webresourcerequest)
	{
		webview = ((WebView) (webresourcerequest.getUrl()));
	//    0    0:aload_2         
	//    1    1:invokeinterface #78  <Method Uri WebResourceRequest.getUrl()>
	//    2    6:astore_1        
		return ((PayPalConnectPresenter)PayPalConnectActivity.access$300(PayPalConnectActivity.this)).shouldOverrideUrlLoading(((Uri) (webview)).toString());
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field PayPalConnectActivity this$0>
	//    5   11:invokestatic    #81  <Method com.ibotta.android.mvp.base.MvpPresenter PayPalConnectActivity.access$300(PayPalConnectActivity)>
	//    6   14:checkcast       #27  <Class PayPalConnectPresenter>
	//    7   17:aload_1         
	//    8   18:invokevirtual   #87  <Method String Uri.toString()>
	//    9   21:invokeinterface #90  <Method boolean PayPalConnectPresenter.shouldOverrideUrlLoading(String)>
	//   10   26:ireturn         
	}

	public boolean shouldOverrideUrlLoading(WebView webview, String s)
	{
		return ((PayPalConnectPresenter)PayPalConnectActivity.access$200(PayPalConnectActivity.this)).shouldOverrideUrlLoading(s);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field PayPalConnectActivity this$0>
	//    2    4:invokestatic    #95  <Method com.ibotta.android.mvp.base.MvpPresenter PayPalConnectActivity.access$200(PayPalConnectActivity)>
	//    3    7:checkcast       #27  <Class PayPalConnectPresenter>
	//    4   10:aload_2         
	//    5   11:invokeinterface #90  <Method boolean PayPalConnectPresenter.shouldOverrideUrlLoading(String)>
	//    6   16:ireturn         
	}

	final PayPalConnectActivity this$0;

	PayPalConnectActivity$WebViewBrowserActivityClient()
	{
		this$0 = PayPalConnectActivity.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field PayPalConnectActivity this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #16  <Method void WebViewClient()>
	//    5    9:return          
	}
}
