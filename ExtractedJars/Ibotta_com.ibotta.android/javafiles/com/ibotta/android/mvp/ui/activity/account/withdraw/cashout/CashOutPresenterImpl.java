// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout;

import com.ibotta.android.account.withdraw.CashOutReducer;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter;
import com.ibotta.android.mvp.ui.activity.account.withdraw.CashOutType;
import com.ibotta.android.mvp.ui.activity.account.withdraw.WithdrawalDetails;
import com.ibotta.android.service.api.Outcome;
import com.ibotta.android.service.api.job.*;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.util.Formatting;
import com.ibotta.android.util.Validation;
import com.ibotta.api.EmptyResponse;
import com.ibotta.api.call.customer.CustomerByIdCall;
import com.ibotta.api.call.customer.CustomerByIdResponse;
import com.ibotta.api.call.customer.accounts.*;
import com.ibotta.api.model.customer.Customer;
import com.ibotta.api.model.customer.CustomerAccount;
import java.util.*;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout:
//			CashOutPresenter, CashOutView

public class CashOutPresenterImpl extends AbstractPasswordUsingMvpPresenter
	implements CashOutPresenter
{

	public CashOutPresenterImpl(MvpPresenterActions mvppresenteractions, UserState userstate, Validation validation1, Formatting formatting1, CacheClearJobFactory cacheclearjobfactory, CashOutReducer cashoutreducer)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #36  <Method void AbstractPasswordUsingMvpPresenter(MvpPresenterActions)>
		userState = userstate;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #38  <Field UserState userState>
		validation = validation1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #40  <Field Validation validation>
		formatting = formatting1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #42  <Field Formatting formatting>
		cacheClearFactory = cacheclearjobfactory;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #44  <Field CacheClearJobFactory cacheClearFactory>
		cashOutReducer = cashoutreducer;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #46  <Field CashOutReducer cashOutReducer>
	//   18   33:return          
	}

	private void cashOutSuccess()
	{
		cacheClearFactory.create().clearCustomerAccounts(false).clearCustomer(false).clear();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field CacheClearJobFactory cacheClearFactory>
	//    2    4:invokevirtual   #55  <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #61  <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomerAccounts(boolean)>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #64  <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//    7   15:invokevirtual   #67  <Method void CacheClearBatchApiJob.clear()>
		((CashOutView)mvpView).finishSuccessfully(getWithdrawalDetails());
	//    8   18:aload_0         
	//    9   19:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   10   22:checkcast       #73  <Class CashOutView>
	//   11   25:aload_0         
	//   12   26:invokespecial   #77  <Method WithdrawalDetails getWithdrawalDetails()>
	//   13   29:invokeinterface #81  <Method void CashOutView.finishSuccessfully(WithdrawalDetails)>
	//   14   34:return          
	}

	private String getAmountRemaining()
	{
		float f;
		if(!amount.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #85  <Field String amount>
	//*   2    4:invokevirtual   #91  <Method boolean String.isEmpty()>
	//*   3    7:ifne            24
			f = Float.valueOf(amount).floatValue();
	//    4   10:aload_0         
	//    5   11:getfield        #85  <Field String amount>
	//    6   14:invokestatic    #97  <Method Float Float.valueOf(String)>
	//    7   17:invokevirtual   #101 <Method float Float.floatValue()>
	//    8   20:fstore_1        
		else
	//*   9   21:goto            26
			f = 0.0F;
	//   10   24:fconst_0        
	//   11   25:fstore_1        
		float f1 = customer.getBalance();
	//   12   26:aload_0         
	//   13   27:getfield        #103 <Field Customer customer>
	//   14   30:invokevirtual   #108 <Method float Customer.getBalance()>
	//   15   33:fstore_2        
		return formatting.currencyPositiveOrZeroLeadingZero(f1 - f);
	//   16   34:aload_0         
	//   17   35:getfield        #42  <Field Formatting formatting>
	//   18   38:fload_2         
	//   19   39:fload_1         
	//   20   40:fsub            
	//   21   41:f2d             
	//   22   42:invokeinterface #114 <Method String Formatting.currencyPositiveOrZeroLeadingZero(double)>
	//   23   47:areturn         
	}

	private CustomerAccount getCustomerAccount()
	{
		for(Iterator iterator = ((CustomerAccountsResponse)customerAccountsJob.getApiResponse()).getCustomerAccounts().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #118 <Field RelayApiJob customerAccountsJob>
	//*   2    4:invokevirtual   #124 <Method com.ibotta.api.ApiResponse RelayApiJob.getApiResponse()>
	//*   3    7:checkcast       #126 <Class CustomerAccountsResponse>
	//*   4   10:invokevirtual   #130 <Method List CustomerAccountsResponse.getCustomerAccounts()>
	//*   5   13:invokeinterface #136 <Method Iterator List.iterator()>
	//*   6   18:astore_1        
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #141 <Method boolean Iterator.hasNext()>
	//*   9   25:ifeq            82
		{
			CustomerAccount customeraccount = (CustomerAccount)iterator.next();
	//   10   28:aload_1         
	//   11   29:invokeinterface #145 <Method Object Iterator.next()>
	//   12   34:checkcast       #147 <Class CustomerAccount>
	//   13   37:astore_2        
			if(CashOutType.PAYPAL == type && customeraccount.getTypeEnum() == com.ibotta.api.model.customer.CustomerAccount.Type.PAYPAL)
	//*  14   38:getstatic       #152 <Field CashOutType CashOutType.PAYPAL>
	//*  15   41:aload_0         
	//*  16   42:getfield        #154 <Field CashOutType type>
	//*  17   45:if_acmpne       60
	//*  18   48:aload_2         
	//*  19   49:invokevirtual   #158 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//*  20   52:getstatic       #163 <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.PAYPAL>
	//*  21   55:if_acmpne       60
				return customeraccount;
	//   22   58:aload_2         
	//   23   59:areturn         
			if(CashOutType.VENMO == type && customeraccount.getTypeEnum() == com.ibotta.api.model.customer.CustomerAccount.Type.VENMO)
	//*  24   60:getstatic       #166 <Field CashOutType CashOutType.VENMO>
	//*  25   63:aload_0         
	//*  26   64:getfield        #154 <Field CashOutType type>
	//*  27   67:if_acmpne       19
	//*  28   70:aload_2         
	//*  29   71:invokevirtual   #158 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//*  30   74:getstatic       #168 <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.VENMO>
	//*  31   77:if_acmpne       19
				return customeraccount;
	//   32   80:aload_2         
	//   33   81:areturn         
		}

		return null;
	//   34   82:aconst_null     
	//   35   83:areturn         
	}

	private WithdrawalDetails getWithdrawalDetails()
	{
		WithdrawalDetails withdrawaldetails = new WithdrawalDetails();
	//    0    0:new             #171 <Class WithdrawalDetails>
	//    1    3:dup             
	//    2    4:invokespecial   #173 <Method void WithdrawalDetails()>
	//    3    7:astore_1        
		if(customerAccount != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #175 <Field CustomerAccount customerAccount>
	//*   6   12:ifnull          40
		{
			withdrawaldetails.setAmount(Float.valueOf(amount).floatValue());
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #85  <Field String amount>
	//   10   20:invokestatic    #97  <Method Float Float.valueOf(String)>
	//   11   23:invokevirtual   #101 <Method float Float.floatValue()>
	//   12   26:invokevirtual   #179 <Method void WithdrawalDetails.setAmount(float)>
			withdrawaldetails.setMethod(customerAccount.getType());
	//   13   29:aload_1         
	//   14   30:aload_0         
	//   15   31:getfield        #175 <Field CustomerAccount customerAccount>
	//   16   34:invokevirtual   #182 <Method String CustomerAccount.getType()>
	//   17   37:invokevirtual   #186 <Method void WithdrawalDetails.setMethod(String)>
		}
		return withdrawaldetails;
	//   18   40:aload_1         
	//   19   41:areturn         
	}

	private void setAmounts(float f)
	{
		CashOutView cashoutview = (CashOutView)mvpView;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #73  <Class CashOutView>
	//    3    7:astore          4
		Formatting formatting1 = formatting;
	//    4    9:aload_0         
	//    5   10:getfield        #42  <Field Formatting formatting>
	//    6   13:astore          5
		double d = f;
	//    7   15:fload_1         
	//    8   16:f2d             
	//    9   17:dstore_2        
		cashoutview.setAmountAvailable(formatting1.currencyPositiveOrZeroLeadingZero(d));
	//   10   18:aload           4
	//   11   20:aload           5
	//   12   22:dload_2         
	//   13   23:invokeinterface #114 <Method String Formatting.currencyPositiveOrZeroLeadingZero(double)>
	//   14   28:invokeinterface #190 <Method void CashOutView.setAmountAvailable(String)>
		((CashOutView)mvpView).setAmountRemaining(formatting.currencyPositiveOrZeroNoLeadingZero(d));
	//   15   33:aload_0         
	//   16   34:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   37:checkcast       #73  <Class CashOutView>
	//   18   40:aload_0         
	//   19   41:getfield        #42  <Field Formatting formatting>
	//   20   44:dload_2         
	//   21   45:invokeinterface #193 <Method String Formatting.currencyPositiveOrZeroNoLeadingZero(double)>
	//   22   50:invokeinterface #196 <Method void CashOutView.setAmountRemaining(String)>
	//   23   55:return          
	}

	private void submitCashOutCall(com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall.CallParams callparams)
	{
		if(type == CashOutType.PAYPAL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #154 <Field CashOutType type>
	//*   2    4:getstatic       #152 <Field CashOutType CashOutType.PAYPAL>
	//*   3    7:if_acmpne       22
			callparams = ((com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall.CallParams) (new CustomerAccountsCashOutPostCall(callparams)));
	//    4   10:new             #200 <Class CustomerAccountsCashOutPostCall>
	//    5   13:dup             
	//    6   14:aload_1         
	//    7   15:invokespecial   #202 <Method void CustomerAccountsCashOutPostCall(com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams)>
	//    8   18:astore_1        
		else
	//*   9   19:goto            31
			callparams = ((com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall.CallParams) (new CustomerAccountsCashOutPostCall(callparams)));
	//   10   22:new             #200 <Class CustomerAccountsCashOutPostCall>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:invokespecial   #202 <Method void CustomerAccountsCashOutPostCall(com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams)>
	//   14   30:astore_1        
		submitApiCall(((com.ibotta.api.ApiCall) (callparams)));
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #206 <Method void submitApiCall(com.ibotta.api.ApiCall)>
	//   18   36:return          
	}

	private void transferCash()
	{
		if(customerAccount != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #175 <Field CustomerAccount customerAccount>
	//*   2    4:ifnull          88
		{
			com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall.CallParams callparams = new com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall.CallParams();
	//    3    7:new             #209 <Class com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams>
	//    4   10:dup             
	//    5   11:invokespecial   #210 <Method void com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams()>
	//    6   14:astore_1        
			callparams.setCustomerId(userState.getCustomerId());
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #38  <Field UserState userState>
	//   10   20:invokeinterface #216 <Method int UserState.getCustomerId()>
	//   11   25:invokevirtual   #220 <Method void com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams.setCustomerId(int)>
			callparams.setPassword(password);
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:getfield        #222 <Field String password>
	//   15   33:invokevirtual   #225 <Method void com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams.setPassword(String)>
			callparams.setAccountId(customerAccount.getId());
	//   16   36:aload_1         
	//   17   37:aload_0         
	//   18   38:getfield        #175 <Field CustomerAccount customerAccount>
	//   19   41:invokevirtual   #228 <Method int CustomerAccount.getId()>
	//   20   44:invokevirtual   #231 <Method void com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams.setAccountId(int)>
			callparams.setAmount(Float.parseFloat(amount));
	//   21   47:aload_1         
	//   22   48:aload_0         
	//   23   49:getfield        #85  <Field String amount>
	//   24   52:invokestatic    #235 <Method float Float.parseFloat(String)>
	//   25   55:invokevirtual   #236 <Method void com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams.setAmount(float)>
			callparams.setActionCounter((int)(System.currentTimeMillis() / 1000L));
	//   26   58:aload_1         
	//   27   59:invokestatic    #242 <Method long System.currentTimeMillis()>
	//   28   62:ldc2w           #243 <Long 1000L>
	//   29   65:ldiv            
	//   30   66:l2i             
	//   31   67:invokevirtual   #247 <Method void com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams.setActionCounter(int)>
			callparams.setReferenceId(userState.getVerifiedDeviceReferenceId());
	//   32   70:aload_1         
	//   33   71:aload_0         
	//   34   72:getfield        #38  <Field UserState userState>
	//   35   75:invokeinterface #250 <Method String UserState.getVerifiedDeviceReferenceId()>
	//   36   80:invokevirtual   #253 <Method void com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams.setReferenceId(String)>
			submitCashOutCall(callparams);
	//   37   83:aload_0         
	//   38   84:aload_1         
	//   39   85:invokespecial   #255 <Method void submitCashOutCall(com.ibotta.api.call.customer.accounts.CustomerAccountsCashOutPostCall$CallParams)>
		}
	//   40   88:return          
	}

	private boolean validate()
	{
		CustomerAccount customeraccount = customerAccount;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field CustomerAccount customerAccount>
	//    2    4:astore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		if(customeraccount != null && validation.isNumeric(amount) && validation.isEntered(amount))
	//*   5    8:aload           4
	//*   6   10:ifnull          92
	//*   7   13:aload_0         
	//*   8   14:getfield        #40  <Field Validation validation>
	//*   9   17:aload_0         
	//*  10   18:getfield        #85  <Field String amount>
	//*  11   21:invokeinterface #262 <Method boolean Validation.isNumeric(String)>
	//*  12   26:ifeq            92
	//*  13   29:aload_0         
	//*  14   30:getfield        #40  <Field Validation validation>
	//*  15   33:aload_0         
	//*  16   34:getfield        #85  <Field String amount>
	//*  17   37:invokeinterface #265 <Method boolean Validation.isEntered(String)>
	//*  18   42:ifeq            92
		{
			float f = Float.parseFloat(amount);
	//   19   45:aload_0         
	//   20   46:getfield        #85  <Field String amount>
	//   21   49:invokestatic    #235 <Method float Float.parseFloat(String)>
	//   22   52:fstore_1        
			boolean flag = flag1;
	//   23   53:iload_3         
	//   24   54:istore_2        
			if(f >= customer.getMinimumAmountForType(customerAccount.getTypeEnum()))
	//*  25   55:fload_1         
	//*  26   56:aload_0         
	//*  27   57:getfield        #103 <Field Customer customer>
	//*  28   60:aload_0         
	//*  29   61:getfield        #175 <Field CustomerAccount customerAccount>
	//*  30   64:invokevirtual   #158 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//*  31   67:invokevirtual   #269 <Method float Customer.getMinimumAmountForType(com.ibotta.api.model.customer.CustomerAccount$Type)>
	//*  32   70:fcmpl           
	//*  33   71:iflt            90
			{
				flag = flag1;
	//   34   74:iload_3         
	//   35   75:istore_2        
				if(f <= customer.getBalance())
	//*  36   76:fload_1         
	//*  37   77:aload_0         
	//*  38   78:getfield        #103 <Field Customer customer>
	//*  39   81:invokevirtual   #108 <Method float Customer.getBalance()>
	//*  40   84:fcmpg           
	//*  41   85:ifgt            90
					flag = true;
	//   42   88:iconst_1        
	//   43   89:istore_2        
			}
			return flag;
	//   44   90:iload_2         
	//   45   91:ireturn         
		} else
		{
			return false;
	//   46   92:iconst_0        
	//   47   93:ireturn         
		}
	}

	protected Set getFetchJobs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #273 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #274 <Method void HashSet()>
	//    3    7:astore_1        
		if(custByIdJob == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #276 <Field SingleApiJob custByIdJob>
	//*   6   12:ifnonnull       42
			custByIdJob = new SingleApiJob(((com.ibotta.api.ApiCall) (new CustomerByIdCall(userState.getCustomerId()))));
	//    7   15:aload_0         
	//    8   16:new             #278 <Class SingleApiJob>
	//    9   19:dup             
	//   10   20:new             #280 <Class CustomerByIdCall>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #38  <Field UserState userState>
	//   14   28:invokeinterface #216 <Method int UserState.getCustomerId()>
	//   15   33:invokespecial   #282 <Method void CustomerByIdCall(int)>
	//   16   36:invokespecial   #284 <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   17   39:putfield        #276 <Field SingleApiJob custByIdJob>
		if(customerAccountsJob == null)
	//*  18   42:aload_0         
	//*  19   43:getfield        #118 <Field RelayApiJob customerAccountsJob>
	//*  20   46:ifnonnull       76
			customerAccountsJob = new RelayApiJob(((com.ibotta.api.ApiCall) (new CustomerAccountsCall(userState.getCustomerId()))));
	//   21   49:aload_0         
	//   22   50:new             #120 <Class RelayApiJob>
	//   23   53:dup             
	//   24   54:new             #286 <Class CustomerAccountsCall>
	//   25   57:dup             
	//   26   58:aload_0         
	//   27   59:getfield        #38  <Field UserState userState>
	//   28   62:invokeinterface #216 <Method int UserState.getCustomerId()>
	//   29   67:invokespecial   #287 <Method void CustomerAccountsCall(int)>
	//   30   70:invokespecial   #288 <Method void RelayApiJob(com.ibotta.api.ApiCall)>
	//   31   73:putfield        #118 <Field RelayApiJob customerAccountsJob>
		((Set) (hashset)).add(((Object) (custByIdJob)));
	//   32   76:aload_1         
	//   33   77:aload_0         
	//   34   78:getfield        #276 <Field SingleApiJob custByIdJob>
	//   35   81:invokeinterface #294 <Method boolean Set.add(Object)>
	//   36   86:pop             
		((Set) (hashset)).add(((Object) (customerAccountsJob)));
	//   37   87:aload_1         
	//   38   88:aload_0         
	//   39   89:getfield        #118 <Field RelayApiJob customerAccountsJob>
	//   40   92:invokeinterface #294 <Method boolean Set.add(Object)>
	//   41   97:pop             
		return ((Set) (hashset));
	//   42   98:aload_1         
	//   43   99:areturn         
	}

	protected boolean isAccountsLoadable()
	{
		customer = ((CustomerByIdResponse)custByIdJob.getApiResponse()).getCustomer();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #276 <Field SingleApiJob custByIdJob>
	//    3    5:invokevirtual   #298 <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//    4    8:checkcast       #300 <Class CustomerByIdResponse>
	//    5   11:invokevirtual   #304 <Method Customer CustomerByIdResponse.getCustomer()>
	//    6   14:putfield        #103 <Field Customer customer>
		return customer.isConfirmationRequired() ^ true;
	//    7   17:aload_0         
	//    8   18:getfield        #103 <Field Customer customer>
	//    9   21:invokevirtual   #307 <Method boolean Customer.isConfirmationRequired()>
	//   10   24:iconst_1        
	//   11   25:ixor            
	//   12   26:ireturn         
	}

	protected void onAbandonFetchJobs()
	{
	//    0    0:return          
	}

	public void onAmountChanged(String s)
	{
		amount = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #85  <Field String amount>
		boolean flag = validate();
	//    3    5:aload_0         
	//    4    6:invokespecial   #311 <Method boolean validate()>
	//    5    9:istore_2        
		((CashOutView)mvpView).setTransferCashEnabled(flag);
	//    6   10:aload_0         
	//    7   11:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    8   14:checkcast       #73  <Class CashOutView>
	//    9   17:iload_2         
	//   10   18:invokeinterface #315 <Method void CashOutView.setTransferCashEnabled(boolean)>
		if(flag)
	//*  11   23:iload_2         
	//*  12   24:ifeq            43
			((CashOutView)mvpView).setAmountRemaining(getAmountRemaining());
	//   13   27:aload_0         
	//   14   28:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   15   31:checkcast       #73  <Class CashOutView>
	//   16   34:aload_0         
	//   17   35:invokespecial   #317 <Method String getAmountRemaining()>
	//   18   38:invokeinterface #196 <Method void CashOutView.setAmountRemaining(String)>
	//   19   43:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		customer = ((CustomerByIdResponse)custByIdJob.getApiResponse()).getCustomer();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #276 <Field SingleApiJob custByIdJob>
	//    3    5:invokevirtual   #298 <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//    4    8:checkcast       #300 <Class CustomerByIdResponse>
	//    5   11:invokevirtual   #304 <Method Customer CustomerByIdResponse.getCustomer()>
	//    6   14:putfield        #103 <Field Customer customer>
		customerAccount = getCustomerAccount();
	//    7   17:aload_0         
	//    8   18:aload_0         
	//    9   19:invokespecial   #320 <Method CustomerAccount getCustomerAccount()>
	//   10   22:putfield        #175 <Field CustomerAccount customerAccount>
		if(customerAccount != null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #175 <Field CustomerAccount customerAccount>
	//*  13   29:ifnull          77
		{
			((CashOutView)mvpView).setAccountName(customerAccount.getAccountNumber());
	//   14   32:aload_0         
	//   15   33:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   16   36:checkcast       #73  <Class CashOutView>
	//   17   39:aload_0         
	//   18   40:getfield        #175 <Field CustomerAccount customerAccount>
	//   19   43:invokevirtual   #323 <Method String CustomerAccount.getAccountNumber()>
	//   20   46:invokeinterface #326 <Method void CashOutView.setAccountName(String)>
			((CashOutView)mvpView).setMinimumCashOutAmountHint(customer.getMinimumAmountForType(customerAccount.getTypeEnum()));
	//   21   51:aload_0         
	//   22   52:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   23   55:checkcast       #73  <Class CashOutView>
	//   24   58:aload_0         
	//   25   59:getfield        #103 <Field Customer customer>
	//   26   62:aload_0         
	//   27   63:getfield        #175 <Field CustomerAccount customerAccount>
	//   28   66:invokevirtual   #158 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//   29   69:invokevirtual   #269 <Method float Customer.getMinimumAmountForType(com.ibotta.api.model.customer.CustomerAccount$Type)>
	//   30   72:invokeinterface #329 <Method void CashOutView.setMinimumCashOutAmountHint(float)>
		}
	//   31   77:return          
	}

	protected void onFetchJobFailed(ApiJob apijob)
	{
		super.onFetchJobFailed(apijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #333 <Method void AbstractPasswordUsingMvpPresenter.onFetchJobFailed(ApiJob)>
		customerAccountsJob.setResult(Outcome.ERROR, ((com.ibotta.api.ApiResponse) (new EmptyResponse())));
	//    3    5:aload_0         
	//    4    6:getfield        #118 <Field RelayApiJob customerAccountsJob>
	//    5    9:getstatic       #339 <Field Outcome Outcome.ERROR>
	//    6   12:new             #341 <Class EmptyResponse>
	//    7   15:dup             
	//    8   16:invokespecial   #342 <Method void EmptyResponse()>
	//    9   19:invokevirtual   #346 <Method void RelayApiJob.setResult(Outcome, com.ibotta.api.ApiResponse)>
	//   10   22:return          
	}

	protected void onFetchJobSuccess(ApiJob apijob)
	{
		super.onFetchJobSuccess(apijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #349 <Method void AbstractPasswordUsingMvpPresenter.onFetchJobSuccess(ApiJob)>
		SingleApiJob singleapijob = custByIdJob;
	//    3    5:aload_0         
	//    4    6:getfield        #276 <Field SingleApiJob custByIdJob>
	//    5    9:astore_2        
		if(apijob == singleapijob)
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:if_acmpne       65
		{
			setAmounts(((CustomerByIdResponse)singleapijob.getApiResponse()).getCustomer().getBalance());
	//    9   15:aload_0         
	//   10   16:aload_2         
	//   11   17:invokevirtual   #298 <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//   12   20:checkcast       #300 <Class CustomerByIdResponse>
	//   13   23:invokevirtual   #304 <Method Customer CustomerByIdResponse.getCustomer()>
	//   14   26:invokevirtual   #108 <Method float Customer.getBalance()>
	//   15   29:invokespecial   #351 <Method void setAmounts(float)>
			if(isAccountsLoadable())
	//*  16   32:aload_0         
	//*  17   33:invokevirtual   #353 <Method boolean isAccountsLoadable()>
	//*  18   36:ifeq            48
			{
				customerAccountsJob.signal(false);
	//   19   39:aload_0         
	//   20   40:getfield        #118 <Field RelayApiJob customerAccountsJob>
	//   21   43:iconst_0        
	//   22   44:invokevirtual   #356 <Method void RelayApiJob.signal(boolean)>
				return;
	//   23   47:return          
			}
			customerAccountsJob.setResult(Outcome.SUCCESS, ((com.ibotta.api.ApiResponse) (new EmptyResponse())));
	//   24   48:aload_0         
	//   25   49:getfield        #118 <Field RelayApiJob customerAccountsJob>
	//   26   52:getstatic       #359 <Field Outcome Outcome.SUCCESS>
	//   27   55:new             #341 <Class EmptyResponse>
	//   28   58:dup             
	//   29   59:invokespecial   #342 <Method void EmptyResponse()>
	//   30   62:invokevirtual   #346 <Method void RelayApiJob.setResult(Outcome, com.ibotta.api.ApiResponse)>
		}
	//   31   65:return          
	}

	public void onPasswordCaptured(String s)
	{
		password = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #222 <Field String password>
		transferCash();
	//    3    5:aload_0         
	//    4    6:invokespecial   #362 <Method void transferCash()>
	//    5    9:return          
	}

	protected void onSubmitJobSuccess(SingleApiJob singleapijob)
	{
		super.onSubmitJobSuccess(singleapijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #366 <Method void AbstractPasswordUsingMvpPresenter.onSubmitJobSuccess(SingleApiJob)>
		if(type == CashOutType.PAYPAL && (singleapijob.getApiCall() instanceof CustomerAccountsCashOutPostCall))
	//*   3    5:aload_0         
	//*   4    6:getfield        #154 <Field CashOutType type>
	//*   5    9:getstatic       #152 <Field CashOutType CashOutType.PAYPAL>
	//*   6   12:if_acmpne       30
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #370 <Method com.ibotta.api.ApiCall SingleApiJob.getApiCall()>
	//*   9   19:instanceof      #200 <Class CustomerAccountsCashOutPostCall>
	//*  10   22:ifeq            30
		{
			cashOutSuccess();
	//   11   25:aload_0         
	//   12   26:invokespecial   #372 <Method void cashOutSuccess()>
			return;
	//   13   29:return          
		}
		if(singleapijob.getApiCall() instanceof CustomerAccountsCashOutPostCall)
	//*  14   30:aload_1         
	//*  15   31:invokevirtual   #370 <Method com.ibotta.api.ApiCall SingleApiJob.getApiCall()>
	//*  16   34:instanceof      #200 <Class CustomerAccountsCashOutPostCall>
	//*  17   37:ifeq            44
			cashOutSuccess();
	//   18   40:aload_0         
	//   19   41:invokespecial   #372 <Method void cashOutSuccess()>
	//   20   44:return          
	}

	public void onTransferCashClicked()
	{
		if(validate())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #311 <Method boolean validate()>
	//*   2    4:ifeq            27
		{
			((CashOutView)mvpView).showCapturePassword(customer.getEmail());
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5   11:checkcast       #73  <Class CashOutView>
	//    6   14:aload_0         
	//    7   15:getfield        #103 <Field Customer customer>
	//    8   18:invokevirtual   #376 <Method String Customer.getEmail()>
	//    9   21:invokeinterface #379 <Method void CashOutView.showCapturePassword(String)>
			return;
	//   10   26:return          
		} else
		{
			((CashOutView)mvpView).showInvalidAmount();
	//   11   27:aload_0         
	//   12   28:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   13   31:checkcast       #73  <Class CashOutView>
	//   14   34:invokeinterface #382 <Method void CashOutView.showInvalidAmount()>
			return;
	//   15   39:return          
		}
	}

	public void setAccountType(CashOutType cashouttype)
	{
		type = cashouttype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #154 <Field CashOutType type>
		((CashOutView)mvpView).setTransferToTitle(cashOutReducer.createTitle(cashouttype.name()));
	//    3    5:aload_0         
	//    4    6:getfield        #71  <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5    9:checkcast       #73  <Class CashOutView>
	//    6   12:aload_0         
	//    7   13:getfield        #46  <Field CashOutReducer cashOutReducer>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #387 <Method String CashOutType.name()>
	//   10   20:invokevirtual   #393 <Method com.ibotta.android.views.base.title.TitleBarViewState CashOutReducer.createTitle(String)>
	//   11   23:invokeinterface #397 <Method void CashOutView.setTransferToTitle(com.ibotta.android.views.base.title.TitleBarViewState)>
	//   12   28:return          
	}

	private String amount;
	private final CacheClearJobFactory cacheClearFactory;
	private final CashOutReducer cashOutReducer;
	private SingleApiJob custByIdJob;
	private Customer customer;
	private CustomerAccount customerAccount;
	protected RelayApiJob customerAccountsJob;
	private final Formatting formatting;
	private String password;
	private CashOutType type;
	private final UserState userState;
	private final Validation validation;
}
