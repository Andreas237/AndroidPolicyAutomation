// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.ResolvableDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//			StdDeserializer

public abstract class StdNodeBasedDeserializer extends StdDeserializer
	implements ResolvableDeserializer
{

	protected StdNodeBasedDeserializer(JavaType javatype)
	{
		super(javatype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #18  <Method void StdDeserializer(JavaType)>
	//    3    5:return          
	}

	protected StdNodeBasedDeserializer(StdNodeBasedDeserializer stdnodebaseddeserializer)
	{
		super(((StdDeserializer) (stdnodebaseddeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void StdDeserializer(StdDeserializer)>
		_treeDeserializer = stdnodebaseddeserializer._treeDeserializer;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #25  <Field JsonDeserializer _treeDeserializer>
	//    6   10:putfield        #25  <Field JsonDeserializer _treeDeserializer>
	//    7   13:return          
	}

	protected StdNodeBasedDeserializer(Class class1)
	{
		super(class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void StdDeserializer(Class)>
	//    3    5:return          
	}

	public abstract Object convert(JsonNode jsonnode, DeserializationContext deserializationcontext)
		throws IOException;

	public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		return convert((JsonNode)_treeDeserializer.deserialize(jsonparser, deserializationcontext), deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field JsonDeserializer _treeDeserializer>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #41  <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//    6   10:checkcast       #43  <Class JsonNode>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #45  <Method Object convert(JsonNode, DeserializationContext)>
	//    9   17:areturn         
	}

	public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
		throws IOException, JsonProcessingException
	{
		return convert((JsonNode)_treeDeserializer.deserializeWithType(jsonparser, deserializationcontext, typedeserializer), deserializationcontext);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field JsonDeserializer _treeDeserializer>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokevirtual   #53  <Method Object JsonDeserializer.deserializeWithType(JsonParser, DeserializationContext, TypeDeserializer)>
	//    7   11:checkcast       #43  <Class JsonNode>
	//    8   14:aload_2         
	//    9   15:invokevirtual   #45  <Method Object convert(JsonNode, DeserializationContext)>
	//   10   18:areturn         
	}

	public void resolve(DeserializationContext deserializationcontext)
		throws JsonMappingException
	{
		_treeDeserializer = deserializationcontext.findRootValueDeserializer(deserializationcontext.constructType(com/fasterxml/jackson/databind/JsonNode));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:ldc1            #43  <Class JsonNode>
	//    4    5:invokevirtual   #63  <Method JavaType DeserializationContext.constructType(Class)>
	//    5    8:invokevirtual   #67  <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//    6   11:putfield        #25  <Field JsonDeserializer _treeDeserializer>
	//    7   14:return          
	}

	private static final long serialVersionUID = 1L;
	protected JsonDeserializer _treeDeserializer;
}
