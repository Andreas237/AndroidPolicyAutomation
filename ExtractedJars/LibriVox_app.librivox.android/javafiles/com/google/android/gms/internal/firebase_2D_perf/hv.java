// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			hw

final class hv extends hw
{

	hv(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void hw(Unsafe)>
	//    3    5:return          
	}

	public final byte a(Object obj, long l)
	{
		return a.getByte(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #19  <Method byte Unsafe.getByte(Object, long)>
	//    5    9:ireturn         
	}

	public final void a(Object obj, long l, byte byte0)
	{
		a.putByte(obj, l, byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #23  <Method void Unsafe.putByte(Object, long, byte)>
	//    6   11:return          
	}

	public final void a(Object obj, long l, double d1)
	{
		a.putDouble(obj, l, d1);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:dload           4
	//    5    8:invokevirtual   #27  <Method void Unsafe.putDouble(Object, long, double)>
	//    6   11:return          
	}

	public final void a(Object obj, long l, float f)
	{
		a.putFloat(obj, l, f);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:fload           4
	//    5    8:invokevirtual   #31  <Method void Unsafe.putFloat(Object, long, float)>
	//    6   11:return          
	}

	public final void a(Object obj, long l, boolean flag)
	{
		a.putBoolean(obj, l, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #35  <Method void Unsafe.putBoolean(Object, long, boolean)>
	//    6   11:return          
	}

	public final boolean b(Object obj, long l)
	{
		return a.getBoolean(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #40  <Method boolean Unsafe.getBoolean(Object, long)>
	//    5    9:ireturn         
	}

	public final float c(Object obj, long l)
	{
		return a.getFloat(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #45  <Method float Unsafe.getFloat(Object, long)>
	//    5    9:freturn         
	}

	public final double d(Object obj, long l)
	{
		return a.getDouble(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Unsafe a>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #50  <Method double Unsafe.getDouble(Object, long)>
	//    5    9:dreturn         
	}
}
