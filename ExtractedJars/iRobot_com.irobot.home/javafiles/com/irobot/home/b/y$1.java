// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.b;

import android.view.View;
import com.irobot.core.AnalyticsSubsystem;
import com.irobot.core.MaintenancePart;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.b:
//			y

class y$1
	implements android.view..OnClickListener
{

	public void onClick(View view)
	{
		j.a(y.a(b), a.getBuyLink());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field y b>
	//    2    4:invokestatic    #30  <Method android.app.Activity y.a(y)>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field MaintenancePart a>
	//    5   11:invokevirtual   #36  <Method String MaintenancePart.getBuyLink()>
	//    6   14:invokestatic    #41  <Method void j.a(android.app.Activity, String)>
		AnalyticsSubsystem.getInstance().trackStoreView();
	//    7   17:invokestatic    #47  <Method AnalyticsSubsystem AnalyticsSubsystem.getInstance()>
	//    8   20:invokevirtual   #50  <Method void AnalyticsSubsystem.trackStoreView()>
	//    9   23:return          
	}

	final MaintenancePart a;
	final y b;

	y$1(y y1, MaintenancePart maintenancepart)
	{
		b = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field y b>
		a = maintenancepart;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field MaintenancePart a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
