// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			NumericNode

public class ShortNode extends NumericNode
{

	public ShortNode(short word0)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void NumericNode()>
		_value = word0;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #13  <Field short _value>
	//    5    9:return          
	}

	public static ShortNode valueOf(short word0)
	{
		return new ShortNode(word0);
	//    0    0:new             #2   <Class ShortNode>
	//    1    3:dup             
	//    2    4:iload_0         
	//    3    5:invokespecial   #18  <Method void ShortNode(short)>
	//    4    8:areturn         
	}

	public boolean asBoolean(boolean flag)
	{
		return _value != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String asText()
	{
		return NumberOutput.toString(((int) (_value)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:invokestatic    #28  <Method String NumberOutput.toString(int)>
	//    3    7:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_NUMBER_INT;
	//    0    0:getstatic       #36  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    1    3:areturn         
	}

	public BigInteger bigIntegerValue()
	{
		return BigInteger.valueOf(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:i2l             
	//    3    5:invokestatic    #43  <Method BigInteger BigInteger.valueOf(long)>
	//    4    8:areturn         
	}

	public boolean canConvertToInt()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canConvertToLong()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public BigDecimal decimalValue()
	{
		return BigDecimal.valueOf(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:i2l             
	//    3    5:invokestatic    #53  <Method BigDecimal BigDecimal.valueOf(long)>
	//    4    8:areturn         
	}

	public double doubleValue()
	{
		return (double)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:i2d             
	//    3    5:dreturn         
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
			if(obj instanceof ShortNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class ShortNode>
	//*  11   17:ifeq            36
			{
				if(((ShortNode)obj)._value != _value)
	//*  12   20:aload_1         
	//*  13   21:checkcast       #2   <Class ShortNode>
	//*  14   24:getfield        #13  <Field short _value>
	//*  15   27:aload_0         
	//*  16   28:getfield        #13  <Field short _value>
	//*  17   31:icmpeq          5
					return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
			} else
			{
				return false;
	//   20   36:iconst_0        
	//   21   37:ireturn         
			}
		}
		return true;
	}

	public float floatValue()
	{
		return (float)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:i2f             
	//    3    5:freturn         
	}

	public int hashCode()
	{
		return ((int) (_value));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:ireturn         
	}

	public int intValue()
	{
		return ((int) (_value));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:ireturn         
	}

	public boolean isIntegralNumber()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isShort()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public long longValue()
	{
		return (long)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
	//    0    0:getstatic       #74  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//    1    3:areturn         
	}

	public Number numberValue()
	{
		return ((Number) (Short.valueOf(_value)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:invokestatic    #81  <Method Short Short.valueOf(short)>
	//    3    7:areturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeNumber(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field short _value>
	//    3    5:invokevirtual   #92  <Method void JsonGenerator.writeNumber(short)>
	//    4    8:return          
	}

	public short shortValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field short _value>
	//    2    4:ireturn         
	}

	protected final short _value;
}
