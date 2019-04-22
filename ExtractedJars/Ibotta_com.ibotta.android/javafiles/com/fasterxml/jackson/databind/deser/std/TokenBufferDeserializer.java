// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdScalarDeserializer

public class TokenBufferDeserializer extends StdScalarDeserializer
{

	public TokenBufferDeserializer()
	{
		super(com/fasterxml/jackson/databind/util/TokenBuffer);
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <Class TokenBuffer>
	//    2    3:invokespecial   #17  <Method void StdScalarDeserializer(Class)>
	//    3    6:return          
	}

	protected TokenBuffer createBufferInstance(JsonParser jsonparser)
	{
		return new TokenBuffer(jsonparser);
	//    0    0:new             #14  <Class TokenBuffer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #23  <Method void TokenBuffer(JsonParser)>
	//    4    8:areturn         
	}

	public TokenBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return createBufferInstance(jsonparser).deserialize(jsonparser, deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #29  <Method TokenBuffer createBufferInstance(JsonParser)>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #31  <Method TokenBuffer TokenBuffer.deserialize(JsonParser, DeserializationContext)>
	//    6   10:areturn         
	}

	public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException, JsonProcessingException
	{
		return ((Object) (deserialize(jsonparser, deserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #36  <Method TokenBuffer deserialize(JsonParser, DeserializationContext)>
	//    4    6:areturn         
	}

	private static final long serialVersionUID = 1L;
}
