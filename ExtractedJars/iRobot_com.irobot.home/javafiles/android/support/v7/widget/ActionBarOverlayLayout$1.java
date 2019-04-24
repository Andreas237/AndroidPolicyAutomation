// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.v7.widget:
//			ActionBarOverlayLayout

class ActionBarOverlayLayout$1 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		a.c = null;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ActionBarOverlayLayout a>
	//    2    4:aconst_null     
	//    3    5:putfield        #22  <Field android.view.ViewPropertyAnimator ActionBarOverlayLayout.c>
		a.b = false;
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field ActionBarOverlayLayout a>
	//    6   12:iconst_0        
	//    7   13:putfield        #26  <Field boolean ActionBarOverlayLayout.b>
	//    8   16:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		a.c = null;
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field ActionBarOverlayLayout a>
	//    2    4:aconst_null     
	//    3    5:putfield        #22  <Field android.view.ViewPropertyAnimator ActionBarOverlayLayout.c>
		a.b = false;
	//    4    8:aload_0         
	//    5    9:getfield        #12  <Field ActionBarOverlayLayout a>
	//    6   12:iconst_0        
	//    7   13:putfield        #26  <Field boolean ActionBarOverlayLayout.b>
	//    8   16:return          
	}

	final ActionBarOverlayLayout a;

	ActionBarOverlayLayout$1(ActionBarOverlayLayout actionbaroverlaylayout)
	{
		a = actionbaroverlaylayout;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field ActionBarOverlayLayout a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
