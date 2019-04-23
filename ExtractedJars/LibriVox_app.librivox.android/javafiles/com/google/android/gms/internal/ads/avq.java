// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

abstract class avq
{

	avq(Unsafe unsafe)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = unsafe;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Unsafe a>
	//    5    9:return          
	}

	public abstract byte a(Object obj, long l);

	public abstract void a(long l, byte byte0);

	public abstract void a(Object obj, long l, byte byte0);

	public abstract void a(Object obj, long l, double d1);

	public abstract void a(Object obj, long l, float f1);

	public final void a(Object obj, long l, int i)
	{
		a.putInt(obj, l, i);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #25  <Method void Unsafe.putInt(Object, long, int)>
	//    6   11:return          
	}

	public final void a(Object obj, long l, long l1)
	{
		a.putLong(obj, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #29  <Method void Unsafe.putLong(Object, long, long)>
	//    6   11:return          
	}

	public abstract void a(Object obj, long l, boolean flag);

	public abstract void a(byte abyte0[], long l, long l1, long l2);

	public abstract boolean b(Object obj, long l);

	public abstract float c(Object obj, long l);

	public abstract double d(Object obj, long l);

	public final int e(Object obj, long l)
	{
		return a.getInt(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #42  <Method int Unsafe.getInt(Object, long)>
	//    5    9:ireturn         
	}

	public final long f(Object obj, long l)
	{
		return a.getLong(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #47  <Method long Unsafe.getLong(Object, long)>
	//    5    9:lreturn         
	}

	Unsafe a;
}
