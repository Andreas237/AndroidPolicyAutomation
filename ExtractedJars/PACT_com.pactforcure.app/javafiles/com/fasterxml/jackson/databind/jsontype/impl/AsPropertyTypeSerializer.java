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
//			AsArrayTypeSerializer

public class AsPropertyTypeSerializer extends AsArrayTypeSerializer
{

	public AsPropertyTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty, String s)
	{
		super(typeidresolver, beanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #11  <Method void AsArrayTypeSerializer(TypeIdResolver, BeanProperty)>
		_typePropertyName = s;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #13  <Field String _typePropertyName>
	//    7   11:return          
	}

	public volatile TypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((TypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method AsPropertyTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public volatile AsArrayTypeSerializer forProperty(BeanProperty beanproperty)
	{
		return ((AsArrayTypeSerializer) (forProperty(beanproperty)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #19  <Method AsPropertyTypeSerializer forProperty(BeanProperty)>
	//    3    5:areturn         
	}

	public AsPropertyTypeSerializer forProperty(BeanProperty beanproperty)
	{
		if(_property == beanproperty)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new AsPropertyTypeSerializer(_idResolver, beanproperty, _typePropertyName);
	//    6   10:new             #2   <Class AsPropertyTypeSerializer>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #28  <Field TypeIdResolver _idResolver>
	//   10   18:aload_1         
	//   11   19:aload_0         
	//   12   20:getfield        #13  <Field String _typePropertyName>
	//   13   23:invokespecial   #30  <Method void AsPropertyTypeSerializer(TypeIdResolver, BeanProperty, String)>
	//   14   26:areturn         
	}

	public String getPropertyName()
	{
		return _typePropertyName;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field String _typePropertyName>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
	{
		return com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;
	//    0    0:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
	//    1    3:areturn         
	}

	public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_3         
	//*   1    1:ifnonnull       9
		{
			jsongenerator.writeStartObject();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			return;
	//    4    8:return          
		}
		if(jsongenerator.canWriteTypeId())
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #54  <Method boolean JsonGenerator.canWriteTypeId()>
	//*   7   13:ifeq            26
		{
			jsongenerator.writeTypeId(((Object) (s)));
	//    8   16:aload_2         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #58  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartObject();
	//   11   21:aload_2         
	//   12   22:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			return;
	//   13   25:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   14   26:aload_2         
	//   15   27:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeStringField(_typePropertyName, s);
	//   16   30:aload_2         
	//   17   31:aload_0         
	//   18   32:getfield        #13  <Field String _typePropertyName>
	//   19   35:aload_3         
	//   20   36:invokevirtual   #62  <Method void JsonGenerator.writeStringField(String, String)>
			return;
	//   21   39:return          
		}
	}

	public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
		throws IOException
	{
		jsongenerator.writeEndObject();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #67  <Method void JsonGenerator.writeEndObject()>
	//    2    4:return          
	}

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		obj = ((Object) (idFromValue(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #73  <Method String idFromValue(Object)>
	//    3    5:astore_1        
		if(obj == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       15
		{
			jsongenerator.writeStartObject();
	//    6   10:aload_2         
	//    7   11:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			return;
	//    8   14:return          
		}
		if(jsongenerator.canWriteTypeId())
	//*   9   15:aload_2         
	//*  10   16:invokevirtual   #54  <Method boolean JsonGenerator.canWriteTypeId()>
	//*  11   19:ifeq            32
		{
			jsongenerator.writeTypeId(obj);
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #58  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartObject();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			return;
	//   17   31:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   18   32:aload_2         
	//   19   33:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeStringField(_typePropertyName, ((String) (obj)));
	//   20   36:aload_2         
	//   21   37:aload_0         
	//   22   38:getfield        #13  <Field String _typePropertyName>
	//   23   41:aload_1         
	//   24   42:invokevirtual   #62  <Method void JsonGenerator.writeStringField(String, String)>
			return;
	//   25   45:return          
		}
	}

	public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
		throws IOException
	{
		obj = ((Object) (idFromValueAndType(obj, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #78  <Method String idFromValueAndType(Object, Class)>
	//    4    6:astore_1        
		if(obj == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       16
		{
			jsongenerator.writeStartObject();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			return;
	//    9   15:return          
		}
		if(jsongenerator.canWriteTypeId())
	//*  10   16:aload_2         
	//*  11   17:invokevirtual   #54  <Method boolean JsonGenerator.canWriteTypeId()>
	//*  12   20:ifeq            33
		{
			jsongenerator.writeTypeId(obj);
	//   13   23:aload_2         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #58  <Method void JsonGenerator.writeTypeId(Object)>
			jsongenerator.writeStartObject();
	//   16   28:aload_2         
	//   17   29:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			return;
	//   18   32:return          
		} else
		{
			jsongenerator.writeStartObject();
	//   19   33:aload_2         
	//   20   34:invokevirtual   #50  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeStringField(_typePropertyName, ((String) (obj)));
	//   21   37:aload_2         
	//   22   38:aload_0         
	//   23   39:getfield        #13  <Field String _typePropertyName>
	//   24   42:aload_1         
	//   25   43:invokevirtual   #62  <Method void JsonGenerator.writeStringField(String, String)>
			return;
	//   26   46:return          
		}
	}

	public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
		throws IOException
	{
		jsongenerator.writeEndObject();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #67  <Method void JsonGenerator.writeEndObject()>
	//    2    4:return          
	}

	protected final String _typePropertyName;
}
