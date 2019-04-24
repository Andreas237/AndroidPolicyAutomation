// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			ExtraEncoding, PdfEncodings, IntHashtable

private static class PdfEncodings$Cp437Conversion
	implements ExtraEncoding
{

	public String byteToChar(byte abyte0[], String s)
	{
		int i1 = abyte0.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          7
		s = ((String) (new char[i1]));
	//    3    4:iload           7
	//    4    6:newarray        char[]
	//    5    8:astore_2        
		int j = 0;
	//    6    9:iconst_0        
	//    7   10:istore          5
		int i = 0;
	//    8   12:iconst_0        
	//    9   13:istore          4
		while(j < i1) 
	//*  10   15:iload           5
	//*  11   17:iload           7
	//*  12   19:icmpge          105
		{
			int j1 = abyte0[j] & 0xff;
	//   13   22:aload_1         
	//   14   23:iload           5
	//   15   25:baload          
	//   16   26:sipush          255
	//   17   29:iand            
	//   18   30:istore          8
			if(j1 >= 32)
	//*  19   32:iload           8
	//*  20   34:bipush          32
	//*  21   36:icmpge          48
	//*  22   39:iload           5
	//*  23   41:iconst_1        
	//*  24   42:iadd            
	//*  25   43:istore          5
	//*  26   45:goto            15
				if(j1 < 128)
	//*  27   48:iload           8
	//*  28   50:sipush          128
	//*  29   53:icmpge          76
				{
					int k = i + 1;
	//   30   56:iload           4
	//   31   58:iconst_1        
	//   32   59:iadd            
	//   33   60:istore          6
					s[i] = (char)j1;
	//   34   62:aload_2         
	//   35   63:iload           4
	//   36   65:iload           8
	//   37   67:int2char        
	//   38   68:castore         
					i = k;
	//   39   69:iload           6
	//   40   71:istore          4
				} else
	//*  41   73:goto            39
				{
					char c = table[j1 - 128];
	//   42   76:getstatic       #152 <Field char[] table>
	//   43   79:iload           8
	//   44   81:sipush          128
	//   45   84:isub            
	//   46   85:caload          
	//   47   86:istore_3        
					int l = i + 1;
	//   48   87:iload           4
	//   49   89:iconst_1        
	//   50   90:iadd            
	//   51   91:istore          6
					s[i] = c;
	//   52   93:aload_2         
	//   53   94:iload           4
	//   54   96:iload_3         
	//   55   97:castore         
					i = l;
	//   56   98:iload           6
	//   57  100:istore          4
				}
			j++;
		}
	//*  58  102:goto            39
		return new String(((char []) (s)), 0, i);
	//   59  105:new             #164 <Class String>
	//   60  108:dup             
	//   61  109:aload_2         
	//   62  110:iconst_0        
	//   63  111:iload           4
	//   64  113:invokespecial   #167 <Method void String(char[], int, int)>
	//   65  116:areturn         
	}

	public byte[] charToByte(char c, String s)
	{
		if(c < '\200')
	//*   0    0:iload_1         
	//*   1    1:sipush          128
	//*   2    4:icmpge          16
			return (new byte[] {
				(byte)c
			});
	//    3    7:iconst_1        
	//    4    8:newarray        byte[]
	//    5   10:dup             
	//    6   11:iconst_0        
	//    7   12:iload_1         
	//    8   13:int2byte        
	//    9   14:bastore         
	//   10   15:areturn         
		byte byte0 = (byte)c2b.get(((int) (c)));
	//   11   16:getstatic       #22  <Field IntHashtable c2b>
	//   12   19:iload_1         
	//   13   20:invokevirtual   #173 <Method int IntHashtable.get(int)>
	//   14   23:int2byte        
	//   15   24:istore_3        
		if(byte0 != 0)
	//*  16   25:iload_3         
	//*  17   26:ifeq            37
			return (new byte[] {
				byte0
			});
	//   18   29:iconst_1        
	//   19   30:newarray        byte[]
	//   20   32:dup             
	//   21   33:iconst_0        
	//   22   34:iload_3         
	//   23   35:bastore         
	//   24   36:areturn         
		else
			return new byte[0];
	//   25   37:iconst_0        
	//   26   38:newarray        byte[]
	//   27   40:areturn         
	}

	public byte[] charToByte(String s, String s1)
	{
		s1 = ((String) (s.toCharArray()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #178 <Method char[] String.toCharArray()>
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
	//*  16   24:icmpge          99
		{
			char c = s1[j];
	//   17   27:aload_2         
	//   18   28:iload           5
	//   19   30:caload          
	//   20   31:istore          8
			if(c < '\200')
	//*  21   33:iload           8
	//*  22   35:sipush          128
	//*  23   38:icmpge          67
			{
				int k = i + 1;
	//   24   41:iload           4
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore          6
				s[i] = (byte)c;
	//   28   47:aload_1         
	//   29   48:iload           4
	//   30   50:iload           8
	//   31   52:int2byte        
	//   32   53:bastore         
				i = k;
	//   33   54:iload           6
	//   34   56:istore          4
			} else
	//*  35   58:iload           5
	//*  36   60:iconst_1        
	//*  37   61:iadd            
	//*  38   62:istore          5
	//*  39   64:goto            20
			{
				byte byte0 = (byte)c2b.get(((int) (c)));
	//   40   67:getstatic       #22  <Field IntHashtable c2b>
	//   41   70:iload           8
	//   42   72:invokevirtual   #173 <Method int IntHashtable.get(int)>
	//   43   75:int2byte        
	//   44   76:istore_3        
				if(byte0 != 0)
	//*  45   77:iload_3         
	//*  46   78:ifeq            124
				{
					int l = i + 1;
	//   47   81:iload           4
	//   48   83:iconst_1        
	//   49   84:iadd            
	//   50   85:istore          6
					s[i] = byte0;
	//   51   87:aload_1         
	//   52   88:iload           4
	//   53   90:iload_3         
	//   54   91:bastore         
					i = l;
	//   55   92:iload           6
	//   56   94:istore          4
				}
			}
			j++;
		}
	//*  57   96:goto            58
		if(i == i1)
	//*  58   99:iload           4
	//*  59  101:iload           7
	//*  60  103:icmpne          108
		{
			return ((byte []) (s));
	//   61  106:aload_1         
	//   62  107:areturn         
		} else
		{
			s1 = ((String) (new byte[i]));
	//   63  108:iload           4
	//   64  110:newarray        byte[]
	//   65  112:astore_2        
			System.arraycopy(((Object) (s)), 0, ((Object) (s1)), 0, i);
	//   66  113:aload_1         
	//   67  114:iconst_0        
	//   68  115:aload_2         
	//   69  116:iconst_0        
	//   70  117:iload           4
	//   71  119:invokestatic    #184 <Method void System.arraycopy(Object, int, Object, int, int)>
			return ((byte []) (s1));
	//   72  122:aload_2         
	//   73  123:areturn         
		}
	//*  74  124:goto            58
	}

	private static IntHashtable c2b;
	private static final char table[] = {
		'\307', '\374', '\351', '\342', '\344', '\340', '\345', '\347', '\352', '\353', 
		'\350', '\357', '\356', '\354', '\304', '\305', '\311', '\346', '\306', '\364', 
		'\366', '\362', '\373', '\371', '\377', '\326', '\334', '\242', '\243', '\245', 
		'\u20A7', '\u0192', '\341', '\355', '\363', '\372', '\361', '\321', '\252', '\272', 
		'\277', '\u2310', '\254', '\275', '\274', '\241', '\253', '\273', '\u2591', '\u2592', 
		'\u2593', '\u2502', '\u2524', '\u2561', '\u2562', '\u2556', '\u2555', '\u2563', '\u2551', '\u2557', 
		'\u255D', '\u255C', '\u255B', '\u2510', '\u2514', '\u2534', '\u252C', '\u251C', '\u2500', '\u253C', 
		'\u255E', '\u255F', '\u255A', '\u2554', '\u2569', '\u2566', '\u2560', '\u2550', '\u256C', '\u2567', 
		'\u2568', '\u2564', '\u2565', '\u2559', '\u2558', '\u2552', '\u2553', '\u256B', '\u256A', '\u2518', 
		'\u250C', '\u2588', '\u2584', '\u258C', '\u2590', '\u2580', '\u03B1', '\337', '\u0393', '\u03C0', 
		'\u03A3', '\u03C3', '\265', '\u03C4', '\u03A6', '\u0398', '\u03A9', '\u03B4', '\u221E', '\u03C6', 
		'\u03B5', '\u2229', '\u2261', '\261', '\u2265', '\u2264', '\u2320', '\u2321', '\367', '\u2248', 
		'\260', '\u2219', '\267', '\u221A', '\u207F', '\262', '\u25A0', '\240'
	};

	static 
	{
		c2b = new IntHashtable();
	//    0    0:new             #17  <Class IntHashtable>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void IntHashtable()>
	//    3    7:putstatic       #22  <Field IntHashtable c2b>
	//    4   10:sipush          128
	//    5   13:newarray        char[]
	//    6   15:dup             
	//    7   16:iconst_0        
	//    8   17:ldc1            #23  <Int 199>
	//    9   19:castore         
	//   10   20:dup             
	//   11   21:iconst_1        
	//   12   22:ldc1            #24  <Int 252>
	//   13   24:castore         
	//   14   25:dup             
	//   15   26:iconst_2        
	//   16   27:ldc1            #25  <Int 233>
	//   17   29:castore         
	//   18   30:dup             
	//   19   31:iconst_3        
	//   20   32:ldc1            #26  <Int 226>
	//   21   34:castore         
	//   22   35:dup             
	//   23   36:iconst_4        
	//   24   37:ldc1            #27  <Int 228>
	//   25   39:castore         
	//   26   40:dup             
	//   27   41:iconst_5        
	//   28   42:ldc1            #28  <Int 224>
	//   29   44:castore         
	//   30   45:dup             
	//   31   46:bipush          6
	//   32   48:ldc1            #29  <Int 229>
	//   33   50:castore         
	//   34   51:dup             
	//   35   52:bipush          7
	//   36   54:ldc1            #30  <Int 231>
	//   37   56:castore         
	//   38   57:dup             
	//   39   58:bipush          8
	//   40   60:ldc1            #31  <Int 234>
	//   41   62:castore         
	//   42   63:dup             
	//   43   64:bipush          9
	//   44   66:ldc1            #32  <Int 235>
	//   45   68:castore         
	//   46   69:dup             
	//   47   70:bipush          10
	//   48   72:ldc1            #33  <Int 232>
	//   49   74:castore         
	//   50   75:dup             
	//   51   76:bipush          11
	//   52   78:ldc1            #34  <Int 239>
	//   53   80:castore         
	//   54   81:dup             
	//   55   82:bipush          12
	//   56   84:ldc1            #35  <Int 238>
	//   57   86:castore         
	//   58   87:dup             
	//   59   88:bipush          13
	//   60   90:ldc1            #36  <Int 236>
	//   61   92:castore         
	//   62   93:dup             
	//   63   94:bipush          14
	//   64   96:ldc1            #37  <Int 196>
	//   65   98:castore         
	//   66   99:dup             
	//   67  100:bipush          15
	//   68  102:ldc1            #38  <Int 197>
	//   69  104:castore         
	//   70  105:dup             
	//   71  106:bipush          16
	//   72  108:ldc1            #39  <Int 201>
	//   73  110:castore         
	//   74  111:dup             
	//   75  112:bipush          17
	//   76  114:ldc1            #40  <Int 230>
	//   77  116:castore         
	//   78  117:dup             
	//   79  118:bipush          18
	//   80  120:ldc1            #41  <Int 198>
	//   81  122:castore         
	//   82  123:dup             
	//   83  124:bipush          19
	//   84  126:ldc1            #42  <Int 244>
	//   85  128:castore         
	//   86  129:dup             
	//   87  130:bipush          20
	//   88  132:ldc1            #43  <Int 246>
	//   89  134:castore         
	//   90  135:dup             
	//   91  136:bipush          21
	//   92  138:ldc1            #44  <Int 242>
	//   93  140:castore         
	//   94  141:dup             
	//   95  142:bipush          22
	//   96  144:ldc1            #45  <Int 251>
	//   97  146:castore         
	//   98  147:dup             
	//   99  148:bipush          23
	//  100  150:ldc1            #46  <Int 249>
	//  101  152:castore         
	//  102  153:dup             
	//  103  154:bipush          24
	//  104  156:ldc1            #47  <Int 255>
	//  105  158:castore         
	//  106  159:dup             
	//  107  160:bipush          25
	//  108  162:ldc1            #48  <Int 214>
	//  109  164:castore         
	//  110  165:dup             
	//  111  166:bipush          26
	//  112  168:ldc1            #49  <Int 220>
	//  113  170:castore         
	//  114  171:dup             
	//  115  172:bipush          27
	//  116  174:ldc1            #50  <Int 162>
	//  117  176:castore         
	//  118  177:dup             
	//  119  178:bipush          28
	//  120  180:ldc1            #51  <Int 163>
	//  121  182:castore         
	//  122  183:dup             
	//  123  184:bipush          29
	//  124  186:ldc1            #52  <Int 165>
	//  125  188:castore         
	//  126  189:dup             
	//  127  190:bipush          30
	//  128  192:ldc1            #53  <Int 8359>
	//  129  194:castore         
	//  130  195:dup             
	//  131  196:bipush          31
	//  132  198:ldc1            #54  <Int 402>
	//  133  200:castore         
	//  134  201:dup             
	//  135  202:bipush          32
	//  136  204:ldc1            #55  <Int 225>
	//  137  206:castore         
	//  138  207:dup             
	//  139  208:bipush          33
	//  140  210:ldc1            #56  <Int 237>
	//  141  212:castore         
	//  142  213:dup             
	//  143  214:bipush          34
	//  144  216:ldc1            #57  <Int 243>
	//  145  218:castore         
	//  146  219:dup             
	//  147  220:bipush          35
	//  148  222:ldc1            #58  <Int 250>
	//  149  224:castore         
	//  150  225:dup             
	//  151  226:bipush          36
	//  152  228:ldc1            #59  <Int 241>
	//  153  230:castore         
	//  154  231:dup             
	//  155  232:bipush          37
	//  156  234:ldc1            #60  <Int 209>
	//  157  236:castore         
	//  158  237:dup             
	//  159  238:bipush          38
	//  160  240:ldc1            #61  <Int 170>
	//  161  242:castore         
	//  162  243:dup             
	//  163  244:bipush          39
	//  164  246:ldc1            #62  <Int 186>
	//  165  248:castore         
	//  166  249:dup             
	//  167  250:bipush          40
	//  168  252:ldc1            #63  <Int 191>
	//  169  254:castore         
	//  170  255:dup             
	//  171  256:bipush          41
	//  172  258:ldc1            #64  <Int 8976>
	//  173  260:castore         
	//  174  261:dup             
	//  175  262:bipush          42
	//  176  264:ldc1            #65  <Int 172>
	//  177  266:castore         
	//  178  267:dup             
	//  179  268:bipush          43
	//  180  270:ldc1            #66  <Int 189>
	//  181  272:castore         
	//  182  273:dup             
	//  183  274:bipush          44
	//  184  276:ldc1            #67  <Int 188>
	//  185  278:castore         
	//  186  279:dup             
	//  187  280:bipush          45
	//  188  282:ldc1            #68  <Int 161>
	//  189  284:castore         
	//  190  285:dup             
	//  191  286:bipush          46
	//  192  288:ldc1            #69  <Int 171>
	//  193  290:castore         
	//  194  291:dup             
	//  195  292:bipush          47
	//  196  294:ldc1            #70  <Int 187>
	//  197  296:castore         
	//  198  297:dup             
	//  199  298:bipush          48
	//  200  300:ldc1            #71  <Int 9617>
	//  201  302:castore         
	//  202  303:dup             
	//  203  304:bipush          49
	//  204  306:ldc1            #72  <Int 9618>
	//  205  308:castore         
	//  206  309:dup             
	//  207  310:bipush          50
	//  208  312:ldc1            #73  <Int 9619>
	//  209  314:castore         
	//  210  315:dup             
	//  211  316:bipush          51
	//  212  318:ldc1            #74  <Int 9474>
	//  213  320:castore         
	//  214  321:dup             
	//  215  322:bipush          52
	//  216  324:ldc1            #75  <Int 9508>
	//  217  326:castore         
	//  218  327:dup             
	//  219  328:bipush          53
	//  220  330:ldc1            #76  <Int 9569>
	//  221  332:castore         
	//  222  333:dup             
	//  223  334:bipush          54
	//  224  336:ldc1            #77  <Int 9570>
	//  225  338:castore         
	//  226  339:dup             
	//  227  340:bipush          55
	//  228  342:ldc1            #78  <Int 9558>
	//  229  344:castore         
	//  230  345:dup             
	//  231  346:bipush          56
	//  232  348:ldc1            #79  <Int 9557>
	//  233  350:castore         
	//  234  351:dup             
	//  235  352:bipush          57
	//  236  354:ldc1            #80  <Int 9571>
	//  237  356:castore         
	//  238  357:dup             
	//  239  358:bipush          58
	//  240  360:ldc1            #81  <Int 9553>
	//  241  362:castore         
	//  242  363:dup             
	//  243  364:bipush          59
	//  244  366:ldc1            #82  <Int 9559>
	//  245  368:castore         
	//  246  369:dup             
	//  247  370:bipush          60
	//  248  372:ldc1            #83  <Int 9565>
	//  249  374:castore         
	//  250  375:dup             
	//  251  376:bipush          61
	//  252  378:ldc1            #84  <Int 9564>
	//  253  380:castore         
	//  254  381:dup             
	//  255  382:bipush          62
	//  256  384:ldc1            #85  <Int 9563>
	//  257  386:castore         
	//  258  387:dup             
	//  259  388:bipush          63
	//  260  390:ldc1            #86  <Int 9488>
	//  261  392:castore         
	//  262  393:dup             
	//  263  394:bipush          64
	//  264  396:ldc1            #87  <Int 9492>
	//  265  398:castore         
	//  266  399:dup             
	//  267  400:bipush          65
	//  268  402:ldc1            #88  <Int 9524>
	//  269  404:castore         
	//  270  405:dup             
	//  271  406:bipush          66
	//  272  408:ldc1            #89  <Int 9516>
	//  273  410:castore         
	//  274  411:dup             
	//  275  412:bipush          67
	//  276  414:ldc1            #90  <Int 9500>
	//  277  416:castore         
	//  278  417:dup             
	//  279  418:bipush          68
	//  280  420:ldc1            #91  <Int 9472>
	//  281  422:castore         
	//  282  423:dup             
	//  283  424:bipush          69
	//  284  426:ldc1            #92  <Int 9532>
	//  285  428:castore         
	//  286  429:dup             
	//  287  430:bipush          70
	//  288  432:ldc1            #93  <Int 9566>
	//  289  434:castore         
	//  290  435:dup             
	//  291  436:bipush          71
	//  292  438:ldc1            #94  <Int 9567>
	//  293  440:castore         
	//  294  441:dup             
	//  295  442:bipush          72
	//  296  444:ldc1            #95  <Int 9562>
	//  297  446:castore         
	//  298  447:dup             
	//  299  448:bipush          73
	//  300  450:ldc1            #96  <Int 9556>
	//  301  452:castore         
	//  302  453:dup             
	//  303  454:bipush          74
	//  304  456:ldc1            #97  <Int 9577>
	//  305  458:castore         
	//  306  459:dup             
	//  307  460:bipush          75
	//  308  462:ldc1            #98  <Int 9574>
	//  309  464:castore         
	//  310  465:dup             
	//  311  466:bipush          76
	//  312  468:ldc1            #99  <Int 9568>
	//  313  470:castore         
	//  314  471:dup             
	//  315  472:bipush          77
	//  316  474:ldc1            #100 <Int 9552>
	//  317  476:castore         
	//  318  477:dup             
	//  319  478:bipush          78
	//  320  480:ldc1            #101 <Int 9580>
	//  321  482:castore         
	//  322  483:dup             
	//  323  484:bipush          79
	//  324  486:ldc1            #102 <Int 9575>
	//  325  488:castore         
	//  326  489:dup             
	//  327  490:bipush          80
	//  328  492:ldc1            #103 <Int 9576>
	//  329  494:castore         
	//  330  495:dup             
	//  331  496:bipush          81
	//  332  498:ldc1            #104 <Int 9572>
	//  333  500:castore         
	//  334  501:dup             
	//  335  502:bipush          82
	//  336  504:ldc1            #105 <Int 9573>
	//  337  506:castore         
	//  338  507:dup             
	//  339  508:bipush          83
	//  340  510:ldc1            #106 <Int 9561>
	//  341  512:castore         
	//  342  513:dup             
	//  343  514:bipush          84
	//  344  516:ldc1            #107 <Int 9560>
	//  345  518:castore         
	//  346  519:dup             
	//  347  520:bipush          85
	//  348  522:ldc1            #108 <Int 9554>
	//  349  524:castore         
	//  350  525:dup             
	//  351  526:bipush          86
	//  352  528:ldc1            #109 <Int 9555>
	//  353  530:castore         
	//  354  531:dup             
	//  355  532:bipush          87
	//  356  534:ldc1            #110 <Int 9579>
	//  357  536:castore         
	//  358  537:dup             
	//  359  538:bipush          88
	//  360  540:ldc1            #111 <Int 9578>
	//  361  542:castore         
	//  362  543:dup             
	//  363  544:bipush          89
	//  364  546:ldc1            #112 <Int 9496>
	//  365  548:castore         
	//  366  549:dup             
	//  367  550:bipush          90
	//  368  552:ldc1            #113 <Int 9484>
	//  369  554:castore         
	//  370  555:dup             
	//  371  556:bipush          91
	//  372  558:ldc1            #114 <Int 9608>
	//  373  560:castore         
	//  374  561:dup             
	//  375  562:bipush          92
	//  376  564:ldc1            #115 <Int 9604>
	//  377  566:castore         
	//  378  567:dup             
	//  379  568:bipush          93
	//  380  570:ldc1            #116 <Int 9612>
	//  381  572:castore         
	//  382  573:dup             
	//  383  574:bipush          94
	//  384  576:ldc1            #117 <Int 9616>
	//  385  578:castore         
	//  386  579:dup             
	//  387  580:bipush          95
	//  388  582:ldc1            #118 <Int 9600>
	//  389  584:castore         
	//  390  585:dup             
	//  391  586:bipush          96
	//  392  588:ldc1            #119 <Int 945>
	//  393  590:castore         
	//  394  591:dup             
	//  395  592:bipush          97
	//  396  594:ldc1            #120 <Int 223>
	//  397  596:castore         
	//  398  597:dup             
	//  399  598:bipush          98
	//  400  600:ldc1            #121 <Int 915>
	//  401  602:castore         
	//  402  603:dup             
	//  403  604:bipush          99
	//  404  606:ldc1            #122 <Int 960>
	//  405  608:castore         
	//  406  609:dup             
	//  407  610:bipush          100
	//  408  612:ldc1            #123 <Int 931>
	//  409  614:castore         
	//  410  615:dup             
	//  411  616:bipush          101
	//  412  618:ldc1            #124 <Int 963>
	//  413  620:castore         
	//  414  621:dup             
	//  415  622:bipush          102
	//  416  624:ldc1            #125 <Int 181>
	//  417  626:castore         
	//  418  627:dup             
	//  419  628:bipush          103
	//  420  630:ldc1            #126 <Int 964>
	//  421  632:castore         
	//  422  633:dup             
	//  423  634:bipush          104
	//  424  636:ldc1            #127 <Int 934>
	//  425  638:castore         
	//  426  639:dup             
	//  427  640:bipush          105
	//  428  642:ldc1            #128 <Int 920>
	//  429  644:castore         
	//  430  645:dup             
	//  431  646:bipush          106
	//  432  648:ldc1            #129 <Int 937>
	//  433  650:castore         
	//  434  651:dup             
	//  435  652:bipush          107
	//  436  654:ldc1            #130 <Int 948>
	//  437  656:castore         
	//  438  657:dup             
	//  439  658:bipush          108
	//  440  660:ldc1            #131 <Int 8734>
	//  441  662:castore         
	//  442  663:dup             
	//  443  664:bipush          109
	//  444  666:ldc1            #132 <Int 966>
	//  445  668:castore         
	//  446  669:dup             
	//  447  670:bipush          110
	//  448  672:ldc1            #133 <Int 949>
	//  449  674:castore         
	//  450  675:dup             
	//  451  676:bipush          111
	//  452  678:ldc1            #134 <Int 8745>
	//  453  680:castore         
	//  454  681:dup             
	//  455  682:bipush          112
	//  456  684:ldc1            #135 <Int 8801>
	//  457  686:castore         
	//  458  687:dup             
	//  459  688:bipush          113
	//  460  690:ldc1            #136 <Int 177>
	//  461  692:castore         
	//  462  693:dup             
	//  463  694:bipush          114
	//  464  696:ldc1            #137 <Int 8805>
	//  465  698:castore         
	//  466  699:dup             
	//  467  700:bipush          115
	//  468  702:ldc1            #138 <Int 8804>
	//  469  704:castore         
	//  470  705:dup             
	//  471  706:bipush          116
	//  472  708:ldc1            #139 <Int 8992>
	//  473  710:castore         
	//  474  711:dup             
	//  475  712:bipush          117
	//  476  714:ldc1            #140 <Int 8993>
	//  477  716:castore         
	//  478  717:dup             
	//  479  718:bipush          118
	//  480  720:ldc1            #141 <Int 247>
	//  481  722:castore         
	//  482  723:dup             
	//  483  724:bipush          119
	//  484  726:ldc1            #142 <Int 8776>
	//  485  728:castore         
	//  486  729:dup             
	//  487  730:bipush          120
	//  488  732:ldc1            #143 <Int 176>
	//  489  734:castore         
	//  490  735:dup             
	//  491  736:bipush          121
	//  492  738:ldc1            #144 <Int 8729>
	//  493  740:castore         
	//  494  741:dup             
	//  495  742:bipush          122
	//  496  744:ldc1            #145 <Int 183>
	//  497  746:castore         
	//  498  747:dup             
	//  499  748:bipush          123
	//  500  750:ldc1            #146 <Int 8730>
	//  501  752:castore         
	//  502  753:dup             
	//  503  754:bipush          124
	//  504  756:ldc1            #147 <Int 8319>
	//  505  758:castore         
	//  506  759:dup             
	//  507  760:bipush          125
	//  508  762:ldc1            #148 <Int 178>
	//  509  764:castore         
	//  510  765:dup             
	//  511  766:bipush          126
	//  512  768:ldc1            #149 <Int 9632>
	//  513  770:castore         
	//  514  771:dup             
	//  515  772:bipush          127
	//  516  774:ldc1            #150 <Int 160>
	//  517  776:castore         
	//  518  777:putstatic       #152 <Field char[] table>
		for(int i = 0; i < table.length; i++)
	//* 519  780:iconst_0        
	//* 520  781:istore_0        
	//* 521  782:iload_0         
	//* 522  783:getstatic       #152 <Field char[] table>
	//* 523  786:arraylength     
	//* 524  787:icmpge          814
			c2b.put(((int) (table[i])), i + 128);
	//  525  790:getstatic       #22  <Field IntHashtable c2b>
	//  526  793:getstatic       #152 <Field char[] table>
	//  527  796:iload_0         
	//  528  797:caload          
	//  529  798:iload_0         
	//  530  799:sipush          128
	//  531  802:iadd            
	//  532  803:invokevirtual   #156 <Method int IntHashtable.put(int, int)>
	//  533  806:pop             

	//  534  807:iload_0         
	//  535  808:iconst_1        
	//  536  809:iadd            
	//  537  810:istore_0        
	//* 538  811:goto            782
	//* 539  814:return          
	}

	private PdfEncodings$Cp437Conversion()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #158 <Method void Object()>
	//    2    4:return          
	}

	PdfEncodings$Cp437Conversion(PdfEncodings._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method void PdfEncodings$Cp437Conversion()>
	//    2    4:return          
	}
}
