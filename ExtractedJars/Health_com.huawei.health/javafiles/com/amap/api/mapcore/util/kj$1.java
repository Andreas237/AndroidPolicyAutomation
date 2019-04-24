// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			kj, kk

class kj$1
	implements kk$a
{

	public void a(kk kk)
	{
	//    0    0:return          
	}

	public void b(kk kk)
	{
		kj.a(a, kk, false);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field kj a>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:invokestatic    #23  <Method void kj.a(kj, kk, boolean)>
	//    5    9:return          
	}

	public void c(kk kk)
	{
		kj.a(a, kk, true);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field kj a>
	//    2    4:aload_1         
	//    3    5:iconst_1        
	//    4    6:invokestatic    #23  <Method void kj.a(kj, kk, boolean)>
	//    5    9:return          
	}

	final kj a;

	kj$1(kj kj1)
	{
		a = kj1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field kj a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
