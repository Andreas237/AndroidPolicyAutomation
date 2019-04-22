// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import android.support.v4.util.LongSparseArray;
import java.util.List;

// Referenced classes of package com.airbnb.lottie:
//			BaseStrokeContent, GradientStroke, LottieDrawable, LottieComposition, 
//			AnimatableGradientColorValue, KeyframeAnimation, BaseLayer, AnimatablePointValue, 
//			GradientColor, GradientType

public class GradientStrokeContent extends BaseStrokeContent
{

	GradientStrokeContent(LottieDrawable lottiedrawable, BaseLayer baselayer, GradientStroke gradientstroke)
	{
		super(lottiedrawable, baselayer, gradientstroke.getCapType().toPaintCap(), gradientstroke.getJoinType().toPaintJoin(), gradientstroke.getOpacity(), gradientstroke.getWidth(), gradientstroke.getLineDashPattern(), gradientstroke.getDashOffset());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #31  <Method ShapeStroke$LineCapType GradientStroke.getCapType()>
	//    5    7:invokevirtual   #37  <Method android.graphics.Paint$Cap ShapeStroke$LineCapType.toPaintCap()>
	//    6   10:aload_3         
	//    7   11:invokevirtual   #41  <Method ShapeStroke$LineJoinType GradientStroke.getJoinType()>
	//    8   14:invokevirtual   #47  <Method android.graphics.Paint$Join ShapeStroke$LineJoinType.toPaintJoin()>
	//    9   17:aload_3         
	//   10   18:invokevirtual   #51  <Method AnimatableIntegerValue GradientStroke.getOpacity()>
	//   11   21:aload_3         
	//   12   22:invokevirtual   #55  <Method AnimatableFloatValue GradientStroke.getWidth()>
	//   13   25:aload_3         
	//   14   26:invokevirtual   #59  <Method List GradientStroke.getLineDashPattern()>
	//   15   29:aload_3         
	//   16   30:invokevirtual   #62  <Method AnimatableFloatValue GradientStroke.getDashOffset()>
	//   17   33:invokespecial   #65  <Method void BaseStrokeContent(LottieDrawable, BaseLayer, android.graphics.Paint$Cap, android.graphics.Paint$Join, AnimatableIntegerValue, AnimatableFloatValue, List, AnimatableFloatValue)>
	//   18   36:aload_0         
	//   19   37:new             #67  <Class LongSparseArray>
	//   20   40:dup             
	//   21   41:invokespecial   #70  <Method void LongSparseArray()>
	//   22   44:putfield        #72  <Field LongSparseArray linearGradientCache>
	//   23   47:aload_0         
	//   24   48:new             #67  <Class LongSparseArray>
	//   25   51:dup             
	//   26   52:invokespecial   #70  <Method void LongSparseArray()>
	//   27   55:putfield        #74  <Field LongSparseArray radialGradientCache>
	//   28   58:aload_0         
	//   29   59:new             #76  <Class RectF>
	//   30   62:dup             
	//   31   63:invokespecial   #77  <Method void RectF()>
	//   32   66:putfield        #79  <Field RectF boundsRect>
		name = gradientstroke.getName();
	//   33   69:aload_0         
	//   34   70:aload_3         
	//   35   71:invokevirtual   #83  <Method String GradientStroke.getName()>
	//   36   74:putfield        #85  <Field String name>
		type = gradientstroke.getGradientType();
	//   37   77:aload_0         
	//   38   78:aload_3         
	//   39   79:invokevirtual   #89  <Method GradientType GradientStroke.getGradientType()>
	//   40   82:putfield        #91  <Field GradientType type>
		cacheSteps = (int)(lottiedrawable.getComposition().getDuration() / 32L);
	//   41   85:aload_0         
	//   42   86:aload_1         
	//   43   87:invokevirtual   #97  <Method LottieComposition LottieDrawable.getComposition()>
	//   44   90:invokevirtual   #103 <Method long LottieComposition.getDuration()>
	//   45   93:ldc2w           #104 <Long 32L>
	//   46   96:ldiv            
	//   47   97:l2i             
	//   48   98:putfield        #107 <Field int cacheSteps>
		colorAnimation = gradientstroke.getGradientColor().createAnimation();
	//   49  101:aload_0         
	//   50  102:aload_3         
	//   51  103:invokevirtual   #111 <Method AnimatableGradientColorValue GradientStroke.getGradientColor()>
	//   52  106:invokevirtual   #117 <Method KeyframeAnimation AnimatableGradientColorValue.createAnimation()>
	//   53  109:putfield        #119 <Field KeyframeAnimation colorAnimation>
		colorAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   54  112:aload_0         
	//   55  113:getfield        #119 <Field KeyframeAnimation colorAnimation>
	//   56  116:aload_0         
	//   57  117:invokevirtual   #125 <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		baselayer.addAnimation(((BaseKeyframeAnimation) (colorAnimation)));
	//   58  120:aload_2         
	//   59  121:aload_0         
	//   60  122:getfield        #119 <Field KeyframeAnimation colorAnimation>
	//   61  125:invokevirtual   #131 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		startPointAnimation = gradientstroke.getStartPoint().createAnimation();
	//   62  128:aload_0         
	//   63  129:aload_3         
	//   64  130:invokevirtual   #135 <Method AnimatablePointValue GradientStroke.getStartPoint()>
	//   65  133:invokevirtual   #138 <Method KeyframeAnimation AnimatablePointValue.createAnimation()>
	//   66  136:putfield        #140 <Field KeyframeAnimation startPointAnimation>
		startPointAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   67  139:aload_0         
	//   68  140:getfield        #140 <Field KeyframeAnimation startPointAnimation>
	//   69  143:aload_0         
	//   70  144:invokevirtual   #125 <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		baselayer.addAnimation(((BaseKeyframeAnimation) (startPointAnimation)));
	//   71  147:aload_2         
	//   72  148:aload_0         
	//   73  149:getfield        #140 <Field KeyframeAnimation startPointAnimation>
	//   74  152:invokevirtual   #131 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
		endPointAnimation = gradientstroke.getEndPoint().createAnimation();
	//   75  155:aload_0         
	//   76  156:aload_3         
	//   77  157:invokevirtual   #143 <Method AnimatablePointValue GradientStroke.getEndPoint()>
	//   78  160:invokevirtual   #138 <Method KeyframeAnimation AnimatablePointValue.createAnimation()>
	//   79  163:putfield        #145 <Field KeyframeAnimation endPointAnimation>
		endPointAnimation.addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//   80  166:aload_0         
	//   81  167:getfield        #145 <Field KeyframeAnimation endPointAnimation>
	//   82  170:aload_0         
	//   83  171:invokevirtual   #125 <Method void KeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		baselayer.addAnimation(((BaseKeyframeAnimation) (endPointAnimation)));
	//   84  174:aload_2         
	//   85  175:aload_0         
	//   86  176:getfield        #145 <Field KeyframeAnimation endPointAnimation>
	//   87  179:invokevirtual   #131 <Method void BaseLayer.addAnimation(BaseKeyframeAnimation)>
	//   88  182:return          
	}

