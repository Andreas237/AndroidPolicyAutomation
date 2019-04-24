// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

interface AnimatorUtilsImpl
{

	public abstract void addPauseListener(Animator animator, AnimatorListenerAdapter animatorlisteneradapter);

	public abstract void pause(Animator animator);

	public abstract void resume(Animator animator);
}
