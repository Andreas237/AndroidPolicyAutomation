// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//			StaggeredGridLayoutManager, ah

class StaggeredGridLayoutManager$a
{

	void a()
	{
		a = -1;
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:putfield        #29  <Field int a>
		b = 0x80000000;
	//    3    5:aload_0         
	//    4    6:ldc1            #30  <Int 0x80000000>
	//    5    8:putfield        #32  <Field int b>
		c = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #34  <Field boolean c>
		d = false;
	//    9   16:aload_0         
	//   10   17:iconst_0        
	//   11   18:putfield        #36  <Field boolean d>
		e = false;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #38  <Field boolean e>
		if(f != null)
	//*  15   26:aload_0         
	//*  16   27:getfield        #40  <Field int[] f>
	//*  17   30:ifnull          41
			Arrays.fill(f, -1);
	//   18   33:aload_0         
	//   19   34:getfield        #40  <Field int[] f>
	//   20   37:iconst_m1       
	//   21   38:invokestatic    #46  <Method void Arrays.fill(int[], int)>
	//   22   41:return          
	}

	void a(int i)
	{
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean c>
	//*   2    4:ifeq            26
			i = g.b.d() - i;
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field StaggeredGridLayoutManager g>
	//    5   11:getfield        #50  <Field ah StaggeredGridLayoutManager.b>
	//    6   14:invokevirtual   #55  <Method int ah.d()>
	//    7   17:iload_1         
	//    8   18:isub            
	//    9   19:istore_1        
		else
	//*  10   20:aload_0         
	//*  11   21:iload_1         
	//*  12   22:putfield        #32  <Field int b>
	//*  13   25:return          
			i = g.b.c() + i;
	//   14   26:aload_0         
	//   15   27:getfield        #21  <Field StaggeredGridLayoutManager g>
	//   16   30:getfield        #50  <Field ah StaggeredGridLayoutManager.b>
	//   17   33:invokevirtual   #57  <Method int ah.c()>
	//   18   36:iload_1         
	//   19   37:iadd            
	//   20   38:istore_1        
		b = i;
	//*  21   39:goto            20
	}

	void a(StaggeredGridLayoutManager$b astaggeredgridlayoutmanager$b[])
	{
		int j = astaggeredgridlayoutmanager$b.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		if(f == null || f.length < j)
	//*   3    3:aload_0         
	//*   4    4:getfield        #40  <Field int[] f>
	//*   5    7:ifnull          19
	//*   6   10:aload_0         
	//*   7   11:getfield        #40  <Field int[] f>
	//*   8   14:arraylength     
	//*   9   15:iload_3         
	//*  10   16:icmpge          33
			f = new int[g.a.length];
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #21  <Field StaggeredGridLayoutManager g>
	//   14   24:getfield        #61  <Field StaggeredGridLayoutManager$b[] StaggeredGridLayoutManager.a>
	//   15   27:arraylength     
	//   16   28:newarray        int[]
	//   17   30:putfield        #40  <Field int[] f>
		for(int i = 0; i < j; i++)
	//*  18   33:iconst_0        
	//*  19   34:istore_2        
	//*  20   35:iload_2         
	//*  21   36:iload_3         
	//*  22   37:icmpge          61
			f[i] = astaggeredgridlayoutmanager$b[i].a(0x80000000);
	//   23   40:aload_0         
	//   24   41:getfield        #40  <Field int[] f>
	//   25   44:iload_2         
	//   26   45:aload_1         
	//   27   46:iload_2         
	//   28   47:aaload          
	//   29   48:ldc1            #30  <Int 0x80000000>
	//   30   50:invokevirtual   #66  <Method int StaggeredGridLayoutManager$b.a(int)>
	//   31   53:iastore         

	//   32   54:iload_2         
	//   33   55:iconst_1        
	//   34   56:iadd            
	//   35   57:istore_2        
	//*  36   58:goto            35
	//   37   61:return          
	}

	void b()
	{
		int i;
		if(c)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field boolean c>
	//*   2    4:ifeq            21
			i = g.b.d();
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field StaggeredGridLayoutManager g>
	//    5   11:getfield        #50  <Field ah StaggeredGridLayoutManager.b>
	//    6   14:invokevirtual   #55  <Method int ah.d()>
	//    7   17:istore_1        
		else
	//*   8   18:goto            32
			i = g.b.c();
	//    9   21:aload_0         
	//   10   22:getfield        #21  <Field StaggeredGridLayoutManager g>
	//   11   25:getfield        #50  <Field ah StaggeredGridLayoutManager.b>
	//   12   28:invokevirtual   #57  <Method int ah.c()>
	//   13   31:istore_1        
		b = i;
	//   14   32:aload_0         
	//   15   33:iload_1         
	//   16   34:putfield        #32  <Field int b>
	//   17   37:return          
	}

	int a;
	int b;
	boolean c;
	boolean d;
	boolean e;
	int f[];
	final StaggeredGridLayoutManager g;

	StaggeredGridLayoutManager$a(StaggeredGridLayoutManager staggeredgridlayoutmanager)
	{
		g = staggeredgridlayoutmanager;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field StaggeredGridLayoutManager g>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		a();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #26  <Method void a()>
	//    7   13:return          
	}
}
