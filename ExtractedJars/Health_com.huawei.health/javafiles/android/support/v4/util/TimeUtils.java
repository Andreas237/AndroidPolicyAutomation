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
		Object obj = sFormatSync;
	//    0    0:getstatic       #28  <Field Object sFormatSync>
	//    1    3:astore          4
		obj;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
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
		obj;
	//   16   30:aload           4
		JVM INSTR monitorexit ;
	//   17   32:monitorexit     
		return;
	//   18   33:return          
		printwriter;
	//   19   34:astore_2        
	//*  20   35:aload           4
		throw printwriter;
	//   21   37:monitorexit     
	//   22   38:aload_2         
	//   23   39:athrow          
	}

	public static void formatDuration(long l, StringBuilder stringbuilder)
	{
		Object obj = sFormatSync;
	//    0    0:getstatic       #28  <Field Object sFormatSync>
	//    1    3:astore          4
		obj;
	//    2    5:aload           4
		JVM INSTR monitorenter ;
	//    3    7:monitorenter    
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
		obj;
	//   14   24:aload           4
		JVM INSTR monitorexit ;
	//   15   26:monitorexit     
		return;
	//   16   27:return          
		stringbuilder;
	//   17   28:astore_2        
	//*  18   29:aload           4
		throw stringbuilder;
	//   19   31:monitorexit     
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
		if(l > 0L)
	//*  28   48:lload_0         
	//*  29   49:lconst_0        
	//*  30   50:lcmp            
	//*  31   51:ifle            60
		{
			c = '+';
	//   32   54:bipush          43
	//   33   56:istore_3        
		} else
	//*  34   57:goto            66
		{
			c = '-';
	//   35   60:bipush          45
	//   36   62:istore_3        
			l = -l;
	//   37   63:lload_0         
	//   38   64:lneg            
	//   39   65:lstore_0        
		}
		int j2 = (int)(l % 1000L);
	//   40   66:lload_0         
	//   41   67:ldc2w           #65  <Long 1000L>
	//   42   70:lrem            
	//   43   71:l2i             
	//   44   72:istore          12
		int k = (int)Math.floor(l / 1000L);
	//   45   74:lload_0         
	//   46   75:ldc2w           #65  <Long 1000L>
	//   47   78:ldiv            
	//   48   79:l2d             
	//   49   80:invokestatic    #72  <Method double Math.floor(double)>
	//   50   83:d2i             
	//   51   84:istore          5
		int j1 = 0;
	//   52   86:iconst_0        
	//   53   87:istore          7
		int k1 = 0;
	//   54   89:iconst_0        
	//   55   90:istore          8
		int l1 = 0;
	//   56   92:iconst_0        
	//   57   93:istore          9
		int j = k;
	//   58   95:iload           5
	//   59   97:istore          4
		if(k > 0x15180)
	//*  60   99:iload           5
	//*  61  101:ldc1            #13  <Int 0x15180>
	//*  62  103:icmple          123
		{
			j1 = k / 0x15180;
	//   63  106:iload           5
	//   64  108:ldc1            #13  <Int 0x15180>
	//   65  110:idiv            
	//   66  111:istore          7
			j = k - 0x15180 * j1;
	//   67  113:iload           5
	//   68  115:ldc1            #13  <Int 0x15180>
	//   69  117:iload           7
	//   70  119:imul            
	//   71  120:isub            
	//   72  121:istore          4
		}
		k = j;
	//   73  123:iload           4
	//   74  125:istore          5
		if(j > 3600)
	//*  75  127:iload           4
	//*  76  129:sipush          3600
	//*  77  132:icmple          154
		{
			k1 = j / 3600;
	//   78  135:iload           4
	//   79  137:sipush          3600
	//   80  140:idiv            
	//   81  141:istore          8
			k = j - k1 * 3600;
	//   82  143:iload           4
	//   83  145:iload           8
	//   84  147:sipush          3600
	//   85  150:imul            
	//   86  151:isub            
	//   87  152:istore          5
		}
		int i1 = k;
	//   88  154:iload           5
	//   89  156:istore          6
		if(k > 60)
	//*  90  158:iload           5
	//*  91  160:bipush          60
	//*  92  162:icmple          182
		{
			l1 = k / 60;
	//   93  165:iload           5
	//   94  167:bipush          60
	//   95  169:idiv            
	//   96  170:istore          9
			i1 = k - l1 * 60;
	//   97  172:iload           5
	//   98  174:iload           9
	//   99  176:bipush          60
	//  100  178:imul            
	//  101  179:isub            
	//  102  180:istore          6
		}
		int i2 = 0;
	//  103  182:iconst_0        
	//  104  183:istore          10
		boolean flag = false;
	//  105  185:iconst_0        
	//  106  186:istore          11
		if(i != 0)
	//* 107  188:iload_2         
	//* 108  189:ifeq            352
		{
			j = accumField(j1, 1, false, 0);
	//  109  192:iload           7
	//  110  194:iconst_1        
	//  111  195:iconst_0        
	//  112  196:iconst_0        
	//  113  197:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  114  200:istore          4
			boolean flag1;
			if(j > 0)
	//* 115  202:iload           4
	//* 116  204:ifle            213
				flag1 = true;
	//  117  207:iconst_1        
	//  118  208:istore          13
			else
	//* 119  210:goto            216
				flag1 = false;
	//  120  213:iconst_0        
	//  121  214:istore          13
			j += accumField(k1, 1, flag1, 2);
	//  122  216:iload           4
	//  123  218:iload           8
	//  124  220:iconst_1        
	//  125  221:iload           13
	//  126  223:iconst_2        
	//  127  224:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  128  227:iadd            
	//  129  228:istore          4
			if(j > 0)
	//* 130  230:iload           4
	//* 131  232:ifle            241
				flag1 = true;
	//  132  235:iconst_1        
	//  133  236:istore          13
			else
	//* 134  238:goto            244
				flag1 = false;
	//  135  241:iconst_0        
	//  136  242:istore          13
			j += accumField(l1, 1, flag1, 2);
	//  137  244:iload           4
	//  138  246:iload           9
	//  139  248:iconst_1        
	//  140  249:iload           13
	//  141  251:iconst_2        
	//  142  252:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  143  255:iadd            
	//  144  256:istore          4
			if(j > 0)
	//* 145  258:iload           4
	//* 146  260:ifle            269
				flag1 = true;
	//  147  263:iconst_1        
	//  148  264:istore          13
			else
	//* 149  266:goto            272
				flag1 = false;
	//  150  269:iconst_0        
	//  151  270:istore          13
			k = j + accumField(i1, 1, flag1, 2);
	//  152  272:iload           4
	//  153  274:iload           6
	//  154  276:iconst_1        
	//  155  277:iload           13
	//  156  279:iconst_2        
	//  157  280:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  158  283:iadd            
	//  159  284:istore          5
			if(k > 0)
	//* 160  286:iload           5
	//* 161  288:ifle            297
				j = 3;
	//  162  291:iconst_3        
	//  163  292:istore          4
			else
	//* 164  294:goto            300
				j = 0;
	//  165  297:iconst_0        
	//  166  298:istore          4
			k += accumField(j2, 2, true, j) + 1;
	//  167  300:iload           5
	//  168  302:iload           12
	//  169  304:iconst_2        
	//  170  305:iconst_1        
	//  171  306:iload           4
	//  172  308:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  173  311:iconst_1        
	//  174  312:iadd            
	//  175  313:iadd            
	//  176  314:istore          5
			j = ((int) (flag));
	//  177  316:iload           11
	//  178  318:istore          4
			do
			{
				i2 = j;
	//  179  320:iload           4
	//  180  322:istore          10
				if(k >= i)
					break;
	//  181  324:iload           5
	//  182  326:iload_2         
	//  183  327:icmpge          352
				ac[j] = ' ';
	//  184  330:aload           14
	//  185  332:iload           4
	//  186  334:bipush          32
	//  187  336:castore         
				j++;
	//  188  337:iload           4
	//  189  339:iconst_1        
	//  190  340:iadd            
	//  191  341:istore          4
				k++;
	//  192  343:iload           5
	//  193  345:iconst_1        
	//  194  346:iadd            
	//  195  347:istore          5
			} while(true);
	//  196  349:goto            320
		}
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
		if(i != 0)
	//* 205  364:iload_2         
	//* 206  365:ifeq            373
			i = 1;
	//  207  368:iconst_1        
	//  208  369:istore_2        
		else
	//* 209  370:goto            375
			i = 0;
	//  210  373:iconst_0        
	//  211  374:istore_2        
		j1 = printField(ac, j1, 'd', k, false, 0);
	//  212  375:aload           14
	//  213  377:iload           7
	//  214  379:bipush          100
	//  215  381:iload           5
	//  216  383:iconst_0        
	//  217  384:iconst_0        
	//  218  385:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  219  388:istore          7
		boolean flag2;
		if(j1 != k)
	//* 220  390:iload           7
	//* 221  392:iload           5
	//* 222  394:icmpeq          403
			flag2 = true;
	//  223  397:iconst_1        
	//  224  398:istore          13
		else
	//* 225  400:goto            406
			flag2 = false;
	//  226  403:iconst_0        
	//  227  404:istore          13
		if(i != 0)
	//* 228  406:iload_2         
	//* 229  407:ifeq            416
			j = 2;
	//  230  410:iconst_2        
	//  231  411:istore          4
		else
	//* 232  413:goto            419
			j = 0;
	//  233  416:iconst_0        
	//  234  417:istore          4
		j1 = printField(ac, k1, 'h', j1, flag2, j);
	//  235  419:aload           14
	//  236  421:iload           8
	//  237  423:bipush          104
	//  238  425:iload           7
	//  239  427:iload           13
	//  240  429:iload           4
	//  241  431:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  242  434:istore          7
		if(j1 != k)
	//* 243  436:iload           7
	//* 244  438:iload           5
	//* 245  440:icmpeq          449
			flag2 = true;
	//  246  443:iconst_1        
	//  247  444:istore          13
		else
	//* 248  446:goto            452
			flag2 = false;
	//  249  449:iconst_0        
	//  250  450:istore          13
		if(i != 0)
	//* 251  452:iload_2         
	//* 252  453:ifeq            462
			j = 2;
	//  253  456:iconst_2        
	//  254  457:istore          4
		else
	//* 255  459:goto            465
			j = 0;
	//  256  462:iconst_0        
	//  257  463:istore          4
		j1 = printField(ac, l1, 'm', j1, flag2, j);
	//  258  465:aload           14
	//  259  467:iload           9
	//  260  469:bipush          109
	//  261  471:iload           7
	//  262  473:iload           13
	//  263  475:iload           4
	//  264  477:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  265  480:istore          7
		if(j1 != k)
	//* 266  482:iload           7
	//* 267  484:iload           5
	//* 268  486:icmpeq          495
			flag2 = true;
	//  269  489:iconst_1        
	//  270  490:istore          13
		else
	//* 271  492:goto            498
			flag2 = false;
	//  272  495:iconst_0        
	//  273  496:istore          13
		if(i != 0)
	//* 274  498:iload_2         
	//* 275  499:ifeq            508
			j = 2;
	//  276  502:iconst_2        
	//  277  503:istore          4
		else
	//* 278  505:goto            511
			j = 0;
	//  279  508:iconst_0        
	//  280  509:istore          4
		j = printField(ac, i1, 's', j1, flag2, j);
	//  281  511:aload           14
	//  282  513:iload           6
	//  283  515:bipush          115
	//  284  517:iload           7
	//  285  519:iload           13
	//  286  521:iload           4
	//  287  523:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  288  526:istore          4
		if(i != 0 && j != k)
	//* 289  528:iload_2         
	//* 290  529:ifeq            544
	//* 291  532:iload           4
	//* 292  534:iload           5
	//* 293  536:icmpeq          544
			i = 3;
	//  294  539:iconst_3        
	//  295  540:istore_2        
		else
	//* 296  541:goto            546
			i = 0;
	//  297  544:iconst_0        
	//  298  545:istore_2        
		i = printField(ac, j2, 'm', j, true, i);
	//  299  546:aload           14
	//  300  548:iload           12
	//  301  550:bipush          109
	//  302  552:iload           4
	//  303  554:iconst_1        
	//  304  555:iload_2         
	//  305  556:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  306  559:istore_2        
		ac[i] = 's';
	//  307  560:aload           14
	//  308  562:iload_2         
	//  309  563:bipush          115
	//  310  565:castore         
		return i + 1;
	//  311  566:iload_2         
	//  312  567:iconst_1        
	//  313  568:iadd            
	//  314  569:ireturn         
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
