// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			y

class y$2
	implements Runnable
{

	public void run()
	{
		java.util.List list = y.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field y a>
	//    2    4:invokestatic    #22  <Method java.util.List y.a(y)>
	//    3    7:astore_1        
		list;
	//    4    8:aload_1         
		JVM INSTR monitorenter ;
	//    5    9:monitorenter    
		y.b(a);
	//    6   10:aload_0         
	//    7   11:getfield        #14  <Field y a>
	//    8   14:invokestatic    #25  <Method void y.b(y)>
		list;
	//    9   17:aload_1         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return;
	//   11   19:return          
		Exception exception;
		exception;
	//   12   20:astore_2        
	//*  13   21:aload_1         
		throw exception;
	//   14   22:monitorexit     
	//   15   23:aload_2         
	//   16   24:athrow          
	}

	final y a;

	y$2(y y1)
	{
		a = y1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field y a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
