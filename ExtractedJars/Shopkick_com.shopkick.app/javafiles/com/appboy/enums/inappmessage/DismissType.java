// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.enums.inappmessage;


public final class DismissType extends Enum
{

	private DismissType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #30  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static DismissType valueOf(String s)
	{
		return (DismissType)Enum.valueOf(com/appboy/enums/inappmessage/DismissType, s);
	//    0    0:ldc1            #2   <Class DismissType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #36  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class DismissType>
	//    4    9:areturn         
	}

	public static DismissType[] values()
	{
		return (DismissType[])((DismissType []) (a)).clone();
	//    0    0:getstatic       #28  <Field DismissType[] a>
	//    1    3:invokevirtual   #43  <Method Object _5B_Lcom.appboy.enums.inappmessage.DismissType_3B_.clone()>
	//    2    6:checkcast       #39  <Class DismissType[]>
	//    3    9:areturn         
	}

	public static final DismissType AUTO_DISMISS;
	public static final DismissType MANUAL;
	public static final DismissType SWIPE;
	private static final DismissType a[];

	static 
	{
		AUTO_DISMISS = new DismissType("AUTO_DISMISS", 0);
	//    0    0:new             #2   <Class DismissType>
	//    1    3:dup             
	//    2    4:ldc1            #14  <String "AUTO_DISMISS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #18  <Method void DismissType(String, int)>
	//    5   10:putstatic       #20  <Field DismissType AUTO_DISMISS>
		SWIPE = new DismissType("SWIPE", 1);
	//    6   13:new             #2   <Class DismissType>
	//    7   16:dup             
	//    8   17:ldc1            #21  <String "SWIPE">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #18  <Method void DismissType(String, int)>
	//   11   23:putstatic       #23  <Field DismissType SWIPE>
		MANUAL = new DismissType("MANUAL", 2);
	//   12   26:new             #2   <Class DismissType>
	//   13   29:dup             
	//   14   30:ldc1            #24  <String "MANUAL">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #18  <Method void DismissType(String, int)>
	//   17   36:putstatic       #26  <Field DismissType MANUAL>
		a = (new DismissType[] {
			AUTO_DISMISS, SWIPE, MANUAL
		});
	//   18   39:iconst_3        
	//   19   40:anewarray       DismissType[]
	//   20   43:dup             
	//   21   44:iconst_0        
	//   22   45:getstatic       #20  <Field DismissType AUTO_DISMISS>
	//   23   48:aastore         
	//   24   49:dup             
	//   25   50:iconst_1        
	//   26   51:getstatic       #23  <Field DismissType SWIPE>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:getstatic       #26  <Field DismissType MANUAL>
	//   31   60:aastore         
	//   32   61:putstatic       #28  <Field DismissType[] a>
	//*  33   64:return          
	}
}
