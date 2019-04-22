// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.ibotta.android.mvp.base.loading;


// Referenced classes of package com.ibotta.android.mvp.base.loading:
//			PtrLoadingMvpActivity

public final class _2D_$$Lambda$cdbd7hSIkV3RB2sbMR37wheYWsM
	implements android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener
{

	public final void onRefresh()
	{
		f$0.onRefresh();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field PtrLoadingMvpActivity f$0>
	//    2    4:invokevirtual   #21  <Method void PtrLoadingMvpActivity.onRefresh()>
	//    3    7:return          
	}

	private final PtrLoadingMvpActivity f$0;

	public _2D_$$Lambda$cdbd7hSIkV3RB2sbMR37wheYWsM(PtrLoadingMvpActivity ptrloadingmvpactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		f$0 = ptrloadingmvpactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field PtrLoadingMvpActivity f$0>
	//    5    9:return          
	}
}
