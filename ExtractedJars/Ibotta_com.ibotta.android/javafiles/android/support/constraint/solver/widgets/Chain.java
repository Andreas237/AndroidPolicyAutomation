// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.ArrayRow;
import android.support.constraint.solver.LinearSystem;
import java.util.ArrayList;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidgetContainer, ChainHead, Optimizer, ConstraintWidget, 
//			ConstraintAnchor

class Chain
{

	static void applyChainConstraints(ConstraintWidgetContainer constraintwidgetcontainer, LinearSystem linearsystem, int i)
	{
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		byte byte0;
		int j;
		ChainHead achainhead[];
		if(i == 0)
	//*   2    3:iload_2         
	//*   3    4:ifne            24
		{
			j = constraintwidgetcontainer.mHorizontalChainsSize;
	//    4    7:aload_0         
	//    5    8:getfield        #12  <Field int ConstraintWidgetContainer.mHorizontalChainsSize>
	//    6   11:istore          4
			achainhead = constraintwidgetcontainer.mHorizontalChainsArray;
	//    7   13:aload_0         
	//    8   14:getfield        #16  <Field ChainHead[] ConstraintWidgetContainer.mHorizontalChainsArray>
	//    9   17:astore          6
			byte0 = 0;
	//   10   19:iconst_0        
	//   11   20:istore_3        
		} else
	//*  12   21:goto            38
		{
			byte0 = 2;
	//   13   24:iconst_2        
	//   14   25:istore_3        
			j = constraintwidgetcontainer.mVerticalChainsSize;
	//   15   26:aload_0         
	//   16   27:getfield        #19  <Field int ConstraintWidgetContainer.mVerticalChainsSize>
	//   17   30:istore          4
			achainhead = constraintwidgetcontainer.mVerticalChainsArray;
	//   18   32:aload_0         
	//   19   33:getfield        #22  <Field ChainHead[] ConstraintWidgetContainer.mVerticalChainsArray>
	//   20   36:astore          6
		}
		for(; k < j; k++)
	//*  21   38:iload           5
	//*  22   40:iload           4
	//*  23   42:icmpge          107
		{
			ChainHead chainhead = achainhead[k];
	//   24   45:aload           6
	//   25   47:iload           5
	//   26   49:aaload          
	//   27   50:astore          7
			chainhead.define();
	//   28   52:aload           7
	//   29   54:invokevirtual   #28  <Method void ChainHead.define()>
			if(constraintwidgetcontainer.optimizeFor(4))
	//*  30   57:aload_0         
	//*  31   58:iconst_4        
	//*  32   59:invokevirtual   #32  <Method boolean ConstraintWidgetContainer.optimizeFor(int)>
	//*  33   62:ifeq            89
			{
				if(!Optimizer.applyChainOptimized(constraintwidgetcontainer, linearsystem, i, ((int) (byte0)), chainhead))
	//*  34   65:aload_0         
	//*  35   66:aload_1         
	//*  36   67:iload_2         
	//*  37   68:iload_3         
	//*  38   69:aload           7
	//*  39   71:invokestatic    #38  <Method boolean Optimizer.applyChainOptimized(ConstraintWidgetContainer, LinearSystem, int, int, ChainHead)>
	//*  40   74:ifne            98
					applyChainConstraints(constraintwidgetcontainer, linearsystem, i, ((int) (byte0)), chainhead);
	//   41   77:aload_0         
	//   42   78:aload_1         
	//   43   79:iload_2         
	//   44   80:iload_3         
	//   45   81:aload           7
	//   46   83:invokestatic    #41  <Method void applyChainConstraints(ConstraintWidgetContainer, LinearSystem, int, int, ChainHead)>
			} else
	//*  47   86:goto            98
			{
				applyChainConstraints(constraintwidgetcontainer, linearsystem, i, ((int) (byte0)), chainhead);
	//   48   89:aload_0         
	//   49   90:aload_1         
	//   50   91:iload_2         
	//   51   92:iload_3         
	//   52   93:aload           7
	//   53   95:invokestatic    #41  <Method void applyChainConstraints(ConstraintWidgetContainer, LinearSystem, int, int, ChainHead)>
			}
		}

	//   54   98:iload           5
	//   55  100:iconst_1        
	//   56  101:iadd            
	//   57  102:istore          5
	//*  58  104:goto            38
	//   59  107:return          
	}

