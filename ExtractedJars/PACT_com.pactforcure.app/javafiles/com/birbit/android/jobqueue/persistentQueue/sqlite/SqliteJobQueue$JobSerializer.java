// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.persistentQueue.sqlite;

import com.birbit.android.jobqueue.Job;
import java.io.IOException;

// Referenced classes of package com.birbit.android.jobqueue.persistentQueue.sqlite:
//			SqliteJobQueue

public static interface SqliteJobQueue$JobSerializer
{

	public abstract Job deserialize(byte abyte0[])
		throws IOException, ClassNotFoundException;

	public abstract byte[] serialize(Object obj)
		throws IOException;
}
