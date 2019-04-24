// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class ABTestIdentifier extends Enum
{

	private ABTestIdentifier(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static ABTestIdentifier valueOf(String s)
	{
		return (ABTestIdentifier)Enum.valueOf(com/irobot/core/ABTestIdentifier, s);
	//    0    0:ldc1            #2   <Class ABTestIdentifier>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ABTestIdentifier>
	//    4    9:areturn         
	}

	public static ABTestIdentifier[] values()
	{
		return (ABTestIdentifier[])((ABTestIdentifier []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field ABTestIdentifier[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.irobot.core.ABTestIdentifier_3B_.clone()>
	//    2    6:checkcast       #51  <Class ABTestIdentifier[]>
	//    3    9:areturn         
	}

	private static final ABTestIdentifier $VALUES[];
	public static final ABTestIdentifier AppReview;
	public static final ABTestIdentifier BetaProgram;
	public static final ABTestIdentifier CareOnCleanScreen;
	public static final ABTestIdentifier LocateRoombaButtonPrimaryStyle;
	public static final ABTestIdentifier NotificationCenterAccess;
	public static final ABTestIdentifier RequestAnalytics;

	static 
	{
		AppReview = new ABTestIdentifier("AppReview", 0);
	//    0    0:new             #2   <Class ABTestIdentifier>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "AppReview">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void ABTestIdentifier(String, int)>
	//    5   10:putstatic       #23  <Field ABTestIdentifier AppReview>
		BetaProgram = new ABTestIdentifier("BetaProgram", 1);
	//    6   13:new             #2   <Class ABTestIdentifier>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "BetaProgram">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void ABTestIdentifier(String, int)>
	//   11   23:putstatic       #26  <Field ABTestIdentifier BetaProgram>
		RequestAnalytics = new ABTestIdentifier("RequestAnalytics", 2);
	//   12   26:new             #2   <Class ABTestIdentifier>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "RequestAnalytics">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void ABTestIdentifier(String, int)>
	//   17   36:putstatic       #29  <Field ABTestIdentifier RequestAnalytics>
		LocateRoombaButtonPrimaryStyle = new ABTestIdentifier("LocateRoombaButtonPrimaryStyle", 3);
	//   18   39:new             #2   <Class ABTestIdentifier>
	//   19   42:dup             
	//   20   43:ldc1            #30  <String "LocateRoombaButtonPrimaryStyle">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #21  <Method void ABTestIdentifier(String, int)>
	//   23   49:putstatic       #32  <Field ABTestIdentifier LocateRoombaButtonPrimaryStyle>
		NotificationCenterAccess = new ABTestIdentifier("NotificationCenterAccess", 4);
	//   24   52:new             #2   <Class ABTestIdentifier>
	//   25   55:dup             
	//   26   56:ldc1            #33  <String "NotificationCenterAccess">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #21  <Method void ABTestIdentifier(String, int)>
	//   29   62:putstatic       #35  <Field ABTestIdentifier NotificationCenterAccess>
		CareOnCleanScreen = new ABTestIdentifier("CareOnCleanScreen", 5);
	//   30   65:new             #2   <Class ABTestIdentifier>
	//   31   68:dup             
	//   32   69:ldc1            #36  <String "CareOnCleanScreen">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #21  <Method void ABTestIdentifier(String, int)>
	//   35   75:putstatic       #38  <Field ABTestIdentifier CareOnCleanScreen>
		$VALUES = (new ABTestIdentifier[] {
			AppReview, BetaProgram, RequestAnalytics, LocateRoombaButtonPrimaryStyle, NotificationCenterAccess, CareOnCleanScreen
		});
	//   36   78:bipush          6
	//   37   80:anewarray       ABTestIdentifier[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #23  <Field ABTestIdentifier AppReview>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #26  <Field ABTestIdentifier BetaProgram>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #29  <Field ABTestIdentifier RequestAnalytics>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #32  <Field ABTestIdentifier LocateRoombaButtonPrimaryStyle>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #35  <Field ABTestIdentifier NotificationCenterAccess>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #38  <Field ABTestIdentifier CareOnCleanScreen>
	//   61  118:aastore         
	//   62  119:putstatic       #40  <Field ABTestIdentifier[] $VALUES>
	//*  63  122:return          
	}
}
