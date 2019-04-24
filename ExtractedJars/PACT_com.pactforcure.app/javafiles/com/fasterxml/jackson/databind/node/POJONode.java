// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.RawValue;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//			ValueNode, JsonNodeType

public class POJONode extends ValueNode
{

	public POJONode(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void ValueNode()>
		_value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Object _value>
	//    5    9:return          
	}

	protected boolean _pojoEquals(POJONode pojonode)
	{
		if(_value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:ifnonnull       18
			return pojonode._value == null;
	//    3    7:aload_1         
	//    4    8:getfield        #13  <Field Object _value>
	//    5   11:ifnonnull       16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
		else
			return _value.equals(pojonode._value);
	//   10   18:aload_0         
	//   11   19:getfield        #13  <Field Object _value>
	//   12   22:aload_1         
	//   13   23:getfield        #13  <Field Object _value>
	//   14   26:invokevirtual   #22  <Method boolean Object.equals(Object)>
	//   15   29:ireturn         
	}

	public boolean asBoolean(boolean flag)
	{
		boolean flag1 = flag;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(_value != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #13  <Field Object _value>
	//*   4    6:ifnull          32
		{
			flag1 = flag;
	//    5    9:iload_1         
	//    6   10:istore_2        
			if(_value instanceof Boolean)
	//*   7   11:aload_0         
	//*   8   12:getfield        #13  <Field Object _value>
	//*   9   15:instanceof      #26  <Class Boolean>
	//*  10   18:ifeq            32
				flag1 = ((Boolean)_value).booleanValue();
	//   11   21:aload_0         
	//   12   22:getfield        #13  <Field Object _value>
	//   13   25:checkcast       #26  <Class Boolean>
	//   14   28:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
	//   15   31:istore_2        
		}
		return flag1;
	//   16   32:iload_2         
	//   17   33:ireturn         
	}

	public double asDouble(double d)
	{
		if(_value instanceof Number)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:instanceof      #34  <Class Number>
	//*   3    7:ifeq            21
			d = ((Number)_value).doubleValue();
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field Object _value>
	//    6   14:checkcast       #34  <Class Number>
	//    7   17:invokevirtual   #38  <Method double Number.doubleValue()>
	//    8   20:dstore_1        
		return d;
	//    9   21:dload_1         
	//   10   22:dreturn         
	}

	public int asInt(int i)
	{
		if(_value instanceof Number)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:instanceof      #34  <Class Number>
	//*   3    7:ifeq            21
			i = ((Number)_value).intValue();
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field Object _value>
	//    6   14:checkcast       #34  <Class Number>
	//    7   17:invokevirtual   #44  <Method int Number.intValue()>
	//    8   20:istore_1        
		return i;
	//    9   21:iload_1         
	//   10   22:ireturn         
	}

	public long asLong(long l)
	{
		if(_value instanceof Number)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:instanceof      #34  <Class Number>
	//*   3    7:ifeq            21
			l = ((Number)_value).longValue();
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field Object _value>
	//    6   14:checkcast       #34  <Class Number>
	//    7   17:invokevirtual   #50  <Method long Number.longValue()>
	//    8   20:lstore_1        
		return l;
	//    9   21:lload_1         
	//   10   22:lreturn         
	}

	public String asText()
	{
		if(_value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:ifnonnull       10
			return "null";
	//    3    7:ldc1            #54  <String "null">
	//    4    9:areturn         
		else
			return _value.toString();
	//    5   10:aload_0         
	//    6   11:getfield        #13  <Field Object _value>
	//    7   14:invokevirtual   #57  <Method String Object.toString()>
	//    8   17:areturn         
	}

	public String asText(String s)
	{
		if(_value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:ifnonnull       9
			return s;
	//    3    7:aload_1         
	//    4    8:areturn         
		else
			return _value.toString();
	//    5    9:aload_0         
	//    6   10:getfield        #13  <Field Object _value>
	//    7   13:invokevirtual   #57  <Method String Object.toString()>
	//    8   16:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_EMBEDDED_OBJECT;
	//    0    0:getstatic       #66  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    1    3:areturn         
	}

	public byte[] binaryValue()
		throws IOException
	{
		if(_value instanceof byte[])
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:instanceof      #72  <Class byte[]>
	//*   3    7:ifeq            21
			return (byte[])(byte[])_value;
	//    4   10:aload_0         
	//    5   11:getfield        #13  <Field Object _value>
	//    6   14:checkcast       #72  <Class byte[]>
	//    7   17:checkcast       #72  <Class byte[]>
	//    8   20:areturn         
		else
			return super.binaryValue();
	//    9   21:aload_0         
	//   10   22:invokespecial   #74  <Method byte[] ValueNode.binaryValue()>
	//   11   25:areturn         
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
				if(obj instanceof POJONode)
	//*  15   19:aload_1         
	//*  16   20:instanceof      #2   <Class POJONode>
	//*  17   23:ifeq            9
					return _pojoEquals((POJONode)obj);
	//   18   26:aload_0         
	//   19   27:aload_1         
	//   20   28:checkcast       #2   <Class POJONode>
	//   21   31:invokevirtual   #77  <Method boolean _pojoEquals(POJONode)>
	//   22   34:ireturn         
			}
		}
		return flag;
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.POJO;
	//    0    0:getstatic       #85  <Field JsonNodeType JsonNodeType.POJO>
	//    1    3:areturn         
	}

	public Object getPojo()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return _value.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:invokevirtual   #90  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:ifnonnull       13
		{
			serializerprovider.defaultSerializeNull(jsongenerator);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #98  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			return;
	//    6   12:return          
		}
		if(_value instanceof JsonSerializable)
	//*   7   13:aload_0         
	//*   8   14:getfield        #13  <Field Object _value>
	//*   9   17:instanceof      #100 <Class JsonSerializable>
	//*  10   20:ifeq            38
		{
			((JsonSerializable)_value).serialize(jsongenerator, serializerprovider);
	//   11   23:aload_0         
	//   12   24:getfield        #13  <Field Object _value>
	//   13   27:checkcast       #100 <Class JsonSerializable>
	//   14   30:aload_1         
	//   15   31:aload_2         
	//   16   32:invokeinterface #102 <Method void JsonSerializable.serialize(JsonGenerator, SerializerProvider)>
			return;
	//   17   37:return          
		} else
		{
			jsongenerator.writeObject(_value);
	//   18   38:aload_1         
	//   19   39:aload_0         
	//   20   40:getfield        #13  <Field Object _value>
	//   21   43:invokevirtual   #107 <Method void JsonGenerator.writeObject(Object)>
			return;
	//   22   46:return          
		}
	}

	public String toString()
	{
		if(_value instanceof byte[])
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field Object _value>
	//*   2    4:instanceof      #72  <Class byte[]>
	//*   3    7:ifeq            37
			return String.format("(binary value of %d bytes)", new Object[] {
				Integer.valueOf(((byte[])(byte[])_value).length)
			});
	//    4   10:ldc1            #109 <String "(binary value of %d bytes)">
	//    5   12:iconst_1        
	//    6   13:anewarray       Object[]
	//    7   16:dup             
	//    8   17:iconst_0        
	//    9   18:aload_0         
	//   10   19:getfield        #13  <Field Object _value>
	//   11   22:checkcast       #72  <Class byte[]>
	//   12   25:checkcast       #72  <Class byte[]>
	//   13   28:arraylength     
	//   14   29:invokestatic    #115 <Method Integer Integer.valueOf(int)>
	//   15   32:aastore         
	//   16   33:invokestatic    #121 <Method String String.format(String, Object[])>
	//   17   36:areturn         
		if(_value instanceof RawValue)
	//*  18   37:aload_0         
	//*  19   38:getfield        #13  <Field Object _value>
	//*  20   41:instanceof      #123 <Class RawValue>
	//*  21   44:ifeq            70
			return String.format("(raw value '%s')", new Object[] {
				((RawValue)_value).toString()
			});
	//   22   47:ldc1            #125 <String "(raw value '%s')">
	//   23   49:iconst_1        
	//   24   50:anewarray       Object[]
	//   25   53:dup             
	//   26   54:iconst_0        
	//   27   55:aload_0         
	//   28   56:getfield        #13  <Field Object _value>
	//   29   59:checkcast       #123 <Class RawValue>
	//   30   62:invokevirtual   #126 <Method String RawValue.toString()>
	//   31   65:aastore         
	//   32   66:invokestatic    #121 <Method String String.format(String, Object[])>
	//   33   69:areturn         
		else
			return String.valueOf(_value);
	//   34   70:aload_0         
	//   35   71:getfield        #13  <Field Object _value>
	//   36   74:invokestatic    #129 <Method String String.valueOf(Object)>
	//   37   77:areturn         
	}

	protected final Object _value;
}
