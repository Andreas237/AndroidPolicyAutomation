// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.common.api:
//			GoogleApiClient

public static interface GoogleApiClient$ConnectionCallbacks
{

	public abstract void onConnected(Bundle bundle);

	public abstract void onConnectionSuspended(int i);

	public static final int CAUSE_NETWORK_LOST = 2;
	public static final int CAUSE_SERVICE_DISCONNECTED = 1;
}
