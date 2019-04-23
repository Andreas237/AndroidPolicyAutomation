// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;

import java.io.PrintStream;
import java.util.Arrays;

// Referenced classes of package android.support.constraint.solver:
//			SolverVariable, Cache, ArrayRow, LinearSystem

public class ArrayLinkedVariables
{

	ArrayLinkedVariables(ArrayRow arrayrow, Cache cache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
		currentSize = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #34  <Field int currentSize>
		ROW_SIZE = 8;
	//    5    9:aload_0         
	//    6   10:bipush          8
	//    7   12:putfield        #36  <Field int ROW_SIZE>
		candidate = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #38  <Field SolverVariable candidate>
		int i = ROW_SIZE;
	//   11   20:aload_0         
	//   12   21:getfield        #36  <Field int ROW_SIZE>
	//   13   24:istore_3        
		mArrayIndices = new int[i];
	//   14   25:aload_0         
	//   15   26:iload_3         
	//   16   27:newarray        int[]
	//   17   29:putfield        #40  <Field int[] mArrayIndices>
		mArrayNextIndices = new int[i];
	//   18   32:aload_0         
	//   19   33:iload_3         
	//   20   34:newarray        int[]
	//   21   36:putfield        #42  <Field int[] mArrayNextIndices>
		mArrayValues = new float[i];
	//   22   39:aload_0         
	//   23   40:iload_3         
	//   24   41:newarray        float[]
	//   25   43:putfield        #44  <Field float[] mArrayValues>
		mHead = -1;
	//   26   46:aload_0         
	//   27   47:iconst_m1       
	//   28   48:putfield        #46  <Field int mHead>
		mLast = -1;
	//   29   51:aload_0         
	//   30   52:iconst_m1       
	//   31   53:putfield        #48  <Field int mLast>
		mDidFillOnce = false;
	//   32   56:aload_0         
	//   33   57:iconst_0        
	//   34   58:putfield        #50  <Field boolean mDidFillOnce>
		mRow = arrayrow;
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:putfield        #52  <Field ArrayRow mRow>
		mCache = cache;
	//   38   66:aload_0         
	//   39   67:aload_2         
	//   40   68:putfield        #54  <Field Cache mCache>
	//   41   71:return          
	}

