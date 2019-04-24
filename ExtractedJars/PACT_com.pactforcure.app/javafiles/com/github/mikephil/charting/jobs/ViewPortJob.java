// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class ViewPortJob
	implements Runnable
{

	public ViewPortJob(ViewPortHandler viewporthandler, float f, float f1, Transformer transformer, View view1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		pts = new float[2];
	//    2    4:aload_0         
	//    3    5:iconst_2        
	//    4    6:newarray        float[]
	//    5    8:putfield        #24  <Field float[] pts>
		xValue = 0.0F;
	//    6   11:aload_0         
	//    7   12:fconst_0        
	//    8   13:putfield        #26  <Field float xValue>
		yValue = 0.0F;
	//    9   16:aload_0         
	//   10   17:fconst_0        
	//   11   18:putfield        #28  <Field float yValue>
		mViewPortHandler = viewporthandler;
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:putfield        #30  <Field ViewPortHandler mViewPortHandler>
		xValue = f;
	//   15   26:aload_0         
	//   16   27:fload_2         
	//   17   28:putfield        #26  <Field float xValue>
		yValue = f1;
	//   18   31:aload_0         
	//   19   32:fload_3         
	//   20   33:putfield        #28  <Field float yValue>
		mTrans = transformer;
	//   21   36:aload_0         
	//   22   37:aload           4
	//   23   39:putfield        #32  <Field Transformer mTrans>
		view = view1;
	//   24   42:aload_0         
	//   25   43:aload           5
	//   26   45:putfield        #34  <Field View view>
	//   27   48:return          
	}

	public float getXValue()
	{
		return xValue;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float xValue>
	//    2    4:freturn         
	}

	public float getYValue()
	{
		return yValue;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field float yValue>
	//    2    4:freturn         
	}

	protected Transformer mTrans;
	protected ViewPortHandler mViewPortHandler;
	protected float pts[];
	protected View view;
	protected float xValue;
	protected float yValue;
}
