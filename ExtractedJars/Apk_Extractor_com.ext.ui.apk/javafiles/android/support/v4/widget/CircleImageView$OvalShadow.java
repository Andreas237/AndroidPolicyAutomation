// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.*;
import android.graphics.drawable.shapes.OvalShape;

// Referenced classes of package android.support.v4.widget:
//			CircleImageView

private class CircleImageView$OvalShadow extends OvalShape
{

	private void updateRadialGradient(int i)
	{
		float f = i / 2;
	//    0    0:iload_1         
	//    1    1:iconst_2        
	//    2    2:idiv            
	//    3    3:i2f             
	//    4    4:fstore_2        
		float f1 = i / 2;
	//    5    5:iload_1         
	//    6    6:iconst_2        
	//    7    7:idiv            
	//    8    8:i2f             
	//    9    9:fstore_3        
		float f2 = mShadowRadius;
	//   10   10:aload_0         
	//   11   11:getfield        #17  <Field CircleImageView this$0>
	//   12   14:getfield        #29  <Field int CircleImageView.mShadowRadius>
	//   13   17:i2f             
	//   14   18:fstore          4
		android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
	//   15   20:getstatic       #50  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   16   23:astore          5
		mRadialGradient = new RadialGradient(f, f1, f2, new int[] {
			0x3d000000, 0
		}, ((float []) (null)), tilemode);
	//   17   25:aload_0         
	//   18   26:new             #52  <Class RadialGradient>
	//   19   29:dup             
	//   20   30:fload_2         
	//   21   31:fload_3         
	//   22   32:fload           4
	//   23   34:iconst_2        
	//   24   35:newarray        int[]
	//   25   37:dup             
	//   26   38:iconst_0        
	//   27   39:ldc1            #53  <Int 0x3d000000>
	//   28   41:iastore         
	//   29   42:dup             
	//   30   43:iconst_1        
	//   31   44:iconst_0        
	//   32   45:iastore         
	//   33   46:aconst_null     
	//   34   47:aload           5
	//   35   49:invokespecial   #56  <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//   36   52:putfield        #58  <Field RadialGradient mRadialGradient>
		mShadowPaint.setShader(((android.graphics.Shader) (mRadialGradient)));
	//   37   55:aload_0         
	//   38   56:getfield        #25  <Field Paint mShadowPaint>
	//   39   59:aload_0         
	//   40   60:getfield        #58  <Field RadialGradient mRadialGradient>
	//   41   63:invokevirtual   #62  <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   42   66:pop             
	//   43   67:return          
	}

	public void draw(Canvas canvas, Paint paint)
	{
		int i = getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CircleImageView this$0>
	//    2    4:invokevirtual   #68  <Method int CircleImageView.getWidth()>
	//    3    7:istore_3        
		int j = getHeight();
	//    4    8:aload_0         
	//    5    9:getfield        #17  <Field CircleImageView this$0>
	//    6   12:invokevirtual   #71  <Method int CircleImageView.getHeight()>
	//    7   15:istore          4
		canvas.drawCircle(i / 2, j / 2, i / 2, mShadowPaint);
	//    8   17:aload_1         
	//    9   18:iload_3         
	//   10   19:iconst_2        
	//   11   20:idiv            
	//   12   21:i2f             
	//   13   22:iload           4
	//   14   24:iconst_2        
	//   15   25:idiv            
	//   16   26:i2f             
	//   17   27:iload_3         
	//   18   28:iconst_2        
	//   19   29:idiv            
	//   20   30:i2f             
	//   21   31:aload_0         
	//   22   32:getfield        #25  <Field Paint mShadowPaint>
	//   23   35:invokevirtual   #77  <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.drawCircle(i / 2, j / 2, i / 2 - mShadowRadius, paint);
	//   24   38:aload_1         
	//   25   39:iload_3         
	//   26   40:iconst_2        
	//   27   41:idiv            
	//   28   42:i2f             
	//   29   43:iload           4
	//   30   45:iconst_2        
	//   31   46:idiv            
	//   32   47:i2f             
	//   33   48:iload_3         
	//   34   49:iconst_2        
	//   35   50:idiv            
	//   36   51:aload_0         
	//   37   52:getfield        #17  <Field CircleImageView this$0>
	//   38   55:getfield        #29  <Field int CircleImageView.mShadowRadius>
	//   39   58:isub            
	//   40   59:i2f             
	//   41   60:aload_2         
	//   42   61:invokevirtual   #77  <Method void Canvas.drawCircle(float, float, float, Paint)>
	//   43   64:return          
	}

	protected void onResize(float f, float f1)
	{
		super.onResize(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokespecial   #81  <Method void OvalShape.onResize(float, float)>
		updateRadialGradient((int)f);
	//    4    6:aload_0         
	//    5    7:fload_1         
	//    6    8:f2i             
	//    7    9:invokespecial   #43  <Method void updateRadialGradient(int)>
	//    8   12:return          
	}

	private RadialGradient mRadialGradient;
	private Paint mShadowPaint;
	final CircleImageView this$0;

	CircleImageView$OvalShadow(int i)
	{
		this$0 = CircleImageView.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field CircleImageView this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void OvalShape()>
		mShadowPaint = new Paint();
	//    5    9:aload_0         
	//    6   10:new             #22  <Class Paint>
	//    7   13:dup             
	//    8   14:invokespecial   #23  <Method void Paint()>
	//    9   17:putfield        #25  <Field Paint mShadowPaint>
		mShadowRadius = i;
	//   10   20:aload_1         
	//   11   21:iload_2         
	//   12   22:putfield        #29  <Field int CircleImageView.mShadowRadius>
		updateRadialGradient((int)rect().width());
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:invokevirtual   #33  <Method RectF rect()>
	//   16   30:invokevirtual   #39  <Method float RectF.width()>
	//   17   33:f2i             
	//   18   34:invokespecial   #43  <Method void updateRadialGradient(int)>
	//   19   37:return          
	}
}
