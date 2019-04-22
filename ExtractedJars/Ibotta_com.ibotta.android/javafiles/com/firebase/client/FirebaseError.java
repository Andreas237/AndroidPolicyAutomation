// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.firebase.client:
//			FirebaseException

public class FirebaseError
{

	public FirebaseError(int i, String s)
	{
		this(i, s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokespecial   #194 <Method void FirebaseError(int, String, String)>
	//    5    7:return          
	}

	public FirebaseError(int i, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #195 <Method void Object()>
		code = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #197 <Field int code>
		message = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #199 <Field String message>
		s = s1;
	//    8   14:aload_3         
	//    9   15:astore_2        
		if(s1 == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       23
			s = "";
	//   12   20:ldc1            #201 <String "">
	//   13   22:astore_2        
		details = s;
	//   14   23:aload_0         
	//   15   24:aload_2         
	//   16   25:putfield        #203 <Field String details>
	//   17   28:return          
	}

	public static FirebaseError fromCode(int i)
	{
		if(errorReasons.containsKey(((Object) (Integer.valueOf(i)))))
	//*   0    0:getstatic       #75  <Field Map errorReasons>
	//*   1    3:iload_0         
	//*   2    4:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//*   3    7:invokeinterface #209 <Method boolean Map.containsKey(Object)>
	//*   4   12:ifeq            40
		{
			return new FirebaseError(i, (String)errorReasons.get(((Object) (Integer.valueOf(i)))), ((String) (null)));
	//    5   15:new             #2   <Class FirebaseError>
	//    6   18:dup             
	//    7   19:iload_0         
	//    8   20:getstatic       #75  <Field Map errorReasons>
	//    9   23:iload_0         
	//   10   24:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   11   27:invokeinterface #213 <Method Object Map.get(Object)>
	//   12   32:checkcast       #215 <Class String>
	//   13   35:aconst_null     
	//   14   36:invokespecial   #194 <Method void FirebaseError(int, String, String)>
	//   15   39:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   16   40:new             #217 <Class StringBuilder>
	//   17   43:dup             
	//   18   44:invokespecial   #218 <Method void StringBuilder()>
	//   19   47:astore_1        
			stringbuilder.append("Invalid Firebase error code: ");
	//   20   48:aload_1         
	//   21   49:ldc1            #220 <String "Invalid Firebase error code: ">
	//   22   51:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   23   54:pop             
			stringbuilder.append(i);
	//   24   55:aload_1         
	//   25   56:iload_0         
	//   26   57:invokevirtual   #227 <Method StringBuilder StringBuilder.append(int)>
	//   27   60:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   28   61:new             #229 <Class IllegalArgumentException>
	//   29   64:dup             
	//   30   65:aload_1         
	//   31   66:invokevirtual   #233 <Method String StringBuilder.toString()>
	//   32   69:invokespecial   #236 <Method void IllegalArgumentException(String)>
	//   33   72:athrow          
		}
	}

	public static FirebaseError fromException(Throwable throwable)
	{
		StringWriter stringwriter = new StringWriter();
	//    0    0:new             #240 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #241 <Method void StringWriter()>
	//    3    7:astore_1        
		throwable.printStackTrace(new PrintWriter(((java.io.Writer) (stringwriter))));
	//    4    8:aload_0         
	//    5    9:new             #243 <Class PrintWriter>
	//    6   12:dup             
	//    7   13:aload_1         
	//    8   14:invokespecial   #246 <Method void PrintWriter(java.io.Writer)>
	//    9   17:invokevirtual   #252 <Method void Throwable.printStackTrace(PrintWriter)>
		throwable = ((Throwable) (new StringBuilder()));
	//   10   20:new             #217 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #218 <Method void StringBuilder()>
	//   13   27:astore_0        
		((StringBuilder) (throwable)).append((String)errorReasons.get(((Object) (Integer.valueOf(-11)))));
	//   14   28:aload_0         
	//   15   29:getstatic       #75  <Field Map errorReasons>
	//   16   32:bipush          -11
	//   17   34:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   18   37:invokeinterface #213 <Method Object Map.get(Object)>
	//   19   42:checkcast       #215 <Class String>
	//   20   45:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   21   48:pop             
		((StringBuilder) (throwable)).append(stringwriter.toString());
	//   22   49:aload_0         
	//   23   50:aload_1         
	//   24   51:invokevirtual   #253 <Method String StringWriter.toString()>
	//   25   54:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   26   57:pop             
		return new FirebaseError(-11, ((StringBuilder) (throwable)).toString());
	//   27   58:new             #2   <Class FirebaseError>
	//   28   61:dup             
	//   29   62:bipush          -11
	//   30   64:aload_0         
	//   31   65:invokevirtual   #233 <Method String StringBuilder.toString()>
	//   32   68:invokespecial   #255 <Method void FirebaseError(int, String)>
	//   33   71:areturn         
	}

	public static FirebaseError fromStatus(String s)
	{
		return fromStatus(s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #260 <Method FirebaseError fromStatus(String, String)>
	//    3    5:areturn         
	}

	public static FirebaseError fromStatus(String s, String s1)
	{
		return fromStatus(s, s1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #263 <Method FirebaseError fromStatus(String, String, String)>
	//    4    6:areturn         
	}

	public static FirebaseError fromStatus(String s, String s1, String s2)
	{
		Object obj = ((Object) ((Integer)errorCodes.get(((Object) (s.toLowerCase())))));
	//    0    0:getstatic       #141 <Field Map errorCodes>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #266 <Method String String.toLowerCase()>
	//    3    7:invokeinterface #213 <Method Object Map.get(Object)>
	//    4   12:checkcast       #77  <Class Integer>
	//    5   15:astore_3        
		s = ((String) (obj));
	//    6   16:aload_3         
	//    7   17:astore_0        
		if(obj == null)
	//*   8   18:aload_3         
	//*   9   19:ifnonnull       29
			s = ((String) (Integer.valueOf(-999)));
	//   10   22:sipush          -999
	//   11   25:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   12   28:astore_0        
		obj = ((Object) (s1));
	//   13   29:aload_1         
	//   14   30:astore_3        
		if(s1 == null)
	//*  15   31:aload_1         
	//*  16   32:ifnonnull       48
			obj = ((Object) ((String)errorReasons.get(((Object) (s)))));
	//   17   35:getstatic       #75  <Field Map errorReasons>
	//   18   38:aload_0         
	//   19   39:invokeinterface #213 <Method Object Map.get(Object)>
	//   20   44:checkcast       #215 <Class String>
	//   21   47:astore_3        
		return new FirebaseError(((Integer) (s)).intValue(), ((String) (obj)), s2);
	//   22   48:new             #2   <Class FirebaseError>
	//   23   51:dup             
	//   24   52:aload_0         
	//   25   53:invokevirtual   #270 <Method int Integer.intValue()>
	//   26   56:aload_3         
	//   27   57:aload_2         
	//   28   58:invokespecial   #194 <Method void FirebaseError(int, String, String)>
	//   29   61:areturn         
	}

	public int getCode()
	{
		return code;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field int code>
	//    2    4:ireturn         
	}

	public String getDetails()
	{
		return details;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field String details>
	//    2    4:areturn         
	}

	public String getMessage()
	{
		return message;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field String message>
	//    2    4:areturn         
	}

	public FirebaseException toException()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #217 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #218 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("Firebase error: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #277 <String "Firebase error: ">
	//    6   12:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(message);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #199 <Field String message>
	//   11   21:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		return new FirebaseException(stringbuilder.toString());
	//   13   25:new             #279 <Class FirebaseException>
	//   14   28:dup             
	//   15   29:aload_1         
	//   16   30:invokevirtual   #233 <Method String StringBuilder.toString()>
	//   17   33:invokespecial   #280 <Method void FirebaseException(String)>
	//   18   36:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #217 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #218 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("FirebaseError: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #282 <String "FirebaseError: ">
	//    6   12:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(message);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #199 <Field String message>
	//   11   21:invokevirtual   #224 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		return stringbuilder.toString();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #233 <Method String StringBuilder.toString()>
	//   15   29:areturn         
	}

	public static final int AUTHENTICATION_PROVIDER_DISABLED = -12;
	public static final int DATA_STALE = -1;
	public static final int DENIED_BY_USER = -19;
	public static final int DISCONNECTED = -4;
	public static final int EMAIL_TAKEN = -18;
	public static final int EXPIRED_TOKEN = -6;
	public static final int INVALID_AUTH_ARGUMENTS = -21;
	public static final int INVALID_CONFIGURATION = -13;
	public static final int INVALID_CREDENTIALS = -20;
	public static final int INVALID_EMAIL = -15;
	public static final int INVALID_PASSWORD = -16;
	public static final int INVALID_PROVIDER = -14;
	public static final int INVALID_TOKEN = -7;
	public static final int LIMITS_EXCEEDED = -23;
	public static final int MAX_RETRIES = -8;
	public static final int NETWORK_ERROR = -24;
	public static final int OPERATION_FAILED = -2;
	public static final int OVERRIDDEN_BY_SET = -9;
	public static final int PERMISSION_DENIED = -3;
	public static final int PREEMPTED = -5;
	public static final int PROVIDER_ERROR = -22;
	public static final int UNAVAILABLE = -10;
	public static final int UNKNOWN_ERROR = -999;
	public static final int USER_CODE_EXCEPTION = -11;
	public static final int USER_DOES_NOT_EXIST = -17;
	public static final int WRITE_CANCELED = -25;
	private static final Map errorCodes;
	private static final Map errorReasons;
	private final int code;
	private final String details;
	private final String message;

	static 
	{
		errorReasons = ((Map) (new HashMap()));
	//    0    0:new             #70  <Class HashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #73  <Method void HashMap()>
	//    3    7:putstatic       #75  <Field Map errorReasons>
		errorReasons.put(((Object) (Integer.valueOf(-1))), "The transaction needs to be run again with current data");
	//    4   10:getstatic       #75  <Field Map errorReasons>
	//    5   13:iconst_m1       
	//    6   14:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//    7   17:ldc1            #83  <String "The transaction needs to be run again with current data">
	//    8   19:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//    9   24:pop             
		errorReasons.put(((Object) (Integer.valueOf(-2))), "The server indicated that this operation failed");
	//   10   25:getstatic       #75  <Field Map errorReasons>
	//   11   28:bipush          -2
	//   12   30:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   13   33:ldc1            #91  <String "The server indicated that this operation failed">
	//   14   35:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   15   40:pop             
		errorReasons.put(((Object) (Integer.valueOf(-3))), "This client does not have permission to perform this operation");
	//   16   41:getstatic       #75  <Field Map errorReasons>
	//   17   44:bipush          -3
	//   18   46:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   19   49:ldc1            #93  <String "This client does not have permission to perform this operation">
	//   20   51:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   21   56:pop             
		errorReasons.put(((Object) (Integer.valueOf(-4))), "The operation had to be aborted due to a network disconnect");
	//   22   57:getstatic       #75  <Field Map errorReasons>
	//   23   60:bipush          -4
	//   24   62:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   25   65:ldc1            #95  <String "The operation had to be aborted due to a network disconnect">
	//   26   67:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   27   72:pop             
		errorReasons.put(((Object) (Integer.valueOf(-5))), "The active or pending auth credentials were superseded by another call to auth");
	//   28   73:getstatic       #75  <Field Map errorReasons>
	//   29   76:bipush          -5
	//   30   78:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   31   81:ldc1            #97  <String "The active or pending auth credentials were superseded by another call to auth">
	//   32   83:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   33   88:pop             
		errorReasons.put(((Object) (Integer.valueOf(-6))), "The supplied auth token has expired");
	//   34   89:getstatic       #75  <Field Map errorReasons>
	//   35   92:bipush          -6
	//   36   94:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   37   97:ldc1            #99  <String "The supplied auth token has expired">
	//   38   99:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   39  104:pop             
		errorReasons.put(((Object) (Integer.valueOf(-7))), "The supplied auth token was invalid");
	//   40  105:getstatic       #75  <Field Map errorReasons>
	//   41  108:bipush          -7
	//   42  110:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   43  113:ldc1            #101 <String "The supplied auth token was invalid">
	//   44  115:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   45  120:pop             
		errorReasons.put(((Object) (Integer.valueOf(-8))), "The transaction had too many retries");
	//   46  121:getstatic       #75  <Field Map errorReasons>
	//   47  124:bipush          -8
	//   48  126:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   49  129:ldc1            #103 <String "The transaction had too many retries">
	//   50  131:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   51  136:pop             
		errorReasons.put(((Object) (Integer.valueOf(-9))), "The transaction was overridden by a subsequent set");
	//   52  137:getstatic       #75  <Field Map errorReasons>
	//   53  140:bipush          -9
	//   54  142:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   55  145:ldc1            #105 <String "The transaction was overridden by a subsequent set">
	//   56  147:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   57  152:pop             
		errorReasons.put(((Object) (Integer.valueOf(-10))), "The service is unavailable");
	//   58  153:getstatic       #75  <Field Map errorReasons>
	//   59  156:bipush          -10
	//   60  158:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   61  161:ldc1            #107 <String "The service is unavailable">
	//   62  163:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   63  168:pop             
		errorReasons.put(((Object) (Integer.valueOf(-11))), "User code called from the Firebase runloop threw an exception:\n");
	//   64  169:getstatic       #75  <Field Map errorReasons>
	//   65  172:bipush          -11
	//   66  174:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   67  177:ldc1            #109 <String "User code called from the Firebase runloop threw an exception:\n">
	//   68  179:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   69  184:pop             
		errorReasons.put(((Object) (Integer.valueOf(-12))), "The specified authentication type is not enabled for this Firebase.");
	//   70  185:getstatic       #75  <Field Map errorReasons>
	//   71  188:bipush          -12
	//   72  190:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   73  193:ldc1            #111 <String "The specified authentication type is not enabled for this Firebase.">
	//   74  195:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   75  200:pop             
		errorReasons.put(((Object) (Integer.valueOf(-13))), "The specified authentication type is not properly configured for this Firebase.");
	//   76  201:getstatic       #75  <Field Map errorReasons>
	//   77  204:bipush          -13
	//   78  206:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   79  209:ldc1            #113 <String "The specified authentication type is not properly configured for this Firebase.">
	//   80  211:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   81  216:pop             
		errorReasons.put(((Object) (Integer.valueOf(-14))), "Invalid provider specified, please check application code.");
	//   82  217:getstatic       #75  <Field Map errorReasons>
	//   83  220:bipush          -14
	//   84  222:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   85  225:ldc1            #115 <String "Invalid provider specified, please check application code.">
	//   86  227:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   87  232:pop             
		errorReasons.put(((Object) (Integer.valueOf(-15))), "The specified email address is incorrect.");
	//   88  233:getstatic       #75  <Field Map errorReasons>
	//   89  236:bipush          -15
	//   90  238:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   91  241:ldc1            #117 <String "The specified email address is incorrect.">
	//   92  243:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   93  248:pop             
		errorReasons.put(((Object) (Integer.valueOf(-16))), "The specified password is incorrect.");
	//   94  249:getstatic       #75  <Field Map errorReasons>
	//   95  252:bipush          -16
	//   96  254:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//   97  257:ldc1            #119 <String "The specified password is incorrect.">
	//   98  259:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//   99  264:pop             
		errorReasons.put(((Object) (Integer.valueOf(-17))), "The specified user does not exist.");
	//  100  265:getstatic       #75  <Field Map errorReasons>
	//  101  268:bipush          -17
	//  102  270:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  103  273:ldc1            #121 <String "The specified user does not exist.">
	//  104  275:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  105  280:pop             
		errorReasons.put(((Object) (Integer.valueOf(-18))), "The specified email address is already in use.");
	//  106  281:getstatic       #75  <Field Map errorReasons>
	//  107  284:bipush          -18
	//  108  286:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  109  289:ldc1            #123 <String "The specified email address is already in use.">
	//  110  291:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  111  296:pop             
		errorReasons.put(((Object) (Integer.valueOf(-19))), "User denied authentication request.");
	//  112  297:getstatic       #75  <Field Map errorReasons>
	//  113  300:bipush          -19
	//  114  302:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  115  305:ldc1            #125 <String "User denied authentication request.">
	//  116  307:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  117  312:pop             
		errorReasons.put(((Object) (Integer.valueOf(-20))), "Invalid authentication credentials provided.");
	//  118  313:getstatic       #75  <Field Map errorReasons>
	//  119  316:bipush          -20
	//  120  318:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  121  321:ldc1            #127 <String "Invalid authentication credentials provided.">
	//  122  323:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  123  328:pop             
		errorReasons.put(((Object) (Integer.valueOf(-21))), "Invalid authentication arguments provided.");
	//  124  329:getstatic       #75  <Field Map errorReasons>
	//  125  332:bipush          -21
	//  126  334:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  127  337:ldc1            #129 <String "Invalid authentication arguments provided.">
	//  128  339:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  129  344:pop             
		errorReasons.put(((Object) (Integer.valueOf(-22))), "A third-party provider error occurred. See data for details.");
	//  130  345:getstatic       #75  <Field Map errorReasons>
	//  131  348:bipush          -22
	//  132  350:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  133  353:ldc1            #131 <String "A third-party provider error occurred. See data for details.">
	//  134  355:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  135  360:pop             
		errorReasons.put(((Object) (Integer.valueOf(-23))), "Limits exceeded.");
	//  136  361:getstatic       #75  <Field Map errorReasons>
	//  137  364:bipush          -23
	//  138  366:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  139  369:ldc1            #133 <String "Limits exceeded.">
	//  140  371:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  141  376:pop             
		errorReasons.put(((Object) (Integer.valueOf(-24))), "The operation could not be performed due to a network error");
	//  142  377:getstatic       #75  <Field Map errorReasons>
	//  143  380:bipush          -24
	//  144  382:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  145  385:ldc1            #135 <String "The operation could not be performed due to a network error">
	//  146  387:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  147  392:pop             
		errorReasons.put(((Object) (Integer.valueOf(-25))), "The write was canceled by the user.");
	//  148  393:getstatic       #75  <Field Map errorReasons>
	//  149  396:bipush          -25
	//  150  398:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  151  401:ldc1            #137 <String "The write was canceled by the user.">
	//  152  403:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  153  408:pop             
		errorReasons.put(((Object) (Integer.valueOf(-999))), "An unknown error occurred");
	//  154  409:getstatic       #75  <Field Map errorReasons>
	//  155  412:sipush          -999
	//  156  415:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  157  418:ldc1            #139 <String "An unknown error occurred">
	//  158  420:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  159  425:pop             
		errorCodes = ((Map) (new HashMap()));
	//  160  426:new             #70  <Class HashMap>
	//  161  429:dup             
	//  162  430:invokespecial   #73  <Method void HashMap()>
	//  163  433:putstatic       #141 <Field Map errorCodes>
		errorCodes.put("datastale", ((Object) (Integer.valueOf(-1))));
	//  164  436:getstatic       #141 <Field Map errorCodes>
	//  165  439:ldc1            #143 <String "datastale">
	//  166  441:iconst_m1       
	//  167  442:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  168  445:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  169  450:pop             
		errorCodes.put("failure", ((Object) (Integer.valueOf(-2))));
	//  170  451:getstatic       #141 <Field Map errorCodes>
	//  171  454:ldc1            #145 <String "failure">
	//  172  456:bipush          -2
	//  173  458:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  174  461:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  175  466:pop             
		errorCodes.put("permission_denied", ((Object) (Integer.valueOf(-3))));
	//  176  467:getstatic       #141 <Field Map errorCodes>
	//  177  470:ldc1            #147 <String "permission_denied">
	//  178  472:bipush          -3
	//  179  474:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  180  477:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  181  482:pop             
		errorCodes.put("disconnected", ((Object) (Integer.valueOf(-4))));
	//  182  483:getstatic       #141 <Field Map errorCodes>
	//  183  486:ldc1            #149 <String "disconnected">
	//  184  488:bipush          -4
	//  185  490:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  186  493:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  187  498:pop             
		errorCodes.put("preempted", ((Object) (Integer.valueOf(-5))));
	//  188  499:getstatic       #141 <Field Map errorCodes>
	//  189  502:ldc1            #151 <String "preempted">
	//  190  504:bipush          -5
	//  191  506:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  192  509:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  193  514:pop             
		errorCodes.put("expired_token", ((Object) (Integer.valueOf(-6))));
	//  194  515:getstatic       #141 <Field Map errorCodes>
	//  195  518:ldc1            #153 <String "expired_token">
	//  196  520:bipush          -6
	//  197  522:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  198  525:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  199  530:pop             
		errorCodes.put("invalid_token", ((Object) (Integer.valueOf(-7))));
	//  200  531:getstatic       #141 <Field Map errorCodes>
	//  201  534:ldc1            #155 <String "invalid_token">
	//  202  536:bipush          -7
	//  203  538:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  204  541:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  205  546:pop             
		errorCodes.put("maxretries", ((Object) (Integer.valueOf(-8))));
	//  206  547:getstatic       #141 <Field Map errorCodes>
	//  207  550:ldc1            #157 <String "maxretries">
	//  208  552:bipush          -8
	//  209  554:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  210  557:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  211  562:pop             
		errorCodes.put("overriddenbyset", ((Object) (Integer.valueOf(-9))));
	//  212  563:getstatic       #141 <Field Map errorCodes>
	//  213  566:ldc1            #159 <String "overriddenbyset">
	//  214  568:bipush          -9
	//  215  570:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  216  573:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  217  578:pop             
		errorCodes.put("unavailable", ((Object) (Integer.valueOf(-10))));
	//  218  579:getstatic       #141 <Field Map errorCodes>
	//  219  582:ldc1            #161 <String "unavailable">
	//  220  584:bipush          -10
	//  221  586:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  222  589:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  223  594:pop             
		errorCodes.put("authentication_disabled", ((Object) (Integer.valueOf(-12))));
	//  224  595:getstatic       #141 <Field Map errorCodes>
	//  225  598:ldc1            #163 <String "authentication_disabled">
	//  226  600:bipush          -12
	//  227  602:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  228  605:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  229  610:pop             
		errorCodes.put("invalid_configuration", ((Object) (Integer.valueOf(-13))));
	//  230  611:getstatic       #141 <Field Map errorCodes>
	//  231  614:ldc1            #165 <String "invalid_configuration">
	//  232  616:bipush          -13
	//  233  618:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  234  621:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  235  626:pop             
		errorCodes.put("invalid_provider", ((Object) (Integer.valueOf(-14))));
	//  236  627:getstatic       #141 <Field Map errorCodes>
	//  237  630:ldc1            #167 <String "invalid_provider">
	//  238  632:bipush          -14
	//  239  634:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  240  637:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  241  642:pop             
		errorCodes.put("invalid_email", ((Object) (Integer.valueOf(-15))));
	//  242  643:getstatic       #141 <Field Map errorCodes>
	//  243  646:ldc1            #169 <String "invalid_email">
	//  244  648:bipush          -15
	//  245  650:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  246  653:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  247  658:pop             
		errorCodes.put("invalid_password", ((Object) (Integer.valueOf(-16))));
	//  248  659:getstatic       #141 <Field Map errorCodes>
	//  249  662:ldc1            #171 <String "invalid_password">
	//  250  664:bipush          -16
	//  251  666:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  252  669:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  253  674:pop             
		errorCodes.put("invalid_user", ((Object) (Integer.valueOf(-17))));
	//  254  675:getstatic       #141 <Field Map errorCodes>
	//  255  678:ldc1            #173 <String "invalid_user">
	//  256  680:bipush          -17
	//  257  682:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  258  685:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  259  690:pop             
		errorCodes.put("email_taken", ((Object) (Integer.valueOf(-18))));
	//  260  691:getstatic       #141 <Field Map errorCodes>
	//  261  694:ldc1            #175 <String "email_taken">
	//  262  696:bipush          -18
	//  263  698:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  264  701:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  265  706:pop             
		errorCodes.put("user_denied", ((Object) (Integer.valueOf(-19))));
	//  266  707:getstatic       #141 <Field Map errorCodes>
	//  267  710:ldc1            #177 <String "user_denied">
	//  268  712:bipush          -19
	//  269  714:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  270  717:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  271  722:pop             
		errorCodes.put("invalid_credentials", ((Object) (Integer.valueOf(-20))));
	//  272  723:getstatic       #141 <Field Map errorCodes>
	//  273  726:ldc1            #179 <String "invalid_credentials">
	//  274  728:bipush          -20
	//  275  730:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  276  733:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  277  738:pop             
		errorCodes.put("invalid_arguments", ((Object) (Integer.valueOf(-21))));
	//  278  739:getstatic       #141 <Field Map errorCodes>
	//  279  742:ldc1            #181 <String "invalid_arguments">
	//  280  744:bipush          -21
	//  281  746:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  282  749:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  283  754:pop             
		errorCodes.put("provider_error", ((Object) (Integer.valueOf(-22))));
	//  284  755:getstatic       #141 <Field Map errorCodes>
	//  285  758:ldc1            #183 <String "provider_error">
	//  286  760:bipush          -22
	//  287  762:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  288  765:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  289  770:pop             
		errorCodes.put("limits_exceeded", ((Object) (Integer.valueOf(-23))));
	//  290  771:getstatic       #141 <Field Map errorCodes>
	//  291  774:ldc1            #185 <String "limits_exceeded">
	//  292  776:bipush          -23
	//  293  778:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  294  781:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  295  786:pop             
		errorCodes.put("network_error", ((Object) (Integer.valueOf(-24))));
	//  296  787:getstatic       #141 <Field Map errorCodes>
	//  297  790:ldc1            #187 <String "network_error">
	//  298  792:bipush          -24
	//  299  794:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  300  797:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  301  802:pop             
		errorCodes.put("write_canceled", ((Object) (Integer.valueOf(-25))));
	//  302  803:getstatic       #141 <Field Map errorCodes>
	//  303  806:ldc1            #189 <String "write_canceled">
	//  304  808:bipush          -25
	//  305  810:invokestatic    #81  <Method Integer Integer.valueOf(int)>
	//  306  813:invokeinterface #89  <Method Object Map.put(Object, Object)>
	//  307  818:pop             
	//* 308  819:return          
	}
}
