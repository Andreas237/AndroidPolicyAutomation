// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.nio.*;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztb, zzxk

final class zzxj
{
	static final class zza extends zzd
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
			((zzd)this).zza(obj, l, Double.doubleToLongBits(d));
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
			((zzd)this).zzb(obj, l, Float.floatToIntBits(f));
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
			return Float.intBitsToFloat(((zzd)this).zzk(obj, l));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:invokevirtual   #78  <Method int zzxj$zzd.zzk(Object, long)>
		//    4    6:invokestatic    #82  <Method float Float.intBitsToFloat(int)>
		//    5    9:freturn         
		}

		public final double zzo(Object obj, long l)
		{
			return Double.longBitsToDouble(((zzd)this).zzl(obj, l));
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

		zza(Unsafe unsafe)
		{
			super(unsafe);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void zzxj$zzd(Unsafe)>
		//    3    5:return          
		}
	}

	static final class zzb extends zzd
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
			((zzd)this).zza(obj, l, Double.doubleToLongBits(d));
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
			((zzd)this).zzb(obj, l, Float.floatToIntBits(f));
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
			return Float.intBitsToFloat(((zzd)this).zzk(obj, l));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:lload_2         
		//    3    3:invokevirtual   #75  <Method int zzxj$zzd.zzk(Object, long)>
		//    4    6:invokestatic    #79  <Method float Float.intBitsToFloat(int)>
		//    5    9:freturn         
		}

		public final double zzo(Object obj, long l)
		{
			return Double.longBitsToDouble(((zzd)this).zzl(obj, l));
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

		zzb(Unsafe unsafe)
		{
			super(unsafe);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void zzxj$zzd(Unsafe)>
		//    3    5:return          
		}
	}

	static final class zzc extends zzd
	{

		public final void zza(long l, byte byte0)
		{
			zzcdh.putByte(l, byte0);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:lload_1         
		//    3    5:iload_3         
		//    4    6:invokevirtual   #23  <Method void Unsafe.putByte(long, byte)>
		//    5    9:return          
		}

		public final void zza(Object obj, long l, double d)
		{
			zzcdh.putDouble(obj, l, d);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:dload           4
		//    5    8:invokevirtual   #27  <Method void Unsafe.putDouble(Object, long, double)>
		//    6   11:return          
		}

		public final void zza(Object obj, long l, float f)
		{
			zzcdh.putFloat(obj, l, f);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:fload           4
		//    5    8:invokevirtual   #31  <Method void Unsafe.putFloat(Object, long, float)>
		//    6   11:return          
		}

		public final void zza(Object obj, long l, boolean flag)
		{
			zzcdh.putBoolean(obj, l, flag);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:iload           4
		//    5    8:invokevirtual   #35  <Method void Unsafe.putBoolean(Object, long, boolean)>
		//    6   11:return          
		}

		public final void zza(byte abyte0[], long l, long l1, long l2)
		{
			zzcdh.copyMemory(((Object) (abyte0)), zzxj.zzyu() + l, ((Object) (null)), l1, l2);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
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
			zzcdh.putByte(obj, l, byte0);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:iload           4
		//    5    8:invokevirtual   #48  <Method void Unsafe.putByte(Object, long, byte)>
		//    6   11:return          
		}

		public final boolean zzm(Object obj, long l)
		{
			return zzcdh.getBoolean(obj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #53  <Method boolean Unsafe.getBoolean(Object, long)>
		//    5    9:ireturn         
		}

		public final float zzn(Object obj, long l)
		{
			return zzcdh.getFloat(obj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #58  <Method float Unsafe.getFloat(Object, long)>
		//    5    9:freturn         
		}

		public final double zzo(Object obj, long l)
		{
			return zzcdh.getDouble(obj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #63  <Method double Unsafe.getDouble(Object, long)>
		//    5    9:dreturn         
		}

		public final byte zzy(Object obj, long l)
		{
			return zzcdh.getByte(obj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #68  <Method byte Unsafe.getByte(Object, long)>
		//    5    9:ireturn         
		}

		zzc(Unsafe unsafe)
		{
			super(unsafe);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void zzxj$zzd(Unsafe)>
		//    3    5:return          
		}
	}

	static abstract class zzd
	{

		public abstract void zza(long l, byte byte0);

		public abstract void zza(Object obj, long l, double d);

		public abstract void zza(Object obj, long l, float f);

		public final void zza(Object obj, long l, long l1)
		{
			zzcdh.putLong(obj, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Unsafe zzcdh>
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
			zzcdh.putInt(obj, l, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:iload           4
		//    5    8:invokevirtual   #34  <Method void Unsafe.putInt(Object, long, int)>
		//    6   11:return          
		}

		public abstract void zze(Object obj, long l, byte byte0);

		public final int zzk(Object obj, long l)
		{
			return zzcdh.getInt(obj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #41  <Method int Unsafe.getInt(Object, long)>
		//    5    9:ireturn         
		}

		public final long zzl(Object obj, long l)
		{
			return zzcdh.getLong(obj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Unsafe zzcdh>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #46  <Method long Unsafe.getLong(Object, long)>
		//    5    9:lreturn         
		}

		public abstract boolean zzm(Object obj, long l);

		public abstract float zzn(Object obj, long l);

		public abstract double zzo(Object obj, long l);

		public abstract byte zzy(Object obj, long l);

		Unsafe zzcdh;

		zzd(Unsafe unsafe)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			zzcdh = unsafe;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field Unsafe zzcdh>
		//    5    9:return          
		}
	}


	private zzxj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #193 <Method void Object()>
	//    2    4:return          
	}

	static byte zza(byte abyte0[], long l)
	{
		return zzccq.zzy(((Object) (abyte0)), zzccs + l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:getstatic       #122 <Field long zzccs>
	//    3    7:lload_1         
	//    4    8:ladd            
	//    5    9:invokevirtual   #198 <Method byte zzxj$zzd.zzy(Object, long)>
	//    6   12:ireturn         
	}

	static void zza(long l, byte byte0)
	{
		zzccq.zza(l, byte0);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:lload_0         
	//    2    4:iload_2         
	//    3    5:invokevirtual   #201 <Method void zzxj$zzd.zza(long, byte)>
	//    4    8:return          
	}

	private static void zza(Object obj, long l, byte byte0)
	{
		long l1 = -4L & l;
	//    0    0:ldc2w           #203 <Long -4L>
	//    1    3:lload_1         
	//    2    4:land            
	//    3    5:lstore          6
		int i = zzk(obj, l1);
	//    4    7:aload_0         
	//    5    8:lload           6
	//    6   10:invokestatic    #208 <Method int zzk(Object, long)>
	//    7   13:istore          4
		int j = ((int)l & 3) << 3;
	//    8   15:lload_1         
	//    9   16:l2i             
	//   10   17:iconst_3        
	//   11   18:iand            
	//   12   19:iconst_3        
	//   13   20:ishl            
	//   14   21:istore          5
		zzb(obj, l1, (0xff & byte0) << j | i & 255 << j);
	//   15   23:aload_0         
	//   16   24:lload           6
	//   17   26:sipush          255
	//   18   29:iload_3         
	//   19   30:iand            
	//   20   31:iload           5
	//   21   33:ishl            
	//   22   34:iload           4
	//   23   36:sipush          255
	//   24   39:iload           5
	//   25   41:ishl            
	//   26   42:iand            
	//   27   43:ior             
	//   28   44:invokestatic    #211 <Method void zzb(Object, long, int)>
	//   29   47:return          
	}

	static void zza(Object obj, long l, double d)
	{
		zzccq.zza(obj, l, d);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:dload_3         
	//    4    6:invokevirtual   #214 <Method void zzxj$zzd.zza(Object, long, double)>
	//    5    9:return          
	}

	static void zza(Object obj, long l, float f)
	{
		zzccq.zza(obj, l, f);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:fload_3         
	//    4    6:invokevirtual   #217 <Method void zzxj$zzd.zza(Object, long, float)>
	//    5    9:return          
	}

	static void zza(Object obj, long l, long l1)
	{
		zzccq.zza(obj, l, l1);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokevirtual   #220 <Method void zzxj$zzd.zza(Object, long, long)>
	//    5    9:return          
	}

	static void zza(Object obj, long l, Object obj1)
	{
		zzccq.zzcdh.putObject(obj, l, obj1);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:getfield        #168 <Field Unsafe zzxj$zzd.zzcdh>
	//    2    6:aload_0         
	//    3    7:lload_1         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #224 <Method void Unsafe.putObject(Object, long, Object)>
	//    6   12:return          
	}

	static void zza(Object obj, long l, boolean flag)
	{
		zzccq.zza(obj, l, flag);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #227 <Method void zzxj$zzd.zza(Object, long, boolean)>
	//    5    9:return          
	}

	static void zza(byte abyte0[], long l, byte byte0)
	{
		zzccq.zze(((Object) (abyte0)), zzccs + l, byte0);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:getstatic       #122 <Field long zzccs>
	//    3    7:lload_1         
	//    4    8:ladd            
	//    5    9:iload_3         
	//    6   10:invokevirtual   #231 <Method void zzxj$zzd.zze(Object, long, byte)>
	//    7   13:return          
	}

	static void zza(byte abyte0[], long l, long l1, long l2)
	{
		zzccq.zza(abyte0, l, l1, l2);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:lload           5
	//    5    8:invokevirtual   #234 <Method void zzxj$zzd.zza(byte[], long, long, long)>
	//    6   11:return          
	}

	static long zzb(ByteBuffer bytebuffer)
	{
		return zzccq.zzl(((Object) (bytebuffer)), zzcdf);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:getstatic       #178 <Field long zzcdf>
	//    3    7:invokevirtual   #238 <Method long zzxj$zzd.zzl(Object, long)>
	//    4   10:lreturn         
	}

	private static Field zzb(Class class1, String s)
	{
		try
		{
			class1 = ((Class) (class1.getDeclaredField(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #245 <Method Field Class.getDeclaredField(String)>
	//    3    5:astore_0        
			((Field) (class1)).setAccessible(true);
	//    4    6:aload_0         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #251 <Method void Field.setAccessible(boolean)>
		}
	//*   7   11:aload_0         
	//*   8   12:areturn         
	//*   9   13:aconst_null     
	//*  10   14:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
		{
			return null;
		}
		return ((Field) (class1));
	//*  11   15:astore_0        
	//*  12   16:goto            13
	}

	private static void zzb(Object obj, long l, byte byte0)
	{
		long l1 = -4L & l;
	//    0    0:ldc2w           #203 <Long -4L>
	//    1    3:lload_1         
	//    2    4:land            
	//    3    5:lstore          6
		int i = zzk(obj, l1);
	//    4    7:aload_0         
	//    5    8:lload           6
	//    6   10:invokestatic    #208 <Method int zzk(Object, long)>
	//    7   13:istore          4
		int j = ((int)l & 3) << 3;
	//    8   15:lload_1         
	//    9   16:l2i             
	//   10   17:iconst_3        
	//   11   18:iand            
	//   12   19:iconst_3        
	//   13   20:ishl            
	//   14   21:istore          5
		zzb(obj, l1, (0xff & byte0) << j | i & 255 << j);
	//   15   23:aload_0         
	//   16   24:lload           6
	//   17   26:sipush          255
	//   18   29:iload_3         
	//   19   30:iand            
	//   20   31:iload           5
	//   21   33:ishl            
	//   22   34:iload           4
	//   23   36:sipush          255
	//   24   39:iload           5
	//   25   41:ishl            
	//   26   42:iand            
	//   27   43:ior             
	//   28   44:invokestatic    #211 <Method void zzb(Object, long, int)>
	//   29   47:return          
	}

	static void zzb(Object obj, long l, int i)
	{
		zzccq.zzb(obj, l, i);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #254 <Method void zzxj$zzd.zzb(Object, long, int)>
	//    5    9:return          
	}

	private static void zzb(Object obj, long l, boolean flag)
	{
		zza(obj, l, (byte)flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:int2byte        
	//    4    4:invokestatic    #256 <Method void zza(Object, long, byte)>
	//    5    7:return          
	}

	static void zzc(Object obj, long l, byte byte0)
	{
		zza(obj, l, byte0);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokestatic    #256 <Method void zza(Object, long, byte)>
	//    4    6:return          
	}

	private static void zzc(Object obj, long l, boolean flag)
	{
		zzb(obj, l, (byte)flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:int2byte        
	//    4    4:invokestatic    #258 <Method void zzb(Object, long, byte)>
	//    5    7:return          
	}

	static void zzd(Object obj, long l, byte byte0)
	{
		zzb(obj, l, byte0);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokestatic    #258 <Method void zzb(Object, long, byte)>
	//    4    6:return          
	}

	static void zzd(Object obj, long l, boolean flag)
	{
		zzb(obj, l, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokestatic    #260 <Method void zzb(Object, long, boolean)>
	//    4    6:return          
	}

	static void zze(Object obj, long l, boolean flag)
	{
		zzc(obj, l, flag);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:iload_3         
	//    3    3:invokestatic    #262 <Method void zzc(Object, long, boolean)>
	//    4    6:return          
	}

	static int zzk(Object obj, long l)
	{
		return zzccq.zzk(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #263 <Method int zzxj$zzd.zzk(Object, long)>
	//    4    8:ireturn         
	}

	static Object zzk(Class class1)
	{
		try
		{
			class1 = ((Class) (zzcar.allocateInstance(class1)));
	//    0    0:getstatic       #68  <Field Unsafe zzcar>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #269 <Method Object Unsafe.allocateInstance(Class)>
	//    3    7:astore_0        
		}
	//*   4    8:aload_0         
	//*   5    9:areturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//*   6   10:astore_0        
		{
			throw new IllegalStateException(((Throwable) (class1)));
	//    7   11:new             #271 <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #274 <Method void IllegalStateException(Throwable)>
	//   11   19:athrow          
		}
		return ((Object) (class1));
	}

	private static int zzl(Class class1)
	{
		if(zzbuo)
	//*   0    0:getstatic       #114 <Field boolean zzbuo>
	//*   1    3:ifeq            17
			return zzccq.zzcdh.arrayBaseOffset(class1);
	//    2    6:getstatic       #104 <Field zzxj$zzd zzccq>
	//    3    9:getfield        #168 <Field Unsafe zzxj$zzd.zzcdh>
	//    4   12:aload_0         
	//    5   13:invokevirtual   #278 <Method int Unsafe.arrayBaseOffset(Class)>
	//    6   16:ireturn         
		else
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
	}

	static long zzl(Object obj, long l)
	{
		return zzccq.zzl(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #238 <Method long zzxj$zzd.zzl(Object, long)>
	//    4    8:lreturn         
	}

	private static int zzm(Class class1)
	{
		if(zzbuo)
	//*   0    0:getstatic       #114 <Field boolean zzbuo>
	//*   1    3:ifeq            17
			return zzccq.zzcdh.arrayIndexScale(class1);
	//    2    6:getstatic       #104 <Field zzxj$zzd zzccq>
	//    3    9:getfield        #168 <Field Unsafe zzxj$zzd.zzcdh>
	//    4   12:aload_0         
	//    5   13:invokevirtual   #282 <Method int Unsafe.arrayIndexScale(Class)>
	//    6   16:ireturn         
		else
			return -1;
	//    7   17:iconst_m1       
	//    8   18:ireturn         
	}

	static boolean zzm(Object obj, long l)
	{
		return zzccq.zzm(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #285 <Method boolean zzxj$zzd.zzm(Object, long)>
	//    4    8:ireturn         
	}

	static float zzn(Object obj, long l)
	{
		return zzccq.zzn(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #288 <Method float zzxj$zzd.zzn(Object, long)>
	//    4    8:freturn         
	}

	private static boolean zzn(Class class1)
	{
		if(!zztb.zzub())
	//*   0    0:invokestatic    #96  <Method boolean zztb.zzub()>
	//*   1    3:ifne            8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		try
		{
			Class class2 = zzbto;
	//    4    8:getstatic       #76  <Field Class zzbto>
	//    5   11:astore_1        
			class2.getMethod("peekLong", new Class[] {
				class1, Boolean.TYPE
			});
	//    6   12:aload_1         
	//    7   13:ldc2            #290 <String "peekLong">
	//    8   16:iconst_2        
	//    9   17:anewarray       Class[]
	//   10   20:dup             
	//   11   21:iconst_0        
	//   12   22:aload_0         
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_1        
	//   16   26:getstatic       #293 <Field Class Boolean.TYPE>
	//   17   29:aastore         
	//   18   30:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   19   33:pop             
			class2.getMethod("pokeLong", new Class[] {
				class1, Long.TYPE, Boolean.TYPE
			});
	//   20   34:aload_1         
	//   21   35:ldc2            #299 <String "pokeLong">
	//   22   38:iconst_3        
	//   23   39:anewarray       Class[]
	//   24   42:dup             
	//   25   43:iconst_0        
	//   26   44:aload_0         
	//   27   45:aastore         
	//   28   46:dup             
	//   29   47:iconst_1        
	//   30   48:getstatic       #81  <Field Class Long.TYPE>
	//   31   51:aastore         
	//   32   52:dup             
	//   33   53:iconst_2        
	//   34   54:getstatic       #293 <Field Class Boolean.TYPE>
	//   35   57:aastore         
	//   36   58:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   37   61:pop             
			class2.getMethod("pokeInt", new Class[] {
				class1, Integer.TYPE, Boolean.TYPE
			});
	//   38   62:aload_1         
	//   39   63:ldc2            #301 <String "pokeInt">
	//   40   66:iconst_3        
	//   41   67:anewarray       Class[]
	//   42   70:dup             
	//   43   71:iconst_0        
	//   44   72:aload_0         
	//   45   73:aastore         
	//   46   74:dup             
	//   47   75:iconst_1        
	//   48   76:getstatic       #90  <Field Class Integer.TYPE>
	//   49   79:aastore         
	//   50   80:dup             
	//   51   81:iconst_2        
	//   52   82:getstatic       #293 <Field Class Boolean.TYPE>
	//   53   85:aastore         
	//   54   86:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   55   89:pop             
			class2.getMethod("peekInt", new Class[] {
				class1, Boolean.TYPE
			});
	//   56   90:aload_1         
	//   57   91:ldc2            #303 <String "peekInt">
	//   58   94:iconst_2        
	//   59   95:anewarray       Class[]
	//   60   98:dup             
	//   61   99:iconst_0        
	//   62  100:aload_0         
	//   63  101:aastore         
	//   64  102:dup             
	//   65  103:iconst_1        
	//   66  104:getstatic       #293 <Field Class Boolean.TYPE>
	//   67  107:aastore         
	//   68  108:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   69  111:pop             
			class2.getMethod("pokeByte", new Class[] {
				class1, Byte.TYPE
			});
	//   70  112:aload_1         
	//   71  113:ldc2            #305 <String "pokeByte">
	//   72  116:iconst_2        
	//   73  117:anewarray       Class[]
	//   74  120:dup             
	//   75  121:iconst_0        
	//   76  122:aload_0         
	//   77  123:aastore         
	//   78  124:dup             
	//   79  125:iconst_1        
	//   80  126:getstatic       #308 <Field Class Byte.TYPE>
	//   81  129:aastore         
	//   82  130:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   83  133:pop             
			class2.getMethod("peekByte", new Class[] {
				class1
			});
	//   84  134:aload_1         
	//   85  135:ldc2            #310 <String "peekByte">
	//   86  138:iconst_1        
	//   87  139:anewarray       Class[]
	//   88  142:dup             
	//   89  143:iconst_0        
	//   90  144:aload_0         
	//   91  145:aastore         
	//   92  146:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   93  149:pop             
			class2.getMethod("pokeByteArray", new Class[] {
				class1, [B, Integer.TYPE, Integer.TYPE
			});
	//   94  150:aload_1         
	//   95  151:ldc2            #312 <String "pokeByteArray">
	//   96  154:iconst_4        
	//   97  155:anewarray       Class[]
	//   98  158:dup             
	//   99  159:iconst_0        
	//  100  160:aload_0         
	//  101  161:aastore         
	//  102  162:dup             
	//  103  163:iconst_1        
	//  104  164:ldc1            #116 <Class byte[]>
	//  105  166:aastore         
	//  106  167:dup             
	//  107  168:iconst_2        
	//  108  169:getstatic       #90  <Field Class Integer.TYPE>
	//  109  172:aastore         
	//  110  173:dup             
	//  111  174:iconst_3        
	//  112  175:getstatic       #90  <Field Class Integer.TYPE>
	//  113  178:aastore         
	//  114  179:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  115  182:pop             
			class2.getMethod("peekByteArray", new Class[] {
				class1, [B, Integer.TYPE, Integer.TYPE
			});
	//  116  183:aload_1         
	//  117  184:ldc2            #314 <String "peekByteArray">
	//  118  187:iconst_4        
	//  119  188:anewarray       Class[]
	//  120  191:dup             
	//  121  192:iconst_0        
	//  122  193:aload_0         
	//  123  194:aastore         
	//  124  195:dup             
	//  125  196:iconst_1        
	//  126  197:ldc1            #116 <Class byte[]>
	//  127  199:aastore         
	//  128  200:dup             
	//  129  201:iconst_2        
	//  130  202:getstatic       #90  <Field Class Integer.TYPE>
	//  131  205:aastore         
	//  132  206:dup             
	//  133  207:iconst_3        
	//  134  208:getstatic       #90  <Field Class Integer.TYPE>
	//  135  211:aastore         
	//  136  212:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  137  215:pop             
		}
	//* 138  216:iconst_1        
	//* 139  217:ireturn         
		// Misplaced declaration of an exception variable
		catch(Class class1)
	//* 140  218:astore_0        
		{
			return false;
	//  141  219:iconst_0        
	//  142  220:ireturn         
		}
		return true;
	}

	static double zzo(Object obj, long l)
	{
		return zzccq.zzo(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #319 <Method double zzxj$zzd.zzo(Object, long)>
	//    4    8:dreturn         
	}

	static Object zzp(Object obj, long l)
	{
		return zzccq.zzcdh.getObject(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzccq>
	//    1    3:getfield        #168 <Field Unsafe zzxj$zzd.zzcdh>
	//    2    6:aload_0         
	//    3    7:lload_1         
	//    4    8:invokevirtual   #324 <Method Object Unsafe.getObject(Object, long)>
	//    5   11:areturn         
	}

	private static byte zzq(Object obj, long l)
	{
		return (byte)(zzk(obj, -4L & l) >>> (int)((l & 3L) << 3));
	//    0    0:aload_0         
	//    1    1:ldc2w           #203 <Long -4L>
	//    2    4:lload_1         
	//    3    5:land            
	//    4    6:invokestatic    #208 <Method int zzk(Object, long)>
	//    5    9:lload_1         
	//    6   10:ldc2w           #326 <Long 3L>
	//    7   13:land            
	//    8   14:iconst_3        
	//    9   15:lshl            
	//   10   16:l2i             
	//   11   17:iushr           
	//   12   18:int2byte        
	//   13   19:ireturn         
	}

	private static byte zzr(Object obj, long l)
	{
		return (byte)(zzk(obj, -4L & l) >>> (int)((l & 3L) << 3));
	//    0    0:aload_0         
	//    1    1:ldc2w           #203 <Long -4L>
	//    2    4:lload_1         
	//    3    5:land            
	//    4    6:invokestatic    #208 <Method int zzk(Object, long)>
	//    5    9:lload_1         
	//    6   10:ldc2w           #326 <Long 3L>
	//    7   13:land            
	//    8   14:iconst_3        
	//    9   15:lshl            
	//   10   16:l2i             
	//   11   17:iushr           
	//   12   18:int2byte        
	//   13   19:ireturn         
	}

	private static boolean zzs(Object obj, long l)
	{
		return zzq(obj, l) != 0;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #331 <Method byte zzq(Object, long)>
	//    3    5:ifeq            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	private static boolean zzt(Object obj, long l)
	{
		return zzr(obj, l) != 0;
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #334 <Method byte zzr(Object, long)>
	//    3    5:ifeq            10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	static byte zzu(Object obj, long l)
	{
		return zzq(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #331 <Method byte zzq(Object, long)>
	//    3    5:ireturn         
	}

	static byte zzv(Object obj, long l)
	{
		return zzr(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #334 <Method byte zzr(Object, long)>
	//    3    5:ireturn         
	}

	static boolean zzvk()
	{
		return zzcdg;
	//    0    0:getstatic       #190 <Field boolean zzcdg>
	//    1    3:ireturn         
	}

	static boolean zzw(Object obj, long l)
	{
		return zzs(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #340 <Method boolean zzs(Object, long)>
	//    3    5:ireturn         
	}

	static boolean zzx(Object obj, long l)
	{
		return zzt(obj, l);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #343 <Method boolean zzt(Object, long)>
	//    3    5:ireturn         
	}

	static boolean zzyo()
	{
		return zzbuo;
	//    0    0:getstatic       #114 <Field boolean zzbuo>
	//    1    3:ireturn         
	}

	static boolean zzyp()
	{
		return zzccr;
	//    0    0:getstatic       #109 <Field boolean zzccr>
	//    1    3:ireturn         
	}

	static Unsafe zzyq()
	{
		Throwable throwable;
		Unsafe unsafe;
		try
		{
			unsafe = (Unsafe)AccessController.doPrivileged(((java.security.PrivilegedExceptionAction) (new zzxk())));
	//    0    0:new             #347 <Class zzxk>
	//    1    3:dup             
	//    2    4:invokespecial   #348 <Method void zzxk()>
	//    3    7:invokestatic    #354 <Method Object AccessController.doPrivileged(java.security.PrivilegedExceptionAction)>
	//    4   10:checkcast       #170 <Class Unsafe>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:areturn         
	//*   8   16:aconst_null     
	//*   9   17:areturn         
		// Misplaced declaration of an exception variable
		catch(Throwable throwable)
		{
			return null;
		}
		return unsafe;
	//*  10   18:astore_0        
	//*  11   19:goto            16
	}

	private static boolean zzyr()
	{
		if(zzcar == null)
	//*   0    0:getstatic       #68  <Field Unsafe zzcar>
	//*   1    3:ifnonnull       8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		Class class1;
		class1 = ((Object) (zzcar)).getClass();
	//    4    8:getstatic       #68  <Field Unsafe zzcar>
	//    5   11:invokevirtual   #357 <Method Class Object.getClass()>
	//    6   14:astore_0        
		class1.getMethod("objectFieldOffset", new Class[] {
			java/lang/reflect/Field
		});
	//    7   15:aload_0         
	//    8   16:ldc2            #358 <String "objectFieldOffset">
	//    9   19:iconst_1        
	//   10   20:anewarray       Class[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:ldc1            #247 <Class Field>
	//   14   27:aastore         
	//   15   28:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   16   31:pop             
		class1.getMethod("arrayBaseOffset", new Class[] {
			java/lang/Class
		});
	//   17   32:aload_0         
	//   18   33:ldc2            #359 <String "arrayBaseOffset">
	//   19   36:iconst_1        
	//   20   37:anewarray       Class[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:ldc1            #50  <Class Class>
	//   24   44:aastore         
	//   25   45:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   26   48:pop             
		class1.getMethod("arrayIndexScale", new Class[] {
			java/lang/Class
		});
	//   27   49:aload_0         
	//   28   50:ldc2            #360 <String "arrayIndexScale">
	//   29   53:iconst_1        
	//   30   54:anewarray       Class[]
	//   31   57:dup             
	//   32   58:iconst_0        
	//   33   59:ldc1            #50  <Class Class>
	//   34   61:aastore         
	//   35   62:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   36   65:pop             
		class1.getMethod("getInt", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   37   66:aload_0         
	//   38   67:ldc2            #362 <String "getInt">
	//   39   70:iconst_2        
	//   40   71:anewarray       Class[]
	//   41   74:dup             
	//   42   75:iconst_0        
	//   43   76:ldc1            #4   <Class Object>
	//   44   78:aastore         
	//   45   79:dup             
	//   46   80:iconst_1        
	//   47   81:getstatic       #81  <Field Class Long.TYPE>
	//   48   84:aastore         
	//   49   85:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   50   88:pop             
		class1.getMethod("putInt", new Class[] {
			java/lang/Object, Long.TYPE, Integer.TYPE
		});
	//   51   89:aload_0         
	//   52   90:ldc2            #364 <String "putInt">
	//   53   93:iconst_3        
	//   54   94:anewarray       Class[]
	//   55   97:dup             
	//   56   98:iconst_0        
	//   57   99:ldc1            #4   <Class Object>
	//   58  101:aastore         
	//   59  102:dup             
	//   60  103:iconst_1        
	//   61  104:getstatic       #81  <Field Class Long.TYPE>
	//   62  107:aastore         
	//   63  108:dup             
	//   64  109:iconst_2        
	//   65  110:getstatic       #90  <Field Class Integer.TYPE>
	//   66  113:aastore         
	//   67  114:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   68  117:pop             
		class1.getMethod("getLong", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   69  118:aload_0         
	//   70  119:ldc2            #366 <String "getLong">
	//   71  122:iconst_2        
	//   72  123:anewarray       Class[]
	//   73  126:dup             
	//   74  127:iconst_0        
	//   75  128:ldc1            #4   <Class Object>
	//   76  130:aastore         
	//   77  131:dup             
	//   78  132:iconst_1        
	//   79  133:getstatic       #81  <Field Class Long.TYPE>
	//   80  136:aastore         
	//   81  137:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   82  140:pop             
		class1.getMethod("putLong", new Class[] {
			java/lang/Object, Long.TYPE, Long.TYPE
		});
	//   83  141:aload_0         
	//   84  142:ldc2            #368 <String "putLong">
	//   85  145:iconst_3        
	//   86  146:anewarray       Class[]
	//   87  149:dup             
	//   88  150:iconst_0        
	//   89  151:ldc1            #4   <Class Object>
	//   90  153:aastore         
	//   91  154:dup             
	//   92  155:iconst_1        
	//   93  156:getstatic       #81  <Field Class Long.TYPE>
	//   94  159:aastore         
	//   95  160:dup             
	//   96  161:iconst_2        
	//   97  162:getstatic       #81  <Field Class Long.TYPE>
	//   98  165:aastore         
	//   99  166:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  100  169:pop             
		class1.getMethod("getObject", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//  101  170:aload_0         
	//  102  171:ldc2            #369 <String "getObject">
	//  103  174:iconst_2        
	//  104  175:anewarray       Class[]
	//  105  178:dup             
	//  106  179:iconst_0        
	//  107  180:ldc1            #4   <Class Object>
	//  108  182:aastore         
	//  109  183:dup             
	//  110  184:iconst_1        
	//  111  185:getstatic       #81  <Field Class Long.TYPE>
	//  112  188:aastore         
	//  113  189:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  114  192:pop             
		class1.getMethod("putObject", new Class[] {
			java/lang/Object, Long.TYPE, java/lang/Object
		});
	//  115  193:aload_0         
	//  116  194:ldc2            #370 <String "putObject">
	//  117  197:iconst_3        
	//  118  198:anewarray       Class[]
	//  119  201:dup             
	//  120  202:iconst_0        
	//  121  203:ldc1            #4   <Class Object>
	//  122  205:aastore         
	//  123  206:dup             
	//  124  207:iconst_1        
	//  125  208:getstatic       #81  <Field Class Long.TYPE>
	//  126  211:aastore         
	//  127  212:dup             
	//  128  213:iconst_2        
	//  129  214:ldc1            #4   <Class Object>
	//  130  216:aastore         
	//  131  217:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  132  220:pop             
		if(zztb.zzub())
	//* 133  221:invokestatic    #96  <Method boolean zztb.zzub()>
	//* 134  224:ifeq            229
			return true;
	//  135  227:iconst_1        
	//  136  228:ireturn         
		try
		{
			class1.getMethod("getByte", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  137  229:aload_0         
	//  138  230:ldc2            #372 <String "getByte">
	//  139  233:iconst_2        
	//  140  234:anewarray       Class[]
	//  141  237:dup             
	//  142  238:iconst_0        
	//  143  239:ldc1            #4   <Class Object>
	//  144  241:aastore         
	//  145  242:dup             
	//  146  243:iconst_1        
	//  147  244:getstatic       #81  <Field Class Long.TYPE>
	//  148  247:aastore         
	//  149  248:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  150  251:pop             
			class1.getMethod("putByte", new Class[] {
				java/lang/Object, Long.TYPE, Byte.TYPE
			});
	//  151  252:aload_0         
	//  152  253:ldc2            #374 <String "putByte">
	//  153  256:iconst_3        
	//  154  257:anewarray       Class[]
	//  155  260:dup             
	//  156  261:iconst_0        
	//  157  262:ldc1            #4   <Class Object>
	//  158  264:aastore         
	//  159  265:dup             
	//  160  266:iconst_1        
	//  161  267:getstatic       #81  <Field Class Long.TYPE>
	//  162  270:aastore         
	//  163  271:dup             
	//  164  272:iconst_2        
	//  165  273:getstatic       #308 <Field Class Byte.TYPE>
	//  166  276:aastore         
	//  167  277:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  168  280:pop             
			class1.getMethod("getBoolean", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  169  281:aload_0         
	//  170  282:ldc2            #376 <String "getBoolean">
	//  171  285:iconst_2        
	//  172  286:anewarray       Class[]
	//  173  289:dup             
	//  174  290:iconst_0        
	//  175  291:ldc1            #4   <Class Object>
	//  176  293:aastore         
	//  177  294:dup             
	//  178  295:iconst_1        
	//  179  296:getstatic       #81  <Field Class Long.TYPE>
	//  180  299:aastore         
	//  181  300:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  182  303:pop             
			class1.getMethod("putBoolean", new Class[] {
				java/lang/Object, Long.TYPE, Boolean.TYPE
			});
	//  183  304:aload_0         
	//  184  305:ldc2            #378 <String "putBoolean">
	//  185  308:iconst_3        
	//  186  309:anewarray       Class[]
	//  187  312:dup             
	//  188  313:iconst_0        
	//  189  314:ldc1            #4   <Class Object>
	//  190  316:aastore         
	//  191  317:dup             
	//  192  318:iconst_1        
	//  193  319:getstatic       #81  <Field Class Long.TYPE>
	//  194  322:aastore         
	//  195  323:dup             
	//  196  324:iconst_2        
	//  197  325:getstatic       #293 <Field Class Boolean.TYPE>
	//  198  328:aastore         
	//  199  329:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  200  332:pop             
			class1.getMethod("getFloat", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  201  333:aload_0         
	//  202  334:ldc2            #380 <String "getFloat">
	//  203  337:iconst_2        
	//  204  338:anewarray       Class[]
	//  205  341:dup             
	//  206  342:iconst_0        
	//  207  343:ldc1            #4   <Class Object>
	//  208  345:aastore         
	//  209  346:dup             
	//  210  347:iconst_1        
	//  211  348:getstatic       #81  <Field Class Long.TYPE>
	//  212  351:aastore         
	//  213  352:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  214  355:pop             
			class1.getMethod("putFloat", new Class[] {
				java/lang/Object, Long.TYPE, Float.TYPE
			});
	//  215  356:aload_0         
	//  216  357:ldc2            #382 <String "putFloat">
	//  217  360:iconst_3        
	//  218  361:anewarray       Class[]
	//  219  364:dup             
	//  220  365:iconst_0        
	//  221  366:ldc1            #4   <Class Object>
	//  222  368:aastore         
	//  223  369:dup             
	//  224  370:iconst_1        
	//  225  371:getstatic       #81  <Field Class Long.TYPE>
	//  226  374:aastore         
	//  227  375:dup             
	//  228  376:iconst_2        
	//  229  377:getstatic       #385 <Field Class Float.TYPE>
	//  230  380:aastore         
	//  231  381:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  232  384:pop             
			class1.getMethod("getDouble", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  233  385:aload_0         
	//  234  386:ldc2            #387 <String "getDouble">
	//  235  389:iconst_2        
	//  236  390:anewarray       Class[]
	//  237  393:dup             
	//  238  394:iconst_0        
	//  239  395:ldc1            #4   <Class Object>
	//  240  397:aastore         
	//  241  398:dup             
	//  242  399:iconst_1        
	//  243  400:getstatic       #81  <Field Class Long.TYPE>
	//  244  403:aastore         
	//  245  404:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  246  407:pop             
			class1.getMethod("putDouble", new Class[] {
				java/lang/Object, Long.TYPE, Double.TYPE
			});
	//  247  408:aload_0         
	//  248  409:ldc2            #389 <String "putDouble">
	//  249  412:iconst_3        
	//  250  413:anewarray       Class[]
	//  251  416:dup             
	//  252  417:iconst_0        
	//  253  418:ldc1            #4   <Class Object>
	//  254  420:aastore         
	//  255  421:dup             
	//  256  422:iconst_1        
	//  257  423:getstatic       #81  <Field Class Long.TYPE>
	//  258  426:aastore         
	//  259  427:dup             
	//  260  428:iconst_2        
	//  261  429:getstatic       #392 <Field Class Double.TYPE>
	//  262  432:aastore         
	//  263  433:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  264  436:pop             
		}
	//* 265  437:iconst_1        
	//* 266  438:ireturn         
		catch(Throwable throwable)
	//* 267  439:astore_2        
		{
			Logger logger1 = logger;
	//  268  440:getstatic       #62  <Field Logger logger>
	//  269  443:astore_0        
			Level level = Level.WARNING;
	//  270  444:getstatic       #398 <Field Level Level.WARNING>
	//  271  447:astore_1        
			String s = String.valueOf(((Object) (throwable)));
	//  272  448:aload_2         
	//  273  449:invokestatic    #404 <Method String String.valueOf(Object)>
	//  274  452:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 71);
	//  275  453:new             #406 <Class StringBuilder>
	//  276  456:dup             
	//  277  457:aload_2         
	//  278  458:invokestatic    #404 <Method String String.valueOf(Object)>
	//  279  461:invokevirtual   #410 <Method int String.length()>
	//  280  464:bipush          71
	//  281  466:iadd            
	//  282  467:invokespecial   #413 <Method void StringBuilder(int)>
	//  283  470:astore_3        
			stringbuilder.append("platform method missing - proto runtime falling back to safer methods: ");
	//  284  471:aload_3         
	//  285  472:ldc2            #415 <String "platform method missing - proto runtime falling back to safer methods: ">
	//  286  475:invokevirtual   #419 <Method StringBuilder StringBuilder.append(String)>
	//  287  478:pop             
			stringbuilder.append(s);
	//  288  479:aload_3         
	//  289  480:aload_2         
	//  290  481:invokevirtual   #419 <Method StringBuilder StringBuilder.append(String)>
	//  291  484:pop             
			logger1.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringbuilder.toString());
	//  292  485:aload_0         
	//  293  486:aload_1         
	//  294  487:ldc2            #421 <String "com.google.protobuf.UnsafeUtil">
	//  295  490:ldc2            #423 <String "supportsUnsafeArrayOperations">
	//  296  493:aload_3         
	//  297  494:invokevirtual   #426 <Method String StringBuilder.toString()>
	//  298  497:invokevirtual   #430 <Method void Logger.logp(Level, String, String, String)>
			return false;
	//  299  500:iconst_0        
	//  300  501:ireturn         
		}
		return true;
	}

	private static boolean zzys()
	{
		if(zzcar == null)
	//*   0    0:getstatic       #68  <Field Unsafe zzcar>
	//*   1    3:ifnonnull       8
			return false;
	//    2    6:iconst_0        
	//    3    7:ireturn         
		Class class1;
		class1 = ((Object) (zzcar)).getClass();
	//    4    8:getstatic       #68  <Field Unsafe zzcar>
	//    5   11:invokevirtual   #357 <Method Class Object.getClass()>
	//    6   14:astore_0        
		class1.getMethod("objectFieldOffset", new Class[] {
			java/lang/reflect/Field
		});
	//    7   15:aload_0         
	//    8   16:ldc2            #358 <String "objectFieldOffset">
	//    9   19:iconst_1        
	//   10   20:anewarray       Class[]
	//   11   23:dup             
	//   12   24:iconst_0        
	//   13   25:ldc1            #247 <Class Field>
	//   14   27:aastore         
	//   15   28:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   16   31:pop             
		class1.getMethod("getLong", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   17   32:aload_0         
	//   18   33:ldc2            #366 <String "getLong">
	//   19   36:iconst_2        
	//   20   37:anewarray       Class[]
	//   21   40:dup             
	//   22   41:iconst_0        
	//   23   42:ldc1            #4   <Class Object>
	//   24   44:aastore         
	//   25   45:dup             
	//   26   46:iconst_1        
	//   27   47:getstatic       #81  <Field Class Long.TYPE>
	//   28   50:aastore         
	//   29   51:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   30   54:pop             
		if(zzyt() == null)
	//*  31   55:invokestatic    #165 <Method Field zzyt()>
	//*  32   58:ifnonnull       63
			return false;
	//   33   61:iconst_0        
	//   34   62:ireturn         
		if(zztb.zzub())
	//*  35   63:invokestatic    #96  <Method boolean zztb.zzub()>
	//*  36   66:ifeq            71
			return true;
	//   37   69:iconst_1        
	//   38   70:ireturn         
		try
		{
			class1.getMethod("getByte", new Class[] {
				Long.TYPE
			});
	//   39   71:aload_0         
	//   40   72:ldc2            #372 <String "getByte">
	//   41   75:iconst_1        
	//   42   76:anewarray       Class[]
	//   43   79:dup             
	//   44   80:iconst_0        
	//   45   81:getstatic       #81  <Field Class Long.TYPE>
	//   46   84:aastore         
	//   47   85:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   48   88:pop             
			class1.getMethod("putByte", new Class[] {
				Long.TYPE, Byte.TYPE
			});
	//   49   89:aload_0         
	//   50   90:ldc2            #374 <String "putByte">
	//   51   93:iconst_2        
	//   52   94:anewarray       Class[]
	//   53   97:dup             
	//   54   98:iconst_0        
	//   55   99:getstatic       #81  <Field Class Long.TYPE>
	//   56  102:aastore         
	//   57  103:dup             
	//   58  104:iconst_1        
	//   59  105:getstatic       #308 <Field Class Byte.TYPE>
	//   60  108:aastore         
	//   61  109:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   62  112:pop             
			class1.getMethod("getInt", new Class[] {
				Long.TYPE
			});
	//   63  113:aload_0         
	//   64  114:ldc2            #362 <String "getInt">
	//   65  117:iconst_1        
	//   66  118:anewarray       Class[]
	//   67  121:dup             
	//   68  122:iconst_0        
	//   69  123:getstatic       #81  <Field Class Long.TYPE>
	//   70  126:aastore         
	//   71  127:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   72  130:pop             
			class1.getMethod("putInt", new Class[] {
				Long.TYPE, Integer.TYPE
			});
	//   73  131:aload_0         
	//   74  132:ldc2            #364 <String "putInt">
	//   75  135:iconst_2        
	//   76  136:anewarray       Class[]
	//   77  139:dup             
	//   78  140:iconst_0        
	//   79  141:getstatic       #81  <Field Class Long.TYPE>
	//   80  144:aastore         
	//   81  145:dup             
	//   82  146:iconst_1        
	//   83  147:getstatic       #90  <Field Class Integer.TYPE>
	//   84  150:aastore         
	//   85  151:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   86  154:pop             
			class1.getMethod("getLong", new Class[] {
				Long.TYPE
			});
	//   87  155:aload_0         
	//   88  156:ldc2            #366 <String "getLong">
	//   89  159:iconst_1        
	//   90  160:anewarray       Class[]
	//   91  163:dup             
	//   92  164:iconst_0        
	//   93  165:getstatic       #81  <Field Class Long.TYPE>
	//   94  168:aastore         
	//   95  169:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   96  172:pop             
			class1.getMethod("putLong", new Class[] {
				Long.TYPE, Long.TYPE
			});
	//   97  173:aload_0         
	//   98  174:ldc2            #368 <String "putLong">
	//   99  177:iconst_2        
	//  100  178:anewarray       Class[]
	//  101  181:dup             
	//  102  182:iconst_0        
	//  103  183:getstatic       #81  <Field Class Long.TYPE>
	//  104  186:aastore         
	//  105  187:dup             
	//  106  188:iconst_1        
	//  107  189:getstatic       #81  <Field Class Long.TYPE>
	//  108  192:aastore         
	//  109  193:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  110  196:pop             
			class1.getMethod("copyMemory", new Class[] {
				Long.TYPE, Long.TYPE, Long.TYPE
			});
	//  111  197:aload_0         
	//  112  198:ldc2            #432 <String "copyMemory">
	//  113  201:iconst_3        
	//  114  202:anewarray       Class[]
	//  115  205:dup             
	//  116  206:iconst_0        
	//  117  207:getstatic       #81  <Field Class Long.TYPE>
	//  118  210:aastore         
	//  119  211:dup             
	//  120  212:iconst_1        
	//  121  213:getstatic       #81  <Field Class Long.TYPE>
	//  122  216:aastore         
	//  123  217:dup             
	//  124  218:iconst_2        
	//  125  219:getstatic       #81  <Field Class Long.TYPE>
	//  126  222:aastore         
	//  127  223:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  128  226:pop             
			class1.getMethod("copyMemory", new Class[] {
				java/lang/Object, Long.TYPE, java/lang/Object, Long.TYPE, Long.TYPE
			});
	//  129  227:aload_0         
	//  130  228:ldc2            #432 <String "copyMemory">
	//  131  231:iconst_5        
	//  132  232:anewarray       Class[]
	//  133  235:dup             
	//  134  236:iconst_0        
	//  135  237:ldc1            #4   <Class Object>
	//  136  239:aastore         
	//  137  240:dup             
	//  138  241:iconst_1        
	//  139  242:getstatic       #81  <Field Class Long.TYPE>
	//  140  245:aastore         
	//  141  246:dup             
	//  142  247:iconst_2        
	//  143  248:ldc1            #4   <Class Object>
	//  144  250:aastore         
	//  145  251:dup             
	//  146  252:iconst_3        
	//  147  253:getstatic       #81  <Field Class Long.TYPE>
	//  148  256:aastore         
	//  149  257:dup             
	//  150  258:iconst_4        
	//  151  259:getstatic       #81  <Field Class Long.TYPE>
	//  152  262:aastore         
	//  153  263:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  154  266:pop             
		}
	//* 155  267:iconst_1        
	//* 156  268:ireturn         
		catch(Throwable throwable)
	//* 157  269:astore_2        
		{
			Logger logger1 = logger;
	//  158  270:getstatic       #62  <Field Logger logger>
	//  159  273:astore_0        
			Level level = Level.WARNING;
	//  160  274:getstatic       #398 <Field Level Level.WARNING>
	//  161  277:astore_1        
			String s = String.valueOf(((Object) (throwable)));
	//  162  278:aload_2         
	//  163  279:invokestatic    #404 <Method String String.valueOf(Object)>
	//  164  282:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 71);
	//  165  283:new             #406 <Class StringBuilder>
	//  166  286:dup             
	//  167  287:aload_2         
	//  168  288:invokestatic    #404 <Method String String.valueOf(Object)>
	//  169  291:invokevirtual   #410 <Method int String.length()>
	//  170  294:bipush          71
	//  171  296:iadd            
	//  172  297:invokespecial   #413 <Method void StringBuilder(int)>
	//  173  300:astore_3        
			stringbuilder.append("platform method missing - proto runtime falling back to safer methods: ");
	//  174  301:aload_3         
	//  175  302:ldc2            #415 <String "platform method missing - proto runtime falling back to safer methods: ">
	//  176  305:invokevirtual   #419 <Method StringBuilder StringBuilder.append(String)>
	//  177  308:pop             
			stringbuilder.append(s);
	//  178  309:aload_3         
	//  179  310:aload_2         
	//  180  311:invokevirtual   #419 <Method StringBuilder StringBuilder.append(String)>
	//  181  314:pop             
			logger1.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringbuilder.toString());
	//  182  315:aload_0         
	//  183  316:aload_1         
	//  184  317:ldc2            #421 <String "com.google.protobuf.UnsafeUtil">
	//  185  320:ldc2            #434 <String "supportsUnsafeByteBufferOperations">
	//  186  323:aload_3         
	//  187  324:invokevirtual   #426 <Method String StringBuilder.toString()>
	//  188  327:invokevirtual   #430 <Method void Logger.logp(Level, String, String, String)>
			return false;
	//  189  330:iconst_0        
	//  190  331:ireturn         
		}
		return true;
	}

	private static Field zzyt()
	{
		if(zztb.zzub())
	//*   0    0:invokestatic    #96  <Method boolean zztb.zzub()>
	//*   1    3:ifeq            22
		{
			Field field = zzb(java/nio/Buffer, "effectiveDirectAddress");
	//    2    6:ldc2            #436 <Class Buffer>
	//    3    9:ldc2            #438 <String "effectiveDirectAddress">
	//    4   12:invokestatic    #440 <Method Field zzb(Class, String)>
	//    5   15:astore_0        
			if(field != null)
	//*   6   16:aload_0         
	//*   7   17:ifnull          22
				return field;
	//    8   20:aload_0         
	//    9   21:areturn         
		}
		Field field1 = zzb(java/nio/Buffer, "address");
	//   10   22:ldc2            #436 <Class Buffer>
	//   11   25:ldc2            #442 <String "address">
	//   12   28:invokestatic    #440 <Method Field zzb(Class, String)>
	//   13   31:astore_0        
		if(field1 != null && field1.getType() == Long.TYPE)
	//*  14   32:aload_0         
	//*  15   33:ifnull          48
	//*  16   36:aload_0         
	//*  17   37:invokevirtual   #445 <Method Class Field.getType()>
	//*  18   40:getstatic       #81  <Field Class Long.TYPE>
	//*  19   43:if_acmpne       48
			return field1;
	//   20   46:aload_0         
	//   21   47:areturn         
		else
			return null;
	//   22   48:aconst_null     
	//   23   49:areturn         
	}

	static long zzyu()
	{
		return zzccs;
	//    0    0:getstatic       #122 <Field long zzccs>
	//    1    3:lreturn         
	}

	private static final Logger logger = Logger.getLogger(((Class) (com/google/android/gms/internal/measurement/zzxj)).getName());
	private static final Class zzbto = zztb.zzuc();
	private static final boolean zzbuo = zzyr();
	private static final Unsafe zzcar;
	private static final boolean zzcco;
	private static final boolean zzccp;
	private static final zzd zzccq;
	private static final boolean zzccr = zzys();
	private static final long zzccs = (long)zzl([B);
	private static final long zzcct = (long)zzl([Z);
	private static final long zzccu = (long)zzm([Z);
	private static final long zzccv = (long)zzl([I);
	private static final long zzccw = (long)zzm([I);
	private static final long zzccx = (long)zzl([J);
	private static final long zzccy = (long)zzm([J);
	private static final long zzccz = (long)zzl([F);
	private static final long zzcda = (long)zzm([F);
	private static final long zzcdb = (long)zzl([D);
	private static final long zzcdc = (long)zzm([D);
	private static final long zzcdd = (long)zzl([Ljava/lang/Object;);
	private static final long zzcde = (long)zzm([Ljava/lang/Object;);
	private static final long zzcdf;
	private static final boolean zzcdg;

	static 
	{
	//    0    0:ldc1            #2   <Class zzxj>
	//    1    2:invokevirtual   #54  <Method String Class.getName()>
	//    2    5:invokestatic    #60  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #62  <Field Logger logger>
		zzcar = zzyq();
	//    4   11:invokestatic    #66  <Method Unsafe zzyq()>
	//    5   14:putstatic       #68  <Field Unsafe zzcar>
	//    6   17:invokestatic    #74  <Method Class zztb.zzuc()>
	//    7   20:putstatic       #76  <Field Class zzbto>
		zzcco = zzn(Long.TYPE);
	//    8   23:getstatic       #81  <Field Class Long.TYPE>
	//    9   26:invokestatic    #85  <Method boolean zzn(Class)>
	//   10   29:putstatic       #87  <Field boolean zzcco>
		zzccp = zzn(Integer.TYPE);
	//   11   32:getstatic       #90  <Field Class Integer.TYPE>
	//   12   35:invokestatic    #85  <Method boolean zzn(Class)>
	//   13   38:putstatic       #92  <Field boolean zzccp>
		Unsafe unsafe = zzcar;
	//   14   41:getstatic       #68  <Field Unsafe zzcar>
	//   15   44:astore          4
		Object obj = null;
	//   16   46:aconst_null     
	//   17   47:astore_3        
		if(unsafe != null)
	//*  18   48:aload           4
	//*  19   50:ifnonnull       56
	//*  20   53:goto            113
			if(zztb.zzub())
	//*  21   56:invokestatic    #96  <Method boolean zztb.zzub()>
	//*  22   59:ifeq            102
			{
				if(zzcco)
	//*  23   62:getstatic       #87  <Field boolean zzcco>
	//*  24   65:ifeq            82
					obj = ((Object) (new zzb(zzcar)));
	//   25   68:new             #9   <Class zzxj$zzb>
	//   26   71:dup             
	//   27   72:getstatic       #68  <Field Unsafe zzcar>
	//   28   75:invokespecial   #100 <Method void zzxj$zzb(Unsafe)>
	//   29   78:astore_3        
				else
	//*  30   79:goto            113
				if(zzccp)
	//*  31   82:getstatic       #92  <Field boolean zzccp>
	//*  32   85:ifeq            113
					obj = ((Object) (new zza(zzcar)));
	//   33   88:new             #6   <Class zzxj$zza>
	//   34   91:dup             
	//   35   92:getstatic       #68  <Field Unsafe zzcar>
	//   36   95:invokespecial   #101 <Method void zzxj$zza(Unsafe)>
	//   37   98:astore_3        
			} else
	//*  38   99:goto            113
			{
				obj = ((Object) (new zzc(zzcar)));
	//   39  102:new             #12  <Class zzxj$zzc>
	//   40  105:dup             
	//   41  106:getstatic       #68  <Field Unsafe zzcar>
	//   42  109:invokespecial   #102 <Method void zzxj$zzc(Unsafe)>
	//   43  112:astore_3        
			}
		zzccq = ((zzd) (obj));
	//   44  113:aload_3         
	//   45  114:putstatic       #104 <Field zzxj$zzd zzccq>
	//   46  117:invokestatic    #107 <Method boolean zzys()>
	//   47  120:putstatic       #109 <Field boolean zzccr>
	//   48  123:invokestatic    #112 <Method boolean zzyr()>
	//   49  126:putstatic       #114 <Field boolean zzbuo>
	//   50  129:ldc1            #116 <Class byte[]>
	//   51  131:invokestatic    #120 <Method int zzl(Class)>
	//   52  134:i2l             
	//   53  135:putstatic       #122 <Field long zzccs>
	//   54  138:ldc1            #124 <Class boolean[]>
	//   55  140:invokestatic    #120 <Method int zzl(Class)>
	//   56  143:i2l             
	//   57  144:putstatic       #126 <Field long zzcct>
	//   58  147:ldc1            #124 <Class boolean[]>
	//   59  149:invokestatic    #129 <Method int zzm(Class)>
	//   60  152:i2l             
	//   61  153:putstatic       #131 <Field long zzccu>
	//   62  156:ldc1            #133 <Class int[]>
	//   63  158:invokestatic    #120 <Method int zzl(Class)>
	//   64  161:i2l             
	//   65  162:putstatic       #135 <Field long zzccv>
	//   66  165:ldc1            #133 <Class int[]>
	//   67  167:invokestatic    #129 <Method int zzm(Class)>
	//   68  170:i2l             
	//   69  171:putstatic       #137 <Field long zzccw>
	//   70  174:ldc1            #139 <Class long[]>
	//   71  176:invokestatic    #120 <Method int zzl(Class)>
	//   72  179:i2l             
	//   73  180:putstatic       #141 <Field long zzccx>
	//   74  183:ldc1            #139 <Class long[]>
	//   75  185:invokestatic    #129 <Method int zzm(Class)>
	//   76  188:i2l             
	//   77  189:putstatic       #143 <Field long zzccy>
	//   78  192:ldc1            #145 <Class float[]>
	//   79  194:invokestatic    #120 <Method int zzl(Class)>
	//   80  197:i2l             
	//   81  198:putstatic       #147 <Field long zzccz>
	//   82  201:ldc1            #145 <Class float[]>
	//   83  203:invokestatic    #129 <Method int zzm(Class)>
	//   84  206:i2l             
	//   85  207:putstatic       #149 <Field long zzcda>
	//   86  210:ldc1            #151 <Class double[]>
	//   87  212:invokestatic    #120 <Method int zzl(Class)>
	//   88  215:i2l             
	//   89  216:putstatic       #153 <Field long zzcdb>
	//   90  219:ldc1            #151 <Class double[]>
	//   91  221:invokestatic    #129 <Method int zzm(Class)>
	//   92  224:i2l             
	//   93  225:putstatic       #155 <Field long zzcdc>
	//   94  228:ldc1            #157 <Class Object[]>
	//   95  230:invokestatic    #120 <Method int zzl(Class)>
	//   96  233:i2l             
	//   97  234:putstatic       #159 <Field long zzcdd>
	//   98  237:ldc1            #157 <Class Object[]>
	//   99  239:invokestatic    #129 <Method int zzm(Class)>
	//  100  242:i2l             
	//  101  243:putstatic       #161 <Field long zzcde>
		obj = ((Object) (zzyt()));
	//  102  246:invokestatic    #165 <Method Field zzyt()>
	//  103  249:astore_3        
		long l;
		if(obj != null && zzccq != null)
	//* 104  250:aload_3         
	//* 105  251:ifnull          277
	//* 106  254:getstatic       #104 <Field zzxj$zzd zzccq>
	//* 107  257:ifnonnull       263
	//* 108  260:goto            277
			l = zzccq.zzcdh.objectFieldOffset(((Field) (obj)));
	//  109  263:getstatic       #104 <Field zzxj$zzd zzccq>
	//  110  266:getfield        #168 <Field Unsafe zzxj$zzd.zzcdh>
	//  111  269:aload_3         
	//  112  270:invokevirtual   #174 <Method long Unsafe.objectFieldOffset(Field)>
	//  113  273:lstore_0        
		else
	//* 114  274:goto            281
			l = -1L;
	//  115  277:ldc2w           #175 <Long -1L>
	//  116  280:lstore_0        
		zzcdf = l;
	//  117  281:lload_0         
	//  118  282:putstatic       #178 <Field long zzcdf>
		boolean flag;
		if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN)
	//* 119  285:invokestatic    #184 <Method ByteOrder ByteOrder.nativeOrder()>
	//* 120  288:getstatic       #188 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//* 121  291:if_acmpne       299
			flag = true;
	//  122  294:iconst_1        
	//  123  295:istore_2        
		else
	//* 124  296:goto            301
			flag = false;
	//  125  299:iconst_0        
	//  126  300:istore_2        
		zzcdg = flag;
	//  127  301:iload_2         
	//  128  302:putstatic       #190 <Field boolean zzcdg>
	//* 129  305:return          
	}
}
