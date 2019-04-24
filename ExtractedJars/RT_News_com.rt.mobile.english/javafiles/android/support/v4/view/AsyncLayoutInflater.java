// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.*;
import java.util.concurrent.ArrayBlockingQueue;

public final class AsyncLayoutInflater
{
	private static class BasicInflater extends LayoutInflater
	{

		public LayoutInflater cloneInContext(Context context)
		{
			return ((LayoutInflater) (new BasicInflater(context)));
		//    0    0:new             #2   <Class AsyncLayoutInflater$BasicInflater>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokespecial   #29  <Method void AsyncLayoutInflater$BasicInflater(Context)>
		//    4    8:areturn         
		}

		protected View onCreateView(String s, AttributeSet attributeset)
			throws ClassNotFoundException
		{
			int i;
			int j;
			String as[];
			as = sClassPrefixList;
		//    0    0:getstatic       #21  <Field String[] sClassPrefixList>
		//    1    3:astore          5
			i = 0;
		//    2    5:iconst_0        
		//    3    6:istore_3        
			j = as.length;
		//    4    7:aload           5
		//    5    9:arraylength     
		//    6   10:istore          4
_L2:
			Object obj;
			if(i >= j)
				break; /* Loop/switch isn't completed */
		//    7   12:iload_3         
		//    8   13:iload           4
		//    9   15:icmpge          49
			obj = ((Object) (as[i]));
		//   10   18:aload           5
		//   11   20:iload_3         
		//   12   21:aaload          
		//   13   22:astore          6
			obj = ((Object) (createView(s, ((String) (obj)), attributeset)));
		//   14   24:aload_0         
		//   15   25:aload_1         
		//   16   26:aload           6
		//   17   28:aload_2         
		//   18   29:invokevirtual   #37  <Method View createView(String, String, AttributeSet)>
		//   19   32:astore          6
			if(obj != null)
		//*  20   34:aload           6
		//*  21   36:ifnull          42
				return ((View) (obj));
		//   22   39:aload           6
		//   23   41:areturn         
_L3:
			i++;
		//   24   42:iload_3         
		//   25   43:iconst_1        
		//   26   44:iadd            
		//   27   45:istore_3        
			if(true) goto _L2; else goto _L1
		//   28   46:goto            12
_L1:
			return super.onCreateView(s, attributeset);
		//   29   49:aload_0         
		//   30   50:aload_1         
		//   31   51:aload_2         
		//   32   52:invokespecial   #39  <Method View LayoutInflater.onCreateView(String, AttributeSet)>
		//   33   55:areturn         
			ClassNotFoundException classnotfoundexception;
			classnotfoundexception;
		//   34   56:astore          6
			  goto _L3
		//*  35   58:goto            42
		}

		private static final String sClassPrefixList[] = {
			"android.widget.", "android.webkit.", "android.app."
		};

		static 
		{
		//    0    0:iconst_3        
		//    1    1:anewarray       String[]
		//    2    4:dup             
		//    3    5:iconst_0        
		//    4    6:ldc1            #15  <String "android.widget.">
		//    5    8:aastore         
		//    6    9:dup             
		//    7   10:iconst_1        
		//    8   11:ldc1            #17  <String "android.webkit.">
		//    9   13:aastore         
		//   10   14:dup             
		//   11   15:iconst_2        
		//   12   16:ldc1            #19  <String "android.app.">
		//   13   18:aastore         
		//   14   19:putstatic       #21  <Field String[] sClassPrefixList>
		//*  15   22:return          
		}

		BasicInflater(Context context)
		{
			super(context);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #26  <Method void LayoutInflater(Context)>
		//    3    5:return          
		}
	}

	private static class InflateRequest
	{

		OnInflateFinishedListener callback;
		AsyncLayoutInflater inflater;
		ViewGroup parent;
		int resid;
		View view;

		InflateRequest()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}

	private static class InflateThread extends Thread
	{

		public static InflateThread getInstance()
		{
			return sInstance;
		//    0    0:getstatic       #22  <Field AsyncLayoutInflater$InflateThread sInstance>
		//    1    3:areturn         
		}

