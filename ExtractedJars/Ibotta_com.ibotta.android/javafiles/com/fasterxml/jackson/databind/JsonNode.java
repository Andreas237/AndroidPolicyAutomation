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
import java.util.Iterator;

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

	public boolean asBoolean(boolean flag)
	{
		return flag;
	//    0    0:iload_1         
	//    1    1:ireturn         
	}

	public abstract String asText();

	public volatile TreeNode at(JsonPointer jsonpointer)
	{
		return ((TreeNode) (at(jsonpointer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #26  <Method JsonNode at(JsonPointer)>
	//    3    5:areturn         
	}

	public volatile TreeNode at(String s)
		throws IllegalArgumentException
	{
		return ((TreeNode) (at(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method JsonNode at(String)>
	//    3    5:areturn         
	}

	public final JsonNode at(JsonPointer jsonpointer)
	{
		if(jsonpointer.matches())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #39  <Method boolean JsonPointer.matches()>
	//*   2    4:ifeq            9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		JsonNode jsonnode = _at(jsonpointer);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #41  <Method JsonNode _at(JsonPointer)>
	//    8   14:astore_2        
		if(jsonnode == null)
	//*   9   15:aload_2         
	//*  10   16:ifnonnull       23
			return ((JsonNode) (MissingNode.getInstance()));
	//   11   19:invokestatic    #47  <Method MissingNode MissingNode.getInstance()>
	//   12   22:areturn         
		else
			return jsonnode.at(jsonpointer.tail());
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #51  <Method JsonPointer JsonPointer.tail()>
	//   16   28:invokevirtual   #26  <Method JsonNode at(JsonPointer)>
	//   17   31:areturn         
	}

	public final JsonNode at(String s)
	{
		return at(JsonPointer.compile(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #55  <Method JsonPointer JsonPointer.compile(String)>
	//    3    5:invokevirtual   #26  <Method JsonNode at(JsonPointer)>
	//    4    8:areturn         
	}

	public BigInteger bigIntegerValue()
	{
		return BigInteger.ZERO;
	//    0    0:getstatic       #63  <Field BigInteger BigInteger.ZERO>
	//    1    3:areturn         
	}

	public byte[] binaryValue()
		throws IOException
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public BigDecimal decimalValue()
	{
		return BigDecimal.ZERO;
	//    0    0:getstatic       #74  <Field BigDecimal BigDecimal.ZERO>
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
	//    0    0:invokestatic    #85  <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public Iterator fieldNames()
	{
		return ClassUtil.emptyIterator();
	//    0    0:invokestatic    #85  <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public Iterator fields()
	{
		return ClassUtil.emptyIterator();
	//    0    0:invokestatic    #85  <Method Iterator ClassUtil.emptyIterator()>
	//    1    3:areturn         
	}

	public volatile TreeNode get(int i)
	{
		return ((TreeNode) (get(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #96  <Method JsonNode get(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode get(String s)
	{
		return ((TreeNode) (get(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #98  <Method JsonNode get(String)>
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

	public boolean has(String s)
	{
		return get(s) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #98  <Method JsonNode get(String)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public int intValue()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isArray()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isBinary()
	{
		return getNodeType() == JsonNodeType.BINARY;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #114 <Field JsonNodeType JsonNodeType.BINARY>
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
	//    1    1:invokevirtual   #108 <Method JsonNodeType getNodeType()>
	//    2    4:astore_1        
		return jsonnodetype == JsonNodeType.OBJECT || jsonnodetype == JsonNodeType.ARRAY;
	//    3    5:aload_1         
	//    4    6:getstatic       #118 <Field JsonNodeType JsonNodeType.OBJECT>
	//    5    9:if_acmpeq       24
	//    6   12:aload_1         
	//    7   13:getstatic       #121 <Field JsonNodeType JsonNodeType.ARRAY>
	//    8   16:if_acmpne       22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	public boolean isMissingNode()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isNumber()
	{
		return getNodeType() == JsonNodeType.NUMBER;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #126 <Field JsonNodeType JsonNodeType.NUMBER>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isObject()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final boolean isPojo()
	{
		return getNodeType() == JsonNodeType.POJO;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #108 <Method JsonNodeType getNodeType()>
	//    2    4:getstatic       #131 <Field JsonNodeType JsonNodeType.POJO>
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
				catch(NoSuchFieldError nosuchfielderror) { }
			//   20   43:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.OBJECT.ordinal()] = 2;
				}
			//*  21   44:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   22   47:astore_0        
				try
				{
					$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType[JsonNodeType.MISSING.ordinal()] = 3;
				}
			//*  23   48:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   24   51:astore_0        
			//*  25   52:return          
			}
		}

		switch(_cls1..SwitchMap.com.fasterxml.jackson.databind.node.JsonNodeType[getNodeType().ordinal()])
	//*   0    0:getstatic       #136 <Field int[] JsonNode$1.$SwitchMap$com$fasterxml$jackson$databind$node$JsonNodeType>
	//*   1    3:aload_0         
	//*   2    4:invokevirtual   #108 <Method JsonNodeType getNodeType()>
	//*   3    7:invokevirtual   #139 <Method int JsonNodeType.ordinal()>
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
	//    1    1:invokevirtual   #142 <Method Iterator elements()>
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
	//    2    2:invokevirtual   #149 <Method JsonNode path(int)>
	//    3    5:areturn         
	}

	public volatile TreeNode path(String s)
	{
		return ((TreeNode) (path(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #151 <Method JsonNode path(String)>
	//    3    5:areturn         
	}

	public abstract JsonNode path(int i);

	public abstract JsonNode path(String s);

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
}
