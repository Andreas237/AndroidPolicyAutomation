// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import java.util.Arrays;

public final class CharTypes
{

	public static void appendQuoted(StringBuilder stringbuilder, String s)
	{
		int ai[] = sOutputEscapes128;
	//    0    0:getstatic       #66  <Field int[] sOutputEscapes128>
	//    1    3:astore          7
		int j = ai.length;
	//    2    5:aload           7
	//    3    7:arraylength     
	//    4    8:istore          4
		int k = s.length();
	//    5   10:aload_1         
	//    6   11:invokevirtual   #75  <Method int String.length()>
	//    7   14:istore          5
		for(int i = 0; i < k; i++)
	//*   8   16:iconst_0        
	//*   9   17:istore_3        
	//*  10   18:iload_3         
	//*  11   19:iload           5
	//*  12   21:icmpge          137
		{
			char c = s.charAt(i);
	//   13   24:aload_1         
	//   14   25:iload_3         
	//   15   26:invokevirtual   #79  <Method char String.charAt(int)>
	//   16   29:istore_2        
			if(c < j && ai[c] != 0)
	//*  17   30:iload_2         
	//*  18   31:iload           4
	//*  19   33:icmpge          124
	//*  20   36:aload           7
	//*  21   38:iload_2         
	//*  22   39:iaload          
	//*  23   40:ifne            46
	//*  24   43:goto            124
			{
				stringbuilder.append('\\');
	//   25   46:aload_0         
	//   26   47:bipush          92
	//   27   49:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   28   52:pop             
				int l = ai[c];
	//   29   53:aload           7
	//   30   55:iload_2         
	//   31   56:iaload          
	//   32   57:istore          6
				if(l < 0)
	//*  33   59:iload           6
	//*  34   61:ifge            113
				{
					stringbuilder.append('u');
	//   35   64:aload_0         
	//   36   65:bipush          117
	//   37   67:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   38   70:pop             
					stringbuilder.append('0');
	//   39   71:aload_0         
	//   40   72:bipush          48
	//   41   74:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   42   77:pop             
					stringbuilder.append('0');
	//   43   78:aload_0         
	//   44   79:bipush          48
	//   45   81:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   46   84:pop             
					stringbuilder.append(HC[c >> 4]);
	//   47   85:aload_0         
	//   48   86:getstatic       #29  <Field char[] HC>
	//   49   89:iload_2         
	//   50   90:iconst_4        
	//   51   91:ishr            
	//   52   92:caload          
	//   53   93:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   54   96:pop             
					stringbuilder.append(HC[c & 0xf]);
	//   55   97:aload_0         
	//   56   98:getstatic       #29  <Field char[] HC>
	//   57  101:iload_2         
	//   58  102:bipush          15
	//   59  104:iand            
	//   60  105:caload          
	//   61  106:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   62  109:pop             
				} else
	//*  63  110:goto            130
				{
					stringbuilder.append((char)l);
	//   64  113:aload_0         
	//   65  114:iload           6
	//   66  116:int2char        
	//   67  117:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   68  120:pop             
				}
			} else
	//*  69  121:goto            130
			{
				stringbuilder.append(c);
	//   70  124:aload_0         
	//   71  125:iload_2         
	//   72  126:invokevirtual   #85  <Method StringBuilder StringBuilder.append(char)>
	//   73  129:pop             
			}
		}

	//   74  130:iload_3         
	//   75  131:iconst_1        
	//   76  132:iadd            
	//   77  133:istore_3        
	//*  78  134:goto            18
	//   79  137:return          
	}

	public static int charToHex(int i)
	{
		if(i > 127)
	//*   0    0:iload_0         
	//*   1    1:bipush          127
	//*   2    3:icmple          8
			return -1;
	//    3    6:iconst_m1       
	//    4    7:ireturn         
		else
			return sHexValues[i];
	//    5    8:getstatic       #68  <Field int[] sHexValues>
	//    6   11:iload_0         
	//    7   12:iaload          
	//    8   13:ireturn         
	}

	public static byte[] copyHexBytes()
	{
		return (byte[])((byte []) (HB)).clone();
	//    0    0:getstatic       #31  <Field byte[] HB>
	//    1    3:invokevirtual   #94  <Method Object _5B_B.clone()>
	//    2    6:checkcast       #90  <Class byte[]>
	//    3    9:areturn         
	}

