// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class StdScalarDeserializer extends StdDeserializer
{

	protected StdScalarDeserializer(StdScalarDeserializer stdscalardeserializer)
	{
		super(((StdDeserializer) (stdscalardeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void StdDeserializer(StdDeserializer)>
	//    3    5:return          
	}

	protected StdScalarDeserializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method void StdDeserializer(Class)>
	//    3    5:return          
	}

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
		throws IOException
	{
		deserializationcontext.reportBadMerge(((com.fasterxml.jackson.databind.JsonDeserializer) (this)));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #31  <Method Object DeserializationContext.reportBadMerge(com.fasterxml.jackson.databind.JsonDeserializer)>
	//    3    5:pop             
		return deserialize(jsonparser, deserializationcontext);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #34  <Method Object deserialize(JsonParser, DeserializationContext)>
	//    8   12:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #43  <Method Object TypeDeserializer.deserializeTypedFromScalar(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public AccessPattern getEmptyAccessPattern()
	{
		return AccessPattern.CONSTANT;
	//    0    0:getstatic       #51  <Field AccessPattern AccessPattern.CONSTANT>
	//    1    3:areturn         
	}

	public AccessPattern getNullAccessPattern()
	{
		return AccessPattern.ALWAYS_NULL;
	//    0    0:getstatic       #55  <Field AccessPattern AccessPattern.ALWAYS_NULL>
	//    1    3:areturn         
	}

	public Boolean supportsUpdate(DeserializationConfig deserializationconfig)
	{
		return Boolean.FALSE;
	//    0    0:getstatic       #63  <Field Boolean Boolean.FALSE>
	//    1    3:areturn         
	}

	private static final long serialVersionUID = 1L;
}
