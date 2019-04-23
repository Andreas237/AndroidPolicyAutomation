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
			zzcdf.putLong(obj, l, l1);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Unsafe zzcdf>
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
			zzcdf.putInt(obj, l, i);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Unsafe zzcdf>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:iload           4
		//    5    8:invokevirtual   #34  <Method void Unsafe.putInt(Object, long, int)>
		//    6   11:return          
		}

		public abstract void zze(Object obj, long l, byte byte0);

		public final int zzk(Object obj, long l)
		{
			return zzcdf.getInt(obj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Unsafe zzcdf>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #41  <Method int Unsafe.getInt(Object, long)>
		//    5    9:ireturn         
		}

		public final long zzl(Object obj, long l)
		{
			return zzcdf.getLong(obj, l);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Unsafe zzcdf>
		//    2    4:aload_1         
		//    3    5:lload_2         
		//    4    6:invokevirtual   #46  <Method long Unsafe.getLong(Object, long)>
		//    5    9:lreturn         
		}

		public abstract boolean zzm(Object obj, long l);

		public abstract float zzn(Object obj, long l);

		public abstract double zzo(Object obj, long l);

		public abstract byte zzy(Object obj, long l);

		Unsafe zzcdf;

		zzd(Unsafe unsafe)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			zzcdf = unsafe;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field Unsafe zzcdf>
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
		return zzcco.zzy(((Object) (abyte0)), zzccq + l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:getstatic       #122 <Field long zzccq>
	//    3    7:lload_1         
	//    4    8:ladd            
	//    5    9:invokevirtual   #198 <Method byte zzxj$zzd.zzy(Object, long)>
	//    6   12:ireturn         
	}

	static void zza(long l, byte byte0)
	{
		zzcco.zza(l, byte0);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
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
		zzcco.zza(obj, l, d);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:dload_3         
	//    4    6:invokevirtual   #214 <Method void zzxj$zzd.zza(Object, long, double)>
	//    5    9:return          
	}

	static void zza(Object obj, long l, float f)
	{
		zzcco.zza(obj, l, f);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:fload_3         
	//    4    6:invokevirtual   #217 <Method void zzxj$zzd.zza(Object, long, float)>
	//    5    9:return          
	}

	static void zza(Object obj, long l, long l1)
	{
		zzcco.zza(obj, l, l1);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:invokevirtual   #220 <Method void zzxj$zzd.zza(Object, long, long)>
	//    5    9:return          
	}

	static void zza(Object obj, long l, Object obj1)
	{
		zzcco.zzcdf.putObject(obj, l, obj1);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:getfield        #168 <Field Unsafe zzxj$zzd.zzcdf>
	//    2    6:aload_0         
	//    3    7:lload_1         
	//    4    8:aload_3         
	//    5    9:invokevirtual   #224 <Method void Unsafe.putObject(Object, long, Object)>
	//    6   12:return          
	}

	static void zza(Object obj, long l, boolean flag)
	{
		zzcco.zza(obj, l, flag);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:iload_3         
	//    4    6:invokevirtual   #227 <Method void zzxj$zzd.zza(Object, long, boolean)>
	//    5    9:return          
	}

	static void zza(byte abyte0[], long l, byte byte0)
	{
		zzcco.zze(((Object) (abyte0)), zzccq + l, byte0);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:getstatic       #122 <Field long zzccq>
	//    3    7:lload_1         
	//    4    8:ladd            
	//    5    9:iload_3         
	//    6   10:invokevirtual   #231 <Method void zzxj$zzd.zze(Object, long, byte)>
	//    7   13:return          
	}

	static void zza(byte abyte0[], long l, long l1, long l2)
	{
		zzcco.zza(abyte0, l, l1, l2);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:lload_3         
	//    4    6:lload           5
	//    5    8:invokevirtual   #234 <Method void zzxj$zzd.zza(byte[], long, long, long)>
	//    6   11:return          
	}

	static long zzb(ByteBuffer bytebuffer)
	{
		return zzcco.zzl(((Object) (bytebuffer)), zzcdd);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:getstatic       #178 <Field long zzcdd>
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
		zzcco.zzb(obj, l, i);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
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
		return zzcco.zzk(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #263 <Method int zzxj$zzd.zzk(Object, long)>
	//    4    8:ireturn         
	}

	static Object zzk(Class class1)
	{
		try
		{
			class1 = ((Class) (zzcap.allocateInstance(class1)));
	//    0    0:getstatic       #68  <Field Unsafe zzcap>
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
		if(zzbum)
	//*   0    0:getstatic       #114 <Field boolean zzbum>
	//*   1    3:ifeq            17
			return zzcco.zzcdf.arrayBaseOffset(class1);
	//    2    6:getstatic       #104 <Field zzxj$zzd zzcco>
	//    3    9:getfield        #168 <Field Unsafe zzxj$zzd.zzcdf>
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
		return zzcco.zzl(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #238 <Method long zzxj$zzd.zzl(Object, long)>
	//    4    8:lreturn         
	}

	private static int zzm(Class class1)
	{
		if(zzbum)
	//*   0    0:getstatic       #114 <Field boolean zzbum>
	//*   1    3:ifeq            17
			return zzcco.zzcdf.arrayIndexScale(class1);
	//    2    6:getstatic       #104 <Field zzxj$zzd zzcco>
	//    3    9:getfield        #168 <Field Unsafe zzxj$zzd.zzcdf>
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
		return zzcco.zzm(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #285 <Method boolean zzxj$zzd.zzm(Object, long)>
	//    4    8:ireturn         
	}

	static float zzn(Object obj, long l)
	{
		return zzcco.zzn(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
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
			Class class2 = zzbtm;
	//    4    8:getstatic       #76  <Field Class zzbtm>
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
		return zzcco.zzo(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:aload_0         
	//    2    4:lload_1         
	//    3    5:invokevirtual   #319 <Method double zzxj$zzd.zzo(Object, long)>
	//    4    8:dreturn         
	}

	static Object zzp(Object obj, long l)
	{
		return zzcco.zzcdf.getObject(obj, l);
	//    0    0:getstatic       #104 <Field zzxj$zzd zzcco>
	//    1    3:getfield        #168 <Field Unsafe zzxj$zzd.zzcdf>
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
		return zzcde;
	//    0    0:getstatic       #190 <Field boolean zzcde>
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
		return zzbum;
	//    0    0:getstatic       #114 <Field boolean zzbum>
	//    1    3:ireturn         
	}

	static boolean zzyp()
	{
		return zzccp;
	//    0    0:getstatic       #109 <Field boolean zzccp>
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
		Object obj;
		obj = ((Object) (zzcap));
	//    0    0:getstatic       #68  <Field Unsafe zzcap>
	//    1    3:astore_0        
		if(obj == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		obj = ((Object) (obj.getClass()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #357 <Method Class Object.getClass()>
	//    8   14:astore_0        
		((Class) (obj)).getMethod("objectFieldOffset", new Class[] {
			java/lang/reflect/Field
		});
	//    9   15:aload_0         
	//   10   16:ldc2            #358 <String "objectFieldOffset">
	//   11   19:iconst_1        
	//   12   20:anewarray       Class[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:ldc1            #247 <Class Field>
	//   16   27:aastore         
	//   17   28:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   18   31:pop             
		((Class) (obj)).getMethod("arrayBaseOffset", new Class[] {
			java/lang/Class
		});
	//   19   32:aload_0         
	//   20   33:ldc2            #359 <String "arrayBaseOffset">
	//   21   36:iconst_1        
	//   22   37:anewarray       Class[]
	//   23   40:dup             
	//   24   41:iconst_0        
	//   25   42:ldc1            #50  <Class Class>
	//   26   44:aastore         
	//   27   45:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   28   48:pop             
		((Class) (obj)).getMethod("arrayIndexScale", new Class[] {
			java/lang/Class
		});
	//   29   49:aload_0         
	//   30   50:ldc2            #360 <String "arrayIndexScale">
	//   31   53:iconst_1        
	//   32   54:anewarray       Class[]
	//   33   57:dup             
	//   34   58:iconst_0        
	//   35   59:ldc1            #50  <Class Class>
	//   36   61:aastore         
	//   37   62:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   38   65:pop             
		((Class) (obj)).getMethod("getInt", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   39   66:aload_0         
	//   40   67:ldc2            #362 <String "getInt">
	//   41   70:iconst_2        
	//   42   71:anewarray       Class[]
	//   43   74:dup             
	//   44   75:iconst_0        
	//   45   76:ldc1            #4   <Class Object>
	//   46   78:aastore         
	//   47   79:dup             
	//   48   80:iconst_1        
	//   49   81:getstatic       #81  <Field Class Long.TYPE>
	//   50   84:aastore         
	//   51   85:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   52   88:pop             
		((Class) (obj)).getMethod("putInt", new Class[] {
			java/lang/Object, Long.TYPE, Integer.TYPE
		});
	//   53   89:aload_0         
	//   54   90:ldc2            #364 <String "putInt">
	//   55   93:iconst_3        
	//   56   94:anewarray       Class[]
	//   57   97:dup             
	//   58   98:iconst_0        
	//   59   99:ldc1            #4   <Class Object>
	//   60  101:aastore         
	//   61  102:dup             
	//   62  103:iconst_1        
	//   63  104:getstatic       #81  <Field Class Long.TYPE>
	//   64  107:aastore         
	//   65  108:dup             
	//   66  109:iconst_2        
	//   67  110:getstatic       #90  <Field Class Integer.TYPE>
	//   68  113:aastore         
	//   69  114:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   70  117:pop             
		((Class) (obj)).getMethod("getLong", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   71  118:aload_0         
	//   72  119:ldc2            #366 <String "getLong">
	//   73  122:iconst_2        
	//   74  123:anewarray       Class[]
	//   75  126:dup             
	//   76  127:iconst_0        
	//   77  128:ldc1            #4   <Class Object>
	//   78  130:aastore         
	//   79  131:dup             
	//   80  132:iconst_1        
	//   81  133:getstatic       #81  <Field Class Long.TYPE>
	//   82  136:aastore         
	//   83  137:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   84  140:pop             
		((Class) (obj)).getMethod("putLong", new Class[] {
			java/lang/Object, Long.TYPE, Long.TYPE
		});
	//   85  141:aload_0         
	//   86  142:ldc2            #368 <String "putLong">
	//   87  145:iconst_3        
	//   88  146:anewarray       Class[]
	//   89  149:dup             
	//   90  150:iconst_0        
	//   91  151:ldc1            #4   <Class Object>
	//   92  153:aastore         
	//   93  154:dup             
	//   94  155:iconst_1        
	//   95  156:getstatic       #81  <Field Class Long.TYPE>
	//   96  159:aastore         
	//   97  160:dup             
	//   98  161:iconst_2        
	//   99  162:getstatic       #81  <Field Class Long.TYPE>
	//  100  165:aastore         
	//  101  166:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  102  169:pop             
		((Class) (obj)).getMethod("getObject", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//  103  170:aload_0         
	//  104  171:ldc2            #369 <String "getObject">
	//  105  174:iconst_2        
	//  106  175:anewarray       Class[]
	//  107  178:dup             
	//  108  179:iconst_0        
	//  109  180:ldc1            #4   <Class Object>
	//  110  182:aastore         
	//  111  183:dup             
	//  112  184:iconst_1        
	//  113  185:getstatic       #81  <Field Class Long.TYPE>
	//  114  188:aastore         
	//  115  189:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  116  192:pop             
		((Class) (obj)).getMethod("putObject", new Class[] {
			java/lang/Object, Long.TYPE, java/lang/Object
		});
	//  117  193:aload_0         
	//  118  194:ldc2            #370 <String "putObject">
	//  119  197:iconst_3        
	//  120  198:anewarray       Class[]
	//  121  201:dup             
	//  122  202:iconst_0        
	//  123  203:ldc1            #4   <Class Object>
	//  124  205:aastore         
	//  125  206:dup             
	//  126  207:iconst_1        
	//  127  208:getstatic       #81  <Field Class Long.TYPE>
	//  128  211:aastore         
	//  129  212:dup             
	//  130  213:iconst_2        
	//  131  214:ldc1            #4   <Class Object>
	//  132  216:aastore         
	//  133  217:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  134  220:pop             
		if(zztb.zzub())
	//* 135  221:invokestatic    #96  <Method boolean zztb.zzub()>
	//* 136  224:ifeq            229
			return true;
	//  137  227:iconst_1        
	//  138  228:ireturn         
		try
		{
			((Class) (obj)).getMethod("getByte", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  139  229:aload_0         
	//  140  230:ldc2            #372 <String "getByte">
	//  141  233:iconst_2        
	//  142  234:anewarray       Class[]
	//  143  237:dup             
	//  144  238:iconst_0        
	//  145  239:ldc1            #4   <Class Object>
	//  146  241:aastore         
	//  147  242:dup             
	//  148  243:iconst_1        
	//  149  244:getstatic       #81  <Field Class Long.TYPE>
	//  150  247:aastore         
	//  151  248:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  152  251:pop             
			((Class) (obj)).getMethod("putByte", new Class[] {
				java/lang/Object, Long.TYPE, Byte.TYPE
			});
	//  153  252:aload_0         
	//  154  253:ldc2            #374 <String "putByte">
	//  155  256:iconst_3        
	//  156  257:anewarray       Class[]
	//  157  260:dup             
	//  158  261:iconst_0        
	//  159  262:ldc1            #4   <Class Object>
	//  160  264:aastore         
	//  161  265:dup             
	//  162  266:iconst_1        
	//  163  267:getstatic       #81  <Field Class Long.TYPE>
	//  164  270:aastore         
	//  165  271:dup             
	//  166  272:iconst_2        
	//  167  273:getstatic       #308 <Field Class Byte.TYPE>
	//  168  276:aastore         
	//  169  277:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  170  280:pop             
			((Class) (obj)).getMethod("getBoolean", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  171  281:aload_0         
	//  172  282:ldc2            #376 <String "getBoolean">
	//  173  285:iconst_2        
	//  174  286:anewarray       Class[]
	//  175  289:dup             
	//  176  290:iconst_0        
	//  177  291:ldc1            #4   <Class Object>
	//  178  293:aastore         
	//  179  294:dup             
	//  180  295:iconst_1        
	//  181  296:getstatic       #81  <Field Class Long.TYPE>
	//  182  299:aastore         
	//  183  300:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  184  303:pop             
			((Class) (obj)).getMethod("putBoolean", new Class[] {
				java/lang/Object, Long.TYPE, Boolean.TYPE
			});
	//  185  304:aload_0         
	//  186  305:ldc2            #378 <String "putBoolean">
	//  187  308:iconst_3        
	//  188  309:anewarray       Class[]
	//  189  312:dup             
	//  190  313:iconst_0        
	//  191  314:ldc1            #4   <Class Object>
	//  192  316:aastore         
	//  193  317:dup             
	//  194  318:iconst_1        
	//  195  319:getstatic       #81  <Field Class Long.TYPE>
	//  196  322:aastore         
	//  197  323:dup             
	//  198  324:iconst_2        
	//  199  325:getstatic       #293 <Field Class Boolean.TYPE>
	//  200  328:aastore         
	//  201  329:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  202  332:pop             
			((Class) (obj)).getMethod("getFloat", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  203  333:aload_0         
	//  204  334:ldc2            #380 <String "getFloat">
	//  205  337:iconst_2        
	//  206  338:anewarray       Class[]
	//  207  341:dup             
	//  208  342:iconst_0        
	//  209  343:ldc1            #4   <Class Object>
	//  210  345:aastore         
	//  211  346:dup             
	//  212  347:iconst_1        
	//  213  348:getstatic       #81  <Field Class Long.TYPE>
	//  214  351:aastore         
	//  215  352:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  216  355:pop             
			((Class) (obj)).getMethod("putFloat", new Class[] {
				java/lang/Object, Long.TYPE, Float.TYPE
			});
	//  217  356:aload_0         
	//  218  357:ldc2            #382 <String "putFloat">
	//  219  360:iconst_3        
	//  220  361:anewarray       Class[]
	//  221  364:dup             
	//  222  365:iconst_0        
	//  223  366:ldc1            #4   <Class Object>
	//  224  368:aastore         
	//  225  369:dup             
	//  226  370:iconst_1        
	//  227  371:getstatic       #81  <Field Class Long.TYPE>
	//  228  374:aastore         
	//  229  375:dup             
	//  230  376:iconst_2        
	//  231  377:getstatic       #385 <Field Class Float.TYPE>
	//  232  380:aastore         
	//  233  381:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  234  384:pop             
			((Class) (obj)).getMethod("getDouble", new Class[] {
				java/lang/Object, Long.TYPE
			});
	//  235  385:aload_0         
	//  236  386:ldc2            #387 <String "getDouble">
	//  237  389:iconst_2        
	//  238  390:anewarray       Class[]
	//  239  393:dup             
	//  240  394:iconst_0        
	//  241  395:ldc1            #4   <Class Object>
	//  242  397:aastore         
	//  243  398:dup             
	//  244  399:iconst_1        
	//  245  400:getstatic       #81  <Field Class Long.TYPE>
	//  246  403:aastore         
	//  247  404:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  248  407:pop             
			((Class) (obj)).getMethod("putDouble", new Class[] {
				java/lang/Object, Long.TYPE, Double.TYPE
			});
	//  249  408:aload_0         
	//  250  409:ldc2            #389 <String "putDouble">
	//  251  412:iconst_3        
	//  252  413:anewarray       Class[]
	//  253  416:dup             
	//  254  417:iconst_0        
	//  255  418:ldc1            #4   <Class Object>
	//  256  420:aastore         
	//  257  421:dup             
	//  258  422:iconst_1        
	//  259  423:getstatic       #81  <Field Class Long.TYPE>
	//  260  426:aastore         
	//  261  427:dup             
	//  262  428:iconst_2        
	//  263  429:getstatic       #392 <Field Class Double.TYPE>
	//  264  432:aastore         
	//  265  433:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  266  436:pop             
		}
	//* 267  437:iconst_1        
	//* 268  438:ireturn         
		catch(Throwable throwable)
	//* 269  439:astore_2        
		{
			Logger logger1 = logger;
	//  270  440:getstatic       #62  <Field Logger logger>
	//  271  443:astore_0        
			Level level = Level.WARNING;
	//  272  444:getstatic       #398 <Field Level Level.WARNING>
	//  273  447:astore_1        
			String s = String.valueOf(((Object) (throwable)));
	//  274  448:aload_2         
	//  275  449:invokestatic    #404 <Method String String.valueOf(Object)>
	//  276  452:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 71);
	//  277  453:new             #406 <Class StringBuilder>
	//  278  456:dup             
	//  279  457:aload_2         
	//  280  458:invokestatic    #404 <Method String String.valueOf(Object)>
	//  281  461:invokevirtual   #410 <Method int String.length()>
	//  282  464:bipush          71
	//  283  466:iadd            
	//  284  467:invokespecial   #413 <Method void StringBuilder(int)>
	//  285  470:astore_3        
			stringbuilder.append("platform method missing - proto runtime falling back to safer methods: ");
	//  286  471:aload_3         
	//  287  472:ldc2            #415 <String "platform method missing - proto runtime falling back to safer methods: ">
	//  288  475:invokevirtual   #419 <Method StringBuilder StringBuilder.append(String)>
	//  289  478:pop             
			stringbuilder.append(s);
	//  290  479:aload_3         
	//  291  480:aload_2         
	//  292  481:invokevirtual   #419 <Method StringBuilder StringBuilder.append(String)>
	//  293  484:pop             
			logger1.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", stringbuilder.toString());
	//  294  485:aload_0         
	//  295  486:aload_1         
	//  296  487:ldc2            #421 <String "com.google.protobuf.UnsafeUtil">
	//  297  490:ldc2            #423 <String "supportsUnsafeArrayOperations">
	//  298  493:aload_3         
	//  299  494:invokevirtual   #426 <Method String StringBuilder.toString()>
	//  300  497:invokevirtual   #430 <Method void Logger.logp(Level, String, String, String)>
			return false;
	//  301  500:iconst_0        
	//  302  501:ireturn         
		}
		return true;
	}

	private static boolean zzys()
	{
		Object obj;
		obj = ((Object) (zzcap));
	//    0    0:getstatic       #68  <Field Unsafe zzcap>
	//    1    3:astore_0        
		if(obj == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       10
			return false;
	//    4    8:iconst_0        
	//    5    9:ireturn         
		obj = ((Object) (obj.getClass()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #357 <Method Class Object.getClass()>
	//    8   14:astore_0        
		((Class) (obj)).getMethod("objectFieldOffset", new Class[] {
			java/lang/reflect/Field
		});
	//    9   15:aload_0         
	//   10   16:ldc2            #358 <String "objectFieldOffset">
	//   11   19:iconst_1        
	//   12   20:anewarray       Class[]
	//   13   23:dup             
	//   14   24:iconst_0        
	//   15   25:ldc1            #247 <Class Field>
	//   16   27:aastore         
	//   17   28:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   18   31:pop             
		((Class) (obj)).getMethod("getLong", new Class[] {
			java/lang/Object, Long.TYPE
		});
	//   19   32:aload_0         
	//   20   33:ldc2            #366 <String "getLong">
	//   21   36:iconst_2        
	//   22   37:anewarray       Class[]
	//   23   40:dup             
	//   24   41:iconst_0        
	//   25   42:ldc1            #4   <Class Object>
	//   26   44:aastore         
	//   27   45:dup             
	//   28   46:iconst_1        
	//   29   47:getstatic       #81  <Field Class Long.TYPE>
	//   30   50:aastore         
	//   31   51:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   32   54:pop             
		if(zzyt() == null)
	//*  33   55:invokestatic    #165 <Method Field zzyt()>
	//*  34   58:ifnonnull       63
			return false;
	//   35   61:iconst_0        
	//   36   62:ireturn         
		if(zztb.zzub())
	//*  37   63:invokestatic    #96  <Method boolean zztb.zzub()>
	//*  38   66:ifeq            71
			return true;
	//   39   69:iconst_1        
	//   40   70:ireturn         
		try
		{
			((Class) (obj)).getMethod("getByte", new Class[] {
				Long.TYPE
			});
	//   41   71:aload_0         
	//   42   72:ldc2            #372 <String "getByte">
	//   43   75:iconst_1        
	//   44   76:anewarray       Class[]
	//   45   79:dup             
	//   46   80:iconst_0        
	//   47   81:getstatic       #81  <Field Class Long.TYPE>
	//   48   84:aastore         
	//   49   85:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   50   88:pop             
			((Class) (obj)).getMethod("putByte", new Class[] {
				Long.TYPE, Byte.TYPE
			});
	//   51   89:aload_0         
	//   52   90:ldc2            #374 <String "putByte">
	//   53   93:iconst_2        
	//   54   94:anewarray       Class[]
	//   55   97:dup             
	//   56   98:iconst_0        
	//   57   99:getstatic       #81  <Field Class Long.TYPE>
	//   58  102:aastore         
	//   59  103:dup             
	//   60  104:iconst_1        
	//   61  105:getstatic       #308 <Field Class Byte.TYPE>
	//   62  108:aastore         
	//   63  109:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   64  112:pop             
			((Class) (obj)).getMethod("getInt", new Class[] {
				Long.TYPE
			});
	//   65  113:aload_0         
	//   66  114:ldc2            #362 <String "getInt">
	//   67  117:iconst_1        
	//   68  118:anewarray       Class[]
	//   69  121:dup             
	//   70  122:iconst_0        
	//   71  123:getstatic       #81  <Field Class Long.TYPE>
	//   72  126:aastore         
	//   73  127:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   74  130:pop             
			((Class) (obj)).getMethod("putInt", new Class[] {
				Long.TYPE, Integer.TYPE
			});
	//   75  131:aload_0         
	//   76  132:ldc2            #364 <String "putInt">
	//   77  135:iconst_2        
	//   78  136:anewarray       Class[]
	//   79  139:dup             
	//   80  140:iconst_0        
	//   81  141:getstatic       #81  <Field Class Long.TYPE>
	//   82  144:aastore         
	//   83  145:dup             
	//   84  146:iconst_1        
	//   85  147:getstatic       #90  <Field Class Integer.TYPE>
	//   86  150:aastore         
	//   87  151:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   88  154:pop             
			((Class) (obj)).getMethod("getLong", new Class[] {
				Long.TYPE
			});
	//   89  155:aload_0         
	//   90  156:ldc2            #366 <String "getLong">
	//   91  159:iconst_1        
	//   92  160:anewarray       Class[]
	//   93  163:dup             
	//   94  164:iconst_0        
	//   95  165:getstatic       #81  <Field Class Long.TYPE>
	//   96  168:aastore         
	//   97  169:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//   98  172:pop             
			((Class) (obj)).getMethod("putLong", new Class[] {
				Long.TYPE, Long.TYPE
			});
	//   99  173:aload_0         
	//  100  174:ldc2            #368 <String "putLong">
	//  101  177:iconst_2        
	//  102  178:anewarray       Class[]
	//  103  181:dup             
	//  104  182:iconst_0        
	//  105  183:getstatic       #81  <Field Class Long.TYPE>
	//  106  186:aastore         
	//  107  187:dup             
	//  108  188:iconst_1        
	//  109  189:getstatic       #81  <Field Class Long.TYPE>
	//  110  192:aastore         
	//  111  193:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  112  196:pop             
			((Class) (obj)).getMethod("copyMemory", new Class[] {
				Long.TYPE, Long.TYPE, Long.TYPE
			});
	//  113  197:aload_0         
	//  114  198:ldc2            #432 <String "copyMemory">
	//  115  201:iconst_3        
	//  116  202:anewarray       Class[]
	//  117  205:dup             
	//  118  206:iconst_0        
	//  119  207:getstatic       #81  <Field Class Long.TYPE>
	//  120  210:aastore         
	//  121  211:dup             
	//  122  212:iconst_1        
	//  123  213:getstatic       #81  <Field Class Long.TYPE>
	//  124  216:aastore         
	//  125  217:dup             
	//  126  218:iconst_2        
	//  127  219:getstatic       #81  <Field Class Long.TYPE>
	//  128  222:aastore         
	//  129  223:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  130  226:pop             
			((Class) (obj)).getMethod("copyMemory", new Class[] {
				java/lang/Object, Long.TYPE, java/lang/Object, Long.TYPE, Long.TYPE
			});
	//  131  227:aload_0         
	//  132  228:ldc2            #432 <String "copyMemory">
	//  133  231:iconst_5        
	//  134  232:anewarray       Class[]
	//  135  235:dup             
	//  136  236:iconst_0        
	//  137  237:ldc1            #4   <Class Object>
	//  138  239:aastore         
	//  139  240:dup             
	//  140  241:iconst_1        
	//  141  242:getstatic       #81  <Field Class Long.TYPE>
	//  142  245:aastore         
	//  143  246:dup             
	//  144  247:iconst_2        
	//  145  248:ldc1            #4   <Class Object>
	//  146  250:aastore         
	//  147  251:dup             
	//  148  252:iconst_3        
	//  149  253:getstatic       #81  <Field Class Long.TYPE>
	//  150  256:aastore         
	//  151  257:dup             
	//  152  258:iconst_4        
	//  153  259:getstatic       #81  <Field Class Long.TYPE>
	//  154  262:aastore         
	//  155  263:invokevirtual   #297 <Method java.lang.reflect.Method Class.getMethod(String, Class[])>
	//  156  266:pop             
		}
	//* 157  267:iconst_1        
	//* 158  268:ireturn         
		catch(Throwable throwable)
	//* 159  269:astore_2        
		{
			Logger logger1 = logger;
	//  160  270:getstatic       #62  <Field Logger logger>
	//  161  273:astore_0        
			Level level = Level.WARNING;
	//  162  274:getstatic       #398 <Field Level Level.WARNING>
	//  163  277:astore_1        
			String s = String.valueOf(((Object) (throwable)));
	//  164  278:aload_2         
	//  165  279:invokestatic    #404 <Method String String.valueOf(Object)>
	//  166  282:astore_2        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 71);
	//  167  283:new             #406 <Class StringBuilder>
	//  168  286:dup             
	//  169  287:aload_2         
	//  170  288:invokestatic    #404 <Method String String.valueOf(Object)>
	//  171  291:invokevirtual   #410 <Method int String.length()>
	//  172  294:bipush          71
	//  173  296:iadd            
	//  174  297:invokespecial   #413 <Method void StringBuilder(int)>
	//  175  300:astore_3        
			stringbuilder.append("platform method missing - proto runtime falling back to safer methods: ");
	//  176  301:aload_3         
	//  177  302:ldc2            #415 <String "platform method missing - proto runtime falling back to safer methods: ">
	//  178  305:invokevirtual   #419 <Method StringBuilder StringBuilder.append(String)>
	//  179  308:pop             
			stringbuilder.append(s);
	//  180  309:aload_3         
	//  181  310:aload_2         
	//  182  311:invokevirtual   #419 <Method StringBuilder StringBuilder.append(String)>
	//  183  314:pop             
			logger1.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", stringbuilder.toString());
	//  184  315:aload_0         
	//  185  316:aload_1         
	//  186  317:ldc2            #421 <String "com.google.protobuf.UnsafeUtil">
	//  187  320:ldc2            #434 <String "supportsUnsafeByteBufferOperations">
	//  188  323:aload_3         
	//  189  324:invokevirtual   #426 <Method String StringBuilder.toString()>
	//  190  327:invokevirtual   #430 <Method void Logger.logp(Level, String, String, String)>
			return false;
	//  191  330:iconst_0        
	//  192  331:ireturn         
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
		return zzccq;
	//    0    0:getstatic       #122 <Field long zzccq>
	//    1    3:lreturn         
	}

	private static final Logger logger;
	private static final Class zzbtm;
	private static final boolean zzbum;
	private static final Unsafe zzcap;
	private static final boolean zzccm;
	private static final boolean zzccn;
	private static final zzd zzcco;
	private static final boolean zzccp;
	private static final long zzccq;
	private static final long zzccr;
	private static final long zzccs;
	private static final long zzcct;
	private static final long zzccu;
	private static final long zzccv;
	private static final long zzccw;
	private static final long zzccx;
	private static final long zzccy;
	private static final long zzccz;
	private static final long zzcda;
	private static final long zzcdb;
	private static final long zzcdc;
	private static final long zzcdd;
	private static final boolean zzcde;

	static 
	{
		long l;
label0:
		{
			logger = Logger.getLogger(((Class) (com/google/android/gms/internal/measurement/zzxj)).getName());
	//    0    0:ldc1            #2   <Class zzxj>
	//    1    2:invokevirtual   #54  <Method String Class.getName()>
	//    2    5:invokestatic    #60  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #62  <Field Logger logger>
			zzcap = zzyq();
	//    4   11:invokestatic    #66  <Method Unsafe zzyq()>
	//    5   14:putstatic       #68  <Field Unsafe zzcap>
			zzbtm = zztb.zzuc();
	//    6   17:invokestatic    #74  <Method Class zztb.zzuc()>
	//    7   20:putstatic       #76  <Field Class zzbtm>
			zzccm = zzn(Long.TYPE);
	//    8   23:getstatic       #81  <Field Class Long.TYPE>
	//    9   26:invokestatic    #85  <Method boolean zzn(Class)>
	//   10   29:putstatic       #87  <Field boolean zzccm>
			zzccn = zzn(Integer.TYPE);
	//   11   32:getstatic       #90  <Field Class Integer.TYPE>
	//   12   35:invokestatic    #85  <Method boolean zzn(Class)>
	//   13   38:putstatic       #92  <Field boolean zzccn>
			Unsafe unsafe = zzcap;
	//   14   41:getstatic       #68  <Field Unsafe zzcap>
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
					if(zzccm)
	//*  23   62:getstatic       #87  <Field boolean zzccm>
	//*  24   65:ifeq            82
						obj = ((Object) (new zzb(zzcap)));
	//   25   68:new             #9   <Class zzxj$zzb>
	//   26   71:dup             
	//   27   72:getstatic       #68  <Field Unsafe zzcap>
	//   28   75:invokespecial   #100 <Method void zzxj$zzb(Unsafe)>
	//   29   78:astore_3        
					else
	//*  30   79:goto            113
					if(zzccn)
	//*  31   82:getstatic       #92  <Field boolean zzccn>
	//*  32   85:ifeq            113
						obj = ((Object) (new zza(zzcap)));
	//   33   88:new             #6   <Class zzxj$zza>
	//   34   91:dup             
	//   35   92:getstatic       #68  <Field Unsafe zzcap>
	//   36   95:invokespecial   #101 <Method void zzxj$zza(Unsafe)>
	//   37   98:astore_3        
				} else
	//*  38   99:goto            113
				{
					obj = ((Object) (new zzc(zzcap)));
	//   39  102:new             #12  <Class zzxj$zzc>
	//   40  105:dup             
	//   41  106:getstatic       #68  <Field Unsafe zzcap>
	//   42  109:invokespecial   #102 <Method void zzxj$zzc(Unsafe)>
	//   43  112:astore_3        
				}
			zzcco = ((zzd) (obj));
	//   44  113:aload_3         
	//   45  114:putstatic       #104 <Field zzxj$zzd zzcco>
			zzccp = zzys();
	//   46  117:invokestatic    #107 <Method boolean zzys()>
	//   47  120:putstatic       #109 <Field boolean zzccp>
			zzbum = zzyr();
	//   48  123:invokestatic    #112 <Method boolean zzyr()>
	//   49  126:putstatic       #114 <Field boolean zzbum>
			zzccq = zzl([B);
	//   50  129:ldc1            #116 <Class byte[]>
	//   51  131:invokestatic    #120 <Method int zzl(Class)>
	//   52  134:i2l             
	//   53  135:putstatic       #122 <Field long zzccq>
			zzccr = zzl([Z);
	//   54  138:ldc1            #124 <Class boolean[]>
	//   55  140:invokestatic    #120 <Method int zzl(Class)>
	//   56  143:i2l             
	//   57  144:putstatic       #126 <Field long zzccr>
			zzccs = zzm([Z);
	//   58  147:ldc1            #124 <Class boolean[]>
	//   59  149:invokestatic    #129 <Method int zzm(Class)>
	//   60  152:i2l             
	//   61  153:putstatic       #131 <Field long zzccs>
			zzcct = zzl([I);
	//   62  156:ldc1            #133 <Class int[]>
	//   63  158:invokestatic    #120 <Method int zzl(Class)>
	//   64  161:i2l             
	//   65  162:putstatic       #135 <Field long zzcct>
			zzccu = zzm([I);
	//   66  165:ldc1            #133 <Class int[]>
	//   67  167:invokestatic    #129 <Method int zzm(Class)>
	//   68  170:i2l             
	//   69  171:putstatic       #137 <Field long zzccu>
			zzccv = zzl([J);
	//   70  174:ldc1            #139 <Class long[]>
	//   71  176:invokestatic    #120 <Method int zzl(Class)>
	//   72  179:i2l             
	//   73  180:putstatic       #141 <Field long zzccv>
			zzccw = zzm([J);
	//   74  183:ldc1            #139 <Class long[]>
	//   75  185:invokestatic    #129 <Method int zzm(Class)>
	//   76  188:i2l             
	//   77  189:putstatic       #143 <Field long zzccw>
			zzccx = zzl([F);
	//   78  192:ldc1            #145 <Class float[]>
	//   79  194:invokestatic    #120 <Method int zzl(Class)>
	//   80  197:i2l             
	//   81  198:putstatic       #147 <Field long zzccx>
			zzccy = zzm([F);
	//   82  201:ldc1            #145 <Class float[]>
	//   83  203:invokestatic    #129 <Method int zzm(Class)>
	//   84  206:i2l             
	//   85  207:putstatic       #149 <Field long zzccy>
			zzccz = zzl([D);
	//   86  210:ldc1            #151 <Class double[]>
	//   87  212:invokestatic    #120 <Method int zzl(Class)>
	//   88  215:i2l             
	//   89  216:putstatic       #153 <Field long zzccz>
			zzcda = zzm([D);
	//   90  219:ldc1            #151 <Class double[]>
	//   91  221:invokestatic    #129 <Method int zzm(Class)>
	//   92  224:i2l             
	//   93  225:putstatic       #155 <Field long zzcda>
			zzcdb = zzl([Ljava/lang/Object;);
	//   94  228:ldc1            #157 <Class Object[]>
	//   95  230:invokestatic    #120 <Method int zzl(Class)>
	//   96  233:i2l             
	//   97  234:putstatic       #159 <Field long zzcdb>
			zzcdc = zzm([Ljava/lang/Object;);
	//   98  237:ldc1            #157 <Class Object[]>
	//   99  239:invokestatic    #129 <Method int zzm(Class)>
	//  100  242:i2l             
	//  101  243:putstatic       #161 <Field long zzcdc>
			obj = ((Object) (zzyt()));
	//  102  246:invokestatic    #165 <Method Field zzyt()>
	//  103  249:astore_3        
			if(obj != null)
	//* 104  250:aload_3         
	//* 105  251:ifnull          280
			{
				zzd zzd1 = zzcco;
	//  106  254:getstatic       #104 <Field zzxj$zzd zzcco>
	//  107  257:astore          4
				if(zzd1 != null)
	//* 108  259:aload           4
	//* 109  261:ifnonnull       267
	//* 110  264:goto            280
				{
					l = zzd1.zzcdf.objectFieldOffset(((Field) (obj)));
	//  111  267:aload           4
	//  112  269:getfield        #168 <Field Unsafe zzxj$zzd.zzcdf>
	//  113  272:aload_3         
	//  114  273:invokevirtual   #174 <Method long Unsafe.objectFieldOffset(Field)>
	//  115  276:lstore_0        
					break label0;
	//  116  277:goto            284
				}
			}
			l = -1L;
	//  117  280:ldc2w           #175 <Long -1L>
	//  118  283:lstore_0        
		}
		zzcdd = l;
	//  119  284:lload_0         
	//  120  285:putstatic       #178 <Field long zzcdd>
		boolean flag;
		if(ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN)
	//* 121  288:invokestatic    #184 <Method ByteOrder ByteOrder.nativeOrder()>
	//* 122  291:getstatic       #188 <Field ByteOrder ByteOrder.BIG_ENDIAN>
	//* 123  294:if_acmpne       302
			flag = true;
	//  124  297:iconst_1        
	//  125  298:istore_2        
		else
	//* 126  299:goto            304
			flag = false;
	//  127  302:iconst_0        
	//  128  303:istore_2        
		zzcde = flag;
	//  129  304:iload_2         
	//  130  305:putstatic       #190 <Field boolean zzcde>
	//* 131  308:return          
	}
}
