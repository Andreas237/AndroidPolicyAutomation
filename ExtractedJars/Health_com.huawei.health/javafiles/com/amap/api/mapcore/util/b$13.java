// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$13
	implements Runnable
{

	public void run()
	{
		b.a(a, 1);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field b a>
	//    2    4:iconst_1        
	//    3    5:invokestatic    #25  <Method int b.a(b, int)>
	//    4    8:pop             
	//    5    9:return          
	}

	final b a;

	b$13(b b1)
	{
		a = b1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field b a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
