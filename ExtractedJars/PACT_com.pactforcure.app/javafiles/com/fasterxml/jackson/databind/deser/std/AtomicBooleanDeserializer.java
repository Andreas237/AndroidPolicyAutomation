// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer

public class AtomicBooleanDeserializer extends StdScalarDeserializer
{

	public AtomicBooleanDeserializer()
	{
		super(java/util/concurrent/atomic/AtomicBoolean);
	//    0    0:aload_0         
	//    1    1:ldc1            #13  <Class AtomicBoolean>
	//    2    3:invokespecial   #16  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #26  <Method AtomicBoolean deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	public AtomicBoolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return new AtomicBoolean(_parseBooleanPrimitive(jsonparser, deserializationcontext));
	//    0    0:new             #13  <Class AtomicBoolean>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #31  <Method boolean _parseBooleanPrimitive(JsonParser, DeserializationContext)>
	//    6   10:invokespecial   #34  <Method void AtomicBoolean(boolean)>
	//    7   13:areturn         
	}

	private static final long serialVersionUID = 1L;
}
