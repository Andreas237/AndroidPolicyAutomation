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

	protected BeanSerializer(BeanSerializerBase beanserializerbase)
	{
		super(beanserializerbase);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void BeanSerializerBase(BeanSerializerBase)>
	//    3    5:return          
	}

	protected BeanSerializer(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter)
	{
		super(beanserializerbase, objectidwriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #19  <Method void BeanSerializerBase(BeanSerializerBase, ObjectIdWriter)>
	//    4    6:return          
	}

	protected BeanSerializer(BeanSerializerBase beanserializerbase, ObjectIdWriter objectidwriter, Object obj)
	{
		super(beanserializerbase, objectidwriter, obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #22  <Method void BeanSerializerBase(BeanSerializerBase, ObjectIdWriter, Object)>
	//    5    7:return          
	}

	protected BeanSerializer(BeanSerializerBase beanserializerbase, String as[])
	{
		super(beanserializerbase, as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void BeanSerializerBase(BeanSerializerBase, String[])>
	//    4    6:return          
	}

	public static BeanSerializer createDummy(JavaType javatype)
	{
		return new BeanSerializer(javatype, ((BeanSerializerBuilder) (null)), NO_PROPS, ((BeanPropertyWriter []) (null)));
	//    0    0:new             #2   <Class BeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:getstatic       #31  <Field BeanPropertyWriter[] NO_PROPS>
	//    5    9:aconst_null     
	//    6   10:invokespecial   #32  <Method void BeanSerializer(JavaType, BeanSerializerBuilder, BeanPropertyWriter[], BeanPropertyWriter[])>
	//    7   13:areturn         
	}

	protected BeanSerializerBase asArraySerializer()
	{
		Object obj = ((Object) (this));
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(_objectIdWriter == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #38  <Field ObjectIdWriter _objectIdWriter>
	//*   4    6:ifnonnull       36
		{
			obj = ((Object) (this));
	//    5    9:aload_0         
	//    6   10:astore_1        
			if(_anyGetterWriter == null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #42  <Field AnyGetterWriter _anyGetterWriter>
	//*   9   15:ifnonnull       36
			{
				obj = ((Object) (this));
	//   10   18:aload_0         
	//   11   19:astore_1        
				if(_propertyFilterId == null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #46  <Field Object _propertyFilterId>
	//*  14   24:ifnonnull       36
					obj = ((Object) (new BeanAsArraySerializer(((BeanSerializerBase) (this)))));
	//   15   27:new             #48  <Class BeanAsArraySerializer>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokespecial   #49  <Method void BeanAsArraySerializer(BeanSerializerBase)>
	//   19   35:astore_1        
			}
		}
		return ((BeanSerializerBase) (obj));
	//   20   36:aload_1         
	//   21   37:areturn         
	}

	public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_objectIdWriter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field ObjectIdWriter _objectIdWriter>
	//*   2    4:ifnull          21
		{
			jsongenerator.setCurrentValue(obj);
	//    3    7:aload_2         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #59  <Method void JsonGenerator.setCurrentValue(Object)>
			_serializeWithObjectId(obj, jsongenerator, serializerprovider, true);
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:aload_3         
	//   10   16:iconst_1        
	//   11   17:invokevirtual   #63  <Method void _serializeWithObjectId(Object, JsonGenerator, SerializerProvider, boolean)>
			return;
	//   12   20:return          
		}
		jsongenerator.writeStartObject();
	//   13   21:aload_2         
	//   14   22:invokevirtual   #67  <Method void JsonGenerator.writeStartObject()>
		jsongenerator.setCurrentValue(obj);
	//   15   25:aload_2         
	//   16   26:aload_1         
	//   17   27:invokevirtual   #59  <Method void JsonGenerator.setCurrentValue(Object)>
		if(_propertyFilterId != null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #46  <Field Object _propertyFilterId>
	//*  20   34:ifnull          49
			serializeFieldsFiltered(obj, jsongenerator, serializerprovider);
	//   21   37:aload_0         
	//   22   38:aload_1         
	//   23   39:aload_2         
	//   24   40:aload_3         
	//   25   41:invokevirtual   #70  <Method void serializeFieldsFiltered(Object, JsonGenerator, SerializerProvider)>
		else
	//*  26   44:aload_2         
	//*  27   45:invokevirtual   #73  <Method void JsonGenerator.writeEndObject()>
	//*  28   48:return          
			serializeFields(obj, jsongenerator, serializerprovider);
	//   29   49:aload_0         
	//   30   50:aload_1         
	//   31   51:aload_2         
	//   32   52:aload_3         
	//   33   53:invokevirtual   #76  <Method void serializeFields(Object, JsonGenerator, SerializerProvider)>
		jsongenerator.writeEndObject();
	//*  34   56:goto            44
	}

	public String toString()
	{
		return (new StringBuilder()).append("BeanSerializer for ").append(handledType().getName()).toString();
	//    0    0:new             #81  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #83  <Method void StringBuilder()>
	//    3    7:ldc1            #85  <String "BeanSerializer for ">
	//    4    9:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:invokevirtual   #93  <Method Class handledType()>
	//    7   16:invokevirtual   #98  <Method String Class.getName()>
	//    8   19:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//    9   22:invokevirtual   #100 <Method String StringBuilder.toString()>
	//   10   25:areturn         
	}

	public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
	{
		return ((JsonSerializer) (new UnwrappingBeanSerializer(((BeanSerializerBase) (this)), nametransformer)));
	//    0    0:new             #104 <Class UnwrappingBeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #107 <Method void UnwrappingBeanSerializer(BeanSerializerBase, NameTransformer)>
	//    5    9:areturn         
	}

	public volatile JsonSerializer withFilterId(Object obj)
	{
		return ((JsonSerializer) (withFilterId(obj)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #114 <Method BeanSerializerBase withFilterId(Object)>
	//    3    5:areturn         
	}

	public BeanSerializerBase withFilterId(Object obj)
	{
		return ((BeanSerializerBase) (new BeanSerializer(((BeanSerializerBase) (this)), _objectIdWriter, obj)));
	//    0    0:new             #2   <Class BeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #38  <Field ObjectIdWriter _objectIdWriter>
	//    5    9:aload_1         
	//    6   10:invokespecial   #115 <Method void BeanSerializer(BeanSerializerBase, ObjectIdWriter, Object)>
	//    7   13:areturn         
	}

	protected BeanSerializerBase withIgnorals(String as[])
	{
		return ((BeanSerializerBase) (new BeanSerializer(((BeanSerializerBase) (this)), as)));
	//    0    0:new             #2   <Class BeanSerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #118 <Method void BeanSerializer(BeanSerializerBase, String[])>
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
	//    5    7:getfield        #46  <Field Object _propertyFilterId>
	//    6   10:invokespecial   #115 <Method void BeanSerializer(BeanSerializerBase, ObjectIdWriter, Object)>
	//    7   13:areturn         
	}

	private static final long serialVersionUID = 0xc402c22aL;
}
