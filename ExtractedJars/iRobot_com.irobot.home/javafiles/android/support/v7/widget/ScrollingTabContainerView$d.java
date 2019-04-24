// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.v7.widget:
//			ScrollingTabContainerView

protected class ScrollingTabContainerView$d extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		b = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #22  <Field boolean b>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean b>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			a.e = null;
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field ScrollingTabContainerView a>
	//    6   12:aconst_null     
	//    7   13:putfield        #30  <Field android.view.ViewPropertyAnimator ScrollingTabContainerView.e>
			a.setVisibility(c);
	//    8   16:aload_0         
	//    9   17:getfield        #17  <Field ScrollingTabContainerView a>
	//   10   20:aload_0         
	//   11   21:getfield        #32  <Field int c>
	//   12   24:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
			return;
	//   13   27:return          
		}
	}

	public void onAnimationStart(Animator animator)
	{
		a.setVisibility(0);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ScrollingTabContainerView a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #36  <Method void ScrollingTabContainerView.setVisibility(int)>
		b = false;
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:putfield        #22  <Field boolean b>
	//    7   13:return          
	}

	final ScrollingTabContainerView a;
	private boolean b;
	private int c;

	protected ScrollingTabContainerView$d(ScrollingTabContainerView scrollingtabcontainerview)
	{
		a = scrollingtabcontainerview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ScrollingTabContainerView a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void AnimatorListenerAdapter()>
		b = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #22  <Field boolean b>
	//    8   14:return          
	}
}
