// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bfz

final class bga
{

	private bga(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #15  <Field int a>
		b = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #17  <Field long b>
	//    8   14:return          
	}

	bga(int i, long l, bfz bfz)
	{
		this(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #21  <Method void bga(int, long)>
	//    4    6:return          
	}

	static long a(bga bga1)
	{
		return bga1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field long b>
	//    2    4:lreturn         
	}

	static int b(bga bga1)
	{
		return bga1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field int a>
	//    2    4:ireturn         
	}

	private final int a;
	private final long b;
}
