// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;

import android.graphics.Color;
import com.github.mikephil.charting.interfaces.datasets.IBarLineScatterCandleBubbleDataSet;
import java.util.List;

// Referenced classes of package com.github.mikephil.charting.data:
//			DataSet

public abstract class BarLineScatterCandleBubbleDataSet extends DataSet
	implements IBarLineScatterCandleBubbleDataSet
{

	public BarLineScatterCandleBubbleDataSet(List list, String s)
	{
		super(list, s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #13  <Method void DataSet(List, String)>
		mHighLightColor = Color.rgb(255, 187, 115);
	//    4    6:aload_0         
	//    5    7:sipush          255
	//    6   10:sipush          187
	//    7   13:bipush          115
	//    8   15:invokestatic    #19  <Method int Color.rgb(int, int, int)>
	//    9   18:putfield        #21  <Field int mHighLightColor>
	//   10   21:return          
	}

	public int getHighLightColor()
	{
		return mHighLightColor;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int mHighLightColor>
	//    2    4:ireturn         
	}

	public void setHighLightColor(int i)
	{
		mHighLightColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #21  <Field int mHighLightColor>
	//    3    5:return          
	}

	protected int mHighLightColor;
}
