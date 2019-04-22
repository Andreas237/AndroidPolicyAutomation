// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			PathContent, RectangleShape, AnimatableValue, AnimatablePointValue, 
//			AnimatableFloatValue, BaseLayer, BaseKeyframeAnimation, LottieDrawable, 
//			Utils, Content, TrimPathContent

class RectangleContent
	implements BaseKeyframeAnimation.AnimationListener, PathContent
{

	RectangleContent(LottieDrawable lottiedrawable, BaseLayer baselayer, RectangleShape rectangleshape)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #34  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #35  <Method void Path()>
	//    6   12:putfield        #37  <Field Path path>
	//    7   15:aload_0         
	//    8   16:new             #39  <Class RectF>
	//    9   19:dup             
	//   10   20:invokespecial   #40  <Method void RectF()>
	//   11   23:putfield        #42  <Field RectF rect>
		name = rectangleshape.getName();
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokevirtual   #48  <Method String RectangleShape.getName()>
	//   15   31:putfield        #50  <Field String name>
		lottieDrawable = lottiedrawable;
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:putfield        #52  <Field LottieDrawable lottieDrawable>
		positionAnimation = rectangleshape.getPosition().createAnimation();
	//   19   39:aload_0         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #56  <Method AnimatableValue RectangleShape.getPosition()>
	//   22   44:invokeinterface #62  <Method BaseKeyframeAnimation AnimatableValue.createAnimation()>
	//   23   49:putfield        #64  <Field BaseKeyframeAnimation positionAnimation>
		sizeAnimation = ((BaseKeyframeAnimation) (rectangleshape.getSize().createAnimation()));
	//   24   52:aload_0         
	//   25   53:aload_3         
	//   26   54:invokevirtual   #68  <Method AnimatablePointValue RectangleShape.getSize()>
	//   27   57:invokevirtual   #73  <Method KeyframeAnimation AnimatablePointValue.createAnimation()>
	//   28   60:putfield        #75  <Field BaseKeyframeAnimation sizeAnimation>
		cornerRadiusAnimation = ((BaseKeyframeAnimation) (rectangleshape.getCornerRadius().createAnimation()));
	//   29   63:aload_0         
	//   30   64:aload_3         
	//   31   65:invokevirtual   #79  <Method AnimatableFloatValue RectangleShape.getCornerRadius()>
	//   32   68:invokevirtual   #82  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   33   71:putfield        #84  <Field BaseKeyframeAnimation cornerRadiusAnimation>
		baselayer.addAnimation(positionAnimation);
	//   34   74:aload_2         
	//   35   75:aload_0         
	//   36   76:getfield        #64  <Field BaseKeyframeAnimation positionAnimation>
	//   37   79:invokevirtual   #90  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(sizeAnimation);
	//   38   82:aload_2         
	//   39   83:aload_0         
	//   40   84:getfield        #75  <Field BaseKeyframeAnimation sizeAnimation>
	//   41   87:invokevirtual   #90  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(cornerRadiusAnimation);
	//   42   90:aload_2         
	//   43   91:aload_0         
	//   44   92:getfield        #84  <Field BaseKeyframeAnimation cornerRadiusAnimation>
	//   45   95:invokevirtual   #90  <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		positionAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   46   98:aload_0         
	//   47   99:getfield        #64  <Field BaseKeyframeAnimation positionAnimation>
	//   48  102:aload_0         
	//   49  103:invokevirtual   #96  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		sizeAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   50  106:aload_0         
	//   51  107:getfield        #75  <Field BaseKeyframeAnimation sizeAnimation>
	//   52  110:aload_0         
	//   53  111:invokevirtual   #96  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		cornerRadiusAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   54  114:aload_0         
	//   55  115:getfield        #84  <Field BaseKeyframeAnimation cornerRadiusAnimation>
	//   56  118:aload_0         
	//   57  119:invokevirtual   #96  <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
	//   58  122:return          
	}

	private void invalidate()
	{
		isPathValid = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #100 <Field boolean isPathValid>
		lottieDrawable.invalidateSelf();
	//    3    5:aload_0         
	//    4    6:getfield        #52  <Field LottieDrawable lottieDrawable>
	//    5    9:invokevirtual   #105 <Method void LottieDrawable.invalidateSelf()>
	//    6   12:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field String name>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		if(isPathValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #100 <Field boolean isPathValid>
	//*   2    4:ifeq            12
			return path;
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field Path path>
	//    5   11:areturn         
		path.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field Path path>
	//    8   16:invokevirtual   #110 <Method void Path.reset()>
		Object obj = ((Object) ((PointF)sizeAnimation.getValue()));
	//    9   19:aload_0         
	//   10   20:getfield        #75  <Field BaseKeyframeAnimation sizeAnimation>
	//   11   23:invokevirtual   #114 <Method Object BaseKeyframeAnimation.getValue()>
	//   12   26:checkcast       #116 <Class PointF>
	//   13   29:astore          8
		float f3 = ((PointF) (obj)).x / 2.0F;
	//   14   31:aload           8
	//   15   33:getfield        #120 <Field float PointF.x>
	//   16   36:fconst_2        
	//   17   37:fdiv            
	//   18   38:fstore          4
		float f4 = ((PointF) (obj)).y / 2.0F;
	//   19   40:aload           8
	//   20   42:getfield        #123 <Field float PointF.y>
	//   21   45:fconst_2        
	//   22   46:fdiv            
	//   23   47:fstore          5
		obj = ((Object) (cornerRadiusAnimation));
	//   24   49:aload_0         
	//   25   50:getfield        #84  <Field BaseKeyframeAnimation cornerRadiusAnimation>
	//   26   53:astore          8
		float f;
		if(obj == null)
	//*  27   55:aload           8
	//*  28   57:ifnonnull       65
			f = 0.0F;
	//   29   60:fconst_0        
	//   30   61:fstore_1        
		else
	//*  31   62:goto            77
			f = ((Float)((BaseKeyframeAnimation) (obj)).getValue()).floatValue();
	//   32   65:aload           8
	//   33   67:invokevirtual   #114 <Method Object BaseKeyframeAnimation.getValue()>
	//   34   70:checkcast       #125 <Class Float>
	//   35   73:invokevirtual   #129 <Method float Float.floatValue()>
	//   36   76:fstore_1        
		float f2 = Math.min(f3, f4);
	//   37   77:fload           4
	//   38   79:fload           5
	//   39   81:invokestatic    #135 <Method float Math.min(float, float)>
	//   40   84:fstore_3        
		float f1 = f;
	//   41   85:fload_1         
	//   42   86:fstore_2        
		if(f > f2)
	//*  43   87:fload_1         
	//*  44   88:fload_3         
	//*  45   89:fcmpl           
	//*  46   90:ifle            95
			f1 = f2;
	//   47   93:fload_3         
	//   48   94:fstore_2        
		obj = ((Object) ((PointF)positionAnimation.getValue()));
	//   49   95:aload_0         
	//   50   96:getfield        #64  <Field BaseKeyframeAnimation positionAnimation>
	//   51   99:invokevirtual   #114 <Method Object BaseKeyframeAnimation.getValue()>
	//   52  102:checkcast       #116 <Class PointF>
	//   53  105:astore          8
		path.moveTo(((PointF) (obj)).x + f3, (((PointF) (obj)).y - f4) + f1);
	//   54  107:aload_0         
	//   55  108:getfield        #37  <Field Path path>
	//   56  111:aload           8
	//   57  113:getfield        #120 <Field float PointF.x>
	//   58  116:fload           4
	//   59  118:fadd            
	//   60  119:aload           8
	//   61  121:getfield        #123 <Field float PointF.y>
	//   62  124:fload           5
	//   63  126:fsub            
	//   64  127:fload_2         
	//   65  128:fadd            
	//   66  129:invokevirtual   #139 <Method void Path.moveTo(float, float)>
		path.lineTo(((PointF) (obj)).x + f3, (((PointF) (obj)).y + f4) - f1);
	//   67  132:aload_0         
	//   68  133:getfield        #37  <Field Path path>
	//   69  136:aload           8
	//   70  138:getfield        #120 <Field float PointF.x>
	//   71  141:fload           4
	//   72  143:fadd            
	//   73  144:aload           8
	//   74  146:getfield        #123 <Field float PointF.y>
	//   75  149:fload           5
	//   76  151:fadd            
	//   77  152:fload_2         
	//   78  153:fsub            
	//   79  154:invokevirtual   #142 <Method void Path.lineTo(float, float)>
		int i = f1 != 0.0F;
	//   80  157:fload_2         
	//   81  158:fconst_0        
	//   82  159:fcmpl           
	//   83  160:istore          7
		if(i > 0)
	//*  84  162:iload           7
	//*  85  164:ifle            235
		{
			RectF rectf = rect;
	//   86  167:aload_0         
	//   87  168:getfield        #42  <Field RectF rect>
	//   88  171:astore          9
			f = ((PointF) (obj)).x;
	//   89  173:aload           8
	//   90  175:getfield        #120 <Field float PointF.x>
	//   91  178:fstore_1        
			f2 = f1 * 2.0F;
	//   92  179:fload_2         
	//   93  180:fconst_2        
	//   94  181:fmul            
	//   95  182:fstore_3        
			rectf.set((f + f3) - f2, (((PointF) (obj)).y + f4) - f2, ((PointF) (obj)).x + f3, ((PointF) (obj)).y + f4);
	//   96  183:aload           9
	//   97  185:fload_1         
	//   98  186:fload           4
	//   99  188:fadd            
	//  100  189:fload_3         
	//  101  190:fsub            
	//  102  191:aload           8
	//  103  193:getfield        #123 <Field float PointF.y>
	//  104  196:fload           5
	//  105  198:fadd            
	//  106  199:fload_3         
	//  107  200:fsub            
	//  108  201:aload           8
	//  109  203:getfield        #120 <Field float PointF.x>
	//  110  206:fload           4
	//  111  208:fadd            
	//  112  209:aload           8
	//  113  211:getfield        #123 <Field float PointF.y>
	//  114  214:fload           5
	//  115  216:fadd            
	//  116  217:invokevirtual   #146 <Method void RectF.set(float, float, float, float)>
			path.arcTo(rect, 0.0F, 90F, false);
	//  117  220:aload_0         
	//  118  221:getfield        #37  <Field Path path>
	//  119  224:aload_0         
	//  120  225:getfield        #42  <Field RectF rect>
	//  121  228:fconst_0        
	//  122  229:ldc1            #147 <Float 90F>
	//  123  231:iconst_0        
	//  124  232:invokevirtual   #151 <Method void Path.arcTo(RectF, float, float, boolean)>
		}
		path.lineTo((((PointF) (obj)).x - f3) + f1, ((PointF) (obj)).y + f4);
	//  125  235:aload_0         
	//  126  236:getfield        #37  <Field Path path>
	//  127  239:aload           8
	//  128  241:getfield        #120 <Field float PointF.x>
	//  129  244:fload           4
	//  130  246:fsub            
	//  131  247:fload_2         
	//  132  248:fadd            
	//  133  249:aload           8
	//  134  251:getfield        #123 <Field float PointF.y>
	//  135  254:fload           5
	//  136  256:fadd            
	//  137  257:invokevirtual   #142 <Method void Path.lineTo(float, float)>
		if(i > 0)
	//* 138  260:iload           7
	//* 139  262:ifle            339
		{
			RectF rectf1 = rect;
	//  140  265:aload_0         
	//  141  266:getfield        #42  <Field RectF rect>
	//  142  269:astore          9
			f = ((PointF) (obj)).x;
	//  143  271:aload           8
	//  144  273:getfield        #120 <Field float PointF.x>
	//  145  276:fstore_1        
			f2 = ((PointF) (obj)).y;
	//  146  277:aload           8
	//  147  279:getfield        #123 <Field float PointF.y>
	//  148  282:fstore_3        
			float f5 = f1 * 2.0F;
	//  149  283:fload_2         
	//  150  284:fconst_2        
	//  151  285:fmul            
	//  152  286:fstore          6
			rectf1.set(f - f3, (f2 + f4) - f5, (((PointF) (obj)).x - f3) + f5, ((PointF) (obj)).y + f4);
	//  153  288:aload           9
	//  154  290:fload_1         
	//  155  291:fload           4
	//  156  293:fsub            
	//  157  294:fload_3         
	//  158  295:fload           5
	//  159  297:fadd            
	//  160  298:fload           6
	//  161  300:fsub            
	//  162  301:aload           8
	//  163  303:getfield        #120 <Field float PointF.x>
	//  164  306:fload           4
	//  165  308:fsub            
	//  166  309:fload           6
	//  167  311:fadd            
	//  168  312:aload           8
	//  169  314:getfield        #123 <Field float PointF.y>
	//  170  317:fload           5
	//  171  319:fadd            
	//  172  320:invokevirtual   #146 <Method void RectF.set(float, float, float, float)>
			path.arcTo(rect, 90F, 90F, false);
	//  173  323:aload_0         
	//  174  324:getfield        #37  <Field Path path>
	//  175  327:aload_0         
	//  176  328:getfield        #42  <Field RectF rect>
	//  177  331:ldc1            #147 <Float 90F>
	//  178  333:ldc1            #147 <Float 90F>
	//  179  335:iconst_0        
	//  180  336:invokevirtual   #151 <Method void Path.arcTo(RectF, float, float, boolean)>
		}
		Path path1 = path;
	//  181  339:aload_0         
	//  182  340:getfield        #37  <Field Path path>
	//  183  343:astore          9
		f = ((PointF) (obj)).x;
	//  184  345:aload           8
	//  185  347:getfield        #120 <Field float PointF.x>
	//  186  350:fstore_1        
		f2 = ((PointF) (obj)).y;
	//  187  351:aload           8
	//  188  353:getfield        #123 <Field float PointF.y>
	//  189  356:fstore_3        
		f1 *= 2.0F;
	//  190  357:fload_2         
	//  191  358:fconst_2        
	//  192  359:fmul            
	//  193  360:fstore_2        
		path1.lineTo(f - f3, (f2 - f4) + f1);
	//  194  361:aload           9
	//  195  363:fload_1         
	//  196  364:fload           4
	//  197  366:fsub            
	//  198  367:fload_3         
	//  199  368:fload           5
	//  200  370:fsub            
	//  201  371:fload_2         
	//  202  372:fadd            
	//  203  373:invokevirtual   #142 <Method void Path.lineTo(float, float)>
		if(i > 0)
	//* 204  376:iload           7
	//* 205  378:ifle            440
		{
			rect.set(((PointF) (obj)).x - f3, ((PointF) (obj)).y - f4, (((PointF) (obj)).x - f3) + f1, (((PointF) (obj)).y - f4) + f1);
	//  206  381:aload_0         
	//  207  382:getfield        #42  <Field RectF rect>
	//  208  385:aload           8
	//  209  387:getfield        #120 <Field float PointF.x>
	//  210  390:fload           4
	//  211  392:fsub            
	//  212  393:aload           8
	//  213  395:getfield        #123 <Field float PointF.y>
	//  214  398:fload           5
	//  215  400:fsub            
	//  216  401:aload           8
	//  217  403:getfield        #120 <Field float PointF.x>
	//  218  406:fload           4
	//  219  408:fsub            
	//  220  409:fload_2         
	//  221  410:fadd            
	//  222  411:aload           8
	//  223  413:getfield        #123 <Field float PointF.y>
	//  224  416:fload           5
	//  225  418:fsub            
	//  226  419:fload_2         
	//  227  420:fadd            
	//  228  421:invokevirtual   #146 <Method void RectF.set(float, float, float, float)>
			path.arcTo(rect, 180F, 90F, false);
	//  229  424:aload_0         
	//  230  425:getfield        #37  <Field Path path>
	//  231  428:aload_0         
	//  232  429:getfield        #42  <Field RectF rect>
	//  233  432:ldc1            #152 <Float 180F>
	//  234  434:ldc1            #147 <Float 90F>
	//  235  436:iconst_0        
	//  236  437:invokevirtual   #151 <Method void Path.arcTo(RectF, float, float, boolean)>
		}
		path.lineTo((((PointF) (obj)).x + f3) - f1, ((PointF) (obj)).y - f4);
	//  237  440:aload_0         
	//  238  441:getfield        #37  <Field Path path>
	//  239  444:aload           8
	//  240  446:getfield        #120 <Field float PointF.x>
	//  241  449:fload           4
	//  242  451:fadd            
	//  243  452:fload_2         
	//  244  453:fsub            
	//  245  454:aload           8
	//  246  456:getfield        #123 <Field float PointF.y>
	//  247  459:fload           5
	//  248  461:fsub            
	//  249  462:invokevirtual   #142 <Method void Path.lineTo(float, float)>
		if(i > 0)
	//* 250  465:iload           7
	//* 251  467:ifle            529
		{
			rect.set((((PointF) (obj)).x + f3) - f1, ((PointF) (obj)).y - f4, ((PointF) (obj)).x + f3, (((PointF) (obj)).y - f4) + f1);
	//  252  470:aload_0         
	//  253  471:getfield        #42  <Field RectF rect>
	//  254  474:aload           8
	//  255  476:getfield        #120 <Field float PointF.x>
	//  256  479:fload           4
	//  257  481:fadd            
	//  258  482:fload_2         
	//  259  483:fsub            
	//  260  484:aload           8
	//  261  486:getfield        #123 <Field float PointF.y>
	//  262  489:fload           5
	//  263  491:fsub            
	//  264  492:aload           8
	//  265  494:getfield        #120 <Field float PointF.x>
	//  266  497:fload           4
	//  267  499:fadd            
	//  268  500:aload           8
	//  269  502:getfield        #123 <Field float PointF.y>
	//  270  505:fload           5
	//  271  507:fsub            
	//  272  508:fload_2         
	//  273  509:fadd            
	//  274  510:invokevirtual   #146 <Method void RectF.set(float, float, float, float)>
			path.arcTo(rect, 270F, 90F, false);
	//  275  513:aload_0         
	//  276  514:getfield        #37  <Field Path path>
	//  277  517:aload_0         
	//  278  518:getfield        #42  <Field RectF rect>
	//  279  521:ldc1            #153 <Float 270F>
	//  280  523:ldc1            #147 <Float 90F>
	//  281  525:iconst_0        
	//  282  526:invokevirtual   #151 <Method void Path.arcTo(RectF, float, float, boolean)>
		}
		path.close();
	//  283  529:aload_0         
	//  284  530:getfield        #37  <Field Path path>
	//  285  533:invokevirtual   #156 <Method void Path.close()>
		Utils.applyTrimPathIfNeeded(path, trimPath);
	//  286  536:aload_0         
	//  287  537:getfield        #37  <Field Path path>
	//  288  540:aload_0         
	//  289  541:getfield        #158 <Field TrimPathContent trimPath>
	//  290  544:invokestatic    #164 <Method void Utils.applyTrimPathIfNeeded(Path, TrimPathContent)>
		isPathValid = true;
	//  291  547:aload_0         
	//  292  548:iconst_1        
	//  293  549:putfield        #100 <Field boolean isPathValid>
		return path;
	//  294  552:aload_0         
	//  295  553:getfield        #37  <Field Path path>
	//  296  556:areturn         
	}

	public void onValueChanged()
	{
		invalidate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #167 <Method void invalidate()>
	//    2    4:return          
	}

	public void setContents(List list, List list1)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #175 <Method int List.size()>
	//*   5    9:icmpge          65
		{
			list1 = ((List) ((Content)list.get(i)));
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokeinterface #179 <Method Object List.get(int)>
	//    9   19:checkcast       #181 <Class Content>
	//   10   22:astore_2        
			if(!(list1 instanceof TrimPathContent))
				continue;
	//   11   23:aload_2         
	//   12   24:instanceof      #183 <Class TrimPathContent>
	//   13   27:ifeq            58
			list1 = ((List) ((TrimPathContent)list1));
	//   14   30:aload_2         
	//   15   31:checkcast       #183 <Class TrimPathContent>
	//   16   34:astore_2        
			if(((TrimPathContent) (list1)).getType() == ShapeTrimPath.Type.Simultaneously)
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #187 <Method ShapeTrimPath$Type TrimPathContent.getType()>
	//*  19   39:getstatic       #193 <Field ShapeTrimPath$Type ShapeTrimPath$Type.Simultaneously>
	//*  20   42:if_acmpne       58
			{
				trimPath = ((TrimPathContent) (list1));
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:putfield        #158 <Field TrimPathContent trimPath>
				trimPath.addListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   24   50:aload_0         
	//   25   51:getfield        #158 <Field TrimPathContent trimPath>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #196 <Method void TrimPathContent.addListener(BaseKeyframeAnimation$AnimationListener)>
			}
		}

	//   28   58:iload_3         
	//   29   59:iconst_1        
	//   30   60:iadd            
	//   31   61:istore_3        
	//*  32   62:goto            2
	//   33   65:return          
	}

	private final BaseKeyframeAnimation cornerRadiusAnimation;
	private boolean isPathValid;
	private final LottieDrawable lottieDrawable;
	private final String name;
	private final Path path = new Path();
	private final BaseKeyframeAnimation positionAnimation;
	private final RectF rect = new RectF();
	private final BaseKeyframeAnimation sizeAnimation;
	private TrimPathContent trimPath;
}
