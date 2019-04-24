// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.io;

import java.util.Arrays;

public final class CharTypes
{

	public CharTypes()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #72  <Method void Object()>
	//    2    4:return          
	}

	public static void appendQuoted(StringBuilder stringbuilder, String s)
	{
		int ai[] = sOutputEscapes128;
	//    0    0:getstatic       #66  <Field int[] sOutputEscapes128>
	//    1    3:astore          7
		int j = ai.length;
	//    2    5:aload           7
	//    3    7:arraylength     
	//    4    8:istore          4
		int i = 0;
	//    5   10:iconst_0        
	//    6   11:istore_3        
		int k = s.length();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #78  <Method int String.length()>
	//    9   16:istore          5
		while(i < k) 
	//*  10   18:iload_3         
	//*  11   19:iload           5
	//*  12   21:icmpge          134
		{
			char c = s.charAt(i);
	//   13   24:aload_1         
	//   14   25:iload_3         
	//   15   26:invokevirtual   #82  <Method char String.charAt(int)>
	//   16   29:istore_2        
			if(c >= j || ai[c] == 0)
	//*  17   30:iload_2         
	//*  18   31:iload           4
	//*  19   33:icmpge          43
	//*  20   36:aload           7
	//*  21   38:iload_2         
	//*  22   39:iaload          
	//*  23   40:ifne            56
			{
				stringbuilder.append(c);
	//   24   43:aload_0         
	//   25   44:iload_2         
	//   26   45:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   27   48:pop             
			} else
	//*  28   49:iload_3         
	//*  29   50:iconst_1        
	//*  30   51:iadd            
	//*  31   52:istore_3        
	//*  32   53:goto            18
			{
				stringbuilder.append('\\');
	//   33   56:aload_0         
	//   34   57:bipush          92
	//   35   59:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   36   62:pop             
				int l = ai[c];
	//   37   63:aload           7
	//   38   65:iload_2         
	//   39   66:iaload          
	//   40   67:istore          6
				if(l < 0)
	//*  41   69:iload           6
	//*  42   71:ifge            123
				{
					stringbuilder.append('u');
	//   43   74:aload_0         
	//   44   75:bipush          117
	//   45   77:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   46   80:pop             
					stringbuilder.append('0');
	//   47   81:aload_0         
	//   48   82:bipush          48
	//   49   84:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   50   87:pop             
					stringbuilder.append('0');
	//   51   88:aload_0         
	//   52   89:bipush          48
	//   53   91:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   54   94:pop             
					stringbuilder.append(HC[c >> 4]);
	//   55   95:aload_0         
	//   56   96:getstatic       #29  <Field char[] HC>
	//   57   99:iload_2         
	//   58  100:iconst_4        
	//   59  101:ishr            
	//   60  102:caload          
	//   61  103:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   62  106:pop             
					stringbuilder.append(HC[c & 0xf]);
	//   63  107:aload_0         
	//   64  108:getstatic       #29  <Field char[] HC>
	//   65  111:iload_2         
	//   66  112:bipush          15
	//   67  114:iand            
	//   68  115:caload          
	//   69  116:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   70  119:pop             
				} else
	//*  71  120:goto            49
				{
					stringbuilder.append((char)l);
	//   72  123:aload_0         
	//   73  124:iload           6
	//   74  126:int2char        
	//   75  127:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   76  130:pop             
				}
			}
			i++;
		}
	//*  77  131:goto            49
	//   78  134:return          
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
		return (byte[])(byte[])((byte []) (HB)).clone();
	//    0    0:getstatic       #31  <Field byte[] HB>
	//    1    3:invokevirtual   #97  <Method Object _5B_B.clone()>
	//    2    6:checkcast       #93  <Class byte[]>
	//    3    9:checkcast       #93  <Class byte[]>
	//    4   12:areturn         
	}

	public static char[] copyHexChars()
	{
		return (char[])(char[])((char []) (HC)).clone();
	//    0    0:getstatic       #29  <Field char[] HC>
	//    1    3:invokevirtual   #100 <Method Object _5B_C.clone()>
	//    2    6:checkcast       #99  <Class char[]>
	//    3    9:checkcast       #99  <Class char[]>
	//    4   12:areturn         
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

	public static int[] getInputCodeWS()
	{
		return sInputCodesWS;
	//    0    0:getstatic       #64  <Field int[] sInputCodesWS>
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
		int k1 = HC.length;
	//    3    8:getstatic       #29  <Field char[] HC>
	//    4   11:arraylength     
	//    5   12:istore_1        
		HB = new byte[k1];
	//    6   13:iload_1         
	//    7   14:newarray        byte[]
	//    8   16:putstatic       #31  <Field byte[] HB>
		for(int i = 0; i < k1; i++)
	//*   9   19:iconst_0        
	//*  10   20:istore_0        
	//*  11   21:iload_0         
	//*  12   22:iload_1         
	//*  13   23:icmpge          44
			HB[i] = (byte)HC[i];
	//   14   26:getstatic       #31  <Field byte[] HB>
	//   15   29:iload_0         
	//   16   30:getstatic       #29  <Field char[] HC>
	//   17   33:iload_0         
	//   18   34:caload          
	//   19   35:int2byte        
	//   20   36:bastore         

	//   21   37:iload_0         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_0        
	//*  25   41:goto            21
		int ai[] = new int[256];
	//   26   44:sipush          256
	//   27   47:newarray        int[]
	//   28   49:astore_2        
		for(int j = 0; j < 32; j++)
	//*  29   50:iconst_0        
	//*  30   51:istore_0        
	//*  31   52:iload_0         
	//*  32   53:bipush          32
	//*  33   55:icmpge          69
			ai[j] = -1;
	//   34   58:aload_2         
	//   35   59:iload_0         
	//   36   60:iconst_m1       
	//   37   61:iastore         

	//   38   62:iload_0         
	//   39   63:iconst_1        
	//   40   64:iadd            
	//   41   65:istore_0        
	//*  42   66:goto            52
		ai[34] = 1;
	//   43   69:aload_2         
	//   44   70:bipush          34
	//   45   72:iconst_1        
	//   46   73:iastore         
		ai[92] = 1;
	//   47   74:aload_2         
	//   48   75:bipush          92
	//   49   77:iconst_1        
	//   50   78:iastore         
		sInputCodes = ai;
	//   51   79:aload_2         
	//   52   80:putstatic       #33  <Field int[] sInputCodes>
		ai = new int[sInputCodes.length];
	//   53   83:getstatic       #33  <Field int[] sInputCodes>
	//   54   86:arraylength     
	//   55   87:newarray        int[]
	//   56   89:astore_2        
		System.arraycopy(((Object) (sInputCodes)), 0, ((Object) (ai)), 0, ai.length);
	//   57   90:getstatic       #33  <Field int[] sInputCodes>
	//   58   93:iconst_0        
	//   59   94:aload_2         
	//   60   95:iconst_0        
	//   61   96:aload_2         
	//   62   97:arraylength     
	//   63   98:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		k1 = 128;
	//   64  101:sipush          128
	//   65  104:istore_1        
		while(k1 < 256) 
	//*  66  105:iload_1         
	//*  67  106:sipush          256
	//*  68  109:icmpge          173
		{
			byte byte0;
			if((k1 & 0xe0) == 192)
	//*  69  112:iload_1         
	//*  70  113:sipush          224
	//*  71  116:iand            
	//*  72  117:sipush          192
	//*  73  120:icmpne          136
				byte0 = 2;
	//   74  123:iconst_2        
	//   75  124:istore_0        
			else
	//*  76  125:aload_2         
	//*  77  126:iload_1         
	//*  78  127:iload_0         
	//*  79  128:iastore         
	//*  80  129:iload_1         
	//*  81  130:iconst_1        
	//*  82  131:iadd            
	//*  83  132:istore_1        
	//*  84  133:goto            105
			if((k1 & 0xf0) == 224)
	//*  85  136:iload_1         
	//*  86  137:sipush          240
	//*  87  140:iand            
	//*  88  141:sipush          224
	//*  89  144:icmpne          152
				byte0 = 3;
	//   90  147:iconst_3        
	//   91  148:istore_0        
			else
	//*  92  149:goto            125
			if((k1 & 0xf8) == 240)
	//*  93  152:iload_1         
	//*  94  153:sipush          248
	//*  95  156:iand            
	//*  96  157:sipush          240
	//*  97  160:icmpne          168
				byte0 = 4;
	//   98  163:iconst_4        
	//   99  164:istore_0        
			else
	//* 100  165:goto            125
				byte0 = -1;
	//  101  168:iconst_m1       
	//  102  169:istore_0        
			ai[k1] = ((int) (byte0));
			k1++;
		}
	//* 103  170:goto            125
		sInputCodesUTF8 = ai;
	//  104  173:aload_2         
	//  105  174:putstatic       #41  <Field int[] sInputCodesUTF8>
		ai = new int[256];
	//  106  177:sipush          256
	//  107  180:newarray        int[]
	//  108  182:astore_2        
		Arrays.fill(ai, -1);
	//  109  183:aload_2         
	//  110  184:iconst_m1       
	//  111  185:invokestatic    #47  <Method void Arrays.fill(int[], int)>
		for(int k = 33; k < 256; k++)
	//* 112  188:bipush          33
	//* 113  190:istore_0        
	//* 114  191:iload_0         
	//* 115  192:sipush          256
	//* 116  195:icmpge          217
			if(Character.isJavaIdentifierPart((char)k))
	//* 117  198:iload_0         
	//* 118  199:int2char        
	//* 119  200:invokestatic    #53  <Method boolean Character.isJavaIdentifierPart(char)>
	//* 120  203:ifeq            210
				ai[k] = 0;
	//  121  206:aload_2         
	//  122  207:iload_0         
	//  123  208:iconst_0        
	//  124  209:iastore         

	//  125  210:iload_0         
	//  126  211:iconst_1        
	//  127  212:iadd            
	//  128  213:istore_0        
	//* 129  214:goto            191
		ai[64] = 0;
	//  130  217:aload_2         
	//  131  218:bipush          64
	//  132  220:iconst_0        
	//  133  221:iastore         
		ai[35] = 0;
	//  134  222:aload_2         
	//  135  223:bipush          35
	//  136  225:iconst_0        
	//  137  226:iastore         
		ai[42] = 0;
	//  138  227:aload_2         
	//  139  228:bipush          42
	//  140  230:iconst_0        
	//  141  231:iastore         
		ai[45] = 0;
	//  142  232:aload_2         
	//  143  233:bipush          45
	//  144  235:iconst_0        
	//  145  236:iastore         
		ai[43] = 0;
	//  146  237:aload_2         
	//  147  238:bipush          43
	//  148  240:iconst_0        
	//  149  241:iastore         
		sInputCodesJsNames = ai;
	//  150  242:aload_2         
	//  151  243:putstatic       #55  <Field int[] sInputCodesJsNames>
		ai = new int[256];
	//  152  246:sipush          256
	//  153  249:newarray        int[]
	//  154  251:astore_2        
		System.arraycopy(((Object) (sInputCodesJsNames)), 0, ((Object) (ai)), 0, ai.length);
	//  155  252:getstatic       #55  <Field int[] sInputCodesJsNames>
	//  156  255:iconst_0        
	//  157  256:aload_2         
	//  158  257:iconst_0        
	//  159  258:aload_2         
	//  160  259:arraylength     
	//  161  260:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 128, 128, 0);
	//  162  263:aload_2         
	//  163  264:sipush          128
	//  164  267:sipush          128
	//  165  270:iconst_0        
	//  166  271:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		sInputCodesUtf8JsNames = ai;
	//  167  274:aload_2         
	//  168  275:putstatic       #60  <Field int[] sInputCodesUtf8JsNames>
		ai = new int[256];
	//  169  278:sipush          256
	//  170  281:newarray        int[]
	//  171  283:astore_2        
		System.arraycopy(((Object) (sInputCodesUTF8)), 128, ((Object) (ai)), 128, 128);
	//  172  284:getstatic       #41  <Field int[] sInputCodesUTF8>
	//  173  287:sipush          128
	//  174  290:aload_2         
	//  175  291:sipush          128
	//  176  294:sipush          128
	//  177  297:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 0, 32, -1);
	//  178  300:aload_2         
	//  179  301:iconst_0        
	//  180  302:bipush          32
	//  181  304:iconst_m1       
	//  182  305:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		ai[9] = 0;
	//  183  308:aload_2         
	//  184  309:bipush          9
	//  185  311:iconst_0        
	//  186  312:iastore         
		ai[10] = 10;
	//  187  313:aload_2         
	//  188  314:bipush          10
	//  189  316:bipush          10
	//  190  318:iastore         
		ai[13] = 13;
	//  191  319:aload_2         
	//  192  320:bipush          13
	//  193  322:bipush          13
	//  194  324:iastore         
		ai[42] = 42;
	//  195  325:aload_2         
	//  196  326:bipush          42
	//  197  328:bipush          42
	//  198  330:iastore         
		sInputCodesComment = ai;
	//  199  331:aload_2         
	//  200  332:putstatic       #62  <Field int[] sInputCodesComment>
		ai = new int[256];
	//  201  335:sipush          256
	//  202  338:newarray        int[]
	//  203  340:astore_2        
		System.arraycopy(((Object) (sInputCodesUTF8)), 128, ((Object) (ai)), 128, 128);
	//  204  341:getstatic       #41  <Field int[] sInputCodesUTF8>
	//  205  344:sipush          128
	//  206  347:aload_2         
	//  207  348:sipush          128
	//  208  351:sipush          128
	//  209  354:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 0, 32, -1);
	//  210  357:aload_2         
	//  211  358:iconst_0        
	//  212  359:bipush          32
	//  213  361:iconst_m1       
	//  214  362:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		ai[32] = 1;
	//  215  365:aload_2         
	//  216  366:bipush          32
	//  217  368:iconst_1        
	//  218  369:iastore         
		ai[9] = 1;
	//  219  370:aload_2         
	//  220  371:bipush          9
	//  221  373:iconst_1        
	//  222  374:iastore         
		ai[10] = 10;
	//  223  375:aload_2         
	//  224  376:bipush          10
	//  225  378:bipush          10
	//  226  380:iastore         
		ai[13] = 13;
	//  227  381:aload_2         
	//  228  382:bipush          13
	//  229  384:bipush          13
	//  230  386:iastore         
		ai[47] = 47;
	//  231  387:aload_2         
	//  232  388:bipush          47
	//  233  390:bipush          47
	//  234  392:iastore         
		ai[35] = 35;
	//  235  393:aload_2         
	//  236  394:bipush          35
	//  237  396:bipush          35
	//  238  398:iastore         
		sInputCodesWS = ai;
	//  239  399:aload_2         
	//  240  400:putstatic       #64  <Field int[] sInputCodesWS>
		ai = new int[128];
	//  241  403:sipush          128
	//  242  406:newarray        int[]
	//  243  408:astore_2        
		for(int l = 0; l < 32; l++)
	//* 244  409:iconst_0        
	//* 245  410:istore_0        
	//* 246  411:iload_0         
	//* 247  412:bipush          32
	//* 248  414:icmpge          428
			ai[l] = -1;
	//  249  417:aload_2         
	//  250  418:iload_0         
	//  251  419:iconst_m1       
	//  252  420:iastore         

	//  253  421:iload_0         
	//  254  422:iconst_1        
	//  255  423:iadd            
	//  256  424:istore_0        
	//* 257  425:goto            411
		ai[34] = 34;
	//  258  428:aload_2         
	//  259  429:bipush          34
	//  260  431:bipush          34
	//  261  433:iastore         
		ai[92] = 92;
	//  262  434:aload_2         
	//  263  435:bipush          92
	//  264  437:bipush          92
	//  265  439:iastore         
		ai[8] = 98;
	//  266  440:aload_2         
	//  267  441:bipush          8
	//  268  443:bipush          98
	//  269  445:iastore         
		ai[9] = 116;
	//  270  446:aload_2         
	//  271  447:bipush          9
	//  272  449:bipush          116
	//  273  451:iastore         
		ai[12] = 102;
	//  274  452:aload_2         
	//  275  453:bipush          12
	//  276  455:bipush          102
	//  277  457:iastore         
		ai[10] = 110;
	//  278  458:aload_2         
	//  279  459:bipush          10
	//  280  461:bipush          110
	//  281  463:iastore         
		ai[13] = 114;
	//  282  464:aload_2         
	//  283  465:bipush          13
	//  284  467:bipush          114
	//  285  469:iastore         
		sOutputEscapes128 = ai;
	//  286  470:aload_2         
	//  287  471:putstatic       #66  <Field int[] sOutputEscapes128>
		sHexValues = new int[128];
	//  288  474:sipush          128
	//  289  477:newarray        int[]
	//  290  479:putstatic       #68  <Field int[] sHexValues>
		Arrays.fill(sHexValues, -1);
	//  291  482:getstatic       #68  <Field int[] sHexValues>
	//  292  485:iconst_m1       
	//  293  486:invokestatic    #47  <Method void Arrays.fill(int[], int)>
		for(int i1 = 0; i1 < 10; i1++)
	//* 294  489:iconst_0        
	//* 295  490:istore_0        
	//* 296  491:iload_0         
	//* 297  492:bipush          10
	//* 298  494:icmpge          513
			sHexValues[i1 + 48] = i1;
	//  299  497:getstatic       #68  <Field int[] sHexValues>
	//  300  500:iload_0         
	//  301  501:bipush          48
	//  302  503:iadd            
	//  303  504:iload_0         
	//  304  505:iastore         

	//  305  506:iload_0         
	//  306  507:iconst_1        
	//  307  508:iadd            
	//  308  509:istore_0        
	//* 309  510:goto            491
		for(int j1 = 0; j1 < 6; j1++)
	//* 310  513:iconst_0        
	//* 311  514:istore_0        
	//* 312  515:iload_0         
	//* 313  516:bipush          6
	//* 314  518:icmpge          552
		{
			sHexValues[j1 + 97] = j1 + 10;
	//  315  521:getstatic       #68  <Field int[] sHexValues>
	//  316  524:iload_0         
	//  317  525:bipush          97
	//  318  527:iadd            
	//  319  528:iload_0         
	//  320  529:bipush          10
	//  321  531:iadd            
	//  322  532:iastore         
			sHexValues[j1 + 65] = j1 + 10;
	//  323  533:getstatic       #68  <Field int[] sHexValues>
	//  324  536:iload_0         
	//  325  537:bipush          65
	//  326  539:iadd            
	//  327  540:iload_0         
	//  328  541:bipush          10
	//  329  543:iadd            
	//  330  544:iastore         
		}

	//  331  545:iload_0         
	//  332  546:iconst_1        
	//  333  547:iadd            
	//  334  548:istore_0        
	//* 335  549:goto            515
	//* 336  552:return          
	}
}
