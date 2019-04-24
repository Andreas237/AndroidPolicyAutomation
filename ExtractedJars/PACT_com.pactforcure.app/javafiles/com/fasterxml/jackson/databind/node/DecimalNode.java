// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			NumericNode

public class DecimalNode extends NumericNode
{

	public DecimalNode(BigDecimal bigdecimal)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void NumericNode()>
		_value = bigdecimal;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #49  <Field BigDecimal _value>
	//    5    9:return          
	}

	public static DecimalNode valueOf(BigDecimal bigdecimal)
	{
		return new DecimalNode(bigdecimal);
	//    0    0:new             #2   <Class DecimalNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #22  <Method void DecimalNode(BigDecimal)>
	//    4    8:areturn         
	}

	public String asText()
	{
		return _value.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:invokevirtual   #55  <Method String BigDecimal.toString()>
	//    3    7:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_NUMBER_FLOAT;
	//    0    0:getstatic       #63  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    1    3:areturn         
	}

	public BigInteger bigIntegerValue()
	{
		return _value.toBigInteger();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:invokevirtual   #68  <Method BigInteger BigDecimal.toBigInteger()>
	//    3    7:areturn         
	}

	public boolean canConvertToInt()
	{
		return _value.compareTo(MIN_INTEGER) >= 0 && _value.compareTo(MAX_INTEGER) <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:getstatic       #32  <Field BigDecimal MIN_INTEGER>
	//    3    7:invokevirtual   #74  <Method int BigDecimal.compareTo(BigDecimal)>
	//    4   10:iflt            28
	//    5   13:aload_0         
	//    6   14:getfield        #49  <Field BigDecimal _value>
	//    7   17:getstatic       #36  <Field BigDecimal MAX_INTEGER>
	//    8   20:invokevirtual   #74  <Method int BigDecimal.compareTo(BigDecimal)>
	//    9   23:ifgt            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public boolean canConvertToLong()
	{
		return _value.compareTo(MIN_LONG) >= 0 && _value.compareTo(MAX_LONG) <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:getstatic       #40  <Field BigDecimal MIN_LONG>
	//    3    7:invokevirtual   #74  <Method int BigDecimal.compareTo(BigDecimal)>
	//    4   10:iflt            28
	//    5   13:aload_0         
	//    6   14:getfield        #49  <Field BigDecimal _value>
	//    7   17:getstatic       #44  <Field BigDecimal MAX_LONG>
	//    8   20:invokevirtual   #74  <Method int BigDecimal.compareTo(BigDecimal)>
	//    9   23:ifgt            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public BigDecimal decimalValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:areturn         
	}

	public double doubleValue()
	{
		return _value.doubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:invokevirtual   #81  <Method double BigDecimal.doubleValue()>
	//    3    7:dreturn         
	}

	public boolean equals(Object obj)
	{
		if(obj != this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
				return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
			if(obj instanceof DecimalNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class DecimalNode>
	//*  11   17:ifeq            39
			{
				if(((DecimalNode)obj)._value.compareTo(_value) != 0)
	//*  12   20:aload_1         
	//*  13   21:checkcast       #2   <Class DecimalNode>
	//*  14   24:getfield        #49  <Field BigDecimal _value>
	//*  15   27:aload_0         
	//*  16   28:getfield        #49  <Field BigDecimal _value>
	//*  17   31:invokevirtual   #74  <Method int BigDecimal.compareTo(BigDecimal)>
	//*  18   34:ifeq            5
					return false;
	//   19   37:iconst_0        
	//   20   38:ireturn         
			} else
			{
				return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
			}
		}
		return true;
	}

	public float floatValue()
	{
		return _value.floatValue();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:invokevirtual   #87  <Method float BigDecimal.floatValue()>
	//    3    7:freturn         
	}

	public int hashCode()
	{
		return Double.valueOf(doubleValue()).hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #90  <Method double doubleValue()>
	//    2    4:invokestatic    #95  <Method Double Double.valueOf(double)>
	//    3    7:invokevirtual   #97  <Method int Double.hashCode()>
	//    4   10:ireturn         
	}

	public int intValue()
	{
		return _value.intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:invokevirtual   #100 <Method int BigDecimal.intValue()>
	//    3    7:ireturn         
	}

	public boolean isBigDecimal()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isFloatingPointNumber()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public long longValue()
	{
		return _value.longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:invokevirtual   #106 <Method long BigDecimal.longValue()>
	//    3    7:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL;
	//    0    0:getstatic       #114 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//    1    3:areturn         
	}

	public Number numberValue()
	{
		return ((Number) (_value));
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:areturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeNumber(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #49  <Field BigDecimal _value>
	//    3    5:invokevirtual   #127 <Method void JsonGenerator.writeNumber(BigDecimal)>
	//    4    8:return          
	}

	public short shortValue()
	{
		return _value.shortValue();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field BigDecimal _value>
	//    2    4:invokevirtual   #132 <Method short BigDecimal.shortValue()>
	//    3    7:ireturn         
	}

	private static final BigDecimal MAX_INTEGER = BigDecimal.valueOf(0x7fffffffL);
	private static final BigDecimal MAX_LONG = BigDecimal.valueOf(0xffffffffL);
	private static final BigDecimal MIN_INTEGER = BigDecimal.valueOf(0x80000000L);
	private static final BigDecimal MIN_LONG = BigDecimal.valueOf(0x0L);
	public static final DecimalNode ZERO;
	protected final BigDecimal _value;

	static 
	{
		ZERO = new DecimalNode(BigDecimal.ZERO);
	//    0    0:new             #2   <Class DecimalNode>
	//    1    3:dup             
	//    2    4:getstatic       #18  <Field BigDecimal BigDecimal.ZERO>
	//    3    7:invokespecial   #22  <Method void DecimalNode(BigDecimal)>
	//    4   10:putstatic       #24  <Field DecimalNode ZERO>
	//    5   13:ldc2w           #25  <Long 0x80000000L>
	//    6   16:invokestatic    #30  <Method BigDecimal BigDecimal.valueOf(long)>
	//    7   19:putstatic       #32  <Field BigDecimal MIN_INTEGER>
	//    8   22:ldc2w           #33  <Long 0x7fffffffL>
	//    9   25:invokestatic    #30  <Method BigDecimal BigDecimal.valueOf(long)>
	//   10   28:putstatic       #36  <Field BigDecimal MAX_INTEGER>
	//   11   31:ldc2w           #37  <Long 0x0L>
	//   12   34:invokestatic    #30  <Method BigDecimal BigDecimal.valueOf(long)>
	//   13   37:putstatic       #40  <Field BigDecimal MIN_LONG>
	//   14   40:ldc2w           #41  <Long 0xffffffffL>
	//   15   43:invokestatic    #30  <Method BigDecimal BigDecimal.valueOf(long)>
	//   16   46:putstatic       #44  <Field BigDecimal MAX_LONG>
	//*  17   49:return          
	}
}
