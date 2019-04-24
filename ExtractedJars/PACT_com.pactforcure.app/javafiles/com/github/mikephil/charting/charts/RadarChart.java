// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import com.github.mikephil.charting.components.*;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.renderer.*;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.charts:
//			PieRadarChartBase

public class RadarChart extends PieRadarChartBase
{

	public RadarChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void PieRadarChartBase(Context)>
		mWebLineWidth = 2.5F;
	//    3    5:aload_0         
	//    4    6:ldc1            #28  <Float 2.5F>
	//    5    8:putfield        #30  <Field float mWebLineWidth>
		mInnerWebLineWidth = 1.5F;
	//    6   11:aload_0         
	//    7   12:ldc1            #31  <Float 1.5F>
	//    8   14:putfield        #33  <Field float mInnerWebLineWidth>
		mWebColor = Color.rgb(122, 122, 122);
	//    9   17:aload_0         
	//   10   18:bipush          122
	//   11   20:bipush          122
	//   12   22:bipush          122
	//   13   24:invokestatic    #39  <Method int Color.rgb(int, int, int)>
	//   14   27:putfield        #41  <Field int mWebColor>
		mWebColorInner = Color.rgb(122, 122, 122);
	//   15   30:aload_0         
	//   16   31:bipush          122
	//   17   33:bipush          122
	//   18   35:bipush          122
	//   19   37:invokestatic    #39  <Method int Color.rgb(int, int, int)>
	//   20   40:putfield        #43  <Field int mWebColorInner>
		mWebAlpha = 150;
	//   21   43:aload_0         
	//   22   44:sipush          150
	//   23   47:putfield        #45  <Field int mWebAlpha>
		mDrawWeb = true;
	//   24   50:aload_0         
	//   25   51:iconst_1        
	//   26   52:putfield        #47  <Field boolean mDrawWeb>
		mSkipWebLineCount = 0;
	//   27   55:aload_0         
	//   28   56:iconst_0        
	//   29   57:putfield        #49  <Field int mSkipWebLineCount>
	//   30   60:return          
	}

	public RadarChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #53  <Method void PieRadarChartBase(Context, AttributeSet)>
		mWebLineWidth = 2.5F;
	//    4    6:aload_0         
	//    5    7:ldc1            #28  <Float 2.5F>
	//    6    9:putfield        #30  <Field float mWebLineWidth>
		mInnerWebLineWidth = 1.5F;
	//    7   12:aload_0         
	//    8   13:ldc1            #31  <Float 1.5F>
	//    9   15:putfield        #33  <Field float mInnerWebLineWidth>
		mWebColor = Color.rgb(122, 122, 122);
	//   10   18:aload_0         
	//   11   19:bipush          122
	//   12   21:bipush          122
	//   13   23:bipush          122
	//   14   25:invokestatic    #39  <Method int Color.rgb(int, int, int)>
	//   15   28:putfield        #41  <Field int mWebColor>
		mWebColorInner = Color.rgb(122, 122, 122);
	//   16   31:aload_0         
	//   17   32:bipush          122
	//   18   34:bipush          122
	//   19   36:bipush          122
	//   20   38:invokestatic    #39  <Method int Color.rgb(int, int, int)>
	//   21   41:putfield        #43  <Field int mWebColorInner>
		mWebAlpha = 150;
	//   22   44:aload_0         
	//   23   45:sipush          150
	//   24   48:putfield        #45  <Field int mWebAlpha>
		mDrawWeb = true;
	//   25   51:aload_0         
	//   26   52:iconst_1        
	//   27   53:putfield        #47  <Field boolean mDrawWeb>
		mSkipWebLineCount = 0;
	//   28   56:aload_0         
	//   29   57:iconst_0        
	//   30   58:putfield        #49  <Field int mSkipWebLineCount>
	//   31   61:return          
	}

	public RadarChart(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #56  <Method void PieRadarChartBase(Context, AttributeSet, int)>
		mWebLineWidth = 2.5F;
	//    5    7:aload_0         
	//    6    8:ldc1            #28  <Float 2.5F>
	//    7   10:putfield        #30  <Field float mWebLineWidth>
		mInnerWebLineWidth = 1.5F;
	//    8   13:aload_0         
	//    9   14:ldc1            #31  <Float 1.5F>
	//   10   16:putfield        #33  <Field float mInnerWebLineWidth>
		mWebColor = Color.rgb(122, 122, 122);
	//   11   19:aload_0         
	//   12   20:bipush          122
	//   13   22:bipush          122
	//   14   24:bipush          122
	//   15   26:invokestatic    #39  <Method int Color.rgb(int, int, int)>
	//   16   29:putfield        #41  <Field int mWebColor>
		mWebColorInner = Color.rgb(122, 122, 122);
	//   17   32:aload_0         
	//   18   33:bipush          122
	//   19   35:bipush          122
	//   20   37:bipush          122
	//   21   39:invokestatic    #39  <Method int Color.rgb(int, int, int)>
	//   22   42:putfield        #43  <Field int mWebColorInner>
		mWebAlpha = 150;
	//   23   45:aload_0         
	//   24   46:sipush          150
	//   25   49:putfield        #45  <Field int mWebAlpha>
		mDrawWeb = true;
	//   26   52:aload_0         
	//   27   53:iconst_1        
	//   28   54:putfield        #47  <Field boolean mDrawWeb>
		mSkipWebLineCount = 0;
	//   29   57:aload_0         
	//   30   58:iconst_0        
	//   31   59:putfield        #49  <Field int mSkipWebLineCount>
	//   32   62:return          
	}

	protected void calcMinMax()
	{
		super.calcMinMax();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void PieRadarChartBase.calcMinMax()>
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		YAxis yaxis;
		if(!Float.isNaN(mYAxis.getAxisMinValue()))
	//*   2    4:aload_0         
	//*   3    5:getfield        #62  <Field YAxis mYAxis>
	//*   4    8:invokevirtual   #68  <Method float YAxis.getAxisMinValue()>
	//*   5   11:invokestatic    #74  <Method boolean Float.isNaN(float)>
	//*   6   14:ifne            253
			f1 = mYAxis.getAxisMinValue();
	//    7   17:aload_0         
	//    8   18:getfield        #62  <Field YAxis mYAxis>
	//    9   21:invokevirtual   #68  <Method float YAxis.getAxisMinValue()>
	//   10   24:fstore_2        
		else
	//*  11   25:aload_0         
	//*  12   26:getfield        #62  <Field YAxis mYAxis>
	//*  13   29:invokevirtual   #77  <Method float YAxis.getAxisMaxValue()>
	//*  14   32:invokestatic    #74  <Method boolean Float.isNaN(float)>
	//*  15   35:ifne            270
	//*  16   38:aload_0         
	//*  17   39:getfield        #62  <Field YAxis mYAxis>
	//*  18   42:invokevirtual   #77  <Method float YAxis.getAxisMaxValue()>
	//*  19   45:fstore_1        
	//*  20   46:aload_0         
	//*  21   47:aload_0         
	//*  22   48:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//*  23   51:checkcast       #83  <Class RadarData>
	//*  24   54:invokevirtual   #87  <Method List RadarData.getXVals()>
	//*  25   57:invokeinterface #93  <Method int List.size()>
	//*  26   62:iconst_1        
	//*  27   63:isub            
	//*  28   64:i2f             
	//*  29   65:putfield        #96  <Field float mXChartMax>
	//*  30   68:aload_0         
	//*  31   69:aload_0         
	//*  32   70:getfield        #96  <Field float mXChartMax>
	//*  33   73:aload_0         
	//*  34   74:getfield        #99  <Field float mXChartMin>
	//*  35   77:fsub            
	//*  36   78:invokestatic    #105 <Method float Math.abs(float)>
	//*  37   81:putfield        #108 <Field float mDeltaX>
	//*  38   84:fload_1         
	//*  39   85:fload_2         
	//*  40   86:fsub            
	//*  41   87:invokestatic    #105 <Method float Math.abs(float)>
	//*  42   90:fstore          5
	//*  43   92:fload           5
	//*  44   94:ldc1            #109 <Float 100F>
	//*  45   96:fdiv            
	//*  46   97:fstore_3        
	//*  47   98:aload_0         
	//*  48   99:getfield        #62  <Field YAxis mYAxis>
	//*  49  102:invokevirtual   #112 <Method float YAxis.getSpaceTop()>
	//*  50  105:fstore          4
	//*  51  107:fload           5
	//*  52  109:ldc1            #109 <Float 100F>
	//*  53  111:fdiv            
	//*  54  112:fstore          5
	//*  55  114:aload_0         
	//*  56  115:getfield        #62  <Field YAxis mYAxis>
	//*  57  118:invokevirtual   #115 <Method float YAxis.getSpaceBottom()>
	//*  58  121:fstore          6
	//*  59  123:aload_0         
	//*  60  124:aload_0         
	//*  61  125:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//*  62  128:checkcast       #83  <Class RadarData>
	//*  63  131:invokevirtual   #87  <Method List RadarData.getXVals()>
	//*  64  134:invokeinterface #93  <Method int List.size()>
	//*  65  139:iconst_1        
	//*  66  140:isub            
	//*  67  141:i2f             
	//*  68  142:putfield        #96  <Field float mXChartMax>
	//*  69  145:aload_0         
	//*  70  146:aload_0         
	//*  71  147:getfield        #96  <Field float mXChartMax>
	//*  72  150:aload_0         
	//*  73  151:getfield        #99  <Field float mXChartMin>
	//*  74  154:fsub            
	//*  75  155:invokestatic    #105 <Method float Math.abs(float)>
	//*  76  158:putfield        #108 <Field float mDeltaX>
	//*  77  161:aload_0         
	//*  78  162:getfield        #62  <Field YAxis mYAxis>
	//*  79  165:astore          7
	//*  80  167:aload_0         
	//*  81  168:getfield        #62  <Field YAxis mYAxis>
	//*  82  171:invokevirtual   #68  <Method float YAxis.getAxisMinValue()>
	//*  83  174:invokestatic    #74  <Method boolean Float.isNaN(float)>
	//*  84  177:ifne            287
	//*  85  180:aload_0         
	//*  86  181:getfield        #62  <Field YAxis mYAxis>
	//*  87  184:invokevirtual   #68  <Method float YAxis.getAxisMinValue()>
	//*  88  187:fstore_2        
	//*  89  188:aload           7
	//*  90  190:fload_2         
	//*  91  191:putfield        #118 <Field float YAxis.mAxisMinimum>
	//*  92  194:aload_0         
	//*  93  195:getfield        #62  <Field YAxis mYAxis>
	//*  94  198:astore          7
	//*  95  200:aload_0         
	//*  96  201:getfield        #62  <Field YAxis mYAxis>
	//*  97  204:invokevirtual   #77  <Method float YAxis.getAxisMaxValue()>
	//*  98  207:invokestatic    #74  <Method boolean Float.isNaN(float)>
	//*  99  210:ifne            298
	//* 100  213:aload_0         
	//* 101  214:getfield        #62  <Field YAxis mYAxis>
	//* 102  217:invokevirtual   #77  <Method float YAxis.getAxisMaxValue()>
	//* 103  220:fstore_1        
	//* 104  221:aload           7
	//* 105  223:fload_1         
	//* 106  224:putfield        #121 <Field float YAxis.mAxisMaximum>
	//* 107  227:aload_0         
	//* 108  228:getfield        #62  <Field YAxis mYAxis>
	//* 109  231:aload_0         
	//* 110  232:getfield        #62  <Field YAxis mYAxis>
	//* 111  235:getfield        #121 <Field float YAxis.mAxisMaximum>
	//* 112  238:aload_0         
	//* 113  239:getfield        #62  <Field YAxis mYAxis>
	//* 114  242:getfield        #118 <Field float YAxis.mAxisMinimum>
	//* 115  245:fsub            
	//* 116  246:invokestatic    #105 <Method float Math.abs(float)>
	//* 117  249:putfield        #124 <Field float YAxis.mAxisRange>
	//* 118  252:return          
			f1 = ((RadarData)mData).getYMin(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
	//  119  253:aload_0         
	//  120  254:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//  121  257:checkcast       #83  <Class RadarData>
	//  122  260:getstatic       #130 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//  123  263:invokevirtual   #134 <Method float RadarData.getYMin(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//  124  266:fstore_2        
		if(!Float.isNaN(mYAxis.getAxisMaxValue()))
			f = mYAxis.getAxisMaxValue();
		else
	//* 125  267:goto            25
			f = ((RadarData)mData).getYMax(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
	//  126  270:aload_0         
	//  127  271:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//  128  274:checkcast       #83  <Class RadarData>
	//  129  277:getstatic       #130 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//  130  280:invokevirtual   #137 <Method float RadarData.getYMax(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//  131  283:fstore_1        
		mXChartMax = ((RadarData)mData).getXVals().size() - 1;
		mDeltaX = Math.abs(mXChartMax - mXChartMin);
		f4 = Math.abs(f - f1);
		f2 = f4 / 100F;
		f3 = mYAxis.getSpaceTop();
		f4 /= 100F;
		f5 = mYAxis.getSpaceBottom();
		mXChartMax = ((RadarData)mData).getXVals().size() - 1;
		mDeltaX = Math.abs(mXChartMax - mXChartMin);
		yaxis = mYAxis;
		if(!Float.isNaN(mYAxis.getAxisMinValue()))
			f1 = mYAxis.getAxisMinValue();
		else
	//* 132  284:goto            46
			f1 -= f4 * f5;
	//  133  287:fload_2         
	//  134  288:fload           5
	//  135  290:fload           6
	//  136  292:fmul            
	//  137  293:fsub            
	//  138  294:fstore_2        
		yaxis.mAxisMinimum = f1;
		yaxis = mYAxis;
		if(!Float.isNaN(mYAxis.getAxisMaxValue()))
			f = mYAxis.getAxisMaxValue();
		else
	//* 139  295:goto            188
			f += f2 * f3;
	//  140  298:fload_1         
	//  141  299:fload_3         
	//  142  300:fload           4
	//  143  302:fmul            
	//  144  303:fadd            
	//  145  304:fstore_1        
		yaxis.mAxisMaximum = f;
		mYAxis.mAxisRange = Math.abs(mYAxis.mAxisMaximum - mYAxis.mAxisMinimum);
	//* 146  305:goto            221
	}

	public float getFactor()
	{
		RectF rectf = mViewPortHandler.getContentRect();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #148 <Method RectF ViewPortHandler.getContentRect()>
	//    3    7:astore_1        
		return Math.min(rectf.width() / 2.0F, rectf.height() / 2.0F) / mYAxis.mAxisRange;
	//    4    8:aload_1         
	//    5    9:invokevirtual   #153 <Method float RectF.width()>
	//    6   12:fconst_2        
	//    7   13:fdiv            
	//    8   14:aload_1         
	//    9   15:invokevirtual   #156 <Method float RectF.height()>
	//   10   18:fconst_2        
	//   11   19:fdiv            
	//   12   20:invokestatic    #160 <Method float Math.min(float, float)>
	//   13   23:aload_0         
	//   14   24:getfield        #62  <Field YAxis mYAxis>
	//   15   27:getfield        #124 <Field float YAxis.mAxisRange>
	//   16   30:fdiv            
	//   17   31:freturn         
	}

	public int getIndexForAngle(float f)
	{
		f = Utils.getNormalizedAngle(f - getRotationAngle());
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #165 <Method float getRotationAngle()>
	//    3    5:fsub            
	//    4    6:invokestatic    #170 <Method float Utils.getNormalizedAngle(float)>
	//    5    9:fstore_1        
		float f1 = getSliceAngle();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #173 <Method float getSliceAngle()>
	//    8   14:fstore_2        
		for(int i = 0; i < ((RadarData)mData).getXValCount(); i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:aload_0         
	//*  13   19:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//*  14   22:checkcast       #83  <Class RadarData>
	//*  15   25:invokevirtual   #176 <Method int RadarData.getXValCount()>
	//*  16   28:icmpge          55
			if((float)(i + 1) * f1 - f1 / 2.0F > f)
	//*  17   31:iload_3         
	//*  18   32:iconst_1        
	//*  19   33:iadd            
	//*  20   34:i2f             
	//*  21   35:fload_2         
	//*  22   36:fmul            
	//*  23   37:fload_2         
	//*  24   38:fconst_2        
	//*  25   39:fdiv            
	//*  26   40:fsub            
	//*  27   41:fload_1         
	//*  28   42:fcmpl           
	//*  29   43:ifle            48
				return i;
	//   30   46:iload_3         
	//   31   47:ireturn         

	//   32   48:iload_3         
	//   33   49:iconst_1        
	//   34   50:iadd            
	//   35   51:istore_3        
	//*  36   52:goto            17
		return 0;
	//   37   55:iconst_0        
	//   38   56:ireturn         
	}

	protected float[] getMarkerPosition(Entry entry, Highlight highlight)
	{
		float f = getSliceAngle() * (float)entry.getXIndex() + getRotationAngle();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method float getSliceAngle()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method int Entry.getXIndex()>
	//    4    8:i2f             
	//    5    9:fmul            
	//    6   10:aload_0         
	//    7   11:invokevirtual   #165 <Method float getRotationAngle()>
	//    8   14:fadd            
	//    9   15:fstore_3        
		float f1 = entry.getVal() * getFactor();
	//   10   16:aload_1         
	//   11   17:invokevirtual   #186 <Method float Entry.getVal()>
	//   12   20:aload_0         
	//   13   21:invokevirtual   #188 <Method float getFactor()>
	//   14   24:fmul            
	//   15   25:fstore          4
		entry = ((Entry) (getCenterOffsets()));
	//   16   27:aload_0         
	//   17   28:invokevirtual   #192 <Method PointF getCenterOffsets()>
	//   18   31:astore_1        
		entry = ((Entry) (new PointF((float)((double)((PointF) (entry)).x + (double)f1 * Math.cos(Math.toRadians(f))), (float)((double)((PointF) (entry)).y + (double)f1 * Math.sin(Math.toRadians(f))))));
	//   19   32:new             #194 <Class PointF>
	//   20   35:dup             
	//   21   36:aload_1         
	//   22   37:getfield        #197 <Field float PointF.x>
	//   23   40:f2d             
	//   24   41:fload           4
	//   25   43:f2d             
	//   26   44:fload_3         
	//   27   45:f2d             
	//   28   46:invokestatic    #201 <Method double Math.toRadians(double)>
	//   29   49:invokestatic    #204 <Method double Math.cos(double)>
	//   30   52:dmul            
	//   31   53:dadd            
	//   32   54:d2f             
	//   33   55:aload_1         
	//   34   56:getfield        #207 <Field float PointF.y>
	//   35   59:f2d             
	//   36   60:fload           4
	//   37   62:f2d             
	//   38   63:fload_3         
	//   39   64:f2d             
	//   40   65:invokestatic    #201 <Method double Math.toRadians(double)>
	//   41   68:invokestatic    #210 <Method double Math.sin(double)>
	//   42   71:dmul            
	//   43   72:dadd            
	//   44   73:d2f             
	//   45   74:invokespecial   #213 <Method void PointF(float, float)>
	//   46   77:astore_1        
		return (new float[] {
			((PointF) (entry)).x, ((PointF) (entry)).y
		});
	//   47   78:iconst_2        
	//   48   79:newarray        float[]
	//   49   81:dup             
	//   50   82:iconst_0        
	//   51   83:aload_1         
	//   52   84:getfield        #197 <Field float PointF.x>
	//   53   87:fastore         
	//   54   88:dup             
	//   55   89:iconst_1        
	//   56   90:aload_1         
	//   57   91:getfield        #207 <Field float PointF.y>
	//   58   94:fastore         
	//   59   95:areturn         
	}

	public float getRadius()
	{
		RectF rectf = mViewPortHandler.getContentRect();
	//    0    0:aload_0         
	//    1    1:getfield        #142 <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #148 <Method RectF ViewPortHandler.getContentRect()>
	//    3    7:astore_1        
		return Math.min(rectf.width() / 2.0F, rectf.height() / 2.0F);
	//    4    8:aload_1         
	//    5    9:invokevirtual   #153 <Method float RectF.width()>
	//    6   12:fconst_2        
	//    7   13:fdiv            
	//    8   14:aload_1         
	//    9   15:invokevirtual   #156 <Method float RectF.height()>
	//   10   18:fconst_2        
	//   11   19:fdiv            
	//   12   20:invokestatic    #160 <Method float Math.min(float, float)>
	//   13   23:freturn         
	}

	protected float getRequiredBaseOffset()
	{
		if(mXAxis.isEnabled() && mXAxis.isDrawLabelsEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #217 <Field XAxis mXAxis>
	//*   2    4:invokevirtual   #223 <Method boolean XAxis.isEnabled()>
	//*   3    7:ifeq            29
	//*   4   10:aload_0         
	//*   5   11:getfield        #217 <Field XAxis mXAxis>
	//*   6   14:invokevirtual   #226 <Method boolean XAxis.isDrawLabelsEnabled()>
	//*   7   17:ifeq            29
			return (float)mXAxis.mLabelRotatedWidth;
	//    8   20:aload_0         
	//    9   21:getfield        #217 <Field XAxis mXAxis>
	//   10   24:getfield        #229 <Field int XAxis.mLabelRotatedWidth>
	//   11   27:i2f             
	//   12   28:freturn         
		else
			return Utils.convertDpToPixel(10F);
	//   13   29:ldc1            #230 <Float 10F>
	//   14   31:invokestatic    #233 <Method float Utils.convertDpToPixel(float)>
	//   15   34:freturn         
	}

	protected float getRequiredLegendOffset()
	{
		return mLegendRenderer.getLabelPaint().getTextSize() * 4F;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field LegendRenderer mLegendRenderer>
	//    2    4:invokevirtual   #244 <Method Paint LegendRenderer.getLabelPaint()>
	//    3    7:invokevirtual   #249 <Method float Paint.getTextSize()>
	//    4   10:ldc1            #250 <Float 4F>
	//    5   12:fmul            
	//    6   13:freturn         
	}

	public int getSkipWebLineCount()
	{
		return mSkipWebLineCount;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int mSkipWebLineCount>
	//    2    4:ireturn         
	}

	public float getSliceAngle()
	{
		return 360F / (float)((RadarData)mData).getXValCount();
	//    0    0:ldc1            #252 <Float 360F>
	//    1    2:aload_0         
	//    2    3:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//    3    6:checkcast       #83  <Class RadarData>
	//    4    9:invokevirtual   #176 <Method int RadarData.getXValCount()>
	//    5   12:i2f             
	//    6   13:fdiv            
	//    7   14:freturn         
	}

	public int getWebAlpha()
	{
		return mWebAlpha;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field int mWebAlpha>
	//    2    4:ireturn         
	}

	public int getWebColor()
	{
		return mWebColor;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int mWebColor>
	//    2    4:ireturn         
	}

	public int getWebColorInner()
	{
		return mWebColorInner;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field int mWebColorInner>
	//    2    4:ireturn         
	}

	public float getWebLineWidth()
	{
		return mWebLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float mWebLineWidth>
	//    2    4:freturn         
	}

	public float getWebLineWidthInner()
	{
		return mInnerWebLineWidth;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field float mInnerWebLineWidth>
	//    2    4:freturn         
	}

	public XAxis getXAxis()
	{
		return mXAxis;
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field XAxis mXAxis>
	//    2    4:areturn         
	}

	public YAxis getYAxis()
	{
		return mYAxis;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field YAxis mYAxis>
	//    2    4:areturn         
	}

	public float getYChartMax()
	{
		return mYAxis.mAxisMaximum;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field YAxis mYAxis>
	//    2    4:getfield        #121 <Field float YAxis.mAxisMaximum>
	//    3    7:freturn         
	}

	public float getYChartMin()
	{
		return mYAxis.mAxisMinimum;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field YAxis mYAxis>
	//    2    4:getfield        #118 <Field float YAxis.mAxisMinimum>
	//    3    7:freturn         
	}

	public float getYRange()
	{
		return mYAxis.mAxisRange;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field YAxis mYAxis>
	//    2    4:getfield        #124 <Field float YAxis.mAxisRange>
	//    3    7:freturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #267 <Method void PieRadarChartBase.init()>
		mYAxis = new YAxis(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT);
	//    2    4:aload_0         
	//    3    5:new             #64  <Class YAxis>
	//    4    8:dup             
	//    5    9:getstatic       #130 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//    6   12:invokespecial   #270 <Method void YAxis(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    7   15:putfield        #62  <Field YAxis mYAxis>
		mXAxis = new XAxis();
	//    8   18:aload_0         
	//    9   19:new             #219 <Class XAxis>
	//   10   22:dup             
	//   11   23:invokespecial   #272 <Method void XAxis()>
	//   12   26:putfield        #217 <Field XAxis mXAxis>
		mXAxis.setSpaceBetweenLabels(0);
	//   13   29:aload_0         
	//   14   30:getfield        #217 <Field XAxis mXAxis>
	//   15   33:iconst_0        
	//   16   34:invokevirtual   #276 <Method void XAxis.setSpaceBetweenLabels(int)>
		mWebLineWidth = Utils.convertDpToPixel(1.5F);
	//   17   37:aload_0         
	//   18   38:ldc1            #31  <Float 1.5F>
	//   19   40:invokestatic    #233 <Method float Utils.convertDpToPixel(float)>
	//   20   43:putfield        #30  <Field float mWebLineWidth>
		mInnerWebLineWidth = Utils.convertDpToPixel(0.75F);
	//   21   46:aload_0         
	//   22   47:ldc2            #277 <Float 0.75F>
	//   23   50:invokestatic    #233 <Method float Utils.convertDpToPixel(float)>
	//   24   53:putfield        #33  <Field float mInnerWebLineWidth>
		mRenderer = ((DataRenderer) (new RadarChartRenderer(this, mAnimator, mViewPortHandler)));
	//   25   56:aload_0         
	//   26   57:new             #279 <Class RadarChartRenderer>
	//   27   60:dup             
	//   28   61:aload_0         
	//   29   62:aload_0         
	//   30   63:getfield        #283 <Field com.github.mikephil.charting.animation.ChartAnimator mAnimator>
	//   31   66:aload_0         
	//   32   67:getfield        #142 <Field ViewPortHandler mViewPortHandler>
	//   33   70:invokespecial   #286 <Method void RadarChartRenderer(RadarChart, com.github.mikephil.charting.animation.ChartAnimator, ViewPortHandler)>
	//   34   73:putfield        #290 <Field DataRenderer mRenderer>
		mYAxisRenderer = new YAxisRendererRadarChart(mViewPortHandler, mYAxis, this);
	//   35   76:aload_0         
	//   36   77:new             #292 <Class YAxisRendererRadarChart>
	//   37   80:dup             
	//   38   81:aload_0         
	//   39   82:getfield        #142 <Field ViewPortHandler mViewPortHandler>
	//   40   85:aload_0         
	//   41   86:getfield        #62  <Field YAxis mYAxis>
	//   42   89:aload_0         
	//   43   90:invokespecial   #295 <Method void YAxisRendererRadarChart(ViewPortHandler, YAxis, RadarChart)>
	//   44   93:putfield        #297 <Field YAxisRendererRadarChart mYAxisRenderer>
		mXAxisRenderer = new XAxisRendererRadarChart(mViewPortHandler, mXAxis, this);
	//   45   96:aload_0         
	//   46   97:new             #299 <Class XAxisRendererRadarChart>
	//   47  100:dup             
	//   48  101:aload_0         
	//   49  102:getfield        #142 <Field ViewPortHandler mViewPortHandler>
	//   50  105:aload_0         
	//   51  106:getfield        #217 <Field XAxis mXAxis>
	//   52  109:aload_0         
	//   53  110:invokespecial   #302 <Method void XAxisRendererRadarChart(ViewPortHandler, XAxis, RadarChart)>
	//   54  113:putfield        #304 <Field XAxisRendererRadarChart mXAxisRenderer>
	//   55  116:return          
	}

	public void notifyDataSetChanged()
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		calcMinMax();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #306 <Method void calcMinMax()>
		mYAxisRenderer.computeAxis(mYAxis.mAxisMinimum, mYAxis.mAxisMaximum);
	//    6   12:aload_0         
	//    7   13:getfield        #297 <Field YAxisRendererRadarChart mYAxisRenderer>
	//    8   16:aload_0         
	//    9   17:getfield        #62  <Field YAxis mYAxis>
	//   10   20:getfield        #118 <Field float YAxis.mAxisMinimum>
	//   11   23:aload_0         
	//   12   24:getfield        #62  <Field YAxis mYAxis>
	//   13   27:getfield        #121 <Field float YAxis.mAxisMaximum>
	//   14   30:invokevirtual   #309 <Method void YAxisRendererRadarChart.computeAxis(float, float)>
		mXAxisRenderer.computeAxis(((RadarData)mData).getXValMaximumLength(), ((RadarData)mData).getXVals());
	//   15   33:aload_0         
	//   16   34:getfield        #304 <Field XAxisRendererRadarChart mXAxisRenderer>
	//   17   37:aload_0         
	//   18   38:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//   19   41:checkcast       #83  <Class RadarData>
	//   20   44:invokevirtual   #312 <Method float RadarData.getXValMaximumLength()>
	//   21   47:aload_0         
	//   22   48:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//   23   51:checkcast       #83  <Class RadarData>
	//   24   54:invokevirtual   #87  <Method List RadarData.getXVals()>
	//   25   57:invokevirtual   #315 <Method void XAxisRendererRadarChart.computeAxis(float, List)>
		if(mLegend != null && !mLegend.isLegendCustom())
	//*  26   60:aload_0         
	//*  27   61:getfield        #319 <Field Legend mLegend>
	//*  28   64:ifnull          88
	//*  29   67:aload_0         
	//*  30   68:getfield        #319 <Field Legend mLegend>
	//*  31   71:invokevirtual   #324 <Method boolean Legend.isLegendCustom()>
	//*  32   74:ifne            88
			mLegendRenderer.computeLegend(mData);
	//   33   77:aload_0         
	//   34   78:getfield        #238 <Field LegendRenderer mLegendRenderer>
	//   35   81:aload_0         
	//   36   82:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//   37   85:invokevirtual   #328 <Method void LegendRenderer.computeLegend(com.github.mikephil.charting.data.ChartData)>
		calculateOffsets();
	//   38   88:aload_0         
	//   39   89:invokevirtual   #331 <Method void calculateOffsets()>
	//   40   92:return          
	}

	protected void onDraw(Canvas canvas)
	{
		super.onDraw(canvas);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #335 <Method void PieRadarChartBase.onDraw(Canvas)>
		if(mData == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #81  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   5    9:ifnonnull       13
			return;
	//    6   12:return          
		mXAxisRenderer.renderAxisLabels(canvas);
	//    7   13:aload_0         
	//    8   14:getfield        #304 <Field XAxisRendererRadarChart mXAxisRenderer>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #338 <Method void XAxisRendererRadarChart.renderAxisLabels(Canvas)>
		if(mDrawWeb)
	//*  11   21:aload_0         
	//*  12   22:getfield        #47  <Field boolean mDrawWeb>
	//*  13   25:ifeq            36
			mRenderer.drawExtras(canvas);
	//   14   28:aload_0         
	//   15   29:getfield        #290 <Field DataRenderer mRenderer>
	//   16   32:aload_1         
	//   17   33:invokevirtual   #343 <Method void DataRenderer.drawExtras(Canvas)>
		mYAxisRenderer.renderLimitLines(canvas);
	//   18   36:aload_0         
	//   19   37:getfield        #297 <Field YAxisRendererRadarChart mYAxisRenderer>
	//   20   40:aload_1         
	//   21   41:invokevirtual   #346 <Method void YAxisRendererRadarChart.renderLimitLines(Canvas)>
		mRenderer.drawData(canvas);
	//   22   44:aload_0         
	//   23   45:getfield        #290 <Field DataRenderer mRenderer>
	//   24   48:aload_1         
	//   25   49:invokevirtual   #349 <Method void DataRenderer.drawData(Canvas)>
		if(valuesToHighlight())
	//*  26   52:aload_0         
	//*  27   53:invokevirtual   #352 <Method boolean valuesToHighlight()>
	//*  28   56:ifeq            71
			mRenderer.drawHighlighted(canvas, mIndicesToHighlight);
	//   29   59:aload_0         
	//   30   60:getfield        #290 <Field DataRenderer mRenderer>
	//   31   63:aload_1         
	//   32   64:aload_0         
	//   33   65:getfield        #356 <Field Highlight[] mIndicesToHighlight>
	//   34   68:invokevirtual   #360 <Method void DataRenderer.drawHighlighted(Canvas, Highlight[])>
		mYAxisRenderer.renderAxisLabels(canvas);
	//   35   71:aload_0         
	//   36   72:getfield        #297 <Field YAxisRendererRadarChart mYAxisRenderer>
	//   37   75:aload_1         
	//   38   76:invokevirtual   #361 <Method void YAxisRendererRadarChart.renderAxisLabels(Canvas)>
		mRenderer.drawValues(canvas);
	//   39   79:aload_0         
	//   40   80:getfield        #290 <Field DataRenderer mRenderer>
	//   41   83:aload_1         
	//   42   84:invokevirtual   #364 <Method void DataRenderer.drawValues(Canvas)>
		mLegendRenderer.renderLegend(canvas);
	//   43   87:aload_0         
	//   44   88:getfield        #238 <Field LegendRenderer mLegendRenderer>
	//   45   91:aload_1         
	//   46   92:invokevirtual   #367 <Method void LegendRenderer.renderLegend(Canvas)>
		drawDescription(canvas);
	//   47   95:aload_0         
	//   48   96:aload_1         
	//   49   97:invokevirtual   #370 <Method void drawDescription(Canvas)>
		drawMarkers(canvas);
	//   50  100:aload_0         
	//   51  101:aload_1         
	//   52  102:invokevirtual   #373 <Method void drawMarkers(Canvas)>
	//   53  105:return          
	}

	public void setDrawWeb(boolean flag)
	{
		mDrawWeb = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #47  <Field boolean mDrawWeb>
	//    3    5:return          
	}

	public void setSkipWebLineCount(int i)
	{
		mSkipWebLineCount = Math.max(0, i);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:iload_1         
	//    3    3:invokestatic    #380 <Method int Math.max(int, int)>
	//    4    6:putfield        #49  <Field int mSkipWebLineCount>
	//    5    9:return          
	}

	public void setWebAlpha(int i)
	{
		mWebAlpha = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int mWebAlpha>
	//    3    5:return          
	}

	public void setWebColor(int i)
	{
		mWebColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #41  <Field int mWebColor>
	//    3    5:return          
	}

	public void setWebColorInner(int i)
	{
		mWebColorInner = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #43  <Field int mWebColorInner>
	//    3    5:return          
	}

	public void setWebLineWidth(float f)
	{
		mWebLineWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #233 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #30  <Field float mWebLineWidth>
	//    4    8:return          
	}

	public void setWebLineWidthInner(float f)
	{
		mInnerWebLineWidth = Utils.convertDpToPixel(f);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokestatic    #233 <Method float Utils.convertDpToPixel(float)>
	//    3    5:putfield        #33  <Field float mInnerWebLineWidth>
	//    4    8:return          
	}

	private boolean mDrawWeb;
	private float mInnerWebLineWidth;
	private int mSkipWebLineCount;
	private int mWebAlpha;
	private int mWebColor;
	private int mWebColorInner;
	private float mWebLineWidth;
	private XAxis mXAxis;
	protected XAxisRendererRadarChart mXAxisRenderer;
	private YAxis mYAxis;
	protected YAxisRendererRadarChart mYAxisRenderer;
}
