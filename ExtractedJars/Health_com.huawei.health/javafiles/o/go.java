// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;


public final class go
{

	public go()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	public static String b(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = abyte0.length * 8;
	//    4    6:aload_0         
	//    5    7:arraylength     
	//    6    8:bipush          8
	//    7   10:imul            
	//    8   11:istore_1        
		if(i == 0)
	//*   9   12:iload_1         
	//*  10   13:ifne            19
			return "";
	//   11   16:ldc1            #22  <String "">
	//   12   18:areturn         
		int i2 = i % 24;
	//   13   19:iload_1         
	//   14   20:bipush          24
	//   15   22:irem            
	//   16   23:istore          8
		int j1 = i / 24;
	//   17   25:iload_1         
	//   18   26:bipush          24
	//   19   28:idiv            
	//   20   29:istore          6
		if(i2 != 0)
	//*  21   31:iload           8
	//*  22   33:ifeq            44
			i = j1 + 1;
	//   23   36:iload           6
	//   24   38:iconst_1        
	//   25   39:iadd            
	//   26   40:istore_1        
		else
	//*  27   41:goto            47
			i = j1;
	//   28   44:iload           6
	//   29   46:istore_1        
		char ac[] = new char[i * 4];
	//   30   47:iload_1         
	//   31   48:iconst_4        
	//   32   49:imul            
	//   33   50:newarray        char[]
	//   34   52:astore          13
		i = 0;
	//   35   54:iconst_0        
	//   36   55:istore_1        
		byte byte2 = 0;
	//   37   56:iconst_0        
	//   38   57:istore_3        
		for(int j = 0; j < j1;)
	//*  39   58:iconst_0        
	//*  40   59:istore_2        
	//*  41   60:iload_2         
	//*  42   61:iload           6
	//*  43   63:icmpge          278
		{
			int k = byte2 + 1;
	//   44   66:iload_3         
	//   45   67:iconst_1        
	//   46   68:iadd            
	//   47   69:istore          4
			byte2 = abyte0[byte2];
	//   48   71:aload_0         
	//   49   72:iload_3         
	//   50   73:baload          
	//   51   74:istore_3        
			int i1 = k + 1;
	//   52   75:iload           4
	//   53   77:iconst_1        
	//   54   78:iadd            
	//   55   79:istore          5
			k = ((int) (abyte0[k]));
	//   56   81:aload_0         
	//   57   82:iload           4
	//   58   84:baload          
	//   59   85:istore          4
			int l1 = i1 + 1;
	//   60   87:iload           5
	//   61   89:iconst_1        
	//   62   90:iadd            
	//   63   91:istore          7
			byte byte5 = abyte0[i1];
	//   64   93:aload_0         
	//   65   94:iload           5
	//   66   96:baload          
	//   67   97:istore          9
			byte byte6 = (byte)(k & 0xf);
	//   68   99:iload           4
	//   69  101:bipush          15
	//   70  103:iand            
	//   71  104:int2byte        
	//   72  105:istore          10
			byte byte7 = (byte)(byte2 & 3);
	//   73  107:iload_3         
	//   74  108:iconst_3        
	//   75  109:iand            
	//   76  110:int2byte        
	//   77  111:istore          11
			if((byte2 & 0xffffff80) == 0)
	//*  78  113:iload_3         
	//*  79  114:bipush          -128
	//*  80  116:iand            
	//*  81  117:ifne            128
				byte2 >>= 2;
	//   82  120:iload_3         
	//   83  121:iconst_2        
	//   84  122:ishr            
	//   85  123:int2byte        
	//   86  124:istore_3        
			else
	//*  87  125:goto            137
				byte2 = (byte)(byte2 >> 2 ^ 0xc0);
	//   88  128:iload_3         
	//   89  129:iconst_2        
	//   90  130:ishr            
	//   91  131:sipush          192
	//   92  134:ixor            
	//   93  135:int2byte        
	//   94  136:istore_3        
			if((k & 0xffffff80) == 0)
	//*  95  137:iload           4
	//*  96  139:bipush          -128
	//*  97  141:iand            
	//*  98  142:ifne            155
				k >>= 4;
	//   99  145:iload           4
	//  100  147:iconst_4        
	//  101  148:ishr            
	//  102  149:int2byte        
	//  103  150:istore          4
			else
	//* 104  152:goto            166
				k = ((int) ((byte)(k >> 4 ^ 0xf0)));
	//  105  155:iload           4
	//  106  157:iconst_4        
	//  107  158:ishr            
	//  108  159:sipush          240
	//  109  162:ixor            
	//  110  163:int2byte        
	//  111  164:istore          4
			if((byte5 & 0xffffff80) == 0)
	//* 112  166:iload           9
	//* 113  168:bipush          -128
	//* 114  170:iand            
	//* 115  171:ifne            185
				i1 = ((int) ((byte)(byte5 >> 6)));
	//  116  174:iload           9
	//  117  176:bipush          6
	//  118  178:ishr            
	//  119  179:int2byte        
	//  120  180:istore          5
			else
	//* 121  182:goto            197
				i1 = ((int) ((byte)(byte5 >> 6 ^ 0xfc)));
	//  122  185:iload           9
	//  123  187:bipush          6
	//  124  189:ishr            
	//  125  190:sipush          252
	//  126  193:ixor            
	//  127  194:int2byte        
	//  128  195:istore          5
			int j2 = i + 1;
	//  129  197:iload_1         
	//  130  198:iconst_1        
	//  131  199:iadd            
	//  132  200:istore          12
			ac[i] = c[byte2];
	//  133  202:aload           13
	//  134  204:iload_1         
	//  135  205:getstatic       #14  <Field char[] c>
	//  136  208:iload_3         
	//  137  209:caload          
	//  138  210:castore         
			i = j2 + 1;
	//  139  211:iload           12
	//  140  213:iconst_1        
	//  141  214:iadd            
	//  142  215:istore_1        
			ac[j2] = c[byte7 << 4 | k];
	//  143  216:aload           13
	//  144  218:iload           12
	//  145  220:getstatic       #14  <Field char[] c>
	//  146  223:iload           11
	//  147  225:iconst_4        
	//  148  226:ishl            
	//  149  227:iload           4
	//  150  229:ior             
	//  151  230:caload          
	//  152  231:castore         
			byte2 = ((byte) (i + 1));
	//  153  232:iload_1         
	//  154  233:iconst_1        
	//  155  234:iadd            
	//  156  235:istore_3        
			ac[i] = c[byte6 << 2 | i1];
	//  157  236:aload           13
	//  158  238:iload_1         
	//  159  239:getstatic       #14  <Field char[] c>
	//  160  242:iload           10
	//  161  244:iconst_2        
	//  162  245:ishl            
	//  163  246:iload           5
	//  164  248:ior             
	//  165  249:caload          
	//  166  250:castore         
			i = byte2 + 1;
	//  167  251:iload_3         
	//  168  252:iconst_1        
	//  169  253:iadd            
	//  170  254:istore_1        
			ac[byte2] = c[byte5 & 0x3f];
	//  171  255:aload           13
	//  172  257:iload_3         
	//  173  258:getstatic       #14  <Field char[] c>
	//  174  261:iload           9
	//  175  263:bipush          63
	//  176  265:iand            
	//  177  266:caload          
	//  178  267:castore         
			j++;
	//  179  268:iload_2         
	//  180  269:iconst_1        
	//  181  270:iadd            
	//  182  271:istore_2        
			byte2 = ((byte) (l1));
	//  183  272:iload           7
	//  184  274:istore_3        
		}

	//* 185  275:goto            60
		if(i2 == 8)
	//* 186  278:iload           8
	//* 187  280:bipush          8
	//* 188  282:icmpne          366
		{
			byte byte0 = abyte0[byte2];
	//  189  285:aload_0         
	//  190  286:iload_3         
	//  191  287:baload          
	//  192  288:istore_2        
			byte2 = (byte)(byte0 & 3);
	//  193  289:iload_2         
	//  194  290:iconst_3        
	//  195  291:iand            
	//  196  292:int2byte        
	//  197  293:istore_3        
			if((byte0 & 0xffffff80) == 0)
	//* 198  294:iload_2         
	//* 199  295:bipush          -128
	//* 200  297:iand            
	//* 201  298:ifne            309
				byte0 >>= 2;
	//  202  301:iload_2         
	//  203  302:iconst_2        
	//  204  303:ishr            
	//  205  304:int2byte        
	//  206  305:istore_2        
			else
	//* 207  306:goto            318
				byte0 = (byte)(byte0 >> 2 ^ 0xc0);
	//  208  309:iload_2         
	//  209  310:iconst_2        
	//  210  311:ishr            
	//  211  312:sipush          192
	//  212  315:ixor            
	//  213  316:int2byte        
	//  214  317:istore_2        
			int l = i + 1;
	//  215  318:iload_1         
	//  216  319:iconst_1        
	//  217  320:iadd            
	//  218  321:istore          4
			ac[i] = c[byte0];
	//  219  323:aload           13
	//  220  325:iload_1         
	//  221  326:getstatic       #14  <Field char[] c>
	//  222  329:iload_2         
	//  223  330:caload          
	//  224  331:castore         
			i = l + 1;
	//  225  332:iload           4
	//  226  334:iconst_1        
	//  227  335:iadd            
	//  228  336:istore_1        
			ac[l] = c[byte2 << 4];
	//  229  337:aload           13
	//  230  339:iload           4
	//  231  341:getstatic       #14  <Field char[] c>
	//  232  344:iload_3         
	//  233  345:iconst_4        
	//  234  346:ishl            
	//  235  347:caload          
	//  236  348:castore         
			ac[i] = '=';
	//  237  349:aload           13
	//  238  351:iload_1         
	//  239  352:bipush          61
	//  240  354:castore         
			ac[i + 1] = '=';
	//  241  355:aload           13
	//  242  357:iload_1         
	//  243  358:iconst_1        
	//  244  359:iadd            
	//  245  360:bipush          61
	//  246  362:castore         
		} else
	//* 247  363:goto            498
		if(i2 == 16)
	//* 248  366:iload           8
	//* 249  368:bipush          16
	//* 250  370:icmpne          498
		{
			byte byte1 = abyte0[byte2];
	//  251  373:aload_0         
	//  252  374:iload_3         
	//  253  375:baload          
	//  254  376:istore_2        
			byte2 = abyte0[byte2 + 1];
	//  255  377:aload_0         
	//  256  378:iload_3         
	//  257  379:iconst_1        
	//  258  380:iadd            
	//  259  381:baload          
	//  260  382:istore_3        
			byte byte3 = (byte)(byte2 & 0xf);
	//  261  383:iload_3         
	//  262  384:bipush          15
	//  263  386:iand            
	//  264  387:int2byte        
	//  265  388:istore          4
			byte byte4 = (byte)(byte1 & 3);
	//  266  390:iload_2         
	//  267  391:iconst_3        
	//  268  392:iand            
	//  269  393:int2byte        
	//  270  394:istore          5
			if((byte1 & 0xffffff80) == 0)
	//* 271  396:iload_2         
	//* 272  397:bipush          -128
	//* 273  399:iand            
	//* 274  400:ifne            411
				byte1 >>= 2;
	//  275  403:iload_2         
	//  276  404:iconst_2        
	//  277  405:ishr            
	//  278  406:int2byte        
	//  279  407:istore_2        
			else
	//* 280  408:goto            420
				byte1 = (byte)(byte1 >> 2 ^ 0xc0);
	//  281  411:iload_2         
	//  282  412:iconst_2        
	//  283  413:ishr            
	//  284  414:sipush          192
	//  285  417:ixor            
	//  286  418:int2byte        
	//  287  419:istore_2        
			if((byte2 & 0xffffff80) == 0)
	//* 288  420:iload_3         
	//* 289  421:bipush          -128
	//* 290  423:iand            
	//* 291  424:ifne            435
				byte2 >>= 4;
	//  292  427:iload_3         
	//  293  428:iconst_4        
	//  294  429:ishr            
	//  295  430:int2byte        
	//  296  431:istore_3        
			else
	//* 297  432:goto            444
				byte2 = (byte)(byte2 >> 4 ^ 0xf0);
	//  298  435:iload_3         
	//  299  436:iconst_4        
	//  300  437:ishr            
	//  301  438:sipush          240
	//  302  441:ixor            
	//  303  442:int2byte        
	//  304  443:istore_3        
			int k1 = i + 1;
	//  305  444:iload_1         
	//  306  445:iconst_1        
	//  307  446:iadd            
	//  308  447:istore          6
			ac[i] = c[byte1];
	//  309  449:aload           13
	//  310  451:iload_1         
	//  311  452:getstatic       #14  <Field char[] c>
	//  312  455:iload_2         
	//  313  456:caload          
	//  314  457:castore         
			i = k1 + 1;
	//  315  458:iload           6
	//  316  460:iconst_1        
	//  317  461:iadd            
	//  318  462:istore_1        
			ac[k1] = c[byte4 << 4 | byte2];
	//  319  463:aload           13
	//  320  465:iload           6
	//  321  467:getstatic       #14  <Field char[] c>
	//  322  470:iload           5
	//  323  472:iconst_4        
	//  324  473:ishl            
	//  325  474:iload_3         
	//  326  475:ior             
	//  327  476:caload          
	//  328  477:castore         
			ac[i] = c[byte3 << 2];
	//  329  478:aload           13
	//  330  480:iload_1         
	//  331  481:getstatic       #14  <Field char[] c>
	//  332  484:iload           4
	//  333  486:iconst_2        
	//  334  487:ishl            
	//  335  488:caload          
	//  336  489:castore         
			ac[i + 1] = '=';
	//  337  490:aload           13
	//  338  492:iload_1         
	//  339  493:iconst_1        
	//  340  494:iadd            
	//  341  495:bipush          61
	//  342  497:castore         
		}
		return new String(ac);
	//  343  498:new             #24  <Class String>
	//  344  501:dup             
	//  345  502:aload           13
	//  346  504:invokespecial   #27  <Method void String(char[])>
	//  347  507:areturn         
	}

