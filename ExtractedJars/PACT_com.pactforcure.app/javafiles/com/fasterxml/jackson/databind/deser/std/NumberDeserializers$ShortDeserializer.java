// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static class NumberDeserializers$ShortDeserializer extends Deserializer
{

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #51  <Method Short deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _parseShort(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #55  <Method Short _parseShort(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	static final NumberDeserializers$ShortDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$ShortDeserializer wrapperInstance = new NumberDeserializers$ShortDeserializer(java/lang/Short, ((Short) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$ShortDeserializer(Short.TYPE, Short.valueOf((short)0));
	//    0    0:new             #2   <Class NumberDeserializers$ShortDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Short.TYPE>
	//    3    7:iconst_0        
	//    4    8:invokestatic    #28  <Method Short Short.valueOf(short)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$ShortDeserializer(Class, Short)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$ShortDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$ShortDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Short>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$ShortDeserializer(Class, Short)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$ShortDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$ShortDeserializer(Class class1, Short short1)
	{
		super(class1, ((Object) (short1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
	//    4    6:return          
	}
}
