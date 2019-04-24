// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor.protocol;

import android.os.Bundle;

public interface PrivilegeSensorProtocolListener
{

	public abstract void onDataReceived(Bundle bundle, Bundle bundle1);

	public abstract void onDataReceived(Bundle abundle[], Bundle abundle1[]);

	public abstract void onDataStarted(int i);

	public abstract void onDataStopped(int i, int j);

	public abstract void onResponseReceived(com.samsung.android.sdk.health.sensor.PrivilegeSensorDevice.Response response);

	public abstract void onStateChanged(int i);

	public abstract int sendRawData(byte abyte0[]);
}
