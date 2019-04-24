// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;


// Referenced classes of package com.irobot.home.view:
//			BatteryGaugeView

class BatteryGaugeView$1
	implements Runnable
{

	public void run()
	{
		if(BatteryGaugeView.a(a) == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field BatteryGaugeView a>
	//*   2    4:invokestatic    #24  <Method android.view.View BatteryGaugeView.a(BatteryGaugeView)>
	//*   3    7:ifnonnull       17
			BatteryGaugeView.b(a);
	//    4   10:aload_0         
	//    5   11:getfield        #16  <Field BatteryGaugeView a>
	//    6   14:invokestatic    #27  <Method void BatteryGaugeView.b(BatteryGaugeView)>
		BatteryGaugeView.c(a);
	//    7   17:aload_0         
	//    8   18:getfield        #16  <Field BatteryGaugeView a>
	//    9   21:invokestatic    #30  <Method void BatteryGaugeView.c(BatteryGaugeView)>
		BatteryGaugeView.d(a);
	//   10   24:aload_0         
	//   11   25:getfield        #16  <Field BatteryGaugeView a>
	//   12   28:invokestatic    #33  <Method void BatteryGaugeView.d(BatteryGaugeView)>
		a.requestLayout();
	//   13   31:aload_0         
	//   14   32:getfield        #16  <Field BatteryGaugeView a>
	//   15   35:invokevirtual   #36  <Method void BatteryGaugeView.requestLayout()>
		a.invalidate();
	//   16   38:aload_0         
	//   17   39:getfield        #16  <Field BatteryGaugeView a>
	//   18   42:invokevirtual   #39  <Method void BatteryGaugeView.invalidate()>
	//   19   45:return          
	}

	final BatteryGaugeView a;

	BatteryGaugeView$1(BatteryGaugeView batterygaugeview)
	{
		a = batterygaugeview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field BatteryGaugeView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
