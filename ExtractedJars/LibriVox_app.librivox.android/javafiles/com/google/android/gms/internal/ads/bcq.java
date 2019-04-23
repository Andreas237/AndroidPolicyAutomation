// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bdl, bdn, bji, bex, 
//			bfc, bdg, zzfs, bnf, 
//			bdo, bnj

public abstract class bcq
	implements bdl, bdn
{

	public bcq(int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
		a = i1;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #28  <Field int a>
		g = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #30  <Field boolean g>
	//    8   14:return          
	}

	public final int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int a>
	//    2    4:ireturn         
	}

	protected final int a(bdg bdg1, bfc bfc1, boolean flag)
	{
		int i1 = e.a(bdg1, bfc1, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field bji e>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokeinterface #39  <Method int bji.a(bdg, bfc, boolean)>
	//    6   12:istore          4
		if(i1 == -4)
	//*   7   14:iload           4
	//*   8   16:bipush          -4
	//*   9   18:icmpne          62
			if(((bex) (bfc1)).c())
	//*  10   21:aload_2         
	//*  11   22:invokevirtual   #44  <Method boolean bex.c()>
	//*  12   25:ifeq            46
			{
				g = true;
	//   13   28:aload_0         
	//   14   29:iconst_1        
	//   15   30:putfield        #30  <Field boolean g>
				return !h ? -3 : -4;
	//   16   33:aload_0         
	//   17   34:getfield        #46  <Field boolean h>
	//   18   37:ifeq            43
	//   19   40:bipush          -4
	//   20   42:ireturn         
	//   21   43:bipush          -3
	//   22   45:ireturn         
			} else
			{
				bfc1.c = bfc1.c + f;
	//   23   46:aload_2         
	//   24   47:aload_2         
	//   25   48:getfield        #50  <Field long bfc.c>
	//   26   51:aload_0         
	//   27   52:getfield        #52  <Field long f>
	//   28   55:ladd            
	//   29   56:putfield        #50  <Field long bfc.c>
				return i1;
	//   30   59:iload           4
	//   31   61:ireturn         
			}
		if(i1 == -5)
	//*  32   62:iload           4
	//*  33   64:bipush          -5
	//*  34   66:icmpne          102
		{
			bfc1 = ((bfc) (bdg1.a));
	//   35   69:aload_1         
	//   36   70:getfield        #57  <Field zzfs bdg.a>
	//   37   73:astore_2        
			if(((zzfs) (bfc1)).q != 0xffffffffL)
	//*  38   74:aload_2         
	//*  39   75:getfield        #62  <Field long zzfs.q>
	//*  40   78:ldc2w           #63  <Long 0xffffffffL>
	//*  41   81:lcmp            
	//*  42   82:ifeq            102
				bdg1.a = ((zzfs) (bfc1)).a(((zzfs) (bfc1)).q + f);
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:aload_2         
	//   46   88:getfield        #62  <Field long zzfs.q>
	//   47   91:aload_0         
	//   48   92:getfield        #52  <Field long f>
	//   49   95:ladd            
	//   50   96:invokevirtual   #67  <Method zzfs zzfs.a(long)>
	//   51   99:putfield        #57  <Field zzfs bdg.a>
		}
		return i1;
	//   52  102:iload           4
	//   53  104:ireturn         
	}

	public final void a(int i1)
	{
		c = i1;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field int c>
	//    3    5:return          
	}

	public void a(int i1, Object obj)
	{
	//    0    0:return          
	}

	public final void a(long l1)
	{
		h = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #46  <Field boolean h>
		g = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #30  <Field boolean g>
		a(l1, false);
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:iconst_0        
	//    9   13:invokevirtual   #74  <Method void a(long, boolean)>
	//   10   16:return          
	}

	protected void a(long l1, boolean flag)
	{
	//    0    0:return          
	}

	public final void a(bdo bdo, zzfs azzfs[], bji bji1, long l1, boolean flag, long l2)
	{
		boolean flag1;
		if(d == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int d>
	//*   2    4:ifne            13
			flag1 = true;
	//    3    7:iconst_1        
	//    4    8:istore          9
		else
	//*   5   10:goto            16
			flag1 = false;
	//    6   13:iconst_0        
	//    7   14:istore          9
		bnf.b(flag1);
	//    8   16:iload           9
	//    9   18:invokestatic    #82  <Method void bnf.b(boolean)>
		b = bdo;
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:putfield        #84  <Field bdo b>
		d = 1;
	//   13   26:aload_0         
	//   14   27:iconst_1        
	//   15   28:putfield        #77  <Field int d>
		a(flag);
	//   16   31:aload_0         
	//   17   32:iload           6
	//   18   34:invokevirtual   #86  <Method void a(boolean)>
		a(azzfs, bji1, l2);
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:aload_3         
	//   22   40:lload           7
	//   23   42:invokevirtual   #89  <Method void a(zzfs[], bji, long)>
		a(l1, flag);
	//   24   45:aload_0         
	//   25   46:lload           4
	//   26   48:iload           6
	//   27   50:invokevirtual   #74  <Method void a(long, boolean)>
	//   28   53:return          
	}

	protected void a(boolean flag)
	{
	//    0    0:return          
	}

	protected void a(zzfs azzfs[], long l1)
	{
	//    0    0:return          
	}

	public final void a(zzfs azzfs[], bji bji1, long l1)
	{
		bnf.b(h ^ true);
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean h>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:invokestatic    #82  <Method void bnf.b(boolean)>
		e = bji1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field bji e>
		g = false;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #30  <Field boolean g>
		f = l1;
	//   11   19:aload_0         
	//   12   20:lload_3         
	//   13   21:putfield        #52  <Field long f>
		a(azzfs, l1);
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:lload_3         
	//   17   27:invokevirtual   #92  <Method void a(zzfs[], long)>
	//   18   30:return          
	}

	public final bdn b()
	{
		return ((bdn) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected final void b(long l1)
	{
		e.a_(l1 - f);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field bji e>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field long f>
	//    5    9:lsub            
	//    6   10:invokeinterface #96  <Method void bji.a_(long)>
	//    7   15:return          
	}

	public bnj c()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final int d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int d>
	//    2    4:ireturn         
	}

	public final void e()
	{
		int i1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int d>
	//    2    4:istore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i1 != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		bnf.b(flag);
	//   11   17:iload_2         
	//   12   18:invokestatic    #82  <Method void bnf.b(boolean)>
		d = 2;
	//   13   21:aload_0         
	//   14   22:iconst_2        
	//   15   23:putfield        #77  <Field int d>
		n();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #100 <Method void n()>
	//   18   30:return          
	}

	public final bji f()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field bji e>
	//    2    4:areturn         
	}

	public final boolean g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean g>
	//    2    4:ireturn         
	}

	public final void h()
	{
		h = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #46  <Field boolean h>
	//    3    5:return          
	}

	public final boolean i()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field boolean h>
	//    2    4:ireturn         
	}

	public final void j()
	{
		e.b();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field bji e>
	//    2    4:invokeinterface #105 <Method void bji.b()>
	//    3    9:return          
	}

	public final void k()
	{
		boolean flag;
		if(d == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field int d>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_1        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_1        
		bnf.b(flag);
	//    9   15:iload_1         
	//   10   16:invokestatic    #82  <Method void bnf.b(boolean)>
		d = 1;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #77  <Field int d>
		o();
	//   14   24:aload_0         
	//   15   25:invokevirtual   #109 <Method void o()>
	//   16   28:return          
	}

	public final void l()
	{
		int i1 = d;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field int d>
	//    2    4:istore_1        
		boolean flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_2        
		if(i1 != 1)
	//*   5    7:iload_1         
	//*   6    8:iconst_1        
	//*   7    9:icmpne          15
	//*   8   12:goto            17
			flag = false;
	//    9   15:iconst_0        
	//   10   16:istore_2        
		bnf.b(flag);
	//   11   17:iload_2         
	//   12   18:invokestatic    #82  <Method void bnf.b(boolean)>
		d = 0;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #77  <Field int d>
		e = null;
	//   16   26:aload_0         
	//   17   27:aconst_null     
	//   18   28:putfield        #35  <Field bji e>
		h = false;
	//   19   31:aload_0         
	//   20   32:iconst_0        
	//   21   33:putfield        #46  <Field boolean h>
		p();
	//   22   36:aload_0         
	//   23   37:invokevirtual   #113 <Method void p()>
	//   24   40:return          
	}

	public int m()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void n()
	{
	//    0    0:return          
	}

	protected void o()
	{
	//    0    0:return          
	}

	protected void p()
	{
	//    0    0:return          
	}

	protected final bdo q()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field bdo b>
	//    2    4:areturn         
	}

	protected final int r()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int c>
	//    2    4:ireturn         
	}

	protected final boolean s()
	{
		if(g)
	//*   0    0:aload_0         
	//*   1    1:getfield        #30  <Field boolean g>
	//*   2    4:ifeq            12
			return h;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field boolean h>
	//    5   11:ireturn         
		else
			return e.a();
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field bji e>
	//    8   16:invokeinterface #119 <Method boolean bji.a()>
	//    9   21:ireturn         
	}

	private final int a;
	private bdo b;
	private int c;
	private int d;
	private bji e;
	private long f;
	private boolean g;
	private boolean h;
}
