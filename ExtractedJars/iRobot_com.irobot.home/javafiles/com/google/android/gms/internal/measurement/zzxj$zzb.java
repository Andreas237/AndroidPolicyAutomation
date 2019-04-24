// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import libcore.io.Memory;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxj

static final class zzxj$zzb extends zzxj$zzd
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
		((zzxj$zzd)this).zza(obj, l, Double.doubleToLongBits(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:dload           4
	//    4    5:invokestatic    #26  <Method long Double.doubleToLongBits(double)>
	//    5    8:invokevirtual   #29  <Method void zzxj$zzd.zza(Object, long, long)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, float f)
	{
		((zzxj$zzd)this).zzb(obj, l, Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:fload           4
	//    4    5:invokestatic    #36  <Method int Float.floatToIntBits(float)>
	//    5    8:invokevirtual   #39  <Method void zzxj$zzd.zzb(Object, long, int)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, boolean flag)
	{
		if(zzxj.zzvk())
	//*   0    0:invokestatic    #44  <Method boolean zzxj.zzvk()>
	//*   1    3:ifeq            14
		{
			zzxj.zzd(obj, l, flag);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #47  <Method void zzxj.zzd(Object, long, boolean)>
			return;
	//    6   13:return          
		} else
		{
			zzxj.zze(obj, l, flag);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #50  <Method void zzxj.zze(Object, long, boolean)>
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
		if(zzxj.zzvk())
	//*   0    0:invokestatic    #44  <Method boolean zzxj.zzvk()>
	//*   1    3:ifeq            14
		{
			zzxj.zzc(obj, l, byte0);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #59  <Method void zzxj.zzc(Object, long, byte)>
			return;
	//    6   13:return          
		} else
		{
			zzxj.zzd(obj, l, byte0);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #61  <Method void zzxj.zzd(Object, long, byte)>
			return;
	//   11   21:return          
		}
	}

	public final boolean zzm(Object obj, long l)
	{
		if(zzxj.zzvk())
	//*   0    0:invokestatic    #44  <Method boolean zzxj.zzvk()>
	//*   1    3:ifeq            12
			return zzxj.zzw(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #66  <Method boolean zzxj.zzw(Object, long)>
	//    5   11:ireturn         
		else
			return zzxj.zzx(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #69  <Method boolean zzxj.zzx(Object, long)>
	//    9   17:ireturn         
	}

	public final float zzn(Object obj, long l)
	{
		return Float.intBitsToFloat(((zzxj$zzd)this).zzk(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #75  <Method int zzxj$zzd.zzk(Object, long)>
	//    4    6:invokestatic    #79  <Method float Float.intBitsToFloat(int)>
	//    5    9:freturn         
	}

	public final double zzo(Object obj, long l)
	{
		return Double.longBitsToDouble(((zzxj$zzd)this).zzl(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #85  <Method long zzxj$zzd.zzl(Object, long)>
	//    4    6:invokestatic    #89  <Method double Double.longBitsToDouble(long)>
	//    5    9:dreturn         
	}

	public final byte zzy(Object obj, long l)
	{
		if(zzxj.zzvk())
	//*   0    0:invokestatic    #44  <Method boolean zzxj.zzvk()>
	//*   1    3:ifeq            12
			return zzxj.zzu(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #94  <Method byte zzxj.zzu(Object, long)>
	//    5   11:ireturn         
		else
			return zzxj.zzv(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #97  <Method byte zzxj.zzv(Object, long)>
	//    9   17:ireturn         
	}

	zzxj$zzb(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzxj$zzd(Unsafe)>
	//    3    5:return          
	}
}
