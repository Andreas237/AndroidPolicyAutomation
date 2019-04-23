// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzfe, zziu, zzeo, zzec, 
//			zzhw, zzhf, zzja, zziw

static final class zzfe$zze extends zzfe
{

	private final void zzn(long l)
	{
		zzsw.position((int)(l - zzsx));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer zzsw>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field long zzsx>
	//    5    9:lsub            
	//    6   10:l2i             
	//    7   11:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    8   14:pop             
	//    9   15:return          
	}

	public final void flush()
	{
		zzsv.position((int)(zztb - zzsx));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ByteBuffer zzsv>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field long zztb>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field long zzsx>
	//    6   12:lsub            
	//    7   13:l2i             
	//    8   14:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void write(byte abyte0[], int i, int j)
		throws IOException
	{
		if(abyte0 != null && i >= 0 && j >= 0 && abyte0.length - j >= i)
	//*   0    0:aload_1         
	//*   1    1:ifnull          72
	//*   2    4:iload_2         
	//*   3    5:iflt            72
	//*   4    8:iload_3         
	//*   5    9:iflt            72
	//*   6   12:aload_1         
	//*   7   13:arraylength     
	//*   8   14:iload_3         
	//*   9   15:isub            
	//*  10   16:iload_2         
	//*  11   17:icmplt          72
		{
			long l = zzsz;
	//   12   20:aload_0         
	//   13   21:getfield        #58  <Field long zzsz>
	//   14   24:lstore          4
			long l1 = j;
	//   15   26:iload_3         
	//   16   27:i2l             
	//   17   28:lstore          6
			long l2 = zztb;
	//   18   30:aload_0         
	//   19   31:getfield        #64  <Field long zztb>
	//   20   34:lstore          8
			if(l - l1 >= l2)
	//*  21   36:lload           4
	//*  22   38:lload           6
	//*  23   40:lsub            
	//*  24   41:lload           8
	//*  25   43:lcmp            
	//*  26   44:ifge            50
	//*  27   47:goto            72
			{
				zziu.zza(abyte0, i, l2, l1);
	//   28   50:aload_1         
	//   29   51:iload_2         
	//   30   52:i2l             
	//   31   53:lload           8
	//   32   55:lload           6
	//   33   57:invokestatic    #80  <Method void zziu.zza(byte[], long, long, long)>
				zztb = zztb + l1;
	//   34   60:aload_0         
	//   35   61:aload_0         
	//   36   62:getfield        #64  <Field long zztb>
	//   37   65:lload           6
	//   38   67:ladd            
	//   39   68:putfield        #64  <Field long zztb>
				return;
	//   40   71:return          
			}
		}
		if(abyte0 == null)
	//*  41   72:aload_1         
	//*  42   73:ifnonnull       86
			throw new NullPointerException("value");
	//   43   76:new             #82  <Class NullPointerException>
	//   44   79:dup             
	//   45   80:ldc1            #84  <String "value">
	//   46   82:invokespecial   #87  <Method void NullPointerException(String)>
	//   47   85:athrow          
		else
			throw new zzfe$zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Long.valueOf(zztb), Long.valueOf(zzsz), Integer.valueOf(j)
			}));
	//   48   86:new             #89  <Class zzfe$zzc>
	//   49   89:dup             
	//   50   90:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
	//   51   92:iconst_3        
	//   52   93:anewarray       Object[]
	//   53   96:dup             
	//   54   97:iconst_0        
	//   55   98:aload_0         
	//   56   99:getfield        #64  <Field long zztb>
	//   57  102:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   58  105:aastore         
	//   59  106:dup             
	//   60  107:iconst_1        
	//   61  108:aload_0         
	//   62  109:getfield        #58  <Field long zzsz>
	//   63  112:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   64  115:aastore         
	//   65  116:dup             
	//   66  117:iconst_2        
	//   67  118:iload_3         
	//   68  119:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//   69  122:aastore         
	//   70  123:invokestatic    #110 <Method String String.format(String, Object[])>
	//   71  126:invokespecial   #111 <Method void zzfe$zzc(String)>
	//   72  129:athrow          
	}

	public final void zza(int i, long l)
		throws IOException
	{
		((zzfe)this).zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zze(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #119 <Method void zzfe.zze(long)>
	//    7   11:return          
	}

	public final void zza(int i, zzeo zzeo1)
		throws IOException
	{
		((zzfe)this).zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zza(zzeo1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #123 <Method void zzfe.zza(zzeo)>
	//    7   11:return          
	}

	public final void zza(int i, zzhf zzhf1)
		throws IOException
	{
		((zzfe)this).zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzb(zzhf1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #127 <Method void zzfe.zzb(zzhf)>
	//    7   11:return          
	}

	final void zza(int i, zzhf zzhf1, zzhw zzhw1)
		throws IOException
	{
		((zzfe)this).zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zza(zzhf1, zzhw1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #131 <Method void zzfe.zza(zzhf, zzhw)>
	//    8   12:return          
	}

	public final void zza(int i, String s)
		throws IOException
	{
		((zzfe)this).zzd(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzm(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #135 <Method void zzfe.zzm(String)>
	//    7   11:return          
	}

	public final void zza(zzeo zzeo1)
		throws IOException
	{
		((zzfe)this).zzas(zzeo1.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #140 <Method int zzeo.size()>
	//    3    5:invokevirtual   #144 <Method void zzfe.zzas(int)>
		zzeo1.zza(((zzen) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #147 <Method void zzeo.zza(zzen)>
	//    7   13:return          
	}

	final void zza(zzhf zzhf1, zzhw zzhw1)
		throws IOException
	{
		zzec zzec1 = (zzec)zzhf1;
	//    0    0:aload_1         
	//    1    1:checkcast       #149 <Class zzec>
	//    2    4:astore          5
		int j = zzec1.zzcf();
	//    3    6:aload           5
	//    4    8:invokevirtual   #152 <Method int zzec.zzcf()>
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
	//   13   25:invokeinterface #158 <Method int zzhw.zzp(Object)>
	//   14   30:istore_3        
			zzec1.zzy(i);
	//   15   31:aload           5
	//   16   33:iload_3         
	//   17   34:invokevirtual   #161 <Method void zzec.zzy(int)>
		}
		((zzfe)this).zzas(i);
	//   18   37:aload_0         
	//   19   38:iload_3         
	//   20   39:invokevirtual   #144 <Method void zzfe.zzas(int)>
		zzhw1.zza(((Object) (zzhf1)), ((zzjj) (zzss)));
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #165 <Field zzfg zzss>
	//   25   48:invokeinterface #168 <Method void zzhw.zza(Object, zzjj)>
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
	//    4    4:invokevirtual   #170 <Method void zzfe.write(byte[], int, int)>
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
	//    4    6:invokevirtual   #144 <Method void zzfe.zzas(int)>
			return;
	//    5    9:return          
		} else
		{
			((zzfe)this).zze(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #119 <Method void zzfe.zze(long)>
			return;
	//   10   16:return          
		}
	}

	public final void zzas(int i)
		throws IOException
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(zztb <= zzta)
	//*   2    2:aload_0         
	//*   3    3:getfield        #64  <Field long zztb>
	//*   4    6:aload_0         
	//*   5    7:getfield        #62  <Field long zzta>
	//*   6   10:lcmp            
	//*   7   11:ifgt            73
			do
			{
				if((i & 0xffffff80) == 0)
	//*   8   14:iload_1         
	//*   9   15:bipush          -128
	//*  10   17:iand            
	//*  11   18:ifne            40
				{
					long l = zztb;
	//   12   21:aload_0         
	//   13   22:getfield        #64  <Field long zztb>
	//   14   25:lstore_3        
					zztb = 1L + l;
	//   15   26:aload_0         
	//   16   27:lconst_1        
	//   17   28:lload_3         
	//   18   29:ladd            
	//   19   30:putfield        #64  <Field long zztb>
					zziu.zza(l, (byte)i);
	//   20   33:lload_3         
	//   21   34:iload_1         
	//   22   35:int2byte        
	//   23   36:invokestatic    #174 <Method void zziu.zza(long, byte)>
					return;
	//   24   39:return          
				}
				long l1 = zztb;
	//   25   40:aload_0         
	//   26   41:getfield        #64  <Field long zztb>
	//   27   44:lstore_3        
				zztb = l1 + 1L;
	//   28   45:aload_0         
	//   29   46:lload_3         
	//   30   47:lconst_1        
	//   31   48:ladd            
	//   32   49:putfield        #64  <Field long zztb>
				zziu.zza(l1, (byte)(i & 0x7f | 0x80));
	//   33   52:lload_3         
	//   34   53:iload_1         
	//   35   54:bipush          127
	//   36   56:iand            
	//   37   57:sipush          128
	//   38   60:ior             
	//   39   61:int2byte        
	//   40   62:invokestatic    #174 <Method void zziu.zza(long, byte)>
				i >>>= 7;
	//   41   65:iload_1         
	//   42   66:bipush          7
	//   43   68:iushr           
	//   44   69:istore_1        
			} while(true);
	//   45   70:goto            14
		do
		{
			long l2 = zztb;
	//   46   73:aload_0         
	//   47   74:getfield        #64  <Field long zztb>
	//   48   77:lstore_3        
			if(l2 < zzsz)
	//*  49   78:lload_3         
	//*  50   79:aload_0         
	//*  51   80:getfield        #58  <Field long zzsz>
	//*  52   83:lcmp            
	//*  53   84:ifge            136
			{
				if((j & 0xffffff80) == 0)
	//*  54   87:iload_2         
	//*  55   88:bipush          -128
	//*  56   90:iand            
	//*  57   91:ifne            108
				{
					zztb = 1L + l2;
	//   58   94:aload_0         
	//   59   95:lconst_1        
	//   60   96:lload_3         
	//   61   97:ladd            
	//   62   98:putfield        #64  <Field long zztb>
					zziu.zza(l2, (byte)j);
	//   63  101:lload_3         
	//   64  102:iload_2         
	//   65  103:int2byte        
	//   66  104:invokestatic    #174 <Method void zziu.zza(long, byte)>
					return;
	//   67  107:return          
				}
				zztb = l2 + 1L;
	//   68  108:aload_0         
	//   69  109:lload_3         
	//   70  110:lconst_1        
	//   71  111:ladd            
	//   72  112:putfield        #64  <Field long zztb>
				zziu.zza(l2, (byte)(j & 0x7f | 0x80));
	//   73  115:lload_3         
	//   74  116:iload_2         
	//   75  117:bipush          127
	//   76  119:iand            
	//   77  120:sipush          128
	//   78  123:ior             
	//   79  124:int2byte        
	//   80  125:invokestatic    #174 <Method void zziu.zza(long, byte)>
				j >>>= 7;
	//   81  128:iload_2         
	//   82  129:bipush          7
	//   83  131:iushr           
	//   84  132:istore_2        
			} else
	//*  85  133:goto            73
			{
				throw new zzfe$zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Long.valueOf(l2), Long.valueOf(zzsz), Integer.valueOf(1)
				}));
	//   86  136:new             #89  <Class zzfe$zzc>
	//   87  139:dup             
	//   88  140:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
	//   89  142:iconst_3        
	//   90  143:anewarray       Object[]
	//   91  146:dup             
	//   92  147:iconst_0        
	//   93  148:lload_3         
	//   94  149:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   95  152:aastore         
	//   96  153:dup             
	//   97  154:iconst_1        
	//   98  155:aload_0         
	//   99  156:getfield        #58  <Field long zzsz>
	//  100  159:invokestatic    #99  <Method Long Long.valueOf(long)>
	//  101  162:aastore         
	//  102  163:dup             
	//  103  164:iconst_2        
	//  104  165:iconst_1        
	//  105  166:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//  106  169:aastore         
	//  107  170:invokestatic    #110 <Method String String.format(String, Object[])>
	//  108  173:invokespecial   #111 <Method void zzfe$zzc(String)>
	//  109  176:athrow          
			}
		} while(true);
	}

	public final void zzau(int i)
		throws IOException
	{
		zzsw.putInt((int)(zztb - zzsx), i);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer zzsw>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field long zztb>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field long zzsx>
	//    6   12:lsub            
	//    7   13:l2i             
	//    8   14:iload_1         
	//    9   15:invokevirtual   #179 <Method ByteBuffer ByteBuffer.putInt(int, int)>
	//   10   18:pop             
		zztb = zztb + 4L;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #64  <Field long zztb>
	//   14   24:ldc2w           #180 <Long 4L>
	//   15   27:ladd            
	//   16   28:putfield        #64  <Field long zztb>
	//   17   31:return          
	}

	public final void zzb(int i, zzeo zzeo1)
		throws IOException
	{
		((zzfe)this).zzd(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzf(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #184 <Method void zzfe.zzf(int, int)>
		((zzfe)this).zza(3, zzeo1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #186 <Method void zzfe.zza(int, zzeo)>
		((zzfe)this).zzd(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
	//   16   24:return          
	}

	public final void zzb(int i, zzhf zzhf1)
		throws IOException
	{
		((zzfe)this).zzd(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzf(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #184 <Method void zzfe.zzf(int, int)>
		((zzfe)this).zza(3, zzhf1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #188 <Method void zzfe.zza(int, zzhf)>
		((zzfe)this).zzd(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
	//   16   24:return          
	}

	public final void zzb(int i, boolean flag)
		throws IOException
	{
		((zzfe)this).zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzc((byte)flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:int2byte        
	//    7    9:invokevirtual   #193 <Method void zzfe.zzc(byte)>
	//    8   12:return          
	}

	public final void zzb(zzhf zzhf1)
		throws IOException
	{
		((zzfe)this).zzas(zzhf1.zzeq());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #198 <Method int zzhf.zzeq()>
	//    3    7:invokevirtual   #144 <Method void zzfe.zzas(int)>
		zzhf1.zzb(((zzfe) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #201 <Method void zzhf.zzb(zzfe)>
	//    7   17:return          
	}

	public final void zzc(byte byte0)
		throws IOException
	{
		long l = zztb;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long zztb>
	//    2    4:lstore_2        
		if(l < zzsz)
	//*   3    5:lload_2         
	//*   4    6:aload_0         
	//*   5    7:getfield        #58  <Field long zzsz>
	//*   6   10:lcmp            
	//*   7   11:ifge            27
		{
			zztb = 1L + l;
	//    8   14:aload_0         
	//    9   15:lconst_1        
	//   10   16:lload_2         
	//   11   17:ladd            
	//   12   18:putfield        #64  <Field long zztb>
			zziu.zza(l, byte0);
	//   13   21:lload_2         
	//   14   22:iload_1         
	//   15   23:invokestatic    #174 <Method void zziu.zza(long, byte)>
			return;
	//   16   26:return          
		} else
		{
			throw new zzfe$zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Long.valueOf(l), Long.valueOf(zzsz), Integer.valueOf(1)
			}));
	//   17   27:new             #89  <Class zzfe$zzc>
	//   18   30:dup             
	//   19   31:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
	//   20   33:iconst_3        
	//   21   34:anewarray       Object[]
	//   22   37:dup             
	//   23   38:iconst_0        
	//   24   39:lload_2         
	//   25   40:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   26   43:aastore         
	//   27   44:dup             
	//   28   45:iconst_1        
	//   29   46:aload_0         
	//   30   47:getfield        #58  <Field long zzsz>
	//   31   50:invokestatic    #99  <Method Long Long.valueOf(long)>
	//   32   53:aastore         
	//   33   54:dup             
	//   34   55:iconst_2        
	//   35   56:iconst_1        
	//   36   57:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//   37   60:aastore         
	//   38   61:invokestatic    #110 <Method String String.format(String, Object[])>
	//   39   64:invokespecial   #111 <Method void zzfe$zzc(String)>
	//   40   67:athrow          
		}
	}

	public final void zzc(int i, long l)
		throws IOException
	{
		((zzfe)this).zzd(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzg(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #204 <Method void zzfe.zzg(long)>
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
	//    6    6:invokevirtual   #144 <Method void zzfe.zzas(int)>
	//    7    9:return          
	}

	public final int zzdz()
	{
		return (int)(zzsz - zztb);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field long zzsz>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field long zztb>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:ireturn         
	}

	public final void zze(int i, int j)
		throws IOException
	{
		((zzfe)this).zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzar(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #207 <Method void zzfe.zzar(int)>
	//    7   11:return          
	}

	public final void zze(long l)
		throws IOException
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		if(zztb <= zzta)
	//*   2    2:aload_0         
	//*   3    3:getfield        #64  <Field long zztb>
	//*   4    6:aload_0         
	//*   5    7:getfield        #62  <Field long zzta>
	//*   6   10:lcmp            
	//*   7   11:ifgt            78
			do
			{
				if((l & -128L) == 0L)
	//*   8   14:lload_1         
	//*   9   15:ldc2w           #208 <Long -128L>
	//*  10   18:land            
	//*  11   19:lconst_0        
	//*  12   20:lcmp            
	//*  13   21:ifne            44
				{
					l1 = zztb;
	//   14   24:aload_0         
	//   15   25:getfield        #64  <Field long zztb>
	//   16   28:lstore_3        
					zztb = 1L + l1;
	//   17   29:aload_0         
	//   18   30:lconst_1        
	//   19   31:lload_3         
	//   20   32:ladd            
	//   21   33:putfield        #64  <Field long zztb>
					zziu.zza(l1, (byte)(int)l);
	//   22   36:lload_3         
	//   23   37:lload_1         
	//   24   38:l2i             
	//   25   39:int2byte        
	//   26   40:invokestatic    #174 <Method void zziu.zza(long, byte)>
					return;
	//   27   43:return          
				}
				l1 = zztb;
	//   28   44:aload_0         
	//   29   45:getfield        #64  <Field long zztb>
	//   30   48:lstore_3        
				zztb = l1 + 1L;
	//   31   49:aload_0         
	//   32   50:lload_3         
	//   33   51:lconst_1        
	//   34   52:ladd            
	//   35   53:putfield        #64  <Field long zztb>
				zziu.zza(l1, (byte)((int)l & 0x7f | 0x80));
	//   36   56:lload_3         
	//   37   57:lload_1         
	//   38   58:l2i             
	//   39   59:bipush          127
	//   40   61:iand            
	//   41   62:sipush          128
	//   42   65:ior             
	//   43   66:int2byte        
	//   44   67:invokestatic    #174 <Method void zziu.zza(long, byte)>
				l >>>= 7;
	//   45   70:lload_1         
	//   46   71:bipush          7
	//   47   73:lushr           
	//   48   74:lstore_1        
			} while(true);
	//   49   75:goto            14
		do
		{
			l = zztb;
	//   50   78:aload_0         
	//   51   79:getfield        #64  <Field long zztb>
	//   52   82:lstore_1        
			if(l < zzsz)
	//*  53   83:lload_1         
	//*  54   84:aload_0         
	//*  55   85:getfield        #58  <Field long zzsz>
	//*  56   88:lcmp            
	//*  57   89:ifge            146
			{
				if((l1 & -128L) == 0L)
	//*  58   92:lload_3         
	//*  59   93:ldc2w           #208 <Long -128L>
	//*  60   96:land            
	//*  61   97:lconst_0        
	//*  62   98:lcmp            
	//*  63   99:ifne            117
				{
					zztb = 1L + l;
	//   64  102:aload_0         
	//   65  103:lconst_1        
	//   66  104:lload_1         
	//   67  105:ladd            
	//   68  106:putfield        #64  <Field long zztb>
					zziu.zza(l, (byte)(int)l1);
	//   69  109:lload_1         
	//   70  110:lload_3         
	//   71  111:l2i             
	//   72  112:int2byte        
	//   73  113:invokestatic    #174 <Method void zziu.zza(long, byte)>
					return;
	//   74  116:return          
				}
				zztb = l + 1L;
	//   75  117:aload_0         
	//   76  118:lload_1         
	//   77  119:lconst_1        
	//   78  120:ladd            
	//   79  121:putfield        #64  <Field long zztb>
				zziu.zza(l, (byte)((int)l1 & 0x7f | 0x80));
	//   80  124:lload_1         
	//   81  125:lload_3         
	//   82  126:l2i             
	//   83  127:bipush          127
	//   84  129:iand            
	//   85  130:sipush          128
	//   86  133:ior             
	//   87  134:int2byte        
	//   88  135:invokestatic    #174 <Method void zziu.zza(long, byte)>
				l1 >>>= 7;
	//   89  138:lload_3         
	//   90  139:bipush          7
	//   91  141:lushr           
	//   92  142:lstore_3        
			} else
	//*  93  143:goto            78
			{
				throw new zzfe$zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Long.valueOf(l), Long.valueOf(zzsz), Integer.valueOf(1)
				}));
	//   94  146:new             #89  <Class zzfe$zzc>
	//   95  149:dup             
	//   96  150:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
	//   97  152:iconst_3        
	//   98  153:anewarray       Object[]
	//   99  156:dup             
	//  100  157:iconst_0        
	//  101  158:lload_1         
	//  102  159:invokestatic    #99  <Method Long Long.valueOf(long)>
	//  103  162:aastore         
	//  104  163:dup             
	//  105  164:iconst_1        
	//  106  165:aload_0         
	//  107  166:getfield        #58  <Field long zzsz>
	//  108  169:invokestatic    #99  <Method Long Long.valueOf(long)>
	//  109  172:aastore         
	//  110  173:dup             
	//  111  174:iconst_2        
	//  112  175:iconst_1        
	//  113  176:invokestatic    #104 <Method Integer Integer.valueOf(int)>
	//  114  179:aastore         
	//  115  180:invokestatic    #110 <Method String String.format(String, Object[])>
	//  116  183:invokespecial   #111 <Method void zzfe$zzc(String)>
	//  117  186:athrow          
			}
		} while(true);
	}

	public final void zzf(int i, int j)
		throws IOException
	{
		((zzfe)this).zzd(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzas(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #144 <Method void zzfe.zzas(int)>
	//    7   11:return          
	}

	public final void zzf(byte abyte0[], int i, int j)
		throws IOException
	{
		((zzfe)this).zzas(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #144 <Method void zzfe.zzas(int)>
		((zzfe)this).write(abyte0, 0, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iload_3         
	//    7    9:invokevirtual   #170 <Method void zzfe.write(byte[], int, int)>
	//    8   12:return          
	}

	public final void zzg(long l)
		throws IOException
	{
		zzsw.putLong((int)(zztb - zzsx), l);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer zzsw>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field long zztb>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field long zzsx>
	//    6   12:lsub            
	//    7   13:l2i             
	//    8   14:lload_1         
	//    9   15:invokevirtual   #213 <Method ByteBuffer ByteBuffer.putLong(int, long)>
	//   10   18:pop             
		zztb = zztb + 8L;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #64  <Field long zztb>
	//   14   24:ldc2w           #214 <Long 8L>
	//   15   27:ladd            
	//   16   28:putfield        #64  <Field long zztb>
	//   17   31:return          
	}

	public final void zzh(int i, int j)
		throws IOException
	{
		((zzfe)this).zzd(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #117 <Method void zzfe.zzd(int, int)>
		((zzfe)this).zzau(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #218 <Method void zzfe.zzau(int)>
	//    7   11:return          
	}

	public final void zzm(String s)
		throws IOException
	{
		long l = zztb;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long zztb>
	//    2    4:lstore          4
		int i;
		int j;
		try
		{
			i = zzax(s.length() * 3);
	//    3    6:aload_1         
	//    4    7:invokevirtual   #227 <Method int String.length()>
	//    5   10:iconst_3        
	//    6   11:imul            
	//    7   12:invokestatic    #231 <Method int zzax(int)>
	//    8   15:istore_2        
			j = zzax(s.length());
	//    9   16:aload_1         
	//   10   17:invokevirtual   #227 <Method int String.length()>
	//   11   20:invokestatic    #231 <Method int zzax(int)>
	//   12   23:istore_3        
		}
	//*  13   24:iload_3         
	//*  14   25:iload_2         
	//*  15   26:icmpne          86
	//*  16   29:aload_0         
	//*  17   30:getfield        #64  <Field long zztb>
	//*  18   33:aload_0         
	//*  19   34:getfield        #47  <Field long zzsx>
	//*  20   37:lsub            
	//*  21   38:l2i             
	//*  22   39:iload_3         
	//*  23   40:iadd            
	//*  24   41:istore_2        
	//*  25   42:aload_0         
	//*  26   43:getfield        #39  <Field ByteBuffer zzsw>
	//*  27   46:iload_2         
	//*  28   47:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  29   50:pop             
	//*  30   51:aload_1         
	//*  31   52:aload_0         
	//*  32   53:getfield        #39  <Field ByteBuffer zzsw>
	//*  33   56:invokestatic    #236 <Method void zziw.zza(CharSequence, ByteBuffer)>
	//*  34   59:aload_0         
	//*  35   60:getfield        #39  <Field ByteBuffer zzsw>
	//*  36   63:invokevirtual   #51  <Method int ByteBuffer.position()>
	//*  37   66:iload_2         
	//*  38   67:isub            
	//*  39   68:istore_2        
	//*  40   69:aload_0         
	//*  41   70:iload_2         
	//*  42   71:invokevirtual   #144 <Method void zzfe.zzas(int)>
	//*  43   74:aload_0         
	//*  44   75:aload_0         
	//*  45   76:getfield        #64  <Field long zztb>
	//*  46   79:iload_2         
	//*  47   80:i2l             
	//*  48   81:ladd            
	//*  49   82:putfield        #64  <Field long zztb>
	//*  50   85:return          
	//*  51   86:aload_1         
	//*  52   87:invokestatic    #239 <Method int zziw.zza(CharSequence)>
	//*  53   90:istore_2        
	//*  54   91:aload_0         
	//*  55   92:iload_2         
	//*  56   93:invokevirtual   #144 <Method void zzfe.zzas(int)>
	//*  57   96:aload_0         
	//*  58   97:aload_0         
	//*  59   98:getfield        #64  <Field long zztb>
	//*  60  101:invokespecial   #241 <Method void zzn(long)>
	//*  61  104:aload_1         
	//*  62  105:aload_0         
	//*  63  106:getfield        #39  <Field ByteBuffer zzsw>
	//*  64  109:invokestatic    #236 <Method void zziw.zza(CharSequence, ByteBuffer)>
	//*  65  112:aload_0         
	//*  66  113:aload_0         
	//*  67  114:getfield        #64  <Field long zztb>
	//*  68  117:iload_2         
	//*  69  118:i2l             
	//*  70  119:ladd            
	//*  71  120:putfield        #64  <Field long zztb>
	//*  72  123:return          
	//*  73  124:astore_1        
	//*  74  125:new             #89  <Class zzfe$zzc>
	//*  75  128:dup             
	//*  76  129:aload_1         
	//*  77  130:invokespecial   #244 <Method void zzfe$zzc(Throwable)>
	//*  78  133:athrow          
	//*  79  134:astore_1        
	//*  80  135:new             #89  <Class zzfe$zzc>
	//*  81  138:dup             
	//*  82  139:aload_1         
	//*  83  140:invokespecial   #244 <Method void zzfe$zzc(Throwable)>
	//*  84  143:athrow          
		catch(zzja zzja1)
	//*  85  144:astore          6
		{
			zztb = l;
	//   86  146:aload_0         
	//   87  147:lload           4
	//   88  149:putfield        #64  <Field long zztb>
			zzn(zztb);
	//   89  152:aload_0         
	//   90  153:aload_0         
	//   91  154:getfield        #64  <Field long zztb>
	//   92  157:invokespecial   #241 <Method void zzn(long)>
			((zzfe)this).zza(s, zzja1);
	//   93  160:aload_0         
	//   94  161:aload_1         
	//   95  162:aload           6
	//   96  164:invokevirtual   #247 <Method void zzfe.zza(String, zzja)>
			return;
	//   97  167:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new zzfe$zzc(((Throwable) (s)));
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new zzfe$zzc(((Throwable) (s)));
		}
		if(j != i)
			break MISSING_BLOCK_LABEL_86;
		i = (int)(zztb - zzsx) + j;
		zzsw.position(i);
		zziw.zza(((CharSequence) (s)), zzsw);
		i = zzsw.position() - i;
		((zzfe)this).zzas(i);
		zztb = zztb + (long)i;
		return;
		i = zziw.zza(((CharSequence) (s)));
		((zzfe)this).zzas(i);
		zzn(zztb);
		zziw.zza(((CharSequence) (s)), zzsw);
		zztb = zztb + (long)i;
		return;
	}

	private final ByteBuffer zzsv;
	private final ByteBuffer zzsw;
	private final long zzsx;
	private final long zzsy;
	private final long zzsz;
	private final long zzta;
	private long zztb;

	zzfe$zze(ByteBuffer bytebuffer)
	{
		super(((zzff) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #19  <Method void zzfe(zzff)>
		zzsv = bytebuffer;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #21  <Field ByteBuffer zzsv>
		zzsw = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #27  <Method ByteBuffer ByteBuffer.duplicate()>
	//    9   15:getstatic       #33  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   10   18:invokevirtual   #37  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   21:putfield        #39  <Field ByteBuffer zzsw>
		zzsx = zziu.zzb(bytebuffer);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokestatic    #45  <Method long zziu.zzb(ByteBuffer)>
	//   15   29:putfield        #47  <Field long zzsx>
		zzsy = zzsx + (long)bytebuffer.position();
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #47  <Field long zzsx>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #51  <Method int ByteBuffer.position()>
	//   21   41:i2l             
	//   22   42:ladd            
	//   23   43:putfield        #53  <Field long zzsy>
		zzsz = zzsx + (long)bytebuffer.limit();
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #47  <Field long zzsx>
	//   27   51:aload_1         
	//   28   52:invokevirtual   #56  <Method int ByteBuffer.limit()>
	//   29   55:i2l             
	//   30   56:ladd            
	//   31   57:putfield        #58  <Field long zzsz>
		zzta = zzsz - 10L;
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:getfield        #58  <Field long zzsz>
	//   35   65:ldc2w           #59  <Long 10L>
	//   36   68:lsub            
	//   37   69:putfield        #62  <Field long zzta>
		zztb = zzsy;
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #53  <Field long zzsy>
	//   41   77:putfield        #64  <Field long zztb>
	//   42   80:return          
	}
}
