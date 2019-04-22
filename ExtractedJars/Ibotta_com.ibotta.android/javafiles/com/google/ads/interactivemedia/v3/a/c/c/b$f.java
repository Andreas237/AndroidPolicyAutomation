// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a.c.c;

import com.google.ads.interactivemedia.v3.a.f.m;

// Referenced classes of package com.google.ads.interactivemedia.v3.a.c.c:
//			b

static final class b$f
	implements b$c
{

	public int a()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int b>
	//    2    4:ireturn         
	}

	public int b()
	{
		int i = c;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int c>
	//    2    4:istore_1        
		if(i == 8)
	//*   3    5:iload_1         
	//*   4    6:bipush          8
	//*   5    8:icmpne          19
			return a.f();
	//    6   11:aload_0         
	//    7   12:getfield        #28  <Field m a>
	//    8   15:invokevirtual   #44  <Method int m.f()>
	//    9   18:ireturn         
		if(i == 16)
	//*  10   19:iload_1         
	//*  11   20:bipush          16
	//*  12   22:icmpne          33
			return a.g();
	//   13   25:aload_0         
	//   14   26:getfield        #28  <Field m a>
	//   15   29:invokevirtual   #47  <Method int m.g()>
	//   16   32:ireturn         
		i = d;
	//   17   33:aload_0         
	//   18   34:getfield        #49  <Field int d>
	//   19   37:istore_1        
		d = i + 1;
	//   20   38:aload_0         
	//   21   39:iload_1         
	//   22   40:iconst_1        
	//   23   41:iadd            
	//   24   42:putfield        #49  <Field int d>
		if(i % 2 == 0)
	//*  25   45:iload_1         
	//*  26   46:iconst_2        
	//*  27   47:irem            
	//*  28   48:ifne            73
		{
			e = a.f();
	//   29   51:aload_0         
	//   30   52:aload_0         
	//   31   53:getfield        #28  <Field m a>
	//   32   56:invokevirtual   #44  <Method int m.f()>
	//   33   59:putfield        #51  <Field int e>
			return (e & 0xf0) >> 4;
	//   34   62:aload_0         
	//   35   63:getfield        #51  <Field int e>
	//   36   66:sipush          240
	//   37   69:iand            
	//   38   70:iconst_4        
	//   39   71:ishr            
	//   40   72:ireturn         
		} else
		{
			return e & 0xf;
	//   41   73:aload_0         
	//   42   74:getfield        #51  <Field int e>
	//   43   77:bipush          15
	//   44   79:iand            
	//   45   80:ireturn         
		}
	}

	public boolean c()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	private final m a;
	private final int b;
	private final int c;
	private int d;
	private int e;

	public b$f(a$b a$b1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		a = a$b1.aP;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #26  <Field m a$b.aP>
	//    5    9:putfield        #28  <Field m a>
		a.c(12);
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field m a>
	//    8   16:bipush          12
	//    9   18:invokevirtual   #33  <Method void m.c(int)>
		c = a.s() & 0xff;
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #28  <Field m a>
	//   13   26:invokevirtual   #37  <Method int m.s()>
	//   14   29:sipush          255
	//   15   32:iand            
	//   16   33:putfield        #39  <Field int c>
		b = a.s();
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:getfield        #28  <Field m a>
	//   20   41:invokevirtual   #37  <Method int m.s()>
	//   21   44:putfield        #41  <Field int b>
	//   22   47:return          
	}
}
