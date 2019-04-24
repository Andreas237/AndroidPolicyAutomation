// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import com.autonavi.ae.gmap.GLMapEngine;

// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$22
	implements Runnable
{

	public void run()
	{
		try
		{
			c.f.setBuildingEnable(a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field b c>
	//    2    4:getfield        #35  <Field GLMapEngine b.f>
	//    3    7:aload_0         
	//    4    8:getfield        #22  <Field int a>
	//    5   11:aload_0         
	//    6   12:getfield        #24  <Field boolean b>
	//    7   15:invokevirtual   #40  <Method void GLMapEngine.setBuildingEnable(int, boolean)>
			return;
	//    8   18:return          
		}
		catch(Throwable throwable)
	//*   9   19:astore_1        
		{
			throwable.printStackTrace();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #43  <Method void Throwable.printStackTrace()>
		}
	//   12   24:return          
	}

	final int a;
	final boolean b;
	final b c;

	b$22(b b1, int i, boolean flag)
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
