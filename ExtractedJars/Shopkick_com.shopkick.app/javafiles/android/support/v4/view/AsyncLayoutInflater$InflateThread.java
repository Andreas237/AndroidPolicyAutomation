// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import java.util.concurrent.ArrayBlockingQueue;

// Referenced classes of package android.support.v4.view:
//			AsyncLayoutInflater

private static class AsyncLayoutInflater$InflateThread extends Thread
{

	public static AsyncLayoutInflater$InflateThread getInstance()
	{
		return sInstance;
	//    0    0:getstatic       #22  <Field AsyncLayoutInflater$InflateThread sInstance>
	//    1    3:areturn         
	}

	public void enqueue( )
	{
		try
		{
			mQueue.put(((Object) ()));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ArrayBlockingQueue mQueue>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void ArrayBlockingQueue.put(Object)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch( )
	//*   5    9:astore_1        
		{
			throw new RuntimeException("Failed to enqueue async inflate request", ((Throwable) ()));
	//    6   10:new             #51  <Class RuntimeException>
	//    7   13:dup             
	//    8   14:ldc1            #53  <String "Failed to enqueue async inflate request">
	//    9   16:aload_1         
	//   10   17:invokespecial   #56  <Method void RuntimeException(String, Throwable)>
	//   11   20:athrow          
		}
	}

	public  obtainRequest()
	{
		 1 = ()mRequestPool.acquire();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field android.support.v4.util.Pools$SynchronizedPool mRequestPool>
	//    2    4:invokevirtual   #62  <Method Object android.support.v4.util.Pools$SynchronizedPool.acquire()>
	//    3    7:checkcast       #64  <Class AsyncLayoutInflater$InflateRequest>
	//    4   10:astore_2        
		  = 1;
	//    5   11:aload_2         
	//    6   12:astore_1        
		if(1 == null)
	//*   7   13:aload_2         
	//*   8   14:ifnonnull       25
			 = new ();
	//    9   17:new             #64  <Class AsyncLayoutInflater$InflateRequest>
	//   10   20:dup             
	//   11   21:invokespecial   #65  <Method void AsyncLayoutInflater$InflateRequest()>
	//   12   24:astore_1        
		return ;
	//   13   25:aload_1         
	//   14   26:areturn         
	}

	public void releaseRequest( )
	{
		.callback = null;
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:putfield        #70  <Field AsyncLayoutInflater$OnInflateFinishedListener AsyncLayoutInflater$InflateRequest.callback>
		.inflater = null;
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:putfield        #74  <Field AsyncLayoutInflater AsyncLayoutInflater$InflateRequest.inflater>
		.parent = null;
	//    6   10:aload_1         
	//    7   11:aconst_null     
	//    8   12:putfield        #78  <Field android.view.ViewGroup AsyncLayoutInflater$InflateRequest.parent>
		.resid = 0;
	//    9   15:aload_1         
	//   10   16:iconst_0        
	//   11   17:putfield        #82  <Field int AsyncLayoutInflater$InflateRequest.resid>
		.view = null;
	//   12   20:aload_1         
	//   13   21:aconst_null     
	//   14   22:putfield        #86  <Field android.view.View AsyncLayoutInflater$InflateRequest.view>
		mRequestPool.release(((Object) ()));
	//   15   25:aload_0         
	//   16   26:getfield        #39  <Field android.support.v4.util.Pools$SynchronizedPool mRequestPool>
	//   17   29:aload_1         
	//   18   30:invokevirtual   #90  <Method boolean android.support.v4.util.Pools$SynchronizedPool.release(Object)>
	//   19   33:pop             
	//   20   34:return          
	}

	public void run()
	{
		do
			runInner();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #94  <Method void runInner()>
		while(true);
	//    2    4:goto            0
	}

	public void runInner()
	{
		 ;
		try
		{
			 = ()mQueue.take();
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ArrayBlockingQueue mQueue>
	//    2    4:invokevirtual   #97  <Method Object ArrayBlockingQueue.take()>
	//    3    7:checkcast       #64  <Class AsyncLayoutInflater$InflateRequest>
	//    4   10:astore_1        
		}
	//*   5   11:aload_1         
	//*   6   12:aload_1         
	//*   7   13:getfield        #74  <Field AsyncLayoutInflater AsyncLayoutInflater$InflateRequest.inflater>
	//*   8   16:getfield        #101 <Field LayoutInflater AsyncLayoutInflater.mInflater>
	//*   9   19:aload_1         
	//*  10   20:getfield        #82  <Field int AsyncLayoutInflater$InflateRequest.resid>
	//*  11   23:aload_1         
	//*  12   24:getfield        #78  <Field android.view.ViewGroup AsyncLayoutInflater$InflateRequest.parent>
	//*  13   27:iconst_0        
	//*  14   28:invokevirtual   #107 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//*  15   31:putfield        #86  <Field android.view.View AsyncLayoutInflater$InflateRequest.view>
	//*  16   34:goto            47
	//*  17   37:astore_2        
	//*  18   38:ldc1            #109 <String "AsyncLayoutInflater">
	//*  19   40:ldc1            #111 <String "Failed to inflate resource in the background! Retrying on the UI thread">
	//*  20   42:aload_2         
	//*  21   43:invokestatic    #117 <Method int Log.w(String, String, Throwable)>
	//*  22   46:pop             
	//*  23   47:aload_1         
	//*  24   48:getfield        #74  <Field AsyncLayoutInflater AsyncLayoutInflater$InflateRequest.inflater>
	//*  25   51:getfield        #121 <Field android.os.Handler AsyncLayoutInflater.mHandler>
	//*  26   54:iconst_0        
	//*  27   55:aload_1         
	//*  28   56:invokestatic    #127 <Method Message Message.obtain(android.os.Handler, int, Object)>
	//*  29   59:invokevirtual   #130 <Method void Message.sendToTarget()>
	//*  30   62:return          
		catch(InterruptedException interruptedexception)
	//*  31   63:astore_1        
		{
			Log.w("AsyncLayoutInflater", ((Throwable) (interruptedexception)));
	//   32   64:ldc1            #109 <String "AsyncLayoutInflater">
	//   33   66:aload_1         
	//   34   67:invokestatic    #133 <Method int Log.w(String, Throwable)>
	//   35   70:pop             
			return;
	//   36   71:return          
		}
		try
		{
			.view = .inflater.mInflater.inflate(.resid, .parent, false);
		}
		catch(RuntimeException runtimeexception)
		{
			Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", ((Throwable) (runtimeexception)));
		}
		Message.obtain(.inflater.mHandler, 0, ((Object) ())).sendToTarget();
	}

	private static final AsyncLayoutInflater$InflateThread sInstance;
	private ArrayBlockingQueue mQueue;
	private android.support.v4.util.Pools.SynchronizedPool mRequestPool;

	static 
	{
		sInstance = new AsyncLayoutInflater$InflateThread();
	//    0    0:new             #2   <Class AsyncLayoutInflater$InflateThread>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void AsyncLayoutInflater$InflateThread()>
	//    3    7:putstatic       #22  <Field AsyncLayoutInflater$InflateThread sInstance>
		sInstance.start();
	//    4   10:getstatic       #22  <Field AsyncLayoutInflater$InflateThread sInstance>
	//    5   13:invokevirtual   #25  <Method void start()>
	//*   6   16:return          
	}

	private AsyncLayoutInflater$InflateThread()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Thread()>
		mQueue = new ArrayBlockingQueue(10);
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ArrayBlockingQueue>
	//    4    8:dup             
	//    5    9:bipush          10
	//    6   11:invokespecial   #32  <Method void ArrayBlockingQueue(int)>
	//    7   14:putfield        #34  <Field ArrayBlockingQueue mQueue>
		mRequestPool = new android.support.v4.util.Pools.SynchronizedPool(10);
	//    8   17:aload_0         
	//    9   18:new             #36  <Class android.support.v4.util.Pools$SynchronizedPool>
	//   10   21:dup             
	//   11   22:bipush          10
	//   12   24:invokespecial   #37  <Method void android.support.v4.util.Pools$SynchronizedPool(int)>
	//   13   27:putfield        #39  <Field android.support.v4.util.Pools$SynchronizedPool mRequestPool>
	//   14   30:return          
	}
}
