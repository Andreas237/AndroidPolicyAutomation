// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ContainerNode, JsonNodeType, MissingNode, BaseJsonNode, 
//			TextNode, ArrayNode, JsonNodeFactory

public class ObjectNode extends ContainerNode
{

	public ObjectNode(JsonNodeFactory jsonnodefactory)
	{
		super(jsonnodefactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContainerNode(JsonNodeFactory)>
		_children = ((Map) (new LinkedHashMap()));
	//    3    5:aload_0         
	//    4    6:new             #14  <Class LinkedHashMap>
	//    5    9:dup             
	//    6   10:invokespecial   #17  <Method void LinkedHashMap()>
	//    7   13:putfield        #19  <Field Map _children>
	//    8   16:return          
	}

	public ObjectNode(JsonNodeFactory jsonnodefactory, Map map)
	{
		super(jsonnodefactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContainerNode(JsonNodeFactory)>
		_children = map;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Map _children>
	//    6   10:return          
	}

	protected JsonNode _at(JsonPointer jsonpointer)
	{
		return get(jsonpointer.getMatchingProperty());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method String JsonPointer.getMatchingProperty()>
	//    3    5:invokevirtual   #35  <Method JsonNode get(String)>
	//    4    8:areturn         
	}

	protected boolean _childrenEqual(ObjectNode objectnode)
	{
		return _children.equals(((Object) (objectnode._children)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:getfield        #19  <Field Map _children>
	//    4    8:invokeinterface #43  <Method boolean Map.equals(Object)>
	//    5   13:ireturn         
	}

	protected ObjectNode _put(String s, JsonNode jsonnode)
	{
		_children.put(((Object) (s)), ((Object) (jsonnode)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.START_OBJECT;
	//    0    0:getstatic       #57  <Field JsonToken JsonToken.START_OBJECT>
	//    1    3:areturn         
	}

	public volatile JsonNode deepCopy()
	{
		return ((JsonNode) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method ObjectNode deepCopy()>
	//    2    4:areturn         
	}

	public ObjectNode deepCopy()
	{
		ObjectNode objectnode = new ObjectNode(_nodeFactory);
	//    0    0:new             #2   <Class ObjectNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #66  <Field JsonNodeFactory _nodeFactory>
	//    4    8:invokespecial   #67  <Method void ObjectNode(JsonNodeFactory)>
	//    5   11:astore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); objectnode._children.put(entry.getKey(), ((Object) (((JsonNode)entry.getValue()).deepCopy()))))
	//*   6   12:aload_0         
	//*   7   13:getfield        #19  <Field Map _children>
	//*   8   16:invokeinterface #71  <Method Set Map.entrySet()>
	//*   9   21:invokeinterface #77  <Method Iterator Set.iterator()>
	//*  10   26:astore_2        
	//*  11   27:aload_2         
	//*  12   28:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*  13   33:ifeq            77
			entry = (java.util.Map.Entry)iterator.next();
	//   14   36:aload_2         
	//   15   37:invokeinterface #87  <Method Object Iterator.next()>
	//   16   42:checkcast       #89  <Class java.util.Map$Entry>
	//   17   45:astore_3        

	//   18   46:aload_1         
	//   19   47:getfield        #19  <Field Map _children>
	//   20   50:aload_3         
	//   21   51:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//   22   56:aload_3         
	//   23   57:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   24   62:checkcast       #97  <Class JsonNode>
	//   25   65:invokevirtual   #99  <Method JsonNode JsonNode.deepCopy()>
	//   26   68:invokeinterface #49  <Method Object Map.put(Object, Object)>
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
	//    2    4:invokeinterface #104 <Method Collection Map.values()>
	//    3    9:invokeinterface #107 <Method Iterator Collection.iterator()>
	//    4   14:areturn         
	}

	public boolean equals(Object obj)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		boolean flag;
		if(obj == this)
	//*   2    2:aload_1         
	//*   3    3:aload_0         
	//*   4    4:if_acmpne       11
		{
			flag = true;
	//    5    7:iconst_1        
	//    6    8:istore_2        
		} else
	//*   7    9:iload_2         
	//*   8   10:ireturn         
		{
			flag = flag1;
	//    9   11:iload_3         
	//   10   12:istore_2        
			if(obj != null)
	//*  11   13:aload_1         
	//*  12   14:ifnull          9
			{
				flag = flag1;
	//   13   17:iload_3         
	//   14   18:istore_2        
				if(obj instanceof ObjectNode)
	//*  15   19:aload_1         
	//*  16   20:instanceof      #2   <Class ObjectNode>
	//*  17   23:ifeq            9
					return _childrenEqual((ObjectNode)obj);
	//   18   26:aload_0         
	//   19   27:aload_1         
	//   20   28:checkcast       #2   <Class ObjectNode>
	//   21   31:invokevirtual   #110 <Method boolean _childrenEqual(ObjectNode)>
	//   22   34:ireturn         
			}
		}
		return flag;
	}

	public boolean equals(Comparator comparator, JsonNode jsonnode)
	{
		if(!(jsonnode instanceof ObjectNode))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #2   <Class ObjectNode>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		jsonnode = ((JsonNode) ((ObjectNode)jsonnode));
	//    5    9:aload_2         
	//    6   10:checkcast       #2   <Class ObjectNode>
	//    7   13:astore_2        
		Object obj = ((Object) (_children));
	//    8   14:aload_0         
	//    9   15:getfield        #19  <Field Map _children>
	//   10   18:astore          4
		jsonnode = ((JsonNode) (((ObjectNode) (jsonnode))._children));
	//   11   20:aload_2         
	//   12   21:getfield        #19  <Field Map _children>
	//   13   24:astore_2        
		int i = ((Map) (obj)).size();
	//   14   25:aload           4
	//   15   27:invokeinterface #115 <Method int Map.size()>
	//   16   32:istore_3        
		if(((Map) (jsonnode)).size() != i)
	//*  17   33:aload_2         
	//*  18   34:invokeinterface #115 <Method int Map.size()>
	//*  19   39:iload_3         
	//*  20   40:icmpeq          45
			return false;
	//   21   43:iconst_0        
	//   22   44:ireturn         
		for(obj = ((Object) (((Map) (obj)).entrySet().iterator())); ((Iterator) (obj)).hasNext();)
	//*  23   45:aload           4
	//*  24   47:invokeinterface #71  <Method Set Map.entrySet()>
	//*  25   52:invokeinterface #77  <Method Iterator Set.iterator()>
	//*  26   57:astore          4
	//*  27   59:aload           4
	//*  28   61:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*  29   66:ifeq            125
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   30   69:aload           4
	//   31   71:invokeinterface #87  <Method Object Iterator.next()>
	//   32   76:checkcast       #89  <Class java.util.Map$Entry>
	//   33   79:astore          5
			JsonNode jsonnode1 = (JsonNode)((Map) (jsonnode)).get(entry.getKey());
	//   34   81:aload_2         
	//   35   82:aload           5
	//   36   84:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//   37   89:invokeinterface #118 <Method Object Map.get(Object)>
	//   38   94:checkcast       #97  <Class JsonNode>
	//   39   97:astore          6
			if(jsonnode1 == null || !((JsonNode)entry.getValue()).equals(comparator, jsonnode1))
	//*  40   99:aload           6
	//*  41  101:ifnull          123
	//*  42  104:aload           5
	//*  43  106:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//*  44  111:checkcast       #97  <Class JsonNode>
	//*  45  114:aload_1         
	//*  46  115:aload           6
	//*  47  117:invokevirtual   #120 <Method boolean JsonNode.equals(Comparator, JsonNode)>
	//*  48  120:ifne            59
				return false;
	//   49  123:iconst_0        
	//   50  124:ireturn         
		}

		return true;
	//   51  125:iconst_1        
	//   52  126:ireturn         
	}

	public Iterator fieldNames()
	{
		return _children.keySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #125 <Method Set Map.keySet()>
	//    3    9:invokeinterface #77  <Method Iterator Set.iterator()>
	//    4   14:areturn         
	}

	public Iterator fields()
	{
		return _children.entrySet().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #71  <Method Set Map.entrySet()>
	//    3    9:invokeinterface #77  <Method Iterator Set.iterator()>
	//    4   14:areturn         
	}

	public volatile JsonNode findParent(String s)
	{
		return ((JsonNode) (findParent(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method ObjectNode findParent(String)>
	//    3    5:areturn         
	}

	public ObjectNode findParent(String s)
	{
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map _children>
	//*   2    4:invokeinterface #71  <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #77  <Method Iterator Set.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            72
		{
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//    8   24:aload_2         
	//    9   25:invokeinterface #87  <Method Object Iterator.next()>
	//   10   30:checkcast       #89  <Class java.util.Map$Entry>
	//   11   33:astore_3        
			if(s.equals(((java.util.Map.Entry) (obj)).getKey()))
	//*  12   34:aload_1         
	//*  13   35:aload_3         
	//*  14   36:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//*  15   41:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  16   44:ifeq            49
				return this;
	//   17   47:aload_0         
	//   18   48:areturn         
			obj = ((Object) (((JsonNode)((java.util.Map.Entry) (obj)).getValue()).findParent(s)));
	//   19   49:aload_3         
	//   20   50:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   21   55:checkcast       #97  <Class JsonNode>
	//   22   58:aload_1         
	//   23   59:invokevirtual   #137 <Method JsonNode JsonNode.findParent(String)>
	//   24   62:astore_3        
			if(obj != null)
	//*  25   63:aload_3         
	//*  26   64:ifnull          15
				return (ObjectNode)obj;
	//   27   67:aload_3         
	//   28   68:checkcast       #2   <Class ObjectNode>
	//   29   71:areturn         
		}

		return null;
	//   30   72:aconst_null     
	//   31   73:areturn         
	}

	public List findParents(String s, List list)
	{
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map _children>
	//*   2    4:invokeinterface #71  <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #77  <Method Iterator Set.iterator()>
	//*   4   14:astore          4
	//*   5   16:aload           4
	//*   6   18:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   7   23:ifeq            95
		{
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//    8   26:aload           4
	//    9   28:invokeinterface #87  <Method Object Iterator.next()>
	//   10   33:checkcast       #89  <Class java.util.Map$Entry>
	//   11   36:astore_3        
			if(s.equals(((java.util.Map.Entry) (obj)).getKey()))
	//*  12   37:aload_1         
	//*  13   38:aload_3         
	//*  14   39:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//*  15   44:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  16   47:ifeq            77
			{
				obj = ((Object) (list));
	//   17   50:aload_2         
	//   18   51:astore_3        
				if(list == null)
	//*  19   52:aload_2         
	//*  20   53:ifnonnull       64
					obj = ((Object) (new ArrayList()));
	//   21   56:new             #141 <Class ArrayList>
	//   22   59:dup             
	//   23   60:invokespecial   #142 <Method void ArrayList()>
	//   24   63:astore_3        
				((List) (obj)).add(((Object) (this)));
	//   25   64:aload_3         
	//   26   65:aload_0         
	//   27   66:invokeinterface #147 <Method boolean List.add(Object)>
	//   28   71:pop             
				list = ((List) (obj));
	//   29   72:aload_3         
	//   30   73:astore_2        
			} else
	//*  31   74:goto            16
			{
				list = ((JsonNode)((java.util.Map.Entry) (obj)).getValue()).findParents(s, list);
	//   32   77:aload_3         
	//   33   78:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   34   83:checkcast       #97  <Class JsonNode>
	//   35   86:aload_1         
	//   36   87:aload_2         
	//   37   88:invokevirtual   #149 <Method List JsonNode.findParents(String, List)>
	//   38   91:astore_2        
			}
		}

	//*  39   92:goto            16
		return list;
	//   40   95:aload_2         
	//   41   96:areturn         
	}

	public JsonNode findValue(String s)
	{
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map _children>
	//*   2    4:invokeinterface #71  <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #77  <Method Iterator Set.iterator()>
	//*   4   14:astore_2        
	//*   5   15:aload_2         
	//*   6   16:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   7   21:ifeq            77
		{
			Object obj = ((Object) ((java.util.Map.Entry)iterator.next()));
	//    8   24:aload_2         
	//    9   25:invokeinterface #87  <Method Object Iterator.next()>
	//   10   30:checkcast       #89  <Class java.util.Map$Entry>
	//   11   33:astore_3        
			if(s.equals(((java.util.Map.Entry) (obj)).getKey()))
	//*  12   34:aload_1         
	//*  13   35:aload_3         
	//*  14   36:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//*  15   41:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  16   44:ifeq            57
				return (JsonNode)((java.util.Map.Entry) (obj)).getValue();
	//   17   47:aload_3         
	//   18   48:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   19   53:checkcast       #97  <Class JsonNode>
	//   20   56:areturn         
			obj = ((Object) (((JsonNode)((java.util.Map.Entry) (obj)).getValue()).findValue(s)));
	//   21   57:aload_3         
	//   22   58:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   23   63:checkcast       #97  <Class JsonNode>
	//   24   66:aload_1         
	//   25   67:invokevirtual   #153 <Method JsonNode JsonNode.findValue(String)>
	//   26   70:astore_3        
			if(obj != null)
	//*  27   71:aload_3         
	//*  28   72:ifnull          15
				return ((JsonNode) (obj));
	//   29   75:aload_3         
	//   30   76:areturn         
		}

		return null;
	//   31   77:aconst_null     
	//   32   78:areturn         
	}

	public List findValues(String s, List list)
	{
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map _children>
	//*   2    4:invokeinterface #71  <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #77  <Method Iterator Set.iterator()>
	//*   4   14:astore          4
	//*   5   16:aload           4
	//*   6   18:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   7   23:ifeq            104
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//    8   26:aload           4
	//    9   28:invokeinterface #87  <Method Object Iterator.next()>
	//   10   33:checkcast       #89  <Class java.util.Map$Entry>
	//   11   36:astore          5
			if(s.equals(entry.getKey()))
	//*  12   38:aload_1         
	//*  13   39:aload           5
	//*  14   41:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//*  15   46:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  16   49:ifeq            85
			{
				Object obj = ((Object) (list));
	//   17   52:aload_2         
	//   18   53:astore_3        
				if(list == null)
	//*  19   54:aload_2         
	//*  20   55:ifnonnull       66
					obj = ((Object) (new ArrayList()));
	//   21   58:new             #141 <Class ArrayList>
	//   22   61:dup             
	//   23   62:invokespecial   #142 <Method void ArrayList()>
	//   24   65:astore_3        
				((List) (obj)).add(entry.getValue());
	//   25   66:aload_3         
	//   26   67:aload           5
	//   27   69:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   28   74:invokeinterface #147 <Method boolean List.add(Object)>
	//   29   79:pop             
				list = ((List) (obj));
	//   30   80:aload_3         
	//   31   81:astore_2        
			} else
	//*  32   82:goto            16
			{
				list = ((JsonNode)entry.getValue()).findValues(s, list);
	//   33   85:aload           5
	//   34   87:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   35   92:checkcast       #97  <Class JsonNode>
	//   36   95:aload_1         
	//   37   96:aload_2         
	//   38   97:invokevirtual   #156 <Method List JsonNode.findValues(String, List)>
	//   39  100:astore_2        
			}
		}

	//*  40  101:goto            16
		return list;
	//   41  104:aload_2         
	//   42  105:areturn         
	}

	public List findValuesAsText(String s, List list)
	{
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Map _children>
	//*   2    4:invokeinterface #71  <Method Set Map.entrySet()>
	//*   3    9:invokeinterface #77  <Method Iterator Set.iterator()>
	//*   4   14:astore          4
	//*   5   16:aload           4
	//*   6   18:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   7   23:ifeq            110
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//    8   26:aload           4
	//    9   28:invokeinterface #87  <Method Object Iterator.next()>
	//   10   33:checkcast       #89  <Class java.util.Map$Entry>
	//   11   36:astore          5
			if(s.equals(entry.getKey()))
	//*  12   38:aload_1         
	//*  13   39:aload           5
	//*  14   41:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//*  15   46:invokevirtual   #135 <Method boolean String.equals(Object)>
	//*  16   49:ifeq            91
			{
				Object obj = ((Object) (list));
	//   17   52:aload_2         
	//   18   53:astore_3        
				if(list == null)
	//*  19   54:aload_2         
	//*  20   55:ifnonnull       66
					obj = ((Object) (new ArrayList()));
	//   21   58:new             #141 <Class ArrayList>
	//   22   61:dup             
	//   23   62:invokespecial   #142 <Method void ArrayList()>
	//   24   65:astore_3        
				((List) (obj)).add(((Object) (((JsonNode)entry.getValue()).asText())));
	//   25   66:aload_3         
	//   26   67:aload           5
	//   27   69:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   28   74:checkcast       #97  <Class JsonNode>
	//   29   77:invokevirtual   #160 <Method String JsonNode.asText()>
	//   30   80:invokeinterface #147 <Method boolean List.add(Object)>
	//   31   85:pop             
				list = ((List) (obj));
	//   32   86:aload_3         
	//   33   87:astore_2        
			} else
	//*  34   88:goto            16
			{
				list = ((JsonNode)entry.getValue()).findValuesAsText(s, list);
	//   35   91:aload           5
	//   36   93:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   37   98:checkcast       #97  <Class JsonNode>
	//   38  101:aload_1         
	//   39  102:aload_2         
	//   40  103:invokevirtual   #162 <Method List JsonNode.findValuesAsText(String, List)>
	//   41  106:astore_2        
			}
		}

	//*  42  107:goto            16
		return list;
	//   43  110:aload_2         
	//   44  111:areturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #167 <Method JsonNode get(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(String s)
	{
		return ((TreeNode) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #35  <Method JsonNode get(String)>
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
	//    3    5:invokeinterface #118 <Method Object Map.get(Object)>
	//    4   10:checkcast       #97  <Class JsonNode>
	//    5   13:areturn         
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.OBJECT;
	//    0    0:getstatic       #176 <Field JsonNodeType JsonNodeType.OBJECT>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return _children.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #179 <Method int Map.hashCode()>
	//    3    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider)
	{
		return _children.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #183 <Method boolean Map.isEmpty()>
	//    3    9:ireturn         
	}

	public volatile TreeNode path(int i)
	{
		return ((TreeNode) (path(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #186 <Method JsonNode path(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode path(String s)
	{
		return ((TreeNode) (path(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #188 <Method JsonNode path(String)>
	//    3    5:areturn         
	}

	public JsonNode path(int i)
	{
		return ((JsonNode) (MissingNode.getInstance()));
	//    0    0:invokestatic    #194 <Method MissingNode MissingNode.getInstance()>
	//    1    3:areturn         
	}

	public JsonNode path(String s)
	{
		s = ((String) ((JsonNode)_children.get(((Object) (s)))));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #118 <Method Object Map.get(Object)>
	//    4   10:checkcast       #97  <Class JsonNode>
	//    5   13:astore_1        
		if(s != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          20
			return ((JsonNode) (s));
	//    8   18:aload_1         
	//    9   19:areturn         
		else
			return ((JsonNode) (MissingNode.getInstance()));
	//   10   20:invokestatic    #194 <Method MissingNode MissingNode.getInstance()>
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
	//    5    7:invokevirtual   #200 <Method NullNode nullNode()>
	//    6   10:astore_3        
		return (JsonNode)_children.put(((Object) (s)), obj);
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field Map _children>
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   12   22:checkcast       #97  <Class JsonNode>
	//   13   25:areturn         
	}

	public ObjectNode put(String s, double d)
	{
		return _put(s, ((JsonNode) (numberNode(d))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:dload_2         
	//    4    4:invokevirtual   #206 <Method NumericNode numberNode(double)>
	//    5    7:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public ObjectNode put(String s, float f)
	{
		return _put(s, ((JsonNode) (numberNode(f))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:fload_2         
	//    4    4:invokevirtual   #212 <Method NumericNode numberNode(float)>
	//    5    7:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public ObjectNode put(String s, int i)
	{
		return _put(s, ((JsonNode) (numberNode(i))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #216 <Method NumericNode numberNode(int)>
	//    5    7:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public ObjectNode put(String s, long l)
	{
		return _put(s, ((JsonNode) (numberNode(l))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:lload_2         
	//    4    4:invokevirtual   #220 <Method NumericNode numberNode(long)>
	//    5    7:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public ObjectNode put(String s, Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			boolean1 = ((Boolean) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			boolean1 = ((Boolean) (booleanNode(boolean1.booleanValue())));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #226 <Method boolean Boolean.booleanValue()>
	//   13   21:invokevirtual   #230 <Method BooleanNode booleanNode(boolean)>
	//   14   24:astore_2        
		return _put(s, ((JsonNode) (boolean1)));
	//*  15   25:goto            9
	}

	public ObjectNode put(String s, Double double1)
	{
		if(double1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			double1 = ((Double) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			double1 = ((Double) (numberNode(double1.doubleValue())));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #237 <Method double Double.doubleValue()>
	//   13   21:invokevirtual   #206 <Method NumericNode numberNode(double)>
	//   14   24:astore_2        
		return _put(s, ((JsonNode) (double1)));
	//*  15   25:goto            9
	}

	public ObjectNode put(String s, Float float1)
	{
		if(float1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			float1 = ((Float) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			float1 = ((Float) (numberNode(float1.floatValue())));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #244 <Method float Float.floatValue()>
	//   13   21:invokevirtual   #212 <Method NumericNode numberNode(float)>
	//   14   24:astore_2        
		return _put(s, ((JsonNode) (float1)));
	//*  15   25:goto            9
	}

	public ObjectNode put(String s, Integer integer)
	{
		if(integer == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			integer = ((Integer) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			integer = ((Integer) (numberNode(integer.intValue())));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #250 <Method int Integer.intValue()>
	//   13   21:invokevirtual   #216 <Method NumericNode numberNode(int)>
	//   14   24:astore_2        
		return _put(s, ((JsonNode) (integer)));
	//*  15   25:goto            9
	}

	public ObjectNode put(String s, Long long1)
	{
		if(long1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			long1 = ((Long) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			long1 = ((Long) (numberNode(long1.longValue())));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #257 <Method long Long.longValue()>
	//   13   21:invokevirtual   #220 <Method NumericNode numberNode(long)>
	//   14   24:astore_2        
		return _put(s, ((JsonNode) (long1)));
	//*  15   25:goto            9
	}

	public ObjectNode put(String s, Short short1)
	{
		if(short1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			short1 = ((Short) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			short1 = ((Short) (numberNode(short1.shortValue())));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #264 <Method short Short.shortValue()>
	//   13   21:invokevirtual   #267 <Method NumericNode numberNode(short)>
	//   14   24:astore_2        
		return _put(s, ((JsonNode) (short1)));
	//*  15   25:goto            9
	}

	public ObjectNode put(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			s1 = ((String) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			s1 = ((String) (textNode(s1)));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #272 <Method TextNode textNode(String)>
	//   13   21:astore_2        
		return _put(s, ((JsonNode) (s1)));
	//*  14   22:goto            9
	}

	public ObjectNode put(String s, BigDecimal bigdecimal)
	{
		if(bigdecimal == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			bigdecimal = ((BigDecimal) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			bigdecimal = ((BigDecimal) (numberNode(bigdecimal)));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #276 <Method NumericNode numberNode(BigDecimal)>
	//   13   21:astore_2        
		return _put(s, ((JsonNode) (bigdecimal)));
	//*  14   22:goto            9
	}

	public ObjectNode put(String s, short word0)
	{
		return _put(s, ((JsonNode) (numberNode(word0))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #267 <Method NumericNode numberNode(short)>
	//    5    7:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public ObjectNode put(String s, boolean flag)
	{
		return _put(s, ((JsonNode) (booleanNode(flag))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #230 <Method BooleanNode booleanNode(boolean)>
	//    5    7:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public ObjectNode put(String s, byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       16
			abyte0 = ((byte []) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #200 <Method NullNode nullNode()>
	//    4    8:astore_2        
		else
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//*   9   15:areturn         
			abyte0 = ((byte []) (binaryNode(abyte0)));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #283 <Method BinaryNode binaryNode(byte[])>
	//   13   21:astore_2        
		return _put(s, ((JsonNode) (abyte0)));
	//*  14   22:goto            9
	}

	public JsonNode putAll(ObjectNode objectnode)
	{
		return setAll(objectnode);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #288 <Method JsonNode setAll(ObjectNode)>
	//    3    5:areturn         
	}

	public JsonNode putAll(Map map)
	{
		return setAll(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #291 <Method JsonNode setAll(Map)>
	//    3    5:areturn         
	}

	public ArrayNode putArray(String s)
	{
		ArrayNode arraynode = arrayNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #298 <Method ArrayNode arrayNode()>
	//    2    4:astore_2        
		_put(s, ((JsonNode) (arraynode)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    7   11:pop             
		return arraynode;
	//    8   12:aload_2         
	//    9   13:areturn         
	}

	public ObjectNode putNull(String s)
	{
		_children.put(((Object) (s)), ((Object) (nullNode())));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #200 <Method NullNode nullNode()>
	//    5    9:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//    6   14:pop             
		return this;
	//    7   15:aload_0         
	//    8   16:areturn         
	}

	public ObjectNode putObject(String s)
	{
		ObjectNode objectnode = objectNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #303 <Method ObjectNode objectNode()>
	//    2    4:astore_2        
		_put(s, ((JsonNode) (objectnode)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    7   11:pop             
		return objectnode;
	//    8   12:aload_2         
	//    9   13:areturn         
	}

	public ObjectNode putPOJO(String s, Object obj)
	{
		return _put(s, ((JsonNode) (pojoNode(obj))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #309 <Method ValueNode pojoNode(Object)>
	//    5    7:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public ObjectNode putRawValue(String s, RawValue rawvalue)
	{
		return _put(s, ((JsonNode) (rawValueNode(rawvalue))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:aload_2         
	//    4    4:invokevirtual   #315 <Method ValueNode rawValueNode(RawValue)>
	//    5    7:invokevirtual   #208 <Method ObjectNode _put(String, JsonNode)>
	//    6   10:areturn         
	}

	public JsonNode remove(String s)
	{
		return (JsonNode)_children.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #318 <Method Object Map.remove(Object)>
	//    4   10:checkcast       #97  <Class JsonNode>
	//    5   13:areturn         
	}

	public ObjectNode remove(Collection collection)
	{
		_children.keySet().removeAll(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #125 <Method Set Map.keySet()>
	//    3    9:aload_1         
	//    4   10:invokeinterface #323 <Method boolean Set.removeAll(Collection)>
	//    5   15:pop             
		return this;
	//    6   16:aload_0         
	//    7   17:areturn         
	}

	public volatile ContainerNode removeAll()
	{
		return ((ContainerNode) (removeAll()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #327 <Method ObjectNode removeAll()>
	//    2    4:areturn         
	}

	public ObjectNode removeAll()
	{
		_children.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #330 <Method void Map.clear()>
		return this;
	//    3    9:aload_0         
	//    4   10:areturn         
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
	//    5    7:invokevirtual   #200 <Method NullNode nullNode()>
	//    6   10:astore_3        
		return (JsonNode)_children.put(((Object) (s)), obj);
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field Map _children>
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   12   22:checkcast       #97  <Class JsonNode>
	//   13   25:areturn         
	}

	public ObjectNode retain(Collection collection)
	{
		_children.keySet().retainAll(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #125 <Method Set Map.keySet()>
	//    3    9:aload_1         
	//    4   10:invokeinterface #335 <Method boolean Set.retainAll(Collection)>
	//    5   15:pop             
		return this;
	//    6   16:aload_0         
	//    7   17:areturn         
	}

	public transient ObjectNode retain(String as[])
	{
		return retain(((Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #342 <Method List Arrays.asList(Object[])>
	//    3    5:invokevirtual   #344 <Method ObjectNode retain(Collection)>
	//    4    8:areturn         
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeStartObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #355 <Method void JsonGenerator.writeStartObject()>
		java.util.Map.Entry entry;
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); ((BaseJsonNode)entry.getValue()).serialize(jsongenerator, serializerprovider))
	//*   2    4:aload_0         
	//*   3    5:getfield        #19  <Field Map _children>
	//*   4    8:invokeinterface #71  <Method Set Map.entrySet()>
	//*   5   13:invokeinterface #77  <Method Iterator Set.iterator()>
	//*   6   18:astore_3        
	//*   7   19:aload_3         
	//*   8   20:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   9   25:ifeq            71
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   10   28:aload_3         
	//   11   29:invokeinterface #87  <Method Object Iterator.next()>
	//   12   34:checkcast       #89  <Class java.util.Map$Entry>
	//   13   37:astore          4
			jsongenerator.writeFieldName((String)entry.getKey());
	//   14   39:aload_1         
	//   15   40:aload           4
	//   16   42:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//   17   47:checkcast       #134 <Class String>
	//   18   50:invokevirtual   #359 <Method void JsonGenerator.writeFieldName(String)>
		}

	//   19   53:aload           4
	//   20   55:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   21   60:checkcast       #361 <Class BaseJsonNode>
	//   22   63:aload_1         
	//   23   64:aload_2         
	//   24   65:invokevirtual   #363 <Method void BaseJsonNode.serialize(JsonGenerator, SerializerProvider)>
	//*  25   68:goto            19
		jsongenerator.writeEndObject();
	//   26   71:aload_1         
	//   27   72:invokevirtual   #366 <Method void JsonGenerator.writeEndObject()>
	//   28   75:return          
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException, JsonProcessingException
	{
		typeserializer.writeTypePrefixForObject(((Object) (this)), jsongenerator);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #375 <Method void TypeSerializer.writeTypePrefixForObject(Object, JsonGenerator)>
		java.util.Map.Entry entry;
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); ((BaseJsonNode)entry.getValue()).serialize(jsongenerator, serializerprovider))
	//*   4    6:aload_0         
	//*   5    7:getfield        #19  <Field Map _children>
	//*   6   10:invokeinterface #71  <Method Set Map.entrySet()>
	//*   7   15:invokeinterface #77  <Method Iterator Set.iterator()>
	//*   8   20:astore          4
	//*   9   22:aload           4
	//*  10   24:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*  11   29:ifeq            76
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   12   32:aload           4
	//   13   34:invokeinterface #87  <Method Object Iterator.next()>
	//   14   39:checkcast       #89  <Class java.util.Map$Entry>
	//   15   42:astore          5
			jsongenerator.writeFieldName((String)entry.getKey());
	//   16   44:aload_1         
	//   17   45:aload           5
	//   18   47:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//   19   52:checkcast       #134 <Class String>
	//   20   55:invokevirtual   #359 <Method void JsonGenerator.writeFieldName(String)>
		}

	//   21   58:aload           5
	//   22   60:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   23   65:checkcast       #361 <Class BaseJsonNode>
	//   24   68:aload_1         
	//   25   69:aload_2         
	//   26   70:invokevirtual   #363 <Method void BaseJsonNode.serialize(JsonGenerator, SerializerProvider)>
	//*  27   73:goto            22
		typeserializer.writeTypeSuffixForObject(((Object) (this)), jsongenerator);
	//   28   76:aload_3         
	//   29   77:aload_0         
	//   30   78:aload_1         
	//   31   79:invokevirtual   #378 <Method void TypeSerializer.writeTypeSuffixForObject(Object, JsonGenerator)>
	//   32   82:return          
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
	//    5    7:invokevirtual   #200 <Method NullNode nullNode()>
	//    6   10:astore_3        
		_children.put(((Object) (s)), obj);
	//    7   11:aload_0         
	//    8   12:getfield        #19  <Field Map _children>
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   12   22:pop             
		return ((JsonNode) (this));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	public JsonNode setAll(ObjectNode objectnode)
	{
		_children.putAll(objectnode._children);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:getfield        #19  <Field Map _children>
	//    4    8:invokeinterface #382 <Method void Map.putAll(Map)>
		return ((JsonNode) (this));
	//    5   13:aload_0         
	//    6   14:areturn         
	}

	public JsonNode setAll(Map map)
	{
		java.util.Map.Entry entry;
		for(Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); _children.put(entry.getKey(), ((Object) (map))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #71  <Method Set Map.entrySet()>
	//*   2    6:invokeinterface #77  <Method Iterator Set.iterator()>
	//*   3   11:astore_3        
	//*   4   12:aload_3         
	//*   5   13:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*   6   18:ifeq            75
		{
			entry = (java.util.Map.Entry)iterator.next();
	//    7   21:aload_3         
	//    8   22:invokeinterface #87  <Method Object Iterator.next()>
	//    9   27:checkcast       #89  <Class java.util.Map$Entry>
	//   10   30:astore          4
			JsonNode jsonnode = (JsonNode)entry.getValue();
	//   11   32:aload           4
	//   12   34:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   13   39:checkcast       #97  <Class JsonNode>
	//   14   42:astore_2        
			map = ((Map) (jsonnode));
	//   15   43:aload_2         
	//   16   44:astore_1        
			if(jsonnode == null)
	//*  17   45:aload_2         
	//*  18   46:ifnonnull       54
				map = ((Map) (nullNode()));
	//   19   49:aload_0         
	//   20   50:invokevirtual   #200 <Method NullNode nullNode()>
	//   21   53:astore_1        
		}

	//   22   54:aload_0         
	//   23   55:getfield        #19  <Field Map _children>
	//   24   58:aload           4
	//   25   60:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//   26   65:aload_1         
	//   27   66:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   28   71:pop             
	//*  29   72:goto            12
		return ((JsonNode) (this));
	//   30   75:aload_0         
	//   31   76:areturn         
	}

	public int size()
	{
		return _children.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #115 <Method int Map.size()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder((size() << 4) + 32);
	//    0    0:new             #385 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #386 <Method int size()>
	//    4    8:iconst_4        
	//    5    9:ishl            
	//    6   10:bipush          32
	//    7   12:iadd            
	//    8   13:invokespecial   #389 <Method void StringBuilder(int)>
	//    9   16:astore_2        
		stringbuilder.append("{");
	//   10   17:aload_2         
	//   11   18:ldc2            #391 <String "{">
	//   12   21:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
		int i = 0;
	//   14   25:iconst_0        
	//   15   26:istore_1        
		java.util.Map.Entry entry;
		for(Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(((JsonNode)entry.getValue()).toString()))
	//*  16   27:aload_0         
	//*  17   28:getfield        #19  <Field Map _children>
	//*  18   31:invokeinterface #71  <Method Set Map.entrySet()>
	//*  19   36:invokeinterface #77  <Method Iterator Set.iterator()>
	//*  20   41:astore_3        
	//*  21   42:aload_3         
	//*  22   43:invokeinterface #83  <Method boolean Iterator.hasNext()>
	//*  23   48:ifeq            120
		{
			entry = (java.util.Map.Entry)iterator.next();
	//   24   51:aload_3         
	//   25   52:invokeinterface #87  <Method Object Iterator.next()>
	//   26   57:checkcast       #89  <Class java.util.Map$Entry>
	//   27   60:astore          4
			if(i > 0)
	//*  28   62:iload_1         
	//*  29   63:ifle            74
				stringbuilder.append(",");
	//   30   66:aload_2         
	//   31   67:ldc2            #397 <String ",">
	//   32   70:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   33   73:pop             
			i++;
	//   34   74:iload_1         
	//   35   75:iconst_1        
	//   36   76:iadd            
	//   37   77:istore_1        
			TextNode.appendQuoted(stringbuilder, (String)entry.getKey());
	//   38   78:aload_2         
	//   39   79:aload           4
	//   40   81:invokeinterface #92  <Method Object java.util.Map$Entry.getKey()>
	//   41   86:checkcast       #134 <Class String>
	//   42   89:invokestatic    #403 <Method void TextNode.appendQuoted(StringBuilder, String)>
			stringbuilder.append(':');
	//   43   92:aload_2         
	//   44   93:bipush          58
	//   45   95:invokevirtual   #406 <Method StringBuilder StringBuilder.append(char)>
	//   46   98:pop             
		}

	//   47   99:aload_2         
	//   48  100:aload           4
	//   49  102:invokeinterface #95  <Method Object java.util.Map$Entry.getValue()>
	//   50  107:checkcast       #97  <Class JsonNode>
	//   51  110:invokevirtual   #408 <Method String JsonNode.toString()>
	//   52  113:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   53  116:pop             
	//*  54  117:goto            42
		stringbuilder.append("}");
	//   55  120:aload_2         
	//   56  121:ldc2            #410 <String "}">
	//   57  124:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   58  127:pop             
		return stringbuilder.toString();
	//   59  128:aload_2         
	//   60  129:invokevirtual   #411 <Method String StringBuilder.toString()>
	//   61  132:areturn         
	}

	public volatile JsonNode with(String s)
	{
		return ((JsonNode) (with(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #414 <Method ObjectNode with(String)>
	//    3    5:areturn         
	}

	public ObjectNode with(String s)
	{
		JsonNode jsonnode = (JsonNode)_children.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #118 <Method Object Map.get(Object)>
	//    4   10:checkcast       #97  <Class JsonNode>
	//    5   13:astore_2        
		if(jsonnode != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          80
		{
			if(jsonnode instanceof ObjectNode)
	//*   8   18:aload_2         
	//*   9   19:instanceof      #2   <Class ObjectNode>
	//*  10   22:ifeq            30
				return (ObjectNode)jsonnode;
	//   11   25:aload_2         
	//   12   26:checkcast       #2   <Class ObjectNode>
	//   13   29:areturn         
			else
				throw new UnsupportedOperationException((new StringBuilder()).append("Property '").append(s).append("' has value that is not of type ObjectNode (but ").append(((Object) (jsonnode)).getClass().getName()).append(")").toString());
	//   14   30:new             #416 <Class UnsupportedOperationException>
	//   15   33:dup             
	//   16   34:new             #385 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #417 <Method void StringBuilder()>
	//   19   41:ldc2            #419 <String "Property '">
	//   20   44:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:ldc2            #421 <String "' has value that is not of type ObjectNode (but ">
	//   24   54:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:aload_2         
	//   26   58:invokevirtual   #427 <Method Class Object.getClass()>
	//   27   61:invokevirtual   #432 <Method String Class.getName()>
	//   28   64:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   29   67:ldc2            #434 <String ")">
	//   30   70:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   31   73:invokevirtual   #411 <Method String StringBuilder.toString()>
	//   32   76:invokespecial   #436 <Method void UnsupportedOperationException(String)>
	//   33   79:athrow          
		} else
		{
			ObjectNode objectnode = objectNode();
	//   34   80:aload_0         
	//   35   81:invokevirtual   #303 <Method ObjectNode objectNode()>
	//   36   84:astore_2        
			_children.put(((Object) (s)), ((Object) (objectnode)));
	//   37   85:aload_0         
	//   38   86:getfield        #19  <Field Map _children>
	//   39   89:aload_1         
	//   40   90:aload_2         
	//   41   91:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   42   96:pop             
			return objectnode;
	//   43   97:aload_2         
	//   44   98:areturn         
		}
	}

	public volatile JsonNode withArray(String s)
	{
		return ((JsonNode) (withArray(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #439 <Method ArrayNode withArray(String)>
	//    3    5:areturn         
	}

	public ArrayNode withArray(String s)
	{
		JsonNode jsonnode = (JsonNode)_children.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #118 <Method Object Map.get(Object)>
	//    4   10:checkcast       #97  <Class JsonNode>
	//    5   13:astore_2        
		if(jsonnode != null)
	//*   6   14:aload_2         
	//*   7   15:ifnull          80
		{
			if(jsonnode instanceof ArrayNode)
	//*   8   18:aload_2         
	//*   9   19:instanceof      #441 <Class ArrayNode>
	//*  10   22:ifeq            30
				return (ArrayNode)jsonnode;
	//   11   25:aload_2         
	//   12   26:checkcast       #441 <Class ArrayNode>
	//   13   29:areturn         
			else
				throw new UnsupportedOperationException((new StringBuilder()).append("Property '").append(s).append("' has value that is not of type ArrayNode (but ").append(((Object) (jsonnode)).getClass().getName()).append(")").toString());
	//   14   30:new             #416 <Class UnsupportedOperationException>
	//   15   33:dup             
	//   16   34:new             #385 <Class StringBuilder>
	//   17   37:dup             
	//   18   38:invokespecial   #417 <Method void StringBuilder()>
	//   19   41:ldc2            #419 <String "Property '">
	//   20   44:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   23   51:ldc2            #443 <String "' has value that is not of type ArrayNode (but ">
	//   24   54:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   25   57:aload_2         
	//   26   58:invokevirtual   #427 <Method Class Object.getClass()>
	//   27   61:invokevirtual   #432 <Method String Class.getName()>
	//   28   64:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   29   67:ldc2            #434 <String ")">
	//   30   70:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   31   73:invokevirtual   #411 <Method String StringBuilder.toString()>
	//   32   76:invokespecial   #436 <Method void UnsupportedOperationException(String)>
	//   33   79:athrow          
		} else
		{
			ArrayNode arraynode = arrayNode();
	//   34   80:aload_0         
	//   35   81:invokevirtual   #298 <Method ArrayNode arrayNode()>
	//   36   84:astore_2        
			_children.put(((Object) (s)), ((Object) (arraynode)));
	//   37   85:aload_0         
	//   38   86:getfield        #19  <Field Map _children>
	//   39   89:aload_1         
	//   40   90:aload_2         
	//   41   91:invokeinterface #49  <Method Object Map.put(Object, Object)>
	//   42   96:pop             
			return arraynode;
	//   43   97:aload_2         
	//   44   98:areturn         
		}
	}

	public JsonNode without(String s)
	{
		_children.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #318 <Method Object Map.remove(Object)>
	//    4   10:pop             
		return ((JsonNode) (this));
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public ObjectNode without(Collection collection)
	{
		_children.keySet().removeAll(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Map _children>
	//    2    4:invokeinterface #125 <Method Set Map.keySet()>
	//    3    9:aload_1         
	//    4   10:invokeinterface #323 <Method boolean Set.removeAll(Collection)>
	//    5   15:pop             
		return this;
	//    6   16:aload_0         
	//    7   17:areturn         
	}

	protected final Map _children;
}
