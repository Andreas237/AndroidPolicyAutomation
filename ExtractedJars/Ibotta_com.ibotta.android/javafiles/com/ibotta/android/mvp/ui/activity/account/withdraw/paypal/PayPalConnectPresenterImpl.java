// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal;

import com.google.code.regexp.Matcher;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter;
import com.ibotta.android.service.api.Outcome;
import com.ibotta.android.service.api.job.*;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.state.app.config.paypal.PayPalAppConfig;
import com.ibotta.api.ApiException;
import com.ibotta.api.call.ApiCallFactory;
import com.ibotta.api.call.paypal.PayPalLinkPostCall;
import com.ibotta.api.call.paypal.PayPalLoginResponse;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.paypal:
//			PayPalConnectPresenter, PayPalConnectView, PayPalConnectCollaborators

public class PayPalConnectPresenterImpl extends AbstractPasswordUsingMvpPresenter
	implements PayPalConnectPresenter
{

	public PayPalConnectPresenterImpl(MvpPresenterActions mvppresenteractions, AppConfig appconfig, ApiCallFactory apicallfactory, ApiJobFactory apijobfactory, PayPalConnectCollaborators paypalconnectcollaborators, CacheClearJobFactory cacheclearjobfactory)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void AbstractPasswordUsingMvpPresenter(MvpPresenterActions)>
		appConfig = appconfig;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #29  <Field AppConfig appConfig>
		apiCallFactory = apicallfactory;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field ApiCallFactory apiCallFactory>
		apiJobFactory = apijobfactory;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #33  <Field ApiJobFactory apiJobFactory>
		collaborators = paypalconnectcollaborators;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #35  <Field PayPalConnectCollaborators collaborators>
		cacheClearFactory = cacheclearjobfactory;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #37  <Field CacheClearJobFactory cacheClearFactory>
	//   18   33:return          
	}

	protected Set getFetchJobs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #42  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void HashSet()>
	//    3    7:astore_1        
		if(payPalNewAcctJob == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #47  <Field SingleApiJob payPalNewAcctJob>
	//*   6   12:ifnonnull       41
			payPalNewAcctJob = apiJobFactory.createSingleApiJob(((com.ibotta.api.ApiCall) (apiCallFactory.createPayPalLoginPostCall(customerPassword))));
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #33  <Field ApiJobFactory apiJobFactory>
	//   10   20:aload_0         
	//   11   21:getfield        #31  <Field ApiCallFactory apiCallFactory>
	//   12   24:aload_0         
	//   13   25:getfield        #49  <Field String customerPassword>
	//   14   28:invokeinterface #55  <Method com.ibotta.api.call.paypal.PayPalLoginPostCall ApiCallFactory.createPayPalLoginPostCall(String)>
	//   15   33:invokeinterface #61  <Method SingleApiJob ApiJobFactory.createSingleApiJob(com.ibotta.api.ApiCall)>
	//   16   38:putfield        #47  <Field SingleApiJob payPalNewAcctJob>
		((Set) (hashset)).add(((Object) (payPalNewAcctJob)));
	//   17   41:aload_1         
	//   18   42:aload_0         
	//   19   43:getfield        #47  <Field SingleApiJob payPalNewAcctJob>
	//   20   46:invokeinterface #67  <Method boolean Set.add(Object)>
	//   21   51:pop             
		return ((Set) (hashset));
	//   22   52:aload_1         
	//   23   53:areturn         
	}

	protected void onAbandonFetchJobs()
	{
		payPalNewAcctJob = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #47  <Field SingleApiJob payPalNewAcctJob>
	//    3    5:return          
	}

	public void onBackPressed()
	{
		if(((PayPalConnectView)mvpView).hasNavigationHistory())
	//*   0    0:aload_0         
	//*   1    1:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//*   2    4:checkcast       #77  <Class PayPalConnectView>
	//*   3    7:invokeinterface #81  <Method boolean PayPalConnectView.hasNavigationHistory()>
	//*   4   12:ifeq            28
		{
			((PayPalConnectView)mvpView).navigateBack();
	//    5   15:aload_0         
	//    6   16:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    7   19:checkcast       #77  <Class PayPalConnectView>
	//    8   22:invokeinterface #84  <Method void PayPalConnectView.navigateBack()>
			return;
	//    9   27:return          
		} else
		{
			((PayPalConnectView)mvpView).finish();
	//   10   28:aload_0         
	//   11   29:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   12   32:checkcast       #77  <Class PayPalConnectView>
	//   13   35:invokeinterface #87  <Method void PayPalConnectView.finish()>
			return;
	//   14   40:return          
		}
	}

	protected void onFetchFinishedSuccessfully()
	{
		((PayPalConnectView)mvpView).loadUrl(((PayPalLoginResponse)payPalNewAcctJob.getApiResponse()).getPayPalUrl());
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #77  <Class PayPalConnectView>
	//    3    7:aload_0         
	//    4    8:getfield        #47  <Field SingleApiJob payPalNewAcctJob>
	//    5   11:invokevirtual   #94  <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//    6   14:checkcast       #96  <Class PayPalLoginResponse>
	//    7   17:invokevirtual   #100 <Method String PayPalLoginResponse.getPayPalUrl()>
	//    8   20:invokeinterface #104 <Method void PayPalConnectView.loadUrl(String)>
	//    9   25:return          
	}

	protected void onFetchFinishedWithFailures()
	{
	//    0    0:return          
	}

	public void onFetchJobErrorDialogClosed()
	{
		((PayPalConnectView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #77  <Class PayPalConnectView>
	//    3    7:invokeinterface #87  <Method void PayPalConnectView.finish()>
	//    4   12:return          
	}

	protected void onFetchJobFailed(ApiJob apijob)
	{
		super.onFetchJobFailed(apijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #110 <Method void AbstractPasswordUsingMvpPresenter.onFetchJobFailed(ApiJob)>
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore_3        
		boolean flag = flag1;
	//    5    7:iload_3         
	//    6    8:istore_2        
		if(apijob != null)
	//*   7    9:aload_1         
	//*   8   10:ifnull          29
		{
			flag = flag1;
	//    9   13:iload_3         
	//   10   14:istore_2        
			if(apijob.getOutcome() == Outcome.NETWORK_LOST)
	//*  11   15:aload_1         
	//*  12   16:invokeinterface #116 <Method Outcome ApiJob.getOutcome()>
	//*  13   21:getstatic       #122 <Field Outcome Outcome.NETWORK_LOST>
	//*  14   24:if_acmpne       29
				flag = true;
	//   15   27:iconst_1        
	//   16   28:istore_2        
		}
		if(!flag && mvpPresenterActions.isNetworkConnected())
	//*  17   29:iload_2         
	//*  18   30:ifne            98
	//*  19   33:aload_0         
	//*  20   34:getfield        #126 <Field MvpPresenterActions mvpPresenterActions>
	//*  21   37:invokeinterface #131 <Method boolean MvpPresenterActions.isNetworkConnected()>
	//*  22   42:ifne            48
	//*  23   45:goto            98
		{
			Object obj = null;
	//   24   48:aconst_null     
	//   25   49:astore          5
			com.ibotta.api.ApiErrorDetails apierrordetails = ((com.ibotta.api.ApiErrorDetails) (obj));
	//   26   51:aload           5
	//   27   53:astore          4
			if(apijob != null)
	//*  28   55:aload_1         
	//*  29   56:ifnull          83
			{
				apierrordetails = ((com.ibotta.api.ApiErrorDetails) (obj));
	//   30   59:aload           5
	//   31   61:astore          4
				if(apijob.getException() != null)
	//*  32   63:aload_1         
	//*  33   64:invokeinterface #135 <Method ApiException ApiJob.getException()>
	//*  34   69:ifnull          83
					apierrordetails = apijob.getException().getDetails();
	//   35   72:aload_1         
	//   36   73:invokeinterface #135 <Method ApiException ApiJob.getException()>
	//   37   78:invokevirtual   #141 <Method com.ibotta.api.ApiErrorDetails ApiException.getDetails()>
	//   38   81:astore          4
			}
			((PayPalConnectView)mvpView).showFetchJobFailed(apierrordetails);
	//   39   83:aload_0         
	//   40   84:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   41   87:checkcast       #77  <Class PayPalConnectView>
	//   42   90:aload           4
	//   43   92:invokeinterface #145 <Method void PayPalConnectView.showFetchJobFailed(com.ibotta.api.ApiErrorDetails)>
			return;
	//   44   97:return          
		} else
		{
			((PayPalConnectView)mvpView).showNetworkConnectionErrorDialog();
	//   45   98:aload_0         
	//   46   99:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   47  102:checkcast       #77  <Class PayPalConnectView>
	//   48  105:invokeinterface #148 <Method void PayPalConnectView.showNetworkConnectionErrorDialog()>
			return;
	//   49  110:return          
		}
	}

	public void onLoadFailedDialogClosed()
	{
		((PayPalConnectView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #77  <Class PayPalConnectView>
	//    3    7:invokeinterface #87  <Method void PayPalConnectView.finish()>
	//    4   12:return          
	}

	public void onPageLoadFailed(String s)
	{
		((PayPalConnectView)mvpView).showLoadFailedDialog(s);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #77  <Class PayPalConnectView>
	//    3    7:aload_1         
	//    4    8:invokeinterface #153 <Method void PayPalConnectView.showLoadFailedDialog(String)>
	//    5   13:return          
	}

	public void onPageLoadFinished()
	{
		((PayPalConnectView)mvpView).hideScreenLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #77  <Class PayPalConnectView>
	//    3    7:invokeinterface #157 <Method void PayPalConnectView.hideScreenLoading()>
	//    4   12:return          
	}

	public void onPageLoadStarted()
	{
		((PayPalConnectView)mvpView).showScreenLoading();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #77  <Class PayPalConnectView>
	//    3    7:invokeinterface #161 <Method void PayPalConnectView.showScreenLoading()>
	//    4   12:return          
	}

	protected void onSubmitJobSuccess(SingleApiJob singleapijob)
	{
		super.onSubmitJobSuccess(singleapijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #165 <Method void AbstractPasswordUsingMvpPresenter.onSubmitJobSuccess(SingleApiJob)>
		if(singleapijob.getApiCall() instanceof PayPalLinkPostCall)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #169 <Method com.ibotta.api.ApiCall SingleApiJob.getApiCall()>
	//*   5    9:instanceof      #171 <Class PayPalLinkPostCall>
	//*   6   12:ifeq            45
		{
			cacheClearFactory.create().clearCustomerAccounts(true).clearCustomer(false).clear();
	//    7   15:aload_0         
	//    8   16:getfield        #37  <Field CacheClearJobFactory cacheClearFactory>
	//    9   19:invokevirtual   #177 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//   10   22:iconst_1        
	//   11   23:invokevirtual   #183 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomerAccounts(boolean)>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #186 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//   14   30:invokevirtual   #189 <Method void CacheClearBatchApiJob.clear()>
			((PayPalConnectView)mvpView).finishWithSuccess();
	//   15   33:aload_0         
	//   16   34:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   37:checkcast       #77  <Class PayPalConnectView>
	//   18   40:invokeinterface #192 <Method void PayPalConnectView.finishWithSuccess()>
		}
	//   19   45:return          
	}

	public void onSubmittedJobErrorDialogClosed()
	{
		((PayPalConnectView)mvpView).finish();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #77  <Class PayPalConnectView>
	//    3    7:invokeinterface #87  <Method void PayPalConnectView.finish()>
	//    4   12:return          
	}

	public void setCustomerPassword(String s)
	{
		customerPassword = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field String customerPassword>
	//    3    5:return          
	}

	public boolean shouldOverrideUrlLoading(String s)
	{
		if(collaborators.provideMatcher(appConfig.getPaypalAppConfig().getConnectUrlPattern(), s).matches())
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field PayPalConnectCollaborators collaborators>
	//*   2    4:aload_0         
	//*   3    5:getfield        #29  <Field AppConfig appConfig>
	//*   4    8:invokeinterface #202 <Method PayPalAppConfig AppConfig.getPaypalAppConfig()>
	//*   5   13:invokevirtual   #207 <Method String PayPalAppConfig.getConnectUrlPattern()>
	//*   6   16:aload_1         
	//*   7   17:invokevirtual   #213 <Method Matcher PayPalConnectCollaborators.provideMatcher(String, String)>
	//*   8   20:invokevirtual   #218 <Method boolean Matcher.matches()>
	//*   9   23:ifeq            42
		{
			submitApiCall(((com.ibotta.api.ApiCall) (apiCallFactory.createPayPalLinkPostCall(s))));
	//   10   26:aload_0         
	//   11   27:aload_0         
	//   12   28:getfield        #31  <Field ApiCallFactory apiCallFactory>
	//   13   31:aload_1         
	//   14   32:invokeinterface #222 <Method PayPalLinkPostCall ApiCallFactory.createPayPalLinkPostCall(String)>
	//   15   37:invokevirtual   #226 <Method void submitApiCall(com.ibotta.api.ApiCall)>
			return true;
	//   16   40:iconst_1        
	//   17   41:ireturn         
		} else
		{
			return false;
	//   18   42:iconst_0        
	//   19   43:ireturn         
		}
	}

	private final ApiCallFactory apiCallFactory;
	private final ApiJobFactory apiJobFactory;
	private final AppConfig appConfig;
	private final CacheClearJobFactory cacheClearFactory;
	private final PayPalConnectCollaborators collaborators;
	private String customerPassword;
	private SingleApiJob payPalNewAcctJob;
}
