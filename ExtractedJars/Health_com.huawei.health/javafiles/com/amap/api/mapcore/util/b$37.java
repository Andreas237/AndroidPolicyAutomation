// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b

class b$37
	implements Runnable
{

	public void run()
	{
		if(b.u(a) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field b a>
	//*   2    4:invokestatic    #26  <Method b$b b.u(b)>
	//*   3    7:ifnull          27
			b.u(a).a(b.v(a));
	//    4   10:aload_0         
	//    5   11:getfield        #17  <Field b a>
	//    6   14:invokestatic    #26  <Method b$b b.u(b)>
	//    7   17:aload_0         
	//    8   18:getfield        #17  <Field b a>
	//    9   21:invokestatic    #30  <Method au b.v(b)>
	//   10   24:invokevirtual   #35  <Method void b$b.a(au)>
	//   11   27:return          
	}

	final b a;

	b$37(b b1)
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
