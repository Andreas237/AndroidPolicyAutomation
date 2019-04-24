// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompat

static class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi18Impl extends ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi16Impl
{

	public Interpolator getInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view)
	{
		return (Interpolator)view.animate().getInterpolator();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
	//    2    4:invokevirtual   #28  <Method android.animation.TimeInterpolator ViewPropertyAnimator.getInterpolator()>
	//    3    7:checkcast       #30  <Class Interpolator>
	//    4   10:areturn         
	}

	ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi18Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi16Impl()>
	//    2    4:return          
	}
}
