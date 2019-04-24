// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			ad, ChangeBounds, an, Transition

class ChangeBounds$10 extends ad
{

	public void a(Transition transition)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field boolean a>
	//*   2    4:ifne            15
			an.a(b, false);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field ViewGroup b>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #32  <Method void an.a(ViewGroup, boolean)>
		transition.b(((Transition.c) (this)));
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #37  <Method Transition Transition.b(Transition$c)>
	//   10   20:pop             
	//   11   21:return          
	}

	public void b(Transition transition)
	{
		an.a(b, false);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ViewGroup b>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #32  <Method void an.a(ViewGroup, boolean)>
	//    4    8:return          
	}

	public void c(Transition transition)
	{
		an.a(b, true);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ViewGroup b>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #32  <Method void an.a(ViewGroup, boolean)>
	//    4    8:return          
	}

	boolean a;
	final ViewGroup b;
	final ChangeBounds c;

	ChangeBounds$10(ChangeBounds changebounds, ViewGroup viewgroup)
	{
		c = changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ChangeBounds c>
		b = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ViewGroup b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void ad()>
		a = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #25  <Field boolean a>
	//   11   19:return          
	}
}
