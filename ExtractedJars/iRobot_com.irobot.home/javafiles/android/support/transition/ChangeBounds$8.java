// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.AnimatorListenerAdapter;

// Referenced classes of package android.support.transition:
//			ChangeBounds

class ChangeBounds$8 extends AnimatorListenerAdapter
{

	final ChangeBounds$a a;
	final ChangeBounds b;
	private ChangeBounds$a c;

	ChangeBounds$8(ChangeBounds changebounds, ChangeBounds$a changebounds$a)
	{
		b = changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ChangeBounds b>
		a = changebounds$a;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field ChangeBounds$a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
		c = a;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #19  <Field ChangeBounds$a a>
	//   11   19:putfield        #24  <Field ChangeBounds$a c>
	//   12   22:return          
	}
}
