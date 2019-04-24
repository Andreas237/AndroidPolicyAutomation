// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;

public interface zzaam
{

	public abstract void begin();

	public abstract void connect();

	public abstract boolean disconnect();

	public abstract void onConnected(Bundle bundle);

	public abstract void onConnectionSuspended(int i);

	public abstract zzzv.zza zza(zzzv.zza zza1);

	public abstract void zza(ConnectionResult connectionresult, Api api, int i);

	public abstract zzzv.zza zzb(zzzv.zza zza1);
}
