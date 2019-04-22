// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base;

import android.content.Context;
import com.ibotta.android.features.factory.VariantFactory;
import com.ibotta.android.fragment.dialog.RedeemPreFlightHelper;
import com.ibotta.android.hardware.Hardware;
import com.ibotta.android.service.api.ApiWorkSubmitter;
import com.ibotta.android.util.Formatting;
import com.ibotta.api.helper.offer.OfferHelper;

// Referenced classes of package com.ibotta.android.mvp.base:
//			MvpView

public abstract class AbstractMvpModule
{

	public AbstractMvpModule(MvpView mvpview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mvpView = mvpview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field MvpView mvpView>
	//    5    9:return          
	}

	public MvpView provideMvpView()
	{
		return mvpView;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MvpView mvpView>
	//    2    4:areturn         
	}

	public RedeemPreFlightHelper provideRedeemPreflightHelper(OfferHelper offerhelper, Hardware hardware, Formatting formatting, ApiWorkSubmitter apiworksubmitter, VariantFactory variantfactory)
	{
		MvpView mvpview = mvpView;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field MvpView mvpView>
	//    2    4:astore          6
		return new RedeemPreFlightHelper((Context)mvpview, hardware, formatting, apiworksubmitter, ((com.ibotta.android.activity.CompatSupplier) (mvpview)), offerhelper, variantfactory);
	//    3    6:new             #29  <Class RedeemPreFlightHelper>
	//    4    9:dup             
	//    5   10:aload           6
	//    6   12:checkcast       #31  <Class Context>
	//    7   15:aload_2         
	//    8   16:aload_3         
	//    9   17:aload           4
	//   10   19:aload           6
	//   11   21:aload_1         
	//   12   22:aload           5
	//   13   24:invokespecial   #34  <Method void RedeemPreFlightHelper(Context, Hardware, Formatting, ApiWorkSubmitter, com.ibotta.android.activity.CompatSupplier, OfferHelper, VariantFactory)>
	//   14   27:areturn         
	}

	private final MvpView mvpView;
}
