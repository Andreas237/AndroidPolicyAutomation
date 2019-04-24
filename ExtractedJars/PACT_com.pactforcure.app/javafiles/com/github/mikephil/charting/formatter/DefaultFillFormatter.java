// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

// Referenced classes of package com.github.mikephil.charting.formatter:
//			FillFormatter

public class DefaultFillFormatter
	implements FillFormatter
{

	public DefaultFillFormatter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public float getFillLinePosition(ILineDataSet ilinedataset, LineDataProvider linedataprovider)
	{
		float f = linedataprovider.getYChartMax();
	//    0    0:aload_2         
	//    1    1:invokeinterface #19  <Method float LineDataProvider.getYChartMax()>
	//    2    6:fstore_3        
		float f1 = linedataprovider.getYChartMin();
	//    3    7:aload_2         
	//    4    8:invokeinterface #22  <Method float LineDataProvider.getYChartMin()>
	//    5   13:fstore          4
		linedataprovider = ((LineDataProvider) (linedataprovider.getLineData()));
	//    6   15:aload_2         
	//    7   16:invokeinterface #26  <Method LineData LineDataProvider.getLineData()>
	//    8   21:astore_2        
		if(ilinedataset.getYMax() > 0.0F && ilinedataset.getYMin() < 0.0F)
	//*   9   22:aload_1         
	//*  10   23:invokeinterface #31  <Method float ILineDataSet.getYMax()>
	//*  11   28:fconst_0        
	//*  12   29:fcmpl           
	//*  13   30:ifle            46
	//*  14   33:aload_1         
	//*  15   34:invokeinterface #34  <Method float ILineDataSet.getYMin()>
	//*  16   39:fconst_0        
	//*  17   40:fcmpg           
	//*  18   41:ifge            46
			return 0.0F;
	//   19   44:fconst_0        
	//   20   45:freturn         
		if(((LineData) (linedataprovider)).getYMax() > 0.0F)
	//*  21   46:aload_2         
	//*  22   47:invokevirtual   #37  <Method float LineData.getYMax()>
	//*  23   50:fconst_0        
	//*  24   51:fcmpl           
	//*  25   52:ifle            83
			f = 0.0F;
	//   26   55:fconst_0        
	//   27   56:fstore_3        
		if(((LineData) (linedataprovider)).getYMin() < 0.0F)
	//*  28   57:aload_2         
	//*  29   58:invokevirtual   #38  <Method float LineData.getYMin()>
	//*  30   61:fconst_0        
	//*  31   62:fcmpg           
	//*  32   63:ifge            86
			f1 = 0.0F;
	//   33   66:fconst_0        
	//   34   67:fstore          4
		if(ilinedataset.getYMin() >= 0.0F)
	//*  35   69:aload_1         
	//*  36   70:invokeinterface #34  <Method float ILineDataSet.getYMin()>
	//*  37   75:fconst_0        
	//*  38   76:fcmpl           
	//*  39   77:iflt            89
			return f1;
	//   40   80:fload           4
	//   41   82:freturn         
		else
	//*  42   83:goto            57
	//*  43   86:goto            69
			return f;
	//   44   89:fload_3         
	//   45   90:freturn         
	}
}
