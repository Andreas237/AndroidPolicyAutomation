// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


final class bgt
{

	public bgt(int i, long l, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int a>
		b = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #18  <Field long b>
		c = j;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #20  <Field int c>
	//   11   20:return          
	}

	static long a(bgt bgt1)
	{
		return bgt1.b;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field long b>
	//    2    4:lreturn         
	}

	static int b(bgt bgt1)
	{
		return bgt1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int a>
	//    2    4:ireturn         
	}

	static int c(bgt bgt1)
	{
		return bgt1.c;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int c>
	//    2    4:ireturn         
	}

	private final int a;
	private final long b;
	private final int c;
}
