// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils.task;

import com.comscore.analytics.Core;
import com.comscore.utils.CSLog;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.comscore.utils.task:
//			TaskThread, a

public class TaskExecutor
{

	public TaskExecutor(Core core)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		a = core;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Core a>
		d = ((BlockingQueue) (new LinkedBlockingQueue()));
	//    5    9:aload_0         
	//    6   10:new             #24  <Class LinkedBlockingQueue>
	//    7   13:dup             
	//    8   14:invokespecial   #25  <Method void LinkedBlockingQueue()>
	//    9   17:putfield        #27  <Field BlockingQueue d>
		c = new TaskThread(this);
	//   10   20:aload_0         
	//   11   21:new             #29  <Class TaskThread>
	//   12   24:dup             
	//   13   25:aload_0         
	//   14   26:invokespecial   #32  <Method void TaskThread(TaskExecutor)>
	//   15   29:putfield        #34  <Field TaskThread c>
		c.start();
	//   16   32:aload_0         
	//   17   33:getfield        #34  <Field TaskThread c>
	//   18   36:invokevirtual   #37  <Method void TaskThread.start()>
	//   19   39:return          
	}

	long a()
	{
		Iterator iterator = d.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BlockingQueue d>
	//    2    4:invokeinterface #45  <Method Iterator BlockingQueue.iterator()>
	//    3    9:astore_3        
		long l;
		for(l = 50000L; iterator.hasNext(); l = Math.min(l, ((a)iterator.next()).a()));
	//    4   10:ldc2w           #7   <Long 50000L>
	//    5   13:lstore_1        
	//    6   14:aload_3         
	//    7   15:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            43
	//    9   23:lload_1         
	//   10   24:aload_3         
	//   11   25:invokeinterface #55  <Method Object Iterator.next()>
	//   12   30:checkcast       #57  <Class a>
	//   13   33:invokevirtual   #59  <Method long a.a()>
	//   14   36:invokestatic    #65  <Method long Math.min(long, long)>
	//   15   39:lstore_1        
	//*  16   40:goto            14
		return l;
	//   17   43:lload_1         
	//   18   44:lreturn         
	}

	void a(a a1)
	{
		d.remove(((Object) (a1)));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BlockingQueue d>
	//    2    4:aload_1         
	//    3    5:invokeinterface #70  <Method boolean BlockingQueue.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	a b()
	{
		for(Iterator iterator = d.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field BlockingQueue d>
	//*   2    4:invokeinterface #45  <Method Iterator BlockingQueue.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
		{
			a a1 = (a)iterator.next();
	//    7   19:aload_1         
	//    8   20:invokeinterface #55  <Method Object Iterator.next()>
	//    9   25:checkcast       #57  <Class a>
	//   10   28:astore_2        
			if(a1.f() <= System.currentTimeMillis())
	//*  11   29:aload_2         
	//*  12   30:invokevirtual   #74  <Method long a.f()>
	//*  13   33:invokestatic    #79  <Method long System.currentTimeMillis()>
	//*  14   36:lcmp            
	//*  15   37:ifgt            10
				return a1;
	//   16   40:aload_2         
	//   17   41:areturn         
		}

		return null;
	//   18   42:aconst_null     
	//   19   43:areturn         
	}

	public boolean containsTask(Runnable runnable)
	{
		for(Iterator iterator = d.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field BlockingQueue d>
	//*   2    4:invokeinterface #45  <Method Iterator BlockingQueue.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            51
		{
			a a1 = (a)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #55  <Method Object Iterator.next()>
	//    9   25:checkcast       #57  <Class a>
	//   10   28:astore_3        
			if(a1.i() == runnable || (runnable instanceof a) && a1 == runnable)
	//*  11   29:aload_3         
	//*  12   30:invokevirtual   #85  <Method Runnable a.i()>
	//*  13   33:aload_1         
	//*  14   34:if_acmpeq       49
	//*  15   37:aload_1         
	//*  16   38:instanceof      #57  <Class a>
	//*  17   41:ifeq            10
	//*  18   44:aload_3         
	//*  19   45:aload_1         
	//*  20   46:if_acmpne       10
				return true;
	//   21   49:iconst_1        
	//   22   50:ireturn         
		}

		return false;
	//   23   51:iconst_0        
	//   24   52:ireturn         
	}

	public boolean execute(Runnable runnable, long l)
	{
		return execute(runnable, l, false, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:iconst_0        
	//    4    4:lconst_0        
	//    5    5:invokevirtual   #90  <Method boolean execute(Runnable, long, boolean, long)>
	//    6    8:ireturn         
	}

	public boolean execute(Runnable runnable, long l, boolean flag, long l1)
	{
		for(Iterator iterator = d.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field BlockingQueue d>
	//*   2    4:invokeinterface #45  <Method Iterator BlockingQueue.iterator()>
	//*   3    9:astore          7
	//*   4   11:aload           7
	//*   5   13:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            52
		{
			a a1 = (a)iterator.next();
	//    7   21:aload           7
	//    8   23:invokeinterface #55  <Method Object Iterator.next()>
	//    9   28:checkcast       #57  <Class a>
	//   10   31:astore          8
			if(a1 != null && a1.i() == runnable)
	//*  11   33:aload           8
	//*  12   35:ifnull          49
	//*  13   38:aload           8
	//*  14   40:invokevirtual   #85  <Method Runnable a.i()>
	//*  15   43:aload_1         
	//*  16   44:if_acmpne       11
				return false;
	//   17   47:iconst_0        
	//   18   48:ireturn         
		}

	//*  19   49:goto            11
		d.add(((Object) (new a(runnable, a, l, flag, l1))));
	//   20   52:aload_0         
	//   21   53:getfield        #27  <Field BlockingQueue d>
	//   22   56:new             #57  <Class a>
	//   23   59:dup             
	//   24   60:aload_1         
	//   25   61:aload_0         
	//   26   62:getfield        #22  <Field Core a>
	//   27   65:lload_2         
	//   28   66:iload           4
	//   29   68:lload           5
	//   30   70:invokespecial   #93  <Method void a(Runnable, Core, long, boolean, long)>
	//   31   73:invokeinterface #96  <Method boolean BlockingQueue.add(Object)>
	//   32   78:pop             
		c.c();
	//   33   79:aload_0         
	//   34   80:getfield        #34  <Field TaskThread c>
	//   35   83:invokevirtual   #98  <Method void TaskThread.c()>
		return true;
	//   36   86:iconst_1        
	//   37   87:ireturn         
	}

	public boolean execute(Runnable runnable, boolean flag)
	{
		if(!a.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Core a>
	//*   2    4:invokevirtual   #106 <Method boolean Core.isEnabled()>
	//*   3    7:ifne            12
			return false;
	//    4   10:iconst_0        
	//    5   11:ireturn         
		if(!flag)
	//*   6   12:iload_2         
	//*   7   13:ifne            40
		{
			try
			{
				runnable.run();
	//    8   16:aload_1         
	//    9   17:invokeinterface #111 <Method void Runnable.run()>
			}
	//*  10   22:iconst_1        
	//*  11   23:ireturn         
			// Misplaced declaration of an exception variable
			catch(Runnable runnable)
	//*  12   24:astore_1        
			{
				CSLog.e(((Object)this).getClass(), "Unexpected error: ");
	//   13   25:aload_0         
	//   14   26:invokevirtual   #115 <Method Class Object.getClass()>
	//   15   29:ldc1            #117 <String "Unexpected error: ">
	//   16   31:invokestatic    #123 <Method void CSLog.e(Class, String)>
				CSLog.printStackTrace(((Exception) (runnable)));
	//   17   34:aload_1         
	//   18   35:invokestatic    #127 <Method void CSLog.printStackTrace(Exception)>
				return true;
	//   19   38:iconst_1        
	//   20   39:ireturn         
			}
			return true;
		} else
		{
			execute(runnable, 0L);
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:lconst_0        
	//   24   43:invokevirtual   #129 <Method boolean execute(Runnable, long)>
	//   25   46:pop             
			return true;
	//   26   47:iconst_1        
	//   27   48:ireturn         
		}
	}

	public void removeAllEnqueuedTasks()
	{
		d.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BlockingQueue d>
	//    2    4:invokeinterface #133 <Method void BlockingQueue.clear()>
	//    3    9:return          
	}

	public void removeEnqueuedTask(Runnable runnable)
	{
		if(runnable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Iterator iterator = d.iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #27  <Field BlockingQueue d>
	//    5    9:invokeinterface #45  <Method Iterator BlockingQueue.iterator()>
	//    6   14:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   15:aload_2         
	//    8   16:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//    9   21:ifeq            53
			a a1 = (a)iterator.next();
	//   10   24:aload_2         
	//   11   25:invokeinterface #55  <Method Object Iterator.next()>
	//   12   30:checkcast       #57  <Class a>
	//   13   33:astore_3        
			if(a1.i() != runnable)
				continue;
	//   14   34:aload_3         
	//   15   35:invokevirtual   #85  <Method Runnable a.i()>
	//   16   38:aload_1         
	//   17   39:if_acmpne       15
			d.remove(((Object) (a1)));
	//   18   42:aload_0         
	//   19   43:getfield        #27  <Field BlockingQueue d>
	//   20   46:aload_3         
	//   21   47:invokeinterface #70  <Method boolean BlockingQueue.remove(Object)>
	//   22   52:pop             
			break;
		} while(true);
	//   23   53:return          
	}

	public int size()
	{
		return d.size();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BlockingQueue d>
	//    2    4:invokeinterface #139 <Method int BlockingQueue.size()>
	//    3    9:ireturn         
	}

	public void waitForLastNonDelayedTaskToFinish()
	{
		a a1;
label0:
		{
			a aa[] = new a[d.size()];
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field BlockingQueue d>
	//    2    4:invokeinterface #139 <Method int BlockingQueue.size()>
	//    3    9:anewarray       a[]
	//    4   12:astore_2        
			d.toArray(((Object []) (aa)));
	//    5   13:aload_0         
	//    6   14:getfield        #27  <Field BlockingQueue d>
	//    7   17:aload_2         
	//    8   18:invokeinterface #144 <Method Object[] BlockingQueue.toArray(Object[])>
	//    9   23:pop             
			int i = aa.length - 1;
	//   10   24:aload_2         
	//   11   25:arraylength     
	//   12   26:iconst_1        
	//   13   27:isub            
	//   14   28:istore_1        
			do
			{
				if(i < 0)
					break;
	//   15   29:iload_1         
	//   16   30:iflt            62
				if(aa[i] != null && !aa[i].d())
	//*  17   33:aload_2         
	//*  18   34:iload_1         
	//*  19   35:aaload          
	//*  20   36:ifnull          55
	//*  21   39:aload_2         
	//*  22   40:iload_1         
	//*  23   41:aaload          
	//*  24   42:invokevirtual   #146 <Method boolean a.d()>
	//*  25   45:ifne            55
				{
					a1 = aa[i];
	//   26   48:aload_2         
	//   27   49:iload_1         
	//   28   50:aaload          
	//   29   51:astore_2        
					break label0;
	//   30   52:goto            64
				}
				i--;
	//   31   55:iload_1         
	//   32   56:iconst_1        
	//   33   57:isub            
	//   34   58:istore_1        
			} while(true);
	//   35   59:goto            29
			a1 = null;
	//   36   62:aconst_null     
	//   37   63:astore_2        
		}
		waitForTaskToFinish(((Runnable) (a1)), 0L);
	//   38   64:aload_0         
	//   39   65:aload_2         
	//   40   66:lconst_0        
	//   41   67:invokevirtual   #150 <Method void waitForTaskToFinish(Runnable, long)>
	//   42   70:return          
	}

	public void waitForTaskToFinish(Runnable runnable, long l)
	{
		a a2;
		if(!(runnable instanceof a))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #57  <Class a>
	//*   2    4:ifne            63
		{
			Iterator iterator = d.iterator();
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field BlockingQueue d>
	//    5   11:invokeinterface #45  <Method Iterator BlockingQueue.iterator()>
	//    6   16:astore          8
			a a1 = null;
	//    7   18:aconst_null     
	//    8   19:astore          6
			do
			{
				a2 = a1;
	//    9   21:aload           6
	//   10   23:astore          7
				if(!iterator.hasNext())
					break;
	//   11   25:aload           8
	//   12   27:invokeinterface #51  <Method boolean Iterator.hasNext()>
	//   13   32:ifeq            69
				a2 = (a)iterator.next();
	//   14   35:aload           8
	//   15   37:invokeinterface #55  <Method Object Iterator.next()>
	//   16   42:checkcast       #57  <Class a>
	//   17   45:astore          7
				if(a2.i() == runnable)
	//*  18   47:aload           7
	//*  19   49:invokevirtual   #85  <Method Runnable a.i()>
	//*  20   52:aload_1         
	//*  21   53:if_acmpne       21
					a1 = a2;
	//   22   56:aload           7
	//   23   58:astore          6
			} while(true);
	//   24   60:goto            21
		} else
		{
			a2 = (a)runnable;
	//   25   63:aload_1         
	//   26   64:checkcast       #57  <Class a>
	//   27   67:astore          7
		}
		if(a2 != null)
	//*  28   69:aload           7
	//*  29   71:ifnull          120
		{
			long l1 = System.currentTimeMillis();
	//   30   74:invokestatic    #79  <Method long System.currentTimeMillis()>
	//   31   77:lstore          4
			while(d.contains(((Object) (a2)))) 
	//*  32   79:aload_0         
	//*  33   80:getfield        #27  <Field BlockingQueue d>
	//*  34   83:aload           7
	//*  35   85:invokeinterface #155 <Method boolean BlockingQueue.contains(Object)>
	//*  36   90:ifeq            120
			{
				if(l > 0L && System.currentTimeMillis() >= l1 + l)
	//*  37   93:lload_2         
	//*  38   94:lconst_0        
	//*  39   95:lcmp            
	//*  40   96:ifle            111
	//*  41   99:invokestatic    #79  <Method long System.currentTimeMillis()>
	//*  42  102:lload           4
	//*  43  104:lload_2         
	//*  44  105:ladd            
	//*  45  106:lcmp            
	//*  46  107:iflt            111
					return;
	//   47  110:return          
				try
				{
					Thread.sleep(100L);
	//   48  111:ldc2w           #156 <Long 100L>
	//   49  114:invokestatic    #163 <Method void Thread.sleep(long)>
				}
	//*  50  117:goto            79
	//*  51  120:return          
				// Misplaced declaration of an exception variable
				catch(Runnable runnable) { }
	//   52  121:astore_1        
			}
		}
	//*  53  122:goto            79
	}

	public void waitForTasks()
	{
		do
		{
			if(d.size() == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field BlockingQueue d>
	//*   2    4:invokeinterface #139 <Method int BlockingQueue.size()>
	//*   3    9:ifne            13
				return;
	//    4   12:return          
			try
			{
				Thread.sleep(100L);
	//    5   13:ldc2w           #156 <Long 100L>
	//    6   16:invokestatic    #163 <Method void Thread.sleep(long)>
			}
	//*   7   19:goto            0
			catch(InterruptedException interruptedexception) { }
	//    8   22:astore_1        
		} while(true);
	//    9   23:goto            0
	}

	private static final long b = 50000L;
	Core a;
	private TaskThread c;
	private BlockingQueue d;
}
