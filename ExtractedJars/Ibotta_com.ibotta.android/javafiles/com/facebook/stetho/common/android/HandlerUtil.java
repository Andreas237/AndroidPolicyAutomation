// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.common.android;

import android.os.Handler;
import android.os.Looper;
import com.facebook.stetho.common.UncheckedCallable;
import com.facebook.stetho.common.Util;

public final class HandlerUtil
{
	private static abstract class WaitableRunnable
		implements Runnable
	{

		private void join()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
_L3:
			boolean flag = mIsDone;
		//    2    2:aload_0         
		//    3    3:getfield        #27  <Field boolean mIsDone>
		//    4    6:istore_1        
			if(flag) goto _L2; else goto _L1
		//    5    7:iload_1         
		//    6    8:ifne            18
_L1:
			Exception exception;
			try
			{
				((Object)this).wait();
		//    7   11:aload_0         
		//    8   12:invokevirtual   #30  <Method void Object.wait()>
			}
		//*   9   15:goto            2
		//*  10   18:aload_0         
		//*  11   19:monitorexit     
		//*  12   20:return          
		//*  13   21:astore_2        
		//*  14   22:aload_0         
		//*  15   23:monitorexit     
		//*  16   24:aload_2         
		//*  17   25:athrow          
			catch(InterruptedException interruptedexception) { }
		//   18   26:astore_2        
			if(true) goto _L3; else goto _L2
		//   19   27:goto            2
_L2:
			this;
			JVM INSTR monitorexit ;
			return;
			exception;
			this;
			JVM INSTR monitorexit ;
			throw exception;
		}

		public Object invoke(Handler handler)
		{
			if(handler.post(((Runnable) (this))))
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:invokevirtual   #38  <Method boolean Handler.post(Runnable)>
		//*   3    5:ifeq            35
			{
				join();
		//    4    8:aload_0         
		//    5    9:invokespecial   #40  <Method void join()>
				handler = ((Handler) (mException));
		//    6   12:aload_0         
		//    7   13:getfield        #42  <Field Exception mException>
		//    8   16:astore_1        
				if(handler == null)
		//*   9   17:aload_1         
		//*  10   18:ifnonnull       26
					return mValue;
		//   11   21:aload_0         
		//   12   22:getfield        #44  <Field Object mValue>
		//   13   25:areturn         
				else
					throw new RuntimeException(((Throwable) (handler)));
		//   14   26:new             #46  <Class RuntimeException>
		//   15   29:dup             
		//   16   30:aload_1         
		//   17   31:invokespecial   #49  <Method void RuntimeException(Throwable)>
		//   18   34:athrow          
			} else
			{
				throw new RuntimeException("Handler.post() returned false");
		//   19   35:new             #46  <Class RuntimeException>
		//   20   38:dup             
		//   21   39:ldc1            #51  <String "Handler.post() returned false">
		//   22   41:invokespecial   #54  <Method void RuntimeException(String)>
		//   23   44:athrow          
			}
		}

		protected abstract Object onRun();

		public final void run()
		{
			mValue = onRun();
		//    0    0:aload_0         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #63  <Method Object onRun()>
		//    3    5:putfield        #44  <Field Object mValue>
			mException = null;
		//    4    8:aload_0         
		//    5    9:aconst_null     
		//    6   10:putfield        #42  <Field Exception mException>
			this;
		//    7   13:aload_0         
			JVM INSTR monitorenter ;
		//    8   14:monitorenter    
			mIsDone = true;
		//    9   15:aload_0         
		//   10   16:iconst_1        
		//   11   17:putfield        #27  <Field boolean mIsDone>
			((Object)this).notifyAll();
		//   12   20:aload_0         
		//   13   21:invokevirtual   #66  <Method void Object.notifyAll()>
			this;
		//   14   24:aload_0         
			JVM INSTR monitorexit ;
		//   15   25:monitorexit     
			return;
		//   16   26:return          
			Object obj;
			obj;
		//   17   27:astore_1        
			this;
		//   18   28:aload_0         
			JVM INSTR monitorexit ;
		//   19   29:monitorexit     
			throw obj;
		//   20   30:aload_1         
		//   21   31:athrow          
			obj;
		//   22   32:astore_1        
			break MISSING_BLOCK_LABEL_66;
		//   23   33:goto            66
			obj;
		//   24   36:astore_1        
			mValue = null;
		//   25   37:aload_0         
		//   26   38:aconst_null     
		//   27   39:putfield        #44  <Field Object mValue>
			mException = ((Exception) (obj));
		//   28   42:aload_0         
		//   29   43:aload_1         
		//   30   44:putfield        #42  <Field Exception mException>
			this;
		//   31   47:aload_0         
			JVM INSTR monitorenter ;
		//   32   48:monitorenter    
			mIsDone = true;
		//   33   49:aload_0         
		//   34   50:iconst_1        
		//   35   51:putfield        #27  <Field boolean mIsDone>
			((Object)this).notifyAll();
		//   36   54:aload_0         
		//   37   55:invokevirtual   #66  <Method void Object.notifyAll()>
			this;
		//   38   58:aload_0         
			JVM INSTR monitorexit ;
		//   39   59:monitorexit     
			return;
		//   40   60:return          
			obj;
		//   41   61:astore_1        
			this;
		//   42   62:aload_0         
			JVM INSTR monitorexit ;
		//   43   63:monitorexit     
			throw obj;
		//   44   64:aload_1         
		//   45   65:athrow          
			this;
		//   46   66:aload_0         
			JVM INSTR monitorenter ;
		//   47   67:monitorenter    
			mIsDone = true;
		//   48   68:aload_0         
		//   49   69:iconst_1        
		//   50   70:putfield        #27  <Field boolean mIsDone>
			((Object)this).notifyAll();
		//   51   73:aload_0         
		//   52   74:invokevirtual   #66  <Method void Object.notifyAll()>
			this;
		//   53   77:aload_0         
			JVM INSTR monitorexit ;
		//   54   78:monitorexit     
			throw obj;
		//   55   79:aload_1         
		//   56   80:athrow          
			obj;
		//   57   81:astore_1        
			this;
		//   58   82:aload_0         
			JVM INSTR monitorexit ;
		//   59   83:monitorexit     
			throw obj;
		//   60   84:aload_1         
		//   61   85:athrow          
		}

