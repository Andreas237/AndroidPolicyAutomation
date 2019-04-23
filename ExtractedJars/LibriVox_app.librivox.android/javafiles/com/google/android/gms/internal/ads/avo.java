// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import libcore.io.Memory;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.ads:
//			avq, avm

final class avo extends avq
{

	avo(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void avq(Unsafe)>
	//    3    5:return          
	}

	public final byte a(Object obj, long l)
	{
		if(avm.e())
	//*   0    0:invokestatic    #17  <Method boolean avm.e()>
	//*   1    3:ifeq            12
			return avm.g(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #20  <Method byte avm.g(Object, long)>
	//    5   11:ireturn         
		else
			return avm.h(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #23  <Method byte avm.h(Object, long)>
	//    9   17:ireturn         
	}

	public final void a(long l, byte byte0)
	{
		Memory.pokeByte(l, byte0);
	//    0    0:lload_1         
	//    1    1:iload_3         
	//    2    2:invokestatic    #29  <Method void Memory.pokeByte(long, byte)>
	//    3    5:return          
	}

	public final void a(Object obj, long l, byte byte0)
	{
		if(avm.e())
	//*   0    0:invokestatic    #17  <Method boolean avm.e()>
	//*   1    3:ifeq            14
		{
			avm.a(obj, l, byte0);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #32  <Method void avm.a(Object, long, byte)>
			return;
	//    6   13:return          
		} else
		{
			avm.b(obj, l, byte0);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #35  <Method void avm.b(Object, long, byte)>
			return;
	//   11   21:return          
		}
	}

	public final void a(Object obj, long l, double d1)
	{
		((avq)this).a(obj, l, Double.doubleToLongBits(d1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:dload           4
	//    4    5:invokestatic    #42  <Method long Double.doubleToLongBits(double)>
	//    5    8:invokevirtual   #45  <Method void avq.a(Object, long, long)>
	//    6   11:return          
	}

	public final void a(Object obj, long l, float f)
	{
		((avq)this).a(obj, l, Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:fload           4
	//    4    5:invokestatic    #52  <Method int Float.floatToIntBits(float)>
	//    5    8:invokevirtual   #55  <Method void avq.a(Object, long, int)>
	//    6   11:return          
	}

	public final void a(Object obj, long l, boolean flag)
	{
		if(avm.e())
	//*   0    0:invokestatic    #17  <Method boolean avm.e()>
	//*   1    3:ifeq            14
		{
			avm.b(obj, l, flag);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #58  <Method void avm.b(Object, long, boolean)>
			return;
	//    6   13:return          
		} else
		{
			avm.c(obj, l, flag);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #61  <Method void avm.c(Object, long, boolean)>
			return;
	//   11   21:return          
		}
	}

	public final void a(byte abyte0[], long l, long l1, long l2)
	{
		Memory.pokeByteArray(l1, abyte0, (int)l, (int)l2);
	//    0    0:lload           4
	//    1    2:aload_1         
	//    2    3:lload_2         
	//    3    4:l2i             
	//    4    5:lload           6
	//    5    7:l2i             
	//    6    8:invokestatic    #66  <Method void Memory.pokeByteArray(long, byte[], int, int)>
	//    7   11:return          
	}

	public final boolean b(Object obj, long l)
	{
		if(avm.e())
	//*   0    0:invokestatic    #17  <Method boolean avm.e()>
	//*   1    3:ifeq            12
			return avm.i(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #70  <Method boolean avm.i(Object, long)>
	//    5   11:ireturn         
		else
			return avm.j(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #73  <Method boolean avm.j(Object, long)>
	//    9   17:ireturn         
	}

	public final float c(Object obj, long l)
	{
		return Float.intBitsToFloat(((avq)this).e(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #77  <Method int avq.e(Object, long)>
	//    4    6:invokestatic    #81  <Method float Float.intBitsToFloat(int)>
	//    5    9:freturn         
	}

	public final double d(Object obj, long l)
	{
		return Double.longBitsToDouble(((avq)this).f(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #87  <Method long avq.f(Object, long)>
	//    4    6:invokestatic    #91  <Method double Double.longBitsToDouble(long)>
	//    5    9:dreturn         
	}
}
