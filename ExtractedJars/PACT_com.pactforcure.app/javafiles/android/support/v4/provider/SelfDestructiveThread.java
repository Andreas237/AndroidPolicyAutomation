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
			//   10   41:invokestatic    #36  <Method void SelfDestructiveThread.access$000(SelfDestructiveThread, Runnable)>
					return true;
			//   11   44:iconst_1        
			//   12   45:ireturn         

				case 0: // '\0'
					onDestruction();
			//   13   46:aload_0         
			//   14   47:getfield        #14  <Field SelfDestructiveThread this$0>
			//   15   50:invokestatic    #39  <Method void SelfDestructiveThread.access$100(SelfDestructiveThread)>
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

	private void onDestruction()
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
	//    6    8:getfield        #71  <Field Handler mHandler>
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #77  <Method boolean Handler.hasMessages(int)>
	//    9   15:ifeq            21
			}
	//   10   18:aload_1         
	//   11   19:monitorexit     
			return;
	//   12   20:return          
		}
		mThread.quit();
	//   13   21:aload_0         
	//   14   22:getfield        #79  <Field HandlerThread mThread>
	//   15   25:invokevirtual   #85  <Method boolean HandlerThread.quit()>
	//   16   28:pop             
		mThread = null;
	//   17   29:aload_0         
	//   18   30:aconst_null     
	//   19   31:putfield        #79  <Field HandlerThread mThread>
		mHandler = null;
	//   20   34:aload_0         
	//   21   35:aconst_null     
	//   22   36:putfield        #71  <Field Handler mHandler>
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

	private void onInvokeRunnable(Runnable runnable)
	{
		runnable.run();
	//    0    0:aload_1         
	//    1    1:invokeinterface #90  <Method void Runnable.run()>
		synchronized(mLock)
	//*   2    6:aload_0         
	//*   3    7:getfield        #45  <Field Object mLock>
	//*   4   10:astore_1        
	//*   5   11:aload_1         
	//*   6   12:monitorenter    
		{
			mHandler.removeMessages(0);
	//    7   13:aload_0         
	//    8   14:getfield        #71  <Field Handler mHandler>
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #94  <Method void Handler.removeMessages(int)>
			mHandler.sendMessageDelayed(mHandler.obtainMessage(0), mDestructAfterMillisec);
	//   11   21:aload_0         
	//   12   22:getfield        #71  <Field Handler mHandler>
	//   13   25:aload_0         
	//   14   26:getfield        #71  <Field Handler mHandler>
	//   15   29:iconst_0        
	//   16   30:invokevirtual   #98  <Method Message Handler.obtainMessage(int)>
	//   17   33:aload_0         
	//   18   34:getfield        #56  <Field int mDestructAfterMillisec>
	//   19   37:i2l             
	//   20   38:invokevirtual   #102 <Method boolean Handler.sendMessageDelayed(Message, long)>
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
	//*   6    8:getfield        #79  <Field HandlerThread mThread>
	//*   7   11:ifnonnull       72
			{
				mThread = new HandlerThread(mThreadName, mPriority);
	//    8   14:aload_0         
	//    9   15:new             #81  <Class HandlerThread>
	//   10   18:dup             
	//   11   19:aload_0         
	//   12   20:getfield        #52  <Field String mThreadName>
	//   13   23:aload_0         
	//   14   24:getfield        #54  <Field int mPriority>
	//   15   27:invokespecial   #106 <Method void HandlerThread(String, int)>
	//   16   30:putfield        #79  <Field HandlerThread mThread>
				mThread.start();
	//   17   33:aload_0         
	//   18   34:getfield        #79  <Field HandlerThread mThread>
	//   19   37:invokevirtual   #109 <Method void HandlerThread.start()>
				mHandler = new Handler(mThread.getLooper(), mCallback);
	//   20   40:aload_0         
	//   21   41:new             #73  <Class Handler>
	//   22   44:dup             
	//   23   45:aload_0         
	//   24   46:getfield        #79  <Field HandlerThread mThread>
	//   25   49:invokevirtual   #113 <Method android.os.Looper HandlerThread.getLooper()>
	//   26   52:aload_0         
	//   27   53:getfield        #50  <Field android.os.Handler$Callback mCallback>
	//   28   56:invokespecial   #116 <Method void Handler(android.os.Looper, android.os.Handler$Callback)>
	//   29   59:putfield        #71  <Field Handler mHandler>
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
	//   37   73:getfield        #71  <Field Handler mHandler>
	//   38   76:iconst_0        
	//   39   77:invokevirtual   #94  <Method void Handler.removeMessages(int)>
			mHandler.sendMessage(mHandler.obtainMessage(1, ((Object) (runnable))));
	//   40   80:aload_0         
	//   41   81:getfield        #71  <Field Handler mHandler>
	//   42   84:aload_0         
	//   43   85:getfield        #71  <Field Handler mHandler>
	//   44   88:iconst_1        
	//   45   89:aload_1         
	//   46   90:invokevirtual   #119 <Method Message Handler.obtainMessage(int, Object)>
	//   47   93:invokevirtual   #123 <Method boolean Handler.sendMessage(Message)>
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
	//*   6    8:getfield        #79  <Field HandlerThread mThread>
	//*   7   11:ifnull          25
			flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_1        
		else
	//*  10   16:aload_2         
	//*  11   17:monitorexit     
	//*  12   18:iload_1         
	//*  13   19:ireturn         
	//*  14   20:astore_3        
	//*  15   21:aload_2         
	//*  16   22:monitorexit     
	//*  17   23:aload_3         
	//*  18   24:athrow          
			flag = false;
	//   19   25:iconst_0        
	//   20   26:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  21   27:goto            16
	}

	public void postAndReply(final Callable callable, ReplyCallback replycallback)
	{
		post(new Runnable() {

			public void run()
			{
				Object obj;
				try
				{
					obj = callable.call();
			//    0    0:aload_0         
			//    1    1:getfield        #27  <Field Callable val$callable>
			//    2    4:invokeinterface #44  <Method Object Callable.call()>
			//    3    9:astore_1        
				}
			//*   4   10:aload_0         
			//*   5   11:getfield        #29  <Field Handler val$callingHandler>
			//*   6   14:new             #13  <Class SelfDestructiveThread$2$1>
			//*   7   17:dup             
			//*   8   18:aload_0         
			//*   9   19:aload_1         
			//*  10   20:invokespecial   #47  <Method void SelfDestructiveThread$2$1(SelfDestructiveThread$2, Object)>
			//*  11   23:invokevirtual   #53  <Method boolean Handler.post(Runnable)>
			//*  12   26:pop             
			//*  13   27:return          
				catch(Exception exception)
			//*  14   28:astore_1        
				{
					exception = null;
			//   15   29:aconst_null     
			//   16   30:astore_1        
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
			//*  17   31:goto            10
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
	//    7   11:invokespecial   #131 <Method void Handler()>
	//    8   14:aload_2         
	//    9   15:invokespecial   #134 <Method void SelfDestructiveThread$2(SelfDestructiveThread, Callable, Handler, SelfDestructiveThread$ReplyCallback)>
	//   10   18:invokespecial   #136 <Method void post(Runnable)>
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
	//    0    0:new             #144 <Class ReentrantLock>
	//    1    3:dup             
	//    2    4:invokespecial   #145 <Method void ReentrantLock()>
	//    3    7:astore          7
		cond = lock.newCondition();
	//    4    9:aload           7
	//    5   11:invokevirtual   #149 <Method Condition ReentrantLock.newCondition()>
	//    6   14:astore          8
		holder = new AtomicReference();
	//    7   16:new             #151 <Class AtomicReference>
	//    8   19:dup             
	//    9   20:invokespecial   #152 <Method void AtomicReference()>
	//   10   23:astore          9
		running = new AtomicBoolean(true);
	//   11   25:new             #154 <Class AtomicBoolean>
	//   12   28:dup             
	//   13   29:iconst_1        
	//   14   30:invokespecial   #157 <Method void AtomicBoolean(boolean)>
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
	//   25   50:invokespecial   #160 <Method void SelfDestructiveThread$3(SelfDestructiveThread, AtomicReference, Callable, ReentrantLock, AtomicBoolean, Condition)>
	//   26   53:invokespecial   #136 <Method void post(Runnable)>
		lock.lock();
	//   27   56:aload           7
	//   28   58:invokevirtual   #163 <Method void ReentrantLock.lock()>
		if(running.get())
			break MISSING_BLOCK_LABEL_82;
	//   29   61:aload           10
	//   30   63:invokevirtual   #166 <Method boolean AtomicBoolean.get()>
	//   31   66:ifne            82
		callable = ((Callable) (holder.get()));
	//   32   69:aload           9
	//   33   71:invokevirtual   #169 <Method Object AtomicReference.get()>
	//   34   74:astore_1        
		lock.unlock();
	//   35   75:aload           7
	//   36   77:invokevirtual   #172 <Method void ReentrantLock.unlock()>
		return ((Object) (callable));
	//   37   80:aload_1         
	//   38   81:areturn         
		long l = TimeUnit.MILLISECONDS.toNanos(i);
	//   39   82:getstatic       #178 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   40   85:iload_2         
	//   41   86:i2l             
	//   42   87:invokevirtual   #182 <Method long TimeUnit.toNanos(long)>
	//   43   90:lstore_3        
_L4:
		long l1;
		try
		{
			l1 = cond.awaitNanos(l);
	//   44   91:aload           8
	//   45   93:lload_3         
	//   46   94:invokeinterface #187 <Method long Condition.awaitNanos(long)>
	//   47   99:lstore          5
		}
	//*  48  101:aload           10
	//*  49  103:invokevirtual   #166 <Method boolean AtomicBoolean.get()>
	//*  50  106:ifne            122
	//*  51  109:aload           9
	//*  52  111:invokevirtual   #169 <Method Object AtomicReference.get()>
	//*  53  114:astore_1        
	//*  54  115:aload           7
	//*  55  117:invokevirtual   #172 <Method void ReentrantLock.unlock()>
	//*  56  120:aload_1         
	//*  57  121:areturn         
	//*  58  122:lload           5
	//*  59  124:lstore_3        
	//*  60  125:lload           5
	//*  61  127:lconst_0        
	//*  62  128:lcmp            
	//*  63  129:ifgt            91
	//*  64  132:new             #142 <Class InterruptedException>
	//*  65  135:dup             
	//*  66  136:ldc1            #189 <String "timeout">
	//*  67  138:invokespecial   #192 <Method void InterruptedException(String)>
	//*  68  141:athrow          
	//*  69  142:astore_1        
	//*  70  143:aload           7
	//*  71  145:invokevirtual   #172 <Method void ReentrantLock.unlock()>
	//*  72  148:aload_1         
	//*  73  149:athrow          
		// Misplaced declaration of an exception variable
		catch(final Callable callable)
	//*  74  150:astore_1        
		{
			l1 = l;
	//   75  151:lload_3         
	//   76  152:lstore          5
		}
		if(running.get()) goto _L2; else goto _L1
_L1:
		callable = ((Callable) (holder.get()));
		lock.unlock();
		return ((Object) (callable));
_L2:
		l = l1;
		if(l1 > 0L) goto _L4; else goto _L3
_L3:
		throw new InterruptedException("timeout");
		callable;
		lock.unlock();
		throw callable;
	//*  77  154:goto            101
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


/*
	static void access$000(SelfDestructiveThread selfdestructivethread, Runnable runnable)
	{
		selfdestructivethread.onInvokeRunnable(runnable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #65  <Method void onInvokeRunnable(Runnable)>
		return;
	//    3    5:return          
	}

*/


/*
	static void access$100(SelfDestructiveThread selfdestructivethread)
	{
		selfdestructivethread.onDestruction();
	//    0    0:aload_0         
	//    1    1:invokespecial   #69  <Method void onDestruction()>
		return;
	//    2    4:return          
	}

*/
}
