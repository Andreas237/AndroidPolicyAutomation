// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchHelper

class ItemTouchHelper$RecoverAnimation$1
	implements android.animation.r
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		setFraction(valueanimator.getAnimatedFraction());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ItemTouchHelper$RecoverAnimation this$1>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #35  <Method float ValueAnimator.getAnimatedFraction()>
	//    4    8:invokevirtual   #39  <Method void ItemTouchHelper$RecoverAnimation.setFraction(float)>
	//    5   11:return          
	}

	final ItemTouchHelper.RecoverAnimation this$1;
	final ItemTouchHelper val$this$0;

	ItemTouchHelper$RecoverAnimation$1()
	{
		this$1 = final_recoveranimation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ItemTouchHelper$RecoverAnimation this$1>
		val$this$0 = ItemTouchHelper.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ItemTouchHelper val$this$0>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
