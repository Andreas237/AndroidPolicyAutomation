// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.PieRadarChartTouchListener;
import com.github.mikephil.charting.renderer.LegendRenderer;
import com.github.mikephil.charting.utils.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.charts:
//			Chart, RadarChart

public abstract class PieRadarChartBase extends Chart
{

	public PieRadarChartBase(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void Chart(Context)>
		mRotationAngle = 270F;
	//    3    5:aload_0         
	//    4    6:ldc1            #18  <Float 270F>
	//    5    8:putfield        #20  <Field float mRotationAngle>
		mRawRotationAngle = 270F;
	//    6   11:aload_0         
	//    7   12:ldc1            #18  <Float 270F>
	//    8   14:putfield        #22  <Field float mRawRotationAngle>
		mRotateEnabled = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #24  <Field boolean mRotateEnabled>
		mMinOffset = 0.0F;
	//   12   22:aload_0         
	//   13   23:fconst_0        
	//   14   24:putfield        #26  <Field float mMinOffset>
	//   15   27:return          
	}

	public PieRadarChartBase(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #30  <Method void Chart(Context, AttributeSet)>
		mRotationAngle = 270F;
	//    4    6:aload_0         
	//    5    7:ldc1            #18  <Float 270F>
	//    6    9:putfield        #20  <Field float mRotationAngle>
		mRawRotationAngle = 270F;
	//    7   12:aload_0         
	//    8   13:ldc1            #18  <Float 270F>
	//    9   15:putfield        #22  <Field float mRawRotationAngle>
		mRotateEnabled = true;
	//   10   18:aload_0         
	//   11   19:iconst_1        
	//   12   20:putfield        #24  <Field boolean mRotateEnabled>
		mMinOffset = 0.0F;
	//   13   23:aload_0         
	//   14   24:fconst_0        
	//   15   25:putfield        #26  <Field float mMinOffset>
	//   16   28:return          
	}

	public PieRadarChartBase(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #33  <Method void Chart(Context, AttributeSet, int)>
		mRotationAngle = 270F;
	//    5    7:aload_0         
	//    6    8:ldc1            #18  <Float 270F>
	//    7   10:putfield        #20  <Field float mRotationAngle>
		mRawRotationAngle = 270F;
	//    8   13:aload_0         
	//    9   14:ldc1            #18  <Float 270F>
	//   10   16:putfield        #22  <Field float mRawRotationAngle>
		mRotateEnabled = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #24  <Field boolean mRotateEnabled>
		mMinOffset = 0.0F;
	//   14   24:aload_0         
	//   15   25:fconst_0        
	//   16   26:putfield        #26  <Field float mMinOffset>
	//   17   29:return          
	}

	protected void calcMinMax()
	{
		mDeltaX = mData.getXVals().size() - 1;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #39  <Field ChartData mData>
	//    3    5:invokevirtual   #45  <Method List ChartData.getXVals()>
	//    4    8:invokeinterface #51  <Method int List.size()>
	//    5   13:iconst_1        
	//    6   14:isub            
	//    7   15:i2f             
	//    8   16:putfield        #54  <Field float mDeltaX>
	//    9   19:return          
	}

