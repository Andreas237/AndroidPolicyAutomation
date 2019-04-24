// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor.handler;

import android.os.Bundle;

public interface PrivilegeSensorProfileHandlerListener
{

	public abstract void onDataReceived(int i, Bundle bundle);

	public abstract void onDataReceived(int i, Bundle abundle[]);

	public abstract void onDataStarted(int i, int j);

	public abstract void onDataStopped(int i, int j);
}
