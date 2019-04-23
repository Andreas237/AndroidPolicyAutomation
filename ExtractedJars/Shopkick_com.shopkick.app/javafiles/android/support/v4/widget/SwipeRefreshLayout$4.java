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
		transformation = ((Transformation) (mProgress));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field SwipeRefreshLayout this$0>
	//    2    4:getfield        #32  <Field CircularProgressDrawable SwipeRefreshLayout.mProgress>
	//    3    7:astore_2        
		int i = val$startingAlpha;
	//    4    8:aload_0         
	//    5    9:getfield        #20  <Field int val$startingAlpha>
	//    6   12:istore_3        
		((CircularProgressDrawable) (transformation)).setAlpha((int)((float)i + (float)(val$endingAlpha - i) * f));
	//    7   13:aload_2         
	//    8   14:iload_3         
	//    9   15:i2f             
	//   10   16:aload_0         
	//   11   17:getfield        #22  <Field int val$endingAlpha>
	//   12   20:iload_3         
	//   13   21:isub            
	//   14   22:i2f             
	//   15   23:fload_1         
	//   16   24:fmul            
	//   17   25:fadd            
	//   18   26:f2i             
	//   19   27:invokevirtual   #38  <Method void CircularProgressDrawable.setAlpha(int)>
	//   20   30:return          
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
