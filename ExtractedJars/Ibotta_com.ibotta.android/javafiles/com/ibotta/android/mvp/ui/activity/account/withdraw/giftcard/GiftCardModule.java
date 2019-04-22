// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard;

import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.android.mvp.ui.misc.password.PasswordPrompterFactory;
import com.ibotta.android.mvp.ui.misc.password.PasswordPrompterFactoryImpl;
import com.ibotta.android.security.PasswordCache;
import com.ibotta.android.service.api.job.CacheClearJobFactory;
import com.ibotta.android.state.user.UserState;
import com.ibotta.android.util.AppHelper;
import com.ibotta.api.helper.card.GiftCardHelper;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard:
//			GiftCardPresenterImpl, GiftCardActivity, GiftCardPresenter

public class GiftCardModule extends AbstractMvpModule
{

	public GiftCardModule(GiftCardActivity giftcardactivity)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (giftcardactivity)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
		giftCardActivity = giftcardactivity;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #15  <Field GiftCardActivity giftCardActivity>
	//    6   10:return          
	}

	public GiftCardPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, UserState userstate, GiftCardHelper giftcardhelper, CacheClearJobFactory cacheclearjobfactory)
	{
		return ((GiftCardPresenter) (new GiftCardPresenterImpl(mvppresenteractions, userstate, giftcardhelper, cacheclearjobfactory)));
	//    0    0:new             #22  <Class GiftCardPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokespecial   #25  <Method void GiftCardPresenterImpl(MvpPresenterActions, UserState, GiftCardHelper, CacheClearJobFactory)>
	//    7   12:areturn         
	}

	public PasswordPrompterFactory providePasswordPrompterFactory(PasswordCache passwordcache, AppHelper apphelper)
	{
		return ((PasswordPrompterFactory) (new PasswordPrompterFactoryImpl(((com.ibotta.android.activity.CompatSupplier) (giftCardActivity)), passwordcache, apphelper)));
	//    0    0:new             #30  <Class PasswordPrompterFactoryImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field GiftCardActivity giftCardActivity>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokespecial   #33  <Method void PasswordPrompterFactoryImpl(com.ibotta.android.activity.CompatSupplier, PasswordCache, AppHelper)>
	//    7   13:areturn         
	}

	private final GiftCardActivity giftCardActivity;
}
