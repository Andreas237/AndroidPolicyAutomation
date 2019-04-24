// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.View;

// Referenced classes of package android.support.transition:
//			Fade, Transition

class Fade$2 extends ion.TransitionListenerAdapter
{

	public void onTransitionCancel(Transition transition)
	{
		b.setAlpha(1.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View b>
	//    2    4:fconst_1        
	//    3    5:invokevirtual   #38  <Method void View.setAlpha(float)>
		e = true;
	//    4    8:aload_0         
	//    5    9:iconst_1        
	//    6   10:putfield        #28  <Field boolean e>
	//    7   13:return          
	}

	public void onTransitionEnd(Transition transition)
	{
		if(!e)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field boolean e>
	//*   2    4:ifne            15
			b.setAlpha(1.0F);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field View b>
	//    5   11:fconst_1        
	//    6   12:invokevirtual   #38  <Method void View.setAlpha(float)>
	//    7   15:return          
	}

	public void onTransitionPause(Transition transition)
	{
		d = b.getAlpha();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field View b>
	//    3    5:invokevirtual   #45  <Method float View.getAlpha()>
	//    4    8:putfield        #47  <Field float d>
		b.setAlpha(1.0F);
	//    5   11:aload_0         
	//    6   12:getfield        #23  <Field View b>
	//    7   15:fconst_1        
	//    8   16:invokevirtual   #38  <Method void View.setAlpha(float)>
	//    9   19:return          
	}

	public void onTransitionResume(Transition transition)
	{
		b.setAlpha(d);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field View b>
	//    2    4:aload_0         
	//    3    5:getfield        #47  <Field float d>
	//    4    8:invokevirtual   #38  <Method void View.setAlpha(float)>
	//    5   11:return          
	}

	final View b;
	final Fade c;
	float d;
	boolean e;

	Fade$2(Fade fade, View view)
	{
		c = fade;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field Fade c>
		b = view;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field View b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Transition$TransitionListenerAdapter()>
		e = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #28  <Field boolean e>
	//   11   19:return          
	}
}
