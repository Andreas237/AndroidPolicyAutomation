// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;
import android.util.Log;
import java.util.*;

// Referenced classes of package com.airbnb.lottie:
//			DrawingContent, Layer, AnimatableTransform, TransformKeyframeAnimation, 
//			MaskKeyframeAnimation, BaseKeyframeAnimation, Mask, NullLayer, 
//			ImageLayer, LottieComposition, SolidLayer, CompositionLayer, 
//			ShapeLayer, LottieDrawable, FloatKeyframeAnimation, StaticKeyframeAnimation

abstract class BaseLayer
	implements BaseKeyframeAnimation.AnimationListener, DrawingContent
{

	BaseLayer(LottieDrawable lottiedrawable, Layer layer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #53  <Class Path>
	//    4    8:dup             
	//    5    9:invokespecial   #54  <Method void Path()>
	//    6   12:putfield        #56  <Field Path path>
	//    7   15:aload_0         
	//    8   16:new             #58  <Class Matrix>
	//    9   19:dup             
	//   10   20:invokespecial   #59  <Method void Matrix()>
	//   11   23:putfield        #61  <Field Matrix matrix>
	//   12   26:aload_0         
	//   13   27:new             #63  <Class Paint>
	//   14   30:dup             
	//   15   31:iconst_1        
	//   16   32:invokespecial   #66  <Method void Paint(int)>
	//   17   35:putfield        #68  <Field Paint contentPaint>
	//   18   38:aload_0         
	//   19   39:new             #63  <Class Paint>
	//   20   42:dup             
	//   21   43:iconst_1        
	//   22   44:invokespecial   #66  <Method void Paint(int)>
	//   23   47:putfield        #70  <Field Paint maskPaint>
	//   24   50:aload_0         
	//   25   51:new             #63  <Class Paint>
	//   26   54:dup             
	//   27   55:iconst_1        
	//   28   56:invokespecial   #66  <Method void Paint(int)>
	//   29   59:putfield        #72  <Field Paint mattePaint>
	//   30   62:aload_0         
	//   31   63:new             #63  <Class Paint>
	//   32   66:dup             
	//   33   67:invokespecial   #73  <Method void Paint()>
	//   34   70:putfield        #75  <Field Paint clearPaint>
	//   35   73:aload_0         
	//   36   74:new             #77  <Class RectF>
	//   37   77:dup             
	//   38   78:invokespecial   #78  <Method void RectF()>
	//   39   81:putfield        #80  <Field RectF rect>
	//   40   84:aload_0         
	//   41   85:new             #77  <Class RectF>
	//   42   88:dup             
	//   43   89:invokespecial   #78  <Method void RectF()>
	//   44   92:putfield        #82  <Field RectF maskBoundsRect>
	//   45   95:aload_0         
	//   46   96:new             #77  <Class RectF>
	//   47   99:dup             
	//   48  100:invokespecial   #78  <Method void RectF()>
	//   49  103:putfield        #84  <Field RectF matteBoundsRect>
	//   50  106:aload_0         
	//   51  107:new             #77  <Class RectF>
	//   52  110:dup             
	//   53  111:invokespecial   #78  <Method void RectF()>
	//   54  114:putfield        #86  <Field RectF tempMaskBoundsRect>
	//   55  117:aload_0         
	//   56  118:new             #58  <Class Matrix>
	//   57  121:dup             
	//   58  122:invokespecial   #59  <Method void Matrix()>
	//   59  125:putfield        #88  <Field Matrix boundsMatrix>
	//   60  128:aload_0         
	//   61  129:new             #90  <Class ArrayList>
	//   62  132:dup             
	//   63  133:invokespecial   #91  <Method void ArrayList()>
	//   64  136:putfield        #93  <Field List animations>
		visible = true;
	//   65  139:aload_0         
	//   66  140:iconst_1        
	//   67  141:putfield        #95  <Field boolean visible>
		lottieDrawable = lottiedrawable;
	//   68  144:aload_0         
	//   69  145:aload_1         
	//   70  146:putfield        #97  <Field LottieDrawable lottieDrawable>
		layerModel = layer;
	//   71  149:aload_0         
	//   72  150:aload_2         
	//   73  151:putfield        #99  <Field Layer layerModel>
		clearPaint.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR))));
	//   74  154:aload_0         
	//   75  155:getfield        #75  <Field Paint clearPaint>
	//   76  158:new             #101 <Class PorterDuffXfermode>
	//   77  161:dup             
	//   78  162:getstatic       #107 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.CLEAR>
	//   79  165:invokespecial   #110 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//   80  168:invokevirtual   #114 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   81  171:pop             
		maskPaint.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN))));
	//   82  172:aload_0         
	//   83  173:getfield        #70  <Field Paint maskPaint>
	//   84  176:new             #101 <Class PorterDuffXfermode>
	//   85  179:dup             
	//   86  180:getstatic       #117 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.DST_IN>
	//   87  183:invokespecial   #110 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//   88  186:invokevirtual   #114 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   89  189:pop             
		if(layer.getMatteType() == Layer.MatteType.Invert)
	//*  90  190:aload_2         
	//*  91  191:invokevirtual   #123 <Method Layer$MatteType Layer.getMatteType()>
	//*  92  194:getstatic       #129 <Field Layer$MatteType Layer$MatteType.Invert>
	//*  93  197:if_acmpne       221
			mattePaint.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT))));
	//   94  200:aload_0         
	//   95  201:getfield        #72  <Field Paint mattePaint>
	//   96  204:new             #101 <Class PorterDuffXfermode>
	//   97  207:dup             
	//   98  208:getstatic       #132 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.DST_OUT>
	//   99  211:invokespecial   #110 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//  100  214:invokevirtual   #114 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//  101  217:pop             
		else
	//* 102  218:goto            239
			mattePaint.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN))));
	//  103  221:aload_0         
	//  104  222:getfield        #72  <Field Paint mattePaint>
	//  105  225:new             #101 <Class PorterDuffXfermode>
	//  106  228:dup             
	//  107  229:getstatic       #117 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.DST_IN>
	//  108  232:invokespecial   #110 <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//  109  235:invokevirtual   #114 <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//  110  238:pop             
		transform = layer.getTransform().createAnimation();
	//  111  239:aload_0         
	//  112  240:aload_2         
	//  113  241:invokevirtual   #136 <Method AnimatableTransform Layer.getTransform()>
	//  114  244:invokevirtual   #142 <Method TransformKeyframeAnimation AnimatableTransform.createAnimation()>
	//  115  247:putfield        #144 <Field TransformKeyframeAnimation transform>
		transform.addListener(((BaseKeyframeAnimation.AnimationListener) (this)));
	//  116  250:aload_0         
	//  117  251:getfield        #144 <Field TransformKeyframeAnimation transform>
	//  118  254:aload_0         
	//  119  255:invokevirtual   #150 <Method void TransformKeyframeAnimation.addListener(BaseKeyframeAnimation$AnimationListener)>
		transform.addAnimationsToLayer(this);
	//  120  258:aload_0         
	//  121  259:getfield        #144 <Field TransformKeyframeAnimation transform>
	//  122  262:aload_0         
	//  123  263:invokevirtual   #154 <Method void TransformKeyframeAnimation.addAnimationsToLayer(BaseLayer)>
		if(layer.getMasks() != null && !layer.getMasks().isEmpty())
	//* 124  266:aload_2         
	//* 125  267:invokevirtual   #158 <Method List Layer.getMasks()>
	//* 126  270:ifnull          345
	//* 127  273:aload_2         
	//* 128  274:invokevirtual   #158 <Method List Layer.getMasks()>
	//* 129  277:invokeinterface #164 <Method boolean List.isEmpty()>
	//* 130  282:ifne            345
		{
			mask = new MaskKeyframeAnimation(layer.getMasks());
	//  131  285:aload_0         
	//  132  286:new             #166 <Class MaskKeyframeAnimation>
	//  133  289:dup             
	//  134  290:aload_2         
	//  135  291:invokevirtual   #158 <Method List Layer.getMasks()>
	//  136  294:invokespecial   #169 <Method void MaskKeyframeAnimation(List)>
	//  137  297:putfield        #171 <Field MaskKeyframeAnimation mask>
			for(lottiedrawable = ((LottieDrawable) (mask.getMaskAnimations().iterator())); ((Iterator) (lottiedrawable)).hasNext(); ((BaseKeyframeAnimation) (layer)).addUpdateListener(((BaseKeyframeAnimation.AnimationListener) (this))))
	//* 138  300:aload_0         
	//* 139  301:getfield        #171 <Field MaskKeyframeAnimation mask>
	//* 140  304:invokevirtual   #174 <Method List MaskKeyframeAnimation.getMaskAnimations()>
	//* 141  307:invokeinterface #178 <Method Iterator List.iterator()>
	//* 142  312:astore_1        
	//* 143  313:aload_1         
	//* 144  314:invokeinterface #183 <Method boolean Iterator.hasNext()>
	//* 145  319:ifeq            345
			{
				layer = ((Layer) ((BaseKeyframeAnimation)((Iterator) (lottiedrawable)).next()));
	//  146  322:aload_1         
	//  147  323:invokeinterface #187 <Method Object Iterator.next()>
	//  148  328:checkcast       #189 <Class BaseKeyframeAnimation>
	//  149  331:astore_2        
				addAnimation(((BaseKeyframeAnimation) (layer)));
	//  150  332:aload_0         
	//  151  333:aload_2         
	//  152  334:invokevirtual   #193 <Method void addAnimation(BaseKeyframeAnimation)>
			}

	//  153  337:aload_2         
	//  154  338:aload_0         
	//  155  339:invokevirtual   #196 <Method void BaseKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
		}
	//* 156  342:goto            313
		setupInOutAnimations();
	//  157  345:aload_0         
	//  158  346:invokespecial   #199 <Method void setupInOutAnimations()>
	//  159  349:return          
	}

	private void applyMasks(Canvas canvas, Matrix matrix1)
	{
		canvas.saveLayer(rect, maskPaint, 19);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #80  <Field RectF rect>
	//    3    5:aload_0         
	//    4    6:getfield        #70  <Field Paint maskPaint>
	//    5    9:bipush          19
	//    6   11:invokevirtual   #214 <Method int Canvas.saveLayer(RectF, Paint, int)>
	//    7   14:pop             
		clearCanvas(canvas);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokespecial   #218 <Method void clearCanvas(Canvas)>
		int j = mask.getMasks().size();
	//   11   20:aload_0         
	//   12   21:getfield        #171 <Field MaskKeyframeAnimation mask>
	//   13   24:invokevirtual   #219 <Method List MaskKeyframeAnimation.getMasks()>
	//   14   27:invokeinterface #223 <Method int List.size()>
	//   15   32:istore          4
		for(int i = 0; i < j; i++)
	//*  16   34:iconst_0        
	//*  17   35:istore_3        
	//*  18   36:iload_3         
	//*  19   37:iload           4
	//*  20   39:icmpge          159
		{
			Mask mask1 = (Mask)mask.getMasks().get(i);
	//   21   42:aload_0         
	//   22   43:getfield        #171 <Field MaskKeyframeAnimation mask>
	//   23   46:invokevirtual   #219 <Method List MaskKeyframeAnimation.getMasks()>
	//   24   49:iload_3         
	//   25   50:invokeinterface #227 <Method Object List.get(int)>
	//   26   55:checkcast       #229 <Class Mask>
	//   27   58:astore          5
			Path path1 = (Path)((BaseKeyframeAnimation)mask.getMaskAnimations().get(i)).getValue();
	//   28   60:aload_0         
	//   29   61:getfield        #171 <Field MaskKeyframeAnimation mask>
	//   30   64:invokevirtual   #174 <Method List MaskKeyframeAnimation.getMaskAnimations()>
	//   31   67:iload_3         
	//   32   68:invokeinterface #227 <Method Object List.get(int)>
	//   33   73:checkcast       #189 <Class BaseKeyframeAnimation>
	//   34   76:invokevirtual   #232 <Method Object BaseKeyframeAnimation.getValue()>
	//   35   79:checkcast       #53  <Class Path>
	//   36   82:astore          6
			path.set(path1);
	//   37   84:aload_0         
	//   38   85:getfield        #56  <Field Path path>
	//   39   88:aload           6
	//   40   90:invokevirtual   #236 <Method void Path.set(Path)>
			path.transform(matrix1);
	//   41   93:aload_0         
	//   42   94:getfield        #56  <Field Path path>
	//   43   97:aload_2         
	//   44   98:invokevirtual   #239 <Method void Path.transform(Matrix)>
			static class _cls2
			{

				static final int $SwitchMap$com$airbnb$lottie$Layer$LayerType[];
				static final int $SwitchMap$com$airbnb$lottie$Mask$MaskMode[];

				static 
				{
					$SwitchMap$com$airbnb$lottie$Mask$MaskMode = new int[Mask.MaskMode.values().length];
				//    0    0:invokestatic    #19  <Method Mask$MaskMode[] Mask$MaskMode.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$Mask$MaskMode>
					try
					{
						$SwitchMap$com$airbnb$lottie$Mask$MaskMode[Mask.MaskMode.MaskModeSubtract.ordinal()] = 1;
				//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$Mask$MaskMode>
				//    5   12:getstatic       #25  <Field Mask$MaskMode Mask$MaskMode.MaskModeSubtract>
				//    6   15:invokevirtual   #29  <Method int Mask$MaskMode.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$airbnb$lottie$Mask$MaskMode>
				//*  10   23:getstatic       #32  <Field Mask$MaskMode Mask$MaskMode.MaskModeAdd>
				//*  11   26:invokevirtual   #29  <Method int Mask$MaskMode.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:invokestatic    #37  <Method Layer$LayerType[] Layer$LayerType.values()>
				//*  15   34:arraylength     
				//*  16   35:newarray        int[]
				//*  17   37:putstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
				//*  18   40:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
				//*  19   43:getstatic       #43  <Field Layer$LayerType Layer$LayerType.Shape>
				//*  20   46:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
				//*  21   49:iconst_1        
				//*  22   50:iastore         
				//*  23   51:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
				//*  24   54:getstatic       #47  <Field Layer$LayerType Layer$LayerType.PreComp>
				//*  25   57:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
				//*  26   60:iconst_2        
				//*  27   61:iastore         
				//*  28   62:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
				//*  29   65:getstatic       #50  <Field Layer$LayerType Layer$LayerType.Solid>
				//*  30   68:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
				//*  31   71:iconst_3        
				//*  32   72:iastore         
				//*  33   73:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
				//*  34   76:getstatic       #53  <Field Layer$LayerType Layer$LayerType.Image>
				//*  35   79:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
				//*  36   82:iconst_4        
				//*  37   83:iastore         
				//*  38   84:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
				//*  39   87:getstatic       #56  <Field Layer$LayerType Layer$LayerType.Null>
				//*  40   90:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
				//*  41   93:iconst_5        
				//*  42   94:iastore         
				//*  43   95:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
				//*  44   98:getstatic       #59  <Field Layer$LayerType Layer$LayerType.Text>
				//*  45  101:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
				//*  46  104:bipush          6
				//*  47  106:iastore         
				//*  48  107:getstatic       #39  <Field int[] $SwitchMap$com$airbnb$lottie$Layer$LayerType>
				//*  49  110:getstatic       #62  <Field Layer$LayerType Layer$LayerType.Unknown>
				//*  50  113:invokevirtual   #44  <Method int Layer$LayerType.ordinal()>
				//*  51  116:bipush          7
				//*  52  118:iastore         
				//*  53  119:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   54  120:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$Mask$MaskMode[Mask.MaskMode.MaskModeAdd.ordinal()] = 2;
					}
				//*  55  121:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   56  124:astore_0        
					$SwitchMap$com$airbnb$lottie$Layer$LayerType = new int[Layer.LayerType.values().length];
					try
					{
						$SwitchMap$com$airbnb$lottie$Layer$LayerType[Layer.LayerType.Shape.ordinal()] = 1;
					}
				//*  57  125:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   58  128:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$Layer$LayerType[Layer.LayerType.PreComp.ordinal()] = 2;
					}
				//*  59  129:goto            51
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   60  132:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$Layer$LayerType[Layer.LayerType.Solid.ordinal()] = 3;
					}
				//*  61  133:goto            62
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   62  136:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$Layer$LayerType[Layer.LayerType.Image.ordinal()] = 4;
					}
				//*  63  137:goto            73
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   64  140:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$Layer$LayerType[Layer.LayerType.Null.ordinal()] = 5;
					}
				//*  65  141:goto            84
					catch(NoSuchFieldError nosuchfielderror6) { }
				//   66  144:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$Layer$LayerType[Layer.LayerType.Text.ordinal()] = 6;
					}
				//*  67  145:goto            95
					catch(NoSuchFieldError nosuchfielderror7) { }
				//   68  148:astore_0        
					try
					{
						$SwitchMap$com$airbnb$lottie$Layer$LayerType[Layer.LayerType.Unknown.ordinal()] = 7;
					}
				//*  69  149:goto            107
					catch(NoSuchFieldError nosuchfielderror8) { }
				//   70  152:astore_0        
				//*  71  153:return          
				}
			}

			if(_cls2..SwitchMap.com.airbnb.lottie.Mask.MaskMode[mask1.getMaskMode().ordinal()] != 1)
	//*  45  101:getstatic       #243 <Field int[] BaseLayer$2.$SwitchMap$com$airbnb$lottie$Mask$MaskMode>
	//*  46  104:aload           5
	//*  47  106:invokevirtual   #247 <Method Mask$MaskMode Mask.getMaskMode()>
	//*  48  109:invokevirtual   #252 <Method int Mask$MaskMode.ordinal()>
	//*  49  112:iaload          
	//*  50  113:iconst_1        
	//*  51  114:icmpeq          130
				path.setFillType(android.graphics.Path.FillType.WINDING);
	//   52  117:aload_0         
	//   53  118:getfield        #56  <Field Path path>
	//   54  121:getstatic       #258 <Field android.graphics.Path$FillType android.graphics.Path$FillType.WINDING>
	//   55  124:invokevirtual   #262 <Method void Path.setFillType(android.graphics.Path$FillType)>
			else
	//*  56  127:goto            140
				path.setFillType(android.graphics.Path.FillType.INVERSE_WINDING);
	//   57  130:aload_0         
	//   58  131:getfield        #56  <Field Path path>
	//   59  134:getstatic       #265 <Field android.graphics.Path$FillType android.graphics.Path$FillType.INVERSE_WINDING>
	//   60  137:invokevirtual   #262 <Method void Path.setFillType(android.graphics.Path$FillType)>
			canvas.drawPath(path, contentPaint);
	//   61  140:aload_1         
	//   62  141:aload_0         
	//   63  142:getfield        #56  <Field Path path>
	//   64  145:aload_0         
	//   65  146:getfield        #68  <Field Paint contentPaint>
	//   66  149:invokevirtual   #269 <Method void Canvas.drawPath(Path, Paint)>
		}

	//   67  152:iload_3         
	//   68  153:iconst_1        
	//   69  154:iadd            
	//   70  155:istore_3        
	//*  71  156:goto            36
		canvas.restore();
	//   72  159:aload_1         
	//   73  160:invokevirtual   #272 <Method void Canvas.restore()>
	//   74  163:return          
	}

	private void buildParentLayerListIfNeeded()
	{
		if(parentLayers != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #275 <Field List parentLayers>
	//*   2    4:ifnull          8
			return;
	//    3    7:return          
		if(parentLayer == null)
	//*   4    8:aload_0         
	//*   5    9:getfield        #277 <Field BaseLayer parentLayer>
	//*   6   12:ifnonnull       23
		{
			parentLayers = Collections.emptyList();
	//    7   15:aload_0         
	//    8   16:invokestatic    #282 <Method List Collections.emptyList()>
	//    9   19:putfield        #275 <Field List parentLayers>
			return;
	//   10   22:return          
		}
		parentLayers = ((List) (new ArrayList()));
	//   11   23:aload_0         
	//   12   24:new             #90  <Class ArrayList>
	//   13   27:dup             
	//   14   28:invokespecial   #91  <Method void ArrayList()>
	//   15   31:putfield        #275 <Field List parentLayers>
		for(BaseLayer baselayer = parentLayer; baselayer != null; baselayer = baselayer.parentLayer)
	//*  16   34:aload_0         
	//*  17   35:getfield        #277 <Field BaseLayer parentLayer>
	//*  18   38:astore_1        
	//*  19   39:aload_1         
	//*  20   40:ifnull          62
			parentLayers.add(((Object) (baselayer)));
	//   21   43:aload_0         
	//   22   44:getfield        #275 <Field List parentLayers>
	//   23   47:aload_1         
	//   24   48:invokeinterface #286 <Method boolean List.add(Object)>
	//   25   53:pop             

	//   26   54:aload_1         
	//   27   55:getfield        #277 <Field BaseLayer parentLayer>
	//   28   58:astore_1        
	//*  29   59:goto            39
	//   30   62:return          
	}

	private void clearCanvas(Canvas canvas)
	{
		canvas.drawRect(rect.left - 1.0F, rect.top - 1.0F, rect.right + 1.0F, rect.bottom + 1.0F, clearPaint);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #80  <Field RectF rect>
	//    3    5:getfield        #290 <Field float RectF.left>
	//    4    8:fconst_1        
	//    5    9:fsub            
	//    6   10:aload_0         
	//    7   11:getfield        #80  <Field RectF rect>
	//    8   14:getfield        #293 <Field float RectF.top>
	//    9   17:fconst_1        
	//   10   18:fsub            
	//   11   19:aload_0         
	//   12   20:getfield        #80  <Field RectF rect>
	//   13   23:getfield        #296 <Field float RectF.right>
	//   14   26:fconst_1        
	//   15   27:fadd            
	//   16   28:aload_0         
	//   17   29:getfield        #80  <Field RectF rect>
	//   18   32:getfield        #299 <Field float RectF.bottom>
	//   19   35:fconst_1        
	//   20   36:fadd            
	//   21   37:aload_0         
	//   22   38:getfield        #75  <Field Paint clearPaint>
	//   23   41:invokevirtual   #303 <Method void Canvas.drawRect(float, float, float, float, Paint)>
	//   24   44:return          
	}

	static BaseLayer forModel(Layer layer, LottieDrawable lottiedrawable, LottieComposition lottiecomposition)
	{
		switch(_cls2..SwitchMap.com.airbnb.lottie.Layer.LayerType[layer.getLayerType().ordinal()])
	//*   0    0:getstatic       #308 <Field int[] BaseLayer$2.$SwitchMap$com$airbnb$lottie$Layer$LayerType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #312 <Method Layer$LayerType Layer.getLayerType()>
	//*   3    7:invokevirtual   #315 <Method int Layer$LayerType.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 5: default 44
	//	               1 143
	//	               2 124
	//	               3 114
	//	               4 100
	//	               5 90
		default:
			lottiecomposition = ((LottieComposition) (new StringBuilder()));
	//    6   44:new             #317 <Class StringBuilder>
	//    7   47:dup             
	//    8   48:invokespecial   #318 <Method void StringBuilder()>
	//    9   51:astore_2        
			((StringBuilder) (lottiecomposition)).append("Unknown layer type ");
	//   10   52:aload_2         
	//   11   53:ldc2            #320 <String "Unknown layer type ">
	//   12   56:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//   13   59:pop             
			((StringBuilder) (lottiecomposition)).append(((Object) (layer.getLayerType())));
	//   14   60:aload_2         
	//   15   61:aload_0         
	//   16   62:invokevirtual   #312 <Method Layer$LayerType Layer.getLayerType()>
	//   17   65:invokevirtual   #327 <Method StringBuilder StringBuilder.append(Object)>
	//   18   68:pop             
			Log.w("LOTTIE", ((StringBuilder) (lottiecomposition)).toString());
	//   19   69:ldc2            #329 <String "LOTTIE">
	//   20   72:aload_2         
	//   21   73:invokevirtual   #333 <Method String StringBuilder.toString()>
	//   22   76:invokestatic    #339 <Method int Log.w(String, String)>
	//   23   79:pop             
			return ((BaseLayer) (new NullLayer(lottiedrawable, layer)));
	//   24   80:new             #341 <Class NullLayer>
	//   25   83:dup             
	//   26   84:aload_1         
	//   27   85:aload_0         
	//   28   86:invokespecial   #343 <Method void NullLayer(LottieDrawable, Layer)>
	//   29   89:areturn         

		case 5: // '\005'
			return ((BaseLayer) (new NullLayer(lottiedrawable, layer)));
	//   30   90:new             #341 <Class NullLayer>
	//   31   93:dup             
	//   32   94:aload_1         
	//   33   95:aload_0         
	//   34   96:invokespecial   #343 <Method void NullLayer(LottieDrawable, Layer)>
	//   35   99:areturn         

		case 4: // '\004'
			return ((BaseLayer) (new ImageLayer(lottiedrawable, layer, lottiecomposition.getDpScale())));
	//   36  100:new             #345 <Class ImageLayer>
	//   37  103:dup             
	//   38  104:aload_1         
	//   39  105:aload_0         
	//   40  106:aload_2         
	//   41  107:invokevirtual   #351 <Method float LottieComposition.getDpScale()>
	//   42  110:invokespecial   #354 <Method void ImageLayer(LottieDrawable, Layer, float)>
	//   43  113:areturn         

		case 3: // '\003'
			return ((BaseLayer) (new SolidLayer(lottiedrawable, layer)));
	//   44  114:new             #356 <Class SolidLayer>
	//   45  117:dup             
	//   46  118:aload_1         
	//   47  119:aload_0         
	//   48  120:invokespecial   #357 <Method void SolidLayer(LottieDrawable, Layer)>
	//   49  123:areturn         

		case 2: // '\002'
			return ((BaseLayer) (new CompositionLayer(lottiedrawable, layer, lottiecomposition.getPrecomps(layer.getRefId()), lottiecomposition)));
	//   50  124:new             #359 <Class CompositionLayer>
	//   51  127:dup             
	//   52  128:aload_1         
	//   53  129:aload_0         
	//   54  130:aload_2         
	//   55  131:aload_0         
	//   56  132:invokevirtual   #362 <Method String Layer.getRefId()>
	//   57  135:invokevirtual   #366 <Method List LottieComposition.getPrecomps(String)>
	//   58  138:aload_2         
	//   59  139:invokespecial   #369 <Method void CompositionLayer(LottieDrawable, Layer, List, LottieComposition)>
	//   60  142:areturn         

		case 1: // '\001'
			return ((BaseLayer) (new ShapeLayer(lottiedrawable, layer)));
	//   61  143:new             #371 <Class ShapeLayer>
	//   62  146:dup             
	//   63  147:aload_1         
	//   64  148:aload_0         
	//   65  149:invokespecial   #372 <Method void ShapeLayer(LottieDrawable, Layer)>
	//   66  152:areturn         
		}
	}

	private void intersectBoundsWithMask(RectF rectf, Matrix matrix1)
	{
		maskBoundsRect.set(0.0F, 0.0F, 0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field RectF maskBoundsRect>
	//    2    4:fconst_0        
	//    3    5:fconst_0        
	//    4    6:fconst_0        
	//    5    7:fconst_0        
	//    6    8:invokevirtual   #377 <Method void RectF.set(float, float, float, float)>
		if(!hasMasksOnThisLayer())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #380 <Method boolean hasMasksOnThisLayer()>
	//*   9   15:ifne            19
			return;
	//   10   18:return          
		int j = mask.getMasks().size();
	//   11   19:aload_0         
	//   12   20:getfield        #171 <Field MaskKeyframeAnimation mask>
	//   13   23:invokevirtual   #219 <Method List MaskKeyframeAnimation.getMasks()>
	//   14   26:invokeinterface #223 <Method int List.size()>
	//   15   31:istore          4
		for(int i = 0; i < j;)
	//*  16   33:iconst_0        
	//*  17   34:istore_3        
	//*  18   35:iload_3         
	//*  19   36:iload           4
	//*  20   38:icmpge          231
		{
			Mask mask1 = (Mask)mask.getMasks().get(i);
	//   21   41:aload_0         
	//   22   42:getfield        #171 <Field MaskKeyframeAnimation mask>
	//   23   45:invokevirtual   #219 <Method List MaskKeyframeAnimation.getMasks()>
	//   24   48:iload_3         
	//   25   49:invokeinterface #227 <Method Object List.get(int)>
	//   26   54:checkcast       #229 <Class Mask>
	//   27   57:astore          5
			Path path1 = (Path)((BaseKeyframeAnimation)mask.getMaskAnimations().get(i)).getValue();
	//   28   59:aload_0         
	//   29   60:getfield        #171 <Field MaskKeyframeAnimation mask>
	//   30   63:invokevirtual   #174 <Method List MaskKeyframeAnimation.getMaskAnimations()>
	//   31   66:iload_3         
	//   32   67:invokeinterface #227 <Method Object List.get(int)>
	//   33   72:checkcast       #189 <Class BaseKeyframeAnimation>
	//   34   75:invokevirtual   #232 <Method Object BaseKeyframeAnimation.getValue()>
	//   35   78:checkcast       #53  <Class Path>
	//   36   81:astore          6
			path.set(path1);
	//   37   83:aload_0         
	//   38   84:getfield        #56  <Field Path path>
	//   39   87:aload           6
	//   40   89:invokevirtual   #236 <Method void Path.set(Path)>
			path.transform(matrix1);
	//   41   92:aload_0         
	//   42   93:getfield        #56  <Field Path path>
	//   43   96:aload_2         
	//   44   97:invokevirtual   #239 <Method void Path.transform(Matrix)>
			if(_cls2..SwitchMap.com.airbnb.lottie.Mask.MaskMode[mask1.getMaskMode().ordinal()] != 1)
	//*  45  100:getstatic       #243 <Field int[] BaseLayer$2.$SwitchMap$com$airbnb$lottie$Mask$MaskMode>
	//*  46  103:aload           5
	//*  47  105:invokevirtual   #247 <Method Mask$MaskMode Mask.getMaskMode()>
	//*  48  108:invokevirtual   #252 <Method int Mask$MaskMode.ordinal()>
	//*  49  111:iaload          
	//*  50  112:iconst_1        
	//*  51  113:icmpeq          230
			{
				path.computeBounds(tempMaskBoundsRect, false);
	//   52  116:aload_0         
	//   53  117:getfield        #56  <Field Path path>
	//   54  120:aload_0         
	//   55  121:getfield        #86  <Field RectF tempMaskBoundsRect>
	//   56  124:iconst_0        
	//   57  125:invokevirtual   #384 <Method void Path.computeBounds(RectF, boolean)>
				if(i == 0)
	//*  58  128:iload_3         
	//*  59  129:ifne            146
				{
					maskBoundsRect.set(tempMaskBoundsRect);
	//   60  132:aload_0         
	//   61  133:getfield        #82  <Field RectF maskBoundsRect>
	//   62  136:aload_0         
	//   63  137:getfield        #86  <Field RectF tempMaskBoundsRect>
	//   64  140:invokevirtual   #387 <Method void RectF.set(RectF)>
				} else
	//*  65  143:goto            223
				{
					RectF rectf1 = maskBoundsRect;
	//   66  146:aload_0         
	//   67  147:getfield        #82  <Field RectF maskBoundsRect>
	//   68  150:astore          5
					rectf1.set(Math.min(rectf1.left, tempMaskBoundsRect.left), Math.min(maskBoundsRect.top, tempMaskBoundsRect.top), Math.max(maskBoundsRect.right, tempMaskBoundsRect.right), Math.max(maskBoundsRect.bottom, tempMaskBoundsRect.bottom));
	//   69  152:aload           5
	//   70  154:aload           5
	//   71  156:getfield        #290 <Field float RectF.left>
	//   72  159:aload_0         
	//   73  160:getfield        #86  <Field RectF tempMaskBoundsRect>
	//   74  163:getfield        #290 <Field float RectF.left>
	//   75  166:invokestatic    #393 <Method float Math.min(float, float)>
	//   76  169:aload_0         
	//   77  170:getfield        #82  <Field RectF maskBoundsRect>
	//   78  173:getfield        #293 <Field float RectF.top>
	//   79  176:aload_0         
	//   80  177:getfield        #86  <Field RectF tempMaskBoundsRect>
	//   81  180:getfield        #293 <Field float RectF.top>
	//   82  183:invokestatic    #393 <Method float Math.min(float, float)>
	//   83  186:aload_0         
	//   84  187:getfield        #82  <Field RectF maskBoundsRect>
	//   85  190:getfield        #296 <Field float RectF.right>
	//   86  193:aload_0         
	//   87  194:getfield        #86  <Field RectF tempMaskBoundsRect>
	//   88  197:getfield        #296 <Field float RectF.right>
	//   89  200:invokestatic    #396 <Method float Math.max(float, float)>
	//   90  203:aload_0         
	//   91  204:getfield        #82  <Field RectF maskBoundsRect>
	//   92  207:getfield        #299 <Field float RectF.bottom>
	//   93  210:aload_0         
	//   94  211:getfield        #86  <Field RectF tempMaskBoundsRect>
	//   95  214:getfield        #299 <Field float RectF.bottom>
	//   96  217:invokestatic    #396 <Method float Math.max(float, float)>
	//   97  220:invokevirtual   #377 <Method void RectF.set(float, float, float, float)>
				}
				i++;
	//   98  223:iload_3         
	//   99  224:iconst_1        
	//  100  225:iadd            
	//  101  226:istore_3        
			} else
	//* 102  227:goto            35
			{
				return;
	//  103  230:return          
			}
		}

		rectf.set(Math.max(rectf.left, maskBoundsRect.left), Math.max(rectf.top, maskBoundsRect.top), Math.min(rectf.right, maskBoundsRect.right), Math.min(rectf.bottom, maskBoundsRect.bottom));
	//  104  231:aload_1         
	//  105  232:aload_1         
	//  106  233:getfield        #290 <Field float RectF.left>
	//  107  236:aload_0         
	//  108  237:getfield        #82  <Field RectF maskBoundsRect>
	//  109  240:getfield        #290 <Field float RectF.left>
	//  110  243:invokestatic    #396 <Method float Math.max(float, float)>
	//  111  246:aload_1         
	//  112  247:getfield        #293 <Field float RectF.top>
	//  113  250:aload_0         
	//  114  251:getfield        #82  <Field RectF maskBoundsRect>
	//  115  254:getfield        #293 <Field float RectF.top>
	//  116  257:invokestatic    #396 <Method float Math.max(float, float)>
	//  117  260:aload_1         
	//  118  261:getfield        #296 <Field float RectF.right>
	//  119  264:aload_0         
	//  120  265:getfield        #82  <Field RectF maskBoundsRect>
	//  121  268:getfield        #296 <Field float RectF.right>
	//  122  271:invokestatic    #393 <Method float Math.min(float, float)>
	//  123  274:aload_1         
	//  124  275:getfield        #299 <Field float RectF.bottom>
	//  125  278:aload_0         
	//  126  279:getfield        #82  <Field RectF maskBoundsRect>
	//  127  282:getfield        #299 <Field float RectF.bottom>
	//  128  285:invokestatic    #393 <Method float Math.min(float, float)>
	//  129  288:invokevirtual   #377 <Method void RectF.set(float, float, float, float)>
	//  130  291:return          
	}

	private void intersectBoundsWithMatte(RectF rectf, Matrix matrix1)
	{
		if(!hasMatteOnThisLayer())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #400 <Method boolean hasMatteOnThisLayer()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(layerModel.getMatteType() == Layer.MatteType.Invert)
	//*   4    8:aload_0         
	//*   5    9:getfield        #99  <Field Layer layerModel>
	//*   6   12:invokevirtual   #123 <Method Layer$MatteType Layer.getMatteType()>
	//*   7   15:getstatic       #129 <Field Layer$MatteType Layer$MatteType.Invert>
	//*   8   18:if_acmpne       22
		{
			return;
	//    9   21:return          
		} else
		{
			matteLayer.getBounds(matteBoundsRect, matrix1);
	//   10   22:aload_0         
	//   11   23:getfield        #402 <Field BaseLayer matteLayer>
	//   12   26:aload_0         
	//   13   27:getfield        #84  <Field RectF matteBoundsRect>
	//   14   30:aload_2         
	//   15   31:invokevirtual   #405 <Method void getBounds(RectF, Matrix)>
			rectf.set(Math.max(rectf.left, matteBoundsRect.left), Math.max(rectf.top, matteBoundsRect.top), Math.min(rectf.right, matteBoundsRect.right), Math.min(rectf.bottom, matteBoundsRect.bottom));
	//   16   34:aload_1         
	//   17   35:aload_1         
	//   18   36:getfield        #290 <Field float RectF.left>
	//   19   39:aload_0         
	//   20   40:getfield        #84  <Field RectF matteBoundsRect>
	//   21   43:getfield        #290 <Field float RectF.left>
	//   22   46:invokestatic    #396 <Method float Math.max(float, float)>
	//   23   49:aload_1         
	//   24   50:getfield        #293 <Field float RectF.top>
	//   25   53:aload_0         
	//   26   54:getfield        #84  <Field RectF matteBoundsRect>
	//   27   57:getfield        #293 <Field float RectF.top>
	//   28   60:invokestatic    #396 <Method float Math.max(float, float)>
	//   29   63:aload_1         
	//   30   64:getfield        #296 <Field float RectF.right>
	//   31   67:aload_0         
	//   32   68:getfield        #84  <Field RectF matteBoundsRect>
	//   33   71:getfield        #296 <Field float RectF.right>
	//   34   74:invokestatic    #393 <Method float Math.min(float, float)>
	//   35   77:aload_1         
	//   36   78:getfield        #299 <Field float RectF.bottom>
	//   37   81:aload_0         
	//   38   82:getfield        #84  <Field RectF matteBoundsRect>
	//   39   85:getfield        #299 <Field float RectF.bottom>
	//   40   88:invokestatic    #393 <Method float Math.min(float, float)>
	//   41   91:invokevirtual   #377 <Method void RectF.set(float, float, float, float)>
			return;
	//   42   94:return          
		}
	}

	private void invalidateSelf()
	{
		lottieDrawable.invalidateSelf();
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field LottieDrawable lottieDrawable>
	//    2    4:invokevirtual   #410 <Method void LottieDrawable.invalidateSelf()>
	//    3    7:return          
	}

	private void setVisible(boolean flag)
	{
		if(flag != visible)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #95  <Field boolean visible>
	//*   3    5:icmpeq          17
		{
			visible = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #95  <Field boolean visible>
			invalidateSelf();
	//    7   13:aload_0         
	//    8   14:invokespecial   #411 <Method void invalidateSelf()>
		}
	//    9   17:return          
	}

	private void setupInOutAnimations()
	{
		boolean flag1 = layerModel.getInOutKeyframes().isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Layer layerModel>
	//    2    4:invokevirtual   #414 <Method List Layer.getInOutKeyframes()>
	//    3    7:invokeinterface #164 <Method boolean List.isEmpty()>
	//    4   12:istore_2        
		boolean flag = true;
	//    5   13:iconst_1        
	//    6   14:istore_1        
		if(!flag1)
	//*   7   15:iload_2         
	//*   8   16:ifne            82
		{
			final FloatKeyframeAnimation inOutAnimation = new FloatKeyframeAnimation(layerModel.getInOutKeyframes());
	//    9   19:new             #416 <Class FloatKeyframeAnimation>
	//   10   22:dup             
	//   11   23:aload_0         
	//   12   24:getfield        #99  <Field Layer layerModel>
	//   13   27:invokevirtual   #414 <Method List Layer.getInOutKeyframes()>
	//   14   30:invokespecial   #417 <Method void FloatKeyframeAnimation(List)>
	//   15   33:astore_3        
			inOutAnimation.setIsDiscrete();
	//   16   34:aload_3         
	//   17   35:invokevirtual   #420 <Method void FloatKeyframeAnimation.setIsDiscrete()>
			inOutAnimation.addUpdateListener(new BaseKeyframeAnimation.AnimationListener() {

				public void onValueChanged()
				{
					BaseLayer baselayer = BaseLayer.this;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field BaseLayer this$0>
				//    2    4:astore_2        
					boolean flag2;
					if(((Float)inOutAnimation.getValue()).floatValue() == 1.0F)
				//*   3    5:aload_0         
				//*   4    6:getfield        #21  <Field FloatKeyframeAnimation val$inOutAnimation>
				//*   5    9:invokevirtual   #31  <Method Object FloatKeyframeAnimation.getValue()>
				//*   6   12:checkcast       #33  <Class Float>
				//*   7   15:invokevirtual   #37  <Method float Float.floatValue()>
				//*   8   18:fconst_1        
				//*   9   19:fcmpl           
				//*  10   20:ifne            28
						flag2 = true;
				//   11   23:iconst_1        
				//   12   24:istore_1        
					else
				//*  13   25:goto            30
						flag2 = false;
				//   14   28:iconst_0        
				//   15   29:istore_1        
					baselayer.setVisible(flag2);
				//   16   30:aload_2         
				//   17   31:iload_1         
				//   18   32:invokestatic    #41  <Method void BaseLayer.access$000(BaseLayer, boolean)>
				//   19   35:return          
				}

				final BaseLayer this$0;
				final FloatKeyframeAnimation val$inOutAnimation;

			
			{
				this$0 = BaseLayer.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field BaseLayer this$0>
				inOutAnimation = floatkeyframeanimation;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field FloatKeyframeAnimation val$inOutAnimation>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   18   38:aload_3         
	//   19   39:new             #10  <Class BaseLayer$1>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:invokespecial   #423 <Method void BaseLayer$1(BaseLayer, FloatKeyframeAnimation)>
	//   24   48:invokevirtual   #424 <Method void FloatKeyframeAnimation.addUpdateListener(BaseKeyframeAnimation$AnimationListener)>
			if(((Float)inOutAnimation.getValue()).floatValue() != 1.0F)
	//*  25   51:aload_3         
	//*  26   52:invokevirtual   #425 <Method Object FloatKeyframeAnimation.getValue()>
	//*  27   55:checkcast       #427 <Class Float>
	//*  28   58:invokevirtual   #430 <Method float Float.floatValue()>
	//*  29   61:fconst_1        
	//*  30   62:fcmpl           
	//*  31   63:ifne            69
	//*  32   66:goto            71
				flag = false;
	//   33   69:iconst_0        
	//   34   70:istore_1        
			setVisible(flag);
	//   35   71:aload_0         
	//   36   72:iload_1         
	//   37   73:invokespecial   #206 <Method void setVisible(boolean)>
			addAnimation(((BaseKeyframeAnimation) (inOutAnimation)));
	//   38   76:aload_0         
	//   39   77:aload_3         
	//   40   78:invokevirtual   #193 <Method void addAnimation(BaseKeyframeAnimation)>
			return;
	//   41   81:return          
		} else
		{
			setVisible(true);
	//   42   82:aload_0         
	//   43   83:iconst_1        
	//   44   84:invokespecial   #206 <Method void setVisible(boolean)>
			return;
	//   45   87:return          
		}
	}

	void addAnimation(BaseKeyframeAnimation basekeyframeanimation)
	{
		if(!(basekeyframeanimation instanceof StaticKeyframeAnimation))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #432 <Class StaticKeyframeAnimation>
	//*   2    4:ifne            18
			animations.add(((Object) (basekeyframeanimation)));
	//    3    7:aload_0         
	//    4    8:getfield        #93  <Field List animations>
	//    5   11:aload_1         
	//    6   12:invokeinterface #286 <Method boolean List.add(Object)>
	//    7   17:pop             
	//    8   18:return          
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
	//    0    0:return          
	}

	public void draw(Canvas canvas, Matrix matrix1, int i)
	{
		if(!visible)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field boolean visible>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		buildParentLayerListIfNeeded();
	//    4    8:aload_0         
	//    5    9:invokespecial   #441 <Method void buildParentLayerListIfNeeded()>
		matrix.reset();
	//    6   12:aload_0         
	//    7   13:getfield        #61  <Field Matrix matrix>
	//    8   16:invokevirtual   #444 <Method void Matrix.reset()>
		matrix.set(matrix1);
	//    9   19:aload_0         
	//   10   20:getfield        #61  <Field Matrix matrix>
	//   11   23:aload_2         
	//   12   24:invokevirtual   #446 <Method void Matrix.set(Matrix)>
		for(int j = parentLayers.size() - 1; j >= 0; j--)
	//*  13   27:aload_0         
	//*  14   28:getfield        #275 <Field List parentLayers>
	//*  15   31:invokeinterface #223 <Method int List.size()>
	//*  16   36:iconst_1        
	//*  17   37:isub            
	//*  18   38:istore          4
	//*  19   40:iload           4
	//*  20   42:iflt            82
			matrix.preConcat(((BaseLayer)parentLayers.get(j)).transform.getMatrix());
	//   21   45:aload_0         
	//   22   46:getfield        #61  <Field Matrix matrix>
	//   23   49:aload_0         
	//   24   50:getfield        #275 <Field List parentLayers>
	//   25   53:iload           4
	//   26   55:invokeinterface #227 <Method Object List.get(int)>
	//   27   60:checkcast       #2   <Class BaseLayer>
	//   28   63:getfield        #144 <Field TransformKeyframeAnimation transform>
	//   29   66:invokevirtual   #450 <Method Matrix TransformKeyframeAnimation.getMatrix()>
	//   30   69:invokevirtual   #454 <Method boolean Matrix.preConcat(Matrix)>
	//   31   72:pop             

	//   32   73:iload           4
	//   33   75:iconst_1        
	//   34   76:isub            
	//   35   77:istore          4
	//*  36   79:goto            40
		i = (int)(((((float)i / 255F) * (float)((Integer)transform.getOpacity().getValue()).intValue()) / 100F) * 255F);
	//   37   82:iload_3         
	//   38   83:i2f             
	//   39   84:ldc2            #455 <Float 255F>
	//   40   87:fdiv            
	//   41   88:aload_0         
	//   42   89:getfield        #144 <Field TransformKeyframeAnimation transform>
	//   43   92:invokevirtual   #459 <Method BaseKeyframeAnimation TransformKeyframeAnimation.getOpacity()>
	//   44   95:invokevirtual   #232 <Method Object BaseKeyframeAnimation.getValue()>
	//   45   98:checkcast       #461 <Class Integer>
	//   46  101:invokevirtual   #464 <Method int Integer.intValue()>
	//   47  104:i2f             
	//   48  105:fmul            
	//   49  106:ldc2            #465 <Float 100F>
	//   50  109:fdiv            
	//   51  110:ldc2            #455 <Float 255F>
	//   52  113:fmul            
	//   53  114:f2i             
	//   54  115:istore_3        
		if(!hasMatteOnThisLayer() && !hasMasksOnThisLayer())
	//*  55  116:aload_0         
	//*  56  117:invokevirtual   #400 <Method boolean hasMatteOnThisLayer()>
	//*  57  120:ifne            156
	//*  58  123:aload_0         
	//*  59  124:invokevirtual   #380 <Method boolean hasMasksOnThisLayer()>
	//*  60  127:ifne            156
		{
			matrix.preConcat(transform.getMatrix());
	//   61  130:aload_0         
	//   62  131:getfield        #61  <Field Matrix matrix>
	//   63  134:aload_0         
	//   64  135:getfield        #144 <Field TransformKeyframeAnimation transform>
	//   65  138:invokevirtual   #450 <Method Matrix TransformKeyframeAnimation.getMatrix()>
	//   66  141:invokevirtual   #454 <Method boolean Matrix.preConcat(Matrix)>
	//   67  144:pop             
			drawLayer(canvas, matrix, i);
	//   68  145:aload_0         
	//   69  146:aload_1         
	//   70  147:aload_0         
	//   71  148:getfield        #61  <Field Matrix matrix>
	//   72  151:iload_3         
	//   73  152:invokevirtual   #468 <Method void drawLayer(Canvas, Matrix, int)>
			return;
	//   74  155:return          
		}
		rect.set(0.0F, 0.0F, 0.0F, 0.0F);
	//   75  156:aload_0         
	//   76  157:getfield        #80  <Field RectF rect>
	//   77  160:fconst_0        
	//   78  161:fconst_0        
	//   79  162:fconst_0        
	//   80  163:fconst_0        
	//   81  164:invokevirtual   #377 <Method void RectF.set(float, float, float, float)>
		getBounds(rect, matrix);
	//   82  167:aload_0         
	//   83  168:aload_0         
	//   84  169:getfield        #80  <Field RectF rect>
	//   85  172:aload_0         
	//   86  173:getfield        #61  <Field Matrix matrix>
	//   87  176:invokevirtual   #405 <Method void getBounds(RectF, Matrix)>
		intersectBoundsWithMatte(rect, matrix);
	//   88  179:aload_0         
	//   89  180:aload_0         
	//   90  181:getfield        #80  <Field RectF rect>
	//   91  184:aload_0         
	//   92  185:getfield        #61  <Field Matrix matrix>
	//   93  188:invokespecial   #470 <Method void intersectBoundsWithMatte(RectF, Matrix)>
		matrix.preConcat(transform.getMatrix());
	//   94  191:aload_0         
	//   95  192:getfield        #61  <Field Matrix matrix>
	//   96  195:aload_0         
	//   97  196:getfield        #144 <Field TransformKeyframeAnimation transform>
	//   98  199:invokevirtual   #450 <Method Matrix TransformKeyframeAnimation.getMatrix()>
	//   99  202:invokevirtual   #454 <Method boolean Matrix.preConcat(Matrix)>
	//  100  205:pop             
		intersectBoundsWithMask(rect, matrix);
	//  101  206:aload_0         
	//  102  207:aload_0         
	//  103  208:getfield        #80  <Field RectF rect>
	//  104  211:aload_0         
	//  105  212:getfield        #61  <Field Matrix matrix>
	//  106  215:invokespecial   #472 <Method void intersectBoundsWithMask(RectF, Matrix)>
		rect.set(0.0F, 0.0F, canvas.getWidth(), canvas.getHeight());
	//  107  218:aload_0         
	//  108  219:getfield        #80  <Field RectF rect>
	//  109  222:fconst_0        
	//  110  223:fconst_0        
	//  111  224:aload_1         
	//  112  225:invokevirtual   #475 <Method int Canvas.getWidth()>
	//  113  228:i2f             
	//  114  229:aload_1         
	//  115  230:invokevirtual   #478 <Method int Canvas.getHeight()>
	//  116  233:i2f             
	//  117  234:invokevirtual   #377 <Method void RectF.set(float, float, float, float)>
		canvas.saveLayer(rect, contentPaint, 31);
	//  118  237:aload_1         
	//  119  238:aload_0         
	//  120  239:getfield        #80  <Field RectF rect>
	//  121  242:aload_0         
	//  122  243:getfield        #68  <Field Paint contentPaint>
	//  123  246:bipush          31
	//  124  248:invokevirtual   #214 <Method int Canvas.saveLayer(RectF, Paint, int)>
	//  125  251:pop             
		clearCanvas(canvas);
	//  126  252:aload_0         
	//  127  253:aload_1         
	//  128  254:invokespecial   #218 <Method void clearCanvas(Canvas)>
		drawLayer(canvas, matrix, i);
	//  129  257:aload_0         
	//  130  258:aload_1         
	//  131  259:aload_0         
	//  132  260:getfield        #61  <Field Matrix matrix>
	//  133  263:iload_3         
	//  134  264:invokevirtual   #468 <Method void drawLayer(Canvas, Matrix, int)>
		if(hasMasksOnThisLayer())
	//* 135  267:aload_0         
	//* 136  268:invokevirtual   #380 <Method boolean hasMasksOnThisLayer()>
	//* 137  271:ifeq            283
			applyMasks(canvas, matrix);
	//  138  274:aload_0         
	//  139  275:aload_1         
	//  140  276:aload_0         
	//  141  277:getfield        #61  <Field Matrix matrix>
	//  142  280:invokespecial   #480 <Method void applyMasks(Canvas, Matrix)>
		if(hasMatteOnThisLayer())
	//* 143  283:aload_0         
	//* 144  284:invokevirtual   #400 <Method boolean hasMatteOnThisLayer()>
	//* 145  287:ifeq            324
		{
			canvas.saveLayer(rect, mattePaint, 19);
	//  146  290:aload_1         
	//  147  291:aload_0         
	//  148  292:getfield        #80  <Field RectF rect>
	//  149  295:aload_0         
	//  150  296:getfield        #72  <Field Paint mattePaint>
	//  151  299:bipush          19
	//  152  301:invokevirtual   #214 <Method int Canvas.saveLayer(RectF, Paint, int)>
	//  153  304:pop             
			clearCanvas(canvas);
	//  154  305:aload_0         
	//  155  306:aload_1         
	//  156  307:invokespecial   #218 <Method void clearCanvas(Canvas)>
			matteLayer.draw(canvas, matrix1, i);
	//  157  310:aload_0         
	//  158  311:getfield        #402 <Field BaseLayer matteLayer>
	//  159  314:aload_1         
	//  160  315:aload_2         
	//  161  316:iload_3         
	//  162  317:invokevirtual   #482 <Method void draw(Canvas, Matrix, int)>
			canvas.restore();
	//  163  320:aload_1         
	//  164  321:invokevirtual   #272 <Method void Canvas.restore()>
		}
		canvas.restore();
	//  165  324:aload_1         
	//  166  325:invokevirtual   #272 <Method void Canvas.restore()>
	//  167  328:return          
	}

	abstract void drawLayer(Canvas canvas, Matrix matrix1, int i);

	public void getBounds(RectF rectf, Matrix matrix1)
	{
		boundsMatrix.set(matrix1);
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field Matrix boundsMatrix>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #446 <Method void Matrix.set(Matrix)>
		boundsMatrix.preConcat(transform.getMatrix());
	//    4    8:aload_0         
	//    5    9:getfield        #88  <Field Matrix boundsMatrix>
	//    6   12:aload_0         
	//    7   13:getfield        #144 <Field TransformKeyframeAnimation transform>
	//    8   16:invokevirtual   #450 <Method Matrix TransformKeyframeAnimation.getMatrix()>
	//    9   19:invokevirtual   #454 <Method boolean Matrix.preConcat(Matrix)>
	//   10   22:pop             
	//   11   23:return          
	}

	Layer getLayerModel()
	{
		return layerModel;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Layer layerModel>
	//    2    4:areturn         
	}

	public String getName()
	{
		return layerModel.getName();
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field Layer layerModel>
	//    2    4:invokevirtual   #489 <Method String Layer.getName()>
	//    3    7:areturn         
	}

	boolean hasMasksOnThisLayer()
	{
		MaskKeyframeAnimation maskkeyframeanimation = mask;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field MaskKeyframeAnimation mask>
	//    2    4:astore_1        
		return maskkeyframeanimation != null && !maskkeyframeanimation.getMaskAnimations().isEmpty();
	//    3    5:aload_1         
	//    4    6:ifnull          23
	//    5    9:aload_1         
	//    6   10:invokevirtual   #174 <Method List MaskKeyframeAnimation.getMaskAnimations()>
	//    7   13:invokeinterface #164 <Method boolean List.isEmpty()>
	//    8   18:ifne            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	boolean hasMatteOnThisLayer()
	{
		return matteLayer != null;
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field BaseLayer matteLayer>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void onValueChanged()
	{
		invalidateSelf();
	//    0    0:aload_0         
	//    1    1:invokespecial   #411 <Method void invalidateSelf()>
	//    2    4:return          
	}

	public void setContents(List list, List list1)
	{
	//    0    0:return          
	}

	void setMatteLayer(BaseLayer baselayer)
	{
		matteLayer = baselayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #402 <Field BaseLayer matteLayer>
	//    3    5:return          
	}

	void setParentLayer(BaseLayer baselayer)
	{
		parentLayer = baselayer;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #277 <Field BaseLayer parentLayer>
	//    3    5:return          
	}

	void setProgress(float f)
	{
		BaseLayer baselayer = matteLayer;
	//    0    0:aload_0         
	//    1    1:getfield        #402 <Field BaseLayer matteLayer>
	//    2    4:astore_3        
		if(baselayer != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          14
			baselayer.setProgress(f);
	//    5    9:aload_3         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #506 <Method void setProgress(float)>
		for(int i = 0; i < animations.size(); i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_2        
	//*  10   16:iload_2         
	//*  11   17:aload_0         
	//*  12   18:getfield        #93  <Field List animations>
	//*  13   21:invokeinterface #223 <Method int List.size()>
	//*  14   26:icmpge          53
			((BaseKeyframeAnimation)animations.get(i)).setProgress(f);
	//   15   29:aload_0         
	//   16   30:getfield        #93  <Field List animations>
	//   17   33:iload_2         
	//   18   34:invokeinterface #227 <Method Object List.get(int)>
	//   19   39:checkcast       #189 <Class BaseKeyframeAnimation>
	//   20   42:fload_1         
	//   21   43:invokevirtual   #507 <Method void BaseKeyframeAnimation.setProgress(float)>

	//   22   46:iload_2         
	//   23   47:iconst_1        
	//   24   48:iadd            
	//   25   49:istore_2        
	//*  26   50:goto            16
	//   27   53:return          
	}

	private final List animations = new ArrayList();
	final Matrix boundsMatrix = new Matrix();
	private final Paint clearPaint = new Paint();
	private final Paint contentPaint = new Paint(1);
	final Layer layerModel;
	final LottieDrawable lottieDrawable;
	private MaskKeyframeAnimation mask;
	private final RectF maskBoundsRect = new RectF();
	private final Paint maskPaint = new Paint(1);
	private final Matrix matrix = new Matrix();
	private final RectF matteBoundsRect = new RectF();
	private BaseLayer matteLayer;
	private final Paint mattePaint = new Paint(1);
	private BaseLayer parentLayer;
	private List parentLayers;
	private final Path path = new Path();
	private final RectF rect = new RectF();
	private final RectF tempMaskBoundsRect = new RectF();
	final TransformKeyframeAnimation transform;
	private boolean visible;


/*
	static void access$000(BaseLayer baselayer, boolean flag)
	{
		baselayer.setVisible(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #206 <Method void setVisible(boolean)>
		return;
	//    3    5:return          
	}

*/
}
