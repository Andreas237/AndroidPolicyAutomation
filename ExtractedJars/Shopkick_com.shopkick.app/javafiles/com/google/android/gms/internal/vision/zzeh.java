// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.vision;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.vision:
//			zzgf, zzei, zzfz, zzip, 
//			zzeo, zzga, zziw, zzge

final class zzeh
{

	static int zza(int i, byte abyte0[], int j, int k, zzei zzei1)
		throws zzgf
	{
		if(i >>> 3 != 0)
	//*   0    0:iload_0         
	//*   1    1:iconst_3        
	//*   2    2:iushr           
	//*   3    3:ifeq            167
		{
			int l = i & 7;
	//    4    6:iload_0         
	//    5    7:bipush          7
	//    6    9:iand            
	//    7   10:istore          5
			if(l != 5)
	//*   8   12:iload           5
	//*   9   14:iconst_5        
	//*  10   15:icmpeq          163
				switch(l)
	//*  11   18:iload           5
				{
	//*  12   20:tableswitch     0 3: default 52
	//	               0 155
	//	               1 150
	//	               2 136
	//	               3 56
				default:
					throw zzgf.zzfk();
	//   13   52:invokestatic    #12  <Method zzgf zzgf.zzfk()>
	//   14   55:athrow          

				case 3: // '\003'
					int k1 = i & -8 | 4;
	//   15   56:iload_0         
	//   16   57:bipush          -8
	//   17   59:iand            
	//   18   60:iconst_4        
	//   19   61:ior             
	//   20   62:istore          7
					i = 0;
	//   21   64:iconst_0        
	//   22   65:istore_0        
					int i1;
					int j1;
					do
					{
						i1 = i;
	//   23   66:iload_0         
	//   24   67:istore          5
						j1 = j;
	//   25   69:iload_2         
	//   26   70:istore          6
						if(j >= k)
							break;
	//   27   72:iload_2         
	//   28   73:iload_3         
	//   29   74:icmpge          116
						j = zza(abyte0, j, zzei1);
	//   30   77:aload_1         
	//   31   78:iload_2         
	//   32   79:aload           4
	//   33   81:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//   34   84:istore_2        
						i = zzei1.zzro;
	//   35   85:aload           4
	//   36   87:getfield        #21  <Field int zzei.zzro>
	//   37   90:istore_0        
						i1 = i;
	//   38   91:iload_0         
	//   39   92:istore          5
						j1 = j;
	//   40   94:iload_2         
	//   41   95:istore          6
						if(i == k1)
							break;
	//   42   97:iload_0         
	//   43   98:iload           7
	//   44  100:icmpeq          116
						j = zza(i, abyte0, j, k, zzei1);
	//   45  103:iload_0         
	//   46  104:aload_1         
	//   47  105:iload_2         
	//   48  106:iload_3         
	//   49  107:aload           4
	//   50  109:invokestatic    #23  <Method int zza(int, byte[], int, int, zzei)>
	//   51  112:istore_2        
					} while(true);
	//   52  113:goto            66
					if(j1 <= k && i1 == k1)
	//*  53  116:iload           6
	//*  54  118:iload_3         
	//*  55  119:icmpgt          132
	//*  56  122:iload           5
	//*  57  124:iload           7
	//*  58  126:icmpne          132
						return j1;
	//   59  129:iload           6
	//   60  131:ireturn         
					else
						throw zzgf.zzfo();
	//   61  132:invokestatic    #26  <Method zzgf zzgf.zzfo()>
	//   62  135:athrow          

				case 2: // '\002'
					return zza(abyte0, j, zzei1) + zzei1.zzro;
	//   63  136:aload_1         
	//   64  137:iload_2         
	//   65  138:aload           4
	//   66  140:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//   67  143:aload           4
	//   68  145:getfield        #21  <Field int zzei.zzro>
	//   69  148:iadd            
	//   70  149:ireturn         

				case 1: // '\001'
					return j + 8;
	//   71  150:iload_2         
	//   72  151:bipush          8
	//   73  153:iadd            
	//   74  154:ireturn         

				case 0: // '\0'
					return zzb(abyte0, j, zzei1);
	//   75  155:aload_1         
	//   76  156:iload_2         
	//   77  157:aload           4
	//   78  159:invokestatic    #29  <Method int zzb(byte[], int, zzei)>
	//   79  162:ireturn         
				}
			else
				return j + 4;
	//   80  163:iload_2         
	//   81  164:iconst_4        
	//   82  165:iadd            
	//   83  166:ireturn         
		} else
		{
			throw zzgf.zzfk();
	//   84  167:invokestatic    #12  <Method zzgf zzgf.zzfk()>
	//   85  170:athrow          
		}
	}

