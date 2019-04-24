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
		{
			try
			{
				System.arraycopy(((Object) (abyte0)), i, ((Object) (buffer)), position, j);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:aload_0         
		//    3    3:getfield        #43  <Field byte[] buffer>
		//    4    6:aload_0         
		//    5    7:getfield        #47  <Field int position>
		//    6   10:iload_3         
		//    7   11:invokestatic    #61  <Method void System.arraycopy(Object, int, Object, int, int)>
				position = position + j;
		//    8   14:aload_0         
		//    9   15:aload_0         
		//   10   16:getfield        #47  <Field int position>
		//   11   19:iload_3         
		//   12   20:iadd            
		//   13   21:putfield        #47  <Field int position>
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
		//   16   26:new             #63  <Class zztv$zzc>
		//   17   29:dup             
		//   18   30:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//   19   32:iconst_3        
		//   20   33:anewarray       Object[]
		//   21   36:dup             
		//   22   37:iconst_0        
		//   23   38:aload_0         
		//   24   39:getfield        #47  <Field int position>
		//   25   42:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   26   45:aastore         
		//   27   46:dup             
		//   28   47:iconst_1        
		//   29   48:aload_0         
		//   30   49:getfield        #49  <Field int limit>
		//   31   52:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   32   55:aastore         
		//   33   56:dup             
		//   34   57:iconst_2        
		//   35   58:iload_3         
		//   36   59:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   37   62:aastore         
		//   38   63:invokestatic    #40  <Method String String.format(String, Object[])>
		//   39   66:aload_1         
		//   40   67:invokespecial   #68  <Method void zztv$zzc(String, Throwable)>
		//   41   70:athrow          
			}
		}

		public final void zza(int i, long l)
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zzat(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #77  <Method void zztv.zzat(long)>
		//    7   11:return          
		}

		public final void zza(int i, zzte zzte1)
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zza(zzte1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #81  <Method void zztv.zza(zzte)>
		//    7   11:return          
		}

		public final void zza(int i, zzvv zzvv1)
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zzb(zzvv1);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #86  <Method void zztv.zzb(zzvv)>
		//    7   11:return          
		}

		final void zza(int i, zzvv zzvv1, zzwl zzwl1)
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			zzsx zzsx1 = (zzsx)zzvv1;
		//    4    6:aload_2         
		//    5    7:checkcast       #89  <Class zzsx>
		//    6   10:astore          5
			int j = zzsx1.zztx();
		//    7   12:aload           5
		//    8   14:invokevirtual   #93  <Method int zzsx.zztx()>
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
		//   17   31:invokeinterface #99  <Method int zzwl.zzai(Object)>
		//   18   36:istore_1        
				zzsx1.zzai(i);
		//   19   37:aload           5
		//   20   39:iload_1         
		//   21   40:invokevirtual   #102 <Method void zzsx.zzai(int)>
			}
			((zztv)this).zzba(i);
		//   22   43:aload_0         
		//   23   44:iload_1         
		//   24   45:invokevirtual   #105 <Method void zztv.zzba(int)>
			zzwl1.zza(((Object) (zzvv1)), ((zzxy) (zzbup)));
		//   25   48:aload_3         
		//   26   49:aload_2         
		//   27   50:aload_0         
		//   28   51:getfield        #109 <Field zztx zzbup>
		//   29   54:invokeinterface #112 <Method void zzwl.zza(Object, zzxy)>
		//   30   59:return          
		}

		public final void zza(zzte zzte1)
		{
			((zztv)this).zzba(zzte1.size());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #117 <Method int zzte.size()>
		//    3    5:invokevirtual   #105 <Method void zztv.zzba(int)>
			zzte1.zza(((zztd) (this)));
		//    4    8:aload_1         
		//    5    9:aload_0         
		//    6   10:invokevirtual   #120 <Method void zzte.zza(zztd)>
		//    7   13:return          
		}

		final void zza(zzvv zzvv1, zzwl zzwl1)
		{
			zzsx zzsx1 = (zzsx)zzvv1;
		//    0    0:aload_1         
		//    1    1:checkcast       #89  <Class zzsx>
		//    2    4:astore          5
			int j = zzsx1.zztx();
		//    3    6:aload           5
		//    4    8:invokevirtual   #93  <Method int zzsx.zztx()>
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
		//   13   25:invokeinterface #99  <Method int zzwl.zzai(Object)>
		//   14   30:istore_3        
				zzsx1.zzai(i);
		//   15   31:aload           5
		//   16   33:iload_3         
		//   17   34:invokevirtual   #102 <Method void zzsx.zzai(int)>
			}
			((zztv)this).zzba(i);
		//   18   37:aload_0         
		//   19   38:iload_3         
		//   20   39:invokevirtual   #105 <Method void zztv.zzba(int)>
			zzwl1.zza(((Object) (zzvv1)), ((zzxy) (zzbup)));
		//   21   42:aload_2         
		//   22   43:aload_1         
		//   23   44:aload_0         
		//   24   45:getfield        #109 <Field zztx zzbup>
		//   25   48:invokeinterface #112 <Method void zzwl.zza(Object, zzxy)>
		//   26   53:return          
		}

		public final void zza(byte abyte0[], int i, int j)
		{
			((zztv)this).write(abyte0, i, j);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:iload_3         
		//    4    4:invokevirtual   #123 <Method void zztv.write(byte[], int, int)>
		//    5    7:return          
		}

		public final void zzat(long l)
		{
			long l1;
			l1 = l;
		//    0    0:lload_1         
		//    1    1:lstore          4
			if(zztv.zzvk())
		//*   2    3:invokestatic    #127 <Method boolean zztv.zzvk()>
		//*   3    6:ifeq            103
			{
				l1 = l;
		//    4    9:lload_1         
		//    5   10:lstore          4
				if(((zztv)this).zzvj() >= 10)
		//*   6   12:aload_0         
		//*   7   13:invokevirtual   #130 <Method int zztv.zzvj()>
		//*   8   16:bipush          10
		//*   9   18:icmplt          103
					do
					{
						if((l & -128L) == 0L)
		//*  10   21:lload_1         
		//*  11   22:ldc2w           #131 <Long -128L>
		//*  12   25:land            
		//*  13   26:lconst_0        
		//*  14   27:lcmp            
		//*  15   28:ifne            60
						{
							byte abyte0[] = buffer;
		//   16   31:aload_0         
		//   17   32:getfield        #43  <Field byte[] buffer>
		//   18   35:astore          6
							int i = position;
		//   19   37:aload_0         
		//   20   38:getfield        #47  <Field int position>
		//   21   41:istore_3        
							position = i + 1;
		//   22   42:aload_0         
		//   23   43:iload_3         
		//   24   44:iconst_1        
		//   25   45:iadd            
		//   26   46:putfield        #47  <Field int position>
							zzxj.zza(abyte0, i, (byte)(int)l);
		//   27   49:aload           6
		//   28   51:iload_3         
		//   29   52:i2l             
		//   30   53:lload_1         
		//   31   54:l2i             
		//   32   55:int2byte        
		//   33   56:invokestatic    #137 <Method void zzxj.zza(byte[], long, byte)>
							return;
		//   34   59:return          
						}
						byte abyte1[] = buffer;
		//   35   60:aload_0         
		//   36   61:getfield        #43  <Field byte[] buffer>
		//   37   64:astore          6
						int j = position;
		//   38   66:aload_0         
		//   39   67:getfield        #47  <Field int position>
		//   40   70:istore_3        
						position = j + 1;
		//   41   71:aload_0         
		//   42   72:iload_3         
		//   43   73:iconst_1        
		//   44   74:iadd            
		//   45   75:putfield        #47  <Field int position>
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
		//   56   92:invokestatic    #137 <Method void zzxj.zza(byte[], long, byte)>
						l >>>= 7;
		//   57   95:lload_1         
		//   58   96:bipush          7
		//   59   98:lushr           
		//   60   99:lstore_1        
					} while(true);
		//   61  100:goto            21
			}
_L1:
			IndexOutOfBoundsException indexoutofboundsexception;
			if((l1 & -128L) == 0L)
		//*  62  103:lload           4
		//*  63  105:ldc2w           #131 <Long -128L>
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
		//   69  115:getfield        #43  <Field byte[] buffer>
		//   70  118:astore          6
					k = position;
		//   71  120:aload_0         
		//   72  121:getfield        #47  <Field int position>
		//   73  124:istore_3        
					position = k + 1;
		//   74  125:aload_0         
		//   75  126:iload_3         
		//   76  127:iconst_1        
		//   77  128:iadd            
		//   78  129:putfield        #47  <Field int position>
				}
		//*  79  132:aload           6
		//*  80  134:iload_3         
		//*  81  135:lload           4
		//*  82  137:l2i             
		//*  83  138:int2byte        
		//*  84  139:bastore         
		//*  85  140:return          
		//*  86  141:aload_0         
		//*  87  142:getfield        #43  <Field byte[] buffer>
		//*  88  145:astore          6
		//*  89  147:aload_0         
		//*  90  148:getfield        #47  <Field int position>
		//*  91  151:istore_3        
		//*  92  152:aload_0         
		//*  93  153:iload_3         
		//*  94  154:iconst_1        
		//*  95  155:iadd            
		//*  96  156:putfield        #47  <Field int position>
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
		//* 112  184:new             #63  <Class zztv$zzc>
		//* 113  187:dup             
		//* 114  188:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//* 115  190:iconst_3        
		//* 116  191:anewarray       Object[]
		//* 117  194:dup             
		//* 118  195:iconst_0        
		//* 119  196:aload_0         
		//* 120  197:getfield        #47  <Field int position>
		//* 121  200:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//* 122  203:aastore         
		//* 123  204:dup             
		//* 124  205:iconst_1        
		//* 125  206:aload_0         
		//* 126  207:getfield        #49  <Field int limit>
		//* 127  210:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//* 128  213:aastore         
		//* 129  214:dup             
		//* 130  215:iconst_2        
		//* 131  216:iconst_1        
		//* 132  217:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//* 133  220:aastore         
		//* 134  221:invokestatic    #40  <Method String String.format(String, Object[])>
		//* 135  224:aload           6
		//* 136  226:invokespecial   #68  <Method void zztv$zzc(String, Throwable)>
		//* 137  229:athrow          
				// Misplaced declaration of an exception variable
				catch(IndexOutOfBoundsException indexoutofboundsexception)
				{
					throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
					}), ((Throwable) (indexoutofboundsexception)));
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
		//* 138  230:astore          6
		//* 139  232:goto            184
		}

		public final void zzav(long l)
		{
			int i;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field byte[] buffer>
		//    2    4:astore          4
				i = position;
		//    3    6:aload_0         
		//    4    7:getfield        #47  <Field int position>
		//    5   10:istore_3        
				position = i + 1;
		//    6   11:aload_0         
		//    7   12:iload_3         
		//    8   13:iconst_1        
		//    9   14:iadd            
		//   10   15:putfield        #47  <Field int position>
			}
		//*  11   18:aload           4
		//*  12   20:iload_3         
		//*  13   21:lload_1         
		//*  14   22:l2i             
		//*  15   23:int2byte        
		//*  16   24:bastore         
		//*  17   25:aload_0         
		//*  18   26:getfield        #43  <Field byte[] buffer>
		//*  19   29:astore          4
		//*  20   31:aload_0         
		//*  21   32:getfield        #47  <Field int position>
		//*  22   35:istore_3        
		//*  23   36:aload_0         
		//*  24   37:iload_3         
		//*  25   38:iconst_1        
		//*  26   39:iadd            
		//*  27   40:putfield        #47  <Field int position>
		//*  28   43:aload           4
		//*  29   45:iload_3         
		//*  30   46:lload_1         
		//*  31   47:bipush          8
		//*  32   49:lshr            
		//*  33   50:l2i             
		//*  34   51:int2byte        
		//*  35   52:bastore         
		//*  36   53:aload_0         
		//*  37   54:getfield        #43  <Field byte[] buffer>
		//*  38   57:astore          4
		//*  39   59:aload_0         
		//*  40   60:getfield        #47  <Field int position>
		//*  41   63:istore_3        
		//*  42   64:aload_0         
		//*  43   65:iload_3         
		//*  44   66:iconst_1        
		//*  45   67:iadd            
		//*  46   68:putfield        #47  <Field int position>
		//*  47   71:aload           4
		//*  48   73:iload_3         
		//*  49   74:lload_1         
		//*  50   75:bipush          16
		//*  51   77:lshr            
		//*  52   78:l2i             
		//*  53   79:int2byte        
		//*  54   80:bastore         
		//*  55   81:aload_0         
		//*  56   82:getfield        #43  <Field byte[] buffer>
		//*  57   85:astore          4
		//*  58   87:aload_0         
		//*  59   88:getfield        #47  <Field int position>
		//*  60   91:istore_3        
		//*  61   92:aload_0         
		//*  62   93:iload_3         
		//*  63   94:iconst_1        
		//*  64   95:iadd            
		//*  65   96:putfield        #47  <Field int position>
		//*  66   99:aload           4
		//*  67  101:iload_3         
		//*  68  102:lload_1         
		//*  69  103:bipush          24
		//*  70  105:lshr            
		//*  71  106:l2i             
		//*  72  107:int2byte        
		//*  73  108:bastore         
		//*  74  109:aload_0         
		//*  75  110:getfield        #43  <Field byte[] buffer>
		//*  76  113:astore          4
		//*  77  115:aload_0         
		//*  78  116:getfield        #47  <Field int position>
		//*  79  119:istore_3        
		//*  80  120:aload_0         
		//*  81  121:iload_3         
		//*  82  122:iconst_1        
		//*  83  123:iadd            
		//*  84  124:putfield        #47  <Field int position>
		//*  85  127:aload           4
		//*  86  129:iload_3         
		//*  87  130:lload_1         
		//*  88  131:bipush          32
		//*  89  133:lshr            
		//*  90  134:l2i             
		//*  91  135:int2byte        
		//*  92  136:bastore         
		//*  93  137:aload_0         
		//*  94  138:getfield        #43  <Field byte[] buffer>
		//*  95  141:astore          4
		//*  96  143:aload_0         
		//*  97  144:getfield        #47  <Field int position>
		//*  98  147:istore_3        
		//*  99  148:aload_0         
		//* 100  149:iload_3         
		//* 101  150:iconst_1        
		//* 102  151:iadd            
		//* 103  152:putfield        #47  <Field int position>
		//* 104  155:aload           4
		//* 105  157:iload_3         
		//* 106  158:lload_1         
		//* 107  159:bipush          40
		//* 108  161:lshr            
		//* 109  162:l2i             
		//* 110  163:int2byte        
		//* 111  164:bastore         
		//* 112  165:aload_0         
		//* 113  166:getfield        #43  <Field byte[] buffer>
		//* 114  169:astore          4
		//* 115  171:aload_0         
		//* 116  172:getfield        #47  <Field int position>
		//* 117  175:istore_3        
		//* 118  176:aload_0         
		//* 119  177:iload_3         
		//* 120  178:iconst_1        
		//* 121  179:iadd            
		//* 122  180:putfield        #47  <Field int position>
		//* 123  183:aload           4
		//* 124  185:iload_3         
		//* 125  186:lload_1         
		//* 126  187:bipush          48
		//* 127  189:lshr            
		//* 128  190:l2i             
		//* 129  191:int2byte        
		//* 130  192:bastore         
		//* 131  193:aload_0         
		//* 132  194:getfield        #43  <Field byte[] buffer>
		//* 133  197:astore          4
		//* 134  199:aload_0         
		//* 135  200:getfield        #47  <Field int position>
		//* 136  203:istore_3        
		//* 137  204:aload_0         
		//* 138  205:iload_3         
		//* 139  206:iconst_1        
		//* 140  207:iadd            
		//* 141  208:putfield        #47  <Field int position>
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
		//  152  224:new             #63  <Class zztv$zzc>
		//  153  227:dup             
		//  154  228:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//  155  230:iconst_3        
		//  156  231:anewarray       Object[]
		//  157  234:dup             
		//  158  235:iconst_0        
		//  159  236:aload_0         
		//  160  237:getfield        #47  <Field int position>
		//  161  240:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  162  243:aastore         
		//  163  244:dup             
		//  164  245:iconst_1        
		//  165  246:aload_0         
		//  166  247:getfield        #49  <Field int limit>
		//  167  250:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  168  253:aastore         
		//  169  254:dup             
		//  170  255:iconst_2        
		//  171  256:iconst_1        
		//  172  257:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//  173  260:aastore         
		//  174  261:invokestatic    #40  <Method String String.format(String, Object[])>
		//  175  264:aload           4
		//  176  266:invokespecial   #68  <Method void zztv$zzc(String, Throwable)>
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
		{
			if(i >= 0)
		//*   0    0:iload_1         
		//*   1    1:iflt            10
			{
				((zztv)this).zzba(i);
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:invokevirtual   #105 <Method void zztv.zzba(int)>
				return;
		//    5    9:return          
			} else
			{
				((zztv)this).zzat(i);
		//    6   10:aload_0         
		//    7   11:iload_1         
		//    8   12:i2l             
		//    9   13:invokevirtual   #77  <Method void zztv.zzat(long)>
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
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zze(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #142 <Method void zztv.zze(int, int)>
			((zztv)this).zza(3, zzte1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #144 <Method void zztv.zza(int, zzte)>
			((zztv)this).zzc(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #73  <Method void zztv.zzc(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, zzvv zzvv1)
		{
			((zztv)this).zzc(1, 3);
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:iconst_3        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zze(2, i);
		//    4    6:aload_0         
		//    5    7:iconst_2        
		//    6    8:iload_1         
		//    7    9:invokevirtual   #142 <Method void zztv.zze(int, int)>
			((zztv)this).zza(3, zzvv1);
		//    8   12:aload_0         
		//    9   13:iconst_3        
		//   10   14:aload_2         
		//   11   15:invokevirtual   #146 <Method void zztv.zza(int, zzvv)>
			((zztv)this).zzc(1, 4);
		//   12   18:aload_0         
		//   13   19:iconst_1        
		//   14   20:iconst_4        
		//   15   21:invokevirtual   #73  <Method void zztv.zzc(int, int)>
		//   16   24:return          
		}

		public final void zzb(int i, String s)
		{
			((zztv)this).zzc(i, 2);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_2        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zzgb(s);
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:invokevirtual   #150 <Method void zztv.zzgb(String)>
		//    7   11:return          
		}

		public final void zzb(int i, boolean flag)
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zzc((byte)flag);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:int2byte        
		//    7    9:invokevirtual   #154 <Method void zztv.zzc(byte)>
		//    8   12:return          
		}

		public final void zzb(zzvv zzvv1)
		{
			((zztv)this).zzba(zzvv1.zzvx());
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokeinterface #159 <Method int zzvv.zzvx()>
		//    3    7:invokevirtual   #105 <Method void zztv.zzba(int)>
			zzvv1.zzb(((zztv) (this)));
		//    4   10:aload_1         
		//    5   11:aload_0         
		//    6   12:invokeinterface #162 <Method void zzvv.zzb(zztv)>
		//    7   17:return          
		}

		public final void zzba(int i)
		{
			int j;
			j = i;
		//    0    0:iload_1         
		//    1    1:istore_2        
			if(zztv.zzvk())
		//*   2    2:invokestatic    #127 <Method boolean zztv.zzvk()>
		//*   3    5:ifeq            92
			{
				j = i;
		//    4    8:iload_1         
		//    5    9:istore_2        
				if(((zztv)this).zzvj() >= 10)
		//*   6   10:aload_0         
		//*   7   11:invokevirtual   #130 <Method int zztv.zzvj()>
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
		//   15   27:getfield        #43  <Field byte[] buffer>
		//   16   30:astore_3        
							j = position;
		//   17   31:aload_0         
		//   18   32:getfield        #47  <Field int position>
		//   19   35:istore_2        
							position = j + 1;
		//   20   36:aload_0         
		//   21   37:iload_2         
		//   22   38:iconst_1        
		//   23   39:iadd            
		//   24   40:putfield        #47  <Field int position>
							zzxj.zza(abyte0, j, (byte)i);
		//   25   43:aload_3         
		//   26   44:iload_2         
		//   27   45:i2l             
		//   28   46:iload_1         
		//   29   47:int2byte        
		//   30   48:invokestatic    #137 <Method void zzxj.zza(byte[], long, byte)>
							return;
		//   31   51:return          
						}
						byte abyte1[] = buffer;
		//   32   52:aload_0         
		//   33   53:getfield        #43  <Field byte[] buffer>
		//   34   56:astore_3        
						j = position;
		//   35   57:aload_0         
		//   36   58:getfield        #47  <Field int position>
		//   37   61:istore_2        
						position = j + 1;
		//   38   62:aload_0         
		//   39   63:iload_2         
		//   40   64:iconst_1        
		//   41   65:iadd            
		//   42   66:putfield        #47  <Field int position>
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
		//   52   81:invokestatic    #137 <Method void zzxj.zza(byte[], long, byte)>
						i >>>= 7;
		//   53   84:iload_1         
		//   54   85:bipush          7
		//   55   87:iushr           
		//   56   88:istore_1        
					} while(true);
		//   57   89:goto            19
			}
_L1:
			IndexOutOfBoundsException indexoutofboundsexception;
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
		//   63  100:getfield        #43  <Field byte[] buffer>
		//   64  103:astore_3        
					i = position;
		//   65  104:aload_0         
		//   66  105:getfield        #47  <Field int position>
		//   67  108:istore_1        
					position = i + 1;
		//   68  109:aload_0         
		//   69  110:iload_1         
		//   70  111:iconst_1        
		//   71  112:iadd            
		//   72  113:putfield        #47  <Field int position>
				}
		//*  73  116:aload_3         
		//*  74  117:iload_1         
		//*  75  118:iload_2         
		//*  76  119:int2byte        
		//*  77  120:bastore         
		//*  78  121:return          
		//*  79  122:aload_0         
		//*  80  123:getfield        #43  <Field byte[] buffer>
		//*  81  126:astore_3        
		//*  82  127:aload_0         
		//*  83  128:getfield        #47  <Field int position>
		//*  84  131:istore_1        
		//*  85  132:aload_0         
		//*  86  133:iload_1         
		//*  87  134:iconst_1        
		//*  88  135:iadd            
		//*  89  136:putfield        #47  <Field int position>
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
		//* 104  159:new             #63  <Class zztv$zzc>
		//* 105  162:dup             
		//* 106  163:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//* 107  165:iconst_3        
		//* 108  166:anewarray       Object[]
		//* 109  169:dup             
		//* 110  170:iconst_0        
		//* 111  171:aload_0         
		//* 112  172:getfield        #47  <Field int position>
		//* 113  175:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//* 114  178:aastore         
		//* 115  179:dup             
		//* 116  180:iconst_1        
		//* 117  181:aload_0         
		//* 118  182:getfield        #49  <Field int limit>
		//* 119  185:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//* 120  188:aastore         
		//* 121  189:dup             
		//* 122  190:iconst_2        
		//* 123  191:iconst_1        
		//* 124  192:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//* 125  195:aastore         
		//* 126  196:invokestatic    #40  <Method String String.format(String, Object[])>
		//* 127  199:aload_3         
		//* 128  200:invokespecial   #68  <Method void zztv$zzc(String, Throwable)>
		//* 129  203:athrow          
				// Misplaced declaration of an exception variable
				catch(IndexOutOfBoundsException indexoutofboundsexception)
				{
					throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
						Integer.valueOf(position), Integer.valueOf(limit), Integer.valueOf(1)
					}), ((Throwable) (indexoutofboundsexception)));
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
		//* 130  204:astore_3        
		//* 131  205:goto            159
		}

		public final void zzbc(int i)
		{
			int j;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field byte[] buffer>
		//    2    4:astore_3        
				j = position;
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field int position>
		//    5    9:istore_2        
				position = j + 1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #47  <Field int position>
			}
		//*  11   17:aload_3         
		//*  12   18:iload_2         
		//*  13   19:iload_1         
		//*  14   20:int2byte        
		//*  15   21:bastore         
		//*  16   22:aload_0         
		//*  17   23:getfield        #43  <Field byte[] buffer>
		//*  18   26:astore_3        
		//*  19   27:aload_0         
		//*  20   28:getfield        #47  <Field int position>
		//*  21   31:istore_2        
		//*  22   32:aload_0         
		//*  23   33:iload_2         
		//*  24   34:iconst_1        
		//*  25   35:iadd            
		//*  26   36:putfield        #47  <Field int position>
		//*  27   39:aload_3         
		//*  28   40:iload_2         
		//*  29   41:iload_1         
		//*  30   42:bipush          8
		//*  31   44:ishr            
		//*  32   45:int2byte        
		//*  33   46:bastore         
		//*  34   47:aload_0         
		//*  35   48:getfield        #43  <Field byte[] buffer>
		//*  36   51:astore_3        
		//*  37   52:aload_0         
		//*  38   53:getfield        #47  <Field int position>
		//*  39   56:istore_2        
		//*  40   57:aload_0         
		//*  41   58:iload_2         
		//*  42   59:iconst_1        
		//*  43   60:iadd            
		//*  44   61:putfield        #47  <Field int position>
		//*  45   64:aload_3         
		//*  46   65:iload_2         
		//*  47   66:iload_1         
		//*  48   67:bipush          16
		//*  49   69:ishr            
		//*  50   70:int2byte        
		//*  51   71:bastore         
		//*  52   72:aload_0         
		//*  53   73:getfield        #43  <Field byte[] buffer>
		//*  54   76:astore_3        
		//*  55   77:aload_0         
		//*  56   78:getfield        #47  <Field int position>
		//*  57   81:istore_2        
		//*  58   82:aload_0         
		//*  59   83:iload_2         
		//*  60   84:iconst_1        
		//*  61   85:iadd            
		//*  62   86:putfield        #47  <Field int position>
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
		//   72   99:new             #63  <Class zztv$zzc>
		//   73  102:dup             
		//   74  103:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//   75  105:iconst_3        
		//   76  106:anewarray       Object[]
		//   77  109:dup             
		//   78  110:iconst_0        
		//   79  111:aload_0         
		//   80  112:getfield        #47  <Field int position>
		//   81  115:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   82  118:aastore         
		//   83  119:dup             
		//   84  120:iconst_1        
		//   85  121:aload_0         
		//   86  122:getfield        #49  <Field int limit>
		//   87  125:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   88  128:aastore         
		//   89  129:dup             
		//   90  130:iconst_2        
		//   91  131:iconst_1        
		//   92  132:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   93  135:aastore         
		//   94  136:invokestatic    #40  <Method String String.format(String, Object[])>
		//   95  139:aload_3         
		//   96  140:invokespecial   #68  <Method void zztv$zzc(String, Throwable)>
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
		{
			int i;
			byte abyte0[];
			try
			{
				abyte0 = buffer;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field byte[] buffer>
		//    2    4:astore_3        
				i = position;
		//    3    5:aload_0         
		//    4    6:getfield        #47  <Field int position>
		//    5    9:istore_2        
				position = i + 1;
		//    6   10:aload_0         
		//    7   11:iload_2         
		//    8   12:iconst_1        
		//    9   13:iadd            
		//   10   14:putfield        #47  <Field int position>
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
		//   17   23:new             #63  <Class zztv$zzc>
		//   18   26:dup             
		//   19   27:ldc1            #65  <String "Pos: %d, limit: %d, len: %d">
		//   20   29:iconst_3        
		//   21   30:anewarray       Object[]
		//   22   33:dup             
		//   23   34:iconst_0        
		//   24   35:aload_0         
		//   25   36:getfield        #47  <Field int position>
		//   26   39:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   27   42:aastore         
		//   28   43:dup             
		//   29   44:iconst_1        
		//   30   45:aload_0         
		//   31   46:getfield        #49  <Field int limit>
		//   32   49:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   33   52:aastore         
		//   34   53:dup             
		//   35   54:iconst_2        
		//   36   55:iconst_1        
		//   37   56:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   38   59:aastore         
		//   39   60:invokestatic    #40  <Method String String.format(String, Object[])>
		//   40   63:aload_3         
		//   41   64:invokespecial   #68  <Method void zztv$zzc(String, Throwable)>
		//   42   67:athrow          
			}
			abyte0[i] = byte0;
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
		//    6    6:invokevirtual   #105 <Method void zztv.zzba(int)>
		//    7    9:return          
		}

		public final void zzc(int i, long l)
		{
			((zztv)this).zzc(i, 1);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_1        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zzav(l);
		//    4    6:aload_0         
		//    5    7:lload_2         
		//    6    8:invokevirtual   #165 <Method void zztv.zzav(long)>
		//    7   11:return          
		}

		public final void zzd(int i, int j)
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zzaz(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #168 <Method void zztv.zzaz(int)>
		//    7   11:return          
		}

		public final void zze(int i, int j)
		{
			((zztv)this).zzc(i, 0);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_0        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zzba(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #105 <Method void zztv.zzba(int)>
		//    7   11:return          
		}

		public final void zze(byte abyte0[], int i, int j)
		{
			((zztv)this).zzba(j);
		//    0    0:aload_0         
		//    1    1:iload_3         
		//    2    2:invokevirtual   #105 <Method void zztv.zzba(int)>
			((zztv)this).write(abyte0, 0, j);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_0        
		//    6    8:iload_3         
		//    7    9:invokevirtual   #123 <Method void zztv.write(byte[], int, int)>
		//    8   12:return          
		}

		public final void zzg(int i, int j)
		{
			((zztv)this).zzc(i, 5);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iconst_5        
		//    3    3:invokevirtual   #73  <Method void zztv.zzc(int, int)>
			((zztv)this).zzbc(j);
		//    4    6:aload_0         
		//    5    7:iload_2         
		//    6    8:invokevirtual   #171 <Method void zztv.zzbc(int)>
		//    7   11:return          
		}

		public final void zzgb(String s)
		{
			int i = position;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field int position>
		//    2    4:istore_2        
			int j;
			int k;
			try
			{
				k = zzbf(s.length() * 3);
		//    3    5:aload_1         
		//    4    6:invokevirtual   #176 <Method int String.length()>
		//    5    9:iconst_3        
		//    6   10:imul            
		//    7   11:invokestatic    #180 <Method int zzbf(int)>
		//    8   14:istore          4
				j = zzbf(s.length());
		//    9   16:aload_1         
		//   10   17:invokevirtual   #176 <Method int String.length()>
		//   11   20:invokestatic    #180 <Method int zzbf(int)>
		//   12   23:istore_3        
			}
		//*  13   24:iload_3         
		//*  14   25:iload           4
		//*  15   27:icmpne          77
		//*  16   30:aload_0         
		//*  17   31:iload_2         
		//*  18   32:iload_3         
		//*  19   33:iadd            
		//*  20   34:putfield        #47  <Field int position>
		//*  21   37:aload_1         
		//*  22   38:aload_0         
		//*  23   39:getfield        #43  <Field byte[] buffer>
		//*  24   42:aload_0         
		//*  25   43:getfield        #47  <Field int position>
		//*  26   46:aload_0         
		//*  27   47:invokevirtual   #130 <Method int zztv.zzvj()>
		//*  28   50:invokestatic    #185 <Method int zzxl.zza(CharSequence, byte[], int, int)>
		//*  29   53:istore          4
		//*  30   55:aload_0         
		//*  31   56:iload_2         
		//*  32   57:putfield        #47  <Field int position>
		//*  33   60:aload_0         
		//*  34   61:iload           4
		//*  35   63:iload_2         
		//*  36   64:isub            
		//*  37   65:iload_3         
		//*  38   66:isub            
		//*  39   67:invokevirtual   #105 <Method void zztv.zzba(int)>
		//*  40   70:aload_0         
		//*  41   71:iload           4
		//*  42   73:putfield        #47  <Field int position>
		//*  43   76:return          
		//*  44   77:aload_0         
		//*  45   78:aload_1         
		//*  46   79:invokestatic    #188 <Method int zzxl.zza(CharSequence)>
		//*  47   82:invokevirtual   #105 <Method void zztv.zzba(int)>
		//*  48   85:aload_0         
		//*  49   86:aload_1         
		//*  50   87:aload_0         
		//*  51   88:getfield        #43  <Field byte[] buffer>
		//*  52   91:aload_0         
		//*  53   92:getfield        #47  <Field int position>
		//*  54   95:aload_0         
		//*  55   96:invokevirtual   #130 <Method int zztv.zzvj()>
		//*  56   99:invokestatic    #185 <Method int zzxl.zza(CharSequence, byte[], int, int)>
		//*  57  102:putfield        #47  <Field int position>
		//*  58  105:return          
		//*  59  106:astore_1        
		//*  60  107:new             #63  <Class zztv$zzc>
		//*  61  110:dup             
		//*  62  111:aload_1         
		//*  63  112:invokespecial   #191 <Method void zztv$zzc(Throwable)>
		//*  64  115:athrow          
			catch(zzxp zzxp1)
		//*  65  116:astore          5
			{
				position = i;
		//   66  118:aload_0         
		//   67  119:iload_2         
		//   68  120:putfield        #47  <Field int position>
				((zztv)this).zza(s, zzxp1);
		//   69  123:aload_0         
		//   70  124:aload_1         
		//   71  125:aload           5
		//   72  127:invokevirtual   #194 <Method void zztv.zza(String, zzxp)>
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
		//    1    1:getfield        #49  <Field int limit>
		//    2    4:aload_0         
		//    3    5:getfield        #47  <Field int position>
		//    4    8:isub            
		//    5    9:ireturn         
		}

		public final int zzvl()
		{
			return position - offset;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field int position>
		//    2    4:aload_0         
		//    3    5:getfield        #45  <Field int offset>
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
			if(abyte0 == null)
		//*   3    5:aload_1         
		//*   4    6:ifnonnull       19
				throw new NullPointerException("buffer");
		//    5    9:new             #18  <Class NullPointerException>
		//    6   12:dup             
		//    7   13:ldc1            #19  <String "buffer">
		//    8   15:invokespecial   #22  <Method void NullPointerException(String)>
		//    9   18:athrow          
			int k = abyte0.length;
		//   10   19:aload_1         
		//   11   20:arraylength     
		//   12   21:istore          4
			int l = i + j;
		//   13   23:iload_2         
		//   14   24:iload_3         
		//   15   25:iadd            
		//   16   26:istore          5
			if((i | j | k - l) < 0)
		//*  17   28:iload_2         
		//*  18   29:iload_3         
		//*  19   30:ior             
		//*  20   31:iload           4
		//*  21   33:iload           5
		//*  22   35:isub            
		//*  23   36:ior             
		//*  24   37:ifge            79
			{
				throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[] {
					Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
				}));
		//   25   40:new             #24  <Class IllegalArgumentException>
		//   26   43:dup             
		//   27   44:ldc1            #26  <String "Array range is invalid. Buffer.length=%d, offset=%d, length=%d">
		//   28   46:iconst_3        
		//   29   47:anewarray       Object[]
		//   30   50:dup             
		//   31   51:iconst_0        
		//   32   52:aload_1         
		//   33   53:arraylength     
		//   34   54:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   35   57:aastore         
		//   36   58:dup             
		//   37   59:iconst_1        
		//   38   60:iload_2         
		//   39   61:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   40   64:aastore         
		//   41   65:dup             
		//   42   66:iconst_2        
		//   43   67:iload_3         
		//   44   68:invokestatic    #34  <Method Integer Integer.valueOf(int)>
		//   45   71:aastore         
		//   46   72:invokestatic    #40  <Method String String.format(String, Object[])>
		//   47   75:invokespecial   #41  <Method void IllegalArgumentException(String)>
		//   48   78:athrow          
			} else
			{
				buffer = abyte0;
		//   49   79:aload_0         
		//   50   80:aload_1         
		//   51   81:putfield        #43  <Field byte[] buffer>
				offset = i;
		//   52   84:aload_0         
		//   53   85:iload_2         
		//   54   86:putfield        #45  <Field int offset>
				position = i;
		//   55   89:aload_0         
		//   56   90:iload_2         
		//   57   91:putfield        #47  <Field int position>
				limit = l;
		//   58   94:aload_0         
		//   59   95:iload           5
		//   60   97:putfield        #49  <Field int limit>
				return;
		//   61  100:return          
			}
		}
	}

	static final class zzb extends zza
	{

		public final void flush()
		{
			zzbuq.position(zzbur + ((zza)this).zzvl());
		//    0    0:aload_0         
		//    1    1:getfield        #34  <Field ByteBuffer zzbuq>
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field int zzbur>
		//    4    8:aload_0         
		//    5    9:invokevirtual   #42  <Method int zztv$zza.zzvl()>
		//    6   12:iadd            
		//    7   13:invokevirtual   #45  <Method java.nio.Buffer ByteBuffer.position(int)>
		//    8   16:pop             
		//    9   17:return          
		}

		private final ByteBuffer zzbuq;
		private int zzbur;

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
			zzbuq = bytebuffer;
		//   11   21:aload_0         
		//   12   22:aload_1         
		//   13   23:putfield        #34  <Field ByteBuffer zzbuq>
			zzbur = bytebuffer.position();
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:invokevirtual   #26  <Method int ByteBuffer.position()>
		//   17   31:putfield        #36  <Field int zzbur>
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
				throw new zzc(((Throwable) (s)));
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
				throw new zzc(((Throwable) (abyte0)));
		//   15   23:new             #54  <Class zztv$zzc>
		//   16   26:dup             
		//   17   27:aload_1         
		//   18   28:invokespecial   #57  <Method void zztv$zzc(Throwable)>
		//   19   31:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(byte abyte0[])
			{
				throw new zzc(((Throwable) (abyte0)));
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
					throw new zzc(((Throwable) (bufferoverflowexception)));
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
				throw new zzc(((Throwable) (bufferoverflowexception)));
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
					throw new zzc(((Throwable) (bufferoverflowexception)));
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
				throw new zzc(((Throwable) (bufferoverflowexception)));
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
				throw new zzc(((Throwable) (bufferoverflowexception)));
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
				throw new zzc(((Throwable) (s)));
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

		zzd(ByteBuffer bytebuffer)
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

	static final class zze extends zztv
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
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
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
			throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
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
			throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
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
				throw new zzc(String.format("Pos: %d, limit: %d, len: %d", new Object[] {
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
				throw new zzc(((Throwable) (s)));
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				throw new zzc(((Throwable) (s)));
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

		zze(ByteBuffer bytebuffer)
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
		return zzbuo;
	//    0    0:getstatic       #49  <Field boolean zzbuo>
	//    1    3:ireturn         
	}

	public abstract void flush();

	public abstract void write(byte abyte0[], int i, int j);

	public final void zza(float f)
	{
		zzbc(Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #227 <Method int Float.floatToRawIntBits(float)>
	//    3    5:invokevirtual   #230 <Method void zzbc(int)>
	//    4    8:return          
	}

	public final void zza(int i, double d)
	{
		zzc(i, Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:dload_2         
	//    3    3:invokestatic    #237 <Method long Double.doubleToRawLongBits(double)>
	//    4    6:invokevirtual   #240 <Method void zzc(int, long)>
	//    5    9:return          
	}

	public final void zza(int i, float f)
	{
		zzg(i, Float.floatToRawIntBits(f));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:fload_2         
	//    3    3:invokestatic    #227 <Method int Float.floatToRawIntBits(float)>
	//    4    6:invokevirtual   #244 <Method void zzg(int, int)>
	//    5    9:return          
	}

	public abstract void zza(int i, long l);

	public abstract void zza(int i, zzte zzte1);

	public abstract void zza(int i, zzvv zzvv1);

	abstract void zza(int i, zzvv zzvv1, zzwl zzwl1);

	public abstract void zza(zzte zzte1);

	abstract void zza(zzvv zzvv1, zzwl zzwl1);

	final void zza(String s, zzxp zzxp1)
	{
		logger.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", ((Throwable) (zzxp1)));
	//    0    0:getstatic       #41  <Field Logger logger>
	//    1    3:getstatic       #258 <Field Level Level.WARNING>
	//    2    6:ldc2            #260 <String "com.google.protobuf.CodedOutputStream">
	//    3    9:ldc2            #262 <String "inefficientWriteStringNoTag">
	//    4   12:ldc2            #264 <String "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!">
	//    5   15:aload_2         
	//    6   16:invokevirtual   #268 <Method void Logger.logp(Level, String, String, String, Throwable)>
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
	//   14   30:invokevirtual   #270 <Method void zzba(int)>
			((zztd)this).zza(((byte []) (s)), 0, s.length);
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:iconst_0        
	//   18   36:aload_1         
	//   19   37:arraylength     
	//   20   38:invokevirtual   #272 <Method void zztd.zza(byte[], int, int)>
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
	//   29   51:invokespecial   #275 <Method void zztv$zzc(Throwable)>
	//   30   54:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw s;
		}
	}

	public abstract void zzat(long l);

	public final void zzau(long l)
	{
		zzat(zzbb(l));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokestatic    #115 <Method long zzbb(long)>
	//    3    5:invokevirtual   #280 <Method void zzat(long)>
	//    4    8:return          
	}

	public abstract void zzav(long l);

	public abstract void zzaz(int i);

	public final void zzb(double d)
	{
		zzav(Double.doubleToRawLongBits(d));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokestatic    #237 <Method long Double.doubleToRawLongBits(double)>
	//    3    5:invokevirtual   #284 <Method void zzav(long)>
	//    4    8:return          
	}

	public final void zzb(int i, long l)
	{
		zza(i, zzbb(l));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokestatic    #115 <Method long zzbb(long)>
	//    4    6:invokevirtual   #286 <Method void zza(int, long)>
	//    5    9:return          
	}

	public abstract void zzb(int i, zzte zzte1);

	public abstract void zzb(int i, zzvv zzvv1);

	public abstract void zzb(int i, String s);

	public abstract void zzb(int i, boolean flag);

	public abstract void zzb(zzvv zzvv1);

	public abstract void zzba(int i);

	public final void zzbb(int i)
	{
		zzba(zzbk(i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #157 <Method int zzbk(int)>
	//    3    5:invokevirtual   #270 <Method void zzba(int)>
	//    4    8:return          
	}

	public abstract void zzbc(int i);

	public abstract void zzc(byte byte0);

	public abstract void zzc(int i, int j);

	public abstract void zzc(int i, long l);

	public abstract void zzd(int i, int j);

	public abstract void zze(int i, int j);

	abstract void zze(byte abyte0[], int i, int j);

	public final void zzf(int i, int j)
	{
		zze(i, zzbk(j));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #157 <Method int zzbk(int)>
	//    4    6:invokevirtual   #292 <Method void zze(int, int)>
	//    5    9:return          
	}

	public abstract void zzg(int i, int j);

	public abstract void zzgb(String s);

	public final void zzs(boolean flag)
	{
		zzc((byte)flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:int2byte        
	//    3    3:invokevirtual   #297 <Method void zzc(byte)>
	//    4    6:return          
	}

	public abstract int zzvj();

	private static final Logger logger = Logger.getLogger(((Class) (com/google/android/gms/internal/measurement/zztv)).getName());
	private static final boolean zzbuo = zzxj.zzyo();
	zztx zzbup;

	static 
	{
	//    0    0:ldc1            #2   <Class zztv>
	//    1    2:invokevirtual   #33  <Method String Class.getName()>
	//    2    5:invokestatic    #39  <Method Logger Logger.getLogger(String)>
	//    3    8:putstatic       #41  <Field Logger logger>
	//    4   11:invokestatic    #47  <Method boolean zzxj.zzyo()>
	//    5   14:putstatic       #49  <Field boolean zzbuo>
	//*   6   17:return          
	}
}
