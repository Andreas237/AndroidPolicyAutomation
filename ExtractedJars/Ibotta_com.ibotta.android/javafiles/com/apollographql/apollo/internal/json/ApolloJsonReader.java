// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;


// Referenced classes of package com.apollographql.apollo.internal.json:
//			ResponseJsonStreamReader, BufferedSourceJsonReader

public final class ApolloJsonReader
{

	public static ResponseJsonStreamReader responseJsonStreamReader(BufferedSourceJsonReader bufferedsourcejsonreader)
	{
		return new ResponseJsonStreamReader(((JsonReader) (bufferedsourcejsonreader)));
	//    0    0:new             #8   <Class ResponseJsonStreamReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #12  <Method void ResponseJsonStreamReader(JsonReader)>
	//    4    8:areturn         
	}
}
