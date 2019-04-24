// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$24
	implements Runnable
{

	public void run()
	{
		try
		{
			if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field boolean a>
	//*   2    4:ifeq            31
			{
				c.f.setParamater(b, 2017, 1, 0, 0, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field b c>
	//    5   11:getfield        #36  <Field GLMapEngine b.f>
	//    6   14:aload_0         
	//    7   15:getfield        #25  <Field int b>
	//    8   18:sipush          2017
	//    9   21:iconst_1        
	//   10   22:iconst_0        
	//   11   23:iconst_0        
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #42  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				break MISSING_BLOCK_LABEL_52;
	//   14   28:goto            52
			}
		}
	//*  15   31:aload_0         
	//*  16   32:getfield        #21  <Field b c>
	//*  17   35:getfield        #36  <Field GLMapEngine b.f>
	//*  18   38:aload_0         
	//*  19   39:getfield        #25  <Field int b>
	//*  20   42:sipush          2017
	//*  21   45:iconst_0        
	//*  22   46:iconst_0        
	//*  23   47:iconst_0        
	//*  24   48:iconst_0        
	//*  25   49:invokevirtual   #42  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//*  26   52:return          
		catch(Throwable throwable)
	//*  27   53:astore_1        
		{
			throwable.printStackTrace();
	//   28   54:aload_1         
	//   29   55:invokevirtual   #45  <Method void Throwable.printStackTrace()>
			return;
	//   30   58:return          
		}
		c.f.setParamater(b, 2017, 0, 0, 0, 0);
	}

	final boolean a;
	final int b;
	final b c;

	b$24(b b1, boolean flag, int i)
	{
		c = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field b c>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #23  <Field boolean a>
		b = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #25  <Field int b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #28  <Method void Object()>
	//   11   19:return          
	}
}
