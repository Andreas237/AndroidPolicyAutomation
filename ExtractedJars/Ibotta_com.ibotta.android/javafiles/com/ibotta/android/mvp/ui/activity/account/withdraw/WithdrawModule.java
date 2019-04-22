// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw;

import com.ibotta.android.account.withdraw.WithdrawReducer;
import com.ibotta.android.api.auth.PostAuthWorkJobFactory;
import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.ui.misc.password.PasswordPrompterFactory;
import com.ibotta.android.mvp.ui.misc.password.PasswordPrompterFactoryImpl;
import com.ibotta.android.security.PasswordCache;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.app.config.AppConfig;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.title.TitleBarReducer;
import com.ibotta.android.tracking.braze.BrazeTracking;
import com.ibotta.android.util.AppHelper;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.card.GiftCardHelper;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw:
//			WithdrawPresenterImpl, WithdrawActivity, WithdrawPresenter

public class WithdrawModule extends AbstractMvpModule
{

	public WithdrawModule(WithdrawActivity withdrawactivity)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (withdrawactivity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
		withdrawActivity = withdrawactivity;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field WithdrawActivity withdrawActivity>
	//    6   10:return          
	}

	public static WithdrawReducer provideWithdrawReducer(TitleBarReducer titlebarreducer)
	{
		return new WithdrawReducer(titlebarreducer);
	//    0    0:new             #21  <Class WithdrawReducer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #24  <Method void WithdrawReducer(TitleBarReducer)>
	//    4    8:areturn         
	}

	public WithdrawPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, Formatting formatting, GiftCardHelper giftcardhelper, UserState userstate, AppConfig appconfig, BrazeTracking brazetracking, PostAuthWorkJobFactory postauthworkjobfactory, 
			CacheClearJobFactory cacheclearjobfactory, WithdrawReducer withdrawreducer)
	{
		return ((WithdrawPresenter) (new WithdrawPresenterImpl(mvppresenteractions, formatting, userstate, appconfig, brazetracking, giftcardhelper, postauthworkjobfactory, cacheclearjobfactory, withdrawreducer)));
	//    0    0:new             #30  <Class WithdrawPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload           4
	//    5    8:aload           5
	//    6   10:aload           6
	//    7   12:aload_3         
	//    8   13:aload           7
	//    9   15:aload           8
	//   10   17:aload           9
	//   11   19:invokespecial   #33  <Method void WithdrawPresenterImpl(MvpPresenterActions, Formatting, UserState, AppConfig, BrazeTracking, GiftCardHelper, PostAuthWorkJobFactory, CacheClearJobFactory, WithdrawReducer)>
	//   12   22:areturn         
	}

	public PasswordPrompterFactory providePasswordPrompterFactory(PasswordCache passwordcache, AppHelper apphelper)
	{
		return ((PasswordPrompterFactory) (new PasswordPrompterFactoryImpl(((com.ibotta.android.activity.CompatSupplier) (withdrawActivity)), passwordcache, apphelper)));
	//    0    0:new             #37  <Class PasswordPrompterFactoryImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field WithdrawActivity withdrawActivity>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #40  <Method void PasswordPrompterFactoryImpl(com.ibotta.android.activity.CompatSupplier, PasswordCache, AppHelper)>
	//    7   13:areturn         
	}

	private final WithdrawActivity withdrawActivity;
}
