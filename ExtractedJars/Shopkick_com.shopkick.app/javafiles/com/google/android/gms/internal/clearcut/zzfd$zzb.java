// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import libcore.io.Memory;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzfd

static final class zzfd$zzb extends zzfd$zzd
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
		((zzfd$zzd)this).zza(obj, l, Double.doubleToLongBits(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:dload           4
	//    4    5:invokestatic    #26  <Method long Double.doubleToLongBits(double)>
	//    5    8:invokevirtual   #29  <Method void zzfd$zzd.zza(Object, long, long)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, float f)
	{
		((zzfd$zzd)this).zza(obj, l, Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:fload           4
	//    4    5:invokestatic    #36  <Method int Float.floatToIntBits(float)>
	//    5    8:invokevirtual   #39  <Method void zzfd$zzd.zza(Object, long, int)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, boolean flag)
	{
		if(zzfd.zzah())
	//*   0    0:invokestatic    #44  <Method boolean zzfd.zzah()>
	//*   1    3:ifeq            14
		{
			zzfd.zzd(obj, l, flag);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #47  <Method void zzfd.zzd(Object, long, boolean)>
			return;
	//    6   13:return          
		} else
		{
			zzfd.zze(obj, l, flag);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #50  <Method void zzfd.zze(Object, long, boolean)>
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
		if(zzfd.zzah())
	//*   0    0:invokestatic    #44  <Method boolean zzfd.zzah()>
	//*   1    3:ifeq            14
		{
			zzfd.zzc(obj, l, byte0);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #59  <Method void zzfd.zzc(Object, long, byte)>
			return;
	//    6   13:return          
		} else
		{
			zzfd.zzd(obj, l, byte0);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #61  <Method void zzfd.zzd(Object, long, byte)>
			return;
	//   11   21:return          
		}
	}

	public final boolean zzl(Object obj, long l)
	{
		if(zzfd.zzah())
	//*   0    0:invokestatic    #44  <Method boolean zzfd.zzah()>
	//*   1    3:ifeq            12
			return zzfd.zzv(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #66  <Method boolean zzfd.zzv(Object, long)>
	//    5   11:ireturn         
		else
			return zzfd.zzw(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #69  <Method boolean zzfd.zzw(Object, long)>
	//    9   17:ireturn         
	}

	public final float zzm(Object obj, long l)
	{
		return Float.intBitsToFloat(((zzfd$zzd)this).zzj(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #75  <Method int zzfd$zzd.zzj(Object, long)>
	//    4    6:invokestatic    #79  <Method float Float.intBitsToFloat(int)>
	//    5    9:freturn         
	}

	public final double zzn(Object obj, long l)
	{
		return Double.longBitsToDouble(((zzfd$zzd)this).zzk(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #85  <Method long zzfd$zzd.zzk(Object, long)>
	//    4    6:invokestatic    #89  <Method double Double.longBitsToDouble(long)>
	//    5    9:dreturn         
	}

	public final byte zzx(Object obj, long l)
	{
		if(zzfd.zzah())
	//*   0    0:invokestatic    #44  <Method boolean zzfd.zzah()>
	//*   1    3:ifeq            12
			return zzfd.zzt(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #94  <Method byte zzfd.zzt(Object, long)>
	//    5   11:ireturn         
		else
			return zzfd.zzu(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #97  <Method byte zzfd.zzu(Object, long)>
	//    9   17:ireturn         
	}

	zzfd$zzb(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzfd$zzd(Unsafe)>
	//    3    5:return          
	}
}