		public void enqueue(InflateRequest inflaterequest)
		{
			try
			{
				mQueue.put(((Object) (inflaterequest)));
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field ArrayBlockingQueue mQueue>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #49  <Method void ArrayBlockingQueue.put(Object)>
				return;
		//    4    8:return          
			}
			// Misplaced declaration of an exception variable
			catch(InflateRequest inflaterequest)
		//*   5    9:astore_1        
			{
				throw new RuntimeException("Failed to enqueue async inflate request", ((Throwable) (inflaterequest)));
		//    6   10:new             #51  <Class RuntimeException>
		//    7   13:dup             
		//    8   14:ldc1            #53  <String "Failed to enqueue async inflate request">
		//    9   16:aload_1         
		//   10   17:invokespecial   #56  <Method void RuntimeException(String, Throwable)>
		//   11   20:athrow          
			}
		}

		public InflateRequest obtainRequest()
		{
			InflateRequest inflaterequest1 = (InflateRequest)mRequestPool.acquire();
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field android.support.v4.util.Pools$SynchronizedPool mRequestPool>
		//    2    4:invokevirtual   #62  <Method Object android.support.v4.util.Pools$SynchronizedPool.acquire()>
		//    3    7:checkcast       #64  <Class AsyncLayoutInflater$InflateRequest>
		//    4   10:astore_2        
			InflateRequest inflaterequest = inflaterequest1;
		//    5   11:aload_2         
		//    6   12:astore_1        
			if(inflaterequest1 == null)
		//*   7   13:aload_2         
		//*   8   14:ifnonnull       25
				inflaterequest = new InflateRequest();
		//    9   17:new             #64  <Class AsyncLayoutInflater$InflateRequest>
		//   10   20:dup             
		//   11   21:invokespecial   #65  <Method void AsyncLayoutInflater$InflateRequest()>
		//   12   24:astore_1        
			return inflaterequest;
		//   13   25:aload_1         
		//   14   26:areturn         
		}

		public void releaseRequest(InflateRequest inflaterequest)
		{
			inflaterequest.callback = null;
		//    0    0:aload_1         
		//    1    1:aconst_null     
		//    2    2:putfield        #70  <Field AsyncLayoutInflater$OnInflateFinishedListener AsyncLayoutInflater$InflateRequest.callback>
			inflaterequest.inflater = null;
		//    3    5:aload_1         
		//    4    6:aconst_null     
		//    5    7:putfield        #74  <Field AsyncLayoutInflater AsyncLayoutInflater$InflateRequest.inflater>
			inflaterequest.parent = null;
		//    6   10:aload_1         
		//    7   11:aconst_null     
		//    8   12:putfield        #78  <Field ViewGroup AsyncLayoutInflater$InflateRequest.parent>
			inflaterequest.resid = 0;
		//    9   15:aload_1         
		//   10   16:iconst_0        
		//   11   17:putfield        #82  <Field int AsyncLayoutInflater$InflateRequest.resid>
			inflaterequest.view = null;
		//   12   20:aload_1         
		//   13   21:aconst_null     
		//   14   22:putfield        #86  <Field View AsyncLayoutInflater$InflateRequest.view>
			mRequestPool.release(((Object) (inflaterequest)));
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
			InflateRequest inflaterequest;
			try
			{
				inflaterequest = (InflateRequest)mQueue.take();
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
		//*  12   24:getfield        #78  <Field ViewGroup AsyncLayoutInflater$InflateRequest.parent>
		//*  13   27:iconst_0        
		//*  14   28:invokevirtual   #107 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
		//*  15   31:putfield        #86  <Field View AsyncLayoutInflater$InflateRequest.view>
		//*  16   34:goto            47
		//*  17   37:astore_2        
		//*  18   38:ldc1            #109 <String "AsyncLayoutInflater">
		//*  19   40:ldc1            #111 <String "Failed to inflate resource in the background! Retrying on the UI thread">
		//*  20   42:aload_2         
		//*  21   43:invokestatic    #117 <Method int Log.w(String, String, Throwable)>
		//*  22   46:pop             
		//*  23   47:aload_1         
		//*  24   48:getfield        #74  <Field AsyncLayoutInflater AsyncLayoutInflater$InflateRequest.inflater>
		//*  25   51:getfield        #121 <Field Handler AsyncLayoutInflater.mHandler>
		//*  26   54:iconst_0        
		//*  27   55:aload_1         
		//*  28   56:invokestatic    #127 <Method Message Message.obtain(Handler, int, Object)>
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
				inflaterequest.view = inflaterequest.inflater.mInflater.inflate(inflaterequest.resid, inflaterequest.parent, false);
			}
			catch(RuntimeException runtimeexception)
			{
				Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", ((Throwable) (runtimeexception)));
			}
			Message.obtain(inflaterequest.inflater.mHandler, 0, ((Object) (inflaterequest))).sendToTarget();
		}

