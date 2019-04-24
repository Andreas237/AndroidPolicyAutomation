// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.autonavi.amap.mapcore.maploader;

import android.content.*;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.lang.ref.WeakReference;

public class NetworkState
{
	static class MyBroadcastReceiver extends BroadcastReceiver
	{

		public void onReceive(Context context, Intent intent)
		{
			if(reference != null && reference.get() != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field WeakReference reference>
		//*   2    4:ifnull          33
		//*   3    7:aload_0         
		//*   4    8:getfield        #17  <Field WeakReference reference>
		//*   5   11:invokevirtual   #29  <Method Object WeakReference.get()>
		//*   6   14:ifnull          33
				((NetworkChangeListener)reference.get()).networkStateChanged(context);
		//    7   17:aload_0         
		//    8   18:getfield        #17  <Field WeakReference reference>
		//    9   21:invokevirtual   #29  <Method Object WeakReference.get()>
		//   10   24:checkcast       #31  <Class NetworkState$NetworkChangeListener>
		//   11   27:aload_1         
		//   12   28:invokeinterface #35  <Method void NetworkState$NetworkChangeListener.networkStateChanged(Context)>
		//   13   33:return          
		}

		WeakReference reference;

		public MyBroadcastReceiver(NetworkChangeListener networkchangelistener)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #15  <Method void BroadcastReceiver()>
			reference = null;
		//    2    4:aload_0         
		//    3    5:aconst_null     
		//    4    6:putfield        #17  <Field WeakReference reference>
			reference = new WeakReference(((Object) (networkchangelistener)));
		//    5    9:aload_0         
		//    6   10:new             #19  <Class WeakReference>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:invokespecial   #22  <Method void WeakReference(Object)>
		//   10   18:putfield        #17  <Field WeakReference reference>
		//   11   21:return          
		}
	}

	public static interface NetworkChangeListener
	{

		public abstract void networkStateChanged(Context context);
	}


