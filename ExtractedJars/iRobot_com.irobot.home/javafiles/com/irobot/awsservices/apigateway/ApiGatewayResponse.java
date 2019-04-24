// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.awsservices.apigateway;

import android.text.TextUtils;
import android.util.Log;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import java.util.HashMap;
import java.util.Map;

public class ApiGatewayResponse
{
	private class AssociationResponseError
	{

		String associationStatus;
		final ApiGatewayResponse this$0;

		private AssociationResponseError()
		{
			this$0 = ApiGatewayResponse.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field ApiGatewayResponse this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
		//    5    9:return          
		}
	}

	private class ResponseError
	{

		private a getReason()
		{
			a a2 = (a)ERROR_REASON_MAP.get(((Object) (mErrorType)));
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Map ERROR_REASON_MAP>
		//    2    4:aload_0         
		//    3    5:getfield        #52  <Field String mErrorType>
		//    4    8:invokeinterface #94  <Method Object Map.get(Object)>
		//    5   13:checkcast       #96  <Class ApiGatewayResponse$a>
		//    6   16:astore_2        
			a a1 = a2;
		//    7   17:aload_2         
		//    8   18:astore_1        
			if(a2 == null)
		//*   9   19:aload_2         
		//*  10   20:ifnonnull       27
				a1 = a.None;
		//   11   23:getstatic       #100 <Field ApiGatewayResponse$a ApiGatewayResponse$a.None>
		//   12   26:astore_1        
			return a1;
		//   13   27:aload_1         
		//   14   28:areturn         
		}

		private final Map ERROR_REASON_MAP;
		String mErrorMessage;
		String mErrorType;
		final ApiGatewayResponse this$0;


/*
		static a access$000(ResponseError responseerror)
		{
			return responseerror.getReason();
		//    0    0:aload_0         
		//    1    1:invokespecial   #88  <Method ApiGatewayResponse$a getReason()>
		//    2    4:areturn         
		}

*/

