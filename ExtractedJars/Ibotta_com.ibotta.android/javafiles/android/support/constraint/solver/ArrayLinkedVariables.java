// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver;

import java.util.Arrays;

// Referenced classes of package android.support.constraint.solver:
//			SolverVariable, Cache, ArrayRow, LinearSystem

public class ArrayLinkedVariables
{

	ArrayLinkedVariables(ArrayRow arrayrow, Cache cache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		currentSize = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #29  <Field int currentSize>
		ROW_SIZE = 8;
	//    5    9:aload_0         
	//    6   10:bipush          8
	//    7   12:putfield        #31  <Field int ROW_SIZE>
		candidate = null;
	//    8   15:aload_0         
	//    9   16:aconst_null     
	//   10   17:putfield        #33  <Field SolverVariable candidate>
		int i = ROW_SIZE;
	//   11   20:aload_0         
	//   12   21:getfield        #31  <Field int ROW_SIZE>
	//   13   24:istore_3        
		mArrayIndices = new int[i];
	//   14   25:aload_0         
	//   15   26:iload_3         
	//   16   27:newarray        int[]
	//   17   29:putfield        #35  <Field int[] mArrayIndices>
		mArrayNextIndices = new int[i];
	//   18   32:aload_0         
	//   19   33:iload_3         
	//   20   34:newarray        int[]
	//   21   36:putfield        #37  <Field int[] mArrayNextIndices>
		mArrayValues = new float[i];
	//   22   39:aload_0         
	//   23   40:iload_3         
	//   24   41:newarray        float[]
	//   25   43:putfield        #39  <Field float[] mArrayValues>
		mHead = -1;
	//   26   46:aload_0         
	//   27   47:iconst_m1       
	//   28   48:putfield        #41  <Field int mHead>
		mLast = -1;
	//   29   51:aload_0         
	//   30   52:iconst_m1       
	//   31   53:putfield        #43  <Field int mLast>
		mDidFillOnce = false;
	//   32   56:aload_0         
	//   33   57:iconst_0        
	//   34   58:putfield        #45  <Field boolean mDidFillOnce>
		mRow = arrayrow;
	//   35   61:aload_0         
	//   36   62:aload_1         
	//   37   63:putfield        #47  <Field ArrayRow mRow>
		mCache = cache;
	//   38   66:aload_0         
	//   39   67:aload_2         
	//   40   68:putfield        #49  <Field Cache mCache>
	//   41   71:return          
	}