	public void calculateOffsets()
	{
		float f;
		float f1;
		float f2;
		float f3;
		float f6;
		float f7;
		float f8;
		float f9;
		float f10;
		float f11;
		float f12;
		float f13;
		float f14;
		float f15;
		f12 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore          11
		f6 = 0.0F;
	//    2    3:fconst_0        
	//    3    4:fstore          5
		f9 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore          8
		f13 = 0.0F;
	//    6    9:fconst_0        
	//    7   10:fstore          12
		f11 = 0.0F;
	//    8   12:fconst_0        
	//    9   13:fstore          10
		f10 = 0.0F;
	//   10   15:fconst_0        
	//   11   16:fstore          9
		f14 = 0.0F;
	//   12   18:fconst_0        
	//   13   19:fstore          13
		f7 = 0.0F;
	//   14   21:fconst_0        
	//   15   22:fstore          6
		f15 = 0.0F;
	//   16   24:fconst_0        
	//   17   25:fstore          14
		f8 = 0.0F;
	//   18   27:fconst_0        
	//   19   28:fstore          7
		f2 = f14;
	//   20   30:fload           13
	//   21   32:fstore_3        
		f3 = f12;
	//   22   33:fload           11
	//   23   35:fstore          4
		f = f13;
	//   24   37:fload           12
	//   25   39:fstore_1        
		f1 = f15;
	//   26   40:fload           14
	//   27   42:fstore_2        
		if(mLegend == null) goto _L2; else goto _L1
	//   28   43:aload_0         
	//   29   44:getfield        #59  <Field Legend mLegend>
	//   30   47:ifnull          169
_L1:
		f2 = f14;
	//   31   50:fload           13
	//   32   52:fstore_3        
		f3 = f12;
	//   33   53:fload           11
	//   34   55:fstore          4
		f = f13;
	//   35   57:fload           12
	//   36   59:fstore_1        
		f1 = f15;
	//   37   60:fload           14
	//   38   62:fstore_2        
		if(!mLegend.isEnabled()) goto _L2; else goto _L3
	//   39   63:aload_0         
	//   40   64:getfield        #59  <Field Legend mLegend>
	//   41   67:invokevirtual   #65  <Method boolean Legend.isEnabled()>
	//   42   70:ifeq            169
_L3:
		f = Math.min(mLegend.mNeededWidth, mViewPortHandler.getChartWidth() * mLegend.getMaxSizePercent()) + mLegend.getFormSize() + mLegend.getFormToTextSpace();
	//   43   73:aload_0         
	//   44   74:getfield        #59  <Field Legend mLegend>
	//   45   77:getfield        #68  <Field float Legend.mNeededWidth>
	//   46   80:aload_0         
	//   47   81:getfield        #72  <Field ViewPortHandler mViewPortHandler>
	//   48   84:invokevirtual   #78  <Method float ViewPortHandler.getChartWidth()>
	//   49   87:aload_0         
	//   50   88:getfield        #59  <Field Legend mLegend>
	//   51   91:invokevirtual   #81  <Method float Legend.getMaxSizePercent()>
	//   52   94:fmul            
	//   53   95:invokestatic    #87  <Method float Math.min(float, float)>
	//   54   98:aload_0         
	//   55   99:getfield        #59  <Field Legend mLegend>
	//   56  102:invokevirtual   #90  <Method float Legend.getFormSize()>
	//   57  105:fadd            
	//   58  106:aload_0         
	//   59  107:getfield        #59  <Field Legend mLegend>
	//   60  110:invokevirtual   #93  <Method float Legend.getFormToTextSpace()>
	//   61  113:fadd            
	//   62  114:fstore_1        
		if(mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART_CENTER) goto _L5; else goto _L4
	//   63  115:aload_0         
	//   64  116:getfield        #59  <Field Legend mLegend>
	//   65  119:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//   66  122:getstatic       #103 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART_CENTER>
	//   67  125:if_acmpne       377
_L4:
		f1 = f + Utils.convertDpToPixel(13F);
	//   68  128:fload_1         
	//   69  129:ldc1            #104 <Float 13F>
	//   70  131:invokestatic    #110 <Method float Utils.convertDpToPixel(float)>
	//   71  134:fadd            
	//   72  135:fstore_2        
		f6 = f8;
	//   73  136:fload           7
	//   74  138:fstore          5
		f = f9;
	//   75  140:fload           8
	//   76  142:fstore_1        
		f2 = f7;
	//   77  143:fload           6
	//   78  145:fstore_3        
_L7:
		f3 = f + getRequiredBaseOffset();
	//   79  146:fload_1         
	//   80  147:aload_0         
	//   81  148:invokevirtual   #113 <Method float getRequiredBaseOffset()>
	//   82  151:fadd            
	//   83  152:fstore          4
		f = f1 + getRequiredBaseOffset();
	//   84  154:fload_2         
	//   85  155:aload_0         
	//   86  156:invokevirtual   #113 <Method float getRequiredBaseOffset()>
	//   87  159:fadd            
	//   88  160:fstore_1        
		f1 = f6 + getRequiredBaseOffset();
	//   89  161:fload           5
	//   90  163:aload_0         
	//   91  164:invokevirtual   #113 <Method float getRequiredBaseOffset()>
	//   92  167:fadd            
	//   93  168:fstore_2        
_L2:
		f7 = Utils.convertDpToPixel(mMinOffset);
	//   94  169:aload_0         
	//   95  170:getfield        #26  <Field float mMinOffset>
	//   96  173:invokestatic    #110 <Method float Utils.convertDpToPixel(float)>
	//   97  176:fstore          6
		f6 = f7;
	//   98  178:fload           6
	//   99  180:fstore          5
		if(this instanceof RadarChart)
	//* 100  182:aload_0         
	//* 101  183:instanceof      #115 <Class RadarChart>
	//* 102  186:ifeq            235
		{
			XAxis xaxis = ((RadarChart)this).getXAxis();
	//  103  189:aload_0         
	//  104  190:checkcast       #115 <Class RadarChart>
	//  105  193:invokevirtual   #119 <Method XAxis RadarChart.getXAxis()>
	//  106  196:astore          15
			f6 = f7;
	//  107  198:fload           6
	//  108  200:fstore          5
			if(xaxis.isEnabled())
	//* 109  202:aload           15
	//* 110  204:invokevirtual   #122 <Method boolean XAxis.isEnabled()>
	//* 111  207:ifeq            235
			{
				f6 = f7;
	//  112  210:fload           6
	//  113  212:fstore          5
				if(xaxis.isDrawLabelsEnabled())
	//* 114  214:aload           15
	//* 115  216:invokevirtual   #125 <Method boolean XAxis.isDrawLabelsEnabled()>
	//* 116  219:ifeq            235
					f6 = Math.max(f7, xaxis.mLabelRotatedWidth);
	//  117  222:fload           6
	//  118  224:aload           15
	//  119  226:getfield        #129 <Field int XAxis.mLabelRotatedWidth>
	//  120  229:i2f             
	//  121  230:invokestatic    #132 <Method float Math.max(float, float)>
	//  122  233:fstore          5
			}
		}
		f9 = getExtraTopOffset();
	//  123  235:aload_0         
	//  124  236:invokevirtual   #135 <Method float getExtraTopOffset()>
	//  125  239:fstore          8
		f8 = getExtraRightOffset();
	//  126  241:aload_0         
	//  127  242:invokevirtual   #138 <Method float getExtraRightOffset()>
	//  128  245:fstore          7
		f7 = getExtraBottomOffset();
	//  129  247:aload_0         
	//  130  248:invokevirtual   #141 <Method float getExtraBottomOffset()>
	//  131  251:fstore          6
		f3 = Math.max(f6, f3 + getExtraLeftOffset());
	//  132  253:fload           5
	//  133  255:fload           4
	//  134  257:aload_0         
	//  135  258:invokevirtual   #144 <Method float getExtraLeftOffset()>
	//  136  261:fadd            
	//  137  262:invokestatic    #132 <Method float Math.max(float, float)>
	//  138  265:fstore          4
		f1 = Math.max(f6, f1 + f9);
	//  139  267:fload           5
	//  140  269:fload_2         
	//  141  270:fload           8
	//  142  272:fadd            
	//  143  273:invokestatic    #132 <Method float Math.max(float, float)>
	//  144  276:fstore_2        
		f = Math.max(f6, f + f8);
	//  145  277:fload           5
	//  146  279:fload_1         
	//  147  280:fload           7
	//  148  282:fadd            
	//  149  283:invokestatic    #132 <Method float Math.max(float, float)>
	//  150  286:fstore_1        
		f2 = Math.max(f6, Math.max(getRequiredBaseOffset(), f2 + f7));
	//  151  287:fload           5
	//  152  289:aload_0         
	//  153  290:invokevirtual   #113 <Method float getRequiredBaseOffset()>
	//  154  293:fload_3         
	//  155  294:fload           6
	//  156  296:fadd            
	//  157  297:invokestatic    #132 <Method float Math.max(float, float)>
	//  158  300:invokestatic    #132 <Method float Math.max(float, float)>
	//  159  303:fstore_3        
		mViewPortHandler.restrainViewPort(f3, f1, f, f2);
	//  160  304:aload_0         
	//  161  305:getfield        #72  <Field ViewPortHandler mViewPortHandler>
	//  162  308:fload           4
	//  163  310:fload_2         
	//  164  311:fload_1         
	//  165  312:fload_3         
	//  166  313:invokevirtual   #148 <Method void ViewPortHandler.restrainViewPort(float, float, float, float)>
		if(mLogEnabled)
	//* 167  316:aload_0         
	//* 168  317:getfield        #151 <Field boolean mLogEnabled>
	//* 169  320:ifeq            376
			Log.i("MPAndroidChart", (new StringBuilder()).append("offsetLeft: ").append(f3).append(", offsetTop: ").append(f1).append(", offsetRight: ").append(f).append(", offsetBottom: ").append(f2).toString());
	//  170  323:ldc1            #153 <String "MPAndroidChart">
	//  171  325:new             #155 <Class StringBuilder>
	//  172  328:dup             
	//  173  329:invokespecial   #157 <Method void StringBuilder()>
	//  174  332:ldc1            #159 <String "offsetLeft: ">
	//  175  334:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//  176  337:fload           4
	//  177  339:invokevirtual   #166 <Method StringBuilder StringBuilder.append(float)>
	//  178  342:ldc1            #168 <String ", offsetTop: ">
	//  179  344:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//  180  347:fload_2         
	//  181  348:invokevirtual   #166 <Method StringBuilder StringBuilder.append(float)>
	//  182  351:ldc1            #170 <String ", offsetRight: ">
	//  183  353:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//  184  356:fload_1         
	//  185  357:invokevirtual   #166 <Method StringBuilder StringBuilder.append(float)>
	//  186  360:ldc1            #172 <String ", offsetBottom: ">
	//  187  362:invokevirtual   #163 <Method StringBuilder StringBuilder.append(String)>
	//  188  365:fload_3         
	//  189  366:invokevirtual   #166 <Method StringBuilder StringBuilder.append(float)>
	//  190  369:invokevirtual   #176 <Method String StringBuilder.toString()>
	//  191  372:invokestatic    #182 <Method int Log.i(String, String)>
	//  192  375:pop             
		return;
	//  193  376:return          
_L5:
		if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.RIGHT_OF_CHART)
	//* 194  377:aload_0         
	//* 195  378:getfield        #59  <Field Legend mLegend>
	//* 196  381:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 197  384:getstatic       #185 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.RIGHT_OF_CHART>
	//* 198  387:if_acmpne       599
		{
			f10 = f + Utils.convertDpToPixel(8F);
	//  199  390:fload_1         
	//  200  391:ldc1            #186 <Float 8F>
	//  201  393:invokestatic    #110 <Method float Utils.convertDpToPixel(float)>
	//  202  396:fadd            
	//  203  397:fstore          9
			f = mLegend.mNeededHeight;
	//  204  399:aload_0         
	//  205  400:getfield        #59  <Field Legend mLegend>
	//  206  403:getfield        #189 <Field float Legend.mNeededHeight>
	//  207  406:fstore_1        
			f1 = mLegend.mTextHeightMax;
	//  208  407:aload_0         
	//  209  408:getfield        #59  <Field Legend mLegend>
	//  210  411:getfield        #192 <Field float Legend.mTextHeightMax>
	//  211  414:fstore_2        
			PointF pointf = getCenter();
	//  212  415:aload_0         
	//  213  416:invokevirtual   #196 <Method PointF getCenter()>
	//  214  419:astore          15
			PointF pointf2 = new PointF(((float)getWidth() - f10) + 15F, 15F + (f + f1));
	//  215  421:new             #198 <Class PointF>
	//  216  424:dup             
	//  217  425:aload_0         
	//  218  426:invokevirtual   #201 <Method int getWidth()>
	//  219  429:i2f             
	//  220  430:fload           9
	//  221  432:fsub            
	//  222  433:ldc1            #202 <Float 15F>
	//  223  435:fadd            
	//  224  436:ldc1            #202 <Float 15F>
	//  225  438:fload_1         
	//  226  439:fload_2         
	//  227  440:fadd            
	//  228  441:fadd            
	//  229  442:invokespecial   #205 <Method void PointF(float, float)>
	//  230  445:astore          16
			f = distanceToCenter(pointf2.x, pointf2.y);
	//  231  447:aload_0         
	//  232  448:aload           16
	//  233  450:getfield        #208 <Field float PointF.x>
	//  234  453:aload           16
	//  235  455:getfield        #211 <Field float PointF.y>
	//  236  458:invokevirtual   #214 <Method float distanceToCenter(float, float)>
	//  237  461:fstore_1        
			PointF pointf4 = getPosition(pointf, getRadius(), getAngleForPoint(pointf2.x, pointf2.y));
	//  238  462:aload_0         
	//  239  463:aload           15
	//  240  465:aload_0         
	//  241  466:invokevirtual   #217 <Method float getRadius()>
	//  242  469:aload_0         
	//  243  470:aload           16
	//  244  472:getfield        #208 <Field float PointF.x>
	//  245  475:aload           16
	//  246  477:getfield        #211 <Field float PointF.y>
	//  247  480:invokevirtual   #220 <Method float getAngleForPoint(float, float)>
	//  248  483:invokevirtual   #223 <Method PointF getPosition(PointF, float, float)>
	//  249  486:astore          17
			f1 = distanceToCenter(pointf4.x, pointf4.y);
	//  250  488:aload_0         
	//  251  489:aload           17
	//  252  491:getfield        #208 <Field float PointF.x>
	//  253  494:aload           17
	//  254  496:getfield        #211 <Field float PointF.y>
	//  255  499:invokevirtual   #214 <Method float distanceToCenter(float, float)>
	//  256  502:fstore_2        
			f2 = Utils.convertDpToPixel(5F);
	//  257  503:ldc1            #224 <Float 5F>
	//  258  505:invokestatic    #110 <Method float Utils.convertDpToPixel(float)>
	//  259  508:fstore_3        
			float f4 = f11;
	//  260  509:fload           10
	//  261  511:fstore          4
			if(f < f1)
	//* 262  513:fload_1         
	//* 263  514:fload_2         
	//* 264  515:fcmpg           
	//* 265  516:ifge            526
				f4 = f2 + (f1 - f);
	//  266  519:fload_3         
	//  267  520:fload_2         
	//  268  521:fload_1         
	//  269  522:fsub            
	//  270  523:fadd            
	//  271  524:fstore          4
			f2 = f7;
	//  272  526:fload           6
	//  273  528:fstore_3        
			f = f9;
	//  274  529:fload           8
	//  275  531:fstore_1        
			f1 = f4;
	//  276  532:fload           4
	//  277  534:fstore_2        
			f6 = f8;
	//  278  535:fload           7
	//  279  537:fstore          5
			if(pointf2.y >= pointf.y)
	//* 280  539:aload           16
	//* 281  541:getfield        #211 <Field float PointF.y>
	//* 282  544:aload           15
	//* 283  546:getfield        #211 <Field float PointF.y>
	//* 284  549:fcmpl           
	//* 285  550:iflt            146
			{
				f2 = f7;
	//  286  553:fload           6
	//  287  555:fstore_3        
				f = f9;
	//  288  556:fload           8
	//  289  558:fstore_1        
				f1 = f4;
	//  290  559:fload           4
	//  291  561:fstore_2        
				f6 = f8;
	//  292  562:fload           7
	//  293  564:fstore          5
				if((float)getHeight() - f10 > (float)getWidth())
	//* 294  566:aload_0         
	//* 295  567:invokevirtual   #227 <Method int getHeight()>
	//* 296  570:i2f             
	//* 297  571:fload           9
	//* 298  573:fsub            
	//* 299  574:aload_0         
	//* 300  575:invokevirtual   #201 <Method int getWidth()>
	//* 301  578:i2f             
	//* 302  579:fcmpl           
	//* 303  580:ifle            146
				{
					f1 = f10;
	//  304  583:fload           9
	//  305  585:fstore_2        
					f2 = f7;
	//  306  586:fload           6
	//  307  588:fstore_3        
					f = f9;
	//  308  589:fload           8
	//  309  591:fstore_1        
					f6 = f8;
	//  310  592:fload           7
	//  311  594:fstore          5
				}
			}
			continue; /* Loop/switch isn't completed */
	//  312  596:goto            146
		}
		if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART_CENTER)
	//* 313  599:aload_0         
	//* 314  600:getfield        #59  <Field Legend mLegend>
	//* 315  603:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 316  606:getstatic       #230 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART_CENTER>
	//* 317  609:if_acmpne       633
		{
			f += Utils.convertDpToPixel(13F);
	//  318  612:fload_1         
	//  319  613:ldc1            #104 <Float 13F>
	//  320  615:invokestatic    #110 <Method float Utils.convertDpToPixel(float)>
	//  321  618:fadd            
	//  322  619:fstore_1        
			f2 = f7;
	//  323  620:fload           6
	//  324  622:fstore_3        
			f1 = f10;
	//  325  623:fload           9
	//  326  625:fstore_2        
			f6 = f8;
	//  327  626:fload           7
	//  328  628:fstore          5
			continue; /* Loop/switch isn't completed */
	//  329  630:goto            146
		}
		if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.LEFT_OF_CHART)
	//* 330  633:aload_0         
	//* 331  634:getfield        #59  <Field Legend mLegend>
	//* 332  637:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 333  640:getstatic       #233 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.LEFT_OF_CHART>
	//* 334  643:if_acmpne       849
		{
			f9 = f + Utils.convertDpToPixel(8F);
	//  335  646:fload_1         
	//  336  647:ldc1            #186 <Float 8F>
	//  337  649:invokestatic    #110 <Method float Utils.convertDpToPixel(float)>
	//  338  652:fadd            
	//  339  653:fstore          8
			f = mLegend.mNeededHeight;
	//  340  655:aload_0         
	//  341  656:getfield        #59  <Field Legend mLegend>
	//  342  659:getfield        #189 <Field float Legend.mNeededHeight>
	//  343  662:fstore_1        
			f1 = mLegend.mTextHeightMax;
	//  344  663:aload_0         
	//  345  664:getfield        #59  <Field Legend mLegend>
	//  346  667:getfield        #192 <Field float Legend.mTextHeightMax>
	//  347  670:fstore_2        
			PointF pointf1 = getCenter();
	//  348  671:aload_0         
	//  349  672:invokevirtual   #196 <Method PointF getCenter()>
	//  350  675:astore          15
			PointF pointf3 = new PointF(f9 - 15F, 15F + (f + f1));
	//  351  677:new             #198 <Class PointF>
	//  352  680:dup             
	//  353  681:fload           8
	//  354  683:ldc1            #202 <Float 15F>
	//  355  685:fsub            
	//  356  686:ldc1            #202 <Float 15F>
	//  357  688:fload_1         
	//  358  689:fload_2         
	//  359  690:fadd            
	//  360  691:fadd            
	//  361  692:invokespecial   #205 <Method void PointF(float, float)>
	//  362  695:astore          16
			f = distanceToCenter(pointf3.x, pointf3.y);
	//  363  697:aload_0         
	//  364  698:aload           16
	//  365  700:getfield        #208 <Field float PointF.x>
	//  366  703:aload           16
	//  367  705:getfield        #211 <Field float PointF.y>
	//  368  708:invokevirtual   #214 <Method float distanceToCenter(float, float)>
	//  369  711:fstore_1        
			PointF pointf5 = getPosition(pointf1, getRadius(), getAngleForPoint(pointf3.x, pointf3.y));
	//  370  712:aload_0         
	//  371  713:aload           15
	//  372  715:aload_0         
	//  373  716:invokevirtual   #217 <Method float getRadius()>
	//  374  719:aload_0         
	//  375  720:aload           16
	//  376  722:getfield        #208 <Field float PointF.x>
	//  377  725:aload           16
	//  378  727:getfield        #211 <Field float PointF.y>
	//  379  730:invokevirtual   #220 <Method float getAngleForPoint(float, float)>
	//  380  733:invokevirtual   #223 <Method PointF getPosition(PointF, float, float)>
	//  381  736:astore          17
			f1 = distanceToCenter(pointf5.x, pointf5.y);
	//  382  738:aload_0         
	//  383  739:aload           17
	//  384  741:getfield        #208 <Field float PointF.x>
	//  385  744:aload           17
	//  386  746:getfield        #211 <Field float PointF.y>
	//  387  749:invokevirtual   #214 <Method float distanceToCenter(float, float)>
	//  388  752:fstore_2        
			f2 = Utils.convertDpToPixel(5F);
	//  389  753:ldc1            #224 <Float 5F>
	//  390  755:invokestatic    #110 <Method float Utils.convertDpToPixel(float)>
	//  391  758:fstore_3        
			float f5 = f6;
	//  392  759:fload           5
	//  393  761:fstore          4
			if(f < f1)
	//* 394  763:fload_1         
	//* 395  764:fload_2         
	//* 396  765:fcmpg           
	//* 397  766:ifge            776
				f5 = f2 + (f1 - f);
	//  398  769:fload_3         
	//  399  770:fload_2         
	//  400  771:fload_1         
	//  401  772:fsub            
	//  402  773:fadd            
	//  403  774:fstore          4
			f2 = f7;
	//  404  776:fload           6
	//  405  778:fstore_3        
			f = f5;
	//  406  779:fload           4
	//  407  781:fstore_1        
			f1 = f10;
	//  408  782:fload           9
	//  409  784:fstore_2        
			f6 = f8;
	//  410  785:fload           7
	//  411  787:fstore          5
			if(pointf3.y >= pointf1.y)
	//* 412  789:aload           16
	//* 413  791:getfield        #211 <Field float PointF.y>
	//* 414  794:aload           15
	//* 415  796:getfield        #211 <Field float PointF.y>
	//* 416  799:fcmpl           
	//* 417  800:iflt            146
			{
				f2 = f7;
	//  418  803:fload           6
	//  419  805:fstore_3        
				f = f5;
	//  420  806:fload           4
	//  421  808:fstore_1        
				f1 = f10;
	//  422  809:fload           9
	//  423  811:fstore_2        
				f6 = f8;
	//  424  812:fload           7
	//  425  814:fstore          5
				if((float)getHeight() - f9 > (float)getWidth())
	//* 426  816:aload_0         
	//* 427  817:invokevirtual   #227 <Method int getHeight()>
	//* 428  820:i2f             
	//* 429  821:fload           8
	//* 430  823:fsub            
	//* 431  824:aload_0         
	//* 432  825:invokevirtual   #201 <Method int getWidth()>
	//* 433  828:i2f             
	//* 434  829:fcmpl           
	//* 435  830:ifle            146
				{
					f = f9;
	//  436  833:fload           8
	//  437  835:fstore_1        
					f2 = f7;
	//  438  836:fload           6
	//  439  838:fstore_3        
					f1 = f10;
	//  440  839:fload           9
	//  441  841:fstore_2        
					f6 = f8;
	//  442  842:fload           7
	//  443  844:fstore          5
				}
			}
			continue; /* Loop/switch isn't completed */
	//  444  846:goto            146
		}
		if(mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_LEFT || mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_RIGHT || mLegend.getPosition() == com.github.mikephil.charting.components.Legend.LegendPosition.BELOW_CHART_CENTER)
	//* 445  849:aload_0         
	//* 446  850:getfield        #59  <Field Legend mLegend>
	//* 447  853:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 448  856:getstatic       #236 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_LEFT>
	//* 449  859:if_acmpeq       888
	//* 450  862:aload_0         
	//* 451  863:getfield        #59  <Field Legend mLegend>
	//* 452  866:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 453  869:getstatic       #239 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_RIGHT>
	//* 454  872:if_acmpeq       888
	//* 455  875:aload_0         
	//* 456  876:getfield        #59  <Field Legend mLegend>
	//* 457  879:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 458  882:getstatic       #242 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.BELOW_CHART_CENTER>
	//* 459  885:if_acmpne       934
		{
			f = getRequiredLegendOffset();
	//  460  888:aload_0         
	//  461  889:invokevirtual   #245 <Method float getRequiredLegendOffset()>
	//  462  892:fstore_1        
			f2 = Math.min(mLegend.mNeededHeight + f, mViewPortHandler.getChartHeight() * mLegend.getMaxSizePercent());
	//  463  893:aload_0         
	//  464  894:getfield        #59  <Field Legend mLegend>
	//  465  897:getfield        #189 <Field float Legend.mNeededHeight>
	//  466  900:fload_1         
	//  467  901:fadd            
	//  468  902:aload_0         
	//  469  903:getfield        #72  <Field ViewPortHandler mViewPortHandler>
	//  470  906:invokevirtual   #248 <Method float ViewPortHandler.getChartHeight()>
	//  471  909:aload_0         
	//  472  910:getfield        #59  <Field Legend mLegend>
	//  473  913:invokevirtual   #81  <Method float Legend.getMaxSizePercent()>
	//  474  916:fmul            
	//  475  917:invokestatic    #87  <Method float Math.min(float, float)>
	//  476  920:fstore_3        
			f = f9;
	//  477  921:fload           8
	//  478  923:fstore_1        
			f1 = f10;
	//  479  924:fload           9
	//  480  926:fstore_2        
			f6 = f8;
	//  481  927:fload           7
	//  482  929:fstore          5
			continue; /* Loop/switch isn't completed */
	//  483  931:goto            146
		}
		if(mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_LEFT && mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_RIGHT)
	//* 484  934:aload_0         
	//* 485  935:getfield        #59  <Field Legend mLegend>
	//* 486  938:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 487  941:getstatic       #251 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_LEFT>
	//* 488  944:if_acmpeq       986
	//* 489  947:aload_0         
	//* 490  948:getfield        #59  <Field Legend mLegend>
	//* 491  951:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//* 492  954:getstatic       #254 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_RIGHT>
	//* 493  957:if_acmpeq       986
		{
			f2 = f7;
	//  494  960:fload           6
	//  495  962:fstore_3        
			f = f9;
	//  496  963:fload           8
	//  497  965:fstore_1        
			f1 = f10;
	//  498  966:fload           9
	//  499  968:fstore_2        
			f6 = f8;
	//  500  969:fload           7
	//  501  971:fstore          5
			if(mLegend.getPosition() != com.github.mikephil.charting.components.Legend.LegendPosition.ABOVE_CHART_CENTER)
				continue; /* Loop/switch isn't completed */
	//  502  973:aload_0         
	//  503  974:getfield        #59  <Field Legend mLegend>
	//  504  977:invokevirtual   #97  <Method com.github.mikephil.charting.components.Legend$LegendPosition Legend.getPosition()>
	//  505  980:getstatic       #257 <Field com.github.mikephil.charting.components.Legend$LegendPosition com.github.mikephil.charting.components.Legend$LegendPosition.ABOVE_CHART_CENTER>
	//  506  983:if_acmpne       146
		}
		f = getRequiredLegendOffset();
	//  507  986:aload_0         
	//  508  987:invokevirtual   #245 <Method float getRequiredLegendOffset()>
	//  509  990:fstore_1        
		f6 = Math.min(mLegend.mNeededHeight + f, mViewPortHandler.getChartHeight() * mLegend.getMaxSizePercent());
	//  510  991:aload_0         
	//  511  992:getfield        #59  <Field Legend mLegend>
	//  512  995:getfield        #189 <Field float Legend.mNeededHeight>
	//  513  998:fload_1         
	//  514  999:fadd            
	//  515 1000:aload_0         
	//  516 1001:getfield        #72  <Field ViewPortHandler mViewPortHandler>
	//  517 1004:invokevirtual   #248 <Method float ViewPortHandler.getChartHeight()>
	//  518 1007:aload_0         
	//  519 1008:getfield        #59  <Field Legend mLegend>
	//  520 1011:invokevirtual   #81  <Method float Legend.getMaxSizePercent()>
	//  521 1014:fmul            
	//  522 1015:invokestatic    #87  <Method float Math.min(float, float)>
	//  523 1018:fstore          5
		f2 = f7;
	//  524 1020:fload           6
	//  525 1022:fstore_3        
		f = f9;
	//  526 1023:fload           8
	//  527 1025:fstore_1        
		f1 = f10;
	//  528 1026:fload           9
	//  529 1028:fstore_2        
		if(true) goto _L7; else goto _L6
	//  530 1029:goto            146
