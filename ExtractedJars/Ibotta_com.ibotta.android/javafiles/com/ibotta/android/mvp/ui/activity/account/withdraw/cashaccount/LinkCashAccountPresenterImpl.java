// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount;

import com.ibotta.android.account.withdraw.LinkCashAccountReducer;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter;
import com.ibotta.android.mvp.ui.activity.account.withdraw.CashOutType;
import com.ibotta.android.service.api.job.*;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.util.Validation;
import com.ibotta.api.call.customer.accounts.CustomerAccountsAddCall;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashaccount:
//			LinkCashAccountPresenter, LinkCashAccountView

public class LinkCashAccountPresenterImpl extends AbstractPasswordUsingMvpPresenter
	implements LinkCashAccountPresenter
{

	public LinkCashAccountPresenterImpl(MvpPresenterActions mvppresenteractions, UserState userstate, Validation validation1, CacheClearJobFactory cacheclearjobfactory, LinkCashAccountReducer linkcashaccountreducer)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void AbstractPasswordUsingMvpPresenter(MvpPresenterActions)>
		userState = userstate;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field UserState userState>
		validation = validation1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #34  <Field Validation validation>
		cacheClearFactory = cacheclearjobfactory;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #36  <Field CacheClearJobFactory cacheClearFactory>
		linkCashAccountReducer = linkcashaccountreducer;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #38  <Field LinkCashAccountReducer linkCashAccountReducer>
	//   15   27:return          
	}

	private void linkAccount()
	{
		com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall.CallParams callparams = new com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall.CallParams();
	//    0    0:new             #43  <Class com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams()>
	//    3    7:astore_1        
		callparams.setCustomerId(userState.getCustomerId());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field UserState userState>
	//    7   13:invokeinterface #51  <Method int UserState.getCustomerId()>
	//    8   18:invokevirtual   #55  <Method void com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams.setCustomerId(int)>
		if(type == CashOutType.PAYPAL)
	//*   9   21:aload_0         
	//*  10   22:getfield        #57  <Field CashOutType type>
	//*  11   25:getstatic       #62  <Field CashOutType CashOutType.PAYPAL>
	//*  12   28:if_acmpne       68
		{
			callparams.setAccountHolder(String.format("%1$s, %2$s", new Object[] {
				lastName, firstName
			}));
	//   13   31:aload_1         
	//   14   32:ldc1            #11  <String "%1$s, %2$s">
	//   15   34:iconst_2        
	//   16   35:anewarray       Object[]
	//   17   38:dup             
	//   18   39:iconst_0        
	//   19   40:aload_0         
	//   20   41:getfield        #66  <Field String lastName>
	//   21   44:aastore         
	//   22   45:dup             
	//   23   46:iconst_1        
	//   24   47:aload_0         
	//   25   48:getfield        #68  <Field String firstName>
	//   26   51:aastore         
	//   27   52:invokestatic    #74  <Method String String.format(String, Object[])>
	//   28   55:invokevirtual   #78  <Method void com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams.setAccountHolder(String)>
			callparams.setType(com.ibotta.api.model.customer.CustomerAccount.Type.PAYPAL);
	//   29   58:aload_1         
	//   30   59:getstatic       #83  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.PAYPAL>
	//   31   62:invokevirtual   #87  <Method void com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams.setType(com.ibotta.api.model.customer.CustomerAccount$Type)>
		} else
	//*  32   65:goto            80
		{
			callparams.setAccountHolder(((String) (null)));
	//   33   68:aload_1         
	//   34   69:aconst_null     
	//   35   70:invokevirtual   #78  <Method void com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams.setAccountHolder(String)>
			callparams.setType(com.ibotta.api.model.customer.CustomerAccount.Type.VENMO);
	//   36   73:aload_1         
	//   37   74:getstatic       #90  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.VENMO>
	//   38   77:invokevirtual   #87  <Method void com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams.setType(com.ibotta.api.model.customer.CustomerAccount$Type)>
		}
		callparams.setPassword(password);
	//   39   80:aload_1         
	//   40   81:aload_0         
	//   41   82:getfield        #92  <Field String password>
	//   42   85:invokevirtual   #95  <Method void com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams.setPassword(String)>
		callparams.setAccountNumber(emailAddress);
	//   43   88:aload_1         
	//   44   89:aload_0         
	//   45   90:getfield        #97  <Field String emailAddress>
	//   46   93:invokevirtual   #100 <Method void com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams.setAccountNumber(String)>
		submitApiCall(((com.ibotta.api.ApiCall) (new CustomerAccountsAddCall(callparams))));
	//   47   96:aload_0         
	//   48   97:new             #102 <Class CustomerAccountsAddCall>
	//   49  100:dup             
	//   50  101:aload_1         
	//   51  102:invokespecial   #105 <Method void CustomerAccountsAddCall(com.ibotta.api.call.customer.accounts.BaseCustomerAccountsPostCall$CallParams)>
	//   52  105:invokevirtual   #109 <Method void submitApiCall(com.ibotta.api.ApiCall)>
	//   53  108:return          
	}

	private boolean validate()
	{
		if(type == CashOutType.PAYPAL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #57  <Field CashOutType type>
	//*   2    4:getstatic       #62  <Field CashOutType CashOutType.PAYPAL>
	//*   3    7:if_acmpne       68
		{
			boolean flag = validation.isEntered(firstName);
	//    4   10:aload_0         
	//    5   11:getfield        #34  <Field Validation validation>
	//    6   14:aload_0         
	//    7   15:getfield        #68  <Field String firstName>
	//    8   18:invokeinterface #117 <Method boolean Validation.isEntered(String)>
	//    9   23:istore_1        
			boolean flag1 = validation.isEntered(lastName);
	//   10   24:aload_0         
	//   11   25:getfield        #34  <Field Validation validation>
	//   12   28:aload_0         
	//   13   29:getfield        #66  <Field String lastName>
	//   14   32:invokeinterface #117 <Method boolean Validation.isEntered(String)>
	//   15   37:istore_2        
			boolean flag2 = validation.isEntered(emailAddress);
	//   16   38:aload_0         
	//   17   39:getfield        #34  <Field Validation validation>
	//   18   42:aload_0         
	//   19   43:getfield        #97  <Field String emailAddress>
	//   20   46:invokeinterface #117 <Method boolean Validation.isEntered(String)>
	//   21   51:istore_3        
			return flag && flag1 && flag2;
	//   22   52:iload_1         
	//   23   53:ifeq            66
	//   24   56:iload_2         
	//   25   57:ifeq            66
	//   26   60:iload_3         
	//   27   61:ifeq            66
	//   28   64:iconst_1        
	//   29   65:ireturn         
	//   30   66:iconst_0        
	//   31   67:ireturn         
		} else
		{
			return validation.isEntered(emailAddress);
	//   32   68:aload_0         
	//   33   69:getfield        #34  <Field Validation validation>
	//   34   72:aload_0         
	//   35   73:getfield        #97  <Field String emailAddress>
	//   36   76:invokeinterface #117 <Method boolean Validation.isEntered(String)>
	//   37   81:ireturn         
		}
	}

	protected Set getFetchJobs()
	{
		return ((Set) (new HashSet()));
	//    0    0:new             #121 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void HashSet()>
	//    3    7:areturn         
	}

	protected void onAbandonFetchJobs()
	{
	//    0    0:return          
	}

	public void onEmailChanged(String s)
	{
		emailAddress = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field String emailAddress>
		((LinkCashAccountView)mvpView).setLinkAccountEnabled(validate());
	//    3    5:aload_0         
	//    4    6:getfield        #130 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5    9:checkcast       #132 <Class LinkCashAccountView>
	//    6   12:aload_0         
	//    7   13:invokespecial   #134 <Method boolean validate()>
	//    8   16:invokeinterface #138 <Method void LinkCashAccountView.setLinkAccountEnabled(boolean)>
	//    9   21:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
	//    0    0:return          
	}

	public void onFirstNameChanged(String s)
	{
		firstName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field String firstName>
		((LinkCashAccountView)mvpView).setLinkAccountEnabled(validate());
	//    3    5:aload_0         
	//    4    6:getfield        #130 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5    9:checkcast       #132 <Class LinkCashAccountView>
	//    6   12:aload_0         
	//    7   13:invokespecial   #134 <Method boolean validate()>
	//    8   16:invokeinterface #138 <Method void LinkCashAccountView.setLinkAccountEnabled(boolean)>
	//    9   21:return          
	}

	public void onLastNameChanged(String s)
	{
		lastName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #66  <Field String lastName>
		((LinkCashAccountView)mvpView).setLinkAccountEnabled(validate());
	//    3    5:aload_0         
	//    4    6:getfield        #130 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5    9:checkcast       #132 <Class LinkCashAccountView>
	//    6   12:aload_0         
	//    7   13:invokespecial   #134 <Method boolean validate()>
	//    8   16:invokeinterface #138 <Method void LinkCashAccountView.setLinkAccountEnabled(boolean)>
	//    9   21:return          
	}

	public void onLinkAccountClicked()
	{
		if(validate() && validation.isValidEmail(emailAddress))
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #134 <Method boolean validate()>
	//*   2    4:ifeq            40
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field Validation validation>
	//*   5   11:aload_0         
	//*   6   12:getfield        #97  <Field String emailAddress>
	//*   7   15:invokeinterface #145 <Method boolean Validation.isValidEmail(String)>
	//*   8   20:ifeq            40
		{
			((LinkCashAccountView)mvpView).showCapturePassword(emailAddress);
	//    9   23:aload_0         
	//   10   24:getfield        #130 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   11   27:checkcast       #132 <Class LinkCashAccountView>
	//   12   30:aload_0         
	//   13   31:getfield        #97  <Field String emailAddress>
	//   14   34:invokeinterface #148 <Method void LinkCashAccountView.showCapturePassword(String)>
			return;
	//   15   39:return          
		} else
		{
			((LinkCashAccountView)mvpView).showInvalidEmailAddress();
	//   16   40:aload_0         
	//   17   41:getfield        #130 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   18   44:checkcast       #132 <Class LinkCashAccountView>
	//   19   47:invokeinterface #151 <Method void LinkCashAccountView.showInvalidEmailAddress()>
			return;
	//   20   52:return          
		}
	}

	public void onPasswordCaptured(String s)
	{
		password = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #92  <Field String password>
		linkAccount();
	//    3    5:aload_0         
	//    4    6:invokespecial   #154 <Method void linkAccount()>
	//    5    9:return          
	}

	protected void onSubmitJobSuccess(SingleApiJob singleapijob)
	{
		super.onSubmitJobSuccess(singleapijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #158 <Method void AbstractPasswordUsingMvpPresenter.onSubmitJobSuccess(SingleApiJob)>
		if(singleapijob.getApiCall() instanceof CustomerAccountsAddCall)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #164 <Method com.ibotta.api.ApiCall SingleApiJob.getApiCall()>
	//*   5    9:instanceof      #102 <Class CustomerAccountsAddCall>
	//*   6   12:ifeq            45
		{
			cacheClearFactory.create().clearCustomerAccounts(true).clearCustomer(false).clear();
	//    7   15:aload_0         
	//    8   16:getfield        #36  <Field CacheClearJobFactory cacheClearFactory>
	//    9   19:invokevirtual   #170 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//   10   22:iconst_1        
	//   11   23:invokevirtual   #176 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomerAccounts(boolean)>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #179 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//   14   30:invokevirtual   #182 <Method void CacheClearBatchApiJob.clear()>
			((LinkCashAccountView)mvpView).finish();
	//   15   33:aload_0         
	//   16   34:getfield        #130 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   37:checkcast       #132 <Class LinkCashAccountView>
	//   18   40:invokeinterface #185 <Method void LinkCashAccountView.finish()>
		}
	//   19   45:return          
	}

	public void setAccountType(CashOutType cashouttype)
	{
		type = cashouttype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #57  <Field CashOutType type>
		((LinkCashAccountView)mvpView).setLinkAccountTitle(linkCashAccountReducer.createTitle(cashouttype.getName()));
	//    3    5:aload_0         
	//    4    6:getfield        #130 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5    9:checkcast       #132 <Class LinkCashAccountView>
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field LinkCashAccountReducer linkCashAccountReducer>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #191 <Method String CashOutType.getName()>
	//   10   20:invokevirtual   #197 <Method com.ibotta.android.views.base.title.TitleBarViewState LinkCashAccountReducer.createTitle(String)>
	//   11   23:invokeinterface #201 <Method void LinkCashAccountView.setLinkAccountTitle(com.ibotta.android.views.base.title.TitleBarViewState)>
	//   12   28:return          
	}

	private static final String PAYPAL_ACCT_HOLDER_FMT = "%1$s, %2$s";
	private final CacheClearJobFactory cacheClearFactory;
	private String emailAddress;
	private String firstName;
	private String lastName;
	private final LinkCashAccountReducer linkCashAccountReducer;
	private String password;
	private CashOutType type;
	private final UserState userState;
	private final Validation validation;
}
