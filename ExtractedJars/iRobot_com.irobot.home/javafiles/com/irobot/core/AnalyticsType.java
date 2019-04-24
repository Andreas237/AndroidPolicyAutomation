// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AnalyticsType extends Enum
{

	private AnalyticsType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #22  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AnalyticsType valueOf(String s)
	{
		return (AnalyticsType)Enum.valueOf(com/irobot/core/AnalyticsType, s);
	//    0    0:ldc1            #2   <Class AnalyticsType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #28  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AnalyticsType>
	//    4    9:areturn         
	}

	public static AnalyticsType[] values()
	{
		return (AnalyticsType[])((AnalyticsType []) ($VALUES)).clone();
	//    0    0:getstatic       #20  <Field AnalyticsType[] $VALUES>
	//    1    3:invokevirtual   #35  <Method Object _5B_Lcom.irobot.core.AnalyticsType_3B_.clone()>
	//    2    6:checkcast       #31  <Class AnalyticsType[]>
	//    3    9:areturn         
	}

	private static final AnalyticsType $VALUES[];
	public static final AnalyticsType Mixpanel;

	static 
	{
		Mixpanel = new AnalyticsType("Mixpanel", 0);
	//    0    0:new             #2   <Class AnalyticsType>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "Mixpanel">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #16  <Method void AnalyticsType(String, int)>
	//    5   10:putstatic       #18  <Field AnalyticsType Mixpanel>
		$VALUES = (new AnalyticsType[] {
			Mixpanel
		});
	//    6   13:iconst_1        
	//    7   14:anewarray       AnalyticsType[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:getstatic       #18  <Field AnalyticsType Mixpanel>
	//   11   22:aastore         
	//   12   23:putstatic       #20  <Field AnalyticsType[] $VALUES>
	//*  13   26:return          
	}
}
