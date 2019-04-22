// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			FacebookException, FacebookRequestError

public class FacebookServiceException extends FacebookException
{

	public FacebookServiceException(FacebookRequestError facebookrequesterror, String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #15  <Method void FacebookException(String)>
		error = facebookrequesterror;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #17  <Field FacebookRequestError error>
	//    6   10:return          
	}

	public final FacebookRequestError getRequestError()
	{
		return error;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field FacebookRequestError error>
	//    2    4:areturn         
	}

	public final String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #24  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("{FacebookServiceException: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #29  <String "{FacebookServiceException: ">
	//    6   11:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("httpResponseCode: ");
	//    8   15:aload_1         
	//    9   16:ldc1            #35  <String "httpResponseCode: ">
	//   10   18:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(error.getRequestStatusCode());
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #17  <Field FacebookRequestError error>
	//   15   27:invokevirtual   #41  <Method int FacebookRequestError.getRequestStatusCode()>
	//   16   30:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   17   33:pop             
		stringbuilder.append(", facebookErrorCode: ");
	//   18   34:aload_1         
	//   19   35:ldc1            #46  <String ", facebookErrorCode: ">
	//   20   37:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
		stringbuilder.append(error.getErrorCode());
	//   22   41:aload_1         
	//   23   42:aload_0         
	//   24   43:getfield        #17  <Field FacebookRequestError error>
	//   25   46:invokevirtual   #49  <Method int FacebookRequestError.getErrorCode()>
	//   26   49:invokevirtual   #44  <Method StringBuilder StringBuilder.append(int)>
	//   27   52:pop             
		stringbuilder.append(", facebookErrorType: ");
	//   28   53:aload_1         
	//   29   54:ldc1            #51  <String ", facebookErrorType: ">
	//   30   56:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   31   59:pop             
		stringbuilder.append(error.getErrorType());
	//   32   60:aload_1         
	//   33   61:aload_0         
	//   34   62:getfield        #17  <Field FacebookRequestError error>
	//   35   65:invokevirtual   #54  <Method String FacebookRequestError.getErrorType()>
	//   36   68:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   37   71:pop             
		stringbuilder.append(", message: ");
	//   38   72:aload_1         
	//   39   73:ldc1            #56  <String ", message: ">
	//   40   75:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   41   78:pop             
		stringbuilder.append(error.getErrorMessage());
	//   42   79:aload_1         
	//   43   80:aload_0         
	//   44   81:getfield        #17  <Field FacebookRequestError error>
	//   45   84:invokevirtual   #59  <Method String FacebookRequestError.getErrorMessage()>
	//   46   87:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
		stringbuilder.append("}");
	//   48   91:aload_1         
	//   49   92:ldc1            #61  <String "}">
	//   50   94:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   51   97:pop             
		return stringbuilder.toString();
	//   52   98:aload_1         
	//   53   99:invokevirtual   #63  <Method String StringBuilder.toString()>
	//   54  102:areturn         
	}

	private static final long serialVersionUID = 1L;
	private final FacebookRequestError error;
}
