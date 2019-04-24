// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.View;

// Referenced classes of package com.irobot.home:
//			MaintenanceCategoryActivity

class MaintenanceCategoryActivity$2
	implements android.view.View.OnClickListener
{

	public void onClick(View view)
	{
		MaintenanceCategoryActivity.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field MaintenanceCategoryActivity a>
	//    2    4:invokestatic    #25  <Method void MaintenanceCategoryActivity.b(MaintenanceCategoryActivity)>
	//    3    7:return          
	}

	final MaintenanceCategoryActivity a;

	MaintenanceCategoryActivity$2(MaintenanceCategoryActivity maintenancecategoryactivity)
	{
		a = maintenancecategoryactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field MaintenanceCategoryActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
