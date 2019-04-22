// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionMenuView;

// Referenced classes of package android.support.design.bottomappbar:
//			BottomAppBar

class BottomAppBar$4 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		cancelled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #36  <Field boolean cancelled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(!cancelled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean cancelled>
	//*   2    4:ifne            26
			BottomAppBar.access$400(BottomAppBar.this, val$actionMenuView, val$targetMode, val$targetAttached);
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field BottomAppBar this$0>
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field ActionMenuView val$actionMenuView>
	//    7   15:aload_0         
	//    8   16:getfield        #26  <Field int val$targetMode>
	//    9   19:aload_0         
	//   10   20:getfield        #28  <Field boolean val$targetAttached>
	//   11   23:invokestatic    #40  <Method void BottomAppBar.access$400(BottomAppBar, ActionMenuView, int, boolean)>
	//   12   26:return          
	}

	public boolean cancelled;
	final BottomAppBar this$0;
	final ActionMenuView val$actionMenuView;
	final boolean val$targetAttached;
	final int val$targetMode;

	BottomAppBar$4()
	{
		this$0 = final_bottomappbar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field BottomAppBar this$0>
		val$actionMenuView = actionmenuview;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ActionMenuView val$actionMenuView>
		val$targetMode = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field int val$targetMode>
		val$targetAttached = Z.this;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #28  <Field boolean val$targetAttached>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
