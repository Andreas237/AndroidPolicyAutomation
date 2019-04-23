// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bdp, bnf, bdr, bds

public final class bjl extends bdp
{

	private bjl(long l, long l1, long l2, long l3, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void bdp()>
		c = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #28  <Field long c>
		d = l1;
	//    5    9:aload_0         
	//    6   10:lload_3         
	//    7   11:putfield        #30  <Field long d>
		e = 0L;
	//    8   14:aload_0         
	//    9   15:lconst_0        
	//   10   16:putfield        #32  <Field long e>
		f = 0L;
	//   11   19:aload_0         
	//   12   20:lconst_0        
	//   13   21:putfield        #34  <Field long f>
		g = flag;
	//   14   24:aload_0         
	//   15   25:iload           9
	//   16   27:putfield        #36  <Field boolean g>
		h = false;
	//   17   30:aload_0         
	//   18   31:iconst_0        
	//   19   32:putfield        #38  <Field boolean h>
	//   20   35:return          
	}

	public bjl(long l, boolean flag)
	{
		this(l, l, 0L, 0L, flag, false);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:lload_1         
	//    3    3:lconst_0        
	//    4    4:lconst_0        
	//    5    5:iload_3         
	//    6    6:iconst_0        
	//    7    7:invokespecial   #41  <Method void bjl(long, long, long, long, boolean, boolean)>
	//    8   10:return          
	}

	public final int a(Object obj)
	{
		return !b.equals(obj) ? -1 : 0;
	//    0    0:getstatic       #23  <Field Object b>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//    3    7:ifeq            12
	//    4   10:iconst_0        
	//    5   11:ireturn         
	//    6   12:iconst_m1       
	//    7   13:ireturn         
	}

	public final bdr a(int i, bdr bdr1, boolean flag)
	{
		bnf.a(i, 0, 1);
	//    0    0:iload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_1        
	//    3    3:invokestatic    #53  <Method int bnf.a(int, int, int)>
	//    4    6:pop             
		Object obj;
		if(flag)
	//*   5    7:iload_3         
	//*   6    8:ifeq            19
			obj = b;
	//    7   11:getstatic       #23  <Field Object b>
	//    8   14:astore          4
		else
	//*   9   16:goto            22
			obj = null;
	//   10   19:aconst_null     
	//   11   20:astore          4
		return bdr1.a(obj, obj, 0, c, 0L, false);
	//   12   22:aload_2         
	//   13   23:aload           4
	//   14   25:aload           4
	//   15   27:iconst_0        
	//   16   28:aload_0         
	//   17   29:getfield        #28  <Field long c>
	//   18   32:lconst_0        
	//   19   33:iconst_0        
	//   20   34:invokevirtual   #58  <Method bdr bdr.a(Object, Object, int, long, long, boolean)>
	//   21   37:areturn         
	}

	public final bds a(int i, bds bds1, boolean flag, long l)
	{
		bnf.a(i, 0, 1);
	//    0    0:iload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_1        
	//    3    3:invokestatic    #53  <Method int bnf.a(int, int, int)>
	//    4    6:pop             
		return bds1.a(((Object) (null)), 0x1L, 0x1L, g, false, 0L, d, 0, 0, 0L);
	//    5    7:aload_2         
	//    6    8:aconst_null     
	//    7    9:ldc2w           #60  <Long 0x1L>
	//    8   12:ldc2w           #60  <Long 0x1L>
	//    9   15:aload_0         
	//   10   16:getfield        #36  <Field boolean g>
	//   11   19:iconst_0        
	//   12   20:lconst_0        
	//   13   21:aload_0         
	//   14   22:getfield        #30  <Field long d>
	//   15   25:iconst_0        
	//   16   26:iconst_0        
	//   17   27:lconst_0        
	//   18   28:invokevirtual   #66  <Method bds bds.a(Object, long, long, boolean, boolean, long, long, int, int, long)>
	//   19   31:areturn         
	}

	public final int b()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final int c()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final Object b = new Object();
	private final long c;
	private final long d;
	private final long e;
	private final long f;
	private final boolean g;
	private final boolean h;

	static 
	{
	//    0    0:new             #18  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object b>
	//*   4   10:return          
	}
}
