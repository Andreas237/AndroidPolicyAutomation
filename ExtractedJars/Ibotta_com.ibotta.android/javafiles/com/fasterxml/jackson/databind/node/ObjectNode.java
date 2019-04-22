// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ContainerNode, JsonNodeType, MissingNode, BaseJsonNode, 
//			TextNode, JsonNodeFactory, ArrayNode

public class ObjectNode extends ContainerNode
{

	public ObjectNode(JsonNodeFactory jsonnodefactory)
	{
		super(jsonnodefactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContainerNode(JsonNodeFactory)>
	//    3    5:aload_0         
	//    4    6:new             #14  <Class LinkedHashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #17  <Method void LinkedHashMap()>
	//    7   13:putfield        #19  <Field Map _children>
	//    8   16:return          
	}

	protected JsonNode _at(JsonPointer jsonpointer)
	{
		return get(jsonpointer.getMatchingProperty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method String JsonPointer.getMatchingProperty()>
	//    3    5:invokevirtual   #32  <Method JsonNode get(String)>
	//    4    8:areturn         
	}

	protected boolean _childrenEqual(ObjectNode objectnode)
	{
		return _children.equals(((Object) (objectnode._children)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:getfield        #19  <Field Map _children>
	//    4    8:invokeinterface #40  <Method boolean Map.equals(Object)>
	//    5   13:ireturn         
	}

	protected ObjectNode _put(String s, JsonNode jsonnode)
	{
		_children.put(((Object) (s)), ((Object) (jsonnode)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.START_OBJECT;
	//    0    0:getstatic       #54  <Field JsonToken JsonToken.START_OBJECT>
	//    1    3:areturn         
	}

	public volatile JsonNode deepCopy()
	{
		return ((JsonNode) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #59  <Method ObjectNode deepCopy()>
	//    2    4:areturn         
	}

	public ObjectNode deepCopy()
	{
		ObjectNode objectnode = new ObjectNode(_nodeFactory);
	//    0    0:new             #2   <Class ObjectNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field JsonNodeFactory _nodeFactory>
	//    4    8:invokespecial   #64  <Method void ObjectNode(JsonNodeFactory)>
	//    5   11:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); objectnode._children.put(entry.getKey(), ((Object) (((JsonNode)entry.getValue()).deepCopy()))))
	//*   6   12:aload_0         
	//*   7   13:getfield        #19  <Field Map _children>
	//*   8   16:invokeinterface #68  <Method Set Map.entrySet()>
	//*   9   21:invokeinterface #74  <Method Iterator Set.iterator()>
	//*  10   26:astore_2        
	//*  11   27:aload_2         
	//*  12   28:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  13   33:ifeq            77
			entry = (java.util.Map.Entry)iterator.next();
	//   14   36:aload_2         
	//   15   37:invokeinterface #84  <Method Object Iterator.next()>
	//   16   42:checkcast       #86  <Class java.util.Map$Entry>
	//   17   45:astore_3        

	//   18   46:aload_1         
	//   19   47:getfield        #19  <Field Map _children>
	//   20   50:aload_3         
	//   21   51:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
	//   22   56:aload_3         
	//   23   57:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   24   62:checkcast       #94  <Class JsonNode>
	//   25   65:invokevirtual   #96  <Method JsonNode JsonNode.deepCopy()>
	//   26   68:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   27   73:pop             
	//*  28   74:goto            27
		return objectnode;
	//   29   77:aload_1         
	//   30   78:areturn         
	}

	public Iterator elements()
	{
		return _children.values().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #101 <Method Collection Map.values()>
	//    3    9:invokeinterface #104 <Method Iterator Collection.iterator()>
	//    4   14:areturn         
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
		if(obj instanceof ObjectNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class ObjectNode>
	//*  11   17:ifeq            29
			return _childrenEqual((ObjectNode)obj);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:checkcast       #2   <Class ObjectNode>
	//   15   25:invokevirtual   #108 <Method boolean _childrenEqual(ObjectNode)>
	//   16   28:ireturn         
		else
			return false;
	//   17   29:iconst_0        
	//   18   30:ireturn         
	}

	public Iterator fieldNames()
	{
		return _children.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #112 <Method Set Map.keySet()>
	//    3    9:invokeinterface #74  <Method Iterator Set.iterator()>
	//    4   14:areturn         
	}

	public Iterator fields()
	{
		return _children.entrySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #68  <Method Set Map.entrySet()>
	//    3    9:invokeinterface #74  <Method Iterator Set.iterator()>
	//    4   14:areturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #119 <Method JsonNode get(int)>
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

	public JsonNode get(int i)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public JsonNode get(String s)
	{
		return (JsonNode)_children.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #123 <Method Object Map.get(Object)>
	//    4   10:checkcast       #94  <Class JsonNode>
	//    5   13:areturn         
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.OBJECT;
	//    0    0:getstatic       #131 <Field JsonNodeType JsonNodeType.OBJECT>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return _children.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #135 <Method int Map.hashCode()>
	//    3    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider)
	{
		return _children.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #139 <Method boolean Map.isEmpty()>
	//    3    9:ireturn         
	}

	public final boolean isObject()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile TreeNode path(int i)
	{
		return ((TreeNode) (path(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #143 <Method JsonNode path(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode path(String s)
	{
		return ((TreeNode) (path(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #145 <Method JsonNode path(String)>
	//    3    5:areturn         
	}

	public JsonNode path(int i)
	{
		return ((JsonNode) (MissingNode.getInstance()));
	//    0    0:invokestatic    #151 <Method MissingNode MissingNode.getInstance()>
	//    1    3:areturn         
	}

	public JsonNode path(String s)
	{
		s = ((String) ((JsonNode)_children.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #123 <Method Object Map.get(Object)>
	//    4   10:checkcast       #94  <Class JsonNode>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          20
			return ((JsonNode) (s));
	//    8   18:aload_1         
	//    9   19:areturn         
		else
			return ((JsonNode) (MissingNode.getInstance()));
	//   10   20:invokestatic    #151 <Method MissingNode MissingNode.getInstance()>
	//   11   23:areturn         
	}

	public JsonNode put(String s, JsonNode jsonnode)
	{
		Object obj = ((Object) (jsonnode));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonnode == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       11
			obj = ((Object) (nullNode()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #157 <Method NullNode nullNode()>
	//    6   10:astore_3        
		return (JsonNode)_children.put(((Object) (s)), obj);
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field Map _children>
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   12   22:checkcast       #94  <Class JsonNode>
	//   13   25:areturn         
	}

	public ObjectNode put(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
			s1 = ((String) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #157 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:goto            18
			s1 = ((String) (textNode(s1)));
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #163 <Method TextNode textNode(String)>
	//    9   17:astore_2        
		return _put(s, ((JsonNode) (s1)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #165 <Method ObjectNode _put(String, JsonNode)>
	//   14   24:areturn         
	}

	public ObjectNode put(String s, boolean flag)
	{
		return _put(s, ((JsonNode) (booleanNode(flag))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #170 <Method BooleanNode booleanNode(boolean)>
	//    5    7:invokevirtual   #165 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public ArrayNode putArray(String s)
	{
		ArrayNode arraynode = arrayNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method ArrayNode arrayNode()>
	//    2    4:astore_2        
		_put(s, ((JsonNode) (arraynode)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #165 <Method ObjectNode _put(String, JsonNode)>
	//    7   11:pop             
		return arraynode;
	//    8   12:aload_2         
	//    9   13:areturn         
	}

	public JsonNode remove(String s)
	{
		return (JsonNode)_children.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #179 <Method Object Map.remove(Object)>
	//    4   10:checkcast       #94  <Class JsonNode>
	//    5   13:areturn         
	}

	public JsonNode replace(String s, JsonNode jsonnode)
	{
		Object obj = ((Object) (jsonnode));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonnode == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       11
			obj = ((Object) (nullNode()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #157 <Method NullNode nullNode()>
	//    6   10:astore_3        
		return (JsonNode)_children.put(((Object) (s)), obj);
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field Map _children>
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   12   22:checkcast       #94  <Class JsonNode>
	//   13   25:areturn         
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		boolean flag;
		if(serializerprovider != null && !serializerprovider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS))
	//*   0    0:aload_2         
	//*   1    1:ifnull          19
	//*   2    4:aload_2         
	//*   3    5:getstatic       #190 <Field SerializationFeature SerializationFeature.WRITE_EMPTY_JSON_ARRAYS>
	//*   4    8:invokevirtual   #196 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   5   11:ifne            19
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore_3        
		else
	//*   8   16:goto            21
			flag = false;
	//    9   19:iconst_0        
	//   10   20:istore_3        
		jsongenerator.writeStartObject(((Object) (this)));
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #202 <Method void JsonGenerator.writeStartObject(Object)>
		Iterator iterator = _children.entrySet().iterator();
	//   14   26:aload_0         
	//   15   27:getfield        #19  <Field Map _children>
	//   16   30:invokeinterface #68  <Method Set Map.entrySet()>
	//   17   35:invokeinterface #74  <Method Iterator Set.iterator()>
	//   18   40:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//   19   42:aload           4
	//   20   44:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   21   49:ifeq            124
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   22   52:aload           4
	//   23   54:invokeinterface #84  <Method Object Iterator.next()>
	//   24   59:checkcast       #86  <Class java.util.Map$Entry>
	//   25   62:astore          5
			BaseJsonNode basejsonnode = (BaseJsonNode)entry.getValue();
	//   26   64:aload           5
	//   27   66:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   28   71:checkcast       #204 <Class BaseJsonNode>
	//   29   74:astore          6
			if(!flag || !basejsonnode.isArray() || !basejsonnode.isEmpty(serializerprovider))
	//*  30   76:iload_3         
	//*  31   77:ifeq            100
	//*  32   80:aload           6
	//*  33   82:invokevirtual   #207 <Method boolean BaseJsonNode.isArray()>
	//*  34   85:ifeq            100
	//*  35   88:aload           6
	//*  36   90:aload_2         
	//*  37   91:invokevirtual   #209 <Method boolean BaseJsonNode.isEmpty(SerializerProvider)>
	//*  38   94:ifeq            100
	//*  39   97:goto            42
			{
				jsongenerator.writeFieldName((String)entry.getKey());
	//   40  100:aload_1         
	//   41  101:aload           5
	//   42  103:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
	//   43  108:checkcast       #211 <Class String>
	//   44  111:invokevirtual   #215 <Method void JsonGenerator.writeFieldName(String)>
				basejsonnode.serialize(jsongenerator, serializerprovider);
	//   45  114:aload           6
	//   46  116:aload_1         
	//   47  117:aload_2         
	//   48  118:invokevirtual   #217 <Method void BaseJsonNode.serialize(JsonGenerator, SerializerProvider)>
			}
		} while(true);
	//   49  121:goto            42
		jsongenerator.writeEndObject();
	//   50  124:aload_1         
	//   51  125:invokevirtual   #220 <Method void JsonGenerator.writeEndObject()>
	//   52  128:return          
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		boolean flag;
		if(serializerprovider != null && !serializerprovider.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS))
	//*   0    0:aload_2         
	//*   1    1:ifnull          20
	//*   2    4:aload_2         
	//*   3    5:getstatic       #190 <Field SerializationFeature SerializationFeature.WRITE_EMPTY_JSON_ARRAYS>
	//*   4    8:invokevirtual   #196 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   5   11:ifne            20
			flag = true;
	//    6   14:iconst_1        
	//    7   15:istore          4
		else
	//*   8   17:goto            23
			flag = false;
	//    9   20:iconst_0        
	//   10   21:istore          4
		com.fasterxml.jackson.core.type.WritableTypeId writabletypeid = typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(((Object) (this)), JsonToken.START_OBJECT));
	//   11   23:aload_3         
	//   12   24:aload_1         
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:getstatic       #54  <Field JsonToken JsonToken.START_OBJECT>
	//   16   30:invokevirtual   #229 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//   17   33:invokevirtual   #233 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   18   36:astore          5
		Iterator iterator = _children.entrySet().iterator();
	//   19   38:aload_0         
	//   20   39:getfield        #19  <Field Map _children>
	//   21   42:invokeinterface #68  <Method Set Map.entrySet()>
	//   22   47:invokeinterface #74  <Method Iterator Set.iterator()>
	//   23   52:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//   24   54:aload           6
	//   25   56:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//   26   61:ifeq            137
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   27   64:aload           6
	//   28   66:invokeinterface #84  <Method Object Iterator.next()>
	//   29   71:checkcast       #86  <Class java.util.Map$Entry>
	//   30   74:astore          7
			BaseJsonNode basejsonnode = (BaseJsonNode)entry.getValue();
	//   31   76:aload           7
	//   32   78:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   33   83:checkcast       #204 <Class BaseJsonNode>
	//   34   86:astore          8
			if(!flag || !basejsonnode.isArray() || !basejsonnode.isEmpty(serializerprovider))
	//*  35   88:iload           4
	//*  36   90:ifeq            113
	//*  37   93:aload           8
	//*  38   95:invokevirtual   #207 <Method boolean BaseJsonNode.isArray()>
	//*  39   98:ifeq            113
	//*  40  101:aload           8
	//*  41  103:aload_2         
	//*  42  104:invokevirtual   #209 <Method boolean BaseJsonNode.isEmpty(SerializerProvider)>
	//*  43  107:ifeq            113
	//*  44  110:goto            54
			{
				jsongenerator.writeFieldName((String)entry.getKey());
	//   45  113:aload_1         
	//   46  114:aload           7
	//   47  116:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
	//   48  121:checkcast       #211 <Class String>
	//   49  124:invokevirtual   #215 <Method void JsonGenerator.writeFieldName(String)>
				basejsonnode.serialize(jsongenerator, serializerprovider);
	//   50  127:aload           8
	//   51  129:aload_1         
	//   52  130:aload_2         
	//   53  131:invokevirtual   #217 <Method void BaseJsonNode.serialize(JsonGenerator, SerializerProvider)>
			}
		} while(true);
	//   54  134:goto            54
		typeserializer.writeTypeSuffix(jsongenerator, writabletypeid);
	//   55  137:aload_3         
	//   56  138:aload_1         
	//   57  139:aload           5
	//   58  141:invokevirtual   #236 <Method com.fasterxml.jackson.core.type.WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, com.fasterxml.jackson.core.type.WritableTypeId)>
	//   59  144:pop             
	//   60  145:return          
	}

	public JsonNode set(String s, JsonNode jsonnode)
	{
		Object obj = ((Object) (jsonnode));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonnode == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       11
			obj = ((Object) (nullNode()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #157 <Method NullNode nullNode()>
	//    6   10:astore_3        
		_children.put(((Object) (s)), obj);
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field Map _children>
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokeinterface #46  <Method Object Map.put(Object, Object)>
	//   12   22:pop             
		return ((JsonNode) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public int size()
	{
		return _children.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #240 <Method int Map.size()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder((size() << 4) + 32);
	//    0    0:new             #243 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #244 <Method int size()>
	//    4    8:iconst_4        
	//    5    9:ishl            
	//    6   10:bipush          32
	//    7   12:iadd            
	//    8   13:invokespecial   #247 <Method void StringBuilder(int)>
	//    9   16:astore_2        
		stringbuilder.append("{");
	//   10   17:aload_2         
	//   11   18:ldc1            #249 <String "{">
	//   12   20:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   13   23:pop             
		Iterator iterator = _children.entrySet().iterator();
	//   14   24:aload_0         
	//   15   25:getfield        #19  <Field Map _children>
	//   16   28:invokeinterface #68  <Method Set Map.entrySet()>
	//   17   33:invokeinterface #74  <Method Iterator Set.iterator()>
	//   18   38:astore_3        
		int i = 0;
	//   19   39:iconst_0        
	//   20   40:istore_1        
		java.util.Map.Entry entry;
		for(; iterator.hasNext(); stringbuilder.append(((JsonNode)entry.getValue()).toString()))
	//*  21   41:aload_3         
	//*  22   42:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  23   47:ifeq            118
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   24   50:aload_3         
	//   25   51:invokeinterface #84  <Method Object Iterator.next()>
	//   26   56:checkcast       #86  <Class java.util.Map$Entry>
	//   27   59:astore          4
			if(i > 0)
	//*  28   61:iload_1         
	//*  29   62:ifle            72
				stringbuilder.append(",");
	//   30   65:aload_2         
	//   31   66:ldc1            #255 <String ",">
	//   32   68:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
			i++;
	//   34   72:iload_1         
	//   35   73:iconst_1        
	//   36   74:iadd            
	//   37   75:istore_1        
			TextNode.appendQuoted(stringbuilder, (String)entry.getKey());
	//   38   76:aload_2         
	//   39   77:aload           4
	//   40   79:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
	//   41   84:checkcast       #211 <Class String>
	//   42   87:invokestatic    #261 <Method void TextNode.appendQuoted(StringBuilder, String)>
			stringbuilder.append(':');
	//   43   90:aload_2         
	//   44   91:bipush          58
	//   45   93:invokevirtual   #264 <Method StringBuilder StringBuilder.append(char)>
	//   46   96:pop             
		}

	//   47   97:aload_2         
	//   48   98:aload           4
	//   49  100:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   50  105:checkcast       #94  <Class JsonNode>
	//   51  108:invokevirtual   #266 <Method String JsonNode.toString()>
	//   52  111:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   53  114:pop             
	//*  54  115:goto            41
		stringbuilder.append("}");
	//   55  118:aload_2         
	//   56  119:ldc2            #268 <String "}">
	//   57  122:invokevirtual   #253 <Method StringBuilder StringBuilder.append(String)>
	//   58  125:pop             
		return stringbuilder.toString();
	//   59  126:aload_2         
	//   60  127:invokevirtual   #269 <Method String StringBuilder.toString()>
	//   61  130:areturn         
	}

	protected final Map _children = new LinkedHashMap();
}
