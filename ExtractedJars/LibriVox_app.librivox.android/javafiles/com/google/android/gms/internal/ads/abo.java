// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abe, abf, wi

public class abo
	implements abe
{

	public abo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void Object()>
	//    6   12:putfield        #27  <Field Object a>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class abf>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void abf()>
	//   11   23:putfield        #32  <Field abf f>
	//   12   26:return          
	}

	private final boolean a()
	{
		return c != null || d;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Throwable c>
	//    2    4:ifnonnull       19
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field boolean d>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public final void a(Runnable runnable, Executor executor)
	{
		f.a(runnable, executor);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field abf f>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #42  <Method void abf.a(Runnable, Executor)>
	//    5    9:return          
	}

	public final void a(Throwable throwable)
	{
label0:
		{
			synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!e)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field boolean e>
	//    7   11:ifeq            17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		if(!a())
			break MISSING_BLOCK_LABEL_44;
	//   11   17:aload_0         
	//   12   18:invokespecial   #47  <Method boolean a()>
	//   13   21:ifeq            44
		aw.i().b(((Throwable) (new IllegalStateException("Provided SettableFuture with multiple values."))), "SettableFuture.setException");
	//   14   24:invokestatic    #53  <Method wi aw.i()>
	//   15   27:new             #55  <Class IllegalStateException>
	//   16   30:dup             
	//   17   31:ldc1            #57  <String "Provided SettableFuture with multiple values.">
	//   18   33:invokespecial   #60  <Method void IllegalStateException(String)>
	//   19   36:ldc1            #62  <String "SettableFuture.setException">
	//   20   38:invokevirtual   #67  <Method void wi.b(Throwable, String)>
		obj;
	//   21   41:aload_2         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		return;
	//   23   43:return          
		c = throwable;
	//   24   44:aload_0         
	//   25   45:aload_1         
	//   26   46:putfield        #36  <Field Throwable c>
		a.notifyAll();
	//   27   49:aload_0         
	//   28   50:getfield        #27  <Field Object a>
	//   29   53:invokevirtual   #70  <Method void Object.notifyAll()>
		f.a();
	//   30   56:aload_0         
	//   31   57:getfield        #32  <Field abf f>
	//   32   60:invokevirtual   #72  <Method void abf.a()>
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

	public final void b(Object obj)
	{
label0:
		{
			synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(!e)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field boolean e>
	//    7   11:ifeq            17
			}
	//    8   14:aload_2         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		if(!a())
			break MISSING_BLOCK_LABEL_44;
	//   11   17:aload_0         
	//   12   18:invokespecial   #47  <Method boolean a()>
	//   13   21:ifeq            44
		aw.i().b(((Throwable) (new IllegalStateException("Provided SettableFuture with multiple values."))), "SettableFuture.set");
	//   14   24:invokestatic    #53  <Method wi aw.i()>
	//   15   27:new             #55  <Class IllegalStateException>
	//   16   30:dup             
	//   17   31:ldc1            #57  <String "Provided SettableFuture with multiple values.">
	//   18   33:invokespecial   #60  <Method void IllegalStateException(String)>
	//   19   36:ldc1            #75  <String "SettableFuture.set">
	//   20   38:invokevirtual   #67  <Method void wi.b(Throwable, String)>
		obj1;
	//   21   41:aload_2         
		JVM INSTR monitorexit ;
	//   22   42:monitorexit     
		return;
	//   23   43:return          
		d = true;
	//   24   44:aload_0         
	//   25   45:iconst_1        
	//   26   46:putfield        #38  <Field boolean d>
		b = obj;
	//   27   49:aload_0         
	//   28   50:aload_1         
	//   29   51:putfield        #77  <Field Object b>
		a.notifyAll();
	//   30   54:aload_0         
	//   31   55:getfield        #27  <Field Object a>
	//   32   58:invokevirtual   #70  <Method void Object.notifyAll()>
		f.a();
	//   33   61:aload_0         
	//   34   62:getfield        #32  <Field abf f>
	//   35   65:invokevirtual   #72  <Method void abf.a()>
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
			synchronized(a)
	//*   4    6:aload_0         
	//*   5    7:getfield        #27  <Field Object a>
	//*   6   10:astore_2        
	//*   7   11:aload_2         
	//*   8   12:monitorenter    
			{
				if(!a())
					break label0;
	//    9   13:aload_0         
	//   10   14:invokespecial   #47  <Method boolean a()>
	//   11   17:ifeq            24
			}
	//   12   20:aload_2         
	//   13   21:monitorexit     
			return false;
	//   14   22:iconst_0        
	//   15   23:ireturn         
		}
		e = true;
	//   16   24:aload_0         
	//   17   25:iconst_1        
	//   18   26:putfield        #45  <Field boolean e>
		d = true;
	//   19   29:aload_0         
	//   20   30:iconst_1        
	//   21   31:putfield        #38  <Field boolean d>
		a.notifyAll();
	//   22   34:aload_0         
	//   23   35:getfield        #27  <Field Object a>
	//   24   38:invokevirtual   #70  <Method void Object.notifyAll()>
		f.a();
	//   25   41:aload_0         
	//   26   42:getfield        #32  <Field abf f>
	//   27   45:invokevirtual   #72  <Method void abf.a()>
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
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag = a();
	//    5    7:aload_0         
	//    6    8:invokespecial   #47  <Method boolean a()>
	//    7   11:istore_1        
		if(flag)
			break MISSING_BLOCK_LABEL_29;
	//    8   12:iload_1         
	//    9   13:ifne            29
		a.wait();
	//   10   16:aload_0         
	//   11   17:getfield        #27  <Field Object a>
	//   12   20:invokevirtual   #86  <Method void Object.wait()>
		break MISSING_BLOCK_LABEL_29;
	//   13   23:goto            29
		Object obj1;
		obj1;
	//   14   26:astore_3        
		throw obj1;
	//   15   27:aload_3         
	//   16   28:athrow          
		Object obj2;
		if(c != null)
			break MISSING_BLOCK_LABEL_62;
	//   17   29:aload_0         
	//   18   30:getfield        #36  <Field Throwable c>
	//   19   33:ifnonnull       62
		if(e)
			break MISSING_BLOCK_LABEL_52;
	//   20   36:aload_0         
	//   21   37:getfield        #45  <Field boolean e>
	//   22   40:ifne            52
		obj2 = b;
	//   23   43:aload_0         
	//   24   44:getfield        #77  <Field Object b>
	//   25   47:astore_3        
		obj;
	//   26   48:aload_2         
		JVM INSTR monitorexit ;
	//   27   49:monitorexit     
		return obj2;
	//   28   50:aload_3         
	//   29   51:areturn         
		throw new CancellationException("SettableFuture was cancelled.");
	//   30   52:new             #88  <Class CancellationException>
	//   31   55:dup             
	//   32   56:ldc1            #90  <String "SettableFuture was cancelled.">
	//   33   58:invokespecial   #91  <Method void CancellationException(String)>
	//   34   61:athrow          
		throw new ExecutionException(c);
	//   35   62:new             #93  <Class ExecutionException>
	//   36   65:dup             
	//   37   66:aload_0         
	//   38   67:getfield        #36  <Field Throwable c>
	//   39   70:invokespecial   #95  <Method void ExecutionException(Throwable)>
	//   40   73:athrow          
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
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Object a>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		boolean flag = a();
	//    5    9:aload_0         
	//    6   10:invokespecial   #47  <Method boolean a()>
	//    7   13:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_46;
	//    8   15:iload           4
	//    9   17:ifne            46
		l = timeunit.toMillis(l);
	//   10   20:aload_3         
	//   11   21:lload_1         
	//   12   22:invokevirtual   #102 <Method long TimeUnit.toMillis(long)>
	//   13   25:lstore_1        
		if(l == 0L)
			break MISSING_BLOCK_LABEL_46;
	//   14   26:lload_1         
	//   15   27:lconst_0        
	//   16   28:lcmp            
	//   17   29:ifeq            46
		try
		{
			a.wait(l);
	//   18   32:aload_0         
	//   19   33:getfield        #27  <Field Object a>
	//   20   36:lload_1         
	//   21   37:invokevirtual   #105 <Method void Object.wait(long)>
			break MISSING_BLOCK_LABEL_46;
	//   22   40:goto            46
		}
		// Misplaced declaration of an exception variable
		catch(TimeUnit timeunit) { }
	//   23   43:astore_3        
		throw timeunit;
	//   24   44:aload_3         
	//   25   45:athrow          
		if(c != null)
			break MISSING_BLOCK_LABEL_97;
	//   26   46:aload_0         
	//   27   47:getfield        #36  <Field Throwable c>
	//   28   50:ifnonnull       97
		if(!d)
			break MISSING_BLOCK_LABEL_87;
	//   29   53:aload_0         
	//   30   54:getfield        #38  <Field boolean d>
	//   31   57:ifeq            87
		if(e)
			break MISSING_BLOCK_LABEL_77;
	//   32   60:aload_0         
	//   33   61:getfield        #45  <Field boolean e>
	//   34   64:ifne            77
		timeunit = ((TimeUnit) (b));
	//   35   67:aload_0         
	//   36   68:getfield        #77  <Field Object b>
	//   37   71:astore_3        
		obj;
	//   38   72:aload           5
		JVM INSTR monitorexit ;
	//   39   74:monitorexit     
		return ((Object) (timeunit));
	//   40   75:aload_3         
	//   41   76:areturn         
		throw new CancellationException("SettableFuture was cancelled.");
	//   42   77:new             #88  <Class CancellationException>
	//   43   80:dup             
	//   44   81:ldc1            #90  <String "SettableFuture was cancelled.">
	//   45   83:invokespecial   #91  <Method void CancellationException(String)>
	//   46   86:athrow          
		throw new TimeoutException("SettableFuture timed out.");
	//   47   87:new             #107 <Class TimeoutException>
	//   48   90:dup             
	//   49   91:ldc1            #109 <String "SettableFuture timed out.">
	//   50   93:invokespecial   #110 <Method void TimeoutException(String)>
	//   51   96:athrow          
		throw new ExecutionException(c);
	//   52   97:new             #93  <Class ExecutionException>
	//   53  100:dup             
	//   54  101:aload_0         
	//   55  102:getfield        #36  <Field Throwable c>
	//   56  105:invokespecial   #95  <Method void ExecutionException(Throwable)>
	//   57  108:athrow          
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
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = e;
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field boolean e>
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
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = a();
	//    5    7:aload_0         
	//    6    8:invokespecial   #47  <Method boolean a()>
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

	private final Object a = new Object();
	private Object b;
	private Throwable c;
	private boolean d;
	private boolean e;
	private final abf f = new abf();
}
