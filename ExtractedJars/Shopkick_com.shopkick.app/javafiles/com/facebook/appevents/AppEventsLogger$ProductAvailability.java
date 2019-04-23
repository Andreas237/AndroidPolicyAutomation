// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

public static final class AppEventsLogger$ProductAvailability extends Enum
{

	public static AppEventsLogger$ProductAvailability valueOf(String s)
	{
		return (AppEventsLogger$ProductAvailability)Enum.valueOf(com/facebook/appevents/AppEventsLogger$ProductAvailability, s);
	//    0    0:ldc1            #2   <Class AppEventsLogger$ProductAvailability>
	//    1    2:aload_0         
	//    2    3:invokestatic    #47  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppEventsLogger$ProductAvailability>
	//    4    9:areturn         
	}

	public static AppEventsLogger$ProductAvailability[] values()
	{
		return (AppEventsLogger$ProductAvailability[])((AppEventsLogger$ProductAvailability []) ($VALUES)).clone();
	//    0    0:getstatic       #39  <Field AppEventsLogger$ProductAvailability[] $VALUES>
	//    1    3:invokevirtual   #54  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$ProductAvailability_3B_.clone()>
	//    2    6:checkcast       #50  <Class AppEventsLogger$ProductAvailability[]>
	//    3    9:areturn         
	}

	private static final AppEventsLogger$ProductAvailability $VALUES[];
	public static final AppEventsLogger$ProductAvailability AVALIABLE_FOR_ORDER;
	public static final AppEventsLogger$ProductAvailability DISCONTINUED;
	public static final AppEventsLogger$ProductAvailability IN_STOCK;
	public static final AppEventsLogger$ProductAvailability OUT_OF_STOCK;
	public static final AppEventsLogger$ProductAvailability PREORDER;

	static 
	{
		IN_STOCK = new AppEventsLogger$ProductAvailability("IN_STOCK", 0);
	//    0    0:new             #2   <Class AppEventsLogger$ProductAvailability>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "IN_STOCK">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
	//    5   10:putstatic       #25  <Field AppEventsLogger$ProductAvailability IN_STOCK>
		OUT_OF_STOCK = new AppEventsLogger$ProductAvailability("OUT_OF_STOCK", 1);
	//    6   13:new             #2   <Class AppEventsLogger$ProductAvailability>
	//    7   16:dup             
	//    8   17:ldc1            #26  <String "OUT_OF_STOCK">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
	//   11   23:putstatic       #28  <Field AppEventsLogger$ProductAvailability OUT_OF_STOCK>
		PREORDER = new AppEventsLogger$ProductAvailability("PREORDER", 2);
	//   12   26:new             #2   <Class AppEventsLogger$ProductAvailability>
	//   13   29:dup             
	//   14   30:ldc1            #29  <String "PREORDER">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
	//   17   36:putstatic       #31  <Field AppEventsLogger$ProductAvailability PREORDER>
		AVALIABLE_FOR_ORDER = new AppEventsLogger$ProductAvailability("AVALIABLE_FOR_ORDER", 3);
	//   18   39:new             #2   <Class AppEventsLogger$ProductAvailability>
	//   19   42:dup             
	//   20   43:ldc1            #32  <String "AVALIABLE_FOR_ORDER">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
	//   23   49:putstatic       #34  <Field AppEventsLogger$ProductAvailability AVALIABLE_FOR_ORDER>
		DISCONTINUED = new AppEventsLogger$ProductAvailability("DISCONTINUED", 4);
	//   24   52:new             #2   <Class AppEventsLogger$ProductAvailability>
	//   25   55:dup             
	//   26   56:ldc1            #35  <String "DISCONTINUED">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #23  <Method void AppEventsLogger$ProductAvailability(String, int)>
	//   29   62:putstatic       #37  <Field AppEventsLogger$ProductAvailability DISCONTINUED>
		$VALUES = (new AppEventsLogger$ProductAvailability[] {
			IN_STOCK, OUT_OF_STOCK, PREORDER, AVALIABLE_FOR_ORDER, DISCONTINUED
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       AppEventsLogger$ProductAvailability[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #25  <Field AppEventsLogger$ProductAvailability IN_STOCK>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #28  <Field AppEventsLogger$ProductAvailability OUT_OF_STOCK>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #31  <Field AppEventsLogger$ProductAvailability PREORDER>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #34  <Field AppEventsLogger$ProductAvailability AVALIABLE_FOR_ORDER>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #37  <Field AppEventsLogger$ProductAvailability DISCONTINUED>
	//   51   98:aastore         
	//   52   99:putstatic       #39  <Field AppEventsLogger$ProductAvailability[] $VALUES>
	//*  53  102:return          
	}

	private AppEventsLogger$ProductAvailability(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #41  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