	private static boolean c(char c1)
	{
		return c1 < '\200' && e[c1] != -1;
	//    0    0:iload_0         
	//    1    1:sipush          128
	//    2    4:icmpge          18
	//    3    7:getstatic       #12  <Field byte[] e>
	//    4   10:iload_0         
	//    5   11:baload          
	//    6   12:iconst_m1       
	//    7   13:icmpeq          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public static byte[] c(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		char ac[] = s.toCharArray();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #33  <Method char[] String.toCharArray()>
	//    6   10:astore          14
		int i;
		if(ac == null)
	//*   7   12:aload           14
	//*   8   14:ifnonnull       23
		{
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore          5
		} else
	//*  11   20:goto            123
		{
			i = 0;
	//   12   23:iconst_0        
	//   13   24:istore          5
			int k1 = ac.length;
	//   14   26:aload           14
	//   15   28:arraylength     
	//   16   29:istore          9
			for(int j = 0; j < k1;)
	//*  17   31:iconst_0        
	//*  18   32:istore          6
	//*  19   34:iload           6
	//*  20   36:iload           9
	//*  21   38:icmpge          123
			{
				int l = ((int) (ac[j]));
	//   22   41:aload           14
	//   23   43:iload           6
	//   24   45:caload          
	//   25   46:istore          7
				boolean flag;
				if(l == ' ' || l == '\r' || l == '\n' || l == '\t')
	//*  26   48:iload           7
	//*  27   50:bipush          32
	//*  28   52:icmpeq          76
	//*  29   55:iload           7
	//*  30   57:bipush          13
	//*  31   59:icmpeq          76
	//*  32   62:iload           7
	//*  33   64:bipush          10
	//*  34   66:icmpeq          76
	//*  35   69:iload           7
	//*  36   71:bipush          9
	//*  37   73:icmpne          82
					flag = true;
	//   38   76:iconst_1        
	//   39   77:istore          8
				else
	//*  40   79:goto            85
					flag = false;
	//   41   82:iconst_0        
	//   42   83:istore          8
				l = i;
	//   43   85:iload           5
	//   44   87:istore          7
				if(!flag)
	//*  45   89:iload           8
	//*  46   91:ifne            110
				{
					l = i + 1;
	//   47   94:iload           5
	//   48   96:iconst_1        
	//   49   97:iadd            
	//   50   98:istore          7
					ac[i] = ac[j];
	//   51  100:aload           14
	//   52  102:iload           5
	//   53  104:aload           14
	//   54  106:iload           6
	//   55  108:caload          
	//   56  109:castore         
				}
				j++;
	//   57  110:iload           6
	//   58  112:iconst_1        
	//   59  113:iadd            
	//   60  114:istore          6
				i = l;
	//   61  116:iload           7
	//   62  118:istore          5
			}

		}
	//*  63  120:goto            34
		if(i % 4 != 0)
	//*  64  123:iload           5
	//*  65  125:iconst_4        
	//*  66  126:irem            
	//*  67  127:ifeq            132
			return null;
	//   68  130:aconst_null     
	//   69  131:areturn         
		int j1 = i / 4;
	//   70  132:iload           5
	//   71  134:iconst_4        
	//   72  135:idiv            
	//   73  136:istore          8
		if(j1 == 0)
	//*  74  138:iload           8
	//*  75  140:ifne            147
			return new byte[0];
	//   76  143:iconst_0        
	//   77  144:newarray        byte[]
	//   78  146:areturn         
		int k = 0;
	//   79  147:iconst_0        
	//   80  148:istore          6
		i = 0;
	//   81  150:iconst_0        
	//   82  151:istore          5
		int i1 = 0;
	//   83  153:iconst_0        
	//   84  154:istore          7
		s = ((String) (new byte[j1 * 3]));
	//   85  156:iload           8
	//   86  158:iconst_3        
	//   87  159:imul            
	//   88  160:newarray        byte[]
	//   89  162:astore_0        
label0:
		do
		{
			char c1;
			char c3;
			char c5;
			char c6;
label1:
			{
				if(k >= j1 - 1)
					break label0;
	//   90  163:iload           6
	//   91  165:iload           8
	//   92  167:iconst_1        
	//   93  168:isub            
	//   94  169:icmpge          355
				int l1 = i1 + 1;
	//   95  172:iload           7
	//   96  174:iconst_1        
	//   97  175:iadd            
	//   98  176:istore          9
				c1 = ac[i1];
	//   99  178:aload           14
	//  100  180:iload           7
	//  101  182:caload          
	//  102  183:istore_1        
				if(c(c1))
	//* 103  184:iload_1         
	//* 104  185:invokestatic    #35  <Method boolean c(char)>
	//* 105  188:ifeq            250
				{
					i1 = l1 + 1;
	//  106  191:iload           9
	//  107  193:iconst_1        
	//  108  194:iadd            
	//  109  195:istore          7
					c3 = ac[l1];
	//  110  197:aload           14
	//  111  199:iload           9
	//  112  201:caload          
	//  113  202:istore_2        
					if(c(c3))
	//* 114  203:iload_2         
	//* 115  204:invokestatic    #35  <Method boolean c(char)>
	//* 116  207:ifeq            250
					{
						int i2 = i1 + 1;
	//  117  210:iload           7
	//  118  212:iconst_1        
	//  119  213:iadd            
	//  120  214:istore          9
						c5 = ac[i1];
	//  121  216:aload           14
	//  122  218:iload           7
	//  123  220:caload          
	//  124  221:istore_3        
						if(c(c5))
	//* 125  222:iload_3         
	//* 126  223:invokestatic    #35  <Method boolean c(char)>
	//* 127  226:ifeq            250
						{
							i1 = i2 + 1;
	//  128  229:iload           9
	//  129  231:iconst_1        
	//  130  232:iadd            
	//  131  233:istore          7
							c6 = ac[i2];
	//  132  235:aload           14
	//  133  237:iload           9
	//  134  239:caload          
	//  135  240:istore          4
							if(c(c6))
								break label1;
	//  136  242:iload           4
	//  137  244:invokestatic    #35  <Method boolean c(char)>
	//  138  247:ifne            252
						}
					}
				}
				return null;
	//  139  250:aconst_null     
	//  140  251:areturn         
			}
			int i3 = ((int) (e[c1]));
	//  141  252:getstatic       #12  <Field byte[] e>
	//  142  255:iload_1         
	//  143  256:baload          
	//  144  257:istore          13
			byte byte5 = e[c3];
	//  145  259:getstatic       #12  <Field byte[] e>
	//  146  262:iload_2         
	//  147  263:baload          
	//  148  264:istore          11
			byte byte1 = e[c5];
	//  149  266:getstatic       #12  <Field byte[] e>
	//  150  269:iload_3         
	//  151  270:baload          
	//  152  271:istore          9
			byte byte4 = e[c6];
	//  153  273:getstatic       #12  <Field byte[] e>
	//  154  276:iload           4
	//  155  278:baload          
	//  156  279:istore          10
			int l2 = i + 1;
	//  157  281:iload           5
	//  158  283:iconst_1        
	//  159  284:iadd            
	//  160  285:istore          12
			s[i] = (byte)(i3 << 2 | byte5 >> 4);
	//  161  287:aload_0         
	//  162  288:iload           5
	//  163  290:iload           13
	//  164  292:iconst_2        
	//  165  293:ishl            
	//  166  294:iload           11
	//  167  296:iconst_4        
	//  168  297:ishr            
	//  169  298:ior             
	//  170  299:int2byte        
	//  171  300:bastore         
			i3 = l2 + 1;
	//  172  301:iload           12
	//  173  303:iconst_1        
	//  174  304:iadd            
	//  175  305:istore          13
			s[l2] = (byte)((byte5 & 0xf) << 4 | byte1 >> 2 & 0xf);
	//  176  307:aload_0         
	//  177  308:iload           12
	//  178  310:iload           11
	//  179  312:bipush          15
	//  180  314:iand            
	//  181  315:iconst_4        
	//  182  316:ishl            
	//  183  317:iload           9
	//  184  319:iconst_2        
	//  185  320:ishr            
	//  186  321:bipush          15
	//  187  323:iand            
	//  188  324:ior             
	//  189  325:int2byte        
	//  190  326:bastore         
			i = i3 + 1;
	//  191  327:iload           13
	//  192  329:iconst_1        
	//  193  330:iadd            
	//  194  331:istore          5
			s[i3] = (byte)(byte1 << 6 | byte4);
	//  195  333:aload_0         
	//  196  334:iload           13
	//  197  336:iload           9
	//  198  338:bipush          6
	//  199  340:ishl            
	//  200  341:iload           10
	//  201  343:ior             
	//  202  344:int2byte        
	//  203  345:bastore         
			k++;
	//  204  346:iload           6
	//  205  348:iconst_1        
	//  206  349:iadd            
	//  207  350:istore          6
		} while(true);
	//  208  352:goto            163
		char c2;
		char c4;
		int j2;
label2:
		{
			j1 = i1 + 1;
	//  209  355:iload           7
	//  210  357:iconst_1        
	//  211  358:iadd            
	//  212  359:istore          8
			c2 = ac[i1];
	//  213  361:aload           14
	//  214  363:iload           7
	//  215  365:caload          
	//  216  366:istore_1        
			if(c(c2))
	//* 217  367:iload_1         
	//* 218  368:invokestatic    #35  <Method boolean c(char)>
	//* 219  371:ifeq            393
			{
				j2 = j1 + 1;
	//  220  374:iload           8
	//  221  376:iconst_1        
	//  222  377:iadd            
	//  223  378:istore          9
				c4 = ac[j1];
	//  224  380:aload           14
	//  225  382:iload           8
	//  226  384:caload          
	//  227  385:istore_2        
				if(c(c4))
					break label2;
	//  228  386:iload_2         
	//  229  387:invokestatic    #35  <Method boolean c(char)>
	//  230  390:ifne            395
			}
			return null;
	//  231  393:aconst_null     
	//  232  394:areturn         
		}
		i1 = ((int) (e[c2]));
	//  233  395:getstatic       #12  <Field byte[] e>
	//  234  398:iload_1         
	//  235  399:baload          
	//  236  400:istore          7
		j1 = ((int) (e[c4]));
	//  237  402:getstatic       #12  <Field byte[] e>
	//  238  405:iload_2         
	//  239  406:baload          
	//  240  407:istore          8
		c2 = ac[j2];
	//  241  409:aload           14
	//  242  411:iload           9
	//  243  413:caload          
	//  244  414:istore_1        
		c4 = ac[j2 + 1];
	//  245  415:aload           14
	//  246  417:iload           9
	//  247  419:iconst_1        
	//  248  420:iadd            
	//  249  421:caload          
	//  250  422:istore_2        
		if(!c(c2) || !c(c4))
	//* 251  423:iload_1         
	//* 252  424:invokestatic    #35  <Method boolean c(char)>
	//* 253  427:ifeq            437
	//* 254  430:iload_2         
	//* 255  431:invokestatic    #35  <Method boolean c(char)>
	//* 256  434:ifne            596
		{
			if(e(c2) && e(c4))
	//* 257  437:iload_1         
	//* 258  438:invokestatic    #37  <Method boolean e(char)>
	//* 259  441:ifeq            501
	//* 260  444:iload_2         
	//* 261  445:invokestatic    #37  <Method boolean e(char)>
	//* 262  448:ifeq            501
				if((j1 & 0xf) != 0)
	//* 263  451:iload           8
	//* 264  453:bipush          15
	//* 265  455:iand            
	//* 266  456:ifeq            461
				{
					return null;
	//  267  459:aconst_null     
	//  268  460:areturn         
				} else
				{
					byte abyte0[] = new byte[k * 3 + 1];
	//  269  461:iload           6
	//  270  463:iconst_3        
	//  271  464:imul            
	//  272  465:iconst_1        
	//  273  466:iadd            
	//  274  467:newarray        byte[]
	//  275  469:astore          14
					System.arraycopy(((Object) (s)), 0, ((Object) (abyte0)), 0, k * 3);
	//  276  471:aload_0         
	//  277  472:iconst_0        
	//  278  473:aload           14
	//  279  475:iconst_0        
	//  280  476:iload           6
	//  281  478:iconst_3        
	//  282  479:imul            
	//  283  480:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
					abyte0[i] = (byte)(i1 << 2 | j1 >> 4);
	//  284  483:aload           14
	//  285  485:iload           5
	//  286  487:iload           7
	//  287  489:iconst_2        
	//  288  490:ishl            
	//  289  491:iload           8
	//  290  493:iconst_4        
	//  291  494:ishr            
	//  292  495:ior             
	//  293  496:int2byte        
	//  294  497:bastore         
					return abyte0;
	//  295  498:aload           14
	//  296  500:areturn         
				}
			if(!e(c2) && e(c4))
	//* 297  501:iload_1         
	//* 298  502:invokestatic    #37  <Method boolean e(char)>
	//* 299  505:ifne            594
	//* 300  508:iload_2         
	//* 301  509:invokestatic    #37  <Method boolean e(char)>
	//* 302  512:ifeq            594
			{
				byte byte2 = e[c2];
	//  303  515:getstatic       #12  <Field byte[] e>
	//  304  518:iload_1         
	//  305  519:baload          
	//  306  520:istore          9
				if((byte2 & 3) != 0)
	//* 307  522:iload           9
	//* 308  524:iconst_3        
	//* 309  525:iand            
	//* 310  526:ifeq            531
				{
					return null;
	//  311  529:aconst_null     
	//  312  530:areturn         
				} else
				{
					byte abyte1[] = new byte[k * 3 + 2];
	//  313  531:iload           6
	//  314  533:iconst_3        
	//  315  534:imul            
	//  316  535:iconst_2        
	//  317  536:iadd            
	//  318  537:newarray        byte[]
	//  319  539:astore          14
					System.arraycopy(((Object) (s)), 0, ((Object) (abyte1)), 0, k * 3);
	//  320  541:aload_0         
	//  321  542:iconst_0        
	//  322  543:aload           14
	//  323  545:iconst_0        
	//  324  546:iload           6
	//  325  548:iconst_3        
	//  326  549:imul            
	//  327  550:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
					abyte1[i] = (byte)(i1 << 2 | j1 >> 4);
	//  328  553:aload           14
	//  329  555:iload           5
	//  330  557:iload           7
	//  331  559:iconst_2        
	//  332  560:ishl            
	//  333  561:iload           8
	//  334  563:iconst_4        
	//  335  564:ishr            
	//  336  565:ior             
	//  337  566:int2byte        
	//  338  567:bastore         
					abyte1[i + 1] = (byte)((j1 & 0xf) << 4 | byte2 >> 2 & 0xf);
	//  339  568:aload           14
	//  340  570:iload           5
	//  341  572:iconst_1        
	//  342  573:iadd            
	//  343  574:iload           8
	//  344  576:bipush          15
	//  345  578:iand            
	//  346  579:iconst_4        
	//  347  580:ishl            
	//  348  581:iload           9
	//  349  583:iconst_2        
	//  350  584:ishr            
	//  351  585:bipush          15
	//  352  587:iand            
	//  353  588:ior             
	//  354  589:int2byte        
	//  355  590:bastore         
					return abyte1;
	//  356  591:aload           14
	//  357  593:areturn         
				}
			} else
			{
				return null;
	//  358  594:aconst_null     
	//  359  595:areturn         
			}
		} else
		{
			byte byte0 = e[c2];
	//  360  596:getstatic       #12  <Field byte[] e>
	//  361  599:iload_1         
	//  362  600:baload          
	//  363  601:istore          6
			byte byte3 = e[c4];
	//  364  603:getstatic       #12  <Field byte[] e>
	//  365  606:iload_2         
	//  366  607:baload          
	//  367  608:istore          9
			int k2 = i + 1;
	//  368  610:iload           5
	//  369  612:iconst_1        
	//  370  613:iadd            
	//  371  614:istore          10
			s[i] = (byte)(i1 << 2 | j1 >> 4);
	//  372  616:aload_0         
	//  373  617:iload           5
	//  374  619:iload           7
	//  375  621:iconst_2        
	//  376  622:ishl            
	//  377  623:iload           8
	//  378  625:iconst_4        
	//  379  626:ishr            
	//  380  627:ior             
	//  381  628:int2byte        
	//  382  629:bastore         
			s[k2] = (byte)((j1 & 0xf) << 4 | byte0 >> 2 & 0xf);
	//  383  630:aload_0         
	//  384  631:iload           10
	//  385  633:iload           8
	//  386  635:bipush          15
	//  387  637:iand            
	//  388  638:iconst_4        
	//  389  639:ishl            
	//  390  640:iload           6
	//  391  642:iconst_2        
	//  392  643:ishr            
	//  393  644:bipush          15
	//  394  646:iand            
	//  395  647:ior             
	//  396  648:int2byte        
	//  397  649:bastore         
			s[k2 + 1] = (byte)(byte0 << 6 | byte3);
	//  398  650:aload_0         
	//  399  651:iload           10
	//  400  653:iconst_1        
	//  401  654:iadd            
	//  402  655:iload           6
	//  403  657:bipush          6
	//  404  659:ishl            
	//  405  660:iload           9
	//  406  662:ior             
	//  407  663:int2byte        
	//  408  664:bastore         
			return ((byte []) (s));
	//  409  665:aload_0         
	//  410  666:areturn         
		}
	}

