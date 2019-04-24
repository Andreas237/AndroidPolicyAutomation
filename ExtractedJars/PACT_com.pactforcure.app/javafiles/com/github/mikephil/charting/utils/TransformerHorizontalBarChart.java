// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.utils;

import android.graphics.Matrix;

// Referenced classes of package com.github.mikephil.charting.utils:
//			Transformer, ViewPortHandler

public class TransformerHorizontalBarChart extends Transformer
{

	public TransformerHorizontalBarChart(ViewPortHandler viewporthandler)
	{
		super(viewporthandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #8   <Method void Transformer(ViewPortHandler)>
	//    3    5:return          
	}

	public void prepareMatrixOffset(boolean flag)
	{
		mMatrixOffset.reset();
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Matrix mMatrixOffset>
	//    2    4:invokevirtual   #21  <Method void Matrix.reset()>
		if(!flag)
	//*   3    7:iload_1         
	//*   4    8:ifne            42
		{
			mMatrixOffset.postTranslate(mViewPortHandler.offsetLeft(), mViewPortHandler.getChartHeight() - mViewPortHandler.offsetBottom());
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field Matrix mMatrixOffset>
	//    7   15:aload_0         
	//    8   16:getfield        #25  <Field ViewPortHandler mViewPortHandler>
	//    9   19:invokevirtual   #31  <Method float ViewPortHandler.offsetLeft()>
	//   10   22:aload_0         
	//   11   23:getfield        #25  <Field ViewPortHandler mViewPortHandler>
	//   12   26:invokevirtual   #34  <Method float ViewPortHandler.getChartHeight()>
	//   13   29:aload_0         
	//   14   30:getfield        #25  <Field ViewPortHandler mViewPortHandler>
	//   15   33:invokevirtual   #37  <Method float ViewPortHandler.offsetBottom()>
	//   16   36:fsub            
	//   17   37:invokevirtual   #41  <Method boolean Matrix.postTranslate(float, float)>
	//   18   40:pop             
			return;
	//   19   41:return          
		} else
		{
			mMatrixOffset.setTranslate(-(mViewPortHandler.getChartWidth() - mViewPortHandler.offsetRight()), mViewPortHandler.getChartHeight() - mViewPortHandler.offsetBottom());
	//   20   42:aload_0         
	//   21   43:getfield        #15  <Field Matrix mMatrixOffset>
	//   22   46:aload_0         
	//   23   47:getfield        #25  <Field ViewPortHandler mViewPortHandler>
	//   24   50:invokevirtual   #44  <Method float ViewPortHandler.getChartWidth()>
	//   25   53:aload_0         
	//   26   54:getfield        #25  <Field ViewPortHandler mViewPortHandler>
	//   27   57:invokevirtual   #47  <Method float ViewPortHandler.offsetRight()>
	//   28   60:fsub            
	//   29   61:fneg            
	//   30   62:aload_0         
	//   31   63:getfield        #25  <Field ViewPortHandler mViewPortHandler>
	//   32   66:invokevirtual   #34  <Method float ViewPortHandler.getChartHeight()>
	//   33   69:aload_0         
	//   34   70:getfield        #25  <Field ViewPortHandler mViewPortHandler>
	//   35   73:invokevirtual   #37  <Method float ViewPortHandler.offsetBottom()>
	//   36   76:fsub            
	//   37   77:invokevirtual   #51  <Method void Matrix.setTranslate(float, float)>
			mMatrixOffset.postScale(-1F, 1.0F);
	//   38   80:aload_0         
	//   39   81:getfield        #15  <Field Matrix mMatrixOffset>
	//   40   84:ldc1            #52  <Float -1F>
	//   41   86:fconst_1        
	//   42   87:invokevirtual   #55  <Method boolean Matrix.postScale(float, float)>
	//   43   90:pop             
			return;
	//   44   91:return          
		}
	}
}
