// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			DrawingContent, AnimatableIntegerValue, AnimatableFloatValue, BaseLayer, 
//			BaseKeyframeAnimation, LottieDrawable, PathContent, TrimPathContent, 
//			Utils, Content

abstract class BaseStrokeContent
	implements BaseKeyframeAnimation.AnimationListener, DrawingContent
{
	private static final class PathGroup
	{

		private final List paths;
		private final TrimPathContent trimPath;


/*
		static List access$100(PathGroup pathgroup)
		{
			return pathgroup.paths;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field List paths>
		//    2    4:areturn         
		}

*/


/*
		static TrimPathContent access$200(PathGroup pathgroup)
		{
			return pathgroup.trimPath;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field TrimPathContent trimPath>
		//    2    4:areturn         
		}

*/

		private PathGroup(TrimPathContent trimpathcontent)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			paths = ((List) (new ArrayList()));
		//    2    4:aload_0         
		//    3    5:new             #20  <Class ArrayList>
		//    4    8:dup             
		//    5    9:invokespecial   #21  <Method void ArrayList()>
		//    6   12:putfield        #23  <Field List paths>
			trimPath = trimpathcontent;
		//    7   15:aload_0         
		//    8   16:aload_1         
		//    9   17:putfield        #25  <Field TrimPathContent trimPath>
		//   10   20:return          
		}

	}


	BaseStrokeContent(LottieDrawable lottiedrawable, BaseLayer baselayer, android.graphics.Paint.Cap cap, android.graphics.Paint.Join join, AnimatableIntegerValue animatableintegervalue, AnimatableFloatValue animatablefloatvalue, List list, 
			AnimatableFloatValue animatablefloatvalue1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class PathMeasure>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void PathMeasure()>
	//    6   12:putfield        #48  <Field PathMeasure pm>
	//    7   15:aload_0         
	//    8   16:new             #50  <Class Path>
	//    9   19:dup             
	//   10   20:invokespecial   #51  <Method void Path()>
	//   11   23:putfield        #53  <Field Path path>
	//   12   26:aload_0         
	//   13   27:new             #50  <Class Path>
	//   14   30:dup             
	//   15   31:invokespecial   #51  <Method void Path()>
	//   16   34:putfield        #55  <Field Path trimPathPath>
	//   17   37:aload_0         
	//   18   38:new             #57  <Class RectF>
	//   19   41:dup             
	//   20   42:invokespecial   #58  <Method void RectF()>
	//   21   45:putfield        #60  <Field RectF rect>
	//   22   48:aload_0         
	//   23   49:new             #62  <Class ArrayList>
	//   24   52:dup             
	//   25   53:invokespecial   #63  <Method void ArrayList()>
	//   26   56:putfield        #65  <Field List pathGroups>
	//   27   59:aload_0         
	//   28   60:new             #67  <Class Paint>
	//   29   63:dup             
	//   30   64:iconst_1        
	//   31   65:invokespecial   #70  <Method void Paint(int)>
	//   32   68:putfield        #72  <Field Paint paint>
		lottieDrawable = lottiedrawable;
	//   33   71:aload_0         
	//   34   72:aload_1         
	//   35   73:putfield        #74  <Field LottieDrawable lottieDrawable>
		paint.setStyle(android.graphics.Paint.Style.STROKE);
	//   36   76:aload_0         
	//   37   77:getfield        #72  <Field Paint paint>
	//   38   80:getstatic       #80  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   39   83:invokevirtual   #84  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		paint.setStrokeCap(cap);
	//   40   86:aload_0         
	//   41   87:getfield        #72  <Field Paint paint>
	//   42   90:aload_3         
	//   43   91:invokevirtual   #88  <Method void Paint.setStrokeCap(android.graphics.Paint$Cap)>
		paint.setStrokeJoin(join);
	//   44   94:aload_0         
	//   45   95:getfield        #72  <Field Paint paint>
	//   46   98:aload           4
	//   47  100:invokevirtual   #92  <Method void Paint.setStrokeJoin(android.graphics.Paint$Join)>
		opacityAnimation = ((BaseKeyframeAnimation) (animatableintegervalue.createAnimation()));
	//   48  103:aload_0         
	//   49  104:aload           5
	//   50  106:invokevirtual   #98  <Method KeyframeAnimation AnimatableIntegerValue.createAnimation()>
	//   51  109:putfield        #100 <Field BaseKeyframeAnimation opacityAnimation>
		widthAnimation = ((BaseKeyframeAnimation) (animatablefloatvalue.createAnimation()));
	//   52  112:aload_0         
	//   53  113:aload           6
	//   54  115:invokevirtual   #103 <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   55  118:putfield        #105 <Field BaseKeyframeAnimation widthAnimation>
		if(animatablefloatvalue1 == null)
	//*  56  121:aload           8
	//*  57  123:ifnonnull       134
			dashPatternOffsetAnimation = null;
	//   58  126:aload_0         
	//   59  127:aconst_null     
	//   60  128:putfield        #107 <Field BaseKeyframeAnimation dashPatternOffsetAnimation>
		else
	//*  61  131:goto            143
			dashPatternOffsetAnimation = ((BaseKeyframeAnimation) (animatablefloatvalue1.createAnimation()));
	//   62  134:aload_0         
	//   63  135:aload           8
	//   64  137:invokevirtual   #103 <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   65  140:putfield        #107 <Field BaseKeyframeAnimation dashPatternOffsetAnimation>
		dashPatternAnimations = ((List) (new ArrayList(list.size())));
	//   66  143:aload_0         
	//   67  144:new             #62  <Class ArrayList>
	//   68  147:dup             
	//   69  148:aload           7
	//   70  150:invokeinterface #113 <Method int List.size()>
	//   71  155:invokespecial   #114 <Method void ArrayList(int)>
	//   72  158:putfield        #116 <Field List dashPatternAnimations>
		dashPatternValues = new float[list.size()];
	//   73  161:aload_0         
	//   74  162:aload           7
	//   75  164:invokeinterface #113 <Method int List.size()>
	//   76  169:newarray        float[]
	//   77  171:putfield        #118 <Field float[] dashPatternValues>
		boolean flag = false;
	//   78  174:iconst_0        
	//   79  175:istore          10
		for(int i = 0; i < list.size(); i++)
	//*  80  177:iconst_0        
	//*  81  178:istore          9
	//*  82  180:iload           9
	//*  83  182:aload           7
	//*  84  184:invokeinterface #113 <Method int List.size()>
	//*  85  189:icmpge          226
			dashPatternAnimations.add(((Object) (((AnimatableFloatValue)list.get(i)).createAnimation())));
	//   86  192:aload_0         
	//   87  193:getfield        #116 <Field List dashPatternAnimations>
	//   88  196:aload           7
	//   89  198:iload           9
	//   90  200:invokeinterface #122 <Method Object List.get(int)>
	//   91  205:checkcast       #102 <Class AnimatableFloatValue>
	//   92  208:invokevirtual   #103 <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   93  211:invokeinterface #126 <Method boolean List.add(Object)>
	//   94  216:pop             

	//   95  217:iload           9
	//   96  219:iconst_1        
	//   97  220:iadd            
	//   98  221:istore          9
	//*  99  223:goto            180
		baselayer.addAnimation(opacityAnimation);
	//  100  226:aload_2         
	//  101  227:aload_0         
	//  102  228:getfield        #100 <Field BaseKeyframeAnimation opacityAnimation>
	//  103  231:invokevirtual   #132 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(widthAnimation);
	//  104  234:aload_2         
	//  105  235:aload_0         
	//  106  236:getfield        #105 <Field BaseKeyframeAnimation widthAnimation>
	//  107  239:invokevirtual   #132 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		for(int j = 0; j < dashPatternAnimations.size(); j++)
	//* 108  242:iconst_0        
	//* 109  243:istore          9
	//* 110  245:iload           9
	//* 111  247:aload_0         
	//* 112  248:getfield        #116 <Field List dashPatternAnimations>
	//* 113  251:invokeinterface #113 <Method int List.size()>
	//* 114  256:icmpge          286
			baselayer.addAnimation((BaseKeyframeAnimation)dashPatternAnimations.get(j));
	//  115  259:aload_2         
	//  116  260:aload_0         
	//  117  261:getfield        #116 <Field List dashPatternAnimations>
	//  118  264:iload           9
	//  119  266:invokeinterface #122 <Method Object List.get(int)>
	//  120  271:checkcast       #134 <Class BaseKeyframeAnimation>
	//  121  274:invokevirtual   #132 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>

	//  122  277:iload           9
	//  123  279:iconst_1        
	//  124  280:iadd            
	//  125  281:istore          9
	//* 126  283:goto            245
		lottiedrawable = ((LottieDrawable) (dashPatternOffsetAnimation));
	//  127  286:aload_0         
	//  128  287:getfield        #107 <Field BaseKeyframeAnimation dashPatternOffsetAnimation>
	//  129  290:astore_1        
		if(lottiedrawable != null)
	//* 130  291:aload_1         
	//* 131  292:ifnull          300
			baselayer.addAnimation(((BaseKeyframeAnimation) (lottiedrawable)));
	//  132  295:aload_2         
	//  133  296:aload_1         
	//  134  297:invokevirtual   #132 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		opacityAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  135  300:aload_0         
	//  136  301:getfield        #100 <Field BaseKeyframeAnimation opacityAnimation>
	//  137  304:aload_0         
	//  138  305:invokevirtual   #138 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		widthAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  139  308:aload_0         
	//  140  309:getfield        #105 <Field BaseKeyframeAnimation widthAnimation>
	//  141  312:aload_0         
	//  142  313:invokevirtual   #138 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		for(int k = ((int) (flag)); k < list.size(); k++)
	//* 143  316:iload           10
	//* 144  318:istore          9
	//* 145  320:iload           9
	//* 146  322:aload           7
	//* 147  324:invokeinterface #113 <Method int List.size()>
	//* 148  329:icmpge          359
			((BaseKeyframeAnimation)dashPatternAnimations.get(k)).addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  149  332:aload_0         
	//  150  333:getfield        #116 <Field List dashPatternAnimations>
	//  151  336:iload           9
	//  152  338:invokeinterface #122 <Method Object List.get(int)>
	//  153  343:checkcast       #134 <Class BaseKeyframeAnimation>
	//  154  346:aload_0         
	//  155  347:invokevirtual   #138 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>

	//  156  350:iload           9
	//  157  352:iconst_1        
	//  158  353:iadd            
	//  159  354:istore          9
	//* 160  356:goto            320
		lottiedrawable = ((LottieDrawable) (dashPatternOffsetAnimation));
	//  161  359:aload_0         
	//  162  360:getfield        #107 <Field BaseKeyframeAnimation dashPatternOffsetAnimation>
	//  163  363:astore_1        
		if(lottiedrawable != null)
	//* 164  364:aload_1         
	//* 165  365:ifnull          373
			((BaseKeyframeAnimation) (lottiedrawable)).addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  166  368:aload_1         
	//  167  369:aload_0         
	//  168  370:invokevirtual   #138 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
	//  169  373:return          
	}

	private void applyDashPatternIfNeeded()
	{
		if(dashPatternAnimations.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:getfield        #116 <Field List dashPatternAnimations>
	//*   2    4:invokeinterface #146 <Method boolean List.isEmpty()>
	//*   3    9:ifeq            13
			return;
	//    4   12:return          
		float f = lottieDrawable.getScale();
	//    5   13:aload_0         
	//    6   14:getfield        #74  <Field LottieDrawable lottieDrawable>
	//    7   17:invokevirtual   #152 <Method float LottieDrawable.getScale()>
	//    8   20:fstore_1        
		for(int i = 0; i < dashPatternAnimations.size(); i++)
	//*   9   21:iconst_0        
	//*  10   22:istore_2        
	//*  11   23:iload_2         
	//*  12   24:aload_0         
	//*  13   25:getfield        #116 <Field List dashPatternAnimations>
	//*  14   28:invokeinterface #113 <Method int List.size()>
	//*  15   33:icmpge          129
		{
			dashPatternValues[i] = ((Float)((BaseKeyframeAnimation)dashPatternAnimations.get(i)).getValue()).floatValue();
	//   16   36:aload_0         
	//   17   37:getfield        #118 <Field float[] dashPatternValues>
	//   18   40:iload_2         
	//   19   41:aload_0         
	//   20   42:getfield        #116 <Field List dashPatternAnimations>
	//   21   45:iload_2         
	//   22   46:invokeinterface #122 <Method Object List.get(int)>
	//   23   51:checkcast       #134 <Class BaseKeyframeAnimation>
	//   24   54:invokevirtual   #156 <Method Object BaseKeyframeAnimation.getValue()>
	//   25   57:checkcast       #158 <Class Float>
	//   26   60:invokevirtual   #161 <Method float Float.floatValue()>
	//   27   63:fastore         
			if(i % 2 == 0)
	//*  28   64:iload_2         
	//*  29   65:iconst_2        
	//*  30   66:irem            
	//*  31   67:ifne            90
			{
				float af[] = dashPatternValues;
	//   32   70:aload_0         
	//   33   71:getfield        #118 <Field float[] dashPatternValues>
	//   34   74:astore_3        
				if(af[i] < 1.0F)
	//*  35   75:aload_3         
	//*  36   76:iload_2         
	//*  37   77:faload          
	//*  38   78:fconst_1        
	//*  39   79:fcmpg           
	//*  40   80:ifge            109
					af[i] = 1.0F;
	//   41   83:aload_3         
	//   42   84:iload_2         
	//   43   85:fconst_1        
	//   44   86:fastore         
			} else
	//*  45   87:goto            109
			{
				float af1[] = dashPatternValues;
	//   46   90:aload_0         
	//   47   91:getfield        #118 <Field float[] dashPatternValues>
	//   48   94:astore_3        
				if(af1[i] < 0.1F)
	//*  49   95:aload_3         
	//*  50   96:iload_2         
	//*  51   97:faload          
	//*  52   98:ldc1            #162 <Float 0.1F>
	//*  53  100:fcmpg           
	//*  54  101:ifge            109
					af1[i] = 0.1F;
	//   55  104:aload_3         
	//   56  105:iload_2         
	//   57  106:ldc1            #162 <Float 0.1F>
	//   58  108:fastore         
			}
			float af2[] = dashPatternValues;
	//   59  109:aload_0         
	//   60  110:getfield        #118 <Field float[] dashPatternValues>
	//   61  113:astore_3        
			af2[i] = af2[i] * f;
	//   62  114:aload_3         
	//   63  115:iload_2         
	//   64  116:aload_3         
	//   65  117:iload_2         
	//   66  118:faload          
	//   67  119:fload_1         
	//   68  120:fmul            
	//   69  121:fastore         
		}

	//   70  122:iload_2         
	//   71  123:iconst_1        
	//   72  124:iadd            
	//   73  125:istore_2        
	//*  74  126:goto            23
		BaseKeyframeAnimation basekeyframeanimation = dashPatternOffsetAnimation;
	//   75  129:aload_0         
	//   76  130:getfield        #107 <Field BaseKeyframeAnimation dashPatternOffsetAnimation>
	//   77  133:astore_3        
		if(basekeyframeanimation == null)
	//*  78  134:aload_3         
	//*  79  135:ifnonnull       143
			f = 0.0F;
	//   80  138:fconst_0        
	//   81  139:fstore_1        
		else
	//*  82  140:goto            154
			f = ((Float)basekeyframeanimation.getValue()).floatValue();
	//   83  143:aload_3         
	//   84  144:invokevirtual   #156 <Method Object BaseKeyframeAnimation.getValue()>
	//   85  147:checkcast       #158 <Class Float>
	//   86  150:invokevirtual   #161 <Method float Float.floatValue()>
	//   87  153:fstore_1        
		paint.setPathEffect(((android.graphics.PathEffect) (new DashPathEffect(dashPatternValues, f))));
	//   88  154:aload_0         
	//   89  155:getfield        #72  <Field Paint paint>
	//   90  158:new             #164 <Class DashPathEffect>
	//   91  161:dup             
	//   92  162:aload_0         
	//   93  163:getfield        #118 <Field float[] dashPatternValues>
	//   94  166:fload_1         
	//   95  167:invokespecial   #167 <Method void DashPathEffect(float[], float)>
	//   96  170:invokevirtual   #171 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   97  173:pop             
	//   98  174:return          
	}

	private void applyTrimPath(Canvas canvas, PathGroup pathgroup, Matrix matrix)
	{
		if(pathgroup.trimPath == null)
	//*   0    0:aload_2         
	//*   1    1:invokestatic    #177 <Method TrimPathContent BaseStrokeContent$PathGroup.access$200(BaseStrokeContent$PathGroup)>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		path.reset();
	//    4    8:aload_0         
	//    5    9:getfield        #53  <Field Path path>
	//    6   12:invokevirtual   #180 <Method void Path.reset()>
		for(int i = pathgroup.paths.size() - 1; i >= 0; i--)
	//*   7   15:aload_2         
	//*   8   16:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//*   9   19:invokeinterface #113 <Method int List.size()>
	//*  10   24:iconst_1        
	//*  11   25:isub            
	//*  12   26:istore          12
	//*  13   28:iload           12
	//*  14   30:iflt            69
			path.addPath(((PathContent)pathgroup.paths.get(i)).getPath(), matrix);
	//   15   33:aload_0         
	//   16   34:getfield        #53  <Field Path path>
	//   17   37:aload_2         
	//   18   38:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//   19   41:iload           12
	//   20   43:invokeinterface #122 <Method Object List.get(int)>
	//   21   48:checkcast       #186 <Class PathContent>
	//   22   51:invokeinterface #190 <Method Path PathContent.getPath()>
	//   23   56:aload_3         
	//   24   57:invokevirtual   #194 <Method void Path.addPath(Path, Matrix)>

	//   25   60:iload           12
	//   26   62:iconst_1        
	//   27   63:isub            
	//   28   64:istore          12
	//*  29   66:goto            28
		pm.setPath(path, false);
	//   30   69:aload_0         
	//   31   70:getfield        #48  <Field PathMeasure pm>
	//   32   73:aload_0         
	//   33   74:getfield        #53  <Field Path path>
	//   34   77:iconst_0        
	//   35   78:invokevirtual   #198 <Method void PathMeasure.setPath(Path, boolean)>
		float f;
		for(f = pm.getLength(); pm.nextContour(); f += pm.getLength());
	//   36   81:aload_0         
	//   37   82:getfield        #48  <Field PathMeasure pm>
	//   38   85:invokevirtual   #201 <Method float PathMeasure.getLength()>
	//   39   88:fstore          4
	//   40   90:aload_0         
	//   41   91:getfield        #48  <Field PathMeasure pm>
	//   42   94:invokevirtual   #204 <Method boolean PathMeasure.nextContour()>
	//   43   97:ifeq            115
	//   44  100:fload           4
	//   45  102:aload_0         
	//   46  103:getfield        #48  <Field PathMeasure pm>
	//   47  106:invokevirtual   #201 <Method float PathMeasure.getLength()>
	//   48  109:fadd            
	//   49  110:fstore          4
	//*  50  112:goto            90
		float f1 = (((Float)pathgroup.trimPath.getOffset().getValue()).floatValue() * f) / 360F;
	//   51  115:aload_2         
	//   52  116:invokestatic    #177 <Method TrimPathContent BaseStrokeContent$PathGroup.access$200(BaseStrokeContent$PathGroup)>
	//   53  119:invokevirtual   #210 <Method BaseKeyframeAnimation TrimPathContent.getOffset()>
	//   54  122:invokevirtual   #156 <Method Object BaseKeyframeAnimation.getValue()>
	//   55  125:checkcast       #158 <Class Float>
	//   56  128:invokevirtual   #161 <Method float Float.floatValue()>
	//   57  131:fload           4
	//   58  133:fmul            
	//   59  134:ldc1            #211 <Float 360F>
	//   60  136:fdiv            
	//   61  137:fstore          5
		float f5 = (((Float)pathgroup.trimPath.getStart().getValue()).floatValue() * f) / 100F + f1;
	//   62  139:aload_2         
	//   63  140:invokestatic    #177 <Method TrimPathContent BaseStrokeContent$PathGroup.access$200(BaseStrokeContent$PathGroup)>
	//   64  143:invokevirtual   #214 <Method BaseKeyframeAnimation TrimPathContent.getStart()>
	//   65  146:invokevirtual   #156 <Method Object BaseKeyframeAnimation.getValue()>
	//   66  149:checkcast       #158 <Class Float>
	//   67  152:invokevirtual   #161 <Method float Float.floatValue()>
	//   68  155:fload           4
	//   69  157:fmul            
	//   70  158:ldc1            #215 <Float 100F>
	//   71  160:fdiv            
	//   72  161:fload           5
	//   73  163:fadd            
	//   74  164:fstore          8
		float f6 = (((Float)pathgroup.trimPath.getEnd().getValue()).floatValue() * f) / 100F + f1;
	//   75  166:aload_2         
	//   76  167:invokestatic    #177 <Method TrimPathContent BaseStrokeContent$PathGroup.access$200(BaseStrokeContent$PathGroup)>
	//   77  170:invokevirtual   #218 <Method BaseKeyframeAnimation TrimPathContent.getEnd()>
	//   78  173:invokevirtual   #156 <Method Object BaseKeyframeAnimation.getValue()>
	//   79  176:checkcast       #158 <Class Float>
	//   80  179:invokevirtual   #161 <Method float Float.floatValue()>
	//   81  182:fload           4
	//   82  184:fmul            
	//   83  185:ldc1            #215 <Float 100F>
	//   84  187:fdiv            
	//   85  188:fload           5
	//   86  190:fadd            
	//   87  191:fstore          9
		int j = pathgroup.paths.size() - 1;
	//   88  193:aload_2         
	//   89  194:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//   90  197:invokeinterface #113 <Method int List.size()>
	//   91  202:iconst_1        
	//   92  203:isub            
	//   93  204:istore          12
		f1 = 0.0F;
	//   94  206:fconst_0        
	//   95  207:fstore          5
		for(; j >= 0; j--)
	//*  96  209:iload           12
	//*  97  211:iflt            510
		{
			float f7;
label0:
			{
				trimPathPath.set(((PathContent)pathgroup.paths.get(j)).getPath());
	//   98  214:aload_0         
	//   99  215:getfield        #55  <Field Path trimPathPath>
	//  100  218:aload_2         
	//  101  219:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//  102  222:iload           12
	//  103  224:invokeinterface #122 <Method Object List.get(int)>
	//  104  229:checkcast       #186 <Class PathContent>
	//  105  232:invokeinterface #190 <Method Path PathContent.getPath()>
	//  106  237:invokevirtual   #222 <Method void Path.set(Path)>
				trimPathPath.transform(matrix);
	//  107  240:aload_0         
	//  108  241:getfield        #55  <Field Path trimPathPath>
	//  109  244:aload_3         
	//  110  245:invokevirtual   #226 <Method void Path.transform(Matrix)>
				pm.setPath(trimPathPath, false);
	//  111  248:aload_0         
	//  112  249:getfield        #48  <Field PathMeasure pm>
	//  113  252:aload_0         
	//  114  253:getfield        #55  <Field Path trimPathPath>
	//  115  256:iconst_0        
	//  116  257:invokevirtual   #198 <Method void PathMeasure.setPath(Path, boolean)>
				f7 = pm.getLength();
	//  117  260:aload_0         
	//  118  261:getfield        #48  <Field PathMeasure pm>
	//  119  264:invokevirtual   #201 <Method float PathMeasure.getLength()>
	//  120  267:fstore          10
				float f4 = 1.0F;
	//  121  269:fconst_1        
	//  122  270:fstore          7
				if(f6 > f)
	//* 123  272:fload           9
	//* 124  274:fload           4
	//* 125  276:fcmpl           
	//* 126  277:ifle            368
				{
					float f8 = f6 - f;
	//  127  280:fload           9
	//  128  282:fload           4
	//  129  284:fsub            
	//  130  285:fstore          11
					if(f8 < f1 + f7 && f1 < f8)
	//* 131  287:fload           11
	//* 132  289:fload           5
	//* 133  291:fload           10
	//* 134  293:fadd            
	//* 135  294:fcmpg           
	//* 136  295:ifge            368
	//* 137  298:fload           5
	//* 138  300:fload           11
	//* 139  302:fcmpg           
	//* 140  303:ifge            368
					{
						float f2;
						if(f5 > f)
	//* 141  306:fload           8
	//* 142  308:fload           4
	//* 143  310:fcmpl           
	//* 144  311:ifle            327
							f2 = (f5 - f) / f7;
	//  145  314:fload           8
	//  146  316:fload           4
	//  147  318:fsub            
	//  148  319:fload           10
	//  149  321:fdiv            
	//  150  322:fstore          6
						else
	//* 151  324:goto            330
							f2 = 0.0F;
	//  152  327:fconst_0        
	//  153  328:fstore          6
						f4 = Math.min(f8 / f7, 1.0F);
	//  154  330:fload           11
	//  155  332:fload           10
	//  156  334:fdiv            
	//  157  335:fconst_1        
	//  158  336:invokestatic    #232 <Method float Math.min(float, float)>
	//  159  339:fstore          7
						Utils.applyTrimPathIfNeeded(trimPathPath, f2, f4, 0.0F);
	//  160  341:aload_0         
	//  161  342:getfield        #55  <Field Path trimPathPath>
	//  162  345:fload           6
	//  163  347:fload           7
	//  164  349:fconst_0        
	//  165  350:invokestatic    #238 <Method void Utils.applyTrimPathIfNeeded(Path, float, float, float)>
						canvas.drawPath(trimPathPath, paint);
	//  166  353:aload_1         
	//  167  354:aload_0         
	//  168  355:getfield        #55  <Field Path trimPathPath>
	//  169  358:aload_0         
	//  170  359:getfield        #72  <Field Paint paint>
	//  171  362:invokevirtual   #244 <Method void Canvas.drawPath(Path, Paint)>
						break label0;
	//  172  365:goto            494
					}
				}
				float f9 = f1 + f7;
	//  173  368:fload           5
	//  174  370:fload           10
	//  175  372:fadd            
	//  176  373:fstore          11
				if(f9 >= f5 && f1 <= f6)
	//* 177  375:fload           11
	//* 178  377:fload           8
	//* 179  379:fcmpg           
	//* 180  380:iflt            494
	//* 181  383:fload           5
	//* 182  385:fload           9
	//* 183  387:fcmpl           
	//* 184  388:ifle            394
	//* 185  391:goto            494
					if(f9 <= f6 && f5 < f1)
	//* 186  394:fload           11
	//* 187  396:fload           9
	//* 188  398:fcmpg           
	//* 189  399:ifgt            425
	//* 190  402:fload           8
	//* 191  404:fload           5
	//* 192  406:fcmpg           
	//* 193  407:ifge            425
					{
						canvas.drawPath(trimPathPath, paint);
	//  194  410:aload_1         
	//  195  411:aload_0         
	//  196  412:getfield        #55  <Field Path trimPathPath>
	//  197  415:aload_0         
	//  198  416:getfield        #72  <Field Paint paint>
	//  199  419:invokevirtual   #244 <Method void Canvas.drawPath(Path, Paint)>
					} else
	//* 200  422:goto            494
					{
						float f3;
						if(f5 < f1)
	//* 201  425:fload           8
	//* 202  427:fload           5
	//* 203  429:fcmpg           
	//* 204  430:ifge            439
							f3 = 0.0F;
	//  205  433:fconst_0        
	//  206  434:fstore          6
						else
	//* 207  436:goto            449
							f3 = (f5 - f1) / f7;
	//  208  439:fload           8
	//  209  441:fload           5
	//  210  443:fsub            
	//  211  444:fload           10
	//  212  446:fdiv            
	//  213  447:fstore          6
						if(f6 <= f9)
	//* 214  449:fload           9
	//* 215  451:fload           11
	//* 216  453:fcmpl           
	//* 217  454:ifle            460
	//* 218  457:goto            470
							f4 = (f6 - f1) / f7;
	//  219  460:fload           9
	//  220  462:fload           5
	//  221  464:fsub            
	//  222  465:fload           10
	//  223  467:fdiv            
	//  224  468:fstore          7
						Utils.applyTrimPathIfNeeded(trimPathPath, f3, f4, 0.0F);
	//  225  470:aload_0         
	//  226  471:getfield        #55  <Field Path trimPathPath>
	//  227  474:fload           6
	//  228  476:fload           7
	//  229  478:fconst_0        
	//  230  479:invokestatic    #238 <Method void Utils.applyTrimPathIfNeeded(Path, float, float, float)>
						canvas.drawPath(trimPathPath, paint);
	//  231  482:aload_1         
	//  232  483:aload_0         
	//  233  484:getfield        #55  <Field Path trimPathPath>
	//  234  487:aload_0         
	//  235  488:getfield        #72  <Field Paint paint>
	//  236  491:invokevirtual   #244 <Method void Canvas.drawPath(Path, Paint)>
					}
			}
			f1 += f7;
	//  237  494:fload           5
	//  238  496:fload           10
	//  239  498:fadd            
	//  240  499:fstore          5
		}

	//  241  501:iload           12
	//  242  503:iconst_1        
	//  243  504:isub            
	//  244  505:istore          12
	//* 245  507:goto            209
	//  246  510:return          
	}

	public void draw(Canvas canvas, Matrix matrix, int i)
	{
		i = (int)(((((float)i / 255F) * (float)((Integer)opacityAnimation.getValue()).intValue()) / 100F) * 255F);
	//    0    0:iload_3         
	//    1    1:i2f             
	//    2    2:ldc1            #247 <Float 255F>
	//    3    4:fdiv            
	//    4    5:aload_0         
	//    5    6:getfield        #100 <Field BaseKeyframeAnimation opacityAnimation>
	//    6    9:invokevirtual   #156 <Method Object BaseKeyframeAnimation.getValue()>
	//    7   12:checkcast       #249 <Class Integer>
	//    8   15:invokevirtual   #252 <Method int Integer.intValue()>
	//    9   18:i2f             
	//   10   19:fmul            
	//   11   20:ldc1            #215 <Float 100F>
	//   12   22:fdiv            
	//   13   23:ldc1            #247 <Float 255F>
	//   14   25:fmul            
	//   15   26:f2i             
	//   16   27:istore_3        
		paint.setAlpha(i);
	//   17   28:aload_0         
	//   18   29:getfield        #72  <Field Paint paint>
	//   19   32:iload_3         
	//   20   33:invokevirtual   #255 <Method void Paint.setAlpha(int)>
		paint.setStrokeWidth(((Float)widthAnimation.getValue()).floatValue() * Utils.getScale(matrix));
	//   21   36:aload_0         
	//   22   37:getfield        #72  <Field Paint paint>
	//   23   40:aload_0         
	//   24   41:getfield        #105 <Field BaseKeyframeAnimation widthAnimation>
	//   25   44:invokevirtual   #156 <Method Object BaseKeyframeAnimation.getValue()>
	//   26   47:checkcast       #158 <Class Float>
	//   27   50:invokevirtual   #161 <Method float Float.floatValue()>
	//   28   53:aload_2         
	//   29   54:invokestatic    #258 <Method float Utils.getScale(Matrix)>
	//   30   57:fmul            
	//   31   58:invokevirtual   #262 <Method void Paint.setStrokeWidth(float)>
		if(paint.getStrokeWidth() <= 0.0F)
	//*  32   61:aload_0         
	//*  33   62:getfield        #72  <Field Paint paint>
	//*  34   65:invokevirtual   #265 <Method float Paint.getStrokeWidth()>
	//*  35   68:fconst_0        
	//*  36   69:fcmpg           
	//*  37   70:ifgt            74
			return;
	//   38   73:return          
		applyDashPatternIfNeeded();
	//   39   74:aload_0         
	//   40   75:invokespecial   #267 <Method void applyDashPatternIfNeeded()>
		for(i = 0; i < pathGroups.size(); i++)
	//*  41   78:iconst_0        
	//*  42   79:istore_3        
	//*  43   80:iload_3         
	//*  44   81:aload_0         
	//*  45   82:getfield        #65  <Field List pathGroups>
	//*  46   85:invokeinterface #113 <Method int List.size()>
	//*  47   90:icmpge          209
		{
			PathGroup pathgroup = (PathGroup)pathGroups.get(i);
	//   48   93:aload_0         
	//   49   94:getfield        #65  <Field List pathGroups>
	//   50   97:iload_3         
	//   51   98:invokeinterface #122 <Method Object List.get(int)>
	//   52  103:checkcast       #12  <Class BaseStrokeContent$PathGroup>
	//   53  106:astore          5
			if(pathgroup.trimPath != null)
	//*  54  108:aload           5
	//*  55  110:invokestatic    #177 <Method TrimPathContent BaseStrokeContent$PathGroup.access$200(BaseStrokeContent$PathGroup)>
	//*  56  113:ifnull          127
			{
				applyTrimPath(canvas, pathgroup, matrix);
	//   57  116:aload_0         
	//   58  117:aload_1         
	//   59  118:aload           5
	//   60  120:aload_2         
	//   61  121:invokespecial   #269 <Method void applyTrimPath(Canvas, BaseStrokeContent$PathGroup, Matrix)>
				continue;
	//   62  124:goto            202
			}
			path.reset();
	//   63  127:aload_0         
	//   64  128:getfield        #53  <Field Path path>
	//   65  131:invokevirtual   #180 <Method void Path.reset()>
			for(int j = pathgroup.paths.size() - 1; j >= 0; j--)
	//*  66  134:aload           5
	//*  67  136:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//*  68  139:invokeinterface #113 <Method int List.size()>
	//*  69  144:iconst_1        
	//*  70  145:isub            
	//*  71  146:istore          4
	//*  72  148:iload           4
	//*  73  150:iflt            190
				path.addPath(((PathContent)pathgroup.paths.get(j)).getPath(), matrix);
	//   74  153:aload_0         
	//   75  154:getfield        #53  <Field Path path>
	//   76  157:aload           5
	//   77  159:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//   78  162:iload           4
	//   79  164:invokeinterface #122 <Method Object List.get(int)>
	//   80  169:checkcast       #186 <Class PathContent>
	//   81  172:invokeinterface #190 <Method Path PathContent.getPath()>
	//   82  177:aload_2         
	//   83  178:invokevirtual   #194 <Method void Path.addPath(Path, Matrix)>

	//   84  181:iload           4
	//   85  183:iconst_1        
	//   86  184:isub            
	//   87  185:istore          4
	//*  88  187:goto            148
			canvas.drawPath(path, paint);
	//   89  190:aload_1         
	//   90  191:aload_0         
	//   91  192:getfield        #53  <Field Path path>
	//   92  195:aload_0         
	//   93  196:getfield        #72  <Field Paint paint>
	//   94  199:invokevirtual   #244 <Method void Canvas.drawPath(Path, Paint)>
		}

	//   95  202:iload_3         
	//   96  203:iconst_1        
	//   97  204:iadd            
	//   98  205:istore_3        
	//*  99  206:goto            80
	//  100  209:return          
	}

	public void getBounds(RectF rectf, Matrix matrix)
	{
		path.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Path path>
	//    2    4:invokevirtual   #180 <Method void Path.reset()>
		for(int i = 0; i < pathGroups.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore          5
	//*   5   10:iload           5
	//*   6   12:aload_0         
	//*   7   13:getfield        #65  <Field List pathGroups>
	//*   8   16:invokeinterface #113 <Method int List.size()>
	//*   9   21:icmpge          104
		{
			PathGroup pathgroup = (PathGroup)pathGroups.get(i);
	//   10   24:aload_0         
	//   11   25:getfield        #65  <Field List pathGroups>
	//   12   28:iload           5
	//   13   30:invokeinterface #122 <Method Object List.get(int)>
	//   14   35:checkcast       #12  <Class BaseStrokeContent$PathGroup>
	//   15   38:astore          7
			for(int j = 0; j < pathgroup.paths.size(); j++)
	//*  16   40:iconst_0        
	//*  17   41:istore          6
	//*  18   43:iload           6
	//*  19   45:aload           7
	//*  20   47:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//*  21   50:invokeinterface #113 <Method int List.size()>
	//*  22   55:icmpge          95
				path.addPath(((PathContent)pathgroup.paths.get(i)).getPath(), matrix);
	//   23   58:aload_0         
	//   24   59:getfield        #53  <Field Path path>
	//   25   62:aload           7
	//   26   64:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//   27   67:iload           5
	//   28   69:invokeinterface #122 <Method Object List.get(int)>
	//   29   74:checkcast       #186 <Class PathContent>
	//   30   77:invokeinterface #190 <Method Path PathContent.getPath()>
	//   31   82:aload_2         
	//   32   83:invokevirtual   #194 <Method void Path.addPath(Path, Matrix)>

	//   33   86:iload           6
	//   34   88:iconst_1        
	//   35   89:iadd            
	//   36   90:istore          6
		}

	//   37   92:goto            43
	//   38   95:iload           5
	//   39   97:iconst_1        
	//   40   98:iadd            
	//   41   99:istore          5
	//*  42  101:goto            10
		path.computeBounds(rect, false);
	//   43  104:aload_0         
	//   44  105:getfield        #53  <Field Path path>
	//   45  108:aload_0         
	//   46  109:getfield        #60  <Field RectF rect>
	//   47  112:iconst_0        
	//   48  113:invokevirtual   #275 <Method void Path.computeBounds(RectF, boolean)>
		float f1 = ((Float)widthAnimation.getValue()).floatValue();
	//   49  116:aload_0         
	//   50  117:getfield        #105 <Field BaseKeyframeAnimation widthAnimation>
	//   51  120:invokevirtual   #156 <Method Object BaseKeyframeAnimation.getValue()>
	//   52  123:checkcast       #158 <Class Float>
	//   53  126:invokevirtual   #161 <Method float Float.floatValue()>
	//   54  129:fstore          4
		matrix = ((Matrix) (rect));
	//   55  131:aload_0         
	//   56  132:getfield        #60  <Field RectF rect>
	//   57  135:astore_2        
		float f = ((RectF) (matrix)).left;
	//   58  136:aload_2         
	//   59  137:getfield        #279 <Field float RectF.left>
	//   60  140:fstore_3        
		f1 /= 2.0F;
	//   61  141:fload           4
	//   62  143:fconst_2        
	//   63  144:fdiv            
	//   64  145:fstore          4
		((RectF) (matrix)).set(f - f1, rect.top - f1, rect.right + f1, rect.bottom + f1);
	//   65  147:aload_2         
	//   66  148:fload_3         
	//   67  149:fload           4
	//   68  151:fsub            
	//   69  152:aload_0         
	//   70  153:getfield        #60  <Field RectF rect>
	//   71  156:getfield        #282 <Field float RectF.top>
	//   72  159:fload           4
	//   73  161:fsub            
	//   74  162:aload_0         
	//   75  163:getfield        #60  <Field RectF rect>
	//   76  166:getfield        #285 <Field float RectF.right>
	//   77  169:fload           4
	//   78  171:fadd            
	//   79  172:aload_0         
	//   80  173:getfield        #60  <Field RectF rect>
	//   81  176:getfield        #288 <Field float RectF.bottom>
	//   82  179:fload           4
	//   83  181:fadd            
	//   84  182:invokevirtual   #291 <Method void RectF.set(float, float, float, float)>
		rectf.set(rect);
	//   85  185:aload_1         
	//   86  186:aload_0         
	//   87  187:getfield        #60  <Field RectF rect>
	//   88  190:invokevirtual   #294 <Method void RectF.set(RectF)>
		rectf.set(rectf.left - 1.0F, rectf.top - 1.0F, rectf.right + 1.0F, rectf.bottom + 1.0F);
	//   89  193:aload_1         
	//   90  194:aload_1         
	//   91  195:getfield        #279 <Field float RectF.left>
	//   92  198:fconst_1        
	//   93  199:fsub            
	//   94  200:aload_1         
	//   95  201:getfield        #282 <Field float RectF.top>
	//   96  204:fconst_1        
	//   97  205:fsub            
	//   98  206:aload_1         
	//   99  207:getfield        #285 <Field float RectF.right>
	//  100  210:fconst_1        
	//  101  211:fadd            
	//  102  212:aload_1         
	//  103  213:getfield        #288 <Field float RectF.bottom>
	//  104  216:fconst_1        
	//  105  217:fadd            
	//  106  218:invokevirtual   #291 <Method void RectF.set(float, float, float, float)>
	//  107  221:return          
	}

	public void onValueChanged()
	{
		lottieDrawable.invalidateSelf();
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #298 <Method void LottieDrawable.invalidateSelf()>
	//    3    7:return          
	}

	public void setContents(List list, List list1)
	{
		int i = list.size() - 1;
	//    0    0:aload_1         
	//    1    1:invokeinterface #113 <Method int List.size()>
	//    2    6:iconst_1        
	//    3    7:isub            
	//    4    8:istore_3        
		TrimPathContent trimpathcontent;
		TrimPathContent trimpathcontent1;
		for(trimpathcontent1 = null; i >= 0; trimpathcontent1 = trimpathcontent)
	//*   5    9:aconst_null     
	//*   6   10:astore          5
	//*   7   12:iload_3         
	//*   8   13:iflt            77
		{
			Object obj1 = ((Object) ((Content)list.get(i)));
	//    9   16:aload_1         
	//   10   17:iload_3         
	//   11   18:invokeinterface #122 <Method Object List.get(int)>
	//   12   23:checkcast       #302 <Class Content>
	//   13   26:astore          6
			trimpathcontent = trimpathcontent1;
	//   14   28:aload           5
	//   15   30:astore          4
			if(obj1 instanceof TrimPathContent)
	//*  16   32:aload           6
	//*  17   34:instanceof      #206 <Class TrimPathContent>
	//*  18   37:ifeq            66
			{
				obj1 = ((Object) ((TrimPathContent)obj1));
	//   19   40:aload           6
	//   20   42:checkcast       #206 <Class TrimPathContent>
	//   21   45:astore          6
				trimpathcontent = trimpathcontent1;
	//   22   47:aload           5
	//   23   49:astore          4
				if(((TrimPathContent) (obj1)).getType() == ShapeTrimPath.Type.Individually)
	//*  24   51:aload           6
	//*  25   53:invokevirtual   #306 <Method ShapeTrimPath$Type TrimPathContent.getType()>
	//*  26   56:getstatic       #312 <Field ShapeTrimPath$Type ShapeTrimPath$Type.Individually>
	//*  27   59:if_acmpne       66
					trimpathcontent = ((TrimPathContent) (obj1));
	//   28   62:aload           6
	//   29   64:astore          4
			}
			i--;
	//   30   66:iload_3         
	//   31   67:iconst_1        
	//   32   68:isub            
	//   33   69:istore_3        
		}

	//   34   70:aload           4
	//   35   72:astore          5
	//*  36   74:goto            12
		if(trimpathcontent1 != null)
	//*  37   77:aload           5
	//*  38   79:ifnull          88
			trimpathcontent1.addListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   39   82:aload           5
	//   40   84:aload_0         
	//   41   85:invokevirtual   #315 <Method void TrimPathContent.addListener(BaseKeyframeAnimation$AnimationListener)>
		i = list1.size() - 1;
	//   42   88:aload_2         
	//   43   89:invokeinterface #113 <Method int List.size()>
	//   44   94:iconst_1        
	//   45   95:isub            
	//   46   96:istore_3        
		Object obj;
		for(list = null; i >= 0; list = ((List) (obj)))
	//*  47   97:aconst_null     
	//*  48   98:astore_1        
	//*  49   99:iload_3         
	//*  50  100:iflt            233
		{
label0:
			{
				Content content = (Content)list1.get(i);
	//   51  103:aload_2         
	//   52  104:iload_3         
	//   53  105:invokeinterface #122 <Method Object List.get(int)>
	//   54  110:checkcast       #302 <Class Content>
	//   55  113:astore          6
				if(content instanceof TrimPathContent)
	//*  56  115:aload           6
	//*  57  117:instanceof      #206 <Class TrimPathContent>
	//*  58  120:ifeq            177
				{
					TrimPathContent trimpathcontent2 = (TrimPathContent)content;
	//   59  123:aload           6
	//   60  125:checkcast       #206 <Class TrimPathContent>
	//   61  128:astore          7
					if(trimpathcontent2.getType() == ShapeTrimPath.Type.Individually)
	//*  62  130:aload           7
	//*  63  132:invokevirtual   #306 <Method ShapeTrimPath$Type TrimPathContent.getType()>
	//*  64  135:getstatic       #312 <Field ShapeTrimPath$Type ShapeTrimPath$Type.Individually>
	//*  65  138:if_acmpne       177
					{
						if(list != null)
	//*  66  141:aload_1         
	//*  67  142:ifnull          156
							pathGroups.add(((Object) (list)));
	//   68  145:aload_0         
	//   69  146:getfield        #65  <Field List pathGroups>
	//   70  149:aload_1         
	//   71  150:invokeinterface #126 <Method boolean List.add(Object)>
	//   72  155:pop             
						obj = ((Object) (new PathGroup(trimpathcontent2)));
	//   73  156:new             #12  <Class BaseStrokeContent$PathGroup>
	//   74  159:dup             
	//   75  160:aload           7
	//   76  162:aconst_null     
	//   77  163:invokespecial   #318 <Method void BaseStrokeContent$PathGroup(TrimPathContent, BaseStrokeContent$1)>
	//   78  166:astore          4
						trimpathcontent2.addListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   79  168:aload           7
	//   80  170:aload_0         
	//   81  171:invokevirtual   #315 <Method void TrimPathContent.addListener(BaseKeyframeAnimation$AnimationListener)>
						break label0;
	//   82  174:goto            223
					}
				}
				obj = ((Object) (list));
	//   83  177:aload_1         
	//   84  178:astore          4
				if(content instanceof PathContent)
	//*  85  180:aload           6
	//*  86  182:instanceof      #186 <Class PathContent>
	//*  87  185:ifeq            223
				{
					obj = ((Object) (list));
	//   88  188:aload_1         
	//   89  189:astore          4
					if(list == null)
	//*  90  191:aload_1         
	//*  91  192:ifnonnull       207
						obj = ((Object) (new PathGroup(trimpathcontent1)));
	//   92  195:new             #12  <Class BaseStrokeContent$PathGroup>
	//   93  198:dup             
	//   94  199:aload           5
	//   95  201:aconst_null     
	//   96  202:invokespecial   #318 <Method void BaseStrokeContent$PathGroup(TrimPathContent, BaseStrokeContent$1)>
	//   97  205:astore          4
					((PathGroup) (obj)).paths.add(((Object) ((PathContent)content)));
	//   98  207:aload           4
	//   99  209:invokestatic    #184 <Method List BaseStrokeContent$PathGroup.access$100(BaseStrokeContent$PathGroup)>
	//  100  212:aload           6
	//  101  214:checkcast       #186 <Class PathContent>
	//  102  217:invokeinterface #126 <Method boolean List.add(Object)>
	//  103  222:pop             
				}
			}
			i--;
	//  104  223:iload_3         
	//  105  224:iconst_1        
	//  106  225:isub            
	//  107  226:istore_3        
		}

	//  108  227:aload           4
	//  109  229:astore_1        
	//* 110  230:goto            99
		if(list != null)
	//* 111  233:aload_1         
	//* 112  234:ifnull          248
			pathGroups.add(((Object) (list)));
	//  113  237:aload_0         
	//  114  238:getfield        #65  <Field List pathGroups>
	//  115  241:aload_1         
	//  116  242:invokeinterface #126 <Method boolean List.add(Object)>
	//  117  247:pop             
	//  118  248:return          
	}

	private final List dashPatternAnimations;
	private final BaseKeyframeAnimation dashPatternOffsetAnimation;
	private final float dashPatternValues[];
	private final LottieDrawable lottieDrawable;
	private final BaseKeyframeAnimation opacityAnimation;
	final Paint paint = new Paint(1);
	private final Path path = new Path();
	private final List pathGroups = new ArrayList();
	private final PathMeasure pm = new PathMeasure();
	private final RectF rect = new RectF();
	private final Path trimPathPath = new Path();
	private final BaseKeyframeAnimation widthAnimation;
}