	public NetworkState()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		isNetReceiverRegistered = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field boolean isNetReceiverRegistered>
		netChangeReceiver = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #24  <Field NetworkState$MyBroadcastReceiver netChangeReceiver>
	//    8   14:return          
	}

	public static NetworkInfo getActiveNetworkInfo(Context context)
	{
		int i;
		boolean flag;
		ConnectivityManager connectivitymanager;
		NetworkInfo anetworkinfo[];
		try
		{
			connectivitymanager = (ConnectivityManager)context.getSystemService("connectivity");
	//    0    0:aload_0         
	//    1    1:ldc1            #31  <String "connectivity">
	//    2    3:invokevirtual   #37  <Method Object Context.getSystemService(String)>
	//    3    6:checkcast       #39  <Class ConnectivityManager>
	//    4    9:astore_3        
		}
	//*   5   10:aload_3         
	//*   6   11:ifnonnull       16
	//*   7   14:aconst_null     
	//*   8   15:areturn         
	//*   9   16:aload_3         
	//*  10   17:invokevirtual   #42  <Method NetworkInfo ConnectivityManager.getActiveNetworkInfo()>
	//*  11   20:astore_0        
	//*  12   21:aload_0         
	//*  13   22:ifnull          36
	//*  14   25:aload_0         
	//*  15   26:invokevirtual   #48  <Method boolean NetworkInfo.isConnected()>
	//*  16   29:istore_2        
	//*  17   30:iload_2         
	//*  18   31:ifeq            36
	//*  19   34:aload_0         
	//*  20   35:areturn         
	//*  21   36:aload_3         
	//*  22   37:invokevirtual   #52  <Method NetworkInfo[] ConnectivityManager.getAllNetworkInfo()>
	//*  23   40:astore_3        
	//*  24   41:aload_3         
	//*  25   42:ifnonnull       47
	//*  26   45:aconst_null     
	//*  27   46:areturn         
	//*  28   47:iconst_0        
	//*  29   48:istore_1        
	//*  30   49:iload_1         
	//*  31   50:aload_3         
	//*  32   51:arraylength     
	//*  33   52:icmpge          86
	//*  34   55:aload_3         
	//*  35   56:iload_1         
	//*  36   57:aaload          
	//*  37   58:ifnonnull       64
	//*  38   61:goto            79
	//*  39   64:aload_3         
	//*  40   65:iload_1         
	//*  41   66:aaload          
	//*  42   67:invokevirtual   #48  <Method boolean NetworkInfo.isConnected()>
	//*  43   70:ifeq            79
	//*  44   73:aload_3         
	//*  45   74:iload_1         
	//*  46   75:aaload          
	//*  47   76:astore_0        
	//*  48   77:aload_0         
	//*  49   78:areturn         
	//*  50   79:iload_1         
	//*  51   80:iconst_1        
	//*  52   81:iadd            
	//*  53   82:istore_1        
	//*  54   83:goto            49
	//*  55   86:aload_0         
	//*  56   87:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  57   88:astore_0        
		{
			((Exception) (context)).printStackTrace();
	//   58   89:aload_0         
	//   59   90:invokevirtual   #55  <Method void Exception.printStackTrace()>
			return null;
	//   60   93:aconst_null     
	//   61   94:areturn         
		}
		if(connectivitymanager == null)
			return null;
		context = ((Context) (connectivitymanager.getActiveNetworkInfo()));
		if(context == null)
			break MISSING_BLOCK_LABEL_36;
		flag = ((NetworkInfo) (context)).isConnected();
		if(flag)
			return ((NetworkInfo) (context));
		anetworkinfo = connectivitymanager.getAllNetworkInfo();
		if(anetworkinfo == null)
			return null;
		i = 0;
_L2:
		if(i >= anetworkinfo.length)
			break; /* Loop/switch isn't completed */
		if(anetworkinfo[i] == null)
			break MISSING_BLOCK_LABEL_79;
		if(anetworkinfo[i].isConnected())
		{
			context = ((Context) (anetworkinfo[i]));
			return ((NetworkInfo) (context));
		}
		i++;
		if(true) goto _L2; else goto _L1
_L1:
		return ((NetworkInfo) (context));
	}

	public static boolean isNetworkConnected(Context context)
	{
		context = ((Context) (getActiveNetworkInfo(context)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #59  <Method NetworkInfo getActiveNetworkInfo(Context)>
	//    2    4:astore_0        
		return context != null && ((NetworkInfo) (context)).isConnected();
	//    3    5:aload_0         
	//    4    6:ifnull          18
	//    5    9:aload_0         
	//    6   10:invokevirtual   #48  <Method boolean NetworkInfo.isConnected()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void registerNetChangeReceiver(Context context, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            60
		{
			if(!isNetReceiverRegistered)
	//*   2    4:aload_0         
	//*   3    5:getfield        #22  <Field boolean isNetReceiverRegistered>
	//*   4    8:ifne            87
			{
				IntentFilter intentfilter = new IntentFilter();
	//    5   11:new             #63  <Class IntentFilter>
	//    6   14:dup             
	//    7   15:invokespecial   #64  <Method void IntentFilter()>
	//    8   18:astore_3        
				intentfilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
	//    9   19:aload_3         
	//   10   20:ldc1            #66  <String "android.net.conn.CONNECTIVITY_CHANGE">
	//   11   22:invokevirtual   #70  <Method void IntentFilter.addAction(String)>
				if(netChangeReceiver == null)
	//*  12   25:aload_0         
	//*  13   26:getfield        #24  <Field NetworkState$MyBroadcastReceiver netChangeReceiver>
	//*  14   29:ifnonnull       47
					netChangeReceiver = new MyBroadcastReceiver(mNetworkListener);
	//   15   32:aload_0         
	//   16   33:new             #6   <Class NetworkState$MyBroadcastReceiver>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:getfield        #72  <Field NetworkState$NetworkChangeListener mNetworkListener>
	//   20   41:invokespecial   #75  <Method void NetworkState$MyBroadcastReceiver(NetworkState$NetworkChangeListener)>
	//   21   44:putfield        #24  <Field NetworkState$MyBroadcastReceiver netChangeReceiver>
				context.registerReceiver(((BroadcastReceiver) (netChangeReceiver)), intentfilter);
	//   22   47:aload_1         
	//   23   48:aload_0         
	//   24   49:getfield        #24  <Field NetworkState$MyBroadcastReceiver netChangeReceiver>
	//   25   52:aload_3         
	//   26   53:invokevirtual   #79  <Method Intent Context.registerReceiver(BroadcastReceiver, IntentFilter)>
	//   27   56:pop             
			}
		} else
	//*  28   57:goto            87
		if(isNetReceiverRegistered && netChangeReceiver != null)
	//*  29   60:aload_0         
	//*  30   61:getfield        #22  <Field boolean isNetReceiverRegistered>
	//*  31   64:ifeq            87
	//*  32   67:aload_0         
	//*  33   68:getfield        #24  <Field NetworkState$MyBroadcastReceiver netChangeReceiver>
	//*  34   71:ifnull          87
		{
			context.unregisterReceiver(((BroadcastReceiver) (netChangeReceiver)));
	//   35   74:aload_1         
	//   36   75:aload_0         
	//   37   76:getfield        #24  <Field NetworkState$MyBroadcastReceiver netChangeReceiver>
	//   38   79:invokevirtual   #83  <Method void Context.unregisterReceiver(BroadcastReceiver)>
			netChangeReceiver = null;
	//   39   82:aload_0         
	//   40   83:aconst_null     
	//   41   84:putfield        #24  <Field NetworkState$MyBroadcastReceiver netChangeReceiver>
		}
		isNetReceiverRegistered = flag;
	//   42   87:aload_0         
	//   43   88:iload_2         
	//   44   89:putfield        #22  <Field boolean isNetReceiverRegistered>
	//   45   92:return          
	}

	public void setNetworkListener(NetworkChangeListener networkchangelistener)
	{
		mNetworkListener = networkchangelistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #72  <Field NetworkState$NetworkChangeListener mNetworkListener>
	//    3    5:return          
	}

	private boolean isNetReceiverRegistered;
	private NetworkChangeListener mNetworkListener;
	private MyBroadcastReceiver netChangeReceiver;
}
