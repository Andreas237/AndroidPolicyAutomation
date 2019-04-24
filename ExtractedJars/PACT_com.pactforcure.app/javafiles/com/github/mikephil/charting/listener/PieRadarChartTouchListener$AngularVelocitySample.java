// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.listener;


// Referenced classes of package com.github.mikephil.charting.listener:
//			PieRadarChartTouchListener

private class PieRadarChartTouchListener$AngularVelocitySample
{

	public float angle;
	final PieRadarChartTouchListener this$0;
	public long time;

	public PieRadarChartTouchListener$AngularVelocitySample(long l, float f)
	{
		this$0 = PieRadarChartTouchListener.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PieRadarChartTouchListener this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
		time = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #22  <Field long time>
		angle = f;
	//    8   14:aload_0         
	//    9   15:fload           4
	//   10   17:putfield        #24  <Field float angle>
	//   11   20:return          
	}
}
