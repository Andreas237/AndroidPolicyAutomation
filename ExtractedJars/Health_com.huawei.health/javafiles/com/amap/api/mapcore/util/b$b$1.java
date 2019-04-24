// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b, fo

class b$b$1
	implements Runnable
{

	public void run()
	{
		a.a(false);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field fo a>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #32  <Method void fo.a(boolean)>
	//    4    8:return          
	}

	final fo a;
	final b.b b;

	b$b$1(b.b b1, fo fo1)
	{
		b = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field b$b b>
		a = fo1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field fo a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
