// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.content.Context;
import android.graphics.*;
import android.util.AttributeSet;
import android.util.Log;
import com.github.mikephil.charting.components.*;
import com.github.mikephil.charting.data.*;
import com.github.mikephil.charting.highlight.*;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.renderer.*;
import com.github.mikephil.charting.utils.*;

// Referenced classes of package com.github.mikephil.charting.charts:
//			BarChart

public class HorizontalBarChart extends BarChart
{

	public HorizontalBarChart(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void BarChart(Context)>
	//    3    5:return          
	}

	public HorizontalBarChart(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #12  <Method void BarChart(Context, AttributeSet)>
	//    4    6:return          
	}

	public HorizontalBarChart(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #15  <Method void BarChart(Context, AttributeSet, int)>
	//    5    7:return          
	}

	protected void calcModulus()
	{
		float af[] = new float[9];
	//    0    0:bipush          9
	//    1    2:newarray        float[]
	//    2    4:astore_1        
		mViewPortHandler.getMatrixTouch().getValues(af);
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//    5    9:invokevirtual   #27  <Method Matrix ViewPortHandler.getMatrixTouch()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #33  <Method void Matrix.getValues(float[])>
		mXAxis.mAxisLabelModulus = (int)Math.ceil((float)(((BarData)mData).getXValCount() * mXAxis.mLabelRotatedHeight) / (mViewPortHandler.contentHeight() * af[4]));
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field XAxis mXAxis>
	//   10   20:aload_0         
	//   11   21:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//   12   24:checkcast       #43  <Class BarData>
	//   13   27:invokevirtual   #47  <Method int BarData.getXValCount()>
	//   14   30:aload_0         
	//   15   31:getfield        #37  <Field XAxis mXAxis>
	//   16   34:getfield        #53  <Field int XAxis.mLabelRotatedHeight>
	//   17   37:imul            
	//   18   38:i2f             
	//   19   39:aload_0         
	//   20   40:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//   21   43:invokevirtual   #57  <Method float ViewPortHandler.contentHeight()>
	//   22   46:aload_1         
	//   23   47:iconst_4        
	//   24   48:faload          
	//   25   49:fmul            
	//   26   50:fdiv            
	//   27   51:f2d             
	//   28   52:invokestatic    #63  <Method double Math.ceil(double)>
	//   29   55:d2i             
	//   30   56:putfield        #66  <Field int XAxis.mAxisLabelModulus>
		if(mXAxis.mAxisLabelModulus < 1)
	//*  31   59:aload_0         
	//*  32   60:getfield        #37  <Field XAxis mXAxis>
	//*  33   63:getfield        #66  <Field int XAxis.mAxisLabelModulus>
	//*  34   66:iconst_1        
	//*  35   67:icmpge          78
			mXAxis.mAxisLabelModulus = 1;
	//   36   70:aload_0         
	//   37   71:getfield        #37  <Field XAxis mXAxis>
	//   38   74:iconst_1        
	//   39   75:putfield        #66  <Field int XAxis.mAxisLabelModulus>
	//   40   78:return          
	}

