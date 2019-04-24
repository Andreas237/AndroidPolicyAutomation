// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.internal;


// Referenced classes of package com.facebook.internal:
//			AppEventsLoggerUtility

public static final class AppEventsLoggerUtility$GraphAPIActivityType extends Enum
{

	public static AppEventsLoggerUtility$GraphAPIActivityType valueOf(String s)
	{
		return (AppEventsLoggerUtility$GraphAPIActivityType)Enum.valueOf(com/facebook/internal/AppEventsLoggerUtility$GraphAPIActivityType, s);
	//    0    0:ldc1            #2   <Class AppEventsLoggerUtility$GraphAPIActivityType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppEventsLoggerUtility$GraphAPIActivityType>
	//    4    9:areturn         
	}

	public static AppEventsLoggerUtility$GraphAPIActivityType[] values()
	{
		return (AppEventsLoggerUtility$GraphAPIActivityType[])((AppEventsLoggerUtility$GraphAPIActivityType []) ($VALUES)).clone();
	//    0    0:getstatic       #27  <Field AppEventsLoggerUtility$GraphAPIActivityType[] $VALUES>
	//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.facebook.internal.AppEventsLoggerUtility$GraphAPIActivityType_3B_.clone()>
	//    2    6:checkcast       #38  <Class AppEventsLoggerUtility$GraphAPIActivityType[]>
	//    3    9:areturn         
	}

	private static final AppEventsLoggerUtility$GraphAPIActivityType $VALUES[];
	public static final AppEventsLoggerUtility$GraphAPIActivityType CUSTOM_APP_EVENTS;
	public static final AppEventsLoggerUtility$GraphAPIActivityType MOBILE_INSTALL_EVENT;

	static 
	{
		MOBILE_INSTALL_EVENT = new AppEventsLoggerUtility$GraphAPIActivityType("MOBILE_INSTALL_EVENT", 0);
	//    0    0:new             #2   <Class AppEventsLoggerUtility$GraphAPIActivityType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "MOBILE_INSTALL_EVENT">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void AppEventsLoggerUtility$GraphAPIActivityType(String, int)>
	//    5   10:putstatic       #22  <Field AppEventsLoggerUtility$GraphAPIActivityType MOBILE_INSTALL_EVENT>
		CUSTOM_APP_EVENTS = new AppEventsLoggerUtility$GraphAPIActivityType("CUSTOM_APP_EVENTS", 1);
	//    6   13:new             #2   <Class AppEventsLoggerUtility$GraphAPIActivityType>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "CUSTOM_APP_EVENTS">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void AppEventsLoggerUtility$GraphAPIActivityType(String, int)>
	//   11   23:putstatic       #25  <Field AppEventsLoggerUtility$GraphAPIActivityType CUSTOM_APP_EVENTS>
		$VALUES = (new AppEventsLoggerUtility$GraphAPIActivityType[] {
			MOBILE_INSTALL_EVENT, CUSTOM_APP_EVENTS
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       AppEventsLoggerUtility$GraphAPIActivityType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #22  <Field AppEventsLoggerUtility$GraphAPIActivityType MOBILE_INSTALL_EVENT>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #25  <Field AppEventsLoggerUtility$GraphAPIActivityType CUSTOM_APP_EVENTS>
	//   21   41:aastore         
	//   22   42:putstatic       #27  <Field AppEventsLoggerUtility$GraphAPIActivityType[] $VALUES>
	//*  23   45:return          
	}

	private AppEventsLoggerUtility$GraphAPIActivityType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #29  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
