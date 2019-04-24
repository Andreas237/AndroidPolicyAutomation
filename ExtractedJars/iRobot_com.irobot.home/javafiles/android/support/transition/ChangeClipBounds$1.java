// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.s;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeClipBounds

class ChangeClipBounds$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		s.a(a, ((android.graphics.Rect) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field View a>
	//    2    4:aconst_null     
	//    3    5:invokestatic    #29  <Method void s.a(View, android.graphics.Rect)>
	//    4    8:return          
	}

	final View a;
	final ChangeClipBounds b;

	ChangeClipBounds$1(ChangeClipBounds changeclipbounds, View view)
	{
		b = changeclipbounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ChangeClipBounds b>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field View a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #21  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
