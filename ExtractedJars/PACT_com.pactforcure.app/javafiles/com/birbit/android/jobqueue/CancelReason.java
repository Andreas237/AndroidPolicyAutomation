// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import java.lang.annotation.Annotation;

public interface CancelReason
	extends Annotation
{

	public static final int CANCELLED_VIA_SHOULD_RE_RUN = 5;
	public static final int CANCELLED_WHILE_RUNNING = 3;
	public static final int REACHED_DEADLINE = 7;
	public static final int REACHED_RETRY_LIMIT = 2;
	public static final int SINGLE_INSTANCE_ID_QUEUED = 1;
	public static final int SINGLE_INSTANCE_WHILE_RUNNING = 6;
}
