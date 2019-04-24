// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.view.MenuItem;

// Referenced classes of package com.irobot.home:
//			FloorPlanActivity, TrainRobotActivity_, SmartMapTipsActivity_

class FloorPlanActivity$1
	implements android.widget.ClickListener
{

	public boolean onMenuItemClick(MenuItem menuitem)
	{
		int i = menuitem.getItemId();
	//    0    0:aload_1         
	//    1    1:invokeinterface #28  <Method int MenuItem.getItemId()>
	//    2    6:istore_2        
		if(i != 0x7f090255)
	//*   3    7:iload_2         
	//*   4    8:ldc1            #29  <Int 0x7f090255>
	//*   5   10:icmpeq          40
		{
			if(i == 0x7f090259)
	//*   6   13:iload_2         
	//*   7   14:ldc1            #30  <Int 0x7f090259>
	//*   8   16:icmpeq          22
	//*   9   19:goto            51
				TrainRobotActivity_.a(((android.content.Context) (a))).a(false).a();
	//   10   22:aload_0         
	//   11   23:getfield        #17  <Field FloorPlanActivity a>
	//   12   26:invokestatic    #35  <Method TrainRobotActivity_$a TrainRobotActivity_.a(android.content.Context)>
	//   13   29:iconst_0        
	//   14   30:invokevirtual   #40  <Method TrainRobotActivity_$a TrainRobotActivity_$a.a(boolean)>
	//   15   33:invokevirtual   #43  <Method org.androidannotations.api.a.e TrainRobotActivity_$a.a()>
	//   16   36:pop             
		} else
	//*  17   37:goto            51
		{
			SmartMapTipsActivity_.a(((android.content.Context) (a))).a();
	//   18   40:aload_0         
	//   19   41:getfield        #17  <Field FloorPlanActivity a>
	//   20   44:invokestatic    #48  <Method SmartMapTipsActivity_$a SmartMapTipsActivity_.a(android.content.Context)>
	//   21   47:invokevirtual   #51  <Method org.androidannotations.api.a.e SmartMapTipsActivity_$a.a()>
	//   22   50:pop             
		}
		return true;
	//   23   51:iconst_1        
	//   24   52:ireturn         
	}

	final FloorPlanActivity a;

	FloorPlanActivity$1(FloorPlanActivity floorplanactivity)
	{
		a = floorplanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field FloorPlanActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
