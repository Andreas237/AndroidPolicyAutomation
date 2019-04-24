// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ContainerNode, ObjectNode, JsonNodeType, MissingNode, 
//			BaseJsonNode, JsonNodeFactory

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

	public ArrayNode(JsonNodeFactory jsonnodefactory, List list)
	{
		super(jsonnodefactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContainerNode(JsonNodeFactory)>
		_children = list;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field List _children>
	//    6   10:return          
	}

	protected ArrayNode _add(JsonNode jsonnode)
	{
		_children.add(((Object) (jsonnode)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method boolean List.add(Object)>
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
	//    2    2:invokevirtual   #39  <Method int JsonPointer.getMatchingIndex()>
	//    3    5:invokevirtual   #43  <Method JsonNode get(int)>
	//    4    8:areturn         
	}

	protected boolean _childrenEqual(ArrayNode arraynode)
	{
		return _children.equals(((Object) (arraynode._children)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:aload_1         
	//    3    5:getfield        #19  <Field List _children>
	//    4    8:invokeinterface #48  <Method boolean List.equals(Object)>
	//    5   13:ireturn         
	}

	protected ArrayNode _insert(int i, JsonNode jsonnode)
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            17
		{
			_children.add(0, ((Object) (jsonnode)));
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field List _children>
	//    4    8:iconst_0        
	//    5    9:aload_2         
	//    6   10:invokeinterface #53  <Method void List.add(int, Object)>
			return this;
	//    7   15:aload_0         
	//    8   16:areturn         
		}
		if(i >= _children.size())
	//*   9   17:iload_1         
	//*  10   18:aload_0         
	//*  11   19:getfield        #19  <Field List _children>
	//*  12   22:invokeinterface #56  <Method int List.size()>
	//*  13   27:icmplt          43
		{
			_children.add(((Object) (jsonnode)));
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field List _children>
	//   16   34:aload_2         
	//   17   35:invokeinterface #31  <Method boolean List.add(Object)>
	//   18   40:pop             
			return this;
	//   19   41:aload_0         
	//   20   42:areturn         
		} else
		{
			_children.add(i, ((Object) (jsonnode)));
	//   21   43:aload_0         
	//   22   44:getfield        #19  <Field List _children>
	//   23   47:iload_1         
	//   24   48:aload_2         
	//   25   49:invokeinterface #53  <Method void List.add(int, Object)>
			return this;
	//   26   54:aload_0         
	//   27   55:areturn         
		}
	}

	public ArrayNode add(double d)
	{
		return _add(((JsonNode) (numberNode(d))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:dload_1         
	//    3    3:invokevirtual   #61  <Method NumericNode numberNode(double)>
	//    4    6:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//    5    9:areturn         
	}

	public ArrayNode add(float f)
	{
		return _add(((JsonNode) (numberNode(f))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:fload_1         
	//    3    3:invokevirtual   #67  <Method NumericNode numberNode(float)>
	//    4    6:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//    5    9:areturn         
	}

	public ArrayNode add(int i)
	{
		_add(((JsonNode) (numberNode(i))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #71  <Method NumericNode numberNode(int)>
	//    4    6:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public ArrayNode add(long l)
	{
		return _add(((JsonNode) (numberNode(l))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:lload_1         
	//    3    3:invokevirtual   #75  <Method NumericNode numberNode(long)>
	//    4    6:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//    5    9:areturn         
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
	//    5    7:invokevirtual   #79  <Method NullNode nullNode()>
	//    6   10:astore_2        
		_add(((JsonNode) (obj)));
	//    7   11:aload_0         
	//    8   12:aload_2         
	//    9   13:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   10   16:pop             
		return this;
	//   11   17:aload_0         
	//   12   18:areturn         
	}

	public ArrayNode add(Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (booleanNode(boolean1.booleanValue()))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #90  <Method boolean Boolean.booleanValue()>
	//    9   15:invokevirtual   #94  <Method BooleanNode booleanNode(boolean)>
	//   10   18:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   11   21:areturn         
	}

	public ArrayNode add(Double double1)
	{
		if(double1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (numberNode(double1.doubleValue()))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #101 <Method double Double.doubleValue()>
	//    9   15:invokevirtual   #61  <Method NumericNode numberNode(double)>
	//   10   18:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   11   21:areturn         
	}

	public ArrayNode add(Float float1)
	{
		if(float1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (numberNode(float1.floatValue()))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #108 <Method float Float.floatValue()>
	//    9   15:invokevirtual   #67  <Method NumericNode numberNode(float)>
	//   10   18:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   11   21:areturn         
	}

	public ArrayNode add(Integer integer)
	{
		if(integer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (numberNode(integer.intValue()))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #114 <Method int Integer.intValue()>
	//    9   15:invokevirtual   #71  <Method NumericNode numberNode(int)>
	//   10   18:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   11   21:areturn         
	}

	public ArrayNode add(Long long1)
	{
		if(long1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (numberNode(long1.longValue()))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #121 <Method long Long.longValue()>
	//    9   15:invokevirtual   #75  <Method NumericNode numberNode(long)>
	//   10   18:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   11   21:areturn         
	}

	public ArrayNode add(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (textNode(s))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #126 <Method TextNode textNode(String)>
	//    9   15:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   10   18:areturn         
	}

	public ArrayNode add(BigDecimal bigdecimal)
	{
		if(bigdecimal == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (numberNode(bigdecimal))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #130 <Method NumericNode numberNode(BigDecimal)>
	//    9   15:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   10   18:areturn         
	}

	public ArrayNode add(boolean flag)
	{
		return _add(((JsonNode) (booleanNode(flag))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:invokevirtual   #94  <Method BooleanNode booleanNode(boolean)>
	//    4    6:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//    5    9:areturn         
	}

	public ArrayNode add(byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:areturn         
		else
			return _add(((JsonNode) (binaryNode(abyte0))));
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #136 <Method BinaryNode binaryNode(byte[])>
	//    9   15:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   10   18:areturn         
	}

	public ArrayNode addAll(ArrayNode arraynode)
	{
		_children.addAll(((Collection) (arraynode._children)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:aload_1         
	//    3    5:getfield        #19  <Field List _children>
	//    4    8:invokeinterface #141 <Method boolean List.addAll(Collection)>
	//    5   13:pop             
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public ArrayNode addAll(Collection collection)
	{
		_children.addAll(collection);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:aload_1         
	//    3    5:invokeinterface #141 <Method boolean List.addAll(Collection)>
	//    4   10:pop             
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public ArrayNode addArray()
	{
		ArrayNode arraynode = arrayNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method ArrayNode arrayNode()>
	//    2    4:astore_1        
		_add(((JsonNode) (arraynode)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//    6   10:pop             
		return arraynode;
	//    7   11:aload_1         
	//    8   12:areturn         
	}

	public ArrayNode addNull()
	{
		_add(((JsonNode) (nullNode())));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #79  <Method NullNode nullNode()>
	//    3    5:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//    4    8:pop             
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public ObjectNode addObject()
	{
		ObjectNode objectnode = objectNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method ObjectNode objectNode()>
	//    2    4:astore_1        
		_add(((JsonNode) (objectnode)));
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//    6   10:pop             
		return objectnode;
	//    7   11:aload_1         
	//    8   12:areturn         
	}

	public ArrayNode addPOJO(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:pop             
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		} else
		{
			_add(((JsonNode) (pojoNode(obj))));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #158 <Method ValueNode pojoNode(Object)>
	//   11   17:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   12   20:pop             
			return this;
	//   13   21:aload_0         
	//   14   22:areturn         
		}
	}

	public ArrayNode addRawValue(RawValue rawvalue)
	{
		if(rawvalue == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       11
		{
			addNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #84  <Method ArrayNode addNull()>
	//    4    8:pop             
			return this;
	//    5    9:aload_0         
	//    6   10:areturn         
		} else
		{
			_add(((JsonNode) (rawValueNode(rawvalue))));
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #164 <Method ValueNode rawValueNode(RawValue)>
	//   11   17:invokevirtual   #63  <Method ArrayNode _add(JsonNode)>
	//   12   20:pop             
			return this;
	//   13   21:aload_0         
	//   14   22:areturn         
		}
	}

	public JsonToken asToken()
	{
		return JsonToken.START_ARRAY;
	//    0    0:getstatic       #172 <Field JsonToken JsonToken.START_ARRAY>
	//    1    3:areturn         
	}

	public volatile JsonNode deepCopy()
	{
		return ((JsonNode) (deepCopy()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #176 <Method ArrayNode deepCopy()>
	//    2    4:areturn         
	}

	public ArrayNode deepCopy()
	{
		ArrayNode arraynode = new ArrayNode(_nodeFactory);
	//    0    0:new             #2   <Class ArrayNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #180 <Field JsonNodeFactory _nodeFactory>
	//    4    8:invokespecial   #181 <Method void ArrayNode(JsonNodeFactory)>
	//    5   11:astore_1        
		JsonNode jsonnode;
		for(Iterator iterator = _children.iterator(); iterator.hasNext(); arraynode._children.add(((Object) (jsonnode.deepCopy()))))
	//*   6   12:aload_0         
	//*   7   13:getfield        #19  <Field List _children>
	//*   8   16:invokeinterface #185 <Method Iterator List.iterator()>
	//*   9   21:astore_2        
	//*  10   22:aload_2         
	//*  11   23:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*  12   28:ifeq            58
			jsonnode = (JsonNode)iterator.next();
	//   13   31:aload_2         
	//   14   32:invokeinterface #194 <Method Object Iterator.next()>
	//   15   37:checkcast       #196 <Class JsonNode>
	//   16   40:astore_3        

	//   17   41:aload_1         
	//   18   42:getfield        #19  <Field List _children>
	//   19   45:aload_3         
	//   20   46:invokevirtual   #198 <Method JsonNode JsonNode.deepCopy()>
	//   21   49:invokeinterface #31  <Method boolean List.add(Object)>
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
	//    2    4:invokeinterface #185 <Method Iterator List.iterator()>
	//    3    9:areturn         
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
				if(obj instanceof ArrayNode)
	//*  15   19:aload_1         
	//*  16   20:instanceof      #2   <Class ArrayNode>
	//*  17   23:ifeq            9
					return _children.equals(((Object) (((ArrayNode)obj)._children)));
	//   18   26:aload_0         
	//   19   27:getfield        #19  <Field List _children>
	//   20   30:aload_1         
	//   21   31:checkcast       #2   <Class ArrayNode>
	//   22   34:getfield        #19  <Field List _children>
	//   23   37:invokeinterface #48  <Method boolean List.equals(Object)>
	//   24   42:ireturn         
			}
		}
		return flag;
	}

	public boolean equals(Comparator comparator, JsonNode jsonnode)
	{
		if(!(jsonnode instanceof ArrayNode))
	//*   0    0:aload_2         
	//*   1    1:instanceof      #2   <Class ArrayNode>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		Object obj = ((Object) ((ArrayNode)jsonnode));
	//    5    9:aload_2         
	//    6   10:checkcast       #2   <Class ArrayNode>
	//    7   13:astore          5
		int j = _children.size();
	//    8   15:aload_0         
	//    9   16:getfield        #19  <Field List _children>
	//   10   19:invokeinterface #56  <Method int List.size()>
	//   11   24:istore          4
		if(((ArrayNode) (obj)).size() != j)
	//*  12   26:aload           5
	//*  13   28:invokevirtual   #202 <Method int size()>
	//*  14   31:iload           4
	//*  15   33:icmpeq          38
			return false;
	//   16   36:iconst_0        
	//   17   37:ireturn         
		jsonnode = ((JsonNode) (_children));
	//   18   38:aload_0         
	//   19   39:getfield        #19  <Field List _children>
	//   20   42:astore_2        
		obj = ((Object) (((ArrayNode) (obj))._children));
	//   21   43:aload           5
	//   22   45:getfield        #19  <Field List _children>
	//   23   48:astore          5
		for(int i = 0; i < j; i++)
	//*  24   50:iconst_0        
	//*  25   51:istore_3        
	//*  26   52:iload_3         
	//*  27   53:iload           4
	//*  28   55:icmpge          95
			if(!((JsonNode)((List) (jsonnode)).get(i)).equals(comparator, (JsonNode)((List) (obj)).get(i)))
	//*  29   58:aload_2         
	//*  30   59:iload_3         
	//*  31   60:invokeinterface #205 <Method Object List.get(int)>
	//*  32   65:checkcast       #196 <Class JsonNode>
	//*  33   68:aload_1         
	//*  34   69:aload           5
	//*  35   71:iload_3         
	//*  36   72:invokeinterface #205 <Method Object List.get(int)>
	//*  37   77:checkcast       #196 <Class JsonNode>
	//*  38   80:invokevirtual   #207 <Method boolean JsonNode.equals(Comparator, JsonNode)>
	//*  39   83:ifne            88
				return false;
	//   40   86:iconst_0        
	//   41   87:ireturn         

	//   42   88:iload_3         
	//   43   89:iconst_1        
	//   44   90:iadd            
	//   45   91:istore_3        
	//*  46   92:goto            52
		return true;
	//   47   95:iconst_1        
	//   48   96:ireturn         
	}

	public volatile JsonNode findParent(String s)
	{
		return ((JsonNode) (findParent(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #213 <Method ObjectNode findParent(String)>
	//    3    5:areturn         
	}

	public ObjectNode findParent(String s)
	{
		for(Iterator iterator = _children.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List _children>
	//*   2    4:invokeinterface #185 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            42
		{
			JsonNode jsonnode = ((JsonNode)iterator.next()).findParent(s);
	//    7   19:aload_2         
	//    8   20:invokeinterface #194 <Method Object Iterator.next()>
	//    9   25:checkcast       #196 <Class JsonNode>
	//   10   28:aload_1         
	//   11   29:invokevirtual   #215 <Method JsonNode JsonNode.findParent(String)>
	//   12   32:astore_3        
			if(jsonnode != null)
	//*  13   33:aload_3         
	//*  14   34:ifnull          10
				return (ObjectNode)jsonnode;
	//   15   37:aload_3         
	//   16   38:checkcast       #217 <Class ObjectNode>
	//   17   41:areturn         
		}

		return null;
	//   18   42:aconst_null     
	//   19   43:areturn         
	}

	public List findParents(String s, List list)
	{
		for(Iterator iterator = _children.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List _children>
	//*   2    4:invokeinterface #185 <Method Iterator List.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            37
			list = ((JsonNode)iterator.next()).findParents(s, list);
	//    7   19:aload_3         
	//    8   20:invokeinterface #194 <Method Object Iterator.next()>
	//    9   25:checkcast       #196 <Class JsonNode>
	//   10   28:aload_1         
	//   11   29:aload_2         
	//   12   30:invokevirtual   #221 <Method List JsonNode.findParents(String, List)>
	//   13   33:astore_2        

	//*  14   34:goto            10
		return list;
	//   15   37:aload_2         
	//   16   38:areturn         
	}

	public JsonNode findValue(String s)
	{
		for(Iterator iterator = _children.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List _children>
	//*   2    4:invokeinterface #185 <Method Iterator List.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            39
		{
			JsonNode jsonnode = ((JsonNode)iterator.next()).findValue(s);
	//    7   19:aload_2         
	//    8   20:invokeinterface #194 <Method Object Iterator.next()>
	//    9   25:checkcast       #196 <Class JsonNode>
	//   10   28:aload_1         
	//   11   29:invokevirtual   #225 <Method JsonNode JsonNode.findValue(String)>
	//   12   32:astore_3        
			if(jsonnode != null)
	//*  13   33:aload_3         
	//*  14   34:ifnull          10
				return jsonnode;
	//   15   37:aload_3         
	//   16   38:areturn         
		}

		return null;
	//   17   39:aconst_null     
	//   18   40:areturn         
	}

	public List findValues(String s, List list)
	{
		for(Iterator iterator = _children.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List _children>
	//*   2    4:invokeinterface #185 <Method Iterator List.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            37
			list = ((JsonNode)iterator.next()).findValues(s, list);
	//    7   19:aload_3         
	//    8   20:invokeinterface #194 <Method Object Iterator.next()>
	//    9   25:checkcast       #196 <Class JsonNode>
	//   10   28:aload_1         
	//   11   29:aload_2         
	//   12   30:invokevirtual   #228 <Method List JsonNode.findValues(String, List)>
	//   13   33:astore_2        

	//*  14   34:goto            10
		return list;
	//   15   37:aload_2         
	//   16   38:areturn         
	}

	public List findValuesAsText(String s, List list)
	{
		for(Iterator iterator = _children.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field List _children>
	//*   2    4:invokeinterface #185 <Method Iterator List.iterator()>
	//*   3    9:astore_3        
	//*   4   10:aload_3         
	//*   5   11:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            37
			list = ((JsonNode)iterator.next()).findValuesAsText(s, list);
	//    7   19:aload_3         
	//    8   20:invokeinterface #194 <Method Object Iterator.next()>
	//    9   25:checkcast       #196 <Class JsonNode>
	//   10   28:aload_1         
	//   11   29:aload_2         
	//   12   30:invokevirtual   #231 <Method List JsonNode.findValuesAsText(String, List)>
	//   13   33:astore_2        

	//*  14   34:goto            10
		return list;
	//   15   37:aload_2         
	//   16   38:areturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #43  <Method JsonNode get(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(String s)
	{
		return ((TreeNode) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #236 <Method JsonNode get(String)>
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
	//*   5    9:invokeinterface #56  <Method int List.size()>
	//*   6   14:icmpge          31
			return (JsonNode)_children.get(i);
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field List _children>
	//    9   21:iload_1         
	//   10   22:invokeinterface #205 <Method Object List.get(int)>
	//   11   27:checkcast       #196 <Class JsonNode>
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
	//    0    0:getstatic       #244 <Field JsonNodeType JsonNodeType.ARRAY>
	//    1    3:areturn         
	}

	public int hashCode()
	{
		return _children.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:invokeinterface #247 <Method int List.hashCode()>
	//    3    9:ireturn         
	}

	public ArrayNode insert(int i, double d)
	{
		return _insert(i, ((JsonNode) (numberNode(d))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:dload_2         
	//    4    4:invokevirtual   #61  <Method NumericNode numberNode(double)>
	//    5    7:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//    6   10:areturn         
	}

	public ArrayNode insert(int i, float f)
	{
		return _insert(i, ((JsonNode) (numberNode(f))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:fload_2         
	//    4    4:invokevirtual   #67  <Method NumericNode numberNode(float)>
	//    5    7:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//    6   10:areturn         
	}

	public ArrayNode insert(int i, int j)
	{
		_insert(i, ((JsonNode) (numberNode(j))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #71  <Method NumericNode numberNode(int)>
	//    5    7:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//    6   10:pop             
		return this;
	//    7   11:aload_0         
	//    8   12:areturn         
	}

	public ArrayNode insert(int i, long l)
	{
		return _insert(i, ((JsonNode) (numberNode(l))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:lload_2         
	//    4    4:invokevirtual   #75  <Method NumericNode numberNode(long)>
	//    5    7:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//    6   10:areturn         
	}

	public ArrayNode insert(int i, JsonNode jsonnode)
	{
		Object obj = ((Object) (jsonnode));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonnode == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       11
			obj = ((Object) (nullNode()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #79  <Method NullNode nullNode()>
	//    6   10:astore_3        
		_insert(i, ((JsonNode) (obj)));
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:aload_3         
	//   10   14:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   11   17:pop             
		return this;
	//   12   18:aload_0         
	//   13   19:areturn         
	}

	public ArrayNode insert(int i, Boolean boolean1)
	{
		if(boolean1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:areturn         
		else
			return _insert(i, ((JsonNode) (booleanNode(boolean1.booleanValue()))));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #90  <Method boolean Boolean.booleanValue()>
	//   11   17:invokevirtual   #94  <Method BooleanNode booleanNode(boolean)>
	//   12   20:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   13   23:areturn         
	}

	public ArrayNode insert(int i, Double double1)
	{
		if(double1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:areturn         
		else
			return _insert(i, ((JsonNode) (numberNode(double1.doubleValue()))));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #101 <Method double Double.doubleValue()>
	//   11   17:invokevirtual   #61  <Method NumericNode numberNode(double)>
	//   12   20:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   13   23:areturn         
	}

	public ArrayNode insert(int i, Float float1)
	{
		if(float1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:areturn         
		else
			return _insert(i, ((JsonNode) (numberNode(float1.floatValue()))));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #108 <Method float Float.floatValue()>
	//   11   17:invokevirtual   #67  <Method NumericNode numberNode(float)>
	//   12   20:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   13   23:areturn         
	}

	public ArrayNode insert(int i, Integer integer)
	{
		if(integer == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
		{
			insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:pop             
			return this;
	//    6   10:aload_0         
	//    7   11:areturn         
		} else
		{
			_insert(i, ((JsonNode) (numberNode(integer.intValue()))));
	//    8   12:aload_0         
	//    9   13:iload_1         
	//   10   14:aload_0         
	//   11   15:aload_2         
	//   12   16:invokevirtual   #114 <Method int Integer.intValue()>
	//   13   19:invokevirtual   #71  <Method NumericNode numberNode(int)>
	//   14   22:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   15   25:pop             
			return this;
	//   16   26:aload_0         
	//   17   27:areturn         
		}
	}

	public ArrayNode insert(int i, Long long1)
	{
		if(long1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:areturn         
		else
			return _insert(i, ((JsonNode) (numberNode(long1.longValue()))));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #121 <Method long Long.longValue()>
	//   11   17:invokevirtual   #75  <Method NumericNode numberNode(long)>
	//   12   20:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   13   23:areturn         
	}

	public ArrayNode insert(int i, String s)
	{
		if(s == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:areturn         
		else
			return _insert(i, ((JsonNode) (textNode(s))));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #126 <Method TextNode textNode(String)>
	//   11   17:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   12   20:areturn         
	}

	public ArrayNode insert(int i, BigDecimal bigdecimal)
	{
		if(bigdecimal == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:areturn         
		else
			return _insert(i, ((JsonNode) (numberNode(bigdecimal))));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #130 <Method NumericNode numberNode(BigDecimal)>
	//   11   17:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   12   20:areturn         
	}

	public ArrayNode insert(int i, boolean flag)
	{
		return _insert(i, ((JsonNode) (booleanNode(flag))));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:iload_2         
	//    4    4:invokevirtual   #94  <Method BooleanNode booleanNode(boolean)>
	//    5    7:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//    6   10:areturn         
	}

	public ArrayNode insert(int i, byte abyte0[])
	{
		if(abyte0 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:areturn         
		else
			return _insert(i, ((JsonNode) (binaryNode(abyte0))));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #136 <Method BinaryNode binaryNode(byte[])>
	//   11   17:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   12   20:areturn         
	}

	public ArrayNode insertArray(int i)
	{
		ArrayNode arraynode = arrayNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #147 <Method ArrayNode arrayNode()>
	//    2    4:astore_2        
		_insert(i, ((JsonNode) (arraynode)));
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//    7   11:pop             
		return arraynode;
	//    8   12:aload_2         
	//    9   13:areturn         
	}

	public ArrayNode insertNull(int i)
	{
		_insert(i, ((JsonNode) (nullNode())));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #79  <Method NullNode nullNode()>
	//    4    6:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public ObjectNode insertObject(int i)
	{
		ObjectNode objectnode = objectNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #152 <Method ObjectNode objectNode()>
	//    2    4:astore_2        
		_insert(i, ((JsonNode) (objectnode)));
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//    7   11:pop             
		return objectnode;
	//    8   12:aload_2         
	//    9   13:areturn         
	}

	public ArrayNode insertPOJO(int i, Object obj)
	{
		if(obj == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
			return insertNull(i);
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokevirtual   #258 <Method ArrayNode insertNull(int)>
	//    5    9:areturn         
		else
			return _insert(i, ((JsonNode) (pojoNode(obj))));
	//    6   10:aload_0         
	//    7   11:iload_1         
	//    8   12:aload_0         
	//    9   13:aload_2         
	//   10   14:invokevirtual   #158 <Method ValueNode pojoNode(Object)>
	//   11   17:invokevirtual   #251 <Method ArrayNode _insert(int, JsonNode)>
	//   12   20:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider)
	{
		return _children.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:invokeinterface #275 <Method boolean List.isEmpty()>
	//    3    9:ireturn         
	}

	public volatile TreeNode path(int i)
	{
		return ((TreeNode) (path(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #278 <Method JsonNode path(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode path(String s)
	{
		return ((TreeNode) (path(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #280 <Method JsonNode path(String)>
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
	//*   5    9:invokeinterface #56  <Method int List.size()>
	//*   6   14:icmpge          31
			return (JsonNode)_children.get(i);
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field List _children>
	//    9   21:iload_1         
	//   10   22:invokeinterface #205 <Method Object List.get(int)>
	//   11   27:checkcast       #196 <Class JsonNode>
	//   12   30:areturn         
		else
			return ((JsonNode) (MissingNode.getInstance()));
	//   13   31:invokestatic    #286 <Method MissingNode MissingNode.getInstance()>
	//   14   34:areturn         
	}

	public JsonNode path(String s)
	{
		return ((JsonNode) (MissingNode.getInstance()));
	//    0    0:invokestatic    #286 <Method MissingNode MissingNode.getInstance()>
	//    1    3:areturn         
	}

	public JsonNode remove(int i)
	{
		if(i >= 0 && i < _children.size())
	//*   0    0:iload_1         
	//*   1    1:iflt            31
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #19  <Field List _children>
	//*   5    9:invokeinterface #56  <Method int List.size()>
	//*   6   14:icmpge          31
			return (JsonNode)_children.remove(i);
	//    7   17:aload_0         
	//    8   18:getfield        #19  <Field List _children>
	//    9   21:iload_1         
	//   10   22:invokeinterface #289 <Method Object List.remove(int)>
	//   11   27:checkcast       #196 <Class JsonNode>
	//   12   30:areturn         
		else
			return null;
	//   13   31:aconst_null     
	//   14   32:areturn         
	}

	public ArrayNode removeAll()
	{
		_children.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:invokeinterface #293 <Method void List.clear()>
		return this;
	//    3    9:aload_0         
	//    4   10:areturn         
	}

	public volatile ContainerNode removeAll()
	{
		return ((ContainerNode) (removeAll()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #296 <Method ArrayNode removeAll()>
	//    2    4:areturn         
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
	//    4    8:invokeinterface #56  <Method int List.size()>
	//    5   13:istore          4
		jsongenerator.writeStartArray(j);
	//    6   15:aload_1         
	//    7   16:iload           4
	//    8   18:invokevirtual   #306 <Method void JsonGenerator.writeStartArray(int)>
		int i = 0;
	//    9   21:iconst_0        
	//   10   22:istore_3        
		while(i < j) 
	//*  11   23:iload_3         
	//*  12   24:iload           4
	//*  13   26:icmpge          79
		{
			JsonNode jsonnode = (JsonNode)list.get(i);
	//   14   29:aload           5
	//   15   31:iload_3         
	//   16   32:invokeinterface #205 <Method Object List.get(int)>
	//   17   37:checkcast       #196 <Class JsonNode>
	//   18   40:astore          6
			if(jsonnode instanceof BaseJsonNode)
	//*  19   42:aload           6
	//*  20   44:instanceof      #308 <Class BaseJsonNode>
	//*  21   47:ifeq            67
				((BaseJsonNode)jsonnode).serialize(jsongenerator, serializerprovider);
	//   22   50:aload           6
	//   23   52:checkcast       #308 <Class BaseJsonNode>
	//   24   55:aload_1         
	//   25   56:aload_2         
	//   26   57:invokevirtual   #310 <Method void BaseJsonNode.serialize(JsonGenerator, SerializerProvider)>
			else
	//*  27   60:iload_3         
	//*  28   61:iconst_1        
	//*  29   62:iadd            
	//*  30   63:istore_3        
	//*  31   64:goto            23
				((JsonSerializable) (jsonnode)).serialize(jsongenerator, serializerprovider);
	//   32   67:aload           6
	//   33   69:aload_1         
	//   34   70:aload_2         
	//   35   71:invokeinterface #313 <Method void JsonSerializable.serialize(JsonGenerator, SerializerProvider)>
			i++;
		}
	//*  36   76:goto            60
		jsongenerator.writeEndArray();
	//   37   79:aload_1         
	//   38   80:invokevirtual   #316 <Method void JsonGenerator.writeEndArray()>
	//   39   83:return          
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		typeserializer.writeTypePrefixForArray(((Object) (this)), jsongenerator);
	//    0    0:aload_3         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #325 <Method void TypeSerializer.writeTypePrefixForArray(Object, JsonGenerator)>
		for(Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider));
	//    4    6:aload_0         
	//    5    7:getfield        #19  <Field List _children>
	//    6   10:invokeinterface #185 <Method Iterator List.iterator()>
	//    7   15:astore          4
	//    8   17:aload           4
	//    9   19:invokeinterface #190 <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            48
	//   11   27:aload           4
	//   12   29:invokeinterface #194 <Method Object Iterator.next()>
	//   13   34:checkcast       #196 <Class JsonNode>
	//   14   37:checkcast       #308 <Class BaseJsonNode>
	//   15   40:aload_1         
	//   16   41:aload_2         
	//   17   42:invokevirtual   #310 <Method void BaseJsonNode.serialize(JsonGenerator, SerializerProvider)>
	//*  18   45:goto            17
		typeserializer.writeTypeSuffixForArray(((Object) (this)), jsongenerator);
	//   19   48:aload_3         
	//   20   49:aload_0         
	//   21   50:aload_1         
	//   22   51:invokevirtual   #328 <Method void TypeSerializer.writeTypeSuffixForArray(Object, JsonGenerator)>
	//   23   54:return          
	}

	public JsonNode set(int i, JsonNode jsonnode)
	{
		Object obj = ((Object) (jsonnode));
	//    0    0:aload_2         
	//    1    1:astore_3        
		if(jsonnode == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       11
			obj = ((Object) (nullNode()));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #79  <Method NullNode nullNode()>
	//    6   10:astore_3        
		if(i < 0 || i >= _children.size())
	//*   7   11:iload_1         
	//*   8   12:iflt            28
	//*   9   15:iload_1         
	//*  10   16:aload_0         
	//*  11   17:getfield        #19  <Field List _children>
	//*  12   20:invokeinterface #56  <Method int List.size()>
	//*  13   25:icmplt          69
			throw new IndexOutOfBoundsException((new StringBuilder()).append("Illegal index ").append(i).append(", array size ").append(size()).toString());
	//   14   28:new             #332 <Class IndexOutOfBoundsException>
	//   15   31:dup             
	//   16   32:new             #334 <Class StringBuilder>
	//   17   35:dup             
	//   18   36:invokespecial   #335 <Method void StringBuilder()>
	//   19   39:ldc2            #337 <String "Illegal index ">
	//   20   42:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   21   45:iload_1         
	//   22   46:invokevirtual   #344 <Method StringBuilder StringBuilder.append(int)>
	//   23   49:ldc2            #346 <String ", array size ">
	//   24   52:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:aload_0         
	//   26   56:invokevirtual   #202 <Method int size()>
	//   27   59:invokevirtual   #344 <Method StringBuilder StringBuilder.append(int)>
	//   28   62:invokevirtual   #350 <Method String StringBuilder.toString()>
	//   29   65:invokespecial   #353 <Method void IndexOutOfBoundsException(String)>
	//   30   68:athrow          
		else
			return (JsonNode)_children.set(i, obj);
	//   31   69:aload_0         
	//   32   70:getfield        #19  <Field List _children>
	//   33   73:iload_1         
	//   34   74:aload_3         
	//   35   75:invokeinterface #356 <Method Object List.set(int, Object)>
	//   36   80:checkcast       #196 <Class JsonNode>
	//   37   83:areturn         
	}

	public int size()
	{
		return _children.size();
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field List _children>
	//    2    4:invokeinterface #56  <Method int List.size()>
	//    3    9:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder((size() << 4) + 16);
	//    0    0:new             #334 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #202 <Method int size()>
	//    4    8:iconst_4        
	//    5    9:ishl            
	//    6   10:bipush          16
	//    7   12:iadd            
	//    8   13:invokespecial   #358 <Method void StringBuilder(int)>
	//    9   16:astore_3        
		stringbuilder.append('[');
	//   10   17:aload_3         
	//   11   18:bipush          91
	//   12   20:invokevirtual   #361 <Method StringBuilder StringBuilder.append(char)>
	//   13   23:pop             
		int i = 0;
	//   14   24:iconst_0        
	//   15   25:istore_1        
		for(int j = _children.size(); i < j; i++)
	//*  16   26:aload_0         
	//*  17   27:getfield        #19  <Field List _children>
	//*  18   30:invokeinterface #56  <Method int List.size()>
	//*  19   35:istore_2        
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
	//   27   48:invokevirtual   #361 <Method StringBuilder StringBuilder.append(char)>
	//   28   51:pop             
			stringbuilder.append(((JsonNode)_children.get(i)).toString());
	//   29   52:aload_3         
	//   30   53:aload_0         
	//   31   54:getfield        #19  <Field List _children>
	//   32   57:iload_1         
	//   33   58:invokeinterface #205 <Method Object List.get(int)>
	//   34   63:checkcast       #196 <Class JsonNode>
	//   35   66:invokevirtual   #362 <Method String JsonNode.toString()>
	//   36   69:invokevirtual   #341 <Method StringBuilder StringBuilder.append(String)>
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
	//   45   83:invokevirtual   #361 <Method StringBuilder StringBuilder.append(char)>
	//   46   86:pop             
		return stringbuilder.toString();
	//   47   87:aload_3         
	//   48   88:invokevirtual   #350 <Method String StringBuilder.toString()>
	//   49   91:areturn         
	}

	private final List _children;
}