	public static char[] copyHexChars()
	{
		return (char[])((char []) (HC)).clone();
	//    0    0:getstatic       #29  <Field char[] HC>
	//    1    3:invokevirtual   #97  <Method Object _5B_C.clone()>
	//    2    6:checkcast       #96  <Class char[]>
	//    3    9:areturn         
	}

	public static int[] get7BitOutputEscapes()
	{
		return sOutputEscapes128;
	//    0    0:getstatic       #66  <Field int[] sOutputEscapes128>
	//    1    3:areturn         
	}

	public static int[] getInputCodeComment()
	{
		return sInputCodesComment;
	//    0    0:getstatic       #62  <Field int[] sInputCodesComment>
	//    1    3:areturn         
	}

	public static int[] getInputCodeLatin1()
	{
		return sInputCodes;
	//    0    0:getstatic       #33  <Field int[] sInputCodes>
	//    1    3:areturn         
	}

	public static int[] getInputCodeLatin1JsNames()
	{
		return sInputCodesJsNames;
	//    0    0:getstatic       #55  <Field int[] sInputCodesJsNames>
	//    1    3:areturn         
	}

	public static int[] getInputCodeUtf8()
	{
		return sInputCodesUTF8;
	//    0    0:getstatic       #41  <Field int[] sInputCodesUTF8>
	//    1    3:areturn         
	}

	public static int[] getInputCodeUtf8JsNames()
	{
		return sInputCodesUtf8JsNames;
	//    0    0:getstatic       #60  <Field int[] sInputCodesUtf8JsNames>
	//    1    3:areturn         
	}

	private static final byte HB[];
	private static final char HC[];
	private static final int sHexValues[];
	private static final int sInputCodes[];
	private static final int sInputCodesComment[];
	private static final int sInputCodesJsNames[];
	private static final int sInputCodesUTF8[];
	private static final int sInputCodesUtf8JsNames[];
	private static final int sInputCodesWS[];
	private static final int sOutputEscapes128[];

