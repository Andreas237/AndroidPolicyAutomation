// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.ValueAnimator;
import o.n;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

class TextInputLayout$3
	implements android.animation.atorUpdateListener
{

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		d.mCollapsingTextHelper.a(((Float)valueanimator.getAnimatedValue()).floatValue());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextInputLayout d>
	//    2    4:getfield        #27  <Field n TextInputLayout.mCollapsingTextHelper>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #33  <Method Object ValueAnimator.getAnimatedValue()>
	//    5   11:checkcast       #35  <Class Float>
	//    6   14:invokevirtual   #39  <Method float Float.floatValue()>
	//    7   17:invokevirtual   #44  <Method void n.a(float)>
	//    8   20:return          
	}

	final TextInputLayout d;

	TextInputLayout$3(TextInputLayout textinputlayout)
	{
		d = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextInputLayout d>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
