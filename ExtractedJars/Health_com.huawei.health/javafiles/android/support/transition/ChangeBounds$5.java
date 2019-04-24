// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import o.av;
import o.aw;

// Referenced classes of package android.support.transition:
//			ChangeBounds

class ChangeBounds$5 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		av.e(((View) (e))).e(((android.graphics.drawable.Drawable) (c)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ViewGroup e>
	//    2    4:invokestatic    #38  <Method aw av.e(View)>
	//    3    7:aload_0         
	//    4    8:getfield        #25  <Field BitmapDrawable c>
	//    5   11:invokeinterface #43  <Method void aw.e(android.graphics.drawable.Drawable)>
		a.setVisibility(0);
	//    6   16:aload_0         
	//    7   17:getfield        #27  <Field View a>
	//    8   20:iconst_0        
	//    9   21:invokevirtual   #49  <Method void View.setVisibility(int)>
	//   10   24:return          
	}

	final View a;
	final ChangeBounds b;
	final BitmapDrawable c;
	final ViewGroup e;

	ChangeBounds$5(ChangeBounds changebounds, ViewGroup viewgroup, BitmapDrawable bitmapdrawable, View view)
	{
		b = changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field ChangeBounds b>
		e = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field ViewGroup e>
		c = bitmapdrawable;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #25  <Field BitmapDrawable c>
		a = view;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #27  <Field View a>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #30  <Method void AnimatorListenerAdapter()>
	//   14   25:return          
	}
}
