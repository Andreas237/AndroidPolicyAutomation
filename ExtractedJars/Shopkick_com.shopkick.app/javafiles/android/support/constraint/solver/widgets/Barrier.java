// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.Metrics;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			Helper, ConstraintAnchor, ConstraintWidget, ConstraintWidgetContainer, 
//			ResolutionAnchor

public class Barrier extends Helper
{

	public Barrier()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Helper()>
		mBarrierType = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #25  <Field int mBarrierType>
		mNodes = new ArrayList(4);
	//    5    9:aload_0         
	//    6   10:new             #27  <Class ArrayList>
	//    7   13:dup             
	//    8   14:iconst_4        
	//    9   15:invokespecial   #30  <Method void ArrayList(int)>
	//   10   18:putfield        #32  <Field ArrayList mNodes>
		mAllowsGoneWidget = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #34  <Field boolean mAllowsGoneWidget>
	//   14   26:return          
	}

	public void addToSolver(LinearSystem linearsystem)
	{
label0:
		{
			boolean flag;
			ConstraintAnchor constraintanchor;
label1:
			{
				mListAnchors[0] = mLeft;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ConstraintAnchor[] mListAnchors>
	//    2    4:iconst_0        
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field ConstraintAnchor mLeft>
	//    5    9:aastore         
				mListAnchors[2] = mTop;
	//    6   10:aload_0         
	//    7   11:getfield        #41  <Field ConstraintAnchor[] mListAnchors>
	//    8   14:iconst_2        
	//    9   15:aload_0         
	//   10   16:getfield        #48  <Field ConstraintAnchor mTop>
	//   11   19:aastore         
				mListAnchors[1] = mRight;
	//   12   20:aload_0         
	//   13   21:getfield        #41  <Field ConstraintAnchor[] mListAnchors>
	//   14   24:iconst_1        
	//   15   25:aload_0         
	//   16   26:getfield        #51  <Field ConstraintAnchor mRight>
	//   17   29:aastore         
				mListAnchors[3] = mBottom;
	//   18   30:aload_0         
	//   19   31:getfield        #41  <Field ConstraintAnchor[] mListAnchors>
	//   20   34:iconst_3        
	//   21   35:aload_0         
	//   22   36:getfield        #54  <Field ConstraintAnchor mBottom>
	//   23   39:aastore         
				for(int i = 0; i < mListAnchors.length; i++)
	//*  24   40:iconst_0        
	//*  25   41:istore_2        
	//*  26   42:iload_2         
	//*  27   43:aload_0         
	//*  28   44:getfield        #41  <Field ConstraintAnchor[] mListAnchors>
	//*  29   47:arraylength     
	//*  30   48:icmpge          77
					mListAnchors[i].mSolverVariable = linearsystem.createObjectVariable(((Object) (mListAnchors[i])));
	//   31   51:aload_0         
	//   32   52:getfield        #41  <Field ConstraintAnchor[] mListAnchors>
	//   33   55:iload_2         
	//   34   56:aaload          
	//   35   57:aload_1         
	//   36   58:aload_0         
	//   37   59:getfield        #41  <Field ConstraintAnchor[] mListAnchors>
	//   38   62:iload_2         
	//   39   63:aaload          
	//   40   64:invokevirtual   #60  <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   41   67:putfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>

	//   42   70:iload_2         
	//   43   71:iconst_1        
	//   44   72:iadd            
	//   45   73:istore_2        
	//*  46   74:goto            42
				int j = mBarrierType;
	//   47   77:aload_0         
	//   48   78:getfield        #25  <Field int mBarrierType>
	//   49   81:istore_2        
				if(j < 0 || j >= 4)
					break label0;
	//   50   82:iload_2         
	//   51   83:iflt            616
	//   52   86:iload_2         
	//   53   87:iconst_4        
	//   54   88:icmpge          616
				constraintanchor = mListAnchors[mBarrierType];
	//   55   91:aload_0         
	//   56   92:getfield        #41  <Field ConstraintAnchor[] mListAnchors>
	//   57   95:aload_0         
	//   58   96:getfield        #25  <Field int mBarrierType>
	//   59   99:aaload          
	//   60  100:astore          5
				j = 0;
	//   61  102:iconst_0        
	//   62  103:istore_2        
				do
				{
					if(j >= mWidgetsCount)
						break;
	//   63  104:iload_2         
	//   64  105:aload_0         
	//   65  106:getfield        #69  <Field int mWidgetsCount>
	//   66  109:icmpge          208
					ConstraintWidget constraintwidget = mWidgets[j];
	//   67  112:aload_0         
	//   68  113:getfield        #73  <Field ConstraintWidget[] mWidgets>
	//   69  116:iload_2         
	//   70  117:aaload          
	//   71  118:astore          6
					if(mAllowsGoneWidget || constraintwidget.allowedInBarrier())
	//*  72  120:aload_0         
	//*  73  121:getfield        #34  <Field boolean mAllowsGoneWidget>
	//*  74  124:ifne            138
	//*  75  127:aload           6
	//*  76  129:invokevirtual   #79  <Method boolean ConstraintWidget.allowedInBarrier()>
	//*  77  132:ifne            138
	//*  78  135:goto            201
					{
						int l = mBarrierType;
	//   79  138:aload_0         
	//   80  139:getfield        #25  <Field int mBarrierType>
	//   81  142:istore_3        
						if((l == 0 || l == 1) && constraintwidget.getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
	//*  82  143:iload_3         
	//*  83  144:ifeq            152
	//*  84  147:iload_3         
	//*  85  148:iconst_1        
	//*  86  149:icmpne          169
	//*  87  152:aload           6
	//*  88  154:invokevirtual   #83  <Method ConstraintWidget$DimensionBehaviour ConstraintWidget.getHorizontalDimensionBehaviour()>
	//*  89  157:getstatic       #89  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  90  160:if_acmpne       169
						{
							flag = true;
	//   91  163:iconst_1        
	//   92  164:istore          4
							break label1;
	//   93  166:goto            211
						}
						l = mBarrierType;
	//   94  169:aload_0         
	//   95  170:getfield        #25  <Field int mBarrierType>
	//   96  173:istore_3        
						if((l == 2 || l == 3) && constraintwidget.getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
	//*  97  174:iload_3         
	//*  98  175:iconst_2        
	//*  99  176:icmpeq          184
	//* 100  179:iload_3         
	//* 101  180:iconst_3        
	//* 102  181:icmpne          201
	//* 103  184:aload           6
	//* 104  186:invokevirtual   #92  <Method ConstraintWidget$DimensionBehaviour ConstraintWidget.getVerticalDimensionBehaviour()>
	//* 105  189:getstatic       #89  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 106  192:if_acmpne       201
						{
							flag = true;
	//  107  195:iconst_1        
	//  108  196:istore          4
							break label1;
	//  109  198:goto            211
						}
					}
					j++;
	//  110  201:iload_2         
	//  111  202:iconst_1        
	//  112  203:iadd            
	//  113  204:istore_2        
				} while(true);
	//  114  205:goto            104
				flag = false;
	//  115  208:iconst_0        
	//  116  209:istore          4
			}
			int k = mBarrierType;
	//  117  211:aload_0         
	//  118  212:getfield        #25  <Field int mBarrierType>
	//  119  215:istore_2        
			if(k != 0 && k != 1)
	//* 120  216:iload_2         
	//* 121  217:ifeq            247
	//* 122  220:iload_2         
	//* 123  221:iconst_1        
	//* 124  222:icmpne          228
	//* 125  225:goto            247
			{
				if(getParent().getVerticalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//* 126  228:aload_0         
	//* 127  229:invokevirtual   #96  <Method ConstraintWidget getParent()>
	//* 128  232:invokevirtual   #92  <Method ConstraintWidget$DimensionBehaviour ConstraintWidget.getVerticalDimensionBehaviour()>
	//* 129  235:getstatic       #99  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 130  238:if_acmpne       263
					flag = false;
	//  131  241:iconst_0        
	//  132  242:istore          4
			} else
	//* 133  244:goto            263
			if(getParent().getHorizontalDimensionBehaviour() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//* 134  247:aload_0         
	//* 135  248:invokevirtual   #96  <Method ConstraintWidget getParent()>
	//* 136  251:invokevirtual   #83  <Method ConstraintWidget$DimensionBehaviour ConstraintWidget.getHorizontalDimensionBehaviour()>
	//* 137  254:getstatic       #99  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 138  257:if_acmpne       263
				flag = false;
	//  139  260:iconst_0        
	//  140  261:istore          4
			for(k = 0; k < mWidgetsCount; k++)
	//* 141  263:iconst_0        
	//* 142  264:istore_2        
	//* 143  265:iload_2         
	//* 144  266:aload_0         
	//* 145  267:getfield        #69  <Field int mWidgetsCount>
	//* 146  270:icmpge          384
			{
				ConstraintWidget constraintwidget1 = mWidgets[k];
	//  147  273:aload_0         
	//  148  274:getfield        #73  <Field ConstraintWidget[] mWidgets>
	//  149  277:iload_2         
	//  150  278:aaload          
	//  151  279:astore          7
				if(!mAllowsGoneWidget && !constraintwidget1.allowedInBarrier())
	//* 152  281:aload_0         
	//* 153  282:getfield        #34  <Field boolean mAllowsGoneWidget>
	//* 154  285:ifne            299
	//* 155  288:aload           7
	//* 156  290:invokevirtual   #79  <Method boolean ConstraintWidget.allowedInBarrier()>
	//* 157  293:ifne            299
					continue;
	//  158  296:goto            377
				android.support.constraint.solver.SolverVariable solvervariable = linearsystem.createObjectVariable(((Object) (constraintwidget1.mListAnchors[mBarrierType])));
	//  159  299:aload_1         
	//  160  300:aload           7
	//  161  302:getfield        #100 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  162  305:aload_0         
	//  163  306:getfield        #25  <Field int mBarrierType>
	//  164  309:aaload          
	//  165  310:invokevirtual   #60  <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  166  313:astore          6
				ConstraintAnchor aconstraintanchor[] = constraintwidget1.mListAnchors;
	//  167  315:aload           7
	//  168  317:getfield        #100 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  169  320:astore          7
				int i1 = mBarrierType;
	//  170  322:aload_0         
	//  171  323:getfield        #25  <Field int mBarrierType>
	//  172  326:istore_3        
				aconstraintanchor[i1].mSolverVariable = solvervariable;
	//  173  327:aload           7
	//  174  329:iload_3         
	//  175  330:aaload          
	//  176  331:aload           6
	//  177  333:putfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
				if(i1 != 0 && i1 != 2)
	//* 178  336:iload_3         
	//* 179  337:ifeq            364
	//* 180  340:iload_3         
	//* 181  341:iconst_2        
	//* 182  342:icmpne          348
	//* 183  345:goto            364
					linearsystem.addGreaterBarrier(constraintanchor.mSolverVariable, solvervariable, flag);
	//  184  348:aload_1         
	//  185  349:aload           5
	//  186  351:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  187  354:aload           6
	//  188  356:iload           4
	//  189  358:invokevirtual   #104 <Method void LinearSystem.addGreaterBarrier(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, boolean)>
				else
	//* 190  361:goto            377
					linearsystem.addLowerBarrier(constraintanchor.mSolverVariable, solvervariable, flag);
	//  191  364:aload_1         
	//  192  365:aload           5
	//  193  367:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  194  370:aload           6
	//  195  372:iload           4
	//  196  374:invokevirtual   #107 <Method void LinearSystem.addLowerBarrier(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, boolean)>
			}

	//  197  377:iload_2         
	//  198  378:iconst_1        
	//  199  379:iadd            
	//  200  380:istore_2        
	//* 201  381:goto            265
			k = mBarrierType;
	//  202  384:aload_0         
	//  203  385:getfield        #25  <Field int mBarrierType>
	//  204  388:istore_2        
			if(k == 0)
	//* 205  389:iload_2         
	//* 206  390:ifne            445
			{
				linearsystem.addEquality(mRight.mSolverVariable, mLeft.mSolverVariable, 0, 6);
	//  207  393:aload_1         
	//  208  394:aload_0         
	//  209  395:getfield        #51  <Field ConstraintAnchor mRight>
	//  210  398:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  211  401:aload_0         
	//  212  402:getfield        #45  <Field ConstraintAnchor mLeft>
	//  213  405:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  214  408:iconst_0        
	//  215  409:bipush          6
	//  216  411:invokevirtual   #111 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  217  414:pop             
				if(!flag)
	//* 218  415:iload           4
	//* 219  417:ifne            615
				{
					linearsystem.addEquality(mLeft.mSolverVariable, mParent.mRight.mSolverVariable, 0, 5);
	//  220  420:aload_1         
	//  221  421:aload_0         
	//  222  422:getfield        #45  <Field ConstraintAnchor mLeft>
	//  223  425:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  224  428:aload_0         
	//  225  429:getfield        #115 <Field ConstraintWidget mParent>
	//  226  432:getfield        #116 <Field ConstraintAnchor ConstraintWidget.mRight>
	//  227  435:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  228  438:iconst_0        
	//  229  439:iconst_5        
	//  230  440:invokevirtual   #111 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  231  443:pop             
					return;
	//  232  444:return          
				}
			} else
			if(k == 1)
	//* 233  445:iload_2         
	//* 234  446:iconst_1        
	//* 235  447:icmpne          502
			{
				linearsystem.addEquality(mLeft.mSolverVariable, mRight.mSolverVariable, 0, 6);
	//  236  450:aload_1         
	//  237  451:aload_0         
	//  238  452:getfield        #45  <Field ConstraintAnchor mLeft>
	//  239  455:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  240  458:aload_0         
	//  241  459:getfield        #51  <Field ConstraintAnchor mRight>
	//  242  462:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  243  465:iconst_0        
	//  244  466:bipush          6
	//  245  468:invokevirtual   #111 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  246  471:pop             
				if(!flag)
	//* 247  472:iload           4
	//* 248  474:ifne            615
				{
					linearsystem.addEquality(mLeft.mSolverVariable, mParent.mLeft.mSolverVariable, 0, 5);
	//  249  477:aload_1         
	//  250  478:aload_0         
	//  251  479:getfield        #45  <Field ConstraintAnchor mLeft>
	//  252  482:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  253  485:aload_0         
	//  254  486:getfield        #115 <Field ConstraintWidget mParent>
	//  255  489:getfield        #117 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  256  492:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  257  495:iconst_0        
	//  258  496:iconst_5        
	//  259  497:invokevirtual   #111 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  260  500:pop             
					return;
	//  261  501:return          
				}
			} else
			if(k == 2)
	//* 262  502:iload_2         
	//* 263  503:iconst_2        
	//* 264  504:icmpne          559
			{
				linearsystem.addEquality(mBottom.mSolverVariable, mTop.mSolverVariable, 0, 6);
	//  265  507:aload_1         
	//  266  508:aload_0         
	//  267  509:getfield        #54  <Field ConstraintAnchor mBottom>
	//  268  512:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  269  515:aload_0         
	//  270  516:getfield        #48  <Field ConstraintAnchor mTop>
	//  271  519:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  272  522:iconst_0        
	//  273  523:bipush          6
	//  274  525:invokevirtual   #111 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  275  528:pop             
				if(!flag)
	//* 276  529:iload           4
	//* 277  531:ifne            615
				{
					linearsystem.addEquality(mTop.mSolverVariable, mParent.mBottom.mSolverVariable, 0, 5);
	//  278  534:aload_1         
	//  279  535:aload_0         
	//  280  536:getfield        #48  <Field ConstraintAnchor mTop>
	//  281  539:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  282  542:aload_0         
	//  283  543:getfield        #115 <Field ConstraintWidget mParent>
	//  284  546:getfield        #118 <Field ConstraintAnchor ConstraintWidget.mBottom>
	//  285  549:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  286  552:iconst_0        
	//  287  553:iconst_5        
	//  288  554:invokevirtual   #111 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  289  557:pop             
					return;
	//  290  558:return          
				}
			} else
			if(k == 3)
	//* 291  559:iload_2         
	//* 292  560:iconst_3        
	//* 293  561:icmpne          615
			{
				linearsystem.addEquality(mTop.mSolverVariable, mBottom.mSolverVariable, 0, 6);
	//  294  564:aload_1         
	//  295  565:aload_0         
	//  296  566:getfield        #48  <Field ConstraintAnchor mTop>
	//  297  569:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  298  572:aload_0         
	//  299  573:getfield        #54  <Field ConstraintAnchor mBottom>
	//  300  576:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  301  579:iconst_0        
	//  302  580:bipush          6
	//  303  582:invokevirtual   #111 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  304  585:pop             
				if(!flag)
	//* 305  586:iload           4
	//* 306  588:ifne            615
					linearsystem.addEquality(mTop.mSolverVariable, mParent.mTop.mSolverVariable, 0, 5);
	//  307  591:aload_1         
	//  308  592:aload_0         
	//  309  593:getfield        #48  <Field ConstraintAnchor mTop>
	//  310  596:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  311  599:aload_0         
	//  312  600:getfield        #115 <Field ConstraintWidget mParent>
	//  313  603:getfield        #119 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  314  606:getfield        #66  <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  315  609:iconst_0        
	//  316  610:iconst_5        
	//  317  611:invokevirtual   #111 <Method android.support.constraint.solver.ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  318  614:pop             
			}
			return;
	//  319  615:return          
		}
	//  320  616:return          
	}

	public boolean allowedInBarrier()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void analyze(int i)
	{
		if(mParent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #115 <Field ConstraintWidget mParent>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(!((ConstraintWidgetContainer)mParent).optimizeFor(2))
	//*   4    8:aload_0         
	//*   5    9:getfield        #115 <Field ConstraintWidget mParent>
	//*   6   12:checkcast       #122 <Class ConstraintWidgetContainer>
	//*   7   15:iconst_2        
	//*   8   16:invokevirtual   #126 <Method boolean ConstraintWidgetContainer.optimizeFor(int)>
	//*   9   19:ifne            23
			return;
	//   10   22:return          
		ResolutionAnchor resolutionanchor;
		switch(mBarrierType)
	//*  11   23:aload_0         
	//*  12   24:getfield        #25  <Field int mBarrierType>
		{
	//*  13   27:tableswitch     0 3: default 56
	//	               0 90
	//	               1 79
	//	               2 68
	//	               3 57
		default:
			return;
	//   14   56:return          

		case 3: // '\003'
			resolutionanchor = mBottom.getResolutionNode();
	//   15   57:aload_0         
	//   16   58:getfield        #54  <Field ConstraintAnchor mBottom>
	//   17   61:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   18   64:astore_3        
			break;

	//*  19   65:goto            98
		case 2: // '\002'
			resolutionanchor = mTop.getResolutionNode();
	//   20   68:aload_0         
	//   21   69:getfield        #48  <Field ConstraintAnchor mTop>
	//   22   72:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   23   75:astore_3        
			break;

	//*  24   76:goto            98
		case 1: // '\001'
			resolutionanchor = mRight.getResolutionNode();
	//   25   79:aload_0         
	//   26   80:getfield        #51  <Field ConstraintAnchor mRight>
	//   27   83:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   28   86:astore_3        
			break;

	//*  29   87:goto            98
		case 0: // '\0'
			resolutionanchor = mLeft.getResolutionNode();
	//   30   90:aload_0         
	//   31   91:getfield        #45  <Field ConstraintAnchor mLeft>
	//   32   94:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   33   97:astore_3        
			break;
		}
		resolutionanchor.setType(5);
	//   34   98:aload_3         
	//   35   99:iconst_5        
	//   36  100:invokevirtual   #135 <Method void ResolutionAnchor.setType(int)>
		i = mBarrierType;
	//   37  103:aload_0         
	//   38  104:getfield        #25  <Field int mBarrierType>
	//   39  107:istore_1        
		if(i != 0 && i != 1)
	//*  40  108:iload_1         
	//*  41  109:ifeq            147
	//*  42  112:iload_1         
	//*  43  113:iconst_1        
	//*  44  114:icmpne          120
	//*  45  117:goto            147
		{
			mLeft.getResolutionNode().resolve(((ResolutionAnchor) (null)), 0.0F);
	//   46  120:aload_0         
	//   47  121:getfield        #45  <Field ConstraintAnchor mLeft>
	//   48  124:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   49  127:aconst_null     
	//   50  128:fconst_0        
	//   51  129:invokevirtual   #139 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
			mRight.getResolutionNode().resolve(((ResolutionAnchor) (null)), 0.0F);
	//   52  132:aload_0         
	//   53  133:getfield        #51  <Field ConstraintAnchor mRight>
	//   54  136:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   55  139:aconst_null     
	//   56  140:fconst_0        
	//   57  141:invokevirtual   #139 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
		} else
	//*  58  144:goto            171
		{
			mTop.getResolutionNode().resolve(((ResolutionAnchor) (null)), 0.0F);
	//   59  147:aload_0         
	//   60  148:getfield        #48  <Field ConstraintAnchor mTop>
	//   61  151:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   62  154:aconst_null     
	//   63  155:fconst_0        
	//   64  156:invokevirtual   #139 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
			mBottom.getResolutionNode().resolve(((ResolutionAnchor) (null)), 0.0F);
	//   65  159:aload_0         
	//   66  160:getfield        #54  <Field ConstraintAnchor mBottom>
	//   67  163:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   68  166:aconst_null     
	//   69  167:fconst_0        
	//   70  168:invokevirtual   #139 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
		}
		mNodes.clear();
	//   71  171:aload_0         
	//   72  172:getfield        #32  <Field ArrayList mNodes>
	//   73  175:invokevirtual   #142 <Method void ArrayList.clear()>
		for(i = 0; i < mWidgetsCount; i++)
	//*  74  178:iconst_0        
	//*  75  179:istore_1        
	//*  76  180:iload_1         
	//*  77  181:aload_0         
	//*  78  182:getfield        #69  <Field int mWidgetsCount>
	//*  79  185:icmpge          319
		{
			Object obj = ((Object) (mWidgets[i]));
	//   80  188:aload_0         
	//   81  189:getfield        #73  <Field ConstraintWidget[] mWidgets>
	//   82  192:iload_1         
	//   83  193:aaload          
	//   84  194:astore_2        
			if(!mAllowsGoneWidget && !((ConstraintWidget) (obj)).allowedInBarrier())
	//*  85  195:aload_0         
	//*  86  196:getfield        #34  <Field boolean mAllowsGoneWidget>
	//*  87  199:ifne            212
	//*  88  202:aload_2         
	//*  89  203:invokevirtual   #79  <Method boolean ConstraintWidget.allowedInBarrier()>
	//*  90  206:ifne            212
				continue;
	//   91  209:goto            312
			switch(mBarrierType)
	//*  92  212:aload_0         
	//*  93  213:getfield        #25  <Field int mBarrierType>
			{
	//*  94  216:tableswitch     0 3: default 248
	//	               0 286
	//	               1 275
	//	               2 264
	//	               3 253
			default:
				obj = null;
	//   95  248:aconst_null     
	//   96  249:astore_2        
				break;

	//*  97  250:goto            294
			case 3: // '\003'
				obj = ((Object) (((ConstraintWidget) (obj)).mBottom.getResolutionNode()));
	//   98  253:aload_2         
	//   99  254:getfield        #118 <Field ConstraintAnchor ConstraintWidget.mBottom>
	//  100  257:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  101  260:astore_2        
				break;

	//* 102  261:goto            294
			case 2: // '\002'
				obj = ((Object) (((ConstraintWidget) (obj)).mTop.getResolutionNode()));
	//  103  264:aload_2         
	//  104  265:getfield        #119 <Field ConstraintAnchor ConstraintWidget.mTop>
	//  105  268:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  106  271:astore_2        
				break;

	//* 107  272:goto            294
			case 1: // '\001'
				obj = ((Object) (((ConstraintWidget) (obj)).mRight.getResolutionNode()));
	//  108  275:aload_2         
	//  109  276:getfield        #116 <Field ConstraintAnchor ConstraintWidget.mRight>
	//  110  279:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  111  282:astore_2        
				break;

	//* 112  283:goto            294
			case 0: // '\0'
				obj = ((Object) (((ConstraintWidget) (obj)).mLeft.getResolutionNode()));
	//  113  286:aload_2         
	//  114  287:getfield        #117 <Field ConstraintAnchor ConstraintWidget.mLeft>
	//  115  290:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  116  293:astore_2        
				break;
			}
			if(obj != null)
	//* 117  294:aload_2         
	//* 118  295:ifnull          312
			{
				mNodes.add(obj);
	//  119  298:aload_0         
	//  120  299:getfield        #32  <Field ArrayList mNodes>
	//  121  302:aload_2         
	//  122  303:invokevirtual   #146 <Method boolean ArrayList.add(Object)>
	//  123  306:pop             
				((ResolutionAnchor) (obj)).addDependent(((ResolutionNode) (resolutionanchor)));
	//  124  307:aload_2         
	//  125  308:aload_3         
	//  126  309:invokevirtual   #150 <Method void ResolutionAnchor.addDependent(ResolutionNode)>
			}
		}

	//  127  312:iload_1         
	//  128  313:iconst_1        
	//  129  314:iadd            
	//  130  315:istore_1        
	//* 131  316:goto            180
	//  132  319:return          
	}

	public void resetResolutionNodes()
	{
		super.resetResolutionNodes();
	//    0    0:aload_0         
	//    1    1:invokespecial   #153 <Method void Helper.resetResolutionNodes()>
		mNodes.clear();
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field ArrayList mNodes>
	//    4    8:invokevirtual   #142 <Method void ArrayList.clear()>
	//    5   11:return          
	}

	public void resolve()
	{
		int i = mBarrierType;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int mBarrierType>
	//    2    4:istore_3        
		float f = 3.402823E+38F;
	//    3    5:ldc1            #154 <Float 3.402823E+38F>
	//    4    7:fstore_1        
		ResolutionAnchor resolutionanchor;
		switch(i)
	//*   5    8:iload_3         
		{
	//*   6    9:tableswitch     0 3: default 40
	//	               0 81
	//	               1 67
	//	               2 55
	//	               3 41
		default:
			return;
	//    7   40:return          

		case 3: // '\003'
			resolutionanchor = mBottom.getResolutionNode();
	//    8   41:aload_0         
	//    9   42:getfield        #54  <Field ConstraintAnchor mBottom>
	//   10   45:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   11   48:astore          6
			f = 0.0F;
	//   12   50:fconst_0        
	//   13   51:fstore_1        
			break;

	//*  14   52:goto            90
		case 2: // '\002'
			resolutionanchor = mTop.getResolutionNode();
	//   15   55:aload_0         
	//   16   56:getfield        #48  <Field ConstraintAnchor mTop>
	//   17   59:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   18   62:astore          6
			break;

	//*  19   64:goto            90
		case 1: // '\001'
			resolutionanchor = mRight.getResolutionNode();
	//   20   67:aload_0         
	//   21   68:getfield        #51  <Field ConstraintAnchor mRight>
	//   22   71:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   23   74:astore          6
			f = 0.0F;
	//   24   76:fconst_0        
	//   25   77:fstore_1        
			break;

	//*  26   78:goto            90
		case 0: // '\0'
			resolutionanchor = mLeft.getResolutionNode();
	//   27   81:aload_0         
	//   28   82:getfield        #45  <Field ConstraintAnchor mLeft>
	//   29   85:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   30   88:astore          6
			break;
		}
		int j = mNodes.size();
	//   31   90:aload_0         
	//   32   91:getfield        #32  <Field ArrayList mNodes>
	//   33   94:invokevirtual   #158 <Method int ArrayList.size()>
	//   34   97:istore          4
		ResolutionAnchor resolutionanchor1 = null;
	//   35   99:aconst_null     
	//   36  100:astore          7
		i = 0;
	//   37  102:iconst_0        
	//   38  103:istore_3        
		float f1;
		for(f1 = f; i < j; f1 = f)
	//*  39  104:fload_1         
	//*  40  105:fstore_2        
	//*  41  106:iload_3         
	//*  42  107:iload           4
	//*  43  109:icmpge          217
		{
			ResolutionAnchor resolutionanchor2 = (ResolutionAnchor)mNodes.get(i);
	//   44  112:aload_0         
	//   45  113:getfield        #32  <Field ArrayList mNodes>
	//   46  116:iload_3         
	//   47  117:invokevirtual   #162 <Method Object ArrayList.get(int)>
	//   48  120:checkcast       #132 <Class ResolutionAnchor>
	//   49  123:astore          8
			if(resolutionanchor2.state != 1)
	//*  50  125:aload           8
	//*  51  127:getfield        #165 <Field int ResolutionAnchor.state>
	//*  52  130:iconst_1        
	//*  53  131:icmpeq          135
				return;
	//   54  134:return          
			int k = mBarrierType;
	//   55  135:aload_0         
	//   56  136:getfield        #25  <Field int mBarrierType>
	//   57  139:istore          5
			if(k != 0 && k != 2)
	//*  58  141:iload           5
	//*  59  143:ifeq            183
	//*  60  146:iload           5
	//*  61  148:iconst_2        
	//*  62  149:icmpne          155
	//*  63  152:goto            183
			{
				f = f1;
	//   64  155:fload_2         
	//   65  156:fstore_1        
				if(resolutionanchor2.resolvedOffset > f1)
	//*  66  157:aload           8
	//*  67  159:getfield        #169 <Field float ResolutionAnchor.resolvedOffset>
	//*  68  162:fload_2         
	//*  69  163:fcmpl           
	//*  70  164:ifle            208
				{
					f = resolutionanchor2.resolvedOffset;
	//   71  167:aload           8
	//   72  169:getfield        #169 <Field float ResolutionAnchor.resolvedOffset>
	//   73  172:fstore_1        
					resolutionanchor1 = resolutionanchor2.resolvedTarget;
	//   74  173:aload           8
	//   75  175:getfield        #173 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
	//   76  178:astore          7
				}
			} else
	//*  77  180:goto            208
			{
				f = f1;
	//   78  183:fload_2         
	//   79  184:fstore_1        
				if(resolutionanchor2.resolvedOffset < f1)
	//*  80  185:aload           8
	//*  81  187:getfield        #169 <Field float ResolutionAnchor.resolvedOffset>
	//*  82  190:fload_2         
	//*  83  191:fcmpg           
	//*  84  192:ifge            208
				{
					f = resolutionanchor2.resolvedOffset;
	//   85  195:aload           8
	//   86  197:getfield        #169 <Field float ResolutionAnchor.resolvedOffset>
	//   87  200:fstore_1        
					resolutionanchor1 = resolutionanchor2.resolvedTarget;
	//   88  201:aload           8
	//   89  203:getfield        #173 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
	//   90  206:astore          7
				}
			}
			i++;
	//   91  208:iload_3         
	//   92  209:iconst_1        
	//   93  210:iadd            
	//   94  211:istore_3        
		}

	//   95  212:fload_1         
	//   96  213:fstore_2        
	//*  97  214:goto            106
		if(LinearSystem.getMetrics() != null)
	//*  98  217:invokestatic    #177 <Method Metrics LinearSystem.getMetrics()>
	//*  99  220:ifnull          240
		{
			Metrics metrics = LinearSystem.getMetrics();
	//  100  223:invokestatic    #177 <Method Metrics LinearSystem.getMetrics()>
	//  101  226:astore          8
			metrics.barrierConnectionResolved = metrics.barrierConnectionResolved + 1L;
	//  102  228:aload           8
	//  103  230:aload           8
	//  104  232:getfield        #183 <Field long Metrics.barrierConnectionResolved>
	//  105  235:lconst_1        
	//  106  236:ladd            
	//  107  237:putfield        #183 <Field long Metrics.barrierConnectionResolved>
		}
		resolutionanchor.resolvedTarget = resolutionanchor1;
	//  108  240:aload           6
	//  109  242:aload           7
	//  110  244:putfield        #173 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
		resolutionanchor.resolvedOffset = f1;
	//  111  247:aload           6
	//  112  249:fload_2         
	//  113  250:putfield        #169 <Field float ResolutionAnchor.resolvedOffset>
		resolutionanchor.didResolve();
	//  114  253:aload           6
	//  115  255:invokevirtual   #186 <Method void ResolutionAnchor.didResolve()>
		switch(mBarrierType)
	//* 116  258:aload_0         
	//* 117  259:getfield        #25  <Field int mBarrierType>
		{
	//* 118  262:tableswitch     0 3: default 292
	//	               0 335
	//	               1 321
	//	               2 307
	//	               3 293
		default:
			return;
	//  119  292:return          

		case 3: // '\003'
			mTop.getResolutionNode().resolve(resolutionanchor1, f1);
	//  120  293:aload_0         
	//  121  294:getfield        #48  <Field ConstraintAnchor mTop>
	//  122  297:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  123  300:aload           7
	//  124  302:fload_2         
	//  125  303:invokevirtual   #139 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
			return;
	//  126  306:return          

		case 2: // '\002'
			mBottom.getResolutionNode().resolve(resolutionanchor1, f1);
	//  127  307:aload_0         
	//  128  308:getfield        #54  <Field ConstraintAnchor mBottom>
	//  129  311:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  130  314:aload           7
	//  131  316:fload_2         
	//  132  317:invokevirtual   #139 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
			return;
	//  133  320:return          

		case 1: // '\001'
			mLeft.getResolutionNode().resolve(resolutionanchor1, f1);
	//  134  321:aload_0         
	//  135  322:getfield        #45  <Field ConstraintAnchor mLeft>
	//  136  325:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  137  328:aload           7
	//  138  330:fload_2         
	//  139  331:invokevirtual   #139 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
			return;
	//  140  334:return          

		case 0: // '\0'
			mRight.getResolutionNode().resolve(resolutionanchor1, f1);
	//  141  335:aload_0         
	//  142  336:getfield        #51  <Field ConstraintAnchor mRight>
	//  143  339:invokevirtual   #130 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  144  342:aload           7
	//  145  344:fload_2         
	//  146  345:invokevirtual   #139 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
			return;
	//  147  348:return          
		}
	}

	public void setAllowsGoneWidget(boolean flag)
	{
		mAllowsGoneWidget = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #34  <Field boolean mAllowsGoneWidget>
	//    3    5:return          
	}

	public void setBarrierType(int i)
	{
		mBarrierType = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #25  <Field int mBarrierType>
	//    3    5:return          
	}

	public static final int BOTTOM = 3;
	public static final int LEFT = 0;
	public static final int RIGHT = 1;
	public static final int TOP = 2;
	private boolean mAllowsGoneWidget;
	private int mBarrierType;
	private ArrayList mNodes;
}
