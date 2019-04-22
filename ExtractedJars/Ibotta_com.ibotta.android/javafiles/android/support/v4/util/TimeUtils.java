// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;

import java.io.PrintWriter;

public final class TimeUtils
{

	private static int accumField(int i, int j, boolean flag, int k)
	{
		if(i <= 99 && (!flag || k < 3))
	//*   0    0:iload_0         
	//*   1    1:bipush          99
	//*   2    3:icmpgt          57
	//*   3    6:iload_2         
	//*   4    7:ifeq            18
	//*   5   10:iload_3         
	//*   6   11:iconst_3        
	//*   7   12:icmplt          18
	//*   8   15:goto            57
		{
			if(i <= 9 && (!flag || k < 2))
	//*   9   18:iload_0         
	//*  10   19:bipush          9
	//*  11   21:icmpgt          53
	//*  12   24:iload_2         
	//*  13   25:ifeq            36
	//*  14   28:iload_3         
	//*  15   29:iconst_2        
	//*  16   30:icmplt          36
	//*  17   33:goto            53
			{
				if(!flag && i <= 0)
	//*  18   36:iload_2         
	//*  19   37:ifne            49
	//*  20   40:iload_0         
	//*  21   41:ifle            47
	//*  22   44:goto            49
					return 0;
	//   23   47:iconst_0        
	//   24   48:ireturn         
				else
					return j + 1;
	//   25   49:iload_1         
	//   26   50:iconst_1        
	//   27   51:iadd            
	//   28   52:ireturn         
			} else
			{
				return j + 2;
	//   29   53:iload_1         
	//   30   54:iconst_2        
	//   31   55:iadd            
	//   32   56:ireturn         
			}
		} else
		{
			return j + 3;
	//   33   57:iload_1         
	//   34   58:iconst_3        
	//   35   59:iadd            
	//   36   60:ireturn         
		}
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
	//    5    8:ldc1            #28  <String "--">
	//    6   10:invokevirtual   #34  <Method void PrintWriter.print(String)>
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
	//   13   20:invokestatic    #37  <Method void formatDuration(long, PrintWriter, int)>
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
	//    3    3:invokestatic    #37  <Method void formatDuration(long, PrintWriter, int)>
	//    4    6:return          
	}

