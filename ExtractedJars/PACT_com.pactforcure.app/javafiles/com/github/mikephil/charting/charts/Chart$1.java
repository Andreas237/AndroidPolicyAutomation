// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.animation.ValueAnimator;

// Referenced classes of package com.github.mikephil.charting.charts:
//			Chart

class Chart$1
	implements android.animation.mator.AnimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		postInvalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Chart this$0>
	//    2    4:invokevirtual   #25  <Method void Chart.postInvalidate()>
	//    3    7:return          
	}

	final Chart this$0;

	Chart$1()
	{
		this$0 = Chart.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Chart this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
