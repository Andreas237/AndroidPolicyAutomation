// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.view;


// Referenced classes of package com.irobot.home.view:
//			BatteryGaugeView

public static final class BatteryGaugeView$a extends Enum
{

	public static BatteryGaugeView$a valueOf(String s)
	{
		return (BatteryGaugeView$a)Enum.valueOf(com/irobot/home/view/BatteryGaugeView$a, s);
	//    0    0:ldc1            #2   <Class BatteryGaugeView$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class BatteryGaugeView$a>
	//    4    9:areturn         
	}

	public static BatteryGaugeView$a[] values()
	{
		return (BatteryGaugeView$a[])((BatteryGaugeView$a []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field BatteryGaugeView$a[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.irobot.home.view.BatteryGaugeView$a_3B_.clone()>
	//    2    6:checkcast       #38  <Class BatteryGaugeView$a[]>
	//    3    9:areturn         
	}

	private static final BatteryGaugeView$a $VALUES[];
	public static final BatteryGaugeView$a COLORFUL;
	public static final BatteryGaugeView$a SIMPLE;

	static 
	{
		COLORFUL = new BatteryGaugeView$a("COLORFUL", 0);
	//    0    0:new             #2   <Class BatteryGaugeView$a>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "COLORFUL">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void BatteryGaugeView$a(String, int)>
	//    5   10:putstatic       #22  <Field BatteryGaugeView$a COLORFUL>
		SIMPLE = new BatteryGaugeView$a("SIMPLE", 1);
	//    6   13:new             #2   <Class BatteryGaugeView$a>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "SIMPLE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void BatteryGaugeView$a(String, int)>
	//   11   23:putstatic       #25  <Field BatteryGaugeView$a SIMPLE>
		$VALUES = (new BatteryGaugeView$a[] {
			COLORFUL, SIMPLE
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       BatteryGaugeView$a[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field BatteryGaugeView$a COLORFUL>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field BatteryGaugeView$a SIMPLE>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field BatteryGaugeView$a[] $VALUES>
	//*  23   45:return          
	}

	private BatteryGaugeView$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