		public ResponseError(int i, String s)
		{
			Object obj;
			this$0 = ApiGatewayResponse.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #28  <Field ApiGatewayResponse this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #31  <Method void Object()>
			ERROR_REASON_MAP = ((Map) (new _cls1(this)));
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
					apigatewayresponse = ((ApiGatewayResponse) ((ResponseError)gson.fromJson(s, com/irobot/awsservices/apigateway/ApiGatewayResponse$ResponseError)));
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
			apigatewayresponse = ((ApiGatewayResponse) ((AssociationResponseError)gson.fromJson(s, com/irobot/awsservices/apigateway/ApiGatewayResponse$AssociationResponseError)));
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
				mErrorMessage = ((ResponseError) (ApiGatewayResponse.this)).mErrorMessage;
		//   81  159:aload_0         
		//   82  160:aload_1         
		//   83  161:getfield        #50  <Field String mErrorMessage>
		//   84  164:putfield        #50  <Field String mErrorMessage>
				mErrorType = ((ResponseError) (ApiGatewayResponse.this)).mErrorType;
		//   85  167:aload_0         
		//   86  168:aload_1         
		//   87  169:getfield        #52  <Field String mErrorType>
		//   88  172:putfield        #52  <Field String mErrorType>
			}
			return;
		//   89  175:return          
		}
	}

	public static final class a extends Enum
	{

		public static a valueOf(String s)
		{
			return (a)Enum.valueOf(com/irobot/awsservices/apigateway/ApiGatewayResponse$a, s);
		//    0    0:ldc1            #2   <Class ApiGatewayResponse$a>
		//    1    2:aload_0         
		//    2    3:invokestatic    #67  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ApiGatewayResponse$a>
		//    4    9:areturn         
		}

		public static a[] values()
		{
			return (a[])((a []) ($VALUES)).clone();
		//    0    0:getstatic       #59  <Field ApiGatewayResponse$a[] $VALUES>
		//    1    3:invokevirtual   #74  <Method Object _5B_Lcom.irobot.awsservices.apigateway.ApiGatewayResponse$a_3B_.clone()>
		//    2    6:checkcast       #70  <Class ApiGatewayResponse$a[]>
		//    3    9:areturn         
		}

		private static final a $VALUES[];
		public static final a AssociationMissing;
		public static final a AuthenticationFailure;
		public static final a InvalidCognitoUser;
		public static final a InvalidEvent;
		public static final a InvalidPasswordError;
		public static final a MapNotFound;
		public static final a NoEventProvided;
		public static final a None;
		public static final a RobotNotFound;
		public static final a RuntimeError;

		static 
		{
			None = new a("None", 0);
		//    0    0:new             #2   <Class ApiGatewayResponse$a>
		//    1    3:dup             
		//    2    4:ldc1            #24  <String "None">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//    5   10:putstatic       #30  <Field ApiGatewayResponse$a None>
			AssociationMissing = new a("AssociationMissing", 1);
		//    6   13:new             #2   <Class ApiGatewayResponse$a>
		//    7   16:dup             
		//    8   17:ldc1            #31  <String "AssociationMissing">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   11   23:putstatic       #33  <Field ApiGatewayResponse$a AssociationMissing>
			AuthenticationFailure = new a("AuthenticationFailure", 2);
		//   12   26:new             #2   <Class ApiGatewayResponse$a>
		//   13   29:dup             
		//   14   30:ldc1            #34  <String "AuthenticationFailure">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   17   36:putstatic       #36  <Field ApiGatewayResponse$a AuthenticationFailure>
			InvalidPasswordError = new a("InvalidPasswordError", 3);
		//   18   39:new             #2   <Class ApiGatewayResponse$a>
		//   19   42:dup             
		//   20   43:ldc1            #37  <String "InvalidPasswordError">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   23   49:putstatic       #39  <Field ApiGatewayResponse$a InvalidPasswordError>
			InvalidCognitoUser = new a("InvalidCognitoUser", 4);
		//   24   52:new             #2   <Class ApiGatewayResponse$a>
		//   25   55:dup             
		//   26   56:ldc1            #40  <String "InvalidCognitoUser">
		//   27   58:iconst_4        
		//   28   59:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   29   62:putstatic       #42  <Field ApiGatewayResponse$a InvalidCognitoUser>
			RobotNotFound = new a("RobotNotFound", 5);
		//   30   65:new             #2   <Class ApiGatewayResponse$a>
		//   31   68:dup             
		//   32   69:ldc1            #43  <String "RobotNotFound">
		//   33   71:iconst_5        
		//   34   72:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   35   75:putstatic       #45  <Field ApiGatewayResponse$a RobotNotFound>
			InvalidEvent = new a("InvalidEvent", 6);
		//   36   78:new             #2   <Class ApiGatewayResponse$a>
		//   37   81:dup             
		//   38   82:ldc1            #46  <String "InvalidEvent">
		//   39   84:bipush          6
		//   40   86:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   41   89:putstatic       #48  <Field ApiGatewayResponse$a InvalidEvent>
			NoEventProvided = new a("NoEventProvided", 7);
		//   42   92:new             #2   <Class ApiGatewayResponse$a>
		//   43   95:dup             
		//   44   96:ldc1            #49  <String "NoEventProvided">
		//   45   98:bipush          7
		//   46  100:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   47  103:putstatic       #51  <Field ApiGatewayResponse$a NoEventProvided>
			MapNotFound = new a("MapNotFound", 8);
		//   48  106:new             #2   <Class ApiGatewayResponse$a>
		//   49  109:dup             
		//   50  110:ldc1            #52  <String "MapNotFound">
		//   51  112:bipush          8
		//   52  114:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   53  117:putstatic       #54  <Field ApiGatewayResponse$a MapNotFound>
			RuntimeError = new a("RuntimeError", 9);
		//   54  120:new             #2   <Class ApiGatewayResponse$a>
		//   55  123:dup             
		//   56  124:ldc1            #55  <String "RuntimeError">
		//   57  126:bipush          9
		//   58  128:invokespecial   #28  <Method void ApiGatewayResponse$a(String, int)>
		//   59  131:putstatic       #57  <Field ApiGatewayResponse$a RuntimeError>
			$VALUES = (new a[] {
				None, AssociationMissing, AuthenticationFailure, InvalidPasswordError, InvalidCognitoUser, RobotNotFound, InvalidEvent, NoEventProvided, MapNotFound, RuntimeError
			});
		//   60  134:bipush          10
		//   61  136:anewarray       a[]
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

		private a(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #61  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ApiGatewayResponse(int i, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		a = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #30  <Field int a>
		b = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #32  <Field String b>
		c = s1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #34  <Field String c>
		d = new ResponseError(a, c);
	//   11   19:aload_0         
	//   12   20:new             #9   <Class ApiGatewayResponse$ResponseError>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #30  <Field int a>
	//   17   29:aload_0         
	//   18   30:getfield        #34  <Field String c>
	//   19   33:invokespecial   #37  <Method void ApiGatewayResponse$ResponseError(ApiGatewayResponse, int, String)>
	//   20   36:putfield        #39  <Field ApiGatewayResponse$ResponseError d>
		if(d.getReason() == a.AssociationMissing || d.getReason() == a.AuthenticationFailure)
	//*  21   39:aload_0         
	//*  22   40:getfield        #39  <Field ApiGatewayResponse$ResponseError d>
	//*  23   43:invokestatic    #43  <Method ApiGatewayResponse$a ApiGatewayResponse$ResponseError.access$000(ApiGatewayResponse$ResponseError)>
	//*  24   46:getstatic       #47  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
	//*  25   49:if_acmpeq       65
	//*  26   52:aload_0         
	//*  27   53:getfield        #39  <Field ApiGatewayResponse$ResponseError d>
	//*  28   56:invokestatic    #43  <Method ApiGatewayResponse$a ApiGatewayResponse$ResponseError.access$000(ApiGatewayResponse$ResponseError)>
	//*  29   59:getstatic       #50  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AuthenticationFailure>
	//*  30   62:if_acmpne       97
			a(new com.irobot.awsservices.a.b.a(d.mErrorMessage, ((Throwable) (new Exception(d.mErrorMessage)))));
	//   31   65:aload_0         
	//   32   66:new             #52  <Class com.irobot.awsservices.a.b$a>
	//   33   69:dup             
	//   34   70:aload_0         
	//   35   71:getfield        #39  <Field ApiGatewayResponse$ResponseError d>
	//   36   74:getfield        #55  <Field String ApiGatewayResponse$ResponseError.mErrorMessage>
	//   37   77:new             #57  <Class Exception>
	//   38   80:dup             
	//   39   81:aload_0         
	//   40   82:getfield        #39  <Field ApiGatewayResponse$ResponseError d>
	//   41   85:getfield        #55  <Field String ApiGatewayResponse$ResponseError.mErrorMessage>
	//   42   88:invokespecial   #60  <Method void Exception(String)>
	//   43   91:invokespecial   #63  <Method void com.irobot.awsservices.a.b$a(String, Throwable)>
	//   44   94:invokevirtual   #66  <Method void a(com.irobot.awsservices.a.b$a)>
	//   45   97:return          
	}

	public static String a(String s)
	{
		Object obj = ((Object) (s));
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #74  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    6:ifne            54
		{
			if(s.length() < 200)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #80  <Method int String.length()>
	//*   7   13:sipush          200
	//*   8   16:icmpge          21
				return s;
	//    9   19:aload_0         
	//   10   20:areturn         
			obj = ((Object) (new StringBuilder()));
	//   11   21:new             #82  <Class StringBuilder>
	//   12   24:dup             
	//   13   25:invokespecial   #83  <Method void StringBuilder()>
	//   14   28:astore_1        
			((StringBuilder) (obj)).append(s.substring(0, 199));
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:sipush          199
	//   19   35:invokevirtual   #87  <Method String String.substring(int, int)>
	//   20   38:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   21   41:pop             
			((StringBuilder) (obj)).append("...");
	//   22   42:aload_1         
	//   23   43:ldc1            #93  <String "...">
	//   24   45:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   25   48:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   26   49:aload_1         
	//   27   50:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   28   53:astore_1        
		}
		return ((String) (obj));
	//   29   54:aload_1         
	//   30   55:areturn         
	}

	public int a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int a>
	//    2    4:ireturn         
	}

	public void a(com.irobot.awsservices.a.b.a a1)
	{
		e = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #99  <Field com.irobot.awsservices.a.b$a e>
	//    3    5:return          
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String b>
	//    2    4:areturn         
	}

	public String c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field String c>
	//    2    4:areturn         
	}

	public com.irobot.awsservices.a.b.a d()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field com.irobot.awsservices.a.b$a e>
	//    2    4:areturn         
	}

	public boolean e()
	{
		return d != null && f() != a.None || a == 408;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ApiGatewayResponse$ResponseError d>
	//    2    4:ifnull          17
	//    3    7:aload_0         
	//    4    8:invokevirtual   #105 <Method ApiGatewayResponse$a f()>
	//    5   11:getstatic       #108 <Field ApiGatewayResponse$a ApiGatewayResponse$a.None>
	//    6   14:if_acmpne       27
	//    7   17:aload_0         
	//    8   18:getfield        #30  <Field int a>
	//    9   21:sipush          408
	//   10   24:icmpne          29
	//   11   27:iconst_1        
	//   12   28:ireturn         
	//   13   29:iconst_0        
	//   14   30:ireturn         
	}

	public a f()
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field ApiGatewayResponse$ResponseError d>
	//*   2    4:ifnull          15
			return d.getReason();
	//    3    7:aload_0         
	//    4    8:getfield        #39  <Field ApiGatewayResponse$ResponseError d>
	//    5   11:invokestatic    #43  <Method ApiGatewayResponse$a ApiGatewayResponse$ResponseError.access$000(ApiGatewayResponse$ResponseError)>
	//    6   14:areturn         
		else
			return a.None;
	//    7   15:getstatic       #108 <Field ApiGatewayResponse$a ApiGatewayResponse$a.None>
	//    8   18:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #82  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("response code: ");
	//    4    8:aload_2         
	//    5    9:ldc1            #110 <String "response code: ">
	//    6   11:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a());
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #112 <Method int a()>
	//   11   20:invokevirtual   #115 <Method StringBuilder StringBuilder.append(int)>
	//   12   23:pop             
		stringbuilder.append("\nresponse message: ");
	//   13   24:aload_2         
	//   14   25:ldc1            #117 <String "\nresponse message: ">
	//   15   27:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		stringbuilder.append(b());
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:invokevirtual   #119 <Method String b()>
	//   20   36:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   21   39:pop             
		stringbuilder.append("\nresponse json: ");
	//   22   40:aload_2         
	//   23   41:ldc1            #121 <String "\nresponse json: ">
	//   24   43:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append(a(c()));
	//   26   47:aload_2         
	//   27   48:aload_0         
	//   28   49:invokevirtual   #123 <Method String c()>
	//   29   52:invokestatic    #125 <Method String a(String)>
	//   30   55:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   31   58:pop             
		stringbuilder.append("\ncredentials available: ");
	//   32   59:aload_2         
	//   33   60:ldc1            #127 <String "\ncredentials available: ">
	//   34   62:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   35   65:pop             
		Object obj;
		if(e == null)
	//*  36   66:aload_0         
	//*  37   67:getfield        #99  <Field com.irobot.awsservices.a.b$a e>
	//*  38   70:ifnonnull       79
		{
			obj = "yes";
	//   39   73:ldc1            #129 <String "yes">
	//   40   75:astore_1        
		} else
	//*  41   76:goto            111
		{
			obj = ((Object) (new StringBuilder()));
	//   42   79:new             #82  <Class StringBuilder>
	//   43   82:dup             
	//   44   83:invokespecial   #83  <Method void StringBuilder()>
	//   45   86:astore_1        
			((StringBuilder) (obj)).append("No, error: ");
	//   46   87:aload_1         
	//   47   88:ldc1            #131 <String "No, error: ">
	//   48   90:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   49   93:pop             
			((StringBuilder) (obj)).append(e.getMessage());
	//   50   94:aload_1         
	//   51   95:aload_0         
	//   52   96:getfield        #99  <Field com.irobot.awsservices.a.b$a e>
	//   53   99:invokevirtual   #134 <Method String com.irobot.awsservices.a.b$a.getMessage()>
	//   54  102:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   55  105:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   56  106:aload_1         
	//   57  107:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   58  110:astore_1        
		}
		stringbuilder.append(((String) (obj)));
	//   59  111:aload_2         
	//   60  112:aload_1         
	//   61  113:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   62  116:pop             
		return stringbuilder.toString();
	//   63  117:aload_2         
	//   64  118:invokevirtual   #97  <Method String StringBuilder.toString()>
	//   65  121:areturn         
	}

	private final int a;
	private final String b;
	private final String c;
	private final ResponseError d;
	private com.irobot.awsservices.a.b.a e;

	// Unreferenced inner class com/irobot/awsservices/apigateway/ApiGatewayResponse$ResponseError$1

