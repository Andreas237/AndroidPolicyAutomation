// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			BaseJsonNode, MissingNode, ObjectNode

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

	public volatile JsonNode findParent(String s)
	{
		return ((JsonNode) (findParent(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method ObjectNode findParent(String)>
	//    3    5:areturn         
	}

	public final ObjectNode findParent(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final List findParents(String s, List list)
	{
		return list;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public final JsonNode findValue(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final List findValues(String s, List list)
	{
		return list;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public final List findValuesAsText(String s, List list)
	{
		return list;
	//    0    0:aload_2         
	//    1    1:areturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #40  <Method JsonNode get(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(String s)
	{
		return ((TreeNode) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method JsonNode get(String)>
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

	public final boolean has(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean has(String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean hasNonNull(int i)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean hasNonNull(String s)
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
	//    2    2:invokevirtual   #50  <Method JsonNode path(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode path(String s)
	{
		return ((TreeNode) (path(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #52  <Method JsonNode path(String)>
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
		throws IOException, JsonProcessingException
	{
		typeserializer.writeTypePrefixForScalar(((Object) (this)), jsongenerator);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #64  <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
		serialize(jsongenerator, serializerprovider);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #68  <Method void serialize(JsonGenerator, SerializerProvider)>
		typeserializer.writeTypeSuffixForScalar(((Object) (this)), jsongenerator);
	//    8   12:aload_3         
	//    9   13:aload_0         
	//   10   14:aload_1         
	//   11   15:invokevirtual   #71  <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//   12   18:return          
	}

	public String toString()
	{
		return asText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #77  <Method String asText()>
	//    2    4:areturn         
	}
}
