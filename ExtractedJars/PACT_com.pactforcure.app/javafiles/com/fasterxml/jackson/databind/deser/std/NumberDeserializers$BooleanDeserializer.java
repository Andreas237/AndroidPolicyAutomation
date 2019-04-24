// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static final class NumberDeserializers$BooleanDeserializer extends serializer
{

	public Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _parseBoolean(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #49  <Method Boolean _parseBoolean(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #55  <Method Boolean deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return _parseBoolean(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #49  <Method Boolean _parseBoolean(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #60  <Method Boolean deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	static final NumberDeserializers$BooleanDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$BooleanDeserializer wrapperInstance = new NumberDeserializers$BooleanDeserializer(java/lang/Boolean, ((Boolean) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$BooleanDeserializer(Boolean.TYPE, Boolean.FALSE);
	//    0    0:new             #2   <Class NumberDeserializers$BooleanDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Boolean.TYPE>
	//    3    7:getstatic       #28  <Field Boolean Boolean.FALSE>
	//    4   10:invokespecial   #32  <Method void NumberDeserializers$BooleanDeserializer(Class, Boolean)>
	//    5   13:putstatic       #34  <Field NumberDeserializers$BooleanDeserializer primitiveInstance>
	//    6   16:new             #2   <Class NumberDeserializers$BooleanDeserializer>
	//    7   19:dup             
	//    8   20:ldc1            #20  <Class Boolean>
	//    9   22:aconst_null     
	//   10   23:invokespecial   #32  <Method void NumberDeserializers$BooleanDeserializer(Class, Boolean)>
	//   11   26:putstatic       #36  <Field NumberDeserializers$BooleanDeserializer wrapperInstance>
	//*  12   29:return          
	}

	public NumberDeserializers$BooleanDeserializer(Class class1, Boolean boolean1)
	{
		super(class1, ((Object) (boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
	//    4    6:return          
	}
}
