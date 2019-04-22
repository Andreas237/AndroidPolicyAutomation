// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.util.RawValue;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			BaseJsonNode, JsonNodeCreator, JsonNodeFactory, ArrayNode, 
//			BinaryNode, ValueNode, BooleanNode, NullNode, 
//			NumericNode, ObjectNode, TextNode

public abstract class ContainerNode extends BaseJsonNode
	implements JsonNodeCreator
{

	protected ContainerNode(JsonNodeFactory jsonnodefactory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BaseJsonNode()>
		_nodeFactory = jsonnodefactory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    5    9:return          
	}

	public final ArrayNode arrayNode()
	{
		return _nodeFactory.arrayNode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:invokevirtual   #23  <Method ArrayNode JsonNodeFactory.arrayNode()>
	//    3    7:areturn         
	}

	public final ArrayNode arrayNode(int i)
	{
		return _nodeFactory.arrayNode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #26  <Method ArrayNode JsonNodeFactory.arrayNode(int)>
	//    4    8:areturn         
	}

	public String asText()
	{
		return "";
	//    0    0:ldc1            #30  <String "">
	//    1    2:areturn         
	}

	public final BinaryNode binaryNode(byte abyte0[])
	{
		return _nodeFactory.binaryNode(abyte0);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method BinaryNode JsonNodeFactory.binaryNode(byte[])>
	//    4    8:areturn         
	}

	public final BinaryNode binaryNode(byte abyte0[], int i, int j)
	{
		return _nodeFactory.binaryNode(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:invokevirtual   #37  <Method BinaryNode JsonNodeFactory.binaryNode(byte[], int, int)>
	//    6   10:areturn         
	}

	public volatile ValueNode binaryNode(byte abyte0[])
	{
		return ((ValueNode) (binaryNode(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #39  <Method BinaryNode binaryNode(byte[])>
	//    3    5:areturn         
	}

	public volatile ValueNode binaryNode(byte abyte0[], int i, int j)
	{
		return ((ValueNode) (binaryNode(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #41  <Method BinaryNode binaryNode(byte[], int, int)>
	//    5    7:areturn         
	}

	public final BooleanNode booleanNode(boolean flag)
	{
		return _nodeFactory.booleanNode(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #45  <Method BooleanNode JsonNodeFactory.booleanNode(boolean)>
	//    4    8:areturn         
	}

	public volatile ValueNode booleanNode(boolean flag)
	{
		return ((ValueNode) (booleanNode(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #47  <Method BooleanNode booleanNode(boolean)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #52  <Method JsonNode get(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(String s)
	{
		return ((TreeNode) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #56  <Method JsonNode get(String)>
	//    3    5:areturn         
	}

	public abstract JsonNode get(int i);

	public abstract JsonNode get(String s);

	public final NullNode nullNode()
	{
		return _nodeFactory.nullNode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:invokevirtual   #60  <Method NullNode JsonNodeFactory.nullNode()>
	//    3    7:areturn         
	}

	public volatile ValueNode nullNode()
	{
		return ((ValueNode) (nullNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #62  <Method NullNode nullNode()>
	//    2    4:areturn         
	}

	public final NumericNode numberNode(byte byte0)
	{
		return _nodeFactory.numberNode(byte0);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #66  <Method NumericNode JsonNodeFactory.numberNode(byte)>
	//    4    8:areturn         
	}

	public final NumericNode numberNode(double d)
	{
		return _nodeFactory.numberNode(d);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:dload_1         
	//    3    5:invokevirtual   #69  <Method NumericNode JsonNodeFactory.numberNode(double)>
	//    4    8:areturn         
	}

	public final NumericNode numberNode(float f)
	{
		return _nodeFactory.numberNode(f);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:fload_1         
	//    3    5:invokevirtual   #72  <Method NumericNode JsonNodeFactory.numberNode(float)>
	//    4    8:areturn         
	}

	public final NumericNode numberNode(int i)
	{
		return _nodeFactory.numberNode(i);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method NumericNode JsonNodeFactory.numberNode(int)>
	//    4    8:areturn         
	}

	public final NumericNode numberNode(long l)
	{
		return _nodeFactory.numberNode(l);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:lload_1         
	//    3    5:invokevirtual   #78  <Method NumericNode JsonNodeFactory.numberNode(long)>
	//    4    8:areturn         
	}

	public final NumericNode numberNode(short word0)
	{
		return _nodeFactory.numberNode(word0);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #81  <Method NumericNode JsonNodeFactory.numberNode(short)>
	//    4    8:areturn         
	}

	public volatile ValueNode numberNode(byte byte0)
	{
		return ((ValueNode) (numberNode(byte0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #83  <Method NumericNode numberNode(byte)>
	//    3    5:areturn         
	}

	public volatile ValueNode numberNode(double d)
	{
		return ((ValueNode) (numberNode(d)));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokevirtual   #85  <Method NumericNode numberNode(double)>
	//    3    5:areturn         
	}

	public volatile ValueNode numberNode(float f)
	{
		return ((ValueNode) (numberNode(f)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #87  <Method NumericNode numberNode(float)>
	//    3    5:areturn         
	}

	public volatile ValueNode numberNode(int i)
	{
		return ((ValueNode) (numberNode(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #89  <Method NumericNode numberNode(int)>
	//    3    5:areturn         
	}

	public volatile ValueNode numberNode(long l)
	{
		return ((ValueNode) (numberNode(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #91  <Method NumericNode numberNode(long)>
	//    3    5:areturn         
	}

	public final ValueNode numberNode(Byte byte1)
	{
		return _nodeFactory.numberNode(byte1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #94  <Method ValueNode JsonNodeFactory.numberNode(Byte)>
	//    4    8:areturn         
	}

	public final ValueNode numberNode(Double double1)
	{
		return _nodeFactory.numberNode(double1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #97  <Method ValueNode JsonNodeFactory.numberNode(Double)>
	//    4    8:areturn         
	}

	public final ValueNode numberNode(Float float1)
	{
		return _nodeFactory.numberNode(float1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #100 <Method ValueNode JsonNodeFactory.numberNode(Float)>
	//    4    8:areturn         
	}

	public final ValueNode numberNode(Integer integer)
	{
		return _nodeFactory.numberNode(integer);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #103 <Method ValueNode JsonNodeFactory.numberNode(Integer)>
	//    4    8:areturn         
	}

	public final ValueNode numberNode(Long long1)
	{
		return _nodeFactory.numberNode(long1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method ValueNode JsonNodeFactory.numberNode(Long)>
	//    4    8:areturn         
	}

	public final ValueNode numberNode(Short short1)
	{
		return _nodeFactory.numberNode(short1);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #109 <Method ValueNode JsonNodeFactory.numberNode(Short)>
	//    4    8:areturn         
	}

	public final ValueNode numberNode(BigDecimal bigdecimal)
	{
		return _nodeFactory.numberNode(bigdecimal);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #112 <Method ValueNode JsonNodeFactory.numberNode(BigDecimal)>
	//    4    8:areturn         
	}

	public final ValueNode numberNode(BigInteger biginteger)
	{
		return _nodeFactory.numberNode(biginteger);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #115 <Method ValueNode JsonNodeFactory.numberNode(BigInteger)>
	//    4    8:areturn         
	}

	public volatile ValueNode numberNode(short word0)
	{
		return ((ValueNode) (numberNode(word0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #117 <Method NumericNode numberNode(short)>
	//    3    5:areturn         
	}

	public final ObjectNode objectNode()
	{
		return _nodeFactory.objectNode();
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:invokevirtual   #121 <Method ObjectNode JsonNodeFactory.objectNode()>
	//    3    7:areturn         
	}

	public final ValueNode pojoNode(Object obj)
	{
		return _nodeFactory.pojoNode(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #125 <Method ValueNode JsonNodeFactory.pojoNode(Object)>
	//    4    8:areturn         
	}

	public final ValueNode rawValueNode(RawValue rawvalue)
	{
		return _nodeFactory.rawValueNode(rawvalue);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #129 <Method ValueNode JsonNodeFactory.rawValueNode(RawValue)>
	//    4    8:areturn         
	}

	public abstract int size();

	public final TextNode textNode(String s)
	{
		return _nodeFactory.textNode(s);
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field JsonNodeFactory _nodeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #135 <Method TextNode JsonNodeFactory.textNode(String)>
	//    4    8:areturn         
	}

	public volatile ValueNode textNode(String s)
	{
		return ((ValueNode) (textNode(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #137 <Method TextNode textNode(String)>
	//    3    5:areturn         
	}

	protected final JsonNodeFactory _nodeFactory;
}
