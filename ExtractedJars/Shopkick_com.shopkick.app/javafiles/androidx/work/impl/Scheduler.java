// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl;

import androidx.work.impl.model.WorkSpec;

public interface Scheduler
{

	public abstract void cancel(String s);

	public transient abstract void schedule(WorkSpec aworkspec[]);

	public static final int MAX_SCHEDULER_LIMIT = 50;
}
