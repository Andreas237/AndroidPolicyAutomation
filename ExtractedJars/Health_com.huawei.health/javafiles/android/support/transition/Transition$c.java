// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;
import o.bb;

// Referenced classes of package android.support.transition:
//			Transition, TransitionValues

static class Transition$c
{

	View a;
	TransitionValues b;
	String c;
	Transition d;
	bb e;

	Transition$c(View view, String s, Transition transition, bb bb, TransitionValues transitionvalues)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = view;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field View a>
		c = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #25  <Field String c>
		b = transitionvalues;
	//    8   14:aload_0         
	//    9   15:aload           5
	//   10   17:putfield        #27  <Field TransitionValues b>
		e = bb;
	//   11   20:aload_0         
	//   12   21:aload           4
	//   13   23:putfield        #29  <Field bb e>
		d = transition;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #31  <Field Transition d>
	//   17   31:return          
	}
}
