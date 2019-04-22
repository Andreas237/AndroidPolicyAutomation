// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout;

import android.content.res.Resources;
import com.ibotta.android.account.withdraw.CashOutReducer;
import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.ui.misc.password.PasswordPrompterFactory;
import com.ibotta.android.mvp.ui.misc.password.PasswordPrompterFactoryImpl;
import com.ibotta.android.security.PasswordCache;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.title.TitleBarReducer;
import com.ibotta.android.util.*;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.cashout:
//			CashOutPresenterImpl, CashOutActivity, CashOutPresenter

public class CashOutModule extends AbstractMvpModule
{

	public CashOutModule(CashOutActivity cashoutactivity)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (cashoutactivity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
		cashOutActivity = cashoutactivity;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field CashOutActivity cashOutActivity>
	//    6   10:return          
	}

	public static CashOutReducer provideCashOutReducer(TitleBarReducer titlebarreducer, Resources resources)
	{
		return new CashOutReducer(titlebarreducer, resources);
	//    0    0:new             #21  <Class CashOutReducer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #24  <Method void CashOutReducer(TitleBarReducer, Resources)>
	//    5    9:areturn         
	}

	public CashOutPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, UserState userstate, Validation validation, Formatting formatting, CacheClearJobFactory cacheclearjobfactory, CashOutReducer cashoutreducer)
	{
		return ((CashOutPresenter) (new CashOutPresenterImpl(mvppresenteractions, userstate, validation, formatting, cacheclearjobfactory, cashoutreducer)));
	//    0    0:new             #30  <Class CashOutPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:aload           5
	//    7   11:aload           6
	//    8   13:invokespecial   #33  <Method void CashOutPresenterImpl(MvpPresenterActions, UserState, Validation, Formatting, CacheClearJobFactory, CashOutReducer)>
	//    9   16:areturn         
	}

	public PasswordPrompterFactory providePasswordPrompterFactory(PasswordCache passwordcache, AppHelper apphelper)
	{
		return ((PasswordPrompterFactory) (new PasswordPrompterFactoryImpl(((com.ibotta.android.activity.CompatSupplier) (cashOutActivity)), passwordcache, apphelper)));
	//    0    0:new             #37  <Class PasswordPrompterFactoryImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field CashOutActivity cashOutActivity>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #40  <Method void PasswordPrompterFactoryImpl(com.ibotta.android.activity.CompatSupplier, PasswordCache, AppHelper)>
	//    7   13:areturn         
	}

	private final CashOutActivity cashOutActivity;
}
