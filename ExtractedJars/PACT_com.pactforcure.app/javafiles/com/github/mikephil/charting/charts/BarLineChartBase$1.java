// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.charts:
//			BarLineChartBase

class BarLineChartBase$1
	implements Runnable
{

	public void run()
	{
		mViewPortHandler.restrainViewPort(val$left, val$top, val$right, val$bottom);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field BarLineChartBase this$0>
	//    2    4:getfield        #39  <Field ViewPortHandler BarLineChartBase.mViewPortHandler>
	//    3    7:aload_0         
	//    4    8:getfield        #24  <Field float val$left>
	//    5   11:aload_0         
	//    6   12:getfield        #26  <Field float val$top>
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field float val$right>
	//    9   19:aload_0         
	//   10   20:getfield        #30  <Field float val$bottom>
	//   11   23:invokevirtual   #44  <Method void ViewPortHandler.restrainViewPort(float, float, float, float)>
		prepareOffsetMatrix();
	//   12   26:aload_0         
	//   13   27:getfield        #22  <Field BarLineChartBase this$0>
	//   14   30:invokevirtual   #47  <Method void BarLineChartBase.prepareOffsetMatrix()>
		prepareValuePxMatrix();
	//   15   33:aload_0         
	//   16   34:getfield        #22  <Field BarLineChartBase this$0>
	//   17   37:invokevirtual   #50  <Method void BarLineChartBase.prepareValuePxMatrix()>
	//   18   40:return          
	}

	final BarLineChartBase this$0;
	final float val$bottom;
	final float val$left;
	final float val$right;
	final float val$top;

	BarLineChartBase$1()
	{
		this$0 = final_barlinechartbase;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field BarLineChartBase this$0>
		val$left = f;
	//    3    5:aload_0         
	//    4    6:fload_2         
	//    5    7:putfield        #24  <Field float val$left>
		val$top = f1;
	//    6   10:aload_0         
	//    7   11:fload_3         
	//    8   12:putfield        #26  <Field float val$top>
		val$right = f2;
	//    9   15:aload_0         
	//   10   16:fload           4
	//   11   18:putfield        #28  <Field float val$right>
		val$bottom = F.this;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #30  <Field float val$bottom>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #33  <Method void Object()>
	//   17   31:return          
	}
}
