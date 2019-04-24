// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

// Referenced classes of package io.fabric.sdk.android.services.common:
//			AdvertisingInfoServiceStrategy

private static final class AdvertisingInfoServiceStrategy$AdvertisingConnection
	implements ServiceConnection
{

	public IBinder getBinder()
	{
		if(retrieved)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field boolean retrieved>
	//*   2    4:ifeq            19
			Fabric.getLogger().e("Fabric", "getBinder already called");
	//    3    7:invokestatic    #43  <Method Logger Fabric.getLogger()>
	//    4   10:ldc1            #45  <String "Fabric">
	//    5   12:ldc1            #47  <String "getBinder already called">
	//    6   14:invokeinterface #53  <Method void Logger.e(String, String)>
		retrieved = true;
	//    7   19:aload_0         
	//    8   20:iconst_1        
	//    9   21:putfield        #23  <Field boolean retrieved>
		IBinder ibinder;
		try
		{
			ibinder = (IBinder)queue.poll(200L, TimeUnit.MILLISECONDS);
	//   10   24:aload_0         
	//   11   25:getfield        #30  <Field LinkedBlockingQueue queue>
	//   12   28:ldc2w           #54  <Long 200L>
	//   13   31:getstatic       #61  <Field TimeUnit TimeUnit.MILLISECONDS>
	//   14   34:invokevirtual   #65  <Method Object LinkedBlockingQueue.poll(long, TimeUnit)>
	//   15   37:checkcast       #67  <Class IBinder>
	//   16   40:astore_1        
		}
	//*  17   41:aload_1         
	//*  18   42:areturn         
		catch(InterruptedException interruptedexception)
	//*  19   43:astore_1        
		{
			return null;
	//   20   44:aconst_null     
	//   21   45:areturn         
		}
		return ibinder;
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		try
		{
			queue.put(((Object) (ibinder)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field LinkedBlockingQueue queue>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #73  <Method void LinkedBlockingQueue.put(Object)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname)
	//*   5    9:astore_1        
		{
			return;
	//    6   10:return          
		}
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
		queue.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field LinkedBlockingQueue queue>
	//    2    4:invokevirtual   #78  <Method void LinkedBlockingQueue.clear()>
	//    3    7:return          
	}

	private static final int QUEUE_TIMEOUT_IN_MS = 200;
	private final LinkedBlockingQueue queue;
	private boolean retrieved;

	private AdvertisingInfoServiceStrategy$AdvertisingConnection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		retrieved = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #23  <Field boolean retrieved>
		queue = new LinkedBlockingQueue(1);
	//    5    9:aload_0         
	//    6   10:new             #25  <Class LinkedBlockingQueue>
	//    7   13:dup             
	//    8   14:iconst_1        
	//    9   15:invokespecial   #28  <Method void LinkedBlockingQueue(int)>
	//   10   18:putfield        #30  <Field LinkedBlockingQueue queue>
	//   11   21:return          
	}

	AdvertisingInfoServiceStrategy$AdvertisingConnection(AdvertisingInfoServiceStrategy._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AdvertisingInfoServiceStrategy$AdvertisingConnection()>
	//    2    4:return          
	}
}
