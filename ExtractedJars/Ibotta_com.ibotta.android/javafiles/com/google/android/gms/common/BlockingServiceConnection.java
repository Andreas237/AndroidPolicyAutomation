// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.*;

public class BlockingServiceConnection
	implements ServiceConnection
{

	public BlockingServiceConnection()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzaj = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean zzaj>
	//    5    9:aload_0         
	//    6   10:new             #19  <Class LinkedBlockingQueue>
	//    7   13:dup             
	//    8   14:invokespecial   #20  <Method void LinkedBlockingQueue()>
	//    9   17:putfield        #22  <Field BlockingQueue zzak>
	//   10   20:return          
	}

	public IBinder getService()
		throws InterruptedException
	{
		Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
	//    0    0:ldc1            #29  <String "BlockingServiceConnection.getService() called on main thread">
	//    1    2:invokestatic    #35  <Method void Preconditions.checkNotMainThread(String)>
		if(!zzaj)
	//*   2    5:aload_0         
	//*   3    6:getfield        #17  <Field boolean zzaj>
	//*   4    9:ifne            30
		{
			zzaj = true;
	//    5   12:aload_0         
	//    6   13:iconst_1        
	//    7   14:putfield        #17  <Field boolean zzaj>
			return (IBinder)zzak.take();
	//    8   17:aload_0         
	//    9   18:getfield        #22  <Field BlockingQueue zzak>
	//   10   21:invokeinterface #41  <Method Object BlockingQueue.take()>
	//   11   26:checkcast       #43  <Class IBinder>
	//   12   29:areturn         
		} else
		{
			throw new IllegalStateException("Cannot call get on this connection more than once");
	//   13   30:new             #45  <Class IllegalStateException>
	//   14   33:dup             
	//   15   34:ldc1            #47  <String "Cannot call get on this connection more than once">
	//   16   36:invokespecial   #49  <Method void IllegalStateException(String)>
	//   17   39:athrow          
		}
	}

	public IBinder getServiceWithTimeout(long l, TimeUnit timeunit)
		throws InterruptedException, TimeoutException
	{
		Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
	//    0    0:ldc1            #56  <String "BlockingServiceConnection.getServiceWithTimeout() called on main thread">
	//    1    2:invokestatic    #35  <Method void Preconditions.checkNotMainThread(String)>
		if(!zzaj)
	//*   2    5:aload_0         
	//*   3    6:getfield        #17  <Field boolean zzaj>
	//*   4    9:ifne            48
		{
			zzaj = true;
	//    5   12:aload_0         
	//    6   13:iconst_1        
	//    7   14:putfield        #17  <Field boolean zzaj>
			timeunit = ((TimeUnit) ((IBinder)zzak.poll(l, timeunit)));
	//    8   17:aload_0         
	//    9   18:getfield        #22  <Field BlockingQueue zzak>
	//   10   21:lload_1         
	//   11   22:aload_3         
	//   12   23:invokeinterface #60  <Method Object BlockingQueue.poll(long, TimeUnit)>
	//   13   28:checkcast       #43  <Class IBinder>
	//   14   31:astore_3        
			if(timeunit != null)
	//*  15   32:aload_3         
	//*  16   33:ifnull          38
				return ((IBinder) (timeunit));
	//   17   36:aload_3         
	//   18   37:areturn         
			else
				throw new TimeoutException("Timed out waiting for the service connection");
	//   19   38:new             #54  <Class TimeoutException>
	//   20   41:dup             
	//   21   42:ldc1            #62  <String "Timed out waiting for the service connection">
	//   22   44:invokespecial   #63  <Method void TimeoutException(String)>
	//   23   47:athrow          
		} else
		{
			throw new IllegalStateException("Cannot call get on this connection more than once");
	//   24   48:new             #45  <Class IllegalStateException>
	//   25   51:dup             
	//   26   52:ldc1            #47  <String "Cannot call get on this connection more than once">
	//   27   54:invokespecial   #49  <Method void IllegalStateException(String)>
	//   28   57:athrow          
		}
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		zzak.add(((Object) (ibinder)));
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field BlockingQueue zzak>
	//    2    4:aload_2         
	//    3    5:invokeinterface #69  <Method boolean BlockingQueue.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
	//    0    0:return          
	}

	private boolean zzaj;
	private final BlockingQueue zzak = new LinkedBlockingQueue();
}
