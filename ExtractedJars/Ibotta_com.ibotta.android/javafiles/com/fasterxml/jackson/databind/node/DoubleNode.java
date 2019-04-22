// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			NumericNode

public class DoubleNode extends NumericNode
{

	public DoubleNode(double d)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void NumericNode()>
		_value = d;
	//    2    4:aload_0         
	//    3    5:dload_1         
	//    4    6:putfield        #13  <Field double _value>
	//    5    9:return          
	}

	public static DoubleNode valueOf(double d)
	{
		return new DoubleNode(d);
	//    0    0:new             #2   <Class DoubleNode>
	//    1    3:dup             
	//    2    4:dload_0         
	//    3    5:invokespecial   #18  <Method void DoubleNode(double)>
	//    4    8:areturn         
	}

	public String asText()
	{
		return NumberOutput.toString(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double _value>
	//    2    4:invokestatic    #26  <Method String NumberOutput.toString(double)>
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

	public BigDecimal decimalValue()
	{
		return BigDecimal.valueOf(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double _value>
	//    2    4:invokestatic    #48  <Method BigDecimal BigDecimal.valueOf(double)>
	//    3    7:areturn         
	}

	public double doubleValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double _value>
	//    2    4:dreturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       13
			return false;
	//    7   11:iconst_0        
	//    8   12:ireturn         
		if(obj instanceof DoubleNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class DoubleNode>
	//*  11   17:ifeq            43
		{
			double d = ((DoubleNode)obj)._value;
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class DoubleNode>
	//   14   24:getfield        #13  <Field double _value>
	//   15   27:dstore_2        
			return Double.compare(_value, d) == 0;
	//   16   28:aload_0         
	//   17   29:getfield        #13  <Field double _value>
	//   18   32:dload_2         
	//   19   33:invokestatic    #58  <Method int Double.compare(double, double)>
	//   20   36:ifne            41
	//   21   39:iconst_1        
	//   22   40:ireturn         
	//   23   41:iconst_0        
	//   24   42:ireturn         
		} else
		{
			return false;
	//   25   43:iconst_0        
	//   26   44:ireturn         
		}
	}

	public int hashCode()
	{
		long l = Double.doubleToLongBits(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double _value>
	//    2    4:invokestatic    #64  <Method long Double.doubleToLongBits(double)>
	//    3    7:lstore_1        
		return (int)l ^ (int)(l >> 32);
	//    4    8:lload_1         
	//    5    9:l2i             
	//    6   10:lload_1         
	//    7   11:bipush          32
	//    8   13:lshr            
	//    9   14:l2i             
	//   10   15:ixor            
	//   11   16:ireturn         
	}

	public int intValue()
	{
		return (int)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double _value>
	//    2    4:d2i             
	//    3    5:ireturn         
	}

	public boolean isNaN()
	{
		return Double.isNaN(_value) || Double.isInfinite(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double _value>
	//    2    4:invokestatic    #70  <Method boolean Double.isNaN(double)>
	//    3    7:ifne            25
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field double _value>
	//    6   14:invokestatic    #73  <Method boolean Double.isInfinite(double)>
	//    7   17:ifeq            23
	//    8   20:goto            25
	//    9   23:iconst_0        
	//   10   24:ireturn         
	//   11   25:iconst_1        
	//   12   26:ireturn         
	}

	public long longValue()
	{
		return (long)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double _value>
	//    2    4:d2l             
	//    3    5:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE;
	//    0    0:getstatic       #83  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
	//    1    3:areturn         
	}

	public Number numberValue()
	{
		return ((Number) (Double.valueOf(_value)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field double _value>
	//    2    4:invokestatic    #88  <Method Double Double.valueOf(double)>
	//    3    7:areturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.writeNumber(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field double _value>
	//    3    5:invokevirtual   #97  <Method void JsonGenerator.writeNumber(double)>
	//    4    8:return          
	}

	protected final double _value;
}
