// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.jobs;

import android.animation.*;
import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

// Referenced classes of package com.github.mikephil.charting.jobs:
//			AnimatedViewPortJob

public class AnimatedZoomJob extends AnimatedViewPortJob
	implements android.animation.Animator.AnimatorListener
{

	public AnimatedZoomJob(ViewPortHandler viewporthandler, View view, Transformer transformer, YAxis yaxis, float f, float f1, float f2, 
			float f3, float f4, float f5, float f6, float f7, float f8, long l)
	{
		super(viewporthandler, f1, f2, transformer, view, f3, f4, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload           6
	//    3    4:fload           7
	//    4    6:aload_3         
	//    5    7:aload_2         
	//    6    8:fload           8
	//    7   10:fload           9
	//    8   12:lload           14
	//    9   14:invokespecial   #22  <Method void AnimatedViewPortJob(ViewPortHandler, float, float, Transformer, View, float, float, long)>
		zoomCenterX = f5;
	//   10   17:aload_0         
	//   11   18:fload           10
	//   12   20:putfield        #24  <Field float zoomCenterX>
		zoomCenterY = f6;
	//   13   23:aload_0         
	//   14   24:fload           11
	//   15   26:putfield        #26  <Field float zoomCenterY>
		zoomOriginX = f7;
	//   16   29:aload_0         
	//   17   30:fload           12
	//   18   32:putfield        #28  <Field float zoomOriginX>
		zoomOriginY = f8;
	//   19   35:aload_0         
	//   20   36:fload           13
	//   21   38:putfield        #30  <Field float zoomOriginY>
		animator.addListener(((android.animation.Animator.AnimatorListener) (this)));
	//   22   41:aload_0         
	//   23   42:getfield        #34  <Field ObjectAnimator animator>
	//   24   45:aload_0         
	//   25   46:invokevirtual   #40  <Method void ObjectAnimator.addListener(android.animation.Animator$AnimatorListener)>
		yAxis = yaxis;
	//   26   49:aload_0         
	//   27   50:aload           4
	//   28   52:putfield        #42  <Field YAxis yAxis>
		xValCount = f;
	//   29   55:aload_0         
	//   30   56:fload           5
	//   31   58:putfield        #44  <Field float xValCount>
	//   32   61:return          
	}

	public void onAnimationCancel(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		((BarLineChartBase)view).calculateOffsets();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field View view>
	//    2    4:checkcast       #55  <Class BarLineChartBase>
	//    3    7:invokevirtual   #59  <Method void BarLineChartBase.calculateOffsets()>
		view.postInvalidate();
	//    4   10:aload_0         
	//    5   11:getfield        #53  <Field View view>
	//    6   14:invokevirtual   #64  <Method void View.postInvalidate()>
	//    7   17:return          
	}

	public void onAnimationRepeat(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationStart(Animator animator)
	{
	//    0    0:return          
	}

	public void onAnimationUpdate(ValueAnimator valueanimator)
	{
		float f = xOrigin;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field float xOrigin>
	//    2    4:fstore_2        
		float f1 = xValue;
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field float xValue>
	//    5    9:fstore_3        
		float f2 = xOrigin;
	//    6   10:aload_0         
	//    7   11:getfield        #71  <Field float xOrigin>
	//    8   14:fstore          4
		float f3 = phase;
	//    9   16:aload_0         
	//   10   17:getfield        #77  <Field float phase>
	//   11   20:fstore          5
		float f4 = yOrigin;
	//   12   22:aload_0         
	//   13   23:getfield        #80  <Field float yOrigin>
	//   14   26:fstore          6
		float f5 = yValue;
	//   15   28:aload_0         
	//   16   29:getfield        #83  <Field float yValue>
	//   17   32:fstore          7
		float f6 = yOrigin;
	//   18   34:aload_0         
	//   19   35:getfield        #80  <Field float yOrigin>
	//   20   38:fstore          8
		float f7 = phase;
	//   21   40:aload_0         
	//   22   41:getfield        #77  <Field float phase>
	//   23   44:fstore          9
		valueanimator = ((ValueAnimator) (mViewPortHandler.setZoom(f + (f1 - f2) * f3, f4 + (f5 - f6) * f7)));
	//   24   46:aload_0         
	//   25   47:getfield        #87  <Field ViewPortHandler mViewPortHandler>
	//   26   50:fload_2         
	//   27   51:fload_3         
	//   28   52:fload           4
	//   29   54:fsub            
	//   30   55:fload           5
	//   31   57:fmul            
	//   32   58:fadd            
	//   33   59:fload           6
	//   34   61:fload           7
	//   35   63:fload           8
	//   36   65:fsub            
	//   37   66:fload           9
	//   38   68:fmul            
	//   39   69:fadd            
	//   40   70:invokevirtual   #93  <Method android.graphics.Matrix ViewPortHandler.setZoom(float, float)>
	//   41   73:astore_1        
		mViewPortHandler.refresh(((android.graphics.Matrix) (valueanimator)), view, false);
	//   42   74:aload_0         
	//   43   75:getfield        #87  <Field ViewPortHandler mViewPortHandler>
	//   44   78:aload_1         
	//   45   79:aload_0         
	//   46   80:getfield        #53  <Field View view>
	//   47   83:iconst_0        
	//   48   84:invokevirtual   #97  <Method android.graphics.Matrix ViewPortHandler.refresh(android.graphics.Matrix, View, boolean)>
	//   49   87:pop             
		f = yAxis.mAxisRange / mViewPortHandler.getScaleY();
	//   50   88:aload_0         
	//   51   89:getfield        #42  <Field YAxis yAxis>
	//   52   92:getfield        #102 <Field float YAxis.mAxisRange>
	//   53   95:aload_0         
	//   54   96:getfield        #87  <Field ViewPortHandler mViewPortHandler>
	//   55   99:invokevirtual   #106 <Method float ViewPortHandler.getScaleY()>
	//   56  102:fdiv            
	//   57  103:fstore_2        
		f1 = xValCount / mViewPortHandler.getScaleX();
	//   58  104:aload_0         
	//   59  105:getfield        #44  <Field float xValCount>
	//   60  108:aload_0         
	//   61  109:getfield        #87  <Field ViewPortHandler mViewPortHandler>
	//   62  112:invokevirtual   #109 <Method float ViewPortHandler.getScaleX()>
	//   63  115:fdiv            
	//   64  116:fstore_3        
		pts[0] = zoomOriginX + (zoomCenterX - f1 / 2.0F - zoomOriginX) * phase;
	//   65  117:aload_0         
	//   66  118:getfield        #113 <Field float[] pts>
	//   67  121:iconst_0        
	//   68  122:aload_0         
	//   69  123:getfield        #28  <Field float zoomOriginX>
	//   70  126:aload_0         
	//   71  127:getfield        #24  <Field float zoomCenterX>
	//   72  130:fload_3         
	//   73  131:fconst_2        
	//   74  132:fdiv            
	//   75  133:fsub            
	//   76  134:aload_0         
	//   77  135:getfield        #28  <Field float zoomOriginX>
	//   78  138:fsub            
	//   79  139:aload_0         
	//   80  140:getfield        #77  <Field float phase>
	//   81  143:fmul            
	//   82  144:fadd            
	//   83  145:fastore         
		pts[1] = zoomOriginY + ((zoomCenterY + f / 2.0F) - zoomOriginY) * phase;
	//   84  146:aload_0         
	//   85  147:getfield        #113 <Field float[] pts>
	//   86  150:iconst_1        
	//   87  151:aload_0         
	//   88  152:getfield        #30  <Field float zoomOriginY>
	//   89  155:aload_0         
	//   90  156:getfield        #26  <Field float zoomCenterY>
	//   91  159:fload_2         
	//   92  160:fconst_2        
	//   93  161:fdiv            
	//   94  162:fadd            
	//   95  163:aload_0         
	//   96  164:getfield        #30  <Field float zoomOriginY>
	//   97  167:fsub            
	//   98  168:aload_0         
	//   99  169:getfield        #77  <Field float phase>
	//  100  172:fmul            
	//  101  173:fadd            
	//  102  174:fastore         
		mTrans.pointValuesToPixel(pts);
	//  103  175:aload_0         
	//  104  176:getfield        #117 <Field Transformer mTrans>
	//  105  179:aload_0         
	//  106  180:getfield        #113 <Field float[] pts>
	//  107  183:invokevirtual   #123 <Method void Transformer.pointValuesToPixel(float[])>
		valueanimator = ((ValueAnimator) (mViewPortHandler.translate(pts)));
	//  108  186:aload_0         
	//  109  187:getfield        #87  <Field ViewPortHandler mViewPortHandler>
	//  110  190:aload_0         
	//  111  191:getfield        #113 <Field float[] pts>
	//  112  194:invokevirtual   #127 <Method android.graphics.Matrix ViewPortHandler.translate(float[])>
	//  113  197:astore_1        
		mViewPortHandler.refresh(((android.graphics.Matrix) (valueanimator)), view, true);
	//  114  198:aload_0         
	//  115  199:getfield        #87  <Field ViewPortHandler mViewPortHandler>
	//  116  202:aload_1         
	//  117  203:aload_0         
	//  118  204:getfield        #53  <Field View view>
	//  119  207:iconst_1        
	//  120  208:invokevirtual   #97  <Method android.graphics.Matrix ViewPortHandler.refresh(android.graphics.Matrix, View, boolean)>
	//  121  211:pop             
	//  122  212:return          
	}

	protected float xValCount;
	protected YAxis yAxis;
	protected float zoomCenterX;
	protected float zoomCenterY;
	protected float zoomOriginX;
	protected float zoomOriginY;
}
