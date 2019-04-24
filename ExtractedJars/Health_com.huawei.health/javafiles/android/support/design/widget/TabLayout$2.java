// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.design.widget:
//			TabLayout

class TabLayout$2
	implements android.animation.r.AnimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		b.scrollTo(((Integer)valueanimator.getAnimatedValue()).intValue(), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TabLayout b>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #28  <Method Object ValueAnimator.getAnimatedValue()>
	//    4    8:checkcast       #30  <Class Integer>
	//    5   11:invokevirtual   #34  <Method int Integer.intValue()>
	//    6   14:iconst_0        
	//    7   15:invokevirtual   #38  <Method void TabLayout.scrollTo(int, int)>
	//    8   18:return          
	}

	final TabLayout b;

	TabLayout$2(TabLayout tablayout)
	{
		b = tablayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TabLayout b>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
