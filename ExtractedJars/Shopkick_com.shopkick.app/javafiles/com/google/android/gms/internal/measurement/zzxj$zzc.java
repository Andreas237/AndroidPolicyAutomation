// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxj

static final class zzxj$zzc extends zzxj$zzd
{

	public final void zza(long l, byte byte0)
	{
		zzcdf.putByte(l, byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #23  <Method void Unsafe.putByte(long, byte)>
	//    5    9:return          
	}

	public final void zza(Object obj, long l, double d)
	{
		zzcdf.putDouble(obj, l, d);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:dload           4
	//    5    8:invokevirtual   #27  <Method void Unsafe.putDouble(Object, long, double)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, float f)
	{
		zzcdf.putFloat(obj, l, f);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:fload           4
	//    5    8:invokevirtual   #31  <Method void Unsafe.putFloat(Object, long, float)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, boolean flag)
	{
		zzcdf.putBoolean(obj, l, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #35  <Method void Unsafe.putBoolean(Object, long, boolean)>
	//    6   11:return          
	}

	public final void zza(byte abyte0[], long l, long l1, long l2)
	{
		zzcdf.copyMemory(((Object) (abyte0)), zzxj.zzyu() + l, ((Object) (null)), l1, l2);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:invokestatic    #40  <Method long zzxj.zzyu()>
	//    4    8:lload_2         
	//    5    9:ladd            
	//    6   10:aconst_null     
	//    7   11:lload           4
	//    8   13:lload           6
	//    9   15:invokevirtual   #44  <Method void Unsafe.copyMemory(Object, long, Object, long, long)>
	//   10   18:return          
	}

	public final void zze(Object obj, long l, byte byte0)
	{
		zzcdf.putByte(obj, l, byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #48  <Method void Unsafe.putByte(Object, long, byte)>
	//    6   11:return          
	}

	public final boolean zzm(Object obj, long l)
	{
		return zzcdf.getBoolean(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #53  <Method boolean Unsafe.getBoolean(Object, long)>
	//    5    9:ireturn         
	}

	public final float zzn(Object obj, long l)
	{
		return zzcdf.getFloat(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #58  <Method float Unsafe.getFloat(Object, long)>
	//    5    9:freturn         
	}

	public final double zzo(Object obj, long l)
	{
		return zzcdf.getDouble(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #63  <Method double Unsafe.getDouble(Object, long)>
	//    5    9:dreturn         
	}

	public final byte zzy(Object obj, long l)
	{
		return zzcdf.getByte(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Unsafe zzcdf>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #68  <Method byte Unsafe.getByte(Object, long)>
	//    5    9:ireturn         
	}

	zzxj$zzc(Unsafe unsafe)
	{
		super(unsafe);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void zzxj$zzd(Unsafe)>
	//    3    5:return          
	}
}
