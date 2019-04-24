// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			DemographicsFormActivity

final class DemographicsFormActivity$$Lambda$2
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(DemographicsFormActivity demographicsformactivity)
	{
		return ((android.view.View.OnClickListener) (new DemographicsFormActivity$$Lambda$2(demographicsformactivity)));
	//    0    0:new             #2   <Class DemographicsFormActivity$$Lambda$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void DemographicsFormActivity$$Lambda$2(DemographicsFormActivity)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		DemographicsFormActivity.lambda$onCreate$11(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DemographicsFormActivity arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void DemographicsFormActivity.lambda$onCreate$11(DemographicsFormActivity, View)>
	//    4    8:return          
	}

	private final DemographicsFormActivity arg$1;

	private DemographicsFormActivity$$Lambda$2(DemographicsFormActivity demographicsformactivity)
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
