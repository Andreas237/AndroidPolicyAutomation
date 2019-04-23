// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;

// Referenced classes of package android.support.v7.widget:
//			FastScroller

private class FastScroller$AnimatorUpdater
	implements android.animation.istener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		int i = (int)(((Float)valueanimator.getAnimatedValue()).floatValue() * 255F);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method Object ValueAnimator.getAnimatedValue()>
	//    2    4:checkcast       #29  <Class Float>
	//    3    7:invokevirtual   #33  <Method float Float.floatValue()>
	//    4   10:ldc1            #34  <Float 255F>
	//    5   12:fmul            
	//    6   13:f2i             
	//    7   14:istore_2        
		mVerticalThumbDrawable.setAlpha(i);
	//    8   15:aload_0         
	//    9   16:getfield        #15  <Field FastScroller this$0>
	//   10   19:getfield        #38  <Field StateListDrawable FastScroller.mVerticalThumbDrawable>
	//   11   22:iload_2         
	//   12   23:invokevirtual   #44  <Method void StateListDrawable.setAlpha(int)>
		mVerticalTrackDrawable.setAlpha(i);
	//   13   26:aload_0         
	//   14   27:getfield        #15  <Field FastScroller this$0>
	//   15   30:getfield        #48  <Field Drawable FastScroller.mVerticalTrackDrawable>
	//   16   33:iload_2         
	//   17   34:invokevirtual   #51  <Method void Drawable.setAlpha(int)>
		requestRedraw();
	//   18   37:aload_0         
	//   19   38:getfield        #15  <Field FastScroller this$0>
	//   20   41:invokevirtual   #54  <Method void FastScroller.requestRedraw()>
	//   21   44:return          
	}

	final FastScroller this$0;

	FastScroller$AnimatorUpdater()
	{
		this$0 = FastScroller.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field FastScroller this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
