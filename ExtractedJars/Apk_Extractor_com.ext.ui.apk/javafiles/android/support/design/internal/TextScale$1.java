// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.internal;

import android.animation.ValueAnimator;
import android.widget.TextView;

// Referenced classes of package android.support.design.internal:
//			TextScale

class TextScale$1
	implements android.animation.r.AnimatorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		float f = ((Float)valueanimator.getAnimatedValue()).floatValue();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
	//    2    4:checkcast       #35  <Class Float>
	//    3    7:invokevirtual   #39  <Method float Float.floatValue()>
	//    4   10:fstore_2        
		val$view.setScaleX(f);
	//    5   11:aload_0         
	//    6   12:getfield        #21  <Field TextView val$view>
	//    7   15:fload_2         
	//    8   16:invokevirtual   #45  <Method void TextView.setScaleX(float)>
		val$view.setScaleY(f);
	//    9   19:aload_0         
	//   10   20:getfield        #21  <Field TextView val$view>
	//   11   23:fload_2         
	//   12   24:invokevirtual   #48  <Method void TextView.setScaleY(float)>
	//   13   27:return          
	}

	final TextScale this$0;
	final TextView val$view;

	TextScale$1()
	{
		this$0 = final_textscale;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field TextScale this$0>
		val$view = TextView.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field TextView val$view>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
