// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import libcore.io.Memory;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zziu

static final class zziu$zzb extends zziu$zzd
{

	public final void zza(long l, byte byte0)
	{
		Memory.pokeByte(l, byte0);
	//    0    0:lload_1         
	//    1    1:iload_3         
	//    2    2:invokestatic    #19  <Method void Memory.pokeByte(long, byte)>
	//    3    5:return          
	}

	public final void zza(Object obj, long l, double d)
	{
		((zziu$zzd)this).zza(obj, l, Double.doubleToLongBits(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:dload           4
	//    4    5:invokestatic    #26  <Method long Double.doubleToLongBits(double)>
	//    5    8:invokevirtual   #29  <Method void zziu$zzd.zza(Object, long, long)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, float f)
	{
		((zziu$zzd)this).zzb(obj, l, Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:fload           4
	//    4    5:invokestatic    #36  <Method int Float.floatToIntBits(float)>
	//    5    8:invokevirtual   #39  <Method void zziu$zzd.zzb(Object, long, int)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, boolean flag)
	{
		if(zziu.zzeb())
	//*   0    0:invokestatic    #44  <Method boolean zziu.zzeb()>
	//*   1    3:ifeq            14
		{
			zziu.zzd(obj, l, flag);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #47  <Method void zziu.zzd(Object, long, boolean)>
			return;
	//    6   13:return          
		} else
		{
			zziu.zze(obj, l, flag);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #50  <Method void zziu.zze(Object, long, boolean)>
			return;
	//   11   21:return          
		}
	}

	public final void zza(byte abyte0[], long l, long l1, long l2)
	{
		Memory.pokeByteArray(l1, abyte0, (int)l, (int)l2);
	//    0    0:lload           4
	//    1    2:aload_1         
	//    2    3:lload_2         
	//    3    4:l2i             
	//    4    5:lload           6
	//    5    7:l2i             
	//    6    8:invokestatic    #55  <Method void Memory.pokeByteArray(long, byte[], int, int)>
	//    7   11:return          
	}

	public final void zze(Object obj, long l, byte byte0)
	{
		if(zziu.zzeb())
	//*   0    0:invokestatic    #44  <Method boolean zziu.zzeb()>
	//*   1    3:ifeq            14
		{
			zziu.zzc(obj, l, byte0);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #59  <Method void zziu.zzc(Object, long, byte)>
			return;
	//    6   13:return          
		} else
		{
			zziu.zzd(obj, l, byte0);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #61  <Method void zziu.zzd(Object, long, byte)>
			return;
	//   11   21:return          
		}
	}

	public final boolean zzm(Object obj, long l)
	{
		if(zziu.zzeb())
	//*   0    0:invokestatic    #44  <Method boolean zziu.zzeb()>
	//*   1    3:ifeq            12
			return zziu.zzw(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #66  <Method boolean zziu.zzw(Object, long)>
	//    5   11:ireturn         
		else
			return zziu.zzx(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #69  <Method boolean zziu.zzx(Object, long)>
	//    9   17:ireturn         
	}

	public final float zzn(Object obj, long l)
	{
		return Float.intBitsToFloat(((zziu$zzd)this).zzk(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #75  <Method int zziu$zzd.zzk(Object, long)>
	//    4    6:invokestatic    #79  <Method float Float.intBitsToFloat(int)>
	//    5    9:freturn         
	}

	public final double zzo(Object obj, long l)
	{
		return Double.longBitsToDouble(((zziu$zzd)this).zzl(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #85  <Method long zziu$zzd.zzl(Object, long)>
	//    4    6:invokestatic    #89  <Method double Double.longBitsToDouble(long)>
	//    5    9:dreturn         
	}

	public final byte zzy(Object obj, long l)
	{
		if(zziu.zzeb())
	//*   0    0:invokestatic    #44  <Method boolean zziu.zzeb()>
	//*   1    3:ifeq            12
			return zziu.zzu(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #94  <Method byte zziu.zzu(Object, long)>
	//    5   11:ireturn         
		else
			return zziu.zzv(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #97  <Method byte zziu.zzv(Object, long)>
	//    9   17:ireturn         
	}

	zziu$zzb(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zziu$zzd(Unsafe)>
	//    3    5:return          
	}
}
