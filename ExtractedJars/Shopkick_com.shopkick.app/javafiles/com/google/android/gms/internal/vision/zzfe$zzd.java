// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.*;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfe, zziw, zzeo, zzec, 
//			zzhw, zzhf, zzja

static final class zzfe$zzd extends zzfe
{

	private final void zzo(String s)
		throws IOException
	{
		try
		{
			zziw.zza(((CharSequence) (s)), zzsw);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field ByteBuffer zzsw>
	//    3    5:invokestatic    #54  <Method void zziw.zza(CharSequence, ByteBuffer)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    9:astore_1        
		{
			throw new zzfe$zzc(((Throwable) (s)));
	//    6   10:new             #56  <Class zzfe$zzc>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//   10   18:athrow          
		}
	}

	public final void flush()
	{
		zzsv.position(zzsw.position());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ByteBuffer zzsv>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field ByteBuffer zzsw>
	//    4    8:invokevirtual   #39  <Method int ByteBuffer.position()>
	//    5   11:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    6   14:pop             
	//    7   15:return          
	}

	public final void write(byte abyte0[], int i, int j)
		throws IOException
	{
		try
		{
			zzsw.put(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzsw>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #73  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    6   10:pop             
			return;
	//    7   11:return          
		}
	//*   8   12:astore_1        
	//*   9   13:new             #56  <Class zzfe$zzc>
	//*  10   16:dup             
	//*  11   17:aload_1         
	//*  12   18:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//*  13   21:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  14   22:astore_1        
		{
			throw new zzfe$zzc(((Throwable) (abyte0)));
	//   15   23:new             #56  <Class zzfe$zzc>
	//   16   26:dup             
	//   17   27:aload_1         
	//   18   28:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//   19   31:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new zzfe$zzc(((Throwable) (abyte0)));
		}
	}

	public final void zza(int i, long l)
		throws IOException
	{
		((zzfe)this).zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zze(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #81  <Method void zzfe.zze(long)>
	//    7   11:return          
	}

	public final void zza(int i, zzeo zzeo1)
		throws IOException
	{
		((zzfe)this).zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zza(zzeo1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #85  <Method void zzfe.zza(zzeo)>
	//    7   11:return          
	}

	public final void zza(int i, zzhf zzhf1)
		throws IOException
	{
		((zzfe)this).zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzb(zzhf1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #90  <Method void zzfe.zzb(zzhf)>
	//    7   11:return          
	}

	final void zza(int i, zzhf zzhf1, zzhw zzhw1)
		throws IOException
	{
		((zzfe)this).zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zza(zzhf1, zzhw1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #94  <Method void zzfe.zza(zzhf, zzhw)>
	//    8   12:return          
	}

	public final void zza(int i, String s)
		throws IOException
	{
		((zzfe)this).zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzm(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #98  <Method void zzfe.zzm(String)>
	//    7   11:return          
	}

	public final void zza(zzeo zzeo1)
		throws IOException
	{
		((zzfe)this).zzas(zzeo1.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #103 <Method int zzeo.size()>
	//    3    5:invokevirtual   #107 <Method void zzfe.zzas(int)>
		zzeo1.zza(((zzen) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #110 <Method void zzeo.zza(zzen)>
	//    7   13:return          
	}

	final void zza(zzhf zzhf1, zzhw zzhw1)
		throws IOException
	{
		zzec zzec1 = (zzec)zzhf1;
	//    0    0:aload_1         
	//    1    1:checkcast       #112 <Class zzec>
	//    2    4:astore          5
		int j = zzec1.zzcf();
	//    3    6:aload           5
	//    4    8:invokevirtual   #115 <Method int zzec.zzcf()>
	//    5   11:istore          4
		int i = j;
	//    6   13:iload           4
	//    7   15:istore_3        
		if(j == -1)
	//*   8   16:iload           4
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          37
		{
			i = zzhw1.zzp(((Object) (zzec1)));
	//   11   22:aload_2         
	//   12   23:aload           5
	//   13   25:invokeinterface #121 <Method int zzhw.zzp(Object)>
	//   14   30:istore_3        
			zzec1.zzy(i);
	//   15   31:aload           5
	//   16   33:iload_3         
	//   17   34:invokevirtual   #124 <Method void zzec.zzy(int)>
		}
		((zzfe)this).zzas(i);
	//   18   37:aload_0         
	//   19   38:iload_3         
	//   20   39:invokevirtual   #107 <Method void zzfe.zzas(int)>
		zzhw1.zza(((Object) (zzhf1)), ((zzjj) (zzss)));
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #128 <Field zzfg zzss>
	//   25   48:invokeinterface #131 <Method void zzhw.zza(Object, zzjj)>
	//   26   53:return          
	}

	public final void zza(byte abyte0[], int i, int j)
		throws IOException
	{
		((zzfe)this).write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #133 <Method void zzfe.write(byte[], int, int)>
	//    5    7:return          
	}

	public final void zzar(int i)
		throws IOException
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			((zzfe)this).zzas(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #107 <Method void zzfe.zzas(int)>
			return;
	//    5    9:return          
		} else
		{
			((zzfe)this).zze(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #81  <Method void zzfe.zze(long)>
			return;
	//   10   16:return          
		}
	}

	public final void zzas(int i)
		throws IOException
	{
_L1:
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            18
			try
			{
				zzsw.put((byte)i);
	//    4    7:aload_0         
	//    5    8:getfield        #35  <Field ByteBuffer zzsw>
	//    6   11:iload_1         
	//    7   12:int2byte        
	//    8   13:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
	//    9   16:pop             
				return;
	//   10   17:return          
			}
	//*  11   18:aload_0         
	//*  12   19:getfield        #35  <Field ByteBuffer zzsw>
	//*  13   22:iload_1         
	//*  14   23:bipush          127
	//*  15   25:iand            
	//*  16   26:sipush          128
	//*  17   29:ior             
	//*  18   30:int2byte        
	//*  19   31:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
	//*  20   34:pop             
	//*  21   35:iload_1         
	//*  22   36:bipush          7
	//*  23   38:iushr           
	//*  24   39:istore_1        
	//*  25   40:goto            0
			catch(BufferOverflowException bufferoverflowexception)
	//*  26   43:astore_2        
			{
				throw new zzfe$zzc(((Throwable) (bufferoverflowexception)));
	//   27   44:new             #56  <Class zzfe$zzc>
	//   28   47:dup             
	//   29   48:aload_2         
	//   30   49:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//   31   52:athrow          
			}
		zzsw.put((byte)(i & 0x7f | 0x80));
		i >>>= 7;
		  goto _L1
	}

	public final void zzau(int i)
		throws IOException
	{
		try
		{
			zzsw.putInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzsw>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #142 <Method ByteBuffer ByteBuffer.putInt(int)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_2        
		{
			throw new zzfe$zzc(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #56  <Class zzfe$zzc>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void zzb(int i, zzeo zzeo1)
		throws IOException
	{
		((zzfe)this).zzd(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzf(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #145 <Method void zzfe.zzf(int, int)>
		((zzfe)this).zza(3, zzeo1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #147 <Method void zzfe.zza(int, zzeo)>
		((zzfe)this).zzd(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
	//   16   24:return          
	}

	public final void zzb(int i, zzhf zzhf1)
		throws IOException
	{
		((zzfe)this).zzd(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzf(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #145 <Method void zzfe.zzf(int, int)>
		((zzfe)this).zza(3, zzhf1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #149 <Method void zzfe.zza(int, zzhf)>
		((zzfe)this).zzd(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
	//   16   24:return          
	}

	public final void zzb(int i, boolean flag)
		throws IOException
	{
		((zzfe)this).zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzc((byte)flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:int2byte        
	//    7    9:invokevirtual   #154 <Method void zzfe.zzc(byte)>
	//    8   12:return          
	}

	public final void zzb(zzhf zzhf1)
		throws IOException
	{
		((zzfe)this).zzas(zzhf1.zzeq());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #159 <Method int zzhf.zzeq()>
	//    3    7:invokevirtual   #107 <Method void zzfe.zzas(int)>
		zzhf1.zzb(((zzfe) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #162 <Method void zzhf.zzb(zzfe)>
	//    7   17:return          
	}

	public final void zzc(byte byte0)
		throws IOException
	{
		try
		{
			zzsw.put(byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzsw>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_2        
		{
			throw new zzfe$zzc(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #56  <Class zzfe$zzc>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void zzc(int i, long l)
		throws IOException
	{
		((zzfe)this).zzd(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzg(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #165 <Method void zzfe.zzg(long)>
	//    7   11:return          
	}

	public final void zzd(int i, int j)
		throws IOException
	{
		((zzfe)this).zzas(i << 3 | j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:ishl            
	//    4    4:iload_2         
	//    5    5:ior             
	//    6    6:invokevirtual   #107 <Method void zzfe.zzas(int)>
	//    7    9:return          
	}

	public final int zzdz()
	{
		return zzsw.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzsw>
	//    2    4:invokevirtual   #169 <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	public final void zze(int i, int j)
		throws IOException
	{
		((zzfe)this).zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzar(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #171 <Method void zzfe.zzar(int)>
	//    7   11:return          
	}

	public final void zze(long l)
		throws IOException
	{
_L1:
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #172 <Long -128L>
	//*   1    3:lload_1         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            22
			try
			{
				zzsw.put((byte)(int)l);
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field ByteBuffer zzsw>
	//    8   14:lload_1         
	//    9   15:l2i             
	//   10   16:int2byte        
	//   11   17:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
	//   12   20:pop             
				return;
	//   13   21:return          
			}
	//*  14   22:aload_0         
	//*  15   23:getfield        #35  <Field ByteBuffer zzsw>
	//*  16   26:lload_1         
	//*  17   27:l2i             
	//*  18   28:bipush          127
	//*  19   30:iand            
	//*  20   31:sipush          128
	//*  21   34:ior             
	//*  22   35:int2byte        
	//*  23   36:invokevirtual   #137 <Method ByteBuffer ByteBuffer.put(byte)>
	//*  24   39:pop             
	//*  25   40:lload_1         
	//*  26   41:bipush          7
	//*  27   43:lushr           
	//*  28   44:lstore_1        
	//*  29   45:goto            0
			catch(BufferOverflowException bufferoverflowexception)
	//*  30   48:astore_3        
			{
				throw new zzfe$zzc(((Throwable) (bufferoverflowexception)));
	//   31   49:new             #56  <Class zzfe$zzc>
	//   32   52:dup             
	//   33   53:aload_3         
	//   34   54:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//   35   57:athrow          
			}
		zzsw.put((byte)((int)l & 0x7f | 0x80));
		l >>>= 7;
		  goto _L1
	}

	public final void zzf(int i, int j)
		throws IOException
	{
		((zzfe)this).zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzas(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #107 <Method void zzfe.zzas(int)>
	//    7   11:return          
	}

	public final void zzf(byte abyte0[], int i, int j)
		throws IOException
	{
		((zzfe)this).zzas(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #107 <Method void zzfe.zzas(int)>
		((zzfe)this).write(abyte0, 0, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iload_3         
	//    7    9:invokevirtual   #133 <Method void zzfe.write(byte[], int, int)>
	//    8   12:return          
	}

	public final void zzg(long l)
		throws IOException
	{
		try
		{
			zzsw.putLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzsw>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #177 <Method ByteBuffer ByteBuffer.putLong(long)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_3        
		{
			throw new zzfe$zzc(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #56  <Class zzfe$zzc>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void zzh(int i, int j)
		throws IOException
	{
		((zzfe)this).zzd(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #77  <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzau(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #180 <Method void zzfe.zzau(int)>
	//    7   11:return          
	}

	public final void zzm(String s)
		throws IOException
	{
		int i = zzsw.position();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzsw>
	//    2    4:invokevirtual   #39  <Method int ByteBuffer.position()>
	//    3    7:istore_2        
		int j;
		int k;
		try
		{
			j = zzax(s.length() * 3);
	//    4    8:aload_1         
	//    5    9:invokevirtual   #189 <Method int String.length()>
	//    6   12:iconst_3        
	//    7   13:imul            
	//    8   14:invokestatic    #193 <Method int zzax(int)>
	//    9   17:istore_3        
			k = zzax(s.length());
	//   10   18:aload_1         
	//   11   19:invokevirtual   #189 <Method int String.length()>
	//   12   22:invokestatic    #193 <Method int zzax(int)>
	//   13   25:istore          4
		}
	//*  14   27:iload           4
	//*  15   29:iload_3         
	//*  16   30:icmpne          95
	//*  17   33:aload_0         
	//*  18   34:getfield        #35  <Field ByteBuffer zzsw>
	//*  19   37:invokevirtual   #39  <Method int ByteBuffer.position()>
	//*  20   40:iload           4
	//*  21   42:iadd            
	//*  22   43:istore_3        
	//*  23   44:aload_0         
	//*  24   45:getfield        #35  <Field ByteBuffer zzsw>
	//*  25   48:iload_3         
	//*  26   49:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  27   52:pop             
	//*  28   53:aload_0         
	//*  29   54:aload_1         
	//*  30   55:invokespecial   #195 <Method void zzo(String)>
	//*  31   58:aload_0         
	//*  32   59:getfield        #35  <Field ByteBuffer zzsw>
	//*  33   62:invokevirtual   #39  <Method int ByteBuffer.position()>
	//*  34   65:istore          4
	//*  35   67:aload_0         
	//*  36   68:getfield        #35  <Field ByteBuffer zzsw>
	//*  37   71:iload_2         
	//*  38   72:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  39   75:pop             
	//*  40   76:aload_0         
	//*  41   77:iload           4
	//*  42   79:iload_3         
	//*  43   80:isub            
	//*  44   81:invokevirtual   #107 <Method void zzfe.zzas(int)>
	//*  45   84:aload_0         
	//*  46   85:getfield        #35  <Field ByteBuffer zzsw>
	//*  47   88:iload           4
	//*  48   90:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  49   93:pop             
	//*  50   94:return          
	//*  51   95:aload_0         
	//*  52   96:aload_1         
	//*  53   97:invokestatic    #198 <Method int zziw.zza(CharSequence)>
	//*  54  100:invokevirtual   #107 <Method void zzfe.zzas(int)>
	//*  55  103:aload_0         
	//*  56  104:aload_1         
	//*  57  105:invokespecial   #195 <Method void zzo(String)>
	//*  58  108:return          
	//*  59  109:astore_1        
	//*  60  110:new             #56  <Class zzfe$zzc>
	//*  61  113:dup             
	//*  62  114:aload_1         
	//*  63  115:invokespecial   #59  <Method void zzfe$zzc(Throwable)>
	//*  64  118:athrow          
		catch(zzja zzja1)
	//*  65  119:astore          5
		{
			zzsw.position(i);
	//   66  121:aload_0         
	//   67  122:getfield        #35  <Field ByteBuffer zzsw>
	//   68  125:iload_2         
	//   69  126:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   70  129:pop             
			((zzfe)this).zza(s, zzja1);
	//   71  130:aload_0         
	//   72  131:aload_1         
	//   73  132:aload           5
	//   74  134:invokevirtual   #201 <Method void zzfe.zza(String, zzja)>
			return;
	//   75  137:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new zzfe$zzc(((Throwable) (s)));
		}
		if(k != j)
			break MISSING_BLOCK_LABEL_95;
		j = zzsw.position() + k;
		zzsw.position(j);
		zzo(s);
		k = zzsw.position();
		zzsw.position(i);
		((zzfe)this).zzas(k - j);
		zzsw.position(k);
		return;
		((zzfe)this).zzas(zziw.zza(((CharSequence) (s))));
		zzo(s);
		return;
	}

	private final int zzsu;
	private final ByteBuffer zzsv;
	private final ByteBuffer zzsw;

	zzfe$zzd(ByteBuffer bytebuffer)
	{
		super(((zzff) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void zzfe(zzff)>
		zzsv = bytebuffer;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #17  <Field ByteBuffer zzsv>
		zzsw = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #23  <Method ByteBuffer ByteBuffer.duplicate()>
	//    9   15:getstatic       #29  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   10   18:invokevirtual   #33  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   21:putfield        #35  <Field ByteBuffer zzsw>
		zzsu = bytebuffer.position();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #39  <Method int ByteBuffer.position()>
	//   15   29:putfield        #41  <Field int zzsu>
	//   16   32:return          
	}
}
