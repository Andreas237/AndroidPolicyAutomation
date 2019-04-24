// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzben, zzbem, zzbep

final class zzbeo extends zzben
{

	zzbeo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void zzben()>
	//    2    4:return          
	}

	final int zzb(int i, byte abyte0[], int j, int k)
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
			byte byte0;
label0:
			{
				int l;
				do
				{
label1:
					{
						do
						{
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
								byte0 = abyte0[i];
	//   28   41:aload_2         
	//   29   42:iload_1         
	//   30   43:baload          
	//   31   44:istore          5
								i = j;
	//   32   46:iload_3         
	//   33   47:istore_1        
							} while(byte0 >= 0);
	//   34   48:iload           5
	//   35   50:ifge            242
							if(byte0 >= -32)
								break label1;
	//   36   53:iload           5
	//   37   55:bipush          -32
	//   38   57:icmpge          90
							if(j >= k)
	//*  39   60:iload_3         
	//*  40   61:iload           4
	//*  41   63:icmplt          69
								return ((int) (byte0));
	//   42   66:iload           5
	//   43   68:ireturn         
							if(byte0 < -62)
								break;
	//   44   69:iload           5
	//   45   71:bipush          -62
	//   46   73:icmplt          88
							i = j + 1;
	//   47   76:iload_3         
	//   48   77:iconst_1        
	//   49   78:iadd            
	//   50   79:istore_1        
						} while(abyte0[j] <= -65);
	//   51   80:aload_2         
	//   52   81:iload_3         
	//   53   82:baload          
	//   54   83:bipush          -65
	//   55   85:icmple          29
						return -1;
	//   56   88:iconst_m1       
	//   57   89:ireturn         
					}
					if(byte0 >= -16)
						break label0;
	//   58   90:iload           5
	//   59   92:bipush          -16
	//   60   94:icmpge          170
					if(j >= k - 1)
	//*  61   97:iload_3         
	//*  62   98:iload           4
	//*  63  100:iconst_1        
	//*  64  101:isub            
	//*  65  102:icmplt          113
						return zzbem.zzh(abyte0, j, k);
	//   66  105:aload_2         
	//   67  106:iload_3         
	//   68  107:iload           4
	//   69  109:invokestatic    #17  <Method int zzbem.zzh(byte[], int, int)>
	//   70  112:ireturn         
					l = j + 1;
	//   71  113:iload_3         
	//   72  114:iconst_1        
	//   73  115:iadd            
	//   74  116:istore          6
					i = ((int) (abyte0[j]));
	//   75  118:aload_2         
	//   76  119:iload_3         
	//   77  120:baload          
	//   78  121:istore_1        
					if(i > -65 || byte0 == -32 && i < -96 || byte0 == -19 && i >= -96)
						break;
	//   79  122:iload_1         
	//   80  123:bipush          -65
	//   81  125:icmpgt          168
	//   82  128:iload           5
	//   83  130:bipush          -32
	//   84  132:icmpne          141
	//   85  135:iload_1         
	//   86  136:bipush          -96
	//   87  138:icmplt          168
	//   88  141:iload           5
	//   89  143:bipush          -19
	//   90  145:icmpne          154
	//   91  148:iload_1         
	//   92  149:bipush          -96
	//   93  151:icmpge          168
					i = l + 1;
	//   94  154:iload           6
	//   95  156:iconst_1        
	//   96  157:iadd            
	//   97  158:istore_1        
				} while(abyte0[l] <= -65);
	//   98  159:aload_2         
	//   99  160:iload           6
	//  100  162:baload          
	//  101  163:bipush          -65
	//  102  165:icmple          29
				return -1;
	//  103  168:iconst_m1       
	//  104  169:ireturn         
			}
			if(j >= k - 2)
	//* 105  170:iload_3         
	//* 106  171:iload           4
	//* 107  173:iconst_2        
	//* 108  174:isub            
	//* 109  175:icmplt          186
				return zzbem.zzh(abyte0, j, k);
	//  110  178:aload_2         
	//  111  179:iload_3         
	//  112  180:iload           4
	//  113  182:invokestatic    #17  <Method int zzbem.zzh(byte[], int, int)>
	//  114  185:ireturn         
			i = j + 1;
	//  115  186:iload_3         
	//  116  187:iconst_1        
	//  117  188:iadd            
	//  118  189:istore_1        
			j = ((int) (abyte0[j]));
	//  119  190:aload_2         
	//  120  191:iload_3         
	//  121  192:baload          
	//  122  193:istore_3        
			if(j > -65 || (byte0 << 28) + (j + 112) >> 30 != 0)
				break;
	//  123  194:iload_3         
	//  124  195:bipush          -65
	//  125  197:icmpgt          240
	//  126  200:iload           5
	//  127  202:bipush          28
	//  128  204:ishl            
	//  129  205:iload_3         
	//  130  206:bipush          112
	//  131  208:iadd            
	//  132  209:iadd            
	//  133  210:bipush          30
	//  134  212:ishr            
	//  135  213:ifne            240
			j = i + 1;
	//  136  216:iload_1         
	//  137  217:iconst_1        
	//  138  218:iadd            
	//  139  219:istore_3        
			if(abyte0[i] > -65)
				break;
	//  140  220:aload_2         
	//  141  221:iload_1         
	//  142  222:baload          
	//  143  223:bipush          -65
	//  144  225:icmpgt          240
			i = j + 1;
	//  145  228:iload_3         
	//  146  229:iconst_1        
	//  147  230:iadd            
	//  148  231:istore_1        
		} while(abyte0[j] <= -65);
	//  149  232:aload_2         
	//  150  233:iload_3         
	//  151  234:baload          
	//  152  235:bipush          -65
	//  153  237:icmple          242
		return -1;
	//  154  240:iconst_m1       
	//  155  241:ireturn         
	//* 156  242:goto            29
	}

	final int zzb(CharSequence charsequence, byte abyte0[], int i, int j)
	{
		int l;
label0:
		{
			char c;
			int i1;
label1:
			{
				i1 = charsequence.length();
	//    0    0:aload_1         
	//    1    1:invokeinterface #24  <Method int CharSequence.length()>
	//    2    6:istore          8
				int j1 = j + i;
	//    3    8:iload           4
	//    4   10:iload_3         
	//    5   11:iadd            
	//    6   12:istore          9
				j = 0;
	//    7   14:iconst_0        
	//    8   15:istore          4
				do
				{
					if(j >= i1)
						break;
	//    9   17:iload           4
	//   10   19:iload           8
	//   11   21:icmpge          71
					int k = j + i;
	//   12   24:iload           4
	//   13   26:iload_3         
	//   14   27:iadd            
	//   15   28:istore          7
					if(k >= j1)
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
				if(j == i1)
	//*  36   71:iload           4
	//*  37   73:iload           8
	//*  38   75:icmpne          83
					return i + i1;
	//   39   78:iload_3         
	//   40   79:iload           8
	//   41   81:iadd            
	//   42   82:ireturn         
				l = i + j;
	//   43   83:iload_3         
	//   44   84:iload           4
	//   45   86:iadd            
	//   46   87:istore          7
				i = j;
	//   47   89:iload           4
	//   48   91:istore_3        
				do
				{
					if(i >= i1)
						break label0;
	//   49   92:iload_3         
	//   50   93:iload           8
	//   51   95:icmpge          566
					c = charsequence.charAt(i);
	//   52   98:aload_1         
	//   53   99:iload_3         
	//   54  100:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//   55  105:istore          5
					if(c < '\200' && l < j1)
	//*  56  107:iload           5
	//*  57  109:sipush          128
	//*  58  112:icmpge          138
	//*  59  115:iload           7
	//*  60  117:iload           9
	//*  61  119:icmpge          138
					{
						j = l + 1;
	//   62  122:iload           7
	//   63  124:iconst_1        
	//   64  125:iadd            
	//   65  126:istore          4
						abyte0[l] = (byte)c;
	//   66  128:aload_2         
	//   67  129:iload           7
	//   68  131:iload           5
	//   69  133:int2byte        
	//   70  134:bastore         
					} else
	//*  71  135:goto            435
					if(c < '\u0800' && l <= j1 - 2)
	//*  72  138:iload           5
	//*  73  140:sipush          2048
	//*  74  143:icmpge          198
	//*  75  146:iload           7
	//*  76  148:iload           9
	//*  77  150:iconst_2        
	//*  78  151:isub            
	//*  79  152:icmpgt          198
					{
						int k1 = l + 1;
	//   80  155:iload           7
	//   81  157:iconst_1        
	//   82  158:iadd            
	//   83  159:istore          10
						abyte0[l] = (byte)(0x3c0 | c >>> 6);
	//   84  161:aload_2         
	//   85  162:iload           7
	//   86  164:sipush          960
	//   87  167:iload           5
	//   88  169:bipush          6
	//   89  171:iushr           
	//   90  172:ior             
	//   91  173:int2byte        
	//   92  174:bastore         
						j = k1 + 1;
	//   93  175:iload           10
	//   94  177:iconst_1        
	//   95  178:iadd            
	//   96  179:istore          4
						abyte0[k1] = (byte)(c & 0x3f | 0x80);
	//   97  181:aload_2         
	//   98  182:iload           10
	//   99  184:iload           5
	//  100  186:bipush          63
	//  101  188:iand            
	//  102  189:sipush          128
	//  103  192:ior             
	//  104  193:int2byte        
	//  105  194:bastore         
					} else
	//* 106  195:goto            435
					if((c < '\uD800' || '\uDFFF' < c) && l <= j1 - 3)
	//* 107  198:iload           5
	//* 108  200:ldc1            #29  <Int 55296>
	//* 109  202:icmplt          212
	//* 110  205:ldc1            #30  <Int 57343>
	//* 111  207:iload           5
	//* 112  209:icmpge          287
	//* 113  212:iload           7
	//* 114  214:iload           9
	//* 115  216:iconst_3        
	//* 116  217:isub            
	//* 117  218:icmpgt          287
					{
						j = l + 1;
	//  118  221:iload           7
	//  119  223:iconst_1        
	//  120  224:iadd            
	//  121  225:istore          4
						abyte0[l] = (byte)(0x1e0 | c >>> 12);
	//  122  227:aload_2         
	//  123  228:iload           7
	//  124  230:sipush          480
	//  125  233:iload           5
	//  126  235:bipush          12
	//  127  237:iushr           
	//  128  238:ior             
	//  129  239:int2byte        
	//  130  240:bastore         
						l = j + 1;
	//  131  241:iload           4
	//  132  243:iconst_1        
	//  133  244:iadd            
	//  134  245:istore          7
						abyte0[j] = (byte)(c >>> 6 & 0x3f | 0x80);
	//  135  247:aload_2         
	//  136  248:iload           4
	//  137  250:iload           5
	//  138  252:bipush          6
	//  139  254:iushr           
	//  140  255:bipush          63
	//  141  257:iand            
	//  142  258:sipush          128
	//  143  261:ior             
	//  144  262:int2byte        
	//  145  263:bastore         
						j = l + 1;
	//  146  264:iload           7
	//  147  266:iconst_1        
	//  148  267:iadd            
	//  149  268:istore          4
						abyte0[l] = (byte)(c & 0x3f | 0x80);
	//  150  270:aload_2         
	//  151  271:iload           7
	//  152  273:iload           5
	//  153  275:bipush          63
	//  154  277:iand            
	//  155  278:sipush          128
	//  156  281:ior             
	//  157  282:int2byte        
	//  158  283:bastore         
					} else
	//* 159  284:goto            135
					{
						if(l > j1 - 4)
							break label1;
	//  160  287:iload           7
	//  161  289:iload           9
	//  162  291:iconst_4        
	//  163  292:isub            
	//  164  293:icmpgt          459
						j = i + 1;
	//  165  296:iload_3         
	//  166  297:iconst_1        
	//  167  298:iadd            
	//  168  299:istore          4
						if(j == charsequence.length())
							break;
	//  169  301:iload           4
	//  170  303:aload_1         
	//  171  304:invokeinterface #24  <Method int CharSequence.length()>
	//  172  309:icmpeq          446
						char c1 = charsequence.charAt(j);
	//  173  312:aload_1         
	//  174  313:iload           4
	//  175  315:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//  176  320:istore          6
						if(!Character.isSurrogatePair(c, c1))
	//* 177  322:iload           5
	//* 178  324:iload           6
	//* 179  326:invokestatic    #36  <Method boolean Character.isSurrogatePair(char, char)>
	//* 180  329:ifne            338
						{
							i = j;
	//  181  332:iload           4
	//  182  334:istore_3        
							break;
	//  183  335:goto            446
						}
						i = Character.toCodePoint(c, c1);
	//  184  338:iload           5
	//  185  340:iload           6
	//  186  342:invokestatic    #40  <Method int Character.toCodePoint(char, char)>
	//  187  345:istore_3        
						int l1 = l + 1;
	//  188  346:iload           7
	//  189  348:iconst_1        
	//  190  349:iadd            
	//  191  350:istore          10
						abyte0[l] = (byte)(0xf0 | i >>> 18);
	//  192  352:aload_2         
	//  193  353:iload           7
	//  194  355:sipush          240
	//  195  358:iload_3         
	//  196  359:bipush          18
	//  197  361:iushr           
	//  198  362:ior             
	//  199  363:int2byte        
	//  200  364:bastore         
						l = l1 + 1;
	//  201  365:iload           10
	//  202  367:iconst_1        
	//  203  368:iadd            
	//  204  369:istore          7
						abyte0[l1] = (byte)(i >>> 12 & 0x3f | 0x80);
	//  205  371:aload_2         
	//  206  372:iload           10
	//  207  374:iload_3         
	//  208  375:bipush          12
	//  209  377:iushr           
	//  210  378:bipush          63
	//  211  380:iand            
	//  212  381:sipush          128
	//  213  384:ior             
	//  214  385:int2byte        
	//  215  386:bastore         
						l1 = l + 1;
	//  216  387:iload           7
	//  217  389:iconst_1        
	//  218  390:iadd            
	//  219  391:istore          10
						abyte0[l] = (byte)(i >>> 6 & 0x3f | 0x80);
	//  220  393:aload_2         
	//  221  394:iload           7
	//  222  396:iload_3         
	//  223  397:bipush          6
	//  224  399:iushr           
	//  225  400:bipush          63
	//  226  402:iand            
	//  227  403:sipush          128
	//  228  406:ior             
	//  229  407:int2byte        
	//  230  408:bastore         
						l = l1 + 1;
	//  231  409:iload           10
	//  232  411:iconst_1        
	//  233  412:iadd            
	//  234  413:istore          7
						abyte0[l1] = (byte)(i & 0x3f | 0x80);
	//  235  415:aload_2         
	//  236  416:iload           10
	//  237  418:iload_3         
	//  238  419:bipush          63
	//  239  421:iand            
	//  240  422:sipush          128
	//  241  425:ior             
	//  242  426:int2byte        
	//  243  427:bastore         
						i = j;
	//  244  428:iload           4
	//  245  430:istore_3        
						j = l;
	//  246  431:iload           7
	//  247  433:istore          4
					}
					i++;
	//  248  435:iload_3         
	//  249  436:iconst_1        
	//  250  437:iadd            
	//  251  438:istore_3        
					l = j;
	//  252  439:iload           4
	//  253  441:istore          7
				} while(true);
	//  254  443:goto            92
				throw new zzbep(i - 1, i1);
	//  255  446:new             #42  <Class zzbep>
	//  256  449:dup             
	//  257  450:iload_3         
	//  258  451:iconst_1        
	//  259  452:isub            
	//  260  453:iload           8
	//  261  455:invokespecial   #45  <Method void zzbep(int, int)>
	//  262  458:athrow          
			}
			if('\uD800' <= c && c <= '\uDFFF')
	//* 263  459:ldc1            #29  <Int 55296>
	//* 264  461:iload           5
	//* 265  463:icmpgt          516
	//* 266  466:iload           5
	//* 267  468:ldc1            #30  <Int 57343>
	//* 268  470:icmpgt          516
			{
				j = i + 1;
	//  269  473:iload_3         
	//  270  474:iconst_1        
	//  271  475:iadd            
	//  272  476:istore          4
				if(j == charsequence.length() || !Character.isSurrogatePair(c, charsequence.charAt(j)))
	//* 273  478:iload           4
	//* 274  480:aload_1         
	//* 275  481:invokeinterface #24  <Method int CharSequence.length()>
	//* 276  486:icmpeq          505
	//* 277  489:iload           5
	//* 278  491:aload_1         
	//* 279  492:iload           4
	//* 280  494:invokeinterface #28  <Method char CharSequence.charAt(int)>
	//* 281  499:invokestatic    #36  <Method boolean Character.isSurrogatePair(char, char)>
	//* 282  502:ifne            516
					throw new zzbep(i, i1);
	//  283  505:new             #42  <Class zzbep>
	//  284  508:dup             
	//  285  509:iload_3         
	//  286  510:iload           8
	//  287  512:invokespecial   #45  <Method void zzbep(int, int)>
	//  288  515:athrow          
			}
			charsequence = ((CharSequence) (new StringBuilder(37)));
	//  289  516:new             #47  <Class StringBuilder>
	//  290  519:dup             
	//  291  520:bipush          37
	//  292  522:invokespecial   #50  <Method void StringBuilder(int)>
	//  293  525:astore_1        
			((StringBuilder) (charsequence)).append("Failed writing ");
	//  294  526:aload_1         
	//  295  527:ldc1            #52  <String "Failed writing ">
	//  296  529:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  297  532:pop             
			((StringBuilder) (charsequence)).append(c);
	//  298  533:aload_1         
	//  299  534:iload           5
	//  300  536:invokevirtual   #59  <Method StringBuilder StringBuilder.append(char)>
	//  301  539:pop             
			((StringBuilder) (charsequence)).append(" at index ");
	//  302  540:aload_1         
	//  303  541:ldc1            #61  <String " at index ">
	//  304  543:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
	//  305  546:pop             
			((StringBuilder) (charsequence)).append(l);
	//  306  547:aload_1         
	//  307  548:iload           7
	//  308  550:invokevirtual   #64  <Method StringBuilder StringBuilder.append(int)>
	//  309  553:pop             
			throw new ArrayIndexOutOfBoundsException(((StringBuilder) (charsequence)).toString());
	//  310  554:new             #66  <Class ArrayIndexOutOfBoundsException>
	//  311  557:dup             
	//  312  558:aload_1         
	//  313  559:invokevirtual   #70  <Method String StringBuilder.toString()>
	//  314  562:invokespecial   #73  <Method void ArrayIndexOutOfBoundsException(String)>
	//  315  565:athrow          
		}
		return l;
	//  316  566:iload           7
	//  317  568:ireturn         
	}
}
