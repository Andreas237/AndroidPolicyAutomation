// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdKeyDeserializer

static final class StdKeyDeserializer$StringKD extends StdKeyDeserializer
{

	public static StdKeyDeserializer$StringKD forType(Class class1)
	{
		if(class1 == java/lang/String)
	//*   0    0:aload_0         
	//*   1    1:ldc1            #17  <Class String>
	//*   2    3:if_acmpne       10
			return sString;
	//    3    6:getstatic       #23  <Field StdKeyDeserializer$StringKD sString>
	//    4    9:areturn         
		if(class1 == java/lang/Object)
	//*   5   10:aload_0         
	//*   6   11:ldc1            #25  <Class Object>
	//*   7   13:if_acmpne       20
			return sObject;
	//    8   16:getstatic       #27  <Field StdKeyDeserializer$StringKD sObject>
	//    9   19:areturn         
		else
			return new StdKeyDeserializer$StringKD(class1);
	//   10   20:new             #2   <Class StdKeyDeserializer$StringKD>
	//   11   23:dup             
	//   12   24:aload_0         
	//   13   25:invokespecial   #21  <Method void StdKeyDeserializer$StringKD(Class)>
	//   14   28:areturn         
	}

	public Object deserializeKey(String s, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (s));
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	private static final StdKeyDeserializer$StringKD sObject = new StdKeyDeserializer$StringKD(java/lang/Object);
	private static final StdKeyDeserializer$StringKD sString = new StdKeyDeserializer$StringKD(java/lang/String);
	private static final long serialVersionUID = 1L;

	static 
	{
	//    0    0:new             #2   <Class StdKeyDeserializer$StringKD>
	//    1    3:dup             
	//    2    4:ldc1            #17  <Class String>
	//    3    6:invokespecial   #21  <Method void StdKeyDeserializer$StringKD(Class)>
	//    4    9:putstatic       #23  <Field StdKeyDeserializer$StringKD sString>
	//    5   12:new             #2   <Class StdKeyDeserializer$StringKD>
	//    6   15:dup             
	//    7   16:ldc1            #25  <Class Object>
	//    8   18:invokespecial   #21  <Method void StdKeyDeserializer$StringKD(Class)>
	//    9   21:putstatic       #27  <Field StdKeyDeserializer$StringKD sObject>
	//*  10   24:return          
	}

	private StdKeyDeserializer$StringKD(Class class1)
	{
		super(-1, class1);
	//    0    0:aload_0         
	//    1    1:iconst_m1       
	//    2    2:aload_1         
	//    3    3:invokespecial   #31  <Method void StdKeyDeserializer(int, Class)>
	//    4    6:return          
	}
}
