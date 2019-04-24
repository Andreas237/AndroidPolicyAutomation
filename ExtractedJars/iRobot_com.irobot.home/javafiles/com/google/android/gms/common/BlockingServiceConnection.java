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
	//    1    1:invokespecial   #16  <Method void Object()>
		zze = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #18  <Field boolean zze>
	//    5    9:aload_0         
	//    6   10:new             #20  <Class LinkedBlockingQueue>
	//    7   13:dup             
	//    8   14:invokespecial   #21  <Method void LinkedBlockingQueue()>
	//    9   17:putfield        #23  <Field BlockingQueue zzf>
	//   10   20:return          
	}

	public IBinder getService()
	{
		Preconditions.checkNotMainThread("BlockingServiceConnection.getService() called on main thread");
	//    0    0:ldc1            #28  <String "BlockingServiceConnection.getService() called on main thread">
	//    1    2:invokestatic    #34  <Method void Preconditions.checkNotMainThread(String)>
		if(zze)
	//*   2    5:aload_0         
	//*   3    6:getfield        #18  <Field boolean zze>
	//*   4    9:ifeq            22
		{
			throw new IllegalStateException("Cannot call get on this connection more than once");
	//    5   12:new             #36  <Class IllegalStateException>
	//    6   15:dup             
	//    7   16:ldc1            #38  <String "Cannot call get on this connection more than once">
	//    8   18:invokespecial   #40  <Method void IllegalStateException(String)>
	//    9   21:athrow          
		} else
		{
			zze = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #18  <Field boolean zze>
			return (IBinder)zzf.take();
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field BlockingQueue zzf>
	//   15   31:invokeinterface #46  <Method Object BlockingQueue.take()>
	//   16   36:checkcast       #48  <Class IBinder>
	//   17   39:areturn         
		}
	}

	public IBinder getServiceWithTimeout(long l, TimeUnit timeunit)
	{
		Preconditions.checkNotMainThread("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
	//    0    0:ldc1            #53  <String "BlockingServiceConnection.getServiceWithTimeout() called on main thread">
	//    1    2:invokestatic    #34  <Method void Preconditions.checkNotMainThread(String)>
		if(zze)
	//*   2    5:aload_0         
	//*   3    6:getfield        #18  <Field boolean zze>
	//*   4    9:ifeq            22
			throw new IllegalStateException("Cannot call get on this connection more than once");
	//    5   12:new             #36  <Class IllegalStateException>
	//    6   15:dup             
	//    7   16:ldc1            #38  <String "Cannot call get on this connection more than once">
	//    8   18:invokespecial   #40  <Method void IllegalStateException(String)>
	//    9   21:athrow          
		zze = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #18  <Field boolean zze>
		timeunit = ((TimeUnit) ((IBinder)zzf.poll(l, timeunit)));
	//   13   27:aload_0         
	//   14   28:getfield        #23  <Field BlockingQueue zzf>
	//   15   31:lload_1         
	//   16   32:aload_3         
	//   17   33:invokeinterface #57  <Method Object BlockingQueue.poll(long, TimeUnit)>
	//   18   38:checkcast       #48  <Class IBinder>
	//   19   41:astore_3        
		if(timeunit == null)
	//*  20   42:aload_3         
	//*  21   43:ifnonnull       56
			throw new TimeoutException("Timed out waiting for the service connection");
	//   22   46:new             #59  <Class TimeoutException>
	//   23   49:dup             
	//   24   50:ldc1            #61  <String "Timed out waiting for the service connection">
	//   25   52:invokespecial   #62  <Method void TimeoutException(String)>
	//   26   55:athrow          
		else
			return ((IBinder) (timeunit));
	//   27   56:aload_3         
	//   28   57:areturn         
	}

	public void onServiceConnected(ComponentName componentname, IBinder ibinder)
	{
		zzf.add(((Object) (ibinder)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field BlockingQueue zzf>
	//    2    4:aload_2         
	//    3    5:invokeinterface #68  <Method boolean BlockingQueue.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void onServiceDisconnected(ComponentName componentname)
	{
	//    0    0:return          
	}

	private boolean zze;
	private final BlockingQueue zzf = new LinkedBlockingQueue();
}