	static void applyChainConstraints(ConstraintWidgetContainer constraintwidgetcontainer, LinearSystem linearsystem, int i, int j, ChainHead chainhead)
	{
		boolean flag1;
		boolean flag4;
		boolean flag7;
		ConstraintWidget constraintwidget1;
		ConstraintWidget constraintwidget3;
		ConstraintWidget constraintwidget4;
		ConstraintWidget constraintwidget5;
		ConstraintWidget constraintwidget6;
		Object obj10;
label0:
		{
			constraintwidget3 = chainhead.mFirst;
	//    0    0:aload           4
	//    1    2:getfield        #46  <Field ConstraintWidget ChainHead.mFirst>
	//    2    5:astore          18
			constraintwidget5 = chainhead.mLast;
	//    3    7:aload           4
	//    4    9:getfield        #49  <Field ConstraintWidget ChainHead.mLast>
	//    5   12:astore          21
			constraintwidget1 = chainhead.mFirstVisibleWidget;
	//    6   14:aload           4
	//    7   16:getfield        #52  <Field ConstraintWidget ChainHead.mFirstVisibleWidget>
	//    8   19:astore          17
			constraintwidget6 = chainhead.mLastVisibleWidget;
	//    9   21:aload           4
	//   10   23:getfield        #55  <Field ConstraintWidget ChainHead.mLastVisibleWidget>
	//   11   26:astore          22
			constraintwidget4 = chainhead.mHead;
	//   12   28:aload           4
	//   13   30:getfield        #58  <Field ConstraintWidget ChainHead.mHead>
	//   14   33:astore          19
			float f = chainhead.mTotalWeight;
	//   15   35:aload           4
	//   16   37:getfield        #62  <Field float ChainHead.mTotalWeight>
	//   17   40:fstore          5
			Object obj = ((Object) (chainhead.mFirstMatchConstraintWidget));
	//   18   42:aload           4
	//   19   44:getfield        #65  <Field ConstraintWidget ChainHead.mFirstMatchConstraintWidget>
	//   20   47:astore          15
			obj = ((Object) (chainhead.mLastMatchConstraintWidget));
	//   21   49:aload           4
	//   22   51:getfield        #68  <Field ConstraintWidget ChainHead.mLastMatchConstraintWidget>
	//   23   54:astore          15
			boolean flag5;
			if(constraintwidgetcontainer.mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//*  24   56:aload_0         
	//*  25   57:getfield        #72  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidgetContainer.mListDimensionBehaviors>
	//*  26   60:iload_2         
	//*  27   61:aaload          
	//*  28   62:getstatic       #78  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  29   65:if_acmpne       74
				flag5 = true;
	//   30   68:iconst_1        
	//   31   69:istore          12
			else
	//*  32   71:goto            77
				flag5 = false;
	//   33   74:iconst_0        
	//   34   75:istore          12
			int k;
			if(i == 0)
	//*  35   77:iload_2         
	//*  36   78:ifne            164
			{
				if(constraintwidget4.mHorizontalChainStyle == 0)
	//*  37   81:aload           19
	//*  38   83:getfield        #83  <Field int ConstraintWidget.mHorizontalChainStyle>
	//*  39   86:ifne            95
					k = 1;
	//   40   89:iconst_1        
	//   41   90:istore          8
				else
	//*  42   92:goto            98
					k = 0;
	//   43   95:iconst_0        
	//   44   96:istore          8
				if(constraintwidget4.mHorizontalChainStyle == 1)
	//*  45   98:aload           19
	//*  46  100:getfield        #83  <Field int ConstraintWidget.mHorizontalChainStyle>
	//*  47  103:iconst_1        
	//*  48  104:icmpne          113
					flag1 = true;
	//   49  107:iconst_1        
	//   50  108:istore          9
				else
	//*  51  110:goto            116
					flag1 = false;
	//   52  113:iconst_0        
	//   53  114:istore          9
				boolean flag2;
				if(constraintwidget4.mHorizontalChainStyle == 2)
	//*  54  116:aload           19
	//*  55  118:getfield        #83  <Field int ConstraintWidget.mHorizontalChainStyle>
	//*  56  121:iconst_2        
	//*  57  122:icmpne          131
					flag2 = true;
	//   58  125:iconst_1        
	//   59  126:istore          10
				else
	//*  60  128:goto            134
					flag2 = false;
	//   61  131:iconst_0        
	//   62  132:istore          10
				flag4 = ((boolean) (k));
	//   63  134:iload           8
	//   64  136:istore          11
				obj = ((Object) (constraintwidget3));
	//   65  138:aload           18
	//   66  140:astore          15
				boolean flag8 = flag1;
	//   67  142:iload           9
	//   68  144:istore          14
				k = 0;
	//   69  146:iconst_0        
	//   70  147:istore          8
				flag7 = flag2;
	//   71  149:iload           10
	//   72  151:istore          13
				flag1 = flag4;
	//   73  153:iload           11
	//   74  155:istore          9
				flag4 = flag8;
	//   75  157:iload           14
	//   76  159:istore          11
			} else
	//*  77  161:goto            240
			{
				if(constraintwidget4.mVerticalChainStyle == 0)
	//*  78  164:aload           19
	//*  79  166:getfield        #86  <Field int ConstraintWidget.mVerticalChainStyle>
	//*  80  169:ifne            178
					k = 1;
	//   81  172:iconst_1        
	//   82  173:istore          8
				else
	//*  83  175:goto            181
					k = 0;
	//   84  178:iconst_0        
	//   85  179:istore          8
				if(constraintwidget4.mVerticalChainStyle == 1)
	//*  86  181:aload           19
	//*  87  183:getfield        #86  <Field int ConstraintWidget.mVerticalChainStyle>
	//*  88  186:iconst_1        
	//*  89  187:icmpne          196
					flag1 = true;
	//   90  190:iconst_1        
	//   91  191:istore          9
				else
	//*  92  193:goto            199
					flag1 = false;
	//   93  196:iconst_0        
	//   94  197:istore          9
				boolean flag3;
				if(constraintwidget4.mVerticalChainStyle == 2)
	//*  95  199:aload           19
	//*  96  201:getfield        #86  <Field int ConstraintWidget.mVerticalChainStyle>
	//*  97  204:iconst_2        
	//*  98  205:icmpne          214
					flag3 = true;
	//   99  208:iconst_1        
	//  100  209:istore          10
				else
	//* 101  211:goto            217
					flag3 = false;
	//  102  214:iconst_0        
	//  103  215:istore          10
				obj = ((Object) (constraintwidget3));
	//  104  217:aload           18
	//  105  219:astore          15
				boolean flag9 = false;
	//  106  221:iconst_0        
	//  107  222:istore          14
				flag4 = flag1;
	//  108  224:iload           9
	//  109  226:istore          11
				flag1 = ((boolean) (k));
	//  110  228:iload           8
	//  111  230:istore          9
				flag7 = flag3;
	//  112  232:iload           10
	//  113  234:istore          13
				k = ((int) (flag9));
	//  114  236:iload           14
	//  115  238:istore          8
			}
			do
			{
				obj10 = null;
	//  116  240:aconst_null     
	//  117  241:astore          23
				Object obj8 = null;
	//  118  243:aconst_null     
	//  119  244:astore          20
				if(k)
					break;
	//  120  246:iload           8
	//  121  248:ifne            625
				Object obj3 = ((Object) (((ConstraintWidget) (obj)).mListAnchors[j]));
	//  122  251:aload           15
	//  123  253:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  124  256:iload_3         
	//  125  257:aaload          
	//  126  258:astore          16
				byte byte0;
				if(!flag5 && !flag7)
	//* 127  260:iload           12
	//* 128  262:ifne            279
	//* 129  265:iload           13
	//* 130  267:ifeq            273
	//* 131  270:goto            279
					byte0 = 4;
	//  132  273:iconst_4        
	//  133  274:istore          10
				else
	//* 134  276:goto            282
					byte0 = 1;
	//  135  279:iconst_1        
	//  136  280:istore          10
				int j3 = ((ConstraintAnchor) (obj3)).getMargin();
	//  137  282:aload           16
	//  138  284:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  139  287:istore          14
				if(((ConstraintAnchor) (obj3)).mTarget != null && obj != constraintwidget3)
	//* 140  289:aload           16
	//* 141  291:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 142  294:ifnull          320
	//* 143  297:aload           15
	//* 144  299:aload           18
	//* 145  301:if_acmpeq       320
					j3 += ((ConstraintAnchor) (obj3)).mTarget.getMargin();
	//  146  304:iload           14
	//  147  306:aload           16
	//  148  308:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  149  311:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  150  314:iadd            
	//  151  315:istore          14
	//* 152  317:goto            320
				if(flag7 && obj != constraintwidget3 && obj != constraintwidget1)
	//* 153  320:iload           13
	//* 154  322:ifeq            346
	//* 155  325:aload           15
	//* 156  327:aload           18
	//* 157  329:if_acmpeq       346
	//* 158  332:aload           15
	//* 159  334:aload           17
	//* 160  336:if_acmpeq       346
					byte0 = 6;
	//  161  339:bipush          6
	//  162  341:istore          10
				else
	//* 163  343:goto            362
				if(flag1 && flag5)
	//* 164  346:iload           9
	//* 165  348:ifeq            362
	//* 166  351:iload           12
	//* 167  353:ifeq            362
					byte0 = 4;
	//  168  356:iconst_4        
	//  169  357:istore          10
	//* 170  359:goto            362
				if(((ConstraintAnchor) (obj3)).mTarget != null)
	//* 171  362:aload           16
	//* 172  364:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 173  367:ifnull          446
				{
					if(obj == constraintwidget1)
	//* 174  370:aload           15
	//* 175  372:aload           17
	//* 176  374:if_acmpne       400
						linearsystem.addGreaterThan(((ConstraintAnchor) (obj3)).mSolverVariable, ((ConstraintAnchor) (obj3)).mTarget.mSolverVariable, j3, 5);
	//  177  377:aload_1         
	//  178  378:aload           16
	//  179  380:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  180  383:aload           16
	//  181  385:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  182  388:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  183  391:iload           14
	//  184  393:iconst_5        
	//  185  394:invokevirtual   #110 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
					else
	//* 186  397:goto            421
						linearsystem.addGreaterThan(((ConstraintAnchor) (obj3)).mSolverVariable, ((ConstraintAnchor) (obj3)).mTarget.mSolverVariable, j3, 6);
	//  187  400:aload_1         
	//  188  401:aload           16
	//  189  403:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  190  406:aload           16
	//  191  408:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  192  411:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  193  414:iload           14
	//  194  416:bipush          6
	//  195  418:invokevirtual   #110 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
					linearsystem.addEquality(((ConstraintAnchor) (obj3)).mSolverVariable, ((ConstraintAnchor) (obj3)).mTarget.mSolverVariable, j3, ((int) (byte0)));
	//  196  421:aload_1         
	//  197  422:aload           16
	//  198  424:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  199  427:aload           16
	//  200  429:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  201  432:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  202  435:iload           14
	//  203  437:iload           10
	//  204  439:invokevirtual   #114 <Method ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  205  442:pop             
				}
	//* 206  443:goto            446
				if(flag5)
	//* 207  446:iload           12
	//* 208  448:ifeq            531
				{
					if(((ConstraintWidget) (obj)).getVisibility() != 8 && ((ConstraintWidget) (obj)).mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
	//* 209  451:aload           15
	//* 210  453:invokevirtual   #117 <Method int ConstraintWidget.getVisibility()>
	//* 211  456:bipush          8
	//* 212  458:icmpeq          505
	//* 213  461:aload           15
	//* 214  463:getfield        #118 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//* 215  466:iload_2         
	//* 216  467:aaload          
	//* 217  468:getstatic       #121 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 218  471:if_acmpne       505
						linearsystem.addGreaterThan(((ConstraintWidget) (obj)).mListAnchors[j + 1].mSolverVariable, ((ConstraintWidget) (obj)).mListAnchors[j].mSolverVariable, 0, 5);
	//  219  474:aload_1         
	//  220  475:aload           15
	//  221  477:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  222  480:iload_3         
	//  223  481:iconst_1        
	//  224  482:iadd            
	//  225  483:aaload          
	//  226  484:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  227  487:aload           15
	//  228  489:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  229  492:iload_3         
	//  230  493:aaload          
	//  231  494:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  232  497:iconst_0        
	//  233  498:iconst_5        
	//  234  499:invokevirtual   #110 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//* 235  502:goto            505
					linearsystem.addGreaterThan(((ConstraintWidget) (obj)).mListAnchors[j].mSolverVariable, constraintwidgetcontainer.mListAnchors[j].mSolverVariable, 0, 6);
	//  236  505:aload_1         
	//  237  506:aload           15
	//  238  508:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  239  511:iload_3         
	//  240  512:aaload          
	//  241  513:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  242  516:aload_0         
	//  243  517:getfield        #122 <Field ConstraintAnchor[] ConstraintWidgetContainer.mListAnchors>
	//  244  520:iload_3         
	//  245  521:aaload          
	//  246  522:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  247  525:iconst_0        
	//  248  526:bipush          6
	//  249  528:invokevirtual   #110 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				}
				obj10 = ((Object) (((ConstraintWidget) (obj)).mListAnchors[j + 1].mTarget));
	//  250  531:aload           15
	//  251  533:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  252  536:iload_3         
	//  253  537:iconst_1        
	//  254  538:iadd            
	//  255  539:aaload          
	//  256  540:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  257  543:astore          23
				obj3 = ((Object) (obj8));
	//  258  545:aload           20
	//  259  547:astore          16
				if(obj10 != null)
	//* 260  549:aload           23
	//* 261  551:ifnull          607
				{
					obj10 = ((Object) (((ConstraintAnchor) (obj10)).mOwner));
	//  262  554:aload           23
	//  263  556:getfield        #125 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//  264  559:astore          23
					obj3 = ((Object) (obj8));
	//  265  561:aload           20
	//  266  563:astore          16
					if(((ConstraintWidget) (obj10)).mListAnchors[j].mTarget != null)
	//* 267  565:aload           23
	//* 268  567:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 269  570:iload_3         
	//* 270  571:aaload          
	//* 271  572:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 272  575:ifnull          607
						if(((ConstraintWidget) (obj10)).mListAnchors[j].mTarget.mOwner != obj)
	//* 273  578:aload           23
	//* 274  580:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 275  583:iload_3         
	//* 276  584:aaload          
	//* 277  585:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 278  588:getfield        #125 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//* 279  591:aload           15
	//* 280  593:if_acmpeq       603
							obj3 = ((Object) (obj8));
	//  281  596:aload           20
	//  282  598:astore          16
						else
	//* 283  600:goto            607
							obj3 = obj10;
	//  284  603:aload           23
	//  285  605:astore          16
				}
				if(obj3 != null)
	//* 286  607:aload           16
	//* 287  609:ifnull          619
					obj = obj3;
	//  288  612:aload           16
	//  289  614:astore          15
				else
	//* 290  616:goto            622
					k = 1;
	//  291  619:iconst_1        
	//  292  620:istore          8
			} while(true);
	//  293  622:goto            240
			if(constraintwidget6 != null)
	//* 294  625:aload           22
	//* 295  627:ifnull          696
			{
				ConstraintAnchor aconstraintanchor[] = constraintwidget5.mListAnchors;
	//  296  630:aload           21
	//  297  632:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  298  635:astore          15
				k = j + 1;
	//  299  637:iload_3         
	//  300  638:iconst_1        
	//  301  639:iadd            
	//  302  640:istore          8
				if(aconstraintanchor[k].mTarget != null)
	//* 303  642:aload           15
	//* 304  644:iload           8
	//* 305  646:aaload          
	//* 306  647:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 307  650:ifnull          696
				{
					aconstraintanchor = ((ConstraintAnchor []) (constraintwidget6.mListAnchors[k]));
	//  308  653:aload           22
	//  309  655:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  310  658:iload           8
	//  311  660:aaload          
	//  312  661:astore          15
					linearsystem.addLowerThan(((ConstraintAnchor) (aconstraintanchor)).mSolverVariable, constraintwidget5.mListAnchors[k].mTarget.mSolverVariable, -((ConstraintAnchor) (aconstraintanchor)).getMargin(), 5);
	//  313  663:aload_1         
	//  314  664:aload           15
	//  315  666:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  316  669:aload           21
	//  317  671:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  318  674:iload           8
	//  319  676:aaload          
	//  320  677:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  321  680:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  322  683:aload           15
	//  323  685:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  324  688:ineg            
	//  325  689:iconst_5        
	//  326  690:invokevirtual   #128 <Method void LinearSystem.addLowerThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				}
			}
	//* 327  693:goto            696
			if(flag5)
	//* 328  696:iload           12
	//* 329  698:ifeq            746
			{
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidgetcontainer.mListAnchors));
	//  330  701:aload_0         
	//  331  702:getfield        #122 <Field ConstraintAnchor[] ConstraintWidgetContainer.mListAnchors>
	//  332  705:astore_0        
				k = j + 1;
	//  333  706:iload_3         
	//  334  707:iconst_1        
	//  335  708:iadd            
	//  336  709:istore          8
				linearsystem.addGreaterThan(((ConstraintAnchor) (constraintwidgetcontainer[k])).mSolverVariable, constraintwidget5.mListAnchors[k].mSolverVariable, constraintwidget5.mListAnchors[k].getMargin(), 6);
	//  337  711:aload_1         
	//  338  712:aload_0         
	//  339  713:iload           8
	//  340  715:aaload          
	//  341  716:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  342  719:aload           21
	//  343  721:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  344  724:iload           8
	//  345  726:aaload          
	//  346  727:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  347  730:aload           21
	//  348  732:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  349  735:iload           8
	//  350  737:aaload          
	//  351  738:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  352  741:bipush          6
	//  353  743:invokevirtual   #110 <Method void LinearSystem.addGreaterThan(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
			}
			constraintwidgetcontainer = ((ConstraintWidgetContainer) (chainhead.mWeightedMatchConstraintsWidgets));
	//  354  746:aload           4
	//  355  748:getfield        #132 <Field ArrayList ChainHead.mWeightedMatchConstraintsWidgets>
	//  356  751:astore_0        
			if(constraintwidgetcontainer == null)
				break label0;
	//  357  752:aload_0         
	//  358  753:ifnull          1048
			k = ((ArrayList) (constraintwidgetcontainer)).size();
	//  359  756:aload_0         
	//  360  757:invokevirtual   #137 <Method int ArrayList.size()>
	//  361  760:istore          8
			if(k <= 1)
				break label0;
	//  362  762:iload           8
	//  363  764:iconst_1        
	//  364  765:icmple          1048
			float f3;
			if(chainhead.mHasUndefinedWeights && !chainhead.mHasComplexMatchWeights)
	//* 365  768:aload           4
	//* 366  770:getfield        #141 <Field boolean ChainHead.mHasUndefinedWeights>
	//* 367  773:ifeq            795
	//* 368  776:aload           4
	//* 369  778:getfield        #144 <Field boolean ChainHead.mHasComplexMatchWeights>
	//* 370  781:ifne            795
				f3 = chainhead.mWidgetsMatchCount;
	//  371  784:aload           4
	//  372  786:getfield        #147 <Field int ChainHead.mWidgetsMatchCount>
	//  373  789:i2f             
	//  374  790:fstore          6
			else
	//* 375  792:goto            799
				f3 = f;
	//  376  795:fload           5
	//  377  797:fstore          6
			aconstraintanchor = null;
	//  378  799:aconst_null     
	//  379  800:astore          15
			int k1 = 0;
	//  380  802:iconst_0        
	//  381  803:istore          10
			float f1;
			for(float f4 = 0.0F; k1 < k; f4 = f1)
	//* 382  805:fconst_0        
	//* 383  806:fstore          7
	//* 384  808:iload           10
	//* 385  810:iload           8
	//* 386  812:icmpge          1048
			{
label1:
				{
					ConstraintWidget constraintwidget;
label2:
					{
label3:
						{
							constraintwidget = (ConstraintWidget)((ArrayList) (constraintwidgetcontainer)).get(k1);
	//  387  815:aload_0         
	//  388  816:iload           10
	//  389  818:invokevirtual   #151 <Method Object ArrayList.get(int)>
	//  390  821:checkcast       #80  <Class ConstraintWidget>
	//  391  824:astore          16
							f1 = constraintwidget.mWeight[i];
	//  392  826:aload           16
	//  393  828:getfield        #155 <Field float[] ConstraintWidget.mWeight>
	//  394  831:iload_2         
	//  395  832:faload          
	//  396  833:fstore          5
							if(f1 < 0.0F)
	//* 397  835:fload           5
	//* 398  837:fconst_0        
	//* 399  838:fcmpg           
	//* 400  839:ifge            888
							{
								if(chainhead.mHasComplexMatchWeights)
	//* 401  842:aload           4
	//* 402  844:getfield        #144 <Field boolean ChainHead.mHasComplexMatchWeights>
	//* 403  847:ifeq            882
								{
									linearsystem.addEquality(constraintwidget.mListAnchors[j + 1].mSolverVariable, constraintwidget.mListAnchors[j].mSolverVariable, 0, 4);
	//  404  850:aload_1         
	//  405  851:aload           16
	//  406  853:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  407  856:iload_3         
	//  408  857:iconst_1        
	//  409  858:iadd            
	//  410  859:aaload          
	//  411  860:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  412  863:aload           16
	//  413  865:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  414  868:iload_3         
	//  415  869:aaload          
	//  416  870:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  417  873:iconst_0        
	//  418  874:iconst_4        
	//  419  875:invokevirtual   #114 <Method ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  420  878:pop             
									break label3;
	//  421  879:goto            925
								}
								f1 = 1.0F;
	//  422  882:fconst_1        
	//  423  883:fstore          5
							}
	//* 424  885:goto            888
							if(f1 != 0.0F)
								break label2;
	//  425  888:fload           5
	//  426  890:fconst_0        
	//  427  891:fcmpl           
	//  428  892:ifne            932
							linearsystem.addEquality(constraintwidget.mListAnchors[j + 1].mSolverVariable, constraintwidget.mListAnchors[j].mSolverVariable, 0, 6);
	//  429  895:aload_1         
	//  430  896:aload           16
	//  431  898:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  432  901:iload_3         
	//  433  902:iconst_1        
	//  434  903:iadd            
	//  435  904:aaload          
	//  436  905:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  437  908:aload           16
	//  438  910:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  439  913:iload_3         
	//  440  914:aaload          
	//  441  915:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  442  918:iconst_0        
	//  443  919:bipush          6
	//  444  921:invokevirtual   #114 <Method ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	//  445  924:pop             
						}
						f1 = f4;
	//  446  925:fload           7
	//  447  927:fstore          5
						break label1;
	//  448  929:goto            1035
					}
					if(aconstraintanchor != null)
	//* 449  932:aload           15
	//* 450  934:ifnull          1031
					{
						android.support.constraint.solver.SolverVariable solvervariable = ((ConstraintWidget) (aconstraintanchor)).mListAnchors[j].mSolverVariable;
	//  451  937:aload           15
	//  452  939:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  453  942:iload_3         
	//  454  943:aaload          
	//  455  944:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  456  947:astore          20
						aconstraintanchor = ((ConstraintWidget) (aconstraintanchor)).mListAnchors;
	//  457  949:aload           15
	//  458  951:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  459  954:astore          15
						int j2 = j + 1;
	//  460  956:iload_3         
	//  461  957:iconst_1        
	//  462  958:iadd            
	//  463  959:istore          12
						aconstraintanchor = ((ConstraintAnchor []) (aconstraintanchor[j2].mSolverVariable));
	//  464  961:aload           15
	//  465  963:iload           12
	//  466  965:aaload          
	//  467  966:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  468  969:astore          15
						android.support.constraint.solver.SolverVariable solvervariable2 = constraintwidget.mListAnchors[j].mSolverVariable;
	//  469  971:aload           16
	//  470  973:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  471  976:iload_3         
	//  472  977:aaload          
	//  473  978:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  474  981:astore          24
						android.support.constraint.solver.SolverVariable solvervariable3 = constraintwidget.mListAnchors[j2].mSolverVariable;
	//  475  983:aload           16
	//  476  985:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  477  988:iload           12
	//  478  990:aaload          
	//  479  991:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  480  994:astore          25
						ArrayRow arrayrow = linearsystem.createRow();
	//  481  996:aload_1         
	//  482  997:invokevirtual   #159 <Method ArrayRow LinearSystem.createRow()>
	//  483 1000:astore          26
						arrayrow.createRowEqualMatchDimensions(f4, f3, f1, solvervariable, ((android.support.constraint.solver.SolverVariable) (aconstraintanchor)), solvervariable2, solvervariable3);
	//  484 1002:aload           26
	//  485 1004:fload           7
	//  486 1006:fload           6
	//  487 1008:fload           5
	//  488 1010:aload           20
	//  489 1012:aload           15
	//  490 1014:aload           24
	//  491 1016:aload           25
	//  492 1018:invokevirtual   #165 <Method ArrayRow ArrayRow.createRowEqualMatchDimensions(float, float, float, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable)>
	//  493 1021:pop             
						linearsystem.addConstraint(arrayrow);
	//  494 1022:aload_1         
	//  495 1023:aload           26
	//  496 1025:invokevirtual   #169 <Method void LinearSystem.addConstraint(ArrayRow)>
					}
	//* 497 1028:goto            1031
					aconstraintanchor = ((ConstraintAnchor []) (constraintwidget));
	//  498 1031:aload           16
	//  499 1033:astore          15
				}
				k1++;
	//  500 1035:iload           10
	//  501 1037:iconst_1        
	//  502 1038:iadd            
	//  503 1039:istore          10
			}

	//  504 1041:fload           5
	//  505 1043:fstore          7
		}
	//* 506 1045:goto            808
		if(constraintwidget1 != null && (constraintwidget1 == constraintwidget6 || flag7))
	//* 507 1048:aload           17
	//* 508 1050:ifnull          1254
	//* 509 1053:aload           17
	//* 510 1055:aload           22
	//* 511 1057:if_acmpeq       1065
	//* 512 1060:iload           13
	//* 513 1062:ifeq            1254
		{
			ConstraintAnchor constraintanchor = constraintwidget3.mListAnchors[j];
	//  514 1065:aload           18
	//  515 1067:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  516 1070:iload_3         
	//  517 1071:aaload          
	//  518 1072:astore          15
			constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidget5.mListAnchors));
	//  519 1074:aload           21
	//  520 1076:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  521 1079:astore_0        
			int l = j + 1;
	//  522 1080:iload_3         
	//  523 1081:iconst_1        
	//  524 1082:iadd            
	//  525 1083:istore          8
			ConstraintAnchor constraintanchor3 = ((ConstraintAnchor) (constraintwidgetcontainer[l]));
	//  526 1085:aload_0         
	//  527 1086:iload           8
	//  528 1088:aaload          
	//  529 1089:astore          16
			if(constraintwidget3.mListAnchors[j].mTarget != null)
	//* 530 1091:aload           18
	//* 531 1093:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 532 1096:iload_3         
	//* 533 1097:aaload          
	//* 534 1098:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 535 1101:ifnull          1121
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidget3.mListAnchors[j].mTarget.mSolverVariable));
	//  536 1104:aload           18
	//  537 1106:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  538 1109:iload_3         
	//  539 1110:aaload          
	//  540 1111:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  541 1114:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  542 1117:astore_0        
			else
	//* 543 1118:goto            1123
				constraintwidgetcontainer = null;
	//  544 1121:aconst_null     
	//  545 1122:astore_0        
			if(constraintwidget5.mListAnchors[l].mTarget != null)
	//* 546 1123:aload           21
	//* 547 1125:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 548 1128:iload           8
	//* 549 1130:aaload          
	//* 550 1131:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 551 1134:ifnull          1156
				chainhead = ((ChainHead) (constraintwidget5.mListAnchors[l].mTarget.mSolverVariable));
	//  552 1137:aload           21
	//  553 1139:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  554 1142:iload           8
	//  555 1144:aaload          
	//  556 1145:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  557 1148:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  558 1151:astore          4
			else
	//* 559 1153:goto            1159
				chainhead = null;
	//  560 1156:aconst_null     
	//  561 1157:astore          4
			if(constraintwidget1 == constraintwidget6)
	//* 562 1159:aload           17
	//* 563 1161:aload           22
	//* 564 1163:if_acmpne       1185
			{
				constraintanchor = constraintwidget1.mListAnchors[j];
	//  565 1166:aload           17
	//  566 1168:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  567 1171:iload_3         
	//  568 1172:aaload          
	//  569 1173:astore          15
				constraintanchor3 = constraintwidget1.mListAnchors[l];
	//  570 1175:aload           17
	//  571 1177:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  572 1180:iload           8
	//  573 1182:aaload          
	//  574 1183:astore          16
			}
			if(constraintwidgetcontainer != null && chainhead != null)
	//* 575 1185:aload_0         
	//* 576 1186:ifnull          2260
	//* 577 1189:aload           4
	//* 578 1191:ifnull          2260
			{
				float f2;
				if(i == 0)
	//* 579 1194:iload_2         
	//* 580 1195:ifne            1208
					f2 = constraintwidget4.mHorizontalBiasPercent;
	//  581 1198:aload           19
	//  582 1200:getfield        #172 <Field float ConstraintWidget.mHorizontalBiasPercent>
	//  583 1203:fstore          5
				else
	//* 584 1205:goto            1215
					f2 = constraintwidget4.mVerticalBiasPercent;
	//  585 1208:aload           19
	//  586 1210:getfield        #175 <Field float ConstraintWidget.mVerticalBiasPercent>
	//  587 1213:fstore          5
				i = constraintanchor.getMargin();
	//  588 1215:aload           15
	//  589 1217:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  590 1220:istore_2        
				int i1 = constraintanchor3.getMargin();
	//  591 1221:aload           16
	//  592 1223:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  593 1226:istore          8
				linearsystem.addCentering(constraintanchor.mSolverVariable, ((android.support.constraint.solver.SolverVariable) (constraintwidgetcontainer)), i, f2, ((android.support.constraint.solver.SolverVariable) (chainhead)), constraintanchor3.mSolverVariable, i1, 5);
	//  594 1228:aload_1         
	//  595 1229:aload           15
	//  596 1231:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  597 1234:aload_0         
	//  598 1235:iload_2         
	//  599 1236:fload           5
	//  600 1238:aload           4
	//  601 1240:aload           16
	//  602 1242:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  603 1245:iload           8
	//  604 1247:iconst_5        
	//  605 1248:invokevirtual   #179 <Method void LinearSystem.addCentering(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, float, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
			}
		} else
	//* 606 1251:goto            2260
		if(flag1 && constraintwidget1 != null)
	//* 607 1254:iload           9
	//* 608 1256:ifeq            1726
	//* 609 1259:aload           17
	//* 610 1261:ifnull          1726
		{
			boolean flag6;
			if(chainhead.mWidgetsMatchCount > 0 && chainhead.mWidgetsCount == chainhead.mWidgetsMatchCount)
	//* 611 1264:aload           4
	//* 612 1266:getfield        #147 <Field int ChainHead.mWidgetsMatchCount>
	//* 613 1269:ifle            1291
	//* 614 1272:aload           4
	//* 615 1274:getfield        #182 <Field int ChainHead.mWidgetsCount>
	//* 616 1277:aload           4
	//* 617 1279:getfield        #147 <Field int ChainHead.mWidgetsMatchCount>
	//* 618 1282:icmpne          1291
				flag6 = true;
	//  619 1285:iconst_1        
	//  620 1286:istore          12
			else
	//* 621 1288:goto            1294
				flag6 = false;
	//  622 1291:iconst_0        
	//  623 1292:istore          12
			constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidget1));
	//  624 1294:aload           17
	//  625 1296:astore_0        
			chainhead = ((ChainHead) (constraintwidgetcontainer));
	//  626 1297:aload_0         
	//  627 1298:astore          4
			Object obj4 = ((Object) (constraintwidgetcontainer));
	//  628 1300:aload_0         
	//  629 1301:astore          16
			for(; chainhead != null; chainhead = ((ChainHead) (constraintwidgetcontainer)))
	//* 630 1303:aload           4
	//* 631 1305:ifnull          2260
			{
				ConstraintWidget constraintwidget7 = ((ConstraintWidget) (chainhead)).mListNextVisibleWidget[i];
	//  632 1308:aload           4
	//  633 1310:getfield        #186 <Field ConstraintWidget[] ConstraintWidget.mListNextVisibleWidget>
	//  634 1313:iload_2         
	//  635 1314:aaload          
	//  636 1315:astore          24
				if(constraintwidget7 != null || chainhead == constraintwidget6)
	//* 637 1317:aload           24
	//* 638 1319:ifnonnull       1335
	//* 639 1322:aload           4
	//* 640 1324:aload           22
	//* 641 1326:if_acmpne       1332
	//* 642 1329:goto            1335
	//* 643 1332:goto            1713
				{
					Object obj6 = ((Object) (((ConstraintWidget) (chainhead)).mListAnchors[j]));
	//  644 1335:aload           4
	//  645 1337:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  646 1340:iload_3         
	//  647 1341:aaload          
	//  648 1342:astore          19
					android.support.constraint.solver.SolverVariable solvervariable5 = ((ConstraintAnchor) (obj6)).mSolverVariable;
	//  649 1344:aload           19
	//  650 1346:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  651 1349:astore          26
					Object obj1;
					if(((ConstraintAnchor) (obj6)).mTarget != null)
	//* 652 1351:aload           19
	//* 653 1353:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 654 1356:ifnull          1372
						obj1 = ((Object) (((ConstraintAnchor) (obj6)).mTarget.mSolverVariable));
	//  655 1359:aload           19
	//  656 1361:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  657 1364:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  658 1367:astore          15
					else
	//* 659 1369:goto            1375
						obj1 = null;
	//  660 1372:aconst_null     
	//  661 1373:astore          15
					if(obj4 != chainhead)
	//* 662 1375:aload           16
	//* 663 1377:aload           4
	//* 664 1379:if_acmpeq       1398
					{
						constraintwidgetcontainer = ((ConstraintWidgetContainer) (((ConstraintWidget) (obj4)).mListAnchors[j + 1].mSolverVariable));
	//  665 1382:aload           16
	//  666 1384:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  667 1387:iload_3         
	//  668 1388:iconst_1        
	//  669 1389:iadd            
	//  670 1390:aaload          
	//  671 1391:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  672 1394:astore_0        
					} else
	//* 673 1395:goto            1450
					{
						constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj1));
	//  674 1398:aload           15
	//  675 1400:astore_0        
						if(chainhead == constraintwidget1)
	//* 676 1401:aload           4
	//* 677 1403:aload           17
	//* 678 1405:if_acmpne       1450
						{
							constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj1));
	//  679 1408:aload           15
	//  680 1410:astore_0        
							if(obj4 == chainhead)
	//* 681 1411:aload           16
	//* 682 1413:aload           4
	//* 683 1415:if_acmpne       1450
								if(constraintwidget3.mListAnchors[j].mTarget != null)
	//* 684 1418:aload           18
	//* 685 1420:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 686 1423:iload_3         
	//* 687 1424:aaload          
	//* 688 1425:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 689 1428:ifnull          1448
									constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidget3.mListAnchors[j].mTarget.mSolverVariable));
	//  690 1431:aload           18
	//  691 1433:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  692 1436:iload_3         
	//  693 1437:aaload          
	//  694 1438:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  695 1441:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  696 1444:astore_0        
								else
	//* 697 1445:goto            1450
									constraintwidgetcontainer = null;
	//  698 1448:aconst_null     
	//  699 1449:astore_0        
						}
					}
					int l2 = ((ConstraintAnchor) (obj6)).getMargin();
	//  700 1450:aload           19
	//  701 1452:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  702 1455:istore          13
					ConstraintAnchor aconstraintanchor1[] = ((ConstraintWidget) (chainhead)).mListAnchors;
	//  703 1457:aload           4
	//  704 1459:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  705 1462:astore          15
					int k3 = j + 1;
	//  706 1464:iload_3         
	//  707 1465:iconst_1        
	//  708 1466:iadd            
	//  709 1467:istore          14
					int l1 = aconstraintanchor1[k3].getMargin();
	//  710 1469:aload           15
	//  711 1471:iload           14
	//  712 1473:aaload          
	//  713 1474:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  714 1477:istore          10
					android.support.constraint.solver.SolverVariable solvervariable1;
					if(constraintwidget7 != null)
	//* 715 1479:aload           24
	//* 716 1481:ifnull          1516
					{
						aconstraintanchor1 = ((ConstraintAnchor []) (constraintwidget7.mListAnchors[j]));
	//  717 1484:aload           24
	//  718 1486:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  719 1489:iload_3         
	//  720 1490:aaload          
	//  721 1491:astore          15
						obj6 = ((Object) (((ConstraintAnchor) (aconstraintanchor1)).mSolverVariable));
	//  722 1493:aload           15
	//  723 1495:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  724 1498:astore          19
						solvervariable1 = ((ConstraintWidget) (chainhead)).mListAnchors[k3].mSolverVariable;
	//  725 1500:aload           4
	//  726 1502:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  727 1505:iload           14
	//  728 1507:aaload          
	//  729 1508:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  730 1511:astore          20
					} else
	//* 731 1513:goto            1568
					{
						ConstraintAnchor constraintanchor8 = constraintwidget5.mListAnchors[k3].mTarget;
	//  732 1516:aload           21
	//  733 1518:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  734 1521:iload           14
	//  735 1523:aaload          
	//  736 1524:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  737 1527:astore          25
						if(constraintanchor8 != null)
	//* 738 1529:aload           25
	//* 739 1531:ifnull          1544
							aconstraintanchor1 = ((ConstraintAnchor []) (constraintanchor8.mSolverVariable));
	//  740 1534:aload           25
	//  741 1536:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  742 1539:astore          15
						else
	//* 743 1541:goto            1547
							aconstraintanchor1 = null;
	//  744 1544:aconst_null     
	//  745 1545:astore          15
						solvervariable1 = ((ConstraintWidget) (chainhead)).mListAnchors[k3].mSolverVariable;
	//  746 1547:aload           4
	//  747 1549:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  748 1552:iload           14
	//  749 1554:aaload          
	//  750 1555:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  751 1558:astore          20
						obj6 = ((Object) (aconstraintanchor1));
	//  752 1560:aload           15
	//  753 1562:astore          19
						aconstraintanchor1 = ((ConstraintAnchor []) (constraintanchor8));
	//  754 1564:aload           25
	//  755 1566:astore          15
					}
					int j1 = l1;
	//  756 1568:iload           10
	//  757 1570:istore          8
					if(aconstraintanchor1 != null)
	//* 758 1572:aload           15
	//* 759 1574:ifnull          1587
						j1 = l1 + ((ConstraintAnchor) (aconstraintanchor1)).getMargin();
	//  760 1577:iload           10
	//  761 1579:aload           15
	//  762 1581:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  763 1584:iadd            
	//  764 1585:istore          8
					l1 = l2;
	//  765 1587:iload           13
	//  766 1589:istore          10
					if(obj4 != null)
	//* 767 1591:aload           16
	//* 768 1593:ifnull          1612
						l1 = l2 + ((ConstraintWidget) (obj4)).mListAnchors[k3].getMargin();
	//  769 1596:iload           13
	//  770 1598:aload           16
	//  771 1600:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  772 1603:iload           14
	//  773 1605:aaload          
	//  774 1606:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  775 1609:iadd            
	//  776 1610:istore          10
					if(solvervariable5 != null && constraintwidgetcontainer != null && obj6 != null && solvervariable1 != null)
	//* 777 1612:aload           26
	//* 778 1614:ifnull          1713
	//* 779 1617:aload_0         
	//* 780 1618:ifnull          1713
	//* 781 1621:aload           19
	//* 782 1623:ifnull          1713
	//* 783 1626:aload           20
	//* 784 1628:ifnull          1713
					{
						if(chainhead == constraintwidget1)
	//* 785 1631:aload           4
	//* 786 1633:aload           17
	//* 787 1635:if_acmpne       1653
							l1 = constraintwidget1.mListAnchors[j].getMargin();
	//  788 1638:aload           17
	//  789 1640:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  790 1643:iload_3         
	//  791 1644:aaload          
	//  792 1645:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  793 1648:istore          10
	//* 794 1650:goto            1653
						if(chainhead == constraintwidget6)
	//* 795 1653:aload           4
	//* 796 1655:aload           22
	//* 797 1657:if_acmpne       1676
							j1 = constraintwidget6.mListAnchors[k3].getMargin();
	//  798 1660:aload           22
	//  799 1662:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  800 1665:iload           14
	//  801 1667:aaload          
	//  802 1668:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  803 1671:istore          8
	//* 804 1673:goto            1676
						byte byte1;
						if(flag6)
	//* 805 1676:iload           12
	//* 806 1678:ifeq            1688
							byte1 = 6;
	//  807 1681:bipush          6
	//  808 1683:istore          13
						else
	//* 809 1685:goto            1691
							byte1 = 4;
	//  810 1688:iconst_4        
	//  811 1689:istore          13
						linearsystem.addCentering(solvervariable5, ((android.support.constraint.solver.SolverVariable) (constraintwidgetcontainer)), l1, 0.5F, ((android.support.constraint.solver.SolverVariable) (obj6)), solvervariable1, j1, ((int) (byte1)));
	//  812 1691:aload_1         
	//  813 1692:aload           26
	//  814 1694:aload_0         
	//  815 1695:iload           10
	//  816 1697:ldc1            #187 <Float 0.5F>
	//  817 1699:aload           19
	//  818 1701:aload           20
	//  819 1703:iload           8
	//  820 1705:iload           13
	//  821 1707:invokevirtual   #179 <Method void LinearSystem.addCentering(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, float, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
					}
				}
	//* 822 1710:goto            1713
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidget7));
	//  823 1713:aload           24
	//  824 1715:astore_0        
				obj4 = ((Object) (chainhead));
	//  825 1716:aload           4
	//  826 1718:astore          16
			}

	//  827 1720:aload_0         
	//  828 1721:astore          4
		} else
	//* 829 1723:goto            1303
		if(flag4 && constraintwidget1 != null)
	//* 830 1726:iload           11
	//* 831 1728:ifeq            2260
	//* 832 1731:aload           17
	//* 833 1733:ifnull          2260
		{
			boolean flag;
			if(chainhead.mWidgetsMatchCount > 0 && chainhead.mWidgetsCount == chainhead.mWidgetsMatchCount)
	//* 834 1736:aload           4
	//* 835 1738:getfield        #147 <Field int ChainHead.mWidgetsMatchCount>
	//* 836 1741:ifle            1763
	//* 837 1744:aload           4
	//* 838 1746:getfield        #182 <Field int ChainHead.mWidgetsCount>
	//* 839 1749:aload           4
	//* 840 1751:getfield        #147 <Field int ChainHead.mWidgetsMatchCount>
	//* 841 1754:icmpne          1763
				flag = true;
	//  842 1757:iconst_1        
	//  843 1758:istore          8
			else
	//* 844 1760:goto            1766
				flag = false;
	//  845 1763:iconst_0        
	//  846 1764:istore          8
			chainhead = ((ChainHead) (constraintwidget1));
	//  847 1766:aload           17
	//  848 1768:astore          4
			constraintwidgetcontainer = ((ConstraintWidgetContainer) (chainhead));
	//  849 1770:aload           4
	//  850 1772:astore_0        
			Object obj7 = ((Object) (chainhead));
	//  851 1773:aload           4
	//  852 1775:astore          19
			for(; constraintwidgetcontainer != null; constraintwidgetcontainer = ((ConstraintWidgetContainer) (chainhead)))
	//* 853 1777:aload_0         
	//* 854 1778:ifnull          2103
			{
				chainhead = ((ChainHead) (((ConstraintWidget) (constraintwidgetcontainer)).mListNextVisibleWidget[i]));
	//  855 1781:aload_0         
	//  856 1782:getfield        #186 <Field ConstraintWidget[] ConstraintWidget.mListNextVisibleWidget>
	//  857 1785:iload_2         
	//  858 1786:aaload          
	//  859 1787:astore          4
				if(constraintwidgetcontainer != constraintwidget1 && constraintwidgetcontainer != constraintwidget6 && chainhead != null)
	//* 860 1789:aload_0         
	//* 861 1790:aload           17
	//* 862 1792:if_acmpeq       2094
	//* 863 1795:aload_0         
	//* 864 1796:aload           22
	//* 865 1798:if_acmpeq       2094
	//* 866 1801:aload           4
	//* 867 1803:ifnull          2094
				{
					if(chainhead == constraintwidget6)
	//* 868 1806:aload           4
	//* 869 1808:aload           22
	//* 870 1810:if_acmpne       1819
						chainhead = null;
	//  871 1813:aconst_null     
	//  872 1814:astore          4
	//* 873 1816:goto            1819
					Object obj2 = ((Object) (((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[j]));
	//  874 1819:aload_0         
	//  875 1820:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  876 1823:iload_3         
	//  877 1824:aaload          
	//  878 1825:astore          15
					android.support.constraint.solver.SolverVariable solvervariable4 = ((ConstraintAnchor) (obj2)).mSolverVariable;
	//  879 1827:aload           15
	//  880 1829:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  881 1832:astore          25
					Object obj5;
					if(((ConstraintAnchor) (obj2)).mTarget != null)
	//* 882 1834:aload           15
	//* 883 1836:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 884 1839:ifnull          1852
						obj5 = ((Object) (((ConstraintAnchor) (obj2)).mTarget.mSolverVariable));
	//  885 1842:aload           15
	//  886 1844:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  887 1847:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  888 1850:astore          16
					ConstraintAnchor aconstraintanchor3[] = ((ConstraintWidget) (obj7)).mListAnchors;
	//  889 1852:aload           19
	//  890 1854:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  891 1857:astore          16
					int i3 = j + 1;
	//  892 1859:iload_3         
	//  893 1860:iconst_1        
	//  894 1861:iadd            
	//  895 1862:istore          13
					android.support.constraint.solver.SolverVariable solvervariable6 = aconstraintanchor3[i3].mSolverVariable;
	//  896 1864:aload           16
	//  897 1866:iload           13
	//  898 1868:aaload          
	//  899 1869:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  900 1872:astore          26
					int k2 = ((ConstraintAnchor) (obj2)).getMargin();
	//  901 1874:aload           15
	//  902 1876:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  903 1879:istore          12
					int i2 = ((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[i3].getMargin();
	//  904 1881:aload_0         
	//  905 1882:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  906 1885:iload           13
	//  907 1887:aaload          
	//  908 1888:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  909 1891:istore          10
					Object obj9;
					if(chainhead != null)
	//* 910 1893:aload           4
	//* 911 1895:ifnull          1941
					{
						aconstraintanchor3 = ((ConstraintAnchor []) (((ConstraintWidget) (chainhead)).mListAnchors[j]));
	//  912 1898:aload           4
	//  913 1900:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  914 1903:iload_3         
	//  915 1904:aaload          
	//  916 1905:astore          16
						obj9 = ((Object) (((ConstraintAnchor) (aconstraintanchor3)).mSolverVariable));
	//  917 1907:aload           16
	//  918 1909:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  919 1912:astore          20
						if(((ConstraintAnchor) (aconstraintanchor3)).mTarget != null)
	//* 920 1914:aload           16
	//* 921 1916:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 922 1919:ifnull          1935
							obj2 = ((Object) (((ConstraintAnchor) (aconstraintanchor3)).mTarget.mSolverVariable));
	//  923 1922:aload           16
	//  924 1924:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  925 1927:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  926 1930:astore          15
						else
	//* 927 1932:goto            1991
							obj2 = null;
	//  928 1935:aconst_null     
	//  929 1936:astore          15
					} else
	//* 930 1938:goto            1991
					{
						ConstraintAnchor constraintanchor7 = ((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[i3].mTarget;
	//  931 1941:aload_0         
	//  932 1942:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  933 1945:iload           13
	//  934 1947:aaload          
	//  935 1948:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  936 1951:astore          24
						if(constraintanchor7 != null)
	//* 937 1953:aload           24
	//* 938 1955:ifnull          1968
							aconstraintanchor3 = ((ConstraintAnchor []) (constraintanchor7.mSolverVariable));
	//  939 1958:aload           24
	//  940 1960:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  941 1963:astore          16
						else
	//* 942 1965:goto            1971
							aconstraintanchor3 = null;
	//  943 1968:aconst_null     
	//  944 1969:astore          16
						obj2 = ((Object) (((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[i3].mSolverVariable));
	//  945 1971:aload_0         
	//  946 1972:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  947 1975:iload           13
	//  948 1977:aaload          
	//  949 1978:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  950 1981:astore          15
						obj9 = ((Object) (aconstraintanchor3));
	//  951 1983:aload           16
	//  952 1985:astore          20
						aconstraintanchor3 = ((ConstraintAnchor []) (constraintanchor7));
	//  953 1987:aload           24
	//  954 1989:astore          16
					}
					if(aconstraintanchor3 != null)
	//* 955 1991:aload           16
	//* 956 1993:ifnull          2009
						i2 += ((ConstraintAnchor) (aconstraintanchor3)).getMargin();
	//  957 1996:iload           10
	//  958 1998:aload           16
	//  959 2000:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  960 2003:iadd            
	//  961 2004:istore          10
	//* 962 2006:goto            2009
					if(obj7 != null)
	//* 963 2009:aload           19
	//* 964 2011:ifnull          2033
						k2 += ((ConstraintWidget) (obj7)).mListAnchors[i3].getMargin();
	//  965 2014:iload           12
	//  966 2016:aload           19
	//  967 2018:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  968 2021:iload           13
	//  969 2023:aaload          
	//  970 2024:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	//  971 2027:iadd            
	//  972 2028:istore          12
	//* 973 2030:goto            2033
					if(flag)
	//* 974 2033:iload           8
	//* 975 2035:ifeq            2045
						i3 = 6;
	//  976 2038:bipush          6
	//  977 2040:istore          13
					else
	//* 978 2042:goto            2048
						i3 = 4;
	//  979 2045:iconst_4        
	//  980 2046:istore          13
					if(solvervariable4 != null && solvervariable6 != null && obj9 != null && obj2 != null)
	//* 981 2048:aload           25
	//* 982 2050:ifnull          2091
	//* 983 2053:aload           26
	//* 984 2055:ifnull          2091
	//* 985 2058:aload           20
	//* 986 2060:ifnull          2091
	//* 987 2063:aload           15
	//* 988 2065:ifnull          2091
						linearsystem.addCentering(solvervariable4, solvervariable6, k2, 0.5F, ((android.support.constraint.solver.SolverVariable) (obj9)), ((android.support.constraint.solver.SolverVariable) (obj2)), i2, i3);
	//  989 2068:aload_1         
	//  990 2069:aload           25
	//  991 2071:aload           26
	//  992 2073:iload           12
	//  993 2075:ldc1            #187 <Float 0.5F>
	//  994 2077:aload           20
	//  995 2079:aload           15
	//  996 2081:iload           10
	//  997 2083:iload           13
	//  998 2085:invokevirtual   #179 <Method void LinearSystem.addCentering(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, float, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
				}
	//* 999 2088:goto            2094
	//*1000 2091:goto            2094
				obj7 = ((Object) (constraintwidgetcontainer));
	// 1001 2094:aload_0         
	// 1002 2095:astore          19
			}

	// 1003 2097:aload           4
	// 1004 2099:astore_0        
	//*1005 2100:goto            1777
			constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidget1.mListAnchors[j]));
	// 1006 2103:aload           17
	// 1007 2105:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1008 2108:iload_3         
	// 1009 2109:aaload          
	// 1010 2110:astore_0        
			chainhead = ((ChainHead) (constraintwidget3.mListAnchors[j].mTarget));
	// 1011 2111:aload           18
	// 1012 2113:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1013 2116:iload_3         
	// 1014 2117:aaload          
	// 1015 2118:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	// 1016 2121:astore          4
			ConstraintAnchor aconstraintanchor2[] = constraintwidget6.mListAnchors;
	// 1017 2123:aload           22
	// 1018 2125:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1019 2128:astore          15
			i = j + 1;
	// 1020 2130:iload_3         
	// 1021 2131:iconst_1        
	// 1022 2132:iadd            
	// 1023 2133:istore_2        
			ConstraintAnchor constraintanchor1 = aconstraintanchor2[i];
	// 1024 2134:aload           15
	// 1025 2136:iload_2         
	// 1026 2137:aaload          
	// 1027 2138:astore          15
			ConstraintAnchor constraintanchor4 = constraintwidget5.mListAnchors[i].mTarget;
	// 1028 2140:aload           21
	// 1029 2142:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1030 2145:iload_2         
	// 1031 2146:aaload          
	// 1032 2147:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	// 1033 2150:astore          16
			if(chainhead != null)
	//*1034 2152:aload           4
	//*1035 2154:ifnull          2226
				if(constraintwidget1 != constraintwidget6)
	//*1036 2157:aload           17
	//*1037 2159:aload           22
	//*1038 2161:if_acmpeq       2186
					linearsystem.addEquality(((ConstraintAnchor) (constraintwidgetcontainer)).mSolverVariable, ((ConstraintAnchor) (chainhead)).mSolverVariable, ((ConstraintAnchor) (constraintwidgetcontainer)).getMargin(), 5);
	// 1039 2164:aload_1         
	// 1040 2165:aload_0         
	// 1041 2166:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1042 2169:aload           4
	// 1043 2171:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1044 2174:aload_0         
	// 1045 2175:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	// 1046 2178:iconst_5        
	// 1047 2179:invokevirtual   #114 <Method ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	// 1048 2182:pop             
				else
	//*1049 2183:goto            2226
				if(constraintanchor4 != null)
	//*1050 2186:aload           16
	//*1051 2188:ifnull          2226
					linearsystem.addCentering(((ConstraintAnchor) (constraintwidgetcontainer)).mSolverVariable, ((ConstraintAnchor) (chainhead)).mSolverVariable, ((ConstraintAnchor) (constraintwidgetcontainer)).getMargin(), 0.5F, constraintanchor1.mSolverVariable, constraintanchor4.mSolverVariable, constraintanchor1.getMargin(), 5);
	// 1052 2191:aload_1         
	// 1053 2192:aload_0         
	// 1054 2193:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1055 2196:aload           4
	// 1056 2198:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1057 2201:aload_0         
	// 1058 2202:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	// 1059 2205:ldc1            #187 <Float 0.5F>
	// 1060 2207:aload           15
	// 1061 2209:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1062 2212:aload           16
	// 1063 2214:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1064 2217:aload           15
	// 1065 2219:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	// 1066 2222:iconst_5        
	// 1067 2223:invokevirtual   #179 <Method void LinearSystem.addCentering(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, float, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
			if(constraintanchor4 != null && constraintwidget1 != constraintwidget6)
	//*1068 2226:aload           16
	//*1069 2228:ifnull          2260
	//*1070 2231:aload           17
	//*1071 2233:aload           22
	//*1072 2235:if_acmpeq       2260
				linearsystem.addEquality(constraintanchor1.mSolverVariable, constraintanchor4.mSolverVariable, -constraintanchor1.getMargin(), 5);
	// 1073 2238:aload_1         
	// 1074 2239:aload           15
	// 1075 2241:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1076 2244:aload           16
	// 1077 2246:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1078 2249:aload           15
	// 1079 2251:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	// 1080 2254:ineg            
	// 1081 2255:iconst_5        
	// 1082 2256:invokevirtual   #114 <Method ArrayRow LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
	// 1083 2259:pop             
		}
		if((flag1 || flag4) && constraintwidget1 != null)
	//*1084 2260:iload           9
	//*1085 2262:ifne            2270
	//*1086 2265:iload           11
	//*1087 2267:ifeq            2473
	//*1088 2270:aload           17
	//*1089 2272:ifnull          2473
		{
			ConstraintAnchor constraintanchor2 = constraintwidget1.mListAnchors[j];
	// 1090 2275:aload           17
	// 1091 2277:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1092 2280:iload_3         
	// 1093 2281:aaload          
	// 1094 2282:astore          15
			constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidget6.mListAnchors));
	// 1095 2284:aload           22
	// 1096 2286:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1097 2289:astore_0        
			i = j + 1;
	// 1098 2290:iload_3         
	// 1099 2291:iconst_1        
	// 1100 2292:iadd            
	// 1101 2293:istore_2        
			ConstraintAnchor constraintanchor5 = ((ConstraintAnchor) (constraintwidgetcontainer[i]));
	// 1102 2294:aload_0         
	// 1103 2295:iload_2         
	// 1104 2296:aaload          
	// 1105 2297:astore          16
			if(constraintanchor2.mTarget != null)
	//*1106 2299:aload           15
	//*1107 2301:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*1108 2304:ifnull          2320
				chainhead = ((ChainHead) (constraintanchor2.mTarget.mSolverVariable));
	// 1109 2307:aload           15
	// 1110 2309:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	// 1111 2312:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1112 2315:astore          4
			else
	//*1113 2317:goto            2323
				chainhead = null;
	// 1114 2320:aconst_null     
	// 1115 2321:astore          4
			if(constraintanchor5.mTarget != null)
	//*1116 2323:aload           16
	//*1117 2325:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*1118 2328:ifnull          2343
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintanchor5.mTarget.mSolverVariable));
	// 1119 2331:aload           16
	// 1120 2333:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	// 1121 2336:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1122 2339:astore_0        
			else
	//*1123 2340:goto            2345
				constraintwidgetcontainer = null;
	// 1124 2343:aconst_null     
	// 1125 2344:astore_0        
			if(constraintwidget5 != constraintwidget6)
	//*1126 2345:aload           21
	//*1127 2347:aload           22
	//*1128 2349:if_acmpeq       2384
			{
				ConstraintAnchor constraintanchor6 = constraintwidget5.mListAnchors[i];
	// 1129 2352:aload           21
	// 1130 2354:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1131 2357:iload_2         
	// 1132 2358:aaload          
	// 1133 2359:astore          18
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj10));
	// 1134 2361:aload           23
	// 1135 2363:astore_0        
				if(constraintanchor6.mTarget != null)
	//*1136 2364:aload           18
	//*1137 2366:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*1138 2369:ifnull          2381
					constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintanchor6.mTarget.mSolverVariable));
	// 1139 2372:aload           18
	// 1140 2374:getfield        #100 <Field ConstraintAnchor ConstraintAnchor.mTarget>
	// 1141 2377:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1142 2380:astore_0        
			}
	//*1143 2381:goto            2384
			if(constraintwidget1 == constraintwidget6)
	//*1144 2384:aload           17
	//*1145 2386:aload           22
	//*1146 2388:if_acmpne       2409
			{
				constraintanchor2 = constraintwidget1.mListAnchors[j];
	// 1147 2391:aload           17
	// 1148 2393:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1149 2396:iload_3         
	// 1150 2397:aaload          
	// 1151 2398:astore          15
				constraintanchor5 = constraintwidget1.mListAnchors[i];
	// 1152 2400:aload           17
	// 1153 2402:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1154 2405:iload_2         
	// 1155 2406:aaload          
	// 1156 2407:astore          16
			}
			if(chainhead != null && constraintwidgetcontainer != null)
	//*1157 2409:aload           4
	//*1158 2411:ifnull          2473
	//*1159 2414:aload_0         
	//*1160 2415:ifnull          2473
			{
				j = constraintanchor2.getMargin();
	// 1161 2418:aload           15
	// 1162 2420:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	// 1163 2423:istore_3        
				ConstraintWidget constraintwidget2;
				if(constraintwidget6 == null)
	//*1164 2424:aload           22
	//*1165 2426:ifnonnull       2436
					constraintwidget2 = constraintwidget5;
	// 1166 2429:aload           21
	// 1167 2431:astore          17
				else
	//*1168 2433:goto            2440
					constraintwidget2 = constraintwidget6;
	// 1169 2436:aload           22
	// 1170 2438:astore          17
				i = constraintwidget2.mListAnchors[i].getMargin();
	// 1171 2440:aload           17
	// 1172 2442:getfield        #90  <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	// 1173 2445:iload_2         
	// 1174 2446:aaload          
	// 1175 2447:invokevirtual   #96  <Method int ConstraintAnchor.getMargin()>
	// 1176 2450:istore_2        
				linearsystem.addCentering(constraintanchor2.mSolverVariable, ((android.support.constraint.solver.SolverVariable) (chainhead)), j, 0.5F, ((android.support.constraint.solver.SolverVariable) (constraintwidgetcontainer)), constraintanchor5.mSolverVariable, i, 5);
	// 1177 2451:aload_1         
	// 1178 2452:aload           15
	// 1179 2454:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1180 2457:aload           4
	// 1181 2459:iload_3         
	// 1182 2460:ldc1            #187 <Float 0.5F>
	// 1183 2462:aload_0         
	// 1184 2463:aload           16
	// 1185 2465:getfield        #104 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	// 1186 2468:iload_2         
	// 1187 2469:iconst_5        
	// 1188 2470:invokevirtual   #179 <Method void LinearSystem.addCentering(android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, float, android.support.constraint.solver.SolverVariable, android.support.constraint.solver.SolverVariable, int, int)>
			}
		}
	// 1189 2473:return          
	}
}
