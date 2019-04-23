// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.constraint.solver.widgets;

import android.support.constraint.solver.LinearSystem;
import android.support.constraint.solver.Metrics;

// Referenced classes of package android.support.constraint.solver.widgets:
//			ConstraintWidget, ConstraintAnchor, ResolutionAnchor, ResolutionDimension, 
//			ChainHead, ConstraintWidgetContainer

public class Optimizer
{

	public Optimizer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:return          
	}

	static void analyze(int i, ConstraintWidget constraintwidget)
	{
		constraintwidget.updateResolutionNodes();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method void ConstraintWidget.updateResolutionNodes()>
		ResolutionAnchor resolutionanchor = constraintwidget.mLeft.getResolutionNode();
	//    2    4:aload_1         
	//    3    5:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//    4    8:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    5   11:astore_3        
		ResolutionAnchor resolutionanchor1 = constraintwidget.mTop.getResolutionNode();
	//    6   12:aload_1         
	//    7   13:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//    8   16:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//    9   19:astore          4
		ResolutionAnchor resolutionanchor2 = constraintwidget.mRight.getResolutionNode();
	//   10   21:aload_1         
	//   11   22:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//   12   25:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   13   28:astore          5
		ResolutionAnchor resolutionanchor3 = constraintwidget.mBottom.getResolutionNode();
	//   14   30:aload_1         
	//   15   31:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//   16   34:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//   17   37:astore          6
		if((i & 8) == 8)
	//*  18   39:iload_0         
	//*  19   40:bipush          8
	//*  20   42:iand            
	//*  21   43:bipush          8
	//*  22   45:icmpne          53
			i = 1;
	//   23   48:iconst_1        
	//   24   49:istore_0        
		else
	//*  25   50:goto            55
			i = 0;
	//   26   53:iconst_0        
	//   27   54:istore_0        
		boolean flag;
		if(constraintwidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && optimizableMatchConstraint(constraintwidget, 0))
	//*  28   55:aload_1         
	//*  29   56:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  30   59:iconst_0        
	//*  31   60:aaload          
	//*  32   61:getstatic       #68  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*  33   64:if_acmpne       80
	//*  34   67:aload_1         
	//*  35   68:iconst_0        
	//*  36   69:invokestatic    #72  <Method boolean optimizableMatchConstraint(ConstraintWidget, int)>
	//*  37   72:ifeq            80
			flag = true;
	//   38   75:iconst_1        
	//   39   76:istore_2        
		else
	//*  40   77:goto            82
			flag = false;
	//   41   80:iconst_0        
	//   42   81:istore_2        
		if(resolutionanchor.type != 4 && resolutionanchor2.type != 4)
	//*  43   82:aload_3         
	//*  44   83:getfield        #77  <Field int ResolutionAnchor.type>
	//*  45   86:iconst_4        
	//*  46   87:icmpeq          704
	//*  47   90:aload           5
	//*  48   92:getfield        #77  <Field int ResolutionAnchor.type>
	//*  49   95:iconst_4        
	//*  50   96:icmpeq          704
			if(constraintwidget.mListDimensionBehaviors[0] != ConstraintWidget.DimensionBehaviour.FIXED && (!flag || constraintwidget.getVisibility() != 8))
	//*  51   99:aload_1         
	//*  52  100:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  53  103:iconst_0        
	//*  54  104:aaload          
	//*  55  105:getstatic       #80  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//*  56  108:if_acmpeq       406
	//*  57  111:iload_2         
	//*  58  112:ifeq            127
	//*  59  115:aload_1         
	//*  60  116:invokevirtual   #84  <Method int ConstraintWidget.getVisibility()>
	//*  61  119:bipush          8
	//*  62  121:icmpne          127
	//*  63  124:goto            406
			{
				if(flag)
	//*  64  127:iload_2         
	//*  65  128:ifeq            704
				{
					int j = constraintwidget.getWidth();
	//   66  131:aload_1         
	//   67  132:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//   68  135:istore_2        
					resolutionanchor.setType(1);
	//   69  136:aload_3         
	//   70  137:iconst_1        
	//   71  138:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
					resolutionanchor2.setType(1);
	//   72  141:aload           5
	//   73  143:iconst_1        
	//   74  144:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
					if(constraintwidget.mLeft.mTarget == null && constraintwidget.mRight.mTarget == null)
	//*  75  147:aload_1         
	//*  76  148:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//*  77  151:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  78  154:ifnonnull       195
	//*  79  157:aload_1         
	//*  80  158:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//*  81  161:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//*  82  164:ifnonnull       195
					{
						if(i != 0)
	//*  83  167:iload_0         
	//*  84  168:ifeq            185
							resolutionanchor2.dependsOn(resolutionanchor, 1, constraintwidget.getResolutionWidth());
	//   85  171:aload           5
	//   86  173:aload_3         
	//   87  174:iconst_1        
	//   88  175:aload_1         
	//   89  176:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//   90  179:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
						else
	//*  91  182:goto            704
							resolutionanchor2.dependsOn(resolutionanchor, j);
	//   92  185:aload           5
	//   93  187:aload_3         
	//   94  188:iload_2         
	//   95  189:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
					} else
	//*  96  192:goto            704
					if(constraintwidget.mLeft.mTarget != null && constraintwidget.mRight.mTarget == null)
	//*  97  195:aload_1         
	//*  98  196:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//*  99  199:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 100  202:ifnull          243
	//* 101  205:aload_1         
	//* 102  206:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//* 103  209:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 104  212:ifnonnull       243
					{
						if(i != 0)
	//* 105  215:iload_0         
	//* 106  216:ifeq            233
							resolutionanchor2.dependsOn(resolutionanchor, 1, constraintwidget.getResolutionWidth());
	//  107  219:aload           5
	//  108  221:aload_3         
	//  109  222:iconst_1        
	//  110  223:aload_1         
	//  111  224:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  112  227:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
						else
	//* 113  230:goto            704
							resolutionanchor2.dependsOn(resolutionanchor, j);
	//  114  233:aload           5
	//  115  235:aload_3         
	//  116  236:iload_2         
	//  117  237:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
					} else
	//* 118  240:goto            704
					if(constraintwidget.mLeft.mTarget == null && constraintwidget.mRight.mTarget != null)
	//* 119  243:aload_1         
	//* 120  244:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//* 121  247:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 122  250:ifnonnull       292
	//* 123  253:aload_1         
	//* 124  254:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//* 125  257:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 126  260:ifnull          292
					{
						if(i != 0)
	//* 127  263:iload_0         
	//* 128  264:ifeq            281
							resolutionanchor.dependsOn(resolutionanchor2, -1, constraintwidget.getResolutionWidth());
	//  129  267:aload_3         
	//  130  268:aload           5
	//  131  270:iconst_m1       
	//  132  271:aload_1         
	//  133  272:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  134  275:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
						else
	//* 135  278:goto            704
							resolutionanchor.dependsOn(resolutionanchor2, -j);
	//  136  281:aload_3         
	//  137  282:aload           5
	//  138  284:iload_2         
	//  139  285:ineg            
	//  140  286:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
					} else
	//* 141  289:goto            704
					if(constraintwidget.mLeft.mTarget != null && constraintwidget.mRight.mTarget != null)
	//* 142  292:aload_1         
	//* 143  293:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//* 144  296:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 145  299:ifnull          704
	//* 146  302:aload_1         
	//* 147  303:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//* 148  306:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 149  309:ifnull          704
					{
						if(i != 0)
	//* 150  312:iload_0         
	//* 151  313:ifeq            333
						{
							constraintwidget.getResolutionWidth().addDependent(((ResolutionNode) (resolutionanchor)));
	//  152  316:aload_1         
	//  153  317:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  154  320:aload_3         
	//  155  321:invokevirtual   #111 <Method void ResolutionDimension.addDependent(ResolutionNode)>
							constraintwidget.getResolutionWidth().addDependent(((ResolutionNode) (resolutionanchor2)));
	//  156  324:aload_1         
	//  157  325:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  158  328:aload           5
	//  159  330:invokevirtual   #111 <Method void ResolutionDimension.addDependent(ResolutionNode)>
						}
						if(constraintwidget.mDimensionRatio == 0.0F)
	//* 160  333:aload_1         
	//* 161  334:getfield        #115 <Field float ConstraintWidget.mDimensionRatio>
	//* 162  337:fconst_0        
	//* 163  338:fcmpl           
	//* 164  339:ifne            370
						{
							resolutionanchor.setType(3);
	//  165  342:aload_3         
	//  166  343:iconst_3        
	//  167  344:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
							resolutionanchor2.setType(3);
	//  168  347:aload           5
	//  169  349:iconst_3        
	//  170  350:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
							resolutionanchor.setOpposite(resolutionanchor2, 0.0F);
	//  171  353:aload_3         
	//  172  354:aload           5
	//  173  356:fconst_0        
	//  174  357:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
							resolutionanchor2.setOpposite(resolutionanchor, 0.0F);
	//  175  360:aload           5
	//  176  362:aload_3         
	//  177  363:fconst_0        
	//  178  364:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
						} else
	//* 179  367:goto            704
						{
							resolutionanchor.setType(2);
	//  180  370:aload_3         
	//  181  371:iconst_2        
	//  182  372:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
							resolutionanchor2.setType(2);
	//  183  375:aload           5
	//  184  377:iconst_2        
	//  185  378:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
							resolutionanchor.setOpposite(resolutionanchor2, -j);
	//  186  381:aload_3         
	//  187  382:aload           5
	//  188  384:iload_2         
	//  189  385:ineg            
	//  190  386:i2f             
	//  191  387:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
							resolutionanchor2.setOpposite(resolutionanchor, j);
	//  192  390:aload           5
	//  193  392:aload_3         
	//  194  393:iload_2         
	//  195  394:i2f             
	//  196  395:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
							constraintwidget.setWidth(j);
	//  197  398:aload_1         
	//  198  399:iload_2         
	//  199  400:invokevirtual   #122 <Method void ConstraintWidget.setWidth(int)>
						}
					}
				}
			} else
	//* 200  403:goto            704
			if(constraintwidget.mLeft.mTarget == null && constraintwidget.mRight.mTarget == null)
	//* 201  406:aload_1         
	//* 202  407:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//* 203  410:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 204  413:ifnonnull       468
	//* 205  416:aload_1         
	//* 206  417:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//* 207  420:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 208  423:ifnonnull       468
			{
				resolutionanchor.setType(1);
	//  209  426:aload_3         
	//  210  427:iconst_1        
	//  211  428:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor2.setType(1);
	//  212  431:aload           5
	//  213  433:iconst_1        
	//  214  434:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				if(i != 0)
	//* 215  437:iload_0         
	//* 216  438:ifeq            455
					resolutionanchor2.dependsOn(resolutionanchor, 1, constraintwidget.getResolutionWidth());
	//  217  441:aload           5
	//  218  443:aload_3         
	//  219  444:iconst_1        
	//  220  445:aload_1         
	//  221  446:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  222  449:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
				else
	//* 223  452:goto            704
					resolutionanchor2.dependsOn(resolutionanchor, constraintwidget.getWidth());
	//  224  455:aload           5
	//  225  457:aload_3         
	//  226  458:aload_1         
	//  227  459:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  228  462:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
			} else
	//* 229  465:goto            704
			if(constraintwidget.mLeft.mTarget != null && constraintwidget.mRight.mTarget == null)
	//* 230  468:aload_1         
	//* 231  469:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//* 232  472:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 233  475:ifnull          530
	//* 234  478:aload_1         
	//* 235  479:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//* 236  482:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 237  485:ifnonnull       530
			{
				resolutionanchor.setType(1);
	//  238  488:aload_3         
	//  239  489:iconst_1        
	//  240  490:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor2.setType(1);
	//  241  493:aload           5
	//  242  495:iconst_1        
	//  243  496:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				if(i != 0)
	//* 244  499:iload_0         
	//* 245  500:ifeq            517
					resolutionanchor2.dependsOn(resolutionanchor, 1, constraintwidget.getResolutionWidth());
	//  246  503:aload           5
	//  247  505:aload_3         
	//  248  506:iconst_1        
	//  249  507:aload_1         
	//  250  508:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  251  511:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
				else
	//* 252  514:goto            704
					resolutionanchor2.dependsOn(resolutionanchor, constraintwidget.getWidth());
	//  253  517:aload           5
	//  254  519:aload_3         
	//  255  520:aload_1         
	//  256  521:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  257  524:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
			} else
	//* 258  527:goto            704
			if(constraintwidget.mLeft.mTarget == null && constraintwidget.mRight.mTarget != null)
	//* 259  530:aload_1         
	//* 260  531:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//* 261  534:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 262  537:ifnonnull       604
	//* 263  540:aload_1         
	//* 264  541:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//* 265  544:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 266  547:ifnull          604
			{
				resolutionanchor.setType(1);
	//  267  550:aload_3         
	//  268  551:iconst_1        
	//  269  552:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor2.setType(1);
	//  270  555:aload           5
	//  271  557:iconst_1        
	//  272  558:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor.dependsOn(resolutionanchor2, -constraintwidget.getWidth());
	//  273  561:aload_3         
	//  274  562:aload           5
	//  275  564:aload_1         
	//  276  565:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  277  568:ineg            
	//  278  569:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
				if(i != 0)
	//* 279  572:iload_0         
	//* 280  573:ifeq            590
					resolutionanchor.dependsOn(resolutionanchor2, -1, constraintwidget.getResolutionWidth());
	//  281  576:aload_3         
	//  282  577:aload           5
	//  283  579:iconst_m1       
	//  284  580:aload_1         
	//  285  581:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  286  584:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
				else
	//* 287  587:goto            704
					resolutionanchor.dependsOn(resolutionanchor2, -constraintwidget.getWidth());
	//  288  590:aload_3         
	//  289  591:aload           5
	//  290  593:aload_1         
	//  291  594:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  292  597:ineg            
	//  293  598:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
			} else
	//* 294  601:goto            704
			if(constraintwidget.mLeft.mTarget != null && constraintwidget.mRight.mTarget != null)
	//* 295  604:aload_1         
	//* 296  605:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//* 297  608:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 298  611:ifnull          704
	//* 299  614:aload_1         
	//* 300  615:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//* 301  618:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 302  621:ifnull          704
			{
				resolutionanchor.setType(2);
	//  303  624:aload_3         
	//  304  625:iconst_2        
	//  305  626:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor2.setType(2);
	//  306  629:aload           5
	//  307  631:iconst_2        
	//  308  632:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				if(i != 0)
	//* 309  635:iload_0         
	//* 310  636:ifeq            681
				{
					constraintwidget.getResolutionWidth().addDependent(((ResolutionNode) (resolutionanchor)));
	//  311  639:aload_1         
	//  312  640:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  313  643:aload_3         
	//  314  644:invokevirtual   #111 <Method void ResolutionDimension.addDependent(ResolutionNode)>
					constraintwidget.getResolutionWidth().addDependent(((ResolutionNode) (resolutionanchor2)));
	//  315  647:aload_1         
	//  316  648:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  317  651:aload           5
	//  318  653:invokevirtual   #111 <Method void ResolutionDimension.addDependent(ResolutionNode)>
					resolutionanchor.setOpposite(resolutionanchor2, -1, constraintwidget.getResolutionWidth());
	//  319  656:aload_3         
	//  320  657:aload           5
	//  321  659:iconst_m1       
	//  322  660:aload_1         
	//  323  661:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  324  664:invokevirtual   #124 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, int, ResolutionDimension)>
					resolutionanchor2.setOpposite(resolutionanchor, 1, constraintwidget.getResolutionWidth());
	//  325  667:aload           5
	//  326  669:aload_3         
	//  327  670:iconst_1        
	//  328  671:aload_1         
	//  329  672:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  330  675:invokevirtual   #124 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, int, ResolutionDimension)>
				} else
	//* 331  678:goto            704
				{
					resolutionanchor.setOpposite(resolutionanchor2, -constraintwidget.getWidth());
	//  332  681:aload_3         
	//  333  682:aload           5
	//  334  684:aload_1         
	//  335  685:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  336  688:ineg            
	//  337  689:i2f             
	//  338  690:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
					resolutionanchor2.setOpposite(resolutionanchor, constraintwidget.getWidth());
	//  339  693:aload           5
	//  340  695:aload_3         
	//  341  696:aload_1         
	//  342  697:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  343  700:i2f             
	//  344  701:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
				}
			}
		if(constraintwidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && optimizableMatchConstraint(constraintwidget, 1))
	//* 345  704:aload_1         
	//* 346  705:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//* 347  708:iconst_1        
	//* 348  709:aaload          
	//* 349  710:getstatic       #68  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 350  713:if_acmpne       729
	//* 351  716:aload_1         
	//* 352  717:iconst_1        
	//* 353  718:invokestatic    #72  <Method boolean optimizableMatchConstraint(ConstraintWidget, int)>
	//* 354  721:ifeq            729
			j = 1;
	//  355  724:iconst_1        
	//  356  725:istore_2        
		else
	//* 357  726:goto            731
			j = 0;
	//  358  729:iconst_0        
	//  359  730:istore_2        
		if(resolutionanchor1.type != 4 && resolutionanchor3.type != 4)
	//* 360  731:aload           4
	//* 361  733:getfield        #77  <Field int ResolutionAnchor.type>
	//* 362  736:iconst_4        
	//* 363  737:icmpeq          1485
	//* 364  740:aload           6
	//* 365  742:getfield        #77  <Field int ResolutionAnchor.type>
	//* 366  745:iconst_4        
	//* 367  746:icmpeq          1485
			if(constraintwidget.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.FIXED && (!j || constraintwidget.getVisibility() != 8))
	//* 368  749:aload_1         
	//* 369  750:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//* 370  753:iconst_1        
	//* 371  754:aaload          
	//* 372  755:getstatic       #80  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.FIXED>
	//* 373  758:if_acmpeq       1078
	//* 374  761:iload_2         
	//* 375  762:ifeq            777
	//* 376  765:aload_1         
	//* 377  766:invokevirtual   #84  <Method int ConstraintWidget.getVisibility()>
	//* 378  769:bipush          8
	//* 379  771:icmpne          777
	//* 380  774:goto            1078
			{
				if(j)
	//* 381  777:iload_2         
	//* 382  778:ifeq            1485
				{
					int k = constraintwidget.getHeight();
	//  383  781:aload_1         
	//  384  782:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  385  785:istore_2        
					resolutionanchor1.setType(1);
	//  386  786:aload           4
	//  387  788:iconst_1        
	//  388  789:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
					resolutionanchor3.setType(1);
	//  389  792:aload           6
	//  390  794:iconst_1        
	//  391  795:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
					if(constraintwidget.mTop.mTarget == null && constraintwidget.mBottom.mTarget == null)
	//* 392  798:aload_1         
	//* 393  799:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//* 394  802:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 395  805:ifnonnull       844
	//* 396  808:aload_1         
	//* 397  809:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//* 398  812:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 399  815:ifnonnull       844
						if(i != 0)
	//* 400  818:iload_0         
	//* 401  819:ifeq            835
						{
							resolutionanchor3.dependsOn(resolutionanchor1, 1, constraintwidget.getResolutionHeight());
	//  402  822:aload           6
	//  403  824:aload           4
	//  404  826:iconst_1        
	//  405  827:aload_1         
	//  406  828:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  407  831:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
							return;
	//  408  834:return          
						} else
						{
							resolutionanchor3.dependsOn(resolutionanchor1, k);
	//  409  835:aload           6
	//  410  837:aload           4
	//  411  839:iload_2         
	//  412  840:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
							return;
	//  413  843:return          
						}
					if(constraintwidget.mTop.mTarget != null && constraintwidget.mBottom.mTarget == null)
	//* 414  844:aload_1         
	//* 415  845:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//* 416  848:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 417  851:ifnull          890
	//* 418  854:aload_1         
	//* 419  855:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//* 420  858:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 421  861:ifnonnull       890
						if(i != 0)
	//* 422  864:iload_0         
	//* 423  865:ifeq            881
						{
							resolutionanchor3.dependsOn(resolutionanchor1, 1, constraintwidget.getResolutionHeight());
	//  424  868:aload           6
	//  425  870:aload           4
	//  426  872:iconst_1        
	//  427  873:aload_1         
	//  428  874:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  429  877:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
							return;
	//  430  880:return          
						} else
						{
							resolutionanchor3.dependsOn(resolutionanchor1, k);
	//  431  881:aload           6
	//  432  883:aload           4
	//  433  885:iload_2         
	//  434  886:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
							return;
	//  435  889:return          
						}
					if(constraintwidget.mTop.mTarget == null && constraintwidget.mBottom.mTarget != null)
	//* 436  890:aload_1         
	//* 437  891:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//* 438  894:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 439  897:ifnonnull       937
	//* 440  900:aload_1         
	//* 441  901:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//* 442  904:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 443  907:ifnull          937
						if(i != 0)
	//* 444  910:iload_0         
	//* 445  911:ifeq            927
						{
							resolutionanchor1.dependsOn(resolutionanchor3, -1, constraintwidget.getResolutionHeight());
	//  446  914:aload           4
	//  447  916:aload           6
	//  448  918:iconst_m1       
	//  449  919:aload_1         
	//  450  920:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  451  923:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
							return;
	//  452  926:return          
						} else
						{
							resolutionanchor1.dependsOn(resolutionanchor3, -k);
	//  453  927:aload           4
	//  454  929:aload           6
	//  455  931:iload_2         
	//  456  932:ineg            
	//  457  933:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
							return;
	//  458  936:return          
						}
					if(constraintwidget.mTop.mTarget != null && constraintwidget.mBottom.mTarget != null)
	//* 459  937:aload_1         
	//* 460  938:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//* 461  941:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 462  944:ifnull          1485
	//* 463  947:aload_1         
	//* 464  948:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//* 465  951:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 466  954:ifnull          1485
					{
						if(i != 0)
	//* 467  957:iload_0         
	//* 468  958:ifeq            979
						{
							constraintwidget.getResolutionHeight().addDependent(((ResolutionNode) (resolutionanchor1)));
	//  469  961:aload_1         
	//  470  962:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  471  965:aload           4
	//  472  967:invokevirtual   #111 <Method void ResolutionDimension.addDependent(ResolutionNode)>
							constraintwidget.getResolutionWidth().addDependent(((ResolutionNode) (resolutionanchor3)));
	//  473  970:aload_1         
	//  474  971:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  475  974:aload           6
	//  476  976:invokevirtual   #111 <Method void ResolutionDimension.addDependent(ResolutionNode)>
						}
						if(constraintwidget.mDimensionRatio == 0.0F)
	//* 477  979:aload_1         
	//* 478  980:getfield        #115 <Field float ConstraintWidget.mDimensionRatio>
	//* 479  983:fconst_0        
	//* 480  984:fcmpl           
	//* 481  985:ifne            1017
						{
							resolutionanchor1.setType(3);
	//  482  988:aload           4
	//  483  990:iconst_3        
	//  484  991:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
							resolutionanchor3.setType(3);
	//  485  994:aload           6
	//  486  996:iconst_3        
	//  487  997:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
							resolutionanchor1.setOpposite(resolutionanchor3, 0.0F);
	//  488 1000:aload           4
	//  489 1002:aload           6
	//  490 1004:fconst_0        
	//  491 1005:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
							resolutionanchor3.setOpposite(resolutionanchor1, 0.0F);
	//  492 1008:aload           6
	//  493 1010:aload           4
	//  494 1012:fconst_0        
	//  495 1013:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
							return;
	//  496 1016:return          
						}
						resolutionanchor1.setType(2);
	//  497 1017:aload           4
	//  498 1019:iconst_2        
	//  499 1020:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
						resolutionanchor3.setType(2);
	//  500 1023:aload           6
	//  501 1025:iconst_2        
	//  502 1026:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
						resolutionanchor1.setOpposite(resolutionanchor3, -k);
	//  503 1029:aload           4
	//  504 1031:aload           6
	//  505 1033:iload_2         
	//  506 1034:ineg            
	//  507 1035:i2f             
	//  508 1036:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
						resolutionanchor3.setOpposite(resolutionanchor1, k);
	//  509 1039:aload           6
	//  510 1041:aload           4
	//  511 1043:iload_2         
	//  512 1044:i2f             
	//  513 1045:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
						constraintwidget.setHeight(k);
	//  514 1048:aload_1         
	//  515 1049:iload_2         
	//  516 1050:invokevirtual   #133 <Method void ConstraintWidget.setHeight(int)>
						if(constraintwidget.mBaselineDistance > 0)
	//* 517 1053:aload_1         
	//* 518 1054:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//* 519 1057:ifle            1485
						{
							constraintwidget.mBaseline.getResolutionNode().dependsOn(1, resolutionanchor1, constraintwidget.mBaselineDistance);
	//  520 1060:aload_1         
	//  521 1061:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  522 1064:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  523 1067:iconst_1        
	//  524 1068:aload           4
	//  525 1070:aload_1         
	//  526 1071:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//  527 1074:invokevirtual   #142 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
							return;
	//  528 1077:return          
						}
					}
				}
			} else
			if(constraintwidget.mTop.mTarget == null && constraintwidget.mBottom.mTarget == null)
	//* 529 1078:aload_1         
	//* 530 1079:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//* 531 1082:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 532 1085:ifnonnull       1180
	//* 533 1088:aload_1         
	//* 534 1089:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//* 535 1092:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 536 1095:ifnonnull       1180
			{
				resolutionanchor1.setType(1);
	//  537 1098:aload           4
	//  538 1100:iconst_1        
	//  539 1101:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor3.setType(1);
	//  540 1104:aload           6
	//  541 1106:iconst_1        
	//  542 1107:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				if(i != 0)
	//* 543 1110:iload_0         
	//* 544 1111:ifeq            1129
					resolutionanchor3.dependsOn(resolutionanchor1, 1, constraintwidget.getResolutionHeight());
	//  545 1114:aload           6
	//  546 1116:aload           4
	//  547 1118:iconst_1        
	//  548 1119:aload_1         
	//  549 1120:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  550 1123:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
				else
	//* 551 1126:goto            1140
					resolutionanchor3.dependsOn(resolutionanchor1, constraintwidget.getHeight());
	//  552 1129:aload           6
	//  553 1131:aload           4
	//  554 1133:aload_1         
	//  555 1134:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  556 1137:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
				if(constraintwidget.mBaseline.mTarget != null)
	//* 557 1140:aload_1         
	//* 558 1141:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//* 559 1144:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 560 1147:ifnull          1485
				{
					constraintwidget.mBaseline.getResolutionNode().setType(1);
	//  561 1150:aload_1         
	//  562 1151:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  563 1154:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  564 1157:iconst_1        
	//  565 1158:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
					resolutionanchor1.dependsOn(1, constraintwidget.mBaseline.getResolutionNode(), -constraintwidget.mBaselineDistance);
	//  566 1161:aload           4
	//  567 1163:iconst_1        
	//  568 1164:aload_1         
	//  569 1165:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  570 1168:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  571 1171:aload_1         
	//  572 1172:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//  573 1175:ineg            
	//  574 1176:invokevirtual   #142 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
					return;
	//  575 1179:return          
				}
			} else
			if(constraintwidget.mTop.mTarget != null && constraintwidget.mBottom.mTarget == null)
	//* 576 1180:aload_1         
	//* 577 1181:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//* 578 1184:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 579 1187:ifnull          1267
	//* 580 1190:aload_1         
	//* 581 1191:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//* 582 1194:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 583 1197:ifnonnull       1267
			{
				resolutionanchor1.setType(1);
	//  584 1200:aload           4
	//  585 1202:iconst_1        
	//  586 1203:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor3.setType(1);
	//  587 1206:aload           6
	//  588 1208:iconst_1        
	//  589 1209:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				if(i != 0)
	//* 590 1212:iload_0         
	//* 591 1213:ifeq            1231
					resolutionanchor3.dependsOn(resolutionanchor1, 1, constraintwidget.getResolutionHeight());
	//  592 1216:aload           6
	//  593 1218:aload           4
	//  594 1220:iconst_1        
	//  595 1221:aload_1         
	//  596 1222:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  597 1225:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
				else
	//* 598 1228:goto            1242
					resolutionanchor3.dependsOn(resolutionanchor1, constraintwidget.getHeight());
	//  599 1231:aload           6
	//  600 1233:aload           4
	//  601 1235:aload_1         
	//  602 1236:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  603 1239:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
				if(constraintwidget.mBaselineDistance > 0)
	//* 604 1242:aload_1         
	//* 605 1243:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//* 606 1246:ifle            1485
				{
					constraintwidget.mBaseline.getResolutionNode().dependsOn(1, resolutionanchor1, constraintwidget.mBaselineDistance);
	//  607 1249:aload_1         
	//  608 1250:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  609 1253:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  610 1256:iconst_1        
	//  611 1257:aload           4
	//  612 1259:aload_1         
	//  613 1260:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//  614 1263:invokevirtual   #142 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
					return;
	//  615 1266:return          
				}
			} else
			if(constraintwidget.mTop.mTarget == null && constraintwidget.mBottom.mTarget != null)
	//* 616 1267:aload_1         
	//* 617 1268:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//* 618 1271:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 619 1274:ifnonnull       1355
	//* 620 1277:aload_1         
	//* 621 1278:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//* 622 1281:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 623 1284:ifnull          1355
			{
				resolutionanchor1.setType(1);
	//  624 1287:aload           4
	//  625 1289:iconst_1        
	//  626 1290:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor3.setType(1);
	//  627 1293:aload           6
	//  628 1295:iconst_1        
	//  629 1296:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				if(i != 0)
	//* 630 1299:iload_0         
	//* 631 1300:ifeq            1318
					resolutionanchor1.dependsOn(resolutionanchor3, -1, constraintwidget.getResolutionHeight());
	//  632 1303:aload           4
	//  633 1305:aload           6
	//  634 1307:iconst_m1       
	//  635 1308:aload_1         
	//  636 1309:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  637 1312:invokevirtual   #102 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int, ResolutionDimension)>
				else
	//* 638 1315:goto            1330
					resolutionanchor1.dependsOn(resolutionanchor3, -constraintwidget.getHeight());
	//  639 1318:aload           4
	//  640 1320:aload           6
	//  641 1322:aload_1         
	//  642 1323:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  643 1326:ineg            
	//  644 1327:invokevirtual   #105 <Method void ResolutionAnchor.dependsOn(ResolutionAnchor, int)>
				if(constraintwidget.mBaselineDistance > 0)
	//* 645 1330:aload_1         
	//* 646 1331:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//* 647 1334:ifle            1485
				{
					constraintwidget.mBaseline.getResolutionNode().dependsOn(1, resolutionanchor1, constraintwidget.mBaselineDistance);
	//  648 1337:aload_1         
	//  649 1338:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  650 1341:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  651 1344:iconst_1        
	//  652 1345:aload           4
	//  653 1347:aload_1         
	//  654 1348:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//  655 1351:invokevirtual   #142 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
					return;
	//  656 1354:return          
				}
			} else
			if(constraintwidget.mTop.mTarget != null && constraintwidget.mBottom.mTarget != null)
	//* 657 1355:aload_1         
	//* 658 1356:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//* 659 1359:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 660 1362:ifnull          1485
	//* 661 1365:aload_1         
	//* 662 1366:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//* 663 1369:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 664 1372:ifnull          1485
			{
				resolutionanchor1.setType(2);
	//  665 1375:aload           4
	//  666 1377:iconst_2        
	//  667 1378:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				resolutionanchor3.setType(2);
	//  668 1381:aload           6
	//  669 1383:iconst_2        
	//  670 1384:invokevirtual   #91  <Method void ResolutionAnchor.setType(int)>
				if(i != 0)
	//* 671 1387:iload_0         
	//* 672 1388:ifeq            1436
				{
					resolutionanchor1.setOpposite(resolutionanchor3, -1, constraintwidget.getResolutionHeight());
	//  673 1391:aload           4
	//  674 1393:aload           6
	//  675 1395:iconst_m1       
	//  676 1396:aload_1         
	//  677 1397:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  678 1400:invokevirtual   #124 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, int, ResolutionDimension)>
					resolutionanchor3.setOpposite(resolutionanchor1, 1, constraintwidget.getResolutionHeight());
	//  679 1403:aload           6
	//  680 1405:aload           4
	//  681 1407:iconst_1        
	//  682 1408:aload_1         
	//  683 1409:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  684 1412:invokevirtual   #124 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, int, ResolutionDimension)>
					constraintwidget.getResolutionHeight().addDependent(((ResolutionNode) (resolutionanchor1)));
	//  685 1415:aload_1         
	//  686 1416:invokevirtual   #130 <Method ResolutionDimension ConstraintWidget.getResolutionHeight()>
	//  687 1419:aload           4
	//  688 1421:invokevirtual   #111 <Method void ResolutionDimension.addDependent(ResolutionNode)>
					constraintwidget.getResolutionWidth().addDependent(((ResolutionNode) (resolutionanchor3)));
	//  689 1424:aload_1         
	//  690 1425:invokevirtual   #98  <Method ResolutionDimension ConstraintWidget.getResolutionWidth()>
	//  691 1428:aload           6
	//  692 1430:invokevirtual   #111 <Method void ResolutionDimension.addDependent(ResolutionNode)>
				} else
	//* 693 1433:goto            1461
				{
					resolutionanchor1.setOpposite(resolutionanchor3, -constraintwidget.getHeight());
	//  694 1436:aload           4
	//  695 1438:aload           6
	//  696 1440:aload_1         
	//  697 1441:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  698 1444:ineg            
	//  699 1445:i2f             
	//  700 1446:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
					resolutionanchor3.setOpposite(resolutionanchor1, constraintwidget.getHeight());
	//  701 1449:aload           6
	//  702 1451:aload           4
	//  703 1453:aload_1         
	//  704 1454:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  705 1457:i2f             
	//  706 1458:invokevirtual   #119 <Method void ResolutionAnchor.setOpposite(ResolutionAnchor, float)>
				}
				if(constraintwidget.mBaselineDistance > 0)
	//* 707 1461:aload_1         
	//* 708 1462:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//* 709 1465:ifle            1485
					constraintwidget.mBaseline.getResolutionNode().dependsOn(1, resolutionanchor1, constraintwidget.mBaselineDistance);
	//  710 1468:aload_1         
	//  711 1469:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  712 1472:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  713 1475:iconst_1        
	//  714 1476:aload           4
	//  715 1478:aload_1         
	//  716 1479:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//  717 1482:invokevirtual   #142 <Method void ResolutionAnchor.dependsOn(int, ResolutionAnchor, int)>
			}
	//  718 1485:return          
	}

	static boolean applyChainOptimized(ConstraintWidgetContainer constraintwidgetcontainer, LinearSystem linearsystem, int i, int j, ChainHead chainhead)
	{
label0:
		{
			float f1;
			float f4;
			float f11;
			boolean flag1;
			boolean flag2;
			int l;
			int j1;
			Object obj;
			ConstraintWidget constraintwidget;
			Object obj2;
label1:
			{
				Object obj1 = ((Object) (chainhead.mFirst));
	//    0    0:aload           4
	//    1    2:getfield        #150 <Field ConstraintWidget ChainHead.mFirst>
	//    2    5:astore          19
				ConstraintWidget constraintwidget1 = chainhead.mLast;
	//    3    7:aload           4
	//    4    9:getfield        #153 <Field ConstraintWidget ChainHead.mLast>
	//    5   12:astore          22
				obj = ((Object) (chainhead.mFirstVisibleWidget));
	//    6   14:aload           4
	//    7   16:getfield        #156 <Field ConstraintWidget ChainHead.mFirstVisibleWidget>
	//    8   19:astore          18
				constraintwidget = chainhead.mLastVisibleWidget;
	//    9   21:aload           4
	//   10   23:getfield        #159 <Field ConstraintWidget ChainHead.mLastVisibleWidget>
	//   11   26:astore          20
				obj2 = ((Object) (chainhead.mHead));
	//   12   28:aload           4
	//   13   30:getfield        #162 <Field ConstraintWidget ChainHead.mHead>
	//   14   33:astore          21
				float f12 = chainhead.mTotalWeight;
	//   15   35:aload           4
	//   16   37:getfield        #165 <Field float ChainHead.mTotalWeight>
	//   17   40:fstore          10
				ConstraintWidget constraintwidget2 = chainhead.mFirstMatchConstraintWidget;
	//   18   42:aload           4
	//   19   44:getfield        #168 <Field ConstraintWidget ChainHead.mFirstMatchConstraintWidget>
	//   20   47:astore          23
				chainhead = ((ChainHead) (chainhead.mLastMatchConstraintWidget));
	//   21   49:aload           4
	//   22   51:getfield        #171 <Field ConstraintWidget ChainHead.mLastMatchConstraintWidget>
	//   23   54:astore          4
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidgetcontainer.mListDimensionBehaviors[i]));
	//   24   56:aload_0         
	//   25   57:getfield        #174 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidgetContainer.mListDimensionBehaviors>
	//   26   60:iload_2         
	//   27   61:aaload          
	//   28   62:astore_0        
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (ConstraintWidget.DimensionBehaviour.WRAP_CONTENT));
	//   29   63:getstatic       #177 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//   30   66:astore_0        
				boolean flag;
				if(i == 0)
	//*  31   67:iload_2         
	//*  32   68:ifne            127
				{
					if(((ConstraintWidget) (obj2)).mHorizontalChainStyle == 0)
	//*  33   71:aload           21
	//*  34   73:getfield        #180 <Field int ConstraintWidget.mHorizontalChainStyle>
	//*  35   76:ifne            85
						flag1 = true;
	//   36   79:iconst_1        
	//   37   80:istore          12
					else
	//*  38   82:goto            88
						flag1 = false;
	//   39   85:iconst_0        
	//   40   86:istore          12
					if(((ConstraintWidget) (obj2)).mHorizontalChainStyle == 1)
	//*  41   88:aload           21
	//*  42   90:getfield        #180 <Field int ConstraintWidget.mHorizontalChainStyle>
	//*  43   93:iconst_1        
	//*  44   94:icmpne          103
						flag2 = true;
	//   45   97:iconst_1        
	//   46   98:istore          13
					else
	//*  47  100:goto            106
						flag2 = false;
	//   48  103:iconst_0        
	//   49  104:istore          13
					if(((ConstraintWidget) (obj2)).mHorizontalChainStyle == 2)
	//*  50  106:aload           21
	//*  51  108:getfield        #180 <Field int ConstraintWidget.mHorizontalChainStyle>
	//*  52  111:iconst_2        
	//*  53  112:icmpne          121
						flag = true;
	//   54  115:iconst_1        
	//   55  116:istore          11
					else
	//*  56  118:goto            180
						flag = false;
	//   57  121:iconst_0        
	//   58  122:istore          11
				} else
	//*  59  124:goto            180
				{
					if(((ConstraintWidget) (obj2)).mVerticalChainStyle == 0)
	//*  60  127:aload           21
	//*  61  129:getfield        #183 <Field int ConstraintWidget.mVerticalChainStyle>
	//*  62  132:ifne            141
						flag1 = true;
	//   63  135:iconst_1        
	//   64  136:istore          12
					else
	//*  65  138:goto            144
						flag1 = false;
	//   66  141:iconst_0        
	//   67  142:istore          12
					if(((ConstraintWidget) (obj2)).mVerticalChainStyle == 1)
	//*  68  144:aload           21
	//*  69  146:getfield        #183 <Field int ConstraintWidget.mVerticalChainStyle>
	//*  70  149:iconst_1        
	//*  71  150:icmpne          159
						flag2 = true;
	//   72  153:iconst_1        
	//   73  154:istore          13
					else
	//*  74  156:goto            162
						flag2 = false;
	//   75  159:iconst_0        
	//   76  160:istore          13
					if(((ConstraintWidget) (obj2)).mVerticalChainStyle == 2)
	//*  77  162:aload           21
	//*  78  164:getfield        #183 <Field int ConstraintWidget.mVerticalChainStyle>
	//*  79  167:iconst_2        
	//*  80  168:icmpne          177
						flag = true;
	//   81  171:iconst_1        
	//   82  172:istore          11
					else
	//*  83  174:goto            180
						flag = false;
	//   84  177:iconst_0        
	//   85  178:istore          11
				}
				chainhead = ((ChainHead) (obj1));
	//   86  180:aload           19
	//   87  182:astore          4
				int k = 0;
	//   88  184:iconst_0        
	//   89  185:istore          14
				boolean flag3 = false;
	//   90  187:iconst_0        
	//   91  188:istore          15
				j1 = 0;
	//   92  190:iconst_0        
	//   93  191:istore          17
				float f10 = 0.0F;
	//   94  193:fconst_0        
	//   95  194:fstore          8
				float f2;
				float f5;
				for(f5 = 0.0F; !flag3; f5 = f2)
	//*  96  196:fconst_0        
	//*  97  197:fstore          7
	//*  98  199:iload           15
	//*  99  201:ifne            522
				{
					int i1 = j1;
	//  100  204:iload           17
	//  101  206:istore          16
					float f = f10;
	//  102  208:fload           8
	//  103  210:fstore          5
					f2 = f5;
	//  104  212:fload           7
	//  105  214:fstore          6
					if(((ConstraintWidget) (chainhead)).getVisibility() != 8)
	//* 106  216:aload           4
	//* 107  218:invokevirtual   #84  <Method int ConstraintWidget.getVisibility()>
	//* 108  221:bipush          8
	//* 109  223:icmpeq          318
					{
						i1 = j1 + 1;
	//  110  226:iload           17
	//  111  228:iconst_1        
	//  112  229:iadd            
	//  113  230:istore          16
						if(i == 0)
	//* 114  232:iload_2         
	//* 115  233:ifne            250
							f2 = f10 + (float)((ConstraintWidget) (chainhead)).getWidth();
	//  116  236:fload           8
	//  117  238:aload           4
	//  118  240:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  119  243:i2f             
	//  120  244:fadd            
	//  121  245:fstore          6
						else
	//* 122  247:goto            261
							f2 = f10 + (float)((ConstraintWidget) (chainhead)).getHeight();
	//  123  250:fload           8
	//  124  252:aload           4
	//  125  254:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  126  257:i2f             
	//  127  258:fadd            
	//  128  259:fstore          6
						f = f2;
	//  129  261:fload           6
	//  130  263:fstore          5
						if(chainhead != obj)
	//* 131  265:aload           4
	//* 132  267:aload           18
	//* 133  269:if_acmpeq       288
							f = f2 + (float)((ConstraintWidget) (chainhead)).mListAnchors[j].getMargin();
	//  134  272:fload           6
	//  135  274:aload           4
	//  136  276:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  137  279:iload_3         
	//  138  280:aaload          
	//  139  281:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  140  284:i2f             
	//  141  285:fadd            
	//  142  286:fstore          5
						f2 = f5 + (float)((ConstraintWidget) (chainhead)).mListAnchors[j].getMargin() + (float)((ConstraintWidget) (chainhead)).mListAnchors[j + 1].getMargin();
	//  143  288:fload           7
	//  144  290:aload           4
	//  145  292:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  146  295:iload_3         
	//  147  296:aaload          
	//  148  297:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  149  300:i2f             
	//  150  301:fadd            
	//  151  302:aload           4
	//  152  304:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  153  307:iload_3         
	//  154  308:iconst_1        
	//  155  309:iadd            
	//  156  310:aaload          
	//  157  311:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  158  314:i2f             
	//  159  315:fadd            
	//  160  316:fstore          6
					}
					constraintwidgetcontainer = ((ConstraintWidgetContainer) (((ConstraintWidget) (chainhead)).mListAnchors[j]));
	//  161  318:aload           4
	//  162  320:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  163  323:iload_3         
	//  164  324:aaload          
	//  165  325:astore_0        
					j1 = k;
	//  166  326:iload           14
	//  167  328:istore          17
					if(((ConstraintWidget) (chainhead)).getVisibility() != 8)
	//* 168  330:aload           4
	//* 169  332:invokevirtual   #84  <Method int ConstraintWidget.getVisibility()>
	//* 170  335:bipush          8
	//* 171  337:icmpeq          423
					{
						j1 = k;
	//  172  340:iload           14
	//  173  342:istore          17
						if(((ConstraintWidget) (chainhead)).mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
	//* 174  344:aload           4
	//* 175  346:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//* 176  349:iload_2         
	//* 177  350:aaload          
	//* 178  351:getstatic       #68  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//* 179  354:if_acmpne       423
						{
							j1 = k + 1;
	//  180  357:iload           14
	//  181  359:iconst_1        
	//  182  360:iadd            
	//  183  361:istore          17
							if(i == 0)
	//* 184  363:iload_2         
	//* 185  364:ifne            395
							{
								if(((ConstraintWidget) (chainhead)).mMatchConstraintDefaultWidth != 0)
	//* 186  367:aload           4
	//* 187  369:getfield        #193 <Field int ConstraintWidget.mMatchConstraintDefaultWidth>
	//* 188  372:ifeq            377
									return false;
	//  189  375:iconst_0        
	//  190  376:ireturn         
								if(((ConstraintWidget) (chainhead)).mMatchConstraintMinWidth != 0 || ((ConstraintWidget) (chainhead)).mMatchConstraintMaxWidth != 0)
	//* 191  377:aload           4
	//* 192  379:getfield        #196 <Field int ConstraintWidget.mMatchConstraintMinWidth>
	//* 193  382:ifne            393
	//* 194  385:aload           4
	//* 195  387:getfield        #199 <Field int ConstraintWidget.mMatchConstraintMaxWidth>
	//* 196  390:ifeq            423
									return false;
	//  197  393:iconst_0        
	//  198  394:ireturn         
							} else
							{
								if(((ConstraintWidget) (chainhead)).mMatchConstraintDefaultHeight != 0)
	//* 199  395:aload           4
	//* 200  397:getfield        #202 <Field int ConstraintWidget.mMatchConstraintDefaultHeight>
	//* 201  400:ifeq            405
									return false;
	//  202  403:iconst_0        
	//  203  404:ireturn         
								if(((ConstraintWidget) (chainhead)).mMatchConstraintMinHeight != 0 || ((ConstraintWidget) (chainhead)).mMatchConstraintMaxHeight != 0)
	//* 204  405:aload           4
	//* 205  407:getfield        #205 <Field int ConstraintWidget.mMatchConstraintMinHeight>
	//* 206  410:ifne            421
	//* 207  413:aload           4
	//* 208  415:getfield        #208 <Field int ConstraintWidget.mMatchConstraintMaxHeight>
	//* 209  418:ifeq            423
									return false;
	//  210  421:iconst_0        
	//  211  422:ireturn         
							}
						}
					}
					constraintwidgetcontainer = ((ConstraintWidgetContainer) (((ConstraintWidget) (chainhead)).mListAnchors[j + 1].mTarget));
	//  212  423:aload           4
	//  213  425:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  214  428:iload_3         
	//  215  429:iconst_1        
	//  216  430:iadd            
	//  217  431:aaload          
	//  218  432:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//  219  435:astore_0        
					if(constraintwidgetcontainer != null)
	//* 220  436:aload_0         
	//* 221  437:ifnull          485
					{
						constraintwidgetcontainer = ((ConstraintWidgetContainer) (((ConstraintAnchor) (constraintwidgetcontainer)).mOwner));
	//  222  440:aload_0         
	//  223  441:getfield        #211 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//  224  444:astore_0        
						if(((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[j].mTarget == null || ((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[j].mTarget.mOwner != chainhead)
	//* 225  445:aload_0         
	//* 226  446:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 227  449:iload_3         
	//* 228  450:aaload          
	//* 229  451:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 230  454:ifnull          480
	//* 231  457:aload_0         
	//* 232  458:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//* 233  461:iload_3         
	//* 234  462:aaload          
	//* 235  463:getfield        #94  <Field ConstraintAnchor ConstraintAnchor.mTarget>
	//* 236  466:getfield        #211 <Field ConstraintWidget ConstraintAnchor.mOwner>
	//* 237  469:aload           4
	//* 238  471:if_acmpeq       477
	//* 239  474:goto            480
	//* 240  477:goto            487
							constraintwidgetcontainer = null;
	//  241  480:aconst_null     
	//  242  481:astore_0        
					} else
	//* 243  482:goto            487
					{
						constraintwidgetcontainer = null;
	//  244  485:aconst_null     
	//  245  486:astore_0        
					}
					if(constraintwidgetcontainer == null)
	//* 246  487:aload_0         
	//* 247  488:ifnull          494
	//* 248  491:goto            500
					{
						flag3 = true;
	//  249  494:iconst_1        
	//  250  495:istore          15
						constraintwidgetcontainer = ((ConstraintWidgetContainer) (chainhead));
	//  251  497:aload           4
	//  252  499:astore_0        
					}
					k = j1;
	//  253  500:iload           17
	//  254  502:istore          14
					chainhead = ((ChainHead) (constraintwidgetcontainer));
	//  255  504:aload_0         
	//  256  505:astore          4
					j1 = i1;
	//  257  507:iload           16
	//  258  509:istore          17
					f10 = f;
	//  259  511:fload           5
	//  260  513:fstore          8
				}

	//  261  515:fload           6
	//  262  517:fstore          7
	//* 263  519:goto            199
				obj2 = ((Object) (((ConstraintWidget) (obj1)).mListAnchors[j].getResolutionNode()));
	//  264  522:aload           19
	//  265  524:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  266  527:iload_3         
	//  267  528:aaload          
	//  268  529:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  269  532:astore          21
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (constraintwidget1.mListAnchors));
	//  270  534:aload           22
	//  271  536:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  272  539:astore_0        
				l = j + 1;
	//  273  540:iload_3         
	//  274  541:iconst_1        
	//  275  542:iadd            
	//  276  543:istore          15
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (((ConstraintAnchor) (constraintwidgetcontainer[l])).getResolutionNode()));
	//  277  545:aload_0         
	//  278  546:iload           15
	//  279  548:aaload          
	//  280  549:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  281  552:astore_0        
				if(((ResolutionAnchor) (obj2)).target == null || ((ResolutionAnchor) (constraintwidgetcontainer)).target == null)
	//* 282  553:aload           21
	//* 283  555:getfield        #215 <Field ResolutionAnchor ResolutionAnchor.target>
	//* 284  558:ifnull          1732
	//* 285  561:aload_0         
	//* 286  562:getfield        #215 <Field ResolutionAnchor ResolutionAnchor.target>
	//* 287  565:ifnonnull       571
					break label0;
	//  288  568:goto            1732
				if(((ResolutionAnchor) (obj2)).target.state != 1 && ((ResolutionAnchor) (constraintwidgetcontainer)).target.state != 1)
	//* 289  571:aload           21
	//* 290  573:getfield        #215 <Field ResolutionAnchor ResolutionAnchor.target>
	//* 291  576:getfield        #218 <Field int ResolutionAnchor.state>
	//* 292  579:iconst_1        
	//* 293  580:icmpeq          596
	//* 294  583:aload_0         
	//* 295  584:getfield        #215 <Field ResolutionAnchor ResolutionAnchor.target>
	//* 296  587:getfield        #218 <Field int ResolutionAnchor.state>
	//* 297  590:iconst_1        
	//* 298  591:icmpeq          596
					return false;
	//  299  594:iconst_0        
	//  300  595:ireturn         
				if(k > 0 && k != j1)
	//* 301  596:iload           14
	//* 302  598:ifle            610
	//* 303  601:iload           14
	//* 304  603:iload           17
	//* 305  605:icmpeq          610
					return false;
	//  306  608:iconst_0        
	//  307  609:ireturn         
				if(!flag && !flag1 && !flag2)
	//* 308  610:iload           11
	//* 309  612:ifne            634
	//* 310  615:iload           12
	//* 311  617:ifne            634
	//* 312  620:iload           13
	//* 313  622:ifeq            628
	//* 314  625:goto            634
				{
					f1 = 0.0F;
	//  315  628:fconst_0        
	//  316  629:fstore          5
				} else
	//* 317  631:goto            684
				{
					float f3;
					if(obj != null)
	//* 318  634:aload           18
	//* 319  636:ifnull          655
						f3 = ((ConstraintWidget) (obj)).mListAnchors[j].getMargin();
	//  320  639:aload           18
	//  321  641:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  322  644:iload_3         
	//  323  645:aaload          
	//  324  646:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  325  649:i2f             
	//  326  650:fstore          6
					else
	//* 327  652:goto            658
						f3 = 0.0F;
	//  328  655:fconst_0        
	//  329  656:fstore          6
					f1 = f3;
	//  330  658:fload           6
	//  331  660:fstore          5
					if(constraintwidget != null)
	//* 332  662:aload           20
	//* 333  664:ifnull          684
						f1 = f3 + (float)constraintwidget.mListAnchors[l].getMargin();
	//  334  667:fload           6
	//  335  669:aload           20
	//  336  671:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  337  674:iload           15
	//  338  676:aaload          
	//  339  677:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  340  680:i2f             
	//  341  681:fadd            
	//  342  682:fstore          5
				}
				f11 = ((ResolutionAnchor) (obj2)).target.resolvedOffset;
	//  343  684:aload           21
	//  344  686:getfield        #215 <Field ResolutionAnchor ResolutionAnchor.target>
	//  345  689:getfield        #221 <Field float ResolutionAnchor.resolvedOffset>
	//  346  692:fstore          9
				f4 = ((ResolutionAnchor) (constraintwidgetcontainer)).target.resolvedOffset;
	//  347  694:aload_0         
	//  348  695:getfield        #215 <Field ResolutionAnchor ResolutionAnchor.target>
	//  349  698:getfield        #221 <Field float ResolutionAnchor.resolvedOffset>
	//  350  701:fstore          6
				if(f11 < f4)
	//* 351  703:fload           9
	//* 352  705:fload           6
	//* 353  707:fcmpg           
	//* 354  708:ifge            724
					f4 = f4 - f11 - f10;
	//  355  711:fload           6
	//  356  713:fload           9
	//  357  715:fsub            
	//  358  716:fload           8
	//  359  718:fsub            
	//  360  719:fstore          6
				else
	//* 361  721:goto            734
					f4 = f11 - f4 - f10;
	//  362  724:fload           9
	//  363  726:fload           6
	//  364  728:fsub            
	//  365  729:fload           8
	//  366  731:fsub            
	//  367  732:fstore          6
				if(k > 0 && k == j1)
	//* 368  734:iload           14
	//* 369  736:ifle            1105
	//* 370  739:iload           14
	//* 371  741:iload           17
	//* 372  743:icmpne          1105
				{
					if(((ConstraintWidget) (chainhead)).getParent() != null && ((ConstraintWidget) (chainhead)).getParent().mListDimensionBehaviors[i] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT)
	//* 373  746:aload           4
	//* 374  748:invokevirtual   #225 <Method ConstraintWidget ConstraintWidget.getParent()>
	//* 375  751:ifnull          772
	//* 376  754:aload           4
	//* 377  756:invokevirtual   #225 <Method ConstraintWidget ConstraintWidget.getParent()>
	//* 378  759:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//* 379  762:iload_2         
	//* 380  763:aaload          
	//* 381  764:getstatic       #177 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//* 382  767:if_acmpne       772
						return false;
	//  383  770:iconst_0        
	//  384  771:ireturn         
					f10 = (f4 + f10) - f5;
	//  385  772:fload           6
	//  386  774:fload           8
	//  387  776:fadd            
	//  388  777:fload           7
	//  389  779:fsub            
	//  390  780:fstore          8
					f4 = f10;
	//  391  782:fload           8
	//  392  784:fstore          6
					if(flag1)
	//* 393  786:iload           12
	//* 394  788:ifeq            801
						f4 = f10 - (f5 - f1);
	//  395  791:fload           8
	//  396  793:fload           7
	//  397  795:fload           5
	//  398  797:fsub            
	//  399  798:fsub            
	//  400  799:fstore          6
					constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj));
	//  401  801:aload           18
	//  402  803:astore_0        
					f1 = f11;
	//  403  804:fload           9
	//  404  806:fstore          5
					if(flag1)
	//* 405  808:iload           12
	//* 406  810:ifeq            870
					{
						float f6 = f11 + (float)((ConstraintWidget) (obj)).mListAnchors[l].getMargin();
	//  407  813:fload           9
	//  408  815:aload           18
	//  409  817:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  410  820:iload           15
	//  411  822:aaload          
	//  412  823:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  413  826:i2f             
	//  414  827:fadd            
	//  415  828:fstore          7
						chainhead = ((ChainHead) (((ConstraintWidget) (obj)).mListNextVisibleWidget[i]));
	//  416  830:aload           18
	//  417  832:getfield        #229 <Field ConstraintWidget[] ConstraintWidget.mListNextVisibleWidget>
	//  418  835:iload_2         
	//  419  836:aaload          
	//  420  837:astore          4
						constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj));
	//  421  839:aload           18
	//  422  841:astore_0        
						f1 = f6;
	//  423  842:fload           7
	//  424  844:fstore          5
						if(chainhead != null)
	//* 425  846:aload           4
	//* 426  848:ifnull          870
						{
							f1 = f6 + (float)((ConstraintWidget) (chainhead)).mListAnchors[j].getMargin();
	//  427  851:fload           7
	//  428  853:aload           4
	//  429  855:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  430  858:iload_3         
	//  431  859:aaload          
	//  432  860:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  433  863:i2f             
	//  434  864:fadd            
	//  435  865:fstore          5
							constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj));
	//  436  867:aload           18
	//  437  869:astore_0        
						}
					}
					for(; constraintwidgetcontainer != null; constraintwidgetcontainer = ((ConstraintWidgetContainer) (chainhead)))
	//* 438  870:aload_0         
	//* 439  871:ifnull          1103
					{
						if(LinearSystem.sMetrics != null)
	//* 440  874:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//* 441  877:ifnull          931
						{
							chainhead = ((ChainHead) (LinearSystem.sMetrics));
	//  442  880:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  443  883:astore          4
							chainhead.nonresolvedWidgets = ((Metrics) (chainhead)).nonresolvedWidgets - 1L;
	//  444  885:aload           4
	//  445  887:aload           4
	//  446  889:getfield        #241 <Field long Metrics.nonresolvedWidgets>
	//  447  892:lconst_1        
	//  448  893:lsub            
	//  449  894:putfield        #241 <Field long Metrics.nonresolvedWidgets>
							chainhead = ((ChainHead) (LinearSystem.sMetrics));
	//  450  897:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  451  900:astore          4
							chainhead.resolvedWidgets = ((Metrics) (chainhead)).resolvedWidgets + 1L;
	//  452  902:aload           4
	//  453  904:aload           4
	//  454  906:getfield        #244 <Field long Metrics.resolvedWidgets>
	//  455  909:lconst_1        
	//  456  910:ladd            
	//  457  911:putfield        #244 <Field long Metrics.resolvedWidgets>
							chainhead = ((ChainHead) (LinearSystem.sMetrics));
	//  458  914:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  459  917:astore          4
							chainhead.chainConnectionResolved = ((Metrics) (chainhead)).chainConnectionResolved + 1L;
	//  460  919:aload           4
	//  461  921:aload           4
	//  462  923:getfield        #247 <Field long Metrics.chainConnectionResolved>
	//  463  926:lconst_1        
	//  464  927:ladd            
	//  465  928:putfield        #247 <Field long Metrics.chainConnectionResolved>
						}
						chainhead = ((ChainHead) (((ConstraintWidget) (constraintwidgetcontainer)).mListNextVisibleWidget[i]));
	//  466  931:aload_0         
	//  467  932:getfield        #229 <Field ConstraintWidget[] ConstraintWidget.mListNextVisibleWidget>
	//  468  935:iload_2         
	//  469  936:aaload          
	//  470  937:astore          4
						if(chainhead == null && constraintwidgetcontainer != constraintwidget)
	//* 471  939:aload           4
	//* 472  941:ifnonnull       956
	//* 473  944:aload_0         
	//* 474  945:aload           20
	//* 475  947:if_acmpne       953
							continue;
	//  476  950:goto            956
	//* 477  953:goto            1097
						float f7 = f4 / (float)k;
	//  478  956:fload           6
	//  479  958:iload           14
	//  480  960:i2f             
	//  481  961:fdiv            
	//  482  962:fstore          7
						if(f12 > 0.0F)
	//* 483  964:fload           10
	//* 484  966:fconst_0        
	//* 485  967:fcmpl           
	//* 486  968:ifle            985
							f7 = (((ConstraintWidget) (constraintwidgetcontainer)).mWeight[i] * f4) / f12;
	//  487  971:aload_0         
	//  488  972:getfield        #251 <Field float[] ConstraintWidget.mWeight>
	//  489  975:iload_2         
	//  490  976:faload          
	//  491  977:fload           6
	//  492  979:fmul            
	//  493  980:fload           10
	//  494  982:fdiv            
	//  495  983:fstore          7
						f1 += ((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[j].getMargin();
	//  496  985:fload           5
	//  497  987:aload_0         
	//  498  988:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  499  991:iload_3         
	//  500  992:aaload          
	//  501  993:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  502  996:i2f             
	//  503  997:fadd            
	//  504  998:fstore          5
						((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[j].getResolutionNode().resolve(((ResolutionAnchor) (obj2)).resolvedTarget, f1);
	//  505 1000:aload_0         
	//  506 1001:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  507 1004:iload_3         
	//  508 1005:aaload          
	//  509 1006:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  510 1009:aload           21
	//  511 1011:getfield        #254 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
	//  512 1014:fload           5
	//  513 1016:invokevirtual   #257 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
						obj = ((Object) (((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[l].getResolutionNode()));
	//  514 1019:aload_0         
	//  515 1020:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  516 1023:iload           15
	//  517 1025:aaload          
	//  518 1026:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  519 1029:astore          18
						obj1 = ((Object) (((ResolutionAnchor) (obj2)).resolvedTarget));
	//  520 1031:aload           21
	//  521 1033:getfield        #254 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
	//  522 1036:astore          19
						f1 += f7;
	//  523 1038:fload           5
	//  524 1040:fload           7
	//  525 1042:fadd            
	//  526 1043:fstore          5
						((ResolutionAnchor) (obj)).resolve(((ResolutionAnchor) (obj1)), f1);
	//  527 1045:aload           18
	//  528 1047:aload           19
	//  529 1049:fload           5
	//  530 1051:invokevirtual   #257 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
						((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[j].getResolutionNode().addResolvedValue(linearsystem);
	//  531 1054:aload_0         
	//  532 1055:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  533 1058:iload_3         
	//  534 1059:aaload          
	//  535 1060:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  536 1063:aload_1         
	//  537 1064:invokevirtual   #261 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
						((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[l].getResolutionNode().addResolvedValue(linearsystem);
	//  538 1067:aload_0         
	//  539 1068:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  540 1071:iload           15
	//  541 1073:aaload          
	//  542 1074:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  543 1077:aload_1         
	//  544 1078:invokevirtual   #261 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
						f1 += ((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[l].getMargin();
	//  545 1081:fload           5
	//  546 1083:aload_0         
	//  547 1084:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  548 1087:iload           15
	//  549 1089:aaload          
	//  550 1090:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  551 1093:i2f             
	//  552 1094:fadd            
	//  553 1095:fstore          5
					}

	//  554 1097:aload           4
	//  555 1099:astore_0        
	//* 556 1100:goto            870
					return true;
	//  557 1103:iconst_1        
	//  558 1104:ireturn         
				}
				if(f4 < f10)
	//* 559 1105:fload           6
	//* 560 1107:fload           8
	//* 561 1109:fcmpg           
	//* 562 1110:ifge            1115
					return false;
	//  563 1113:iconst_0        
	//  564 1114:ireturn         
				if(!flag)
					break label1;
	//  565 1115:iload           11
	//  566 1117:ifeq            1365
				for(f1 = f11 + (f4 - f1) * ((ConstraintWidget) (obj1)).getHorizontalBiasPercent(); obj != null; f1 = f4)
	//* 567 1120:fload           9
	//* 568 1122:fload           6
	//* 569 1124:fload           5
	//* 570 1126:fsub            
	//* 571 1127:aload           19
	//* 572 1129:invokevirtual   #265 <Method float ConstraintWidget.getHorizontalBiasPercent()>
	//* 573 1132:fmul            
	//* 574 1133:fadd            
	//* 575 1134:fstore          5
	//* 576 1136:aload           18
	//* 577 1138:ifnull          1363
				{
label2:
					{
						if(LinearSystem.sMetrics != null)
	//* 578 1141:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//* 579 1144:ifnull          1189
						{
							constraintwidgetcontainer = ((ConstraintWidgetContainer) (LinearSystem.sMetrics));
	//  580 1147:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  581 1150:astore_0        
							constraintwidgetcontainer.nonresolvedWidgets = ((Metrics) (constraintwidgetcontainer)).nonresolvedWidgets - 1L;
	//  582 1151:aload_0         
	//  583 1152:aload_0         
	//  584 1153:getfield        #241 <Field long Metrics.nonresolvedWidgets>
	//  585 1156:lconst_1        
	//  586 1157:lsub            
	//  587 1158:putfield        #241 <Field long Metrics.nonresolvedWidgets>
							constraintwidgetcontainer = ((ConstraintWidgetContainer) (LinearSystem.sMetrics));
	//  588 1161:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  589 1164:astore_0        
							constraintwidgetcontainer.resolvedWidgets = ((Metrics) (constraintwidgetcontainer)).resolvedWidgets + 1L;
	//  590 1165:aload_0         
	//  591 1166:aload_0         
	//  592 1167:getfield        #244 <Field long Metrics.resolvedWidgets>
	//  593 1170:lconst_1        
	//  594 1171:ladd            
	//  595 1172:putfield        #244 <Field long Metrics.resolvedWidgets>
							constraintwidgetcontainer = ((ConstraintWidgetContainer) (LinearSystem.sMetrics));
	//  596 1175:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  597 1178:astore_0        
							constraintwidgetcontainer.chainConnectionResolved = ((Metrics) (constraintwidgetcontainer)).chainConnectionResolved + 1L;
	//  598 1179:aload_0         
	//  599 1180:aload_0         
	//  600 1181:getfield        #247 <Field long Metrics.chainConnectionResolved>
	//  601 1184:lconst_1        
	//  602 1185:ladd            
	//  603 1186:putfield        #247 <Field long Metrics.chainConnectionResolved>
						}
						constraintwidgetcontainer = ((ConstraintWidgetContainer) (((ConstraintWidget) (obj)).mListNextVisibleWidget[i]));
	//  604 1189:aload           18
	//  605 1191:getfield        #229 <Field ConstraintWidget[] ConstraintWidget.mListNextVisibleWidget>
	//  606 1194:iload_2         
	//  607 1195:aaload          
	//  608 1196:astore_0        
						if(constraintwidgetcontainer == null)
	//* 609 1197:aload_0         
	//* 610 1198:ifnonnull       1212
						{
							f4 = f1;
	//  611 1201:fload           5
	//  612 1203:fstore          6
							if(obj != constraintwidget)
								break label2;
	//  613 1205:aload           18
	//  614 1207:aload           20
	//  615 1209:if_acmpne       1353
						}
						if(i == 0)
	//* 616 1212:iload_2         
	//* 617 1213:ifne            1227
							f4 = ((ConstraintWidget) (obj)).getWidth();
	//  618 1216:aload           18
	//  619 1218:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  620 1221:i2f             
	//  621 1222:fstore          6
						else
	//* 622 1224:goto            1235
							f4 = ((ConstraintWidget) (obj)).getHeight();
	//  623 1227:aload           18
	//  624 1229:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  625 1232:i2f             
	//  626 1233:fstore          6
						f1 += ((ConstraintWidget) (obj)).mListAnchors[j].getMargin();
	//  627 1235:fload           5
	//  628 1237:aload           18
	//  629 1239:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  630 1242:iload_3         
	//  631 1243:aaload          
	//  632 1244:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  633 1247:i2f             
	//  634 1248:fadd            
	//  635 1249:fstore          5
						((ConstraintWidget) (obj)).mListAnchors[j].getResolutionNode().resolve(((ResolutionAnchor) (obj2)).resolvedTarget, f1);
	//  636 1251:aload           18
	//  637 1253:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  638 1256:iload_3         
	//  639 1257:aaload          
	//  640 1258:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  641 1261:aload           21
	//  642 1263:getfield        #254 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
	//  643 1266:fload           5
	//  644 1268:invokevirtual   #257 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
						chainhead = ((ChainHead) (((ConstraintWidget) (obj)).mListAnchors[l].getResolutionNode()));
	//  645 1271:aload           18
	//  646 1273:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  647 1276:iload           15
	//  648 1278:aaload          
	//  649 1279:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  650 1282:astore          4
						ResolutionAnchor resolutionanchor = ((ResolutionAnchor) (obj2)).resolvedTarget;
	//  651 1284:aload           21
	//  652 1286:getfield        #254 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
	//  653 1289:astore          19
						f1 += f4;
	//  654 1291:fload           5
	//  655 1293:fload           6
	//  656 1295:fadd            
	//  657 1296:fstore          5
						((ResolutionAnchor) (chainhead)).resolve(resolutionanchor, f1);
	//  658 1298:aload           4
	//  659 1300:aload           19
	//  660 1302:fload           5
	//  661 1304:invokevirtual   #257 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
						((ConstraintWidget) (obj)).mListAnchors[j].getResolutionNode().addResolvedValue(linearsystem);
	//  662 1307:aload           18
	//  663 1309:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  664 1312:iload_3         
	//  665 1313:aaload          
	//  666 1314:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  667 1317:aload_1         
	//  668 1318:invokevirtual   #261 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
						((ConstraintWidget) (obj)).mListAnchors[l].getResolutionNode().addResolvedValue(linearsystem);
	//  669 1321:aload           18
	//  670 1323:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  671 1326:iload           15
	//  672 1328:aaload          
	//  673 1329:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  674 1332:aload_1         
	//  675 1333:invokevirtual   #261 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
						f4 = f1 + (float)((ConstraintWidget) (obj)).mListAnchors[l].getMargin();
	//  676 1336:fload           5
	//  677 1338:aload           18
	//  678 1340:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  679 1343:iload           15
	//  680 1345:aaload          
	//  681 1346:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  682 1349:i2f             
	//  683 1350:fadd            
	//  684 1351:fstore          6
					}
					obj = ((Object) (constraintwidgetcontainer));
	//  685 1353:aload_0         
	//  686 1354:astore          18
				}

	//  687 1356:fload           6
	//  688 1358:fstore          5
	//* 689 1360:goto            1136
				return true;
	//  690 1363:iconst_1        
	//  691 1364:ireturn         
			}
			if(!flag1 && !flag2)
	//* 692 1365:iload           12
	//* 693 1367:ifne            1380
	//* 694 1370:iload           13
	//* 695 1372:ifeq            1378
	//* 696 1375:goto            1380
				return true;
	//  697 1378:iconst_1        
	//  698 1379:ireturn         
			float f8;
			if(flag1)
	//* 699 1380:iload           12
	//* 700 1382:ifeq            1395
			{
				f8 = f4 - f1;
	//  701 1385:fload           6
	//  702 1387:fload           5
	//  703 1389:fsub            
	//  704 1390:fstore          7
			} else
	//* 705 1392:goto            1411
			{
				f8 = f4;
	//  706 1395:fload           6
	//  707 1397:fstore          7
				if(flag2)
	//* 708 1399:iload           13
	//* 709 1401:ifeq            1411
					f8 = f4 - f1;
	//  710 1404:fload           6
	//  711 1406:fload           5
	//  712 1408:fsub            
	//  713 1409:fstore          7
			}
			f1 = f8 / (float)(j1 + 1);
	//  714 1411:fload           7
	//  715 1413:iload           17
	//  716 1415:iconst_1        
	//  717 1416:iadd            
	//  718 1417:i2f             
	//  719 1418:fdiv            
	//  720 1419:fstore          5
			if(flag2)
	//* 721 1421:iload           13
	//* 722 1423:ifeq            1451
				if(j1 > 1)
	//* 723 1426:iload           17
	//* 724 1428:iconst_1        
	//* 725 1429:icmple          1445
					f1 = f8 / (float)(j1 - 1);
	//  726 1432:fload           7
	//  727 1434:iload           17
	//  728 1436:iconst_1        
	//  729 1437:isub            
	//  730 1438:i2f             
	//  731 1439:fdiv            
	//  732 1440:fstore          5
				else
	//* 733 1442:goto            1451
					f1 = f8 / 2.0F;
	//  734 1445:fload           7
	//  735 1447:fconst_2        
	//  736 1448:fdiv            
	//  737 1449:fstore          5
			f4 = f11 + f1;
	//  738 1451:fload           9
	//  739 1453:fload           5
	//  740 1455:fadd            
	//  741 1456:fstore          6
			f8 = f4;
	//  742 1458:fload           6
	//  743 1460:fstore          7
			if(flag2)
	//* 744 1462:iload           13
	//* 745 1464:ifeq            1493
			{
				f8 = f4;
	//  746 1467:fload           6
	//  747 1469:fstore          7
				if(j1 > 1)
	//* 748 1471:iload           17
	//* 749 1473:iconst_1        
	//* 750 1474:icmple          1493
					f8 = (float)((ConstraintWidget) (obj)).mListAnchors[j].getMargin() + f11;
	//  751 1477:aload           18
	//  752 1479:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  753 1482:iload_3         
	//  754 1483:aaload          
	//  755 1484:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  756 1487:i2f             
	//  757 1488:fload           9
	//  758 1490:fadd            
	//  759 1491:fstore          7
			}
			f4 = f8;
	//  760 1493:fload           7
	//  761 1495:fstore          6
			constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj));
	//  762 1497:aload           18
	//  763 1499:astore_0        
			if(flag1)
	//* 764 1500:iload           12
	//* 765 1502:ifeq            1536
			{
				f4 = f8;
	//  766 1505:fload           7
	//  767 1507:fstore          6
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj));
	//  768 1509:aload           18
	//  769 1511:astore_0        
				if(obj != null)
	//* 770 1512:aload           18
	//* 771 1514:ifnull          1536
				{
					f4 = f8 + (float)((ConstraintWidget) (obj)).mListAnchors[j].getMargin();
	//  772 1517:fload           7
	//  773 1519:aload           18
	//  774 1521:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  775 1524:iload_3         
	//  776 1525:aaload          
	//  777 1526:invokevirtual   #190 <Method int ConstraintAnchor.getMargin()>
	//  778 1529:i2f             
	//  779 1530:fadd            
	//  780 1531:fstore          6
					constraintwidgetcontainer = ((ConstraintWidgetContainer) (obj));
	//  781 1533:aload           18
	//  782 1535:astore_0        
				}
			}
			while(constraintwidgetcontainer != null) 
	//* 783 1536:aload_0         
	//* 784 1537:ifnull          1730
			{
				float f9;
label3:
				{
					if(LinearSystem.sMetrics != null)
	//* 785 1540:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//* 786 1543:ifnull          1597
					{
						chainhead = ((ChainHead) (LinearSystem.sMetrics));
	//  787 1546:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  788 1549:astore          4
						chainhead.nonresolvedWidgets = ((Metrics) (chainhead)).nonresolvedWidgets - 1L;
	//  789 1551:aload           4
	//  790 1553:aload           4
	//  791 1555:getfield        #241 <Field long Metrics.nonresolvedWidgets>
	//  792 1558:lconst_1        
	//  793 1559:lsub            
	//  794 1560:putfield        #241 <Field long Metrics.nonresolvedWidgets>
						chainhead = ((ChainHead) (LinearSystem.sMetrics));
	//  795 1563:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  796 1566:astore          4
						chainhead.resolvedWidgets = ((Metrics) (chainhead)).resolvedWidgets + 1L;
	//  797 1568:aload           4
	//  798 1570:aload           4
	//  799 1572:getfield        #244 <Field long Metrics.resolvedWidgets>
	//  800 1575:lconst_1        
	//  801 1576:ladd            
	//  802 1577:putfield        #244 <Field long Metrics.resolvedWidgets>
						chainhead = ((ChainHead) (LinearSystem.sMetrics));
	//  803 1580:getstatic       #235 <Field Metrics LinearSystem.sMetrics>
	//  804 1583:astore          4
						chainhead.chainConnectionResolved = ((Metrics) (chainhead)).chainConnectionResolved + 1L;
	//  805 1585:aload           4
	//  806 1587:aload           4
	//  807 1589:getfield        #247 <Field long Metrics.chainConnectionResolved>
	//  808 1592:lconst_1        
	//  809 1593:ladd            
	//  810 1594:putfield        #247 <Field long Metrics.chainConnectionResolved>
					}
					chainhead = ((ChainHead) (((ConstraintWidget) (constraintwidgetcontainer)).mListNextVisibleWidget[i]));
	//  811 1597:aload_0         
	//  812 1598:getfield        #229 <Field ConstraintWidget[] ConstraintWidget.mListNextVisibleWidget>
	//  813 1601:iload_2         
	//  814 1602:aaload          
	//  815 1603:astore          4
					if(chainhead == null)
	//* 816 1605:aload           4
	//* 817 1607:ifnonnull       1620
					{
						f9 = f4;
	//  818 1610:fload           6
	//  819 1612:fstore          7
						if(constraintwidgetcontainer != constraintwidget)
							break label3;
	//  820 1614:aload_0         
	//  821 1615:aload           20
	//  822 1617:if_acmpne       1720
					}
					if(i == 0)
	//* 823 1620:iload_2         
	//* 824 1621:ifne            1634
						f9 = ((ConstraintWidget) (constraintwidgetcontainer)).getWidth();
	//  825 1624:aload_0         
	//  826 1625:invokevirtual   #87  <Method int ConstraintWidget.getWidth()>
	//  827 1628:i2f             
	//  828 1629:fstore          7
					else
	//* 829 1631:goto            1641
						f9 = ((ConstraintWidget) (constraintwidgetcontainer)).getHeight();
	//  830 1634:aload_0         
	//  831 1635:invokevirtual   #127 <Method int ConstraintWidget.getHeight()>
	//  832 1638:i2f             
	//  833 1639:fstore          7
					((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[j].getResolutionNode().resolve(((ResolutionAnchor) (obj2)).resolvedTarget, f4);
	//  834 1641:aload_0         
	//  835 1642:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  836 1645:iload_3         
	//  837 1646:aaload          
	//  838 1647:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  839 1650:aload           21
	//  840 1652:getfield        #254 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
	//  841 1655:fload           6
	//  842 1657:invokevirtual   #257 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
					((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[l].getResolutionNode().resolve(((ResolutionAnchor) (obj2)).resolvedTarget, f4 + f9);
	//  843 1660:aload_0         
	//  844 1661:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  845 1664:iload           15
	//  846 1666:aaload          
	//  847 1667:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  848 1670:aload           21
	//  849 1672:getfield        #254 <Field ResolutionAnchor ResolutionAnchor.resolvedTarget>
	//  850 1675:fload           6
	//  851 1677:fload           7
	//  852 1679:fadd            
	//  853 1680:invokevirtual   #257 <Method void ResolutionAnchor.resolve(ResolutionAnchor, float)>
					((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[j].getResolutionNode().addResolvedValue(linearsystem);
	//  854 1683:aload_0         
	//  855 1684:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  856 1687:iload_3         
	//  857 1688:aaload          
	//  858 1689:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  859 1692:aload_1         
	//  860 1693:invokevirtual   #261 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
					((ConstraintWidget) (constraintwidgetcontainer)).mListAnchors[l].getResolutionNode().addResolvedValue(linearsystem);
	//  861 1696:aload_0         
	//  862 1697:getfield        #187 <Field ConstraintAnchor[] ConstraintWidget.mListAnchors>
	//  863 1700:iload           15
	//  864 1702:aaload          
	//  865 1703:invokevirtual   #49  <Method ResolutionAnchor ConstraintAnchor.getResolutionNode()>
	//  866 1706:aload_1         
	//  867 1707:invokevirtual   #261 <Method void ResolutionAnchor.addResolvedValue(LinearSystem)>
					f9 = f4 + (f9 + f1);
	//  868 1710:fload           6
	//  869 1712:fload           7
	//  870 1714:fload           5
	//  871 1716:fadd            
	//  872 1717:fadd            
	//  873 1718:fstore          7
				}
				constraintwidgetcontainer = ((ConstraintWidgetContainer) (chainhead));
	//  874 1720:aload           4
	//  875 1722:astore_0        
				f4 = f9;
	//  876 1723:fload           7
	//  877 1725:fstore          6
			}
	//* 878 1727:goto            1536
			return true;
	//  879 1730:iconst_1        
	//  880 1731:ireturn         
		}
		return false;
	//  881 1732:iconst_0        
	//  882 1733:ireturn         
	}

	static void checkMatchParent(ConstraintWidgetContainer constraintwidgetcontainer, LinearSystem linearsystem, ConstraintWidget constraintwidget)
	{
		if(constraintwidgetcontainer.mListDimensionBehaviors[0] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintwidget.mListDimensionBehaviors[0] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #174 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidgetContainer.mListDimensionBehaviors>
	//*   2    4:iconst_0        
	//*   3    5:aaload          
	//*   4    6:getstatic       #177 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*   5    9:if_acmpeq       113
	//*   6   12:aload_2         
	//*   7   13:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*   8   16:iconst_0        
	//*   9   17:aaload          
	//*  10   18:getstatic       #270 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_PARENT>
	//*  11   21:if_acmpne       113
		{
			int i = constraintwidget.mLeft.mMargin;
	//   12   24:aload_2         
	//   13   25:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   14   28:getfield        #273 <Field int ConstraintAnchor.mMargin>
	//   15   31:istore_3        
			int k = constraintwidgetcontainer.getWidth() - constraintwidget.mRight.mMargin;
	//   16   32:aload_0         
	//   17   33:invokevirtual   #274 <Method int ConstraintWidgetContainer.getWidth()>
	//   18   36:aload_2         
	//   19   37:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//   20   40:getfield        #273 <Field int ConstraintAnchor.mMargin>
	//   21   43:isub            
	//   22   44:istore          4
			constraintwidget.mLeft.mSolverVariable = linearsystem.createObjectVariable(((Object) (constraintwidget.mLeft)));
	//   23   46:aload_2         
	//   24   47:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   25   50:aload_1         
	//   26   51:aload_2         
	//   27   52:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   28   55:invokevirtual   #278 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   29   58:putfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
			constraintwidget.mRight.mSolverVariable = linearsystem.createObjectVariable(((Object) (constraintwidget.mRight)));
	//   30   61:aload_2         
	//   31   62:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//   32   65:aload_1         
	//   33   66:aload_2         
	//   34   67:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//   35   70:invokevirtual   #278 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   36   73:putfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
			linearsystem.addEquality(constraintwidget.mLeft.mSolverVariable, i);
	//   37   76:aload_1         
	//   38   77:aload_2         
	//   39   78:getfield        #43  <Field ConstraintAnchor ConstraintWidget.mLeft>
	//   40   81:getfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//   41   84:iload_3         
	//   42   85:invokevirtual   #286 <Method void LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, int)>
			linearsystem.addEquality(constraintwidget.mRight.mSolverVariable, k);
	//   43   88:aload_1         
	//   44   89:aload_2         
	//   45   90:getfield        #55  <Field ConstraintAnchor ConstraintWidget.mRight>
	//   46   93:getfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//   47   96:iload           4
	//   48   98:invokevirtual   #286 <Method void LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, int)>
			constraintwidget.mHorizontalResolution = 2;
	//   49  101:aload_2         
	//   50  102:iconst_2        
	//   51  103:putfield        #289 <Field int ConstraintWidget.mHorizontalResolution>
			constraintwidget.setHorizontalDimension(i, k);
	//   52  106:aload_2         
	//   53  107:iload_3         
	//   54  108:iload           4
	//   55  110:invokevirtual   #293 <Method void ConstraintWidget.setHorizontalDimension(int, int)>
		}
		if(constraintwidgetcontainer.mListDimensionBehaviors[1] != ConstraintWidget.DimensionBehaviour.WRAP_CONTENT && constraintwidget.mListDimensionBehaviors[1] == ConstraintWidget.DimensionBehaviour.MATCH_PARENT)
	//*  56  113:aload_0         
	//*  57  114:getfield        #174 <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidgetContainer.mListDimensionBehaviors>
	//*  58  117:iconst_1        
	//*  59  118:aaload          
	//*  60  119:getstatic       #177 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.WRAP_CONTENT>
	//*  61  122:if_acmpeq       274
	//*  62  125:aload_2         
	//*  63  126:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*  64  129:iconst_1        
	//*  65  130:aaload          
	//*  66  131:getstatic       #270 <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_PARENT>
	//*  67  134:if_acmpne       274
		{
			int j = constraintwidget.mTop.mMargin;
	//   68  137:aload_2         
	//   69  138:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//   70  141:getfield        #273 <Field int ConstraintAnchor.mMargin>
	//   71  144:istore_3        
			int l = constraintwidgetcontainer.getHeight() - constraintwidget.mBottom.mMargin;
	//   72  145:aload_0         
	//   73  146:invokevirtual   #294 <Method int ConstraintWidgetContainer.getHeight()>
	//   74  149:aload_2         
	//   75  150:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//   76  153:getfield        #273 <Field int ConstraintAnchor.mMargin>
	//   77  156:isub            
	//   78  157:istore          4
			constraintwidget.mTop.mSolverVariable = linearsystem.createObjectVariable(((Object) (constraintwidget.mTop)));
	//   79  159:aload_2         
	//   80  160:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//   81  163:aload_1         
	//   82  164:aload_2         
	//   83  165:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//   84  168:invokevirtual   #278 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   85  171:putfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
			constraintwidget.mBottom.mSolverVariable = linearsystem.createObjectVariable(((Object) (constraintwidget.mBottom)));
	//   86  174:aload_2         
	//   87  175:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//   88  178:aload_1         
	//   89  179:aload_2         
	//   90  180:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//   91  183:invokevirtual   #278 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//   92  186:putfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
			linearsystem.addEquality(constraintwidget.mTop.mSolverVariable, j);
	//   93  189:aload_1         
	//   94  190:aload_2         
	//   95  191:getfield        #52  <Field ConstraintAnchor ConstraintWidget.mTop>
	//   96  194:getfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//   97  197:iload_3         
	//   98  198:invokevirtual   #286 <Method void LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, int)>
			linearsystem.addEquality(constraintwidget.mBottom.mSolverVariable, l);
	//   99  201:aload_1         
	//  100  202:aload_2         
	//  101  203:getfield        #58  <Field ConstraintAnchor ConstraintWidget.mBottom>
	//  102  206:getfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  103  209:iload           4
	//  104  211:invokevirtual   #286 <Method void LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, int)>
			if(constraintwidget.mBaselineDistance > 0 || constraintwidget.getVisibility() == 8)
	//* 105  214:aload_2         
	//* 106  215:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//* 107  218:ifgt            230
	//* 108  221:aload_2         
	//* 109  222:invokevirtual   #84  <Method int ConstraintWidget.getVisibility()>
	//* 110  225:bipush          8
	//* 111  227:icmpne          262
			{
				constraintwidget.mBaseline.mSolverVariable = linearsystem.createObjectVariable(((Object) (constraintwidget.mBaseline)));
	//  112  230:aload_2         
	//  113  231:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  114  234:aload_1         
	//  115  235:aload_2         
	//  116  236:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  117  239:invokevirtual   #278 <Method android.support.constraint.solver.SolverVariable LinearSystem.createObjectVariable(Object)>
	//  118  242:putfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
				linearsystem.addEquality(constraintwidget.mBaseline.mSolverVariable, constraintwidget.mBaselineDistance + j);
	//  119  245:aload_1         
	//  120  246:aload_2         
	//  121  247:getfield        #139 <Field ConstraintAnchor ConstraintWidget.mBaseline>
	//  122  250:getfield        #282 <Field android.support.constraint.solver.SolverVariable ConstraintAnchor.mSolverVariable>
	//  123  253:aload_2         
	//  124  254:getfield        #136 <Field int ConstraintWidget.mBaselineDistance>
	//  125  257:iload_3         
	//  126  258:iadd            
	//  127  259:invokevirtual   #286 <Method void LinearSystem.addEquality(android.support.constraint.solver.SolverVariable, int)>
			}
			constraintwidget.mVerticalResolution = 2;
	//  128  262:aload_2         
	//  129  263:iconst_2        
	//  130  264:putfield        #297 <Field int ConstraintWidget.mVerticalResolution>
			constraintwidget.setVerticalDimension(j, l);
	//  131  267:aload_2         
	//  132  268:iload_3         
	//  133  269:iload           4
	//  134  271:invokevirtual   #300 <Method void ConstraintWidget.setVerticalDimension(int, int)>
		}
	//  135  274:return          
	}

	private static boolean optimizableMatchConstraint(ConstraintWidget constraintwidget, int i)
	{
label0:
		{
			if(constraintwidget.mListDimensionBehaviors[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//*   2    4:iload_1         
	//*   3    5:aaload          
	//*   4    6:getstatic       #68  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//*   5    9:if_acmpeq       14
				return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
			float f = constraintwidget.mDimensionRatio;
	//    8   14:aload_0         
	//    9   15:getfield        #115 <Field float ConstraintWidget.mDimensionRatio>
	//   10   18:fstore_2        
			boolean flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_3        
			if(f != 0.0F)
	//*  13   21:fload_2         
	//*  14   22:fconst_0        
	//*  15   23:fcmpl           
	//*  16   24:ifeq            56
			{
				constraintwidget = ((ConstraintWidget) (constraintwidget.mListDimensionBehaviors));
	//   17   27:aload_0         
	//   18   28:getfield        #62  <Field ConstraintWidget$DimensionBehaviour[] ConstraintWidget.mListDimensionBehaviors>
	//   19   31:astore_0        
				if(i == 0)
	//*  20   32:iload_1         
	//*  21   33:ifne            41
					i = ((int) (flag));
	//   22   36:iload_3         
	//   23   37:istore_1        
				else
	//*  24   38:goto            43
					i = 0;
	//   25   41:iconst_0        
	//   26   42:istore_1        
				return constraintwidget[i] != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT ? false : false;
	//   27   43:aload_0         
	//   28   44:iload_1         
	//   29   45:aaload          
	//   30   46:getstatic       #68  <Field ConstraintWidget$DimensionBehaviour ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT>
	//   31   49:if_acmpne       54
	//   32   52:iconst_0        
	//   33   53:ireturn         
	//   34   54:iconst_0        
	//   35   55:ireturn         
			}
			if(i == 0)
	//*  36   56:iload_1         
	//*  37   57:ifne            85
			{
				if(constraintwidget.mMatchConstraintDefaultWidth != 0)
	//*  38   60:aload_0         
	//*  39   61:getfield        #193 <Field int ConstraintWidget.mMatchConstraintDefaultWidth>
	//*  40   64:ifeq            69
					return false;
	//   41   67:iconst_0        
	//   42   68:ireturn         
				if(constraintwidget.mMatchConstraintMinWidth != 0 || constraintwidget.mMatchConstraintMaxWidth != 0)
	//*  43   69:aload_0         
	//*  44   70:getfield        #196 <Field int ConstraintWidget.mMatchConstraintMinWidth>
	//*  45   73:ifne            83
	//*  46   76:aload_0         
	//*  47   77:getfield        #199 <Field int ConstraintWidget.mMatchConstraintMaxWidth>
	//*  48   80:ifeq            110
					return false;
	//   49   83:iconst_0        
	//   50   84:ireturn         
			} else
			{
				if(constraintwidget.mMatchConstraintDefaultHeight != 0)
	//*  51   85:aload_0         
	//*  52   86:getfield        #202 <Field int ConstraintWidget.mMatchConstraintDefaultHeight>
	//*  53   89:ifeq            94
					return false;
	//   54   92:iconst_0        
	//   55   93:ireturn         
				if(constraintwidget.mMatchConstraintMinHeight != 0)
					break label0;
	//   56   94:aload_0         
	//   57   95:getfield        #205 <Field int ConstraintWidget.mMatchConstraintMinHeight>
	//   58   98:ifne            112
				if(constraintwidget.mMatchConstraintMaxHeight != 0)
	//*  59  101:aload_0         
	//*  60  102:getfield        #208 <Field int ConstraintWidget.mMatchConstraintMaxHeight>
	//*  61  105:ifeq            110
					return false;
	//   62  108:iconst_0        
	//   63  109:ireturn         
			}
			return true;
	//   64  110:iconst_1        
	//   65  111:ireturn         
		}
		return false;
	//   66  112:iconst_0        
	//   67  113:ireturn         
	}

	static final int FLAG_CHAIN_DANGLING = 1;
	static final int FLAG_RECOMPUTE_BOUNDS = 2;
	static final int FLAG_USE_OPTIMIZE = 0;
	public static final int OPTIMIZATION_BARRIER = 2;
	public static final int OPTIMIZATION_CHAIN = 4;
	public static final int OPTIMIZATION_DIMENSIONS = 8;
	public static final int OPTIMIZATION_DIRECT = 1;
	public static final int OPTIMIZATION_NONE = 0;
	public static final int OPTIMIZATION_RATIO = 16;
	public static final int OPTIMIZATION_STANDARD = 3;
	static boolean flags[] = new boolean[3];

	static 
	{
	//    0    0:iconst_3        
	//    1    1:newarray        boolean[]
	//    2    3:putstatic       #28  <Field boolean[] flags>
	//*   3    6:return          
	}
}
