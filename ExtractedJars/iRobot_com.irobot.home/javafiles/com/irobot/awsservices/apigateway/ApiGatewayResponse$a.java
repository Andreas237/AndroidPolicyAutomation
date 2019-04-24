// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.awsservices.apigateway;


// Referenced classes of package com.irobot.awsservices.apigateway:
//			ApiGatewayResponse

public static final class ApiGatewayResponse$a extends Enum
{

	public static ApiGatewayResponse$a valueOf(String s)
	{
		return (ApiGatewayResponse$a)Enum.valueOf(com/irobot/awsservices/apigateway/ApiGatewayResponse$a, s);
	//    0    0:ldc1            #2   <Class ApiGatewayResponse$a>
	//    1    2:aload_0         
	//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class ApiGatewayResponse$a>
	//    4    9:areturn         
	}

	public static ApiGatewayResponse$a[] values()
	{
		return (ApiGatewayResponse$a[])((ApiGatewayResponse$a []) ($VALUES)).clone();
	//    0    0:getstatic       #59  <Field ApiGatewayResponse$a[] $VALUES>
	//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.irobot.awsservices.apigateway.ApiGatewayResponse$a_3B_.clone()>
	//    2    6:checkcast       #70  <Class ApiGatewayResponse$a[]>
	//    3    9:areturn         
	}

	private static final ApiGatewayResponse$a $VALUES[];
	public static final ApiGatewayResponse$a AssociationMissing;
	public static final ApiGatewayResponse$a AuthenticationFailure;
	public static final ApiGatewayResponse$a InvalidCognitoUser;
	public static final ApiGatewayResponse$a InvalidEvent;
	public static final ApiGatewayResponse$a InvalidPasswordError;
	public static final ApiGatewayResponse$a MapNotFound;
	public static final ApiGatewayResponse$a NoEventProvided;
	public static final ApiGatewayResponse$a None;
	public static final ApiGatewayResponse$a RobotNotFound;
	public static final ApiGatewayResponse$a RuntimeError;

