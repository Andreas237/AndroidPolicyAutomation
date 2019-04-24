// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.utils.*;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			XAxisRendererBarChart

public class XAxisRendererHorizontalBarChart extends XAxisRendererBarChart
{

	public XAxisRendererHorizontalBarChart(ViewPortHandler viewporthandler, XAxis xaxis, Transformer transformer, BarChart barchart)
	{
		super(viewporthandler, xaxis, transformer, barchart);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #8   <Method void XAxisRendererBarChart(ViewPortHandler, XAxis, Transformer, BarChart)>
	//    6    9:return          
	}

	public void computeAxis(float f, List list)
	{
		mAxisLabelPaint.setTypeface(mXAxis.getTypeface());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Paint mAxisLabelPaint>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field XAxis mXAxis>
	//    4    8:invokevirtual   #25  <Method android.graphics.Typeface XAxis.getTypeface()>
	//    5   11:invokevirtual   #31  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//    6   14:pop             
		mAxisLabelPaint.setTextSize(mXAxis.getTextSize());
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field Paint mAxisLabelPaint>
	//    9   19:aload_0         
	//   10   20:getfield        #19  <Field XAxis mXAxis>
	//   11   23:invokevirtual   #35  <Method float XAxis.getTextSize()>
	//   12   26:invokevirtual   #39  <Method void Paint.setTextSize(float)>
		mXAxis.setValues(list);
	//   13   29:aload_0         
	//   14   30:getfield        #19  <Field XAxis mXAxis>
	//   15   33:aload_2         
	//   16   34:invokevirtual   #43  <Method void XAxis.setValues(List)>
		list = ((List) (mXAxis.getLongestLabel()));
	//   17   37:aload_0         
	//   18   38:getfield        #19  <Field XAxis mXAxis>
	//   19   41:invokevirtual   #47  <Method String XAxis.getLongestLabel()>
	//   20   44:astore_2        
		list = ((List) (Utils.calcTextSize(mAxisLabelPaint, ((String) (list)))));
	//   21   45:aload_0         
	//   22   46:getfield        #15  <Field Paint mAxisLabelPaint>
	//   23   49:aload_2         
	//   24   50:invokestatic    #53  <Method FSize Utils.calcTextSize(Paint, String)>
	//   25   53:astore_2        
		f = (int)(((FSize) (list)).width + mXAxis.getXOffset() * 3.5F);
	//   26   54:aload_2         
	//   27   55:getfield        #59  <Field float FSize.width>
	//   28   58:aload_0         
	//   29   59:getfield        #19  <Field XAxis mXAxis>
	//   30   62:invokevirtual   #62  <Method float XAxis.getXOffset()>
	//   31   65:ldc1            #63  <Float 3.5F>
	//   32   67:fmul            
	//   33   68:fadd            
	//   34   69:f2i             
	//   35   70:i2f             
	//   36   71:fstore_1        
		float f1 = ((FSize) (list)).height;
	//   37   72:aload_2         
	//   38   73:getfield        #66  <Field float FSize.height>
	//   39   76:fstore_3        
		list = ((List) (Utils.getSizeOfRotatedRectangleByDegrees(((FSize) (list)).width, f1, mXAxis.getLabelRotationAngle())));
	//   40   77:aload_2         
	//   41   78:getfield        #59  <Field float FSize.width>
	//   42   81:fload_3         
	//   43   82:aload_0         
	//   44   83:getfield        #19  <Field XAxis mXAxis>
	//   45   86:invokevirtual   #69  <Method float XAxis.getLabelRotationAngle()>
	//   46   89:invokestatic    #73  <Method FSize Utils.getSizeOfRotatedRectangleByDegrees(float, float, float)>
	//   47   92:astore_2        
		mXAxis.mLabelWidth = Math.round(f);
	//   48   93:aload_0         
	//   49   94:getfield        #19  <Field XAxis mXAxis>
	//   50   97:fload_1         
	//   51   98:invokestatic    #79  <Method int Math.round(float)>
	//   52  101:putfield        #83  <Field int XAxis.mLabelWidth>
		mXAxis.mLabelHeight = Math.round(f1);
	//   53  104:aload_0         
	//   54  105:getfield        #19  <Field XAxis mXAxis>
	//   55  108:fload_3         
	//   56  109:invokestatic    #79  <Method int Math.round(float)>
	//   57  112:putfield        #86  <Field int XAxis.mLabelHeight>
		mXAxis.mLabelRotatedWidth = (int)(((FSize) (list)).width + mXAxis.getXOffset() * 3.5F);
	//   58  115:aload_0         
	//   59  116:getfield        #19  <Field XAxis mXAxis>
	//   60  119:aload_2         
	//   61  120:getfield        #59  <Field float FSize.width>
	//   62  123:aload_0         
	//   63  124:getfield        #19  <Field XAxis mXAxis>
	//   64  127:invokevirtual   #62  <Method float XAxis.getXOffset()>
	//   65  130:ldc1            #63  <Float 3.5F>
	//   66  132:fmul            
	//   67  133:fadd            
	//   68  134:f2i             
	//   69  135:putfield        #89  <Field int XAxis.mLabelRotatedWidth>
		mXAxis.mLabelRotatedHeight = Math.round(((FSize) (list)).height);
	//   70  138:aload_0         
	//   71  139:getfield        #19  <Field XAxis mXAxis>
	//   72  142:aload_2         
	//   73  143:getfield        #66  <Field float FSize.height>
	//   74  146:invokestatic    #79  <Method int Math.round(float)>
	//   75  149:putfield        #92  <Field int XAxis.mLabelRotatedHeight>
	//   76  152:return          
	}

