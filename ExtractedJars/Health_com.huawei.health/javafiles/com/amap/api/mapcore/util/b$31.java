// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$31
	implements Runnable
{

	public void run()
	{
		try
		{
			if(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field boolean a>
	//*   2    4:ifeq            28
			{
				b.f.setParamater(1, 1024, 1, 0, 0, 0);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field b b>
	//    5   11:getfield        #32  <Field GLMapEngine b.f>
	//    6   14:iconst_1        
	//    7   15:sipush          1024
	//    8   18:iconst_1        
	//    9   19:iconst_0        
	//   10   20:iconst_0        
	//   11   21:iconst_0        
	//   12   22:invokevirtual   #38  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
				break MISSING_BLOCK_LABEL_46;
	//   13   25:goto            46
			}
		}
	//*  14   28:aload_0         
	//*  15   29:getfield        #19  <Field b b>
	//*  16   32:getfield        #32  <Field GLMapEngine b.f>
	//*  17   35:iconst_1        
	//*  18   36:sipush          1024
	//*  19   39:iconst_0        
	//*  20   40:iconst_0        
	//*  21   41:iconst_0        
	//*  22   42:iconst_0        
	//*  23   43:invokevirtual   #38  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//*  24   46:return          
		catch(Throwable throwable)
	//*  25   47:astore_1        
		{
			throwable.printStackTrace();
	//   26   48:aload_1         
	//   27   49:invokevirtual   #41  <Method void Throwable.printStackTrace()>
			return;
	//   28   52:return          
		}
		b.f.setParamater(1, 1024, 0, 0, 0, 0);
	}

	final boolean a;
	final b b;

	b$31(b b1, boolean flag)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field b b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