	public void calculateOffsets()
	{
		float f;
		float f1;
		float f2;
		float f3;
		float f4;
		float f5;
		float f6;
		float f7;
		f4 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          5
		f5 = 0.0F;
	//    2    3:fconst_0        
	//    3    4:fstore          6
		f6 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore          7
		f7 = 0.0F;
	//    6    9:fconst_0        
	//    7   10:fstore          8
		f2 = f7;
	//    8   12:fload           8
	//    9   14:fstore_3        
		f1 = f4;
	//   10   15:fload           5
	//   11   17:fstore_2        
		f = f5;
	//   12   18:fload           6
	//   13   20:fstore_1        
		f3 = f6;
	//   14   21:fload           7
	//   15   23:fstore          4
		if(mLegend != null)
	//*  16   25:aload_0         
	//*  17   26:getfield        #71  <Field Legend mLegend>
	//*  18   29:ifnull          129
		{
			f2 = f7;
	//   19   32:fload           8
	//   20   34:fstore_3        
			f1 = f4;
	//   21   35:fload           5
	//   22   37:fstore_2        
			f = f5;
	//   23   38:fload           6
	//   24   40:fstore_1        
			f3 = f6;
	//   25   41:fload           7
	//   26   43:fstore          4
			if(mLegend.isEnabled())
	//*  27   45:aload_0         
	//*  28   46:getfield        #71  <Field Legend mLegend>
	//*  29   49:invokevirtual   #77  <Method boolean Legend.isEnabled()>
	//*  30   52:ifeq            129
				if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART || mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER)
	//*  31   55:aload_0         
	//*  32   56:getfield        #71  <Field Legend mLegend>
	//*  33   59:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//*  34   62:getstatic       #87  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART>
	//*  35   65:if_acmpeq       81
	//*  36   68:aload_0         
	//*  37   69:getfield        #71  <Field Legend mLegend>
	//*  38   72:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//*  39   75:getstatic       #90  <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_CENTER>
	//*  40   78:if_acmpne       415
				{
					f = 0.0F + (Math.min(mLegend.mNeededWidth, mViewPortHandler.getChartWidth() * mLegend.getMaxSizePercent()) + mLegend.getXOffset() * 2.0F);
	//   41   81:fconst_0        
	//   42   82:aload_0         
	//   43   83:getfield        #71  <Field Legend mLegend>
	//   44   86:getfield        #94  <Field float Legend.mNeededWidth>
	//   45   89:aload_0         
	//   46   90:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//   47   93:invokevirtual   #97  <Method float ViewPortHandler.getChartWidth()>
	//   48   96:aload_0         
	//   49   97:getfield        #71  <Field Legend mLegend>
	//   50  100:invokevirtual   #100 <Method float Legend.getMaxSizePercent()>
	//   51  103:fmul            
	//   52  104:invokestatic    #104 <Method float Math.min(float, float)>
	//   53  107:aload_0         
	//   54  108:getfield        #71  <Field Legend mLegend>
	//   55  111:invokevirtual   #107 <Method float Legend.getXOffset()>
	//   56  114:fconst_2        
	//   57  115:fmul            
	//   58  116:fadd            
	//   59  117:fadd            
	//   60  118:fstore_1        
					f3 = f6;
	//   61  119:fload           7
	//   62  121:fstore          4
					f1 = f4;
	//   63  123:fload           5
	//   64  125:fstore_2        
					f2 = f7;
	//   65  126:fload           8
	//   66  128:fstore_3        
				} else
	//*  67  129:fload           4
	//*  68  131:fstore          5
	//*  69  133:aload_0         
	//*  70  134:getfield        #111 <Field YAxis mAxisLeft>
	//*  71  137:invokevirtual   #116 <Method boolean YAxis.needsOffset()>
	//*  72  140:ifeq            162
	//*  73  143:fload           4
	//*  74  145:aload_0         
	//*  75  146:getfield        #111 <Field YAxis mAxisLeft>
	//*  76  149:aload_0         
	//*  77  150:getfield        #120 <Field YAxisRenderer mAxisRendererLeft>
	//*  78  153:invokevirtual   #126 <Method android.graphics.Paint YAxisRenderer.getPaintAxisLabels()>
	//*  79  156:invokevirtual   #130 <Method float YAxis.getRequiredHeightSpace(android.graphics.Paint)>
	//*  80  159:fadd            
	//*  81  160:fstore          5
	//*  82  162:fload_3         
	//*  83  163:fstore          6
	//*  84  165:aload_0         
	//*  85  166:getfield        #133 <Field YAxis mAxisRight>
	//*  86  169:invokevirtual   #116 <Method boolean YAxis.needsOffset()>
	//*  87  172:ifeq            193
	//*  88  175:fload_3         
	//*  89  176:aload_0         
	//*  90  177:getfield        #133 <Field YAxis mAxisRight>
	//*  91  180:aload_0         
	//*  92  181:getfield        #136 <Field YAxisRenderer mAxisRendererRight>
	//*  93  184:invokevirtual   #126 <Method android.graphics.Paint YAxisRenderer.getPaintAxisLabels()>
	//*  94  187:invokevirtual   #130 <Method float YAxis.getRequiredHeightSpace(android.graphics.Paint)>
	//*  95  190:fadd            
	//*  96  191:fstore          6
	//*  97  193:aload_0         
	//*  98  194:getfield        #37  <Field XAxis mXAxis>
	//*  99  197:getfield        #139 <Field int XAxis.mLabelRotatedWidth>
	//* 100  200:i2f             
	//* 101  201:fstore          7
	//* 102  203:fload_2         
	//* 103  204:fstore_3        
	//* 104  205:fload_1         
	//* 105  206:fstore          4
	//* 106  208:aload_0         
	//* 107  209:getfield        #37  <Field XAxis mXAxis>
	//* 108  212:invokevirtual   #140 <Method boolean XAxis.isEnabled()>
	//* 109  215:ifeq            239
	//* 110  218:aload_0         
	//* 111  219:getfield        #37  <Field XAxis mXAxis>
	//* 112  222:invokevirtual   #143 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//* 113  225:getstatic       #149 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTTOM>
	//* 114  228:if_acmpne       687
	//* 115  231:fload_2         
	//* 116  232:fload           7
	//* 117  234:fadd            
	//* 118  235:fstore_3        
	//* 119  236:fload_1         
	//* 120  237:fstore          4
	//* 121  239:fload           5
	//* 122  241:aload_0         
	//* 123  242:invokevirtual   #152 <Method float getExtraTopOffset()>
	//* 124  245:fadd            
	//* 125  246:fstore_1        
	//* 126  247:fload           4
	//* 127  249:aload_0         
	//* 128  250:invokevirtual   #155 <Method float getExtraRightOffset()>
	//* 129  253:fadd            
	//* 130  254:fstore_2        
	//* 131  255:fload           6
	//* 132  257:aload_0         
	//* 133  258:invokevirtual   #158 <Method float getExtraBottomOffset()>
	//* 134  261:fadd            
	//* 135  262:fstore          4
	//* 136  264:fload_3         
	//* 137  265:aload_0         
	//* 138  266:invokevirtual   #161 <Method float getExtraLeftOffset()>
	//* 139  269:fadd            
	//* 140  270:fstore_3        
	//* 141  271:aload_0         
	//* 142  272:getfield        #164 <Field float mMinOffset>
	//* 143  275:invokestatic    #170 <Method float Utils.convertDpToPixel(float)>
	//* 144  278:fstore          5
	//* 145  280:aload_0         
	//* 146  281:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//* 147  284:fload           5
	//* 148  286:fload_3         
	//* 149  287:invokestatic    #173 <Method float Math.max(float, float)>
	//* 150  290:fload           5
	//* 151  292:fload_1         
	//* 152  293:invokestatic    #173 <Method float Math.max(float, float)>
	//* 153  296:fload           5
	//* 154  298:fload_2         
	//* 155  299:invokestatic    #173 <Method float Math.max(float, float)>
	//* 156  302:fload           5
	//* 157  304:fload           4
	//* 158  306:invokestatic    #173 <Method float Math.max(float, float)>
	//* 159  309:invokevirtual   #177 <Method void ViewPortHandler.restrainViewPort(float, float, float, float)>
	//* 160  312:aload_0         
	//* 161  313:getfield        #181 <Field boolean mLogEnabled>
	//* 162  316:ifeq            406
	//* 163  319:ldc1            #183 <String "MPAndroidChart">
	//* 164  321:new             #185 <Class StringBuilder>
	//* 165  324:dup             
	//* 166  325:invokespecial   #187 <Method void StringBuilder()>
	//* 167  328:ldc1            #189 <String "offsetLeft: ">
	//* 168  330:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//* 169  333:fload_3         
	//* 170  334:invokevirtual   #196 <Method StringBuilder StringBuilder.append(float)>
	//* 171  337:ldc1            #198 <String ", offsetTop: ">
	//* 172  339:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//* 173  342:fload_1         
	//* 174  343:invokevirtual   #196 <Method StringBuilder StringBuilder.append(float)>
	//* 175  346:ldc1            #200 <String ", offsetRight: ">
	//* 176  348:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//* 177  351:fload_2         
	//* 178  352:invokevirtual   #196 <Method StringBuilder StringBuilder.append(float)>
	//* 179  355:ldc1            #202 <String ", offsetBottom: ">
	//* 180  357:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//* 181  360:fload           4
	//* 182  362:invokevirtual   #196 <Method StringBuilder StringBuilder.append(float)>
	//* 183  365:invokevirtual   #206 <Method String StringBuilder.toString()>
	//* 184  368:invokestatic    #212 <Method int Log.i(String, String)>
	//* 185  371:pop             
	//* 186  372:ldc1            #183 <String "MPAndroidChart">
	//* 187  374:new             #185 <Class StringBuilder>
	//* 188  377:dup             
	//* 189  378:invokespecial   #187 <Method void StringBuilder()>
	//* 190  381:ldc1            #214 <String "Content: ">
	//* 191  383:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//* 192  386:aload_0         
	//* 193  387:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//* 194  390:invokevirtual   #218 <Method RectF ViewPortHandler.getContentRect()>
	//* 195  393:invokevirtual   #221 <Method String RectF.toString()>
	//* 196  396:invokevirtual   #193 <Method StringBuilder StringBuilder.append(String)>
	//* 197  399:invokevirtual   #206 <Method String StringBuilder.toString()>
	//* 198  402:invokestatic    #212 <Method int Log.i(String, String)>
	//* 199  405:pop             
	//* 200  406:aload_0         
	//* 201  407:invokevirtual   #224 <Method void prepareOffsetMatrix()>
	//* 202  410:aload_0         
	//* 203  411:invokevirtual   #227 <Method void prepareValuePxMatrix()>
	//* 204  414:return          
				if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART || mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER)
	//* 205  415:aload_0         
	//* 206  416:getfield        #71  <Field Legend mLegend>
	//* 207  419:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 208  422:getstatic       #230 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART>
	//* 209  425:if_acmpeq       441
	//* 210  428:aload_0         
	//* 211  429:getfield        #71  <Field Legend mLegend>
	//* 212  432:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 213  435:getstatic       #233 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART_CENTER>
	//* 214  438:if_acmpne       492
				{
					f1 = 0.0F + (Math.min(mLegend.mNeededWidth, mViewPortHandler.getChartWidth() * mLegend.getMaxSizePercent()) + mLegend.getXOffset() * 2.0F);
	//  215  441:fconst_0        
	//  216  442:aload_0         
	//  217  443:getfield        #71  <Field Legend mLegend>
	//  218  446:getfield        #94  <Field float Legend.mNeededWidth>
	//  219  449:aload_0         
	//  220  450:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//  221  453:invokevirtual   #97  <Method float ViewPortHandler.getChartWidth()>
	//  222  456:aload_0         
	//  223  457:getfield        #71  <Field Legend mLegend>
	//  224  460:invokevirtual   #100 <Method float Legend.getMaxSizePercent()>
	//  225  463:fmul            
	//  226  464:invokestatic    #104 <Method float Math.min(float, float)>
	//  227  467:aload_0         
	//  228  468:getfield        #71  <Field Legend mLegend>
	//  229  471:invokevirtual   #107 <Method float Legend.getXOffset()>
	//  230  474:fconst_2        
	//  231  475:fmul            
	//  232  476:fadd            
	//  233  477:fadd            
	//  234  478:fstore_2        
					f2 = f7;
	//  235  479:fload           8
	//  236  481:fstore_3        
					f = f5;
	//  237  482:fload           6
	//  238  484:fstore_1        
					f3 = f6;
	//  239  485:fload           7
	//  240  487:fstore          4
				} else
	//* 241  489:goto            129
				{
label0:
					{
						if(mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT && mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT && mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_CENTER)
							break label0;
	//  242  492:aload_0         
	//  243  493:getfield        #71  <Field Legend mLegend>
	//  244  496:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//  245  499:getstatic       #236 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_LEFT>
	//  246  502:if_acmpeq       531
	//  247  505:aload_0         
	//  248  506:getfield        #71  <Field Legend mLegend>
	//  249  509:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//  250  512:getstatic       #239 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_RIGHT>
	//  251  515:if_acmpeq       531
	//  252  518:aload_0         
	//  253  519:getfield        #71  <Field Legend mLegend>
	//  254  522:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//  255  525:getstatic       #242 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_CENTER>
	//  256  528:if_acmpne       582
						f = mLegend.mTextHeightMax;
	//  257  531:aload_0         
	//  258  532:getfield        #71  <Field Legend mLegend>
	//  259  535:getfield        #245 <Field float Legend.mTextHeightMax>
	//  260  538:fstore_1        
						f2 = 0.0F + Math.min(mLegend.mNeededHeight + f, mViewPortHandler.getChartHeight() * mLegend.getMaxSizePercent());
	//  261  539:fconst_0        
	//  262  540:aload_0         
	//  263  541:getfield        #71  <Field Legend mLegend>
	//  264  544:getfield        #248 <Field float Legend.mNeededHeight>
	//  265  547:fload_1         
	//  266  548:fadd            
	//  267  549:aload_0         
	//  268  550:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//  269  553:invokevirtual   #251 <Method float ViewPortHandler.getChartHeight()>
	//  270  556:aload_0         
	//  271  557:getfield        #71  <Field Legend mLegend>
	//  272  560:invokevirtual   #100 <Method float Legend.getMaxSizePercent()>
	//  273  563:fmul            
	//  274  564:invokestatic    #104 <Method float Math.min(float, float)>
	//  275  567:fadd            
	//  276  568:fstore_3        
						f1 = f4;
	//  277  569:fload           5
	//  278  571:fstore_2        
						f = f5;
	//  279  572:fload           6
	//  280  574:fstore_1        
						f3 = f6;
	//  281  575:fload           7
	//  282  577:fstore          4
					}
				}
		}
