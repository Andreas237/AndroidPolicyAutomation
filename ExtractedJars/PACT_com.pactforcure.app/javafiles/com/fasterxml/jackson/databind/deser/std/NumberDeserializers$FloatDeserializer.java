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

public static class NumberDeserializers$FloatDeserializer extends Deserializer
{

	public Float deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _parseFloat(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #49  <Method Float _parseFloat(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #55  <Method Float deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	static final NumberDeserializers$FloatDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$FloatDeserializer wrapperInstance = new NumberDeserializers$FloatDeserializer(java/lang/Float, ((Float) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$FloatDeserializer(Float.TYPE, Float.valueOf(0.0F));
	//    0    0:new             #2   <Class NumberDeserializers$FloatDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Float.TYPE>
	//    3    7:fconst_0        
	//    4    8:invokestatic    #28  <Method Float Float.valueOf(float)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$FloatDeserializer(Class, Float)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$FloatDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$FloatDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Float>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$FloatDeserializer(Class, Float)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$FloatDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$FloatDeserializer(Class class1, Float float1)
	{
		super(class1, ((Object) (float1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
	//    4    6:return          
	}
}
