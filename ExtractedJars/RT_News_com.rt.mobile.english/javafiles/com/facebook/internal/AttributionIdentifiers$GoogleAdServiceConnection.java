// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//			AttributionIdentifiers

private static final class AttributionIdentifiers$GoogleAdServiceConnection
	implements ServiceConnection
{

	public IBinder getBinder()
		throws InterruptedException
	{
		if(consumed.compareAndSet(true, true))
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field AtomicBoolean consumed>
	//*   2    4:iconst_1        
	//*   3    5:iconst_1        
	//*   4    6:invokevirtual   #41  <Method boolean AtomicBoolean.compareAndSet(boolean, boolean)>
	//*   5    9:ifeq            22
			throw new IllegalStateException("Binder already consumed");
	//    6   12:new             #43  <Class IllegalStateException>
	//    7   15:dup             
	//    8   16:ldc1            #45  <String "Binder already consumed">
	//    9   18:invokespecial   #48  <Method void IllegalStateException(String)>
	//   10   21:athrow          
		else
			return (IBinder)queue.take();
	//   11   22:aload_0         
	//   12   23:getfield        #30  <Field BlockingQueue queue>
	//   13   26:invokeinterface #54  <Method Object BlockingQueue.take()>
	//   14   31:checkcast       #56  <Class IBinder>
	//   15   34:areturn         
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		try
		{
			queue.put(((Object) (ibinder)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field BlockingQueue queue>
	//    2    4:aload_2         
	//    3    5:invokeinterface #63  <Method void BlockingQueue.put(Object)>
			return;
	//    4   10:return          
		}
		// Misplaced declaration of an exception variable
		catch(ComponentName componentname)
	//*   5   11:astore_1        
		{
			return;
	//    6   12:return          
		}
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
	//    0    0:return          
	}

	private AtomicBoolean consumed;
	private final BlockingQueue queue;

	private AttributionIdentifiers$GoogleAdServiceConnection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		consumed = new AtomicBoolean(false);
	//    2    4:aload_0         
	//    3    5:new             #20  <Class AtomicBoolean>
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:invokespecial   #23  <Method void AtomicBoolean(boolean)>
	//    7   13:putfield        #25  <Field AtomicBoolean consumed>
		queue = ((BlockingQueue) (new LinkedBlockingDeque()));
	//    8   16:aload_0         
	//    9   17:new             #27  <Class LinkedBlockingDeque>
	//   10   20:dup             
	//   11   21:invokespecial   #28  <Method void LinkedBlockingDeque()>
	//   12   24:putfield        #30  <Field BlockingQueue queue>
	//   13   27:return          
	}

	AttributionIdentifiers$GoogleAdServiceConnection(AttributionIdentifiers._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AttributionIdentifiers$GoogleAdServiceConnection()>
	//    2    4:return          
	}
}
