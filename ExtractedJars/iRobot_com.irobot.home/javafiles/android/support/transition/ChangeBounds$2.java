// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			ChangeBounds, au, at

class ChangeBounds$2 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		au.a(((View) (a))).b(((android.graphics.drawable.Drawable) (b)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ViewGroup a>
	//    2    4:invokestatic    #41  <Method at au.a(View)>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field BitmapDrawable b>
	//    5   11:invokeinterface #46  <Method void at.b(android.graphics.drawable.Drawable)>
		au.a(c, d);
	//    6   16:aload_0         
	//    7   17:getfield        #28  <Field View c>
	//    8   20:aload_0         
	//    9   21:getfield        #30  <Field float d>
	//   10   24:invokestatic    #49  <Method void au.a(View, float)>
	//   11   27:return          
	}

	final ViewGroup a;
	final BitmapDrawable b;
	final View c;
	final float d;
	final ChangeBounds e;

	ChangeBounds$2(ChangeBounds changebounds, ViewGroup viewgroup, BitmapDrawable bitmapdrawable, View view, float f)
	{
		e = changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ChangeBounds e>
		a = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ViewGroup a>
		b = bitmapdrawable;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field BitmapDrawable b>
		c = view;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #28  <Field View c>
		d = f;
	//   12   21:aload_0         
	//   13   22:fload           5
	//   14   24:putfield        #30  <Field float d>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #33  <Method void AnimatorListenerAdapter()>
	//   17   31:return          
	}
}
