// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.net;

import android.net.ConnectivityManager;

// Referenced classes of package android.support.v4.net:
//			ConnectivityManagerCompat

static class ConnectivityManagerCompat$ConnectivityManagerCompatApi16Impl extends ConnectivityManagerCompat.ConnectivityManagerCompatBaseImpl
{

	public boolean isActiveNetworkMetered(ConnectivityManager connectivitymanager)
	{
		return connectivitymanager.isActiveNetworkMetered();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method boolean ConnectivityManager.isActiveNetworkMetered()>
	//    2    4:ireturn         
	}

	ConnectivityManagerCompat$ConnectivityManagerCompatApi16Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ConnectivityManagerCompat$ConnectivityManagerCompatBaseImpl()>
	//    2    4:return          
	}
}
