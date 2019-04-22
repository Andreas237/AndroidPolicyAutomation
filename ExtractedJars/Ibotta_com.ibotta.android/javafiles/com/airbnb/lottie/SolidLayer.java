// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;

// Referenced classes of package com.airbnb.lottie:
//			BaseLayer, Layer, TransformKeyframeAnimation, BaseKeyframeAnimation, 
//			LottieDrawable

class SolidLayer extends BaseLayer
{

	SolidLayer(LottieDrawable lottiedrawable, Layer layer)
	{
		super(lottiedrawable, layer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #14  <Method void BaseLayer(LottieDrawable, Layer)>
	//    4    6:aload_0         
	//    5    7:new             #16  <Class RectF>
	//    6   10:dup             
	//    7   11:invokespecial   #19  <Method void RectF()>
	//    8   14:putfield        #21  <Field RectF rect>
	//    9   17:aload_0         
	//   10   18:new             #23  <Class Paint>
	//   11   21:dup             
	//   12   22:invokespecial   #24  <Method void Paint()>
	//   13   25:putfield        #26  <Field Paint paint>
		layerModel = layer;
	//   14   28:aload_0         
	//   15   29:aload_2         
	//   16   30:putfield        #28  <Field Layer layerModel>
		paint.setAlpha(0);
	//   17   33:aload_0         
	//   18   34:getfield        #26  <Field Paint paint>
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #32  <Method void Paint.setAlpha(int)>
		paint.setStyle(android.graphics.Paint.Style.FILL);
	//   21   41:aload_0         
	//   22   42:getfield        #26  <Field Paint paint>
	//   23   45:getstatic       #38  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   24   48:invokevirtual   #42  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		paint.setColor(layer.getSolidColor());
	//   25   51:aload_0         
	//   26   52:getfield        #26  <Field Paint paint>
	//   27   55:aload_2         
	//   28   56:invokevirtual   #48  <Method int Layer.getSolidColor()>
	//   29   59:invokevirtual   #51  <Method void Paint.setColor(int)>
	//   30   62:return          
	}

	private void updateRect(Matrix matrix)
	{
		rect.set(0.0F, 0.0F, layerModel.getSolidWidth(), layerModel.getSolidHeight());
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field RectF rect>
	//    2    4:fconst_0        
	//    3    5:fconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #28  <Field Layer layerModel>
	//    6   10:invokevirtual   #57  <Method int Layer.getSolidWidth()>
	//    7   13:i2f             
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field Layer layerModel>
	//   10   18:invokevirtual   #60  <Method int Layer.getSolidHeight()>
	//   11   21:i2f             
	//   12   22:invokevirtual   #64  <Method void RectF.set(float, float, float, float)>
		matrix.mapRect(rect);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #21  <Field RectF rect>
	//   16   30:invokevirtual   #70  <Method boolean Matrix.mapRect(RectF)>
	//   17   33:pop             
	//   18   34:return          
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
		paint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Paint paint>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #77  <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void drawLayer(Canvas canvas, Matrix matrix, int i)
	{
		i = Color.alpha(layerModel.getSolidColor());
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Layer layerModel>
	//    2    4:invokevirtual   #48  <Method int Layer.getSolidColor()>
	//    3    7:invokestatic    #86  <Method int Color.alpha(int)>
	//    4   10:istore_3        
		if(i == 0)
	//*   5   11:iload_3         
	//*   6   12:ifne            16
			return;
	//    7   15:return          
		i = (int)(((((float)i / 255F) * (float)((Integer)transform.getOpacity().getValue()).intValue()) / 100F) * 255F);
	//    8   16:iload_3         
	//    9   17:i2f             
	//   10   18:ldc1            #87  <Float 255F>
	//   11   20:fdiv            
	//   12   21:aload_0         
	//   13   22:getfield        #91  <Field TransformKeyframeAnimation transform>
	//   14   25:invokevirtual   #97  <Method BaseKeyframeAnimation TransformKeyframeAnimation.getOpacity()>
	//   15   28:invokevirtual   #103 <Method Object BaseKeyframeAnimation.getValue()>
	//   16   31:checkcast       #105 <Class Integer>
	//   17   34:invokevirtual   #108 <Method int Integer.intValue()>
	//   18   37:i2f             
	//   19   38:fmul            
	//   20   39:ldc1            #109 <Float 100F>
	//   21   41:fdiv            
	//   22   42:ldc1            #87  <Float 255F>
	//   23   44:fmul            
	//   24   45:f2i             
	//   25   46:istore_3        
		paint.setAlpha(i);
	//   26   47:aload_0         
	//   27   48:getfield        #26  <Field Paint paint>
	//   28   51:iload_3         
	//   29   52:invokevirtual   #32  <Method void Paint.setAlpha(int)>
		if(i > 0)
	//*  30   55:iload_3         
	//*  31   56:ifle            76
		{
			updateRect(matrix);
	//   32   59:aload_0         
	//   33   60:aload_2         
	//   34   61:invokespecial   #111 <Method void updateRect(Matrix)>
			canvas.drawRect(rect, paint);
	//   35   64:aload_1         
	//   36   65:aload_0         
	//   37   66:getfield        #21  <Field RectF rect>
	//   38   69:aload_0         
	//   39   70:getfield        #26  <Field Paint paint>
	//   40   73:invokevirtual   #117 <Method void Canvas.drawRect(RectF, Paint)>
		}
	//   41   76:return          
	}

	public void getBounds(RectF rectf, Matrix matrix)
	{
		super.getBounds(rectf, matrix);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #121 <Method void BaseLayer.getBounds(RectF, Matrix)>
		updateRect(boundsMatrix);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:getfield        #125 <Field Matrix boundsMatrix>
	//    7   11:invokespecial   #111 <Method void updateRect(Matrix)>
		rectf.set(rect);
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:getfield        #21  <Field RectF rect>
	//   11   19:invokevirtual   #128 <Method void RectF.set(RectF)>
	//   12   22:return          
	}

	private final Layer layerModel;
	private final Paint paint = new Paint();
	private final RectF rect = new RectF();
}
