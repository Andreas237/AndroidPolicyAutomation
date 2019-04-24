// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			b

static abstract class b$a
	implements Runnable
{

	public void run()
	{
		b = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #23  <Field boolean b>
	//    3    5:return          
	}

	boolean b;
	boolean c;
	int d;
	int e;
	int f;
	int g;

	private b$a()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		b = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #23  <Field boolean b>
		c = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #25  <Field boolean c>
	//    8   14:return          
	}

	b$a(b$1 b$1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void b$a()>
	//    2    4:return          
	}
}
