// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

// Referenced classes of package com.google.android.gms.internal.ads:
//			avu, avm, avs, avw, 
//			avt, asu

final class avx extends avu
{

	avx()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void avu()>
	//    2    4:return          
	}

	private static int a(byte abyte0[], int i, long l, int j)
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
			return avs.a(i, ((int) (avm.a(abyte0, l))), ((int) (avm.a(abyte0, l + 1L))));
	//    6   36:iload_1         
	//    7   37:aload_0         
	//    8   38:lload_2         
	//    9   39:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//   10   42:aload_0         
	//   11   43:lload_2         
	//   12   44:lconst_1        
	//   13   45:ladd            
	//   14   46:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//   15   49:invokestatic    #24  <Method int avs.a(int, int, int)>
	//   16   52:ireturn         

		case 1: // '\001'
			return avs.a(i, ((int) (avm.a(abyte0, l))));
	//   17   53:iload_1         
	//   18   54:aload_0         
	//   19   55:lload_2         
	//   20   56:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//   21   59:invokestatic    #27  <Method int avs.a(int, int)>
	//   22   62:ireturn         

		case 0: // '\0'
			return avs.a(i);
	//   23   63:iload_1         
	//   24   64:invokestatic    #30  <Method int avs.a(int)>
	//   25   67:ireturn         
		}
	}

	final int a(int i, byte abyte0[], int j, int k)
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
	//    8   10:iflt            392
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
				long l = l2;
	//   24   36:lload           7
	//   25   38:lstore          5
				for(i = 0; i < j;)
	//*  26   40:iconst_0        
	//*  27   41:istore_1        
	//*  28   42:iload_1         
	//*  29   43:iload_3         
	//*  30   44:icmpge          72
				{
					if(avm.a(abyte0, l) < 0)
	//*  31   47:aload_2         
	//*  32   48:lload           5
	//*  33   50:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//*  34   53:ifge            59
						break label1;
	//   35   56:goto            74
					i++;
	//   36   59:iload_1         
	//   37   60:iconst_1        
	//   38   61:iadd            
	//   39   62:istore_1        
					l++;
	//   40   63:lload           5
	//   41   65:lconst_1        
	//   42   66:ladd            
	//   43   67:lstore          5
				}

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
				k = 0;
	//   58   87:iconst_0        
	//   59   88:istore          4
				j = i;
	//   60   90:iload_1         
	//   61   91:istore_3        
				i = k;
	//   62   92:iload           4
	//   63   94:istore_1        
				do
				{
					if(j <= 0)
						break;
	//   64   95:iload_3         
	//   65   96:ifle            139
					long l3 = l1 + 1L;
	//   66   99:lload           5
	//   67  101:lconst_1        
	//   68  102:ladd            
	//   69  103:lstore          7
					k = ((int) (avm.a(abyte0, l1)));
	//   70  105:aload_2         
	//   71  106:lload           5
	//   72  108:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//   73  111:istore          4
					i = k;
	//   74  113:iload           4
	//   75  115:istore_1        
					l1 = l3;
	//   76  116:lload           7
	//   77  118:lstore          5
					if(k < 0)
						break;
	//   78  120:iload           4
	//   79  122:iflt            139
					j--;
	//   80  125:iload_3         
	//   81  126:iconst_1        
	//   82  127:isub            
	//   83  128:istore_3        
					l1 = l3;
	//   84  129:lload           7
	//   85  131:lstore          5
					i = k;
	//   86  133:iload           4
	//   87  135:istore_1        
				} while(true);
	//   88  136:goto            95
				if(j == 0)
	//*  89  139:iload_3         
	//*  90  140:ifne            145
					return 0;
	//   91  143:iconst_0        
	//   92  144:ireturn         
				j--;
	//   93  145:iload_3         
	//   94  146:iconst_1        
	//   95  147:isub            
	//   96  148:istore_3        
				if(i < -32)
	//*  97  149:iload_1         
	//*  98  150:bipush          -32
	//*  99  152:icmpge          197
				{
					if(j == 0)
	//* 100  155:iload_3         
	//* 101  156:ifne            161
						return i;
	//  102  159:iload_1         
	//  103  160:ireturn         
					j--;
	//  104  161:iload_3         
	//  105  162:iconst_1        
	//  106  163:isub            
	//  107  164:istore_3        
					if(i >= -62)
	//* 108  165:iload_1         
	//* 109  166:bipush          -62
	//* 110  168:icmplt          195
					{
						if(avm.a(abyte0, l1) > -65)
	//* 111  171:aload_2         
	//* 112  172:lload           5
	//* 113  174:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//* 114  177:bipush          -65
	//* 115  179:icmple          184
							return -1;
	//  116  182:iconst_m1       
	//  117  183:ireturn         
						l1++;
	//  118  184:lload           5
	//  119  186:lconst_1        
	//  120  187:ladd            
	//  121  188:lstore          5
						i = j;
	//  122  190:iload_3         
	//  123  191:istore_1        
					} else
	//* 124  192:goto            87
					{
						return -1;
	//  125  195:iconst_m1       
	//  126  196:ireturn         
					}
					continue;
				}
				if(i < -16)
	//* 127  197:iload_1         
	//* 128  198:bipush          -16
	//* 129  200:icmpge          294
				{
					if(j < 2)
	//* 130  203:iload_3         
	//* 131  204:iconst_2        
	//* 132  205:icmpge          217
						return a(abyte0, i, l1, j);
	//  133  208:aload_2         
	//  134  209:iload_1         
	//  135  210:lload           5
	//  136  212:iload_3         
	//  137  213:invokestatic    #33  <Method int a(byte[], int, long, int)>
	//  138  216:ireturn         
					j -= 2;
	//  139  217:iload_3         
	//  140  218:iconst_2        
	//  141  219:isub            
	//  142  220:istore_3        
					long l4 = l1 + 1L;
	//  143  221:lload           5
	//  144  223:lconst_1        
	//  145  224:ladd            
	//  146  225:lstore          7
					k = ((int) (avm.a(abyte0, l1)));
	//  147  227:aload_2         
	//  148  228:lload           5
	//  149  230:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  150  233:istore          4
					if(k <= -65 && (i != -32 || k >= -96) && (i != -19 || k < -96))
	//* 151  235:iload           4
	//* 152  237:bipush          -65
	//* 153  239:icmpgt          292
	//* 154  242:iload_1         
	//* 155  243:bipush          -32
	//* 156  245:icmpne          255
	//* 157  248:iload           4
	//* 158  250:bipush          -96
	//* 159  252:icmplt          292
	//* 160  255:iload_1         
	//* 161  256:bipush          -19
	//* 162  258:icmpne          268
	//* 163  261:iload           4
	//* 164  263:bipush          -96
	//* 165  265:icmpge          292
					{
						if(avm.a(abyte0, l4) > -65)
	//* 166  268:aload_2         
	//* 167  269:lload           7
	//* 168  271:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//* 169  274:bipush          -65
	//* 170  276:icmple          281
							return -1;
	//  171  279:iconst_m1       
	//  172  280:ireturn         
						l1 = l4 + 1L;
	//  173  281:lload           7
	//  174  283:lconst_1        
	//  175  284:ladd            
	//  176  285:lstore          5
						i = j;
	//  177  287:iload_3         
	//  178  288:istore_1        
					} else
	//* 179  289:goto            87
					{
						return -1;
	//  180  292:iconst_m1       
	//  181  293:ireturn         
					}
					continue;
				}
				if(j < 3)
	//* 182  294:iload_3         
	//* 183  295:iconst_3        
	//* 184  296:icmpge          308
					return a(abyte0, i, l1, j);
	//  185  299:aload_2         
	//  186  300:iload_1         
	//  187  301:lload           5
	//  188  303:iload_3         
	//  189  304:invokestatic    #33  <Method int a(byte[], int, long, int)>
	//  190  307:ireturn         
				j -= 3;
	//  191  308:iload_3         
	//  192  309:iconst_3        
	//  193  310:isub            
	//  194  311:istore_3        
				long l5 = l1 + 1L;
	//  195  312:lload           5
	//  196  314:lconst_1        
	//  197  315:ladd            
	//  198  316:lstore          7
				k = ((int) (avm.a(abyte0, l1)));
	//  199  318:aload_2         
	//  200  319:lload           5
	//  201  321:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  202  324:istore          4
				if(k > -65 || (i << 28) + (k + 112) >> 30 != 0)
					break;
	//  203  326:iload           4
	//  204  328:bipush          -65
	//  205  330:icmpgt          390
	//  206  333:iload_1         
	//  207  334:bipush          28
	//  208  336:ishl            
	//  209  337:iload           4
	//  210  339:bipush          112
	//  211  341:iadd            
	//  212  342:iadd            
	//  213  343:bipush          30
	//  214  345:ishr            
	//  215  346:ifne            390
				l1 = l5 + 1L;
	//  216  349:lload           7
	//  217  351:lconst_1        
	//  218  352:ladd            
	//  219  353:lstore          5
				if(avm.a(abyte0, l5) > -65)
					break;
	//  220  355:aload_2         
	//  221  356:lload           7
	//  222  358:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  223  361:bipush          -65
	//  224  363:icmpgt          390
				if(avm.a(abyte0, l1) > -65)
	//* 225  366:aload_2         
	//* 226  367:lload           5
	//* 227  369:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//* 228  372:bipush          -65
	//* 229  374:icmple          379
					return -1;
	//  230  377:iconst_m1       
	//  231  378:ireturn         
				l1++;
	//  232  379:lload           5
	//  233  381:lconst_1        
	//  234  382:ladd            
	//  235  383:lstore          5
				i = j;
	//  236  385:iload_3         
	//  237  386:istore_1        
			} while(true);
	//  238  387:goto            87
			return -1;
	//  239  390:iconst_m1       
	//  240  391:ireturn         
		}
		throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", new Object[] {
			Integer.valueOf(abyte0.length), Integer.valueOf(j), Integer.valueOf(k)
		}));
	//  241  392:new             #35  <Class ArrayIndexOutOfBoundsException>
	//  242  395:dup             
	//  243  396:ldc1            #37  <String "Array length=%d, index=%d, limit=%d">
	//  244  398:iconst_3        
	//  245  399:anewarray       Object[]
	//  246  402:dup             
	//  247  403:iconst_0        
	//  248  404:aload_2         
	//  249  405:arraylength     
	//  250  406:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//  251  409:aastore         
	//  252  410:dup             
	//  253  411:iconst_1        
	//  254  412:iload_3         
	//  255  413:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//  256  416:aastore         
	//  257  417:dup             
	//  258  418:iconst_2        
	//  259  419:iload           4
	//  260  421:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//  261  424:aastore         
	//  262  425:invokestatic    #51  <Method String String.format(String, Object[])>
	//  263  428:invokespecial   #54  <Method void ArrayIndexOutOfBoundsException(String)>
	//  264  431:athrow          
	}

	final int a(CharSequence charsequence, byte abyte0[], int i, int j)
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
	//    9   13:invokeinterface #61  <Method int CharSequence.length()>
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
	//   27   49:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//   28   54:istore_3        
						if(i >= 128)
							break;
	//   29   55:iload_3         
	//   30   56:sipush          128
	//   31   59:icmpge          85
						avm.a(abyte0, l, (byte)i);
	//   32   62:aload_2         
	//   33   63:lload           8
	//   34   65:iload_3         
	//   35   66:int2byte        
	//   36   67:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
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
	//   61  111:invokeinterface #65  <Method char CharSequence.charAt(int)>
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
							avm.a(abyte0, l2, (byte)c);
	//   70  134:aload_2         
	//   71  135:lload           10
	//   72  137:iload           5
	//   73  139:int2byte        
	//   74  140:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
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
	//*  85  164:ldc2w           #69  <Long 2L>
	//*  86  167:lsub            
	//*  87  168:lcmp            
	//*  88  169:ifgt            219
						{
							long l4 = l2 + 1L;
	//   89  172:lload           10
	//   90  174:lconst_1        
	//   91  175:ladd            
	//   92  176:lstore          14
							avm.a(abyte0, l2, (byte)(c >>> 6 | 0x3c0));
	//   93  178:aload_2         
	//   94  179:lload           10
	//   95  181:iload           5
	//   96  183:bipush          6
	//   97  185:iushr           
	//   98  186:sipush          960
	//   99  189:ior             
	//  100  190:int2byte        
	//  101  191:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
							l1 = l4 + 1L;
	//  102  194:lload           14
	//  103  196:lconst_1        
	//  104  197:ladd            
	//  105  198:lstore          8
							avm.a(abyte0, l4, (byte)(c & 0x3f | 0x80));
	//  106  200:aload_2         
	//  107  201:lload           14
	//  108  203:iload           5
	//  109  205:bipush          63
	//  110  207:iand            
	//  111  208:sipush          128
	//  112  211:ior             
	//  113  212:int2byte        
	//  114  213:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
						} else
	//* 115  216:goto            465
						if((c < '\uD800' || '\uDFFF' < c) && l2 <= l3 - 3L)
	//* 116  219:iload           5
	//* 117  221:ldc1            #71  <Int 55296>
	//* 118  223:icmplt          233
	//* 119  226:ldc1            #72  <Int 57343>
	//* 120  228:iload           5
	//* 121  230:icmpge          317
	//* 122  233:lload           10
	//* 123  235:lload           12
	//* 124  237:ldc2w           #73  <Long 3L>
	//* 125  240:lsub            
	//* 126  241:lcmp            
	//* 127  242:ifgt            317
						{
							l1 = l2 + 1L;
	//  128  245:lload           10
	//  129  247:lconst_1        
	//  130  248:ladd            
	//  131  249:lstore          8
							avm.a(abyte0, l2, (byte)(c >>> 12 | 0x1e0));
	//  132  251:aload_2         
	//  133  252:lload           10
	//  134  254:iload           5
	//  135  256:bipush          12
	//  136  258:iushr           
	//  137  259:sipush          480
	//  138  262:ior             
	//  139  263:int2byte        
	//  140  264:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
							l2 = l1 + 1L;
	//  141  267:lload           8
	//  142  269:lconst_1        
	//  143  270:ladd            
	//  144  271:lstore          10
							avm.a(abyte0, l1, (byte)(c >>> 6 & 0x3f | 0x80));
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
	//  155  289:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
							avm.a(abyte0, l2, (byte)(c & 0x3f | 0x80));
	//  156  292:aload_2         
	//  157  293:lload           10
	//  158  295:iload           5
	//  159  297:bipush          63
	//  160  299:iand            
	//  161  300:sipush          128
	//  162  303:ior             
	//  163  304:int2byte        
	//  164  305:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
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
	//  172  321:ldc2w           #75  <Long 4L>
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
	//  185  344:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//  186  349:istore          6
							i = j;
	//  187  351:iload           4
	//  188  353:istore_3        
							if(!Character.isSurrogatePair(c, c2))
								break;
	//  189  354:iload           5
	//  190  356:iload           6
	//  191  358:invokestatic    #82  <Method boolean Character.isSurrogatePair(char, char)>
	//  192  361:ifeq            476
							i = Character.toCodePoint(c, c2);
	//  193  364:iload           5
	//  194  366:iload           6
	//  195  368:invokestatic    #86  <Method int Character.toCodePoint(char, char)>
	//  196  371:istore_3        
							l1 = l2 + 1L;
	//  197  372:lload           10
	//  198  374:lconst_1        
	//  199  375:ladd            
	//  200  376:lstore          8
							avm.a(abyte0, l2, (byte)(i >>> 18 | 0xf0));
	//  201  378:aload_2         
	//  202  379:lload           10
	//  203  381:iload_3         
	//  204  382:bipush          18
	//  205  384:iushr           
	//  206  385:sipush          240
	//  207  388:ior             
	//  208  389:int2byte        
	//  209  390:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
							l2 = l1 + 1L;
	//  210  393:lload           8
	//  211  395:lconst_1        
	//  212  396:ladd            
	//  213  397:lstore          10
							avm.a(abyte0, l1, (byte)(i >>> 12 & 0x3f | 0x80));
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
	//  224  414:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
							long l5 = l2 + 1L;
	//  225  417:lload           10
	//  226  419:lconst_1        
	//  227  420:ladd            
	//  228  421:lstore          14
							avm.a(abyte0, l2, (byte)(i >>> 6 & 0x3f | 0x80));
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
	//  239  438:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
							l1 = l5 + 1L;
	//  240  441:lload           14
	//  241  443:lconst_1        
	//  242  444:ladd            
	//  243  445:lstore          8
							avm.a(abyte0, l5, (byte)(i & 0x3f | 0x80));
	//  244  447:aload_2         
	//  245  448:lload           14
	//  246  450:iload_3         
	//  247  451:bipush          63
	//  248  453:iand            
	//  249  454:sipush          128
	//  250  457:ior             
	//  251  458:int2byte        
	//  252  459:invokestatic    #68  <Method void avm.a(byte[], long, byte)>
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
					throw new avw(i - 1, k);
	//  262  476:new             #88  <Class avw>
	//  263  479:dup             
	//  264  480:iload_3         
	//  265  481:iconst_1        
	//  266  482:isub            
	//  267  483:iload           7
	//  268  485:invokespecial   #91  <Method void avw(int, int)>
	//  269  488:athrow          
				}
				if('\uD800' <= c && c <= '\uDFFF')
	//* 270  489:ldc1            #71  <Int 55296>
	//* 271  491:iload           5
	//* 272  493:icmpgt          542
	//* 273  496:iload           5
	//* 274  498:ldc1            #72  <Int 57343>
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
	//* 286  520:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//* 287  525:invokestatic    #82  <Method boolean Character.isSurrogatePair(char, char)>
	//* 288  528:ifne            542
						throw new avw(i, k);
	//  289  531:new             #88  <Class avw>
	//  290  534:dup             
	//  291  535:iload_3         
	//  292  536:iload           7
	//  293  538:invokespecial   #91  <Method void avw(int, int)>
	//  294  541:athrow          
				}
				charsequence = ((CharSequence) (new StringBuilder(46)));
	//  295  542:new             #93  <Class StringBuilder>
	//  296  545:dup             
	//  297  546:bipush          46
	//  298  548:invokespecial   #96  <Method void StringBuilder(int)>
	//  299  551:astore_1        
				((StringBuilder) (charsequence)).append("Failed writing ");
	//  300  552:aload_1         
	//  301  553:ldc1            #98  <String "Failed writing ">
	//  302  555:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  303  558:pop             
				((StringBuilder) (charsequence)).append(c);
	//  304  559:aload_1         
	//  305  560:iload           5
	//  306  562:invokevirtual   #105 <Method StringBuilder StringBuilder.append(char)>
	//  307  565:pop             
				((StringBuilder) (charsequence)).append(" at index ");
	//  308  566:aload_1         
	//  309  567:ldc1            #107 <String " at index ">
	//  310  569:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  311  572:pop             
				((StringBuilder) (charsequence)).append(l2);
	//  312  573:aload_1         
	//  313  574:lload           10
	//  314  576:invokevirtual   #110 <Method StringBuilder StringBuilder.append(long)>
	//  315  579:pop             
				throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  316  580:new             #35  <Class ArrayIndexOutOfBoundsException>
	//  317  583:dup             
	//  318  584:aload_1         
	//  319  585:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  320  588:invokespecial   #54  <Method void ArrayIndexOutOfBoundsException(String)>
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
	//  329  601:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//  330  606:istore          5
		charsequence = ((CharSequence) (new StringBuilder(37)));
	//  331  608:new             #93  <Class StringBuilder>
	//  332  611:dup             
	//  333  612:bipush          37
	//  334  614:invokespecial   #96  <Method void StringBuilder(int)>
	//  335  617:astore_1        
		((StringBuilder) (charsequence)).append("Failed writing ");
	//  336  618:aload_1         
	//  337  619:ldc1            #98  <String "Failed writing ">
	//  338  621:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  339  624:pop             
		((StringBuilder) (charsequence)).append(c1);
	//  340  625:aload_1         
	//  341  626:iload           5
	//  342  628:invokevirtual   #105 <Method StringBuilder StringBuilder.append(char)>
	//  343  631:pop             
		((StringBuilder) (charsequence)).append(" at index ");
	//  344  632:aload_1         
	//  345  633:ldc1            #107 <String " at index ">
	//  346  635:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  347  638:pop             
		((StringBuilder) (charsequence)).append(i + j);
	//  348  639:aload_1         
	//  349  640:iload_3         
	//  350  641:iload           4
	//  351  643:iadd            
	//  352  644:invokevirtual   #117 <Method StringBuilder StringBuilder.append(int)>
	//  353  647:pop             
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  354  648:new             #35  <Class ArrayIndexOutOfBoundsException>
	//  355  651:dup             
	//  356  652:aload_1         
	//  357  653:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  358  656:invokespecial   #54  <Method void ArrayIndexOutOfBoundsException(String)>
	//  359  659:athrow          
	}

	final void a(CharSequence charsequence, ByteBuffer bytebuffer)
	{
		int i1;
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
						l5 = avm.a(bytebuffer);
	//    0    0:aload_2         
	//    1    1:invokestatic    #121 <Method long avm.a(ByteBuffer)>
	//    2    4:lstore          14
						long l2 = (long)bytebuffer.position() + l5;
	//    3    6:aload_2         
	//    4    7:invokevirtual   #126 <Method int ByteBuffer.position()>
	//    5   10:i2l             
	//    6   11:lload           14
	//    7   13:ladd            
	//    8   14:lstore          10
						long l6 = (long)bytebuffer.limit() + l5;
	//    9   16:aload_2         
	//   10   17:invokevirtual   #129 <Method int ByteBuffer.limit()>
	//   11   20:i2l             
	//   12   21:lload           14
	//   13   23:ladd            
	//   14   24:lstore          16
						i1 = charsequence.length();
	//   15   26:aload_1         
	//   16   27:invokeinterface #61  <Method int CharSequence.length()>
	//   17   32:istore          7
						if((long)i1 > l6 - l2)
							break label0;
	//   18   34:iload           7
	//   19   36:i2l             
	//   20   37:lload           16
	//   21   39:lload           10
	//   22   41:lsub            
	//   23   42:lcmp            
	//   24   43:ifgt            627
						int k = 0;
	//   25   46:iconst_0        
	//   26   47:istore          6
						long l1;
						do
						{
							l1 = 1L;
	//   27   49:lconst_1        
	//   28   50:lstore          8
							if(k >= i1)
								break;
	//   29   52:iload           6
	//   30   54:iload           7
	//   31   56:icmpge          100
							char c3 = charsequence.charAt(k);
	//   32   59:aload_1         
	//   33   60:iload           6
	//   34   62:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//   35   67:istore          5
							if(c3 >= '\200')
								break;
	//   36   69:iload           5
	//   37   71:sipush          128
	//   38   74:icmpge          100
							avm.a(l2, (byte)c3);
	//   39   77:lload           10
	//   40   79:iload           5
	//   41   81:int2byte        
	//   42   82:invokestatic    #132 <Method void avm.a(long, byte)>
							k++;
	//   43   85:iload           6
	//   44   87:iconst_1        
	//   45   88:iadd            
	//   46   89:istore          6
							l2 = 1L + l2;
	//   47   91:lconst_1        
	//   48   92:lload           10
	//   49   94:ladd            
	//   50   95:lstore          10
						} while(true);
	//   51   97:goto            49
						l4 = l2;
	//   52  100:lload           10
	//   53  102:lstore          12
						i = k;
	//   54  104:iload           6
	//   55  106:istore          5
						if(k == i1)
	//*  56  108:iload           6
	//*  57  110:iload           7
	//*  58  112:icmpne          127
						{
							bytebuffer.position((int)(l2 - l5));
	//   59  115:aload_2         
	//   60  116:lload           10
	//   61  118:lload           14
	//   62  120:lsub            
	//   63  121:l2i             
	//   64  122:invokevirtual   #135 <Method java.nio.Buffer ByteBuffer.position(int)>
	//   65  125:pop             
							return;
	//   66  126:return          
						}
						do
						{
							if(i >= i1)
								break label1;
	//   67  127:iload           5
	//   68  129:iload           7
	//   69  131:icmpge          615
							c = charsequence.charAt(i);
	//   70  134:aload_1         
	//   71  135:iload           5
	//   72  137:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//   73  142:istore_3        
							long l3;
							if(c < '\200' && l4 < l6)
	//*  74  143:iload_3         
	//*  75  144:sipush          128
	//*  76  147:icmpge          175
	//*  77  150:lload           12
	//*  78  152:lload           16
	//*  79  154:lcmp            
	//*  80  155:ifge            175
							{
								l3 = l4 + l1;
	//   81  158:lload           12
	//   82  160:lload           8
	//   83  162:ladd            
	//   84  163:lstore          10
								avm.a(l4, (byte)c);
	//   85  165:lload           12
	//   86  167:iload_3         
	//   87  168:int2byte        
	//   88  169:invokestatic    #132 <Method void avm.a(long, byte)>
							} else
	//*  89  172:goto            483
							if(c < '\u0800' && l4 <= l6 - 2L)
	//*  90  175:iload_3         
	//*  91  176:sipush          2048
	//*  92  179:icmpge          239
	//*  93  182:lload           12
	//*  94  184:lload           16
	//*  95  186:ldc2w           #69  <Long 2L>
	//*  96  189:lsub            
	//*  97  190:lcmp            
	//*  98  191:ifgt            239
							{
								l3 = l4 + l1;
	//   99  194:lload           12
	//  100  196:lload           8
	//  101  198:ladd            
	//  102  199:lstore          10
								avm.a(l4, (byte)(c >>> 6 | 0x3c0));
	//  103  201:lload           12
	//  104  203:iload_3         
	//  105  204:bipush          6
	//  106  206:iushr           
	//  107  207:sipush          960
	//  108  210:ior             
	//  109  211:int2byte        
	//  110  212:invokestatic    #132 <Method void avm.a(long, byte)>
								avm.a(l3, (byte)(c & 0x3f | 0x80));
	//  111  215:lload           10
	//  112  217:iload_3         
	//  113  218:bipush          63
	//  114  220:iand            
	//  115  221:sipush          128
	//  116  224:ior             
	//  117  225:int2byte        
	//  118  226:invokestatic    #132 <Method void avm.a(long, byte)>
								l3 += l1;
	//  119  229:lload           10
	//  120  231:lload           8
	//  121  233:ladd            
	//  122  234:lstore          10
							} else
	//* 123  236:goto            483
							if((c < '\uD800' || '\uDFFF' < c) && l4 <= l6 - 3L)
	//* 124  239:iload_3         
	//* 125  240:ldc1            #71  <Int 55296>
	//* 126  242:icmplt          251
	//* 127  245:ldc1            #72  <Int 57343>
	//* 128  247:iload_3         
	//* 129  248:icmpge          334
	//* 130  251:lload           12
	//* 131  253:lload           16
	//* 132  255:ldc2w           #73  <Long 3L>
	//* 133  258:lsub            
	//* 134  259:lcmp            
	//* 135  260:ifgt            334
							{
								l3 = l4 + l1;
	//  136  263:lload           12
	//  137  265:lload           8
	//  138  267:ladd            
	//  139  268:lstore          10
								avm.a(l4, (byte)(c >>> 12 | 0x1e0));
	//  140  270:lload           12
	//  141  272:iload_3         
	//  142  273:bipush          12
	//  143  275:iushr           
	//  144  276:sipush          480
	//  145  279:ior             
	//  146  280:int2byte        
	//  147  281:invokestatic    #132 <Method void avm.a(long, byte)>
								l1 = l3 + l1;
	//  148  284:lload           10
	//  149  286:lload           8
	//  150  288:ladd            
	//  151  289:lstore          8
								avm.a(l3, (byte)(c >>> 6 & 0x3f | 0x80));
	//  152  291:lload           10
	//  153  293:iload_3         
	//  154  294:bipush          6
	//  155  296:iushr           
	//  156  297:bipush          63
	//  157  299:iand            
	//  158  300:sipush          128
	//  159  303:ior             
	//  160  304:int2byte        
	//  161  305:invokestatic    #132 <Method void avm.a(long, byte)>
								avm.a(l1, (byte)(c & 0x3f | 0x80));
	//  162  308:lload           8
	//  163  310:iload_3         
	//  164  311:bipush          63
	//  165  313:iand            
	//  166  314:sipush          128
	//  167  317:ior             
	//  168  318:int2byte        
	//  169  319:invokestatic    #132 <Method void avm.a(long, byte)>
								l3 = l1 + 1L;
	//  170  322:lload           8
	//  171  324:lconst_1        
	//  172  325:ladd            
	//  173  326:lstore          10
								l1 = 1L;
	//  174  328:lconst_1        
	//  175  329:lstore          8
							} else
	//* 176  331:goto            483
							{
								if(l4 > l6 - 4L)
									break label2;
	//  177  334:lload           12
	//  178  336:lload           16
	//  179  338:ldc2w           #75  <Long 4L>
	//  180  341:lsub            
	//  181  342:lcmp            
	//  182  343:ifgt            514
								k = i + 1;
	//  183  346:iload           5
	//  184  348:iconst_1        
	//  185  349:iadd            
	//  186  350:istore          6
								if(k == i1)
									break label3;
	//  187  352:iload           6
	//  188  354:iload           7
	//  189  356:icmpeq          500
								char c2 = charsequence.charAt(k);
	//  190  359:aload_1         
	//  191  360:iload           6
	//  192  362:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//  193  367:istore          4
								if(!Character.isSurrogatePair(c, c2))
									break;
	//  194  369:iload_3         
	//  195  370:iload           4
	//  196  372:invokestatic    #82  <Method boolean Character.isSurrogatePair(char, char)>
	//  197  375:ifeq            496
								i = Character.toCodePoint(c, c2);
	//  198  378:iload_3         
	//  199  379:iload           4
	//  200  381:invokestatic    #86  <Method int Character.toCodePoint(char, char)>
	//  201  384:istore          5
								l1 = l4 + 1L;
	//  202  386:lload           12
	//  203  388:lconst_1        
	//  204  389:ladd            
	//  205  390:lstore          8
								avm.a(l4, (byte)(i >>> 18 | 0xf0));
	//  206  392:lload           12
	//  207  394:iload           5
	//  208  396:bipush          18
	//  209  398:iushr           
	//  210  399:sipush          240
	//  211  402:ior             
	//  212  403:int2byte        
	//  213  404:invokestatic    #132 <Method void avm.a(long, byte)>
								l3 = l1 + 1L;
	//  214  407:lload           8
	//  215  409:lconst_1        
	//  216  410:ladd            
	//  217  411:lstore          10
								avm.a(l1, (byte)(i >>> 12 & 0x3f | 0x80));
	//  218  413:lload           8
	//  219  415:iload           5
	//  220  417:bipush          12
	//  221  419:iushr           
	//  222  420:bipush          63
	//  223  422:iand            
	//  224  423:sipush          128
	//  225  426:ior             
	//  226  427:int2byte        
	//  227  428:invokestatic    #132 <Method void avm.a(long, byte)>
								l4 = l3 + 1L;
	//  228  431:lload           10
	//  229  433:lconst_1        
	//  230  434:ladd            
	//  231  435:lstore          12
								avm.a(l3, (byte)(i >>> 6 & 0x3f | 0x80));
	//  232  437:lload           10
	//  233  439:iload           5
	//  234  441:bipush          6
	//  235  443:iushr           
	//  236  444:bipush          63
	//  237  446:iand            
	//  238  447:sipush          128
	//  239  450:ior             
	//  240  451:int2byte        
	//  241  452:invokestatic    #132 <Method void avm.a(long, byte)>
								l1 = 1L;
	//  242  455:lconst_1        
	//  243  456:lstore          8
								avm.a(l4, (byte)(i & 0x3f | 0x80));
	//  244  458:lload           12
	//  245  460:iload           5
	//  246  462:bipush          63
	//  247  464:iand            
	//  248  465:sipush          128
	//  249  468:ior             
	//  250  469:int2byte        
	//  251  470:invokestatic    #132 <Method void avm.a(long, byte)>
								l3 = l4 + 1L;
	//  252  473:lload           12
	//  253  475:lconst_1        
	//  254  476:ladd            
	//  255  477:lstore          10
								i = k;
	//  256  479:iload           6
	//  257  481:istore          5
							}
							i++;
	//  258  483:iload           5
	//  259  485:iconst_1        
	//  260  486:iadd            
	//  261  487:istore          5
							l4 = l3;
	//  262  489:lload           10
	//  263  491:lstore          12
						} while(true);
	//  264  493:goto            127
						i = k;
	//  265  496:iload           6
	//  266  498:istore          5
					}
					throw new avw(i - 1, i1);
	//  267  500:new             #88  <Class avw>
	//  268  503:dup             
	//  269  504:iload           5
	//  270  506:iconst_1        
	//  271  507:isub            
	//  272  508:iload           7
	//  273  510:invokespecial   #91  <Method void avw(int, int)>
	//  274  513:athrow          
				}
				if('\uD800' <= c && c <= '\uDFFF')
	//* 275  514:ldc1            #71  <Int 55296>
	//* 276  516:iload_3         
	//* 277  517:icmpgt          566
	//* 278  520:iload_3         
	//* 279  521:ldc1            #72  <Int 57343>
	//* 280  523:icmpgt          566
				{
					int l = i + 1;
	//  281  526:iload           5
	//  282  528:iconst_1        
	//  283  529:iadd            
	//  284  530:istore          6
					if(l == i1 || !Character.isSurrogatePair(c, charsequence.charAt(l)))
	//* 285  532:iload           6
	//* 286  534:iload           7
	//* 287  536:icmpeq          554
	//* 288  539:iload_3         
	//* 289  540:aload_1         
	//* 290  541:iload           6
	//* 291  543:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//* 292  548:invokestatic    #82  <Method boolean Character.isSurrogatePair(char, char)>
	//* 293  551:ifne            566
						throw new avw(i, i1);
	//  294  554:new             #88  <Class avw>
	//  295  557:dup             
	//  296  558:iload           5
	//  297  560:iload           7
	//  298  562:invokespecial   #91  <Method void avw(int, int)>
	//  299  565:athrow          
				}
				charsequence = ((CharSequence) (new StringBuilder(46)));
	//  300  566:new             #93  <Class StringBuilder>
	//  301  569:dup             
	//  302  570:bipush          46
	//  303  572:invokespecial   #96  <Method void StringBuilder(int)>
	//  304  575:astore_1        
				((StringBuilder) (charsequence)).append("Failed writing ");
	//  305  576:aload_1         
	//  306  577:ldc1            #98  <String "Failed writing ">
	//  307  579:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  308  582:pop             
				((StringBuilder) (charsequence)).append(c);
	//  309  583:aload_1         
	//  310  584:iload_3         
	//  311  585:invokevirtual   #105 <Method StringBuilder StringBuilder.append(char)>
	//  312  588:pop             
				((StringBuilder) (charsequence)).append(" at index ");
	//  313  589:aload_1         
	//  314  590:ldc1            #107 <String " at index ">
	//  315  592:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  316  595:pop             
				((StringBuilder) (charsequence)).append(l4);
	//  317  596:aload_1         
	//  318  597:lload           12
	//  319  599:invokevirtual   #110 <Method StringBuilder StringBuilder.append(long)>
	//  320  602:pop             
				throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  321  603:new             #35  <Class ArrayIndexOutOfBoundsException>
	//  322  606:dup             
	//  323  607:aload_1         
	//  324  608:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  325  611:invokespecial   #54  <Method void ArrayIndexOutOfBoundsException(String)>
	//  326  614:athrow          
			}
			bytebuffer.position((int)(l4 - l5));
	//  327  615:aload_2         
	//  328  616:lload           12
	//  329  618:lload           14
	//  330  620:lsub            
	//  331  621:l2i             
	//  332  622:invokevirtual   #135 <Method java.nio.Buffer ByteBuffer.position(int)>
	//  333  625:pop             
			return;
	//  334  626:return          
		}
		char c1 = charsequence.charAt(i1 - 1);
	//  335  627:aload_1         
	//  336  628:iload           7
	//  337  630:iconst_1        
	//  338  631:isub            
	//  339  632:invokeinterface #65  <Method char CharSequence.charAt(int)>
	//  340  637:istore_3        
		int j = bytebuffer.limit();
	//  341  638:aload_2         
	//  342  639:invokevirtual   #129 <Method int ByteBuffer.limit()>
	//  343  642:istore          5
		charsequence = ((CharSequence) (new StringBuilder(37)));
	//  344  644:new             #93  <Class StringBuilder>
	//  345  647:dup             
	//  346  648:bipush          37
	//  347  650:invokespecial   #96  <Method void StringBuilder(int)>
	//  348  653:astore_1        
		((StringBuilder) (charsequence)).append("Failed writing ");
	//  349  654:aload_1         
	//  350  655:ldc1            #98  <String "Failed writing ">
	//  351  657:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  352  660:pop             
		((StringBuilder) (charsequence)).append(c1);
	//  353  661:aload_1         
	//  354  662:iload_3         
	//  355  663:invokevirtual   #105 <Method StringBuilder StringBuilder.append(char)>
	//  356  666:pop             
		((StringBuilder) (charsequence)).append(" at index ");
	//  357  667:aload_1         
	//  358  668:ldc1            #107 <String " at index ">
	//  359  670:invokevirtual   #102 <Method StringBuilder StringBuilder.append(String)>
	//  360  673:pop             
		((StringBuilder) (charsequence)).append(j);
	//  361  674:aload_1         
	//  362  675:iload           5
	//  363  677:invokevirtual   #117 <Method StringBuilder StringBuilder.append(int)>
	//  364  680:pop             
		throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  365  681:new             #35  <Class ArrayIndexOutOfBoundsException>
	//  366  684:dup             
	//  367  685:aload_1         
	//  368  686:invokevirtual   #114 <Method String StringBuilder.toString()>
	//  369  689:invokespecial   #54  <Method void ArrayIndexOutOfBoundsException(String)>
	//  370  692:athrow          
	}

	final String b(byte abyte0[], int i, int j)
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
				byte byte0 = avm.a(abyte0, i);
	//   23   31:aload_1         
	//   24   32:iload_2         
	//   25   33:i2l             
	//   26   34:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//   27   37:istore          4
				if(!avt.a(byte0))
					break;
	//   28   39:iload           4
	//   29   41:invokestatic    #142 <Method boolean avt.a(byte)>
	//   30   44:ifeq            66
				i++;
	//   31   47:iload_2         
	//   32   48:iconst_1        
	//   33   49:iadd            
	//   34   50:istore_2        
				avt.a(byte0, ac, j);
	//   35   51:iload           4
	//   36   53:aload           8
	//   37   55:iload_3         
	//   38   56:invokestatic    #145 <Method void avt.a(byte, char[], int)>
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
				byte byte1 = avm.a(abyte0, j);
	//   57   85:aload_1         
	//   58   86:iload_3         
	//   59   87:i2l             
	//   60   88:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//   61   91:istore          4
				if(avt.a(byte1))
	//*  62   93:iload           4
	//*  63   95:invokestatic    #142 <Method boolean avt.a(byte)>
	//*  64   98:ifeq            162
				{
					j = i + 1;
	//   65  101:iload_2         
	//   66  102:iconst_1        
	//   67  103:iadd            
	//   68  104:istore_3        
					avt.a(byte1, ac, i);
	//   69  105:iload           4
	//   70  107:aload           8
	//   71  109:iload_2         
	//   72  110:invokestatic    #145 <Method void avt.a(byte, char[], int)>
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
						byte1 = avm.a(abyte0, j);
	//   80  124:aload_1         
	//   81  125:iload_3         
	//   82  126:i2l             
	//   83  127:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//   84  130:istore          4
						if(!avt.a(byte1))
							continue label0;
	//   85  132:iload           4
	//   86  134:invokestatic    #142 <Method boolean avt.a(byte)>
	//   87  137:ifeq            159
						j++;
	//   88  140:iload_3         
	//   89  141:iconst_1        
	//   90  142:iadd            
	//   91  143:istore_3        
						avt.a(byte1, ac, i);
	//   92  144:iload           4
	//   93  146:aload           8
	//   94  148:iload_2         
	//   95  149:invokestatic    #145 <Method void avt.a(byte, char[], int)>
						i++;
	//   96  152:iload_2         
	//   97  153:iconst_1        
	//   98  154:iadd            
	//   99  155:istore_2        
					} while(true);
	//  100  156:goto            118
				}
	//* 101  159:goto            74
				if(avt.b(byte1))
	//* 102  162:iload           4
	//* 103  164:invokestatic    #147 <Method boolean avt.b(byte)>
	//* 104  167:ifeq            208
				{
					if(l < i1)
	//* 105  170:iload           6
	//* 106  172:iload           7
	//* 107  174:icmpge          204
					{
						avt.a(byte1, avm.a(abyte0, l), ac, i);
	//  108  177:iload           4
	//  109  179:aload_1         
	//  110  180:iload           6
	//  111  182:i2l             
	//  112  183:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  113  186:aload           8
	//  114  188:iload_2         
	//  115  189:invokestatic    #150 <Method void avt.a(byte, byte, char[], int)>
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
						throw asu.i();
	//  125  204:invokestatic    #156 <Method asu asu.i()>
	//  126  207:athrow          
					}
				} else
				if(avt.c(byte1))
	//* 127  208:iload           4
	//* 128  210:invokestatic    #159 <Method boolean avt.c(byte)>
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
						avt.a(byte1, avm.a(abyte0, l), avm.a(abyte0, j), ac, i);
	//  139  230:iload           4
	//  140  232:aload_1         
	//  141  233:iload           6
	//  142  235:i2l             
	//  143  236:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  144  239:aload_1         
	//  145  240:iload_3         
	//  146  241:i2l             
	//  147  242:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  148  245:aload           8
	//  149  247:iload_2         
	//  150  248:invokestatic    #162 <Method void avt.a(byte, byte, byte, char[], int)>
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
						throw asu.i();
	//  160  262:invokestatic    #156 <Method asu asu.i()>
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
					byte byte2 = avm.a(abyte0, l);
	//  171  280:aload_1         
	//  172  281:iload           6
	//  173  283:i2l             
	//  174  284:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  175  287:istore          5
					l = j + 1;
	//  176  289:iload_3         
	//  177  290:iconst_1        
	//  178  291:iadd            
	//  179  292:istore          6
					avt.a(byte1, byte2, avm.a(abyte0, j), avm.a(abyte0, l), ac, i);
	//  180  294:iload           4
	//  181  296:iload           5
	//  182  298:aload_1         
	//  183  299:iload_3         
	//  184  300:i2l             
	//  185  301:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  186  304:aload_1         
	//  187  305:iload           6
	//  188  307:i2l             
	//  189  308:invokestatic    #19  <Method byte avm.a(byte[], long)>
	//  190  311:aload           8
	//  191  313:iload_2         
	//  192  314:invokestatic    #165 <Method void avt.a(byte, byte, byte, byte, char[], int)>
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
					throw asu.i();
	//  204  331:invokestatic    #156 <Method asu asu.i()>
	//  205  334:athrow          
				}
			} while(true);
			return new String(ac, 0, i);
	//  206  335:new             #47  <Class String>
	//  207  338:dup             
	//  208  339:aload           8
	//  209  341:iconst_0        
	//  210  342:iload_2         
	//  211  343:invokespecial   #168 <Method void String(char[], int, int)>
	//  212  346:areturn         
		} else
		{
			throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[] {
				Integer.valueOf(abyte0.length), Integer.valueOf(i), Integer.valueOf(j)
			}));
	//  213  347:new             #35  <Class ArrayIndexOutOfBoundsException>
	//  214  350:dup             
	//  215  351:ldc1            #170 <String "buffer length=%d, index=%d, size=%d">
	//  216  353:iconst_3        
	//  217  354:anewarray       Object[]
	//  218  357:dup             
	//  219  358:iconst_0        
	//  220  359:aload_1         
	//  221  360:arraylength     
	//  222  361:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//  223  364:aastore         
	//  224  365:dup             
	//  225  366:iconst_1        
	//  226  367:iload_2         
	//  227  368:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//  228  371:aastore         
	//  229  372:dup             
	//  230  373:iconst_2        
	//  231  374:iload_3         
	//  232  375:invokestatic    #45  <Method Integer Integer.valueOf(int)>
	//  233  378:aastore         
	//  234  379:invokestatic    #51  <Method String String.format(String, Object[])>
	//  235  382:invokespecial   #54  <Method void ArrayIndexOutOfBoundsException(String)>
	//  236  385:athrow          
		}
	}
}
