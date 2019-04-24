// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.YAxis;
import java.text.DecimalFormat;

// Referenced classes of package com.github.mikephil.charting.formatter:
//			YAxisValueFormatter

public class DefaultYAxisValueFormatter
	implements YAxisValueFormatter
{

	public DefaultYAxisValueFormatter(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		StringBuffer stringbuffer = new StringBuffer();
	//    2    4:new             #15  <Class StringBuffer>
	//    3    7:dup             
	//    4    8:invokespecial   #16  <Method void StringBuffer()>
	//    5   11:astore_3        
		for(int j = 0; j < i; j++)
	//*   6   12:iconst_0        
	//*   7   13:istore_2        
	//*   8   14:iload_2         
	//*   9   15:iload_1         
	//*  10   16:icmpge          44
		{
			if(j == 0)
	//*  11   19:iload_2         
	//*  12   20:ifne            30
				stringbuffer.append(".");
	//   13   23:aload_3         
	//   14   24:ldc1            #18  <String ".">
	//   15   26:invokevirtual   #22  <Method StringBuffer StringBuffer.append(String)>
	//   16   29:pop             
			stringbuffer.append("0");
	//   17   30:aload_3         
	//   18   31:ldc1            #24  <String "0">
	//   19   33:invokevirtual   #22  <Method StringBuffer StringBuffer.append(String)>
	//   20   36:pop             
		}

	//   21   37:iload_2         
	//   22   38:iconst_1        
	//   23   39:iadd            
	//   24   40:istore_2        
	//*  25   41:goto            14
		mFormat = new DecimalFormat((new StringBuilder()).append("###,###,###,##0").append(stringbuffer.toString()).toString());
	//   26   44:aload_0         
	//   27   45:new             #26  <Class DecimalFormat>
	//   28   48:dup             
	//   29   49:new             #28  <Class StringBuilder>
	//   30   52:dup             
	//   31   53:invokespecial   #29  <Method void StringBuilder()>
	//   32   56:ldc1            #31  <String "###,###,###,##0">
	//   33   58:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   34   61:aload_3         
	//   35   62:invokevirtual   #38  <Method String StringBuffer.toString()>
	//   36   65:invokevirtual   #34  <Method StringBuilder StringBuilder.append(String)>
	//   37   68:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   38   71:invokespecial   #42  <Method void DecimalFormat(String)>
	//   39   74:putfield        #44  <Field DecimalFormat mFormat>
	//   40   77:return          
	}

	public String getFormattedValue(float f, YAxis yaxis)
	{
		return mFormat.format(f);
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field DecimalFormat mFormat>
	//    2    4:fload_1         
	//    3    5:f2d             
	//    4    6:invokevirtual   #51  <Method String DecimalFormat.format(double)>
	//    5    9:areturn         
	}

	private DecimalFormat mFormat;
}
