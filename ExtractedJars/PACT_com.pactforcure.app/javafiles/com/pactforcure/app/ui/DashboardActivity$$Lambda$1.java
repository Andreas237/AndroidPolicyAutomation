// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			DashboardActivity

final class DashboardActivity$$Lambda$1
	implements Runnable
{

	public static Runnable lambdaFactory$(View view, View view1, View view2, View view3)
	{
		return ((Runnable) (new DashboardActivity$$Lambda$1(view, view1, view2, view3)));
	//    0    0:new             #2   <Class DashboardActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #29  <Method void DashboardActivity$$Lambda$1(View, View, View, View)>
	//    7   11:areturn         
	}

	public void run()
	{
		DashboardActivity.lambda$onCreate$9(arg$1, arg$2, arg$3, arg$4);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field View arg$1>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field View arg$2>
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field View arg$3>
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field View arg$4>
	//    8   16:invokestatic    #35  <Method void DashboardActivity.lambda$onCreate$9(View, View, View, View)>
	//    9   19:return          
	}

	private final View arg$1;
	private final View arg$2;
	private final View arg$3;
	private final View arg$4;

	private DashboardActivity$$Lambda$1(View view, View view1, View view2, View view3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		arg$1 = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field View arg$1>
		arg$2 = view1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field View arg$2>
		arg$3 = view2;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #22  <Field View arg$3>
		arg$4 = view3;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #24  <Field View arg$4>
	//   14   25:return          
	}
}