	static int zza(int i, byte abyte0[], int j, int k, zzge zzge, zzei zzei1)
	{
		zzge = ((zzge) ((zzfz)zzge));
	//    0    0:aload           4
	//    1    2:checkcast       #34  <Class zzfz>
	//    2    5:astore          4
		j = zza(abyte0, j, zzei1);
	//    3    7:aload_1         
	//    4    8:iload_2         
	//    5    9:aload           5
	//    6   11:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//    7   14:istore_2        
		((zzfz) (zzge)).zzbg(zzei1.zzro);
	//    8   15:aload           4
	//    9   17:aload           5
	//   10   19:getfield        #21  <Field int zzei.zzro>
	//   11   22:invokevirtual   #38  <Method void zzfz.zzbg(int)>
		do
		{
			if(j >= k)
				break;
	//   12   25:iload_2         
	//   13   26:iload_3         
	//   14   27:icmpge          70
			int l = zza(abyte0, j, zzei1);
	//   15   30:aload_1         
	//   16   31:iload_2         
	//   17   32:aload           5
	//   18   34:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//   19   37:istore          6
			if(i != zzei1.zzro)
				break;
	//   20   39:iload_0         
	//   21   40:aload           5
	//   22   42:getfield        #21  <Field int zzei.zzro>
	//   23   45:icmpne          70
			j = zza(abyte0, l, zzei1);
	//   24   48:aload_1         
	//   25   49:iload           6
	//   26   51:aload           5
	//   27   53:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//   28   56:istore_2        
			((zzfz) (zzge)).zzbg(zzei1.zzro);
	//   29   57:aload           4
	//   30   59:aload           5
	//   31   61:getfield        #21  <Field int zzei.zzro>
	//   32   64:invokevirtual   #38  <Method void zzfz.zzbg(int)>
		} while(true);
	//   33   67:goto            25
		return j;
	//   34   70:iload_2         
	//   35   71:ireturn         
	}

