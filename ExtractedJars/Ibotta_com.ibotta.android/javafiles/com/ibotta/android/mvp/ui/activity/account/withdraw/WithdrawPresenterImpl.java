// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import com.ibotta.android.account.withdraw.WithdrawReducer;
import com.ibotta.android.api.auth.PostAuthWorkJobFactory;
import com.ibotta.android.collection.GiftCardComparator;
import com.ibotta.android.collection.GiftCardTemplateComparator;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractPasswordUsingMvpPresenter;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.CashOutRow;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.EmptyWithdrawRow;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.GiftCardRow;
import com.ibotta.android.mvp.ui.activity.account.withdraw.row.TitleBarRow;
import com.ibotta.android.service.api.Outcome;
import com.ibotta.android.service.api.job.*;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.state.app.config.invitefriends.InviteFriendsCopyConfig;
import com.ibotta.android.state.app.config.paypal.PayPalAppConfig;
import com.ibotta.android.state.app.config.venmo.VenmoAppConfig;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.tracking.braze.BrazeTracking;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.ApiResponse;
import com.ibotta.api.EmptyResponse;
import com.ibotta.api.call.card.GiftCardsCall;
import com.ibotta.api.call.card.GiftCardsResponse;
import com.ibotta.api.call.customer.*;
import com.ibotta.api.call.customer.accounts.*;
import com.ibotta.api.helper.card.GiftCardHelper;
import com.ibotta.api.model.card.GiftCard;
import com.ibotta.api.model.customer.Customer;
import com.ibotta.api.model.customer.CustomerAccount;
import java.util.*;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawPresenter, CashOutType, WithdrawView, WithdrawalDetails

