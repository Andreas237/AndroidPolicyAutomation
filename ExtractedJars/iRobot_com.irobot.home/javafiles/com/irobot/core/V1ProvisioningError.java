// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.core;


public final class V1ProvisioningError extends Enum
{

	private V1ProvisioningError(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #58  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static V1ProvisioningError valueOf(String s)
	{
		return (V1ProvisioningError)Enum.valueOf(com/irobot/core/V1ProvisioningError, s);
	//    0    0:ldc1            #2   <Class V1ProvisioningError>
	//    1    2:aload_0         
	//    2    3:invokestatic    #64  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class V1ProvisioningError>
	//    4    9:areturn         
	}

	public static V1ProvisioningError[] values()
	{
		return (V1ProvisioningError[])((V1ProvisioningError []) ($VALUES)).clone();
	//    0    0:getstatic       #56  <Field V1ProvisioningError[] $VALUES>
	//    1    3:invokevirtual   #71  <Method Object _5B_Lcom.irobot.core.V1ProvisioningError_3B_.clone()>
	//    2    6:checkcast       #67  <Class V1ProvisioningError[]>
	//    3    9:areturn         
	}

	private static final V1ProvisioningError $VALUES[];
	public static final V1ProvisioningError Default;
	public static final V1ProvisioningError Dhcp;
	public static final V1ProvisioningError Link;
	public static final V1ProvisioningError Network;
	public static final V1ProvisioningError NetworkReconnect;
	public static final V1ProvisioningError Password;
	public static final V1ProvisioningError RobotComms;
	public static final V1ProvisioningError RobotConnection;
	public static final V1ProvisioningError RobotDiscovery;
	public static final V1ProvisioningError Ssl;

	static 
	{
		Default = new V1ProvisioningError("Default", 0);
	//    0    0:new             #2   <Class V1ProvisioningError>
	//    1    3:dup             
	//    2    4:ldc1            #21  <String "Default">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//    5   10:putstatic       #27  <Field V1ProvisioningError Default>
		NetworkReconnect = new V1ProvisioningError("NetworkReconnect", 1);
	//    6   13:new             #2   <Class V1ProvisioningError>
	//    7   16:dup             
	//    8   17:ldc1            #28  <String "NetworkReconnect">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   11   23:putstatic       #30  <Field V1ProvisioningError NetworkReconnect>
		RobotConnection = new V1ProvisioningError("RobotConnection", 2);
	//   12   26:new             #2   <Class V1ProvisioningError>
	//   13   29:dup             
	//   14   30:ldc1            #31  <String "RobotConnection">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   17   36:putstatic       #33  <Field V1ProvisioningError RobotConnection>
		RobotDiscovery = new V1ProvisioningError("RobotDiscovery", 3);
	//   18   39:new             #2   <Class V1ProvisioningError>
	//   19   42:dup             
	//   20   43:ldc1            #34  <String "RobotDiscovery">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   23   49:putstatic       #36  <Field V1ProvisioningError RobotDiscovery>
		Ssl = new V1ProvisioningError("Ssl", 4);
	//   24   52:new             #2   <Class V1ProvisioningError>
	//   25   55:dup             
	//   26   56:ldc1            #37  <String "Ssl">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   29   62:putstatic       #39  <Field V1ProvisioningError Ssl>
		RobotComms = new V1ProvisioningError("RobotComms", 5);
	//   30   65:new             #2   <Class V1ProvisioningError>
	//   31   68:dup             
	//   32   69:ldc1            #40  <String "RobotComms">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   35   75:putstatic       #42  <Field V1ProvisioningError RobotComms>
		Password = new V1ProvisioningError("Password", 6);
	//   36   78:new             #2   <Class V1ProvisioningError>
	//   37   81:dup             
	//   38   82:ldc1            #43  <String "Password">
	//   39   84:bipush          6
	//   40   86:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   41   89:putstatic       #45  <Field V1ProvisioningError Password>
		Network = new V1ProvisioningError("Network", 7);
	//   42   92:new             #2   <Class V1ProvisioningError>
	//   43   95:dup             
	//   44   96:ldc1            #46  <String "Network">
	//   45   98:bipush          7
	//   46  100:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   47  103:putstatic       #48  <Field V1ProvisioningError Network>
		Dhcp = new V1ProvisioningError("Dhcp", 8);
	//   48  106:new             #2   <Class V1ProvisioningError>
	//   49  109:dup             
	//   50  110:ldc1            #49  <String "Dhcp">
	//   51  112:bipush          8
	//   52  114:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   53  117:putstatic       #51  <Field V1ProvisioningError Dhcp>
		Link = new V1ProvisioningError("Link", 9);
	//   54  120:new             #2   <Class V1ProvisioningError>
	//   55  123:dup             
	//   56  124:ldc1            #52  <String "Link">
	//   57  126:bipush          9
	//   58  128:invokespecial   #25  <Method void V1ProvisioningError(String, int)>
	//   59  131:putstatic       #54  <Field V1ProvisioningError Link>
		$VALUES = (new V1ProvisioningError[] {
			Default, NetworkReconnect, RobotConnection, RobotDiscovery, Ssl, RobotComms, Password, Network, Dhcp, Link
		});
	//   60  134:bipush          10
	//   61  136:anewarray       V1ProvisioningError[]
	//   62  139:dup             
	//   63  140:iconst_0        
	//   64  141:getstatic       #27  <Field V1ProvisioningError Default>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:getstatic       #30  <Field V1ProvisioningError NetworkReconnect>
	//   69  150:aastore         
	//   70  151:dup             
	//   71  152:iconst_2        
	//   72  153:getstatic       #33  <Field V1ProvisioningError RobotConnection>
	//   73  156:aastore         
	//   74  157:dup             
	//   75  158:iconst_3        
	//   76  159:getstatic       #36  <Field V1ProvisioningError RobotDiscovery>
	//   77  162:aastore         
	//   78  163:dup             
	//   79  164:iconst_4        
	//   80  165:getstatic       #39  <Field V1ProvisioningError Ssl>
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_5        
	//   84  171:getstatic       #42  <Field V1ProvisioningError RobotComms>
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:bipush          6
	//   88  178:getstatic       #45  <Field V1ProvisioningError Password>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:bipush          7
	//   92  185:getstatic       #48  <Field V1ProvisioningError Network>
	//   93  188:aastore         
	//   94  189:dup             
	//   95  190:bipush          8
	//   96  192:getstatic       #51  <Field V1ProvisioningError Dhcp>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          9
	//  100  199:getstatic       #54  <Field V1ProvisioningError Link>
	//  101  202:aastore         
	//  102  203:putstatic       #56  <Field V1ProvisioningError[] $VALUES>
	//* 103  206:return          
	}
}
