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

	public BigDecimal decimalValue()
	{
		return BigDecimal.valueOf(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:invokestatic    #50  <Method BigDecimal BigDecimal.valueOf(long)>
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
		if(obj instanceof LongNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class LongNode>
	//*  11   17:ifeq            39
			return ((LongNode)obj)._value == _value;
	//   12   20:aload_1         
	//   13   21:checkcast       #2   <Class LongNode>
	//   14   24:getfield        #13  <Field long _value>
	//   15   27:aload_0         
	//   16   28:getfield        #13  <Field long _value>
	//   17   31:lcmp            
	//   18   32:ifne            37
	//   19   35:iconst_1        
	//   20   36:ireturn         
	//   21   37:iconst_0        
	//   22   38:ireturn         
		else
			return false;
	//   23   39:iconst_0        
	//   24   40:ireturn         
	}

	public int hashCode()
	{
		long l = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:lstore_1        
		return (int)l ^ (int)(l >> 32);
	//    3    5:lload_1         
	//    4    6:l2i             
	//    5    7:lload_1         
	//    6    8:bipush          32
	//    7   10:lshr            
	//    8   11:l2i             
	//    9   12:ixor            
	//   10   13:ireturn         
	}

	public int intValue()
	{
		return (int)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:l2i             
	//    3    5:ireturn         
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
	//    0    0:getstatic       #67  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//    1    3:areturn         
	}

	public Number numberValue()
	{
		return ((Number) (Long.valueOf(_value)));
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field long _value>
	//    2    4:invokestatic    #74  <Method Long Long.valueOf(long)>
	//    3    7:areturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeNumber(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #13  <Field long _value>
	//    3    5:invokevirtual   #85  <Method void JsonGenerator.writeNumber(long)>
	//    4    8:return          
	}

	protected final long _value;
}