/* anonymous class */
	class ResponseError._cls1 extends HashMap
	{

		final ResponseError a;

			
			{
				a = responseerror;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field ApiGatewayResponse$ResponseError a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void HashMap()>
				put("AspenError.AuthenticationFailed", ((Object) (a.AuthenticationFailure)));
			//    5    9:aload_0         
			//    6   10:ldc1            #21  <String "AspenError.AuthenticationFailed">
			//    7   12:getstatic       #27  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AuthenticationFailure>
			//    8   15:invokevirtual   #31  <Method Object put(Object, Object)>
			//    9   18:pop             
				put("AspenError.InvalidPasswordError", ((Object) (a.InvalidPasswordError)));
			//   10   19:aload_0         
			//   11   20:ldc1            #33  <String "AspenError.InvalidPasswordError">
			//   12   22:getstatic       #36  <Field ApiGatewayResponse$a ApiGatewayResponse$a.InvalidPasswordError>
			//   13   25:invokevirtual   #31  <Method Object put(Object, Object)>
			//   14   28:pop             
				put("AspenError.InvalidCognitoUser", ((Object) (a.InvalidCognitoUser)));
			//   15   29:aload_0         
			//   16   30:ldc1            #38  <String "AspenError.InvalidCognitoUser">
			//   17   32:getstatic       #41  <Field ApiGatewayResponse$a ApiGatewayResponse$a.InvalidCognitoUser>
			//   18   35:invokevirtual   #31  <Method Object put(Object, Object)>
			//   19   38:pop             
				put("AspenError.RobotNotFound", ((Object) (a.RobotNotFound)));
			//   20   39:aload_0         
			//   21   40:ldc1            #43  <String "AspenError.RobotNotFound">
			//   22   42:getstatic       #46  <Field ApiGatewayResponse$a ApiGatewayResponse$a.RobotNotFound>
			//   23   45:invokevirtual   #31  <Method Object put(Object, Object)>
			//   24   48:pop             
				put("AspenError.InvalidEvent", ((Object) (a.InvalidEvent)));
			//   25   49:aload_0         
			//   26   50:ldc1            #48  <String "AspenError.InvalidEvent">
			//   27   52:getstatic       #51  <Field ApiGatewayResponse$a ApiGatewayResponse$a.InvalidEvent>
			//   28   55:invokevirtual   #31  <Method Object put(Object, Object)>
			//   29   58:pop             
				put("AspenError.NoEventProvided", ((Object) (a.NoEventProvided)));
			//   30   59:aload_0         
			//   31   60:ldc1            #53  <String "AspenError.NoEventProvided">
			//   32   62:getstatic       #56  <Field ApiGatewayResponse$a ApiGatewayResponse$a.NoEventProvided>
			//   33   65:invokevirtual   #31  <Method Object put(Object, Object)>
			//   34   68:pop             
				put("AspenError.MapNotFound", ((Object) (a.NoEventProvided)));
			//   35   69:aload_0         
			//   36   70:ldc1            #58  <String "AspenError.MapNotFound">
			//   37   72:getstatic       #56  <Field ApiGatewayResponse$a ApiGatewayResponse$a.NoEventProvided>
			//   38   75:invokevirtual   #31  <Method Object put(Object, Object)>
			//   39   78:pop             
				put("RuntimeError", ((Object) (a.RuntimeError)));
			//   40   79:aload_0         
			//   41   80:ldc1            #60  <String "RuntimeError">
			//   42   82:getstatic       #62  <Field ApiGatewayResponse$a ApiGatewayResponse$a.RuntimeError>
			//   43   85:invokevirtual   #31  <Method Object put(Object, Object)>
			//   44   88:pop             
				put("ErrorTooOld", ((Object) (a.AssociationMissing)));
			//   45   89:aload_0         
			//   46   90:ldc1            #64  <String "ErrorTooOld">
			//   47   92:getstatic       #67  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
			//   48   95:invokevirtual   #31  <Method Object put(Object, Object)>
			//   49   98:pop             
				put("ErrorTooNew", ((Object) (a.AssociationMissing)));
			//   50   99:aload_0         
			//   51  100:ldc1            #69  <String "ErrorTooNew">
			//   52  102:getstatic       #67  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
			//   53  105:invokevirtual   #31  <Method Object put(Object, Object)>
			//   54  108:pop             
				put("ErrorNoMatch", ((Object) (a.AssociationMissing)));
			//   55  109:aload_0         
			//   56  110:ldc1            #71  <String "ErrorNoMatch">
			//   57  112:getstatic       #67  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
			//   58  115:invokevirtual   #31  <Method Object put(Object, Object)>
			//   59  118:pop             
				put("AssetNotFound", ((Object) (a.AssociationMissing)));
			//   60  119:aload_0         
			//   61  120:ldc1            #73  <String "AssetNotFound">
			//   62  122:getstatic       #67  <Field ApiGatewayResponse$a ApiGatewayResponse$a.AssociationMissing>
			//   63  125:invokevirtual   #31  <Method Object put(Object, Object)>
			//   64  128:pop             
			//   65  129:return          
			}
	}

}
