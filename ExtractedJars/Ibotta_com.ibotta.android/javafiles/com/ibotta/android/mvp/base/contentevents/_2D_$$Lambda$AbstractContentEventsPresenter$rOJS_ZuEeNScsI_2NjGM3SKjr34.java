// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.contentevents;

import com.ibotta.android.mvp.ui.activity.mcomm.escort.McommEscortParamsParcel;

// Referenced classes of package com.ibotta.android.mvp.base.contentevents:
//			AbstractContentEventsPresenter

public final class _2D_$$Lambda$AbstractContentEventsPresenter$rOJS_ZuEeNScsI_2NjGM3SKjr34
	implements Runnable
{

	public final void run()
	{
		AbstractContentEventsPresenter.lambda$onMcommEscort$0(f$0, f$1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field AbstractContentEventsPresenter f$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field McommEscortParamsParcel f$1>
	//    4    8:invokestatic    #26  <Method void AbstractContentEventsPresenter.lambda$onMcommEscort$0(AbstractContentEventsPresenter, McommEscortParamsParcel)>
	//    5   11:return          
	}

	private final AbstractContentEventsPresenter f$0;
	private final McommEscortParamsParcel f$1;

	public _2D_$$Lambda$AbstractContentEventsPresenter$rOJS_ZuEeNScsI_2NjGM3SKjr34(AbstractContentEventsPresenter abstractcontenteventspresenter, McommEscortParamsParcel mcommescortparamsparcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		f$0 = abstractcontenteventspresenter;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field AbstractContentEventsPresenter f$0>
		f$1 = mcommescortparamsparcel;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #19  <Field McommEscortParamsParcel f$1>
	//    8   14:return          
	}
}
