// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.util.SparseIntArray;

// Referenced classes of package android.support.constraint:
//			ConstraintLayout

private static class ConstraintLayout$LayoutParams$Table
{

	public static final int ANDROID_ORIENTATION = 1;
	public static final int LAYOUT_CONSTRAINED_HEIGHT = 28;
	public static final int LAYOUT_CONSTRAINED_WIDTH = 27;
	public static final int LAYOUT_CONSTRAINT_BASELINE_CREATOR = 43;
	public static final int LAYOUT_CONSTRAINT_BASELINE_TO_BASELINE_OF = 16;
	public static final int LAYOUT_CONSTRAINT_BOTTOM_CREATOR = 42;
	public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_BOTTOM_OF = 15;
	public static final int LAYOUT_CONSTRAINT_BOTTOM_TO_TOP_OF = 14;
	public static final int LAYOUT_CONSTRAINT_CIRCLE = 2;
	public static final int LAYOUT_CONSTRAINT_CIRCLE_ANGLE = 4;
	public static final int LAYOUT_CONSTRAINT_CIRCLE_RADIUS = 3;
	public static final int LAYOUT_CONSTRAINT_DIMENSION_RATIO = 44;
	public static final int LAYOUT_CONSTRAINT_END_TO_END_OF = 20;
	public static final int LAYOUT_CONSTRAINT_END_TO_START_OF = 19;
	public static final int LAYOUT_CONSTRAINT_GUIDE_BEGIN = 5;
	public static final int LAYOUT_CONSTRAINT_GUIDE_END = 6;
	public static final int LAYOUT_CONSTRAINT_GUIDE_PERCENT = 7;
	public static final int LAYOUT_CONSTRAINT_HEIGHT_DEFAULT = 32;
	public static final int LAYOUT_CONSTRAINT_HEIGHT_MAX = 37;
	public static final int LAYOUT_CONSTRAINT_HEIGHT_MIN = 36;
	public static final int LAYOUT_CONSTRAINT_HEIGHT_PERCENT = 38;
	public static final int LAYOUT_CONSTRAINT_HORIZONTAL_BIAS = 29;
	public static final int LAYOUT_CONSTRAINT_HORIZONTAL_CHAINSTYLE = 47;
	public static final int LAYOUT_CONSTRAINT_HORIZONTAL_WEIGHT = 45;
	public static final int LAYOUT_CONSTRAINT_LEFT_CREATOR = 39;
	public static final int LAYOUT_CONSTRAINT_LEFT_TO_LEFT_OF = 8;
	public static final int LAYOUT_CONSTRAINT_LEFT_TO_RIGHT_OF = 9;
	public static final int LAYOUT_CONSTRAINT_RIGHT_CREATOR = 41;
	public static final int LAYOUT_CONSTRAINT_RIGHT_TO_LEFT_OF = 10;
	public static final int LAYOUT_CONSTRAINT_RIGHT_TO_RIGHT_OF = 11;
	public static final int LAYOUT_CONSTRAINT_START_TO_END_OF = 17;
	public static final int LAYOUT_CONSTRAINT_START_TO_START_OF = 18;
	public static final int LAYOUT_CONSTRAINT_TOP_CREATOR = 40;
	public static final int LAYOUT_CONSTRAINT_TOP_TO_BOTTOM_OF = 13;
	public static final int LAYOUT_CONSTRAINT_TOP_TO_TOP_OF = 12;
	public static final int LAYOUT_CONSTRAINT_VERTICAL_BIAS = 30;
	public static final int LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE = 48;
	public static final int LAYOUT_CONSTRAINT_VERTICAL_WEIGHT = 46;
	public static final int LAYOUT_CONSTRAINT_WIDTH_DEFAULT = 31;
	public static final int LAYOUT_CONSTRAINT_WIDTH_MAX = 34;
	public static final int LAYOUT_CONSTRAINT_WIDTH_MIN = 33;
	public static final int LAYOUT_CONSTRAINT_WIDTH_PERCENT = 35;
	public static final int LAYOUT_EDITOR_ABSOLUTEX = 49;
	public static final int LAYOUT_EDITOR_ABSOLUTEY = 50;
	public static final int LAYOUT_GONE_MARGIN_BOTTOM = 24;
	public static final int LAYOUT_GONE_MARGIN_END = 26;
	public static final int LAYOUT_GONE_MARGIN_LEFT = 21;
	public static final int LAYOUT_GONE_MARGIN_RIGHT = 23;
	public static final int LAYOUT_GONE_MARGIN_START = 25;
	public static final int LAYOUT_GONE_MARGIN_TOP = 22;
	public static final int UNUSED = 0;
	public static final SparseIntArray map;