		private static final InflateThread sInstance;
		private ArrayBlockingQueue mQueue;
		private android.support.v4.util.Pools.SynchronizedPool mRequestPool;

		static 
		{
			sInstance = new InflateThread();
		//    0    0:new             #2   <Class AsyncLayoutInflater$InflateThread>
		//    1    3:dup             
		//    2    4:invokespecial   #20  <Method void AsyncLayoutInflater$InflateThread()>
		//    3    7:putstatic       #22  <Field AsyncLayoutInflater$InflateThread sInstance>
			sInstance.start();
		//    4   10:getstatic       #22  <Field AsyncLayoutInflater$InflateThread sInstance>
		//    5   13:invokevirtual   #25  <Method void start()>
		//*   6   16:return          
		}

		private InflateThread()
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

	public static interface OnInflateFinishedListener
	{

		public abstract void onInflateFinished(View view, int i, ViewGroup viewgroup);
	}


	public AsyncLayoutInflater(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		mHandlerCallback = new android.os.Handler.Callback() {

			public boolean handleMessage(Message message)
			{
				message = ((Message) ((InflateRequest)message.obj));
			//    0    0:aload_1         
			//    1    1:getfield        #26  <Field Object Message.obj>
			//    2    4:checkcast       #28  <Class AsyncLayoutInflater$InflateRequest>
			//    3    7:astore_1        
				if(((InflateRequest) (message)).view == null)
			//*   4    8:aload_1         
			//*   5    9:getfield        #32  <Field View AsyncLayoutInflater$InflateRequest.view>
			//*   6   12:ifnonnull       38
					message.view = mInflater.inflate(((InflateRequest) (message)).resid, ((InflateRequest) (message)).parent, false);
			//    7   15:aload_1         
			//    8   16:aload_0         
			//    9   17:getfield        #14  <Field AsyncLayoutInflater this$0>
			//   10   20:getfield        #36  <Field LayoutInflater AsyncLayoutInflater.mInflater>
			//   11   23:aload_1         
			//   12   24:getfield        #40  <Field int AsyncLayoutInflater$InflateRequest.resid>
			//   13   27:aload_1         
			//   14   28:getfield        #44  <Field ViewGroup AsyncLayoutInflater$InflateRequest.parent>
			//   15   31:iconst_0        
			//   16   32:invokevirtual   #50  <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
			//   17   35:putfield        #32  <Field View AsyncLayoutInflater$InflateRequest.view>
				((InflateRequest) (message)).callback.onInflateFinished(((InflateRequest) (message)).view, ((InflateRequest) (message)).resid, ((InflateRequest) (message)).parent);
			//   18   38:aload_1         
			//   19   39:getfield        #54  <Field AsyncLayoutInflater$OnInflateFinishedListener AsyncLayoutInflater$InflateRequest.callback>
			//   20   42:aload_1         
			//   21   43:getfield        #32  <Field View AsyncLayoutInflater$InflateRequest.view>
			//   22   46:aload_1         
			//   23   47:getfield        #40  <Field int AsyncLayoutInflater$InflateRequest.resid>
			//   24   50:aload_1         
			//   25   51:getfield        #44  <Field ViewGroup AsyncLayoutInflater$InflateRequest.parent>
			//   26   54:invokeinterface #60  <Method void AsyncLayoutInflater$OnInflateFinishedListener.onInflateFinished(View, int, ViewGroup)>
				mInflateThread.releaseRequest(((InflateRequest) (message)));
			//   27   59:aload_0         
			//   28   60:getfield        #14  <Field AsyncLayoutInflater this$0>
			//   29   63:getfield        #64  <Field AsyncLayoutInflater$InflateThread AsyncLayoutInflater.mInflateThread>
			//   30   66:aload_1         
			//   31   67:invokevirtual   #70  <Method void AsyncLayoutInflater$InflateThread.releaseRequest(AsyncLayoutInflater$InflateRequest)>
				return true;
			//   32   70:iconst_1        
			//   33   71:ireturn         
			}

			final AsyncLayoutInflater this$0;

			
			{
				this$0 = AsyncLayoutInflater.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field AsyncLayoutInflater this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    2    4:aload_0         
	//    3    5:new             #6   <Class AsyncLayoutInflater$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #39  <Method void AsyncLayoutInflater$1(AsyncLayoutInflater)>
	//    7   13:putfield        #41  <Field android.os.Handler$Callback mHandlerCallback>
		mInflater = ((LayoutInflater) (new BasicInflater(context)));
	//    8   16:aload_0         
	//    9   17:new             #8   <Class AsyncLayoutInflater$BasicInflater>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:invokespecial   #43  <Method void AsyncLayoutInflater$BasicInflater(Context)>
	//   13   25:putfield        #45  <Field LayoutInflater mInflater>
		mHandler = new Handler(mHandlerCallback);
	//   14   28:aload_0         
	//   15   29:new             #47  <Class Handler>
	//   16   32:dup             
	//   17   33:aload_0         
	//   18   34:getfield        #41  <Field android.os.Handler$Callback mHandlerCallback>
	//   19   37:invokespecial   #50  <Method void Handler(android.os.Handler$Callback)>
	//   20   40:putfield        #52  <Field Handler mHandler>
		mInflateThread = InflateThread.getInstance();
	//   21   43:aload_0         
	//   22   44:invokestatic    #56  <Method AsyncLayoutInflater$InflateThread AsyncLayoutInflater$InflateThread.getInstance()>
	//   23   47:putfield        #58  <Field AsyncLayoutInflater$InflateThread mInflateThread>
	//   24   50:return          
	}

	public void inflate(int i, ViewGroup viewgroup, OnInflateFinishedListener oninflatefinishedlistener)
	{
		if(oninflatefinishedlistener == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       14
		{
			throw new NullPointerException("callback argument may not be null!");
	//    2    4:new             #67  <Class NullPointerException>
	//    3    7:dup             
	//    4    8:ldc1            #69  <String "callback argument may not be null!">
	//    5   10:invokespecial   #72  <Method void NullPointerException(String)>
	//    6   13:athrow          
		} else
		{
			InflateRequest inflaterequest = mInflateThread.obtainRequest();
	//    7   14:aload_0         
	//    8   15:getfield        #58  <Field AsyncLayoutInflater$InflateThread mInflateThread>
	//    9   18:invokevirtual   #76  <Method AsyncLayoutInflater$InflateRequest AsyncLayoutInflater$InflateThread.obtainRequest()>
	//   10   21:astore          4
			inflaterequest.inflater = this;
	//   11   23:aload           4
	//   12   25:aload_0         
	//   13   26:putfield        #80  <Field AsyncLayoutInflater AsyncLayoutInflater$InflateRequest.inflater>
			inflaterequest.resid = i;
	//   14   29:aload           4
	//   15   31:iload_1         
	//   16   32:putfield        #84  <Field int AsyncLayoutInflater$InflateRequest.resid>
			inflaterequest.parent = viewgroup;
	//   17   35:aload           4
	//   18   37:aload_2         
	//   19   38:putfield        #88  <Field ViewGroup AsyncLayoutInflater$InflateRequest.parent>
			inflaterequest.callback = oninflatefinishedlistener;
	//   20   41:aload           4
	//   21   43:aload_3         
	//   22   44:putfield        #92  <Field AsyncLayoutInflater$OnInflateFinishedListener AsyncLayoutInflater$InflateRequest.callback>
			mInflateThread.enqueue(inflaterequest);
	//   23   47:aload_0         
	//   24   48:getfield        #58  <Field AsyncLayoutInflater$InflateThread mInflateThread>
	//   25   51:aload           4
	//   26   53:invokevirtual   #96  <Method void AsyncLayoutInflater$InflateThread.enqueue(AsyncLayoutInflater$InflateRequest)>
			return;
	//   27   56:return          
		}
	}

	private static final String TAG = "AsyncLayoutInflater";
	Handler mHandler;
	private android.os.Handler.Callback mHandlerCallback;
	InflateThread mInflateThread;
	LayoutInflater mInflater;
}
