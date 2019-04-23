// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;


// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			hz, hy, ib

final class ia extends hz
{

	ia()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void hz()>
	//    2    4:return          
	}

	final int a(int i, byte abyte0[], int j, int k)
	{
		for(; j < k && abyte0[j] >= 0; j++);
	//    0    0:iload_3         
	//    1    1:iload           4
	//    2    3:icmpge          19
	//    3    6:aload_2         
	//    4    7:iload_3         
	//    5    8:baload          
	//    6    9:iflt            19
	//    7   12:iload_3         
	//    8   13:iconst_1        
	//    9   14:iadd            
	//   10   15:istore_3        
	//*  11   16:goto            0
		i = j;
	//   12   19:iload_3         
	//   13   20:istore_1        
		if(j >= k)
	//*  14   21:iload_3         
	//*  15   22:iload           4
	//*  16   24:icmplt          29
			return 0;
	//   17   27:iconst_0        
	//   18   28:ireturn         
		do
		{
			if(i >= k)
	//*  19   29:iload_1         
	//*  20   30:iload           4
	//*  21   32:icmplt          37
				return 0;
	//   22   35:iconst_0        
	//   23   36:ireturn         
			j = i + 1;
	//   24   37:iload_1         
	//   25   38:iconst_1        
	//   26   39:iadd            
	//   27   40:istore_3        
			i = ((int) (abyte0[i]));
	//   28   41:aload_2         
	//   29   42:iload_1         
	//   30   43:baload          
	//   31   44:istore_1        
			if(i < 0)
	//*  32   45:iload_1         
	//*  33   46:ifge            239
			{
				if(i < -32)
	//*  34   49:iload_1         
	//*  35   50:bipush          -32
	//*  36   52:icmpge          83
				{
					if(j >= k)
	//*  37   55:iload_3         
	//*  38   56:iload           4
	//*  39   58:icmplt          63
						return i;
	//   40   61:iload_1         
	//   41   62:ireturn         
					if(i >= -62)
	//*  42   63:iload_1         
	//*  43   64:bipush          -62
	//*  44   66:icmplt          81
					{
						i = j + 1;
	//   45   69:iload_3         
	//   46   70:iconst_1        
	//   47   71:iadd            
	//   48   72:istore_1        
						if(abyte0[j] <= -65)
							continue;
	//   49   73:aload_2         
	//   50   74:iload_3         
	//   51   75:baload          
	//   52   76:bipush          -65
	//   53   78:icmple          29
					}
					return -1;
	//   54   81:iconst_m1       
	//   55   82:ireturn         
				}
				if(i < -16)
	//*  56   83:iload_1         
	//*  57   84:bipush          -16
	//*  58   86:icmpge          160
				{
					if(j >= k - 1)
	//*  59   89:iload_3         
	//*  60   90:iload           4
	//*  61   92:iconst_1        
	//*  62   93:isub            
	//*  63   94:icmplt          105
						return hy.b(abyte0, j, k);
	//   64   97:aload_2         
	//   65   98:iload_3         
	//   66   99:iload           4
	//   67  101:invokestatic    #17  <Method int hy.b(byte[], int, int)>
	//   68  104:ireturn         
					int l = j + 1;
	//   69  105:iload_3         
	//   70  106:iconst_1        
	//   71  107:iadd            
	//   72  108:istore          5
					j = ((int) (abyte0[j]));
	//   73  110:aload_2         
	//   74  111:iload_3         
	//   75  112:baload          
	//   76  113:istore_3        
					if(j <= -65 && (i != -32 || j >= -96) && (i != -19 || j < -96))
	//*  77  114:iload_3         
	//*  78  115:bipush          -65
	//*  79  117:icmpgt          158
	//*  80  120:iload_1         
	//*  81  121:bipush          -32
	//*  82  123:icmpne          132
	//*  83  126:iload_3         
	//*  84  127:bipush          -96
	//*  85  129:icmplt          158
	//*  86  132:iload_1         
	//*  87  133:bipush          -19
	//*  88  135:icmpne          144
	//*  89  138:iload_3         
	//*  90  139:bipush          -96
	//*  91  141:icmpge          158
					{
						i = l + 1;
	//   92  144:iload           5
	//   93  146:iconst_1        
	//   94  147:iadd            
	//   95  148:istore_1        
						if(abyte0[l] <= -65)
							continue;
	//   96  149:aload_2         
	//   97  150:iload           5
	//   98  152:baload          
	//   99  153:bipush          -65
	//  100  155:icmple          29
					}
					return -1;
	//  101  158:iconst_m1       
	//  102  159:ireturn         
				}
				if(j >= k - 2)
	//* 103  160:iload_3         
	//* 104  161:iload           4
	//* 105  163:iconst_2        
	//* 106  164:isub            
	//* 107  165:icmplt          176
					return hy.b(abyte0, j, k);
	//  108  168:aload_2         
	//  109  169:iload_3         
	//  110  170:iload           4
	//  111  172:invokestatic    #17  <Method int hy.b(byte[], int, int)>
	//  112  175:ireturn         
				int i1 = j + 1;
	//  113  176:iload_3         
	//  114  177:iconst_1        
	//  115  178:iadd            
	//  116  179:istore          5
				j = ((int) (abyte0[j]));
	//  117  181:aload_2         
	//  118  182:iload_3         
	//  119  183:baload          
	//  120  184:istore_3        
				if(j <= -65 && (i << 28) + (j + 112) >> 30 == 0)
	//* 121  185:iload_3         
	//* 122  186:bipush          -65
	//* 123  188:icmpgt          237
	//* 124  191:iload_1         
	//* 125  192:bipush          28
	//* 126  194:ishl            
	//* 127  195:iload_3         
	//* 128  196:bipush          112
	//* 129  198:iadd            
	//* 130  199:iadd            
	//* 131  200:bipush          30
	//* 132  202:ishr            
	//* 133  203:ifne            237
				{
					i = i1 + 1;
	//  134  206:iload           5
	//  135  208:iconst_1        
	//  136  209:iadd            
	//  137  210:istore_1        
					if(abyte0[i1] <= -65)
	//* 138  211:aload_2         
	//* 139  212:iload           5
	//* 140  214:baload          
	//* 141  215:bipush          -65
	//* 142  217:icmpgt          237
					{
						if(abyte0[i] > -65)
	//* 143  220:aload_2         
	//* 144  221:iload_1         
	//* 145  222:baload          
	//* 146  223:bipush          -65
	//* 147  225:icmple          230
							return -1;
	//  148  228:iconst_m1       
	//  149  229:ireturn         
						i++;
	//  150  230:iload_1         
	//  151  231:iconst_1        
	//  152  232:iadd            
	//  153  233:istore_1        
						continue;
	//  154  234:goto            29
					}
				}
				return -1;
	//  155  237:iconst_m1       
	//  156  238:ireturn         
			}
			i = j;
	//  157  239:iload_3         
	//  158  240:istore_1        
		} while(true);
	//  159  241:goto            29
	}

	final int a(CharSequence charsequence, byte abyte0[], int i, int j)
	{
label0:
		{
			char c;
			int l1;
label1:
			{
label2:
				{
					l1 = charsequence.length();
	//    0    0:aload_1         
	//    1    1:invokeinterface #24  <Method int CharSequence.length()>
	//    2    6:istore          8
					int i2 = j + i;
	//    3    8:iload           4
	//    4   10:iload_3         
	//    5   11:iadd            
	//    6   12:istore          9
					j = 0;
	//    7   14:iconst_0        
	//    8   15:istore          4
					do
					{
						if(j >= l1)
							break;
	//    9   17:iload           4
	//   10   19:iload           8
	//   11   21:icmpge          71
						int k = j + i;
	//   12   24:iload           4
	//   13   26:iload_3         
	//   14   27:iadd            
	//   15   28:istore          7
						if(k >= i2)
							break;
	//   16   30:iload           7
	//   17   32:iload           9
	//   18   34:icmpge          71
						char c2 = charsequence.charAt(j);
	//   19   37:aload_1         
	//   20   38:iload           4
	//   21   40:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//   22   45:istore          10
						if(c2 >= '\200')
							break;
	//   23   47:iload           10
	//   24   49:sipush          128
	//   25   52:icmpge          71
						abyte0[k] = (byte)c2;
	//   26   55:aload_2         
	//   27   56:iload           7
	//   28   58:iload           10
	//   29   60:int2byte        
	//   30   61:bastore         
						j++;
	//   31   62:iload           4
	//   32   64:iconst_1        
	//   33   65:iadd            
	//   34   66:istore          4
					} while(true);
	//   35   68:goto            17
					if(j == l1)
	//*  36   71:iload           4
	//*  37   73:iload           8
	//*  38   75:icmpne          83
						return i + l1;
	//   39   78:iload_3         
	//   40   79:iload           8
	//   41   81:iadd            
	//   42   82:ireturn         
					i += j;
	//   43   83:iload_3         
	//   44   84:iload           4
	//   45   86:iadd            
	//   46   87:istore_3        
					int j1;
					do
					{
						if(j >= l1)
							break label0;
	//   47   88:iload           4
	//   48   90:iload           8
	//   49   92:icmpge          543
						c = charsequence.charAt(j);
	//   50   95:aload_1         
	//   51   96:iload           4
	//   52   98:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//   53  103:istore          5
						if(c < '\200' && i < i2)
	//*  54  105:iload           5
	//*  55  107:sipush          128
	//*  56  110:icmpge          132
	//*  57  113:iload_3         
	//*  58  114:iload           9
	//*  59  116:icmpge          132
						{
							abyte0[i] = (byte)c;
	//   60  119:aload_2         
	//   61  120:iload_3         
	//   62  121:iload           5
	//   63  123:int2byte        
	//   64  124:bastore         
							i++;
	//   65  125:iload_3         
	//   66  126:iconst_1        
	//   67  127:iadd            
	//   68  128:istore_3        
						} else
	//*  69  129:goto            408
						if(c < '\u0800' && i <= i2 - 2)
	//*  70  132:iload           5
	//*  71  134:sipush          2048
	//*  72  137:icmpge          188
	//*  73  140:iload_3         
	//*  74  141:iload           9
	//*  75  143:iconst_2        
	//*  76  144:isub            
	//*  77  145:icmpgt          188
						{
							int l = i + 1;
	//   78  148:iload_3         
	//   79  149:iconst_1        
	//   80  150:iadd            
	//   81  151:istore          7
							abyte0[i] = (byte)(c >>> 6 | 0x3c0);
	//   82  153:aload_2         
	//   83  154:iload_3         
	//   84  155:iload           5
	//   85  157:bipush          6
	//   86  159:iushr           
	//   87  160:sipush          960
	//   88  163:ior             
	//   89  164:int2byte        
	//   90  165:bastore         
							i = l + 1;
	//   91  166:iload           7
	//   92  168:iconst_1        
	//   93  169:iadd            
	//   94  170:istore_3        
							abyte0[l] = (byte)(c & 0x3f | 0x80);
	//   95  171:aload_2         
	//   96  172:iload           7
	//   97  174:iload           5
	//   98  176:bipush          63
	//   99  178:iand            
	//  100  179:sipush          128
	//  101  182:ior             
	//  102  183:int2byte        
	//  103  184:bastore         
						} else
	//* 104  185:goto            408
						if((c < '\uD800' || '\uDFFF' < c) && i <= i2 - 3)
	//* 105  188:iload           5
	//* 106  190:ldc1            #29  <Int 55296>
	//* 107  192:icmplt          202
	//* 108  195:ldc1            #30  <Int 57343>
	//* 109  197:iload           5
	//* 110  199:icmpge          270
	//* 111  202:iload_3         
	//* 112  203:iload           9
	//* 113  205:iconst_3        
	//* 114  206:isub            
	//* 115  207:icmpgt          270
						{
							int i1 = i + 1;
	//  116  210:iload_3         
	//  117  211:iconst_1        
	//  118  212:iadd            
	//  119  213:istore          7
							abyte0[i] = (byte)(c >>> 12 | 0x1e0);
	//  120  215:aload_2         
	//  121  216:iload_3         
	//  122  217:iload           5
	//  123  219:bipush          12
	//  124  221:iushr           
	//  125  222:sipush          480
	//  126  225:ior             
	//  127  226:int2byte        
	//  128  227:bastore         
							i = i1 + 1;
	//  129  228:iload           7
	//  130  230:iconst_1        
	//  131  231:iadd            
	//  132  232:istore_3        
							abyte0[i1] = (byte)(c >>> 6 & 0x3f | 0x80);
	//  133  233:aload_2         
	//  134  234:iload           7
	//  135  236:iload           5
	//  136  238:bipush          6
	//  137  240:iushr           
	//  138  241:bipush          63
	//  139  243:iand            
	//  140  244:sipush          128
	//  141  247:ior             
	//  142  248:int2byte        
	//  143  249:bastore         
							abyte0[i] = (byte)(c & 0x3f | 0x80);
	//  144  250:aload_2         
	//  145  251:iload_3         
	//  146  252:iload           5
	//  147  254:bipush          63
	//  148  256:iand            
	//  149  257:sipush          128
	//  150  260:ior             
	//  151  261:int2byte        
	//  152  262:bastore         
							i++;
	//  153  263:iload_3         
	//  154  264:iconst_1        
	//  155  265:iadd            
	//  156  266:istore_3        
						} else
	//* 157  267:goto            408
						{
							if(i > i2 - 4)
								break label1;
	//  158  270:iload_3         
	//  159  271:iload           9
	//  160  273:iconst_4        
	//  161  274:isub            
	//  162  275:icmpgt          435
							j1 = j + 1;
	//  163  278:iload           4
	//  164  280:iconst_1        
	//  165  281:iadd            
	//  166  282:istore          7
							if(j1 == charsequence.length())
								break label2;
	//  167  284:iload           7
	//  168  286:aload_1         
	//  169  287:invokeinterface #24  <Method int CharSequence.length()>
	//  170  292:icmpeq          421
							char c1 = charsequence.charAt(j1);
	//  171  295:aload_1         
	//  172  296:iload           7
	//  173  298:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//  174  303:istore          6
							if(!Character.isSurrogatePair(c, c1))
								break;
	//  175  305:iload           5
	//  176  307:iload           6
	//  177  309:invokestatic    #36  <Method boolean Character.isSurrogatePair(char, char)>
	//  178  312:ifeq            417
							j = Character.toCodePoint(c, c1);
	//  179  315:iload           5
	//  180  317:iload           6
	//  181  319:invokestatic    #40  <Method int Character.toCodePoint(char, char)>
	//  182  322:istore          4
							int j2 = i + 1;
	//  183  324:iload_3         
	//  184  325:iconst_1        
	//  185  326:iadd            
	//  186  327:istore          10
							abyte0[i] = (byte)(j >>> 18 | 0xf0);
	//  187  329:aload_2         
	//  188  330:iload_3         
	//  189  331:iload           4
	//  190  333:bipush          18
	//  191  335:iushr           
	//  192  336:sipush          240
	//  193  339:ior             
	//  194  340:int2byte        
	//  195  341:bastore         
							i = j2 + 1;
	//  196  342:iload           10
	//  197  344:iconst_1        
	//  198  345:iadd            
	//  199  346:istore_3        
							abyte0[j2] = (byte)(j >>> 12 & 0x3f | 0x80);
	//  200  347:aload_2         
	//  201  348:iload           10
	//  202  350:iload           4
	//  203  352:bipush          12
	//  204  354:iushr           
	//  205  355:bipush          63
	//  206  357:iand            
	//  207  358:sipush          128
	//  208  361:ior             
	//  209  362:int2byte        
	//  210  363:bastore         
							j2 = i + 1;
	//  211  364:iload_3         
	//  212  365:iconst_1        
	//  213  366:iadd            
	//  214  367:istore          10
							abyte0[i] = (byte)(j >>> 6 & 0x3f | 0x80);
	//  215  369:aload_2         
	//  216  370:iload_3         
	//  217  371:iload           4
	//  218  373:bipush          6
	//  219  375:iushr           
	//  220  376:bipush          63
	//  221  378:iand            
	//  222  379:sipush          128
	//  223  382:ior             
	//  224  383:int2byte        
	//  225  384:bastore         
							i = j2 + 1;
	//  226  385:iload           10
	//  227  387:iconst_1        
	//  228  388:iadd            
	//  229  389:istore_3        
							abyte0[j2] = (byte)(j & 0x3f | 0x80);
	//  230  390:aload_2         
	//  231  391:iload           10
	//  232  393:iload           4
	//  233  395:bipush          63
	//  234  397:iand            
	//  235  398:sipush          128
	//  236  401:ior             
	//  237  402:int2byte        
	//  238  403:bastore         
							j = j1;
	//  239  404:iload           7
	//  240  406:istore          4
						}
						j++;
	//  241  408:iload           4
	//  242  410:iconst_1        
	//  243  411:iadd            
	//  244  412:istore          4
					} while(true);
	//  245  414:goto            88
					j = j1;
	//  246  417:iload           7
	//  247  419:istore          4
				}
				throw new ib(j - 1, l1);
	//  248  421:new             #42  <Class ib>
	//  249  424:dup             
	//  250  425:iload           4
	//  251  427:iconst_1        
	//  252  428:isub            
	//  253  429:iload           8
	//  254  431:invokespecial   #45  <Method void ib(int, int)>
	//  255  434:athrow          
			}
			if('\uD800' <= c && c <= '\uDFFF')
	//* 256  435:ldc1            #29  <Int 55296>
	//* 257  437:iload           5
	//* 258  439:icmpgt          494
	//* 259  442:iload           5
	//* 260  444:ldc1            #30  <Int 57343>
	//* 261  446:icmpgt          494
			{
				int k1 = j + 1;
	//  262  449:iload           4
	//  263  451:iconst_1        
	//  264  452:iadd            
	//  265  453:istore          7
				if(k1 == charsequence.length() || !Character.isSurrogatePair(c, charsequence.charAt(k1)))
	//* 266  455:iload           7
	//* 267  457:aload_1         
	//* 268  458:invokeinterface #24  <Method int CharSequence.length()>
	//* 269  463:icmpeq          482
	//* 270  466:iload           5
	//* 271  468:aload_1         
	//* 272  469:iload           7
	//* 273  471:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//* 274  476:invokestatic    #36  <Method boolean Character.isSurrogatePair(char, char)>
	//* 275  479:ifne            494
					throw new ib(j, l1);
	//  276  482:new             #42  <Class ib>
	//  277  485:dup             
	//  278  486:iload           4
	//  279  488:iload           8
	//  280  490:invokespecial   #45  <Method void ib(int, int)>
	//  281  493:athrow          
			}
			charsequence = ((CharSequence) (new StringBuilder(37)));
	//  282  494:new             #47  <Class StringBuilder>
	//  283  497:dup             
	//  284  498:bipush          37
	//  285  500:invokespecial   #50  <Method void StringBuilder(int)>
	//  286  503:astore_1        
			((StringBuilder) (charsequence)).append("Failed writing ");
	//  287  504:aload_1         
	//  288  505:ldc1            #52  <String "Failed writing ">
	//  289  507:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  290  510:pop             
			((StringBuilder) (charsequence)).append(c);
	//  291  511:aload_1         
	//  292  512:iload           5
	//  293  514:invokevirtual   #59  <Method StringBuilder StringBuilder.append(char)>
	//  294  517:pop             
			((StringBuilder) (charsequence)).append(" at index ");
	//  295  518:aload_1         
	//  296  519:ldc1            #61  <String " at index ">
	//  297  521:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  298  524:pop             
			((StringBuilder) (charsequence)).append(i);
	//  299  525:aload_1         
	//  300  526:iload_3         
	//  301  527:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//  302  530:pop             
			throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  303  531:new             #66  <Class ArrayIndexOutOfBoundsException>
	//  304  534:dup             
	//  305  535:aload_1         
	//  306  536:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  307  539:invokespecial   #73  <Method void ArrayIndexOutOfBoundsException(String)>
	//  308  542:athrow          
		}
		return i;
	//  309  543:iload_3         
	//  310  544:ireturn         
	}
}
