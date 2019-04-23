// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.animation.ValueAnimator;

class ItemTouchHelper$RecoverAnimation$1
	implements android.animation.r
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		setFraction(valueanimator.getAnimatedFraction());
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ItemTouchHelper$RecoverAnimation this$0>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method float ValueAnimator.getAnimatedFraction()>
	//    4    8:invokevirtual   #30  <Method void ItemTouchHelper$RecoverAnimation.setFraction(float)>
	//    5   11:return          
	}

	final ItemTouchHelper.RecoverAnimation this$0;

	ItemTouchHelper$RecoverAnimation$1()
	{
		this$0 = ItemTouchHelper.RecoverAnimation.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ItemTouchHelper$RecoverAnimation this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}
}
