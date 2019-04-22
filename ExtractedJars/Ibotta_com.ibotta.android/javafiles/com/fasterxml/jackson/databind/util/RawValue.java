// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			ClassUtil

public class RawValue
	implements JsonSerializable
{

	public RawValue(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_value = ((Object) (s));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Object _value>
	//    5    9:return          
	}

	protected void _serialize(JsonGenerator jsongenerator)
		throws IOException
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object _value>
	//    2    4:astore_2        
		if(obj instanceof SerializableString)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #22  <Class SerializableString>
	//*   5    9:ifeq            21
		{
			jsongenerator.writeRawValue((SerializableString)obj);
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:checkcast       #22  <Class SerializableString>
	//    9   17:invokevirtual   #28  <Method void JsonGenerator.writeRawValue(SerializableString)>
			return;
	//   10   20:return          
		} else
		{
			jsongenerator.writeRawValue(String.valueOf(obj));
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokestatic    #34  <Method String String.valueOf(Object)>
	//   14   26:invokevirtual   #36  <Method void JsonGenerator.writeRawValue(String)>
			return;
	//   15   29:return          
		}
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
		if(!(obj instanceof RawValue))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class RawValue>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		Object obj1 = ((Object) ((RawValue)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class RawValue>
	//   12   20:astore_2        
		obj = _value;
	//   13   21:aload_0         
	//   14   22:getfield        #15  <Field Object _value>
	//   15   25:astore_1        
		obj1 = ((RawValue) (obj1))._value;
	//   16   26:aload_2         
	//   17   27:getfield        #15  <Field Object _value>
	//   18   30:astore_2        
		if(obj == obj1)
	//*  19   31:aload_1         
	//*  20   32:aload_2         
	//*  21   33:if_acmpne       38
			return true;
	//   22   36:iconst_1        
	//   23   37:ireturn         
		return obj != null && obj.equals(obj1);
	//   24   38:aload_1         
	//   25   39:ifnull          52
	//   26   42:aload_1         
	//   27   43:aload_2         
	//   28   44:invokevirtual   #41  <Method boolean Object.equals(Object)>
	//   29   47:ifeq            52
	//   30   50:iconst_1        
	//   31   51:ireturn         
	//   32   52:iconst_0        
	//   33   53:ireturn         
	}

	public int hashCode()
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object _value>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return obj.hashCode();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #45  <Method int Object.hashCode()>
	//    9   15:ireturn         
	}

	public void serialize(JsonGenerator jsongenerator)
		throws IOException
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object _value>
	//    2    4:astore_2        
		if(obj instanceof JsonSerializable)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #6   <Class JsonSerializable>
	//*   5    9:ifeq            18
		{
			jsongenerator.writeObject(obj);
	//    6   12:aload_1         
	//    7   13:aload_2         
	//    8   14:invokevirtual   #50  <Method void JsonGenerator.writeObject(Object)>
			return;
	//    9   17:return          
		} else
		{
			_serialize(jsongenerator);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #52  <Method void _serialize(JsonGenerator)>
			return;
	//   13   23:return          
		}
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object _value>
	//    2    4:astore_3        
		if(obj instanceof JsonSerializable)
	//*   3    5:aload_3         
	//*   4    6:instanceof      #6   <Class JsonSerializable>
	//*   5    9:ifeq            24
		{
			((JsonSerializable)obj).serialize(jsongenerator, serializerprovider);
	//    6   12:aload_3         
	//    7   13:checkcast       #6   <Class JsonSerializable>
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #55  <Method void JsonSerializable.serialize(JsonGenerator, SerializerProvider)>
			return;
	//   11   23:return          
		} else
		{
			_serialize(jsongenerator);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #52  <Method void _serialize(JsonGenerator)>
			return;
	//   15   29:return          
		}
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		Object obj = _value;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object _value>
	//    2    4:astore          4
		if(obj instanceof JsonSerializable)
	//*   3    6:aload           4
	//*   4    8:instanceof      #6   <Class JsonSerializable>
	//*   5   11:ifeq            28
		{
			((JsonSerializable)obj).serializeWithType(jsongenerator, serializerprovider, typeserializer);
	//    6   14:aload           4
	//    7   16:checkcast       #6   <Class JsonSerializable>
	//    8   19:aload_1         
	//    9   20:aload_2         
	//   10   21:aload_3         
	//   11   22:invokeinterface #59  <Method void JsonSerializable.serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   12   27:return          
		}
		if(obj instanceof SerializableString)
	//*  13   28:aload           4
	//*  14   30:instanceof      #22  <Class SerializableString>
	//*  15   33:ifeq            42
			serialize(jsongenerator, serializerprovider);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:invokevirtual   #60  <Method void serialize(JsonGenerator, SerializerProvider)>
	//   20   42:return          
	}

	public String toString()
	{
		return String.format("[RawValue of type %s]", new Object[] {
			ClassUtil.classNameOf(_value)
		});
	//    0    0:ldc1            #64  <String "[RawValue of type %s]">
	//    1    2:iconst_1        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #15  <Field Object _value>
	//    7   12:invokestatic    #69  <Method String ClassUtil.classNameOf(Object)>
	//    8   15:aastore         
	//    9   16:invokestatic    #73  <Method String String.format(String, Object[])>
	//   10   19:areturn         
	}

	protected Object _value;
}
