// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			NumericNode

public class FloatNode extends NumericNode
{

	public FloatNode(float f)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void NumericNode()>
		_value = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #13  <Field float _value>
	//    5    9:return          
	}

	public static FloatNode valueOf(float f)
	{
		return new FloatNode(f);
	//    0    0:new             #2   <Class FloatNode>
	//    1    3:dup             
	//    2    4:fload_0         
	//    3    5:invokespecial   #18  <Method void FloatNode(float)>
	//    4    8:areturn         
	}

	public String asText()
	{
		return Float.toString(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:invokestatic    #26  <Method String Float.toString(float)>
	//    3    7:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_NUMBER_FLOAT;
	//    0    0:getstatic       #34  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    1    3:areturn         
	}

	public BigInteger bigIntegerValue()
	{
		return decimalValue().toBigInteger();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #40  <Method BigDecimal decimalValue()>
	//    2    4:invokevirtual   #45  <Method BigInteger BigDecimal.toBigInteger()>
	//    3    7:areturn         
	}

	public boolean canConvertToInt()
	{
		return _value >= -2.147484E+09F && _value <= 2.147484E+09F;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:ldc1            #48  <Float -2.147484E+09F>
	//    3    6:fcmpl           
	//    4    7:iflt            22
	//    5   10:aload_0         
	//    6   11:getfield        #13  <Field float _value>
	//    7   14:ldc1            #49  <Float 2.147484E+09F>
	//    8   16:fcmpg           
	//    9   17:ifgt            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public boolean canConvertToLong()
	{
		return _value >= -9.223372E+18F && _value <= 9.223372E+18F;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:ldc1            #51  <Float -9.223372E+18F>
	//    3    6:fcmpl           
	//    4    7:iflt            22
	//    5   10:aload_0         
	//    6   11:getfield        #13  <Field float _value>
	//    7   14:ldc1            #52  <Float 9.223372E+18F>
	//    8   16:fcmpg           
	//    9   17:ifgt            22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
	}

	public BigDecimal decimalValue()
	{
		return BigDecimal.valueOf(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:f2d             
	//    3    5:invokestatic    #55  <Method BigDecimal BigDecimal.valueOf(double)>
	//    4    8:areturn         
	}

	public double doubleValue()
	{
		return (double)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:f2d             
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
			if(obj instanceof FloatNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class FloatNode>
	//*  11   17:ifeq            41
			{
				float f = ((FloatNode)obj)._value;
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class FloatNode>
	//   14   24:getfield        #13  <Field float _value>
	//   15   27:fstore_2        
				if(Float.compare(_value, f) != 0)
	//*  16   28:aload_0         
	//*  17   29:getfield        #13  <Field float _value>
	//*  18   32:fload_2         
	//*  19   33:invokestatic    #63  <Method int Float.compare(float, float)>
	//*  20   36:ifeq            5
					return false;
	//   21   39:iconst_0        
	//   22   40:ireturn         
			} else
			{
				return false;
	//   23   41:iconst_0        
	//   24   42:ireturn         
			}
		}
		return true;
	}

	public float floatValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:freturn         
	}

	public int hashCode()
	{
		return Float.floatToIntBits(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:invokestatic    #71  <Method int Float.floatToIntBits(float)>
	//    3    7:ireturn         
	}

	public int intValue()
	{
		return (int)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:f2i             
	//    3    5:ireturn         
	}

	public boolean isFloat()
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
		return (long)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:f2l             
	//    3    5:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT;
	//    0    0:getstatic       #84  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
	//    1    3:areturn         
	}

	public Number numberValue()
	{
		return ((Number) (Float.valueOf(_value)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:invokestatic    #89  <Method Float Float.valueOf(float)>
	//    3    7:areturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeNumber(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field float _value>
	//    3    5:invokevirtual   #98  <Method void JsonGenerator.writeNumber(float)>
	//    4    8:return          
	}

	public short shortValue()
	{
		return (short)(int)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field float _value>
	//    2    4:f2i             
	//    3    5:int2short       
	//    4    6:ireturn         
	}

	protected final float _value;
}
