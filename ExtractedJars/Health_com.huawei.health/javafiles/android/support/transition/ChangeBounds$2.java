// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.ViewGroup;
import o.as;

// Referenced classes of package android.support.transition:
//			ChangeBounds, Transition

class ChangeBounds$2 extends sitionListenerAdapter
{

	public void onTransitionCancel(Transition transition)
	{
		as.a(e, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroup e>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #35  <Method void as.a(ViewGroup, boolean)>
		a = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #26  <Field boolean a>
	//    7   13:return          
	}

	public void onTransitionEnd(Transition transition)
	{
		if(!a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #26  <Field boolean a>
	//*   2    4:ifne            15
			as.a(e, false);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field ViewGroup e>
	//    5   11:iconst_0        
	//    6   12:invokestatic    #35  <Method void as.a(ViewGroup, boolean)>
	//    7   15:return          
	}

	public void onTransitionPause(Transition transition)
	{
		as.a(e, false);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroup e>
	//    2    4:iconst_0        
	//    3    5:invokestatic    #35  <Method void as.a(ViewGroup, boolean)>
	//    4    8:return          
	}

	public void onTransitionResume(Transition transition)
	{
		as.a(e, true);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ViewGroup e>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #35  <Method void as.a(ViewGroup, boolean)>
	//    4    8:return          
	}

	boolean a;
	final ChangeBounds c;
	final ViewGroup e;

	ChangeBounds$2(ChangeBounds changebounds, ViewGroup viewgroup)
	{
		c = changebounds;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ChangeBounds c>
		e = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field ViewGroup e>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Transition$TransitionListenerAdapter()>
		a = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #26  <Field boolean a>
	//   11   19:return          
	}
}
