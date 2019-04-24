// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.comscore.utils.task;

import com.comscore.analytics.Core;
import com.comscore.utils.CSLog;
import com.comscore.utils.Storage;
import java.util.concurrent.atomic.AtomicBoolean;

class a
	implements Runnable
{

	a(Runnable runnable, Core core)
	{
		this(runnable, core, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lconst_0        
	//    4    4:invokespecial   #25  <Method void a(Runnable, Core, long)>
	//    5    7:return          
	}

	a(Runnable runnable, Core core, long l)
	{
		this(runnable, core, l, false, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:iconst_0        
	//    5    5:lconst_0        
	//    6    6:invokespecial   #29  <Method void a(Runnable, Core, long, boolean, long)>
	//    7    9:return          
	}

	a(Runnable runnable, Core core, long l, boolean flag, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		c = runnable;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #34  <Field Runnable c>
		d = core;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #36  <Field Core d>
		long l3 = System.currentTimeMillis();
	//    8   14:invokestatic    #42  <Method long System.currentTimeMillis()>
	//    9   17:lstore          10
		long l2;
		if(l > 0L)
	//*  10   19:lload_3         
	//*  11   20:lconst_0        
	//*  12   21:lcmp            
	//*  13   22:ifle            31
			l2 = l;
	//   14   25:lload_3         
	//   15   26:lstore          8
		else
	//*  16   28:goto            34
			l2 = 0L;
	//   17   31:lconst_0        
	//   18   32:lstore          8
		e = l3 + l2;
	//   19   34:aload_0         
	//   20   35:lload           10
	//   21   37:lload           8
	//   22   39:ladd            
	//   23   40:putfield        #44  <Field long e>
		boolean flag1;
		if(l > 0L)
	//*  24   43:lload_3         
	//*  25   44:lconst_0        
	//*  26   45:lcmp            
	//*  27   46:ifle            55
			flag1 = true;
	//   28   49:iconst_1        
	//   29   50:istore          12
		else
	//*  30   52:goto            58
			flag1 = false;
	//   31   55:iconst_0        
	//   32   56:istore          12
		i = flag1;
	//   33   58:aload_0         
	//   34   59:iload           12
	//   35   61:putfield        #46  <Field boolean i>
		f = System.currentTimeMillis();
	//   36   64:aload_0         
	//   37   65:invokestatic    #42  <Method long System.currentTimeMillis()>
	//   38   68:putfield        #48  <Field long f>
		h = flag;
	//   39   71:aload_0         
	//   40   72:iload           5
	//   41   74:putfield        #50  <Field boolean h>
		g = l1;
	//   42   77:aload_0         
	//   43   78:lload           6
	//   44   80:putfield        #52  <Field long g>
		a = new AtomicBoolean();
	//   45   83:aload_0         
	//   46   84:new             #54  <Class AtomicBoolean>
	//   47   87:dup             
	//   48   88:invokespecial   #55  <Method void AtomicBoolean()>
	//   49   91:putfield        #57  <Field AtomicBoolean a>
		b = new AtomicBoolean();
	//   50   94:aload_0         
	//   51   95:new             #54  <Class AtomicBoolean>
	//   52   98:dup             
	//   53   99:invokespecial   #55  <Method void AtomicBoolean()>
	//   54  102:putfield        #59  <Field AtomicBoolean b>
		b.set(false);
	//   55  105:aload_0         
	//   56  106:getfield        #59  <Field AtomicBoolean b>
	//   57  109:iconst_0        
	//   58  110:invokevirtual   #63  <Method void AtomicBoolean.set(boolean)>
		a.set(false);
	//   59  113:aload_0         
	//   60  114:getfield        #57  <Field AtomicBoolean a>
	//   61  117:iconst_0        
	//   62  118:invokevirtual   #63  <Method void AtomicBoolean.set(boolean)>
	//   63  121:return          
	}

	long a()
	{
		long l = e - System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long e>
	//    2    4:invokestatic    #42  <Method long System.currentTimeMillis()>
	//    3    7:lsub            
	//    4    8:lstore_1        
		if(l > 0L)
	//*   5    9:lload_1         
	//*   6   10:lconst_0        
	//*   7   11:lcmp            
	//*   8   12:ifle            17
			return l;
	//    9   15:lload_1         
	//   10   16:lreturn         
		else
			return 0L;
	//   11   17:lconst_0        
	//   12   18:lreturn         
	}

	long b()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field long f>
	//    2    4:lreturn         
	}

	boolean c()
	{
		return a.get();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field AtomicBoolean a>
	//    2    4:invokevirtual   #67  <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	boolean d()
	{
		return i;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean i>
	//    2    4:ireturn         
	}

	boolean e()
	{
		return b.get();
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field AtomicBoolean b>
	//    2    4:invokevirtual   #67  <Method boolean AtomicBoolean.get()>
	//    3    7:ireturn         
	}

	long f()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field long e>
	//    2    4:lreturn         
	}

	boolean g()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field boolean h>
	//    2    4:ireturn         
	}

	long h()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field long g>
	//    2    4:lreturn         
	}

	Runnable i()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Runnable c>
	//    2    4:areturn         
	}

	public void run()
	{
		a.set(true);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field AtomicBoolean a>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #63  <Method void AtomicBoolean.set(boolean)>
		try
		{
			c.run();
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field Runnable c>
	//    6   12:invokeinterface #73  <Method void Runnable.run()>
		}
	//*   7   17:goto            55
		catch(Exception exception)
	//*   8   20:astore_1        
		{
			CSLog.e(((Object)this).getClass(), "Unexpected error running asynchronous task: ");
	//    9   21:aload_0         
	//   10   22:invokevirtual   #77  <Method Class Object.getClass()>
	//   11   25:ldc1            #79  <String "Unexpected error running asynchronous task: ">
	//   12   27:invokestatic    #84  <Method void CSLog.e(Class, String)>
			CSLog.printStackTrace(exception);
	//   13   30:aload_1         
	//   14   31:invokestatic    #88  <Method void CSLog.printStackTrace(Exception)>
			d.getStorage().add("exception_ocurrences", 1L);
	//   15   34:aload_0         
	//   16   35:getfield        #36  <Field Core d>
	//   17   38:invokevirtual   #94  <Method Storage Core.getStorage()>
	//   18   41:ldc1            #96  <String "exception_ocurrences">
	//   19   43:lconst_1        
	//   20   44:invokevirtual   #102 <Method void Storage.add(String, long)>
			d.setEnabled(false);
	//   21   47:aload_0         
	//   22   48:getfield        #36  <Field Core d>
	//   23   51:iconst_0        
	//   24   52:invokevirtual   #105 <Method void Core.setEnabled(boolean)>
		}
		a.set(false);
	//   25   55:aload_0         
	//   26   56:getfield        #57  <Field AtomicBoolean a>
	//   27   59:iconst_0        
	//   28   60:invokevirtual   #63  <Method void AtomicBoolean.set(boolean)>
		b.set(true);
	//   29   63:aload_0         
	//   30   64:getfield        #59  <Field AtomicBoolean b>
	//   31   67:iconst_1        
	//   32   68:invokevirtual   #63  <Method void AtomicBoolean.set(boolean)>
	//   33   71:return          
	}

	private AtomicBoolean a;
	private AtomicBoolean b;
	private Runnable c;
	private Core d;
	private long e;
	private long f;
	private long g;
	private boolean h;
	private boolean i;
}
