// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztv, zzxj, zzte, zzsx, 
//			zzwl, zzvv, zzxp, zzxl

static final class zztv$zze extends zztv
{

	private final void zzbc(long l)
	{
		zzbut.position((int)(l - zzbuu));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer zzbut>
	//    2    4:lload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field long zzbuu>
	//    5    9:lsub            
	//    6   10:l2i             
	//    7   11:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    8   14:pop             
	//    9   15:return          
	}

	public final void flush()
	{
		zzbus.position((int)(zzbuy - zzbuu));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ByteBuffer zzbus>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field long zzbuy>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field long zzbuu>
	//    6   12:lsub            
	//    7   13:l2i             
	//    8   14:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
	//    9   17:pop             
	//   10   18:return          
	}

	public final void write(byte abyte0[], int i, int j)
	{
		if(abyte0 != null && i >= 0 && j >= 0 && abyte0.length - j >= i)
	//*   0    0:aload_1         
	//*   1    1:ifnull          70
	//*   2    4:iload_2         
	//*   3    5:iflt            70
	//*   4    8:iload_3         
	//*   5    9:iflt            70
	//*   6   12:aload_1         
	//*   7   13:arraylength     
	//*   8   14:iload_3         
	//*   9   15:isub            
	//*  10   16:iload_2         
	//*  11   17:icmplt          70
		{
			long l = zzbuw;
	//   12   20:aload_0         
	//   13   21:getfield        #58  <Field long zzbuw>
	//   14   24:lstore          4
			long l1 = j;
	//   15   26:iload_3         
	//   16   27:i2l             
	//   17   28:lstore          6
			if(l - l1 >= zzbuy)
	//*  18   30:lload           4
	//*  19   32:lload           6
	//*  20   34:lsub            
	//*  21   35:aload_0         
	//*  22   36:getfield        #64  <Field long zzbuy>
	//*  23   39:lcmp            
	//*  24   40:ifge            46
	//*  25   43:goto            70
			{
				zzxj.zza(abyte0, i, zzbuy, l1);
	//   26   46:aload_1         
	//   27   47:iload_2         
	//   28   48:i2l             
	//   29   49:aload_0         
	//   30   50:getfield        #64  <Field long zzbuy>
	//   31   53:lload           6
	//   32   55:invokestatic    #78  <Method void zzxj.zza(byte[], long, long, long)>
				zzbuy = zzbuy + l1;
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:getfield        #64  <Field long zzbuy>
	//   36   63:lload           6
	//   37   65:ladd            
	//   38   66:putfield        #64  <Field long zzbuy>
				return;
	//   39   69:return          
			}
		}
		if(abyte0 == null)
	//*  40   70:aload_1         
	//*  41   71:ifnonnull       84
			throw new NullPointerException("value");
	//   42   74:new             #80  <Class NullPointerException>
	//   43   77:dup             
	//   44   78:ldc1            #82  <String "value">
	//   45   80:invokespecial   #85  <Method void NullPointerException(String)>
	//   46   83:athrow          
		else
			throw new zztv$zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Long.valueOf(zzbuy), Long.valueOf(zzbuw), Integer.valueOf(j)
			}));
	//   47   84:new             #87  <Class zztv$zzc>
	//   48   87:dup             
	//   49   88:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
	//   50   90:iconst_3        
	//   51   91:anewarray       Object[]
	//   52   94:dup             
	//   53   95:iconst_0        
	//   54   96:aload_0         
	//   55   97:getfield        #64  <Field long zzbuy>
	//   56  100:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   57  103:aastore         
	//   58  104:dup             
	//   59  105:iconst_1        
	//   60  106:aload_0         
	//   61  107:getfield        #58  <Field long zzbuw>
	//   62  110:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   63  113:aastore         
	//   64  114:dup             
	//   65  115:iconst_2        
	//   66  116:iload_3         
	//   67  117:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   68  120:aastore         
	//   69  121:invokestatic    #108 <Method String String.format(String, Object[])>
	//   70  124:invokespecial   #109 <Method void zztv$zzc(String)>
	//   71  127:athrow          
	}

	public final void zza(int i, long l)
	{
		((zztv)this).zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zzat(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #117 <Method void zztv.zzat(long)>
	//    7   11:return          
	}

	public final void zza(int i, zzte zzte1)
	{
		((zztv)this).zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zza(zzte1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #121 <Method void zztv.zza(zzte)>
	//    7   11:return          
	}

	public final void zza(int i, zzvv zzvv1)
	{
		((zztv)this).zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zzb(zzvv1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #125 <Method void zztv.zzb(zzvv)>
	//    7   11:return          
	}

	final void zza(int i, zzvv zzvv1, zzwl zzwl1)
	{
		((zztv)this).zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zza(zzvv1, zzwl1);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokevirtual   #129 <Method void zztv.zza(zzvv, zzwl)>
	//    8   12:return          
	}

	public final void zza(zzte zzte1)
	{
		((zztv)this).zzba(zzte1.size());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #134 <Method int zzte.size()>
	//    3    5:invokevirtual   #138 <Method void zztv.zzba(int)>
		zzte1.zza(((zztd) (this)));
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #141 <Method void zzte.zza(zztd)>
	//    7   13:return          
	}

	final void zza(zzvv zzvv1, zzwl zzwl1)
	{
		zzsx zzsx1 = (zzsx)zzvv1;
	//    0    0:aload_1         
	//    1    1:checkcast       #143 <Class zzsx>
	//    2    4:astore          5
		int j = zzsx1.zztx();
	//    3    6:aload           5
	//    4    8:invokevirtual   #146 <Method int zzsx.zztx()>
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
	//   13   25:invokeinterface #152 <Method int zzwl.zzai(Object)>
	//   14   30:istore_3        
			zzsx1.zzai(i);
	//   15   31:aload           5
	//   16   33:iload_3         
	//   17   34:invokevirtual   #154 <Method void zzsx.zzai(int)>
		}
		((zztv)this).zzba(i);
	//   18   37:aload_0         
	//   19   38:iload_3         
	//   20   39:invokevirtual   #138 <Method void zztv.zzba(int)>
		zzwl1.zza(((Object) (zzvv1)), ((zzxy) (zzbup)));
	//   21   42:aload_2         
	//   22   43:aload_1         
	//   23   44:aload_0         
	//   24   45:getfield        #158 <Field zztx zzbup>
	//   25   48:invokeinterface #161 <Method void zzwl.zza(Object, zzxy)>
	//   26   53:return          
	}

	public final void zza(byte abyte0[], int i, int j)
	{
		((zztv)this).write(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #163 <Method void zztv.write(byte[], int, int)>
	//    5    7:return          
	}

	public final void zzat(long l)
	{
		long l1 = l;
	//    0    0:lload_1         
	//    1    1:lstore_3        
		if(zzbuy > zzbux) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #64  <Field long zzbuy>
	//    4    6:aload_0         
	//    5    7:getfield        #62  <Field long zzbux>
	//    6   10:lcmp            
	//    7   11:ifgt            78
_L1:
		if((l & -128L) != 0L) goto _L4; else goto _L3
	//    8   14:lload_1         
	//    9   15:ldc2w           #164 <Long -128L>
	//   10   18:land            
	//   11   19:lconst_0        
	//   12   20:lcmp            
	//   13   21:ifne            44
_L3:
		l1 = zzbuy;
	//   14   24:aload_0         
	//   15   25:getfield        #64  <Field long zzbuy>
	//   16   28:lstore_3        
		zzbuy = 1L + l1;
	//   17   29:aload_0         
	//   18   30:lconst_1        
	//   19   31:lload_3         
	//   20   32:ladd            
	//   21   33:putfield        #64  <Field long zzbuy>
		zzxj.zza(l1, (byte)(int)l);
	//   22   36:lload_3         
	//   23   37:lload_1         
	//   24   38:l2i             
	//   25   39:int2byte        
	//   26   40:invokestatic    #168 <Method void zzxj.zza(long, byte)>
		return;
	//   27   43:return          
_L4:
		l1 = zzbuy;
	//   28   44:aload_0         
	//   29   45:getfield        #64  <Field long zzbuy>
	//   30   48:lstore_3        
		zzbuy = l1 + 1L;
	//   31   49:aload_0         
	//   32   50:lload_3         
	//   33   51:lconst_1        
	//   34   52:ladd            
	//   35   53:putfield        #64  <Field long zzbuy>
		zzxj.zza(l1, (byte)((int)l & 0x7f | 0x80));
	//   36   56:lload_3         
	//   37   57:lload_1         
	//   38   58:l2i             
	//   39   59:bipush          127
	//   40   61:iand            
	//   41   62:sipush          128
	//   42   65:ior             
	//   43   66:int2byte        
	//   44   67:invokestatic    #168 <Method void zzxj.zza(long, byte)>
		l >>>= 7;
	//   45   70:lload_1         
	//   46   71:bipush          7
	//   47   73:lushr           
	//   48   74:lstore_1        
		continue; /* Loop/switch isn't completed */
	//   49   75:goto            14
_L2:
label0:
		do
		{
label1:
			{
label2:
				{
					if(zzbuy >= zzbuw)
						break label1;
	//   50   78:aload_0         
	//   51   79:getfield        #64  <Field long zzbuy>
	//   52   82:aload_0         
	//   53   83:getfield        #58  <Field long zzbuw>
	//   54   86:lcmp            
	//   55   87:ifge            139
					if((l1 & -128L) != 0L)
						break label2;
	//   56   90:lload_3         
	//   57   91:ldc2w           #164 <Long -128L>
	//   58   94:land            
	//   59   95:lconst_0        
	//   60   96:lcmp            
	//   61   97:ifne            105
					l = l1;
	//   62  100:lload_3         
	//   63  101:lstore_1        
				}
				if(true)
					break label0;
	//   64  102:goto            24
				l = zzbuy;
	//   65  105:aload_0         
	//   66  106:getfield        #64  <Field long zzbuy>
	//   67  109:lstore_1        
				zzbuy = l + 1L;
	//   68  110:aload_0         
	//   69  111:lload_1         
	//   70  112:lconst_1        
	//   71  113:ladd            
	//   72  114:putfield        #64  <Field long zzbuy>
				zzxj.zza(l, (byte)((int)l1 & 0x7f | 0x80));
	//   73  117:lload_1         
	//   74  118:lload_3         
	//   75  119:l2i             
	//   76  120:bipush          127
	//   77  122:iand            
	//   78  123:sipush          128
	//   79  126:ior             
	//   80  127:int2byte        
	//   81  128:invokestatic    #168 <Method void zzxj.zza(long, byte)>
				l1 >>>= 7;
	//   82  131:lload_3         
	//   83  132:bipush          7
	//   84  134:lushr           
	//   85  135:lstore_3        
			}
		} while(true);
	//   86  136:goto            78
		if(true) goto _L3; else goto _L5
_L5:
		throw new zztv$zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
			Long.valueOf(zzbuy), Long.valueOf(zzbuw), Integer.valueOf(1)
		}));
	//   87  139:new             #87  <Class zztv$zzc>
	//   88  142:dup             
	//   89  143:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
	//   90  145:iconst_3        
	//   91  146:anewarray       Object[]
	//   92  149:dup             
	//   93  150:iconst_0        
	//   94  151:aload_0         
	//   95  152:getfield        #64  <Field long zzbuy>
	//   96  155:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   97  158:aastore         
	//   98  159:dup             
	//   99  160:iconst_1        
	//  100  161:aload_0         
	//  101  162:getfield        #58  <Field long zzbuw>
	//  102  165:invokestatic    #97  <Method Long Long.valueOf(long)>
	//  103  168:aastore         
	//  104  169:dup             
	//  105  170:iconst_2        
	//  106  171:iconst_1        
	//  107  172:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//  108  175:aastore         
	//  109  176:invokestatic    #108 <Method String String.format(String, Object[])>
	//  110  179:invokespecial   #109 <Method void zztv$zzc(String)>
	//  111  182:athrow          
		if(true) goto _L1; else goto _L6
_L6:
	}

	public final void zzav(long l)
	{
		zzbut.putLong((int)(zzbuy - zzbuu), l);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer zzbut>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field long zzbuy>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field long zzbuu>
	//    6   12:lsub            
	//    7   13:l2i             
	//    8   14:lload_1         
	//    9   15:invokevirtual   #173 <Method ByteBuffer ByteBuffer.putLong(int, long)>
	//   10   18:pop             
		zzbuy = zzbuy + 8L;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #64  <Field long zzbuy>
	//   14   24:ldc2w           #174 <Long 8L>
	//   15   27:ladd            
	//   16   28:putfield        #64  <Field long zzbuy>
	//   17   31:return          
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
	//    4    6:invokevirtual   #138 <Method void zztv.zzba(int)>
			return;
	//    5    9:return          
		} else
		{
			((zztv)this).zzat(i);
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:i2l             
	//    9   13:invokevirtual   #117 <Method void zztv.zzat(long)>
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
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zze(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #178 <Method void zztv.zze(int, int)>
		((zztv)this).zza(3, zzte1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #180 <Method void zztv.zza(int, zzte)>
		((zztv)this).zzc(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #114 <Method void zztv.zzc(int, int)>
	//   16   24:return          
	}

	public final void zzb(int i, zzvv zzvv1)
	{
		((zztv)this).zzc(1, 3);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:iconst_3        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zze(2, i);
	//    4    6:aload_0         
	//    5    7:iconst_2        
	//    6    8:iload_1         
	//    7    9:invokevirtual   #178 <Method void zztv.zze(int, int)>
		((zztv)this).zza(3, zzvv1);
	//    8   12:aload_0         
	//    9   13:iconst_3        
	//   10   14:aload_2         
	//   11   15:invokevirtual   #182 <Method void zztv.zza(int, zzvv)>
		((zztv)this).zzc(1, 4);
	//   12   18:aload_0         
	//   13   19:iconst_1        
	//   14   20:iconst_4        
	//   15   21:invokevirtual   #114 <Method void zztv.zzc(int, int)>
	//   16   24:return          
	}

	public final void zzb(int i, String s)
	{
		((zztv)this).zzc(i, 2);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_2        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zzgb(s);
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #186 <Method void zztv.zzgb(String)>
	//    7   11:return          
	}

	public final void zzb(int i, boolean flag)
	{
		((zztv)this).zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zzc((byte)flag);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:int2byte        
	//    7    9:invokevirtual   #190 <Method void zztv.zzc(byte)>
	//    8   12:return          
	}

	public final void zzb(zzvv zzvv1)
	{
		((zztv)this).zzba(zzvv1.zzvx());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #195 <Method int zzvv.zzvx()>
	//    3    7:invokevirtual   #138 <Method void zztv.zzba(int)>
		zzvv1.zzb(((zztv) (this)));
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:invokeinterface #198 <Method void zzvv.zzb(zztv)>
	//    7   17:return          
	}

	public final void zzba(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(zzbuy > zzbux) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #64  <Field long zzbuy>
	//    4    6:aload_0         
	//    5    7:getfield        #62  <Field long zzbux>
	//    6   10:lcmp            
	//    7   11:ifgt            73
_L1:
		if((i & 0xffffff80) != 0) goto _L4; else goto _L3
	//    8   14:iload_1         
	//    9   15:bipush          -128
	//   10   17:iand            
	//   11   18:ifne            40
_L3:
		long l = zzbuy;
	//   12   21:aload_0         
	//   13   22:getfield        #64  <Field long zzbuy>
	//   14   25:lstore_3        
		zzbuy = 1L + l;
	//   15   26:aload_0         
	//   16   27:lconst_1        
	//   17   28:lload_3         
	//   18   29:ladd            
	//   19   30:putfield        #64  <Field long zzbuy>
		zzxj.zza(l, (byte)i);
	//   20   33:lload_3         
	//   21   34:iload_1         
	//   22   35:int2byte        
	//   23   36:invokestatic    #168 <Method void zzxj.zza(long, byte)>
		return;
	//   24   39:return          
_L4:
		long l1 = zzbuy;
	//   25   40:aload_0         
	//   26   41:getfield        #64  <Field long zzbuy>
	//   27   44:lstore_3        
		zzbuy = l1 + 1L;
	//   28   45:aload_0         
	//   29   46:lload_3         
	//   30   47:lconst_1        
	//   31   48:ladd            
	//   32   49:putfield        #64  <Field long zzbuy>
		zzxj.zza(l1, (byte)(i & 0x7f | 0x80));
	//   33   52:lload_3         
	//   34   53:iload_1         
	//   35   54:bipush          127
	//   36   56:iand            
	//   37   57:sipush          128
	//   38   60:ior             
	//   39   61:int2byte        
	//   40   62:invokestatic    #168 <Method void zzxj.zza(long, byte)>
		i >>>= 7;
	//   41   65:iload_1         
	//   42   66:bipush          7
	//   43   68:iushr           
	//   44   69:istore_1        
		continue; /* Loop/switch isn't completed */
	//   45   70:goto            14
_L2:
label0:
		do
		{
label1:
			{
label2:
				{
					if(zzbuy >= zzbuw)
						break label1;
	//   46   73:aload_0         
	//   47   74:getfield        #64  <Field long zzbuy>
	//   48   77:aload_0         
	//   49   78:getfield        #58  <Field long zzbuw>
	//   50   81:lcmp            
	//   51   82:ifge            130
					if((j & 0xffffff80) != 0)
						break label2;
	//   52   85:iload_2         
	//   53   86:bipush          -128
	//   54   88:iand            
	//   55   89:ifne            97
					i = j;
	//   56   92:iload_2         
	//   57   93:istore_1        
				}
				if(true)
					break label0;
	//   58   94:goto            21
				long l2 = zzbuy;
	//   59   97:aload_0         
	//   60   98:getfield        #64  <Field long zzbuy>
	//   61  101:lstore_3        
				zzbuy = l2 + 1L;
	//   62  102:aload_0         
	//   63  103:lload_3         
	//   64  104:lconst_1        
	//   65  105:ladd            
	//   66  106:putfield        #64  <Field long zzbuy>
				zzxj.zza(l2, (byte)(j & 0x7f | 0x80));
	//   67  109:lload_3         
	//   68  110:iload_2         
	//   69  111:bipush          127
	//   70  113:iand            
	//   71  114:sipush          128
	//   72  117:ior             
	//   73  118:int2byte        
	//   74  119:invokestatic    #168 <Method void zzxj.zza(long, byte)>
				j >>>= 7;
	//   75  122:iload_2         
	//   76  123:bipush          7
	//   77  125:iushr           
	//   78  126:istore_2        
			}
		} while(true);
	//   79  127:goto            73
		if(true) goto _L3; else goto _L5
_L5:
		throw new zztv$zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
			Long.valueOf(zzbuy), Long.valueOf(zzbuw), Integer.valueOf(1)
		}));
	//   80  130:new             #87  <Class zztv$zzc>
	//   81  133:dup             
	//   82  134:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
	//   83  136:iconst_3        
	//   84  137:anewarray       Object[]
	//   85  140:dup             
	//   86  141:iconst_0        
	//   87  142:aload_0         
	//   88  143:getfield        #64  <Field long zzbuy>
	//   89  146:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   90  149:aastore         
	//   91  150:dup             
	//   92  151:iconst_1        
	//   93  152:aload_0         
	//   94  153:getfield        #58  <Field long zzbuw>
	//   95  156:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   96  159:aastore         
	//   97  160:dup             
	//   98  161:iconst_2        
	//   99  162:iconst_1        
	//  100  163:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//  101  166:aastore         
	//  102  167:invokestatic    #108 <Method String String.format(String, Object[])>
	//  103  170:invokespecial   #109 <Method void zztv$zzc(String)>
	//  104  173:athrow          
		if(true) goto _L1; else goto _L6
_L6:
	}

	public final void zzbc(int i)
	{
		zzbut.putInt((int)(zzbuy - zzbuu), i);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ByteBuffer zzbut>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field long zzbuy>
	//    4    8:aload_0         
	//    5    9:getfield        #47  <Field long zzbuu>
	//    6   12:lsub            
	//    7   13:l2i             
	//    8   14:iload_1         
	//    9   15:invokevirtual   #202 <Method ByteBuffer ByteBuffer.putInt(int, int)>
	//   10   18:pop             
		zzbuy = zzbuy + 4L;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #64  <Field long zzbuy>
	//   14   24:ldc2w           #203 <Long 4L>
	//   15   27:ladd            
	//   16   28:putfield        #64  <Field long zzbuy>
	//   17   31:return          
	}

	public final void zzc(byte byte0)
	{
		if(zzbuy >= zzbuw)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field long zzbuy>
	//*   2    4:aload_0         
	//*   3    5:getfield        #58  <Field long zzbuw>
	//*   4    8:lcmp            
	//*   5    9:iflt            56
		{
			throw new zztv$zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
				Long.valueOf(zzbuy), Long.valueOf(zzbuw), Integer.valueOf(1)
			}));
	//    6   12:new             #87  <Class zztv$zzc>
	//    7   15:dup             
	//    8   16:ldc1            #89  <String "Pos: %d, limit: %d, len: %d">
	//    9   18:iconst_3        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_0         
	//   14   25:getfield        #64  <Field long zzbuy>
	//   15   28:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   16   31:aastore         
	//   17   32:dup             
	//   18   33:iconst_1        
	//   19   34:aload_0         
	//   20   35:getfield        #58  <Field long zzbuw>
	//   21   38:invokestatic    #97  <Method Long Long.valueOf(long)>
	//   22   41:aastore         
	//   23   42:dup             
	//   24   43:iconst_2        
	//   25   44:iconst_1        
	//   26   45:invokestatic    #102 <Method Integer Integer.valueOf(int)>
	//   27   48:aastore         
	//   28   49:invokestatic    #108 <Method String String.format(String, Object[])>
	//   29   52:invokespecial   #109 <Method void zztv$zzc(String)>
	//   30   55:athrow          
		} else
		{
			long l = zzbuy;
	//   31   56:aload_0         
	//   32   57:getfield        #64  <Field long zzbuy>
	//   33   60:lstore_2        
			zzbuy = 1L + l;
	//   34   61:aload_0         
	//   35   62:lconst_1        
	//   36   63:lload_2         
	//   37   64:ladd            
	//   38   65:putfield        #64  <Field long zzbuy>
			zzxj.zza(l, byte0);
	//   39   68:lload_2         
	//   40   69:iload_1         
	//   41   70:invokestatic    #168 <Method void zzxj.zza(long, byte)>
			return;
	//   42   73:return          
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
	//    6    6:invokevirtual   #138 <Method void zztv.zzba(int)>
	//    7    9:return          
	}

	public final void zzc(int i, long l)
	{
		((zztv)this).zzc(i, 1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zzav(l);
	//    4    6:aload_0         
	//    5    7:lload_2         
	//    6    8:invokevirtual   #206 <Method void zztv.zzav(long)>
	//    7   11:return          
	}

	public final void zzd(int i, int j)
	{
		((zztv)this).zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zzaz(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #209 <Method void zztv.zzaz(int)>
	//    7   11:return          
	}

	public final void zze(int i, int j)
	{
		((zztv)this).zzc(i, 0);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zzba(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #138 <Method void zztv.zzba(int)>
	//    7   11:return          
	}

	public final void zze(byte abyte0[], int i, int j)
	{
		((zztv)this).zzba(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #138 <Method void zztv.zzba(int)>
		((zztv)this).write(abyte0, 0, j);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:iconst_0        
	//    6    8:iload_3         
	//    7    9:invokevirtual   #163 <Method void zztv.write(byte[], int, int)>
	//    8   12:return          
	}

	public final void zzg(int i, int j)
	{
		((zztv)this).zzc(i, 5);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iconst_5        
	//    3    3:invokevirtual   #114 <Method void zztv.zzc(int, int)>
		((zztv)this).zzbc(j);
	//    4    6:aload_0         
	//    5    7:iload_2         
	//    6    8:invokevirtual   #212 <Method void zztv.zzbc(int)>
	//    7   11:return          
	}

	public final void zzgb(String s)
	{
		long l = zzbuy;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field long zzbuy>
	//    2    4:lstore          4
		int i;
		int j;
		try
		{
			i = zzbf(s.length() * 3);
	//    3    6:aload_1         
	//    4    7:invokevirtual   #221 <Method int String.length()>
	//    5   10:iconst_3        
	//    6   11:imul            
	//    7   12:invokestatic    #225 <Method int zzbf(int)>
	//    8   15:istore_2        
			j = zzbf(s.length());
	//    9   16:aload_1         
	//   10   17:invokevirtual   #221 <Method int String.length()>
	//   11   20:invokestatic    #225 <Method int zzbf(int)>
	//   12   23:istore_3        
		}
	//*  13   24:iload_3         
	//*  14   25:iload_2         
	//*  15   26:icmpne          86
	//*  16   29:aload_0         
	//*  17   30:getfield        #64  <Field long zzbuy>
	//*  18   33:aload_0         
	//*  19   34:getfield        #47  <Field long zzbuu>
	//*  20   37:lsub            
	//*  21   38:l2i             
	//*  22   39:iload_3         
	//*  23   40:iadd            
	//*  24   41:istore_2        
	//*  25   42:aload_0         
	//*  26   43:getfield        #39  <Field ByteBuffer zzbut>
	//*  27   46:iload_2         
	//*  28   47:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
	//*  29   50:pop             
	//*  30   51:aload_1         
	//*  31   52:aload_0         
	//*  32   53:getfield        #39  <Field ByteBuffer zzbut>
	//*  33   56:invokestatic    #230 <Method void zzxl.zza(CharSequence, ByteBuffer)>
	//*  34   59:aload_0         
	//*  35   60:getfield        #39  <Field ByteBuffer zzbut>
	//*  36   63:invokevirtual   #51  <Method int ByteBuffer.position()>
	//*  37   66:iload_2         
	//*  38   67:isub            
	//*  39   68:istore_2        
	//*  40   69:aload_0         
	//*  41   70:iload_2         
	//*  42   71:invokevirtual   #138 <Method void zztv.zzba(int)>
	//*  43   74:aload_0         
	//*  44   75:aload_0         
	//*  45   76:getfield        #64  <Field long zzbuy>
	//*  46   79:iload_2         
	//*  47   80:i2l             
	//*  48   81:ladd            
	//*  49   82:putfield        #64  <Field long zzbuy>
	//*  50   85:return          
	//*  51   86:aload_1         
	//*  52   87:invokestatic    #233 <Method int zzxl.zza(CharSequence)>
	//*  53   90:istore_2        
	//*  54   91:aload_0         
	//*  55   92:iload_2         
	//*  56   93:invokevirtual   #138 <Method void zztv.zzba(int)>
	//*  57   96:aload_0         
	//*  58   97:aload_0         
	//*  59   98:getfield        #64  <Field long zzbuy>
	//*  60  101:invokespecial   #235 <Method void zzbc(long)>
	//*  61  104:aload_1         
	//*  62  105:aload_0         
	//*  63  106:getfield        #39  <Field ByteBuffer zzbut>
	//*  64  109:invokestatic    #230 <Method void zzxl.zza(CharSequence, ByteBuffer)>
	//*  65  112:aload_0         
	//*  66  113:aload_0         
	//*  67  114:getfield        #64  <Field long zzbuy>
	//*  68  117:iload_2         
	//*  69  118:i2l             
	//*  70  119:ladd            
	//*  71  120:putfield        #64  <Field long zzbuy>
	//*  72  123:return          
	//*  73  124:astore_1        
	//*  74  125:new             #87  <Class zztv$zzc>
	//*  75  128:dup             
	//*  76  129:aload_1         
	//*  77  130:invokespecial   #238 <Method void zztv$zzc(Throwable)>
	//*  78  133:athrow          
	//*  79  134:astore_1        
	//*  80  135:new             #87  <Class zztv$zzc>
	//*  81  138:dup             
	//*  82  139:aload_1         
	//*  83  140:invokespecial   #238 <Method void zztv$zzc(Throwable)>
	//*  84  143:athrow          
		catch(zzxp zzxp1)
	//*  85  144:astore          6
		{
			zzbuy = l;
	//   86  146:aload_0         
	//   87  147:lload           4
	//   88  149:putfield        #64  <Field long zzbuy>
			zzbc(zzbuy);
	//   89  152:aload_0         
	//   90  153:aload_0         
	//   91  154:getfield        #64  <Field long zzbuy>
	//   92  157:invokespecial   #235 <Method void zzbc(long)>
			((zztv)this).zza(s, zzxp1);
	//   93  160:aload_0         
	//   94  161:aload_1         
	//   95  162:aload           6
	//   96  164:invokevirtual   #241 <Method void zztv.zza(String, zzxp)>
			return;
	//   97  167:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new zztv$zzc(((Throwable) (s)));
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new zztv$zzc(((Throwable) (s)));
		}
		if(j != i)
			break MISSING_BLOCK_LABEL_86;
		i = (int)(zzbuy - zzbuu) + j;
		zzbut.position(i);
		zzxl.zza(((CharSequence) (s)), zzbut);
		i = zzbut.position() - i;
		((zztv)this).zzba(i);
		zzbuy = zzbuy + (long)i;
		return;
		i = zzxl.zza(((CharSequence) (s)));
		((zztv)this).zzba(i);
		zzbc(zzbuy);
		zzxl.zza(((CharSequence) (s)), zzbut);
		zzbuy = zzbuy + (long)i;
		return;
	}

	public final int zzvj()
	{
		return (int)(zzbuw - zzbuy);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field long zzbuw>
	//    2    4:aload_0         
	//    3    5:getfield        #64  <Field long zzbuy>
	//    4    8:lsub            
	//    5    9:l2i             
	//    6   10:ireturn         
	}

	private final ByteBuffer zzbus;
	private final ByteBuffer zzbut;
	private final long zzbuu;
	private final long zzbuv;
	private final long zzbuw;
	private final long zzbux;
	private long zzbuy;

	zztv$zze(ByteBuffer bytebuffer)
	{
		super(((zztw) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #19  <Method void zztv(zztw)>
		zzbus = bytebuffer;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #21  <Field ByteBuffer zzbus>
		zzbut = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #27  <Method ByteBuffer ByteBuffer.duplicate()>
	//    9   15:getstatic       #33  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
	//   10   18:invokevirtual   #37  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
	//   11   21:putfield        #39  <Field ByteBuffer zzbut>
		zzbuu = zzxj.zzb(bytebuffer);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokestatic    #45  <Method long zzxj.zzb(ByteBuffer)>
	//   15   29:putfield        #47  <Field long zzbuu>
		zzbuv = zzbuu + (long)bytebuffer.position();
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #47  <Field long zzbuu>
	//   19   37:aload_1         
	//   20   38:invokevirtual   #51  <Method int ByteBuffer.position()>
	//   21   41:i2l             
	//   22   42:ladd            
	//   23   43:putfield        #53  <Field long zzbuv>
		zzbuw = zzbuu + (long)bytebuffer.limit();
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #47  <Field long zzbuu>
	//   27   51:aload_1         
	//   28   52:invokevirtual   #56  <Method int ByteBuffer.limit()>
	//   29   55:i2l             
	//   30   56:ladd            
	//   31   57:putfield        #58  <Field long zzbuw>
		zzbux = zzbuw - 10L;
	//   32   60:aload_0         
	//   33   61:aload_0         
	//   34   62:getfield        #58  <Field long zzbuw>
	//   35   65:ldc2w           #59  <Long 10L>
	//   36   68:lsub            
	//   37   69:putfield        #62  <Field long zzbux>
		zzbuy = zzbuv;
	//   38   72:aload_0         
	//   39   73:aload_0         
	//   40   74:getfield        #53  <Field long zzbuv>
	//   41   77:putfield        #64  <Field long zzbuy>
	//   42   80:return          
	}
}
