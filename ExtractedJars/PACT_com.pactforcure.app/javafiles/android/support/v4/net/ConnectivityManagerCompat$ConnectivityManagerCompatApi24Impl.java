// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.net.ConnectivityManager;

// Referenced classes of package android.support.v4.net:
//			ConnectivityManagerCompat

static class ConnectivityManagerCompat$ConnectivityManagerCompatApi24Impl extends ConnectivityManagerCompat$ConnectivityManagerCompatApi16Impl
{

	public int getRestrictBackgroundStatus(ConnectivityManager connectivitymanager)
	{
		return connectivitymanager.getRestrictBackgroundStatus();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int ConnectivityManager.getRestrictBackgroundStatus()>
	//    2    4:ireturn         
	}

	ConnectivityManagerCompat$ConnectivityManagerCompatApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ConnectivityManagerCompat$ConnectivityManagerCompatApi16Impl()>
	//    2    4:return          
	}
}
