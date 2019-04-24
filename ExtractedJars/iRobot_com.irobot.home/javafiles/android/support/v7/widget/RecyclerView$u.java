// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.support.v4.view.s;
import android.util.Log;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.*;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$u
{

	private boolean A()
	{
		return (n & 0x10) == 0 && android.support.v4.view.s.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #90  <Field View a>
	//    7   14:invokestatic    #99  <Method boolean s.b(View)>
	//    8   17:ifeq            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	static RecyclerView$n a(RecyclerView$u recyclerview$u, RecyclerView$n recyclerview$n)
	{
		recyclerview$u.q = recyclerview$n;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field RecyclerView$n q>
		return recyclerview$n;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void a(RecyclerView$u recyclerview$u, RecyclerView recyclerview)
	{
		recyclerview$u.a(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #104 <Method void a(RecyclerView)>
	//    3    5:return          
	}

	private void a(RecyclerView recyclerview)
	{
		s = android.support.v4.view.s.d(a);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #90  <Field View a>
	//    3    5:invokestatic    #107 <Method int s.d(View)>
	//    4    8:putfield        #79  <Field int s>
		recyclerview.a(this, 4);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:iconst_4        
	//    8   14:invokevirtual   #110 <Method boolean RecyclerView.a(RecyclerView$u, int)>
	//    9   17:pop             
	//   10   18:return          
	}

	static boolean a(RecyclerView$u recyclerview$u)
	{
		return recyclerview$u.A();
	//    0    0:aload_0         
	//    1    1:invokespecial   #113 <Method boolean A()>
	//    2    4:ireturn         
	}

	static boolean a(RecyclerView$u recyclerview$u, boolean flag)
	{
		recyclerview$u.r = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #77  <Field boolean r>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static void b(RecyclerView$u recyclerview$u, RecyclerView recyclerview)
	{
		recyclerview$u.b(recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #116 <Method void b(RecyclerView)>
	//    3    5:return          
	}

	private void b(RecyclerView recyclerview)
	{
		recyclerview.a(this, s);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #79  <Field int s>
	//    4    6:invokevirtual   #110 <Method boolean RecyclerView.a(RecyclerView$u, int)>
	//    5    9:pop             
		s = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #79  <Field int s>
	//    9   15:return          
	}

	static boolean b(RecyclerView$u recyclerview$u)
	{
		return recyclerview$u.r;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field boolean r>
	//    2    4:ireturn         
	}

	static boolean c(RecyclerView$u recyclerview$u)
	{
		return recyclerview$u.z();
	//    0    0:aload_0         
	//    1    1:invokespecial   #119 <Method boolean z()>
	//    2    4:ireturn         
	}

	static int d(RecyclerView$u recyclerview$u)
	{
		return recyclerview$u.n;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:ireturn         
	}

	private void y()
	{
		if(j == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field List j>
	//*   2    4:ifnonnull       29
		{
			j = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #123 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #124 <Method void ArrayList()>
	//    7   15:putfield        #69  <Field List j>
			k = Collections.unmodifiableList(j);
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #69  <Field List j>
	//   11   23:invokestatic    #128 <Method List Collections.unmodifiableList(List)>
	//   12   26:putfield        #71  <Field List k>
		}
	//   13   29:return          
	}

	private boolean z()
	{
		return (n & 0x10) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	void a()
	{
		d = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #55  <Field int d>
		g = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #63  <Field int g>
	//    6   10:return          
	}

	void a(int i1, int j1)
	{
		n = i1 & j1 | n & j1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iand            
	//    4    4:aload_0         
	//    5    5:getfield        #94  <Field int n>
	//    6    8:iload_2         
	//    7    9:iand            
	//    8   10:ior             
	//    9   11:putfield        #94  <Field int n>
	//   10   14:return          
	}

	void a(int i1, int j1, boolean flag)
	{
		b(8);
	//    0    0:aload_0         
	//    1    1:bipush          8
	//    2    3:invokevirtual   #133 <Method void b(int)>
		a(j1, flag);
	//    3    6:aload_0         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:invokevirtual   #136 <Method void a(int, boolean)>
		c = i1;
	//    7   12:aload_0         
	//    8   13:iload_1         
	//    9   14:putfield        #53  <Field int c>
	//   10   17:return          
	}

	void a(int i1, boolean flag)
	{
		if(d == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int d>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			d = c;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field int c>
	//    7   13:putfield        #55  <Field int d>
		if(g == -1)
	//*   8   16:aload_0         
	//*   9   17:getfield        #63  <Field int g>
	//*  10   20:iconst_m1       
	//*  11   21:icmpne          32
			g = c;
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #53  <Field int c>
	//   15   29:putfield        #63  <Field int g>
		if(flag)
	//*  16   32:iload_2         
	//*  17   33:ifeq            46
			g = g + i1;
	//   18   36:aload_0         
	//   19   37:aload_0         
	//   20   38:getfield        #63  <Field int g>
	//   21   41:iload_1         
	//   22   42:iadd            
	//   23   43:putfield        #63  <Field int g>
		c = c + i1;
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #53  <Field int c>
	//   27   51:iload_1         
	//   28   52:iadd            
	//   29   53:putfield        #53  <Field int c>
		if(a.getLayoutParams() != null)
	//*  30   56:aload_0         
	//*  31   57:getfield        #90  <Field View a>
	//*  32   60:invokevirtual   #142 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  33   63:ifnull          80
			((youtParams)a.getLayoutParams()).e = true;
	//   34   66:aload_0         
	//   35   67:getfield        #90  <Field View a>
	//   36   70:invokevirtual   #142 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   37   73:checkcast       #144 <Class RecyclerView$LayoutParams>
	//   38   76:iconst_1        
	//   39   77:putfield        #146 <Field boolean RecyclerView$LayoutParams.e>
	//   40   80:return          
	}

	void a(RecyclerView$n recyclerview$n, boolean flag)
	{
		q = recyclerview$n;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field RecyclerView$n q>
		r = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #77  <Field boolean r>
	//    6   10:return          
	}

	void a(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
		{
			b(1024);
	//    2    4:aload_0         
	//    3    5:sipush          1024
	//    4    8:invokevirtual   #133 <Method void b(int)>
			return;
	//    5   11:return          
		}
		if((0x400 & n) == 0)
	//*   6   12:sipush          1024
	//*   7   15:aload_0         
	//*   8   16:getfield        #94  <Field int n>
	//*   9   19:iand            
	//*  10   20:ifne            38
		{
			y();
	//   11   23:aload_0         
	//   12   24:invokespecial   #150 <Method void y()>
			j.add(obj);
	//   13   27:aload_0         
	//   14   28:getfield        #69  <Field List j>
	//   15   31:aload_1         
	//   16   32:invokeinterface #156 <Method boolean List.add(Object)>
	//   17   37:pop             
		}
	//   18   38:return          
	}

	public final void a(boolean flag)
	{
		int i1;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
			i1 = p - 1;
	//    2    4:aload_0         
	//    3    5:getfield        #73  <Field int p>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:istore_2        
		else
	//*   7   11:goto            21
			i1 = p + 1;
	//    8   14:aload_0         
	//    9   15:getfield        #73  <Field int p>
	//   10   18:iconst_1        
	//   11   19:iadd            
	//   12   20:istore_2        
		p = i1;
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:putfield        #73  <Field int p>
		if(p < 0)
	//*  16   26:aload_0         
	//*  17   27:getfield        #73  <Field int p>
	//*  18   30:ifge            70
		{
			p = 0;
	//   19   33:aload_0         
	//   20   34:iconst_0        
	//   21   35:putfield        #73  <Field int p>
			StringBuilder stringbuilder = new StringBuilder();
	//   22   38:new             #159 <Class StringBuilder>
	//   23   41:dup             
	//   24   42:invokespecial   #160 <Method void StringBuilder()>
	//   25   45:astore_3        
			stringbuilder.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
	//   26   46:aload_3         
	//   27   47:ldc1            #162 <String "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ">
	//   28   49:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   29   52:pop             
			stringbuilder.append(((Object) (this)));
	//   30   53:aload_3         
	//   31   54:aload_0         
	//   32   55:invokevirtual   #169 <Method StringBuilder StringBuilder.append(Object)>
	//   33   58:pop             
			Log.e("View", stringbuilder.toString());
	//   34   59:ldc1            #171 <String "View">
	//   35   61:aload_3         
	//   36   62:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   37   65:invokestatic    #180 <Method int Log.e(String, String)>
	//   38   68:pop             
			return;
	//   39   69:return          
		}
		if(!flag && p == 1)
	//*  40   70:iload_1         
	//*  41   71:ifne            96
	//*  42   74:aload_0         
	//*  43   75:getfield        #73  <Field int p>
	//*  44   78:iconst_1        
	//*  45   79:icmpne          96
			i1 = n | 0x10;
	//   46   82:aload_0         
	//   47   83:getfield        #94  <Field int n>
	//   48   86:bipush          16
	//   49   88:ior             
	//   50   89:istore_2        
		else
	//*  51   90:aload_0         
	//*  52   91:iload_2         
	//*  53   92:putfield        #94  <Field int n>
	//*  54   95:return          
		if(flag && p == 0)
	//*  55   96:iload_1         
	//*  56   97:ifeq            118
	//*  57  100:aload_0         
	//*  58  101:getfield        #73  <Field int p>
	//*  59  104:ifne            118
			i1 = n & 0xffffffef;
	//   60  107:aload_0         
	//   61  108:getfield        #94  <Field int n>
	//   62  111:bipush          -17
	//   63  113:iand            
	//   64  114:istore_2        
		else
	//*  65  115:goto            90
			return;
	//   66  118:return          
		n = i1;
	}

	boolean a(int i1)
	{
		return (i1 & n) != 0;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #94  <Field int n>
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	void b()
	{
		if(d == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int d>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          16
			d = c;
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #53  <Field int c>
	//    7   13:putfield        #55  <Field int d>
	//    8   16:return          
	}

	void b(int i1)
	{
		n = i1 | n;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #94  <Field int n>
	//    4    6:ior             
	//    5    7:putfield        #94  <Field int n>
	//    6   10:return          
	}

	boolean c()
	{
		return (n & 0x80) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:sipush          128
	//    3    7:iand            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public final int d()
	{
		if(g == -1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int g>
	//*   2    4:iconst_m1       
	//*   3    5:icmpne          13
			return c;
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field int c>
	//    6   12:ireturn         
		else
			return g;
	//    7   13:aload_0         
	//    8   14:getfield        #63  <Field int g>
	//    9   17:ireturn         
	}

	public final int e()
	{
		if(m == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #184 <Field RecyclerView m>
	//*   2    4:ifnonnull       9
			return -1;
	//    3    7:iconst_m1       
	//    4    8:ireturn         
		else
			return m.d(this);
	//    5    9:aload_0         
	//    6   10:getfield        #184 <Field RecyclerView m>
	//    7   13:aload_0         
	//    8   14:invokevirtual   #186 <Method int RecyclerView.d(RecyclerView$u)>
	//    9   17:ireturn         
	}

	public final int f()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int d>
	//    2    4:ireturn         
	}

	public final long g()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field long e>
	//    2    4:lreturn         
	}

	public final int h()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int f>
	//    2    4:ireturn         
	}

	boolean i()
	{
		return q != null;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field RecyclerView$n q>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	void j()
	{
		q.c(this);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field RecyclerView$n q>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #192 <Method void RecyclerView$n.c(RecyclerView$u)>
	//    4    8:return          
	}

	boolean k()
	{
		return (n & 0x20) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	void l()
	{
		n = n & 0xffffffdf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #94  <Field int n>
	//    3    5:bipush          -33
	//    4    7:iand            
	//    5    8:putfield        #94  <Field int n>
	//    6   11:return          
	}

	void m()
	{
		n = n & 0xfffffeff;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #94  <Field int n>
	//    3    5:sipush          -257
	//    4    8:iand            
	//    5    9:putfield        #94  <Field int n>
	//    6   12:return          
	}

	boolean n()
	{
		return (n & 4) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	boolean o()
	{
		return (n & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	boolean p()
	{
		return (n & 1) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	boolean q()
	{
		return (n & 8) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:ifeq            12
	//    5   10:iconst_1        
	//    6   11:ireturn         
	//    7   12:iconst_0        
	//    8   13:ireturn         
	}

	boolean r()
	{
		return (n & 0x100) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:sipush          256
	//    3    7:iand            
	//    4    8:ifeq            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	boolean s()
	{
		return (n & 0x200) != 0 || n();
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:ifne            23
	//    5   11:aload_0         
	//    6   12:invokevirtual   #194 <Method boolean n()>
	//    7   15:ifeq            21
	//    8   18:goto            23
	//    9   21:iconst_0        
	//   10   22:ireturn         
	//   11   23:iconst_1        
	//   12   24:ireturn         
	}

	void t()
	{
		if(j != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field List j>
	//*   2    4:ifnull          16
			j.clear();
	//    3    7:aload_0         
	//    4    8:getfield        #69  <Field List j>
	//    5   11:invokeinterface #198 <Method void List.clear()>
		n = n & 0xfffffbff;
	//    6   16:aload_0         
	//    7   17:aload_0         
	//    8   18:getfield        #94  <Field int n>
	//    9   21:sipush          -1025
	//   10   24:iand            
	//   11   25:putfield        #94  <Field int n>
	//   12   28:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #159 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #160 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("ViewHolder{");
	//    4    8:aload_1         
	//    5    9:ldc1            #200 <String "ViewHolder{">
	//    6   11:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(Integer.toHexString(((Object)this).hashCode()));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #203 <Method int Object.hashCode()>
	//   11   20:invokestatic    #209 <Method String Integer.toHexString(int)>
	//   12   23:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		stringbuilder.append(" position=");
	//   14   27:aload_1         
	//   15   28:ldc1            #211 <String " position=">
	//   16   30:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		stringbuilder.append(c);
	//   18   34:aload_1         
	//   19   35:aload_0         
	//   20   36:getfield        #53  <Field int c>
	//   21   39:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//   22   42:pop             
		stringbuilder.append(" id=");
	//   23   43:aload_1         
	//   24   44:ldc1            #216 <String " id=">
	//   25   46:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
		stringbuilder.append(e);
	//   27   50:aload_1         
	//   28   51:aload_0         
	//   29   52:getfield        #59  <Field long e>
	//   30   55:invokevirtual   #219 <Method StringBuilder StringBuilder.append(long)>
	//   31   58:pop             
		stringbuilder.append(", oldPos=");
	//   32   59:aload_1         
	//   33   60:ldc1            #221 <String ", oldPos=">
	//   34   62:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
		stringbuilder.append(d);
	//   36   66:aload_1         
	//   37   67:aload_0         
	//   38   68:getfield        #55  <Field int d>
	//   39   71:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//   40   74:pop             
		stringbuilder.append(", pLpos:");
	//   41   75:aload_1         
	//   42   76:ldc1            #223 <String ", pLpos:">
	//   43   78:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
		stringbuilder.append(g);
	//   45   82:aload_1         
	//   46   83:aload_0         
	//   47   84:getfield        #63  <Field int g>
	//   48   87:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//   49   90:pop             
		StringBuilder stringbuilder2 = new StringBuilder(stringbuilder.toString());
	//   50   91:new             #159 <Class StringBuilder>
	//   51   94:dup             
	//   52   95:aload_1         
	//   53   96:invokevirtual   #175 <Method String StringBuilder.toString()>
	//   54   99:invokespecial   #224 <Method void StringBuilder(String)>
	//   55  102:astore_2        
		if(i())
	//*  56  103:aload_0         
	//*  57  104:invokevirtual   #226 <Method boolean i()>
	//*  58  107:ifeq            139
		{
			stringbuilder2.append(" scrap ");
	//   59  110:aload_2         
	//   60  111:ldc1            #228 <String " scrap ">
	//   61  113:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   62  116:pop             
			String s1;
			if(r)
	//*  63  117:aload_0         
	//*  64  118:getfield        #77  <Field boolean r>
	//*  65  121:ifeq            130
				s1 = "[changeScrap]";
	//   66  124:ldc1            #230 <String "[changeScrap]">
	//   67  126:astore_1        
			else
	//*  68  127:goto            133
				s1 = "[attachedScrap]";
	//   69  130:ldc1            #232 <String "[attachedScrap]">
	//   70  132:astore_1        
			stringbuilder2.append(s1);
	//   71  133:aload_2         
	//   72  134:aload_1         
	//   73  135:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   74  138:pop             
		}
		if(n())
	//*  75  139:aload_0         
	//*  76  140:invokevirtual   #194 <Method boolean n()>
	//*  77  143:ifeq            153
			stringbuilder2.append(" invalid");
	//   78  146:aload_2         
	//   79  147:ldc1            #234 <String " invalid">
	//   80  149:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   81  152:pop             
		if(!p())
	//*  82  153:aload_0         
	//*  83  154:invokevirtual   #236 <Method boolean p()>
	//*  84  157:ifne            167
			stringbuilder2.append(" unbound");
	//   85  160:aload_2         
	//   86  161:ldc1            #238 <String " unbound">
	//   87  163:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   88  166:pop             
		if(o())
	//*  89  167:aload_0         
	//*  90  168:invokevirtual   #240 <Method boolean o()>
	//*  91  171:ifeq            181
			stringbuilder2.append(" update");
	//   92  174:aload_2         
	//   93  175:ldc1            #242 <String " update">
	//   94  177:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//   95  180:pop             
		if(q())
	//*  96  181:aload_0         
	//*  97  182:invokevirtual   #244 <Method boolean q()>
	//*  98  185:ifeq            195
			stringbuilder2.append(" removed");
	//   99  188:aload_2         
	//  100  189:ldc1            #246 <String " removed">
	//  101  191:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  102  194:pop             
		if(c())
	//* 103  195:aload_0         
	//* 104  196:invokevirtual   #248 <Method boolean c()>
	//* 105  199:ifeq            209
			stringbuilder2.append(" ignored");
	//  106  202:aload_2         
	//  107  203:ldc1            #250 <String " ignored">
	//  108  205:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  109  208:pop             
		if(r())
	//* 110  209:aload_0         
	//* 111  210:invokevirtual   #252 <Method boolean r()>
	//* 112  213:ifeq            223
			stringbuilder2.append(" tmpDetached");
	//  113  216:aload_2         
	//  114  217:ldc1            #254 <String " tmpDetached">
	//  115  219:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  116  222:pop             
		if(!w())
	//* 117  223:aload_0         
	//* 118  224:invokevirtual   #257 <Method boolean w()>
	//* 119  227:ifne            272
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  120  230:new             #159 <Class StringBuilder>
	//  121  233:dup             
	//  122  234:invokespecial   #160 <Method void StringBuilder()>
	//  123  237:astore_1        
			stringbuilder1.append(" not recyclable(");
	//  124  238:aload_1         
	//  125  239:ldc2            #259 <String " not recyclable(">
	//  126  242:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  127  245:pop             
			stringbuilder1.append(p);
	//  128  246:aload_1         
	//  129  247:aload_0         
	//  130  248:getfield        #73  <Field int p>
	//  131  251:invokevirtual   #214 <Method StringBuilder StringBuilder.append(int)>
	//  132  254:pop             
			stringbuilder1.append(")");
	//  133  255:aload_1         
	//  134  256:ldc2            #261 <String ")">
	//  135  259:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  136  262:pop             
			stringbuilder2.append(stringbuilder1.toString());
	//  137  263:aload_2         
	//  138  264:aload_1         
	//  139  265:invokevirtual   #175 <Method String StringBuilder.toString()>
	//  140  268:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  141  271:pop             
		}
		if(s())
	//* 142  272:aload_0         
	//* 143  273:invokevirtual   #263 <Method boolean s()>
	//* 144  276:ifeq            287
			stringbuilder2.append(" undefined adapter position");
	//  145  279:aload_2         
	//  146  280:ldc2            #265 <String " undefined adapter position">
	//  147  283:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  148  286:pop             
		if(a.getParent() == null)
	//* 149  287:aload_0         
	//* 150  288:getfield        #90  <Field View a>
	//* 151  291:invokevirtual   #269 <Method android.view.ViewParent View.getParent()>
	//* 152  294:ifnonnull       305
			stringbuilder2.append(" no parent");
	//  153  297:aload_2         
	//  154  298:ldc2            #271 <String " no parent">
	//  155  301:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  156  304:pop             
		stringbuilder2.append("}");
	//  157  305:aload_2         
	//  158  306:ldc2            #273 <String "}">
	//  159  309:invokevirtual   #166 <Method StringBuilder StringBuilder.append(String)>
	//  160  312:pop             
		return stringbuilder2.toString();
	//  161  313:aload_2         
	//  162  314:invokevirtual   #175 <Method String StringBuilder.toString()>
	//  163  317:areturn         
	}

	List u()
	{
		if((n & 0x400) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field int n>
	//*   2    4:sipush          1024
	//*   3    7:iand            
	//*   4    8:ifne            42
		{
			if(j != null && j.size() != 0)
	//*   5   11:aload_0         
	//*   6   12:getfield        #69  <Field List j>
	//*   7   15:ifnull          38
	//*   8   18:aload_0         
	//*   9   19:getfield        #69  <Field List j>
	//*  10   22:invokeinterface #277 <Method int List.size()>
	//*  11   27:ifne            33
	//*  12   30:goto            38
				return k;
	//   13   33:aload_0         
	//   14   34:getfield        #71  <Field List k>
	//   15   37:areturn         
			else
				return o;
	//   16   38:getstatic       #46  <Field List o>
	//   17   41:areturn         
		} else
		{
			return o;
	//   18   42:getstatic       #46  <Field List o>
	//   19   45:areturn         
		}
	}

	void v()
	{
		n = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #94  <Field int n>
		c = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #53  <Field int c>
		d = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #55  <Field int d>
		e = -1L;
	//    9   15:aload_0         
	//   10   16:ldc2w           #56  <Long -1L>
	//   11   19:putfield        #59  <Field long e>
		g = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #63  <Field int g>
		p = 0;
	//   15   27:aload_0         
	//   16   28:iconst_0        
	//   17   29:putfield        #73  <Field int p>
		h = null;
	//   18   32:aload_0         
	//   19   33:aconst_null     
	//   20   34:putfield        #65  <Field RecyclerView$u h>
		i = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #67  <Field RecyclerView$u i>
		t();
	//   24   42:aload_0         
	//   25   43:invokevirtual   #282 <Method void t()>
		s = 0;
	//   26   46:aload_0         
	//   27   47:iconst_0        
	//   28   48:putfield        #79  <Field int s>
		l = -1;
	//   29   51:aload_0         
	//   30   52:iconst_m1       
	//   31   53:putfield        #81  <Field int l>
		RecyclerView.c(this);
	//   32   56:aload_0         
	//   33   57:invokestatic    #283 <Method void RecyclerView.c(RecyclerView$u)>
	//   34   60:return          
	}

	public final boolean w()
	{
		return (n & 0x10) == 0 && !android.support.v4.view.s.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:bipush          16
	//    3    6:iand            
	//    4    7:ifne            22
	//    5   10:aload_0         
	//    6   11:getfield        #90  <Field View a>
	//    7   14:invokestatic    #99  <Method boolean s.b(View)>
	//    8   17:ifne            22
	//    9   20:iconst_1        
	//   10   21:ireturn         
	//   11   22:iconst_0        
	//   12   23:ireturn         
	}

	boolean x()
	{
		return (n & 2) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field int n>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	private static final List o;
	public final View a;
	WeakReference b;
	int c;
	int d;
	long e;
	int f;
	int g;
	RecyclerView$u h;
	RecyclerView$u i;
	List j;
	List k;
	int l;
	RecyclerView m;
	private int n;
	private int p;
	private RecyclerView$n q;
	private boolean r;
	private int s;

	static 
	{
		o = Collections.EMPTY_LIST;
	//    0    0:getstatic       #44  <Field List Collections.EMPTY_LIST>
	//    1    3:putstatic       #46  <Field List o>
	//*   2    6:return          
	}

	public RecyclerView$u(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		c = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #53  <Field int c>
		d = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #55  <Field int d>
		e = -1L;
	//    8   14:aload_0         
	//    9   15:ldc2w           #56  <Long -1L>
	//   10   18:putfield        #59  <Field long e>
		f = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #61  <Field int f>
		g = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #63  <Field int g>
		h = null;
	//   17   31:aload_0         
	//   18   32:aconst_null     
	//   19   33:putfield        #65  <Field RecyclerView$u h>
		i = null;
	//   20   36:aload_0         
	//   21   37:aconst_null     
	//   22   38:putfield        #67  <Field RecyclerView$u i>
		j = null;
	//   23   41:aload_0         
	//   24   42:aconst_null     
	//   25   43:putfield        #69  <Field List j>
		k = null;
	//   26   46:aload_0         
	//   27   47:aconst_null     
	//   28   48:putfield        #71  <Field List k>
		p = 0;
	//   29   51:aload_0         
	//   30   52:iconst_0        
	//   31   53:putfield        #73  <Field int p>
		q = null;
	//   32   56:aload_0         
	//   33   57:aconst_null     
	//   34   58:putfield        #75  <Field RecyclerView$n q>
		r = false;
	//   35   61:aload_0         
	//   36   62:iconst_0        
	//   37   63:putfield        #77  <Field boolean r>
		s = 0;
	//   38   66:aload_0         
	//   39   67:iconst_0        
	//   40   68:putfield        #79  <Field int s>
		l = -1;
	//   41   71:aload_0         
	//   42   72:iconst_m1       
	//   43   73:putfield        #81  <Field int l>
		if(view == null)
	//*  44   76:aload_1         
	//*  45   77:ifnonnull       90
		{
			throw new IllegalArgumentException("itemView may not be null");
	//   46   80:new             #83  <Class IllegalArgumentException>
	//   47   83:dup             
	//   48   84:ldc1            #85  <String "itemView may not be null">
	//   49   86:invokespecial   #88  <Method void IllegalArgumentException(String)>
	//   50   89:athrow          
		} else
		{
			a = view;
	//   51   90:aload_0         
	//   52   91:aload_1         
	//   53   92:putfield        #90  <Field View a>
			return;
	//   54   95:return          
		}
	}
}
