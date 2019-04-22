// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ContainerNode, JsonNodeType, MissingNode, BaseJsonNode, 
//			JsonNodeFactory

public class ArrayNode extends ContainerNode
{

	public ArrayNode(JsonNodeFactory jsonnodefactory)
	{
		super(jsonnodefactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContainerNode(JsonNodeFactory)>
		_children = ((List) (new ArrayList()));
	//    3    5:aload_0         
	//    4    6:new             #14  <Class ArrayList>
	//    5    9:dup             
	//    6   10:invokespecial   #17  <Method void ArrayList()>
	//    7   13:putfield        #19  <Field List _children>
	//    8   16:return          
	}

	public ArrayNode(JsonNodeFactory jsonnodefactory, int i)
	{
		super(jsonnodefactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContainerNode(JsonNodeFactory)>
		_children = ((List) (new ArrayList(i)));
	//    3    5:aload_0         
	//    4    6:new             #14  <Class ArrayList>
	//    5    9:dup             
	//    6   10:iload_2         
	//    7   11:invokespecial   #24  <Method void ArrayList(int)>
	//    8   14:putfield        #19  <Field List _children>
	//    9   17:return          
	}

	protected ArrayNode _add(JsonNode jsonnode)
	{
		_children.add(((Object) (jsonnode)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method boolean List.add(Object)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	protected JsonNode _at(JsonPointer jsonpointer)
	{
		return get(jsonpointer.getMatchingIndex());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method int JsonPointer.getMatchingIndex()>
	//    3    5:invokevirtual   #44  <Method JsonNode get(int)>
	//    4    8:areturn         
	}

	public ArrayNode add(JsonNode jsonnode)
	{
		Object obj = ((Object) (jsonnode));
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(jsonnode == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       11
			obj = ((Object) (nullNode()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #48  <Method NullNode nullNode()>
	//    6   10:astore_2        
		_add(((JsonNode) (obj)));
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #50  <Method ArrayNode _add(JsonNode)>
	//   10   16:pop             
		return this;
	//   11   17:aload_0         
	//   12   18:areturn         
	}

	public ArrayNode add(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #55  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (textNode(s))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #59  <Method TextNode textNode(String)>
	//    9   15:invokevirtual   #50  <Method ArrayNode _add(JsonNode)>
	//   10   18:areturn         
	}

	public ArrayNode addNull()
	{
		_add(((JsonNode) (nullNode())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #48  <Method NullNode nullNode()>
	//    3    5:invokevirtual   #50  <Method ArrayNode _add(JsonNode)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.START_ARRAY;
	//    0    0:getstatic       #67  <Field JsonToken JsonToken.START_ARRAY>
	//    1    3:areturn         
	}

	public volatile JsonNode deepCopy()
	{
		return ((JsonNode) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method ArrayNode deepCopy()>
	//    2    4:areturn         
	}

	public ArrayNode deepCopy()
	{
		ArrayNode arraynode = new ArrayNode(_nodeFactory);
	//    0    0:new             #2   <Class ArrayNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #75  <Field JsonNodeFactory _nodeFactory>
	//    4    8:invokespecial   #76  <Method void ArrayNode(JsonNodeFactory)>
	//    5   11:astore_1        
		JsonNode jsonnode;
		for(Iterator iterator = _children.iterator(); iterator.hasNext(); arraynode._children.add(((Object) (jsonnode.deepCopy()))))
	//*   6   12:aload_0         
	//*   7   13:getfield        #19  <Field List _children>
	//*   8   16:invokeinterface #80  <Method Iterator List.iterator()>
	//*   9   21:astore_2        
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            58
			jsonnode = (JsonNode)iterator.next();
	//   13   31:aload_2         
	//   14   32:invokeinterface #90  <Method Object Iterator.next()>
	//   15   37:checkcast       #92  <Class JsonNode>
	//   16   40:astore_3        

	//   17   41:aload_1         
	//   18   42:getfield        #19  <Field List _children>
	//   19   45:aload_3         
	//   20   46:invokevirtual   #94  <Method JsonNode JsonNode.deepCopy()>
	//   21   49:invokeinterface #32  <Method boolean List.add(Object)>
	//   22   54:pop             
	//*  23   55:goto            22
		return arraynode;
	//   24   58:aload_1         
	//   25   59:areturn         
	}

	public Iterator elements()
	{
		return _children.iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:invokeinterface #80  <Method Iterator List.iterator()>
	//    3    9:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(obj instanceof ArrayNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class ArrayNode>
	//*  11   17:ifeq            37
			return _children.equals(((Object) (((ArrayNode)obj)._children)));
	//   12   20:aload_0         
	//   13   21:getfield        #19  <Field List _children>
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class ArrayNode>
	//   16   28:getfield        #19  <Field List _children>
	//   17   31:invokeinterface #100 <Method boolean List.equals(Object)>
	//   18   36:ireturn         
		else
			return false;
	//   19   37:iconst_0        
	//   20   38:ireturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #44  <Method JsonNode get(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(String s)
	{
		return ((TreeNode) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #105 <Method JsonNode get(String)>
	//    3    5:areturn         
	}

	public JsonNode get(int i)
	{
		if(i >= 0 && i < _children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            31
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field List _children>
	//*   5    9:invokeinterface #108 <Method int List.size()>
	//*   6   14:icmpge          31
			return (JsonNode)_children.get(i);
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field List _children>
	//    9   21:iload_1         
	//   10   22:invokeinterface #111 <Method Object List.get(int)>
	//   11   27:checkcast       #92  <Class JsonNode>
	//   12   30:areturn         
		else
			return null;
	//   13   31:aconst_null     
	//   14   32:areturn         
	}

	public JsonNode get(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.ARRAY;
	//    0    0:getstatic       #119 <Field JsonNodeType JsonNodeType.ARRAY>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return _children.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:invokeinterface #122 <Method int List.hashCode()>
	//    3    9:ireturn         
	}

	public boolean isArray()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider)
	{
		return _children.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:invokeinterface #127 <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public volatile TreeNode path(int i)
	{
		return ((TreeNode) (path(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #130 <Method JsonNode path(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode path(String s)
	{
		return ((TreeNode) (path(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method JsonNode path(String)>
	//    3    5:areturn         
	}

	public JsonNode path(int i)
	{
		if(i >= 0 && i < _children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            31
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field List _children>
	//*   5    9:invokeinterface #108 <Method int List.size()>
	//*   6   14:icmpge          31
			return (JsonNode)_children.get(i);
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field List _children>
	//    9   21:iload_1         
	//   10   22:invokeinterface #111 <Method Object List.get(int)>
	//   11   27:checkcast       #92  <Class JsonNode>
	//   12   30:areturn         
		else
			return ((JsonNode) (MissingNode.getInstance()));
	//   13   31:invokestatic    #138 <Method MissingNode MissingNode.getInstance()>
	//   14   34:areturn         
	}

	public JsonNode path(String s)
	{
		return ((JsonNode) (MissingNode.getInstance()));
	//    0    0:invokestatic    #138 <Method MissingNode MissingNode.getInstance()>
	//    1    3:areturn         
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		List list = _children;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:astore          5
		int j = list.size();
	//    3    6:aload           5
	//    4    8:invokeinterface #108 <Method int List.size()>
	//    5   13:istore          4
		jsongenerator.writeStartArray(j);
	//    6   15:aload_1         
	//    7   16:iload           4
	//    8   18:invokevirtual   #147 <Method void JsonGenerator.writeStartArray(int)>
		for(int i = 0; i < j; i++)
	//*   9   21:iconst_0        
	//*  10   22:istore_3        
	//*  11   23:iload_3         
	//*  12   24:iload           4
	//*  13   26:icmpge          55
			((BaseJsonNode)(JsonNode)list.get(i)).serialize(jsongenerator, serializerprovider);
	//   14   29:aload           5
	//   15   31:iload_3         
	//   16   32:invokeinterface #111 <Method Object List.get(int)>
	//   17   37:checkcast       #92  <Class JsonNode>
	//   18   40:checkcast       #149 <Class BaseJsonNode>
	//   19   43:aload_1         
	//   20   44:aload_2         
	//   21   45:invokevirtual   #151 <Method void BaseJsonNode.serialize(JsonGenerator, SerializerProvider)>

	//   22   48:iload_3         
	//   23   49:iconst_1        
	//   24   50:iadd            
	//   25   51:istore_3        
	//*  26   52:goto            23
		jsongenerator.writeEndArray();
	//   27   55:aload_1         
	//   28   56:invokevirtual   #154 <Method void JsonGenerator.writeEndArray()>
	//   29   59:return          
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (this)), JsonToken.START_ARRAY));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getstatic       #67  <Field JsonToken JsonToken.START_ARRAY>
	//    5    7:invokevirtual   #163 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//    6   10:invokevirtual   #167 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//    7   13:astore          4
		for(Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider));
	//    8   15:aload_0         
	//    9   16:getfield        #19  <Field List _children>
	//   10   19:invokeinterface #80  <Method Iterator List.iterator()>
	//   11   24:astore          5
	//   12   26:aload           5
	//   13   28:invokeinterface #86  <Method boolean Iterator.hasNext()>
	//   14   33:ifeq            57
	//   15   36:aload           5
	//   16   38:invokeinterface #90  <Method Object Iterator.next()>
	//   17   43:checkcast       #92  <Class JsonNode>
	//   18   46:checkcast       #149 <Class BaseJsonNode>
	//   19   49:aload_1         
	//   20   50:aload_2         
	//   21   51:invokevirtual   #151 <Method void BaseJsonNode.serialize(JsonGenerator, SerializerProvider)>
	//*  22   54:goto            26
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   23   57:aload_3         
	//   24   58:aload_1         
	//   25   59:aload           4
	//   26   61:invokevirtual   #170 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   27   64:pop             
	//   28   65:return          
	}

	public int size()
	{
		return _children.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:invokeinterface #108 <Method int List.size()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder((size() << 4) + 16);
	//    0    0:new             #174 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #175 <Method int size()>
	//    4    8:iconst_4        
	//    5    9:ishl            
	//    6   10:bipush          16
	//    7   12:iadd            
	//    8   13:invokespecial   #176 <Method void StringBuilder(int)>
	//    9   16:astore_3        
		stringbuilder.append('[');
	//   10   17:aload_3         
	//   11   18:bipush          91
	//   12   20:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   13   23:pop             
		int j = _children.size();
	//   14   24:aload_0         
	//   15   25:getfield        #19  <Field List _children>
	//   16   28:invokeinterface #108 <Method int List.size()>
	//   17   33:istore_2        
		for(int i = 0; i < j; i++)
	//*  18   34:iconst_0        
	//*  19   35:istore_1        
	//*  20   36:iload_1         
	//*  21   37:iload_2         
	//*  22   38:icmpge          80
		{
			if(i > 0)
	//*  23   41:iload_1         
	//*  24   42:ifle            52
				stringbuilder.append(',');
	//   25   45:aload_3         
	//   26   46:bipush          44
	//   27   48:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   28   51:pop             
			stringbuilder.append(((JsonNode)_children.get(i)).toString());
	//   29   52:aload_3         
	//   30   53:aload_0         
	//   31   54:getfield        #19  <Field List _children>
	//   32   57:iload_1         
	//   33   58:invokeinterface #111 <Method Object List.get(int)>
	//   34   63:checkcast       #92  <Class JsonNode>
	//   35   66:invokevirtual   #182 <Method String JsonNode.toString()>
	//   36   69:invokevirtual   #185 <Method StringBuilder StringBuilder.append(String)>
	//   37   72:pop             
		}

	//   38   73:iload_1         
	//   39   74:iconst_1        
	//   40   75:iadd            
	//   41   76:istore_1        
	//*  42   77:goto            36
		stringbuilder.append(']');
	//   43   80:aload_3         
	//   44   81:bipush          93
	//   45   83:invokevirtual   #180 <Method StringBuilder StringBuilder.append(char)>
	//   46   86:pop             
		return stringbuilder.toString();
	//   47   87:aload_3         
	//   48   88:invokevirtual   #186 <Method String StringBuilder.toString()>
	//   49   91:areturn         
	}

	private final List _children;
}
