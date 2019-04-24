// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.components;


// Referenced classes of package com.github.mikephil.charting.components:
//			Legend

public static final class Legend$LegendDirection extends Enum
{

	public static Legend$LegendDirection valueOf(String s)
	{
		return (Legend$LegendDirection)Enum.valueOf(com/github/mikephil/charting/components/Legend$LegendDirection, s);
	//    0    0:ldc1            #2   <Class Legend$LegendDirection>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Legend$LegendDirection>
	//    4    9:areturn         
	}

	public static Legend$LegendDirection[] values()
	{
		return (Legend$LegendDirection[])((Legend$LegendDirection []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field Legend$LegendDirection[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.github.mikephil.charting.components.Legend$LegendDirection_3B_.clone()>
	//    2    6:checkcast       #38  <Class Legend$LegendDirection[]>
	//    3    9:areturn         
	}

	private static final Legend$LegendDirection $VALUES[];
	public static final Legend$LegendDirection LEFT_TO_RIGHT;
	public static final Legend$LegendDirection RIGHT_TO_LEFT;

	static 
	{
		LEFT_TO_RIGHT = new Legend$LegendDirection("LEFT_TO_RIGHT", 0);
	//    0    0:new             #2   <Class Legend$LegendDirection>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "LEFT_TO_RIGHT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Legend$LegendDirection(String, int)>
	//    5   10:putstatic       #22  <Field Legend$LegendDirection LEFT_TO_RIGHT>
		RIGHT_TO_LEFT = new Legend$LegendDirection("RIGHT_TO_LEFT", 1);
	//    6   13:new             #2   <Class Legend$LegendDirection>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "RIGHT_TO_LEFT">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Legend$LegendDirection(String, int)>
	//   11   23:putstatic       #25  <Field Legend$LegendDirection RIGHT_TO_LEFT>
		$VALUES = (new Legend$LegendDirection[] {
			LEFT_TO_RIGHT, RIGHT_TO_LEFT
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Legend$LegendDirection[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field Legend$LegendDirection LEFT_TO_RIGHT>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field Legend$LegendDirection RIGHT_TO_LEFT>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field Legend$LegendDirection[] $VALUES>
	//*  23   45:return          
	}

	private Legend$LegendDirection(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
