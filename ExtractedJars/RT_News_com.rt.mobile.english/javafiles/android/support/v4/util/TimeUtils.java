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
					return 1 + j;
	//   25   49:iconst_1        
	//   26   50:iload_1         
	//   27   51:iadd            
	//   28   52:ireturn         
			} else
			{
				return 2 + j;
	//   29   53:iconst_2        
	//   30   54:iload_1         
	//   31   55:iadd            
	//   32   56:ireturn         
			}
		} else
		{
			return 3 + j;
	//   33   57:iconst_3        
	//   34   58:iload_1         
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
			while(i - 1 > 0) 
	//*  13   25:iload_2         
	//*  14   26:iconst_1        
	//*  15   27:isub            
	//*  16   28:ifle            40
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
		int k2 = (int)(l % 1000L);
	//   40   66:lload_0         
	//   41   67:ldc2w           #65  <Long 1000L>
	//   42   70:lrem            
	//   43   71:l2i             
	//   44   72:istore          11
		int j = (int)Math.floor(l / 1000L);
	//   45   74:lload_0         
	//   46   75:ldc2w           #65  <Long 1000L>
	//   47   78:ldiv            
	//   48   79:l2d             
	//   49   80:invokestatic    #72  <Method double Math.floor(double)>
	//   50   83:d2i             
	//   51   84:istore          4
		int i1;
		if(j > 0x15180)
	//*  52   86:iload           4
	//*  53   88:ldc1            #13  <Int 0x15180>
	//*  54   90:icmple          113
		{
			i1 = j / 0x15180;
	//   55   93:iload           4
	//   56   95:ldc1            #13  <Int 0x15180>
	//   57   97:idiv            
	//   58   98:istore          6
			j -= 0x15180 * i1;
	//   59  100:iload           4
	//   60  102:ldc1            #13  <Int 0x15180>
	//   61  104:iload           6
	//   62  106:imul            
	//   63  107:isub            
	//   64  108:istore          4
		} else
	//*  65  110:goto            116
		{
			i1 = 0;
	//   66  113:iconst_0        
	//   67  114:istore          6
		}
		int j1;
		if(j > 3600)
	//*  68  116:iload           4
	//*  69  118:sipush          3600
	//*  70  121:icmple          146
		{
			j1 = j / 3600;
	//   71  124:iload           4
	//   72  126:sipush          3600
	//   73  129:idiv            
	//   74  130:istore          7
			j -= j1 * 3600;
	//   75  132:iload           4
	//   76  134:iload           7
	//   77  136:sipush          3600
	//   78  139:imul            
	//   79  140:isub            
	//   80  141:istore          4
		} else
	//*  81  143:goto            149
		{
			j1 = 0;
	//   82  146:iconst_0        
	//   83  147:istore          7
		}
		int k;
		int k1;
		if(j > 60)
	//*  84  149:iload           4
	//*  85  151:bipush          60
	//*  86  153:icmple          176
		{
			k1 = j / 60;
	//   87  156:iload           4
	//   88  158:bipush          60
	//   89  160:idiv            
	//   90  161:istore          8
			k = j - k1 * 60;
	//   91  163:iload           4
	//   92  165:iload           8
	//   93  167:bipush          60
	//   94  169:imul            
	//   95  170:isub            
	//   96  171:istore          5
		} else
	//*  97  173:goto            183
		{
			k1 = 0;
	//   98  176:iconst_0        
	//   99  177:istore          8
			k = j;
	//  100  179:iload           4
	//  101  181:istore          5
		}
		int j2;
		if(i != 0)
	//* 102  183:iload_2         
	//* 103  184:ifeq            346
		{
			j = accumField(i1, 1, false, 0);
	//  104  187:iload           6
	//  105  189:iconst_1        
	//  106  190:iconst_0        
	//  107  191:iconst_0        
	//  108  192:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  109  195:istore          4
			boolean flag;
			if(j > 0)
	//* 110  197:iload           4
	//* 111  199:ifle            208
				flag = true;
	//  112  202:iconst_1        
	//  113  203:istore          12
			else
	//* 114  205:goto            211
				flag = false;
	//  115  208:iconst_0        
	//  116  209:istore          12
			j += accumField(j1, 1, flag, 2);
	//  117  211:iload           4
	//  118  213:iload           7
	//  119  215:iconst_1        
	//  120  216:iload           12
	//  121  218:iconst_2        
	//  122  219:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  123  222:iadd            
	//  124  223:istore          4
			if(j > 0)
	//* 125  225:iload           4
	//* 126  227:ifle            236
				flag = true;
	//  127  230:iconst_1        
	//  128  231:istore          12
			else
	//* 129  233:goto            239
				flag = false;
	//  130  236:iconst_0        
	//  131  237:istore          12
			j += accumField(k1, 1, flag, 2);
	//  132  239:iload           4
	//  133  241:iload           8
	//  134  243:iconst_1        
	//  135  244:iload           12
	//  136  246:iconst_2        
	//  137  247:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  138  250:iadd            
	//  139  251:istore          4
			if(j > 0)
	//* 140  253:iload           4
	//* 141  255:ifle            264
				flag = true;
	//  142  258:iconst_1        
	//  143  259:istore          12
			else
	//* 144  261:goto            267
				flag = false;
	//  145  264:iconst_0        
	//  146  265:istore          12
			int l1 = j + accumField(k, 1, flag, 2);
	//  147  267:iload           4
	//  148  269:iload           5
	//  149  271:iconst_1        
	//  150  272:iload           12
	//  151  274:iconst_2        
	//  152  275:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  153  278:iadd            
	//  154  279:istore          9
			if(l1 > 0)
	//* 155  281:iload           9
	//* 156  283:ifle            292
				j = 3;
	//  157  286:iconst_3        
	//  158  287:istore          4
			else
	//* 159  289:goto            295
				j = 0;
	//  160  292:iconst_0        
	//  161  293:istore          4
			l1 += accumField(k2, 2, true, j) + 1;
	//  162  295:iload           9
	//  163  297:iload           11
	//  164  299:iconst_2        
	//  165  300:iconst_1        
	//  166  301:iload           4
	//  167  303:invokestatic    #74  <Method int accumField(int, int, boolean, int)>
	//  168  306:iconst_1        
	//  169  307:iadd            
	//  170  308:iadd            
	//  171  309:istore          9
			j = 0;
	//  172  311:iconst_0        
	//  173  312:istore          4
			do
			{
				j2 = j;
	//  174  314:iload           4
	//  175  316:istore          10
				if(l1 >= i)
					break;
	//  176  318:iload           9
	//  177  320:iload_2         
	//  178  321:icmpge          349
				ac[j] = ' ';
	//  179  324:aload           13
	//  180  326:iload           4
	//  181  328:bipush          32
	//  182  330:castore         
				j++;
	//  183  331:iload           4
	//  184  333:iconst_1        
	//  185  334:iadd            
	//  186  335:istore          4
				l1++;
	//  187  337:iload           9
	//  188  339:iconst_1        
	//  189  340:iadd            
	//  190  341:istore          9
			} while(true);
	//  191  343:goto            314
		} else
		{
			j2 = 0;
	//  192  346:iconst_0        
	//  193  347:istore          10
		}
		ac[j2] = c;
	//  194  349:aload           13
	//  195  351:iload           10
	//  196  353:iload_3         
	//  197  354:castore         
		int i2 = j2 + 1;
	//  198  355:iload           10
	//  199  357:iconst_1        
	//  200  358:iadd            
	//  201  359:istore          9
		if(i != 0)
	//* 202  361:iload_2         
	//* 203  362:ifeq            370
			i = 1;
	//  204  365:iconst_1        
	//  205  366:istore_2        
		else
	//* 206  367:goto            372
			i = 0;
	//  207  370:iconst_0        
	//  208  371:istore_2        
		i1 = printField(ac, i1, 'd', i2, false, 0);
	//  209  372:aload           13
	//  210  374:iload           6
	//  211  376:bipush          100
	//  212  378:iload           9
	//  213  380:iconst_0        
	//  214  381:iconst_0        
	//  215  382:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  216  385:istore          6
		boolean flag1;
		if(i1 != i2)
	//* 217  387:iload           6
	//* 218  389:iload           9
	//* 219  391:icmpeq          400
			flag1 = true;
	//  220  394:iconst_1        
	//  221  395:istore          12
		else
	//* 222  397:goto            403
			flag1 = false;
	//  223  400:iconst_0        
	//  224  401:istore          12
		if(i != 0)
	//* 225  403:iload_2         
	//* 226  404:ifeq            413
			j = 2;
	//  227  407:iconst_2        
	//  228  408:istore          4
		else
	//* 229  410:goto            416
			j = 0;
	//  230  413:iconst_0        
	//  231  414:istore          4
		i1 = printField(ac, j1, 'h', i1, flag1, j);
	//  232  416:aload           13
	//  233  418:iload           7
	//  234  420:bipush          104
	//  235  422:iload           6
	//  236  424:iload           12
	//  237  426:iload           4
	//  238  428:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  239  431:istore          6
		if(i1 != i2)
	//* 240  433:iload           6
	//* 241  435:iload           9
	//* 242  437:icmpeq          446
			flag1 = true;
	//  243  440:iconst_1        
	//  244  441:istore          12
		else
	//* 245  443:goto            449
			flag1 = false;
	//  246  446:iconst_0        
	//  247  447:istore          12
		if(i != 0)
	//* 248  449:iload_2         
	//* 249  450:ifeq            459
			j = 2;
	//  250  453:iconst_2        
	//  251  454:istore          4
		else
	//* 252  456:goto            462
			j = 0;
	//  253  459:iconst_0        
	//  254  460:istore          4
		i1 = printField(ac, k1, 'm', i1, flag1, j);
	//  255  462:aload           13
	//  256  464:iload           8
	//  257  466:bipush          109
	//  258  468:iload           6
	//  259  470:iload           12
	//  260  472:iload           4
	//  261  474:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  262  477:istore          6
		if(i1 != i2)
	//* 263  479:iload           6
	//* 264  481:iload           9
	//* 265  483:icmpeq          492
			flag1 = true;
	//  266  486:iconst_1        
	//  267  487:istore          12
		else
	//* 268  489:goto            495
			flag1 = false;
	//  269  492:iconst_0        
	//  270  493:istore          12
		if(i != 0)
	//* 271  495:iload_2         
	//* 272  496:ifeq            505
			j = 2;
	//  273  499:iconst_2        
	//  274  500:istore          4
		else
	//* 275  502:goto            508
			j = 0;
	//  276  505:iconst_0        
	//  277  506:istore          4
		j = printField(ac, k, 's', i1, flag1, j);
	//  278  508:aload           13
	//  279  510:iload           5
	//  280  512:bipush          115
	//  281  514:iload           6
	//  282  516:iload           12
	//  283  518:iload           4
	//  284  520:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  285  523:istore          4
		if(i != 0 && j != i2)
	//* 286  525:iload_2         
	//* 287  526:ifeq            541
	//* 288  529:iload           4
	//* 289  531:iload           9
	//* 290  533:icmpeq          541
			i = 3;
	//  291  536:iconst_3        
	//  292  537:istore_2        
		else
	//* 293  538:goto            543
			i = 0;
	//  294  541:iconst_0        
	//  295  542:istore_2        
		i = printField(ac, k2, 'm', j, true, i);
	//  296  543:aload           13
	//  297  545:iload           11
	//  298  547:bipush          109
	//  299  549:iload           4
	//  300  551:iconst_1        
	//  301  552:iload_2         
	//  302  553:invokestatic    #78  <Method int printField(char[], int, char, int, boolean, int)>
	//  303  556:istore_2        
		ac[i] = 's';
	//  304  557:aload           13
	//  305  559:iload_2         
	//  306  560:bipush          115
	//  307  562:castore         
		return i + 1;
	//  308  563:iload_2         
	//  309  564:iconst_1        
	//  310  565:iadd            
	//  311  566:ireturn         
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