	private boolean isNew(SolverVariable solvervariable, LinearSystem linearsystem)
	{
		return solvervariable.usageInRowCount <= 1;
	//    0    0:aload_1         
	//    1    1:getfield        #57  <Field int SolverVariable.usageInRowCount>
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
	//    6    8:getfield        #41  <Field int mHead>
	//    7   11:istore          4
		if(i == -1)
	//*   8   13:iload           4
	//*   9   15:iconst_m1       
	//*  10   16:icmpne          140
		{
			mHead = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #41  <Field int mHead>
			float af[] = mArrayValues;
	//   14   24:aload_0         
	//   15   25:getfield        #39  <Field float[] mArrayValues>
	//   16   28:astore          8
			i = mHead;
	//   17   30:aload_0         
	//   18   31:getfield        #41  <Field int mHead>
	//   19   34:istore          4
			af[i] = f;
	//   20   36:aload           8
	//   21   38:iload           4
	//   22   40:fload_2         
	//   23   41:fastore         
			mArrayIndices[i] = solvervariable.id;
	//   24   42:aload_0         
	//   25   43:getfield        #35  <Field int[] mArrayIndices>
	//   26   46:iload           4
	//   27   48:aload_1         
	//   28   49:getfield        #62  <Field int SolverVariable.id>
	//   29   52:iastore         
			mArrayNextIndices[mHead] = -1;
	//   30   53:aload_0         
	//   31   54:getfield        #37  <Field int[] mArrayNextIndices>
	//   32   57:aload_0         
	//   33   58:getfield        #41  <Field int mHead>
	//   34   61:iconst_m1       
	//   35   62:iastore         
			solvervariable.usageInRowCount = solvervariable.usageInRowCount + 1;
	//   36   63:aload_1         
	//   37   64:aload_1         
	//   38   65:getfield        #57  <Field int SolverVariable.usageInRowCount>
	//   39   68:iconst_1        
	//   40   69:iadd            
	//   41   70:putfield        #57  <Field int SolverVariable.usageInRowCount>
			solvervariable.addToRow(mRow);
	//   42   73:aload_1         
	//   43   74:aload_0         
	//   44   75:getfield        #47  <Field ArrayRow mRow>
	//   45   78:invokevirtual   #66  <Method void SolverVariable.addToRow(ArrayRow)>
			currentSize = currentSize + 1;
	//   46   81:aload_0         
	//   47   82:aload_0         
	//   48   83:getfield        #29  <Field int currentSize>
	//   49   86:iconst_1        
	//   50   87:iadd            
	//   51   88:putfield        #29  <Field int currentSize>
			if(!mDidFillOnce)
	//*  52   91:aload_0         
	//*  53   92:getfield        #45  <Field boolean mDidFillOnce>
	//*  54   95:ifne            139
			{
				mLast = mLast + 1;
	//   55   98:aload_0         
	//   56   99:aload_0         
	//   57  100:getfield        #43  <Field int mLast>
	//   58  103:iconst_1        
	//   59  104:iadd            
	//   60  105:putfield        #43  <Field int mLast>
				i = mLast;
	//   61  108:aload_0         
	//   62  109:getfield        #43  <Field int mLast>
	//   63  112:istore          4
				solvervariable = ((SolverVariable) (mArrayIndices));
	//   64  114:aload_0         
	//   65  115:getfield        #35  <Field int[] mArrayIndices>
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
	//   73  128:putfield        #45  <Field boolean mDidFillOnce>
					mLast = solvervariable.length - 1;
	//   74  131:aload_0         
	//   75  132:aload_1         
	//   76  133:arraylength     
	//   77  134:iconst_1        
	//   78  135:isub            
	//   79  136:putfield        #43  <Field int mLast>
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
	//*  90  155:getfield        #29  <Field int currentSize>
	//*  91  158:icmpge          324
		{
			if(mArrayIndices[i] == solvervariable.id)
	//*  92  161:aload_0         
	//*  93  162:getfield        #35  <Field int[] mArrayIndices>
	//*  94  165:iload           4
	//*  95  167:iaload          
	//*  96  168:aload_1         
	//*  97  169:getfield        #62  <Field int SolverVariable.id>
	//*  98  172:icmpne          288
			{
				float af1[] = mArrayValues;
	//   99  175:aload_0         
	//  100  176:getfield        #39  <Field float[] mArrayValues>
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
	//* 118  206:getfield        #41  <Field int mHead>
	//* 119  209:icmpne          226
					{
						mHead = mArrayNextIndices[i];
	//  120  212:aload_0         
	//  121  213:aload_0         
	//  122  214:getfield        #37  <Field int[] mArrayNextIndices>
	//  123  217:iload           4
	//  124  219:iaload          
	//  125  220:putfield        #41  <Field int mHead>
					} else
	//* 126  223:goto            242
					{
						int ai[] = mArrayNextIndices;
	//  127  226:aload_0         
	//  128  227:getfield        #37  <Field int[] mArrayNextIndices>
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
	//  140  248:getfield        #47  <Field ArrayRow mRow>
	//  141  251:invokevirtual   #69  <Method void SolverVariable.removeFromRow(ArrayRow)>
					if(mDidFillOnce)
	//* 142  254:aload_0         
	//* 143  255:getfield        #45  <Field boolean mDidFillOnce>
	//* 144  258:ifeq            267
						mLast = i;
	//  145  261:aload_0         
	//  146  262:iload           4
	//  147  264:putfield        #43  <Field int mLast>
					solvervariable.usageInRowCount = solvervariable.usageInRowCount - 1;
	//  148  267:aload_1         
	//  149  268:aload_1         
	//  150  269:getfield        #57  <Field int SolverVariable.usageInRowCount>
	//  151  272:iconst_1        
	//  152  273:isub            
	//  153  274:putfield        #57  <Field int SolverVariable.usageInRowCount>
					currentSize = currentSize - 1;
	//  154  277:aload_0         
	//  155  278:aload_0         
	//  156  279:getfield        #29  <Field int currentSize>
	//  157  282:iconst_1        
	//  158  283:isub            
	//  159  284:putfield        #29  <Field int currentSize>
				}
				return;
	//  160  287:return          
			}
			if(mArrayIndices[i] < solvervariable.id)
	//* 161  288:aload_0         
	//* 162  289:getfield        #35  <Field int[] mArrayIndices>
	//* 163  292:iload           4
	//* 164  294:iaload          
	//* 165  295:aload_1         
	//* 166  296:getfield        #62  <Field int SolverVariable.id>
	//* 167  299:icmpge          306
				l = i;
	//  168  302:iload           4
	//  169  304:istore          7
			i = mArrayNextIndices[i];
	//  170  306:aload_0         
	//  171  307:getfield        #37  <Field int[] mArrayNextIndices>
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
	//  181  325:getfield        #43  <Field int mLast>
	//  182  328:istore          4
		if(mDidFillOnce)
	//* 183  330:aload_0         
	//* 184  331:getfield        #45  <Field boolean mDidFillOnce>
	//* 185  334:ifeq            363
		{
			int ai1[] = mArrayIndices;
	//  186  337:aload_0         
	//  187  338:getfield        #35  <Field int[] mArrayIndices>
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
	//  204  370:getfield        #35  <Field int[] mArrayIndices>
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
	//* 215  392:getfield        #29  <Field int currentSize>
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
	//  222  405:getfield        #35  <Field int[] mArrayIndices>
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
	//  244  448:getfield        #35  <Field int[] mArrayIndices>
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
	//  257  472:getfield        #31  <Field int ROW_SIZE>
	//  258  475:iconst_2        
	//  259  476:imul            
	//  260  477:putfield        #31  <Field int ROW_SIZE>
			mDidFillOnce = false;
	//  261  480:aload_0         
	//  262  481:iconst_0        
	//  263  482:putfield        #45  <Field boolean mDidFillOnce>
			mLast = i - 1;
	//  264  485:aload_0         
	//  265  486:iload           4
	//  266  488:iconst_1        
	//  267  489:isub            
	//  268  490:putfield        #43  <Field int mLast>
			mArrayValues = Arrays.copyOf(mArrayValues, ROW_SIZE);
	//  269  493:aload_0         
	//  270  494:aload_0         
	//  271  495:getfield        #39  <Field float[] mArrayValues>
	//  272  498:aload_0         
	//  273  499:getfield        #31  <Field int ROW_SIZE>
	//  274  502:invokestatic    #75  <Method float[] Arrays.copyOf(float[], int)>
	//  275  505:putfield        #39  <Field float[] mArrayValues>
			mArrayIndices = Arrays.copyOf(mArrayIndices, ROW_SIZE);
	//  276  508:aload_0         
	//  277  509:aload_0         
	//  278  510:getfield        #35  <Field int[] mArrayIndices>
	//  279  513:aload_0         
	//  280  514:getfield        #31  <Field int ROW_SIZE>
	//  281  517:invokestatic    #78  <Method int[] Arrays.copyOf(int[], int)>
	//  282  520:putfield        #35  <Field int[] mArrayIndices>
			mArrayNextIndices = Arrays.copyOf(mArrayNextIndices, ROW_SIZE);
	//  283  523:aload_0         
	//  284  524:aload_0         
	//  285  525:getfield        #37  <Field int[] mArrayNextIndices>
	//  286  528:aload_0         
	//  287  529:getfield        #31  <Field int ROW_SIZE>
	//  288  532:invokestatic    #78  <Method int[] Arrays.copyOf(int[], int)>
	//  289  535:putfield        #37  <Field int[] mArrayNextIndices>
		}
		mArrayIndices[i] = solvervariable.id;
	//  290  538:aload_0         
	//  291  539:getfield        #35  <Field int[] mArrayIndices>
	//  292  542:iload           4
	//  293  544:aload_1         
	//  294  545:getfield        #62  <Field int SolverVariable.id>
	//  295  548:iastore         
		mArrayValues[i] = f;
	//  296  549:aload_0         
	//  297  550:getfield        #39  <Field float[] mArrayValues>
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
	//  305  564:getfield        #37  <Field int[] mArrayNextIndices>
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
	//  319  590:getfield        #37  <Field int[] mArrayNextIndices>
	//  320  593:iload           4
	//  321  595:aload_0         
	//  322  596:getfield        #41  <Field int mHead>
	//  323  599:iastore         
			mHead = i;
	//  324  600:aload_0         
	//  325  601:iload           4
	//  326  603:putfield        #41  <Field int mHead>
		}
		solvervariable.usageInRowCount = solvervariable.usageInRowCount + 1;
	//  327  606:aload_1         
	//  328  607:aload_1         
	//  329  608:getfield        #57  <Field int SolverVariable.usageInRowCount>
	//  330  611:iconst_1        
	//  331  612:iadd            
	//  332  613:putfield        #57  <Field int SolverVariable.usageInRowCount>
		solvervariable.addToRow(mRow);
	//  333  616:aload_1         
	//  334  617:aload_0         
	//  335  618:getfield        #47  <Field ArrayRow mRow>
	//  336  621:invokevirtual   #66  <Method void SolverVariable.addToRow(ArrayRow)>
		currentSize = currentSize + 1;
	//  337  624:aload_0         
	//  338  625:aload_0         
	//  339  626:getfield        #29  <Field int currentSize>
	//  340  629:iconst_1        
	//  341  630:iadd            
	//  342  631:putfield        #29  <Field int currentSize>
		if(!mDidFillOnce)
	//* 343  634:aload_0         
	//* 344  635:getfield        #45  <Field boolean mDidFillOnce>
	//* 345  638:ifne            651
			mLast = mLast + 1;
	//  346  641:aload_0         
	//  347  642:aload_0         
	//  348  643:getfield        #43  <Field int mLast>
	//  349  646:iconst_1        
	//  350  647:iadd            
	//  351  648:putfield        #43  <Field int mLast>
		i = mLast;
	//  352  651:aload_0         
	//  353  652:getfield        #43  <Field int mLast>
	//  354  655:istore          4
		solvervariable = ((SolverVariable) (mArrayIndices));
	//  355  657:aload_0         
	//  356  658:getfield        #35  <Field int[] mArrayIndices>
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
	//  364  671:putfield        #45  <Field boolean mDidFillOnce>
			mLast = solvervariable.length - 1;
	//  365  674:aload_0         
	//  366  675:aload_1         
	//  367  676:arraylength     
	//  368  677:iconst_1        
	//  369  678:isub            
	//  370  679:putfield        #43  <Field int mLast>
		}
	//  371  682:return          
	}

	SolverVariable chooseSubject(LinearSystem linearsystem)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mHead>
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
		float f4 = 0.0F;
	//    9   15:fconst_0        
	//   10   16:fstore          6
		boolean flag3 = false;
	//   11   18:iconst_0        
	//   12   19:istore          12
		float f3 = 0.0F;
	//   13   21:fconst_0        
	//   14   22:fstore          5
		boolean flag1;
		for(boolean flag2 = false; j != -1 && i < currentSize; flag2 = flag1)
	//*  15   24:iconst_0        
	//*  16   25:istore          11
	//*  17   27:iload           8
	//*  18   29:iconst_m1       
	//*  19   30:icmpeq          581
	//*  20   33:iload           7
	//*  21   35:aload_0         
	//*  22   36:getfield        #29  <Field int currentSize>
	//*  23   39:icmpge          581
		{
			float f1 = mArrayValues[j];
	//   24   42:aload_0         
	//   25   43:getfield        #39  <Field float[] mArrayValues>
	//   26   46:iload           8
	//   27   48:faload          
	//   28   49:fstore_3        
			SolverVariable solvervariable = mCache.mIndexedVariables[mArrayIndices[j]];
	//   29   50:aload_0         
	//   30   51:getfield        #49  <Field Cache mCache>
	//   31   54:getfield        #86  <Field SolverVariable[] Cache.mIndexedVariables>
	//   32   57:aload_0         
	//   33   58:getfield        #35  <Field int[] mArrayIndices>
	//   34   61:iload           8
	//   35   63:iaload          
	//   36   64:aaload          
	//   37   65:astore          13
			float f;
			if(f1 < 0.0F)
	//*  38   67:fload_3         
	//*  39   68:fconst_0        
	//*  40   69:fcmpg           
	//*  41   70:ifge            104
			{
				f = f1;
	//   42   73:fload_3         
	//   43   74:fstore_2        
				if(f1 > -0.001F)
	//*  44   75:fload_3         
	//*  45   76:ldc1            #87  <Float -0.001F>
	//*  46   78:fcmpl           
	//*  47   79:ifle            132
				{
					mArrayValues[j] = 0.0F;
	//   48   82:aload_0         
	//   49   83:getfield        #39  <Field float[] mArrayValues>
	//   50   86:iload           8
	//   51   88:fconst_0        
	//   52   89:fastore         
					solvervariable.removeFromRow(mRow);
	//   53   90:aload           13
	//   54   92:aload_0         
	//   55   93:getfield        #47  <Field ArrayRow mRow>
	//   56   96:invokevirtual   #69  <Method void SolverVariable.removeFromRow(ArrayRow)>
					f = 0.0F;
	//   57   99:fconst_0        
	//   58  100:fstore_2        
				}
			} else
	//*  59  101:goto            132
			{
				f = f1;
	//   60  104:fload_3         
	//   61  105:fstore_2        
				if(f1 < 0.001F)
	//*  62  106:fload_3         
	//*  63  107:ldc1            #88  <Float 0.001F>
	//*  64  109:fcmpg           
	//*  65  110:ifge            132
				{
					mArrayValues[j] = 0.0F;
	//   66  113:aload_0         
	//   67  114:getfield        #39  <Field float[] mArrayValues>
	//   68  117:iload           8
	//   69  119:fconst_0        
	//   70  120:fastore         
					solvervariable.removeFromRow(mRow);
	//   71  121:aload           13
	//   72  123:aload_0         
	//   73  124:getfield        #47  <Field ArrayRow mRow>
	//   74  127:invokevirtual   #69  <Method void SolverVariable.removeFromRow(ArrayRow)>
					f = 0.0F;
	//   75  130:fconst_0        
	//   76  131:fstore_2        
				}
			}
			SolverVariable solvervariable1 = solvervariable4;
	//   77  132:aload           17
	//   78  134:astore          14
			SolverVariable solvervariable2 = solvervariable3;
	//   79  136:aload           16
	//   80  138:astore          15
			f1 = f4;
	//   81  140:fload           6
	//   82  142:fstore_3        
			boolean flag = flag3;
	//   83  143:iload           12
	//   84  145:istore          9
			float f2 = f3;
	//   85  147:fload           5
	//   86  149:fstore          4
			flag1 = flag2;
	//   87  151:iload           11
	//   88  153:istore          10
			if(f != 0.0F)
	//*  89  155:fload_2         
	//*  90  156:fconst_0        
	//*  91  157:fcmpl           
	//*  92  158:ifeq            540
				if(solvervariable.mType == SolverVariable.Type.UNRESTRICTED)
	//*  93  161:aload           13
	//*  94  163:getfield        #92  <Field SolverVariable$Type SolverVariable.mType>
	//*  95  166:getstatic       #97  <Field SolverVariable$Type SolverVariable$Type.UNRESTRICTED>
	//*  96  169:if_acmpne       329
				{
					if(solvervariable3 == null)
	//*  97  172:aload           16
	//*  98  174:ifnonnull       207
					{
						flag = isNew(solvervariable, linearsystem);
	//   99  177:aload_0         
	//  100  178:aload           13
	//  101  180:aload_1         
	//  102  181:invokespecial   #99  <Method boolean isNew(SolverVariable, LinearSystem)>
	//  103  184:istore          9
						solvervariable1 = solvervariable4;
	//  104  186:aload           17
	//  105  188:astore          14
						solvervariable2 = solvervariable;
	//  106  190:aload           13
	//  107  192:astore          15
						f1 = f;
	//  108  194:fload_2         
	//  109  195:fstore_3        
						f2 = f3;
	//  110  196:fload           5
	//  111  198:fstore          4
						flag1 = flag2;
	//  112  200:iload           11
	//  113  202:istore          10
					} else
	//* 114  204:goto            540
					if(f4 > f)
	//* 115  207:fload           6
	//* 116  209:fload_2         
	//* 117  210:fcmpl           
	//* 118  211:ifle            244
					{
						flag = isNew(solvervariable, linearsystem);
	//  119  214:aload_0         
	//  120  215:aload           13
	//  121  217:aload_1         
	//  122  218:invokespecial   #99  <Method boolean isNew(SolverVariable, LinearSystem)>
	//  123  221:istore          9
						solvervariable1 = solvervariable4;
	//  124  223:aload           17
	//  125  225:astore          14
						solvervariable2 = solvervariable;
	//  126  227:aload           13
	//  127  229:astore          15
						f1 = f;
	//  128  231:fload_2         
	//  129  232:fstore_3        
						f2 = f3;
	//  130  233:fload           5
	//  131  235:fstore          4
						flag1 = flag2;
	//  132  237:iload           11
	//  133  239:istore          10
					} else
	//* 134  241:goto            540
					{
						solvervariable1 = solvervariable4;
	//  135  244:aload           17
	//  136  246:astore          14
						solvervariable2 = solvervariable3;
	//  137  248:aload           16
	//  138  250:astore          15
						f1 = f4;
	//  139  252:fload           6
	//  140  254:fstore_3        
						flag = flag3;
	//  141  255:iload           12
	//  142  257:istore          9
						f2 = f3;
	//  143  259:fload           5
	//  144  261:fstore          4
						flag1 = flag2;
	//  145  263:iload           11
	//  146  265:istore          10
						if(!flag3)
	//* 147  267:iload           12
	//* 148  269:ifne            540
						{
							solvervariable1 = solvervariable4;
	//  149  272:aload           17
	//  150  274:astore          14
							solvervariable2 = solvervariable3;
	//  151  276:aload           16
	//  152  278:astore          15
							f1 = f4;
	//  153  280:fload           6
	//  154  282:fstore_3        
							flag = flag3;
	//  155  283:iload           12
	//  156  285:istore          9
							f2 = f3;
	//  157  287:fload           5
	//  158  289:fstore          4
							flag1 = flag2;
	//  159  291:iload           11
	//  160  293:istore          10
							if(isNew(solvervariable, linearsystem))
	//* 161  295:aload_0         
	//* 162  296:aload           13
	//* 163  298:aload_1         
	//* 164  299:invokespecial   #99  <Method boolean isNew(SolverVariable, LinearSystem)>
	//* 165  302:ifeq            540
							{
								flag = true;
	//  166  305:iconst_1        
	//  167  306:istore          9
								solvervariable1 = solvervariable4;
	//  168  308:aload           17
	//  169  310:astore          14
								solvervariable2 = solvervariable;
	//  170  312:aload           13
	//  171  314:astore          15
								f1 = f;
	//  172  316:fload_2         
	//  173  317:fstore_3        
								f2 = f3;
	//  174  318:fload           5
	//  175  320:fstore          4
								flag1 = flag2;
	//  176  322:iload           11
	//  177  324:istore          10
							}
						}
					}
				} else
	//* 178  326:goto            540
				{
					solvervariable1 = solvervariable4;
	//  179  329:aload           17
	//  180  331:astore          14
					solvervariable2 = solvervariable3;
	//  181  333:aload           16
	//  182  335:astore          15
					f1 = f4;
	//  183  337:fload           6
	//  184  339:fstore_3        
					flag = flag3;
	//  185  340:iload           12
	//  186  342:istore          9
					f2 = f3;
	//  187  344:fload           5
	//  188  346:fstore          4
					flag1 = flag2;
	//  189  348:iload           11
	//  190  350:istore          10
					if(solvervariable3 == null)
	//* 191  352:aload           16
	//* 192  354:ifnonnull       540
					{
						solvervariable1 = solvervariable4;
	//  193  357:aload           17
	//  194  359:astore          14
						solvervariable2 = solvervariable3;
	//  195  361:aload           16
	//  196  363:astore          15
						f1 = f4;
	//  197  365:fload           6
	//  198  367:fstore_3        
						flag = flag3;
	//  199  368:iload           12
	//  200  370:istore          9
						f2 = f3;
	//  201  372:fload           5
	//  202  374:fstore          4
						flag1 = flag2;
	//  203  376:iload           11
	//  204  378:istore          10
						if(f < 0.0F)
	//* 205  380:fload_2         
	//* 206  381:fconst_0        
	//* 207  382:fcmpg           
	//* 208  383:ifge            540
							if(solvervariable4 == null)
	//* 209  386:aload           17
	//* 210  388:ifnonnull       421
							{
								flag1 = isNew(solvervariable, linearsystem);
	//  211  391:aload_0         
	//  212  392:aload           13
	//  213  394:aload_1         
	//  214  395:invokespecial   #99  <Method boolean isNew(SolverVariable, LinearSystem)>
	//  215  398:istore          10
								solvervariable1 = solvervariable;
	//  216  400:aload           13
	//  217  402:astore          14
								solvervariable2 = solvervariable3;
	//  218  404:aload           16
	//  219  406:astore          15
								f1 = f4;
	//  220  408:fload           6
	//  221  410:fstore_3        
								flag = flag3;
	//  222  411:iload           12
	//  223  413:istore          9
								f2 = f;
	//  224  415:fload_2         
	//  225  416:fstore          4
							} else
	//* 226  418:goto            540
							if(f3 > f)
	//* 227  421:fload           5
	//* 228  423:fload_2         
	//* 229  424:fcmpl           
	//* 230  425:ifle            458
							{
								flag1 = isNew(solvervariable, linearsystem);
	//  231  428:aload_0         
	//  232  429:aload           13
	//  233  431:aload_1         
	//  234  432:invokespecial   #99  <Method boolean isNew(SolverVariable, LinearSystem)>
	//  235  435:istore          10
								solvervariable1 = solvervariable;
	//  236  437:aload           13
	//  237  439:astore          14
								solvervariable2 = solvervariable3;
	//  238  441:aload           16
	//  239  443:astore          15
								f1 = f4;
	//  240  445:fload           6
	//  241  447:fstore_3        
								flag = flag3;
	//  242  448:iload           12
	//  243  450:istore          9
								f2 = f;
	//  244  452:fload_2         
	//  245  453:fstore          4
							} else
	//* 246  455:goto            540
							{
								solvervariable1 = solvervariable4;
	//  247  458:aload           17
	//  248  460:astore          14
								solvervariable2 = solvervariable3;
	//  249  462:aload           16
	//  250  464:astore          15
								f1 = f4;
	//  251  466:fload           6
	//  252  468:fstore_3        
								flag = flag3;
	//  253  469:iload           12
	//  254  471:istore          9
								f2 = f3;
	//  255  473:fload           5
	//  256  475:fstore          4
								flag1 = flag2;
	//  257  477:iload           11
	//  258  479:istore          10
								if(!flag2)
	//* 259  481:iload           11
	//* 260  483:ifne            540
								{
									solvervariable1 = solvervariable4;
	//  261  486:aload           17
	//  262  488:astore          14
									solvervariable2 = solvervariable3;
	//  263  490:aload           16
	//  264  492:astore          15
									f1 = f4;
	//  265  494:fload           6
	//  266  496:fstore_3        
									flag = flag3;
	//  267  497:iload           12
	//  268  499:istore          9
									f2 = f3;
	//  269  501:fload           5
	//  270  503:fstore          4
									flag1 = flag2;
	//  271  505:iload           11
	//  272  507:istore          10
									if(isNew(solvervariable, linearsystem))
	//* 273  509:aload_0         
	//* 274  510:aload           13
	//* 275  512:aload_1         
	//* 276  513:invokespecial   #99  <Method boolean isNew(SolverVariable, LinearSystem)>
	//* 277  516:ifeq            540
									{
										flag1 = true;
	//  278  519:iconst_1        
	//  279  520:istore          10
										f2 = f;
	//  280  522:fload_2         
	//  281  523:fstore          4
										flag = flag3;
	//  282  525:iload           12
	//  283  527:istore          9
										f1 = f4;
	//  284  529:fload           6
	//  285  531:fstore_3        
										solvervariable2 = solvervariable3;
	//  286  532:aload           16
	//  287  534:astore          15
										solvervariable1 = solvervariable;
	//  288  536:aload           13
	//  289  538:astore          14
									}
								}
							}
					}
				}
			j = mArrayNextIndices[j];
	//  290  540:aload_0         
	//  291  541:getfield        #37  <Field int[] mArrayNextIndices>
	//  292  544:iload           8
	//  293  546:iaload          
	//  294  547:istore          8
			i++;
	//  295  549:iload           7
	//  296  551:iconst_1        
	//  297  552:iadd            
	//  298  553:istore          7
			solvervariable4 = solvervariable1;
	//  299  555:aload           14
	//  300  557:astore          17
			solvervariable3 = solvervariable2;
	//  301  559:aload           15
	//  302  561:astore          16
			f4 = f1;
	//  303  563:fload_3         
	//  304  564:fstore          6
			flag3 = flag;
	//  305  566:iload           9
	//  306  568:istore          12
			f3 = f2;
	//  307  570:fload           4
	//  308  572:fstore          5
		}

	//  309  574:iload           10
	//  310  576:istore          11
	//* 311  578:goto            27
		if(solvervariable3 != null)
	//* 312  581:aload           16
	//* 313  583:ifnull          589
			return solvervariable3;
	//  314  586:aload           16
	//  315  588:areturn         
		else
			return solvervariable4;
	//  316  589:aload           17
	//  317  591:areturn         
	}

