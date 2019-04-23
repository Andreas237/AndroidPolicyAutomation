// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zziu

static abstract class zziu$zzd
{

	public abstract void zza(long l, byte byte0);

	public abstract void zza(Object obj, long l, double d);

	public abstract void zza(Object obj, long l, float f);

	public final void zza(Object obj, long l, long l1)
	{
		zzabs.putLong(obj, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzabs>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #27  <Method void Unsafe.putLong(Object, long, long)>
	//    6   11:return          
	}

	public abstract void zza(Object obj, long l, boolean flag);

	public abstract void zza(byte abyte0[], long l, long l1, long l2);

	public final void zzb(Object obj, long l, int i)
	{
		zzabs.putInt(obj, l, i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzabs>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #34  <Method void Unsafe.putInt(Object, long, int)>
	//    6   11:return          
	}

	public abstract void zze(Object obj, long l, byte byte0);

	public final int zzk(Object obj, long l)
	{
		return zzabs.getInt(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzabs>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #41  <Method int Unsafe.getInt(Object, long)>
	//    5    9:ireturn         
	}

	public final long zzl(Object obj, long l)
	{
		return zzabs.getLong(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzabs>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #46  <Method long Unsafe.getLong(Object, long)>
	//    5    9:lreturn         
	}

	public abstract boolean zzm(Object obj, long l);

	public abstract float zzn(Object obj, long l);

	public abstract double zzo(Object obj, long l);

	public abstract byte zzy(Object obj, long l);

	Unsafe zzabs;

	zziu$zzd(Unsafe unsafe)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzabs = unsafe;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Unsafe zzabs>
	//    5    9:return          
	}
}
