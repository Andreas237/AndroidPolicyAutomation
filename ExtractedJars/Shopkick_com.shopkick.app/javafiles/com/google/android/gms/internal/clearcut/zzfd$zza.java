// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import libcore.io.Memory;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzfd

static final class zzfd$zza extends zzfd$zzd
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
		((zzfd$zzd)this).zza(obj, l, Double.doubleToLongBits(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:dload           4
	//    4    5:invokestatic    #28  <Method long Double.doubleToLongBits(double)>
	//    5    8:invokevirtual   #31  <Method void zzfd$zzd.zza(Object, long, long)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, float f)
	{
		((zzfd$zzd)this).zza(obj, l, Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:fload           4
	//    4    5:invokestatic    #38  <Method int Float.floatToIntBits(float)>
	//    5    8:invokevirtual   #41  <Method void zzfd$zzd.zza(Object, long, int)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, boolean flag)
	{
		if(zzfd.zzah())
	//*   0    0:invokestatic    #46  <Method boolean zzfd.zzah()>
	//*   1    3:ifeq            14
		{
			zzfd.zzd(obj, l, flag);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #49  <Method void zzfd.zzd(Object, long, boolean)>
			return;
	//    6   13:return          
		} else
		{
			zzfd.zze(obj, l, flag);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #52  <Method void zzfd.zze(Object, long, boolean)>
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
	//    9   13:invokestatic    #57  <Method void Memory.pokeByteArray(int, byte[], int, int)>
	//   10   16:return          
	}

	public final void zze(Object obj, long l, byte byte0)
	{
		if(zzfd.zzah())
	//*   0    0:invokestatic    #46  <Method boolean zzfd.zzah()>
	//*   1    3:ifeq            14
		{
			zzfd.zzc(obj, l, byte0);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #61  <Method void zzfd.zzc(Object, long, byte)>
			return;
	//    6   13:return          
		} else
		{
			zzfd.zzd(obj, l, byte0);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #63  <Method void zzfd.zzd(Object, long, byte)>
			return;
	//   11   21:return          
		}
	}

	public final boolean zzl(Object obj, long l)
	{
		if(zzfd.zzah())
	//*   0    0:invokestatic    #46  <Method boolean zzfd.zzah()>
	//*   1    3:ifeq            12
			return zzfd.zzv(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #68  <Method boolean zzfd.zzv(Object, long)>
	//    5   11:ireturn         
		else
			return zzfd.zzw(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #71  <Method boolean zzfd.zzw(Object, long)>
	//    9   17:ireturn         
	}

	public final float zzm(Object obj, long l)
	{
		return Float.intBitsToFloat(((zzfd$zzd)this).zzj(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #77  <Method int zzfd$zzd.zzj(Object, long)>
	//    4    6:invokestatic    #81  <Method float Float.intBitsToFloat(int)>
	//    5    9:freturn         
	}

	public final double zzn(Object obj, long l)
	{
		return Double.longBitsToDouble(((zzfd$zzd)this).zzk(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #87  <Method long zzfd$zzd.zzk(Object, long)>
	//    4    6:invokestatic    #91  <Method double Double.longBitsToDouble(long)>
	//    5    9:dreturn         
	}

	public final byte zzx(Object obj, long l)
	{
		if(zzfd.zzah())
	//*   0    0:invokestatic    #46  <Method boolean zzfd.zzah()>
	//*   1    3:ifeq            12
			return zzfd.zzt(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #96  <Method byte zzfd.zzt(Object, long)>
	//    5   11:ireturn         
		else
			return zzfd.zzu(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #99  <Method byte zzfd.zzu(Object, long)>
	//    9   17:ireturn         
	}

	zzfd$zza(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzfd$zzd(Unsafe)>
	//    3    5:return          
	}
}
