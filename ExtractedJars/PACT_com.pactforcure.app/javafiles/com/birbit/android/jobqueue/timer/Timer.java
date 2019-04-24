// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.timer;


public interface Timer
{

	public abstract long nanoTime();

	public abstract void notifyObject(Object obj);

	public abstract void waitOnObject(Object obj)
		throws InterruptedException;

	public abstract void waitOnObjectUntilNs(Object obj, long l)
		throws InterruptedException;
}
