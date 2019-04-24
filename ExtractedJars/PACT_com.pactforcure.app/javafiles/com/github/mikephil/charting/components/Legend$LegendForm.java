// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;


// Referenced classes of package com.github.mikephil.charting.components:
//			Legend

public static final class Legend$LegendForm extends Enum
{

	public static Legend$LegendForm valueOf(String s)
	{
		return (Legend$LegendForm)Enum.valueOf(com/github/mikephil/charting/components/Legend$LegendForm, s);
	//    0    0:ldc1            #2   <Class Legend$LegendForm>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Legend$LegendForm>
	//    4    9:areturn         
	}

	public static Legend$LegendForm[] values()
	{
		return (Legend$LegendForm[])((Legend$LegendForm []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field Legend$LegendForm[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.github.mikephil.charting.components.Legend$LegendForm_3B_.clone()>
	//    2    6:checkcast       #42  <Class Legend$LegendForm[]>
	//    3    9:areturn         
	}

	private static final Legend$LegendForm $VALUES[];
	public static final Legend$LegendForm CIRCLE;
	public static final Legend$LegendForm LINE;
	public static final Legend$LegendForm SQUARE;

	static 
	{
		SQUARE = new Legend$LegendForm("SQUARE", 0);
	//    0    0:new             #2   <Class Legend$LegendForm>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "SQUARE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void Legend$LegendForm(String, int)>
	//    5   10:putstatic       #23  <Field Legend$LegendForm SQUARE>
		CIRCLE = new Legend$LegendForm("CIRCLE", 1);
	//    6   13:new             #2   <Class Legend$LegendForm>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "CIRCLE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void Legend$LegendForm(String, int)>
	//   11   23:putstatic       #26  <Field Legend$LegendForm CIRCLE>
		LINE = new Legend$LegendForm("LINE", 2);
	//   12   26:new             #2   <Class Legend$LegendForm>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "LINE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void Legend$LegendForm(String, int)>
	//   17   36:putstatic       #29  <Field Legend$LegendForm LINE>
		$VALUES = (new Legend$LegendForm[] {
			SQUARE, CIRCLE, LINE
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       Legend$LegendForm[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field Legend$LegendForm SQUARE>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field Legend$LegendForm CIRCLE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field Legend$LegendForm LINE>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field Legend$LegendForm[] $VALUES>
	//*  33   64:return          
	}

	private Legend$LegendForm(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