	private int getGradientHash()
	{
		return 527 * Math.round(startPointAnimation.getProgress() * (float)cacheSteps) * 31 * Math.round(endPointAnimation.getProgress() * (float)cacheSteps) * 31 * Math.round(colorAnimation.getProgress() * (float)cacheSteps);
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #140 <Field KeyframeAnimation startPointAnimation>
	//    3    7:invokevirtual   #152 <Method float KeyframeAnimation.getProgress()>
	//    4   10:aload_0         
	//    5   11:getfield        #107 <Field int cacheSteps>
	//    6   14:i2f             
	//    7   15:fmul            
	//    8   16:invokestatic    #158 <Method int Math.round(float)>
	//    9   19:imul            
	//   10   20:bipush          31
	//   11   22:imul            
	//   12   23:aload_0         
	//   13   24:getfield        #145 <Field KeyframeAnimation endPointAnimation>
	//   14   27:invokevirtual   #152 <Method float KeyframeAnimation.getProgress()>
	//   15   30:aload_0         
	//   16   31:getfield        #107 <Field int cacheSteps>
	//   17   34:i2f             
	//   18   35:fmul            
	//   19   36:invokestatic    #158 <Method int Math.round(float)>
	//   20   39:imul            
	//   21   40:bipush          31
	//   22   42:imul            
	//   23   43:aload_0         
	//   24   44:getfield        #119 <Field KeyframeAnimation colorAnimation>
	//   25   47:invokevirtual   #152 <Method float KeyframeAnimation.getProgress()>
	//   26   50:aload_0         
	//   27   51:getfield        #107 <Field int cacheSteps>
	//   28   54:i2f             
	//   29   55:fmul            
	//   30   56:invokestatic    #158 <Method int Math.round(float)>
	//   31   59:imul            
	//   32   60:ireturn         
	}

