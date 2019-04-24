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

	public final GraphResponse getGraphResponse()
	{
		return graphResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field GraphResponse graphResponse>
	//    2    4:areturn         
	}

	public final String toString()
	{
		FacebookRequestError facebookrequesterror;
		if(graphResponse != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field GraphResponse graphResponse>
	//*   2    4:ifnull          18
			facebookrequesterror = graphResponse.getError();
	//    3    7:aload_0         
	//    4    8:getfield        #13  <Field GraphResponse graphResponse>
	//    5   11:invokevirtual   #24  <Method FacebookRequestError GraphResponse.getError()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			facebookrequesterror = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   10   20:new             #26  <Class StringBuilder>
	//   11   23:dup             
	//   12   24:invokespecial   #29  <Method void StringBuilder()>
	//   13   27:astore_2        
		stringbuilder.append("{FacebookGraphResponseException: ");
	//   14   28:aload_2         
	//   15   29:ldc1            #31  <String "{FacebookGraphResponseException: ">
	//   16   31:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:pop             
		String s = getMessage();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #38  <Method String getMessage()>
	//   20   39:astore_3        
		if(s != null)
	//*  21   40:aload_3         
	//*  22   41:ifnull          57
		{
			stringbuilder.append(s);
	//   23   44:aload_2         
	//   24   45:aload_3         
	//   25   46:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			stringbuilder.append(" ");
	//   27   50:aload_2         
	//   28   51:ldc1            #40  <String " ">
	//   29   53:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
		}
		if(facebookrequesterror != null)
	//*  31   57:aload_1         
	//*  32   58:ifnull          132
		{
			stringbuilder.append("httpResponseCode: ");
	//   33   61:aload_2         
	//   34   62:ldc1            #42  <String "httpResponseCode: ">
	//   35   64:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   36   67:pop             
			stringbuilder.append(facebookrequesterror.getRequestStatusCode());
	//   37   68:aload_2         
	//   38   69:aload_1         
	//   39   70:invokevirtual   #48  <Method int FacebookRequestError.getRequestStatusCode()>
	//   40   73:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
	//   41   76:pop             
			stringbuilder.append(", facebookErrorCode: ");
	//   42   77:aload_2         
	//   43   78:ldc1            #53  <String ", facebookErrorCode: ">
	//   44   80:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   45   83:pop             
			stringbuilder.append(facebookrequesterror.getErrorCode());
	//   46   84:aload_2         
	//   47   85:aload_1         
	//   48   86:invokevirtual   #56  <Method int FacebookRequestError.getErrorCode()>
	//   49   89:invokevirtual   #51  <Method StringBuilder StringBuilder.append(int)>
	//   50   92:pop             
			stringbuilder.append(", facebookErrorType: ");
	//   51   93:aload_2         
	//   52   94:ldc1            #58  <String ", facebookErrorType: ">
	//   53   96:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   54   99:pop             
			stringbuilder.append(facebookrequesterror.getErrorType());
	//   55  100:aload_2         
	//   56  101:aload_1         
	//   57  102:invokevirtual   #61  <Method String FacebookRequestError.getErrorType()>
	//   58  105:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   59  108:pop             
			stringbuilder.append(", message: ");
	//   60  109:aload_2         
	//   61  110:ldc1            #63  <String ", message: ">
	//   62  112:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   63  115:pop             
			stringbuilder.append(facebookrequesterror.getErrorMessage());
	//   64  116:aload_2         
	//   65  117:aload_1         
	//   66  118:invokevirtual   #66  <Method String FacebookRequestError.getErrorMessage()>
	//   67  121:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   68  124:pop             
			stringbuilder.append("}");
	//   69  125:aload_2         
	//   70  126:ldc1            #68  <String "}">
	//   71  128:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   72  131:pop             
		}
		return stringbuilder.toString();
	//   73  132:aload_2         
	//   74  133:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   75  136:areturn         
	}

	private final GraphResponse graphResponse;
}