	static int zza(int i, byte abyte0[], int j, int k, zzip zzip1, zzei zzei1)
		throws zzgf
	{
		if(i >>> 3 == 0) goto _L2; else goto _L1
	//    0    0:iload_0         
	//    1    1:iconst_3        
	//    2    2:iushr           
	//    3    3:ifeq            286
_L1:
		int l = i & 7;
	//    4    6:iload_0         
	//    5    7:bipush          7
	//    6    9:iand            
	//    7   10:istore          6
		if(l == 5) goto _L4; else goto _L3
	//    8   12:iload           6
	//    9   14:iconst_5        
	//   10   15:icmpeq          268
_L3:
		l;
	//   11   18:iload           6
		JVM INSTR tableswitch 0 3: default 52
	//	               0 244
	//	               1 225
	//	               2 159
	//	               3 56;
	//   12   20:tableswitch     0 3: default 52
	//	               0 244
	//	               1 225
	//	               2 159
	//	               3 56
		   goto _L5 _L6 _L7 _L8 _L9
_L5:
		throw zzgf.zzfk();
	//   13   52:invokestatic    #12  <Method zzgf zzgf.zzfk()>
	//   14   55:athrow          
_L9:
		int j1;
		zzip zzip2;
		zzip2 = zzip.zzhf();
	//   15   56:invokestatic    #47  <Method zzip zzip.zzhf()>
	//   16   59:astore          9
		j1 = i & -8 | 4;
	//   17   61:iload_0         
	//   18   62:bipush          -8
	//   19   64:iand            
	//   20   65:iconst_4        
	//   21   66:ior             
	//   22   67:istore          8
		l = 0;
	//   23   69:iconst_0        
	//   24   70:istore          6
_L14:
		int i1;
		i1 = l;
	//   25   72:iload           6
	//   26   74:istore          7
		l = j;
	//   27   76:iload_2         
	//   28   77:istore          6
		if(j >= k) goto _L11; else goto _L10
	//   29   79:iload_2         
	//   30   80:iload_3         
	//   31   81:icmpge          131
_L10:
		l = zza(abyte0, j, zzei1);
	//   32   84:aload_1         
	//   33   85:iload_2         
	//   34   86:aload           5
	//   35   88:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//   36   91:istore          6
		j = zzei1.zzro;
	//   37   93:aload           5
	//   38   95:getfield        #21  <Field int zzei.zzro>
	//   39   98:istore_2        
		if(j == j1) goto _L13; else goto _L12
	//   40   99:iload_2         
	//   41  100:iload           8
	//   42  102:icmpeq          128
_L12:
		i1 = zza(j, abyte0, l, k, zzip2, zzei1);
	//   43  105:iload_2         
	//   44  106:aload_1         
	//   45  107:iload           6
	//   46  109:iload_3         
	//   47  110:aload           9
	//   48  112:aload           5
	//   49  114:invokestatic    #49  <Method int zza(int, byte[], int, int, zzip, zzei)>
	//   50  117:istore          7
		l = j;
	//   51  119:iload_2         
	//   52  120:istore          6
		j = i1;
	//   53  122:iload           7
	//   54  124:istore_2        
		  goto _L14
	//*  55  125:goto            72
_L13:
		i1 = j;
	//   56  128:iload_2         
	//   57  129:istore          7
_L11:
		if(l <= k && i1 == j1)
	//*  58  131:iload           6
	//*  59  133:iload_3         
	//*  60  134:icmpgt          155
	//*  61  137:iload           7
	//*  62  139:iload           8
	//*  63  141:icmpne          155
		{
			zzip1.zzb(i, ((Object) (zzip2)));
	//   64  144:aload           4
	//   65  146:iload_0         
	//   66  147:aload           9
	//   67  149:invokevirtual   #52  <Method void zzip.zzb(int, Object)>
			return l;
	//   68  152:iload           6
	//   69  154:ireturn         
		} else
		{
			throw zzgf.zzfo();
	//   70  155:invokestatic    #26  <Method zzgf zzgf.zzfo()>
	//   71  158:athrow          
		}
_L8:
		j = zza(abyte0, j, zzei1);
	//   72  159:aload_1         
	//   73  160:iload_2         
	//   74  161:aload           5
	//   75  163:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//   76  166:istore_2        
		k = zzei1.zzro;
	//   77  167:aload           5
	//   78  169:getfield        #21  <Field int zzei.zzro>
	//   79  172:istore_3        
		if(k >= 0)
	//*  80  173:iload_3         
	//*  81  174:iflt            221
		{
			if(k <= abyte0.length - j)
	//*  82  177:iload_3         
	//*  83  178:aload_1         
	//*  84  179:arraylength     
	//*  85  180:iload_2         
	//*  86  181:isub            
	//*  87  182:icmpgt          217
			{
				if(k == 0)
	//*  88  185:iload_3         
	//*  89  186:ifne            201
					zzip1.zzb(i, ((Object) (zzeo.zzrx)));
	//   90  189:aload           4
	//   91  191:iload_0         
	//   92  192:getstatic       #58  <Field zzeo zzeo.zzrx>
	//   93  195:invokevirtual   #52  <Method void zzip.zzb(int, Object)>
				else
	//*  94  198:goto            213
					zzip1.zzb(i, ((Object) (zzeo.zzb(abyte0, j, k))));
	//   95  201:aload           4
	//   96  203:iload_0         
	//   97  204:aload_1         
	//   98  205:iload_2         
	//   99  206:iload_3         
	//  100  207:invokestatic    #61  <Method zzeo zzeo.zzb(byte[], int, int)>
	//  101  210:invokevirtual   #52  <Method void zzip.zzb(int, Object)>
				return j + k;
	//  102  213:iload_2         
	//  103  214:iload_3         
	//  104  215:iadd            
	//  105  216:ireturn         
			} else
			{
				throw zzgf.zzfh();
	//  106  217:invokestatic    #64  <Method zzgf zzgf.zzfh()>
	//  107  220:athrow          
			}
		} else
		{
			throw zzgf.zzfi();
	//  108  221:invokestatic    #67  <Method zzgf zzgf.zzfi()>
	//  109  224:athrow          
		}
_L7:
		zzip1.zzb(i, ((Object) (Long.valueOf(zzb(abyte0, j)))));
	//  110  225:aload           4
	//  111  227:iload_0         
	//  112  228:aload_1         
	//  113  229:iload_2         
	//  114  230:invokestatic    #70  <Method long zzb(byte[], int)>
	//  115  233:invokestatic    #76  <Method Long Long.valueOf(long)>
	//  116  236:invokevirtual   #52  <Method void zzip.zzb(int, Object)>
		return j + 8;
	//  117  239:iload_2         
	//  118  240:bipush          8
	//  119  242:iadd            
	//  120  243:ireturn         
_L6:
		j = zzb(abyte0, j, zzei1);
	//  121  244:aload_1         
	//  122  245:iload_2         
	//  123  246:aload           5
	//  124  248:invokestatic    #29  <Method int zzb(byte[], int, zzei)>
	//  125  251:istore_2        
		zzip1.zzb(i, ((Object) (Long.valueOf(zzei1.zzrp))));
	//  126  252:aload           4
	//  127  254:iload_0         
	//  128  255:aload           5
	//  129  257:getfield        #80  <Field long zzei.zzrp>
	//  130  260:invokestatic    #76  <Method Long Long.valueOf(long)>
	//  131  263:invokevirtual   #52  <Method void zzip.zzb(int, Object)>
		return j;
	//  132  266:iload_2         
	//  133  267:ireturn         
_L4:
		zzip1.zzb(i, ((Object) (Integer.valueOf(zza(abyte0, j)))));
	//  134  268:aload           4
	//  135  270:iload_0         
	//  136  271:aload_1         
	//  137  272:iload_2         
	//  138  273:invokestatic    #83  <Method int zza(byte[], int)>
	//  139  276:invokestatic    #88  <Method Integer Integer.valueOf(int)>
	//  140  279:invokevirtual   #52  <Method void zzip.zzb(int, Object)>
		return j + 4;
	//  141  282:iload_2         
	//  142  283:iconst_4        
	//  143  284:iadd            
	//  144  285:ireturn         
_L2:
		throw zzgf.zzfk();
	//  145  286:invokestatic    #12  <Method zzgf zzgf.zzfk()>
	//  146  289:athrow          
	}

