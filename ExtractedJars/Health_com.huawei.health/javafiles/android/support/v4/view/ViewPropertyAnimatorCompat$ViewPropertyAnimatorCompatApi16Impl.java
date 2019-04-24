// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompat, ViewPropertyAnimatorCompatJB, ViewPropertyAnimatorListener

static class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi16Impl extends ViewPropertyAnimatorCompat.ViewPropertyAnimatorCompatBaseImpl
{

	public void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener)
	{
		ViewPropertyAnimatorCompatJB.setListener(view, viewpropertyanimatorlistener);
	//    0    0:aload_2         
	//    1    1:aload_3         
	//    2    2:invokestatic    #22  <Method void ViewPropertyAnimatorCompatJB.setListener(View, ViewPropertyAnimatorListener)>
	//    3    5:return          
	}

	public void withEndAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
	{
		view.animate().withEndAction(runnable);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #30  <Method ViewPropertyAnimator View.animate()>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #35  <Method ViewPropertyAnimator ViewPropertyAnimator.withEndAction(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void withLayer(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
	{
		view.animate().withLayer();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #30  <Method ViewPropertyAnimator View.animate()>
	//    2    4:invokevirtual   #39  <Method ViewPropertyAnimator ViewPropertyAnimator.withLayer()>
	//    3    7:pop             
	//    4    8:return          
	}

	public void withStartAction(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable)
	{
		view.animate().withStartAction(runnable);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #30  <Method ViewPropertyAnimator View.animate()>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #42  <Method ViewPropertyAnimator ViewPropertyAnimator.withStartAction(Runnable)>
	//    4    8:pop             
	//    5    9:return          
	}

	ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatBaseImpl()>
	//    2    4:return          
	}
}
