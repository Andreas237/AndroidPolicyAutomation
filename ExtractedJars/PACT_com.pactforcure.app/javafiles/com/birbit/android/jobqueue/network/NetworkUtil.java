// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.network;

import android.content.Context;

public interface NetworkUtil
{

	public abstract int getNetworkStatus(Context context);

	public static final int DISCONNECTED = 0;
	public static final int METERED = 1;
	public static final int UNMETERED = 2;
}