_L6:
	}

	public void computeScroll()
	{
		if(mChartTouchListener instanceof PieRadarChartTouchListener)
	//*   0    0:aload_0         
	//*   1    1:getfield        #262 <Field ChartTouchListener mChartTouchListener>
	//*   2    4:instanceof      #264 <Class PieRadarChartTouchListener>
	//*   3    7:ifeq            20
			((PieRadarChartTouchListener)mChartTouchListener).computeScroll();
	//    4   10:aload_0         
	//    5   11:getfield        #262 <Field ChartTouchListener mChartTouchListener>
	//    6   14:checkcast       #264 <Class PieRadarChartTouchListener>
	//    7   17:invokevirtual   #266 <Method void PieRadarChartTouchListener.computeScroll()>
	//    8   20:return          
	}

	public float distanceToCenter(float f, float f1)
	{
		PointF pointf = getCenterOffsets();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method PointF getCenterOffsets()>
	//    2    4:astore_3        
		if(f > pointf.x)
	//*   3    5:fload_1         
	//*   4    6:aload_3         
	//*   5    7:getfield        #208 <Field float PointF.x>
	//*   6   10:fcmpl           
	//*   7   11:ifle            59
			f -= pointf.x;
	//    8   14:fload_1         
	//    9   15:aload_3         
	//   10   16:getfield        #208 <Field float PointF.x>
	//   11   19:fsub            
	//   12   20:fstore_1        
		else
	//*  13   21:fload_2         
	//*  14   22:aload_3         
	//*  15   23:getfield        #211 <Field float PointF.y>
	//*  16   26:fcmpl           
	//*  17   27:ifle            69
	//*  18   30:fload_2         
	//*  19   31:aload_3         
	//*  20   32:getfield        #211 <Field float PointF.y>
	//*  21   35:fsub            
	//*  22   36:fstore_2        
	//*  23   37:fload_1         
	//*  24   38:f2d             
	//*  25   39:ldc2w           #270 <Double 2D>
	//*  26   42:invokestatic    #275 <Method double Math.pow(double, double)>
	//*  27   45:fload_2         
	//*  28   46:f2d             
	//*  29   47:ldc2w           #270 <Double 2D>
	//*  30   50:invokestatic    #275 <Method double Math.pow(double, double)>
	//*  31   53:dadd            
	//*  32   54:invokestatic    #279 <Method double Math.sqrt(double)>
	//*  33   57:d2f             
	//*  34   58:freturn         
			f = pointf.x - f;
	//   35   59:aload_3         
	//   36   60:getfield        #208 <Field float PointF.x>
	//   37   63:fload_1         
	//   38   64:fsub            
	//   39   65:fstore_1        
		if(f1 > pointf.y)
			f1 -= pointf.y;
		else
	//*  40   66:goto            21
			f1 = pointf.y - f1;
	//   41   69:aload_3         
	//   42   70:getfield        #211 <Field float PointF.y>
	//   43   73:fload_2         
	//   44   74:fsub            
	//   45   75:fstore_2        
		return (float)Math.sqrt(Math.pow(f, 2D) + Math.pow(f1, 2D));
	//*  46   76:goto            37
	}

	public float getAngleForPoint(float f, float f1)
	{
		PointF pointf = getCenterOffsets();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #269 <Method PointF getCenterOffsets()>
	//    2    4:astore          8
		double d = f - pointf.x;
	//    3    6:fload_1         
	//    4    7:aload           8
	//    5    9:getfield        #208 <Field float PointF.x>
	//    6   12:fsub            
	//    7   13:f2d             
	//    8   14:dstore_3        
		double d1 = f1 - pointf.y;
	//    9   15:fload_2         
	//   10   16:aload           8
	//   11   18:getfield        #211 <Field float PointF.y>
	//   12   21:fsub            
	//   13   22:f2d             
	//   14   23:dstore          5
		float f2 = (float)Math.toDegrees(Math.acos(d1 / Math.sqrt(d * d + d1 * d1)));
	//   15   25:dload           5
	//   16   27:dload_3         
	//   17   28:dload_3         
	//   18   29:dmul            
	//   19   30:dload           5
	//   20   32:dload           5
	//   21   34:dmul            
	//   22   35:dadd            
	//   23   36:invokestatic    #279 <Method double Math.sqrt(double)>
	//   24   39:ddiv            
	//   25   40:invokestatic    #282 <Method double Math.acos(double)>
	//   26   43:invokestatic    #285 <Method double Math.toDegrees(double)>
	//   27   46:d2f             
	//   28   47:fstore          7
		f1 = f2;
	//   29   49:fload           7
	//   30   51:fstore_2        
		if(f > pointf.x)
	//*  31   52:fload_1         
	//*  32   53:aload           8
	//*  33   55:getfield        #208 <Field float PointF.x>
	//*  34   58:fcmpl           
	//*  35   59:ifle            69
			f1 = 360F - f2;
	//   36   62:ldc2            #286 <Float 360F>
	//   37   65:fload           7
	//   38   67:fsub            
	//   39   68:fstore_2        
		f1 += 90F;
	//   40   69:fload_2         
	//   41   70:ldc2            #287 <Float 90F>
	//   42   73:fadd            
	//   43   74:fstore_2        
		f = f1;
	//   44   75:fload_2         
	//   45   76:fstore_1        
		if(f1 > 360F)
	//*  46   77:fload_2         
	//*  47   78:ldc2            #286 <Float 360F>
	//*  48   81:fcmpl           
	//*  49   82:ifle            91
			f = f1 - 360F;
	//   50   85:fload_2         
	//   51   86:ldc2            #286 <Float 360F>
	//   52   89:fsub            
	//   53   90:fstore_1        
		return f;
	//   54   91:fload_1         
	//   55   92:freturn         
	}

	public float getDiameter()
	{
		RectF rectf = mViewPortHandler.getContentRect();
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field ViewPortHandler mViewPortHandler>
	//    2    4:invokevirtual   #292 <Method RectF ViewPortHandler.getContentRect()>
	//    3    7:astore_1        
		return Math.min(rectf.width(), rectf.height());
	//    4    8:aload_1         
	//    5    9:invokevirtual   #297 <Method float RectF.width()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #300 <Method float RectF.height()>
	//    8   16:invokestatic    #87  <Method float Math.min(float, float)>
	//    9   19:freturn         
	}

	public abstract int getIndexForAngle(float f);

	public float getMinOffset()
	{
		return mMinOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field float mMinOffset>
	//    2    4:freturn         
	}

	protected PointF getPosition(PointF pointf, float f, float f1)
	{
		return new PointF((float)((double)pointf.x + (double)f * Math.cos(Math.toRadians(f1))), (float)((double)pointf.y + (double)f * Math.sin(Math.toRadians(f1))));
	//    0    0:new             #198 <Class PointF>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:getfield        #208 <Field float PointF.x>
	//    4    8:f2d             
	//    5    9:fload_2         
	//    6   10:f2d             
	//    7   11:fload_3         
	//    8   12:f2d             
	//    9   13:invokestatic    #306 <Method double Math.toRadians(double)>
	//   10   16:invokestatic    #309 <Method double Math.cos(double)>
	//   11   19:dmul            
	//   12   20:dadd            
	//   13   21:d2f             
	//   14   22:aload_1         
	//   15   23:getfield        #211 <Field float PointF.y>
	//   16   26:f2d             
	//   17   27:fload_2         
	//   18   28:f2d             
	//   19   29:fload_3         
	//   20   30:f2d             
	//   21   31:invokestatic    #306 <Method double Math.toRadians(double)>
	//   22   34:invokestatic    #312 <Method double Math.sin(double)>
	//   23   37:dmul            
	//   24   38:dadd            
	//   25   39:d2f             
	//   26   40:invokespecial   #205 <Method void PointF(float, float)>
	//   27   43:areturn         
	}

	public abstract float getRadius();

	public float getRawRotationAngle()
	{
		return mRawRotationAngle;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field float mRawRotationAngle>
	//    2    4:freturn         
	}

	protected abstract float getRequiredBaseOffset();

	protected abstract float getRequiredLegendOffset();

	public float getRotationAngle()
	{
		return mRotationAngle;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field float mRotationAngle>
	//    2    4:freturn         
	}

	public List getSelectionDetailsAtIndex(int i)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #318 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #319 <Method void ArrayList()>
	//    3    7:astore          4
		int j = 0;
	//    4    9:iconst_0        
	//    5   10:istore_3        
		while(j < mData.getDataSetCount()) 
	//*   6   11:iload_3         
	//*   7   12:aload_0         
	//*   8   13:getfield        #39  <Field ChartData mData>
	//*   9   16:invokevirtual   #322 <Method int ChartData.getDataSetCount()>
	//*  10   19:icmpge          78
		{
			IDataSet idataset = mData.getDataSetByIndex(j);
	//   11   22:aload_0         
	//   12   23:getfield        #39  <Field ChartData mData>
	//   13   26:iload_3         
	//   14   27:invokevirtual   #326 <Method IDataSet ChartData.getDataSetByIndex(int)>
	//   15   30:astore          5
			float f = idataset.getYValForXIndex(i);
	//   16   32:aload           5
	//   17   34:iload_1         
	//   18   35:invokeinterface #332 <Method float IDataSet.getYValForXIndex(int)>
	//   19   40:fstore_2        
			if(f != (0.0F / 0.0F))
	//*  20   41:fload_2         
	//*  21   42:ldc2            #333 <Float (0.0F / 0.0F)>
	//*  22   45:fcmpl           
	//*  23   46:ifne            56
	//*  24   49:iload_3         
	//*  25   50:iconst_1        
	//*  26   51:iadd            
	//*  27   52:istore_3        
	//*  28   53:goto            11
				((List) (arraylist)).add(((Object) (new SelectionDetail(f, j, idataset))));
	//   29   56:aload           4
	//   30   58:new             #335 <Class SelectionDetail>
	//   31   61:dup             
	//   32   62:fload_2         
	//   33   63:iload_3         
	//   34   64:aload           5
	//   35   66:invokespecial   #338 <Method void SelectionDetail(float, int, IDataSet)>
	//   36   69:invokeinterface #342 <Method boolean List.add(Object)>
	//   37   74:pop             
			j++;
		}
	//*  38   75:goto            49
		return ((List) (arraylist));
	//   39   78:aload           4
	//   40   80:areturn         
	}

	public float getYChartMax()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public float getYChartMin()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	protected void init()
	{
		super.init();
	//    0    0:aload_0         
	//    1    1:invokespecial   #349 <Method void Chart.init()>
		mChartTouchListener = ((ChartTouchListener) (new PieRadarChartTouchListener(this)));
	//    2    4:aload_0         
	//    3    5:new             #264 <Class PieRadarChartTouchListener>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #352 <Method void PieRadarChartTouchListener(PieRadarChartBase)>
	//    7   13:putfield        #262 <Field ChartTouchListener mChartTouchListener>
	//    8   16:return          
	}

	public boolean isRotationEnabled()
	{
		return mRotateEnabled;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean mRotateEnabled>
	//    2    4:ireturn         
	}

	public void notifyDataSetChanged()
	{
		if(mData == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field ChartData mData>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		calcMinMax();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #356 <Method void calcMinMax()>
		if(mLegend != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #59  <Field Legend mLegend>
	//*   8   16:ifnull          30
			mLegendRenderer.computeLegend(mData);
	//    9   19:aload_0         
	//   10   20:getfield        #360 <Field LegendRenderer mLegendRenderer>
	//   11   23:aload_0         
	//   12   24:getfield        #39  <Field ChartData mData>
	//   13   27:invokevirtual   #366 <Method void LegendRenderer.computeLegend(ChartData)>
		calculateOffsets();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #368 <Method void calculateOffsets()>
	//   16   34:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mTouchEnabled && mChartTouchListener != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #373 <Field boolean mTouchEnabled>
	//*   2    4:ifeq            24
	//*   3    7:aload_0         
	//*   4    8:getfield        #262 <Field ChartTouchListener mChartTouchListener>
	//*   5   11:ifnull          24
			return mChartTouchListener.onTouch(((android.view.View) (this)), motionevent);
	//    6   14:aload_0         
	//    7   15:getfield        #262 <Field ChartTouchListener mChartTouchListener>
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:invokevirtual   #379 <Method boolean ChartTouchListener.onTouch(android.view.View, MotionEvent)>
	//   11   23:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokespecial   #381 <Method boolean Chart.onTouchEvent(MotionEvent)>
	//   15   29:ireturn         
	}

	public void setMinOffset(float f)
	{
		mMinOffset = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #26  <Field float mMinOffset>
	//    3    5:return          
	}

	public void setRotationAngle(float f)
	{
		mRawRotationAngle = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #22  <Field float mRawRotationAngle>
		mRotationAngle = Utils.getNormalizedAngle(mRawRotationAngle);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #22  <Field float mRawRotationAngle>
	//    6   10:invokestatic    #387 <Method float Utils.getNormalizedAngle(float)>
	//    7   13:putfield        #20  <Field float mRotationAngle>
	//    8   16:return          
	}

	public void setRotationEnabled(boolean flag)
	{
		mRotateEnabled = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean mRotateEnabled>
	//    3    5:return          
	}

	public void spin(int i, float f, float f1, com.github.mikephil.charting.animation.Easing.EasingOption easingoption)
	{
		if(android.os.Build.VERSION.SDK_INT < 11)
	//*   0    0:getstatic       #399 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmpge          9
		{
			return;
	//    3    8:return          
		} else
		{
			setRotationAngle(f);
	//    4    9:aload_0         
	//    5   10:fload_2         
	//    6   11:invokevirtual   #401 <Method void setRotationAngle(float)>
			ObjectAnimator objectanimator = ObjectAnimator.ofFloat(((Object) (this)), "rotationAngle", new float[] {
				f, f1
			});
	//    7   14:aload_0         
	//    8   15:ldc2            #403 <String "rotationAngle">
	//    9   18:iconst_2        
	//   10   19:newarray        float[]
	//   11   21:dup             
	//   12   22:iconst_0        
	//   13   23:fload_2         
	//   14   24:fastore         
	//   15   25:dup             
	//   16   26:iconst_1        
	//   17   27:fload_3         
	//   18   28:fastore         
	//   19   29:invokestatic    #409 <Method ObjectAnimator ObjectAnimator.ofFloat(Object, String, float[])>
	//   20   32:astore          5
			objectanimator.setDuration(i);
	//   21   34:aload           5
	//   22   36:iload_1         
	//   23   37:i2l             
	//   24   38:invokevirtual   #413 <Method ObjectAnimator ObjectAnimator.setDuration(long)>
	//   25   41:pop             
			objectanimator.setInterpolator(((android.animation.TimeInterpolator) (Easing.getEasingFunctionFromOption(easingoption))));
	//   26   42:aload           5
	//   27   44:aload           4
	//   28   46:invokestatic    #419 <Method com.github.mikephil.charting.animation.EasingFunction Easing.getEasingFunctionFromOption(com.github.mikephil.charting.animation.Easing$EasingOption)>
	//   29   49:invokevirtual   #423 <Method void ObjectAnimator.setInterpolator(android.animation.TimeInterpolator)>
			objectanimator.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() {

				public void onAnimationUpdate(ValueAnimator valueanimator)
				{
					postInvalidate();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field PieRadarChartBase this$0>
				//    2    4:invokevirtual   #26  <Method void PieRadarChartBase.postInvalidate()>
				//    3    7:return          
				}

				final PieRadarChartBase this$0;

			
			{
				this$0 = PieRadarChartBase.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field PieRadarChartBase this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//   30   52:aload           5
	//   31   54:new             #7   <Class PieRadarChartBase$1>
	//   32   57:dup             
	//   33   58:aload_0         
	//   34   59:invokespecial   #424 <Method void PieRadarChartBase$1(PieRadarChartBase)>
	//   35   62:invokevirtual   #428 <Method void ObjectAnimator.addUpdateListener(android.animation.ValueAnimator$AnimatorUpdateListener)>
			objectanimator.start();
	//   36   65:aload           5
	//   37   67:invokevirtual   #431 <Method void ObjectAnimator.start()>
			return;
	//   38   70:return          
		}
	}

	protected float mMinOffset;
	private float mRawRotationAngle;
	protected boolean mRotateEnabled;
	private float mRotationAngle;
}
