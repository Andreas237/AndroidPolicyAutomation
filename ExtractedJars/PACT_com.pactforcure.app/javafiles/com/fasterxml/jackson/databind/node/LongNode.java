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

public class LongNode extends NumericNode
{

	public LongNode(long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void NumericNode()>
		_value = l;
	//    2    4:aload_0         
	//    3    5:lload_1         
	//    4    6:putfield        #13  <Field long _value>
	//    5    9:return          
	}

	public static LongNode valueOf(long l)
	{
		return new LongNode(l);
	//    0    0:new             #2   <Class LongNode>
	//    1    3:dup             
	//    2    4:lload_0         
	//    3    5:invokespecial   #18  <Method void LongNode(long)>
	//    4    8:areturn         
	}

	public boolean asBoolean(boolean flag)
	{
		return _value != 0L;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public String asText()
	{
		return NumberOutput.toString(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:invokestatic    #28  <Method String NumberOutput.toString(long)>
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
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:invokestatic    #43  <Method BigInteger BigInteger.valueOf(long)>
	//    3    7:areturn         
	}

	public boolean canConvertToInt()
	{
		return _value >= 0x80000000L && _value <= 0x7fffffffL;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:ldc2w           #46  <Long 0x80000000L>
	//    3    7:lcmp            
	//    4    8:iflt            24
	//    5   11:aload_0         
	//    6   12:getfield        #13  <Field long _value>
	//    7   15:ldc2w           #48  <Long 0x7fffffffL>
	//    8   18:lcmp            
	//    9   19:ifgt            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
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
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:invokestatic    #57  <Method BigDecimal BigDecimal.valueOf(long)>
	//    3    7:areturn         
	}

	public double doubleValue()
	{
		return (double)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:l2d             
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
			if(obj instanceof LongNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class LongNode>
	//*  11   17:ifeq            37
			{
				if(((LongNode)obj)._value != _value)
	//*  12   20:aload_1         
	//*  13   21:checkcast       #2   <Class LongNode>
	//*  14   24:getfield        #13  <Field long _value>
	//*  15   27:aload_0         
	//*  16   28:getfield        #13  <Field long _value>
	//*  17   31:lcmp            
	//*  18   32:ifeq            5
					return false;
	//   19   35:iconst_0        
	//   20   36:ireturn         
			} else
			{
				return false;
	//   21   37:iconst_0        
	//   22   38:ireturn         
			}
		}
		return true;
	}

	public float floatValue()
	{
		return (float)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:l2f             
	//    3    5:freturn         
	}

	public int hashCode()
	{
		return (int)_value ^ (int)(_value >> 32);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:l2i             
	//    3    5:aload_0         
	//    4    6:getfield        #13  <Field long _value>
	//    5    9:bipush          32
	//    6   11:lshr            
	//    7   12:l2i             
	//    8   13:ixor            
	//    9   14:ireturn         
	}

	public int intValue()
	{
		return (int)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:l2i             
	//    3    5:ireturn         
	}

	public boolean isIntegralNumber()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean isLong()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public long longValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
	//    0    0:getstatic       #78  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//    1    3:areturn         
	}

	public Number numberValue()
	{
		return ((Number) (Long.valueOf(_value)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:invokestatic    #85  <Method Long Long.valueOf(long)>
	//    3    7:areturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeNumber(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field long _value>
	//    3    5:invokevirtual   #96  <Method void JsonGenerator.writeNumber(long)>
	//    4    8:return          
	}

	public short shortValue()
	{
		return (short)(int)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:l2i             
	//    3    5:int2short       
	//    4    6:ireturn         
	}

	protected final long _value;
}
