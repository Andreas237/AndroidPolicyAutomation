// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.utils.*;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			XAxisRenderer

public class XAxisRendererBarChart extends XAxisRenderer
{

	public XAxisRendererBarChart(ViewPortHandler viewporthandler, XAxis xaxis, Transformer transformer, BarChart barchart)
	{
		super(viewporthandler, xaxis, transformer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #11  <Method void XAxisRenderer(ViewPortHandler, XAxis, Transformer)>
		mChart = barchart;
	//    5    7:aload_0         
	//    6    8:aload           4
	//    7   10:putfield        #13  <Field BarChart mChart>
	//    8   13:return          
	}

	protected void drawLabels(Canvas canvas, float f, PointF pointf)
	{
		float f1;
		int i;
		int j;
		float af[];
		BarData bardata;
		f1 = mXAxis.getLabelRotationAngle();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field XAxis mXAxis>
	//    2    4:invokevirtual   #26  <Method float XAxis.getLabelRotationAngle()>
	//    3    7:fstore          4
		af = new float[2];
	//    4    9:iconst_2        
	//    5   10:newarray        float[]
	//    6   12:astore          8
		af;
	//    7   14:aload           8
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
		bardata = (BarData)mChart.getData();
	//   17   25:aload_0         
	//   18   26:getfield        #13  <Field BarChart mChart>
	//   19   29:invokevirtual   #32  <Method com.github.mikephil.charting.data.ChartData BarChart.getData()>
	//   20   32:checkcast       #34  <Class BarData>
	//   21   35:astore          9
		j = bardata.getDataSetCount();
	//   22   37:aload           9
	//   23   39:invokevirtual   #38  <Method int BarData.getDataSetCount()>
	//   24   42:istore          7
		i = mMinX;
	//   25   44:aload_0         
	//   26   45:getfield        #42  <Field int mMinX>
	//   27   48:istore          6
_L10:
		if(i > mMaxX) goto _L2; else goto _L1
	//   28   50:iload           6
	//   29   52:aload_0         
	//   30   53:getfield        #45  <Field int mMaxX>
	//   31   56:icmpgt          338
_L1:
		af[0] = (float)(i * j) + (float)i * bardata.getGroupSpace() + bardata.getGroupSpace() / 2.0F;
	//   32   59:aload           8
	//   33   61:iconst_0        
	//   34   62:iload           6
	//   35   64:iload           7
	//   36   66:imul            
	//   37   67:i2f             
	//   38   68:iload           6
	//   39   70:i2f             
	//   40   71:aload           9
	//   41   73:invokevirtual   #48  <Method float BarData.getGroupSpace()>
	//   42   76:fmul            
	//   43   77:fadd            
	//   44   78:aload           9
	//   45   80:invokevirtual   #48  <Method float BarData.getGroupSpace()>
	//   46   83:fconst_2        
	//   47   84:fdiv            
	//   48   85:fadd            
	//   49   86:fastore         
		if(j > 1)
	//*  50   87:iload           7
	//*  51   89:iconst_1        
	//*  52   90:icmple          109
			af[0] = af[0] + ((float)j - 1.0F) / 2.0F;
	//   53   93:aload           8
	//   54   95:iconst_0        
	//   55   96:aload           8
	//   56   98:iconst_0        
	//   57   99:faload          
	//   58  100:iload           7
	//   59  102:i2f             
	//   60  103:fconst_1        
	//   61  104:fsub            
	//   62  105:fconst_2        
	//   63  106:fdiv            
	//   64  107:fadd            
	//   65  108:fastore         
		mTrans.pointValuesToPixel(af);
	//   66  109:aload_0         
	//   67  110:getfield        #52  <Field Transformer mTrans>
	//   68  113:aload           8
	//   69  115:invokevirtual   #58  <Method void Transformer.pointValuesToPixel(float[])>
		if(!mViewPortHandler.isInBoundsX(af[0]) || i < 0 || i >= mXAxis.getValues().size()) goto _L4; else goto _L3
	//   70  118:aload_0         
	//   71  119:getfield        #62  <Field ViewPortHandler mViewPortHandler>
	//   72  122:aload           8
	//   73  124:iconst_0        
	//   74  125:faload          
	//   75  126:invokevirtual   #68  <Method boolean ViewPortHandler.isInBoundsX(float)>
	//   76  129:ifeq            267
	//   77  132:iload           6
	//   78  134:iflt            267
	//   79  137:iload           6
	//   80  139:aload_0         
	//   81  140:getfield        #20  <Field XAxis mXAxis>
	//   82  143:invokevirtual   #72  <Method List XAxis.getValues()>
	//   83  146:invokeinterface #77  <Method int List.size()>
	//   84  151:icmpge          267
_L3:
		String s = (String)mXAxis.getValues().get(i);
	//   85  154:aload_0         
	//   86  155:getfield        #20  <Field XAxis mXAxis>
	//   87  158:invokevirtual   #72  <Method List XAxis.getValues()>
	//   88  161:iload           6
	//   89  163:invokeinterface #81  <Method Object List.get(int)>
	//   90  168:checkcast       #83  <Class String>
	//   91  171:astore          10
		if(!mXAxis.isAvoidFirstLastClippingEnabled()) goto _L6; else goto _L5
	//   92  173:aload_0         
	//   93  174:getfield        #20  <Field XAxis mXAxis>
	//   94  177:invokevirtual   #87  <Method boolean XAxis.isAvoidFirstLastClippingEnabled()>
	//   95  180:ifeq            250
_L5:
		if(i != mXAxis.getValues().size() - 1) goto _L8; else goto _L7
	//   96  183:iload           6
	//   97  185:aload_0         
	//   98  186:getfield        #20  <Field XAxis mXAxis>
	//   99  189:invokevirtual   #72  <Method List XAxis.getValues()>
	//  100  192:invokeinterface #77  <Method int List.size()>
	//  101  197:iconst_1        
	//  102  198:isub            
	//  103  199:icmpne          282
_L7:
		float f2 = Utils.calcTextWidth(mAxisLabelPaint, s);
	//  104  202:aload_0         
	//  105  203:getfield        #91  <Field Paint mAxisLabelPaint>
	//  106  206:aload           10
	//  107  208:invokestatic    #97  <Method int Utils.calcTextWidth(Paint, String)>
	//  108  211:i2f             
	//  109  212:fstore          5
		if(af[0] + f2 / 2.0F > mViewPortHandler.contentRight())
	//* 110  214:aload           8
	//* 111  216:iconst_0        
	//* 112  217:faload          
	//* 113  218:fload           5
	//* 114  220:fconst_2        
	//* 115  221:fdiv            
	//* 116  222:fadd            
	//* 117  223:aload_0         
	//* 118  224:getfield        #62  <Field ViewPortHandler mViewPortHandler>
	//* 119  227:invokevirtual   #100 <Method float ViewPortHandler.contentRight()>
	//* 120  230:fcmpl           
	//* 121  231:ifle            250
			af[0] = mViewPortHandler.contentRight() - f2 / 2.0F;
	//  122  234:aload           8
	//  123  236:iconst_0        
	//  124  237:aload_0         
	//  125  238:getfield        #62  <Field ViewPortHandler mViewPortHandler>
	//  126  241:invokevirtual   #100 <Method float ViewPortHandler.contentRight()>
	//  127  244:fload           5
	//  128  246:fconst_2        
	//  129  247:fdiv            
	//  130  248:fsub            
	//  131  249:fastore         
_L6:
		drawLabel(canvas, s, i, af[0], f, pointf, f1);
	//  132  250:aload_0         
	//  133  251:aload_1         
	//  134  252:aload           10
	//  135  254:iload           6
	//  136  256:aload           8
	//  137  258:iconst_0        
	//  138  259:faload          
	//  139  260:fload_2         
	//  140  261:aload_3         
	//  141  262:fload           4
	//  142  264:invokevirtual   #104 <Method void drawLabel(Canvas, String, int, float, float, PointF, float)>
_L4:
		i += mXAxis.mAxisLabelModulus;
	//  143  267:iload           6
	//  144  269:aload_0         
	//  145  270:getfield        #20  <Field XAxis mXAxis>
	//  146  273:getfield        #107 <Field int XAxis.mAxisLabelModulus>
	//  147  276:iadd            
	//  148  277:istore          6
		continue; /* Loop/switch isn't completed */
	//  149  279:goto            50
_L8:
		if(i == 0)
	//* 150  282:iload           6
	//* 151  284:ifne            250
		{
			float f3 = Utils.calcTextWidth(mAxisLabelPaint, s);
	//  152  287:aload_0         
	//  153  288:getfield        #91  <Field Paint mAxisLabelPaint>
	//  154  291:aload           10
	//  155  293:invokestatic    #97  <Method int Utils.calcTextWidth(Paint, String)>
	//  156  296:i2f             
	//  157  297:fstore          5
			if(af[0] - f3 / 2.0F < mViewPortHandler.contentLeft())
	//* 158  299:aload           8
	//* 159  301:iconst_0        
	//* 160  302:faload          
	//* 161  303:fload           5
	//* 162  305:fconst_2        
	//* 163  306:fdiv            
	//* 164  307:fsub            
	//* 165  308:aload_0         
	//* 166  309:getfield        #62  <Field ViewPortHandler mViewPortHandler>
	//* 167  312:invokevirtual   #110 <Method float ViewPortHandler.contentLeft()>
	//* 168  315:fcmpg           
	//* 169  316:ifge            250
				af[0] = mViewPortHandler.contentLeft() + f3 / 2.0F;
	//  170  319:aload           8
	//  171  321:iconst_0        
	//  172  322:aload_0         
	//  173  323:getfield        #62  <Field ViewPortHandler mViewPortHandler>
	//  174  326:invokevirtual   #110 <Method float ViewPortHandler.contentLeft()>
	//  175  329:fload           5
	//  176  331:fconst_2        
	//  177  332:fdiv            
	//  178  333:fadd            
	//  179  334:fastore         
		}
		if(true) goto _L6; else goto _L2
	//  180  335:goto            250
_L2:
		return;
	//  181  338:return          
		if(true) goto _L10; else goto _L9
_L9:
	}

	public void renderGridLines(Canvas canvas)
	{
		if(mXAxis.isDrawGridLinesEnabled() && mXAxis.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #20  <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #115 <Method boolean XAxis.isDrawGridLinesEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #20  <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #118 <Method boolean XAxis.isEnabled()>
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
	//   23   38:getfield        #121 <Field Paint mGridPaint>
	//   24   41:aload_0         
	//   25   42:getfield        #20  <Field XAxis mXAxis>
	//   26   45:invokevirtual   #124 <Method int XAxis.getGridColor()>
	//   27   48:invokevirtual   #130 <Method void Paint.setColor(int)>
			mGridPaint.setStrokeWidth(mXAxis.getGridLineWidth());
	//   28   51:aload_0         
	//   29   52:getfield        #121 <Field Paint mGridPaint>
	//   30   55:aload_0         
	//   31   56:getfield        #20  <Field XAxis mXAxis>
	//   32   59:invokevirtual   #133 <Method float XAxis.getGridLineWidth()>
	//   33   62:invokevirtual   #137 <Method void Paint.setStrokeWidth(float)>
			BarData bardata = (BarData)mChart.getData();
	//   34   65:aload_0         
	//   35   66:getfield        #13  <Field BarChart mChart>
	//   36   69:invokevirtual   #32  <Method com.github.mikephil.charting.data.ChartData BarChart.getData()>
	//   37   72:checkcast       #34  <Class BarData>
	//   38   75:astore          5
			int j = bardata.getDataSetCount();
	//   39   77:aload           5
	//   40   79:invokevirtual   #38  <Method int BarData.getDataSetCount()>
	//   41   82:istore_3        
			int i = mMinX;
	//   42   83:aload_0         
	//   43   84:getfield        #42  <Field int mMinX>
	//   44   87:istore_2        
			while(i < mMaxX) 
	//*  45   88:iload_2         
	//*  46   89:aload_0         
	//*  47   90:getfield        #45  <Field int mMaxX>
	//*  48   93:icmpge          20
			{
				af[0] = ((float)(i * j) + (float)i * bardata.getGroupSpace()) - 0.5F;
	//   49   96:aload           4
	//   50   98:iconst_0        
	//   51   99:iload_2         
	//   52  100:iload_3         
	//   53  101:imul            
	//   54  102:i2f             
	//   55  103:iload_2         
	//   56  104:i2f             
	//   57  105:aload           5
	//   58  107:invokevirtual   #48  <Method float BarData.getGroupSpace()>
	//   59  110:fmul            
	//   60  111:fadd            
	//   61  112:ldc1            #138 <Float 0.5F>
	//   62  114:fsub            
	//   63  115:fastore         
				mTrans.pointValuesToPixel(af);
	//   64  116:aload_0         
	//   65  117:getfield        #52  <Field Transformer mTrans>
	//   66  120:aload           4
	//   67  122:invokevirtual   #58  <Method void Transformer.pointValuesToPixel(float[])>
				if(mViewPortHandler.isInBoundsX(af[0]))
	//*  68  125:aload_0         
	//*  69  126:getfield        #62  <Field ViewPortHandler mViewPortHandler>
	//*  70  129:aload           4
	//*  71  131:iconst_0        
	//*  72  132:faload          
	//*  73  133:invokevirtual   #68  <Method boolean ViewPortHandler.isInBoundsX(float)>
	//*  74  136:ifeq            169
					canvas.drawLine(af[0], mViewPortHandler.offsetTop(), af[0], mViewPortHandler.contentBottom(), mGridPaint);
	//   75  139:aload_1         
	//   76  140:aload           4
	//   77  142:iconst_0        
	//   78  143:faload          
	//   79  144:aload_0         
	//   80  145:getfield        #62  <Field ViewPortHandler mViewPortHandler>
	//   81  148:invokevirtual   #141 <Method float ViewPortHandler.offsetTop()>
	//   82  151:aload           4
	//   83  153:iconst_0        
	//   84  154:faload          
	//   85  155:aload_0         
	//   86  156:getfield        #62  <Field ViewPortHandler mViewPortHandler>
	//   87  159:invokevirtual   #144 <Method float ViewPortHandler.contentBottom()>
	//   88  162:aload_0         
	//   89  163:getfield        #121 <Field Paint mGridPaint>
	//   90  166:invokevirtual   #150 <Method void Canvas.drawLine(float, float, float, float, Paint)>
				i += mXAxis.mAxisLabelModulus;
	//   91  169:iload_2         
	//   92  170:aload_0         
	//   93  171:getfield        #20  <Field XAxis mXAxis>
	//   94  174:getfield        #107 <Field int XAxis.mAxisLabelModulus>
	//   95  177:iadd            
	//   96  178:istore_2        
			}
		}
	//*  97  179:goto            88
	}

	protected BarChart mChart;
}
