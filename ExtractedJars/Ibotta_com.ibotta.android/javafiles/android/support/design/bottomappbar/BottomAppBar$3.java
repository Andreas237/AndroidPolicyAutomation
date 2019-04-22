// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.bottomappbar:
//			BottomAppBar

class BottomAppBar$3 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		BottomAppBar.access$302(BottomAppBar.this, ((Animator) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field BottomAppBar this$0>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #25  <Method Animator BottomAppBar.access$302(BottomAppBar, Animator)>
	//    4    8:pop             
	//    5    9:return          
	}

	final BottomAppBar this$0;

	BottomAppBar$3()
	{
		this$0 = BottomAppBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field BottomAppBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
