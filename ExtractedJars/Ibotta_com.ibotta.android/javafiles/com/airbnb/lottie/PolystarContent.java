// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			PathContent, PolystarShape, AnimatableFloatValue, AnimatableValue, 
//			BaseLayer, BaseKeyframeAnimation, LottieDrawable, Utils, 
//			Content, TrimPathContent

class PolystarContent
	implements BaseKeyframeAnimation.AnimationListener, PathContent
{

	PolystarContent(LottieDrawable lottiedrawable, BaseLayer baselayer, PolystarShape polystarshape)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #40  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #41  <Method void Path()>
	//    6   12:putfield        #43  <Field Path path>
		lottieDrawable = lottiedrawable;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #45  <Field LottieDrawable lottieDrawable>
		name = polystarshape.getName();
	//   10   20:aload_0         
	//   11   21:aload_3         
	//   12   22:invokevirtual   #51  <Method String PolystarShape.getName()>
	//   13   25:putfield        #53  <Field String name>
		type = polystarshape.getType();
	//   14   28:aload_0         
	//   15   29:aload_3         
	//   16   30:invokevirtual   #57  <Method PolystarShape$Type PolystarShape.getType()>
	//   17   33:putfield        #59  <Field PolystarShape$Type type>
		pointsAnimation = ((BaseKeyframeAnimation) (polystarshape.getPoints().createAnimation()));
	//   18   36:aload_0         
	//   19   37:aload_3         
	//   20   38:invokevirtual   #63  <Method AnimatableFloatValue PolystarShape.getPoints()>
	//   21   41:invokevirtual   #69  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   22   44:putfield        #71  <Field BaseKeyframeAnimation pointsAnimation>
		positionAnimation = polystarshape.getPosition().createAnimation();
	//   23   47:aload_0         
	//   24   48:aload_3         
	//   25   49:invokevirtual   #75  <Method AnimatableValue PolystarShape.getPosition()>
	//   26   52:invokeinterface #80  <Method BaseKeyframeAnimation AnimatableValue.createAnimation()>
	//   27   57:putfield        #82  <Field BaseKeyframeAnimation positionAnimation>
		rotationAnimation = ((BaseKeyframeAnimation) (polystarshape.getRotation().createAnimation()));
	//   28   60:aload_0         
	//   29   61:aload_3         
	//   30   62:invokevirtual   #85  <Method AnimatableFloatValue PolystarShape.getRotation()>
	//   31   65:invokevirtual   #69  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   32   68:putfield        #87  <Field BaseKeyframeAnimation rotationAnimation>
		outerRadiusAnimation = ((BaseKeyframeAnimation) (polystarshape.getOuterRadius().createAnimation()));
	//   33   71:aload_0         
	//   34   72:aload_3         
	//   35   73:invokevirtual   #90  <Method AnimatableFloatValue PolystarShape.getOuterRadius()>
	//   36   76:invokevirtual   #69  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   37   79:putfield        #92  <Field BaseKeyframeAnimation outerRadiusAnimation>
		outerRoundednessAnimation = ((BaseKeyframeAnimation) (polystarshape.getOuterRoundedness().createAnimation()));
	//   38   82:aload_0         
	//   39   83:aload_3         
	//   40   84:invokevirtual   #95  <Method AnimatableFloatValue PolystarShape.getOuterRoundedness()>
	//   41   87:invokevirtual   #69  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   42   90:putfield        #97  <Field BaseKeyframeAnimation outerRoundednessAnimation>
		if(type == PolystarShape.Type.Star)
	//*  43   93:aload_0         
	//*  44   94:getfield        #59  <Field PolystarShape$Type type>
	//*  45   97:getstatic       #102 <Field PolystarShape$Type PolystarShape$Type.Star>
	//*  46  100:if_acmpne       128
		{
			innerRadiusAnimation = ((BaseKeyframeAnimation) (polystarshape.getInnerRadius().createAnimation()));
	//   47  103:aload_0         
	//   48  104:aload_3         
	//   49  105:invokevirtual   #105 <Method AnimatableFloatValue PolystarShape.getInnerRadius()>
	//   50  108:invokevirtual   #69  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   51  111:putfield        #107 <Field BaseKeyframeAnimation innerRadiusAnimation>
			innerRoundednessAnimation = ((BaseKeyframeAnimation) (polystarshape.getInnerRoundedness().createAnimation()));
	//   52  114:aload_0         
	//   53  115:aload_3         
	//   54  116:invokevirtual   #110 <Method AnimatableFloatValue PolystarShape.getInnerRoundedness()>
	//   55  119:invokevirtual   #69  <Method KeyframeAnimation AnimatableFloatValue.createAnimation()>
	//   56  122:putfield        #112 <Field BaseKeyframeAnimation innerRoundednessAnimation>
		} else
	//*  57  125:goto            138
		{
			innerRadiusAnimation = null;
	//   58  128:aload_0         
	//   59  129:aconst_null     
	//   60  130:putfield        #107 <Field BaseKeyframeAnimation innerRadiusAnimation>
			innerRoundednessAnimation = null;
	//   61  133:aload_0         
	//   62  134:aconst_null     
	//   63  135:putfield        #112 <Field BaseKeyframeAnimation innerRoundednessAnimation>
		}
		baselayer.addAnimation(pointsAnimation);
	//   64  138:aload_2         
	//   65  139:aload_0         
	//   66  140:getfield        #71  <Field BaseKeyframeAnimation pointsAnimation>
	//   67  143:invokevirtual   #118 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(positionAnimation);
	//   68  146:aload_2         
	//   69  147:aload_0         
	//   70  148:getfield        #82  <Field BaseKeyframeAnimation positionAnimation>
	//   71  151:invokevirtual   #118 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(rotationAnimation);
	//   72  154:aload_2         
	//   73  155:aload_0         
	//   74  156:getfield        #87  <Field BaseKeyframeAnimation rotationAnimation>
	//   75  159:invokevirtual   #118 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(outerRadiusAnimation);
	//   76  162:aload_2         
	//   77  163:aload_0         
	//   78  164:getfield        #92  <Field BaseKeyframeAnimation outerRadiusAnimation>
	//   79  167:invokevirtual   #118 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		baselayer.addAnimation(outerRoundednessAnimation);
	//   80  170:aload_2         
	//   81  171:aload_0         
	//   82  172:getfield        #97  <Field BaseKeyframeAnimation outerRoundednessAnimation>
	//   83  175:invokevirtual   #118 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		if(type == PolystarShape.Type.Star)
	//*  84  178:aload_0         
	//*  85  179:getfield        #59  <Field PolystarShape$Type type>
	//*  86  182:getstatic       #102 <Field PolystarShape$Type PolystarShape$Type.Star>
	//*  87  185:if_acmpne       204
		{
			baselayer.addAnimation(innerRadiusAnimation);
	//   88  188:aload_2         
	//   89  189:aload_0         
	//   90  190:getfield        #107 <Field BaseKeyframeAnimation innerRadiusAnimation>
	//   91  193:invokevirtual   #118 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
			baselayer.addAnimation(innerRoundednessAnimation);
	//   92  196:aload_2         
	//   93  197:aload_0         
	//   94  198:getfield        #112 <Field BaseKeyframeAnimation innerRoundednessAnimation>
	//   95  201:invokevirtual   #118 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		}
		pointsAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   96  204:aload_0         
	//   97  205:getfield        #71  <Field BaseKeyframeAnimation pointsAnimation>
	//   98  208:aload_0         
	//   99  209:invokevirtual   #124 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		positionAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  100  212:aload_0         
	//  101  213:getfield        #82  <Field BaseKeyframeAnimation positionAnimation>
	//  102  216:aload_0         
	//  103  217:invokevirtual   #124 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		rotationAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  104  220:aload_0         
	//  105  221:getfield        #87  <Field BaseKeyframeAnimation rotationAnimation>
	//  106  224:aload_0         
	//  107  225:invokevirtual   #124 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		outerRadiusAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  108  228:aload_0         
	//  109  229:getfield        #92  <Field BaseKeyframeAnimation outerRadiusAnimation>
	//  110  232:aload_0         
	//  111  233:invokevirtual   #124 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		outerRoundednessAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  112  236:aload_0         
	//  113  237:getfield        #97  <Field BaseKeyframeAnimation outerRoundednessAnimation>
	//  114  240:aload_0         
	//  115  241:invokevirtual   #124 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		if(type == PolystarShape.Type.Star)
	//* 116  244:aload_0         
	//* 117  245:getfield        #59  <Field PolystarShape$Type type>
	//* 118  248:getstatic       #102 <Field PolystarShape$Type PolystarShape$Type.Star>
	//* 119  251:if_acmpne       270
		{
			outerRadiusAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  120  254:aload_0         
	//  121  255:getfield        #92  <Field BaseKeyframeAnimation outerRadiusAnimation>
	//  122  258:aload_0         
	//  123  259:invokevirtual   #124 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
			outerRoundednessAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  124  262:aload_0         
	//  125  263:getfield        #97  <Field BaseKeyframeAnimation outerRoundednessAnimation>
	//  126  266:aload_0         
	//  127  267:invokevirtual   #124 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		}
	//  128  270:return          
	}

	private void createPolygonPath()
	{
		int i = (int)Math.floor(((Float)pointsAnimation.getValue()).floatValue());
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field BaseKeyframeAnimation pointsAnimation>
	//    2    4:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//    3    7:checkcast       #132 <Class Float>
	//    4   10:invokevirtual   #136 <Method float Float.floatValue()>
	//    5   13:f2d             
	//    6   14:invokestatic    #142 <Method double Math.floor(double)>
	//    7   17:d2i             
	//    8   18:istore          22
		Object obj = ((Object) (rotationAnimation));
	//    9   20:aload_0         
	//   10   21:getfield        #87  <Field BaseKeyframeAnimation rotationAnimation>
	//   11   24:astore          23
		double d;
		if(obj == null)
	//*  12   26:aload           23
	//*  13   28:ifnonnull       36
			d = 0.0D;
	//   14   31:dconst_0        
	//   15   32:dstore_1        
		else
	//*  16   33:goto            49
			d = ((Float)((BaseKeyframeAnimation) (obj)).getValue()).floatValue();
	//   17   36:aload           23
	//   18   38:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//   19   41:checkcast       #132 <Class Float>
	//   20   44:invokevirtual   #136 <Method float Float.floatValue()>
	//   21   47:f2d             
	//   22   48:dstore_1        
		double d3 = Math.toRadians(d - 90D);
	//   23   49:dload_1         
	//   24   50:ldc2w           #143 <Double 90D>
	//   25   53:dsub            
	//   26   54:invokestatic    #147 <Method double Math.toRadians(double)>
	//   27   57:dstore          7
		double d2 = i;
	//   28   59:iload           22
	//   29   61:i2d             
	//   30   62:dstore          5
		float f2 = (float)(6.2831853071795862D / d2);
	//   31   64:ldc2w           #148 <Double 6.2831853071795862D>
	//   32   67:dload           5
	//   33   69:ddiv            
	//   34   70:d2f             
	//   35   71:fstore          13
		float f5 = ((Float)outerRoundednessAnimation.getValue()).floatValue() / 100F;
	//   36   73:aload_0         
	//   37   74:getfield        #97  <Field BaseKeyframeAnimation outerRoundednessAnimation>
	//   38   77:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//   39   80:checkcast       #132 <Class Float>
	//   40   83:invokevirtual   #136 <Method float Float.floatValue()>
	//   41   86:ldc1            #150 <Float 100F>
	//   42   88:fdiv            
	//   43   89:fstore          15
		float f6 = ((Float)outerRadiusAnimation.getValue()).floatValue();
	//   44   91:aload_0         
	//   45   92:getfield        #92  <Field BaseKeyframeAnimation outerRadiusAnimation>
	//   46   95:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//   47   98:checkcast       #132 <Class Float>
	//   48  101:invokevirtual   #136 <Method float Float.floatValue()>
	//   49  104:fstore          16
		double d1 = f6;
	//   50  106:fload           16
	//   51  108:f2d             
	//   52  109:dstore_3        
		float f = (float)(Math.cos(d3) * d1);
	//   53  110:dload           7
	//   54  112:invokestatic    #153 <Method double Math.cos(double)>
	//   55  115:dload_3         
	//   56  116:dmul            
	//   57  117:d2f             
	//   58  118:fstore          11
		float f1 = (float)(Math.sin(d3) * d1);
	//   59  120:dload           7
	//   60  122:invokestatic    #156 <Method double Math.sin(double)>
	//   61  125:dload_3         
	//   62  126:dmul            
	//   63  127:d2f             
	//   64  128:fstore          12
		path.moveTo(f, f1);
	//   65  130:aload_0         
	//   66  131:getfield        #43  <Field Path path>
	//   67  134:fload           11
	//   68  136:fload           12
	//   69  138:invokevirtual   #160 <Method void Path.moveTo(float, float)>
		d = f2;
	//   70  141:fload           13
	//   71  143:f2d             
	//   72  144:dstore_1        
		d3 += d;
	//   73  145:dload           7
	//   74  147:dload_1         
	//   75  148:dadd            
	//   76  149:dstore          7
		d2 = Math.ceil(d2);
	//   77  151:dload           5
	//   78  153:invokestatic    #163 <Method double Math.ceil(double)>
	//   79  156:dstore          5
		for(int j = 0; (double)j < d2;)
	//*  80  158:iconst_0        
	//*  81  159:istore          22
	//*  82  161:iload           22
	//*  83  163:i2d             
	//*  84  164:dload           5
	//*  85  166:dcmpg           
	//*  86  167:ifge            353
		{
			float f3 = (float)(Math.cos(d3) * d1);
	//   87  170:dload           7
	//   88  172:invokestatic    #153 <Method double Math.cos(double)>
	//   89  175:dload_3         
	//   90  176:dmul            
	//   91  177:d2f             
	//   92  178:fstore          13
			float f4 = (float)(d1 * Math.sin(d3));
	//   93  180:dload_3         
	//   94  181:dload           7
	//   95  183:invokestatic    #156 <Method double Math.sin(double)>
	//   96  186:dmul            
	//   97  187:d2f             
	//   98  188:fstore          14
			if(f5 != 0.0F)
	//*  99  190:fload           15
	//* 100  192:fconst_0        
	//* 101  193:fcmpl           
	//* 102  194:ifeq            319
			{
				double d4 = (float)(Math.atan2(f1, f) - 1.5707963267948966D);
	//  103  197:fload           12
	//  104  199:f2d             
	//  105  200:fload           11
	//  106  202:f2d             
	//  107  203:invokestatic    #167 <Method double Math.atan2(double, double)>
	//  108  206:ldc2w           #168 <Double 1.5707963267948966D>
	//  109  209:dsub            
	//  110  210:d2f             
	//  111  211:f2d             
	//  112  212:dstore          9
				float f7 = (float)Math.cos(d4);
	//  113  214:dload           9
	//  114  216:invokestatic    #153 <Method double Math.cos(double)>
	//  115  219:d2f             
	//  116  220:fstore          17
				float f8 = (float)Math.sin(d4);
	//  117  222:dload           9
	//  118  224:invokestatic    #156 <Method double Math.sin(double)>
	//  119  227:d2f             
	//  120  228:fstore          18
				d4 = (float)(Math.atan2(f4, f3) - 1.5707963267948966D);
	//  121  230:fload           14
	//  122  232:f2d             
	//  123  233:fload           13
	//  124  235:f2d             
	//  125  236:invokestatic    #167 <Method double Math.atan2(double, double)>
	//  126  239:ldc2w           #168 <Double 1.5707963267948966D>
	//  127  242:dsub            
	//  128  243:d2f             
	//  129  244:f2d             
	//  130  245:dstore          9
				float f9 = (float)Math.cos(d4);
	//  131  247:dload           9
	//  132  249:invokestatic    #153 <Method double Math.cos(double)>
	//  133  252:d2f             
	//  134  253:fstore          19
				float f10 = (float)Math.sin(d4);
	//  135  255:dload           9
	//  136  257:invokestatic    #156 <Method double Math.sin(double)>
	//  137  260:d2f             
	//  138  261:fstore          20
				float f11 = f6 * f5 * 0.25F;
	//  139  263:fload           16
	//  140  265:fload           15
	//  141  267:fmul            
	//  142  268:ldc1            #170 <Float 0.25F>
	//  143  270:fmul            
	//  144  271:fstore          21
				path.cubicTo(f - f7 * f11, f1 - f8 * f11, f3 + f9 * f11, f4 + f11 * f10, f3, f4);
	//  145  273:aload_0         
	//  146  274:getfield        #43  <Field Path path>
	//  147  277:fload           11
	//  148  279:fload           17
	//  149  281:fload           21
	//  150  283:fmul            
	//  151  284:fsub            
	//  152  285:fload           12
	//  153  287:fload           18
	//  154  289:fload           21
	//  155  291:fmul            
	//  156  292:fsub            
	//  157  293:fload           13
	//  158  295:fload           19
	//  159  297:fload           21
	//  160  299:fmul            
	//  161  300:fadd            
	//  162  301:fload           14
	//  163  303:fload           21
	//  164  305:fload           20
	//  165  307:fmul            
	//  166  308:fadd            
	//  167  309:fload           13
	//  168  311:fload           14
	//  169  313:invokevirtual   #174 <Method void Path.cubicTo(float, float, float, float, float, float)>
			} else
	//* 170  316:goto            330
			{
				path.lineTo(f3, f4);
	//  171  319:aload_0         
	//  172  320:getfield        #43  <Field Path path>
	//  173  323:fload           13
	//  174  325:fload           14
	//  175  327:invokevirtual   #177 <Method void Path.lineTo(float, float)>
			}
			d3 += d;
	//  176  330:dload           7
	//  177  332:dload_1         
	//  178  333:dadd            
	//  179  334:dstore          7
			j++;
	//  180  336:iload           22
	//  181  338:iconst_1        
	//  182  339:iadd            
	//  183  340:istore          22
			f1 = f4;
	//  184  342:fload           14
	//  185  344:fstore          12
			f = f3;
	//  186  346:fload           13
	//  187  348:fstore          11
		}

	//* 188  350:goto            161
		obj = ((Object) ((PointF)positionAnimation.getValue()));
	//  189  353:aload_0         
	//  190  354:getfield        #82  <Field BaseKeyframeAnimation positionAnimation>
	//  191  357:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//  192  360:checkcast       #179 <Class PointF>
	//  193  363:astore          23
		path.offset(((PointF) (obj)).x, ((PointF) (obj)).y);
	//  194  365:aload_0         
	//  195  366:getfield        #43  <Field Path path>
	//  196  369:aload           23
	//  197  371:getfield        #183 <Field float PointF.x>
	//  198  374:aload           23
	//  199  376:getfield        #186 <Field float PointF.y>
	//  200  379:invokevirtual   #189 <Method void Path.offset(float, float)>
		path.close();
	//  201  382:aload_0         
	//  202  383:getfield        #43  <Field Path path>
	//  203  386:invokevirtual   #192 <Method void Path.close()>
	//  204  389:return          
	}

	private void createStarPath()
	{
		float f = ((Float)pointsAnimation.getValue()).floatValue();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field BaseKeyframeAnimation pointsAnimation>
	//    2    4:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//    3    7:checkcast       #132 <Class Float>
	//    4   10:invokevirtual   #136 <Method float Float.floatValue()>
	//    5   13:fstore          9
		BaseKeyframeAnimation basekeyframeanimation = rotationAnimation;
	//    6   15:aload_0         
	//    7   16:getfield        #87  <Field BaseKeyframeAnimation rotationAnimation>
	//    8   19:astore          35
		double d;
		if(basekeyframeanimation == null)
	//*   9   21:aload           35
	//*  10   23:ifnonnull       31
			d = 0.0D;
	//   11   26:dconst_0        
	//   12   27:dstore_1        
		else
	//*  13   28:goto            44
			d = ((Float)basekeyframeanimation.getValue()).floatValue();
	//   14   31:aload           35
	//   15   33:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//   16   36:checkcast       #132 <Class Float>
	//   17   39:invokevirtual   #136 <Method float Float.floatValue()>
	//   18   42:f2d             
	//   19   43:dstore_1        
		double d1 = Math.toRadians(d - 90D);
	//   20   44:dload_1         
	//   21   45:ldc2w           #143 <Double 90D>
	//   22   48:dsub            
	//   23   49:invokestatic    #147 <Method double Math.toRadians(double)>
	//   24   52:dstore_3        
		double d2 = f;
	//   25   53:fload           9
	//   26   55:f2d             
	//   27   56:dstore          5
		float f12 = (float)(6.2831853071795862D / d2);
	//   28   58:ldc2w           #148 <Double 6.2831853071795862D>
	//   29   61:dload           5
	//   30   63:ddiv            
	//   31   64:d2f             
	//   32   65:fstore          17
		float f9 = f12 / 2.0F;
	//   33   67:fload           17
	//   34   69:fconst_2        
	//   35   70:fdiv            
	//   36   71:fstore          16
		float f25 = f - (float)(int)f;
	//   37   73:fload           9
	//   38   75:fload           9
	//   39   77:f2i             
	//   40   78:i2f             
	//   41   79:fsub            
	//   42   80:fstore          30
		int j = f25 != 0.0F;
	//   43   82:fload           30
	//   44   84:fconst_0        
	//   45   85:fcmpl           
	//   46   86:istore          33
		d = d1;
	//   47   88:dload_3         
	//   48   89:dstore_1        
		if(j != 0)
	//*  49   90:iload           33
	//*  50   92:ifeq            106
			d = d1 + (double)((1.0F - f25) * f9);
	//   51   95:dload_3         
	//   52   96:fconst_1        
	//   53   97:fload           30
	//   54   99:fsub            
	//   55  100:fload           16
	//   56  102:fmul            
	//   57  103:f2d             
	//   58  104:dadd            
	//   59  105:dstore_1        
		float f1 = ((Float)outerRadiusAnimation.getValue()).floatValue();
	//   60  106:aload_0         
	//   61  107:getfield        #92  <Field BaseKeyframeAnimation outerRadiusAnimation>
	//   62  110:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//   63  113:checkcast       #132 <Class Float>
	//   64  116:invokevirtual   #136 <Method float Float.floatValue()>
	//   65  119:fstore          10
		f = ((Float)innerRadiusAnimation.getValue()).floatValue();
	//   66  121:aload_0         
	//   67  122:getfield        #107 <Field BaseKeyframeAnimation innerRadiusAnimation>
	//   68  125:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//   69  128:checkcast       #132 <Class Float>
	//   70  131:invokevirtual   #136 <Method float Float.floatValue()>
	//   71  134:fstore          9
		basekeyframeanimation = innerRoundednessAnimation;
	//   72  136:aload_0         
	//   73  137:getfield        #112 <Field BaseKeyframeAnimation innerRoundednessAnimation>
	//   74  140:astore          35
		float f3;
		if(basekeyframeanimation != null)
	//*  75  142:aload           35
	//*  76  144:ifnull          166
			f3 = ((Float)basekeyframeanimation.getValue()).floatValue() / 100F;
	//   77  147:aload           35
	//   78  149:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//   79  152:checkcast       #132 <Class Float>
	//   80  155:invokevirtual   #136 <Method float Float.floatValue()>
	//   81  158:ldc1            #150 <Float 100F>
	//   82  160:fdiv            
	//   83  161:fstore          12
		else
	//*  84  163:goto            169
			f3 = 0.0F;
	//   85  166:fconst_0        
	//   86  167:fstore          12
		basekeyframeanimation = outerRoundednessAnimation;
	//   87  169:aload_0         
	//   88  170:getfield        #97  <Field BaseKeyframeAnimation outerRoundednessAnimation>
	//   89  173:astore          35
		float f2;
		if(basekeyframeanimation != null)
	//*  90  175:aload           35
	//*  91  177:ifnull          199
			f2 = ((Float)basekeyframeanimation.getValue()).floatValue() / 100F;
	//   92  180:aload           35
	//   93  182:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//   94  185:checkcast       #132 <Class Float>
	//   95  188:invokevirtual   #136 <Method float Float.floatValue()>
	//   96  191:ldc1            #150 <Float 100F>
	//   97  193:fdiv            
	//   98  194:fstore          11
		else
	//*  99  196:goto            202
			f2 = 0.0F;
	//  100  199:fconst_0        
	//  101  200:fstore          11
		float f4;
		float f5;
		float f6;
		if(j != 0)
	//* 102  202:iload           33
	//* 103  204:ifeq            267
		{
			f4 = (f1 - f) * f25 + f;
	//  104  207:fload           10
	//  105  209:fload           9
	//  106  211:fsub            
	//  107  212:fload           30
	//  108  214:fmul            
	//  109  215:fload           9
	//  110  217:fadd            
	//  111  218:fstore          13
			d1 = f4;
	//  112  220:fload           13
	//  113  222:f2d             
	//  114  223:dstore_3        
			f5 = (float)(d1 * Math.cos(d));
	//  115  224:dload_3         
	//  116  225:dload_1         
	//  117  226:invokestatic    #153 <Method double Math.cos(double)>
	//  118  229:dmul            
	//  119  230:d2f             
	//  120  231:fstore          14
			f6 = (float)(d1 * Math.sin(d));
	//  121  233:dload_3         
	//  122  234:dload_1         
	//  123  235:invokestatic    #156 <Method double Math.sin(double)>
	//  124  238:dmul            
	//  125  239:d2f             
	//  126  240:fstore          15
			path.moveTo(f5, f6);
	//  127  242:aload_0         
	//  128  243:getfield        #43  <Field Path path>
	//  129  246:fload           14
	//  130  248:fload           15
	//  131  250:invokevirtual   #160 <Method void Path.moveTo(float, float)>
			d += (f12 * f25) / 2.0F;
	//  132  253:dload_1         
	//  133  254:fload           17
	//  134  256:fload           30
	//  135  258:fmul            
	//  136  259:fconst_2        
	//  137  260:fdiv            
	//  138  261:f2d             
	//  139  262:dadd            
	//  140  263:dstore_1        
		} else
	//* 141  264:goto            309
		{
			d1 = f1;
	//  142  267:fload           10
	//  143  269:f2d             
	//  144  270:dstore_3        
			f5 = (float)(Math.cos(d) * d1);
	//  145  271:dload_1         
	//  146  272:invokestatic    #153 <Method double Math.cos(double)>
	//  147  275:dload_3         
	//  148  276:dmul            
	//  149  277:d2f             
	//  150  278:fstore          14
			f6 = (float)(d1 * Math.sin(d));
	//  151  280:dload_3         
	//  152  281:dload_1         
	//  153  282:invokestatic    #156 <Method double Math.sin(double)>
	//  154  285:dmul            
	//  155  286:d2f             
	//  156  287:fstore          15
			path.moveTo(f5, f6);
	//  157  289:aload_0         
	//  158  290:getfield        #43  <Field Path path>
	//  159  293:fload           14
	//  160  295:fload           15
	//  161  297:invokevirtual   #160 <Method void Path.moveTo(float, float)>
			d += f9;
	//  162  300:dload_1         
	//  163  301:fload           16
	//  164  303:f2d             
	//  165  304:dadd            
	//  166  305:dstore_1        
			f4 = 0.0F;
	//  167  306:fconst_0        
	//  168  307:fstore          13
		}
		d1 = Math.ceil(d2) * 2D;
	//  169  309:dload           5
	//  170  311:invokestatic    #163 <Method double Math.ceil(double)>
	//  171  314:ldc2w           #194 <Double 2D>
	//  172  317:dmul            
	//  173  318:dstore_3        
		boolean flag = false;
	//  174  319:iconst_0        
	//  175  320:istore          32
		int i = 0;
	//  176  322:iconst_0        
	//  177  323:istore          31
		float f14 = f6;
	//  178  325:fload           15
	//  179  327:fstore          19
		float f13 = f5;
	//  180  329:fload           14
	//  181  331:fstore          18
		f5 = f9;
	//  182  333:fload           16
	//  183  335:fstore          14
		do
		{
			double d3 = i;
	//  184  337:iload           31
	//  185  339:i2d             
	//  186  340:dstore          5
			if(d3 < d1)
	//* 187  342:dload           5
	//* 188  344:dload_3         
	//* 189  345:dcmpg           
	//* 190  346:ifge            833
			{
				float f7;
				if(flag)
	//* 191  349:iload           32
	//* 192  351:ifeq            361
					f7 = f1;
	//  193  354:fload           10
	//  194  356:fstore          15
				else
	//* 195  358:goto            365
					f7 = f;
	//  196  361:fload           9
	//  197  363:fstore          15
				int k = f4 != 0.0F;
	//  198  365:fload           13
	//  199  367:fconst_0        
	//  200  368:fcmpl           
	//  201  369:istore          34
				float f10;
				if(k != 0 && d3 == d1 - 2D)
	//* 202  371:iload           34
	//* 203  373:ifeq            399
	//* 204  376:dload           5
	//* 205  378:dload_3         
	//* 206  379:ldc2w           #194 <Double 2D>
	//* 207  382:dsub            
	//* 208  383:dcmpl           
	//* 209  384:ifne            399
					f10 = (f12 * f25) / 2.0F;
	//  210  387:fload           17
	//  211  389:fload           30
	//  212  391:fmul            
	//  213  392:fconst_2        
	//  214  393:fdiv            
	//  215  394:fstore          16
				else
	//* 216  396:goto            403
					f10 = f5;
	//  217  399:fload           14
	//  218  401:fstore          16
				float f18 = f10;
	//  219  403:fload           16
	//  220  405:fstore          23
				if(k != 0 && d3 == d1 - 1.0D)
	//* 221  407:iload           34
	//* 222  409:ifeq            428
	//* 223  412:dload           5
	//* 224  414:dload_3         
	//* 225  415:dconst_1        
	//* 226  416:dsub            
	//* 227  417:dcmpl           
	//* 228  418:ifne            428
					f7 = f4;
	//  229  421:fload           13
	//  230  423:fstore          15
	//* 231  425:goto            428
				double d4 = f7;
	//  232  428:fload           15
	//  233  430:f2d             
	//  234  431:dstore          7
				float f19 = (float)(d4 * Math.cos(d));
	//  235  433:dload           7
	//  236  435:dload_1         
	//  237  436:invokestatic    #153 <Method double Math.cos(double)>
	//  238  439:dmul            
	//  239  440:d2f             
	//  240  441:fstore          24
				float f15 = (float)(d4 * Math.sin(d));
	//  241  443:dload           7
	//  242  445:dload_1         
	//  243  446:invokestatic    #156 <Method double Math.sin(double)>
	//  244  449:dmul            
	//  245  450:d2f             
	//  246  451:fstore          20
				if(f3 == 0.0F && f2 == 0.0F)
	//* 247  453:fload           12
	//* 248  455:fconst_0        
	//* 249  456:fcmpl           
	//* 250  457:ifne            481
	//* 251  460:fload           11
	//* 252  462:fconst_0        
	//* 253  463:fcmpl           
	//* 254  464:ifne            481
				{
					path.lineTo(f19, f15);
	//  255  467:aload_0         
	//  256  468:getfield        #43  <Field Path path>
	//  257  471:fload           24
	//  258  473:fload           20
	//  259  475:invokevirtual   #177 <Method void Path.lineTo(float, float)>
				} else
	//* 260  478:goto            804
				{
					double d5 = f14;
	//  261  481:fload           19
	//  262  483:f2d             
	//  263  484:dstore          7
					float f8 = f3;
	//  264  486:fload           12
	//  265  488:fstore          15
					float f11 = f2;
	//  266  490:fload           11
	//  267  492:fstore          16
					d5 = (float)(Math.atan2(d5, f13) - 1.5707963267948966D);
	//  268  494:dload           7
	//  269  496:fload           18
	//  270  498:f2d             
	//  271  499:invokestatic    #167 <Method double Math.atan2(double, double)>
	//  272  502:ldc2w           #168 <Double 1.5707963267948966D>
	//  273  505:dsub            
	//  274  506:d2f             
	//  275  507:f2d             
	//  276  508:dstore          7
					float f21 = (float)Math.cos(d5);
	//  277  510:dload           7
	//  278  512:invokestatic    #153 <Method double Math.cos(double)>
	//  279  515:d2f             
	//  280  516:fstore          26
					float f22 = (float)Math.sin(d5);
	//  281  518:dload           7
	//  282  520:invokestatic    #156 <Method double Math.sin(double)>
	//  283  523:d2f             
	//  284  524:fstore          27
					d5 = f15;
	//  285  526:fload           20
	//  286  528:f2d             
	//  287  529:dstore          7
					float f20 = f15;
	//  288  531:fload           20
	//  289  533:fstore          25
					d5 = (float)(Math.atan2(d5, f19) - 1.5707963267948966D);
	//  290  535:dload           7
	//  291  537:fload           24
	//  292  539:f2d             
	//  293  540:invokestatic    #167 <Method double Math.atan2(double, double)>
	//  294  543:ldc2w           #168 <Double 1.5707963267948966D>
	//  295  546:dsub            
	//  296  547:d2f             
	//  297  548:f2d             
	//  298  549:dstore          7
					float f23 = (float)Math.cos(d5);
	//  299  551:dload           7
	//  300  553:invokestatic    #153 <Method double Math.cos(double)>
	//  301  556:d2f             
	//  302  557:fstore          28
					float f24 = (float)Math.sin(d5);
	//  303  559:dload           7
	//  304  561:invokestatic    #156 <Method double Math.sin(double)>
	//  305  564:d2f             
	//  306  565:fstore          29
					float f16;
					if(flag)
	//* 307  567:iload           32
	//* 308  569:ifeq            579
						f16 = f8;
	//  309  572:fload           15
	//  310  574:fstore          21
					else
	//* 311  576:goto            583
						f16 = f11;
	//  312  579:fload           16
	//  313  581:fstore          21
					if(flag)
	//* 314  583:iload           32
	//* 315  585:ifeq            595
						f8 = f11;
	//  316  588:fload           16
	//  317  590:fstore          15
	//* 318  592:goto            595
					float f17;
					if(flag)
	//* 319  595:iload           32
	//* 320  597:ifeq            607
						f17 = f;
	//  321  600:fload           9
	//  322  602:fstore          22
					else
	//* 323  604:goto            611
						f17 = f1;
	//  324  607:fload           10
	//  325  609:fstore          22
					if(flag)
	//* 326  611:iload           32
	//* 327  613:ifeq            623
						f11 = f1;
	//  328  616:fload           10
	//  329  618:fstore          16
					else
	//* 330  620:goto            627
						f11 = f;
	//  331  623:fload           9
	//  332  625:fstore          16
					f16 = f17 * f16 * 0.47829F;
	//  333  627:fload           22
	//  334  629:fload           21
	//  335  631:fmul            
	//  336  632:ldc1            #196 <Float 0.47829F>
	//  337  634:fmul            
	//  338  635:fstore          21
					f21 *= f16;
	//  339  637:fload           26
	//  340  639:fload           21
	//  341  641:fmul            
	//  342  642:fstore          26
					f22 = f16 * f22;
	//  343  644:fload           21
	//  344  646:fload           27
	//  345  648:fmul            
	//  346  649:fstore          27
					f8 = f11 * f8 * 0.47829F;
	//  347  651:fload           16
	//  348  653:fload           15
	//  349  655:fmul            
	//  350  656:ldc1            #196 <Float 0.47829F>
	//  351  658:fmul            
	//  352  659:fstore          15
					f23 *= f8;
	//  353  661:fload           28
	//  354  663:fload           15
	//  355  665:fmul            
	//  356  666:fstore          28
					f24 = f8 * f24;
	//  357  668:fload           15
	//  358  670:fload           29
	//  359  672:fmul            
	//  360  673:fstore          29
					f8 = f21;
	//  361  675:fload           26
	//  362  677:fstore          15
					f11 = f23;
	//  363  679:fload           28
	//  364  681:fstore          16
					f16 = f22;
	//  365  683:fload           27
	//  366  685:fstore          21
					f17 = f24;
	//  367  687:fload           29
	//  368  689:fstore          22
					if(j != 0)
	//* 369  691:iload           33
	//* 370  693:ifeq            773
						if(i == 0)
	//* 371  696:iload           31
	//* 372  698:ifne            726
						{
							f8 = f21 * f25;
	//  373  701:fload           26
	//  374  703:fload           30
	//  375  705:fmul            
	//  376  706:fstore          15
							f16 = f22 * f25;
	//  377  708:fload           27
	//  378  710:fload           30
	//  379  712:fmul            
	//  380  713:fstore          21
							f11 = f23;
	//  381  715:fload           28
	//  382  717:fstore          16
							f17 = f24;
	//  383  719:fload           29
	//  384  721:fstore          22
						} else
	//* 385  723:goto            773
						{
							f8 = f21;
	//  386  726:fload           26
	//  387  728:fstore          15
							f11 = f23;
	//  388  730:fload           28
	//  389  732:fstore          16
							f16 = f22;
	//  390  734:fload           27
	//  391  736:fstore          21
							f17 = f24;
	//  392  738:fload           29
	//  393  740:fstore          22
							if(d3 == d1 - 1.0D)
	//* 394  742:dload           5
	//* 395  744:dload_3         
	//* 396  745:dconst_1        
	//* 397  746:dsub            
	//* 398  747:dcmpl           
	//* 399  748:ifne            773
							{
								f11 = f23 * f25;
	//  400  751:fload           28
	//  401  753:fload           30
	//  402  755:fmul            
	//  403  756:fstore          16
								f17 = f24 * f25;
	//  404  758:fload           29
	//  405  760:fload           30
	//  406  762:fmul            
	//  407  763:fstore          22
								f16 = f22;
	//  408  765:fload           27
	//  409  767:fstore          21
								f8 = f21;
	//  410  769:fload           26
	//  411  771:fstore          15
							}
						}
					path.cubicTo(f13 - f8, f14 - f16, f19 + f11, f20 + f17, f19, f20);
	//  412  773:aload_0         
	//  413  774:getfield        #43  <Field Path path>
	//  414  777:fload           18
	//  415  779:fload           15
	//  416  781:fsub            
	//  417  782:fload           19
	//  418  784:fload           21
	//  419  786:fsub            
	//  420  787:fload           24
	//  421  789:fload           16
	//  422  791:fadd            
	//  423  792:fload           25
	//  424  794:fload           22
	//  425  796:fadd            
	//  426  797:fload           24
	//  427  799:fload           25
	//  428  801:invokevirtual   #174 <Method void Path.cubicTo(float, float, float, float, float, float)>
				}
				d += f18;
	//  429  804:dload_1         
	//  430  805:fload           23
	//  431  807:f2d             
	//  432  808:dadd            
	//  433  809:dstore_1        
				flag ^= true;
	//  434  810:iload           32
	//  435  812:iconst_1        
	//  436  813:ixor            
	//  437  814:istore          32
				i++;
	//  438  816:iload           31
	//  439  818:iconst_1        
	//  440  819:iadd            
	//  441  820:istore          31
				f13 = f19;
	//  442  822:fload           24
	//  443  824:fstore          18
				f14 = f15;
	//  444  826:fload           20
	//  445  828:fstore          19
			} else
	//* 446  830:goto            337
			{
				PointF pointf = (PointF)positionAnimation.getValue();
	//  447  833:aload_0         
	//  448  834:getfield        #82  <Field BaseKeyframeAnimation positionAnimation>
	//  449  837:invokevirtual   #130 <Method Object BaseKeyframeAnimation.getValue()>
	//  450  840:checkcast       #179 <Class PointF>
	//  451  843:astore          35
				path.offset(pointf.x, pointf.y);
	//  452  845:aload_0         
	//  453  846:getfield        #43  <Field Path path>
	//  454  849:aload           35
	//  455  851:getfield        #183 <Field float PointF.x>
	//  456  854:aload           35
	//  457  856:getfield        #186 <Field float PointF.y>
	//  458  859:invokevirtual   #189 <Method void Path.offset(float, float)>
				path.close();
	//  459  862:aload_0         
	//  460  863:getfield        #43  <Field Path path>
	//  461  866:invokevirtual   #192 <Method void Path.close()>
				return;
	//  462  869:return          
			}
		} while(true);
	}

	private void invalidate()
	{
		isPathValid = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #199 <Field boolean isPathValid>
		lottieDrawable.invalidateSelf();
	//    3    5:aload_0         
	//    4    6:getfield        #45  <Field LottieDrawable lottieDrawable>
	//    5    9:invokevirtual   #204 <Method void LottieDrawable.invalidateSelf()>
	//    6   12:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String name>
	//    2    4:areturn         
	}

	public Path getPath()
	{
		if(isPathValid)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field boolean isPathValid>
	//*   2    4:ifeq            12
			return path;
	//    3    7:aload_0         
	//    4    8:getfield        #43  <Field Path path>
	//    5   11:areturn         
		path.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field Path path>
	//    8   16:invokevirtual   #209 <Method void Path.reset()>
		static class _cls1
		{

			static final int $SwitchMap$com$airbnb$lottie$PolystarShape$Type[];

			static 
			{
				$SwitchMap$com$airbnb$lottie$PolystarShape$Type = new int[PolystarShape.Type.values().length];
			//    0    0:invokestatic    #18  <Method PolystarShape$Type[] PolystarShape$Type.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$PolystarShape$Type>
				try
				{
					$SwitchMap$com$airbnb$lottie$PolystarShape$Type[PolystarShape.Type.Star.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$PolystarShape$Type>
			//    5   12:getstatic       #24  <Field PolystarShape$Type PolystarShape$Type.Star>
			//    6   15:invokevirtual   #28  <Method int PolystarShape$Type.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$airbnb$lottie$PolystarShape$Type>
			//*  10   23:getstatic       #31  <Field PolystarShape$Type PolystarShape$Type.Polygon>
			//*  11   26:invokevirtual   #28  <Method int PolystarShape$Type.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					$SwitchMap$com$airbnb$lottie$PolystarShape$Type[PolystarShape.Type.Polygon.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		switch(_cls1..SwitchMap.com.airbnb.lottie.PolystarShape.Type[type.ordinal()])
	//*   9   19:getstatic       #213 <Field int[] PolystarContent$1.$SwitchMap$com$airbnb$lottie$PolystarShape$Type>
	//*  10   22:aload_0         
	//*  11   23:getfield        #59  <Field PolystarShape$Type type>
	//*  12   26:invokevirtual   #217 <Method int PolystarShape$Type.ordinal()>
	//*  13   29:iaload          
		{
	//*  14   30:tableswitch     1 2: default 52
	//	               1 62
	//	               2 55
	//*  15   52:goto            66
		case 2: // '\002'
			createPolygonPath();
	//   16   55:aload_0         
	//   17   56:invokespecial   #219 <Method void createPolygonPath()>
			break;

	//*  18   59:goto            66
		case 1: // '\001'
			createStarPath();
	//   19   62:aload_0         
	//   20   63:invokespecial   #221 <Method void createStarPath()>
			break;
		}
		path.close();
	//   21   66:aload_0         
	//   22   67:getfield        #43  <Field Path path>
	//   23   70:invokevirtual   #192 <Method void Path.close()>
		Utils.applyTrimPathIfNeeded(path, trimPath);
	//   24   73:aload_0         
	//   25   74:getfield        #43  <Field Path path>
	//   26   77:aload_0         
	//   27   78:getfield        #223 <Field TrimPathContent trimPath>
	//   28   81:invokestatic    #229 <Method void Utils.applyTrimPathIfNeeded(Path, TrimPathContent)>
		isPathValid = true;
	//   29   84:aload_0         
	//   30   85:iconst_1        
	//   31   86:putfield        #199 <Field boolean isPathValid>
		return path;
	//   32   89:aload_0         
	//   33   90:getfield        #43  <Field Path path>
	//   34   93:areturn         
	}

	public void onValueChanged()
	{
		invalidate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #232 <Method void invalidate()>
	//    2    4:return          
	}

	public void setContents(List list, List list1)
	{
		for(int i = 0; i < list.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_1         
	//*   4    4:invokeinterface #239 <Method int List.size()>
	//*   5    9:icmpge          65
		{
			list1 = ((List) ((Content)list.get(i)));
	//    6   12:aload_1         
	//    7   13:iload_3         
	//    8   14:invokeinterface #243 <Method Object List.get(int)>
	//    9   19:checkcast       #245 <Class Content>
	//   10   22:astore_2        
			if(!(list1 instanceof TrimPathContent))
				continue;
	//   11   23:aload_2         
	//   12   24:instanceof      #247 <Class TrimPathContent>
	//   13   27:ifeq            58
			list1 = ((List) ((TrimPathContent)list1));
	//   14   30:aload_2         
	//   15   31:checkcast       #247 <Class TrimPathContent>
	//   16   34:astore_2        
			if(((TrimPathContent) (list1)).getType() == ShapeTrimPath.Type.Simultaneously)
	//*  17   35:aload_2         
	//*  18   36:invokevirtual   #250 <Method ShapeTrimPath$Type TrimPathContent.getType()>
	//*  19   39:getstatic       #256 <Field ShapeTrimPath$Type ShapeTrimPath$Type.Simultaneously>
	//*  20   42:if_acmpne       58
			{
				trimPath = ((TrimPathContent) (list1));
	//   21   45:aload_0         
	//   22   46:aload_2         
	//   23   47:putfield        #223 <Field TrimPathContent trimPath>
				trimPath.addListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   24   50:aload_0         
	//   25   51:getfield        #223 <Field TrimPathContent trimPath>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #259 <Method void TrimPathContent.addListener(BaseKeyframeAnimation$AnimationListener)>
			}
		}

	//   28   58:iload_3         
	//   29   59:iconst_1        
	//   30   60:iadd            
	//   31   61:istore_3        
	//*  32   62:goto            2
	//   33   65:return          
	}

	private final BaseKeyframeAnimation innerRadiusAnimation;
	private final BaseKeyframeAnimation innerRoundednessAnimation;
	private boolean isPathValid;
	private final LottieDrawable lottieDrawable;
	private final String name;
	private final BaseKeyframeAnimation outerRadiusAnimation;
	private final BaseKeyframeAnimation outerRoundednessAnimation;
	private final Path path = new Path();
	private final BaseKeyframeAnimation pointsAnimation;
	private final BaseKeyframeAnimation positionAnimation;
	private final BaseKeyframeAnimation rotationAnimation;
	private TrimPathContent trimPath;
	private final PolystarShape.Type type;
}
