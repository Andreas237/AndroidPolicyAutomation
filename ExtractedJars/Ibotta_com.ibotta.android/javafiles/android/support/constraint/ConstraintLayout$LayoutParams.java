// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.Guideline;
import android.util.*;

// Referenced classes of package android.support.constraint:
//			ConstraintLayout

public static class ConstraintLayout$LayoutParams extends android.view.ViewGroup.MarginLayoutParams
{
	private static class Table
	{

		public static final SparseIntArray map;

		static 
		{
			map = new SparseIntArray();
		//    0    0:new             #16  <Class SparseIntArray>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void SparseIntArray()>
		//    3    7:putstatic       #21  <Field SparseIntArray map>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
		//    4   10:getstatic       #21  <Field SparseIntArray map>
		//    5   13:getstatic       #27  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf>
		//    6   16:bipush          8
		//    7   18:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
		//    8   21:getstatic       #21  <Field SparseIntArray map>
		//    9   24:getstatic       #34  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf>
		//   10   27:bipush          9
		//   11   29:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
		//   12   32:getstatic       #21  <Field SparseIntArray map>
		//   13   35:getstatic       #37  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf>
		//   14   38:bipush          10
		//   15   40:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
		//   16   43:getstatic       #21  <Field SparseIntArray map>
		//   17   46:getstatic       #40  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf>
		//   18   49:bipush          11
		//   19   51:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
		//   20   54:getstatic       #21  <Field SparseIntArray map>
		//   21   57:getstatic       #43  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf>
		//   22   60:bipush          12
		//   23   62:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
		//   24   65:getstatic       #21  <Field SparseIntArray map>
		//   25   68:getstatic       #46  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf>
		//   26   71:bipush          13
		//   27   73:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
		//   28   76:getstatic       #21  <Field SparseIntArray map>
		//   29   79:getstatic       #49  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf>
		//   30   82:bipush          14
		//   31   84:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
		//   32   87:getstatic       #21  <Field SparseIntArray map>
		//   33   90:getstatic       #52  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf>
		//   34   93:bipush          15
		//   35   95:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
		//   36   98:getstatic       #21  <Field SparseIntArray map>
		//   37  101:getstatic       #55  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf>
		//   38  104:bipush          16
		//   39  106:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
		//   40  109:getstatic       #21  <Field SparseIntArray map>
		//   41  112:getstatic       #58  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintCircle>
		//   42  115:iconst_2        
		//   43  116:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
		//   44  119:getstatic       #21  <Field SparseIntArray map>
		//   45  122:getstatic       #61  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintCircleRadius>
		//   46  125:iconst_3        
		//   47  126:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
		//   48  129:getstatic       #21  <Field SparseIntArray map>
		//   49  132:getstatic       #64  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintCircleAngle>
		//   50  135:iconst_4        
		//   51  136:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
		//   52  139:getstatic       #21  <Field SparseIntArray map>
		//   53  142:getstatic       #67  <Field int R$styleable.ConstraintLayout_Layout_layout_editor_absoluteX>
		//   54  145:bipush          49
		//   55  147:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
		//   56  150:getstatic       #21  <Field SparseIntArray map>
		//   57  153:getstatic       #70  <Field int R$styleable.ConstraintLayout_Layout_layout_editor_absoluteY>
		//   58  156:bipush          50
		//   59  158:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
		//   60  161:getstatic       #21  <Field SparseIntArray map>
		//   61  164:getstatic       #73  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintGuide_begin>
		//   62  167:iconst_5        
		//   63  168:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
		//   64  171:getstatic       #21  <Field SparseIntArray map>
		//   65  174:getstatic       #76  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintGuide_end>
		//   66  177:bipush          6
		//   67  179:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
		//   68  182:getstatic       #21  <Field SparseIntArray map>
		//   69  185:getstatic       #79  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintGuide_percent>
		//   70  188:bipush          7
		//   71  190:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
		//   72  193:getstatic       #21  <Field SparseIntArray map>
		//   73  196:getstatic       #82  <Field int R$styleable.ConstraintLayout_Layout_android_orientation>
		//   74  199:iconst_1        
		//   75  200:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
		//   76  203:getstatic       #21  <Field SparseIntArray map>
		//   77  206:getstatic       #85  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf>
		//   78  209:bipush          17
		//   79  211:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
		//   80  214:getstatic       #21  <Field SparseIntArray map>
		//   81  217:getstatic       #88  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf>
		//   82  220:bipush          18
		//   83  222:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
		//   84  225:getstatic       #21  <Field SparseIntArray map>
		//   85  228:getstatic       #91  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf>
		//   86  231:bipush          19
		//   87  233:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
		//   88  236:getstatic       #21  <Field SparseIntArray map>
		//   89  239:getstatic       #94  <Field int R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf>
		//   90  242:bipush          20
		//   91  244:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
		//   92  247:getstatic       #21  <Field SparseIntArray map>
		//   93  250:getstatic       #97  <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginLeft>
		//   94  253:bipush          21
		//   95  255:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
		//   96  258:getstatic       #21  <Field SparseIntArray map>
		//   97  261:getstatic       #100 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginTop>
		//   98  264:bipush          22
		//   99  266:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
		//  100  269:getstatic       #21  <Field SparseIntArray map>
		//  101  272:getstatic       #103 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginRight>
		//  102  275:bipush          23
		//  103  277:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
		//  104  280:getstatic       #21  <Field SparseIntArray map>
		//  105  283:getstatic       #106 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginBottom>
		//  106  286:bipush          24
		//  107  288:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
		//  108  291:getstatic       #21  <Field SparseIntArray map>
		//  109  294:getstatic       #109 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginStart>
		//  110  297:bipush          25
		//  111  299:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
		//  112  302:getstatic       #21  <Field SparseIntArray map>
		//  113  305:getstatic       #112 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginEnd>
		//  114  308:bipush          26
		//  115  310:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
		//  116  313:getstatic       #21  <Field SparseIntArray map>
		//  117  316:getstatic       #115 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias>
		//  118  319:bipush          29
		//  119  321:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
		//  120  324:getstatic       #21  <Field SparseIntArray map>
		//  121  327:getstatic       #118 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintVertical_bias>
		//  122  330:bipush          30
		//  123  332:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
		//  124  335:getstatic       #21  <Field SparseIntArray map>
		//  125  338:getstatic       #121 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio>
		//  126  341:bipush          44
		//  127  343:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
		//  128  346:getstatic       #21  <Field SparseIntArray map>
		//  129  349:getstatic       #124 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight>
		//  130  352:bipush          45
		//  131  354:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
		//  132  357:getstatic       #21  <Field SparseIntArray map>
		//  133  360:getstatic       #127 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintVertical_weight>
		//  134  363:bipush          46
		//  135  365:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
		//  136  368:getstatic       #21  <Field SparseIntArray map>
		//  137  371:getstatic       #130 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle>
		//  138  374:bipush          47
		//  139  376:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
		//  140  379:getstatic       #21  <Field SparseIntArray map>
		//  141  382:getstatic       #133 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle>
		//  142  385:bipush          48
		//  143  387:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
		//  144  390:getstatic       #21  <Field SparseIntArray map>
		//  145  393:getstatic       #136 <Field int R$styleable.ConstraintLayout_Layout_layout_constrainedWidth>
		//  146  396:bipush          27
		//  147  398:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
		//  148  401:getstatic       #21  <Field SparseIntArray map>
		//  149  404:getstatic       #139 <Field int R$styleable.ConstraintLayout_Layout_layout_constrainedHeight>
		//  150  407:bipush          28
		//  151  409:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
		//  152  412:getstatic       #21  <Field SparseIntArray map>
		//  153  415:getstatic       #142 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintWidth_default>
		//  154  418:bipush          31
		//  155  420:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
		//  156  423:getstatic       #21  <Field SparseIntArray map>
		//  157  426:getstatic       #145 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHeight_default>
		//  158  429:bipush          32
		//  159  431:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
		//  160  434:getstatic       #21  <Field SparseIntArray map>
		//  161  437:getstatic       #148 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintWidth_min>
		//  162  440:bipush          33
		//  163  442:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
		//  164  445:getstatic       #21  <Field SparseIntArray map>
		//  165  448:getstatic       #151 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintWidth_max>
		//  166  451:bipush          34
		//  167  453:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
		//  168  456:getstatic       #21  <Field SparseIntArray map>
		//  169  459:getstatic       #154 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintWidth_percent>
		//  170  462:bipush          35
		//  171  464:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
		//  172  467:getstatic       #21  <Field SparseIntArray map>
		//  173  470:getstatic       #157 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHeight_min>
		//  174  473:bipush          36
		//  175  475:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
		//  176  478:getstatic       #21  <Field SparseIntArray map>
		//  177  481:getstatic       #160 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHeight_max>
		//  178  484:bipush          37
		//  179  486:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
		//  180  489:getstatic       #21  <Field SparseIntArray map>
		//  181  492:getstatic       #163 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHeight_percent>
		//  182  495:bipush          38
		//  183  497:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
		//  184  500:getstatic       #21  <Field SparseIntArray map>
		//  185  503:getstatic       #166 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintLeft_creator>
		//  186  506:bipush          39
		//  187  508:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
		//  188  511:getstatic       #21  <Field SparseIntArray map>
		//  189  514:getstatic       #169 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintTop_creator>
		//  190  517:bipush          40
		//  191  519:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
		//  192  522:getstatic       #21  <Field SparseIntArray map>
		//  193  525:getstatic       #172 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintRight_creator>
		//  194  528:bipush          41
		//  195  530:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
		//  196  533:getstatic       #21  <Field SparseIntArray map>
		//  197  536:getstatic       #175 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBottom_creator>
		//  198  539:bipush          42
		//  199  541:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
			map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
		//  200  544:getstatic       #21  <Field SparseIntArray map>
		//  201  547:getstatic       #178 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator>
		//  202  550:bipush          43
		//  203  552:invokevirtual   #31  <Method void SparseIntArray.append(int, int)>
		//* 204  555:return          
		}
	}


