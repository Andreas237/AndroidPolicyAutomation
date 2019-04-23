// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.model;


// Referenced classes of package androidx.work.impl.model:
//			WorkTypeConverters

public static interface WorkTypeConverters$StateIds
{

	public static final int BLOCKED = 4;
	public static final int CANCELLED = 5;
	public static final String COMPLETED_STATES = "(2, 3, 5)";
	public static final int ENQUEUED = 0;
	public static final int FAILED = 3;
	public static final int RUNNING = 1;
	public static final int SUCCEEDED = 2;
}
