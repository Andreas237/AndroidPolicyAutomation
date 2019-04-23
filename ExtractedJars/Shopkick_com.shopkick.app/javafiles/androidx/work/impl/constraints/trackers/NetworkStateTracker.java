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
		//*   1    1:ifnull          53
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
		//*  10   21:ifeq            52
				{
					Logger.get().debug(NetworkStateTracker.TAG, "Network broadcast received", new Throwable[0]);
		//   11   24:invokestatic    #39  <Method Logger Logger.get()>
		//   12   27:getstatic       #43  <Field String NetworkStateTracker.TAG>
		//   13   30:ldc1            #45  <String "Network broadcast received">
		//   14   32:iconst_0        
		//   15   33:anewarray       Throwable[]
		//   16   36:invokevirtual   #51  <Method void Logger.debug(String, String, Throwable[])>
					context = ((Context) (NetworkStateTracker.this));
		//   17   39:aload_0         
		//   18   40:getfield        #13  <Field NetworkStateTracker this$0>
		//   19   43:astore_1        
					((NetworkStateTracker) (context)).setState(((Object) (((NetworkStateTracker) (context)).getActiveNetworkState())));
		//   20   44:aload_1         
		//   21   45:aload_1         
		//   22   46:invokevirtual   #55  <Method NetworkState NetworkStateTracker.getActiveNetworkState()>
		//   23   49:invokevirtual   #59  <Method void NetworkStateTracker.setState(Object)>
				}
				return;
		//   24   52:return          
			} else
			{
				return;
		//   25   53:return          
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
			Logger.get().debug(NetworkStateTracker.TAG, String.format("Network capabilities changed: %s", new Object[] {
				networkcapabilities
			}), new Throwable[0]);
		//    0    0:invokestatic    #28  <Method Logger Logger.get()>
		//    1    3:getstatic       #32  <Field String NetworkStateTracker.TAG>
		//    2    6:ldc1            #34  <String "Network capabilities changed: %s">
		//    3    8:iconst_1        
		//    4    9:anewarray       Object[]
		//    5   12:dup             
		//    6   13:iconst_0        
		//    7   14:aload_2         
		//    8   15:aastore         
		//    9   16:invokestatic    #42  <Method String String.format(String, Object[])>
		//   10   19:iconst_0        
		//   11   20:anewarray       Throwable[]
		//   12   23:invokevirtual   #48  <Method void Logger.debug(String, String, Throwable[])>
			network = ((Network) (NetworkStateTracker.this));
		//   13   26:aload_0         
		//   14   27:getfield        #16  <Field NetworkStateTracker this$0>
		//   15   30:astore_1        
			((NetworkStateTracker) (network)).setState(((Object) (((NetworkStateTracker) (network)).getActiveNetworkState())));
		//   16   31:aload_1         
		//   17   32:aload_1         
		//   18   33:invokevirtual   #52  <Method NetworkState NetworkStateTracker.getActiveNetworkState()>
		//   19   36:invokevirtual   #56  <Method void NetworkStateTracker.setState(Object)>
		//   20   39:return          
		}

		public void onLost(Network network)
		{
			Logger.get().debug(NetworkStateTracker.TAG, "Network connection lost", new Throwable[0]);
		//    0    0:invokestatic    #28  <Method Logger Logger.get()>
		//    1    3:getstatic       #32  <Field String NetworkStateTracker.TAG>
		//    2    6:ldc1            #60  <String "Network connection lost">
		//    3    8:iconst_0        
		//    4    9:anewarray       Throwable[]
		//    5   12:invokevirtual   #48  <Method void Logger.debug(String, String, Throwable[])>
			network = ((Network) (NetworkStateTracker.this));
		//    6   15:aload_0         
		//    7   16:getfield        #16  <Field NetworkStateTracker this$0>
		//    8   19:astore_1        
			((NetworkStateTracker) (network)).setState(((Object) (((NetworkStateTracker) (network)).getActiveNetworkState())));
		//    9   20:aload_1         
		//   10   21:aload_1         
		//   11   22:invokevirtual   #52  <Method NetworkState NetworkStateTracker.getActiveNetworkState()>
		//   12   25:invokevirtual   #56  <Method void NetworkStateTracker.setState(Object)>
		//   13   28:return          
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
	//    2    2:invokespecial   #42  <Method void ConstraintTracker(Context)>
		mConnectivityManager = (ConnectivityManager)mAppContext.getSystemService("connectivity");
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #46  <Field Context mAppContext>
	//    6   10:ldc1            #48  <String "connectivity">
	//    7   12:invokevirtual   #54  <Method Object Context.getSystemService(String)>
	//    8   15:checkcast       #56  <Class ConnectivityManager>
	//    9   18:putfield        #58  <Field ConnectivityManager mConnectivityManager>
		if(isNetworkCallbackSupported())
	//*  10   21:invokestatic    #62  <Method boolean isNetworkCallbackSupported()>
	//*  11   24:ifeq            40
		{
			mNetworkCallback = new NetworkStateCallback();
	//   12   27:aload_0         
	//   13   28:new             #10  <Class NetworkStateTracker$NetworkStateCallback>
	//   14   31:dup             
	//   15   32:aload_0         
	//   16   33:invokespecial   #65  <Method void NetworkStateTracker$NetworkStateCallback(NetworkStateTracker)>
	//   17   36:putfield        #67  <Field NetworkStateTracker$NetworkStateCallback mNetworkCallback>
			return;
	//   18   39:return          
		} else
		{
			mBroadcastReceiver = new NetworkStateBroadcastReceiver();
	//   19   40:aload_0         
	//   20   41:new             #7   <Class NetworkStateTracker$NetworkStateBroadcastReceiver>
	//   21   44:dup             
	//   22   45:aload_0         
	//   23   46:invokespecial   #68  <Method void NetworkStateTracker$NetworkStateBroadcastReceiver(NetworkStateTracker)>
	//   24   49:putfield        #70  <Field NetworkStateTracker$NetworkStateBroadcastReceiver mBroadcastReceiver>
			return;
	//   25   52:return          
		}
	}

	private boolean isActiveNetworkValidated()
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
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
	//   10   15:getfield        #58  <Field ConnectivityManager mConnectivityManager>
	//   11   18:invokevirtual   #81  <Method Network ConnectivityManager.getActiveNetwork()>
	//   12   21:astore          4
		obj = ((Object) (mConnectivityManager.getNetworkCapabilities(((Network) (obj)))));
	//   13   23:aload_0         
	//   14   24:getfield        #58  <Field ConnectivityManager mConnectivityManager>
	//   15   27:aload           4
	//   16   29:invokevirtual   #85  <Method NetworkCapabilities ConnectivityManager.getNetworkCapabilities(Network)>
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
	//*  26   47:invokevirtual   #91  <Method boolean NetworkCapabilities.hasCapability(int)>
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
	//    0    0:getstatic       #77  <Field int android.os.Build$VERSION.SDK_INT>
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
	//    1    1:getfield        #58  <Field ConnectivityManager mConnectivityManager>
	//    2    4:invokevirtual   #97  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//    3    7:astore          5
		boolean flag1 = true;
	//    4    9:iconst_1        
	//    5   10:istore_2        
		boolean flag;
		if(networkinfo != null && networkinfo.isConnected())
	//*   6   11:aload           5
	//*   7   13:ifnull          29
	//*   8   16:aload           5
	//*   9   18:invokevirtual   #102 <Method boolean NetworkInfo.isConnected()>
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
	//   17   32:invokespecial   #104 <Method boolean isActiveNetworkValidated()>
	//   18   35:istore_3        
		boolean flag3 = ConnectivityManagerCompat.isActiveNetworkMetered(mConnectivityManager);
	//   19   36:aload_0         
	//   20   37:getfield        #58  <Field ConnectivityManager mConnectivityManager>
	//   21   40:invokestatic    #110 <Method boolean ConnectivityManagerCompat.isActiveNetworkMetered(ConnectivityManager)>
	//   22   43:istore          4
		if(networkinfo == null || networkinfo.isRoaming())
	//*  23   45:aload           5
	//*  24   47:ifnull          61
	//*  25   50:aload           5
	//*  26   52:invokevirtual   #113 <Method boolean NetworkInfo.isRoaming()>
	//*  27   55:ifne            61
	//*  28   58:goto            63
			flag1 = false;
	//   29   61:iconst_0        
	//   30   62:istore_2        
		return new NetworkState(flag, flag2, flag3, flag1);
	//   31   63:new             #115 <Class NetworkState>
	//   32   66:dup             
	//   33   67:iload_1         
	//   34   68:iload_3         
	//   35   69:iload           4
	//   36   71:iload_2         
	//   37   72:invokespecial   #118 <Method void NetworkState(boolean, boolean, boolean, boolean)>
	//   38   75:areturn         
	}

	public NetworkState getInitialState()
	{
		return getActiveNetworkState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method NetworkState getActiveNetworkState()>
	//    2    4:areturn         
	}

	public volatile Object getInitialState()
	{
		return ((Object) (getInitialState()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method NetworkState getInitialState()>
	//    2    4:areturn         
	}

	public void startTracking()
	{
		if(isNetworkCallbackSupported())
	//*   0    0:invokestatic    #62  <Method boolean isNetworkCallbackSupported()>
	//*   1    3:ifeq            33
		{
			Logger.get().debug(TAG, "Registering network callback", new Throwable[0]);
	//    2    6:invokestatic    #129 <Method Logger Logger.get()>
	//    3    9:getstatic       #37  <Field String TAG>
	//    4   12:ldc1            #131 <String "Registering network callback">
	//    5   14:iconst_0        
	//    6   15:anewarray       Throwable[]
	//    7   18:invokevirtual   #137 <Method void Logger.debug(String, String, Throwable[])>
			mConnectivityManager.registerDefaultNetworkCallback(((android.net.ConnectivityManager.NetworkCallback) (mNetworkCallback)));
	//    8   21:aload_0         
	//    9   22:getfield        #58  <Field ConnectivityManager mConnectivityManager>
	//   10   25:aload_0         
	//   11   26:getfield        #67  <Field NetworkStateTracker$NetworkStateCallback mNetworkCallback>
	//   12   29:invokevirtual   #141 <Method void ConnectivityManager.registerDefaultNetworkCallback(android.net.ConnectivityManager$NetworkCallback)>
			return;
	//   13   32:return          
		} else
		{
			Logger.get().debug(TAG, "Registering broadcast receiver", new Throwable[0]);
	//   14   33:invokestatic    #129 <Method Logger Logger.get()>
	//   15   36:getstatic       #37  <Field String TAG>
	//   16   39:ldc1            #143 <String "Registering broadcast receiver">
	//   17   41:iconst_0        
	//   18   42:anewarray       Throwable[]
	//   19   45:invokevirtual   #137 <Method void Logger.debug(String, String, Throwable[])>
			mAppContext.registerReceiver(((BroadcastReceiver) (mBroadcastReceiver)), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
	//   20   48:aload_0         
	//   21   49:getfield        #46  <Field Context mAppContext>
	//   22   52:aload_0         
	//   23   53:getfield        #70  <Field NetworkStateTracker$NetworkStateBroadcastReceiver mBroadcastReceiver>
	//   24   56:new             #145 <Class IntentFilter>
	//   25   59:dup             
	//   26   60:ldc1            #147 <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   27   62:invokespecial   #150 <Method void IntentFilter(String)>
	//   28   65:invokevirtual   #154 <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   29   68:pop             
			return;
	//   30   69:return          
		}
	}

	public void stopTracking()
	{
		if(isNetworkCallbackSupported())
	//*   0    0:invokestatic    #62  <Method boolean isNetworkCallbackSupported()>
	//*   1    3:ifeq            54
		{
			try
			{
				Logger.get().debug(TAG, "Unregistering network callback", new Throwable[0]);
	//    2    6:invokestatic    #129 <Method Logger Logger.get()>
	//    3    9:getstatic       #37  <Field String TAG>
	//    4   12:ldc1            #159 <String "Unregistering network callback">
	//    5   14:iconst_0        
	//    6   15:anewarray       Throwable[]
	//    7   18:invokevirtual   #137 <Method void Logger.debug(String, String, Throwable[])>
				mConnectivityManager.unregisterNetworkCallback(((android.net.ConnectivityManager.NetworkCallback) (mNetworkCallback)));
	//    8   21:aload_0         
	//    9   22:getfield        #58  <Field ConnectivityManager mConnectivityManager>
	//   10   25:aload_0         
	//   11   26:getfield        #67  <Field NetworkStateTracker$NetworkStateCallback mNetworkCallback>
	//   12   29:invokevirtual   #162 <Method void ConnectivityManager.unregisterNetworkCallback(android.net.ConnectivityManager$NetworkCallback)>
				return;
	//   13   32:return          
			}
			catch(IllegalArgumentException illegalargumentexception)
	//*  14   33:astore_1        
			{
				Logger.get().error(TAG, "Received exception while unregistering network callback", new Throwable[] {
					illegalargumentexception
				});
	//   15   34:invokestatic    #129 <Method Logger Logger.get()>
	//   16   37:getstatic       #37  <Field String TAG>
	//   17   40:ldc1            #164 <String "Received exception while unregistering network callback">
	//   18   42:iconst_1        
	//   19   43:anewarray       Throwable[]
	//   20   46:dup             
	//   21   47:iconst_0        
	//   22   48:aload_1         
	//   23   49:aastore         
	//   24   50:invokevirtual   #167 <Method void Logger.error(String, String, Throwable[])>
			}
			return;
	//   25   53:return          
		} else
		{
			Logger.get().debug(TAG, "Unregistering broadcast receiver", new Throwable[0]);
	//   26   54:invokestatic    #129 <Method Logger Logger.get()>
	//   27   57:getstatic       #37  <Field String TAG>
	//   28   60:ldc1            #169 <String "Unregistering broadcast receiver">
	//   29   62:iconst_0        
	//   30   63:anewarray       Throwable[]
	//   31   66:invokevirtual   #137 <Method void Logger.debug(String, String, Throwable[])>
			mAppContext.unregisterReceiver(((BroadcastReceiver) (mBroadcastReceiver)));
	//   32   69:aload_0         
	//   33   70:getfield        #46  <Field Context mAppContext>
	//   34   73:aload_0         
	//   35   74:getfield        #70  <Field NetworkStateTracker$NetworkStateBroadcastReceiver mBroadcastReceiver>
	//   36   77:invokevirtual   #173 <Method void Context.unregisterReceiver(BroadcastReceiver)>
			return;
	//   37   80:return          
		}
	}

	static final String TAG = Logger.tagWithPrefix("NetworkStateTracker");
	private NetworkStateBroadcastReceiver mBroadcastReceiver;
	private final ConnectivityManager mConnectivityManager;
	private NetworkStateCallback mNetworkCallback;

	static 
	{
	//    0    0:ldc1            #29  <String "NetworkStateTracker">
	//    1    2:invokestatic    #35  <Method String Logger.tagWithPrefix(String)>
	//    2    5:putstatic       #37  <Field String TAG>
	//*   3    8:return          
	}
}