		private Exception mException;
		private boolean mIsDone;
		private Object mValue;

		protected WaitableRunnable()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Object()>
		//    2    4:return          
		}
	}


	private HandlerUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static boolean checkThreadAccess(Handler handler)
	{
		return Looper.myLooper() == handler.getLooper();
	//    0    0:invokestatic    #24  <Method Looper Looper.myLooper()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #29  <Method Looper Handler.getLooper()>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static Object postAndWait(Handler handler, UncheckedCallable uncheckedcallable)
	{
		if(checkThreadAccess(handler))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #35  <Method boolean checkThreadAccess(Handler)>
	//*   2    4:ifeq            26
		{
			try
			{
				handler = ((Handler) (uncheckedcallable.call()));
	//    3    7:aload_1         
	//    4    8:invokeinterface #41  <Method Object UncheckedCallable.call()>
	//    5   13:astore_0        
			}
	//*   6   14:aload_0         
	//*   7   15:areturn         
			// Misplaced declaration of an exception variable
			catch(Handler handler)
	//*   8   16:astore_0        
			{
				throw new RuntimeException(((Throwable) (handler)));
	//    9   17:new             #43  <Class RuntimeException>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #46  <Method void RuntimeException(Throwable)>
	//   13   25:athrow          
			}
			return ((Object) (handler));
		} else
		{
			return ((WaitableRunnable) (new WaitableRunnable(uncheckedcallable) {

				protected Object onRun()
				{
					return c.call();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field UncheckedCallable val$c>
				//    2    4:invokeinterface #27  <Method Object UncheckedCallable.call()>
				//    3    9:areturn         
				}

				final UncheckedCallable val$c;

			
			{
				c = uncheckedcallable;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field UncheckedCallable val$c>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HandlerUtil$WaitableRunnable()>
			//    5    9:return          
			}
			}
)).invoke(handler);
	//   14   26:new             #6   <Class HandlerUtil$1>
	//   15   29:dup             
	//   16   30:aload_1         
	//   17   31:invokespecial   #49  <Method void HandlerUtil$1(UncheckedCallable)>
	//   18   34:aload_0         
	//   19   35:invokevirtual   #53  <Method Object HandlerUtil$WaitableRunnable.invoke(Handler)>
	//   20   38:areturn         
		}
	}

	public static void postAndWait(Handler handler, Runnable runnable)
	{
		if(checkThreadAccess(handler))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #35  <Method boolean checkThreadAccess(Handler)>
	//*   2    4:ifeq            24
		{
			try
			{
				runnable.run();
	//    3    7:aload_1         
	//    4    8:invokeinterface #61  <Method void Runnable.run()>
				return;
	//    5   13:return          
			}
			// Misplaced declaration of an exception variable
			catch(Handler handler)
	//*   6   14:astore_0        
			{
				throw new RuntimeException(((Throwable) (handler)));
	//    7   15:new             #43  <Class RuntimeException>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #46  <Method void RuntimeException(Throwable)>
	//   11   23:athrow          
			}
		} else
		{
			((WaitableRunnable) (new WaitableRunnable(runnable) {

				protected volatile Object onRun()
				{
					return ((Object) (onRun()));
				//    0    0:aload_0         
				//    1    1:invokevirtual   #25  <Method Void onRun()>
				//    2    4:areturn         
				}

				protected Void onRun()
				{
					r.run();
				//    0    0:aload_0         
				//    1    1:getfield        #16  <Field Runnable val$r>
				//    2    4:invokeinterface #30  <Method void Runnable.run()>
					return null;
				//    3    9:aconst_null     
				//    4   10:areturn         
				}

				final Runnable val$r;

			
			{
				r = runnable;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field Runnable val$r>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HandlerUtil$WaitableRunnable()>
			//    5    9:return          
			}
			}
)).invoke(handler);
	//   12   24:new             #8   <Class HandlerUtil$2>
	//   13   27:dup             
	//   14   28:aload_1         
	//   15   29:invokespecial   #64  <Method void HandlerUtil$2(Runnable)>
	//   16   32:aload_0         
	//   17   33:invokevirtual   #53  <Method Object HandlerUtil$WaitableRunnable.invoke(Handler)>
	//   18   36:pop             
			return;
	//   19   37:return          
		}
	}

	public static void verifyThreadAccess(Handler handler)
	{
		Util.throwIfNot(checkThreadAccess(handler));
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method boolean checkThreadAccess(Handler)>
	//    2    4:invokestatic    #72  <Method void Util.throwIfNot(boolean)>
	//    3    7:return          
	}
}
