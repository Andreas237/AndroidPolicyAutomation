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
//			AxisRenderer

public class YAxisRenderer extends AxisRenderer
{

	public YAxisRenderer(ViewPortHandler viewporthandler, YAxis yaxis, Transformer transformer)
	{
		super(viewporthandler, transformer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #13  <Method void AxisRenderer(ViewPortHandler, Transformer)>
		mYAxis = yaxis;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #15  <Field YAxis mYAxis>
		mAxisLabelPaint.setColor(0xff000000);
	//    7   11:aload_0         
	//    8   12:getfield        #18  <Field Paint mAxisLabelPaint>
	//    9   15:ldc1            #19  <Int 0xff000000>
	//   10   17:invokevirtual   #25  <Method void Paint.setColor(int)>
		mAxisLabelPaint.setTextSize(Utils.convertDpToPixel(10F));
	//   11   20:aload_0         
	//   12   21:getfield        #18  <Field Paint mAxisLabelPaint>
	//   13   24:ldc1            #26  <Float 10F>
	//   14   26:invokestatic    #32  <Method float Utils.convertDpToPixel(float)>
	//   15   29:invokevirtual   #36  <Method void Paint.setTextSize(float)>
		mZeroLinePaint = new Paint(1);
	//   16   32:aload_0         
	//   17   33:new             #21  <Class Paint>
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:invokespecial   #38  <Method void Paint(int)>
	//   21   41:putfield        #40  <Field Paint mZeroLinePaint>
		mZeroLinePaint.setColor(0xff888888);
	//   22   44:aload_0         
	//   23   45:getfield        #40  <Field Paint mZeroLinePaint>
	//   24   48:ldc1            #41  <Int 0xff888888>
	//   25   50:invokevirtual   #25  <Method void Paint.setColor(int)>
		mZeroLinePaint.setStrokeWidth(1.0F);
	//   26   53:aload_0         
	//   27   54:getfield        #40  <Field Paint mZeroLinePaint>
	//   28   57:fconst_1        
	//   29   58:invokevirtual   #44  <Method void Paint.setStrokeWidth(float)>
		mZeroLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   30   61:aload_0         
	//   31   62:getfield        #40  <Field Paint mZeroLinePaint>
	//   32   65:getstatic       #50  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   33   68:invokevirtual   #54  <Method void Paint.setStyle(android.graphics.Paint$Style)>
	//   34   71:return          
	}

	public void computeAxis(float f, float f1)
	{
		float f2 = f;
	//    0    0:fload_1         
	//    1    1:fstore_3        
		float f3 = f1;
	//    2    2:fload_2         
	//    3    3:fstore          4
		if(mViewPortHandler.contentWidth() > 10F)
	//*   4    5:aload_0         
	//*   5    6:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//*   6    9:invokevirtual   #67  <Method float ViewPortHandler.contentWidth()>
	//*   7   12:ldc1            #26  <Float 10F>
	//*   8   14:fcmpl           
	//*   9   15:ifle            104
		{
			f2 = f;
	//   10   18:fload_1         
	//   11   19:fstore_3        
			f3 = f1;
	//   12   20:fload_2         
	//   13   21:fstore          4
			if(!mViewPortHandler.isFullyZoomedOutY())
	//*  14   23:aload_0         
	//*  15   24:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//*  16   27:invokevirtual   #71  <Method boolean ViewPortHandler.isFullyZoomedOutY()>
	//*  17   30:ifne            104
			{
				PointD pointd = mTrans.getValuesByTouchPoint(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop());
	//   18   33:aload_0         
	//   19   34:getfield        #75  <Field Transformer mTrans>
	//   20   37:aload_0         
	//   21   38:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   22   41:invokevirtual   #78  <Method float ViewPortHandler.contentLeft()>
	//   23   44:aload_0         
	//   24   45:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   25   48:invokevirtual   #81  <Method float ViewPortHandler.contentTop()>
	//   26   51:invokevirtual   #87  <Method PointD Transformer.getValuesByTouchPoint(float, float)>
	//   27   54:astore          5
				PointD pointd1 = mTrans.getValuesByTouchPoint(mViewPortHandler.contentLeft(), mViewPortHandler.contentBottom());
	//   28   56:aload_0         
	//   29   57:getfield        #75  <Field Transformer mTrans>
	//   30   60:aload_0         
	//   31   61:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   32   64:invokevirtual   #78  <Method float ViewPortHandler.contentLeft()>
	//   33   67:aload_0         
	//   34   68:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   35   71:invokevirtual   #90  <Method float ViewPortHandler.contentBottom()>
	//   36   74:invokevirtual   #87  <Method PointD Transformer.getValuesByTouchPoint(float, float)>
	//   37   77:astore          6
				if(!mYAxis.isInverted())
	//*  38   79:aload_0         
	//*  39   80:getfield        #15  <Field YAxis mYAxis>
	//*  40   83:invokevirtual   #95  <Method boolean YAxis.isInverted()>
	//*  41   86:ifne            112
				{
					f2 = (float)pointd1.y;
	//   42   89:aload           6
	//   43   91:getfield        #101 <Field double PointD.y>
	//   44   94:d2f             
	//   45   95:fstore_3        
					f3 = (float)pointd.y;
	//   46   96:aload           5
	//   47   98:getfield        #101 <Field double PointD.y>
	//   48  101:d2f             
	//   49  102:fstore          4
				} else
	//*  50  104:aload_0         
	//*  51  105:fload_3         
	//*  52  106:fload           4
	//*  53  108:invokevirtual   #104 <Method void computeAxisValues(float, float)>
	//*  54  111:return          
				{
					f2 = (float)pointd.y;
	//   55  112:aload           5
	//   56  114:getfield        #101 <Field double PointD.y>
	//   57  117:d2f             
	//   58  118:fstore_3        
					f3 = (float)pointd1.y;
	//   59  119:aload           6
	//   60  121:getfield        #101 <Field double PointD.y>
	//   61  124:d2f             
	//   62  125:fstore          4
				}
			}
		}
		computeAxisValues(f2, f3);
	//*  63  127:goto            104
	}

	protected void computeAxisValues(float f, float f1)
	{
		int k = mYAxis.getLabelCount();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field YAxis mYAxis>
	//    2    4:invokevirtual   #108 <Method int YAxis.getLabelCount()>
	//    3    7:istore          12
		double d3 = Math.abs(f1 - f);
	//    4    9:fload_2         
	//    5   10:fload_1         
	//    6   11:fsub            
	//    7   12:invokestatic    #113 <Method float Math.abs(float)>
	//    8   15:f2d             
	//    9   16:dstore          7
		if(k == 0 || d3 <= 0.0D)
	//*  10   18:iload           12
	//*  11   20:ifeq            30
	//*  12   23:dload           7
	//*  13   25:dconst_0        
	//*  14   26:dcmpg           
	//*  15   27:ifgt            49
		{
			mYAxis.mEntries = new float[0];
	//   16   30:aload_0         
	//   17   31:getfield        #15  <Field YAxis mYAxis>
	//   18   34:iconst_0        
	//   19   35:newarray        float[]
	//   20   37:putfield        #117 <Field float[] YAxis.mEntries>
			mYAxis.mEntryCount = 0;
	//   21   40:aload_0         
	//   22   41:getfield        #15  <Field YAxis mYAxis>
	//   23   44:iconst_0        
	//   24   45:putfield        #121 <Field int YAxis.mEntryCount>
			return;
	//   25   48:return          
		}
		double d = Utils.roundToNextSignificant(d3 / (double)k);
	//   26   49:dload           7
	//   27   51:iload           12
	//   28   53:i2d             
	//   29   54:ddiv            
	//   30   55:invokestatic    #125 <Method float Utils.roundToNextSignificant(double)>
	//   31   58:f2d             
	//   32   59:dstore_3        
		double d6 = Math.pow(10D, (int)Math.log10(d));
	//   33   60:ldc2w           #126 <Double 10D>
	//   34   63:dload_3         
	//   35   64:invokestatic    #131 <Method double Math.log10(double)>
	//   36   67:d2i             
	//   37   68:i2d             
	//   38   69:invokestatic    #135 <Method double Math.pow(double, double)>
	//   39   72:dstore          9
		double d2 = d;
	//   40   74:dload_3         
	//   41   75:dstore          5
		if((int)(d / d6) > 5)
	//*  42   77:dload_3         
	//*  43   78:dload           9
	//*  44   80:ddiv            
	//*  45   81:d2i             
	//*  46   82:iconst_5        
	//*  47   83:icmple          97
			d2 = Math.floor(10D * d6);
	//   48   86:ldc2w           #126 <Double 10D>
	//   49   89:dload           9
	//   50   91:dmul            
	//   51   92:invokestatic    #138 <Method double Math.floor(double)>
	//   52   95:dstore          5
		if(mYAxis.isForceLabelsEnabled())
	//*  53   97:aload_0         
	//*  54   98:getfield        #15  <Field YAxis mYAxis>
	//*  55  101:invokevirtual   #141 <Method boolean YAxis.isForceLabelsEnabled()>
	//*  56  104:ifeq            184
		{
			f1 = (float)d3 / (float)(k - 1);
	//   57  107:dload           7
	//   58  109:d2f             
	//   59  110:iload           12
	//   60  112:iconst_1        
	//   61  113:isub            
	//   62  114:i2f             
	//   63  115:fdiv            
	//   64  116:fstore_2        
			mYAxis.mEntryCount = k;
	//   65  117:aload_0         
	//   66  118:getfield        #15  <Field YAxis mYAxis>
	//   67  121:iload           12
	//   68  123:putfield        #121 <Field int YAxis.mEntryCount>
			if(mYAxis.mEntries.length < k)
	//*  69  126:aload_0         
	//*  70  127:getfield        #15  <Field YAxis mYAxis>
	//*  71  130:getfield        #117 <Field float[] YAxis.mEntries>
	//*  72  133:arraylength     
	//*  73  134:iload           12
	//*  74  136:icmpge          150
				mYAxis.mEntries = new float[k];
	//   75  139:aload_0         
	//   76  140:getfield        #15  <Field YAxis mYAxis>
	//   77  143:iload           12
	//   78  145:newarray        float[]
	//   79  147:putfield        #117 <Field float[] YAxis.mEntries>
			for(int i = 0; i < k; i++)
	//*  80  150:iconst_0        
	//*  81  151:istore          11
	//*  82  153:iload           11
	//*  83  155:iload           12
	//*  84  157:icmpge          232
			{
				mYAxis.mEntries[i] = f;
	//   85  160:aload_0         
	//   86  161:getfield        #15  <Field YAxis mYAxis>
	//   87  164:getfield        #117 <Field float[] YAxis.mEntries>
	//   88  167:iload           11
	//   89  169:fload_1         
	//   90  170:fastore         
				f += f1;
	//   91  171:fload_1         
	//   92  172:fload_2         
	//   93  173:fadd            
	//   94  174:fstore_1        
			}

	//   95  175:iload           11
	//   96  177:iconst_1        
	//   97  178:iadd            
	//   98  179:istore          11
		} else
	//*  99  181:goto            153
		if(mYAxis.isShowOnlyMinMaxEnabled())
	//* 100  184:aload_0         
	//* 101  185:getfield        #15  <Field YAxis mYAxis>
	//* 102  188:invokevirtual   #144 <Method boolean YAxis.isShowOnlyMinMaxEnabled()>
	//* 103  191:ifeq            257
		{
			mYAxis.mEntryCount = 2;
	//  104  194:aload_0         
	//  105  195:getfield        #15  <Field YAxis mYAxis>
	//  106  198:iconst_2        
	//  107  199:putfield        #121 <Field int YAxis.mEntryCount>
			mYAxis.mEntries = new float[2];
	//  108  202:aload_0         
	//  109  203:getfield        #15  <Field YAxis mYAxis>
	//  110  206:iconst_2        
	//  111  207:newarray        float[]
	//  112  209:putfield        #117 <Field float[] YAxis.mEntries>
			mYAxis.mEntries[0] = f;
	//  113  212:aload_0         
	//  114  213:getfield        #15  <Field YAxis mYAxis>
	//  115  216:getfield        #117 <Field float[] YAxis.mEntries>
	//  116  219:iconst_0        
	//  117  220:fload_1         
	//  118  221:fastore         
			mYAxis.mEntries[1] = f1;
	//  119  222:aload_0         
	//  120  223:getfield        #15  <Field YAxis mYAxis>
	//  121  226:getfield        #117 <Field float[] YAxis.mEntries>
	//  122  229:iconst_1        
	//  123  230:fload_2         
	//  124  231:fastore         
		} else
	//* 125  232:dload           5
	//* 126  234:dconst_1        
	//* 127  235:dcmpg           
	//* 128  236:ifge            398
	//* 129  239:aload_0         
	//* 130  240:getfield        #15  <Field YAxis mYAxis>
	//* 131  243:dload           5
	//* 132  245:invokestatic    #131 <Method double Math.log10(double)>
	//* 133  248:dneg            
	//* 134  249:invokestatic    #147 <Method double Math.ceil(double)>
	//* 135  252:d2i             
	//* 136  253:putfield        #150 <Field int YAxis.mDecimals>
	//* 137  256:return          
		{
			double d1 = Math.ceil((double)f / d2) * d2;
	//  138  257:fload_1         
	//  139  258:f2d             
	//  140  259:dload           5
	//  141  261:ddiv            
	//  142  262:invokestatic    #147 <Method double Math.ceil(double)>
	//  143  265:dload           5
	//  144  267:dmul            
	//  145  268:dstore_3        
			double d7 = Utils.nextUp(Math.floor((double)f1 / d2) * d2);
	//  146  269:fload_2         
	//  147  270:f2d             
	//  148  271:dload           5
	//  149  273:ddiv            
	//  150  274:invokestatic    #138 <Method double Math.floor(double)>
	//  151  277:dload           5
	//  152  279:dmul            
	//  153  280:invokestatic    #153 <Method double Utils.nextUp(double)>
	//  154  283:dstore          9
			int j = 0;
	//  155  285:iconst_0        
	//  156  286:istore          11
			for(double d4 = d1; d4 <= d7; d4 += d2)
	//* 157  288:dload_3         
	//* 158  289:dstore          7
	//* 159  291:dload           7
	//* 160  293:dload           9
	//* 161  295:dcmpg           
	//* 162  296:ifgt            315
				j++;
	//  163  299:iload           11
	//  164  301:iconst_1        
	//  165  302:iadd            
	//  166  303:istore          11

	//  167  305:dload           7
	//  168  307:dload           5
	//  169  309:dadd            
	//  170  310:dstore          7
	//* 171  312:goto            291
			mYAxis.mEntryCount = j;
	//  172  315:aload_0         
	//  173  316:getfield        #15  <Field YAxis mYAxis>
	//  174  319:iload           11
	//  175  321:putfield        #121 <Field int YAxis.mEntryCount>
			if(mYAxis.mEntries.length < j)
	//* 176  324:aload_0         
	//* 177  325:getfield        #15  <Field YAxis mYAxis>
	//* 178  328:getfield        #117 <Field float[] YAxis.mEntries>
	//* 179  331:arraylength     
	//* 180  332:iload           11
	//* 181  334:icmpge          348
				mYAxis.mEntries = new float[j];
	//  182  337:aload_0         
	//  183  338:getfield        #15  <Field YAxis mYAxis>
	//  184  341:iload           11
	//  185  343:newarray        float[]
	//  186  345:putfield        #117 <Field float[] YAxis.mEntries>
			int l = 0;
	//  187  348:iconst_0        
	//  188  349:istore          12
			while(l < j) 
	//* 189  351:iload           12
	//* 190  353:iload           11
	//* 191  355:icmpge          232
			{
				double d5 = d1;
	//  192  358:dload_3         
	//  193  359:dstore          7
				if(d1 == 0.0D)
	//* 194  361:dload_3         
	//* 195  362:dconst_0        
	//* 196  363:dcmpl           
	//* 197  364:ifne            370
					d5 = 0.0D;
	//  198  367:dconst_0        
	//  199  368:dstore          7
				mYAxis.mEntries[l] = (float)d5;
	//  200  370:aload_0         
	//  201  371:getfield        #15  <Field YAxis mYAxis>
	//  202  374:getfield        #117 <Field float[] YAxis.mEntries>
	//  203  377:iload           12
	//  204  379:dload           7
	//  205  381:d2f             
	//  206  382:fastore         
				d1 = d5 + d2;
	//  207  383:dload           7
	//  208  385:dload           5
	//  209  387:dadd            
	//  210  388:dstore_3        
				l++;
	//  211  389:iload           12
	//  212  391:iconst_1        
	//  213  392:iadd            
	//  214  393:istore          12
			}
		}
		if(d2 < 1.0D)
		{
			mYAxis.mDecimals = (int)Math.ceil(-Math.log10(d2));
			return;
		} else
	//* 215  395:goto            351
		{
			mYAxis.mDecimals = 0;
	//  216  398:aload_0         
	//  217  399:getfield        #15  <Field YAxis mYAxis>
	//  218  402:iconst_0        
	//  219  403:putfield        #150 <Field int YAxis.mDecimals>
			return;
	//  220  406:return          
		}
	}

	protected void drawYLabels(Canvas canvas, float f, float af[], float f1)
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		do
		{
			String s;
label0:
			{
				if(i < mYAxis.mEntryCount)
	//*   2    3:iload           5
	//*   3    5:aload_0         
	//*   4    6:getfield        #15  <Field YAxis mYAxis>
	//*   5    9:getfield        #121 <Field int YAxis.mEntryCount>
	//*   6   12:icmpge          50
				{
					s = mYAxis.getFormattedLabel(i);
	//    7   15:aload_0         
	//    8   16:getfield        #15  <Field YAxis mYAxis>
	//    9   19:iload           5
	//   10   21:invokevirtual   #159 <Method String YAxis.getFormattedLabel(int)>
	//   11   24:astore          6
					if(mYAxis.isDrawTopYLabelEntryEnabled() || i < mYAxis.mEntryCount - 1)
						break label0;
	//   12   26:aload_0         
	//   13   27:getfield        #15  <Field YAxis mYAxis>
	//   14   30:invokevirtual   #162 <Method boolean YAxis.isDrawTopYLabelEntryEnabled()>
	//   15   33:ifne            51
	//   16   36:iload           5
	//   17   38:aload_0         
	//   18   39:getfield        #15  <Field YAxis mYAxis>
	//   19   42:getfield        #121 <Field int YAxis.mEntryCount>
	//   20   45:iconst_1        
	//   21   46:isub            
	//   22   47:icmplt          51
				}
				return;
	//   23   50:return          
			}
			canvas.drawText(s, f, af[i * 2 + 1] + f1, mAxisLabelPaint);
	//   24   51:aload_1         
	//   25   52:aload           6
	//   26   54:fload_2         
	//   27   55:aload_3         
	//   28   56:iload           5
	//   29   58:iconst_2        
	//   30   59:imul            
	//   31   60:iconst_1        
	//   32   61:iadd            
	//   33   62:faload          
	//   34   63:fload           4
	//   35   65:fadd            
	//   36   66:aload_0         
	//   37   67:getfield        #18  <Field Paint mAxisLabelPaint>
	//   38   70:invokevirtual   #168 <Method void Canvas.drawText(String, float, float, Paint)>
			i++;
	//   39   73:iload           5
	//   40   75:iconst_1        
	//   41   76:iadd            
	//   42   77:istore          5
		} while(true);
	//   43   79:goto            3
	}

