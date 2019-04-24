// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//			TypeSerializerBase

public class AsWrapperTypeSerializer extends TypeSerializerBase
{

	public AsWrapperTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty)
	{
		super(typeidresolver, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void TypeSerializerBase(TypeIdResolver, BeanProperty)>
	//    4    6:return          
	}

	protected String _validTypeId(String s)
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
			s1 = "";
	//    4    6:ldc1            #13  <String "">
	//    5    8:astore_2        
		return s1;
	//    6    9:aload_2         
	//    7   10:areturn         
	}

	public volatile TypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((TypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #18  <Method AsWrapperTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public AsWrapperTypeSerializer forProperty(BeanProperty beanproperty)
	{
		if(_property == beanproperty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new AsWrapperTypeSerializer(_idResolver, beanproperty);
	//    6   10:new             #2   <Class AsWrapperTypeSerializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #26  <Field TypeIdResolver _idResolver>
	//   10   18:aload_1         
	//   11   19:invokespecial   #27  <Method void AsWrapperTypeSerializer(TypeIdResolver, BeanProperty)>
	//   12   22:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
	//    0    0:getstatic       #35  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_OBJECT>
	//    1    3:areturn         
	}

	public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifeq            21
		{
			if(s != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          16
				jsongenerator.writeTypeId(((Object) (s)));
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartArray();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #53  <Method void JsonGenerator.writeStartArray()>
			return;
	//   10   20:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeArrayFieldStart(_validTypeId(s));
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #58  <Method String _validTypeId(String)>
	//   17   31:invokevirtual   #62  <Method void JsonGenerator.writeArrayFieldStart(String)>
			return;
	//   18   34:return          
		}
	}

	public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifeq            21
		{
			if(s != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          16
				jsongenerator.writeTypeId(((Object) (s)));
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartObject();
	//    8   16:aload_2         
	//    9   17:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			return;
	//   10   20:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeObjectFieldStart(_validTypeId(s));
	//   13   25:aload_2         
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #58  <Method String _validTypeId(String)>
	//   17   31:invokevirtual   #67  <Method void JsonGenerator.writeObjectFieldStart(String)>
			return;
	//   18   34:return          
		}
	}

	public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifeq            17
		{
			if(s != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          16
				jsongenerator.writeTypeId(((Object) (s)));
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			return;
	//    8   16:return          
		} else
		{
			jsongenerator.writeStartObject();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(_validTypeId(s));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:aload_3         
	//   14   24:invokevirtual   #58  <Method String _validTypeId(String)>
	//   15   27:invokevirtual   #71  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   16   30:return          
		}
	}

	public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(!jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifne            13
			writeTypeSuffixForArray(obj, jsongenerator);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #76  <Method void writeTypeSuffixForArray(Object, JsonGenerator)>
	//    7   13:return          
	}

	public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(!jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifne            13
			writeTypeSuffixForObject(obj, jsongenerator);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #80  <Method void writeTypeSuffixForObject(Object, JsonGenerator)>
	//    7   13:return          
	}

	public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(!jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifne            13
			writeTypeSuffixForScalar(obj, jsongenerator);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #84  <Method void writeTypeSuffixForScalar(Object, JsonGenerator)>
	//    7   13:return          
	}

	public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		obj = ((Object) (idFromValue(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #89  <Method String idFromValue(Object)>
	//    3    5:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   6   10:ifeq            27
		{
			if(obj != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
				jsongenerator.writeTypeId(obj);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartArray();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #53  <Method void JsonGenerator.writeStartArray()>
			return;
	//   14   26:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeArrayFieldStart(_validTypeId(((String) (obj))));
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #58  <Method String _validTypeId(String)>
	//   21   37:invokevirtual   #62  <Method void JsonGenerator.writeArrayFieldStart(String)>
			return;
	//   22   40:return          
		}
	}

	public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		obj = ((Object) (idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #94  <Method String idFromValueAndType(Object, Class)>
	//    4    6:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   7   11:ifeq            28
		{
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				jsongenerator.writeTypeId(obj);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartArray();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #53  <Method void JsonGenerator.writeStartArray()>
			return;
	//   15   27:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeArrayFieldStart(_validTypeId(((String) (obj))));
	//   18   32:aload_2         
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #58  <Method String _validTypeId(String)>
	//   22   38:invokevirtual   #62  <Method void JsonGenerator.writeArrayFieldStart(String)>
			return;
	//   23   41:return          
		}
	}

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		obj = ((Object) (idFromValue(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #89  <Method String idFromValue(Object)>
	//    3    5:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   6   10:ifeq            27
		{
			if(obj != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
				jsongenerator.writeTypeId(obj);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartObject();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			return;
	//   14   26:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeObjectFieldStart(_validTypeId(((String) (obj))));
	//   17   31:aload_2         
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #58  <Method String _validTypeId(String)>
	//   21   37:invokevirtual   #67  <Method void JsonGenerator.writeObjectFieldStart(String)>
			return;
	//   22   40:return          
		}
	}

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		obj = ((Object) (idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #94  <Method String idFromValueAndType(Object, Class)>
	//    4    6:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   7   11:ifeq            28
		{
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				jsongenerator.writeTypeId(obj);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartObject();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			return;
	//   15   27:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeObjectFieldStart(_validTypeId(((String) (obj))));
	//   18   32:aload_2         
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:invokevirtual   #58  <Method String _validTypeId(String)>
	//   22   38:invokevirtual   #67  <Method void JsonGenerator.writeObjectFieldStart(String)>
			return;
	//   23   41:return          
		}
	}

	public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		obj = ((Object) (idFromValue(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #89  <Method String idFromValue(Object)>
	//    3    5:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   6   10:ifeq            23
		{
			if(obj != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
				jsongenerator.writeTypeId(obj);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			return;
	//   12   22:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(_validTypeId(((String) (obj))));
	//   15   27:aload_2         
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #58  <Method String _validTypeId(String)>
	//   19   33:invokevirtual   #71  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   20   36:return          
		}
	}

	public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		obj = ((Object) (idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #94  <Method String idFromValueAndType(Object, Class)>
	//    4    6:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   7   11:ifeq            24
		{
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				jsongenerator.writeTypeId(obj);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #49  <Method void JsonGenerator.writeTypeId(Object)>
			return;
	//   13   23:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   14   24:aload_2         
	//   15   25:invokevirtual   #56  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(_validTypeId(((String) (obj))));
	//   16   28:aload_2         
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:invokevirtual   #58  <Method String _validTypeId(String)>
	//   20   34:invokevirtual   #71  <Method void JsonGenerator.writeFieldName(String)>
			return;
	//   21   37:return          
		}
	}

	public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeEndArray();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #101 <Method void JsonGenerator.writeEndArray()>
		if(!jsongenerator.canWriteTypeId())
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   4    8:ifne            15
			jsongenerator.writeEndObject();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #104 <Method void JsonGenerator.writeEndObject()>
	//    7   15:return          
	}

	public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeEndObject();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #104 <Method void JsonGenerator.writeEndObject()>
		if(!jsongenerator.canWriteTypeId())
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   4    8:ifne            15
			jsongenerator.writeEndObject();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #104 <Method void JsonGenerator.writeEndObject()>
	//    7   15:return          
	}

	public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		if(!jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #45  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifne            11
			jsongenerator.writeEndObject();
	//    3    7:aload_2         
	//    4    8:invokevirtual   #104 <Method void JsonGenerator.writeEndObject()>
	//    5   11:return          
	}
}
