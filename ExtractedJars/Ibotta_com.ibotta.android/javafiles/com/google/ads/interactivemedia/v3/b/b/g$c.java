// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.b.b;

import java.util.*;

// Referenced classes of package com.google.ads.interactivemedia.v3.b.b:
//			g

private abstract class g$c
	implements Iterator
{

	final g$d b()
	{
		g$d g$d1 = b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field g$d b>
	//    2    4:astore_1        
		if(g$d1 != e.e)
	//*   3    5:aload_1         
	//*   4    6:aload_0         
	//*   5    7:getfield        #21  <Field g e>
	//*   6   10:getfield        #26  <Field g$d g.e>
	//*   7   13:if_acmpeq       53
		{
			if(e.d == d)
	//*   8   16:aload_0         
	//*   9   17:getfield        #21  <Field g e>
	//*  10   20:getfield        #36  <Field int g.d>
	//*  11   23:aload_0         
	//*  12   24:getfield        #37  <Field int d>
	//*  13   27:icmpne          45
			{
				b = g$d1.d;
	//   14   30:aload_0         
	//   15   31:aload_1         
	//   16   32:getfield        #30  <Field g$d g$d.d>
	//   17   35:putfield        #32  <Field g$d b>
				c = g$d1;
	//   18   38:aload_0         
	//   19   39:aload_1         
	//   20   40:putfield        #34  <Field g$d c>
				return g$d1;
	//   21   43:aload_1         
	//   22   44:areturn         
			} else
			{
				throw new ConcurrentModificationException();
	//   23   45:new             #44  <Class ConcurrentModificationException>
	//   24   48:dup             
	//   25   49:invokespecial   #45  <Method void ConcurrentModificationException()>
	//   26   52:athrow          
			}
		} else
		{
			throw new NoSuchElementException();
	//   27   53:new             #47  <Class NoSuchElementException>
	//   28   56:dup             
	//   29   57:invokespecial   #48  <Method void NoSuchElementException()>
	//   30   60:athrow          
		}
	}

	public final boolean hasNext()
	{
		return b != e.e;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field g$d b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field g e>
	//    4    8:getfield        #26  <Field g$d g.e>
	//    5   11:if_acmpeq       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final void remove()
	{
		g$d g$d1 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field g$d c>
	//    2    4:astore_1        
		if(g$d1 != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          35
		{
			e.a(g$d1, true);
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field g e>
	//    7   13:aload_1         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #57  <Method void g.a(g$d, boolean)>
			c = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #34  <Field g$d c>
			d = e.d;
	//   13   23:aload_0         
	//   14   24:aload_0         
	//   15   25:getfield        #21  <Field g e>
	//   16   28:getfield        #36  <Field int g.d>
	//   17   31:putfield        #37  <Field int d>
			return;
	//   18   34:return          
		} else
		{
			throw new IllegalStateException();
	//   19   35:new             #59  <Class IllegalStateException>
	//   20   38:dup             
	//   21   39:invokespecial   #60  <Method void IllegalStateException()>
	//   22   42:athrow          
		}
	}

	g$d b;
	g$d c;
	int d;
	final g e;

	private g$c(g g1)
	{
		e = g1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field g e>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #24  <Method void Object()>
		b = e.e.d;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field g e>
	//    8   14:getfield        #26  <Field g$d g.e>
	//    9   17:getfield        #30  <Field g$d g$d.d>
	//   10   20:putfield        #32  <Field g$d b>
		c = null;
	//   11   23:aload_0         
	//   12   24:aconst_null     
	//   13   25:putfield        #34  <Field g$d c>
		d = e.d;
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #21  <Field g e>
	//   17   33:getfield        #36  <Field int g.d>
	//   18   36:putfield        #37  <Field int d>
	//   19   39:return          
	}

	g$c(g g1, g$1 g$1)
	{
		this(g1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #41  <Method void g$c(g)>
	//    3    5:return          
	}
}
