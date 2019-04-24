// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.log;


public interface CustomLogger
{

	public transient abstract void d(String s, Object aobj[]);

	public transient abstract void e(String s, Object aobj[]);

	public transient abstract void e(Throwable throwable, String s, Object aobj[]);

	public abstract boolean isDebugEnabled();

	public transient abstract void v(String s, Object aobj[]);
}
