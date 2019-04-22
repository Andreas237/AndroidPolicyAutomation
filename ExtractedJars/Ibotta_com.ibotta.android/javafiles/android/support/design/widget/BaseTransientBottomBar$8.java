// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.snackbar.ContentViewCallback;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$8 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		onViewShown();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BaseTransientBottomBar this$0>
	//    2    4:invokevirtual   #23  <Method void BaseTransientBottomBar.onViewShown()>
	//    3    7:return          
	}

	public void onAnimationStart(Animator animator)
	{
		BaseTransientBottomBar.access$100(BaseTransientBottomBar.this).animateContentIn(70, 180);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BaseTransientBottomBar this$0>
	//    2    4:invokestatic    #28  <Method ContentViewCallback BaseTransientBottomBar.access$100(BaseTransientBottomBar)>
	//    3    7:bipush          70
	//    4    9:sipush          180
	//    5   12:invokeinterface #34  <Method void ContentViewCallback.animateContentIn(int, int)>
	//    6   17:return          
	}

	final BaseTransientBottomBar this$0;

	BaseTransientBottomBar$8()
	{
		this$0 = BaseTransientBottomBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BaseTransientBottomBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
