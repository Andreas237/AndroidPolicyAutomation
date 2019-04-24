// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class OnDemandOTAEntryType extends Enum
{

	private OnDemandOTAEntryType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #26  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static OnDemandOTAEntryType valueOf(String s)
	{
		return (OnDemandOTAEntryType)Enum.valueOf(com/irobot/core/OnDemandOTAEntryType, s);
	//    0    0:ldc1            #2   <Class OnDemandOTAEntryType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #32  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class OnDemandOTAEntryType>
	//    4    9:areturn         
	}

	public static OnDemandOTAEntryType[] values()
	{
		return (OnDemandOTAEntryType[])((OnDemandOTAEntryType []) ($VALUES)).clone();
	//    0    0:getstatic       #24  <Field OnDemandOTAEntryType[] $VALUES>
	//    1    3:invokevirtual   #39  <Method Object _5B_Lcom.irobot.core.OnDemandOTAEntryType_3B_.clone()>
	//    2    6:checkcast       #35  <Class OnDemandOTAEntryType[]>
	//    3    9:areturn         
	}

	private static final OnDemandOTAEntryType $VALUES[];
	public static final OnDemandOTAEntryType RequestOnDemandOTA;
	public static final OnDemandOTAEntryType ViewOnDemandOTA;

	static 
	{
		RequestOnDemandOTA = new OnDemandOTAEntryType("RequestOnDemandOTA", 0);
	//    0    0:new             #2   <Class OnDemandOTAEntryType>
	//    1    3:dup             
	//    2    4:ldc1            #13  <String "RequestOnDemandOTA">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #17  <Method void OnDemandOTAEntryType(String, int)>
	//    5   10:putstatic       #19  <Field OnDemandOTAEntryType RequestOnDemandOTA>
		ViewOnDemandOTA = new OnDemandOTAEntryType("ViewOnDemandOTA", 1);
	//    6   13:new             #2   <Class OnDemandOTAEntryType>
	//    7   16:dup             
	//    8   17:ldc1            #20  <String "ViewOnDemandOTA">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #17  <Method void OnDemandOTAEntryType(String, int)>
	//   11   23:putstatic       #22  <Field OnDemandOTAEntryType ViewOnDemandOTA>
		$VALUES = (new OnDemandOTAEntryType[] {
			RequestOnDemandOTA, ViewOnDemandOTA
		});
	//   12   26:iconst_2        
	//   13   27:anewarray       OnDemandOTAEntryType[]
	//   14   30:dup             
	//   15   31:iconst_0        
	//   16   32:getstatic       #19  <Field OnDemandOTAEntryType RequestOnDemandOTA>
	//   17   35:aastore         
	//   18   36:dup             
	//   19   37:iconst_1        
	//   20   38:getstatic       #22  <Field OnDemandOTAEntryType ViewOnDemandOTA>
	//   21   41:aastore         
	//   22   42:putstatic       #24  <Field OnDemandOTAEntryType[] $VALUES>
	//*  23   45:return          
	}
}
