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
		mErrorView.setText(val$error);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field TextInputLayout this$0>
	//    2    4:getfield        #29  <Field TextView TextInputLayout.mErrorView>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field CharSequence val$error>
	//    5   11:invokevirtual   #35  <Method void TextView.setText(CharSequence)>
		mErrorView.setVisibility(4);
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field TextInputLayout this$0>
	//    8   18:getfield        #29  <Field TextView TextInputLayout.mErrorView>
	//    9   21:iconst_4        
	//   10   22:invokevirtual   #39  <Method void TextView.setVisibility(int)>
	//   11   25:return          
	}

	final TextInputLayout this$0;
	final CharSequence val$error;

	TextInputLayout$3()
	{
		this$0 = final_textinputlayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field TextInputLayout this$0>
		val$error = CharSequence.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field CharSequence val$error>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
