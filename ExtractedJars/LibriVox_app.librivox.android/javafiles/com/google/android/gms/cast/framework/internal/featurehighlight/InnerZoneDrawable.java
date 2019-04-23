// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.*;
import android.graphics.drawable.Drawable;

class InnerZoneDrawable extends Drawable
{

	public void draw(Canvas canvas)
	{
		float f1 = i;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float i>
	//    2    4:fstore_2        
		if(f1 > 0.0F)
	//*   3    5:fload_2         
	//*   4    6:fconst_0        
	//*   5    7:fcmpl           
	//*   6    8:ifle            57
		{
			float f2 = d;
	//    7   11:aload_0         
	//    8   12:getfield        #22  <Field float d>
	//    9   15:fstore_3        
			float f3 = h;
	//   10   16:aload_0         
	//   11   17:getfield        #24  <Field float h>
	//   12   20:fstore          4
			b.setAlpha((int)((float)c * f1));
	//   13   22:aload_0         
	//   14   23:getfield        #26  <Field Paint b>
	//   15   26:aload_0         
	//   16   27:getfield        #28  <Field int c>
	//   17   30:i2f             
	//   18   31:fload_2         
	//   19   32:fmul            
	//   20   33:f2i             
	//   21   34:invokevirtual   #34  <Method void Paint.setAlpha(int)>
			canvas.drawCircle(f, g, f2 * f3, b);
	//   22   37:aload_1         
	//   23   38:aload_0         
	//   24   39:getfield        #36  <Field float f>
	//   25   42:aload_0         
	//   26   43:getfield        #38  <Field float g>
	//   27   46:fload_3         
	//   28   47:fload           4
	//   29   49:fmul            
	//   30   50:aload_0         
	//   31   51:getfield        #26  <Field Paint b>
	//   32   54:invokevirtual   #44  <Method void Canvas.drawCircle(float, float, float, Paint)>
		}
		canvas.drawCircle(f, g, d * e, a);
	//   33   57:aload_1         
	//   34   58:aload_0         
	//   35   59:getfield        #36  <Field float f>
	//   36   62:aload_0         
	//   37   63:getfield        #38  <Field float g>
	//   38   66:aload_0         
	//   39   67:getfield        #22  <Field float d>
	//   40   70:aload_0         
	//   41   71:getfield        #46  <Field float e>
	//   42   74:fmul            
	//   43   75:aload_0         
	//   44   76:getfield        #48  <Field Paint a>
	//   45   79:invokevirtual   #44  <Method void Canvas.drawCircle(float, float, float, Paint)>
	//   46   82:return          
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public void setAlpha(int j)
	{
		a.setAlpha(j);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Paint a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #34  <Method void Paint.setAlpha(int)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #55  <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		a.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Paint a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #60  <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #55  <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setPulseAlpha(float f1)
	{
		i = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #20  <Field float i>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #55  <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setPulseScale(float f1)
	{
		h = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #24  <Field float h>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #55  <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setScale(float f1)
	{
		e = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #46  <Field float e>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #55  <Method void invalidateSelf()>
	//    5    9:return          
	}

	private final Paint a;
	private final Paint b;
	private final int c;
	private float d;
	private float e;
	private float f;
	private float g;
	private float h;
	private float i;
}
