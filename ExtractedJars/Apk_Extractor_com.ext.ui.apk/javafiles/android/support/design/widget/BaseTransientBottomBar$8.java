// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import android.support.v4.view.ViewCompat;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$8
	implements android.animation.ateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #35  <Method Object ValueAnimator.getAnimatedValue()>
	//    2    4:checkcast       #37  <Class Integer>
	//    3    7:invokevirtual   #41  <Method int Integer.intValue()>
	//    4   10:istore_2        
		if(BaseTransientBottomBar.access$100())
	//*   5   11:invokestatic    #45  <Method boolean BaseTransientBottomBar.access$100()>
	//*   6   14:ifeq            39
			ViewCompat.offsetTopAndBottom(((android.view.View) (mView)), i - mPreviousAnimatedIntValue);
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field BaseTransientBottomBar this$0>
	//    9   21:getfield        #49  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.mView>
	//   10   24:iload_2         
	//   11   25:aload_0         
	//   12   26:getfield        #26  <Field int mPreviousAnimatedIntValue>
	//   13   29:isub            
	//   14   30:invokestatic    #55  <Method void ViewCompat.offsetTopAndBottom(android.view.View, int)>
		else
	//*  15   33:aload_0         
	//*  16   34:iload_2         
	//*  17   35:putfield        #26  <Field int mPreviousAnimatedIntValue>
	//*  18   38:return          
			mView.setTranslationY(i);
	//   19   39:aload_0         
	//   20   40:getfield        #20  <Field BaseTransientBottomBar this$0>
	//   21   43:getfield        #49  <Field BaseTransientBottomBar$SnackbarBaseLayout BaseTransientBottomBar.mView>
	//   22   46:iload_2         
	//   23   47:i2f             
	//   24   48:invokevirtual   #61  <Method void BaseTransientBottomBar$SnackbarBaseLayout.setTranslationY(float)>
		mPreviousAnimatedIntValue = i;
	//*  25   51:goto            33
	}

	private int mPreviousAnimatedIntValue;
	final BaseTransientBottomBar this$0;
	final int val$viewHeight;

	BaseTransientBottomBar$8()
	{
		this$0 = final_basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field BaseTransientBottomBar this$0>
		val$viewHeight = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int val$viewHeight>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
		mPreviousAnimatedIntValue = val$viewHeight;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #22  <Field int val$viewHeight>
	//   11   19:putfield        #26  <Field int mPreviousAnimatedIntValue>
	//   12   22:return          
	}
}
