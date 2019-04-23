// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.facebook.FacebookSdk;

// Referenced classes of package com.facebook.appevents.internal:
//			InAppPurchaseActivityLifecycleTracker, InAppPurchaseEventManager

static final class InAppPurchaseActivityLifecycleTracker$1
	implements ServiceConnection
{

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		Object _tmp = InAppPurchaseActivityLifecycleTracker.access$002(InAppPurchaseEventManager.asInterface(FacebookSdk.getApplicationContext(), ibinder));
	//    0    0:invokestatic    #23  <Method android.content.Context FacebookSdk.getApplicationContext()>
	//    1    3:aload_2         
	//    2    4:invokestatic    #29  <Method Object InAppPurchaseEventManager.asInterface(android.content.Context, IBinder)>
	//    3    7:invokestatic    #33  <Method Object InAppPurchaseActivityLifecycleTracker.access$002(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
	//    0    0:return          
	}

	InAppPurchaseActivityLifecycleTracker$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
