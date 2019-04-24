// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue.network;

import android.content.*;
import android.net.*;
import android.os.PowerManager;

// Referenced classes of package com.birbit.android.jobqueue.network:
//			NetworkUtil, NetworkEventProvider

public class NetworkUtilImpl
	implements NetworkUtil, NetworkEventProvider
{

	public NetworkUtilImpl(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		context = context.getApplicationContext();
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method Context Context.getApplicationContext()>
	//    4    8:astore_1        
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   5    9:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          21
	//*   7   14:icmplt          36
		{
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   8   17:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   20:bipush          23
	//*  10   22:icmplt          30
				listenForIdle(context);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokespecial   #36  <Method void listenForIdle(Context)>
			listenNetworkViaConnectivityManager(context);
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:invokespecial   #39  <Method void listenNetworkViaConnectivityManager(Context)>
			return;
	//   17   35:return          
		} else
		{
			context.registerReceiver(((BroadcastReceiver) (new BroadcastReceiver() {

				public void onReceive(Context context1, Intent intent)
				{
					dispatchNetworkChange(context1);
				//    0    0:aload_0         
				//    1    1:getfield        #14  <Field NetworkUtilImpl this$0>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #23  <Method void NetworkUtilImpl.dispatchNetworkChange(Context)>
				//    4    8:return          
				}

				final NetworkUtilImpl this$0;

			
			{
				this$0 = NetworkUtilImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field NetworkUtilImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
			}
)), getNetworkIntentFilter());
	//   18   36:aload_1         
	//   19   37:new             #10  <Class NetworkUtilImpl$1>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #42  <Method void NetworkUtilImpl$1(NetworkUtilImpl)>
	//   23   45:invokestatic    #46  <Method IntentFilter getNetworkIntentFilter()>
	//   24   48:invokevirtual   #50  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   25   51:pop             
			return;
	//   26   52:return          
		}
	}

	private static IntentFilter getNetworkIntentFilter()
	{
		IntentFilter intentfilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
	//    0    0:new             #56  <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #58  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//    3    6:invokespecial   #61  <Method void IntentFilter(String)>
	//    4    9:astore_0        
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   5   10:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   13:bipush          23
	//*   7   15:icmplt          24
			intentfilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
	//    8   18:aload_0         
	//    9   19:ldc1            #63  <String "android.os.action.DEVICE_IDLE_MODE_CHANGED">
	//   10   21:invokevirtual   #66  <Method void IntentFilter.addAction(String)>
		return intentfilter;
	//   11   24:aload_0         
	//   12   25:areturn         
	}

	private static boolean isDozing(Context context)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		boolean flag = flag1;
	//    2    2:iload_2         
	//    3    3:istore_1        
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   4    4:getstatic       #33  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5    7:bipush          23
	//*   6    9:icmplt          46
		{
			PowerManager powermanager = (PowerManager)context.getSystemService("power");
	//    7   12:aload_0         
	//    8   13:ldc1            #71  <String "power">
	//    9   15:invokevirtual   #75  <Method Object Context.getSystemService(String)>
	//   10   18:checkcast       #77  <Class PowerManager>
	//   11   21:astore_3        
			flag = flag1;
	//   12   22:iload_2         
	//   13   23:istore_1        
			if(powermanager.isDeviceIdleMode())
	//*  14   24:aload_3         
	//*  15   25:invokevirtual   #81  <Method boolean PowerManager.isDeviceIdleMode()>
	//*  16   28:ifeq            46
			{
				flag = flag1;
	//   17   31:iload_2         
	//   18   32:istore_1        
				if(!powermanager.isIgnoringBatteryOptimizations(context.getPackageName()))
	//*  19   33:aload_3         
	//*  20   34:aload_0         
	//*  21   35:invokevirtual   #85  <Method String Context.getPackageName()>
	//*  22   38:invokevirtual   #89  <Method boolean PowerManager.isIgnoringBatteryOptimizations(String)>
	//*  23   41:ifne            46
					flag = true;
	//   24   44:iconst_1        
	//   25   45:istore_1        
			}
		}
		return flag;
	//   26   46:iload_1         
	//   27   47:ireturn         
	}

	private void listenForIdle(Context context)
	{
		context.registerReceiver(((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context1, Intent intent)
			{
				dispatchNetworkChange(context1);
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field NetworkUtilImpl this$0>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #24  <Method void NetworkUtilImpl.dispatchNetworkChange(Context)>
			//    4    8:return          
			}

			final NetworkUtilImpl this$0;

			
			{
				this$0 = NetworkUtilImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field NetworkUtilImpl this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
)), new IntentFilter("android.os.action.DEVICE_IDLE_MODE_CHANGED"));
	//    0    0:aload_1         
	//    1    1:new             #14  <Class NetworkUtilImpl$3>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:invokespecial   #90  <Method void NetworkUtilImpl$3(NetworkUtilImpl)>
	//    5    9:new             #56  <Class IntentFilter>
	//    6   12:dup             
	//    7   13:ldc1            #63  <String "android.os.action.DEVICE_IDLE_MODE_CHANGED">
	//    8   15:invokespecial   #61  <Method void IntentFilter(String)>
	//    9   18:invokevirtual   #50  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   10   21:pop             
	//   11   22:return          
	}

	private void listenNetworkViaConnectivityManager(final Context context)
	{
		((ConnectivityManager)context.getSystemService("connectivity")).registerNetworkCallback((new android.net.NetworkRequest.Builder()).addCapability(12).addCapability(13).build(), ((android.net.ConnectivityManager.NetworkCallback) (new android.net.ConnectivityManager.NetworkCallback() {

			public void onAvailable(Network network)
			{
				dispatchNetworkChange(context);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field NetworkUtilImpl this$0>
			//    2    4:aload_0         
			//    3    5:getfield        #19  <Field Context val$context>
			//    4    8:invokevirtual   #28  <Method void NetworkUtilImpl.dispatchNetworkChange(Context)>
			//    5   11:return          
			}

			final NetworkUtilImpl this$0;
			final Context val$context;

			
			{
				this$0 = NetworkUtilImpl.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field NetworkUtilImpl this$0>
				context = context1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Context val$context>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void android.net.ConnectivityManager$NetworkCallback()>
			//    8   14:return          
			}
		}
)));
	//    0    0:aload_1         
	//    1    1:ldc1            #92  <String "connectivity">
	//    2    3:invokevirtual   #75  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #94  <Class ConnectivityManager>
	//    4    9:new             #96  <Class android.net.NetworkRequest$Builder>
	//    5   12:dup             
	//    6   13:invokespecial   #97  <Method void android.net.NetworkRequest$Builder()>
	//    7   16:bipush          12
	//    8   18:invokevirtual   #101 <Method android.net.NetworkRequest$Builder android.net.NetworkRequest$Builder.addCapability(int)>
	//    9   21:bipush          13
	//   10   23:invokevirtual   #101 <Method android.net.NetworkRequest$Builder android.net.NetworkRequest$Builder.addCapability(int)>
	//   11   26:invokevirtual   #105 <Method android.net.NetworkRequest android.net.NetworkRequest$Builder.build()>
	//   12   29:new             #12  <Class NetworkUtilImpl$2>
	//   13   32:dup             
	//   14   33:aload_0         
	//   15   34:aload_1         
	//   16   35:invokespecial   #108 <Method void NetworkUtilImpl$2(NetworkUtilImpl, Context)>
	//   17   38:invokevirtual   #112 <Method void ConnectivityManager.registerNetworkCallback(android.net.NetworkRequest, android.net.ConnectivityManager$NetworkCallback)>
	//   18   41:return          
	}

	void dispatchNetworkChange(Context context)
	{
		if(listener == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field NetworkEventProvider$Listener listener>
	//*   2    4:ifnonnull       8
		{
			return;
	//    3    7:return          
		} else
		{
			listener.onNetworkChange(getNetworkStatus(context));
	//    4    8:aload_0         
	//    5    9:getfield        #115 <Field NetworkEventProvider$Listener listener>
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #119 <Method int getNetworkStatus(Context)>
	//    9   17:invokeinterface #125 <Method void NetworkEventProvider$Listener.onNetworkChange(int)>
			return;
	//   10   22:return          
		}
	}

	public int getNetworkStatus(Context context)
	{
		if(!isDozing(context))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #127 <Method boolean isDozing(Context)>
	//*   2    4:ifeq            9
	//*   3    7:iconst_0        
	//*   4    8:ireturn         
	//*   5    9:aload_1         
	//*   6   10:ldc1            #92  <String "connectivity">
	//*   7   12:invokevirtual   #75  <Method Object Context.getSystemService(String)>
	//*   8   15:checkcast       #94  <Class ConnectivityManager>
	//*   9   18:invokevirtual   #131 <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//*  10   21:astore_1        
			if((context = ((Context) (((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()))) != null)
	//*  11   22:aload_1         
	//*  12   23:ifnull          7
				return ((NetworkInfo) (context)).getType() != 1 && ((NetworkInfo) (context)).getType() != 9 ? 1 : 2;
	//   13   26:aload_1         
	//   14   27:invokevirtual   #137 <Method int NetworkInfo.getType()>
	//   15   30:iconst_1        
	//   16   31:icmpeq          43
	//   17   34:aload_1         
	//   18   35:invokevirtual   #137 <Method int NetworkInfo.getType()>
	//   19   38:bipush          9
	//   20   40:icmpne          45
	//   21   43:iconst_2        
	//   22   44:ireturn         
	//   23   45:iconst_1        
	//   24   46:ireturn         
		return 0;
	}

	public void setListener(NetworkEventProvider.Listener listener1)
	{
		listener = listener1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field NetworkEventProvider$Listener listener>
	//    3    5:return          
	}

	private NetworkEventProvider.Listener listener;
}