	private boolean isNew(SolverVariable solvervariable, LinearSystem linearsystem)
	{
		return solvervariable.usageInRowCount <= 1;
	//    0    0:aload_1         
	//    1    1:getfield        #62  <Field int SolverVariable.usageInRowCount>
	//    2    4:iconst_1        
	//    3    5:icmpgt          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	final void add(SolverVariable solvervariable, float f, boolean flag)
	{
		if(f == 0.0F)
	//*   0    0:fload_2         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            7
			return;
	//    4    6:return          
		int i = mHead;
	//    5    7:aload_0         
	//    6    8:getfield        #46  <Field int mHead>
	//    7   11:istore          4
		if(i == -1)
	//*   8   13:iload           4
	//*   9   15:iconst_m1       
	//*  10   16:icmpne          140
		{
			mHead = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #46  <Field int mHead>
			float af[] = mArrayValues;
	//   14   24:aload_0         
	//   15   25:getfield        #44  <Field float[] mArrayValues>
	//   16   28:astore          8
			i = mHead;
	//   17   30:aload_0         
	//   18   31:getfield        #46  <Field int mHead>
	//   19   34:istore          4
			af[i] = f;
	//   20   36:aload           8
	//   21   38:iload           4
	//   22   40:fload_2         
	//   23   41:fastore         
			mArrayIndices[i] = solvervariable.id;
	//   24   42:aload_0         
	//   25   43:getfield        #40  <Field int[] mArrayIndices>
	//   26   46:iload           4
	//   27   48:aload_1         
	//   28   49:getfield        #67  <Field int SolverVariable.id>
	//   29   52:iastore         
			mArrayNextIndices[mHead] = -1;
	//   30   53:aload_0         
	//   31   54:getfield        #42  <Field int[] mArrayNextIndices>
	//   32   57:aload_0         
	//   33   58:getfield        #46  <Field int mHead>
	//   34   61:iconst_m1       
	//   35   62:iastore         
			solvervariable.usageInRowCount = solvervariable.usageInRowCount + 1;
	//   36   63:aload_1         
	//   37   64:aload_1         
	//   38   65:getfield        #62  <Field int SolverVariable.usageInRowCount>
	//   39   68:iconst_1        
	//   40   69:iadd            
	//   41   70:putfield        #62  <Field int SolverVariable.usageInRowCount>
			solvervariable.addToRow(mRow);
	//   42   73:aload_1         
	//   43   74:aload_0         
	//   44   75:getfield        #52  <Field ArrayRow mRow>
	//   45   78:invokevirtual   #71  <Method void SolverVariable.addToRow(ArrayRow)>
			currentSize = currentSize + 1;
	//   46   81:aload_0         
	//   47   82:aload_0         
	//   48   83:getfield        #34  <Field int currentSize>
	//   49   86:iconst_1        
	//   50   87:iadd            
	//   51   88:putfield        #34  <Field int currentSize>
			if(!mDidFillOnce)
	//*  52   91:aload_0         
	//*  53   92:getfield        #50  <Field boolean mDidFillOnce>
	//*  54   95:ifne            139
			{
				mLast = mLast + 1;
	//   55   98:aload_0         
	//   56   99:aload_0         
	//   57  100:getfield        #48  <Field int mLast>
	//   58  103:iconst_1        
	//   59  104:iadd            
	//   60  105:putfield        #48  <Field int mLast>
				i = mLast;
	//   61  108:aload_0         
	//   62  109:getfield        #48  <Field int mLast>
	//   63  112:istore          4
				solvervariable = ((SolverVariable) (mArrayIndices));
	//   64  114:aload_0         
	//   65  115:getfield        #40  <Field int[] mArrayIndices>
	//   66  118:astore_1        
				if(i >= solvervariable.length)
	//*  67  119:iload           4
	//*  68  121:aload_1         
	//*  69  122:arraylength     
	//*  70  123:icmplt          139
				{
					mDidFillOnce = true;
	//   71  126:aload_0         
	//   72  127:iconst_1        
	//   73  128:putfield        #50  <Field boolean mDidFillOnce>
					mLast = solvervariable.length - 1;
	//   74  131:aload_0         
	//   75  132:aload_1         
	//   76  133:arraylength     
	//   77  134:iconst_1        
	//   78  135:isub            
	//   79  136:putfield        #48  <Field int mLast>
				}
			}
			return;
	//   80  139:return          
		}
		int j = 0;
	//   81  140:iconst_0        
	//   82  141:istore          5
		int l = -1;
	//   83  143:iconst_m1       
	//   84  144:istore          7
		for(; i != -1 && j < currentSize; j++)
	//*  85  146:iload           4
	//*  86  148:iconst_m1       
	//*  87  149:icmpeq          324
	//*  88  152:iload           5
	//*  89  154:aload_0         
	//*  90  155:getfield        #34  <Field int currentSize>
	//*  91  158:icmpge          324
		{
			if(mArrayIndices[i] == solvervariable.id)
	//*  92  161:aload_0         
	//*  93  162:getfield        #40  <Field int[] mArrayIndices>
	//*  94  165:iload           4
	//*  95  167:iaload          
	//*  96  168:aload_1         
	//*  97  169:getfield        #67  <Field int SolverVariable.id>
	//*  98  172:icmpne          288
			{
				float af1[] = mArrayValues;
	//   99  175:aload_0         
	//  100  176:getfield        #44  <Field float[] mArrayValues>
	//  101  179:astore          8
				af1[i] = af1[i] + f;
	//  102  181:aload           8
	//  103  183:iload           4
	//  104  185:aload           8
	//  105  187:iload           4
	//  106  189:faload          
	//  107  190:fload_2         
	//  108  191:fadd            
	//  109  192:fastore         
				if(af1[i] == 0.0F)
	//* 110  193:aload           8
	//* 111  195:iload           4
	//* 112  197:faload          
	//* 113  198:fconst_0        
	//* 114  199:fcmpl           
	//* 115  200:ifne            287
				{
					if(i == mHead)
	//* 116  203:iload           4
	//* 117  205:aload_0         
	//* 118  206:getfield        #46  <Field int mHead>
	//* 119  209:icmpne          226
					{
						mHead = mArrayNextIndices[i];
	//  120  212:aload_0         
	//  121  213:aload_0         
	//  122  214:getfield        #42  <Field int[] mArrayNextIndices>
	//  123  217:iload           4
	//  124  219:iaload          
	//  125  220:putfield        #46  <Field int mHead>
					} else
	//* 126  223:goto            242
					{
						int ai[] = mArrayNextIndices;
	//  127  226:aload_0         
	//  128  227:getfield        #42  <Field int[] mArrayNextIndices>
	//  129  230:astore          8
						ai[l] = ai[i];
	//  130  232:aload           8
	//  131  234:iload           7
	//  132  236:aload           8
	//  133  238:iload           4
	//  134  240:iaload          
	//  135  241:iastore         
					}
					if(flag)
	//* 136  242:iload_3         
	//* 137  243:ifeq            254
						solvervariable.removeFromRow(mRow);
	//  138  246:aload_1         
	//  139  247:aload_0         
	//  140  248:getfield        #52  <Field ArrayRow mRow>
	//  141  251:invokevirtual   #74  <Method void SolverVariable.removeFromRow(ArrayRow)>
					if(mDidFillOnce)
	//* 142  254:aload_0         
	//* 143  255:getfield        #50  <Field boolean mDidFillOnce>
	//* 144  258:ifeq            267
						mLast = i;
	//  145  261:aload_0         
	//  146  262:iload           4
	//  147  264:putfield        #48  <Field int mLast>
					solvervariable.usageInRowCount = solvervariable.usageInRowCount - 1;
	//  148  267:aload_1         
	//  149  268:aload_1         
	//  150  269:getfield        #62  <Field int SolverVariable.usageInRowCount>
	//  151  272:iconst_1        
	//  152  273:isub            
	//  153  274:putfield        #62  <Field int SolverVariable.usageInRowCount>
					currentSize = currentSize - 1;
	//  154  277:aload_0         
	//  155  278:aload_0         
	//  156  279:getfield        #34  <Field int currentSize>
	//  157  282:iconst_1        
	//  158  283:isub            
	//  159  284:putfield        #34  <Field int currentSize>
				}
				return;
	//  160  287:return          
			}
			if(mArrayIndices[i] < solvervariable.id)
	//* 161  288:aload_0         
	//* 162  289:getfield        #40  <Field int[] mArrayIndices>
	//* 163  292:iload           4
	//* 164  294:iaload          
	//* 165  295:aload_1         
	//* 166  296:getfield        #67  <Field int SolverVariable.id>
	//* 167  299:icmpge          306
				l = i;
	//  168  302:iload           4
	//  169  304:istore          7
			i = mArrayNextIndices[i];
	//  170  306:aload_0         
	//  171  307:getfield        #42  <Field int[] mArrayNextIndices>
	//  172  310:iload           4
	//  173  312:iaload          
	//  174  313:istore          4
		}

	//  175  315:iload           5
	//  176  317:iconst_1        
	//  177  318:iadd            
	//  178  319:istore          5
	//* 179  321:goto            146
		i = mLast;
	//  180  324:aload_0         
	//  181  325:getfield        #48  <Field int mLast>
	//  182  328:istore          4
		if(mDidFillOnce)
	//* 183  330:aload_0         
	//* 184  331:getfield        #50  <Field boolean mDidFillOnce>
	//* 185  334:ifeq            363
		{
			int ai1[] = mArrayIndices;
	//  186  337:aload_0         
	//  187  338:getfield        #40  <Field int[] mArrayIndices>
	//  188  341:astore          8
			if(ai1[i] != -1)
	//* 189  343:aload           8
	//* 190  345:iload           4
	//* 191  347:iaload          
	//* 192  348:iconst_m1       
	//* 193  349:icmpne          355
	//* 194  352:goto            369
				i = ai1.length;
	//  195  355:aload           8
	//  196  357:arraylength     
	//  197  358:istore          4
		} else
	//* 198  360:goto            369
		{
			i++;
	//  199  363:iload           4
	//  200  365:iconst_1        
	//  201  366:iadd            
	//  202  367:istore          4
		}
		int ai2[] = mArrayIndices;
	//  203  369:aload_0         
	//  204  370:getfield        #40  <Field int[] mArrayIndices>
	//  205  373:astore          8
		j = i;
	//  206  375:iload           4
	//  207  377:istore          5
		if(i >= ai2.length)
	//* 208  379:iload           4
	//* 209  381:aload           8
	//* 210  383:arraylength     
	//* 211  384:icmplt          447
		{
			j = i;
	//  212  387:iload           4
	//  213  389:istore          5
			if(currentSize < ai2.length)
	//* 214  391:aload_0         
	//* 215  392:getfield        #34  <Field int currentSize>
	//* 216  395:aload           8
	//* 217  397:arraylength     
	//* 218  398:icmpge          447
			{
				int k = 0;
	//  219  401:iconst_0        
	//  220  402:istore          6
				do
				{
					ai2 = mArrayIndices;
	//  221  404:aload_0         
	//  222  405:getfield        #40  <Field int[] mArrayIndices>
	//  223  408:astore          8
					j = i;
	//  224  410:iload           4
	//  225  412:istore          5
					if(k >= ai2.length)
						break;
	//  226  414:iload           6
	//  227  416:aload           8
	//  228  418:arraylength     
	//  229  419:icmpge          447
					if(ai2[k] == -1)
	//* 230  422:aload           8
	//* 231  424:iload           6
	//* 232  426:iaload          
	//* 233  427:iconst_m1       
	//* 234  428:icmpne          438
					{
						j = k;
	//  235  431:iload           6
	//  236  433:istore          5
						break;
	//  237  435:goto            447
					}
					k++;
	//  238  438:iload           6
	//  239  440:iconst_1        
	//  240  441:iadd            
	//  241  442:istore          6
				} while(true);
	//  242  444:goto            404
			}
		}
		ai2 = mArrayIndices;
	//  243  447:aload_0         
	//  244  448:getfield        #40  <Field int[] mArrayIndices>
	//  245  451:astore          8
		i = j;
	//  246  453:iload           5
	//  247  455:istore          4
		if(j >= ai2.length)
	//* 248  457:iload           5
	//* 249  459:aload           8
	//* 250  461:arraylength     
	//* 251  462:icmplt          538
		{
			i = ai2.length;
	//  252  465:aload           8
	//  253  467:arraylength     
	//  254  468:istore          4
			ROW_SIZE = ROW_SIZE * 2;
	//  255  470:aload_0         
	//  256  471:aload_0         
	//  257  472:getfield        #36  <Field int ROW_SIZE>
	//  258  475:iconst_2        
	//  259  476:imul            
	//  260  477:putfield        #36  <Field int ROW_SIZE>
			mDidFillOnce = false;
	//  261  480:aload_0         
	//  262  481:iconst_0        
	//  263  482:putfield        #50  <Field boolean mDidFillOnce>
			mLast = i - 1;
	//  264  485:aload_0         
	//  265  486:iload           4
	//  266  488:iconst_1        
	//  267  489:isub            
	//  268  490:putfield        #48  <Field int mLast>
			mArrayValues = Arrays.copyOf(mArrayValues, ROW_SIZE);
	//  269  493:aload_0         
	//  270  494:aload_0         
	//  271  495:getfield        #44  <Field float[] mArrayValues>
	//  272  498:aload_0         
	//  273  499:getfield        #36  <Field int ROW_SIZE>
	//  274  502:invokestatic    #80  <Method float[] Arrays.copyOf(float[], int)>
	//  275  505:putfield        #44  <Field float[] mArrayValues>
			mArrayIndices = Arrays.copyOf(mArrayIndices, ROW_SIZE);
	//  276  508:aload_0         
	//  277  509:aload_0         
	//  278  510:getfield        #40  <Field int[] mArrayIndices>
	//  279  513:aload_0         
	//  280  514:getfield        #36  <Field int ROW_SIZE>
	//  281  517:invokestatic    #83  <Method int[] Arrays.copyOf(int[], int)>
	//  282  520:putfield        #40  <Field int[] mArrayIndices>
			mArrayNextIndices = Arrays.copyOf(mArrayNextIndices, ROW_SIZE);
	//  283  523:aload_0         
	//  284  524:aload_0         
	//  285  525:getfield        #42  <Field int[] mArrayNextIndices>
	//  286  528:aload_0         
	//  287  529:getfield        #36  <Field int ROW_SIZE>
	//  288  532:invokestatic    #83  <Method int[] Arrays.copyOf(int[], int)>
	//  289  535:putfield        #42  <Field int[] mArrayNextIndices>
		}
		mArrayIndices[i] = solvervariable.id;
	//  290  538:aload_0         
	//  291  539:getfield        #40  <Field int[] mArrayIndices>
	//  292  542:iload           4
	//  293  544:aload_1         
	//  294  545:getfield        #67  <Field int SolverVariable.id>
	//  295  548:iastore         
		mArrayValues[i] = f;
	//  296  549:aload_0         
	//  297  550:getfield        #44  <Field float[] mArrayValues>
	//  298  553:iload           4
	//  299  555:fload_2         
	//  300  556:fastore         
		if(l != -1)
	//* 301  557:iload           7
	//* 302  559:iconst_m1       
	//* 303  560:icmpeq          589
		{
			int ai3[] = mArrayNextIndices;
	//  304  563:aload_0         
	//  305  564:getfield        #42  <Field int[] mArrayNextIndices>
	//  306  567:astore          8
			ai3[i] = ai3[l];
	//  307  569:aload           8
	//  308  571:iload           4
	//  309  573:aload           8
	//  310  575:iload           7
	//  311  577:iaload          
	//  312  578:iastore         
			ai3[l] = i;
	//  313  579:aload           8
	//  314  581:iload           7
	//  315  583:iload           4
	//  316  585:iastore         
		} else
	//* 317  586:goto            606
		{
			mArrayNextIndices[i] = mHead;
	//  318  589:aload_0         
	//  319  590:getfield        #42  <Field int[] mArrayNextIndices>
	//  320  593:iload           4
	//  321  595:aload_0         
	//  322  596:getfield        #46  <Field int mHead>
	//  323  599:iastore         
			mHead = i;
	//  324  600:aload_0         
	//  325  601:iload           4
	//  326  603:putfield        #46  <Field int mHead>
		}
		solvervariable.usageInRowCount = solvervariable.usageInRowCount + 1;
	//  327  606:aload_1         
	//  328  607:aload_1         
	//  329  608:getfield        #62  <Field int SolverVariable.usageInRowCount>
	//  330  611:iconst_1        
	//  331  612:iadd            
	//  332  613:putfield        #62  <Field int SolverVariable.usageInRowCount>
		solvervariable.addToRow(mRow);
	//  333  616:aload_1         
	//  334  617:aload_0         
	//  335  618:getfield        #52  <Field ArrayRow mRow>
	//  336  621:invokevirtual   #71  <Method void SolverVariable.addToRow(ArrayRow)>
		currentSize = currentSize + 1;
	//  337  624:aload_0         
	//  338  625:aload_0         
	//  339  626:getfield        #34  <Field int currentSize>
	//  340  629:iconst_1        
	//  341  630:iadd            
	//  342  631:putfield        #34  <Field int currentSize>
		if(!mDidFillOnce)
	//* 343  634:aload_0         
	//* 344  635:getfield        #50  <Field boolean mDidFillOnce>
	//* 345  638:ifne            651
			mLast = mLast + 1;
	//  346  641:aload_0         
	//  347  642:aload_0         
	//  348  643:getfield        #48  <Field int mLast>
	//  349  646:iconst_1        
	//  350  647:iadd            
	//  351  648:putfield        #48  <Field int mLast>
		i = mLast;
	//  352  651:aload_0         
	//  353  652:getfield        #48  <Field int mLast>
	//  354  655:istore          4
		solvervariable = ((SolverVariable) (mArrayIndices));
	//  355  657:aload_0         
	//  356  658:getfield        #40  <Field int[] mArrayIndices>
	//  357  661:astore_1        
		if(i >= solvervariable.length)
	//* 358  662:iload           4
	//* 359  664:aload_1         
	//* 360  665:arraylength     
	//* 361  666:icmplt          682
		{
			mDidFillOnce = true;
	//  362  669:aload_0         
	//  363  670:iconst_1        
	//  364  671:putfield        #50  <Field boolean mDidFillOnce>
			mLast = solvervariable.length - 1;
	//  365  674:aload_0         
	//  366  675:aload_1         
	//  367  676:arraylength     
	//  368  677:iconst_1        
	//  369  678:isub            
	//  370  679:putfield        #48  <Field int mLast>
		}
	//  371  682:return          
	}

	SolverVariable chooseSubject(LinearSystem linearsystem)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore          8
		SolverVariable solvervariable4 = null;
	//    3    6:aconst_null     
	//    4    7:astore          17
		int i = 0;
	//    5    9:iconst_0        
	//    6   10:istore          7
		SolverVariable solvervariable3 = null;
	//    7   12:aconst_null     
	//    8   13:astore          16
		boolean flag3 = false;
	//    9   15:iconst_0        
	//   10   16:istore          12
		boolean flag2 = flag3;
	//   11   18:iload           12
	//   12   20:istore          11
		float f4 = 0.0F;
	//   13   22:fconst_0        
	//   14   23:fstore          6
		float f3 = f4;
	//   15   25:fload           6
	//   16   27:fstore          5
		while(j != -1 && i < currentSize) 
	//*  17   29:iload           8
	//*  18   31:iconst_m1       
	//*  19   32:icmpeq          583
	//*  20   35:iload           7
	//*  21   37:aload_0         
	//*  22   38:getfield        #34  <Field int currentSize>
	//*  23   41:icmpge          583
		{
			float f1 = mArrayValues[j];
	//   24   44:aload_0         
	//   25   45:getfield        #44  <Field float[] mArrayValues>
	//   26   48:iload           8
	//   27   50:faload          
	//   28   51:fstore_3        
			SolverVariable solvervariable = mCache.mIndexedVariables[mArrayIndices[j]];
	//   29   52:aload_0         
	//   30   53:getfield        #54  <Field Cache mCache>
	//   31   56:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   32   59:aload_0         
	//   33   60:getfield        #40  <Field int[] mArrayIndices>
	//   34   63:iload           8
	//   35   65:iaload          
	//   36   66:aaload          
	//   37   67:astore          13
			float f;
			if(f1 < 0.0F)
	//*  38   69:fload_3         
	//*  39   70:fconst_0        
	//*  40   71:fcmpg           
	//*  41   72:ifge            106
			{
				f = f1;
	//   42   75:fload_3         
	//   43   76:fstore_2        
				if(f1 > -0.001F)
	//*  44   77:fload_3         
	//*  45   78:ldc1            #92  <Float -0.001F>
	//*  46   80:fcmpl           
	//*  47   81:ifle            134
				{
					mArrayValues[j] = 0.0F;
	//   48   84:aload_0         
	//   49   85:getfield        #44  <Field float[] mArrayValues>
	//   50   88:iload           8
	//   51   90:fconst_0        
	//   52   91:fastore         
					solvervariable.removeFromRow(mRow);
	//   53   92:aload           13
	//   54   94:aload_0         
	//   55   95:getfield        #52  <Field ArrayRow mRow>
	//   56   98:invokevirtual   #74  <Method void SolverVariable.removeFromRow(ArrayRow)>
					f = 0.0F;
	//   57  101:fconst_0        
	//   58  102:fstore_2        
				}
			} else
	//*  59  103:goto            134
			{
				f = f1;
	//   60  106:fload_3         
	//   61  107:fstore_2        
				if(f1 < 0.001F)
	//*  62  108:fload_3         
	//*  63  109:ldc1            #93  <Float 0.001F>
	//*  64  111:fcmpg           
	//*  65  112:ifge            134
				{
					mArrayValues[j] = 0.0F;
	//   66  115:aload_0         
	//   67  116:getfield        #44  <Field float[] mArrayValues>
	//   68  119:iload           8
	//   69  121:fconst_0        
	//   70  122:fastore         
					solvervariable.removeFromRow(mRow);
	//   71  123:aload           13
	//   72  125:aload_0         
	//   73  126:getfield        #52  <Field ArrayRow mRow>
	//   74  129:invokevirtual   #74  <Method void SolverVariable.removeFromRow(ArrayRow)>
					f = 0.0F;
	//   75  132:fconst_0        
	//   76  133:fstore_2        
				}
			}
			SolverVariable solvervariable1 = solvervariable4;
	//   77  134:aload           17
	//   78  136:astore          14
			SolverVariable solvervariable2 = solvervariable3;
	//   79  138:aload           16
	//   80  140:astore          15
			f1 = f4;
	//   81  142:fload           6
	//   82  144:fstore_3        
			boolean flag = flag3;
	//   83  145:iload           12
	//   84  147:istore          9
			float f2 = f3;
	//   85  149:fload           5
	//   86  151:fstore          4
			boolean flag1 = flag2;
	//   87  153:iload           11
	//   88  155:istore          10
			if(f != 0.0F)
	//*  89  157:fload_2         
	//*  90  158:fconst_0        
	//*  91  159:fcmpl           
	//*  92  160:ifeq            542
				if(solvervariable.mType == SolverVariable.Type.UNRESTRICTED)
	//*  93  163:aload           13
	//*  94  165:getfield        #97  <Field SolverVariable$Type SolverVariable.mType>
	//*  95  168:getstatic       #102 <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//*  96  171:if_acmpne       331
				{
					if(solvervariable3 == null)
	//*  97  174:aload           16
	//*  98  176:ifnonnull       209
					{
						flag = isNew(solvervariable, linearsystem);
	//   99  179:aload_0         
	//  100  180:aload           13
	//  101  182:aload_1         
	//  102  183:invokespecial   #104 <Method boolean isNew(SolverVariable, LinearSystem)>
	//  103  186:istore          9
						solvervariable1 = solvervariable4;
	//  104  188:aload           17
	//  105  190:astore          14
						solvervariable2 = solvervariable;
	//  106  192:aload           13
	//  107  194:astore          15
						f1 = f;
	//  108  196:fload_2         
	//  109  197:fstore_3        
						f2 = f3;
	//  110  198:fload           5
	//  111  200:fstore          4
						flag1 = flag2;
	//  112  202:iload           11
	//  113  204:istore          10
					} else
	//* 114  206:goto            542
					if(f4 > f)
	//* 115  209:fload           6
	//* 116  211:fload_2         
	//* 117  212:fcmpl           
	//* 118  213:ifle            246
					{
						flag = isNew(solvervariable, linearsystem);
	//  119  216:aload_0         
	//  120  217:aload           13
	//  121  219:aload_1         
	//  122  220:invokespecial   #104 <Method boolean isNew(SolverVariable, LinearSystem)>
	//  123  223:istore          9
						solvervariable1 = solvervariable4;
	//  124  225:aload           17
	//  125  227:astore          14
						solvervariable2 = solvervariable;
	//  126  229:aload           13
	//  127  231:astore          15
						f1 = f;
	//  128  233:fload_2         
	//  129  234:fstore_3        
						f2 = f3;
	//  130  235:fload           5
	//  131  237:fstore          4
						flag1 = flag2;
	//  132  239:iload           11
	//  133  241:istore          10
					} else
	//* 134  243:goto            542
					{
						solvervariable1 = solvervariable4;
	//  135  246:aload           17
	//  136  248:astore          14
						solvervariable2 = solvervariable3;
	//  137  250:aload           16
	//  138  252:astore          15
						f1 = f4;
	//  139  254:fload           6
	//  140  256:fstore_3        
						flag = flag3;
	//  141  257:iload           12
	//  142  259:istore          9
						f2 = f3;
	//  143  261:fload           5
	//  144  263:fstore          4
						flag1 = flag2;
	//  145  265:iload           11
	//  146  267:istore          10
						if(!flag3)
	//* 147  269:iload           12
	//* 148  271:ifne            542
						{
							solvervariable1 = solvervariable4;
	//  149  274:aload           17
	//  150  276:astore          14
							solvervariable2 = solvervariable3;
	//  151  278:aload           16
	//  152  280:astore          15
							f1 = f4;
	//  153  282:fload           6
	//  154  284:fstore_3        
							flag = flag3;
	//  155  285:iload           12
	//  156  287:istore          9
							f2 = f3;
	//  157  289:fload           5
	//  158  291:fstore          4
							flag1 = flag2;
	//  159  293:iload           11
	//  160  295:istore          10
							if(isNew(solvervariable, linearsystem))
	//* 161  297:aload_0         
	//* 162  298:aload           13
	//* 163  300:aload_1         
	//* 164  301:invokespecial   #104 <Method boolean isNew(SolverVariable, LinearSystem)>
	//* 165  304:ifeq            542
							{
								flag = true;
	//  166  307:iconst_1        
	//  167  308:istore          9
								solvervariable1 = solvervariable4;
	//  168  310:aload           17
	//  169  312:astore          14
								solvervariable2 = solvervariable;
	//  170  314:aload           13
	//  171  316:astore          15
								f1 = f;
	//  172  318:fload_2         
	//  173  319:fstore_3        
								f2 = f3;
	//  174  320:fload           5
	//  175  322:fstore          4
								flag1 = flag2;
	//  176  324:iload           11
	//  177  326:istore          10
							}
						}
					}
				} else
	//* 178  328:goto            542
				{
					solvervariable1 = solvervariable4;
	//  179  331:aload           17
	//  180  333:astore          14
					solvervariable2 = solvervariable3;
	//  181  335:aload           16
	//  182  337:astore          15
					f1 = f4;
	//  183  339:fload           6
	//  184  341:fstore_3        
					flag = flag3;
	//  185  342:iload           12
	//  186  344:istore          9
					f2 = f3;
	//  187  346:fload           5
	//  188  348:fstore          4
					flag1 = flag2;
	//  189  350:iload           11
	//  190  352:istore          10
					if(solvervariable3 == null)
	//* 191  354:aload           16
	//* 192  356:ifnonnull       542
					{
						solvervariable1 = solvervariable4;
	//  193  359:aload           17
	//  194  361:astore          14
						solvervariable2 = solvervariable3;
	//  195  363:aload           16
	//  196  365:astore          15
						f1 = f4;
	//  197  367:fload           6
	//  198  369:fstore_3        
						flag = flag3;
	//  199  370:iload           12
	//  200  372:istore          9
						f2 = f3;
	//  201  374:fload           5
	//  202  376:fstore          4
						flag1 = flag2;
	//  203  378:iload           11
	//  204  380:istore          10
						if(f < 0.0F)
	//* 205  382:fload_2         
	//* 206  383:fconst_0        
	//* 207  384:fcmpg           
	//* 208  385:ifge            542
							if(solvervariable4 == null)
	//* 209  388:aload           17
	//* 210  390:ifnonnull       423
							{
								flag1 = isNew(solvervariable, linearsystem);
	//  211  393:aload_0         
	//  212  394:aload           13
	//  213  396:aload_1         
	//  214  397:invokespecial   #104 <Method boolean isNew(SolverVariable, LinearSystem)>
	//  215  400:istore          10
								solvervariable1 = solvervariable;
	//  216  402:aload           13
	//  217  404:astore          14
								solvervariable2 = solvervariable3;
	//  218  406:aload           16
	//  219  408:astore          15
								f1 = f4;
	//  220  410:fload           6
	//  221  412:fstore_3        
								flag = flag3;
	//  222  413:iload           12
	//  223  415:istore          9
								f2 = f;
	//  224  417:fload_2         
	//  225  418:fstore          4
							} else
	//* 226  420:goto            542
							if(f3 > f)
	//* 227  423:fload           5
	//* 228  425:fload_2         
	//* 229  426:fcmpl           
	//* 230  427:ifle            460
							{
								flag1 = isNew(solvervariable, linearsystem);
	//  231  430:aload_0         
	//  232  431:aload           13
	//  233  433:aload_1         
	//  234  434:invokespecial   #104 <Method boolean isNew(SolverVariable, LinearSystem)>
	//  235  437:istore          10
								solvervariable1 = solvervariable;
	//  236  439:aload           13
	//  237  441:astore          14
								solvervariable2 = solvervariable3;
	//  238  443:aload           16
	//  239  445:astore          15
								f1 = f4;
	//  240  447:fload           6
	//  241  449:fstore_3        
								flag = flag3;
	//  242  450:iload           12
	//  243  452:istore          9
								f2 = f;
	//  244  454:fload_2         
	//  245  455:fstore          4
							} else
	//* 246  457:goto            542
							{
								solvervariable1 = solvervariable4;
	//  247  460:aload           17
	//  248  462:astore          14
								solvervariable2 = solvervariable3;
	//  249  464:aload           16
	//  250  466:astore          15
								f1 = f4;
	//  251  468:fload           6
	//  252  470:fstore_3        
								flag = flag3;
	//  253  471:iload           12
	//  254  473:istore          9
								f2 = f3;
	//  255  475:fload           5
	//  256  477:fstore          4
								flag1 = flag2;
	//  257  479:iload           11
	//  258  481:istore          10
								if(!flag2)
	//* 259  483:iload           11
	//* 260  485:ifne            542
								{
									solvervariable1 = solvervariable4;
	//  261  488:aload           17
	//  262  490:astore          14
									solvervariable2 = solvervariable3;
	//  263  492:aload           16
	//  264  494:astore          15
									f1 = f4;
	//  265  496:fload           6
	//  266  498:fstore_3        
									flag = flag3;
	//  267  499:iload           12
	//  268  501:istore          9
									f2 = f3;
	//  269  503:fload           5
	//  270  505:fstore          4
									flag1 = flag2;
	//  271  507:iload           11
	//  272  509:istore          10
									if(isNew(solvervariable, linearsystem))
	//* 273  511:aload_0         
	//* 274  512:aload           13
	//* 275  514:aload_1         
	//* 276  515:invokespecial   #104 <Method boolean isNew(SolverVariable, LinearSystem)>
	//* 277  518:ifeq            542
									{
										flag1 = true;
	//  278  521:iconst_1        
	//  279  522:istore          10
										f2 = f;
	//  280  524:fload_2         
	//  281  525:fstore          4
										flag = flag3;
	//  282  527:iload           12
	//  283  529:istore          9
										f1 = f4;
	//  284  531:fload           6
	//  285  533:fstore_3        
										solvervariable2 = solvervariable3;
	//  286  534:aload           16
	//  287  536:astore          15
										solvervariable1 = solvervariable;
	//  288  538:aload           13
	//  289  540:astore          14
									}
								}
							}
					}
				}
			j = mArrayNextIndices[j];
	//  290  542:aload_0         
	//  291  543:getfield        #42  <Field int[] mArrayNextIndices>
	//  292  546:iload           8
	//  293  548:iaload          
	//  294  549:istore          8
			i++;
	//  295  551:iload           7
	//  296  553:iconst_1        
	//  297  554:iadd            
	//  298  555:istore          7
			solvervariable4 = solvervariable1;
	//  299  557:aload           14
	//  300  559:astore          17
			solvervariable3 = solvervariable2;
	//  301  561:aload           15
	//  302  563:astore          16
			f4 = f1;
	//  303  565:fload_3         
	//  304  566:fstore          6
			flag3 = flag;
	//  305  568:iload           9
	//  306  570:istore          12
			f3 = f2;
	//  307  572:fload           4
	//  308  574:fstore          5
			flag2 = flag1;
	//  309  576:iload           10
	//  310  578:istore          11
		}
	//* 311  580:goto            29
		if(solvervariable3 != null)
	//* 312  583:aload           16
	//* 313  585:ifnull          591
			return solvervariable3;
	//  314  588:aload           16
	//  315  590:areturn         
		else
			return solvervariable4;
	//  316  591:aload           17
	//  317  593:areturn         
	}