	static int zza(int i, byte abyte0[], int j, zzei zzei1)
	{
		int k = i & 0x7f;
	//    0    0:iload_0         
	//    1    1:bipush          127
	//    2    3:iand            
	//    3    4:istore          4
		i = j + 1;
	//    4    6:iload_2         
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:istore_0        
		j = ((int) (abyte0[j]));
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:baload          
	//   11   13:istore_2        
		if(j >= 0)
	//*  12   14:iload_2         
	//*  13   15:iflt            31
		{
			zzei1.zzro = k | j << 7;
	//   14   18:aload_3         
	//   15   19:iload           4
	//   16   21:iload_2         
	//   17   22:bipush          7
	//   18   24:ishl            
	//   19   25:ior             
	//   20   26:putfield        #21  <Field int zzei.zzro>
			return i;
	//   21   29:iload_0         
	//   22   30:ireturn         
		}
		k |= (j & 0x7f) << 7;
	//   23   31:iload           4
	//   24   33:iload_2         
	//   25   34:bipush          127
	//   26   36:iand            
	//   27   37:bipush          7
	//   28   39:ishl            
	//   29   40:ior             
	//   30   41:istore          4
		j = i + 1;
	//   31   43:iload_0         
	//   32   44:iconst_1        
	//   33   45:iadd            
	//   34   46:istore_2        
		i = ((int) (abyte0[i]));
	//   35   47:aload_1         
	//   36   48:iload_0         
	//   37   49:baload          
	//   38   50:istore_0        
		if(i >= 0)
	//*  39   51:iload_0         
	//*  40   52:iflt            68
		{
			zzei1.zzro = k | i << 14;
	//   41   55:aload_3         
	//   42   56:iload           4
	//   43   58:iload_0         
	//   44   59:bipush          14
	//   45   61:ishl            
	//   46   62:ior             
	//   47   63:putfield        #21  <Field int zzei.zzro>
			return j;
	//   48   66:iload_2         
	//   49   67:ireturn         
		}
		i = k | (i & 0x7f) << 14;
	//   50   68:iload           4
	//   51   70:iload_0         
	//   52   71:bipush          127
	//   53   73:iand            
	//   54   74:bipush          14
	//   55   76:ishl            
	//   56   77:ior             
	//   57   78:istore_0        
		int l = j + 1;
	//   58   79:iload_2         
	//   59   80:iconst_1        
	//   60   81:iadd            
	//   61   82:istore          5
		j = ((int) (abyte0[j]));
	//   62   84:aload_1         
	//   63   85:iload_2         
	//   64   86:baload          
	//   65   87:istore_2        
		if(j >= 0)
	//*  66   88:iload_2         
	//*  67   89:iflt            105
		{
			zzei1.zzro = i | j << 21;
	//   68   92:aload_3         
	//   69   93:iload_0         
	//   70   94:iload_2         
	//   71   95:bipush          21
	//   72   97:ishl            
	//   73   98:ior             
	//   74   99:putfield        #21  <Field int zzei.zzro>
			return l;
	//   75  102:iload           5
	//   76  104:ireturn         
		}
		k = i | (j & 0x7f) << 21;
	//   77  105:iload_0         
	//   78  106:iload_2         
	//   79  107:bipush          127
	//   80  109:iand            
	//   81  110:bipush          21
	//   82  112:ishl            
	//   83  113:ior             
	//   84  114:istore          4
		i = l + 1;
	//   85  116:iload           5
	//   86  118:iconst_1        
	//   87  119:iadd            
	//   88  120:istore_0        
		l = ((int) (abyte0[l]));
	//   89  121:aload_1         
	//   90  122:iload           5
	//   91  124:baload          
	//   92  125:istore          5
		if(l >= 0)
	//*  93  127:iload           5
	//*  94  129:iflt            146
		{
			zzei1.zzro = k | l << 28;
	//   95  132:aload_3         
	//   96  133:iload           4
	//   97  135:iload           5
	//   98  137:bipush          28
	//   99  139:ishl            
	//  100  140:ior             
	//  101  141:putfield        #21  <Field int zzei.zzro>
			return i;
	//  102  144:iload_0         
	//  103  145:ireturn         
		}
		do
		{
			j = i + 1;
	//  104  146:iload_0         
	//  105  147:iconst_1        
	//  106  148:iadd            
	//  107  149:istore_2        
			if(abyte0[i] >= 0)
	//* 108  150:aload_1         
	//* 109  151:iload_0         
	//* 110  152:baload          
	//* 111  153:iflt            173
			{
				zzei1.zzro = k | (l & 0x7f) << 28;
	//  112  156:aload_3         
	//  113  157:iload           4
	//  114  159:iload           5
	//  115  161:bipush          127
	//  116  163:iand            
	//  117  164:bipush          28
	//  118  166:ishl            
	//  119  167:ior             
	//  120  168:putfield        #21  <Field int zzei.zzro>
				return j;
	//  121  171:iload_2         
	//  122  172:ireturn         
			}
			i = j;
	//  123  173:iload_2         
	//  124  174:istore_0        
		} while(true);
	//  125  175:goto            146
	}

