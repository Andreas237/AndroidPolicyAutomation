// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			hw, hs

final class hu extends hw
{

	hu(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void hw(Unsafe)>
	//    3    5:return          
	}

	public final byte a(Object obj, long l)
	{
		if(hs.d())
	//*   0    0:invokestatic    #17  <Method boolean hs.d()>
	//*   1    3:ifeq            12
			return hs.g(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #20  <Method byte hs.g(Object, long)>
	//    5   11:ireturn         
		else
			return hs.h(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #23  <Method byte hs.h(Object, long)>
	//    9   17:ireturn         
	}

	public final void a(Object obj, long l, byte byte0)
	{
		if(hs.d())
	//*   0    0:invokestatic    #17  <Method boolean hs.d()>
	//*   1    3:ifeq            14
		{
			hs.a(obj, l, byte0);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #26  <Method void hs.a(Object, long, byte)>
			return;
	//    6   13:return          
		} else
		{
			hs.b(obj, l, byte0);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #29  <Method void hs.b(Object, long, byte)>
			return;
	//   11   21:return          
		}
	}

	public final void a(Object obj, long l, double d1)
	{
		((hw)this).a(obj, l, Double.doubleToLongBits(d1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:dload           4
	//    4    5:invokestatic    #36  <Method long Double.doubleToLongBits(double)>
	//    5    8:invokevirtual   #39  <Method void hw.a(Object, long, long)>
	//    6   11:return          
	}

	public final void a(Object obj, long l, float f)
	{
		((hw)this).a(obj, l, Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:fload           4
	//    4    5:invokestatic    #46  <Method int Float.floatToIntBits(float)>
	//    5    8:invokevirtual   #49  <Method void hw.a(Object, long, int)>
	//    6   11:return          
	}

	public final void a(Object obj, long l, boolean flag)
	{
		if(hs.d())
	//*   0    0:invokestatic    #17  <Method boolean hs.d()>
	//*   1    3:ifeq            14
		{
			hs.b(obj, l, flag);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #52  <Method void hs.b(Object, long, boolean)>
			return;
	//    6   13:return          
		} else
		{
			hs.c(obj, l, flag);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #55  <Method void hs.c(Object, long, boolean)>
			return;
	//   11   21:return          
		}
	}

	public final boolean b(Object obj, long l)
	{
		if(hs.d())
	//*   0    0:invokestatic    #17  <Method boolean hs.d()>
	//*   1    3:ifeq            12
			return hs.i(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #59  <Method boolean hs.i(Object, long)>
	//    5   11:ireturn         
		else
			return hs.j(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #62  <Method boolean hs.j(Object, long)>
	//    9   17:ireturn         
	}

	public final float c(Object obj, long l)
	{
		return Float.intBitsToFloat(((hw)this).e(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #67  <Method int hw.e(Object, long)>
	//    4    6:invokestatic    #71  <Method float Float.intBitsToFloat(int)>
	//    5    9:freturn         
	}

	public final double d(Object obj, long l)
	{
		return Double.longBitsToDouble(((hw)this).f(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #76  <Method long hw.f(Object, long)>
	//    4    6:invokestatic    #80  <Method double Double.longBitsToDouble(long)>
	//    5    9:dreturn         
	}
}