	public static void formatDuration(long l, PrintWriter printwriter, int i)
	{
		synchronized(sFormatSync)
	//*   0    0:getstatic       #19  <Field Object sFormatSync>
	//*   1    3:astore          4
	//*   2    5:aload           4
	//*   3    7:monitorenter    
		{
			i = formatDurationLocked(l, i);
	//    4    8:lload_0         
	//    5    9:iload_3         
	//    6   10:invokestatic    #43  <Method int formatDurationLocked(long, int)>
	//    7   13:istore_3        
			printwriter.print(new String(sFormatStr, 0, i));
	//    8   14:aload_2         
	//    9   15:new             #45  <Class String>
	//   10   18:dup             
	//   11   19:getstatic       #21  <Field char[] sFormatStr>
	//   12   22:iconst_0        
	//   13   23:iload_3         
	//   14   24:invokespecial   #48  <Method void String(char[], int, int)>
	//   15   27:invokevirtual   #34  <Method void PrintWriter.print(String)>
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

	private static int formatDurationLocked(long l, int i)
	{
		if(sFormatStr.length < i)
	//*   0    0:getstatic       #21  <Field char[] sFormatStr>
	//*   1    3:arraylength     
	//*   2    4:iload_2         
	//*   3    5:icmpge          14
			sFormatStr = new char[i];
	//    4    8:iload_2         
	//    5    9:newarray        char[]
	//    6   11:putstatic       #21  <Field char[] sFormatStr>
		char ac[] = sFormatStr;
	//    7   14:getstatic       #21  <Field char[] sFormatStr>
	//    8   17:astore          13
		int j = l != 0L;
	//    9   19:lload_0         
	//   10   20:lconst_0        
	//   11   21:lcmp            
	//   12   22:istore          4
		if(j == 0)
	//*  13   24:iload           4
	//*  14   26:ifne            52
		{
			while(i - 1 > 0) 
	//*  15   29:iload_2         
	//*  16   30:iconst_1        
	//*  17   31:isub            
	//*  18   32:ifle            44
				ac[0] = ' ';
	//   19   35:aload           13
	//   20   37:iconst_0        
	//   21   38:bipush          32
	//   22   40:castore         
	//*  23   41:goto            29
			ac[0] = '0';
	//   24   44:aload           13
	//   25   46:iconst_0        
	//   26   47:bipush          48
	//   27   49:castore         
			return 1;
	//   28   50:iconst_1        
	//   29   51:ireturn         
		}
		char c;
		if(j > 0)
	//*  30   52:iload           4
	//*  31   54:ifle            63
		{
			c = '+';
	//   32   57:bipush          43
	//   33   59:istore_3        
		} else
	//*  34   60:goto            69
		{
			c = '-';
	//   35   63:bipush          45
	//   36   65:istore_3        
			l = -l;
	//   37   66:lload_0         
	//   38   67:lneg            
	//   39   68:lstore_0        
		}
		int k2 = (int)(l % 1000L);
	//   40   69:lload_0         
	//   41   70:ldc2w           #49  <Long 1000L>
	//   42   73:lrem            
	//   43   74:l2i             
	//   44   75:istore          11
		j = (int)Math.floor(l / 1000L);
	//   45   77:lload_0         
	//   46   78:ldc2w           #49  <Long 1000L>
	//   47   81:ldiv            
	//   48   82:l2d             
	//   49   83:invokestatic    #56  <Method double Math.floor(double)>
	//   50   86:d2i             
	//   51   87:istore          4
		int i1;
		if(j > 0x15180)
	//*  52   89:iload           4
	//*  53   91:ldc1            #57  <Int 0x15180>
	//*  54   93:icmple          116
		{
			i1 = j / 0x15180;
	//   55   96:iload           4
	//   56   98:ldc1            #57  <Int 0x15180>
	//   57  100:idiv            
	//   58  101:istore          6
			j -= 0x15180 * i1;
	//   59  103:iload           4
	//   60  105:ldc1            #57  <Int 0x15180>
	//   61  107:iload           6
	//   62  109:imul            
	//   63  110:isub            
	//   64  111:istore          4
		} else
	//*  65  113:goto            119
		{
			i1 = 0;
	//   66  116:iconst_0        
	//   67  117:istore          6
		}
		int j1;
		if(j > 3600)
	//*  68  119:iload           4
	//*  69  121:sipush          3600
	//*  70  124:icmple          149
		{
			j1 = j / 3600;
	//   71  127:iload           4
	//   72  129:sipush          3600
	//   73  132:idiv            
	//   74  133:istore          7
			j -= j1 * 3600;
	//   75  135:iload           4
	//   76  137:iload           7
	//   77  139:sipush          3600
	//   78  142:imul            
	//   79  143:isub            
	//   80  144:istore          4
		} else
	//*  81  146:goto            152
		{
			j1 = 0;
	//   82  149:iconst_0        
	//   83  150:istore          7
		}
		int k;
		int k1;
		if(j > 60)
	//*  84  152:iload           4
	//*  85  154:bipush          60
	//*  86  156:icmple          179
		{
			k1 = j / 60;
	//   87  159:iload           4
	//   88  161:bipush          60
	//   89  163:idiv            
	//   90  164:istore          8
			k = j - k1 * 60;
	//   91  166:iload           4
	//   92  168:iload           8
	//   93  170:bipush          60
	//   94  172:imul            
	//   95  173:isub            
	//   96  174:istore          5
		} else
	//*  97  176:goto            186
		{
			k1 = 0;
	//   98  179:iconst_0        
	//   99  180:istore          8
			k = j;
	//  100  182:iload           4
	//  101  184:istore          5
		}
		int j2;
		if(i != 0)
	//* 102  186:iload_2         
	//* 103  187:ifeq            349
		{
			j = accumField(i1, 1, false, 0);
	//  104  190:iload           6
	//  105  192:iconst_1        
	//  106  193:iconst_0        
	//  107  194:iconst_0        
	//  108  195:invokestatic    #59  <Method int accumField(int, int, boolean, int)>
	//  109  198:istore          4
			boolean flag;
			if(j > 0)
	//* 110  200:iload           4
	//* 111  202:ifle            211
				flag = true;
	//  112  205:iconst_1        
	//  113  206:istore          12
			else
	//* 114  208:goto            214
				flag = false;
	//  115  211:iconst_0        
	//  116  212:istore          12
			j += accumField(j1, 1, flag, 2);
	//  117  214:iload           4
	//  118  216:iload           7
	//  119  218:iconst_1        
	//  120  219:iload           12
	//  121  221:iconst_2        
	//  122  222:invokestatic    #59  <Method int accumField(int, int, boolean, int)>
	//  123  225:iadd            
	//  124  226:istore          4
			if(j > 0)
	//* 125  228:iload           4
	//* 126  230:ifle            239
				flag = true;
	//  127  233:iconst_1        
	//  128  234:istore          12
			else
	//* 129  236:goto            242
				flag = false;
	//  130  239:iconst_0        
	//  131  240:istore          12
			j += accumField(k1, 1, flag, 2);
	//  132  242:iload           4
	//  133  244:iload           8
	//  134  246:iconst_1        
	//  135  247:iload           12
	//  136  249:iconst_2        
	//  137  250:invokestatic    #59  <Method int accumField(int, int, boolean, int)>
	//  138  253:iadd            
	//  139  254:istore          4
			if(j > 0)
	//* 140  256:iload           4
	//* 141  258:ifle            267
				flag = true;
	//  142  261:iconst_1        
	//  143  262:istore          12
			else
	//* 144  264:goto            270
				flag = false;
	//  145  267:iconst_0        
	//  146  268:istore          12
			int l1 = j + accumField(k, 1, flag, 2);
	//  147  270:iload           4
	//  148  272:iload           5
	//  149  274:iconst_1        
	//  150  275:iload           12
	//  151  277:iconst_2        
	//  152  278:invokestatic    #59  <Method int accumField(int, int, boolean, int)>
	//  153  281:iadd            
	//  154  282:istore          9
			if(l1 > 0)
	//* 155  284:iload           9
	//* 156  286:ifle            295
				j = 3;
	//  157  289:iconst_3        
	//  158  290:istore          4
			else
	//* 159  292:goto            298
				j = 0;
	//  160  295:iconst_0        
	//  161  296:istore          4
			l1 += accumField(k2, 2, true, j) + 1;
	//  162  298:iload           9
	//  163  300:iload           11
	//  164  302:iconst_2        
	//  165  303:iconst_1        
	//  166  304:iload           4
	//  167  306:invokestatic    #59  <Method int accumField(int, int, boolean, int)>
	//  168  309:iconst_1        
	//  169  310:iadd            
	//  170  311:iadd            
	//  171  312:istore          9
			j = 0;
	//  172  314:iconst_0        
	//  173  315:istore          4
			do
			{
				j2 = j;
	//  174  317:iload           4
	//  175  319:istore          10
				if(l1 >= i)
					break;
	//  176  321:iload           9
	//  177  323:iload_2         
	//  178  324:icmpge          352
				ac[j] = ' ';
	//  179  327:aload           13
	//  180  329:iload           4
	//  181  331:bipush          32
	//  182  333:castore         
				j++;
	//  183  334:iload           4
	//  184  336:iconst_1        
	//  185  337:iadd            
	//  186  338:istore          4
				l1++;
	//  187  340:iload           9
	//  188  342:iconst_1        
	//  189  343:iadd            
	//  190  344:istore          9
			} while(true);
	//  191  346:goto            317
		} else
		{
			j2 = 0;
	//  192  349:iconst_0        
	//  193  350:istore          10
		}
		ac[j2] = c;
	//  194  352:aload           13
	//  195  354:iload           10
	//  196  356:iload_3         
	//  197  357:castore         
		int i2 = j2 + 1;
	//  198  358:iload           10
	//  199  360:iconst_1        
	//  200  361:iadd            
	//  201  362:istore          9
		if(i != 0)
	//* 202  364:iload_2         
	//* 203  365:ifeq            373
			i = 1;
	//  204  368:iconst_1        
	//  205  369:istore_2        
		else
	//* 206  370:goto            375
			i = 0;
	//  207  373:iconst_0        
	//  208  374:istore_2        
		i1 = printField(ac, i1, 'd', i2, false, 0);
	//  209  375:aload           13
	//  210  377:iload           6
	//  211  379:bipush          100
	//  212  381:iload           9
	//  213  383:iconst_0        
	//  214  384:iconst_0        
	//  215  385:invokestatic    #63  <Method int printField(char[], int, char, int, boolean, int)>
	//  216  388:istore          6
		boolean flag1;
		if(i1 != i2)
	//* 217  390:iload           6
	//* 218  392:iload           9
	//* 219  394:icmpeq          403
			flag1 = true;
	//  220  397:iconst_1        
	//  221  398:istore          12
		else
	//* 222  400:goto            406
			flag1 = false;
	//  223  403:iconst_0        
	//  224  404:istore          12
		if(i != 0)
	//* 225  406:iload_2         
	//* 226  407:ifeq            416
			j = 2;
	//  227  410:iconst_2        
	//  228  411:istore          4
		else
	//* 229  413:goto            419
			j = 0;
	//  230  416:iconst_0        
	//  231  417:istore          4
		i1 = printField(ac, j1, 'h', i1, flag1, j);
	//  232  419:aload           13
	//  233  421:iload           7
	//  234  423:bipush          104
	//  235  425:iload           6
	//  236  427:iload           12
	//  237  429:iload           4
	//  238  431:invokestatic    #63  <Method int printField(char[], int, char, int, boolean, int)>
	//  239  434:istore          6
		if(i1 != i2)
	//* 240  436:iload           6
	//* 241  438:iload           9
	//* 242  440:icmpeq          449
			flag1 = true;
	//  243  443:iconst_1        
	//  244  444:istore          12
		else
	//* 245  446:goto            452
			flag1 = false;
	//  246  449:iconst_0        
	//  247  450:istore          12
		if(i != 0)
	//* 248  452:iload_2         
	//* 249  453:ifeq            462
			j = 2;
	//  250  456:iconst_2        
	//  251  457:istore          4
		else
	//* 252  459:goto            465
			j = 0;
	//  253  462:iconst_0        
	//  254  463:istore          4
		i1 = printField(ac, k1, 'm', i1, flag1, j);
	//  255  465:aload           13
	//  256  467:iload           8
	//  257  469:bipush          109
	//  258  471:iload           6
	//  259  473:iload           12
	//  260  475:iload           4
	//  261  477:invokestatic    #63  <Method int printField(char[], int, char, int, boolean, int)>
	//  262  480:istore          6
		if(i1 != i2)
	//* 263  482:iload           6
	//* 264  484:iload           9
	//* 265  486:icmpeq          495
			flag1 = true;
	//  266  489:iconst_1        
	//  267  490:istore          12
		else
	//* 268  492:goto            498
			flag1 = false;
	//  269  495:iconst_0        
	//  270  496:istore          12
		if(i != 0)
	//* 271  498:iload_2         
	//* 272  499:ifeq            508
			j = 2;
	//  273  502:iconst_2        
	//  274  503:istore          4
		else
	//* 275  505:goto            511
			j = 0;
	//  276  508:iconst_0        
	//  277  509:istore          4
		j = printField(ac, k, 's', i1, flag1, j);
	//  278  511:aload           13
	//  279  513:iload           5
	//  280  515:bipush          115
	//  281  517:iload           6
	//  282  519:iload           12
	//  283  521:iload           4
	//  284  523:invokestatic    #63  <Method int printField(char[], int, char, int, boolean, int)>
	//  285  526:istore          4
		if(i != 0 && j != i2)
	//* 286  528:iload_2         
	//* 287  529:ifeq            544
	//* 288  532:iload           4
	//* 289  534:iload           9
	//* 290  536:icmpeq          544
			i = 3;
	//  291  539:iconst_3        
	//  292  540:istore_2        
		else
	//* 293  541:goto            546
			i = 0;
	//  294  544:iconst_0        
	//  295  545:istore_2        
		i = printField(ac, k2, 'm', j, true, i);
	//  296  546:aload           13
	//  297  548:iload           11
	//  298  550:bipush          109
	//  299  552:iload           4
	//  300  554:iconst_1        
	//  301  555:iload_2         
	//  302  556:invokestatic    #63  <Method int printField(char[], int, char, int, boolean, int)>
	//  303  559:istore_2        
		ac[i] = 's';
	//  304  560:aload           13
	//  305  562:iload_2         
	//  306  563:bipush          115
	//  307  565:castore         
		return i + 1;
	//  308  566:iload_2         
	//  309  567:iconst_1        
	//  310  568:iadd            
	//  311  569:ireturn         
	}

	private static int printField(char ac[], int i, char c, int j, boolean flag, int k)
	{
		int l;
label0:
		{
			int j1;
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
	//    5    9:ifle            145
				}
				if(flag && k >= 3 || i > 99)
	//*   6   12:iload           4
	//*   7   14:ifeq            23
	//*   8   17:iload           5
	//*   9   19:iconst_3        
	//*  10   20:icmpge          29
	//*  11   23:iload_1         
	//*  12   24:bipush          99
	//*  13   26:icmple          60
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
	//*  35   57:goto            63
				{
					l = j;
	//   36   60:iload_3         
	//   37   61:istore          6
				}
				if((!flag || k < 2) && i <= 9)
	//*  38   63:iload           4
	//*  39   65:ifeq            74
	//*  40   68:iload           5
	//*  41   70:iconst_2        
	//*  42   71:icmpge          93
	//*  43   74:iload_1         
	//*  44   75:bipush          9
	//*  45   77:icmpgt          93
				{
					j1 = l;
	//   46   80:iload           6
	//   47   82:istore          7
					k = i;
	//   48   84:iload_1         
	//   49   85:istore          5
					if(j == l)
						break label1;
	//   50   87:iload_3         
	//   51   88:iload           6
	//   52   90:icmpeq          121
				}
				j = i / 10;
	//   53   93:iload_1         
	//   54   94:bipush          10
	//   55   96:idiv            
	//   56   97:istore_3        
				ac[l] = (char)(j + 48);
	//   57   98:aload_0         
	//   58   99:iload           6
	//   59  101:iload_3         
	//   60  102:bipush          48
	//   61  104:iadd            
	//   62  105:int2char        
	//   63  106:castore         
				j1 = l + 1;
	//   64  107:iload           6
	//   65  109:iconst_1        
	//   66  110:iadd            
	//   67  111:istore          7
				k = i - j * 10;
	//   68  113:iload_1         
	//   69  114:iload_3         
	//   70  115:bipush          10
	//   71  117:imul            
	//   72  118:isub            
	//   73  119:istore          5
			}
			ac[j1] = (char)(k + 48);
	//   74  121:aload_0         
	//   75  122:iload           7
	//   76  124:iload           5
	//   77  126:bipush          48
	//   78  128:iadd            
	//   79  129:int2char        
	//   80  130:castore         
			i = j1 + 1;
	//   81  131:iload           7
	//   82  133:iconst_1        
	//   83  134:iadd            
	//   84  135:istore_1        
			ac[i] = c;
	//   85  136:aload_0         
	//   86  137:iload_1         
	//   87  138:iload_2         
	//   88  139:castore         
			l = i + 1;
	//   89  140:iload_1         
	//   90  141:iconst_1        
	//   91  142:iadd            
	//   92  143:istore          6
		}
		return l;
	//   93  145:iload           6
	//   94  147:ireturn         
	}

	private static char sFormatStr[] = new char[24];
	private static final Object sFormatSync = new Object();

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void Object()>
	//    3    7:putstatic       #19  <Field Object sFormatSync>
	//    4   10:bipush          24
	//    5   12:newarray        char[]
	//    6   14:putstatic       #21  <Field char[] sFormatStr>
	//*   7   17:return          
	}
}