	protected void drawLabels(Canvas canvas, float f, PointF pointf)
	{
		float f1 = mXAxis.getLabelRotationAngle();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field XAxis mXAxis>
	//    2    4:invokevirtual   #69  <Method float XAxis.getLabelRotationAngle()>
	//    3    7:fstore          4
		float af[] = new float[2];
	//    4    9:iconst_2        
	//    5   10:newarray        float[]
	//    6   12:astore          7
		float[] _tmp = af;
	//    7   14:aload           7
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:fconst_0        
	//   11   19:fastore         
	//   12   20:dup             
	//   13   21:iconst_1        
	//   14   22:fconst_0        
	//   15   23:fastore         
	//   16   24:pop             
		af[0] = 0.0F;
		af[1] = 0.0F;
		BarData bardata = (BarData)mChart.getData();
	//   17   25:aload_0         
	//   18   26:getfield        #100 <Field BarChart mChart>
	//   19   29:invokevirtual   #106 <Method com.github.mikephil.charting.data.ChartData BarChart.getData()>
	//   20   32:checkcast       #108 <Class BarData>
	//   21   35:astore          8
		int j = bardata.getDataSetCount();
	//   22   37:aload           8
	//   23   39:invokevirtual   #112 <Method int BarData.getDataSetCount()>
	//   24   42:istore          6
		for(int i = mMinX; i <= mMaxX; i += mXAxis.mAxisLabelModulus)
	//*  25   44:aload_0         
	//*  26   45:getfield        #115 <Field int mMinX>
	//*  27   48:istore          5
	//*  28   50:iload           5
	//*  29   52:aload_0         
	//*  30   53:getfield        #118 <Field int mMaxX>
	//*  31   56:icmpgt          179
		{
			af[1] = (float)(i * j) + (float)i * bardata.getGroupSpace() + bardata.getGroupSpace() / 2.0F;
	//   32   59:aload           7
	//   33   61:iconst_1        
	//   34   62:iload           5
	//   35   64:iload           6
	//   36   66:imul            
	//   37   67:i2f             
	//   38   68:iload           5
	//   39   70:i2f             
	//   40   71:aload           8
	//   41   73:invokevirtual   #121 <Method float BarData.getGroupSpace()>
	//   42   76:fmul            
	//   43   77:fadd            
	//   44   78:aload           8
	//   45   80:invokevirtual   #121 <Method float BarData.getGroupSpace()>
	//   46   83:fconst_2        
	//   47   84:fdiv            
	//   48   85:fadd            
	//   49   86:fastore         
			if(j > 1)
	//*  50   87:iload           6
	//*  51   89:iconst_1        
	//*  52   90:icmple          109
				af[1] = af[1] + ((float)j - 1.0F) / 2.0F;
	//   53   93:aload           7
	//   54   95:iconst_1        
	//   55   96:aload           7
	//   56   98:iconst_1        
	//   57   99:faload          
	//   58  100:iload           6
	//   59  102:i2f             
	//   60  103:fconst_1        
	//   61  104:fsub            
	//   62  105:fconst_2        
	//   63  106:fdiv            
	//   64  107:fadd            
	//   65  108:fastore         
			mTrans.pointValuesToPixel(af);
	//   66  109:aload_0         
	//   67  110:getfield        #125 <Field Transformer mTrans>
	//   68  113:aload           7
	//   69  115:invokevirtual   #131 <Method void Transformer.pointValuesToPixel(float[])>
			if(mViewPortHandler.isInBoundsY(af[1]))
	//*  70  118:aload_0         
	//*  71  119:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//*  72  122:aload           7
	//*  73  124:iconst_1        
	//*  74  125:faload          
	//*  75  126:invokevirtual   #141 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//*  76  129:ifeq            164
				drawLabel(canvas, (String)mXAxis.getValues().get(i), i, f, af[1], pointf, f1);
	//   77  132:aload_0         
	//   78  133:aload_1         
	//   79  134:aload_0         
	//   80  135:getfield        #19  <Field XAxis mXAxis>
	//   81  138:invokevirtual   #145 <Method List XAxis.getValues()>
	//   82  141:iload           5
	//   83  143:invokeinterface #151 <Method Object List.get(int)>
	//   84  148:checkcast       #153 <Class String>
	//   85  151:iload           5
	//   86  153:fload_2         
	//   87  154:aload           7
	//   88  156:iconst_1        
	//   89  157:faload          
	//   90  158:aload_3         
	//   91  159:fload           4
	//   92  161:invokevirtual   #157 <Method void drawLabel(Canvas, String, int, float, float, PointF, float)>
		}

	//   93  164:iload           5
	//   94  166:aload_0         
	//   95  167:getfield        #19  <Field XAxis mXAxis>
	//   96  170:getfield        #160 <Field int XAxis.mAxisLabelModulus>
	//   97  173:iadd            
	//   98  174:istore          5
	//*  99  176:goto            50
	//  100  179:return          
	}

