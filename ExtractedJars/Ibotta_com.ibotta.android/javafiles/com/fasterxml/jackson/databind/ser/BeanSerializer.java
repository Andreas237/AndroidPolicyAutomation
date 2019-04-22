// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BeanSerializerBuilder, BeanPropertyWriter

public class BeanSerializer extends BeanSerializerBase
{

	public BeanSerializer(JavaType javatype, BeanSerializerBuilder beanserializerbuilder, BeanPropertyWriter abeanpropertywriter[], BeanPropertyWriter abeanpropertywriter1[])
	{
		super(javatype, beanserializerbuilder, abeanpropertywriter, abeanpropertywriter1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #12  <Method void BeanSerializerBase(JavaType, BeanSerializerBuilder, BeanPropertyWriter[], BeanPropertyWriter[])>
	//    6    9:return          
	}

	protected BeanSerializer(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter, Object obj)
	{
		super(beanserializerbase, objectidwriter, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #16  <Method void BeanSerializerBase(BeanSerializerBase, ObjectIdWriter, Object)>
	//    5    7:return          
	}

	protected BeanSerializer(BeanSerializerBase beanserializerbase, Set set)
	{
		super(beanserializerbase, set);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void BeanSerializerBase(BeanSerializerBase, Set)>
	//    4    6:return          
	}

	public static BeanSerializer createDummy(JavaType javatype)
	{
		return new BeanSerializer(javatype, ((BeanSerializerBuilder) (null)), NO_PROPS, ((BeanPropertyWriter []) (null)));
	//    0    0:new             #2   <Class BeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:getstatic       #27  <Field BeanPropertyWriter[] NO_PROPS>
	//    5    9:aconst_null     
	//    6   10:invokespecial   #28  <Method void BeanSerializer(JavaType, BeanSerializerBuilder, BeanPropertyWriter[], BeanPropertyWriter[])>
	//    7   13:areturn         
	}

	protected BeanSerializerBase asArraySerializer()
	{
		if(_objectIdWriter == null && _anyGetterWriter == null && _propertyFilterId == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field ObjectIdWriter _objectIdWriter>
	//*   2    4:ifnonnull       30
	//*   3    7:aload_0         
	//*   4    8:getfield        #38  <Field AnyGetterWriter _anyGetterWriter>
	//*   5   11:ifnonnull       30
	//*   6   14:aload_0         
	//*   7   15:getfield        #42  <Field Object _propertyFilterId>
	//*   8   18:ifnonnull       30
			return ((BeanSerializerBase) (new BeanAsArraySerializer(((BeanSerializerBase) (this)))));
	//    9   21:new             #44  <Class BeanAsArraySerializer>
	//   10   24:dup             
	//   11   25:aload_0         
	//   12   26:invokespecial   #47  <Method void BeanAsArraySerializer(BeanSerializerBase)>
	//   13   29:areturn         
		else
			return ((BeanSerializerBase) (this));
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_objectIdWriter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field ObjectIdWriter _objectIdWriter>
	//*   2    4:ifnull          21
		{
			jsongenerator.setCurrentValue(obj);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #57  <Method void JsonGenerator.setCurrentValue(Object)>
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, true);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_1        
	//   11   17:invokevirtual   #61  <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, boolean)>
			return;
	//   12   20:return          
		}
		jsongenerator.writeStartObject(obj);
	//   13   21:aload_2         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #64  <Method void JsonGenerator.writeStartObject(Object)>
		if(_propertyFilterId != null)
	//*  16   26:aload_0         
	//*  17   27:getfield        #42  <Field Object _propertyFilterId>
	//*  18   30:ifnull          43
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:aload_2         
	//   22   36:aload_3         
	//   23   37:invokevirtual   #67  <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
		else
	//*  24   40:goto            50
			serializeFields(obj, jsongenerator, serializerprovider);
	//   25   43:aload_0         
	//   26   44:aload_1         
	//   27   45:aload_2         
	//   28   46:aload_3         
	//   29   47:invokevirtual   #70  <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
		jsongenerator.writeEndObject();
	//   30   50:aload_2         
	//   31   51:invokevirtual   #74  <Method void JsonGenerator.writeEndObject()>
	//   32   54:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #79  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #81  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("BeanSerializer for ");
	//    4    8:aload_1         
	//    5    9:ldc1            #83  <String "BeanSerializer for ">
	//    6   11:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(handledType().getName());
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #91  <Method Class handledType()>
	//   11   20:invokevirtual   #96  <Method String Class.getName()>
	//   12   23:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
		return stringbuilder.toString();
	//   14   27:aload_1         
	//   15   28:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   16   31:areturn         
	}

	public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
	{
		return ((JsonSerializer) (new UnwrappingBeanSerializer(((BeanSerializerBase) (this)), nametransformer)));
	//    0    0:new             #102 <Class UnwrappingBeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #105 <Method void UnwrappingBeanSerializer(BeanSerializerBase, NameTransformer)>
	//    5    9:areturn         
	}

	public volatile JsonSerializer withFilterId(Object obj)
	{
		return ((JsonSerializer) (withFilterId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #111 <Method BeanSerializerBase withFilterId(Object)>
	//    3    5:areturn         
	}

	public BeanSerializerBase withFilterId(Object obj)
	{
		return ((BeanSerializerBase) (new BeanSerializer(((BeanSerializerBase) (this)), _objectIdWriter, obj)));
	//    0    0:new             #2   <Class BeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field ObjectIdWriter _objectIdWriter>
	//    5    9:aload_1         
	//    6   10:invokespecial   #112 <Method void BeanSerializer(BeanSerializerBase, ObjectIdWriter, Object)>
	//    7   13:areturn         
	}

	protected BeanSerializerBase withIgnorals(Set set)
	{
		return ((BeanSerializerBase) (new BeanSerializer(((BeanSerializerBase) (this)), set)));
	//    0    0:new             #2   <Class BeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #115 <Method void BeanSerializer(BeanSerializerBase, Set)>
	//    5    9:areturn         
	}

	public BeanSerializerBase withObjectIdWriter(ObjectIdWriter objectidwriter)
	{
		return ((BeanSerializerBase) (new BeanSerializer(((BeanSerializerBase) (this)), objectidwriter, _propertyFilterId)));
	//    0    0:new             #2   <Class BeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #42  <Field Object _propertyFilterId>
	//    6   10:invokespecial   #112 <Method void BeanSerializer(BeanSerializerBase, ObjectIdWriter, Object)>
	//    7   13:areturn         
	}

	private static final long serialVersionUID = 29L;
}
