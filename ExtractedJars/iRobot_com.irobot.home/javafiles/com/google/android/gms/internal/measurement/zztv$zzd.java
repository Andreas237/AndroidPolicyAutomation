// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.*;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztv, zzxl, zzte, zzsx, 
//			zzwl, zzvv, zzxp

static final class zztv$zzd extends zztv
{

	private final void zzgd(String s)
	{
		try
		{
			zzxl.zza(((CharSequence) (s)), zzbut);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #35  <Field ByteBuffer zzbut>
	//    3    5:invokestatic    #52  <Method void zzxl.zza(CharSequence, ByteBuffer)>
			return;
	//    4    8:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    9:astore_1        
		{
			throw new zztv$zzc(((Throwable) (s)));
	//    6   10:new             #54  <Class zztv$zzc>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//   10   18:athrow          
		}
	}

	public final void flush()
	{
		zzbus.position(zzbut.position());
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ByteBuffer zzbus>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field ByteBuffer zzbut>
	//    4    8:invokevirtual   #39  <Method int ByteBuffer.position()>
	//    5   11:invokevirtual   #62  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    6   14:pop             
	//    7   15:return          
	}

	public final void write(byte abyte0[], int i, int j)
	{
		try
		{
			zzbut.put(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzbut>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #70  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
	//    6   10:pop             
			return;
	//    7   11:return          
		}
	//*   8   12:astore_1        
	//*   9   13:new             #54  <Class zztv$zzc>
	//*  10   16:dup             
	//*  11   17:aload_1         
	//*  12   18:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//*  13   21:athrow          
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  14   22:astore_1        
		{
			throw new zztv$zzc(((Throwable) (abyte0)));
	//   15   23:new             #54  <Class zztv$zzc>
	//   16   26:dup             
	//   17   27:aload_1         
	//   18   28:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//   19   31:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
		{
			throw new zztv$zzc(((Throwable) (abyte0)));
		}
	}

	public final void zza(int i, long l)
	{
		((zztv)this).zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zzat(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #79  <Method void zztv.zzat(long)>
	//    7   11:return          
	}

	public final void zza(int i, zzte zzte1)
	{
		((zztv)this).zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zza(zzte1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #83  <Method void zztv.zza(zzte)>
	//    7   11:return          
	}

	public final void zza(int i, zzvv zzvv1)
	{
		((zztv)this).zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zzb(zzvv1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #88  <Method void zztv.zzb(zzvv)>
	//    7   11:return          
	}

	final void zza(int i, zzvv zzvv1, zzwl zzwl1)
	{
		((zztv)this).zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zza(zzvv1, zzwl1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #92  <Method void zztv.zza(zzvv, zzwl)>
	//    8   12:return          
	}

	public final void zza(zzte zzte1)
	{
		((zztv)this).zzba(zzte1.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #97  <Method int zzte.size()>
	//    3    5:invokevirtual   #101 <Method void zztv.zzba(int)>
		zzte1.zza(((zztd) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #104 <Method void zzte.zza(zztd)>
	//    7   13:return          
	}

	final void zza(zzvv zzvv1, zzwl zzwl1)
	{
		zzsx zzsx1 = (zzsx)zzvv1;
	//    0    0:aload_1         
	//    1    1:checkcast       #106 <Class zzsx>
	//    2    4:astore          5
		int j = zzsx1.zztx();
	//    3    6:aload           5
	//    4    8:invokevirtual   #109 <Method int zzsx.zztx()>
	//    5   11:istore          4
		int i = j;
	//    6   13:iload           4
	//    7   15:istore_3        
		if(j == -1)
	//*   8   16:iload           4
	//*   9   18:iconst_m1       
	//*  10   19:icmpne          37
		{
			i = zzwl1.zzai(((Object) (zzsx1)));
	//   11   22:aload_2         
	//   12   23:aload           5
	//   13   25:invokeinterface #115 <Method int zzwl.zzai(Object)>
	//   14   30:istore_3        
			zzsx1.zzai(i);
	//   15   31:aload           5
	//   16   33:iload_3         
	//   17   34:invokevirtual   #117 <Method void zzsx.zzai(int)>
		}
		((zztv)this).zzba(i);
	//   18   37:aload_0         
	//   19   38:iload_3         
	//   20   39:invokevirtual   #101 <Method void zztv.zzba(int)>
		zzwl1.zza(((Object) (zzvv1)), ((zzxy) (zzbup)));
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #121 <Field zztx zzbup>
	//   25   48:invokeinterface #124 <Method void zzwl.zza(Object, zzxy)>
	//   26   53:return          
	}

	public final void zza(byte abyte0[], int i, int j)
	{
		((zztv)this).write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #126 <Method void zztv.write(byte[], int, int)>
	//    5    7:return          
	}

	public final void zzat(long l)
	{
_L1:
		BufferOverflowException bufferoverflowexception;
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #127 <Long -128L>
	//*   1    3:lload_1         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            22
			try
			{
				zzbut.put((byte)(int)l);
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field ByteBuffer zzbut>
	//    8   14:lload_1         
	//    9   15:l2i             
	//   10   16:int2byte        
	//   11   17:invokevirtual   #131 <Method ByteBuffer ByteBuffer.put(byte)>
	//   12   20:pop             
				return;
	//   13   21:return          
			}
	//*  14   22:aload_0         
	//*  15   23:getfield        #35  <Field ByteBuffer zzbut>
	//*  16   26:lload_1         
	//*  17   27:l2i             
	//*  18   28:bipush          127
	//*  19   30:iand            
	//*  20   31:sipush          128
	//*  21   34:ior             
	//*  22   35:int2byte        
	//*  23   36:invokevirtual   #131 <Method ByteBuffer ByteBuffer.put(byte)>
	//*  24   39:pop             
	//*  25   40:lload_1         
	//*  26   41:bipush          7
	//*  27   43:lushr           
	//*  28   44:lstore_1        
	//*  29   45:goto            0
	//*  30   48:new             #54  <Class zztv$zzc>
	//*  31   51:dup             
	//*  32   52:aload_3         
	//*  33   53:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//*  34   56:athrow          
			// Misplaced declaration of an exception variable
			catch(BufferOverflowException bufferoverflowexception)
			{
				throw new zztv$zzc(((Throwable) (bufferoverflowexception)));
			}
		zzbut.put((byte)((int)l & 0x7f | 0x80));
		l >>>= 7;
		  goto _L1
	//*  35   57:astore_3        
	//*  36   58:goto            48
	}

	public final void zzav(long l)
	{
		try
		{
			zzbut.putLong(l);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzbut>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #136 <Method ByteBuffer ByteBuffer.putLong(long)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_3        
		{
			throw new zztv$zzc(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #54  <Class zztv$zzc>
	//    8   14:dup             
	//    9   15:aload_3         
	//   10   16:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void zzaz(int i)
	{
		if(i >= 0)
	//*   0    0:iload_1         
	//*   1    1:iflt            10
		{
			((zztv)this).zzba(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #101 <Method void zztv.zzba(int)>
			return;
	//    5    9:return          
		} else
		{
			((zztv)this).zzat(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #79  <Method void zztv.zzat(long)>
			return;
	//   10   16:return          
		}
	}

	public final void zzb(int i, zzte zzte1)
	{
		((zztv)this).zzc(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zze(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #140 <Method void zztv.zze(int, int)>
		((zztv)this).zza(3, zzte1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #142 <Method void zztv.zza(int, zzte)>
		((zztv)this).zzc(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #75  <Method void zztv.zzc(int, int)>
	//   16   24:return          
	}

	public final void zzb(int i, zzvv zzvv1)
	{
		((zztv)this).zzc(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zze(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #140 <Method void zztv.zze(int, int)>
		((zztv)this).zza(3, zzvv1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #144 <Method void zztv.zza(int, zzvv)>
		((zztv)this).zzc(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #75  <Method void zztv.zzc(int, int)>
	//   16   24:return          
	}

	public final void zzb(int i, String s)
	{
		((zztv)this).zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zzgb(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #148 <Method void zztv.zzgb(String)>
	//    7   11:return          
	}

	public final void zzb(int i, boolean flag)
	{
		((zztv)this).zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zzc((byte)flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:int2byte        
	//    7    9:invokevirtual   #152 <Method void zztv.zzc(byte)>
	//    8   12:return          
	}

	public final void zzb(zzvv zzvv1)
	{
		((zztv)this).zzba(zzvv1.zzvx());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #157 <Method int zzvv.zzvx()>
	//    3    7:invokevirtual   #101 <Method void zztv.zzba(int)>
		zzvv1.zzb(((zztv) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #160 <Method void zzvv.zzb(zztv)>
	//    7   17:return          
	}

	public final void zzba(int i)
	{
_L1:
		BufferOverflowException bufferoverflowexception;
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_1         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            18
			try
			{
				zzbut.put((byte)i);
	//    4    7:aload_0         
	//    5    8:getfield        #35  <Field ByteBuffer zzbut>
	//    6   11:iload_1         
	//    7   12:int2byte        
	//    8   13:invokevirtual   #131 <Method ByteBuffer ByteBuffer.put(byte)>
	//    9   16:pop             
				return;
	//   10   17:return          
			}
	//*  11   18:aload_0         
	//*  12   19:getfield        #35  <Field ByteBuffer zzbut>
	//*  13   22:iload_1         
	//*  14   23:bipush          127
	//*  15   25:iand            
	//*  16   26:sipush          128
	//*  17   29:ior             
	//*  18   30:int2byte        
	//*  19   31:invokevirtual   #131 <Method ByteBuffer ByteBuffer.put(byte)>
	//*  20   34:pop             
	//*  21   35:iload_1         
	//*  22   36:bipush          7
	//*  23   38:iushr           
	//*  24   39:istore_1        
	//*  25   40:goto            0
	//*  26   43:new             #54  <Class zztv$zzc>
	//*  27   46:dup             
	//*  28   47:aload_2         
	//*  29   48:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//*  30   51:athrow          
			// Misplaced declaration of an exception variable
			catch(BufferOverflowException bufferoverflowexception)
			{
				throw new zztv$zzc(((Throwable) (bufferoverflowexception)));
			}
		zzbut.put((byte)(i & 0x7f | 0x80));
		i >>>= 7;
		  goto _L1
	//*  31   52:astore_2        
	//*  32   53:goto            43
	}

	public final void zzbc(int i)
	{
		try
		{
			zzbut.putInt(i);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzbut>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #165 <Method ByteBuffer ByteBuffer.putInt(int)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_2        
		{
			throw new zztv$zzc(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #54  <Class zztv$zzc>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void zzc(byte byte0)
	{
		try
		{
			zzbut.put(byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzbut>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #131 <Method ByteBuffer ByteBuffer.put(byte)>
	//    4    8:pop             
			return;
	//    5    9:return          
		}
		catch(BufferOverflowException bufferoverflowexception)
	//*   6   10:astore_2        
		{
			throw new zztv$zzc(((Throwable) (bufferoverflowexception)));
	//    7   11:new             #54  <Class zztv$zzc>
	//    8   14:dup             
	//    9   15:aload_2         
	//   10   16:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//   11   19:athrow          
		}
	}

	public final void zzc(int i, int j)
	{
		((zztv)this).zzba(i << 3 | j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_3        
	//    3    3:ishl            
	//    4    4:iload_2         
	//    5    5:ior             
	//    6    6:invokevirtual   #101 <Method void zztv.zzba(int)>
	//    7    9:return          
	}

	public final void zzc(int i, long l)
	{
		((zztv)this).zzc(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zzav(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #167 <Method void zztv.zzav(long)>
	//    7   11:return          
	}

	public final void zzd(int i, int j)
	{
		((zztv)this).zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zzaz(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #169 <Method void zztv.zzaz(int)>
	//    7   11:return          
	}

	public final void zze(int i, int j)
	{
		((zztv)this).zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zzba(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #101 <Method void zztv.zzba(int)>
	//    7   11:return          
	}

	public final void zze(byte abyte0[], int i, int j)
	{
		((zztv)this).zzba(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #101 <Method void zztv.zzba(int)>
		((zztv)this).write(abyte0, 0, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iload_3         
	//    7    9:invokevirtual   #126 <Method void zztv.write(byte[], int, int)>
	//    8   12:return          
	}

	public final void zzg(int i, int j)
	{
		((zztv)this).zzc(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #75  <Method void zztv.zzc(int, int)>
		((zztv)this).zzbc(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #172 <Method void zztv.zzbc(int)>
	//    7   11:return          
	}

	public final void zzgb(String s)
	{
		int i = zzbut.position();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzbut>
	//    2    4:invokevirtual   #39  <Method int ByteBuffer.position()>
	//    3    7:istore_2        
		int j;
		int k;
		try
		{
			j = zzbf(s.length() * 3);
	//    4    8:aload_1         
	//    5    9:invokevirtual   #181 <Method int String.length()>
	//    6   12:iconst_3        
	//    7   13:imul            
	//    8   14:invokestatic    #185 <Method int zzbf(int)>
	//    9   17:istore_3        
			k = zzbf(s.length());
	//   10   18:aload_1         
	//   11   19:invokevirtual   #181 <Method int String.length()>
	//   12   22:invokestatic    #185 <Method int zzbf(int)>
	//   13   25:istore          4
		}
	//*  14   27:iload           4
	//*  15   29:iload_3         
	//*  16   30:icmpne          95
	//*  17   33:aload_0         
	//*  18   34:getfield        #35  <Field ByteBuffer zzbut>
	//*  19   37:invokevirtual   #39  <Method int ByteBuffer.position()>
	//*  20   40:iload           4
	//*  21   42:iadd            
	//*  22   43:istore_3        
	//*  23   44:aload_0         
	//*  24   45:getfield        #35  <Field ByteBuffer zzbut>
	//*  25   48:iload_3         
	//*  26   49:invokevirtual   #62  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  27   52:pop             
	//*  28   53:aload_0         
	//*  29   54:aload_1         
	//*  30   55:invokespecial   #187 <Method void zzgd(String)>
	//*  31   58:aload_0         
	//*  32   59:getfield        #35  <Field ByteBuffer zzbut>
	//*  33   62:invokevirtual   #39  <Method int ByteBuffer.position()>
	//*  34   65:istore          4
	//*  35   67:aload_0         
	//*  36   68:getfield        #35  <Field ByteBuffer zzbut>
	//*  37   71:iload_2         
	//*  38   72:invokevirtual   #62  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  39   75:pop             
	//*  40   76:aload_0         
	//*  41   77:iload           4
	//*  42   79:iload_3         
	//*  43   80:isub            
	//*  44   81:invokevirtual   #101 <Method void zztv.zzba(int)>
	//*  45   84:aload_0         
	//*  46   85:getfield        #35  <Field ByteBuffer zzbut>
	//*  47   88:iload           4
	//*  48   90:invokevirtual   #62  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  49   93:pop             
	//*  50   94:return          
	//*  51   95:aload_0         
	//*  52   96:aload_1         
	//*  53   97:invokestatic    #190 <Method int zzxl.zza(CharSequence)>
	//*  54  100:invokevirtual   #101 <Method void zztv.zzba(int)>
	//*  55  103:aload_0         
	//*  56  104:aload_1         
	//*  57  105:invokespecial   #187 <Method void zzgd(String)>
	//*  58  108:return          
	//*  59  109:astore_1        
	//*  60  110:new             #54  <Class zztv$zzc>
	//*  61  113:dup             
	//*  62  114:aload_1         
	//*  63  115:invokespecial   #57  <Method void zztv$zzc(Throwable)>
	//*  64  118:athrow          
		catch(zzxp zzxp1)
	//*  65  119:astore          5
		{
			zzbut.position(i);
	//   66  121:aload_0         
	//   67  122:getfield        #35  <Field ByteBuffer zzbut>
	//   68  125:iload_2         
	//   69  126:invokevirtual   #62  <Method java.nio.Buffer ByteBuffer.position(int)>
	//   70  129:pop             
			((zztv)this).zza(s, zzxp1);
	//   71  130:aload_0         
	//   72  131:aload_1         
	//   73  132:aload           5
	//   74  134:invokevirtual   #193 <Method void zztv.zza(String, zzxp)>
			return;
	//   75  137:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new zztv$zzc(((Throwable) (s)));
		}
		if(k != j)
			break MISSING_BLOCK_LABEL_95;
		j = zzbut.position() + k;
		zzbut.position(j);
		zzgd(s);
		k = zzbut.position();
		zzbut.position(i);
		((zztv)this).zzba(k - j);
		zzbut.position(k);
		return;
		((zztv)this).zzba(zzxl.zza(((CharSequence) (s))));
		zzgd(s);
		return;
	}

	public final int zzvj()
	{
		return zzbut.remaining();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ByteBuffer zzbut>
	//    2    4:invokevirtual   #197 <Method int ByteBuffer.remaining()>
	//    3    7:ireturn         
	}

	private final int zzbur;
	private final ByteBuffer zzbus;
	private final ByteBuffer zzbut;

	zztv$zzd(ByteBuffer bytebuffer)
	{
		super(((zztw) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #15  <Method void zztv(zztw)>
		zzbus = bytebuffer;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #17  <Field ByteBuffer zzbus>
		zzbut = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #23  <Method ByteBuffer ByteBuffer.duplicate()>
	//    9   15:getstatic       #29  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   10   18:invokevirtual   #33  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   21:putfield        #35  <Field ByteBuffer zzbut>
		zzbur = bytebuffer.position();
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #39  <Method int ByteBuffer.position()>
	//   15   29:putfield        #41  <Field int zzbur>
	//   16   32:return          
	}
}