	public void resolveLayoutDirection(int i)
	{
		int k = leftMargin;
	//    0    0:aload_0         
	//    1    1:getfield        #348 <Field int leftMargin>
	//    2    4:istore          4
		int l = rightMargin;
	//    3    6:aload_0         
	//    4    7:getfield        #351 <Field int rightMargin>
	//    5   10:istore          5
		super.resolveLayoutDirection(i);
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:invokespecial   #353 <Method void android.view.ViewGroup$MarginLayoutParams.resolveLayoutDirection(int)>
		resolvedRightToLeft = -1;
	//    9   17:aload_0         
	//   10   18:iconst_m1       
	//   11   19:putfield        #198 <Field int resolvedRightToLeft>
		resolvedRightToRight = -1;
	//   12   22:aload_0         
	//   13   23:iconst_m1       
	//   14   24:putfield        #200 <Field int resolvedRightToRight>
		resolvedLeftToLeft = -1;
	//   15   27:aload_0         
	//   16   28:iconst_m1       
	//   17   29:putfield        #194 <Field int resolvedLeftToLeft>
		resolvedLeftToRight = -1;
	//   18   32:aload_0         
	//   19   33:iconst_m1       
	//   20   34:putfield        #196 <Field int resolvedLeftToRight>
		resolveGoneLeftMargin = -1;
	//   21   37:aload_0         
	//   22   38:iconst_m1       
	//   23   39:putfield        #202 <Field int resolveGoneLeftMargin>
		resolveGoneRightMargin = -1;
	//   24   42:aload_0         
	//   25   43:iconst_m1       
	//   26   44:putfield        #204 <Field int resolveGoneRightMargin>
		resolveGoneLeftMargin = goneLeftMargin;
	//   27   47:aload_0         
	//   28   48:aload_0         
	//   29   49:getfield        #125 <Field int goneLeftMargin>
	//   30   52:putfield        #202 <Field int resolveGoneLeftMargin>
		resolveGoneRightMargin = goneRightMargin;
	//   31   55:aload_0         
	//   32   56:aload_0         
	//   33   57:getfield        #129 <Field int goneRightMargin>
	//   34   60:putfield        #204 <Field int resolveGoneRightMargin>
		resolvedHorizontalBias = horizontalBias;
	//   35   63:aload_0         
	//   36   64:aload_0         
	//   37   65:getfield        #138 <Field float horizontalBias>
	//   38   68:putfield        #206 <Field float resolvedHorizontalBias>
		resolvedGuideBegin = guideBegin;
	//   39   71:aload_0         
	//   40   72:aload_0         
	//   41   73:getfield        #86  <Field int guideBegin>
	//   42   76:putfield        #355 <Field int resolvedGuideBegin>
		resolvedGuideEnd = guideEnd;
	//   43   79:aload_0         
	//   44   80:aload_0         
	//   45   81:getfield        #88  <Field int guideEnd>
	//   46   84:putfield        #357 <Field int resolvedGuideEnd>
		resolvedGuidePercent = guidePercent;
	//   47   87:aload_0         
	//   48   88:aload_0         
	//   49   89:getfield        #91  <Field float guidePercent>
	//   50   92:putfield        #359 <Field float resolvedGuidePercent>
		i = getLayoutDirection();
	//   51   95:aload_0         
	//   52   96:invokevirtual   #362 <Method int getLayoutDirection()>
	//   53   99:istore_1        
		int j = 0;
	//   54  100:iconst_0        
	//   55  101:istore_3        
		if(1 == i)
	//*  56  102:iconst_1        
	//*  57  103:iload_1         
	//*  58  104:icmpne          112
			i = 1;
	//   59  107:iconst_1        
	//   60  108:istore_1        
		else
	//*  61  109:goto            114
			i = 0;
	//   62  112:iconst_0        
	//   63  113:istore_1        
		if(i != 0)
	//*  64  114:iload_1         
	//*  65  115:ifeq            343
		{
			i = startToEnd;
	//   66  118:aload_0         
	//   67  119:getfield        #117 <Field int startToEnd>
	//   68  122:istore_1        
			if(i != -1)
	//*  69  123:iload_1         
	//*  70  124:iconst_m1       
	//*  71  125:icmpeq          138
			{
				resolvedRightToLeft = i;
	//   72  128:aload_0         
	//   73  129:iload_1         
	//   74  130:putfield        #198 <Field int resolvedRightToLeft>
				i = 1;
	//   75  133:iconst_1        
	//   76  134:istore_1        
			} else
	//*  77  135:goto            160
			{
				int i1 = startToStart;
	//   78  138:aload_0         
	//   79  139:getfield        #119 <Field int startToStart>
	//   80  142:istore          6
				i = j;
	//   81  144:iload_3         
	//   82  145:istore_1        
				if(i1 != -1)
	//*  83  146:iload           6
	//*  84  148:iconst_m1       
	//*  85  149:icmpeq          160
				{
					resolvedRightToRight = i1;
	//   86  152:aload_0         
	//   87  153:iload           6
	//   88  155:putfield        #200 <Field int resolvedRightToRight>
					i = 1;
	//   89  158:iconst_1        
	//   90  159:istore_1        
				}
			}
			j = endToStart;
	//   91  160:aload_0         
	//   92  161:getfield        #121 <Field int endToStart>
	//   93  164:istore_3        
			if(j != -1)
	//*  94  165:iload_3         
	//*  95  166:iconst_m1       
	//*  96  167:icmpeq          177
			{
				resolvedLeftToRight = j;
	//   97  170:aload_0         
	//   98  171:iload_3         
	//   99  172:putfield        #196 <Field int resolvedLeftToRight>
				i = 1;
	//  100  175:iconst_1        
	//  101  176:istore_1        
			}
			j = endToEnd;
	//  102  177:aload_0         
	//  103  178:getfield        #123 <Field int endToEnd>
	//  104  181:istore_3        
			if(j != -1)
	//* 105  182:iload_3         
	//* 106  183:iconst_m1       
	//* 107  184:icmpeq          194
			{
				resolvedLeftToLeft = j;
	//  108  187:aload_0         
	//  109  188:iload_3         
	//  110  189:putfield        #194 <Field int resolvedLeftToLeft>
				i = 1;
	//  111  192:iconst_1        
	//  112  193:istore_1        
			}
			j = goneStartMargin;
	//  113  194:aload_0         
	//  114  195:getfield        #133 <Field int goneStartMargin>
	//  115  198:istore_3        
			if(j != -1)
	//* 116  199:iload_3         
	//* 117  200:iconst_m1       
	//* 118  201:icmpeq          209
				resolveGoneRightMargin = j;
	//  119  204:aload_0         
	//  120  205:iload_3         
	//  121  206:putfield        #204 <Field int resolveGoneRightMargin>
			j = goneEndMargin;
	//  122  209:aload_0         
	//  123  210:getfield        #135 <Field int goneEndMargin>
	//  124  213:istore_3        
			if(j != -1)
	//* 125  214:iload_3         
	//* 126  215:iconst_m1       
	//* 127  216:icmpeq          224
				resolveGoneLeftMargin = j;
	//  128  219:aload_0         
	//  129  220:iload_3         
	//  130  221:putfield        #202 <Field int resolveGoneLeftMargin>
			if(i != 0)
	//* 131  224:iload_1         
	//* 132  225:ifeq            238
				resolvedHorizontalBias = 1.0F - horizontalBias;
	//  133  228:aload_0         
	//  134  229:fconst_1        
	//  135  230:aload_0         
	//  136  231:getfield        #138 <Field float horizontalBias>
	//  137  234:fsub            
	//  138  235:putfield        #206 <Field float resolvedHorizontalBias>
			if(isGuideline && orientation == 1)
	//* 139  238:aload_0         
	//* 140  239:getfield        #188 <Field boolean isGuideline>
	//* 141  242:ifeq            433
	//* 142  245:aload_0         
	//* 143  246:getfield        #176 <Field int orientation>
	//* 144  249:iconst_1        
	//* 145  250:icmpne          433
			{
				float f = guidePercent;
	//  146  253:aload_0         
	//  147  254:getfield        #91  <Field float guidePercent>
	//  148  257:fstore_2        
				if(f != -1F)
	//* 149  258:fload_2         
	//* 150  259:ldc1            #89  <Float -1F>
	//* 151  261:fcmpl           
	//* 152  262:ifeq            285
				{
					resolvedGuidePercent = 1.0F - f;
	//  153  265:aload_0         
	//  154  266:fconst_1        
	//  155  267:fload_2         
	//  156  268:fsub            
	//  157  269:putfield        #359 <Field float resolvedGuidePercent>
					resolvedGuideBegin = -1;
	//  158  272:aload_0         
	//  159  273:iconst_m1       
	//  160  274:putfield        #355 <Field int resolvedGuideBegin>
					resolvedGuideEnd = -1;
	//  161  277:aload_0         
	//  162  278:iconst_m1       
	//  163  279:putfield        #357 <Field int resolvedGuideEnd>
				} else
	//* 164  282:goto            433
				{
					i = guideBegin;
	//  165  285:aload_0         
	//  166  286:getfield        #86  <Field int guideBegin>
	//  167  289:istore_1        
					if(i != -1)
	//* 168  290:iload_1         
	//* 169  291:iconst_m1       
	//* 170  292:icmpeq          314
					{
						resolvedGuideEnd = i;
	//  171  295:aload_0         
	//  172  296:iload_1         
	//  173  297:putfield        #357 <Field int resolvedGuideEnd>
						resolvedGuideBegin = -1;
	//  174  300:aload_0         
	//  175  301:iconst_m1       
	//  176  302:putfield        #355 <Field int resolvedGuideBegin>
						resolvedGuidePercent = -1F;
	//  177  305:aload_0         
	//  178  306:ldc1            #89  <Float -1F>
	//  179  308:putfield        #359 <Field float resolvedGuidePercent>
					} else
	//* 180  311:goto            433
					{
						i = guideEnd;
	//  181  314:aload_0         
	//  182  315:getfield        #88  <Field int guideEnd>
	//  183  318:istore_1        
						if(i != -1)
	//* 184  319:iload_1         
	//* 185  320:iconst_m1       
	//* 186  321:icmpeq          433
						{
							resolvedGuideBegin = i;
	//  187  324:aload_0         
	//  188  325:iload_1         
	//  189  326:putfield        #355 <Field int resolvedGuideBegin>
							resolvedGuideEnd = -1;
	//  190  329:aload_0         
	//  191  330:iconst_m1       
	//  192  331:putfield        #357 <Field int resolvedGuideEnd>
							resolvedGuidePercent = -1F;
	//  193  334:aload_0         
	//  194  335:ldc1            #89  <Float -1F>
	//  195  337:putfield        #359 <Field float resolvedGuidePercent>
						}
					}
				}
			}
		} else
	//* 196  340:goto            433
		{
			i = startToEnd;
	//  197  343:aload_0         
	//  198  344:getfield        #117 <Field int startToEnd>
	//  199  347:istore_1        
			if(i != -1)
	//* 200  348:iload_1         
	//* 201  349:iconst_m1       
	//* 202  350:icmpeq          358
				resolvedLeftToRight = i;
	//  203  353:aload_0         
	//  204  354:iload_1         
	//  205  355:putfield        #196 <Field int resolvedLeftToRight>
			i = startToStart;
	//  206  358:aload_0         
	//  207  359:getfield        #119 <Field int startToStart>
	//  208  362:istore_1        
			if(i != -1)
	//* 209  363:iload_1         
	//* 210  364:iconst_m1       
	//* 211  365:icmpeq          373
				resolvedLeftToLeft = i;
	//  212  368:aload_0         
	//  213  369:iload_1         
	//  214  370:putfield        #194 <Field int resolvedLeftToLeft>
			i = endToStart;
	//  215  373:aload_0         
	//  216  374:getfield        #121 <Field int endToStart>
	//  217  377:istore_1        
			if(i != -1)
	//* 218  378:iload_1         
	//* 219  379:iconst_m1       
	//* 220  380:icmpeq          388
				resolvedRightToLeft = i;
	//  221  383:aload_0         
	//  222  384:iload_1         
	//  223  385:putfield        #198 <Field int resolvedRightToLeft>
			i = endToEnd;
	//  224  388:aload_0         
	//  225  389:getfield        #123 <Field int endToEnd>
	//  226  392:istore_1        
			if(i != -1)
	//* 227  393:iload_1         
	//* 228  394:iconst_m1       
	//* 229  395:icmpeq          403
				resolvedRightToRight = i;
	//  230  398:aload_0         
	//  231  399:iload_1         
	//  232  400:putfield        #200 <Field int resolvedRightToRight>
			i = goneStartMargin;
	//  233  403:aload_0         
	//  234  404:getfield        #133 <Field int goneStartMargin>
	//  235  407:istore_1        
			if(i != -1)
	//* 236  408:iload_1         
	//* 237  409:iconst_m1       
	//* 238  410:icmpeq          418
				resolveGoneLeftMargin = i;
	//  239  413:aload_0         
	//  240  414:iload_1         
	//  241  415:putfield        #202 <Field int resolveGoneLeftMargin>
			i = goneEndMargin;
	//  242  418:aload_0         
	//  243  419:getfield        #135 <Field int goneEndMargin>
	//  244  422:istore_1        
			if(i != -1)
	//* 245  423:iload_1         
	//* 246  424:iconst_m1       
	//* 247  425:icmpeq          433
				resolveGoneRightMargin = i;
	//  248  428:aload_0         
	//  249  429:iload_1         
	//  250  430:putfield        #204 <Field int resolveGoneRightMargin>
		}
		if(endToStart == -1 && endToEnd == -1 && startToStart == -1 && startToEnd == -1)
	//* 251  433:aload_0         
	//* 252  434:getfield        #121 <Field int endToStart>
	//* 253  437:iconst_m1       
	//* 254  438:icmpne          601
	//* 255  441:aload_0         
	//* 256  442:getfield        #123 <Field int endToEnd>
	//* 257  445:iconst_m1       
	//* 258  446:icmpne          601
	//* 259  449:aload_0         
	//* 260  450:getfield        #119 <Field int startToStart>
	//* 261  453:iconst_m1       
	//* 262  454:icmpne          601
	//* 263  457:aload_0         
	//* 264  458:getfield        #117 <Field int startToEnd>
	//* 265  461:iconst_m1       
	//* 266  462:icmpne          601
		{
			i = rightToLeft;
	//  267  465:aload_0         
	//  268  466:getfield        #97  <Field int rightToLeft>
	//  269  469:istore_1        
			if(i != -1)
	//* 270  470:iload_1         
	//* 271  471:iconst_m1       
	//* 272  472:icmpeq          501
			{
				resolvedRightToLeft = i;
	//  273  475:aload_0         
	//  274  476:iload_1         
	//  275  477:putfield        #198 <Field int resolvedRightToLeft>
				if(rightMargin <= 0 && l > 0)
	//* 276  480:aload_0         
	//* 277  481:getfield        #351 <Field int rightMargin>
	//* 278  484:ifgt            534
	//* 279  487:iload           5
	//* 280  489:ifle            534
					rightMargin = l;
	//  281  492:aload_0         
	//  282  493:iload           5
	//  283  495:putfield        #351 <Field int rightMargin>
			} else
	//* 284  498:goto            534
			{
				i = rightToRight;
	//  285  501:aload_0         
	//  286  502:getfield        #99  <Field int rightToRight>
	//  287  505:istore_1        
				if(i != -1)
	//* 288  506:iload_1         
	//* 289  507:iconst_m1       
	//* 290  508:icmpeq          534
				{
					resolvedRightToRight = i;
	//  291  511:aload_0         
	//  292  512:iload_1         
	//  293  513:putfield        #200 <Field int resolvedRightToRight>
					if(rightMargin <= 0 && l > 0)
	//* 294  516:aload_0         
	//* 295  517:getfield        #351 <Field int rightMargin>
	//* 296  520:ifgt            534
	//* 297  523:iload           5
	//* 298  525:ifle            534
						rightMargin = l;
	//  299  528:aload_0         
	//  300  529:iload           5
	//  301  531:putfield        #351 <Field int rightMargin>
				}
			}
			i = leftToLeft;
	//  302  534:aload_0         
	//  303  535:getfield        #93  <Field int leftToLeft>
	//  304  538:istore_1        
			if(i != -1)
	//* 305  539:iload_1         
	//* 306  540:iconst_m1       
	//* 307  541:icmpeq          568
			{
				resolvedLeftToLeft = i;
	//  308  544:aload_0         
	//  309  545:iload_1         
	//  310  546:putfield        #194 <Field int resolvedLeftToLeft>
				if(leftMargin <= 0 && k > 0)
	//* 311  549:aload_0         
	//* 312  550:getfield        #348 <Field int leftMargin>
	//* 313  553:ifgt            601
	//* 314  556:iload           4
	//* 315  558:ifle            601
				{
					leftMargin = k;
	//  316  561:aload_0         
	//  317  562:iload           4
	//  318  564:putfield        #348 <Field int leftMargin>
					return;
	//  319  567:return          
				}
			} else
			{
				i = leftToRight;
	//  320  568:aload_0         
	//  321  569:getfield        #95  <Field int leftToRight>
	//  322  572:istore_1        
				if(i != -1)
	//* 323  573:iload_1         
	//* 324  574:iconst_m1       
	//* 325  575:icmpeq          601
				{
					resolvedLeftToRight = i;
	//  326  578:aload_0         
	//  327  579:iload_1         
	//  328  580:putfield        #196 <Field int resolvedLeftToRight>
					if(leftMargin <= 0 && k > 0)
	//* 329  583:aload_0         
	//* 330  584:getfield        #348 <Field int leftMargin>
	//* 331  587:ifgt            601
	//* 332  590:iload           4
	//* 333  592:ifle            601
						leftMargin = k;
	//  334  595:aload_0         
	//  335  596:iload           4
	//  336  598:putfield        #348 <Field int leftMargin>
				}
			}
		}
	//  337  601:return          
	}

