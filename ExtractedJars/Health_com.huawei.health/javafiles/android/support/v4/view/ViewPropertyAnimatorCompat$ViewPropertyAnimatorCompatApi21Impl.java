// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//			ViewPropertyAnimatorCompat

static class ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi21Impl extends ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi19Impl
{

	public void translationZ(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
	{
		view.animate().translationZ(f);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
	//    2    4:fload_3         
	//    3    5:invokevirtual   #28  <Method ViewPropertyAnimator ViewPropertyAnimator.translationZ(float)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void translationZBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
	{
		view.animate().translationZBy(f);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
	//    2    4:fload_3         
	//    3    5:invokevirtual   #31  <Method ViewPropertyAnimator ViewPropertyAnimator.translationZBy(float)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void z(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
	{
		view.animate().z(f);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
	//    2    4:fload_3         
	//    3    5:invokevirtual   #34  <Method ViewPropertyAnimator ViewPropertyAnimator.z(float)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void zBy(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f)
	{
		view.animate().zBy(f);
	//    0    0:aload_2         
	//    1    1:invokevirtual   #23  <Method ViewPropertyAnimator View.animate()>
	//    2    4:fload_3         
	//    3    5:invokevirtual   #37  <Method ViewPropertyAnimator ViewPropertyAnimator.zBy(float)>
	//    4    8:pop             
	//    5    9:return          
	}

	ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi21Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatApi19Impl()>
	//    2    4:return          
	}
}