	static 
	{
		HC = "0123456789ABCDEF".toCharArray();
	//    0    0:ldc1            #21  <String "0123456789ABCDEF">
	//    1    2:invokevirtual   #27  <Method char[] String.toCharArray()>
	//    2    5:putstatic       #29  <Field char[] HC>
		int j1 = HC.length;
	//    3    8:getstatic       #29  <Field char[] HC>
	//    4   11:arraylength     
	//    5   12:istore_1        
		HB = new byte[j1];
	//    6   13:iload_1         
	//    7   14:newarray        byte[]
	//    8   16:putstatic       #31  <Field byte[] HB>
		boolean flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_2        
		for(int i = 0; i < j1; i++)
	//*  11   21:iconst_0        
	//*  12   22:istore_0        
	//*  13   23:iload_0         
	//*  14   24:iload_1         
	//*  15   25:icmpge          46
			HB[i] = (byte)HC[i];
	//   16   28:getstatic       #31  <Field byte[] HB>
	//   17   31:iload_0         
	//   18   32:getstatic       #29  <Field char[] HC>
	//   19   35:iload_0         
	//   20   36:caload          
	//   21   37:int2byte        
	//   22   38:bastore         

	//   23   39:iload_0         
	//   24   40:iconst_1        
	//   25   41:iadd            
	//   26   42:istore_0        
	//*  27   43:goto            23
		int ai[] = new int[256];
	//   28   46:sipush          256
	//   29   49:newarray        int[]
	//   30   51:astore_3        
		for(int j = 0; j < 32; j++)
	//*  31   52:iconst_0        
	//*  32   53:istore_0        
	//*  33   54:iload_0         
	//*  34   55:bipush          32
	//*  35   57:icmpge          71
			ai[j] = -1;
	//   36   60:aload_3         
	//   37   61:iload_0         
	//   38   62:iconst_m1       
	//   39   63:iastore         

	//   40   64:iload_0         
	//   41   65:iconst_1        
	//   42   66:iadd            
	//   43   67:istore_0        
	//*  44   68:goto            54
		ai[34] = 1;
	//   45   71:aload_3         
	//   46   72:bipush          34
	//   47   74:iconst_1        
	//   48   75:iastore         
		ai[92] = 1;
	//   49   76:aload_3         
	//   50   77:bipush          92
	//   51   79:iconst_1        
	//   52   80:iastore         
		sInputCodes = ai;
	//   53   81:aload_3         
	//   54   82:putstatic       #33  <Field int[] sInputCodes>
		ai = sInputCodes;
	//   55   85:getstatic       #33  <Field int[] sInputCodes>
	//   56   88:astore_3        
		int ai2[] = new int[ai.length];
	//   57   89:aload_3         
	//   58   90:arraylength     
	//   59   91:newarray        int[]
	//   60   93:astore          4
		System.arraycopy(((Object) (ai)), 0, ((Object) (ai2)), 0, ai2.length);
	//   61   95:aload_3         
	//   62   96:iconst_0        
	//   63   97:aload           4
	//   64   99:iconst_0        
	//   65  100:aload           4
	//   66  102:arraylength     
	//   67  103:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		for(j1 = 128; j1 < '\u0100'; j1++)
	//*  68  106:sipush          128
	//*  69  109:istore_1        
	//*  70  110:iload_1         
	//*  71  111:sipush          256
	//*  72  114:icmpge          179
		{
			byte byte0;
			if((j1 & 0xe0) == 192)
	//*  73  117:iload_1         
	//*  74  118:sipush          224
	//*  75  121:iand            
	//*  76  122:sipush          192
	//*  77  125:icmpne          133
				byte0 = 2;
	//   78  128:iconst_2        
	//   79  129:istore_0        
			else
	//*  80  130:goto            167
			if((j1 & 0xf0) == 224)
	//*  81  133:iload_1         
	//*  82  134:sipush          240
	//*  83  137:iand            
	//*  84  138:sipush          224
	//*  85  141:icmpne          149
				byte0 = 3;
	//   86  144:iconst_3        
	//   87  145:istore_0        
			else
	//*  88  146:goto            167
			if((j1 & 0xf8) == 240)
	//*  89  149:iload_1         
	//*  90  150:sipush          248
	//*  91  153:iand            
	//*  92  154:sipush          240
	//*  93  157:icmpne          165
				byte0 = 4;
	//   94  160:iconst_4        
	//   95  161:istore_0        
			else
	//*  96  162:goto            167
				byte0 = -1;
	//   97  165:iconst_m1       
	//   98  166:istore_0        
			ai2[j1] = ((int) (byte0));
	//   99  167:aload           4
	//  100  169:iload_1         
	//  101  170:iload_0         
	//  102  171:iastore         
		}

	//  103  172:iload_1         
	//  104  173:iconst_1        
	//  105  174:iadd            
	//  106  175:istore_1        
	//* 107  176:goto            110
		sInputCodesUTF8 = ai2;
	//  108  179:aload           4
	//  109  181:putstatic       #41  <Field int[] sInputCodesUTF8>
		ai = new int[256];
	//  110  184:sipush          256
	//  111  187:newarray        int[]
	//  112  189:astore_3        
		Arrays.fill(ai, -1);
	//  113  190:aload_3         
	//  114  191:iconst_m1       
	//  115  192:invokestatic    #47  <Method void Arrays.fill(int[], int)>
		for(int k = 33; k < 256; k++)
	//* 116  195:bipush          33
	//* 117  197:istore_0        
	//* 118  198:iload_0         
	//* 119  199:sipush          256
	//* 120  202:icmpge          224
			if(Character.isJavaIdentifierPart((char)k))
	//* 121  205:iload_0         
	//* 122  206:int2char        
	//* 123  207:invokestatic    #53  <Method boolean Character.isJavaIdentifierPart(char)>
	//* 124  210:ifeq            217
				ai[k] = 0;
	//  125  213:aload_3         
	//  126  214:iload_0         
	//  127  215:iconst_0        
	//  128  216:iastore         

	//  129  217:iload_0         
	//  130  218:iconst_1        
	//  131  219:iadd            
	//  132  220:istore_0        
	//* 133  221:goto            198
		ai[64] = 0;
	//  134  224:aload_3         
	//  135  225:bipush          64
	//  136  227:iconst_0        
	//  137  228:iastore         
		ai[35] = 0;
	//  138  229:aload_3         
	//  139  230:bipush          35
	//  140  232:iconst_0        
	//  141  233:iastore         
		ai[42] = 0;
	//  142  234:aload_3         
	//  143  235:bipush          42
	//  144  237:iconst_0        
	//  145  238:iastore         
		ai[45] = 0;
	//  146  239:aload_3         
	//  147  240:bipush          45
	//  148  242:iconst_0        
	//  149  243:iastore         
		ai[43] = 0;
	//  150  244:aload_3         
	//  151  245:bipush          43
	//  152  247:iconst_0        
	//  153  248:iastore         
		sInputCodesJsNames = ai;
	//  154  249:aload_3         
	//  155  250:putstatic       #55  <Field int[] sInputCodesJsNames>
		ai = new int[256];
	//  156  253:sipush          256
	//  157  256:newarray        int[]
	//  158  258:astore_3        
		System.arraycopy(((Object) (sInputCodesJsNames)), 0, ((Object) (ai)), 0, ai.length);
	//  159  259:getstatic       #55  <Field int[] sInputCodesJsNames>
	//  160  262:iconst_0        
	//  161  263:aload_3         
	//  162  264:iconst_0        
	//  163  265:aload_3         
	//  164  266:arraylength     
	//  165  267:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 128, 128, 0);
	//  166  270:aload_3         
	//  167  271:sipush          128
	//  168  274:sipush          128
	//  169  277:iconst_0        
	//  170  278:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		sInputCodesUtf8JsNames = ai;
	//  171  281:aload_3         
	//  172  282:putstatic       #60  <Field int[] sInputCodesUtf8JsNames>
		ai = new int[256];
	//  173  285:sipush          256
	//  174  288:newarray        int[]
	//  175  290:astore_3        
		System.arraycopy(((Object) (sInputCodesUTF8)), 128, ((Object) (ai)), 128, 128);
	//  176  291:getstatic       #41  <Field int[] sInputCodesUTF8>
	//  177  294:sipush          128
	//  178  297:aload_3         
	//  179  298:sipush          128
	//  180  301:sipush          128
	//  181  304:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 0, 32, -1);
	//  182  307:aload_3         
	//  183  308:iconst_0        
	//  184  309:bipush          32
	//  185  311:iconst_m1       
	//  186  312:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		ai[9] = 0;
	//  187  315:aload_3         
	//  188  316:bipush          9
	//  189  318:iconst_0        
	//  190  319:iastore         
		ai[10] = 10;
	//  191  320:aload_3         
	//  192  321:bipush          10
	//  193  323:bipush          10
	//  194  325:iastore         
		ai[13] = 13;
	//  195  326:aload_3         
	//  196  327:bipush          13
	//  197  329:bipush          13
	//  198  331:iastore         
		ai[42] = 42;
	//  199  332:aload_3         
	//  200  333:bipush          42
	//  201  335:bipush          42
	//  202  337:iastore         
		sInputCodesComment = ai;
	//  203  338:aload_3         
	//  204  339:putstatic       #62  <Field int[] sInputCodesComment>
		ai = new int[256];
	//  205  342:sipush          256
	//  206  345:newarray        int[]
	//  207  347:astore_3        
		System.arraycopy(((Object) (sInputCodesUTF8)), 128, ((Object) (ai)), 128, 128);
	//  208  348:getstatic       #41  <Field int[] sInputCodesUTF8>
	//  209  351:sipush          128
	//  210  354:aload_3         
	//  211  355:sipush          128
	//  212  358:sipush          128
	//  213  361:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 0, 32, -1);
	//  214  364:aload_3         
	//  215  365:iconst_0        
	//  216  366:bipush          32
	//  217  368:iconst_m1       
	//  218  369:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		ai[32] = 1;
	//  219  372:aload_3         
	//  220  373:bipush          32
	//  221  375:iconst_1        
	//  222  376:iastore         
		ai[9] = 1;
	//  223  377:aload_3         
	//  224  378:bipush          9
	//  225  380:iconst_1        
	//  226  381:iastore         
		ai[10] = 10;
	//  227  382:aload_3         
	//  228  383:bipush          10
	//  229  385:bipush          10
	//  230  387:iastore         
		ai[13] = 13;
	//  231  388:aload_3         
	//  232  389:bipush          13
	//  233  391:bipush          13
	//  234  393:iastore         
		ai[47] = 47;
	//  235  394:aload_3         
	//  236  395:bipush          47
	//  237  397:bipush          47
	//  238  399:iastore         
		ai[35] = 35;
	//  239  400:aload_3         
	//  240  401:bipush          35
	//  241  403:bipush          35
	//  242  405:iastore         
		sInputCodesWS = ai;
	//  243  406:aload_3         
	//  244  407:putstatic       #64  <Field int[] sInputCodesWS>
		ai = new int[128];
	//  245  410:sipush          128
	//  246  413:newarray        int[]
	//  247  415:astore_3        
		for(int l = 0; l < 32; l++)
	//* 248  416:iconst_0        
	//* 249  417:istore_0        
	//* 250  418:iload_0         
	//* 251  419:bipush          32
	//* 252  421:icmpge          435
			ai[l] = -1;
	//  253  424:aload_3         
	//  254  425:iload_0         
	//  255  426:iconst_m1       
	//  256  427:iastore         

	//  257  428:iload_0         
	//  258  429:iconst_1        
	//  259  430:iadd            
	//  260  431:istore_0        
	//* 261  432:goto            418
		ai[34] = 34;
	//  262  435:aload_3         
	//  263  436:bipush          34
	//  264  438:bipush          34
	//  265  440:iastore         
		ai[92] = 92;
	//  266  441:aload_3         
	//  267  442:bipush          92
	//  268  444:bipush          92
	//  269  446:iastore         
		ai[8] = 98;
	//  270  447:aload_3         
	//  271  448:bipush          8
	//  272  450:bipush          98
	//  273  452:iastore         
		ai[9] = 116;
	//  274  453:aload_3         
	//  275  454:bipush          9
	//  276  456:bipush          116
	//  277  458:iastore         
		ai[12] = 102;
	//  278  459:aload_3         
	//  279  460:bipush          12
	//  280  462:bipush          102
	//  281  464:iastore         
		ai[10] = 110;
	//  282  465:aload_3         
	//  283  466:bipush          10
	//  284  468:bipush          110
	//  285  470:iastore         
		ai[13] = 114;
	//  286  471:aload_3         
	//  287  472:bipush          13
	//  288  474:bipush          114
	//  289  476:iastore         
		sOutputEscapes128 = ai;
	//  290  477:aload_3         
	//  291  478:putstatic       #66  <Field int[] sOutputEscapes128>
		sHexValues = new int[128];
	//  292  481:sipush          128
	//  293  484:newarray        int[]
	//  294  486:putstatic       #68  <Field int[] sHexValues>
		Arrays.fill(sHexValues, -1);
	//  295  489:getstatic       #68  <Field int[] sHexValues>
	//  296  492:iconst_m1       
	//  297  493:invokestatic    #47  <Method void Arrays.fill(int[], int)>
		j1 = 0;
	//  298  496:iconst_0        
	//  299  497:istore_1        
		int i1;
		do
		{
			i1 = ((int) (flag));
	//  300  498:iload_2         
	//  301  499:istore_0        
			if(j1 >= 10)
				break;
	//  302  500:iload_1         
	//  303  501:bipush          10
	//  304  503:icmpge          522
			sHexValues[j1 + 48] = j1;
	//  305  506:getstatic       #68  <Field int[] sHexValues>
	//  306  509:iload_1         
	//  307  510:bipush          48
	//  308  512:iadd            
	//  309  513:iload_1         
	//  310  514:iastore         
			j1++;
	//  311  515:iload_1         
	//  312  516:iconst_1        
	//  313  517:iadd            
	//  314  518:istore_1        
		} while(true);
	//  315  519:goto            498
		for(; i1 < 6; i1++)
	//* 316  522:iload_0         
	//* 317  523:bipush          6
	//* 318  525:icmpge          558
		{
			int ai1[] = sHexValues;
	//  319  528:getstatic       #68  <Field int[] sHexValues>
	//  320  531:astore_3        
			int k1 = i1 + 10;
	//  321  532:iload_0         
	//  322  533:bipush          10
	//  323  535:iadd            
	//  324  536:istore_1        
			ai1[i1 + 97] = k1;
	//  325  537:aload_3         
	//  326  538:iload_0         
	//  327  539:bipush          97
	//  328  541:iadd            
	//  329  542:iload_1         
	//  330  543:iastore         
			ai1[i1 + 65] = k1;
	//  331  544:aload_3         
	//  332  545:iload_0         
	//  333  546:bipush          65
	//  334  548:iadd            
	//  335  549:iload_1         
	//  336  550:iastore         
		}

	//  337  551:iload_0         
	//  338  552:iconst_1        
	//  339  553:iadd            
	//  340  554:istore_0        
	//* 341  555:goto            522
	//* 342  558:return          
	}
}
