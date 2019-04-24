// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v7.widget:
//			ActionBarOverlayLayout, ActionBarContainer

class ActionBarOverlayLayout$3
	implements Runnable
{

	public void run()
	{
		a.d();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field ActionBarOverlayLayout a>
	//    2    4:invokevirtual   #22  <Method void ActionBarOverlayLayout.d()>
		a.c = a.a.animate().translationY(-a.a.getHeight()).setListener(((android.animation.) (a.d)));
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field ActionBarOverlayLayout a>
	//    5   11:aload_0         
	//    6   12:getfield        #14  <Field ActionBarOverlayLayout a>
	//    7   15:getfield        #25  <Field ActionBarContainer ActionBarOverlayLayout.a>
	//    8   18:invokevirtual   #31  <Method ViewPropertyAnimator ActionBarContainer.animate()>
	//    9   21:aload_0         
	//   10   22:getfield        #14  <Field ActionBarOverlayLayout a>
	//   11   25:getfield        #25  <Field ActionBarContainer ActionBarOverlayLayout.a>
	//   12   28:invokevirtual   #35  <Method int ActionBarContainer.getHeight()>
	//   13   31:ineg            
	//   14   32:i2f             
	//   15   33:invokevirtual   #41  <Method ViewPropertyAnimator ViewPropertyAnimator.translationY(float)>
	//   16   36:aload_0         
	//   17   37:getfield        #14  <Field ActionBarOverlayLayout a>
	//   18   40:getfield        #44  <Field android.animation.AnimatorListenerAdapter ActionBarOverlayLayout.d>
	//   19   43:invokevirtual   #48  <Method ViewPropertyAnimator ViewPropertyAnimator.setListener(android.animation.Animator$AnimatorListener)>
	//   20   46:putfield        #52  <Field ViewPropertyAnimator ActionBarOverlayLayout.c>
	//   21   49:return          
	}

	final ActionBarOverlayLayout a;

	ActionBarOverlayLayout$3(ActionBarOverlayLayout actionbaroverlaylayout)
	{
		a = actionbaroverlaylayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field ActionBarOverlayLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