	public final void clear()
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mHead>
	//    2    4:istore_2        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          61
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int currentSize>
	//*  11   17:icmpge          61
		{
			SolverVariable solvervariable = mCache.mIndexedVariables[mArrayIndices[j]];
	//   12   20:aload_0         
	//   13   21:getfield        #49  <Field Cache mCache>
	//   14   24:getfield        #86  <Field SolverVariable[] Cache.mIndexedVariables>
	//   15   27:aload_0         
	//   16   28:getfield        #35  <Field int[] mArrayIndices>
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
	//   25   41:getfield        #47  <Field ArrayRow mRow>
	//   26   44:invokevirtual   #69  <Method void SolverVariable.removeFromRow(ArrayRow)>
			j = mArrayNextIndices[j];
	//   27   47:aload_0         
	//   28   48:getfield        #37  <Field int[] mArrayNextIndices>
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
	//   39   63:putfield        #41  <Field int mHead>
		mLast = -1;
	//   40   66:aload_0         
	//   41   67:iconst_m1       
	//   42   68:putfield        #43  <Field int mLast>
		mDidFillOnce = false;
	//   43   71:aload_0         
	//   44   72:iconst_0        
	//   45   73:putfield        #45  <Field boolean mDidFillOnce>
		currentSize = 0;
	//   46   76:aload_0         
	//   47   77:iconst_0        
	//   48   78:putfield        #29  <Field int currentSize>
	//   49   81:return          
	}

