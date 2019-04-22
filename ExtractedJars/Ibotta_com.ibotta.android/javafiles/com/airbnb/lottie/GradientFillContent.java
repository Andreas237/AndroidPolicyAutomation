// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import android.support.v4.util.LongSparseArray;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			DrawingContent, GradientFill, LottieDrawable, LottieComposition, 
//			AnimatableGradientColorValue, KeyframeAnimation, BaseLayer, AnimatableIntegerValue, 
//			AnimatablePointValue, GradientColor, PathContent, GradientType, 
//			Content

class GradientFillContent
	implements BaseKeyframeAnimation.AnimationListener, DrawingContent
{

	GradientFillContent(LottieDrawable lottiedrawable, BaseLayer baselayer, GradientFill gradientfill)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #45  <Class LongSparseArray>
	//    4    8:dup             
	//    5    9:invokespecial   #46  <Method void LongSparseArray()>
	//    6   12:putfield        #48  <Field LongSparseArray linearGradientCache>
	//    7   15:aload_0         
	//    8   16:new             #45  <Class LongSparseArray>
	//    9   19:dup             
	//   10   20:invokespecial   #46  <Method void LongSparseArray()>
	//   11   23:putfield        #50  <Field LongSparseArray radialGradientCache>
	//   12   26:aload_0         
	//   13   27:new             #52  <Class Path>
	//   14   30:dup             
	//   15   31:invokespecial   #53  <Method void Path()>
	//   16   34:putfield        #55  <Field Path path>
	//   17   37:aload_0         
	//   18   38:new             #57  <Class Paint>
	//   19   41:dup             
	//   20   42:iconst_1        
	//   21   43:invokespecial   #60  <Method void Paint(int)>
	//   22   46:putfield        #62  <Field Paint paint>
	//   23   49:aload_0         
	//   24   50:new             #64  <Class RectF>
	//   25   53:dup             
	//   26   54:invokespecial   #65  <Method void RectF()>
	//   27   57:putfield        #67  <Field RectF boundsRect>
	//   28   60:aload_0         
	//   29   61:new             #69  <Class ArrayList>
	//   30   64:dup             
	//   31   65:invokespecial   #70  <Method void ArrayList()>
	//   32   68:putfield        #72  <Field List paths>
		name = gradientfill.getName();
	//   33   71:aload_0         
	//   34   72:aload_3         
	//   35   73:invokevirtual   #78  <Method String GradientFill.getName()>
	//   36   76:putfield        #80  <Field String name>
		lottieDrawable = lottiedrawable;
	//   37   79:aload_0         
	//   38   80:aload_1         
	//   39   81:putfield        #82  <Field LottieDrawable lottieDrawable>
		type = gradientfill.getGradientType();
	//   40   84:aload_0         
	//   41   85:aload_3         
	//   42   86:invokevirtual   #86  <Method GradientType GradientFill.getGradientType()>
	//   43   89:putfield        #88  <Field GradientType type>
		path.setFillType(gradientfill.getFillType());
	//   44   92:aload_0         
	//   45   93:getfield        #55  <Field Path path>
	//   46   96:aload_3         
	//   47   97:invokevirtual   #92  <Method android.graphics.Path$FillType GradientFill.getFillType()>
	//   48  100:invokevirtual   #96  <Method void Path.setFillType(android.graphics.Path$FillType)>
		cacheSteps = (int)(lottiedrawable.getComposition().getDuration() / 32L);
	//   49  103:aload_0         
	//   50  104:aload_1         
	//   51  105:invokevirtual   #102 <Method LottieComposition LottieDrawable.getComposition()>
	//   52  108:invokevirtual   #108 <Method long LottieComposition.getDuration()>
	//   53  111:ldc2w           #109 <Long 32L>
	//   54  114:ldiv            
	//   55  115:l2i             
	//   56  116:putfield        #112 <Field int cacheSteps>
		colorAnimation = gradientfill.getGradientColor().createAnimation();
	//   57  119:aload_0         
	//   58  120:aload_3         
	//   59  121:invokevirtual   #116 <Method AnimatableGradientColorValue GradientFill.getGradientColor()>
	//   60  124:invokevirtual   #122 <Method KeyframeAnimation AnimatableGradientColorValue.createAnimation()>
	//   61  127:putfield        #124 <Field KeyframeAnimation colorAnimation>
		colorAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   62  130:aload_0         
	//   63  131:getfield        #124 <Field KeyframeAnimation colorAnimation>
	//   64  134:aload_0         
	//   65  135:invokevirtual   #130 <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		baselayer.addAnimation(((BaseKeyframeAnimation) (colorAnimation)));
	//   66  138:aload_2         
	//   67  139:aload_0         
	//   68  140:getfield        #124 <Field KeyframeAnimation colorAnimation>
	//   69  143:invokevirtual   #136 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		opacityAnimation = gradientfill.getOpacity().createAnimation();
	//   70  146:aload_0         
	//   71  147:aload_3         
	//   72  148:invokevirtual   #140 <Method AnimatableIntegerValue GradientFill.getOpacity()>
	//   73  151:invokevirtual   #143 <Method KeyframeAnimation AnimatableIntegerValue.createAnimation()>
	//   74  154:putfield        #145 <Field KeyframeAnimation opacityAnimation>
		opacityAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   75  157:aload_0         
	//   76  158:getfield        #145 <Field KeyframeAnimation opacityAnimation>
	//   77  161:aload_0         
	//   78  162:invokevirtual   #130 <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		baselayer.addAnimation(((BaseKeyframeAnimation) (opacityAnimation)));
	//   79  165:aload_2         
	//   80  166:aload_0         
	//   81  167:getfield        #145 <Field KeyframeAnimation opacityAnimation>
	//   82  170:invokevirtual   #136 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		startPointAnimation = gradientfill.getStartPoint().createAnimation();
	//   83  173:aload_0         
	//   84  174:aload_3         
	//   85  175:invokevirtual   #149 <Method AnimatablePointValue GradientFill.getStartPoint()>
	//   86  178:invokevirtual   #152 <Method KeyframeAnimation AnimatablePointValue.createAnimation()>
	//   87  181:putfield        #154 <Field KeyframeAnimation startPointAnimation>
		startPointAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   88  184:aload_0         
	//   89  185:getfield        #154 <Field KeyframeAnimation startPointAnimation>
	//   90  188:aload_0         
	//   91  189:invokevirtual   #130 <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		baselayer.addAnimation(((BaseKeyframeAnimation) (startPointAnimation)));
	//   92  192:aload_2         
	//   93  193:aload_0         
	//   94  194:getfield        #154 <Field KeyframeAnimation startPointAnimation>
	//   95  197:invokevirtual   #136 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		endPointAnimation = gradientfill.getEndPoint().createAnimation();
	//   96  200:aload_0         
	//   97  201:aload_3         
	//   98  202:invokevirtual   #157 <Method AnimatablePointValue GradientFill.getEndPoint()>
	//   99  205:invokevirtual   #152 <Method KeyframeAnimation AnimatablePointValue.createAnimation()>
	//  100  208:putfield        #159 <Field KeyframeAnimation endPointAnimation>
		endPointAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  101  211:aload_0         
	//  102  212:getfield        #159 <Field KeyframeAnimation endPointAnimation>
	//  103  215:aload_0         
	//  104  216:invokevirtual   #130 <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		baselayer.addAnimation(((BaseKeyframeAnimation) (endPointAnimation)));
	//  105  219:aload_2         
	//  106  220:aload_0         
	//  107  221:getfield        #159 <Field KeyframeAnimation endPointAnimation>
	//  108  224:invokevirtual   #136 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
	//  109  227:return          
	}

	private int getGradientHash()
	{
		return 527 * Math.round(startPointAnimation.getProgress() * (float)cacheSteps) * 31 * Math.round(endPointAnimation.getProgress() * (float)cacheSteps) * 31 * Math.round(colorAnimation.getProgress() * (float)cacheSteps);
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #154 <Field KeyframeAnimation startPointAnimation>
	//    3    7:invokevirtual   #166 <Method float KeyframeAnimation.getProgress()>
	//    4   10:aload_0         
	//    5   11:getfield        #112 <Field int cacheSteps>
	//    6   14:i2f             
	//    7   15:fmul            
	//    8   16:invokestatic    #172 <Method int Math.round(float)>
	//    9   19:imul            
	//   10   20:bipush          31
	//   11   22:imul            
	//   12   23:aload_0         
	//   13   24:getfield        #159 <Field KeyframeAnimation endPointAnimation>
	//   14   27:invokevirtual   #166 <Method float KeyframeAnimation.getProgress()>
	//   15   30:aload_0         
	//   16   31:getfield        #112 <Field int cacheSteps>
	//   17   34:i2f             
	//   18   35:fmul            
	//   19   36:invokestatic    #172 <Method int Math.round(float)>
	//   20   39:imul            
	//   21   40:bipush          31
	//   22   42:imul            
	//   23   43:aload_0         
	//   24   44:getfield        #124 <Field KeyframeAnimation colorAnimation>
	//   25   47:invokevirtual   #166 <Method float KeyframeAnimation.getProgress()>
	//   26   50:aload_0         
	//   27   51:getfield        #112 <Field int cacheSteps>
	//   28   54:i2f             
	//   29   55:fmul            
	//   30   56:invokestatic    #172 <Method int Math.round(float)>
	//   31   59:imul            
	//   32   60:ireturn         
	}

	private LinearGradient getLinearGradient()
	{
		int i = getGradientHash();
	//    0    0:aload_0         
	//    1    1:invokespecial   #176 <Method int getGradientHash()>
	//    2    4:istore_1        
		Object obj = ((Object) (linearGradientCache));
	//    3    5:aload_0         
	//    4    6:getfield        #48  <Field LongSparseArray linearGradientCache>
	//    5    9:astore          7
		long l1 = i;
	//    6   11:iload_1         
	//    7   12:i2l             
	//    8   13:lstore          5
		obj = ((Object) ((LinearGradient)((LongSparseArray) (obj)).get(l1)));
	//    9   15:aload           7
	//   10   17:lload           5
	//   11   19:invokevirtual   #180 <Method Object LongSparseArray.get(long)>
	//   12   22:checkcast       #182 <Class LinearGradient>
	//   13   25:astore          7
		if(obj != null)
	//*  14   27:aload           7
	//*  15   29:ifnull          35
		{
			return ((LinearGradient) (obj));
	//   16   32:aload           7
	//   17   34:areturn         
		} else
		{
			Object obj1 = ((Object) ((PointF)startPointAnimation.getValue()));
	//   18   35:aload_0         
	//   19   36:getfield        #154 <Field KeyframeAnimation startPointAnimation>
	//   20   39:invokevirtual   #186 <Method Object KeyframeAnimation.getValue()>
	//   21   42:checkcast       #188 <Class PointF>
	//   22   45:astore          7
			PointF pointf = (PointF)endPointAnimation.getValue();
	//   23   47:aload_0         
	//   24   48:getfield        #159 <Field KeyframeAnimation endPointAnimation>
	//   25   51:invokevirtual   #186 <Method Object KeyframeAnimation.getValue()>
	//   26   54:checkcast       #188 <Class PointF>
	//   27   57:astore          8
			GradientColor gradientcolor = (GradientColor)colorAnimation.getValue();
	//   28   59:aload_0         
	//   29   60:getfield        #124 <Field KeyframeAnimation colorAnimation>
	//   30   63:invokevirtual   #186 <Method Object KeyframeAnimation.getValue()>
	//   31   66:checkcast       #190 <Class GradientColor>
	//   32   69:astore          10
			int ai[] = gradientcolor.getColors();
	//   33   71:aload           10
	//   34   73:invokevirtual   #194 <Method int[] GradientColor.getColors()>
	//   35   76:astore          9
			float af[] = gradientcolor.getPositions();
	//   36   78:aload           10
	//   37   80:invokevirtual   #198 <Method float[] GradientColor.getPositions()>
	//   38   83:astore          10
			int j = (int)(boundsRect.left + boundsRect.width() / 2.0F + ((PointF) (obj1)).x);
	//   39   85:aload_0         
	//   40   86:getfield        #67  <Field RectF boundsRect>
	//   41   89:getfield        #202 <Field float RectF.left>
	//   42   92:aload_0         
	//   43   93:getfield        #67  <Field RectF boundsRect>
	//   44   96:invokevirtual   #205 <Method float RectF.width()>
	//   45   99:fconst_2        
	//   46  100:fdiv            
	//   47  101:fadd            
	//   48  102:aload           7
	//   49  104:getfield        #208 <Field float PointF.x>
	//   50  107:fadd            
	//   51  108:f2i             
	//   52  109:istore_1        
			int k = (int)(boundsRect.top + boundsRect.height() / 2.0F + ((PointF) (obj1)).y);
	//   53  110:aload_0         
	//   54  111:getfield        #67  <Field RectF boundsRect>
	//   55  114:getfield        #211 <Field float RectF.top>
	//   56  117:aload_0         
	//   57  118:getfield        #67  <Field RectF boundsRect>
	//   58  121:invokevirtual   #214 <Method float RectF.height()>
	//   59  124:fconst_2        
	//   60  125:fdiv            
	//   61  126:fadd            
	//   62  127:aload           7
	//   63  129:getfield        #217 <Field float PointF.y>
	//   64  132:fadd            
	//   65  133:f2i             
	//   66  134:istore_2        
			int l = (int)(boundsRect.left + boundsRect.width() / 2.0F + pointf.x);
	//   67  135:aload_0         
	//   68  136:getfield        #67  <Field RectF boundsRect>
	//   69  139:getfield        #202 <Field float RectF.left>
	//   70  142:aload_0         
	//   71  143:getfield        #67  <Field RectF boundsRect>
	//   72  146:invokevirtual   #205 <Method float RectF.width()>
	//   73  149:fconst_2        
	//   74  150:fdiv            
	//   75  151:fadd            
	//   76  152:aload           8
	//   77  154:getfield        #208 <Field float PointF.x>
	//   78  157:fadd            
	//   79  158:f2i             
	//   80  159:istore_3        
			int i1 = (int)(boundsRect.top + boundsRect.height() / 2.0F + pointf.y);
	//   81  160:aload_0         
	//   82  161:getfield        #67  <Field RectF boundsRect>
	//   83  164:getfield        #211 <Field float RectF.top>
	//   84  167:aload_0         
	//   85  168:getfield        #67  <Field RectF boundsRect>
	//   86  171:invokevirtual   #214 <Method float RectF.height()>
	//   87  174:fconst_2        
	//   88  175:fdiv            
	//   89  176:fadd            
	//   90  177:aload           8
	//   91  179:getfield        #217 <Field float PointF.y>
	//   92  182:fadd            
	//   93  183:f2i             
	//   94  184:istore          4
			obj1 = ((Object) (new LinearGradient(j, k, l, i1, ai, af, android.graphics.Shader.TileMode.CLAMP)));
	//   95  186:new             #182 <Class LinearGradient>
	//   96  189:dup             
	//   97  190:iload_1         
	//   98  191:i2f             
	//   99  192:iload_2         
	//  100  193:i2f             
	//  101  194:iload_3         
	//  102  195:i2f             
	//  103  196:iload           4
	//  104  198:i2f             
	//  105  199:aload           9
	//  106  201:aload           10
	//  107  203:getstatic       #223 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  108  206:invokespecial   #226 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  109  209:astore          7
			linearGradientCache.put(l1, obj1);
	//  110  211:aload_0         
	//  111  212:getfield        #48  <Field LongSparseArray linearGradientCache>
	//  112  215:lload           5
	//  113  217:aload           7
	//  114  219:invokevirtual   #230 <Method void LongSparseArray.put(long, Object)>
			return ((LinearGradient) (obj1));
	//  115  222:aload           7
	//  116  224:areturn         
		}
	}

	private RadialGradient getRadialGradient()
	{
		int i = getGradientHash();
	//    0    0:aload_0         
	//    1    1:invokespecial   #176 <Method int getGradientHash()>
	//    2    4:istore_2        
		Object obj = ((Object) (radialGradientCache));
	//    3    5:aload_0         
	//    4    6:getfield        #50  <Field LongSparseArray radialGradientCache>
	//    5    9:astore          8
		long l1 = i;
	//    6   11:iload_2         
	//    7   12:i2l             
	//    8   13:lstore          6
		obj = ((Object) ((RadialGradient)((LongSparseArray) (obj)).get(l1)));
	//    9   15:aload           8
	//   10   17:lload           6
	//   11   19:invokevirtual   #180 <Method Object LongSparseArray.get(long)>
	//   12   22:checkcast       #234 <Class RadialGradient>
	//   13   25:astore          8
		if(obj != null)
	//*  14   27:aload           8
	//*  15   29:ifnull          35
		{
			return ((RadialGradient) (obj));
	//   16   32:aload           8
	//   17   34:areturn         
		} else
		{
			Object obj1 = ((Object) ((PointF)startPointAnimation.getValue()));
	//   18   35:aload_0         
	//   19   36:getfield        #154 <Field KeyframeAnimation startPointAnimation>
	//   20   39:invokevirtual   #186 <Method Object KeyframeAnimation.getValue()>
	//   21   42:checkcast       #188 <Class PointF>
	//   22   45:astore          8
			PointF pointf = (PointF)endPointAnimation.getValue();
	//   23   47:aload_0         
	//   24   48:getfield        #159 <Field KeyframeAnimation endPointAnimation>
	//   25   51:invokevirtual   #186 <Method Object KeyframeAnimation.getValue()>
	//   26   54:checkcast       #188 <Class PointF>
	//   27   57:astore          9
			GradientColor gradientcolor = (GradientColor)colorAnimation.getValue();
	//   28   59:aload_0         
	//   29   60:getfield        #124 <Field KeyframeAnimation colorAnimation>
	//   30   63:invokevirtual   #186 <Method Object KeyframeAnimation.getValue()>
	//   31   66:checkcast       #190 <Class GradientColor>
	//   32   69:astore          11
			int ai[] = gradientcolor.getColors();
	//   33   71:aload           11
	//   34   73:invokevirtual   #194 <Method int[] GradientColor.getColors()>
	//   35   76:astore          10
			float af[] = gradientcolor.getPositions();
	//   36   78:aload           11
	//   37   80:invokevirtual   #198 <Method float[] GradientColor.getPositions()>
	//   38   83:astore          11
			int j = (int)(boundsRect.left + boundsRect.width() / 2.0F + ((PointF) (obj1)).x);
	//   39   85:aload_0         
	//   40   86:getfield        #67  <Field RectF boundsRect>
	//   41   89:getfield        #202 <Field float RectF.left>
	//   42   92:aload_0         
	//   43   93:getfield        #67  <Field RectF boundsRect>
	//   44   96:invokevirtual   #205 <Method float RectF.width()>
	//   45   99:fconst_2        
	//   46  100:fdiv            
	//   47  101:fadd            
	//   48  102:aload           8
	//   49  104:getfield        #208 <Field float PointF.x>
	//   50  107:fadd            
	//   51  108:f2i             
	//   52  109:istore_2        
			int k = (int)(boundsRect.top + boundsRect.height() / 2.0F + ((PointF) (obj1)).y);
	//   53  110:aload_0         
	//   54  111:getfield        #67  <Field RectF boundsRect>
	//   55  114:getfield        #211 <Field float RectF.top>
	//   56  117:aload_0         
	//   57  118:getfield        #67  <Field RectF boundsRect>
	//   58  121:invokevirtual   #214 <Method float RectF.height()>
	//   59  124:fconst_2        
	//   60  125:fdiv            
	//   61  126:fadd            
	//   62  127:aload           8
	//   63  129:getfield        #217 <Field float PointF.y>
	//   64  132:fadd            
	//   65  133:f2i             
	//   66  134:istore_3        
			int l = (int)(boundsRect.left + boundsRect.width() / 2.0F + pointf.x);
	//   67  135:aload_0         
	//   68  136:getfield        #67  <Field RectF boundsRect>
	//   69  139:getfield        #202 <Field float RectF.left>
	//   70  142:aload_0         
	//   71  143:getfield        #67  <Field RectF boundsRect>
	//   72  146:invokevirtual   #205 <Method float RectF.width()>
	//   73  149:fconst_2        
	//   74  150:fdiv            
	//   75  151:fadd            
	//   76  152:aload           9
	//   77  154:getfield        #208 <Field float PointF.x>
	//   78  157:fadd            
	//   79  158:f2i             
	//   80  159:istore          4
			int i1 = (int)(boundsRect.top + boundsRect.height() / 2.0F + pointf.y);
	//   81  161:aload_0         
	//   82  162:getfield        #67  <Field RectF boundsRect>
	//   83  165:getfield        #211 <Field float RectF.top>
	//   84  168:aload_0         
	//   85  169:getfield        #67  <Field RectF boundsRect>
	//   86  172:invokevirtual   #214 <Method float RectF.height()>
	//   87  175:fconst_2        
	//   88  176:fdiv            
	//   89  177:fadd            
	//   90  178:aload           9
	//   91  180:getfield        #217 <Field float PointF.y>
	//   92  183:fadd            
	//   93  184:f2i             
	//   94  185:istore          5
			float f = (float)Math.hypot(l - j, i1 - k);
	//   95  187:iload           4
	//   96  189:iload_2         
	//   97  190:isub            
	//   98  191:i2d             
	//   99  192:iload           5
	//  100  194:iload_3         
	//  101  195:isub            
	//  102  196:i2d             
	//  103  197:invokestatic    #238 <Method double Math.hypot(double, double)>
	//  104  200:d2f             
	//  105  201:fstore_1        
			obj1 = ((Object) (new RadialGradient(j, k, f, ai, af, android.graphics.Shader.TileMode.CLAMP)));
	//  106  202:new             #234 <Class RadialGradient>
	//  107  205:dup             
	//  108  206:iload_2         
	//  109  207:i2f             
	//  110  208:iload_3         
	//  111  209:i2f             
	//  112  210:fload_1         
	//  113  211:aload           10
	//  114  213:aload           11
	//  115  215:getstatic       #223 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  116  218:invokespecial   #241 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  117  221:astore          8
			radialGradientCache.put(l1, obj1);
	//  118  223:aload_0         
	//  119  224:getfield        #50  <Field LongSparseArray radialGradientCache>
	//  120  227:lload           6
	//  121  229:aload           8
	//  122  231:invokevirtual   #230 <Method void LongSparseArray.put(long, Object)>
			return ((RadialGradient) (obj1));
	//  123  234:aload           8
	//  124  236:areturn         
		}
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
	//    0    0:return          
	}

	public void draw(Canvas canvas, Matrix matrix, int i)
	{
		path.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Path path>
	//    2    4:invokevirtual   #250 <Method void Path.reset()>
		for(int j = 0; j < paths.size(); j++)
	//*   3    7:iconst_0        
	//*   4    8:istore          4
	//*   5   10:iload           4
	//*   6   12:aload_0         
	//*   7   13:getfield        #72  <Field List paths>
	//*   8   16:invokeinterface #255 <Method int List.size()>
	//*   9   21:icmpge          60
			path.addPath(((PathContent)paths.get(j)).getPath(), matrix);
	//   10   24:aload_0         
	//   11   25:getfield        #55  <Field Path path>
	//   12   28:aload_0         
	//   13   29:getfield        #72  <Field List paths>
	//   14   32:iload           4
	//   15   34:invokeinterface #258 <Method Object List.get(int)>
	//   16   39:checkcast       #260 <Class PathContent>
	//   17   42:invokeinterface #264 <Method Path PathContent.getPath()>
	//   18   47:aload_2         
	//   19   48:invokevirtual   #268 <Method void Path.addPath(Path, Matrix)>

	//   20   51:iload           4
	//   21   53:iconst_1        
	//   22   54:iadd            
	//   23   55:istore          4
	//*  24   57:goto            10
		path.computeBounds(boundsRect, false);
	//   25   60:aload_0         
	//   26   61:getfield        #55  <Field Path path>
	//   27   64:aload_0         
	//   28   65:getfield        #67  <Field RectF boundsRect>
	//   29   68:iconst_0        
	//   30   69:invokevirtual   #272 <Method void Path.computeBounds(RectF, boolean)>
		if(type == GradientType.Linear)
	//*  31   72:aload_0         
	//*  32   73:getfield        #88  <Field GradientType type>
	//*  33   76:getstatic       #277 <Field GradientType GradientType.Linear>
	//*  34   79:if_acmpne       97
			paint.setShader(((android.graphics.Shader) (getLinearGradient())));
	//   35   82:aload_0         
	//   36   83:getfield        #62  <Field Paint paint>
	//   37   86:aload_0         
	//   38   87:invokespecial   #279 <Method LinearGradient getLinearGradient()>
	//   39   90:invokevirtual   #283 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   40   93:pop             
		else
	//*  41   94:goto            109
			paint.setShader(((android.graphics.Shader) (getRadialGradient())));
	//   42   97:aload_0         
	//   43   98:getfield        #62  <Field Paint paint>
	//   44  101:aload_0         
	//   45  102:invokespecial   #285 <Method RadialGradient getRadialGradient()>
	//   46  105:invokevirtual   #283 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   47  108:pop             
		i = (int)(((((float)i / 255F) * (float)((Integer)opacityAnimation.getValue()).intValue()) / 100F) * 255F);
	//   48  109:iload_3         
	//   49  110:i2f             
	//   50  111:ldc2            #286 <Float 255F>
	//   51  114:fdiv            
	//   52  115:aload_0         
	//   53  116:getfield        #145 <Field KeyframeAnimation opacityAnimation>
	//   54  119:invokevirtual   #186 <Method Object KeyframeAnimation.getValue()>
	//   55  122:checkcast       #288 <Class Integer>
	//   56  125:invokevirtual   #291 <Method int Integer.intValue()>
	//   57  128:i2f             
	//   58  129:fmul            
	//   59  130:ldc2            #292 <Float 100F>
	//   60  133:fdiv            
	//   61  134:ldc2            #286 <Float 255F>
	//   62  137:fmul            
	//   63  138:f2i             
	//   64  139:istore_3        
		paint.setAlpha(i);
	//   65  140:aload_0         
	//   66  141:getfield        #62  <Field Paint paint>
	//   67  144:iload_3         
	//   68  145:invokevirtual   #295 <Method void Paint.setAlpha(int)>
		canvas.drawPath(path, paint);
	//   69  148:aload_1         
	//   70  149:aload_0         
	//   71  150:getfield        #55  <Field Path path>
	//   72  153:aload_0         
	//   73  154:getfield        #62  <Field Paint paint>
	//   74  157:invokevirtual   #301 <Method void Canvas.drawPath(Path, Paint)>
	//   75  160:return          
	}

	public void getBounds(RectF rectf, Matrix matrix)
	{
		path.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Path path>
	//    2    4:invokevirtual   #250 <Method void Path.reset()>
		for(int i = 0; i < paths.size(); i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_3        
	//*   5    9:iload_3         
	//*   6   10:aload_0         
	//*   7   11:getfield        #72  <Field List paths>
	//*   8   14:invokeinterface #255 <Method int List.size()>
	//*   9   19:icmpge          55
			path.addPath(((PathContent)paths.get(i)).getPath(), matrix);
	//   10   22:aload_0         
	//   11   23:getfield        #55  <Field Path path>
	//   12   26:aload_0         
	//   13   27:getfield        #72  <Field List paths>
	//   14   30:iload_3         
	//   15   31:invokeinterface #258 <Method Object List.get(int)>
	//   16   36:checkcast       #260 <Class PathContent>
	//   17   39:invokeinterface #264 <Method Path PathContent.getPath()>
	//   18   44:aload_2         
	//   19   45:invokevirtual   #268 <Method void Path.addPath(Path, Matrix)>

	//   20   48:iload_3         
	//   21   49:iconst_1        
	//   22   50:iadd            
	//   23   51:istore_3        
	//*  24   52:goto            9
		path.computeBounds(rectf, false);
	//   25   55:aload_0         
	//   26   56:getfield        #55  <Field Path path>
	//   27   59:aload_1         
	//   28   60:iconst_0        
	//   29   61:invokevirtual   #272 <Method void Path.computeBounds(RectF, boolean)>
		rectf.set(rectf.left - 1.0F, rectf.top - 1.0F, rectf.right + 1.0F, rectf.bottom + 1.0F);
	//   30   64:aload_1         
	//   31   65:aload_1         
	//   32   66:getfield        #202 <Field float RectF.left>
	//   33   69:fconst_1        
	//   34   70:fsub            
	//   35   71:aload_1         
	//   36   72:getfield        #211 <Field float RectF.top>
	//   37   75:fconst_1        
	//   38   76:fsub            
	//   39   77:aload_1         
	//   40   78:getfield        #306 <Field float RectF.right>
	//   41   81:fconst_1        
	//   42   82:fadd            
	//   43   83:aload_1         
	//   44   84:getfield        #309 <Field float RectF.bottom>
	//   45   87:fconst_1        
	//   46   88:fadd            
	//   47   89:invokevirtual   #313 <Method void RectF.set(float, float, float, float)>
	//   48   92:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field String name>
	//    2    4:areturn         
	}

	public void onValueChanged()
	{
		lottieDrawable.invalidateSelf();
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #317 <Method void LottieDrawable.invalidateSelf()>
	//    3    7:return          
	}

	public void setContents(List list, List list1)
	{
		for(int i = 0; i < list1.size(); i++)
	//*   0    0:iconst_0        
	//*   1    1:istore_3        
	//*   2    2:iload_3         
	//*   3    3:aload_2         
	//*   4    4:invokeinterface #255 <Method int List.size()>
	//*   5    9:icmpge          51
		{
			list = ((List) ((Content)list1.get(i)));
	//    6   12:aload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #258 <Method Object List.get(int)>
	//    9   19:checkcast       #321 <Class Content>
	//   10   22:astore_1        
			if(list instanceof PathContent)
	//*  11   23:aload_1         
	//*  12   24:instanceof      #260 <Class PathContent>
	//*  13   27:ifeq            44
				paths.add(((Object) ((PathContent)list)));
	//   14   30:aload_0         
	//   15   31:getfield        #72  <Field List paths>
	//   16   34:aload_1         
	//   17   35:checkcast       #260 <Class PathContent>
	//   18   38:invokeinterface #325 <Method boolean List.add(Object)>
	//   19   43:pop             
		}

	//   20   44:iload_3         
	//   21   45:iconst_1        
	//   22   46:iadd            
	//   23   47:istore_3        
	//*  24   48:goto            2
	//   25   51:return          
	}

	private final RectF boundsRect = new RectF();
	private final int cacheSteps;
	private final KeyframeAnimation colorAnimation;
	private final KeyframeAnimation endPointAnimation;
	private final LongSparseArray linearGradientCache = new LongSparseArray();
	private final LottieDrawable lottieDrawable;
	private final String name;
	private final KeyframeAnimation opacityAnimation;
	private final Paint paint = new Paint(1);
	private final Path path = new Path();
	private final List paths = new ArrayList();
	private final LongSparseArray radialGradientCache = new LongSparseArray();
	private final KeyframeAnimation startPointAnimation;
	private final GradientType type;
}
