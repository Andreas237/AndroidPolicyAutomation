// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$20
	implements Runnable
{

	public void run()
	{
		try
		{
			if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field boolean a>
	//*   2    4:ifeq            52
			{
				c.f.setParamater(b, 1021, 1, 0, 0, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field b c>
	//    5   11:getfield        #35  <Field GLMapEngine b.f>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field int b>
	//    8   18:sipush          1021
	//    9   21:iconst_1        
	//   10   22:iconst_0        
	//   11   23:iconst_0        
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				c.f.setParamater(b, 1022, 1, 0, 0, 0);
	//   14   28:aload_0         
	//   15   29:getfield        #20  <Field b c>
	//   16   32:getfield        #35  <Field GLMapEngine b.f>
	//   17   35:aload_0         
	//   18   36:getfield        #24  <Field int b>
	//   19   39:sipush          1022
	//   20   42:iconst_1        
	//   21   43:iconst_0        
	//   22   44:iconst_0        
	//   23   45:iconst_0        
	//   24   46:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				break MISSING_BLOCK_LABEL_94;
	//   25   49:goto            94
			}
		}
	//*  26   52:aload_0         
	//*  27   53:getfield        #20  <Field b c>
	//*  28   56:getfield        #35  <Field GLMapEngine b.f>
	//*  29   59:aload_0         
	//*  30   60:getfield        #24  <Field int b>
	//*  31   63:sipush          1021
	//*  32   66:iconst_0        
	//*  33   67:iconst_0        
	//*  34   68:iconst_0        
	//*  35   69:iconst_0        
	//*  36   70:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//*  37   73:aload_0         
	//*  38   74:getfield        #20  <Field b c>
	//*  39   77:getfield        #35  <Field GLMapEngine b.f>
	//*  40   80:aload_0         
	//*  41   81:getfield        #24  <Field int b>
	//*  42   84:sipush          1022
	//*  43   87:iconst_0        
	//*  44   88:iconst_0        
	//*  45   89:iconst_0        
	//*  46   90:iconst_0        
	//*  47   91:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//*  48   94:return          
		catch(Throwable throwable)
	//*  49   95:astore_1        
		{
			throwable.printStackTrace();
	//   50   96:aload_1         
	//   51   97:invokevirtual   #44  <Method void Throwable.printStackTrace()>
			return;
	//   52  100:return          
		}
		c.f.setParamater(b, 1021, 0, 0, 0, 0);
		c.f.setParamater(b, 1022, 0, 0, 0, 0);
	}

	final boolean a;
	final int b;
	final b c;

	b$20(b b1, boolean flag, int i)
	{
		c = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field b c>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #22  <Field boolean a>
		b = i;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #24  <Field int b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #27  <Method void Object()>
	//   11   19:return          
	}
}
