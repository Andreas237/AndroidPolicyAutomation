// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.listener;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Log;
import android.view.*;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.charts.HorizontalBarChart;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.utils.Utils;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.listener:
//			ChartTouchListener, OnChartGestureListener

public class BarLineChartTouchListener extends ChartTouchListener
{

	public BarLineChartTouchListener(BarLineChartBase barlinechartbase, Matrix matrix)
	{
		super(((com.github.mikephil.charting.charts.Chart) (barlinechartbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void ChartTouchListener(com.github.mikephil.charting.charts.Chart)>
		mMatrix = new Matrix();
	//    3    5:aload_0         
	//    4    6:new             #30  <Class Matrix>
	//    5    9:dup             
	//    6   10:invokespecial   #33  <Method void Matrix()>
	//    7   13:putfield        #35  <Field Matrix mMatrix>
		mSavedMatrix = new Matrix();
	//    8   16:aload_0         
	//    9   17:new             #30  <Class Matrix>
	//   10   20:dup             
	//   11   21:invokespecial   #33  <Method void Matrix()>
	//   12   24:putfield        #37  <Field Matrix mSavedMatrix>
		mTouchStartPoint = new PointF();
	//   13   27:aload_0         
	//   14   28:new             #39  <Class PointF>
	//   15   31:dup             
	//   16   32:invokespecial   #40  <Method void PointF()>
	//   17   35:putfield        #42  <Field PointF mTouchStartPoint>
		mTouchPointCenter = new PointF();
	//   18   38:aload_0         
	//   19   39:new             #39  <Class PointF>
	//   20   42:dup             
	//   21   43:invokespecial   #40  <Method void PointF()>
	//   22   46:putfield        #44  <Field PointF mTouchPointCenter>
		mSavedXDist = 1.0F;
	//   23   49:aload_0         
	//   24   50:fconst_1        
	//   25   51:putfield        #46  <Field float mSavedXDist>
		mSavedYDist = 1.0F;
	//   26   54:aload_0         
	//   27   55:fconst_1        
	//   28   56:putfield        #48  <Field float mSavedYDist>
		mSavedDist = 1.0F;
	//   29   59:aload_0         
	//   30   60:fconst_1        
	//   31   61:putfield        #50  <Field float mSavedDist>
		mDecelerationLastTime = 0L;
	//   32   64:aload_0         
	//   33   65:lconst_0        
	//   34   66:putfield        #52  <Field long mDecelerationLastTime>
		mDecelerationCurrentPoint = new PointF();
	//   35   69:aload_0         
	//   36   70:new             #39  <Class PointF>
	//   37   73:dup             
	//   38   74:invokespecial   #40  <Method void PointF()>
	//   39   77:putfield        #54  <Field PointF mDecelerationCurrentPoint>
		mDecelerationVelocity = new PointF();
	//   40   80:aload_0         
	//   41   81:new             #39  <Class PointF>
	//   42   84:dup             
	//   43   85:invokespecial   #40  <Method void PointF()>
	//   44   88:putfield        #56  <Field PointF mDecelerationVelocity>
		mMatrix = matrix;
	//   45   91:aload_0         
	//   46   92:aload_2         
	//   47   93:putfield        #35  <Field Matrix mMatrix>
	//   48   96:return          
	}

	private static float getXDist(MotionEvent motionevent)
	{
		return Math.abs(motionevent.getX(0) - motionevent.getX(1));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #67  <Method float MotionEvent.getX(int)>
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #67  <Method float MotionEvent.getX(int)>
	//    6   10:fsub            
	//    7   11:invokestatic    #73  <Method float Math.abs(float)>
	//    8   14:freturn         
	}

	private static float getYDist(MotionEvent motionevent)
	{
		return Math.abs(motionevent.getY(0) - motionevent.getY(1));
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #77  <Method float MotionEvent.getY(int)>
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #77  <Method float MotionEvent.getY(int)>
	//    6   10:fsub            
	//    7   11:invokestatic    #73  <Method float Math.abs(float)>
	//    8   14:freturn         
	}

	private static void midPoint(PointF pointf, MotionEvent motionevent)
	{
		float f = motionevent.getX(0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #67  <Method float MotionEvent.getX(int)>
	//    3    5:fstore_2        
		float f1 = motionevent.getX(1);
	//    4    6:aload_1         
	//    5    7:iconst_1        
	//    6    8:invokevirtual   #67  <Method float MotionEvent.getX(int)>
	//    7   11:fstore_3        
		float f2 = motionevent.getY(0);
	//    8   12:aload_1         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #77  <Method float MotionEvent.getY(int)>
	//   11   17:fstore          4
		float f3 = motionevent.getY(1);
	//   12   19:aload_1         
	//   13   20:iconst_1        
	//   14   21:invokevirtual   #77  <Method float MotionEvent.getY(int)>
	//   15   24:fstore          5
		pointf.set((f + f1) / 2.0F, (f2 + f3) / 2.0F);
	//   16   26:aload_0         
	//   17   27:fload_2         
	//   18   28:fload_3         
	//   19   29:fadd            
	//   20   30:fconst_2        
	//   21   31:fdiv            
	//   22   32:fload           4
	//   23   34:fload           5
	//   24   36:fadd            
	//   25   37:fconst_2        
	//   26   38:fdiv            
	//   27   39:invokevirtual   #83  <Method void PointF.set(float, float)>
	//   28   42:return          
	}

	private void performDrag(MotionEvent motionevent)
	{
		mLastGesture = ChartTouchListener.ChartGesture.DRAG;
	//    0    0:aload_0         
	//    1    1:getstatic       #91  <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.DRAG>
	//    2    4:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
		mMatrix.set(mSavedMatrix);
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field Matrix mMatrix>
	//    5   11:aload_0         
	//    6   12:getfield        #37  <Field Matrix mSavedMatrix>
	//    7   15:invokevirtual   #97  <Method void Matrix.set(Matrix)>
		OnChartGestureListener onchartgesturelistener = ((BarLineChartBase)mChart).getOnChartGestureListener();
	//    8   18:aload_0         
	//    9   19:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   10   22:checkcast       #103 <Class BarLineChartBase>
	//   11   25:invokevirtual   #107 <Method OnChartGestureListener BarLineChartBase.getOnChartGestureListener()>
	//   12   28:astore          4
		float f;
		float f1;
		if(((BarLineChartBase)mChart).isAnyAxisInverted() && mClosestDataSetToTouch != null && ((BarLineChartBase)mChart).getAxis(mClosestDataSetToTouch.getAxisDependency()).isInverted())
	//*  13   30:aload_0         
	//*  14   31:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  15   34:checkcast       #103 <Class BarLineChartBase>
	//*  16   37:invokevirtual   #111 <Method boolean BarLineChartBase.isAnyAxisInverted()>
	//*  17   40:ifeq            168
	//*  18   43:aload_0         
	//*  19   44:getfield        #113 <Field IDataSet mClosestDataSetToTouch>
	//*  20   47:ifnull          168
	//*  21   50:aload_0         
	//*  22   51:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  23   54:checkcast       #103 <Class BarLineChartBase>
	//*  24   57:aload_0         
	//*  25   58:getfield        #113 <Field IDataSet mClosestDataSetToTouch>
	//*  26   61:invokeinterface #119 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//*  27   66:invokevirtual   #123 <Method YAxis BarLineChartBase.getAxis(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  28   69:invokevirtual   #128 <Method boolean YAxis.isInverted()>
	//*  29   72:ifeq            168
		{
			if(mChart instanceof HorizontalBarChart)
	//*  30   75:aload_0         
	//*  31   76:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  32   79:instanceof      #130 <Class HorizontalBarChart>
	//*  33   82:ifeq            138
			{
				f = -(motionevent.getX() - mTouchStartPoint.x);
	//   34   85:aload_1         
	//   35   86:invokevirtual   #133 <Method float MotionEvent.getX()>
	//   36   89:aload_0         
	//   37   90:getfield        #42  <Field PointF mTouchStartPoint>
	//   38   93:getfield        #136 <Field float PointF.x>
	//   39   96:fsub            
	//   40   97:fneg            
	//   41   98:fstore_2        
				f1 = motionevent.getY() - mTouchStartPoint.y;
	//   42   99:aload_1         
	//   43  100:invokevirtual   #138 <Method float MotionEvent.getY()>
	//   44  103:aload_0         
	//   45  104:getfield        #42  <Field PointF mTouchStartPoint>
	//   46  107:getfield        #141 <Field float PointF.y>
	//   47  110:fsub            
	//   48  111:fstore_3        
			} else
	//*  49  112:aload_0         
	//*  50  113:getfield        #35  <Field Matrix mMatrix>
	//*  51  116:fload_2         
	//*  52  117:fload_3         
	//*  53  118:invokevirtual   #145 <Method boolean Matrix.postTranslate(float, float)>
	//*  54  121:pop             
	//*  55  122:aload           4
	//*  56  124:ifnull          137
	//*  57  127:aload           4
	//*  58  129:aload_1         
	//*  59  130:fload_2         
	//*  60  131:fload_3         
	//*  61  132:invokeinterface #151 <Method void OnChartGestureListener.onChartTranslate(MotionEvent, float, float)>
	//*  62  137:return          
			{
				f = motionevent.getX() - mTouchStartPoint.x;
	//   63  138:aload_1         
	//   64  139:invokevirtual   #133 <Method float MotionEvent.getX()>
	//   65  142:aload_0         
	//   66  143:getfield        #42  <Field PointF mTouchStartPoint>
	//   67  146:getfield        #136 <Field float PointF.x>
	//   68  149:fsub            
	//   69  150:fstore_2        
				f1 = -(motionevent.getY() - mTouchStartPoint.y);
	//   70  151:aload_1         
	//   71  152:invokevirtual   #138 <Method float MotionEvent.getY()>
	//   72  155:aload_0         
	//   73  156:getfield        #42  <Field PointF mTouchStartPoint>
	//   74  159:getfield        #141 <Field float PointF.y>
	//   75  162:fsub            
	//   76  163:fneg            
	//   77  164:fstore_3        
			}
		} else
	//*  78  165:goto            112
		{
			f = motionevent.getX() - mTouchStartPoint.x;
	//   79  168:aload_1         
	//   80  169:invokevirtual   #133 <Method float MotionEvent.getX()>
	//   81  172:aload_0         
	//   82  173:getfield        #42  <Field PointF mTouchStartPoint>
	//   83  176:getfield        #136 <Field float PointF.x>
	//   84  179:fsub            
	//   85  180:fstore_2        
			f1 = motionevent.getY() - mTouchStartPoint.y;
	//   86  181:aload_1         
	//   87  182:invokevirtual   #138 <Method float MotionEvent.getY()>
	//   88  185:aload_0         
	//   89  186:getfield        #42  <Field PointF mTouchStartPoint>
	//   90  189:getfield        #141 <Field float PointF.y>
	//   91  192:fsub            
	//   92  193:fstore_3        
		}
		mMatrix.postTranslate(f, f1);
		if(onchartgesturelistener != null)
			onchartgesturelistener.onChartTranslate(motionevent, f, f1);
	//*  93  194:goto            112
	}

	private void performHighlightDrag(MotionEvent motionevent)
	{
		motionevent = ((MotionEvent) (((BarLineChartBase)mChart).getHighlightByTouchPoint(motionevent.getX(), motionevent.getY())));
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//    2    4:checkcast       #103 <Class BarLineChartBase>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #133 <Method float MotionEvent.getX()>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #138 <Method float MotionEvent.getY()>
	//    7   15:invokevirtual   #156 <Method Highlight BarLineChartBase.getHighlightByTouchPoint(float, float)>
	//    8   18:astore_1        
		if(motionevent != null && !((Highlight) (motionevent)).equalTo(mLastHighlighted))
	//*   9   19:aload_1         
	//*  10   20:ifnull          50
	//*  11   23:aload_1         
	//*  12   24:aload_0         
	//*  13   25:getfield        #160 <Field Highlight mLastHighlighted>
	//*  14   28:invokevirtual   #166 <Method boolean Highlight.equalTo(Highlight)>
	//*  15   31:ifne            50
		{
			mLastHighlighted = ((Highlight) (motionevent));
	//   16   34:aload_0         
	//   17   35:aload_1         
	//   18   36:putfield        #160 <Field Highlight mLastHighlighted>
			((BarLineChartBase)mChart).highlightTouch(((Highlight) (motionevent)));
	//   19   39:aload_0         
	//   20   40:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   21   43:checkcast       #103 <Class BarLineChartBase>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #170 <Method void BarLineChartBase.highlightTouch(Highlight)>
		}
	//   24   50:return          
	}

	private void performZoom(MotionEvent motionevent)
	{
		if(motionevent.getPointerCount() < 2) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:invokevirtual   #175 <Method int MotionEvent.getPointerCount()>
	//    2    4:iconst_2        
	//    3    5:icmplt          195
_L1:
		float f;
		OnChartGestureListener onchartgesturelistener;
		onchartgesturelistener = ((BarLineChartBase)mChart).getOnChartGestureListener();
	//    4    8:aload_0         
	//    5    9:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//    6   12:checkcast       #103 <Class BarLineChartBase>
	//    7   15:invokevirtual   #107 <Method OnChartGestureListener BarLineChartBase.getOnChartGestureListener()>
	//    8   18:astore          6
		f = spacing(motionevent);
	//    9   20:aload_1         
	//   10   21:invokestatic    #178 <Method float spacing(MotionEvent)>
	//   11   24:fstore_2        
		if(f <= 10F) goto _L2; else goto _L3
	//   12   25:fload_2         
	//   13   26:ldc1            #179 <Float 10F>
	//   14   28:fcmpl           
	//   15   29:ifle            195
_L3:
		PointF pointf = getTrans(mTouchPointCenter.x, mTouchPointCenter.y);
	//   16   32:aload_0         
	//   17   33:aload_0         
	//   18   34:getfield        #44  <Field PointF mTouchPointCenter>
	//   19   37:getfield        #136 <Field float PointF.x>
	//   20   40:aload_0         
	//   21   41:getfield        #44  <Field PointF mTouchPointCenter>
	//   22   44:getfield        #141 <Field float PointF.y>
	//   23   47:invokevirtual   #183 <Method PointF getTrans(float, float)>
	//   24   50:astore          7
		if(mTouchMode != 4) goto _L5; else goto _L4
	//   25   52:aload_0         
	//   26   53:getfield        #187 <Field int mTouchMode>
	//   27   56:iconst_4        
	//   28   57:icmpne          230
_L4:
		mLastGesture = ChartTouchListener.ChartGesture.PINCH_ZOOM;
	//   29   60:aload_0         
	//   30   61:getstatic       #190 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.PINCH_ZOOM>
	//   31   64:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
		float f3 = f / mSavedDist;
	//   32   67:fload_2         
	//   33   68:aload_0         
	//   34   69:getfield        #50  <Field float mSavedDist>
	//   35   72:fdiv            
	//   36   73:fstore_3        
		boolean flag;
		boolean flag2;
		if(f3 < 1.0F)
	//*  37   74:fload_3         
	//*  38   75:fconst_1        
	//*  39   76:fcmpg           
	//*  40   77:ifge            196
			flag = true;
	//   41   80:iconst_1        
	//   42   81:istore          4
		else
	//*  43   83:iload           4
	//*  44   85:ifeq            202
	//*  45   88:aload_0         
	//*  46   89:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  47   92:checkcast       #103 <Class BarLineChartBase>
	//*  48   95:invokevirtual   #194 <Method ViewPortHandler BarLineChartBase.getViewPortHandler()>
	//*  49   98:invokevirtual   #199 <Method boolean ViewPortHandler.canZoomOutMoreX()>
	//*  50  101:istore          5
	//*  51  103:aload_0         
	//*  52  104:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  53  107:checkcast       #103 <Class BarLineChartBase>
	//*  54  110:invokevirtual   #202 <Method boolean BarLineChartBase.isScaleXEnabled()>
	//*  55  113:ifeq            220
	//*  56  116:fload_3         
	//*  57  117:fstore_2        
	//*  58  118:aload_0         
	//*  59  119:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  60  122:checkcast       #103 <Class BarLineChartBase>
	//*  61  125:invokevirtual   #205 <Method boolean BarLineChartBase.isScaleYEnabled()>
	//*  62  128:ifeq            225
	//*  63  131:aload_0         
	//*  64  132:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  65  135:checkcast       #103 <Class BarLineChartBase>
	//*  66  138:invokevirtual   #205 <Method boolean BarLineChartBase.isScaleYEnabled()>
	//*  67  141:ifne            149
	//*  68  144:iload           5
	//*  69  146:ifeq            195
	//*  70  149:aload_0         
	//*  71  150:getfield        #35  <Field Matrix mMatrix>
	//*  72  153:aload_0         
	//*  73  154:getfield        #37  <Field Matrix mSavedMatrix>
	//*  74  157:invokevirtual   #97  <Method void Matrix.set(Matrix)>
	//*  75  160:aload_0         
	//*  76  161:getfield        #35  <Field Matrix mMatrix>
	//*  77  164:fload_2         
	//*  78  165:fload_3         
	//*  79  166:aload           7
	//*  80  168:getfield        #136 <Field float PointF.x>
	//*  81  171:aload           7
	//*  82  173:getfield        #141 <Field float PointF.y>
	//*  83  176:invokevirtual   #209 <Method boolean Matrix.postScale(float, float, float, float)>
	//*  84  179:pop             
	//*  85  180:aload           6
	//*  86  182:ifnull          195
	//*  87  185:aload           6
	//*  88  187:aload_1         
	//*  89  188:fload_2         
	//*  90  189:fload_3         
	//*  91  190:invokeinterface #212 <Method void OnChartGestureListener.onChartScale(MotionEvent, float, float)>
	//*  92  195:return          
			flag = false;
	//   93  196:iconst_0        
	//   94  197:istore          4
		if(flag)
			flag2 = ((BarLineChartBase)mChart).getViewPortHandler().canZoomOutMoreX();
		else
	//*  95  199:goto            83
			flag2 = ((BarLineChartBase)mChart).getViewPortHandler().canZoomInMoreX();
	//   96  202:aload_0         
	//   97  203:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   98  206:checkcast       #103 <Class BarLineChartBase>
	//   99  209:invokevirtual   #194 <Method ViewPortHandler BarLineChartBase.getViewPortHandler()>
	//  100  212:invokevirtual   #215 <Method boolean ViewPortHandler.canZoomInMoreX()>
	//  101  215:istore          5
		if(((BarLineChartBase)mChart).isScaleXEnabled())
			f = f3;
		else
	//* 102  217:goto            103
			f = 1.0F;
	//  103  220:fconst_1        
	//  104  221:fstore_2        
		if(!((BarLineChartBase)mChart).isScaleYEnabled())
	//* 105  222:goto            118
			f3 = 1.0F;
	//  106  225:fconst_1        
	//  107  226:fstore_3        
		if(((BarLineChartBase)mChart).isScaleYEnabled() || flag2)
		{
			mMatrix.set(mSavedMatrix);
			mMatrix.postScale(f, f3, pointf.x, pointf.y);
			if(onchartgesturelistener != null)
				onchartgesturelistener.onChartScale(motionevent, f, f3);
		}
_L2:
		return;
	//* 108  227:goto            131
_L5:
		if(mTouchMode != 2 || !((BarLineChartBase)mChart).isScaleXEnabled())
			continue; /* Loop/switch isn't completed */
	//  109  230:aload_0         
	//  110  231:getfield        #187 <Field int mTouchMode>
	//  111  234:iconst_2        
	//  112  235:icmpne          373
	//  113  238:aload_0         
	//  114  239:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  115  242:checkcast       #103 <Class BarLineChartBase>
	//  116  245:invokevirtual   #202 <Method boolean BarLineChartBase.isScaleXEnabled()>
	//  117  248:ifeq            373
		mLastGesture = ChartTouchListener.ChartGesture.X_ZOOM;
	//  118  251:aload_0         
	//  119  252:getstatic       #218 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.X_ZOOM>
	//  120  255:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
		float f1 = getXDist(motionevent) / mSavedXDist;
	//  121  258:aload_1         
	//  122  259:invokestatic    #220 <Method float getXDist(MotionEvent)>
	//  123  262:aload_0         
	//  124  263:getfield        #46  <Field float mSavedXDist>
	//  125  266:fdiv            
	//  126  267:fstore_2        
		boolean flag1;
		boolean flag3;
		if(f1 < 1.0F)
	//* 127  268:fload_2         
	//* 128  269:fconst_1        
	//* 129  270:fcmpg           
	//* 130  271:ifge            349
			flag1 = true;
	//  131  274:iconst_1        
	//  132  275:istore          4
		else
	//* 133  277:iload           4
	//* 134  279:ifeq            355
	//* 135  282:aload_0         
	//* 136  283:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 137  286:checkcast       #103 <Class BarLineChartBase>
	//* 138  289:invokevirtual   #194 <Method ViewPortHandler BarLineChartBase.getViewPortHandler()>
	//* 139  292:invokevirtual   #199 <Method boolean ViewPortHandler.canZoomOutMoreX()>
	//* 140  295:istore          5
	//* 141  297:iload           5
	//* 142  299:ifeq            195
	//* 143  302:aload_0         
	//* 144  303:getfield        #35  <Field Matrix mMatrix>
	//* 145  306:aload_0         
	//* 146  307:getfield        #37  <Field Matrix mSavedMatrix>
	//* 147  310:invokevirtual   #97  <Method void Matrix.set(Matrix)>
	//* 148  313:aload_0         
	//* 149  314:getfield        #35  <Field Matrix mMatrix>
	//* 150  317:fload_2         
	//* 151  318:fconst_1        
	//* 152  319:aload           7
	//* 153  321:getfield        #136 <Field float PointF.x>
	//* 154  324:aload           7
	//* 155  326:getfield        #141 <Field float PointF.y>
	//* 156  329:invokevirtual   #209 <Method boolean Matrix.postScale(float, float, float, float)>
	//* 157  332:pop             
	//* 158  333:aload           6
	//* 159  335:ifnull          195
	//* 160  338:aload           6
	//* 161  340:aload_1         
	//* 162  341:fload_2         
	//* 163  342:fconst_1        
	//* 164  343:invokeinterface #212 <Method void OnChartGestureListener.onChartScale(MotionEvent, float, float)>
	//* 165  348:return          
			flag1 = false;
	//  166  349:iconst_0        
	//  167  350:istore          4
		if(flag1)
			flag3 = ((BarLineChartBase)mChart).getViewPortHandler().canZoomOutMoreX();
		else
	//* 168  352:goto            277
			flag3 = ((BarLineChartBase)mChart).getViewPortHandler().canZoomInMoreX();
	//  169  355:aload_0         
	//  170  356:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  171  359:checkcast       #103 <Class BarLineChartBase>
	//  172  362:invokevirtual   #194 <Method ViewPortHandler BarLineChartBase.getViewPortHandler()>
	//  173  365:invokevirtual   #215 <Method boolean ViewPortHandler.canZoomInMoreX()>
	//  174  368:istore          5
		if(flag3)
		{
			mMatrix.set(mSavedMatrix);
			mMatrix.postScale(f1, 1.0F, pointf.x, pointf.y);
			if(onchartgesturelistener != null)
			{
				onchartgesturelistener.onChartScale(motionevent, f1, 1.0F);
				return;
			}
		}
		continue; /* Loop/switch isn't completed */
	//  175  370:goto            297
		if(mTouchMode != 3 || !((BarLineChartBase)mChart).isScaleYEnabled()) goto _L2; else goto _L6
	//  176  373:aload_0         
	//  177  374:getfield        #187 <Field int mTouchMode>
	//  178  377:iconst_3        
	//  179  378:icmpne          195
	//  180  381:aload_0         
	//  181  382:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  182  385:checkcast       #103 <Class BarLineChartBase>
	//  183  388:invokevirtual   #205 <Method boolean BarLineChartBase.isScaleYEnabled()>
	//  184  391:ifeq            195
_L6:
		mLastGesture = ChartTouchListener.ChartGesture.Y_ZOOM;
	//  185  394:aload_0         
	//  186  395:getstatic       #223 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.Y_ZOOM>
	//  187  398:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
		float f2 = getYDist(motionevent) / mSavedYDist;
	//  188  401:aload_1         
	//  189  402:invokestatic    #225 <Method float getYDist(MotionEvent)>
	//  190  405:aload_0         
	//  191  406:getfield        #48  <Field float mSavedYDist>
	//  192  409:fdiv            
	//  193  410:fstore_2        
		mMatrix.set(mSavedMatrix);
	//  194  411:aload_0         
	//  195  412:getfield        #35  <Field Matrix mMatrix>
	//  196  415:aload_0         
	//  197  416:getfield        #37  <Field Matrix mSavedMatrix>
	//  198  419:invokevirtual   #97  <Method void Matrix.set(Matrix)>
		mMatrix.postScale(1.0F, f2, pointf.x, pointf.y);
	//  199  422:aload_0         
	//  200  423:getfield        #35  <Field Matrix mMatrix>
	//  201  426:fconst_1        
	//  202  427:fload_2         
	//  203  428:aload           7
	//  204  430:getfield        #136 <Field float PointF.x>
	//  205  433:aload           7
	//  206  435:getfield        #141 <Field float PointF.y>
	//  207  438:invokevirtual   #209 <Method boolean Matrix.postScale(float, float, float, float)>
	//  208  441:pop             
		if(onchartgesturelistener != null)
	//* 209  442:aload           6
	//* 210  444:ifnull          195
		{
			onchartgesturelistener.onChartScale(motionevent, 1.0F, f2);
	//  211  447:aload           6
	//  212  449:aload_1         
	//  213  450:fconst_1        
	//  214  451:fload_2         
	//  215  452:invokeinterface #212 <Method void OnChartGestureListener.onChartScale(MotionEvent, float, float)>
			return;
	//  216  457:return          
		}
		if(true) goto _L2; else goto _L7
_L7:
	}

	private void saveTouchStart(MotionEvent motionevent)
	{
		mSavedMatrix.set(mMatrix);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Matrix mSavedMatrix>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field Matrix mMatrix>
	//    4    8:invokevirtual   #97  <Method void Matrix.set(Matrix)>
		mTouchStartPoint.set(motionevent.getX(), motionevent.getY());
	//    5   11:aload_0         
	//    6   12:getfield        #42  <Field PointF mTouchStartPoint>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #133 <Method float MotionEvent.getX()>
	//    9   19:aload_1         
	//   10   20:invokevirtual   #138 <Method float MotionEvent.getY()>
	//   11   23:invokevirtual   #83  <Method void PointF.set(float, float)>
		mClosestDataSetToTouch = ((IDataSet) (((BarLineChartBase)mChart).getDataSetByTouchPoint(motionevent.getX(), motionevent.getY())));
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   15   31:checkcast       #103 <Class BarLineChartBase>
	//   16   34:aload_1         
	//   17   35:invokevirtual   #133 <Method float MotionEvent.getX()>
	//   18   38:aload_1         
	//   19   39:invokevirtual   #138 <Method float MotionEvent.getY()>
	//   20   42:invokevirtual   #230 <Method com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet BarLineChartBase.getDataSetByTouchPoint(float, float)>
	//   21   45:putfield        #113 <Field IDataSet mClosestDataSetToTouch>
	//   22   48:return          
	}

	private static float spacing(MotionEvent motionevent)
	{
		float f = motionevent.getX(0) - motionevent.getX(1);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #67  <Method float MotionEvent.getX(int)>
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:invokevirtual   #67  <Method float MotionEvent.getX(int)>
	//    6   10:fsub            
	//    7   11:fstore_1        
		float f1 = motionevent.getY(0) - motionevent.getY(1);
	//    8   12:aload_0         
	//    9   13:iconst_0        
	//   10   14:invokevirtual   #77  <Method float MotionEvent.getY(int)>
	//   11   17:aload_0         
	//   12   18:iconst_1        
	//   13   19:invokevirtual   #77  <Method float MotionEvent.getY(int)>
	//   14   22:fsub            
	//   15   23:fstore_2        
		return (float)Math.sqrt(f * f + f1 * f1);
	//   16   24:fload_1         
	//   17   25:fload_1         
	//   18   26:fmul            
	//   19   27:fload_2         
	//   20   28:fload_2         
	//   21   29:fmul            
	//   22   30:fadd            
	//   23   31:f2d             
	//   24   32:invokestatic    #234 <Method double Math.sqrt(double)>
	//   25   35:d2f             
	//   26   36:freturn         
	}

	public void computeScroll()
	{
		if(mDecelerationVelocity.x == 0.0F && mDecelerationVelocity.y == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field PointF mDecelerationVelocity>
	//*   2    4:getfield        #136 <Field float PointF.x>
	//*   3    7:fconst_0        
	//*   4    8:fcmpl           
	//*   5    9:ifne            25
	//*   6   12:aload_0         
	//*   7   13:getfield        #56  <Field PointF mDecelerationVelocity>
	//*   8   16:getfield        #141 <Field float PointF.y>
	//*   9   19:fconst_0        
	//*  10   20:fcmpl           
	//*  11   21:ifne            25
			return;
	//   12   24:return          
		long l = AnimationUtils.currentAnimationTimeMillis();
	//   13   25:invokestatic    #241 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//   14   28:lstore          4
		Object obj = ((Object) (mDecelerationVelocity));
	//   15   30:aload_0         
	//   16   31:getfield        #56  <Field PointF mDecelerationVelocity>
	//   17   34:astore          6
		float f = ((PointF) (obj)).x;
	//   18   36:aload           6
	//   19   38:getfield        #136 <Field float PointF.x>
	//   20   41:fstore_1        
		obj.x = ((BarLineChartBase)mChart).getDragDecelerationFrictionCoef() * f;
	//   21   42:aload           6
	//   22   44:aload_0         
	//   23   45:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   24   48:checkcast       #103 <Class BarLineChartBase>
	//   25   51:invokevirtual   #244 <Method float BarLineChartBase.getDragDecelerationFrictionCoef()>
	//   26   54:fload_1         
	//   27   55:fmul            
	//   28   56:putfield        #136 <Field float PointF.x>
		obj = ((Object) (mDecelerationVelocity));
	//   29   59:aload_0         
	//   30   60:getfield        #56  <Field PointF mDecelerationVelocity>
	//   31   63:astore          6
		f = ((PointF) (obj)).y;
	//   32   65:aload           6
	//   33   67:getfield        #141 <Field float PointF.y>
	//   34   70:fstore_1        
		obj.y = ((BarLineChartBase)mChart).getDragDecelerationFrictionCoef() * f;
	//   35   71:aload           6
	//   36   73:aload_0         
	//   37   74:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   38   77:checkcast       #103 <Class BarLineChartBase>
	//   39   80:invokevirtual   #244 <Method float BarLineChartBase.getDragDecelerationFrictionCoef()>
	//   40   83:fload_1         
	//   41   84:fmul            
	//   42   85:putfield        #141 <Field float PointF.y>
		f = (float)(l - mDecelerationLastTime) / 1000F;
	//   43   88:lload           4
	//   44   90:aload_0         
	//   45   91:getfield        #52  <Field long mDecelerationLastTime>
	//   46   94:lsub            
	//   47   95:l2f             
	//   48   96:ldc1            #245 <Float 1000F>
	//   49   98:fdiv            
	//   50   99:fstore_1        
		float f1 = mDecelerationVelocity.x;
	//   51  100:aload_0         
	//   52  101:getfield        #56  <Field PointF mDecelerationVelocity>
	//   53  104:getfield        #136 <Field float PointF.x>
	//   54  107:fstore_2        
		float f2 = mDecelerationVelocity.y;
	//   55  108:aload_0         
	//   56  109:getfield        #56  <Field PointF mDecelerationVelocity>
	//   57  112:getfield        #141 <Field float PointF.y>
	//   58  115:fstore_3        
		obj = ((Object) (mDecelerationCurrentPoint));
	//   59  116:aload_0         
	//   60  117:getfield        #54  <Field PointF mDecelerationCurrentPoint>
	//   61  120:astore          6
		obj.x = ((PointF) (obj)).x + f1 * f;
	//   62  122:aload           6
	//   63  124:aload           6
	//   64  126:getfield        #136 <Field float PointF.x>
	//   65  129:fload_2         
	//   66  130:fload_1         
	//   67  131:fmul            
	//   68  132:fadd            
	//   69  133:putfield        #136 <Field float PointF.x>
		obj = ((Object) (mDecelerationCurrentPoint));
	//   70  136:aload_0         
	//   71  137:getfield        #54  <Field PointF mDecelerationCurrentPoint>
	//   72  140:astore          6
		obj.y = ((PointF) (obj)).y + f2 * f;
	//   73  142:aload           6
	//   74  144:aload           6
	//   75  146:getfield        #141 <Field float PointF.y>
	//   76  149:fload_3         
	//   77  150:fload_1         
	//   78  151:fmul            
	//   79  152:fadd            
	//   80  153:putfield        #141 <Field float PointF.y>
		obj = ((Object) (MotionEvent.obtain(l, l, 2, mDecelerationCurrentPoint.x, mDecelerationCurrentPoint.y, 0)));
	//   81  156:lload           4
	//   82  158:lload           4
	//   83  160:iconst_2        
	//   84  161:aload_0         
	//   85  162:getfield        #54  <Field PointF mDecelerationCurrentPoint>
	//   86  165:getfield        #136 <Field float PointF.x>
	//   87  168:aload_0         
	//   88  169:getfield        #54  <Field PointF mDecelerationCurrentPoint>
	//   89  172:getfield        #141 <Field float PointF.y>
	//   90  175:iconst_0        
	//   91  176:invokestatic    #249 <Method MotionEvent MotionEvent.obtain(long, long, int, float, float, int)>
	//   92  179:astore          6
		performDrag(((MotionEvent) (obj)));
	//   93  181:aload_0         
	//   94  182:aload           6
	//   95  184:invokespecial   #251 <Method void performDrag(MotionEvent)>
		((MotionEvent) (obj)).recycle();
	//   96  187:aload           6
	//   97  189:invokevirtual   #254 <Method void MotionEvent.recycle()>
		mMatrix = ((BarLineChartBase)mChart).getViewPortHandler().refresh(mMatrix, ((View) (mChart)), false);
	//   98  192:aload_0         
	//   99  193:aload_0         
	//  100  194:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  101  197:checkcast       #103 <Class BarLineChartBase>
	//  102  200:invokevirtual   #194 <Method ViewPortHandler BarLineChartBase.getViewPortHandler()>
	//  103  203:aload_0         
	//  104  204:getfield        #35  <Field Matrix mMatrix>
	//  105  207:aload_0         
	//  106  208:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  107  211:iconst_0        
	//  108  212:invokevirtual   #258 <Method Matrix ViewPortHandler.refresh(Matrix, View, boolean)>
	//  109  215:putfield        #35  <Field Matrix mMatrix>
		mDecelerationLastTime = l;
	//  110  218:aload_0         
	//  111  219:lload           4
	//  112  221:putfield        #52  <Field long mDecelerationLastTime>
		if((double)Math.abs(mDecelerationVelocity.x) >= 0.01D || (double)Math.abs(mDecelerationVelocity.y) >= 0.01D)
	//* 113  224:aload_0         
	//* 114  225:getfield        #56  <Field PointF mDecelerationVelocity>
	//* 115  228:getfield        #136 <Field float PointF.x>
	//* 116  231:invokestatic    #73  <Method float Math.abs(float)>
	//* 117  234:f2d             
	//* 118  235:ldc2w           #259 <Double 0.01D>
	//* 119  238:dcmpl           
	//* 120  239:ifge            260
	//* 121  242:aload_0         
	//* 122  243:getfield        #56  <Field PointF mDecelerationVelocity>
	//* 123  246:getfield        #141 <Field float PointF.y>
	//* 124  249:invokestatic    #73  <Method float Math.abs(float)>
	//* 125  252:f2d             
	//* 126  253:ldc2w           #259 <Double 0.01D>
	//* 127  256:dcmpl           
	//* 128  257:iflt            268
		{
			Utils.postInvalidateOnAnimation(((View) (mChart)));
	//  129  260:aload_0         
	//  130  261:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  131  264:invokestatic    #266 <Method void Utils.postInvalidateOnAnimation(View)>
			return;
	//  132  267:return          
		} else
		{
			((BarLineChartBase)mChart).calculateOffsets();
	//  133  268:aload_0         
	//  134  269:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  135  272:checkcast       #103 <Class BarLineChartBase>
	//  136  275:invokevirtual   #269 <Method void BarLineChartBase.calculateOffsets()>
			((BarLineChartBase)mChart).postInvalidate();
	//  137  278:aload_0         
	//  138  279:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  139  282:checkcast       #103 <Class BarLineChartBase>
	//  140  285:invokevirtual   #272 <Method void BarLineChartBase.postInvalidate()>
			stopDeceleration();
	//  141  288:aload_0         
	//  142  289:invokevirtual   #275 <Method void stopDeceleration()>
			return;
	//  143  292:return          
		}
	}

	public Matrix getMatrix()
	{
		return mMatrix;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Matrix mMatrix>
	//    2    4:areturn         
	}

	public PointF getTrans(float f, float f1)
	{
		ViewPortHandler viewporthandler = ((BarLineChartBase)mChart).getViewPortHandler();
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//    2    4:checkcast       #103 <Class BarLineChartBase>
	//    3    7:invokevirtual   #194 <Method ViewPortHandler BarLineChartBase.getViewPortHandler()>
	//    4   10:astore          4
		float f2 = viewporthandler.offsetLeft();
	//    5   12:aload           4
	//    6   14:invokevirtual   #280 <Method float ViewPortHandler.offsetLeft()>
	//    7   17:fstore_3        
		if(((BarLineChartBase)mChart).isAnyAxisInverted() && mClosestDataSetToTouch != null && ((BarLineChartBase)mChart).isInverted(mClosestDataSetToTouch.getAxisDependency()))
	//*   8   18:aload_0         
	//*   9   19:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  10   22:checkcast       #103 <Class BarLineChartBase>
	//*  11   25:invokevirtual   #111 <Method boolean BarLineChartBase.isAnyAxisInverted()>
	//*  12   28:ifeq            81
	//*  13   31:aload_0         
	//*  14   32:getfield        #113 <Field IDataSet mClosestDataSetToTouch>
	//*  15   35:ifnull          81
	//*  16   38:aload_0         
	//*  17   39:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  18   42:checkcast       #103 <Class BarLineChartBase>
	//*  19   45:aload_0         
	//*  20   46:getfield        #113 <Field IDataSet mClosestDataSetToTouch>
	//*  21   49:invokeinterface #119 <Method com.github.mikephil.charting.components.YAxis$AxisDependency IDataSet.getAxisDependency()>
	//*  22   54:invokevirtual   #283 <Method boolean BarLineChartBase.isInverted(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//*  23   57:ifeq            81
			f1 = -(f1 - viewporthandler.offsetTop());
	//   24   60:fload_2         
	//   25   61:aload           4
	//   26   63:invokevirtual   #286 <Method float ViewPortHandler.offsetTop()>
	//   27   66:fsub            
	//   28   67:fneg            
	//   29   68:fstore_2        
		else
	//*  30   69:new             #39  <Class PointF>
	//*  31   72:dup             
	//*  32   73:fload_1         
	//*  33   74:fload_3         
	//*  34   75:fsub            
	//*  35   76:fload_2         
	//*  36   77:invokespecial   #288 <Method void PointF(float, float)>
	//*  37   80:areturn         
			f1 = -((float)((BarLineChartBase)mChart).getMeasuredHeight() - f1 - viewporthandler.offsetBottom());
	//   38   81:aload_0         
	//   39   82:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   40   85:checkcast       #103 <Class BarLineChartBase>
	//   41   88:invokevirtual   #291 <Method int BarLineChartBase.getMeasuredHeight()>
	//   42   91:i2f             
	//   43   92:fload_2         
	//   44   93:fsub            
	//   45   94:aload           4
	//   46   96:invokevirtual   #294 <Method float ViewPortHandler.offsetBottom()>
	//   47   99:fsub            
	//   48  100:fneg            
	//   49  101:fstore_2        
		return new PointF(f - f2, f1);
	//*  50  102:goto            69
	}

	public boolean onDoubleTap(MotionEvent motionevent)
	{
		float f1 = 1.4F;
	//    0    0:ldc2            #297 <Float 1.4F>
	//    1    3:fstore_3        
		mLastGesture = ChartTouchListener.ChartGesture.DOUBLE_TAP;
	//    2    4:aload_0         
	//    3    5:getstatic       #300 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.DOUBLE_TAP>
	//    4    8:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
		OnChartGestureListener onchartgesturelistener = ((BarLineChartBase)mChart).getOnChartGestureListener();
	//    5   11:aload_0         
	//    6   12:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//    7   15:checkcast       #103 <Class BarLineChartBase>
	//    8   18:invokevirtual   #107 <Method OnChartGestureListener BarLineChartBase.getOnChartGestureListener()>
	//    9   21:astore          4
		if(onchartgesturelistener != null)
	//*  10   23:aload           4
	//*  11   25:ifnull          36
			onchartgesturelistener.onChartDoubleTapped(motionevent);
	//   12   28:aload           4
	//   13   30:aload_1         
	//   14   31:invokeinterface #303 <Method void OnChartGestureListener.onChartDoubleTapped(MotionEvent)>
		if(((BarLineChartBase)mChart).isDoubleTapToZoomEnabled())
	//*  15   36:aload_0         
	//*  16   37:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  17   40:checkcast       #103 <Class BarLineChartBase>
	//*  18   43:invokevirtual   #306 <Method boolean BarLineChartBase.isDoubleTapToZoomEnabled()>
	//*  19   46:ifeq            177
		{
			PointF pointf = getTrans(motionevent.getX(), motionevent.getY());
	//   20   49:aload_0         
	//   21   50:aload_1         
	//   22   51:invokevirtual   #133 <Method float MotionEvent.getX()>
	//   23   54:aload_1         
	//   24   55:invokevirtual   #138 <Method float MotionEvent.getY()>
	//   25   58:invokevirtual   #183 <Method PointF getTrans(float, float)>
	//   26   61:astore          4
			BarLineChartBase barlinechartbase = (BarLineChartBase)mChart;
	//   27   63:aload_0         
	//   28   64:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   29   67:checkcast       #103 <Class BarLineChartBase>
	//   30   70:astore          5
			float f;
			if(((BarLineChartBase)mChart).isScaleXEnabled())
	//*  31   72:aload_0         
	//*  32   73:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  33   76:checkcast       #103 <Class BarLineChartBase>
	//*  34   79:invokevirtual   #202 <Method boolean BarLineChartBase.isScaleXEnabled()>
	//*  35   82:ifeq            183
				f = 1.4F;
	//   36   85:ldc2            #297 <Float 1.4F>
	//   37   88:fstore_2        
			else
	//*  38   89:aload_0         
	//*  39   90:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  40   93:checkcast       #103 <Class BarLineChartBase>
	//*  41   96:invokevirtual   #205 <Method boolean BarLineChartBase.isScaleYEnabled()>
	//*  42   99:ifeq            188
	//*  43  102:aload           5
	//*  44  104:fload_2         
	//*  45  105:fload_3         
	//*  46  106:aload           4
	//*  47  108:getfield        #136 <Field float PointF.x>
	//*  48  111:aload           4
	//*  49  113:getfield        #141 <Field float PointF.y>
	//*  50  116:invokevirtual   #310 <Method void BarLineChartBase.zoom(float, float, float, float)>
	//*  51  119:aload_0         
	//*  52  120:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  53  123:checkcast       #103 <Class BarLineChartBase>
	//*  54  126:invokevirtual   #313 <Method boolean BarLineChartBase.isLogEnabled()>
	//*  55  129:ifeq            177
	//*  56  132:ldc2            #315 <String "BarlineChartTouch">
	//*  57  135:new             #317 <Class StringBuilder>
	//*  58  138:dup             
	//*  59  139:invokespecial   #318 <Method void StringBuilder()>
	//*  60  142:ldc2            #320 <String "Double-Tap, Zooming In, x: ">
	//*  61  145:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//*  62  148:aload           4
	//*  63  150:getfield        #136 <Field float PointF.x>
	//*  64  153:invokevirtual   #327 <Method StringBuilder StringBuilder.append(float)>
	//*  65  156:ldc2            #329 <String ", y: ">
	//*  66  159:invokevirtual   #324 <Method StringBuilder StringBuilder.append(String)>
	//*  67  162:aload           4
	//*  68  164:getfield        #141 <Field float PointF.y>
	//*  69  167:invokevirtual   #327 <Method StringBuilder StringBuilder.append(float)>
	//*  70  170:invokevirtual   #333 <Method String StringBuilder.toString()>
	//*  71  173:invokestatic    #339 <Method int Log.i(String, String)>
	//*  72  176:pop             
	//*  73  177:aload_0         
	//*  74  178:aload_1         
	//*  75  179:invokespecial   #341 <Method boolean ChartTouchListener.onDoubleTap(MotionEvent)>
	//*  76  182:ireturn         
				f = 1.0F;
	//   77  183:fconst_1        
	//   78  184:fstore_2        
			if(!((BarLineChartBase)mChart).isScaleYEnabled())
	//*  79  185:goto            89
				f1 = 1.0F;
	//   80  188:fconst_1        
	//   81  189:fstore_3        
			barlinechartbase.zoom(f, f1, pointf.x, pointf.y);
			if(((BarLineChartBase)mChart).isLogEnabled())
				Log.i("BarlineChartTouch", (new StringBuilder()).append("Double-Tap, Zooming In, x: ").append(pointf.x).append(", y: ").append(pointf.y).toString());
		}
		return super.onDoubleTap(motionevent);
	//*  82  190:goto            102
	}

	public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
	{
		mLastGesture = ChartTouchListener.ChartGesture.FLING;
	//    0    0:aload_0         
	//    1    1:getstatic       #346 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.FLING>
	//    2    4:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
		OnChartGestureListener onchartgesturelistener = ((BarLineChartBase)mChart).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//    5   11:checkcast       #103 <Class BarLineChartBase>
	//    6   14:invokevirtual   #107 <Method OnChartGestureListener BarLineChartBase.getOnChartGestureListener()>
	//    7   17:astore          5
		if(onchartgesturelistener != null)
	//*   8   19:aload           5
	//*   9   21:ifnull          36
			onchartgesturelistener.onChartFling(motionevent, motionevent1, f, f1);
	//   10   24:aload           5
	//   11   26:aload_1         
	//   12   27:aload_2         
	//   13   28:fload_3         
	//   14   29:fload           4
	//   15   31:invokeinterface #350 <Method void OnChartGestureListener.onChartFling(MotionEvent, MotionEvent, float, float)>
		return super.onFling(motionevent, motionevent1, f, f1);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:fload_3         
	//   20   40:fload           4
	//   21   42:invokespecial   #352 <Method boolean ChartTouchListener.onFling(MotionEvent, MotionEvent, float, float)>
	//   22   45:ireturn         
	}

	public void onLongPress(MotionEvent motionevent)
	{
		mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
	//    0    0:aload_0         
	//    1    1:getstatic       #356 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.LONG_PRESS>
	//    2    4:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
		OnChartGestureListener onchartgesturelistener = ((BarLineChartBase)mChart).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//    5   11:checkcast       #103 <Class BarLineChartBase>
	//    6   14:invokevirtual   #107 <Method OnChartGestureListener BarLineChartBase.getOnChartGestureListener()>
	//    7   17:astore_2        
		if(onchartgesturelistener != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          29
			onchartgesturelistener.onChartLongPressed(motionevent);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokeinterface #359 <Method void OnChartGestureListener.onChartLongPressed(MotionEvent)>
	//   13   29:return          
	}

	public boolean onSingleTapUp(MotionEvent motionevent)
	{
		mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
	//    0    0:aload_0         
	//    1    1:getstatic       #363 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.SINGLE_TAP>
	//    2    4:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
		OnChartGestureListener onchartgesturelistener = ((BarLineChartBase)mChart).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//    5   11:checkcast       #103 <Class BarLineChartBase>
	//    6   14:invokevirtual   #107 <Method OnChartGestureListener BarLineChartBase.getOnChartGestureListener()>
	//    7   17:astore_2        
		if(onchartgesturelistener != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          29
			onchartgesturelistener.onChartSingleTapped(motionevent);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokeinterface #366 <Method void OnChartGestureListener.onChartSingleTapped(MotionEvent)>
		if(!((BarLineChartBase)mChart).isHighlightPerTapEnabled())
	//*  13   29:aload_0         
	//*  14   30:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  15   33:checkcast       #103 <Class BarLineChartBase>
	//*  16   36:invokevirtual   #369 <Method boolean BarLineChartBase.isHighlightPerTapEnabled()>
	//*  17   39:ifne            44
		{
			return false;
	//   18   42:iconst_0        
	//   19   43:ireturn         
		} else
		{
			performHighlight(((BarLineChartBase)mChart).getHighlightByTouchPoint(motionevent.getX(), motionevent.getY()), motionevent);
	//   20   44:aload_0         
	//   21   45:aload_0         
	//   22   46:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   23   49:checkcast       #103 <Class BarLineChartBase>
	//   24   52:aload_1         
	//   25   53:invokevirtual   #133 <Method float MotionEvent.getX()>
	//   26   56:aload_1         
	//   27   57:invokevirtual   #138 <Method float MotionEvent.getY()>
	//   28   60:invokevirtual   #156 <Method Highlight BarLineChartBase.getHighlightByTouchPoint(float, float)>
	//   29   63:aload_1         
	//   30   64:invokevirtual   #373 <Method void performHighlight(Highlight, MotionEvent)>
			return super.onSingleTapUp(motionevent);
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:invokespecial   #375 <Method boolean ChartTouchListener.onSingleTapUp(MotionEvent)>
	//   34   72:ireturn         
		}
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(mVelocityTracker == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #382 <Field VelocityTracker mVelocityTracker>
	//*   2    4:ifnonnull       14
			mVelocityTracker = VelocityTracker.obtain();
	//    3    7:aload_0         
	//    4    8:invokestatic    #387 <Method VelocityTracker VelocityTracker.obtain()>
	//    5   11:putfield        #382 <Field VelocityTracker mVelocityTracker>
		mVelocityTracker.addMovement(motionevent);
	//    6   14:aload_0         
	//    7   15:getfield        #382 <Field VelocityTracker mVelocityTracker>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #390 <Method void VelocityTracker.addMovement(MotionEvent)>
		if(motionevent.getActionMasked() == 3 && mVelocityTracker != null)
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #393 <Method int MotionEvent.getActionMasked()>
	//*  12   26:iconst_3        
	//*  13   27:icmpne          49
	//*  14   30:aload_0         
	//*  15   31:getfield        #382 <Field VelocityTracker mVelocityTracker>
	//*  16   34:ifnull          49
		{
			mVelocityTracker.recycle();
	//   17   37:aload_0         
	//   18   38:getfield        #382 <Field VelocityTracker mVelocityTracker>
	//   19   41:invokevirtual   #394 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//   20   44:aload_0         
	//   21   45:aconst_null     
	//   22   46:putfield        #382 <Field VelocityTracker mVelocityTracker>
		}
		if(mTouchMode == 0)
	//*  23   49:aload_0         
	//*  24   50:getfield        #187 <Field int mTouchMode>
	//*  25   53:ifne            65
			mGestureDetector.onTouchEvent(motionevent);
	//   26   56:aload_0         
	//   27   57:getfield        #398 <Field GestureDetector mGestureDetector>
	//   28   60:aload_2         
	//   29   61:invokevirtual   #403 <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//   30   64:pop             
		if(!((BarLineChartBase)mChart).isDragEnabled() && !((BarLineChartBase)mChart).isScaleXEnabled() && !((BarLineChartBase)mChart).isScaleYEnabled())
	//*  31   65:aload_0         
	//*  32   66:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  33   69:checkcast       #103 <Class BarLineChartBase>
	//*  34   72:invokevirtual   #406 <Method boolean BarLineChartBase.isDragEnabled()>
	//*  35   75:ifne            106
	//*  36   78:aload_0         
	//*  37   79:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  38   82:checkcast       #103 <Class BarLineChartBase>
	//*  39   85:invokevirtual   #202 <Method boolean BarLineChartBase.isScaleXEnabled()>
	//*  40   88:ifne            106
	//*  41   91:aload_0         
	//*  42   92:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  43   95:checkcast       #103 <Class BarLineChartBase>
	//*  44   98:invokevirtual   #205 <Method boolean BarLineChartBase.isScaleYEnabled()>
	//*  45  101:ifne            106
			return true;
	//   46  104:iconst_1        
	//   47  105:ireturn         
		motionevent.getAction() & 0xff;
	//   48  106:aload_2         
	//   49  107:invokevirtual   #409 <Method int MotionEvent.getAction()>
	//   50  110:sipush          255
	//   51  113:iand            
		JVM INSTR tableswitch 0 6: default 156
	//	               0 184
	//	               1 554
	//	               2 315
	//	               3 799
	//	               4 156
	//	               5 201
	//	               6 783;
	//   52  114:tableswitch     0 6: default 156
	//	               0 184
	//	               1 554
	//	               2 315
	//	               3 799
	//	               4 156
	//	               5 201
	//	               6 783
		   goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
		mMatrix = ((BarLineChartBase)mChart).getViewPortHandler().refresh(mMatrix, ((View) (mChart)), true);
	//   53  156:aload_0         
	//   54  157:aload_0         
	//   55  158:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   56  161:checkcast       #103 <Class BarLineChartBase>
	//   57  164:invokevirtual   #194 <Method ViewPortHandler BarLineChartBase.getViewPortHandler()>
	//   58  167:aload_0         
	//   59  168:getfield        #35  <Field Matrix mMatrix>
	//   60  171:aload_0         
	//   61  172:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   62  175:iconst_1        
	//   63  176:invokevirtual   #258 <Method Matrix ViewPortHandler.refresh(Matrix, View, boolean)>
	//   64  179:putfield        #35  <Field Matrix mMatrix>
		return true;
	//   65  182:iconst_1        
	//   66  183:ireturn         
_L2:
		startAction(motionevent);
	//   67  184:aload_0         
	//   68  185:aload_2         
	//   69  186:invokevirtual   #412 <Method void startAction(MotionEvent)>
		stopDeceleration();
	//   70  189:aload_0         
	//   71  190:invokevirtual   #275 <Method void stopDeceleration()>
		saveTouchStart(motionevent);
	//   72  193:aload_0         
	//   73  194:aload_2         
	//   74  195:invokespecial   #414 <Method void saveTouchStart(MotionEvent)>
		continue; /* Loop/switch isn't completed */
	//   75  198:goto            156
_L6:
		if(motionevent.getPointerCount() >= 2)
	//*  76  201:aload_2         
	//*  77  202:invokevirtual   #175 <Method int MotionEvent.getPointerCount()>
	//*  78  205:iconst_2        
	//*  79  206:icmplt          156
		{
			((BarLineChartBase)mChart).disableScroll();
	//   80  209:aload_0         
	//   81  210:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//   82  213:checkcast       #103 <Class BarLineChartBase>
	//   83  216:invokevirtual   #417 <Method void BarLineChartBase.disableScroll()>
			saveTouchStart(motionevent);
	//   84  219:aload_0         
	//   85  220:aload_2         
	//   86  221:invokespecial   #414 <Method void saveTouchStart(MotionEvent)>
			mSavedXDist = getXDist(motionevent);
	//   87  224:aload_0         
	//   88  225:aload_2         
	//   89  226:invokestatic    #220 <Method float getXDist(MotionEvent)>
	//   90  229:putfield        #46  <Field float mSavedXDist>
			mSavedYDist = getYDist(motionevent);
	//   91  232:aload_0         
	//   92  233:aload_2         
	//   93  234:invokestatic    #225 <Method float getYDist(MotionEvent)>
	//   94  237:putfield        #48  <Field float mSavedYDist>
			mSavedDist = spacing(motionevent);
	//   95  240:aload_0         
	//   96  241:aload_2         
	//   97  242:invokestatic    #178 <Method float spacing(MotionEvent)>
	//   98  245:putfield        #50  <Field float mSavedDist>
			if(mSavedDist > 10F)
	//*  99  248:aload_0         
	//* 100  249:getfield        #50  <Field float mSavedDist>
	//* 101  252:ldc1            #179 <Float 10F>
	//* 102  254:fcmpl           
	//* 103  255:ifle            276
				if(((BarLineChartBase)mChart).isPinchZoomEnabled())
	//* 104  258:aload_0         
	//* 105  259:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 106  262:checkcast       #103 <Class BarLineChartBase>
	//* 107  265:invokevirtual   #420 <Method boolean BarLineChartBase.isPinchZoomEnabled()>
	//* 108  268:ifeq            287
					mTouchMode = 4;
	//  109  271:aload_0         
	//  110  272:iconst_4        
	//  111  273:putfield        #187 <Field int mTouchMode>
				else
	//* 112  276:aload_0         
	//* 113  277:getfield        #44  <Field PointF mTouchPointCenter>
	//* 114  280:aload_2         
	//* 115  281:invokestatic    #422 <Method void midPoint(PointF, MotionEvent)>
	//* 116  284:goto            156
				if(mSavedXDist > mSavedYDist)
	//* 117  287:aload_0         
	//* 118  288:getfield        #46  <Field float mSavedXDist>
	//* 119  291:aload_0         
	//* 120  292:getfield        #48  <Field float mSavedYDist>
	//* 121  295:fcmpl           
	//* 122  296:ifle            307
					mTouchMode = 2;
	//  123  299:aload_0         
	//  124  300:iconst_2        
	//  125  301:putfield        #187 <Field int mTouchMode>
				else
	//* 126  304:goto            276
					mTouchMode = 3;
	//  127  307:aload_0         
	//  128  308:iconst_3        
	//  129  309:putfield        #187 <Field int mTouchMode>
			midPoint(mTouchPointCenter, motionevent);
		}
		continue; /* Loop/switch isn't completed */
	//  130  312:goto            276
_L4:
		if(mTouchMode == 1)
	//* 131  315:aload_0         
	//* 132  316:getfield        #187 <Field int mTouchMode>
	//* 133  319:iconst_1        
	//* 134  320:icmpne          341
		{
			((BarLineChartBase)mChart).disableScroll();
	//  135  323:aload_0         
	//  136  324:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  137  327:checkcast       #103 <Class BarLineChartBase>
	//  138  330:invokevirtual   #417 <Method void BarLineChartBase.disableScroll()>
			performDrag(motionevent);
	//  139  333:aload_0         
	//  140  334:aload_2         
	//  141  335:invokespecial   #251 <Method void performDrag(MotionEvent)>
		} else
	//* 142  338:goto            156
		if(mTouchMode == 2 || mTouchMode == 3 || mTouchMode == 4)
	//* 143  341:aload_0         
	//* 144  342:getfield        #187 <Field int mTouchMode>
	//* 145  345:iconst_2        
	//* 146  346:icmpeq          365
	//* 147  349:aload_0         
	//* 148  350:getfield        #187 <Field int mTouchMode>
	//* 149  353:iconst_3        
	//* 150  354:icmpeq          365
	//* 151  357:aload_0         
	//* 152  358:getfield        #187 <Field int mTouchMode>
	//* 153  361:iconst_4        
	//* 154  362:icmpne          409
		{
			((BarLineChartBase)mChart).disableScroll();
	//  155  365:aload_0         
	//  156  366:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  157  369:checkcast       #103 <Class BarLineChartBase>
	//  158  372:invokevirtual   #417 <Method void BarLineChartBase.disableScroll()>
			if(((BarLineChartBase)mChart).isScaleXEnabled() || ((BarLineChartBase)mChart).isScaleYEnabled())
	//* 159  375:aload_0         
	//* 160  376:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 161  379:checkcast       #103 <Class BarLineChartBase>
	//* 162  382:invokevirtual   #202 <Method boolean BarLineChartBase.isScaleXEnabled()>
	//* 163  385:ifne            401
	//* 164  388:aload_0         
	//* 165  389:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 166  392:checkcast       #103 <Class BarLineChartBase>
	//* 167  395:invokevirtual   #205 <Method boolean BarLineChartBase.isScaleYEnabled()>
	//* 168  398:ifeq            156
				performZoom(motionevent);
	//  169  401:aload_0         
	//  170  402:aload_2         
	//  171  403:invokespecial   #424 <Method void performZoom(MotionEvent)>
		} else
	//* 172  406:goto            156
		if(mTouchMode == 0 && Math.abs(distance(motionevent.getX(), mTouchStartPoint.x, motionevent.getY(), mTouchStartPoint.y)) > 5F)
	//* 173  409:aload_0         
	//* 174  410:getfield        #187 <Field int mTouchMode>
	//* 175  413:ifne            156
	//* 176  416:aload_2         
	//* 177  417:invokevirtual   #133 <Method float MotionEvent.getX()>
	//* 178  420:aload_0         
	//* 179  421:getfield        #42  <Field PointF mTouchStartPoint>
	//* 180  424:getfield        #136 <Field float PointF.x>
	//* 181  427:aload_2         
	//* 182  428:invokevirtual   #138 <Method float MotionEvent.getY()>
	//* 183  431:aload_0         
	//* 184  432:getfield        #42  <Field PointF mTouchStartPoint>
	//* 185  435:getfield        #141 <Field float PointF.y>
	//* 186  438:invokestatic    #428 <Method float distance(float, float, float, float)>
	//* 187  441:invokestatic    #73  <Method float Math.abs(float)>
	//* 188  444:ldc2            #429 <Float 5F>
	//* 189  447:fcmpl           
	//* 190  448:ifle            156
			if(((BarLineChartBase)mChart).hasNoDragOffset())
	//* 191  451:aload_0         
	//* 192  452:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 193  455:checkcast       #103 <Class BarLineChartBase>
	//* 194  458:invokevirtual   #432 <Method boolean BarLineChartBase.hasNoDragOffset()>
	//* 195  461:ifeq            526
			{
				if(!((BarLineChartBase)mChart).isFullyZoomedOut() && ((BarLineChartBase)mChart).isDragEnabled())
	//* 196  464:aload_0         
	//* 197  465:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 198  468:checkcast       #103 <Class BarLineChartBase>
	//* 199  471:invokevirtual   #435 <Method boolean BarLineChartBase.isFullyZoomedOut()>
	//* 200  474:ifne            498
	//* 201  477:aload_0         
	//* 202  478:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 203  481:checkcast       #103 <Class BarLineChartBase>
	//* 204  484:invokevirtual   #406 <Method boolean BarLineChartBase.isDragEnabled()>
	//* 205  487:ifeq            498
				{
					mTouchMode = 1;
	//  206  490:aload_0         
	//  207  491:iconst_1        
	//  208  492:putfield        #187 <Field int mTouchMode>
				} else
	//* 209  495:goto            156
				{
					mLastGesture = ChartTouchListener.ChartGesture.DRAG;
	//  210  498:aload_0         
	//  211  499:getstatic       #91  <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.DRAG>
	//  212  502:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
					if(((BarLineChartBase)mChart).isHighlightPerDragEnabled())
	//* 213  505:aload_0         
	//* 214  506:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 215  509:checkcast       #103 <Class BarLineChartBase>
	//* 216  512:invokevirtual   #438 <Method boolean BarLineChartBase.isHighlightPerDragEnabled()>
	//* 217  515:ifeq            156
						performHighlightDrag(motionevent);
	//  218  518:aload_0         
	//  219  519:aload_2         
	//  220  520:invokespecial   #440 <Method void performHighlightDrag(MotionEvent)>
				}
			} else
	//* 221  523:goto            156
			if(((BarLineChartBase)mChart).isDragEnabled())
	//* 222  526:aload_0         
	//* 223  527:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 224  530:checkcast       #103 <Class BarLineChartBase>
	//* 225  533:invokevirtual   #406 <Method boolean BarLineChartBase.isDragEnabled()>
	//* 226  536:ifeq            156
			{
				mLastGesture = ChartTouchListener.ChartGesture.DRAG;
	//  227  539:aload_0         
	//  228  540:getstatic       #91  <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.DRAG>
	//  229  543:putfield        #94  <Field ChartTouchListener$ChartGesture mLastGesture>
				mTouchMode = 1;
	//  230  546:aload_0         
	//  231  547:iconst_1        
	//  232  548:putfield        #187 <Field int mTouchMode>
			}
		continue; /* Loop/switch isn't completed */
	//  233  551:goto            156
_L3:
		view = ((View) (mVelocityTracker));
	//  234  554:aload_0         
	//  235  555:getfield        #382 <Field VelocityTracker mVelocityTracker>
	//  236  558:astore_1        
		int i = motionevent.getPointerId(0);
	//  237  559:aload_2         
	//  238  560:iconst_0        
	//  239  561:invokevirtual   #444 <Method int MotionEvent.getPointerId(int)>
	//  240  564:istore          5
		((VelocityTracker) (view)).computeCurrentVelocity(1000, Utils.getMaximumFlingVelocity());
	//  241  566:aload_1         
	//  242  567:sipush          1000
	//  243  570:invokestatic    #447 <Method int Utils.getMaximumFlingVelocity()>
	//  244  573:i2f             
	//  245  574:invokevirtual   #451 <Method void VelocityTracker.computeCurrentVelocity(int, float)>
		float f = ((VelocityTracker) (view)).getYVelocity(i);
	//  246  577:aload_1         
	//  247  578:iload           5
	//  248  580:invokevirtual   #454 <Method float VelocityTracker.getYVelocity(int)>
	//  249  583:fstore_3        
		float f1 = ((VelocityTracker) (view)).getXVelocity(i);
	//  250  584:aload_1         
	//  251  585:iload           5
	//  252  587:invokevirtual   #457 <Method float VelocityTracker.getXVelocity(int)>
	//  253  590:fstore          4
		if((Math.abs(f1) > (float)Utils.getMinimumFlingVelocity() || Math.abs(f) > (float)Utils.getMinimumFlingVelocity()) && mTouchMode == 1 && ((BarLineChartBase)mChart).isDragDecelerationEnabled())
	//* 254  592:fload           4
	//* 255  594:invokestatic    #73  <Method float Math.abs(float)>
	//* 256  597:invokestatic    #460 <Method int Utils.getMinimumFlingVelocity()>
	//* 257  600:i2f             
	//* 258  601:fcmpl           
	//* 259  602:ifgt            617
	//* 260  605:fload_3         
	//* 261  606:invokestatic    #73  <Method float Math.abs(float)>
	//* 262  609:invokestatic    #460 <Method int Utils.getMinimumFlingVelocity()>
	//* 263  612:i2f             
	//* 264  613:fcmpl           
	//* 265  614:ifle            689
	//* 266  617:aload_0         
	//* 267  618:getfield        #187 <Field int mTouchMode>
	//* 268  621:iconst_1        
	//* 269  622:icmpne          689
	//* 270  625:aload_0         
	//* 271  626:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 272  629:checkcast       #103 <Class BarLineChartBase>
	//* 273  632:invokevirtual   #463 <Method boolean BarLineChartBase.isDragDecelerationEnabled()>
	//* 274  635:ifeq            689
		{
			stopDeceleration();
	//  275  638:aload_0         
	//  276  639:invokevirtual   #275 <Method void stopDeceleration()>
			mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
	//  277  642:aload_0         
	//  278  643:invokestatic    #241 <Method long AnimationUtils.currentAnimationTimeMillis()>
	//  279  646:putfield        #52  <Field long mDecelerationLastTime>
			mDecelerationCurrentPoint = new PointF(motionevent.getX(), motionevent.getY());
	//  280  649:aload_0         
	//  281  650:new             #39  <Class PointF>
	//  282  653:dup             
	//  283  654:aload_2         
	//  284  655:invokevirtual   #133 <Method float MotionEvent.getX()>
	//  285  658:aload_2         
	//  286  659:invokevirtual   #138 <Method float MotionEvent.getY()>
	//  287  662:invokespecial   #288 <Method void PointF(float, float)>
	//  288  665:putfield        #54  <Field PointF mDecelerationCurrentPoint>
			mDecelerationVelocity = new PointF(f1, f);
	//  289  668:aload_0         
	//  290  669:new             #39  <Class PointF>
	//  291  672:dup             
	//  292  673:fload           4
	//  293  675:fload_3         
	//  294  676:invokespecial   #288 <Method void PointF(float, float)>
	//  295  679:putfield        #56  <Field PointF mDecelerationVelocity>
			Utils.postInvalidateOnAnimation(((View) (mChart)));
	//  296  682:aload_0         
	//  297  683:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  298  686:invokestatic    #266 <Method void Utils.postInvalidateOnAnimation(View)>
		}
		if(mTouchMode == 2 || mTouchMode == 3 || mTouchMode == 4 || mTouchMode == 5)
	//* 299  689:aload_0         
	//* 300  690:getfield        #187 <Field int mTouchMode>
	//* 301  693:iconst_2        
	//* 302  694:icmpeq          721
	//* 303  697:aload_0         
	//* 304  698:getfield        #187 <Field int mTouchMode>
	//* 305  701:iconst_3        
	//* 306  702:icmpeq          721
	//* 307  705:aload_0         
	//* 308  706:getfield        #187 <Field int mTouchMode>
	//* 309  709:iconst_4        
	//* 310  710:icmpeq          721
	//* 311  713:aload_0         
	//* 312  714:getfield        #187 <Field int mTouchMode>
	//* 313  717:iconst_5        
	//* 314  718:icmpne          741
		{
			((BarLineChartBase)mChart).calculateOffsets();
	//  315  721:aload_0         
	//  316  722:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  317  725:checkcast       #103 <Class BarLineChartBase>
	//  318  728:invokevirtual   #269 <Method void BarLineChartBase.calculateOffsets()>
			((BarLineChartBase)mChart).postInvalidate();
	//  319  731:aload_0         
	//  320  732:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  321  735:checkcast       #103 <Class BarLineChartBase>
	//  322  738:invokevirtual   #272 <Method void BarLineChartBase.postInvalidate()>
		}
		mTouchMode = 0;
	//  323  741:aload_0         
	//  324  742:iconst_0        
	//  325  743:putfield        #187 <Field int mTouchMode>
		((BarLineChartBase)mChart).enableScroll();
	//  326  746:aload_0         
	//  327  747:getfield        #101 <Field com.github.mikephil.charting.charts.Chart mChart>
	//  328  750:checkcast       #103 <Class BarLineChartBase>
	//  329  753:invokevirtual   #466 <Method void BarLineChartBase.enableScroll()>
		if(mVelocityTracker != null)
	//* 330  756:aload_0         
	//* 331  757:getfield        #382 <Field VelocityTracker mVelocityTracker>
	//* 332  760:ifnull          775
		{
			mVelocityTracker.recycle();
	//  333  763:aload_0         
	//  334  764:getfield        #382 <Field VelocityTracker mVelocityTracker>
	//  335  767:invokevirtual   #394 <Method void VelocityTracker.recycle()>
			mVelocityTracker = null;
	//  336  770:aload_0         
	//  337  771:aconst_null     
	//  338  772:putfield        #382 <Field VelocityTracker mVelocityTracker>
		}
		endAction(motionevent);
	//  339  775:aload_0         
	//  340  776:aload_2         
	//  341  777:invokevirtual   #469 <Method void endAction(MotionEvent)>
		continue; /* Loop/switch isn't completed */
	//  342  780:goto            156
_L7:
		Utils.velocityTrackerPointerUpCleanUpIfNecessary(motionevent, mVelocityTracker);
	//  343  783:aload_2         
	//  344  784:aload_0         
	//  345  785:getfield        #382 <Field VelocityTracker mVelocityTracker>
	//  346  788:invokestatic    #473 <Method void Utils.velocityTrackerPointerUpCleanUpIfNecessary(MotionEvent, VelocityTracker)>
		mTouchMode = 5;
	//  347  791:aload_0         
	//  348  792:iconst_5        
	//  349  793:putfield        #187 <Field int mTouchMode>
		continue; /* Loop/switch isn't completed */
	//  350  796:goto            156
_L5:
		mTouchMode = 0;
	//  351  799:aload_0         
	//  352  800:iconst_0        
	//  353  801:putfield        #187 <Field int mTouchMode>
		endAction(motionevent);
	//  354  804:aload_0         
	//  355  805:aload_2         
	//  356  806:invokevirtual   #469 <Method void endAction(MotionEvent)>
		if(true) goto _L1; else goto _L8
	//  357  809:goto            156
_L8:
	}

	public void stopDeceleration()
	{
		mDecelerationVelocity = new PointF(0.0F, 0.0F);
	//    0    0:aload_0         
	//    1    1:new             #39  <Class PointF>
	//    2    4:dup             
	//    3    5:fconst_0        
	//    4    6:fconst_0        
	//    5    7:invokespecial   #288 <Method void PointF(float, float)>
	//    6   10:putfield        #56  <Field PointF mDecelerationVelocity>
	//    7   13:return          
	}

	private IDataSet mClosestDataSetToTouch;
	private PointF mDecelerationCurrentPoint;
	private long mDecelerationLastTime;
	private PointF mDecelerationVelocity;
	private Matrix mMatrix;
	private float mSavedDist;
	private Matrix mSavedMatrix;
	private float mSavedXDist;
	private float mSavedYDist;
	private PointF mTouchPointCenter;
	private PointF mTouchStartPoint;
	private VelocityTracker mVelocityTracker;
}
