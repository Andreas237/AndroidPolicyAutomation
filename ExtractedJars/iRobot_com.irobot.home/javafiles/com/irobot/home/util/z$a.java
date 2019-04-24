// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.util;


// Referenced classes of package com.irobot.home.util:
//			z

public final class z$a
{

	private int d()
	{
		return z.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field z a>
	//    2    4:invokestatic    #24  <Method int z.a(z)>
	//    3    7:ireturn         
	}

	private int e()
	{
		return z.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field z a>
	//    2    4:invokestatic    #28  <Method int z.b(z)>
	//    3    7:ireturn         
	}

	private int f()
	{
		return d() + 1;
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method int d()>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	private int g()
	{
		return e() - 1;
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method int e()>
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:ireturn         
	}

	public int a()
	{
		return Math.max(e() - f(), 0);
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method int e()>
	//    2    4:aload_0         
	//    3    5:invokespecial   #36  <Method int f()>
	//    4    8:isub            
	//    5    9:iconst_0        
	//    6   10:invokestatic    #42  <Method int Math.max(int, int)>
	//    7   13:ireturn         
	}

	public String[] b()
	{
		String as[] = new String[a()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #45  <Method int a()>
	//    2    4:anewarray       String[]
	//    3    7:astore_3        
		int j = f();
	//    4    8:aload_0         
	//    5    9:invokespecial   #36  <Method int f()>
	//    6   12:istore_2        
		for(int i = 0; j <= g(); i++)
	//*   7   13:iconst_0        
	//*   8   14:istore_1        
	//*   9   15:iload_2         
	//*  10   16:aload_0         
	//*  11   17:invokespecial   #49  <Method int g()>
	//*  12   20:icmpgt          52
		{
			as[i] = z.a(a, z.a(a, j));
	//   13   23:aload_3         
	//   14   24:iload_1         
	//   15   25:aload_0         
	//   16   26:getfield        #12  <Field z a>
	//   17   29:aload_0         
	//   18   30:getfield        #12  <Field z a>
	//   19   33:iload_2         
	//   20   34:invokestatic    #52  <Method int[] z.a(z, int)>
	//   21   37:invokestatic    #55  <Method String z.a(z, int[])>
	//   22   40:aastore         
			j++;
	//   23   41:iload_2         
	//   24   42:iconst_1        
	//   25   43:iadd            
	//   26   44:istore_2        
		}

	//   27   45:iload_1         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_1        
	//*  31   49:goto            15
		return as;
	//   32   52:aload_3         
	//   33   53:areturn         
	}

	public int c()
	{
		return z.b(a);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field z a>
	//    2    4:invokestatic    #28  <Method int z.b(z)>
	//    3    7:ireturn         
	}

	final z a;

	private z$a(z z1)
	{
		a = z1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field z a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	z$a(z z1, z$1 z$1)
	{
		this(z1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void z$a(z)>
	//    3    5:return          
	}
}
