// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			ObjectIdWriter

public class UnwrappingBeanSerializer extends BeanSerializerBase
	implements Serializable
{

	public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingbeanserializer, ObjectIdWriter objectidwriter)
	{
		super(((BeanSerializerBase) (unwrappingbeanserializer)), objectidwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void BeanSerializerBase(BeanSerializerBase, ObjectIdWriter)>
		_nameTransformer = unwrappingbeanserializer._nameTransformer;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field NameTransformer _nameTransformer>
	//    7   11:putfield        #19  <Field NameTransformer _nameTransformer>
	//    8   14:return          
	}

	public UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingbeanserializer, ObjectIdWriter objectidwriter, Object obj)
	{
		super(((BeanSerializerBase) (unwrappingbeanserializer)), objectidwriter, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #24  <Method void BeanSerializerBase(BeanSerializerBase, ObjectIdWriter, Object)>
		_nameTransformer = unwrappingbeanserializer._nameTransformer;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #19  <Field NameTransformer _nameTransformer>
	//    8   12:putfield        #19  <Field NameTransformer _nameTransformer>
	//    9   15:return          
	}

	protected UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingbeanserializer, String as[])
	{
		super(((BeanSerializerBase) (unwrappingbeanserializer)), as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void BeanSerializerBase(BeanSerializerBase, String[])>
		_nameTransformer = unwrappingbeanserializer._nameTransformer;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #19  <Field NameTransformer _nameTransformer>
	//    7   11:putfield        #19  <Field NameTransformer _nameTransformer>
	//    8   14:return          
	}

	public UnwrappingBeanSerializer(BeanSerializerBase beanserializerbase, NameTransformer nametransformer)
	{
		super(beanserializerbase, nametransformer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #31  <Method void BeanSerializerBase(BeanSerializerBase, NameTransformer)>
		_nameTransformer = nametransformer;
	//    4    6:aload_0         
	//    5    7:aload_2         
	//    6    8:putfield        #19  <Field NameTransformer _nameTransformer>
	//    7   11:return          
	}

	protected BeanSerializerBase asArraySerializer()
	{
		return ((BeanSerializerBase) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean isUnwrappingSerializer()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		jsongenerator.setCurrentValue(obj);
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #45  <Method void JsonGenerator.setCurrentValue(Object)>
		if(_objectIdWriter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #49  <Field ObjectIdWriter _objectIdWriter>
	//*   5    9:ifnull          21
		{
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, false);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #53  <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, boolean)>
			return;
	//   12   20:return          
		}
		if(_propertyFilterId != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #57  <Field Object _propertyFilterId>
	//*  15   25:ifnull          36
		{
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:aload_3         
	//   20   32:invokevirtual   #60  <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
			return;
	//   21   35:return          
		} else
		{
			serializeFields(obj, jsongenerator, serializerprovider);
	//   22   36:aload_0         
	//   23   37:aload_1         
	//   24   38:aload_2         
	//   25   39:aload_3         
	//   26   40:invokevirtual   #63  <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
			return;
	//   27   43:return          
		}
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #72  <Field SerializationFeature SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS>
	//*   2    4:invokevirtual   #78  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            17
			throw JsonMappingException.from(jsongenerator, "Unwrapped property requires use of type information: can not serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
	//    4   10:aload_2         
	//    5   11:ldc1            #80  <String "Unwrapped property requires use of type information: can not serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`">
	//    6   13:invokestatic    #86  <Method JsonMappingException JsonMappingException.from(JsonGenerator, String)>
	//    7   16:athrow          
		jsongenerator.setCurrentValue(obj);
	//    8   17:aload_2         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #45  <Method void JsonGenerator.setCurrentValue(Object)>
		if(_objectIdWriter != null)
	//*  11   22:aload_0         
	//*  12   23:getfield        #49  <Field ObjectIdWriter _objectIdWriter>
	//*  13   26:ifnull          39
		{
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, typeserializer);
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:aload_2         
	//   17   32:aload_3         
	//   18   33:aload           4
	//   19   35:invokevirtual   #88  <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   20   38:return          
		}
		if(_propertyFilterId != null)
	//*  21   39:aload_0         
	//*  22   40:getfield        #57  <Field Object _propertyFilterId>
	//*  23   43:ifnull          54
		{
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:aload_2         
	//   27   49:aload_3         
	//   28   50:invokevirtual   #60  <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
			return;
	//   29   53:return          
		} else
		{
			serializeFields(obj, jsongenerator, serializerprovider);
	//   30   54:aload_0         
	//   31   55:aload_1         
	//   32   56:aload_2         
	//   33   57:aload_3         
	//   34   58:invokevirtual   #63  <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
			return;
	//   35   61:return          
		}
	}

	public String toString()
	{
		return (new StringBuilder()).append("UnwrappingBeanSerializer for ").append(handledType().getName()).toString();
	//    0    0:new             #92  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #95  <Method void StringBuilder()>
	//    3    7:ldc1            #97  <String "UnwrappingBeanSerializer for ">
	//    4    9:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #105 <Method Class handledType()>
	//    7   16:invokevirtual   #110 <Method String Class.getName()>
	//    8   19:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   10   25:areturn         
	}

	public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
	{
		return ((JsonSerializer) (new UnwrappingBeanSerializer(((BeanSerializerBase) (this)), nametransformer)));
	//    0    0:new             #2   <Class UnwrappingBeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #115 <Method void UnwrappingBeanSerializer(BeanSerializerBase, NameTransformer)>
	//    5    9:areturn         
	}

	public volatile JsonSerializer withFilterId(Object obj)
	{
		return ((JsonSerializer) (withFilterId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #122 <Method BeanSerializerBase withFilterId(Object)>
	//    3    5:areturn         
	}

	public BeanSerializerBase withFilterId(Object obj)
	{
		return ((BeanSerializerBase) (new UnwrappingBeanSerializer(this, _objectIdWriter, obj)));
	//    0    0:new             #2   <Class UnwrappingBeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #49  <Field ObjectIdWriter _objectIdWriter>
	//    5    9:aload_1         
	//    6   10:invokespecial   #124 <Method void UnwrappingBeanSerializer(UnwrappingBeanSerializer, ObjectIdWriter, Object)>
	//    7   13:areturn         
	}

	protected BeanSerializerBase withIgnorals(String as[])
	{
		return ((BeanSerializerBase) (new UnwrappingBeanSerializer(this, as)));
	//    0    0:new             #2   <Class UnwrappingBeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #128 <Method void UnwrappingBeanSerializer(UnwrappingBeanSerializer, String[])>
	//    5    9:areturn         
	}

	public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter)
	{
		return ((BeanSerializerBase) (new UnwrappingBeanSerializer(this, objectidwriter)));
	//    0    0:new             #2   <Class UnwrappingBeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #132 <Method void UnwrappingBeanSerializer(UnwrappingBeanSerializer, ObjectIdWriter)>
	//    5    9:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final NameTransformer _nameTransformer;
}
