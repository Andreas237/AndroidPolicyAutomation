// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

class TextInputLayout$4 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		b.mErrorView.setText(d);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextInputLayout b>
	//    2    4:getfield        #29  <Field TextView TextInputLayout.mErrorView>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field CharSequence d>
	//    5   11:invokevirtual   #35  <Method void TextView.setText(CharSequence)>
		b.mErrorView.setVisibility(4);
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field TextInputLayout b>
	//    8   18:getfield        #29  <Field TextView TextInputLayout.mErrorView>
	//    9   21:iconst_4        
	//   10   22:invokevirtual   #39  <Method void TextView.setVisibility(int)>
	//   11   25:return          
	}

	final TextInputLayout b;
	final CharSequence d;

	TextInputLayout$4(TextInputLayout textinputlayout, CharSequence charsequence)
	{
		b = textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextInputLayout b>
		d = charsequence;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field CharSequence d>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