	static int zza(byte abyte0[], int i)
	{
		byte byte0 = abyte0[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:istore_2        
		byte byte1 = abyte0[i + 1];
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:iconst_1        
	//    7    7:iadd            
	//    8    8:baload          
	//    9    9:istore_3        
		byte byte2 = abyte0[i + 2];
	//   10   10:aload_0         
	//   11   11:iload_1         
	//   12   12:iconst_2        
	//   13   13:iadd            
	//   14   14:baload          
	//   15   15:istore          4
		return (abyte0[i + 3] & 0xff) << 24 | (byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16);
	//   16   17:aload_0         
	//   17   18:iload_1         
	//   18   19:iconst_3        
	//   19   20:iadd            
	//   20   21:baload          
	//   21   22:sipush          255
	//   22   25:iand            
	//   23   26:bipush          24
	//   24   28:ishl            
	//   25   29:iload_2         
	//   26   30:sipush          255
	//   27   33:iand            
	//   28   34:iload_3         
	//   29   35:sipush          255
	//   30   38:iand            
	//   31   39:bipush          8
	//   32   41:ishl            
	//   33   42:ior             
	//   34   43:iload           4
	//   35   45:sipush          255
	//   36   48:iand            
	//   37   49:bipush          16
	//   38   51:ishl            
	//   39   52:ior             
	//   40   53:ior             
	//   41   54:ireturn         
	}

	static int zza(byte abyte0[], int i, zzei zzei1)
	{
		int j = i + 1;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore_3        
		i = ((int) (abyte0[i]));
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:baload          
	//    7    7:istore_1        
		if(i >= 0)
	//*   8    8:iload_1         
	//*   9    9:iflt            19
		{
			zzei1.zzro = i;
	//   10   12:aload_2         
	//   11   13:iload_1         
	//   12   14:putfield        #21  <Field int zzei.zzro>
			return j;
	//   13   17:iload_3         
	//   14   18:ireturn         
		} else
		{
			return zza(i, abyte0, j, zzei1);
	//   15   19:iload_1         
	//   16   20:aload_0         
	//   17   21:iload_3         
	//   18   22:aload_2         
	//   19   23:invokestatic    #91  <Method int zza(int, byte[], int, zzei)>
	//   20   26:ireturn         
		}
	}

	static int zza(byte abyte0[], int i, zzge zzge, zzei zzei1)
		throws IOException
	{
		zzge = ((zzge) ((zzfz)zzge));
	//    0    0:aload_2         
	//    1    1:checkcast       #34  <Class zzfz>
	//    2    4:astore_2        
		i = zza(abyte0, i, zzei1);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_3         
	//    6    8:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//    7   11:istore_1        
		int j;
		for(j = zzei1.zzro + i; i < j;)
	//*   8   12:aload_3         
	//*   9   13:getfield        #21  <Field int zzei.zzro>
	//*  10   16:iload_1         
	//*  11   17:iadd            
	//*  12   18:istore          4
	//*  13   20:iload_1         
	//*  14   21:iload           4
	//*  15   23:icmpge          44
		{
			i = zza(abyte0, i, zzei1);
	//   16   26:aload_0         
	//   17   27:iload_1         
	//   18   28:aload_3         
	//   19   29:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//   20   32:istore_1        
			((zzfz) (zzge)).zzbg(zzei1.zzro);
	//   21   33:aload_2         
	//   22   34:aload_3         
	//   23   35:getfield        #21  <Field int zzei.zzro>
	//   24   38:invokevirtual   #38  <Method void zzfz.zzbg(int)>
		}

	//*  25   41:goto            20
		if(i == j)
	//*  26   44:iload_1         
	//*  27   45:iload           4
	//*  28   47:icmpne          52
			return i;
	//   29   50:iload_1         
	//   30   51:ireturn         
		else
			throw zzgf.zzfh();
	//   31   52:invokestatic    #64  <Method zzgf zzgf.zzfh()>
	//   32   55:athrow          
	}

	static int zzb(byte abyte0[], int i, zzei zzei1)
	{
		int j = i + 1;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:iadd            
	//    3    3:istore_3        
		long l = abyte0[i];
	//    4    4:aload_0         
	//    5    5:iload_1         
	//    6    6:baload          
	//    7    7:i2l             
	//    8    8:lstore          5
		if(l >= 0L)
	//*   9   10:lload           5
	//*  10   12:lconst_0        
	//*  11   13:lcmp            
	//*  12   14:iflt            25
		{
			zzei1.zzrp = l;
	//   13   17:aload_2         
	//   14   18:lload           5
	//   15   20:putfield        #80  <Field long zzei.zzrp>
			return j;
	//   16   23:iload_3         
	//   17   24:ireturn         
		}
		i = j + 1;
	//   18   25:iload_3         
	//   19   26:iconst_1        
	//   20   27:iadd            
	//   21   28:istore_1        
		byte byte0 = abyte0[j];
	//   22   29:aload_0         
	//   23   30:iload_3         
	//   24   31:baload          
	//   25   32:istore          4
		l = l & 127L | (long)(byte0 & 0x7f) << 7;
	//   26   34:lload           5
	//   27   36:ldc2w           #96  <Long 127L>
	//   28   39:land            
	//   29   40:iload           4
	//   30   42:bipush          127
	//   31   44:iand            
	//   32   45:i2l             
	//   33   46:bipush          7
	//   34   48:lshl            
	//   35   49:lor             
	//   36   50:lstore          5
		j = 7;
	//   37   52:bipush          7
	//   38   54:istore_3        
		while(byte0 < 0) 
	//*  39   55:iload           4
	//*  40   57:ifge            90
		{
			byte0 = abyte0[i];
	//   41   60:aload_0         
	//   42   61:iload_1         
	//   43   62:baload          
	//   44   63:istore          4
			j += 7;
	//   45   65:iload_3         
	//   46   66:bipush          7
	//   47   68:iadd            
	//   48   69:istore_3        
			l |= (long)(byte0 & 0x7f) << j;
	//   49   70:lload           5
	//   50   72:iload           4
	//   51   74:bipush          127
	//   52   76:iand            
	//   53   77:i2l             
	//   54   78:iload_3         
	//   55   79:lshl            
	//   56   80:lor             
	//   57   81:lstore          5
			i++;
	//   58   83:iload_1         
	//   59   84:iconst_1        
	//   60   85:iadd            
	//   61   86:istore_1        
		}
	//*  62   87:goto            55
		zzei1.zzrp = l;
	//   63   90:aload_2         
	//   64   91:lload           5
	//   65   93:putfield        #80  <Field long zzei.zzrp>
		return i;
	//   66   96:iload_1         
	//   67   97:ireturn         
	}

	static long zzb(byte abyte0[], int i)
	{
		long l = abyte0[i];
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:baload          
	//    3    3:i2l             
	//    4    4:lstore_2        
		long l1 = abyte0[i + 1];
	//    5    5:aload_0         
	//    6    6:iload_1         
	//    7    7:iconst_1        
	//    8    8:iadd            
	//    9    9:baload          
	//   10   10:i2l             
	//   11   11:lstore          4
		long l2 = abyte0[i + 2];
	//   12   13:aload_0         
	//   13   14:iload_1         
	//   14   15:iconst_2        
	//   15   16:iadd            
	//   16   17:baload          
	//   17   18:i2l             
	//   18   19:lstore          6
		long l3 = abyte0[i + 3];
	//   19   21:aload_0         
	//   20   22:iload_1         
	//   21   23:iconst_3        
	//   22   24:iadd            
	//   23   25:baload          
	//   24   26:i2l             
	//   25   27:lstore          8
		long l4 = abyte0[i + 4];
	//   26   29:aload_0         
	//   27   30:iload_1         
	//   28   31:iconst_4        
	//   29   32:iadd            
	//   30   33:baload          
	//   31   34:i2l             
	//   32   35:lstore          10
		long l5 = abyte0[i + 5];
	//   33   37:aload_0         
	//   34   38:iload_1         
	//   35   39:iconst_5        
	//   36   40:iadd            
	//   37   41:baload          
	//   38   42:i2l             
	//   39   43:lstore          12
		long l6 = abyte0[i + 6];
	//   40   45:aload_0         
	//   41   46:iload_1         
	//   42   47:bipush          6
	//   43   49:iadd            
	//   44   50:baload          
	//   45   51:i2l             
	//   46   52:lstore          14
		return ((long)abyte0[i + 7] & 255L) << 56 | (l & 255L | (l1 & 255L) << 8 | (l2 & 255L) << 16 | (l3 & 255L) << 24 | (l4 & 255L) << 32 | (l5 & 255L) << 40 | (l6 & 255L) << 48);
	//   47   54:aload_0         
	//   48   55:iload_1         
	//   49   56:bipush          7
	//   50   58:iadd            
	//   51   59:baload          
	//   52   60:i2l             
	//   53   61:ldc2w           #98  <Long 255L>
	//   54   64:land            
	//   55   65:bipush          56
	//   56   67:lshl            
	//   57   68:lload_2         
	//   58   69:ldc2w           #98  <Long 255L>
	//   59   72:land            
	//   60   73:lload           4
	//   61   75:ldc2w           #98  <Long 255L>
	//   62   78:land            
	//   63   79:bipush          8
	//   64   81:lshl            
	//   65   82:lor             
	//   66   83:lload           6
	//   67   85:ldc2w           #98  <Long 255L>
	//   68   88:land            
	//   69   89:bipush          16
	//   70   91:lshl            
	//   71   92:lor             
	//   72   93:lload           8
	//   73   95:ldc2w           #98  <Long 255L>
	//   74   98:land            
	//   75   99:bipush          24
	//   76  101:lshl            
	//   77  102:lor             
	//   78  103:lload           10
	//   79  105:ldc2w           #98  <Long 255L>
	//   80  108:land            
	//   81  109:bipush          32
	//   82  111:lshl            
	//   83  112:lor             
	//   84  113:lload           12
	//   85  115:ldc2w           #98  <Long 255L>
	//   86  118:land            
	//   87  119:bipush          40
	//   88  121:lshl            
	//   89  122:lor             
	//   90  123:lload           14
	//   91  125:ldc2w           #98  <Long 255L>
	//   92  128:land            
	//   93  129:bipush          48
	//   94  131:lshl            
	//   95  132:lor             
	//   96  133:lor             
	//   97  134:lreturn         
	}

	static double zzc(byte abyte0[], int i)
	{
		return Double.longBitsToDouble(zzb(abyte0, i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #70  <Method long zzb(byte[], int)>
	//    3    5:invokestatic    #107 <Method double Double.longBitsToDouble(long)>
	//    4    8:dreturn         
	}

	static int zzc(byte abyte0[], int i, zzei zzei1)
		throws zzgf
	{
		i = zza(abyte0, i, zzei1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//    4    6:istore_1        
		int j = zzei1.zzro;
	//    5    7:aload_2         
	//    6    8:getfield        #21  <Field int zzei.zzro>
	//    7   11:istore_3        
		if(j >= 0)
	//*   8   12:iload_3         
	//*   9   13:iflt            49
		{
			if(j == 0)
	//*  10   16:iload_3         
	//*  11   17:ifne            28
			{
				zzei1.zzrq = "";
	//   12   20:aload_2         
	//   13   21:ldc1            #109 <String "">
	//   14   23:putfield        #113 <Field Object zzei.zzrq>
				return i;
	//   15   26:iload_1         
	//   16   27:ireturn         
			} else
			{
				zzei1.zzrq = ((Object) (new String(abyte0, i, j, zzga.UTF_8)));
	//   17   28:aload_2         
	//   18   29:new             #115 <Class String>
	//   19   32:dup             
	//   20   33:aload_0         
	//   21   34:iload_1         
	//   22   35:iload_3         
	//   23   36:getstatic       #121 <Field java.nio.charset.Charset zzga.UTF_8>
	//   24   39:invokespecial   #125 <Method void String(byte[], int, int, java.nio.charset.Charset)>
	//   25   42:putfield        #113 <Field Object zzei.zzrq>
				return i + j;
	//   26   45:iload_1         
	//   27   46:iload_3         
	//   28   47:iadd            
	//   29   48:ireturn         
			}
		} else
		{
			throw zzgf.zzfi();
	//   30   49:invokestatic    #67  <Method zzgf zzgf.zzfi()>
	//   31   52:athrow          
		}
	}

	static float zzd(byte abyte0[], int i)
	{
		return Float.intBitsToFloat(zza(abyte0, i));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokestatic    #83  <Method int zza(byte[], int)>
	//    3    5:invokestatic    #133 <Method float Float.intBitsToFloat(int)>
	//    4    8:freturn         
	}

	static int zzd(byte abyte0[], int i, zzei zzei1)
		throws zzgf
	{
		i = zza(abyte0, i, zzei1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//    4    6:istore_1        
		int j = zzei1.zzro;
	//    5    7:aload_2         
	//    6    8:getfield        #21  <Field int zzei.zzro>
	//    7   11:istore_3        
		if(j >= 0)
	//*   8   12:iload_3         
	//*   9   13:iflt            42
		{
			if(j == 0)
	//*  10   16:iload_3         
	//*  11   17:ifne            28
			{
				zzei1.zzrq = "";
	//   12   20:aload_2         
	//   13   21:ldc1            #109 <String "">
	//   14   23:putfield        #113 <Field Object zzei.zzrq>
				return i;
	//   15   26:iload_1         
	//   16   27:ireturn         
			} else
			{
				zzei1.zzrq = ((Object) (zziw.zzi(abyte0, i, j)));
	//   17   28:aload_2         
	//   18   29:aload_0         
	//   19   30:iload_1         
	//   20   31:iload_3         
	//   21   32:invokestatic    #139 <Method String zziw.zzi(byte[], int, int)>
	//   22   35:putfield        #113 <Field Object zzei.zzrq>
				return i + j;
	//   23   38:iload_1         
	//   24   39:iload_3         
	//   25   40:iadd            
	//   26   41:ireturn         
			}
		} else
		{
			throw zzgf.zzfi();
	//   27   42:invokestatic    #67  <Method zzgf zzgf.zzfi()>
	//   28   45:athrow          
		}
	}

	static int zze(byte abyte0[], int i, zzei zzei1)
		throws zzgf
	{
		i = zza(abyte0, i, zzei1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #15  <Method int zza(byte[], int, zzei)>
	//    4    6:istore_1        
		int j = zzei1.zzro;
	//    5    7:aload_2         
	//    6    8:getfield        #21  <Field int zzei.zzro>
	//    7   11:istore_3        
		if(j >= 0)
	//*   8   12:iload_3         
	//*   9   13:iflt            55
		{
			if(j <= abyte0.length - i)
	//*  10   16:iload_3         
	//*  11   17:aload_0         
	//*  12   18:arraylength     
	//*  13   19:iload_1         
	//*  14   20:isub            
	//*  15   21:icmpgt          51
			{
				if(j == 0)
	//*  16   24:iload_3         
	//*  17   25:ifne            37
				{
					zzei1.zzrq = ((Object) (zzeo.zzrx));
	//   18   28:aload_2         
	//   19   29:getstatic       #58  <Field zzeo zzeo.zzrx>
	//   20   32:putfield        #113 <Field Object zzei.zzrq>
					return i;
	//   21   35:iload_1         
	//   22   36:ireturn         
				} else
				{
					zzei1.zzrq = ((Object) (zzeo.zzb(abyte0, i, j)));
	//   23   37:aload_2         
	//   24   38:aload_0         
	//   25   39:iload_1         
	//   26   40:iload_3         
	//   27   41:invokestatic    #61  <Method zzeo zzeo.zzb(byte[], int, int)>
	//   28   44:putfield        #113 <Field Object zzei.zzrq>
					return i + j;
	//   29   47:iload_1         
	//   30   48:iload_3         
	//   31   49:iadd            
	//   32   50:ireturn         
				}
			} else
			{
				throw zzgf.zzfh();
	//   33   51:invokestatic    #64  <Method zzgf zzgf.zzfh()>
	//   34   54:athrow          
			}
		} else
		{
			throw zzgf.zzfi();
	//   35   55:invokestatic    #67  <Method zzgf zzgf.zzfi()>
	//   36   58:athrow          
		}
	}
}