	static 
	{
		None = new ApiGatewayResponse$a("None", 0);
	//    0    0:new             #2   <Class ApiGatewayResponse$a>
	//    1    3:dup             
	//    2    4:ldc1            #24  <String "None">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//    5   10:putstatic       #30  <Field ApiGatewayResponse$a None>
		AssociationMissing = new ApiGatewayResponse$a("AssociationMissing", 1);
	//    6   13:new             #2   <Class ApiGatewayResponse$a>
	//    7   16:dup             
	//    8   17:ldc1            #31  <String "AssociationMissing">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   11   23:putstatic       #33  <Field ApiGatewayResponse$a AssociationMissing>
		AuthenticationFailure = new ApiGatewayResponse$a("AuthenticationFailure", 2);
	//   12   26:new             #2   <Class ApiGatewayResponse$a>
	//   13   29:dup             
	//   14   30:ldc1            #34  <String "AuthenticationFailure">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   17   36:putstatic       #36  <Field ApiGatewayResponse$a AuthenticationFailure>
		InvalidPasswordError = new ApiGatewayResponse$a("InvalidPasswordError", 3);
	//   18   39:new             #2   <Class ApiGatewayResponse$a>
	//   19   42:dup             
	//   20   43:ldc1            #37  <String "InvalidPasswordError">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   23   49:putstatic       #39  <Field ApiGatewayResponse$a InvalidPasswordError>
		InvalidCognitoUser = new ApiGatewayResponse$a("InvalidCognitoUser", 4);
	//   24   52:new             #2   <Class ApiGatewayResponse$a>
	//   25   55:dup             
	//   26   56:ldc1            #40  <String "InvalidCognitoUser">
	//   27   58:iconst_4        
	//   28   59:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   29   62:putstatic       #42  <Field ApiGatewayResponse$a InvalidCognitoUser>
		RobotNotFound = new ApiGatewayResponse$a("RobotNotFound", 5);
	//   30   65:new             #2   <Class ApiGatewayResponse$a>
	//   31   68:dup             
	//   32   69:ldc1            #43  <String "RobotNotFound">
	//   33   71:iconst_5        
	//   34   72:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   35   75:putstatic       #45  <Field ApiGatewayResponse$a RobotNotFound>
		InvalidEvent = new ApiGatewayResponse$a("InvalidEvent", 6);
	//   36   78:new             #2   <Class ApiGatewayResponse$a>
	//   37   81:dup             
	//   38   82:ldc1            #46  <String "InvalidEvent">
	//   39   84:bipush          6
	//   40   86:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   41   89:putstatic       #48  <Field ApiGatewayResponse$a InvalidEvent>
		NoEventProvided = new ApiGatewayResponse$a("NoEventProvided", 7);
	//   42   92:new             #2   <Class ApiGatewayResponse$a>
	//   43   95:dup             
	//   44   96:ldc1            #49  <String "NoEventProvided">
	//   45   98:bipush          7
	//   46  100:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   47  103:putstatic       #51  <Field ApiGatewayResponse$a NoEventProvided>
		MapNotFound = new ApiGatewayResponse$a("MapNotFound", 8);
	//   48  106:new             #2   <Class ApiGatewayResponse$a>
	//   49  109:dup             
	//   50  110:ldc1            #52  <String "MapNotFound">
	//   51  112:bipush          8
	//   52  114:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   53  117:putstatic       #54  <Field ApiGatewayResponse$a MapNotFound>
		RuntimeError = new ApiGatewayResponse$a("RuntimeError", 9);
	//   54  120:new             #2   <Class ApiGatewayResponse$a>
	//   55  123:dup             
	//   56  124:ldc1            #55  <String "RuntimeError">
	//   57  126:bipush          9
	//   58  128:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
	//   59  131:putstatic       #57  <Field ApiGatewayResponse$a RuntimeError>
		$VALUES = (new ApiGatewayResponse$a[] {
			None, AssociationMissing, AuthenticationFailure, InvalidPasswordError, InvalidCognitoUser, RobotNotFound, InvalidEvent, NoEventProvided, MapNotFound, RuntimeError
		});
	//   60  134:bipush          10
	//   61  136:anewarray       ApiGatewayResponse$a[]
	//   62  139:dup             
	//   63  140:iconst_0        
	//   64  141:getstatic       #30  <Field ApiGatewayResponse$a None>
	//   65  144:aastore         
	//   66  145:dup             
	//   67  146:iconst_1        
	//   68  147:getstatic       #33  <Field ApiGatewayResponse$a AssociationMissing>
	//   69  150:aastore         
	//   70  151:dup             
	//   71  152:iconst_2        
	//   72  153:getstatic       #36  <Field ApiGatewayResponse$a AuthenticationFailure>
	//   73  156:aastore         
	//   74  157:dup             
	//   75  158:iconst_3        
	//   76  159:getstatic       #39  <Field ApiGatewayResponse$a InvalidPasswordError>
	//   77  162:aastore         
	//   78  163:dup             
	//   79  164:iconst_4        
	//   80  165:getstatic       #42  <Field ApiGatewayResponse$a InvalidCognitoUser>
	//   81  168:aastore         
	//   82  169:dup             
	//   83  170:iconst_5        
	//   84  171:getstatic       #45  <Field ApiGatewayResponse$a RobotNotFound>
	//   85  174:aastore         
	//   86  175:dup             
	//   87  176:bipush          6
	//   88  178:getstatic       #48  <Field ApiGatewayResponse$a InvalidEvent>
	//   89  181:aastore         
	//   90  182:dup             
	//   91  183:bipush          7
	//   92  185:getstatic       #51  <Field ApiGatewayResponse$a NoEventProvided>
	//   93  188:aastore         
	//   94  189:dup             
	//   95  190:bipush          8
	//   96  192:getstatic       #54  <Field ApiGatewayResponse$a MapNotFound>
	//   97  195:aastore         
	//   98  196:dup             
	//   99  197:bipush          9
	//  100  199:getstatic       #57  <Field ApiGatewayResponse$a RuntimeError>
	//  101  202:aastore         
	//  102  203:putstatic       #59  <Field ApiGatewayResponse$a[] $VALUES>
	//* 103  206:return          
	}

	private ApiGatewayResponse$a(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #61  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
