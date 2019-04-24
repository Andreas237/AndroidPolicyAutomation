// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzanz, zzaoa, zzajm

public class zzaoj
	implements zzanz
{

	public zzaoj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void Object()>
	//    6   12:putfield        #28  <Field Object mLock>
	//    7   15:aload_0         
	//    8   16:new             #30  <Class zzaoa>
	//    9   19:dup             
	//   10   20:invokespecial   #31  <Method void zzaoa()>
	//   11   23:putfield        #33  <Field zzaoa zzcwh>
	//   12   26:return          
	}

	private final boolean zzso()
	{
		return zzcwf != null || zzcwg;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Throwable zzcwf>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #40  <Field boolean zzcwg>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public boolean cancel(boolean flag)
	{
label0:
		{
			if(!flag)
	//*   0    0:iload_1         
	//*   1    1:ifne            6
				return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
			synchronized(mLock)
	//*   4    6:aload_0         
	//*   5    7:getfield        #28  <Field Object mLock>
	//*   6   10:astore_2        
	//*   7   11:aload_2         
	//*   8   12:monitorenter    
			{
				if(!zzso())
					break label0;
	//    9   13:aload_0         
	//   10   14:invokespecial   #45  <Method boolean zzso()>
	//   11   17:ifeq            24
			}
	//   12   20:aload_2         
	//   13   21:monitorexit     
			return false;
	//   14   22:iconst_0        
	//   15   23:ireturn         
		}
		zzbuf = true;
	//   16   24:aload_0         
	//   17   25:iconst_1        
	//   18   26:putfield        #47  <Field boolean zzbuf>
		zzcwg = true;
	//   19   29:aload_0         
	//   20   30:iconst_1        
	//   21   31:putfield        #40  <Field boolean zzcwg>
		mLock.notifyAll();
	//   22   34:aload_0         
	//   23   35:getfield        #28  <Field Object mLock>
	//   24   38:invokevirtual   #50  <Method void Object.notifyAll()>
		zzcwh.zzsm();
	//   25   41:aload_0         
	//   26   42:getfield        #33  <Field zzaoa zzcwh>
	//   27   45:invokevirtual   #53  <Method void zzaoa.zzsm()>
		obj;
	//   28   48:aload_2         
		JVM INSTR monitorexit ;
	//   29   49:monitorexit     
		return true;
	//   30   50:iconst_1        
	//   31   51:ireturn         
		exception;
	//   32   52:astore_3        
		obj;
	//   33   53:aload_2         
		JVM INSTR monitorexit ;
	//   34   54:monitorexit     
		throw exception;
	//   35   55:aload_3         
	//   36   56:athrow          
	}

	public Object get()
		throws CancellationException, ExecutionException, InterruptedException
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag = zzso();
	//    5    7:aload_0         
	//    6    8:invokespecial   #45  <Method boolean zzso()>
	//    7   11:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_29;
	//    8   12:iload_1         
	//    9   13:ifne            29
		mLock.wait();
	//   10   16:aload_0         
	//   11   17:getfield        #28  <Field Object mLock>
	//   12   20:invokevirtual   #64  <Method void Object.wait()>
		break MISSING_BLOCK_LABEL_29;
	//   13   23:goto            29
		Object obj1;
		obj1;
	//   14   26:astore_3        
		throw obj1;
	//   15   27:aload_3         
	//   16   28:athrow          
		Object obj2;
		if(zzcwf != null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #38  <Field Throwable zzcwf>
	//*  19   33:ifnull          48
			throw new ExecutionException(zzcwf);
	//   20   36:new             #59  <Class ExecutionException>
	//   21   39:dup             
	//   22   40:aload_0         
	//   23   41:getfield        #38  <Field Throwable zzcwf>
	//   24   44:invokespecial   #67  <Method void ExecutionException(Throwable)>
	//   25   47:athrow          
		if(zzbuf)
	//*  26   48:aload_0         
	//*  27   49:getfield        #47  <Field boolean zzbuf>
	//*  28   52:ifeq            65
			throw new CancellationException("SettableFuture was cancelled.");
	//   29   55:new             #57  <Class CancellationException>
	//   30   58:dup             
	//   31   59:ldc1            #69  <String "SettableFuture was cancelled.">
	//   32   61:invokespecial   #72  <Method void CancellationException(String)>
	//   33   64:athrow          
		obj2 = mValue;
	//   34   65:aload_0         
	//   35   66:getfield        #74  <Field Object mValue>
	//   36   69:astore_3        
		obj;
	//   37   70:aload_2         
		JVM INSTR monitorexit ;
	//   38   71:monitorexit     
		return obj2;
	//   39   72:aload_3         
	//   40   73:areturn         
		obj2;
	//   41   74:astore_3        
		obj;
	//   42   75:aload_2         
		JVM INSTR monitorexit ;
	//   43   76:monitorexit     
		throw obj2;
	//   44   77:aload_3         
	//   45   78:athrow          
	}

	public Object get(long l, TimeUnit timeunit)
		throws CancellationException, ExecutionException, InterruptedException, TimeoutException
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Object mLock>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		boolean flag = zzso();
	//    5    9:aload_0         
	//    6   10:invokespecial   #45  <Method boolean zzso()>
	//    7   13:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_46;
	//    8   15:iload           4
	//    9   17:ifne            46
		l = timeunit.toMillis(l);
	//   10   20:aload_3         
	//   11   21:lload_1         
	//   12   22:invokevirtual   #86  <Method long TimeUnit.toMillis(long)>
	//   13   25:lstore_1        
		if(l == 0L)
			break MISSING_BLOCK_LABEL_46;
	//   14   26:lload_1         
	//   15   27:lconst_0        
	//   16   28:lcmp            
	//   17   29:ifeq            46
		try
		{
			mLock.wait(l);
	//   18   32:aload_0         
	//   19   33:getfield        #28  <Field Object mLock>
	//   20   36:lload_1         
	//   21   37:invokevirtual   #89  <Method void Object.wait(long)>
			break MISSING_BLOCK_LABEL_46;
	//   22   40:goto            46
		}
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit) { }
	//   23   43:astore_3        
		throw timeunit;
	//   24   44:aload_3         
	//   25   45:athrow          
		if(zzcwf != null)
	//*  26   46:aload_0         
	//*  27   47:getfield        #38  <Field Throwable zzcwf>
	//*  28   50:ifnull          65
			throw new ExecutionException(zzcwf);
	//   29   53:new             #59  <Class ExecutionException>
	//   30   56:dup             
	//   31   57:aload_0         
	//   32   58:getfield        #38  <Field Throwable zzcwf>
	//   33   61:invokespecial   #67  <Method void ExecutionException(Throwable)>
	//   34   64:athrow          
		if(!zzcwg)
	//*  35   65:aload_0         
	//*  36   66:getfield        #40  <Field boolean zzcwg>
	//*  37   69:ifne            82
			throw new TimeoutException("SettableFuture timed out.");
	//   38   72:new             #80  <Class TimeoutException>
	//   39   75:dup             
	//   40   76:ldc1            #91  <String "SettableFuture timed out.">
	//   41   78:invokespecial   #92  <Method void TimeoutException(String)>
	//   42   81:athrow          
		if(zzbuf)
	//*  43   82:aload_0         
	//*  44   83:getfield        #47  <Field boolean zzbuf>
	//*  45   86:ifeq            99
			throw new CancellationException("SettableFuture was cancelled.");
	//   46   89:new             #57  <Class CancellationException>
	//   47   92:dup             
	//   48   93:ldc1            #69  <String "SettableFuture was cancelled.">
	//   49   95:invokespecial   #72  <Method void CancellationException(String)>
	//   50   98:athrow          
		timeunit = ((TimeUnit) (mValue));
	//   51   99:aload_0         
	//   52  100:getfield        #74  <Field Object mValue>
	//   53  103:astore_3        
		obj;
	//   54  104:aload           5
		JVM INSTR monitorexit ;
	//   55  106:monitorexit     
		return ((Object) (timeunit));
	//   56  107:aload_3         
	//   57  108:areturn         
		timeunit;
	//   58  109:astore_3        
		obj;
	//   59  110:aload           5
		JVM INSTR monitorexit ;
	//   60  112:monitorexit     
		throw timeunit;
	//   61  113:aload_3         
	//   62  114:athrow          
	}

	public boolean isCancelled()
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzbuf;
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field boolean zzbuf>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
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

	public boolean isDone()
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzso();
	//    5    7:aload_0         
	//    6    8:invokespecial   #45  <Method boolean zzso()>
	//    7   11:istore_1        
		}
	//    8   12:aload_2         
	//    9   13:monitorexit     
		return flag;
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

	public final void set(Object obj)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!zzbuf)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field boolean zzbuf>
	//    7   11:ifeq            17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		if(!zzso())
			break MISSING_BLOCK_LABEL_44;
	//   11   17:aload_0         
	//   12   18:invokespecial   #45  <Method boolean zzso()>
	//   13   21:ifeq            44
		zzbv.zzeo().zzb(((Throwable) (new IllegalStateException("Provided SettableFuture with multiple values."))), "SettableFuture.set");
	//   14   24:invokestatic    #104 <Method zzajm zzbv.zzeo()>
	//   15   27:new             #106 <Class IllegalStateException>
	//   16   30:dup             
	//   17   31:ldc1            #108 <String "Provided SettableFuture with multiple values.">
	//   18   33:invokespecial   #109 <Method void IllegalStateException(String)>
	//   19   36:ldc1            #111 <String "SettableFuture.set">
	//   20   38:invokevirtual   #117 <Method void zzajm.zzb(Throwable, String)>
		obj1;
	//   21   41:aload_2         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		return;
	//   23   43:return          
		zzcwg = true;
	//   24   44:aload_0         
	//   25   45:iconst_1        
	//   26   46:putfield        #40  <Field boolean zzcwg>
		mValue = obj;
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:putfield        #74  <Field Object mValue>
		mLock.notifyAll();
	//   30   54:aload_0         
	//   31   55:getfield        #28  <Field Object mLock>
	//   32   58:invokevirtual   #50  <Method void Object.notifyAll()>
		zzcwh.zzsm();
	//   33   61:aload_0         
	//   34   62:getfield        #33  <Field zzaoa zzcwh>
	//   35   65:invokevirtual   #53  <Method void zzaoa.zzsm()>
		obj1;
	//   36   68:aload_2         
		JVM INSTR monitorexit ;
	//   37   69:monitorexit     
		return;
	//   38   70:return          
		obj;
	//   39   71:astore_1        
		obj1;
	//   40   72:aload_2         
		JVM INSTR monitorexit ;
	//   41   73:monitorexit     
		throw obj;
	//   42   74:aload_1         
	//   43   75:athrow          
	}

	public final void setException(Throwable throwable)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!zzbuf)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field boolean zzbuf>
	//    7   11:ifeq            17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		if(!zzso())
			break MISSING_BLOCK_LABEL_44;
	//   11   17:aload_0         
	//   12   18:invokespecial   #45  <Method boolean zzso()>
	//   13   21:ifeq            44
		zzbv.zzeo().zzb(((Throwable) (new IllegalStateException("Provided SettableFuture with multiple values."))), "SettableFuture.setException");
	//   14   24:invokestatic    #104 <Method zzajm zzbv.zzeo()>
	//   15   27:new             #106 <Class IllegalStateException>
	//   16   30:dup             
	//   17   31:ldc1            #108 <String "Provided SettableFuture with multiple values.">
	//   18   33:invokespecial   #109 <Method void IllegalStateException(String)>
	//   19   36:ldc1            #122 <String "SettableFuture.setException">
	//   20   38:invokevirtual   #117 <Method void zzajm.zzb(Throwable, String)>
		obj;
	//   21   41:aload_2         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		return;
	//   23   43:return          
		zzcwf = throwable;
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:putfield        #38  <Field Throwable zzcwf>
		mLock.notifyAll();
	//   27   49:aload_0         
	//   28   50:getfield        #28  <Field Object mLock>
	//   29   53:invokevirtual   #50  <Method void Object.notifyAll()>
		zzcwh.zzsm();
	//   30   56:aload_0         
	//   31   57:getfield        #33  <Field zzaoa zzcwh>
	//   32   60:invokevirtual   #53  <Method void zzaoa.zzsm()>
		obj;
	//   33   63:aload_2         
		JVM INSTR monitorexit ;
	//   34   64:monitorexit     
		return;
	//   35   65:return          
		throwable;
	//   36   66:astore_1        
		obj;
	//   37   67:aload_2         
		JVM INSTR monitorexit ;
	//   38   68:monitorexit     
		throw throwable;
	//   39   69:aload_1         
	//   40   70:athrow          
	}

	public final void zza(Runnable runnable, Executor executor)
	{
		zzcwh.zza(runnable, executor);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field zzaoa zzcwh>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #126 <Method void zzaoa.zza(Runnable, Executor)>
	//    5    9:return          
	}

	private final Object mLock = new Object();
	private Object mValue;
	private boolean zzbuf;
	private Throwable zzcwf;
	private boolean zzcwg;
	private final zzaoa zzcwh = new zzaoa();
}
