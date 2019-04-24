// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.io.PrintWriter;

public final class TimeUtils
{

	private TimeUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	private static int accumField(int i, int j, boolean flag, int k)
	{
		if(i > 99 || flag && k >= 3)
	//*   0    0:iload_0         
	//*   1    1:bipush          99
	//*   2    3:icmpgt          15
	//*   3    6:iload_2         
	//*   4    7:ifeq            19
	//*   5   10:iload_3         
	//*   6   11:iconst_3        
	//*   7   12:icmplt          19
			return j + 3;
	//    8   15:iload_1         
	//    9   16:iconst_3        
	//   10   17:iadd            
	//   11   18:ireturn         
		if(i > 9 || flag && k >= 2)
	//*  12   19:iload_0         
	//*  13   20:bipush          9
	//*  14   22:icmpgt          34
	//*  15   25:iload_2         
	//*  16   26:ifeq            38
	//*  17   29:iload_3         
	//*  18   30:iconst_2        
	//*  19   31:icmplt          38
			return j + 2;
	//   20   34:iload_1         
	//   21   35:iconst_2        
	//   22   36:iadd            
	//   23   37:ireturn         
		if(flag || i > 0)
	//*  24   38:iload_2         
	//*  25   39:ifne            46
	//*  26   42:iload_0         
	//*  27   43:ifle            50
			return j + 1;
	//   28   46:iload_1         
	//   29   47:iconst_1        
	//   30   48:iadd            
	//   31   49:ireturn         
		else
			return 0;
	//   32   50:iconst_0        
	//   33   51:ireturn         
	}

	public static void formatDuration(long l, long l1, PrintWriter printwriter)
	{
		if(l == 0L)
	//*   0    0:lload_0         
	//*   1    1:lconst_0        
	//*   2    2:lcmp            
	//*   3    3:ifne            14
		{
			printwriter.print("--");
	//    4    6:aload           4
	//    5    8:ldc1            #37  <String "--">
	//    6   10:invokevirtual   #43  <Method void PrintWriter.print(String)>
			return;
	//    7   13:return          
		} else
		{
			formatDuration(l - l1, printwriter, 0);
	//    8   14:lload_0         
	//    9   15:lload_2         
	//   10   16:lsub            
	//   11   17:aload           4
	//   12   19:iconst_0        
	//   13   20:invokestatic    #46  <Method void formatDuration(long, PrintWriter, int)>
			return;
	//   14   23:return          
		}
	}

	public static void formatDuration(long l, PrintWriter printwriter)
	{
		formatDuration(l, printwriter, 0);
	//    0    0:lload_0         
	//    1    1:aload_2         
	//    2    2:iconst_0        
	//    3    3:invokestatic    #46  <Method void formatDuration(long, PrintWriter, int)>
	//    4    6:return          
	}