	public void validate()
	{
		isGuideline = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #188 <Field boolean isGuideline>
		horizontalDimensionFixed = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #182 <Field boolean horizontalDimensionFixed>
		verticalDimensionFixed = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #184 <Field boolean verticalDimensionFixed>
		if(width == -2 && constrainedWidth)
	//*   9   15:aload_0         
	//*  10   16:getfield        #366 <Field int width>
	//*  11   19:bipush          -2
	//*  12   21:icmpne          41
	//*  13   24:aload_0         
	//*  14   25:getfield        #178 <Field boolean constrainedWidth>
	//*  15   28:ifeq            41
		{
			horizontalDimensionFixed = false;
	//   16   31:aload_0         
	//   17   32:iconst_0        
	//   18   33:putfield        #182 <Field boolean horizontalDimensionFixed>
			matchConstraintDefaultWidth = 1;
	//   19   36:aload_0         
	//   20   37:iconst_1        
	//   21   38:putfield        #156 <Field int matchConstraintDefaultWidth>
		}
		if(height == -2 && constrainedHeight)
	//*  22   41:aload_0         
	//*  23   42:getfield        #369 <Field int height>
	//*  24   45:bipush          -2
	//*  25   47:icmpne          67
	//*  26   50:aload_0         
	//*  27   51:getfield        #180 <Field boolean constrainedHeight>
	//*  28   54:ifeq            67
		{
			verticalDimensionFixed = false;
	//   29   57:aload_0         
	//   30   58:iconst_0        
	//   31   59:putfield        #184 <Field boolean verticalDimensionFixed>
			matchConstraintDefaultHeight = 1;
	//   32   62:aload_0         
	//   33   63:iconst_1        
	//   34   64:putfield        #158 <Field int matchConstraintDefaultHeight>
		}
		if(width == 0 || width == -1)
	//*  35   67:aload_0         
	//*  36   68:getfield        #366 <Field int width>
	//*  37   71:ifeq            82
	//*  38   74:aload_0         
	//*  39   75:getfield        #366 <Field int width>
	//*  40   78:iconst_m1       
	//*  41   79:icmpne          113
		{
			horizontalDimensionFixed = false;
	//   42   82:aload_0         
	//   43   83:iconst_0        
	//   44   84:putfield        #182 <Field boolean horizontalDimensionFixed>
			if(width == 0 && matchConstraintDefaultWidth == 1)
	//*  45   87:aload_0         
	//*  46   88:getfield        #366 <Field int width>
	//*  47   91:ifne            113
	//*  48   94:aload_0         
	//*  49   95:getfield        #156 <Field int matchConstraintDefaultWidth>
	//*  50   98:iconst_1        
	//*  51   99:icmpne          113
			{
				width = -2;
	//   52  102:aload_0         
	//   53  103:bipush          -2
	//   54  105:putfield        #366 <Field int width>
				constrainedWidth = true;
	//   55  108:aload_0         
	//   56  109:iconst_1        
	//   57  110:putfield        #178 <Field boolean constrainedWidth>
			}
		}
		if(height == 0 || height == -1)
	//*  58  113:aload_0         
	//*  59  114:getfield        #369 <Field int height>
	//*  60  117:ifeq            128
	//*  61  120:aload_0         
	//*  62  121:getfield        #369 <Field int height>
	//*  63  124:iconst_m1       
	//*  64  125:icmpne          159
		{
			verticalDimensionFixed = false;
	//   65  128:aload_0         
	//   66  129:iconst_0        
	//   67  130:putfield        #184 <Field boolean verticalDimensionFixed>
			if(height == 0 && matchConstraintDefaultHeight == 1)
	//*  68  133:aload_0         
	//*  69  134:getfield        #369 <Field int height>
	//*  70  137:ifne            159
	//*  71  140:aload_0         
	//*  72  141:getfield        #158 <Field int matchConstraintDefaultHeight>
	//*  73  144:iconst_1        
	//*  74  145:icmpne          159
			{
				height = -2;
	//   75  148:aload_0         
	//   76  149:bipush          -2
	//   77  151:putfield        #369 <Field int height>
				constrainedHeight = true;
	//   78  154:aload_0         
	//   79  155:iconst_1        
	//   80  156:putfield        #180 <Field boolean constrainedHeight>
			}
		}
		if(guidePercent != -1F || guideBegin != -1 || guideEnd != -1)
	//*  81  159:aload_0         
	//*  82  160:getfield        #91  <Field float guidePercent>
	//*  83  163:ldc1            #89  <Float -1F>
	//*  84  165:fcmpl           
	//*  85  166:ifne            185
	//*  86  169:aload_0         
	//*  87  170:getfield        #86  <Field int guideBegin>
	//*  88  173:iconst_m1       
	//*  89  174:icmpne          185
	//*  90  177:aload_0         
	//*  91  178:getfield        #88  <Field int guideEnd>
	//*  92  181:iconst_m1       
	//*  93  182:icmpeq          235
		{
			isGuideline = true;
	//   94  185:aload_0         
	//   95  186:iconst_1        
	//   96  187:putfield        #188 <Field boolean isGuideline>
			horizontalDimensionFixed = true;
	//   97  190:aload_0         
	//   98  191:iconst_1        
	//   99  192:putfield        #182 <Field boolean horizontalDimensionFixed>
			verticalDimensionFixed = true;
	//  100  195:aload_0         
	//  101  196:iconst_1        
	//  102  197:putfield        #184 <Field boolean verticalDimensionFixed>
			if(!(widget instanceof Guideline))
	//* 103  200:aload_0         
	//* 104  201:getfield        #213 <Field ConstraintWidget widget>
	//* 105  204:instanceof      #371 <Class Guideline>
	//* 106  207:ifne            221
				widget = ((ConstraintWidget) (new Guideline()));
	//  107  210:aload_0         
	//  108  211:new             #371 <Class Guideline>
	//  109  214:dup             
	//  110  215:invokespecial   #372 <Method void Guideline()>
	//  111  218:putfield        #213 <Field ConstraintWidget widget>
			((Guideline)widget).setOrientation(orientation);
	//  112  221:aload_0         
	//  113  222:getfield        #213 <Field ConstraintWidget widget>
	//  114  225:checkcast       #371 <Class Guideline>
	//  115  228:aload_0         
	//  116  229:getfield        #176 <Field int orientation>
	//  117  232:invokevirtual   #375 <Method void Guideline.setOrientation(int)>
		}
	//  118  235:return          
	}

	public int baselineToBaseline;
	public int bottomToBottom;
	public int bottomToTop;
	public float circleAngle;
	public int circleConstraint;
	public int circleRadius;
	public boolean constrainedHeight;
	public boolean constrainedWidth;
	public String dimensionRatio;
	int dimensionRatioSide;
	float dimensionRatioValue;
	public int editorAbsoluteX;
	public int editorAbsoluteY;
	public int endToEnd;
	public int endToStart;
	public int goneBottomMargin;
	public int goneEndMargin;
	public int goneLeftMargin;
	public int goneRightMargin;
	public int goneStartMargin;
	public int goneTopMargin;
	public int guideBegin;
	public int guideEnd;
	public float guidePercent;
	public boolean helped;
	public float horizontalBias;
	public int horizontalChainStyle;
	boolean horizontalDimensionFixed;
	public float horizontalWeight;
	boolean isGuideline;
	boolean isHelper;
	boolean isInPlaceholder;
	public int leftToLeft;
	public int leftToRight;
	public int matchConstraintDefaultHeight;
	public int matchConstraintDefaultWidth;
	public int matchConstraintMaxHeight;
	public int matchConstraintMaxWidth;
	public int matchConstraintMinHeight;
	public int matchConstraintMinWidth;
	public float matchConstraintPercentHeight;
	public float matchConstraintPercentWidth;
	boolean needsBaseline;
	public int orientation;
	int resolveGoneLeftMargin;
	int resolveGoneRightMargin;
	int resolvedGuideBegin;
	int resolvedGuideEnd;
	float resolvedGuidePercent;
	float resolvedHorizontalBias;
	int resolvedLeftToLeft;
	int resolvedLeftToRight;
	int resolvedRightToLeft;
	int resolvedRightToRight;
	public int rightToLeft;
	public int rightToRight;
	public int startToEnd;
	public int startToStart;
	public int topToBottom;
	public int topToTop;
	public float verticalBias;
	public int verticalChainStyle;
	boolean verticalDimensionFixed;
	public float verticalWeight;
	ConstraintWidget widget;

