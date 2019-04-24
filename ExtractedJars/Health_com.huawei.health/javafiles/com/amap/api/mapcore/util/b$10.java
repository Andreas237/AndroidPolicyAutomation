// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$10
	implements Runnable
{

	public void run()
	{
		try
		{
			b.f.clearAllMessages(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field b b>
	//    2    4:getfield        #32  <Field GLMapEngine b.f>
	//    3    7:aload_0         
	//    4    8:getfield        #21  <Field int a>
	//    5   11:invokevirtual   #37  <Method void GLMapEngine.clearAllMessages(int)>
			b.f.setParamater(a, 4001, 1, 0, 0, 0);
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field b b>
	//    8   18:getfield        #32  <Field GLMapEngine b.f>
	//    9   21:aload_0         
	//   10   22:getfield        #21  <Field int a>
	//   11   25:sipush          4001
	//   12   28:iconst_1        
	//   13   29:iconst_0        
	//   14   30:iconst_0        
	//   15   31:iconst_0        
	//   16   32:invokevirtual   #41  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
			return;
	//   17   35:return          
		}
		catch(Throwable throwable)
	//*  18   36:astore_1        
		{
			throwable.printStackTrace();
	//   19   37:aload_1         
	//   20   38:invokevirtual   #44  <Method void Throwable.printStackTrace()>
		}
	//   21   41:return          
	}

	final int a;
	final b b;

	b$10(b b1, int i)
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
