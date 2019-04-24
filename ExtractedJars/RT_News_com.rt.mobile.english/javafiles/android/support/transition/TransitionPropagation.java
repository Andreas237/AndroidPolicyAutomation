// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			TransitionValues, Transition

public abstract class TransitionPropagation
{

	public TransitionPropagation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public abstract void captureValues(TransitionValues transitionvalues);

	public abstract String[] getPropagationProperties();

	public abstract long getStartDelay(ViewGroup viewgroup, Transition transition, TransitionValues transitionvalues, TransitionValues transitionvalues1);
}
