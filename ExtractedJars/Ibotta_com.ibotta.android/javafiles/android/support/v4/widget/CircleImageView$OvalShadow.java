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
		float f1 = mShadowRadius;
	//    5    5:aload_0         
	//    6    6:getfield        #17  <Field CircleImageView this$0>
	//    7    9:getfield        #29  <Field int CircleImageView.mShadowRadius>
	//    8   12:i2f             
	//    9   13:fstore_3        
		android.graphics.Shader.TileMode tilemode = android.graphics.Shader.TileMode.CLAMP;
	//   10   14:getstatic       #50  <Field android.graphics.Shader$TileMode android.graphics.Shader$TileMode.CLAMP>
	//   11   17:astore          4
		mRadialGradient = new RadialGradient(f, f, f1, new int[] {
			0x3d000000, 0
		}, ((float []) (null)), tilemode);
	//   12   19:aload_0         
	//   13   20:new             #52  <Class RadialGradient>
	//   14   23:dup             
	//   15   24:fload_2         
	//   16   25:fload_2         
	//   17   26:fload_3         
	//   18   27:iconst_2        
	//   19   28:newarray        int[]
	//   20   30:dup             
	//   21   31:iconst_0        
	//   22   32:ldc1            #53  <Int 0x3d000000>
	//   23   34:iastore         
	//   24   35:dup             
	//   25   36:iconst_1        
	//   26   37:iconst_0        
	//   27   38:iastore         
	//   28   39:aconst_null     
	//   29   40:aload           4
	//   30   42:invokespecial   #56  <Method void RadialGradient(float, float, float, int[], float[], android.graphics.Shader$TileMode)>
	//   31   45:putfield        #58  <Field RadialGradient mRadialGradient>
		mShadowPaint.setShader(((android.graphics.Shader) (mRadialGradient)));
	//   32   48:aload_0         
	//   33   49:getfield        #25  <Field Paint mShadowPaint>
	//   34   52:aload_0         
	//   35   53:getfield        #58  <Field RadialGradient mRadialGradient>
	//   36   56:invokevirtual   #62  <Method android.graphics.Shader Paint.setShader(android.graphics.Shader)>
	//   37   59:pop             
	//   38   60:return          
	}

	public void draw(Canvas canvas, Paint paint)
	{
		int j = getWidth();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CircleImageView this$0>
	//    2    4:invokevirtual   #68  <Method int CircleImageView.getWidth()>
	//    3    7:istore          6
		int i = getHeight();
	//    4    9:aload_0         
	//    5   10:getfield        #17  <Field CircleImageView this$0>
	//    6   13:invokevirtual   #71  <Method int CircleImageView.getHeight()>
	//    7   16:istore          5
		j /= 2;
	//    8   18:iload           6
	//    9   20:iconst_2        
	//   10   21:idiv            
	//   11   22:istore          6
		float f = j;
	//   12   24:iload           6
	//   13   26:i2f             
	//   14   27:fstore_3        
		float f1 = i / 2;
	//   15   28:iload           5
	//   16   30:iconst_2        
	//   17   31:idiv            
	//   18   32:i2f             
	//   19   33:fstore          4
		canvas.drawCircle(f, f1, f, mShadowPaint);
	//   20   35:aload_1         
	//   21   36:fload_3         
	//   22   37:fload           4
	//   23   39:fload_3         
	//   24   40:aload_0         
	//   25   41:getfield        #25  <Field Paint mShadowPaint>
	//   26   44:invokevirtual   #77  <Method void Canvas.drawCircle(float, float, float, Paint)>
		canvas.drawCircle(f, f1, j - mShadowRadius, paint);
	//   27   47:aload_1         
	//   28   48:fload_3         
	//   29   49:fload           4
	//   30   51:iload           6
	//   31   53:aload_0         
	//   32   54:getfield        #17  <Field CircleImageView this$0>
	//   33   57:getfield        #29  <Field int CircleImageView.mShadowRadius>
	//   34   60:isub            
	//   35   61:i2f             
	//   36   62:aload_2         
	//   37   63:invokevirtual   #77  <Method void Canvas.drawCircle(float, float, float, Paint)>
	//   38   66:return          
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
