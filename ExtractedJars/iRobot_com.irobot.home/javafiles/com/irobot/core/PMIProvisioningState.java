// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class PMIProvisioningState extends Enum
{

	private PMIProvisioningState(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static PMIProvisioningState valueOf(String s)
	{
		return (PMIProvisioningState)Enum.valueOf(com/irobot/core/PMIProvisioningState, s);
	//    0    0:ldc1            #2   <Class PMIProvisioningState>
	//    1    2:aload_0         
	//    2    3:invokestatic    #48  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PMIProvisioningState>
	//    4    9:areturn         
	}

	public static PMIProvisioningState[] values()
	{
		return (PMIProvisioningState[])((PMIProvisioningState []) ($VALUES)).clone();
	//    0    0:getstatic       #40  <Field PMIProvisioningState[] $VALUES>
	//    1    3:invokevirtual   #55  <Method Object _5B_Lcom.irobot.core.PMIProvisioningState_3B_.clone()>
	//    2    6:checkcast       #51  <Class PMIProvisioningState[]>
	//    3    9:areturn         
	}

	private static final PMIProvisioningState $VALUES[];
	public static final PMIProvisioningState ActivatingWifi;
	public static final PMIProvisioningState ConnectedToAsset;
	public static final PMIProvisioningState Finished;
	public static final PMIProvisioningState SendingWifiConfig;
	public static final PMIProvisioningState Started;
	public static final PMIProvisioningState VerifyingConnectionOnHomeNetwork;

	static 
	{
		Started = new PMIProvisioningState("Started", 0);
	//    0    0:new             #2   <Class PMIProvisioningState>
	//    1    3:dup             
	//    2    4:ldc1            #17  <String "Started">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #21  <Method void PMIProvisioningState(String, int)>
	//    5   10:putstatic       #23  <Field PMIProvisioningState Started>
		ConnectedToAsset = new PMIProvisioningState("ConnectedToAsset", 1);
	//    6   13:new             #2   <Class PMIProvisioningState>
	//    7   16:dup             
	//    8   17:ldc1            #24  <String "ConnectedToAsset">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #21  <Method void PMIProvisioningState(String, int)>
	//   11   23:putstatic       #26  <Field PMIProvisioningState ConnectedToAsset>
		SendingWifiConfig = new PMIProvisioningState("SendingWifiConfig", 2);
	//   12   26:new             #2   <Class PMIProvisioningState>
	//   13   29:dup             
	//   14   30:ldc1            #27  <String "SendingWifiConfig">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #21  <Method void PMIProvisioningState(String, int)>
	//   17   36:putstatic       #29  <Field PMIProvisioningState SendingWifiConfig>
		ActivatingWifi = new PMIProvisioningState("ActivatingWifi", 3);
	//   18   39:new             #2   <Class PMIProvisioningState>
	//   19   42:dup             
	//   20   43:ldc1            #30  <String "ActivatingWifi">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #21  <Method void PMIProvisioningState(String, int)>
	//   23   49:putstatic       #32  <Field PMIProvisioningState ActivatingWifi>
		VerifyingConnectionOnHomeNetwork = new PMIProvisioningState("VerifyingConnectionOnHomeNetwork", 4);
	//   24   52:new             #2   <Class PMIProvisioningState>
	//   25   55:dup             
	//   26   56:ldc1            #33  <String "VerifyingConnectionOnHomeNetwork">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #21  <Method void PMIProvisioningState(String, int)>
	//   29   62:putstatic       #35  <Field PMIProvisioningState VerifyingConnectionOnHomeNetwork>
		Finished = new PMIProvisioningState("Finished", 5);
	//   30   65:new             #2   <Class PMIProvisioningState>
	//   31   68:dup             
	//   32   69:ldc1            #36  <String "Finished">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #21  <Method void PMIProvisioningState(String, int)>
	//   35   75:putstatic       #38  <Field PMIProvisioningState Finished>
		$VALUES = (new PMIProvisioningState[] {
			Started, ConnectedToAsset, SendingWifiConfig, ActivatingWifi, VerifyingConnectionOnHomeNetwork, Finished
		});
	//   36   78:bipush          6
	//   37   80:anewarray       PMIProvisioningState[]
	//   38   83:dup             
	//   39   84:iconst_0        
	//   40   85:getstatic       #23  <Field PMIProvisioningState Started>
	//   41   88:aastore         
	//   42   89:dup             
	//   43   90:iconst_1        
	//   44   91:getstatic       #26  <Field PMIProvisioningState ConnectedToAsset>
	//   45   94:aastore         
	//   46   95:dup             
	//   47   96:iconst_2        
	//   48   97:getstatic       #29  <Field PMIProvisioningState SendingWifiConfig>
	//   49  100:aastore         
	//   50  101:dup             
	//   51  102:iconst_3        
	//   52  103:getstatic       #32  <Field PMIProvisioningState ActivatingWifi>
	//   53  106:aastore         
	//   54  107:dup             
	//   55  108:iconst_4        
	//   56  109:getstatic       #35  <Field PMIProvisioningState VerifyingConnectionOnHomeNetwork>
	//   57  112:aastore         
	//   58  113:dup             
	//   59  114:iconst_5        
	//   60  115:getstatic       #38  <Field PMIProvisioningState Finished>
	//   61  118:aastore         
	//   62  119:putstatic       #40  <Field PMIProvisioningState[] $VALUES>
	//*  63  122:return          
	}
}
