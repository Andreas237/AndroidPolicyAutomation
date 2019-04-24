// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.jobs;

import android.view.View;
import com.github.mikephil.charting.charts.BarLineChartBase;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.jobs:
//			ViewPortJob

public class ZoomJob extends ViewPortJob
{

	public ZoomJob(ViewPortHandler viewporthandler, float f, float f1, float f2, float f3, Transformer transformer, com.github.mikephil.charting.components.YAxis.AxisDependency axisdependency, 
			View view)
	{
		super(viewporthandler, f2, f3, transformer, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fload           4
	//    3    4:fload           5
	//    4    6:aload           6
	//    5    8:aload           8
	//    6   10:invokespecial   #14  <Method void ViewPortJob(ViewPortHandler, float, float, Transformer, View)>
		scaleX = f;
	//    7   13:aload_0         
	//    8   14:fload_2         
	//    9   15:putfield        #16  <Field float scaleX>
		scaleY = f1;
	//   10   18:aload_0         
	//   11   19:fload_3         
	//   12   20:putfield        #18  <Field float scaleY>
		axisDependency = axisdependency;
	//   13   23:aload_0         
	//   14   24:aload           7
	//   15   26:putfield        #20  <Field com.github.mikephil.charting.components.YAxis$AxisDependency axisDependency>
	//   16   29:return          
	}

	public void run()
	{
		android.graphics.Matrix matrix = mViewPortHandler.zoom(scaleX, scaleY);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ViewPortHandler mViewPortHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field float scaleX>
	//    4    8:aload_0         
	//    5    9:getfield        #18  <Field float scaleY>
	//    6   12:invokevirtual   #33  <Method android.graphics.Matrix ViewPortHandler.zoom(float, float)>
	//    7   15:astore_3        
		mViewPortHandler.refresh(matrix, view, false);
	//    8   16:aload_0         
	//    9   17:getfield        #27  <Field ViewPortHandler mViewPortHandler>
	//   10   20:aload_3         
	//   11   21:aload_0         
	//   12   22:getfield        #37  <Field View view>
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #41  <Method android.graphics.Matrix ViewPortHandler.refresh(android.graphics.Matrix, View, boolean)>
	//   15   29:pop             
		float f = ((BarLineChartBase)view).getDeltaY(axisDependency) / mViewPortHandler.getScaleY();
	//   16   30:aload_0         
	//   17   31:getfield        #37  <Field View view>
	//   18   34:checkcast       #43  <Class BarLineChartBase>
	//   19   37:aload_0         
	//   20   38:getfield        #20  <Field com.github.mikephil.charting.components.YAxis$AxisDependency axisDependency>
	//   21   41:invokevirtual   #47  <Method float BarLineChartBase.getDeltaY(com.github.mikephil.charting.components.YAxis$AxisDependency)>
	//   22   44:aload_0         
	//   23   45:getfield        #27  <Field ViewPortHandler mViewPortHandler>
	//   24   48:invokevirtual   #51  <Method float ViewPortHandler.getScaleY()>
	//   25   51:fdiv            
	//   26   52:fstore_1        
		float f1 = (float)((BarLineChartBase)view).getXAxis().getValues().size() / mViewPortHandler.getScaleX();
	//   27   53:aload_0         
	//   28   54:getfield        #37  <Field View view>
	//   29   57:checkcast       #43  <Class BarLineChartBase>
	//   30   60:invokevirtual   #55  <Method XAxis BarLineChartBase.getXAxis()>
	//   31   63:invokevirtual   #61  <Method List XAxis.getValues()>
	//   32   66:invokeinterface #67  <Method int List.size()>
	//   33   71:i2f             
	//   34   72:aload_0         
	//   35   73:getfield        #27  <Field ViewPortHandler mViewPortHandler>
	//   36   76:invokevirtual   #70  <Method float ViewPortHandler.getScaleX()>
	//   37   79:fdiv            
	//   38   80:fstore_2        
		pts[0] = xValue - f1 / 2.0F;
	//   39   81:aload_0         
	//   40   82:getfield        #74  <Field float[] pts>
	//   41   85:iconst_0        
	//   42   86:aload_0         
	//   43   87:getfield        #77  <Field float xValue>
	//   44   90:fload_2         
	//   45   91:fconst_2        
	//   46   92:fdiv            
	//   47   93:fsub            
	//   48   94:fastore         
		pts[1] = yValue + f / 2.0F;
	//   49   95:aload_0         
	//   50   96:getfield        #74  <Field float[] pts>
	//   51   99:iconst_1        
	//   52  100:aload_0         
	//   53  101:getfield        #80  <Field float yValue>
	//   54  104:fload_1         
	//   55  105:fconst_2        
	//   56  106:fdiv            
	//   57  107:fadd            
	//   58  108:fastore         
		mTrans.pointValuesToPixel(pts);
	//   59  109:aload_0         
	//   60  110:getfield        #84  <Field Transformer mTrans>
	//   61  113:aload_0         
	//   62  114:getfield        #74  <Field float[] pts>
	//   63  117:invokevirtual   #90  <Method void Transformer.pointValuesToPixel(float[])>
		matrix = mViewPortHandler.translate(pts);
	//   64  120:aload_0         
	//   65  121:getfield        #27  <Field ViewPortHandler mViewPortHandler>
	//   66  124:aload_0         
	//   67  125:getfield        #74  <Field float[] pts>
	//   68  128:invokevirtual   #94  <Method android.graphics.Matrix ViewPortHandler.translate(float[])>
	//   69  131:astore_3        
		mViewPortHandler.refresh(matrix, view, false);
	//   70  132:aload_0         
	//   71  133:getfield        #27  <Field ViewPortHandler mViewPortHandler>
	//   72  136:aload_3         
	//   73  137:aload_0         
	//   74  138:getfield        #37  <Field View view>
	//   75  141:iconst_0        
	//   76  142:invokevirtual   #41  <Method android.graphics.Matrix ViewPortHandler.refresh(android.graphics.Matrix, View, boolean)>
	//   77  145:pop             
		((BarLineChartBase)view).calculateOffsets();
	//   78  146:aload_0         
	//   79  147:getfield        #37  <Field View view>
	//   80  150:checkcast       #43  <Class BarLineChartBase>
	//   81  153:invokevirtual   #97  <Method void BarLineChartBase.calculateOffsets()>
		view.postInvalidate();
	//   82  156:aload_0         
	//   83  157:getfield        #37  <Field View view>
	//   84  160:invokevirtual   #102 <Method void View.postInvalidate()>
	//   85  163:return          
	}

	protected com.github.mikephil.charting.components.YAxis.AxisDependency axisDependency;
	protected float scaleX;
	protected float scaleY;
}
