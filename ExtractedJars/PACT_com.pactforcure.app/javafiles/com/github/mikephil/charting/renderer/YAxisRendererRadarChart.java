// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.LimitLine;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			YAxisRenderer

public class YAxisRendererRadarChart extends YAxisRenderer
{

	public YAxisRendererRadarChart(ViewPortHandler viewporthandler, YAxis yaxis, RadarChart radarchart)
	{
		super(viewporthandler, yaxis, ((com.github.mikephil.charting.utils.Transformer) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #11  <Method void YAxisRenderer(ViewPortHandler, YAxis, com.github.mikephil.charting.utils.Transformer)>
		mChart = radarchart;
	//    5    7:aload_0         
	//    6    8:aload_3         
	//    7    9:putfield        #13  <Field RadarChart mChart>
	//    8   12:return          
	}

	public void computeAxis(float f, float f1)
	{
		computeAxisValues(f, f1);
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:fload_2         
	//    3    3:invokevirtual   #19  <Method void computeAxisValues(float, float)>
	//    4    6:return          
	}

	protected void computeAxisValues(float f, float f1)
	{
		int k = mYAxis.getLabelCount();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field YAxis mYAxis>
	//    2    4:invokevirtual   #29  <Method int YAxis.getLabelCount()>
	//    3    7:istore          13
		double d2 = Math.abs(f1 - f);
	//    4    9:fload_2         
	//    5   10:fload_1         
	//    6   11:fsub            
	//    7   12:invokestatic    #35  <Method float Math.abs(float)>
	//    8   15:f2d             
	//    9   16:dstore          5
		if(k == 0 || d2 <= 0.0D)
	//*  10   18:iload           13
	//*  11   20:ifeq            30
	//*  12   23:dload           5
	//*  13   25:dconst_0        
	//*  14   26:dcmpg           
	//*  15   27:ifgt            49
		{
			mYAxis.mEntries = new float[0];
	//   16   30:aload_0         
	//   17   31:getfield        #23  <Field YAxis mYAxis>
	//   18   34:iconst_0        
	//   19   35:newarray        float[]
	//   20   37:putfield        #39  <Field float[] YAxis.mEntries>
			mYAxis.mEntryCount = 0;
	//   21   40:aload_0         
	//   22   41:getfield        #23  <Field YAxis mYAxis>
	//   23   44:iconst_0        
	//   24   45:putfield        #43  <Field int YAxis.mEntryCount>
			return;
	//   25   48:return          
		}
		double d = Utils.roundToNextSignificant(d2 / (double)k);
	//   26   49:dload           5
	//   27   51:iload           13
	//   28   53:i2d             
	//   29   54:ddiv            
	//   30   55:invokestatic    #49  <Method float Utils.roundToNextSignificant(double)>
	//   31   58:f2d             
	//   32   59:dstore_3        
		double d5 = Math.pow(10D, (int)Math.log10(d));
	//   33   60:ldc2w           #50  <Double 10D>
	//   34   63:dload_3         
	//   35   64:invokestatic    #55  <Method double Math.log10(double)>
	//   36   67:d2i             
	//   37   68:i2d             
	//   38   69:invokestatic    #59  <Method double Math.pow(double, double)>
	//   39   72:dstore          9
		double d4 = d;
	//   40   74:dload_3         
	//   41   75:dstore          7
		if((int)(d / d5) > 5)
	//*  42   77:dload_3         
	//*  43   78:dload           9
	//*  44   80:ddiv            
	//*  45   81:d2i             
	//*  46   82:iconst_5        
	//*  47   83:icmple          97
			d4 = Math.floor(10D * d5);
	//   48   86:ldc2w           #50  <Double 10D>
	//   49   89:dload           9
	//   50   91:dmul            
	//   51   92:invokestatic    #62  <Method double Math.floor(double)>
	//   52   95:dstore          7
		if(mYAxis.isForceLabelsEnabled())
	//*  53   97:aload_0         
	//*  54   98:getfield        #23  <Field YAxis mYAxis>
	//*  55  101:invokevirtual   #66  <Method boolean YAxis.isForceLabelsEnabled()>
	//*  56  104:ifeq            188
		{
			float f2 = (float)d2 / (float)(k - 1);
	//   57  107:dload           5
	//   58  109:d2f             
	//   59  110:iload           13
	//   60  112:iconst_1        
	//   61  113:isub            
	//   62  114:i2f             
	//   63  115:fdiv            
	//   64  116:fstore          11
			mYAxis.mEntryCount = k;
	//   65  118:aload_0         
	//   66  119:getfield        #23  <Field YAxis mYAxis>
	//   67  122:iload           13
	//   68  124:putfield        #43  <Field int YAxis.mEntryCount>
			if(mYAxis.mEntries.length < k)
	//*  69  127:aload_0         
	//*  70  128:getfield        #23  <Field YAxis mYAxis>
	//*  71  131:getfield        #39  <Field float[] YAxis.mEntries>
	//*  72  134:arraylength     
	//*  73  135:iload           13
	//*  74  137:icmpge          151
				mYAxis.mEntries = new float[k];
	//   75  140:aload_0         
	//   76  141:getfield        #23  <Field YAxis mYAxis>
	//   77  144:iload           13
	//   78  146:newarray        float[]
	//   79  148:putfield        #39  <Field float[] YAxis.mEntries>
			f1 = f;
	//   80  151:fload_1         
	//   81  152:fstore_2        
			for(int i = 0; i < k; i++)
	//*  82  153:iconst_0        
	//*  83  154:istore          12
	//*  84  156:iload           12
	//*  85  158:iload           13
	//*  86  160:icmpge          236
			{
				mYAxis.mEntries[i] = f1;
	//   87  163:aload_0         
	//   88  164:getfield        #23  <Field YAxis mYAxis>
	//   89  167:getfield        #39  <Field float[] YAxis.mEntries>
	//   90  170:iload           12
	//   91  172:fload_2         
	//   92  173:fastore         
				f1 += f2;
	//   93  174:fload_2         
	//   94  175:fload           11
	//   95  177:fadd            
	//   96  178:fstore_2        
			}

	//   97  179:iload           12
	//   98  181:iconst_1        
	//   99  182:iadd            
	//  100  183:istore          12
		} else
	//* 101  185:goto            156
		if(mYAxis.isShowOnlyMinMaxEnabled())
	//* 102  188:aload_0         
	//* 103  189:getfield        #23  <Field YAxis mYAxis>
	//* 104  192:invokevirtual   #69  <Method boolean YAxis.isShowOnlyMinMaxEnabled()>
	//* 105  195:ifeq            340
		{
			mYAxis.mEntryCount = 2;
	//  106  198:aload_0         
	//  107  199:getfield        #23  <Field YAxis mYAxis>
	//  108  202:iconst_2        
	//  109  203:putfield        #43  <Field int YAxis.mEntryCount>
			mYAxis.mEntries = new float[2];
	//  110  206:aload_0         
	//  111  207:getfield        #23  <Field YAxis mYAxis>
	//  112  210:iconst_2        
	//  113  211:newarray        float[]
	//  114  213:putfield        #39  <Field float[] YAxis.mEntries>
			mYAxis.mEntries[0] = f;
	//  115  216:aload_0         
	//  116  217:getfield        #23  <Field YAxis mYAxis>
	//  117  220:getfield        #39  <Field float[] YAxis.mEntries>
	//  118  223:iconst_0        
	//  119  224:fload_1         
	//  120  225:fastore         
			mYAxis.mEntries[1] = f1;
	//  121  226:aload_0         
	//  122  227:getfield        #23  <Field YAxis mYAxis>
	//  123  230:getfield        #39  <Field float[] YAxis.mEntries>
	//  124  233:iconst_1        
	//  125  234:fload_2         
	//  126  235:fastore         
		} else
	//* 127  236:dload           7
	//* 128  238:dconst_1        
	//* 129  239:dcmpg           
	//* 130  240:ifge            523
	//* 131  243:aload_0         
	//* 132  244:getfield        #23  <Field YAxis mYAxis>
	//* 133  247:dload           7
	//* 134  249:invokestatic    #55  <Method double Math.log10(double)>
	//* 135  252:dneg            
	//* 136  253:invokestatic    #72  <Method double Math.ceil(double)>
	//* 137  256:d2i             
	//* 138  257:putfield        #75  <Field int YAxis.mDecimals>
	//* 139  260:aload_0         
	//* 140  261:getfield        #23  <Field YAxis mYAxis>
	//* 141  264:getfield        #39  <Field float[] YAxis.mEntries>
	//* 142  267:iconst_0        
	//* 143  268:faload          
	//* 144  269:fload_1         
	//* 145  270:fcmpg           
	//* 146  271:ifge            290
	//* 147  274:aload_0         
	//* 148  275:getfield        #23  <Field YAxis mYAxis>
	//* 149  278:aload_0         
	//* 150  279:getfield        #23  <Field YAxis mYAxis>
	//* 151  282:getfield        #39  <Field float[] YAxis.mEntries>
	//* 152  285:iconst_0        
	//* 153  286:faload          
	//* 154  287:putfield        #79  <Field float YAxis.mAxisMinimum>
	//* 155  290:aload_0         
	//* 156  291:getfield        #23  <Field YAxis mYAxis>
	//* 157  294:aload_0         
	//* 158  295:getfield        #23  <Field YAxis mYAxis>
	//* 159  298:getfield        #39  <Field float[] YAxis.mEntries>
	//* 160  301:aload_0         
	//* 161  302:getfield        #23  <Field YAxis mYAxis>
	//* 162  305:getfield        #43  <Field int YAxis.mEntryCount>
	//* 163  308:iconst_1        
	//* 164  309:isub            
	//* 165  310:faload          
	//* 166  311:putfield        #82  <Field float YAxis.mAxisMaximum>
	//* 167  314:aload_0         
	//* 168  315:getfield        #23  <Field YAxis mYAxis>
	//* 169  318:aload_0         
	//* 170  319:getfield        #23  <Field YAxis mYAxis>
	//* 171  322:getfield        #82  <Field float YAxis.mAxisMaximum>
	//* 172  325:aload_0         
	//* 173  326:getfield        #23  <Field YAxis mYAxis>
	//* 174  329:getfield        #79  <Field float YAxis.mAxisMinimum>
	//* 175  332:fsub            
	//* 176  333:invokestatic    #35  <Method float Math.abs(float)>
	//* 177  336:putfield        #85  <Field float YAxis.mAxisRange>
	//* 178  339:return          
		{
			double d1 = (double)f / d4;
	//  179  340:fload_1         
	//  180  341:f2d             
	//  181  342:dload           7
	//  182  344:ddiv            
	//  183  345:dstore_3        
			double d3;
			double d6;
			int j;
			if(d1 < 0.0D)
	//* 184  346:dload_3         
	//* 185  347:dconst_0        
	//* 186  348:dcmpg           
	//* 187  349:ifge            419
				d3 = Math.floor(d1) * d4;
	//  188  352:dload_3         
	//  189  353:invokestatic    #62  <Method double Math.floor(double)>
	//  190  356:dload           7
	//  191  358:dmul            
	//  192  359:dstore          5
			else
	//* 193  361:dload           5
	//* 194  363:dstore_3        
	//* 195  364:dload           5
	//* 196  366:dconst_0        
	//* 197  367:dcmpl           
	//* 198  368:ifne            373
	//* 199  371:dconst_0        
	//* 200  372:dstore_3        
	//* 201  373:fload_2         
	//* 202  374:f2d             
	//* 203  375:dload           7
	//* 204  377:ddiv            
	//* 205  378:invokestatic    #62  <Method double Math.floor(double)>
	//* 206  381:dload           7
	//* 207  383:dmul            
	//* 208  384:invokestatic    #88  <Method double Utils.nextUp(double)>
	//* 209  387:dstore          9
	//* 210  389:iconst_0        
	//* 211  390:istore          12
	//* 212  392:dload_3         
	//* 213  393:dstore          5
	//* 214  395:dload           5
	//* 215  397:dload           9
	//* 216  399:dcmpg           
	//* 217  400:ifgt            431
	//* 218  403:iload           12
	//* 219  405:iconst_1        
	//* 220  406:iadd            
	//* 221  407:istore          12
	//* 222  409:dload           5
	//* 223  411:dload           7
	//* 224  413:dadd            
	//* 225  414:dstore          5
	//* 226  416:goto            395
				d3 = Math.ceil(d1) * d4;
	//  227  419:dload_3         
	//  228  420:invokestatic    #72  <Method double Math.ceil(double)>
	//  229  423:dload           7
	//  230  425:dmul            
	//  231  426:dstore          5
			d1 = d3;
			if(d3 == 0.0D)
				d1 = 0.0D;
			d6 = Utils.nextUp(Math.floor((double)f1 / d4) * d4);
			j = 0;
			for(d3 = d1; d3 <= d6; d3 += d4)
				j++;

	//* 232  428:goto            361
			int l = j;
	//  233  431:iload           12
	//  234  433:istore          13
			if(Float.isNaN(mYAxis.getAxisMaxValue()))
	//* 235  435:aload_0         
	//* 236  436:getfield        #23  <Field YAxis mYAxis>
	//* 237  439:invokevirtual   #92  <Method float YAxis.getAxisMaxValue()>
	//* 238  442:invokestatic    #98  <Method boolean Float.isNaN(float)>
	//* 239  445:ifeq            454
				l = j + 1;
	//  240  448:iload           12
	//  241  450:iconst_1        
	//  242  451:iadd            
	//  243  452:istore          13
			mYAxis.mEntryCount = l;
	//  244  454:aload_0         
	//  245  455:getfield        #23  <Field YAxis mYAxis>
	//  246  458:iload           13
	//  247  460:putfield        #43  <Field int YAxis.mEntryCount>
			if(mYAxis.mEntries.length < l)
	//* 248  463:aload_0         
	//* 249  464:getfield        #23  <Field YAxis mYAxis>
	//* 250  467:getfield        #39  <Field float[] YAxis.mEntries>
	//* 251  470:arraylength     
	//* 252  471:iload           13
	//* 253  473:icmpge          487
				mYAxis.mEntries = new float[l];
	//  254  476:aload_0         
	//  255  477:getfield        #23  <Field YAxis mYAxis>
	//  256  480:iload           13
	//  257  482:newarray        float[]
	//  258  484:putfield        #39  <Field float[] YAxis.mEntries>
			j = 0;
	//  259  487:iconst_0        
	//  260  488:istore          12
			while(j < l) 
	//* 261  490:iload           12
	//* 262  492:iload           13
	//* 263  494:icmpge          236
			{
				mYAxis.mEntries[j] = (float)d1;
	//  264  497:aload_0         
	//  265  498:getfield        #23  <Field YAxis mYAxis>
	//  266  501:getfield        #39  <Field float[] YAxis.mEntries>
	//  267  504:iload           12
	//  268  506:dload_3         
	//  269  507:d2f             
	//  270  508:fastore         
				d1 += d4;
	//  271  509:dload_3         
	//  272  510:dload           7
	//  273  512:dadd            
	//  274  513:dstore_3        
				j++;
	//  275  514:iload           12
	//  276  516:iconst_1        
	//  277  517:iadd            
	//  278  518:istore          12
			}
		}
		if(d4 < 1.0D)
			mYAxis.mDecimals = (int)Math.ceil(-Math.log10(d4));
		else
	//* 279  520:goto            490
			mYAxis.mDecimals = 0;
	//  280  523:aload_0         
	//  281  524:getfield        #23  <Field YAxis mYAxis>
	//  282  527:iconst_0        
	//  283  528:putfield        #75  <Field int YAxis.mDecimals>
		if(mYAxis.mEntries[0] < f)
			mYAxis.mAxisMinimum = mYAxis.mEntries[0];
		mYAxis.mAxisMaximum = mYAxis.mEntries[mYAxis.mEntryCount - 1];
		mYAxis.mAxisRange = Math.abs(mYAxis.mAxisMaximum - mYAxis.mAxisMinimum);
	//* 284  531:goto            260
	}

	public void renderAxisLabels(Canvas canvas)
	{
		if(mYAxis.isEnabled() && mYAxis.isDrawLabelsEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field YAxis mYAxis>
	//*   2    4:invokevirtual   #103 <Method boolean YAxis.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #23  <Field YAxis mYAxis>
	//*   6   14:invokevirtual   #106 <Method boolean YAxis.isDrawLabelsEnabled()>
	//*   7   17:ifne            21
	//*   8   20:return          
		{
			mAxisLabelPaint.setTypeface(mYAxis.getTypeface());
	//    9   21:aload_0         
	//   10   22:getfield        #110 <Field Paint mAxisLabelPaint>
	//   11   25:aload_0         
	//   12   26:getfield        #23  <Field YAxis mYAxis>
	//   13   29:invokevirtual   #114 <Method android.graphics.Typeface YAxis.getTypeface()>
	//   14   32:invokevirtual   #120 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   15   35:pop             
			mAxisLabelPaint.setTextSize(mYAxis.getTextSize());
	//   16   36:aload_0         
	//   17   37:getfield        #110 <Field Paint mAxisLabelPaint>
	//   18   40:aload_0         
	//   19   41:getfield        #23  <Field YAxis mYAxis>
	//   20   44:invokevirtual   #123 <Method float YAxis.getTextSize()>
	//   21   47:invokevirtual   #127 <Method void Paint.setTextSize(float)>
			mAxisLabelPaint.setColor(mYAxis.getTextColor());
	//   22   50:aload_0         
	//   23   51:getfield        #110 <Field Paint mAxisLabelPaint>
	//   24   54:aload_0         
	//   25   55:getfield        #23  <Field YAxis mYAxis>
	//   26   58:invokevirtual   #130 <Method int YAxis.getTextColor()>
	//   27   61:invokevirtual   #134 <Method void Paint.setColor(int)>
			PointF pointf = mChart.getCenterOffsets();
	//   28   64:aload_0         
	//   29   65:getfield        #13  <Field RadarChart mChart>
	//   30   68:invokevirtual   #140 <Method PointF RadarChart.getCenterOffsets()>
	//   31   71:astore          5
			float f = mChart.getFactor();
	//   32   73:aload_0         
	//   33   74:getfield        #13  <Field RadarChart mChart>
	//   34   77:invokevirtual   #143 <Method float RadarChart.getFactor()>
	//   35   80:fstore_2        
			int j = mYAxis.mEntryCount;
	//   36   81:aload_0         
	//   37   82:getfield        #23  <Field YAxis mYAxis>
	//   38   85:getfield        #43  <Field int YAxis.mEntryCount>
	//   39   88:istore          4
			int i = 0;
	//   40   90:iconst_0        
	//   41   91:istore_3        
			while(i < j && (i != j - 1 || mYAxis.isDrawTopYLabelEntryEnabled())) 
	//*  42   92:iload_3         
	//*  43   93:iload           4
	//*  44   95:icmpge          20
	//*  45   98:iload_3         
	//*  46   99:iload           4
	//*  47  101:iconst_1        
	//*  48  102:isub            
	//*  49  103:icmpne          116
	//*  50  106:aload_0         
	//*  51  107:getfield        #23  <Field YAxis mYAxis>
	//*  52  110:invokevirtual   #146 <Method boolean YAxis.isDrawTopYLabelEntryEnabled()>
	//*  53  113:ifeq            20
			{
				PointF pointf1 = Utils.getPosition(pointf, (mYAxis.mEntries[i] - mYAxis.mAxisMinimum) * f, mChart.getRotationAngle());
	//   54  116:aload           5
	//   55  118:aload_0         
	//   56  119:getfield        #23  <Field YAxis mYAxis>
	//   57  122:getfield        #39  <Field float[] YAxis.mEntries>
	//   58  125:iload_3         
	//   59  126:faload          
	//   60  127:aload_0         
	//   61  128:getfield        #23  <Field YAxis mYAxis>
	//   62  131:getfield        #79  <Field float YAxis.mAxisMinimum>
	//   63  134:fsub            
	//   64  135:fload_2         
	//   65  136:fmul            
	//   66  137:aload_0         
	//   67  138:getfield        #13  <Field RadarChart mChart>
	//   68  141:invokevirtual   #149 <Method float RadarChart.getRotationAngle()>
	//   69  144:invokestatic    #153 <Method PointF Utils.getPosition(PointF, float, float)>
	//   70  147:astore          6
				canvas.drawText(mYAxis.getFormattedLabel(i), pointf1.x + 10F, pointf1.y, mAxisLabelPaint);
	//   71  149:aload_1         
	//   72  150:aload_0         
	//   73  151:getfield        #23  <Field YAxis mYAxis>
	//   74  154:iload_3         
	//   75  155:invokevirtual   #157 <Method String YAxis.getFormattedLabel(int)>
	//   76  158:aload           6
	//   77  160:getfield        #162 <Field float PointF.x>
	//   78  163:ldc1            #163 <Float 10F>
	//   79  165:fadd            
	//   80  166:aload           6
	//   81  168:getfield        #166 <Field float PointF.y>
	//   82  171:aload_0         
	//   83  172:getfield        #110 <Field Paint mAxisLabelPaint>
	//   84  175:invokevirtual   #172 <Method void Canvas.drawText(String, float, float, Paint)>
				i++;
	//   85  178:iload_3         
	//   86  179:iconst_1        
	//   87  180:iadd            
	//   88  181:istore_3        
			}
		}
	//*  89  182:goto            92
	}

	public void renderLimitLines(Canvas canvas)
	{
		List list = mYAxis.getLimitLines();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field YAxis mYAxis>
	//    2    4:invokevirtual   #177 <Method List YAxis.getLimitLines()>
	//    3    7:astore          8
		if(list != null)
	//*   4    9:aload           8
	//*   5   11:ifnonnull       15
	//*   6   14:return          
		{
			float f = mChart.getSliceAngle();
	//    7   15:aload_0         
	//    8   16:getfield        #13  <Field RadarChart mChart>
	//    9   19:invokevirtual   #180 <Method float RadarChart.getSliceAngle()>
	//   10   22:fstore_2        
			float f1 = mChart.getFactor();
	//   11   23:aload_0         
	//   12   24:getfield        #13  <Field RadarChart mChart>
	//   13   27:invokevirtual   #143 <Method float RadarChart.getFactor()>
	//   14   30:fstore_3        
			PointF pointf = mChart.getCenterOffsets();
	//   15   31:aload_0         
	//   16   32:getfield        #13  <Field RadarChart mChart>
	//   17   35:invokevirtual   #140 <Method PointF RadarChart.getCenterOffsets()>
	//   18   38:astore          9
			int i = 0;
	//   19   40:iconst_0        
	//   20   41:istore          6
			while(i < list.size()) 
	//*  21   43:iload           6
	//*  22   45:aload           8
	//*  23   47:invokeinterface #185 <Method int List.size()>
	//*  24   52:icmpge          14
			{
				Object obj = ((Object) ((LimitLine)list.get(i)));
	//   25   55:aload           8
	//   26   57:iload           6
	//   27   59:invokeinterface #189 <Method Object List.get(int)>
	//   28   64:checkcast       #191 <Class LimitLine>
	//   29   67:astore          10
				if(((LimitLine) (obj)).isEnabled())
	//*  30   69:aload           10
	//*  31   71:invokevirtual   #192 <Method boolean LimitLine.isEnabled()>
	//*  32   74:ifne            86
	//*  33   77:iload           6
	//*  34   79:iconst_1        
	//*  35   80:iadd            
	//*  36   81:istore          6
	//*  37   83:goto            43
				{
					mLimitLinePaint.setColor(((LimitLine) (obj)).getLineColor());
	//   38   86:aload_0         
	//   39   87:getfield        #195 <Field Paint mLimitLinePaint>
	//   40   90:aload           10
	//   41   92:invokevirtual   #198 <Method int LimitLine.getLineColor()>
	//   42   95:invokevirtual   #134 <Method void Paint.setColor(int)>
					mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (((LimitLine) (obj)).getDashPathEffect())));
	//   43   98:aload_0         
	//   44   99:getfield        #195 <Field Paint mLimitLinePaint>
	//   45  102:aload           10
	//   46  104:invokevirtual   #202 <Method android.graphics.DashPathEffect LimitLine.getDashPathEffect()>
	//   47  107:invokevirtual   #206 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   48  110:pop             
					mLimitLinePaint.setStrokeWidth(((LimitLine) (obj)).getLineWidth());
	//   49  111:aload_0         
	//   50  112:getfield        #195 <Field Paint mLimitLinePaint>
	//   51  115:aload           10
	//   52  117:invokevirtual   #209 <Method float LimitLine.getLineWidth()>
	//   53  120:invokevirtual   #212 <Method void Paint.setStrokeWidth(float)>
					float f2 = ((LimitLine) (obj)).getLimit();
	//   54  123:aload           10
	//   55  125:invokevirtual   #215 <Method float LimitLine.getLimit()>
	//   56  128:fstore          4
					float f3 = mChart.getYChartMin();
	//   57  130:aload_0         
	//   58  131:getfield        #13  <Field RadarChart mChart>
	//   59  134:invokevirtual   #218 <Method float RadarChart.getYChartMin()>
	//   60  137:fstore          5
					obj = ((Object) (new Path()));
	//   61  139:new             #220 <Class Path>
	//   62  142:dup             
	//   63  143:invokespecial   #223 <Method void Path()>
	//   64  146:astore          10
					int j = 0;
	//   65  148:iconst_0        
	//   66  149:istore          7
					while(j < ((RadarData)mChart.getData()).getXValCount()) 
	//*  67  151:iload           7
	//*  68  153:aload_0         
	//*  69  154:getfield        #13  <Field RadarChart mChart>
	//*  70  157:invokevirtual   #227 <Method com.github.mikephil.charting.data.ChartData RadarChart.getData()>
	//*  71  160:checkcast       #229 <Class RadarData>
	//*  72  163:invokevirtual   #232 <Method int RadarData.getXValCount()>
	//*  73  166:icmpge          243
					{
						PointF pointf1 = Utils.getPosition(pointf, (f2 - f3) * f1, (float)j * f + mChart.getRotationAngle());
	//   74  169:aload           9
	//   75  171:fload           4
	//   76  173:fload           5
	//   77  175:fsub            
	//   78  176:fload_3         
	//   79  177:fmul            
	//   80  178:iload           7
	//   81  180:i2f             
	//   82  181:fload_2         
	//   83  182:fmul            
	//   84  183:aload_0         
	//   85  184:getfield        #13  <Field RadarChart mChart>
	//   86  187:invokevirtual   #149 <Method float RadarChart.getRotationAngle()>
	//   87  190:fadd            
	//   88  191:invokestatic    #153 <Method PointF Utils.getPosition(PointF, float, float)>
	//   89  194:astore          11
						if(j == 0)
	//*  90  196:iload           7
	//*  91  198:ifne            225
							((Path) (obj)).moveTo(pointf1.x, pointf1.y);
	//   92  201:aload           10
	//   93  203:aload           11
	//   94  205:getfield        #162 <Field float PointF.x>
	//   95  208:aload           11
	//   96  210:getfield        #166 <Field float PointF.y>
	//   97  213:invokevirtual   #235 <Method void Path.moveTo(float, float)>
						else
	//*  98  216:iload           7
	//*  99  218:iconst_1        
	//* 100  219:iadd            
	//* 101  220:istore          7
	//* 102  222:goto            151
							((Path) (obj)).lineTo(pointf1.x, pointf1.y);
	//  103  225:aload           10
	//  104  227:aload           11
	//  105  229:getfield        #162 <Field float PointF.x>
	//  106  232:aload           11
	//  107  234:getfield        #166 <Field float PointF.y>
	//  108  237:invokevirtual   #238 <Method void Path.lineTo(float, float)>
						j++;
					}
	//* 109  240:goto            216
					((Path) (obj)).close();
	//  110  243:aload           10
	//  111  245:invokevirtual   #241 <Method void Path.close()>
					canvas.drawPath(((Path) (obj)), mLimitLinePaint);
	//  112  248:aload_1         
	//  113  249:aload           10
	//  114  251:aload_0         
	//  115  252:getfield        #195 <Field Paint mLimitLinePaint>
	//  116  255:invokevirtual   #245 <Method void Canvas.drawPath(Path, Paint)>
				}
				i++;
			}
		}
	//* 117  258:goto            77
	}

	private RadarChart mChart;
}