	final boolean containsKey(SolverVariable solvervariable)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mHead>
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
	//*  15   21:getfield        #29  <Field int currentSize>
	//*  16   24:icmpge          56
		{
			if(mArrayIndices[j] == solvervariable.id)
	//*  17   27:aload_0         
	//*  18   28:getfield        #35  <Field int[] mArrayIndices>
	//*  19   31:iload_3         
	//*  20   32:iaload          
	//*  21   33:aload_1         
	//*  22   34:getfield        #62  <Field int SolverVariable.id>
	//*  23   37:icmpne          42
				return true;
	//   24   40:iconst_1        
	//   25   41:ireturn         
			j = mArrayNextIndices[j];
	//   26   42:aload_0         
	//   27   43:getfield        #37  <Field int[] mArrayNextIndices>
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

	void divideByAmount(float f)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mHead>
	//    2    4:istore_3        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          50
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int currentSize>
	//*  11   17:icmpge          50
		{
			float af[] = mArrayValues;
	//   12   20:aload_0         
	//   13   21:getfield        #39  <Field float[] mArrayValues>
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
	//   24   37:getfield        #37  <Field int[] mArrayNextIndices>
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
	//    1    1:getfield        #41  <Field int mHead>
	//    2    4:istore_3        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          54
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int currentSize>
	//*  11   17:icmpge          54
		{
			if(mArrayIndices[j] == solvervariable.id)
	//*  12   20:aload_0         
	//*  13   21:getfield        #35  <Field int[] mArrayIndices>
	//*  14   24:iload_3         
	//*  15   25:iaload          
	//*  16   26:aload_1         
	//*  17   27:getfield        #62  <Field int SolverVariable.id>
	//*  18   30:icmpne          40
				return mArrayValues[j];
	//   19   33:aload_0         
	//   20   34:getfield        #39  <Field float[] mArrayValues>
	//   21   37:iload_3         
	//   22   38:faload          
	//   23   39:freturn         
			j = mArrayNextIndices[j];
	//   24   40:aload_0         
	//   25   41:getfield        #37  <Field int[] mArrayNextIndices>
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

	SolverVariable getPivotCandidate(boolean aflag[], SolverVariable solvervariable)
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mHead>
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
	//*  14   23:getfield        #29  <Field int currentSize>
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
	//   21   37:getfield        #39  <Field float[] mArrayValues>
	//   22   40:iload           7
	//   23   42:faload          
	//   24   43:fconst_0        
	//   25   44:fcmpg           
	//   26   45:ifge            159
				SolverVariable solvervariable3 = mCache.mIndexedVariables[mArrayIndices[j]];
	//   27   48:aload_0         
	//   28   49:getfield        #49  <Field Cache mCache>
	//   29   52:getfield        #86  <Field SolverVariable[] Cache.mIndexedVariables>
	//   30   55:aload_0         
	//   31   56:getfield        #35  <Field int[] mArrayIndices>
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
	//   44   79:getfield        #62  <Field int SolverVariable.id>
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
	//*  55  101:getfield        #92  <Field SolverVariable$Type SolverVariable.mType>
	//*  56  104:getstatic       #111 <Field SolverVariable$Type SolverVariable$Type.SLACK>
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
	//   63  119:getfield        #92  <Field SolverVariable$Type SolverVariable.mType>
	//   64  122:getstatic       #114 <Field SolverVariable$Type SolverVariable$Type.ERROR>
	//   65  125:if_acmpne       159
				}
				float f2 = mArrayValues[j];
	//   66  128:aload_0         
	//   67  129:getfield        #39  <Field float[] mArrayValues>
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
	//   84  160:getfield        #37  <Field int[] mArrayNextIndices>
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
	//    1    1:getfield        #41  <Field int mHead>
	//    2    4:istore_3        
		for(int j = 0; k != -1 && j < currentSize; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          54
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int currentSize>
	//*  11   17:icmpge          54
		{
			if(j == i)
	//*  12   20:iload_2         
	//*  13   21:iload_1         
	//*  14   22:icmpne          40
				return mCache.mIndexedVariables[mArrayIndices[k]];
	//   15   25:aload_0         
	//   16   26:getfield        #49  <Field Cache mCache>
	//   17   29:getfield        #86  <Field SolverVariable[] Cache.mIndexedVariables>
	//   18   32:aload_0         
	//   19   33:getfield        #35  <Field int[] mArrayIndices>
	//   20   36:iload_3         
	//   21   37:iaload          
	//   22   38:aaload          
	//   23   39:areturn         
			k = mArrayNextIndices[k];
	//   24   40:aload_0         
	//   25   41:getfield        #37  <Field int[] mArrayNextIndices>
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
	//    1    1:getfield        #41  <Field int mHead>
	//    2    4:istore_3        
		for(int j = 0; k != -1 && j < currentSize; j++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_3         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          46
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int currentSize>
	//*  11   17:icmpge          46
		{
			if(j == i)
	//*  12   20:iload_2         
	//*  13   21:iload_1         
	//*  14   22:icmpne          32
				return mArrayValues[k];
	//   15   25:aload_0         
	//   16   26:getfield        #39  <Field float[] mArrayValues>
	//   17   29:iload_3         
	//   18   30:faload          
	//   19   31:freturn         
			k = mArrayNextIndices[k];
	//   20   32:aload_0         
	//   21   33:getfield        #37  <Field int[] mArrayNextIndices>
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

	void invert()
	{
		int j = mHead;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mHead>
	//    2    4:istore_2        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_1        
	//*   5    7:iload_2         
	//*   6    8:iconst_m1       
	//*   7    9:icmpeq          48
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int currentSize>
	//*  11   17:icmpge          48
		{
			float af[] = mArrayValues;
	//   12   20:aload_0         
	//   13   21:getfield        #39  <Field float[] mArrayValues>
	//   14   24:astore_3        
			af[j] = af[j] * -1F;
	//   15   25:aload_3         
	//   16   26:iload_2         
	//   17   27:aload_3         
	//   18   28:iload_2         
	//   19   29:faload          
	//   20   30:ldc1            #120 <Float -1F>
	//   21   32:fmul            
	//   22   33:fastore         
			j = mArrayNextIndices[j];
	//   23   34:aload_0         
	//   24   35:getfield        #37  <Field int[] mArrayNextIndices>
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
	//    7    9:invokevirtual   #126 <Method float remove(SolverVariable, boolean)>
	//    8   12:pop             
			return;
	//    9   13:return          
		}
		int i = mHead;
	//   10   14:aload_0         
	//   11   15:getfield        #41  <Field int mHead>
	//   12   18:istore_3        
		if(i == -1)
	//*  13   19:iload_3         
	//*  14   20:iconst_m1       
	//*  15   21:icmpne          140
		{
			mHead = 0;
	//   16   24:aload_0         
	//   17   25:iconst_0        
	//   18   26:putfield        #41  <Field int mHead>
			float af[] = mArrayValues;
	//   19   29:aload_0         
	//   20   30:getfield        #39  <Field float[] mArrayValues>
	//   21   33:astore          7
			i = mHead;
	//   22   35:aload_0         
	//   23   36:getfield        #41  <Field int mHead>
	//   24   39:istore_3        
			af[i] = f;
	//   25   40:aload           7
	//   26   42:iload_3         
	//   27   43:fload_2         
	//   28   44:fastore         
			mArrayIndices[i] = solvervariable.id;
	//   29   45:aload_0         
	//   30   46:getfield        #35  <Field int[] mArrayIndices>
	//   31   49:iload_3         
	//   32   50:aload_1         
	//   33   51:getfield        #62  <Field int SolverVariable.id>
	//   34   54:iastore         
			mArrayNextIndices[mHead] = -1;
	//   35   55:aload_0         
	//   36   56:getfield        #37  <Field int[] mArrayNextIndices>
	//   37   59:aload_0         
	//   38   60:getfield        #41  <Field int mHead>
	//   39   63:iconst_m1       
	//   40   64:iastore         
			solvervariable.usageInRowCount = solvervariable.usageInRowCount + 1;
	//   41   65:aload_1         
	//   42   66:aload_1         
	//   43   67:getfield        #57  <Field int SolverVariable.usageInRowCount>
	//   44   70:iconst_1        
	//   45   71:iadd            
	//   46   72:putfield        #57  <Field int SolverVariable.usageInRowCount>
			solvervariable.addToRow(mRow);
	//   47   75:aload_1         
	//   48   76:aload_0         
	//   49   77:getfield        #47  <Field ArrayRow mRow>
	//   50   80:invokevirtual   #66  <Method void SolverVariable.addToRow(ArrayRow)>
			currentSize = currentSize + 1;
	//   51   83:aload_0         
	//   52   84:aload_0         
	//   53   85:getfield        #29  <Field int currentSize>
	//   54   88:iconst_1        
	//   55   89:iadd            
	//   56   90:putfield        #29  <Field int currentSize>
			if(!mDidFillOnce)
	//*  57   93:aload_0         
	//*  58   94:getfield        #45  <Field boolean mDidFillOnce>
	//*  59   97:ifne            139
			{
				mLast = mLast + 1;
	//   60  100:aload_0         
	//   61  101:aload_0         
	//   62  102:getfield        #43  <Field int mLast>
	//   63  105:iconst_1        
	//   64  106:iadd            
	//   65  107:putfield        #43  <Field int mLast>
				i = mLast;
	//   66  110:aload_0         
	//   67  111:getfield        #43  <Field int mLast>
	//   68  114:istore_3        
				solvervariable = ((SolverVariable) (mArrayIndices));
	//   69  115:aload_0         
	//   70  116:getfield        #35  <Field int[] mArrayIndices>
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
	//   78  128:putfield        #45  <Field boolean mDidFillOnce>
					mLast = solvervariable.length - 1;
	//   79  131:aload_0         
	//   80  132:aload_1         
	//   81  133:arraylength     
	//   82  134:iconst_1        
	//   83  135:isub            
	//   84  136:putfield        #43  <Field int mLast>
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
	//*  95  154:getfield        #29  <Field int currentSize>
	//*  96  157:icmpge          213
		{
			if(mArrayIndices[i] == solvervariable.id)
	//*  97  160:aload_0         
	//*  98  161:getfield        #35  <Field int[] mArrayIndices>
	//*  99  164:iload_3         
	//* 100  165:iaload          
	//* 101  166:aload_1         
	//* 102  167:getfield        #62  <Field int SolverVariable.id>
	//* 103  170:icmpne          181
			{
				mArrayValues[i] = f;
	//  104  173:aload_0         
	//  105  174:getfield        #39  <Field float[] mArrayValues>
	//  106  177:iload_3         
	//  107  178:fload_2         
	//  108  179:fastore         
				return;
	//  109  180:return          
			}
			if(mArrayIndices[i] < solvervariable.id)
	//* 110  181:aload_0         
	//* 111  182:getfield        #35  <Field int[] mArrayIndices>
	//* 112  185:iload_3         
	//* 113  186:iaload          
	//* 114  187:aload_1         
	//* 115  188:getfield        #62  <Field int SolverVariable.id>
	//* 116  191:icmpge          197
				l = i;
	//  117  194:iload_3         
	//  118  195:istore          6
			i = mArrayNextIndices[i];
	//  119  197:aload_0         
	//  120  198:getfield        #37  <Field int[] mArrayNextIndices>
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
	//  130  214:getfield        #43  <Field int mLast>
	//  131  217:istore_3        
		if(mDidFillOnce)
	//* 132  218:aload_0         
	//* 133  219:getfield        #45  <Field boolean mDidFillOnce>
	//* 134  222:ifeq            249
		{
			int ai[] = mArrayIndices;
	//  135  225:aload_0         
	//  136  226:getfield        #35  <Field int[] mArrayIndices>
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
	//  153  254:getfield        #35  <Field int[] mArrayIndices>
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
	//* 164  273:getfield        #29  <Field int currentSize>
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
	//  171  286:getfield        #35  <Field int[] mArrayIndices>
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
	//  193  328:getfield        #35  <Field int[] mArrayIndices>
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
	//  206  350:getfield        #31  <Field int ROW_SIZE>
	//  207  353:iconst_2        
	//  208  354:imul            
	//  209  355:putfield        #31  <Field int ROW_SIZE>
			mDidFillOnce = false;
	//  210  358:aload_0         
	//  211  359:iconst_0        
	//  212  360:putfield        #45  <Field boolean mDidFillOnce>
			mLast = i - 1;
	//  213  363:aload_0         
	//  214  364:iload_3         
	//  215  365:iconst_1        
	//  216  366:isub            
	//  217  367:putfield        #43  <Field int mLast>
			mArrayValues = Arrays.copyOf(mArrayValues, ROW_SIZE);
	//  218  370:aload_0         
	//  219  371:aload_0         
	//  220  372:getfield        #39  <Field float[] mArrayValues>
	//  221  375:aload_0         
	//  222  376:getfield        #31  <Field int ROW_SIZE>
	//  223  379:invokestatic    #75  <Method float[] Arrays.copyOf(float[], int)>
	//  224  382:putfield        #39  <Field float[] mArrayValues>
			mArrayIndices = Arrays.copyOf(mArrayIndices, ROW_SIZE);
	//  225  385:aload_0         
	//  226  386:aload_0         
	//  227  387:getfield        #35  <Field int[] mArrayIndices>
	//  228  390:aload_0         
	//  229  391:getfield        #31  <Field int ROW_SIZE>
	//  230  394:invokestatic    #78  <Method int[] Arrays.copyOf(int[], int)>
	//  231  397:putfield        #35  <Field int[] mArrayIndices>
			mArrayNextIndices = Arrays.copyOf(mArrayNextIndices, ROW_SIZE);
	//  232  400:aload_0         
	//  233  401:aload_0         
	//  234  402:getfield        #37  <Field int[] mArrayNextIndices>
	//  235  405:aload_0         
	//  236  406:getfield        #31  <Field int ROW_SIZE>
	//  237  409:invokestatic    #78  <Method int[] Arrays.copyOf(int[], int)>
	//  238  412:putfield        #37  <Field int[] mArrayNextIndices>
		}
		mArrayIndices[i] = solvervariable.id;
	//  239  415:aload_0         
	//  240  416:getfield        #35  <Field int[] mArrayIndices>
	//  241  419:iload_3         
	//  242  420:aload_1         
	//  243  421:getfield        #62  <Field int SolverVariable.id>
	//  244  424:iastore         
		mArrayValues[i] = f;
	//  245  425:aload_0         
	//  246  426:getfield        #39  <Field float[] mArrayValues>
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
	//  254  439:getfield        #37  <Field int[] mArrayNextIndices>
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
	//  268  463:getfield        #37  <Field int[] mArrayNextIndices>
	//  269  466:iload_3         
	//  270  467:aload_0         
	//  271  468:getfield        #41  <Field int mHead>
	//  272  471:iastore         
			mHead = i;
	//  273  472:aload_0         
	//  274  473:iload_3         
	//  275  474:putfield        #41  <Field int mHead>
		}
		solvervariable.usageInRowCount = solvervariable.usageInRowCount + 1;
	//  276  477:aload_1         
	//  277  478:aload_1         
	//  278  479:getfield        #57  <Field int SolverVariable.usageInRowCount>
	//  279  482:iconst_1        
	//  280  483:iadd            
	//  281  484:putfield        #57  <Field int SolverVariable.usageInRowCount>
		solvervariable.addToRow(mRow);
	//  282  487:aload_1         
	//  283  488:aload_0         
	//  284  489:getfield        #47  <Field ArrayRow mRow>
	//  285  492:invokevirtual   #66  <Method void SolverVariable.addToRow(ArrayRow)>
		currentSize = currentSize + 1;
	//  286  495:aload_0         
	//  287  496:aload_0         
	//  288  497:getfield        #29  <Field int currentSize>
	//  289  500:iconst_1        
	//  290  501:iadd            
	//  291  502:putfield        #29  <Field int currentSize>
		if(!mDidFillOnce)
	//* 292  505:aload_0         
	//* 293  506:getfield        #45  <Field boolean mDidFillOnce>
	//* 294  509:ifne            522
			mLast = mLast + 1;
	//  295  512:aload_0         
	//  296  513:aload_0         
	//  297  514:getfield        #43  <Field int mLast>
	//  298  517:iconst_1        
	//  299  518:iadd            
	//  300  519:putfield        #43  <Field int mLast>
		if(currentSize >= mArrayIndices.length)
	//* 301  522:aload_0         
	//* 302  523:getfield        #29  <Field int currentSize>
	//* 303  526:aload_0         
	//* 304  527:getfield        #35  <Field int[] mArrayIndices>
	//* 305  530:arraylength     
	//* 306  531:icmplt          539
			mDidFillOnce = true;
	//  307  534:aload_0         
	//  308  535:iconst_1        
	//  309  536:putfield        #45  <Field boolean mDidFillOnce>
		i = mLast;
	//  310  539:aload_0         
	//  311  540:getfield        #43  <Field int mLast>
	//  312  543:istore_3        
		solvervariable = ((SolverVariable) (mArrayIndices));
	//  313  544:aload_0         
	//  314  545:getfield        #35  <Field int[] mArrayIndices>
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
	//  322  557:putfield        #45  <Field boolean mDidFillOnce>
			mLast = solvervariable.length - 1;
	//  323  560:aload_0         
	//  324  561:aload_1         
	//  325  562:arraylength     
	//  326  563:iconst_1        
	//  327  564:isub            
	//  328  565:putfield        #43  <Field int mLast>
		}
	//  329  568:return          
	}

	public final float remove(SolverVariable solvervariable, boolean flag)
	{
		if(candidate == solvervariable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field SolverVariable candidate>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       13
			candidate = null;
	//    4    8:aload_0         
	//    5    9:aconst_null     
	//    6   10:putfield        #33  <Field SolverVariable candidate>
		int i = mHead;
	//    7   13:aload_0         
	//    8   14:getfield        #41  <Field int mHead>
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
	//*  24   39:getfield        #29  <Field int currentSize>
	//*  25   42:icmpge          175
		{
			if(mArrayIndices[i] == solvervariable.id)
	//*  26   45:aload_0         
	//*  27   46:getfield        #35  <Field int[] mArrayIndices>
	//*  28   49:iload_3         
	//*  29   50:iaload          
	//*  30   51:aload_1         
	//*  31   52:getfield        #62  <Field int SolverVariable.id>
	//*  32   55:icmpne          152
			{
				if(i == mHead)
	//*  33   58:iload_3         
	//*  34   59:aload_0         
	//*  35   60:getfield        #41  <Field int mHead>
	//*  36   63:icmpne          79
				{
					mHead = mArrayNextIndices[i];
	//   37   66:aload_0         
	//   38   67:aload_0         
	//   39   68:getfield        #37  <Field int[] mArrayNextIndices>
	//   40   71:iload_3         
	//   41   72:iaload          
	//   42   73:putfield        #41  <Field int mHead>
				} else
	//*  43   76:goto            94
				{
					int ai[] = mArrayNextIndices;
	//   44   79:aload_0         
	//   45   80:getfield        #37  <Field int[] mArrayNextIndices>
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
	//   57  100:getfield        #47  <Field ArrayRow mRow>
	//   58  103:invokevirtual   #69  <Method void SolverVariable.removeFromRow(ArrayRow)>
				solvervariable.usageInRowCount = solvervariable.usageInRowCount - 1;
	//   59  106:aload_1         
	//   60  107:aload_1         
	//   61  108:getfield        #57  <Field int SolverVariable.usageInRowCount>
	//   62  111:iconst_1        
	//   63  112:isub            
	//   64  113:putfield        #57  <Field int SolverVariable.usageInRowCount>
				currentSize = currentSize - 1;
	//   65  116:aload_0         
	//   66  117:aload_0         
	//   67  118:getfield        #29  <Field int currentSize>
	//   68  121:iconst_1        
	//   69  122:isub            
	//   70  123:putfield        #29  <Field int currentSize>
				mArrayIndices[i] = -1;
	//   71  126:aload_0         
	//   72  127:getfield        #35  <Field int[] mArrayIndices>
	//   73  130:iload_3         
	//   74  131:iconst_m1       
	//   75  132:iastore         
				if(mDidFillOnce)
	//*  76  133:aload_0         
	//*  77  134:getfield        #45  <Field boolean mDidFillOnce>
	//*  78  137:ifeq            145
					mLast = i;
	//   79  140:aload_0         
	//   80  141:iload_3         
	//   81  142:putfield        #43  <Field int mLast>
				return mArrayValues[i];
	//   82  145:aload_0         
	//   83  146:getfield        #39  <Field float[] mArrayValues>
	//   84  149:iload_3         
	//   85  150:faload          
	//   86  151:freturn         
			}
			l = mArrayNextIndices[i];
	//   87  152:aload_0         
	//   88  153:getfield        #37  <Field int[] mArrayNextIndices>
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

	public String toString()
	{
		String s = "";
	//    0    0:ldc1            #130 <String "">
	//    1    2:astore_3        
		int j = mHead;
	//    2    3:aload_0         
	//    3    4:getfield        #41  <Field int mHead>
	//    4    7:istore_2        
		for(int i = 0; j != -1 && i < currentSize; i++)
	//*   5    8:iconst_0        
	//*   6    9:istore_1        
	//*   7   10:iload_2         
	//*   8   11:iconst_m1       
	//*   9   12:icmpeq          151
	//*  10   15:iload_1         
	//*  11   16:aload_0         
	//*  12   17:getfield        #29  <Field int currentSize>
	//*  13   20:icmpge          151
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   14   23:new             #132 <Class StringBuilder>
	//   15   26:dup             
	//   16   27:invokespecial   #133 <Method void StringBuilder()>
	//   17   30:astore          4
			stringbuilder.append(s);
	//   18   32:aload           4
	//   19   34:aload_3         
	//   20   35:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   21   38:pop             
			stringbuilder.append(" -> ");
	//   22   39:aload           4
	//   23   41:ldc1            #139 <String " -> ">
	//   24   43:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
			s = stringbuilder.toString();
	//   26   47:aload           4
	//   27   49:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   28   52:astore_3        
			stringbuilder = new StringBuilder();
	//   29   53:new             #132 <Class StringBuilder>
	//   30   56:dup             
	//   31   57:invokespecial   #133 <Method void StringBuilder()>
	//   32   60:astore          4
			stringbuilder.append(s);
	//   33   62:aload           4
	//   34   64:aload_3         
	//   35   65:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   36   68:pop             
			stringbuilder.append(mArrayValues[j]);
	//   37   69:aload           4
	//   38   71:aload_0         
	//   39   72:getfield        #39  <Field float[] mArrayValues>
	//   40   75:iload_2         
	//   41   76:faload          
	//   42   77:invokevirtual   #144 <Method StringBuilder StringBuilder.append(float)>
	//   43   80:pop             
			stringbuilder.append(" : ");
	//   44   81:aload           4
	//   45   83:ldc1            #146 <String " : ">
	//   46   85:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   47   88:pop             
			s = stringbuilder.toString();
	//   48   89:aload           4
	//   49   91:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   50   94:astore_3        
			stringbuilder = new StringBuilder();
	//   51   95:new             #132 <Class StringBuilder>
	//   52   98:dup             
	//   53   99:invokespecial   #133 <Method void StringBuilder()>
	//   54  102:astore          4
			stringbuilder.append(s);
	//   55  104:aload           4
	//   56  106:aload_3         
	//   57  107:invokevirtual   #137 <Method StringBuilder StringBuilder.append(String)>
	//   58  110:pop             
			stringbuilder.append(((Object) (mCache.mIndexedVariables[mArrayIndices[j]])));
	//   59  111:aload           4
	//   60  113:aload_0         
	//   61  114:getfield        #49  <Field Cache mCache>
	//   62  117:getfield        #86  <Field SolverVariable[] Cache.mIndexedVariables>
	//   63  120:aload_0         
	//   64  121:getfield        #35  <Field int[] mArrayIndices>
	//   65  124:iload_2         
	//   66  125:iaload          
	//   67  126:aaload          
	//   68  127:invokevirtual   #149 <Method StringBuilder StringBuilder.append(Object)>
	//   69  130:pop             
			s = stringbuilder.toString();
	//   70  131:aload           4
	//   71  133:invokevirtual   #141 <Method String StringBuilder.toString()>
	//   72  136:astore_3        
			j = mArrayNextIndices[j];
	//   73  137:aload_0         
	//   74  138:getfield        #37  <Field int[] mArrayNextIndices>
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
	//    1    1:getfield        #41  <Field int mHead>
	//    2    4:istore          5
		for(int j = 0; i != -1 && j < currentSize;)
	//*   3    6:iconst_0        
	//*   4    7:istore          6
	//*   5    9:iload           5
	//*   6   11:iconst_m1       
	//*   7   12:icmpeq          204
	//*   8   15:iload           6
	//*   9   17:aload_0         
	//*  10   18:getfield        #29  <Field int currentSize>
	//*  11   21:icmpge          204
			if(mArrayIndices[i] == arrayrow1.variable.id)
	//*  12   24:aload_0         
	//*  13   25:getfield        #35  <Field int[] mArrayIndices>
	//*  14   28:iload           5
	//*  15   30:iaload          
	//*  16   31:aload_2         
	//*  17   32:getfield        #156 <Field SolverVariable ArrayRow.variable>
	//*  18   35:getfield        #62  <Field int SolverVariable.id>
	//*  19   38:icmpne          186
			{
				float f = mArrayValues[i];
	//   20   41:aload_0         
	//   21   42:getfield        #39  <Field float[] mArrayValues>
	//   22   45:iload           5
	//   23   47:faload          
	//   24   48:fstore          4
				remove(arrayrow1.variable, flag);
	//   25   50:aload_0         
	//   26   51:aload_2         
	//   27   52:getfield        #156 <Field SolverVariable ArrayRow.variable>
	//   28   55:iload_3         
	//   29   56:invokevirtual   #126 <Method float remove(SolverVariable, boolean)>
	//   30   59:pop             
				ArrayLinkedVariables arraylinkedvariables = (ArrayLinkedVariables)arrayrow1.variables;
	//   31   60:aload_2         
	//   32   61:getfield        #160 <Field ArrayLinkedVariables ArrayRow.variables>
	//   33   64:checkcast       #2   <Class ArrayLinkedVariables>
	//   34   67:astore          7
				j = arraylinkedvariables.mHead;
	//   35   69:aload           7
	//   36   71:getfield        #41  <Field int mHead>
	//   37   74:istore          6
				for(i = 0; j != -1 && i < arraylinkedvariables.currentSize; i++)
	//*  38   76:iconst_0        
	//*  39   77:istore          5
	//*  40   79:iload           6
	//*  41   81:iconst_m1       
	//*  42   82:icmpeq          146
	//*  43   85:iload           5
	//*  44   87:aload           7
	//*  45   89:getfield        #29  <Field int currentSize>
	//*  46   92:icmpge          146
				{
					add(mCache.mIndexedVariables[arraylinkedvariables.mArrayIndices[j]], arraylinkedvariables.mArrayValues[j] * f, flag);
	//   47   95:aload_0         
	//   48   96:aload_0         
	//   49   97:getfield        #49  <Field Cache mCache>
	//   50  100:getfield        #86  <Field SolverVariable[] Cache.mIndexedVariables>
	//   51  103:aload           7
	//   52  105:getfield        #35  <Field int[] mArrayIndices>
	//   53  108:iload           6
	//   54  110:iaload          
	//   55  111:aaload          
	//   56  112:aload           7
	//   57  114:getfield        #39  <Field float[] mArrayValues>
	//   58  117:iload           6
	//   59  119:faload          
	//   60  120:fload           4
	//   61  122:fmul            
	//   62  123:iload_3         
	//   63  124:invokevirtual   #162 <Method void add(SolverVariable, float, boolean)>
					j = arraylinkedvariables.mArrayNextIndices[j];
	//   64  127:aload           7
	//   65  129:getfield        #37  <Field int[] mArrayNextIndices>
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
	//   76  148:getfield        #166 <Field float ArrayRow.constantValue>
	//   77  151:aload_2         
	//   78  152:getfield        #166 <Field float ArrayRow.constantValue>
	//   79  155:fload           4
	//   80  157:fmul            
	//   81  158:fadd            
	//   82  159:putfield        #166 <Field float ArrayRow.constantValue>
				if(flag)
	//*  83  162:iload_3         
	//*  84  163:ifeq            174
					arrayrow1.variable.removeFromRow(arrayrow);
	//   85  166:aload_2         
	//   86  167:getfield        #156 <Field SolverVariable ArrayRow.variable>
	//   87  170:aload_1         
	//   88  171:invokevirtual   #69  <Method void SolverVariable.removeFromRow(ArrayRow)>
				i = mHead;
	//   89  174:aload_0         
	//   90  175:getfield        #41  <Field int mHead>
	//   91  178:istore          5
				j = 0;
	//   92  180:iconst_0        
	//   93  181:istore          6
			} else
	//*  94  183:goto            9
			{
				i = mArrayNextIndices[i];
	//   95  186:aload_0         
	//   96  187:getfield        #37  <Field int[] mArrayNextIndices>
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
	//    1    1:getfield        #41  <Field int mHead>
	//    2    4:istore          4
		for(int j = 0; i != -1 && j < currentSize;)
	//*   3    6:iconst_0        
	//*   4    7:istore          5
	//*   5    9:iload           4
	//*   6   11:iconst_m1       
	//*   7   12:icmpeq          224
	//*   8   15:iload           5
	//*   9   17:aload_0         
	//*  10   18:getfield        #29  <Field int currentSize>
	//*  11   21:icmpge          224
		{
			Object obj = ((Object) (mCache.mIndexedVariables[mArrayIndices[i]]));
	//   12   24:aload_0         
	//   13   25:getfield        #49  <Field Cache mCache>
	//   14   28:getfield        #86  <Field SolverVariable[] Cache.mIndexedVariables>
	//   15   31:aload_0         
	//   16   32:getfield        #35  <Field int[] mArrayIndices>
	//   17   35:iload           4
	//   18   37:iaload          
	//   19   38:aaload          
	//   20   39:astore          6
			if(((SolverVariable) (obj)).definitionId != -1)
	//*  21   41:aload           6
	//*  22   43:getfield        #171 <Field int SolverVariable.definitionId>
	//*  23   46:iconst_m1       
	//*  24   47:icmpeq          206
			{
				float f = mArrayValues[i];
	//   25   50:aload_0         
	//   26   51:getfield        #39  <Field float[] mArrayValues>
	//   27   54:iload           4
	//   28   56:faload          
	//   29   57:fstore_3        
				remove(((SolverVariable) (obj)), true);
	//   30   58:aload_0         
	//   31   59:aload           6
	//   32   61:iconst_1        
	//   33   62:invokevirtual   #126 <Method float remove(SolverVariable, boolean)>
	//   34   65:pop             
				obj = ((Object) (aarrayrow[((SolverVariable) (obj)).definitionId]));
	//   35   66:aload_2         
	//   36   67:aload           6
	//   37   69:getfield        #171 <Field int SolverVariable.definitionId>
	//   38   72:aaload          
	//   39   73:astore          6
				if(!((ArrayRow) (obj)).isSimpleDefinition)
	//*  40   75:aload           6
	//*  41   77:getfield        #174 <Field boolean ArrayRow.isSimpleDefinition>
	//*  42   80:ifne            169
				{
					ArrayLinkedVariables arraylinkedvariables = (ArrayLinkedVariables)((ArrayRow) (obj)).variables;
	//   43   83:aload           6
	//   44   85:getfield        #160 <Field ArrayLinkedVariables ArrayRow.variables>
	//   45   88:checkcast       #2   <Class ArrayLinkedVariables>
	//   46   91:astore          7
					j = arraylinkedvariables.mHead;
	//   47   93:aload           7
	//   48   95:getfield        #41  <Field int mHead>
	//   49   98:istore          5
					for(i = 0; j != -1 && i < arraylinkedvariables.currentSize; i++)
	//*  50  100:iconst_0        
	//*  51  101:istore          4
	//*  52  103:iload           5
	//*  53  105:iconst_m1       
	//*  54  106:icmpeq          169
	//*  55  109:iload           4
	//*  56  111:aload           7
	//*  57  113:getfield        #29  <Field int currentSize>
	//*  58  116:icmpge          169
					{
						add(mCache.mIndexedVariables[arraylinkedvariables.mArrayIndices[j]], arraylinkedvariables.mArrayValues[j] * f, true);
	//   59  119:aload_0         
	//   60  120:aload_0         
	//   61  121:getfield        #49  <Field Cache mCache>
	//   62  124:getfield        #86  <Field SolverVariable[] Cache.mIndexedVariables>
	//   63  127:aload           7
	//   64  129:getfield        #35  <Field int[] mArrayIndices>
	//   65  132:iload           5
	//   66  134:iaload          
	//   67  135:aaload          
	//   68  136:aload           7
	//   69  138:getfield        #39  <Field float[] mArrayValues>
	//   70  141:iload           5
	//   71  143:faload          
	//   72  144:fload_3         
	//   73  145:fmul            
	//   74  146:iconst_1        
	//   75  147:invokevirtual   #162 <Method void add(SolverVariable, float, boolean)>
						j = arraylinkedvariables.mArrayNextIndices[j];
	//   76  150:aload           7
	//   77  152:getfield        #37  <Field int[] mArrayNextIndices>
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
	//   88  171:getfield        #166 <Field float ArrayRow.constantValue>
	//   89  174:aload           6
	//   90  176:getfield        #166 <Field float ArrayRow.constantValue>
	//   91  179:fload_3         
	//   92  180:fmul            
	//   93  181:fadd            
	//   94  182:putfield        #166 <Field float ArrayRow.constantValue>
				((ArrayRow) (obj)).variable.removeFromRow(arrayrow);
	//   95  185:aload           6
	//   96  187:getfield        #156 <Field SolverVariable ArrayRow.variable>
	//   97  190:aload_1         
	//   98  191:invokevirtual   #69  <Method void SolverVariable.removeFromRow(ArrayRow)>
				i = mHead;
	//   99  194:aload_0         
	//  100  195:getfield        #41  <Field int mHead>
	//  101  198:istore          4
				j = 0;
	//  102  200:iconst_0        
	//  103  201:istore          5
			} else
	//* 104  203:goto            9
			{
				i = mArrayNextIndices[i];
	//  105  206:aload_0         
	//  106  207:getfield        #37  <Field int[] mArrayNextIndices>
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