	public ConstraintLayout$LayoutParams(int i, int j)
	{
		super(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #84  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
		guideBegin = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #86  <Field int guideBegin>
		guideEnd = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #88  <Field int guideEnd>
		guidePercent = -1F;
	//   10   16:aload_0         
	//   11   17:ldc1            #89  <Float -1F>
	//   12   19:putfield        #91  <Field float guidePercent>
		leftToLeft = -1;
	//   13   22:aload_0         
	//   14   23:iconst_m1       
	//   15   24:putfield        #93  <Field int leftToLeft>
		leftToRight = -1;
	//   16   27:aload_0         
	//   17   28:iconst_m1       
	//   18   29:putfield        #95  <Field int leftToRight>
		rightToLeft = -1;
	//   19   32:aload_0         
	//   20   33:iconst_m1       
	//   21   34:putfield        #97  <Field int rightToLeft>
		rightToRight = -1;
	//   22   37:aload_0         
	//   23   38:iconst_m1       
	//   24   39:putfield        #99  <Field int rightToRight>
		topToTop = -1;
	//   25   42:aload_0         
	//   26   43:iconst_m1       
	//   27   44:putfield        #101 <Field int topToTop>
		topToBottom = -1;
	//   28   47:aload_0         
	//   29   48:iconst_m1       
	//   30   49:putfield        #103 <Field int topToBottom>
		bottomToTop = -1;
	//   31   52:aload_0         
	//   32   53:iconst_m1       
	//   33   54:putfield        #105 <Field int bottomToTop>
		bottomToBottom = -1;
	//   34   57:aload_0         
	//   35   58:iconst_m1       
	//   36   59:putfield        #107 <Field int bottomToBottom>
		baselineToBaseline = -1;
	//   37   62:aload_0         
	//   38   63:iconst_m1       
	//   39   64:putfield        #109 <Field int baselineToBaseline>
		circleConstraint = -1;
	//   40   67:aload_0         
	//   41   68:iconst_m1       
	//   42   69:putfield        #111 <Field int circleConstraint>
		circleRadius = 0;
	//   43   72:aload_0         
	//   44   73:iconst_0        
	//   45   74:putfield        #113 <Field int circleRadius>
		circleAngle = 0.0F;
	//   46   77:aload_0         
	//   47   78:fconst_0        
	//   48   79:putfield        #115 <Field float circleAngle>
		startToEnd = -1;
	//   49   82:aload_0         
	//   50   83:iconst_m1       
	//   51   84:putfield        #117 <Field int startToEnd>
		startToStart = -1;
	//   52   87:aload_0         
	//   53   88:iconst_m1       
	//   54   89:putfield        #119 <Field int startToStart>
		endToStart = -1;
	//   55   92:aload_0         
	//   56   93:iconst_m1       
	//   57   94:putfield        #121 <Field int endToStart>
		endToEnd = -1;
	//   58   97:aload_0         
	//   59   98:iconst_m1       
	//   60   99:putfield        #123 <Field int endToEnd>
		goneLeftMargin = -1;
	//   61  102:aload_0         
	//   62  103:iconst_m1       
	//   63  104:putfield        #125 <Field int goneLeftMargin>
		goneTopMargin = -1;
	//   64  107:aload_0         
	//   65  108:iconst_m1       
	//   66  109:putfield        #127 <Field int goneTopMargin>
		goneRightMargin = -1;
	//   67  112:aload_0         
	//   68  113:iconst_m1       
	//   69  114:putfield        #129 <Field int goneRightMargin>
		goneBottomMargin = -1;
	//   70  117:aload_0         
	//   71  118:iconst_m1       
	//   72  119:putfield        #131 <Field int goneBottomMargin>
		goneStartMargin = -1;
	//   73  122:aload_0         
	//   74  123:iconst_m1       
	//   75  124:putfield        #133 <Field int goneStartMargin>
		goneEndMargin = -1;
	//   76  127:aload_0         
	//   77  128:iconst_m1       
	//   78  129:putfield        #135 <Field int goneEndMargin>
		horizontalBias = 0.5F;
	//   79  132:aload_0         
	//   80  133:ldc1            #136 <Float 0.5F>
	//   81  135:putfield        #138 <Field float horizontalBias>
		verticalBias = 0.5F;
	//   82  138:aload_0         
	//   83  139:ldc1            #136 <Float 0.5F>
	//   84  141:putfield        #140 <Field float verticalBias>
		dimensionRatio = null;
	//   85  144:aload_0         
	//   86  145:aconst_null     
	//   87  146:putfield        #142 <Field String dimensionRatio>
		dimensionRatioValue = 0.0F;
	//   88  149:aload_0         
	//   89  150:fconst_0        
	//   90  151:putfield        #144 <Field float dimensionRatioValue>
		dimensionRatioSide = 1;
	//   91  154:aload_0         
	//   92  155:iconst_1        
	//   93  156:putfield        #146 <Field int dimensionRatioSide>
		horizontalWeight = -1F;
	//   94  159:aload_0         
	//   95  160:ldc1            #89  <Float -1F>
	//   96  162:putfield        #148 <Field float horizontalWeight>
		verticalWeight = -1F;
	//   97  165:aload_0         
	//   98  166:ldc1            #89  <Float -1F>
	//   99  168:putfield        #150 <Field float verticalWeight>
		horizontalChainStyle = 0;
	//  100  171:aload_0         
	//  101  172:iconst_0        
	//  102  173:putfield        #152 <Field int horizontalChainStyle>
		verticalChainStyle = 0;
	//  103  176:aload_0         
	//  104  177:iconst_0        
	//  105  178:putfield        #154 <Field int verticalChainStyle>
		matchConstraintDefaultWidth = 0;
	//  106  181:aload_0         
	//  107  182:iconst_0        
	//  108  183:putfield        #156 <Field int matchConstraintDefaultWidth>
		matchConstraintDefaultHeight = 0;
	//  109  186:aload_0         
	//  110  187:iconst_0        
	//  111  188:putfield        #158 <Field int matchConstraintDefaultHeight>
		matchConstraintMinWidth = 0;
	//  112  191:aload_0         
	//  113  192:iconst_0        
	//  114  193:putfield        #160 <Field int matchConstraintMinWidth>
		matchConstraintMinHeight = 0;
	//  115  196:aload_0         
	//  116  197:iconst_0        
	//  117  198:putfield        #162 <Field int matchConstraintMinHeight>
		matchConstraintMaxWidth = 0;
	//  118  201:aload_0         
	//  119  202:iconst_0        
	//  120  203:putfield        #164 <Field int matchConstraintMaxWidth>
		matchConstraintMaxHeight = 0;
	//  121  206:aload_0         
	//  122  207:iconst_0        
	//  123  208:putfield        #166 <Field int matchConstraintMaxHeight>
		matchConstraintPercentWidth = 1.0F;
	//  124  211:aload_0         
	//  125  212:fconst_1        
	//  126  213:putfield        #168 <Field float matchConstraintPercentWidth>
		matchConstraintPercentHeight = 1.0F;
	//  127  216:aload_0         
	//  128  217:fconst_1        
	//  129  218:putfield        #170 <Field float matchConstraintPercentHeight>
		editorAbsoluteX = -1;
	//  130  221:aload_0         
	//  131  222:iconst_m1       
	//  132  223:putfield        #172 <Field int editorAbsoluteX>
		editorAbsoluteY = -1;
	//  133  226:aload_0         
	//  134  227:iconst_m1       
	//  135  228:putfield        #174 <Field int editorAbsoluteY>
		orientation = -1;
	//  136  231:aload_0         
	//  137  232:iconst_m1       
	//  138  233:putfield        #176 <Field int orientation>
		constrainedWidth = false;
	//  139  236:aload_0         
	//  140  237:iconst_0        
	//  141  238:putfield        #178 <Field boolean constrainedWidth>
		constrainedHeight = false;
	//  142  241:aload_0         
	//  143  242:iconst_0        
	//  144  243:putfield        #180 <Field boolean constrainedHeight>
		horizontalDimensionFixed = true;
	//  145  246:aload_0         
	//  146  247:iconst_1        
	//  147  248:putfield        #182 <Field boolean horizontalDimensionFixed>
		verticalDimensionFixed = true;
	//  148  251:aload_0         
	//  149  252:iconst_1        
	//  150  253:putfield        #184 <Field boolean verticalDimensionFixed>
		needsBaseline = false;
	//  151  256:aload_0         
	//  152  257:iconst_0        
	//  153  258:putfield        #186 <Field boolean needsBaseline>
		isGuideline = false;
	//  154  261:aload_0         
	//  155  262:iconst_0        
	//  156  263:putfield        #188 <Field boolean isGuideline>
		isHelper = false;
	//  157  266:aload_0         
	//  158  267:iconst_0        
	//  159  268:putfield        #190 <Field boolean isHelper>
		isInPlaceholder = false;
	//  160  271:aload_0         
	//  161  272:iconst_0        
	//  162  273:putfield        #192 <Field boolean isInPlaceholder>
		resolvedLeftToLeft = -1;
	//  163  276:aload_0         
	//  164  277:iconst_m1       
	//  165  278:putfield        #194 <Field int resolvedLeftToLeft>
		resolvedLeftToRight = -1;
	//  166  281:aload_0         
	//  167  282:iconst_m1       
	//  168  283:putfield        #196 <Field int resolvedLeftToRight>
		resolvedRightToLeft = -1;
	//  169  286:aload_0         
	//  170  287:iconst_m1       
	//  171  288:putfield        #198 <Field int resolvedRightToLeft>
		resolvedRightToRight = -1;
	//  172  291:aload_0         
	//  173  292:iconst_m1       
	//  174  293:putfield        #200 <Field int resolvedRightToRight>
		resolveGoneLeftMargin = -1;
	//  175  296:aload_0         
	//  176  297:iconst_m1       
	//  177  298:putfield        #202 <Field int resolveGoneLeftMargin>
		resolveGoneRightMargin = -1;
	//  178  301:aload_0         
	//  179  302:iconst_m1       
	//  180  303:putfield        #204 <Field int resolveGoneRightMargin>
		resolvedHorizontalBias = 0.5F;
	//  181  306:aload_0         
	//  182  307:ldc1            #136 <Float 0.5F>
	//  183  309:putfield        #206 <Field float resolvedHorizontalBias>
		widget = new ConstraintWidget();
	//  184  312:aload_0         
	//  185  313:new             #208 <Class ConstraintWidget>
	//  186  316:dup             
	//  187  317:invokespecial   #211 <Method void ConstraintWidget()>
	//  188  320:putfield        #213 <Field ConstraintWidget widget>
		helped = false;
	//  189  323:aload_0         
	//  190  324:iconst_0        
	//  191  325:putfield        #215 <Field boolean helped>
	//  192  328:return          
	}

	public ConstraintLayout$LayoutParams(Context context, AttributeSet attributeset)
	{
		int i;
		int k;
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #223 <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
		guideBegin = -1;
	//    4    6:aload_0         
	//    5    7:iconst_m1       
	//    6    8:putfield        #86  <Field int guideBegin>
		guideEnd = -1;
	//    7   11:aload_0         
	//    8   12:iconst_m1       
	//    9   13:putfield        #88  <Field int guideEnd>
		guidePercent = -1F;
	//   10   16:aload_0         
	//   11   17:ldc1            #89  <Float -1F>
	//   12   19:putfield        #91  <Field float guidePercent>
		leftToLeft = -1;
	//   13   22:aload_0         
	//   14   23:iconst_m1       
	//   15   24:putfield        #93  <Field int leftToLeft>
		leftToRight = -1;
	//   16   27:aload_0         
	//   17   28:iconst_m1       
	//   18   29:putfield        #95  <Field int leftToRight>
		rightToLeft = -1;
	//   19   32:aload_0         
	//   20   33:iconst_m1       
	//   21   34:putfield        #97  <Field int rightToLeft>
		rightToRight = -1;
	//   22   37:aload_0         
	//   23   38:iconst_m1       
	//   24   39:putfield        #99  <Field int rightToRight>
		topToTop = -1;
	//   25   42:aload_0         
	//   26   43:iconst_m1       
	//   27   44:putfield        #101 <Field int topToTop>
		topToBottom = -1;
	//   28   47:aload_0         
	//   29   48:iconst_m1       
	//   30   49:putfield        #103 <Field int topToBottom>
		bottomToTop = -1;
	//   31   52:aload_0         
	//   32   53:iconst_m1       
	//   33   54:putfield        #105 <Field int bottomToTop>
		bottomToBottom = -1;
	//   34   57:aload_0         
	//   35   58:iconst_m1       
	//   36   59:putfield        #107 <Field int bottomToBottom>
		baselineToBaseline = -1;
	//   37   62:aload_0         
	//   38   63:iconst_m1       
	//   39   64:putfield        #109 <Field int baselineToBaseline>
		circleConstraint = -1;
	//   40   67:aload_0         
	//   41   68:iconst_m1       
	//   42   69:putfield        #111 <Field int circleConstraint>
		circleRadius = 0;
	//   43   72:aload_0         
	//   44   73:iconst_0        
	//   45   74:putfield        #113 <Field int circleRadius>
		circleAngle = 0.0F;
	//   46   77:aload_0         
	//   47   78:fconst_0        
	//   48   79:putfield        #115 <Field float circleAngle>
		startToEnd = -1;
	//   49   82:aload_0         
	//   50   83:iconst_m1       
	//   51   84:putfield        #117 <Field int startToEnd>
		startToStart = -1;
	//   52   87:aload_0         
	//   53   88:iconst_m1       
	//   54   89:putfield        #119 <Field int startToStart>
		endToStart = -1;
	//   55   92:aload_0         
	//   56   93:iconst_m1       
	//   57   94:putfield        #121 <Field int endToStart>
		endToEnd = -1;
	//   58   97:aload_0         
	//   59   98:iconst_m1       
	//   60   99:putfield        #123 <Field int endToEnd>
		goneLeftMargin = -1;
	//   61  102:aload_0         
	//   62  103:iconst_m1       
	//   63  104:putfield        #125 <Field int goneLeftMargin>
		goneTopMargin = -1;
	//   64  107:aload_0         
	//   65  108:iconst_m1       
	//   66  109:putfield        #127 <Field int goneTopMargin>
		goneRightMargin = -1;
	//   67  112:aload_0         
	//   68  113:iconst_m1       
	//   69  114:putfield        #129 <Field int goneRightMargin>
		goneBottomMargin = -1;
	//   70  117:aload_0         
	//   71  118:iconst_m1       
	//   72  119:putfield        #131 <Field int goneBottomMargin>
		goneStartMargin = -1;
	//   73  122:aload_0         
	//   74  123:iconst_m1       
	//   75  124:putfield        #133 <Field int goneStartMargin>
		goneEndMargin = -1;
	//   76  127:aload_0         
	//   77  128:iconst_m1       
	//   78  129:putfield        #135 <Field int goneEndMargin>
		horizontalBias = 0.5F;
	//   79  132:aload_0         
	//   80  133:ldc1            #136 <Float 0.5F>
	//   81  135:putfield        #138 <Field float horizontalBias>
		verticalBias = 0.5F;
	//   82  138:aload_0         
	//   83  139:ldc1            #136 <Float 0.5F>
	//   84  141:putfield        #140 <Field float verticalBias>
		dimensionRatio = null;
	//   85  144:aload_0         
	//   86  145:aconst_null     
	//   87  146:putfield        #142 <Field String dimensionRatio>
		dimensionRatioValue = 0.0F;
	//   88  149:aload_0         
	//   89  150:fconst_0        
	//   90  151:putfield        #144 <Field float dimensionRatioValue>
		dimensionRatioSide = 1;
	//   91  154:aload_0         
	//   92  155:iconst_1        
	//   93  156:putfield        #146 <Field int dimensionRatioSide>
		horizontalWeight = -1F;
	//   94  159:aload_0         
	//   95  160:ldc1            #89  <Float -1F>
	//   96  162:putfield        #148 <Field float horizontalWeight>
		verticalWeight = -1F;
	//   97  165:aload_0         
	//   98  166:ldc1            #89  <Float -1F>
	//   99  168:putfield        #150 <Field float verticalWeight>
		horizontalChainStyle = 0;
	//  100  171:aload_0         
	//  101  172:iconst_0        
	//  102  173:putfield        #152 <Field int horizontalChainStyle>
		verticalChainStyle = 0;
	//  103  176:aload_0         
	//  104  177:iconst_0        
	//  105  178:putfield        #154 <Field int verticalChainStyle>
		matchConstraintDefaultWidth = 0;
	//  106  181:aload_0         
	//  107  182:iconst_0        
	//  108  183:putfield        #156 <Field int matchConstraintDefaultWidth>
		matchConstraintDefaultHeight = 0;
	//  109  186:aload_0         
	//  110  187:iconst_0        
	//  111  188:putfield        #158 <Field int matchConstraintDefaultHeight>
		matchConstraintMinWidth = 0;
	//  112  191:aload_0         
	//  113  192:iconst_0        
	//  114  193:putfield        #160 <Field int matchConstraintMinWidth>
		matchConstraintMinHeight = 0;
	//  115  196:aload_0         
	//  116  197:iconst_0        
	//  117  198:putfield        #162 <Field int matchConstraintMinHeight>
		matchConstraintMaxWidth = 0;
	//  118  201:aload_0         
	//  119  202:iconst_0        
	//  120  203:putfield        #164 <Field int matchConstraintMaxWidth>
		matchConstraintMaxHeight = 0;
	//  121  206:aload_0         
	//  122  207:iconst_0        
	//  123  208:putfield        #166 <Field int matchConstraintMaxHeight>
		matchConstraintPercentWidth = 1.0F;
	//  124  211:aload_0         
	//  125  212:fconst_1        
	//  126  213:putfield        #168 <Field float matchConstraintPercentWidth>
		matchConstraintPercentHeight = 1.0F;
	//  127  216:aload_0         
	//  128  217:fconst_1        
	//  129  218:putfield        #170 <Field float matchConstraintPercentHeight>
		editorAbsoluteX = -1;
	//  130  221:aload_0         
	//  131  222:iconst_m1       
	//  132  223:putfield        #172 <Field int editorAbsoluteX>
		editorAbsoluteY = -1;
	//  133  226:aload_0         
	//  134  227:iconst_m1       
	//  135  228:putfield        #174 <Field int editorAbsoluteY>
		orientation = -1;
	//  136  231:aload_0         
	//  137  232:iconst_m1       
	//  138  233:putfield        #176 <Field int orientation>
		constrainedWidth = false;
	//  139  236:aload_0         
	//  140  237:iconst_0        
	//  141  238:putfield        #178 <Field boolean constrainedWidth>
		constrainedHeight = false;
	//  142  241:aload_0         
	//  143  242:iconst_0        
	//  144  243:putfield        #180 <Field boolean constrainedHeight>
		horizontalDimensionFixed = true;
	//  145  246:aload_0         
	//  146  247:iconst_1        
	//  147  248:putfield        #182 <Field boolean horizontalDimensionFixed>
		verticalDimensionFixed = true;
	//  148  251:aload_0         
	//  149  252:iconst_1        
	//  150  253:putfield        #184 <Field boolean verticalDimensionFixed>
		needsBaseline = false;
	//  151  256:aload_0         
	//  152  257:iconst_0        
	//  153  258:putfield        #186 <Field boolean needsBaseline>
		isGuideline = false;
	//  154  261:aload_0         
	//  155  262:iconst_0        
	//  156  263:putfield        #188 <Field boolean isGuideline>
		isHelper = false;
	//  157  266:aload_0         
	//  158  267:iconst_0        
	//  159  268:putfield        #190 <Field boolean isHelper>
		isInPlaceholder = false;
	//  160  271:aload_0         
	//  161  272:iconst_0        
	//  162  273:putfield        #192 <Field boolean isInPlaceholder>
		resolvedLeftToLeft = -1;
	//  163  276:aload_0         
	//  164  277:iconst_m1       
	//  165  278:putfield        #194 <Field int resolvedLeftToLeft>
		resolvedLeftToRight = -1;
	//  166  281:aload_0         
	//  167  282:iconst_m1       
	//  168  283:putfield        #196 <Field int resolvedLeftToRight>
		resolvedRightToLeft = -1;
	//  169  286:aload_0         
	//  170  287:iconst_m1       
	//  171  288:putfield        #198 <Field int resolvedRightToLeft>
		resolvedRightToRight = -1;
	//  172  291:aload_0         
	//  173  292:iconst_m1       
	//  174  293:putfield        #200 <Field int resolvedRightToRight>
		resolveGoneLeftMargin = -1;
	//  175  296:aload_0         
	//  176  297:iconst_m1       
	//  177  298:putfield        #202 <Field int resolveGoneLeftMargin>
		resolveGoneRightMargin = -1;
	//  178  301:aload_0         
	//  179  302:iconst_m1       
	//  180  303:putfield        #204 <Field int resolveGoneRightMargin>
		resolvedHorizontalBias = 0.5F;
	//  181  306:aload_0         
	//  182  307:ldc1            #136 <Float 0.5F>
	//  183  309:putfield        #206 <Field float resolvedHorizontalBias>
		widget = new ConstraintWidget();
	//  184  312:aload_0         
	//  185  313:new             #208 <Class ConstraintWidget>
	//  186  316:dup             
	//  187  317:invokespecial   #211 <Method void ConstraintWidget()>
	//  188  320:putfield        #213 <Field ConstraintWidget widget>
		helped = false;
	//  189  323:aload_0         
	//  190  324:iconst_0        
	//  191  325:putfield        #215 <Field boolean helped>
		context = ((Context) (context.obtainStyledAttributes(attributeset, R.styleable.ConstraintLayout_Layout)));
	//  192  328:aload_1         
	//  193  329:aload_2         
	//  194  330:getstatic       #229 <Field int[] R$styleable.ConstraintLayout_Layout>
	//  195  333:invokevirtual   #235 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//  196  336:astore_1        
		k = ((TypedArray) (context)).getIndexCount();
	//  197  337:aload_1         
	//  198  338:invokevirtual   #241 <Method int TypedArray.getIndexCount()>
	//  199  341:istore          7
		i = 0;
	//  200  343:iconst_0        
	//  201  344:istore          5
_L50:
		int j;
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//  202  346:iload           5
	//  203  348:iload           7
	//  204  350:icmpge          2039
		j = ((TypedArray) (context)).getIndex(i);
	//  205  353:aload_1         
	//  206  354:iload           5
	//  207  356:invokevirtual   #245 <Method int TypedArray.getIndex(int)>
	//  208  359:istore          6
		Table.map.get(j);
	//  209  361:getstatic       #249 <Field SparseIntArray ConstraintLayout$LayoutParams$Table.map>
	//  210  364:iload           6
	//  211  366:invokevirtual   #254 <Method int SparseIntArray.get(int)>
		JVM INSTR tableswitch 0 50: default 588
	//	               0 2030
	//	               1 2016
	//	               2 1980
	//	               3 1963
	//	               4 1918
	//	               5 1901
	//	               6 1884
	//	               7 1867
	//	               8 1831
	//	               9 1795
	//	               10 1759
	//	               11 1723
	//	               12 1687
	//	               13 1651
	//	               14 1615
	//	               15 1579
	//	               16 1543
	//	               17 1507
	//	               18 1471
	//	               19 1435
	//	               20 1399
	//	               21 1382
	//	               22 1365
	//	               23 1348
	//	               24 1331
	//	               25 1314
	//	               26 1297
	//	               27 1280
	//	               28 1263
	//	               29 1246
	//	               30 1229
	//	               31 1197
	//	               32 1165
	//	               33 1124
	//	               34 1083
	//	               35 1062
	//	               36 1021
	//	               37 980
	//	               38 959
	//	               39 2030
	//	               40 2030
	//	               41 2030
	//	               42 2030
	//	               43 588
	//	               44 687
	//	               45 670
	//	               46 653
	//	               47 639
	//	               48 625
	//	               49 608
	//	               50 591;
	//  212  369:tableswitch     0 50: default 588
	//	               0 2030
	//	               1 2016
	//	               2 1980
	//	               3 1963
	//	               4 1918
	//	               5 1901
	//	               6 1884
	//	               7 1867
	//	               8 1831
	//	               9 1795
	//	               10 1759
	//	               11 1723
	//	               12 1687
	//	               13 1651
	//	               14 1615
	//	               15 1579
	//	               16 1543
	//	               17 1507
	//	               18 1471
	//	               19 1435
	//	               20 1399
	//	               21 1382
	//	               22 1365
	//	               23 1348
	//	               24 1331
	//	               25 1314
	//	               26 1297
	//	               27 1280
	//	               28 1263
	//	               29 1246
	//	               30 1229
	//	               31 1197
	//	               32 1165
	//	               33 1124
	//	               34 1083
	//	               35 1062
	//	               36 1021
	//	               37 980
	//	               38 959
	//	               39 2030
	//	               40 2030
	//	               41 2030
	//	               42 2030
	//	               43 588
	//	               44 687
	//	               45 670
	//	               46 653
	//	               47 639
	//	               48 625
	//	               49 608
	//	               50 591
		   goto _L1 _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L1 _L1 _L1 _L1 _L1 _L40 _L41 _L42 _L43 _L44 _L45 _L46
_L1:
		break; /* Loop/switch isn't completed */
	//  213  588:goto            2030
_L46:
		editorAbsoluteY = ((TypedArray) (context)).getDimensionPixelOffset(j, editorAbsoluteY);
	//  214  591:aload_0         
	//  215  592:aload_1         
	//  216  593:iload           6
	//  217  595:aload_0         
	//  218  596:getfield        #174 <Field int editorAbsoluteY>
	//  219  599:invokevirtual   #258 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  220  602:putfield        #174 <Field int editorAbsoluteY>
		break; /* Loop/switch isn't completed */
	//  221  605:goto            2030
_L45:
		editorAbsoluteX = ((TypedArray) (context)).getDimensionPixelOffset(j, editorAbsoluteX);
	//  222  608:aload_0         
	//  223  609:aload_1         
	//  224  610:iload           6
	//  225  612:aload_0         
	//  226  613:getfield        #172 <Field int editorAbsoluteX>
	//  227  616:invokevirtual   #258 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//  228  619:putfield        #172 <Field int editorAbsoluteX>
		break; /* Loop/switch isn't completed */
	//  229  622:goto            2030
_L44:
		verticalChainStyle = ((TypedArray) (context)).getInt(j, 0);
	//  230  625:aload_0         
	//  231  626:aload_1         
	//  232  627:iload           6
	//  233  629:iconst_0        
	//  234  630:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//  235  633:putfield        #154 <Field int verticalChainStyle>
		break; /* Loop/switch isn't completed */
	//  236  636:goto            2030
_L43:
		horizontalChainStyle = ((TypedArray) (context)).getInt(j, 0);
	//  237  639:aload_0         
	//  238  640:aload_1         
	//  239  641:iload           6
	//  240  643:iconst_0        
	//  241  644:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//  242  647:putfield        #152 <Field int horizontalChainStyle>
		break; /* Loop/switch isn't completed */
	//  243  650:goto            2030
_L42:
		verticalWeight = ((TypedArray) (context)).getFloat(j, verticalWeight);
	//  244  653:aload_0         
	//  245  654:aload_1         
	//  246  655:iload           6
	//  247  657:aload_0         
	//  248  658:getfield        #150 <Field float verticalWeight>
	//  249  661:invokevirtual   #265 <Method float TypedArray.getFloat(int, float)>
	//  250  664:putfield        #150 <Field float verticalWeight>
		break; /* Loop/switch isn't completed */
	//  251  667:goto            2030
_L41:
		horizontalWeight = ((TypedArray) (context)).getFloat(j, horizontalWeight);
	//  252  670:aload_0         
	//  253  671:aload_1         
	//  254  672:iload           6
	//  255  674:aload_0         
	//  256  675:getfield        #148 <Field float horizontalWeight>
	//  257  678:invokevirtual   #265 <Method float TypedArray.getFloat(int, float)>
	//  258  681:putfield        #148 <Field float horizontalWeight>
		break; /* Loop/switch isn't completed */
	//  259  684:goto            2030
_L40:
		int l;
		int i1;
		dimensionRatio = ((TypedArray) (context)).getString(j);
	//  260  687:aload_0         
	//  261  688:aload_1         
	//  262  689:iload           6
	//  263  691:invokevirtual   #269 <Method String TypedArray.getString(int)>
	//  264  694:putfield        #142 <Field String dimensionRatio>
		dimensionRatioValue = (0.0F / 0.0F);
	//  265  697:aload_0         
	//  266  698:ldc2            #270 <Float (0.0F / 0.0F)>
	//  267  701:putfield        #144 <Field float dimensionRatioValue>
		dimensionRatioSide = -1;
	//  268  704:aload_0         
	//  269  705:iconst_m1       
	//  270  706:putfield        #146 <Field int dimensionRatioSide>
		attributeset = ((AttributeSet) (dimensionRatio));
	//  271  709:aload_0         
	//  272  710:getfield        #142 <Field String dimensionRatio>
	//  273  713:astore_2        
		if(attributeset == null)
			break; /* Loop/switch isn't completed */
	//  274  714:aload_2         
	//  275  715:ifnull          2030
		l = ((String) (attributeset)).length();
	//  276  718:aload_2         
	//  277  719:invokevirtual   #275 <Method int String.length()>
	//  278  722:istore          8
		j = dimensionRatio.indexOf(',');
	//  279  724:aload_0         
	//  280  725:getfield        #142 <Field String dimensionRatio>
	//  281  728:bipush          44
	//  282  730:invokevirtual   #278 <Method int String.indexOf(int)>
	//  283  733:istore          6
		if(j > 0 && j < l - 1)
	//* 284  735:iload           6
	//* 285  737:ifle            802
	//* 286  740:iload           6
	//* 287  742:iload           8
	//* 288  744:iconst_1        
	//* 289  745:isub            
	//* 290  746:icmpge          802
		{
			attributeset = ((AttributeSet) (dimensionRatio.substring(0, j)));
	//  291  749:aload_0         
	//  292  750:getfield        #142 <Field String dimensionRatio>
	//  293  753:iconst_0        
	//  294  754:iload           6
	//  295  756:invokevirtual   #282 <Method String String.substring(int, int)>
	//  296  759:astore_2        
			if(((String) (attributeset)).equalsIgnoreCase("W"))
	//* 297  760:aload_2         
	//* 298  761:ldc2            #284 <String "W">
	//* 299  764:invokevirtual   #288 <Method boolean String.equalsIgnoreCase(String)>
	//* 300  767:ifeq            778
				dimensionRatioSide = 0;
	//  301  770:aload_0         
	//  302  771:iconst_0        
	//  303  772:putfield        #146 <Field int dimensionRatioSide>
			else
	//* 304  775:goto            793
			if(((String) (attributeset)).equalsIgnoreCase("H"))
	//* 305  778:aload_2         
	//* 306  779:ldc2            #290 <String "H">
	//* 307  782:invokevirtual   #288 <Method boolean String.equalsIgnoreCase(String)>
	//* 308  785:ifeq            793
				dimensionRatioSide = 1;
	//  309  788:aload_0         
	//  310  789:iconst_1        
	//  311  790:putfield        #146 <Field int dimensionRatioSide>
			j++;
	//  312  793:iload           6
	//  313  795:iconst_1        
	//  314  796:iadd            
	//  315  797:istore          6
		} else
	//* 316  799:goto            805
		{
			j = 0;
	//  317  802:iconst_0        
	//  318  803:istore          6
		}
		i1 = dimensionRatio.indexOf(':');
	//  319  805:aload_0         
	//  320  806:getfield        #142 <Field String dimensionRatio>
	//  321  809:bipush          58
	//  322  811:invokevirtual   #278 <Method int String.indexOf(int)>
	//  323  814:istore          9
		if(i1 < 0 || i1 >= l - 1) goto _L48; else goto _L47
	//  324  816:iload           9
	//  325  818:iflt            931
	//  326  821:iload           9
	//  327  823:iload           8
	//  328  825:iconst_1        
	//  329  826:isub            
	//  330  827:icmpge          931
_L47:
		String s;
		attributeset = ((AttributeSet) (dimensionRatio.substring(j, i1)));
	//  331  830:aload_0         
	//  332  831:getfield        #142 <Field String dimensionRatio>
	//  333  834:iload           6
	//  334  836:iload           9
	//  335  838:invokevirtual   #282 <Method String String.substring(int, int)>
	//  336  841:astore_2        
		s = dimensionRatio.substring(i1 + 1);
	//  337  842:aload_0         
	//  338  843:getfield        #142 <Field String dimensionRatio>
	//  339  846:iload           9
	//  340  848:iconst_1        
	//  341  849:iadd            
	//  342  850:invokevirtual   #292 <Method String String.substring(int)>
	//  343  853:astore          10
		if(((String) (attributeset)).length() <= 0 || s.length() <= 0)
			break; /* Loop/switch isn't completed */
	//  344  855:aload_2         
	//  345  856:invokevirtual   #275 <Method int String.length()>
	//  346  859:ifle            2030
	//  347  862:aload           10
	//  348  864:invokevirtual   #275 <Method int String.length()>
	//  349  867:ifle            2030
		float f;
		float f1;
		f = Float.parseFloat(((String) (attributeset)));
	//  350  870:aload_2         
	//  351  871:invokestatic    #298 <Method float Float.parseFloat(String)>
	//  352  874:fstore_3        
		f1 = Float.parseFloat(s);
	//  353  875:aload           10
	//  354  877:invokestatic    #298 <Method float Float.parseFloat(String)>
	//  355  880:fstore          4
		if(f <= 0.0F || f1 <= 0.0F)
			break; /* Loop/switch isn't completed */
	//  356  882:fload_3         
	//  357  883:fconst_0        
	//  358  884:fcmpl           
	//  359  885:ifle            2030
	//  360  888:fload           4
	//  361  890:fconst_0        
	//  362  891:fcmpl           
	//  363  892:ifle            2030
		if(dimensionRatioSide == 1)
	//* 364  895:aload_0         
	//* 365  896:getfield        #146 <Field int dimensionRatioSide>
	//* 366  899:iconst_1        
	//* 367  900:icmpne          917
		{
			dimensionRatioValue = Math.abs(f1 / f);
	//  368  903:aload_0         
	//  369  904:fload           4
	//  370  906:fload_3         
	//  371  907:fdiv            
	//  372  908:invokestatic    #304 <Method float Math.abs(float)>
	//  373  911:putfield        #144 <Field float dimensionRatioValue>
			break; /* Loop/switch isn't completed */
	//  374  914:goto            2030
		}
		try
		{
			dimensionRatioValue = Math.abs(f / f1);
	//  375  917:aload_0         
	//  376  918:fload_3         
	//  377  919:fload           4
	//  378  921:fdiv            
	//  379  922:invokestatic    #304 <Method float Math.abs(float)>
	//  380  925:putfield        #144 <Field float dimensionRatioValue>
		}
	//* 381  928:goto            2030
	//* 382  931:aload_0         
	//* 383  932:getfield        #142 <Field String dimensionRatio>
	//* 384  935:iload           6
	//* 385  937:invokevirtual   #292 <Method String String.substring(int)>
	//* 386  940:astore_2        
	//* 387  941:aload_2         
	//* 388  942:invokevirtual   #275 <Method int String.length()>
	//* 389  945:ifle            2030
	//* 390  948:aload_0         
	//* 391  949:aload_2         
	//* 392  950:invokestatic    #298 <Method float Float.parseFloat(String)>
	//* 393  953:putfield        #144 <Field float dimensionRatioValue>
	//* 394  956:goto            2030
	//* 395  959:aload_0         
	//* 396  960:fconst_0        
	//* 397  961:aload_1         
	//* 398  962:iload           6
	//* 399  964:aload_0         
	//* 400  965:getfield        #170 <Field float matchConstraintPercentHeight>
	//* 401  968:invokevirtual   #265 <Method float TypedArray.getFloat(int, float)>
	//* 402  971:invokestatic    #308 <Method float Math.max(float, float)>
	//* 403  974:putfield        #170 <Field float matchConstraintPercentHeight>
	//* 404  977:goto            2030
	//* 405  980:aload_0         
	//* 406  981:aload_1         
	//* 407  982:iload           6
	//* 408  984:aload_0         
	//* 409  985:getfield        #166 <Field int matchConstraintMaxHeight>
	//* 410  988:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 411  991:putfield        #166 <Field int matchConstraintMaxHeight>
	//* 412  994:goto            2030
	//* 413  997:aload_1         
	//* 414  998:iload           6
	//* 415 1000:aload_0         
	//* 416 1001:getfield        #166 <Field int matchConstraintMaxHeight>
	//* 417 1004:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 418 1007:bipush          -2
	//* 419 1009:icmpne          2030
	//* 420 1012:aload_0         
	//* 421 1013:bipush          -2
	//* 422 1015:putfield        #166 <Field int matchConstraintMaxHeight>
	//* 423 1018:goto            2030
	//* 424 1021:aload_0         
	//* 425 1022:aload_1         
	//* 426 1023:iload           6
	//* 427 1025:aload_0         
	//* 428 1026:getfield        #162 <Field int matchConstraintMinHeight>
	//* 429 1029:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 430 1032:putfield        #162 <Field int matchConstraintMinHeight>
	//* 431 1035:goto            2030
	//* 432 1038:aload_1         
	//* 433 1039:iload           6
	//* 434 1041:aload_0         
	//* 435 1042:getfield        #162 <Field int matchConstraintMinHeight>
	//* 436 1045:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 437 1048:bipush          -2
	//* 438 1050:icmpne          2030
	//* 439 1053:aload_0         
	//* 440 1054:bipush          -2
	//* 441 1056:putfield        #162 <Field int matchConstraintMinHeight>
	//* 442 1059:goto            2030
	//* 443 1062:aload_0         
	//* 444 1063:fconst_0        
	//* 445 1064:aload_1         
	//* 446 1065:iload           6
	//* 447 1067:aload_0         
	//* 448 1068:getfield        #168 <Field float matchConstraintPercentWidth>
	//* 449 1071:invokevirtual   #265 <Method float TypedArray.getFloat(int, float)>
	//* 450 1074:invokestatic    #308 <Method float Math.max(float, float)>
	//* 451 1077:putfield        #168 <Field float matchConstraintPercentWidth>
	//* 452 1080:goto            2030
	//* 453 1083:aload_0         
	//* 454 1084:aload_1         
	//* 455 1085:iload           6
	//* 456 1087:aload_0         
	//* 457 1088:getfield        #164 <Field int matchConstraintMaxWidth>
	//* 458 1091:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 459 1094:putfield        #164 <Field int matchConstraintMaxWidth>
	//* 460 1097:goto            2030
	//* 461 1100:aload_1         
	//* 462 1101:iload           6
	//* 463 1103:aload_0         
	//* 464 1104:getfield        #164 <Field int matchConstraintMaxWidth>
	//* 465 1107:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 466 1110:bipush          -2
	//* 467 1112:icmpne          2030
	//* 468 1115:aload_0         
	//* 469 1116:bipush          -2
	//* 470 1118:putfield        #164 <Field int matchConstraintMaxWidth>
	//* 471 1121:goto            2030
	//* 472 1124:aload_0         
	//* 473 1125:aload_1         
	//* 474 1126:iload           6
	//* 475 1128:aload_0         
	//* 476 1129:getfield        #160 <Field int matchConstraintMinWidth>
	//* 477 1132:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 478 1135:putfield        #160 <Field int matchConstraintMinWidth>
	//* 479 1138:goto            2030
	//* 480 1141:aload_1         
	//* 481 1142:iload           6
	//* 482 1144:aload_0         
	//* 483 1145:getfield        #160 <Field int matchConstraintMinWidth>
	//* 484 1148:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 485 1151:bipush          -2
	//* 486 1153:icmpne          2030
	//* 487 1156:aload_0         
	//* 488 1157:bipush          -2
	//* 489 1159:putfield        #160 <Field int matchConstraintMinWidth>
	//* 490 1162:goto            2030
	//* 491 1165:aload_0         
	//* 492 1166:aload_1         
	//* 493 1167:iload           6
	//* 494 1169:iconst_0        
	//* 495 1170:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 496 1173:putfield        #158 <Field int matchConstraintDefaultHeight>
	//* 497 1176:aload_0         
	//* 498 1177:getfield        #158 <Field int matchConstraintDefaultHeight>
	//* 499 1180:iconst_1        
	//* 500 1181:icmpne          2030
	//* 501 1184:ldc2            #313 <String "ConstraintLayout">
	//* 502 1187:ldc2            #315 <String "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.">
	//* 503 1190:invokestatic    #321 <Method int Log.e(String, String)>
	//* 504 1193:pop             
	//* 505 1194:goto            2030
	//* 506 1197:aload_0         
	//* 507 1198:aload_1         
	//* 508 1199:iload           6
	//* 509 1201:iconst_0        
	//* 510 1202:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 511 1205:putfield        #156 <Field int matchConstraintDefaultWidth>
	//* 512 1208:aload_0         
	//* 513 1209:getfield        #156 <Field int matchConstraintDefaultWidth>
	//* 514 1212:iconst_1        
	//* 515 1213:icmpne          2030
	//* 516 1216:ldc2            #313 <String "ConstraintLayout">
	//* 517 1219:ldc2            #323 <String "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.">
	//* 518 1222:invokestatic    #321 <Method int Log.e(String, String)>
	//* 519 1225:pop             
	//* 520 1226:goto            2030
	//* 521 1229:aload_0         
	//* 522 1230:aload_1         
	//* 523 1231:iload           6
	//* 524 1233:aload_0         
	//* 525 1234:getfield        #140 <Field float verticalBias>
	//* 526 1237:invokevirtual   #265 <Method float TypedArray.getFloat(int, float)>
	//* 527 1240:putfield        #140 <Field float verticalBias>
	//* 528 1243:goto            2030
	//* 529 1246:aload_0         
	//* 530 1247:aload_1         
	//* 531 1248:iload           6
	//* 532 1250:aload_0         
	//* 533 1251:getfield        #138 <Field float horizontalBias>
	//* 534 1254:invokevirtual   #265 <Method float TypedArray.getFloat(int, float)>
	//* 535 1257:putfield        #138 <Field float horizontalBias>
	//* 536 1260:goto            2030
	//* 537 1263:aload_0         
	//* 538 1264:aload_1         
	//* 539 1265:iload           6
	//* 540 1267:aload_0         
	//* 541 1268:getfield        #180 <Field boolean constrainedHeight>
	//* 542 1271:invokevirtual   #327 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 543 1274:putfield        #180 <Field boolean constrainedHeight>
	//* 544 1277:goto            2030
	//* 545 1280:aload_0         
	//* 546 1281:aload_1         
	//* 547 1282:iload           6
	//* 548 1284:aload_0         
	//* 549 1285:getfield        #178 <Field boolean constrainedWidth>
	//* 550 1288:invokevirtual   #327 <Method boolean TypedArray.getBoolean(int, boolean)>
	//* 551 1291:putfield        #178 <Field boolean constrainedWidth>
	//* 552 1294:goto            2030
	//* 553 1297:aload_0         
	//* 554 1298:aload_1         
	//* 555 1299:iload           6
	//* 556 1301:aload_0         
	//* 557 1302:getfield        #135 <Field int goneEndMargin>
	//* 558 1305:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 559 1308:putfield        #135 <Field int goneEndMargin>
	//* 560 1311:goto            2030
	//* 561 1314:aload_0         
	//* 562 1315:aload_1         
	//* 563 1316:iload           6
	//* 564 1318:aload_0         
	//* 565 1319:getfield        #133 <Field int goneStartMargin>
	//* 566 1322:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 567 1325:putfield        #133 <Field int goneStartMargin>
	//* 568 1328:goto            2030
	//* 569 1331:aload_0         
	//* 570 1332:aload_1         
	//* 571 1333:iload           6
	//* 572 1335:aload_0         
	//* 573 1336:getfield        #131 <Field int goneBottomMargin>
	//* 574 1339:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 575 1342:putfield        #131 <Field int goneBottomMargin>
	//* 576 1345:goto            2030
	//* 577 1348:aload_0         
	//* 578 1349:aload_1         
	//* 579 1350:iload           6
	//* 580 1352:aload_0         
	//* 581 1353:getfield        #129 <Field int goneRightMargin>
	//* 582 1356:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 583 1359:putfield        #129 <Field int goneRightMargin>
	//* 584 1362:goto            2030
	//* 585 1365:aload_0         
	//* 586 1366:aload_1         
	//* 587 1367:iload           6
	//* 588 1369:aload_0         
	//* 589 1370:getfield        #127 <Field int goneTopMargin>
	//* 590 1373:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 591 1376:putfield        #127 <Field int goneTopMargin>
	//* 592 1379:goto            2030
	//* 593 1382:aload_0         
	//* 594 1383:aload_1         
	//* 595 1384:iload           6
	//* 596 1386:aload_0         
	//* 597 1387:getfield        #125 <Field int goneLeftMargin>
	//* 598 1390:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 599 1393:putfield        #125 <Field int goneLeftMargin>
	//* 600 1396:goto            2030
	//* 601 1399:aload_0         
	//* 602 1400:aload_1         
	//* 603 1401:iload           6
	//* 604 1403:aload_0         
	//* 605 1404:getfield        #123 <Field int endToEnd>
	//* 606 1407:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 607 1410:putfield        #123 <Field int endToEnd>
	//* 608 1413:aload_0         
	//* 609 1414:getfield        #123 <Field int endToEnd>
	//* 610 1417:iconst_m1       
	//* 611 1418:icmpne          2030
	//* 612 1421:aload_0         
	//* 613 1422:aload_1         
	//* 614 1423:iload           6
	//* 615 1425:iconst_m1       
	//* 616 1426:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 617 1429:putfield        #123 <Field int endToEnd>
	//* 618 1432:goto            2030
	//* 619 1435:aload_0         
	//* 620 1436:aload_1         
	//* 621 1437:iload           6
	//* 622 1439:aload_0         
	//* 623 1440:getfield        #121 <Field int endToStart>
	//* 624 1443:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 625 1446:putfield        #121 <Field int endToStart>
	//* 626 1449:aload_0         
	//* 627 1450:getfield        #121 <Field int endToStart>
	//* 628 1453:iconst_m1       
	//* 629 1454:icmpne          2030
	//* 630 1457:aload_0         
	//* 631 1458:aload_1         
	//* 632 1459:iload           6
	//* 633 1461:iconst_m1       
	//* 634 1462:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 635 1465:putfield        #121 <Field int endToStart>
	//* 636 1468:goto            2030
	//* 637 1471:aload_0         
	//* 638 1472:aload_1         
	//* 639 1473:iload           6
	//* 640 1475:aload_0         
	//* 641 1476:getfield        #119 <Field int startToStart>
	//* 642 1479:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 643 1482:putfield        #119 <Field int startToStart>
	//* 644 1485:aload_0         
	//* 645 1486:getfield        #119 <Field int startToStart>
	//* 646 1489:iconst_m1       
	//* 647 1490:icmpne          2030
	//* 648 1493:aload_0         
	//* 649 1494:aload_1         
	//* 650 1495:iload           6
	//* 651 1497:iconst_m1       
	//* 652 1498:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 653 1501:putfield        #119 <Field int startToStart>
	//* 654 1504:goto            2030
	//* 655 1507:aload_0         
	//* 656 1508:aload_1         
	//* 657 1509:iload           6
	//* 658 1511:aload_0         
	//* 659 1512:getfield        #117 <Field int startToEnd>
	//* 660 1515:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 661 1518:putfield        #117 <Field int startToEnd>
	//* 662 1521:aload_0         
	//* 663 1522:getfield        #117 <Field int startToEnd>
	//* 664 1525:iconst_m1       
	//* 665 1526:icmpne          2030
	//* 666 1529:aload_0         
	//* 667 1530:aload_1         
	//* 668 1531:iload           6
	//* 669 1533:iconst_m1       
	//* 670 1534:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 671 1537:putfield        #117 <Field int startToEnd>
	//* 672 1540:goto            2030
	//* 673 1543:aload_0         
	//* 674 1544:aload_1         
	//* 675 1545:iload           6
	//* 676 1547:aload_0         
	//* 677 1548:getfield        #109 <Field int baselineToBaseline>
	//* 678 1551:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 679 1554:putfield        #109 <Field int baselineToBaseline>
	//* 680 1557:aload_0         
	//* 681 1558:getfield        #109 <Field int baselineToBaseline>
	//* 682 1561:iconst_m1       
	//* 683 1562:icmpne          2030
	//* 684 1565:aload_0         
	//* 685 1566:aload_1         
	//* 686 1567:iload           6
	//* 687 1569:iconst_m1       
	//* 688 1570:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 689 1573:putfield        #109 <Field int baselineToBaseline>
	//* 690 1576:goto            2030
	//* 691 1579:aload_0         
	//* 692 1580:aload_1         
	//* 693 1581:iload           6
	//* 694 1583:aload_0         
	//* 695 1584:getfield        #107 <Field int bottomToBottom>
	//* 696 1587:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 697 1590:putfield        #107 <Field int bottomToBottom>
	//* 698 1593:aload_0         
	//* 699 1594:getfield        #107 <Field int bottomToBottom>
	//* 700 1597:iconst_m1       
	//* 701 1598:icmpne          2030
	//* 702 1601:aload_0         
	//* 703 1602:aload_1         
	//* 704 1603:iload           6
	//* 705 1605:iconst_m1       
	//* 706 1606:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 707 1609:putfield        #107 <Field int bottomToBottom>
	//* 708 1612:goto            2030
	//* 709 1615:aload_0         
	//* 710 1616:aload_1         
	//* 711 1617:iload           6
	//* 712 1619:aload_0         
	//* 713 1620:getfield        #105 <Field int bottomToTop>
	//* 714 1623:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 715 1626:putfield        #105 <Field int bottomToTop>
	//* 716 1629:aload_0         
	//* 717 1630:getfield        #105 <Field int bottomToTop>
	//* 718 1633:iconst_m1       
	//* 719 1634:icmpne          2030
	//* 720 1637:aload_0         
	//* 721 1638:aload_1         
	//* 722 1639:iload           6
	//* 723 1641:iconst_m1       
	//* 724 1642:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 725 1645:putfield        #105 <Field int bottomToTop>
	//* 726 1648:goto            2030
	//* 727 1651:aload_0         
	//* 728 1652:aload_1         
	//* 729 1653:iload           6
	//* 730 1655:aload_0         
	//* 731 1656:getfield        #103 <Field int topToBottom>
	//* 732 1659:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 733 1662:putfield        #103 <Field int topToBottom>
	//* 734 1665:aload_0         
	//* 735 1666:getfield        #103 <Field int topToBottom>
	//* 736 1669:iconst_m1       
	//* 737 1670:icmpne          2030
	//* 738 1673:aload_0         
	//* 739 1674:aload_1         
	//* 740 1675:iload           6
	//* 741 1677:iconst_m1       
	//* 742 1678:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 743 1681:putfield        #103 <Field int topToBottom>
	//* 744 1684:goto            2030
	//* 745 1687:aload_0         
	//* 746 1688:aload_1         
	//* 747 1689:iload           6
	//* 748 1691:aload_0         
	//* 749 1692:getfield        #101 <Field int topToTop>
	//* 750 1695:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 751 1698:putfield        #101 <Field int topToTop>
	//* 752 1701:aload_0         
	//* 753 1702:getfield        #101 <Field int topToTop>
	//* 754 1705:iconst_m1       
	//* 755 1706:icmpne          2030
	//* 756 1709:aload_0         
	//* 757 1710:aload_1         
	//* 758 1711:iload           6
	//* 759 1713:iconst_m1       
	//* 760 1714:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 761 1717:putfield        #101 <Field int topToTop>
	//* 762 1720:goto            2030
	//* 763 1723:aload_0         
	//* 764 1724:aload_1         
	//* 765 1725:iload           6
	//* 766 1727:aload_0         
	//* 767 1728:getfield        #99  <Field int rightToRight>
	//* 768 1731:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 769 1734:putfield        #99  <Field int rightToRight>
	//* 770 1737:aload_0         
	//* 771 1738:getfield        #99  <Field int rightToRight>
	//* 772 1741:iconst_m1       
	//* 773 1742:icmpne          2030
	//* 774 1745:aload_0         
	//* 775 1746:aload_1         
	//* 776 1747:iload           6
	//* 777 1749:iconst_m1       
	//* 778 1750:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 779 1753:putfield        #99  <Field int rightToRight>
	//* 780 1756:goto            2030
	//* 781 1759:aload_0         
	//* 782 1760:aload_1         
	//* 783 1761:iload           6
	//* 784 1763:aload_0         
	//* 785 1764:getfield        #97  <Field int rightToLeft>
	//* 786 1767:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 787 1770:putfield        #97  <Field int rightToLeft>
	//* 788 1773:aload_0         
	//* 789 1774:getfield        #97  <Field int rightToLeft>
	//* 790 1777:iconst_m1       
	//* 791 1778:icmpne          2030
	//* 792 1781:aload_0         
	//* 793 1782:aload_1         
	//* 794 1783:iload           6
	//* 795 1785:iconst_m1       
	//* 796 1786:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 797 1789:putfield        #97  <Field int rightToLeft>
	//* 798 1792:goto            2030
	//* 799 1795:aload_0         
	//* 800 1796:aload_1         
	//* 801 1797:iload           6
	//* 802 1799:aload_0         
	//* 803 1800:getfield        #95  <Field int leftToRight>
	//* 804 1803:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 805 1806:putfield        #95  <Field int leftToRight>
	//* 806 1809:aload_0         
	//* 807 1810:getfield        #95  <Field int leftToRight>
	//* 808 1813:iconst_m1       
	//* 809 1814:icmpne          2030
	//* 810 1817:aload_0         
	//* 811 1818:aload_1         
	//* 812 1819:iload           6
	//* 813 1821:iconst_m1       
	//* 814 1822:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 815 1825:putfield        #95  <Field int leftToRight>
	//* 816 1828:goto            2030
	//* 817 1831:aload_0         
	//* 818 1832:aload_1         
	//* 819 1833:iload           6
	//* 820 1835:aload_0         
	//* 821 1836:getfield        #93  <Field int leftToLeft>
	//* 822 1839:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 823 1842:putfield        #93  <Field int leftToLeft>
	//* 824 1845:aload_0         
	//* 825 1846:getfield        #93  <Field int leftToLeft>
	//* 826 1849:iconst_m1       
	//* 827 1850:icmpne          2030
	//* 828 1853:aload_0         
	//* 829 1854:aload_1         
	//* 830 1855:iload           6
	//* 831 1857:iconst_m1       
	//* 832 1858:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 833 1861:putfield        #93  <Field int leftToLeft>
	//* 834 1864:goto            2030
	//* 835 1867:aload_0         
	//* 836 1868:aload_1         
	//* 837 1869:iload           6
	//* 838 1871:aload_0         
	//* 839 1872:getfield        #91  <Field float guidePercent>
	//* 840 1875:invokevirtual   #265 <Method float TypedArray.getFloat(int, float)>
	//* 841 1878:putfield        #91  <Field float guidePercent>
	//* 842 1881:goto            2030
	//* 843 1884:aload_0         
	//* 844 1885:aload_1         
	//* 845 1886:iload           6
	//* 846 1888:aload_0         
	//* 847 1889:getfield        #88  <Field int guideEnd>
	//* 848 1892:invokevirtual   #258 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//* 849 1895:putfield        #88  <Field int guideEnd>
	//* 850 1898:goto            2030
	//* 851 1901:aload_0         
	//* 852 1902:aload_1         
	//* 853 1903:iload           6
	//* 854 1905:aload_0         
	//* 855 1906:getfield        #86  <Field int guideBegin>
	//* 856 1909:invokevirtual   #258 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//* 857 1912:putfield        #86  <Field int guideBegin>
	//* 858 1915:goto            2030
	//* 859 1918:aload_0         
	//* 860 1919:aload_1         
	//* 861 1920:iload           6
	//* 862 1922:aload_0         
	//* 863 1923:getfield        #115 <Field float circleAngle>
	//* 864 1926:invokevirtual   #265 <Method float TypedArray.getFloat(int, float)>
	//* 865 1929:ldc2            #331 <Float 360F>
	//* 866 1932:frem            
	//* 867 1933:putfield        #115 <Field float circleAngle>
	//* 868 1936:aload_0         
	//* 869 1937:getfield        #115 <Field float circleAngle>
	//* 870 1940:fstore_3        
	//* 871 1941:fload_3         
	//* 872 1942:fconst_0        
	//* 873 1943:fcmpg           
	//* 874 1944:ifge            2030
	//* 875 1947:aload_0         
	//* 876 1948:ldc2            #331 <Float 360F>
	//* 877 1951:fload_3         
	//* 878 1952:fsub            
	//* 879 1953:ldc2            #331 <Float 360F>
	//* 880 1956:frem            
	//* 881 1957:putfield        #115 <Field float circleAngle>
	//* 882 1960:goto            2030
	//* 883 1963:aload_0         
	//* 884 1964:aload_1         
	//* 885 1965:iload           6
	//* 886 1967:aload_0         
	//* 887 1968:getfield        #113 <Field int circleRadius>
	//* 888 1971:invokevirtual   #311 <Method int TypedArray.getDimensionPixelSize(int, int)>
	//* 889 1974:putfield        #113 <Field int circleRadius>
	//* 890 1977:goto            2030
	//* 891 1980:aload_0         
	//* 892 1981:aload_1         
	//* 893 1982:iload           6
	//* 894 1984:aload_0         
	//* 895 1985:getfield        #111 <Field int circleConstraint>
	//* 896 1988:invokevirtual   #330 <Method int TypedArray.getResourceId(int, int)>
	//* 897 1991:putfield        #111 <Field int circleConstraint>
	//* 898 1994:aload_0         
	//* 899 1995:getfield        #111 <Field int circleConstraint>
	//* 900 1998:iconst_m1       
	//* 901 1999:icmpne          2030
	//* 902 2002:aload_0         
	//* 903 2003:aload_1         
	//* 904 2004:iload           6
	//* 905 2006:iconst_m1       
	//* 906 2007:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 907 2010:putfield        #111 <Field int circleConstraint>
	//* 908 2013:goto            2030
	//* 909 2016:aload_0         
	//* 910 2017:aload_1         
	//* 911 2018:iload           6
	//* 912 2020:aload_0         
	//* 913 2021:getfield        #176 <Field int orientation>
	//* 914 2024:invokevirtual   #261 <Method int TypedArray.getInt(int, int)>
	//* 915 2027:putfield        #176 <Field int orientation>
	//* 916 2030:iload           5
	//* 917 2032:iconst_1        
	//* 918 2033:iadd            
	//* 919 2034:istore          5
	//* 920 2036:goto            346
	//* 921 2039:aload_1         
	//* 922 2040:invokevirtual   #334 <Method void TypedArray.recycle()>
	//* 923 2043:aload_0         
	//* 924 2044:invokevirtual   #337 <Method void validate()>
	//* 925 2047:return          
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset) { }
	//  926 2048:astore_2        
		break; /* Loop/switch isn't completed */
	//  927 2049:goto            2030
_L48:
		attributeset = ((AttributeSet) (dimensionRatio.substring(j)));
		if(((String) (attributeset)).length() <= 0)
			break; /* Loop/switch isn't completed */
		dimensionRatioValue = Float.parseFloat(((String) (attributeset)));
		break; /* Loop/switch isn't completed */
_L39:
		matchConstraintPercentHeight = Math.max(0.0F, ((TypedArray) (context)).getFloat(j, matchConstraintPercentHeight));
		break; /* Loop/switch isn't completed */
_L38:
		try
		{
			matchConstraintMaxHeight = ((TypedArray) (context)).getDimensionPixelSize(j, matchConstraintMaxHeight);
			break; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset) { }
	//  928 2052:astore_2        
		if(((TypedArray) (context)).getInt(j, matchConstraintMaxHeight) == -2)
			matchConstraintMaxHeight = -2;
		break; /* Loop/switch isn't completed */
	//  929 2053:goto            997
_L37:
		try
		{
			matchConstraintMinHeight = ((TypedArray) (context)).getDimensionPixelSize(j, matchConstraintMinHeight);
			break; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset) { }
	//  930 2056:astore_2        
		if(((TypedArray) (context)).getInt(j, matchConstraintMinHeight) == -2)
			matchConstraintMinHeight = -2;
		break; /* Loop/switch isn't completed */
	//  931 2057:goto            1038
_L36:
		matchConstraintPercentWidth = Math.max(0.0F, ((TypedArray) (context)).getFloat(j, matchConstraintPercentWidth));
		break; /* Loop/switch isn't completed */
_L35:
		try
		{
			matchConstraintMaxWidth = ((TypedArray) (context)).getDimensionPixelSize(j, matchConstraintMaxWidth);
			break; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset) { }
	//  932 2060:astore_2        
		if(((TypedArray) (context)).getInt(j, matchConstraintMaxWidth) == -2)
			matchConstraintMaxWidth = -2;
		break; /* Loop/switch isn't completed */
	//  933 2061:goto            1100
_L34:
		try
		{
			matchConstraintMinWidth = ((TypedArray) (context)).getDimensionPixelSize(j, matchConstraintMinWidth);
			break; /* Loop/switch isn't completed */
		}
		// Misplaced declaration of an exception variable
		catch(AttributeSet attributeset) { }
	//  934 2064:astore_2        
		if(((TypedArray) (context)).getInt(j, matchConstraintMinWidth) == -2)
			matchConstraintMinWidth = -2;
		break; /* Loop/switch isn't completed */
	//  935 2065:goto            1141
_L33:
		matchConstraintDefaultHeight = ((TypedArray) (context)).getInt(j, 0);
		if(matchConstraintDefaultHeight == 1)
			Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
		break; /* Loop/switch isn't completed */
_L32:
		matchConstraintDefaultWidth = ((TypedArray) (context)).getInt(j, 0);
		if(matchConstraintDefaultWidth == 1)
			Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
		break; /* Loop/switch isn't completed */
_L31:
		verticalBias = ((TypedArray) (context)).getFloat(j, verticalBias);
		break; /* Loop/switch isn't completed */
_L30:
		horizontalBias = ((TypedArray) (context)).getFloat(j, horizontalBias);
		break; /* Loop/switch isn't completed */
_L29:
		constrainedHeight = ((TypedArray) (context)).getBoolean(j, constrainedHeight);
		break; /* Loop/switch isn't completed */
_L28:
		constrainedWidth = ((TypedArray) (context)).getBoolean(j, constrainedWidth);
		break; /* Loop/switch isn't completed */
_L27:
		goneEndMargin = ((TypedArray) (context)).getDimensionPixelSize(j, goneEndMargin);
		break; /* Loop/switch isn't completed */
_L26:
		goneStartMargin = ((TypedArray) (context)).getDimensionPixelSize(j, goneStartMargin);
		break; /* Loop/switch isn't completed */
_L25:
		goneBottomMargin = ((TypedArray) (context)).getDimensionPixelSize(j, goneBottomMargin);
		break; /* Loop/switch isn't completed */
_L24:
		goneRightMargin = ((TypedArray) (context)).getDimensionPixelSize(j, goneRightMargin);
		break; /* Loop/switch isn't completed */
_L23:
		goneTopMargin = ((TypedArray) (context)).getDimensionPixelSize(j, goneTopMargin);
		break; /* Loop/switch isn't completed */
_L22:
		goneLeftMargin = ((TypedArray) (context)).getDimensionPixelSize(j, goneLeftMargin);
		break; /* Loop/switch isn't completed */
_L21:
		endToEnd = ((TypedArray) (context)).getResourceId(j, endToEnd);
		if(endToEnd == -1)
			endToEnd = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L20:
		endToStart = ((TypedArray) (context)).getResourceId(j, endToStart);
		if(endToStart == -1)
			endToStart = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L19:
		startToStart = ((TypedArray) (context)).getResourceId(j, startToStart);
		if(startToStart == -1)
			startToStart = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L18:
		startToEnd = ((TypedArray) (context)).getResourceId(j, startToEnd);
		if(startToEnd == -1)
			startToEnd = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L17:
		baselineToBaseline = ((TypedArray) (context)).getResourceId(j, baselineToBaseline);
		if(baselineToBaseline == -1)
			baselineToBaseline = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L16:
		bottomToBottom = ((TypedArray) (context)).getResourceId(j, bottomToBottom);
		if(bottomToBottom == -1)
			bottomToBottom = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L15:
		bottomToTop = ((TypedArray) (context)).getResourceId(j, bottomToTop);
		if(bottomToTop == -1)
			bottomToTop = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L14:
		topToBottom = ((TypedArray) (context)).getResourceId(j, topToBottom);
		if(topToBottom == -1)
			topToBottom = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L13:
		topToTop = ((TypedArray) (context)).getResourceId(j, topToTop);
		if(topToTop == -1)
			topToTop = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L12:
		rightToRight = ((TypedArray) (context)).getResourceId(j, rightToRight);
		if(rightToRight == -1)
			rightToRight = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L11:
		rightToLeft = ((TypedArray) (context)).getResourceId(j, rightToLeft);
		if(rightToLeft == -1)
			rightToLeft = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L10:
		leftToRight = ((TypedArray) (context)).getResourceId(j, leftToRight);
		if(leftToRight == -1)
			leftToRight = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L9:
		leftToLeft = ((TypedArray) (context)).getResourceId(j, leftToLeft);
		if(leftToLeft == -1)
			leftToLeft = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L8:
		guidePercent = ((TypedArray) (context)).getFloat(j, guidePercent);
		break; /* Loop/switch isn't completed */
_L7:
		guideEnd = ((TypedArray) (context)).getDimensionPixelOffset(j, guideEnd);
		break; /* Loop/switch isn't completed */
_L6:
		guideBegin = ((TypedArray) (context)).getDimensionPixelOffset(j, guideBegin);
		break; /* Loop/switch isn't completed */
_L5:
		circleAngle = ((TypedArray) (context)).getFloat(j, circleAngle) % 360F;
		f = circleAngle;
		if(f < 0.0F)
			circleAngle = (360F - f) % 360F;
		break; /* Loop/switch isn't completed */
_L4:
		circleRadius = ((TypedArray) (context)).getDimensionPixelSize(j, circleRadius);
		break; /* Loop/switch isn't completed */
_L3:
		circleConstraint = ((TypedArray) (context)).getResourceId(j, circleConstraint);
		if(circleConstraint == -1)
			circleConstraint = ((TypedArray) (context)).getInt(j, -1);
		break; /* Loop/switch isn't completed */
_L2:
		orientation = ((TypedArray) (context)).getInt(j, orientation);
		i++;
		if(true) goto _L50; else goto _L49
_L49:
		((TypedArray) (context)).recycle();
		validate();
		return;
	}

