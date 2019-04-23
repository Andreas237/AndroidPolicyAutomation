// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast.framework.internal.featurehighlight;

import android.graphics.*;
import android.graphics.drawable.Drawable;

class OuterHighlightDrawable extends Drawable
{

	public void draw(Canvas canvas)
	{
		canvas.drawCircle(d + f, e + g, b * c, a);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #17  <Field float d>
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field float f>
	//    5    9:fadd            
	//    6   10:aload_0         
	//    7   11:getfield        #21  <Field float e>
	//    8   14:aload_0         
	//    9   15:getfield        #23  <Field float g>
	//   10   18:fadd            
	//   11   19:aload_0         
	//   12   20:getfield        #25  <Field float b>
	//   13   23:aload_0         
	//   14   24:getfield        #27  <Field float c>
	//   15   27:fmul            
	//   16   28:aload_0         
	//   17   29:getfield        #29  <Field Paint a>
	//   18   32:invokevirtual   #35  <Method void Canvas.drawCircle(float, float, float, Paint)>
	//   19   35:return          
	}

	public int getAlpha()
	{
		return a.getAlpha();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Paint a>
	//    2    4:invokevirtual   #42  <Method int Paint.getAlpha()>
	//    3    7:ireturn         
	}

	public int getOpacity()
	{
		return -3;
	//    0    0:bipush          -3
	//    1    2:ireturn         
	}

	public void setAlpha(int i)
	{
		a.setAlpha(i);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Paint a>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #47  <Method void Paint.setAlpha(int)>
		invalidateSelf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #51  <Method void invalidateSelf()>
	//    6   12:return          
	}

	public void setColorFilter(ColorFilter colorfilter)
	{
		a.setColorFilter(colorfilter);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Paint a>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #56  <Method ColorFilter Paint.setColorFilter(ColorFilter)>
	//    4    8:pop             
		invalidateSelf();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #51  <Method void invalidateSelf()>
	//    7   13:return          
	}

	public void setScale(float f1)
	{
		c = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #27  <Field float c>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #51  <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setTranslationX(float f1)
	{
		f = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #19  <Field float f>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #51  <Method void invalidateSelf()>
	//    5    9:return          
	}

	public void setTranslationY(float f1)
	{
		g = f1;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #23  <Field float g>
		invalidateSelf();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #51  <Method void invalidateSelf()>
	//    5    9:return          
	}

	private final Paint a;
	private float b;
	private float c;
	private float d;
	private float e;
	private float f;
	private float g;
}
