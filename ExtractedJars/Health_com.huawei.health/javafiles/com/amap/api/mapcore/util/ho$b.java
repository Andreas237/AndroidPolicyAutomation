// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;


// Referenced classes of package com.amap.api.mapcore.util:
//			ho

static class ho$b
{

	static int a(ho$b ho$b1, int i)
	{
		ho$b1.a = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #13  <Field int a>
		return i;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

	static String a(ho$b ho$b1)
	{
		return ho$b1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field String b>
	//    2    4:areturn         
	}

	static int b(ho$b ho$b1)
	{
		return ho$b1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field int a>
	//    2    4:ireturn         
	}

	private int a;
	private String b;
}
