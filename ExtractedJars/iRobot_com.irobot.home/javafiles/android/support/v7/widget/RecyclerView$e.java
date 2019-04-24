// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$e
{
	public static interface a
	{

		public abstract void a();
	}

	static interface b
	{

		public abstract void a(RecyclerView.u u);
	}

	public static class c
	{

		public c a(RecyclerView.u u)
		{
			return a(u, 0);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #23  <Method RecyclerView$e$c a(RecyclerView$u, int)>
		//    4    6:areturn         
		}

		public c a(RecyclerView.u u, int k)
		{
			u = ((RecyclerView.u) (u.a));
		//    0    0:aload_1         
		//    1    1:getfield        #28  <Field View RecyclerView$u.a>
		//    2    4:astore_1        
			a = ((View) (u)).getLeft();
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokevirtual   #34  <Method int View.getLeft()>
		//    6   10:putfield        #36  <Field int a>
			b = ((View) (u)).getTop();
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:invokevirtual   #39  <Method int View.getTop()>
		//   10   18:putfield        #41  <Field int b>
			c = ((View) (u)).getRight();
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:invokevirtual   #44  <Method int View.getRight()>
		//   14   26:putfield        #46  <Field int c>
			d = ((View) (u)).getBottom();
		//   15   29:aload_0         
		//   16   30:aload_1         
		//   17   31:invokevirtual   #49  <Method int View.getBottom()>
		//   18   34:putfield        #51  <Field int d>
			return this;
		//   19   37:aload_0         
		//   20   38:areturn         
		}

		public int a;
		public int b;
		public int c;
		public int d;

		public c()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
		//    2    4:return          
		}
	}


	static int e(RecyclerView$u recyclerview$u)
	{
		int l = RecyclerView$u.d(recyclerview$u) & 0xe;
	//    0    0:aload_0         
	//    1    1:invokestatic    #51  <Method int RecyclerView$u.d(RecyclerView$u)>
	//    2    4:bipush          14
	//    3    6:iand            
	//    4    7:istore_2        
		if(recyclerview$u.n())
	//*   5    8:aload_0         
	//*   6    9:invokevirtual   #55  <Method boolean RecyclerView$u.n()>
	//*   7   12:ifeq            17
			return 4;
	//    8   15:iconst_4        
	//    9   16:ireturn         
		int k = l;
	//   10   17:iload_2         
	//   11   18:istore_1        
		if((l & 4) == 0)
	//*  12   19:iload_2         
	//*  13   20:iconst_4        
	//*  14   21:iand            
	//*  15   22:ifne            65
		{
			int i1 = recyclerview$u.f();
	//   16   25:aload_0         
	//   17   26:invokevirtual   #58  <Method int RecyclerView$u.f()>
	//   18   29:istore_3        
			int j1 = recyclerview$u.e();
	//   19   30:aload_0         
	//   20   31:invokevirtual   #60  <Method int RecyclerView$u.e()>
	//   21   34:istore          4
			k = l;
	//   22   36:iload_2         
	//   23   37:istore_1        
			if(i1 != -1)
	//*  24   38:iload_3         
	//*  25   39:iconst_m1       
	//*  26   40:icmpeq          65
			{
				k = l;
	//   27   43:iload_2         
	//   28   44:istore_1        
				if(j1 != -1)
	//*  29   45:iload           4
	//*  30   47:iconst_m1       
	//*  31   48:icmpeq          65
				{
					k = l;
	//   32   51:iload_2         
	//   33   52:istore_1        
					if(i1 != j1)
	//*  34   53:iload_3         
	//*  35   54:iload           4
	//*  36   56:icmpeq          65
						k = l | 0x800;
	//   37   59:iload_2         
	//   38   60:sipush          2048
	//   39   63:ior             
	//   40   64:istore_1        
				}
			}
		}
		return k;
	//   41   65:iload_1         
	//   42   66:ireturn         
	}

	public c a(RecyclerView$r recyclerview$r, RecyclerView$u recyclerview$u)
	{
		return j().a(recyclerview$u);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method RecyclerView$e$c j()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #68  <Method RecyclerView$e$c RecyclerView$e$c.a(RecyclerView$u)>
	//    4    8:areturn         
	}

	public c a(RecyclerView$r recyclerview$r, RecyclerView$u recyclerview$u, int k, List list)
	{
		return j().a(recyclerview$u);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #65  <Method RecyclerView$e$c j()>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #68  <Method RecyclerView$e$c RecyclerView$e$c.a(RecyclerView$u)>
	//    4    8:areturn         
	}

	public abstract void a();

	void a(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field RecyclerView$e$b a>
	//    3    5:return          
	}

	public final boolean a(a a1)
	{
		boolean flag = b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method boolean b()>
	//    2    4:istore_2        
		if(a1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
		{
			if(!flag)
	//*   5    9:iload_2         
	//*   6   10:ifne            21
			{
				a1.a();
	//    7   13:aload_1         
	//    8   14:invokeinterface #77  <Method void RecyclerView$e$a.a()>
				return flag;
	//    9   19:iload_2         
	//   10   20:ireturn         
			}
			b.add(((Object) (a1)));
	//   11   21:aload_0         
	//   12   22:getfield        #33  <Field ArrayList b>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #81  <Method boolean ArrayList.add(Object)>
	//   15   29:pop             
		}
		return flag;
	//   16   30:iload_2         
	//   17   31:ireturn         
	}

	public abstract boolean a(RecyclerView$u recyclerview$u, c c1, c c2);

	public abstract boolean a(RecyclerView$u recyclerview$u, RecyclerView$u recyclerview$u1, c c1, c c2);

	public boolean a(RecyclerView$u recyclerview$u, List list)
	{
		return h(recyclerview$u);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #88  <Method boolean h(RecyclerView$u)>
	//    3    5:ireturn         
	}

	public abstract boolean b();

	public abstract boolean b(RecyclerView$u recyclerview$u, c c1, c c2);

	public abstract boolean c(RecyclerView$u recyclerview$u, c c1, c c2);

	public abstract void d();

	public abstract void d(RecyclerView$u recyclerview$u);

	public long e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field long e>
	//    2    4:lreturn         
	}

	public long f()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field long c>
	//    2    4:lreturn         
	}

	public final void f(RecyclerView$u recyclerview$u)
	{
		g(recyclerview$u);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #94  <Method void g(RecyclerView$u)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #28  <Field RecyclerView$e$b a>
	//*   5    9:ifnull          22
			a.a(recyclerview$u);
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field RecyclerView$e$b a>
	//    8   16:aload_1         
	//    9   17:invokeinterface #96  <Method void RecyclerView$e$b.a(RecyclerView$u)>
	//   10   22:return          
	}

	public long g()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field long d>
	//    2    4:lreturn         
	}

	public void g(RecyclerView$u recyclerview$u)
	{
	//    0    0:return          
	}

	public long h()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field long f>
	//    2    4:lreturn         
	}

	public boolean h(RecyclerView$u recyclerview$u)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void i()
	{
		int l = b.size();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field ArrayList b>
	//    2    4:invokevirtual   #100 <Method int ArrayList.size()>
	//    3    7:istore_2        
		for(int k = 0; k < l; k++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iload_2         
	//*   8   12:icmpge          38
			((a)b.get(k)).a();
	//    9   15:aload_0         
	//   10   16:getfield        #33  <Field ArrayList b>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #104 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #9   <Class RecyclerView$e$a>
	//   14   26:invokeinterface #77  <Method void RecyclerView$e$a.a()>

	//   15   31:iload_1         
	//   16   32:iconst_1        
	//   17   33:iadd            
	//   18   34:istore_1        
	//*  19   35:goto            10
		b.clear();
	//   20   38:aload_0         
	//   21   39:getfield        #33  <Field ArrayList b>
	//   22   42:invokevirtual   #107 <Method void ArrayList.clear()>
	//   23   45:return          
	}

	public c j()
	{
		return new c();
	//    0    0:new             #15  <Class RecyclerView$e$c>
	//    1    3:dup             
	//    2    4:invokespecial   #108 <Method void RecyclerView$e$c()>
	//    3    7:areturn         
	}

	private b a;
	private ArrayList b;
	private long c;
	private long d;
	private long e;
	private long f;

	public RecyclerView$e()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #28  <Field RecyclerView$e$b a>
		b = new ArrayList();
	//    5    9:aload_0         
	//    6   10:new             #30  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #31  <Method void ArrayList()>
	//    9   17:putfield        #33  <Field ArrayList b>
		c = 120L;
	//   10   20:aload_0         
	//   11   21:ldc2w           #34  <Long 120L>
	//   12   24:putfield        #37  <Field long c>
		d = 120L;
	//   13   27:aload_0         
	//   14   28:ldc2w           #34  <Long 120L>
	//   15   31:putfield        #39  <Field long d>
		e = 250L;
	//   16   34:aload_0         
	//   17   35:ldc2w           #40  <Long 250L>
	//   18   38:putfield        #43  <Field long e>
		f = 250L;
	//   19   41:aload_0         
	//   20   42:ldc2w           #40  <Long 250L>
	//   21   45:putfield        #45  <Field long f>
	//   22   48:return          
	}
}
