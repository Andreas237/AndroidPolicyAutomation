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
import java.util.Set;

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

	protected UnwrappingBeanSerializer(UnwrappingBeanSerializer unwrappingbeanserializer, Set set)
	{
		super(((BeanSerializerBase) (unwrappingbeanserializer)), set);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #28  <Method void BeanSerializerBase(BeanSerializerBase, Set)>
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
	//    3    3:invokespecial   #33  <Method void BeanSerializerBase(BeanSerializerBase, NameTransformer)>
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
	//    2    2:invokevirtual   #47  <Method void JsonGenerator.setCurrentValue(Object)>
		if(_objectIdWriter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #51  <Field ObjectIdWriter _objectIdWriter>
	//*   5    9:ifnull          21
		{
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, false);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #55  <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, boolean)>
			return;
	//   12   20:return          
		}
		if(_propertyFilterId != null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #59  <Field Object _propertyFilterId>
	//*  15   25:ifnull          36
		{
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload_2         
	//   19   31:aload_3         
	//   20   32:invokevirtual   #62  <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
			return;
	//   21   35:return          
		} else
		{
			serializeFields(obj, jsongenerator, serializerprovider);
	//   22   36:aload_0         
	//   23   37:aload_1         
	//   24   38:aload_2         
	//   25   39:aload_3         
	//   26   40:invokevirtual   #65  <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
			return;
	//   27   43:return          
		}
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(serializerprovider.isEnabled(SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS))
	//*   0    0:aload_3         
	//*   1    1:getstatic       #74  <Field SerializationFeature SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS>
	//*   2    4:invokevirtual   #80  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*   3    7:ifeq            21
			serializerprovider.reportBadDefinition(handledType(), "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`");
	//    4   10:aload_3         
	//    5   11:aload_0         
	//    6   12:invokevirtual   #84  <Method Class handledType()>
	//    7   15:ldc1            #86  <String "Unwrapped property requires use of type information: cannot serialize without disabling `SerializationFeature.FAIL_ON_UNWRAPPED_TYPE_IDENTIFIERS`">
	//    8   17:invokevirtual   #90  <Method Object SerializerProvider.reportBadDefinition(Class, String)>
	//    9   20:pop             
		jsongenerator.setCurrentValue(obj);
	//   10   21:aload_2         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #47  <Method void JsonGenerator.setCurrentValue(Object)>
		if(_objectIdWriter != null)
	//*  13   26:aload_0         
	//*  14   27:getfield        #51  <Field ObjectIdWriter _objectIdWriter>
	//*  15   30:ifnull          43
		{
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, typeserializer);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:aload_2         
	//   19   36:aload_3         
	//   20   37:aload           4
	//   21   39:invokevirtual   #92  <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   22   42:return          
		}
		if(_propertyFilterId != null)
	//*  23   43:aload_0         
	//*  24   44:getfield        #59  <Field Object _propertyFilterId>
	//*  25   47:ifnull          58
		{
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:aload_2         
	//   29   53:aload_3         
	//   30   54:invokevirtual   #62  <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
			return;
	//   31   57:return          
		} else
		{
			serializeFields(obj, jsongenerator, serializerprovider);
	//   32   58:aload_0         
	//   33   59:aload_1         
	//   34   60:aload_2         
	//   35   61:aload_3         
	//   36   62:invokevirtual   #65  <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
			return;
	//   37   65:return          
		}
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #96  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #99  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("UnwrappingBeanSerializer for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #101 <String "UnwrappingBeanSerializer for ">
	//    6   11:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(handledType().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #84  <Method Class handledType()>
	//   11   20:invokevirtual   #110 <Method String Class.getName()>
	//   12   23:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		return stringbuilder.toString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #112 <Method String StringBuilder.toString()>
	//   16   31:areturn         
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
	//    2    2:invokevirtual   #121 <Method BeanSerializerBase withFilterId(Object)>
	//    3    5:areturn         
	}

	public BeanSerializerBase withFilterId(Object obj)
	{
		return ((BeanSerializerBase) (new UnwrappingBeanSerializer(this, _objectIdWriter, obj)));
	//    0    0:new             #2   <Class UnwrappingBeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #51  <Field ObjectIdWriter _objectIdWriter>
	//    5    9:aload_1         
	//    6   10:invokespecial   #123 <Method void UnwrappingBeanSerializer(UnwrappingBeanSerializer, ObjectIdWriter, Object)>
	//    7   13:areturn         
	}

	protected BeanSerializerBase withIgnorals(Set set)
	{
		return ((BeanSerializerBase) (new UnwrappingBeanSerializer(this, set)));
	//    0    0:new             #2   <Class UnwrappingBeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #127 <Method void UnwrappingBeanSerializer(UnwrappingBeanSerializer, Set)>
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
