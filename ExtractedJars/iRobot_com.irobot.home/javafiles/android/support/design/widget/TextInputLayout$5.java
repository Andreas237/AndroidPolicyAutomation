// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout, e

class TextInputLayout$5
	implements android.animation.atorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		a.d.b(((Float)valueanimator.getAnimatedValue()).floatValue());
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TextInputLayout a>
	//    2    4:getfield        #26  <Field e TextInputLayout.d>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #32  <Method Object ValueAnimator.getAnimatedValue()>
	//    5   11:checkcast       #34  <Class Float>
	//    6   14:invokevirtual   #38  <Method float Float.floatValue()>
	//    7   17:invokevirtual   #43  <Method void e.b(float)>
	//    8   20:return          
	}

	final TextInputLayout a;

	TextInputLayout$5(TextInputLayout textinputlayout)
	{
		a = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field TextInputLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
