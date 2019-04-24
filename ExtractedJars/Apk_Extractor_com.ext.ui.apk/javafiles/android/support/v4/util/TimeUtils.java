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
	//    8   17:astore          13
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
	//   17   31:aload           13
	//   18   33:iconst_0        
	//   19   34:bipush          32
	//   20   36:castore         
	//*  21   37:goto            25
			ac[0] = '0';
	//   22   40:aload           13
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
		int j2;
		int k2;
		if(l > 0L)
	//*  28   48:lload_0         
	//*  29   49:lconst_0        
	//*  30   50:lcmp            
	//*  31   51:ifle            310
		{
			c = '+';
	//   32   54:bipush          43
	//   33   56:istore_3        
		} else
	//*  34   57:lload_0         
	//*  35   58:ldc2w           #65  <Long 1000L>
	//*  36   61:lrem            
	//*  37   62:l2i             
	//*  38   63:istore          11
	//*  39   65:lload_0         
	//*  40   66:ldc2w           #65  <Long 1000L>
	//*  41   69:ldiv            
	//*  42   70:l2d             
	//*  43   71:invokestatic    #72  <Method double Math.floor(double)>
	//*  44   74:d2i             
	//*  45   75:istore          6
	//*  46   77:iconst_0        
	//*  47   78:istore          5
	//*  48   80:iload           6
	//*  49   82:istore          4
	//*  50   84:iload           6
	//*  51   86:ldc1            #13  <Int 0x15180>
	//*  52   88:icmple          108
	//*  53   91:iload           6
	//*  54   93:ldc1            #13  <Int 0x15180>
	//*  55   95:idiv            
	//*  56   96:istore          5
	//*  57   98:iload           6
	//*  58  100:ldc1            #13  <Int 0x15180>
	//*  59  102:iload           5
	//*  60  104:imul            
	//*  61  105:isub            
	//*  62  106:istore          4
	//*  63  108:iload           4
	//*  64  110:sipush          3600
	//*  65  113:icmple          574
	//*  66  116:iload           4
	//*  67  118:sipush          3600
	//*  68  121:idiv            
	//*  69  122:istore          6
	//*  70  124:iload           6
	//*  71  126:istore          7
	//*  72  128:iload           4
	//*  73  130:iload           6
	//*  74  132:sipush          3600
	//*  75  135:imul            
	//*  76  136:isub            
	//*  77  137:istore          4
	//*  78  139:iload           4
	//*  79  141:bipush          60
	//*  80  143:icmple          564
	//*  81  146:iload           4
	//*  82  148:bipush          60
	//*  83  150:idiv            
	//*  84  151:istore          6
	//*  85  153:iload           6
	//*  86  155:istore          8
	//*  87  157:iload           4
	//*  88  159:iload           6
	//*  89  161:bipush          60
	//*  90  163:imul            
	//*  91  164:isub            
	//*  92  165:istore          6
	//*  93  167:iload_2         
	//*  94  168:ifeq            343
	//*  95  171:iload           5
	//*  96  173:iconst_1        
	//*  97  174:iconst_0        
	//*  98  175:iconst_0        
	//*  99  176:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 100  179:istore          4
	//* 101  181:iload           4
	//* 102  183:ifle            319
	//* 103  186:iconst_1        
	//* 104  187:istore          12
	//* 105  189:iload           4
	//* 106  191:iload           7
	//* 107  193:iconst_1        
	//* 108  194:iload           12
	//* 109  196:iconst_2        
	//* 110  197:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 111  200:iadd            
	//* 112  201:istore          4
	//* 113  203:iload           4
	//* 114  205:ifle            325
	//* 115  208:iconst_1        
	//* 116  209:istore          12
	//* 117  211:iload           4
	//* 118  213:iload           8
	//* 119  215:iconst_1        
	//* 120  216:iload           12
	//* 121  218:iconst_2        
	//* 122  219:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 123  222:iadd            
	//* 124  223:istore          4
	//* 125  225:iload           4
	//* 126  227:ifle            331
	//* 127  230:iconst_1        
	//* 128  231:istore          12
	//* 129  233:iload           4
	//* 130  235:iload           6
	//* 131  237:iconst_1        
	//* 132  238:iload           12
	//* 133  240:iconst_2        
	//* 134  241:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 135  244:iadd            
	//* 136  245:istore          9
	//* 137  247:iload           9
	//* 138  249:ifle            337
	//* 139  252:iconst_3        
	//* 140  253:istore          4
	//* 141  255:iload           11
	//* 142  257:iconst_2        
	//* 143  258:iconst_1        
	//* 144  259:iload           4
	//* 145  261:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//* 146  264:istore          10
	//* 147  266:iconst_0        
	//* 148  267:istore          4
	//* 149  269:iload           10
	//* 150  271:iconst_1        
	//* 151  272:iadd            
	//* 152  273:iload           9
	//* 153  275:iadd            
	//* 154  276:istore          9
	//* 155  278:iload           4
	//* 156  280:istore          10
	//* 157  282:iload           9
	//* 158  284:iload_2         
	//* 159  285:icmpge          346
	//* 160  288:aload           13
	//* 161  290:iload           4
	//* 162  292:bipush          32
	//* 163  294:castore         
	//* 164  295:iload           9
	//* 165  297:iconst_1        
	//* 166  298:iadd            
	//* 167  299:istore          9
	//* 168  301:iload           4
	//* 169  303:iconst_1        
	//* 170  304:iadd            
	//* 171  305:istore          4
	//* 172  307:goto            278
		{
			l = -l;
	//  173  310:lload_0         
	//  174  311:lneg            
	//  175  312:lstore_0        
			c = '-';
	//  176  313:bipush          45
	//  177  315:istore_3        
		}
		k2 = (int)(l % 1000L);
		i1 = (int)Math.floor(l / 1000L);
		k = 0;
		j = i1;
		if(i1 > 0x15180)
		{
			k = i1 / 0x15180;
			j = i1 - 0x15180 * k;
		}
		int i2;
		boolean flag1;
		if(j > 3600)
		{
			i1 = j / 3600;
			j1 = i1;
			j -= i1 * 3600;
		} else
	//* 178  316:goto            57
	//* 179  319:iconst_0        
	//* 180  320:istore          12
	//* 181  322:goto            189
	//* 182  325:iconst_0        
	//* 183  326:istore          12
	//* 184  328:goto            211
	//* 185  331:iconst_0        
	//* 186  332:istore          12
	//* 187  334:goto            233
	//* 188  337:iconst_0        
	//* 189  338:istore          4
	//* 190  340:goto            255
	//* 191  343:iconst_0        
	//* 192  344:istore          10
	//* 193  346:aload           13
	//* 194  348:iload           10
	//* 195  350:iload_3         
	//* 196  351:castore         
	//* 197  352:iload           10
	//* 198  354:iconst_1        
	//* 199  355:iadd            
	//* 200  356:istore          9
	//* 201  358:iload_2         
	//* 202  359:ifeq            518
	//* 203  362:iconst_1        
	//* 204  363:istore_2        
	//* 205  364:aload           13
	//* 206  366:iload           5
	//* 207  368:bipush          100
	//* 208  370:iload           9
	//* 209  372:iconst_0        
	//* 210  373:iconst_0        
	//* 211  374:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 212  377:istore          5
	//* 213  379:iload           5
	//* 214  381:iload           9
	//* 215  383:icmpeq          523
	//* 216  386:iconst_1        
	//* 217  387:istore          12
	//* 218  389:iload_2         
	//* 219  390:ifeq            529
	//* 220  393:iconst_2        
	//* 221  394:istore          4
	//* 222  396:aload           13
	//* 223  398:iload           7
	//* 224  400:bipush          104
	//* 225  402:iload           5
	//* 226  404:iload           12
	//* 227  406:iload           4
	//* 228  408:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 229  411:istore          5
	//* 230  413:iload           5
	//* 231  415:iload           9
	//* 232  417:icmpeq          535
	//* 233  420:iconst_1        
	//* 234  421:istore          12
	//* 235  423:iload_2         
	//* 236  424:ifeq            541
	//* 237  427:iconst_2        
	//* 238  428:istore          4
	//* 239  430:aload           13
	//* 240  432:iload           8
	//* 241  434:bipush          109
	//* 242  436:iload           5
	//* 243  438:iload           12
	//* 244  440:iload           4
	//* 245  442:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 246  445:istore          5
	//* 247  447:iload           5
	//* 248  449:iload           9
	//* 249  451:icmpeq          547
	//* 250  454:iconst_1        
	//* 251  455:istore          12
	//* 252  457:iload_2         
	//* 253  458:ifeq            553
	//* 254  461:iconst_2        
	//* 255  462:istore          4
	//* 256  464:aload           13
	//* 257  466:iload           6
	//* 258  468:bipush          115
	//* 259  470:iload           5
	//* 260  472:iload           12
	//* 261  474:iload           4
	//* 262  476:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 263  479:istore          4
	//* 264  481:iload_2         
	//* 265  482:ifeq            559
	//* 266  485:iload           4
	//* 267  487:iload           9
	//* 268  489:icmpeq          559
	//* 269  492:iconst_3        
	//* 270  493:istore_2        
	//* 271  494:aload           13
	//* 272  496:iload           11
	//* 273  498:bipush          109
	//* 274  500:iload           4
	//* 275  502:iconst_1        
	//* 276  503:iload_2         
	//* 277  504:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//* 278  507:istore_2        
	//* 279  508:aload           13
	//* 280  510:iload_2         
	//* 281  511:bipush          115
	//* 282  513:castore         
	//* 283  514:iload_2         
	//* 284  515:iconst_1        
	//* 285  516:iadd            
	//* 286  517:ireturn         
	//* 287  518:iconst_0        
	//* 288  519:istore_2        
	//* 289  520:goto            364
	//* 290  523:iconst_0        
	//* 291  524:istore          12
	//* 292  526:goto            389
	//* 293  529:iconst_0        
	//* 294  530:istore          4
	//* 295  532:goto            396
	//* 296  535:iconst_0        
	//* 297  536:istore          12
	//* 298  538:goto            423
	//* 299  541:iconst_0        
	//* 300  542:istore          4
	//* 301  544:goto            430
	//* 302  547:iconst_0        
	//* 303  548:istore          12
	//* 304  550:goto            457
	//* 305  553:iconst_0        
	//* 306  554:istore          4
	//* 307  556:goto            464
	//* 308  559:iconst_0        
	//* 309  560:istore_2        
	//* 310  561:goto            494
	//* 311  564:iconst_0        
	//* 312  565:istore          8
	//* 313  567:iload           4
	//* 314  569:istore          6
	//* 315  571:goto            167
		{
			j1 = 0;
	//  316  574:iconst_0        
	//  317  575:istore          7
		}
		if(j > 60)
		{
			i1 = j / 60;
			k1 = i1;
			i1 = j - i1 * 60;
		} else
		{
			k1 = 0;
			i1 = j;
		}
		if(i != 0)
		{
			j = accumField(k, 1, false, 0);
			int l1;
			boolean flag;
			if(j > 0)
				flag = true;
			else
				flag = false;
			j += accumField(j1, 1, flag, 2);
			if(j > 0)
				flag = true;
			else
				flag = false;
			j += accumField(k1, 1, flag, 2);
			if(j > 0)
				flag = true;
			else
				flag = false;
			l1 = j + accumField(i1, 1, flag, 2);
			if(l1 > 0)
				j = 3;
			else
				j = 0;
			j2 = accumField(k2, 2, true, j);
			j = 0;
			l1 = j2 + 1 + l1;
			do
			{
				j2 = j;
				if(l1 >= i)
					break;
				ac[j] = ' ';
				l1++;
				j++;
			} while(true);
		} else
		{
			j2 = 0;
		}
		ac[j2] = c;
		i2 = j2 + 1;
		if(i != 0)
			i = 1;
		else
			i = 0;
		k = printField(ac, k, 'd', i2, false, 0);
		if(k != i2)
			flag1 = true;
		else
			flag1 = false;
		if(i != 0)
			j = 2;
		else
			j = 0;
		k = printField(ac, j1, 'h', k, flag1, j);
		if(k != i2)
			flag1 = true;
		else
			flag1 = false;
		if(i != 0)
			j = 2;
		else
			j = 0;
		k = printField(ac, k1, 'm', k, flag1, j);
		if(k != i2)
			flag1 = true;
		else
			flag1 = false;
		if(i != 0)
			j = 2;
		else
			j = 0;
		j = printField(ac, i1, 's', k, flag1, j);
		if(i != 0 && j != i2)
			i = 3;
		else
			i = 0;
		i = printField(ac, k2, 'm', j, true, i);
		ac[i] = 's';
		return i + 1;
	//* 318  577:goto            139
	}

	private static int printField(char ac[], int i, char c, int j, boolean flag, int k)
	{
label0:
		{
label1:
			{
				int l;
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
	//    5    9:ifle            139
				}
				int j1;
				if(flag && k >= 3 || i > 99)
	//*   6   12:iload           4
	//*   7   14:ifeq            23
	//*   8   17:iload           5
	//*   9   19:iconst_3        
	//*  10   20:icmpge          29
	//*  11   23:iload_1         
	//*  12   24:bipush          99
	//*  13   26:icmple          142
				{
					int i1 = i / 100;
	//   14   29:iload_1         
	//   15   30:bipush          100
	//   16   32:idiv            
	//   17   33:istore          7
					ac[j] = (char)(i1 + 48);
	//   18   35:aload_0         
	//   19   36:iload_3         
	//   20   37:iload           7
	//   21   39:bipush          48
	//   22   41:iadd            
	//   23   42:int2char        
	//   24   43:castore         
					l = j + 1;
	//   25   44:iload_3         
	//   26   45:iconst_1        
	//   27   46:iadd            
	//   28   47:istore          6
					i -= i1 * 100;
	//   29   49:iload_1         
	//   30   50:iload           7
	//   31   52:bipush          100
	//   32   54:imul            
	//   33   55:isub            
	//   34   56:istore_1        
				} else
	//*  35   57:iload           4
	//*  36   59:ifeq            68
	//*  37   62:iload           5
	//*  38   64:iconst_2        
	//*  39   65:icmpge          87
	//*  40   68:iload_1         
	//*  41   69:bipush          9
	//*  42   71:icmpgt          87
	//*  43   74:iload           6
	//*  44   76:istore          7
	//*  45   78:iload_1         
	//*  46   79:istore          5
	//*  47   81:iload_3         
	//*  48   82:iload           6
	//*  49   84:icmpeq          115
	//*  50   87:iload_1         
	//*  51   88:bipush          10
	//*  52   90:idiv            
	//*  53   91:istore_3        
	//*  54   92:aload_0         
	//*  55   93:iload           6
	//*  56   95:iload_3         
	//*  57   96:bipush          48
	//*  58   98:iadd            
	//*  59   99:int2char        
	//*  60  100:castore         
	//*  61  101:iload           6
	//*  62  103:iconst_1        
	//*  63  104:iadd            
	//*  64  105:istore          7
	//*  65  107:iload_1         
	//*  66  108:iload_3         
	//*  67  109:bipush          10
	//*  68  111:imul            
	//*  69  112:isub            
	//*  70  113:istore          5
	//*  71  115:aload_0         
	//*  72  116:iload           7
	//*  73  118:iload           5
	//*  74  120:bipush          48
	//*  75  122:iadd            
	//*  76  123:int2char        
	//*  77  124:castore         
	//*  78  125:iload           7
	//*  79  127:iconst_1        
	//*  80  128:iadd            
	//*  81  129:istore_1        
	//*  82  130:aload_0         
	//*  83  131:iload_1         
	//*  84  132:iload_2         
	//*  85  133:castore         
	//*  86  134:iload_1         
	//*  87  135:iconst_1        
	//*  88  136:iadd            
	//*  89  137:istore          6
	//*  90  139:iload           6
	//*  91  141:ireturn         
				{
					l = j;
	//   92  142:iload_3         
	//   93  143:istore          6
				}
				if((!flag || k < 2) && i <= 9)
				{
					j1 = l;
					k = i;
					if(j == l)
						break label1;
				}
				j = i / 10;
				ac[l] = (char)(j + 48);
				j1 = l + 1;
				k = i - j * 10;
			}
			ac[j1] = (char)(k + 48);
			i = j1 + 1;
			ac[i] = c;
			l = i + 1;
		}
		return l;
	//*  94  145:goto            57
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
