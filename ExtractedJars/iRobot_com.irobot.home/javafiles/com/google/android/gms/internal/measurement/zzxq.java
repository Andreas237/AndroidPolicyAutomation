// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxn, zzxj, zzxl, zzxp, 
//			zzxm, zzuv

final class zzxq extends zzxn
{

	zzxq()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void zzxn()>
	//    2    4:return          
	}

	private static int zza(byte abyte0[], int i, long l, int j)
	{
		switch(j)
	//*   0    0:iload           4
		{
	//*   1    2:tableswitch     0 2: default 28
	//	               0 63
	//	               1 53
	//	               2 36
		default:
			throw new AssertionError();
	//    2   28:new             #13  <Class AssertionError>
	//    3   31:dup             
	//    4   32:invokespecial   #14  <Method void AssertionError()>
	//    5   35:athrow          

		case 2: // '\002'
			return zzxl.zzd(i, ((int) (zzxj.zza(abyte0, l))), ((int) (zzxj.zza(abyte0, l + 1L))));
	//    6   36:iload_1         
	//    7   37:aload_0         
	//    8   38:lload_2         
	//    9   39:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   10   42:aload_0         
	//   11   43:lload_2         
	//   12   44:lconst_1        
	//   13   45:ladd            
	//   14   46:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   15   49:invokestatic    #25  <Method int zzxl.zzd(int, int, int)>
	//   16   52:ireturn         

		case 1: // '\001'
			return zzxl.zzr(i, ((int) (zzxj.zza(abyte0, l))));
	//   17   53:iload_1         
	//   18   54:aload_0         
	//   19   55:lload_2         
	//   20   56:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   21   59:invokestatic    #29  <Method int zzxl.zzr(int, int)>
	//   22   62:ireturn         

		case 0: // '\0'
			return zzxl.zzca(i);
	//   23   63:iload_1         
	//   24   64:invokestatic    #33  <Method int zzxl.zzca(int)>
	//   25   67:ireturn         
		}
	}

	final int zzb(int i, byte abyte0[], int j, int k)
	{
		long l2;
label0:
		{
			if((j | k | abyte0.length - k) < 0)
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:ior             
	//*   3    4:aload_2         
	//*   4    5:arraylength     
	//*   5    6:iload           4
	//*   6    8:isub            
	//*   7    9:ior             
	//*   8   10:ifge            53
				throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] {
					Integer.valueOf(abyte0.length), Integer.valueOf(j), Integer.valueOf(k)
				}));
	//    9   13:new             #37  <Class ArrayIndexOutOfBoundsException>
	//   10   16:dup             
	//   11   17:ldc1            #39  <String "Array length=%d, index=%d, limit=%d">
	//   12   19:iconst_3        
	//   13   20:anewarray       Object[]
	//   14   23:dup             
	//   15   24:iconst_0        
	//   16   25:aload_2         
	//   17   26:arraylength     
	//   18   27:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   19   30:aastore         
	//   20   31:dup             
	//   21   32:iconst_1        
	//   22   33:iload_3         
	//   23   34:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_2        
	//   27   40:iload           4
	//   28   42:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   29   45:aastore         
	//   30   46:invokestatic    #53  <Method String String.format(String, Object[])>
	//   31   49:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//   32   52:athrow          
			l2 = j;
	//   33   53:iload_3         
	//   34   54:i2l             
	//   35   55:lstore          7
			j = (int)((long)k - l2);
	//   36   57:iload           4
	//   37   59:i2l             
	//   38   60:lload           7
	//   39   62:lsub            
	//   40   63:l2i             
	//   41   64:istore_3        
			if(j < 16)
	//*  42   65:iload_3         
	//*  43   66:bipush          16
	//*  44   68:icmpge          76
			{
				i = 0;
	//   45   71:iconst_0        
	//   46   72:istore_1        
				break label0;
	//   47   73:goto            114
			}
			long l = l2;
	//   48   76:lload           7
	//   49   78:lstore          5
			for(i = 0; i < j;)
	//*  50   80:iconst_0        
	//*  51   81:istore_1        
	//*  52   82:iload_1         
	//*  53   83:iload_3         
	//*  54   84:icmpge          112
			{
				if(zzxj.zza(abyte0, l) < 0)
	//*  55   87:aload_2         
	//*  56   88:lload           5
	//*  57   90:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//*  58   93:ifge            99
					break label0;
	//   59   96:goto            114
				i++;
	//   60   99:iload_1         
	//   61  100:iconst_1        
	//   62  101:iadd            
	//   63  102:istore_1        
				l++;
	//   64  103:lload           5
	//   65  105:lconst_1        
	//   66  106:ladd            
	//   67  107:lstore          5
			}

	//*  68  109:goto            82
			i = j;
	//   69  112:iload_3         
	//   70  113:istore_1        
		}
		j -= i;
	//   71  114:iload_3         
	//   72  115:iload_1         
	//   73  116:isub            
	//   74  117:istore_3        
		long l1 = l2 + (long)i;
	//   75  118:lload           7
	//   76  120:iload_1         
	//   77  121:i2l             
	//   78  122:ladd            
	//   79  123:lstore          5
		i = j;
	//   80  125:iload_3         
	//   81  126:istore_1        
		do
		{
label1:
			{
				long l3;
				do
				{
					do
					{
						j = 0;
	//   82  127:iconst_0        
	//   83  128:istore_3        
						do
						{
							l2 = l1;
	//   84  129:lload           5
	//   85  131:lstore          7
							if(i <= 0)
								break;
	//   86  133:iload_1         
	//   87  134:ifle            165
							l2 = l1 + 1L;
	//   88  137:lload           5
	//   89  139:lconst_1        
	//   90  140:ladd            
	//   91  141:lstore          7
							j = ((int) (zzxj.zza(abyte0, l1)));
	//   92  143:aload_2         
	//   93  144:lload           5
	//   94  146:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   95  149:istore_3        
							if(j < 0)
								break;
	//   96  150:iload_3         
	//   97  151:iflt            165
							i--;
	//   98  154:iload_1         
	//   99  155:iconst_1        
	//  100  156:isub            
	//  101  157:istore_1        
							l1 = l2;
	//  102  158:lload           7
	//  103  160:lstore          5
						} while(true);
	//  104  162:goto            129
						if(i == 0)
	//* 105  165:iload_1         
	//* 106  166:ifne            171
							return 0;
	//  107  169:iconst_0        
	//  108  170:ireturn         
						i--;
	//  109  171:iload_1         
	//  110  172:iconst_1        
	//  111  173:isub            
	//  112  174:istore_1        
						if(j >= -32)
							break;
	//  113  175:iload_3         
	//  114  176:bipush          -32
	//  115  178:icmpge          221
						if(i == 0)
	//* 116  181:iload_1         
	//* 117  182:ifne            187
							return j;
	//  118  185:iload_3         
	//  119  186:ireturn         
						i--;
	//  120  187:iload_1         
	//  121  188:iconst_1        
	//  122  189:isub            
	//  123  190:istore_1        
						if(j >= -62)
	//* 124  191:iload_3         
	//* 125  192:bipush          -62
	//* 126  194:icmplt          219
						{
							if(zzxj.zza(abyte0, l2) > -65)
	//* 127  197:aload_2         
	//* 128  198:lload           7
	//* 129  200:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//* 130  203:bipush          -65
	//* 131  205:icmple          210
								return -1;
	//  132  208:iconst_m1       
	//  133  209:ireturn         
							l1 = l2 + 1L;
	//  134  210:lload           7
	//  135  212:lconst_1        
	//  136  213:ladd            
	//  137  214:lstore          5
						} else
	//* 138  216:goto            127
						{
							return -1;
	//  139  219:iconst_m1       
	//  140  220:ireturn         
						}
					} while(true);
					if(j >= -16)
						break label1;
	//  141  221:iload_3         
	//  142  222:bipush          -16
	//  143  224:icmpge          311
					if(i < 2)
	//* 144  227:iload_1         
	//* 145  228:iconst_2        
	//* 146  229:icmpge          241
						return zza(abyte0, j, l2, i);
	//  147  232:aload_2         
	//  148  233:iload_3         
	//  149  234:lload           7
	//  150  236:iload_1         
	//  151  237:invokestatic    #58  <Method int zza(byte[], int, long, int)>
	//  152  240:ireturn         
					i -= 2;
	//  153  241:iload_1         
	//  154  242:iconst_2        
	//  155  243:isub            
	//  156  244:istore_1        
					l3 = l2 + 1L;
	//  157  245:lload           7
	//  158  247:lconst_1        
	//  159  248:ladd            
	//  160  249:lstore          9
					k = ((int) (zzxj.zza(abyte0, l2)));
	//  161  251:aload_2         
	//  162  252:lload           7
	//  163  254:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  164  257:istore          4
					if(k > -65 || j == -32 && k < -96 || j == -19 && k >= -96)
						break;
	//  165  259:iload           4
	//  166  261:bipush          -65
	//  167  263:icmpgt          309
	//  168  266:iload_3         
	//  169  267:bipush          -32
	//  170  269:icmpne          279
	//  171  272:iload           4
	//  172  274:bipush          -96
	//  173  276:icmplt          309
	//  174  279:iload_3         
	//  175  280:bipush          -19
	//  176  282:icmpne          292
	//  177  285:iload           4
	//  178  287:bipush          -96
	//  179  289:icmpge          309
					l1 = l3 + 1L;
	//  180  292:lload           9
	//  181  294:lconst_1        
	//  182  295:ladd            
	//  183  296:lstore          5
				} while(zzxj.zza(abyte0, l3) <= -65);
	//  184  298:aload_2         
	//  185  299:lload           9
	//  186  301:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  187  304:bipush          -65
	//  188  306:icmple          127
				return -1;
	//  189  309:iconst_m1       
	//  190  310:ireturn         
			}
			if(i < 3)
	//* 191  311:iload_1         
	//* 192  312:iconst_3        
	//* 193  313:icmpge          325
				return zza(abyte0, j, l2, i);
	//  194  316:aload_2         
	//  195  317:iload_3         
	//  196  318:lload           7
	//  197  320:iload_1         
	//  198  321:invokestatic    #58  <Method int zza(byte[], int, long, int)>
	//  199  324:ireturn         
			i -= 3;
	//  200  325:iload_1         
	//  201  326:iconst_3        
	//  202  327:isub            
	//  203  328:istore_1        
			l1 = l2 + 1L;
	//  204  329:lload           7
	//  205  331:lconst_1        
	//  206  332:ladd            
	//  207  333:lstore          5
			k = ((int) (zzxj.zza(abyte0, l2)));
	//  208  335:aload_2         
	//  209  336:lload           7
	//  210  338:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  211  341:istore          4
			if(k > -65 || (j << 28) + (k + 112) >> 30 != 0)
				break;
	//  212  343:iload           4
	//  213  345:bipush          -65
	//  214  347:icmpgt          400
	//  215  350:iload_3         
	//  216  351:bipush          28
	//  217  353:ishl            
	//  218  354:iload           4
	//  219  356:bipush          112
	//  220  358:iadd            
	//  221  359:iadd            
	//  222  360:bipush          30
	//  223  362:ishr            
	//  224  363:ifne            400
			l2 = l1 + 1L;
	//  225  366:lload           5
	//  226  368:lconst_1        
	//  227  369:ladd            
	//  228  370:lstore          7
			if(zzxj.zza(abyte0, l1) > -65)
				break;
	//  229  372:aload_2         
	//  230  373:lload           5
	//  231  375:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  232  378:bipush          -65
	//  233  380:icmpgt          400
			l1 = l2 + 1L;
	//  234  383:lload           7
	//  235  385:lconst_1        
	//  236  386:ladd            
	//  237  387:lstore          5
		} while(zzxj.zza(abyte0, l2) <= -65);
	//  238  389:aload_2         
	//  239  390:lload           7
	//  240  392:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  241  395:bipush          -65
	//  242  397:icmple          127
		return -1;
	//  243  400:iconst_m1       
	//  244  401:ireturn         
	}

	final int zzb(CharSequence charsequence, byte abyte0[], int i, int j)
	{
		int k;
		long l;
		long l4;
		long l1 = i;
	//    0    0:iload_3         
	//    1    1:i2l             
	//    2    2:lstore          10
		l4 = (long)j + l1;
	//    3    4:iload           4
	//    4    6:i2l             
	//    5    7:lload           10
	//    6    9:ladd            
	//    7   10:lstore          12
		k = charsequence.length();
	//    8   12:aload_1         
	//    9   13:invokeinterface #65  <Method int CharSequence.length()>
	//   10   18:istore          7
		if(k > j || abyte0.length - j < i)
	//*  11   20:iload           7
	//*  12   22:iload           4
	//*  13   24:icmpgt          601
	//*  14   27:aload_2         
	//*  15   28:arraylength     
	//*  16   29:iload           4
	//*  17   31:isub            
	//*  18   32:iload_3         
	//*  19   33:icmpge          39
			break MISSING_BLOCK_LABEL_601;
	//   20   36:goto            601
		j = 0;
	//   21   39:iconst_0        
	//   22   40:istore          4
		do
		{
			if(j >= k)
				break;
	//   23   42:iload           4
	//   24   44:iload           7
	//   25   46:icmpge          88
			i = ((int) (charsequence.charAt(j)));
	//   26   49:aload_1         
	//   27   50:iload           4
	//   28   52:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   29   57:istore_3        
			if(i >= 128)
				break;
	//   30   58:iload_3         
	//   31   59:sipush          128
	//   32   62:icmpge          88
			zzxj.zza(abyte0, l1, (byte)i);
	//   33   65:aload_2         
	//   34   66:lload           10
	//   35   68:iload_3         
	//   36   69:int2byte        
	//   37   70:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
			j++;
	//   38   73:iload           4
	//   39   75:iconst_1        
	//   40   76:iadd            
	//   41   77:istore          4
			l1 = 1L + l1;
	//   42   79:lconst_1        
	//   43   80:lload           10
	//   44   82:ladd            
	//   45   83:lstore          10
		} while(true);
	//   46   85:goto            42
		i = j;
	//   47   88:iload           4
	//   48   90:istore_3        
		l = l1;
	//   49   91:lload           10
	//   50   93:lstore          8
		if(j == k)
	//*  51   95:iload           4
	//*  52   97:iload           7
	//*  53   99:icmpne          106
			return (int)l1;
	//   54  102:lload           10
	//   55  104:l2i             
	//   56  105:ireturn         
_L6:
		char c;
		if(i >= k)
			break MISSING_BLOCK_LABEL_597;
	//   57  106:iload_3         
	//   58  107:iload           7
	//   59  109:icmpge          597
		c = charsequence.charAt(i);
	//   60  112:aload_1         
	//   61  113:iload_3         
	//   62  114:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   63  119:istore          5
		if(c >= '\200' || l >= l4) goto _L2; else goto _L1
	//   64  121:iload           5
	//   65  123:sipush          128
	//   66  126:icmpge          163
	//   67  129:lload           8
	//   68  131:lload           12
	//   69  133:lcmp            
	//   70  134:ifge            163
_L1:
		long l2;
		l2 = l + 1L;
	//   71  137:lload           8
	//   72  139:lconst_1        
	//   73  140:ladd            
	//   74  141:lstore          10
		j = ((int) (c));
	//   75  143:iload           5
	//   76  145:istore          4
_L4:
		zzxj.zza(abyte0, l, (byte)j);
	//   77  147:aload_2         
	//   78  148:lload           8
	//   79  150:iload           4
	//   80  152:int2byte        
	//   81  153:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
		l = l2;
	//   82  156:lload           10
	//   83  158:lstore          8
		break MISSING_BLOCK_LABEL_474;
	//   84  160:goto            474
_L2:
		if(c < '\u0800' && l <= l4 - 2L)
	//*  85  163:iload           5
	//*  86  165:sipush          2048
	//*  87  168:icmpge          230
	//*  88  171:lload           8
	//*  89  173:lload           12
	//*  90  175:ldc2w           #73  <Long 2L>
	//*  91  178:lsub            
	//*  92  179:lcmp            
	//*  93  180:ifgt            230
		{
			l2 = l + 1L;
	//   94  183:lload           8
	//   95  185:lconst_1        
	//   96  186:ladd            
	//   97  187:lstore          10
			zzxj.zza(abyte0, l, (byte)(c >>> 6 | 0x3c0));
	//   98  189:aload_2         
	//   99  190:lload           8
	//  100  192:iload           5
	//  101  194:bipush          6
	//  102  196:iushr           
	//  103  197:sipush          960
	//  104  200:ior             
	//  105  201:int2byte        
	//  106  202:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
			l = l2 + 1L;
	//  107  205:lload           10
	//  108  207:lconst_1        
	//  109  208:ladd            
	//  110  209:lstore          8
			zzxj.zza(abyte0, l2, (byte)(c & 0x3f | 0x80));
	//  111  211:aload_2         
	//  112  212:lload           10
	//  113  214:iload           5
	//  114  216:bipush          63
	//  115  218:iand            
	//  116  219:sipush          128
	//  117  222:ior             
	//  118  223:int2byte        
	//  119  224:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
			break MISSING_BLOCK_LABEL_474;
	//  120  227:goto            474
		}
		if(c >= '\uD800' && '\uDFFF' >= c || l > l4 - 3L)
			break; /* Loop/switch isn't completed */
	//  121  230:iload           5
	//  122  232:ldc1            #75  <Int 55296>
	//  123  234:icmplt          244
	//  124  237:ldc1            #76  <Int 57343>
	//  125  239:iload           5
	//  126  241:icmpge          323
	//  127  244:lload           8
	//  128  246:lload           12
	//  129  248:ldc2w           #77  <Long 3L>
	//  130  251:lsub            
	//  131  252:lcmp            
	//  132  253:ifgt            323
		l2 = l + 1L;
	//  133  256:lload           8
	//  134  258:lconst_1        
	//  135  259:ladd            
	//  136  260:lstore          10
		zzxj.zza(abyte0, l, (byte)(c >>> 12 | 0x1e0));
	//  137  262:aload_2         
	//  138  263:lload           8
	//  139  265:iload           5
	//  140  267:bipush          12
	//  141  269:iushr           
	//  142  270:sipush          480
	//  143  273:ior             
	//  144  274:int2byte        
	//  145  275:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
		l = l2 + 1L;
	//  146  278:lload           10
	//  147  280:lconst_1        
	//  148  281:ladd            
	//  149  282:lstore          8
		zzxj.zza(abyte0, l2, (byte)(c >>> 6 & 0x3f | 0x80));
	//  150  284:aload_2         
	//  151  285:lload           10
	//  152  287:iload           5
	//  153  289:bipush          6
	//  154  291:iushr           
	//  155  292:bipush          63
	//  156  294:iand            
	//  157  295:sipush          128
	//  158  298:ior             
	//  159  299:int2byte        
	//  160  300:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
		l2 = l + 1L;
	//  161  303:lload           8
	//  162  305:lconst_1        
	//  163  306:ladd            
	//  164  307:lstore          10
		j = c & 0x3f | 0x80;
	//  165  309:iload           5
	//  166  311:bipush          63
	//  167  313:iand            
	//  168  314:sipush          128
	//  169  317:ior             
	//  170  318:istore          4
		if(true) goto _L4; else goto _L3
	//  171  320:goto            147
_L3:
		if(l > l4 - 4L)
			break MISSING_BLOCK_LABEL_494;
	//  172  323:lload           8
	//  173  325:lload           12
	//  174  327:ldc2w           #79  <Long 4L>
	//  175  330:lsub            
	//  176  331:lcmp            
	//  177  332:ifgt            494
		j = i + 1;
	//  178  335:iload_3         
	//  179  336:iconst_1        
	//  180  337:iadd            
	//  181  338:istore          4
		if(j == k)
			break; /* Loop/switch isn't completed */
	//  182  340:iload           4
	//  183  342:iload           7
	//  184  344:icmpeq          481
		char c2 = charsequence.charAt(j);
	//  185  347:aload_1         
	//  186  348:iload           4
	//  187  350:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  188  355:istore          6
		if(!Character.isSurrogatePair(c, c2))
	//* 189  357:iload           5
	//* 190  359:iload           6
	//* 191  361:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//* 192  364:ifne            373
		{
			i = j;
	//  193  367:iload           4
	//  194  369:istore_3        
			break; /* Loop/switch isn't completed */
	//  195  370:goto            481
		}
		i = Character.toCodePoint(c, c2);
	//  196  373:iload           5
	//  197  375:iload           6
	//  198  377:invokestatic    #90  <Method int Character.toCodePoint(char, char)>
	//  199  380:istore_3        
		long l3 = l + 1L;
	//  200  381:lload           8
	//  201  383:lconst_1        
	//  202  384:ladd            
	//  203  385:lstore          10
		zzxj.zza(abyte0, l, (byte)(i >>> 18 | 0xf0));
	//  204  387:aload_2         
	//  205  388:lload           8
	//  206  390:iload_3         
	//  207  391:bipush          18
	//  208  393:iushr           
	//  209  394:sipush          240
	//  210  397:ior             
	//  211  398:int2byte        
	//  212  399:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
		l = l3 + 1L;
	//  213  402:lload           10
	//  214  404:lconst_1        
	//  215  405:ladd            
	//  216  406:lstore          8
		zzxj.zza(abyte0, l3, (byte)(i >>> 12 & 0x3f | 0x80));
	//  217  408:aload_2         
	//  218  409:lload           10
	//  219  411:iload_3         
	//  220  412:bipush          12
	//  221  414:iushr           
	//  222  415:bipush          63
	//  223  417:iand            
	//  224  418:sipush          128
	//  225  421:ior             
	//  226  422:int2byte        
	//  227  423:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
		l3 = l + 1L;
	//  228  426:lload           8
	//  229  428:lconst_1        
	//  230  429:ladd            
	//  231  430:lstore          10
		zzxj.zza(abyte0, l, (byte)(i >>> 6 & 0x3f | 0x80));
	//  232  432:aload_2         
	//  233  433:lload           8
	//  234  435:iload_3         
	//  235  436:bipush          6
	//  236  438:iushr           
	//  237  439:bipush          63
	//  238  441:iand            
	//  239  442:sipush          128
	//  240  445:ior             
	//  241  446:int2byte        
	//  242  447:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
		l = l3 + 1L;
	//  243  450:lload           10
	//  244  452:lconst_1        
	//  245  453:ladd            
	//  246  454:lstore          8
		zzxj.zza(abyte0, l3, (byte)(i & 0x3f | 0x80));
	//  247  456:aload_2         
	//  248  457:lload           10
	//  249  459:iload_3         
	//  250  460:bipush          63
	//  251  462:iand            
	//  252  463:sipush          128
	//  253  466:ior             
	//  254  467:int2byte        
	//  255  468:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
		i = j;
	//  256  471:iload           4
	//  257  473:istore_3        
		i++;
	//  258  474:iload_3         
	//  259  475:iconst_1        
	//  260  476:iadd            
	//  261  477:istore_3        
		if(true) goto _L6; else goto _L5
	//  262  478:goto            106
_L5:
		throw new zzxp(i - 1, k);
	//  263  481:new             #92  <Class zzxp>
	//  264  484:dup             
	//  265  485:iload_3         
	//  266  486:iconst_1        
	//  267  487:isub            
	//  268  488:iload           7
	//  269  490:invokespecial   #95  <Method void zzxp(int, int)>
	//  270  493:athrow          
		if('\uD800' <= c && c <= '\uDFFF')
	//* 271  494:ldc1            #75  <Int 55296>
	//* 272  496:iload           5
	//* 273  498:icmpgt          547
	//* 274  501:iload           5
	//* 275  503:ldc1            #76  <Int 57343>
	//* 276  505:icmpgt          547
		{
			j = i + 1;
	//  277  508:iload_3         
	//  278  509:iconst_1        
	//  279  510:iadd            
	//  280  511:istore          4
			if(j == k || !Character.isSurrogatePair(c, charsequence.charAt(j)))
	//* 281  513:iload           4
	//* 282  515:iload           7
	//* 283  517:icmpeq          536
	//* 284  520:iload           5
	//* 285  522:aload_1         
	//* 286  523:iload           4
	//* 287  525:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//* 288  530:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//* 289  533:ifne            547
				throw new zzxp(i, k);
	//  290  536:new             #92  <Class zzxp>
	//  291  539:dup             
	//  292  540:iload_3         
	//  293  541:iload           7
	//  294  543:invokespecial   #95  <Method void zzxp(int, int)>
	//  295  546:athrow          
		}
		charsequence = ((CharSequence) (new StringBuilder(46)));
	//  296  547:new             #97  <Class StringBuilder>
	//  297  550:dup             
	//  298  551:bipush          46
	//  299  553:invokespecial   #100 <Method void StringBuilder(int)>
	//  300  556:astore_1        
		((StringBuilder) (charsequence)).append("Failed writing ");
	//  301  557:aload_1         
	//  302  558:ldc1            #102 <String "Failed writing ">
	//  303  560:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  304  563:pop             
		((StringBuilder) (charsequence)).append(c);
	//  305  564:aload_1         
	//  306  565:iload           5
	//  307  567:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  308  570:pop             
		((StringBuilder) (charsequence)).append(" at index ");
	//  309  571:aload_1         
	//  310  572:ldc1            #111 <String " at index ">
	//  311  574:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  312  577:pop             
		((StringBuilder) (charsequence)).append(l);
	//  313  578:aload_1         
	//  314  579:lload           8
	//  315  581:invokevirtual   #114 <Method StringBuilder StringBuilder.append(long)>
	//  316  584:pop             
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  317  585:new             #37  <Class ArrayIndexOutOfBoundsException>
	//  318  588:dup             
	//  319  589:aload_1         
	//  320  590:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  321  593:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//  322  596:athrow          
		return (int)l;
	//  323  597:lload           8
	//  324  599:l2i             
	//  325  600:ireturn         
		char c1 = charsequence.charAt(k - 1);
	//  326  601:aload_1         
	//  327  602:iload           7
	//  328  604:iconst_1        
	//  329  605:isub            
	//  330  606:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  331  611:istore          5
		charsequence = ((CharSequence) (new StringBuilder(37)));
	//  332  613:new             #97  <Class StringBuilder>
	//  333  616:dup             
	//  334  617:bipush          37
	//  335  619:invokespecial   #100 <Method void StringBuilder(int)>
	//  336  622:astore_1        
		((StringBuilder) (charsequence)).append("Failed writing ");
	//  337  623:aload_1         
	//  338  624:ldc1            #102 <String "Failed writing ">
	//  339  626:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  340  629:pop             
		((StringBuilder) (charsequence)).append(c1);
	//  341  630:aload_1         
	//  342  631:iload           5
	//  343  633:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  344  636:pop             
		((StringBuilder) (charsequence)).append(" at index ");
	//  345  637:aload_1         
	//  346  638:ldc1            #111 <String " at index ">
	//  347  640:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  348  643:pop             
		((StringBuilder) (charsequence)).append(i + j);
	//  349  644:aload_1         
	//  350  645:iload_3         
	//  351  646:iload           4
	//  352  648:iadd            
	//  353  649:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  354  652:pop             
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  355  653:new             #37  <Class ArrayIndexOutOfBoundsException>
	//  356  656:dup             
	//  357  657:aload_1         
	//  358  658:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  359  661:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//  360  664:athrow          
	}

	final void zzb(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		int j;
		int k;
		int j1;
		long l1;
		long l2;
		long l3;
		long l5;
		long l6;
		l5 = zzxj.zzb(bytebuffer);
	//    0    0:aload_2         
	//    1    1:invokestatic    #125 <Method long zzxj.zzb(ByteBuffer)>
	//    2    4:lstore          16
		l2 = (long)bytebuffer.position() + l5;
	//    3    6:aload_2         
	//    4    7:invokevirtual   #130 <Method int ByteBuffer.position()>
	//    5   10:i2l             
	//    6   11:lload           16
	//    7   13:ladd            
	//    8   14:lstore          10
		l6 = (long)bytebuffer.limit() + l5;
	//    9   16:aload_2         
	//   10   17:invokevirtual   #133 <Method int ByteBuffer.limit()>
	//   11   20:i2l             
	//   12   21:lload           16
	//   13   23:ladd            
	//   14   24:lstore          18
		j1 = charsequence.length();
	//   15   26:aload_1         
	//   16   27:invokeinterface #65  <Method int CharSequence.length()>
	//   17   32:istore          7
		if((long)j1 > l6 - l2)
	//*  18   34:iload           7
	//*  19   36:i2l             
	//*  20   37:lload           18
	//*  21   39:lload           10
	//*  22   41:lsub            
	//*  23   42:lcmp            
	//*  24   43:ifle            112
		{
			char c = charsequence.charAt(j1 - 1);
	//   25   46:aload_1         
	//   26   47:iload           7
	//   27   49:iconst_1        
	//   28   50:isub            
	//   29   51:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   30   56:istore_3        
			int i = bytebuffer.limit();
	//   31   57:aload_2         
	//   32   58:invokevirtual   #133 <Method int ByteBuffer.limit()>
	//   33   61:istore          5
			charsequence = ((CharSequence) (new StringBuilder(37)));
	//   34   63:new             #97  <Class StringBuilder>
	//   35   66:dup             
	//   36   67:bipush          37
	//   37   69:invokespecial   #100 <Method void StringBuilder(int)>
	//   38   72:astore_1        
			((StringBuilder) (charsequence)).append("Failed writing ");
	//   39   73:aload_1         
	//   40   74:ldc1            #102 <String "Failed writing ">
	//   41   76:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   42   79:pop             
			((StringBuilder) (charsequence)).append(c);
	//   43   80:aload_1         
	//   44   81:iload_3         
	//   45   82:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//   46   85:pop             
			((StringBuilder) (charsequence)).append(" at index ");
	//   47   86:aload_1         
	//   48   87:ldc1            #111 <String " at index ">
	//   49   89:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//   50   92:pop             
			((StringBuilder) (charsequence)).append(i);
	//   51   93:aload_1         
	//   52   94:iload           5
	//   53   96:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//   54   99:pop             
			throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//   55  100:new             #37  <Class ArrayIndexOutOfBoundsException>
	//   56  103:dup             
	//   57  104:aload_1         
	//   58  105:invokevirtual   #118 <Method String StringBuilder.toString()>
	//   59  108:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//   60  111:athrow          
		}
		k = 0;
	//   61  112:iconst_0        
	//   62  113:istore          6
		do
		{
			l1 = 1L;
	//   63  115:lconst_1        
	//   64  116:lstore          8
			if(k >= j1)
				break;
	//   65  118:iload           6
	//   66  120:iload           7
	//   67  122:icmpge          166
			char c3 = charsequence.charAt(k);
	//   68  125:aload_1         
	//   69  126:iload           6
	//   70  128:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   71  133:istore          5
			if(c3 >= '\200')
				break;
	//   72  135:iload           5
	//   73  137:sipush          128
	//   74  140:icmpge          166
			zzxj.zza(l2, (byte)c3);
	//   75  143:lload           10
	//   76  145:iload           5
	//   77  147:int2byte        
	//   78  148:invokestatic    #136 <Method void zzxj.zza(long, byte)>
			k++;
	//   79  151:iload           6
	//   80  153:iconst_1        
	//   81  154:iadd            
	//   82  155:istore          6
			l2++;
	//   83  157:lload           10
	//   84  159:lconst_1        
	//   85  160:ladd            
	//   86  161:lstore          10
		} while(true);
	//   87  163:goto            115
		l3 = l2;
	//   88  166:lload           10
	//   89  168:lstore          12
		j = k;
	//   90  170:iload           6
	//   91  172:istore          5
		if(k != j1) goto _L2; else goto _L1
	//   92  174:iload           6
	//   93  176:iload           7
	//   94  178:icmpne          193
_L1:
		bytebuffer.position((int)(l2 - l5));
	//   95  181:aload_2         
	//   96  182:lload           10
	//   97  184:lload           16
	//   98  186:lsub            
	//   99  187:l2i             
	//  100  188:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  101  191:pop             
		return;
	//  102  192:return          
_L2:
label0:
		{
			char c1;
label1:
			{
				do
				{
					if(j >= j1)
						break label0;
	//  103  193:iload           5
	//  104  195:iload           7
	//  105  197:icmpge          692
					c1 = charsequence.charAt(j);
	//  106  200:aload_1         
	//  107  201:iload           5
	//  108  203:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  109  208:istore_3        
					if(c1 < '\200' && l3 < l6)
	//* 110  209:iload_3         
	//* 111  210:sipush          128
	//* 112  213:icmpge          249
	//* 113  216:lload           12
	//* 114  218:lload           18
	//* 115  220:lcmp            
	//* 116  221:ifge            249
					{
						zzxj.zza(l3, (byte)c1);
	//  117  224:lload           12
	//  118  226:iload_3         
	//  119  227:int2byte        
	//  120  228:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						long l4 = l1;
	//  121  231:lload           8
	//  122  233:lstore          14
						l2 = l3 + l1;
	//  123  235:lload           12
	//  124  237:lload           8
	//  125  239:ladd            
	//  126  240:lstore          10
						l1 = l4;
	//  127  242:lload           14
	//  128  244:lstore          8
					} else
	//* 129  246:goto            564
					if(c1 < '\u0800' && l3 <= l6 - 2L)
	//* 130  249:iload_3         
	//* 131  250:sipush          2048
	//* 132  253:icmpge          313
	//* 133  256:lload           12
	//* 134  258:lload           18
	//* 135  260:ldc2w           #73  <Long 2L>
	//* 136  263:lsub            
	//* 137  264:lcmp            
	//* 138  265:ifgt            313
					{
						l2 = l3 + l1;
	//  139  268:lload           12
	//  140  270:lload           8
	//  141  272:ladd            
	//  142  273:lstore          10
						zzxj.zza(l3, (byte)(c1 >>> 6 | 0x3c0));
	//  143  275:lload           12
	//  144  277:iload_3         
	//  145  278:bipush          6
	//  146  280:iushr           
	//  147  281:sipush          960
	//  148  284:ior             
	//  149  285:int2byte        
	//  150  286:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						zzxj.zza(l2, (byte)(c1 & 0x3f | 0x80));
	//  151  289:lload           10
	//  152  291:iload_3         
	//  153  292:bipush          63
	//  154  294:iand            
	//  155  295:sipush          128
	//  156  298:ior             
	//  157  299:int2byte        
	//  158  300:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						l2 += l1;
	//  159  303:lload           10
	//  160  305:lload           8
	//  161  307:ladd            
	//  162  308:lstore          10
					} else
	//* 163  310:goto            564
					if((c1 < '\uD800' || '\uDFFF' < c1) && l3 <= l6 - 3L)
	//* 164  313:iload_3         
	//* 165  314:ldc1            #75  <Int 55296>
	//* 166  316:icmplt          325
	//* 167  319:ldc1            #76  <Int 57343>
	//* 168  321:iload_3         
	//* 169  322:icmpge          408
	//* 170  325:lload           12
	//* 171  327:lload           18
	//* 172  329:ldc2w           #77  <Long 3L>
	//* 173  332:lsub            
	//* 174  333:lcmp            
	//* 175  334:ifgt            408
					{
						l2 = l3 + l1;
	//  176  337:lload           12
	//  177  339:lload           8
	//  178  341:ladd            
	//  179  342:lstore          10
						zzxj.zza(l3, (byte)(c1 >>> 12 | 0x1e0));
	//  180  344:lload           12
	//  181  346:iload_3         
	//  182  347:bipush          12
	//  183  349:iushr           
	//  184  350:sipush          480
	//  185  353:ior             
	//  186  354:int2byte        
	//  187  355:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						l1 = l2 + l1;
	//  188  358:lload           10
	//  189  360:lload           8
	//  190  362:ladd            
	//  191  363:lstore          8
						zzxj.zza(l2, (byte)(c1 >>> 6 & 0x3f | 0x80));
	//  192  365:lload           10
	//  193  367:iload_3         
	//  194  368:bipush          6
	//  195  370:iushr           
	//  196  371:bipush          63
	//  197  373:iand            
	//  198  374:sipush          128
	//  199  377:ior             
	//  200  378:int2byte        
	//  201  379:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						zzxj.zza(l1, (byte)(c1 & 0x3f | 0x80));
	//  202  382:lload           8
	//  203  384:iload_3         
	//  204  385:bipush          63
	//  205  387:iand            
	//  206  388:sipush          128
	//  207  391:ior             
	//  208  392:int2byte        
	//  209  393:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						l2 = l1 + 1L;
	//  210  396:lload           8
	//  211  398:lconst_1        
	//  212  399:ladd            
	//  213  400:lstore          10
						l1 = 1L;
	//  214  402:lconst_1        
	//  215  403:lstore          8
					} else
	//* 216  405:goto            246
					{
						if(l3 > l6 - 4L)
							break label1;
	//  217  408:lload           12
	//  218  410:lload           18
	//  219  412:ldc2w           #79  <Long 4L>
	//  220  415:lsub            
	//  221  416:lcmp            
	//  222  417:ifgt            591
						int l = j + 1;
	//  223  420:iload           5
	//  224  422:iconst_1        
	//  225  423:iadd            
	//  226  424:istore          6
						if(l == j1)
							break;
	//  227  426:iload           6
	//  228  428:iload           7
	//  229  430:icmpeq          577
						char c2 = charsequence.charAt(l);
	//  230  433:aload_1         
	//  231  434:iload           6
	//  232  436:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  233  441:istore          4
						if(!Character.isSurrogatePair(c1, c2))
	//* 234  443:iload_3         
	//* 235  444:iload           4
	//* 236  446:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//* 237  449:ifne            459
						{
							j = l;
	//  238  452:iload           6
	//  239  454:istore          5
							break;
	//  240  456:goto            577
						}
						j = Character.toCodePoint(c1, c2);
	//  241  459:iload_3         
	//  242  460:iload           4
	//  243  462:invokestatic    #90  <Method int Character.toCodePoint(char, char)>
	//  244  465:istore          5
						l1 = l3 + 1L;
	//  245  467:lload           12
	//  246  469:lconst_1        
	//  247  470:ladd            
	//  248  471:lstore          8
						zzxj.zza(l3, (byte)(j >>> 18 | 0xf0));
	//  249  473:lload           12
	//  250  475:iload           5
	//  251  477:bipush          18
	//  252  479:iushr           
	//  253  480:sipush          240
	//  254  483:ior             
	//  255  484:int2byte        
	//  256  485:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						l2 = l1 + 1L;
	//  257  488:lload           8
	//  258  490:lconst_1        
	//  259  491:ladd            
	//  260  492:lstore          10
						zzxj.zza(l1, (byte)(j >>> 12 & 0x3f | 0x80));
	//  261  494:lload           8
	//  262  496:iload           5
	//  263  498:bipush          12
	//  264  500:iushr           
	//  265  501:bipush          63
	//  266  503:iand            
	//  267  504:sipush          128
	//  268  507:ior             
	//  269  508:int2byte        
	//  270  509:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						l3 = l2 + 1L;
	//  271  512:lload           10
	//  272  514:lconst_1        
	//  273  515:ladd            
	//  274  516:lstore          12
						zzxj.zza(l2, (byte)(j >>> 6 & 0x3f | 0x80));
	//  275  518:lload           10
	//  276  520:iload           5
	//  277  522:bipush          6
	//  278  524:iushr           
	//  279  525:bipush          63
	//  280  527:iand            
	//  281  528:sipush          128
	//  282  531:ior             
	//  283  532:int2byte        
	//  284  533:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						l1 = 1L;
	//  285  536:lconst_1        
	//  286  537:lstore          8
						l2 = l3 + 1L;
	//  287  539:lload           12
	//  288  541:lconst_1        
	//  289  542:ladd            
	//  290  543:lstore          10
						zzxj.zza(l3, (byte)(j & 0x3f | 0x80));
	//  291  545:lload           12
	//  292  547:iload           5
	//  293  549:bipush          63
	//  294  551:iand            
	//  295  552:sipush          128
	//  296  555:ior             
	//  297  556:int2byte        
	//  298  557:invokestatic    #136 <Method void zzxj.zza(long, byte)>
						j = l;
	//  299  560:iload           6
	//  300  562:istore          5
					}
					j++;
	//  301  564:iload           5
	//  302  566:iconst_1        
	//  303  567:iadd            
	//  304  568:istore          5
					l3 = l2;
	//  305  570:lload           10
	//  306  572:lstore          12
				} while(true);
	//  307  574:goto            193
				throw new zzxp(j - 1, j1);
	//  308  577:new             #92  <Class zzxp>
	//  309  580:dup             
	//  310  581:iload           5
	//  311  583:iconst_1        
	//  312  584:isub            
	//  313  585:iload           7
	//  314  587:invokespecial   #95  <Method void zzxp(int, int)>
	//  315  590:athrow          
			}
			if('\uD800' <= c1 && c1 <= '\uDFFF')
	//* 316  591:ldc1            #75  <Int 55296>
	//* 317  593:iload_3         
	//* 318  594:icmpgt          643
	//* 319  597:iload_3         
	//* 320  598:ldc1            #76  <Int 57343>
	//* 321  600:icmpgt          643
			{
				int i1 = j + 1;
	//  322  603:iload           5
	//  323  605:iconst_1        
	//  324  606:iadd            
	//  325  607:istore          6
				if(i1 == j1 || !Character.isSurrogatePair(c1, charsequence.charAt(i1)))
	//* 326  609:iload           6
	//* 327  611:iload           7
	//* 328  613:icmpeq          631
	//* 329  616:iload_3         
	//* 330  617:aload_1         
	//* 331  618:iload           6
	//* 332  620:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//* 333  625:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//* 334  628:ifne            643
					throw new zzxp(j, j1);
	//  335  631:new             #92  <Class zzxp>
	//  336  634:dup             
	//  337  635:iload           5
	//  338  637:iload           7
	//  339  639:invokespecial   #95  <Method void zzxp(int, int)>
	//  340  642:athrow          
			}
			charsequence = ((CharSequence) (new StringBuilder(46)));
	//  341  643:new             #97  <Class StringBuilder>
	//  342  646:dup             
	//  343  647:bipush          46
	//  344  649:invokespecial   #100 <Method void StringBuilder(int)>
	//  345  652:astore_1        
			((StringBuilder) (charsequence)).append("Failed writing ");
	//  346  653:aload_1         
	//  347  654:ldc1            #102 <String "Failed writing ">
	//  348  656:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  349  659:pop             
			((StringBuilder) (charsequence)).append(c1);
	//  350  660:aload_1         
	//  351  661:iload_3         
	//  352  662:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  353  665:pop             
			((StringBuilder) (charsequence)).append(" at index ");
	//  354  666:aload_1         
	//  355  667:ldc1            #111 <String " at index ">
	//  356  669:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  357  672:pop             
			((StringBuilder) (charsequence)).append(l3);
	//  358  673:aload_1         
	//  359  674:lload           12
	//  360  676:invokevirtual   #114 <Method StringBuilder StringBuilder.append(long)>
	//  361  679:pop             
			throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  362  680:new             #37  <Class ArrayIndexOutOfBoundsException>
	//  363  683:dup             
	//  364  684:aload_1         
	//  365  685:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  366  688:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//  367  691:athrow          
		}
		l2 = l3;
	//  368  692:lload           12
	//  369  694:lstore          10
		if(true) goto _L1; else goto _L3
	//  370  696:goto            181
_L3:
	}

	final String zzh(byte abyte0[], int i, int j)
	{
		if((i | j | abyte0.length - i - j) < 0)
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:ior             
	//*   3    3:aload_1         
	//*   4    4:arraylength     
	//*   5    5:iload_2         
	//*   6    6:isub            
	//*   7    7:iload_3         
	//*   8    8:isub            
	//*   9    9:ior             
	//*  10   10:ifge            52
			throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] {
				Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
			}));
	//   11   13:new             #37  <Class ArrayIndexOutOfBoundsException>
	//   12   16:dup             
	//   13   17:ldc1            #143 <String "buffer length=%d, index=%d, size=%d">
	//   14   19:iconst_3        
	//   15   20:anewarray       Object[]
	//   16   23:dup             
	//   17   24:iconst_0        
	//   18   25:aload_1         
	//   19   26:arraylength     
	//   20   27:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   21   30:aastore         
	//   22   31:dup             
	//   23   32:iconst_1        
	//   24   33:iload_2         
	//   25   34:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   26   37:aastore         
	//   27   38:dup             
	//   28   39:iconst_2        
	//   29   40:iload_3         
	//   30   41:invokestatic    #47  <Method Integer Integer.valueOf(int)>
	//   31   44:aastore         
	//   32   45:invokestatic    #53  <Method String String.format(String, Object[])>
	//   33   48:invokespecial   #56  <Method void ArrayIndexOutOfBoundsException(String)>
	//   34   51:athrow          
		int i1 = i + j;
	//   35   52:iload_2         
	//   36   53:iload_3         
	//   37   54:iadd            
	//   38   55:istore          7
		char ac[] = new char[j];
	//   39   57:iload_3         
	//   40   58:newarray        char[]
	//   41   60:astore          8
		j = 0;
	//   42   62:iconst_0        
	//   43   63:istore_3        
		do
		{
			if(i >= i1)
				break;
	//   44   64:iload_2         
	//   45   65:iload           7
	//   46   67:icmpge          105
			byte byte0 = zzxj.zza(abyte0, i);
	//   47   70:aload_1         
	//   48   71:iload_2         
	//   49   72:i2l             
	//   50   73:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   51   76:istore          4
			if(!zzxm.zzh(byte0))
				break;
	//   52   78:iload           4
	//   53   80:invokestatic    #148 <Method boolean zzxm.zzh(byte)>
	//   54   83:ifeq            105
			i++;
	//   55   86:iload_2         
	//   56   87:iconst_1        
	//   57   88:iadd            
	//   58   89:istore_2        
			zzxm.zzb(byte0, ac, j);
	//   59   90:iload           4
	//   60   92:aload           8
	//   61   94:iload_3         
	//   62   95:invokestatic    #151 <Method void zzxm.zzb(byte, char[], int)>
			j++;
	//   63   98:iload_3         
	//   64   99:iconst_1        
	//   65  100:iadd            
	//   66  101:istore_3        
		} while(true);
	//   67  102:goto            64
		int k = j;
	//   68  105:iload_3         
	//   69  106:istore          6
		j = i;
	//   70  108:iload_2         
	//   71  109:istore_3        
		i = k;
	//   72  110:iload           6
	//   73  112:istore_2        
