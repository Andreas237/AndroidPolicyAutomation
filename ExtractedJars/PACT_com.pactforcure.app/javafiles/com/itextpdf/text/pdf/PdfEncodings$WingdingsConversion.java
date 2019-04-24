// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			ExtraEncoding, PdfEncodings

private static class PdfEncodings$WingdingsConversion
	implements ExtraEncoding
{

	public String byteToChar(byte abyte0[], String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public byte[] charToByte(char c, String s)
	{
		if(c == ' ')
	//*   0    0:iload_1         
	//*   1    1:bipush          32
	//*   2    3:icmpne          15
			return (new byte[] {
				(byte)c
			});
	//    3    6:iconst_1        
	//    4    7:newarray        byte[]
	//    5    9:dup             
	//    6   10:iconst_0        
	//    7   11:iload_1         
	//    8   12:int2byte        
	//    9   13:bastore         
	//   10   14:areturn         
		if(c >= '\u2701' && c <= '\u27BE')
	//*  11   15:iload_1         
	//*  12   16:sipush          9985
	//*  13   19:icmplt          51
	//*  14   22:iload_1         
	//*  15   23:sipush          10174
	//*  16   26:icmpgt          51
		{
			byte byte0 = table[c - 9984];
	//   17   29:getstatic       #69  <Field byte[] table>
	//   18   32:iload_1         
	//   19   33:sipush          9984
	//   20   36:isub            
	//   21   37:baload          
	//   22   38:istore_3        
			if(byte0 != 0)
	//*  23   39:iload_3         
	//*  24   40:ifeq            51
				return (new byte[] {
					byte0
				});
	//   25   43:iconst_1        
	//   26   44:newarray        byte[]
	//   27   46:dup             
	//   28   47:iconst_0        
	//   29   48:iload_3         
	//   30   49:bastore         
	//   31   50:areturn         
		}
		return new byte[0];
	//   32   51:iconst_0        
	//   33   52:newarray        byte[]
	//   34   54:areturn         
	}

	public byte[] charToByte(String s, String s1)
	{
		s1 = ((String) (s.toCharArray()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #86  <Method char[] String.toCharArray()>
	//    2    4:astore_2        
		s = ((String) (new byte[s1.length]));
	//    3    5:aload_2         
	//    4    6:arraylength     
	//    5    7:newarray        byte[]
	//    6    9:astore_1        
		int i1 = s1.length;
	//    7   10:aload_2         
	//    8   11:arraylength     
	//    9   12:istore          7
		int j = 0;
	//   10   14:iconst_0        
	//   11   15:istore          5
		int i = 0;
	//   12   17:iconst_0        
	//   13   18:istore          4
		while(j < i1) 
	//*  14   20:iload           5
	//*  15   22:iload           7
	//*  16   24:icmpge          115
		{
			char c = s1[j];
	//   17   27:aload_2         
	//   18   28:iload           5
	//   19   30:caload          
	//   20   31:istore          8
			if(c == ' ')
	//*  21   33:iload           8
	//*  22   35:bipush          32
	//*  23   37:icmpne          66
			{
				int k = i + 1;
	//   24   40:iload           4
	//   25   42:iconst_1        
	//   26   43:iadd            
	//   27   44:istore          6
				s[i] = (byte)c;
	//   28   46:aload_1         
	//   29   47:iload           4
	//   30   49:iload           8
	//   31   51:int2byte        
	//   32   52:bastore         
				i = k;
	//   33   53:iload           6
	//   34   55:istore          4
			} else
	//*  35   57:iload           5
	//*  36   59:iconst_1        
	//*  37   60:iadd            
	//*  38   61:istore          5
	//*  39   63:goto            20
			if(c >= '\u2701' && c <= '\u27BE')
	//*  40   66:iload           8
	//*  41   68:sipush          9985
	//*  42   71:icmplt          140
	//*  43   74:iload           8
	//*  44   76:sipush          10174
	//*  45   79:icmpgt          140
			{
				byte byte0 = table[c - 9984];
	//   46   82:getstatic       #69  <Field byte[] table>
	//   47   85:iload           8
	//   48   87:sipush          9984
	//   49   90:isub            
	//   50   91:baload          
	//   51   92:istore_3        
				if(byte0 != 0)
	//*  52   93:iload_3         
	//*  53   94:ifeq            140
				{
					int l = i + 1;
	//   54   97:iload           4
	//   55   99:iconst_1        
	//   56  100:iadd            
	//   57  101:istore          6
					s[i] = byte0;
	//   58  103:aload_1         
	//   59  104:iload           4
	//   60  106:iload_3         
	//   61  107:bastore         
					i = l;
	//   62  108:iload           6
	//   63  110:istore          4
				}
			}
			j++;
		}
	//*  64  112:goto            57
		if(i == i1)
	//*  65  115:iload           4
	//*  66  117:iload           7
	//*  67  119:icmpne          124
		{
			return ((byte []) (s));
	//   68  122:aload_1         
	//   69  123:areturn         
		} else
		{
			s1 = ((String) (new byte[i]));
	//   70  124:iload           4
	//   71  126:newarray        byte[]
	//   72  128:astore_2        
			System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, i);
	//   73  129:aload_1         
	//   74  130:iconst_0        
	//   75  131:aload_2         
	//   76  132:iconst_0        
	//   77  133:iload           4
	//   78  135:invokestatic    #92  <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((byte []) (s1));
	//   79  138:aload_2         
	//   80  139:areturn         
		}
	//*  81  140:goto            57
	}

	private static final byte table[] = {
		0, 35, 34, 0, 0, 0, 41, 62, 81, 42, 
		0, 0, 65, 63, 0, 0, 0, 0, 0, -4, 
		0, 0, 0, -5, 0, 0, 0, 0, 0, 0, 
		86, 0, 88, 89, 0, 0, 0, 0, 0, 0, 
		0, 0, -75, 0, 0, 0, 0, 0, -74, 0, 
		0, 0, -83, -81, -84, 0, 0, 0, 0, 0, 
		0, 0, 0, 124, 123, 0, 0, 0, 84, 0, 
		0, 0, 0, 0, 0, 0, 0, -90, 0, 0, 
		0, 113, 114, 0, 0, 0, 117, 0, 0, 0, 
		0, 0, 0, 125, 126, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, -116, -115, 
		-114, -113, -112, -111, -110, -109, -108, -107, -127, -126, 
		-125, -124, -123, -122, -121, -120, -119, -118, -116, -115, 
		-114, -113, -112, -111, -110, -109, -108, -107, -24, 0, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0, -24, -40, 0, 0, -60, -58, 0, 0, -16, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, -36, 
		0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
		0
	};

	static 
	{
	//    0    0:sipush          191
	//    1    3:newarray        byte[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:ldc1            #14  <Int 0>
	//    5    9:bastore         
	//    6   10:dup             
	//    7   11:iconst_1        
	//    8   12:ldc1            #15  <Int 35>
	//    9   14:bastore         
	//   10   15:dup             
	//   11   16:iconst_2        
	//   12   17:ldc1            #16  <Int 34>
	//   13   19:bastore         
	//   14   20:dup             
	//   15   21:iconst_3        
	//   16   22:ldc1            #14  <Int 0>
	//   17   24:bastore         
	//   18   25:dup             
	//   19   26:iconst_4        
	//   20   27:ldc1            #14  <Int 0>
	//   21   29:bastore         
	//   22   30:dup             
	//   23   31:iconst_5        
	//   24   32:ldc1            #14  <Int 0>
	//   25   34:bastore         
	//   26   35:dup             
	//   27   36:bipush          6
	//   28   38:ldc1            #17  <Int 41>
	//   29   40:bastore         
	//   30   41:dup             
	//   31   42:bipush          7
	//   32   44:ldc1            #18  <Int 62>
	//   33   46:bastore         
	//   34   47:dup             
	//   35   48:bipush          8
	//   36   50:ldc1            #19  <Int 81>
	//   37   52:bastore         
	//   38   53:dup             
	//   39   54:bipush          9
	//   40   56:ldc1            #20  <Int 42>
	//   41   58:bastore         
	//   42   59:dup             
	//   43   60:bipush          10
	//   44   62:ldc1            #14  <Int 0>
	//   45   64:bastore         
	//   46   65:dup             
	//   47   66:bipush          11
	//   48   68:ldc1            #14  <Int 0>
	//   49   70:bastore         
	//   50   71:dup             
	//   51   72:bipush          12
	//   52   74:ldc1            #21  <Int 65>
	//   53   76:bastore         
	//   54   77:dup             
	//   55   78:bipush          13
	//   56   80:ldc1            #22  <Int 63>
	//   57   82:bastore         
	//   58   83:dup             
	//   59   84:bipush          14
	//   60   86:ldc1            #14  <Int 0>
	//   61   88:bastore         
	//   62   89:dup             
	//   63   90:bipush          15
	//   64   92:ldc1            #14  <Int 0>
	//   65   94:bastore         
	//   66   95:dup             
	//   67   96:bipush          16
	//   68   98:ldc1            #14  <Int 0>
	//   69  100:bastore         
	//   70  101:dup             
	//   71  102:bipush          17
	//   72  104:ldc1            #14  <Int 0>
	//   73  106:bastore         
	//   74  107:dup             
	//   75  108:bipush          18
	//   76  110:ldc1            #14  <Int 0>
	//   77  112:bastore         
	//   78  113:dup             
	//   79  114:bipush          19
	//   80  116:ldc1            #23  <Int -4>
	//   81  118:bastore         
	//   82  119:dup             
	//   83  120:bipush          20
	//   84  122:ldc1            #14  <Int 0>
	//   85  124:bastore         
	//   86  125:dup             
	//   87  126:bipush          21
	//   88  128:ldc1            #14  <Int 0>
	//   89  130:bastore         
	//   90  131:dup             
	//   91  132:bipush          22
	//   92  134:ldc1            #14  <Int 0>
	//   93  136:bastore         
	//   94  137:dup             
	//   95  138:bipush          23
	//   96  140:ldc1            #24  <Int -5>
	//   97  142:bastore         
	//   98  143:dup             
	//   99  144:bipush          24
	//  100  146:ldc1            #14  <Int 0>
	//  101  148:bastore         
	//  102  149:dup             
	//  103  150:bipush          25
	//  104  152:ldc1            #14  <Int 0>
	//  105  154:bastore         
	//  106  155:dup             
	//  107  156:bipush          26
	//  108  158:ldc1            #14  <Int 0>
	//  109  160:bastore         
	//  110  161:dup             
	//  111  162:bipush          27
	//  112  164:ldc1            #14  <Int 0>
	//  113  166:bastore         
	//  114  167:dup             
	//  115  168:bipush          28
	//  116  170:ldc1            #14  <Int 0>
	//  117  172:bastore         
	//  118  173:dup             
	//  119  174:bipush          29
	//  120  176:ldc1            #14  <Int 0>
	//  121  178:bastore         
	//  122  179:dup             
	//  123  180:bipush          30
	//  124  182:ldc1            #25  <Int 86>
	//  125  184:bastore         
	//  126  185:dup             
	//  127  186:bipush          31
	//  128  188:ldc1            #14  <Int 0>
	//  129  190:bastore         
	//  130  191:dup             
	//  131  192:bipush          32
	//  132  194:ldc1            #26  <Int 88>
	//  133  196:bastore         
	//  134  197:dup             
	//  135  198:bipush          33
	//  136  200:ldc1            #27  <Int 89>
	//  137  202:bastore         
	//  138  203:dup             
	//  139  204:bipush          34
	//  140  206:ldc1            #14  <Int 0>
	//  141  208:bastore         
	//  142  209:dup             
	//  143  210:bipush          35
	//  144  212:ldc1            #14  <Int 0>
	//  145  214:bastore         
	//  146  215:dup             
	//  147  216:bipush          36
	//  148  218:ldc1            #14  <Int 0>
	//  149  220:bastore         
	//  150  221:dup             
	//  151  222:bipush          37
	//  152  224:ldc1            #14  <Int 0>
	//  153  226:bastore         
	//  154  227:dup             
	//  155  228:bipush          38
	//  156  230:ldc1            #14  <Int 0>
	//  157  232:bastore         
	//  158  233:dup             
	//  159  234:bipush          39
	//  160  236:ldc1            #14  <Int 0>
	//  161  238:bastore         
	//  162  239:dup             
	//  163  240:bipush          40
	//  164  242:ldc1            #14  <Int 0>
	//  165  244:bastore         
	//  166  245:dup             
	//  167  246:bipush          41
	//  168  248:ldc1            #14  <Int 0>
	//  169  250:bastore         
	//  170  251:dup             
	//  171  252:bipush          42
	//  172  254:ldc1            #28  <Int -75>
	//  173  256:bastore         
	//  174  257:dup             
	//  175  258:bipush          43
	//  176  260:ldc1            #14  <Int 0>
	//  177  262:bastore         
	//  178  263:dup             
	//  179  264:bipush          44
	//  180  266:ldc1            #14  <Int 0>
	//  181  268:bastore         
	//  182  269:dup             
	//  183  270:bipush          45
	//  184  272:ldc1            #14  <Int 0>
	//  185  274:bastore         
	//  186  275:dup             
	//  187  276:bipush          46
	//  188  278:ldc1            #14  <Int 0>
	//  189  280:bastore         
	//  190  281:dup             
	//  191  282:bipush          47
	//  192  284:ldc1            #14  <Int 0>
	//  193  286:bastore         
	//  194  287:dup             
	//  195  288:bipush          48
	//  196  290:ldc1            #29  <Int -74>
	//  197  292:bastore         
	//  198  293:dup             
	//  199  294:bipush          49
	//  200  296:ldc1            #14  <Int 0>
	//  201  298:bastore         
	//  202  299:dup             
	//  203  300:bipush          50
	//  204  302:ldc1            #14  <Int 0>
	//  205  304:bastore         
	//  206  305:dup             
	//  207  306:bipush          51
	//  208  308:ldc1            #14  <Int 0>
	//  209  310:bastore         
	//  210  311:dup             
	//  211  312:bipush          52
	//  212  314:ldc1            #30  <Int -83>
	//  213  316:bastore         
	//  214  317:dup             
	//  215  318:bipush          53
	//  216  320:ldc1            #31  <Int -81>
	//  217  322:bastore         
	//  218  323:dup             
	//  219  324:bipush          54
	//  220  326:ldc1            #32  <Int -84>
	//  221  328:bastore         
	//  222  329:dup             
	//  223  330:bipush          55
	//  224  332:ldc1            #14  <Int 0>
	//  225  334:bastore         
	//  226  335:dup             
	//  227  336:bipush          56
	//  228  338:ldc1            #14  <Int 0>
	//  229  340:bastore         
	//  230  341:dup             
	//  231  342:bipush          57
	//  232  344:ldc1            #14  <Int 0>
	//  233  346:bastore         
	//  234  347:dup             
	//  235  348:bipush          58
	//  236  350:ldc1            #14  <Int 0>
	//  237  352:bastore         
	//  238  353:dup             
	//  239  354:bipush          59
	//  240  356:ldc1            #14  <Int 0>
	//  241  358:bastore         
	//  242  359:dup             
	//  243  360:bipush          60
	//  244  362:ldc1            #14  <Int 0>
	//  245  364:bastore         
	//  246  365:dup             
	//  247  366:bipush          61
	//  248  368:ldc1            #14  <Int 0>
	//  249  370:bastore         
	//  250  371:dup             
	//  251  372:bipush          62
	//  252  374:ldc1            #14  <Int 0>
	//  253  376:bastore         
	//  254  377:dup             
	//  255  378:bipush          63
	//  256  380:ldc1            #33  <Int 124>
	//  257  382:bastore         
	//  258  383:dup             
	//  259  384:bipush          64
	//  260  386:ldc1            #34  <Int 123>
	//  261  388:bastore         
	//  262  389:dup             
	//  263  390:bipush          65
	//  264  392:ldc1            #14  <Int 0>
	//  265  394:bastore         
	//  266  395:dup             
	//  267  396:bipush          66
	//  268  398:ldc1            #14  <Int 0>
	//  269  400:bastore         
	//  270  401:dup             
	//  271  402:bipush          67
	//  272  404:ldc1            #14  <Int 0>
	//  273  406:bastore         
	//  274  407:dup             
	//  275  408:bipush          68
	//  276  410:ldc1            #35  <Int 84>
	//  277  412:bastore         
	//  278  413:dup             
	//  279  414:bipush          69
	//  280  416:ldc1            #14  <Int 0>
	//  281  418:bastore         
	//  282  419:dup             
	//  283  420:bipush          70
	//  284  422:ldc1            #14  <Int 0>
	//  285  424:bastore         
	//  286  425:dup             
	//  287  426:bipush          71
	//  288  428:ldc1            #14  <Int 0>
	//  289  430:bastore         
	//  290  431:dup             
	//  291  432:bipush          72
	//  292  434:ldc1            #14  <Int 0>
	//  293  436:bastore         
	//  294  437:dup             
	//  295  438:bipush          73
	//  296  440:ldc1            #14  <Int 0>
	//  297  442:bastore         
	//  298  443:dup             
	//  299  444:bipush          74
	//  300  446:ldc1            #14  <Int 0>
	//  301  448:bastore         
	//  302  449:dup             
	//  303  450:bipush          75
	//  304  452:ldc1            #14  <Int 0>
	//  305  454:bastore         
	//  306  455:dup             
	//  307  456:bipush          76
	//  308  458:ldc1            #14  <Int 0>
	//  309  460:bastore         
	//  310  461:dup             
	//  311  462:bipush          77
	//  312  464:ldc1            #36  <Int -90>
	//  313  466:bastore         
	//  314  467:dup             
	//  315  468:bipush          78
	//  316  470:ldc1            #14  <Int 0>
	//  317  472:bastore         
	//  318  473:dup             
	//  319  474:bipush          79
	//  320  476:ldc1            #14  <Int 0>
	//  321  478:bastore         
	//  322  479:dup             
	//  323  480:bipush          80
	//  324  482:ldc1            #14  <Int 0>
	//  325  484:bastore         
	//  326  485:dup             
	//  327  486:bipush          81
	//  328  488:ldc1            #37  <Int 113>
	//  329  490:bastore         
	//  330  491:dup             
	//  331  492:bipush          82
	//  332  494:ldc1            #38  <Int 114>
	//  333  496:bastore         
	//  334  497:dup             
	//  335  498:bipush          83
	//  336  500:ldc1            #14  <Int 0>
	//  337  502:bastore         
	//  338  503:dup             
	//  339  504:bipush          84
	//  340  506:ldc1            #14  <Int 0>
	//  341  508:bastore         
	//  342  509:dup             
	//  343  510:bipush          85
	//  344  512:ldc1            #14  <Int 0>
	//  345  514:bastore         
	//  346  515:dup             
	//  347  516:bipush          86
	//  348  518:ldc1            #39  <Int 117>
	//  349  520:bastore         
	//  350  521:dup             
	//  351  522:bipush          87
	//  352  524:ldc1            #14  <Int 0>
	//  353  526:bastore         
	//  354  527:dup             
	//  355  528:bipush          88
	//  356  530:ldc1            #14  <Int 0>
	//  357  532:bastore         
	//  358  533:dup             
	//  359  534:bipush          89
	//  360  536:ldc1            #14  <Int 0>
	//  361  538:bastore         
	//  362  539:dup             
	//  363  540:bipush          90
	//  364  542:ldc1            #14  <Int 0>
	//  365  544:bastore         
	//  366  545:dup             
	//  367  546:bipush          91
	//  368  548:ldc1            #14  <Int 0>
	//  369  550:bastore         
	//  370  551:dup             
	//  371  552:bipush          92
	//  372  554:ldc1            #14  <Int 0>
	//  373  556:bastore         
	//  374  557:dup             
	//  375  558:bipush          93
	//  376  560:ldc1            #40  <Int 125>
	//  377  562:bastore         
	//  378  563:dup             
	//  379  564:bipush          94
	//  380  566:ldc1            #41  <Int 126>
	//  381  568:bastore         
	//  382  569:dup             
	//  383  570:bipush          95
	//  384  572:ldc1            #14  <Int 0>
	//  385  574:bastore         
	//  386  575:dup             
	//  387  576:bipush          96
	//  388  578:ldc1            #14  <Int 0>
	//  389  580:bastore         
	//  390  581:dup             
	//  391  582:bipush          97
	//  392  584:ldc1            #14  <Int 0>
	//  393  586:bastore         
	//  394  587:dup             
	//  395  588:bipush          98
	//  396  590:ldc1            #14  <Int 0>
	//  397  592:bastore         
	//  398  593:dup             
	//  399  594:bipush          99
	//  400  596:ldc1            #14  <Int 0>
	//  401  598:bastore         
	//  402  599:dup             
	//  403  600:bipush          100
	//  404  602:ldc1            #14  <Int 0>
	//  405  604:bastore         
	//  406  605:dup             
	//  407  606:bipush          101
	//  408  608:ldc1            #14  <Int 0>
	//  409  610:bastore         
	//  410  611:dup             
	//  411  612:bipush          102
	//  412  614:ldc1            #14  <Int 0>
	//  413  616:bastore         
	//  414  617:dup             
	//  415  618:bipush          103
	//  416  620:ldc1            #14  <Int 0>
	//  417  622:bastore         
	//  418  623:dup             
	//  419  624:bipush          104
	//  420  626:ldc1            #14  <Int 0>
	//  421  628:bastore         
	//  422  629:dup             
	//  423  630:bipush          105
	//  424  632:ldc1            #14  <Int 0>
	//  425  634:bastore         
	//  426  635:dup             
	//  427  636:bipush          106
	//  428  638:ldc1            #14  <Int 0>
	//  429  640:bastore         
	//  430  641:dup             
	//  431  642:bipush          107
	//  432  644:ldc1            #14  <Int 0>
	//  433  646:bastore         
	//  434  647:dup             
	//  435  648:bipush          108
	//  436  650:ldc1            #14  <Int 0>
	//  437  652:bastore         
	//  438  653:dup             
	//  439  654:bipush          109
	//  440  656:ldc1            #14  <Int 0>
	//  441  658:bastore         
	//  442  659:dup             
	//  443  660:bipush          110
	//  444  662:ldc1            #14  <Int 0>
	//  445  664:bastore         
	//  446  665:dup             
	//  447  666:bipush          111
	//  448  668:ldc1            #14  <Int 0>
	//  449  670:bastore         
	//  450  671:dup             
	//  451  672:bipush          112
	//  452  674:ldc1            #14  <Int 0>
	//  453  676:bastore         
	//  454  677:dup             
	//  455  678:bipush          113
	//  456  680:ldc1            #14  <Int 0>
	//  457  682:bastore         
	//  458  683:dup             
	//  459  684:bipush          114
	//  460  686:ldc1            #14  <Int 0>
	//  461  688:bastore         
	//  462  689:dup             
	//  463  690:bipush          115
	//  464  692:ldc1            #14  <Int 0>
	//  465  694:bastore         
	//  466  695:dup             
	//  467  696:bipush          116
	//  468  698:ldc1            #14  <Int 0>
	//  469  700:bastore         
	//  470  701:dup             
	//  471  702:bipush          117
	//  472  704:ldc1            #14  <Int 0>
	//  473  706:bastore         
	//  474  707:dup             
	//  475  708:bipush          118
	//  476  710:ldc1            #42  <Int -116>
	//  477  712:bastore         
	//  478  713:dup             
	//  479  714:bipush          119
	//  480  716:ldc1            #43  <Int -115>
	//  481  718:bastore         
	//  482  719:dup             
	//  483  720:bipush          120
	//  484  722:ldc1            #44  <Int -114>
	//  485  724:bastore         
	//  486  725:dup             
	//  487  726:bipush          121
	//  488  728:ldc1            #45  <Int -113>
	//  489  730:bastore         
	//  490  731:dup             
	//  491  732:bipush          122
	//  492  734:ldc1            #46  <Int -112>
	//  493  736:bastore         
	//  494  737:dup             
	//  495  738:bipush          123
	//  496  740:ldc1            #47  <Int -111>
	//  497  742:bastore         
	//  498  743:dup             
	//  499  744:bipush          124
	//  500  746:ldc1            #48  <Int -110>
	//  501  748:bastore         
	//  502  749:dup             
	//  503  750:bipush          125
	//  504  752:ldc1            #49  <Int -109>
	//  505  754:bastore         
	//  506  755:dup             
	//  507  756:bipush          126
	//  508  758:ldc1            #50  <Int -108>
	//  509  760:bastore         
	//  510  761:dup             
	//  511  762:bipush          127
	//  512  764:ldc1            #51  <Int -107>
	//  513  766:bastore         
	//  514  767:dup             
	//  515  768:sipush          128
	//  516  771:ldc1            #52  <Int -127>
	//  517  773:bastore         
	//  518  774:dup             
	//  519  775:sipush          129
	//  520  778:ldc1            #53  <Int -126>
	//  521  780:bastore         
	//  522  781:dup             
	//  523  782:sipush          130
	//  524  785:ldc1            #54  <Int -125>
	//  525  787:bastore         
	//  526  788:dup             
	//  527  789:sipush          131
	//  528  792:ldc1            #55  <Int -124>
	//  529  794:bastore         
	//  530  795:dup             
	//  531  796:sipush          132
	//  532  799:ldc1            #56  <Int -123>
	//  533  801:bastore         
	//  534  802:dup             
	//  535  803:sipush          133
	//  536  806:ldc1            #57  <Int -122>
	//  537  808:bastore         
	//  538  809:dup             
	//  539  810:sipush          134
	//  540  813:ldc1            #58  <Int -121>
	//  541  815:bastore         
	//  542  816:dup             
	//  543  817:sipush          135
	//  544  820:ldc1            #59  <Int -120>
	//  545  822:bastore         
	//  546  823:dup             
	//  547  824:sipush          136
	//  548  827:ldc1            #60  <Int -119>
	//  549  829:bastore         
	//  550  830:dup             
	//  551  831:sipush          137
	//  552  834:ldc1            #61  <Int -118>
	//  553  836:bastore         
	//  554  837:dup             
	//  555  838:sipush          138
	//  556  841:ldc1            #42  <Int -116>
	//  557  843:bastore         
	//  558  844:dup             
	//  559  845:sipush          139
	//  560  848:ldc1            #43  <Int -115>
	//  561  850:bastore         
	//  562  851:dup             
	//  563  852:sipush          140
	//  564  855:ldc1            #44  <Int -114>
	//  565  857:bastore         
	//  566  858:dup             
	//  567  859:sipush          141
	//  568  862:ldc1            #45  <Int -113>
	//  569  864:bastore         
	//  570  865:dup             
	//  571  866:sipush          142
	//  572  869:ldc1            #46  <Int -112>
	//  573  871:bastore         
	//  574  872:dup             
	//  575  873:sipush          143
	//  576  876:ldc1            #47  <Int -111>
	//  577  878:bastore         
	//  578  879:dup             
	//  579  880:sipush          144
	//  580  883:ldc1            #48  <Int -110>
	//  581  885:bastore         
	//  582  886:dup             
	//  583  887:sipush          145
	//  584  890:ldc1            #49  <Int -109>
	//  585  892:bastore         
	//  586  893:dup             
	//  587  894:sipush          146
	//  588  897:ldc1            #50  <Int -108>
	//  589  899:bastore         
	//  590  900:dup             
	//  591  901:sipush          147
	//  592  904:ldc1            #51  <Int -107>
	//  593  906:bastore         
	//  594  907:dup             
	//  595  908:sipush          148
	//  596  911:ldc1            #62  <Int -24>
	//  597  913:bastore         
	//  598  914:dup             
	//  599  915:sipush          149
	//  600  918:ldc1            #14  <Int 0>
	//  601  920:bastore         
	//  602  921:dup             
	//  603  922:sipush          150
	//  604  925:ldc1            #14  <Int 0>
	//  605  927:bastore         
	//  606  928:dup             
	//  607  929:sipush          151
	//  608  932:ldc1            #14  <Int 0>
	//  609  934:bastore         
	//  610  935:dup             
	//  611  936:sipush          152
	//  612  939:ldc1            #14  <Int 0>
	//  613  941:bastore         
	//  614  942:dup             
	//  615  943:sipush          153
	//  616  946:ldc1            #14  <Int 0>
	//  617  948:bastore         
	//  618  949:dup             
	//  619  950:sipush          154
	//  620  953:ldc1            #14  <Int 0>
	//  621  955:bastore         
	//  622  956:dup             
	//  623  957:sipush          155
	//  624  960:ldc1            #14  <Int 0>
	//  625  962:bastore         
	//  626  963:dup             
	//  627  964:sipush          156
	//  628  967:ldc1            #14  <Int 0>
	//  629  969:bastore         
	//  630  970:dup             
	//  631  971:sipush          157
	//  632  974:ldc1            #14  <Int 0>
	//  633  976:bastore         
	//  634  977:dup             
	//  635  978:sipush          158
	//  636  981:ldc1            #14  <Int 0>
	//  637  983:bastore         
	//  638  984:dup             
	//  639  985:sipush          159
	//  640  988:ldc1            #14  <Int 0>
	//  641  990:bastore         
	//  642  991:dup             
	//  643  992:sipush          160
	//  644  995:ldc1            #14  <Int 0>
	//  645  997:bastore         
	//  646  998:dup             
	//  647  999:sipush          161
	//  648 1002:ldc1            #62  <Int -24>
	//  649 1004:bastore         
	//  650 1005:dup             
	//  651 1006:sipush          162
	//  652 1009:ldc1            #63  <Int -40>
	//  653 1011:bastore         
	//  654 1012:dup             
	//  655 1013:sipush          163
	//  656 1016:ldc1            #14  <Int 0>
	//  657 1018:bastore         
	//  658 1019:dup             
	//  659 1020:sipush          164
	//  660 1023:ldc1            #14  <Int 0>
	//  661 1025:bastore         
	//  662 1026:dup             
	//  663 1027:sipush          165
	//  664 1030:ldc1            #64  <Int -60>
	//  665 1032:bastore         
	//  666 1033:dup             
	//  667 1034:sipush          166
	//  668 1037:ldc1            #65  <Int -58>
	//  669 1039:bastore         
	//  670 1040:dup             
	//  671 1041:sipush          167
	//  672 1044:ldc1            #14  <Int 0>
	//  673 1046:bastore         
	//  674 1047:dup             
	//  675 1048:sipush          168
	//  676 1051:ldc1            #14  <Int 0>
	//  677 1053:bastore         
	//  678 1054:dup             
	//  679 1055:sipush          169
	//  680 1058:ldc1            #66  <Int -16>
	//  681 1060:bastore         
	//  682 1061:dup             
	//  683 1062:sipush          170
	//  684 1065:ldc1            #14  <Int 0>
	//  685 1067:bastore         
	//  686 1068:dup             
	//  687 1069:sipush          171
	//  688 1072:ldc1            #14  <Int 0>
	//  689 1074:bastore         
	//  690 1075:dup             
	//  691 1076:sipush          172
	//  692 1079:ldc1            #14  <Int 0>
	//  693 1081:bastore         
	//  694 1082:dup             
	//  695 1083:sipush          173
	//  696 1086:ldc1            #14  <Int 0>
	//  697 1088:bastore         
	//  698 1089:dup             
	//  699 1090:sipush          174
	//  700 1093:ldc1            #14  <Int 0>
	//  701 1095:bastore         
	//  702 1096:dup             
	//  703 1097:sipush          175
	//  704 1100:ldc1            #14  <Int 0>
	//  705 1102:bastore         
	//  706 1103:dup             
	//  707 1104:sipush          176
	//  708 1107:ldc1            #14  <Int 0>
	//  709 1109:bastore         
	//  710 1110:dup             
	//  711 1111:sipush          177
	//  712 1114:ldc1            #14  <Int 0>
	//  713 1116:bastore         
	//  714 1117:dup             
	//  715 1118:sipush          178
	//  716 1121:ldc1            #14  <Int 0>
	//  717 1123:bastore         
	//  718 1124:dup             
	//  719 1125:sipush          179
	//  720 1128:ldc1            #67  <Int -36>
	//  721 1130:bastore         
	//  722 1131:dup             
	//  723 1132:sipush          180
	//  724 1135:ldc1            #14  <Int 0>
	//  725 1137:bastore         
	//  726 1138:dup             
	//  727 1139:sipush          181
	//  728 1142:ldc1            #14  <Int 0>
	//  729 1144:bastore         
	//  730 1145:dup             
	//  731 1146:sipush          182
	//  732 1149:ldc1            #14  <Int 0>
	//  733 1151:bastore         
	//  734 1152:dup             
	//  735 1153:sipush          183
	//  736 1156:ldc1            #14  <Int 0>
	//  737 1158:bastore         
	//  738 1159:dup             
	//  739 1160:sipush          184
	//  740 1163:ldc1            #14  <Int 0>
	//  741 1165:bastore         
	//  742 1166:dup             
	//  743 1167:sipush          185
	//  744 1170:ldc1            #14  <Int 0>
	//  745 1172:bastore         
	//  746 1173:dup             
	//  747 1174:sipush          186
	//  748 1177:ldc1            #14  <Int 0>
	//  749 1179:bastore         
	//  750 1180:dup             
	//  751 1181:sipush          187
	//  752 1184:ldc1            #14  <Int 0>
	//  753 1186:bastore         
	//  754 1187:dup             
	//  755 1188:sipush          188
	//  756 1191:ldc1            #14  <Int 0>
	//  757 1193:bastore         
	//  758 1194:dup             
	//  759 1195:sipush          189
	//  760 1198:ldc1            #14  <Int 0>
	//  761 1200:bastore         
	//  762 1201:dup             
	//  763 1202:sipush          190
	//  764 1205:ldc1            #14  <Int 0>
	//  765 1207:bastore         
	//  766 1208:putstatic       #69  <Field byte[] table>
	//* 767 1211:return          
	}

	private PdfEncodings$WingdingsConversion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void Object()>
	//    2    4:return          
	}

	PdfEncodings$WingdingsConversion(PdfEncodings._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #75  <Method void PdfEncodings$WingdingsConversion()>
	//    2    4:return          
	}
}
