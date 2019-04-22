// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.airbnb.lottie;

import android.graphics.*;

// Referenced classes of package com.airbnb.lottie:
//			BaseLayer, Layer, LottieDrawable

class ImageLayer extends BaseLayer
{

	ImageLayer(LottieDrawable lottiedrawable, Layer layer, float f)
	{
		super(lottiedrawable, layer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #16  <Method void BaseLayer(LottieDrawable, Layer)>
	//    4    6:aload_0         
	//    5    7:new             #18  <Class Paint>
	//    6   10:dup             
	//    7   11:iconst_3        
	//    8   12:invokespecial   #21  <Method void Paint(int)>
	//    9   15:putfield        #23  <Field Paint paint>
	//   10   18:aload_0         
	//   11   19:new             #25  <Class Rect>
	//   12   22:dup             
	//   13   23:invokespecial   #28  <Method void Rect()>
	//   14   26:putfield        #30  <Field Rect src>
	//   15   29:aload_0         
	//   16   30:new             #25  <Class Rect>
	//   17   33:dup             
	//   18   34:invokespecial   #28  <Method void Rect()>
	//   19   37:putfield        #32  <Field Rect dst>
		density = f;
	//   20   40:aload_0         
	//   21   41:fload_3         
	//   22   42:putfield        #34  <Field float density>
	//   23   45:return          
	}

	private Bitmap getBitmap()
	{
		String s = layerModel.getRefId();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Layer layerModel>
	//    2    4:invokevirtual   #48  <Method String Layer.getRefId()>
	//    3    7:astore_1        
		return lottieDrawable.getImageAsset(s);
	//    4    8:aload_0         
	//    5    9:getfield        #52  <Field LottieDrawable lottieDrawable>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #58  <Method Bitmap LottieDrawable.getImageAsset(String)>
	//    8   16:areturn         
	}

	public void addColorFilter(String s, String s1, ColorFilter colorfilter)
	{
		paint.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Paint paint>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #65  <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void drawLayer(Canvas canvas, Matrix matrix, int i)
	{
		Bitmap bitmap = getBitmap();
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method Bitmap getBitmap()>
	//    2    4:astore          4
		if(bitmap == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       12
		{
			return;
	//    5   11:return          
		} else
		{
			paint.setAlpha(i);
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field Paint paint>
	//    8   16:iload_3         
	//    9   17:invokevirtual   #74  <Method void Paint.setAlpha(int)>
			canvas.save();
	//   10   20:aload_1         
	//   11   21:invokevirtual   #80  <Method int Canvas.save()>
	//   12   24:pop             
			canvas.concat(matrix);
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #84  <Method void Canvas.concat(Matrix)>
			src.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
	//   16   30:aload_0         
	//   17   31:getfield        #30  <Field Rect src>
	//   18   34:iconst_0        
	//   19   35:iconst_0        
	//   20   36:aload           4
	//   21   38:invokevirtual   #89  <Method int Bitmap.getWidth()>
	//   22   41:aload           4
	//   23   43:invokevirtual   #92  <Method int Bitmap.getHeight()>
	//   24   46:invokevirtual   #96  <Method void Rect.set(int, int, int, int)>
			dst.set(0, 0, (int)((float)bitmap.getWidth() * density), (int)((float)bitmap.getHeight() * density));
	//   25   49:aload_0         
	//   26   50:getfield        #32  <Field Rect dst>
	//   27   53:iconst_0        
	//   28   54:iconst_0        
	//   29   55:aload           4
	//   30   57:invokevirtual   #89  <Method int Bitmap.getWidth()>
	//   31   60:i2f             
	//   32   61:aload_0         
	//   33   62:getfield        #34  <Field float density>
	//   34   65:fmul            
	//   35   66:f2i             
	//   36   67:aload           4
	//   37   69:invokevirtual   #92  <Method int Bitmap.getHeight()>
	//   38   72:i2f             
	//   39   73:aload_0         
	//   40   74:getfield        #34  <Field float density>
	//   41   77:fmul            
	//   42   78:f2i             
	//   43   79:invokevirtual   #96  <Method void Rect.set(int, int, int, int)>
			canvas.drawBitmap(bitmap, src, dst, paint);
	//   44   82:aload_1         
	//   45   83:aload           4
	//   46   85:aload_0         
	//   47   86:getfield        #30  <Field Rect src>
	//   48   89:aload_0         
	//   49   90:getfield        #32  <Field Rect dst>
	//   50   93:aload_0         
	//   51   94:getfield        #23  <Field Paint paint>
	//   52   97:invokevirtual   #100 <Method void Canvas.drawBitmap(Bitmap, Rect, Rect, Paint)>
			canvas.restore();
	//   53  100:aload_1         
	//   54  101:invokevirtual   #103 <Method void Canvas.restore()>
			return;
	//   55  104:return          
		}
	}

	public void getBounds(RectF rectf, Matrix matrix)
	{
		super.getBounds(rectf, matrix);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #107 <Method void BaseLayer.getBounds(RectF, Matrix)>
		matrix = ((Matrix) (getBitmap()));
	//    4    6:aload_0         
	//    5    7:invokespecial   #71  <Method Bitmap getBitmap()>
	//    6   10:astore_2        
		if(matrix != null)
	//*   7   11:aload_2         
	//*   8   12:ifnull          60
		{
			rectf.set(rectf.left, rectf.top, Math.min(rectf.right, ((Bitmap) (matrix)).getWidth()), Math.min(rectf.bottom, ((Bitmap) (matrix)).getHeight()));
	//    9   15:aload_1         
	//   10   16:aload_1         
	//   11   17:getfield        #112 <Field float RectF.left>
	//   12   20:aload_1         
	//   13   21:getfield        #115 <Field float RectF.top>
	//   14   24:aload_1         
	//   15   25:getfield        #118 <Field float RectF.right>
	//   16   28:aload_2         
	//   17   29:invokevirtual   #89  <Method int Bitmap.getWidth()>
	//   18   32:i2f             
	//   19   33:invokestatic    #124 <Method float Math.min(float, float)>
	//   20   36:aload_1         
	//   21   37:getfield        #127 <Field float RectF.bottom>
	//   22   40:aload_2         
	//   23   41:invokevirtual   #92  <Method int Bitmap.getHeight()>
	//   24   44:i2f             
	//   25   45:invokestatic    #124 <Method float Math.min(float, float)>
	//   26   48:invokevirtual   #130 <Method void RectF.set(float, float, float, float)>
			boundsMatrix.mapRect(rectf);
	//   27   51:aload_0         
	//   28   52:getfield        #134 <Field Matrix boundsMatrix>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #140 <Method boolean Matrix.mapRect(RectF)>
	//   31   59:pop             
		}
	//   32   60:return          
	}

	private final float density;
	private final Rect dst = new Rect();
	private final Paint paint = new Paint(3);
	private final Rect src = new Rect();
}
