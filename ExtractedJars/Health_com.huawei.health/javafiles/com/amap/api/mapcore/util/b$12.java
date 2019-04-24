// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$12
	implements Runnable
{

	public void run()
	{
		try
		{
			b.f.setParamater(a, 4001, 0, 0, 0, 0);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field b b>
	//    2    4:getfield        #32  <Field GLMapEngine b.f>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field int a>
	//    5   11:sipush          4001
	//    6   14:iconst_0        
	//    7   15:iconst_0        
	//    8   16:iconst_0        
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #38  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			return;
	//   11   21:return          
		}
		catch(Throwable throwable)
	//*  12   22:astore_1        
		{
			throwable.printStackTrace();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #41  <Method void Throwable.printStackTrace()>
		}
	//   15   27:return          
	}

	final int a;
	final b b;

	b$12(b b1, int i)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field b b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
