// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.clearcut:
//			zzfd

static abstract class zzfd$zzd
{

	public final long zza(Field field)
	{
		return zzqa.objectFieldOffset(field);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzqa>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #24  <Method long Unsafe.objectFieldOffset(Field)>
	//    4    8:lreturn         
	}

	public abstract void zza(long l, byte byte0);

	public abstract void zza(Object obj, long l, double d);

	public abstract void zza(Object obj, long l, float f);

	public final void zza(Object obj, long l, int i)
	{
		zzqa.putInt(obj, l, i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzqa>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:iload           4
	//    5    8:invokevirtual   #31  <Method void Unsafe.putInt(Object, long, int)>
	//    6   11:return          
	}

	public final void zza(Object obj, long l, long l1)
	{
		zzqa.putLong(obj, l, l1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzqa>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:lload           4
	//    5    8:invokevirtual   #35  <Method void Unsafe.putLong(Object, long, long)>
	//    6   11:return          
	}

	public abstract void zza(Object obj, long l, boolean flag);

	public abstract void zza(byte abyte0[], long l, long l1, long l2);

	public abstract void zze(Object obj, long l, byte byte0);

	public final int zzj(Object obj, long l)
	{
		return zzqa.getInt(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzqa>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #44  <Method int Unsafe.getInt(Object, long)>
	//    5    9:ireturn         
	}

	public final long zzk(Object obj, long l)
	{
		return zzqa.getLong(obj, l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Unsafe zzqa>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokevirtual   #49  <Method long Unsafe.getLong(Object, long)>
	//    5    9:lreturn         
	}

	public abstract boolean zzl(Object obj, long l);

	public abstract float zzm(Object obj, long l);

	public abstract double zzn(Object obj, long l);

	public abstract byte zzx(Object obj, long l);

	Unsafe zzqa;

	zzfd$zzd(Unsafe unsafe)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		zzqa = unsafe;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Unsafe zzqa>
	//    5    9:return          
	}
}
