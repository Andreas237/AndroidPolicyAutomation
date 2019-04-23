// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			bdk, beg

final class bem
{

	private bem(bdk bdk, long l, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = bdk;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field bdk a>
		b = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #18  <Field long b>
		c = l1;
	//    8   14:aload_0         
	//    9   15:lload           4
	//   10   17:putfield        #20  <Field long c>
	//   11   20:return          
	}

	bem(bdk bdk, long l, long l1, beg beg)
	{
		this(bdk, l, l1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload           4
	//    4    5:invokespecial   #24  <Method void bem(bdk, long, long)>
	//    5    8:return          
	}

	static bdk a(bem bem1)
	{
		return bem1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field bdk a>
	//    2    4:areturn         
	}

	static long b(bem bem1)
	{
		return bem1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long c>
	//    2    4:lreturn         
	}

	static long c(bem bem1)
	{
		return bem1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field long b>
	//    2    4:lreturn         
	}

	private final bdk a;
	private final long b;
	private final long c;
}
