// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

// Referenced classes of package com.pactforcure.app.ui:
//			DnaCollectionActivity

final class DnaCollectionActivity$$Lambda$2
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$(DnaCollectionActivity dnacollectionactivity)
	{
		return ((android.view.View.OnClickListener) (new DnaCollectionActivity$$Lambda$2(dnacollectionactivity)));
	//    0    0:new             #2   <Class DnaCollectionActivity$$Lambda$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void DnaCollectionActivity$$Lambda$2(DnaCollectionActivity)>
	//    4    8:areturn         
	}

	public void onClick(View view)
	{
		DnaCollectionActivity.lambda$onCreate$13(arg$1, view);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field DnaCollectionActivity arg$1>
	//    2    4:aload_1         
	//    3    5:invokestatic    #28  <Method void DnaCollectionActivity.lambda$onCreate$13(DnaCollectionActivity, View)>
	//    4    8:return          
	}

	private final DnaCollectionActivity arg$1;

	private DnaCollectionActivity$$Lambda$2(DnaCollectionActivity dnacollectionactivity)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		arg$1 = dnacollectionactivity;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field DnaCollectionActivity arg$1>
	//    5    9:return          
	}
}
