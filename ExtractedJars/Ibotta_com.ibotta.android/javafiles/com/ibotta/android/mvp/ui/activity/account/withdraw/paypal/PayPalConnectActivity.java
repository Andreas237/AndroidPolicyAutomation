// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.webkit.*;
import butterknife.ButterKnife;
import com.ibotta.android.di.MainComponent;
import com.ibotta.android.mvp.base.MvpComponent;
import com.ibotta.android.mvp.base.MvpPresenter;
import com.ibotta.android.mvp.base.loading.LoadingMvpActivity;
import com.ibotta.android.views.browser.IbottaWebView;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal:
//			PayPalConnectView, PayPalConnectPresenter, DaggerPayPalConnectComponent, PayPalConnectModule, 
//			PayPalConnectComponent

public class PayPalConnectActivity extends LoadingMvpActivity
	implements PayPalConnectView
{
	class WebViewBrowserActivityClient extends WebViewClient
	{

		public void onPageFinished(WebView webview, String s)
		{
			super.onPageFinished(webview, s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #21  <Method void WebViewClient.onPageFinished(WebView, String)>
			((PayPalConnectPresenter)onPageLoadFinished).onPageLoadFinished();
		//    4    6:aload_0         
		//    5    7:getfield        #13  <Field PayPalConnectActivity this$0>
		//    6   10:invokestatic    #25  <Method MvpPresenter PayPalConnectActivity.access$100(PayPalConnectActivity)>
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
			((PayPalConnectPresenter)onPageLoadFinished).onPageLoadStarted();
		//    5    7:aload_0         
		//    6    8:getfield        #13  <Field PayPalConnectActivity this$0>
		//    7   11:invokestatic    #37  <Method MvpPresenter PayPalConnectActivity.access$000(PayPalConnectActivity)>
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
			((PayPalConnectPresenter)onPageLoadFinished).onPageLoadFailed(s);
		//   19   29:aload_0         
		//   20   30:getfield        #13  <Field PayPalConnectActivity this$0>
		//   21   33:invokestatic    #63  <Method MvpPresenter PayPalConnectActivity.access$400(PayPalConnectActivity)>
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
			return ((PayPalConnectPresenter)onPageLoadFinished).shouldOverrideUrlLoading(((Uri) (webview)).toString());
		//    3    7:aload_0         
		//    4    8:getfield        #13  <Field PayPalConnectActivity this$0>
		//    5   11:invokestatic    #81  <Method MvpPresenter PayPalConnectActivity.access$300(PayPalConnectActivity)>
		//    6   14:checkcast       #27  <Class PayPalConnectPresenter>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #87  <Method String Uri.toString()>
		//    9   21:invokeinterface #90  <Method boolean PayPalConnectPresenter.shouldOverrideUrlLoading(String)>
		//   10   26:ireturn         
		}

		public boolean shouldOverrideUrlLoading(WebView webview, String s)
		{
			return ((PayPalConnectPresenter)onPageLoadFinished).shouldOverrideUrlLoading(s);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field PayPalConnectActivity this$0>
		//    2    4:invokestatic    #95  <Method MvpPresenter PayPalConnectActivity.access$200(PayPalConnectActivity)>
		//    3    7:checkcast       #27  <Class PayPalConnectPresenter>
		//    4   10:aload_2         
		//    5   11:invokeinterface #90  <Method boolean PayPalConnectPresenter.shouldOverrideUrlLoading(String)>
		//    6   16:ireturn         
		}

		final PayPalConnectActivity this$0;

		WebViewBrowserActivityClient()
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


	public PayPalConnectActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void LoadingMvpActivity()>
	//    2    4:return          
	}

	private boolean handleDialogClosed(String s)
	{
		if("error_loading_web_page".equals(((Object) (s))))
	//*   0    0:ldc1            #14  <String "error_loading_web_page">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            23
		{
			((PayPalConnectPresenter)mvpPresenter).onLoadFailedDialogClosed();
	//    4    9:aload_0         
	//    5   10:getfield        #30  <Field MvpPresenter mvpPresenter>
	//    6   13:checkcast       #44  <Class PayPalConnectPresenter>
	//    7   16:invokeinterface #47  <Method void PayPalConnectPresenter.onLoadFailedDialogClosed()>
			return true;
	//    8   21:iconst_1        
	//    9   22:ireturn         
		}
		if("fetch_job_error".equals(((Object) (s))))
	//*  10   23:ldc1            #49  <String "fetch_job_error">
	//*  11   25:aload_1         
	//*  12   26:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  13   29:ifeq            46
		{
			((PayPalConnectPresenter)mvpPresenter).onFetchJobErrorDialogClosed();
	//   14   32:aload_0         
	//   15   33:getfield        #30  <Field MvpPresenter mvpPresenter>
	//   16   36:checkcast       #44  <Class PayPalConnectPresenter>
	//   17   39:invokeinterface #52  <Method void PayPalConnectPresenter.onFetchJobErrorDialogClosed()>
			return true;
	//   18   44:iconst_1        
	//   19   45:ireturn         
		}
		if("submitted_job_error".equals(((Object) (s))))
	//*  20   46:ldc1            #54  <String "submitted_job_error">
	//*  21   48:aload_1         
	//*  22   49:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  23   52:ifeq            69
		{
			((PayPalConnectPresenter)mvpPresenter).onSubmittedJobErrorDialogClosed();
	//   24   55:aload_0         
	//   25   56:getfield        #30  <Field MvpPresenter mvpPresenter>
	//   26   59:checkcast       #44  <Class PayPalConnectPresenter>
	//   27   62:invokeinterface #57  <Method void PayPalConnectPresenter.onSubmittedJobErrorDialogClosed()>
			return true;
	//   28   67:iconst_1        
	//   29   68:ireturn         
		} else
		{
			return false;
	//   30   69:iconst_0        
	//   31   70:ireturn         
		}
	}

	private void initTitle()
	{
		setTitle(0x7f1104a9);
	//    0    0:aload_0         
	//    1    1:ldc1            #59  <Int 0x7f1104a9>
	//    2    3:invokevirtual   #63  <Method void setTitle(int)>
	//    3    6:return          
	}

	private void initWebView()
	{
		iwvLinkContent.updateViewState((new com.ibotta.android.views.browser.IbottaWebViewState.Builder()).webViewClient(((WebViewClient) (new WebViewBrowserActivityClient()))).build());
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field IbottaWebView iwvLinkContent>
	//    2    4:new             #68  <Class com.ibotta.android.views.browser.IbottaWebViewState$Builder>
	//    3    7:dup             
	//    4    8:invokespecial   #69  <Method void com.ibotta.android.views.browser.IbottaWebViewState$Builder()>
	//    5   11:new             #9   <Class PayPalConnectActivity$WebViewBrowserActivityClient>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:invokespecial   #72  <Method void PayPalConnectActivity$WebViewBrowserActivityClient(PayPalConnectActivity)>
	//    9   19:invokevirtual   #76  <Method com.ibotta.android.views.browser.IbottaWebViewState$Builder com.ibotta.android.views.browser.IbottaWebViewState$Builder.webViewClient(WebViewClient)>
	//   10   22:invokevirtual   #80  <Method com.ibotta.android.views.browser.IbottaWebViewState com.ibotta.android.views.browser.IbottaWebViewState$Builder.build()>
	//   11   25:invokevirtual   #86  <Method void IbottaWebView.updateViewState(com.ibotta.android.views.browser.IbottaWebViewState)>
	//   12   28:return          
	}

	protected volatile MvpComponent createComponent(MainComponent maincomponent)
	{
		return ((MvpComponent) (createComponent(maincomponent)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #91  <Method PayPalConnectComponent createComponent(MainComponent)>
	//    3    5:areturn         
	}

	protected PayPalConnectComponent createComponent(MainComponent maincomponent)
	{
		return DaggerPayPalConnectComponent.builder().mainComponent(maincomponent).payPalConnectModule(new PayPalConnectModule(((PayPalConnectView) (this)))).build();
	//    0    0:invokestatic    #97  <Method DaggerPayPalConnectComponent$Builder DaggerPayPalConnectComponent.builder()>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #103 <Method DaggerPayPalConnectComponent$Builder DaggerPayPalConnectComponent$Builder.mainComponent(MainComponent)>
	//    3    7:new             #105 <Class PayPalConnectModule>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #108 <Method void PayPalConnectModule(PayPalConnectView)>
	//    7   15:invokevirtual   #112 <Method DaggerPayPalConnectComponent$Builder DaggerPayPalConnectComponent$Builder.payPalConnectModule(PayPalConnectModule)>
	//    8   18:invokevirtual   #115 <Method PayPalConnectComponent DaggerPayPalConnectComponent$Builder.build()>
	//    9   21:areturn         
	}

	public void finishWithSuccess()
	{
		setResult(-1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:invokevirtual   #119 <Method void setResult(int)>
		finish();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #122 <Method void finish()>
	//    5    9:return          
	}

	public boolean hasNavigationHistory()
	{
		return iwvLinkContent.canGoBack();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field IbottaWebView iwvLinkContent>
	//    2    4:invokevirtual   #127 <Method boolean IbottaWebView.canGoBack()>
	//    3    7:ireturn         
	}

	protected void initToolBar()
	{
		super.initToolBar();
	//    0    0:aload_0         
	//    1    1:invokespecial   #130 <Method void LoadingMvpActivity.initToolBar()>
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #134 <Method ActionBar getSupportActionBar()>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #140 <Method void ActionBar.setDisplayHomeAsUpEnabled(boolean)>
		getSupportActionBar().setDisplayUseLogoEnabled(false);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #134 <Method ActionBar getSupportActionBar()>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #143 <Method void ActionBar.setDisplayUseLogoEnabled(boolean)>
		getSupportActionBar().setDisplayShowHomeEnabled(false);
	//   10   20:aload_0         
	//   11   21:invokevirtual   #134 <Method ActionBar getSupportActionBar()>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #146 <Method void ActionBar.setDisplayShowHomeEnabled(boolean)>
	//   14   28:return          
	}

	protected volatile void inject(MvpComponent mvpcomponent)
	{
		inject((PayPalConnectComponent)mvpcomponent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #150 <Class PayPalConnectComponent>
	//    3    5:invokevirtual   #153 <Method void inject(PayPalConnectComponent)>
	//    4    8:return          
	}

	protected void inject(PayPalConnectComponent paypalconnectcomponent)
	{
		paypalconnectcomponent.inject(this);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokeinterface #155 <Method void PayPalConnectComponent.inject(PayPalConnectActivity)>
	//    3    7:return          
	}

	public void loadUrl(String s)
	{
		iwvLinkContent.loadUrl(s);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field IbottaWebView iwvLinkContent>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #159 <Method void IbottaWebView.loadUrl(String)>
	//    4    8:return          
	}

	public void navigateBack()
	{
		iwvLinkContent.goBack();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field IbottaWebView iwvLinkContent>
	//    2    4:invokevirtual   #163 <Method void IbottaWebView.goBack()>
	//    3    7:return          
	}

	public void onBackPressed()
	{
		((PayPalConnectPresenter)mvpPresenter).onBackPressed();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MvpPresenter mvpPresenter>
	//    2    4:checkcast       #44  <Class PayPalConnectPresenter>
	//    3    7:invokeinterface #166 <Method void PayPalConnectPresenter.onBackPressed()>
	//    4   12:return          
	}

	protected void onCreate(Bundle bundle)
	{
		super.onCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #171 <Method void LoadingMvpActivity.onCreate(Bundle)>
		setContentView(0x7f0c0056);
	//    3    5:aload_0         
	//    4    6:ldc1            #172 <Int 0x7f0c0056>
	//    5    8:invokevirtual   #175 <Method void setContentView(int)>
		setUnbinder(ButterKnife.bind(((android.app.Activity) (this))));
	//    6   11:aload_0         
	//    7   12:aload_0         
	//    8   13:invokestatic    #181 <Method butterknife.Unbinder ButterKnife.bind(android.app.Activity)>
	//    9   16:invokevirtual   #185 <Method void setUnbinder(butterknife.Unbinder)>
		((PayPalConnectPresenter)mvpPresenter).setCustomerPassword(getIntent().getStringExtra("password"));
	//   10   19:aload_0         
	//   11   20:getfield        #30  <Field MvpPresenter mvpPresenter>
	//   12   23:checkcast       #44  <Class PayPalConnectPresenter>
	//   13   26:aload_0         
	//   14   27:invokevirtual   #189 <Method Intent getIntent()>
	//   15   30:ldc1            #191 <String "password">
	//   16   32:invokevirtual   #197 <Method String Intent.getStringExtra(String)>
	//   17   35:invokeinterface #200 <Method void PayPalConnectPresenter.setCustomerPassword(String)>
		initTitle();
	//   18   40:aload_0         
	//   19   41:invokespecial   #202 <Method void initTitle()>
		initWebView();
	//   20   44:aload_0         
	//   21   45:invokespecial   #204 <Method void initWebView()>
	//   22   48:return          
	}

	public void onDialogFragmentCancelled(String s)
	{
		if(!handleDialogClosed(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #208 <Method boolean handleDialogClosed(String)>
	//*   3    5:ifne            13
			super.onDialogFragmentCancelled(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #210 <Method void LoadingMvpActivity.onDialogFragmentCancelled(String)>
	//    7   13:return          
	}

	public void onDialogFragmentDismissed(String s)
	{
		if(!handleDialogClosed(s))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #208 <Method boolean handleDialogClosed(String)>
	//*   3    5:ifne            13
			super.onDialogFragmentDismissed(s);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokespecial   #213 <Method void LoadingMvpActivity.onDialogFragmentDismissed(String)>
	//    7   13:return          
	}

	public void showLoadFailedDialog(String s)
	{
		showErrorMessage(s, "error_loading_web_page");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc1            #14  <String "error_loading_web_page">
	//    3    4:invokevirtual   #218 <Method void showErrorMessage(String, String)>
	//    4    7:return          
	}

	private static final String TAG_ERROR_LOADING_WEB_PAGE = "error_loading_web_page";
	protected IbottaWebView iwvLinkContent;


/*
	static MvpPresenter access$000(PayPalConnectActivity paypalconnectactivity)
	{
		return paypalconnectactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MvpPresenter access$100(PayPalConnectActivity paypalconnectactivity)
	{
		return paypalconnectactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MvpPresenter access$200(PayPalConnectActivity paypalconnectactivity)
	{
		return paypalconnectactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MvpPresenter access$300(PayPalConnectActivity paypalconnectactivity)
	{
		return paypalconnectactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/


/*
	static MvpPresenter access$400(PayPalConnectActivity paypalconnectactivity)
	{
		return paypalconnectactivity.mvpPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field MvpPresenter mvpPresenter>
	//    2    4:areturn         
	}

*/
}
