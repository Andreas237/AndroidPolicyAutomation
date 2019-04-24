// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.sec.android.service.health.sensor.manager;

import android.os.Bundle;
import android.os.RemoteCallbackList;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;

public interface ISensorListener
{

	public abstract void onDataReceived(Bundle bundle, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int i);

	public abstract void onDataReceived(Bundle abundle[], RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int i);

	public abstract void onDataStarted(int i, int j, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int k, int l);

	public abstract void onDataStopped(int i, int j, RemoteCallbackList remotecallbacklist, _PrivilegeSensorDevice _pprivilegesensordevice, int k, int l);
}
