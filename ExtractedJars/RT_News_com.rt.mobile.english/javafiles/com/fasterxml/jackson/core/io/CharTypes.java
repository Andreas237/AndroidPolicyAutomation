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
		int i = 0;
	//    2    5:iconst_0        
	//    3    6:istore_3        
		int j = ai.length;
	//    4    7:aload           7
	//    5    9:arraylength     
	//    6   10:istore          4
		for(int k = s.length(); i < k; i++)
	//*   7   12:aload_1         
	//*   8   13:invokevirtual   #78  <Method int String.length()>
	//*   9   16:istore          5
	//*  10   18:iload_3         
	//*  11   19:iload           5
	//*  12   21:icmpge          137
		{
			char c = s.charAt(i);
	//   13   24:aload_1         
	//   14   25:iload_3         
	//   15   26:invokevirtual   #82  <Method char String.charAt(int)>
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
	//   27   49:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
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
	//   37   67:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   38   70:pop             
					stringbuilder.append('0');
	//   39   71:aload_0         
	//   40   72:bipush          48
	//   41   74:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   42   77:pop             
					stringbuilder.append('0');
	//   43   78:aload_0         
	//   44   79:bipush          48
	//   45   81:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   46   84:pop             
					stringbuilder.append(HC[c >> 4]);
	//   47   85:aload_0         
	//   48   86:getstatic       #29  <Field char[] HC>
	//   49   89:iload_2         
	//   50   90:iconst_4        
	//   51   91:ishr            
	//   52   92:caload          
	//   53   93:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   54   96:pop             
					stringbuilder.append(HC[c & 0xf]);
	//   55   97:aload_0         
	//   56   98:getstatic       #29  <Field char[] HC>
	//   57  101:iload_2         
	//   58  102:bipush          15
	//   59  104:iand            
	//   60  105:caload          
	//   61  106:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   62  109:pop             
				} else
	//*  63  110:goto            130
				{
					stringbuilder.append((char)l);
	//   64  113:aload_0         
	//   65  114:iload           6
	//   66  116:int2char        
	//   67  117:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
	//   68  120:pop             
				}
			} else
	//*  69  121:goto            130
			{
				stringbuilder.append(c);
	//   70  124:aload_0         
	//   71  125:iload_2         
	//   72  126:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
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
	//    1    3:invokevirtual   #97  <Method Object _5B_B.clone()>
	//    2    6:checkcast       #93  <Class byte[]>
	//    3    9:areturn         
	}

	public static char[] copyHexChars()
	{
		return (char[])((char []) (HC)).clone();
	//    0    0:getstatic       #29  <Field char[] HC>
	//    1    3:invokevirtual   #100 <Method Object _5B_C.clone()>
	//    2    6:checkcast       #99  <Class char[]>
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
		int ai[] = ((int []) (HC));
	//    3    8:getstatic       #29  <Field char[] HC>
	//    4   11:astore_3        
		boolean flag = false;
	//    5   12:iconst_0        
	//    6   13:istore_2        
		int j1 = ai.length;
	//    7   14:aload_3         
	//    8   15:arraylength     
	//    9   16:istore_1        
		HB = new byte[j1];
	//   10   17:iload_1         
	//   11   18:newarray        byte[]
	//   12   20:putstatic       #31  <Field byte[] HB>
		for(int i = 0; i < j1; i++)
	//*  13   23:iconst_0        
	//*  14   24:istore_0        
	//*  15   25:iload_0         
	//*  16   26:iload_1         
	//*  17   27:icmpge          48
			HB[i] = (byte)HC[i];
	//   18   30:getstatic       #31  <Field byte[] HB>
	//   19   33:iload_0         
	//   20   34:getstatic       #29  <Field char[] HC>
	//   21   37:iload_0         
	//   22   38:caload          
	//   23   39:int2byte        
	//   24   40:bastore         

	//   25   41:iload_0         
	//   26   42:iconst_1        
	//   27   43:iadd            
	//   28   44:istore_0        
	//*  29   45:goto            25
		ai = new int[256];
	//   30   48:sipush          256
	//   31   51:newarray        int[]
	//   32   53:astore_3        
		for(int j = 0; j < 32; j++)
	//*  33   54:iconst_0        
	//*  34   55:istore_0        
	//*  35   56:iload_0         
	//*  36   57:bipush          32
	//*  37   59:icmpge          73
			ai[j] = -1;
	//   38   62:aload_3         
	//   39   63:iload_0         
	//   40   64:iconst_m1       
	//   41   65:iastore         

	//   42   66:iload_0         
	//   43   67:iconst_1        
	//   44   68:iadd            
	//   45   69:istore_0        
	//*  46   70:goto            56
		ai[34] = 1;
	//   47   73:aload_3         
	//   48   74:bipush          34
	//   49   76:iconst_1        
	//   50   77:iastore         
		ai[92] = 1;
	//   51   78:aload_3         
	//   52   79:bipush          92
	//   53   81:iconst_1        
	//   54   82:iastore         
		sInputCodes = ai;
	//   55   83:aload_3         
	//   56   84:putstatic       #33  <Field int[] sInputCodes>
		ai = new int[sInputCodes.length];
	//   57   87:getstatic       #33  <Field int[] sInputCodes>
	//   58   90:arraylength     
	//   59   91:newarray        int[]
	//   60   93:astore_3        
		System.arraycopy(((Object) (sInputCodes)), 0, ((Object) (ai)), 0, ai.length);
	//   61   94:getstatic       #33  <Field int[] sInputCodes>
	//   62   97:iconst_0        
	//   63   98:aload_3         
	//   64   99:iconst_0        
	//   65  100:aload_3         
	//   66  101:arraylength     
	//   67  102:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		for(j1 = 128; j1 < '\u0100'; j1++)
	//*  68  105:sipush          128
	//*  69  108:istore_1        
	//*  70  109:iload_1         
	//*  71  110:sipush          256
	//*  72  113:icmpge          177
		{
			byte byte0;
			if((j1 & 0xe0) == 192)
	//*  73  116:iload_1         
	//*  74  117:sipush          224
	//*  75  120:iand            
	//*  76  121:sipush          192
	//*  77  124:icmpne          132
				byte0 = 2;
	//   78  127:iconst_2        
	//   79  128:istore_0        
			else
	//*  80  129:goto            166
			if((j1 & 0xf0) == 224)
	//*  81  132:iload_1         
	//*  82  133:sipush          240
	//*  83  136:iand            
	//*  84  137:sipush          224
	//*  85  140:icmpne          148
				byte0 = 3;
	//   86  143:iconst_3        
	//   87  144:istore_0        
			else
	//*  88  145:goto            166
			if((j1 & 0xf8) == 240)
	//*  89  148:iload_1         
	//*  90  149:sipush          248
	//*  91  152:iand            
	//*  92  153:sipush          240
	//*  93  156:icmpne          164
				byte0 = 4;
	//   94  159:iconst_4        
	//   95  160:istore_0        
			else
	//*  96  161:goto            166
				byte0 = -1;
	//   97  164:iconst_m1       
	//   98  165:istore_0        
			ai[j1] = ((int) (byte0));
	//   99  166:aload_3         
	//  100  167:iload_1         
	//  101  168:iload_0         
	//  102  169:iastore         
		}

	//  103  170:iload_1         
	//  104  171:iconst_1        
	//  105  172:iadd            
	//  106  173:istore_1        
	//* 107  174:goto            109
		sInputCodesUTF8 = ai;
	//  108  177:aload_3         
	//  109  178:putstatic       #41  <Field int[] sInputCodesUTF8>
		ai = new int[256];
	//  110  181:sipush          256
	//  111  184:newarray        int[]
	//  112  186:astore_3        
		Arrays.fill(ai, -1);
	//  113  187:aload_3         
	//  114  188:iconst_m1       
	//  115  189:invokestatic    #47  <Method void Arrays.fill(int[], int)>
		for(int k = 33; k < 256; k++)
	//* 116  192:bipush          33
	//* 117  194:istore_0        
	//* 118  195:iload_0         
	//* 119  196:sipush          256
	//* 120  199:icmpge          221
			if(Character.isJavaIdentifierPart((char)k))
	//* 121  202:iload_0         
	//* 122  203:int2char        
	//* 123  204:invokestatic    #53  <Method boolean Character.isJavaIdentifierPart(char)>
	//* 124  207:ifeq            214
				ai[k] = 0;
	//  125  210:aload_3         
	//  126  211:iload_0         
	//  127  212:iconst_0        
	//  128  213:iastore         

	//  129  214:iload_0         
	//  130  215:iconst_1        
	//  131  216:iadd            
	//  132  217:istore_0        
	//* 133  218:goto            195
		ai[64] = 0;
	//  134  221:aload_3         
	//  135  222:bipush          64
	//  136  224:iconst_0        
	//  137  225:iastore         
		ai[35] = 0;
	//  138  226:aload_3         
	//  139  227:bipush          35
	//  140  229:iconst_0        
	//  141  230:iastore         
		ai[42] = 0;
	//  142  231:aload_3         
	//  143  232:bipush          42
	//  144  234:iconst_0        
	//  145  235:iastore         
		ai[45] = 0;
	//  146  236:aload_3         
	//  147  237:bipush          45
	//  148  239:iconst_0        
	//  149  240:iastore         
		ai[43] = 0;
	//  150  241:aload_3         
	//  151  242:bipush          43
	//  152  244:iconst_0        
	//  153  245:iastore         
		sInputCodesJsNames = ai;
	//  154  246:aload_3         
	//  155  247:putstatic       #55  <Field int[] sInputCodesJsNames>
		ai = new int[256];
	//  156  250:sipush          256
	//  157  253:newarray        int[]
	//  158  255:astore_3        
		System.arraycopy(((Object) (sInputCodesJsNames)), 0, ((Object) (ai)), 0, ai.length);
	//  159  256:getstatic       #55  <Field int[] sInputCodesJsNames>
	//  160  259:iconst_0        
	//  161  260:aload_3         
	//  162  261:iconst_0        
	//  163  262:aload_3         
	//  164  263:arraylength     
	//  165  264:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 128, 128, 0);
	//  166  267:aload_3         
	//  167  268:sipush          128
	//  168  271:sipush          128
	//  169  274:iconst_0        
	//  170  275:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		sInputCodesUtf8JsNames = ai;
	//  171  278:aload_3         
	//  172  279:putstatic       #60  <Field int[] sInputCodesUtf8JsNames>
		ai = new int[256];
	//  173  282:sipush          256
	//  174  285:newarray        int[]
	//  175  287:astore_3        
		System.arraycopy(((Object) (sInputCodesUTF8)), 128, ((Object) (ai)), 128, 128);
	//  176  288:getstatic       #41  <Field int[] sInputCodesUTF8>
	//  177  291:sipush          128
	//  178  294:aload_3         
	//  179  295:sipush          128
	//  180  298:sipush          128
	//  181  301:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 0, 32, -1);
	//  182  304:aload_3         
	//  183  305:iconst_0        
	//  184  306:bipush          32
	//  185  308:iconst_m1       
	//  186  309:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		ai[9] = 0;
	//  187  312:aload_3         
	//  188  313:bipush          9
	//  189  315:iconst_0        
	//  190  316:iastore         
		ai[10] = 10;
	//  191  317:aload_3         
	//  192  318:bipush          10
	//  193  320:bipush          10
	//  194  322:iastore         
		ai[13] = 13;
	//  195  323:aload_3         
	//  196  324:bipush          13
	//  197  326:bipush          13
	//  198  328:iastore         
		ai[42] = 42;
	//  199  329:aload_3         
	//  200  330:bipush          42
	//  201  332:bipush          42
	//  202  334:iastore         
		sInputCodesComment = ai;
	//  203  335:aload_3         
	//  204  336:putstatic       #62  <Field int[] sInputCodesComment>
		ai = new int[256];
	//  205  339:sipush          256
	//  206  342:newarray        int[]
	//  207  344:astore_3        
		System.arraycopy(((Object) (sInputCodesUTF8)), 128, ((Object) (ai)), 128, 128);
	//  208  345:getstatic       #41  <Field int[] sInputCodesUTF8>
	//  209  348:sipush          128
	//  210  351:aload_3         
	//  211  352:sipush          128
	//  212  355:sipush          128
	//  213  358:invokestatic    #39  <Method void System.arraycopy(Object, int, Object, int, int)>
		Arrays.fill(ai, 0, 32, -1);
	//  214  361:aload_3         
	//  215  362:iconst_0        
	//  216  363:bipush          32
	//  217  365:iconst_m1       
	//  218  366:invokestatic    #58  <Method void Arrays.fill(int[], int, int, int)>
		ai[32] = 1;
	//  219  369:aload_3         
	//  220  370:bipush          32
	//  221  372:iconst_1        
	//  222  373:iastore         
		ai[9] = 1;
	//  223  374:aload_3         
	//  224  375:bipush          9
	//  225  377:iconst_1        
	//  226  378:iastore         
		ai[10] = 10;
	//  227  379:aload_3         
	//  228  380:bipush          10
	//  229  382:bipush          10
	//  230  384:iastore         
		ai[13] = 13;
	//  231  385:aload_3         
	//  232  386:bipush          13
	//  233  388:bipush          13
	//  234  390:iastore         
		ai[47] = 47;
	//  235  391:aload_3         
	//  236  392:bipush          47
	//  237  394:bipush          47
	//  238  396:iastore         
		ai[35] = 35;
	//  239  397:aload_3         
	//  240  398:bipush          35
	//  241  400:bipush          35
	//  242  402:iastore         
		sInputCodesWS = ai;
	//  243  403:aload_3         
	//  244  404:putstatic       #64  <Field int[] sInputCodesWS>
		ai = new int[128];
	//  245  407:sipush          128
	//  246  410:newarray        int[]
	//  247  412:astore_3        
		for(int l = 0; l < 32; l++)
	//* 248  413:iconst_0        
	//* 249  414:istore_0        
	//* 250  415:iload_0         
	//* 251  416:bipush          32
	//* 252  418:icmpge          432
			ai[l] = -1;
	//  253  421:aload_3         
	//  254  422:iload_0         
	//  255  423:iconst_m1       
	//  256  424:iastore         

	//  257  425:iload_0         
	//  258  426:iconst_1        
	//  259  427:iadd            
	//  260  428:istore_0        
	//* 261  429:goto            415
		ai[34] = 34;
	//  262  432:aload_3         
	//  263  433:bipush          34
	//  264  435:bipush          34
	//  265  437:iastore         
		ai[92] = 92;
	//  266  438:aload_3         
	//  267  439:bipush          92
	//  268  441:bipush          92
	//  269  443:iastore         
		ai[8] = 98;
	//  270  444:aload_3         
	//  271  445:bipush          8
	//  272  447:bipush          98
	//  273  449:iastore         
		ai[9] = 116;
	//  274  450:aload_3         
	//  275  451:bipush          9
	//  276  453:bipush          116
	//  277  455:iastore         
		ai[12] = 102;
	//  278  456:aload_3         
	//  279  457:bipush          12
	//  280  459:bipush          102
	//  281  461:iastore         
		ai[10] = 110;
	//  282  462:aload_3         
	//  283  463:bipush          10
	//  284  465:bipush          110
	//  285  467:iastore         
		ai[13] = 114;
	//  286  468:aload_3         
	//  287  469:bipush          13
	//  288  471:bipush          114
	//  289  473:iastore         
		sOutputEscapes128 = ai;
	//  290  474:aload_3         
	//  291  475:putstatic       #66  <Field int[] sOutputEscapes128>
		sHexValues = new int[128];
	//  292  478:sipush          128
	//  293  481:newarray        int[]
	//  294  483:putstatic       #68  <Field int[] sHexValues>
		Arrays.fill(sHexValues, -1);
	//  295  486:getstatic       #68  <Field int[] sHexValues>
	//  296  489:iconst_m1       
	//  297  490:invokestatic    #47  <Method void Arrays.fill(int[], int)>
		j1 = 0;
	//  298  493:iconst_0        
	//  299  494:istore_1        
		int i1;
		do
		{
			i1 = ((int) (flag));
	//  300  495:iload_2         
	//  301  496:istore_0        
			if(j1 >= 10)
				break;
	//  302  497:iload_1         
	//  303  498:bipush          10
	//  304  500:icmpge          519
			sHexValues[48 + j1] = j1;
	//  305  503:getstatic       #68  <Field int[] sHexValues>
	//  306  506:bipush          48
	//  307  508:iload_1         
	//  308  509:iadd            
	//  309  510:iload_1         
	//  310  511:iastore         
			j1++;
	//  311  512:iload_1         
	//  312  513:iconst_1        
	//  313  514:iadd            
	//  314  515:istore_1        
		} while(true);
	//  315  516:goto            495
		for(; i1 < 6; i1++)
	//* 316  519:iload_0         
	//* 317  520:bipush          6
	//* 318  522:icmpge          557
		{
			int ai1[] = sHexValues;
	//  319  525:getstatic       #68  <Field int[] sHexValues>
	//  320  528:astore_3        
			int k1 = 10 + i1;
	//  321  529:bipush          10
	//  322  531:iload_0         
	//  323  532:iadd            
	//  324  533:istore_1        
			ai1[97 + i1] = k1;
	//  325  534:aload_3         
	//  326  535:bipush          97
	//  327  537:iload_0         
	//  328  538:iadd            
	//  329  539:iload_1         
	//  330  540:iastore         
			sHexValues[65 + i1] = k1;
	//  331  541:getstatic       #68  <Field int[] sHexValues>
	//  332  544:bipush          65
	//  333  546:iload_0         
	//  334  547:iadd            
	//  335  548:iload_1         
	//  336  549:iastore         
		}

	//  337  550:iload_0         
	//  338  551:iconst_1        
	//  339  552:iadd            
	//  340  553:istore_0        
	//* 341  554:goto            519
	//* 342  557:return          
	}
}