	public final void clear()
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore_2        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          61
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #34  <Field int currentSize>
	//*  11   17:icmpge          61
		{
			SolverVariable solvervariable = mCache.mIndexedVariables[mArrayIndices[j]];
	//   12   20:aload_0         
	//   13   21:getfield        #54  <Field Cache mCache>
	//   14   24:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   15   27:aload_0         
	//   16   28:getfield        #40  <Field int[] mArrayIndices>
	//   17   31:iload_2         
	//   18   32:iaload          
	//   19   33:aaload          
	//   20   34:astore_3        
			if(solvervariable != null)
	//*  21   35:aload_3         
	//*  22   36:ifnull          47
				solvervariable.removeFromRow(mRow);
	//   23   39:aload_3         
	//   24   40:aload_0         
	//   25   41:getfield        #52  <Field ArrayRow mRow>
	//   26   44:invokevirtual   #74  <Method void SolverVariable.removeFromRow(ArrayRow)>
			j = mArrayNextIndices[j];
	//   27   47:aload_0         
	//   28   48:getfield        #42  <Field int[] mArrayNextIndices>
	//   29   51:iload_2         
	//   30   52:iaload          
	//   31   53:istore_2        
		}

	//   32   54:iload_1         
	//   33   55:iconst_1        
	//   34   56:iadd            
	//   35   57:istore_1        
	//*  36   58:goto            7
		mHead = -1;
	//   37   61:aload_0         
	//   38   62:iconst_m1       
	//   39   63:putfield        #46  <Field int mHead>
		mLast = -1;
	//   40   66:aload_0         
	//   41   67:iconst_m1       
	//   42   68:putfield        #48  <Field int mLast>
		mDidFillOnce = false;
	//   43   71:aload_0         
	//   44   72:iconst_0        
	//   45   73:putfield        #50  <Field boolean mDidFillOnce>
		currentSize = 0;
	//   46   76:aload_0         
	//   47   77:iconst_0        
	//   48   78:putfield        #34  <Field int currentSize>
	//   49   81:return          
	}

	final boolean containsKey(SolverVariable solvervariable)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore_3        
		if(j == -1)
	//*   3    5:iload_3         
	//*   4    6:iconst_m1       
	//*   5    7:icmpne          12
			return false;
	//    6   10:iconst_0        
	//    7   11:ireturn         
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   8   12:iconst_0        
	//*   9   13:istore_2        
	//*  10   14:iload_3         
	//*  11   15:iconst_m1       
	//*  12   16:icmpeq          56
	//*  13   19:iload_2         
	//*  14   20:aload_0         
	//*  15   21:getfield        #34  <Field int currentSize>
	//*  16   24:icmpge          56
		{
			if(mArrayIndices[j] == solvervariable.id)
	//*  17   27:aload_0         
	//*  18   28:getfield        #40  <Field int[] mArrayIndices>
	//*  19   31:iload_3         
	//*  20   32:iaload          
	//*  21   33:aload_1         
	//*  22   34:getfield        #67  <Field int SolverVariable.id>
	//*  23   37:icmpne          42
				return true;
	//   24   40:iconst_1        
	//   25   41:ireturn         
			j = mArrayNextIndices[j];
	//   26   42:aload_0         
	//   27   43:getfield        #42  <Field int[] mArrayNextIndices>
	//   28   46:iload_3         
	//   29   47:iaload          
	//   30   48:istore_3        
		}

	//   31   49:iload_2         
	//   32   50:iconst_1        
	//   33   51:iadd            
	//   34   52:istore_2        
	//*  35   53:goto            14
		return false;
	//   36   56:iconst_0        
	//   37   57:ireturn         
	}

	public void display()
	{
		int j = currentSize;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int currentSize>
	//    2    4:istore_2        
		System.out.print("{ ");
	//    3    5:getstatic       #114 <Field PrintStream System.out>
	//    4    8:ldc1            #116 <String "{ ">
	//    5   10:invokevirtual   #122 <Method void PrintStream.print(String)>
		for(int i = 0; i < j; i++)
	//*   6   13:iconst_0        
	//*   7   14:istore_1        
	//*   8   15:iload_1         
	//*   9   16:iload_2         
	//*  10   17:icmpge          98
		{
			SolverVariable solvervariable = getVariable(i);
	//   11   20:aload_0         
	//   12   21:iload_1         
	//   13   22:invokevirtual   #126 <Method SolverVariable getVariable(int)>
	//   14   25:astore_3        
			if(solvervariable != null)
	//*  15   26:aload_3         
	//*  16   27:ifnonnull       33
	//*  17   30:goto            91
			{
				PrintStream printstream = System.out;
	//   18   33:getstatic       #114 <Field PrintStream System.out>
	//   19   36:astore          4
				StringBuilder stringbuilder = new StringBuilder();
	//   20   38:new             #128 <Class StringBuilder>
	//   21   41:dup             
	//   22   42:invokespecial   #129 <Method void StringBuilder()>
	//   23   45:astore          5
				stringbuilder.append(((Object) (solvervariable)));
	//   24   47:aload           5
	//   25   49:aload_3         
	//   26   50:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//   27   53:pop             
				stringbuilder.append(" = ");
	//   28   54:aload           5
	//   29   56:ldc1            #135 <String " = ">
	//   30   58:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   31   61:pop             
				stringbuilder.append(getVariableValue(i));
	//   32   62:aload           5
	//   33   64:aload_0         
	//   34   65:iload_1         
	//   35   66:invokevirtual   #142 <Method float getVariableValue(int)>
	//   36   69:invokevirtual   #145 <Method StringBuilder StringBuilder.append(float)>
	//   37   72:pop             
				stringbuilder.append(" ");
	//   38   73:aload           5
	//   39   75:ldc1            #147 <String " ">
	//   40   77:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
				printstream.print(stringbuilder.toString());
	//   42   81:aload           4
	//   43   83:aload           5
	//   44   85:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   45   88:invokevirtual   #122 <Method void PrintStream.print(String)>
			}
		}

	//   46   91:iload_1         
	//   47   92:iconst_1        
	//   48   93:iadd            
	//   49   94:istore_1        
	//*  50   95:goto            15
		System.out.println(" }");
	//   51   98:getstatic       #114 <Field PrintStream System.out>
	//   52  101:ldc1            #153 <String " }">
	//   53  103:invokevirtual   #156 <Method void PrintStream.println(String)>
	//   54  106:return          
	}

	void divideByAmount(float f)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore_3        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          50
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #34  <Field int currentSize>
	//*  11   17:icmpge          50
		{
			float af[] = mArrayValues;
	//   12   20:aload_0         
	//   13   21:getfield        #44  <Field float[] mArrayValues>
	//   14   24:astore          4
			af[j] = af[j] / f;
	//   15   26:aload           4
	//   16   28:iload_3         
	//   17   29:aload           4
	//   18   31:iload_3         
	//   19   32:faload          
	//   20   33:fload_1         
	//   21   34:fdiv            
	//   22   35:fastore         
			j = mArrayNextIndices[j];
	//   23   36:aload_0         
	//   24   37:getfield        #42  <Field int[] mArrayNextIndices>
	//   25   40:iload_3         
	//   26   41:iaload          
	//   27   42:istore_3        
		}

	//   28   43:iload_2         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_2        
	//*  32   47:goto            7
	//   33   50:return          
	}

	public final float get(SolverVariable solvervariable)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore_3        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          54
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #34  <Field int currentSize>
	//*  11   17:icmpge          54
		{
			if(mArrayIndices[j] == solvervariable.id)
	//*  12   20:aload_0         
	//*  13   21:getfield        #40  <Field int[] mArrayIndices>
	//*  14   24:iload_3         
	//*  15   25:iaload          
	//*  16   26:aload_1         
	//*  17   27:getfield        #67  <Field int SolverVariable.id>
	//*  18   30:icmpne          40
				return mArrayValues[j];
	//   19   33:aload_0         
	//   20   34:getfield        #44  <Field float[] mArrayValues>
	//   21   37:iload_3         
	//   22   38:faload          
	//   23   39:freturn         
			j = mArrayNextIndices[j];
	//   24   40:aload_0         
	//   25   41:getfield        #42  <Field int[] mArrayNextIndices>
	//   26   44:iload_3         
	//   27   45:iaload          
	//   28   46:istore_3        
		}

	//   29   47:iload_2         
	//   30   48:iconst_1        
	//   31   49:iadd            
	//   32   50:istore_2        
	//*  33   51:goto            7
		return 0.0F;
	//   34   54:fconst_0        
	//   35   55:freturn         
	}

	SolverVariable getPivotCandidate()
	{
		SolverVariable solvervariable;
label0:
		{
			solvervariable = candidate;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field SolverVariable candidate>
	//    2    4:astore_3        
			if(solvervariable != null)
				break label0;
	//    3    5:aload_3         
	//    4    6:ifnonnull       103
			int j = mHead;
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field int mHead>
	//    7   13:istore_2        
			int i = 0;
	//    8   14:iconst_0        
	//    9   15:istore_1        
			SolverVariable solvervariable1;
			for(solvervariable = null; j != -1 && i < currentSize; solvervariable = solvervariable1)
	//*  10   16:aconst_null     
	//*  11   17:astore_3        
	//*  12   18:iload_2         
	//*  13   19:iconst_m1       
	//*  14   20:icmpeq          101
	//*  15   23:iload_1         
	//*  16   24:aload_0         
	//*  17   25:getfield        #34  <Field int currentSize>
	//*  18   28:icmpge          101
			{
label1:
				{
					solvervariable1 = solvervariable;
	//   19   31:aload_3         
	//   20   32:astore          4
					if(mArrayValues[j] >= 0.0F)
						break label1;
	//   21   34:aload_0         
	//   22   35:getfield        #44  <Field float[] mArrayValues>
	//   23   38:iload_2         
	//   24   39:faload          
	//   25   40:fconst_0        
	//   26   41:fcmpg           
	//   27   42:ifge            84
					SolverVariable solvervariable2 = mCache.mIndexedVariables[mArrayIndices[j]];
	//   28   45:aload_0         
	//   29   46:getfield        #54  <Field Cache mCache>
	//   30   49:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   31   52:aload_0         
	//   32   53:getfield        #40  <Field int[] mArrayIndices>
	//   33   56:iload_2         
	//   34   57:iaload          
	//   35   58:aaload          
	//   36   59:astore          5
					if(solvervariable != null)
	//*  37   61:aload_3         
	//*  38   62:ifnull          80
					{
						solvervariable1 = solvervariable;
	//   39   65:aload_3         
	//   40   66:astore          4
						if(solvervariable.strength >= solvervariable2.strength)
							break label1;
	//   41   68:aload_3         
	//   42   69:getfield        #165 <Field int SolverVariable.strength>
	//   43   72:aload           5
	//   44   74:getfield        #165 <Field int SolverVariable.strength>
	//   45   77:icmpge          84
					}
					solvervariable1 = solvervariable2;
	//   46   80:aload           5
	//   47   82:astore          4
				}
				j = mArrayNextIndices[j];
	//   48   84:aload_0         
	//   49   85:getfield        #42  <Field int[] mArrayNextIndices>
	//   50   88:iload_2         
	//   51   89:iaload          
	//   52   90:istore_2        
				i++;
	//   53   91:iload_1         
	//   54   92:iconst_1        
	//   55   93:iadd            
	//   56   94:istore_1        
			}

	//   57   95:aload           4
	//   58   97:astore_3        
	//*  59   98:goto            18
			return solvervariable;
	//   60  101:aload_3         
	//   61  102:areturn         
		}
		return solvervariable;
	//   62  103:aload_3         
	//   63  104:areturn         
	}

	SolverVariable getPivotCandidate(boolean aflag[], SolverVariable solvervariable)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore          7
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore          6
		SolverVariable solvervariable1 = null;
	//    5    9:aconst_null     
	//    6   10:astore          8
		float f1;
		for(float f = 0.0F; j != -1 && i < currentSize; f = f1)
	//*   7   12:fconst_0        
	//*   8   13:fstore_3        
	//*   9   14:iload           7
	//*  10   16:iconst_m1       
	//*  11   17:icmpeq          184
	//*  12   20:iload           6
	//*  13   22:aload_0         
	//*  14   23:getfield        #34  <Field int currentSize>
	//*  15   26:icmpge          184
		{
			SolverVariable solvervariable2;
label0:
			{
				solvervariable2 = solvervariable1;
	//   16   29:aload           8
	//   17   31:astore          9
				f1 = f;
	//   18   33:fload_3         
	//   19   34:fstore          4
				if(mArrayValues[j] >= 0.0F)
					break label0;
	//   20   36:aload_0         
	//   21   37:getfield        #44  <Field float[] mArrayValues>
	//   22   40:iload           7
	//   23   42:faload          
	//   24   43:fconst_0        
	//   25   44:fcmpg           
	//   26   45:ifge            159
				SolverVariable solvervariable3 = mCache.mIndexedVariables[mArrayIndices[j]];
	//   27   48:aload_0         
	//   28   49:getfield        #54  <Field Cache mCache>
	//   29   52:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   30   55:aload_0         
	//   31   56:getfield        #40  <Field int[] mArrayIndices>
	//   32   59:iload           7
	//   33   61:iaload          
	//   34   62:aaload          
	//   35   63:astore          10
				if(aflag != null)
	//*  36   65:aload_1         
	//*  37   66:ifnull          86
				{
					solvervariable2 = solvervariable1;
	//   38   69:aload           8
	//   39   71:astore          9
					f1 = f;
	//   40   73:fload_3         
	//   41   74:fstore          4
					if(aflag[solvervariable3.id])
						break label0;
	//   42   76:aload_1         
	//   43   77:aload           10
	//   44   79:getfield        #67  <Field int SolverVariable.id>
	//   45   82:baload          
	//   46   83:ifne            159
				}
				solvervariable2 = solvervariable1;
	//   47   86:aload           8
	//   48   88:astore          9
				f1 = f;
	//   49   90:fload_3         
	//   50   91:fstore          4
				if(solvervariable3 == solvervariable)
					break label0;
	//   51   93:aload           10
	//   52   95:aload_2         
	//   53   96:if_acmpeq       159
				if(solvervariable3.mType != SolverVariable.Type.SLACK)
	//*  54   99:aload           10
	//*  55  101:getfield        #97  <Field SolverVariable$Type SolverVariable.mType>
	//*  56  104:getstatic       #169 <Field SolverVariable$Type SolverVariable$Type.SLACK>
	//*  57  107:if_acmpeq       128
				{
					solvervariable2 = solvervariable1;
	//   58  110:aload           8
	//   59  112:astore          9
					f1 = f;
	//   60  114:fload_3         
	//   61  115:fstore          4
					if(solvervariable3.mType != SolverVariable.Type.ERROR)
						break label0;
	//   62  117:aload           10
	//   63  119:getfield        #97  <Field SolverVariable$Type SolverVariable.mType>
	//   64  122:getstatic       #172 <Field SolverVariable$Type SolverVariable$Type.ERROR>
	//   65  125:if_acmpne       159
				}
				float f2 = mArrayValues[j];
	//   66  128:aload_0         
	//   67  129:getfield        #44  <Field float[] mArrayValues>
	//   68  132:iload           7
	//   69  134:faload          
	//   70  135:fstore          5
				solvervariable2 = solvervariable1;
	//   71  137:aload           8
	//   72  139:astore          9
				f1 = f;
	//   73  141:fload_3         
	//   74  142:fstore          4
				if(f2 < f)
	//*  75  144:fload           5
	//*  76  146:fload_3         
	//*  77  147:fcmpg           
	//*  78  148:ifge            159
				{
					solvervariable2 = solvervariable3;
	//   79  151:aload           10
	//   80  153:astore          9
					f1 = f2;
	//   81  155:fload           5
	//   82  157:fstore          4
				}
			}
			j = mArrayNextIndices[j];
	//   83  159:aload_0         
	//   84  160:getfield        #42  <Field int[] mArrayNextIndices>
	//   85  163:iload           7
	//   86  165:iaload          
	//   87  166:istore          7
			i++;
	//   88  168:iload           6
	//   89  170:iconst_1        
	//   90  171:iadd            
	//   91  172:istore          6
			solvervariable1 = solvervariable2;
	//   92  174:aload           9
	//   93  176:astore          8
		}

	//   94  178:fload           4
	//   95  180:fstore_3        
	//*  96  181:goto            14
		return solvervariable1;
	//   97  184:aload           8
	//   98  186:areturn         
	}

	final SolverVariable getVariable(int i)
	{
		int k = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore_3        
		for(int j = 0; k != -1 && j < currentSize; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          54
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #34  <Field int currentSize>
	//*  11   17:icmpge          54
		{
			if(j == i)
	//*  12   20:iload_2         
	//*  13   21:iload_1         
	//*  14   22:icmpne          40
				return mCache.mIndexedVariables[mArrayIndices[k]];
	//   15   25:aload_0         
	//   16   26:getfield        #54  <Field Cache mCache>
	//   17   29:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   18   32:aload_0         
	//   19   33:getfield        #40  <Field int[] mArrayIndices>
	//   20   36:iload_3         
	//   21   37:iaload          
	//   22   38:aaload          
	//   23   39:areturn         
			k = mArrayNextIndices[k];
	//   24   40:aload_0         
	//   25   41:getfield        #42  <Field int[] mArrayNextIndices>
	//   26   44:iload_3         
	//   27   45:iaload          
	//   28   46:istore_3        
		}

	//   29   47:iload_2         
	//   30   48:iconst_1        
	//   31   49:iadd            
	//   32   50:istore_2        
	//*  33   51:goto            7
		return null;
	//   34   54:aconst_null     
	//   35   55:areturn         
	}

	final float getVariableValue(int i)
	{
		int k = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore_3        
		for(int j = 0; k != -1 && j < currentSize; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          46
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #34  <Field int currentSize>
	//*  11   17:icmpge          46
		{
			if(j == i)
	//*  12   20:iload_2         
	//*  13   21:iload_1         
	//*  14   22:icmpne          32
				return mArrayValues[k];
	//   15   25:aload_0         
	//   16   26:getfield        #44  <Field float[] mArrayValues>
	//   17   29:iload_3         
	//   18   30:faload          
	//   19   31:freturn         
			k = mArrayNextIndices[k];
	//   20   32:aload_0         
	//   21   33:getfield        #42  <Field int[] mArrayNextIndices>
	//   22   36:iload_3         
	//   23   37:iaload          
	//   24   38:istore_3        
		}

	//   25   39:iload_2         
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:istore_2        
	//*  29   43:goto            7
		return 0.0F;
	//   30   46:fconst_0        
	//   31   47:freturn         
	}

	boolean hasAtLeastOnePositiveVariable()
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore_2        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          47
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #34  <Field int currentSize>
	//*  11   17:icmpge          47
		{
			if(mArrayValues[j] > 0.0F)
	//*  12   20:aload_0         
	//*  13   21:getfield        #44  <Field float[] mArrayValues>
	//*  14   24:iload_2         
	//*  15   25:faload          
	//*  16   26:fconst_0        
	//*  17   27:fcmpl           
	//*  18   28:ifle            33
				return true;
	//   19   31:iconst_1        
	//   20   32:ireturn         
			j = mArrayNextIndices[j];
	//   21   33:aload_0         
	//   22   34:getfield        #42  <Field int[] mArrayNextIndices>
	//   23   37:iload_2         
	//   24   38:iaload          
	//   25   39:istore_2        
		}

	//   26   40:iload_1         
	//   27   41:iconst_1        
	//   28   42:iadd            
	//   29   43:istore_1        
	//*  30   44:goto            7
		return false;
	//   31   47:iconst_0        
	//   32   48:ireturn         
	}

	void invert()
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore_2        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          48
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #34  <Field int currentSize>
	//*  11   17:icmpge          48
		{
			float af[] = mArrayValues;
	//   12   20:aload_0         
	//   13   21:getfield        #44  <Field float[] mArrayValues>
	//   14   24:astore_3        
			af[j] = af[j] * -1F;
	//   15   25:aload_3         
	//   16   26:iload_2         
	//   17   27:aload_3         
	//   18   28:iload_2         
	//   19   29:faload          
	//   20   30:ldc1            #176 <Float -1F>
	//   21   32:fmul            
	//   22   33:fastore         
			j = mArrayNextIndices[j];
	//   23   34:aload_0         
	//   24   35:getfield        #42  <Field int[] mArrayNextIndices>
	//   25   38:iload_2         
	//   26   39:iaload          
	//   27   40:istore_2        
		}

	//   28   41:iload_1         
	//   29   42:iconst_1        
	//   30   43:iadd            
	//   31   44:istore_1        
	//*  32   45:goto            7
	//   33   48:return          
	}

	public final void put(SolverVariable solvervariable, float f)
	{
		if(f == 0.0F)
	//*   0    0:fload_2         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifne            14
		{
			remove(solvervariable, true);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:iconst_1        
	//    7    9:invokevirtual   #182 <Method float remove(SolverVariable, boolean)>
	//    8   12:pop             
			return;
	//    9   13:return          
		}
		int i = mHead;
	//   10   14:aload_0         
	//   11   15:getfield        #46  <Field int mHead>
	//   12   18:istore_3        
		if(i == -1)
	//*  13   19:iload_3         
	//*  14   20:iconst_m1       
	//*  15   21:icmpne          140
		{
			mHead = 0;
	//   16   24:aload_0         
	//   17   25:iconst_0        
	//   18   26:putfield        #46  <Field int mHead>
			float af[] = mArrayValues;
	//   19   29:aload_0         
	//   20   30:getfield        #44  <Field float[] mArrayValues>
	//   21   33:astore          7
			i = mHead;
	//   22   35:aload_0         
	//   23   36:getfield        #46  <Field int mHead>
	//   24   39:istore_3        
			af[i] = f;
	//   25   40:aload           7
	//   26   42:iload_3         
	//   27   43:fload_2         
	//   28   44:fastore         
			mArrayIndices[i] = solvervariable.id;
	//   29   45:aload_0         
	//   30   46:getfield        #40  <Field int[] mArrayIndices>
	//   31   49:iload_3         
	//   32   50:aload_1         
	//   33   51:getfield        #67  <Field int SolverVariable.id>
	//   34   54:iastore         
			mArrayNextIndices[mHead] = -1;
	//   35   55:aload_0         
	//   36   56:getfield        #42  <Field int[] mArrayNextIndices>
	//   37   59:aload_0         
	//   38   60:getfield        #46  <Field int mHead>
	//   39   63:iconst_m1       
	//   40   64:iastore         
			solvervariable.usageInRowCount = solvervariable.usageInRowCount + 1;
	//   41   65:aload_1         
	//   42   66:aload_1         
	//   43   67:getfield        #62  <Field int SolverVariable.usageInRowCount>
	//   44   70:iconst_1        
	//   45   71:iadd            
	//   46   72:putfield        #62  <Field int SolverVariable.usageInRowCount>
			solvervariable.addToRow(mRow);
	//   47   75:aload_1         
	//   48   76:aload_0         
	//   49   77:getfield        #52  <Field ArrayRow mRow>
	//   50   80:invokevirtual   #71  <Method void SolverVariable.addToRow(ArrayRow)>
			currentSize = currentSize + 1;
	//   51   83:aload_0         
	//   52   84:aload_0         
	//   53   85:getfield        #34  <Field int currentSize>
	//   54   88:iconst_1        
	//   55   89:iadd            
	//   56   90:putfield        #34  <Field int currentSize>
			if(!mDidFillOnce)
	//*  57   93:aload_0         
	//*  58   94:getfield        #50  <Field boolean mDidFillOnce>
	//*  59   97:ifne            139
			{
				mLast = mLast + 1;
	//   60  100:aload_0         
	//   61  101:aload_0         
	//   62  102:getfield        #48  <Field int mLast>
	//   63  105:iconst_1        
	//   64  106:iadd            
	//   65  107:putfield        #48  <Field int mLast>
				i = mLast;
	//   66  110:aload_0         
	//   67  111:getfield        #48  <Field int mLast>
	//   68  114:istore_3        
				solvervariable = ((SolverVariable) (mArrayIndices));
	//   69  115:aload_0         
	//   70  116:getfield        #40  <Field int[] mArrayIndices>
	//   71  119:astore_1        
				if(i >= solvervariable.length)
	//*  72  120:iload_3         
	//*  73  121:aload_1         
	//*  74  122:arraylength     
	//*  75  123:icmplt          139
				{
					mDidFillOnce = true;
	//   76  126:aload_0         
	//   77  127:iconst_1        
	//   78  128:putfield        #50  <Field boolean mDidFillOnce>
					mLast = solvervariable.length - 1;
	//   79  131:aload_0         
	//   80  132:aload_1         
	//   81  133:arraylength     
	//   82  134:iconst_1        
	//   83  135:isub            
	//   84  136:putfield        #48  <Field int mLast>
				}
			}
			return;
	//   85  139:return          
		}
		int j = 0;
	//   86  140:iconst_0        
	//   87  141:istore          4
		int l = -1;
	//   88  143:iconst_m1       
	//   89  144:istore          6
		for(; i != -1 && j < currentSize; j++)
	//*  90  146:iload_3         
	//*  91  147:iconst_m1       
	//*  92  148:icmpeq          213
	//*  93  151:iload           4
	//*  94  153:aload_0         
	//*  95  154:getfield        #34  <Field int currentSize>
	//*  96  157:icmpge          213
		{
			if(mArrayIndices[i] == solvervariable.id)
	//*  97  160:aload_0         
	//*  98  161:getfield        #40  <Field int[] mArrayIndices>
	//*  99  164:iload_3         
	//* 100  165:iaload          
	//* 101  166:aload_1         
	//* 102  167:getfield        #67  <Field int SolverVariable.id>
	//* 103  170:icmpne          181
			{
				mArrayValues[i] = f;
	//  104  173:aload_0         
	//  105  174:getfield        #44  <Field float[] mArrayValues>
	//  106  177:iload_3         
	//  107  178:fload_2         
	//  108  179:fastore         
				return;
	//  109  180:return          
			}
			if(mArrayIndices[i] < solvervariable.id)
	//* 110  181:aload_0         
	//* 111  182:getfield        #40  <Field int[] mArrayIndices>
	//* 112  185:iload_3         
	//* 113  186:iaload          
	//* 114  187:aload_1         
	//* 115  188:getfield        #67  <Field int SolverVariable.id>
	//* 116  191:icmpge          197
				l = i;
	//  117  194:iload_3         
	//  118  195:istore          6
			i = mArrayNextIndices[i];
	//  119  197:aload_0         
	//  120  198:getfield        #42  <Field int[] mArrayNextIndices>
	//  121  201:iload_3         
	//  122  202:iaload          
	//  123  203:istore_3        
		}

	//  124  204:iload           4
	//  125  206:iconst_1        
	//  126  207:iadd            
	//  127  208:istore          4
	//* 128  210:goto            146
		i = mLast;
	//  129  213:aload_0         
	//  130  214:getfield        #48  <Field int mLast>
	//  131  217:istore_3        
		if(mDidFillOnce)
	//* 132  218:aload_0         
	//* 133  219:getfield        #50  <Field boolean mDidFillOnce>
	//* 134  222:ifeq            249
		{
			int ai[] = mArrayIndices;
	//  135  225:aload_0         
	//  136  226:getfield        #40  <Field int[] mArrayIndices>
	//  137  229:astore          7
			if(ai[i] != -1)
	//* 138  231:aload           7
	//* 139  233:iload_3         
	//* 140  234:iaload          
	//* 141  235:iconst_m1       
	//* 142  236:icmpne          242
	//* 143  239:goto            253
				i = ai.length;
	//  144  242:aload           7
	//  145  244:arraylength     
	//  146  245:istore_3        
		} else
	//* 147  246:goto            253
		{
			i++;
	//  148  249:iload_3         
	//  149  250:iconst_1        
	//  150  251:iadd            
	//  151  252:istore_3        
		}
		int ai1[] = mArrayIndices;
	//  152  253:aload_0         
	//  153  254:getfield        #40  <Field int[] mArrayIndices>
	//  154  257:astore          7
		j = i;
	//  155  259:iload_3         
	//  156  260:istore          4
		if(i >= ai1.length)
	//* 157  262:iload_3         
	//* 158  263:aload           7
	//* 159  265:arraylength     
	//* 160  266:icmplt          327
		{
			j = i;
	//  161  269:iload_3         
	//  162  270:istore          4
			if(currentSize < ai1.length)
	//* 163  272:aload_0         
	//* 164  273:getfield        #34  <Field int currentSize>
	//* 165  276:aload           7
	//* 166  278:arraylength     
	//* 167  279:icmpge          327
			{
				int k = 0;
	//  168  282:iconst_0        
	//  169  283:istore          5
				do
				{
					ai1 = mArrayIndices;
	//  170  285:aload_0         
	//  171  286:getfield        #40  <Field int[] mArrayIndices>
	//  172  289:astore          7
					j = i;
	//  173  291:iload_3         
	//  174  292:istore          4
					if(k >= ai1.length)
						break;
	//  175  294:iload           5
	//  176  296:aload           7
	//  177  298:arraylength     
	//  178  299:icmpge          327
					if(ai1[k] == -1)
	//* 179  302:aload           7
	//* 180  304:iload           5
	//* 181  306:iaload          
	//* 182  307:iconst_m1       
	//* 183  308:icmpne          318
					{
						j = k;
	//  184  311:iload           5
	//  185  313:istore          4
						break;
	//  186  315:goto            327
					}
					k++;
	//  187  318:iload           5
	//  188  320:iconst_1        
	//  189  321:iadd            
	//  190  322:istore          5
				} while(true);
	//  191  324:goto            285
			}
		}
		ai1 = mArrayIndices;
	//  192  327:aload_0         
	//  193  328:getfield        #40  <Field int[] mArrayIndices>
	//  194  331:astore          7
		i = j;
	//  195  333:iload           4
	//  196  335:istore_3        
		if(j >= ai1.length)
	//* 197  336:iload           4
	//* 198  338:aload           7
	//* 199  340:arraylength     
	//* 200  341:icmplt          415
		{
			i = ai1.length;
	//  201  344:aload           7
	//  202  346:arraylength     
	//  203  347:istore_3        
			ROW_SIZE = ROW_SIZE * 2;
	//  204  348:aload_0         
	//  205  349:aload_0         
	//  206  350:getfield        #36  <Field int ROW_SIZE>
	//  207  353:iconst_2        
	//  208  354:imul            
	//  209  355:putfield        #36  <Field int ROW_SIZE>
			mDidFillOnce = false;
	//  210  358:aload_0         
	//  211  359:iconst_0        
	//  212  360:putfield        #50  <Field boolean mDidFillOnce>
			mLast = i - 1;
	//  213  363:aload_0         
	//  214  364:iload_3         
	//  215  365:iconst_1        
	//  216  366:isub            
	//  217  367:putfield        #48  <Field int mLast>
			mArrayValues = Arrays.copyOf(mArrayValues, ROW_SIZE);
	//  218  370:aload_0         
	//  219  371:aload_0         
	//  220  372:getfield        #44  <Field float[] mArrayValues>
	//  221  375:aload_0         
	//  222  376:getfield        #36  <Field int ROW_SIZE>
	//  223  379:invokestatic    #80  <Method float[] Arrays.copyOf(float[], int)>
	//  224  382:putfield        #44  <Field float[] mArrayValues>
			mArrayIndices = Arrays.copyOf(mArrayIndices, ROW_SIZE);
	//  225  385:aload_0         
	//  226  386:aload_0         
	//  227  387:getfield        #40  <Field int[] mArrayIndices>
	//  228  390:aload_0         
	//  229  391:getfield        #36  <Field int ROW_SIZE>
	//  230  394:invokestatic    #83  <Method int[] Arrays.copyOf(int[], int)>
	//  231  397:putfield        #40  <Field int[] mArrayIndices>
			mArrayNextIndices = Arrays.copyOf(mArrayNextIndices, ROW_SIZE);
	//  232  400:aload_0         
	//  233  401:aload_0         
	//  234  402:getfield        #42  <Field int[] mArrayNextIndices>
	//  235  405:aload_0         
	//  236  406:getfield        #36  <Field int ROW_SIZE>
	//  237  409:invokestatic    #83  <Method int[] Arrays.copyOf(int[], int)>
	//  238  412:putfield        #42  <Field int[] mArrayNextIndices>
		}
		mArrayIndices[i] = solvervariable.id;
	//  239  415:aload_0         
	//  240  416:getfield        #40  <Field int[] mArrayIndices>
	//  241  419:iload_3         
	//  242  420:aload_1         
	//  243  421:getfield        #67  <Field int SolverVariable.id>
	//  244  424:iastore         
		mArrayValues[i] = f;
	//  245  425:aload_0         
	//  246  426:getfield        #44  <Field float[] mArrayValues>
	//  247  429:iload_3         
	//  248  430:fload_2         
	//  249  431:fastore         
		if(l != -1)
	//* 250  432:iload           6
	//* 251  434:iconst_m1       
	//* 252  435:icmpeq          462
		{
			int ai2[] = mArrayNextIndices;
	//  253  438:aload_0         
	//  254  439:getfield        #42  <Field int[] mArrayNextIndices>
	//  255  442:astore          7
			ai2[i] = ai2[l];
	//  256  444:aload           7
	//  257  446:iload_3         
	//  258  447:aload           7
	//  259  449:iload           6
	//  260  451:iaload          
	//  261  452:iastore         
			ai2[l] = i;
	//  262  453:aload           7
	//  263  455:iload           6
	//  264  457:iload_3         
	//  265  458:iastore         
		} else
	//* 266  459:goto            477
		{
			mArrayNextIndices[i] = mHead;
	//  267  462:aload_0         
	//  268  463:getfield        #42  <Field int[] mArrayNextIndices>
	//  269  466:iload_3         
	//  270  467:aload_0         
	//  271  468:getfield        #46  <Field int mHead>
	//  272  471:iastore         
			mHead = i;
	//  273  472:aload_0         
	//  274  473:iload_3         
	//  275  474:putfield        #46  <Field int mHead>
		}
		solvervariable.usageInRowCount = solvervariable.usageInRowCount + 1;
	//  276  477:aload_1         
	//  277  478:aload_1         
	//  278  479:getfield        #62  <Field int SolverVariable.usageInRowCount>
	//  279  482:iconst_1        
	//  280  483:iadd            
	//  281  484:putfield        #62  <Field int SolverVariable.usageInRowCount>
		solvervariable.addToRow(mRow);
	//  282  487:aload_1         
	//  283  488:aload_0         
	//  284  489:getfield        #52  <Field ArrayRow mRow>
	//  285  492:invokevirtual   #71  <Method void SolverVariable.addToRow(ArrayRow)>
		currentSize = currentSize + 1;
	//  286  495:aload_0         
	//  287  496:aload_0         
	//  288  497:getfield        #34  <Field int currentSize>
	//  289  500:iconst_1        
	//  290  501:iadd            
	//  291  502:putfield        #34  <Field int currentSize>
		if(!mDidFillOnce)
	//* 292  505:aload_0         
	//* 293  506:getfield        #50  <Field boolean mDidFillOnce>
	//* 294  509:ifne            522
			mLast = mLast + 1;
	//  295  512:aload_0         
	//  296  513:aload_0         
	//  297  514:getfield        #48  <Field int mLast>
	//  298  517:iconst_1        
	//  299  518:iadd            
	//  300  519:putfield        #48  <Field int mLast>
		if(currentSize >= mArrayIndices.length)
	//* 301  522:aload_0         
	//* 302  523:getfield        #34  <Field int currentSize>
	//* 303  526:aload_0         
	//* 304  527:getfield        #40  <Field int[] mArrayIndices>
	//* 305  530:arraylength     
	//* 306  531:icmplt          539
			mDidFillOnce = true;
	//  307  534:aload_0         
	//  308  535:iconst_1        
	//  309  536:putfield        #50  <Field boolean mDidFillOnce>
		i = mLast;
	//  310  539:aload_0         
	//  311  540:getfield        #48  <Field int mLast>
	//  312  543:istore_3        
		solvervariable = ((SolverVariable) (mArrayIndices));
	//  313  544:aload_0         
	//  314  545:getfield        #40  <Field int[] mArrayIndices>
	//  315  548:astore_1        
		if(i >= solvervariable.length)
	//* 316  549:iload_3         
	//* 317  550:aload_1         
	//* 318  551:arraylength     
	//* 319  552:icmplt          568
		{
			mDidFillOnce = true;
	//  320  555:aload_0         
	//  321  556:iconst_1        
	//  322  557:putfield        #50  <Field boolean mDidFillOnce>
			mLast = solvervariable.length - 1;
	//  323  560:aload_0         
	//  324  561:aload_1         
	//  325  562:arraylength     
	//  326  563:iconst_1        
	//  327  564:isub            
	//  328  565:putfield        #48  <Field int mLast>
		}
	//  329  568:return          
	}

	public final float remove(SolverVariable solvervariable, boolean flag)
	{
		if(candidate == solvervariable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field SolverVariable candidate>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			candidate = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #38  <Field SolverVariable candidate>
		int i = mHead;
	//    7   13:aload_0         
	//    8   14:getfield        #46  <Field int mHead>
	//    9   17:istore_3        
		if(i == -1)
	//*  10   18:iload_3         
	//*  11   19:iconst_m1       
	//*  12   20:icmpne          25
			return 0.0F;
	//   13   23:fconst_0        
	//   14   24:freturn         
		int j = 0;
	//   15   25:iconst_0        
	//   16   26:istore          4
		int k = -1;
	//   17   28:iconst_m1       
	//   18   29:istore          5
		int l;
		for(; i != -1 && j < currentSize; i = l)
	//*  19   31:iload_3         
	//*  20   32:iconst_m1       
	//*  21   33:icmpeq          175
	//*  22   36:iload           4
	//*  23   38:aload_0         
	//*  24   39:getfield        #34  <Field int currentSize>
	//*  25   42:icmpge          175
		{
			if(mArrayIndices[i] == solvervariable.id)
	//*  26   45:aload_0         
	//*  27   46:getfield        #40  <Field int[] mArrayIndices>
	//*  28   49:iload_3         
	//*  29   50:iaload          
	//*  30   51:aload_1         
	//*  31   52:getfield        #67  <Field int SolverVariable.id>
	//*  32   55:icmpne          152
			{
				if(i == mHead)
	//*  33   58:iload_3         
	//*  34   59:aload_0         
	//*  35   60:getfield        #46  <Field int mHead>
	//*  36   63:icmpne          79
				{
					mHead = mArrayNextIndices[i];
	//   37   66:aload_0         
	//   38   67:aload_0         
	//   39   68:getfield        #42  <Field int[] mArrayNextIndices>
	//   40   71:iload_3         
	//   41   72:iaload          
	//   42   73:putfield        #46  <Field int mHead>
				} else
	//*  43   76:goto            94
				{
					int ai[] = mArrayNextIndices;
	//   44   79:aload_0         
	//   45   80:getfield        #42  <Field int[] mArrayNextIndices>
	//   46   83:astore          7
					ai[k] = ai[i];
	//   47   85:aload           7
	//   48   87:iload           5
	//   49   89:aload           7
	//   50   91:iload_3         
	//   51   92:iaload          
	//   52   93:iastore         
				}
				if(flag)
	//*  53   94:iload_2         
	//*  54   95:ifeq            106
					solvervariable.removeFromRow(mRow);
	//   55   98:aload_1         
	//   56   99:aload_0         
	//   57  100:getfield        #52  <Field ArrayRow mRow>
	//   58  103:invokevirtual   #74  <Method void SolverVariable.removeFromRow(ArrayRow)>
				solvervariable.usageInRowCount = solvervariable.usageInRowCount - 1;
	//   59  106:aload_1         
	//   60  107:aload_1         
	//   61  108:getfield        #62  <Field int SolverVariable.usageInRowCount>
	//   62  111:iconst_1        
	//   63  112:isub            
	//   64  113:putfield        #62  <Field int SolverVariable.usageInRowCount>
				currentSize = currentSize - 1;
	//   65  116:aload_0         
	//   66  117:aload_0         
	//   67  118:getfield        #34  <Field int currentSize>
	//   68  121:iconst_1        
	//   69  122:isub            
	//   70  123:putfield        #34  <Field int currentSize>
				mArrayIndices[i] = -1;
	//   71  126:aload_0         
	//   72  127:getfield        #40  <Field int[] mArrayIndices>
	//   73  130:iload_3         
	//   74  131:iconst_m1       
	//   75  132:iastore         
				if(mDidFillOnce)
	//*  76  133:aload_0         
	//*  77  134:getfield        #50  <Field boolean mDidFillOnce>
	//*  78  137:ifeq            145
					mLast = i;
	//   79  140:aload_0         
	//   80  141:iload_3         
	//   81  142:putfield        #48  <Field int mLast>
				return mArrayValues[i];
	//   82  145:aload_0         
	//   83  146:getfield        #44  <Field float[] mArrayValues>
	//   84  149:iload_3         
	//   85  150:faload          
	//   86  151:freturn         
			}
			l = mArrayNextIndices[i];
	//   87  152:aload_0         
	//   88  153:getfield        #42  <Field int[] mArrayNextIndices>
	//   89  156:iload_3         
	//   90  157:iaload          
	//   91  158:istore          6
			j++;
	//   92  160:iload           4
	//   93  162:iconst_1        
	//   94  163:iadd            
	//   95  164:istore          4
			k = i;
	//   96  166:iload_3         
	//   97  167:istore          5
		}

	//   98  169:iload           6
	//   99  171:istore_3        
	//* 100  172:goto            31
		return 0.0F;
	//  101  175:fconst_0        
	//  102  176:freturn         
	}

	int sizeInBytes()
	{
		return mArrayIndices.length * 4 * 3 + 0 + 36;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field int[] mArrayIndices>
	//    2    4:arraylength     
	//    3    5:iconst_4        
	//    4    6:imul            
	//    5    7:iconst_3        
	//    6    8:imul            
	//    7    9:iconst_0        
	//    8   10:iadd            
	//    9   11:bipush          36
	//   10   13:iadd            
	//   11   14:ireturn         
	}

	public String toString()
	{
		String s = "";
	//    0    0:ldc1            #186 <String "">
	//    1    2:astore_3        
		int j = mHead;
	//    2    3:aload_0         
	//    3    4:getfield        #46  <Field int mHead>
	//    4    7:istore_2        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   5    8:iconst_0        
	//*   6    9:istore_1        
	//*   7   10:iload_2         
	//*   8   11:iconst_m1       
	//*   9   12:icmpeq          151
	//*  10   15:iload_1         
	//*  11   16:aload_0         
	//*  12   17:getfield        #34  <Field int currentSize>
	//*  13   20:icmpge          151
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   23:new             #128 <Class StringBuilder>
	//   15   26:dup             
	//   16   27:invokespecial   #129 <Method void StringBuilder()>
	//   17   30:astore          4
			stringbuilder.append(s);
	//   18   32:aload           4
	//   19   34:aload_3         
	//   20   35:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			stringbuilder.append(" -> ");
	//   22   39:aload           4
	//   23   41:ldc1            #188 <String " -> ">
	//   24   43:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
			s = stringbuilder.toString();
	//   26   47:aload           4
	//   27   49:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   28   52:astore_3        
			stringbuilder = new StringBuilder();
	//   29   53:new             #128 <Class StringBuilder>
	//   30   56:dup             
	//   31   57:invokespecial   #129 <Method void StringBuilder()>
	//   32   60:astore          4
			stringbuilder.append(s);
	//   33   62:aload           4
	//   34   64:aload_3         
	//   35   65:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			stringbuilder.append(mArrayValues[j]);
	//   37   69:aload           4
	//   38   71:aload_0         
	//   39   72:getfield        #44  <Field float[] mArrayValues>
	//   40   75:iload_2         
	//   41   76:faload          
	//   42   77:invokevirtual   #145 <Method StringBuilder StringBuilder.append(float)>
	//   43   80:pop             
			stringbuilder.append(" : ");
	//   44   81:aload           4
	//   45   83:ldc1            #190 <String " : ">
	//   46   85:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   47   88:pop             
			s = stringbuilder.toString();
	//   48   89:aload           4
	//   49   91:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   50   94:astore_3        
			stringbuilder = new StringBuilder();
	//   51   95:new             #128 <Class StringBuilder>
	//   52   98:dup             
	//   53   99:invokespecial   #129 <Method void StringBuilder()>
	//   54  102:astore          4
			stringbuilder.append(s);
	//   55  104:aload           4
	//   56  106:aload_3         
	//   57  107:invokevirtual   #138 <Method StringBuilder StringBuilder.append(String)>
	//   58  110:pop             
			stringbuilder.append(((Object) (mCache.mIndexedVariables[mArrayIndices[j]])));
	//   59  111:aload           4
	//   60  113:aload_0         
	//   61  114:getfield        #54  <Field Cache mCache>
	//   62  117:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   63  120:aload_0         
	//   64  121:getfield        #40  <Field int[] mArrayIndices>
	//   65  124:iload_2         
	//   66  125:iaload          
	//   67  126:aaload          
	//   68  127:invokevirtual   #133 <Method StringBuilder StringBuilder.append(Object)>
	//   69  130:pop             
			s = stringbuilder.toString();
	//   70  131:aload           4
	//   71  133:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   72  136:astore_3        
			j = mArrayNextIndices[j];
	//   73  137:aload_0         
	//   74  138:getfield        #42  <Field int[] mArrayNextIndices>
	//   75  141:iload_2         
	//   76  142:iaload          
	//   77  143:istore_2        
		}

	//   78  144:iload_1         
	//   79  145:iconst_1        
	//   80  146:iadd            
	//   81  147:istore_1        
	//*  82  148:goto            10
		return s;
	//   83  151:aload_3         
	//   84  152:areturn         
	}

	final void updateFromRow(ArrayRow arrayrow, ArrayRow arrayrow1, boolean flag)
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore          5
		for(int j = 0; i != -1 && j < currentSize;)
	//*   3    6:iconst_0        
	//*   4    7:istore          6
	//*   5    9:iload           5
	//*   6   11:iconst_m1       
	//*   7   12:icmpeq          204
	//*   8   15:iload           6
	//*   9   17:aload_0         
	//*  10   18:getfield        #34  <Field int currentSize>
	//*  11   21:icmpge          204
			if(mArrayIndices[i] == arrayrow1.variable.id)
	//*  12   24:aload_0         
	//*  13   25:getfield        #40  <Field int[] mArrayIndices>
	//*  14   28:iload           5
	//*  15   30:iaload          
	//*  16   31:aload_2         
	//*  17   32:getfield        #197 <Field SolverVariable ArrayRow.variable>
	//*  18   35:getfield        #67  <Field int SolverVariable.id>
	//*  19   38:icmpne          186
			{
				float f = mArrayValues[i];
	//   20   41:aload_0         
	//   21   42:getfield        #44  <Field float[] mArrayValues>
	//   22   45:iload           5
	//   23   47:faload          
	//   24   48:fstore          4
				remove(arrayrow1.variable, flag);
	//   25   50:aload_0         
	//   26   51:aload_2         
	//   27   52:getfield        #197 <Field SolverVariable ArrayRow.variable>
	//   28   55:iload_3         
	//   29   56:invokevirtual   #182 <Method float remove(SolverVariable, boolean)>
	//   30   59:pop             
				ArrayLinkedVariables arraylinkedvariables = (ArrayLinkedVariables)arrayrow1.variables;
	//   31   60:aload_2         
	//   32   61:getfield        #201 <Field ArrayLinkedVariables ArrayRow.variables>
	//   33   64:checkcast       #2   <Class ArrayLinkedVariables>
	//   34   67:astore          7
				j = arraylinkedvariables.mHead;
	//   35   69:aload           7
	//   36   71:getfield        #46  <Field int mHead>
	//   37   74:istore          6
				for(i = 0; j != -1 && i < arraylinkedvariables.currentSize; i++)
	//*  38   76:iconst_0        
	//*  39   77:istore          5
	//*  40   79:iload           6
	//*  41   81:iconst_m1       
	//*  42   82:icmpeq          146
	//*  43   85:iload           5
	//*  44   87:aload           7
	//*  45   89:getfield        #34  <Field int currentSize>
	//*  46   92:icmpge          146
				{
					add(mCache.mIndexedVariables[arraylinkedvariables.mArrayIndices[j]], arraylinkedvariables.mArrayValues[j] * f, flag);
	//   47   95:aload_0         
	//   48   96:aload_0         
	//   49   97:getfield        #54  <Field Cache mCache>
	//   50  100:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   51  103:aload           7
	//   52  105:getfield        #40  <Field int[] mArrayIndices>
	//   53  108:iload           6
	//   54  110:iaload          
	//   55  111:aaload          
	//   56  112:aload           7
	//   57  114:getfield        #44  <Field float[] mArrayValues>
	//   58  117:iload           6
	//   59  119:faload          
	//   60  120:fload           4
	//   61  122:fmul            
	//   62  123:iload_3         
	//   63  124:invokevirtual   #203 <Method void add(SolverVariable, float, boolean)>
					j = arraylinkedvariables.mArrayNextIndices[j];
	//   64  127:aload           7
	//   65  129:getfield        #42  <Field int[] mArrayNextIndices>
	//   66  132:iload           6
	//   67  134:iaload          
	//   68  135:istore          6
				}

	//   69  137:iload           5
	//   70  139:iconst_1        
	//   71  140:iadd            
	//   72  141:istore          5
	//*  73  143:goto            79
				arrayrow.constantValue = arrayrow.constantValue + arrayrow1.constantValue * f;
	//   74  146:aload_1         
	//   75  147:aload_1         
	//   76  148:getfield        #207 <Field float ArrayRow.constantValue>
	//   77  151:aload_2         
	//   78  152:getfield        #207 <Field float ArrayRow.constantValue>
	//   79  155:fload           4
	//   80  157:fmul            
	//   81  158:fadd            
	//   82  159:putfield        #207 <Field float ArrayRow.constantValue>
				if(flag)
	//*  83  162:iload_3         
	//*  84  163:ifeq            174
					arrayrow1.variable.removeFromRow(arrayrow);
	//   85  166:aload_2         
	//   86  167:getfield        #197 <Field SolverVariable ArrayRow.variable>
	//   87  170:aload_1         
	//   88  171:invokevirtual   #74  <Method void SolverVariable.removeFromRow(ArrayRow)>
				i = mHead;
	//   89  174:aload_0         
	//   90  175:getfield        #46  <Field int mHead>
	//   91  178:istore          5
				j = 0;
	//   92  180:iconst_0        
	//   93  181:istore          6
			} else
	//*  94  183:goto            9
			{
				i = mArrayNextIndices[i];
	//   95  186:aload_0         
	//   96  187:getfield        #42  <Field int[] mArrayNextIndices>
	//   97  190:iload           5
	//   98  192:iaload          
	//   99  193:istore          5
				j++;
	//  100  195:iload           6
	//  101  197:iconst_1        
	//  102  198:iadd            
	//  103  199:istore          6
			}

	//* 104  201:goto            9
	//  105  204:return          
	}

	void updateFromSystem(ArrayRow arrayrow, ArrayRow aarrayrow[])
	{
		int i = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field int mHead>
	//    2    4:istore          4
		for(int j = 0; i != -1 && j < currentSize;)
	//*   3    6:iconst_0        
	//*   4    7:istore          5
	//*   5    9:iload           4
	//*   6   11:iconst_m1       
	//*   7   12:icmpeq          224
	//*   8   15:iload           5
	//*   9   17:aload_0         
	//*  10   18:getfield        #34  <Field int currentSize>
	//*  11   21:icmpge          224
		{
			Object obj = ((Object) (mCache.mIndexedVariables[mArrayIndices[i]]));
	//   12   24:aload_0         
	//   13   25:getfield        #54  <Field Cache mCache>
	//   14   28:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   15   31:aload_0         
	//   16   32:getfield        #40  <Field int[] mArrayIndices>
	//   17   35:iload           4
	//   18   37:iaload          
	//   19   38:aaload          
	//   20   39:astore          6
			if(((SolverVariable) (obj)).definitionId != -1)
	//*  21   41:aload           6
	//*  22   43:getfield        #212 <Field int SolverVariable.definitionId>
	//*  23   46:iconst_m1       
	//*  24   47:icmpeq          206
			{
				float f = mArrayValues[i];
	//   25   50:aload_0         
	//   26   51:getfield        #44  <Field float[] mArrayValues>
	//   27   54:iload           4
	//   28   56:faload          
	//   29   57:fstore_3        
				remove(((SolverVariable) (obj)), true);
	//   30   58:aload_0         
	//   31   59:aload           6
	//   32   61:iconst_1        
	//   33   62:invokevirtual   #182 <Method float remove(SolverVariable, boolean)>
	//   34   65:pop             
				obj = ((Object) (aarrayrow[((SolverVariable) (obj)).definitionId]));
	//   35   66:aload_2         
	//   36   67:aload           6
	//   37   69:getfield        #212 <Field int SolverVariable.definitionId>
	//   38   72:aaload          
	//   39   73:astore          6
				if(!((ArrayRow) (obj)).isSimpleDefinition)
	//*  40   75:aload           6
	//*  41   77:getfield        #215 <Field boolean ArrayRow.isSimpleDefinition>
	//*  42   80:ifne            169
				{
					ArrayLinkedVariables arraylinkedvariables = (ArrayLinkedVariables)((ArrayRow) (obj)).variables;
	//   43   83:aload           6
	//   44   85:getfield        #201 <Field ArrayLinkedVariables ArrayRow.variables>
	//   45   88:checkcast       #2   <Class ArrayLinkedVariables>
	//   46   91:astore          7
					j = arraylinkedvariables.mHead;
	//   47   93:aload           7
	//   48   95:getfield        #46  <Field int mHead>
	//   49   98:istore          5
					for(i = 0; j != -1 && i < arraylinkedvariables.currentSize; i++)
	//*  50  100:iconst_0        
	//*  51  101:istore          4
	//*  52  103:iload           5
	//*  53  105:iconst_m1       
	//*  54  106:icmpeq          169
	//*  55  109:iload           4
	//*  56  111:aload           7
	//*  57  113:getfield        #34  <Field int currentSize>
	//*  58  116:icmpge          169
					{
						add(mCache.mIndexedVariables[arraylinkedvariables.mArrayIndices[j]], arraylinkedvariables.mArrayValues[j] * f, true);
	//   59  119:aload_0         
	//   60  120:aload_0         
	//   61  121:getfield        #54  <Field Cache mCache>
	//   62  124:getfield        #91  <Field SolverVariable[] Cache.mIndexedVariables>
	//   63  127:aload           7
	//   64  129:getfield        #40  <Field int[] mArrayIndices>
	//   65  132:iload           5
	//   66  134:iaload          
	//   67  135:aaload          
	//   68  136:aload           7
	//   69  138:getfield        #44  <Field float[] mArrayValues>
	//   70  141:iload           5
	//   71  143:faload          
	//   72  144:fload_3         
	//   73  145:fmul            
	//   74  146:iconst_1        
	//   75  147:invokevirtual   #203 <Method void add(SolverVariable, float, boolean)>
						j = arraylinkedvariables.mArrayNextIndices[j];
	//   76  150:aload           7
	//   77  152:getfield        #42  <Field int[] mArrayNextIndices>
	//   78  155:iload           5
	//   79  157:iaload          
	//   80  158:istore          5
					}

	//   81  160:iload           4
	//   82  162:iconst_1        
	//   83  163:iadd            
	//   84  164:istore          4
				}
	//*  85  166:goto            103
				arrayrow.constantValue = arrayrow.constantValue + ((ArrayRow) (obj)).constantValue * f;
	//   86  169:aload_1         
	//   87  170:aload_1         
	//   88  171:getfield        #207 <Field float ArrayRow.constantValue>
	//   89  174:aload           6
	//   90  176:getfield        #207 <Field float ArrayRow.constantValue>
	//   91  179:fload_3         
	//   92  180:fmul            
	//   93  181:fadd            
	//   94  182:putfield        #207 <Field float ArrayRow.constantValue>
				((ArrayRow) (obj)).variable.removeFromRow(arrayrow);
	//   95  185:aload           6
	//   96  187:getfield        #197 <Field SolverVariable ArrayRow.variable>
	//   97  190:aload_1         
	//   98  191:invokevirtual   #74  <Method void SolverVariable.removeFromRow(ArrayRow)>
				i = mHead;
	//   99  194:aload_0         
	//  100  195:getfield        #46  <Field int mHead>
	//  101  198:istore          4
				j = 0;
	//  102  200:iconst_0        
	//  103  201:istore          5
			} else
	//* 104  203:goto            9
			{
				i = mArrayNextIndices[i];
	//  105  206:aload_0         
	//  106  207:getfield        #42  <Field int[] mArrayNextIndices>
	//  107  210:iload           4
	//  108  212:iaload          
	//  109  213:istore          4
				j++;
	//  110  215:iload           5
	//  111  217:iconst_1        
	//  112  218:iadd            
	//  113  219:istore          5
			}
		}

	//* 114  221:goto            9
	//  115  224:return          
	}

	private static final boolean DEBUG = false;
	private static final boolean FULL_NEW_CHECK = false;
	private static final int NONE = -1;
	private int ROW_SIZE;
	private SolverVariable candidate;
	int currentSize;
	private int mArrayIndices[];
	private int mArrayNextIndices[];
	private float mArrayValues[];
	private final Cache mCache;
	private boolean mDidFillOnce;
	private int mHead;
	private int mLast;
	private final ArrayRow mRow;
}
