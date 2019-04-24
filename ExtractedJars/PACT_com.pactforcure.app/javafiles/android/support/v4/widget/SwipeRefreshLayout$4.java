// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Transformation;

// Referenced classes of package android.support.v4.widget:
//			SwipeRefreshLayout, CircularProgressDrawable

class SwipeRefreshLayout$4 extends Animation
{

	public void applyTransformation(float f, Transformation transformation)
	{
		mProgress.setAlpha((int)((float)val$startingAlpha + (float)(val$endingAlpha - val$startingAlpha) * f));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SwipeRefreshLayout this$0>
	//    2    4:getfield        #32  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field int val$startingAlpha>
	//    5   11:i2f             
	//    6   12:aload_0         
	//    7   13:getfield        #22  <Field int val$endingAlpha>
	//    8   16:aload_0         
	//    9   17:getfield        #20  <Field int val$startingAlpha>
	//   10   20:isub            
	//   11   21:i2f             
	//   12   22:fload_1         
	//   13   23:fmul            
	//   14   24:fadd            
	//   15   25:f2i             
	//   16   26:invokevirtual   #38  <Method void CircularProgressDrawable.setAlpha(int)>
	//   17   29:return          
	}

	final SwipeRefreshLayout this$0;
	final int val$endingAlpha;
	final int val$startingAlpha;

	SwipeRefreshLayout$4()
	{
		this$0 = final_swiperefreshlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field SwipeRefreshLayout this$0>
		val$startingAlpha = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field int val$startingAlpha>
		val$endingAlpha = I.this;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #22  <Field int val$endingAlpha>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #25  <Method void Animation()>
	//   11   19:return          
	}
}
