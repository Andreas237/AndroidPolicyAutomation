// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			Renderer

public abstract class AxisRenderer extends Renderer
{

	public AxisRenderer(ViewPortHandler viewporthandler, Transformer transformer)
	{
		super(viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void Renderer(ViewPortHandler)>
		mTrans = transformer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #18  <Field Transformer mTrans>
		mAxisLabelPaint = new Paint(1);
	//    6   10:aload_0         
	//    7   11:new             #20  <Class Paint>
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:invokespecial   #23  <Method void Paint(int)>
	//   11   19:putfield        #25  <Field Paint mAxisLabelPaint>
		mGridPaint = new Paint();
	//   12   22:aload_0         
	//   13   23:new             #20  <Class Paint>
	//   14   26:dup             
	//   15   27:invokespecial   #28  <Method void Paint()>
	//   16   30:putfield        #30  <Field Paint mGridPaint>
		mGridPaint.setColor(0xff888888);
	//   17   33:aload_0         
	//   18   34:getfield        #30  <Field Paint mGridPaint>
	//   19   37:ldc1            #31  <Int 0xff888888>
	//   20   39:invokevirtual   #34  <Method void Paint.setColor(int)>
		mGridPaint.setStrokeWidth(1.0F);
	//   21   42:aload_0         
	//   22   43:getfield        #30  <Field Paint mGridPaint>
	//   23   46:fconst_1        
	//   24   47:invokevirtual   #38  <Method void Paint.setStrokeWidth(float)>
		mGridPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   25   50:aload_0         
	//   26   51:getfield        #30  <Field Paint mGridPaint>
	//   27   54:getstatic       #44  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   28   57:invokevirtual   #48  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mGridPaint.setAlpha(90);
	//   29   60:aload_0         
	//   30   61:getfield        #30  <Field Paint mGridPaint>
	//   31   64:bipush          90
	//   32   66:invokevirtual   #51  <Method void Paint.setAlpha(int)>
		mAxisLinePaint = new Paint();
	//   33   69:aload_0         
	//   34   70:new             #20  <Class Paint>
	//   35   73:dup             
	//   36   74:invokespecial   #28  <Method void Paint()>
	//   37   77:putfield        #53  <Field Paint mAxisLinePaint>
		mAxisLinePaint.setColor(0xff000000);
	//   38   80:aload_0         
	//   39   81:getfield        #53  <Field Paint mAxisLinePaint>
	//   40   84:ldc1            #54  <Int 0xff000000>
	//   41   86:invokevirtual   #34  <Method void Paint.setColor(int)>
		mAxisLinePaint.setStrokeWidth(1.0F);
	//   42   89:aload_0         
	//   43   90:getfield        #53  <Field Paint mAxisLinePaint>
	//   44   93:fconst_1        
	//   45   94:invokevirtual   #38  <Method void Paint.setStrokeWidth(float)>
		mAxisLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   46   97:aload_0         
	//   47   98:getfield        #53  <Field Paint mAxisLinePaint>
	//   48  101:getstatic       #44  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   49  104:invokevirtual   #48  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mLimitLinePaint = new Paint(1);
	//   50  107:aload_0         
	//   51  108:new             #20  <Class Paint>
	//   52  111:dup             
	//   53  112:iconst_1        
	//   54  113:invokespecial   #23  <Method void Paint(int)>
	//   55  116:putfield        #56  <Field Paint mLimitLinePaint>
		mLimitLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   56  119:aload_0         
	//   57  120:getfield        #56  <Field Paint mLimitLinePaint>
	//   58  123:getstatic       #44  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   59  126:invokevirtual   #48  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   60  129:return          
	}

	public Paint getPaintAxisLabels()
	{
		return mAxisLabelPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Paint mAxisLabelPaint>
	//    2    4:areturn         
	}

	public Paint getPaintAxisLine()
	{
		return mAxisLinePaint;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Paint mAxisLinePaint>
	//    2    4:areturn         
	}

	public Paint getPaintGrid()
	{
		return mGridPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Paint mGridPaint>
	//    2    4:areturn         
	}

	public Transformer getTransformer()
	{
		return mTrans;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Transformer mTrans>
	//    2    4:areturn         
	}

	public abstract void renderAxisLabels(Canvas canvas);

	public abstract void renderAxisLine(Canvas canvas);

	public abstract void renderGridLines(Canvas canvas);

	public abstract void renderLimitLines(Canvas canvas);

	protected Paint mAxisLabelPaint;
	protected Paint mAxisLinePaint;
	protected Paint mGridPaint;
	protected Paint mLimitLinePaint;
	protected Transformer mTrans;
}
