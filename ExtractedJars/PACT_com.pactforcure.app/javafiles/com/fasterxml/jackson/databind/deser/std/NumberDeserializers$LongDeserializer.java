// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			NumberDeserializers

public static final class NumberDeserializers$LongDeserializer extends rDeserializer
{

	public Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.hasToken(JsonToken.VALUE_NUMBER_INT))
	//*   0    0:aload_1         
	//*   1    1:getstatic       #52  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   2    4:invokevirtual   #58  <Method boolean JsonParser.hasToken(JsonToken)>
	//*   3    7:ifeq            18
			return Long.valueOf(jsonparser.getLongValue());
	//    4   10:aload_1         
	//    5   11:invokevirtual   #62  <Method long JsonParser.getLongValue()>
	//    6   14:invokestatic    #28  <Method Long Long.valueOf(long)>
	//    7   17:areturn         
		else
			return _parseLong(jsonparser, deserializationcontext);
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #65  <Method Long _parseLong(JsonParser, DeserializationContext)>
	//   12   24:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #71  <Method Long deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public boolean isCachable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	static final NumberDeserializers$LongDeserializer primitiveInstance;
	private static final long serialVersionUID = 1L;
	static final NumberDeserializers$LongDeserializer wrapperInstance = new NumberDeserializers$LongDeserializer(java/lang/Long, ((Long) (null)));

	static 
	{
		primitiveInstance = new NumberDeserializers$LongDeserializer(Long.TYPE, Long.valueOf(0L));
	//    0    0:new             #2   <Class NumberDeserializers$LongDeserializer>
	//    1    3:dup             
	//    2    4:getstatic       #24  <Field Class Long.TYPE>
	//    3    7:lconst_0        
	//    4    8:invokestatic    #28  <Method Long Long.valueOf(long)>
	//    5   11:invokespecial   #32  <Method void NumberDeserializers$LongDeserializer(Class, Long)>
	//    6   14:putstatic       #34  <Field NumberDeserializers$LongDeserializer primitiveInstance>
	//    7   17:new             #2   <Class NumberDeserializers$LongDeserializer>
	//    8   20:dup             
	//    9   21:ldc1            #20  <Class Long>
	//   10   23:aconst_null     
	//   11   24:invokespecial   #32  <Method void NumberDeserializers$LongDeserializer(Class, Long)>
	//   12   27:putstatic       #36  <Field NumberDeserializers$LongDeserializer wrapperInstance>
	//*  13   30:return          
	}

	public NumberDeserializers$LongDeserializer(Class class1, Long long1)
	{
		super(class1, ((Object) (long1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #40  <Method void NumberDeserializers$PrimitiveOrWrapperDeserializer(Class, Object)>
	//    4    6:return          
	}
}
