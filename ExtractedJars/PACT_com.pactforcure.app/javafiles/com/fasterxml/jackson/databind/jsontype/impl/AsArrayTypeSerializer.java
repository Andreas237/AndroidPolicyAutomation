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

public class AsArrayTypeSerializer extends TypeSerializerBase
{

	public AsArrayTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty)
	{
		super(typeidresolver, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void TypeSerializerBase(TypeIdResolver, BeanProperty)>
	//    4    6:return          
	}

	public volatile TypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((TypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #14  <Method AsArrayTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public AsArrayTypeSerializer forProperty(BeanProperty beanproperty)
	{
		if(_property == beanproperty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new AsArrayTypeSerializer(_idResolver, beanproperty);
	//    6   10:new             #2   <Class AsArrayTypeSerializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #22  <Field TypeIdResolver _idResolver>
	//   10   18:aload_1         
	//   11   19:invokespecial   #23  <Method void AsArrayTypeSerializer(TypeIdResolver, BeanProperty)>
	//   12   22:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
	//    0    0:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_ARRAY>
	//    1    3:areturn         
	}

	public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifeq            21
		{
			if(s != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          16
				jsongenerator.writeTypeId(((Object) (s)));
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
		} else
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
	//*  10   20:return          
		{
			jsongenerator.writeStartArray();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(s);
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
		}
		jsongenerator.writeStartArray();
	//*  16   30:goto            16
	}

	public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifeq            21
		{
			if(s != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          16
				jsongenerator.writeTypeId(((Object) (s)));
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
		} else
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #58  <Method void JsonGenerator.writeStartObject()>
	//*  10   20:return          
		{
			jsongenerator.writeStartArray();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(s);
	//   13   25:aload_2         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
		}
		jsongenerator.writeStartObject();
	//*  16   30:goto            16
	}

	public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifeq            17
		{
			if(s != null)
	//*   3    7:aload_3         
	//*   4    8:ifnull          16
				jsongenerator.writeTypeId(((Object) (s)));
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
			return;
	//    8   16:return          
		} else
		{
			jsongenerator.writeStartArray();
	//    9   17:aload_2         
	//   10   18:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(s);
	//   11   21:aload_2         
	//   12   22:aload_3         
	//   13   23:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
			return;
	//   14   26:return          
		}
	}

	public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(!jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifne            13
			writeTypeSuffixForArray(obj, jsongenerator);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #64  <Method void writeTypeSuffixForArray(Object, JsonGenerator)>
	//    7   13:return          
	}

	public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(!jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifne            13
			writeTypeSuffixForObject(obj, jsongenerator);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #68  <Method void writeTypeSuffixForObject(Object, JsonGenerator)>
	//    7   13:return          
	}

	public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(!jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifne            13
			writeTypeSuffixForScalar(obj, jsongenerator);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #72  <Method void writeTypeSuffixForScalar(Object, JsonGenerator)>
	//    7   13:return          
	}

	public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		obj = ((Object) (idFromValue(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method String idFromValue(Object)>
	//    3    5:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   6   10:ifeq            27
		{
			if(obj != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
				jsongenerator.writeTypeId(obj);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
		} else
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
	//*  14   26:return          
		{
			jsongenerator.writeStartArray();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(((String) (obj)));
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
		}
		jsongenerator.writeStartArray();
	//*  20   36:goto            22
	}

	public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		obj = ((Object) (idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #82  <Method String idFromValueAndType(Object, Class)>
	//    4    6:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   7   11:ifeq            28
		{
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				jsongenerator.writeTypeId(obj);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
		} else
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
	//*  15   27:return          
		{
			jsongenerator.writeStartArray();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(((String) (obj)));
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
		}
		jsongenerator.writeStartArray();
	//*  21   37:goto            23
	}

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		obj = ((Object) (idFromValue(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method String idFromValue(Object)>
	//    3    5:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   6   10:ifeq            27
		{
			if(obj != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
				jsongenerator.writeTypeId(obj);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
		} else
	//*  12   22:aload_2         
	//*  13   23:invokevirtual   #58  <Method void JsonGenerator.writeStartObject()>
	//*  14   26:return          
		{
			jsongenerator.writeStartArray();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(((String) (obj)));
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
		}
		jsongenerator.writeStartObject();
	//*  20   36:goto            22
	}

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		obj = ((Object) (idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #82  <Method String idFromValueAndType(Object, Class)>
	//    4    6:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   7   11:ifeq            28
		{
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				jsongenerator.writeTypeId(obj);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
		} else
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #58  <Method void JsonGenerator.writeStartObject()>
	//*  15   27:return          
		{
			jsongenerator.writeStartArray();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(((String) (obj)));
	//   18   32:aload_2         
	//   19   33:aload_1         
	//   20   34:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
		}
		jsongenerator.writeStartObject();
	//*  21   37:goto            23
	}

	public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		obj = ((Object) (idFromValue(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method String idFromValue(Object)>
	//    3    5:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   6   10:ifeq            23
		{
			if(obj != null)
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
				jsongenerator.writeTypeId(obj);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
			return;
	//   12   22:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   13   23:aload_2         
	//   14   24:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(((String) (obj)));
	//   15   27:aload_2         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
			return;
	//   18   32:return          
		}
	}

	public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		obj = ((Object) (idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #82  <Method String idFromValueAndType(Object, Class)>
	//    4    6:astore_1        
		if(jsongenerator.canWriteTypeId())
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   7   11:ifeq            24
		{
			if(obj != null)
	//*   8   14:aload_1         
	//*   9   15:ifnull          23
				jsongenerator.writeTypeId(obj);
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #45  <Method void JsonGenerator.writeTypeId(Object)>
			return;
	//   13   23:return          
		} else
		{
			jsongenerator.writeStartArray();
	//   14   24:aload_2         
	//   15   25:invokevirtual   #49  <Method void JsonGenerator.writeStartArray()>
			jsongenerator.writeString(((String) (obj)));
	//   16   28:aload_2         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #53  <Method void JsonGenerator.writeString(String)>
			return;
	//   19   33:return          
		}
	}

	public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeEndArray();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #89  <Method void JsonGenerator.writeEndArray()>
		if(!jsongenerator.canWriteTypeId())
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   4    8:ifne            15
			jsongenerator.writeEndArray();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #89  <Method void JsonGenerator.writeEndArray()>
	//    7   15:return          
	}

	public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeEndObject();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #92  <Method void JsonGenerator.writeEndObject()>
		if(!jsongenerator.canWriteTypeId())
	//*   2    4:aload_2         
	//*   3    5:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   4    8:ifne            15
			jsongenerator.writeEndArray();
	//    5   11:aload_2         
	//    6   12:invokevirtual   #89  <Method void JsonGenerator.writeEndArray()>
	//    7   15:return          
	}

	public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		if(!jsongenerator.canWriteTypeId())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #41  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   2    4:ifne            11
			jsongenerator.writeEndArray();
	//    3    7:aload_2         
	//    4    8:invokevirtual   #89  <Method void JsonGenerator.writeEndArray()>
	//    5   11:return          
	}
}
