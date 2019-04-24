// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$23
	implements Runnable
{

	public void run()
	{
		if(c.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field b c>
	//*   2    4:getfield        #34  <Field GLMapEngine b.f>
	//*   3    7:ifnull          119
		{
			if(a)
	//*   4   10:aload_0         
	//*   5   11:getfield        #23  <Field boolean a>
	//*   6   14:ifeq            62
			{
				c.f.setParamater(b, 2702, -1, 1, 0, 0);
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field b c>
	//    9   21:getfield        #34  <Field GLMapEngine b.f>
	//   10   24:aload_0         
	//   11   25:getfield        #25  <Field int b>
	//   12   28:sipush          2702
	//   13   31:iconst_m1       
	//   14   32:iconst_1        
	//   15   33:iconst_0        
	//   16   34:iconst_0        
	//   17   35:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				c.f.setParamater(b, 1024, 1, 0, 0, 0);
	//   18   38:aload_0         
	//   19   39:getfield        #21  <Field b c>
	//   20   42:getfield        #34  <Field GLMapEngine b.f>
	//   21   45:aload_0         
	//   22   46:getfield        #25  <Field int b>
	//   23   49:sipush          1024
	//   24   52:iconst_1        
	//   25   53:iconst_0        
	//   26   54:iconst_0        
	//   27   55:iconst_0        
	//   28   56:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			} else
	//*  29   59:goto            104
			{
				c.f.setParamater(b, 2702, -1, 0, 0, 0);
	//   30   62:aload_0         
	//   31   63:getfield        #21  <Field b c>
	//   32   66:getfield        #34  <Field GLMapEngine b.f>
	//   33   69:aload_0         
	//   34   70:getfield        #25  <Field int b>
	//   35   73:sipush          2702
	//   36   76:iconst_m1       
	//   37   77:iconst_0        
	//   38   78:iconst_0        
	//   39   79:iconst_0        
	//   40   80:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				c.f.setParamater(b, 1024, 0, 0, 0, 0);
	//   41   83:aload_0         
	//   42   84:getfield        #21  <Field b c>
	//   43   87:getfield        #34  <Field GLMapEngine b.f>
	//   44   90:aload_0         
	//   45   91:getfield        #25  <Field int b>
	//   46   94:sipush          1024
	//   47   97:iconst_0        
	//   48   98:iconst_0        
	//   49   99:iconst_0        
	//   50  100:iconst_0        
	//   51  101:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			}
			c.f.setSimple3DEnable(b, false);
	//   52  104:aload_0         
	//   53  105:getfield        #21  <Field b c>
	//   54  108:getfield        #34  <Field GLMapEngine b.f>
	//   55  111:aload_0         
	//   56  112:getfield        #25  <Field int b>
	//   57  115:iconst_0        
	//   58  116:invokevirtual   #43  <Method void GLMapEngine.setSimple3DEnable(int, boolean)>
		}
	//   59  119:return          
	}

	final boolean a;
	final int b;
	final b c;

	b$23(b b1, boolean flag, int i)
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
