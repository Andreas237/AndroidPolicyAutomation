// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.util.SparseIntArray;

// Referenced classes of package android.support.constraint:
//			ConstraintLayout

private static class ConstraintLayout$LayoutParams$Table
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
