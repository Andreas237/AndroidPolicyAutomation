// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.formatter;

import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.utils.ViewPortHandler;
import java.text.DecimalFormat;

// Referenced classes of package com.github.mikephil.charting.formatter:
//			ValueFormatter, YAxisValueFormatter

public class PercentFormatter
	implements ValueFormatter, YAxisValueFormatter
{

	public PercentFormatter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mFormat = new DecimalFormat("###,###,##0.0");
	//    2    4:aload_0         
	//    3    5:new             #16  <Class DecimalFormat>
	//    4    8:dup             
	//    5    9:ldc1            #18  <String "###,###,##0.0">
	//    6   11:invokespecial   #21  <Method void DecimalFormat(String)>
	//    7   14:putfield        #23  <Field DecimalFormat mFormat>
	//    8   17:return          
	}

	public PercentFormatter(DecimalFormat decimalformat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		mFormat = decimalformat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #23  <Field DecimalFormat mFormat>
	//    5    9:return          
	}

	public String getFormattedValue(float f, YAxis yaxis)
	{
		return (new StringBuilder()).append(mFormat.format(f)).append(" %").toString();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field DecimalFormat mFormat>
	//    5   11:fload_1         
	//    6   12:f2d             
	//    7   13:invokevirtual   #34  <Method String DecimalFormat.format(double)>
	//    8   16:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #40  <String " %">
	//   10   21:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   12   27:areturn         
	}

	public String getFormattedValue(float f, Entry entry, int i, ViewPortHandler viewporthandler)
	{
		return (new StringBuilder()).append(mFormat.format(f)).append(" %").toString();
	//    0    0:new             #29  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #30  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field DecimalFormat mFormat>
	//    5   11:fload_1         
	//    6   12:f2d             
	//    7   13:invokevirtual   #34  <Method String DecimalFormat.format(double)>
	//    8   16:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//    9   19:ldc1            #40  <String " %">
	//   10   21:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   12   27:areturn         
	}

	protected DecimalFormat mFormat;
}
