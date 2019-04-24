// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor.handler;

import android.content.Context;
import com.samsung.android.sdk.health.sensor._private._PrivilegeSensorDevice;

// Referenced classes of package com.samsung.android.sdk.health.sensor.handler:
//			PrivilegeSensorProfileHandlerListener

public interface PrivilegeSensorProfileHandlerInterface
{

	public abstract void deinitialize();

	public abstract _PrivilegeSensorDevice getDevice();

	public abstract int initialize(Context context, PrivilegeSensorProfileHandlerListener privilegesensorprofilehandlerlistener, _PrivilegeSensorDevice _pprivilegesensordevice, Object obj);

	public abstract int startReceivingData();

	public abstract int stopReceivingData();

	public static final int ERROR_CONNECTION_LOST = 1006;
	public static final int ERROR_DATA_NOT_FOUND = 1005;
	public static final int ERROR_DEVICE_BUSY = 1004;
	public static final int ERROR_FAILURE = 1000;
	public static final int ERROR_INVALID_RESPONSE = 1008;
	public static final int ERROR_NONE = 0;
	public static final int ERROR_NOT_READY = 1007;
	public static final int ERROR_NOT_SUPPORTED = 1002;
	public static final int ERROR_NO_RESPONSE = 1003;
	public static final int ERROR_WRONG_REQUEST = 1001;
}
