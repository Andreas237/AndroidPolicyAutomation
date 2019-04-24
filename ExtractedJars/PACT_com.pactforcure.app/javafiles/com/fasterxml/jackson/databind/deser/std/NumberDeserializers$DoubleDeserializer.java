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

public static class NumberDeserializers$DoubleDeserializer extends eserializer
{

	public Double deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return _parseDouble(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #49  <Method Double _parseDouble(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #55  <Method Double deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public Double deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException
	{
		return _parseDouble(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #49  <Method Double _parseDouble(JsonParser, DeserializationContext)>
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
	//    4    4:invokevirtual   #60  <Method Double deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    5    7:areturn         
	}

	static final NumberDeserializers$DoubleDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$DoubleDeserializer wrapperInstance = new NumberDeserializers$DoubleDeserializer(java/lang/Double, ((Double) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$DoubleDeserializer(Double.TYPE, Double.valueOf(0.0D));
	//    0    0:new             #2   <Class NumberDeserializers$DoubleDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Double.TYPE>
	//    3    7:dconst_0        
	//    4    8:invokestatic    #28  <Method Double Double.valueOf(double)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$DoubleDeserializer(Class, Double)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$DoubleDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$DoubleDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Double>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$DoubleDeserializer(Class, Double)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$DoubleDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$DoubleDeserializer(Class class1, Double double1)
	{
		super(class1, ((Object) (double1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
	//    4    6:return          
	}
}
