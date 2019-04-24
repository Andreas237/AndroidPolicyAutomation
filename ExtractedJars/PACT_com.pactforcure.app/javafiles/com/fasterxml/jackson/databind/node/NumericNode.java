// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public abstract class NumericNode extends ValueNode
{

	protected NumericNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void ValueNode()>
	//    2    4:return          
	}

	public final double asDouble()
	{
		return doubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #14  <Method double doubleValue()>
	//    2    4:dreturn         
	}

	public final double asDouble(double d)
	{
		return doubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #14  <Method double doubleValue()>
	//    2    4:dreturn         
	}

	public final int asInt()
	{
		return intValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method int intValue()>
	//    2    4:ireturn         
	}

	public final int asInt(int i)
	{
		return intValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method int intValue()>
	//    2    4:ireturn         
	}

	public final long asLong()
	{
		return longValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method long longValue()>
	//    2    4:lreturn         
	}

	public final long asLong(long l)
	{
		return longValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #26  <Method long longValue()>
	//    2    4:lreturn         
	}

	public abstract String asText();

	public abstract BigInteger bigIntegerValue();

	public abstract boolean canConvertToInt();

	public abstract boolean canConvertToLong();

	public abstract BigDecimal decimalValue();

	public abstract double doubleValue();

	public final JsonNodeType getNodeType()
	{
		return JsonNodeType.NUMBER;
	//    0    0:getstatic       #44  <Field JsonNodeType JsonNodeType.NUMBER>
	//    1    3:areturn         
	}

	public abstract int intValue();

	public abstract long longValue();

	public abstract com.fasterxml.jackson.core.JsonParser.NumberType numberType();

	public abstract Number numberValue();
}