	public ConstraintLayout$LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		super(layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #340 <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
		guideBegin = -1;
	//    3    5:aload_0         
	//    4    6:iconst_m1       
	//    5    7:putfield        #86  <Field int guideBegin>
		guideEnd = -1;
	//    6   10:aload_0         
	//    7   11:iconst_m1       
	//    8   12:putfield        #88  <Field int guideEnd>
		guidePercent = -1F;
	//    9   15:aload_0         
	//   10   16:ldc1            #89  <Float -1F>
	//   11   18:putfield        #91  <Field float guidePercent>
		leftToLeft = -1;
	//   12   21:aload_0         
	//   13   22:iconst_m1       
	//   14   23:putfield        #93  <Field int leftToLeft>
		leftToRight = -1;
	//   15   26:aload_0         
	//   16   27:iconst_m1       
	//   17   28:putfield        #95  <Field int leftToRight>
		rightToLeft = -1;
	//   18   31:aload_0         
	//   19   32:iconst_m1       
	//   20   33:putfield        #97  <Field int rightToLeft>
		rightToRight = -1;
	//   21   36:aload_0         
	//   22   37:iconst_m1       
	//   23   38:putfield        #99  <Field int rightToRight>
		topToTop = -1;
	//   24   41:aload_0         
	//   25   42:iconst_m1       
	//   26   43:putfield        #101 <Field int topToTop>
		topToBottom = -1;
	//   27   46:aload_0         
	//   28   47:iconst_m1       
	//   29   48:putfield        #103 <Field int topToBottom>
		bottomToTop = -1;
	//   30   51:aload_0         
	//   31   52:iconst_m1       
	//   32   53:putfield        #105 <Field int bottomToTop>
		bottomToBottom = -1;
	//   33   56:aload_0         
	//   34   57:iconst_m1       
	//   35   58:putfield        #107 <Field int bottomToBottom>
		baselineToBaseline = -1;
	//   36   61:aload_0         
	//   37   62:iconst_m1       
	//   38   63:putfield        #109 <Field int baselineToBaseline>
		circleConstraint = -1;
	//   39   66:aload_0         
	//   40   67:iconst_m1       
	//   41   68:putfield        #111 <Field int circleConstraint>
		circleRadius = 0;
	//   42   71:aload_0         
	//   43   72:iconst_0        
	//   44   73:putfield        #113 <Field int circleRadius>
		circleAngle = 0.0F;
	//   45   76:aload_0         
	//   46   77:fconst_0        
	//   47   78:putfield        #115 <Field float circleAngle>
		startToEnd = -1;
	//   48   81:aload_0         
	//   49   82:iconst_m1       
	//   50   83:putfield        #117 <Field int startToEnd>
		startToStart = -1;
	//   51   86:aload_0         
	//   52   87:iconst_m1       
	//   53   88:putfield        #119 <Field int startToStart>
		endToStart = -1;
	//   54   91:aload_0         
	//   55   92:iconst_m1       
	//   56   93:putfield        #121 <Field int endToStart>
		endToEnd = -1;
	//   57   96:aload_0         
	//   58   97:iconst_m1       
	//   59   98:putfield        #123 <Field int endToEnd>
		goneLeftMargin = -1;
	//   60  101:aload_0         
	//   61  102:iconst_m1       
	//   62  103:putfield        #125 <Field int goneLeftMargin>
		goneTopMargin = -1;
	//   63  106:aload_0         
	//   64  107:iconst_m1       
	//   65  108:putfield        #127 <Field int goneTopMargin>
		goneRightMargin = -1;
	//   66  111:aload_0         
	//   67  112:iconst_m1       
	//   68  113:putfield        #129 <Field int goneRightMargin>
		goneBottomMargin = -1;
	//   69  116:aload_0         
	//   70  117:iconst_m1       
	//   71  118:putfield        #131 <Field int goneBottomMargin>
		goneStartMargin = -1;
	//   72  121:aload_0         
	//   73  122:iconst_m1       
	//   74  123:putfield        #133 <Field int goneStartMargin>
		goneEndMargin = -1;
	//   75  126:aload_0         
	//   76  127:iconst_m1       
	//   77  128:putfield        #135 <Field int goneEndMargin>
		horizontalBias = 0.5F;
	//   78  131:aload_0         
	//   79  132:ldc1            #136 <Float 0.5F>
	//   80  134:putfield        #138 <Field float horizontalBias>
		verticalBias = 0.5F;
	//   81  137:aload_0         
	//   82  138:ldc1            #136 <Float 0.5F>
	//   83  140:putfield        #140 <Field float verticalBias>
		dimensionRatio = null;
	//   84  143:aload_0         
	//   85  144:aconst_null     
	//   86  145:putfield        #142 <Field String dimensionRatio>
		dimensionRatioValue = 0.0F;
	//   87  148:aload_0         
	//   88  149:fconst_0        
	//   89  150:putfield        #144 <Field float dimensionRatioValue>
		dimensionRatioSide = 1;
	//   90  153:aload_0         
	//   91  154:iconst_1        
	//   92  155:putfield        #146 <Field int dimensionRatioSide>
		horizontalWeight = -1F;
	//   93  158:aload_0         
	//   94  159:ldc1            #89  <Float -1F>
	//   95  161:putfield        #148 <Field float horizontalWeight>
		verticalWeight = -1F;
	//   96  164:aload_0         
	//   97  165:ldc1            #89  <Float -1F>
	//   98  167:putfield        #150 <Field float verticalWeight>
		horizontalChainStyle = 0;
	//   99  170:aload_0         
	//  100  171:iconst_0        
	//  101  172:putfield        #152 <Field int horizontalChainStyle>
		verticalChainStyle = 0;
	//  102  175:aload_0         
	//  103  176:iconst_0        
	//  104  177:putfield        #154 <Field int verticalChainStyle>
		matchConstraintDefaultWidth = 0;
	//  105  180:aload_0         
	//  106  181:iconst_0        
	//  107  182:putfield        #156 <Field int matchConstraintDefaultWidth>
		matchConstraintDefaultHeight = 0;
	//  108  185:aload_0         
	//  109  186:iconst_0        
	//  110  187:putfield        #158 <Field int matchConstraintDefaultHeight>
		matchConstraintMinWidth = 0;
	//  111  190:aload_0         
	//  112  191:iconst_0        
	//  113  192:putfield        #160 <Field int matchConstraintMinWidth>
		matchConstraintMinHeight = 0;
	//  114  195:aload_0         
	//  115  196:iconst_0        
	//  116  197:putfield        #162 <Field int matchConstraintMinHeight>
		matchConstraintMaxWidth = 0;
	//  117  200:aload_0         
	//  118  201:iconst_0        
	//  119  202:putfield        #164 <Field int matchConstraintMaxWidth>
		matchConstraintMaxHeight = 0;
	//  120  205:aload_0         
	//  121  206:iconst_0        
	//  122  207:putfield        #166 <Field int matchConstraintMaxHeight>
		matchConstraintPercentWidth = 1.0F;
	//  123  210:aload_0         
	//  124  211:fconst_1        
	//  125  212:putfield        #168 <Field float matchConstraintPercentWidth>
		matchConstraintPercentHeight = 1.0F;
	//  126  215:aload_0         
	//  127  216:fconst_1        
	//  128  217:putfield        #170 <Field float matchConstraintPercentHeight>
		editorAbsoluteX = -1;
	//  129  220:aload_0         
	//  130  221:iconst_m1       
	//  131  222:putfield        #172 <Field int editorAbsoluteX>
		editorAbsoluteY = -1;
	//  132  225:aload_0         
	//  133  226:iconst_m1       
	//  134  227:putfield        #174 <Field int editorAbsoluteY>
		orientation = -1;
	//  135  230:aload_0         
	//  136  231:iconst_m1       
	//  137  232:putfield        #176 <Field int orientation>
		constrainedWidth = false;
	//  138  235:aload_0         
	//  139  236:iconst_0        
	//  140  237:putfield        #178 <Field boolean constrainedWidth>
		constrainedHeight = false;
	//  141  240:aload_0         
	//  142  241:iconst_0        
	//  143  242:putfield        #180 <Field boolean constrainedHeight>
		horizontalDimensionFixed = true;
	//  144  245:aload_0         
	//  145  246:iconst_1        
	//  146  247:putfield        #182 <Field boolean horizontalDimensionFixed>
		verticalDimensionFixed = true;
	//  147  250:aload_0         
	//  148  251:iconst_1        
	//  149  252:putfield        #184 <Field boolean verticalDimensionFixed>
		needsBaseline = false;
	//  150  255:aload_0         
	//  151  256:iconst_0        
	//  152  257:putfield        #186 <Field boolean needsBaseline>
		isGuideline = false;
	//  153  260:aload_0         
	//  154  261:iconst_0        
	//  155  262:putfield        #188 <Field boolean isGuideline>
		isHelper = false;
	//  156  265:aload_0         
	//  157  266:iconst_0        
	//  158  267:putfield        #190 <Field boolean isHelper>
		isInPlaceholder = false;
	//  159  270:aload_0         
	//  160  271:iconst_0        
	//  161  272:putfield        #192 <Field boolean isInPlaceholder>
		resolvedLeftToLeft = -1;
	//  162  275:aload_0         
	//  163  276:iconst_m1       
	//  164  277:putfield        #194 <Field int resolvedLeftToLeft>
		resolvedLeftToRight = -1;
	//  165  280:aload_0         
	//  166  281:iconst_m1       
	//  167  282:putfield        #196 <Field int resolvedLeftToRight>
		resolvedRightToLeft = -1;
	//  168  285:aload_0         
	//  169  286:iconst_m1       
	//  170  287:putfield        #198 <Field int resolvedRightToLeft>
		resolvedRightToRight = -1;
	//  171  290:aload_0         
	//  172  291:iconst_m1       
	//  173  292:putfield        #200 <Field int resolvedRightToRight>
		resolveGoneLeftMargin = -1;
	//  174  295:aload_0         
	//  175  296:iconst_m1       
	//  176  297:putfield        #202 <Field int resolveGoneLeftMargin>
		resolveGoneRightMargin = -1;
	//  177  300:aload_0         
	//  178  301:iconst_m1       
	//  179  302:putfield        #204 <Field int resolveGoneRightMargin>
		resolvedHorizontalBias = 0.5F;
	//  180  305:aload_0         
	//  181  306:ldc1            #136 <Float 0.5F>
	//  182  308:putfield        #206 <Field float resolvedHorizontalBias>
		widget = new ConstraintWidget();
	//  183  311:aload_0         
	//  184  312:new             #208 <Class ConstraintWidget>
	//  185  315:dup             
	//  186  316:invokespecial   #211 <Method void ConstraintWidget()>
	//  187  319:putfield        #213 <Field ConstraintWidget widget>
		helped = false;
	//  188  322:aload_0         
	//  189  323:iconst_0        
	//  190  324:putfield        #215 <Field boolean helped>
	//  191  327:return          
	}
}
