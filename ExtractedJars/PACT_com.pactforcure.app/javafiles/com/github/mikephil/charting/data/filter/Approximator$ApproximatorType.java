// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.data.filter;


// Referenced classes of package com.github.mikephil.charting.data.filter:
//			Approximator

public static final class Approximator$ApproximatorType extends Enum
{

	public static Approximator$ApproximatorType valueOf(String s)
	{
		return (Approximator$ApproximatorType)Enum.valueOf(com/github/mikephil/charting/data/filter/Approximator$ApproximatorType, s);
	//    0    0:ldc1            #2   <Class Approximator$ApproximatorType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class Approximator$ApproximatorType>
	//    4    9:areturn         
	}

	public static Approximator$ApproximatorType[] values()
	{
		return (Approximator$ApproximatorType[])((Approximator$ApproximatorType []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field Approximator$ApproximatorType[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.github.mikephil.charting.data.filter.Approximator$ApproximatorType_3B_.clone()>
	//    2    6:checkcast       #38  <Class Approximator$ApproximatorType[]>
	//    3    9:areturn         
	}

	private static final Approximator$ApproximatorType $VALUES[];
	public static final Approximator$ApproximatorType DOUGLAS_PEUCKER;
	public static final Approximator$ApproximatorType NONE;

	static 
	{
		NONE = new Approximator$ApproximatorType("NONE", 0);
	//    0    0:new             #2   <Class Approximator$ApproximatorType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "NONE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void Approximator$ApproximatorType(String, int)>
	//    5   10:putstatic       #22  <Field Approximator$ApproximatorType NONE>
		DOUGLAS_PEUCKER = new Approximator$ApproximatorType("DOUGLAS_PEUCKER", 1);
	//    6   13:new             #2   <Class Approximator$ApproximatorType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "DOUGLAS_PEUCKER">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void Approximator$ApproximatorType(String, int)>
	//   11   23:putstatic       #25  <Field Approximator$ApproximatorType DOUGLAS_PEUCKER>
		$VALUES = (new Approximator$ApproximatorType[] {
			NONE, DOUGLAS_PEUCKER
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       Approximator$ApproximatorType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field Approximator$ApproximatorType NONE>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field Approximator$ApproximatorType DOUGLAS_PEUCKER>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field Approximator$ApproximatorType[] $VALUES>
	//*  23   45:return          
	}

	private Approximator$ApproximatorType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
