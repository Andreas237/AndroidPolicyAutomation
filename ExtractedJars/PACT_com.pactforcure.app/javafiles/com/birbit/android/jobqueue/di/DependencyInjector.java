// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.di;

import com.birbit.android.jobqueue.Job;

public interface DependencyInjector
{

	public abstract void inject(Job job);
}
