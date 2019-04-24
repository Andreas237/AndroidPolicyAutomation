// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.support.v4.view.s;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeBounds, au

class ChangeBounds$9 extends AnimatorListenerAdapter
{

	public void onAnimationCancel(Animator animator)
	{
		h = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #45  <Field boolean h>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(!h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean h>
	//*   2    4:ifne            41
		{
			s.a(a, b);
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field View a>
	//    5   11:aload_0         
	//    6   12:getfield        #29  <Field Rect b>
	//    7   15:invokestatic    #51  <Method void s.a(View, Rect)>
			au.a(a, c, d, e, f);
	//    8   18:aload_0         
	//    9   19:getfield        #27  <Field View a>
	//   10   22:aload_0         
	//   11   23:getfield        #31  <Field int c>
	//   12   26:aload_0         
	//   13   27:getfield        #33  <Field int d>
	//   14   30:aload_0         
	//   15   31:getfield        #35  <Field int e>
	//   16   34:aload_0         
	//   17   35:getfield        #37  <Field int f>
	//   18   38:invokestatic    #56  <Method void au.a(View, int, int, int, int)>
		}
	//   19   41:return          
	}

	final View a;
	final Rect b;
	final int c;
	final int d;
	final int e;
	final int f;
	final ChangeBounds g;
	private boolean h;

	ChangeBounds$9(ChangeBounds changebounds, View view, Rect rect, int i, int j, int k, int l)
	{
		g = changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field ChangeBounds g>
		a = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #27  <Field View a>
		b = rect;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #29  <Field Rect b>
		c = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #31  <Field int c>
		d = j;
	//   12   21:aload_0         
	//   13   22:iload           5
	//   14   24:putfield        #33  <Field int d>
		e = k;
	//   15   27:aload_0         
	//   16   28:iload           6
	//   17   30:putfield        #35  <Field int e>
		f = l;
	//   18   33:aload_0         
	//   19   34:iload           7
	//   20   36:putfield        #37  <Field int f>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #40  <Method void AnimatorListenerAdapter()>
	//   23   43:return          
	}
}
