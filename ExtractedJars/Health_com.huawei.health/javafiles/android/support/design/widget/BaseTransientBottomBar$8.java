// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$8 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		c.onViewShown();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BaseTransientBottomBar c>
	//    2    4:invokevirtual   #23  <Method void BaseTransientBottomBar.onViewShown()>
	//    3    7:return          
	}

	public void onAnimationStart(Animator animator)
	{
		BaseTransientBottomBar.access$000(c).animateContentIn(70, 180);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BaseTransientBottomBar c>
	//    2    4:invokestatic    #28  <Method BaseTransientBottomBar$ContentViewCallback BaseTransientBottomBar.access$000(BaseTransientBottomBar)>
	//    3    7:bipush          70
	//    4    9:sipush          180
	//    5   12:invokeinterface #34  <Method void BaseTransientBottomBar$ContentViewCallback.animateContentIn(int, int)>
	//    6   17:return          
	}

	final BaseTransientBottomBar c;

	BaseTransientBottomBar$8(BaseTransientBottomBar basetransientbottombar)
	{
		c = basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BaseTransientBottomBar c>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
