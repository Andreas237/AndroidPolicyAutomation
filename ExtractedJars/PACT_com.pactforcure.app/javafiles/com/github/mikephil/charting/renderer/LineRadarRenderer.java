// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			LineScatterCandleRadarRenderer

public abstract class LineRadarRenderer extends LineScatterCandleRadarRenderer
{

	public LineRadarRenderer(ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void LineScatterCandleRadarRenderer(ChartAnimator, ViewPortHandler)>
	//    4    6:return          
	}

	protected void drawFilledPath(Canvas canvas, Path path, int i, int j)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #17  <Method int Canvas.save()>
	//    2    4:pop             
		canvas.clipPath(path);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #21  <Method boolean Canvas.clipPath(Path)>
	//    6   10:pop             
		canvas.drawColor(j << 24 | 0xffffff & i);
	//    7   11:aload_1         
	//    8   12:iload           4
	//    9   14:bipush          24
	//   10   16:ishl            
	//   11   17:ldc1            #22  <Int 0xffffff>
	//   12   19:iload_3         
	//   13   20:iand            
	//   14   21:ior             
	//   15   22:invokevirtual   #26  <Method void Canvas.drawColor(int)>
		canvas.restore();
	//   16   25:aload_1         
	//   17   26:invokevirtual   #30  <Method void Canvas.restore()>
	//   18   29:return          
	}

	protected void drawFilledPath(Canvas canvas, Path path, Drawable drawable)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #17  <Method int Canvas.save()>
	//    2    4:pop             
		canvas.clipPath(path);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #21  <Method boolean Canvas.clipPath(Path)>
	//    6   10:pop             
		drawable.setBounds((int)mViewPortHandler.contentLeft(), (int)mViewPortHandler.contentTop(), (int)mViewPortHandler.contentRight(), (int)mViewPortHandler.contentBottom());
	//    7   11:aload_3         
	//    8   12:aload_0         
	//    9   13:getfield        #35  <Field ViewPortHandler mViewPortHandler>
	//   10   16:invokevirtual   #41  <Method float ViewPortHandler.contentLeft()>
	//   11   19:f2i             
	//   12   20:aload_0         
	//   13   21:getfield        #35  <Field ViewPortHandler mViewPortHandler>
	//   14   24:invokevirtual   #44  <Method float ViewPortHandler.contentTop()>
	//   15   27:f2i             
	//   16   28:aload_0         
	//   17   29:getfield        #35  <Field ViewPortHandler mViewPortHandler>
	//   18   32:invokevirtual   #47  <Method float ViewPortHandler.contentRight()>
	//   19   35:f2i             
	//   20   36:aload_0         
	//   21   37:getfield        #35  <Field ViewPortHandler mViewPortHandler>
	//   22   40:invokevirtual   #50  <Method float ViewPortHandler.contentBottom()>
	//   23   43:f2i             
	//   24   44:invokevirtual   #56  <Method void Drawable.setBounds(int, int, int, int)>
		drawable.draw(canvas);
	//   25   47:aload_3         
	//   26   48:aload_1         
	//   27   49:invokevirtual   #60  <Method void Drawable.draw(Canvas)>
		canvas.restore();
	//   28   52:aload_1         
	//   29   53:invokevirtual   #30  <Method void Canvas.restore()>
	//   30   56:return          
	}
}
