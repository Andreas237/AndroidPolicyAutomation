// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;

import android.os.Bundle;

public interface PrivilegeSensorDataListener
{

	public abstract void onReceived(int i, Bundle bundle);

	public abstract void onReceived(int i, Bundle abundle[]);

	public abstract void onStarted(int i, int j);

	public abstract void onStopped(int i, int j);

	public static final int ERROR_FAILURE = 1;
	public static final int ERROR_NONE = 0;
}
