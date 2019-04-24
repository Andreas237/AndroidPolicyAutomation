// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class WifiProvisioningStatus extends Enum
{

	private WifiProvisioningStatus(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #46  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static WifiProvisioningStatus valueOf(String s)
	{
		return (WifiProvisioningStatus)Enum.valueOf(com/irobot/core/WifiProvisioningStatus, s);
	//    0    0:ldc1            #2   <Class WifiProvisioningStatus>
	//    1    2:aload_0         
	//    2    3:invokestatic    #52  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class WifiProvisioningStatus>
	//    4    9:areturn         
	}

	public static WifiProvisioningStatus[] values()
	{
		return (WifiProvisioningStatus[])((WifiProvisioningStatus []) ($VALUES)).clone();
	//    0    0:getstatic       #44  <Field WifiProvisioningStatus[] $VALUES>
	//    1    3:invokevirtual   #59  <Method Object _5B_Lcom.irobot.core.WifiProvisioningStatus_3B_.clone()>
	//    2    6:checkcast       #55  <Class WifiProvisioningStatus[]>
	//    3    9:areturn         
	}

	private static final WifiProvisioningStatus $VALUES[];
	public static final WifiProvisioningStatus ActivatingWifi;
	public static final WifiProvisioningStatus CheckingConfiguration;
	public static final WifiProvisioningStatus ConnectedToAsset;
	public static final WifiProvisioningStatus Finished;
	public static final WifiProvisioningStatus SendingWifiConfig;
	public static final WifiProvisioningStatus Started;
	public static final WifiProvisioningStatus VerifyingConnectionOnHomeNetwork;

	static 
	{
		Started = new WifiProvisioningStatus("Started", 0);
	//    0    0:new             #2   <Class WifiProvisioningStatus>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "Started">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void WifiProvisioningStatus(String, int)>
	//    5   10:putstatic       #24  <Field WifiProvisioningStatus Started>
		ConnectedToAsset = new WifiProvisioningStatus("ConnectedToAsset", 1);
	//    6   13:new             #2   <Class WifiProvisioningStatus>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "ConnectedToAsset">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void WifiProvisioningStatus(String, int)>
	//   11   23:putstatic       #27  <Field WifiProvisioningStatus ConnectedToAsset>
		SendingWifiConfig = new WifiProvisioningStatus("SendingWifiConfig", 2);
	//   12   26:new             #2   <Class WifiProvisioningStatus>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "SendingWifiConfig">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void WifiProvisioningStatus(String, int)>
	//   17   36:putstatic       #30  <Field WifiProvisioningStatus SendingWifiConfig>
		CheckingConfiguration = new WifiProvisioningStatus("CheckingConfiguration", 3);
	//   18   39:new             #2   <Class WifiProvisioningStatus>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "CheckingConfiguration">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void WifiProvisioningStatus(String, int)>
	//   23   49:putstatic       #33  <Field WifiProvisioningStatus CheckingConfiguration>
		ActivatingWifi = new WifiProvisioningStatus("ActivatingWifi", 4);
	//   24   52:new             #2   <Class WifiProvisioningStatus>
	//   25   55:dup             
	//   26   56:ldc1            #34  <String "ActivatingWifi">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #22  <Method void WifiProvisioningStatus(String, int)>
	//   29   62:putstatic       #36  <Field WifiProvisioningStatus ActivatingWifi>
		VerifyingConnectionOnHomeNetwork = new WifiProvisioningStatus("VerifyingConnectionOnHomeNetwork", 5);
	//   30   65:new             #2   <Class WifiProvisioningStatus>
	//   31   68:dup             
	//   32   69:ldc1            #37  <String "VerifyingConnectionOnHomeNetwork">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #22  <Method void WifiProvisioningStatus(String, int)>
	//   35   75:putstatic       #39  <Field WifiProvisioningStatus VerifyingConnectionOnHomeNetwork>
		Finished = new WifiProvisioningStatus("Finished", 6);
	//   36   78:new             #2   <Class WifiProvisioningStatus>
	//   37   81:dup             
	//   38   82:ldc1            #40  <String "Finished">
	//   39   84:bipush          6
	//   40   86:invokespecial   #22  <Method void WifiProvisioningStatus(String, int)>
	//   41   89:putstatic       #42  <Field WifiProvisioningStatus Finished>
		$VALUES = (new WifiProvisioningStatus[] {
			Started, ConnectedToAsset, SendingWifiConfig, CheckingConfiguration, ActivatingWifi, VerifyingConnectionOnHomeNetwork, Finished
		});
	//   42   92:bipush          7
	//   43   94:anewarray       WifiProvisioningStatus[]
	//   44   97:dup             
	//   45   98:iconst_0        
	//   46   99:getstatic       #24  <Field WifiProvisioningStatus Started>
	//   47  102:aastore         
	//   48  103:dup             
	//   49  104:iconst_1        
	//   50  105:getstatic       #27  <Field WifiProvisioningStatus ConnectedToAsset>
	//   51  108:aastore         
	//   52  109:dup             
	//   53  110:iconst_2        
	//   54  111:getstatic       #30  <Field WifiProvisioningStatus SendingWifiConfig>
	//   55  114:aastore         
	//   56  115:dup             
	//   57  116:iconst_3        
	//   58  117:getstatic       #33  <Field WifiProvisioningStatus CheckingConfiguration>
	//   59  120:aastore         
	//   60  121:dup             
	//   61  122:iconst_4        
	//   62  123:getstatic       #36  <Field WifiProvisioningStatus ActivatingWifi>
	//   63  126:aastore         
	//   64  127:dup             
	//   65  128:iconst_5        
	//   66  129:getstatic       #39  <Field WifiProvisioningStatus VerifyingConnectionOnHomeNetwork>
	//   67  132:aastore         
	//   68  133:dup             
	//   69  134:bipush          6
	//   70  136:getstatic       #42  <Field WifiProvisioningStatus Finished>
	//   71  139:aastore         
	//   72  140:putstatic       #44  <Field WifiProvisioningStatus[] $VALUES>
	//*  73  143:return          
	}
}
