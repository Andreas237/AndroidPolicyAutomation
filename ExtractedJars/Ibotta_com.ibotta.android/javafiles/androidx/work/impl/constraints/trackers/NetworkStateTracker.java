// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.work.impl.constraints.trackers;

import android.content.*;
import android.net.*;
import android.support.v4.net.ConnectivityManagerCompat;
import androidx.work.Logger;
import androidx.work.impl.constraints.NetworkState;

// Referenced classes of package androidx.work.impl.constraints.trackers:
//			ConstraintTracker

public class NetworkStateTracker extends ConstraintTracker
{
	private class NetworkStateBroadcastReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(intent != null)
		//*   0    0:aload_2         
		//*   1    1:ifnull          49
			{
				if(intent.getAction() == null)
		//*   2    4:aload_2         
		//*   3    5:invokevirtual   #25  <Method String Intent.getAction()>
		//*   4    8:ifnonnull       12
					return;
		//    5   11:return          
				if(intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE"))
		//*   6   12:aload_2         
		//*   7   13:invokevirtual   #25  <Method String Intent.getAction()>
		//*   8   16:ldc1            #27  <String "android.net.conn.CONNECTIVITY_CHANGE">
		//*   9   18:invokevirtual   #33  <Method boolean String.equals(Object)>
		//*  10   21:ifeq            48
				{
					Logger.debug("NetworkStateTracker", "Network broadcast received", new Throwable[0]);
		//   11   24:ldc1            #35  <String "NetworkStateTracker">
		//   12   26:ldc1            #37  <String "Network broadcast received">
		//   13   28:iconst_0        
		//   14   29:anewarray       Throwable[]
		//   15   32:invokestatic    #45  <Method void Logger.debug(String, String, Throwable[])>
					context = ((Context) (NetworkStateTracker.this));
		//   16   35:aload_0         
		//   17   36:getfield        #13  <Field NetworkStateTracker this$0>
		//   18   39:astore_1        
					((NetworkStateTracker) (context)).setState(((Object) (((NetworkStateTracker) (context)).getActiveNetworkState())));
		//   19   40:aload_1         
		//   20   41:aload_1         
		//   21   42:invokevirtual   #49  <Method NetworkState NetworkStateTracker.getActiveNetworkState()>
		//   22   45:invokevirtual   #53  <Method void NetworkStateTracker.setState(Object)>
				}
				return;
		//   23   48:return          
			} else
			{
				return;
		//   24   49:return          
			}
		}

		final NetworkStateTracker this$0;

