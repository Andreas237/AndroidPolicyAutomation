// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static final class NumberDeserializers$IntegerDeserializer extends serializer
{

	public Integer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #52  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #58  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            18
			return Integer.valueOf(jsonparser.getIntValue());
	//    4   10:aload_1         
	//    5   11:invokevirtual   #62  <Method int JsonParser.getIntValue()>
	//    6   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    7   17:areturn         
		else
			return _parseInteger(jsonparser, deserializationcontext);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #65  <Method Integer _parseInteger(JsonParser, DeserializationContext)>
	//   12   24:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #71  <Method Integer deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Integer deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #52  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #58  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            18
			return Integer.valueOf(jsonparser.getIntValue());
	//    4   10:aload_1         
	//    5   11:invokevirtual   #62  <Method int JsonParser.getIntValue()>
	//    6   14:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    7   17:areturn         
		else
			return _parseInteger(jsonparser, deserializationcontext);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #65  <Method Integer _parseInteger(JsonParser, DeserializationContext)>
	//   12   24:areturn         
	}

	public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return ((Object) (deserializeWithType(jsonparser, deserializationcontext, typedeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #76  <Method Integer deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	static final NumberDeserializers$IntegerDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$IntegerDeserializer wrapperInstance = new NumberDeserializers$IntegerDeserializer(java/lang/Integer, ((Integer) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$IntegerDeserializer(Integer.TYPE, Integer.valueOf(0));
	//    0    0:new             #2   <Class NumberDeserializers$IntegerDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Integer.TYPE>
	//    3    7:iconst_0        
	//    4    8:invokestatic    #28  <Method Integer Integer.valueOf(int)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$IntegerDeserializer(Class, Integer)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$IntegerDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$IntegerDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Integer>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$IntegerDeserializer(Class, Integer)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$IntegerDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$IntegerDeserializer(Class class1, Integer integer)
	{
		super(class1, ((Object) (integer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
	//    4    6:return          
	}
}
