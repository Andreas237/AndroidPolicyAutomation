// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;


// Referenced classes of package com.firebase.client.utilities:
//			HttpUtilities

public static final class HttpUtilities$HttpRequestType extends Enum
{

	public static HttpUtilities$HttpRequestType valueOf(String s)
	{
		return (HttpUtilities$HttpRequestType)Enum.valueOf(com/firebase/client/utilities/HttpUtilities$HttpRequestType, s);
	//    0    0:ldc1            #2   <Class HttpUtilities$HttpRequestType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class HttpUtilities$HttpRequestType>
	//    4    9:areturn         
	}

	public static HttpUtilities$HttpRequestType[] values()
	{
		return (HttpUtilities$HttpRequestType[])((HttpUtilities$HttpRequestType []) ($VALUES)).clone();
	//    0    0:getstatic       #35  <Field HttpUtilities$HttpRequestType[] $VALUES>
	//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.firebase.client.utilities.HttpUtilities$HttpRequestType_3B_.clone()>
	//    2    6:checkcast       #46  <Class HttpUtilities$HttpRequestType[]>
	//    3    9:areturn         
	}

	private static final HttpUtilities$HttpRequestType $VALUES[];
	public static final HttpUtilities$HttpRequestType DELETE;
	public static final HttpUtilities$HttpRequestType GET;
	public static final HttpUtilities$HttpRequestType POST;
	public static final HttpUtilities$HttpRequestType PUT;

	static 
	{
		GET = new HttpUtilities$HttpRequestType("GET", 0);
	//    0    0:new             #2   <Class HttpUtilities$HttpRequestType>
	//    1    3:dup             
	//    2    4:ldc1            #18  <String "GET">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #22  <Method void HttpUtilities$HttpRequestType(String, int)>
	//    5   10:putstatic       #24  <Field HttpUtilities$HttpRequestType GET>
		POST = new HttpUtilities$HttpRequestType("POST", 1);
	//    6   13:new             #2   <Class HttpUtilities$HttpRequestType>
	//    7   16:dup             
	//    8   17:ldc1            #25  <String "POST">
	//    9   19:iconst_1        
	//   10   20:invokespecial   #22  <Method void HttpUtilities$HttpRequestType(String, int)>
	//   11   23:putstatic       #27  <Field HttpUtilities$HttpRequestType POST>
		DELETE = new HttpUtilities$HttpRequestType("DELETE", 2);
	//   12   26:new             #2   <Class HttpUtilities$HttpRequestType>
	//   13   29:dup             
	//   14   30:ldc1            #28  <String "DELETE">
	//   15   32:iconst_2        
	//   16   33:invokespecial   #22  <Method void HttpUtilities$HttpRequestType(String, int)>
	//   17   36:putstatic       #30  <Field HttpUtilities$HttpRequestType DELETE>
		PUT = new HttpUtilities$HttpRequestType("PUT", 3);
	//   18   39:new             #2   <Class HttpUtilities$HttpRequestType>
	//   19   42:dup             
	//   20   43:ldc1            #31  <String "PUT">
	//   21   45:iconst_3        
	//   22   46:invokespecial   #22  <Method void HttpUtilities$HttpRequestType(String, int)>
	//   23   49:putstatic       #33  <Field HttpUtilities$HttpRequestType PUT>
		$VALUES = (new HttpUtilities$HttpRequestType[] {
			GET, POST, DELETE, PUT
		});
	//   24   52:iconst_4        
	//   25   53:anewarray       HttpUtilities$HttpRequestType[]
	//   26   56:dup             
	//   27   57:iconst_0        
	//   28   58:getstatic       #24  <Field HttpUtilities$HttpRequestType GET>
	//   29   61:aastore         
	//   30   62:dup             
	//   31   63:iconst_1        
	//   32   64:getstatic       #27  <Field HttpUtilities$HttpRequestType POST>
	//   33   67:aastore         
	//   34   68:dup             
	//   35   69:iconst_2        
	//   36   70:getstatic       #30  <Field HttpUtilities$HttpRequestType DELETE>
	//   37   73:aastore         
	//   38   74:dup             
	//   39   75:iconst_3        
	//   40   76:getstatic       #33  <Field HttpUtilities$HttpRequestType PUT>
	//   41   79:aastore         
	//   42   80:putstatic       #35  <Field HttpUtilities$HttpRequestType[] $VALUES>
	//*  43   83:return          
	}

	private HttpUtilities$HttpRequestType(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #37  <Method void Enum(String, int)>
	//    4    6:return          
	}
}
