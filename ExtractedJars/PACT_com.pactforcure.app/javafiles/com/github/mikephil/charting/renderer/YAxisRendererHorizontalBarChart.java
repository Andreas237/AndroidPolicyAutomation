// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.*;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			YAxisRenderer

public class YAxisRendererHorizontalBarChart extends YAxisRenderer
{

	public YAxisRendererHorizontalBarChart(ViewPortHandler viewporthandler, YAxis yaxis, Transformer transformer)
	{
		super(viewporthandler, yaxis, transformer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #8   <Method void YAxisRenderer(ViewPortHandler, YAxis, Transformer)>
		mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//    5    7:aload_0         
	//    6    8:getfield        #12  <Field Paint mLimitLinePaint>
	//    7   11:getstatic       #18  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//    8   14:invokevirtual   #24  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
	//    9   17:return          
	}

	public void computeAxis(float f, float f1)
	{
		float f2 = f;
	//    0    0:fload_1         
	//    1    1:fstore_3        
		float f3 = f1;
	//    2    2:fload_2         
	//    3    3:fstore          4
		if(mViewPortHandler.contentHeight() > 10F)
	//*   4    5:aload_0         
	//*   5    6:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//*   6    9:invokevirtual   #37  <Method float ViewPortHandler.contentHeight()>
	//*   7   12:ldc1            #38  <Float 10F>
	//*   8   14:fcmpl           
	//*   9   15:ifle            104
		{
			f2 = f;
	//   10   18:fload_1         
	//   11   19:fstore_3        
			f3 = f1;
	//   12   20:fload_2         
	//   13   21:fstore          4
			if(!mViewPortHandler.isFullyZoomedOutX())
	//*  14   23:aload_0         
	//*  15   24:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//*  16   27:invokevirtual   #42  <Method boolean ViewPortHandler.isFullyZoomedOutX()>
	//*  17   30:ifne            104
			{
				PointD pointd = mTrans.getValuesByTouchPoint(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop());
	//   18   33:aload_0         
	//   19   34:getfield        #46  <Field Transformer mTrans>
	//   20   37:aload_0         
	//   21   38:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   22   41:invokevirtual   #49  <Method float ViewPortHandler.contentLeft()>
	//   23   44:aload_0         
	//   24   45:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   25   48:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//   26   51:invokevirtual   #58  <Method PointD Transformer.getValuesByTouchPoint(float, float)>
	//   27   54:astore          5
				PointD pointd1 = mTrans.getValuesByTouchPoint(mViewPortHandler.contentRight(), mViewPortHandler.contentTop());
	//   28   56:aload_0         
	//   29   57:getfield        #46  <Field Transformer mTrans>
	//   30   60:aload_0         
	//   31   61:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   32   64:invokevirtual   #61  <Method float ViewPortHandler.contentRight()>
	//   33   67:aload_0         
	//   34   68:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   35   71:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//   36   74:invokevirtual   #58  <Method PointD Transformer.getValuesByTouchPoint(float, float)>
	//   37   77:astore          6
				if(!mYAxis.isInverted())
	//*  38   79:aload_0         
	//*  39   80:getfield        #65  <Field YAxis mYAxis>
	//*  40   83:invokevirtual   #70  <Method boolean YAxis.isInverted()>
	//*  41   86:ifne            112
				{
					f2 = (float)pointd.x;
	//   42   89:aload           5
	//   43   91:getfield        #76  <Field double PointD.x>
	//   44   94:d2f             
	//   45   95:fstore_3        
					f3 = (float)pointd1.x;
	//   46   96:aload           6
	//   47   98:getfield        #76  <Field double PointD.x>
	//   48  101:d2f             
	//   49  102:fstore          4
				} else
	//*  50  104:aload_0         
	//*  51  105:fload_3         
	//*  52  106:fload           4
	//*  53  108:invokevirtual   #79  <Method void computeAxisValues(float, float)>
	//*  54  111:return          
				{
					f2 = (float)pointd1.x;
	//   55  112:aload           6
	//   56  114:getfield        #76  <Field double PointD.x>
	//   57  117:d2f             
	//   58  118:fstore_3        
					f3 = (float)pointd.x;
	//   59  119:aload           5
	//   60  121:getfield        #76  <Field double PointD.x>
	//   61  124:d2f             
	//   62  125:fstore          4
				}
			}
		}
		computeAxisValues(f2, f3);
	//*  63  127:goto            104
	}

	protected void drawYLabels(Canvas canvas, float f, float af[], float f1)
	{
		mAxisLabelPaint.setTypeface(mYAxis.getTypeface());
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field Paint mAxisLabelPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field YAxis mYAxis>
	//    4    8:invokevirtual   #88  <Method android.graphics.Typeface YAxis.getTypeface()>
	//    5   11:invokevirtual   #92  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//    6   14:pop             
		mAxisLabelPaint.setTextSize(mYAxis.getTextSize());
	//    7   15:aload_0         
	//    8   16:getfield        #84  <Field Paint mAxisLabelPaint>
	//    9   19:aload_0         
	//   10   20:getfield        #65  <Field YAxis mYAxis>
	//   11   23:invokevirtual   #95  <Method float YAxis.getTextSize()>
	//   12   26:invokevirtual   #99  <Method void Paint.setTextSize(float)>
		mAxisLabelPaint.setColor(mYAxis.getTextColor());
	//   13   29:aload_0         
	//   14   30:getfield        #84  <Field Paint mAxisLabelPaint>
	//   15   33:aload_0         
	//   16   34:getfield        #65  <Field YAxis mYAxis>
	//   17   37:invokevirtual   #103 <Method int YAxis.getTextColor()>
	//   18   40:invokevirtual   #107 <Method void Paint.setColor(int)>
		int i = 0;
	//   19   43:iconst_0        
	//   20   44:istore          5
		do
		{
			String s;
label0:
			{
				if(i < mYAxis.mEntryCount)
	//*  21   46:iload           5
	//*  22   48:aload_0         
	//*  23   49:getfield        #65  <Field YAxis mYAxis>
	//*  24   52:getfield        #111 <Field int YAxis.mEntryCount>
	//*  25   55:icmpge          93
				{
					s = mYAxis.getFormattedLabel(i);
	//   26   58:aload_0         
	//   27   59:getfield        #65  <Field YAxis mYAxis>
	//   28   62:iload           5
	//   29   64:invokevirtual   #115 <Method String YAxis.getFormattedLabel(int)>
	//   30   67:astore          6
					if(mYAxis.isDrawTopYLabelEntryEnabled() || i < mYAxis.mEntryCount - 1)
						break label0;
	//   31   69:aload_0         
	//   32   70:getfield        #65  <Field YAxis mYAxis>
	//   33   73:invokevirtual   #118 <Method boolean YAxis.isDrawTopYLabelEntryEnabled()>
	//   34   76:ifne            94
	//   35   79:iload           5
	//   36   81:aload_0         
	//   37   82:getfield        #65  <Field YAxis mYAxis>
	//   38   85:getfield        #111 <Field int YAxis.mEntryCount>
	//   39   88:iconst_1        
	//   40   89:isub            
	//   41   90:icmplt          94
				}
				return;
	//   42   93:return          
			}
			canvas.drawText(s, af[i * 2], f - f1, mAxisLabelPaint);
	//   43   94:aload_1         
	//   44   95:aload           6
	//   45   97:aload_3         
	//   46   98:iload           5
	//   47  100:iconst_2        
	//   48  101:imul            
	//   49  102:faload          
	//   50  103:fload_2         
	//   51  104:fload           4
	//   52  106:fsub            
	//   53  107:aload_0         
	//   54  108:getfield        #84  <Field Paint mAxisLabelPaint>
	//   55  111:invokevirtual   #124 <Method void Canvas.drawText(String, float, float, Paint)>
			i++;
	//   56  114:iload           5
	//   57  116:iconst_1        
	//   58  117:iadd            
	//   59  118:istore          5
		} while(true);
	//   60  120:goto            46
	}

	public void renderAxisLabels(Canvas canvas)
	{
		if(!mYAxis.isEnabled() || !mYAxis.isDrawLabelsEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field YAxis mYAxis>
	//*   2    4:invokevirtual   #129 <Method boolean YAxis.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #65  <Field YAxis mYAxis>
	//*   6   14:invokevirtual   #132 <Method boolean YAxis.isDrawLabelsEnabled()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		float af[] = new float[mYAxis.mEntryCount * 2];
	//    9   21:aload_0         
	//   10   22:getfield        #65  <Field YAxis mYAxis>
	//   11   25:getfield        #111 <Field int YAxis.mEntryCount>
	//   12   28:iconst_2        
	//   13   29:imul            
	//   14   30:newarray        float[]
	//   15   32:astore          5
		for(int i = 0; i < af.length; i += 2)
	//*  16   34:iconst_0        
	//*  17   35:istore          4
	//*  18   37:iload           4
	//*  19   39:aload           5
	//*  20   41:arraylength     
	//*  21   42:icmpge          71
			af[i] = mYAxis.mEntries[i / 2];
	//   22   45:aload           5
	//   23   47:iload           4
	//   24   49:aload_0         
	//   25   50:getfield        #65  <Field YAxis mYAxis>
	//   26   53:getfield        #136 <Field float[] YAxis.mEntries>
	//   27   56:iload           4
	//   28   58:iconst_2        
	//   29   59:idiv            
	//   30   60:faload          
	//   31   61:fastore         

	//   32   62:iload           4
	//   33   64:iconst_2        
	//   34   65:iadd            
	//   35   66:istore          4
	//*  36   68:goto            37
		mTrans.pointValuesToPixel(af);
	//   37   71:aload_0         
	//   38   72:getfield        #46  <Field Transformer mTrans>
	//   39   75:aload           5
	//   40   77:invokevirtual   #140 <Method void Transformer.pointValuesToPixel(float[])>
		mAxisLabelPaint.setTypeface(mYAxis.getTypeface());
	//   41   80:aload_0         
	//   42   81:getfield        #84  <Field Paint mAxisLabelPaint>
	//   43   84:aload_0         
	//   44   85:getfield        #65  <Field YAxis mYAxis>
	//   45   88:invokevirtual   #88  <Method android.graphics.Typeface YAxis.getTypeface()>
	//   46   91:invokevirtual   #92  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   47   94:pop             
		mAxisLabelPaint.setTextSize(mYAxis.getTextSize());
	//   48   95:aload_0         
	//   49   96:getfield        #84  <Field Paint mAxisLabelPaint>
	//   50   99:aload_0         
	//   51  100:getfield        #65  <Field YAxis mYAxis>
	//   52  103:invokevirtual   #95  <Method float YAxis.getTextSize()>
	//   53  106:invokevirtual   #99  <Method void Paint.setTextSize(float)>
		mAxisLabelPaint.setColor(mYAxis.getTextColor());
	//   54  109:aload_0         
	//   55  110:getfield        #84  <Field Paint mAxisLabelPaint>
	//   56  113:aload_0         
	//   57  114:getfield        #65  <Field YAxis mYAxis>
	//   58  117:invokevirtual   #103 <Method int YAxis.getTextColor()>
	//   59  120:invokevirtual   #107 <Method void Paint.setColor(int)>
		mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.CENTER);
	//   60  123:aload_0         
	//   61  124:getfield        #84  <Field Paint mAxisLabelPaint>
	//   62  127:getstatic       #143 <Field android.graphics.Paint$Align android.graphics.Paint$Align.CENTER>
	//   63  130:invokevirtual   #24  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
		float f = Utils.convertDpToPixel(2.5F);
	//   64  133:ldc1            #144 <Float 2.5F>
	//   65  135:invokestatic    #150 <Method float Utils.convertDpToPixel(float)>
	//   66  138:fstore_2        
		float f1 = Utils.calcTextHeight(mAxisLabelPaint, "Q");
	//   67  139:aload_0         
	//   68  140:getfield        #84  <Field Paint mAxisLabelPaint>
	//   69  143:ldc1            #152 <String "Q">
	//   70  145:invokestatic    #156 <Method int Utils.calcTextHeight(Paint, String)>
	//   71  148:i2f             
	//   72  149:fstore_3        
		com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency = mYAxis.getAxisDependency();
	//   73  150:aload_0         
	//   74  151:getfield        #65  <Field YAxis mYAxis>
	//   75  154:invokevirtual   #160 <Method com.github.mikephil.charting.components.YAxis$AxisDependency YAxis.getAxisDependency()>
	//   76  157:astore          6
		com.github.mikephil.charting.components.YAxis.YAxisLabelPosition yaxislabelposition = mYAxis.getLabelPosition();
	//   77  159:aload_0         
	//   78  160:getfield        #65  <Field YAxis mYAxis>
	//   79  163:invokevirtual   #164 <Method com.github.mikephil.charting.components.YAxis$YAxisLabelPosition YAxis.getLabelPosition()>
	//   80  166:astore          7
		if(axisdependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  81  168:aload           6
	//*  82  170:getstatic       #169 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  83  173:if_acmpne       223
		{
			if(yaxislabelposition == com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART)
	//*  84  176:aload           7
	//*  85  178:getstatic       #175 <Field com.github.mikephil.charting.components.YAxis$YAxisLabelPosition com.github.mikephil.charting.components.YAxis$YAxisLabelPosition.OUTSIDE_CHART>
	//*  86  181:if_acmpne       210
				f = mViewPortHandler.contentTop() - f;
	//   87  184:aload_0         
	//   88  185:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   89  188:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//   90  191:fload_2         
	//   91  192:fsub            
	//   92  193:fstore_2        
			else
	//*  93  194:aload_0         
	//*  94  195:aload_1         
	//*  95  196:fload_2         
	//*  96  197:aload           5
	//*  97  199:aload_0         
	//*  98  200:getfield        #65  <Field YAxis mYAxis>
	//*  99  203:invokevirtual   #178 <Method float YAxis.getYOffset()>
	//* 100  206:invokevirtual   #180 <Method void drawYLabels(Canvas, float, float[], float)>
	//* 101  209:return          
				f = mViewPortHandler.contentTop() - f;
	//  102  210:aload_0         
	//  103  211:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//  104  214:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//  105  217:fload_2         
	//  106  218:fsub            
	//  107  219:fstore_2        
		} else
	//* 108  220:goto            194
		if(yaxislabelposition == com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART)
	//* 109  223:aload           7
	//* 110  225:getstatic       #175 <Field com.github.mikephil.charting.components.YAxis$YAxisLabelPosition com.github.mikephil.charting.components.YAxis$YAxisLabelPosition.OUTSIDE_CHART>
	//* 111  228:if_acmpne       246
			f = mViewPortHandler.contentBottom() + f1 + f;
	//  112  231:aload_0         
	//  113  232:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//  114  235:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//  115  238:fload_3         
	//  116  239:fadd            
	//  117  240:fload_2         
	//  118  241:fadd            
	//  119  242:fstore_2        
		else
	//* 120  243:goto            194
			f = mViewPortHandler.contentBottom() + f1 + f;
	//  121  246:aload_0         
	//  122  247:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//  123  250:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//  124  253:fload_3         
	//  125  254:fadd            
	//  126  255:fload_2         
	//  127  256:fadd            
	//  128  257:fstore_2        
		drawYLabels(canvas, f, af, mYAxis.getYOffset());
	//* 129  258:goto            194
	}

	public void renderAxisLine(Canvas canvas)
	{
		if(!mYAxis.isEnabled() || !mYAxis.isDrawAxisLineEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field YAxis mYAxis>
	//*   2    4:invokevirtual   #129 <Method boolean YAxis.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #65  <Field YAxis mYAxis>
	//*   6   14:invokevirtual   #187 <Method boolean YAxis.isDrawAxisLineEnabled()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		mAxisLinePaint.setColor(mYAxis.getAxisLineColor());
	//    9   21:aload_0         
	//   10   22:getfield        #190 <Field Paint mAxisLinePaint>
	//   11   25:aload_0         
	//   12   26:getfield        #65  <Field YAxis mYAxis>
	//   13   29:invokevirtual   #193 <Method int YAxis.getAxisLineColor()>
	//   14   32:invokevirtual   #107 <Method void Paint.setColor(int)>
		mAxisLinePaint.setStrokeWidth(mYAxis.getAxisLineWidth());
	//   15   35:aload_0         
	//   16   36:getfield        #190 <Field Paint mAxisLinePaint>
	//   17   39:aload_0         
	//   18   40:getfield        #65  <Field YAxis mYAxis>
	//   19   43:invokevirtual   #196 <Method float YAxis.getAxisLineWidth()>
	//   20   46:invokevirtual   #199 <Method void Paint.setStrokeWidth(float)>
		if(mYAxis.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  21   49:aload_0         
	//*  22   50:getfield        #65  <Field YAxis mYAxis>
	//*  23   53:invokevirtual   #160 <Method com.github.mikephil.charting.components.YAxis$AxisDependency YAxis.getAxisDependency()>
	//*  24   56:getstatic       #169 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  25   59:if_acmpne       99
		{
			canvas.drawLine(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop(), mViewPortHandler.contentRight(), mViewPortHandler.contentTop(), mAxisLinePaint);
	//   26   62:aload_1         
	//   27   63:aload_0         
	//   28   64:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   29   67:invokevirtual   #49  <Method float ViewPortHandler.contentLeft()>
	//   30   70:aload_0         
	//   31   71:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   32   74:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//   33   77:aload_0         
	//   34   78:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   35   81:invokevirtual   #61  <Method float ViewPortHandler.contentRight()>
	//   36   84:aload_0         
	//   37   85:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   38   88:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//   39   91:aload_0         
	//   40   92:getfield        #190 <Field Paint mAxisLinePaint>
	//   41   95:invokevirtual   #203 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			return;
	//   42   98:return          
		} else
		{
			canvas.drawLine(mViewPortHandler.contentLeft(), mViewPortHandler.contentBottom(), mViewPortHandler.contentRight(), mViewPortHandler.contentBottom(), mAxisLinePaint);
	//   43   99:aload_1         
	//   44  100:aload_0         
	//   45  101:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   46  104:invokevirtual   #49  <Method float ViewPortHandler.contentLeft()>
	//   47  107:aload_0         
	//   48  108:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   49  111:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//   50  114:aload_0         
	//   51  115:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   52  118:invokevirtual   #61  <Method float ViewPortHandler.contentRight()>
	//   53  121:aload_0         
	//   54  122:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   55  125:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//   56  128:aload_0         
	//   57  129:getfield        #190 <Field Paint mAxisLinePaint>
	//   58  132:invokevirtual   #203 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			return;
	//   59  135:return          
		}
	}

	public void renderGridLines(Canvas canvas)
	{
		if(mYAxis.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field YAxis mYAxis>
	//*   2    4:invokevirtual   #129 <Method boolean YAxis.isEnabled()>
	//*   3    7:ifne            11
	//*   4   10:return          
		{
			float af[] = new float[2];
	//    5   11:iconst_2        
	//    6   12:newarray        float[]
	//    7   14:astore_3        
			if(mYAxis.isDrawGridLinesEnabled())
	//*   8   15:aload_0         
	//*   9   16:getfield        #65  <Field YAxis mYAxis>
	//*  10   19:invokevirtual   #207 <Method boolean YAxis.isDrawGridLinesEnabled()>
	//*  11   22:ifeq            121
			{
				mGridPaint.setColor(mYAxis.getGridColor());
	//   12   25:aload_0         
	//   13   26:getfield        #210 <Field Paint mGridPaint>
	//   14   29:aload_0         
	//   15   30:getfield        #65  <Field YAxis mYAxis>
	//   16   33:invokevirtual   #213 <Method int YAxis.getGridColor()>
	//   17   36:invokevirtual   #107 <Method void Paint.setColor(int)>
				mGridPaint.setStrokeWidth(mYAxis.getGridLineWidth());
	//   18   39:aload_0         
	//   19   40:getfield        #210 <Field Paint mGridPaint>
	//   20   43:aload_0         
	//   21   44:getfield        #65  <Field YAxis mYAxis>
	//   22   47:invokevirtual   #216 <Method float YAxis.getGridLineWidth()>
	//   23   50:invokevirtual   #199 <Method void Paint.setStrokeWidth(float)>
				for(int i = 0; i < mYAxis.mEntryCount; i++)
	//*  24   53:iconst_0        
	//*  25   54:istore_2        
	//*  26   55:iload_2         
	//*  27   56:aload_0         
	//*  28   57:getfield        #65  <Field YAxis mYAxis>
	//*  29   60:getfield        #111 <Field int YAxis.mEntryCount>
	//*  30   63:icmpge          121
				{
					af[0] = mYAxis.mEntries[i];
	//   31   66:aload_3         
	//   32   67:iconst_0        
	//   33   68:aload_0         
	//   34   69:getfield        #65  <Field YAxis mYAxis>
	//   35   72:getfield        #136 <Field float[] YAxis.mEntries>
	//   36   75:iload_2         
	//   37   76:faload          
	//   38   77:fastore         
					mTrans.pointValuesToPixel(af);
	//   39   78:aload_0         
	//   40   79:getfield        #46  <Field Transformer mTrans>
	//   41   82:aload_3         
	//   42   83:invokevirtual   #140 <Method void Transformer.pointValuesToPixel(float[])>
					canvas.drawLine(af[0], mViewPortHandler.contentTop(), af[0], mViewPortHandler.contentBottom(), mGridPaint);
	//   43   86:aload_1         
	//   44   87:aload_3         
	//   45   88:iconst_0        
	//   46   89:faload          
	//   47   90:aload_0         
	//   48   91:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   49   94:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//   50   97:aload_3         
	//   51   98:iconst_0        
	//   52   99:faload          
	//   53  100:aload_0         
	//   54  101:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   55  104:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//   56  107:aload_0         
	//   57  108:getfield        #210 <Field Paint mGridPaint>
	//   58  111:invokevirtual   #203 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				}

	//   59  114:iload_2         
	//   60  115:iconst_1        
	//   61  116:iadd            
	//   62  117:istore_2        
			}
	//*  63  118:goto            55
			if(mYAxis.isDrawZeroLineEnabled())
	//*  64  121:aload_0         
	//*  65  122:getfield        #65  <Field YAxis mYAxis>
	//*  66  125:invokevirtual   #219 <Method boolean YAxis.isDrawZeroLineEnabled()>
	//*  67  128:ifeq            10
			{
				af[0] = 0.0F;
	//   68  131:aload_3         
	//   69  132:iconst_0        
	//   70  133:fconst_0        
	//   71  134:fastore         
				mTrans.pointValuesToPixel(af);
	//   72  135:aload_0         
	//   73  136:getfield        #46  <Field Transformer mTrans>
	//   74  139:aload_3         
	//   75  140:invokevirtual   #140 <Method void Transformer.pointValuesToPixel(float[])>
				drawZeroLine(canvas, af[0] + 1.0F, af[0] + 1.0F, mViewPortHandler.contentTop(), mViewPortHandler.contentBottom());
	//   76  143:aload_0         
	//   77  144:aload_1         
	//   78  145:aload_3         
	//   79  146:iconst_0        
	//   80  147:faload          
	//   81  148:fconst_1        
	//   82  149:fadd            
	//   83  150:aload_3         
	//   84  151:iconst_0        
	//   85  152:faload          
	//   86  153:fconst_1        
	//   87  154:fadd            
	//   88  155:aload_0         
	//   89  156:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   90  159:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//   91  162:aload_0         
	//   92  163:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   93  166:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//   94  169:invokevirtual   #223 <Method void drawZeroLine(Canvas, float, float, float, float)>
				return;
	//   95  172:return          
			}
		}
	}

	public void renderLimitLines(Canvas canvas)
	{
		List list = mYAxis.getLimitLines();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field YAxis mYAxis>
	//    2    4:invokevirtual   #228 <Method List YAxis.getLimitLines()>
	//    3    7:astore          6
		if(list != null && list.size() > 0)
	//*   4    9:aload           6
	//*   5   11:ifnull          24
	//*   6   14:aload           6
	//*   7   16:invokeinterface #233 <Method int List.size()>
	//*   8   21:ifgt            25
	//*   9   24:return          
		{
			float af[] = new float[4];
	//   10   25:iconst_4        
	//   11   26:newarray        float[]
	//   12   28:astore          7
			Path path = new Path();
	//   13   30:new             #235 <Class Path>
	//   14   33:dup             
	//   15   34:invokespecial   #238 <Method void Path()>
	//   16   37:astore          8
			int i = 0;
	//   17   39:iconst_0        
	//   18   40:istore          5
			while(i < list.size()) 
	//*  19   42:iload           5
	//*  20   44:aload           6
	//*  21   46:invokeinterface #233 <Method int List.size()>
	//*  22   51:icmpge          24
			{
				Object obj = ((Object) ((LimitLine)list.get(i)));
	//   23   54:aload           6
	//   24   56:iload           5
	//   25   58:invokeinterface #242 <Method Object List.get(int)>
	//   26   63:checkcast       #244 <Class LimitLine>
	//   27   66:astore          10
				if(((LimitLine) (obj)).isEnabled())
	//*  28   68:aload           10
	//*  29   70:invokevirtual   #245 <Method boolean LimitLine.isEnabled()>
	//*  30   73:ifne            85
	//*  31   76:iload           5
	//*  32   78:iconst_1        
	//*  33   79:iadd            
	//*  34   80:istore          5
	//*  35   82:goto            42
				{
					af[0] = ((LimitLine) (obj)).getLimit();
	//   36   85:aload           7
	//   37   87:iconst_0        
	//   38   88:aload           10
	//   39   90:invokevirtual   #248 <Method float LimitLine.getLimit()>
	//   40   93:fastore         
					af[2] = ((LimitLine) (obj)).getLimit();
	//   41   94:aload           7
	//   42   96:iconst_2        
	//   43   97:aload           10
	//   44   99:invokevirtual   #248 <Method float LimitLine.getLimit()>
	//   45  102:fastore         
					mTrans.pointValuesToPixel(af);
	//   46  103:aload_0         
	//   47  104:getfield        #46  <Field Transformer mTrans>
	//   48  107:aload           7
	//   49  109:invokevirtual   #140 <Method void Transformer.pointValuesToPixel(float[])>
					af[1] = mViewPortHandler.contentTop();
	//   50  112:aload           7
	//   51  114:iconst_1        
	//   52  115:aload_0         
	//   53  116:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   54  119:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//   55  122:fastore         
					af[3] = mViewPortHandler.contentBottom();
	//   56  123:aload           7
	//   57  125:iconst_3        
	//   58  126:aload_0         
	//   59  127:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//   60  130:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//   61  133:fastore         
					path.moveTo(af[0], af[1]);
	//   62  134:aload           8
	//   63  136:aload           7
	//   64  138:iconst_0        
	//   65  139:faload          
	//   66  140:aload           7
	//   67  142:iconst_1        
	//   68  143:faload          
	//   69  144:invokevirtual   #251 <Method void Path.moveTo(float, float)>
					path.lineTo(af[2], af[3]);
	//   70  147:aload           8
	//   71  149:aload           7
	//   72  151:iconst_2        
	//   73  152:faload          
	//   74  153:aload           7
	//   75  155:iconst_3        
	//   76  156:faload          
	//   77  157:invokevirtual   #254 <Method void Path.lineTo(float, float)>
					mLimitLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   78  160:aload_0         
	//   79  161:getfield        #12  <Field Paint mLimitLinePaint>
	//   80  164:getstatic       #260 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   81  167:invokevirtual   #264 <Method void Paint.setStyle(android.graphics.Paint$Style)>
					mLimitLinePaint.setColor(((LimitLine) (obj)).getLineColor());
	//   82  170:aload_0         
	//   83  171:getfield        #12  <Field Paint mLimitLinePaint>
	//   84  174:aload           10
	//   85  176:invokevirtual   #267 <Method int LimitLine.getLineColor()>
	//   86  179:invokevirtual   #107 <Method void Paint.setColor(int)>
					mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (((LimitLine) (obj)).getDashPathEffect())));
	//   87  182:aload_0         
	//   88  183:getfield        #12  <Field Paint mLimitLinePaint>
	//   89  186:aload           10
	//   90  188:invokevirtual   #271 <Method android.graphics.DashPathEffect LimitLine.getDashPathEffect()>
	//   91  191:invokevirtual   #275 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   92  194:pop             
					mLimitLinePaint.setStrokeWidth(((LimitLine) (obj)).getLineWidth());
	//   93  195:aload_0         
	//   94  196:getfield        #12  <Field Paint mLimitLinePaint>
	//   95  199:aload           10
	//   96  201:invokevirtual   #278 <Method float LimitLine.getLineWidth()>
	//   97  204:invokevirtual   #199 <Method void Paint.setStrokeWidth(float)>
					canvas.drawPath(path, mLimitLinePaint);
	//   98  207:aload_1         
	//   99  208:aload           8
	//  100  210:aload_0         
	//  101  211:getfield        #12  <Field Paint mLimitLinePaint>
	//  102  214:invokevirtual   #282 <Method void Canvas.drawPath(Path, Paint)>
					path.reset();
	//  103  217:aload           8
	//  104  219:invokevirtual   #285 <Method void Path.reset()>
					String s = ((LimitLine) (obj)).getLabel();
	//  105  222:aload           10
	//  106  224:invokevirtual   #289 <Method String LimitLine.getLabel()>
	//  107  227:astore          9
					if(s != null && !s.equals(""))
	//* 108  229:aload           9
	//* 109  231:ifnull          76
	//* 110  234:aload           9
	//* 111  236:ldc2            #291 <String "">
	//* 112  239:invokevirtual   #297 <Method boolean String.equals(Object)>
	//* 113  242:ifne            76
					{
						mLimitLinePaint.setStyle(((LimitLine) (obj)).getTextStyle());
	//  114  245:aload_0         
	//  115  246:getfield        #12  <Field Paint mLimitLinePaint>
	//  116  249:aload           10
	//  117  251:invokevirtual   #301 <Method android.graphics.Paint$Style LimitLine.getTextStyle()>
	//  118  254:invokevirtual   #264 <Method void Paint.setStyle(android.graphics.Paint$Style)>
						mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (null)));
	//  119  257:aload_0         
	//  120  258:getfield        #12  <Field Paint mLimitLinePaint>
	//  121  261:aconst_null     
	//  122  262:invokevirtual   #275 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  123  265:pop             
						mLimitLinePaint.setColor(((LimitLine) (obj)).getTextColor());
	//  124  266:aload_0         
	//  125  267:getfield        #12  <Field Paint mLimitLinePaint>
	//  126  270:aload           10
	//  127  272:invokevirtual   #302 <Method int LimitLine.getTextColor()>
	//  128  275:invokevirtual   #107 <Method void Paint.setColor(int)>
						mLimitLinePaint.setTypeface(((LimitLine) (obj)).getTypeface());
	//  129  278:aload_0         
	//  130  279:getfield        #12  <Field Paint mLimitLinePaint>
	//  131  282:aload           10
	//  132  284:invokevirtual   #303 <Method android.graphics.Typeface LimitLine.getTypeface()>
	//  133  287:invokevirtual   #92  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//  134  290:pop             
						mLimitLinePaint.setStrokeWidth(0.5F);
	//  135  291:aload_0         
	//  136  292:getfield        #12  <Field Paint mLimitLinePaint>
	//  137  295:ldc2            #304 <Float 0.5F>
	//  138  298:invokevirtual   #199 <Method void Paint.setStrokeWidth(float)>
						mLimitLinePaint.setTextSize(((LimitLine) (obj)).getTextSize());
	//  139  301:aload_0         
	//  140  302:getfield        #12  <Field Paint mLimitLinePaint>
	//  141  305:aload           10
	//  142  307:invokevirtual   #305 <Method float LimitLine.getTextSize()>
	//  143  310:invokevirtual   #99  <Method void Paint.setTextSize(float)>
						float f = ((LimitLine) (obj)).getLineWidth() + ((LimitLine) (obj)).getXOffset();
	//  144  313:aload           10
	//  145  315:invokevirtual   #278 <Method float LimitLine.getLineWidth()>
	//  146  318:aload           10
	//  147  320:invokevirtual   #308 <Method float LimitLine.getXOffset()>
	//  148  323:fadd            
	//  149  324:fstore_2        
						float f1 = Utils.convertDpToPixel(2.0F) + ((LimitLine) (obj)).getYOffset();
	//  150  325:fconst_2        
	//  151  326:invokestatic    #150 <Method float Utils.convertDpToPixel(float)>
	//  152  329:aload           10
	//  153  331:invokevirtual   #309 <Method float LimitLine.getYOffset()>
	//  154  334:fadd            
	//  155  335:fstore_3        
						obj = ((Object) (((LimitLine) (obj)).getLabelPosition()));
	//  156  336:aload           10
	//  157  338:invokevirtual   #312 <Method com.github.mikephil.charting.components.LimitLine$LimitLabelPosition LimitLine.getLabelPosition()>
	//  158  341:astore          10
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP)
	//* 159  343:aload           10
	//* 160  345:getstatic       #318 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.RIGHT_TOP>
	//* 161  348:if_acmpne       404
						{
							float f2 = Utils.calcTextHeight(mLimitLinePaint, s);
	//  162  351:aload_0         
	//  163  352:getfield        #12  <Field Paint mLimitLinePaint>
	//  164  355:aload           9
	//  165  357:invokestatic    #156 <Method int Utils.calcTextHeight(Paint, String)>
	//  166  360:i2f             
	//  167  361:fstore          4
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  168  363:aload_0         
	//  169  364:getfield        #12  <Field Paint mLimitLinePaint>
	//  170  367:getstatic       #18  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  171  370:invokevirtual   #24  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, af[0] + f, mViewPortHandler.contentTop() + f1 + f2, mLimitLinePaint);
	//  172  373:aload_1         
	//  173  374:aload           9
	//  174  376:aload           7
	//  175  378:iconst_0        
	//  176  379:faload          
	//  177  380:fload_2         
	//  178  381:fadd            
	//  179  382:aload_0         
	//  180  383:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//  181  386:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//  182  389:fload_3         
	//  183  390:fadd            
	//  184  391:fload           4
	//  185  393:fadd            
	//  186  394:aload_0         
	//  187  395:getfield        #12  <Field Paint mLimitLinePaint>
	//  188  398:invokevirtual   #124 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 189  401:goto            76
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM)
	//* 190  404:aload           10
	//* 191  406:getstatic       #321 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.RIGHT_BOTTOM>
	//* 192  409:if_acmpne       450
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  193  412:aload_0         
	//  194  413:getfield        #12  <Field Paint mLimitLinePaint>
	//  195  416:getstatic       #18  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  196  419:invokevirtual   #24  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, af[0] + f, mViewPortHandler.contentBottom() - f1, mLimitLinePaint);
	//  197  422:aload_1         
	//  198  423:aload           9
	//  199  425:aload           7
	//  200  427:iconst_0        
	//  201  428:faload          
	//  202  429:fload_2         
	//  203  430:fadd            
	//  204  431:aload_0         
	//  205  432:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//  206  435:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//  207  438:fload_3         
	//  208  439:fsub            
	//  209  440:aload_0         
	//  210  441:getfield        #12  <Field Paint mLimitLinePaint>
	//  211  444:invokevirtual   #124 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 212  447:goto            76
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP)
	//* 213  450:aload           10
	//* 214  452:getstatic       #324 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.LEFT_TOP>
	//* 215  455:if_acmpne       511
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  216  458:aload_0         
	//  217  459:getfield        #12  <Field Paint mLimitLinePaint>
	//  218  462:getstatic       #327 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  219  465:invokevirtual   #24  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							float f3 = Utils.calcTextHeight(mLimitLinePaint, s);
	//  220  468:aload_0         
	//  221  469:getfield        #12  <Field Paint mLimitLinePaint>
	//  222  472:aload           9
	//  223  474:invokestatic    #156 <Method int Utils.calcTextHeight(Paint, String)>
	//  224  477:i2f             
	//  225  478:fstore          4
							canvas.drawText(s, af[0] - f, mViewPortHandler.contentTop() + f1 + f3, mLimitLinePaint);
	//  226  480:aload_1         
	//  227  481:aload           9
	//  228  483:aload           7
	//  229  485:iconst_0        
	//  230  486:faload          
	//  231  487:fload_2         
	//  232  488:fsub            
	//  233  489:aload_0         
	//  234  490:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//  235  493:invokevirtual   #52  <Method float ViewPortHandler.contentTop()>
	//  236  496:fload_3         
	//  237  497:fadd            
	//  238  498:fload           4
	//  239  500:fadd            
	//  240  501:aload_0         
	//  241  502:getfield        #12  <Field Paint mLimitLinePaint>
	//  242  505:invokevirtual   #124 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 243  508:goto            76
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  244  511:aload_0         
	//  245  512:getfield        #12  <Field Paint mLimitLinePaint>
	//  246  515:getstatic       #327 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  247  518:invokevirtual   #24  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, af[0] - f, mViewPortHandler.contentBottom() - f1, mLimitLinePaint);
	//  248  521:aload_1         
	//  249  522:aload           9
	//  250  524:aload           7
	//  251  526:iconst_0        
	//  252  527:faload          
	//  253  528:fload_2         
	//  254  529:fsub            
	//  255  530:aload_0         
	//  256  531:getfield        #31  <Field ViewPortHandler mViewPortHandler>
	//  257  534:invokevirtual   #183 <Method float ViewPortHandler.contentBottom()>
	//  258  537:fload_3         
	//  259  538:fsub            
	//  260  539:aload_0         
	//  261  540:getfield        #12  <Field Paint mLimitLinePaint>
	//  262  543:invokevirtual   #124 <Method void Canvas.drawText(String, float, float, Paint)>
						}
					}
				}
				i++;
			}
		}
	//* 263  546:goto            76
	}
}
