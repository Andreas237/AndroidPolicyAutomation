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
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       20
			return pojonode._value == null;
	//    5    9:aload_1         
	//    6   10:getfield        #13  <Field Object _value>
	//    7   13:ifnonnull       18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
		else
			return obj.equals(pojonode._value);
	//   12   20:aload_2         
	//   13   21:aload_1         
	//   14   22:getfield        #13  <Field Object _value>
	//   15   25:invokevirtual   #22  <Method boolean Object.equals(Object)>
	//   16   28:ireturn         
	}

	public boolean asBoolean(boolean flag)
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:astore_2        
		if(obj != null && (obj instanceof Boolean))
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
	//*   5    9:aload_2         
	//*   6   10:instanceof      #26  <Class Boolean>
	//*   7   13:ifeq            24
			return ((Boolean)obj).booleanValue();
	//    8   16:aload_2         
	//    9   17:checkcast       #26  <Class Boolean>
	//   10   20:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
	//   11   23:ireturn         
		else
			return flag;
	//   12   24:iload_1         
	//   13   25:ireturn         
	}

	public String asText()
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       12
			return "null";
	//    5    9:ldc1            #34  <String "null">
	//    6   11:areturn         
		else
			return obj.toString();
	//    7   12:aload_1         
	//    8   13:invokevirtual   #37  <Method String Object.toString()>
	//    9   16:areturn         
	}

	public JsonToken asToken()
	{
		return JsonToken.VALUE_EMBEDDED_OBJECT;
	//    0    0:getstatic       #45  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    1    3:areturn         
	}

	public byte[] binaryValue()
		throws IOException
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:astore_1        
		if(obj instanceof byte[])
	//*   3    5:aload_1         
	//*   4    6:instanceof      #51  <Class byte[]>
	//*   5    9:ifeq            17
			return (byte[])obj;
	//    6   12:aload_1         
	//    7   13:checkcast       #51  <Class byte[]>
	//    8   16:areturn         
		else
			return super.binaryValue();
	//    9   17:aload_0         
	//   10   18:invokespecial   #53  <Method byte[] ValueNode.binaryValue()>
	//   11   21:areturn         
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
		if(obj instanceof POJONode)
	//*   9   13:aload_1         
	//*  10   14:instanceof      #2   <Class POJONode>
	//*  11   17:ifeq            29
			return _pojoEquals((POJONode)obj);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:checkcast       #2   <Class POJONode>
	//   15   25:invokevirtual   #56  <Method boolean _pojoEquals(POJONode)>
	//   16   28:ireturn         
		else
			return false;
	//   17   29:iconst_0        
	//   18   30:ireturn         
	}

	public JsonNodeType getNodeType()
	{
		return JsonNodeType.POJO;
	//    0    0:getstatic       #64  <Field JsonNodeType JsonNodeType.POJO>
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
	//    2    4:invokevirtual   #70  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       15
		{
			serializerprovider.defaultSerializeNull(jsongenerator);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #78  <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			return;
	//    8   14:return          
		}
		if(obj instanceof JsonSerializable)
	//*   9   15:aload_3         
	//*  10   16:instanceof      #80  <Class JsonSerializable>
	//*  11   19:ifeq            34
		{
			((JsonSerializable)obj).serialize(jsongenerator, serializerprovider);
	//   12   22:aload_3         
	//   13   23:checkcast       #80  <Class JsonSerializable>
	//   14   26:aload_1         
	//   15   27:aload_2         
	//   16   28:invokeinterface #82  <Method void JsonSerializable.serialize(JsonGenerator, SerializerProvider)>
			return;
	//   17   33:return          
		} else
		{
			jsongenerator.writeObject(obj);
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #87  <Method void JsonGenerator.writeObject(Object)>
			return;
	//   21   39:return          
		}
	}

	public String toString()
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object _value>
	//    2    4:astore_1        
		if(obj instanceof byte[])
	//*   3    5:aload_1         
	//*   4    6:instanceof      #51  <Class byte[]>
	//*   5    9:ifeq            33
			return String.format("(binary value of %d bytes)", new Object[] {
				Integer.valueOf(((byte[])obj).length)
			});
	//    6   12:ldc1            #89  <String "(binary value of %d bytes)">
	//    7   14:iconst_1        
	//    8   15:anewarray       Object[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_1         
	//   12   21:checkcast       #51  <Class byte[]>
	//   13   24:arraylength     
	//   14   25:invokestatic    #95  <Method Integer Integer.valueOf(int)>
	//   15   28:aastore         
	//   16   29:invokestatic    #101 <Method String String.format(String, Object[])>
	//   17   32:areturn         
		if(obj instanceof RawValue)
	//*  18   33:aload_1         
	//*  19   34:instanceof      #103 <Class RawValue>
	//*  20   37:ifeq            60
			return String.format("(raw value '%s')", new Object[] {
				((RawValue)obj).toString()
			});
	//   21   40:ldc1            #105 <String "(raw value '%s')">
	//   22   42:iconst_1        
	//   23   43:anewarray       Object[]
	//   24   46:dup             
	//   25   47:iconst_0        
	//   26   48:aload_1         
	//   27   49:checkcast       #103 <Class RawValue>
	//   28   52:invokevirtual   #106 <Method String RawValue.toString()>
	//   29   55:aastore         
	//   30   56:invokestatic    #101 <Method String String.format(String, Object[])>
	//   31   59:areturn         
		else
			return String.valueOf(obj);
	//   32   60:aload_1         
	//   33   61:invokestatic    #109 <Method String String.valueOf(Object)>
	//   34   64:areturn         
	}

	protected final Object _value;
}
