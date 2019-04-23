// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents;


// Referenced classes of package com.facebook.appevents:
//			AppEventsLogger

public static final class AppEventsLogger$ProductCondition extends Enum
{

	public static AppEventsLogger$ProductCondition valueOf(String s)
	{
		return (AppEventsLogger$ProductCondition)Enum.valueOf(com/facebook/appevents/AppEventsLogger$ProductCondition, s);
	//    0    0:ldc1            #2   <Class AppEventsLogger$ProductCondition>
	//    1    2:aload_0         
	//    2    3:invokestatic    #39  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AppEventsLogger$ProductCondition>
	//    4    9:areturn         
	}

	public static AppEventsLogger$ProductCondition[] values()
	{
		return (AppEventsLogger$ProductCondition[])((AppEventsLogger$ProductCondition []) ($VALUES)).clone();
	//    0    0:getstatic       #31  <Field AppEventsLogger$ProductCondition[] $VALUES>
	//    1    3:invokevirtual   #46  <Method Object _5B_Lcom.facebook.appevents.AppEventsLogger$ProductCondition_3B_.clone()>
	//    2    6:checkcast       #42  <Class AppEventsLogger$ProductCondition[]>
	//    3    9:areturn         
	}

	private static final AppEventsLogger$ProductCondition $VALUES[];
	public static final AppEventsLogger$ProductCondition NEW;
	public static final AppEventsLogger$ProductCondition REFURBISHED;
	public static final AppEventsLogger$ProductCondition USED;

	static 
	{
		NEW = new AppEventsLogger$ProductCondition("NEW", 0);
	//    0    0:new             #2   <Class AppEventsLogger$ProductCondition>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "NEW">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void AppEventsLogger$ProductCondition(String, int)>
	//    5   10:putstatic       #23  <Field AppEventsLogger$ProductCondition NEW>
		REFURBISHED = new AppEventsLogger$ProductCondition("REFURBISHED", 1);
	//    6   13:new             #2   <Class AppEventsLogger$ProductCondition>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "REFURBISHED">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void AppEventsLogger$ProductCondition(String, int)>
	//   11   23:putstatic       #26  <Field AppEventsLogger$ProductCondition REFURBISHED>
		USED = new AppEventsLogger$ProductCondition("USED", 2);
	//   12   26:new             #2   <Class AppEventsLogger$ProductCondition>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "USED">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void AppEventsLogger$ProductCondition(String, int)>
	//   17   36:putstatic       #29  <Field AppEventsLogger$ProductCondition USED>
		$VALUES = (new AppEventsLogger$ProductCondition[] {
			NEW, REFURBISHED, USED
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       AppEventsLogger$ProductCondition[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #23  <Field AppEventsLogger$ProductCondition NEW>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #26  <Field AppEventsLogger$ProductCondition REFURBISHED>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #29  <Field AppEventsLogger$ProductCondition USED>
	//   31   60:aastore         
	//   32   61:putstatic       #31  <Field AppEventsLogger$ProductCondition[] $VALUES>
	//*  33   64:return          
	}

	private AppEventsLogger$ProductCondition(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #33  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
