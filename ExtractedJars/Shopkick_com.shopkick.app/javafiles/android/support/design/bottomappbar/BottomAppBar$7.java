// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.design.bottomappbar:
//			BottomAppBar

class BottomAppBar$7 extends AnimatorListenerAdapter
{

	public void onAnimationStart(Animator animator)
	{
		animator = ((Animator) (BottomAppBar.this));
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field BottomAppBar this$0>
	//    2    4:astore_1        
		BottomAppBar.access$700(((BottomAppBar) (animator)), BottomAppBar.access$600(((BottomAppBar) (animator))));
	//    3    5:aload_1         
	//    4    6:aload_1         
	//    5    7:invokestatic    #22  <Method boolean BottomAppBar.access$600(BottomAppBar)>
	//    6   10:invokestatic    #26  <Method void BottomAppBar.access$700(BottomAppBar, boolean)>
		animator = ((Animator) (BottomAppBar.this));
	//    7   13:aload_0         
	//    8   14:getfield        #12  <Field BottomAppBar this$0>
	//    9   17:astore_1        
		BottomAppBar.access$900(((BottomAppBar) (animator)), BottomAppBar.access$800(((BottomAppBar) (animator))), BottomAppBar.access$600(BottomAppBar.this));
	//   10   18:aload_1         
	//   11   19:aload_1         
	//   12   20:invokestatic    #30  <Method int BottomAppBar.access$800(BottomAppBar)>
	//   13   23:aload_0         
	//   14   24:getfield        #12  <Field BottomAppBar this$0>
	//   15   27:invokestatic    #22  <Method boolean BottomAppBar.access$600(BottomAppBar)>
	//   16   30:invokestatic    #34  <Method void BottomAppBar.access$900(BottomAppBar, int, boolean)>
	//   17   33:return          
	}

	final BottomAppBar this$0;

	BottomAppBar$7()
	{
		this$0 = BottomAppBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field BottomAppBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