	private static boolean e(char c1)
	{
		return c1 == '=';
	//    0    0:iload_0         
	//    1    1:bipush          61
	//    2    3:icmpne          8
	//    3    6:iconst_1        
	//    4    7:ireturn         
	//    5    8:iconst_0        
	//    6    9:ireturn         
	}

	private static final char c[];
	private static final byte e[];

	static 
	{
		e = new byte[128];
	//    0    0:sipush          128
	//    1    3:newarray        byte[]
	//    2    5:putstatic       #12  <Field byte[] e>
		c = new char[64];
	//    3    8:bipush          64
	//    4   10:newarray        char[]
	//    5   12:putstatic       #14  <Field char[] c>
		for(int i = 0; i < 128; i++)
	//*   6   15:iconst_0        
	//*   7   16:istore_0        
	//*   8   17:iload_0         
	//*   9   18:sipush          128
	//*  10   21:icmpge          37
			e[i] = -1;
	//   11   24:getstatic       #12  <Field byte[] e>
	//   12   27:iload_0         
	//   13   28:iconst_m1       
	//   14   29:bastore         

	//   15   30:iload_0         
	//   16   31:iconst_1        
	//   17   32:iadd            
	//   18   33:istore_0        
	//*  19   34:goto            17
		for(int j = 90; j >= 65; j--)
	//*  20   37:bipush          90
	//*  21   39:istore_0        
	//*  22   40:iload_0         
	//*  23   41:bipush          65
	//*  24   43:icmplt          63
			e[j] = (byte)(j - 65);
	//   25   46:getstatic       #12  <Field byte[] e>
	//   26   49:iload_0         
	//   27   50:iload_0         
	//   28   51:bipush          65
	//   29   53:isub            
	//   30   54:int2byte        
	//   31   55:bastore         

	//   32   56:iload_0         
	//   33   57:iconst_1        
	//   34   58:isub            
	//   35   59:istore_0        
	//*  36   60:goto            40
		for(int k = 122; k >= 97; k--)
	//*  37   63:bipush          122
	//*  38   65:istore_0        
	//*  39   66:iload_0         
	//*  40   67:bipush          97
	//*  41   69:icmplt          92
			e[k] = (byte)((k - 97) + 26);
	//   42   72:getstatic       #12  <Field byte[] e>
	//   43   75:iload_0         
	//   44   76:iload_0         
	//   45   77:bipush          97
	//   46   79:isub            
	//   47   80:bipush          26
	//   48   82:iadd            
	//   49   83:int2byte        
	//   50   84:bastore         

	//   51   85:iload_0         
	//   52   86:iconst_1        
	//   53   87:isub            
	//   54   88:istore_0        
	//*  55   89:goto            66
		for(int l = 57; l >= 48; l--)
	//*  56   92:bipush          57
	//*  57   94:istore_0        
	//*  58   95:iload_0         
	//*  59   96:bipush          48
	//*  60   98:icmplt          121
			e[l] = (byte)((l - 48) + 52);
	//   61  101:getstatic       #12  <Field byte[] e>
	//   62  104:iload_0         
	//   63  105:iload_0         
	//   64  106:bipush          48
	//   65  108:isub            
	//   66  109:bipush          52
	//   67  111:iadd            
	//   68  112:int2byte        
	//   69  113:bastore         

	//   70  114:iload_0         
	//   71  115:iconst_1        
	//   72  116:isub            
	//   73  117:istore_0        
	//*  74  118:goto            95
		e[43] = 62;
	//   75  121:getstatic       #12  <Field byte[] e>
	//   76  124:bipush          43
	//   77  126:bipush          62
	//   78  128:bastore         
		e[47] = 63;
	//   79  129:getstatic       #12  <Field byte[] e>
	//   80  132:bipush          47
	//   81  134:bipush          63
	//   82  136:bastore         
		for(int i1 = 0; i1 <= 25; i1++)
	//*  83  137:iconst_0        
	//*  84  138:istore_0        
	//*  85  139:iload_0         
	//*  86  140:bipush          25
	//*  87  142:icmpgt          162
			c[i1] = (char)(i1 + 65);
	//   88  145:getstatic       #14  <Field char[] c>
	//   89  148:iload_0         
	//   90  149:iload_0         
	//   91  150:bipush          65
	//   92  152:iadd            
	//   93  153:int2char        
	//   94  154:castore         

	//   95  155:iload_0         
	//   96  156:iconst_1        
	//   97  157:iadd            
	//   98  158:istore_0        
	//*  99  159:goto            139
		int l1 = 26;
	//  100  162:bipush          26
	//  101  164:istore_1        
		for(int j1 = 0; l1 <= 51; j1++)
	//* 102  165:iconst_0        
	//* 103  166:istore_0        
	//* 104  167:iload_1         
	//* 105  168:bipush          51
	//* 106  170:icmpgt          194
		{
			c[l1] = (char)(j1 + 97);
	//  107  173:getstatic       #14  <Field char[] c>
	//  108  176:iload_1         
	//  109  177:iload_0         
	//  110  178:bipush          97
	//  111  180:iadd            
	//  112  181:int2char        
	//  113  182:castore         
			l1++;
	//  114  183:iload_1         
	//  115  184:iconst_1        
	//  116  185:iadd            
	//  117  186:istore_1        
		}

	//  118  187:iload_0         
	//  119  188:iconst_1        
	//  120  189:iadd            
	//  121  190:istore_0        
	//* 122  191:goto            167
		l1 = 52;
	//  123  194:bipush          52
	//  124  196:istore_1        
		for(int k1 = 0; l1 <= 61; k1++)
	//* 125  197:iconst_0        
	//* 126  198:istore_0        
	//* 127  199:iload_1         
	//* 128  200:bipush          61
	//* 129  202:icmpgt          226
		{
			c[l1] = (char)(k1 + 48);
	//  130  205:getstatic       #14  <Field char[] c>
	//  131  208:iload_1         
	//  132  209:iload_0         
	//  133  210:bipush          48
	//  134  212:iadd            
	//  135  213:int2char        
	//  136  214:castore         
			l1++;
	//  137  215:iload_1         
	//  138  216:iconst_1        
	//  139  217:iadd            
	//  140  218:istore_1        
		}

	//  141  219:iload_0         
	//  142  220:iconst_1        
	//  143  221:iadd            
	//  144  222:istore_0        
	//* 145  223:goto            199
		c[62] = '+';
	//  146  226:getstatic       #14  <Field char[] c>
	//  147  229:bipush          62
	//  148  231:bipush          43
	//  149  233:castore         
		c[63] = '/';
	//  150  234:getstatic       #14  <Field char[] c>
	//  151  237:bipush          63
	//  152  239:bipush          47
	//  153  241:castore         
	//* 154  242:return          
	}
}
