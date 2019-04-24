// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils.task;

import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;

// Referenced classes of package com.comscore.utils.task:
//			TaskExecutor, a

public class TaskThread extends Thread
{

	TaskThread(TaskExecutor taskexecutor)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Thread()>
		a = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean a>
		c = taskexecutor;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #19  <Field TaskExecutor c>
		b = new Object();
	//    8   14:aload_0         
	//    9   15:new             #21  <Class Object>
	//   10   18:dup             
	//   11   19:invokespecial   #22  <Method void Object()>
	//   12   22:putfield        #24  <Field Object b>
	//   13   25:return          
	}

	private void a(long l)
	{
		Object obj = b;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Object b>
	//    2    4:astore_3        
		obj;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Object obj1;
		try
		{
			b.wait(l);
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field Object b>
	//    7   11:lload_1         
	//    8   12:invokevirtual   #31  <Method void Object.wait(long)>
			break MISSING_BLOCK_LABEL_30;
	//    9   15:goto            30
		}
	//*  10   18:astore          4
	//*  11   20:goto            33
		// Misplaced declaration of an exception variable
		catch(Object obj1) { }
	//   12   23:astore          4
		break MISSING_BLOCK_LABEL_25;
		obj1;
		break MISSING_BLOCK_LABEL_33;
		ThrowableExtension.printStackTrace(((Throwable) (obj1)));
	//   13   25:aload           4
	//   14   27:invokestatic    #37  <Method void ThrowableExtension.printStackTrace(Throwable)>
		obj;
	//   15   30:aload_3         
		JVM INSTR monitorexit ;
	//   16   31:monitorexit     
		return;
	//   17   32:return          
		obj;
	//   18   33:aload_3         
		JVM INSTR monitorexit ;
	//   19   34:monitorexit     
		throw obj1;
	//   20   35:aload           4
	//   21   37:athrow          
	}

	boolean a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean a>
	//    2    4:ireturn         
	}

	void b()
	{
		a = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #17  <Field boolean a>
	//    3    5:return          
	}

	void c()
	{
		synchronized(b)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object b>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			b.notify();
	//    5    7:aload_0         
	//    6    8:getfield        #24  <Field Object b>
	//    7   11:invokevirtual   #41  <Method void Object.notify()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		obj;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	void d()
	{
		long l = c.a();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field TaskExecutor c>
	//    2    4:invokevirtual   #47  <Method long TaskExecutor.a()>
	//    3    7:lstore_1        
		if(l > 0L)
	//*   4    8:lload_1         
	//*   5    9:lconst_0        
	//*   6   10:lcmp            
	//*   7   11:ifle            19
			a(l);
	//    8   14:aload_0         
	//    9   15:lload_1         
	//   10   16:invokespecial   #49  <Method void a(long)>
	//   11   19:return          
	}

	public void run()
	{
		do
		{
			if(a())
				break;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #52  <Method boolean a()>
	//    2    4:ifne            72
			a a1 = c.b();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field TaskExecutor c>
	//    5   11:invokevirtual   #55  <Method a TaskExecutor.b()>
	//    6   14:astore_1        
			if(a1 != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          65
			{
				a1.run();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #59  <Method void a.run()>
				c.a(a1);
	//   11   23:aload_0         
	//   12   24:getfield        #19  <Field TaskExecutor c>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #62  <Method void TaskExecutor.a(a)>
				if(a1.g())
	//*  15   31:aload_1         
	//*  16   32:invokevirtual   #65  <Method boolean a.g()>
	//*  17   35:ifeq            0
					c.execute(a1.i(), a1.h(), a1.g(), a1.h());
	//   18   38:aload_0         
	//   19   39:getfield        #19  <Field TaskExecutor c>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #69  <Method Runnable a.i()>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #72  <Method long a.h()>
	//   24   50:aload_1         
	//   25   51:invokevirtual   #65  <Method boolean a.g()>
	//   26   54:aload_1         
	//   27   55:invokevirtual   #72  <Method long a.h()>
	//   28   58:invokevirtual   #76  <Method boolean TaskExecutor.execute(Runnable, long, boolean, long)>
	//   29   61:pop             
			} else
	//*  30   62:goto            0
			{
				d();
	//   31   65:aload_0         
	//   32   66:invokevirtual   #78  <Method void d()>
			}
		} while(true);
	//   33   69:goto            0
	//   34   72:return          
	}

	private boolean a;
	private Object b;
	private TaskExecutor c;
}
