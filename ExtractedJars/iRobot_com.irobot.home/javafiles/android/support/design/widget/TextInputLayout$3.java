// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

class TextInputLayout$3 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		b.b.setText(a);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field TextInputLayout b>
	//    2    4:getfield        #27  <Field TextView TextInputLayout.b>
	//    3    7:aload_0         
	//    4    8:getfield        #18  <Field CharSequence a>
	//    5   11:invokevirtual   #33  <Method void TextView.setText(CharSequence)>
		b.b.setVisibility(4);
	//    6   14:aload_0         
	//    7   15:getfield        #16  <Field TextInputLayout b>
	//    8   18:getfield        #27  <Field TextView TextInputLayout.b>
	//    9   21:iconst_4        
	//   10   22:invokevirtual   #37  <Method void TextView.setVisibility(int)>
	//   11   25:return          
	}

	final CharSequence a;
	final TextInputLayout b;

	TextInputLayout$3(TextInputLayout textinputlayout, CharSequence charsequence)
	{
		b = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field TextInputLayout b>
		a = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field CharSequence a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
