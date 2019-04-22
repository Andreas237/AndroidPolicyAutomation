// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;


// Referenced classes of package com.facebook:
//			FacebookException, GraphResponse, FacebookRequestError

public class FacebookGraphResponseException extends FacebookException
{

	public FacebookGraphResponseException(GraphResponse graphresponse, String s)
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #11  <Method void FacebookException(String)>
		graphResponse = graphresponse;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #13  <Field GraphResponse graphResponse>
	//    6   10:return          
	}

	public final String toString()
	{
		Object obj = ((Object) (graphResponse));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field GraphResponse graphResponse>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          17
			obj = ((Object) (((GraphResponse) (obj)).getError()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #22  <Method FacebookRequestError GraphResponse.getError()>
	//    7   13:astore_1        
		else
	//*   8   14:goto            19
			obj = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   11   19:new             #24  <Class StringBuilder>
	//   12   22:dup             
	//   13   23:invokespecial   #27  <Method void StringBuilder()>
	//   14   26:astore_2        
		stringbuilder.append("{FacebookGraphResponseException: ");
	//   15   27:aload_2         
	//   16   28:ldc1            #29  <String "{FacebookGraphResponseException: ">
	//   17   30:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
		String s = getMessage();
	//   19   34:aload_0         
	//   20   35:invokevirtual   #36  <Method String getMessage()>
	//   21   38:astore_3        
		if(s != null)
	//*  22   39:aload_3         
	//*  23   40:ifnull          56
		{
			stringbuilder.append(s);
	//   24   43:aload_2         
	//   25   44:aload_3         
	//   26   45:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   27   48:pop             
			stringbuilder.append(" ");
	//   28   49:aload_2         
	//   29   50:ldc1            #38  <String " ">
	//   30   52:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   31   55:pop             
		}
		if(obj != null)
	//*  32   56:aload_1         
	//*  33   57:ifnull          131
		{
			stringbuilder.append("httpResponseCode: ");
	//   34   60:aload_2         
	//   35   61:ldc1            #40  <String "httpResponseCode: ">
	//   36   63:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   37   66:pop             
			stringbuilder.append(((FacebookRequestError) (obj)).getRequestStatusCode());
	//   38   67:aload_2         
	//   39   68:aload_1         
	//   40   69:invokevirtual   #46  <Method int FacebookRequestError.getRequestStatusCode()>
	//   41   72:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   42   75:pop             
			stringbuilder.append(", facebookErrorCode: ");
	//   43   76:aload_2         
	//   44   77:ldc1            #51  <String ", facebookErrorCode: ">
	//   45   79:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   46   82:pop             
			stringbuilder.append(((FacebookRequestError) (obj)).getErrorCode());
	//   47   83:aload_2         
	//   48   84:aload_1         
	//   49   85:invokevirtual   #54  <Method int FacebookRequestError.getErrorCode()>
	//   50   88:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   51   91:pop             
			stringbuilder.append(", facebookErrorType: ");
	//   52   92:aload_2         
	//   53   93:ldc1            #56  <String ", facebookErrorType: ">
	//   54   95:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   55   98:pop             
			stringbuilder.append(((FacebookRequestError) (obj)).getErrorType());
	//   56   99:aload_2         
	//   57  100:aload_1         
	//   58  101:invokevirtual   #59  <Method String FacebookRequestError.getErrorType()>
	//   59  104:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   60  107:pop             
			stringbuilder.append(", message: ");
	//   61  108:aload_2         
	//   62  109:ldc1            #61  <String ", message: ">
	//   63  111:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   64  114:pop             
			stringbuilder.append(((FacebookRequestError) (obj)).getErrorMessage());
	//   65  115:aload_2         
	//   66  116:aload_1         
	//   67  117:invokevirtual   #64  <Method String FacebookRequestError.getErrorMessage()>
	//   68  120:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   69  123:pop             
			stringbuilder.append("}");
	//   70  124:aload_2         
	//   71  125:ldc1            #66  <String "}">
	//   72  127:invokevirtual   #33  <Method StringBuilder StringBuilder.append(String)>
	//   73  130:pop             
		}
		return stringbuilder.toString();
	//   74  131:aload_2         
	//   75  132:invokevirtual   #68  <Method String StringBuilder.toString()>
	//   76  135:areturn         
	}

	private final GraphResponse graphResponse;
}
