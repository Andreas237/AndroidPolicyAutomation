// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.net.ConnectivityManager;

// Referenced classes of package android.support.v4.net:
//			ConnectivityManagerCompat

static interface ConnectivityManagerCompat$ConnectivityManagerCompatImpl
{

	public abstract int getRestrictBackgroundStatus(ConnectivityManager connectivitymanager);

	public abstract boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager);
}
