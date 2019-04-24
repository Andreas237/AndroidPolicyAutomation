// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.jobs:
//			ViewPortJob

public class MoveViewJob extends ViewPortJob
{

	public MoveViewJob(ViewPortHandler viewporthandler, float f, float f1, Transformer transformer, View view)
	{
		super(viewporthandler, f, f1, transformer, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload_2         
	//    3    3:fload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #8   <Method void ViewPortJob(ViewPortHandler, float, float, Transformer, View)>
	//    7   11:return          
	}

	public void run()
	{
		pts[0] = xValue;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field float[] pts>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field float xValue>
	//    5    9:fastore         
		pts[1] = yValue;
	//    6   10:aload_0         
	//    7   11:getfield        #15  <Field float[] pts>
	//    8   14:iconst_1        
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field float yValue>
	//   11   19:fastore         
		mTrans.pointValuesToPixel(pts);
	//   12   20:aload_0         
	//   13   21:getfield        #26  <Field Transformer mTrans>
	//   14   24:aload_0         
	//   15   25:getfield        #15  <Field float[] pts>
	//   16   28:invokevirtual   #32  <Method void Transformer.pointValuesToPixel(float[])>
		mViewPortHandler.centerViewPort(pts, view);
	//   17   31:aload_0         
	//   18   32:getfield        #36  <Field ViewPortHandler mViewPortHandler>
	//   19   35:aload_0         
	//   20   36:getfield        #15  <Field float[] pts>
	//   21   39:aload_0         
	//   22   40:getfield        #40  <Field View view>
	//   23   43:invokevirtual   #46  <Method void ViewPortHandler.centerViewPort(float[], View)>
	//   24   46:return          
	}
}
