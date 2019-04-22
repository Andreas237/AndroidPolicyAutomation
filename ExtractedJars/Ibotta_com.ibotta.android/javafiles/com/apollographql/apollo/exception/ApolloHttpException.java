// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.exception;

import okhttp3.Response;

// Referenced classes of package com.apollographql.apollo.exception:
//			ApolloException

public final class ApolloHttpException extends ApolloException
{

	public ApolloHttpException(Response response)
	{
		super(formatMessage(response));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #17  <Method String formatMessage(Response)>
	//    3    5:invokespecial   #20  <Method void ApolloException(String)>
		int i;
		if(response != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          20
			i = response.code();
	//    6   12:aload_1         
	//    7   13:invokevirtual   #25  <Method int Response.code()>
	//    8   16:istore_2        
		else
	//*   9   17:goto            22
			i = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
		code = i;
	//   12   22:aload_0         
	//   13   23:iload_2         
	//   14   24:putfield        #27  <Field int code>
		String s;
		if(response != null)
	//*  15   27:aload_1         
	//*  16   28:ifnull          39
			s = response.message();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #30  <Method String Response.message()>
	//   19   35:astore_3        
		else
	//*  20   36:goto            42
			s = "";
	//   21   39:ldc1            #32  <String "">
	//   22   41:astore_3        
		message = s;
	//   23   42:aload_0         
	//   24   43:aload_3         
	//   25   44:putfield        #34  <Field String message>
		rawResponse = response;
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:putfield        #36  <Field Response rawResponse>
	//   29   52:return          
	}

	private static String formatMessage(Response response)
	{
		if(response == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
		{
			return "Empty HTTP response";
	//    2    4:ldc1            #40  <String "Empty HTTP response">
	//    3    6:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    7:new             #42  <Class StringBuilder>
	//    5   10:dup             
	//    6   11:invokespecial   #45  <Method void StringBuilder()>
	//    7   14:astore_1        
			stringbuilder.append("HTTP ");
	//    8   15:aload_1         
	//    9   16:ldc1            #47  <String "HTTP ">
	//   10   18:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
			stringbuilder.append(response.code());
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #25  <Method int Response.code()>
	//   15   27:invokevirtual   #54  <Method StringBuilder StringBuilder.append(int)>
	//   16   30:pop             
			stringbuilder.append(" ");
	//   17   31:aload_1         
	//   18   32:ldc1            #56  <String " ">
	//   19   34:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
			stringbuilder.append(response.message());
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:invokevirtual   #30  <Method String Response.message()>
	//   24   43:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
			return stringbuilder.toString();
	//   26   47:aload_1         
	//   27   48:invokevirtual   #59  <Method String StringBuilder.toString()>
	//   28   51:areturn         
		}
	}

	public Response rawResponse()
	{
		return rawResponse;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Response rawResponse>
	//    2    4:areturn         
	}

	private final int code;
	private final String message;
	private final transient Response rawResponse;
}
