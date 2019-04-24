// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.charts;


// Referenced classes of package com.github.mikephil.charting.charts:
//			CombinedChart

public static final class CombinedChart$DrawOrder extends Enum
{

	public static CombinedChart$DrawOrder valueOf(String s)
	{
		return (CombinedChart$DrawOrder)Enum.valueOf(com/github/mikephil/charting/charts/CombinedChart$DrawOrder, s);
	//    0    0:ldc1            #2   <Class CombinedChart$DrawOrder>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class CombinedChart$DrawOrder>
	//    4    9:areturn         
	}

	public static CombinedChart$DrawOrder[] values()
	{
		return (CombinedChart$DrawOrder[])((CombinedChart$DrawOrder []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field CombinedChart$DrawOrder[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.github.mikephil.charting.charts.CombinedChart$DrawOrder_3B_.clone()>
	//    2    6:checkcast       #50  <Class CombinedChart$DrawOrder[]>
	//    3    9:areturn         
	}

	private static final CombinedChart$DrawOrder $VALUES[];
	public static final CombinedChart$DrawOrder BAR;
	public static final CombinedChart$DrawOrder BUBBLE;
	public static final CombinedChart$DrawOrder CANDLE;
	public static final CombinedChart$DrawOrder LINE;
	public static final CombinedChart$DrawOrder SCATTER;

	static 
	{
		BAR = new CombinedChart$DrawOrder("BAR", 0);
	//    0    0:new             #2   <Class CombinedChart$DrawOrder>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "BAR">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
	//    5   10:putstatic       #25  <Field CombinedChart$DrawOrder BAR>
		BUBBLE = new CombinedChart$DrawOrder("BUBBLE", 1);
	//    6   13:new             #2   <Class CombinedChart$DrawOrder>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "BUBBLE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
	//   11   23:putstatic       #28  <Field CombinedChart$DrawOrder BUBBLE>
		LINE = new CombinedChart$DrawOrder("LINE", 2);
	//   12   26:new             #2   <Class CombinedChart$DrawOrder>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "LINE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
	//   17   36:putstatic       #31  <Field CombinedChart$DrawOrder LINE>
		CANDLE = new CombinedChart$DrawOrder("CANDLE", 3);
	//   18   39:new             #2   <Class CombinedChart$DrawOrder>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "CANDLE">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
	//   23   49:putstatic       #34  <Field CombinedChart$DrawOrder CANDLE>
		SCATTER = new CombinedChart$DrawOrder("SCATTER", 4);
	//   24   52:new             #2   <Class CombinedChart$DrawOrder>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "SCATTER">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void CombinedChart$DrawOrder(String, int)>
	//   29   62:putstatic       #37  <Field CombinedChart$DrawOrder SCATTER>
		$VALUES = (new CombinedChart$DrawOrder[] {
			BAR, BUBBLE, LINE, CANDLE, SCATTER
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       CombinedChart$DrawOrder[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field CombinedChart$DrawOrder BAR>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field CombinedChart$DrawOrder BUBBLE>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field CombinedChart$DrawOrder LINE>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field CombinedChart$DrawOrder CANDLE>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field CombinedChart$DrawOrder SCATTER>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field CombinedChart$DrawOrder[] $VALUES>
	//*  53  102:return          
	}

	private CombinedChart$DrawOrder(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