		NetworkStateBroadcastReceiver()
		{
			this$0 = NetworkStateTracker.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field NetworkStateTracker this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #16  <Method void BroadcastReceiver()>
		//    5    9:return          
		}
	}

	private class NetworkStateCallback extends android.net.ConnectivityManager.NetworkCallback
	{

		public void onCapabilitiesChanged(Network network, NetworkCapabilities networkcapabilities)
		{
			Logger.debug("NetworkStateTracker", String.format("Network capabilities changed: %s", new Object[] {
				networkcapabilities
			}), new Throwable[0]);
		//    0    0:ldc1            #24  <String "NetworkStateTracker">
		//    1    2:ldc1            #26  <String "Network capabilities changed: %s">
		//    2    4:iconst_1        
		//    3    5:anewarray       Object[]
		//    4    8:dup             
		//    5    9:iconst_0        
		//    6   10:aload_2         
		//    7   11:aastore         
		//    8   12:invokestatic    #34  <Method String String.format(String, Object[])>
		//    9   15:iconst_0        
		//   10   16:anewarray       Throwable[]
		//   11   19:invokestatic    #42  <Method void Logger.debug(String, String, Throwable[])>
			network = ((Network) (NetworkStateTracker.this));
		//   12   22:aload_0         
		//   13   23:getfield        #16  <Field NetworkStateTracker this$0>
		//   14   26:astore_1        
			((NetworkStateTracker) (network)).setState(((Object) (((NetworkStateTracker) (network)).getActiveNetworkState())));
		//   15   27:aload_1         
		//   16   28:aload_1         
		//   17   29:invokevirtual   #46  <Method NetworkState NetworkStateTracker.getActiveNetworkState()>
		//   18   32:invokevirtual   #50  <Method void NetworkStateTracker.setState(Object)>
		//   19   35:return          
		}

		public void onLost(Network network)
		{
			Logger.debug("NetworkStateTracker", "Network connection lost", new Throwable[0]);
		//    0    0:ldc1            #24  <String "NetworkStateTracker">
		//    1    2:ldc1            #54  <String "Network connection lost">
		//    2    4:iconst_0        
		//    3    5:anewarray       Throwable[]
		//    4    8:invokestatic    #42  <Method void Logger.debug(String, String, Throwable[])>
			network = ((Network) (NetworkStateTracker.this));
		//    5   11:aload_0         
		//    6   12:getfield        #16  <Field NetworkStateTracker this$0>
		//    7   15:astore_1        
			((NetworkStateTracker) (network)).setState(((Object) (((NetworkStateTracker) (network)).getActiveNetworkState())));
		//    8   16:aload_1         
		//    9   17:aload_1         
		//   10   18:invokevirtual   #46  <Method NetworkState NetworkStateTracker.getActiveNetworkState()>
		//   11   21:invokevirtual   #50  <Method void NetworkStateTracker.setState(Object)>
		//   12   24:return          
		}

		final NetworkStateTracker this$0;

		NetworkStateCallback()
		{
			this$0 = NetworkStateTracker.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field NetworkStateTracker this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void android.net.ConnectivityManager$NetworkCallback()>
		//    5    9:return          
		}
	}


	public NetworkStateTracker(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void ConstraintTracker(Context)>
		mConnectivityManager = (ConnectivityManager)mAppContext.getSystemService("connectivity");
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field Context mAppContext>
	//    6   10:ldc1            #33  <String "connectivity">
	//    7   12:invokevirtual   #39  <Method Object Context.getSystemService(String)>
	//    8   15:checkcast       #41  <Class ConnectivityManager>
	//    9   18:putfield        #43  <Field ConnectivityManager mConnectivityManager>
		if(isNetworkCallbackSupported())
	//*  10   21:invokestatic    #47  <Method boolean isNetworkCallbackSupported()>
	//*  11   24:ifeq            40
		{
			mNetworkCallback = new NetworkStateCallback();
	//   12   27:aload_0         
	//   13   28:new             #10  <Class NetworkStateTracker$NetworkStateCallback>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokespecial   #50  <Method void NetworkStateTracker$NetworkStateCallback(NetworkStateTracker)>
	//   17   36:putfield        #52  <Field NetworkStateTracker$NetworkStateCallback mNetworkCallback>
			return;
	//   18   39:return          
		} else
		{
			mBroadcastReceiver = new NetworkStateBroadcastReceiver();
	//   19   40:aload_0         
	//   20   41:new             #7   <Class NetworkStateTracker$NetworkStateBroadcastReceiver>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokespecial   #53  <Method void NetworkStateTracker$NetworkStateBroadcastReceiver(NetworkStateTracker)>
	//   24   49:putfield        #55  <Field NetworkStateTracker$NetworkStateBroadcastReceiver mBroadcastReceiver>
			return;
	//   25   52:return          
		}
	}

	private boolean isActiveNetworkValidated()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_1        
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		if(i < 23)
	//*   4    6:iload_1         
	//*   5    7:bipush          23
	//*   6    9:icmpge          14
			return false;
	//    7   12:iconst_0        
	//    8   13:ireturn         
		Object obj = ((Object) (mConnectivityManager.getActiveNetwork()));
	//    9   14:aload_0         
	//   10   15:getfield        #43  <Field ConnectivityManager mConnectivityManager>
	//   11   18:invokevirtual   #67  <Method Network ConnectivityManager.getActiveNetwork()>
	//   12   21:astore          4
		obj = ((Object) (mConnectivityManager.getNetworkCapabilities(((Network) (obj)))));
	//   13   23:aload_0         
	//   14   24:getfield        #43  <Field ConnectivityManager mConnectivityManager>
	//   15   27:aload           4
	//   16   29:invokevirtual   #71  <Method NetworkCapabilities ConnectivityManager.getNetworkCapabilities(Network)>
	//   17   32:astore          4
		boolean flag = flag1;
	//   18   34:iload_3         
	//   19   35:istore_2        
		if(obj != null)
	//*  20   36:aload           4
	//*  21   38:ifnull          55
		{
			flag = flag1;
	//   22   41:iload_3         
	//   23   42:istore_2        
			if(((NetworkCapabilities) (obj)).hasCapability(16))
	//*  24   43:aload           4
	//*  25   45:bipush          16
	//*  26   47:invokevirtual   #77  <Method boolean NetworkCapabilities.hasCapability(int)>
	//*  27   50:ifeq            55
				flag = true;
	//   28   53:iconst_1        
	//   29   54:istore_2        
		}
		return flag;
	//   30   55:iload_2         
	//   31   56:ireturn         
	}

	private static boolean isNetworkCallbackSupported()
	{
		return android.os.Build.VERSION.SDK_INT >= 24;
	//    0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:bipush          24
	//    2    5:icmplt          10
	//    3    8:iconst_1        
	//    4    9:ireturn         
	//    5   10:iconst_0        
	//    6   11:ireturn         
	}

	NetworkState getActiveNetworkState()
	{
		NetworkInfo networkinfo = mConnectivityManager.getActiveNetworkInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field ConnectivityManager mConnectivityManager>
	//    2    4:invokevirtual   #83  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    3    7:astore          5
		boolean flag1 = true;
	//    4    9:iconst_1        
	//    5   10:istore_2        
		boolean flag;
		if(networkinfo != null && networkinfo.isConnected())
	//*   6   11:aload           5
	//*   7   13:ifnull          29
	//*   8   16:aload           5
	//*   9   18:invokevirtual   #88  <Method boolean NetworkInfo.isConnected()>
	//*  10   21:ifeq            29
			flag = true;
	//   11   24:iconst_1        
	//   12   25:istore_1        
		else
	//*  13   26:goto            31
			flag = false;
	//   14   29:iconst_0        
	//   15   30:istore_1        
		boolean flag2 = isActiveNetworkValidated();
	//   16   31:aload_0         
	//   17   32:invokespecial   #90  <Method boolean isActiveNetworkValidated()>
	//   18   35:istore_3        
		boolean flag3 = ConnectivityManagerCompat.isActiveNetworkMetered(mConnectivityManager);
	//   19   36:aload_0         
	//   20   37:getfield        #43  <Field ConnectivityManager mConnectivityManager>
	//   21   40:invokestatic    #96  <Method boolean ConnectivityManagerCompat.isActiveNetworkMetered(ConnectivityManager)>
	//   22   43:istore          4
		if(networkinfo == null || networkinfo.isRoaming())
	//*  23   45:aload           5
	//*  24   47:ifnull          61
	//*  25   50:aload           5
	//*  26   52:invokevirtual   #99  <Method boolean NetworkInfo.isRoaming()>
	//*  27   55:ifne            61
	//*  28   58:goto            63
			flag1 = false;
	//   29   61:iconst_0        
	//   30   62:istore_2        
		return new NetworkState(flag, flag2, flag3, flag1);
	//   31   63:new             #101 <Class NetworkState>
	//   32   66:dup             
	//   33   67:iload_1         
	//   34   68:iload_3         
	//   35   69:iload           4
	//   36   71:iload_2         
	//   37   72:invokespecial   #104 <Method void NetworkState(boolean, boolean, boolean, boolean)>
	//   38   75:areturn         
	}

	public NetworkState getInitialState()
	{
		return getActiveNetworkState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #107 <Method NetworkState getActiveNetworkState()>
	//    2    4:areturn         
	}

	public volatile Object getInitialState()
	{
		return ((Object) (getInitialState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #110 <Method NetworkState getInitialState()>
	//    2    4:areturn         
	}

	public void startTracking()
	{
		if(isNetworkCallbackSupported())
	//*   0    0:invokestatic    #47  <Method boolean isNetworkCallbackSupported()>
	//*   1    3:ifeq            29
		{
			Logger.debug("NetworkStateTracker", "Registering network callback", new Throwable[0]);
	//    2    6:ldc1            #114 <String "NetworkStateTracker">
	//    3    8:ldc1            #116 <String "Registering network callback">
	//    4   10:iconst_0        
	//    5   11:anewarray       Throwable[]
	//    6   14:invokestatic    #124 <Method void Logger.debug(String, String, Throwable[])>
			mConnectivityManager.registerDefaultNetworkCallback(((android.net.ConnectivityManager.NetworkCallback) (mNetworkCallback)));
	//    7   17:aload_0         
	//    8   18:getfield        #43  <Field ConnectivityManager mConnectivityManager>
	//    9   21:aload_0         
	//   10   22:getfield        #52  <Field NetworkStateTracker$NetworkStateCallback mNetworkCallback>
	//   11   25:invokevirtual   #128 <Method void ConnectivityManager.registerDefaultNetworkCallback(android.net.ConnectivityManager$NetworkCallback)>
			return;
	//   12   28:return          
		} else
		{
			Logger.debug("NetworkStateTracker", "Registering broadcast receiver", new Throwable[0]);
	//   13   29:ldc1            #114 <String "NetworkStateTracker">
	//   14   31:ldc1            #130 <String "Registering broadcast receiver">
	//   15   33:iconst_0        
	//   16   34:anewarray       Throwable[]
	//   17   37:invokestatic    #124 <Method void Logger.debug(String, String, Throwable[])>
			mAppContext.registerReceiver(((BroadcastReceiver) (mBroadcastReceiver)), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	//   18   40:aload_0         
	//   19   41:getfield        #31  <Field Context mAppContext>
	//   20   44:aload_0         
	//   21   45:getfield        #55  <Field NetworkStateTracker$NetworkStateBroadcastReceiver mBroadcastReceiver>
	//   22   48:new             #132 <Class IntentFilter>
	//   23   51:dup             
	//   24   52:ldc1            #134 <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   25   54:invokespecial   #137 <Method void IntentFilter(String)>
	//   26   57:invokevirtual   #141 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   27   60:pop             
			return;
	//   28   61:return          
		}
	}

	public void stopTracking()
	{
		if(isNetworkCallbackSupported())
	//*   0    0:invokestatic    #47  <Method boolean isNetworkCallbackSupported()>
	//*   1    3:ifeq            29
		{
			Logger.debug("NetworkStateTracker", "Unregistering network callback", new Throwable[0]);
	//    2    6:ldc1            #114 <String "NetworkStateTracker">
	//    3    8:ldc1            #144 <String "Unregistering network callback">
	//    4   10:iconst_0        
	//    5   11:anewarray       Throwable[]
	//    6   14:invokestatic    #124 <Method void Logger.debug(String, String, Throwable[])>
			mConnectivityManager.unregisterNetworkCallback(((android.net.ConnectivityManager.NetworkCallback) (mNetworkCallback)));
	//    7   17:aload_0         
	//    8   18:getfield        #43  <Field ConnectivityManager mConnectivityManager>
	//    9   21:aload_0         
	//   10   22:getfield        #52  <Field NetworkStateTracker$NetworkStateCallback mNetworkCallback>
	//   11   25:invokevirtual   #147 <Method void ConnectivityManager.unregisterNetworkCallback(android.net.ConnectivityManager$NetworkCallback)>
			return;
	//   12   28:return          
		} else
		{
			Logger.debug("NetworkStateTracker", "Unregistering broadcast receiver", new Throwable[0]);
	//   13   29:ldc1            #114 <String "NetworkStateTracker">
	//   14   31:ldc1            #149 <String "Unregistering broadcast receiver">
	//   15   33:iconst_0        
	//   16   34:anewarray       Throwable[]
	//   17   37:invokestatic    #124 <Method void Logger.debug(String, String, Throwable[])>
			mAppContext.unregisterReceiver(((BroadcastReceiver) (mBroadcastReceiver)));
	//   18   40:aload_0         
	//   19   41:getfield        #31  <Field Context mAppContext>
	//   20   44:aload_0         
	//   21   45:getfield        #55  <Field NetworkStateTracker$NetworkStateBroadcastReceiver mBroadcastReceiver>
	//   22   48:invokevirtual   #153 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			return;
	//   23   51:return          
		}
	}

	private NetworkStateBroadcastReceiver mBroadcastReceiver;
	private final ConnectivityManager mConnectivityManager;
	private NetworkStateCallback mNetworkCallback;
}
