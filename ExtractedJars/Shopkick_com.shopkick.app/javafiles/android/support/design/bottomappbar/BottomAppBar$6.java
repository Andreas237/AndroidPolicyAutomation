// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.animation.ValueAnimator;
import android.support.design.shape.MaterialShapeDrawable;

// Referenced classes of package android.support.design.bottomappbar:
//			BottomAppBar

class BottomAppBar$6
	implements android.animation.nimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		BottomAppBar.access$200(BottomAppBar.this).setInterpolation(((Float)valueanimator.getAnimatedValue()).floatValue());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BottomAppBar this$0>
	//    2    4:invokestatic    #27  <Method MaterialShapeDrawable BottomAppBar.access$200(BottomAppBar)>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
	//    5   11:checkcast       #35  <Class Float>
	//    6   14:invokevirtual   #39  <Method float Float.floatValue()>
	//    7   17:invokevirtual   #45  <Method void MaterialShapeDrawable.setInterpolation(float)>
	//    8   20:return          
	}

	final BottomAppBar this$0;

	BottomAppBar$6()
	{
		this$0 = BottomAppBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BottomAppBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
