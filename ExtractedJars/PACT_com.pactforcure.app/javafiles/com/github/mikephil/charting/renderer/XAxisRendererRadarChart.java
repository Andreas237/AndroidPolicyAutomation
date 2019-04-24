// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			XAxisRenderer

public class XAxisRendererRadarChart extends XAxisRenderer
{

	public XAxisRendererRadarChart(ViewPortHandler viewporthandler, XAxis xaxis, RadarChart radarchart)
	{
		super(viewporthandler, xaxis, ((com.github.mikephil.charting.utils.Transformer) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #11  <Method void XAxisRenderer(ViewPortHandler, XAxis, com.github.mikephil.charting.utils.Transformer)>
		mChart = radarchart;
	//    5    7:aload_0         
	//    6    8:aload_3         
	//    7    9:putfield        #13  <Field RadarChart mChart>
	//    8   12:return          
	}

	public void renderAxisLabels(Canvas canvas)
	{
		if(mXAxis.isEnabled() && mXAxis.isDrawLabelsEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #26  <Method boolean XAxis.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #20  <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #29  <Method boolean XAxis.isDrawLabelsEnabled()>
	//*   7   17:ifne            21
	//*   8   20:return          
		{
			float f = mXAxis.getLabelRotationAngle();
	//    9   21:aload_0         
	//   10   22:getfield        #20  <Field XAxis mXAxis>
	//   11   25:invokevirtual   #33  <Method float XAxis.getLabelRotationAngle()>
	//   12   28:fstore_2        
			PointF pointf = new PointF(0.5F, 0.0F);
	//   13   29:new             #35  <Class PointF>
	//   14   32:dup             
	//   15   33:ldc1            #36  <Float 0.5F>
	//   16   35:fconst_0        
	//   17   36:invokespecial   #39  <Method void PointF(float, float)>
	//   18   39:astore          9
			mAxisLabelPaint.setTypeface(mXAxis.getTypeface());
	//   19   41:aload_0         
	//   20   42:getfield        #43  <Field Paint mAxisLabelPaint>
	//   21   45:aload_0         
	//   22   46:getfield        #20  <Field XAxis mXAxis>
	//   23   49:invokevirtual   #47  <Method android.graphics.Typeface XAxis.getTypeface()>
	//   24   52:invokevirtual   #53  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   25   55:pop             
			mAxisLabelPaint.setTextSize(mXAxis.getTextSize());
	//   26   56:aload_0         
	//   27   57:getfield        #43  <Field Paint mAxisLabelPaint>
	//   28   60:aload_0         
	//   29   61:getfield        #20  <Field XAxis mXAxis>
	//   30   64:invokevirtual   #56  <Method float XAxis.getTextSize()>
	//   31   67:invokevirtual   #60  <Method void Paint.setTextSize(float)>
			mAxisLabelPaint.setColor(mXAxis.getTextColor());
	//   32   70:aload_0         
	//   33   71:getfield        #43  <Field Paint mAxisLabelPaint>
	//   34   74:aload_0         
	//   35   75:getfield        #20  <Field XAxis mXAxis>
	//   36   78:invokevirtual   #64  <Method int XAxis.getTextColor()>
	//   37   81:invokevirtual   #68  <Method void Paint.setColor(int)>
			float f1 = mChart.getSliceAngle();
	//   38   84:aload_0         
	//   39   85:getfield        #13  <Field RadarChart mChart>
	//   40   88:invokevirtual   #73  <Method float RadarChart.getSliceAngle()>
	//   41   91:fstore_3        
			float f2 = mChart.getFactor();
	//   42   92:aload_0         
	//   43   93:getfield        #13  <Field RadarChart mChart>
	//   44   96:invokevirtual   #76  <Method float RadarChart.getFactor()>
	//   45   99:fstore          4
			PointF pointf1 = mChart.getCenterOffsets();
	//   46  101:aload_0         
	//   47  102:getfield        #13  <Field RadarChart mChart>
	//   48  105:invokevirtual   #80  <Method PointF RadarChart.getCenterOffsets()>
	//   49  108:astore          10
			int j = mXAxis.mAxisLabelModulus;
	//   50  110:aload_0         
	//   51  111:getfield        #20  <Field XAxis mXAxis>
	//   52  114:getfield        #84  <Field int XAxis.mAxisLabelModulus>
	//   53  117:istore          8
			int i = 0;
	//   54  119:iconst_0        
	//   55  120:istore          7
			while(i < mXAxis.getValues().size()) 
	//*  56  122:iload           7
	//*  57  124:aload_0         
	//*  58  125:getfield        #20  <Field XAxis mXAxis>
	//*  59  128:invokevirtual   #88  <Method List XAxis.getValues()>
	//*  60  131:invokeinterface #93  <Method int List.size()>
	//*  61  136:icmpge          20
			{
				String s = (String)mXAxis.getValues().get(i);
	//   62  139:aload_0         
	//   63  140:getfield        #20  <Field XAxis mXAxis>
	//   64  143:invokevirtual   #88  <Method List XAxis.getValues()>
	//   65  146:iload           7
	//   66  148:invokeinterface #97  <Method Object List.get(int)>
	//   67  153:checkcast       #99  <Class String>
	//   68  156:astore          11
				float f3 = i;
	//   69  158:iload           7
	//   70  160:i2f             
	//   71  161:fstore          5
				float f4 = mChart.getRotationAngle();
	//   72  163:aload_0         
	//   73  164:getfield        #13  <Field RadarChart mChart>
	//   74  167:invokevirtual   #102 <Method float RadarChart.getRotationAngle()>
	//   75  170:fstore          6
				PointF pointf2 = Utils.getPosition(pointf1, mChart.getYRange() * f2 + (float)mXAxis.mLabelRotatedWidth / 2.0F, (f3 * f1 + f4) % 360F);
	//   76  172:aload           10
	//   77  174:aload_0         
	//   78  175:getfield        #13  <Field RadarChart mChart>
	//   79  178:invokevirtual   #105 <Method float RadarChart.getYRange()>
	//   80  181:fload           4
	//   81  183:fmul            
	//   82  184:aload_0         
	//   83  185:getfield        #20  <Field XAxis mXAxis>
	//   84  188:getfield        #108 <Field int XAxis.mLabelRotatedWidth>
	//   85  191:i2f             
	//   86  192:fconst_2        
	//   87  193:fdiv            
	//   88  194:fadd            
	//   89  195:fload           5
	//   90  197:fload_3         
	//   91  198:fmul            
	//   92  199:fload           6
	//   93  201:fadd            
	//   94  202:ldc1            #109 <Float 360F>
	//   95  204:frem            
	//   96  205:invokestatic    #115 <Method PointF Utils.getPosition(PointF, float, float)>
	//   97  208:astore          12
				drawLabel(canvas, s, i, pointf2.x, pointf2.y - (float)mXAxis.mLabelRotatedHeight / 2.0F, pointf, f);
	//   98  210:aload_0         
	//   99  211:aload_1         
	//  100  212:aload           11
	//  101  214:iload           7
	//  102  216:aload           12
	//  103  218:getfield        #119 <Field float PointF.x>
	//  104  221:aload           12
	//  105  223:getfield        #122 <Field float PointF.y>
	//  106  226:aload_0         
	//  107  227:getfield        #20  <Field XAxis mXAxis>
	//  108  230:getfield        #125 <Field int XAxis.mLabelRotatedHeight>
	//  109  233:i2f             
	//  110  234:fconst_2        
	//  111  235:fdiv            
	//  112  236:fsub            
	//  113  237:aload           9
	//  114  239:fload_2         
	//  115  240:invokevirtual   #129 <Method void drawLabel(Canvas, String, int, float, float, PointF, float)>
				i += j;
	//  116  243:iload           7
	//  117  245:iload           8
	//  118  247:iadd            
	//  119  248:istore          7
			}
		}
	//* 120  250:goto            122
	}

	public void renderLimitLines(Canvas canvas)
	{
	//    0    0:return          
	}

	private RadarChart mChart;
}
