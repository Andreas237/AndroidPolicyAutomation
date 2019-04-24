// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class PMIProvisioningError extends Enum
{

	private PMIProvisioningError(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #54  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static PMIProvisioningError valueOf(String s)
	{
		return (PMIProvisioningError)Enum.valueOf(com/irobot/core/PMIProvisioningError, s);
	//    0    0:ldc1            #2   <Class PMIProvisioningError>
	//    1    2:aload_0         
	//    2    3:invokestatic    #60  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PMIProvisioningError>
	//    4    9:areturn         
	}

	public static PMIProvisioningError[] values()
	{
		return (PMIProvisioningError[])((PMIProvisioningError []) ($VALUES)).clone();
	//    0    0:getstatic       #52  <Field PMIProvisioningError[] $VALUES>
	//    1    3:invokevirtual   #67  <Method Object _5B_Lcom.irobot.core.PMIProvisioningError_3B_.clone()>
	//    2    6:checkcast       #63  <Class PMIProvisioningError[]>
	//    3    9:areturn         
	}

	private static final PMIProvisioningError $VALUES[];
	public static final PMIProvisioningError CannotFindAssetOnNetwork;
	public static final PMIProvisioningError DefaultError;
	public static final PMIProvisioningError DhcpError;
	public static final PMIProvisioningError InvalidCredentials;
	public static final PMIProvisioningError LinkError;
	public static final PMIProvisioningError NetworkError;
	public static final PMIProvisioningError OverallProvisioningTimeoutError;
	public static final PMIProvisioningError PasswordRequestError;
	public static final PMIProvisioningError RobotConnectionError;

	static 
	{
		InvalidCredentials = new PMIProvisioningError("InvalidCredentials", 0);
	//    0    0:new             #2   <Class PMIProvisioningError>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "InvalidCredentials">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//    5   10:putstatic       #26  <Field PMIProvisioningError InvalidCredentials>
		DhcpError = new PMIProvisioningError("DhcpError", 1);
	//    6   13:new             #2   <Class PMIProvisioningError>
	//    7   16:dup             
	//    8   17:ldc1            #27  <String "DhcpError">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//   11   23:putstatic       #29  <Field PMIProvisioningError DhcpError>
		CannotFindAssetOnNetwork = new PMIProvisioningError("CannotFindAssetOnNetwork", 2);
	//   12   26:new             #2   <Class PMIProvisioningError>
	//   13   29:dup             
	//   14   30:ldc1            #30  <String "CannotFindAssetOnNetwork">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//   17   36:putstatic       #32  <Field PMIProvisioningError CannotFindAssetOnNetwork>
		OverallProvisioningTimeoutError = new PMIProvisioningError("OverallProvisioningTimeoutError", 3);
	//   18   39:new             #2   <Class PMIProvisioningError>
	//   19   42:dup             
	//   20   43:ldc1            #33  <String "OverallProvisioningTimeoutError">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//   23   49:putstatic       #35  <Field PMIProvisioningError OverallProvisioningTimeoutError>
		PasswordRequestError = new PMIProvisioningError("PasswordRequestError", 4);
	//   24   52:new             #2   <Class PMIProvisioningError>
	//   25   55:dup             
	//   26   56:ldc1            #36  <String "PasswordRequestError">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//   29   62:putstatic       #38  <Field PMIProvisioningError PasswordRequestError>
		RobotConnectionError = new PMIProvisioningError("RobotConnectionError", 5);
	//   30   65:new             #2   <Class PMIProvisioningError>
	//   31   68:dup             
	//   32   69:ldc1            #39  <String "RobotConnectionError">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//   35   75:putstatic       #41  <Field PMIProvisioningError RobotConnectionError>
		NetworkError = new PMIProvisioningError("NetworkError", 6);
	//   36   78:new             #2   <Class PMIProvisioningError>
	//   37   81:dup             
	//   38   82:ldc1            #42  <String "NetworkError">
	//   39   84:bipush          6
	//   40   86:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//   41   89:putstatic       #44  <Field PMIProvisioningError NetworkError>
		LinkError = new PMIProvisioningError("LinkError", 7);
	//   42   92:new             #2   <Class PMIProvisioningError>
	//   43   95:dup             
	//   44   96:ldc1            #45  <String "LinkError">
	//   45   98:bipush          7
	//   46  100:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//   47  103:putstatic       #47  <Field PMIProvisioningError LinkError>
		DefaultError = new PMIProvisioningError("DefaultError", 8);
	//   48  106:new             #2   <Class PMIProvisioningError>
	//   49  109:dup             
	//   50  110:ldc1            #48  <String "DefaultError">
	//   51  112:bipush          8
	//   52  114:invokespecial   #24  <Method void PMIProvisioningError(String, int)>
	//   53  117:putstatic       #50  <Field PMIProvisioningError DefaultError>
		$VALUES = (new PMIProvisioningError[] {
			InvalidCredentials, DhcpError, CannotFindAssetOnNetwork, OverallProvisioningTimeoutError, PasswordRequestError, RobotConnectionError, NetworkError, LinkError, DefaultError
		});
	//   54  120:bipush          9
	//   55  122:anewarray       PMIProvisioningError[]
	//   56  125:dup             
	//   57  126:iconst_0        
	//   58  127:getstatic       #26  <Field PMIProvisioningError InvalidCredentials>
	//   59  130:aastore         
	//   60  131:dup             
	//   61  132:iconst_1        
	//   62  133:getstatic       #29  <Field PMIProvisioningError DhcpError>
	//   63  136:aastore         
	//   64  137:dup             
	//   65  138:iconst_2        
	//   66  139:getstatic       #32  <Field PMIProvisioningError CannotFindAssetOnNetwork>
	//   67  142:aastore         
	//   68  143:dup             
	//   69  144:iconst_3        
	//   70  145:getstatic       #35  <Field PMIProvisioningError OverallProvisioningTimeoutError>
	//   71  148:aastore         
	//   72  149:dup             
	//   73  150:iconst_4        
	//   74  151:getstatic       #38  <Field PMIProvisioningError PasswordRequestError>
	//   75  154:aastore         
	//   76  155:dup             
	//   77  156:iconst_5        
	//   78  157:getstatic       #41  <Field PMIProvisioningError RobotConnectionError>
	//   79  160:aastore         
	//   80  161:dup             
	//   81  162:bipush          6
	//   82  164:getstatic       #44  <Field PMIProvisioningError NetworkError>
	//   83  167:aastore         
	//   84  168:dup             
	//   85  169:bipush          7
	//   86  171:getstatic       #47  <Field PMIProvisioningError LinkError>
	//   87  174:aastore         
	//   88  175:dup             
	//   89  176:bipush          8
	//   90  178:getstatic       #50  <Field PMIProvisioningError DefaultError>
	//   91  181:aastore         
	//   92  182:putstatic       #52  <Field PMIProvisioningError[] $VALUES>
	//*  93  185:return          
	}
}
