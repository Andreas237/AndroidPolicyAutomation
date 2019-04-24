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

public class IntNode extends NumericNode
{

	public IntNode(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void NumericNode()>
		_value = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #25  <Field int _value>
	//    5    9:return          
	}

	public static IntNode valueOf(int i)
	{
		if(i > 10 || i < -1)
	//*   0    0:iload_0         
	//*   1    1:bipush          10
	//*   2    3:icmpgt          11
	//*   3    6:iload_0         
	//*   4    7:iconst_m1       
	//*   5    8:icmpge          20
			return new IntNode(i);
	//    6   11:new             #2   <Class IntNode>
	//    7   14:dup             
	//    8   15:iload_0         
	//    9   16:invokespecial   #20  <Method void IntNode(int)>
	//   10   19:areturn         
		else
			return CANONICALS[i + 1];
	//   11   20:getstatic       #16  <Field IntNode[] CANONICALS>
	//   12   23:iload_0         
	//   13   24:iconst_1        
	//   14   25:iadd            
	//   15   26:aaload          
	//   16   27:areturn         
	}

	public boolean asBoolean(boolean flag)
	{
		return _value != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:ifeq            9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public String asText()
	{
		return NumberOutput.toString(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:invokestatic    #37  <Method String NumberOutput.toString(int)>
	//    3    7:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_NUMBER_INT;
	//    0    0:getstatic       #45  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    1    3:areturn         
	}

	public BigInteger bigIntegerValue()
	{
		return BigInteger.valueOf(_value);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:i2l             
	//    3    5:invokestatic    #52  <Method BigInteger BigInteger.valueOf(long)>
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
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:i2l             
	//    3    5:invokestatic    #62  <Method BigDecimal BigDecimal.valueOf(long)>
	//    4    8:areturn         
	}

	public double doubleValue()
	{
		return (double)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
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
			if(obj instanceof IntNode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class IntNode>
	//*  11   17:ifeq            36
			{
				if(((IntNode)obj)._value != _value)
	//*  12   20:aload_1         
	//*  13   21:checkcast       #2   <Class IntNode>
	//*  14   24:getfield        #25  <Field int _value>
	//*  15   27:aload_0         
	//*  16   28:getfield        #25  <Field int _value>
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
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:i2f             
	//    3    5:freturn         
	}

	public int hashCode()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:ireturn         
	}

	public int intValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:ireturn         
	}

	public boolean isInt()
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
		return (long)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:i2l             
	//    3    5:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
	//    0    0:getstatic       #83  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//    1    3:areturn         
	}

	public Number numberValue()
	{
		return ((Number) (Integer.valueOf(_value)));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:invokestatic    #90  <Method Integer Integer.valueOf(int)>
	//    3    7:areturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException, JsonProcessingException
	{
		jsongenerator.writeNumber(_value);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #25  <Field int _value>
	//    3    5:invokevirtual   #101 <Method void JsonGenerator.writeNumber(int)>
	//    4    8:return          
	}

	public short shortValue()
	{
		return (short)_value;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field int _value>
	//    2    4:int2short       
	//    3    5:ireturn         
	}

	private static final IntNode CANONICALS[];
	static final int MAX_CANONICAL = 10;
	static final int MIN_CANONICAL = -1;
	protected final int _value;

	static 
	{
		CANONICALS = new IntNode[12];
	//    0    0:bipush          12
	//    1    2:anewarray       IntNode[]
	//    2    5:putstatic       #16  <Field IntNode[] CANONICALS>
		for(int i = 0; i < 12; i++)
	//*   3    8:iconst_0        
	//*   4    9:istore_0        
	//*   5   10:iload_0         
	//*   6   11:bipush          12
	//*   7   13:icmpge          38
			CANONICALS[i] = new IntNode(i - 1);
	//    8   16:getstatic       #16  <Field IntNode[] CANONICALS>
	//    9   19:iload_0         
	//   10   20:new             #2   <Class IntNode>
	//   11   23:dup             
	//   12   24:iload_0         
	//   13   25:iconst_1        
	//   14   26:isub            
	//   15   27:invokespecial   #20  <Method void IntNode(int)>
	//   16   30:aastore         

	//   17   31:iload_0         
	//   18   32:iconst_1        
	//   19   33:iadd            
	//   20   34:istore_0        
	//*  21   35:goto            10
	//*  22   38:return          
	}
}
