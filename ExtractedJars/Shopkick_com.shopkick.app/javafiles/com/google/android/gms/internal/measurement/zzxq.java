// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzxn, zzxj, zzxl, zzxp, 
//			zzuv, zzxm

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
label0:
		{
			long l2;
label1:
			{
				if((j | k | abyte0.length - k) < 0)
					break label0;
	//    0    0:iload_3         
	//    1    1:iload           4
	//    2    3:ior             
	//    3    4:aload_2         
	//    4    5:arraylength     
	//    5    6:iload           4
	//    6    8:isub            
	//    7    9:ior             
	//    8   10:iflt            362
				l2 = j;
	//    9   13:iload_3         
	//   10   14:i2l             
	//   11   15:lstore          7
				j = (int)((long)k - l2);
	//   12   17:iload           4
	//   13   19:i2l             
	//   14   20:lload           7
	//   15   22:lsub            
	//   16   23:l2i             
	//   17   24:istore_3        
				if(j < 16)
	//*  18   25:iload_3         
	//*  19   26:bipush          16
	//*  20   28:icmpge          36
				{
					i = 0;
	//   21   31:iconst_0        
	//   22   32:istore_1        
					break label1;
	//   23   33:goto            74
				}
				i = 0;
	//   24   36:iconst_0        
	//   25   37:istore_1        
				for(long l = l2; i < j; l++)
	//*  26   38:lload           7
	//*  27   40:lstore          5
	//*  28   42:iload_1         
	//*  29   43:iload_3         
	//*  30   44:icmpge          72
				{
					if(zzxj.zza(abyte0, l) < 0)
	//*  31   47:aload_2         
	//*  32   48:lload           5
	//*  33   50:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//*  34   53:ifge            59
						break label1;
	//   35   56:goto            74
					i++;
	//   36   59:iload_1         
	//   37   60:iconst_1        
	//   38   61:iadd            
	//   39   62:istore_1        
				}

	//   40   63:lload           5
	//   41   65:lconst_1        
	//   42   66:ladd            
	//   43   67:lstore          5
	//*  44   69:goto            42
				i = j;
	//   45   72:iload_3         
	//   46   73:istore_1        
			}
			j -= i;
	//   47   74:iload_3         
	//   48   75:iload_1         
	//   49   76:isub            
	//   50   77:istore_3        
			long l1 = l2 + (long)i;
	//   51   78:lload           7
	//   52   80:iload_1         
	//   53   81:i2l             
	//   54   82:ladd            
	//   55   83:lstore          5
			i = j;
	//   56   85:iload_3         
	//   57   86:istore_1        
			do
			{
label2:
				{
					long l3;
					do
					{
						do
						{
							j = 0;
	//   58   87:iconst_0        
	//   59   88:istore_3        
							do
							{
								l2 = l1;
	//   60   89:lload           5
	//   61   91:lstore          7
								if(i <= 0)
									break;
	//   62   93:iload_1         
	//   63   94:ifle            125
								l2 = l1 + 1L;
	//   64   97:lload           5
	//   65   99:lconst_1        
	//   66  100:ladd            
	//   67  101:lstore          7
								j = ((int) (zzxj.zza(abyte0, l1)));
	//   68  103:aload_2         
	//   69  104:lload           5
	//   70  106:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   71  109:istore_3        
								if(j < 0)
									break;
	//   72  110:iload_3         
	//   73  111:iflt            125
								i--;
	//   74  114:iload_1         
	//   75  115:iconst_1        
	//   76  116:isub            
	//   77  117:istore_1        
								l1 = l2;
	//   78  118:lload           7
	//   79  120:lstore          5
							} while(true);
	//   80  122:goto            89
							if(i == 0)
	//*  81  125:iload_1         
	//*  82  126:ifne            131
								return 0;
	//   83  129:iconst_0        
	//   84  130:ireturn         
							i--;
	//   85  131:iload_1         
	//   86  132:iconst_1        
	//   87  133:isub            
	//   88  134:istore_1        
							if(j >= -32)
								break;
	//   89  135:iload_3         
	//   90  136:bipush          -32
	//   91  138:icmpge          181
							if(i == 0)
	//*  92  141:iload_1         
	//*  93  142:ifne            147
								return j;
	//   94  145:iload_3         
	//   95  146:ireturn         
							i--;
	//   96  147:iload_1         
	//   97  148:iconst_1        
	//   98  149:isub            
	//   99  150:istore_1        
							if(j >= -62)
	//* 100  151:iload_3         
	//* 101  152:bipush          -62
	//* 102  154:icmplt          179
							{
								if(zzxj.zza(abyte0, l2) > -65)
	//* 103  157:aload_2         
	//* 104  158:lload           7
	//* 105  160:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//* 106  163:bipush          -65
	//* 107  165:icmple          170
									return -1;
	//  108  168:iconst_m1       
	//  109  169:ireturn         
								l1 = l2 + 1L;
	//  110  170:lload           7
	//  111  172:lconst_1        
	//  112  173:ladd            
	//  113  174:lstore          5
							} else
	//* 114  176:goto            87
							{
								return -1;
	//  115  179:iconst_m1       
	//  116  180:ireturn         
							}
						} while(true);
						if(j >= -16)
							break label2;
	//  117  181:iload_3         
	//  118  182:bipush          -16
	//  119  184:icmpge          271
						if(i < 2)
	//* 120  187:iload_1         
	//* 121  188:iconst_2        
	//* 122  189:icmpge          201
							return zza(abyte0, j, l2, i);
	//  123  192:aload_2         
	//  124  193:iload_3         
	//  125  194:lload           7
	//  126  196:iload_1         
	//  127  197:invokestatic    #37  <Method int zza(byte[], int, long, int)>
	//  128  200:ireturn         
						i -= 2;
	//  129  201:iload_1         
	//  130  202:iconst_2        
	//  131  203:isub            
	//  132  204:istore_1        
						l3 = l2 + 1L;
	//  133  205:lload           7
	//  134  207:lconst_1        
	//  135  208:ladd            
	//  136  209:lstore          9
						k = ((int) (zzxj.zza(abyte0, l2)));
	//  137  211:aload_2         
	//  138  212:lload           7
	//  139  214:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  140  217:istore          4
						if(k > -65 || j == -32 && k < -96 || j == -19 && k >= -96)
							break;
	//  141  219:iload           4
	//  142  221:bipush          -65
	//  143  223:icmpgt          269
	//  144  226:iload_3         
	//  145  227:bipush          -32
	//  146  229:icmpne          239
	//  147  232:iload           4
	//  148  234:bipush          -96
	//  149  236:icmplt          269
	//  150  239:iload_3         
	//  151  240:bipush          -19
	//  152  242:icmpne          252
	//  153  245:iload           4
	//  154  247:bipush          -96
	//  155  249:icmpge          269
						l1 = l3 + 1L;
	//  156  252:lload           9
	//  157  254:lconst_1        
	//  158  255:ladd            
	//  159  256:lstore          5
					} while(zzxj.zza(abyte0, l3) <= -65);
	//  160  258:aload_2         
	//  161  259:lload           9
	//  162  261:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  163  264:bipush          -65
	//  164  266:icmple          87
					return -1;
	//  165  269:iconst_m1       
	//  166  270:ireturn         
				}
				if(i < 3)
	//* 167  271:iload_1         
	//* 168  272:iconst_3        
	//* 169  273:icmpge          285
					return zza(abyte0, j, l2, i);
	//  170  276:aload_2         
	//  171  277:iload_3         
	//  172  278:lload           7
	//  173  280:iload_1         
	//  174  281:invokestatic    #37  <Method int zza(byte[], int, long, int)>
	//  175  284:ireturn         
				i -= 3;
	//  176  285:iload_1         
	//  177  286:iconst_3        
	//  178  287:isub            
	//  179  288:istore_1        
				l1 = l2 + 1L;
	//  180  289:lload           7
	//  181  291:lconst_1        
	//  182  292:ladd            
	//  183  293:lstore          5
				k = ((int) (zzxj.zza(abyte0, l2)));
	//  184  295:aload_2         
	//  185  296:lload           7
	//  186  298:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  187  301:istore          4
				if(k > -65 || (j << 28) + (k + 112) >> 30 != 0)
					break;
	//  188  303:iload           4
	//  189  305:bipush          -65
	//  190  307:icmpgt          360
	//  191  310:iload_3         
	//  192  311:bipush          28
	//  193  313:ishl            
	//  194  314:iload           4
	//  195  316:bipush          112
	//  196  318:iadd            
	//  197  319:iadd            
	//  198  320:bipush          30
	//  199  322:ishr            
	//  200  323:ifne            360
				l2 = l1 + 1L;
	//  201  326:lload           5
	//  202  328:lconst_1        
	//  203  329:ladd            
	//  204  330:lstore          7
				if(zzxj.zza(abyte0, l1) > -65)
					break;
	//  205  332:aload_2         
	//  206  333:lload           5
	//  207  335:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  208  338:bipush          -65
	//  209  340:icmpgt          360
				l1 = l2 + 1L;
	//  210  343:lload           7
	//  211  345:lconst_1        
	//  212  346:ladd            
	//  213  347:lstore          5
			} while(zzxj.zza(abyte0, l2) <= -65);
	//  214  349:aload_2         
	//  215  350:lload           7
	//  216  352:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  217  355:bipush          -65
	//  218  357:icmple          87
			return -1;
	//  219  360:iconst_m1       
	//  220  361:ireturn         
		}
		throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] {
			Integer.valueOf(abyte0.length), Integer.valueOf(j), Integer.valueOf(k)
		}));
	//  221  362:new             #39  <Class ArrayIndexOutOfBoundsException>
	//  222  365:dup             
	//  223  366:ldc1            #41  <String "Array length=%d, index=%d, limit=%d">
	//  224  368:iconst_3        
	//  225  369:anewarray       Object[]
	//  226  372:dup             
	//  227  373:iconst_0        
	//  228  374:aload_2         
	//  229  375:arraylength     
	//  230  376:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//  231  379:aastore         
	//  232  380:dup             
	//  233  381:iconst_1        
	//  234  382:iload_3         
	//  235  383:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//  236  386:aastore         
	//  237  387:dup             
	//  238  388:iconst_2        
	//  239  389:iload           4
	//  240  391:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//  241  394:aastore         
	//  242  395:invokestatic    #55  <Method String String.format(String, Object[])>
	//  243  398:invokespecial   #58  <Method void ArrayIndexOutOfBoundsException(String)>
	//  244  401:athrow          
	}

	final int zzb(CharSequence charsequence, byte abyte0[], int i, int j)
	{
		int k;
label0:
		{
			long l2;
label1:
			{
				char c;
label2:
				{
					long l = i;
	//    0    0:iload_3         
	//    1    1:i2l             
	//    2    2:lstore          8
					long l3 = (long)j + l;
	//    3    4:iload           4
	//    4    6:i2l             
	//    5    7:lload           8
	//    6    9:ladd            
	//    7   10:lstore          12
					k = charsequence.length();
	//    8   12:aload_1         
	//    9   13:invokeinterface #65  <Method int CharSequence.length()>
	//   10   18:istore          7
					if(k > j || abyte0.length - j < i)
						break label0;
	//   11   20:iload           7
	//   12   22:iload           4
	//   13   24:icmpgt          596
	//   14   27:aload_2         
	//   15   28:arraylength     
	//   16   29:iload           4
	//   17   31:isub            
	//   18   32:iload_3         
	//   19   33:icmplt          596
					j = 0;
	//   20   36:iconst_0        
	//   21   37:istore          4
					do
					{
						if(j >= k)
							break;
	//   22   39:iload           4
	//   23   41:iload           7
	//   24   43:icmpge          85
						i = ((int) (charsequence.charAt(j)));
	//   25   46:aload_1         
	//   26   47:iload           4
	//   27   49:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   28   54:istore_3        
						if(i >= 128)
							break;
	//   29   55:iload_3         
	//   30   56:sipush          128
	//   31   59:icmpge          85
						zzxj.zza(abyte0, l, (byte)i);
	//   32   62:aload_2         
	//   33   63:lload           8
	//   34   65:iload_3         
	//   35   66:int2byte        
	//   36   67:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
						j++;
	//   37   70:iload           4
	//   38   72:iconst_1        
	//   39   73:iadd            
	//   40   74:istore          4
						l = 1L + l;
	//   41   76:lconst_1        
	//   42   77:lload           8
	//   43   79:ladd            
	//   44   80:lstore          8
					} while(true);
	//   45   82:goto            39
					i = j;
	//   46   85:iload           4
	//   47   87:istore_3        
					l2 = l;
	//   48   88:lload           8
	//   49   90:lstore          10
					if(j == k)
	//*  50   92:iload           4
	//*  51   94:iload           7
	//*  52   96:icmpne          103
						return (int)l;
	//   53   99:lload           8
	//   54  101:l2i             
	//   55  102:ireturn         
					do
					{
						if(i >= k)
							break label1;
	//   56  103:iload_3         
	//   57  104:iload           7
	//   58  106:icmpge          592
						c = charsequence.charAt(i);
	//   59  109:aload_1         
	//   60  110:iload_3         
	//   61  111:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   62  116:istore          5
						long l1;
						if(c < '\200' && l2 < l3)
	//*  63  118:iload           5
	//*  64  120:sipush          128
	//*  65  123:icmpge          152
	//*  66  126:lload           10
	//*  67  128:lload           12
	//*  68  130:lcmp            
	//*  69  131:ifge            152
						{
							zzxj.zza(abyte0, l2, (byte)c);
	//   70  134:aload_2         
	//   71  135:lload           10
	//   72  137:iload           5
	//   73  139:int2byte        
	//   74  140:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							l1 = l2 + 1L;
	//   75  143:lload           10
	//   76  145:lconst_1        
	//   77  146:ladd            
	//   78  147:lstore          8
						} else
	//*  79  149:goto            465
						if(c < '\u0800' && l2 <= l3 - 2L)
	//*  80  152:iload           5
	//*  81  154:sipush          2048
	//*  82  157:icmpge          219
	//*  83  160:lload           10
	//*  84  162:lload           12
	//*  85  164:ldc2w           #73  <Long 2L>
	//*  86  167:lsub            
	//*  87  168:lcmp            
	//*  88  169:ifgt            219
						{
							long l4 = l2 + 1L;
	//   89  172:lload           10
	//   90  174:lconst_1        
	//   91  175:ladd            
	//   92  176:lstore          14
							zzxj.zza(abyte0, l2, (byte)(c >>> 6 | 0x3c0));
	//   93  178:aload_2         
	//   94  179:lload           10
	//   95  181:iload           5
	//   96  183:bipush          6
	//   97  185:iushr           
	//   98  186:sipush          960
	//   99  189:ior             
	//  100  190:int2byte        
	//  101  191:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							l1 = l4 + 1L;
	//  102  194:lload           14
	//  103  196:lconst_1        
	//  104  197:ladd            
	//  105  198:lstore          8
							zzxj.zza(abyte0, l4, (byte)(c & 0x3f | 0x80));
	//  106  200:aload_2         
	//  107  201:lload           14
	//  108  203:iload           5
	//  109  205:bipush          63
	//  110  207:iand            
	//  111  208:sipush          128
	//  112  211:ior             
	//  113  212:int2byte        
	//  114  213:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
						} else
	//* 115  216:goto            465
						if((c < '\uD800' || '\uDFFF' < c) && l2 <= l3 - 3L)
	//* 116  219:iload           5
	//* 117  221:ldc1            #75  <Int 55296>
	//* 118  223:icmplt          233
	//* 119  226:ldc1            #76  <Int 57343>
	//* 120  228:iload           5
	//* 121  230:icmpge          317
	//* 122  233:lload           10
	//* 123  235:lload           12
	//* 124  237:ldc2w           #77  <Long 3L>
	//* 125  240:lsub            
	//* 126  241:lcmp            
	//* 127  242:ifgt            317
						{
							l1 = l2 + 1L;
	//  128  245:lload           10
	//  129  247:lconst_1        
	//  130  248:ladd            
	//  131  249:lstore          8
							zzxj.zza(abyte0, l2, (byte)(c >>> 12 | 0x1e0));
	//  132  251:aload_2         
	//  133  252:lload           10
	//  134  254:iload           5
	//  135  256:bipush          12
	//  136  258:iushr           
	//  137  259:sipush          480
	//  138  262:ior             
	//  139  263:int2byte        
	//  140  264:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							l2 = l1 + 1L;
	//  141  267:lload           8
	//  142  269:lconst_1        
	//  143  270:ladd            
	//  144  271:lstore          10
							zzxj.zza(abyte0, l1, (byte)(c >>> 6 & 0x3f | 0x80));
	//  145  273:aload_2         
	//  146  274:lload           8
	//  147  276:iload           5
	//  148  278:bipush          6
	//  149  280:iushr           
	//  150  281:bipush          63
	//  151  283:iand            
	//  152  284:sipush          128
	//  153  287:ior             
	//  154  288:int2byte        
	//  155  289:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							zzxj.zza(abyte0, l2, (byte)(c & 0x3f | 0x80));
	//  156  292:aload_2         
	//  157  293:lload           10
	//  158  295:iload           5
	//  159  297:bipush          63
	//  160  299:iand            
	//  161  300:sipush          128
	//  162  303:ior             
	//  163  304:int2byte        
	//  164  305:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							l1 = l2 + 1L;
	//  165  308:lload           10
	//  166  310:lconst_1        
	//  167  311:ladd            
	//  168  312:lstore          8
						} else
	//* 169  314:goto            465
						{
							if(l2 > l3 - 4L)
								break label2;
	//  170  317:lload           10
	//  171  319:lload           12
	//  172  321:ldc2w           #79  <Long 4L>
	//  173  324:lsub            
	//  174  325:lcmp            
	//  175  326:ifgt            489
							j = i + 1;
	//  176  329:iload_3         
	//  177  330:iconst_1        
	//  178  331:iadd            
	//  179  332:istore          4
							if(j == k)
								break;
	//  180  334:iload           4
	//  181  336:iload           7
	//  182  338:icmpeq          476
							char c2 = charsequence.charAt(j);
	//  183  341:aload_1         
	//  184  342:iload           4
	//  185  344:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  186  349:istore          6
							i = j;
	//  187  351:iload           4
	//  188  353:istore_3        
							if(!Character.isSurrogatePair(c, c2))
								break;
	//  189  354:iload           5
	//  190  356:iload           6
	//  191  358:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//  192  361:ifeq            476
							i = Character.toCodePoint(c, c2);
	//  193  364:iload           5
	//  194  366:iload           6
	//  195  368:invokestatic    #90  <Method int Character.toCodePoint(char, char)>
	//  196  371:istore_3        
							l1 = l2 + 1L;
	//  197  372:lload           10
	//  198  374:lconst_1        
	//  199  375:ladd            
	//  200  376:lstore          8
							zzxj.zza(abyte0, l2, (byte)(i >>> 18 | 0xf0));
	//  201  378:aload_2         
	//  202  379:lload           10
	//  203  381:iload_3         
	//  204  382:bipush          18
	//  205  384:iushr           
	//  206  385:sipush          240
	//  207  388:ior             
	//  208  389:int2byte        
	//  209  390:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							l2 = l1 + 1L;
	//  210  393:lload           8
	//  211  395:lconst_1        
	//  212  396:ladd            
	//  213  397:lstore          10
							zzxj.zza(abyte0, l1, (byte)(i >>> 12 & 0x3f | 0x80));
	//  214  399:aload_2         
	//  215  400:lload           8
	//  216  402:iload_3         
	//  217  403:bipush          12
	//  218  405:iushr           
	//  219  406:bipush          63
	//  220  408:iand            
	//  221  409:sipush          128
	//  222  412:ior             
	//  223  413:int2byte        
	//  224  414:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							long l5 = l2 + 1L;
	//  225  417:lload           10
	//  226  419:lconst_1        
	//  227  420:ladd            
	//  228  421:lstore          14
							zzxj.zza(abyte0, l2, (byte)(i >>> 6 & 0x3f | 0x80));
	//  229  423:aload_2         
	//  230  424:lload           10
	//  231  426:iload_3         
	//  232  427:bipush          6
	//  233  429:iushr           
	//  234  430:bipush          63
	//  235  432:iand            
	//  236  433:sipush          128
	//  237  436:ior             
	//  238  437:int2byte        
	//  239  438:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							l1 = l5 + 1L;
	//  240  441:lload           14
	//  241  443:lconst_1        
	//  242  444:ladd            
	//  243  445:lstore          8
							zzxj.zza(abyte0, l5, (byte)(i & 0x3f | 0x80));
	//  244  447:aload_2         
	//  245  448:lload           14
	//  246  450:iload_3         
	//  247  451:bipush          63
	//  248  453:iand            
	//  249  454:sipush          128
	//  250  457:ior             
	//  251  458:int2byte        
	//  252  459:invokestatic    #72  <Method void zzxj.zza(byte[], long, byte)>
							i = j;
	//  253  462:iload           4
	//  254  464:istore_3        
						}
						i++;
	//  255  465:iload_3         
	//  256  466:iconst_1        
	//  257  467:iadd            
	//  258  468:istore_3        
						l2 = l1;
	//  259  469:lload           8
	//  260  471:lstore          10
					} while(true);
	//  261  473:goto            103
					throw new zzxp(i - 1, k);
	//  262  476:new             #92  <Class zzxp>
	//  263  479:dup             
	//  264  480:iload_3         
	//  265  481:iconst_1        
	//  266  482:isub            
	//  267  483:iload           7
	//  268  485:invokespecial   #95  <Method void zzxp(int, int)>
	//  269  488:athrow          
				}
				if('\uD800' <= c && c <= '\uDFFF')
	//* 270  489:ldc1            #75  <Int 55296>
	//* 271  491:iload           5
	//* 272  493:icmpgt          542
	//* 273  496:iload           5
	//* 274  498:ldc1            #76  <Int 57343>
	//* 275  500:icmpgt          542
				{
					j = i + 1;
	//  276  503:iload_3         
	//  277  504:iconst_1        
	//  278  505:iadd            
	//  279  506:istore          4
					if(j == k || !Character.isSurrogatePair(c, charsequence.charAt(j)))
	//* 280  508:iload           4
	//* 281  510:iload           7
	//* 282  512:icmpeq          531
	//* 283  515:iload           5
	//* 284  517:aload_1         
	//* 285  518:iload           4
	//* 286  520:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//* 287  525:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//* 288  528:ifne            542
						throw new zzxp(i, k);
	//  289  531:new             #92  <Class zzxp>
	//  290  534:dup             
	//  291  535:iload_3         
	//  292  536:iload           7
	//  293  538:invokespecial   #95  <Method void zzxp(int, int)>
	//  294  541:athrow          
				}
				charsequence = ((CharSequence) (new StringBuilder(46)));
	//  295  542:new             #97  <Class StringBuilder>
	//  296  545:dup             
	//  297  546:bipush          46
	//  298  548:invokespecial   #100 <Method void StringBuilder(int)>
	//  299  551:astore_1        
				((StringBuilder) (charsequence)).append("Failed writing ");
	//  300  552:aload_1         
	//  301  553:ldc1            #102 <String "Failed writing ">
	//  302  555:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  303  558:pop             
				((StringBuilder) (charsequence)).append(c);
	//  304  559:aload_1         
	//  305  560:iload           5
	//  306  562:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  307  565:pop             
				((StringBuilder) (charsequence)).append(" at index ");
	//  308  566:aload_1         
	//  309  567:ldc1            #111 <String " at index ">
	//  310  569:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  311  572:pop             
				((StringBuilder) (charsequence)).append(l2);
	//  312  573:aload_1         
	//  313  574:lload           10
	//  314  576:invokevirtual   #114 <Method StringBuilder StringBuilder.append(long)>
	//  315  579:pop             
				throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  316  580:new             #39  <Class ArrayIndexOutOfBoundsException>
	//  317  583:dup             
	//  318  584:aload_1         
	//  319  585:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  320  588:invokespecial   #58  <Method void ArrayIndexOutOfBoundsException(String)>
	//  321  591:athrow          
			}
			return (int)l2;
	//  322  592:lload           10
	//  323  594:l2i             
	//  324  595:ireturn         
		}
		char c1 = charsequence.charAt(k - 1);
	//  325  596:aload_1         
	//  326  597:iload           7
	//  327  599:iconst_1        
	//  328  600:isub            
	//  329  601:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  330  606:istore          5
		charsequence = ((CharSequence) (new StringBuilder(37)));
	//  331  608:new             #97  <Class StringBuilder>
	//  332  611:dup             
	//  333  612:bipush          37
	//  334  614:invokespecial   #100 <Method void StringBuilder(int)>
	//  335  617:astore_1        
		((StringBuilder) (charsequence)).append("Failed writing ");
	//  336  618:aload_1         
	//  337  619:ldc1            #102 <String "Failed writing ">
	//  338  621:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  339  624:pop             
		((StringBuilder) (charsequence)).append(c1);
	//  340  625:aload_1         
	//  341  626:iload           5
	//  342  628:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  343  631:pop             
		((StringBuilder) (charsequence)).append(" at index ");
	//  344  632:aload_1         
	//  345  633:ldc1            #111 <String " at index ">
	//  346  635:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  347  638:pop             
		((StringBuilder) (charsequence)).append(i + j);
	//  348  639:aload_1         
	//  349  640:iload_3         
	//  350  641:iload           4
	//  351  643:iadd            
	//  352  644:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  353  647:pop             
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  354  648:new             #39  <Class ArrayIndexOutOfBoundsException>
	//  355  651:dup             
	//  356  652:aload_1         
	//  357  653:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  358  656:invokespecial   #58  <Method void ArrayIndexOutOfBoundsException(String)>
	//  359  659:athrow          
	}

	final void zzb(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		int j1;
label0:
		{
			long l4;
			long l5;
label1:
			{
				char c;
				int i;
label2:
				{
label3:
					{
						l5 = zzxj.zzb(bytebuffer);
	//    0    0:aload_2         
	//    1    1:invokestatic    #125 <Method long zzxj.zzb(ByteBuffer)>
	//    2    4:lstore          15
						long l2 = (long)bytebuffer.position() + l5;
	//    3    6:aload_2         
	//    4    7:invokevirtual   #130 <Method int ByteBuffer.position()>
	//    5   10:i2l             
	//    6   11:lload           15
	//    7   13:ladd            
	//    8   14:lstore          11
						long l6 = (long)bytebuffer.limit() + l5;
	//    9   16:aload_2         
	//   10   17:invokevirtual   #133 <Method int ByteBuffer.limit()>
	//   11   20:i2l             
	//   12   21:lload           15
	//   13   23:ladd            
	//   14   24:lstore          17
						j1 = charsequence.length();
	//   15   26:aload_1         
	//   16   27:invokeinterface #65  <Method int CharSequence.length()>
	//   17   32:istore          8
						if((long)j1 > l6 - l2)
							break label0;
	//   18   34:iload           8
	//   19   36:i2l             
	//   20   37:lload           17
	//   21   39:lload           11
	//   22   41:lsub            
	//   23   42:lcmp            
	//   24   43:ifgt            674
						int k = 0;
	//   25   46:iconst_0        
	//   26   47:istore          6
						int i1;
						long l1;
						do
						{
							i1 = 128;
	//   27   49:sipush          128
	//   28   52:istore          7
							l1 = 1L;
	//   29   54:lconst_1        
	//   30   55:lstore          9
							if(k >= j1)
								break;
	//   31   57:iload           6
	//   32   59:iload           8
	//   33   61:icmpge          105
							char c3 = charsequence.charAt(k);
	//   34   64:aload_1         
	//   35   65:iload           6
	//   36   67:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   37   72:istore          5
							if(c3 >= '\200')
								break;
	//   38   74:iload           5
	//   39   76:sipush          128
	//   40   79:icmpge          105
							zzxj.zza(l2, (byte)c3);
	//   41   82:lload           11
	//   42   84:iload           5
	//   43   86:int2byte        
	//   44   87:invokestatic    #136 <Method void zzxj.zza(long, byte)>
							k++;
	//   45   90:iload           6
	//   46   92:iconst_1        
	//   47   93:iadd            
	//   48   94:istore          6
							l2++;
	//   49   96:lload           11
	//   50   98:lconst_1        
	//   51   99:ladd            
	//   52  100:lstore          11
						} while(true);
	//   53  102:goto            49
						l4 = l2;
	//   54  105:lload           11
	//   55  107:lstore          13
						i = k;
	//   56  109:iload           6
	//   57  111:istore          5
						if(k == j1)
	//*  58  113:iload           6
	//*  59  115:iload           8
	//*  60  117:icmpne          132
						{
							bytebuffer.position((int)(l2 - l5));
	//   61  120:aload_2         
	//   62  121:lload           11
	//   63  123:lload           15
	//   64  125:lsub            
	//   65  126:l2i             
	//   66  127:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   67  130:pop             
							return;
	//   68  131:return          
						}
						do
						{
							if(i >= j1)
								break label1;
	//   69  132:iload           5
	//   70  134:iload           8
	//   71  136:icmpge          662
							c = charsequence.charAt(i);
	//   72  139:aload_1         
	//   73  140:iload           5
	//   74  142:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//   75  147:istore_3        
							long l3;
							if(c < i1 && l4 < l6)
	//*  76  148:iload_3         
	//*  77  149:iload           7
	//*  78  151:icmpge          187
	//*  79  154:lload           13
	//*  80  156:lload           17
	//*  81  158:lcmp            
	//*  82  159:ifge            187
							{
								l3 = l4 + l1;
	//   83  162:lload           13
	//   84  164:lload           9
	//   85  166:ladd            
	//   86  167:lstore          11
								zzxj.zza(l4, (byte)c);
	//   87  169:lload           13
	//   88  171:iload_3         
	//   89  172:int2byte        
	//   90  173:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								k = i;
	//   91  176:iload           5
	//   92  178:istore          6
								i = i1;
	//   93  180:iload           7
	//   94  182:istore          5
							} else
	//*  95  184:goto            522
							if(c < '\u0800' && l4 <= l6 - 2L)
	//*  96  187:iload_3         
	//*  97  188:sipush          2048
	//*  98  191:icmpge          264
	//*  99  194:lload           13
	//* 100  196:lload           17
	//* 101  198:ldc2w           #73  <Long 2L>
	//* 102  201:lsub            
	//* 103  202:lcmp            
	//* 104  203:ifgt            264
							{
								l3 = l4 + l1;
	//  105  206:lload           13
	//  106  208:lload           9
	//  107  210:ladd            
	//  108  211:lstore          11
								zzxj.zza(l4, (byte)(c >>> 6 | 0x3c0));
	//  109  213:lload           13
	//  110  215:iload_3         
	//  111  216:bipush          6
	//  112  218:iushr           
	//  113  219:sipush          960
	//  114  222:ior             
	//  115  223:int2byte        
	//  116  224:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								zzxj.zza(l3, (byte)(c & 0x3f | 0x80));
	//  117  227:lload           11
	//  118  229:iload_3         
	//  119  230:bipush          63
	//  120  232:iand            
	//  121  233:sipush          128
	//  122  236:ior             
	//  123  237:int2byte        
	//  124  238:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								l3 += l1;
	//  125  241:lload           11
	//  126  243:lload           9
	//  127  245:ladd            
	//  128  246:lstore          11
								i1 = 128;
	//  129  248:sipush          128
	//  130  251:istore          7
								k = i;
	//  131  253:iload           5
	//  132  255:istore          6
								i = i1;
	//  133  257:iload           7
	//  134  259:istore          5
							} else
	//* 135  261:goto            522
							if((c < '\uD800' || '\uDFFF' < c) && l4 <= l6 - 3L)
	//* 136  264:iload_3         
	//* 137  265:ldc1            #75  <Int 55296>
	//* 138  267:icmplt          276
	//* 139  270:ldc1            #76  <Int 57343>
	//* 140  272:iload_3         
	//* 141  273:icmpge          372
	//* 142  276:lload           13
	//* 143  278:lload           17
	//* 144  280:ldc2w           #77  <Long 3L>
	//* 145  283:lsub            
	//* 146  284:lcmp            
	//* 147  285:ifgt            372
							{
								l3 = l4 + l1;
	//  148  288:lload           13
	//  149  290:lload           9
	//  150  292:ladd            
	//  151  293:lstore          11
								zzxj.zza(l4, (byte)(c >>> 12 | 0x1e0));
	//  152  295:lload           13
	//  153  297:iload_3         
	//  154  298:bipush          12
	//  155  300:iushr           
	//  156  301:sipush          480
	//  157  304:ior             
	//  158  305:int2byte        
	//  159  306:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								l1 = l3 + l1;
	//  160  309:lload           11
	//  161  311:lload           9
	//  162  313:ladd            
	//  163  314:lstore          9
								zzxj.zza(l3, (byte)(c >>> 6 & 0x3f | 0x80));
	//  164  316:lload           11
	//  165  318:iload_3         
	//  166  319:bipush          6
	//  167  321:iushr           
	//  168  322:bipush          63
	//  169  324:iand            
	//  170  325:sipush          128
	//  171  328:ior             
	//  172  329:int2byte        
	//  173  330:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								zzxj.zza(l1, (byte)(c & 0x3f | 0x80));
	//  174  333:lload           9
	//  175  335:iload_3         
	//  176  336:bipush          63
	//  177  338:iand            
	//  178  339:sipush          128
	//  179  342:ior             
	//  180  343:int2byte        
	//  181  344:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								l3 = l1 + 1L;
	//  182  347:lload           9
	//  183  349:lconst_1        
	//  184  350:ladd            
	//  185  351:lstore          11
								l1 = 1L;
	//  186  353:lconst_1        
	//  187  354:lstore          9
								i1 = 128;
	//  188  356:sipush          128
	//  189  359:istore          7
								k = i;
	//  190  361:iload           5
	//  191  363:istore          6
								i = i1;
	//  192  365:iload           7
	//  193  367:istore          5
							} else
	//* 194  369:goto            522
							{
								if(l4 > l6 - 4L)
									break label2;
	//  195  372:lload           13
	//  196  374:lload           17
	//  197  376:ldc2w           #79  <Long 4L>
	//  198  379:lsub            
	//  199  380:lcmp            
	//  200  381:ifgt            561
								k = i + 1;
	//  201  384:iload           5
	//  202  386:iconst_1        
	//  203  387:iadd            
	//  204  388:istore          6
								if(k == j1)
									break label3;
	//  205  390:iload           6
	//  206  392:iload           8
	//  207  394:icmpeq          547
								char c2 = charsequence.charAt(k);
	//  208  397:aload_1         
	//  209  398:iload           6
	//  210  400:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  211  405:istore          4
								if(!Character.isSurrogatePair(c, c2))
									break;
	//  212  407:iload_3         
	//  213  408:iload           4
	//  214  410:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//  215  413:ifeq            543
								i1 = Character.toCodePoint(c, c2);
	//  216  416:iload_3         
	//  217  417:iload           4
	//  218  419:invokestatic    #90  <Method int Character.toCodePoint(char, char)>
	//  219  422:istore          7
								l1 = l4 + 1L;
	//  220  424:lload           13
	//  221  426:lconst_1        
	//  222  427:ladd            
	//  223  428:lstore          9
								zzxj.zza(l4, (byte)(i1 >>> 18 | 0xf0));
	//  224  430:lload           13
	//  225  432:iload           7
	//  226  434:bipush          18
	//  227  436:iushr           
	//  228  437:sipush          240
	//  229  440:ior             
	//  230  441:int2byte        
	//  231  442:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								l3 = l1 + 1L;
	//  232  445:lload           9
	//  233  447:lconst_1        
	//  234  448:ladd            
	//  235  449:lstore          11
								i = 128;
	//  236  451:sipush          128
	//  237  454:istore          5
								zzxj.zza(l1, (byte)(i1 >>> 12 & 0x3f | 0x80));
	//  238  456:lload           9
	//  239  458:iload           7
	//  240  460:bipush          12
	//  241  462:iushr           
	//  242  463:bipush          63
	//  243  465:iand            
	//  244  466:sipush          128
	//  245  469:ior             
	//  246  470:int2byte        
	//  247  471:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								l4 = l3 + 1L;
	//  248  474:lload           11
	//  249  476:lconst_1        
	//  250  477:ladd            
	//  251  478:lstore          13
								zzxj.zza(l3, (byte)(i1 >>> 6 & 0x3f | 0x80));
	//  252  480:lload           11
	//  253  482:iload           7
	//  254  484:bipush          6
	//  255  486:iushr           
	//  256  487:bipush          63
	//  257  489:iand            
	//  258  490:sipush          128
	//  259  493:ior             
	//  260  494:int2byte        
	//  261  495:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								l1 = 1L;
	//  262  498:lconst_1        
	//  263  499:lstore          9
								zzxj.zza(l4, (byte)(i1 & 0x3f | 0x80));
	//  264  501:lload           13
	//  265  503:iload           7
	//  266  505:bipush          63
	//  267  507:iand            
	//  268  508:sipush          128
	//  269  511:ior             
	//  270  512:int2byte        
	//  271  513:invokestatic    #136 <Method void zzxj.zza(long, byte)>
								l3 = l4 + 1L;
	//  272  516:lload           13
	//  273  518:lconst_1        
	//  274  519:ladd            
	//  275  520:lstore          11
							}
							k++;
	//  276  522:iload           6
	//  277  524:iconst_1        
	//  278  525:iadd            
	//  279  526:istore          6
							i1 = i;
	//  280  528:iload           5
	//  281  530:istore          7
							l4 = l3;
	//  282  532:lload           11
	//  283  534:lstore          13
							i = k;
	//  284  536:iload           6
	//  285  538:istore          5
						} while(true);
	//  286  540:goto            132
						i = k;
	//  287  543:iload           6
	//  288  545:istore          5
					}
					throw new zzxp(i - 1, j1);
	//  289  547:new             #92  <Class zzxp>
	//  290  550:dup             
	//  291  551:iload           5
	//  292  553:iconst_1        
	//  293  554:isub            
	//  294  555:iload           8
	//  295  557:invokespecial   #95  <Method void zzxp(int, int)>
	//  296  560:athrow          
				}
				if('\uD800' <= c && c <= '\uDFFF')
	//* 297  561:ldc1            #75  <Int 55296>
	//* 298  563:iload_3         
	//* 299  564:icmpgt          613
	//* 300  567:iload_3         
	//* 301  568:ldc1            #76  <Int 57343>
	//* 302  570:icmpgt          613
				{
					int l = i + 1;
	//  303  573:iload           5
	//  304  575:iconst_1        
	//  305  576:iadd            
	//  306  577:istore          6
					if(l == j1 || !Character.isSurrogatePair(c, charsequence.charAt(l)))
	//* 307  579:iload           6
	//* 308  581:iload           8
	//* 309  583:icmpeq          601
	//* 310  586:iload_3         
	//* 311  587:aload_1         
	//* 312  588:iload           6
	//* 313  590:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//* 314  595:invokestatic    #86  <Method boolean Character.isSurrogatePair(char, char)>
	//* 315  598:ifne            613
						throw new zzxp(i, j1);
	//  316  601:new             #92  <Class zzxp>
	//  317  604:dup             
	//  318  605:iload           5
	//  319  607:iload           8
	//  320  609:invokespecial   #95  <Method void zzxp(int, int)>
	//  321  612:athrow          
				}
				charsequence = ((CharSequence) (new StringBuilder(46)));
	//  322  613:new             #97  <Class StringBuilder>
	//  323  616:dup             
	//  324  617:bipush          46
	//  325  619:invokespecial   #100 <Method void StringBuilder(int)>
	//  326  622:astore_1        
				((StringBuilder) (charsequence)).append("Failed writing ");
	//  327  623:aload_1         
	//  328  624:ldc1            #102 <String "Failed writing ">
	//  329  626:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  330  629:pop             
				((StringBuilder) (charsequence)).append(c);
	//  331  630:aload_1         
	//  332  631:iload_3         
	//  333  632:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  334  635:pop             
				((StringBuilder) (charsequence)).append(" at index ");
	//  335  636:aload_1         
	//  336  637:ldc1            #111 <String " at index ">
	//  337  639:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  338  642:pop             
				((StringBuilder) (charsequence)).append(l4);
	//  339  643:aload_1         
	//  340  644:lload           13
	//  341  646:invokevirtual   #114 <Method StringBuilder StringBuilder.append(long)>
	//  342  649:pop             
				throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  343  650:new             #39  <Class ArrayIndexOutOfBoundsException>
	//  344  653:dup             
	//  345  654:aload_1         
	//  346  655:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  347  658:invokespecial   #58  <Method void ArrayIndexOutOfBoundsException(String)>
	//  348  661:athrow          
			}
			bytebuffer.position((int)(l4 - l5));
	//  349  662:aload_2         
	//  350  663:lload           13
	//  351  665:lload           15
	//  352  667:lsub            
	//  353  668:l2i             
	//  354  669:invokevirtual   #139 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  355  672:pop             
			return;
	//  356  673:return          
		}
		char c1 = charsequence.charAt(j1 - 1);
	//  357  674:aload_1         
	//  358  675:iload           8
	//  359  677:iconst_1        
	//  360  678:isub            
	//  361  679:invokeinterface #69  <Method char CharSequence.charAt(int)>
	//  362  684:istore_3        
		int j = bytebuffer.limit();
	//  363  685:aload_2         
	//  364  686:invokevirtual   #133 <Method int ByteBuffer.limit()>
	//  365  689:istore          5
		charsequence = ((CharSequence) (new StringBuilder(37)));
	//  366  691:new             #97  <Class StringBuilder>
	//  367  694:dup             
	//  368  695:bipush          37
	//  369  697:invokespecial   #100 <Method void StringBuilder(int)>
	//  370  700:astore_1        
		((StringBuilder) (charsequence)).append("Failed writing ");
	//  371  701:aload_1         
	//  372  702:ldc1            #102 <String "Failed writing ">
	//  373  704:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  374  707:pop             
		((StringBuilder) (charsequence)).append(c1);
	//  375  708:aload_1         
	//  376  709:iload_3         
	//  377  710:invokevirtual   #109 <Method StringBuilder StringBuilder.append(char)>
	//  378  713:pop             
		((StringBuilder) (charsequence)).append(" at index ");
	//  379  714:aload_1         
	//  380  715:ldc1            #111 <String " at index ">
	//  381  717:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//  382  720:pop             
		((StringBuilder) (charsequence)).append(j);
	//  383  721:aload_1         
	//  384  722:iload           5
	//  385  724:invokevirtual   #121 <Method StringBuilder StringBuilder.append(int)>
	//  386  727:pop             
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  387  728:new             #39  <Class ArrayIndexOutOfBoundsException>
	//  388  731:dup             
	//  389  732:aload_1         
	//  390  733:invokevirtual   #118 <Method String StringBuilder.toString()>
	//  391  736:invokespecial   #58  <Method void ArrayIndexOutOfBoundsException(String)>
	//  392  739:athrow          
	}

	final String zzh(byte abyte0[], int i, int j)
		throws zzuv
	{
		if((i | j | abyte0.length - i - j) >= 0)
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
	//*  10   10:iflt            347
		{
			int i1 = i + j;
	//   11   13:iload_2         
	//   12   14:iload_3         
	//   13   15:iadd            
	//   14   16:istore          7
			char ac[] = new char[j];
	//   15   18:iload_3         
	//   16   19:newarray        char[]
	//   17   21:astore          8
			j = 0;
	//   18   23:iconst_0        
	//   19   24:istore_3        
			do
			{
				if(i >= i1)
					break;
	//   20   25:iload_2         
	//   21   26:iload           7
	//   22   28:icmpge          66
				byte byte0 = zzxj.zza(abyte0, i);
	//   23   31:aload_1         
	//   24   32:iload_2         
	//   25   33:i2l             
	//   26   34:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   27   37:istore          4
				if(!zzxm.zzh(byte0))
					break;
	//   28   39:iload           4
	//   29   41:invokestatic    #148 <Method boolean zzxm.zzh(byte)>
	//   30   44:ifeq            66
				i++;
	//   31   47:iload_2         
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:istore_2        
				zzxm.zzb(byte0, ac, j);
	//   35   51:iload           4
	//   36   53:aload           8
	//   37   55:iload_3         
	//   38   56:invokestatic    #151 <Method void zzxm.zzb(byte, char[], int)>
				j++;
	//   39   59:iload_3         
	//   40   60:iconst_1        
	//   41   61:iadd            
	//   42   62:istore_3        
			} while(true);
	//   43   63:goto            25
			int k = j;
	//   44   66:iload_3         
	//   45   67:istore          6
			j = i;
	//   46   69:iload_2         
	//   47   70:istore_3        
			i = k;
	//   48   71:iload           6
	//   49   73:istore_2        
label0:
			do
			{
				if(j >= i1)
					break;
	//   50   74:iload_3         
	//   51   75:iload           7
	//   52   77:icmpge          335
				int l = j + 1;
	//   53   80:iload_3         
	//   54   81:iconst_1        
	//   55   82:iadd            
	//   56   83:istore          6
				byte byte1 = zzxj.zza(abyte0, j);
	//   57   85:aload_1         
	//   58   86:iload_3         
	//   59   87:i2l             
	//   60   88:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   61   91:istore          4
				if(zzxm.zzh(byte1))
	//*  62   93:iload           4
	//*  63   95:invokestatic    #148 <Method boolean zzxm.zzh(byte)>
	//*  64   98:ifeq            162
				{
					j = i + 1;
	//   65  101:iload_2         
	//   66  102:iconst_1        
	//   67  103:iadd            
	//   68  104:istore_3        
					zzxm.zzb(byte1, ac, i);
	//   69  105:iload           4
	//   70  107:aload           8
	//   71  109:iload_2         
	//   72  110:invokestatic    #151 <Method void zzxm.zzb(byte, char[], int)>
					i = j;
	//   73  113:iload_3         
	//   74  114:istore_2        
					j = l;
	//   75  115:iload           6
	//   76  117:istore_3        
					do
					{
						if(j >= i1)
							continue label0;
	//   77  118:iload_3         
	//   78  119:iload           7
	//   79  121:icmpge          159
						byte1 = zzxj.zza(abyte0, j);
	//   80  124:aload_1         
	//   81  125:iload_3         
	//   82  126:i2l             
	//   83  127:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//   84  130:istore          4
						if(!zzxm.zzh(byte1))
							continue label0;
	//   85  132:iload           4
	//   86  134:invokestatic    #148 <Method boolean zzxm.zzh(byte)>
	//   87  137:ifeq            159
						j++;
	//   88  140:iload_3         
	//   89  141:iconst_1        
	//   90  142:iadd            
	//   91  143:istore_3        
						zzxm.zzb(byte1, ac, i);
	//   92  144:iload           4
	//   93  146:aload           8
	//   94  148:iload_2         
	//   95  149:invokestatic    #151 <Method void zzxm.zzb(byte, char[], int)>
						i++;
	//   96  152:iload_2         
	//   97  153:iconst_1        
	//   98  154:iadd            
	//   99  155:istore_2        
					} while(true);
	//  100  156:goto            118
				}
	//* 101  159:goto            74
				if(zzxm.zzi(byte1))
	//* 102  162:iload           4
	//* 103  164:invokestatic    #154 <Method boolean zzxm.zzi(byte)>
	//* 104  167:ifeq            208
				{
					if(l < i1)
	//* 105  170:iload           6
	//* 106  172:iload           7
	//* 107  174:icmpge          204
					{
						zzxm.zzb(byte1, zzxj.zza(abyte0, l), ac, i);
	//  108  177:iload           4
	//  109  179:aload_1         
	//  110  180:iload           6
	//  111  182:i2l             
	//  112  183:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  113  186:aload           8
	//  114  188:iload_2         
	//  115  189:invokestatic    #157 <Method void zzxm.zzb(byte, byte, char[], int)>
						j = l + 1;
	//  116  192:iload           6
	//  117  194:iconst_1        
	//  118  195:iadd            
	//  119  196:istore_3        
						i++;
	//  120  197:iload_2         
	//  121  198:iconst_1        
	//  122  199:iadd            
	//  123  200:istore_2        
					} else
	//* 124  201:goto            74
					{
						throw zzuv.zzwx();
	//  125  204:invokestatic    #161 <Method zzuv zzuv.zzwx()>
	//  126  207:athrow          
					}
				} else
				if(zzxm.zzj(byte1))
	//* 127  208:iload           4
	//* 128  210:invokestatic    #164 <Method boolean zzxm.zzj(byte)>
	//* 129  213:ifeq            266
				{
					if(l < i1 - 1)
	//* 130  216:iload           6
	//* 131  218:iload           7
	//* 132  220:iconst_1        
	//* 133  221:isub            
	//* 134  222:icmpge          262
					{
						j = l + 1;
	//  135  225:iload           6
	//  136  227:iconst_1        
	//  137  228:iadd            
	//  138  229:istore_3        
						zzxm.zzb(byte1, zzxj.zza(abyte0, l), zzxj.zza(abyte0, j), ac, i);
	//  139  230:iload           4
	//  140  232:aload_1         
	//  141  233:iload           6
	//  142  235:i2l             
	//  143  236:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  144  239:aload_1         
	//  145  240:iload_3         
	//  146  241:i2l             
	//  147  242:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  148  245:aload           8
	//  149  247:iload_2         
	//  150  248:invokestatic    #167 <Method void zzxm.zzb(byte, byte, byte, char[], int)>
						j++;
	//  151  251:iload_3         
	//  152  252:iconst_1        
	//  153  253:iadd            
	//  154  254:istore_3        
						i++;
	//  155  255:iload_2         
	//  156  256:iconst_1        
	//  157  257:iadd            
	//  158  258:istore_2        
					} else
	//* 159  259:goto            74
					{
						throw zzuv.zzwx();
	//  160  262:invokestatic    #161 <Method zzuv zzuv.zzwx()>
	//  161  265:athrow          
					}
				} else
				if(l < i1 - 2)
	//* 162  266:iload           6
	//* 163  268:iload           7
	//* 164  270:iconst_2        
	//* 165  271:isub            
	//* 166  272:icmpge          331
				{
					j = l + 1;
	//  167  275:iload           6
	//  168  277:iconst_1        
	//  169  278:iadd            
	//  170  279:istore_3        
					byte byte2 = zzxj.zza(abyte0, l);
	//  171  280:aload_1         
	//  172  281:iload           6
	//  173  283:i2l             
	//  174  284:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  175  287:istore          5
					l = j + 1;
	//  176  289:iload_3         
	//  177  290:iconst_1        
	//  178  291:iadd            
	//  179  292:istore          6
					zzxm.zzb(byte1, byte2, zzxj.zza(abyte0, j), zzxj.zza(abyte0, l), ac, i);
	//  180  294:iload           4
	//  181  296:iload           5
	//  182  298:aload_1         
	//  183  299:iload_3         
	//  184  300:i2l             
	//  185  301:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  186  304:aload_1         
	//  187  305:iload           6
	//  188  307:i2l             
	//  189  308:invokestatic    #19  <Method byte zzxj.zza(byte[], long)>
	//  190  311:aload           8
	//  191  313:iload_2         
	//  192  314:invokestatic    #170 <Method void zzxm.zzb(byte, byte, byte, byte, char[], int)>
					j = l + 1;
	//  193  317:iload           6
	//  194  319:iconst_1        
	//  195  320:iadd            
	//  196  321:istore_3        
					i = i + 1 + 1;
	//  197  322:iload_2         
	//  198  323:iconst_1        
	//  199  324:iadd            
	//  200  325:iconst_1        
	//  201  326:iadd            
	//  202  327:istore_2        
				} else
	//* 203  328:goto            74
				{
					throw zzuv.zzwx();
	//  204  331:invokestatic    #161 <Method zzuv zzuv.zzwx()>
	//  205  334:athrow          
				}
			} while(true);
			return new String(ac, 0, i);
	//  206  335:new             #51  <Class String>
	//  207  338:dup             
	//  208  339:aload           8
	//  209  341:iconst_0        
	//  210  342:iload_2         
	//  211  343:invokespecial   #173 <Method void String(char[], int, int)>
	//  212  346:areturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] {
				Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
			}));
	//  213  347:new             #39  <Class ArrayIndexOutOfBoundsException>
	//  214  350:dup             
	//  215  351:ldc1            #175 <String "buffer length=%d, index=%d, size=%d">
	//  216  353:iconst_3        
	//  217  354:anewarray       Object[]
	//  218  357:dup             
	//  219  358:iconst_0        
	//  220  359:aload_1         
	//  221  360:arraylength     
	//  222  361:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//  223  364:aastore         
	//  224  365:dup             
	//  225  366:iconst_1        
	//  226  367:iload_2         
	//  227  368:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//  228  371:aastore         
	//  229  372:dup             
	//  230  373:iconst_2        
	//  231  374:iload_3         
	//  232  375:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//  233  378:aastore         
	//  234  379:invokestatic    #55  <Method String String.format(String, Object[])>
	//  235  382:invokespecial   #58  <Method void ArrayIndexOutOfBoundsException(String)>
	//  236  385:athrow          
		}
	}
}
