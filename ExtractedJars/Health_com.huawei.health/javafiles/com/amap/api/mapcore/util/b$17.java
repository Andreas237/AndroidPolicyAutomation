// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$17
	implements Runnable
{

	public void run()
	{
		if(com.amap.api.mapcore.util.b.s(b) && b.f != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field b b>
	//*   2    4:invokestatic    #30  <Method boolean b.s(b)>
	//*   3    7:ifeq            41
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field b b>
	//*   6   14:getfield        #34  <Field GLMapEngine b.f>
	//*   7   17:ifnull          41
			b.f.setParamater(a, 2014, 0, 0, 0, 0);
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field b b>
	//   10   24:getfield        #34  <Field GLMapEngine b.f>
	//   11   27:aload_0         
	//   12   28:getfield        #21  <Field int a>
	//   13   31:sipush          2014
	//   14   34:iconst_0        
	//   15   35:iconst_0        
	//   16   36:iconst_0        
	//   17   37:iconst_0        
	//   18   38:invokevirtual   #40  <Method void GLMapEngine.setParamater(int, int, int, int, int, int)>
	//   19   41:return          
	}

	final int a;
	final b b;

	b$17(b b1, int i)
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
