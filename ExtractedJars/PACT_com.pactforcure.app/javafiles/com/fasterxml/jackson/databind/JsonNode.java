// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.node.JsonNodeType;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public abstract class JsonNode extends JsonSerializable.Base
	implements TreeNode, Iterable
{

	protected JsonNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void JsonSerializable$Base()>
	//    2    4:return          
	}

	protected abstract JsonNode _at(JsonPointer jsonpointer);

	public boolean asBoolean()
	{
		return asBoolean(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #23  <Method boolean asBoolean(boolean)>
	//    3    5:ireturn         
	}

	public boolean asBoolean(boolean flag)
	{
		return flag;
	//    0    0:iload_1         
	//    1    1:ireturn         
	}

	public double asDouble()
	{
		return asDouble(0.0D);
	//    0    0:aload_0         
	//    1    1:dconst_0        
	//    2    2:invokevirtual   #28  <Method double asDouble(double)>
	//    3    5:dreturn         
	}

	public double asDouble(double d)
	{
		return d;
	//    0    0:dload_1         
	//    1    1:dreturn         
	}

	public int asInt()
	{
		return asInt(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #33  <Method int asInt(int)>
	//    3    5:ireturn         
	}

	public int asInt(int i)
	{
		return i;
	//    0    0:iload_1         
	//    1    1:ireturn         
	}

	public long asLong()
	{
		return asLong(0L);
	//    0    0:aload_0         
	//    1    1:lconst_0        
	//    2    2:invokevirtual   #38  <Method long asLong(long)>
	//    3    5:lreturn         
	}

	public long asLong(long l)
	{
		return l;
	//    0    0:lload_1         
	//    1    1:lreturn         
	}

	public abstract String asText();

	public String asText(String s)
	{
		String s1 = asText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #43  <Method String asText()>
	//    2    4:astore_2        
		if(s1 == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       11
			return s;
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			return s1;
	//    7   11:aload_2         
	//    8   12:areturn         
	}

	public volatile TreeNode at(JsonPointer jsonpointer)
	{
		return ((TreeNode) (at(jsonpointer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #47  <Method JsonNode at(JsonPointer)>
	//    3    5:areturn         
	}

	public volatile TreeNode at(String s)
		throws IllegalArgumentException
	{
		return ((TreeNode) (at(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #53  <Method JsonNode at(String)>
	//    3    5:areturn         
	}

	public final JsonNode at(JsonPointer jsonpointer)
	{
		if(jsonpointer.matches())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #59  <Method boolean JsonPointer.matches()>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		JsonNode jsonnode = _at(jsonpointer);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #61  <Method JsonNode _at(JsonPointer)>
	//    8   14:astore_2        
		if(jsonnode == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       23
			return ((JsonNode) (MissingNode.getInstance()));
	//   11   19:invokestatic    #67  <Method MissingNode MissingNode.getInstance()>
	//   12   22:areturn         
		else
			return jsonnode.at(jsonpointer.tail());
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #71  <Method JsonPointer JsonPointer.tail()>
	//   16   28:invokevirtual   #47  <Method JsonNode at(JsonPointer)>
	//   17   31:areturn         
	}

	public final JsonNode at(String s)
	{
		return at(JsonPointer.compile(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #75  <Method JsonPointer JsonPointer.compile(String)>
	//    3    5:invokevirtual   #47  <Method JsonNode at(JsonPointer)>
	//    4    8:areturn         
	}

	public BigInteger bigIntegerValue()
	{
		return BigInteger.ZERO;
	//    0    0:getstatic       #83  <Field BigInteger BigInteger.ZERO>
	//    1    3:areturn         
	}

	public byte[] binaryValue()
		throws IOException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean booleanValue()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canConvertToInt()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canConvertToLong()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public BigDecimal decimalValue()
	{
		return BigDecimal.ZERO;
	//    0    0:getstatic       #97  <Field BigDecimal BigDecimal.ZERO>
	//    1    3:areturn         
	}

	public abstract JsonNode deepCopy();

	public double doubleValue()
	{
		return 0.0D;
	//    0    0:dconst_0        
	//    1    1:dreturn         
	}

	public Iterator elements()
	{
		return ClassUtil.emptyIterator();
	//    0    0:invokestatic    #107 <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public abstract boolean equals(Object obj);

	public boolean equals(Comparator comparator, JsonNode jsonnode)
	{
		return comparator.compare(((Object) (this)), ((Object) (jsonnode))) == 0;
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:aload_2         
	//    3    3:invokeinterface #118 <Method int Comparator.compare(Object, Object)>
	//    4    8:ifne            13
	//    5   11:iconst_1        
	//    6   12:ireturn         
	//    7   13:iconst_0        
	//    8   14:ireturn         
	}

	public Iterator fieldNames()
	{
		return ClassUtil.emptyIterator();
	//    0    0:invokestatic    #107 <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public Iterator fields()
	{
		return ClassUtil.emptyIterator();
	//    0    0:invokestatic    #107 <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public abstract JsonNode findParent(String s);

	public final List findParents(String s)
	{
		List list = findParents(s, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #129 <Method List findParents(String, List)>
	//    4    6:astore_2        
		s = ((String) (list));
	//    5    7:aload_2         
	//    6    8:astore_1        
		if(list == null)
	//*   7    9:aload_2         
	//*   8   10:ifnonnull       17
			s = ((String) (Collections.emptyList()));
	//    9   13:invokestatic    #135 <Method List Collections.emptyList()>
	//   10   16:astore_1        
		return ((List) (s));
	//   11   17:aload_1         
	//   12   18:areturn         
	}

	public abstract List findParents(String s, List list);

	public abstract JsonNode findPath(String s);

	public abstract JsonNode findValue(String s);

	public final List findValues(String s)
	{
		List list = findValues(s, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #141 <Method List findValues(String, List)>
	//    4    6:astore_2        
		s = ((String) (list));
	//    5    7:aload_2         
	//    6    8:astore_1        
		if(list == null)
	//*   7    9:aload_2         
	//*   8   10:ifnonnull       17
			s = ((String) (Collections.emptyList()));
	//    9   13:invokestatic    #135 <Method List Collections.emptyList()>
	//   10   16:astore_1        
		return ((List) (s));
	//   11   17:aload_1         
	//   12   18:areturn         
	}

	public abstract List findValues(String s, List list);

	public final List findValuesAsText(String s)
	{
		List list = findValuesAsText(s, ((List) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokevirtual   #144 <Method List findValuesAsText(String, List)>
	//    4    6:astore_2        
		s = ((String) (list));
	//    5    7:aload_2         
	//    6    8:astore_1        
		if(list == null)
	//*   7    9:aload_2         
	//*   8   10:ifnonnull       17
			s = ((String) (Collections.emptyList()));
	//    9   13:invokestatic    #135 <Method List Collections.emptyList()>
	//   10   16:astore_1        
		return ((List) (s));
	//   11   17:aload_1         
	//   12   18:areturn         
	}

	public abstract List findValuesAsText(String s, List list);

	public float floatValue()
	{
		return 0.0F;
	//    0    0:fconst_0        
	//    1    1:freturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #152 <Method JsonNode get(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(String s)
	{
		return ((TreeNode) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #154 <Method JsonNode get(String)>
	//    3    5:areturn         
	}

	public abstract JsonNode get(int i);

	public JsonNode get(String s)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract JsonNodeType getNodeType();

	public boolean has(int i)
	{
		return get(i) != null;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #152 <Method JsonNode get(int)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean has(String s)
	{
		return get(s) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #154 <Method JsonNode get(String)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasNonNull(int i)
	{
		JsonNode jsonnode = get(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #152 <Method JsonNode get(int)>
	//    3    5:astore_2        
		return jsonnode != null && !jsonnode.isNull();
	//    4    6:aload_2         
	//    5    7:ifnull          19
	//    6   10:aload_2         
	//    7   11:invokevirtual   #163 <Method boolean isNull()>
	//    8   14:ifne            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public boolean hasNonNull(String s)
	{
		s = ((String) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #154 <Method JsonNode get(String)>
	//    3    5:astore_1        
		return s != null && !((JsonNode) (s)).isNull();
	//    4    6:aload_1         
	//    5    7:ifnull          19
	//    6   10:aload_1         
	//    7   11:invokevirtual   #163 <Method boolean isNull()>
	//    8   14:ifne            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public int intValue()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isArray()
	{
		return getNodeType() == JsonNodeType.ARRAY;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #173 <Field JsonNodeType JsonNodeType.ARRAY>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isBigDecimal()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isBigInteger()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isBinary()
	{
		return getNodeType() == JsonNodeType.BINARY;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #179 <Field JsonNodeType JsonNodeType.BINARY>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final boolean isBoolean()
	{
		return getNodeType() == JsonNodeType.BOOLEAN;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #183 <Field JsonNodeType JsonNodeType.BOOLEAN>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final boolean isContainerNode()
	{
		JsonNodeType jsonnodetype = getNodeType();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:astore_1        
		return jsonnodetype == JsonNodeType.OBJECT || jsonnodetype == JsonNodeType.ARRAY;
	//    3    5:aload_1         
	//    4    6:getstatic       #187 <Field JsonNodeType JsonNodeType.OBJECT>
	//    5    9:if_acmpeq       19
	//    6   12:aload_1         
	//    7   13:getstatic       #173 <Field JsonNodeType JsonNodeType.ARRAY>
	//    8   16:if_acmpne       21
	//    9   19:iconst_1        
	//   10   20:ireturn         
	//   11   21:iconst_0        
	//   12   22:ireturn         
	}

	public boolean isDouble()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isFloat()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isFloatingPointNumber()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isInt()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isIntegralNumber()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isLong()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isMissingNode()
	{
		return getNodeType() == JsonNodeType.MISSING;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #197 <Field JsonNodeType JsonNodeType.MISSING>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final boolean isNull()
	{
		return getNodeType() == JsonNodeType.NULL;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #200 <Field JsonNodeType JsonNodeType.NULL>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final boolean isNumber()
	{
		return getNodeType() == JsonNodeType.NUMBER;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #204 <Field JsonNodeType JsonNodeType.NUMBER>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final boolean isObject()
	{
		return getNodeType() == JsonNodeType.OBJECT;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #187 <Field JsonNodeType JsonNodeType.OBJECT>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final boolean isPojo()
	{
		return getNodeType() == JsonNodeType.POJO;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #209 <Field JsonNodeType JsonNodeType.POJO>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isShort()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isTextual()
	{
		return getNodeType() == JsonNodeType.STRING;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #214 <Field JsonNodeType JsonNodeType.STRING>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public final boolean isValueNode()
	{
		static class _cls1
		{

			static final int $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[];

			static 
			{
				$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType = new int[JsonNodeType.values().length];
			//    0    0:invokestatic    #18  <Method JsonNodeType[] JsonNodeType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType>
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.ARRAY.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType>
			//    5   12:getstatic       #24  <Field JsonNodeType JsonNodeType.ARRAY>
			//    6   15:invokevirtual   #28  <Method int JsonNodeType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType>
			//*  10   23:getstatic       #31  <Field JsonNodeType JsonNodeType.OBJECT>
			//*  11   26:invokevirtual   #28  <Method int JsonNodeType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType>
			//*  15   34:getstatic       #34  <Field JsonNodeType JsonNodeType.MISSING>
			//*  16   37:invokevirtual   #28  <Method int JsonNodeType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:return          
			//*  20   43:astore_0        
			//*  21   44:return          
			//*  22   45:astore_0        
			//*  23   46:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   49:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.OBJECT.ordinal()] = 2;
				}
				catch(NoSuchFieldError nosuchfielderror1) { }
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.MISSING.ordinal()] = 3;
				}
				catch(NoSuchFieldError nosuchfielderror)
				{
					return;
				}
			//*  25   50:goto            20
			}
		}

		switch(_cls1..SwitchMap.com.fasterxml.jackson.databind.node.JsonNodeType[getNodeType().ordinal()])
	//*   0    0:getstatic       #219 <Field int[] JsonNode$1.$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #167 <Method JsonNodeType getNodeType()>
	//*   3    7:invokevirtual   #222 <Method int JsonNodeType.ordinal()>
	//*   4   10:iaload          
		{
	//*   5   11:tableswitch     1 3: default 36
	//	               1 38
	//	               2 38
	//	               3 38
		default:
			return true;
	//    6   36:iconst_1        
	//    7   37:ireturn         

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			return false;
	//    8   38:iconst_0        
	//    9   39:ireturn         
		}
	}

	public final Iterator iterator()
	{
		return elements();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method Iterator elements()>
	//    2    4:areturn         
	}

	public long longValue()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	public Number numberValue()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public volatile TreeNode path(int i)
	{
		return ((TreeNode) (path(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #231 <Method JsonNode path(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode path(String s)
	{
		return ((TreeNode) (path(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #233 <Method JsonNode path(String)>
	//    3    5:areturn         
	}

	public abstract JsonNode path(int i);

	public abstract JsonNode path(String s);

	public short shortValue()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int size()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String textValue()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract String toString();

	public JsonNode with(String s)
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("JsonNode not of type ObjectNode (but ").append(((Object)this).getClass().getName()).append("), can not call with() on it").toString());
	//    0    0:new             #241 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #243 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #244 <Method void StringBuilder()>
	//    5   11:ldc1            #246 <String "JsonNode not of type ObjectNode (but ">
	//    6   13:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #256 <Method Class Object.getClass()>
	//    9   20:invokevirtual   #261 <Method String Class.getName()>
	//   10   23:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc2            #263 <String "), can not call with() on it">
	//   12   29:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   13   32:invokevirtual   #265 <Method String StringBuilder.toString()>
	//   14   35:invokespecial   #268 <Method void UnsupportedOperationException(String)>
	//   15   38:athrow          
	}

	public JsonNode withArray(String s)
	{
		throw new UnsupportedOperationException((new StringBuilder()).append("JsonNode not of type ObjectNode (but ").append(((Object)this).getClass().getName()).append("), can not call withArray() on it").toString());
	//    0    0:new             #241 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:new             #243 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #244 <Method void StringBuilder()>
	//    5   11:ldc1            #246 <String "JsonNode not of type ObjectNode (but ">
	//    6   13:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:aload_0         
	//    8   17:invokevirtual   #256 <Method Class Object.getClass()>
	//    9   20:invokevirtual   #261 <Method String Class.getName()>
	//   10   23:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc2            #271 <String "), can not call withArray() on it">
	//   12   29:invokevirtual   #250 <Method StringBuilder StringBuilder.append(String)>
	//   13   32:invokevirtual   #265 <Method String StringBuilder.toString()>
	//   14   35:invokespecial   #268 <Method void UnsupportedOperationException(String)>
	//   15   38:athrow          
	}
}
