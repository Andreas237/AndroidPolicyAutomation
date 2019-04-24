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

public class RawValue
	implements JsonSerializable
{

	public RawValue(SerializableString serializablestring)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_value = ((Object) (serializablestring));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Object _value>
	//    5    9:return          
	}

	public RawValue(JsonSerializable jsonserializable)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_value = ((Object) (jsonserializable));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Object _value>
	//    5    9:return          
	}

	protected RawValue(Object obj, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		_value = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Object _value>
	//    5    9:return          
	}

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
		if(_value instanceof SerializableString)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Object _value>
	//*   2    4:instanceof      #25  <Class SerializableString>
	//*   3    7:ifeq            22
		{
			jsongenerator.writeRawValue((SerializableString)_value);
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field Object _value>
	//    7   15:checkcast       #25  <Class SerializableString>
	//    8   18:invokevirtual   #30  <Method void JsonGenerator.writeRawValue(SerializableString)>
			return;
	//    9   21:return          
		} else
		{
			jsongenerator.writeRawValue(String.valueOf(_value));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:getfield        #15  <Field Object _value>
	//   13   27:invokestatic    #36  <Method String String.valueOf(Object)>
	//   14   30:invokevirtual   #38  <Method void JsonGenerator.writeRawValue(String)>
			return;
	//   15   33:return          
		}
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
			if(!(obj instanceof RawValue))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class RawValue>
	//*   7   11:ifne            16
				return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
			obj = ((Object) ((RawValue)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class RawValue>
	//   12   20:astore_1        
			if(_value != ((RawValue) (obj))._value && (_value == null || !_value.equals(((RawValue) (obj))._value)))
	//*  13   21:aload_0         
	//*  14   22:getfield        #15  <Field Object _value>
	//*  15   25:aload_1         
	//*  16   26:getfield        #15  <Field Object _value>
	//*  17   29:if_acmpeq       5
	//*  18   32:aload_0         
	//*  19   33:getfield        #15  <Field Object _value>
	//*  20   36:ifnull          53
	//*  21   39:aload_0         
	//*  22   40:getfield        #15  <Field Object _value>
	//*  23   43:aload_1         
	//*  24   44:getfield        #15  <Field Object _value>
	//*  25   47:invokevirtual   #43  <Method boolean Object.equals(Object)>
	//*  26   50:ifne            5
				return false;
	//   27   53:iconst_0        
	//   28   54:ireturn         
		}
		return true;
	}

	public int hashCode()
	{
		if(_value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Object _value>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return _value.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #15  <Field Object _value>
	//    7   13:invokevirtual   #47  <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public Object rawValue()
	{
		return _value;
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Object _value>
	//    2    4:areturn         
	}

	public void serialize(JsonGenerator jsongenerator)
		throws IOException
	{
		if(_value instanceof JsonSerializable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Object _value>
	//*   2    4:instanceof      #6   <Class JsonSerializable>
	//*   3    7:ifeq            19
		{
			jsongenerator.writeObject(_value);
	//    4   10:aload_1         
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field Object _value>
	//    7   15:invokevirtual   #54  <Method void JsonGenerator.writeObject(Object)>
			return;
	//    8   18:return          
		} else
		{
			_serialize(jsongenerator);
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:invokevirtual   #56  <Method void _serialize(JsonGenerator)>
			return;
	//   12   24:return          
		}
	}

	public void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_value instanceof JsonSerializable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Object _value>
	//*   2    4:instanceof      #6   <Class JsonSerializable>
	//*   3    7:ifeq            25
		{
			((JsonSerializable)_value).serialize(jsongenerator, serializerprovider);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field Object _value>
	//    6   14:checkcast       #6   <Class JsonSerializable>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:invokeinterface #59  <Method void JsonSerializable.serialize(JsonGenerator, SerializerProvider)>
			return;
	//   10   24:return          
		} else
		{
			_serialize(jsongenerator);
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:invokevirtual   #56  <Method void _serialize(JsonGenerator)>
			return;
	//   14   30:return          
		}
	}

	public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(_value instanceof JsonSerializable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Object _value>
	//*   2    4:instanceof      #6   <Class JsonSerializable>
	//*   3    7:ifeq            26
			((JsonSerializable)_value).serializeWithType(jsongenerator, serializerprovider, typeserializer);
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field Object _value>
	//    6   14:checkcast       #6   <Class JsonSerializable>
	//    7   17:aload_1         
	//    8   18:aload_2         
	//    9   19:aload_3         
	//   10   20:invokeinterface #63  <Method void JsonSerializable.serializeWithType(JsonGenerator, SerializerProvider, TypeSerializer)>
		else
	//*  11   25:return          
		if(_value instanceof SerializableString)
	//*  12   26:aload_0         
	//*  13   27:getfield        #15  <Field Object _value>
	//*  14   30:instanceof      #25  <Class SerializableString>
	//*  15   33:ifeq            25
		{
			serialize(jsongenerator, serializerprovider);
	//   16   36:aload_0         
	//   17   37:aload_1         
	//   18   38:aload_2         
	//   19   39:invokevirtual   #64  <Method void serialize(JsonGenerator, SerializerProvider)>
			return;
	//   20   42:return          
		}
	}

	public String toString()
	{
		String s;
		if(_value == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field Object _value>
	//*   2    4:ifnonnull       24
			s = "NULL";
	//    3    7:ldc1            #68  <String "NULL">
	//    4    9:astore_1        
		else
	//*   5   10:ldc1            #70  <String "[RawValue of type %s]">
	//*   6   12:iconst_1        
	//*   7   13:anewarray       Object[]
	//*   8   16:dup             
	//*   9   17:iconst_0        
	//*  10   18:aload_1         
	//*  11   19:aastore         
	//*  12   20:invokestatic    #74  <Method String String.format(String, Object[])>
	//*  13   23:areturn         
			s = _value.getClass().getName();
	//   14   24:aload_0         
	//   15   25:getfield        #15  <Field Object _value>
	//   16   28:invokevirtual   #78  <Method Class Object.getClass()>
	//   17   31:invokevirtual   #83  <Method String Class.getName()>
	//   18   34:astore_1        
		return String.format("[RawValue of type %s]", new Object[] {
			s
		});
	//*  19   35:goto            10
	}

	protected Object _value;
}
