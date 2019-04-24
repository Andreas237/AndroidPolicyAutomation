// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.Context;
import android.support.v4.content.ContextCompat;

// Referenced classes of package com.bumptech.glide.manager:
//			ConnectivityMonitorFactory, DefaultConnectivityMonitor, NullConnectivityMonitor, ConnectivityMonitor

public class DefaultConnectivityMonitorFactory
	implements ConnectivityMonitorFactory
{

	public DefaultConnectivityMonitorFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ConnectivityMonitor build(Context context, ConnectivityMonitor.ConnectivityListener connectivitylistener)
	{
		boolean flag;
		if(ContextCompat.checkSelfPermission(context, "android.permission.ACCESS_NETWORK_STATE") == 0)
	//*   0    0:aload_1         
	//*   1    1:ldc1            #10  <String "android.permission.ACCESS_NETWORK_STATE">
	//*   2    3:invokestatic    #24  <Method int ContextCompat.checkSelfPermission(Context, String)>
	//*   3    6:ifne            14
			flag = true;
	//    4    9:iconst_1        
	//    5   10:istore_3        
		else
	//*   6   11:goto            16
			flag = false;
	//    7   14:iconst_0        
	//    8   15:istore_3        
		if(flag)
	//*   9   16:iload_3         
	//*  10   17:ifeq            30
			return ((ConnectivityMonitor) (new DefaultConnectivityMonitor(context, connectivitylistener)));
	//   11   20:new             #26  <Class DefaultConnectivityMonitor>
	//   12   23:dup             
	//   13   24:aload_1         
	//   14   25:aload_2         
	//   15   26:invokespecial   #29  <Method void DefaultConnectivityMonitor(Context, ConnectivityMonitor$ConnectivityListener)>
	//   16   29:areturn         
		else
			return ((ConnectivityMonitor) (new NullConnectivityMonitor()));
	//   17   30:new             #31  <Class NullConnectivityMonitor>
	//   18   33:dup             
	//   19   34:invokespecial   #32  <Method void NullConnectivityMonitor()>
	//   20   37:areturn         
	}

	private static final String NETWORK_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
}