_L3:
		f4 = f3;
		if(mAxisLeft.needsOffset())
			f4 = f3 + mAxisLeft.getRequiredHeightSpace(mAxisRendererLeft.getPaintAxisLabels());
		f5 = f2;
		if(mAxisRight.needsOffset())
			f5 = f2 + mAxisRight.getRequiredHeightSpace(mAxisRendererRight.getPaintAxisLabels());
		f6 = mXAxis.mLabelRotatedWidth;
		f2 = f1;
		f3 = f;
		if(mXAxis.isEnabled())
			if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTTOM)
			{
				f2 = f1 + f6;
				f3 = f;
			} else
	//* 283  579:goto            129
	//* 284  582:aload_0         
	//* 285  583:getfield        #71  <Field Legend mLegend>
	//* 286  586:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 287  589:getstatic       #254 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_LEFT>
	//* 288  592:if_acmpeq       634
	//* 289  595:aload_0         
	//* 290  596:getfield        #71  <Field Legend mLegend>
	//* 291  599:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 292  602:getstatic       #257 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_RIGHT>
	//* 293  605:if_acmpeq       634
	//* 294  608:fload           8
	//* 295  610:fstore_3        
	//* 296  611:fload           5
	//* 297  613:fstore_2        
	//* 298  614:fload           6
	//* 299  616:fstore_1        
	//* 300  617:fload           7
	//* 301  619:fstore          4
	//* 302  621:aload_0         
	//* 303  622:getfield        #71  <Field Legend mLegend>
	//* 304  625:invokevirtual   #81  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 305  628:getstatic       #260 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_CENTER>
	//* 306  631:if_acmpne       129
	//* 307  634:aload_0         
	//* 308  635:getfield        #71  <Field Legend mLegend>
	//* 309  638:getfield        #245 <Field float Legend.mTextHeightMax>
	//* 310  641:fstore_1        
	//* 311  642:fconst_0        
	//* 312  643:aload_0         
	//* 313  644:getfield        #71  <Field Legend mLegend>
	//* 314  647:getfield        #248 <Field float Legend.mNeededHeight>
	//* 315  650:fload_1         
	//* 316  651:fconst_2        
	//* 317  652:fmul            
	//* 318  653:fadd            
	//* 319  654:aload_0         
	//* 320  655:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//* 321  658:invokevirtual   #251 <Method float ViewPortHandler.getChartHeight()>
	//* 322  661:aload_0         
	//* 323  662:getfield        #71  <Field Legend mLegend>
	//* 324  665:invokevirtual   #100 <Method float Legend.getMaxSizePercent()>
	//* 325  668:fmul            
	//* 326  669:invokestatic    #104 <Method float Math.min(float, float)>
	//* 327  672:fadd            
	//* 328  673:fstore          4
	//* 329  675:fload           8
	//* 330  677:fstore_3        
	//* 331  678:fload           5
	//* 332  680:fstore_2        
	//* 333  681:fload           6
	//* 334  683:fstore_1        
	//* 335  684:goto            129
			if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.TOP)
	//* 336  687:aload_0         
	//* 337  688:getfield        #37  <Field XAxis mXAxis>
	//* 338  691:invokevirtual   #143 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//* 339  694:getstatic       #263 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.TOP>
	//* 340  697:if_acmpne       711
			{
				f3 = f + f6;
	//  341  700:fload_1         
	//  342  701:fload           7
	//  343  703:fadd            
	//  344  704:fstore          4
				f2 = f1;
	//  345  706:fload_2         
	//  346  707:fstore_3        
			} else
	//* 347  708:goto            239
			{
				f2 = f1;
	//  348  711:fload_2         
	//  349  712:fstore_3        
				f3 = f;
	//  350  713:fload_1         
	//  351  714:fstore          4
				if(mXAxis.getPosition() == com.github.mikephil.charting.components.XAxis.XAxisPosition.BOTH_SIDED)
	//* 352  716:aload_0         
	//* 353  717:getfield        #37  <Field XAxis mXAxis>
	//* 354  720:invokevirtual   #143 <Method com.github.mikephil.charting.components.XAxis$XAxisPosition XAxis.getPosition()>
	//* 355  723:getstatic       #266 <Field com.github.mikephil.charting.components.XAxis$XAxisPosition com.github.mikephil.charting.components.XAxis$XAxisPosition.BOTH_SIDED>
	//* 356  726:if_acmpne       239
				{
					f2 = f1 + f6;
	//  357  729:fload_2         
	//  358  730:fload           7
	//  359  732:fadd            
	//  360  733:fstore_3        
					f3 = f + f6;
	//  361  734:fload_1         
	//  362  735:fload           7
	//  363  737:fadd            
	//  364  738:fstore          4
				}
			}
		f = f4 + getExtraTopOffset();
		f1 = f3 + getExtraRightOffset();
		f3 = f5 + getExtraBottomOffset();
		f2 += getExtraLeftOffset();
		f4 = Utils.convertDpToPixel(mMinOffset);
		mViewPortHandler.restrainViewPort(Math.max(f4, f2), Math.max(f4, f), Math.max(f4, f1), Math.max(f4, f3));
		if(mLogEnabled)
		{
			Log.i("MPAndroidChart", (new StringBuilder()).append("offsetLeft: ").append(f2).append(", offsetTop: ").append(f).append(", offsetRight: ").append(f1).append(", offsetBottom: ").append(f3).toString());
			Log.i("MPAndroidChart", (new StringBuilder()).append("Content: ").append(mViewPortHandler.getContentRect().toString()).toString());
		}
		prepareOffsetMatrix();
		prepareValuePxMatrix();
		return;
		if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT || mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT) goto _L2; else goto _L1
