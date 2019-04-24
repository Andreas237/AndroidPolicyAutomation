// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class MaintenanceDataState extends Enum
{

	private MaintenanceDataState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #38  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static MaintenanceDataState valueOf(String s)
	{
		return (MaintenanceDataState)Enum.valueOf(com/irobot/core/MaintenanceDataState, s);
	//    0    0:ldc1            #2   <Class MaintenanceDataState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #44  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class MaintenanceDataState>
	//    4    9:areturn         
	}

	public static MaintenanceDataState[] values()
	{
		return (MaintenanceDataState[])((MaintenanceDataState []) ($VALUES)).clone();
	//    0    0:getstatic       #36  <Field MaintenanceDataState[] $VALUES>
	//    1    3:invokevirtual   #51  <Method Object _5B_Lcom.irobot.core.MaintenanceDataState_3B_.clone()>
	//    2    6:checkcast       #47  <Class MaintenanceDataState[]>
	//    3    9:areturn         
	}

	private static final MaintenanceDataState $VALUES[];
	public static final MaintenanceDataState BuyPartsWebAddress;
	public static final MaintenanceDataState CategoryHelpGuideAddress;
	public static final MaintenanceDataState CategoryIdToFocus;
	public static final MaintenanceDataState MaintenanceCategories;
	public static final MaintenanceDataState MaintenanceParts;

	static 
	{
		BuyPartsWebAddress = new MaintenanceDataState("BuyPartsWebAddress", 0);
	//    0    0:new             #2   <Class MaintenanceDataState>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "BuyPartsWebAddress">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #20  <Method void MaintenanceDataState(String, int)>
	//    5   10:putstatic       #22  <Field MaintenanceDataState BuyPartsWebAddress>
		CategoryHelpGuideAddress = new MaintenanceDataState("CategoryHelpGuideAddress", 1);
	//    6   13:new             #2   <Class MaintenanceDataState>
	//    7   16:dup             
	//    8   17:ldc1            #23  <String "CategoryHelpGuideAddress">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #20  <Method void MaintenanceDataState(String, int)>
	//   11   23:putstatic       #25  <Field MaintenanceDataState CategoryHelpGuideAddress>
		MaintenanceCategories = new MaintenanceDataState("MaintenanceCategories", 2);
	//   12   26:new             #2   <Class MaintenanceDataState>
	//   13   29:dup             
	//   14   30:ldc1            #26  <String "MaintenanceCategories">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #20  <Method void MaintenanceDataState(String, int)>
	//   17   36:putstatic       #28  <Field MaintenanceDataState MaintenanceCategories>
		MaintenanceParts = new MaintenanceDataState("MaintenanceParts", 3);
	//   18   39:new             #2   <Class MaintenanceDataState>
	//   19   42:dup             
	//   20   43:ldc1            #29  <String "MaintenanceParts">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #20  <Method void MaintenanceDataState(String, int)>
	//   23   49:putstatic       #31  <Field MaintenanceDataState MaintenanceParts>
		CategoryIdToFocus = new MaintenanceDataState("CategoryIdToFocus", 4);
	//   24   52:new             #2   <Class MaintenanceDataState>
	//   25   55:dup             
	//   26   56:ldc1            #32  <String "CategoryIdToFocus">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #20  <Method void MaintenanceDataState(String, int)>
	//   29   62:putstatic       #34  <Field MaintenanceDataState CategoryIdToFocus>
		$VALUES = (new MaintenanceDataState[] {
			BuyPartsWebAddress, CategoryHelpGuideAddress, MaintenanceCategories, MaintenanceParts, CategoryIdToFocus
		});
	//   30   65:iconst_5        
	//   31   66:anewarray       MaintenanceDataState[]
	//   32   69:dup             
	//   33   70:iconst_0        
	//   34   71:getstatic       #22  <Field MaintenanceDataState BuyPartsWebAddress>
	//   35   74:aastore         
	//   36   75:dup             
	//   37   76:iconst_1        
	//   38   77:getstatic       #25  <Field MaintenanceDataState CategoryHelpGuideAddress>
	//   39   80:aastore         
	//   40   81:dup             
	//   41   82:iconst_2        
	//   42   83:getstatic       #28  <Field MaintenanceDataState MaintenanceCategories>
	//   43   86:aastore         
	//   44   87:dup             
	//   45   88:iconst_3        
	//   46   89:getstatic       #31  <Field MaintenanceDataState MaintenanceParts>
	//   47   92:aastore         
	//   48   93:dup             
	//   49   94:iconst_4        
	//   50   95:getstatic       #34  <Field MaintenanceDataState CategoryIdToFocus>
	//   51   98:aastore         
	//   52   99:putstatic       #36  <Field MaintenanceDataState[] $VALUES>
	//*  53  102:return          
	}
}