	protected void drawZeroLine(Canvas canvas, float f, float f1, float f2, float f3)
	{
		mZeroLinePaint.setColor(mYAxis.getZeroLineColor());
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Paint mZeroLinePaint>
	//    2    4:aload_0         
	//    3    5:getfield        #15  <Field YAxis mYAxis>
	//    4    8:invokevirtual   #173 <Method int YAxis.getZeroLineColor()>
	//    5   11:invokevirtual   #25  <Method void Paint.setColor(int)>
		mZeroLinePaint.setStrokeWidth(mYAxis.getZeroLineWidth());
	//    6   14:aload_0         
	//    7   15:getfield        #40  <Field Paint mZeroLinePaint>
	//    8   18:aload_0         
	//    9   19:getfield        #15  <Field YAxis mYAxis>
	//   10   22:invokevirtual   #176 <Method float YAxis.getZeroLineWidth()>
	//   11   25:invokevirtual   #44  <Method void Paint.setStrokeWidth(float)>
		Path path = new Path();
	//   12   28:new             #178 <Class Path>
	//   13   31:dup             
	//   14   32:invokespecial   #181 <Method void Path()>
	//   15   35:astore          6
		path.moveTo(f, f2);
	//   16   37:aload           6
	//   17   39:fload_2         
	//   18   40:fload           4
	//   19   42:invokevirtual   #184 <Method void Path.moveTo(float, float)>
		path.lineTo(f1, f3);
	//   20   45:aload           6
	//   21   47:fload_3         
	//   22   48:fload           5
	//   23   50:invokevirtual   #187 <Method void Path.lineTo(float, float)>
		canvas.drawPath(path, mZeroLinePaint);
	//   24   53:aload_1         
	//   25   54:aload           6
	//   26   56:aload_0         
	//   27   57:getfield        #40  <Field Paint mZeroLinePaint>
	//   28   60:invokevirtual   #191 <Method void Canvas.drawPath(Path, Paint)>
	//   29   63:return          
	}

