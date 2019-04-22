// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.constraint.solver.Metrics;
import android.support.constraint.solver.widgets.ConstraintAnchor;
import android.support.constraint.solver.widgets.ConstraintWidget;
import android.support.constraint.solver.widgets.ConstraintWidgetContainer;
import android.support.constraint.solver.widgets.Guideline;
import android.support.constraint.solver.widgets.ResolutionAnchor;
import android.support.constraint.solver.widgets.ResolutionDimension;
import android.util.*;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package android.support.constraint:
//			ConstraintSet, Placeholder, ConstraintHelper, Guideline

public class ConstraintLayout extends ViewGroup
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

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

		public LayoutParams(int i, int j)
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

		public LayoutParams(Context context, AttributeSet attributeset)
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
		//		               0 2030
		//		               1 2016
		//		               2 1980
		//		               3 1963
		//		               4 1918
		//		               5 1901
		//		               6 1884
		//		               7 1867
		//		               8 1831
		//		               9 1795
		//		               10 1759
		//		               11 1723
		//		               12 1687
		//		               13 1651
		//		               14 1615
		//		               15 1579
		//		               16 1543
		//		               17 1507
		//		               18 1471
		//		               19 1435
		//		               20 1399
		//		               21 1382
		//		               22 1365
		//		               23 1348
		//		               24 1331
		//		               25 1314
		//		               26 1297
		//		               27 1280
		//		               28 1263
		//		               29 1246
		//		               30 1229
		//		               31 1197
		//		               32 1165
		//		               33 1124
		//		               34 1083
		//		               35 1062
		//		               36 1021
		//		               37 980
		//		               38 959
		//		               39 2030
		//		               40 2030
		//		               41 2030
		//		               42 2030
		//		               43 588
		//		               44 687
		//		               45 670
		//		               46 653
		//		               47 639
		//		               48 625
		//		               49 608
		//		               50 591;
		//  212  369:tableswitch     0 50: default 588
		//		               0 2030
		//		               1 2016
		//		               2 1980
		//		               3 1963
		//		               4 1918
		//		               5 1901
		//		               6 1884
		//		               7 1867
		//		               8 1831
		//		               9 1795
		//		               10 1759
		//		               11 1723
		//		               12 1687
		//		               13 1651
		//		               14 1615
		//		               15 1579
		//		               16 1543
		//		               17 1507
		//		               18 1471
		//		               19 1435
		//		               20 1399
		//		               21 1382
		//		               22 1365
		//		               23 1348
		//		               24 1331
		//		               25 1314
		//		               26 1297
		//		               27 1280
		//		               28 1263
		//		               29 1246
		//		               30 1229
		//		               31 1197
		//		               32 1165
		//		               33 1124
		//		               34 1083
		//		               35 1062
		//		               36 1021
		//		               37 980
		//		               38 959
		//		               39 2030
		//		               40 2030
		//		               41 2030
		//		               42 2030
		//		               43 588
		//		               44 687
		//		               45 670
		//		               46 653
		//		               47 639
		//		               48 625
		//		               49 608
		//		               50 591
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

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
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

	private static class LayoutParams.Table
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


	public ConstraintLayout(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #59  <Method void ViewGroup(Context)>
		mChildrenByIds = new SparseArray();
	//    3    5:aload_0         
	//    4    6:new             #61  <Class SparseArray>
	//    5    9:dup             
	//    6   10:invokespecial   #64  <Method void SparseArray()>
	//    7   13:putfield        #66  <Field SparseArray mChildrenByIds>
		mConstraintHelpers = new ArrayList(4);
	//    8   16:aload_0         
	//    9   17:new             #68  <Class ArrayList>
	//   10   20:dup             
	//   11   21:iconst_4        
	//   12   22:invokespecial   #71  <Method void ArrayList(int)>
	//   13   25:putfield        #73  <Field ArrayList mConstraintHelpers>
		mVariableDimensionsWidgets = new ArrayList(100);
	//   14   28:aload_0         
	//   15   29:new             #68  <Class ArrayList>
	//   16   32:dup             
	//   17   33:bipush          100
	//   18   35:invokespecial   #71  <Method void ArrayList(int)>
	//   19   38:putfield        #75  <Field ArrayList mVariableDimensionsWidgets>
		mLayoutWidget = new ConstraintWidgetContainer();
	//   20   41:aload_0         
	//   21   42:new             #77  <Class ConstraintWidgetContainer>
	//   22   45:dup             
	//   23   46:invokespecial   #78  <Method void ConstraintWidgetContainer()>
	//   24   49:putfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
		mMinWidth = 0;
	//   25   52:aload_0         
	//   26   53:iconst_0        
	//   27   54:putfield        #82  <Field int mMinWidth>
		mMinHeight = 0;
	//   28   57:aload_0         
	//   29   58:iconst_0        
	//   30   59:putfield        #84  <Field int mMinHeight>
		mMaxWidth = 0x7fffffff;
	//   31   62:aload_0         
	//   32   63:ldc1            #85  <Int 0x7fffffff>
	//   33   65:putfield        #87  <Field int mMaxWidth>
		mMaxHeight = 0x7fffffff;
	//   34   68:aload_0         
	//   35   69:ldc1            #85  <Int 0x7fffffff>
	//   36   71:putfield        #89  <Field int mMaxHeight>
		mDirtyHierarchy = true;
	//   37   74:aload_0         
	//   38   75:iconst_1        
	//   39   76:putfield        #91  <Field boolean mDirtyHierarchy>
		mOptimizationLevel = 3;
	//   40   79:aload_0         
	//   41   80:iconst_3        
	//   42   81:putfield        #93  <Field int mOptimizationLevel>
		mConstraintSet = null;
	//   43   84:aload_0         
	//   44   85:aconst_null     
	//   45   86:putfield        #95  <Field ConstraintSet mConstraintSet>
		mConstraintSetId = -1;
	//   46   89:aload_0         
	//   47   90:iconst_m1       
	//   48   91:putfield        #97  <Field int mConstraintSetId>
		mDesignIds = new HashMap();
	//   49   94:aload_0         
	//   50   95:new             #99  <Class HashMap>
	//   51   98:dup             
	//   52   99:invokespecial   #100 <Method void HashMap()>
	//   53  102:putfield        #102 <Field HashMap mDesignIds>
		mLastMeasureWidth = -1;
	//   54  105:aload_0         
	//   55  106:iconst_m1       
	//   56  107:putfield        #104 <Field int mLastMeasureWidth>
		mLastMeasureHeight = -1;
	//   57  110:aload_0         
	//   58  111:iconst_m1       
	//   59  112:putfield        #106 <Field int mLastMeasureHeight>
		mLastMeasureWidthSize = -1;
	//   60  115:aload_0         
	//   61  116:iconst_m1       
	//   62  117:putfield        #108 <Field int mLastMeasureWidthSize>
		mLastMeasureHeightSize = -1;
	//   63  120:aload_0         
	//   64  121:iconst_m1       
	//   65  122:putfield        #110 <Field int mLastMeasureHeightSize>
		mLastMeasureWidthMode = 0;
	//   66  125:aload_0         
	//   67  126:iconst_0        
	//   68  127:putfield        #112 <Field int mLastMeasureWidthMode>
		mLastMeasureHeightMode = 0;
	//   69  130:aload_0         
	//   70  131:iconst_0        
	//   71  132:putfield        #114 <Field int mLastMeasureHeightMode>
		init(((AttributeSet) (null)));
	//   72  135:aload_0         
	//   73  136:aconst_null     
	//   74  137:invokespecial   #118 <Method void init(AttributeSet)>
	//   75  140:return          
	}

	public ConstraintLayout(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #122 <Method void ViewGroup(Context, AttributeSet)>
		mChildrenByIds = new SparseArray();
	//    4    6:aload_0         
	//    5    7:new             #61  <Class SparseArray>
	//    6   10:dup             
	//    7   11:invokespecial   #64  <Method void SparseArray()>
	//    8   14:putfield        #66  <Field SparseArray mChildrenByIds>
		mConstraintHelpers = new ArrayList(4);
	//    9   17:aload_0         
	//   10   18:new             #68  <Class ArrayList>
	//   11   21:dup             
	//   12   22:iconst_4        
	//   13   23:invokespecial   #71  <Method void ArrayList(int)>
	//   14   26:putfield        #73  <Field ArrayList mConstraintHelpers>
		mVariableDimensionsWidgets = new ArrayList(100);
	//   15   29:aload_0         
	//   16   30:new             #68  <Class ArrayList>
	//   17   33:dup             
	//   18   34:bipush          100
	//   19   36:invokespecial   #71  <Method void ArrayList(int)>
	//   20   39:putfield        #75  <Field ArrayList mVariableDimensionsWidgets>
		mLayoutWidget = new ConstraintWidgetContainer();
	//   21   42:aload_0         
	//   22   43:new             #77  <Class ConstraintWidgetContainer>
	//   23   46:dup             
	//   24   47:invokespecial   #78  <Method void ConstraintWidgetContainer()>
	//   25   50:putfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
		mMinWidth = 0;
	//   26   53:aload_0         
	//   27   54:iconst_0        
	//   28   55:putfield        #82  <Field int mMinWidth>
		mMinHeight = 0;
	//   29   58:aload_0         
	//   30   59:iconst_0        
	//   31   60:putfield        #84  <Field int mMinHeight>
		mMaxWidth = 0x7fffffff;
	//   32   63:aload_0         
	//   33   64:ldc1            #85  <Int 0x7fffffff>
	//   34   66:putfield        #87  <Field int mMaxWidth>
		mMaxHeight = 0x7fffffff;
	//   35   69:aload_0         
	//   36   70:ldc1            #85  <Int 0x7fffffff>
	//   37   72:putfield        #89  <Field int mMaxHeight>
		mDirtyHierarchy = true;
	//   38   75:aload_0         
	//   39   76:iconst_1        
	//   40   77:putfield        #91  <Field boolean mDirtyHierarchy>
		mOptimizationLevel = 3;
	//   41   80:aload_0         
	//   42   81:iconst_3        
	//   43   82:putfield        #93  <Field int mOptimizationLevel>
		mConstraintSet = null;
	//   44   85:aload_0         
	//   45   86:aconst_null     
	//   46   87:putfield        #95  <Field ConstraintSet mConstraintSet>
		mConstraintSetId = -1;
	//   47   90:aload_0         
	//   48   91:iconst_m1       
	//   49   92:putfield        #97  <Field int mConstraintSetId>
		mDesignIds = new HashMap();
	//   50   95:aload_0         
	//   51   96:new             #99  <Class HashMap>
	//   52   99:dup             
	//   53  100:invokespecial   #100 <Method void HashMap()>
	//   54  103:putfield        #102 <Field HashMap mDesignIds>
		mLastMeasureWidth = -1;
	//   55  106:aload_0         
	//   56  107:iconst_m1       
	//   57  108:putfield        #104 <Field int mLastMeasureWidth>
		mLastMeasureHeight = -1;
	//   58  111:aload_0         
	//   59  112:iconst_m1       
	//   60  113:putfield        #106 <Field int mLastMeasureHeight>
		mLastMeasureWidthSize = -1;
	//   61  116:aload_0         
	//   62  117:iconst_m1       
	//   63  118:putfield        #108 <Field int mLastMeasureWidthSize>
		mLastMeasureHeightSize = -1;
	//   64  121:aload_0         
	//   65  122:iconst_m1       
	//   66  123:putfield        #110 <Field int mLastMeasureHeightSize>
		mLastMeasureWidthMode = 0;
	//   67  126:aload_0         
	//   68  127:iconst_0        
	//   69  128:putfield        #112 <Field int mLastMeasureWidthMode>
		mLastMeasureHeightMode = 0;
	//   70  131:aload_0         
	//   71  132:iconst_0        
	//   72  133:putfield        #114 <Field int mLastMeasureHeightMode>
		init(attributeset);
	//   73  136:aload_0         
	//   74  137:aload_2         
	//   75  138:invokespecial   #118 <Method void init(AttributeSet)>
	//   76  141:return          
	}

	public ConstraintLayout(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #125 <Method void ViewGroup(Context, AttributeSet, int)>
		mChildrenByIds = new SparseArray();
	//    5    7:aload_0         
	//    6    8:new             #61  <Class SparseArray>
	//    7   11:dup             
	//    8   12:invokespecial   #64  <Method void SparseArray()>
	//    9   15:putfield        #66  <Field SparseArray mChildrenByIds>
		mConstraintHelpers = new ArrayList(4);
	//   10   18:aload_0         
	//   11   19:new             #68  <Class ArrayList>
	//   12   22:dup             
	//   13   23:iconst_4        
	//   14   24:invokespecial   #71  <Method void ArrayList(int)>
	//   15   27:putfield        #73  <Field ArrayList mConstraintHelpers>
		mVariableDimensionsWidgets = new ArrayList(100);
	//   16   30:aload_0         
	//   17   31:new             #68  <Class ArrayList>
	//   18   34:dup             
	//   19   35:bipush          100
	//   20   37:invokespecial   #71  <Method void ArrayList(int)>
	//   21   40:putfield        #75  <Field ArrayList mVariableDimensionsWidgets>
		mLayoutWidget = new ConstraintWidgetContainer();
	//   22   43:aload_0         
	//   23   44:new             #77  <Class ConstraintWidgetContainer>
	//   24   47:dup             
	//   25   48:invokespecial   #78  <Method void ConstraintWidgetContainer()>
	//   26   51:putfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
		mMinWidth = 0;
	//   27   54:aload_0         
	//   28   55:iconst_0        
	//   29   56:putfield        #82  <Field int mMinWidth>
		mMinHeight = 0;
	//   30   59:aload_0         
	//   31   60:iconst_0        
	//   32   61:putfield        #84  <Field int mMinHeight>
		mMaxWidth = 0x7fffffff;
	//   33   64:aload_0         
	//   34   65:ldc1            #85  <Int 0x7fffffff>
	//   35   67:putfield        #87  <Field int mMaxWidth>
		mMaxHeight = 0x7fffffff;
	//   36   70:aload_0         
	//   37   71:ldc1            #85  <Int 0x7fffffff>
	//   38   73:putfield        #89  <Field int mMaxHeight>
		mDirtyHierarchy = true;
	//   39   76:aload_0         
	//   40   77:iconst_1        
	//   41   78:putfield        #91  <Field boolean mDirtyHierarchy>
		mOptimizationLevel = 3;
	//   42   81:aload_0         
	//   43   82:iconst_3        
	//   44   83:putfield        #93  <Field int mOptimizationLevel>
		mConstraintSet = null;
	//   45   86:aload_0         
	//   46   87:aconst_null     
	//   47   88:putfield        #95  <Field ConstraintSet mConstraintSet>
		mConstraintSetId = -1;
	//   48   91:aload_0         
	//   49   92:iconst_m1       
	//   50   93:putfield        #97  <Field int mConstraintSetId>
		mDesignIds = new HashMap();
	//   51   96:aload_0         
	//   52   97:new             #99  <Class HashMap>
	//   53  100:dup             
	//   54  101:invokespecial   #100 <Method void HashMap()>
	//   55  104:putfield        #102 <Field HashMap mDesignIds>
		mLastMeasureWidth = -1;
	//   56  107:aload_0         
	//   57  108:iconst_m1       
	//   58  109:putfield        #104 <Field int mLastMeasureWidth>
		mLastMeasureHeight = -1;
	//   59  112:aload_0         
	//   60  113:iconst_m1       
	//   61  114:putfield        #106 <Field int mLastMeasureHeight>
		mLastMeasureWidthSize = -1;
	//   62  117:aload_0         
	//   63  118:iconst_m1       
	//   64  119:putfield        #108 <Field int mLastMeasureWidthSize>
		mLastMeasureHeightSize = -1;
	//   65  122:aload_0         
	//   66  123:iconst_m1       
	//   67  124:putfield        #110 <Field int mLastMeasureHeightSize>
		mLastMeasureWidthMode = 0;
	//   68  127:aload_0         
	//   69  128:iconst_0        
	//   70  129:putfield        #112 <Field int mLastMeasureWidthMode>
		mLastMeasureHeightMode = 0;
	//   71  132:aload_0         
	//   72  133:iconst_0        
	//   73  134:putfield        #114 <Field int mLastMeasureHeightMode>
		init(attributeset);
	//   74  137:aload_0         
	//   75  138:aload_2         
	//   76  139:invokespecial   #118 <Method void init(AttributeSet)>
	//   77  142:return          
	}

	private final ConstraintWidget getTargetWidget(int i)
	{
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			return ((ConstraintWidget) (mLayoutWidget));
	//    2    4:aload_0         
	//    3    5:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//    4    8:areturn         
		View view = (View)mChildrenByIds.get(i);
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field SparseArray mChildrenByIds>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #131 <Method Object SparseArray.get(int)>
	//    9   17:checkcast       #133 <Class View>
	//   10   20:astore_2        
		if(view == this)
	//*  11   21:aload_2         
	//*  12   22:aload_0         
	//*  13   23:if_acmpne       31
			return ((ConstraintWidget) (mLayoutWidget));
	//   14   26:aload_0         
	//   15   27:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//   16   30:areturn         
		if(view == null)
	//*  17   31:aload_2         
	//*  18   32:ifnonnull       37
			return null;
	//   19   35:aconst_null     
	//   20   36:areturn         
		else
			return ((LayoutParams)view.getLayoutParams()).widget;
	//   21   37:aload_2         
	//   22   38:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   23   41:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//   24   44:getfield        #141 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   25   47:areturn         
	}

	private void init(AttributeSet attributeset)
	{
		android.content.res.Resources.NotFoundException notfoundexception;
		mLayoutWidget.setCompanionWidget(((Object) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #147 <Method void ConstraintWidgetContainer.setCompanionWidget(Object)>
		mChildrenByIds.put(getId(), ((Object) (this)));
	//    4    8:aload_0         
	//    5    9:getfield        #66  <Field SparseArray mChildrenByIds>
	//    6   12:aload_0         
	//    7   13:invokevirtual   #151 <Method int getId()>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #155 <Method void SparseArray.put(int, Object)>
		mConstraintSet = null;
	//   10   20:aload_0         
	//   11   21:aconst_null     
	//   12   22:putfield        #95  <Field ConstraintSet mConstraintSet>
		if(attributeset != null)
	//*  13   25:aload_1         
	//*  14   26:ifnull          251
		{
			attributeset = ((AttributeSet) (getContext().obtainStyledAttributes(attributeset, R.styleable.ConstraintLayout_Layout)));
	//   15   29:aload_0         
	//   16   30:invokevirtual   #159 <Method Context getContext()>
	//   17   33:aload_1         
	//   18   34:getstatic       #165 <Field int[] R$styleable.ConstraintLayout_Layout>
	//   19   37:invokevirtual   #171 <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//   20   40:astore_1        
			int j = ((TypedArray) (attributeset)).getIndexCount();
	//   21   41:aload_1         
	//   22   42:invokevirtual   #176 <Method int TypedArray.getIndexCount()>
	//   23   45:istore_3        
			for(int i = 0; i < j; i++)
	//*  24   46:iconst_0        
	//*  25   47:istore_2        
	//*  26   48:iload_2         
	//*  27   49:iload_3         
	//*  28   50:icmpge          247
			{
				int k = ((TypedArray) (attributeset)).getIndex(i);
	//   29   53:aload_1         
	//   30   54:iload_2         
	//   31   55:invokevirtual   #180 <Method int TypedArray.getIndex(int)>
	//   32   58:istore          4
				if(k == R.styleable.ConstraintLayout_Layout_android_minWidth)
	//*  33   60:iload           4
	//*  34   62:getstatic       #183 <Field int R$styleable.ConstraintLayout_Layout_android_minWidth>
	//*  35   65:icmpne          85
				{
					mMinWidth = ((TypedArray) (attributeset)).getDimensionPixelOffset(k, mMinWidth);
	//   36   68:aload_0         
	//   37   69:aload_1         
	//   38   70:iload           4
	//   39   72:aload_0         
	//   40   73:getfield        #82  <Field int mMinWidth>
	//   41   76:invokevirtual   #187 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   42   79:putfield        #82  <Field int mMinWidth>
					continue;
	//   43   82:goto            240
				}
				if(k == R.styleable.ConstraintLayout_Layout_android_minHeight)
	//*  44   85:iload           4
	//*  45   87:getstatic       #190 <Field int R$styleable.ConstraintLayout_Layout_android_minHeight>
	//*  46   90:icmpne          110
				{
					mMinHeight = ((TypedArray) (attributeset)).getDimensionPixelOffset(k, mMinHeight);
	//   47   93:aload_0         
	//   48   94:aload_1         
	//   49   95:iload           4
	//   50   97:aload_0         
	//   51   98:getfield        #84  <Field int mMinHeight>
	//   52  101:invokevirtual   #187 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   53  104:putfield        #84  <Field int mMinHeight>
					continue;
	//   54  107:goto            240
				}
				if(k == R.styleable.ConstraintLayout_Layout_android_maxWidth)
	//*  55  110:iload           4
	//*  56  112:getstatic       #193 <Field int R$styleable.ConstraintLayout_Layout_android_maxWidth>
	//*  57  115:icmpne          135
				{
					mMaxWidth = ((TypedArray) (attributeset)).getDimensionPixelOffset(k, mMaxWidth);
	//   58  118:aload_0         
	//   59  119:aload_1         
	//   60  120:iload           4
	//   61  122:aload_0         
	//   62  123:getfield        #87  <Field int mMaxWidth>
	//   63  126:invokevirtual   #187 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   64  129:putfield        #87  <Field int mMaxWidth>
					continue;
	//   65  132:goto            240
				}
				if(k == R.styleable.ConstraintLayout_Layout_android_maxHeight)
	//*  66  135:iload           4
	//*  67  137:getstatic       #196 <Field int R$styleable.ConstraintLayout_Layout_android_maxHeight>
	//*  68  140:icmpne          160
				{
					mMaxHeight = ((TypedArray) (attributeset)).getDimensionPixelOffset(k, mMaxHeight);
	//   69  143:aload_0         
	//   70  144:aload_1         
	//   71  145:iload           4
	//   72  147:aload_0         
	//   73  148:getfield        #89  <Field int mMaxHeight>
	//   74  151:invokevirtual   #187 <Method int TypedArray.getDimensionPixelOffset(int, int)>
	//   75  154:putfield        #89  <Field int mMaxHeight>
					continue;
	//   76  157:goto            240
				}
				if(k == R.styleable.ConstraintLayout_Layout_layout_optimizationLevel)
	//*  77  160:iload           4
	//*  78  162:getstatic       #199 <Field int R$styleable.ConstraintLayout_Layout_layout_optimizationLevel>
	//*  79  165:icmpne          185
				{
					mOptimizationLevel = ((TypedArray) (attributeset)).getInt(k, mOptimizationLevel);
	//   80  168:aload_0         
	//   81  169:aload_1         
	//   82  170:iload           4
	//   83  172:aload_0         
	//   84  173:getfield        #93  <Field int mOptimizationLevel>
	//   85  176:invokevirtual   #202 <Method int TypedArray.getInt(int, int)>
	//   86  179:putfield        #93  <Field int mOptimizationLevel>
					continue;
	//   87  182:goto            240
				}
				if(k != R.styleable.ConstraintLayout_Layout_constraintSet)
					continue;
	//   88  185:iload           4
	//   89  187:getstatic       #205 <Field int R$styleable.ConstraintLayout_Layout_constraintSet>
	//   90  190:icmpne          240
				k = ((TypedArray) (attributeset)).getResourceId(k, 0);
	//   91  193:aload_1         
	//   92  194:iload           4
	//   93  196:iconst_0        
	//   94  197:invokevirtual   #208 <Method int TypedArray.getResourceId(int, int)>
	//   95  200:istore          4
				try
				{
					mConstraintSet = new ConstraintSet();
	//   96  202:aload_0         
	//   97  203:new             #210 <Class ConstraintSet>
	//   98  206:dup             
	//   99  207:invokespecial   #211 <Method void ConstraintSet()>
	//  100  210:putfield        #95  <Field ConstraintSet mConstraintSet>
					mConstraintSet.load(getContext(), k);
	//  101  213:aload_0         
	//  102  214:getfield        #95  <Field ConstraintSet mConstraintSet>
	//  103  217:aload_0         
	//  104  218:invokevirtual   #159 <Method Context getContext()>
	//  105  221:iload           4
	//  106  223:invokevirtual   #215 <Method void ConstraintSet.load(Context, int)>
				}
	//* 107  226:goto            234
	//* 108  229:aload_0         
	//* 109  230:aconst_null     
	//* 110  231:putfield        #95  <Field ConstraintSet mConstraintSet>
	//* 111  234:aload_0         
	//* 112  235:iload           4
	//* 113  237:putfield        #97  <Field int mConstraintSetId>
	//* 114  240:iload_2         
	//* 115  241:iconst_1        
	//* 116  242:iadd            
	//* 117  243:istore_2        
	//* 118  244:goto            48
	//* 119  247:aload_1         
	//* 120  248:invokevirtual   #218 <Method void TypedArray.recycle()>
	//* 121  251:aload_0         
	//* 122  252:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 123  255:aload_0         
	//* 124  256:getfield        #93  <Field int mOptimizationLevel>
	//* 125  259:invokevirtual   #221 <Method void ConstraintWidgetContainer.setOptimizationLevel(int)>
	//* 126  262:return          
				// Misplaced declaration of an exception variable
				catch(android.content.res.Resources.NotFoundException notfoundexception)
				{
					mConstraintSet = null;
				}
				mConstraintSetId = k;
			}

			((TypedArray) (attributeset)).recycle();
		}
		mLayoutWidget.setOptimizationLevel(mOptimizationLevel);
	//* 127  263:astore          5
	//* 128  265:goto            229
	}

	private void internalMeasureChildren(int i, int j)
	{
		int i2 = getPaddingTop() + getPaddingBottom();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #226 <Method int getPaddingTop()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #229 <Method int getPaddingBottom()>
	//    4    8:iadd            
	//    5    9:istore          10
		int j2 = getPaddingLeft() + getPaddingRight();
	//    6   11:aload_0         
	//    7   12:invokevirtual   #232 <Method int getPaddingLeft()>
	//    8   15:aload_0         
	//    9   16:invokevirtual   #235 <Method int getPaddingRight()>
	//   10   19:iadd            
	//   11   20:istore          11
		int k2 = getChildCount();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #238 <Method int getChildCount()>
	//   14   26:istore          12
		for(int j1 = 0; j1 < k2; j1++)
	//*  15   28:iconst_0        
	//*  16   29:istore          7
	//*  17   31:iload           7
	//*  18   33:iload           12
	//*  19   35:icmpge          512
		{
			View view = getChildAt(j1);
	//   20   38:aload_0         
	//   21   39:iload           7
	//   22   41:invokevirtual   #242 <Method View getChildAt(int)>
	//   23   44:astore          14
			if(view.getVisibility() == 8)
	//*  24   46:aload           14
	//*  25   48:invokevirtual   #245 <Method int View.getVisibility()>
	//*  26   51:bipush          8
	//*  27   53:icmpne          59
				continue;
	//   28   56:goto            503
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   29   59:aload           14
	//   30   61:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   31   64:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//   32   67:astore          15
			ConstraintWidget constraintwidget = layoutparams.widget;
	//   33   69:aload           15
	//   34   71:getfield        #141 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   35   74:astore          16
			if(layoutparams.isGuideline || layoutparams.isHelper)
	//*  36   76:aload           15
	//*  37   78:getfield        #248 <Field boolean ConstraintLayout$LayoutParams.isGuideline>
	//*  38   81:ifne            503
	//*  39   84:aload           15
	//*  40   86:getfield        #251 <Field boolean ConstraintLayout$LayoutParams.isHelper>
	//*  41   89:ifeq            95
				continue;
	//   42   92:goto            503
			constraintwidget.setVisibility(view.getVisibility());
	//   43   95:aload           16
	//   44   97:aload           14
	//   45   99:invokevirtual   #245 <Method int View.getVisibility()>
	//   46  102:invokevirtual   #256 <Method void ConstraintWidget.setVisibility(int)>
			int k1 = layoutparams.width;
	//   47  105:aload           15
	//   48  107:getfield        #259 <Field int ConstraintLayout$LayoutParams.width>
	//   49  110:istore          8
			int l1 = layoutparams.height;
	//   50  112:aload           15
	//   51  114:getfield        #262 <Field int ConstraintLayout$LayoutParams.height>
	//   52  117:istore          9
			boolean flag;
			if(!layoutparams.horizontalDimensionFixed && !layoutparams.verticalDimensionFixed && (layoutparams.horizontalDimensionFixed || layoutparams.matchConstraintDefaultWidth != 1) && layoutparams.width != -1 && (layoutparams.verticalDimensionFixed || layoutparams.matchConstraintDefaultHeight != 1 && layoutparams.height != -1))
	//*  53  119:aload           15
	//*  54  121:getfield        #265 <Field boolean ConstraintLayout$LayoutParams.horizontalDimensionFixed>
	//*  55  124:ifne            195
	//*  56  127:aload           15
	//*  57  129:getfield        #268 <Field boolean ConstraintLayout$LayoutParams.verticalDimensionFixed>
	//*  58  132:ifne            195
	//*  59  135:aload           15
	//*  60  137:getfield        #265 <Field boolean ConstraintLayout$LayoutParams.horizontalDimensionFixed>
	//*  61  140:ifne            152
	//*  62  143:aload           15
	//*  63  145:getfield        #271 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultWidth>
	//*  64  148:iconst_1        
	//*  65  149:icmpeq          195
	//*  66  152:aload           15
	//*  67  154:getfield        #259 <Field int ConstraintLayout$LayoutParams.width>
	//*  68  157:iconst_m1       
	//*  69  158:icmpeq          195
	//*  70  161:aload           15
	//*  71  163:getfield        #268 <Field boolean ConstraintLayout$LayoutParams.verticalDimensionFixed>
	//*  72  166:ifne            190
	//*  73  169:aload           15
	//*  74  171:getfield        #274 <Field int ConstraintLayout$LayoutParams.matchConstraintDefaultHeight>
	//*  75  174:iconst_1        
	//*  76  175:icmpeq          195
	//*  77  178:aload           15
	//*  78  180:getfield        #262 <Field int ConstraintLayout$LayoutParams.height>
	//*  79  183:iconst_m1       
	//*  80  184:icmpne          190
	//*  81  187:goto            195
				flag = false;
	//   82  190:iconst_0        
	//   83  191:istore_3        
			else
	//*  84  192:goto            197
				flag = true;
	//   85  195:iconst_1        
	//   86  196:istore_3        
			boolean flag1;
			int l;
			int i1;
			if(flag)
	//*  87  197:iload_3         
	//*  88  198:ifeq            428
			{
				if(k1 == 0)
	//*  89  201:iload           8
	//*  90  203:ifne            221
				{
					l = getChildMeasureSpec(i, j2, -2);
	//   91  206:iload_1         
	//   92  207:iload           11
	//   93  209:bipush          -2
	//   94  211:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//   95  214:istore          5
					flag = true;
	//   96  216:iconst_1        
	//   97  217:istore_3        
				} else
	//*  98  218:goto            265
				if(k1 == -1)
	//*  99  221:iload           8
	//* 100  223:iconst_m1       
	//* 101  224:icmpne          241
				{
					l = getChildMeasureSpec(i, j2, -1);
	//  102  227:iload_1         
	//  103  228:iload           11
	//  104  230:iconst_m1       
	//  105  231:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  106  234:istore          5
					flag = false;
	//  107  236:iconst_0        
	//  108  237:istore_3        
				} else
	//* 109  238:goto            265
				{
					if(k1 == -2)
	//* 110  241:iload           8
	//* 111  243:bipush          -2
	//* 112  245:icmpne          253
						flag = true;
	//  113  248:iconst_1        
	//  114  249:istore_3        
					else
	//* 115  250:goto            255
						flag = false;
	//  116  253:iconst_0        
	//  117  254:istore_3        
					l = getChildMeasureSpec(i, j2, k1);
	//  118  255:iload_1         
	//  119  256:iload           11
	//  120  258:iload           8
	//  121  260:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  122  263:istore          5
				}
				if(l1 == 0)
	//* 123  265:iload           9
	//* 124  267:ifne            286
				{
					i1 = getChildMeasureSpec(j, i2, -2);
	//  125  270:iload_2         
	//  126  271:iload           10
	//  127  273:bipush          -2
	//  128  275:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  129  278:istore          6
					flag1 = true;
	//  130  280:iconst_1        
	//  131  281:istore          4
				} else
	//* 132  283:goto            333
				if(l1 == -1)
	//* 133  286:iload           9
	//* 134  288:iconst_m1       
	//* 135  289:icmpne          307
				{
					i1 = getChildMeasureSpec(j, i2, -1);
	//  136  292:iload_2         
	//  137  293:iload           10
	//  138  295:iconst_m1       
	//  139  296:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  140  299:istore          6
					flag1 = false;
	//  141  301:iconst_0        
	//  142  302:istore          4
				} else
	//* 143  304:goto            333
				{
					if(l1 == -2)
	//* 144  307:iload           9
	//* 145  309:bipush          -2
	//* 146  311:icmpne          320
						flag1 = true;
	//  147  314:iconst_1        
	//  148  315:istore          4
					else
	//* 149  317:goto            323
						flag1 = false;
	//  150  320:iconst_0        
	//  151  321:istore          4
					i1 = getChildMeasureSpec(j, i2, l1);
	//  152  323:iload_2         
	//  153  324:iload           10
	//  154  326:iload           9
	//  155  328:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  156  331:istore          6
				}
				view.measure(l, i1);
	//  157  333:aload           14
	//  158  335:iload           5
	//  159  337:iload           6
	//  160  339:invokevirtual   #281 <Method void View.measure(int, int)>
				Metrics metrics = mMetrics;
	//  161  342:aload_0         
	//  162  343:getfield        #283 <Field Metrics mMetrics>
	//  163  346:astore          17
				if(metrics != null)
	//* 164  348:aload           17
	//* 165  350:ifnull          365
					metrics.measures = metrics.measures + 1L;
	//  166  353:aload           17
	//  167  355:aload           17
	//  168  357:getfield        #289 <Field long Metrics.measures>
	//  169  360:lconst_1        
	//  170  361:ladd            
	//  171  362:putfield        #289 <Field long Metrics.measures>
				boolean flag2;
				if(k1 == -2)
	//* 172  365:iload           8
	//* 173  367:bipush          -2
	//* 174  369:icmpne          378
					flag2 = true;
	//  175  372:iconst_1        
	//  176  373:istore          13
				else
	//* 177  375:goto            381
					flag2 = false;
	//  178  378:iconst_0        
	//  179  379:istore          13
				constraintwidget.setWidthWrapContent(flag2);
	//  180  381:aload           16
	//  181  383:iload           13
	//  182  385:invokevirtual   #293 <Method void ConstraintWidget.setWidthWrapContent(boolean)>
				if(l1 == -2)
	//* 183  388:iload           9
	//* 184  390:bipush          -2
	//* 185  392:icmpne          401
					flag2 = true;
	//  186  395:iconst_1        
	//  187  396:istore          13
				else
	//* 188  398:goto            404
					flag2 = false;
	//  189  401:iconst_0        
	//  190  402:istore          13
				constraintwidget.setHeightWrapContent(flag2);
	//  191  404:aload           16
	//  192  406:iload           13
	//  193  408:invokevirtual   #296 <Method void ConstraintWidget.setHeightWrapContent(boolean)>
				l = view.getMeasuredWidth();
	//  194  411:aload           14
	//  195  413:invokevirtual   #299 <Method int View.getMeasuredWidth()>
	//  196  416:istore          5
				i1 = view.getMeasuredHeight();
	//  197  418:aload           14
	//  198  420:invokevirtual   #302 <Method int View.getMeasuredHeight()>
	//  199  423:istore          6
			} else
	//* 200  425:goto            441
			{
				flag = false;
	//  201  428:iconst_0        
	//  202  429:istore_3        
				flag1 = false;
	//  203  430:iconst_0        
	//  204  431:istore          4
				i1 = l1;
	//  205  433:iload           9
	//  206  435:istore          6
				l = k1;
	//  207  437:iload           8
	//  208  439:istore          5
			}
			constraintwidget.setWidth(l);
	//  209  441:aload           16
	//  210  443:iload           5
	//  211  445:invokevirtual   #305 <Method void ConstraintWidget.setWidth(int)>
			constraintwidget.setHeight(i1);
	//  212  448:aload           16
	//  213  450:iload           6
	//  214  452:invokevirtual   #308 <Method void ConstraintWidget.setHeight(int)>
			if(flag)
	//* 215  455:iload_3         
	//* 216  456:ifeq            466
				constraintwidget.setWrapWidth(l);
	//  217  459:aload           16
	//  218  461:iload           5
	//  219  463:invokevirtual   #311 <Method void ConstraintWidget.setWrapWidth(int)>
			if(flag1)
	//* 220  466:iload           4
	//* 221  468:ifeq            478
				constraintwidget.setWrapHeight(i1);
	//  222  471:aload           16
	//  223  473:iload           6
	//  224  475:invokevirtual   #314 <Method void ConstraintWidget.setWrapHeight(int)>
			if(!layoutparams.needsBaseline)
				continue;
	//  225  478:aload           15
	//  226  480:getfield        #317 <Field boolean ConstraintLayout$LayoutParams.needsBaseline>
	//  227  483:ifeq            503
			int k = view.getBaseline();
	//  228  486:aload           14
	//  229  488:invokevirtual   #320 <Method int View.getBaseline()>
	//  230  491:istore_3        
			if(k != -1)
	//* 231  492:iload_3         
	//* 232  493:iconst_m1       
	//* 233  494:icmpeq          503
				constraintwidget.setBaselineDistance(k);
	//  234  497:aload           16
	//  235  499:iload_3         
	//  236  500:invokevirtual   #323 <Method void ConstraintWidget.setBaselineDistance(int)>
		}

	//  237  503:iload           7
	//  238  505:iconst_1        
	//  239  506:iadd            
	//  240  507:istore          7
	//* 241  509:goto            31
	//  242  512:return          
	}

	private void internalMeasureDimensions(int i, int j)
	{
		Object obj = ((Object) (this));
	//    0    0:aload_0         
	//    1    1:astore          21
		int l2 = getPaddingTop() + getPaddingBottom();
	//    2    3:aload_0         
	//    3    4:invokevirtual   #226 <Method int getPaddingTop()>
	//    4    7:aload_0         
	//    5    8:invokevirtual   #229 <Method int getPaddingBottom()>
	//    6   11:iadd            
	//    7   12:istore          8
		int k4 = getPaddingLeft() + getPaddingRight();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #232 <Method int getPaddingLeft()>
	//   10   18:aload_0         
	//   11   19:invokevirtual   #235 <Method int getPaddingRight()>
	//   12   22:iadd            
	//   13   23:istore          15
		int i3 = getChildCount();
	//   14   25:aload_0         
	//   15   26:invokevirtual   #238 <Method int getChildCount()>
	//   16   29:istore          9
		int k = 0;
	//   17   31:iconst_0        
	//   18   32:istore_3        
		do
		{
			long l4 = 1L;
	//   19   33:lconst_1        
	//   20   34:lstore          16
			if(k >= i3)
				break;
	//   21   36:iload_3         
	//   22   37:iload           9
	//   23   39:icmpge          411
			View view = ((ConstraintLayout) (obj)).getChildAt(k);
	//   24   42:aload           21
	//   25   44:iload_3         
	//   26   45:invokevirtual   #242 <Method View getChildAt(int)>
	//   27   48:astore          22
			if(view.getVisibility() != 8)
	//*  28   50:aload           22
	//*  29   52:invokevirtual   #245 <Method int View.getVisibility()>
	//*  30   55:bipush          8
	//*  31   57:icmpne          63
	//*  32   60:goto            404
			{
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   33   63:aload           22
	//   34   65:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   35   68:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//   36   71:astore          23
				ConstraintWidget constraintwidget1 = layoutparams.widget;
	//   37   73:aload           23
	//   38   75:getfield        #141 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   39   78:astore          24
				if(!layoutparams.isGuideline && !layoutparams.isHelper)
	//*  40   80:aload           23
	//*  41   82:getfield        #248 <Field boolean ConstraintLayout$LayoutParams.isGuideline>
	//*  42   85:ifne            404
	//*  43   88:aload           23
	//*  44   90:getfield        #251 <Field boolean ConstraintLayout$LayoutParams.isHelper>
	//*  45   93:ifeq            99
	//*  46   96:goto            404
				{
					constraintwidget1.setVisibility(view.getVisibility());
	//   47   99:aload           24
	//   48  101:aload           22
	//   49  103:invokevirtual   #245 <Method int View.getVisibility()>
	//   50  106:invokevirtual   #256 <Method void ConstraintWidget.setVisibility(int)>
					int l1 = layoutparams.width;
	//   51  109:aload           23
	//   52  111:getfield        #259 <Field int ConstraintLayout$LayoutParams.width>
	//   53  114:istore          6
					int j2 = layoutparams.height;
	//   54  116:aload           23
	//   55  118:getfield        #262 <Field int ConstraintLayout$LayoutParams.height>
	//   56  121:istore          7
					if(l1 != 0 && j2 != 0)
	//*  57  123:iload           6
	//*  58  125:ifeq            385
	//*  59  128:iload           7
	//*  60  130:ifne            136
	//*  61  133:goto            385
					{
						boolean flag;
						if(l1 == -2)
	//*  62  136:iload           6
	//*  63  138:bipush          -2
	//*  64  140:icmpne          149
							flag = true;
	//   65  143:iconst_1        
	//   66  144:istore          4
						else
	//*  67  146:goto            152
							flag = false;
	//   68  149:iconst_0        
	//   69  150:istore          4
						int j3 = getChildMeasureSpec(i, k4, l1);
	//   70  152:iload_1         
	//   71  153:iload           15
	//   72  155:iload           6
	//   73  157:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//   74  160:istore          10
						boolean flag2;
						if(j2 == -2)
	//*  75  162:iload           7
	//*  76  164:bipush          -2
	//*  77  166:icmpne          175
							flag2 = true;
	//   78  169:iconst_1        
	//   79  170:istore          5
						else
	//*  80  172:goto            178
							flag2 = false;
	//   81  175:iconst_0        
	//   82  176:istore          5
						view.measure(j3, getChildMeasureSpec(j, l2, j2));
	//   83  178:aload           22
	//   84  180:iload           10
	//   85  182:iload_2         
	//   86  183:iload           8
	//   87  185:iload           7
	//   88  187:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//   89  190:invokevirtual   #281 <Method void View.measure(int, int)>
						Metrics metrics = ((ConstraintLayout) (obj)).mMetrics;
	//   90  193:aload           21
	//   91  195:getfield        #283 <Field Metrics mMetrics>
	//   92  198:astore          25
						if(metrics != null)
	//*  93  200:aload           25
	//*  94  202:ifnull          220
							metrics.measures = metrics.measures + 1L;
	//   95  205:aload           25
	//   96  207:aload           25
	//   97  209:getfield        #289 <Field long Metrics.measures>
	//   98  212:lconst_1        
	//   99  213:ladd            
	//  100  214:putfield        #289 <Field long Metrics.measures>
	//* 101  217:goto            220
						boolean flag5;
						if(l1 == -2)
	//* 102  220:iload           6
	//* 103  222:bipush          -2
	//* 104  224:icmpne          233
							flag5 = true;
	//  105  227:iconst_1        
	//  106  228:istore          20
						else
	//* 107  230:goto            236
							flag5 = false;
	//  108  233:iconst_0        
	//  109  234:istore          20
						constraintwidget1.setWidthWrapContent(flag5);
	//  110  236:aload           24
	//  111  238:iload           20
	//  112  240:invokevirtual   #293 <Method void ConstraintWidget.setWidthWrapContent(boolean)>
						if(j2 == -2)
	//* 113  243:iload           7
	//* 114  245:bipush          -2
	//* 115  247:icmpne          256
							flag5 = true;
	//  116  250:iconst_1        
	//  117  251:istore          20
						else
	//* 118  253:goto            259
							flag5 = false;
	//  119  256:iconst_0        
	//  120  257:istore          20
						constraintwidget1.setHeightWrapContent(flag5);
	//  121  259:aload           24
	//  122  261:iload           20
	//  123  263:invokevirtual   #296 <Method void ConstraintWidget.setHeightWrapContent(boolean)>
						l1 = view.getMeasuredWidth();
	//  124  266:aload           22
	//  125  268:invokevirtual   #299 <Method int View.getMeasuredWidth()>
	//  126  271:istore          6
						j2 = view.getMeasuredHeight();
	//  127  273:aload           22
	//  128  275:invokevirtual   #302 <Method int View.getMeasuredHeight()>
	//  129  278:istore          7
						constraintwidget1.setWidth(l1);
	//  130  280:aload           24
	//  131  282:iload           6
	//  132  284:invokevirtual   #305 <Method void ConstraintWidget.setWidth(int)>
						constraintwidget1.setHeight(j2);
	//  133  287:aload           24
	//  134  289:iload           7
	//  135  291:invokevirtual   #308 <Method void ConstraintWidget.setHeight(int)>
						if(flag)
	//* 136  294:iload           4
	//* 137  296:ifeq            306
							constraintwidget1.setWrapWidth(l1);
	//  138  299:aload           24
	//  139  301:iload           6
	//  140  303:invokevirtual   #311 <Method void ConstraintWidget.setWrapWidth(int)>
						if(flag2)
	//* 141  306:iload           5
	//* 142  308:ifeq            318
							constraintwidget1.setWrapHeight(j2);
	//  143  311:aload           24
	//  144  313:iload           7
	//  145  315:invokevirtual   #314 <Method void ConstraintWidget.setWrapHeight(int)>
						if(layoutparams.needsBaseline)
	//* 146  318:aload           23
	//* 147  320:getfield        #317 <Field boolean ConstraintLayout$LayoutParams.needsBaseline>
	//* 148  323:ifeq            346
						{
							int j1 = view.getBaseline();
	//  149  326:aload           22
	//  150  328:invokevirtual   #320 <Method int View.getBaseline()>
	//  151  331:istore          4
							if(j1 != -1)
	//* 152  333:iload           4
	//* 153  335:iconst_m1       
	//* 154  336:icmpeq          346
								constraintwidget1.setBaselineDistance(j1);
	//  155  339:aload           24
	//  156  341:iload           4
	//  157  343:invokevirtual   #323 <Method void ConstraintWidget.setBaselineDistance(int)>
						}
						if(layoutparams.horizontalDimensionFixed && layoutparams.verticalDimensionFixed)
	//* 158  346:aload           23
	//* 159  348:getfield        #265 <Field boolean ConstraintLayout$LayoutParams.horizontalDimensionFixed>
	//* 160  351:ifeq            404
	//* 161  354:aload           23
	//* 162  356:getfield        #268 <Field boolean ConstraintLayout$LayoutParams.verticalDimensionFixed>
	//* 163  359:ifeq            404
						{
							constraintwidget1.getResolutionWidth().resolve(l1);
	//  164  362:aload           24
	//  165  364:invokevirtual   #328 <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  166  367:iload           6
	//  167  369:invokevirtual   #333 <Method void ResolutionDimension.resolve(int)>
							constraintwidget1.getResolutionHeight().resolve(j2);
	//  168  372:aload           24
	//  169  374:invokevirtual   #336 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  170  377:iload           7
	//  171  379:invokevirtual   #333 <Method void ResolutionDimension.resolve(int)>
						}
					} else
	//* 172  382:goto            404
					{
						constraintwidget1.getResolutionWidth().invalidate();
	//  173  385:aload           24
	//  174  387:invokevirtual   #328 <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  175  390:invokevirtual   #339 <Method void ResolutionDimension.invalidate()>
						constraintwidget1.getResolutionHeight().invalidate();
	//  176  393:aload           24
	//  177  395:invokevirtual   #336 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  178  398:invokevirtual   #339 <Method void ResolutionDimension.invalidate()>
					}
				}
			}
	//* 179  401:goto            404
			k++;
	//  180  404:iload_3         
	//  181  405:iconst_1        
	//  182  406:iadd            
	//  183  407:istore_3        
		} while(true);
	//  184  408:goto            33
		((ConstraintLayout) (obj)).mLayoutWidget.solveGraph();
	//  185  411:aload           21
	//  186  413:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  187  416:invokevirtual   #342 <Method void ConstraintWidgetContainer.solveGraph()>
		for(int k3 = 0; k3 < i3;)
	//* 188  419:iconst_0        
	//* 189  420:istore          10
	//* 190  422:iload           10
	//* 191  424:iload           9
	//* 192  426:icmpge          1338
		{
			Object obj1 = ((Object) (((ConstraintLayout) (obj)).getChildAt(k3)));
	//  193  429:aload           21
	//  194  431:iload           10
	//  195  433:invokevirtual   #242 <Method View getChildAt(int)>
	//  196  436:astore          22
			if(((View) (obj1)).getVisibility() == 8)
	//* 197  438:aload           22
	//* 198  440:invokevirtual   #245 <Method int View.getVisibility()>
	//* 199  443:bipush          8
	//* 200  445:icmpne          455
			{
				obj1 = obj;
	//  201  448:aload           21
	//  202  450:astore          22
			} else
	//* 203  452:goto            1325
			{
				LayoutParams layoutparams1 = (LayoutParams)((View) (obj1)).getLayoutParams();
	//  204  455:aload           22
	//  205  457:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  206  460:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//  207  463:astore          24
				ConstraintWidget constraintwidget = layoutparams1.widget;
	//  208  465:aload           24
	//  209  467:getfield        #141 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//  210  470:astore          23
				if(!layoutparams1.isGuideline)
	//* 211  472:aload           24
	//* 212  474:getfield        #248 <Field boolean ConstraintLayout$LayoutParams.isGuideline>
	//* 213  477:ifne            1321
				{
					if(layoutparams1.isHelper)
	//* 214  480:aload           24
	//* 215  482:getfield        #251 <Field boolean ConstraintLayout$LayoutParams.isHelper>
	//* 216  485:ifeq            495
					{
						obj1 = obj;
	//  217  488:aload           21
	//  218  490:astore          22
					} else
	//* 219  492:goto            1325
					{
						constraintwidget.setVisibility(((View) (obj1)).getVisibility());
	//  220  495:aload           23
	//  221  497:aload           22
	//  222  499:invokevirtual   #245 <Method int View.getVisibility()>
	//  223  502:invokevirtual   #256 <Method void ConstraintWidget.setVisibility(int)>
						int l3 = layoutparams1.width;
	//  224  505:aload           24
	//  225  507:getfield        #259 <Field int ConstraintLayout$LayoutParams.width>
	//  226  510:istore          12
						int i4 = layoutparams1.height;
	//  227  512:aload           24
	//  228  514:getfield        #262 <Field int ConstraintLayout$LayoutParams.height>
	//  229  517:istore          13
						if(l3 != 0 && i4 != 0)
	//* 230  519:iload           12
	//* 231  521:ifeq            536
	//* 232  524:iload           13
	//* 233  526:ifeq            536
						{
							obj1 = obj;
	//  234  529:aload           21
	//  235  531:astore          22
						} else
	//* 236  533:goto            1325
						{
							Object obj2 = ((Object) (constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT).getResolutionNode()));
	//  237  536:aload           23
	//  238  538:getstatic       #348 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.LEFT>
	//  239  541:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//  240  544:invokevirtual   #358 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  241  547:astore          25
							ResolutionAnchor resolutionanchor = constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT).getResolutionNode();
	//  242  549:aload           23
	//  243  551:getstatic       #361 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.RIGHT>
	//  244  554:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//  245  557:invokevirtual   #358 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  246  560:astore          26
							boolean flag1;
							if(constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.LEFT).getTarget() != null && constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT).getTarget() != null)
	//* 247  562:aload           23
	//* 248  564:getstatic       #348 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.LEFT>
	//* 249  567:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//* 250  570:invokevirtual   #365 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 251  573:ifnull          596
	//* 252  576:aload           23
	//* 253  578:getstatic       #361 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.RIGHT>
	//* 254  581:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//* 255  584:invokevirtual   #365 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 256  587:ifnull          596
								flag1 = true;
	//  257  590:iconst_1        
	//  258  591:istore          4
							else
	//* 259  593:goto            599
								flag1 = false;
	//  260  596:iconst_0        
	//  261  597:istore          4
							ResolutionAnchor resolutionanchor1 = constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP).getResolutionNode();
	//  262  599:aload           23
	//  263  601:getstatic       #368 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.TOP>
	//  264  604:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//  265  607:invokevirtual   #358 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  266  610:astore          27
							ResolutionAnchor resolutionanchor2 = constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM).getResolutionNode();
	//  267  612:aload           23
	//  268  614:getstatic       #371 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.BOTTOM>
	//  269  617:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//  270  620:invokevirtual   #358 <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  271  623:astore          28
							int k2;
							if(constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.TOP).getTarget() != null && constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM).getTarget() != null)
	//* 272  625:aload           23
	//* 273  627:getstatic       #368 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.TOP>
	//* 274  630:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//* 275  633:invokevirtual   #365 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 276  636:ifnull          659
	//* 277  639:aload           23
	//* 278  641:getstatic       #371 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.BOTTOM>
	//* 279  644:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//* 280  647:invokevirtual   #365 <Method ConstraintAnchor ConstraintAnchor.getTarget()>
	//* 281  650:ifnull          659
								k2 = 1;
	//  282  653:iconst_1        
	//  283  654:istore          7
							else
	//* 284  656:goto            662
								k2 = 0;
	//  285  659:iconst_0        
	//  286  660:istore          7
							if(l3 == 0 && i4 == 0 && flag1 && k2)
	//* 287  662:iload           12
	//* 288  664:ifne            692
	//* 289  667:iload           13
	//* 290  669:ifne            692
	//* 291  672:iload           4
	//* 292  674:ifeq            692
	//* 293  677:iload           7
	//* 294  679:ifeq            692
							{
								long l5 = 1L;
	//  295  682:lconst_1        
	//  296  683:lstore          16
								obj1 = obj;
	//  297  685:aload           21
	//  298  687:astore          22
							} else
	//* 299  689:goto            1325
							{
								boolean flag3;
								if(((ConstraintLayout) (obj)).mLayoutWidget.getHorizontalDimensionBehaviour() != android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//* 300  692:aload           21
	//* 301  694:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 302  697:invokevirtual   #375 <Method android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour ConstraintWidgetContainer.getHorizontalDimensionBehaviour()>
	//* 303  700:getstatic       #381 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 304  703:if_acmpeq       712
									flag3 = true;
	//  305  706:iconst_1        
	//  306  707:istore          6
								else
	//* 307  709:goto            715
									flag3 = false;
	//  308  712:iconst_0        
	//  309  713:istore          6
								int l;
								if(((ConstraintLayout) (obj)).mLayoutWidget.getVerticalDimensionBehaviour() != android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//* 310  715:aload           21
	//* 311  717:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 312  720:invokevirtual   #384 <Method android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour ConstraintWidgetContainer.getVerticalDimensionBehaviour()>
	//* 313  723:getstatic       #381 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 314  726:if_acmpeq       734
									l = 1;
	//  315  729:iconst_1        
	//  316  730:istore_3        
								else
	//* 317  731:goto            736
									l = 0;
	//  318  734:iconst_0        
	//  319  735:istore_3        
								if(!flag3)
	//* 320  736:iload           6
	//* 321  738:ifne            749
									constraintwidget.getResolutionWidth().invalidate();
	//  322  741:aload           23
	//  323  743:invokevirtual   #328 <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  324  746:invokevirtual   #339 <Method void ResolutionDimension.invalidate()>
								if(l == 0)
	//* 325  749:iload_3         
	//* 326  750:ifne            761
									constraintwidget.getResolutionHeight().invalidate();
	//  327  753:aload           23
	//  328  755:invokevirtual   #336 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  329  758:invokevirtual   #339 <Method void ResolutionDimension.invalidate()>
								int k1;
								boolean flag4;
								if(l3 == 0)
	//* 330  761:iload           12
	//* 331  763:ifne            863
								{
									if(flag3 && constraintwidget.isSpreadWidth() && flag1 && ((ResolutionAnchor) (obj2)).isResolved() && resolutionanchor.isResolved())
	//* 332  766:iload           6
	//* 333  768:ifeq            844
	//* 334  771:aload           23
	//* 335  773:invokevirtual   #388 <Method boolean ConstraintWidget.isSpreadWidth()>
	//* 336  776:ifeq            844
	//* 337  779:iload           4
	//* 338  781:ifeq            844
	//* 339  784:aload           25
	//* 340  786:invokevirtual   #393 <Method boolean ResolutionAnchor.isResolved()>
	//* 341  789:ifeq            844
	//* 342  792:aload           26
	//* 343  794:invokevirtual   #393 <Method boolean ResolutionAnchor.isResolved()>
	//* 344  797:ifeq            844
									{
										l3 = (int)(resolutionanchor.getResolvedValue() - ((ResolutionAnchor) (obj2)).getResolvedValue());
	//  345  800:aload           26
	//  346  802:invokevirtual   #397 <Method float ResolutionAnchor.getResolvedValue()>
	//  347  805:aload           25
	//  348  807:invokevirtual   #397 <Method float ResolutionAnchor.getResolvedValue()>
	//  349  810:fsub            
	//  350  811:f2i             
	//  351  812:istore          12
										constraintwidget.getResolutionWidth().resolve(l3);
	//  352  814:aload           23
	//  353  816:invokevirtual   #328 <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  354  819:iload           12
	//  355  821:invokevirtual   #333 <Method void ResolutionDimension.resolve(int)>
										k1 = getChildMeasureSpec(i, k4, l3);
	//  356  824:iload_1         
	//  357  825:iload           15
	//  358  827:iload           12
	//  359  829:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  360  832:istore          5
										flag1 = false;
	//  361  834:iconst_0        
	//  362  835:istore          4
										flag4 = flag3;
	//  363  837:iload           6
	//  364  839:istore          11
									} else
	//* 365  841:goto            918
									{
										k1 = getChildMeasureSpec(i, k4, -2);
	//  366  844:iload_1         
	//  367  845:iload           15
	//  368  847:bipush          -2
	//  369  849:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  370  852:istore          5
										flag1 = true;
	//  371  854:iconst_1        
	//  372  855:istore          4
										flag4 = false;
	//  373  857:iconst_0        
	//  374  858:istore          11
									}
								} else
	//* 375  860:goto            918
								if(l3 == -1)
	//* 376  863:iload           12
	//* 377  865:iconst_m1       
	//* 378  866:icmpne          888
								{
									k1 = getChildMeasureSpec(i, k4, -1);
	//  379  869:iload_1         
	//  380  870:iload           15
	//  381  872:iconst_m1       
	//  382  873:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  383  876:istore          5
									flag1 = false;
	//  384  878:iconst_0        
	//  385  879:istore          4
									flag4 = flag3;
	//  386  881:iload           6
	//  387  883:istore          11
								} else
	//* 388  885:goto            918
								{
									if(l3 == -2)
	//* 389  888:iload           12
	//* 390  890:bipush          -2
	//* 391  892:icmpne          901
										flag1 = true;
	//  392  895:iconst_1        
	//  393  896:istore          4
									else
	//* 394  898:goto            904
										flag1 = false;
	//  395  901:iconst_0        
	//  396  902:istore          4
									k1 = getChildMeasureSpec(i, k4, l3);
	//  397  904:iload_1         
	//  398  905:iload           15
	//  399  907:iload           12
	//  400  909:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  401  912:istore          5
									flag4 = flag3;
	//  402  914:iload           6
	//  403  916:istore          11
								}
								int i2;
								if(i4 == 0)
	//* 404  918:iload           13
	//* 405  920:ifne            1020
								{
									if(l != 0 && constraintwidget.isSpreadHeight() && k2 && resolutionanchor1.isResolved() && resolutionanchor2.isResolved())
	//* 406  923:iload_3         
	//* 407  924:ifeq            1002
	//* 408  927:aload           23
	//* 409  929:invokevirtual   #400 <Method boolean ConstraintWidget.isSpreadHeight()>
	//* 410  932:ifeq            1002
	//* 411  935:iload           7
	//* 412  937:ifeq            1002
	//* 413  940:aload           27
	//* 414  942:invokevirtual   #393 <Method boolean ResolutionAnchor.isResolved()>
	//* 415  945:ifeq            1002
	//* 416  948:aload           28
	//* 417  950:invokevirtual   #393 <Method boolean ResolutionAnchor.isResolved()>
	//* 418  953:ifeq            1002
									{
										i4 = (int)(resolutionanchor2.getResolvedValue() - resolutionanchor1.getResolvedValue());
	//  419  956:aload           28
	//  420  958:invokevirtual   #397 <Method float ResolutionAnchor.getResolvedValue()>
	//  421  961:aload           27
	//  422  963:invokevirtual   #397 <Method float ResolutionAnchor.getResolvedValue()>
	//  423  966:fsub            
	//  424  967:f2i             
	//  425  968:istore          13
										constraintwidget.getResolutionHeight().resolve(i4);
	//  426  970:aload           23
	//  427  972:invokevirtual   #336 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  428  975:iload           13
	//  429  977:invokevirtual   #333 <Method void ResolutionDimension.resolve(int)>
										i2 = getChildMeasureSpec(j, l2, i4);
	//  430  980:iload_2         
	//  431  981:iload           8
	//  432  983:iload           13
	//  433  985:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  434  988:istore          6
										k2 = l;
	//  435  990:iload_3         
	//  436  991:istore          7
										l = i2;
	//  437  993:iload           6
	//  438  995:istore_3        
										i2 = 0;
	//  439  996:iconst_0        
	//  440  997:istore          6
									} else
	//* 441  999:goto            1079
									{
										l = getChildMeasureSpec(j, l2, -2);
	//  442 1002:iload_2         
	//  443 1003:iload           8
	//  444 1005:bipush          -2
	//  445 1007:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  446 1010:istore_3        
										i2 = 1;
	//  447 1011:iconst_1        
	//  448 1012:istore          6
										k2 = 0;
	//  449 1014:iconst_0        
	//  450 1015:istore          7
									}
								} else
	//* 451 1017:goto            1079
								if(i4 == -1)
	//* 452 1020:iload           13
	//* 453 1022:iconst_m1       
	//* 454 1023:icmpne          1047
								{
									i2 = getChildMeasureSpec(j, l2, -1);
	//  455 1026:iload_2         
	//  456 1027:iload           8
	//  457 1029:iconst_m1       
	//  458 1030:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  459 1033:istore          6
									k2 = l;
	//  460 1035:iload_3         
	//  461 1036:istore          7
									l = i2;
	//  462 1038:iload           6
	//  463 1040:istore_3        
									i2 = 0;
	//  464 1041:iconst_0        
	//  465 1042:istore          6
								} else
	//* 466 1044:goto            1079
								{
									if(i4 == -2)
	//* 467 1047:iload           13
	//* 468 1049:bipush          -2
	//* 469 1051:icmpne          1060
										i2 = 1;
	//  470 1054:iconst_1        
	//  471 1055:istore          6
									else
	//* 472 1057:goto            1063
										i2 = 0;
	//  473 1060:iconst_0        
	//  474 1061:istore          6
									int j4 = getChildMeasureSpec(j, l2, i4);
	//  475 1063:iload_2         
	//  476 1064:iload           8
	//  477 1066:iload           13
	//  478 1068:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  479 1071:istore          14
									k2 = l;
	//  480 1073:iload_3         
	//  481 1074:istore          7
									l = j4;
	//  482 1076:iload           14
	//  483 1078:istore_3        
								}
								((View) (obj1)).measure(k1, l);
	//  484 1079:aload           22
	//  485 1081:iload           5
	//  486 1083:iload_3         
	//  487 1084:invokevirtual   #281 <Method void View.measure(int, int)>
								obj = ((Object) (this));
	//  488 1087:aload_0         
	//  489 1088:astore          21
								obj2 = ((Object) (((ConstraintLayout) (obj)).mMetrics));
	//  490 1090:aload           21
	//  491 1092:getfield        #283 <Field Metrics mMetrics>
	//  492 1095:astore          25
								if(obj2 != null)
	//* 493 1097:aload           25
	//* 494 1099:ifnull          1117
									obj2.measures = ((Metrics) (obj2)).measures + 1L;
	//  495 1102:aload           25
	//  496 1104:aload           25
	//  497 1106:getfield        #289 <Field long Metrics.measures>
	//  498 1109:lconst_1        
	//  499 1110:ladd            
	//  500 1111:putfield        #289 <Field long Metrics.measures>
	//* 501 1114:goto            1117
								long l9 = 1L;
	//  502 1117:lconst_1        
	//  503 1118:lstore          18
								boolean flag6;
								if(l3 == -2)
	//* 504 1120:iload           12
	//* 505 1122:bipush          -2
	//* 506 1124:icmpne          1133
									flag6 = true;
	//  507 1127:iconst_1        
	//  508 1128:istore          20
								else
	//* 509 1130:goto            1136
									flag6 = false;
	//  510 1133:iconst_0        
	//  511 1134:istore          20
								constraintwidget.setWidthWrapContent(flag6);
	//  512 1136:aload           23
	//  513 1138:iload           20
	//  514 1140:invokevirtual   #293 <Method void ConstraintWidget.setWidthWrapContent(boolean)>
								if(i4 == -2)
	//* 515 1143:iload           13
	//* 516 1145:bipush          -2
	//* 517 1147:icmpne          1156
									flag6 = true;
	//  518 1150:iconst_1        
	//  519 1151:istore          20
								else
	//* 520 1153:goto            1159
									flag6 = false;
	//  521 1156:iconst_0        
	//  522 1157:istore          20
								constraintwidget.setHeightWrapContent(flag6);
	//  523 1159:aload           23
	//  524 1161:iload           20
	//  525 1163:invokevirtual   #296 <Method void ConstraintWidget.setHeightWrapContent(boolean)>
								l = ((View) (obj1)).getMeasuredWidth();
	//  526 1166:aload           22
	//  527 1168:invokevirtual   #299 <Method int View.getMeasuredWidth()>
	//  528 1171:istore_3        
								k1 = ((View) (obj1)).getMeasuredHeight();
	//  529 1172:aload           22
	//  530 1174:invokevirtual   #302 <Method int View.getMeasuredHeight()>
	//  531 1177:istore          5
								constraintwidget.setWidth(l);
	//  532 1179:aload           23
	//  533 1181:iload_3         
	//  534 1182:invokevirtual   #305 <Method void ConstraintWidget.setWidth(int)>
								constraintwidget.setHeight(k1);
	//  535 1185:aload           23
	//  536 1187:iload           5
	//  537 1189:invokevirtual   #308 <Method void ConstraintWidget.setHeight(int)>
								if(flag1)
	//* 538 1192:iload           4
	//* 539 1194:ifeq            1203
									constraintwidget.setWrapWidth(l);
	//  540 1197:aload           23
	//  541 1199:iload_3         
	//  542 1200:invokevirtual   #311 <Method void ConstraintWidget.setWrapWidth(int)>
								if(i2 != 0)
	//* 543 1203:iload           6
	//* 544 1205:ifeq            1215
									constraintwidget.setWrapHeight(k1);
	//  545 1208:aload           23
	//  546 1210:iload           5
	//  547 1212:invokevirtual   #314 <Method void ConstraintWidget.setWrapHeight(int)>
								if(flag4)
	//* 548 1215:iload           11
	//* 549 1217:ifeq            1232
									constraintwidget.getResolutionWidth().resolve(l);
	//  550 1220:aload           23
	//  551 1222:invokevirtual   #328 <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  552 1225:iload_3         
	//  553 1226:invokevirtual   #333 <Method void ResolutionDimension.resolve(int)>
								else
	//* 554 1229:goto            1240
									constraintwidget.getResolutionWidth().remove();
	//  555 1232:aload           23
	//  556 1234:invokevirtual   #328 <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  557 1237:invokevirtual   #403 <Method void ResolutionDimension.remove()>
								if(k2 != 0)
	//* 558 1240:iload           7
	//* 559 1242:ifeq            1258
									constraintwidget.getResolutionHeight().resolve(k1);
	//  560 1245:aload           23
	//  561 1247:invokevirtual   #336 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  562 1250:iload           5
	//  563 1252:invokevirtual   #333 <Method void ResolutionDimension.resolve(int)>
								else
	//* 564 1255:goto            1266
									constraintwidget.getResolutionHeight().remove();
	//  565 1258:aload           23
	//  566 1260:invokevirtual   #336 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  567 1263:invokevirtual   #403 <Method void ResolutionDimension.remove()>
								if(layoutparams1.needsBaseline)
	//* 568 1266:aload           24
	//* 569 1268:getfield        #317 <Field boolean ConstraintLayout$LayoutParams.needsBaseline>
	//* 570 1271:ifeq            1310
								{
									int i1 = ((View) (obj1)).getBaseline();
	//  571 1274:aload           22
	//  572 1276:invokevirtual   #320 <Method int View.getBaseline()>
	//  573 1279:istore_3        
									obj1 = obj;
	//  574 1280:aload           21
	//  575 1282:astore          22
									long l6 = l9;
	//  576 1284:lload           18
	//  577 1286:lstore          16
									if(i1 != -1)
	//* 578 1288:iload_3         
	//* 579 1289:iconst_m1       
	//* 580 1290:icmpeq          1325
									{
										constraintwidget.setBaselineDistance(i1);
	//  581 1293:aload           23
	//  582 1295:iload_3         
	//  583 1296:invokevirtual   #323 <Method void ConstraintWidget.setBaselineDistance(int)>
										obj1 = obj;
	//  584 1299:aload           21
	//  585 1301:astore          22
										long l7 = l9;
	//  586 1303:lload           18
	//  587 1305:lstore          16
									}
								} else
	//* 588 1307:goto            1325
								{
									obj1 = obj;
	//  589 1310:aload           21
	//  590 1312:astore          22
									long l8 = l9;
	//  591 1314:lload           18
	//  592 1316:lstore          16
								}
							}
						}
					}
				} else
	//* 593 1318:goto            1325
				{
					obj1 = obj;
	//  594 1321:aload           21
	//  595 1323:astore          22
				}
			}
			k3++;
	//  596 1325:iload           10
	//  597 1327:iconst_1        
	//  598 1328:iadd            
	//  599 1329:istore          10
			obj = obj1;
	//  600 1331:aload           22
	//  601 1333:astore          21
		}

	//* 602 1335:goto            422
	//  603 1338:return          
	}

	private void setChildrenConstraints()
	{
		throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
	//    0    0:new             #406 <Class RuntimeException>
	//    1    3:dup             
	//    2    4:ldc2            #408 <String "d2j fail translate: java.lang.RuntimeException: can not merge Z and I\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
	//    3    7:invokespecial   #413 <Method void Runtime(String)>
	//    4   10:athrow          
	}

	private void setSelfDimensionBehaviour(int i, int j)
	{
		int j1 = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #419 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore          6
		i = android.view.View.MeasureSpec.getSize(i);
	//    3    6:iload_1         
	//    4    7:invokestatic    #422 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    5   10:istore_1        
		int k = android.view.View.MeasureSpec.getMode(j);
	//    6   11:iload_2         
	//    7   12:invokestatic    #419 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    8   15:istore_3        
		j = android.view.View.MeasureSpec.getSize(j);
	//    9   16:iload_2         
	//   10   17:invokestatic    #422 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   11   20:istore_2        
		int l = getPaddingTop();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #226 <Method int getPaddingTop()>
	//   14   25:istore          4
		int i1 = getPaddingBottom();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #229 <Method int getPaddingBottom()>
	//   17   31:istore          5
		int k1 = getPaddingLeft();
	//   18   33:aload_0         
	//   19   34:invokevirtual   #232 <Method int getPaddingLeft()>
	//   20   37:istore          7
		int l1 = getPaddingRight();
	//   21   39:aload_0         
	//   22   40:invokevirtual   #235 <Method int getPaddingRight()>
	//   23   43:istore          8
		android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionbehaviour = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
	//   24   45:getstatic       #425 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.FIXED>
	//   25   48:astore          9
		android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour dimensionbehaviour1 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED;
	//   26   50:getstatic       #425 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.FIXED>
	//   27   53:astore          10
		getLayoutParams();
	//   28   55:aload_0         
	//   29   56:invokevirtual   #426 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//   30   59:pop             
		if(j1 != 0x80000000)
	//*  31   60:iload           6
	//*  32   62:ldc2            #427 <Int 0x80000000>
	//*  33   65:icmpeq          114
		{
			if(j1 != 0)
	//*  34   68:iload           6
	//*  35   70:ifeq            104
			{
				if(j1 != 0x40000000)
	//*  36   73:iload           6
	//*  37   75:ldc2            #428 <Int 0x40000000>
	//*  38   78:icmpeq          86
					i = 0;
	//   39   81:iconst_0        
	//   40   82:istore_1        
				else
	//*  41   83:goto            119
					i = Math.min(mMaxWidth, i) - (k1 + l1);
	//   42   86:aload_0         
	//   43   87:getfield        #87  <Field int mMaxWidth>
	//   44   90:iload_1         
	//   45   91:invokestatic    #433 <Method int Math.min(int, int)>
	//   46   94:iload           7
	//   47   96:iload           8
	//   48   98:iadd            
	//   49   99:isub            
	//   50  100:istore_1        
			} else
	//*  51  101:goto            119
			{
				dimensionbehaviour = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
	//   52  104:getstatic       #381 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//   53  107:astore          9
				i = 0;
	//   54  109:iconst_0        
	//   55  110:istore_1        
			}
		} else
	//*  56  111:goto            119
		{
			dimensionbehaviour = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
	//   57  114:getstatic       #381 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//   58  117:astore          9
		}
		if(k != 0x80000000)
	//*  59  119:iload_3         
	//*  60  120:ldc2            #427 <Int 0x80000000>
	//*  61  123:icmpeq          170
		{
			if(k != 0)
	//*  62  126:iload_3         
	//*  63  127:ifeq            160
			{
				if(k != 0x40000000)
	//*  64  130:iload_3         
	//*  65  131:ldc2            #428 <Int 0x40000000>
	//*  66  134:icmpeq          142
					j = 0;
	//   67  137:iconst_0        
	//   68  138:istore_2        
				else
	//*  69  139:goto            175
					j = Math.min(mMaxHeight, j) - (l + i1);
	//   70  142:aload_0         
	//   71  143:getfield        #89  <Field int mMaxHeight>
	//   72  146:iload_2         
	//   73  147:invokestatic    #433 <Method int Math.min(int, int)>
	//   74  150:iload           4
	//   75  152:iload           5
	//   76  154:iadd            
	//   77  155:isub            
	//   78  156:istore_2        
			} else
	//*  79  157:goto            175
			{
				dimensionbehaviour1 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
	//   80  160:getstatic       #381 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//   81  163:astore          10
				j = 0;
	//   82  165:iconst_0        
	//   83  166:istore_2        
			}
		} else
	//*  84  167:goto            175
		{
			dimensionbehaviour1 = android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
	//   85  170:getstatic       #381 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//   86  173:astore          10
		}
		mLayoutWidget.setMinWidth(0);
	//   87  175:aload_0         
	//   88  176:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//   89  179:iconst_0        
	//   90  180:invokevirtual   #436 <Method void ConstraintWidgetContainer.setMinWidth(int)>
		mLayoutWidget.setMinHeight(0);
	//   91  183:aload_0         
	//   92  184:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//   93  187:iconst_0        
	//   94  188:invokevirtual   #439 <Method void ConstraintWidgetContainer.setMinHeight(int)>
		mLayoutWidget.setHorizontalDimensionBehaviour(dimensionbehaviour);
	//   95  191:aload_0         
	//   96  192:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//   97  195:aload           9
	//   98  197:invokevirtual   #443 <Method void ConstraintWidgetContainer.setHorizontalDimensionBehaviour(android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour)>
		mLayoutWidget.setWidth(i);
	//   99  200:aload_0         
	//  100  201:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  101  204:iload_1         
	//  102  205:invokevirtual   #444 <Method void ConstraintWidgetContainer.setWidth(int)>
		mLayoutWidget.setVerticalDimensionBehaviour(dimensionbehaviour1);
	//  103  208:aload_0         
	//  104  209:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  105  212:aload           10
	//  106  214:invokevirtual   #447 <Method void ConstraintWidgetContainer.setVerticalDimensionBehaviour(android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour)>
		mLayoutWidget.setHeight(j);
	//  107  217:aload_0         
	//  108  218:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  109  221:iload_2         
	//  110  222:invokevirtual   #448 <Method void ConstraintWidgetContainer.setHeight(int)>
		mLayoutWidget.setMinWidth(mMinWidth - getPaddingLeft() - getPaddingRight());
	//  111  225:aload_0         
	//  112  226:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  113  229:aload_0         
	//  114  230:getfield        #82  <Field int mMinWidth>
	//  115  233:aload_0         
	//  116  234:invokevirtual   #232 <Method int getPaddingLeft()>
	//  117  237:isub            
	//  118  238:aload_0         
	//  119  239:invokevirtual   #235 <Method int getPaddingRight()>
	//  120  242:isub            
	//  121  243:invokevirtual   #436 <Method void ConstraintWidgetContainer.setMinWidth(int)>
		mLayoutWidget.setMinHeight(mMinHeight - getPaddingTop() - getPaddingBottom());
	//  122  246:aload_0         
	//  123  247:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  124  250:aload_0         
	//  125  251:getfield        #84  <Field int mMinHeight>
	//  126  254:aload_0         
	//  127  255:invokevirtual   #226 <Method int getPaddingTop()>
	//  128  258:isub            
	//  129  259:aload_0         
	//  130  260:invokevirtual   #229 <Method int getPaddingBottom()>
	//  131  263:isub            
	//  132  264:invokevirtual   #439 <Method void ConstraintWidgetContainer.setMinHeight(int)>
	//  133  267:return          
	}

	private void updateHierarchy()
	{
		int j = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method int getChildCount()>
	//    2    4:istore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		boolean flag;
		do
		{
			flag = flag1;
	//    7   10:iload_3         
	//    8   11:istore_2        
			if(i >= j)
				break;
	//    9   12:iload_1         
	//   10   13:iload           4
	//   11   15:icmpge          41
			if(getChildAt(i).isLayoutRequested())
	//*  12   18:aload_0         
	//*  13   19:iload_1         
	//*  14   20:invokevirtual   #242 <Method View getChildAt(int)>
	//*  15   23:invokevirtual   #452 <Method boolean View.isLayoutRequested()>
	//*  16   26:ifeq            34
			{
				flag = true;
	//   17   29:iconst_1        
	//   18   30:istore_2        
				break;
	//   19   31:goto            41
			}
			i++;
	//   20   34:iload_1         
	//   21   35:iconst_1        
	//   22   36:iadd            
	//   23   37:istore_1        
		} while(true);
	//   24   38:goto            10
		if(flag)
	//*  25   41:iload_2         
	//*  26   42:ifeq            56
		{
			mVariableDimensionsWidgets.clear();
	//   27   45:aload_0         
	//   28   46:getfield        #75  <Field ArrayList mVariableDimensionsWidgets>
	//   29   49:invokevirtual   #455 <Method void ArrayList.clear()>
			setChildrenConstraints();
	//   30   52:aload_0         
	//   31   53:invokespecial   #457 <Method void setChildrenConstraints()>
		}
	//   32   56:return          
	}

	private void updatePostMeasures()
	{
		int k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method int getChildCount()>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		for(int i = 0; i < k; i++)
	//*   5    7:iconst_0        
	//*   6    8:istore_1        
	//*   7    9:iload_1         
	//*   8   10:iload_3         
	//*   9   11:icmpge          45
		{
			View view = getChildAt(i);
	//   10   14:aload_0         
	//   11   15:iload_1         
	//   12   16:invokevirtual   #242 <Method View getChildAt(int)>
	//   13   19:astore          4
			if(view instanceof Placeholder)
	//*  14   21:aload           4
	//*  15   23:instanceof      #460 <Class Placeholder>
	//*  16   26:ifeq            38
				((Placeholder)view).updatePostMeasure(this);
	//   17   29:aload           4
	//   18   31:checkcast       #460 <Class Placeholder>
	//   19   34:aload_0         
	//   20   35:invokevirtual   #464 <Method void Placeholder.updatePostMeasure(ConstraintLayout)>
		}

	//   21   38:iload_1         
	//   22   39:iconst_1        
	//   23   40:iadd            
	//   24   41:istore_1        
	//*  25   42:goto            9
		k = mConstraintHelpers.size();
	//   26   45:aload_0         
	//   27   46:getfield        #73  <Field ArrayList mConstraintHelpers>
	//   28   49:invokevirtual   #467 <Method int ArrayList.size()>
	//   29   52:istore_3        
		if(k > 0)
	//*  30   53:iload_3         
	//*  31   54:ifle            86
		{
			for(int j = ((int) (flag)); j < k; j++)
	//*  32   57:iload_2         
	//*  33   58:istore_1        
	//*  34   59:iload_1         
	//*  35   60:iload_3         
	//*  36   61:icmpge          86
				((ConstraintHelper)mConstraintHelpers.get(j)).updatePostMeasure(this);
	//   37   64:aload_0         
	//   38   65:getfield        #73  <Field ArrayList mConstraintHelpers>
	//   39   68:iload_1         
	//   40   69:invokevirtual   #468 <Method Object ArrayList.get(int)>
	//   41   72:checkcast       #470 <Class ConstraintHelper>
	//   42   75:aload_0         
	//   43   76:invokevirtual   #471 <Method void ConstraintHelper.updatePostMeasure(ConstraintLayout)>

	//   44   79:iload_1         
	//   45   80:iconst_1        
	//   46   81:iadd            
	//   47   82:istore_1        
		}
	//*  48   83:goto            59
	//   49   86:return          
	}

	public void addView(View view, int i, android.view.ViewGroup.LayoutParams layoutparams)
	{
		super.addView(view, i, layoutparams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #475 <Method void ViewGroup.addView(View, int, android.view.ViewGroup$LayoutParams)>
		if(android.os.Build.VERSION.SDK_INT < 14)
	//*   5    7:getstatic       #480 <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   10:bipush          14
	//*   7   12:icmpge          20
			onViewAdded(view);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #484 <Method void onViewAdded(View)>
	//   11   20:return          
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return layoutparams instanceof LayoutParams;
	//    0    0:aload_1         
	//    1    1:instanceof      #6   <Class ConstraintLayout$LayoutParams>
	//    2    4:ireturn         
	}

	public void dispatchDraw(Canvas canvas)
	{
		super.dispatchDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #490 <Method void ViewGroup.dispatchDraw(Canvas)>
		if(isInEditMode())
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #493 <Method boolean isInEditMode()>
	//*   5    9:ifeq            330
		{
			int j = getChildCount();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #238 <Method int getChildCount()>
	//    8   16:istore          9
			float f = getWidth();
	//    9   18:aload_0         
	//   10   19:invokevirtual   #496 <Method int getWidth()>
	//   11   22:i2f             
	//   12   23:fstore_2        
			float f1 = getHeight();
	//   13   24:aload_0         
	//   14   25:invokevirtual   #499 <Method int getHeight()>
	//   15   28:i2f             
	//   16   29:fstore_3        
			for(int i = 0; i < j; i++)
	//*  17   30:iconst_0        
	//*  18   31:istore          8
	//*  19   33:iload           8
	//*  20   35:iload           9
	//*  21   37:icmpge          329
			{
				Object obj = ((Object) (getChildAt(i)));
	//   22   40:aload_0         
	//   23   41:iload           8
	//   24   43:invokevirtual   #242 <Method View getChildAt(int)>
	//   25   46:astore          14
				if(((View) (obj)).getVisibility() == 8)
	//*  26   48:aload           14
	//*  27   50:invokevirtual   #245 <Method int View.getVisibility()>
	//*  28   53:bipush          8
	//*  29   55:icmpne          61
					continue;
	//   30   58:goto            320
				obj = ((View) (obj)).getTag();
	//   31   61:aload           14
	//   32   63:invokevirtual   #503 <Method Object View.getTag()>
	//   33   66:astore          14
				if(obj == null || !(obj instanceof String))
					continue;
	//   34   68:aload           14
	//   35   70:ifnull          320
	//   36   73:aload           14
	//   37   75:instanceof      #505 <Class String>
	//   38   78:ifeq            320
				String as[] = ((String)obj).split(",");
	//   39   81:aload           14
	//   40   83:checkcast       #505 <Class String>
	//   41   86:ldc2            #507 <String ",">
	//   42   89:invokevirtual   #511 <Method String[] String.split(String)>
	//   43   92:astore          14
				if(as.length == 4)
	//*  44   94:aload           14
	//*  45   96:arraylength     
	//*  46   97:iconst_4        
	//*  47   98:icmpne          320
				{
					int l = Integer.parseInt(as[0]);
	//   48  101:aload           14
	//   49  103:iconst_0        
	//   50  104:aaload          
	//   51  105:invokestatic    #517 <Method int Integer.parseInt(String)>
	//   52  108:istore          11
					int j1 = Integer.parseInt(as[1]);
	//   53  110:aload           14
	//   54  112:iconst_1        
	//   55  113:aaload          
	//   56  114:invokestatic    #517 <Method int Integer.parseInt(String)>
	//   57  117:istore          13
					int i1 = Integer.parseInt(as[2]);
	//   58  119:aload           14
	//   59  121:iconst_2        
	//   60  122:aaload          
	//   61  123:invokestatic    #517 <Method int Integer.parseInt(String)>
	//   62  126:istore          12
					int k = Integer.parseInt(as[3]);
	//   63  128:aload           14
	//   64  130:iconst_3        
	//   65  131:aaload          
	//   66  132:invokestatic    #517 <Method int Integer.parseInt(String)>
	//   67  135:istore          10
					l = (int)(((float)l / 1080F) * f);
	//   68  137:iload           11
	//   69  139:i2f             
	//   70  140:ldc2            #518 <Float 1080F>
	//   71  143:fdiv            
	//   72  144:fload_2         
	//   73  145:fmul            
	//   74  146:f2i             
	//   75  147:istore          11
					j1 = (int)(((float)j1 / 1920F) * f1);
	//   76  149:iload           13
	//   77  151:i2f             
	//   78  152:ldc2            #519 <Float 1920F>
	//   79  155:fdiv            
	//   80  156:fload_3         
	//   81  157:fmul            
	//   82  158:f2i             
	//   83  159:istore          13
					i1 = (int)(((float)i1 / 1080F) * f);
	//   84  161:iload           12
	//   85  163:i2f             
	//   86  164:ldc2            #518 <Float 1080F>
	//   87  167:fdiv            
	//   88  168:fload_2         
	//   89  169:fmul            
	//   90  170:f2i             
	//   91  171:istore          12
					k = (int)(((float)k / 1920F) * f1);
	//   92  173:iload           10
	//   93  175:i2f             
	//   94  176:ldc2            #519 <Float 1920F>
	//   95  179:fdiv            
	//   96  180:fload_3         
	//   97  181:fmul            
	//   98  182:f2i             
	//   99  183:istore          10
					Paint paint = new Paint();
	//  100  185:new             #521 <Class Paint>
	//  101  188:dup             
	//  102  189:invokespecial   #522 <Method void Paint()>
	//  103  192:astore          14
					paint.setColor(0xffff0000);
	//  104  194:aload           14
	//  105  196:ldc2            #523 <Int 0xffff0000>
	//  106  199:invokevirtual   #526 <Method void Paint.setColor(int)>
					float f2 = l;
	//  107  202:iload           11
	//  108  204:i2f             
	//  109  205:fstore          4
					float f3 = j1;
	//  110  207:iload           13
	//  111  209:i2f             
	//  112  210:fstore          5
					float f4 = l + i1;
	//  113  212:iload           11
	//  114  214:iload           12
	//  115  216:iadd            
	//  116  217:i2f             
	//  117  218:fstore          6
					canvas.drawLine(f2, f3, f4, f3, paint);
	//  118  220:aload_1         
	//  119  221:fload           4
	//  120  223:fload           5
	//  121  225:fload           6
	//  122  227:fload           5
	//  123  229:aload           14
	//  124  231:invokevirtual   #532 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					float f5 = j1 + k;
	//  125  234:iload           13
	//  126  236:iload           10
	//  127  238:iadd            
	//  128  239:i2f             
	//  129  240:fstore          7
					canvas.drawLine(f4, f3, f4, f5, paint);
	//  130  242:aload_1         
	//  131  243:fload           6
	//  132  245:fload           5
	//  133  247:fload           6
	//  134  249:fload           7
	//  135  251:aload           14
	//  136  253:invokevirtual   #532 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					canvas.drawLine(f4, f5, f2, f5, paint);
	//  137  256:aload_1         
	//  138  257:fload           6
	//  139  259:fload           7
	//  140  261:fload           4
	//  141  263:fload           7
	//  142  265:aload           14
	//  143  267:invokevirtual   #532 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					canvas.drawLine(f2, f5, f2, f3, paint);
	//  144  270:aload_1         
	//  145  271:fload           4
	//  146  273:fload           7
	//  147  275:fload           4
	//  148  277:fload           5
	//  149  279:aload           14
	//  150  281:invokevirtual   #532 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					paint.setColor(0xff00ff00);
	//  151  284:aload           14
	//  152  286:ldc2            #533 <Int 0xff00ff00>
	//  153  289:invokevirtual   #526 <Method void Paint.setColor(int)>
					canvas.drawLine(f2, f3, f4, f5, paint);
	//  154  292:aload_1         
	//  155  293:fload           4
	//  156  295:fload           5
	//  157  297:fload           6
	//  158  299:fload           7
	//  159  301:aload           14
	//  160  303:invokevirtual   #532 <Method void Canvas.drawLine(float, float, float, float, Paint)>
					canvas.drawLine(f2, f5, f4, f3, paint);
	//  161  306:aload_1         
	//  162  307:fload           4
	//  163  309:fload           7
	//  164  311:fload           6
	//  165  313:fload           5
	//  166  315:aload           14
	//  167  317:invokevirtual   #532 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				}
			}

	//  168  320:iload           8
	//  169  322:iconst_1        
	//  170  323:iadd            
	//  171  324:istore          8
	//* 172  326:goto            33
			return;
	//  173  329:return          
		} else
		{
			return;
	//  174  330:return          
		}
	}

	public void fillMetrics(Metrics metrics)
	{
		mMetrics = metrics;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #283 <Field Metrics mMetrics>
		mLayoutWidget.fillMetrics(metrics);
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #537 <Method void ConstraintWidgetContainer.fillMetrics(Metrics)>
	//    7   13:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-2, -2);
	//    0    0:new             #6   <Class ConstraintLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #541 <Method void ConstraintLayout$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #543 <Method ConstraintLayout$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #6   <Class ConstraintLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #159 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #546 <Method void ConstraintLayout$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #549 <Method ConstraintLayout$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (new LayoutParams(layoutparams)));
	//    0    0:new             #6   <Class ConstraintLayout$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #553 <Method void ConstraintLayout$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//    4    8:areturn         
	}

	public Object getDesignInformation(int i, Object obj)
	{
		if(i == 0 && (obj instanceof String))
	//*   0    0:iload_1         
	//*   1    1:ifne            42
	//*   2    4:aload_2         
	//*   3    5:instanceof      #505 <Class String>
	//*   4    8:ifeq            42
		{
			obj = ((Object) ((String)obj));
	//    5   11:aload_2         
	//    6   12:checkcast       #505 <Class String>
	//    7   15:astore_2        
			HashMap hashmap = mDesignIds;
	//    8   16:aload_0         
	//    9   17:getfield        #102 <Field HashMap mDesignIds>
	//   10   20:astore_3        
			if(hashmap != null && hashmap.containsKey(obj))
	//*  11   21:aload_3         
	//*  12   22:ifnull          42
	//*  13   25:aload_3         
	//*  14   26:aload_2         
	//*  15   27:invokevirtual   #559 <Method boolean HashMap.containsKey(Object)>
	//*  16   30:ifeq            42
				return mDesignIds.get(obj);
	//   17   33:aload_0         
	//   18   34:getfield        #102 <Field HashMap mDesignIds>
	//   19   37:aload_2         
	//   20   38:invokevirtual   #562 <Method Object HashMap.get(Object)>
	//   21   41:areturn         
		}
		return ((Object) (null));
	//   22   42:aconst_null     
	//   23   43:areturn         
	}

	public int getMaxHeight()
	{
		return mMaxHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int mMaxHeight>
	//    2    4:ireturn         
	}

	public int getMaxWidth()
	{
		return mMaxWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int mMaxWidth>
	//    2    4:ireturn         
	}

	public int getMinHeight()
	{
		return mMinHeight;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field int mMinHeight>
	//    2    4:ireturn         
	}

	public int getMinWidth()
	{
		return mMinWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field int mMinWidth>
	//    2    4:ireturn         
	}

	public int getOptimizationLevel()
	{
		return mLayoutWidget.getOptimizationLevel();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//    2    4:invokevirtual   #569 <Method int ConstraintWidgetContainer.getOptimizationLevel()>
	//    3    7:ireturn         
	}

	public View getViewById(int i)
	{
		return (View)mChildrenByIds.get(i);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field SparseArray mChildrenByIds>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #131 <Method Object SparseArray.get(int)>
	//    4    8:checkcast       #133 <Class View>
	//    5   11:areturn         
	}

	public final ConstraintWidget getViewWidget(View view)
	{
		if(view == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       10
			return ((ConstraintWidget) (mLayoutWidget));
	//    3    5:aload_0         
	//    4    6:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//    5    9:areturn         
		if(view == null)
	//*   6   10:aload_1         
	//*   7   11:ifnonnull       16
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
		else
			return ((LayoutParams)view.getLayoutParams()).widget;
	//   10   16:aload_1         
	//   11   17:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   12   20:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//   13   23:getfield        #141 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   14   26:areturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		k = getChildCount();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #238 <Method int getChildCount()>
	//    2    4:istore          4
		flag = isInEditMode();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #493 <Method boolean isInEditMode()>
	//    5   10:istore_1        
		j = 0;
	//    6   11:iconst_0        
	//    7   12:istore_3        
		for(i = 0; i < k; i++)
	//*   8   13:iconst_0        
	//*   9   14:istore_2        
	//*  10   15:iload_2         
	//*  11   16:iload           4
	//*  12   18:icmpge          185
		{
			View view = getChildAt(i);
	//   13   21:aload_0         
	//   14   22:iload_2         
	//   15   23:invokevirtual   #242 <Method View getChildAt(int)>
	//   16   26:astore          9
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   17   28:aload           9
	//   18   30:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   19   33:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//   20   36:astore          10
			ConstraintWidget constraintwidget = layoutparams.widget;
	//   21   38:aload           10
	//   22   40:getfield        #141 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   23   43:astore          11
			if(view.getVisibility() == 8 && !layoutparams.isGuideline && !layoutparams.isHelper && !flag || layoutparams.isInPlaceholder)
	//*  24   45:aload           9
	//*  25   47:invokevirtual   #245 <Method int View.getVisibility()>
	//*  26   50:bipush          8
	//*  27   52:icmpne          78
	//*  28   55:aload           10
	//*  29   57:getfield        #248 <Field boolean ConstraintLayout$LayoutParams.isGuideline>
	//*  30   60:ifne            78
	//*  31   63:aload           10
	//*  32   65:getfield        #251 <Field boolean ConstraintLayout$LayoutParams.isHelper>
	//*  33   68:ifne            78
	//*  34   71:iload_1         
	//*  35   72:ifne            78
	//*  36   75:goto            178
	//*  37   78:aload           10
	//*  38   80:getfield        #577 <Field boolean ConstraintLayout$LayoutParams.isInPlaceholder>
	//*  39   83:ifeq            89
				continue;
	//   40   86:goto            178
			l = constraintwidget.getDrawX();
	//   41   89:aload           11
	//   42   91:invokevirtual   #580 <Method int ConstraintWidget.getDrawX()>
	//   43   94:istore          5
			int i1 = constraintwidget.getDrawY();
	//   44   96:aload           11
	//   45   98:invokevirtual   #583 <Method int ConstraintWidget.getDrawY()>
	//   46  101:istore          6
			int j1 = constraintwidget.getWidth() + l;
	//   47  103:aload           11
	//   48  105:invokevirtual   #584 <Method int ConstraintWidget.getWidth()>
	//   49  108:iload           5
	//   50  110:iadd            
	//   51  111:istore          7
			int k1 = constraintwidget.getHeight() + i1;
	//   52  113:aload           11
	//   53  115:invokevirtual   #585 <Method int ConstraintWidget.getHeight()>
	//   54  118:iload           6
	//   55  120:iadd            
	//   56  121:istore          8
			view.layout(l, i1, j1, k1);
	//   57  123:aload           9
	//   58  125:iload           5
	//   59  127:iload           6
	//   60  129:iload           7
	//   61  131:iload           8
	//   62  133:invokevirtual   #589 <Method void View.layout(int, int, int, int)>
			if(!(view instanceof Placeholder))
				continue;
	//   63  136:aload           9
	//   64  138:instanceof      #460 <Class Placeholder>
	//   65  141:ifeq            178
			view = ((Placeholder)view).getContent();
	//   66  144:aload           9
	//   67  146:checkcast       #460 <Class Placeholder>
	//   68  149:invokevirtual   #593 <Method View Placeholder.getContent()>
	//   69  152:astore          9
			if(view != null)
	//*  70  154:aload           9
	//*  71  156:ifnull          178
			{
				view.setVisibility(0);
	//   72  159:aload           9
	//   73  161:iconst_0        
	//   74  162:invokevirtual   #594 <Method void View.setVisibility(int)>
				view.layout(l, i1, j1, k1);
	//   75  165:aload           9
	//   76  167:iload           5
	//   77  169:iload           6
	//   78  171:iload           7
	//   79  173:iload           8
	//   80  175:invokevirtual   #589 <Method void View.layout(int, int, int, int)>
			}
		}

	//   81  178:iload_2         
	//   82  179:iconst_1        
	//   83  180:iadd            
	//   84  181:istore_2        
	//*  85  182:goto            15
		k = mConstraintHelpers.size();
	//   86  185:aload_0         
	//   87  186:getfield        #73  <Field ArrayList mConstraintHelpers>
	//   88  189:invokevirtual   #467 <Method int ArrayList.size()>
	//   89  192:istore          4
		if(k > 0)
	//*  90  194:iload           4
	//*  91  196:ifle            229
			for(i = j; i < k; i++)
	//*  92  199:iload_3         
	//*  93  200:istore_2        
	//*  94  201:iload_2         
	//*  95  202:iload           4
	//*  96  204:icmpge          229
				((ConstraintHelper)mConstraintHelpers.get(i)).updatePostLayout(this);
	//   97  207:aload_0         
	//   98  208:getfield        #73  <Field ArrayList mConstraintHelpers>
	//   99  211:iload_2         
	//  100  212:invokevirtual   #468 <Method Object ArrayList.get(int)>
	//  101  215:checkcast       #470 <Class ConstraintHelper>
	//  102  218:aload_0         
	//  103  219:invokevirtual   #597 <Method void ConstraintHelper.updatePostLayout(ConstraintLayout)>

	//  104  222:iload_2         
	//  105  223:iconst_1        
	//  106  224:iadd            
	//  107  225:istore_2        
	//* 108  226:goto            201
	//  109  229:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k;
		int i4;
		int j4;
label0:
		{
label1:
			{
				System.currentTimeMillis();
	//    0    0:invokestatic    #604 <Method long System.currentTimeMillis()>
	//    1    3:pop2            
				int l = android.view.View.MeasureSpec.getMode(i);
	//    2    4:iload_1         
	//    3    5:invokestatic    #419 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    4    8:istore          4
				int j1 = android.view.View.MeasureSpec.getSize(i);
	//    5   10:iload_1         
	//    6   11:invokestatic    #422 <Method int android.view.View$MeasureSpec.getSize(int)>
	//    7   14:istore          5
				int l1 = android.view.View.MeasureSpec.getMode(j);
	//    8   16:iload_2         
	//    9   17:invokestatic    #419 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   10   20:istore          6
				int i2 = android.view.View.MeasureSpec.getSize(j);
	//   11   22:iload_2         
	//   12   23:invokestatic    #422 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   13   26:istore          7
				if(mLastMeasureWidth != -1)
	//*  14   28:aload_0         
	//*  15   29:getfield        #104 <Field int mLastMeasureWidth>
	//*  16   32:iconst_m1       
	//*  17   33:icmpeq          41
					k = mLastMeasureHeight;
	//   18   36:aload_0         
	//   19   37:getfield        #106 <Field int mLastMeasureHeight>
	//   20   40:istore_3        
				if(l == 0x40000000 && l1 == 0x40000000 && j1 == mLastMeasureWidth)
	//*  21   41:iload           4
	//*  22   43:ldc2            #428 <Int 0x40000000>
	//*  23   46:icmpne          71
	//*  24   49:iload           6
	//*  25   51:ldc2            #428 <Int 0x40000000>
	//*  26   54:icmpne          71
	//*  27   57:iload           5
	//*  28   59:aload_0         
	//*  29   60:getfield        #104 <Field int mLastMeasureWidth>
	//*  30   63:icmpne          71
					k = mLastMeasureHeight;
	//   31   66:aload_0         
	//   32   67:getfield        #106 <Field int mLastMeasureHeight>
	//   33   70:istore_3        
				if(l == mLastMeasureWidthMode && l1 == mLastMeasureHeightMode)
	//*  34   71:iload           4
	//*  35   73:aload_0         
	//*  36   74:getfield        #112 <Field int mLastMeasureWidthMode>
	//*  37   77:icmpne          94
	//*  38   80:iload           6
	//*  39   82:aload_0         
	//*  40   83:getfield        #114 <Field int mLastMeasureHeightMode>
	//*  41   86:icmpne          94
					k = 1;
	//   42   89:iconst_1        
	//   43   90:istore_3        
				else
	//*  44   91:goto            96
					k = 0;
	//   45   94:iconst_0        
	//   46   95:istore_3        
				int j2;
				if(k && j1 == mLastMeasureWidthSize)
	//*  47   96:iload_3         
	//*  48   97:ifeq            115
	//*  49  100:iload           5
	//*  50  102:aload_0         
	//*  51  103:getfield        #108 <Field int mLastMeasureWidthSize>
	//*  52  106:icmpne          115
					j2 = mLastMeasureHeightSize;
	//   53  109:aload_0         
	//   54  110:getfield        #110 <Field int mLastMeasureHeightSize>
	//   55  113:istore          8
				if(k && l == 0x80000000 && l1 == 0x40000000 && j1 >= mLastMeasureWidth)
	//*  56  115:iload_3         
	//*  57  116:ifeq            150
	//*  58  119:iload           4
	//*  59  121:ldc2            #427 <Int 0x80000000>
	//*  60  124:icmpne          150
	//*  61  127:iload           6
	//*  62  129:ldc2            #428 <Int 0x40000000>
	//*  63  132:icmpne          150
	//*  64  135:iload           5
	//*  65  137:aload_0         
	//*  66  138:getfield        #104 <Field int mLastMeasureWidth>
	//*  67  141:icmplt          150
					j2 = mLastMeasureHeight;
	//   68  144:aload_0         
	//   69  145:getfield        #106 <Field int mLastMeasureHeight>
	//   70  148:istore          8
				if(k && l == 0x40000000 && l1 == 0x80000000 && j1 == mLastMeasureWidth)
	//*  71  150:iload_3         
	//*  72  151:ifeq            184
	//*  73  154:iload           4
	//*  74  156:ldc2            #428 <Int 0x40000000>
	//*  75  159:icmpne          184
	//*  76  162:iload           6
	//*  77  164:ldc2            #427 <Int 0x80000000>
	//*  78  167:icmpne          184
	//*  79  170:iload           5
	//*  80  172:aload_0         
	//*  81  173:getfield        #104 <Field int mLastMeasureWidth>
	//*  82  176:icmpne          184
					k = mLastMeasureHeight;
	//   83  179:aload_0         
	//   84  180:getfield        #106 <Field int mLastMeasureHeight>
	//   85  183:istore_3        
				mLastMeasureWidthMode = l;
	//   86  184:aload_0         
	//   87  185:iload           4
	//   88  187:putfield        #112 <Field int mLastMeasureWidthMode>
				mLastMeasureHeightMode = l1;
	//   89  190:aload_0         
	//   90  191:iload           6
	//   91  193:putfield        #114 <Field int mLastMeasureHeightMode>
				mLastMeasureWidthSize = j1;
	//   92  196:aload_0         
	//   93  197:iload           5
	//   94  199:putfield        #108 <Field int mLastMeasureWidthSize>
				mLastMeasureHeightSize = i2;
	//   95  202:aload_0         
	//   96  203:iload           7
	//   97  205:putfield        #110 <Field int mLastMeasureHeightSize>
				k = getPaddingLeft();
	//   98  208:aload_0         
	//   99  209:invokevirtual   #232 <Method int getPaddingLeft()>
	//  100  212:istore_3        
				l = getPaddingTop();
	//  101  213:aload_0         
	//  102  214:invokevirtual   #226 <Method int getPaddingTop()>
	//  103  217:istore          4
				mLayoutWidget.setX(k);
	//  104  219:aload_0         
	//  105  220:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  106  223:iload_3         
	//  107  224:invokevirtual   #607 <Method void ConstraintWidgetContainer.setX(int)>
				mLayoutWidget.setY(l);
	//  108  227:aload_0         
	//  109  228:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  110  231:iload           4
	//  111  233:invokevirtual   #610 <Method void ConstraintWidgetContainer.setY(int)>
				mLayoutWidget.setMaxWidth(mMaxWidth);
	//  112  236:aload_0         
	//  113  237:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  114  240:aload_0         
	//  115  241:getfield        #87  <Field int mMaxWidth>
	//  116  244:invokevirtual   #613 <Method void ConstraintWidgetContainer.setMaxWidth(int)>
				mLayoutWidget.setMaxHeight(mMaxHeight);
	//  117  247:aload_0         
	//  118  248:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  119  251:aload_0         
	//  120  252:getfield        #89  <Field int mMaxHeight>
	//  121  255:invokevirtual   #616 <Method void ConstraintWidgetContainer.setMaxHeight(int)>
				if(android.os.Build.VERSION.SDK_INT >= 17)
	//* 122  258:getstatic       #480 <Field int android.os.Build$VERSION.SDK_INT>
	//* 123  261:bipush          17
	//* 124  263:icmplt          296
				{
					ConstraintWidgetContainer constraintwidgetcontainer = mLayoutWidget;
	//  125  266:aload_0         
	//  126  267:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  127  270:astore          20
					boolean flag4;
					if(getLayoutDirection() == 1)
	//* 128  272:aload_0         
	//* 129  273:invokevirtual   #619 <Method int getLayoutDirection()>
	//* 130  276:iconst_1        
	//* 131  277:icmpne          286
						flag4 = true;
	//  132  280:iconst_1        
	//  133  281:istore          19
					else
	//* 134  283:goto            289
						flag4 = false;
	//  135  286:iconst_0        
	//  136  287:istore          19
					constraintwidgetcontainer.setRtl(flag4);
	//  137  289:aload           20
	//  138  291:iload           19
	//  139  293:invokevirtual   #622 <Method void ConstraintWidgetContainer.setRtl(boolean)>
				}
				setSelfDimensionBehaviour(i, j);
	//  140  296:aload_0         
	//  141  297:iload_1         
	//  142  298:iload_2         
	//  143  299:invokespecial   #624 <Method void setSelfDimensionBehaviour(int, int)>
				int l2 = mLayoutWidget.getWidth();
	//  144  302:aload_0         
	//  145  303:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  146  306:invokevirtual   #625 <Method int ConstraintWidgetContainer.getWidth()>
	//  147  309:istore          12
				int i3 = mLayoutWidget.getHeight();
	//  148  311:aload_0         
	//  149  312:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  150  315:invokevirtual   #626 <Method int ConstraintWidgetContainer.getHeight()>
	//  151  318:istore          13
				if(mDirtyHierarchy)
	//* 152  320:aload_0         
	//* 153  321:getfield        #91  <Field boolean mDirtyHierarchy>
	//* 154  324:ifeq            336
				{
					mDirtyHierarchy = false;
	//  155  327:aload_0         
	//  156  328:iconst_0        
	//  157  329:putfield        #91  <Field boolean mDirtyHierarchy>
					updateHierarchy();
	//  158  332:aload_0         
	//  159  333:invokespecial   #628 <Method void updateHierarchy()>
				}
				boolean flag1;
				if((mOptimizationLevel & 8) == 8)
	//* 160  336:aload_0         
	//* 161  337:getfield        #93  <Field int mOptimizationLevel>
	//* 162  340:bipush          8
	//* 163  342:iand            
	//* 164  343:bipush          8
	//* 165  345:icmpne          354
					flag1 = true;
	//  166  348:iconst_1        
	//  167  349:istore          8
				else
	//* 168  351:goto            357
					flag1 = false;
	//  169  354:iconst_0        
	//  170  355:istore          8
				if(flag1)
	//* 171  357:iload           8
	//* 172  359:ifeq            389
				{
					mLayoutWidget.preOptimize();
	//  173  362:aload_0         
	//  174  363:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  175  366:invokevirtual   #631 <Method void ConstraintWidgetContainer.preOptimize()>
					mLayoutWidget.optimizeForDimensions(l2, i3);
	//  176  369:aload_0         
	//  177  370:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  178  373:iload           12
	//  179  375:iload           13
	//  180  377:invokevirtual   #634 <Method void ConstraintWidgetContainer.optimizeForDimensions(int, int)>
					internalMeasureDimensions(i, j);
	//  181  380:aload_0         
	//  182  381:iload_1         
	//  183  382:iload_2         
	//  184  383:invokespecial   #636 <Method void internalMeasureDimensions(int, int)>
				} else
	//* 185  386:goto            395
				{
					internalMeasureChildren(i, j);
	//  186  389:aload_0         
	//  187  390:iload_1         
	//  188  391:iload_2         
	//  189  392:invokespecial   #638 <Method void internalMeasureChildren(int, int)>
				}
				updatePostMeasures();
	//  190  395:aload_0         
	//  191  396:invokespecial   #640 <Method void updatePostMeasures()>
				if(getChildCount() > 0)
	//* 192  399:aload_0         
	//* 193  400:invokevirtual   #238 <Method int getChildCount()>
	//* 194  403:ifle            413
					solveLinearSystem("First pass");
	//  195  406:aload_0         
	//  196  407:ldc2            #642 <String "First pass">
	//  197  410:invokevirtual   #645 <Method void solveLinearSystem(String)>
				int k2 = mVariableDimensionsWidgets.size();
	//  198  413:aload_0         
	//  199  414:getfield        #75  <Field ArrayList mVariableDimensionsWidgets>
	//  200  417:invokevirtual   #467 <Method int ArrayList.size()>
	//  201  420:istore          9
				i4 = l + getPaddingBottom();
	//  202  422:iload           4
	//  203  424:aload_0         
	//  204  425:invokevirtual   #229 <Method int getPaddingBottom()>
	//  205  428:iadd            
	//  206  429:istore          16
				j4 = k + getPaddingRight();
	//  207  431:iload_3         
	//  208  432:aload_0         
	//  209  433:invokevirtual   #235 <Method int getPaddingRight()>
	//  210  436:iadd            
	//  211  437:istore          17
				if(k2 <= 0)
					break label1;
	//  212  439:iload           9
	//  213  441:ifle            1332
				boolean flag2;
				if(mLayoutWidget.getHorizontalDimensionBehaviour() == android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//* 214  444:aload_0         
	//* 215  445:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 216  448:invokevirtual   #375 <Method android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour ConstraintWidgetContainer.getHorizontalDimensionBehaviour()>
	//* 217  451:getstatic       #381 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 218  454:if_acmpne       463
					flag2 = true;
	//  219  457:iconst_1        
	//  220  458:istore          10
				else
	//* 221  460:goto            466
					flag2 = false;
	//  222  463:iconst_0        
	//  223  464:istore          10
				boolean flag3;
				if(mLayoutWidget.getVerticalDimensionBehaviour() == android.support.constraint.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//* 224  466:aload_0         
	//* 225  467:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 226  470:invokevirtual   #384 <Method android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour ConstraintWidgetContainer.getVerticalDimensionBehaviour()>
	//* 227  473:getstatic       #381 <Field android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour android.support.constraint.solver.widgets.ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 228  476:if_acmpne       485
					flag3 = true;
	//  229  479:iconst_1        
	//  230  480:istore          11
				else
	//* 231  482:goto            488
					flag3 = false;
	//  232  485:iconst_0        
	//  233  486:istore          11
				j1 = Math.max(mLayoutWidget.getWidth(), mMinWidth);
	//  234  488:aload_0         
	//  235  489:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  236  492:invokevirtual   #625 <Method int ConstraintWidgetContainer.getWidth()>
	//  237  495:aload_0         
	//  238  496:getfield        #82  <Field int mMinWidth>
	//  239  499:invokestatic    #648 <Method int Math.max(int, int)>
	//  240  502:istore          5
				k = Math.max(mLayoutWidget.getHeight(), mMinHeight);
	//  241  504:aload_0         
	//  242  505:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  243  508:invokevirtual   #626 <Method int ConstraintWidgetContainer.getHeight()>
	//  244  511:aload_0         
	//  245  512:getfield        #84  <Field int mMinHeight>
	//  246  515:invokestatic    #648 <Method int Math.max(int, int)>
	//  247  518:istore_3        
				int j3 = 0;
	//  248  519:iconst_0        
	//  249  520:istore          14
				l1 = 0;
	//  250  522:iconst_0        
	//  251  523:istore          6
				l = 0;
	//  252  525:iconst_0        
	//  253  526:istore          4
				while(j3 < k2) 
	//* 254  528:iload           14
	//* 255  530:iload           9
	//* 256  532:icmpge          1070
				{
label2:
					{
						ConstraintWidget constraintwidget = (ConstraintWidget)mVariableDimensionsWidgets.get(j3);
	//  257  535:aload_0         
	//  258  536:getfield        #75  <Field ArrayList mVariableDimensionsWidgets>
	//  259  539:iload           14
	//  260  541:invokevirtual   #468 <Method Object ArrayList.get(int)>
	//  261  544:checkcast       #253 <Class ConstraintWidget>
	//  262  547:astore          20
						View view = (View)constraintwidget.getCompanionWidget();
	//  263  549:aload           20
	//  264  551:invokevirtual   #651 <Method Object ConstraintWidget.getCompanionWidget()>
	//  265  554:checkcast       #133 <Class View>
	//  266  557:astore          21
						if(view != null)
	//* 267  559:aload           21
	//* 268  561:ifnonnull       567
	//* 269  564:goto            1045
						{
							LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//  270  567:aload           21
	//  271  569:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  272  572:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//  273  575:astore          22
							if(!layoutparams.isHelper && !layoutparams.isGuideline && view.getVisibility() != 8 && (!flag1 || !constraintwidget.getResolutionWidth().isResolved() || !constraintwidget.getResolutionHeight().isResolved()))
	//* 274  577:aload           22
	//* 275  579:getfield        #251 <Field boolean ConstraintLayout$LayoutParams.isHelper>
	//* 276  582:ifne            1045
	//* 277  585:aload           22
	//* 278  587:getfield        #248 <Field boolean ConstraintLayout$LayoutParams.isGuideline>
	//* 279  590:ifeq            596
	//* 280  593:goto            1045
	//* 281  596:aload           21
	//* 282  598:invokevirtual   #245 <Method int View.getVisibility()>
	//* 283  601:bipush          8
	//* 284  603:icmpne          609
	//* 285  606:goto            1045
	//* 286  609:iload           8
	//* 287  611:ifeq            639
	//* 288  614:aload           20
	//* 289  616:invokevirtual   #328 <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//* 290  619:invokevirtual   #652 <Method boolean ResolutionDimension.isResolved()>
	//* 291  622:ifeq            639
	//* 292  625:aload           20
	//* 293  627:invokevirtual   #336 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//* 294  630:invokevirtual   #652 <Method boolean ResolutionDimension.isResolved()>
	//* 295  633:ifeq            639
	//* 296  636:goto            1045
							{
								if(layoutparams.width == -2 && layoutparams.horizontalDimensionFixed)
	//* 297  639:aload           22
	//* 298  641:getfield        #259 <Field int ConstraintLayout$LayoutParams.width>
	//* 299  644:bipush          -2
	//* 300  646:icmpne          673
	//* 301  649:aload           22
	//* 302  651:getfield        #265 <Field boolean ConstraintLayout$LayoutParams.horizontalDimensionFixed>
	//* 303  654:ifeq            673
									i2 = getChildMeasureSpec(i, j4, layoutparams.width);
	//  304  657:iload_1         
	//  305  658:iload           17
	//  306  660:aload           22
	//  307  662:getfield        #259 <Field int ConstraintLayout$LayoutParams.width>
	//  308  665:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  309  668:istore          7
								else
	//* 310  670:goto            686
									i2 = android.view.View.MeasureSpec.makeMeasureSpec(constraintwidget.getWidth(), 0x40000000);
	//  311  673:aload           20
	//  312  675:invokevirtual   #584 <Method int ConstraintWidget.getWidth()>
	//  313  678:ldc2            #428 <Int 0x40000000>
	//  314  681:invokestatic    #655 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  315  684:istore          7
								int k3;
								if(layoutparams.height == -2 && layoutparams.verticalDimensionFixed)
	//* 316  686:aload           22
	//* 317  688:getfield        #262 <Field int ConstraintLayout$LayoutParams.height>
	//* 318  691:bipush          -2
	//* 319  693:icmpne          720
	//* 320  696:aload           22
	//* 321  698:getfield        #268 <Field boolean ConstraintLayout$LayoutParams.verticalDimensionFixed>
	//* 322  701:ifeq            720
									k3 = getChildMeasureSpec(j, i4, layoutparams.height);
	//  323  704:iload_2         
	//  324  705:iload           16
	//  325  707:aload           22
	//  326  709:getfield        #262 <Field int ConstraintLayout$LayoutParams.height>
	//  327  712:invokestatic    #278 <Method int getChildMeasureSpec(int, int, int)>
	//  328  715:istore          15
								else
	//* 329  717:goto            733
									k3 = android.view.View.MeasureSpec.makeMeasureSpec(constraintwidget.getHeight(), 0x40000000);
	//  330  720:aload           20
	//  331  722:invokevirtual   #585 <Method int ConstraintWidget.getHeight()>
	//  332  725:ldc2            #428 <Int 0x40000000>
	//  333  728:invokestatic    #655 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  334  731:istore          15
								view.measure(i2, k3);
	//  335  733:aload           21
	//  336  735:iload           7
	//  337  737:iload           15
	//  338  739:invokevirtual   #281 <Method void View.measure(int, int)>
								Metrics metrics = mMetrics;
	//  339  742:aload_0         
	//  340  743:getfield        #283 <Field Metrics mMetrics>
	//  341  746:astore          23
								if(metrics != null)
	//* 342  748:aload           23
	//* 343  750:ifnull          765
									metrics.additionalMeasures = metrics.additionalMeasures + 1L;
	//  344  753:aload           23
	//  345  755:aload           23
	//  346  757:getfield        #658 <Field long Metrics.additionalMeasures>
	//  347  760:lconst_1        
	//  348  761:ladd            
	//  349  762:putfield        #658 <Field long Metrics.additionalMeasures>
								int k4 = view.getMeasuredWidth();
	//  350  765:aload           21
	//  351  767:invokevirtual   #299 <Method int View.getMeasuredWidth()>
	//  352  770:istore          18
								k3 = view.getMeasuredHeight();
	//  353  772:aload           21
	//  354  774:invokevirtual   #302 <Method int View.getMeasuredHeight()>
	//  355  777:istore          15
								i2 = l1;
	//  356  779:iload           6
	//  357  781:istore          7
								l1 = j1;
	//  358  783:iload           5
	//  359  785:istore          6
								if(k4 != constraintwidget.getWidth())
	//* 360  787:iload           18
	//* 361  789:aload           20
	//* 362  791:invokevirtual   #584 <Method int ConstraintWidget.getWidth()>
	//* 363  794:icmpeq          869
								{
									constraintwidget.setWidth(k4);
	//  364  797:aload           20
	//  365  799:iload           18
	//  366  801:invokevirtual   #305 <Method void ConstraintWidget.setWidth(int)>
									if(flag1)
	//* 367  804:iload           8
	//* 368  806:ifeq            819
										constraintwidget.getResolutionWidth().resolve(k4);
	//  369  809:aload           20
	//  370  811:invokevirtual   #328 <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  371  814:iload           18
	//  372  816:invokevirtual   #333 <Method void ResolutionDimension.resolve(int)>
									l1 = j1;
	//  373  819:iload           5
	//  374  821:istore          6
									if(flag2)
	//* 375  823:iload           10
	//* 376  825:ifeq            866
									{
										l1 = j1;
	//  377  828:iload           5
	//  378  830:istore          6
										if(constraintwidget.getRight() > j1)
	//* 379  832:aload           20
	//* 380  834:invokevirtual   #661 <Method int ConstraintWidget.getRight()>
	//* 381  837:iload           5
	//* 382  839:icmple          866
											l1 = Math.max(j1, constraintwidget.getRight() + constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.RIGHT).getMargin());
	//  383  842:iload           5
	//  384  844:aload           20
	//  385  846:invokevirtual   #661 <Method int ConstraintWidget.getRight()>
	//  386  849:aload           20
	//  387  851:getstatic       #361 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.RIGHT>
	//  388  854:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//  389  857:invokevirtual   #664 <Method int ConstraintAnchor.getMargin()>
	//  390  860:iadd            
	//  391  861:invokestatic    #648 <Method int Math.max(int, int)>
	//  392  864:istore          6
									}
									i2 = 1;
	//  393  866:iconst_1        
	//  394  867:istore          7
								}
								if(k3 != constraintwidget.getHeight())
	//* 395  869:iload           15
	//* 396  871:aload           20
	//* 397  873:invokevirtual   #585 <Method int ConstraintWidget.getHeight()>
	//* 398  876:icmpeq          955
								{
									constraintwidget.setHeight(k3);
	//  399  879:aload           20
	//  400  881:iload           15
	//  401  883:invokevirtual   #308 <Method void ConstraintWidget.setHeight(int)>
									if(flag1)
	//* 402  886:iload           8
	//* 403  888:ifeq            901
										constraintwidget.getResolutionHeight().resolve(k3);
	//  404  891:aload           20
	//  405  893:invokevirtual   #336 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  406  896:iload           15
	//  407  898:invokevirtual   #333 <Method void ResolutionDimension.resolve(int)>
									if(flag3)
	//* 408  901:iload           11
	//* 409  903:ifeq            949
									{
										i2 = constraintwidget.getBottom();
	//  410  906:aload           20
	//  411  908:invokevirtual   #667 <Method int ConstraintWidget.getBottom()>
	//  412  911:istore          7
										j1 = k;
	//  413  913:iload_3         
	//  414  914:istore          5
										if(i2 > j1)
	//* 415  916:iload           7
	//* 416  918:iload           5
	//* 417  920:icmple          949
											k = Math.max(j1, constraintwidget.getBottom() + constraintwidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor.Type.BOTTOM).getMargin());
	//  418  923:iload           5
	//  419  925:aload           20
	//  420  927:invokevirtual   #667 <Method int ConstraintWidget.getBottom()>
	//  421  930:aload           20
	//  422  932:getstatic       #371 <Field android.support.constraint.solver.widgets.ConstraintAnchor$Type android.support.constraint.solver.widgets.ConstraintAnchor$Type.BOTTOM>
	//  423  935:invokevirtual   #352 <Method ConstraintAnchor ConstraintWidget.getAnchor(android.support.constraint.solver.widgets.ConstraintAnchor$Type)>
	//  424  938:invokevirtual   #664 <Method int ConstraintAnchor.getMargin()>
	//  425  941:iadd            
	//  426  942:invokestatic    #648 <Method int Math.max(int, int)>
	//  427  945:istore_3        
									}
	//* 428  946:goto            949
									i2 = 1;
	//  429  949:iconst_1        
	//  430  950:istore          7
								}
	//* 431  952:goto            955
								if(layoutparams.needsBaseline)
	//* 432  955:aload           22
	//* 433  957:getfield        #317 <Field boolean ConstraintLayout$LayoutParams.needsBaseline>
	//* 434  960:ifeq            1007
								{
									int l3 = view.getBaseline();
	//  435  963:aload           21
	//  436  965:invokevirtual   #320 <Method int View.getBaseline()>
	//  437  968:istore          15
									j1 = i2;
	//  438  970:iload           7
	//  439  972:istore          5
									if(l3 != -1)
	//* 440  974:iload           15
	//* 441  976:iconst_m1       
	//* 442  977:icmpeq          1011
									{
										j1 = i2;
	//  443  980:iload           7
	//  444  982:istore          5
										if(l3 != constraintwidget.getBaselineDistance())
	//* 445  984:iload           15
	//* 446  986:aload           20
	//* 447  988:invokevirtual   #670 <Method int ConstraintWidget.getBaselineDistance()>
	//* 448  991:icmpeq          1011
										{
											constraintwidget.setBaselineDistance(l3);
	//  449  994:aload           20
	//  450  996:iload           15
	//  451  998:invokevirtual   #323 <Method void ConstraintWidget.setBaselineDistance(int)>
											j1 = 1;
	//  452 1001:iconst_1        
	//  453 1002:istore          5
										}
									}
								} else
	//* 454 1004:goto            1011
								{
									j1 = i2;
	//  455 1007:iload           7
	//  456 1009:istore          5
								}
								if(android.os.Build.VERSION.SDK_INT >= 11)
	//* 457 1011:getstatic       #480 <Field int android.os.Build$VERSION.SDK_INT>
	//* 458 1014:bipush          11
	//* 459 1016:icmplt          1038
								{
									l = combineMeasuredStates(l, view.getMeasuredState());
	//  460 1019:iload           4
	//  461 1021:aload           21
	//  462 1023:invokevirtual   #673 <Method int View.getMeasuredState()>
	//  463 1026:invokestatic    #676 <Method int combineMeasuredStates(int, int)>
	//  464 1029:istore          4
									i2 = l1;
	//  465 1031:iload           6
	//  466 1033:istore          7
								} else
	//* 467 1035:goto            1053
								{
									i2 = l1;
	//  468 1038:iload           6
	//  469 1040:istore          7
								}
								break label2;
	//  470 1042:goto            1053
							}
						}
						i2 = j1;
	//  471 1045:iload           5
	//  472 1047:istore          7
						j1 = l1;
	//  473 1049:iload           6
	//  474 1051:istore          5
					}
					j3++;
	//  475 1053:iload           14
	//  476 1055:iconst_1        
	//  477 1056:iadd            
	//  478 1057:istore          14
					l1 = j1;
	//  479 1059:iload           5
	//  480 1061:istore          6
					j1 = i2;
	//  481 1063:iload           7
	//  482 1065:istore          5
				}
	//* 483 1067:goto            528
				i2 = l;
	//  484 1070:iload           4
	//  485 1072:istore          7
				if(l1 != 0)
	//* 486 1074:iload           6
	//* 487 1076:ifeq            1183
				{
					mLayoutWidget.setWidth(l2);
	//  488 1079:aload_0         
	//  489 1080:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  490 1083:iload           12
	//  491 1085:invokevirtual   #444 <Method void ConstraintWidgetContainer.setWidth(int)>
					mLayoutWidget.setHeight(i3);
	//  492 1088:aload_0         
	//  493 1089:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  494 1092:iload           13
	//  495 1094:invokevirtual   #448 <Method void ConstraintWidgetContainer.setHeight(int)>
					if(flag1)
	//* 496 1097:iload           8
	//* 497 1099:ifeq            1109
						mLayoutWidget.solveGraph();
	//  498 1102:aload_0         
	//  499 1103:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  500 1106:invokevirtual   #342 <Method void ConstraintWidgetContainer.solveGraph()>
					solveLinearSystem("2nd pass");
	//  501 1109:aload_0         
	//  502 1110:ldc2            #678 <String "2nd pass">
	//  503 1113:invokevirtual   #645 <Method void solveLinearSystem(String)>
					boolean flag;
					if(mLayoutWidget.getWidth() < j1)
	//* 504 1116:aload_0         
	//* 505 1117:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 506 1120:invokevirtual   #625 <Method int ConstraintWidgetContainer.getWidth()>
	//* 507 1123:iload           5
	//* 508 1125:icmpge          1143
					{
						mLayoutWidget.setWidth(j1);
	//  509 1128:aload_0         
	//  510 1129:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  511 1132:iload           5
	//  512 1134:invokevirtual   #444 <Method void ConstraintWidgetContainer.setWidth(int)>
						flag = true;
	//  513 1137:iconst_1        
	//  514 1138:istore          4
					} else
	//* 515 1140:goto            1146
					{
						flag = false;
	//  516 1143:iconst_0        
	//  517 1144:istore          4
					}
					if(mLayoutWidget.getHeight() < k)
	//* 518 1146:aload_0         
	//* 519 1147:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 520 1150:invokevirtual   #626 <Method int ConstraintWidgetContainer.getHeight()>
	//* 521 1153:iload_3         
	//* 522 1154:icmpge          1171
					{
						mLayoutWidget.setHeight(k);
	//  523 1157:aload_0         
	//  524 1158:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  525 1161:iload_3         
	//  526 1162:invokevirtual   #448 <Method void ConstraintWidgetContainer.setHeight(int)>
						flag = true;
	//  527 1165:iconst_1        
	//  528 1166:istore          4
					}
	//* 529 1168:goto            1171
					if(flag)
	//* 530 1171:iload           4
	//* 531 1173:ifeq            1183
						solveLinearSystem("3rd pass");
	//  532 1176:aload_0         
	//  533 1177:ldc2            #680 <String "3rd pass">
	//  534 1180:invokevirtual   #645 <Method void solveLinearSystem(String)>
				}
				flag = false;
	//  535 1183:iconst_0        
	//  536 1184:istore          4
				do
				{
					k = i2;
	//  537 1186:iload           7
	//  538 1188:istore_3        
					if(flag >= k2)
						break;
	//  539 1189:iload           4
	//  540 1191:iload           9
	//  541 1193:icmpge          1334
					Object obj = ((Object) ((ConstraintWidget)mVariableDimensionsWidgets.get(((int) (flag)))));
	//  542 1196:aload_0         
	//  543 1197:getfield        #75  <Field ArrayList mVariableDimensionsWidgets>
	//  544 1200:iload           4
	//  545 1202:invokevirtual   #468 <Method Object ArrayList.get(int)>
	//  546 1205:checkcast       #253 <Class ConstraintWidget>
	//  547 1208:astore          20
					View view1 = (View)((ConstraintWidget) (obj)).getCompanionWidget();
	//  548 1210:aload           20
	//  549 1212:invokevirtual   #651 <Method Object ConstraintWidget.getCompanionWidget()>
	//  550 1215:checkcast       #133 <Class View>
	//  551 1218:astore          21
					if(view1 != null && (view1.getMeasuredWidth() != ((ConstraintWidget) (obj)).getWidth() || view1.getMeasuredHeight() != ((ConstraintWidget) (obj)).getHeight()) && ((ConstraintWidget) (obj)).getVisibility() != 8)
	//* 552 1220:aload           21
	//* 553 1222:ifnonnull       1228
	//* 554 1225:goto            1323
	//* 555 1228:aload           21
	//* 556 1230:invokevirtual   #299 <Method int View.getMeasuredWidth()>
	//* 557 1233:aload           20
	//* 558 1235:invokevirtual   #584 <Method int ConstraintWidget.getWidth()>
	//* 559 1238:icmpne          1260
	//* 560 1241:aload           21
	//* 561 1243:invokevirtual   #302 <Method int View.getMeasuredHeight()>
	//* 562 1246:aload           20
	//* 563 1248:invokevirtual   #585 <Method int ConstraintWidget.getHeight()>
	//* 564 1251:icmpeq          1257
	//* 565 1254:goto            1260
	//* 566 1257:goto            1323
	//* 567 1260:aload           20
	//* 568 1262:invokevirtual   #681 <Method int ConstraintWidget.getVisibility()>
	//* 569 1265:bipush          8
	//* 570 1267:icmpeq          1323
					{
						view1.measure(android.view.View.MeasureSpec.makeMeasureSpec(((ConstraintWidget) (obj)).getWidth(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(((ConstraintWidget) (obj)).getHeight(), 0x40000000));
	//  571 1270:aload           21
	//  572 1272:aload           20
	//  573 1274:invokevirtual   #584 <Method int ConstraintWidget.getWidth()>
	//  574 1277:ldc2            #428 <Int 0x40000000>
	//  575 1280:invokestatic    #655 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  576 1283:aload           20
	//  577 1285:invokevirtual   #585 <Method int ConstraintWidget.getHeight()>
	//  578 1288:ldc2            #428 <Int 0x40000000>
	//  579 1291:invokestatic    #655 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  580 1294:invokevirtual   #281 <Method void View.measure(int, int)>
						obj = ((Object) (mMetrics));
	//  581 1297:aload_0         
	//  582 1298:getfield        #283 <Field Metrics mMetrics>
	//  583 1301:astore          20
						if(obj != null)
	//* 584 1303:aload           20
	//* 585 1305:ifnull          1323
							obj.additionalMeasures = ((Metrics) (obj)).additionalMeasures + 1L;
	//  586 1308:aload           20
	//  587 1310:aload           20
	//  588 1312:getfield        #658 <Field long Metrics.additionalMeasures>
	//  589 1315:lconst_1        
	//  590 1316:ladd            
	//  591 1317:putfield        #658 <Field long Metrics.additionalMeasures>
					}
	//* 592 1320:goto            1323
					flag++;
	//  593 1323:iload           4
	//  594 1325:iconst_1        
	//  595 1326:iadd            
	//  596 1327:istore          4
				} while(true);
	//  597 1329:goto            1186
				break label0;
			}
			k = 0;
	//  598 1332:iconst_0        
	//  599 1333:istore_3        
		}
		int i1 = mLayoutWidget.getWidth() + j4;
	//  600 1334:aload_0         
	//  601 1335:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  602 1338:invokevirtual   #625 <Method int ConstraintWidgetContainer.getWidth()>
	//  603 1341:iload           17
	//  604 1343:iadd            
	//  605 1344:istore          4
		int k1 = mLayoutWidget.getHeight() + i4;
	//  606 1346:aload_0         
	//  607 1347:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//  608 1350:invokevirtual   #626 <Method int ConstraintWidgetContainer.getHeight()>
	//  609 1353:iload           16
	//  610 1355:iadd            
	//  611 1356:istore          5
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//* 612 1358:getstatic       #480 <Field int android.os.Build$VERSION.SDK_INT>
	//* 613 1361:bipush          11
	//* 614 1363:icmplt          1464
		{
			i = resolveSizeAndState(i1, i, k);
	//  615 1366:iload           4
	//  616 1368:iload_1         
	//  617 1369:iload_3         
	//  618 1370:invokestatic    #684 <Method int resolveSizeAndState(int, int, int)>
	//  619 1373:istore_1        
			k = resolveSizeAndState(k1, j, k << 16);
	//  620 1374:iload           5
	//  621 1376:iload_2         
	//  622 1377:iload_3         
	//  623 1378:bipush          16
	//  624 1380:ishl            
	//  625 1381:invokestatic    #684 <Method int resolveSizeAndState(int, int, int)>
	//  626 1384:istore_3        
			j = Math.min(mMaxWidth, i & 0xffffff);
	//  627 1385:aload_0         
	//  628 1386:getfield        #87  <Field int mMaxWidth>
	//  629 1389:iload_1         
	//  630 1390:ldc2            #685 <Int 0xffffff>
	//  631 1393:iand            
	//  632 1394:invokestatic    #433 <Method int Math.min(int, int)>
	//  633 1397:istore_2        
			k = Math.min(mMaxHeight, k & 0xffffff);
	//  634 1398:aload_0         
	//  635 1399:getfield        #89  <Field int mMaxHeight>
	//  636 1402:iload_3         
	//  637 1403:ldc2            #685 <Int 0xffffff>
	//  638 1406:iand            
	//  639 1407:invokestatic    #433 <Method int Math.min(int, int)>
	//  640 1410:istore_3        
			i = j;
	//  641 1411:iload_2         
	//  642 1412:istore_1        
			if(mLayoutWidget.isWidthMeasuredTooSmall())
	//* 643 1413:aload_0         
	//* 644 1414:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 645 1417:invokevirtual   #688 <Method boolean ConstraintWidgetContainer.isWidthMeasuredTooSmall()>
	//* 646 1420:ifeq            1429
				i = j | 0x1000000;
	//  647 1423:iload_2         
	//  648 1424:ldc2            #689 <Int 0x1000000>
	//  649 1427:ior             
	//  650 1428:istore_1        
			j = k;
	//  651 1429:iload_3         
	//  652 1430:istore_2        
			if(mLayoutWidget.isHeightMeasuredTooSmall())
	//* 653 1431:aload_0         
	//* 654 1432:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//* 655 1435:invokevirtual   #692 <Method boolean ConstraintWidgetContainer.isHeightMeasuredTooSmall()>
	//* 656 1438:ifeq            1447
				j = k | 0x1000000;
	//  657 1441:iload_3         
	//  658 1442:ldc2            #689 <Int 0x1000000>
	//  659 1445:ior             
	//  660 1446:istore_2        
			setMeasuredDimension(i, j);
	//  661 1447:aload_0         
	//  662 1448:iload_1         
	//  663 1449:iload_2         
	//  664 1450:invokevirtual   #695 <Method void setMeasuredDimension(int, int)>
			mLastMeasureWidth = i;
	//  665 1453:aload_0         
	//  666 1454:iload_1         
	//  667 1455:putfield        #104 <Field int mLastMeasureWidth>
			mLastMeasureHeight = j;
	//  668 1458:aload_0         
	//  669 1459:iload_2         
	//  670 1460:putfield        #106 <Field int mLastMeasureHeight>
			return;
	//  671 1463:return          
		} else
		{
			setMeasuredDimension(i1, k1);
	//  672 1464:aload_0         
	//  673 1465:iload           4
	//  674 1467:iload           5
	//  675 1469:invokevirtual   #695 <Method void setMeasuredDimension(int, int)>
			mLastMeasureWidth = i1;
	//  676 1472:aload_0         
	//  677 1473:iload           4
	//  678 1475:putfield        #104 <Field int mLastMeasureWidth>
			mLastMeasureHeight = k1;
	//  679 1478:aload_0         
	//  680 1479:iload           5
	//  681 1481:putfield        #106 <Field int mLastMeasureHeight>
			return;
	//  682 1484:return          
		}
	}

	public void onViewAdded(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #480 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          13
			super.onViewAdded(view);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #696 <Method void ViewGroup.onViewAdded(View)>
		ConstraintWidget constraintwidget = getViewWidget(view);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #698 <Method ConstraintWidget getViewWidget(View)>
	//    9   18:astore_2        
		if((view instanceof android.support.constraint.Guideline) && !(constraintwidget instanceof Guideline))
	//*  10   19:aload_1         
	//*  11   20:instanceof      #700 <Class android.support.constraint.Guideline>
	//*  12   23:ifeq            71
	//*  13   26:aload_2         
	//*  14   27:instanceof      #702 <Class Guideline>
	//*  15   30:ifne            71
		{
			LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   16   33:aload_1         
	//   17   34:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   18   37:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//   19   40:astore_2        
			layoutparams.widget = ((ConstraintWidget) (new Guideline()));
	//   20   41:aload_2         
	//   21   42:new             #702 <Class Guideline>
	//   22   45:dup             
	//   23   46:invokespecial   #703 <Method void Guideline()>
	//   24   49:putfield        #141 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
			layoutparams.isGuideline = true;
	//   25   52:aload_2         
	//   26   53:iconst_1        
	//   27   54:putfield        #248 <Field boolean ConstraintLayout$LayoutParams.isGuideline>
			((Guideline)layoutparams.widget).setOrientation(layoutparams.orientation);
	//   28   57:aload_2         
	//   29   58:getfield        #141 <Field ConstraintWidget ConstraintLayout$LayoutParams.widget>
	//   30   61:checkcast       #702 <Class Guideline>
	//   31   64:aload_2         
	//   32   65:getfield        #706 <Field int ConstraintLayout$LayoutParams.orientation>
	//   33   68:invokevirtual   #709 <Method void Guideline.setOrientation(int)>
		}
		if(view instanceof ConstraintHelper)
	//*  34   71:aload_1         
	//*  35   72:instanceof      #470 <Class ConstraintHelper>
	//*  36   75:ifeq            118
		{
			ConstraintHelper constrainthelper = (ConstraintHelper)view;
	//   37   78:aload_1         
	//   38   79:checkcast       #470 <Class ConstraintHelper>
	//   39   82:astore_2        
			constrainthelper.validateParams();
	//   40   83:aload_2         
	//   41   84:invokevirtual   #712 <Method void ConstraintHelper.validateParams()>
			((LayoutParams)view.getLayoutParams()).isHelper = true;
	//   42   87:aload_1         
	//   43   88:invokevirtual   #137 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   44   91:checkcast       #6   <Class ConstraintLayout$LayoutParams>
	//   45   94:iconst_1        
	//   46   95:putfield        #251 <Field boolean ConstraintLayout$LayoutParams.isHelper>
			if(!mConstraintHelpers.contains(((Object) (constrainthelper))))
	//*  47   98:aload_0         
	//*  48   99:getfield        #73  <Field ArrayList mConstraintHelpers>
	//*  49  102:aload_2         
	//*  50  103:invokevirtual   #715 <Method boolean ArrayList.contains(Object)>
	//*  51  106:ifne            118
				mConstraintHelpers.add(((Object) (constrainthelper)));
	//   52  109:aload_0         
	//   53  110:getfield        #73  <Field ArrayList mConstraintHelpers>
	//   54  113:aload_2         
	//   55  114:invokevirtual   #718 <Method boolean ArrayList.add(Object)>
	//   56  117:pop             
		}
		mChildrenByIds.put(view.getId(), ((Object) (view)));
	//   57  118:aload_0         
	//   58  119:getfield        #66  <Field SparseArray mChildrenByIds>
	//   59  122:aload_1         
	//   60  123:invokevirtual   #719 <Method int View.getId()>
	//   61  126:aload_1         
	//   62  127:invokevirtual   #155 <Method void SparseArray.put(int, Object)>
		mDirtyHierarchy = true;
	//   63  130:aload_0         
	//   64  131:iconst_1        
	//   65  132:putfield        #91  <Field boolean mDirtyHierarchy>
	//   66  135:return          
	}

	public void onViewRemoved(View view)
	{
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #480 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          13
			super.onViewRemoved(view);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokespecial   #722 <Method void ViewGroup.onViewRemoved(View)>
		mChildrenByIds.remove(view.getId());
	//    6   13:aload_0         
	//    7   14:getfield        #66  <Field SparseArray mChildrenByIds>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #719 <Method int View.getId()>
	//   10   21:invokevirtual   #724 <Method void SparseArray.remove(int)>
		ConstraintWidget constraintwidget = getViewWidget(view);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokevirtual   #698 <Method ConstraintWidget getViewWidget(View)>
	//   14   29:astore_2        
		mLayoutWidget.remove(constraintwidget);
	//   15   30:aload_0         
	//   16   31:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//   17   34:aload_2         
	//   18   35:invokevirtual   #727 <Method void ConstraintWidgetContainer.remove(ConstraintWidget)>
		mConstraintHelpers.remove(((Object) (view)));
	//   19   38:aload_0         
	//   20   39:getfield        #73  <Field ArrayList mConstraintHelpers>
	//   21   42:aload_1         
	//   22   43:invokevirtual   #729 <Method boolean ArrayList.remove(Object)>
	//   23   46:pop             
		mVariableDimensionsWidgets.remove(((Object) (constraintwidget)));
	//   24   47:aload_0         
	//   25   48:getfield        #75  <Field ArrayList mVariableDimensionsWidgets>
	//   26   51:aload_2         
	//   27   52:invokevirtual   #729 <Method boolean ArrayList.remove(Object)>
	//   28   55:pop             
		mDirtyHierarchy = true;
	//   29   56:aload_0         
	//   30   57:iconst_1        
	//   31   58:putfield        #91  <Field boolean mDirtyHierarchy>
	//   32   61:return          
	}

	public void removeView(View view)
	{
		super.removeView(view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #732 <Method void ViewGroup.removeView(View)>
		if(android.os.Build.VERSION.SDK_INT < 14)
	//*   3    5:getstatic       #480 <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          14
	//*   5   10:icmpge          18
			onViewRemoved(view);
	//    6   13:aload_0         
	//    7   14:aload_1         
	//    8   15:invokevirtual   #733 <Method void onViewRemoved(View)>
	//    9   18:return          
	}

	public void requestLayout()
	{
		super.requestLayout();
	//    0    0:aload_0         
	//    1    1:invokespecial   #736 <Method void ViewGroup.requestLayout()>
		mDirtyHierarchy = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #91  <Field boolean mDirtyHierarchy>
		mLastMeasureWidth = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #104 <Field int mLastMeasureWidth>
		mLastMeasureHeight = -1;
	//    8   14:aload_0         
	//    9   15:iconst_m1       
	//   10   16:putfield        #106 <Field int mLastMeasureHeight>
		mLastMeasureWidthSize = -1;
	//   11   19:aload_0         
	//   12   20:iconst_m1       
	//   13   21:putfield        #108 <Field int mLastMeasureWidthSize>
		mLastMeasureHeightSize = -1;
	//   14   24:aload_0         
	//   15   25:iconst_m1       
	//   16   26:putfield        #110 <Field int mLastMeasureHeightSize>
		mLastMeasureWidthMode = 0;
	//   17   29:aload_0         
	//   18   30:iconst_0        
	//   19   31:putfield        #112 <Field int mLastMeasureWidthMode>
		mLastMeasureHeightMode = 0;
	//   20   34:aload_0         
	//   21   35:iconst_0        
	//   22   36:putfield        #114 <Field int mLastMeasureHeightMode>
	//   23   39:return          
	}

	public void setConstraintSet(ConstraintSet constraintset)
	{
		mConstraintSet = constraintset;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field ConstraintSet mConstraintSet>
	//    3    5:return          
	}

	public void setDesignInformation(int i, Object obj, Object obj1)
	{
		if(i == 0 && (obj instanceof String) && (obj1 instanceof Integer))
	//*   0    0:iload_1         
	//*   1    1:ifne            89
	//*   2    4:aload_2         
	//*   3    5:instanceof      #505 <Class String>
	//*   4    8:ifeq            89
	//*   5   11:aload_3         
	//*   6   12:instanceof      #513 <Class Integer>
	//*   7   15:ifeq            89
		{
			if(mDesignIds == null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #102 <Field HashMap mDesignIds>
	//*  10   22:ifnonnull       36
				mDesignIds = new HashMap();
	//   11   25:aload_0         
	//   12   26:new             #99  <Class HashMap>
	//   13   29:dup             
	//   14   30:invokespecial   #100 <Method void HashMap()>
	//   15   33:putfield        #102 <Field HashMap mDesignIds>
			String s = (String)obj;
	//   16   36:aload_2         
	//   17   37:checkcast       #505 <Class String>
	//   18   40:astore          4
			i = s.indexOf("/");
	//   19   42:aload           4
	//   20   44:ldc2            #742 <String "/">
	//   21   47:invokevirtual   #745 <Method int String.indexOf(String)>
	//   22   50:istore_1        
			obj = ((Object) (s));
	//   23   51:aload           4
	//   24   53:astore_2        
			if(i != -1)
	//*  25   54:iload_1         
	//*  26   55:iconst_m1       
	//*  27   56:icmpeq          68
				obj = ((Object) (s.substring(i + 1)));
	//   28   59:aload           4
	//   29   61:iload_1         
	//   30   62:iconst_1        
	//   31   63:iadd            
	//   32   64:invokevirtual   #749 <Method String String.substring(int)>
	//   33   67:astore_2        
			i = ((Integer)obj1).intValue();
	//   34   68:aload_3         
	//   35   69:checkcast       #513 <Class Integer>
	//   36   72:invokevirtual   #752 <Method int Integer.intValue()>
	//   37   75:istore_1        
			mDesignIds.put(obj, ((Object) (Integer.valueOf(i))));
	//   38   76:aload_0         
	//   39   77:getfield        #102 <Field HashMap mDesignIds>
	//   40   80:aload_2         
	//   41   81:iload_1         
	//   42   82:invokestatic    #756 <Method Integer Integer.valueOf(int)>
	//   43   85:invokevirtual   #759 <Method Object HashMap.put(Object, Object)>
	//   44   88:pop             
		}
	//   45   89:return          
	}

	public void setId(int i)
	{
		mChildrenByIds.remove(getId());
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field SparseArray mChildrenByIds>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #151 <Method int getId()>
	//    4    8:invokevirtual   #724 <Method void SparseArray.remove(int)>
		super.setId(i);
	//    5   11:aload_0         
	//    6   12:iload_1         
	//    7   13:invokespecial   #762 <Method void ViewGroup.setId(int)>
		mChildrenByIds.put(getId(), ((Object) (this)));
	//    8   16:aload_0         
	//    9   17:getfield        #66  <Field SparseArray mChildrenByIds>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #151 <Method int getId()>
	//   12   24:aload_0         
	//   13   25:invokevirtual   #155 <Method void SparseArray.put(int, Object)>
	//   14   28:return          
	}

	public void setMaxHeight(int i)
	{
		if(i == mMaxHeight)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #89  <Field int mMaxHeight>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			mMaxHeight = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #89  <Field int mMaxHeight>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #763 <Method void requestLayout()>
			return;
	//   10   18:return          
		}
	}

	public void setMaxWidth(int i)
	{
		if(i == mMaxWidth)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #87  <Field int mMaxWidth>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			mMaxWidth = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #87  <Field int mMaxWidth>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #763 <Method void requestLayout()>
			return;
	//   10   18:return          
		}
	}

	public void setMinHeight(int i)
	{
		if(i == mMinHeight)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #84  <Field int mMinHeight>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			mMinHeight = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #84  <Field int mMinHeight>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #763 <Method void requestLayout()>
			return;
	//   10   18:return          
		}
	}

	public void setMinWidth(int i)
	{
		if(i == mMinWidth)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #82  <Field int mMinWidth>
	//*   3    5:icmpne          9
		{
			return;
	//    4    8:return          
		} else
		{
			mMinWidth = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #82  <Field int mMinWidth>
			requestLayout();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #763 <Method void requestLayout()>
			return;
	//   10   18:return          
		}
	}

	public void setOptimizationLevel(int i)
	{
		mLayoutWidget.setOptimizationLevel(i);
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #221 <Method void ConstraintWidgetContainer.setOptimizationLevel(int)>
	//    4    8:return          
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void solveLinearSystem(String s)
	{
		mLayoutWidget.layout();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field ConstraintWidgetContainer mLayoutWidget>
	//    2    4:invokevirtual   #766 <Method void ConstraintWidgetContainer.layout()>
		s = ((String) (mMetrics));
	//    3    7:aload_0         
	//    4    8:getfield        #283 <Field Metrics mMetrics>
	//    5   11:astore_1        
		if(s != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          26
			s.resolutions = ((Metrics) (s)).resolutions + 1L;
	//    8   16:aload_1         
	//    9   17:aload_1         
	//   10   18:getfield        #769 <Field long Metrics.resolutions>
	//   11   21:lconst_1        
	//   12   22:ladd            
	//   13   23:putfield        #769 <Field long Metrics.resolutions>
	//   14   26:return          
	}

	static final boolean ALLOWS_EMBEDDED = false;
	private static final boolean DEBUG = false;
	public static final int DESIGN_INFO_ID = 0;
	private static final String TAG = "ConstraintLayout";
	private static final boolean USE_CONSTRAINTS_HELPER = true;
	public static final String VERSION = "ConstraintLayout-1.1.2";
	SparseArray mChildrenByIds;
	private ArrayList mConstraintHelpers;
	private ConstraintSet mConstraintSet;
	private int mConstraintSetId;
	private HashMap mDesignIds;
	private boolean mDirtyHierarchy;
	private int mLastMeasureHeight;
	int mLastMeasureHeightMode;
	int mLastMeasureHeightSize;
	private int mLastMeasureWidth;
	int mLastMeasureWidthMode;
	int mLastMeasureWidthSize;
	ConstraintWidgetContainer mLayoutWidget;
	private int mMaxHeight;
	private int mMaxWidth;
	private Metrics mMetrics;
	private int mMinHeight;
	private int mMinWidth;
	private int mOptimizationLevel;
	private final ArrayList mVariableDimensionsWidgets;
}
