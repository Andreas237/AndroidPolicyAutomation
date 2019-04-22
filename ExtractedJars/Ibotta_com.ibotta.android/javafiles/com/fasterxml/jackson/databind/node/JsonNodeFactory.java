// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.databind.util.RawValue;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			JsonNodeCreator, ArrayNode, BinaryNode, BooleanNode, 
//			NullNode, IntNode, DoubleNode, FloatNode, 
//			LongNode, ShortNode, DecimalNode, BigIntegerNode, 
//			ObjectNode, POJONode, TextNode, ValueNode, 
//			NumericNode

public class JsonNodeFactory
	implements JsonNodeCreator, Serializable
{

	protected JsonNodeFactory()
	{
		this(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #24  <Method void JsonNodeFactory(boolean)>
	//    3    5:return          
	}

	public JsonNodeFactory(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
		_cfgBigDecimalExact = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field boolean _cfgBigDecimalExact>
	//    5    9:return          
	}

	public ArrayNode arrayNode()
	{
		return new ArrayNode(this);
	//    0    0:new             #39  <Class ArrayNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #42  <Method void ArrayNode(JsonNodeFactory)>
	//    4    8:areturn         
	}

	public ArrayNode arrayNode(int i)
	{
		return new ArrayNode(this, i);
	//    0    0:new             #39  <Class ArrayNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:invokespecial   #46  <Method void ArrayNode(JsonNodeFactory, int)>
	//    5    9:areturn         
	}

	public BinaryNode binaryNode(byte abyte0[])
	{
		return BinaryNode.valueOf(abyte0);
	//    0    0:aload_1         
	//    1    1:invokestatic    #53  <Method BinaryNode BinaryNode.valueOf(byte[])>
	//    2    4:areturn         
	}

	public BinaryNode binaryNode(byte abyte0[], int i, int j)
	{
		return BinaryNode.valueOf(abyte0, i, j);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:invokestatic    #56  <Method BinaryNode BinaryNode.valueOf(byte[], int, int)>
	//    4    6:areturn         
	}

	public volatile ValueNode binaryNode(byte abyte0[])
	{
		return ((ValueNode) (binaryNode(abyte0)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #59  <Method BinaryNode binaryNode(byte[])>
	//    3    5:areturn         
	}

	public volatile ValueNode binaryNode(byte abyte0[], int i, int j)
	{
		return ((ValueNode) (binaryNode(abyte0, i, j)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #62  <Method BinaryNode binaryNode(byte[], int, int)>
	//    5    7:areturn         
	}

	public BooleanNode booleanNode(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            8
			return BooleanNode.getTrue();
	//    2    4:invokestatic    #70  <Method BooleanNode BooleanNode.getTrue()>
	//    3    7:areturn         
		else
			return BooleanNode.getFalse();
	//    4    8:invokestatic    #73  <Method BooleanNode BooleanNode.getFalse()>
	//    5   11:areturn         
	}

	public volatile ValueNode booleanNode(boolean flag)
	{
		return ((ValueNode) (booleanNode(flag)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #76  <Method BooleanNode booleanNode(boolean)>
	//    3    5:areturn         
	}

	public NullNode nullNode()
	{
		return NullNode.getInstance();
	//    0    0:invokestatic    #83  <Method NullNode NullNode.getInstance()>
	//    1    3:areturn         
	}

	public volatile ValueNode nullNode()
	{
		return ((ValueNode) (nullNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method NullNode nullNode()>
	//    2    4:areturn         
	}

	public NumericNode numberNode(byte byte0)
	{
		return ((NumericNode) (IntNode.valueOf(((int) (byte0)))));
	//    0    0:iload_1         
	//    1    1:invokestatic    #93  <Method IntNode IntNode.valueOf(int)>
	//    2    4:areturn         
	}

	public NumericNode numberNode(double d)
	{
		return ((NumericNode) (DoubleNode.valueOf(d)));
	//    0    0:dload_1         
	//    1    1:invokestatic    #99  <Method DoubleNode DoubleNode.valueOf(double)>
	//    2    4:areturn         
	}

	public NumericNode numberNode(float f)
	{
		return ((NumericNode) (FloatNode.valueOf(f)));
	//    0    0:fload_1         
	//    1    1:invokestatic    #105 <Method FloatNode FloatNode.valueOf(float)>
	//    2    4:areturn         
	}

	public NumericNode numberNode(int i)
	{
		return ((NumericNode) (IntNode.valueOf(i)));
	//    0    0:iload_1         
	//    1    1:invokestatic    #93  <Method IntNode IntNode.valueOf(int)>
	//    2    4:areturn         
	}

	public NumericNode numberNode(long l)
	{
		return ((NumericNode) (LongNode.valueOf(l)));
	//    0    0:lload_1         
	//    1    1:invokestatic    #112 <Method LongNode LongNode.valueOf(long)>
	//    2    4:areturn         
	}

	public NumericNode numberNode(short word0)
	{
		return ((NumericNode) (ShortNode.valueOf(word0)));
	//    0    0:iload_1         
	//    1    1:invokestatic    #118 <Method ShortNode ShortNode.valueOf(short)>
	//    2    4:areturn         
	}

	public volatile ValueNode numberNode(byte byte0)
	{
		return ((ValueNode) (numberNode(byte0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #121 <Method NumericNode numberNode(byte)>
	//    3    5:areturn         
	}

	public volatile ValueNode numberNode(double d)
	{
		return ((ValueNode) (numberNode(d)));
	//    0    0:aload_0         
	//    1    1:dload_1         
	//    2    2:invokevirtual   #124 <Method NumericNode numberNode(double)>
	//    3    5:areturn         
	}

	public volatile ValueNode numberNode(float f)
	{
		return ((ValueNode) (numberNode(f)));
	//    0    0:aload_0         
	//    1    1:fload_1         
	//    2    2:invokevirtual   #127 <Method NumericNode numberNode(float)>
	//    3    5:areturn         
	}

	public volatile ValueNode numberNode(int i)
	{
		return ((ValueNode) (numberNode(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #130 <Method NumericNode numberNode(int)>
	//    3    5:areturn         
	}

	public volatile ValueNode numberNode(long l)
	{
		return ((ValueNode) (numberNode(l)));
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokevirtual   #133 <Method NumericNode numberNode(long)>
	//    3    5:areturn         
	}

	public ValueNode numberNode(Byte byte1)
	{
		if(byte1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((ValueNode) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NullNode nullNode()>
	//    4    8:areturn         
		else
			return ((ValueNode) (IntNode.valueOf(byte1.intValue())));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #140 <Method int Byte.intValue()>
	//    7   13:invokestatic    #93  <Method IntNode IntNode.valueOf(int)>
	//    8   16:areturn         
	}

	public ValueNode numberNode(Double double1)
	{
		if(double1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((ValueNode) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NullNode nullNode()>
	//    4    8:areturn         
		else
			return ((ValueNode) (DoubleNode.valueOf(double1.doubleValue())));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #147 <Method double Double.doubleValue()>
	//    7   13:invokestatic    #99  <Method DoubleNode DoubleNode.valueOf(double)>
	//    8   16:areturn         
	}

	public ValueNode numberNode(Float float1)
	{
		if(float1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((ValueNode) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NullNode nullNode()>
	//    4    8:areturn         
		else
			return ((ValueNode) (FloatNode.valueOf(float1.floatValue())));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #154 <Method float Float.floatValue()>
	//    7   13:invokestatic    #105 <Method FloatNode FloatNode.valueOf(float)>
	//    8   16:areturn         
	}

	public ValueNode numberNode(Integer integer)
	{
		if(integer == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((ValueNode) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NullNode nullNode()>
	//    4    8:areturn         
		else
			return ((ValueNode) (IntNode.valueOf(integer.intValue())));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #158 <Method int Integer.intValue()>
	//    7   13:invokestatic    #93  <Method IntNode IntNode.valueOf(int)>
	//    8   16:areturn         
	}

	public ValueNode numberNode(Long long1)
	{
		if(long1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((ValueNode) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NullNode nullNode()>
	//    4    8:areturn         
		else
			return ((ValueNode) (LongNode.valueOf(long1.longValue())));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #165 <Method long Long.longValue()>
	//    7   13:invokestatic    #112 <Method LongNode LongNode.valueOf(long)>
	//    8   16:areturn         
	}

	public ValueNode numberNode(Short short1)
	{
		if(short1 == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((ValueNode) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NullNode nullNode()>
	//    4    8:areturn         
		else
			return ((ValueNode) (ShortNode.valueOf(short1.shortValue())));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #172 <Method short Short.shortValue()>
	//    7   13:invokestatic    #118 <Method ShortNode ShortNode.valueOf(short)>
	//    8   16:areturn         
	}

	public ValueNode numberNode(BigDecimal bigdecimal)
	{
		if(bigdecimal == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((ValueNode) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NullNode nullNode()>
	//    4    8:areturn         
		if(_cfgBigDecimalExact)
	//*   5    9:aload_0         
	//*   6   10:getfield        #35  <Field boolean _cfgBigDecimalExact>
	//*   7   13:ifeq            21
			return ((ValueNode) (DecimalNode.valueOf(bigdecimal)));
	//    8   16:aload_1         
	//    9   17:invokestatic    #178 <Method DecimalNode DecimalNode.valueOf(BigDecimal)>
	//   10   20:areturn         
		if(bigdecimal.compareTo(BigDecimal.ZERO) == 0)
	//*  11   21:aload_1         
	//*  12   22:getstatic       #184 <Field BigDecimal BigDecimal.ZERO>
	//*  13   25:invokevirtual   #188 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  14   28:ifne            35
			return ((ValueNode) (DecimalNode.ZERO));
	//   15   31:getstatic       #191 <Field DecimalNode DecimalNode.ZERO>
	//   16   34:areturn         
		else
			return ((ValueNode) (DecimalNode.valueOf(bigdecimal.stripTrailingZeros())));
	//   17   35:aload_1         
	//   18   36:invokevirtual   #195 <Method BigDecimal BigDecimal.stripTrailingZeros()>
	//   19   39:invokestatic    #178 <Method DecimalNode DecimalNode.valueOf(BigDecimal)>
	//   20   42:areturn         
	}

	public ValueNode numberNode(BigInteger biginteger)
	{
		if(biginteger == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			return ((ValueNode) (nullNode()));
	//    2    4:aload_0         
	//    3    5:invokevirtual   #86  <Method NullNode nullNode()>
	//    4    8:areturn         
		else
			return ((ValueNode) (BigIntegerNode.valueOf(biginteger)));
	//    5    9:aload_1         
	//    6   10:invokestatic    #201 <Method BigIntegerNode BigIntegerNode.valueOf(BigInteger)>
	//    7   13:areturn         
	}

	public volatile ValueNode numberNode(short word0)
	{
		return ((ValueNode) (numberNode(word0)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #204 <Method NumericNode numberNode(short)>
	//    3    5:areturn         
	}

	public ObjectNode objectNode()
	{
		return new ObjectNode(this);
	//    0    0:new             #208 <Class ObjectNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #209 <Method void ObjectNode(JsonNodeFactory)>
	//    4    8:areturn         
	}

	public ValueNode pojoNode(Object obj)
	{
		return ((ValueNode) (new POJONode(obj)));
	//    0    0:new             #213 <Class POJONode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #216 <Method void POJONode(Object)>
	//    4    8:areturn         
	}

	public ValueNode rawValueNode(RawValue rawvalue)
	{
		return ((ValueNode) (new POJONode(((Object) (rawvalue)))));
	//    0    0:new             #213 <Class POJONode>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #216 <Method void POJONode(Object)>
	//    4    8:areturn         
	}

	public TextNode textNode(String s)
	{
		return TextNode.valueOf(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #224 <Method TextNode TextNode.valueOf(String)>
	//    2    4:areturn         
	}

	public volatile ValueNode textNode(String s)
	{
		return ((ValueNode) (textNode(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #227 <Method TextNode textNode(String)>
	//    3    5:areturn         
	}

	private static final JsonNodeFactory decimalsAsIs = new JsonNodeFactory(true);
	private static final JsonNodeFactory decimalsNormalized;
	public static final JsonNodeFactory instance;
	private static final long serialVersionUID = 1L;
	private final boolean _cfgBigDecimalExact;

	static 
	{
		decimalsNormalized = new JsonNodeFactory(false);
	//    0    0:new             #2   <Class JsonNodeFactory>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #24  <Method void JsonNodeFactory(boolean)>
	//    4    8:putstatic       #26  <Field JsonNodeFactory decimalsNormalized>
	//    5   11:new             #2   <Class JsonNodeFactory>
	//    6   14:dup             
	//    7   15:iconst_1        
	//    8   16:invokespecial   #24  <Method void JsonNodeFactory(boolean)>
	//    9   19:putstatic       #28  <Field JsonNodeFactory decimalsAsIs>
		instance = decimalsNormalized;
	//   10   22:getstatic       #26  <Field JsonNodeFactory decimalsNormalized>
	//   11   25:putstatic       #30  <Field JsonNodeFactory instance>
	//*  12   28:return          
	}
}