	static 
	{
		map = new SparseIntArray();
	//    0    0:new             #119 <Class SparseIntArray>
	//    1    3:dup             
	//    2    4:invokespecial   #122 <Method void SparseIntArray()>
	//    3    7:putstatic       #124 <Field SparseIntArray map>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
	//    4   10:getstatic       #124 <Field SparseIntArray map>
	//    5   13:getstatic       #129 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf>
	//    6   16:bipush          8
	//    7   18:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
	//    8   21:getstatic       #124 <Field SparseIntArray map>
	//    9   24:getstatic       #136 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintLeft_toRightOf>
	//   10   27:bipush          9
	//   11   29:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
	//   12   32:getstatic       #124 <Field SparseIntArray map>
	//   13   35:getstatic       #139 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintRight_toLeftOf>
	//   14   38:bipush          10
	//   15   40:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
	//   16   43:getstatic       #124 <Field SparseIntArray map>
	//   17   46:getstatic       #142 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintRight_toRightOf>
	//   18   49:bipush          11
	//   19   51:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
	//   20   54:getstatic       #124 <Field SparseIntArray map>
	//   21   57:getstatic       #145 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintTop_toTopOf>
	//   22   60:bipush          12
	//   23   62:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
	//   24   65:getstatic       #124 <Field SparseIntArray map>
	//   25   68:getstatic       #148 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintTop_toBottomOf>
	//   26   71:bipush          13
	//   27   73:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
	//   28   76:getstatic       #124 <Field SparseIntArray map>
	//   29   79:getstatic       #151 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toTopOf>
	//   30   82:bipush          14
	//   31   84:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
	//   32   87:getstatic       #124 <Field SparseIntArray map>
	//   33   90:getstatic       #154 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf>
	//   34   93:bipush          15
	//   35   95:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
	//   36   98:getstatic       #124 <Field SparseIntArray map>
	//   37  101:getstatic       #157 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf>
	//   38  104:bipush          16
	//   39  106:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircle, 2);
	//   40  109:getstatic       #124 <Field SparseIntArray map>
	//   41  112:getstatic       #160 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintCircle>
	//   42  115:iconst_2        
	//   43  116:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
	//   44  119:getstatic       #124 <Field SparseIntArray map>
	//   45  122:getstatic       #163 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintCircleRadius>
	//   46  125:iconst_3        
	//   47  126:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
	//   48  129:getstatic       #124 <Field SparseIntArray map>
	//   49  132:getstatic       #166 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintCircleAngle>
	//   50  135:iconst_4        
	//   51  136:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
	//   52  139:getstatic       #124 <Field SparseIntArray map>
	//   53  142:getstatic       #169 <Field int R$styleable.ConstraintLayout_Layout_layout_editor_absoluteX>
	//   54  145:bipush          49
	//   55  147:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
	//   56  150:getstatic       #124 <Field SparseIntArray map>
	//   57  153:getstatic       #172 <Field int R$styleable.ConstraintLayout_Layout_layout_editor_absoluteY>
	//   58  156:bipush          50
	//   59  158:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
	//   60  161:getstatic       #124 <Field SparseIntArray map>
	//   61  164:getstatic       #175 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintGuide_begin>
	//   62  167:iconst_5        
	//   63  168:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
	//   64  171:getstatic       #124 <Field SparseIntArray map>
	//   65  174:getstatic       #178 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintGuide_end>
	//   66  177:bipush          6
	//   67  179:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
	//   68  182:getstatic       #124 <Field SparseIntArray map>
	//   69  185:getstatic       #181 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintGuide_percent>
	//   70  188:bipush          7
	//   71  190:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_android_orientation, 1);
	//   72  193:getstatic       #124 <Field SparseIntArray map>
	//   73  196:getstatic       #184 <Field int R$styleable.ConstraintLayout_Layout_android_orientation>
	//   74  199:iconst_1        
	//   75  200:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
	//   76  203:getstatic       #124 <Field SparseIntArray map>
	//   77  206:getstatic       #187 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintStart_toEndOf>
	//   78  209:bipush          17
	//   79  211:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
	//   80  214:getstatic       #124 <Field SparseIntArray map>
	//   81  217:getstatic       #190 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintStart_toStartOf>
	//   82  220:bipush          18
	//   83  222:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
	//   84  225:getstatic       #124 <Field SparseIntArray map>
	//   85  228:getstatic       #193 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toStartOf>
	//   86  231:bipush          19
	//   87  233:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
	//   88  236:getstatic       #124 <Field SparseIntArray map>
	//   89  239:getstatic       #196 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintEnd_toEndOf>
	//   90  242:bipush          20
	//   91  244:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
	//   92  247:getstatic       #124 <Field SparseIntArray map>
	//   93  250:getstatic       #199 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginLeft>
	//   94  253:bipush          21
	//   95  255:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginTop, 22);
	//   96  258:getstatic       #124 <Field SparseIntArray map>
	//   97  261:getstatic       #202 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginTop>
	//   98  264:bipush          22
	//   99  266:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginRight, 23);
	//  100  269:getstatic       #124 <Field SparseIntArray map>
	//  101  272:getstatic       #205 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginRight>
	//  102  275:bipush          23
	//  103  277:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
	//  104  280:getstatic       #124 <Field SparseIntArray map>
	//  105  283:getstatic       #208 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginBottom>
	//  106  286:bipush          24
	//  107  288:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginStart, 25);
	//  108  291:getstatic       #124 <Field SparseIntArray map>
	//  109  294:getstatic       #211 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginStart>
	//  110  297:bipush          25
	//  111  299:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
	//  112  302:getstatic       #124 <Field SparseIntArray map>
	//  113  305:getstatic       #214 <Field int R$styleable.ConstraintLayout_Layout_layout_goneMarginEnd>
	//  114  308:bipush          26
	//  115  310:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
	//  116  313:getstatic       #124 <Field SparseIntArray map>
	//  117  316:getstatic       #217 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_bias>
	//  118  319:bipush          29
	//  119  321:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
	//  120  324:getstatic       #124 <Field SparseIntArray map>
	//  121  327:getstatic       #220 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintVertical_bias>
	//  122  330:bipush          30
	//  123  332:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
	//  124  335:getstatic       #124 <Field SparseIntArray map>
	//  125  338:getstatic       #223 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintDimensionRatio>
	//  126  341:bipush          44
	//  127  343:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
	//  128  346:getstatic       #124 <Field SparseIntArray map>
	//  129  349:getstatic       #226 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_weight>
	//  130  352:bipush          45
	//  131  354:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
	//  132  357:getstatic       #124 <Field SparseIntArray map>
	//  133  360:getstatic       #229 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintVertical_weight>
	//  134  363:bipush          46
	//  135  365:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
	//  136  368:getstatic       #124 <Field SparseIntArray map>
	//  137  371:getstatic       #232 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle>
	//  138  374:bipush          47
	//  139  376:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
	//  140  379:getstatic       #124 <Field SparseIntArray map>
	//  141  382:getstatic       #235 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintVertical_chainStyle>
	//  142  385:bipush          48
	//  143  387:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constrainedWidth, 27);
	//  144  390:getstatic       #124 <Field SparseIntArray map>
	//  145  393:getstatic       #238 <Field int R$styleable.ConstraintLayout_Layout_layout_constrainedWidth>
	//  146  396:bipush          27
	//  147  398:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constrainedHeight, 28);
	//  148  401:getstatic       #124 <Field SparseIntArray map>
	//  149  404:getstatic       #241 <Field int R$styleable.ConstraintLayout_Layout_layout_constrainedHeight>
	//  150  407:bipush          28
	//  151  409:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
	//  152  412:getstatic       #124 <Field SparseIntArray map>
	//  153  415:getstatic       #244 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintWidth_default>
	//  154  418:bipush          31
	//  155  420:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
	//  156  423:getstatic       #124 <Field SparseIntArray map>
	//  157  426:getstatic       #247 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHeight_default>
	//  158  429:bipush          32
	//  159  431:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
	//  160  434:getstatic       #124 <Field SparseIntArray map>
	//  161  437:getstatic       #250 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintWidth_min>
	//  162  440:bipush          33
	//  163  442:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
	//  164  445:getstatic       #124 <Field SparseIntArray map>
	//  165  448:getstatic       #253 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintWidth_max>
	//  166  451:bipush          34
	//  167  453:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
	//  168  456:getstatic       #124 <Field SparseIntArray map>
	//  169  459:getstatic       #256 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintWidth_percent>
	//  170  462:bipush          35
	//  171  464:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
	//  172  467:getstatic       #124 <Field SparseIntArray map>
	//  173  470:getstatic       #259 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHeight_min>
	//  174  473:bipush          36
	//  175  475:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
	//  176  478:getstatic       #124 <Field SparseIntArray map>
	//  177  481:getstatic       #262 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHeight_max>
	//  178  484:bipush          37
	//  179  486:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
	//  180  489:getstatic       #124 <Field SparseIntArray map>
	//  181  492:getstatic       #265 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintHeight_percent>
	//  182  495:bipush          38
	//  183  497:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
	//  184  500:getstatic       #124 <Field SparseIntArray map>
	//  185  503:getstatic       #268 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintLeft_creator>
	//  186  506:bipush          39
	//  187  508:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
	//  188  511:getstatic       #124 <Field SparseIntArray map>
	//  189  514:getstatic       #271 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintTop_creator>
	//  190  517:bipush          40
	//  191  519:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
	//  192  522:getstatic       #124 <Field SparseIntArray map>
	//  193  525:getstatic       #274 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintRight_creator>
	//  194  528:bipush          41
	//  195  530:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
	//  196  533:getstatic       #124 <Field SparseIntArray map>
	//  197  536:getstatic       #277 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBottom_creator>
	//  198  539:bipush          42
	//  199  541:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
		map.append(R.styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
	//  200  544:getstatic       #124 <Field SparseIntArray map>
	//  201  547:getstatic       #280 <Field int R$styleable.ConstraintLayout_Layout_layout_constraintBaseline_creator>
	//  202  550:bipush          43
	//  203  552:invokevirtual   #133 <Method void SparseIntArray.append(int, int)>
	//* 204  555:return          
	}

	private ConstraintLayout$LayoutParams$Table()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #282 <Method void Object()>
	//    2    4:return          
	}
}
