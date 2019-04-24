// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class StdScalarDeserializer extends StdDeserializer
{

	protected StdScalarDeserializer(JavaType javatype)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void StdDeserializer(JavaType)>
	//    3    5:return          
	}

	protected StdScalarDeserializer(StdScalarDeserializer stdscalardeserializer)
	{
		super(((StdDeserializer) (stdscalardeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void StdDeserializer(StdDeserializer)>
	//    3    5:return          
	}

	protected StdScalarDeserializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void StdDeserializer(Class)>
	//    3    5:return          
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #34  <Method Object TypeDeserializer.deserializeTypedFromScalar(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	private static final long serialVersionUID = 1L;
}