	public void renderAxisLabels(Canvas canvas)
	{
		if(!mYAxis.isEnabled() || !mYAxis.isDrawLabelsEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field YAxis mYAxis>
	//*   2    4:invokevirtual   #196 <Method boolean YAxis.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #15  <Field YAxis mYAxis>
	//*   6   14:invokevirtual   #199 <Method boolean YAxis.isDrawLabelsEnabled()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		float af[] = new float[mYAxis.mEntryCount * 2];
	//    9   21:aload_0         
	//   10   22:getfield        #15  <Field YAxis mYAxis>
	//   11   25:getfield        #121 <Field int YAxis.mEntryCount>
	//   12   28:iconst_2        
	//   13   29:imul            
	//   14   30:newarray        float[]
	//   15   32:astore          6
		for(int i = 0; i < af.length; i += 2)
	//*  16   34:iconst_0        
	//*  17   35:istore          5
	//*  18   37:iload           5
	//*  19   39:aload           6
	//*  20   41:arraylength     
	//*  21   42:icmpge          73
			af[i + 1] = mYAxis.mEntries[i / 2];
	//   22   45:aload           6
	//   23   47:iload           5
	//   24   49:iconst_1        
	//   25   50:iadd            
	//   26   51:aload_0         
	//   27   52:getfield        #15  <Field YAxis mYAxis>
	//   28   55:getfield        #117 <Field float[] YAxis.mEntries>
	//   29   58:iload           5
	//   30   60:iconst_2        
	//   31   61:idiv            
	//   32   62:faload          
	//   33   63:fastore         

	//   34   64:iload           5
	//   35   66:iconst_2        
	//   36   67:iadd            
	//   37   68:istore          5
	//*  38   70:goto            37
		mTrans.pointValuesToPixel(af);
	//   39   73:aload_0         
	//   40   74:getfield        #75  <Field Transformer mTrans>
	//   41   77:aload           6
	//   42   79:invokevirtual   #203 <Method void Transformer.pointValuesToPixel(float[])>
		mAxisLabelPaint.setTypeface(mYAxis.getTypeface());
	//   43   82:aload_0         
	//   44   83:getfield        #18  <Field Paint mAxisLabelPaint>
	//   45   86:aload_0         
	//   46   87:getfield        #15  <Field YAxis mYAxis>
	//   47   90:invokevirtual   #207 <Method android.graphics.Typeface YAxis.getTypeface()>
	//   48   93:invokevirtual   #211 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//   49   96:pop             
		mAxisLabelPaint.setTextSize(mYAxis.getTextSize());
	//   50   97:aload_0         
	//   51   98:getfield        #18  <Field Paint mAxisLabelPaint>
	//   52  101:aload_0         
	//   53  102:getfield        #15  <Field YAxis mYAxis>
	//   54  105:invokevirtual   #214 <Method float YAxis.getTextSize()>
	//   55  108:invokevirtual   #36  <Method void Paint.setTextSize(float)>
		mAxisLabelPaint.setColor(mYAxis.getTextColor());
	//   56  111:aload_0         
	//   57  112:getfield        #18  <Field Paint mAxisLabelPaint>
	//   58  115:aload_0         
	//   59  116:getfield        #15  <Field YAxis mYAxis>
	//   60  119:invokevirtual   #217 <Method int YAxis.getTextColor()>
	//   61  122:invokevirtual   #25  <Method void Paint.setColor(int)>
		float f = mYAxis.getXOffset();
	//   62  125:aload_0         
	//   63  126:getfield        #15  <Field YAxis mYAxis>
	//   64  129:invokevirtual   #220 <Method float YAxis.getXOffset()>
	//   65  132:fstore_2        
		float f1 = (float)Utils.calcTextHeight(mAxisLabelPaint, "A") / 2.5F;
	//   66  133:aload_0         
	//   67  134:getfield        #18  <Field Paint mAxisLabelPaint>
	//   68  137:ldc1            #222 <String "A">
	//   69  139:invokestatic    #226 <Method int Utils.calcTextHeight(Paint, String)>
	//   70  142:i2f             
	//   71  143:ldc1            #227 <Float 2.5F>
	//   72  145:fdiv            
	//   73  146:fstore_3        
		float f2 = mYAxis.getYOffset();
	//   74  147:aload_0         
	//   75  148:getfield        #15  <Field YAxis mYAxis>
	//   76  151:invokevirtual   #230 <Method float YAxis.getYOffset()>
	//   77  154:fstore          4
		com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency = mYAxis.getAxisDependency();
	//   78  156:aload_0         
	//   79  157:getfield        #15  <Field YAxis mYAxis>
	//   80  160:invokevirtual   #234 <Method com.github.mikephil.charting.components.YAxis$AxisDependency YAxis.getAxisDependency()>
	//   81  163:astore          7
		com.github.mikephil.charting.components.YAxis.YAxisLabelPosition yaxislabelposition = mYAxis.getLabelPosition();
	//   82  165:aload_0         
	//   83  166:getfield        #15  <Field YAxis mYAxis>
	//   84  169:invokevirtual   #238 <Method com.github.mikephil.charting.components.YAxis$YAxisLabelPosition YAxis.getLabelPosition()>
	//   85  172:astore          8
		if(axisdependency == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  86  174:aload           7
	//*  87  176:getstatic       #244 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  88  179:if_acmpne       246
		{
			if(yaxislabelposition == com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART)
	//*  89  182:aload           8
	//*  90  184:getstatic       #250 <Field com.github.mikephil.charting.components.YAxis$YAxisLabelPosition com.github.mikephil.charting.components.YAxis$YAxisLabelPosition.OUTSIDE_CHART>
	//*  91  187:if_acmpne       223
			{
				mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//   92  190:aload_0         
	//   93  191:getfield        #18  <Field Paint mAxisLabelPaint>
	//   94  194:getstatic       #256 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//   95  197:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
				f = mViewPortHandler.offsetLeft() - f;
	//   96  200:aload_0         
	//   97  201:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   98  204:invokevirtual   #263 <Method float ViewPortHandler.offsetLeft()>
	//   99  207:fload_2         
	//  100  208:fsub            
	//  101  209:fstore_2        
			} else
	//* 102  210:aload_0         
	//* 103  211:aload_1         
	//* 104  212:fload_2         
	//* 105  213:aload           6
	//* 106  215:fload_3         
	//* 107  216:fload           4
	//* 108  218:fadd            
	//* 109  219:invokevirtual   #265 <Method void drawYLabels(Canvas, float, float[], float)>
	//* 110  222:return          
			{
				mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  111  223:aload_0         
	//  112  224:getfield        #18  <Field Paint mAxisLabelPaint>
	//  113  227:getstatic       #267 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  114  230:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
				f = mViewPortHandler.offsetLeft() + f;
	//  115  233:aload_0         
	//  116  234:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//  117  237:invokevirtual   #263 <Method float ViewPortHandler.offsetLeft()>
	//  118  240:fload_2         
	//  119  241:fadd            
	//  120  242:fstore_2        
			}
		} else
	//* 121  243:goto            210
		if(yaxislabelposition == com.github.mikephil.charting.components.YAxis.YAxisLabelPosition.OUTSIDE_CHART)
	//* 122  246:aload           8
	//* 123  248:getstatic       #250 <Field com.github.mikephil.charting.components.YAxis$YAxisLabelPosition com.github.mikephil.charting.components.YAxis$YAxisLabelPosition.OUTSIDE_CHART>
	//* 124  251:if_acmpne       277
		{
			mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  125  254:aload_0         
	//  126  255:getfield        #18  <Field Paint mAxisLabelPaint>
	//  127  258:getstatic       #267 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  128  261:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			f = mViewPortHandler.contentRight() + f;
	//  129  264:aload_0         
	//  130  265:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//  131  268:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//  132  271:fload_2         
	//  133  272:fadd            
	//  134  273:fstore_2        
		} else
	//* 135  274:goto            210
		{
			mAxisLabelPaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  136  277:aload_0         
	//  137  278:getfield        #18  <Field Paint mAxisLabelPaint>
	//  138  281:getstatic       #256 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  139  284:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
			f = mViewPortHandler.contentRight() - f;
	//  140  287:aload_0         
	//  141  288:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//  142  291:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//  143  294:fload_2         
	//  144  295:fsub            
	//  145  296:fstore_2        
		}
		drawYLabels(canvas, f, af, f1 + f2);
	//* 146  297:goto            210
	}

	public void renderAxisLine(Canvas canvas)
	{
		if(!mYAxis.isEnabled() || !mYAxis.isDrawAxisLineEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field YAxis mYAxis>
	//*   2    4:invokevirtual   #196 <Method boolean YAxis.isEnabled()>
	//*   3    7:ifeq            20
	//*   4   10:aload_0         
	//*   5   11:getfield        #15  <Field YAxis mYAxis>
	//*   6   14:invokevirtual   #274 <Method boolean YAxis.isDrawAxisLineEnabled()>
	//*   7   17:ifne            21
			return;
	//    8   20:return          
		mAxisLinePaint.setColor(mYAxis.getAxisLineColor());
	//    9   21:aload_0         
	//   10   22:getfield        #277 <Field Paint mAxisLinePaint>
	//   11   25:aload_0         
	//   12   26:getfield        #15  <Field YAxis mYAxis>
	//   13   29:invokevirtual   #280 <Method int YAxis.getAxisLineColor()>
	//   14   32:invokevirtual   #25  <Method void Paint.setColor(int)>
		mAxisLinePaint.setStrokeWidth(mYAxis.getAxisLineWidth());
	//   15   35:aload_0         
	//   16   36:getfield        #277 <Field Paint mAxisLinePaint>
	//   17   39:aload_0         
	//   18   40:getfield        #15  <Field YAxis mYAxis>
	//   19   43:invokevirtual   #283 <Method float YAxis.getAxisLineWidth()>
	//   20   46:invokevirtual   #44  <Method void Paint.setStrokeWidth(float)>
		if(mYAxis.getAxisDependency() == com.github.mikephil.charting.components.YAxis.AxisDependency.LEFT)
	//*  21   49:aload_0         
	//*  22   50:getfield        #15  <Field YAxis mYAxis>
	//*  23   53:invokevirtual   #234 <Method com.github.mikephil.charting.components.YAxis$AxisDependency YAxis.getAxisDependency()>
	//*  24   56:getstatic       #244 <Field com.github.mikephil.charting.components.YAxis$AxisDependency com.github.mikephil.charting.components.YAxis$AxisDependency.LEFT>
	//*  25   59:if_acmpne       99
		{
			canvas.drawLine(mViewPortHandler.contentLeft(), mViewPortHandler.contentTop(), mViewPortHandler.contentLeft(), mViewPortHandler.contentBottom(), mAxisLinePaint);
	//   26   62:aload_1         
	//   27   63:aload_0         
	//   28   64:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   29   67:invokevirtual   #78  <Method float ViewPortHandler.contentLeft()>
	//   30   70:aload_0         
	//   31   71:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   32   74:invokevirtual   #81  <Method float ViewPortHandler.contentTop()>
	//   33   77:aload_0         
	//   34   78:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   35   81:invokevirtual   #78  <Method float ViewPortHandler.contentLeft()>
	//   36   84:aload_0         
	//   37   85:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   38   88:invokevirtual   #90  <Method float ViewPortHandler.contentBottom()>
	//   39   91:aload_0         
	//   40   92:getfield        #277 <Field Paint mAxisLinePaint>
	//   41   95:invokevirtual   #287 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			return;
	//   42   98:return          
		} else
		{
			canvas.drawLine(mViewPortHandler.contentRight(), mViewPortHandler.contentTop(), mViewPortHandler.contentRight(), mViewPortHandler.contentBottom(), mAxisLinePaint);
	//   43   99:aload_1         
	//   44  100:aload_0         
	//   45  101:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   46  104:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//   47  107:aload_0         
	//   48  108:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   49  111:invokevirtual   #81  <Method float ViewPortHandler.contentTop()>
	//   50  114:aload_0         
	//   51  115:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   52  118:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//   53  121:aload_0         
	//   54  122:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   55  125:invokevirtual   #90  <Method float ViewPortHandler.contentBottom()>
	//   56  128:aload_0         
	//   57  129:getfield        #277 <Field Paint mAxisLinePaint>
	//   58  132:invokevirtual   #287 <Method void Canvas.drawLine(float, float, float, float, Paint)>
			return;
	//   59  135:return          
		}
	}

	public void renderGridLines(Canvas canvas)
	{
		if(mYAxis.isEnabled())
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field YAxis mYAxis>
	//*   2    4:invokevirtual   #196 <Method boolean YAxis.isEnabled()>
	//*   3    7:ifne            11
	//*   4   10:return          
		{
			float af[] = new float[2];
	//    5   11:iconst_2        
	//    6   12:newarray        float[]
	//    7   14:astore_3        
			if(mYAxis.isDrawGridLinesEnabled())
	//*   8   15:aload_0         
	//*   9   16:getfield        #15  <Field YAxis mYAxis>
	//*  10   19:invokevirtual   #291 <Method boolean YAxis.isDrawGridLinesEnabled()>
	//*  11   22:ifeq            162
			{
				mGridPaint.setColor(mYAxis.getGridColor());
	//   12   25:aload_0         
	//   13   26:getfield        #294 <Field Paint mGridPaint>
	//   14   29:aload_0         
	//   15   30:getfield        #15  <Field YAxis mYAxis>
	//   16   33:invokevirtual   #297 <Method int YAxis.getGridColor()>
	//   17   36:invokevirtual   #25  <Method void Paint.setColor(int)>
				mGridPaint.setStrokeWidth(mYAxis.getGridLineWidth());
	//   18   39:aload_0         
	//   19   40:getfield        #294 <Field Paint mGridPaint>
	//   20   43:aload_0         
	//   21   44:getfield        #15  <Field YAxis mYAxis>
	//   22   47:invokevirtual   #300 <Method float YAxis.getGridLineWidth()>
	//   23   50:invokevirtual   #44  <Method void Paint.setStrokeWidth(float)>
				mGridPaint.setPathEffect(((android.graphics.PathEffect) (mYAxis.getGridDashPathEffect())));
	//   24   53:aload_0         
	//   25   54:getfield        #294 <Field Paint mGridPaint>
	//   26   57:aload_0         
	//   27   58:getfield        #15  <Field YAxis mYAxis>
	//   28   61:invokevirtual   #304 <Method android.graphics.DashPathEffect YAxis.getGridDashPathEffect()>
	//   29   64:invokevirtual   #308 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   30   67:pop             
				Path path = new Path();
	//   31   68:new             #178 <Class Path>
	//   32   71:dup             
	//   33   72:invokespecial   #181 <Method void Path()>
	//   34   75:astore          4
				for(int i = 0; i < mYAxis.mEntryCount; i++)
	//*  35   77:iconst_0        
	//*  36   78:istore_2        
	//*  37   79:iload_2         
	//*  38   80:aload_0         
	//*  39   81:getfield        #15  <Field YAxis mYAxis>
	//*  40   84:getfield        #121 <Field int YAxis.mEntryCount>
	//*  41   87:icmpge          162
				{
					af[1] = mYAxis.mEntries[i];
	//   42   90:aload_3         
	//   43   91:iconst_1        
	//   44   92:aload_0         
	//   45   93:getfield        #15  <Field YAxis mYAxis>
	//   46   96:getfield        #117 <Field float[] YAxis.mEntries>
	//   47   99:iload_2         
	//   48  100:faload          
	//   49  101:fastore         
					mTrans.pointValuesToPixel(af);
	//   50  102:aload_0         
	//   51  103:getfield        #75  <Field Transformer mTrans>
	//   52  106:aload_3         
	//   53  107:invokevirtual   #203 <Method void Transformer.pointValuesToPixel(float[])>
					path.moveTo(mViewPortHandler.offsetLeft(), af[1]);
	//   54  110:aload           4
	//   55  112:aload_0         
	//   56  113:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   57  116:invokevirtual   #263 <Method float ViewPortHandler.offsetLeft()>
	//   58  119:aload_3         
	//   59  120:iconst_1        
	//   60  121:faload          
	//   61  122:invokevirtual   #184 <Method void Path.moveTo(float, float)>
					path.lineTo(mViewPortHandler.contentRight(), af[1]);
	//   62  125:aload           4
	//   63  127:aload_0         
	//   64  128:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   65  131:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//   66  134:aload_3         
	//   67  135:iconst_1        
	//   68  136:faload          
	//   69  137:invokevirtual   #187 <Method void Path.lineTo(float, float)>
					canvas.drawPath(path, mGridPaint);
	//   70  140:aload_1         
	//   71  141:aload           4
	//   72  143:aload_0         
	//   73  144:getfield        #294 <Field Paint mGridPaint>
	//   74  147:invokevirtual   #191 <Method void Canvas.drawPath(Path, Paint)>
					path.reset();
	//   75  150:aload           4
	//   76  152:invokevirtual   #311 <Method void Path.reset()>
				}

	//   77  155:iload_2         
	//   78  156:iconst_1        
	//   79  157:iadd            
	//   80  158:istore_2        
			}
	//*  81  159:goto            79
			if(mYAxis.isDrawZeroLineEnabled())
	//*  82  162:aload_0         
	//*  83  163:getfield        #15  <Field YAxis mYAxis>
	//*  84  166:invokevirtual   #314 <Method boolean YAxis.isDrawZeroLineEnabled()>
	//*  85  169:ifeq            10
			{
				af[1] = 0.0F;
	//   86  172:aload_3         
	//   87  173:iconst_1        
	//   88  174:fconst_0        
	//   89  175:fastore         
				mTrans.pointValuesToPixel(af);
	//   90  176:aload_0         
	//   91  177:getfield        #75  <Field Transformer mTrans>
	//   92  180:aload_3         
	//   93  181:invokevirtual   #203 <Method void Transformer.pointValuesToPixel(float[])>
				drawZeroLine(canvas, mViewPortHandler.offsetLeft(), mViewPortHandler.contentRight(), af[1] - 1.0F, af[1] - 1.0F);
	//   94  184:aload_0         
	//   95  185:aload_1         
	//   96  186:aload_0         
	//   97  187:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   98  190:invokevirtual   #263 <Method float ViewPortHandler.offsetLeft()>
	//   99  193:aload_0         
	//  100  194:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//  101  197:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//  102  200:aload_3         
	//  103  201:iconst_1        
	//  104  202:faload          
	//  105  203:fconst_1        
	//  106  204:fsub            
	//  107  205:aload_3         
	//  108  206:iconst_1        
	//  109  207:faload          
	//  110  208:fconst_1        
	//  111  209:fsub            
	//  112  210:invokevirtual   #316 <Method void drawZeroLine(Canvas, float, float, float, float)>
				return;
	//  113  213:return          
			}
		}
	}

	public void renderLimitLines(Canvas canvas)
	{
		List list = mYAxis.getLimitLines();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field YAxis mYAxis>
	//    2    4:invokevirtual   #321 <Method List YAxis.getLimitLines()>
	//    3    7:astore          6
		if(list != null && list.size() > 0)
	//*   4    9:aload           6
	//*   5   11:ifnull          24
	//*   6   14:aload           6
	//*   7   16:invokeinterface #326 <Method int List.size()>
	//*   8   21:ifgt            25
	//*   9   24:return          
		{
			float af[] = new float[2];
	//   10   25:iconst_2        
	//   11   26:newarray        float[]
	//   12   28:astore          7
			Path path = new Path();
	//   13   30:new             #178 <Class Path>
	//   14   33:dup             
	//   15   34:invokespecial   #181 <Method void Path()>
	//   16   37:astore          8
			int i = 0;
	//   17   39:iconst_0        
	//   18   40:istore          5
			while(i < list.size()) 
	//*  19   42:iload           5
	//*  20   44:aload           6
	//*  21   46:invokeinterface #326 <Method int List.size()>
	//*  22   51:icmpge          24
			{
				Object obj = ((Object) ((LimitLine)list.get(i)));
	//   23   54:aload           6
	//   24   56:iload           5
	//   25   58:invokeinterface #330 <Method Object List.get(int)>
	//   26   63:checkcast       #332 <Class LimitLine>
	//   27   66:astore          10
				if(((LimitLine) (obj)).isEnabled())
	//*  28   68:aload           10
	//*  29   70:invokevirtual   #333 <Method boolean LimitLine.isEnabled()>
	//*  30   73:ifne            85
	//*  31   76:iload           5
	//*  32   78:iconst_1        
	//*  33   79:iadd            
	//*  34   80:istore          5
	//*  35   82:goto            42
				{
					mLimitLinePaint.setStyle(android.graphics.Paint.Style.STROKE);
	//   36   85:aload_0         
	//   37   86:getfield        #336 <Field Paint mLimitLinePaint>
	//   38   89:getstatic       #50  <Field android.graphics.Paint$Style android.graphics.Paint$Style.STROKE>
	//   39   92:invokevirtual   #54  <Method void Paint.setStyle(android.graphics.Paint$Style)>
					mLimitLinePaint.setColor(((LimitLine) (obj)).getLineColor());
	//   40   95:aload_0         
	//   41   96:getfield        #336 <Field Paint mLimitLinePaint>
	//   42   99:aload           10
	//   43  101:invokevirtual   #339 <Method int LimitLine.getLineColor()>
	//   44  104:invokevirtual   #25  <Method void Paint.setColor(int)>
					mLimitLinePaint.setStrokeWidth(((LimitLine) (obj)).getLineWidth());
	//   45  107:aload_0         
	//   46  108:getfield        #336 <Field Paint mLimitLinePaint>
	//   47  111:aload           10
	//   48  113:invokevirtual   #342 <Method float LimitLine.getLineWidth()>
	//   49  116:invokevirtual   #44  <Method void Paint.setStrokeWidth(float)>
					mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (((LimitLine) (obj)).getDashPathEffect())));
	//   50  119:aload_0         
	//   51  120:getfield        #336 <Field Paint mLimitLinePaint>
	//   52  123:aload           10
	//   53  125:invokevirtual   #345 <Method android.graphics.DashPathEffect LimitLine.getDashPathEffect()>
	//   54  128:invokevirtual   #308 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//   55  131:pop             
					af[1] = ((LimitLine) (obj)).getLimit();
	//   56  132:aload           7
	//   57  134:iconst_1        
	//   58  135:aload           10
	//   59  137:invokevirtual   #348 <Method float LimitLine.getLimit()>
	//   60  140:fastore         
					mTrans.pointValuesToPixel(af);
	//   61  141:aload_0         
	//   62  142:getfield        #75  <Field Transformer mTrans>
	//   63  145:aload           7
	//   64  147:invokevirtual   #203 <Method void Transformer.pointValuesToPixel(float[])>
					path.moveTo(mViewPortHandler.contentLeft(), af[1]);
	//   65  150:aload           8
	//   66  152:aload_0         
	//   67  153:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   68  156:invokevirtual   #78  <Method float ViewPortHandler.contentLeft()>
	//   69  159:aload           7
	//   70  161:iconst_1        
	//   71  162:faload          
	//   72  163:invokevirtual   #184 <Method void Path.moveTo(float, float)>
					path.lineTo(mViewPortHandler.contentRight(), af[1]);
	//   73  166:aload           8
	//   74  168:aload_0         
	//   75  169:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//   76  172:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//   77  175:aload           7
	//   78  177:iconst_1        
	//   79  178:faload          
	//   80  179:invokevirtual   #187 <Method void Path.lineTo(float, float)>
					canvas.drawPath(path, mLimitLinePaint);
	//   81  182:aload_1         
	//   82  183:aload           8
	//   83  185:aload_0         
	//   84  186:getfield        #336 <Field Paint mLimitLinePaint>
	//   85  189:invokevirtual   #191 <Method void Canvas.drawPath(Path, Paint)>
					path.reset();
	//   86  192:aload           8
	//   87  194:invokevirtual   #311 <Method void Path.reset()>
					String s = ((LimitLine) (obj)).getLabel();
	//   88  197:aload           10
	//   89  199:invokevirtual   #352 <Method String LimitLine.getLabel()>
	//   90  202:astore          9
					if(s != null && !s.equals(""))
	//*  91  204:aload           9
	//*  92  206:ifnull          76
	//*  93  209:aload           9
	//*  94  211:ldc2            #354 <String "">
	//*  95  214:invokevirtual   #360 <Method boolean String.equals(Object)>
	//*  96  217:ifne            76
					{
						mLimitLinePaint.setStyle(((LimitLine) (obj)).getTextStyle());
	//   97  220:aload_0         
	//   98  221:getfield        #336 <Field Paint mLimitLinePaint>
	//   99  224:aload           10
	//  100  226:invokevirtual   #364 <Method android.graphics.Paint$Style LimitLine.getTextStyle()>
	//  101  229:invokevirtual   #54  <Method void Paint.setStyle(android.graphics.Paint$Style)>
						mLimitLinePaint.setPathEffect(((android.graphics.PathEffect) (null)));
	//  102  232:aload_0         
	//  103  233:getfield        #336 <Field Paint mLimitLinePaint>
	//  104  236:aconst_null     
	//  105  237:invokevirtual   #308 <Method android.graphics.PathEffect Paint.setPathEffect(android.graphics.PathEffect)>
	//  106  240:pop             
						mLimitLinePaint.setColor(((LimitLine) (obj)).getTextColor());
	//  107  241:aload_0         
	//  108  242:getfield        #336 <Field Paint mLimitLinePaint>
	//  109  245:aload           10
	//  110  247:invokevirtual   #365 <Method int LimitLine.getTextColor()>
	//  111  250:invokevirtual   #25  <Method void Paint.setColor(int)>
						mLimitLinePaint.setTypeface(((LimitLine) (obj)).getTypeface());
	//  112  253:aload_0         
	//  113  254:getfield        #336 <Field Paint mLimitLinePaint>
	//  114  257:aload           10
	//  115  259:invokevirtual   #366 <Method android.graphics.Typeface LimitLine.getTypeface()>
	//  116  262:invokevirtual   #211 <Method android.graphics.Typeface Paint.setTypeface(android.graphics.Typeface)>
	//  117  265:pop             
						mLimitLinePaint.setStrokeWidth(0.5F);
	//  118  266:aload_0         
	//  119  267:getfield        #336 <Field Paint mLimitLinePaint>
	//  120  270:ldc2            #367 <Float 0.5F>
	//  121  273:invokevirtual   #44  <Method void Paint.setStrokeWidth(float)>
						mLimitLinePaint.setTextSize(((LimitLine) (obj)).getTextSize());
	//  122  276:aload_0         
	//  123  277:getfield        #336 <Field Paint mLimitLinePaint>
	//  124  280:aload           10
	//  125  282:invokevirtual   #368 <Method float LimitLine.getTextSize()>
	//  126  285:invokevirtual   #36  <Method void Paint.setTextSize(float)>
						float f = Utils.calcTextHeight(mLimitLinePaint, s);
	//  127  288:aload_0         
	//  128  289:getfield        #336 <Field Paint mLimitLinePaint>
	//  129  292:aload           9
	//  130  294:invokestatic    #226 <Method int Utils.calcTextHeight(Paint, String)>
	//  131  297:i2f             
	//  132  298:fstore_2        
						float f1 = Utils.convertDpToPixel(4F) + ((LimitLine) (obj)).getXOffset();
	//  133  299:ldc2            #369 <Float 4F>
	//  134  302:invokestatic    #32  <Method float Utils.convertDpToPixel(float)>
	//  135  305:aload           10
	//  136  307:invokevirtual   #370 <Method float LimitLine.getXOffset()>
	//  137  310:fadd            
	//  138  311:fstore_3        
						float f2 = ((LimitLine) (obj)).getLineWidth() + f + ((LimitLine) (obj)).getYOffset();
	//  139  312:aload           10
	//  140  314:invokevirtual   #342 <Method float LimitLine.getLineWidth()>
	//  141  317:fload_2         
	//  142  318:fadd            
	//  143  319:aload           10
	//  144  321:invokevirtual   #371 <Method float LimitLine.getYOffset()>
	//  145  324:fadd            
	//  146  325:fstore          4
						obj = ((Object) (((LimitLine) (obj)).getLabelPosition()));
	//  147  327:aload           10
	//  148  329:invokevirtual   #374 <Method com.github.mikephil.charting.components.LimitLine$LimitLabelPosition LimitLine.getLabelPosition()>
	//  149  332:astore          10
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_TOP)
	//* 150  334:aload           10
	//* 151  336:getstatic       #380 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.RIGHT_TOP>
	//* 152  339:if_acmpne       383
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  153  342:aload_0         
	//  154  343:getfield        #336 <Field Paint mLimitLinePaint>
	//  155  346:getstatic       #256 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  156  349:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, mViewPortHandler.contentRight() - f1, (af[1] - f2) + f, mLimitLinePaint);
	//  157  352:aload_1         
	//  158  353:aload           9
	//  159  355:aload_0         
	//  160  356:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//  161  359:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//  162  362:fload_3         
	//  163  363:fsub            
	//  164  364:aload           7
	//  165  366:iconst_1        
	//  166  367:faload          
	//  167  368:fload           4
	//  168  370:fsub            
	//  169  371:fload_2         
	//  170  372:fadd            
	//  171  373:aload_0         
	//  172  374:getfield        #336 <Field Paint mLimitLinePaint>
	//  173  377:invokevirtual   #168 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 174  380:goto            76
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.RIGHT_BOTTOM)
	//* 175  383:aload           10
	//* 176  385:getstatic       #383 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.RIGHT_BOTTOM>
	//* 177  388:if_acmpne       430
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.RIGHT);
	//  178  391:aload_0         
	//  179  392:getfield        #336 <Field Paint mLimitLinePaint>
	//  180  395:getstatic       #256 <Field android.graphics.Paint$Align android.graphics.Paint$Align.RIGHT>
	//  181  398:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, mViewPortHandler.contentRight() - f1, af[1] + f2, mLimitLinePaint);
	//  182  401:aload_1         
	//  183  402:aload           9
	//  184  404:aload_0         
	//  185  405:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//  186  408:invokevirtual   #270 <Method float ViewPortHandler.contentRight()>
	//  187  411:fload_3         
	//  188  412:fsub            
	//  189  413:aload           7
	//  190  415:iconst_1        
	//  191  416:faload          
	//  192  417:fload           4
	//  193  419:fadd            
	//  194  420:aload_0         
	//  195  421:getfield        #336 <Field Paint mLimitLinePaint>
	//  196  424:invokevirtual   #168 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 197  427:goto            76
						if(obj == com.github.mikephil.charting.components.LimitLine.LimitLabelPosition.LEFT_TOP)
	//* 198  430:aload           10
	//* 199  432:getstatic       #386 <Field com.github.mikephil.charting.components.LimitLine$LimitLabelPosition com.github.mikephil.charting.components.LimitLine$LimitLabelPosition.LEFT_TOP>
	//* 200  435:if_acmpne       479
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  201  438:aload_0         
	//  202  439:getfield        #336 <Field Paint mLimitLinePaint>
	//  203  442:getstatic       #267 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  204  445:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, mViewPortHandler.contentLeft() + f1, (af[1] - f2) + f, mLimitLinePaint);
	//  205  448:aload_1         
	//  206  449:aload           9
	//  207  451:aload_0         
	//  208  452:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//  209  455:invokevirtual   #78  <Method float ViewPortHandler.contentLeft()>
	//  210  458:fload_3         
	//  211  459:fadd            
	//  212  460:aload           7
	//  213  462:iconst_1        
	//  214  463:faload          
	//  215  464:fload           4
	//  216  466:fsub            
	//  217  467:fload_2         
	//  218  468:fadd            
	//  219  469:aload_0         
	//  220  470:getfield        #336 <Field Paint mLimitLinePaint>
	//  221  473:invokevirtual   #168 <Method void Canvas.drawText(String, float, float, Paint)>
						} else
	//* 222  476:goto            76
						{
							mLimitLinePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//  223  479:aload_0         
	//  224  480:getfield        #336 <Field Paint mLimitLinePaint>
	//  225  483:getstatic       #267 <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//  226  486:invokevirtual   #260 <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
							canvas.drawText(s, mViewPortHandler.offsetLeft() + f1, af[1] + f2, mLimitLinePaint);
	//  227  489:aload_1         
	//  228  490:aload           9
	//  229  492:aload_0         
	//  230  493:getfield        #61  <Field ViewPortHandler mViewPortHandler>
	//  231  496:invokevirtual   #263 <Method float ViewPortHandler.offsetLeft()>
	//  232  499:fload_3         
	//  233  500:fadd            
	//  234  501:aload           7
	//  235  503:iconst_1        
	//  236  504:faload          
	//  237  505:fload           4
	//  238  507:fadd            
	//  239  508:aload_0         
	//  240  509:getfield        #336 <Field Paint mLimitLinePaint>
	//  241  512:invokevirtual   #168 <Method void Canvas.drawText(String, float, float, Paint)>
						}
					}
				}
				i++;
			}
		}
	//* 242  515:goto            76
	}

	protected YAxis mYAxis;
	protected Paint mZeroLinePaint;
}
