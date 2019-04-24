// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			DemographicsFormActivity

final class DemographicsFormActivity$$Lambda$1
	implements android.view.View.OnFocusChangeListener
{

	public static android.view.View.OnFocusChangeListener lambdaFactory$(DemographicsFormActivity demographicsformactivity)
	{
		return ((android.view.View.OnFocusChangeListener) (new DemographicsFormActivity$$Lambda$1(demographicsformactivity)));
	//    0    0:new             #2   <Class DemographicsFormActivity$$Lambda$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void DemographicsFormActivity$$Lambda$1(DemographicsFormActivity)>
	//    4    8:areturn         
	}

	public void onFocusChange(View view, boolean flag)
	{
		DemographicsFormActivity.lambda$onCreate$10(arg$1, view, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DemographicsFormActivity arg$1>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #28  <Method void DemographicsFormActivity.lambda$onCreate$10(DemographicsFormActivity, View, boolean)>
	//    5    9:return          
	}

	private final DemographicsFormActivity arg$1;

	private DemographicsFormActivity$$Lambda$1(DemographicsFormActivity demographicsformactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = demographicsformactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field DemographicsFormActivity arg$1>
	//    5    9:return          
	}
}