_L1:
		f2 = f7;
		f1 = f4;
		f = f5;
		f3 = f6;
		if(mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_CENTER) goto _L3; else goto _L2
_L2:
		f = mLegend.mTextHeightMax;
		f3 = 0.0F + Math.min(mLegend.mNeededHeight + f * 2.0F, mViewPortHandler.getChartHeight() * mLegend.getMaxSizePercent());
		f2 = f7;
		f1 = f4;
		f = f5;
		  goto _L3
	//* 365  740:goto            239
	}

	public RectF getBarBounds(BarEntry barentry)
	{
		float f2 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          4
		IBarDataSet ibardataset = (IBarDataSet)((BarData)mData).getDataSetForEntry(((Entry) (barentry)));
	//    2    3:aload_0         
	//    3    4:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//    4    7:checkcast       #43  <Class BarData>
	//    5   10:aload_1         
	//    6   11:invokevirtual   #272 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarData.getDataSetForEntry(Entry)>
	//    7   14:checkcast       #274 <Class IBarDataSet>
	//    8   17:astore          7
		if(ibardataset == null)
	//*   9   19:aload           7
	//*  10   21:ifnonnull       26
			return null;
	//   11   24:aconst_null     
	//   12   25:areturn         
		float f1 = ibardataset.getBarSpace();
	//   13   26:aload           7
	//   14   28:invokeinterface #277 <Method float IBarDataSet.getBarSpace()>
	//   15   33:fstore_3        
		float f = barentry.getVal();
	//   16   34:aload_1         
	//   17   35:invokevirtual   #282 <Method float BarEntry.getVal()>
	//   18   38:fstore_2        
		float f3 = barentry.getXIndex();
	//   19   39:aload_1         
	//   20   40:invokevirtual   #285 <Method int BarEntry.getXIndex()>
	//   21   43:i2f             
	//   22   44:fstore          5
		float f4 = f1 / 2.0F;
	//   23   46:fload_3         
	//   24   47:fconst_2        
	//   25   48:fdiv            
	//   26   49:fstore          6
		if(f >= 0.0F)
	//*  27   51:fload_2         
	//*  28   52:fconst_0        
	//*  29   53:fcmpl           
	//*  30   54:iflt            114
			f1 = f;
	//   31   57:fload_2         
	//   32   58:fstore_3        
		else
	//*  33   59:fload_2         
	//*  34   60:fconst_0        
	//*  35   61:fcmpg           
	//*  36   62:ifgt            68
	//*  37   65:fload_2         
	//*  38   66:fstore          4
	//*  39   68:new             #220 <Class RectF>
	//*  40   71:dup             
	//*  41   72:fload_3         
	//*  42   73:fload           5
	//*  43   75:ldc2            #286 <Float 0.5F>
	//*  44   78:fsub            
	//*  45   79:fload           6
	//*  46   81:fadd            
	//*  47   82:fload           4
	//*  48   84:fload           5
	//*  49   86:ldc2            #286 <Float 0.5F>
	//*  50   89:fadd            
	//*  51   90:fload           6
	//*  52   92:fsub            
	//*  53   93:invokespecial   #288 <Method void RectF(float, float, float, float)>
	//*  54   96:astore_1        
	//*  55   97:aload_0         
	//*  56   98:aload           7
	//*  57  100:invokeinterface #292 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//*  58  105:invokevirtual   #296 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  59  108:aload_1         
	//*  60  109:invokevirtual   #302 <Method void Transformer.rectValueToPixel(RectF)>
	//*  61  112:aload_1         
	//*  62  113:areturn         
			f1 = 0.0F;
	//   63  114:fconst_0        
	//   64  115:fstore_3        
		if(f <= 0.0F)
			f2 = f;
		barentry = ((BarEntry) (new RectF(f1, (f3 - 0.5F) + f4, f2, (f3 + 0.5F) - f4)));
		getTransformer(ibardataset.getAxisDependency()).rectValueToPixel(((RectF) (barentry)));
		return ((RectF) (barentry));
	//*  65  116:goto            59
	}

	public int getHighestVisibleXIndex()
	{
		float f = 1.0F;
	//    0    0:fconst_1        
	//    1    1:fstore_1        
		float f1 = ((BarData)mData).getDataSetCount();
	//    2    2:aload_0         
	//    3    3:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//    4    6:checkcast       #43  <Class BarData>
	//    5    9:invokevirtual   #306 <Method int BarData.getDataSetCount()>
	//    6   12:i2f             
	//    7   13:fstore_2        
		float af[];
		if(f1 > 1.0F)
	//*   8   14:fload_2         
	//*   9   15:fconst_1        
	//*  10   16:fcmpg           
	//*  11   17:ifgt            76
	//*  12   20:iconst_2        
	//*  13   21:newarray        float[]
	//*  14   23:astore_3        
	//*  15   24:aload_3         
	//*  16   25:iconst_0        
	//*  17   26:aload_0         
	//*  18   27:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//*  19   30:invokevirtual   #309 <Method float ViewPortHandler.contentLeft()>
	//*  20   33:fastore         
	//*  21   34:aload_3         
	//*  22   35:iconst_1        
	//*  23   36:aload_0         
	//*  24   37:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//*  25   40:invokevirtual   #312 <Method float ViewPortHandler.contentTop()>
	//*  26   43:fastore         
	//*  27   44:aload_0         
	//*  28   45:getstatic       #318 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  29   48:invokevirtual   #296 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  30   51:aload_3         
	//*  31   52:invokevirtual   #321 <Method void Transformer.pixelsToValue(float[])>
	//*  32   55:aload_3         
	//*  33   56:iconst_1        
	//*  34   57:faload          
	//*  35   58:aload_0         
	//*  36   59:invokevirtual   #324 <Method float getXChartMax()>
	//*  37   62:fcmpl           
	//*  38   63:iflt            92
	//*  39   66:aload_0         
	//*  40   67:invokevirtual   #324 <Method float getXChartMax()>
	//*  41   70:fload_1         
	//*  42   71:fdiv            
	//*  43   72:fstore_1        
	//*  44   73:fload_1         
	//*  45   74:f2i             
	//*  46   75:ireturn         
			f = f1 + ((BarData)mData).getGroupSpace();
	//   47   76:fload_2         
	//   48   77:aload_0         
	//   49   78:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//   50   81:checkcast       #43  <Class BarData>
	//   51   84:invokevirtual   #327 <Method float BarData.getGroupSpace()>
	//   52   87:fadd            
	//   53   88:fstore_1        
		af = new float[2];
		af[0] = mViewPortHandler.contentLeft();
		af[1] = mViewPortHandler.contentTop();
		getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
		if(af[1] >= getXChartMax())
			f = getXChartMax() / f;
		else
	//*  54   89:goto            20
			f = af[1] / f;
	//   55   92:aload_3         
	//   56   93:iconst_1        
	//   57   94:faload          
	//   58   95:fload_1         
	//   59   96:fdiv            
	//   60   97:fstore_1        
		return (int)f;
	//*  61   98:goto            73
	}

	public Highlight getHighlightByTouchPoint(float f, float f1)
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//*   2    4:ifnonnull       18
		{
			Log.e("MPAndroidChart", "Can't select by touch. No data set.");
	//    3    7:ldc1            #183 <String "MPAndroidChart">
	//    4    9:ldc2            #331 <String "Can't select by touch. No data set.">
	//    5   12:invokestatic    #334 <Method int Log.e(String, String)>
	//    6   15:pop             
			return null;
	//    7   16:aconst_null     
	//    8   17:areturn         
		} else
		{
			return getHighlighter().getHighlight(f1, f);
	//    9   18:aload_0         
	//   10   19:invokevirtual   #338 <Method ChartHighlighter getHighlighter()>
	//   11   22:fload_2         
	//   12   23:fload_1         
	//   13   24:invokevirtual   #343 <Method Highlight ChartHighlighter.getHighlight(float, float)>
	//   14   27:areturn         
		}
	}

	public int getLowestVisibleXIndex()
	{
		float f = ((BarData)mData).getDataSetCount();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//    2    4:checkcast       #43  <Class BarData>
	//    3    7:invokevirtual   #306 <Method int BarData.getDataSetCount()>
	//    4   10:i2f             
	//    5   11:fstore_1        
		float af[];
		if(f <= 1.0F)
	//*   6   12:fload_1         
	//*   7   13:fconst_1        
	//*   8   14:fcmpg           
	//*   9   15:ifgt            70
			f = 1.0F;
	//   10   18:fconst_1        
	//   11   19:fstore_1        
		else
	//*  12   20:iconst_2        
	//*  13   21:newarray        float[]
	//*  14   23:astore_2        
	//*  15   24:aload_2         
	//*  16   25:iconst_0        
	//*  17   26:aload_0         
	//*  18   27:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//*  19   30:invokevirtual   #309 <Method float ViewPortHandler.contentLeft()>
	//*  20   33:fastore         
	//*  21   34:aload_2         
	//*  22   35:iconst_1        
	//*  23   36:aload_0         
	//*  24   37:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//*  25   40:invokevirtual   #347 <Method float ViewPortHandler.contentBottom()>
	//*  26   43:fastore         
	//*  27   44:aload_0         
	//*  28   45:getstatic       #318 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  29   48:invokevirtual   #296 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  30   51:aload_2         
	//*  31   52:invokevirtual   #321 <Method void Transformer.pixelsToValue(float[])>
	//*  32   55:aload_2         
	//*  33   56:iconst_1        
	//*  34   57:faload          
	//*  35   58:fconst_0        
	//*  36   59:fcmpg           
	//*  37   60:ifgt            86
	//*  38   63:fconst_0        
	//*  39   64:fstore_1        
	//*  40   65:fload_1         
	//*  41   66:fconst_1        
	//*  42   67:fadd            
	//*  43   68:f2i             
	//*  44   69:ireturn         
			f += ((BarData)mData).getGroupSpace();
	//   45   70:fload_1         
	//   46   71:aload_0         
	//   47   72:getfield        #41  <Field com.github.mikephil.charting.data.ChartData mData>
	//   48   75:checkcast       #43  <Class BarData>
	//   49   78:invokevirtual   #327 <Method float BarData.getGroupSpace()>
	//   50   81:fadd            
	//   51   82:fstore_1        
		af = new float[2];
		af[0] = mViewPortHandler.contentLeft();
		af[1] = mViewPortHandler.contentBottom();
		getTransformer(com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT).pixelsToValue(af);
		if(af[1] <= 0.0F)
			f = 0.0F;
		else
	//*  52   83:goto            20
			f = af[1] / f;
	//   53   86:aload_2         
	//   54   87:iconst_1        
	//   55   88:faload          
	//   56   89:fload_1         
	//   57   90:fdiv            
	//   58   91:fstore_1        
		return (int)(f + 1.0F);
	//*  59   92:goto            65
	}

	public PointF getPosition(Entry entry, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency)
	{
		if(entry == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			float af[] = new float[2];
	//    4    6:iconst_2        
	//    5    7:newarray        float[]
	//    6    9:astore_3        
			af[0] = entry.getVal();
	//    7   10:aload_3         
	//    8   11:iconst_0        
	//    9   12:aload_1         
	//   10   13:invokevirtual   #351 <Method float Entry.getVal()>
	//   11   16:fastore         
			af[1] = entry.getXIndex();
	//   12   17:aload_3         
	//   13   18:iconst_1        
	//   14   19:aload_1         
	//   15   20:invokevirtual   #352 <Method int Entry.getXIndex()>
	//   16   23:i2f             
	//   17   24:fastore         
			getTransformer(axisdependency).pointValuesToPixel(af);
	//   18   25:aload_0         
	//   19   26:aload_2         
	//   20   27:invokevirtual   #296 <Method Transformer getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   21   30:aload_3         
	//   22   31:invokevirtual   #355 <Method void Transformer.pointValuesToPixel(float[])>
			return new PointF(af[0], af[1]);
	//   23   34:new             #357 <Class PointF>
	//   24   37:dup             
	//   25   38:aload_3         
	//   26   39:iconst_0        
	//   27   40:faload          
	//   28   41:aload_3         
	//   29   42:iconst_1        
	//   30   43:faload          
	//   31   44:invokespecial   #360 <Method void PointF(float, float)>
	//   32   47:areturn         
		}
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method void BarChart.init()>
		mLeftAxisTransformer = ((Transformer) (new TransformerHorizontalBarChart(mViewPortHandler)));
	//    2    4:aload_0         
	//    3    5:new             #365 <Class TransformerHorizontalBarChart>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//    7   13:invokespecial   #368 <Method void TransformerHorizontalBarChart(ViewPortHandler)>
	//    8   16:putfield        #372 <Field Transformer mLeftAxisTransformer>
		mRightAxisTransformer = ((Transformer) (new TransformerHorizontalBarChart(mViewPortHandler)));
	//    9   19:aload_0         
	//   10   20:new             #365 <Class TransformerHorizontalBarChart>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//   14   28:invokespecial   #368 <Method void TransformerHorizontalBarChart(ViewPortHandler)>
	//   15   31:putfield        #375 <Field Transformer mRightAxisTransformer>
		mRenderer = ((com.github.mikephil.charting.renderer.DataRenderer) (new HorizontalBarChartRenderer(((com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) (this)), mAnimator, mViewPortHandler)));
	//   16   34:aload_0         
	//   17   35:new             #377 <Class HorizontalBarChartRenderer>
	//   18   38:dup             
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #381 <Field com.github.mikephil.charting.animation.ChartAnimator mAnimator>
	//   22   44:aload_0         
	//   23   45:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//   24   48:invokespecial   #384 <Method void HorizontalBarChartRenderer(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider, com.github.mikephil.charting.animation.ChartAnimator, ViewPortHandler)>
	//   25   51:putfield        #388 <Field com.github.mikephil.charting.renderer.DataRenderer mRenderer>
		setHighlighter(((ChartHighlighter) (new HorizontalBarHighlighter(((com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider) (this))))));
	//   26   54:aload_0         
	//   27   55:new             #390 <Class HorizontalBarHighlighter>
	//   28   58:dup             
	//   29   59:aload_0         
	//   30   60:invokespecial   #393 <Method void HorizontalBarHighlighter(com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider)>
	//   31   63:invokevirtual   #397 <Method void setHighlighter(ChartHighlighter)>
		mAxisRendererLeft = ((YAxisRenderer) (new YAxisRendererHorizontalBarChart(mViewPortHandler, mAxisLeft, mLeftAxisTransformer)));
	//   32   66:aload_0         
	//   33   67:new             #399 <Class YAxisRendererHorizontalBarChart>
	//   34   70:dup             
	//   35   71:aload_0         
	//   36   72:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//   37   75:aload_0         
	//   38   76:getfield        #111 <Field YAxis mAxisLeft>
	//   39   79:aload_0         
	//   40   80:getfield        #372 <Field Transformer mLeftAxisTransformer>
	//   41   83:invokespecial   #402 <Method void YAxisRendererHorizontalBarChart(ViewPortHandler, YAxis, Transformer)>
	//   42   86:putfield        #120 <Field YAxisRenderer mAxisRendererLeft>
		mAxisRendererRight = ((YAxisRenderer) (new YAxisRendererHorizontalBarChart(mViewPortHandler, mAxisRight, mRightAxisTransformer)));
	//   43   89:aload_0         
	//   44   90:new             #399 <Class YAxisRendererHorizontalBarChart>
	//   45   93:dup             
	//   46   94:aload_0         
	//   47   95:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//   48   98:aload_0         
	//   49   99:getfield        #133 <Field YAxis mAxisRight>
	//   50  102:aload_0         
	//   51  103:getfield        #375 <Field Transformer mRightAxisTransformer>
	//   52  106:invokespecial   #402 <Method void YAxisRendererHorizontalBarChart(ViewPortHandler, YAxis, Transformer)>
	//   53  109:putfield        #136 <Field YAxisRenderer mAxisRendererRight>
		mXAxisRenderer = ((com.github.mikephil.charting.renderer.XAxisRenderer) (new XAxisRendererHorizontalBarChart(mViewPortHandler, mXAxis, mLeftAxisTransformer, ((BarChart) (this)))));
	//   54  112:aload_0         
	//   55  113:new             #404 <Class XAxisRendererHorizontalBarChart>
	//   56  116:dup             
	//   57  117:aload_0         
	//   58  118:getfield        #21  <Field ViewPortHandler mViewPortHandler>
	//   59  121:aload_0         
	//   60  122:getfield        #37  <Field XAxis mXAxis>
	//   61  125:aload_0         
	//   62  126:getfield        #372 <Field Transformer mLeftAxisTransformer>
	//   63  129:aload_0         
	//   64  130:invokespecial   #407 <Method void XAxisRendererHorizontalBarChart(ViewPortHandler, XAxis, Transformer, BarChart)>
	//   65  133:putfield        #411 <Field com.github.mikephil.charting.renderer.XAxisRenderer mXAxisRenderer>
	//   66  136:return          
	}

	protected void prepareValuePxMatrix()
	{
		mRightAxisTransformer.prepareMatrixValuePx(mAxisRight.mAxisMinimum, mAxisRight.mAxisRange, mDeltaX, mXChartMin);
	//    0    0:aload_0         
	//    1    1:getfield        #375 <Field Transformer mRightAxisTransformer>
	//    2    4:aload_0         
	//    3    5:getfield        #133 <Field YAxis mAxisRight>
	//    4    8:getfield        #414 <Field float YAxis.mAxisMinimum>
	//    5   11:aload_0         
	//    6   12:getfield        #133 <Field YAxis mAxisRight>
	//    7   15:getfield        #417 <Field float YAxis.mAxisRange>
	//    8   18:aload_0         
	//    9   19:getfield        #420 <Field float mDeltaX>
	//   10   22:aload_0         
	//   11   23:getfield        #423 <Field float mXChartMin>
	//   12   26:invokevirtual   #426 <Method void Transformer.prepareMatrixValuePx(float, float, float, float)>
		mLeftAxisTransformer.prepareMatrixValuePx(mAxisLeft.mAxisMinimum, mAxisLeft.mAxisRange, mDeltaX, mXChartMin);
	//   13   29:aload_0         
	//   14   30:getfield        #372 <Field Transformer mLeftAxisTransformer>
	//   15   33:aload_0         
	//   16   34:getfield        #111 <Field YAxis mAxisLeft>
	//   17   37:getfield        #414 <Field float YAxis.mAxisMinimum>
	//   18   40:aload_0         
	//   19   41:getfield        #111 <Field YAxis mAxisLeft>
	//   20   44:getfield        #417 <Field float YAxis.mAxisRange>
	//   21   47:aload_0         
	//   22   48:getfield        #420 <Field float mDeltaX>
	//   23   51:aload_0         
	//   24   52:getfield        #423 <Field float mXChartMin>
	//   25   55:invokevirtual   #426 <Method void Transformer.prepareMatrixValuePx(float, float, float, float)>
	//   26   58:return          
	}
}