public class WithdrawPresenterImpl extends AbstractPasswordUsingMvpPresenter
	implements WithdrawPresenter, ApiJobListener
{

	public WithdrawPresenterImpl(MvpPresenterActions mvppresenteractions, Formatting formatting1, UserState userstate, AppConfig appconfig, BrazeTracking brazetracking, GiftCardHelper giftcardhelper, PostAuthWorkJobFactory postauthworkjobfactory, 
			CacheClearJobFactory cacheclearjobfactory, WithdrawReducer withdrawreducer)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #51  <Method void AbstractPasswordUsingMvpPresenter(MvpPresenterActions)>
		formatting = formatting1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #53  <Field Formatting formatting>
		userState = userstate;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #55  <Field UserState userState>
		appConfig = appconfig;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #57  <Field AppConfig appConfig>
		brazeTracking = brazetracking;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #59  <Field BrazeTracking brazeTracking>
		giftCardHelper = giftcardhelper;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #61  <Field GiftCardHelper giftCardHelper>
		postAuthWorkJobFactory = postauthworkjobfactory;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #63  <Field PostAuthWorkJobFactory postAuthWorkJobFactory>
		cacheClearFactory = cacheclearjobfactory;
	//   21   39:aload_0         
	//   22   40:aload           8
	//   23   42:putfield        #65  <Field CacheClearJobFactory cacheClearFactory>
		withdrawReducer = withdrawreducer;
	//   24   45:aload_0         
	//   25   46:aload           9
	//   26   48:putfield        #67  <Field WithdrawReducer withdrawReducer>
	//   27   51:return          
	}

	private void addCashOutRow(List list, List list1, CashOutType cashouttype)
	{
		com.ibotta.api.model.customer.CustomerAccount.Type type;
		if(cashouttype == CashOutType.VENMO)
	//*   0    0:aload_3         
	//*   1    1:getstatic       #75  <Field CashOutType CashOutType.VENMO>
	//*   2    4:if_acmpne       15
			type = com.ibotta.api.model.customer.CustomerAccount.Type.VENMO;
	//    3    7:getstatic       #80  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.VENMO>
	//    4   10:astore          4
		else
	//*   5   12:goto            20
			type = com.ibotta.api.model.customer.CustomerAccount.Type.PAYPAL;
	//    6   15:getstatic       #83  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.PAYPAL>
	//    7   18:astore          4
		list = ((List) (getCustomerAccountForType(list, type)));
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:aload           4
	//   11   24:invokespecial   #87  <Method CustomerAccount getCustomerAccountForType(List, com.ibotta.api.model.customer.CustomerAccount$Type)>
	//   12   27:astore_1        
		if(list != null)
	//*  13   28:aload_1         
	//*  14   29:ifnull          42
			((CustomerAccount) (list)).setServiceEnabled(isServiceEnabled(type));
	//   15   32:aload_1         
	//   16   33:aload_0         
	//   17   34:aload           4
	//   18   36:invokespecial   #91  <Method boolean isServiceEnabled(com.ibotta.api.model.customer.CustomerAccount$Type)>
	//   19   39:invokevirtual   #97  <Method void CustomerAccount.setServiceEnabled(boolean)>
		list1.add(((Object) (new CashOutRow(cashouttype, ((CustomerAccount) (list)), customer.getMinimumVenmoAmount(), belowGlobalMinimumBalance))));
	//   20   42:aload_2         
	//   21   43:new             #99  <Class CashOutRow>
	//   22   46:dup             
	//   23   47:aload_3         
	//   24   48:aload_1         
	//   25   49:aload_0         
	//   26   50:getfield        #101 <Field Customer customer>
	//   27   53:invokevirtual   #107 <Method float Customer.getMinimumVenmoAmount()>
	//   28   56:aload_0         
	//   29   57:getfield        #109 <Field boolean belowGlobalMinimumBalance>
	//   30   60:invokespecial   #112 <Method void CashOutRow(CashOutType, CustomerAccount, float, boolean)>
	//   31   63:invokeinterface #118 <Method boolean List.add(Object)>
	//   32   68:pop             
	//   33   69:return          
	}

	private void deleteAccount()
	{
		submitApiCall(((com.ibotta.api.ApiCall) (new CustomerAccountsDeleteCall(userState.getCustomerId(), customerAccountToDelete.getId()))));
	//    0    0:aload_0         
	//    1    1:new             #124 <Class CustomerAccountsDeleteCall>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #55  <Field UserState userState>
	//    5    9:invokeinterface #130 <Method int UserState.getCustomerId()>
	//    6   14:aload_0         
	//    7   15:getfield        #132 <Field CustomerAccount customerAccountToDelete>
	//    8   18:invokevirtual   #135 <Method int CustomerAccount.getId()>
	//    9   21:invokespecial   #138 <Method void CustomerAccountsDeleteCall(int, int)>
	//   10   24:invokevirtual   #142 <Method void submitApiCall(com.ibotta.api.ApiCall)>
	//   11   27:return          
	}

	private boolean ensureConfirmationAndVerification()
	{
		if(customer.isConfirmationRequired())
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Customer customer>
	//*   2    4:invokevirtual   #147 <Method boolean Customer.isConfirmationRequired()>
	//*   3    7:ifeq            24
		{
			((WithdrawView)mvpView).showEmailConfirmation();
	//    4   10:aload_0         
	//    5   11:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    6   14:checkcast       #153 <Class WithdrawView>
	//    7   17:invokeinterface #156 <Method void WithdrawView.showEmailConfirmation()>
			return false;
	//    8   22:iconst_0        
	//    9   23:ireturn         
		}
		if(isDeviceAuthenticationEnabled() && !isPhoneVerified())
	//*  10   24:aload_0         
	//*  11   25:invokespecial   #159 <Method boolean isDeviceAuthenticationEnabled()>
	//*  12   28:ifeq            52
	//*  13   31:aload_0         
	//*  14   32:invokespecial   #162 <Method boolean isPhoneVerified()>
	//*  15   35:ifne            52
		{
			((WithdrawView)mvpView).showPhoneVerification();
	//   16   38:aload_0         
	//   17   39:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   18   42:checkcast       #153 <Class WithdrawView>
	//   19   45:invokeinterface #165 <Method void WithdrawView.showPhoneVerification()>
			return false;
	//   20   50:iconst_0        
	//   21   51:ireturn         
		} else
		{
			return true;
	//   22   52:iconst_1        
	//   23   53:ireturn         
		}
	}

	private List getCashCustomerAccounts(ApiResponse apiresponse)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #170 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void ArrayList()>
	//    3    7:astore_2        
		if(apiresponse != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          86
		{
			if(apiresponse instanceof EmptyResponse)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #174 <Class EmptyResponse>
	//*   8   16:ifeq            21
				return ((List) (arraylist));
	//    9   19:aload_2         
	//   10   20:areturn         
			apiresponse = ((ApiResponse) (((CustomerAccountsResponse)apiresponse).getCustomerAccounts().iterator()));
	//   11   21:aload_1         
	//   12   22:checkcast       #176 <Class CustomerAccountsResponse>
	//   13   25:invokevirtual   #180 <Method List CustomerAccountsResponse.getCustomerAccounts()>
	//   14   28:invokeinterface #184 <Method Iterator List.iterator()>
	//   15   33:astore_1        
			do
			{
				if(!((Iterator) (apiresponse)).hasNext())
					break;
	//   16   34:aload_1         
	//   17   35:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            84
				CustomerAccount customeraccount = (CustomerAccount)((Iterator) (apiresponse)).next();
	//   19   43:aload_1         
	//   20   44:invokeinterface #193 <Method Object Iterator.next()>
	//   21   49:checkcast       #93  <Class CustomerAccount>
	//   22   52:astore_3        
				if(customeraccount.getTypeEnum() == com.ibotta.api.model.customer.CustomerAccount.Type.PAYPAL || customeraccount.getTypeEnum() == com.ibotta.api.model.customer.CustomerAccount.Type.VENMO)
	//*  23   53:aload_3         
	//*  24   54:invokevirtual   #197 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//*  25   57:getstatic       #83  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.PAYPAL>
	//*  26   60:if_acmpeq       73
	//*  27   63:aload_3         
	//*  28   64:invokevirtual   #197 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//*  29   67:getstatic       #80  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.VENMO>
	//*  30   70:if_acmpne       34
					((List) (arraylist)).add(((Object) (customeraccount)));
	//   31   73:aload_2         
	//   32   74:aload_3         
	//   33   75:invokeinterface #118 <Method boolean List.add(Object)>
	//   34   80:pop             
			} while(true);
	//   35   81:goto            34
			return ((List) (arraylist));
	//   36   84:aload_2         
	//   37   85:areturn         
		} else
		{
			return ((List) (arraylist));
	//   38   86:aload_2         
	//   39   87:areturn         
		}
	}

	private CustomerAccount getCustomerAccountForType(List list, com.ibotta.api.model.customer.CustomerAccount.Type type)
	{
		Iterator iterator = list.iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #184 <Method Iterator List.iterator()>
	//    2    6:astore          4
		list = null;
	//    3    8:aconst_null     
	//    4    9:astore_1        
		do
		{
			if(!iterator.hasNext())
				break;
	//    5   10:aload           4
	//    6   12:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//    7   17:ifeq            44
			CustomerAccount customeraccount = (CustomerAccount)iterator.next();
	//    8   20:aload           4
	//    9   22:invokeinterface #193 <Method Object Iterator.next()>
	//   10   27:checkcast       #93  <Class CustomerAccount>
	//   11   30:astore_3        
			if(customeraccount.getTypeEnum() == type)
	//*  12   31:aload_3         
	//*  13   32:invokevirtual   #197 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//*  14   35:aload_2         
	//*  15   36:if_acmpne       10
				list = ((List) (customeraccount));
	//   16   39:aload_3         
	//   17   40:astore_1        
		} while(true);
	//   18   41:goto            10
		return ((CustomerAccount) (list));
	//   19   44:aload_1         
	//   20   45:areturn         
	}

	private List getSortedGiftCards(GiftCardsResponse giftcardsresponse, boolean flag)
	{
		if(giftcardsresponse != null && giftcardsresponse.getGiftCards() != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          82
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #207 <Method List GiftCardsResponse.getGiftCards()>
	//*   4    8:ifnonnull       14
	//*   5   11:goto            82
		{
			if(flag)
	//*   6   14:iload_2         
	//*   7   15:ifeq            58
			{
				giftcardsresponse = ((GiftCardsResponse) (giftCardHelper.findFeatured(giftcardsresponse.getGiftCards())));
	//    8   18:aload_0         
	//    9   19:getfield        #61  <Field GiftCardHelper giftCardHelper>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #207 <Method List GiftCardsResponse.getGiftCards()>
	//   12   26:invokeinterface #213 <Method List GiftCardHelper.findFeatured(List)>
	//   13   31:astore_1        
				giftCardHelper.sort(((List) (giftcardsresponse)), ((java.util.Comparator) (new GiftCardComparator())), ((java.util.Comparator) (new GiftCardTemplateComparator())));
	//   14   32:aload_0         
	//   15   33:getfield        #61  <Field GiftCardHelper giftCardHelper>
	//   16   36:aload_1         
	//   17   37:new             #215 <Class GiftCardComparator>
	//   18   40:dup             
	//   19   41:invokespecial   #216 <Method void GiftCardComparator()>
	//   20   44:new             #218 <Class GiftCardTemplateComparator>
	//   21   47:dup             
	//   22   48:invokespecial   #219 <Method void GiftCardTemplateComparator()>
	//   23   51:invokeinterface #223 <Method void GiftCardHelper.sort(List, java.util.Comparator, java.util.Comparator)>
				return ((List) (giftcardsresponse));
	//   24   56:aload_1         
	//   25   57:areturn         
			} else
			{
				giftcardsresponse = ((GiftCardsResponse) (giftcardsresponse.getGiftCards()));
	//   26   58:aload_1         
	//   27   59:invokevirtual   #207 <Method List GiftCardsResponse.getGiftCards()>
	//   28   62:astore_1        
				giftCardHelper.sort(((List) (giftcardsresponse)), ((java.util.Comparator) (new GiftCardComparator())));
	//   29   63:aload_0         
	//   30   64:getfield        #61  <Field GiftCardHelper giftCardHelper>
	//   31   67:aload_1         
	//   32   68:new             #215 <Class GiftCardComparator>
	//   33   71:dup             
	//   34   72:invokespecial   #216 <Method void GiftCardComparator()>
	//   35   75:invokeinterface #226 <Method void GiftCardHelper.sort(List, java.util.Comparator)>
				return ((List) (giftcardsresponse));
	//   36   80:aload_1         
	//   37   81:areturn         
			}
		} else
		{
			return ((List) (new ArrayList()));
	//   38   82:new             #170 <Class ArrayList>
	//   39   85:dup             
	//   40   86:invokespecial   #172 <Method void ArrayList()>
	//   41   89:areturn         
		}
	}

	private boolean isDeviceAuthenticationEnabled()
	{
		return appConfig.getDeviceAuthenticationAppConfig() != null;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field AppConfig appConfig>
	//    2    4:invokeinterface #233 <Method com.ibotta.android.state.app.config.deviceauth.DeviceAuthenticationAppConfig AppConfig.getDeviceAuthenticationAppConfig()>
	//    3    9:ifnull          14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	private boolean isPhoneVerified()
	{
		return userState.getVerifiedDeviceReferenceId() != null && customer.isPhoneVerified();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field UserState userState>
	//    2    4:invokeinterface #237 <Method String UserState.getVerifiedDeviceReferenceId()>
	//    3    9:ifnull          24
	//    4   12:aload_0         
	//    5   13:getfield        #101 <Field Customer customer>
	//    6   16:invokevirtual   #238 <Method boolean Customer.isPhoneVerified()>
	//    7   19:ifeq            24
	//    8   22:iconst_1        
	//    9   23:ireturn         
	//   10   24:iconst_0        
	//   11   25:ireturn         
	}

	private boolean isServiceEnabled(com.ibotta.api.model.customer.CustomerAccount.Type type)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type[];

			static 
			{
				$SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type = new int[com.ibotta.api.model.customer.CustomerAccount.Type.values().length];
			//    0    0:invokestatic    #18  <Method com.ibotta.api.model.customer.CustomerAccount$Type[] com.ibotta.api.model.customer.CustomerAccount$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type>
				try
				{
					$SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type[com.ibotta.api.model.customer.CustomerAccount.Type.PAYPAL.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type>
			//    5   12:getstatic       #24  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.PAYPAL>
			//    6   15:invokevirtual   #28  <Method int com.ibotta.api.model.customer.CustomerAccount$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type>
			//*  10   23:getstatic       #31  <Field com.ibotta.api.model.customer.CustomerAccount$Type com.ibotta.api.model.customer.CustomerAccount$Type.VENMO>
			//*  11   26:invokevirtual   #28  <Method int com.ibotta.api.model.customer.CustomerAccount$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type[com.ibotta.api.model.customer.CustomerAccount.Type.VENMO.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1..SwitchMap.com.ibotta.api.model.customer.CustomerAccount.Type[type.ordinal()])
	//*   0    0:getstatic       #242 <Field int[] WithdrawPresenterImpl$1.$SwitchMap$com$ibotta$api$model$customer$CustomerAccount$Type>
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #245 <Method int com.ibotta.api.model.customer.CustomerAccount$Type.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 47
	//	               2 34
		default:
			return true;
	//    5   32:iconst_1        
	//    6   33:ireturn         

		case 2: // '\002'
			return appConfig.getVenmoAppConfig().isEnabled();
	//    7   34:aload_0         
	//    8   35:getfield        #57  <Field AppConfig appConfig>
	//    9   38:invokeinterface #249 <Method VenmoAppConfig AppConfig.getVenmoAppConfig()>
	//   10   43:invokevirtual   #254 <Method boolean VenmoAppConfig.isEnabled()>
	//   11   46:ireturn         

		case 1: // '\001'
			return appConfig.getPaypalAppConfig().isEnabled();
	//   12   47:aload_0         
	//   13   48:getfield        #57  <Field AppConfig appConfig>
	//   14   51:invokeinterface #258 <Method PayPalAppConfig AppConfig.getPaypalAppConfig()>
	//   15   56:invokevirtual   #261 <Method boolean PayPalAppConfig.isEnabled()>
	//   16   59:ireturn         
		}
	}

	private void launchCashOut(com.ibotta.api.model.customer.CustomerAccount.Type type)
	{
		if(ensureConfirmationAndVerification())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #265 <Method boolean ensureConfirmationAndVerification()>
	//*   2    4:ifeq            20
			((WithdrawView)mvpView).launchCashOut(type);
	//    3    7:aload_0         
	//    4    8:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5   11:checkcast       #153 <Class WithdrawView>
	//    6   14:aload_1         
	//    7   15:invokeinterface #267 <Method void WithdrawView.launchCashOut(com.ibotta.api.model.customer.CustomerAccount$Type)>
	//    8   20:return          
	}

	private void launchGiftCard(int i)
	{
		if(ensureConfirmationAndVerification())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #265 <Method boolean ensureConfirmationAndVerification()>
	//*   2    4:ifeq            20
			((WithdrawView)mvpView).launchGiftCard(i);
	//    3    7:aload_0         
	//    4    8:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5   11:checkcast       #153 <Class WithdrawView>
	//    6   14:iload_1         
	//    7   15:invokeinterface #271 <Method void WithdrawView.launchGiftCard(int)>
	//    8   20:return          
	}

	private void launchLinkAccount()
	{
		if(ensureConfirmationAndVerification())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #265 <Method boolean ensureConfirmationAndVerification()>
	//*   2    4:ifeq            53
		{
			if(selectedCashOutType == CashOutType.PAYPAL)
	//*   3    7:aload_0         
	//*   4    8:getfield        #274 <Field CashOutType selectedCashOutType>
	//*   5   11:getstatic       #276 <Field CashOutType CashOutType.PAYPAL>
	//*   6   14:if_acmpne       37
			{
				((WithdrawView)mvpView).capturePasswordForPayPalLink(customer.getEmail());
	//    7   17:aload_0         
	//    8   18:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    9   21:checkcast       #153 <Class WithdrawView>
	//   10   24:aload_0         
	//   11   25:getfield        #101 <Field Customer customer>
	//   12   28:invokevirtual   #279 <Method String Customer.getEmail()>
	//   13   31:invokeinterface #283 <Method void WithdrawView.capturePasswordForPayPalLink(String)>
				return;
	//   14   36:return          
			}
			((WithdrawView)mvpView).launchLinkGenericCashAccount(selectedCashOutType);
	//   15   37:aload_0         
	//   16   38:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   41:checkcast       #153 <Class WithdrawView>
	//   18   44:aload_0         
	//   19   45:getfield        #274 <Field CashOutType selectedCashOutType>
	//   20   48:invokeinterface #287 <Method void WithdrawView.launchLinkGenericCashAccount(CashOutType)>
		}
	//   21   53:return          
	}

	private void onBalanceSet(List list)
	{
		((WithdrawView)mvpView).setWithdrawAvailableAmount(formatting.currencyPositiveOrZeroLeadingZeroNoDollarSign(customer.getBalance()));
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #153 <Class WithdrawView>
	//    3    7:aload_0         
	//    4    8:getfield        #53  <Field Formatting formatting>
	//    5   11:aload_0         
	//    6   12:getfield        #101 <Field Customer customer>
	//    7   15:invokevirtual   #292 <Method float Customer.getBalance()>
	//    8   18:f2d             
	//    9   19:invokeinterface #298 <Method String Formatting.currencyPositiveOrZeroLeadingZeroNoDollarSign(double)>
	//   10   24:invokeinterface #301 <Method void WithdrawView.setWithdrawAvailableAmount(String)>
		if(belowGlobalMinimumBalance)
	//*  11   29:aload_0         
	//*  12   30:getfield        #109 <Field boolean belowGlobalMinimumBalance>
	//*  13   33:ifeq            75
		{
			((WithdrawView)mvpView).setBalanceBelowMinimum();
	//   14   36:aload_0         
	//   15   37:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   16   40:checkcast       #153 <Class WithdrawView>
	//   17   43:invokeinterface #304 <Method void WithdrawView.setBalanceBelowMinimum()>
			list.add(((Object) (new EmptyWithdrawRow(appConfig.getInviteFriendsCopy().getCta()))));
	//   18   48:aload_1         
	//   19   49:new             #306 <Class EmptyWithdrawRow>
	//   20   52:dup             
	//   21   53:aload_0         
	//   22   54:getfield        #57  <Field AppConfig appConfig>
	//   23   57:invokeinterface #310 <Method InviteFriendsCopyConfig AppConfig.getInviteFriendsCopy()>
	//   24   62:invokevirtual   #315 <Method String InviteFriendsCopyConfig.getCta()>
	//   25   65:invokespecial   #317 <Method void EmptyWithdrawRow(String)>
	//   26   68:invokeinterface #118 <Method boolean List.add(Object)>
	//   27   73:pop             
			return;
	//   28   74:return          
		} else
		{
			((WithdrawView)mvpView).setBalanceMinimumMet();
	//   29   75:aload_0         
	//   30   76:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   31   79:checkcast       #153 <Class WithdrawView>
	//   32   82:invokeinterface #320 <Method void WithdrawView.setBalanceMinimumMet()>
			return;
	//   33   87:return          
		}
	}

	protected void addCashOutOptions(List list)
	{
		List list1 = getCashCustomerAccounts(customerAccountsJob.getApiResponse());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #324 <Field RelayApiJob customerAccountsJob>
	//    3    5:invokevirtual   #330 <Method ApiResponse RelayApiJob.getApiResponse()>
	//    4    8:invokespecial   #332 <Method List getCashCustomerAccounts(ApiResponse)>
	//    5   11:astore_2        
		list.add(((Object) (new TitleBarRow(withdrawReducer.getCashOutTitle(), belowGlobalMinimumBalance))));
	//    6   12:aload_1         
	//    7   13:new             #334 <Class TitleBarRow>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #67  <Field WithdrawReducer withdrawReducer>
	//   11   21:invokevirtual   #340 <Method com.ibotta.android.views.base.title.TitleBarViewState WithdrawReducer.getCashOutTitle()>
	//   12   24:aload_0         
	//   13   25:getfield        #109 <Field boolean belowGlobalMinimumBalance>
	//   14   28:invokespecial   #343 <Method void TitleBarRow(com.ibotta.android.views.base.title.TitleBarViewState, boolean)>
	//   15   31:invokeinterface #118 <Method boolean List.add(Object)>
	//   16   36:pop             
		addCashOutRow(list1, list, CashOutType.PAYPAL);
	//   17   37:aload_0         
	//   18   38:aload_2         
	//   19   39:aload_1         
	//   20   40:getstatic       #276 <Field CashOutType CashOutType.PAYPAL>
	//   21   43:invokespecial   #345 <Method void addCashOutRow(List, List, CashOutType)>
		addCashOutRow(list1, list, CashOutType.VENMO);
	//   22   46:aload_0         
	//   23   47:aload_2         
	//   24   48:aload_1         
	//   25   49:getstatic       #75  <Field CashOutType CashOutType.VENMO>
	//   26   52:invokespecial   #345 <Method void addCashOutRow(List, List, CashOutType)>
	//   27   55:return          
	}

	protected void addGiftCardList(List list, boolean flag)
	{
		Object obj = ((Object) (getSortedGiftCards((GiftCardsResponse)giftCardsJob.getApiResponse(), flag)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #349 <Field SingleApiJob giftCardsJob>
	//    3    5:invokevirtual   #352 <Method ApiResponse SingleApiJob.getApiResponse()>
	//    4    8:checkcast       #204 <Class GiftCardsResponse>
	//    5   11:iload_2         
	//    6   12:invokespecial   #354 <Method List getSortedGiftCards(GiftCardsResponse, boolean)>
	//    7   15:astore_3        
		if(!((List) (obj)).isEmpty())
	//*   8   16:aload_3         
	//*   9   17:invokeinterface #357 <Method boolean List.isEmpty()>
	//*  10   22:ifne            122
		{
			list.add(((Object) (new TitleBarRow(withdrawReducer.createGiftCardTitle(flag), belowGlobalMinimumBalance, true))));
	//   11   25:aload_1         
	//   12   26:new             #334 <Class TitleBarRow>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #67  <Field WithdrawReducer withdrawReducer>
	//   16   34:iload_2         
	//   17   35:invokevirtual   #361 <Method com.ibotta.android.views.base.title.TitleBarViewState WithdrawReducer.createGiftCardTitle(boolean)>
	//   18   38:aload_0         
	//   19   39:getfield        #109 <Field boolean belowGlobalMinimumBalance>
	//   20   42:iconst_1        
	//   21   43:invokespecial   #364 <Method void TitleBarRow(com.ibotta.android.views.base.title.TitleBarViewState, boolean, boolean)>
	//   22   46:invokeinterface #118 <Method boolean List.add(Object)>
	//   23   51:pop             
			GiftCard giftcard;
			for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); list.add(((Object) (new GiftCardRow(giftcard, flag)))))
	//*  24   52:aload_3         
	//*  25   53:invokeinterface #184 <Method Iterator List.iterator()>
	//*  26   58:astore_3        
	//*  27   59:aload_3         
	//*  28   60:invokeinterface #189 <Method boolean Iterator.hasNext()>
	//*  29   65:ifeq            122
			{
				giftcard = (GiftCard)((Iterator) (obj)).next();
	//   30   68:aload_3         
	//   31   69:invokeinterface #193 <Method Object Iterator.next()>
	//   32   74:checkcast       #366 <Class GiftCard>
	//   33   77:astore          4
				if(customer.getBalance() < giftcard.getMinimum())
	//*  34   79:aload_0         
	//*  35   80:getfield        #101 <Field Customer customer>
	//*  36   83:invokevirtual   #292 <Method float Customer.getBalance()>
	//*  37   86:aload           4
	//*  38   88:invokevirtual   #369 <Method float GiftCard.getMinimum()>
	//*  39   91:fcmpg           
	//*  40   92:ifge            100
					flag = true;
	//   41   95:iconst_1        
	//   42   96:istore_2        
				else
	//*  43   97:goto            102
					flag = false;
	//   44  100:iconst_0        
	//   45  101:istore_2        
			}

	//   46  102:aload_1         
	//   47  103:new             #371 <Class GiftCardRow>
	//   48  106:dup             
	//   49  107:aload           4
	//   50  109:iload_2         
	//   51  110:invokespecial   #374 <Method void GiftCardRow(GiftCard, boolean)>
	//   52  113:invokeinterface #118 <Method boolean List.add(Object)>
	//   53  118:pop             
		}
	//*  54  119:goto            59
	//   55  122:return          
	}

	protected void addGiftCardsOptions(List list)
	{
		addGiftCardList(list, true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #378 <Method void addGiftCardList(List, boolean)>
		addGiftCardList(list, false);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:invokevirtual   #378 <Method void addGiftCardList(List, boolean)>
	//    8   12:return          
	}

	public com.ibotta.api.model.customer.CustomerAccount.Type getCashOutSuccessType()
	{
		return customerAccountToCashOut.getTypeEnum();
	//    0    0:aload_0         
	//    1    1:getfield        #381 <Field CustomerAccount customerAccountToCashOut>
	//    2    4:invokevirtual   #197 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//    3    7:areturn         
	}

	public Customer getCustomer()
	{
		return customer;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Customer customer>
	//    2    4:areturn         
	}

	protected Set getFetchJobs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #387 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #388 <Method void HashSet()>
	//    3    7:astore_1        
		if(custByIdJob == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #390 <Field SingleApiJob custByIdJob>
	//*   6   12:ifnonnull       50
		{
			custByIdJob = new SingleApiJob(((com.ibotta.api.ApiCall) (new CustomerByIdCall(userState.getCustomerId()))));
	//    7   15:aload_0         
	//    8   16:new             #351 <Class SingleApiJob>
	//    9   19:dup             
	//   10   20:new             #392 <Class CustomerByIdCall>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #55  <Field UserState userState>
	//   14   28:invokeinterface #130 <Method int UserState.getCustomerId()>
	//   15   33:invokespecial   #394 <Method void CustomerByIdCall(int)>
	//   16   36:invokespecial   #396 <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   17   39:putfield        #390 <Field SingleApiJob custByIdJob>
			custByIdJob.addListener(((ApiJobListener) (this)));
	//   18   42:aload_0         
	//   19   43:getfield        #390 <Field SingleApiJob custByIdJob>
	//   20   46:aload_0         
	//   21   47:invokevirtual   #400 <Method void SingleApiJob.addListener(ApiJobListener)>
		}
		if(customerAccountsJob == null)
	//*  22   50:aload_0         
	//*  23   51:getfield        #324 <Field RelayApiJob customerAccountsJob>
	//*  24   54:ifnonnull       84
			customerAccountsJob = new RelayApiJob(((com.ibotta.api.ApiCall) (new CustomerAccountsCall(userState.getCustomerId()))));
	//   25   57:aload_0         
	//   26   58:new             #326 <Class RelayApiJob>
	//   27   61:dup             
	//   28   62:new             #402 <Class CustomerAccountsCall>
	//   29   65:dup             
	//   30   66:aload_0         
	//   31   67:getfield        #55  <Field UserState userState>
	//   32   70:invokeinterface #130 <Method int UserState.getCustomerId()>
	//   33   75:invokespecial   #403 <Method void CustomerAccountsCall(int)>
	//   34   78:invokespecial   #404 <Method void RelayApiJob(com.ibotta.api.ApiCall)>
	//   35   81:putfield        #324 <Field RelayApiJob customerAccountsJob>
		if(giftCardsJob == null)
	//*  36   84:aload_0         
	//*  37   85:getfield        #349 <Field SingleApiJob giftCardsJob>
	//*  38   88:ifnonnull       109
			giftCardsJob = new SingleApiJob(((com.ibotta.api.ApiCall) (new GiftCardsCall())));
	//   39   91:aload_0         
	//   40   92:new             #351 <Class SingleApiJob>
	//   41   95:dup             
	//   42   96:new             #406 <Class GiftCardsCall>
	//   43   99:dup             
	//   44  100:invokespecial   #407 <Method void GiftCardsCall()>
	//   45  103:invokespecial   #396 <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   46  106:putfield        #349 <Field SingleApiJob giftCardsJob>
		((Set) (hashset)).add(((Object) (custByIdJob)));
	//   47  109:aload_1         
	//   48  110:aload_0         
	//   49  111:getfield        #390 <Field SingleApiJob custByIdJob>
	//   50  114:invokeinterface #410 <Method boolean Set.add(Object)>
	//   51  119:pop             
		((Set) (hashset)).add(((Object) (customerAccountsJob)));
	//   52  120:aload_1         
	//   53  121:aload_0         
	//   54  122:getfield        #324 <Field RelayApiJob customerAccountsJob>
	//   55  125:invokeinterface #410 <Method boolean Set.add(Object)>
	//   56  130:pop             
		((Set) (hashset)).add(((Object) (giftCardsJob)));
	//   57  131:aload_1         
	//   58  132:aload_0         
	//   59  133:getfield        #349 <Field SingleApiJob giftCardsJob>
	//   60  136:invokeinterface #410 <Method boolean Set.add(Object)>
	//   61  141:pop             
		return ((Set) (hashset));
	//   62  142:aload_1         
	//   63  143:areturn         
	}

	protected boolean isAccountsLoadable(SingleApiJob singleapijob)
	{
		if(singleapijob.isSuccessfullyLoaded() && (singleapijob.getApiResponse() instanceof CustomerByIdResponse))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #416 <Method boolean SingleApiJob.isSuccessfullyLoaded()>
	//*   2    4:ifeq            49
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #352 <Method ApiResponse SingleApiJob.getApiResponse()>
	//*   5   11:instanceof      #418 <Class CustomerByIdResponse>
	//*   6   14:ifeq            49
		{
			singleapijob = ((SingleApiJob) ((CustomerByIdResponse)singleapijob.getApiResponse()));
	//    7   17:aload_1         
	//    8   18:invokevirtual   #352 <Method ApiResponse SingleApiJob.getApiResponse()>
	//    9   21:checkcast       #418 <Class CustomerByIdResponse>
	//   10   24:astore_1        
			if(singleapijob != null)
	//*  11   25:aload_1         
	//*  12   26:ifnull          49
			{
				customer = ((CustomerByIdResponse) (singleapijob)).getCustomer();
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:invokevirtual   #420 <Method Customer CustomerByIdResponse.getCustomer()>
	//   16   34:putfield        #101 <Field Customer customer>
				if(!customer.isConfirmationRequired())
	//*  17   37:aload_0         
	//*  18   38:getfield        #101 <Field Customer customer>
	//*  19   41:invokevirtual   #147 <Method boolean Customer.isConfirmationRequired()>
	//*  20   44:ifne            49
					return true;
	//   21   47:iconst_1        
	//   22   48:ireturn         
			}
		}
		return false;
	//   23   49:iconst_0        
	//   24   50:ireturn         
	}

	protected void onAbandonFetchJobs()
	{
		SingleApiJob singleapijob = custByIdJob;
	//    0    0:aload_0         
	//    1    1:getfield        #390 <Field SingleApiJob custByIdJob>
	//    2    4:astore_1        
		if(singleapijob != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			singleapijob.removeListener(((ApiJobListener) (this)));
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #424 <Method void SingleApiJob.removeListener(ApiJobListener)>
			custByIdJob = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #390 <Field SingleApiJob custByIdJob>
		}
		customerAccountsJob = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #324 <Field RelayApiJob customerAccountsJob>
		giftCardsJob = null;
	//   14   24:aload_0         
	//   15   25:aconst_null     
	//   16   26:putfield        #349 <Field SingleApiJob giftCardsJob>
	//   17   29:return          
	}

	public void onApiJobFinished(ApiJob apijob)
	{
		if(isAccountsLoadable((SingleApiJob)apijob))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:checkcast       #351 <Class SingleApiJob>
	//*   3    5:invokevirtual   #428 <Method boolean isAccountsLoadable(SingleApiJob)>
	//*   4    8:ifeq            20
		{
			customerAccountsJob.signal(false);
	//    5   11:aload_0         
	//    6   12:getfield        #324 <Field RelayApiJob customerAccountsJob>
	//    7   15:iconst_0        
	//    8   16:invokevirtual   #431 <Method void RelayApiJob.signal(boolean)>
			return;
	//    9   19:return          
		} else
		{
			customerAccountsJob.setResult(Outcome.SUCCESS, ((ApiResponse) (new EmptyResponse())));
	//   10   20:aload_0         
	//   11   21:getfield        #324 <Field RelayApiJob customerAccountsJob>
	//   12   24:getstatic       #437 <Field Outcome Outcome.SUCCESS>
	//   13   27:new             #174 <Class EmptyResponse>
	//   14   30:dup             
	//   15   31:invokespecial   #438 <Method void EmptyResponse()>
	//   16   34:invokevirtual   #442 <Method void RelayApiJob.setResult(Outcome, ApiResponse)>
			return;
	//   17   37:return          
		}
	}

	public void onApiJobLongTask(ApiJob apijob)
	{
		com.ibotta.android.service.api.job.ApiJobListener._2D_CC.$default$onApiJobLongTask(((ApiJobListener) (this)), apijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #449 <Method void com.ibotta.android.service.api.job.ApiJobListener$_2D_CC.$default$onApiJobLongTask(ApiJobListener, ApiJob)>
	//    3    5:return          
	}

	public void onCashAccountClicked(CustomerAccount customeraccount)
	{
		customerAccountToCashOut = customeraccount;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #381 <Field CustomerAccount customerAccountToCashOut>
		float f = customer.getMinimumAmountForType(customeraccount.getTypeEnum());
	//    3    5:aload_0         
	//    4    6:getfield        #101 <Field Customer customer>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #197 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//    7   13:invokevirtual   #455 <Method float Customer.getMinimumAmountForType(com.ibotta.api.model.customer.CustomerAccount$Type)>
	//    8   16:fstore_2        
		if(customer.getBalance() < f)
	//*   9   17:aload_0         
	//*  10   18:getfield        #101 <Field Customer customer>
	//*  11   21:invokevirtual   #292 <Method float Customer.getBalance()>
	//*  12   24:fload_2         
	//*  13   25:fcmpg           
	//*  14   26:ifge            56
		{
			String s = formatting.currency(f);
	//   15   29:aload_0         
	//   16   30:getfield        #53  <Field Formatting formatting>
	//   17   33:fload_2         
	//   18   34:f2d             
	//   19   35:invokeinterface #458 <Method String Formatting.currency(double)>
	//   20   40:astore_3        
			((WithdrawView)mvpView).showInsufficientFundsDialog(customeraccount, s);
	//   21   41:aload_0         
	//   22   42:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   23   45:checkcast       #153 <Class WithdrawView>
	//   24   48:aload_1         
	//   25   49:aload_3         
	//   26   50:invokeinterface #462 <Method void WithdrawView.showInsufficientFundsDialog(CustomerAccount, String)>
			return;
	//   27   55:return          
		} else
		{
			launchCashOut(customeraccount.getTypeEnum());
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:invokevirtual   #197 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//   31   61:invokespecial   #463 <Method void launchCashOut(com.ibotta.api.model.customer.CustomerAccount$Type)>
			return;
	//   32   64:return          
		}
	}

	public void onCashOutSuccess(WithdrawalDetails withdrawaldetails)
	{
		brazeTracking.trackCashout(withdrawaldetails.getAmount(), withdrawaldetails.getMethod(), withdrawaldetails.getMethodImg());
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field BrazeTracking brazeTracking>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #470 <Method float WithdrawalDetails.getAmount()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #473 <Method String WithdrawalDetails.getMethod()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #476 <Method String WithdrawalDetails.getMethodImg()>
	//    8   16:invokeinterface #482 <Method void BrazeTracking.trackCashout(float, String, String)>
		((WithdrawView)mvpView).showCashOutSuccess();
	//    9   21:aload_0         
	//   10   22:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   11   25:checkcast       #153 <Class WithdrawView>
	//   12   28:invokeinterface #485 <Method void WithdrawView.showCashOutSuccess()>
		reload();
	//   13   33:aload_0         
	//   14   34:invokevirtual   #488 <Method void reload()>
	//   15   37:return          
	}

	public void onEmailResetSuccess()
	{
		reload();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #488 <Method void reload()>
	//    2    4:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #170 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #172 <Method void ArrayList()>
	//    3    7:astore_2        
		boolean flag;
		if(customer.getBalance() < 20F)
	//*   4    8:aload_0         
	//*   5    9:getfield        #101 <Field Customer customer>
	//*   6   12:invokevirtual   #292 <Method float Customer.getBalance()>
	//*   7   15:ldc1            #14  <Float 20F>
	//*   8   17:fcmpg           
	//*   9   18:ifge            26
			flag = true;
	//   10   21:iconst_1        
	//   11   22:istore_1        
		else
	//*  12   23:goto            28
			flag = false;
	//   13   26:iconst_0        
	//   14   27:istore_1        
		belowGlobalMinimumBalance = flag;
	//   15   28:aload_0         
	//   16   29:iload_1         
	//   17   30:putfield        #109 <Field boolean belowGlobalMinimumBalance>
		onBalanceSet(((List) (arraylist)));
	//   18   33:aload_0         
	//   19   34:aload_2         
	//   20   35:invokespecial   #492 <Method void onBalanceSet(List)>
		addCashOutOptions(((List) (arraylist)));
	//   21   38:aload_0         
	//   22   39:aload_2         
	//   23   40:invokevirtual   #494 <Method void addCashOutOptions(List)>
		addGiftCardsOptions(((List) (arraylist)));
	//   24   43:aload_0         
	//   25   44:aload_2         
	//   26   45:invokevirtual   #496 <Method void addGiftCardsOptions(List)>
		((WithdrawView)mvpView).setRows(((List) (arraylist)));
	//   27   48:aload_0         
	//   28   49:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   29   52:checkcast       #153 <Class WithdrawView>
	//   30   55:aload_2         
	//   31   56:invokeinterface #499 <Method void WithdrawView.setRows(List)>
	//   32   61:return          
	}

	protected void onFetchJobFailed(ApiJob apijob)
	{
		super.onFetchJobFailed(apijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #502 <Method void AbstractPasswordUsingMvpPresenter.onFetchJobFailed(ApiJob)>
		customerAccountsJob.setResult(Outcome.ERROR, ((ApiResponse) (new EmptyResponse())));
	//    3    5:aload_0         
	//    4    6:getfield        #324 <Field RelayApiJob customerAccountsJob>
	//    5    9:getstatic       #505 <Field Outcome Outcome.ERROR>
	//    6   12:new             #174 <Class EmptyResponse>
	//    7   15:dup             
	//    8   16:invokespecial   #438 <Method void EmptyResponse()>
	//    9   19:invokevirtual   #442 <Method void RelayApiJob.setResult(Outcome, ApiResponse)>
	//   10   22:return          
	}

	public void onGiftCardClicked(GiftCard giftcard)
	{
		launchGiftCard(giftcard.getId());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #508 <Method int GiftCard.getId()>
	//    3    5:invokespecial   #509 <Method void launchGiftCard(int)>
	//    4    8:return          
	}

	public void onGiftCardSuccess(WithdrawalDetails withdrawaldetails)
	{
		brazeTracking.trackCashout(withdrawaldetails.getAmount(), withdrawaldetails.getMethod(), withdrawaldetails.getMethodImg());
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field BrazeTracking brazeTracking>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #470 <Method float WithdrawalDetails.getAmount()>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #473 <Method String WithdrawalDetails.getMethod()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #476 <Method String WithdrawalDetails.getMethodImg()>
	//    8   16:invokeinterface #482 <Method void BrazeTracking.trackCashout(float, String, String)>
		((WithdrawView)mvpView).showGiftCardSuccess();
	//    9   21:aload_0         
	//   10   22:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   11   25:checkcast       #153 <Class WithdrawView>
	//   12   28:invokeinterface #513 <Method void WithdrawView.showGiftCardSuccess()>
		reload();
	//   13   33:aload_0         
	//   14   34:invokevirtual   #488 <Method void reload()>
	//   15   37:return          
	}

	public void onInviteFriendsClicked()
	{
		((WithdrawView)mvpView).launchInviteFriends();
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #153 <Class WithdrawView>
	//    3    7:invokeinterface #517 <Method void WithdrawView.launchInviteFriends()>
	//    4   12:return          
	}

	public void onLinkAccountClicked(CashOutType cashouttype)
	{
		selectedCashOutType = cashouttype;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #274 <Field CashOutType selectedCashOutType>
		launchLinkAccount();
	//    3    5:aload_0         
	//    4    6:invokespecial   #520 <Method void launchLinkAccount()>
	//    5    9:return          
	}

	public void onLinkSuccess()
	{
		reload();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #488 <Method void reload()>
	//    2    4:return          
	}

	public void onPayPalLinkPasswordCaptured(String s)
	{
		((WithdrawView)mvpView).launchPayPalLink(s);
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #153 <Class WithdrawView>
	//    3    7:aload_1         
	//    4    8:invokeinterface #525 <Method void WithdrawView.launchPayPalLink(String)>
	//    5   13:return          
	}

	public void onResendConfirmationSuccess()
	{
		reload();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #488 <Method void reload()>
	//    2    4:return          
	}

	public void onResendEmailClicked()
	{
		submitApiCall(((com.ibotta.api.ApiCall) (new CustomerSendEmailConfPutCall(customer.getId()))));
	//    0    0:aload_0         
	//    1    1:new             #529 <Class CustomerSendEmailConfPutCall>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #101 <Field Customer customer>
	//    5    9:invokevirtual   #530 <Method int Customer.getId()>
	//    6   12:invokespecial   #531 <Method void CustomerSendEmailConfPutCall(int)>
	//    7   15:invokevirtual   #142 <Method void submitApiCall(com.ibotta.api.ApiCall)>
	//    8   18:return          
	}

	public void onResetEmailClicked(String s)
	{
		newEmail = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #534 <Field String newEmail>
		((WithdrawView)mvpView).capturePasswordForResetEmail(customer.getEmail());
	//    3    5:aload_0         
	//    4    6:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5    9:checkcast       #153 <Class WithdrawView>
	//    6   12:aload_0         
	//    7   13:getfield        #101 <Field Customer customer>
	//    8   16:invokevirtual   #279 <Method String Customer.getEmail()>
	//    9   19:invokeinterface #537 <Method void WithdrawView.capturePasswordForResetEmail(String)>
	//   10   24:return          
	}

	public void onResetEmailPasswordCaptured(String s)
	{
		com.ibotta.api.call.customer.CustomerPutCall.CallParams callparams = new com.ibotta.api.call.customer.CustomerPutCall.CallParams();
	//    0    0:new             #540 <Class com.ibotta.api.call.customer.CustomerPutCall$CallParams>
	//    1    3:dup             
	//    2    4:invokespecial   #541 <Method void com.ibotta.api.call.customer.CustomerPutCall$CallParams()>
	//    3    7:astore_2        
		callparams.setCustomerId(customer.getId());
	//    4    8:aload_2         
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field Customer customer>
	//    7   13:invokevirtual   #530 <Method int Customer.getId()>
	//    8   16:invokevirtual   #544 <Method void com.ibotta.api.call.customer.CustomerPutCall$CallParams.setCustomerId(int)>
		callparams.setEmail(newEmail);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #534 <Field String newEmail>
	//   12   24:invokevirtual   #547 <Method void com.ibotta.api.call.customer.CustomerPutCall$CallParams.setEmail(String)>
		callparams.setCurrentPassword(s);
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #550 <Method void com.ibotta.api.call.customer.CustomerPutCall$CallParams.setCurrentPassword(String)>
		callparams.setPassword(s);
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #553 <Method void com.ibotta.api.call.customer.CustomerPutCall$CallParams.setPassword(String)>
		submitApiJob(((ApiJob) (postAuthWorkJobFactory.createFor(callparams))));
	//   19   37:aload_0         
	//   20   38:aload_0         
	//   21   39:getfield        #63  <Field PostAuthWorkJobFactory postAuthWorkJobFactory>
	//   22   42:aload_2         
	//   23   43:invokevirtual   #559 <Method com.ibotta.android.api.auth.PostAuthWorkJob PostAuthWorkJobFactory.createFor(com.ibotta.api.call.customer.CustomerPutCall$CallParams)>
	//   24   46:invokevirtual   #562 <Method void submitApiJob(ApiJob)>
	//   25   49:return          
	}

	public void onStart()
	{
		cacheClearFactory.create().clearCustomer(true).clear();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field CacheClearJobFactory cacheClearFactory>
	//    2    4:invokevirtual   #569 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #575 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//    5   11:invokevirtual   #578 <Method void CacheClearBatchApiJob.clear()>
		super.onStart();
	//    6   14:aload_0         
	//    7   15:invokespecial   #580 <Method void AbstractPasswordUsingMvpPresenter.onStart()>
	//    8   18:return          
	}

	protected void onSubmitJobSuccess(SingleApiJob singleapijob)
	{
		super.onSubmitJobSuccess(singleapijob);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #584 <Method void AbstractPasswordUsingMvpPresenter.onSubmitJobSuccess(SingleApiJob)>
		singleapijob = ((SingleApiJob) (singleapijob.getApiCall()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #588 <Method com.ibotta.api.ApiCall SingleApiJob.getApiCall()>
	//    5    9:astore_1        
		if(singleapijob instanceof CustomerAccountsDeleteCall)
	//*   6   10:aload_1         
	//*   7   11:instanceof      #124 <Class CustomerAccountsDeleteCall>
	//*   8   14:ifeq            40
		{
			cacheClearFactory.create().clearCustomerAccounts(true).clearCustomer(false).clear();
	//    9   17:aload_0         
	//   10   18:getfield        #65  <Field CacheClearJobFactory cacheClearFactory>
	//   11   21:invokevirtual   #569 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #591 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomerAccounts(boolean)>
	//   14   28:iconst_0        
	//   15   29:invokevirtual   #575 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//   16   32:invokevirtual   #578 <Method void CacheClearBatchApiJob.clear()>
			reload();
	//   17   35:aload_0         
	//   18   36:invokevirtual   #488 <Method void reload()>
			return;
	//   19   39:return          
		}
		if(singleapijob instanceof CustomerSendEmailConfPutCall)
	//*  20   40:aload_1         
	//*  21   41:instanceof      #529 <Class CustomerSendEmailConfPutCall>
	//*  22   44:ifeq            74
		{
			cacheClearFactory.create().clearCustomer(true).clear();
	//   23   47:aload_0         
	//   24   48:getfield        #65  <Field CacheClearJobFactory cacheClearFactory>
	//   25   51:invokevirtual   #569 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//   26   54:iconst_1        
	//   27   55:invokevirtual   #575 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//   28   58:invokevirtual   #578 <Method void CacheClearBatchApiJob.clear()>
			((WithdrawView)mvpView).onResendEmailSuccess();
	//   29   61:aload_0         
	//   30   62:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   31   65:checkcast       #153 <Class WithdrawView>
	//   32   68:invokeinterface #594 <Method void WithdrawView.onResendEmailSuccess()>
			return;
	//   33   73:return          
		}
		if(singleapijob instanceof CustomerPutCall)
	//*  34   74:aload_1         
	//*  35   75:instanceof      #596 <Class CustomerPutCall>
	//*  36   78:ifeq            107
		{
			cacheClearFactory.create().clearCustomer(true).clear();
	//   37   81:aload_0         
	//   38   82:getfield        #65  <Field CacheClearJobFactory cacheClearFactory>
	//   39   85:invokevirtual   #569 <Method CacheClearBatchApiJob CacheClearJobFactory.create()>
	//   40   88:iconst_1        
	//   41   89:invokevirtual   #575 <Method CacheClearBatchApiJob CacheClearBatchApiJob.clearCustomer(boolean)>
	//   42   92:invokevirtual   #578 <Method void CacheClearBatchApiJob.clear()>
			((WithdrawView)mvpView).onResetEmailSuccess();
	//   43   95:aload_0         
	//   44   96:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   45   99:checkcast       #153 <Class WithdrawView>
	//   46  102:invokeinterface #599 <Method void WithdrawView.onResetEmailSuccess()>
		}
	//   47  107:return          
	}

	public void onUnlinkAccountActionClicked(int i)
	{
		deleteAccount();
	//    0    0:aload_0         
	//    1    1:invokespecial   #602 <Method void deleteAccount()>
	//    2    4:return          
	}

	public void onUnlinkAccountClicked(CustomerAccount customeraccount)
	{
		customerAccountToDelete = customeraccount;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field CustomerAccount customerAccountToDelete>
		((WithdrawView)mvpView).showDeleteAccountConfirmation();
	//    3    5:aload_0         
	//    4    6:getfield        #151 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5    9:checkcast       #153 <Class WithdrawView>
	//    6   12:invokeinterface #606 <Method void WithdrawView.showDeleteAccountConfirmation()>
	//    7   17:return          
	}

	public void onVerifyDeviceSuccess()
	{
		customer.setPhoneVerified(true);
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Customer customer>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #610 <Method void Customer.setPhoneVerified(boolean)>
		if(selectedCashOutType != null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #274 <Field CashOutType selectedCashOutType>
	//*   6   12:ifnull          20
		{
			launchLinkAccount();
	//    7   15:aload_0         
	//    8   16:invokespecial   #520 <Method void launchLinkAccount()>
			return;
	//    9   19:return          
		}
		CustomerAccount customeraccount = customerAccountToCashOut;
	//   10   20:aload_0         
	//   11   21:getfield        #381 <Field CustomerAccount customerAccountToCashOut>
	//   12   24:astore_1        
		if(customeraccount != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          37
			launchCashOut(customeraccount.getTypeEnum());
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #197 <Method com.ibotta.api.model.customer.CustomerAccount$Type CustomerAccount.getTypeEnum()>
	//   18   34:invokespecial   #463 <Method void launchCashOut(com.ibotta.api.model.customer.CustomerAccount$Type)>
	//   19   37:return          
	}

	protected void setBelowGlobalMinimumBalance(boolean flag)
	{
		belowGlobalMinimumBalance = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #109 <Field boolean belowGlobalMinimumBalance>
	//    3    5:return          
	}

	private static final float BALANCE_MINIMUM = 20F;
	private final AppConfig appConfig;
	private boolean belowGlobalMinimumBalance;
	private final BrazeTracking brazeTracking;
	private final CacheClearJobFactory cacheClearFactory;
	private SingleApiJob custByIdJob;
	private Customer customer;
	private CustomerAccount customerAccountToCashOut;
	private CustomerAccount customerAccountToDelete;
	private RelayApiJob customerAccountsJob;
	private final Formatting formatting;
	private final GiftCardHelper giftCardHelper;
	private SingleApiJob giftCardsJob;
	private String newEmail;
	private final PostAuthWorkJobFactory postAuthWorkJobFactory;
	private CashOutType selectedCashOutType;
	private final UserState userState;
	private final WithdrawReducer withdrawReducer;
}
