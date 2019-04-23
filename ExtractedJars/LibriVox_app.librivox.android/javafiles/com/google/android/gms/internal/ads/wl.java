// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wm, p, bwk, m, 
//			wk

final class wl
{

	private wl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void Object()>
	//    6   12:putfield        #16  <Field Object a>
		b = wm.a;
	//    7   15:aload_0         
	//    8   16:getstatic       #20  <Field int wm.a>
	//    9   19:putfield        #22  <Field int b>
		c = 0L;
	//   10   22:aload_0         
	//   11   23:lconst_0        
	//   12   24:putfield        #24  <Field long c>
	//   13   27:return          
	}

	wl(wk wk)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void wl()>
	//    2    4:return          
	}

	private final void a(int i, int j)
	{
		long l;
label0:
		{
			d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void d()>
			l = aw.l().a();
	//    2    4:invokestatic    #37  <Method e aw.l()>
	//    3    7:invokeinterface #42  <Method long e.a()>
	//    4   12:lstore_3        
			synchronized(a)
	//*   5   13:aload_0         
	//*   6   14:getfield        #16  <Field Object a>
	//*   7   17:astore          5
	//*   8   19:aload           5
	//*   9   21:monitorenter    
			{
				if(b == i)
					break label0;
	//   10   22:aload_0         
	//   11   23:getfield        #22  <Field int b>
	//   12   26:iload_1         
	//   13   27:icmpeq          34
			}
	//   14   30:aload           5
	//   15   32:monitorexit     
			return;
	//   16   33:return          
		}
		b = j;
	//   17   34:aload_0         
	//   18   35:iload_2         
	//   19   36:putfield        #22  <Field int b>
		if(b == wm.c)
	//*  20   39:aload_0         
	//*  21   40:getfield        #22  <Field int b>
	//*  22   43:getstatic       #44  <Field int wm.c>
	//*  23   46:icmpne          54
			c = l;
	//   24   49:aload_0         
	//   25   50:lload_3         
	//   26   51:putfield        #24  <Field long c>
		obj;
	//   27   54:aload           5
		JVM INSTR monitorexit ;
	//   28   56:monitorexit     
		return;
	//   29   57:return          
		exception;
	//   30   58:astore          6
		obj;
	//   31   60:aload           5
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		throw exception;
	//   33   63:aload           6
	//   34   65:athrow          
	}

	private final void d()
	{
		long l = aw.l().a();
	//    0    0:invokestatic    #37  <Method e aw.l()>
	//    1    3:invokeinterface #42  <Method long e.a()>
	//    2    8:lstore_1        
		synchronized(a)
	//*   3    9:aload_0         
	//*   4   10:getfield        #16  <Field Object a>
	//*   5   13:astore          5
	//*   6   15:aload           5
	//*   7   17:monitorenter    
		{
			if(b == wm.c)
	//*   8   18:aload_0         
	//*   9   19:getfield        #22  <Field int b>
	//*  10   22:getstatic       #44  <Field int wm.c>
	//*  11   25:icmpne          66
			{
				long l1 = c;
	//   12   28:aload_0         
	//   13   29:getfield        #24  <Field long c>
	//   14   32:lstore_3        
				com.google.android.gms.internal.ads.e e1 = p.cI;
	//   15   33:getstatic       #50  <Field com.google.android.gms.internal.ads.e p.cI>
	//   16   36:astore          6
				if(l1 + ((Long)com.google.android.gms.internal.ads.bwk.e().a(e1)).longValue() <= l)
	//*  17   38:lload_3         
	//*  18   39:invokestatic    #56  <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  19   42:aload           6
	//*  20   44:invokevirtual   #61  <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  21   47:checkcast       #63  <Class Long>
	//*  22   50:invokevirtual   #66  <Method long Long.longValue()>
	//*  23   53:ladd            
	//*  24   54:lload_1         
	//*  25   55:lcmp            
	//*  26   56:ifgt            66
					b = wm.a;
	//   27   59:aload_0         
	//   28   60:getstatic       #20  <Field int wm.a>
	//   29   63:putfield        #22  <Field int b>
			}
		}
	//   30   66:aload           5
	//   31   68:monitorexit     
		return;
	//   32   69:return          
		exception;
	//   33   70:astore          6
		obj;
	//   34   72:aload           5
		JVM INSTR monitorexit ;
	//   35   74:monitorexit     
		throw exception;
	//   36   75:aload           6
	//   37   77:athrow          
	}

	public final void a(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            15
		{
			a(wm.a, wm.b);
	//    2    4:aload_0         
	//    3    5:getstatic       #20  <Field int wm.a>
	//    4    8:getstatic       #68  <Field int wm.b>
	//    5   11:invokespecial   #70  <Method void a(int, int)>
			return;
	//    6   14:return          
		} else
		{
			a(wm.b, wm.a);
	//    7   15:aload_0         
	//    8   16:getstatic       #68  <Field int wm.b>
	//    9   19:getstatic       #20  <Field int wm.a>
	//   10   22:invokespecial   #70  <Method void a(int, int)>
			return;
	//   11   25:return          
		}
	}

	public final boolean a()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void d()>
		return b == wm.b;
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int b>
	//    4    8:getstatic       #68  <Field int wm.b>
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final boolean b()
	{
		d();
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void d()>
		return b == wm.c;
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int b>
	//    4    8:getstatic       #44  <Field int wm.c>
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final void c()
	{
		a(wm.b, wm.c);
	//    0    0:aload_0         
	//    1    1:getstatic       #68  <Field int wm.b>
	//    2    4:getstatic       #44  <Field int wm.c>
	//    3    7:invokespecial   #70  <Method void a(int, int)>
	//    4   10:return          
	}

	private final Object a;
	private volatile int b;
	private volatile long c;
}
