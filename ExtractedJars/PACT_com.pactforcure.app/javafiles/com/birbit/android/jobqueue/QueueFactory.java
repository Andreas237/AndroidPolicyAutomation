// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.config.Configuration;

// Referenced classes of package com.birbit.android.jobqueue:
//			JobQueue

public interface QueueFactory
{

	public abstract JobQueue createNonPersistent(Configuration configuration, long l);

	public abstract JobQueue createPersistentQueue(Configuration configuration, long l);
}
