// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			Renderer

public abstract class DataRenderer extends Renderer
{

	public DataRenderer(ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #16  <Method void Renderer(ViewPortHandler)>
		mAnimator = chartanimator;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #18  <Field ChartAnimator mAnimator>
		mRenderPaint = new Paint(1);
	//    6   10:aload_0         
	//    7   11:new             #20  <Class Paint>
	//    8   14:dup             
	//    9   15:iconst_1        
	//   10   16:invokespecial   #23  <Method void Paint(int)>
	//   11   19:putfield        #25  <Field Paint mRenderPaint>
		mRenderPaint.setStyle(android.graphics.Paint.Style.FILL);
	//   12   22:aload_0         
	//   13   23:getfield        #25  <Field Paint mRenderPaint>
	//   14   26:getstatic       #31  <Field android.graphics.Paint$Style android.graphics.Paint$Style.FILL>
	//   15   29:invokevirtual   #35  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mDrawPaint = new Paint(4);
	//   16   32:aload_0         
	//   17   33:new             #20  <Class Paint>
	//   18   36:dup             
	//   19   37:iconst_4        
	//   20   38:invokespecial   #23  <Method void Paint(int)>
	//   21   41:putfield        #37  <Field Paint mDrawPaint>
		mValuePaint = new Paint(1);
	//   22   44:aload_0         
	//   23   45:new             #20  <Class Paint>
	//   24   48:dup             
	//   25   49:iconst_1        
	//   26   50:invokespecial   #23  <Method void Paint(int)>
	//   27   53:putfield        #39  <Field Paint mValuePaint>
		mValuePaint.setColor(Color.rgb(63, 63, 63));
	//   28   56:aload_0         
	//   29   57:getfield        #39  <Field Paint mValuePaint>
	//   30   60:bipush          63
	//   31   62:bipush          63
	//   32   64:bipush          63
	//   33   66:invokestatic    #45  <Method int Color.rgb(int, int, int)>
	//   34   69:invokevirtual   #48  <Method void Paint.setColor(int)>
		mValuePaint.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   35   72:aload_0         
	//   36   73:getfield        #39  <Field Paint mValuePaint>
	//   37   76:getstatic       #54  <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   38   79:invokevirtual   #58  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		mValuePaint.setTextSize(Utils.convertDpToPixel(9F));
	//   39   82:aload_0         
	//   40   83:getfield        #39  <Field Paint mValuePaint>
	//   41   86:ldc1            #59  <Float 9F>
	//   42   88:invokestatic    #65  <Method float Utils.convertDpToPixel(float)>
	//   43   91:invokevirtual   #69  <Method void Paint.setTextSize(float)>
		mHighlightPaint = new Paint(1);
	//   44   94:aload_0         
	//   45   95:new             #20  <Class Paint>
	//   46   98:dup             
	//   47   99:iconst_1        
	//   48  100:invokespecial   #23  <Method void Paint(int)>
	//   49  103:putfield        #71  <Field Paint mHighlightPaint>
		mHighlightPaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   50  106:aload_0         
	//   51  107:getfield        #71  <Field Paint mHighlightPaint>
	//   52  110:getstatic       #74  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   53  113:invokevirtual   #35  <Method void Paint.setStyle(android.graphics.Paint$Style)>
		mHighlightPaint.setStrokeWidth(2.0F);
	//   54  116:aload_0         
	//   55  117:getfield        #71  <Field Paint mHighlightPaint>
	//   56  120:fconst_2        
	//   57  121:invokevirtual   #77  <Method void Paint.setStrokeWidth(float)>
		mHighlightPaint.setColor(Color.rgb(255, 187, 115));
	//   58  124:aload_0         
	//   59  125:getfield        #71  <Field Paint mHighlightPaint>
	//   60  128:sipush          255
	//   61  131:sipush          187
	//   62  134:bipush          115
	//   63  136:invokestatic    #45  <Method int Color.rgb(int, int, int)>
	//   64  139:invokevirtual   #48  <Method void Paint.setColor(int)>
	//   65  142:return          
	}

	protected void applyValueTextStyle(IDataSet idataset)
	{
		mValuePaint.setTypeface(idataset.getValueTypeface());
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Paint mValuePaint>
	//    2    4:aload_1         
	//    3    5:invokeinterface #86  <Method android.graphics.Typeface IDataSet.getValueTypeface()>
	//    4   10:invokevirtual   #90  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//    5   13:pop             
		mValuePaint.setTextSize(idataset.getValueTextSize());
	//    6   14:aload_0         
	//    7   15:getfield        #39  <Field Paint mValuePaint>
	//    8   18:aload_1         
	//    9   19:invokeinterface #94  <Method float IDataSet.getValueTextSize()>
	//   10   24:invokevirtual   #69  <Method void Paint.setTextSize(float)>
	//   11   27:return          
	}

	public abstract void drawData(Canvas canvas);

	public abstract void drawExtras(Canvas canvas);

	public abstract void drawHighlighted(Canvas canvas, Highlight ahighlight[]);

	public void drawValue(Canvas canvas, ValueFormatter valueformatter, float f, Entry entry, int i, float f1, float f2, 
			int j)
	{
		mValuePaint.setColor(j);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Paint mValuePaint>
	//    2    4:iload           8
	//    3    6:invokevirtual   #48  <Method void Paint.setColor(int)>
		canvas.drawText(valueformatter.getFormattedValue(f, entry, i, mViewPortHandler), f1, f2, mValuePaint);
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:fload_3         
	//    7   12:aload           4
	//    8   14:iload           5
	//    9   16:aload_0         
	//   10   17:getfield        #105 <Field ViewPortHandler mViewPortHandler>
	//   11   20:invokeinterface #111 <Method String ValueFormatter.getFormattedValue(float, Entry, int, ViewPortHandler)>
	//   12   25:fload           6
	//   13   27:fload           7
	//   14   29:aload_0         
	//   15   30:getfield        #39  <Field Paint mValuePaint>
	//   16   33:invokevirtual   #117 <Method void Canvas.drawText(String, float, float, Paint)>
	//   17   36:return          
	}

	public abstract void drawValues(Canvas canvas);

	public Paint getPaintHighlight()
	{
		return mHighlightPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Paint mHighlightPaint>
	//    2    4:areturn         
	}

	public Paint getPaintRender()
	{
		return mRenderPaint;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Paint mRenderPaint>
	//    2    4:areturn         
	}

	public Paint getPaintValues()
	{
		return mValuePaint;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Paint mValuePaint>
	//    2    4:areturn         
	}

	public abstract void initBuffers();

	protected ChartAnimator mAnimator;
	protected Paint mDrawPaint;
	protected Paint mHighlightPaint;
	protected Paint mRenderPaint;
	protected Paint mValuePaint;
}
