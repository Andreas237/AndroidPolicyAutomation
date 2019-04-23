// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.arch.lifecycle;

import android.arch.a.a.a;
import android.arch.a.b.b;
import java.util.Iterator;

// Referenced classes of package android.arch.lifecycle:
//			p, q, t, j, 
//			f, h

public abstract class LiveData
{

	public LiveData()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #24  <Method void Object()>
	//    6   12:putfield        #29  <Field Object a>
		c = new b();
	//    7   15:aload_0         
	//    8   16:new             #31  <Class b>
	//    9   19:dup             
	//   10   20:invokespecial   #32  <Method void b()>
	//   11   23:putfield        #34  <Field b c>
		d = 0;
	//   12   26:aload_0         
	//   13   27:iconst_0        
	//   14   28:putfield        #36  <Field int d>
		Object obj = b;
	//   15   31:getstatic       #26  <Field Object b>
	//   16   34:astore_1        
		e = obj;
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:putfield        #38  <Field Object e>
		f = obj;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:putfield        #40  <Field Object f>
		g = -1;
	//   23   45:aload_0         
	//   24   46:iconst_m1       
	//   25   47:putfield        #42  <Field int g>
	//   26   50:aload_0         
	//   27   51:new             #44  <Class p>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:invokespecial   #47  <Method void p(LiveData)>
	//   31   59:putfield        #49  <Field Runnable j>
	//   32   62:return          
	}

	static int a(LiveData livedata, int k)
	{
		livedata.d = k;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #36  <Field int d>
		return k;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static Object a(LiveData livedata)
	{
		return livedata.a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object a>
	//    2    4:areturn         
	}

	static Object a(LiveData livedata, Object obj)
	{
		livedata.f = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field Object f>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(LiveData livedata, q q1)
	{
		livedata.b(q1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #56  <Method void b(q)>
	//    3    5:return          
	}

	private void a(q q1)
	{
		if(!q1.d)
	//*   0    0:aload_1         
	//*   1    1:getfield        #60  <Field boolean q.d>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(!q1.a())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #63  <Method boolean android.arch.lifecycle.q.a()>
	//*   6   12:ifne            21
		{
			q1.a(false);
	//    7   15:aload_1         
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #66  <Method void android.arch.lifecycle.q.a(boolean)>
			return;
	//   10   20:return          
		}
		int k = q1.e;
	//   11   21:aload_1         
	//   12   22:getfield        #68  <Field int q.e>
	//   13   25:istore_2        
		int l = g;
	//   14   26:aload_0         
	//   15   27:getfield        #42  <Field int g>
	//   16   30:istore_3        
		if(k >= l)
	//*  17   31:iload_2         
	//*  18   32:iload_3         
	//*  19   33:icmplt          37
		{
			return;
	//   20   36:return          
		} else
		{
			q1.e = l;
	//   21   37:aload_1         
	//   22   38:iload_3         
	//   23   39:putfield        #68  <Field int q.e>
			q1.c.a(e);
	//   24   42:aload_1         
	//   25   43:getfield        #71  <Field t q.c>
	//   26   46:aload_0         
	//   27   47:getfield        #38  <Field Object e>
	//   28   50:invokeinterface #76  <Method void android.arch.lifecycle.t.a(Object)>
			return;
	//   29   55:return          
		}
	}

	private static void a(String s)
	{
		if(android.arch.a.a.a.a().b())
	//*   0    0:invokestatic    #82  <Method a a.a()>
	//*   1    3:invokevirtual   #84  <Method boolean a.b()>
	//*   2    6:ifeq            10
		{
			return;
	//    3    9:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4   10:new             #86  <Class StringBuilder>
	//    5   13:dup             
	//    6   14:invokespecial   #87  <Method void StringBuilder()>
	//    7   17:astore_1        
			stringbuilder.append("Cannot invoke ");
	//    8   18:aload_1         
	//    9   19:ldc1            #89  <String "Cannot invoke ">
	//   10   21:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:pop             
			stringbuilder.append(s);
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			stringbuilder.append(" on a background");
	//   16   31:aload_1         
	//   17   32:ldc1            #95  <String " on a background">
	//   18   34:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   19   37:pop             
			stringbuilder.append(" thread");
	//   20   38:aload_1         
	//   21   39:ldc1            #97  <String " thread">
	//   22   41:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   23   44:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   24   45:new             #99  <Class IllegalStateException>
	//   25   48:dup             
	//   26   49:aload_1         
	//   27   50:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   28   53:invokespecial   #105 <Method void IllegalStateException(String)>
	//   29   56:athrow          
		}
	}

	static Object b(LiveData livedata)
	{
		return livedata.f;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object f>
	//    2    4:areturn         
	}

	private void b(q q1)
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #107 <Field boolean h>
	//*   2    4:ifeq            13
		{
			i = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #109 <Field boolean i>
			return;
	//    6   12:return          
		}
		h = true;
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:putfield        #107 <Field boolean h>
		do
		{
			q q2;
label0:
			{
				i = false;
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:putfield        #109 <Field boolean i>
				if(q1 != null)
	//*  13   23:aload_1         
	//*  14   24:ifnull          37
				{
					a(q1);
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokespecial   #111 <Method void a(q)>
					q2 = null;
	//   18   32:aconst_null     
	//   19   33:astore_2        
					break label0;
	//   20   34:goto            86
				}
				android.arch.a.b.g g1 = c.c();
	//   21   37:aload_0         
	//   22   38:getfield        #34  <Field b c>
	//   23   41:invokevirtual   #114 <Method android.arch.a.b.g b.c()>
	//   24   44:astore_3        
				do
				{
					q2 = q1;
	//   25   45:aload_1         
	//   26   46:astore_2        
					if(!((Iterator) (g1)).hasNext())
						break label0;
	//   27   47:aload_3         
	//   28   48:invokeinterface #119 <Method boolean Iterator.hasNext()>
	//   29   53:ifeq            86
					a((q)((java.util.Map.Entry)((Iterator) (g1)).next()).getValue());
	//   30   56:aload_0         
	//   31   57:aload_3         
	//   32   58:invokeinterface #123 <Method Object Iterator.next()>
	//   33   63:checkcast       #125 <Class java.util.Map$Entry>
	//   34   66:invokeinterface #128 <Method Object java.util.Map$Entry.getValue()>
	//   35   71:checkcast       #58  <Class q>
	//   36   74:invokespecial   #111 <Method void a(q)>
				} while(!i);
	//   37   77:aload_0         
	//   38   78:getfield        #109 <Field boolean i>
	//   39   81:ifeq            45
				q2 = q1;
	//   40   84:aload_1         
	//   41   85:astore_2        
			}
			q1 = q2;
	//   42   86:aload_2         
	//   43   87:astore_1        
			if(!i)
	//*  44   88:aload_0         
	//*  45   89:getfield        #109 <Field boolean i>
	//*  46   92:ifne            18
			{
				h = false;
	//   47   95:aload_0         
	//   48   96:iconst_0        
	//   49   97:putfield        #107 <Field boolean h>
				return;
	//   50  100:return          
			}
		} while(true);
	}

	static int c(LiveData livedata)
	{
		return livedata.d;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int d>
	//    2    4:ireturn         
	}

	static Object e()
	{
		return b;
	//    0    0:getstatic       #26  <Field Object b>
	//    1    3:areturn         
	}

	public Object a()
	{
		Object obj = e;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Object e>
	//    2    4:astore_1        
		if(obj != b)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #26  <Field Object b>
	//*   5    9:if_acmpeq       14
			return obj;
	//    6   12:aload_1         
	//    7   13:areturn         
		else
			return ((Object) (null));
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public void a(j j1, t t1)
	{
		if(j1.getLifecycle().a() == android.arch.lifecycle.h.a)
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #136 <Method f j.getLifecycle()>
	//*   2    6:invokevirtual   #141 <Method h android.arch.lifecycle.f.a()>
	//*   3    9:getstatic       #146 <Field h android.arch.lifecycle.h.a>
	//*   4   12:if_acmpne       16
			return;
	//    5   15:return          
		LifecycleBoundObserver lifecycleboundobserver = new LifecycleBoundObserver(j1, t1);
	//    6   16:new             #148 <Class LiveData$LifecycleBoundObserver>
	//    7   19:dup             
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:aload_2         
	//   11   23:invokespecial   #151 <Method void LiveData$LifecycleBoundObserver(LiveData, j, t)>
	//   12   26:astore_3        
		t1 = ((t) ((q)c.a(((Object) (t1)), ((Object) (lifecycleboundobserver)))));
	//   13   27:aload_0         
	//   14   28:getfield        #34  <Field b c>
	//   15   31:aload_2         
	//   16   32:aload_3         
	//   17   33:invokevirtual   #154 <Method Object b.a(Object, Object)>
	//   18   36:checkcast       #58  <Class q>
	//   19   39:astore_2        
		if(t1 != null && !((q) (t1)).a(j1))
	//*  20   40:aload_2         
	//*  21   41:ifnull          65
	//*  22   44:aload_2         
	//*  23   45:aload_1         
	//*  24   46:invokevirtual   #157 <Method boolean android.arch.lifecycle.q.a(j)>
	//*  25   49:ifeq            55
	//*  26   52:goto            65
			throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
	//   27   55:new             #159 <Class IllegalArgumentException>
	//   28   58:dup             
	//   29   59:ldc1            #161 <String "Cannot add the same observer with different lifecycles">
	//   30   61:invokespecial   #162 <Method void IllegalArgumentException(String)>
	//   31   64:athrow          
		if(t1 != null)
	//*  32   65:aload_2         
	//*  33   66:ifnull          70
		{
			return;
	//   34   69:return          
		} else
		{
			j1.getLifecycle().a(((i) (lifecycleboundobserver)));
	//   35   70:aload_1         
	//   36   71:invokeinterface #136 <Method f j.getLifecycle()>
	//   37   76:aload_3         
	//   38   77:invokevirtual   #165 <Method void android.arch.lifecycle.f.a(i)>
			return;
	//   39   80:return          
		}
	}

	public void a(t t1)
	{
		a("removeObserver");
	//    0    0:ldc1            #168 <String "removeObserver">
	//    1    2:invokestatic    #170 <Method void a(String)>
		t1 = ((t) ((q)c.b(((Object) (t1)))));
	//    2    5:aload_0         
	//    3    6:getfield        #34  <Field b c>
	//    4    9:aload_1         
	//    5   10:invokevirtual   #173 <Method Object b.b(Object)>
	//    6   13:checkcast       #58  <Class q>
	//    7   16:astore_1        
		if(t1 == null)
	//*   8   17:aload_1         
	//*   9   18:ifnonnull       22
		{
			return;
	//   10   21:return          
		} else
		{
			((q) (t1)).b();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #175 <Method void android.arch.lifecycle.q.b()>
			((q) (t1)).a(false);
	//   13   26:aload_1         
	//   14   27:iconst_0        
	//   15   28:invokevirtual   #66  <Method void android.arch.lifecycle.q.a(boolean)>
			return;
	//   16   31:return          
		}
	}

	protected void a(Object obj)
	{
		Object obj1 = a;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object a>
	//    2    4:astore_3        
		obj1;
	//    3    5:aload_3         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		if(f == b)
	//*   5    7:aload_0         
	//*   6    8:getfield        #40  <Field Object f>
	//*   7   11:getstatic       #26  <Field Object b>
	//*   8   14:if_acmpne       50
			flag = true;
	//    9   17:iconst_1        
	//   10   18:istore_2        
		else
	//*  11   19:goto            22
	//*  12   22:aload_0         
	//*  13   23:aload_1         
	//*  14   24:putfield        #40  <Field Object f>
	//*  15   27:aload_3         
	//*  16   28:monitorexit     
	//*  17   29:iload_2         
	//*  18   30:ifne            34
	//*  19   33:return          
	//*  20   34:invokestatic    #82  <Method a a.a()>
	//*  21   37:aload_0         
	//*  22   38:getfield        #49  <Field Runnable j>
	//*  23   41:invokevirtual   #178 <Method void a.b(Runnable)>
	//*  24   44:return          
	//*  25   45:astore_1        
	//*  26   46:aload_3         
	//*  27   47:monitorexit     
	//*  28   48:aload_1         
	//*  29   49:athrow          
			flag = false;
	//   30   50:iconst_0        
	//   31   51:istore_2        
		f = obj;
		obj1;
		JVM INSTR monitorexit ;
		if(!flag)
		{
			return;
		} else
		{
			android.arch.a.a.a.a().b(j);
			return;
		}
		obj;
		obj1;
		JVM INSTR monitorexit ;
		throw obj;
	//*  32   52:goto            22
	}

	protected void b()
	{
	//    0    0:return          
	}

	protected void b(Object obj)
	{
		a("setValue");
	//    0    0:ldc1            #180 <String "setValue">
	//    1    2:invokestatic    #170 <Method void a(String)>
		g = g + 1;
	//    2    5:aload_0         
	//    3    6:aload_0         
	//    4    7:getfield        #42  <Field int g>
	//    5   10:iconst_1        
	//    6   11:iadd            
	//    7   12:putfield        #42  <Field int g>
		e = obj;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:putfield        #38  <Field Object e>
		b(((q) (null)));
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:invokespecial   #56  <Method void b(q)>
	//   14   25:return          
	}

	protected void c()
	{
	//    0    0:return          
	}

	public boolean d()
	{
		return d > 0;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field int d>
	//    2    4:ifle            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	private static final Object b = new Object();
	private final Object a = new Object();
	private b c;
	private int d;
	private volatile Object e;
	private volatile Object f;
	private int g;
	private boolean h;
	private boolean i;
	private final Runnable j = new p(this);

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void Object()>
	//    3    7:putstatic       #26  <Field Object b>
	//*   4   10:return          
	}

	private class LifecycleBoundObserver extends q
		implements GenericLifecycleObserver
	{

		public void a(j j1, g g1)
		{
			if(a.getLifecycle().a() == android.arch.lifecycle.h.a)
		//*   0    0:aload_0         
		//*   1    1:getfield        #19  <Field j a>
		//*   2    4:invokeinterface #27  <Method f j.getLifecycle()>
		//*   3    9:invokevirtual   #32  <Method h android.arch.lifecycle.f.a()>
		//*   4   12:getstatic       #37  <Field h android.arch.lifecycle.h.a>
		//*   5   15:if_acmpne       30
			{
				b.a(c);
		//    6   18:aload_0         
		//    7   19:getfield        #14  <Field LiveData b>
		//    8   22:aload_0         
		//    9   23:getfield        #41  <Field t c>
		//   10   26:invokevirtual   #46  <Method void android.arch.lifecycle.LiveData.a(t)>
				return;
		//   11   29:return          
			} else
			{
				a(a());
		//   12   30:aload_0         
		//   13   31:aload_0         
		//   14   32:invokevirtual   #49  <Method boolean a()>
		//   15   35:invokevirtual   #52  <Method void a(boolean)>
				return;
		//   16   38:return          
			}
		}

		boolean a()
		{
			return a.getLifecycle().a().a(h.d);
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field j a>
		//    2    4:invokeinterface #27  <Method f j.getLifecycle()>
		//    3    9:invokevirtual   #32  <Method h android.arch.lifecycle.f.a()>
		//    4   12:getstatic       #55  <Field h h.d>
		//    5   15:invokevirtual   #58  <Method boolean android.arch.lifecycle.h.a(h)>
		//    6   18:ireturn         
		}

		boolean a(j j1)
		{
			return a == j1;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field j a>
		//    2    4:aload_1         
		//    3    5:if_acmpne       10
		//    4    8:iconst_1        
		//    5    9:ireturn         
		//    6   10:iconst_0        
		//    7   11:ireturn         
		}

		void b()
		{
			a.getLifecycle().b(((i) (this)));
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field j a>
		//    2    4:invokeinterface #27  <Method f j.getLifecycle()>
		//    3    9:aload_0         
		//    4   10:invokevirtual   #63  <Method void android.arch.lifecycle.f.b(i)>
		//    5   13:return          
		}

		final j a;
		final LiveData b;

		LifecycleBoundObserver(j j1, t t1)
		{
			b = LiveData.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field LiveData b>
			super(LiveData.this, t1);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:aload_3         
		//    6    8:invokespecial   #17  <Method void q(LiveData, t)>
			a = j1;
		//    7   11:aload_0         
		//    8   12:aload_2         
		//    9   13:putfield        #19  <Field j a>
		//   10   16:return          
		}
	}

}
