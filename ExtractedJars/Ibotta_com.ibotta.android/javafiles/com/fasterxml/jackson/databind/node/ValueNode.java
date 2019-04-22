// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			BaseJsonNode, MissingNode

public abstract class ValueNode extends BaseJsonNode
{

	protected ValueNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void BaseJsonNode()>
	//    2    4:return          
	}

	protected JsonNode _at(JsonPointer jsonpointer)
	{
		return ((JsonNode) (MissingNode.getInstance()));
	//    0    0:invokestatic    #17  <Method MissingNode MissingNode.getInstance()>
	//    1    3:areturn         
	}

	public abstract JsonToken asToken();

	public JsonNode deepCopy()
	{
		return ((JsonNode) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #28  <Method JsonNode get(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(String s)
	{
		return ((TreeNode) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method JsonNode get(String)>
	//    3    5:areturn         
	}

	public final JsonNode get(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final JsonNode get(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final boolean has(String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public volatile TreeNode path(int i)
	{
		return ((TreeNode) (path(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #37  <Method JsonNode path(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode path(String s)
	{
		return ((TreeNode) (path(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method JsonNode path(String)>
	//    3    5:areturn         
	}

	public final JsonNode path(int i)
	{
		return ((JsonNode) (MissingNode.getInstance()));
	//    0    0:invokestatic    #17  <Method MissingNode MissingNode.getInstance()>
	//    1    3:areturn         
	}

	public final JsonNode path(String s)
	{
		return ((JsonNode) (MissingNode.getInstance()));
	//    0    0:invokestatic    #17  <Method MissingNode MissingNode.getInstance()>
	//    1    3:areturn         
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (this)), asToken()));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:aload_0         
	//    5    5:invokevirtual   #45  <Method JsonToken asToken()>
	//    6    8:invokevirtual   #51  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    7   11:invokevirtual   #55  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    8   14:astore          4
		serialize(jsongenerator, serializerprovider);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:aload_2         
	//   12   19:invokevirtual   #59  <Method void serialize(JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   13   22:aload_3         
	//   14   23:aload_1         
	//   15   24:aload           4
	//   16   26:invokevirtual   #62  <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   17   29:pop             
	//   18   30:return          
	}

	public String toString()
	{
		return asText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #68  <Method String asText()>
	//    2    4:areturn         
	}
}
