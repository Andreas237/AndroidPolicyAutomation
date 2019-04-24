// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.awsservices.apigateway;

import java.util.HashMap;

// Referenced classes of package com.irobot.awsservices.apigateway:
//			ApiGatewayResponse

class ApiGatewayResponse$ResponseError$1 extends HashMap
{

	final ApiGatewayResponse.ResponseError a;

	ApiGatewayResponse$ResponseError$1(ApiGatewayResponse.ResponseError responseerror)
	{
		a = responseerror;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field ApiGatewayResponse$ResponseError a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void HashMap()>
		put("AspenError.AuthenticationFailed", ((Object) (ApiGatewayResponse.a.AuthenticationFailure)));
	//    5    9:aload_0         
	//    6   10:ldc1            #21  <String "AspenError.AuthenticationFailed">
	//    7   12:getstatic       #27  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AuthenticationFailure>
	//    8   15:invokevirtual   #31  <Method Object put(Object, Object)>
	//    9   18:pop             
		put("AspenError.InvalidPasswordError", ((Object) (ApiGatewayResponse.a.InvalidPasswordError)));
	//   10   19:aload_0         
	//   11   20:ldc1            #33  <String "AspenError.InvalidPasswordError">
	//   12   22:getstatic       #36  <Field ApiGatewayResponse$a ApiGatewayResponse$a.InvalidPasswordError>
	//   13   25:invokevirtual   #31  <Method Object put(Object, Object)>
	//   14   28:pop             
		put("AspenError.InvalidCognitoUser", ((Object) (ApiGatewayResponse.a.InvalidCognitoUser)));
	//   15   29:aload_0         
	//   16   30:ldc1            #38  <String "AspenError.InvalidCognitoUser">
	//   17   32:getstatic       #41  <Field ApiGatewayResponse$a ApiGatewayResponse$a.InvalidCognitoUser>
	//   18   35:invokevirtual   #31  <Method Object put(Object, Object)>
	//   19   38:pop             
		put("AspenError.RobotNotFound", ((Object) (ApiGatewayResponse.a.RobotNotFound)));
	//   20   39:aload_0         
	//   21   40:ldc1            #43  <String "AspenError.RobotNotFound">
	//   22   42:getstatic       #46  <Field ApiGatewayResponse$a ApiGatewayResponse$a.RobotNotFound>
	//   23   45:invokevirtual   #31  <Method Object put(Object, Object)>
	//   24   48:pop             
		put("AspenError.InvalidEvent", ((Object) (ApiGatewayResponse.a.InvalidEvent)));
	//   25   49:aload_0         
	//   26   50:ldc1            #48  <String "AspenError.InvalidEvent">
	//   27   52:getstatic       #51  <Field ApiGatewayResponse$a ApiGatewayResponse$a.InvalidEvent>
	//   28   55:invokevirtual   #31  <Method Object put(Object, Object)>
	//   29   58:pop             
		put("AspenError.NoEventProvided", ((Object) (ApiGatewayResponse.a.NoEventProvided)));
	//   30   59:aload_0         
	//   31   60:ldc1            #53  <String "AspenError.NoEventProvided">
	//   32   62:getstatic       #56  <Field ApiGatewayResponse$a ApiGatewayResponse$a.NoEventProvided>
	//   33   65:invokevirtual   #31  <Method Object put(Object, Object)>
	//   34   68:pop             
		put("AspenError.MapNotFound", ((Object) (ApiGatewayResponse.a.NoEventProvided)));
	//   35   69:aload_0         
	//   36   70:ldc1            #58  <String "AspenError.MapNotFound">
	//   37   72:getstatic       #56  <Field ApiGatewayResponse$a ApiGatewayResponse$a.NoEventProvided>
	//   38   75:invokevirtual   #31  <Method Object put(Object, Object)>
	//   39   78:pop             
		put("RuntimeError", ((Object) (ApiGatewayResponse.a.RuntimeError)));
	//   40   79:aload_0         
	//   41   80:ldc1            #60  <String "RuntimeError">
	//   42   82:getstatic       #62  <Field ApiGatewayResponse$a ApiGatewayResponse$a.RuntimeError>
	//   43   85:invokevirtual   #31  <Method Object put(Object, Object)>
	//   44   88:pop             
		put("ErrorTooOld", ((Object) (ApiGatewayResponse.a.AssociationMissing)));
	//   45   89:aload_0         
	//   46   90:ldc1            #64  <String "ErrorTooOld">
	//   47   92:getstatic       #67  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
	//   48   95:invokevirtual   #31  <Method Object put(Object, Object)>
	//   49   98:pop             
		put("ErrorTooNew", ((Object) (ApiGatewayResponse.a.AssociationMissing)));
	//   50   99:aload_0         
	//   51  100:ldc1            #69  <String "ErrorTooNew">
	//   52  102:getstatic       #67  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
	//   53  105:invokevirtual   #31  <Method Object put(Object, Object)>
	//   54  108:pop             
		put("ErrorNoMatch", ((Object) (ApiGatewayResponse.a.AssociationMissing)));
	//   55  109:aload_0         
	//   56  110:ldc1            #71  <String "ErrorNoMatch">
	//   57  112:getstatic       #67  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
	//   58  115:invokevirtual   #31  <Method Object put(Object, Object)>
	//   59  118:pop             
		put("AssetNotFound", ((Object) (ApiGatewayResponse.a.AssociationMissing)));
	//   60  119:aload_0         
	//   61  120:ldc1            #73  <String "AssetNotFound">
	//   62  122:getstatic       #67  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
	//   63  125:invokevirtual   #31  <Method Object put(Object, Object)>
	//   64  128:pop             
	//   65  129:return          
	}
}
