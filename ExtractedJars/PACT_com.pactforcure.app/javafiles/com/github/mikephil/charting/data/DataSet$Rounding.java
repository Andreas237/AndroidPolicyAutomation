// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data;


// Referenced classes of package com.github.mikephil.charting.data:
//			DataSet

public static final class DataSet$Rounding extends Enum
{

	public static DataSet$Rounding valueOf(String s)
	{
		return (DataSet$Rounding)Enum.valueOf(com/github/mikephil/charting/data/DataSet$Rounding, s);
	//    0    0:ldc1            #2   <Class DataSet$Rounding>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DataSet$Rounding>
	//    4    9:areturn         
	}

	public static DataSet$Rounding[] values()
	{
		return (DataSet$Rounding[])((DataSet$Rounding []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field DataSet$Rounding[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.github.mikephil.charting.data.DataSet$Rounding_3B_.clone()>
	//    2    6:checkcast       #42  <Class DataSet$Rounding[]>
	//    3    9:areturn         
	}

	private static final DataSet$Rounding $VALUES[];
	public static final DataSet$Rounding CLOSEST;
	public static final DataSet$Rounding DOWN;
	public static final DataSet$Rounding UP;

	static 
	{
		UP = new DataSet$Rounding("UP", 0);
	//    0    0:new             #2   <Class DataSet$Rounding>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "UP">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void DataSet$Rounding(String, int)>
	//    5   10:putstatic       #23  <Field DataSet$Rounding UP>
		DOWN = new DataSet$Rounding("DOWN", 1);
	//    6   13:new             #2   <Class DataSet$Rounding>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "DOWN">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void DataSet$Rounding(String, int)>
	//   11   23:putstatic       #26  <Field DataSet$Rounding DOWN>
		CLOSEST = new DataSet$Rounding("CLOSEST", 2);
	//   12   26:new             #2   <Class DataSet$Rounding>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "CLOSEST">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void DataSet$Rounding(String, int)>
	//   17   36:putstatic       #29  <Field DataSet$Rounding CLOSEST>
		$VALUES = (new DataSet$Rounding[] {
			UP, DOWN, CLOSEST
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       DataSet$Rounding[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field DataSet$Rounding UP>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field DataSet$Rounding DOWN>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field DataSet$Rounding CLOSEST>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field DataSet$Rounding[] $VALUES>
	//*  33   64:return          
	}

	private DataSet$Rounding(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
