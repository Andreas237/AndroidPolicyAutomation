// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.design.widget:
//			CollapsingToolbarLayout

class CollapsingToolbarLayout$4
	implements android.animation.teListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		e.setScrimAlpha(((Integer)valueanimator.getAnimatedValue()).intValue());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CollapsingToolbarLayout e>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #29  <Method Object ValueAnimator.getAnimatedValue()>
	//    4    8:checkcast       #31  <Class Integer>
	//    5   11:invokevirtual   #35  <Method int Integer.intValue()>
	//    6   14:invokevirtual   #38  <Method void CollapsingToolbarLayout.setScrimAlpha(int)>
	//    7   17:return          
	}

	final CollapsingToolbarLayout e;

	CollapsingToolbarLayout$4(CollapsingToolbarLayout collapsingtoolbarlayout)
	{
		e = collapsingtoolbarlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CollapsingToolbarLayout e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
