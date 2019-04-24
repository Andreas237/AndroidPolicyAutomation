// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.samsung.android.sdk.health.sensor;


// Referenced classes of package com.samsung.android.sdk.health.sensor:
//			ShealthPlatformDeviceFinder

public static interface ShealthPlatformDeviceFinder$ServiceConnectionListener
{

	public abstract void onServiceConnected(int i);

	public abstract void onServiceDisconnected(int i);

	public static final int ERROR_FAILURE = 1;
	public static final int ERROR_NONE = 0;
}
