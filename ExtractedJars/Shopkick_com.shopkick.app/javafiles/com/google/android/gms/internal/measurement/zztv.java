// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.*;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zztd, zzxj, zzvc, zzte, 
//			zzsx, zzwl, zzvv, zzxp, 
//			zzxl, zzuq, zztx, zztw

public abstract class zztv extends zztd
{
	static class zza extends zztv
	{

		public void flush()
		{
		//    0    0:return          
		}

		public final void write(byte abyte0[], int i, int j)
			throws IOException
		{
			try
			{
				System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, j);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:aload_0         
		//    3    3:getfield        #18  <Field byte[] buffer>
		//    4    6:aload_0         
		//    5    7:getfield        #22  <Field int position>
		//    6   10:iload_3         
		//    7   11:invokestatic    #63  <Method void System.arraycopy(Object, int, Object, int, int)>
				position = position + j;
		//    8   14:aload_0         
		//    9   15:aload_0         
		//   10   16:getfield        #22  <Field int position>
		//   11   19:iload_3         
		//   12   20:iadd            
		//   13   21:putfield        #22  <Field int position>
				return;
		//   14   24:return          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  15   25:astore_1        
			{
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(j)
				}), ((Throwable) (abyte0)));
		//   16   26:new             #65  <Class zztv$zzc>
		//   17   29:dup             
		//   18   30:ldc1            #67  <String "Pos: %d, limit: %d, len: %d">
		//   19   32:iconst_3        
		//   20   33:anewarray       Object[]
		//   21   36:dup             
		//   22   37:iconst_0        
		//   23   38:aload_0         
		//   24   39:getfield        #22  <Field int position>
		//   25   42:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   26   45:aastore         
		//   27   46:dup             
		//   28   47:iconst_1        
		//   29   48:aload_0         
		//   30   49:getfield        #24  <Field int limit>
		//   31   52:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   32   55:aastore         
		//   33   56:dup             
		//   34   57:iconst_2        
		//   35   58:iload_3         
		//   36   59:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   37   62:aastore         
		//   38   63:invokestatic    #42  <Method String String.format(String, Object[])>
		//   39   66:aload_1         
		//   40   67:invokespecial   #70  <Method void zztv$zzc(String, Throwable)>
		//   41   70:athrow          
			}
		}

		public final void zza(int i, long l)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zzat(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #80  <Method void zztv.zzat(long)>
		//    7   11:return          
		}

		public final void zza(int i, zzte zzte1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zza(zzte1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #84  <Method void zztv.zza(zzte)>
		//    7   11:return          
		}

		public final void zza(int i, zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zzb(zzvv1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #89  <Method void zztv.zzb(zzvv)>
		//    7   11:return          
		}

		final void zza(int i, zzvv zzvv1, zzwl zzwl1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			zzsx zzsx1 = (zzsx)zzvv1;
		//    4    6:aload_2         
		//    5    7:checkcast       #92  <Class zzsx>
		//    6   10:astore          5
			int j = zzsx1.zztx();
		//    7   12:aload           5
		//    8   14:invokevirtual   #96  <Method int zzsx.zztx()>
		//    9   17:istore          4
			i = j;
		//   10   19:iload           4
		//   11   21:istore_1        
			if(j == -1)
		//*  12   22:iload           4
		//*  13   24:iconst_m1       
		//*  14   25:icmpne          43
			{
				i = zzwl1.zzai(((Object) (zzsx1)));
		//   15   28:aload_3         
		//   16   29:aload           5
		//   17   31:invokeinterface #102 <Method int zzwl.zzai(Object)>
		//   18   36:istore_1        
				zzsx1.zzai(i);
		//   19   37:aload           5
		//   20   39:iload_1         
		//   21   40:invokevirtual   #105 <Method void zzsx.zzai(int)>
			}
			((zztv)this).zzba(i);
		//   22   43:aload_0         
		//   23   44:iload_1         
		//   24   45:invokevirtual   #108 <Method void zztv.zzba(int)>
			zzwl1.zza(((Object) (zzvv1)), ((zzxy) (zzbun)));
		//   25   48:aload_3         
		//   26   49:aload_2         
		//   27   50:aload_0         
		//   28   51:getfield        #112 <Field zztx zzbun>
		//   29   54:invokeinterface #115 <Method void zzwl.zza(Object, zzxy)>
		//   30   59:return          
		}

		public final void zza(zzte zzte1)
			throws IOException
		{
			((zztv)this).zzba(zzte1.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #120 <Method int zzte.size()>
		//    3    5:invokevirtual   #108 <Method void zztv.zzba(int)>
			zzte1.zza(((zztd) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #123 <Method void zzte.zza(zztd)>
		//    7   13:return          
		}

		final void zza(zzvv zzvv1, zzwl zzwl1)
			throws IOException
		{
			zzsx zzsx1 = (zzsx)zzvv1;
		//    0    0:aload_1         
		//    1    1:checkcast       #92  <Class zzsx>
		//    2    4:astore          5
			int j = zzsx1.zztx();
		//    3    6:aload           5
		//    4    8:invokevirtual   #96  <Method int zzsx.zztx()>
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
		//   13   25:invokeinterface #102 <Method int zzwl.zzai(Object)>
		//   14   30:istore_3        
				zzsx1.zzai(i);
		//   15   31:aload           5
		//   16   33:iload_3         
		//   17   34:invokevirtual   #105 <Method void zzsx.zzai(int)>
			}
			((zztv)this).zzba(i);
		//   18   37:aload_0         
		//   19   38:iload_3         
		//   20   39:invokevirtual   #108 <Method void zztv.zzba(int)>
			zzwl1.zza(((Object) (zzvv1)), ((zzxy) (zzbun)));
		//   21   42:aload_2         
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #112 <Field zztx zzbun>
		//   25   48:invokeinterface #115 <Method void zzwl.zza(Object, zzxy)>
		//   26   53:return          
		}

		public final void zza(byte abyte0[], int i, int j)
			throws IOException
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
			throws IOException
		{
			long l1;
			l1 = l;
		//    0    0:lload_1         
		//    1    1:lstore          4
			if(zztv.zzvk())
		//*   2    3:invokestatic    #130 <Method boolean zztv.zzvk()>
		//*   3    6:ifeq            103
			{
				l1 = l;
		//    4    9:lload_1         
		//    5   10:lstore          4
				if(((zztv)this).zzvj() >= 10)
		//*   6   12:aload_0         
		//*   7   13:invokevirtual   #133 <Method int zztv.zzvj()>
		//*   8   16:bipush          10
		//*   9   18:icmplt          103
					do
					{
						if((l & -128L) == 0L)
		//*  10   21:lload_1         
		//*  11   22:ldc2w           #134 <Long -128L>
		//*  12   25:land            
		//*  13   26:lconst_0        
		//*  14   27:lcmp            
		//*  15   28:ifne            60
						{
							byte abyte0[] = buffer;
		//   16   31:aload_0         
		//   17   32:getfield        #18  <Field byte[] buffer>
		//   18   35:astore          6
							int i = position;
		//   19   37:aload_0         
		//   20   38:getfield        #22  <Field int position>
		//   21   41:istore_3        
							position = i + 1;
		//   22   42:aload_0         
		//   23   43:iload_3         
		//   24   44:iconst_1        
		//   25   45:iadd            
		//   26   46:putfield        #22  <Field int position>
							zzxj.zza(abyte0, i, (byte)(int)l);
		//   27   49:aload           6
		//   28   51:iload_3         
		//   29   52:i2l             
		//   30   53:lload_1         
		//   31   54:l2i             
		//   32   55:int2byte        
		//   33   56:invokestatic    #140 <Method void zzxj.zza(byte[], long, byte)>
							return;
		//   34   59:return          
						}
						byte abyte1[] = buffer;
		//   35   60:aload_0         
		//   36   61:getfield        #18  <Field byte[] buffer>
		//   37   64:astore          6
						int j = position;
		//   38   66:aload_0         
		//   39   67:getfield        #22  <Field int position>
		//   40   70:istore_3        
						position = j + 1;
		//   41   71:aload_0         
		//   42   72:iload_3         
		//   43   73:iconst_1        
		//   44   74:iadd            
		//   45   75:putfield        #22  <Field int position>
						zzxj.zza(abyte1, j, (byte)((int)l & 0x7f | 0x80));
		//   46   78:aload           6
		//   47   80:iload_3         
		//   48   81:i2l             
		//   49   82:lload_1         
		//   50   83:l2i             
		//   51   84:bipush          127
		//   52   86:iand            
		//   53   87:sipush          128
		//   54   90:ior             
		//   55   91:int2byte        
		//   56   92:invokestatic    #140 <Method void zzxj.zza(byte[], long, byte)>
						l >>>= 7;
		//   57   95:lload_1         
		//   58   96:bipush          7
		//   59   98:lushr           
		//   60   99:lstore_1        
					} while(true);
		//   61  100:goto            21
			}
_L1:
			if((l1 & -128L) == 0L)
		//*  62  103:lload           4
		//*  63  105:ldc2w           #134 <Long -128L>
		//*  64  108:land            
		//*  65  109:lconst_0        
		//*  66  110:lcmp            
		//*  67  111:ifne            141
			{
				int k;
				byte abyte2[];
				try
				{
					abyte2 = buffer;
		//   68  114:aload_0         
		//   69  115:getfield        #18  <Field byte[] buffer>
		//   70  118:astore          6
					k = position;
		//   71  120:aload_0         
		//   72  121:getfield        #22  <Field int position>
		//   73  124:istore_3        
					position = k + 1;
		//   74  125:aload_0         
		//   75  126:iload_3         
		//   76  127:iconst_1        
		//   77  128:iadd            
		//   78  129:putfield        #22  <Field int position>
				}
		//*  79  132:aload           6
		//*  80  134:iload_3         
		//*  81  135:lload           4
		//*  82  137:l2i             
		//*  83  138:int2byte        
		//*  84  139:bastore         
		//*  85  140:return          
		//*  86  141:aload_0         
		//*  87  142:getfield        #18  <Field byte[] buffer>
		//*  88  145:astore          6
		//*  89  147:aload_0         
		//*  90  148:getfield        #22  <Field int position>
		//*  91  151:istore_3        
		//*  92  152:aload_0         
		//*  93  153:iload_3         
		//*  94  154:iconst_1        
		//*  95  155:iadd            
		//*  96  156:putfield        #22  <Field int position>
		//*  97  159:aload           6
		//*  98  161:iload_3         
		//*  99  162:lload           4
		//* 100  164:l2i             
		//* 101  165:bipush          127
		//* 102  167:iand            
		//* 103  168:sipush          128
		//* 104  171:ior             
		//* 105  172:int2byte        
		//* 106  173:bastore         
		//* 107  174:lload           4
		//* 108  176:bipush          7
		//* 109  178:lushr           
		//* 110  179:lstore          4
		//* 111  181:goto            103
				catch(IndexOutOfBoundsException indexoutofboundsexception)
		//* 112  184:astore          6
				{
					throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
					}), ((Throwable) (indexoutofboundsexception)));
		//  113  186:new             #65  <Class zztv$zzc>
		//  114  189:dup             
		//  115  190:ldc1            #67  <String "Pos: %d, limit: %d, len: %d">
		//  116  192:iconst_3        
		//  117  193:anewarray       Object[]
		//  118  196:dup             
		//  119  197:iconst_0        
		//  120  198:aload_0         
		//  121  199:getfield        #22  <Field int position>
		//  122  202:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  123  205:aastore         
		//  124  206:dup             
		//  125  207:iconst_1        
		//  126  208:aload_0         
		//  127  209:getfield        #24  <Field int limit>
		//  128  212:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  129  215:aastore         
		//  130  216:dup             
		//  131  217:iconst_2        
		//  132  218:iconst_1        
		//  133  219:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  134  222:aastore         
		//  135  223:invokestatic    #42  <Method String String.format(String, Object[])>
		//  136  226:aload           6
		//  137  228:invokespecial   #70  <Method void zztv$zzc(String, Throwable)>
		//  138  231:athrow          
				}
				abyte2[k] = (byte)(int)l1;
				return;
			}
			abyte2 = buffer;
			k = position;
			position = k + 1;
			abyte2[k] = (byte)((int)l1 & 0x7f | 0x80);
			l1 >>>= 7;
			  goto _L1
		}

		public final void zzav(long l)
			throws IOException
		{
			int i;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field byte[] buffer>
		//    2    4:astore          4
				i = position;
		//    3    6:aload_0         
		//    4    7:getfield        #22  <Field int position>
		//    5   10:istore_3        
				position = i + 1;
		//    6   11:aload_0         
		//    7   12:iload_3         
		//    8   13:iconst_1        
		//    9   14:iadd            
		//   10   15:putfield        #22  <Field int position>
			}
		//*  11   18:aload           4
		//*  12   20:iload_3         
		//*  13   21:lload_1         
		//*  14   22:l2i             
		//*  15   23:int2byte        
		//*  16   24:bastore         
		//*  17   25:aload_0         
		//*  18   26:getfield        #18  <Field byte[] buffer>
		//*  19   29:astore          4
		//*  20   31:aload_0         
		//*  21   32:getfield        #22  <Field int position>
		//*  22   35:istore_3        
		//*  23   36:aload_0         
		//*  24   37:iload_3         
		//*  25   38:iconst_1        
		//*  26   39:iadd            
		//*  27   40:putfield        #22  <Field int position>
		//*  28   43:aload           4
		//*  29   45:iload_3         
		//*  30   46:lload_1         
		//*  31   47:bipush          8
		//*  32   49:lshr            
		//*  33   50:l2i             
		//*  34   51:int2byte        
		//*  35   52:bastore         
		//*  36   53:aload_0         
		//*  37   54:getfield        #18  <Field byte[] buffer>
		//*  38   57:astore          4
		//*  39   59:aload_0         
		//*  40   60:getfield        #22  <Field int position>
		//*  41   63:istore_3        
		//*  42   64:aload_0         
		//*  43   65:iload_3         
		//*  44   66:iconst_1        
		//*  45   67:iadd            
		//*  46   68:putfield        #22  <Field int position>
		//*  47   71:aload           4
		//*  48   73:iload_3         
		//*  49   74:lload_1         
		//*  50   75:bipush          16
		//*  51   77:lshr            
		//*  52   78:l2i             
		//*  53   79:int2byte        
		//*  54   80:bastore         
		//*  55   81:aload_0         
		//*  56   82:getfield        #18  <Field byte[] buffer>
		//*  57   85:astore          4
		//*  58   87:aload_0         
		//*  59   88:getfield        #22  <Field int position>
		//*  60   91:istore_3        
		//*  61   92:aload_0         
		//*  62   93:iload_3         
		//*  63   94:iconst_1        
		//*  64   95:iadd            
		//*  65   96:putfield        #22  <Field int position>
		//*  66   99:aload           4
		//*  67  101:iload_3         
		//*  68  102:lload_1         
		//*  69  103:bipush          24
		//*  70  105:lshr            
		//*  71  106:l2i             
		//*  72  107:int2byte        
		//*  73  108:bastore         
		//*  74  109:aload_0         
		//*  75  110:getfield        #18  <Field byte[] buffer>
		//*  76  113:astore          4
		//*  77  115:aload_0         
		//*  78  116:getfield        #22  <Field int position>
		//*  79  119:istore_3        
		//*  80  120:aload_0         
		//*  81  121:iload_3         
		//*  82  122:iconst_1        
		//*  83  123:iadd            
		//*  84  124:putfield        #22  <Field int position>
		//*  85  127:aload           4
		//*  86  129:iload_3         
		//*  87  130:lload_1         
		//*  88  131:bipush          32
		//*  89  133:lshr            
		//*  90  134:l2i             
		//*  91  135:int2byte        
		//*  92  136:bastore         
		//*  93  137:aload_0         
		//*  94  138:getfield        #18  <Field byte[] buffer>
		//*  95  141:astore          4
		//*  96  143:aload_0         
		//*  97  144:getfield        #22  <Field int position>
		//*  98  147:istore_3        
		//*  99  148:aload_0         
		//* 100  149:iload_3         
		//* 101  150:iconst_1        
		//* 102  151:iadd            
		//* 103  152:putfield        #22  <Field int position>
		//* 104  155:aload           4
		//* 105  157:iload_3         
		//* 106  158:lload_1         
		//* 107  159:bipush          40
		//* 108  161:lshr            
		//* 109  162:l2i             
		//* 110  163:int2byte        
		//* 111  164:bastore         
		//* 112  165:aload_0         
		//* 113  166:getfield        #18  <Field byte[] buffer>
		//* 114  169:astore          4
		//* 115  171:aload_0         
		//* 116  172:getfield        #22  <Field int position>
		//* 117  175:istore_3        
		//* 118  176:aload_0         
		//* 119  177:iload_3         
		//* 120  178:iconst_1        
		//* 121  179:iadd            
		//* 122  180:putfield        #22  <Field int position>
		//* 123  183:aload           4
		//* 124  185:iload_3         
		//* 125  186:lload_1         
		//* 126  187:bipush          48
		//* 127  189:lshr            
		//* 128  190:l2i             
		//* 129  191:int2byte        
		//* 130  192:bastore         
		//* 131  193:aload_0         
		//* 132  194:getfield        #18  <Field byte[] buffer>
		//* 133  197:astore          4
		//* 134  199:aload_0         
		//* 135  200:getfield        #22  <Field int position>
		//* 136  203:istore_3        
		//* 137  204:aload_0         
		//* 138  205:iload_3         
		//* 139  206:iconst_1        
		//* 140  207:iadd            
		//* 141  208:putfield        #22  <Field int position>
		//* 142  211:aload           4
		//* 143  213:iload_3         
		//* 144  214:lload_1         
		//* 145  215:bipush          56
		//* 146  217:lshr            
		//* 147  218:l2i             
		//* 148  219:int2byte        
		//* 149  220:bastore         
		//* 150  221:return          
			catch(IndexOutOfBoundsException indexoutofboundsexception)
		//* 151  222:astore          4
			{
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
		//  152  224:new             #65  <Class zztv$zzc>
		//  153  227:dup             
		//  154  228:ldc1            #67  <String "Pos: %d, limit: %d, len: %d">
		//  155  230:iconst_3        
		//  156  231:anewarray       Object[]
		//  157  234:dup             
		//  158  235:iconst_0        
		//  159  236:aload_0         
		//  160  237:getfield        #22  <Field int position>
		//  161  240:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  162  243:aastore         
		//  163  244:dup             
		//  164  245:iconst_1        
		//  165  246:aload_0         
		//  166  247:getfield        #24  <Field int limit>
		//  167  250:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  168  253:aastore         
		//  169  254:dup             
		//  170  255:iconst_2        
		//  171  256:iconst_1        
		//  172  257:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  173  260:aastore         
		//  174  261:invokestatic    #42  <Method String String.format(String, Object[])>
		//  175  264:aload           4
		//  176  266:invokespecial   #70  <Method void zztv$zzc(String, Throwable)>
		//  177  269:athrow          
			}
			abyte0[i] = (byte)(int)l;
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)(int)(l >> 8);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)(int)(l >> 16);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)(int)(l >> 24);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)(int)(l >> 32);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)(int)(l >> 40);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)(int)(l >> 48);
			abyte0 = buffer;
			i = position;
			position = i + 1;
			abyte0[i] = (byte)(int)(l >> 56);
			return;
		}

		public final void zzaz(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				((zztv)this).zzba(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #108 <Method void zztv.zzba(int)>
				return;
		//    5    9:return          
			} else
			{
				((zztv)this).zzat(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #80  <Method void zztv.zzat(long)>
				return;
		//   10   16:return          
			}
		}

		public final void zzb(int i, zzte zzte1)
			throws IOException
		{
			((zztv)this).zzc(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zze(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #145 <Method void zztv.zze(int, int)>
			((zztv)this).zza(3, zzte1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #147 <Method void zztv.zza(int, zzte)>
			((zztv)this).zzc(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #76  <Method void zztv.zzc(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzc(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zze(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #145 <Method void zztv.zze(int, int)>
			((zztv)this).zza(3, zzvv1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #149 <Method void zztv.zza(int, zzvv)>
			((zztv)this).zzc(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #76  <Method void zztv.zzc(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, String s)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zzgb(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #153 <Method void zztv.zzgb(String)>
		//    7   11:return          
		}

		public final void zzb(int i, boolean flag)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zzc((byte)flag);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:int2byte        
		//    7    9:invokevirtual   #157 <Method void zztv.zzc(byte)>
		//    8   12:return          
		}

		public final void zzb(zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzba(zzvv1.zzvx());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #162 <Method int zzvv.zzvx()>
		//    3    7:invokevirtual   #108 <Method void zztv.zzba(int)>
			zzvv1.zzb(((zztv) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #165 <Method void zzvv.zzb(zztv)>
		//    7   17:return          
		}

		public final void zzba(int i)
			throws IOException
		{
			int j;
			j = i;
		//    0    0:iload_1         
		//    1    1:istore_2        
			if(zztv.zzvk())
		//*   2    2:invokestatic    #130 <Method boolean zztv.zzvk()>
		//*   3    5:ifeq            92
			{
				j = i;
		//    4    8:iload_1         
		//    5    9:istore_2        
				if(((zztv)this).zzvj() >= 10)
		//*   6   10:aload_0         
		//*   7   11:invokevirtual   #133 <Method int zztv.zzvj()>
		//*   8   14:bipush          10
		//*   9   16:icmplt          92
					do
					{
						if((i & 0xffffff80) == 0)
		//*  10   19:iload_1         
		//*  11   20:bipush          -128
		//*  12   22:iand            
		//*  13   23:ifne            52
						{
							byte abyte0[] = buffer;
		//   14   26:aload_0         
		//   15   27:getfield        #18  <Field byte[] buffer>
		//   16   30:astore_3        
							j = position;
		//   17   31:aload_0         
		//   18   32:getfield        #22  <Field int position>
		//   19   35:istore_2        
							position = j + 1;
		//   20   36:aload_0         
		//   21   37:iload_2         
		//   22   38:iconst_1        
		//   23   39:iadd            
		//   24   40:putfield        #22  <Field int position>
							zzxj.zza(abyte0, j, (byte)i);
		//   25   43:aload_3         
		//   26   44:iload_2         
		//   27   45:i2l             
		//   28   46:iload_1         
		//   29   47:int2byte        
		//   30   48:invokestatic    #140 <Method void zzxj.zza(byte[], long, byte)>
							return;
		//   31   51:return          
						}
						byte abyte1[] = buffer;
		//   32   52:aload_0         
		//   33   53:getfield        #18  <Field byte[] buffer>
		//   34   56:astore_3        
						j = position;
		//   35   57:aload_0         
		//   36   58:getfield        #22  <Field int position>
		//   37   61:istore_2        
						position = j + 1;
		//   38   62:aload_0         
		//   39   63:iload_2         
		//   40   64:iconst_1        
		//   41   65:iadd            
		//   42   66:putfield        #22  <Field int position>
						zzxj.zza(abyte1, j, (byte)(i & 0x7f | 0x80));
		//   43   69:aload_3         
		//   44   70:iload_2         
		//   45   71:i2l             
		//   46   72:iload_1         
		//   47   73:bipush          127
		//   48   75:iand            
		//   49   76:sipush          128
		//   50   79:ior             
		//   51   80:int2byte        
		//   52   81:invokestatic    #140 <Method void zzxj.zza(byte[], long, byte)>
						i >>>= 7;
		//   53   84:iload_1         
		//   54   85:bipush          7
		//   55   87:iushr           
		//   56   88:istore_1        
					} while(true);
		//   57   89:goto            19
			}
_L1:
			if((j & 0xffffff80) == 0)
		//*  58   92:iload_2         
		//*  59   93:bipush          -128
		//*  60   95:iand            
		//*  61   96:ifne            122
			{
				byte abyte2[];
				try
				{
					abyte2 = buffer;
		//   62   99:aload_0         
		//   63  100:getfield        #18  <Field byte[] buffer>
		//   64  103:astore_3        
					i = position;
		//   65  104:aload_0         
		//   66  105:getfield        #22  <Field int position>
		//   67  108:istore_1        
					position = i + 1;
		//   68  109:aload_0         
		//   69  110:iload_1         
		//   70  111:iconst_1        
		//   71  112:iadd            
		//   72  113:putfield        #22  <Field int position>
				}
		//*  73  116:aload_3         
		//*  74  117:iload_1         
		//*  75  118:iload_2         
		//*  76  119:int2byte        
		//*  77  120:bastore         
		//*  78  121:return          
		//*  79  122:aload_0         
		//*  80  123:getfield        #18  <Field byte[] buffer>
		//*  81  126:astore_3        
		//*  82  127:aload_0         
		//*  83  128:getfield        #22  <Field int position>
		//*  84  131:istore_1        
		//*  85  132:aload_0         
		//*  86  133:iload_1         
		//*  87  134:iconst_1        
		//*  88  135:iadd            
		//*  89  136:putfield        #22  <Field int position>
		//*  90  139:aload_3         
		//*  91  140:iload_1         
		//*  92  141:iload_2         
		//*  93  142:bipush          127
		//*  94  144:iand            
		//*  95  145:sipush          128
		//*  96  148:ior             
		//*  97  149:int2byte        
		//*  98  150:bastore         
		//*  99  151:iload_2         
		//* 100  152:bipush          7
		//* 101  154:iushr           
		//* 102  155:istore_2        
		//* 103  156:goto            92
				catch(IndexOutOfBoundsException indexoutofboundsexception)
		//* 104  159:astore_3        
				{
					throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
					}), ((Throwable) (indexoutofboundsexception)));
		//  105  160:new             #65  <Class zztv$zzc>
		//  106  163:dup             
		//  107  164:ldc1            #67  <String "Pos: %d, limit: %d, len: %d">
		//  108  166:iconst_3        
		//  109  167:anewarray       Object[]
		//  110  170:dup             
		//  111  171:iconst_0        
		//  112  172:aload_0         
		//  113  173:getfield        #22  <Field int position>
		//  114  176:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  115  179:aastore         
		//  116  180:dup             
		//  117  181:iconst_1        
		//  118  182:aload_0         
		//  119  183:getfield        #24  <Field int limit>
		//  120  186:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  121  189:aastore         
		//  122  190:dup             
		//  123  191:iconst_2        
		//  124  192:iconst_1        
		//  125  193:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//  126  196:aastore         
		//  127  197:invokestatic    #42  <Method String String.format(String, Object[])>
		//  128  200:aload_3         
		//  129  201:invokespecial   #70  <Method void zztv$zzc(String, Throwable)>
		//  130  204:athrow          
				}
				abyte2[i] = (byte)j;
				return;
			}
			abyte2 = buffer;
			i = position;
			position = i + 1;
			abyte2[i] = (byte)(j & 0x7f | 0x80);
			j >>>= 7;
			  goto _L1
		}

		public final void zzbc(int i)
			throws IOException
		{
			int j;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field byte[] buffer>
		//    2    4:astore_3        
				j = position;
		//    3    5:aload_0         
		//    4    6:getfield        #22  <Field int position>
		//    5    9:istore_2        
				position = j + 1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #22  <Field int position>
			}
		//*  11   17:aload_3         
		//*  12   18:iload_2         
		//*  13   19:iload_1         
		//*  14   20:int2byte        
		//*  15   21:bastore         
		//*  16   22:aload_0         
		//*  17   23:getfield        #18  <Field byte[] buffer>
		//*  18   26:astore_3        
		//*  19   27:aload_0         
		//*  20   28:getfield        #22  <Field int position>
		//*  21   31:istore_2        
		//*  22   32:aload_0         
		//*  23   33:iload_2         
		//*  24   34:iconst_1        
		//*  25   35:iadd            
		//*  26   36:putfield        #22  <Field int position>
		//*  27   39:aload_3         
		//*  28   40:iload_2         
		//*  29   41:iload_1         
		//*  30   42:bipush          8
		//*  31   44:ishr            
		//*  32   45:int2byte        
		//*  33   46:bastore         
		//*  34   47:aload_0         
		//*  35   48:getfield        #18  <Field byte[] buffer>
		//*  36   51:astore_3        
		//*  37   52:aload_0         
		//*  38   53:getfield        #22  <Field int position>
		//*  39   56:istore_2        
		//*  40   57:aload_0         
		//*  41   58:iload_2         
		//*  42   59:iconst_1        
		//*  43   60:iadd            
		//*  44   61:putfield        #22  <Field int position>
		//*  45   64:aload_3         
		//*  46   65:iload_2         
		//*  47   66:iload_1         
		//*  48   67:bipush          16
		//*  49   69:ishr            
		//*  50   70:int2byte        
		//*  51   71:bastore         
		//*  52   72:aload_0         
		//*  53   73:getfield        #18  <Field byte[] buffer>
		//*  54   76:astore_3        
		//*  55   77:aload_0         
		//*  56   78:getfield        #22  <Field int position>
		//*  57   81:istore_2        
		//*  58   82:aload_0         
		//*  59   83:iload_2         
		//*  60   84:iconst_1        
		//*  61   85:iadd            
		//*  62   86:putfield        #22  <Field int position>
		//*  63   89:aload_3         
		//*  64   90:iload_2         
		//*  65   91:iload_1         
		//*  66   92:bipush          24
		//*  67   94:iushr           
		//*  68   95:int2byte        
		//*  69   96:bastore         
		//*  70   97:return          
			catch(IndexOutOfBoundsException indexoutofboundsexception)
		//*  71   98:astore_3        
			{
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
		//   72   99:new             #65  <Class zztv$zzc>
		//   73  102:dup             
		//   74  103:ldc1            #67  <String "Pos: %d, limit: %d, len: %d">
		//   75  105:iconst_3        
		//   76  106:anewarray       Object[]
		//   77  109:dup             
		//   78  110:iconst_0        
		//   79  111:aload_0         
		//   80  112:getfield        #22  <Field int position>
		//   81  115:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   82  118:aastore         
		//   83  119:dup             
		//   84  120:iconst_1        
		//   85  121:aload_0         
		//   86  122:getfield        #24  <Field int limit>
		//   87  125:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   88  128:aastore         
		//   89  129:dup             
		//   90  130:iconst_2        
		//   91  131:iconst_1        
		//   92  132:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   93  135:aastore         
		//   94  136:invokestatic    #42  <Method String String.format(String, Object[])>
		//   95  139:aload_3         
		//   96  140:invokespecial   #70  <Method void zztv$zzc(String, Throwable)>
		//   97  143:athrow          
			}
			abyte0[j] = (byte)i;
			abyte0 = buffer;
			j = position;
			position = j + 1;
			abyte0[j] = (byte)(i >> 8);
			abyte0 = buffer;
			j = position;
			position = j + 1;
			abyte0[j] = (byte)(i >> 16);
			abyte0 = buffer;
			j = position;
			position = j + 1;
			abyte0[j] = (byte)(i >>> 24);
			return;
		}

		public final void zzc(byte byte0)
			throws IOException
		{
			int i;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field byte[] buffer>
		//    2    4:astore_3        
				i = position;
		//    3    5:aload_0         
		//    4    6:getfield        #22  <Field int position>
		//    5    9:istore_2        
				position = i + 1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #22  <Field int position>
			}
		//*  11   17:aload_3         
		//*  12   18:iload_2         
		//*  13   19:iload_1         
		//*  14   20:bastore         
		//*  15   21:return          
			catch(IndexOutOfBoundsException indexoutofboundsexception)
		//*  16   22:astore_3        
			{
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
				}), ((Throwable) (indexoutofboundsexception)));
		//   17   23:new             #65  <Class zztv$zzc>
		//   18   26:dup             
		//   19   27:ldc1            #67  <String "Pos: %d, limit: %d, len: %d">
		//   20   29:iconst_3        
		//   21   30:anewarray       Object[]
		//   22   33:dup             
		//   23   34:iconst_0        
		//   24   35:aload_0         
		//   25   36:getfield        #22  <Field int position>
		//   26   39:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   27   42:aastore         
		//   28   43:dup             
		//   29   44:iconst_1        
		//   30   45:aload_0         
		//   31   46:getfield        #24  <Field int limit>
		//   32   49:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   33   52:aastore         
		//   34   53:dup             
		//   35   54:iconst_2        
		//   36   55:iconst_1        
		//   37   56:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   38   59:aastore         
		//   39   60:invokestatic    #42  <Method String String.format(String, Object[])>
		//   40   63:aload_3         
		//   41   64:invokespecial   #70  <Method void zztv$zzc(String, Throwable)>
		//   42   67:athrow          
			}
			abyte0[i] = byte0;
		}

		public final void zzc(int i, int j)
			throws IOException
		{
			((zztv)this).zzba(i << 3 | j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_3        
		//    3    3:ishl            
		//    4    4:iload_2         
		//    5    5:ior             
		//    6    6:invokevirtual   #108 <Method void zztv.zzba(int)>
		//    7    9:return          
		}

		public final void zzc(int i, long l)
			throws IOException
		{
			((zztv)this).zzc(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zzav(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #168 <Method void zztv.zzav(long)>
		//    7   11:return          
		}

		public final void zzd(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zzaz(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #171 <Method void zztv.zzaz(int)>
		//    7   11:return          
		}

		public final void zze(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zzba(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #108 <Method void zztv.zzba(int)>
		//    7   11:return          
		}

		public final void zze(byte abyte0[], int i, int j)
			throws IOException
		{
			((zztv)this).zzba(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #108 <Method void zztv.zzba(int)>
			((zztv)this).write(abyte0, 0, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_0        
		//    6    8:iload_3         
		//    7    9:invokevirtual   #126 <Method void zztv.write(byte[], int, int)>
		//    8   12:return          
		}

		public final void zzg(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #76  <Method void zztv.zzc(int, int)>
			((zztv)this).zzbc(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #174 <Method void zztv.zzbc(int)>
		//    7   11:return          
		}

		public final void zzgb(String s)
			throws IOException
		{
			int i = position;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int position>
		//    2    4:istore_2        
			int j;
			int k;
			try
			{
				k = zzbf(s.length() * 3);
		//    3    5:aload_1         
		//    4    6:invokevirtual   #179 <Method int String.length()>
		//    5    9:iconst_3        
		//    6   10:imul            
		//    7   11:invokestatic    #183 <Method int zzbf(int)>
		//    8   14:istore          4
				j = zzbf(s.length());
		//    9   16:aload_1         
		//   10   17:invokevirtual   #179 <Method int String.length()>
		//   11   20:invokestatic    #183 <Method int zzbf(int)>
		//   12   23:istore_3        
			}
		//*  13   24:iload_3         
		//*  14   25:iload           4
		//*  15   27:icmpne          77
		//*  16   30:aload_0         
		//*  17   31:iload_2         
		//*  18   32:iload_3         
		//*  19   33:iadd            
		//*  20   34:putfield        #22  <Field int position>
		//*  21   37:aload_1         
		//*  22   38:aload_0         
		//*  23   39:getfield        #18  <Field byte[] buffer>
		//*  24   42:aload_0         
		//*  25   43:getfield        #22  <Field int position>
		//*  26   46:aload_0         
		//*  27   47:invokevirtual   #133 <Method int zztv.zzvj()>
		//*  28   50:invokestatic    #188 <Method int zzxl.zza(CharSequence, byte[], int, int)>
		//*  29   53:istore          4
		//*  30   55:aload_0         
		//*  31   56:iload_2         
		//*  32   57:putfield        #22  <Field int position>
		//*  33   60:aload_0         
		//*  34   61:iload           4
		//*  35   63:iload_2         
		//*  36   64:isub            
		//*  37   65:iload_3         
		//*  38   66:isub            
		//*  39   67:invokevirtual   #108 <Method void zztv.zzba(int)>
		//*  40   70:aload_0         
		//*  41   71:iload           4
		//*  42   73:putfield        #22  <Field int position>
		//*  43   76:return          
		//*  44   77:aload_0         
		//*  45   78:aload_1         
		//*  46   79:invokestatic    #191 <Method int zzxl.zza(CharSequence)>
		//*  47   82:invokevirtual   #108 <Method void zztv.zzba(int)>
		//*  48   85:aload_0         
		//*  49   86:aload_1         
		//*  50   87:aload_0         
		//*  51   88:getfield        #18  <Field byte[] buffer>
		//*  52   91:aload_0         
		//*  53   92:getfield        #22  <Field int position>
		//*  54   95:aload_0         
		//*  55   96:invokevirtual   #133 <Method int zztv.zzvj()>
		//*  56   99:invokestatic    #188 <Method int zzxl.zza(CharSequence, byte[], int, int)>
		//*  57  102:putfield        #22  <Field int position>
		//*  58  105:return          
		//*  59  106:astore_1        
		//*  60  107:new             #65  <Class zztv$zzc>
		//*  61  110:dup             
		//*  62  111:aload_1         
		//*  63  112:invokespecial   #194 <Method void zztv$zzc(Throwable)>
		//*  64  115:athrow          
			catch(zzxp zzxp1)
		//*  65  116:astore          5
			{
				position = i;
		//   66  118:aload_0         
		//   67  119:iload_2         
		//   68  120:putfield        #22  <Field int position>
				((zztv)this).zza(s, zzxp1);
		//   69  123:aload_0         
		//   70  124:aload_1         
		//   71  125:aload           5
		//   72  127:invokevirtual   #197 <Method void zztv.zza(String, zzxp)>
				return;
		//   73  130:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new zzc(((Throwable) (s)));
			}
			if(j != k)
				break MISSING_BLOCK_LABEL_77;
			position = i + j;
			k = zzxl.zza(((CharSequence) (s)), buffer, position, ((zztv)this).zzvj());
			position = i;
			((zztv)this).zzba(k - i - j);
			position = k;
			return;
			((zztv)this).zzba(zzxl.zza(((CharSequence) (s))));
			position = zzxl.zza(((CharSequence) (s)), buffer, position, ((zztv)this).zzvj());
			return;
		}

		public final int zzvj()
		{
			return limit - position;
		//    0    0:aload_0         
		//    1    1:getfield        #24  <Field int limit>
		//    2    4:aload_0         
		//    3    5:getfield        #22  <Field int position>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public final int zzvl()
		{
			return position - offset;
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field int position>
		//    2    4:aload_0         
		//    3    5:getfield        #20  <Field int offset>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		private final byte buffer[];
		private final int limit;
		private final int offset;
		private int position;

		zza(byte abyte0[], int i, int j)
		{
			super(((zztw) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #16  <Method void zztv(zztw)>
			if(abyte0 != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          91
			{
				int k = abyte0.length;
		//    5    9:aload_1         
		//    6   10:arraylength     
		//    7   11:istore          4
				int l = i + j;
		//    8   13:iload_2         
		//    9   14:iload_3         
		//   10   15:iadd            
		//   11   16:istore          5
				if((i | j | k - l) >= 0)
		//*  12   18:iload_2         
		//*  13   19:iload_3         
		//*  14   20:ior             
		//*  15   21:iload           4
		//*  16   23:iload           5
		//*  17   25:isub            
		//*  18   26:ior             
		//*  19   27:iflt            52
				{
					buffer = abyte0;
		//   20   30:aload_0         
		//   21   31:aload_1         
		//   22   32:putfield        #18  <Field byte[] buffer>
					offset = i;
		//   23   35:aload_0         
		//   24   36:iload_2         
		//   25   37:putfield        #20  <Field int offset>
					position = i;
		//   26   40:aload_0         
		//   27   41:iload_2         
		//   28   42:putfield        #22  <Field int position>
					limit = l;
		//   29   45:aload_0         
		//   30   46:iload           5
		//   31   48:putfield        #24  <Field int limit>
					return;
		//   32   51:return          
				} else
				{
					throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] {
						Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
					}));
		//   33   52:new             #26  <Class IllegalArgumentException>
		//   34   55:dup             
		//   35   56:ldc1            #28  <String "Array range is invalid. Buffer.length=%d, offset=%d, length=%d">
		//   36   58:iconst_3        
		//   37   59:anewarray       Object[]
		//   38   62:dup             
		//   39   63:iconst_0        
		//   40   64:aload_1         
		//   41   65:arraylength     
		//   42   66:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   43   69:aastore         
		//   44   70:dup             
		//   45   71:iconst_1        
		//   46   72:iload_2         
		//   47   73:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   48   76:aastore         
		//   49   77:dup             
		//   50   78:iconst_2        
		//   51   79:iload_3         
		//   52   80:invokestatic    #36  <Method Integer Integer.valueOf(int)>
		//   53   83:aastore         
		//   54   84:invokestatic    #42  <Method String String.format(String, Object[])>
		//   55   87:invokespecial   #45  <Method void IllegalArgumentException(String)>
		//   56   90:athrow          
				}
			} else
			{
				throw new NullPointerException("buffer");
		//   57   91:new             #47  <Class NullPointerException>
		//   58   94:dup             
		//   59   95:ldc1            #48  <String "buffer">
		//   60   97:invokespecial   #49  <Method void NullPointerException(String)>
		//   61  100:athrow          
			}
		}
	}

	static final class zzb extends zza
	{

		public final void flush()
		{
			zzbuo.position(zzbup + ((zza)this).zzvl());
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field ByteBuffer zzbuo>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field int zzbup>
		//    4    8:aload_0         
		//    5    9:invokevirtual   #42  <Method int zztv$zza.zzvl()>
		//    6   12:iadd            
		//    7   13:invokevirtual   #45  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    8   16:pop             
		//    9   17:return          
		}

		private final ByteBuffer zzbuo;
		private int zzbup;

		zzb(ByteBuffer bytebuffer)
		{
			super(bytebuffer.array(), bytebuffer.arrayOffset() + bytebuffer.position(), bytebuffer.remaining());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #19  <Method byte[] ByteBuffer.array()>
		//    3    5:aload_1         
		//    4    6:invokevirtual   #23  <Method int ByteBuffer.arrayOffset()>
		//    5    9:aload_1         
		//    6   10:invokevirtual   #26  <Method int ByteBuffer.position()>
		//    7   13:iadd            
		//    8   14:aload_1         
		//    9   15:invokevirtual   #29  <Method int ByteBuffer.remaining()>
		//   10   18:invokespecial   #32  <Method void zztv$zza(byte[], int, int)>
			zzbuo = bytebuffer;
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:putfield        #34  <Field ByteBuffer zzbuo>
			zzbup = bytebuffer.position();
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokevirtual   #26  <Method int ByteBuffer.position()>
		//   17   31:putfield        #36  <Field int zzbup>
		//   18   34:return          
		}
	}

	public static final class zzc extends IOException
	{

		zzc()
		{
			super("CodedOutputStream was writing to a flat byte array and ran out of space.");
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
		//    2    3:invokespecial   #14  <Method void IOException(String)>
		//    3    6:return          
		}

		zzc(String s)
		{
			String s1 = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
		//    0    0:ldc1            #17  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
		//    1    2:invokestatic    #23  <Method String String.valueOf(Object)>
		//    2    5:astore_2        
			s = String.valueOf(((Object) (s)));
		//    3    6:aload_1         
		//    4    7:invokestatic    #23  <Method String String.valueOf(Object)>
		//    5   10:astore_1        
			if(s.length() != 0)
		//*   6   11:aload_1         
		//*   7   12:invokevirtual   #27  <Method int String.length()>
		//*   8   15:ifeq            27
				s = s1.concat(s);
		//    9   18:aload_2         
		//   10   19:aload_1         
		//   11   20:invokevirtual   #31  <Method String String.concat(String)>
		//   12   23:astore_1        
			else
		//*  13   24:goto            36
				s = new String(s1);
		//   14   27:new             #19  <Class String>
		//   15   30:dup             
		//   16   31:aload_2         
		//   17   32:invokespecial   #32  <Method void String(String)>
		//   18   35:astore_1        
			super(s);
		//   19   36:aload_0         
		//   20   37:aload_1         
		//   21   38:invokespecial   #14  <Method void IOException(String)>
		//   22   41:return          
		}

		zzc(String s, Throwable throwable)
		{
			String s1 = String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
		//    0    0:ldc1            #17  <String "CodedOutputStream was writing to a flat byte array and ran out of space.: ">
		//    1    2:invokestatic    #23  <Method String String.valueOf(Object)>
		//    2    5:astore_3        
			s = String.valueOf(((Object) (s)));
		//    3    6:aload_1         
		//    4    7:invokestatic    #23  <Method String String.valueOf(Object)>
		//    5   10:astore_1        
			if(s.length() != 0)
		//*   6   11:aload_1         
		//*   7   12:invokevirtual   #27  <Method int String.length()>
		//*   8   15:ifeq            27
				s = s1.concat(s);
		//    9   18:aload_3         
		//   10   19:aload_1         
		//   11   20:invokevirtual   #31  <Method String String.concat(String)>
		//   12   23:astore_1        
			else
		//*  13   24:goto            36
				s = new String(s1);
		//   14   27:new             #19  <Class String>
		//   15   30:dup             
		//   16   31:aload_3         
		//   17   32:invokespecial   #32  <Method void String(String)>
		//   18   35:astore_1        
			super(s, throwable);
		//   19   36:aload_0         
		//   20   37:aload_1         
		//   21   38:aload_2         
		//   22   39:invokespecial   #35  <Method void IOException(String, Throwable)>
		//   23   42:return          
		}

		zzc(Throwable throwable)
		{
			super("CodedOutputStream was writing to a flat byte array and ran out of space.", throwable);
		//    0    0:aload_0         
		//    1    1:ldc1            #11  <String "CodedOutputStream was writing to a flat byte array and ran out of space.">
		//    2    3:aload_1         
		//    3    4:invokespecial   #35  <Method void IOException(String, Throwable)>
		//    4    7:return          
		}
	}

	static final class zzd extends zztv
	{

		private final void zzgd(String s)
			throws IOException
		{
			try
			{
				zzxl.zza(((CharSequence) (s)), zzbur);
		//    0    0:aload_1         
		//    1    1:aload_0         
		//    2    2:getfield        #35  <Field ByteBuffer zzbur>
		//    3    5:invokestatic    #54  <Method void zzxl.zza(CharSequence, ByteBuffer)>
				return;
		//    4    8:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
		//*   5    9:astore_1        
			{
				throw new zzc(((Throwable) (s)));
		//    6   10:new             #56  <Class zztv$zzc>
		//    7   13:dup             
		//    8   14:aload_1         
		//    9   15:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//   10   18:athrow          
			}
		}

		public final void flush()
		{
			zzbuq.position(zzbur.position());
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field ByteBuffer zzbuq>
		//    2    4:aload_0         
		//    3    5:getfield        #35  <Field ByteBuffer zzbur>
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
				zzbur.put(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzbur>
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:invokevirtual   #73  <Method ByteBuffer ByteBuffer.put(byte[], int, int)>
		//    6   10:pop             
				return;
		//    7   11:return          
			}
		//*   8   12:astore_1        
		//*   9   13:new             #56  <Class zztv$zzc>
		//*  10   16:dup             
		//*  11   17:aload_1         
		//*  12   18:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//*  13   21:athrow          
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
		//*  14   22:astore_1        
			{
				throw new zzc(((Throwable) (abyte0)));
		//   15   23:new             #56  <Class zztv$zzc>
		//   16   26:dup             
		//   17   27:aload_1         
		//   18   28:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//   19   31:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				throw new zzc(((Throwable) (abyte0)));
			}
		}

		public final void zza(int i, long l)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zzat(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #82  <Method void zztv.zzat(long)>
		//    7   11:return          
		}

		public final void zza(int i, zzte zzte1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zza(zzte1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #86  <Method void zztv.zza(zzte)>
		//    7   11:return          
		}

		public final void zza(int i, zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zzb(zzvv1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #91  <Method void zztv.zzb(zzvv)>
		//    7   11:return          
		}

		final void zza(int i, zzvv zzvv1, zzwl zzwl1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zza(zzvv1, zzwl1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #95  <Method void zztv.zza(zzvv, zzwl)>
		//    8   12:return          
		}

		public final void zza(zzte zzte1)
			throws IOException
		{
			((zztv)this).zzba(zzte1.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #100 <Method int zzte.size()>
		//    3    5:invokevirtual   #104 <Method void zztv.zzba(int)>
			zzte1.zza(((zztd) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #107 <Method void zzte.zza(zztd)>
		//    7   13:return          
		}

		final void zza(zzvv zzvv1, zzwl zzwl1)
			throws IOException
		{
			zzsx zzsx1 = (zzsx)zzvv1;
		//    0    0:aload_1         
		//    1    1:checkcast       #109 <Class zzsx>
		//    2    4:astore          5
			int j = zzsx1.zztx();
		//    3    6:aload           5
		//    4    8:invokevirtual   #112 <Method int zzsx.zztx()>
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
		//   13   25:invokeinterface #118 <Method int zzwl.zzai(Object)>
		//   14   30:istore_3        
				zzsx1.zzai(i);
		//   15   31:aload           5
		//   16   33:iload_3         
		//   17   34:invokevirtual   #120 <Method void zzsx.zzai(int)>
			}
			((zztv)this).zzba(i);
		//   18   37:aload_0         
		//   19   38:iload_3         
		//   20   39:invokevirtual   #104 <Method void zztv.zzba(int)>
			zzwl1.zza(((Object) (zzvv1)), ((zzxy) (zzbun)));
		//   21   42:aload_2         
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #124 <Field zztx zzbun>
		//   25   48:invokeinterface #127 <Method void zzwl.zza(Object, zzxy)>
		//   26   53:return          
		}

		public final void zza(byte abyte0[], int i, int j)
			throws IOException
		{
			((zztv)this).write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #129 <Method void zztv.write(byte[], int, int)>
		//    5    7:return          
		}

		public final void zzat(long l)
			throws IOException
		{
_L1:
			if((-128L & l) == 0L)
		//*   0    0:ldc2w           #130 <Long -128L>
		//*   1    3:lload_1         
		//*   2    4:land            
		//*   3    5:lconst_0        
		//*   4    6:lcmp            
		//*   5    7:ifne            22
				try
				{
					zzbur.put((byte)(int)l);
		//    6   10:aload_0         
		//    7   11:getfield        #35  <Field ByteBuffer zzbur>
		//    8   14:lload_1         
		//    9   15:l2i             
		//   10   16:int2byte        
		//   11   17:invokevirtual   #134 <Method ByteBuffer ByteBuffer.put(byte)>
		//   12   20:pop             
					return;
		//   13   21:return          
				}
		//*  14   22:aload_0         
		//*  15   23:getfield        #35  <Field ByteBuffer zzbur>
		//*  16   26:lload_1         
		//*  17   27:l2i             
		//*  18   28:bipush          127
		//*  19   30:iand            
		//*  20   31:sipush          128
		//*  21   34:ior             
		//*  22   35:int2byte        
		//*  23   36:invokevirtual   #134 <Method ByteBuffer ByteBuffer.put(byte)>
		//*  24   39:pop             
		//*  25   40:lload_1         
		//*  26   41:bipush          7
		//*  27   43:lushr           
		//*  28   44:lstore_1        
		//*  29   45:goto            0
				catch(BufferOverflowException bufferoverflowexception)
		//*  30   48:astore_3        
				{
					throw new zzc(((Throwable) (bufferoverflowexception)));
		//   31   49:new             #56  <Class zztv$zzc>
		//   32   52:dup             
		//   33   53:aload_3         
		//   34   54:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//   35   57:athrow          
				}
			zzbur.put((byte)((int)l & 0x7f | 0x80));
			l >>>= 7;
			  goto _L1
		}

		public final void zzav(long l)
			throws IOException
		{
			try
			{
				zzbur.putLong(l);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzbur>
		//    2    4:lload_1         
		//    3    5:invokevirtual   #139 <Method ByteBuffer ByteBuffer.putLong(long)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_3        
			{
				throw new zzc(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class zztv$zzc>
		//    8   14:dup             
		//    9   15:aload_3         
		//   10   16:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//   11   19:athrow          
			}
		}

		public final void zzaz(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				((zztv)this).zzba(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #104 <Method void zztv.zzba(int)>
				return;
		//    5    9:return          
			} else
			{
				((zztv)this).zzat(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #82  <Method void zztv.zzat(long)>
				return;
		//   10   16:return          
			}
		}

		public final void zzb(int i, zzte zzte1)
			throws IOException
		{
			((zztv)this).zzc(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zze(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #143 <Method void zztv.zze(int, int)>
			((zztv)this).zza(3, zzte1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #145 <Method void zztv.zza(int, zzte)>
			((zztv)this).zzc(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #78  <Method void zztv.zzc(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzc(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zze(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #143 <Method void zztv.zze(int, int)>
			((zztv)this).zza(3, zzvv1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #147 <Method void zztv.zza(int, zzvv)>
			((zztv)this).zzc(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #78  <Method void zztv.zzc(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, String s)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zzgb(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #151 <Method void zztv.zzgb(String)>
		//    7   11:return          
		}

		public final void zzb(int i, boolean flag)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zzc((byte)flag);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:int2byte        
		//    7    9:invokevirtual   #155 <Method void zztv.zzc(byte)>
		//    8   12:return          
		}

		public final void zzb(zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzba(zzvv1.zzvx());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #160 <Method int zzvv.zzvx()>
		//    3    7:invokevirtual   #104 <Method void zztv.zzba(int)>
			zzvv1.zzb(((zztv) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #163 <Method void zzvv.zzb(zztv)>
		//    7   17:return          
		}

		public final void zzba(int i)
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
					zzbur.put((byte)i);
		//    4    7:aload_0         
		//    5    8:getfield        #35  <Field ByteBuffer zzbur>
		//    6   11:iload_1         
		//    7   12:int2byte        
		//    8   13:invokevirtual   #134 <Method ByteBuffer ByteBuffer.put(byte)>
		//    9   16:pop             
					return;
		//   10   17:return          
				}
		//*  11   18:aload_0         
		//*  12   19:getfield        #35  <Field ByteBuffer zzbur>
		//*  13   22:iload_1         
		//*  14   23:bipush          127
		//*  15   25:iand            
		//*  16   26:sipush          128
		//*  17   29:ior             
		//*  18   30:int2byte        
		//*  19   31:invokevirtual   #134 <Method ByteBuffer ByteBuffer.put(byte)>
		//*  20   34:pop             
		//*  21   35:iload_1         
		//*  22   36:bipush          7
		//*  23   38:iushr           
		//*  24   39:istore_1        
		//*  25   40:goto            0
				catch(BufferOverflowException bufferoverflowexception)
		//*  26   43:astore_2        
				{
					throw new zzc(((Throwable) (bufferoverflowexception)));
		//   27   44:new             #56  <Class zztv$zzc>
		//   28   47:dup             
		//   29   48:aload_2         
		//   30   49:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//   31   52:athrow          
				}
			zzbur.put((byte)(i & 0x7f | 0x80));
			i >>>= 7;
			  goto _L1
		}

		public final void zzbc(int i)
			throws IOException
		{
			try
			{
				zzbur.putInt(i);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzbur>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #168 <Method ByteBuffer ByteBuffer.putInt(int)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_2        
			{
				throw new zzc(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class zztv$zzc>
		//    8   14:dup             
		//    9   15:aload_2         
		//   10   16:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//   11   19:athrow          
			}
		}

		public final void zzc(byte byte0)
			throws IOException
		{
			try
			{
				zzbur.put(byte0);
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzbur>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #134 <Method ByteBuffer ByteBuffer.put(byte)>
		//    4    8:pop             
				return;
		//    5    9:return          
			}
			catch(BufferOverflowException bufferoverflowexception)
		//*   6   10:astore_2        
			{
				throw new zzc(((Throwable) (bufferoverflowexception)));
		//    7   11:new             #56  <Class zztv$zzc>
		//    8   14:dup             
		//    9   15:aload_2         
		//   10   16:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//   11   19:athrow          
			}
		}

		public final void zzc(int i, int j)
			throws IOException
		{
			((zztv)this).zzba(i << 3 | j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_3        
		//    3    3:ishl            
		//    4    4:iload_2         
		//    5    5:ior             
		//    6    6:invokevirtual   #104 <Method void zztv.zzba(int)>
		//    7    9:return          
		}

		public final void zzc(int i, long l)
			throws IOException
		{
			((zztv)this).zzc(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zzav(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #170 <Method void zztv.zzav(long)>
		//    7   11:return          
		}

		public final void zzd(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zzaz(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #172 <Method void zztv.zzaz(int)>
		//    7   11:return          
		}

		public final void zze(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zzba(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #104 <Method void zztv.zzba(int)>
		//    7   11:return          
		}

		public final void zze(byte abyte0[], int i, int j)
			throws IOException
		{
			((zztv)this).zzba(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #104 <Method void zztv.zzba(int)>
			((zztv)this).write(abyte0, 0, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_0        
		//    6    8:iload_3         
		//    7    9:invokevirtual   #129 <Method void zztv.write(byte[], int, int)>
		//    8   12:return          
		}

		public final void zzg(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #78  <Method void zztv.zzc(int, int)>
			((zztv)this).zzbc(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #175 <Method void zztv.zzbc(int)>
		//    7   11:return          
		}

		public final void zzgb(String s)
			throws IOException
		{
			int i = zzbur.position();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzbur>
		//    2    4:invokevirtual   #39  <Method int ByteBuffer.position()>
		//    3    7:istore_2        
			int j;
			int k;
			try
			{
				j = zzbf(s.length() * 3);
		//    4    8:aload_1         
		//    5    9:invokevirtual   #184 <Method int String.length()>
		//    6   12:iconst_3        
		//    7   13:imul            
		//    8   14:invokestatic    #188 <Method int zzbf(int)>
		//    9   17:istore_3        
				k = zzbf(s.length());
		//   10   18:aload_1         
		//   11   19:invokevirtual   #184 <Method int String.length()>
		//   12   22:invokestatic    #188 <Method int zzbf(int)>
		//   13   25:istore          4
			}
		//*  14   27:iload           4
		//*  15   29:iload_3         
		//*  16   30:icmpne          95
		//*  17   33:aload_0         
		//*  18   34:getfield        #35  <Field ByteBuffer zzbur>
		//*  19   37:invokevirtual   #39  <Method int ByteBuffer.position()>
		//*  20   40:iload           4
		//*  21   42:iadd            
		//*  22   43:istore_3        
		//*  23   44:aload_0         
		//*  24   45:getfield        #35  <Field ByteBuffer zzbur>
		//*  25   48:iload_3         
		//*  26   49:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  27   52:pop             
		//*  28   53:aload_0         
		//*  29   54:aload_1         
		//*  30   55:invokespecial   #190 <Method void zzgd(String)>
		//*  31   58:aload_0         
		//*  32   59:getfield        #35  <Field ByteBuffer zzbur>
		//*  33   62:invokevirtual   #39  <Method int ByteBuffer.position()>
		//*  34   65:istore          4
		//*  35   67:aload_0         
		//*  36   68:getfield        #35  <Field ByteBuffer zzbur>
		//*  37   71:iload_2         
		//*  38   72:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  39   75:pop             
		//*  40   76:aload_0         
		//*  41   77:iload           4
		//*  42   79:iload_3         
		//*  43   80:isub            
		//*  44   81:invokevirtual   #104 <Method void zztv.zzba(int)>
		//*  45   84:aload_0         
		//*  46   85:getfield        #35  <Field ByteBuffer zzbur>
		//*  47   88:iload           4
		//*  48   90:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  49   93:pop             
		//*  50   94:return          
		//*  51   95:aload_0         
		//*  52   96:aload_1         
		//*  53   97:invokestatic    #193 <Method int zzxl.zza(CharSequence)>
		//*  54  100:invokevirtual   #104 <Method void zztv.zzba(int)>
		//*  55  103:aload_0         
		//*  56  104:aload_1         
		//*  57  105:invokespecial   #190 <Method void zzgd(String)>
		//*  58  108:return          
		//*  59  109:astore_1        
		//*  60  110:new             #56  <Class zztv$zzc>
		//*  61  113:dup             
		//*  62  114:aload_1         
		//*  63  115:invokespecial   #59  <Method void zztv$zzc(Throwable)>
		//*  64  118:athrow          
			catch(zzxp zzxp1)
		//*  65  119:astore          5
			{
				zzbur.position(i);
		//   66  121:aload_0         
		//   67  122:getfield        #35  <Field ByteBuffer zzbur>
		//   68  125:iload_2         
		//   69  126:invokevirtual   #65  <Method java.nio.Buffer ByteBuffer.position(int)>
		//   70  129:pop             
				((zztv)this).zza(s, zzxp1);
		//   71  130:aload_0         
		//   72  131:aload_1         
		//   73  132:aload           5
		//   74  134:invokevirtual   #196 <Method void zztv.zza(String, zzxp)>
				return;
		//   75  137:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new zzc(((Throwable) (s)));
			}
			if(k != j)
				break MISSING_BLOCK_LABEL_95;
			j = zzbur.position() + k;
			zzbur.position(j);
			zzgd(s);
			k = zzbur.position();
			zzbur.position(i);
			((zztv)this).zzba(k - j);
			zzbur.position(k);
			return;
			((zztv)this).zzba(zzxl.zza(((CharSequence) (s))));
			zzgd(s);
			return;
		}

		public final int zzvj()
		{
			return zzbur.remaining();
		//    0    0:aload_0         
		//    1    1:getfield        #35  <Field ByteBuffer zzbur>
		//    2    4:invokevirtual   #200 <Method int ByteBuffer.remaining()>
		//    3    7:ireturn         
		}

		private final int zzbup;
		private final ByteBuffer zzbuq;
		private final ByteBuffer zzbur;

		zzd(ByteBuffer bytebuffer)
		{
			super(((zztw) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #15  <Method void zztv(zztw)>
			zzbuq = bytebuffer;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #17  <Field ByteBuffer zzbuq>
			zzbur = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #23  <Method ByteBuffer ByteBuffer.duplicate()>
		//    9   15:getstatic       #29  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
		//   10   18:invokevirtual   #33  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   11   21:putfield        #35  <Field ByteBuffer zzbur>
			zzbup = bytebuffer.position();
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokevirtual   #39  <Method int ByteBuffer.position()>
		//   15   29:putfield        #41  <Field int zzbup>
		//   16   32:return          
		}
	}

	static final class zze extends zztv
	{

		private final void zzbc(long l)
		{
			zzbur.position((int)(l - zzbus));
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer zzbur>
		//    2    4:lload_1         
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field long zzbus>
		//    5    9:lsub            
		//    6   10:l2i             
		//    7   11:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    8   14:pop             
		//    9   15:return          
		}

		public final void flush()
		{
			zzbuq.position((int)(zzbuw - zzbus));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field ByteBuffer zzbuq>
		//    2    4:aload_0         
		//    3    5:getfield        #64  <Field long zzbuw>
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field long zzbus>
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
				long l = zzbuu;
		//   12   20:aload_0         
		//   13   21:getfield        #58  <Field long zzbuu>
		//   14   24:lstore          4
				long l1 = j;
		//   15   26:iload_3         
		//   16   27:i2l             
		//   17   28:lstore          6
				long l2 = zzbuw;
		//   18   30:aload_0         
		//   19   31:getfield        #64  <Field long zzbuw>
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
					zzxj.zza(abyte0, i, l2, l1);
		//   28   50:aload_1         
		//   29   51:iload_2         
		//   30   52:i2l             
		//   31   53:lload           8
		//   32   55:lload           6
		//   33   57:invokestatic    #80  <Method void zzxj.zza(byte[], long, long, long)>
					zzbuw = zzbuw + l1;
		//   34   60:aload_0         
		//   35   61:aload_0         
		//   36   62:getfield        #64  <Field long zzbuw>
		//   37   65:lload           6
		//   38   67:ladd            
		//   39   68:putfield        #64  <Field long zzbuw>
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
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Long.valueOf(zzbuw), Long.valueOf(zzbuu), Integer.valueOf(j)
				}));
		//   48   86:new             #89  <Class zztv$zzc>
		//   49   89:dup             
		//   50   90:ldc1            #91  <String "Pos: %d, limit: %d, len: %d">
		//   51   92:iconst_3        
		//   52   93:anewarray       Object[]
		//   53   96:dup             
		//   54   97:iconst_0        
		//   55   98:aload_0         
		//   56   99:getfield        #64  <Field long zzbuw>
		//   57  102:invokestatic    #99  <Method Long Long.valueOf(long)>
		//   58  105:aastore         
		//   59  106:dup             
		//   60  107:iconst_1        
		//   61  108:aload_0         
		//   62  109:getfield        #58  <Field long zzbuu>
		//   63  112:invokestatic    #99  <Method Long Long.valueOf(long)>
		//   64  115:aastore         
		//   65  116:dup             
		//   66  117:iconst_2        
		//   67  118:iload_3         
		//   68  119:invokestatic    #104 <Method Integer Integer.valueOf(int)>
		//   69  122:aastore         
		//   70  123:invokestatic    #110 <Method String String.format(String, Object[])>
		//   71  126:invokespecial   #111 <Method void zztv$zzc(String)>
		//   72  129:athrow          
		}

		public final void zza(int i, long l)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zzat(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #120 <Method void zztv.zzat(long)>
		//    7   11:return          
		}

		public final void zza(int i, zzte zzte1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zza(zzte1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #124 <Method void zztv.zza(zzte)>
		//    7   11:return          
		}

		public final void zza(int i, zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zzb(zzvv1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #128 <Method void zztv.zzb(zzvv)>
		//    7   11:return          
		}

		final void zza(int i, zzvv zzvv1, zzwl zzwl1)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zza(zzvv1, zzwl1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:aload_3         
		//    7    9:invokevirtual   #132 <Method void zztv.zza(zzvv, zzwl)>
		//    8   12:return          
		}

		public final void zza(zzte zzte1)
			throws IOException
		{
			((zztv)this).zzba(zzte1.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #137 <Method int zzte.size()>
		//    3    5:invokevirtual   #141 <Method void zztv.zzba(int)>
			zzte1.zza(((zztd) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #144 <Method void zzte.zza(zztd)>
		//    7   13:return          
		}

		final void zza(zzvv zzvv1, zzwl zzwl1)
			throws IOException
		{
			zzsx zzsx1 = (zzsx)zzvv1;
		//    0    0:aload_1         
		//    1    1:checkcast       #146 <Class zzsx>
		//    2    4:astore          5
			int j = zzsx1.zztx();
		//    3    6:aload           5
		//    4    8:invokevirtual   #149 <Method int zzsx.zztx()>
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
		//   13   25:invokeinterface #155 <Method int zzwl.zzai(Object)>
		//   14   30:istore_3        
				zzsx1.zzai(i);
		//   15   31:aload           5
		//   16   33:iload_3         
		//   17   34:invokevirtual   #157 <Method void zzsx.zzai(int)>
			}
			((zztv)this).zzba(i);
		//   18   37:aload_0         
		//   19   38:iload_3         
		//   20   39:invokevirtual   #141 <Method void zztv.zzba(int)>
			zzwl1.zza(((Object) (zzvv1)), ((zzxy) (zzbun)));
		//   21   42:aload_2         
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #161 <Field zztx zzbun>
		//   25   48:invokeinterface #164 <Method void zzwl.zza(Object, zzxy)>
		//   26   53:return          
		}

		public final void zza(byte abyte0[], int i, int j)
			throws IOException
		{
			((zztv)this).write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #166 <Method void zztv.write(byte[], int, int)>
		//    5    7:return          
		}

		public final void zzat(long l)
			throws IOException
		{
			long l1 = l;
		//    0    0:lload_1         
		//    1    1:lstore_3        
			if(zzbuw <= zzbuv)
		//*   2    2:aload_0         
		//*   3    3:getfield        #64  <Field long zzbuw>
		//*   4    6:aload_0         
		//*   5    7:getfield        #62  <Field long zzbuv>
		//*   6   10:lcmp            
		//*   7   11:ifgt            78
				do
				{
					if((l & -128L) == 0L)
		//*   8   14:lload_1         
		//*   9   15:ldc2w           #167 <Long -128L>
		//*  10   18:land            
		//*  11   19:lconst_0        
		//*  12   20:lcmp            
		//*  13   21:ifne            44
					{
						l1 = zzbuw;
		//   14   24:aload_0         
		//   15   25:getfield        #64  <Field long zzbuw>
		//   16   28:lstore_3        
						zzbuw = 1L + l1;
		//   17   29:aload_0         
		//   18   30:lconst_1        
		//   19   31:lload_3         
		//   20   32:ladd            
		//   21   33:putfield        #64  <Field long zzbuw>
						zzxj.zza(l1, (byte)(int)l);
		//   22   36:lload_3         
		//   23   37:lload_1         
		//   24   38:l2i             
		//   25   39:int2byte        
		//   26   40:invokestatic    #171 <Method void zzxj.zza(long, byte)>
						return;
		//   27   43:return          
					}
					l1 = zzbuw;
		//   28   44:aload_0         
		//   29   45:getfield        #64  <Field long zzbuw>
		//   30   48:lstore_3        
					zzbuw = l1 + 1L;
		//   31   49:aload_0         
		//   32   50:lload_3         
		//   33   51:lconst_1        
		//   34   52:ladd            
		//   35   53:putfield        #64  <Field long zzbuw>
					zzxj.zza(l1, (byte)((int)l & 0x7f | 0x80));
		//   36   56:lload_3         
		//   37   57:lload_1         
		//   38   58:l2i             
		//   39   59:bipush          127
		//   40   61:iand            
		//   41   62:sipush          128
		//   42   65:ior             
		//   43   66:int2byte        
		//   44   67:invokestatic    #171 <Method void zzxj.zza(long, byte)>
					l >>>= 7;
		//   45   70:lload_1         
		//   46   71:bipush          7
		//   47   73:lushr           
		//   48   74:lstore_1        
				} while(true);
		//   49   75:goto            14
			do
			{
				l = zzbuw;
		//   50   78:aload_0         
		//   51   79:getfield        #64  <Field long zzbuw>
		//   52   82:lstore_1        
				if(l < zzbuu)
		//*  53   83:lload_1         
		//*  54   84:aload_0         
		//*  55   85:getfield        #58  <Field long zzbuu>
		//*  56   88:lcmp            
		//*  57   89:ifge            146
				{
					if((l1 & -128L) == 0L)
		//*  58   92:lload_3         
		//*  59   93:ldc2w           #167 <Long -128L>
		//*  60   96:land            
		//*  61   97:lconst_0        
		//*  62   98:lcmp            
		//*  63   99:ifne            117
					{
						zzbuw = 1L + l;
		//   64  102:aload_0         
		//   65  103:lconst_1        
		//   66  104:lload_1         
		//   67  105:ladd            
		//   68  106:putfield        #64  <Field long zzbuw>
						zzxj.zza(l, (byte)(int)l1);
		//   69  109:lload_1         
		//   70  110:lload_3         
		//   71  111:l2i             
		//   72  112:int2byte        
		//   73  113:invokestatic    #171 <Method void zzxj.zza(long, byte)>
						return;
		//   74  116:return          
					}
					zzbuw = l + 1L;
		//   75  117:aload_0         
		//   76  118:lload_1         
		//   77  119:lconst_1        
		//   78  120:ladd            
		//   79  121:putfield        #64  <Field long zzbuw>
					zzxj.zza(l, (byte)((int)l1 & 0x7f | 0x80));
		//   80  124:lload_1         
		//   81  125:lload_3         
		//   82  126:l2i             
		//   83  127:bipush          127
		//   84  129:iand            
		//   85  130:sipush          128
		//   86  133:ior             
		//   87  134:int2byte        
		//   88  135:invokestatic    #171 <Method void zzxj.zza(long, byte)>
					l1 >>>= 7;
		//   89  138:lload_3         
		//   90  139:bipush          7
		//   91  141:lushr           
		//   92  142:lstore_3        
				} else
		//*  93  143:goto            78
				{
					throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Long.valueOf(l), Long.valueOf(zzbuu), Integer.valueOf(1)
					}));
		//   94  146:new             #89  <Class zztv$zzc>
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
		//  107  166:getfield        #58  <Field long zzbuu>
		//  108  169:invokestatic    #99  <Method Long Long.valueOf(long)>
		//  109  172:aastore         
		//  110  173:dup             
		//  111  174:iconst_2        
		//  112  175:iconst_1        
		//  113  176:invokestatic    #104 <Method Integer Integer.valueOf(int)>
		//  114  179:aastore         
		//  115  180:invokestatic    #110 <Method String String.format(String, Object[])>
		//  116  183:invokespecial   #111 <Method void zztv$zzc(String)>
		//  117  186:athrow          
				}
			} while(true);
		}

		public final void zzav(long l)
			throws IOException
		{
			zzbur.putLong((int)(zzbuw - zzbus), l);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer zzbur>
		//    2    4:aload_0         
		//    3    5:getfield        #64  <Field long zzbuw>
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field long zzbus>
		//    6   12:lsub            
		//    7   13:l2i             
		//    8   14:lload_1         
		//    9   15:invokevirtual   #176 <Method ByteBuffer ByteBuffer.putLong(int, long)>
		//   10   18:pop             
			zzbuw = zzbuw + 8L;
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:getfield        #64  <Field long zzbuw>
		//   14   24:ldc2w           #177 <Long 8L>
		//   15   27:ladd            
		//   16   28:putfield        #64  <Field long zzbuw>
		//   17   31:return          
		}

		public final void zzaz(int i)
			throws IOException
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				((zztv)this).zzba(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #141 <Method void zztv.zzba(int)>
				return;
		//    5    9:return          
			} else
			{
				((zztv)this).zzat(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #120 <Method void zztv.zzat(long)>
				return;
		//   10   16:return          
			}
		}

		public final void zzb(int i, zzte zzte1)
			throws IOException
		{
			((zztv)this).zzc(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zze(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #181 <Method void zztv.zze(int, int)>
			((zztv)this).zza(3, zzte1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #183 <Method void zztv.zza(int, zzte)>
			((zztv)this).zzc(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #117 <Method void zztv.zzc(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzc(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zze(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #181 <Method void zztv.zze(int, int)>
			((zztv)this).zza(3, zzvv1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #185 <Method void zztv.zza(int, zzvv)>
			((zztv)this).zzc(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #117 <Method void zztv.zzc(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, String s)
			throws IOException
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zzgb(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #189 <Method void zztv.zzgb(String)>
		//    7   11:return          
		}

		public final void zzb(int i, boolean flag)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zzc((byte)flag);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:int2byte        
		//    7    9:invokevirtual   #193 <Method void zztv.zzc(byte)>
		//    8   12:return          
		}

		public final void zzb(zzvv zzvv1)
			throws IOException
		{
			((zztv)this).zzba(zzvv1.zzvx());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #198 <Method int zzvv.zzvx()>
		//    3    7:invokevirtual   #141 <Method void zztv.zzba(int)>
			zzvv1.zzb(((zztv) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #201 <Method void zzvv.zzb(zztv)>
		//    7   17:return          
		}

		public final void zzba(int i)
			throws IOException
		{
			int j = i;
		//    0    0:iload_1         
		//    1    1:istore_2        
			if(zzbuw <= zzbuv)
		//*   2    2:aload_0         
		//*   3    3:getfield        #64  <Field long zzbuw>
		//*   4    6:aload_0         
		//*   5    7:getfield        #62  <Field long zzbuv>
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
						long l = zzbuw;
		//   12   21:aload_0         
		//   13   22:getfield        #64  <Field long zzbuw>
		//   14   25:lstore_3        
						zzbuw = 1L + l;
		//   15   26:aload_0         
		//   16   27:lconst_1        
		//   17   28:lload_3         
		//   18   29:ladd            
		//   19   30:putfield        #64  <Field long zzbuw>
						zzxj.zza(l, (byte)i);
		//   20   33:lload_3         
		//   21   34:iload_1         
		//   22   35:int2byte        
		//   23   36:invokestatic    #171 <Method void zzxj.zza(long, byte)>
						return;
		//   24   39:return          
					}
					long l1 = zzbuw;
		//   25   40:aload_0         
		//   26   41:getfield        #64  <Field long zzbuw>
		//   27   44:lstore_3        
					zzbuw = l1 + 1L;
		//   28   45:aload_0         
		//   29   46:lload_3         
		//   30   47:lconst_1        
		//   31   48:ladd            
		//   32   49:putfield        #64  <Field long zzbuw>
					zzxj.zza(l1, (byte)(i & 0x7f | 0x80));
		//   33   52:lload_3         
		//   34   53:iload_1         
		//   35   54:bipush          127
		//   36   56:iand            
		//   37   57:sipush          128
		//   38   60:ior             
		//   39   61:int2byte        
		//   40   62:invokestatic    #171 <Method void zzxj.zza(long, byte)>
					i >>>= 7;
		//   41   65:iload_1         
		//   42   66:bipush          7
		//   43   68:iushr           
		//   44   69:istore_1        
				} while(true);
		//   45   70:goto            14
			do
			{
				long l2 = zzbuw;
		//   46   73:aload_0         
		//   47   74:getfield        #64  <Field long zzbuw>
		//   48   77:lstore_3        
				if(l2 < zzbuu)
		//*  49   78:lload_3         
		//*  50   79:aload_0         
		//*  51   80:getfield        #58  <Field long zzbuu>
		//*  52   83:lcmp            
		//*  53   84:ifge            136
				{
					if((j & 0xffffff80) == 0)
		//*  54   87:iload_2         
		//*  55   88:bipush          -128
		//*  56   90:iand            
		//*  57   91:ifne            108
					{
						zzbuw = 1L + l2;
		//   58   94:aload_0         
		//   59   95:lconst_1        
		//   60   96:lload_3         
		//   61   97:ladd            
		//   62   98:putfield        #64  <Field long zzbuw>
						zzxj.zza(l2, (byte)j);
		//   63  101:lload_3         
		//   64  102:iload_2         
		//   65  103:int2byte        
		//   66  104:invokestatic    #171 <Method void zzxj.zza(long, byte)>
						return;
		//   67  107:return          
					}
					zzbuw = l2 + 1L;
		//   68  108:aload_0         
		//   69  109:lload_3         
		//   70  110:lconst_1        
		//   71  111:ladd            
		//   72  112:putfield        #64  <Field long zzbuw>
					zzxj.zza(l2, (byte)(j & 0x7f | 0x80));
		//   73  115:lload_3         
		//   74  116:iload_2         
		//   75  117:bipush          127
		//   76  119:iand            
		//   77  120:sipush          128
		//   78  123:ior             
		//   79  124:int2byte        
		//   80  125:invokestatic    #171 <Method void zzxj.zza(long, byte)>
					j >>>= 7;
		//   81  128:iload_2         
		//   82  129:bipush          7
		//   83  131:iushr           
		//   84  132:istore_2        
				} else
		//*  85  133:goto            73
				{
					throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Long.valueOf(l2), Long.valueOf(zzbuu), Integer.valueOf(1)
					}));
		//   86  136:new             #89  <Class zztv$zzc>
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
		//   99  156:getfield        #58  <Field long zzbuu>
		//  100  159:invokestatic    #99  <Method Long Long.valueOf(long)>
		//  101  162:aastore         
		//  102  163:dup             
		//  103  164:iconst_2        
		//  104  165:iconst_1        
		//  105  166:invokestatic    #104 <Method Integer Integer.valueOf(int)>
		//  106  169:aastore         
		//  107  170:invokestatic    #110 <Method String String.format(String, Object[])>
		//  108  173:invokespecial   #111 <Method void zztv$zzc(String)>
		//  109  176:athrow          
				}
			} while(true);
		}

		public final void zzbc(int i)
			throws IOException
		{
			zzbur.putInt((int)(zzbuw - zzbus), i);
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field ByteBuffer zzbur>
		//    2    4:aload_0         
		//    3    5:getfield        #64  <Field long zzbuw>
		//    4    8:aload_0         
		//    5    9:getfield        #47  <Field long zzbus>
		//    6   12:lsub            
		//    7   13:l2i             
		//    8   14:iload_1         
		//    9   15:invokevirtual   #205 <Method ByteBuffer ByteBuffer.putInt(int, int)>
		//   10   18:pop             
			zzbuw = zzbuw + 4L;
		//   11   19:aload_0         
		//   12   20:aload_0         
		//   13   21:getfield        #64  <Field long zzbuw>
		//   14   24:ldc2w           #206 <Long 4L>
		//   15   27:ladd            
		//   16   28:putfield        #64  <Field long zzbuw>
		//   17   31:return          
		}

		public final void zzc(byte byte0)
			throws IOException
		{
			long l = zzbuw;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field long zzbuw>
		//    2    4:lstore_2        
			if(l < zzbuu)
		//*   3    5:lload_2         
		//*   4    6:aload_0         
		//*   5    7:getfield        #58  <Field long zzbuu>
		//*   6   10:lcmp            
		//*   7   11:ifge            27
			{
				zzbuw = 1L + l;
		//    8   14:aload_0         
		//    9   15:lconst_1        
		//   10   16:lload_2         
		//   11   17:ladd            
		//   12   18:putfield        #64  <Field long zzbuw>
				zzxj.zza(l, byte0);
		//   13   21:lload_2         
		//   14   22:iload_1         
		//   15   23:invokestatic    #171 <Method void zzxj.zza(long, byte)>
				return;
		//   16   26:return          
			} else
			{
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
					Long.valueOf(l), Long.valueOf(zzbuu), Integer.valueOf(1)
				}));
		//   17   27:new             #89  <Class zztv$zzc>
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
		//   30   47:getfield        #58  <Field long zzbuu>
		//   31   50:invokestatic    #99  <Method Long Long.valueOf(long)>
		//   32   53:aastore         
		//   33   54:dup             
		//   34   55:iconst_2        
		//   35   56:iconst_1        
		//   36   57:invokestatic    #104 <Method Integer Integer.valueOf(int)>
		//   37   60:aastore         
		//   38   61:invokestatic    #110 <Method String String.format(String, Object[])>
		//   39   64:invokespecial   #111 <Method void zztv$zzc(String)>
		//   40   67:athrow          
			}
		}

		public final void zzc(int i, int j)
			throws IOException
		{
			((zztv)this).zzba(i << 3 | j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_3        
		//    3    3:ishl            
		//    4    4:iload_2         
		//    5    5:ior             
		//    6    6:invokevirtual   #141 <Method void zztv.zzba(int)>
		//    7    9:return          
		}

		public final void zzc(int i, long l)
			throws IOException
		{
			((zztv)this).zzc(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zzav(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #209 <Method void zztv.zzav(long)>
		//    7   11:return          
		}

		public final void zzd(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zzaz(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #212 <Method void zztv.zzaz(int)>
		//    7   11:return          
		}

		public final void zze(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zzba(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #141 <Method void zztv.zzba(int)>
		//    7   11:return          
		}

		public final void zze(byte abyte0[], int i, int j)
			throws IOException
		{
			((zztv)this).zzba(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #141 <Method void zztv.zzba(int)>
			((zztv)this).write(abyte0, 0, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_0        
		//    6    8:iload_3         
		//    7    9:invokevirtual   #166 <Method void zztv.write(byte[], int, int)>
		//    8   12:return          
		}

		public final void zzg(int i, int j)
			throws IOException
		{
			((zztv)this).zzc(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #117 <Method void zztv.zzc(int, int)>
			((zztv)this).zzbc(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #215 <Method void zztv.zzbc(int)>
		//    7   11:return          
		}

		public final void zzgb(String s)
			throws IOException
		{
			long l = zzbuw;
		//    0    0:aload_0         
		//    1    1:getfield        #64  <Field long zzbuw>
		//    2    4:lstore          4
			int i;
			int j;
			try
			{
				i = zzbf(s.length() * 3);
		//    3    6:aload_1         
		//    4    7:invokevirtual   #224 <Method int String.length()>
		//    5   10:iconst_3        
		//    6   11:imul            
		//    7   12:invokestatic    #228 <Method int zzbf(int)>
		//    8   15:istore_2        
				j = zzbf(s.length());
		//    9   16:aload_1         
		//   10   17:invokevirtual   #224 <Method int String.length()>
		//   11   20:invokestatic    #228 <Method int zzbf(int)>
		//   12   23:istore_3        
			}
		//*  13   24:iload_3         
		//*  14   25:iload_2         
		//*  15   26:icmpne          86
		//*  16   29:aload_0         
		//*  17   30:getfield        #64  <Field long zzbuw>
		//*  18   33:aload_0         
		//*  19   34:getfield        #47  <Field long zzbus>
		//*  20   37:lsub            
		//*  21   38:l2i             
		//*  22   39:iload_3         
		//*  23   40:iadd            
		//*  24   41:istore_2        
		//*  25   42:aload_0         
		//*  26   43:getfield        #39  <Field ByteBuffer zzbur>
		//*  27   46:iload_2         
		//*  28   47:invokevirtual   #70  <Method java.nio.Buffer ByteBuffer.position(int)>
		//*  29   50:pop             
		//*  30   51:aload_1         
		//*  31   52:aload_0         
		//*  32   53:getfield        #39  <Field ByteBuffer zzbur>
		//*  33   56:invokestatic    #233 <Method void zzxl.zza(CharSequence, ByteBuffer)>
		//*  34   59:aload_0         
		//*  35   60:getfield        #39  <Field ByteBuffer zzbur>
		//*  36   63:invokevirtual   #51  <Method int ByteBuffer.position()>
		//*  37   66:iload_2         
		//*  38   67:isub            
		//*  39   68:istore_2        
		//*  40   69:aload_0         
		//*  41   70:iload_2         
		//*  42   71:invokevirtual   #141 <Method void zztv.zzba(int)>
		//*  43   74:aload_0         
		//*  44   75:aload_0         
		//*  45   76:getfield        #64  <Field long zzbuw>
		//*  46   79:iload_2         
		//*  47   80:i2l             
		//*  48   81:ladd            
		//*  49   82:putfield        #64  <Field long zzbuw>
		//*  50   85:return          
		//*  51   86:aload_1         
		//*  52   87:invokestatic    #236 <Method int zzxl.zza(CharSequence)>
		//*  53   90:istore_2        
		//*  54   91:aload_0         
		//*  55   92:iload_2         
		//*  56   93:invokevirtual   #141 <Method void zztv.zzba(int)>
		//*  57   96:aload_0         
		//*  58   97:aload_0         
		//*  59   98:getfield        #64  <Field long zzbuw>
		//*  60  101:invokespecial   #238 <Method void zzbc(long)>
		//*  61  104:aload_1         
		//*  62  105:aload_0         
		//*  63  106:getfield        #39  <Field ByteBuffer zzbur>
		//*  64  109:invokestatic    #233 <Method void zzxl.zza(CharSequence, ByteBuffer)>
		//*  65  112:aload_0         
		//*  66  113:aload_0         
		//*  67  114:getfield        #64  <Field long zzbuw>
		//*  68  117:iload_2         
		//*  69  118:i2l             
		//*  70  119:ladd            
		//*  71  120:putfield        #64  <Field long zzbuw>
		//*  72  123:return          
		//*  73  124:astore_1        
		//*  74  125:new             #89  <Class zztv$zzc>
		//*  75  128:dup             
		//*  76  129:aload_1         
		//*  77  130:invokespecial   #241 <Method void zztv$zzc(Throwable)>
		//*  78  133:athrow          
		//*  79  134:astore_1        
		//*  80  135:new             #89  <Class zztv$zzc>
		//*  81  138:dup             
		//*  82  139:aload_1         
		//*  83  140:invokespecial   #241 <Method void zztv$zzc(Throwable)>
		//*  84  143:athrow          
			catch(zzxp zzxp1)
		//*  85  144:astore          6
			{
				zzbuw = l;
		//   86  146:aload_0         
		//   87  147:lload           4
		//   88  149:putfield        #64  <Field long zzbuw>
				zzbc(zzbuw);
		//   89  152:aload_0         
		//   90  153:aload_0         
		//   91  154:getfield        #64  <Field long zzbuw>
		//   92  157:invokespecial   #238 <Method void zzbc(long)>
				((zztv)this).zza(s, zzxp1);
		//   93  160:aload_0         
		//   94  161:aload_1         
		//   95  162:aload           6
		//   96  164:invokevirtual   #244 <Method void zztv.zza(String, zzxp)>
				return;
		//   97  167:return          
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new zzc(((Throwable) (s)));
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new zzc(((Throwable) (s)));
			}
			if(j != i)
				break MISSING_BLOCK_LABEL_86;
			i = (int)(zzbuw - zzbus) + j;
			zzbur.position(i);
			zzxl.zza(((CharSequence) (s)), zzbur);
			i = zzbur.position() - i;
			((zztv)this).zzba(i);
			zzbuw = zzbuw + (long)i;
			return;
			i = zzxl.zza(((CharSequence) (s)));
			((zztv)this).zzba(i);
			zzbc(zzbuw);
			zzxl.zza(((CharSequence) (s)), zzbur);
			zzbuw = zzbuw + (long)i;
			return;
		}

		public final int zzvj()
		{
			return (int)(zzbuu - zzbuw);
		//    0    0:aload_0         
		//    1    1:getfield        #58  <Field long zzbuu>
		//    2    4:aload_0         
		//    3    5:getfield        #64  <Field long zzbuw>
		//    4    8:lsub            
		//    5    9:l2i             
		//    6   10:ireturn         
		}

		private final ByteBuffer zzbuq;
		private final ByteBuffer zzbur;
		private final long zzbus;
		private final long zzbut;
		private final long zzbuu;
		private final long zzbuv;
		private long zzbuw;

		zze(ByteBuffer bytebuffer)
		{
			super(((zztw) (null)));
		//    0    0:aload_0         
		//    1    1:aconst_null     
		//    2    2:invokespecial   #19  <Method void zztv(zztw)>
			zzbuq = bytebuffer;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #21  <Field ByteBuffer zzbuq>
			zzbur = bytebuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #27  <Method ByteBuffer ByteBuffer.duplicate()>
		//    9   15:getstatic       #33  <Field ByteOrder ByteOrder.LITTLE_ENDIAN>
		//   10   18:invokevirtual   #37  <Method ByteBuffer ByteBuffer.order(ByteOrder)>
		//   11   21:putfield        #39  <Field ByteBuffer zzbur>
			zzbus = zzxj.zzb(bytebuffer);
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:invokestatic    #45  <Method long zzxj.zzb(ByteBuffer)>
		//   15   29:putfield        #47  <Field long zzbus>
			zzbut = zzbus + (long)bytebuffer.position();
		//   16   32:aload_0         
		//   17   33:aload_0         
		//   18   34:getfield        #47  <Field long zzbus>
		//   19   37:aload_1         
		//   20   38:invokevirtual   #51  <Method int ByteBuffer.position()>
		//   21   41:i2l             
		//   22   42:ladd            
		//   23   43:putfield        #53  <Field long zzbut>
			zzbuu = zzbus + (long)bytebuffer.limit();
		//   24   46:aload_0         
		//   25   47:aload_0         
		//   26   48:getfield        #47  <Field long zzbus>
		//   27   51:aload_1         
		//   28   52:invokevirtual   #56  <Method int ByteBuffer.limit()>
		//   29   55:i2l             
		//   30   56:ladd            
		//   31   57:putfield        #58  <Field long zzbuu>
			zzbuv = zzbuu - 10L;
		//   32   60:aload_0         
		//   33   61:aload_0         
		//   34   62:getfield        #58  <Field long zzbuu>
		//   35   65:ldc2w           #59  <Long 10L>
		//   36   68:lsub            
		//   37   69:putfield        #62  <Field long zzbuv>
			zzbuw = zzbut;
		//   38   72:aload_0         
		//   39   73:aload_0         
		//   40   74:getfield        #53  <Field long zzbut>
		//   41   77:putfield        #64  <Field long zzbuw>
		//   42   80:return          
		}
	}


	private zztv()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void zztd()>
	//    2    4:return          
	}

	zztv(zztw zztw)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void zztv()>
	//    2    4:return          
	}

	public static int zza(int i, zzvc zzvc1)
	{
		i = zzbd(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:istore_0        
		int j = zzvc1.zzvx();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #66  <Method int zzvc.zzvx()>
	//    5    9:istore_2        
		return i + (zzbf(j) + j);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #69  <Method int zzbf(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zza(zzvc zzvc1)
	{
		int i = zzvc1.zzvx();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #66  <Method int zzvc.zzvx()>
	//    2    4:istore_1        
		return zzbf(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #69  <Method int zzbf(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	public static zztv zza(ByteBuffer bytebuffer)
	{
		if(bytebuffer.hasArray())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #76  <Method boolean ByteBuffer.hasArray()>
	//*   2    4:ifeq            16
			return ((zztv) (new zzb(bytebuffer)));
	//    3    7:new             #9   <Class zztv$zzb>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:invokespecial   #79  <Method void zztv$zzb(ByteBuffer)>
	//    7   15:areturn         
		if(bytebuffer.isDirect() && !bytebuffer.isReadOnly())
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #82  <Method boolean ByteBuffer.isDirect()>
	//*  10   20:ifeq            54
	//*  11   23:aload_0         
	//*  12   24:invokevirtual   #85  <Method boolean ByteBuffer.isReadOnly()>
	//*  13   27:ifne            54
		{
			if(zzxj.zzyp())
	//*  14   30:invokestatic    #88  <Method boolean zzxj.zzyp()>
	//*  15   33:ifeq            45
				return ((zztv) (new zze(bytebuffer)));
	//   16   36:new             #18  <Class zztv$zze>
	//   17   39:dup             
	//   18   40:aload_0         
	//   19   41:invokespecial   #89  <Method void zztv$zze(ByteBuffer)>
	//   20   44:areturn         
			else
				return ((zztv) (new zzd(bytebuffer)));
	//   21   45:new             #15  <Class zztv$zzd>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:invokespecial   #90  <Method void zztv$zzd(ByteBuffer)>
	//   25   53:areturn         
		} else
		{
			throw new IllegalArgumentException("ByteBuffer is read-only");
	//   26   54:new             #92  <Class IllegalArgumentException>
	//   27   57:dup             
	//   28   58:ldc1            #94  <String "ByteBuffer is read-only">
	//   29   60:invokespecial   #97  <Method void IllegalArgumentException(String)>
	//   30   63:athrow          
		}
	}

	public static int zzaw(long l)
	{
		return zzax(l);
	//    0    0:lload_0         
	//    1    1:invokestatic    #102 <Method int zzax(long)>
	//    2    4:ireturn         
	}

	public static int zzax(long l)
	{
		if((-128L & l) == 0L)
	//*   0    0:ldc2w           #103 <Long -128L>
	//*   1    3:lload_0         
	//*   2    4:land            
	//*   3    5:lconst_0        
	//*   4    6:lcmp            
	//*   5    7:ifne            12
			return 1;
	//    6   10:iconst_1        
	//    7   11:ireturn         
		if(l < 0L)
	//*   8   12:lload_0         
	//*   9   13:lconst_0        
	//*  10   14:lcmp            
	//*  11   15:ifge            21
			return 10;
	//   12   18:bipush          10
	//   13   20:ireturn         
		int j;
		if((0x0L & l) != 0L)
	//*  14   21:ldc2w           #105 <Long 0x0L>
	//*  15   24:lload_0         
	//*  16   25:land            
	//*  17   26:lconst_0        
	//*  18   27:lcmp            
	//*  19   28:ifeq            42
		{
			j = 6;
	//   20   31:bipush          6
	//   21   33:istore_3        
			l >>>= 28;
	//   22   34:lload_0         
	//   23   35:bipush          28
	//   24   37:lushr           
	//   25   38:lstore_0        
		} else
	//*  26   39:goto            44
		{
			j = 2;
	//   27   42:iconst_2        
	//   28   43:istore_3        
		}
		int i = j;
	//   29   44:iload_3         
	//   30   45:istore_2        
		long l1 = l;
	//   31   46:lload_0         
	//   32   47:lstore          4
		if((0xffe00000L & l) != 0L)
	//*  33   49:ldc2w           #107 <Long 0xffe00000L>
	//*  34   52:lload_0         
	//*  35   53:land            
	//*  36   54:lconst_0        
	//*  37   55:lcmp            
	//*  38   56:ifeq            69
		{
			i = j + 2;
	//   39   59:iload_3         
	//   40   60:iconst_2        
	//   41   61:iadd            
	//   42   62:istore_2        
			l1 = l >>> 14;
	//   43   63:lload_0         
	//   44   64:bipush          14
	//   45   66:lushr           
	//   46   67:lstore          4
		}
		j = i;
	//   47   69:iload_2         
	//   48   70:istore_3        
		if((l1 & -16384L) != 0L)
	//*  49   71:lload           4
	//*  50   73:ldc2w           #109 <Long -16384L>
	//*  51   76:land            
	//*  52   77:lconst_0        
	//*  53   78:lcmp            
	//*  54   79:ifeq            86
			j = i + 1;
	//   55   82:iload_2         
	//   56   83:iconst_1        
	//   57   84:iadd            
	//   58   85:istore_3        
		return j;
	//   59   86:iload_3         
	//   60   87:ireturn         
	}

	public static int zzay(long l)
	{
		return zzax(zzbb(l));
	//    0    0:lload_0         
	//    1    1:invokestatic    #115 <Method long zzbb(long)>
	//    2    4:invokestatic    #102 <Method int zzax(long)>
	//    3    7:ireturn         
	}

	public static int zzaz(long l)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int zzb(float f)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int zzb(int i, double d)
	{
		return zzbd(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzb(int i, float f)
	{
		return zzbd(i) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzb(int i, zzvc zzvc1)
	{
		return (zzbd(1) << 1) + zzi(2, i) + zza(3, zzvc1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #123 <Method int zzi(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #125 <Method int zza(int, zzvc)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	static int zzb(int i, zzvv zzvv1, zzwl zzwl1)
	{
		return zzbd(i) + zzb(zzvv1, zzwl1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #129 <Method int zzb(zzvv, zzwl)>
	//    5    9:iadd            
	//    6   10:ireturn         
	}

	public static int zzb(zzte zzte1)
	{
		int i = zzte1.size();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #135 <Method int zzte.size()>
	//    2    4:istore_1        
		return zzbf(i) + i;
	//    3    5:iload_1         
	//    4    6:invokestatic    #69  <Method int zzbf(int)>
	//    5    9:iload_1         
	//    6   10:iadd            
	//    7   11:ireturn         
	}

	static int zzb(zzvv zzvv1, zzwl zzwl1)
	{
		zzvv1 = ((zzvv) ((zzsx)zzvv1));
	//    0    0:aload_0         
	//    1    1:checkcast       #137 <Class zzsx>
	//    2    4:astore_0        
		int j = ((zzsx) (zzvv1)).zztx();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #140 <Method int zzsx.zztx()>
	//    5    9:istore_3        
		int i = j;
	//    6   10:iload_3         
	//    7   11:istore_2        
		if(j == -1)
	//*   8   12:iload_3         
	//*   9   13:iconst_m1       
	//*  10   14:icmpne          30
		{
			i = zzwl1.zzai(((Object) (zzvv1)));
	//   11   17:aload_1         
	//   12   18:aload_0         
	//   13   19:invokeinterface #146 <Method int zzwl.zzai(Object)>
	//   14   24:istore_2        
			((zzsx) (zzvv1)).zzai(i);
	//   15   25:aload_0         
	//   16   26:iload_2         
	//   17   27:invokevirtual   #149 <Method void zzsx.zzai(int)>
		}
		return zzbf(i) + i;
	//   18   30:iload_2         
	//   19   31:invokestatic    #69  <Method int zzbf(int)>
	//   20   34:iload_2         
	//   21   35:iadd            
	//   22   36:ireturn         
	}

	public static int zzba(long l)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	private static long zzbb(long l)
	{
		return l >> 63 ^ l << 1;
	//    0    0:lload_0         
	//    1    1:bipush          63
	//    2    3:lshr            
	//    3    4:lload_0         
	//    4    5:iconst_1        
	//    5    6:lshl            
	//    6    7:lxor            
	//    7    8:lreturn         
	}

	public static int zzbd(int i)
	{
		return zzbf(i << 3);
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:ishl            
	//    3    3:invokestatic    #69  <Method int zzbf(int)>
	//    4    6:ireturn         
	}

	public static int zzbe(int i)
	{
		if(i >= 0)
	//*   0    0:iload_0         
	//*   1    1:iflt            9
			return zzbf(i);
	//    2    4:iload_0         
	//    3    5:invokestatic    #69  <Method int zzbf(int)>
	//    4    8:ireturn         
		else
			return 10;
	//    5    9:bipush          10
	//    6   11:ireturn         
	}

	public static int zzbf(int i)
	{
		if((i & 0xffffff80) == 0)
	//*   0    0:iload_0         
	//*   1    1:bipush          -128
	//*   2    3:iand            
	//*   3    4:ifne            9
			return 1;
	//    4    7:iconst_1        
	//    5    8:ireturn         
		if((i & 0xffffc000) == 0)
	//*   6    9:iload_0         
	//*   7   10:sipush          -16384
	//*   8   13:iand            
	//*   9   14:ifne            19
			return 2;
	//   10   17:iconst_2        
	//   11   18:ireturn         
		if((0xffe00000 & i) == 0)
	//*  12   19:ldc1            #152 <Int 0xffe00000>
	//*  13   21:iload_0         
	//*  14   22:iand            
	//*  15   23:ifne            28
			return 3;
	//   16   26:iconst_3        
	//   17   27:ireturn         
		return (i & 0xf0000000) != 0 ? 5 : 4;
	//   18   28:iload_0         
	//   19   29:ldc1            #153 <Int 0xf0000000>
	//   20   31:iand            
	//   21   32:ifne            37
	//   22   35:iconst_4        
	//   23   36:ireturn         
	//   24   37:iconst_5        
	//   25   38:ireturn         
	}

	public static int zzbg(int i)
	{
		return zzbf(zzbk(i));
	//    0    0:iload_0         
	//    1    1:invokestatic    #157 <Method int zzbk(int)>
	//    2    4:invokestatic    #69  <Method int zzbf(int)>
	//    3    7:ireturn         
	}

	public static int zzbh(int i)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int zzbi(int i)
	{
		return 4;
	//    0    0:iconst_4        
	//    1    1:ireturn         
	}

	public static int zzbj(int i)
	{
		return zzbe(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #162 <Method int zzbe(int)>
	//    2    4:ireturn         
	}

	private static int zzbk(int i)
	{
		return i >> 31 ^ i << 1;
	//    0    0:iload_0         
	//    1    1:bipush          31
	//    2    3:ishr            
	//    3    4:iload_0         
	//    4    5:iconst_1        
	//    5    6:ishl            
	//    6    7:ixor            
	//    7    8:ireturn         
	}

	public static int zzbl(int i)
	{
		return zzbf(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #69  <Method int zzbf(int)>
	//    2    4:ireturn         
	}

	public static int zzc(double d)
	{
		return 8;
	//    0    0:bipush          8
	//    1    2:ireturn         
	}

	public static int zzc(int i, zzte zzte1)
	{
		i = zzbd(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:istore_0        
		int j = zzte1.size();
	//    3    5:aload_1         
	//    4    6:invokevirtual   #135 <Method int zzte.size()>
	//    5    9:istore_2        
		return i + (zzbf(j) + j);
	//    6   10:iload_0         
	//    7   11:iload_2         
	//    8   12:invokestatic    #69  <Method int zzbf(int)>
	//    9   15:iload_2         
	//   10   16:iadd            
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzc(int i, zzvv zzvv1)
	{
		return zzbd(i) + zzc(zzvv1);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #171 <Method int zzc(zzvv)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	static int zzc(int i, zzvv zzvv1, zzwl zzwl1)
	{
		int k = zzbd(i);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:istore          4
		zzvv1 = ((zzvv) ((zzsx)zzvv1));
	//    3    6:aload_1         
	//    4    7:checkcast       #137 <Class zzsx>
	//    5   10:astore_1        
		int j = ((zzsx) (zzvv1)).zztx();
	//    6   11:aload_1         
	//    7   12:invokevirtual   #140 <Method int zzsx.zztx()>
	//    8   15:istore_3        
		i = j;
	//    9   16:iload_3         
	//   10   17:istore_0        
		if(j == -1)
	//*  11   18:iload_3         
	//*  12   19:iconst_m1       
	//*  13   20:icmpne          36
		{
			i = zzwl1.zzai(((Object) (zzvv1)));
	//   14   23:aload_2         
	//   15   24:aload_1         
	//   16   25:invokeinterface #146 <Method int zzwl.zzai(Object)>
	//   17   30:istore_0        
			((zzsx) (zzvv1)).zzai(i);
	//   18   31:aload_1         
	//   19   32:iload_0         
	//   20   33:invokevirtual   #149 <Method void zzsx.zzai(int)>
		}
		return (k << 1) + i;
	//   21   36:iload           4
	//   22   38:iconst_1        
	//   23   39:ishl            
	//   24   40:iload_0         
	//   25   41:iadd            
	//   26   42:ireturn         
	}

	public static int zzc(int i, String s)
	{
		return zzbd(i) + zzgc(s);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:aload_1         
	//    3    5:invokestatic    #176 <Method int zzgc(String)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzc(int i, boolean flag)
	{
		return zzbd(i) + 1;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iconst_1        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzc(zzvv zzvv1)
	{
		int i = zzvv1.zzvx();
	//    0    0:aload_0         
	//    1    1:invokeinterface #180 <Method int zzvv.zzvx()>
	//    2    6:istore_1        
		return zzbf(i) + i;
	//    3    7:iload_1         
	//    4    8:invokestatic    #69  <Method int zzbf(int)>
	//    5   11:iload_1         
	//    6   12:iadd            
	//    7   13:ireturn         
	}

	public static int zzd(int i, long l)
	{
		return zzbd(i) + zzax(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #102 <Method int zzax(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzd(int i, zzte zzte1)
	{
		return (zzbd(1) << 1) + zzi(2, i) + zzc(3, zzte1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #123 <Method int zzi(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #183 <Method int zzc(int, zzte)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzd(int i, zzvv zzvv1)
	{
		return (zzbd(1) << 1) + zzi(2, i) + zzc(3, zzvv1);
	//    0    0:iconst_1        
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iconst_1        
	//    3    5:ishl            
	//    4    6:iconst_2        
	//    5    7:iload_0         
	//    6    8:invokestatic    #123 <Method int zzi(int, int)>
	//    7   11:iadd            
	//    8   12:iconst_3        
	//    9   13:aload_1         
	//   10   14:invokestatic    #185 <Method int zzc(int, zzvv)>
	//   11   17:iadd            
	//   12   18:ireturn         
	}

	public static int zzd(zzvv zzvv1)
	{
		return zzvv1.zzvx();
	//    0    0:aload_0         
	//    1    1:invokeinterface #180 <Method int zzvv.zzvx()>
	//    2    6:ireturn         
	}

	public static int zze(int i, long l)
	{
		return zzbd(i) + zzax(l);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #102 <Method int zzax(long)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzf(int i, long l)
	{
		return zzbd(i) + zzax(zzbb(l));
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:lload_1         
	//    3    5:invokestatic    #115 <Method long zzbb(long)>
	//    4    8:invokestatic    #102 <Method int zzax(long)>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public static int zzg(int i, long l)
	{
		return zzbd(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzgc(String s)
	{
		zzxp zzxp1;
		int i;
		try
		{
			i = zzxl.zza(((CharSequence) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #194 <Method int zzxl.zza(CharSequence)>
	//    2    4:istore_1        
		}
	//*   3    5:goto            17
	//*   4    8:aload_0         
	//*   5    9:getstatic       #200 <Field java.nio.charset.Charset zzuq.UTF_8>
	//*   6   12:invokevirtual   #206 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//*   7   15:arraylength     
	//*   8   16:istore_1        
	//*   9   17:iload_1         
	//*  10   18:invokestatic    #69  <Method int zzbf(int)>
	//*  11   21:iload_1         
	//*  12   22:iadd            
	//*  13   23:ireturn         
		// Misplaced declaration of an exception variable
		catch(zzxp zzxp1)
		{
			i = s.getBytes(zzuq.UTF_8).length;
		}
		return zzbf(i) + i;
	//*  14   24:astore_2        
	//*  15   25:goto            8
	}

	public static int zzh(int i, int j)
	{
		return zzbd(i) + zzbe(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #162 <Method int zzbe(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzh(int i, long l)
	{
		return zzbd(i) + 8;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:bipush          8
	//    3    6:iadd            
	//    4    7:ireturn         
	}

	public static int zzi(int i, int j)
	{
		return zzbd(i) + zzbf(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #69  <Method int zzbf(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzj(int i, int j)
	{
		return zzbd(i) + zzbf(zzbk(j));
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #157 <Method int zzbk(int)>
	//    4    8:invokestatic    #69  <Method int zzbf(int)>
	//    5   11:iadd            
	//    6   12:ireturn         
	}

	public static zztv zzj(byte abyte0[])
	{
		return ((zztv) (new zza(abyte0, 0, abyte0.length)));
	//    0    0:new             #6   <Class zztv$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:invokespecial   #212 <Method void zztv$zza(byte[], int, int)>
	//    7   11:areturn         
	}

	public static int zzk(int i, int j)
	{
		return zzbd(i) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzk(byte abyte0[])
	{
		int i = abyte0.length;
	//    0    0:aload_0         
	//    1    1:arraylength     
	//    2    2:istore_1        
		return zzbf(i) + i;
	//    3    3:iload_1         
	//    4    4:invokestatic    #69  <Method int zzbf(int)>
	//    5    7:iload_1         
	//    6    8:iadd            
	//    7    9:ireturn         
	}

	public static int zzl(int i, int j)
	{
		return zzbd(i) + 4;
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iconst_4        
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public static int zzm(int i, int j)
	{
		return zzbd(i) + zzbe(j);
	//    0    0:iload_0         
	//    1    1:invokestatic    #60  <Method int zzbd(int)>
	//    2    4:iload_1         
	//    3    5:invokestatic    #162 <Method int zzbe(int)>
	//    4    8:iadd            
	//    5    9:ireturn         
	}

	public static int zzt(boolean flag)
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	static boolean zzvk()
	{
		return zzbum;
	//    0    0:getstatic       #49  <Field boolean zzbum>
	//    1    3:ireturn         
	}

	public abstract void flush()
		throws IOException;

	public abstract void write(byte abyte0[], int i, int j)
		throws IOException;

	public final void zza(float f)
		throws IOException
	{
		zzbc(Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #229 <Method int Float.floatToRawIntBits(float)>
	//    3    5:invokevirtual   #232 <Method void zzbc(int)>
	//    4    8:return          
	}

	public final void zza(int i, double d)
		throws IOException
	{
		zzc(i, Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #240 <Method long Double.doubleToRawLongBits(double)>
	//    4    6:invokevirtual   #243 <Method void zzc(int, long)>
	//    5    9:return          
	}

	public final void zza(int i, float f)
		throws IOException
	{
		zzg(i, Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #229 <Method int Float.floatToRawIntBits(float)>
	//    4    6:invokevirtual   #247 <Method void zzg(int, int)>
	//    5    9:return          
	}

	public abstract void zza(int i, long l)
		throws IOException;

	public abstract void zza(int i, zzte zzte1)
		throws IOException;

	public abstract void zza(int i, zzvv zzvv1)
		throws IOException;

	abstract void zza(int i, zzvv zzvv1, zzwl zzwl1)
		throws IOException;

	public abstract void zza(zzte zzte1)
		throws IOException;

	abstract void zza(zzvv zzvv1, zzwl zzwl1)
		throws IOException;

	final void zza(String s, zzxp zzxp1)
		throws IOException
	{
		logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ((Throwable) (zzxp1)));
	//    0    0:getstatic       #41  <Field Logger logger>
	//    1    3:getstatic       #261 <Field Level Level.WARNING>
	//    2    6:ldc2            #263 <String "com.google.protobuf.CodedOutputStream">
	//    3    9:ldc2            #265 <String "inefficientWriteStringNoTag">
	//    4   12:ldc2            #267 <String "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!">
	//    5   15:aload_2         
	//    6   16:invokevirtual   #271 <Method void Logger.logp(Level, String, String, String, Throwable)>
		s = ((String) (s.getBytes(zzuq.UTF_8)));
	//    7   19:aload_1         
	//    8   20:getstatic       #200 <Field java.nio.charset.Charset zzuq.UTF_8>
	//    9   23:invokevirtual   #206 <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   10   26:astore_1        
		try
		{
			zzba(s.length);
	//   11   27:aload_0         
	//   12   28:aload_1         
	//   13   29:arraylength     
	//   14   30:invokevirtual   #273 <Method void zzba(int)>
			((zztd)this).zza(((byte []) (s)), 0, s.length);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:arraylength     
	//   20   38:invokevirtual   #275 <Method void zztd.zza(byte[], int, int)>
			return;
	//   21   41:return          
		}
	//*  22   42:astore_1        
	//*  23   43:aload_1         
	//*  24   44:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  25   45:astore_1        
		{
			throw new zzc(((Throwable) (s)));
	//   26   46:new             #12  <Class zztv$zzc>
	//   27   49:dup             
	//   28   50:aload_1         
	//   29   51:invokespecial   #278 <Method void zztv$zzc(Throwable)>
	//   30   54:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw s;
		}
	}

	public abstract void zzat(long l)
		throws IOException;

	public final void zzau(long l)
		throws IOException
	{
		zzat(zzbb(l));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #115 <Method long zzbb(long)>
	//    3    5:invokevirtual   #283 <Method void zzat(long)>
	//    4    8:return          
	}

	public abstract void zzav(long l)
		throws IOException;

	public abstract void zzaz(int i)
		throws IOException;

	public final void zzb(double d)
		throws IOException
	{
		zzav(Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #240 <Method long Double.doubleToRawLongBits(double)>
	//    3    5:invokevirtual   #287 <Method void zzav(long)>
	//    4    8:return          
	}

	public final void zzb(int i, long l)
		throws IOException
	{
		zza(i, zzbb(l));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #115 <Method long zzbb(long)>
	//    4    6:invokevirtual   #289 <Method void zza(int, long)>
	//    5    9:return          
	}

	public abstract void zzb(int i, zzte zzte1)
		throws IOException;

	public abstract void zzb(int i, zzvv zzvv1)
		throws IOException;

	public abstract void zzb(int i, String s)
		throws IOException;

	public abstract void zzb(int i, boolean flag)
		throws IOException;

	public abstract void zzb(zzvv zzvv1)
		throws IOException;

	public abstract void zzba(int i)
		throws IOException;

	public final void zzbb(int i)
		throws IOException
	{
		zzba(zzbk(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #157 <Method int zzbk(int)>
	//    3    5:invokevirtual   #273 <Method void zzba(int)>
	//    4    8:return          
	}

	public abstract void zzbc(int i)
		throws IOException;

	public abstract void zzc(byte byte0)
		throws IOException;

	public abstract void zzc(int i, int j)
		throws IOException;

	public abstract void zzc(int i, long l)
		throws IOException;

	public abstract void zzd(int i, int j)
		throws IOException;

	public abstract void zze(int i, int j)
		throws IOException;

	abstract void zze(byte abyte0[], int i, int j)
		throws IOException;

	public final void zzf(int i, int j)
		throws IOException
	{
		zze(i, zzbk(j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #157 <Method int zzbk(int)>
	//    4    6:invokevirtual   #295 <Method void zze(int, int)>
	//    5    9:return          
	}

	public abstract void zzg(int i, int j)
		throws IOException;

	public abstract void zzgb(String s)
		throws IOException;

	public final void zzs(boolean flag)
		throws IOException
	{
		zzc((byte)flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #300 <Method void zzc(byte)>
	//    4    6:return          
	}

	public abstract int zzvj();

	private static final Logger logger = Logger.getLogger(((Class) (com/google/android/gms/internal/measurement/zztv)).getName());
	private static final boolean zzbum = zzxj.zzyo();
	zztx zzbun;

	static 
	{
	//    0    0:ldc1            #2   <Class zztv>
	//    1    2:invokevirtual   #33  <Method String Class.getName()>
	//    2    5:invokestatic    #39  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #41  <Field Logger logger>
	//    4   11:invokestatic    #47  <Method boolean zzxj.zzyo()>
	//    5   14:putstatic       #49  <Field boolean zzbum>
	//*   6   17:return          
	}
}