	public void renderAxisLabels(Canvas canvas)
	{
		if(!mXAxis.isEnabled() || !mXAxis.isDrawLabelsEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #166 <Method boolean XAxis.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #169 <Method boolean XAxis.isDrawLabelsEnabled()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		float f = mXAxis.getXOffset();
	//    9   21:aload_0         
	//   10   22:getfield        #19  <Field XAxis mXAxis>
	//   11   25:invokevirtual   #62  <Method float XAxis.getXOffset()>
	//   12   28:fstore_2        
		mAxisLabelPaint.setTypeface(mXAxis.getTypeface());
	//   13   29:aload_0         
	//   14   30:getfield        #15  <Field Paint mAxisLabelPaint>
	//   15   33:aload_0         
	//   16   34:getfield        #19  <Field XAxis mXAxis>
	//   17   37:invokevirtual   #25  <Method android.graphics.Typeface XAxis.getTypeface()>
	//   18   40:invokevirtual   #31  <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   19   43:pop             
		mAxisLabelPaint.setTextSize(mXAxis.getTextSize());
	//   20   44:aload_0         
	//   21   45:getfield        #15  <Field Paint mAxisLabelPaint>
	//   22   48:aload_0         
	//   23   49:getfield        #19  <Field XAxis mXAxis>
	//   24   52:invokevirtual   #35  <Method float XAxis.getTextSize()>
	//   25   55:invokevirtual   #39  <Method void Paint.setTextSize(float)>
		mAxisLabelPaint.setColor(mXAxis.getTextColor());
	//   26   58:aload_0         
	//   27   59:getfield        #15  <Field Paint mAxisLabelPaint>
	//   28   62:aload_0         
	//   29   63:getfield        #19  <Field XAxis mXAxis>
	//   30   66:invokevirtual   #172 <Method int XAxis.getTextColor()>
	//   31   69:invokevirtual   #176 <Method void Paint.setColor(int)>
		if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP)
	//*  32   72:aload_0         
	//*  33   73:getfield        #19  <Field XAxis mXAxis>
	//*  34   76:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  35   79:getstatic       #186 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP>
	//*  36   82:if_acmpne       110
		{
			drawLabels(canvas, mViewPortHandler.contentRight() + f, new PointF(0.0F, 0.5F));
	//   37   85:aload_0         
	//   38   86:aload_1         
	//   39   87:aload_0         
	//   40   88:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   41   91:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//   42   94:fload_2         
	//   43   95:fadd            
	//   44   96:new             #191 <Class PointF>
	//   45   99:dup             
	//   46  100:fconst_0        
	//   47  101:ldc1            #192 <Float 0.5F>
	//   48  103:invokespecial   #195 <Method void PointF(float, float)>
	//   49  106:invokevirtual   #197 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//   50  109:return          
		}
		if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE)
	//*  51  110:aload_0         
	//*  52  111:getfield        #19  <Field XAxis mXAxis>
	//*  53  114:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  54  117:getstatic       #200 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP_INSIDE>
	//*  55  120:if_acmpne       148
		{
			drawLabels(canvas, mViewPortHandler.contentRight() - f, new PointF(1.0F, 0.5F));
	//   56  123:aload_0         
	//   57  124:aload_1         
	//   58  125:aload_0         
	//   59  126:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   60  129:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//   61  132:fload_2         
	//   62  133:fsub            
	//   63  134:new             #191 <Class PointF>
	//   64  137:dup             
	//   65  138:fconst_1        
	//   66  139:ldc1            #192 <Float 0.5F>
	//   67  141:invokespecial   #195 <Method void PointF(float, float)>
	//   68  144:invokevirtual   #197 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//   69  147:return          
		}
		if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM)
	//*  70  148:aload_0         
	//*  71  149:getfield        #19  <Field XAxis mXAxis>
	//*  72  152:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  73  155:getstatic       #203 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM>
	//*  74  158:if_acmpne       186
		{
			drawLabels(canvas, mViewPortHandler.contentLeft() - f, new PointF(1.0F, 0.5F));
	//   75  161:aload_0         
	//   76  162:aload_1         
	//   77  163:aload_0         
	//   78  164:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   79  167:invokevirtual   #206 <Method float ViewPortHandler.contentLeft()>
	//   80  170:fload_2         
	//   81  171:fsub            
	//   82  172:new             #191 <Class PointF>
	//   83  175:dup             
	//   84  176:fconst_1        
	//   85  177:ldc1            #192 <Float 0.5F>
	//   86  179:invokespecial   #195 <Method void PointF(float, float)>
	//   87  182:invokevirtual   #197 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//   88  185:return          
		}
		if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE)
	//*  89  186:aload_0         
	//*  90  187:getfield        #19  <Field XAxis mXAxis>
	//*  91  190:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  92  193:getstatic       #209 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM_INSIDE>
	//*  93  196:if_acmpne       224
		{
			drawLabels(canvas, mViewPortHandler.contentLeft() + f, new PointF(0.0F, 0.5F));
	//   94  199:aload_0         
	//   95  200:aload_1         
	//   96  201:aload_0         
	//   97  202:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   98  205:invokevirtual   #206 <Method float ViewPortHandler.contentLeft()>
	//   99  208:fload_2         
	//  100  209:fadd            
	//  101  210:new             #191 <Class PointF>
	//  102  213:dup             
	//  103  214:fconst_0        
	//  104  215:ldc1            #192 <Float 0.5F>
	//  105  217:invokespecial   #195 <Method void PointF(float, float)>
	//  106  220:invokevirtual   #197 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//  107  223:return          
		} else
		{
			drawLabels(canvas, mViewPortHandler.contentRight() + f, new PointF(0.0F, 0.5F));
	//  108  224:aload_0         
	//  109  225:aload_1         
	//  110  226:aload_0         
	//  111  227:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//  112  230:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//  113  233:fload_2         
	//  114  234:fadd            
	//  115  235:new             #191 <Class PointF>
	//  116  238:dup             
	//  117  239:fconst_0        
	//  118  240:ldc1            #192 <Float 0.5F>
	//  119  242:invokespecial   #195 <Method void PointF(float, float)>
	//  120  245:invokevirtual   #197 <Method void drawLabels(Canvas, float, PointF)>
			drawLabels(canvas, mViewPortHandler.contentLeft() - f, new PointF(1.0F, 0.5F));
	//  121  248:aload_0         
	//  122  249:aload_1         
	//  123  250:aload_0         
	//  124  251:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//  125  254:invokevirtual   #206 <Method float ViewPortHandler.contentLeft()>
	//  126  257:fload_2         
	//  127  258:fsub            
	//  128  259:new             #191 <Class PointF>
	//  129  262:dup             
	//  130  263:fconst_1        
	//  131  264:ldc1            #192 <Float 0.5F>
	//  132  266:invokespecial   #195 <Method void PointF(float, float)>
	//  133  269:invokevirtual   #197 <Method void drawLabels(Canvas, float, PointF)>
			return;
	//  134  272:return          
		}
	}

	public void renderAxisLine(Canvas canvas)
	{
		if(mXAxis.isDrawAxisLineEnabled() && mXAxis.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #213 <Method boolean XAxis.isDrawAxisLineEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #166 <Method boolean XAxis.isEnabled()>
	//*   7   17:ifne            21
	//*   8   20:return          
		{
			mAxisLinePaint.setColor(mXAxis.getAxisLineColor());
	//    9   21:aload_0         
	//   10   22:getfield        #216 <Field Paint mAxisLinePaint>
	//   11   25:aload_0         
	//   12   26:getfield        #19  <Field XAxis mXAxis>
	//   13   29:invokevirtual   #219 <Method int XAxis.getAxisLineColor()>
	//   14   32:invokevirtual   #176 <Method void Paint.setColor(int)>
			mAxisLinePaint.setStrokeWidth(mXAxis.getAxisLineWidth());
	//   15   35:aload_0         
	//   16   36:getfield        #216 <Field Paint mAxisLinePaint>
	//   17   39:aload_0         
	//   18   40:getfield        #19  <Field XAxis mXAxis>
	//   19   43:invokevirtual   #222 <Method float XAxis.getAxisLineWidth()>
	//   20   46:invokevirtual   #225 <Method void Paint.setStrokeWidth(float)>
			if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP || mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP_INSIDE || mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED)
	//*  21   49:aload_0         
	//*  22   50:getfield        #19  <Field XAxis mXAxis>
	//*  23   53:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  24   56:getstatic       #186 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP>
	//*  25   59:if_acmpeq       88
	//*  26   62:aload_0         
	//*  27   63:getfield        #19  <Field XAxis mXAxis>
	//*  28   66:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  29   69:getstatic       #200 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP_INSIDE>
	//*  30   72:if_acmpeq       88
	//*  31   75:aload_0         
	//*  32   76:getfield        #19  <Field XAxis mXAxis>
	//*  33   79:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  34   82:getstatic       #228 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTH_SIDED>
	//*  35   85:if_acmpne       124
				canvas.drawLine(mViewPortHandler.contentRight(), mViewPortHandler.contentTop(), mViewPortHandler.contentRight(), mViewPortHandler.contentBottom(), mAxisLinePaint);
	//   36   88:aload_1         
	//   37   89:aload_0         
	//   38   90:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   39   93:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//   40   96:aload_0         
	//   41   97:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   42  100:invokevirtual   #231 <Method float ViewPortHandler.contentTop()>
	//   43  103:aload_0         
	//   44  104:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   45  107:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//   46  110:aload_0         
	//   47  111:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   48  114:invokevirtual   #234 <Method float ViewPortHandler.contentBottom()>
	//   49  117:aload_0         
	//   50  118:getfield        #216 <Field Paint mAxisLinePaint>
	//   51  121:invokevirtual   #240 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM || mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM_INSIDE || mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED)
	//*  52  124:aload_0         
	//*  53  125:getfield        #19  <Field XAxis mXAxis>
	//*  54  128:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  55  131:getstatic       #203 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM>
	//*  56  134:if_acmpeq       163
	//*  57  137:aload_0         
	//*  58  138:getfield        #19  <Field XAxis mXAxis>
	//*  59  141:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  60  144:getstatic       #209 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM_INSIDE>
	//*  61  147:if_acmpeq       163
	//*  62  150:aload_0         
	//*  63  151:getfield        #19  <Field XAxis mXAxis>
	//*  64  154:invokevirtual   #180 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//*  65  157:getstatic       #228 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTH_SIDED>
	//*  66  160:if_acmpne       20
			{
				canvas.drawLine(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop(), mViewPortHandler.contentLeft(), mViewPortHandler.contentBottom(), mAxisLinePaint);
	//   67  163:aload_1         
	//   68  164:aload_0         
	//   69  165:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   70  168:invokevirtual   #206 <Method float ViewPortHandler.contentLeft()>
	//   71  171:aload_0         
	//   72  172:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   73  175:invokevirtual   #231 <Method float ViewPortHandler.contentTop()>
	//   74  178:aload_0         
	//   75  179:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   76  182:invokevirtual   #206 <Method float ViewPortHandler.contentLeft()>
	//   77  185:aload_0         
	//   78  186:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   79  189:invokevirtual   #234 <Method float ViewPortHandler.contentBottom()>
	//   80  192:aload_0         
	//   81  193:getfield        #216 <Field Paint mAxisLinePaint>
	//   82  196:invokevirtual   #240 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				return;
	//   83  199:return          
			}
		}
	}

	public void renderGridLines(Canvas canvas)
	{
		if(mXAxis.isDrawGridLinesEnabled() && mXAxis.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #244 <Method boolean XAxis.isDrawGridLinesEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #19  <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #166 <Method boolean XAxis.isEnabled()>
	//*   7   17:ifne            21
	//*   8   20:return          
		{
			float af[] = new float[2];
	//    9   21:iconst_2        
	//   10   22:newarray        float[]
	//   11   24:astore          4
			float[] _tmp = af;
	//   12   26:aload           4
	//   13   28:dup             
	//   14   29:iconst_0        
	//   15   30:fconst_0        
	//   16   31:fastore         
	//   17   32:dup             
	//   18   33:iconst_1        
	//   19   34:fconst_0        
	//   20   35:fastore         
	//   21   36:pop             
			af[0] = 0.0F;
			af[1] = 0.0F;
			mGridPaint.setColor(mXAxis.getGridColor());
	//   22   37:aload_0         
	//   23   38:getfield        #247 <Field Paint mGridPaint>
	//   24   41:aload_0         
	//   25   42:getfield        #19  <Field XAxis mXAxis>
	//   26   45:invokevirtual   #250 <Method int XAxis.getGridColor()>
	//   27   48:invokevirtual   #176 <Method void Paint.setColor(int)>
			mGridPaint.setStrokeWidth(mXAxis.getGridLineWidth());
	//   28   51:aload_0         
	//   29   52:getfield        #247 <Field Paint mGridPaint>
	//   30   55:aload_0         
	//   31   56:getfield        #19  <Field XAxis mXAxis>
	//   32   59:invokevirtual   #253 <Method float XAxis.getGridLineWidth()>
	//   33   62:invokevirtual   #225 <Method void Paint.setStrokeWidth(float)>
			BarData bardata = (BarData)mChart.getData();
	//   34   65:aload_0         
	//   35   66:getfield        #100 <Field BarChart mChart>
	//   36   69:invokevirtual   #106 <Method com.github.mikephil.charting.data.ChartData BarChart.getData()>
	//   37   72:checkcast       #108 <Class BarData>
	//   38   75:astore          5
			int j = bardata.getDataSetCount();
	//   39   77:aload           5
	//   40   79:invokevirtual   #112 <Method int BarData.getDataSetCount()>
	//   41   82:istore_3        
			int i = mMinX;
	//   42   83:aload_0         
	//   43   84:getfield        #115 <Field int mMinX>
	//   44   87:istore_2        
			while(i <= mMaxX) 
	//*  45   88:iload_2         
	//*  46   89:aload_0         
	//*  47   90:getfield        #118 <Field int mMaxX>
	//*  48   93:icmpgt          20
			{
				af[1] = ((float)(i * j) + (float)i * bardata.getGroupSpace()) - 0.5F;
	//   49   96:aload           4
	//   50   98:iconst_1        
	//   51   99:iload_2         
	//   52  100:iload_3         
	//   53  101:imul            
	//   54  102:i2f             
	//   55  103:iload_2         
	//   56  104:i2f             
	//   57  105:aload           5
	//   58  107:invokevirtual   #121 <Method float BarData.getGroupSpace()>
	//   59  110:fmul            
	//   60  111:fadd            
	//   61  112:ldc1            #192 <Float 0.5F>
	//   62  114:fsub            
	//   63  115:fastore         
				mTrans.pointValuesToPixel(af);
	//   64  116:aload_0         
	//   65  117:getfield        #125 <Field Transformer mTrans>
	//   66  120:aload           4
	//   67  122:invokevirtual   #131 <Method void Transformer.pointValuesToPixel(float[])>
				if(mViewPortHandler.isInBoundsY(af[1]))
	//*  68  125:aload_0         
	//*  69  126:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//*  70  129:aload           4
	//*  71  131:iconst_1        
	//*  72  132:faload          
	//*  73  133:invokevirtual   #141 <Method boolean ViewPortHandler.isInBoundsY(float)>
	//*  74  136:ifeq            169
					canvas.drawLine(mViewPortHandler.contentLeft(), af[1], mViewPortHandler.contentRight(), af[1], mGridPaint);
	//   75  139:aload_1         
	//   76  140:aload_0         
	//   77  141:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   78  144:invokevirtual   #206 <Method float ViewPortHandler.contentLeft()>
	//   79  147:aload           4
	//   80  149:iconst_1        
	//   81  150:faload          
	//   82  151:aload_0         
	//   83  152:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   84  155:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//   85  158:aload           4
	//   86  160:iconst_1        
	//   87  161:faload          
	//   88  162:aload_0         
	//   89  163:getfield        #247 <Field Paint mGridPaint>
	//   90  166:invokevirtual   #240 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				i += mXAxis.mAxisLabelModulus;
	//   91  169:iload_2         
	//   92  170:aload_0         
	//   93  171:getfield        #19  <Field XAxis mXAxis>
	//   94  174:getfield        #160 <Field int XAxis.mAxisLabelModulus>
	//   95  177:iadd            
	//   96  178:istore_2        
			}
		}
	//*  97  179:goto            88
	}

	public void renderLimitLines(Canvas canvas)
	{
		List list = mXAxis.getLimitLines();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field XAxis mXAxis>
	//    2    4:invokevirtual   #257 <Method List XAxis.getLimitLines()>
	//    3    7:astore          6
		if(list != null && list.size() > 0)
	//*   4    9:aload           6
	//*   5   11:ifnull          24
	//*   6   14:aload           6
	//*   7   16:invokeinterface #260 <Method int List.size()>
	//*   8   21:ifgt            25
	//*   9   24:return          
		{
			float af[] = new float[2];
	//   10   25:iconst_2        
	//   11   26:newarray        float[]
	//   12   28:astore          7
			Path path = new Path();
	//   13   30:new             #262 <Class Path>
	//   14   33:dup             
	//   15   34:invokespecial   #265 <Method void Path()>
	//   16   37:astore          8
			int i = 0;
	//   17   39:iconst_0        
	//   18   40:istore          5
			while(i < list.size()) 
	//*  19   42:iload           5
	//*  20   44:aload           6
	//*  21   46:invokeinterface #260 <Method int List.size()>
	//*  22   51:icmpge          24
			{
				Object obj = ((Object) ((LimitLine)list.get(i)));
	//   23   54:aload           6
	//   24   56:iload           5
	//   25   58:invokeinterface #151 <Method Object List.get(int)>
	//   26   63:checkcast       #267 <Class LimitLine>
	//   27   66:astore          10
				if(((LimitLine) (obj)).isEnabled())
	//*  28   68:aload           10
	//*  29   70:invokevirtual   #268 <Method boolean LimitLine.isEnabled()>
	//*  30   73:ifne            85
	//*  31   76:iload           5
	//*  32   78:iconst_1        
	//*  33   79:iadd            
	//*  34   80:istore          5
	//*  35   82:goto            42
				{
					mLimitLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   36   85:aload_0         
	//   37   86:getfield        #271 <Field Paint mLimitLinePaint>
	//   38   89:getstatic       #277 <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   39   92:invokevirtual   #281 <Method void Paint.setStyle(android.graphics.Paint$Style)>
					mLimitLinePaint.setColor(((LimitLine) (obj)).getLineColor());
	//   40   95:aload_0         
	//   41   96:getfield        #271 <Field Paint mLimitLinePaint>
	//   42   99:aload           10
	//   43  101:invokevirtual   #284 <Method int LimitLine.getLineColor()>
	//   44  104:invokevirtual   #176 <Method void Paint.setColor(int)>
					mLimitLinePaint.setStrokeWidth(((LimitLine) (obj)).getLineWidth());
	//   45  107:aload_0         
	//   46  108:getfield        #271 <Field Paint mLimitLinePaint>
	//   47  111:aload           10
	//   48  113:invokevirtual   #287 <Method float LimitLine.getLineWidth()>
	//   49  116:invokevirtual   #225 <Method void Paint.setStrokeWidth(float)>
					mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (((LimitLine) (obj)).getDashPathEffect())));
	//   50  119:aload_0         
	//   51  120:getfield        #271 <Field Paint mLimitLinePaint>
	//   52  123:aload           10
	//   53  125:invokevirtual   #291 <Method android.graphics.DashPathEffect LimitLine.getDashPathEffect()>
	//   54  128:invokevirtual   #295 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   55  131:pop             
					af[1] = ((LimitLine) (obj)).getLimit();
	//   56  132:aload           7
	//   57  134:iconst_1        
	//   58  135:aload           10
	//   59  137:invokevirtual   #298 <Method float LimitLine.getLimit()>
	//   60  140:fastore         
					mTrans.pointValuesToPixel(af);
	//   61  141:aload_0         
	//   62  142:getfield        #125 <Field Transformer mTrans>
	//   63  145:aload           7
	//   64  147:invokevirtual   #131 <Method void Transformer.pointValuesToPixel(float[])>
					path.moveTo(mViewPortHandler.contentLeft(), af[1]);
	//   65  150:aload           8
	//   66  152:aload_0         
	//   67  153:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   68  156:invokevirtual   #206 <Method float ViewPortHandler.contentLeft()>
	//   69  159:aload           7
	//   70  161:iconst_1        
	//   71  162:faload          
	//   72  163:invokevirtual   #301 <Method void Path.moveTo(float, float)>
					path.lineTo(mViewPortHandler.contentRight(), af[1]);
	//   73  166:aload           8
	//   74  168:aload_0         
	//   75  169:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//   76  172:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//   77  175:aload           7
	//   78  177:iconst_1        
	//   79  178:faload          
	//   80  179:invokevirtual   #304 <Method void Path.lineTo(float, float)>
					canvas.drawPath(path, mLimitLinePaint);
	//   81  182:aload_1         
	//   82  183:aload           8
	//   83  185:aload_0         
	//   84  186:getfield        #271 <Field Paint mLimitLinePaint>
	//   85  189:invokevirtual   #308 <Method void Canvas.drawPath(Path, Paint)>
					path.reset();
	//   86  192:aload           8
	//   87  194:invokevirtual   #311 <Method void Path.reset()>
					String s = ((LimitLine) (obj)).getLabel();
	//   88  197:aload           10
	//   89  199:invokevirtual   #314 <Method String LimitLine.getLabel()>
	//   90  202:astore          9
					if(s != null && !s.equals(""))
	//*  91  204:aload           9
	//*  92  206:ifnull          76
	//*  93  209:aload           9
	//*  94  211:ldc2            #316 <String "">
	//*  95  214:invokevirtual   #320 <Method boolean String.equals(Object)>
	//*  96  217:ifne            76
					{
						mLimitLinePaint.setStyle(((LimitLine) (obj)).getTextStyle());
	//   97  220:aload_0         
	//   98  221:getfield        #271 <Field Paint mLimitLinePaint>
	//   99  224:aload           10
	//  100  226:invokevirtual   #324 <Method android.graphics.Paint$Style LimitLine.getTextStyle()>
	//  101  229:invokevirtual   #281 <Method void Paint.setStyle(android.graphics.Paint$Style)>
						mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (null)));
	//  102  232:aload_0         
	//  103  233:getfield        #271 <Field Paint mLimitLinePaint>
	//  104  236:aconst_null     
	//  105  237:invokevirtual   #295 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  106  240:pop             
						mLimitLinePaint.setColor(((LimitLine) (obj)).getTextColor());
	//  107  241:aload_0         
	//  108  242:getfield        #271 <Field Paint mLimitLinePaint>
	//  109  245:aload           10
	//  110  247:invokevirtual   #325 <Method int LimitLine.getTextColor()>
	//  111  250:invokevirtual   #176 <Method void Paint.setColor(int)>
						mLimitLinePaint.setStrokeWidth(0.5F);
	//  112  253:aload_0         
	//  113  254:getfield        #271 <Field Paint mLimitLinePaint>
	//  114  257:ldc1            #192 <Float 0.5F>
	//  115  259:invokevirtual   #225 <Method void Paint.setStrokeWidth(float)>
						mLimitLinePaint.setTextSize(((LimitLine) (obj)).getTextSize());
	//  116  262:aload_0         
	//  117  263:getfield        #271 <Field Paint mLimitLinePaint>
	//  118  266:aload           10
	//  119  268:invokevirtual   #326 <Method float LimitLine.getTextSize()>
	//  120  271:invokevirtual   #39  <Method void Paint.setTextSize(float)>
						float f = Utils.calcTextHeight(mLimitLinePaint, s);
	//  121  274:aload_0         
	//  122  275:getfield        #271 <Field Paint mLimitLinePaint>
	//  123  278:aload           9
	//  124  280:invokestatic    #330 <Method int Utils.calcTextHeight(Paint, String)>
	//  125  283:i2f             
	//  126  284:fstore_2        
						float f1 = Utils.convertDpToPixel(4F) + ((LimitLine) (obj)).getXOffset();
	//  127  285:ldc2            #331 <Float 4F>
	//  128  288:invokestatic    #335 <Method float Utils.convertDpToPixel(float)>
	//  129  291:aload           10
	//  130  293:invokevirtual   #336 <Method float LimitLine.getXOffset()>
	//  131  296:fadd            
	//  132  297:fstore_3        
						float f2 = ((LimitLine) (obj)).getLineWidth() + f + ((LimitLine) (obj)).getYOffset();
	//  133  298:aload           10
	//  134  300:invokevirtual   #287 <Method float LimitLine.getLineWidth()>
	//  135  303:fload_2         
	//  136  304:fadd            
	//  137  305:aload           10
	//  138  307:invokevirtual   #339 <Method float LimitLine.getYOffset()>
	//  139  310:fadd            
	//  140  311:fstore          4
						obj = ((Object) (((LimitLine) (obj)).getLabelPosition()));
	//  141  313:aload           10
	//  142  315:invokevirtual   #343 <Method com.github.mikephil.charting.components.LimitLine$LimitLabelPosition LimitLine.getLabelPosition()>
	//  143  318:astore          10
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP)
	//* 144  320:aload           10
	//* 145  322:getstatic       #349 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.RIGHT_TOP>
	//* 146  325:if_acmpne       369
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  147  328:aload_0         
	//  148  329:getfield        #271 <Field Paint mLimitLinePaint>
	//  149  332:getstatic       #355 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  150  335:invokevirtual   #359 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, mViewPortHandler.contentRight() - f1, (af[1] - f2) + f, mLimitLinePaint);
	//  151  338:aload_1         
	//  152  339:aload           9
	//  153  341:aload_0         
	//  154  342:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//  155  345:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//  156  348:fload_3         
	//  157  349:fsub            
	//  158  350:aload           7
	//  159  352:iconst_1        
	//  160  353:faload          
	//  161  354:fload           4
	//  162  356:fsub            
	//  163  357:fload_2         
	//  164  358:fadd            
	//  165  359:aload_0         
	//  166  360:getfield        #271 <Field Paint mLimitLinePaint>
	//  167  363:invokevirtual   #363 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 168  366:goto            76
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM)
	//* 169  369:aload           10
	//* 170  371:getstatic       #366 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.RIGHT_BOTTOM>
	//* 171  374:if_acmpne       416
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  172  377:aload_0         
	//  173  378:getfield        #271 <Field Paint mLimitLinePaint>
	//  174  381:getstatic       #355 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  175  384:invokevirtual   #359 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, mViewPortHandler.contentRight() - f1, af[1] + f2, mLimitLinePaint);
	//  176  387:aload_1         
	//  177  388:aload           9
	//  178  390:aload_0         
	//  179  391:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//  180  394:invokevirtual   #189 <Method float ViewPortHandler.contentRight()>
	//  181  397:fload_3         
	//  182  398:fsub            
	//  183  399:aload           7
	//  184  401:iconst_1        
	//  185  402:faload          
	//  186  403:fload           4
	//  187  405:fadd            
	//  188  406:aload_0         
	//  189  407:getfield        #271 <Field Paint mLimitLinePaint>
	//  190  410:invokevirtual   #363 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 191  413:goto            76
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP)
	//* 192  416:aload           10
	//* 193  418:getstatic       #369 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.LEFT_TOP>
	//* 194  421:if_acmpne       465
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  195  424:aload_0         
	//  196  425:getfield        #271 <Field Paint mLimitLinePaint>
	//  197  428:getstatic       #372 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  198  431:invokevirtual   #359 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, mViewPortHandler.contentLeft() + f1, (af[1] - f2) + f, mLimitLinePaint);
	//  199  434:aload_1         
	//  200  435:aload           9
	//  201  437:aload_0         
	//  202  438:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//  203  441:invokevirtual   #206 <Method float ViewPortHandler.contentLeft()>
	//  204  444:fload_3         
	//  205  445:fadd            
	//  206  446:aload           7
	//  207  448:iconst_1        
	//  208  449:faload          
	//  209  450:fload           4
	//  210  452:fsub            
	//  211  453:fload_2         
	//  212  454:fadd            
	//  213  455:aload_0         
	//  214  456:getfield        #271 <Field Paint mLimitLinePaint>
	//  215  459:invokevirtual   #363 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 216  462:goto            76
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  217  465:aload_0         
	//  218  466:getfield        #271 <Field Paint mLimitLinePaint>
	//  219  469:getstatic       #372 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  220  472:invokevirtual   #359 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, mViewPortHandler.offsetLeft() + f1, af[1] + f2, mLimitLinePaint);
	//  221  475:aload_1         
	//  222  476:aload           9
	//  223  478:aload_0         
	//  224  479:getfield        #135 <Field ViewPortHandler mViewPortHandler>
	//  225  482:invokevirtual   #375 <Method float ViewPortHandler.offsetLeft()>
	//  226  485:fload_3         
	//  227  486:fadd            
	//  228  487:aload           7
	//  229  489:iconst_1        
	//  230  490:faload          
	//  231  491:fload           4
	//  232  493:fadd            
	//  233  494:aload_0         
	//  234  495:getfield        #271 <Field Paint mLimitLinePaint>
	//  235  498:invokevirtual   #363 <Method void Canvas.drawText(String, float, float, Paint)>
						}
					}
				}
				i++;
			}
		}
	//* 236  501:goto            76
	}
}
