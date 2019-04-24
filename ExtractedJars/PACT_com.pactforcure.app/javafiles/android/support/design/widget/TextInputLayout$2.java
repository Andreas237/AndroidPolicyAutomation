// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;

// Referenced classes of package android.support.design.widget:
//			TextInputLayout

class TextInputLayout$2 extends AnimatorListenerAdapter
{

	public void onAnimationStart(Animator animator)
	{
		mErrorView.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field TextInputLayout this$0>
	//    2    4:getfield        #25  <Field TextView TextInputLayout.mErrorView>
	//    3    7:iconst_0        
	//    4    8:invokevirtual   #31  <Method void TextView.setVisibility(int)>
	//    5   11:return          
	}

	final TextInputLayout this$0;

	TextInputLayout$2()
	{
		this$0 = TextInputLayout.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field TextInputLayout this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
