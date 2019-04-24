// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.widget:
//			BaseTransientBottomBar

class BaseTransientBottomBar$4 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		b.onViewHidden(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseTransientBottomBar b>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int a>
	//    4    8:invokevirtual   #28  <Method void BaseTransientBottomBar.onViewHidden(int)>
	//    5   11:return          
	}

	public void onAnimationStart(Animator animator)
	{
		BaseTransientBottomBar.access$000(b).animateContentOut(0, 180);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BaseTransientBottomBar b>
	//    2    4:invokestatic    #33  <Method BaseTransientBottomBar$ContentViewCallback BaseTransientBottomBar.access$000(BaseTransientBottomBar)>
	//    3    7:iconst_0        
	//    4    8:sipush          180
	//    5   11:invokeinterface #39  <Method void BaseTransientBottomBar$ContentViewCallback.animateContentOut(int, int)>
	//    6   16:return          
	}

	final int a;
	final BaseTransientBottomBar b;

	BaseTransientBottomBar$4(BaseTransientBottomBar basetransientbottombar, int i)
	{
		b = basetransientbottombar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BaseTransientBottomBar b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #19  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
