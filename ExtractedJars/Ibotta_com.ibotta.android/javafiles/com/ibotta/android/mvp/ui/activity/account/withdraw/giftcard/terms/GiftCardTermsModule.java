// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms;

import com.ibotta.android.mvp.base.AbstractMvpModule;
import com.ibotta.android.mvp.base.MvpPresenterActions;
import com.ibotta.api.helper.card.GiftCardHelper;

// Referenced classes of package com.ibotta.android.mvp.ui.activity.account.withdraw.giftcard.terms:
//			GiftCardTermsPresenterImpl, GiftCardTermsView, GiftCardTermsPresenter

public class GiftCardTermsModule extends AbstractMvpModule
{

	public GiftCardTermsModule(GiftCardTermsView giftcardtermsview)
	{
		super(((com.ibotta.android.mvp.base.MvpView) (giftcardtermsview)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void AbstractMvpModule(com.ibotta.android.mvp.base.MvpView)>
	//    3    5:return          
	}

	public GiftCardTermsPresenter provideMvpPresenter(MvpPresenterActions mvppresenteractions, GiftCardHelper giftcardhelper)
	{
		return ((GiftCardTermsPresenter) (new GiftCardTermsPresenterImpl(mvppresenteractions, giftcardhelper)));
	//    0    0:new             #18  <Class GiftCardTermsPresenterImpl>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokespecial   #21  <Method void GiftCardTermsPresenterImpl(MvpPresenterActions, GiftCardHelper)>
	//    5    9:areturn         
	}
}
