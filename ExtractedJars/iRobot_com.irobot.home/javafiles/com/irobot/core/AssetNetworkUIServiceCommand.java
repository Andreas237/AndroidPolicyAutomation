// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class AssetNetworkUIServiceCommand extends Enum
{

	private AssetNetworkUIServiceCommand(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #22  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AssetNetworkUIServiceCommand valueOf(String s)
	{
		return (AssetNetworkUIServiceCommand)Enum.valueOf(com/irobot/core/AssetNetworkUIServiceCommand, s);
	//    0    0:ldc1            #2   <Class AssetNetworkUIServiceCommand>
	//    1    2:aload_0         
	//    2    3:invokestatic    #28  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AssetNetworkUIServiceCommand>
	//    4    9:areturn         
	}

	public static AssetNetworkUIServiceCommand[] values()
	{
		return (AssetNetworkUIServiceCommand[])((AssetNetworkUIServiceCommand []) ($VALUES)).clone();
	//    0    0:getstatic       #20  <Field AssetNetworkUIServiceCommand[] $VALUES>
	//    1    3:invokevirtual   #35  <Method Object _5B_Lcom.irobot.core.AssetNetworkUIServiceCommand_3B_.clone()>
	//    2    6:checkcast       #31  <Class AssetNetworkUIServiceCommand[]>
	//    3    9:areturn         
	}

	private static final AssetNetworkUIServiceCommand $VALUES[];
	public static final AssetNetworkUIServiceCommand FetchWiFiLogs;

	static 
	{
		FetchWiFiLogs = new AssetNetworkUIServiceCommand("FetchWiFiLogs", 0);
	//    0    0:new             #2   <Class AssetNetworkUIServiceCommand>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "FetchWiFiLogs">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #16  <Method void AssetNetworkUIServiceCommand(String, int)>
	//    5   10:putstatic       #18  <Field AssetNetworkUIServiceCommand FetchWiFiLogs>
		$VALUES = (new AssetNetworkUIServiceCommand[] {
			FetchWiFiLogs
		});
	//    6   13:iconst_1        
	//    7   14:anewarray       AssetNetworkUIServiceCommand[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:getstatic       #18  <Field AssetNetworkUIServiceCommand FetchWiFiLogs>
	//   11   22:aastore         
	//   12   23:putstatic       #20  <Field AssetNetworkUIServiceCommand[] $VALUES>
	//*  13   26:return          
	}
}
