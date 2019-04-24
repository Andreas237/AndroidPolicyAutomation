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
		int i = (int)(255F * ((Float)valueanimator.getAnimatedValue()).floatValue());
	//    0    0:ldc1            #25  <Float 255F>
	//    1    2:aload_1         
	//    2    3:invokevirtual   #31  <Method Object ValueAnimator.getAnimatedValue()>
	//    3    6:checkcast       #33  <Class Float>
	//    4    9:invokevirtual   #37  <Method float Float.floatValue()>
	//    5   12:fmul            
	//    6   13:f2i             
	//    7   14:istore_2        
		FastScroller.access$600(FastScroller.this).setAlpha(i);
	//    8   15:aload_0         
	//    9   16:getfield        #15  <Field FastScroller this$0>
	//   10   19:invokestatic    #41  <Method StateListDrawable FastScroller.access$600(FastScroller)>
	//   11   22:iload_2         
	//   12   23:invokevirtual   #47  <Method void StateListDrawable.setAlpha(int)>
		FastScroller.access$700(FastScroller.this).setAlpha(i);
	//   13   26:aload_0         
	//   14   27:getfield        #15  <Field FastScroller this$0>
	//   15   30:invokestatic    #51  <Method Drawable FastScroller.access$700(FastScroller)>
	//   16   33:iload_2         
	//   17   34:invokevirtual   #54  <Method void Drawable.setAlpha(int)>
		FastScroller.access$500(FastScroller.this);
	//   18   37:aload_0         
	//   19   38:getfield        #15  <Field FastScroller this$0>
	//   20   41:invokestatic    #57  <Method void FastScroller.access$500(FastScroller)>
	//   21   44:return          
	}

	final FastScroller this$0;

	private FastScroller$AnimatorUpdater()
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

	FastScroller$AnimatorUpdater(FastScroller._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void FastScroller$AnimatorUpdater(FastScroller)>
	//    3    5:return          
	}
}
