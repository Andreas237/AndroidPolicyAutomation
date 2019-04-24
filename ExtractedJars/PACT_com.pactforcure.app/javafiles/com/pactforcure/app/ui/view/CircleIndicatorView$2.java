// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui.view;

import android.animation.Animator;

// Referenced classes of package com.pactforcure.app.ui.view:
//			CircleIndicatorView

class CircleIndicatorView$2
	implements android.animation.ner
{

	public void onAnimationCancel(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		CircleIndicatorView.access$102(CircleIndicatorView.this, false);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CircleIndicatorView this$0>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #28  <Method boolean CircleIndicatorView.access$102(CircleIndicatorView, boolean)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void onAnimationRepeat(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animator animator)
	{
	//    0    0:return          
	}

	final CircleIndicatorView this$0;

	CircleIndicatorView$2()
	{
		this$0 = CircleIndicatorView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CircleIndicatorView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
