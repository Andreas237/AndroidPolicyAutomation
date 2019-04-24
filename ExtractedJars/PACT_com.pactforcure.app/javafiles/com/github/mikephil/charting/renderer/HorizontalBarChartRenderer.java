// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.renderer;

import android.graphics.*;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.buffer.BarBuffer;
import com.github.mikephil.charting.buffer.HorizontalBarBuffer;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.ValueFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.BarDataProvider;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.*;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.renderer:
//			BarChartRenderer

public class HorizontalBarChartRenderer extends BarChartRenderer
{

	public HorizontalBarChartRenderer(BarDataProvider bardataprovider, ChartAnimator chartanimator, ViewPortHandler viewporthandler)
	{
		super(bardataprovider, chartanimator, viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #8   <Method void BarChartRenderer(BarDataProvider, ChartAnimator, ViewPortHandler)>
		mValuePaint.setTextAlign(android.graphics.Paint.Align.LEFT);
	//    5    7:aload_0         
	//    6    8:getfield        #12  <Field Paint mValuePaint>
	//    7   11:getstatic       #18  <Field android.graphics.Paint$Align android.graphics.Paint$Align.LEFT>
	//    8   14:invokevirtual   #24  <Method void Paint.setTextAlign(android.graphics.Paint$Align)>
	//    9   17:return          
	}

	protected void drawDataSet(Canvas canvas, IBarDataSet ibardataset, int i)
	{
		BarBuffer barbuffer;
		Transformer transformer = mChart.getTransformer(ibardataset.getAxisDependency());
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field BarDataProvider mChart>
	//    2    4:aload_2         
	//    3    5:invokeinterface #37  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//    4   10:invokeinterface #43  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//    5   15:astore          6
		mShadowPaint.setColor(ibardataset.getBarShadowColor());
	//    6   17:aload_0         
	//    7   18:getfield        #46  <Field Paint mShadowPaint>
	//    8   21:aload_2         
	//    9   22:invokeinterface #50  <Method int IBarDataSet.getBarShadowColor()>
	//   10   27:invokevirtual   #54  <Method void Paint.setColor(int)>
		float f = mAnimator.getPhaseX();
	//   11   30:aload_0         
	//   12   31:getfield        #58  <Field ChartAnimator mAnimator>
	//   13   34:invokevirtual   #64  <Method float ChartAnimator.getPhaseX()>
	//   14   37:fstore          4
		float f1 = mAnimator.getPhaseY();
	//   15   39:aload_0         
	//   16   40:getfield        #58  <Field ChartAnimator mAnimator>
	//   17   43:invokevirtual   #67  <Method float ChartAnimator.getPhaseY()>
	//   18   46:fstore          5
		barbuffer = mBarBuffers[i];
	//   19   48:aload_0         
	//   20   49:getfield        #71  <Field BarBuffer[] mBarBuffers>
	//   21   52:iload_3         
	//   22   53:aaload          
	//   23   54:astore          7
		barbuffer.setPhases(f, f1);
	//   24   56:aload           7
	//   25   58:fload           4
	//   26   60:fload           5
	//   27   62:invokevirtual   #77  <Method void BarBuffer.setPhases(float, float)>
		barbuffer.setBarSpace(ibardataset.getBarSpace());
	//   28   65:aload           7
	//   29   67:aload_2         
	//   30   68:invokeinterface #80  <Method float IBarDataSet.getBarSpace()>
	//   31   73:invokevirtual   #84  <Method void BarBuffer.setBarSpace(float)>
		barbuffer.setDataSet(i);
	//   32   76:aload           7
	//   33   78:iload_3         
	//   34   79:invokevirtual   #87  <Method void BarBuffer.setDataSet(int)>
		barbuffer.setInverted(mChart.isInverted(ibardataset.getAxisDependency()));
	//   35   82:aload           7
	//   36   84:aload_0         
	//   37   85:getfield        #31  <Field BarDataProvider mChart>
	//   38   88:aload_2         
	//   39   89:invokeinterface #37  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//   40   94:invokeinterface #91  <Method boolean BarDataProvider.isInverted(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   41   99:invokevirtual   #95  <Method void BarBuffer.setInverted(boolean)>
		barbuffer.feed(ibardataset);
	//   42  102:aload           7
	//   43  104:aload_2         
	//   44  105:invokevirtual   #99  <Method void BarBuffer.feed(IBarDataSet)>
		transformer.pointValuesToPixel(barbuffer.buffer);
	//   45  108:aload           6
	//   46  110:aload           7
	//   47  112:getfield        #103 <Field float[] BarBuffer.buffer>
	//   48  115:invokevirtual   #109 <Method void Transformer.pointValuesToPixel(float[])>
		i = 0;
	//   49  118:iconst_0        
	//   50  119:istore_3        
_L2:
		if(i >= barbuffer.size() || !mViewPortHandler.isInBoundsTop(barbuffer.buffer[i + 3]))
	//*  51  120:iload_3         
	//*  52  121:aload           7
	//*  53  123:invokevirtual   #112 <Method int BarBuffer.size()>
	//*  54  126:icmpge          148
	//*  55  129:aload_0         
	//*  56  130:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//*  57  133:aload           7
	//*  58  135:getfield        #103 <Field float[] BarBuffer.buffer>
	//*  59  138:iload_3         
	//*  60  139:iconst_3        
	//*  61  140:iadd            
	//*  62  141:faload          
	//*  63  142:invokevirtual   #122 <Method boolean ViewPortHandler.isInBoundsTop(float)>
	//*  64  145:ifne            149
			return;
	//   65  148:return          
		if(mViewPortHandler.isInBoundsBottom(barbuffer.buffer[i + 1]))
			break; /* Loop/switch isn't completed */
	//   66  149:aload_0         
	//   67  150:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//   68  153:aload           7
	//   69  155:getfield        #103 <Field float[] BarBuffer.buffer>
	//   70  158:iload_3         
	//   71  159:iconst_1        
	//   72  160:iadd            
	//   73  161:faload          
	//   74  162:invokevirtual   #125 <Method boolean ViewPortHandler.isInBoundsBottom(float)>
	//   75  165:ifne            175
_L3:
		i += 4;
	//   76  168:iload_3         
	//   77  169:iconst_4        
	//   78  170:iadd            
	//   79  171:istore_3        
		if(true) goto _L2; else goto _L1
	//   80  172:goto            120
_L1:
		if(mChart.isDrawBarShadowEnabled())
	//*  81  175:aload_0         
	//*  82  176:getfield        #31  <Field BarDataProvider mChart>
	//*  83  179:invokeinterface #129 <Method boolean BarDataProvider.isDrawBarShadowEnabled()>
	//*  84  184:ifeq            227
			canvas.drawRect(mViewPortHandler.contentLeft(), barbuffer.buffer[i + 1], mViewPortHandler.contentRight(), barbuffer.buffer[i + 3], mShadowPaint);
	//   85  187:aload_1         
	//   86  188:aload_0         
	//   87  189:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//   88  192:invokevirtual   #132 <Method float ViewPortHandler.contentLeft()>
	//   89  195:aload           7
	//   90  197:getfield        #103 <Field float[] BarBuffer.buffer>
	//   91  200:iload_3         
	//   92  201:iconst_1        
	//   93  202:iadd            
	//   94  203:faload          
	//   95  204:aload_0         
	//   96  205:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//   97  208:invokevirtual   #135 <Method float ViewPortHandler.contentRight()>
	//   98  211:aload           7
	//   99  213:getfield        #103 <Field float[] BarBuffer.buffer>
	//  100  216:iload_3         
	//  101  217:iconst_3        
	//  102  218:iadd            
	//  103  219:faload          
	//  104  220:aload_0         
	//  105  221:getfield        #46  <Field Paint mShadowPaint>
	//  106  224:invokevirtual   #141 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		mRenderPaint.setColor(ibardataset.getColor(i / 4));
	//  107  227:aload_0         
	//  108  228:getfield        #144 <Field Paint mRenderPaint>
	//  109  231:aload_2         
	//  110  232:iload_3         
	//  111  233:iconst_4        
	//  112  234:idiv            
	//  113  235:invokeinterface #148 <Method int IBarDataSet.getColor(int)>
	//  114  240:invokevirtual   #54  <Method void Paint.setColor(int)>
		canvas.drawRect(barbuffer.buffer[i], barbuffer.buffer[i + 1], barbuffer.buffer[i + 2], barbuffer.buffer[i + 3], mRenderPaint);
	//  115  243:aload_1         
	//  116  244:aload           7
	//  117  246:getfield        #103 <Field float[] BarBuffer.buffer>
	//  118  249:iload_3         
	//  119  250:faload          
	//  120  251:aload           7
	//  121  253:getfield        #103 <Field float[] BarBuffer.buffer>
	//  122  256:iload_3         
	//  123  257:iconst_1        
	//  124  258:iadd            
	//  125  259:faload          
	//  126  260:aload           7
	//  127  262:getfield        #103 <Field float[] BarBuffer.buffer>
	//  128  265:iload_3         
	//  129  266:iconst_2        
	//  130  267:iadd            
	//  131  268:faload          
	//  132  269:aload           7
	//  133  271:getfield        #103 <Field float[] BarBuffer.buffer>
	//  134  274:iload_3         
	//  135  275:iconst_3        
	//  136  276:iadd            
	//  137  277:faload          
	//  138  278:aload_0         
	//  139  279:getfield        #144 <Field Paint mRenderPaint>
	//  140  282:invokevirtual   #141 <Method void Canvas.drawRect(float, float, float, float, Paint)>
		  goto _L3
		if(true) goto _L2; else goto _L4
_L4:
	//* 141  285:goto            168
	}

	protected void drawValue(Canvas canvas, String s, float f, float f1, int i)
	{
		mValuePaint.setColor(i);
	//    0    0:aload_0         
	//    1    1:getfield        #12  <Field Paint mValuePaint>
	//    2    4:iload           5
	//    3    6:invokevirtual   #54  <Method void Paint.setColor(int)>
		canvas.drawText(s, f, f1, mValuePaint);
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:fload_3         
	//    7   12:fload           4
	//    8   14:aload_0         
	//    9   15:getfield        #12  <Field Paint mValuePaint>
	//   10   18:invokevirtual   #154 <Method void Canvas.drawText(String, float, float, Paint)>
	//   11   21:return          
	}

	public void drawValues(Canvas canvas)
	{
		float f;
		int i;
		boolean flag;
		List list;
		if(!passesCheck())
			break MISSING_BLOCK_LABEL_1024;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method boolean passesCheck()>
	//    2    4:ifeq            1024
		list = mChart.getBarData().getDataSets();
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field BarDataProvider mChart>
	//    5   11:invokeinterface #163 <Method BarData BarDataProvider.getBarData()>
	//    6   16:invokevirtual   #169 <Method List BarData.getDataSets()>
	//    7   19:astore          16
		f = Utils.convertDpToPixel(5F);
	//    8   21:ldc1            #170 <Float 5F>
	//    9   23:invokestatic    #176 <Method float Utils.convertDpToPixel(float)>
	//   10   26:fstore_2        
		flag = mChart.isDrawValueAboveBarEnabled();
	//   11   27:aload_0         
	//   12   28:getfield        #31  <Field BarDataProvider mChart>
	//   13   31:invokeinterface #179 <Method boolean BarDataProvider.isDrawValueAboveBarEnabled()>
	//   14   36:istore          14
		i = 0;
	//   15   38:iconst_0        
	//   16   39:istore          10
_L2:
		IBarDataSet ibardataset;
		if(i >= mChart.getBarData().getDataSetCount())
			break MISSING_BLOCK_LABEL_1024;
	//   17   41:iload           10
	//   18   43:aload_0         
	//   19   44:getfield        #31  <Field BarDataProvider mChart>
	//   20   47:invokeinterface #163 <Method BarData BarDataProvider.getBarData()>
	//   21   52:invokevirtual   #182 <Method int BarData.getDataSetCount()>
	//   22   55:icmpge          1024
		ibardataset = (IBarDataSet)list.get(i);
	//   23   58:aload           16
	//   24   60:iload           10
	//   25   62:invokeinterface #188 <Method Object List.get(int)>
	//   26   67:checkcast       #33  <Class IBarDataSet>
	//   27   70:astore          17
		if(ibardataset.isDrawValuesEnabled() && ibardataset.getEntryCount() != 0)
			break; /* Loop/switch isn't completed */
	//   28   72:aload           17
	//   29   74:invokeinterface #191 <Method boolean IBarDataSet.isDrawValuesEnabled()>
	//   30   79:ifeq            92
	//   31   82:aload           17
	//   32   84:invokeinterface #194 <Method int IBarDataSet.getEntryCount()>
	//   33   89:ifne            101
_L3:
		i++;
	//   34   92:iload           10
	//   35   94:iconst_1        
	//   36   95:iadd            
	//   37   96:istore          10
		if(true) goto _L2; else goto _L1
	//   38   98:goto            41
_L1:
		float f17;
		boolean flag1;
		ValueFormatter valueformatter;
		float af[];
		Object obj;
label0:
		{
			flag1 = mChart.isInverted(ibardataset.getAxisDependency());
	//   39  101:aload_0         
	//   40  102:getfield        #31  <Field BarDataProvider mChart>
	//   41  105:aload           17
	//   42  107:invokeinterface #37  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//   43  112:invokeinterface #91  <Method boolean BarDataProvider.isInverted(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   44  117:istore          15
			applyValueTextStyle(((com.github.mikephil.charting.interfaces.datasets.IDataSet) (ibardataset)));
	//   45  119:aload_0         
	//   46  120:aload           17
	//   47  122:invokevirtual   #198 <Method void applyValueTextStyle(com.github.mikephil.charting.interfaces.datasets.IDataSet)>
			f17 = (float)Utils.calcTextHeight(mValuePaint, "10") / 2.0F;
	//   48  125:aload_0         
	//   49  126:getfield        #12  <Field Paint mValuePaint>
	//   50  129:ldc1            #200 <String "10">
	//   51  131:invokestatic    #204 <Method int Utils.calcTextHeight(Paint, String)>
	//   52  134:i2f             
	//   53  135:fconst_2        
	//   54  136:fdiv            
	//   55  137:fstore          7
			valueformatter = ibardataset.getValueFormatter();
	//   56  139:aload           17
	//   57  141:invokeinterface #208 <Method ValueFormatter IBarDataSet.getValueFormatter()>
	//   58  146:astore          18
			obj = ((Object) (mChart.getTransformer(ibardataset.getAxisDependency())));
	//   59  148:aload_0         
	//   60  149:getfield        #31  <Field BarDataProvider mChart>
	//   61  152:aload           17
	//   62  154:invokeinterface #37  <Method com.github.mikephil.charting.components.YAxis$AxisDependency IBarDataSet.getAxisDependency()>
	//   63  159:invokeinterface #43  <Method Transformer BarDataProvider.getTransformer(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   64  164:astore          20
			af = getTransformedValues(((Transformer) (obj)), ibardataset, i);
	//   65  166:aload_0         
	//   66  167:aload           20
	//   67  169:aload           17
	//   68  171:iload           10
	//   69  173:invokevirtual   #212 <Method float[] getTransformedValues(Transformer, IBarDataSet, int)>
	//   70  176:astore          19
			if(ibardataset.isStacked())
				break label0;
	//   71  178:aload           17
	//   72  180:invokeinterface #215 <Method boolean IBarDataSet.isStacked()>
	//   73  185:ifne            438
			int j = 0;
	//   74  188:iconst_0        
	//   75  189:istore          11
			while((float)j < (float)af.length * mAnimator.getPhaseX() && mViewPortHandler.isInBoundsTop(af[j + 1])) 
	//*  76  191:iload           11
	//*  77  193:i2f             
	//*  78  194:aload           19
	//*  79  196:arraylength     
	//*  80  197:i2f             
	//*  81  198:aload_0         
	//*  82  199:getfield        #58  <Field ChartAnimator mAnimator>
	//*  83  202:invokevirtual   #64  <Method float ChartAnimator.getPhaseX()>
	//*  84  205:fmul            
	//*  85  206:fcmpg           
	//*  86  207:ifge            92
	//*  87  210:aload_0         
	//*  88  211:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//*  89  214:aload           19
	//*  90  216:iload           11
	//*  91  218:iconst_1        
	//*  92  219:iadd            
	//*  93  220:faload          
	//*  94  221:invokevirtual   #122 <Method boolean ViewPortHandler.isInBoundsTop(float)>
	//*  95  224:ifeq            92
			{
				if(mViewPortHandler.isInBoundsX(af[j]) && mViewPortHandler.isInBoundsBottom(af[j + 1]))
	//*  96  227:aload_0         
	//*  97  228:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//*  98  231:aload           19
	//*  99  233:iload           11
	//* 100  235:faload          
	//* 101  236:invokevirtual   #218 <Method boolean ViewPortHandler.isInBoundsX(float)>
	//* 102  239:ifne            251
	//* 103  242:iload           11
	//* 104  244:iconst_2        
	//* 105  245:iadd            
	//* 106  246:istore          11
	//* 107  248:goto            191
	//* 108  251:aload_0         
	//* 109  252:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//* 110  255:aload           19
	//* 111  257:iload           11
	//* 112  259:iconst_1        
	//* 113  260:iadd            
	//* 114  261:faload          
	//* 115  262:invokevirtual   #125 <Method boolean ViewPortHandler.isInBoundsBottom(float)>
	//* 116  265:ifeq            242
				{
					obj = ((Object) ((BarEntry)ibardataset.getEntryForIndex(j / 2)));
	//  117  268:aload           17
	//  118  270:iload           11
	//  119  272:iconst_2        
	//  120  273:idiv            
	//  121  274:invokeinterface #222 <Method com.github.mikephil.charting.data.Entry IBarDataSet.getEntryForIndex(int)>
	//  122  279:checkcast       #224 <Class BarEntry>
	//  123  282:astore          20
					float f18 = ((BarEntry) (obj)).getVal();
	//  124  284:aload           20
	//  125  286:invokevirtual   #227 <Method float BarEntry.getVal()>
	//  126  289:fstore          8
					obj = ((Object) (valueformatter.getFormattedValue(f18, ((com.github.mikephil.charting.data.Entry) (obj)), i, mViewPortHandler)));
	//  127  291:aload           18
	//  128  293:fload           8
	//  129  295:aload           20
	//  130  297:iload           10
	//  131  299:aload_0         
	//  132  300:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//  133  303:invokeinterface #233 <Method String ValueFormatter.getFormattedValue(float, com.github.mikephil.charting.data.Entry, int, ViewPortHandler)>
	//  134  308:astore          20
					float f21 = Utils.calcTextWidth(mValuePaint, ((String) (obj)));
	//  135  310:aload_0         
	//  136  311:getfield        #12  <Field Paint mValuePaint>
	//  137  314:aload           20
	//  138  316:invokestatic    #236 <Method int Utils.calcTextWidth(Paint, String)>
	//  139  319:i2f             
	//  140  320:fstore          9
					float f1;
					float f5;
					float f9;
					float f13;
					if(flag)
	//* 141  322:iload           14
	//* 142  324:ifeq            416
						f1 = f;
	//  143  327:fload_2         
	//  144  328:fstore_3        
					else
	//* 145  329:iload           14
	//* 146  331:ifeq            425
	//* 147  334:fload           9
	//* 148  336:fload_2         
	//* 149  337:fadd            
	//* 150  338:fneg            
	//* 151  339:fstore          5
	//* 152  341:fload           5
	//* 153  343:fstore          6
	//* 154  345:fload_3         
	//* 155  346:fstore          4
	//* 156  348:iload           15
	//* 157  350:ifeq            368
	//* 158  353:fload_3         
	//* 159  354:fneg            
	//* 160  355:fload           9
	//* 161  357:fsub            
	//* 162  358:fstore          4
	//* 163  360:fload           5
	//* 164  362:fneg            
	//* 165  363:fload           9
	//* 166  365:fsub            
	//* 167  366:fstore          6
	//* 168  368:aload           19
	//* 169  370:iload           11
	//* 170  372:faload          
	//* 171  373:fstore_3        
	//* 172  374:fload           8
	//* 173  376:fconst_0        
	//* 174  377:fcmpl           
	//* 175  378:iflt            431
	//* 176  381:aload_0         
	//* 177  382:aload_1         
	//* 178  383:aload           20
	//* 179  385:fload_3         
	//* 180  386:fload           4
	//* 181  388:fadd            
	//* 182  389:aload           19
	//* 183  391:iload           11
	//* 184  393:iconst_1        
	//* 185  394:iadd            
	//* 186  395:faload          
	//* 187  396:fload           7
	//* 188  398:fadd            
	//* 189  399:aload           17
	//* 190  401:iload           11
	//* 191  403:iconst_2        
	//* 192  404:idiv            
	//* 193  405:invokeinterface #239 <Method int IBarDataSet.getValueTextColor(int)>
	//* 194  410:invokevirtual   #241 <Method void drawValue(Canvas, String, float, float, int)>
	//* 195  413:goto            242
						f1 = -(f21 + f);
	//  196  416:fload           9
	//  197  418:fload_2         
	//  198  419:fadd            
	//  199  420:fneg            
	//  200  421:fstore_3        
					if(flag)
						f9 = -(f21 + f);
					else
	//* 201  422:goto            329
						f9 = f;
	//  202  425:fload_2         
	//  203  426:fstore          5
					f13 = f9;
					f5 = f1;
					if(flag1)
					{
						f5 = -f1 - f21;
						f13 = -f9 - f21;
					}
					f1 = af[j];
					if(f18 < 0.0F)
	//* 204  428:goto            341
						f5 = f13;
	//  205  431:fload           6
	//  206  433:fstore          4
					drawValue(canvas, ((String) (obj)), f1 + f5, af[j + 1] + f17, ibardataset.getValueTextColor(j / 2));
				}
				j += 2;
			}
		}
		  goto _L3
		continue; /* Loop/switch isn't completed */
	//  207  435:goto            381
		int k = 0;
	//  208  438:iconst_0        
	//  209  439:istore          11
_L8:
		if((float)k >= (float)(af.length - 1) * mAnimator.getPhaseX()) goto _L3; else goto _L4
	//  210  441:iload           11
	//  211  443:i2f             
	//  212  444:aload           19
	//  213  446:arraylength     
	//  214  447:iconst_1        
	//  215  448:isub            
	//  216  449:i2f             
	//  217  450:aload_0         
	//  218  451:getfield        #58  <Field ChartAnimator mAnimator>
	//  219  454:invokevirtual   #64  <Method float ChartAnimator.getPhaseX()>
	//  220  457:fmul            
	//  221  458:fcmpg           
	//  222  459:ifge            92
_L4:
		BarEntry barentry;
		Object obj1;
		barentry = (BarEntry)ibardataset.getEntryForIndex(k / 2);
	//  223  462:aload           17
	//  224  464:iload           11
	//  225  466:iconst_2        
	//  226  467:idiv            
	//  227  468:invokeinterface #222 <Method com.github.mikephil.charting.data.Entry IBarDataSet.getEntryForIndex(int)>
	//  228  473:checkcast       #224 <Class BarEntry>
	//  229  476:astore          21
		obj1 = ((Object) (barentry.getVals()));
	//  230  478:aload           21
	//  231  480:invokevirtual   #245 <Method float[] BarEntry.getVals()>
	//  232  483:astore          22
		if(obj1 != null) goto _L6; else goto _L5
	//  233  485:aload           22
	//  234  487:ifnonnull       701
_L5:
		if(!mViewPortHandler.isInBoundsTop(af[k + 1])) goto _L3; else goto _L7
	//  235  490:aload_0         
	//  236  491:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//  237  494:aload           19
	//  238  496:iload           11
	//  239  498:iconst_1        
	//  240  499:iadd            
	//  241  500:faload          
	//  242  501:invokevirtual   #122 <Method boolean ViewPortHandler.isInBoundsTop(float)>
	//  243  504:ifeq            92
	//* 244  507:aload_0         
	//* 245  508:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//* 246  511:aload           19
	//* 247  513:iload           11
	//* 248  515:faload          
	//* 249  516:invokevirtual   #218 <Method boolean ViewPortHandler.isInBoundsX(float)>
	//* 250  519:ifne            531
_L9:
		k += 2;
	//  251  522:iload           11
	//  252  524:iconst_2        
	//  253  525:iadd            
	//  254  526:istore          11
		  goto _L8
_L7:
		if(mViewPortHandler.isInBoundsX(af[k]) && mViewPortHandler.isInBoundsBottom(af[k + 1]))
	//* 255  528:goto            441
	//* 256  531:aload_0         
	//* 257  532:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//* 258  535:aload           19
	//* 259  537:iload           11
	//* 260  539:iconst_1        
	//* 261  540:iadd            
	//* 262  541:faload          
	//* 263  542:invokevirtual   #125 <Method boolean ViewPortHandler.isInBoundsBottom(float)>
	//* 264  545:ifeq            522
		{
			obj1 = ((Object) (valueformatter.getFormattedValue(barentry.getVal(), ((com.github.mikephil.charting.data.Entry) (barentry)), i, mViewPortHandler)));
	//  265  548:aload           18
	//  266  550:aload           21
	//  267  552:invokevirtual   #227 <Method float BarEntry.getVal()>
	//  268  555:aload           21
	//  269  557:iload           10
	//  270  559:aload_0         
	//  271  560:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//  272  563:invokeinterface #233 <Method String ValueFormatter.getFormattedValue(float, com.github.mikephil.charting.data.Entry, int, ViewPortHandler)>
	//  273  568:astore          22
			float f19 = Utils.calcTextWidth(mValuePaint, ((String) (obj1)));
	//  274  570:aload_0         
	//  275  571:getfield        #12  <Field Paint mValuePaint>
	//  276  574:aload           22
	//  277  576:invokestatic    #236 <Method int Utils.calcTextWidth(Paint, String)>
	//  278  579:i2f             
	//  279  580:fstore          8
			float f2;
			float f6;
			float f10;
			float f14;
			if(flag)
	//* 280  582:iload           14
	//* 281  584:ifeq            679
				f2 = f;
	//  282  587:fload_2         
	//  283  588:fstore_3        
			else
	//* 284  589:iload           14
	//* 285  591:ifeq            688
	//* 286  594:fload           8
	//* 287  596:fload_2         
	//* 288  597:fadd            
	//* 289  598:fneg            
	//* 290  599:fstore          5
	//* 291  601:fload           5
	//* 292  603:fstore          6
	//* 293  605:fload_3         
	//* 294  606:fstore          4
	//* 295  608:iload           15
	//* 296  610:ifeq            628
	//* 297  613:fload_3         
	//* 298  614:fneg            
	//* 299  615:fload           8
	//* 300  617:fsub            
	//* 301  618:fstore          4
	//* 302  620:fload           5
	//* 303  622:fneg            
	//* 304  623:fload           8
	//* 305  625:fsub            
	//* 306  626:fstore          6
	//* 307  628:aload           19
	//* 308  630:iload           11
	//* 309  632:faload          
	//* 310  633:fstore_3        
	//* 311  634:aload           21
	//* 312  636:invokevirtual   #227 <Method float BarEntry.getVal()>
	//* 313  639:fconst_0        
	//* 314  640:fcmpl           
	//* 315  641:iflt            694
	//* 316  644:aload_0         
	//* 317  645:aload_1         
	//* 318  646:aload           22
	//* 319  648:fload_3         
	//* 320  649:fload           4
	//* 321  651:fadd            
	//* 322  652:aload           19
	//* 323  654:iload           11
	//* 324  656:iconst_1        
	//* 325  657:iadd            
	//* 326  658:faload          
	//* 327  659:fload           7
	//* 328  661:fadd            
	//* 329  662:aload           17
	//* 330  664:iload           11
	//* 331  666:iconst_2        
	//* 332  667:idiv            
	//* 333  668:invokeinterface #239 <Method int IBarDataSet.getValueTextColor(int)>
	//* 334  673:invokevirtual   #241 <Method void drawValue(Canvas, String, float, float, int)>
	//* 335  676:goto            522
				f2 = -(f19 + f);
	//  336  679:fload           8
	//  337  681:fload_2         
	//  338  682:fadd            
	//  339  683:fneg            
	//  340  684:fstore_3        
			if(flag)
				f10 = -(f19 + f);
			else
	//* 341  685:goto            589
				f10 = f;
	//  342  688:fload_2         
	//  343  689:fstore          5
			f14 = f10;
			f6 = f2;
			if(flag1)
			{
				f6 = -f2 - f19;
				f14 = -f10 - f19;
			}
			f2 = af[k];
			if(barentry.getVal() < 0.0F)
	//* 344  691:goto            601
				f6 = f14;
	//  345  694:fload           6
	//  346  696:fstore          4
			drawValue(canvas, ((String) (obj1)), f2 + f6, af[k + 1] + f17, ibardataset.getValueTextColor(k / 2));
		}
		  goto _L9
	//* 347  698:goto            644
_L6:
		int l;
		float af1[];
		af1 = new float[obj1.length * 2];
	//  348  701:aload           22
	//  349  703:arraylength     
	//  350  704:iconst_2        
	//  351  705:imul            
	//  352  706:newarray        float[]
	//  353  708:astore          23
		float f7 = 0.0F;
	//  354  710:fconst_0        
	//  355  711:fstore          4
		float f3 = -barentry.getNegativeSum();
	//  356  713:aload           21
	//  357  715:invokevirtual   #248 <Method float BarEntry.getNegativeSum()>
	//  358  718:fneg            
	//  359  719:fstore_3        
		int i1 = 0;
	//  360  720:iconst_0        
	//  361  721:istore          13
		l = 0;
	//  362  723:iconst_0        
	//  363  724:istore          12
		while(i1 < af1.length) 
	//* 364  726:iload           13
	//* 365  728:aload           23
	//* 366  730:arraylength     
	//* 367  731:icmpge          800
		{
			float f15 = obj1[l];
	//  368  734:aload           22
	//  369  736:iload           12
	//  370  738:faload          
	//  371  739:fstore          6
			float f11;
			if(f15 >= 0.0F)
	//* 372  741:fload           6
	//* 373  743:fconst_0        
	//* 374  744:fcmpl           
	//* 375  745:iflt            789
			{
				f7 += f15;
	//  376  748:fload           4
	//  377  750:fload           6
	//  378  752:fadd            
	//  379  753:fstore          4
				f11 = f7;
	//  380  755:fload           4
	//  381  757:fstore          5
			} else
	//* 382  759:aload           23
	//* 383  761:iload           13
	//* 384  763:aload_0         
	//* 385  764:getfield        #58  <Field ChartAnimator mAnimator>
	//* 386  767:invokevirtual   #67  <Method float ChartAnimator.getPhaseY()>
	//* 387  770:fload           5
	//* 388  772:fmul            
	//* 389  773:fastore         
	//* 390  774:iload           13
	//* 391  776:iconst_2        
	//* 392  777:iadd            
	//* 393  778:istore          13
	//* 394  780:iload           12
	//* 395  782:iconst_1        
	//* 396  783:iadd            
	//* 397  784:istore          12
	//* 398  786:goto            726
			{
				f11 = f3;
	//  399  789:fload_3         
	//  400  790:fstore          5
				f3 -= f15;
	//  401  792:fload_3         
	//  402  793:fload           6
	//  403  795:fsub            
	//  404  796:fstore_3        
			}
			af1[i1] = mAnimator.getPhaseY() * f11;
			i1 += 2;
			l++;
		}
	//* 405  797:goto            759
		((Transformer) (obj)).pointValuesToPixel(af1);
	//  406  800:aload           20
	//  407  802:aload           23
	//  408  804:invokevirtual   #109 <Method void Transformer.pointValuesToPixel(float[])>
		l = 0;
	//  409  807:iconst_0        
	//  410  808:istore          12
_L12:
		if(l >= af1.length) goto _L9; else goto _L10
	//  411  810:iload           12
	//  412  812:aload           23
	//  413  814:arraylength     
	//  414  815:icmpge          522
_L10:
		float f4;
		float f8;
		String s;
		float f20 = obj1[l / 2];
	//  415  818:aload           22
	//  416  820:iload           12
	//  417  822:iconst_2        
	//  418  823:idiv            
	//  419  824:faload          
	//  420  825:fstore          8
		s = valueformatter.getFormattedValue(f20, ((com.github.mikephil.charting.data.Entry) (barentry)), i, mViewPortHandler);
	//  421  827:aload           18
	//  422  829:fload           8
	//  423  831:aload           21
	//  424  833:iload           10
	//  425  835:aload_0         
	//  426  836:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//  427  839:invokeinterface #233 <Method String ValueFormatter.getFormattedValue(float, com.github.mikephil.charting.data.Entry, int, ViewPortHandler)>
	//  428  844:astore          24
		float f22 = Utils.calcTextWidth(mValuePaint, s);
	//  429  846:aload_0         
	//  430  847:getfield        #12  <Field Paint mValuePaint>
	//  431  850:aload           24
	//  432  852:invokestatic    #236 <Method int Utils.calcTextWidth(Paint, String)>
	//  433  855:i2f             
	//  434  856:fstore          9
		float f12;
		float f16;
		if(flag)
	//* 435  858:iload           14
	//* 436  860:ifeq            963
			f4 = f;
	//  437  863:fload_2         
	//  438  864:fstore_3        
		else
	//* 439  865:iload           14
	//* 440  867:ifeq            972
	//* 441  870:fload           9
	//* 442  872:fload_2         
	//* 443  873:fadd            
	//* 444  874:fneg            
	//* 445  875:fstore          5
	//* 446  877:fload           5
	//* 447  879:fstore          6
	//* 448  881:fload_3         
	//* 449  882:fstore          4
	//* 450  884:iload           15
	//* 451  886:ifeq            904
	//* 452  889:fload_3         
	//* 453  890:fneg            
	//* 454  891:fload           9
	//* 455  893:fsub            
	//* 456  894:fstore          4
	//* 457  896:fload           5
	//* 458  898:fneg            
	//* 459  899:fload           9
	//* 460  901:fsub            
	//* 461  902:fstore          6
	//* 462  904:aload           23
	//* 463  906:iload           12
	//* 464  908:faload          
	//* 465  909:fstore_3        
	//* 466  910:fload           8
	//* 467  912:fconst_0        
	//* 468  913:fcmpl           
	//* 469  914:iflt            978
	//* 470  917:fload_3         
	//* 471  918:fload           4
	//* 472  920:fadd            
	//* 473  921:fstore_3        
	//* 474  922:aload           19
	//* 475  924:iload           11
	//* 476  926:iconst_1        
	//* 477  927:iadd            
	//* 478  928:faload          
	//* 479  929:fstore          4
	//* 480  931:aload_0         
	//* 481  932:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//* 482  935:fload           4
	//* 483  937:invokevirtual   #122 <Method boolean ViewPortHandler.isInBoundsTop(float)>
	//* 484  940:ifeq            522
	//* 485  943:aload_0         
	//* 486  944:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//* 487  947:fload_3         
	//* 488  948:invokevirtual   #218 <Method boolean ViewPortHandler.isInBoundsX(float)>
	//* 489  951:ifne            985
	//* 490  954:iload           12
	//* 491  956:iconst_2        
	//* 492  957:iadd            
	//* 493  958:istore          12
	//* 494  960:goto            810
			f4 = -(f22 + f);
	//  495  963:fload           9
	//  496  965:fload_2         
	//  497  966:fadd            
	//  498  967:fneg            
	//  499  968:fstore_3        
		if(flag)
			f12 = -(f22 + f);
		else
	//* 500  969:goto            865
			f12 = f;
	//  501  972:fload_2         
	//  502  973:fstore          5
		f16 = f12;
		f8 = f4;
		if(flag1)
		{
			f8 = -f4 - f22;
			f16 = -f12 - f22;
		}
		f4 = af1[l];
		if(f20 < 0.0F)
	//* 503  975:goto            877
			f8 = f16;
	//  504  978:fload           6
	//  505  980:fstore          4
		f4 += f8;
		f8 = af[k + 1];
		if(!mViewPortHandler.isInBoundsTop(f8)) goto _L9; else goto _L11
_L11:
		if(mViewPortHandler.isInBoundsX(f4) && mViewPortHandler.isInBoundsBottom(f8))
	//* 506  982:goto            917
	//* 507  985:aload_0         
	//* 508  986:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//* 509  989:fload           4
	//* 510  991:invokevirtual   #125 <Method boolean ViewPortHandler.isInBoundsBottom(float)>
	//* 511  994:ifeq            954
			drawValue(canvas, s, f4, f8 + f17, ibardataset.getValueTextColor(k / 2));
	//  512  997:aload_0         
	//  513  998:aload_1         
	//  514  999:aload           24
	//  515 1001:fload_3         
	//  516 1002:fload           4
	//  517 1004:fload           7
	//  518 1006:fadd            
	//  519 1007:aload           17
	//  520 1009:iload           11
	//  521 1011:iconst_2        
	//  522 1012:idiv            
	//  523 1013:invokeinterface #239 <Method int IBarDataSet.getValueTextColor(int)>
	//  524 1018:invokevirtual   #241 <Method void drawValue(Canvas, String, float, float, int)>
		l += 2;
		  goto _L12
	//* 525 1021:goto            954
		return;
	//  526 1024:return          
		if(true) goto _L2; else goto _L13
_L13:
	}

	public float[] getTransformedValues(Transformer transformer, IBarDataSet ibardataset, int i)
	{
		return transformer.generateTransformedValuesHorizontalBarChart(ibardataset, i, mChart.getBarData(), mAnimator.getPhaseY());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #31  <Field BarDataProvider mChart>
	//    5    7:invokeinterface #163 <Method BarData BarDataProvider.getBarData()>
	//    6   12:aload_0         
	//    7   13:getfield        #58  <Field ChartAnimator mAnimator>
	//    8   16:invokevirtual   #67  <Method float ChartAnimator.getPhaseY()>
	//    9   19:invokevirtual   #252 <Method float[] Transformer.generateTransformedValuesHorizontalBarChart(IBarDataSet, int, BarData, float)>
	//   10   22:areturn         
	}

	public void initBuffers()
	{
		BarData bardata = mChart.getBarData();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field BarDataProvider mChart>
	//    2    4:invokeinterface #163 <Method BarData BarDataProvider.getBarData()>
	//    3    9:astore          4
		mBarBuffers = ((BarBuffer []) (new HorizontalBarBuffer[bardata.getDataSetCount()]));
	//    4   11:aload_0         
	//    5   12:aload           4
	//    6   14:invokevirtual   #182 <Method int BarData.getDataSetCount()>
	//    7   17:anewarray       HorizontalBarBuffer[]
	//    8   20:putfield        #71  <Field BarBuffer[] mBarBuffers>
		int i = 0;
	//    9   23:iconst_0        
	//   10   24:istore_1        
		while(i < mBarBuffers.length) 
	//*  11   25:iload_1         
	//*  12   26:aload_0         
	//*  13   27:getfield        #71  <Field BarBuffer[] mBarBuffers>
	//*  14   30:arraylength     
	//*  15   31:icmpge          122
		{
			IBarDataSet ibardataset = (IBarDataSet)bardata.getDataSetByIndex(i);
	//   16   34:aload           4
	//   17   36:iload_1         
	//   18   37:invokevirtual   #260 <Method com.github.mikephil.charting.interfaces.datasets.IDataSet BarData.getDataSetByIndex(int)>
	//   19   40:checkcast       #33  <Class IBarDataSet>
	//   20   43:astore          5
			BarBuffer abarbuffer[] = mBarBuffers;
	//   21   45:aload_0         
	//   22   46:getfield        #71  <Field BarBuffer[] mBarBuffers>
	//   23   49:astore          6
			int k = ibardataset.getEntryCount();
	//   24   51:aload           5
	//   25   53:invokeinterface #194 <Method int IBarDataSet.getEntryCount()>
	//   26   58:istore_3        
			int j;
			if(ibardataset.isStacked())
	//*  27   59:aload           5
	//*  28   61:invokeinterface #215 <Method boolean IBarDataSet.isStacked()>
	//*  29   66:ifeq            117
				j = ibardataset.getStackSize();
	//   30   69:aload           5
	//   31   71:invokeinterface #263 <Method int IBarDataSet.getStackSize()>
	//   32   76:istore_2        
			else
	//*  33   77:aload           6
	//*  34   79:iload_1         
	//*  35   80:new             #256 <Class HorizontalBarBuffer>
	//*  36   83:dup             
	//*  37   84:iload_2         
	//*  38   85:iload_3         
	//*  39   86:iconst_4        
	//*  40   87:imul            
	//*  41   88:imul            
	//*  42   89:aload           4
	//*  43   91:invokevirtual   #266 <Method float BarData.getGroupSpace()>
	//*  44   94:aload           4
	//*  45   96:invokevirtual   #182 <Method int BarData.getDataSetCount()>
	//*  46   99:aload           5
	//*  47  101:invokeinterface #215 <Method boolean IBarDataSet.isStacked()>
	//*  48  106:invokespecial   #269 <Method void HorizontalBarBuffer(int, float, int, boolean)>
	//*  49  109:aastore         
	//*  50  110:iload_1         
	//*  51  111:iconst_1        
	//*  52  112:iadd            
	//*  53  113:istore_1        
	//*  54  114:goto            25
				j = 1;
	//   55  117:iconst_1        
	//   56  118:istore_2        
			abarbuffer[i] = ((BarBuffer) (new HorizontalBarBuffer(j * (k * 4), bardata.getGroupSpace(), bardata.getDataSetCount(), ibardataset.isStacked())));
			i++;
		}
	//*  57  119:goto            77
	//   58  122:return          
	}

	protected boolean passesCheck()
	{
		return (float)mChart.getBarData().getYValCount() < (float)mChart.getMaxVisibleCount() * mViewPortHandler.getScaleY();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field BarDataProvider mChart>
	//    2    4:invokeinterface #163 <Method BarData BarDataProvider.getBarData()>
	//    3    9:invokevirtual   #272 <Method int BarData.getYValCount()>
	//    4   12:i2f             
	//    5   13:aload_0         
	//    6   14:getfield        #31  <Field BarDataProvider mChart>
	//    7   17:invokeinterface #275 <Method int BarDataProvider.getMaxVisibleCount()>
	//    8   22:i2f             
	//    9   23:aload_0         
	//   10   24:getfield        #116 <Field ViewPortHandler mViewPortHandler>
	//   11   27:invokevirtual   #278 <Method float ViewPortHandler.getScaleY()>
	//   12   30:fmul            
	//   13   31:fcmpg           
	//   14   32:ifge            37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	protected void prepareBarHighlight(float f, float f1, float f2, float f3, Transformer transformer)
	{
		mBarRect.set(f1, (f - 0.5F) + f3, f2, (f + 0.5F) - f3);
	//    0    0:aload_0         
	//    1    1:getfield        #284 <Field RectF mBarRect>
	//    2    4:fload_2         
	//    3    5:fload_1         
	//    4    6:ldc2            #285 <Float 0.5F>
	//    5    9:fsub            
	//    6   10:fload           4
	//    7   12:fadd            
	//    8   13:fload_3         
	//    9   14:fload_1         
	//   10   15:ldc2            #285 <Float 0.5F>
	//   11   18:fadd            
	//   12   19:fload           4
	//   13   21:fsub            
	//   14   22:invokevirtual   #291 <Method void RectF.set(float, float, float, float)>
		transformer.rectValueToPixelHorizontal(mBarRect, mAnimator.getPhaseY());
	//   15   25:aload           5
	//   16   27:aload_0         
	//   17   28:getfield        #284 <Field RectF mBarRect>
	//   18   31:aload_0         
	//   19   32:getfield        #58  <Field ChartAnimator mAnimator>
	//   20   35:invokevirtual   #67  <Method float ChartAnimator.getPhaseY()>
	//   21   38:invokevirtual   #295 <Method void Transformer.rectValueToPixelHorizontal(RectF, float)>
	//   22   41:return          
	}
}
