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

public class BigIntegerNode extends NumericNode
{

	public BigIntegerNode(BigInteger biginteger)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void NumericNode()>
		_value = biginteger;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field BigInteger _value>
	//    5    9:return          
	}

	public static BigIntegerNode valueOf(BigInteger biginteger)
	{
		return new BigIntegerNode(biginteger);
	//    0    0:new             #2   <Class BigIntegerNode>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #44  <Method void BigIntegerNode(BigInteger)>
	//    4    8:areturn         
	}

	public boolean asBoolean(boolean flag)
	{
		return !BigInteger.ZERO.equals(((Object) (_value)));
	//    0    0:getstatic       #49  <Field BigInteger BigInteger.ZERO>
	//    1    3:aload_0         
	//    2    4:getfield        #41  <Field BigInteger _value>
	//    3    7:invokevirtual   #53  <Method boolean BigInteger.equals(Object)>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public String asText()
	{
		return _value.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #58  <Method String BigInteger.toString()>
	//    3    7:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_NUMBER_INT;
	//    0    0:getstatic       #66  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    1    3:areturn         
	}

	public BigInteger bigIntegerValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:areturn         
	}

	public boolean canConvertToInt()
	{
		return _value.compareTo(MIN_INTEGER) >= 0 && _value.compareTo(MAX_INTEGER) <= 0;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:getstatic       #22  <Field BigInteger MIN_INTEGER>
	//    3    7:invokevirtual   #74  <Method int BigInteger.compareTo(BigInteger)>
	//    4   10:iflt            28
	//    5   13:aload_0         
	//    6   14:getfield        #41  <Field BigInteger _value>
	//    7   17:getstatic       #26  <Field BigInteger MAX_INTEGER>
	//    8   20:invokevirtual   #74  <Method int BigInteger.compareTo(BigInteger)>
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
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:getstatic       #30  <Field BigInteger MIN_LONG>
	//    3    7:invokevirtual   #74  <Method int BigInteger.compareTo(BigInteger)>
	//    4   10:iflt            28
	//    5   13:aload_0         
	//    6   14:getfield        #41  <Field BigInteger _value>
	//    7   17:getstatic       #34  <Field BigInteger MAX_LONG>
	//    8   20:invokevirtual   #74  <Method int BigInteger.compareTo(BigInteger)>
	//    9   23:ifgt            28
	//   10   26:iconst_1        
	//   11   27:ireturn         
	//   12   28:iconst_0        
	//   13   29:ireturn         
	}

	public BigDecimal decimalValue()
	{
		return new BigDecimal(_value);
	//    0    0:new             #79  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field BigInteger _value>
	//    4    8:invokespecial   #80  <Method void BigDecimal(BigInteger)>
	//    5   11:areturn         
	}

	public double doubleValue()
	{
		return _value.doubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #84  <Method double BigInteger.doubleValue()>
	//    3    7:dreturn         
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
				if(obj instanceof BigIntegerNode)
	//*  15   19:aload_1         
	//*  16   20:instanceof      #2   <Class BigIntegerNode>
	//*  17   23:ifeq            9
					return ((BigIntegerNode)obj)._value.equals(((Object) (_value)));
	//   18   26:aload_1         
	//   19   27:checkcast       #2   <Class BigIntegerNode>
	//   20   30:getfield        #41  <Field BigInteger _value>
	//   21   33:aload_0         
	//   22   34:getfield        #41  <Field BigInteger _value>
	//   23   37:invokevirtual   #53  <Method boolean BigInteger.equals(Object)>
	//   24   40:ireturn         
			}
		}
		return flag;
	}

	public float floatValue()
	{
		return _value.floatValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #88  <Method float BigInteger.floatValue()>
	//    3    7:freturn         
	}

	public int hashCode()
	{
		return _value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #92  <Method int BigInteger.hashCode()>
	//    3    7:ireturn         
	}

	public int intValue()
	{
		return _value.intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #95  <Method int BigInteger.intValue()>
	//    3    7:ireturn         
	}

	public boolean isBigInteger()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isIntegralNumber()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public long longValue()
	{
		return _value.longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #101 <Method long BigInteger.longValue()>
	//    3    7:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
	//    0    0:getstatic       #109 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//    1    3:areturn         
	}

	public Number numberValue()
	{
		return ((Number) (_value));
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:areturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeNumber(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #41  <Field BigInteger _value>
	//    3    5:invokevirtual   #122 <Method void JsonGenerator.writeNumber(BigInteger)>
	//    4    8:return          
	}

	public short shortValue()
	{
		return _value.shortValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #127 <Method short BigInteger.shortValue()>
	//    3    7:ireturn         
	}

	private static final BigInteger MAX_INTEGER = BigInteger.valueOf(0x7fffffffL);
	private static final BigInteger MAX_LONG = BigInteger.valueOf(0xffffffffL);
	private static final BigInteger MIN_INTEGER = BigInteger.valueOf(0x80000000L);
	private static final BigInteger MIN_LONG = BigInteger.valueOf(0x0L);
	protected final BigInteger _value;

	static 
	{
	//    0    0:ldc2w           #13  <Long 0x80000000L>
	//    1    3:invokestatic    #20  <Method BigInteger BigInteger.valueOf(long)>
	//    2    6:putstatic       #22  <Field BigInteger MIN_INTEGER>
	//    3    9:ldc2w           #23  <Long 0x7fffffffL>
	//    4   12:invokestatic    #20  <Method BigInteger BigInteger.valueOf(long)>
	//    5   15:putstatic       #26  <Field BigInteger MAX_INTEGER>
	//    6   18:ldc2w           #27  <Long 0x0L>
	//    7   21:invokestatic    #20  <Method BigInteger BigInteger.valueOf(long)>
	//    8   24:putstatic       #30  <Field BigInteger MIN_LONG>
	//    9   27:ldc2w           #31  <Long 0xffffffffL>
	//   10   30:invokestatic    #20  <Method BigInteger BigInteger.valueOf(long)>
	//   11   33:putstatic       #34  <Field BigInteger MAX_LONG>
	//*  12   36:return          
	}
}
