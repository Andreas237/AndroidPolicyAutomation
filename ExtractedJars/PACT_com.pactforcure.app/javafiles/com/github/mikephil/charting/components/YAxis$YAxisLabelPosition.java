// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;


// Referenced classes of package com.github.mikephil.charting.components:
//			YAxis

public static final class YAxis$YAxisLabelPosition extends Enum
{

	public static YAxis$YAxisLabelPosition valueOf(String s)
	{
		return (YAxis$YAxisLabelPosition)Enum.valueOf(com/github/mikephil/charting/components/YAxis$YAxisLabelPosition, s);
	//    0    0:ldc1            #2   <Class YAxis$YAxisLabelPosition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class YAxis$YAxisLabelPosition>
	//    4    9:areturn         
	}

	public static YAxis$YAxisLabelPosition[] values()
	{
		return (YAxis$YAxisLabelPosition[])((YAxis$YAxisLabelPosition []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field YAxis$YAxisLabelPosition[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.github.mikephil.charting.components.YAxis$YAxisLabelPosition_3B_.clone()>
	//    2    6:checkcast       #38  <Class YAxis$YAxisLabelPosition[]>
	//    3    9:areturn         
	}

	private static final YAxis$YAxisLabelPosition $VALUES[];
	public static final YAxis$YAxisLabelPosition INSIDE_CHART;
	public static final YAxis$YAxisLabelPosition OUTSIDE_CHART;

	static 
	{
		OUTSIDE_CHART = new YAxis$YAxisLabelPosition("OUTSIDE_CHART", 0);
	//    0    0:new             #2   <Class YAxis$YAxisLabelPosition>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "OUTSIDE_CHART">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void YAxis$YAxisLabelPosition(String, int)>
	//    5   10:putstatic       #22  <Field YAxis$YAxisLabelPosition OUTSIDE_CHART>
		INSIDE_CHART = new YAxis$YAxisLabelPosition("INSIDE_CHART", 1);
	//    6   13:new             #2   <Class YAxis$YAxisLabelPosition>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "INSIDE_CHART">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void YAxis$YAxisLabelPosition(String, int)>
	//   11   23:putstatic       #25  <Field YAxis$YAxisLabelPosition INSIDE_CHART>
		$VALUES = (new YAxis$YAxisLabelPosition[] {
			OUTSIDE_CHART, INSIDE_CHART
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       YAxis$YAxisLabelPosition[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field YAxis$YAxisLabelPosition OUTSIDE_CHART>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field YAxis$YAxisLabelPosition INSIDE_CHART>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field YAxis$YAxisLabelPosition[] $VALUES>
	//*  23   45:return          
	}

	private YAxis$YAxisLabelPosition(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
