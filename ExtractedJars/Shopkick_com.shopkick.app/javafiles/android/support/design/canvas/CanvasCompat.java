// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.canvas;

import android.graphics.Canvas;
import android.graphics.RectF;

public class CanvasCompat
{

	private CanvasCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static int saveLayerAlpha(Canvas canvas, float f, float f1, float f2, float f3, int i)
	{
		if(android.os.Build.VERSION.SDK_INT > 21)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmple          20
			return canvas.saveLayerAlpha(f, f1, f2, f3, i);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:fload_3         
	//    7   12:fload           4
	//    8   14:iload           5
	//    9   16:invokevirtual   #26  <Method int Canvas.saveLayerAlpha(float, float, float, float, int)>
	//   10   19:ireturn         
		else
			return canvas.saveLayerAlpha(f, f1, f2, f3, i, 31);
	//   11   20:aload_0         
	//   12   21:fload_1         
	//   13   22:fload_2         
	//   14   23:fload_3         
	//   15   24:fload           4
	//   16   26:iload           5
	//   17   28:bipush          31
	//   18   30:invokevirtual   #29  <Method int Canvas.saveLayerAlpha(float, float, float, float, int, int)>
	//   19   33:ireturn         
	}

	public static int saveLayerAlpha(Canvas canvas, RectF rectf, int i)
	{
		if(android.os.Build.VERSION.SDK_INT > 21)
	//*   0    0:getstatic       #21  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmple          15
			return canvas.saveLayerAlpha(rectf, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:invokevirtual   #33  <Method int Canvas.saveLayerAlpha(RectF, int)>
	//    7   14:ireturn         
		else
			return canvas.saveLayerAlpha(rectf, i, 31);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:iload_2         
	//   11   18:bipush          31
	//   12   20:invokevirtual   #36  <Method int Canvas.saveLayerAlpha(RectF, int, int)>
	//   13   23:ireturn         
	}
}
