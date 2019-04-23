// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.os.*;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SelfDestructiveThread
{
	public static interface ReplyCallback
	{

		public abstract void onReply(Object obj);
	}


	public SelfDestructiveThread(String s, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #43  <Method void Object()>
	//    6   12:putfield        #45  <Field Object mLock>
		mCallback = new android.os.Handler.Callback() {

			public boolean handleMessage(Message message)
			{
				switch(message.what)
			//*   0    0:aload_1         
			//*   1    1:getfield        #26  <Field int Message.what>
				{
			//*   2    4:tableswitch     0 1: default 28
			//			               0 46
			//			               1 30
				default:
					return true;
			//    3   28:iconst_1        
			//    4   29:ireturn         

				case 1: // '\001'
					onInvokeRunnable((Runnable)message.obj);
			//    5   30:aload_0         
			//    6   31:getfield        #14  <Field SelfDestructiveThread this$0>
			//    7   34:aload_1         
			//    8   35:getfield        #30  <Field Object Message.obj>
			//    9   38:checkcast       #32  <Class Runnable>
			//   10   41:invokevirtual   #36  <Method void SelfDestructiveThread.onInvokeRunnable(Runnable)>
					return true;
			//   11   44:iconst_1        
			//   12   45:ireturn         

				case 0: // '\0'
					onDestruction();
			//   13   46:aload_0         
			//   14   47:getfield        #14  <Field SelfDestructiveThread this$0>
			//   15   50:invokevirtual   #39  <Method void SelfDestructiveThread.onDestruction()>
					return true;
			//   16   53:iconst_1        
			//   17   54:ireturn         
				}
			}

			final SelfDestructiveThread this$0;

			
			{
				this$0 = SelfDestructiveThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field SelfDestructiveThread this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    7   15:aload_0         
	//    8   16:new             #6   <Class SelfDestructiveThread$1>
	//    9   19:dup             
	//   10   20:aload_0         
	//   11   21:invokespecial   #48  <Method void SelfDestructiveThread$1(SelfDestructiveThread)>
	//   12   24:putfield        #50  <Field android.os.Handler$Callback mCallback>
		mThreadName = s;
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:putfield        #52  <Field String mThreadName>
		mPriority = i;
	//   16   32:aload_0         
	//   17   33:iload_2         
	//   18   34:putfield        #54  <Field int mPriority>
		mDestructAfterMillisec = j;
	//   19   37:aload_0         
	//   20   38:iload_3         
	//   21   39:putfield        #56  <Field int mDestructAfterMillisec>
		mGeneration = 0;
	//   22   42:aload_0         
	//   23   43:iconst_0        
	//   24   44:putfield        #58  <Field int mGeneration>
	//   25   47:return          
	}

	private void post(Runnable runnable)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(mThread == null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #63  <Field HandlerThread mThread>
	//*   7   11:ifnonnull       72
			{
				mThread = new HandlerThread(mThreadName, mPriority);
	//    8   14:aload_0         
	//    9   15:new             #65  <Class HandlerThread>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #52  <Field String mThreadName>
	//   13   23:aload_0         
	//   14   24:getfield        #54  <Field int mPriority>
	//   15   27:invokespecial   #68  <Method void HandlerThread(String, int)>
	//   16   30:putfield        #63  <Field HandlerThread mThread>
				mThread.start();
	//   17   33:aload_0         
	//   18   34:getfield        #63  <Field HandlerThread mThread>
	//   19   37:invokevirtual   #71  <Method void HandlerThread.start()>
				mHandler = new Handler(mThread.getLooper(), mCallback);
	//   20   40:aload_0         
	//   21   41:new             #73  <Class Handler>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #63  <Field HandlerThread mThread>
	//   25   49:invokevirtual   #77  <Method android.os.Looper HandlerThread.getLooper()>
	//   26   52:aload_0         
	//   27   53:getfield        #50  <Field android.os.Handler$Callback mCallback>
	//   28   56:invokespecial   #80  <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//   29   59:putfield        #82  <Field Handler mHandler>
				mGeneration = mGeneration + 1;
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:getfield        #58  <Field int mGeneration>
	//   33   67:iconst_1        
	//   34   68:iadd            
	//   35   69:putfield        #58  <Field int mGeneration>
			}
			mHandler.removeMessages(0);
	//   36   72:aload_0         
	//   37   73:getfield        #82  <Field Handler mHandler>
	//   38   76:iconst_0        
	//   39   77:invokevirtual   #86  <Method void Handler.removeMessages(int)>
			mHandler.sendMessage(mHandler.obtainMessage(1, ((Object) (runnable))));
	//   40   80:aload_0         
	//   41   81:getfield        #82  <Field Handler mHandler>
	//   42   84:aload_0         
	//   43   85:getfield        #82  <Field Handler mHandler>
	//   44   88:iconst_1        
	//   45   89:aload_1         
	//   46   90:invokevirtual   #90  <Method Message Handler.obtainMessage(int, Object)>
	//   47   93:invokevirtual   #94  <Method boolean Handler.sendMessage(Message)>
	//   48   96:pop             
		}
	//   49   97:aload_2         
	//   50   98:monitorexit     
		return;
	//   51   99:return          
		runnable;
	//   52  100:astore_1        
		obj;
	//   53  101:aload_2         
		JVM INSTR monitorexit ;
	//   54  102:monitorexit     
		throw runnable;
	//   55  103:aload_1         
	//   56  104:athrow          
	}

	public int getGeneration()
	{
		int i;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = mGeneration;
	//    5    7:aload_0         
	//    6    8:getfield        #58  <Field int mGeneration>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return i;
	//   10   14:iload_1         
	//   11   15:ireturn         
		exception;
	//   12   16:astore_3        
		obj;
	//   13   17:aload_2         
		JVM INSTR monitorexit ;
	//   14   18:monitorexit     
		throw exception;
	//   15   19:aload_3         
	//   16   20:athrow          
	}

	public boolean isRunning()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(mThread != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #63  <Field HandlerThread mThread>
	//*   7   11:ifnull          28
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:goto            19
	//*  11   19:aload_2         
	//*  12   20:monitorexit     
	//*  13   21:iload_1         
	//*  14   22:ireturn         
	//*  15   23:astore_3        
	//*  16   24:aload_2         
	//*  17   25:monitorexit     
	//*  18   26:aload_3         
	//*  19   27:athrow          
			flag = false;
	//   20   28:iconst_0        
	//   21   29:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  22   30:goto            19
	}

	void onDestruction()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(!mHandler.hasMessages(1))
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #82  <Field Handler mHandler>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #105 <Method boolean Handler.hasMessages(int)>
	//    9   15:ifeq            21
			}
	//   10   18:aload_1         
	//   11   19:monitorexit     
			return;
	//   12   20:return          
		}
		mThread.quit();
	//   13   21:aload_0         
	//   14   22:getfield        #63  <Field HandlerThread mThread>
	//   15   25:invokevirtual   #108 <Method boolean HandlerThread.quit()>
	//   16   28:pop             
		mThread = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #63  <Field HandlerThread mThread>
		mHandler = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #82  <Field Handler mHandler>
		obj;
	//   23   39:aload_1         
		JVM INSTR monitorexit ;
	//   24   40:monitorexit     
		return;
	//   25   41:return          
		exception;
	//   26   42:astore_2        
		obj;
	//   27   43:aload_1         
		JVM INSTR monitorexit ;
	//   28   44:monitorexit     
		throw exception;
	//   29   45:aload_2         
	//   30   46:athrow          
	}

	void onInvokeRunnable(Runnable runnable)
	{
		runnable.run();
	//    0    0:aload_1         
	//    1    1:invokeinterface #114 <Method void Runnable.run()>
		synchronized(mLock)
	//*   2    6:aload_0         
	//*   3    7:getfield        #45  <Field Object mLock>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			mHandler.removeMessages(0);
	//    7   13:aload_0         
	//    8   14:getfield        #82  <Field Handler mHandler>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #86  <Method void Handler.removeMessages(int)>
			mHandler.sendMessageDelayed(mHandler.obtainMessage(0), mDestructAfterMillisec);
	//   11   21:aload_0         
	//   12   22:getfield        #82  <Field Handler mHandler>
	//   13   25:aload_0         
	//   14   26:getfield        #82  <Field Handler mHandler>
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #117 <Method Message Handler.obtainMessage(int)>
	//   17   33:aload_0         
	//   18   34:getfield        #56  <Field int mDestructAfterMillisec>
	//   19   37:i2l             
	//   20   38:invokevirtual   #121 <Method boolean Handler.sendMessageDelayed(Message, long)>
	//   21   41:pop             
		}
	//   22   42:aload_1         
	//   23   43:monitorexit     
		return;
	//   24   44:return          
		exception;
	//   25   45:astore_2        
		runnable;
	//   26   46:aload_1         
		JVM INSTR monitorexit ;
	//   27   47:monitorexit     
		throw exception;
	//   28   48:aload_2         
	//   29   49:athrow          
	}

	public void postAndReply(final Callable callable, ReplyCallback replycallback)
	{
		post(new Runnable() {

			public void run()
			{
				Exception exception;
				Object obj;
				try
				{
					obj = callable.call();
			//    0    0:aload_0         
			//    1    1:getfield        #27  <Field Callable val$callable>
			//    2    4:invokeinterface #44  <Method Object Callable.call()>
			//    3    9:astore_1        
				}
			//*   4   10:goto            15
			//*   5   13:aconst_null     
			//*   6   14:astore_1        
			//*   7   15:aload_0         
			//*   8   16:getfield        #29  <Field Handler val$callingHandler>
			//*   9   19:new             #13  <Class SelfDestructiveThread$2$1>
			//*  10   22:dup             
			//*  11   23:aload_0         
			//*  12   24:aload_1         
			//*  13   25:invokespecial   #47  <Method void SelfDestructiveThread$2$1(SelfDestructiveThread$2, Object)>
			//*  14   28:invokevirtual   #53  <Method boolean Handler.post(Runnable)>
			//*  15   31:pop             
			//*  16   32:return          
				// Misplaced declaration of an exception variable
				catch(Exception exception)
				{
					obj = null;
				}
				callingHandler.post(((_cls1) (obj)). new Runnable() {

					public void run()
					{
						reply.onReply(result);
					//    0    0:aload_0         
					//    1    1:getfield        #19  <Field SelfDestructiveThread$2 this$1>
					//    2    4:getfield        #28  <Field SelfDestructiveThread$ReplyCallback SelfDestructiveThread$2.val$reply>
					//    3    7:aload_0         
					//    4    8:getfield        #21  <Field Object val$result>
					//    5   11:invokeinterface #34  <Method void SelfDestructiveThread$ReplyCallback.onReply(Object)>
					//    6   16:return          
					}

					final _cls2 this$1;
					final Object val$result;

			
			{
				this$1 = final__pcls2;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field SelfDestructiveThread$2 this$1>
				result = Object.this;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Object val$result>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
				}
);
			//*  17   33:astore_1        
			//*  18   34:goto            13
			}

			final SelfDestructiveThread this$0;
			final Callable val$callable;
			final Handler val$callingHandler;
			final ReplyCallback val$reply;

			
			{
				this$0 = SelfDestructiveThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #25  <Field SelfDestructiveThread this$0>
				callable = callable1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #27  <Field Callable val$callable>
				callingHandler = handler;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #29  <Field Handler val$callingHandler>
				reply = replycallback;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #31  <Field SelfDestructiveThread$ReplyCallback val$reply>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #34  <Method void Object()>
			//   14   25:return          
			}
		}
);
	//    0    0:aload_0         
	//    1    1:new             #8   <Class SelfDestructiveThread$2>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:new             #73  <Class Handler>
	//    6   10:dup             
	//    7   11:invokespecial   #124 <Method void Handler()>
	//    8   14:aload_2         
	//    9   15:invokespecial   #127 <Method void SelfDestructiveThread$2(SelfDestructiveThread, Callable, Handler, SelfDestructiveThread$ReplyCallback)>
	//   10   18:invokespecial   #129 <Method void post(Runnable)>
	//   11   21:return          
	}

	public Object postAndWait(final Callable callable, int i)
		throws InterruptedException
	{
		final ReentrantLock lock;
		final Condition cond;
		final AtomicReference holder;
		final AtomicBoolean running;
		lock = new ReentrantLock();
	//    0    0:new             #137 <Class ReentrantLock>
	//    1    3:dup             
	//    2    4:invokespecial   #138 <Method void ReentrantLock()>
	//    3    7:astore          7
		cond = lock.newCondition();
	//    4    9:aload           7
	//    5   11:invokevirtual   #142 <Method Condition ReentrantLock.newCondition()>
	//    6   14:astore          8
		holder = new AtomicReference();
	//    7   16:new             #144 <Class AtomicReference>
	//    8   19:dup             
	//    9   20:invokespecial   #145 <Method void AtomicReference()>
	//   10   23:astore          9
		running = new AtomicBoolean(true);
	//   11   25:new             #147 <Class AtomicBoolean>
	//   12   28:dup             
	//   13   29:iconst_1        
	//   14   30:invokespecial   #150 <Method void AtomicBoolean(boolean)>
	//   15   33:astore          10
		post(new Runnable() {

			public void run()
			{
				Exception exception;
				try
				{
					holder.set(callable.call());
			//    0    0:aload_0         
			//    1    1:getfield        #29  <Field AtomicReference val$holder>
			//    2    4:aload_0         
			//    3    5:getfield        #31  <Field Callable val$callable>
			//    4    8:invokeinterface #50  <Method Object Callable.call()>
			//    5   13:invokevirtual   #56  <Method void AtomicReference.set(Object)>
				}
			//*   6   16:aload_0         
			//*   7   17:getfield        #33  <Field ReentrantLock val$lock>
			//*   8   20:invokevirtual   #61  <Method void ReentrantLock.lock()>
			//*   9   23:aload_0         
			//*  10   24:getfield        #35  <Field AtomicBoolean val$running>
			//*  11   27:iconst_0        
			//*  12   28:invokevirtual   #66  <Method void AtomicBoolean.set(boolean)>
			//*  13   31:aload_0         
			//*  14   32:getfield        #37  <Field Condition val$cond>
			//*  15   35:invokeinterface #71  <Method void Condition.signal()>
			//*  16   40:aload_0         
			//*  17   41:getfield        #33  <Field ReentrantLock val$lock>
			//*  18   44:invokevirtual   #74  <Method void ReentrantLock.unlock()>
			//*  19   47:return          
			//*  20   48:astore_1        
			//*  21   49:aload_0         
			//*  22   50:getfield        #33  <Field ReentrantLock val$lock>
			//*  23   53:invokevirtual   #74  <Method void ReentrantLock.unlock()>
			//*  24   56:aload_1         
			//*  25   57:athrow          
				catch(Exception exception1) { }
			//   26   58:astore_1        
				lock.lock();
				running.set(false);
				cond.signal();
				lock.unlock();
				return;
				exception;
				lock.unlock();
				throw exception;
			//*  27   59:goto            16
			}

			final SelfDestructiveThread this$0;
			final Callable val$callable;
			final Condition val$cond;
			final AtomicReference val$holder;
			final ReentrantLock val$lock;
			final AtomicBoolean val$running;

			
			{
				this$0 = SelfDestructiveThread.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #27  <Field SelfDestructiveThread this$0>
				holder = atomicreference;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #29  <Field AtomicReference val$holder>
				callable = callable1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #31  <Field Callable val$callable>
				lock = reentrantlock;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #33  <Field ReentrantLock val$lock>
				running = atomicboolean;
			//   12   21:aload_0         
			//   13   22:aload           5
			//   14   24:putfield        #35  <Field AtomicBoolean val$running>
				cond = condition;
			//   15   27:aload_0         
			//   16   28:aload           6
			//   17   30:putfield        #37  <Field Condition val$cond>
				super();
			//   18   33:aload_0         
			//   19   34:invokespecial   #40  <Method void Object()>
			//   20   37:return          
			}
		}
);
	//   16   35:aload_0         
	//   17   36:new             #12  <Class SelfDestructiveThread$3>
	//   18   39:dup             
	//   19   40:aload_0         
	//   20   41:aload           9
	//   21   43:aload_1         
	//   22   44:aload           7
	//   23   46:aload           10
	//   24   48:aload           8
	//   25   50:invokespecial   #153 <Method void SelfDestructiveThread$3(SelfDestructiveThread, AtomicReference, Callable, ReentrantLock, AtomicBoolean, Condition)>
	//   26   53:invokespecial   #129 <Method void post(Runnable)>
		lock.lock();
	//   27   56:aload           7
	//   28   58:invokevirtual   #156 <Method void ReentrantLock.lock()>
		if(running.get())
			break MISSING_BLOCK_LABEL_82;
	//   29   61:aload           10
	//   30   63:invokevirtual   #159 <Method boolean AtomicBoolean.get()>
	//   31   66:ifne            82
		callable = ((Callable) (holder.get()));
	//   32   69:aload           9
	//   33   71:invokevirtual   #162 <Method Object AtomicReference.get()>
	//   34   74:astore_1        
		lock.unlock();
	//   35   75:aload           7
	//   36   77:invokevirtual   #165 <Method void ReentrantLock.unlock()>
		return ((Object) (callable));
	//   37   80:aload_1         
	//   38   81:areturn         
		long l = TimeUnit.MILLISECONDS.toNanos(i);
	//   39   82:getstatic       #171 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   40   85:iload_2         
	//   41   86:i2l             
	//   42   87:invokevirtual   #175 <Method long TimeUnit.toNanos(long)>
	//   43   90:lstore_3        
_L1:
		long l1 = cond.awaitNanos(l);
	//   44   91:aload           8
	//   45   93:lload_3         
	//   46   94:invokeinterface #180 <Method long Condition.awaitNanos(long)>
	//   47   99:lstore          5
		l = l1;
	//   48  101:lload           5
	//   49  103:lstore_3        
_L3:
		if(running.get())
			continue; /* Loop/switch isn't completed */
	//   50  104:aload           10
	//   51  106:invokevirtual   #159 <Method boolean AtomicBoolean.get()>
	//   52  109:ifne            125
		callable = ((Callable) (holder.get()));
	//   53  112:aload           9
	//   54  114:invokevirtual   #162 <Method Object AtomicReference.get()>
	//   55  117:astore_1        
		lock.unlock();
	//   56  118:aload           7
	//   57  120:invokevirtual   #165 <Method void ReentrantLock.unlock()>
		return ((Object) (callable));
	//   58  123:aload_1         
	//   59  124:areturn         
		if(l <= 0L) goto _L2; else goto _L1
	//   60  125:lload_3         
	//   61  126:lconst_0        
	//   62  127:lcmp            
	//   63  128:ifle            134
	//*  64  131:goto            91
_L2:
		throw new InterruptedException("timeout");
	//   65  134:new             #135 <Class InterruptedException>
	//   66  137:dup             
	//   67  138:ldc1            #182 <String "timeout">
	//   68  140:invokespecial   #185 <Method void InterruptedException(String)>
	//   69  143:athrow          
		callable;
	//   70  144:astore_1        
		lock.unlock();
	//   71  145:aload           7
	//   72  147:invokevirtual   #165 <Method void ReentrantLock.unlock()>
		throw callable;
	//   73  150:aload_1         
	//   74  151:athrow          
		callable;
	//   75  152:astore_1        
		  goto _L3
	//*  76  153:goto            104
	}

	private static final int MSG_DESTRUCTION = 0;
	private static final int MSG_INVOKE_RUNNABLE = 1;
	private android.os.Handler.Callback mCallback;
	private final int mDestructAfterMillisec;
	private int mGeneration;
	private Handler mHandler;
	private final Object mLock = new Object();
	private final int mPriority;
	private HandlerThread mThread;
	private final String mThreadName;
}
