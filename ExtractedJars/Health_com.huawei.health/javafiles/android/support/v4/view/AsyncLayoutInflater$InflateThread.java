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

static class AsyncLayoutInflater$InflateThread extends Thread
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
		{
			Object obj;
			try
			{
				obj = ((Object) (()mQueue.take()));
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field ArrayBlockingQueue mQueue>
	//    2    4:invokevirtual   #94  <Method Object ArrayBlockingQueue.take()>
	//    3    7:checkcast       #64  <Class AsyncLayoutInflater$InflateRequest>
	//    4   10:astore_1        
			}
	//*   5   11:goto            25
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*   6   14:astore_1        
			{
				Log.w("AsyncLayoutInflater", ((Throwable) (obj)));
	//    7   15:ldc1            #96  <String "AsyncLayoutInflater">
	//    8   17:aload_1         
	//    9   18:invokestatic    #102 <Method int Log.w(String, Throwable)>
	//   10   21:pop             
				continue;
	//   11   22:goto            0
			}
			try
			{
				obj.view = (() (obj)).inflater.mInflater.inflate((() (obj)).resid, (() (obj)).parent, false);
	//   12   25:aload_1         
	//   13   26:aload_1         
	//   14   27:getfield        #74  <Field AsyncLayoutInflater AsyncLayoutInflater$InflateRequest.inflater>
	//   15   30:getfield        #106 <Field LayoutInflater AsyncLayoutInflater.mInflater>
	//   16   33:aload_1         
	//   17   34:getfield        #82  <Field int AsyncLayoutInflater$InflateRequest.resid>
	//   18   37:aload_1         
	//   19   38:getfield        #78  <Field android.view.ViewGroup AsyncLayoutInflater$InflateRequest.parent>
	//   20   41:iconst_0        
	//   21   42:invokevirtual   #112 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   22   45:putfield        #86  <Field android.view.View AsyncLayoutInflater$InflateRequest.view>
			}
	//*  23   48:goto            61
			catch(RuntimeException runtimeexception)
	//*  24   51:astore_2        
			{
				Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", ((Throwable) (runtimeexception)));
	//   25   52:ldc1            #96  <String "AsyncLayoutInflater">
	//   26   54:ldc1            #114 <String "Failed to inflate resource in the background! Retrying on the UI thread">
	//   27   56:aload_2         
	//   28   57:invokestatic    #117 <Method int Log.w(String, String, Throwable)>
	//   29   60:pop             
			}
			Message.obtain((() (obj)).inflater.mHandler, 0, obj).sendToTarget();
	//   30   61:aload_1         
	//   31   62:getfield        #74  <Field AsyncLayoutInflater AsyncLayoutInflater$InflateRequest.inflater>
	//   32   65:getfield        #121 <Field android.os.Handler AsyncLayoutInflater.mHandler>
	//   33   68:iconst_0        
	//   34   69:aload_1         
	//   35   70:invokestatic    #127 <Method Message Message.obtain(android.os.Handler, int, Object)>
	//   36   73:invokevirtual   #130 <Method void Message.sendToTarget()>
		} while(true);
	//   37   76:goto            0
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
