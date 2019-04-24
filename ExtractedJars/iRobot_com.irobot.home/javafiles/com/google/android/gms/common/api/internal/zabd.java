// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;

public interface zabd
{

	public abstract void begin();

	public abstract void connect();

	public abstract boolean disconnect();

	public abstract BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl);

	public abstract BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl);

	public abstract void onConnected(Bundle bundle);

	public abstract void onConnectionSuspended(int i);

	public abstract void zaa(ConnectionResult connectionresult, Api api, boolean flag);
}
