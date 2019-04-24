// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.internal.config;


public class HttpClientConfig
{

	HttpClientConfig(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field String a>
	//    5    9:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #18  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("serviceName: ");
	//    4    8:aload_1         
	//    5    9:ldc1            #21  <String "serviceName: ">
	//    6   11:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a);
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #13  <Field String a>
	//   11   20:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		return stringbuilder.toString();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #27  <Method String StringBuilder.toString()>
	//   15   28:areturn         
	}

	private final String a;
}
