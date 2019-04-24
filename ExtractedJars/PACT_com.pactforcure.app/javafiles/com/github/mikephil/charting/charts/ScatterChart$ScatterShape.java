// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;


// Referenced classes of package com.github.mikephil.charting.charts:
//			ScatterChart

public static final class ScatterChart$ScatterShape extends Enum
{

	public static ScatterChart$ScatterShape valueOf(String s)
	{
		return (ScatterChart$ScatterShape)Enum.valueOf(com/github/mikephil/charting/charts/ScatterChart$ScatterShape, s);
	//    0    0:ldc1            #2   <Class ScatterChart$ScatterShape>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ScatterChart$ScatterShape>
	//    4    9:areturn         
	}

	public static ScatterChart$ScatterShape[] values()
	{
		return (ScatterChart$ScatterShape[])((ScatterChart$ScatterShape []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field ScatterChart$ScatterShape[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.github.mikephil.charting.charts.ScatterChart$ScatterShape_3B_.clone()>
	//    2    6:checkcast       #50  <Class ScatterChart$ScatterShape[]>
	//    3    9:areturn         
	}

	private static final ScatterChart$ScatterShape $VALUES[];
	public static final ScatterChart$ScatterShape CIRCLE;
	public static final ScatterChart$ScatterShape CROSS;
	public static final ScatterChart$ScatterShape SQUARE;
	public static final ScatterChart$ScatterShape TRIANGLE;
	public static final ScatterChart$ScatterShape X;

	static 
	{
		SQUARE = new ScatterChart$ScatterShape("SQUARE", 0);
	//    0    0:new             #2   <Class ScatterChart$ScatterShape>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "SQUARE">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
	//    5   10:putstatic       #25  <Field ScatterChart$ScatterShape SQUARE>
		CIRCLE = new ScatterChart$ScatterShape("CIRCLE", 1);
	//    6   13:new             #2   <Class ScatterChart$ScatterShape>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "CIRCLE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
	//   11   23:putstatic       #28  <Field ScatterChart$ScatterShape CIRCLE>
		TRIANGLE = new ScatterChart$ScatterShape("TRIANGLE", 2);
	//   12   26:new             #2   <Class ScatterChart$ScatterShape>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "TRIANGLE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
	//   17   36:putstatic       #31  <Field ScatterChart$ScatterShape TRIANGLE>
		CROSS = new ScatterChart$ScatterShape("CROSS", 3);
	//   18   39:new             #2   <Class ScatterChart$ScatterShape>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "CROSS">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
	//   23   49:putstatic       #34  <Field ScatterChart$ScatterShape CROSS>
		X = new ScatterChart$ScatterShape("X", 4);
	//   24   52:new             #2   <Class ScatterChart$ScatterShape>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "X">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void ScatterChart$ScatterShape(String, int)>
	//   29   62:putstatic       #37  <Field ScatterChart$ScatterShape X>
		$VALUES = (new ScatterChart$ScatterShape[] {
			SQUARE, CIRCLE, TRIANGLE, CROSS, X
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       ScatterChart$ScatterShape[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field ScatterChart$ScatterShape SQUARE>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field ScatterChart$ScatterShape CIRCLE>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field ScatterChart$ScatterShape TRIANGLE>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field ScatterChart$ScatterShape CROSS>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field ScatterChart$ScatterShape X>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field ScatterChart$ScatterShape[] $VALUES>
	//*  53  102:return          
	}

	private ScatterChart$ScatterShape(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
