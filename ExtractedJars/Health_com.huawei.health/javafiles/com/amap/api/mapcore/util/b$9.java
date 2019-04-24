// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$9
	implements Runnable
{

	public void run()
	{
		com.amap.api.mapcore.util.b.a(c, a, 2, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field b c>
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int a>
	//    4    8:iconst_2        
	//    5    9:aload_0         
	//    6   10:getfield        #24  <Field boolean b>
	//    7   13:invokestatic    #34  <Method void b.a(b, int, int, boolean)>
		int i;
		if(b)
	//*   8   16:aload_0         
	//*   9   17:getfield        #24  <Field boolean b>
	//*  10   20:ifeq            63
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		else
	//*  13   25:goto            28
	//*  14   28:aload_0         
	//*  15   29:getfield        #20  <Field b c>
	//*  16   32:getfield        #38  <Field GLMapEngine b.f>
	//*  17   35:aload_0         
	//*  18   36:getfield        #22  <Field int a>
	//*  19   39:sipush          2033
	//*  20   42:iload_1         
	//*  21   43:iconst_0        
	//*  22   44:iconst_0        
	//*  23   45:iconst_0        
	//*  24   46:invokevirtual   #44  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//*  25   49:aload_0         
	//*  26   50:getfield        #20  <Field b c>
	//*  27   53:invokevirtual   #47  <Method void b.q()>
	//*  28   56:return          
	//*  29   57:astore_2        
	//*  30   58:aload_2         
	//*  31   59:invokevirtual   #50  <Method void Throwable.printStackTrace()>
	//*  32   62:return          
			i = 1;
	//   33   63:iconst_1        
	//   34   64:istore_1        
		try
		{
			c.f.setParamater(a, 2033, i, 0, 0, 0);
			c.q();
			return;
		}
		catch(Throwable throwable)
		{
			throwable.printStackTrace();
		}
		return;
	//*  35   65:goto            28
	}

	final int a;
	final boolean b;
	final b c;

	b$9(b b1, int i, boolean flag)
	{
		c = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field b c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field int a>
		b = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field boolean b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
