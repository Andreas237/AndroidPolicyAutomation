// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.design.snackbar.ContentViewCallback;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$10 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		onViewHidden(val$event);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int val$event>
	//    4    8:invokevirtual   #28  <Method void BaseTransientBottomBar.onViewHidden(int)>
	//    5   11:return          
	}

	public void onAnimationStart(Animator animator)
	{
		BaseTransientBottomBar.access$100(BaseTransientBottomBar.this).animateContentOut(0, 180);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseTransientBottomBar this$0>
	//    2    4:invokestatic    #33  <Method ContentViewCallback BaseTransientBottomBar.access$100(BaseTransientBottomBar)>
	//    3    7:iconst_0        
	//    4    8:sipush          180
	//    5   11:invokeinterface #39  <Method void ContentViewCallback.animateContentOut(int, int)>
	//    6   16:return          
	}

	final BaseTransientBottomBar this$0;
	final int val$event;

	BaseTransientBottomBar$10()
	{
		this$0 = final_basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseTransientBottomBar this$0>
		val$event = I.this;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field int val$event>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
