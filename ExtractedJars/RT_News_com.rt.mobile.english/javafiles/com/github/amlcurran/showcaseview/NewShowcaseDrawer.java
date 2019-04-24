// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.amlcurran.showcaseview;

import android.content.res.Resources;
import android.graphics.*;

// Referenced classes of package com.github.amlcurran.showcaseview:
//			StandardShowcaseDrawer

class NewShowcaseDrawer extends StandardShowcaseDrawer
{

	public NewShowcaseDrawer(Resources resources)
	{
		super(resources);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void StandardShowcaseDrawer(Resources)>
		outerRadius = resources.getDimension(R.dimen.showcase_radius_outer);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getstatic       #19  <Field int R$dimen.showcase_radius_outer>
	//    6   10:invokevirtual   #25  <Method float Resources.getDimension(int)>
	//    7   13:putfield        #27  <Field float outerRadius>
		innerRadius = resources.getDimension(R.dimen.showcase_radius_inner);
	//    8   16:aload_0         
	//    9   17:aload_1         
	//   10   18:getstatic       #30  <Field int R$dimen.showcase_radius_inner>
	//   11   21:invokevirtual   #25  <Method float Resources.getDimension(int)>
	//   12   24:putfield        #32  <Field float innerRadius>
	//   13   27:return          
	}

	public void drawShowcase(Bitmap bitmap, float f, float f1, float f2)
	{
		bitmap = ((Bitmap) (new Canvas(bitmap)));
	//    0    0:new             #37  <Class Canvas>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #40  <Method void Canvas(Bitmap)>
	//    4    8:astore_1        
		eraserPaint.setAlpha(153);
	//    5    9:aload_0         
	//    6   10:getfield        #44  <Field Paint eraserPaint>
	//    7   13:sipush          153
	//    8   16:invokevirtual   #50  <Method void Paint.setAlpha(int)>
		((Canvas) (bitmap)).drawCircle(f, f1, outerRadius, eraserPaint);
	//    9   19:aload_1         
	//   10   20:fload_2         
	//   11   21:fload_3         
	//   12   22:aload_0         
	//   13   23:getfield        #27  <Field float outerRadius>
	//   14   26:aload_0         
	//   15   27:getfield        #44  <Field Paint eraserPaint>
	//   16   30:invokevirtual   #54  <Method void Canvas.drawCircle(float, float, float, Paint)>
		eraserPaint.setAlpha(0);
	//   17   33:aload_0         
	//   18   34:getfield        #44  <Field Paint eraserPaint>
	//   19   37:iconst_0        
	//   20   38:invokevirtual   #50  <Method void Paint.setAlpha(int)>
		((Canvas) (bitmap)).drawCircle(f, f1, innerRadius, eraserPaint);
	//   21   41:aload_1         
	//   22   42:fload_2         
	//   23   43:fload_3         
	//   24   44:aload_0         
	//   25   45:getfield        #32  <Field float innerRadius>
	//   26   48:aload_0         
	//   27   49:getfield        #44  <Field Paint eraserPaint>
	//   28   52:invokevirtual   #54  <Method void Canvas.drawCircle(float, float, float, Paint)>
	//   29   55:return          
	}

	public float getBlockedRadius()
	{
		return innerRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field float innerRadius>
	//    2    4:freturn         
	}

	public int getShowcaseHeight()
	{
		return (int)(outerRadius * 2.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float outerRadius>
	//    2    4:fconst_2        
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:ireturn         
	}

	public int getShowcaseWidth()
	{
		return (int)(outerRadius * 2.0F);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field float outerRadius>
	//    2    4:fconst_2        
	//    3    5:fmul            
	//    4    6:f2i             
	//    5    7:ireturn         
	}

	public void setBackgroundColour(int i)
	{
		backgroundColour = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field int backgroundColour>
	//    3    5:return          
	}

	public void setShowcaseColour(int i)
	{
		eraserPaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Paint eraserPaint>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #67  <Method void Paint.setColor(int)>
	//    4    8:return          
	}

	private static final int ALPHA_60_PERCENT = 153;
	private final float innerRadius;
	private final float outerRadius;
}