	public static void formatDuration(long l, PrintWriter printwriter, int i)
	{
		synchronized(sFormatSync)
	//*   0    0:getstatic       #28  <Field Object sFormatSync>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
		{
			i = formatDurationLocked(l, i);
	//    4    8:lload_0         
	//    5    9:iload_3         
	//    6   10:invokestatic    #52  <Method int formatDurationLocked(long, int)>
	//    7   13:istore_3        
			printwriter.print(new String(sFormatStr, 0, i));
	//    8   14:aload_2         
	//    9   15:new             #54  <Class String>
	//   10   18:dup             
	//   11   19:getstatic       #30  <Field char[] sFormatStr>
	//   12   22:iconst_0        
	//   13   23:iload_3         
	//   14   24:invokespecial   #57  <Method void String(char[], int, int)>
	//   15   27:invokevirtual   #43  <Method void PrintWriter.print(String)>
		}
	//   16   30:aload           4
	//   17   32:monitorexit     
		return;
	//   18   33:return          
		printwriter;
	//   19   34:astore_2        
		obj;
	//   20   35:aload           4
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw printwriter;
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public static void formatDuration(long l, StringBuilder stringbuilder)
	{
		synchronized(sFormatSync)
	//*   0    0:getstatic       #28  <Field Object sFormatSync>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
		{
			int i = formatDurationLocked(l, 0);
	//    4    8:lload_0         
	//    5    9:iconst_0        
	//    6   10:invokestatic    #52  <Method int formatDurationLocked(long, int)>
	//    7   13:istore_3        
			stringbuilder.append(sFormatStr, 0, i);
	//    8   14:aload_2         
	//    9   15:getstatic       #30  <Field char[] sFormatStr>
	//   10   18:iconst_0        
	//   11   19:iload_3         
	//   12   20:invokevirtual   #64  <Method StringBuilder StringBuilder.append(char[], int, int)>
	//   13   23:pop             
		}
	//   14   24:aload           4
	//   15   26:monitorexit     
		return;
	//   16   27:return          
		stringbuilder;
	//   17   28:astore_2        
		obj;
	//   18   29:aload           4
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		throw stringbuilder;
	//   20   32:aload_2         
	//   21   33:athrow          
	}

	private static int formatDurationLocked(long l, int i)
	{
		if(sFormatStr.length < i)
	//*   0    0:getstatic       #30  <Field char[] sFormatStr>
	//*   1    3:arraylength     
	//*   2    4:iload_2         
	//*   3    5:icmpge          14
			sFormatStr = new char[i];
	//    4    8:iload_2         
	//    5    9:newarray        char[]
	//    6   11:putstatic       #30  <Field char[] sFormatStr>
		char ac[] = sFormatStr;
	//    7   14:getstatic       #30  <Field char[] sFormatStr>
	//    8   17:astore          14
		if(l == 0L)
	//*   9   19:lload_0         
	//*  10   20:lconst_0        
	//*  11   21:lcmp            
	//*  12   22:ifne            48
		{
			while(i - 1 < 0) 
	//*  13   25:iload_2         
	//*  14   26:iconst_1        
	//*  15   27:isub            
	//*  16   28:ifge            40
				ac[0] = ' ';
	//   17   31:aload           14
	//   18   33:iconst_0        
	//   19   34:bipush          32
	//   20   36:castore         
	//*  21   37:goto            25
			ac[0] = '0';
	//   22   40:aload           14
	//   23   42:iconst_0        
	//   24   43:bipush          48
	//   25   45:castore         
			return 1;
	//   26   46:iconst_1        
	//   27   47:ireturn         
		}
		char c;
		int j;
		int k;
		int i1;
		int j1;
		int k1;
		int l1;
		int i2;
		boolean flag;
		int j2;
		if(l > 0L)
	//*  28   48:lload_0         
	//*  29   49:lconst_0        
	//*  30   50:lcmp            
	//*  31   51:ifle            319
		{
			c = '+';
	//   32   54:bipush          43
	//   33   56:istore_3        
		} else
	//*  34   57:lload_0         
	//*  35   58:ldc2w           #65  <Long 1000L>
	//*  36   61:lrem            
	//*  37   62:l2i             
	//*  38   63:istore          12
	//*  39   65:lload_0         
	//*  40   66:ldc2w           #65  <Long 1000L>
	//*  41   69:ldiv            
	//*  42   70:l2d             
	//*  43   71:invokestatic    #72  <Method double Math.floor(double)>
	//*  44   74:d2i             
	//*  45   75:istore          5
	//*  46   77:iconst_0        
	//*  47   78:istore          7
	//*  48   80:iconst_0        
	//*  49   81:istore          8
	//*  50   83:iconst_0        
	//*  51   84:istore          9
	//*  52   86:iload           5
	//*  53   88:istore          4
	//*  54   90:iload           5
	//*  55   92:ldc1            #13  <Int 0x15180>
	//*  56   94:icmple          114
	//*  57   97:iload           5
	//*  58   99:ldc1            #13  <Int 0x15180>
	//*  59  101:idiv            
	//*  60  102:istore          7
	//*  61  104:iload           5
	//*  62  106:ldc1            #13  <Int 0x15180>
	//*  63  108:iload           7
	//*  64  110:imul            
	//*  65  111:isub            
	//*  66  112:istore          4
	//*  67  114:iload           4
	//*  68  116:istore          5
	//*  69  118:iload           4
	//*  70  120:sipush          3600
	//*  71  123:icmple          145
	//*  72  126:iload           4
	//*  73  128:sipush          3600
	//*  74  131:idiv            
	//*  75  132:istore          8
	//*  76  134:iload           4
	//*  77  136:iload           8
	//*  78  138:sipush          3600
	//*  79  141:imul            
	//*  80  142:isub            
	//*  81  143:istore          5
	//*  82  145:iload           5
	//*  83  147:istore          6
	//*  84  149:iload           5
	//*  85  151:bipush          60
	//*  86  153:icmple          173
	//*  87  156:iload           5
	//*  88  158:bipush          60
	//*  89  160:idiv            
	//*  90  161:istore          9
	//*  91  163:iload           5
	//*  92  165:iload           9
	//*  93  167:bipush          60
	//*  94  169:imul            
	//*  95  170:isub            
	//*  96  171:istore          6
	//*  97  173:iconst_0        
	//*  98  174:istore          10
	//*  99  176:iconst_0        
	//* 100  177:istore          11
	//* 101  179:iload_2         
	//* 102  180:ifeq            352
	//* 103  183:iload           7
	//* 104  185:iconst_1        
	//* 105  186:iconst_0        
	//* 106  187:iconst_0        
	//* 107  188:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 108  191:istore          4
	//* 109  193:iload           4
	//* 110  195:ifle            328
	//* 111  198:iconst_1        
	//* 112  199:istore          13
	//* 113  201:iload           4
	//* 114  203:iload           8
	//* 115  205:iconst_1        
	//* 116  206:iload           13
	//* 117  208:iconst_2        
	//* 118  209:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 119  212:iadd            
	//* 120  213:istore          4
	//* 121  215:iload           4
	//* 122  217:ifle            334
	//* 123  220:iconst_1        
	//* 124  221:istore          13
	//* 125  223:iload           4
	//* 126  225:iload           9
	//* 127  227:iconst_1        
	//* 128  228:iload           13
	//* 129  230:iconst_2        
	//* 130  231:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 131  234:iadd            
	//* 132  235:istore          4
	//* 133  237:iload           4
	//* 134  239:ifle            340
	//* 135  242:iconst_1        
	//* 136  243:istore          13
	//* 137  245:iload           4
	//* 138  247:iload           6
	//* 139  249:iconst_1        
	//* 140  250:iload           13
	//* 141  252:iconst_2        
	//* 142  253:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 143  256:iadd            
	//* 144  257:istore          5
	//* 145  259:iload           5
	//* 146  261:ifle            346
	//* 147  264:iconst_3        
	//* 148  265:istore          4
	//* 149  267:iload           5
	//* 150  269:iload           12
	//* 151  271:iconst_2        
	//* 152  272:iconst_1        
	//* 153  273:iload           4
	//* 154  275:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 155  278:iconst_1        
	//* 156  279:iadd            
	//* 157  280:iadd            
	//* 158  281:istore          5
	//* 159  283:iload           11
	//* 160  285:istore          4
	//* 161  287:iload           4
	//* 162  289:istore          10
	//* 163  291:iload           5
	//* 164  293:iload_2         
	//* 165  294:icmpge          352
	//* 166  297:aload           14
	//* 167  299:iload           4
	//* 168  301:bipush          32
	//* 169  303:castore         
	//* 170  304:iload           4
	//* 171  306:iconst_1        
	//* 172  307:iadd            
	//* 173  308:istore          4
	//* 174  310:iload           5
	//* 175  312:iconst_1        
	//* 176  313:iadd            
	//* 177  314:istore          5
	//* 178  316:goto            287
		{
			c = '-';
	//  179  319:bipush          45
	//  180  321:istore_3        
			l = -l;
	//  181  322:lload_0         
	//  182  323:lneg            
	//  183  324:lstore_0        
		}
		j2 = (int)(l % 1000L);
		k = (int)Math.floor(l / 1000L);
		j1 = 0;
		k1 = 0;
		l1 = 0;
		j = k;
		if(k > 0x15180)
		{
			j1 = k / 0x15180;
			j = k - 0x15180 * j1;
		}
		k = j;
		if(j > 3600)
		{
			k1 = j / 3600;
			k = j - k1 * 3600;
		}
		i1 = k;
		if(k > 60)
		{
			l1 = k / 60;
			i1 = k - l1 * 60;
		}
		i2 = 0;
		flag = false;
		if(i != 0)
		{
			j = accumField(j1, 1, false, 0);
			boolean flag1;
			if(j > 0)
				flag1 = true;
			else
	//* 184  325:goto            57
				flag1 = false;
	//  185  328:iconst_0        
	//  186  329:istore          13
			j += accumField(k1, 1, flag1, 2);
			if(j > 0)
				flag1 = true;
			else
	//* 187  331:goto            201
				flag1 = false;
	//  188  334:iconst_0        
	//  189  335:istore          13
			j += accumField(l1, 1, flag1, 2);
			if(j > 0)
				flag1 = true;
			else
	//* 190  337:goto            223
				flag1 = false;
	//  191  340:iconst_0        
	//  192  341:istore          13
			k = j + accumField(i1, 1, flag1, 2);
			if(k > 0)
				j = 3;
			else
	//* 193  343:goto            245
				j = 0;
	//  194  346:iconst_0        
	//  195  347:istore          4
			k += accumField(j2, 2, true, j) + 1;
			j = ((int) (flag));
			do
			{
				i2 = j;
				if(k >= i)
					break;
				ac[j] = ' ';
				j++;
				k++;
			} while(true);
		}
	//* 196  349:goto            267
		ac[i2] = c;
	//  197  352:aload           14
	//  198  354:iload           10
	//  199  356:iload_3         
	//  200  357:castore         
		k = i2 + 1;
	//  201  358:iload           10
	//  202  360:iconst_1        
	//  203  361:iadd            
	//  204  362:istore          5
		boolean flag2;
		if(i != 0)
	//* 205  364:iload_2         
	//* 206  365:ifeq            524
			i = 1;
	//  207  368:iconst_1        
	//  208  369:istore_2        
		else
	//* 209  370:aload           14
	//* 210  372:iload           7
	//* 211  374:bipush          100
	//* 212  376:iload           5
	//* 213  378:iconst_0        
	//* 214  379:iconst_0        
	//* 215  380:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 216  383:istore          7
	//* 217  385:iload           7
	//* 218  387:iload           5
	//* 219  389:icmpeq          529
	//* 220  392:iconst_1        
	//* 221  393:istore          13
	//* 222  395:iload_2         
	//* 223  396:ifeq            535
	//* 224  399:iconst_2        
	//* 225  400:istore          4
	//* 226  402:aload           14
	//* 227  404:iload           8
	//* 228  406:bipush          104
	//* 229  408:iload           7
	//* 230  410:iload           13
	//* 231  412:iload           4
	//* 232  414:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 233  417:istore          7
	//* 234  419:iload           7
	//* 235  421:iload           5
	//* 236  423:icmpeq          541
	//* 237  426:iconst_1        
	//* 238  427:istore          13
	//* 239  429:iload_2         
	//* 240  430:ifeq            547
	//* 241  433:iconst_2        
	//* 242  434:istore          4
	//* 243  436:aload           14
	//* 244  438:iload           9
	//* 245  440:bipush          109
	//* 246  442:iload           7
	//* 247  444:iload           13
	//* 248  446:iload           4
	//* 249  448:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 250  451:istore          7
	//* 251  453:iload           7
	//* 252  455:iload           5
	//* 253  457:icmpeq          553
	//* 254  460:iconst_1        
	//* 255  461:istore          13
	//* 256  463:iload_2         
	//* 257  464:ifeq            559
	//* 258  467:iconst_2        
	//* 259  468:istore          4
	//* 260  470:aload           14
	//* 261  472:iload           6
	//* 262  474:bipush          115
	//* 263  476:iload           7
	//* 264  478:iload           13
	//* 265  480:iload           4
	//* 266  482:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 267  485:istore          4
	//* 268  487:iload_2         
	//* 269  488:ifeq            565
	//* 270  491:iload           4
	//* 271  493:iload           5
	//* 272  495:icmpeq          565
	//* 273  498:iconst_3        
	//* 274  499:istore_2        
	//* 275  500:aload           14
	//* 276  502:iload           12
	//* 277  504:bipush          109
	//* 278  506:iload           4
	//* 279  508:iconst_1        
	//* 280  509:iload_2         
	//* 281  510:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 282  513:istore_2        
	//* 283  514:aload           14
	//* 284  516:iload_2         
	//* 285  517:bipush          115
	//* 286  519:castore         
	//* 287  520:iload_2         
	//* 288  521:iconst_1        
	//* 289  522:iadd            
	//* 290  523:ireturn         
			i = 0;
	//  291  524:iconst_0        
	//  292  525:istore_2        
		j1 = printField(ac, j1, 'd', k, false, 0);
		if(j1 != k)
			flag2 = true;
		else
	//* 293  526:goto            370
			flag2 = false;
	//  294  529:iconst_0        
	//  295  530:istore          13
		if(i != 0)
			j = 2;
		else
	//* 296  532:goto            395
			j = 0;
	//  297  535:iconst_0        
	//  298  536:istore          4
		j1 = printField(ac, k1, 'h', j1, flag2, j);
		if(j1 != k)
			flag2 = true;
		else
	//* 299  538:goto            402
			flag2 = false;
	//  300  541:iconst_0        
	//  301  542:istore          13
		if(i != 0)
			j = 2;
		else
	//* 302  544:goto            429
			j = 0;
	//  303  547:iconst_0        
	//  304  548:istore          4
		j1 = printField(ac, l1, 'm', j1, flag2, j);
		if(j1 != k)
			flag2 = true;
		else
	//* 305  550:goto            436
			flag2 = false;
	//  306  553:iconst_0        
	//  307  554:istore          13
		if(i != 0)
			j = 2;
		else
	//* 308  556:goto            463
			j = 0;
	//  309  559:iconst_0        
	//  310  560:istore          4
		j = printField(ac, i1, 's', j1, flag2, j);
		if(i != 0 && j != k)
			i = 3;
		else
	//* 311  562:goto            470
			i = 0;
	//  312  565:iconst_0        
	//  313  566:istore_2        
		i = printField(ac, j2, 'm', j, true, i);
		ac[i] = 's';
		return i + 1;
	//* 314  567:goto            500
	}

	private static int printField(char ac[], int i, char c, int j, boolean flag, int k)
	{
		int l;
label0:
		{
			int i1;
label1:
			{
				if(!flag)
	//*   0    0:iload           4
	//*   1    2:ifne            12
				{
					l = j;
	//    2    5:iload_3         
	//    3    6:istore          6
					if(i <= 0)
						break label0;
	//    4    8:iload_1         
	//    5    9:ifle            146
				}
				if(!flag || k < 3)
	//*   6   12:iload           4
	//*   7   14:ifeq            23
	//*   8   17:iload           5
	//*   9   19:iconst_3        
	//*  10   20:icmpge          35
				{
					l = i;
	//   11   23:iload_1         
	//   12   24:istore          6
					i1 = j;
	//   13   26:iload_3         
	//   14   27:istore          7
					if(i <= 99)
						break label1;
	//   15   29:iload_1         
	//   16   30:bipush          99
	//   17   32:icmple          64
				}
				l = i / 100;
	//   18   35:iload_1         
	//   19   36:bipush          100
	//   20   38:idiv            
	//   21   39:istore          6
				ac[j] = (char)(l + 48);
	//   22   41:aload_0         
	//   23   42:iload_3         
	//   24   43:iload           6
	//   25   45:bipush          48
	//   26   47:iadd            
	//   27   48:int2char        
	//   28   49:castore         
				i1 = j + 1;
	//   29   50:iload_3         
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:istore          7
				l = i - l * 100;
	//   33   55:iload_1         
	//   34   56:iload           6
	//   35   58:bipush          100
	//   36   60:imul            
	//   37   61:isub            
	//   38   62:istore          6
			}
label2:
			{
				if((!flag || k < 2) && l <= 9)
	//*  39   64:iload           4
	//*  40   66:ifeq            75
	//*  41   69:iload           5
	//*  42   71:iconst_2        
	//*  43   72:icmpge          95
	//*  44   75:iload           6
	//*  45   77:bipush          9
	//*  46   79:icmpgt          95
				{
					k = l;
	//   47   82:iload           6
	//   48   84:istore          5
					i = i1;
	//   49   86:iload           7
	//   50   88:istore_1        
					if(j == i1)
						break label2;
	//   51   89:iload_3         
	//   52   90:iload           7
	//   53   92:icmpeq          124
				}
				j = l / 10;
	//   54   95:iload           6
	//   55   97:bipush          10
	//   56   99:idiv            
	//   57  100:istore_3        
				ac[i1] = (char)(j + 48);
	//   58  101:aload_0         
	//   59  102:iload           7
	//   60  104:iload_3         
	//   61  105:bipush          48
	//   62  107:iadd            
	//   63  108:int2char        
	//   64  109:castore         
				i = i1 + 1;
	//   65  110:iload           7
	//   66  112:iconst_1        
	//   67  113:iadd            
	//   68  114:istore_1        
				k = l - j * 10;
	//   69  115:iload           6
	//   70  117:iload_3         
	//   71  118:bipush          10
	//   72  120:imul            
	//   73  121:isub            
	//   74  122:istore          5
			}
			ac[i] = (char)(k + 48);
	//   75  124:aload_0         
	//   76  125:iload_1         
	//   77  126:iload           5
	//   78  128:bipush          48
	//   79  130:iadd            
	//   80  131:int2char        
	//   81  132:castore         
			i++;
	//   82  133:iload_1         
	//   83  134:iconst_1        
	//   84  135:iadd            
	//   85  136:istore_1        
			ac[i] = c;
	//   86  137:aload_0         
	//   87  138:iload_1         
	//   88  139:iload_2         
	//   89  140:castore         
			l = i + 1;
	//   90  141:iload_1         
	//   91  142:iconst_1        
	//   92  143:iadd            
	//   93  144:istore          6
		}
		return l;
	//   94  146:iload           6
	//   95  148:ireturn         
	}

	public static final int HUNDRED_DAY_FIELD_LEN = 19;
	private static final int SECONDS_PER_DAY = 0x15180;
	private static final int SECONDS_PER_HOUR = 3600;
	private static final int SECONDS_PER_MINUTE = 60;
	private static char sFormatStr[] = new char[24];
	private static final Object sFormatSync = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void Object()>
	//    3    7:putstatic       #28  <Field Object sFormatSync>
	//    4   10:bipush          24
	//    5   12:newarray        char[]
	//    6   14:putstatic       #30  <Field char[] sFormatStr>
	//*   7   17:return          
	}
}
