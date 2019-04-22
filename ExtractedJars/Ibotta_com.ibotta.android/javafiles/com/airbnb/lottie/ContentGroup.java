// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.airbnb.lottie:
//			DrawingContent, PathContent, ShapeGroup, AnimatableTransform, 
//			TransformKeyframeAnimation, ShapeFill, FillContent, GradientFill, 
//			GradientFillContent, ShapeStroke, StrokeContent, GradientStroke, 
//			GradientStrokeContent, RectangleShape, RectangleContent, CircleShape, 
//			EllipseContent, ShapePath, ShapeContent, PolystarShape, 
//			PolystarContent, ShapeTrimPath, TrimPathContent, MergePaths, 
//			LottieDrawable, MergePathsContent, Content, BaseKeyframeAnimation, 
//			BaseLayer

class ContentGroup
	implements BaseKeyframeAnimation.AnimationListener, DrawingContent, PathContent
{

	ContentGroup(LottieDrawable lottiedrawable, BaseLayer baselayer, ShapeGroup shapegroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #40  <Class Matrix>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void Matrix()>
	//    6   12:putfield        #43  <Field Matrix matrix>
	//    7   15:aload_0         
	//    8   16:new             #45  <Class Path>
	//    9   19:dup             
	//   10   20:invokespecial   #46  <Method void Path()>
	//   11   23:putfield        #48  <Field Path path>
	//   12   26:aload_0         
	//   13   27:new             #50  <Class RectF>
	//   14   30:dup             
	//   15   31:invokespecial   #51  <Method void RectF()>
	//   16   34:putfield        #53  <Field RectF rect>
	//   17   37:aload_0         
	//   18   38:new             #55  <Class ArrayList>
	//   19   41:dup             
	//   20   42:invokespecial   #56  <Method void ArrayList()>
	//   21   45:putfield        #58  <Field List contents>
		name = shapegroup.getName();
	//   22   48:aload_0         
	//   23   49:aload_3         
	//   24   50:invokevirtual   #64  <Method String ShapeGroup.getName()>
	//   25   53:putfield        #66  <Field String name>
		lottieDrawable = lottiedrawable;
	//   26   56:aload_0         
	//   27   57:aload_1         
	//   28   58:putfield        #68  <Field LottieDrawable lottieDrawable>
		shapegroup = ((ShapeGroup) (shapegroup.getItems()));
	//   29   61:aload_3         
	//   30   62:invokevirtual   #72  <Method List ShapeGroup.getItems()>
	//   31   65:astore_3        
		if(((List) (shapegroup)).isEmpty())
	//*  32   66:aload_3         
	//*  33   67:invokeinterface #78  <Method boolean List.isEmpty()>
	//*  34   72:ifeq            76
			return;
	//   35   75:return          
		Object obj = ((List) (shapegroup)).get(((List) (shapegroup)).size() - 1);
	//   36   76:aload_3         
	//   37   77:aload_3         
	//   38   78:invokeinterface #82  <Method int List.size()>
	//   39   83:iconst_1        
	//   40   84:isub            
	//   41   85:invokeinterface #86  <Method Object List.get(int)>
	//   42   90:astore          5
		if(obj instanceof AnimatableTransform)
	//*  43   92:aload           5
	//*  44   94:instanceof      #88  <Class AnimatableTransform>
	//*  45   97:ifeq            128
		{
			transformAnimation = ((AnimatableTransform)obj).createAnimation();
	//   46  100:aload_0         
	//   47  101:aload           5
	//   48  103:checkcast       #88  <Class AnimatableTransform>
	//   49  106:invokevirtual   #92  <Method TransformKeyframeAnimation AnimatableTransform.createAnimation()>
	//   50  109:putfield        #94  <Field TransformKeyframeAnimation transformAnimation>
			transformAnimation.addAnimationsToLayer(baselayer);
	//   51  112:aload_0         
	//   52  113:getfield        #94  <Field TransformKeyframeAnimation transformAnimation>
	//   53  116:aload_2         
	//   54  117:invokevirtual   #100 <Method void TransformKeyframeAnimation.addAnimationsToLayer(BaseLayer)>
			transformAnimation.addListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   55  120:aload_0         
	//   56  121:getfield        #94  <Field TransformKeyframeAnimation transformAnimation>
	//   57  124:aload_0         
	//   58  125:invokevirtual   #104 <Method void TransformKeyframeAnimation.addListener(BaseKeyframeAnimation$AnimationListener)>
		}
		for(int i = 0; i < ((List) (shapegroup)).size(); i++)
	//*  59  128:iconst_0        
	//*  60  129:istore          4
	//*  61  131:iload           4
	//*  62  133:aload_3         
	//*  63  134:invokeinterface #82  <Method int List.size()>
	//*  64  139:icmpge          559
		{
			Object obj1 = ((List) (shapegroup)).get(i);
	//   65  142:aload_3         
	//   66  143:iload           4
	//   67  145:invokeinterface #86  <Method Object List.get(int)>
	//   68  150:astore          5
			if(obj1 instanceof ShapeFill)
	//*  69  152:aload           5
	//*  70  154:instanceof      #106 <Class ShapeFill>
	//*  71  157:ifeq            187
			{
				contents.add(((Object) (new FillContent(lottiedrawable, baselayer, (ShapeFill)obj1))));
	//   72  160:aload_0         
	//   73  161:getfield        #58  <Field List contents>
	//   74  164:new             #108 <Class FillContent>
	//   75  167:dup             
	//   76  168:aload_1         
	//   77  169:aload_2         
	//   78  170:aload           5
	//   79  172:checkcast       #106 <Class ShapeFill>
	//   80  175:invokespecial   #111 <Method void FillContent(LottieDrawable, BaseLayer, ShapeFill)>
	//   81  178:invokeinterface #115 <Method boolean List.add(Object)>
	//   82  183:pop             
				continue;
	//   83  184:goto            550
			}
			if(obj1 instanceof GradientFill)
	//*  84  187:aload           5
	//*  85  189:instanceof      #117 <Class GradientFill>
	//*  86  192:ifeq            222
			{
				contents.add(((Object) (new GradientFillContent(lottiedrawable, baselayer, (GradientFill)obj1))));
	//   87  195:aload_0         
	//   88  196:getfield        #58  <Field List contents>
	//   89  199:new             #119 <Class GradientFillContent>
	//   90  202:dup             
	//   91  203:aload_1         
	//   92  204:aload_2         
	//   93  205:aload           5
	//   94  207:checkcast       #117 <Class GradientFill>
	//   95  210:invokespecial   #122 <Method void GradientFillContent(LottieDrawable, BaseLayer, GradientFill)>
	//   96  213:invokeinterface #115 <Method boolean List.add(Object)>
	//   97  218:pop             
				continue;
	//   98  219:goto            550
			}
			if(obj1 instanceof ShapeStroke)
	//*  99  222:aload           5
	//* 100  224:instanceof      #124 <Class ShapeStroke>
	//* 101  227:ifeq            257
			{
				contents.add(((Object) (new StrokeContent(lottiedrawable, baselayer, (ShapeStroke)obj1))));
	//  102  230:aload_0         
	//  103  231:getfield        #58  <Field List contents>
	//  104  234:new             #126 <Class StrokeContent>
	//  105  237:dup             
	//  106  238:aload_1         
	//  107  239:aload_2         
	//  108  240:aload           5
	//  109  242:checkcast       #124 <Class ShapeStroke>
	//  110  245:invokespecial   #129 <Method void StrokeContent(LottieDrawable, BaseLayer, ShapeStroke)>
	//  111  248:invokeinterface #115 <Method boolean List.add(Object)>
	//  112  253:pop             
				continue;
	//  113  254:goto            550
			}
			if(obj1 instanceof GradientStroke)
	//* 114  257:aload           5
	//* 115  259:instanceof      #131 <Class GradientStroke>
	//* 116  262:ifeq            292
			{
				contents.add(((Object) (new GradientStrokeContent(lottiedrawable, baselayer, (GradientStroke)obj1))));
	//  117  265:aload_0         
	//  118  266:getfield        #58  <Field List contents>
	//  119  269:new             #133 <Class GradientStrokeContent>
	//  120  272:dup             
	//  121  273:aload_1         
	//  122  274:aload_2         
	//  123  275:aload           5
	//  124  277:checkcast       #131 <Class GradientStroke>
	//  125  280:invokespecial   #136 <Method void GradientStrokeContent(LottieDrawable, BaseLayer, GradientStroke)>
	//  126  283:invokeinterface #115 <Method boolean List.add(Object)>
	//  127  288:pop             
				continue;
	//  128  289:goto            550
			}
			if(obj1 instanceof ShapeGroup)
	//* 129  292:aload           5
	//* 130  294:instanceof      #60  <Class ShapeGroup>
	//* 131  297:ifeq            327
			{
				contents.add(((Object) (new ContentGroup(lottiedrawable, baselayer, (ShapeGroup)obj1))));
	//  132  300:aload_0         
	//  133  301:getfield        #58  <Field List contents>
	//  134  304:new             #2   <Class ContentGroup>
	//  135  307:dup             
	//  136  308:aload_1         
	//  137  309:aload_2         
	//  138  310:aload           5
	//  139  312:checkcast       #60  <Class ShapeGroup>
	//  140  315:invokespecial   #138 <Method void ContentGroup(LottieDrawable, BaseLayer, ShapeGroup)>
	//  141  318:invokeinterface #115 <Method boolean List.add(Object)>
	//  142  323:pop             
				continue;
	//  143  324:goto            550
			}
			if(obj1 instanceof RectangleShape)
	//* 144  327:aload           5
	//* 145  329:instanceof      #140 <Class RectangleShape>
	//* 146  332:ifeq            362
			{
				contents.add(((Object) (new RectangleContent(lottiedrawable, baselayer, (RectangleShape)obj1))));
	//  147  335:aload_0         
	//  148  336:getfield        #58  <Field List contents>
	//  149  339:new             #142 <Class RectangleContent>
	//  150  342:dup             
	//  151  343:aload_1         
	//  152  344:aload_2         
	//  153  345:aload           5
	//  154  347:checkcast       #140 <Class RectangleShape>
	//  155  350:invokespecial   #145 <Method void RectangleContent(LottieDrawable, BaseLayer, RectangleShape)>
	//  156  353:invokeinterface #115 <Method boolean List.add(Object)>
	//  157  358:pop             
				continue;
	//  158  359:goto            550
			}
			if(obj1 instanceof CircleShape)
	//* 159  362:aload           5
	//* 160  364:instanceof      #147 <Class CircleShape>
	//* 161  367:ifeq            397
			{
				contents.add(((Object) (new EllipseContent(lottiedrawable, baselayer, (CircleShape)obj1))));
	//  162  370:aload_0         
	//  163  371:getfield        #58  <Field List contents>
	//  164  374:new             #149 <Class EllipseContent>
	//  165  377:dup             
	//  166  378:aload_1         
	//  167  379:aload_2         
	//  168  380:aload           5
	//  169  382:checkcast       #147 <Class CircleShape>
	//  170  385:invokespecial   #152 <Method void EllipseContent(LottieDrawable, BaseLayer, CircleShape)>
	//  171  388:invokeinterface #115 <Method boolean List.add(Object)>
	//  172  393:pop             
				continue;
	//  173  394:goto            550
			}
			if(obj1 instanceof ShapePath)
	//* 174  397:aload           5
	//* 175  399:instanceof      #154 <Class ShapePath>
	//* 176  402:ifeq            432
			{
				contents.add(((Object) (new ShapeContent(lottiedrawable, baselayer, (ShapePath)obj1))));
	//  177  405:aload_0         
	//  178  406:getfield        #58  <Field List contents>
	//  179  409:new             #156 <Class ShapeContent>
	//  180  412:dup             
	//  181  413:aload_1         
	//  182  414:aload_2         
	//  183  415:aload           5
	//  184  417:checkcast       #154 <Class ShapePath>
	//  185  420:invokespecial   #159 <Method void ShapeContent(LottieDrawable, BaseLayer, ShapePath)>
	//  186  423:invokeinterface #115 <Method boolean List.add(Object)>
	//  187  428:pop             
				continue;
	//  188  429:goto            550
			}
			if(obj1 instanceof PolystarShape)
	//* 189  432:aload           5
	//* 190  434:instanceof      #161 <Class PolystarShape>
	//* 191  437:ifeq            467
			{
				contents.add(((Object) (new PolystarContent(lottiedrawable, baselayer, (PolystarShape)obj1))));
	//  192  440:aload_0         
	//  193  441:getfield        #58  <Field List contents>
	//  194  444:new             #163 <Class PolystarContent>
	//  195  447:dup             
	//  196  448:aload_1         
	//  197  449:aload_2         
	//  198  450:aload           5
	//  199  452:checkcast       #161 <Class PolystarShape>
	//  200  455:invokespecial   #166 <Method void PolystarContent(LottieDrawable, BaseLayer, PolystarShape)>
	//  201  458:invokeinterface #115 <Method boolean List.add(Object)>
	//  202  463:pop             
				continue;
	//  203  464:goto            550
			}
			if(obj1 instanceof ShapeTrimPath)
	//* 204  467:aload           5
	//* 205  469:instanceof      #168 <Class ShapeTrimPath>
	//* 206  472:ifeq            501
			{
				contents.add(((Object) (new TrimPathContent(baselayer, (ShapeTrimPath)obj1))));
	//  207  475:aload_0         
	//  208  476:getfield        #58  <Field List contents>
	//  209  479:new             #170 <Class TrimPathContent>
	//  210  482:dup             
	//  211  483:aload_2         
	//  212  484:aload           5
	//  213  486:checkcast       #168 <Class ShapeTrimPath>
	//  214  489:invokespecial   #173 <Method void TrimPathContent(BaseLayer, ShapeTrimPath)>
	//  215  492:invokeinterface #115 <Method boolean List.add(Object)>
	//  216  497:pop             
				continue;
	//  217  498:goto            550
			}
			if(!(obj1 instanceof MergePaths))
				continue;
	//  218  501:aload           5
	//  219  503:instanceof      #175 <Class MergePaths>
	//  220  506:ifeq            550
			if(lottiedrawable.enableMergePathsForKitKatAndAbove())
	//* 221  509:aload_1         
	//* 222  510:invokevirtual   #180 <Method boolean LottieDrawable.enableMergePathsForKitKatAndAbove()>
	//* 223  513:ifeq            541
				contents.add(((Object) (new MergePathsContent((MergePaths)obj1))));
	//  224  516:aload_0         
	//  225  517:getfield        #58  <Field List contents>
	//  226  520:new             #182 <Class MergePathsContent>
	//  227  523:dup             
	//  228  524:aload           5
	//  229  526:checkcast       #175 <Class MergePaths>
	//  230  529:invokespecial   #185 <Method void MergePathsContent(MergePaths)>
	//  231  532:invokeinterface #115 <Method boolean List.add(Object)>
	//  232  537:pop             
			else
	//* 233  538:goto            550
				Log.w(TAG, "Animation contains merge paths but they are disabled.");
	//  234  541:getstatic       #187 <Field String TAG>
	//  235  544:ldc1            #189 <String "Animation contains merge paths but they are disabled.">
	//  236  546:invokestatic    #195 <Method int Log.w(String, String)>
	//  237  549:pop             
		}

	//  238  550:iload           4
	//  239  552:iconst_1        
	//  240  553:iadd            
	//  241  554:istore          4
	//* 242  556:goto            131
		baselayer = ((BaseLayer) (new ArrayList()));
	//  243  559:new             #55  <Class ArrayList>
	//  244  562:dup             
	//  245  563:invokespecial   #56  <Method void ArrayList()>
	//  246  566:astore_2        
		lottiedrawable = null;
	//  247  567:aconst_null     
	//  248  568:astore_1        
		for(int j = contents.size() - 1; j >= 0; j--)
	//* 249  569:aload_0         
	//* 250  570:getfield        #58  <Field List contents>
	//* 251  573:invokeinterface #82  <Method int List.size()>
	//* 252  578:iconst_1        
	//* 253  579:isub            
	//* 254  580:istore          4
	//* 255  582:iload           4
	//* 256  584:iflt            645
		{
			shapegroup = ((ShapeGroup) ((Content)contents.get(j)));
	//  257  587:aload_0         
	//  258  588:getfield        #58  <Field List contents>
	//  259  591:iload           4
	//  260  593:invokeinterface #86  <Method Object List.get(int)>
	//  261  598:checkcast       #197 <Class Content>
	//  262  601:astore_3        
			if(shapegroup instanceof MergePathsContent)
	//* 263  602:aload_3         
	//* 264  603:instanceof      #182 <Class MergePathsContent>
	//* 265  606:ifeq            614
				lottiedrawable = ((LottieDrawable) ((MergePathsContent)shapegroup));
	//  266  609:aload_3         
	//  267  610:checkcast       #182 <Class MergePathsContent>
	//  268  613:astore_1        
			if(lottiedrawable != null && shapegroup != lottiedrawable)
	//* 269  614:aload_1         
	//* 270  615:ifnull          636
	//* 271  618:aload_3         
	//* 272  619:aload_1         
	//* 273  620:if_acmpeq       636
			{
				((MergePathsContent) (lottiedrawable)).addContentIfNeeded(((Content) (shapegroup)));
	//  274  623:aload_1         
	//  275  624:aload_3         
	//  276  625:invokevirtual   #201 <Method void MergePathsContent.addContentIfNeeded(Content)>
				((List) (baselayer)).add(((Object) (shapegroup)));
	//  277  628:aload_2         
	//  278  629:aload_3         
	//  279  630:invokeinterface #115 <Method boolean List.add(Object)>
	//  280  635:pop             
			}
		}

	//  281  636:iload           4
	//  282  638:iconst_1        
	//  283  639:isub            
	//  284  640:istore          4
	//* 285  642:goto            582
		lottiedrawable = ((LottieDrawable) (contents.iterator()));
	//  286  645:aload_0         
	//  287  646:getfield        #58  <Field List contents>
	//  288  649:invokeinterface #205 <Method Iterator List.iterator()>
	//  289  654:astore_1        
		do
		{
			if(!((Iterator) (lottiedrawable)).hasNext())
				break;
	//  290  655:aload_1         
	//  291  656:invokeinterface #210 <Method boolean Iterator.hasNext()>
	//  292  661:ifeq            691
			if(((List) (baselayer)).contains(((Object) ((Content)((Iterator) (lottiedrawable)).next()))))
	//* 293  664:aload_2         
	//* 294  665:aload_1         
	//* 295  666:invokeinterface #214 <Method Object Iterator.next()>
	//* 296  671:checkcast       #197 <Class Content>
	//* 297  674:invokeinterface #217 <Method boolean List.contains(Object)>
	//* 298  679:ifeq            655
				((Iterator) (lottiedrawable)).remove();
	//  299  682:aload_1         
	//  300  683:invokeinterface #220 <Method void Iterator.remove()>
		} while(true);
	//  301  688:goto            655
	//  302  691:return          
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
		for(int i = 0; i < contents.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore          4
	//*   2    3:iload           4
	//*   3    5:aload_0         
	//*   4    6:getfield        #58  <Field List contents>
	//*   5    9:invokeinterface #82  <Method int List.size()>
	//*   6   14:icmpge          101
		{
			Content content = (Content)contents.get(i);
	//    7   17:aload_0         
	//    8   18:getfield        #58  <Field List contents>
	//    9   21:iload           4
	//   10   23:invokeinterface #86  <Method Object List.get(int)>
	//   11   28:checkcast       #197 <Class Content>
	//   12   31:astore          5
			if(!(content instanceof DrawingContent))
				continue;
	//   13   33:aload           5
	//   14   35:instanceof      #8   <Class DrawingContent>
	//   15   38:ifeq            92
			DrawingContent drawingcontent = (DrawingContent)content;
	//   16   41:aload           5
	//   17   43:checkcast       #8   <Class DrawingContent>
	//   18   46:astore          6
			if(s1 != null && !s1.equals(((Object) (content.getName()))))
	//*  19   48:aload_2         
	//*  20   49:ifnull          82
	//*  21   52:aload_2         
	//*  22   53:aload           5
	//*  23   55:invokeinterface #223 <Method String Content.getName()>
	//*  24   60:invokevirtual   #228 <Method boolean String.equals(Object)>
	//*  25   63:ifeq            69
	//*  26   66:goto            82
				drawingcontent.addColorFilter(s, s1, colorfilter);
	//   27   69:aload           6
	//   28   71:aload_1         
	//   29   72:aload_2         
	//   30   73:aload_3         
	//   31   74:invokeinterface #230 <Method void DrawingContent.addColorFilter(String, String, ColorFilter)>
			else
	//*  32   79:goto            92
				drawingcontent.addColorFilter(s, ((String) (null)), colorfilter);
	//   33   82:aload           6
	//   34   84:aload_1         
	//   35   85:aconst_null     
	//   36   86:aload_3         
	//   37   87:invokeinterface #230 <Method void DrawingContent.addColorFilter(String, String, ColorFilter)>
		}

	//   38   92:iload           4
	//   39   94:iconst_1        
	//   40   95:iadd            
	//   41   96:istore          4
	//*  42   98:goto            3
	//   43  101:return          
	}

	public void draw(Canvas canvas, Matrix matrix1, int i)
	{
		matrix.set(matrix1);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Matrix matrix>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #237 <Method void Matrix.set(Matrix)>
		matrix1 = ((Matrix) (transformAnimation));
	//    4    8:aload_0         
	//    5    9:getfield        #94  <Field TransformKeyframeAnimation transformAnimation>
	//    6   12:astore_2        
		int j = i;
	//    7   13:iload_3         
	//    8   14:istore          4
		if(matrix1 != null)
	//*   9   16:aload_2         
	//*  10   17:ifnull          67
		{
			matrix.preConcat(((TransformKeyframeAnimation) (matrix1)).getMatrix());
	//   11   20:aload_0         
	//   12   21:getfield        #43  <Field Matrix matrix>
	//   13   24:aload_2         
	//   14   25:invokevirtual   #241 <Method Matrix TransformKeyframeAnimation.getMatrix()>
	//   15   28:invokevirtual   #245 <Method boolean Matrix.preConcat(Matrix)>
	//   16   31:pop             
			j = (int)(((((float)((Integer)transformAnimation.getOpacity().getValue()).intValue() / 100F) * (float)i) / 255F) * 255F);
	//   17   32:aload_0         
	//   18   33:getfield        #94  <Field TransformKeyframeAnimation transformAnimation>
	//   19   36:invokevirtual   #249 <Method BaseKeyframeAnimation TransformKeyframeAnimation.getOpacity()>
	//   20   39:invokevirtual   #254 <Method Object BaseKeyframeAnimation.getValue()>
	//   21   42:checkcast       #256 <Class Integer>
	//   22   45:invokevirtual   #259 <Method int Integer.intValue()>
	//   23   48:i2f             
	//   24   49:ldc2            #260 <Float 100F>
	//   25   52:fdiv            
	//   26   53:iload_3         
	//   27   54:i2f             
	//   28   55:fmul            
	//   29   56:ldc2            #261 <Float 255F>
	//   30   59:fdiv            
	//   31   60:ldc2            #261 <Float 255F>
	//   32   63:fmul            
	//   33   64:f2i             
	//   34   65:istore          4
		}
		for(i = contents.size() - 1; i >= 0; i--)
	//*  35   67:aload_0         
	//*  36   68:getfield        #58  <Field List contents>
	//*  37   71:invokeinterface #82  <Method int List.size()>
	//*  38   76:iconst_1        
	//*  39   77:isub            
	//*  40   78:istore_3        
	//*  41   79:iload_3         
	//*  42   80:iflt            124
		{
			matrix1 = ((Matrix) (contents.get(i)));
	//   43   83:aload_0         
	//   44   84:getfield        #58  <Field List contents>
	//   45   87:iload_3         
	//   46   88:invokeinterface #86  <Method Object List.get(int)>
	//   47   93:astore_2        
			if(matrix1 instanceof DrawingContent)
	//*  48   94:aload_2         
	//*  49   95:instanceof      #8   <Class DrawingContent>
	//*  50   98:ifeq            117
				((DrawingContent)matrix1).draw(canvas, matrix, j);
	//   51  101:aload_2         
	//   52  102:checkcast       #8   <Class DrawingContent>
	//   53  105:aload_1         
	//   54  106:aload_0         
	//   55  107:getfield        #43  <Field Matrix matrix>
	//   56  110:iload           4
	//   57  112:invokeinterface #263 <Method void DrawingContent.draw(Canvas, Matrix, int)>
		}

	//   58  117:iload_3         
	//   59  118:iconst_1        
	//   60  119:isub            
	//   61  120:istore_3        
	//*  62  121:goto            79
	//   63  124:return          
	}

	public void getBounds(RectF rectf, Matrix matrix1)
	{
		matrix.set(matrix1);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Matrix matrix>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #237 <Method void Matrix.set(Matrix)>
		matrix1 = ((Matrix) (transformAnimation));
	//    4    8:aload_0         
	//    5    9:getfield        #94  <Field TransformKeyframeAnimation transformAnimation>
	//    6   12:astore_2        
		if(matrix1 != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          29
			matrix.preConcat(((TransformKeyframeAnimation) (matrix1)).getMatrix());
	//    9   17:aload_0         
	//   10   18:getfield        #43  <Field Matrix matrix>
	//   11   21:aload_2         
	//   12   22:invokevirtual   #241 <Method Matrix TransformKeyframeAnimation.getMatrix()>
	//   13   25:invokevirtual   #245 <Method boolean Matrix.preConcat(Matrix)>
	//   14   28:pop             
		rect.set(0.0F, 0.0F, 0.0F, 0.0F);
	//   15   29:aload_0         
	//   16   30:getfield        #53  <Field RectF rect>
	//   17   33:fconst_0        
	//   18   34:fconst_0        
	//   19   35:fconst_0        
	//   20   36:fconst_0        
	//   21   37:invokevirtual   #268 <Method void RectF.set(float, float, float, float)>
		for(int i = contents.size() - 1; i >= 0; i--)
	//*  22   40:aload_0         
	//*  23   41:getfield        #58  <Field List contents>
	//*  24   44:invokeinterface #82  <Method int List.size()>
	//*  25   49:iconst_1        
	//*  26   50:isub            
	//*  27   51:istore_3        
	//*  28   52:iload_3         
	//*  29   53:iflt            179
		{
			matrix1 = ((Matrix) ((Content)contents.get(i)));
	//   30   56:aload_0         
	//   31   57:getfield        #58  <Field List contents>
	//   32   60:iload_3         
	//   33   61:invokeinterface #86  <Method Object List.get(int)>
	//   34   66:checkcast       #197 <Class Content>
	//   35   69:astore_2        
			if(!(matrix1 instanceof DrawingContent))
				continue;
	//   36   70:aload_2         
	//   37   71:instanceof      #8   <Class DrawingContent>
	//   38   74:ifeq            172
			((DrawingContent)matrix1).getBounds(rect, matrix);
	//   39   77:aload_2         
	//   40   78:checkcast       #8   <Class DrawingContent>
	//   41   81:aload_0         
	//   42   82:getfield        #53  <Field RectF rect>
	//   43   85:aload_0         
	//   44   86:getfield        #43  <Field Matrix matrix>
	//   45   89:invokeinterface #270 <Method void DrawingContent.getBounds(RectF, Matrix)>
			if(rectf.isEmpty())
	//*  46   94:aload_1         
	//*  47   95:invokevirtual   #271 <Method boolean RectF.isEmpty()>
	//*  48   98:ifeq            112
				rectf.set(rect);
	//   49  101:aload_1         
	//   50  102:aload_0         
	//   51  103:getfield        #53  <Field RectF rect>
	//   52  106:invokevirtual   #274 <Method void RectF.set(RectF)>
			else
	//*  53  109:goto            172
				rectf.set(Math.min(rectf.left, rect.left), Math.min(rectf.top, rect.top), Math.max(rectf.right, rect.right), Math.max(rectf.bottom, rect.bottom));
	//   54  112:aload_1         
	//   55  113:aload_1         
	//   56  114:getfield        #278 <Field float RectF.left>
	//   57  117:aload_0         
	//   58  118:getfield        #53  <Field RectF rect>
	//   59  121:getfield        #278 <Field float RectF.left>
	//   60  124:invokestatic    #284 <Method float Math.min(float, float)>
	//   61  127:aload_1         
	//   62  128:getfield        #287 <Field float RectF.top>
	//   63  131:aload_0         
	//   64  132:getfield        #53  <Field RectF rect>
	//   65  135:getfield        #287 <Field float RectF.top>
	//   66  138:invokestatic    #284 <Method float Math.min(float, float)>
	//   67  141:aload_1         
	//   68  142:getfield        #290 <Field float RectF.right>
	//   69  145:aload_0         
	//   70  146:getfield        #53  <Field RectF rect>
	//   71  149:getfield        #290 <Field float RectF.right>
	//   72  152:invokestatic    #293 <Method float Math.max(float, float)>
	//   73  155:aload_1         
	//   74  156:getfield        #296 <Field float RectF.bottom>
	//   75  159:aload_0         
	//   76  160:getfield        #53  <Field RectF rect>
	//   77  163:getfield        #296 <Field float RectF.bottom>
	//   78  166:invokestatic    #293 <Method float Math.max(float, float)>
	//   79  169:invokevirtual   #268 <Method void RectF.set(float, float, float, float)>
		}

	//   80  172:iload_3         
	//   81  173:iconst_1        
	//   82  174:isub            
	//   83  175:istore_3        
	//*  84  176:goto            52
	//   85  179:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field String name>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		matrix.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field Matrix matrix>
	//    2    4:invokevirtual   #301 <Method void Matrix.reset()>
		TransformKeyframeAnimation transformkeyframeanimation = transformAnimation;
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field TransformKeyframeAnimation transformAnimation>
	//    5   11:astore_2        
		if(transformkeyframeanimation != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          27
			matrix.set(transformkeyframeanimation.getMatrix());
	//    8   16:aload_0         
	//    9   17:getfield        #43  <Field Matrix matrix>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #241 <Method Matrix TransformKeyframeAnimation.getMatrix()>
	//   12   24:invokevirtual   #237 <Method void Matrix.set(Matrix)>
		path.reset();
	//   13   27:aload_0         
	//   14   28:getfield        #48  <Field Path path>
	//   15   31:invokevirtual   #302 <Method void Path.reset()>
		for(int i = contents.size() - 1; i >= 0; i--)
	//*  16   34:aload_0         
	//*  17   35:getfield        #58  <Field List contents>
	//*  18   38:invokeinterface #82  <Method int List.size()>
	//*  19   43:iconst_1        
	//*  20   44:isub            
	//*  21   45:istore_1        
	//*  22   46:iload_1         
	//*  23   47:iflt            98
		{
			Content content = (Content)contents.get(i);
	//   24   50:aload_0         
	//   25   51:getfield        #58  <Field List contents>
	//   26   54:iload_1         
	//   27   55:invokeinterface #86  <Method Object List.get(int)>
	//   28   60:checkcast       #197 <Class Content>
	//   29   63:astore_2        
			if(content instanceof PathContent)
	//*  30   64:aload_2         
	//*  31   65:instanceof      #10  <Class PathContent>
	//*  32   68:ifeq            91
				path.addPath(((PathContent)content).getPath(), matrix);
	//   33   71:aload_0         
	//   34   72:getfield        #48  <Field Path path>
	//   35   75:aload_2         
	//   36   76:checkcast       #10  <Class PathContent>
	//   37   79:invokeinterface #304 <Method Path PathContent.getPath()>
	//   38   84:aload_0         
	//   39   85:getfield        #43  <Field Matrix matrix>
	//   40   88:invokevirtual   #308 <Method void Path.addPath(Path, Matrix)>
		}

	//   41   91:iload_1         
	//   42   92:iconst_1        
	//   43   93:isub            
	//   44   94:istore_1        
	//*  45   95:goto            46
		return path;
	//   46   98:aload_0         
	//   47   99:getfield        #48  <Field Path path>
	//   48  102:areturn         
	}

	List getPathList()
	{
		if(pathContents == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #311 <Field List pathContents>
	//*   2    4:ifnonnull       75
		{
			pathContents = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #55  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #56  <Method void ArrayList()>
	//    7   15:putfield        #311 <Field List pathContents>
			for(int i = 0; i < contents.size(); i++)
	//*   8   18:iconst_0        
	//*   9   19:istore_1        
	//*  10   20:iload_1         
	//*  11   21:aload_0         
	//*  12   22:getfield        #58  <Field List contents>
	//*  13   25:invokeinterface #82  <Method int List.size()>
	//*  14   30:icmpge          75
			{
				Content content = (Content)contents.get(i);
	//   15   33:aload_0         
	//   16   34:getfield        #58  <Field List contents>
	//   17   37:iload_1         
	//   18   38:invokeinterface #86  <Method Object List.get(int)>
	//   19   43:checkcast       #197 <Class Content>
	//   20   46:astore_2        
				if(content instanceof PathContent)
	//*  21   47:aload_2         
	//*  22   48:instanceof      #10  <Class PathContent>
	//*  23   51:ifeq            68
					pathContents.add(((Object) ((PathContent)content)));
	//   24   54:aload_0         
	//   25   55:getfield        #311 <Field List pathContents>
	//   26   58:aload_2         
	//   27   59:checkcast       #10  <Class PathContent>
	//   28   62:invokeinterface #115 <Method boolean List.add(Object)>
	//   29   67:pop             
			}

	//   30   68:iload_1         
	//   31   69:iconst_1        
	//   32   70:iadd            
	//   33   71:istore_1        
		}
	//*  34   72:goto            20
		return pathContents;
	//   35   75:aload_0         
	//   36   76:getfield        #311 <Field List pathContents>
	//   37   79:areturn         
	}

	Matrix getTransformationMatrix()
	{
		TransformKeyframeAnimation transformkeyframeanimation = transformAnimation;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field TransformKeyframeAnimation transformAnimation>
	//    2    4:astore_1        
		if(transformkeyframeanimation != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
		{
			return transformkeyframeanimation.getMatrix();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #241 <Method Matrix TransformKeyframeAnimation.getMatrix()>
	//    7   13:areturn         
		} else
		{
			matrix.reset();
	//    8   14:aload_0         
	//    9   15:getfield        #43  <Field Matrix matrix>
	//   10   18:invokevirtual   #301 <Method void Matrix.reset()>
			return matrix;
	//   11   21:aload_0         
	//   12   22:getfield        #43  <Field Matrix matrix>
	//   13   25:areturn         
		}
	}

	public void onValueChanged()
	{
		lottieDrawable.invalidateSelf();
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #318 <Method void LottieDrawable.invalidateSelf()>
	//    3    7:return          
	}

	public void setContents(List list, List list1)
	{
		list1 = ((List) (new ArrayList(list.size() + contents.size())));
	//    0    0:new             #55  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokeinterface #82  <Method int List.size()>
	//    4   10:aload_0         
	//    5   11:getfield        #58  <Field List contents>
	//    6   14:invokeinterface #82  <Method int List.size()>
	//    7   19:iadd            
	//    8   20:invokespecial   #323 <Method void ArrayList(int)>
	//    9   23:astore_2        
		list1.addAll(((java.util.Collection) (list)));
	//   10   24:aload_2         
	//   11   25:aload_1         
	//   12   26:invokeinterface #327 <Method boolean List.addAll(java.util.Collection)>
	//   13   31:pop             
		for(int i = contents.size() - 1; i >= 0; i--)
	//*  14   32:aload_0         
	//*  15   33:getfield        #58  <Field List contents>
	//*  16   36:invokeinterface #82  <Method int List.size()>
	//*  17   41:iconst_1        
	//*  18   42:isub            
	//*  19   43:istore_3        
	//*  20   44:iload_3         
	//*  21   45:iflt            95
		{
			list = ((List) ((Content)contents.get(i)));
	//   22   48:aload_0         
	//   23   49:getfield        #58  <Field List contents>
	//   24   52:iload_3         
	//   25   53:invokeinterface #86  <Method Object List.get(int)>
	//   26   58:checkcast       #197 <Class Content>
	//   27   61:astore_1        
			((Content) (list)).setContents(list1, contents.subList(0, i));
	//   28   62:aload_1         
	//   29   63:aload_2         
	//   30   64:aload_0         
	//   31   65:getfield        #58  <Field List contents>
	//   32   68:iconst_0        
	//   33   69:iload_3         
	//   34   70:invokeinterface #331 <Method List List.subList(int, int)>
	//   35   75:invokeinterface #333 <Method void Content.setContents(List, List)>
			list1.add(((Object) (list)));
	//   36   80:aload_2         
	//   37   81:aload_1         
	//   38   82:invokeinterface #115 <Method boolean List.add(Object)>
	//   39   87:pop             
		}

	//   40   88:iload_3         
	//   41   89:iconst_1        
	//   42   90:isub            
	//   43   91:istore_3        
	//*  44   92:goto            44
	//   45   95:return          
	}

	private static final String TAG = "ContentGroup";
	private final List contents = new ArrayList();
	private final LottieDrawable lottieDrawable;
	private final Matrix matrix = new Matrix();
	private final String name;
	private final Path path = new Path();
	private List pathContents;
	private final RectF rect = new RectF();
	private TransformKeyframeAnimation transformAnimation;

	static 
	{
	//    0    0:return          
	}
}
