// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import libcore.io.Memory;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxj

static final class zzxj$zza extends zzxj$zzd
{

	public final void zza(long l, byte byte0)
	{
		Memory.pokeByte((int)(l & -1L), byte0);
	//    0    0:lload_1         
	//    1    1:ldc2w           #14  <Long -1L>
	//    2    4:land            
	//    3    5:l2i             
	//    4    6:iload_3         
	//    5    7:invokestatic    #21  <Method void Memory.pokeByte(int, byte)>
	//    6   10:return          
	}

	public final void zza(Object obj, long l, double d)
	{
		((zzxj$zzd)this).zza(obj, l, Double.doubleToLongBits(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:dload           4
	//    4    5:invokestatic    #28  <Method long Double.doubleToLongBits(double)>
	//    5    8:invokevirtual   #31  <Method void zzxj$zzd.zza(Object, long, long)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, float f)
	{
		((zzxj$zzd)this).zzb(obj, l, Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:fload           4
	//    4    5:invokestatic    #38  <Method int Float.floatToIntBits(float)>
	//    5    8:invokevirtual   #42  <Method void zzxj$zzd.zzb(Object, long, int)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, boolean flag)
	{
		if(zzxj.zzvk())
	//*   0    0:invokestatic    #47  <Method boolean zzxj.zzvk()>
	//*   1    3:ifeq            14
		{
			zzxj.zzd(obj, l, flag);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #50  <Method void zzxj.zzd(Object, long, boolean)>
			return;
	//    6   13:return          
		} else
		{
			zzxj.zze(obj, l, flag);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #53  <Method void zzxj.zze(Object, long, boolean)>
			return;
	//   11   21:return          
		}
	}

	public final void zza(byte abyte0[], long l, long l1, long l2)
	{
		Memory.pokeByteArray((int)(l1 & -1L), abyte0, (int)l, (int)l2);
	//    0    0:lload           4
	//    1    2:ldc2w           #14  <Long -1L>
	//    2    5:land            
	//    3    6:l2i             
	//    4    7:aload_1         
	//    5    8:lload_2         
	//    6    9:l2i             
	//    7   10:lload           6
	//    8   12:l2i             
	//    9   13:invokestatic    #58  <Method void Memory.pokeByteArray(int, byte[], int, int)>
	//   10   16:return          
	}

	public final void zze(Object obj, long l, byte byte0)
	{
		if(zzxj.zzvk())
	//*   0    0:invokestatic    #47  <Method boolean zzxj.zzvk()>
	//*   1    3:ifeq            14
		{
			zzxj.zzc(obj, l, byte0);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #62  <Method void zzxj.zzc(Object, long, byte)>
			return;
	//    6   13:return          
		} else
		{
			zzxj.zzd(obj, l, byte0);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #64  <Method void zzxj.zzd(Object, long, byte)>
			return;
	//   11   21:return          
		}
	}

	public final boolean zzm(Object obj, long l)
	{
		if(zzxj.zzvk())
	//*   0    0:invokestatic    #47  <Method boolean zzxj.zzvk()>
	//*   1    3:ifeq            12
			return zzxj.zzw(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #69  <Method boolean zzxj.zzw(Object, long)>
	//    5   11:ireturn         
		else
			return zzxj.zzx(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #72  <Method boolean zzxj.zzx(Object, long)>
	//    9   17:ireturn         
	}

	public final float zzn(Object obj, long l)
	{
		return Float.intBitsToFloat(((zzxj$zzd)this).zzk(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #78  <Method int zzxj$zzd.zzk(Object, long)>
	//    4    6:invokestatic    #82  <Method float Float.intBitsToFloat(int)>
	//    5    9:freturn         
	}

	public final double zzo(Object obj, long l)
	{
		return Double.longBitsToDouble(((zzxj$zzd)this).zzl(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #88  <Method long zzxj$zzd.zzl(Object, long)>
	//    4    6:invokestatic    #92  <Method double Double.longBitsToDouble(long)>
	//    5    9:dreturn         
	}

	public final byte zzy(Object obj, long l)
	{
		if(zzxj.zzvk())
	//*   0    0:invokestatic    #47  <Method boolean zzxj.zzvk()>
	//*   1    3:ifeq            12
			return zzxj.zzu(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #97  <Method byte zzxj.zzu(Object, long)>
	//    5   11:ireturn         
		else
			return zzxj.zzv(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #100 <Method byte zzxj.zzv(Object, long)>
	//    9   17:ireturn         
	}

	zzxj$zza(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzxj$zzd(Unsafe)>
	//    3    5:return          
	}
}
