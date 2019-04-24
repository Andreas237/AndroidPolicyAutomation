// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android;

import android.content.Context;
import android.support.v7.*;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.*;

// Referenced classes of package com.truenet.android:
//			b

public final class c
{
	public static final class a
	{

		private a()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}

		public a(ab ab)
		{
			this();
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void c$a()>
		//    2    4:return          
		}
	}


	public c(Context context, List list, ThreadFactory threadfactory, long l, int i, int j)
	{
		ae.b(((Object) (context)), "context");
	//    0    0:aload_1         
	//    1    1:ldc1            #40  <String "context">
	//    2    3:invokestatic    #45  <Method void ae.b(Object, String)>
		ae.b(((Object) (list)), "links");
	//    3    6:aload_2         
	//    4    7:ldc1            #47  <String "links">
	//    5    9:invokestatic    #45  <Method void ae.b(Object, String)>
		ae.b(((Object) (threadfactory)), "threadFactory");
	//    6   12:aload_3         
	//    7   13:ldc1            #49  <String "threadFactory">
	//    8   15:invokestatic    #45  <Method void ae.b(Object, String)>
		super();
	//    9   18:aload_0         
	//   10   19:invokespecial   #51  <Method void Object()>
		e = context;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #53  <Field Context e>
		f = list;
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:putfield        #55  <Field List f>
		g = l;
	//   17   32:aload_0         
	//   18   33:lload           4
	//   19   35:putfield        #57  <Field long g>
		h = i;
	//   20   38:aload_0         
	//   21   39:iload           6
	//   22   41:putfield        #59  <Field int h>
		b = Executors.newFixedThreadPool(j, threadfactory);
	//   23   44:aload_0         
	//   24   45:iload           7
	//   25   47:aload_3         
	//   26   48:invokestatic    #65  <Method ExecutorService Executors.newFixedThreadPool(int, ThreadFactory)>
	//   27   51:putfield        #67  <Field ExecutorService b>
		static final class c extends af
			implements v
		{

			public Object a()
			{
				b();
			//    0    0:aload_0         
			//    1    1:invokevirtual   #28  <Method void b()>
				return ((Object) (br.a));
			//    2    4:getstatic       #33  <Field br br.a>
			//    3    7:areturn         
			}

			public final void b()
			{
			//    0    0:return          
			}

			public static final c a = new c();

			static 
			{
			//    0    0:new             #2   <Class c$c>
			//    1    3:dup             
			//    2    4:invokespecial   #18  <Method void c$c()>
			//    3    7:putstatic       #20  <Field c$c a>
			//*   4   10:return          
			}

			c()
			{
				super(0);
			//    0    0:aload_0         
			//    1    1:iconst_0        
			//    2    2:invokespecial   #24  <Method void af(int)>
			//    3    5:return          
			}
		}

		c = (v)c.a;
	//   28   54:aload_0         
	//   29   55:getstatic       #70  <Field c$c c$c.a>
	//   30   58:checkcast       #72  <Class v>
	//   31   61:putfield        #74  <Field v c>
	//   32   64:return          
	}

	private final int a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		d = d + 1;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #80  <Field int d>
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #80  <Field int d>
		i = d;
	//    8   12:aload_0         
	//    9   13:getfield        #80  <Field int d>
	//   10   16:istore_1        
		this;
	//   11   17:aload_0         
		JVM INSTR monitorexit ;
	//   12   18:monitorexit     
		return i;
	//   13   19:iload_1         
	//   14   20:ireturn         
		Exception exception;
		exception;
	//   15   21:astore_2        
	//*  16   22:aload_0         
		throw exception;
	//   17   23:monitorexit     
	//   18   24:aload_2         
	//   19   25:athrow          
	}

	public static final void a(c c1)
	{
		c1.b();
	//    0    0:aload_0         
	//    1    1:invokespecial   #83  <Method void b()>
	//    2    4:return          
	}

	private final void b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		d = d - 1;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #80  <Field int d>
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:putfield        #80  <Field int d>
		if(d <= 0)
	//*   8   12:aload_0         
	//*   9   13:getfield        #80  <Field int d>
	//*  10   16:ifgt            29
			c.a();
	//   11   19:aload_0         
	//   12   20:getfield        #74  <Field v c>
	//   13   23:invokeinterface #86  <Method Object v.a()>
	//   14   28:pop             
		br br1 = br.a;
	//   15   29:getstatic       #91  <Field br br.a>
	//   16   32:astore_1        
		this;
	//   17   33:aload_0         
		JVM INSTR monitorexit ;
	//   18   34:monitorexit     
		return;
	//   19   35:return          
		Exception exception;
		exception;
	//   20   36:astore_1        
	//*  21   37:aload_0         
		throw exception;
	//   22   38:monitorexit     
	//   23   39:aload_1         
	//   24   40:athrow          
	}

	public final void a(v v1)
	{
		ae.b(((Object) (v1)), "<set-?>");
	//    0    0:aload_1         
	//    1    1:ldc1            #94  <String "<set-?>">
	//    2    3:invokestatic    #45  <Method void ae.b(Object, String)>
		c = v1;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #74  <Field v c>
	//    6   11:return          
	}

	public final void a(w w)
	{
		ae.b(((Object) (w)), "block");
	//    0    0:aload_1         
	//    1    1:ldc1            #98  <String "block">
	//    2    3:invokestatic    #45  <Method void ae.b(Object, String)>
		Iterator iterator = ((Iterable)f).iterator();
	//    3    6:aload_0         
	//    4    7:getfield        #55  <Field List f>
	//    5   10:checkcast       #100 <Class Iterable>
	//    6   13:invokeinterface #104 <Method Iterator Iterable.iterator()>
	//    7   18:astore_3        
		for(int i = 0; iterator.hasNext(); i++)
	//*   8   19:iconst_0        
	//*   9   20:istore_2        
	//*  10   21:aload_3         
	//*  11   22:invokeinterface #110 <Method boolean Iterator.hasNext()>
	//*  12   27:ifeq            100
		{
			Object obj = ((Object) ((String)iterator.next()));
	//   13   30:aload_3         
	//   14   31:invokeinterface #113 <Method Object Iterator.next()>
	//   15   36:checkcast       #115 <Class String>
	//   16   39:astore          4
			a();
	//   17   41:aload_0         
	//   18   42:invokespecial   #117 <Method int a()>
	//   19   45:pop             
			obj = ((Object) (new b(e, ((String) (obj)), h, g)));
	//   20   46:new             #119 <Class b>
	//   21   49:dup             
	//   22   50:aload_0         
	//   23   51:getfield        #53  <Field Context e>
	//   24   54:aload           4
	//   25   56:aload_0         
	//   26   57:getfield        #59  <Field int h>
	//   27   60:aload_0         
	//   28   61:getfield        #57  <Field long g>
	//   29   64:invokespecial   #122 <Method void b(Context, String, int, long)>
	//   30   67:astore          4
			static final class b
				implements Runnable
			{

				public final void run()
				{
					a.g();
				//    0    0:aload_0         
				//    1    1:getfield        #22  <Field b a>
				//    2    4:invokevirtual   #38  <Method void b.g()>
					d.a(((Object) (a)), ((Object) (Integer.valueOf(b))));
				//    3    7:aload_0         
				//    4    8:getfield        #28  <Field w d>
				//    5   11:aload_0         
				//    6   12:getfield        #22  <Field b a>
				//    7   15:aload_0         
				//    8   16:getfield        #24  <Field int b>
				//    9   19:invokestatic    #44  <Method Integer Integer.valueOf(int)>
				//   10   22:invokeinterface #49  <Method Object w.a(Object, Object)>
				//   11   27:pop             
					c.a(c);
				//   12   28:aload_0         
				//   13   29:getfield        #26  <Field c c>
				//   14   32:invokestatic    #52  <Method void c.a(c)>
				//   15   35:return          
				}

				final b a;
				final int b;
				final c c;
				final w d;

			b(b b1, int i, c c1, w w1)
			{
				a = b1;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #22  <Field b a>
				b = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #24  <Field int b>
				c = c1;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #26  <Field c c>
				d = w1;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #28  <Field w d>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #31  <Method void Object()>
			//   14   25:return          
			}
			}

			b.execute((Runnable)new b(((b) (obj)), i, this, w));
	//   31   69:aload_0         
	//   32   70:getfield        #67  <Field ExecutorService b>
	//   33   73:new             #9   <Class c$b>
	//   34   76:dup             
	//   35   77:aload           4
	//   36   79:iload_2         
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:invokespecial   #125 <Method void c$b(b, int, c, w)>
	//   40   85:checkcast       #127 <Class Runnable>
	//   41   88:invokeinterface #133 <Method void ExecutorService.execute(Runnable)>
		}

	//   42   93:iload_2         
	//   43   94:iconst_1        
	//   44   95:iadd            
	//   45   96:istore_2        
	//*  46   97:goto            21
	//   47  100:return          
	}

	public static final a a = new a(((ab) (null)));
	private final ExecutorService b;
	private v c;
	private int d;
	private final Context e;
	private final List f;
	private final long g;
	private final int h;

	static 
	{
	//    0    0:new             #6   <Class c$a>
	//    1    3:dup             
	//    2    4:aconst_null     
	//    3    5:invokespecial   #34  <Method void c$a(ab)>
	//    4    8:putstatic       #36  <Field c$a a>
	//*   5   11:return          
	}
}
