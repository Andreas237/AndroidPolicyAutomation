// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbek

static final class zzbek$zza extends zzbek$zzd
{

	public final void zza(Object obj, long l, double d)
	{
		((zzbek$zzd)this).zza(obj, l, Double.doubleToLongBits(d));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:dload           4
	//    4    5:invokestatic    #19  <Method long Double.doubleToLongBits(double)>
	//    5    8:invokevirtual   #22  <Method void zzbek$zzd.zza(Object, long, long)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, float f)
	{
		((zzbek$zzd)this).zzb(obj, l, Float.floatToIntBits(f));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:fload           4
	//    4    5:invokestatic    #29  <Method int Float.floatToIntBits(float)>
	//    5    8:invokevirtual   #33  <Method void zzbek$zzd.zzb(Object, long, int)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, boolean flag)
	{
		if(zzbek.zzacm())
	//*   0    0:invokestatic    #38  <Method boolean zzbek.zzacm()>
	//*   1    3:ifeq            14
		{
			zzbek.zzd(obj, l, flag);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #41  <Method void zzbek.zzd(Object, long, boolean)>
			return;
	//    6   13:return          
		} else
		{
			zzbek.zze(obj, l, flag);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #44  <Method void zzbek.zze(Object, long, boolean)>
			return;
	//   11   21:return          
		}
	}

	public final void zze(Object obj, long l, byte byte0)
	{
		if(zzbek.zzacm())
	//*   0    0:invokestatic    #38  <Method boolean zzbek.zzacm()>
	//*   1    3:ifeq            14
		{
			zzbek.zzc(obj, l, byte0);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:iload           4
	//    5   10:invokestatic    #48  <Method void zzbek.zzc(Object, long, byte)>
			return;
	//    6   13:return          
		} else
		{
			zzbek.zzd(obj, l, byte0);
	//    7   14:aload_1         
	//    8   15:lload_2         
	//    9   16:iload           4
	//   10   18:invokestatic    #50  <Method void zzbek.zzd(Object, long, byte)>
			return;
	//   11   21:return          
		}
	}

	public final boolean zzm(Object obj, long l)
	{
		if(zzbek.zzacm())
	//*   0    0:invokestatic    #38  <Method boolean zzbek.zzacm()>
	//*   1    3:ifeq            12
			return zzbek.zzw(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #55  <Method boolean zzbek.zzw(Object, long)>
	//    5   11:ireturn         
		else
			return zzbek.zzx(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #58  <Method boolean zzbek.zzx(Object, long)>
	//    9   17:ireturn         
	}

	public final float zzn(Object obj, long l)
	{
		return Float.intBitsToFloat(((zzbek$zzd)this).zzk(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #64  <Method int zzbek$zzd.zzk(Object, long)>
	//    4    6:invokestatic    #68  <Method float Float.intBitsToFloat(int)>
	//    5    9:freturn         
	}

	public final double zzo(Object obj, long l)
	{
		return Double.longBitsToDouble(((zzbek$zzd)this).zzl(obj, l));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokevirtual   #74  <Method long zzbek$zzd.zzl(Object, long)>
	//    4    6:invokestatic    #78  <Method double Double.longBitsToDouble(long)>
	//    5    9:dreturn         
	}

	public final byte zzy(Object obj, long l)
	{
		if(zzbek.zzacm())
	//*   0    0:invokestatic    #38  <Method boolean zzbek.zzacm()>
	//*   1    3:ifeq            12
			return zzbek.zzu(obj, l);
	//    2    6:aload_1         
	//    3    7:lload_2         
	//    4    8:invokestatic    #83  <Method byte zzbek.zzu(Object, long)>
	//    5   11:ireturn         
		else
			return zzbek.zzv(obj, l);
	//    6   12:aload_1         
	//    7   13:lload_2         
	//    8   14:invokestatic    #86  <Method byte zzbek.zzv(Object, long)>
	//    9   17:ireturn         
	}

	zzbek$zza(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzbek$zzd(Unsafe)>
	//    3    5:return          
	}
}
