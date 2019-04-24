// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;


// Referenced classes of package android.support.transition:
//			Transition

public static interface Transition$TransitionListener
{

	public abstract void onTransitionCancel(Transition transition);

	public abstract void onTransitionEnd(Transition transition);

	public abstract void onTransitionPause(Transition transition);

	public abstract void onTransitionResume(Transition transition);

	public abstract void onTransitionStart(Transition transition);
}