	private LinearGradient getLinearGradient()
	{
		int i = getGradientHash();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method int getGradientHash()>
	//    2    4:istore_1        
		Object obj = ((Object) (linearGradientCache));
	//    3    5:aload_0         
	//    4    6:getfield        #72  <Field LongSparseArray linearGradientCache>
	//    5    9:astore          7
		long l1 = i;
	//    6   11:iload_1         
	//    7   12:i2l             
	//    8   13:lstore          5
		obj = ((Object) ((LinearGradient)((LongSparseArray) (obj)).get(l1)));
	//    9   15:aload           7
	//   10   17:lload           5
	//   11   19:invokevirtual   #166 <Method Object LongSparseArray.get(long)>
	//   12   22:checkcast       #168 <Class LinearGradient>
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
	//   19   36:getfield        #140 <Field KeyframeAnimation startPointAnimation>
	//   20   39:invokevirtual   #172 <Method Object KeyframeAnimation.getValue()>
	//   21   42:checkcast       #174 <Class PointF>
	//   22   45:astore          7
			PointF pointf = (PointF)endPointAnimation.getValue();
	//   23   47:aload_0         
	//   24   48:getfield        #145 <Field KeyframeAnimation endPointAnimation>
	//   25   51:invokevirtual   #172 <Method Object KeyframeAnimation.getValue()>
	//   26   54:checkcast       #174 <Class PointF>
	//   27   57:astore          8
			GradientColor gradientcolor = (GradientColor)colorAnimation.getValue();
	//   28   59:aload_0         
	//   29   60:getfield        #119 <Field KeyframeAnimation colorAnimation>
	//   30   63:invokevirtual   #172 <Method Object KeyframeAnimation.getValue()>
	//   31   66:checkcast       #176 <Class GradientColor>
	//   32   69:astore          10
			int ai[] = gradientcolor.getColors();
	//   33   71:aload           10
	//   34   73:invokevirtual   #180 <Method int[] GradientColor.getColors()>
	//   35   76:astore          9
			float af[] = gradientcolor.getPositions();
	//   36   78:aload           10
	//   37   80:invokevirtual   #184 <Method float[] GradientColor.getPositions()>
	//   38   83:astore          10
			int j = (int)(boundsRect.left + boundsRect.width() / 2.0F + ((PointF) (obj1)).x);
	//   39   85:aload_0         
	//   40   86:getfield        #79  <Field RectF boundsRect>
	//   41   89:getfield        #188 <Field float RectF.left>
	//   42   92:aload_0         
	//   43   93:getfield        #79  <Field RectF boundsRect>
	//   44   96:invokevirtual   #191 <Method float RectF.width()>
	//   45   99:fconst_2        
	//   46  100:fdiv            
	//   47  101:fadd            
	//   48  102:aload           7
	//   49  104:getfield        #194 <Field float PointF.x>
	//   50  107:fadd            
	//   51  108:f2i             
	//   52  109:istore_1        
			int k = (int)(boundsRect.top + boundsRect.height() / 2.0F + ((PointF) (obj1)).y);
	//   53  110:aload_0         
	//   54  111:getfield        #79  <Field RectF boundsRect>
	//   55  114:getfield        #197 <Field float RectF.top>
	//   56  117:aload_0         
	//   57  118:getfield        #79  <Field RectF boundsRect>
	//   58  121:invokevirtual   #200 <Method float RectF.height()>
	//   59  124:fconst_2        
	//   60  125:fdiv            
	//   61  126:fadd            
	//   62  127:aload           7
	//   63  129:getfield        #203 <Field float PointF.y>
	//   64  132:fadd            
	//   65  133:f2i             
	//   66  134:istore_2        
			int l = (int)(boundsRect.left + boundsRect.width() / 2.0F + pointf.x);
	//   67  135:aload_0         
	//   68  136:getfield        #79  <Field RectF boundsRect>
	//   69  139:getfield        #188 <Field float RectF.left>
	//   70  142:aload_0         
	//   71  143:getfield        #79  <Field RectF boundsRect>
	//   72  146:invokevirtual   #191 <Method float RectF.width()>
	//   73  149:fconst_2        
	//   74  150:fdiv            
	//   75  151:fadd            
	//   76  152:aload           8
	//   77  154:getfield        #194 <Field float PointF.x>
	//   78  157:fadd            
	//   79  158:f2i             
	//   80  159:istore_3        
			int i1 = (int)(boundsRect.top + boundsRect.height() / 2.0F + pointf.y);
	//   81  160:aload_0         
	//   82  161:getfield        #79  <Field RectF boundsRect>
	//   83  164:getfield        #197 <Field float RectF.top>
	//   84  167:aload_0         
	//   85  168:getfield        #79  <Field RectF boundsRect>
	//   86  171:invokevirtual   #200 <Method float RectF.height()>
	//   87  174:fconst_2        
	//   88  175:fdiv            
	//   89  176:fadd            
	//   90  177:aload           8
	//   91  179:getfield        #203 <Field float PointF.y>
	//   92  182:fadd            
	//   93  183:f2i             
	//   94  184:istore          4
			obj1 = ((Object) (new LinearGradient(j, k, l, i1, ai, af, android.graphics.Shader.TileMode.CLAMP)));
	//   95  186:new             #168 <Class LinearGradient>
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
	//  107  203:getstatic       #209 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  108  206:invokespecial   #212 <Method void LinearGradient(float, float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  109  209:astore          7
			linearGradientCache.put(l1, obj1);
	//  110  211:aload_0         
	//  111  212:getfield        #72  <Field LongSparseArray linearGradientCache>
	//  112  215:lload           5
	//  113  217:aload           7
	//  114  219:invokevirtual   #216 <Method void LongSparseArray.put(long, Object)>
			return ((LinearGradient) (obj1));
	//  115  222:aload           7
	//  116  224:areturn         
		}
	}

	private RadialGradient getRadialGradient()
	{
		int i = getGradientHash();
	//    0    0:aload_0         
	//    1    1:invokespecial   #162 <Method int getGradientHash()>
	//    2    4:istore_2        
		Object obj = ((Object) (radialGradientCache));
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field LongSparseArray radialGradientCache>
	//    5    9:astore          8
		long l1 = i;
	//    6   11:iload_2         
	//    7   12:i2l             
	//    8   13:lstore          6
		obj = ((Object) ((RadialGradient)((LongSparseArray) (obj)).get(l1)));
	//    9   15:aload           8
	//   10   17:lload           6
	//   11   19:invokevirtual   #166 <Method Object LongSparseArray.get(long)>
	//   12   22:checkcast       #220 <Class RadialGradient>
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
	//   19   36:getfield        #140 <Field KeyframeAnimation startPointAnimation>
	//   20   39:invokevirtual   #172 <Method Object KeyframeAnimation.getValue()>
	//   21   42:checkcast       #174 <Class PointF>
	//   22   45:astore          8
			PointF pointf = (PointF)endPointAnimation.getValue();
	//   23   47:aload_0         
	//   24   48:getfield        #145 <Field KeyframeAnimation endPointAnimation>
	//   25   51:invokevirtual   #172 <Method Object KeyframeAnimation.getValue()>
	//   26   54:checkcast       #174 <Class PointF>
	//   27   57:astore          9
			GradientColor gradientcolor = (GradientColor)colorAnimation.getValue();
	//   28   59:aload_0         
	//   29   60:getfield        #119 <Field KeyframeAnimation colorAnimation>
	//   30   63:invokevirtual   #172 <Method Object KeyframeAnimation.getValue()>
	//   31   66:checkcast       #176 <Class GradientColor>
	//   32   69:astore          11
			int ai[] = gradientcolor.getColors();
	//   33   71:aload           11
	//   34   73:invokevirtual   #180 <Method int[] GradientColor.getColors()>
	//   35   76:astore          10
			float af[] = gradientcolor.getPositions();
	//   36   78:aload           11
	//   37   80:invokevirtual   #184 <Method float[] GradientColor.getPositions()>
	//   38   83:astore          11
			int j = (int)(boundsRect.left + boundsRect.width() / 2.0F + ((PointF) (obj1)).x);
	//   39   85:aload_0         
	//   40   86:getfield        #79  <Field RectF boundsRect>
	//   41   89:getfield        #188 <Field float RectF.left>
	//   42   92:aload_0         
	//   43   93:getfield        #79  <Field RectF boundsRect>
	//   44   96:invokevirtual   #191 <Method float RectF.width()>
	//   45   99:fconst_2        
	//   46  100:fdiv            
	//   47  101:fadd            
	//   48  102:aload           8
	//   49  104:getfield        #194 <Field float PointF.x>
	//   50  107:fadd            
	//   51  108:f2i             
	//   52  109:istore_2        
			int k = (int)(boundsRect.top + boundsRect.height() / 2.0F + ((PointF) (obj1)).y);
	//   53  110:aload_0         
	//   54  111:getfield        #79  <Field RectF boundsRect>
	//   55  114:getfield        #197 <Field float RectF.top>
	//   56  117:aload_0         
	//   57  118:getfield        #79  <Field RectF boundsRect>
	//   58  121:invokevirtual   #200 <Method float RectF.height()>
	//   59  124:fconst_2        
	//   60  125:fdiv            
	//   61  126:fadd            
	//   62  127:aload           8
	//   63  129:getfield        #203 <Field float PointF.y>
	//   64  132:fadd            
	//   65  133:f2i             
	//   66  134:istore_3        
			int l = (int)(boundsRect.left + boundsRect.width() / 2.0F + pointf.x);
	//   67  135:aload_0         
	//   68  136:getfield        #79  <Field RectF boundsRect>
	//   69  139:getfield        #188 <Field float RectF.left>
	//   70  142:aload_0         
	//   71  143:getfield        #79  <Field RectF boundsRect>
	//   72  146:invokevirtual   #191 <Method float RectF.width()>
	//   73  149:fconst_2        
	//   74  150:fdiv            
	//   75  151:fadd            
	//   76  152:aload           9
	//   77  154:getfield        #194 <Field float PointF.x>
	//   78  157:fadd            
	//   79  158:f2i             
	//   80  159:istore          4
			int i1 = (int)(boundsRect.top + boundsRect.height() / 2.0F + pointf.y);
	//   81  161:aload_0         
	//   82  162:getfield        #79  <Field RectF boundsRect>
	//   83  165:getfield        #197 <Field float RectF.top>
	//   84  168:aload_0         
	//   85  169:getfield        #79  <Field RectF boundsRect>
	//   86  172:invokevirtual   #200 <Method float RectF.height()>
	//   87  175:fconst_2        
	//   88  176:fdiv            
	//   89  177:fadd            
	//   90  178:aload           9
	//   91  180:getfield        #203 <Field float PointF.y>
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
	//  103  197:invokestatic    #224 <Method double Math.hypot(double, double)>
	//  104  200:d2f             
	//  105  201:fstore_1        
			obj1 = ((Object) (new RadialGradient(j, k, f, ai, af, android.graphics.Shader.TileMode.CLAMP)));
	//  106  202:new             #220 <Class RadialGradient>
	//  107  205:dup             
	//  108  206:iload_2         
	//  109  207:i2f             
	//  110  208:iload_3         
	//  111  209:i2f             
	//  112  210:fload_1         
	//  113  211:aload           10
	//  114  213:aload           11
	//  115  215:getstatic       #209 <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//  116  218:invokespecial   #227 <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//  117  221:astore          8
			radialGradientCache.put(l1, obj1);
	//  118  223:aload_0         
	//  119  224:getfield        #74  <Field LongSparseArray radialGradientCache>
	//  120  227:lload           6
	//  121  229:aload           8
	//  122  231:invokevirtual   #216 <Method void LongSparseArray.put(long, Object)>
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
		getBounds(boundsRect, matrix);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #79  <Field RectF boundsRect>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #237 <Method void getBounds(RectF, Matrix)>
		if(type == GradientType.Linear)
	//*   5    9:aload_0         
	//*   6   10:getfield        #91  <Field GradientType type>
	//*   7   13:getstatic       #242 <Field GradientType GradientType.Linear>
	//*   8   16:if_acmpne       34
			paint.setShader(((android.graphics.Shader) (getLinearGradient())));
	//    9   19:aload_0         
	//   10   20:getfield        #246 <Field Paint paint>
	//   11   23:aload_0         
	//   12   24:invokespecial   #248 <Method LinearGradient getLinearGradient()>
	//   13   27:invokevirtual   #254 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   14   30:pop             
		else
	//*  15   31:goto            46
			paint.setShader(((android.graphics.Shader) (getRadialGradient())));
	//   16   34:aload_0         
	//   17   35:getfield        #246 <Field Paint paint>
	//   18   38:aload_0         
	//   19   39:invokespecial   #256 <Method RadialGradient getRadialGradient()>
	//   20   42:invokevirtual   #254 <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   21   45:pop             
		super.draw(canvas, matrix, i);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:aload_2         
	//   25   49:iload_3         
	//   26   50:invokespecial   #258 <Method void BaseStrokeContent.draw(Canvas, Matrix, int)>
	//   27   53:return          
	}

	public volatile void getBounds(RectF rectf, Matrix matrix)
	{
		super.getBounds(rectf, matrix);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #259 <Method void BaseStrokeContent.getBounds(RectF, Matrix)>
	//    4    6:return          
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String name>
	//    2    4:areturn         
	}

	public volatile void onValueChanged()
	{
		super.onValueChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #262 <Method void BaseStrokeContent.onValueChanged()>
	//    2    4:return          
	}

	public volatile void setContents(List list, List list1)
	{
		super.setContents(list, list1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #266 <Method void BaseStrokeContent.setContents(List, List)>
	//    4    6:return          
	}

	private final RectF boundsRect = new RectF();
	private final int cacheSteps;
	private final KeyframeAnimation colorAnimation;
	private final KeyframeAnimation endPointAnimation;
	private final LongSparseArray linearGradientCache = new LongSparseArray();
	private final String name;
	private final LongSparseArray radialGradientCache = new LongSparseArray();
	private final KeyframeAnimation startPointAnimation;
	private final GradientType type;
}
