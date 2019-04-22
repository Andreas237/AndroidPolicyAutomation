// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account;

import com.ibotta.android.aop.tracking.TrackingAspect;
import com.ibotta.android.aop.tracking.advice.BasePwiAdviceFields;
import com.ibotta.android.features.variant.account.TeamworkVariant;
import com.ibotta.android.features.variant.pwi.PwiVariant;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.base.loading.AbstractLoadingMvpPresenter;
import com.ibotta.android.mvp.ui.activity.account.row.AccountProfileRow;
import com.ibotta.android.service.api.job.SingleApiJob;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.tracking.Tracker;
import com.ibotta.api.call.customer.CustomerByIdCall;
import com.ibotta.api.call.customer.CustomerByIdResponse;
import com.ibotta.api.model.customer.Customer;
import java.util.*;
import java9.util.stream.*;
import org.aspectj.runtime.reflect.Factory;
import timber.log.Timber;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account:
//			AccountPresenter, AccountView, AccountTracking, AccountMenu

public class AccountPresenterImpl extends AbstractLoadingMvpPresenter
	implements BasePwiAdviceFields, AccountPresenter
{

	public AccountPresenterImpl(MvpPresenterActions mvppresenteractions, UserState userstate, Tracker tracker1, AccountTracking accounttracking, PwiVariant pwivariant, TeamworkVariant teamworkvariant)
	{
		super(mvppresenteractions);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #38  <Method void AbstractLoadingMvpPresenter(MvpPresenterActions)>
		userState = userstate;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #40  <Field UserState userState>
		tracker = tracker1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #42  <Field Tracker tracker>
		accountTracking = accounttracking;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #44  <Field AccountTracking accountTracking>
		pwiVariant = pwivariant;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #46  <Field PwiVariant pwiVariant>
		teamworkVariant = teamworkvariant;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #48  <Field TeamworkVariant teamworkVariant>
	//   18   33:return          
	}

	private static void ajc$preClinit()
	{
		Factory factory = new Factory("AccountPresenterImpl.java", com/ibotta/android/mvp/ui/activity/account/AccountPresenterImpl);
	//    0    0:new             #50  <Class Factory>
	//    1    3:dup             
	//    2    4:ldc1            #52  <String "AccountPresenterImpl.java">
	//    3    6:ldc1            #2   <Class AccountPresenterImpl>
	//    4    8:invokespecial   #55  <Method void Factory(String, Class)>
	//    5   11:astore_0        
		ajc$tjp_0 = factory.makeSJP("method-execution", ((org.aspectj.lang.Signature) (factory.makeMethodSig("2", "trackWalletViewImpression", "com.ibotta.android.mvp.ui.activity.account.AccountPresenterImpl", "", "", "", "void"))), 182);
	//    6   12:aload_0         
	//    7   13:ldc1            #57  <String "method-execution">
	//    8   15:aload_0         
	//    9   16:ldc1            #59  <String "2">
	//   10   18:ldc1            #61  <String "trackWalletViewImpression">
	//   11   20:ldc1            #63  <String "com.ibotta.android.mvp.ui.activity.account.AccountPresenterImpl">
	//   12   22:ldc1            #65  <String "">
	//   13   24:ldc1            #65  <String "">
	//   14   26:ldc1            #65  <String "">
	//   15   28:ldc1            #67  <String "void">
	//   16   30:invokevirtual   #71  <Method org.aspectj.lang.reflect.MethodSignature Factory.makeMethodSig(String, String, String, String, String, String, String)>
	//   17   33:sipush          182
	//   18   36:invokevirtual   #75  <Method org.aspectj.lang.JoinPoint$StaticPart Factory.makeSJP(String, org.aspectj.lang.Signature, int)>
	//   19   39:putstatic       #77  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//   20   42:return          
	}

	private void trackWalletViewImpression()
	{
		org.aspectj.lang.JoinPoint joinpoint = Factory.makeJP(ajc$tjp_0, ((Object) (this)), ((Object) (this)));
	//    0    0:getstatic       #77  <Field org.aspectj.lang.JoinPoint$StaticPart ajc$tjp_0>
	//    1    3:aload_0         
	//    2    4:aload_0         
	//    3    5:invokestatic    #85  <Method org.aspectj.lang.JoinPoint Factory.makeJP(org.aspectj.lang.JoinPoint$StaticPart, Object, Object)>
	//    4    8:astore_1        
		TrackingAspect.aspectOf().before(joinpoint);
	//    5    9:invokestatic    #91  <Method TrackingAspect TrackingAspect.aspectOf()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #95  <Method void TrackingAspect.before(org.aspectj.lang.JoinPoint)>
		Timber.d("Tracking manage transactions click.", new Object[0]);
	//    8   16:ldc1            #97  <String "Tracking manage transactions click.">
	//    9   18:iconst_0        
	//   10   19:anewarray       Object[]
	//   11   22:invokestatic    #105 <Method void Timber.d(String, Object[])>
	//   12   25:return          
	}

	public Class getActivityClass()
	{
		return ((Object) ((AccountView)mvpView)).getClass();
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    2    4:checkcast       #114 <Class AccountView>
	//    3    7:invokevirtual   #117 <Method Class Object.getClass()>
	//    4   10:areturn         
	}

	protected Set getFetchJobs()
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #121 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #123 <Method void HashSet()>
	//    3    7:astore_1        
		if(custByIdJob == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #125 <Field SingleApiJob custByIdJob>
	//*   6   12:ifnonnull       42
			custByIdJob = new SingleApiJob(((com.ibotta.api.ApiCall) (new CustomerByIdCall(userState.getCustomerId()))));
	//    7   15:aload_0         
	//    8   16:new             #127 <Class SingleApiJob>
	//    9   19:dup             
	//   10   20:new             #129 <Class CustomerByIdCall>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #40  <Field UserState userState>
	//   14   28:invokeinterface #135 <Method int UserState.getCustomerId()>
	//   15   33:invokespecial   #138 <Method void CustomerByIdCall(int)>
	//   16   36:invokespecial   #141 <Method void SingleApiJob(com.ibotta.api.ApiCall)>
	//   17   39:putfield        #125 <Field SingleApiJob custByIdJob>
		((Set) (hashset)).add(((Object) (custByIdJob)));
	//   18   42:aload_1         
	//   19   43:aload_0         
	//   20   44:getfield        #125 <Field SingleApiJob custByIdJob>
	//   21   47:invokeinterface #147 <Method boolean Set.add(Object)>
	//   22   52:pop             
		return ((Set) (hashset));
	//   23   53:aload_1         
	//   24   54:areturn         
	}

	protected void onAbandonFetchJobs()
	{
		custByIdJob = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #125 <Field SingleApiJob custByIdJob>
	//    3    5:return          
	}

	public void onEarningsProgressBarClicked()
	{
		tracker.event("earnings_progress_bar_click");
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Tracker tracker>
	//    2    4:ldc1            #153 <String "earnings_progress_bar_click">
	//    3    6:invokeinterface #159 <Method void Tracker.event(String)>
	//    4   11:return          
	}

	protected void onFetchFinishedSuccessfully()
	{
		customer = ((CustomerByIdResponse)custByIdJob.getApiResponse()).getCustomer();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #125 <Field SingleApiJob custByIdJob>
	//    3    5:invokevirtual   #164 <Method com.ibotta.api.ApiResponse SingleApiJob.getApiResponse()>
	//    4    8:checkcast       #166 <Class CustomerByIdResponse>
	//    5   11:invokevirtual   #170 <Method Customer CustomerByIdResponse.getCustomer()>
	//    6   14:putfield        #172 <Field Customer customer>
		Object obj = ((Object) (new AccountProfileRow()));
	//    7   17:new             #174 <Class AccountProfileRow>
	//    8   20:dup             
	//    9   21:invokespecial   #175 <Method void AccountProfileRow()>
	//   10   24:astore_1        
		((AccountProfileRow) (obj)).setCustomer(customer);
	//   11   25:aload_1         
	//   12   26:aload_0         
	//   13   27:getfield        #172 <Field Customer customer>
	//   14   30:invokevirtual   #179 <Method void AccountProfileRow.setCustomer(Customer)>
		obj = ((Object) ((List)java9.util.stream.Stream._2D_CC.concat(java9.util.stream.Stream._2D_CC.of(obj), StreamSupport.stream(((java.util.Collection) (pwiVariant.createAccountRows()))).filter(teamworkVariant.filterPredicate())).collect(Collectors.toUnmodifiableList())));
	//   15   33:aload_1         
	//   16   34:invokestatic    #185 <Method Stream java9.util.stream.Stream$_2D_CC.of(Object)>
	//   17   37:aload_0         
	//   18   38:getfield        #46  <Field PwiVariant pwiVariant>
	//   19   41:invokeinterface #191 <Method List PwiVariant.createAccountRows()>
	//   20   46:invokestatic    #197 <Method Stream StreamSupport.stream(java.util.Collection)>
	//   21   49:aload_0         
	//   22   50:getfield        #48  <Field TeamworkVariant teamworkVariant>
	//   23   53:invokeinterface #203 <Method java9.util.function.Predicate TeamworkVariant.filterPredicate()>
	//   24   58:invokeinterface #209 <Method Stream Stream.filter(java9.util.function.Predicate)>
	//   25   63:invokestatic    #213 <Method Stream java9.util.stream.Stream$_2D_CC.concat(Stream, Stream)>
	//   26   66:invokestatic    #219 <Method java9.util.stream.Collector Collectors.toUnmodifiableList()>
	//   27   69:invokeinterface #223 <Method Object Stream.collect(java9.util.stream.Collector)>
	//   28   74:checkcast       #225 <Class List>
	//   29   77:astore_1        
		((AccountView)mvpView).setAccountRows(((List) (obj)));
	//   30   78:aload_0         
	//   31   79:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   32   82:checkcast       #114 <Class AccountView>
	//   33   85:aload_1         
	//   34   86:invokeinterface #229 <Method void AccountView.setAccountRows(List)>
	//   35   91:return          
	}

	protected void onFetchFinishedWithFailures()
	{
		super.onFetchFinishedWithFailures();
	//    0    0:aload_0         
	//    1    1:invokespecial   #232 <Method void AbstractLoadingMvpPresenter.onFetchFinishedWithFailures()>
		if(networkConnectionErrorViewShowing)
	//*   2    4:aload_0         
	//*   3    5:getfield        #236 <Field boolean networkConnectionErrorViewShowing>
	//*   4    8:ifeq            23
			((AccountView)mvpView).setTitleForLoadFailure();
	//    5   11:aload_0         
	//    6   12:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    7   15:checkcast       #114 <Class AccountView>
	//    8   18:invokeinterface #239 <Method void AccountView.setTitleForLoadFailure()>
	//    9   23:return          
	}

	public void onLinkAccountClicked()
	{
		accountTracking.trackLinkAccountClick();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field AccountTracking accountTracking>
	//    2    4:invokevirtual   #245 <Method void AccountTracking.trackLinkAccountClick()>
		((AccountView)mvpView).linkAccount();
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5   11:checkcast       #114 <Class AccountView>
	//    6   14:invokeinterface #248 <Method void AccountView.linkAccount()>
	//    7   19:return          
	}

	public void onPendingReceiptsClicked()
	{
		tracker.event("pending_earnings_banner_click");
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Tracker tracker>
	//    2    4:ldc1            #251 <String "pending_earnings_banner_click">
	//    3    6:invokeinterface #159 <Method void Tracker.event(String)>
		accountTracking.trackPendingEarningsClick();
	//    4   11:aload_0         
	//    5   12:getfield        #44  <Field AccountTracking accountTracking>
	//    6   15:invokevirtual   #254 <Method void AccountTracking.trackPendingEarningsClick()>
		((AccountView)mvpView).showPendingReceipts();
	//    7   18:aload_0         
	//    8   19:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    9   22:checkcast       #114 <Class AccountView>
	//   10   25:invokeinterface #257 <Method void AccountView.showPendingReceipts()>
	//   11   30:return          
	}

	public void onProfileImageClicked()
	{
		accountTracking.trackProfileImageClick();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field AccountTracking accountTracking>
	//    2    4:invokevirtual   #261 <Method void AccountTracking.trackProfileImageClick()>
		((AccountView)mvpView).showFullscreenProfilePic(customer.getProfilePictureUrl());
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5   11:checkcast       #114 <Class AccountView>
	//    6   14:aload_0         
	//    7   15:getfield        #172 <Field Customer customer>
	//    8   18:invokevirtual   #267 <Method String Customer.getProfilePictureUrl()>
	//    9   21:invokeinterface #270 <Method void AccountView.showFullscreenProfilePic(String)>
	//   10   26:return          
	}

	public void onQuestionMarkClicked()
	{
		accountTracking.trackQuestionMarkClick();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field AccountTracking accountTracking>
	//    2    4:invokevirtual   #274 <Method void AccountTracking.trackQuestionMarkClick()>
		((AccountView)mvpView).showWithdrawCash();
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5   11:checkcast       #114 <Class AccountView>
	//    6   14:invokeinterface #277 <Method void AccountView.showWithdrawCash()>
	//    7   19:return          
	}

	public void onRowClicked(AccountMenu accountmenu)
	{
		accountTracking.trackAccountMenuItemClick(accountmenu);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field AccountTracking accountTracking>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #282 <Method void AccountTracking.trackAccountMenuItemClick(AccountMenu)>
		static class _cls1
		{

			static final int $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[];

			static 
			{
				$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu = new int[AccountMenu.values().length];
			//    0    0:invokestatic    #18  <Method AccountMenu[] AccountMenu.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.BONUSES.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//    5   12:getstatic       #24  <Field AccountMenu AccountMenu.BONUSES>
			//    6   15:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//*  10   23:getstatic       #31  <Field AccountMenu AccountMenu.PAYMENT_HISTORY>
			//*  11   26:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//*  15   34:getstatic       #34  <Field AccountMenu AccountMenu.INVITE_FRIENDS>
			//*  16   37:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//*  20   45:getstatic       #37  <Field AccountMenu AccountMenu.TEAMWORK>
			//*  21   48:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//*  25   56:getstatic       #40  <Field AccountMenu AccountMenu.MY_EARNINGS>
			//*  26   59:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//*  30   67:getstatic       #43  <Field AccountMenu AccountMenu.MY_FAVORITES>
			//*  31   70:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//*  32   73:bipush          6
			//*  33   75:iastore         
			//*  34   76:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//*  35   79:getstatic       #46  <Field AccountMenu AccountMenu.SETTINGS>
			//*  36   82:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//*  37   85:bipush          7
			//*  38   87:iastore         
			//*  39   88:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//*  40   91:getstatic       #49  <Field AccountMenu AccountMenu.HELP>
			//*  41   94:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//*  42   97:bipush          8
			//*  43   99:iastore         
			//*  44  100:getstatic       #20  <Field int[] $SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
			//*  45  103:getstatic       #52  <Field AccountMenu AccountMenu.HOW_TO>
			//*  46  106:invokevirtual   #28  <Method int AccountMenu.ordinal()>
			//*  47  109:bipush          9
			//*  48  111:iastore         
			//*  49  112:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   50  113:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.PAYMENT_HISTORY.ordinal()] = 2;
				}
			//*  51  114:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   52  117:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.INVITE_FRIENDS.ordinal()] = 3;
				}
			//*  53  118:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   54  121:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.TEAMWORK.ordinal()] = 4;
				}
			//*  55  122:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   56  125:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.MY_EARNINGS.ordinal()] = 5;
				}
			//*  57  126:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   58  129:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.MY_FAVORITES.ordinal()] = 6;
				}
			//*  59  130:goto            64
				catch(NoSuchFieldError nosuchfielderror5) { }
			//   60  133:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.SETTINGS.ordinal()] = 7;
				}
			//*  61  134:goto            76
				catch(NoSuchFieldError nosuchfielderror6) { }
			//   62  137:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.HELP.ordinal()] = 8;
				}
			//*  63  138:goto            88
				catch(NoSuchFieldError nosuchfielderror7) { }
			//   64  141:astore_0        
				try
				{
					$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu[AccountMenu.HOW_TO.ordinal()] = 9;
				}
			//*  65  142:goto            100
				catch(NoSuchFieldError nosuchfielderror8) { }
			//   66  145:astore_0        
			//*  67  146:return          
			}
		}

		switch(_cls1..SwitchMap.com.ibotta.android.mvp.ui.activity.account.AccountMenu[accountmenu.ordinal()])
	//*   4    8:getstatic       #286 <Field int[] AccountPresenterImpl$1.$SwitchMap$com$ibotta$android$mvp$ui$activity$account$AccountMenu>
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #291 <Method int AccountMenu.ordinal()>
	//*   7   15:iaload          
		{
	//*   8   16:tableswitch     1 9: default 68
	//	               1 201
	//	               2 184
	//	               3 159
	//	               4 146
	//	               5 121
	//	               6 108
	//	               7 95
	//	               8 82
	//	               9 69
		default:
			return;
	//    9   68:return          

		case 9: // '\t'
			((AccountView)mvpView).showHowTo();
	//   10   69:aload_0         
	//   11   70:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   12   73:checkcast       #114 <Class AccountView>
	//   13   76:invokeinterface #294 <Method void AccountView.showHowTo()>
			return;
	//   14   81:return          

		case 8: // '\b'
			((AccountView)mvpView).showHelp();
	//   15   82:aload_0         
	//   16   83:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   17   86:checkcast       #114 <Class AccountView>
	//   18   89:invokeinterface #297 <Method void AccountView.showHelp()>
			return;
	//   19   94:return          

		case 7: // '\007'
			((AccountView)mvpView).showSettings();
	//   20   95:aload_0         
	//   21   96:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   22   99:checkcast       #114 <Class AccountView>
	//   23  102:invokeinterface #300 <Method void AccountView.showSettings()>
			return;
	//   24  107:return          

		case 6: // '\006'
			((AccountView)mvpView).showMyFavorites();
	//   25  108:aload_0         
	//   26  109:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   27  112:checkcast       #114 <Class AccountView>
	//   28  115:invokeinterface #303 <Method void AccountView.showMyFavorites()>
			return;
	//   29  120:return          

		case 5: // '\005'
			tracker.event("my_earnings_click");
	//   30  121:aload_0         
	//   31  122:getfield        #42  <Field Tracker tracker>
	//   32  125:ldc2            #305 <String "my_earnings_click">
	//   33  128:invokeinterface #159 <Method void Tracker.event(String)>
			((AccountView)mvpView).showMyEarnings();
	//   34  133:aload_0         
	//   35  134:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   36  137:checkcast       #114 <Class AccountView>
	//   37  140:invokeinterface #308 <Method void AccountView.showMyEarnings()>
			return;
	//   38  145:return          

		case 4: // '\004'
			((AccountView)mvpView).showTeamwork();
	//   39  146:aload_0         
	//   40  147:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   41  150:checkcast       #114 <Class AccountView>
	//   42  153:invokeinterface #311 <Method void AccountView.showTeamwork()>
			return;
	//   43  158:return          

		case 3: // '\003'
			tracker.event("invite_friends_and_earn_click");
	//   44  159:aload_0         
	//   45  160:getfield        #42  <Field Tracker tracker>
	//   46  163:ldc2            #313 <String "invite_friends_and_earn_click">
	//   47  166:invokeinterface #159 <Method void Tracker.event(String)>
			((AccountView)mvpView).showInviteFriends();
	//   48  171:aload_0         
	//   49  172:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   50  175:checkcast       #114 <Class AccountView>
	//   51  178:invokeinterface #316 <Method void AccountView.showInviteFriends()>
			return;
	//   52  183:return          

		case 2: // '\002'
			((AccountView)mvpView).showGiftCards();
	//   53  184:aload_0         
	//   54  185:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   55  188:checkcast       #114 <Class AccountView>
	//   56  191:invokeinterface #319 <Method void AccountView.showGiftCards()>
			trackWalletViewImpression();
	//   57  196:aload_0         
	//   58  197:invokespecial   #321 <Method void trackWalletViewImpression()>
			return;
	//   59  200:return          

		case 1: // '\001'
			((AccountView)mvpView).showBonuses();
	//   60  201:aload_0         
	//   61  202:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//   62  205:checkcast       #114 <Class AccountView>
	//   63  208:invokeinterface #324 <Method void AccountView.showBonuses()>
			return;
	//   64  213:return          
		}
	}

	public void onWithdrawCashClicked()
	{
		accountTracking.trackWithdrawCashClick();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field AccountTracking accountTracking>
	//    2    4:invokevirtual   #328 <Method void AccountTracking.trackWithdrawCashClick()>
		((AccountView)mvpView).showWithdrawCash();
	//    3    7:aload_0         
	//    4    8:getfield        #112 <Field com.ibotta.android.mvp.base.MvpView mvpView>
	//    5   11:checkcast       #114 <Class AccountView>
	//    6   14:invokeinterface #277 <Method void AccountView.showWithdrawCash()>
	//    7   19:return          
	}

	private static final org.aspectj.lang.JoinPoint.StaticPart ajc$tjp_0;
	private final AccountTracking accountTracking;
	private SingleApiJob custByIdJob;
	private Customer customer;
	private final PwiVariant pwiVariant;
	private final TeamworkVariant teamworkVariant;
	private final Tracker tracker;
	private final UserState userState;

	static 
	{
		ajc$preClinit();
	//    0    0:invokestatic    #32  <Method void ajc$preClinit()>
	//*   1    3:return          
	}
}
