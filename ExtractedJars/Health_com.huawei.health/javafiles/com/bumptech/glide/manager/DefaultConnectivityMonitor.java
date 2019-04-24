// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.*;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

// Referenced classes of package com.bumptech.glide.manager:
//			ConnectivityMonitor

class DefaultConnectivityMonitor
	implements ConnectivityMonitor
{

	public DefaultConnectivityMonitor(Context context1, ConnectivityMonitor.ConnectivityListener connectivitylistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class DefaultConnectivityMonitor$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #25  <Method void DefaultConnectivityMonitor$1(DefaultConnectivityMonitor)>
	//    7   13:putfield        #27  <Field BroadcastReceiver connectivityReceiver>
		context = context1.getApplicationContext();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #33  <Method Context Context.getApplicationContext()>
	//   11   21:putfield        #35  <Field Context context>
		listener = connectivitylistener;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #37  <Field ConnectivityMonitor$ConnectivityListener listener>
	//   15   29:return          
	}

	private void register()
	{
		if(isRegistered)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean isRegistered>
	//*   2    4:ifeq            8
		{
			return;
	//    3    7:return          
		} else
		{
			isConnected = isConnected(context);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field Context context>
	//    8   14:invokevirtual   #44  <Method boolean isConnected(Context)>
	//    9   17:putfield        #46  <Field boolean isConnected>
			context.registerReceiver(connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	//   10   20:aload_0         
	//   11   21:getfield        #35  <Field Context context>
	//   12   24:aload_0         
	//   13   25:getfield        #27  <Field BroadcastReceiver connectivityReceiver>
	//   14   28:new             #48  <Class IntentFilter>
	//   15   31:dup             
	//   16   32:ldc1            #50  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   17   34:invokespecial   #53  <Method void IntentFilter(String)>
	//   18   37:invokevirtual   #57  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   19   40:pop             
			isRegistered = true;
	//   20   41:aload_0         
	//   21   42:iconst_1        
	//   22   43:putfield        #41  <Field boolean isRegistered>
			return;
	//   23   46:return          
		}
	}

	private void unregister()
	{
		if(!isRegistered)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field boolean isRegistered>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			context.unregisterReceiver(connectivityReceiver);
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field Context context>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field BroadcastReceiver connectivityReceiver>
	//    8   16:invokevirtual   #62  <Method void Context.unregisterReceiver(BroadcastReceiver)>
			isRegistered = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #41  <Field boolean isRegistered>
			return;
	//   12   24:return          
		}
	}

	boolean isConnected(Context context1)
	{
		context1 = ((Context) (((ConnectivityManager)context1.getSystemService("connectivity")).getActiveNetworkInfo()));
	//    0    0:aload_1         
	//    1    1:ldc1            #64  <String "connectivity">
	//    2    3:invokevirtual   #68  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #70  <Class ConnectivityManager>
	//    4    9:invokevirtual   #74  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    5   12:astore_1        
		return context1 != null && ((NetworkInfo) (context1)).isConnected();
	//    6   13:aload_1         
	//    7   14:ifnull          26
	//    8   17:aload_1         
	//    9   18:invokevirtual   #79  <Method boolean NetworkInfo.isConnected()>
	//   10   21:ifeq            26
	//   11   24:iconst_1        
	//   12   25:ireturn         
	//   13   26:iconst_0        
	//   14   27:ireturn         
	}

	public void onDestroy()
	{
	//    0    0:return          
	}

	public void onStart()
	{
		register();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void register()>
	//    2    4:return          
	}

	public void onStop()
	{
		unregister();
	//    0    0:aload_0         
	//    1    1:invokespecial   #86  <Method void unregister()>
	//    2    4:return          
	}

	private final BroadcastReceiver connectivityReceiver = new BroadcastReceiver() {

		public void onReceive(Context context2, Intent intent)
		{
			boolean flag = isConnected;
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//    2    4:getfield        #22  <Field boolean DefaultConnectivityMonitor.isConnected>
		//    3    7:istore_3        
			isConnected = isConnected(context2);
		//    4    8:aload_0         
		//    5    9:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//    6   12:aload_0         
		//    7   13:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #25  <Method boolean DefaultConnectivityMonitor.isConnected(Context)>
		//   10   20:putfield        #22  <Field boolean DefaultConnectivityMonitor.isConnected>
			if(flag != isConnected)
		//*  11   23:iload_3         
		//*  12   24:aload_0         
		//*  13   25:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//*  14   28:getfield        #22  <Field boolean DefaultConnectivityMonitor.isConnected>
		//*  15   31:icmpeq          53
				listener.onConnectivityChanged(isConnected);
		//   16   34:aload_0         
		//   17   35:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//   18   38:getfield        #29  <Field ConnectivityMonitor$ConnectivityListener DefaultConnectivityMonitor.listener>
		//   19   41:aload_0         
		//   20   42:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//   21   45:getfield        #22  <Field boolean DefaultConnectivityMonitor.isConnected>
		//   22   48:invokeinterface #35  <Method void ConnectivityMonitor$ConnectivityListener.onConnectivityChanged(boolean)>
		//   23   53:return          
		}

		final DefaultConnectivityMonitor this$0;

			
			{
				this$0 = DefaultConnectivityMonitor.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field DefaultConnectivityMonitor this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
	}
;
	private final Context context;
	boolean isConnected;
	private boolean isRegistered;
	final ConnectivityMonitor.ConnectivityListener listener;
}
