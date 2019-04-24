// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.scheduler;


// Referenced classes of package com.google.android.exoplayer2.scheduler:
//			Requirements

public interface Scheduler
{

	public abstract boolean cancel();

	public abstract boolean schedule(Requirements requirements, String s, String s1);

	public static final boolean DEBUG = false;
}
