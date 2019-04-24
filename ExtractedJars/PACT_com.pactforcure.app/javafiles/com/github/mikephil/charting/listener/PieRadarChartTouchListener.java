// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.listener;

import android.graphics.PointF;
import android.view.*;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.animation.ChartAnimator;
import com.github.mikephil.charting.charts.*;
import com.github.mikephil.charting.highlight.Highlight;
import com.github.mikephil.charting.utils.Utils;
import java.util.ArrayList;

// Referenced classes of package com.github.mikephil.charting.listener:
//			ChartTouchListener, OnChartGestureListener

public class PieRadarChartTouchListener extends ChartTouchListener
{
	private class AngularVelocitySample
	{

		public float angle;
		final PieRadarChartTouchListener this$0;
		public long time;

		public AngularVelocitySample(long l, float f)
		{
			this$0 = PieRadarChartTouchListener.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field PieRadarChartTouchListener this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #20  <Method void Object()>
			time = l;
		//    5    9:aload_0         
		//    6   10:lload_2         
		//    7   11:putfield        #22  <Field long time>
			angle = f;
		//    8   14:aload_0         
		//    9   15:fload           4
		//   10   17:putfield        #24  <Field float angle>
		//   11   20:return          
		}
	}


	public PieRadarChartTouchListener(PieRadarChartBase pieradarchartbase)
	{
		super(((com.github.mikephil.charting.charts.Chart) (pieradarchartbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ChartTouchListener(com.github.mikephil.charting.charts.Chart)>
		mTouchStartPoint = new PointF();
	//    3    5:aload_0         
	//    4    6:new             #25  <Class PointF>
	//    5    9:dup             
	//    6   10:invokespecial   #28  <Method void PointF()>
	//    7   13:putfield        #30  <Field PointF mTouchStartPoint>
		mStartAngle = 0.0F;
	//    8   16:aload_0         
	//    9   17:fconst_0        
	//   10   18:putfield        #32  <Field float mStartAngle>
		_velocitySamples = new ArrayList();
	//   11   21:aload_0         
	//   12   22:new             #34  <Class ArrayList>
	//   13   25:dup             
	//   14   26:invokespecial   #35  <Method void ArrayList()>
	//   15   29:putfield        #37  <Field ArrayList _velocitySamples>
		mDecelerationLastTime = 0L;
	//   16   32:aload_0         
	//   17   33:lconst_0        
	//   18   34:putfield        #39  <Field long mDecelerationLastTime>
		mDecelerationAngularVelocity = 0.0F;
	//   19   37:aload_0         
	//   20   38:fconst_0        
	//   21   39:putfield        #41  <Field float mDecelerationAngularVelocity>
	//   22   42:return          
	}

	private float calculateVelocity()
	{
		if(!_velocitySamples.isEmpty()) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList _velocitySamples>
	//    2    4:invokevirtual   #50  <Method boolean ArrayList.isEmpty()>
	//    3    7:ifeq            14
_L1:
		float f = 0.0F;
	//    4   10:fconst_0        
	//    5   11:fstore_1        
_L4:
		return f;
	//    6   12:fload_1         
	//    7   13:freturn         
_L2:
		int i;
		AngularVelocitySample angularvelocitysample;
		AngularVelocitySample angularvelocitysample1;
		AngularVelocitySample angularvelocitysample2;
		angularvelocitysample1 = (AngularVelocitySample)_velocitySamples.get(0);
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field ArrayList _velocitySamples>
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #7   <Class PieRadarChartTouchListener$AngularVelocitySample>
	//   13   25:astore          6
		angularvelocitysample2 = (AngularVelocitySample)_velocitySamples.get(_velocitySamples.size() - 1);
	//   14   27:aload_0         
	//   15   28:getfield        #37  <Field ArrayList _velocitySamples>
	//   16   31:aload_0         
	//   17   32:getfield        #37  <Field ArrayList _velocitySamples>
	//   18   35:invokevirtual   #58  <Method int ArrayList.size()>
	//   19   38:iconst_1        
	//   20   39:isub            
	//   21   40:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//   22   43:checkcast       #7   <Class PieRadarChartTouchListener$AngularVelocitySample>
	//   23   46:astore          7
		angularvelocitysample = angularvelocitysample1;
	//   24   48:aload           6
	//   25   50:astore          5
		i = _velocitySamples.size() - 1;
	//   26   52:aload_0         
	//   27   53:getfield        #37  <Field ArrayList _velocitySamples>
	//   28   56:invokevirtual   #58  <Method int ArrayList.size()>
	//   29   59:iconst_1        
	//   30   60:isub            
	//   31   61:istore_3        
_L5:
label0:
		{
			if(i >= 0)
	//*  32   62:iload_3         
	//*  33   63:iflt            93
			{
				angularvelocitysample = (AngularVelocitySample)_velocitySamples.get(i);
	//   34   66:aload_0         
	//   35   67:getfield        #37  <Field ArrayList _velocitySamples>
	//   36   70:iload_3         
	//   37   71:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//   38   74:checkcast       #7   <Class PieRadarChartTouchListener$AngularVelocitySample>
	//   39   77:astore          5
				if(angularvelocitysample.angle == angularvelocitysample2.angle)
					break label0;
	//   40   79:aload           5
	//   41   81:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//   42   84:aload           7
	//   43   86:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//   44   89:fcmpl           
	//   45   90:ifeq            230
			}
			float f1 = (float)(angularvelocitysample2.time - angularvelocitysample1.time) / 1000F;
	//   46   93:aload           7
	//   47   95:getfield        #64  <Field long PieRadarChartTouchListener$AngularVelocitySample.time>
	//   48   98:aload           6
	//   49  100:getfield        #64  <Field long PieRadarChartTouchListener$AngularVelocitySample.time>
	//   50  103:lsub            
	//   51  104:l2f             
	//   52  105:ldc1            #65  <Float 1000F>
	//   53  107:fdiv            
	//   54  108:fstore_2        
			f = f1;
	//   55  109:fload_2         
	//   56  110:fstore_1        
			if(f1 == 0.0F)
	//*  57  111:fload_2         
	//*  58  112:fconst_0        
	//*  59  113:fcmpl           
	//*  60  114:ifne            120
				f = 0.1F;
	//   61  117:ldc1            #66  <Float 0.1F>
	//   62  119:fstore_1        
			int j;
			if(angularvelocitysample2.angle >= angularvelocitysample.angle)
	//*  63  120:aload           7
	//*  64  122:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//*  65  125:aload           5
	//*  66  127:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//*  67  130:fcmpl           
	//*  68  131:iflt            237
				i = 1;
	//   69  134:iconst_1        
	//   70  135:istore_3        
			else
	//*  71  136:iload_3         
	//*  72  137:istore          4
	//*  73  139:aload           7
	//*  74  141:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//*  75  144:aload           5
	//*  76  146:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//*  77  149:fsub            
	//*  78  150:invokestatic    #72  <Method float Math.abs(float)>
	//*  79  153:f2d             
	//*  80  154:ldc2w           #73  <Double 270D>
	//*  81  157:dcmpl           
	//*  82  158:ifle            168
	//*  83  161:iload_3         
	//*  84  162:ifne            242
	//*  85  165:iconst_1        
	//*  86  166:istore          4
	//*  87  168:aload           7
	//*  88  170:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//*  89  173:aload           6
	//*  90  175:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//*  91  178:fsub            
	//*  92  179:f2d             
	//*  93  180:ldc2w           #75  <Double 180D>
	//*  94  183:dcmpl           
	//*  95  184:ifle            248
	//*  96  187:aload           6
	//*  97  189:aload           6
	//*  98  191:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//*  99  194:f2d             
	//* 100  195:ldc2w           #77  <Double 360D>
	//* 101  198:dadd            
	//* 102  199:d2f             
	//* 103  200:putfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//* 104  203:aload           7
	//* 105  205:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//* 106  208:aload           6
	//* 107  210:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//* 108  213:fsub            
	//* 109  214:fload_1         
	//* 110  215:fdiv            
	//* 111  216:invokestatic    #72  <Method float Math.abs(float)>
	//* 112  219:fstore_2        
	//* 113  220:fload_2         
	//* 114  221:fstore_1        
	//* 115  222:iload           4
	//* 116  224:ifne            12
	//* 117  227:fload_2         
	//* 118  228:fneg            
	//* 119  229:freturn         
	//* 120  230:iload_3         
	//* 121  231:iconst_1        
	//* 122  232:isub            
	//* 123  233:istore_3        
	//* 124  234:goto            62
				i = 0;
	//  125  237:iconst_0        
	//  126  238:istore_3        
			j = i;
			if((double)Math.abs(angularvelocitysample2.angle - angularvelocitysample.angle) > 270D)
				if(i == 0)
					j = 1;
				else
	//* 127  239:goto            136
					j = 0;
	//  128  242:iconst_0        
	//  129  243:istore          4
			if((double)(angularvelocitysample2.angle - angularvelocitysample1.angle) > 180D)
				angularvelocitysample1.angle = (float)((double)angularvelocitysample1.angle + 360D);
			else
	//* 130  245:goto            168
			if((double)(angularvelocitysample1.angle - angularvelocitysample2.angle) > 180D)
	//* 131  248:aload           6
	//* 132  250:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//* 133  253:aload           7
	//* 134  255:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//* 135  258:fsub            
	//* 136  259:f2d             
	//* 137  260:ldc2w           #75  <Double 180D>
	//* 138  263:dcmpl           
	//* 139  264:ifle            203
				angularvelocitysample2.angle = (float)((double)angularvelocitysample2.angle + 360D);
	//  140  267:aload           7
	//  141  269:aload           7
	//  142  271:getfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
	//  143  274:f2d             
	//  144  275:ldc2w           #77  <Double 360D>
	//  145  278:dadd            
	//  146  279:d2f             
	//  147  280:putfield        #61  <Field float PieRadarChartTouchListener$AngularVelocitySample.angle>
			f1 = Math.abs((angularvelocitysample2.angle - angularvelocitysample1.angle) / f);
			f = f1;
			if(j == 0)
				return -f1;
		}
		if(true) goto _L4; else goto _L3
	//  148  283:goto            203
_L3:
		i--;
		  goto _L5
	}

	private void resetVelocity()
	{
		_velocitySamples.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ArrayList _velocitySamples>
	//    2    4:invokevirtual   #82  <Method void ArrayList.clear()>
	//    3    7:return          
	}

	private void sampleVelocity(float f, float f1)
	{
		long l = AnimationUtils.currentAnimationTimeMillis();
	//    0    0:invokestatic    #90  <Method long AnimationUtils.currentAnimationTimeMillis()>
	//    1    3:lstore          5
		_velocitySamples.add(((Object) (new AngularVelocitySample(l, ((PieRadarChartBase)mChart).getAngleForPoint(f, f1)))));
	//    2    5:aload_0         
	//    3    6:getfield        #37  <Field ArrayList _velocitySamples>
	//    4    9:new             #7   <Class PieRadarChartTouchListener$AngularVelocitySample>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:lload           5
	//    8   16:aload_0         
	//    9   17:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   10   20:checkcast       #96  <Class PieRadarChartBase>
	//   11   23:fload_1         
	//   12   24:fload_2         
	//   13   25:invokevirtual   #100 <Method float PieRadarChartBase.getAngleForPoint(float, float)>
	//   14   28:invokespecial   #103 <Method void PieRadarChartTouchListener$AngularVelocitySample(PieRadarChartTouchListener, long, float)>
	//   15   31:invokevirtual   #107 <Method boolean ArrayList.add(Object)>
	//   16   34:pop             
		int i = 0;
	//   17   35:iconst_0        
	//   18   36:istore_3        
		for(int j = _velocitySamples.size(); j - 2 > 0 && l - ((AngularVelocitySample)_velocitySamples.get(i)).time > 1000L; i = (i - 1) + 1)
	//*  19   37:aload_0         
	//*  20   38:getfield        #37  <Field ArrayList _velocitySamples>
	//*  21   41:invokevirtual   #58  <Method int ArrayList.size()>
	//*  22   44:istore          4
	//*  23   46:iload           4
	//*  24   48:iconst_2        
	//*  25   49:isub            
	//*  26   50:ifle            101
	//*  27   53:lload           5
	//*  28   55:aload_0         
	//*  29   56:getfield        #37  <Field ArrayList _velocitySamples>
	//*  30   59:iload_3         
	//*  31   60:invokevirtual   #54  <Method Object ArrayList.get(int)>
	//*  32   63:checkcast       #7   <Class PieRadarChartTouchListener$AngularVelocitySample>
	//*  33   66:getfield        #64  <Field long PieRadarChartTouchListener$AngularVelocitySample.time>
	//*  34   69:lsub            
	//*  35   70:ldc2w           #108 <Long 1000L>
	//*  36   73:lcmp            
	//*  37   74:ifle            101
		{
			_velocitySamples.remove(0);
	//   38   77:aload_0         
	//   39   78:getfield        #37  <Field ArrayList _velocitySamples>
	//   40   81:iconst_0        
	//   41   82:invokevirtual   #112 <Method Object ArrayList.remove(int)>
	//   42   85:pop             
			j--;
	//   43   86:iload           4
	//   44   88:iconst_1        
	//   45   89:isub            
	//   46   90:istore          4
		}

	//   47   92:iload_3         
	//   48   93:iconst_1        
	//   49   94:isub            
	//   50   95:iconst_1        
	//   51   96:iadd            
	//   52   97:istore_3        
	//*  53   98:goto            46
	//   54  101:return          
	}

	public void computeScroll()
	{
		if(mDecelerationAngularVelocity == 0.0F)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field float mDecelerationAngularVelocity>
	//*   2    4:fconst_0        
	//*   3    5:fcmpl           
	//*   4    6:ifne            10
			return;
	//    5    9:return          
		long l = AnimationUtils.currentAnimationTimeMillis();
	//    6   10:invokestatic    #90  <Method long AnimationUtils.currentAnimationTimeMillis()>
	//    7   13:lstore_2        
		float f = mDecelerationAngularVelocity;
	//    8   14:aload_0         
	//    9   15:getfield        #41  <Field float mDecelerationAngularVelocity>
	//   10   18:fstore_1        
		mDecelerationAngularVelocity = ((PieRadarChartBase)mChart).getDragDecelerationFrictionCoef() * f;
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   14   24:checkcast       #96  <Class PieRadarChartBase>
	//   15   27:invokevirtual   #116 <Method float PieRadarChartBase.getDragDecelerationFrictionCoef()>
	//   16   30:fload_1         
	//   17   31:fmul            
	//   18   32:putfield        #41  <Field float mDecelerationAngularVelocity>
		f = (float)(l - mDecelerationLastTime) / 1000F;
	//   19   35:lload_2         
	//   20   36:aload_0         
	//   21   37:getfield        #39  <Field long mDecelerationLastTime>
	//   22   40:lsub            
	//   23   41:l2f             
	//   24   42:ldc1            #65  <Float 1000F>
	//   25   44:fdiv            
	//   26   45:fstore_1        
		((PieRadarChartBase)mChart).setRotationAngle(((PieRadarChartBase)mChart).getRotationAngle() + mDecelerationAngularVelocity * f);
	//   27   46:aload_0         
	//   28   47:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   29   50:checkcast       #96  <Class PieRadarChartBase>
	//   30   53:aload_0         
	//   31   54:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   32   57:checkcast       #96  <Class PieRadarChartBase>
	//   33   60:invokevirtual   #119 <Method float PieRadarChartBase.getRotationAngle()>
	//   34   63:aload_0         
	//   35   64:getfield        #41  <Field float mDecelerationAngularVelocity>
	//   36   67:fload_1         
	//   37   68:fmul            
	//   38   69:fadd            
	//   39   70:invokevirtual   #123 <Method void PieRadarChartBase.setRotationAngle(float)>
		mDecelerationLastTime = l;
	//   40   73:aload_0         
	//   41   74:lload_2         
	//   42   75:putfield        #39  <Field long mDecelerationLastTime>
		if((double)Math.abs(mDecelerationAngularVelocity) >= 0.001D)
	//*  43   78:aload_0         
	//*  44   79:getfield        #41  <Field float mDecelerationAngularVelocity>
	//*  45   82:invokestatic    #72  <Method float Math.abs(float)>
	//*  46   85:f2d             
	//*  47   86:ldc2w           #124 <Double 0.001D>
	//*  48   89:dcmpl           
	//*  49   90:iflt            101
		{
			Utils.postInvalidateOnAnimation(((View) (mChart)));
	//   50   93:aload_0         
	//   51   94:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   52   97:invokestatic    #131 <Method void Utils.postInvalidateOnAnimation(View)>
			return;
	//   53  100:return          
		} else
		{
			stopDeceleration();
	//   54  101:aload_0         
	//   55  102:invokevirtual   #134 <Method void stopDeceleration()>
			return;
	//   56  105:return          
		}
	}

	public void onLongPress(MotionEvent motionevent)
	{
		mLastGesture = ChartTouchListener.ChartGesture.LONG_PRESS;
	//    0    0:aload_0         
	//    1    1:getstatic       #142 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.LONG_PRESS>
	//    2    4:putfield        #145 <Field ChartTouchListener$ChartGesture mLastGesture>
		OnChartGestureListener onchartgesturelistener = ((PieRadarChartBase)mChart).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//    5   11:checkcast       #96  <Class PieRadarChartBase>
	//    6   14:invokevirtual   #149 <Method OnChartGestureListener PieRadarChartBase.getOnChartGestureListener()>
	//    7   17:astore_2        
		if(onchartgesturelistener != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          29
			onchartgesturelistener.onChartLongPressed(motionevent);
	//   10   22:aload_2         
	//   11   23:aload_1         
	//   12   24:invokeinterface #154 <Method void OnChartGestureListener.onChartLongPressed(MotionEvent)>
	//   13   29:return          
	}

	public boolean onSingleTapConfirmed(MotionEvent motionevent)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean onSingleTapUp(MotionEvent motionevent)
	{
		mLastGesture = ChartTouchListener.ChartGesture.SINGLE_TAP;
	//    0    0:aload_0         
	//    1    1:getstatic       #160 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.SINGLE_TAP>
	//    2    4:putfield        #145 <Field ChartTouchListener$ChartGesture mLastGesture>
		OnChartGestureListener onchartgesturelistener = ((PieRadarChartBase)mChart).getOnChartGestureListener();
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//    5   11:checkcast       #96  <Class PieRadarChartBase>
	//    6   14:invokevirtual   #149 <Method OnChartGestureListener PieRadarChartBase.getOnChartGestureListener()>
	//    7   17:astore          7
		if(onchartgesturelistener != null)
	//*   8   19:aload           7
	//*   9   21:ifnull          32
			onchartgesturelistener.onChartSingleTapped(motionevent);
	//   10   24:aload           7
	//   11   26:aload_1         
	//   12   27:invokeinterface #163 <Method void OnChartGestureListener.onChartSingleTapped(MotionEvent)>
		if(!((PieRadarChartBase)mChart).isHighlightPerTapEnabled())
	//*  13   32:aload_0         
	//*  14   33:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  15   36:checkcast       #96  <Class PieRadarChartBase>
	//*  16   39:invokevirtual   #166 <Method boolean PieRadarChartBase.isHighlightPerTapEnabled()>
	//*  17   42:ifne            47
			return false;
	//   18   45:iconst_0        
	//   19   46:ireturn         
		float f2 = ((PieRadarChartBase)mChart).distanceToCenter(motionevent.getX(), motionevent.getY());
	//   20   47:aload_0         
	//   21   48:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   22   51:checkcast       #96  <Class PieRadarChartBase>
	//   23   54:aload_1         
	//   24   55:invokevirtual   #171 <Method float MotionEvent.getX()>
	//   25   58:aload_1         
	//   26   59:invokevirtual   #174 <Method float MotionEvent.getY()>
	//   27   62:invokevirtual   #177 <Method float PieRadarChartBase.distanceToCenter(float, float)>
	//   28   65:fstore          4
		if(f2 > ((PieRadarChartBase)mChart).getRadius())
	//*  29   67:fload           4
	//*  30   69:aload_0         
	//*  31   70:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  32   73:checkcast       #96  <Class PieRadarChartBase>
	//*  33   76:invokevirtual   #180 <Method float PieRadarChartBase.getRadius()>
	//*  34   79:fcmpl           
	//*  35   80:ifle            122
		{
			if(mLastHighlighted == null)
	//*  36   83:aload_0         
	//*  37   84:getfield        #184 <Field Highlight mLastHighlighted>
	//*  38   87:ifnonnull       108
				((PieRadarChartBase)mChart).highlightValues(((Highlight []) (null)));
	//   39   90:aload_0         
	//   40   91:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   41   94:checkcast       #96  <Class PieRadarChartBase>
	//   42   97:aconst_null     
	//   43   98:invokevirtual   #188 <Method void PieRadarChartBase.highlightValues(Highlight[])>
			else
	//*  44  101:aload_0         
	//*  45  102:aconst_null     
	//*  46  103:putfield        #184 <Field Highlight mLastHighlighted>
	//*  47  106:iconst_1        
	//*  48  107:ireturn         
				((PieRadarChartBase)mChart).highlightTouch(((Highlight) (null)));
	//   49  108:aload_0         
	//   50  109:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   51  112:checkcast       #96  <Class PieRadarChartBase>
	//   52  115:aconst_null     
	//   53  116:invokevirtual   #192 <Method void PieRadarChartBase.highlightTouch(Highlight)>
			mLastHighlighted = null;
		} else
	//*  54  119:goto            101
		{
			float f1 = ((PieRadarChartBase)mChart).getAngleForPoint(motionevent.getX(), motionevent.getY());
	//   55  122:aload_0         
	//   56  123:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   57  126:checkcast       #96  <Class PieRadarChartBase>
	//   58  129:aload_1         
	//   59  130:invokevirtual   #171 <Method float MotionEvent.getX()>
	//   60  133:aload_1         
	//   61  134:invokevirtual   #174 <Method float MotionEvent.getY()>
	//   62  137:invokevirtual   #100 <Method float PieRadarChartBase.getAngleForPoint(float, float)>
	//   63  140:fstore_3        
			float f = f1;
	//   64  141:fload_3         
	//   65  142:fstore_2        
			if(mChart instanceof PieChart)
	//*  66  143:aload_0         
	//*  67  144:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  68  147:instanceof      #194 <Class PieChart>
	//*  69  150:ifeq            169
				f = f1 / ((PieRadarChartBase)mChart).getAnimator().getPhaseY();
	//   70  153:fload_3         
	//   71  154:aload_0         
	//   72  155:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   73  158:checkcast       #96  <Class PieRadarChartBase>
	//   74  161:invokevirtual   #198 <Method ChartAnimator PieRadarChartBase.getAnimator()>
	//   75  164:invokevirtual   #203 <Method float ChartAnimator.getPhaseY()>
	//   76  167:fdiv            
	//   77  168:fstore_2        
			int j = ((PieRadarChartBase)mChart).getIndexForAngle(f);
	//   78  169:aload_0         
	//   79  170:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   80  173:checkcast       #96  <Class PieRadarChartBase>
	//   81  176:fload_2         
	//   82  177:invokevirtual   #207 <Method int PieRadarChartBase.getIndexForAngle(float)>
	//   83  180:istore          6
			if(j < 0)
	//*  84  182:iload           6
	//*  85  184:ifge            206
			{
				((PieRadarChartBase)mChart).highlightValues(((Highlight []) (null)));
	//   86  187:aload_0         
	//   87  188:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   88  191:checkcast       #96  <Class PieRadarChartBase>
	//   89  194:aconst_null     
	//   90  195:invokevirtual   #188 <Method void PieRadarChartBase.highlightValues(Highlight[])>
				mLastHighlighted = null;
	//   91  198:aload_0         
	//   92  199:aconst_null     
	//   93  200:putfield        #184 <Field Highlight mLastHighlighted>
			} else
	//*  94  203:goto            106
			{
				java.util.List list = ((PieRadarChartBase)mChart).getSelectionDetailsAtIndex(j);
	//   95  206:aload_0         
	//   96  207:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   97  210:checkcast       #96  <Class PieRadarChartBase>
	//   98  213:iload           6
	//   99  215:invokevirtual   #211 <Method java.util.List PieRadarChartBase.getSelectionDetailsAtIndex(int)>
	//  100  218:astore          7
				int i = 0;
	//  101  220:iconst_0        
	//  102  221:istore          5
				if(mChart instanceof RadarChart)
	//* 103  223:aload_0         
	//* 104  224:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 105  227:instanceof      #213 <Class RadarChart>
	//* 106  230:ifeq            254
					i = Utils.getClosestDataSetIndex(list, f2 / ((RadarChart)mChart).getFactor(), ((com.github.mikephil.charting.components.YAxis.AxisDependency) (null)));
	//  107  233:aload           7
	//  108  235:fload           4
	//  109  237:aload_0         
	//  110  238:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//  111  241:checkcast       #213 <Class RadarChart>
	//  112  244:invokevirtual   #216 <Method float RadarChart.getFactor()>
	//  113  247:fdiv            
	//  114  248:aconst_null     
	//  115  249:invokestatic    #220 <Method int Utils.getClosestDataSetIndex(java.util.List, float, com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//  116  252:istore          5
				if(i < 0)
	//* 117  254:iload           5
	//* 118  256:ifge            278
				{
					((PieRadarChartBase)mChart).highlightValues(((Highlight []) (null)));
	//  119  259:aload_0         
	//  120  260:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//  121  263:checkcast       #96  <Class PieRadarChartBase>
	//  122  266:aconst_null     
	//  123  267:invokevirtual   #188 <Method void PieRadarChartBase.highlightValues(Highlight[])>
					mLastHighlighted = null;
	//  124  270:aload_0         
	//  125  271:aconst_null     
	//  126  272:putfield        #184 <Field Highlight mLastHighlighted>
				} else
	//* 127  275:goto            106
				{
					performHighlight(new Highlight(j, i), motionevent);
	//  128  278:aload_0         
	//  129  279:new             #222 <Class Highlight>
	//  130  282:dup             
	//  131  283:iload           6
	//  132  285:iload           5
	//  133  287:invokespecial   #225 <Method void Highlight(int, int)>
	//  134  290:aload_1         
	//  135  291:invokevirtual   #229 <Method void performHighlight(Highlight, MotionEvent)>
				}
			}
		}
		return true;
	//* 136  294:goto            106
	}

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		while(mGestureDetector.onTouchEvent(motionevent) || !((PieRadarChartBase)mChart).isRotationEnabled()) 
	//*   0    0:aload_0         
	//*   1    1:getfield        #238 <Field GestureDetector mGestureDetector>
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #243 <Method boolean GestureDetector.onTouchEvent(MotionEvent)>
	//*   4    8:ifeq            13
			return true;
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:aload_0         
	//    8   14:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//    9   17:checkcast       #96  <Class PieRadarChartBase>
	//   10   20:invokevirtual   #246 <Method boolean PieRadarChartBase.isRotationEnabled()>
	//   11   23:ifeq            11
		float f = motionevent.getX();
	//   12   26:aload_2         
	//   13   27:invokevirtual   #171 <Method float MotionEvent.getX()>
	//   14   30:fstore_3        
		float f1 = motionevent.getY();
	//   15   31:aload_2         
	//   16   32:invokevirtual   #174 <Method float MotionEvent.getY()>
	//   17   35:fstore          4
		switch(motionevent.getAction())
	//*  18   37:aload_2         
	//*  19   38:invokevirtual   #249 <Method int MotionEvent.getAction()>
		{
	//*  20   41:tableswitch     0 2: default 68
	//	               0 70
	//	               1 245
	//	               2 129
		default:
			return true;
	//   21   68:iconst_1        
	//   22   69:ireturn         

		case 0: // '\0'
			startAction(motionevent);
	//   23   70:aload_0         
	//   24   71:aload_2         
	//   25   72:invokevirtual   #252 <Method void startAction(MotionEvent)>
			stopDeceleration();
	//   26   75:aload_0         
	//   27   76:invokevirtual   #134 <Method void stopDeceleration()>
			resetVelocity();
	//   28   79:aload_0         
	//   29   80:invokespecial   #254 <Method void resetVelocity()>
			if(((PieRadarChartBase)mChart).isDragDecelerationEnabled())
	//*  30   83:aload_0         
	//*  31   84:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  32   87:checkcast       #96  <Class PieRadarChartBase>
	//*  33   90:invokevirtual   #257 <Method boolean PieRadarChartBase.isDragDecelerationEnabled()>
	//*  34   93:ifeq            103
				sampleVelocity(f, f1);
	//   35   96:aload_0         
	//   36   97:fload_3         
	//   37   98:fload           4
	//   38  100:invokespecial   #259 <Method void sampleVelocity(float, float)>
			setGestureStartAngle(f, f1);
	//   39  103:aload_0         
	//   40  104:fload_3         
	//   41  105:fload           4
	//   42  107:invokevirtual   #262 <Method void setGestureStartAngle(float, float)>
			mTouchStartPoint.x = f;
	//   43  110:aload_0         
	//   44  111:getfield        #30  <Field PointF mTouchStartPoint>
	//   45  114:fload_3         
	//   46  115:putfield        #265 <Field float PointF.x>
			mTouchStartPoint.y = f1;
	//   47  118:aload_0         
	//   48  119:getfield        #30  <Field PointF mTouchStartPoint>
	//   49  122:fload           4
	//   50  124:putfield        #268 <Field float PointF.y>
			return true;
	//   51  127:iconst_1        
	//   52  128:ireturn         

		case 2: // '\002'
			if(((PieRadarChartBase)mChart).isDragDecelerationEnabled())
	//*  53  129:aload_0         
	//*  54  130:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//*  55  133:checkcast       #96  <Class PieRadarChartBase>
	//*  56  136:invokevirtual   #257 <Method boolean PieRadarChartBase.isDragDecelerationEnabled()>
	//*  57  139:ifeq            149
				sampleVelocity(f, f1);
	//   58  142:aload_0         
	//   59  143:fload_3         
	//   60  144:fload           4
	//   61  146:invokespecial   #259 <Method void sampleVelocity(float, float)>
			if(mTouchMode == 0 && distance(f, mTouchStartPoint.x, f1, mTouchStartPoint.y) > Utils.convertDpToPixel(8F))
	//*  62  149:aload_0         
	//*  63  150:getfield        #272 <Field int mTouchMode>
	//*  64  153:ifne            216
	//*  65  156:fload_3         
	//*  66  157:aload_0         
	//*  67  158:getfield        #30  <Field PointF mTouchStartPoint>
	//*  68  161:getfield        #265 <Field float PointF.x>
	//*  69  164:fload           4
	//*  70  166:aload_0         
	//*  71  167:getfield        #30  <Field PointF mTouchStartPoint>
	//*  72  170:getfield        #268 <Field float PointF.y>
	//*  73  173:invokestatic    #276 <Method float distance(float, float, float, float)>
	//*  74  176:ldc2            #277 <Float 8F>
	//*  75  179:invokestatic    #280 <Method float Utils.convertDpToPixel(float)>
	//*  76  182:fcmpl           
	//*  77  183:ifle            216
			{
				mLastGesture = ChartTouchListener.ChartGesture.ROTATE;
	//   78  186:aload_0         
	//   79  187:getstatic       #283 <Field ChartTouchListener$ChartGesture ChartTouchListener$ChartGesture.ROTATE>
	//   80  190:putfield        #145 <Field ChartTouchListener$ChartGesture mLastGesture>
				mTouchMode = 6;
	//   81  193:aload_0         
	//   82  194:bipush          6
	//   83  196:putfield        #272 <Field int mTouchMode>
				((PieRadarChartBase)mChart).disableScroll();
	//   84  199:aload_0         
	//   85  200:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//   86  203:checkcast       #96  <Class PieRadarChartBase>
	//   87  206:invokevirtual   #286 <Method void PieRadarChartBase.disableScroll()>
			} else
	//*  88  209:aload_0         
	//*  89  210:aload_2         
	//*  90  211:invokevirtual   #289 <Method void endAction(MotionEvent)>
	//*  91  214:iconst_1        
	//*  92  215:ireturn         
			if(mTouchMode == 6)
	//*  93  216:aload_0         
	//*  94  217:getfield        #272 <Field int mTouchMode>
	//*  95  220:bipush          6
	//*  96  222:icmpne          209
			{
				updateGestureRotation(f, f1);
	//   97  225:aload_0         
	//   98  226:fload_3         
	//   99  227:fload           4
	//  100  229:invokevirtual   #292 <Method void updateGestureRotation(float, float)>
				((PieRadarChartBase)mChart).invalidate();
	//  101  232:aload_0         
	//  102  233:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//  103  236:checkcast       #96  <Class PieRadarChartBase>
	//  104  239:invokevirtual   #295 <Method void PieRadarChartBase.invalidate()>
			}
			endAction(motionevent);
			return true;

	//* 105  242:goto            209
		case 1: // '\001'
			if(((PieRadarChartBase)mChart).isDragDecelerationEnabled())
	//* 106  245:aload_0         
	//* 107  246:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//* 108  249:checkcast       #96  <Class PieRadarChartBase>
	//* 109  252:invokevirtual   #257 <Method boolean PieRadarChartBase.isDragDecelerationEnabled()>
	//* 110  255:ifeq            300
			{
				stopDeceleration();
	//  111  258:aload_0         
	//  112  259:invokevirtual   #134 <Method void stopDeceleration()>
				sampleVelocity(f, f1);
	//  113  262:aload_0         
	//  114  263:fload_3         
	//  115  264:fload           4
	//  116  266:invokespecial   #259 <Method void sampleVelocity(float, float)>
				mDecelerationAngularVelocity = calculateVelocity();
	//  117  269:aload_0         
	//  118  270:aload_0         
	//  119  271:invokespecial   #297 <Method float calculateVelocity()>
	//  120  274:putfield        #41  <Field float mDecelerationAngularVelocity>
				if(mDecelerationAngularVelocity != 0.0F)
	//* 121  277:aload_0         
	//* 122  278:getfield        #41  <Field float mDecelerationAngularVelocity>
	//* 123  281:fconst_0        
	//* 124  282:fcmpl           
	//* 125  283:ifeq            300
				{
					mDecelerationLastTime = AnimationUtils.currentAnimationTimeMillis();
	//  126  286:aload_0         
	//  127  287:invokestatic    #90  <Method long AnimationUtils.currentAnimationTimeMillis()>
	//  128  290:putfield        #39  <Field long mDecelerationLastTime>
					Utils.postInvalidateOnAnimation(((View) (mChart)));
	//  129  293:aload_0         
	//  130  294:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//  131  297:invokestatic    #131 <Method void Utils.postInvalidateOnAnimation(View)>
				}
			}
			((PieRadarChartBase)mChart).enableScroll();
	//  132  300:aload_0         
	//  133  301:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//  134  304:checkcast       #96  <Class PieRadarChartBase>
	//  135  307:invokevirtual   #300 <Method void PieRadarChartBase.enableScroll()>
			mTouchMode = 0;
	//  136  310:aload_0         
	//  137  311:iconst_0        
	//  138  312:putfield        #272 <Field int mTouchMode>
			endAction(motionevent);
	//  139  315:aload_0         
	//  140  316:aload_2         
	//  141  317:invokevirtual   #289 <Method void endAction(MotionEvent)>
			return true;
	//  142  320:iconst_1        
	//  143  321:ireturn         
		}
	}

	public void setGestureStartAngle(float f, float f1)
	{
		mStartAngle = ((PieRadarChartBase)mChart).getAngleForPoint(f, f1) - ((PieRadarChartBase)mChart).getRawRotationAngle();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//    3    5:checkcast       #96  <Class PieRadarChartBase>
	//    4    8:fload_1         
	//    5    9:fload_2         
	//    6   10:invokevirtual   #100 <Method float PieRadarChartBase.getAngleForPoint(float, float)>
	//    7   13:aload_0         
	//    8   14:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//    9   17:checkcast       #96  <Class PieRadarChartBase>
	//   10   20:invokevirtual   #304 <Method float PieRadarChartBase.getRawRotationAngle()>
	//   11   23:fsub            
	//   12   24:putfield        #32  <Field float mStartAngle>
	//   13   27:return          
	}

	public void stopDeceleration()
	{
		mDecelerationAngularVelocity = 0.0F;
	//    0    0:aload_0         
	//    1    1:fconst_0        
	//    2    2:putfield        #41  <Field float mDecelerationAngularVelocity>
	//    3    5:return          
	}

	public void updateGestureRotation(float f, float f1)
	{
		((PieRadarChartBase)mChart).setRotationAngle(((PieRadarChartBase)mChart).getAngleForPoint(f, f1) - mStartAngle);
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//    2    4:checkcast       #96  <Class PieRadarChartBase>
	//    3    7:aload_0         
	//    4    8:getfield        #94  <Field com.github.mikephil.charting.charts.Chart mChart>
	//    5   11:checkcast       #96  <Class PieRadarChartBase>
	//    6   14:fload_1         
	//    7   15:fload_2         
	//    8   16:invokevirtual   #100 <Method float PieRadarChartBase.getAngleForPoint(float, float)>
	//    9   19:aload_0         
	//   10   20:getfield        #32  <Field float mStartAngle>
	//   11   23:fsub            
	//   12   24:invokevirtual   #123 <Method void PieRadarChartBase.setRotationAngle(float)>
	//   13   27:return          
	}

	private ArrayList _velocitySamples;
	private float mDecelerationAngularVelocity;
	private long mDecelerationLastTime;
	private float mStartAngle;
	private PointF mTouchStartPoint;
}
