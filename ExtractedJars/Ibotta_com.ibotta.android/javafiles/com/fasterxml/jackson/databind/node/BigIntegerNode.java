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
		return BigInteger.ZERO.equals(((Object) (_value))) ^ true;
	//    0    0:getstatic       #49  <Field BigInteger BigInteger.ZERO>
	//    1    3:aload_0         
	//    2    4:getfield        #41  <Field BigInteger _value>
	//    3    7:invokevirtual   #53  <Method boolean BigInteger.equals(Object)>
	//    4   10:iconst_1        
	//    5   11:ixor            
	//    6   12:ireturn         
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

	public BigDecimal decimalValue()
	{
		return new BigDecimal(_value);
	//    0    0:new             #72  <Class BigDecimal>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #41  <Field BigInteger _value>
	//    4    8:invokespecial   #73  <Method void BigDecimal(BigInteger)>
	//    5   11:areturn         
	}

	public double doubleValue()
	{
		return _value.doubleValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #77  <Method double BigInteger.doubleValue()>
	//    3    7:dreturn         
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
		if(!(obj instanceof BigIntegerNode))
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class BigIntegerNode>
	//*  11   17:ifne            22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		else
			return ((BigIntegerNode)obj)._value.equals(((Object) (_value)));
	//   14   22:aload_1         
	//   15   23:checkcast       #2   <Class BigIntegerNode>
	//   16   26:getfield        #41  <Field BigInteger _value>
	//   17   29:aload_0         
	//   18   30:getfield        #41  <Field BigInteger _value>
	//   19   33:invokevirtual   #53  <Method boolean BigInteger.equals(Object)>
	//   20   36:ireturn         
	}

	public int hashCode()
	{
		return _value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #81  <Method int BigInteger.hashCode()>
	//    3    7:ireturn         
	}

	public int intValue()
	{
		return _value.intValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #84  <Method int BigInteger.intValue()>
	//    3    7:ireturn         
	}

	public long longValue()
	{
		return _value.longValue();
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field BigInteger _value>
	//    2    4:invokevirtual   #88  <Method long BigInteger.longValue()>
	//    3    7:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType numberType()
	{
		return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
	//    0    0:getstatic       #96  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
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
	//    3    5:invokevirtual   #109 <Method void JsonGenerator.writeNumber(BigInteger)>
	//    4    8:return          
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
