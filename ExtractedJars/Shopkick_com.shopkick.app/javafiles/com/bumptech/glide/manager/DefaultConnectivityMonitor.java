// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.manager;

import android.content.*;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import com.bumptech.glide.util.Preconditions;

// Referenced classes of package com.bumptech.glide.manager:
//			ConnectivityMonitor

final class DefaultConnectivityMonitor
	implements ConnectivityMonitor
{

	DefaultConnectivityMonitor(Context context1, ConnectivityMonitor.ConnectivityListener connectivitylistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #8   <Class DefaultConnectivityMonitor$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #30  <Method void DefaultConnectivityMonitor$1(DefaultConnectivityMonitor)>
	//    7   13:putfield        #32  <Field BroadcastReceiver connectivityReceiver>
		context = context1.getApplicationContext();
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #38  <Method Context Context.getApplicationContext()>
	//   11   21:putfield        #40  <Field Context context>
		listener = connectivitylistener;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #42  <Field ConnectivityMonitor$ConnectivityListener listener>
	//   15   29:return          
	}

	private void register()
	{
		if(isRegistered)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean isRegistered>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		isConnected = isConnected(context);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #40  <Field Context context>
	//    8   14:invokevirtual   #52  <Method boolean isConnected(Context)>
	//    9   17:putfield        #54  <Field boolean isConnected>
		try
		{
			context.registerReceiver(connectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field Context context>
	//   12   24:aload_0         
	//   13   25:getfield        #32  <Field BroadcastReceiver connectivityReceiver>
	//   14   28:new             #56  <Class IntentFilter>
	//   15   31:dup             
	//   16   32:ldc1            #58  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   17   34:invokespecial   #61  <Method void IntentFilter(String)>
	//   18   37:invokevirtual   #65  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   19   40:pop             
			isRegistered = true;
	//   20   41:aload_0         
	//   21   42:iconst_1        
	//   22   43:putfield        #49  <Field boolean isRegistered>
			return;
	//   23   46:return          
		}
		catch(SecurityException securityexception)
	//*  24   47:astore_1        
		{
			if(Log.isLoggable("ConnectivityMonitor", 5))
	//*  25   48:ldc1            #12  <String "ConnectivityMonitor">
	//*  26   50:iconst_5        
	//*  27   51:invokestatic    #71  <Method boolean Log.isLoggable(String, int)>
	//*  28   54:ifeq            66
				Log.w("ConnectivityMonitor", "Failed to register", ((Throwable) (securityexception)));
	//   29   57:ldc1            #12  <String "ConnectivityMonitor">
	//   30   59:ldc1            #73  <String "Failed to register">
	//   31   61:aload_1         
	//   32   62:invokestatic    #77  <Method int Log.w(String, String, Throwable)>
	//   33   65:pop             
		}
	//   34   66:return          
	}

	private void unregister()
	{
		if(!isRegistered)
	//*   0    0:aload_0         
	//*   1    1:getfield        #49  <Field boolean isRegistered>
	//*   2    4:ifne            8
		{
			return;
	//    3    7:return          
		} else
		{
			context.unregisterReceiver(connectivityReceiver);
	//    4    8:aload_0         
	//    5    9:getfield        #40  <Field Context context>
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field BroadcastReceiver connectivityReceiver>
	//    8   16:invokevirtual   #82  <Method void Context.unregisterReceiver(BroadcastReceiver)>
			isRegistered = false;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:putfield        #49  <Field boolean isRegistered>
			return;
	//   12   24:return          
		}
	}

	boolean isConnected(Context context1)
	{
		context1 = ((Context) ((ConnectivityManager)Preconditions.checkNotNull(((Object) ((ConnectivityManager)context1.getSystemService("connectivity"))))));
	//    0    0:aload_1         
	//    1    1:ldc1            #89  <String "connectivity">
	//    2    3:invokevirtual   #93  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #95  <Class ConnectivityManager>
	//    4    9:invokestatic    #101 <Method Object Preconditions.checkNotNull(Object)>
	//    5   12:checkcast       #95  <Class ConnectivityManager>
	//    6   15:astore_1        
		try
		{
			context1 = ((Context) (((ConnectivityManager) (context1)).getActiveNetworkInfo()));
	//    7   16:aload_1         
	//    8   17:invokevirtual   #105 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    9   20:astore_1        
		}
	//*  10   21:aload_1         
	//*  11   22:ifnull          34
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #110 <Method boolean NetworkInfo.isConnected()>
	//*  14   29:ifeq            34
	//*  15   32:iconst_1        
	//*  16   33:ireturn         
	//*  17   34:iconst_0        
	//*  18   35:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context1)
	//*  19   36:astore_1        
		{
			if(Log.isLoggable("ConnectivityMonitor", 5))
	//*  20   37:ldc1            #12  <String "ConnectivityMonitor">
	//*  21   39:iconst_5        
	//*  22   40:invokestatic    #71  <Method boolean Log.isLoggable(String, int)>
	//*  23   43:ifeq            55
				Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", ((Throwable) (context1)));
	//   24   46:ldc1            #12  <String "ConnectivityMonitor">
	//   25   48:ldc1            #112 <String "Failed to determine connectivity status when connectivity changed">
	//   26   50:aload_1         
	//   27   51:invokestatic    #77  <Method int Log.w(String, String, Throwable)>
	//   28   54:pop             
			return true;
	//   29   55:iconst_1        
	//   30   56:ireturn         
		}
		return context1 != null && ((NetworkInfo) (context1)).isConnected();
	}

	public void onDestroy()
	{
	//    0    0:return          
	}

	public void onStart()
	{
		register();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void register()>
	//    2    4:return          
	}

	public void onStop()
	{
		unregister();
	//    0    0:aload_0         
	//    1    1:invokespecial   #120 <Method void unregister()>
	//    2    4:return          
	}

	private static final String TAG = "ConnectivityMonitor";
	private final BroadcastReceiver connectivityReceiver = new BroadcastReceiver() {

		public void onReceive(Context context2, Intent intent)
		{
			boolean flag = isConnected;
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//    2    4:getfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
		//    3    7:istore_3        
			intent = ((Intent) (DefaultConnectivityMonitor.this));
		//    4    8:aload_0         
		//    5    9:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//    6   12:astore_2        
			intent.isConnected = ((DefaultConnectivityMonitor) (intent)).isConnected(context2);
		//    7   13:aload_2         
		//    8   14:aload_2         
		//    9   15:aload_1         
		//   10   16:invokevirtual   #26  <Method boolean DefaultConnectivityMonitor.isConnected(Context)>
		//   11   19:putfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
			if(flag != isConnected)
		//*  12   22:iload_3         
		//*  13   23:aload_0         
		//*  14   24:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//*  15   27:getfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
		//*  16   30:icmpeq          98
			{
				if(Log.isLoggable("ConnectivityMonitor", 3))
		//*  17   33:ldc1            #28  <String "ConnectivityMonitor">
		//*  18   35:iconst_3        
		//*  19   36:invokestatic    #34  <Method boolean Log.isLoggable(String, int)>
		//*  20   39:ifeq            79
				{
					context2 = ((Context) (new StringBuilder()));
		//   21   42:new             #36  <Class StringBuilder>
		//   22   45:dup             
		//   23   46:invokespecial   #37  <Method void StringBuilder()>
		//   24   49:astore_1        
					((StringBuilder) (context2)).append("connectivity changed, isConnected: ");
		//   25   50:aload_1         
		//   26   51:ldc1            #39  <String "connectivity changed, isConnected: ">
		//   27   53:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
		//   28   56:pop             
					((StringBuilder) (context2)).append(isConnected);
		//   29   57:aload_1         
		//   30   58:aload_0         
		//   31   59:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//   32   62:getfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
		//   33   65:invokevirtual   #46  <Method StringBuilder StringBuilder.append(boolean)>
		//   34   68:pop             
					Log.d("ConnectivityMonitor", ((StringBuilder) (context2)).toString());
		//   35   69:ldc1            #28  <String "ConnectivityMonitor">
		//   36   71:aload_1         
		//   37   72:invokevirtual   #50  <Method String StringBuilder.toString()>
		//   38   75:invokestatic    #54  <Method int Log.d(String, String)>
		//   39   78:pop             
				}
				listener.onConnectivityChanged(isConnected);
		//   40   79:aload_0         
		//   41   80:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//   42   83:getfield        #58  <Field ConnectivityMonitor$ConnectivityListener DefaultConnectivityMonitor.listener>
		//   43   86:aload_0         
		//   44   87:getfield        #12  <Field DefaultConnectivityMonitor this$0>
		//   45   90:getfield        #23  <Field boolean DefaultConnectivityMonitor.isConnected>
		//   46   93:invokeinterface #64  <Method void ConnectivityMonitor$ConnectivityListener.onConnectivityChanged(boolean)>
			}
		//   47   98:return          
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
