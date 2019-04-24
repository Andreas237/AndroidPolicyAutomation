// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ed

class ed$d$1
	implements Runnable
{

	public void run()
	{
		a.run();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Runnable a>
	//    2    4:invokeinterface #31  <Method void Runnable.run()>
		b.a();
	//    3    9:aload_0         
	//    4   10:getfield        #22  <Field ed$d b>
	//    5   13:invokevirtual   #33  <Method void ed$d.a()>
		return;
	//    6   16:return          
		Exception exception;
		exception;
	//    7   17:astore_1        
		b.a();
	//    8   18:aload_0         
	//    9   19:getfield        #22  <Field ed$d b>
	//   10   22:invokevirtual   #33  <Method void ed$d.a()>
		throw exception;
	//   11   25:aload_1         
	//   12   26:athrow          
	}

	final Runnable a;
	final ed.d b;

	ed$d$1(ed.d d1, Runnable runnable)
	{
		b = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field ed$d b>
		a = runnable;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field Runnable a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #27  <Method void Object()>
	//    8   14:return          
	}
}