label0:
		do
		{
			if(j >= i1)
				break;
	//   74  113:iload_3         
	//   75  114:iload           7
	//   76  116:icmpge          374
			int l = j + 1;
	//   77  119:iload_3         
	//   78  120:iconst_1        
	//   79  121:iadd            
	//   80  122:istore          6
			byte byte1 = zzxj.zza(abyte0, j);
	//   81  124:aload_1         
	//   82  125:iload_3         
	//   83  126:i2l             
	//   84  127:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   85  130:istore          4
			if(zzxm.zzh(byte1))
	//*  86  132:iload           4
	//*  87  134:invokestatic    #148 <Method boolean zzxm.zzh(byte)>
	//*  88  137:ifeq            201
			{
				j = i + 1;
	//   89  140:iload_2         
	//   90  141:iconst_1        
	//   91  142:iadd            
	//   92  143:istore_3        
				zzxm.zzb(byte1, ac, i);
	//   93  144:iload           4
	//   94  146:aload           8
	//   95  148:iload_2         
	//   96  149:invokestatic    #151 <Method void zzxm.zzb(byte, char[], int)>
				i = j;
	//   97  152:iload_3         
	//   98  153:istore_2        
				j = l;
	//   99  154:iload           6
	//  100  156:istore_3        
				do
				{
					if(j >= i1)
						continue label0;
	//  101  157:iload_3         
	//  102  158:iload           7
	//  103  160:icmpge          198
					byte1 = zzxj.zza(abyte0, j);
	//  104  163:aload_1         
	//  105  164:iload_3         
	//  106  165:i2l             
	//  107  166:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  108  169:istore          4
					if(!zzxm.zzh(byte1))
						continue label0;
	//  109  171:iload           4
	//  110  173:invokestatic    #148 <Method boolean zzxm.zzh(byte)>
	//  111  176:ifeq            198
					j++;
	//  112  179:iload_3         
	//  113  180:iconst_1        
	//  114  181:iadd            
	//  115  182:istore_3        
					zzxm.zzb(byte1, ac, i);
	//  116  183:iload           4
	//  117  185:aload           8
	//  118  187:iload_2         
	//  119  188:invokestatic    #151 <Method void zzxm.zzb(byte, char[], int)>
					i++;
	//  120  191:iload_2         
	//  121  192:iconst_1        
	//  122  193:iadd            
	//  123  194:istore_2        
				} while(true);
	//  124  195:goto            157
			}
	//* 125  198:goto            113
			if(zzxm.zzi(byte1))
	//* 126  201:iload           4
	//* 127  203:invokestatic    #154 <Method boolean zzxm.zzi(byte)>
	//* 128  206:ifeq            247
			{
				if(l >= i1)
	//* 129  209:iload           6
	//* 130  211:iload           7
	//* 131  213:icmplt          220
					throw zzuv.zzwx();
	//  132  216:invokestatic    #160 <Method zzuv zzuv.zzwx()>
	//  133  219:athrow          
				zzxm.zzb(byte1, zzxj.zza(abyte0, l), ac, i);
	//  134  220:iload           4
	//  135  222:aload_1         
	//  136  223:iload           6
	//  137  225:i2l             
	//  138  226:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  139  229:aload           8
	//  140  231:iload_2         
	//  141  232:invokestatic    #163 <Method void zzxm.zzb(byte, byte, char[], int)>
				j = l + 1;
	//  142  235:iload           6
	//  143  237:iconst_1        
	//  144  238:iadd            
	//  145  239:istore_3        
				i++;
	//  146  240:iload_2         
	//  147  241:iconst_1        
	//  148  242:iadd            
	//  149  243:istore_2        
			} else
	//* 150  244:goto            113
			if(zzxm.zzj(byte1))
	//* 151  247:iload           4
	//* 152  249:invokestatic    #166 <Method boolean zzxm.zzj(byte)>
	//* 153  252:ifeq            305
			{
				if(l >= i1 - 1)
	//* 154  255:iload           6
	//* 155  257:iload           7
	//* 156  259:iconst_1        
	//* 157  260:isub            
	//* 158  261:icmplt          268
					throw zzuv.zzwx();
	//  159  264:invokestatic    #160 <Method zzuv zzuv.zzwx()>
	//  160  267:athrow          
				j = l + 1;
	//  161  268:iload           6
	//  162  270:iconst_1        
	//  163  271:iadd            
	//  164  272:istore_3        
				zzxm.zzb(byte1, zzxj.zza(abyte0, l), zzxj.zza(abyte0, j), ac, i);
	//  165  273:iload           4
	//  166  275:aload_1         
	//  167  276:iload           6
	//  168  278:i2l             
	//  169  279:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  170  282:aload_1         
	//  171  283:iload_3         
	//  172  284:i2l             
	//  173  285:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  174  288:aload           8
	//  175  290:iload_2         
	//  176  291:invokestatic    #169 <Method void zzxm.zzb(byte, byte, byte, char[], int)>
				j++;
	//  177  294:iload_3         
	//  178  295:iconst_1        
	//  179  296:iadd            
	//  180  297:istore_3        
				i++;
	//  181  298:iload_2         
	//  182  299:iconst_1        
	//  183  300:iadd            
	//  184  301:istore_2        
			} else
	//* 185  302:goto            113
			{
				if(l >= i1 - 2)
	//* 186  305:iload           6
	//* 187  307:iload           7
	//* 188  309:iconst_2        
	//* 189  310:isub            
	//* 190  311:icmplt          318
					throw zzuv.zzwx();
	//  191  314:invokestatic    #160 <Method zzuv zzuv.zzwx()>
	//  192  317:athrow          
				j = l + 1;
	//  193  318:iload           6
	//  194  320:iconst_1        
	//  195  321:iadd            
	//  196  322:istore_3        
				byte byte2 = zzxj.zza(abyte0, l);
	//  197  323:aload_1         
	//  198  324:iload           6
	//  199  326:i2l             
	//  200  327:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  201  330:istore          5
				l = j + 1;
	//  202  332:iload_3         
	//  203  333:iconst_1        
	//  204  334:iadd            
	//  205  335:istore          6
				zzxm.zzb(byte1, byte2, zzxj.zza(abyte0, j), zzxj.zza(abyte0, l), ac, i);
	//  206  337:iload           4
	//  207  339:iload           5
	//  208  341:aload_1         
	//  209  342:iload_3         
	//  210  343:i2l             
	//  211  344:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  212  347:aload_1         
	//  213  348:iload           6
	//  214  350:i2l             
	//  215  351:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  216  354:aload           8
	//  217  356:iload_2         
	//  218  357:invokestatic    #172 <Method void zzxm.zzb(byte, byte, byte, byte, char[], int)>
				j = l + 1;
	//  219  360:iload           6
	//  220  362:iconst_1        
	//  221  363:iadd            
	//  222  364:istore_3        
				i = i + 1 + 1;
	//  223  365:iload_2         
	//  224  366:iconst_1        
	//  225  367:iadd            
	//  226  368:iconst_1        
	//  227  369:iadd            
	//  228  370:istore_2        
			}
		} while(true);
	//  229  371:goto            113
		return new String(ac, 0, i);
	//  230  374:new             #49  <Class String>
	//  231  377:dup             
	//  232  378:aload           8
	//  233  380:iconst_0        
	//  234  381:iload_2         
	//  235  382:invokespecial   #175 <Method void String(char[], int, int)>
	//  236  385:areturn         
	}
}
