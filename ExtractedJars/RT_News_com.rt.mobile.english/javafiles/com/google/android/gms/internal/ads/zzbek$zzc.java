// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbek

static final class zzbek$zzc extends zzbek$zzd
{

	public final void zza(Object obj, long l, double d)
	{
		zzdzy.putDouble(obj, l, d);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzdzy>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:dload           4
	//    5    8:invokevirtual   #23  <Method void Unsafe.putDouble(Object, long, double)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, float f)
	{
		zzdzy.putFloat(obj, l, f);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzdzy>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:fload           4
	//    5    8:invokevirtual   #27  <Method void Unsafe.putFloat(Object, long, float)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, boolean flag)
	{
		zzdzy.putBoolean(obj, l, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzdzy>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #31  <Method void Unsafe.putBoolean(Object, long, boolean)>
	//    6   11:return          
	}

	public final void zze(Object obj, long l, byte byte0)
	{
		zzdzy.putByte(obj, l, byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzdzy>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #36  <Method void Unsafe.putByte(Object, long, byte)>
	//    6   11:return          
	}

	public final boolean zzm(Object obj, long l)
	{
		return zzdzy.getBoolean(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzdzy>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #41  <Method boolean Unsafe.getBoolean(Object, long)>
	//    5    9:ireturn         
	}

	public final float zzn(Object obj, long l)
	{
		return zzdzy.getFloat(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzdzy>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #46  <Method float Unsafe.getFloat(Object, long)>
	//    5    9:freturn         
	}

	public final double zzo(Object obj, long l)
	{
		return zzdzy.getDouble(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzdzy>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #51  <Method double Unsafe.getDouble(Object, long)>
	//    5    9:dreturn         
	}

	public final byte zzy(Object obj, long l)
	{
		return zzdzy.getByte(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzdzy>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #56  <Method byte Unsafe.getByte(Object, long)>
	//    5    9:ireturn         
	}

	zzbek$zzc(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzbek$zzd(Unsafe)>
	//    3    5:return          
	}
}
