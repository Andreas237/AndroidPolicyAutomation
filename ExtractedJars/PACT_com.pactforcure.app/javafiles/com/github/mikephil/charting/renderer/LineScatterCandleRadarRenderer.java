// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			DataRenderer

public abstract class LineScatterCandleRadarRenderer extends DataRenderer
{

	public LineScatterCandleRadarRenderer(ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #10  <Method void DataRenderer(ChartAnimator, ViewPortHandler)>
		mHighlightLinePath = new Path();
	//    4    6:aload_0         
	//    5    7:new             #12  <Class Path>
	//    6   10:dup             
	//    7   11:invokespecial   #15  <Method void Path()>
	//    8   14:putfield        #17  <Field Path mHighlightLinePath>
	//    9   17:return          
	}

	protected void drawHighlightLines(Canvas canvas, float af[], ILineScatterCandleRadarDataSet ilinescattercandleradardataset)
	{
		mHighlightPaint.setColor(ilinescattercandleradardataset.getHighLightColor());
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field Paint mHighlightPaint>
	//    2    4:aload_3         
	//    3    5:invokeinterface #30  <Method int ILineScatterCandleRadarDataSet.getHighLightColor()>
	//    4   10:invokevirtual   #36  <Method void Paint.setColor(int)>
		mHighlightPaint.setStrokeWidth(ilinescattercandleradardataset.getHighlightLineWidth());
	//    5   13:aload_0         
	//    6   14:getfield        #24  <Field Paint mHighlightPaint>
	//    7   17:aload_3         
	//    8   18:invokeinterface #40  <Method float ILineScatterCandleRadarDataSet.getHighlightLineWidth()>
	//    9   23:invokevirtual   #44  <Method void Paint.setStrokeWidth(float)>
		mHighlightPaint.setPathEffect(((android.graphics.PathEffect) (ilinescattercandleradardataset.getDashPathEffectHighlight())));
	//   10   26:aload_0         
	//   11   27:getfield        #24  <Field Paint mHighlightPaint>
	//   12   30:aload_3         
	//   13   31:invokeinterface #48  <Method android.graphics.DashPathEffect ILineScatterCandleRadarDataSet.getDashPathEffectHighlight()>
	//   14   36:invokevirtual   #52  <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   15   39:pop             
		if(ilinescattercandleradardataset.isVerticalHighlightIndicatorEnabled())
	//*  16   40:aload_3         
	//*  17   41:invokeinterface #56  <Method boolean ILineScatterCandleRadarDataSet.isVerticalHighlightIndicatorEnabled()>
	//*  18   46:ifeq            102
		{
			mHighlightLinePath.reset();
	//   19   49:aload_0         
	//   20   50:getfield        #17  <Field Path mHighlightLinePath>
	//   21   53:invokevirtual   #59  <Method void Path.reset()>
			mHighlightLinePath.moveTo(af[0], mViewPortHandler.contentTop());
	//   22   56:aload_0         
	//   23   57:getfield        #17  <Field Path mHighlightLinePath>
	//   24   60:aload_2         
	//   25   61:iconst_0        
	//   26   62:faload          
	//   27   63:aload_0         
	//   28   64:getfield        #63  <Field ViewPortHandler mViewPortHandler>
	//   29   67:invokevirtual   #68  <Method float ViewPortHandler.contentTop()>
	//   30   70:invokevirtual   #72  <Method void Path.moveTo(float, float)>
			mHighlightLinePath.lineTo(af[0], mViewPortHandler.contentBottom());
	//   31   73:aload_0         
	//   32   74:getfield        #17  <Field Path mHighlightLinePath>
	//   33   77:aload_2         
	//   34   78:iconst_0        
	//   35   79:faload          
	//   36   80:aload_0         
	//   37   81:getfield        #63  <Field ViewPortHandler mViewPortHandler>
	//   38   84:invokevirtual   #75  <Method float ViewPortHandler.contentBottom()>
	//   39   87:invokevirtual   #78  <Method void Path.lineTo(float, float)>
			canvas.drawPath(mHighlightLinePath, mHighlightPaint);
	//   40   90:aload_1         
	//   41   91:aload_0         
	//   42   92:getfield        #17  <Field Path mHighlightLinePath>
	//   43   95:aload_0         
	//   44   96:getfield        #24  <Field Paint mHighlightPaint>
	//   45   99:invokevirtual   #84  <Method void Canvas.drawPath(Path, Paint)>
		}
		if(ilinescattercandleradardataset.isHorizontalHighlightIndicatorEnabled())
	//*  46  102:aload_3         
	//*  47  103:invokeinterface #87  <Method boolean ILineScatterCandleRadarDataSet.isHorizontalHighlightIndicatorEnabled()>
	//*  48  108:ifeq            164
		{
			mHighlightLinePath.reset();
	//   49  111:aload_0         
	//   50  112:getfield        #17  <Field Path mHighlightLinePath>
	//   51  115:invokevirtual   #59  <Method void Path.reset()>
			mHighlightLinePath.moveTo(mViewPortHandler.contentLeft(), af[1]);
	//   52  118:aload_0         
	//   53  119:getfield        #17  <Field Path mHighlightLinePath>
	//   54  122:aload_0         
	//   55  123:getfield        #63  <Field ViewPortHandler mViewPortHandler>
	//   56  126:invokevirtual   #90  <Method float ViewPortHandler.contentLeft()>
	//   57  129:aload_2         
	//   58  130:iconst_1        
	//   59  131:faload          
	//   60  132:invokevirtual   #72  <Method void Path.moveTo(float, float)>
			mHighlightLinePath.lineTo(mViewPortHandler.contentRight(), af[1]);
	//   61  135:aload_0         
	//   62  136:getfield        #17  <Field Path mHighlightLinePath>
	//   63  139:aload_0         
	//   64  140:getfield        #63  <Field ViewPortHandler mViewPortHandler>
	//   65  143:invokevirtual   #93  <Method float ViewPortHandler.contentRight()>
	//   66  146:aload_2         
	//   67  147:iconst_1        
	//   68  148:faload          
	//   69  149:invokevirtual   #78  <Method void Path.lineTo(float, float)>
			canvas.drawPath(mHighlightLinePath, mHighlightPaint);
	//   70  152:aload_1         
	//   71  153:aload_0         
	//   72  154:getfield        #17  <Field Path mHighlightLinePath>
	//   73  157:aload_0         
	//   74  158:getfield        #24  <Field Paint mHighlightPaint>
	//   75  161:invokevirtual   #84  <Method void Canvas.drawPath(Path, Paint)>
		}
	//   76  164:return          
	}

	private Path mHighlightLinePath;
}
