// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import com.twitter.sdk.android.core.TwitterApiException;
import com.twitter.sdk.android.core.TwitterException;
import retrofit.RetrofitError;

// Referenced classes of package com.digits.sdk.android:
//			AuthConfig, ErrorCodes, CouldNotAuthenticateException, OperatorUnsupportedException, 
//			UnrecoverableException

public class DigitsException extends RuntimeException
{

	DigitsException(String s)
	{
		this(s, -1, new AuthConfig());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:new             #12  <Class AuthConfig>
	//    4    6:dup             
	//    5    7:invokespecial   #15  <Method void AuthConfig()>
	//    6   10:invokespecial   #18  <Method void DigitsException(String, int, AuthConfig)>
	//    7   13:return          
	}

	DigitsException(String s, int i, AuthConfig authconfig)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #22  <Method void RuntimeException(String)>
		errorCode = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int errorCode>
		config = authconfig;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field AuthConfig config>
	//    9   15:return          
	}

	static DigitsException create(ErrorCodes errorcodes, TwitterException twitterexception)
	{
		if(twitterexception instanceof TwitterApiException)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #31  <Class TwitterApiException>
	//*   2    4:ifeq            39
		{
			twitterexception = ((TwitterException) ((TwitterApiException)twitterexception));
	//    3    7:aload_1         
	//    4    8:checkcast       #31  <Class TwitterApiException>
	//    5   11:astore_1        
			errorcodes = ((ErrorCodes) (getMessageForApiError(errorcodes, ((TwitterApiException) (twitterexception)))));
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #35  <Method String getMessageForApiError(ErrorCodes, TwitterApiException)>
	//    9   17:astore_0        
			return createException(((TwitterApiException) (twitterexception)).getErrorCode(), ((String) (errorcodes)), (AuthConfig)((TwitterApiException) (twitterexception)).getRetrofitError().getBodyAs(com/digits/sdk/android/AuthConfig));
	//   10   18:aload_1         
	//   11   19:invokevirtual   #39  <Method int TwitterApiException.getErrorCode()>
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #43  <Method RetrofitError TwitterApiException.getRetrofitError()>
	//   15   27:ldc1            #12  <Class AuthConfig>
	//   16   29:invokevirtual   #49  <Method Object RetrofitError.getBodyAs(java.lang.reflect.Type)>
	//   17   32:checkcast       #12  <Class AuthConfig>
	//   18   35:invokestatic    #53  <Method DigitsException createException(int, String, AuthConfig)>
	//   19   38:areturn         
		} else
		{
			return new DigitsException(errorcodes.getDefaultMessage());
	//   20   39:new             #2   <Class DigitsException>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:invokeinterface #59  <Method String ErrorCodes.getDefaultMessage()>
	//   24   49:invokespecial   #60  <Method void DigitsException(String)>
	//   25   52:areturn         
		}
	}

	private static DigitsException createException(int i, String s, AuthConfig authconfig)
	{
		if(i == 32)
	//*   0    0:iload_0         
	//*   1    1:bipush          32
	//*   2    3:icmpne          17
			return ((DigitsException) (new CouldNotAuthenticateException(s, i, authconfig)));
	//    3    6:new             #62  <Class CouldNotAuthenticateException>
	//    4    9:dup             
	//    5   10:aload_1         
	//    6   11:iload_0         
	//    7   12:aload_2         
	//    8   13:invokespecial   #63  <Method void CouldNotAuthenticateException(String, int, AuthConfig)>
	//    9   16:areturn         
		if(i == 286)
	//*  10   17:iload_0         
	//*  11   18:sipush          286
	//*  12   21:icmpne          35
			return ((DigitsException) (new OperatorUnsupportedException(s, i, authconfig)));
	//   13   24:new             #65  <Class OperatorUnsupportedException>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:iload_0         
	//   17   30:aload_2         
	//   18   31:invokespecial   #66  <Method void OperatorUnsupportedException(String, int, AuthConfig)>
	//   19   34:areturn         
		if(isUnrecoverable(i))
	//*  20   35:iload_0         
	//*  21   36:invokestatic    #70  <Method boolean isUnrecoverable(int)>
	//*  22   39:ifeq            53
			return ((DigitsException) (new UnrecoverableException(s, i, authconfig)));
	//   23   42:new             #72  <Class UnrecoverableException>
	//   24   45:dup             
	//   25   46:aload_1         
	//   26   47:iload_0         
	//   27   48:aload_2         
	//   28   49:invokespecial   #73  <Method void UnrecoverableException(String, int, AuthConfig)>
	//   29   52:areturn         
		else
			return new DigitsException(s, i, authconfig);
	//   30   53:new             #2   <Class DigitsException>
	//   31   56:dup             
	//   32   57:aload_1         
	//   33   58:iload_0         
	//   34   59:aload_2         
	//   35   60:invokespecial   #18  <Method void DigitsException(String, int, AuthConfig)>
	//   36   63:areturn         
	}

	private static String getMessageForApiError(ErrorCodes errorcodes, TwitterApiException twitterapiexception)
	{
		if(twitterapiexception.getRetrofitError().isNetworkError())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #43  <Method RetrofitError TwitterApiException.getRetrofitError()>
	//*   2    4:invokevirtual   #77  <Method boolean RetrofitError.isNetworkError()>
	//*   3    7:ifeq            17
			return errorcodes.getNetworkError();
	//    4   10:aload_0         
	//    5   11:invokeinterface #80  <Method String ErrorCodes.getNetworkError()>
	//    6   16:areturn         
		else
			return errorcodes.getMessage(twitterapiexception.getErrorCode());
	//    7   17:aload_0         
	//    8   18:aload_1         
	//    9   19:invokevirtual   #39  <Method int TwitterApiException.getErrorCode()>
	//   10   22:invokeinterface #84  <Method String ErrorCodes.getMessage(int)>
	//   11   27:areturn         
	}

	private static boolean isUnrecoverable(int i)
	{
		return i == 269 || i == 235 || i == 237 || i == 299 || i == 284;
	//    0    0:iload_0         
	//    1    1:sipush          269
	//    2    4:icmpeq          40
	//    3    7:iload_0         
	//    4    8:sipush          235
	//    5   11:icmpeq          40
	//    6   14:iload_0         
	//    7   15:sipush          237
	//    8   18:icmpeq          40
	//    9   21:iload_0         
	//   10   22:sipush          299
	//   11   25:icmpeq          40
	//   12   28:iload_0         
	//   13   29:sipush          284
	//   14   32:icmpne          38
	//   15   35:goto            40
	//   16   38:iconst_0        
	//   17   39:ireturn         
	//   18   40:iconst_1        
	//   19   41:ireturn         
	}

	public AuthConfig getConfig()
	{
		return config;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field AuthConfig config>
	//    2    4:areturn         
	}

	public int getErrorCode()
	{
		return errorCode;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int errorCode>
	//    2    4:ireturn         
	}

	private final AuthConfig config;
	private final int errorCode;
}
