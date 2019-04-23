// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.util.Log;

// Referenced classes of package com.bumptech.glide.manager:
//			ConnectivityMonitorFactory, DefaultConnectivityMonitor, NullConnectivityMonitor, ConnectivityMonitor

public class DefaultConnectivityMonitorFactory
	implements ConnectivityMonitorFactory
{

	public DefaultConnectivityMonitorFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public ConnectivityMonitor build(Context context, ConnectivityMonitor.ConnectivityListener connectivitylistener)
	{
		boolean flag;
		if(ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #10  <String "android.permission.ACCESS_NETWORK_STATE">
	//*   2    3:invokestatic    #27  <Method int ContextCompat.checkSelfPermission(Context, String)>
	//*   3    6:ifne            14
			flag = true;
	//    4    9:iconst_1        
	//    5   10:istore_3        
		else
	//*   6   11:goto            16
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		if(Log.isLoggable("ConnectivityMonitor", 3))
	//*   9   16:ldc1            #13  <String "ConnectivityMonitor">
	//*  10   18:iconst_3        
	//*  11   19:invokestatic    #33  <Method boolean Log.isLoggable(String, int)>
	//*  12   22:ifeq            48
		{
			String s;
			if(flag)
	//*  13   25:iload_3         
	//*  14   26:ifeq            36
				s = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor";
	//   15   29:ldc1            #35  <String "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor">
	//   16   31:astore          4
			else
	//*  17   33:goto            40
				s = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor";
	//   18   36:ldc1            #37  <String "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor">
	//   19   38:astore          4
			Log.d("ConnectivityMonitor", s);
	//   20   40:ldc1            #13  <String "ConnectivityMonitor">
	//   21   42:aload           4
	//   22   44:invokestatic    #41  <Method int Log.d(String, String)>
	//   23   47:pop             
		}
		if(flag)
	//*  24   48:iload_3         
	//*  25   49:ifeq            62
			return ((ConnectivityMonitor) (new DefaultConnectivityMonitor(context, connectivitylistener)));
	//   26   52:new             #43  <Class DefaultConnectivityMonitor>
	//   27   55:dup             
	//   28   56:aload_1         
	//   29   57:aload_2         
	//   30   58:invokespecial   #46  <Method void DefaultConnectivityMonitor(Context, ConnectivityMonitor$ConnectivityListener)>
	//   31   61:areturn         
		else
			return ((ConnectivityMonitor) (new NullConnectivityMonitor()));
	//   32   62:new             #48  <Class NullConnectivityMonitor>
	//   33   65:dup             
	//   34   66:invokespecial   #49  <Method void NullConnectivityMonitor()>
	//   35   69:areturn         
	}

	private static final String NETWORK_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
	private static final String TAG = "ConnectivityMonitor";
}
