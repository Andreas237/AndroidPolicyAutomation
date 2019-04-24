// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.awsservices.apigateway;

import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.irobot.awsservices.apigateway:
//			ApiGatewayResponse

private class ApiGatewayResponse$ResponseError
{

	private ApiGatewayResponse.a getReason()
	{
		ApiGatewayResponse.a a1 = (ApiGatewayResponse.a)ERROR_REASON_MAP.get(((Object) (mErrorType)));
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Map ERROR_REASON_MAP>
	//    2    4:aload_0         
	//    3    5:getfield        #52  <Field String mErrorType>
	//    4    8:invokeinterface #94  <Method Object Map.get(Object)>
	//    5   13:checkcast       #96  <Class ApiGatewayResponse$a>
	//    6   16:astore_2        
		ApiGatewayResponse.a a = a1;
	//    7   17:aload_2         
	//    8   18:astore_1        
		if(a1 == null)
	//*   9   19:aload_2         
	//*  10   20:ifnonnull       27
			a = ApiGatewayResponse.a.None;
	//   11   23:getstatic       #100 <Field ApiGatewayResponse$a ApiGatewayResponse$a.None>
	//   12   26:astore_1        
		return a;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	private final Map ERROR_REASON_MAP;
	String mErrorMessage;
	String mErrorType;
	final ApiGatewayResponse this$0;


/*
	static ApiGatewayResponse.a access$000(ApiGatewayResponse$ResponseError apigatewayresponse$responseerror)
	{
		return apigatewayresponse$responseerror.getReason();
	//    0    0:aload_0         
	//    1    1:invokespecial   #88  <Method ApiGatewayResponse$a getReason()>
	//    2    4:areturn         
	}

*/

	public ApiGatewayResponse$ResponseError(int i, String s)
	{
		Object obj;
		this$0 = ApiGatewayResponse.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field ApiGatewayResponse this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #31  <Method void Object()>
		ERROR_REASON_MAP = ((Map) (new HashMap() {

			final ApiGatewayResponse.ResponseError a;

			
			{
				a = ApiGatewayResponse.ResponseError.this;
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
));
	//    5    9:aload_0         
	//    6   10:new             #9   <Class ApiGatewayResponse$ResponseError$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:invokespecial   #34  <Method void ApiGatewayResponse$ResponseError$1(ApiGatewayResponse$ResponseError)>
	//   10   18:putfield        #36  <Field Map ERROR_REASON_MAP>
		obj = null;
	//   11   21:aconst_null     
	//   12   22:astore          4
		Gson gson = new Gson();
	//   13   24:new             #38  <Class Gson>
	//   14   27:dup             
	//   15   28:invokespecial   #39  <Method void Gson()>
	//   16   31:astore          5
		if(i >= 400)
	//*  17   33:iload_2         
	//*  18   34:sipush          400
	//*  19   37:icmplt          55
		{
			try
			{
				apigatewayresponse = ((ApiGatewayResponse) ((ApiGatewayResponse$ResponseError)gson.fromJson(s, com/irobot/awsservices/apigateway/ApiGatewayResponse$ResponseError)));
	//   20   40:aload           5
	//   21   42:aload_3         
	//   22   43:ldc1            #2   <Class ApiGatewayResponse$ResponseError>
	//   23   45:invokevirtual   #43  <Method Object Gson.fromJson(String, Class)>
	//   24   48:checkcast       #2   <Class ApiGatewayResponse$ResponseError>
	//   25   51:astore_1        
			}
	//*  26   52:goto            155
	//*  27   55:aload           4
	//*  28   57:astore_1        
	//*  29   58:iload_2         
	//*  30   59:sipush          200
	//*  31   62:icmpne          155
	//*  32   65:aload           5
	//*  33   67:aload_3         
	//*  34   68:ldc1            #45  <Class ApiGatewayResponse$AssociationResponseError>
	//*  35   70:invokevirtual   #43  <Method Object Gson.fromJson(String, Class)>
	//*  36   73:checkcast       #45  <Class ApiGatewayResponse$AssociationResponseError>
	//*  37   76:astore_1        
	//*  38   77:aload_1         
	//*  39   78:ifnull          103
	//*  40   81:aload_0         
	//*  41   82:aload_1         
	//*  42   83:getfield        #48  <Field String ApiGatewayResponse$AssociationResponseError.associationStatus>
	//*  43   86:putfield        #50  <Field String mErrorMessage>
	//*  44   89:aload_0         
	//*  45   90:aload_1         
	//*  46   91:getfield        #48  <Field String ApiGatewayResponse$AssociationResponseError.associationStatus>
	//*  47   94:putfield        #52  <Field String mErrorType>
	//*  48   97:aload           4
	//*  49   99:astore_1        
	//*  50  100:goto            155
	//*  51  103:ldc1            #54  <String "ApiGwResponse">
	//*  52  105:ldc1            #56  <String "Couldn't translate response error to AssociationResponseError">
	//*  53  107:invokestatic    #62  <Method int Log.e(String, String)>
	//*  54  110:pop             
	//*  55  111:aload           4
	//*  56  113:astore_1        
	//*  57  114:goto            155
			// Misplaced declaration of an exception variable
			catch(ApiGatewayResponse apigatewayresponse)
	//*  58  117:astore_1        
			{
				s = ((String) (new StringBuilder()));
	//   59  118:new             #64  <Class StringBuilder>
	//   60  121:dup             
	//   61  122:invokespecial   #65  <Method void StringBuilder()>
	//   62  125:astore_3        
				((StringBuilder) (s)).append("[Not a bug!] Couldn't translate response to a known ErrorType ");
	//   63  126:aload_3         
	//   64  127:ldc1            #67  <String "[Not a bug!] Couldn't translate response to a known ErrorType ">
	//   65  129:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   66  132:pop             
				((StringBuilder) (s)).append(getMessage());
	//   67  133:aload_3         
	//   68  134:aload_1         
	//   69  135:invokevirtual   #75  <Method String JsonSyntaxException.getMessage()>
	//   70  138:invokevirtual   #71  <Method StringBuilder StringBuilder.append(String)>
	//   71  141:pop             
				Log.w("ApiGwResponse", ((StringBuilder) (s)).toString());
	//   72  142:ldc1            #54  <String "ApiGwResponse">
	//   73  144:aload_3         
	//   74  145:invokevirtual   #78  <Method String StringBuilder.toString()>
	//   75  148:invokestatic    #81  <Method int Log.w(String, String)>
	//   76  151:pop             
				apigatewayresponse = ((ApiGatewayResponse) (obj));
	//   77  152:aload           4
	//   78  154:astore_1        
			}
			break MISSING_BLOCK_LABEL_155;
		}
		apigatewayresponse = ((ApiGatewayResponse) (obj));
		if(i != 200)
			break MISSING_BLOCK_LABEL_155;
		apigatewayresponse = ((ApiGatewayResponse) ((ponseError)gson.fromJson(s, com/irobot/awsservices/apigateway/ApiGatewayResponse$AssociationResponseError)));
		if(ApiGatewayResponse.this == null)
			break MISSING_BLOCK_LABEL_103;
		mErrorMessage = associationStatus;
		mErrorType = associationStatus;
		apigatewayresponse = ((ApiGatewayResponse) (obj));
		break MISSING_BLOCK_LABEL_155;
		Log.e("ApiGwResponse", "Couldn't translate response error to AssociationResponseError");
		apigatewayresponse = ((ApiGatewayResponse) (obj));
		if(ApiGatewayResponse.this != null)
	//*  79  155:aload_1         
	//*  80  156:ifnull          175
		{
			mErrorMessage = ((ApiGatewayResponse$ResponseError) (ApiGatewayResponse.this)).mErrorMessage;
	//   81  159:aload_0         
	//   82  160:aload_1         
	//   83  161:getfield        #50  <Field String mErrorMessage>
	//   84  164:putfield        #50  <Field String mErrorMessage>
			mErrorType = ((ApiGatewayResponse$ResponseError) (ApiGatewayResponse.this)).mErrorType;
	//   85  167:aload_0         
	//   86  168:aload_1         
	//   87  169:getfield        #52  <Field String mErrorType>
	//   88  172:putfield        #52  <Field String mErrorType>
		}
		return;
	//   89  175:return          
	}
}
