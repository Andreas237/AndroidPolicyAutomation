// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IScatterDataSet;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			LineScatterCandleRadarDataSet, Entry, DataSet

public class ScatterDataSet extends LineScatterCandleRadarDataSet
	implements IScatterDataSet
{

	public ScatterDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #18  <Method void LineScatterCandleRadarDataSet(List, String)>
		mShapeSize = 15F;
	//    4    6:aload_0         
	//    5    7:ldc1            #19  <Float 15F>
	//    6    9:putfield        #21  <Field float mShapeSize>
		mScatterShape = com.github.mikephil.charting.charts.ScatterChart.ScatterShape.SQUARE;
	//    7   12:aload_0         
	//    8   13:getstatic       #26  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape com.github.mikephil.charting.charts.ScatterChart$ScatterShape.SQUARE>
	//    9   16:putfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
		mScatterShapeHoleRadius = 0.0F;
	//   10   19:aload_0         
	//   11   20:fconst_0        
	//   12   21:putfield        #30  <Field float mScatterShapeHoleRadius>
		mScatterShapeHoleColor = -1;
	//   13   24:aload_0         
	//   14   25:iconst_m1       
	//   15   26:putfield        #32  <Field int mScatterShapeHoleColor>
	//   16   29:return          
	}

	public DataSet copy()
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #39  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void ArrayList()>
	//    3    7:astore_2        
		for(int i = 0; i < mYVals.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #46  <Field List mYVals>
	//*   9   15:invokeinterface #52  <Method int List.size()>
	//*  10   20:icmpge          53
			((List) (obj)).add(((Object) (((Entry)mYVals.get(i)).copy())));
	//   11   23:aload_2         
	//   12   24:aload_0         
	//   13   25:getfield        #46  <Field List mYVals>
	//   14   28:iload_1         
	//   15   29:invokeinterface #56  <Method Object List.get(int)>
	//   16   34:checkcast       #58  <Class Entry>
	//   17   37:invokevirtual   #61  <Method Entry Entry.copy()>
	//   18   40:invokeinterface #65  <Method boolean List.add(Object)>
	//   19   45:pop             

	//   20   46:iload_1         
	//   21   47:iconst_1        
	//   22   48:iadd            
	//   23   49:istore_1        
	//*  24   50:goto            10
		obj = ((Object) (new ScatterDataSet(((List) (obj)), getLabel())));
	//   25   53:new             #2   <Class ScatterDataSet>
	//   26   56:dup             
	//   27   57:aload_2         
	//   28   58:aload_0         
	//   29   59:invokevirtual   #69  <Method String getLabel()>
	//   30   62:invokespecial   #70  <Method void ScatterDataSet(List, String)>
	//   31   65:astore_2        
		obj.mColors = mColors;
	//   32   66:aload_2         
	//   33   67:aload_0         
	//   34   68:getfield        #73  <Field List mColors>
	//   35   71:putfield        #73  <Field List mColors>
		obj.mShapeSize = mShapeSize;
	//   36   74:aload_2         
	//   37   75:aload_0         
	//   38   76:getfield        #21  <Field float mShapeSize>
	//   39   79:putfield        #21  <Field float mShapeSize>
		obj.mScatterShape = mScatterShape;
	//   40   82:aload_2         
	//   41   83:aload_0         
	//   42   84:getfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
	//   43   87:putfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
		obj.mScatterShapeHoleRadius = mScatterShapeHoleRadius;
	//   44   90:aload_2         
	//   45   91:aload_0         
	//   46   92:getfield        #30  <Field float mScatterShapeHoleRadius>
	//   47   95:putfield        #30  <Field float mScatterShapeHoleRadius>
		obj.mScatterShapeHoleColor = mScatterShapeHoleColor;
	//   48   98:aload_2         
	//   49   99:aload_0         
	//   50  100:getfield        #32  <Field int mScatterShapeHoleColor>
	//   51  103:putfield        #32  <Field int mScatterShapeHoleColor>
		obj.mHighLightColor = mHighLightColor;
	//   52  106:aload_2         
	//   53  107:aload_0         
	//   54  108:getfield        #76  <Field int mHighLightColor>
	//   55  111:putfield        #76  <Field int mHighLightColor>
		return ((DataSet) (obj));
	//   56  114:aload_2         
	//   57  115:areturn         
	}

	public com.github.mikephil.charting.charts.ScatterChart.ScatterShape getScatterShape()
	{
		return mScatterShape;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
	//    2    4:areturn         
	}

	public int getScatterShapeHoleColor()
	{
		return mScatterShapeHoleColor;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int mScatterShapeHoleColor>
	//    2    4:ireturn         
	}

	public float getScatterShapeHoleRadius()
	{
		return mScatterShapeHoleRadius;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field float mScatterShapeHoleRadius>
	//    2    4:freturn         
	}

	public float getScatterShapeSize()
	{
		return mShapeSize;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field float mShapeSize>
	//    2    4:freturn         
	}

	public void setScatterShape(com.github.mikephil.charting.charts.ScatterChart.ScatterShape scattershape)
	{
		mScatterShape = scattershape;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field com.github.mikephil.charting.charts.ScatterChart$ScatterShape mScatterShape>
	//    3    5:return          
	}

	public void setScatterShapeHoleColor(int i)
	{
		mScatterShapeHoleColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #32  <Field int mScatterShapeHoleColor>
	//    3    5:return          
	}

	public void setScatterShapeHoleRadius(float f)
	{
		mScatterShapeHoleRadius = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #30  <Field float mScatterShapeHoleRadius>
	//    3    5:return          
	}

	public void setScatterShapeSize(float f)
	{
		mShapeSize = f;
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:putfield        #21  <Field float mShapeSize>
	//    3    5:return          
	}

	private com.github.mikephil.charting.charts.ScatterChart.ScatterShape mScatterShape;
	private int mScatterShapeHoleColor;
	private float mScatterShapeHoleRadius;
	private float mShapeSize;
}
