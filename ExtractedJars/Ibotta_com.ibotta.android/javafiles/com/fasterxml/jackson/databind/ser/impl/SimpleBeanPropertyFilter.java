// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.*;

public class SimpleBeanPropertyFilter
	implements BeanPropertyFilter, PropertyFilter
{

	public static PropertyFilter from(BeanPropertyFilter beanpropertyfilter)
	{
		return new PropertyFilter(beanpropertyfilter) {

			public void depositSchemaProperty(PropertyWriter propertywriter, JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
				throws JsonMappingException
			{
				src.depositSchemaProperty((BeanPropertyWriter)propertywriter, jsonobjectformatvisitor, serializerprovider);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BeanPropertyFilter val$src>
			//    2    4:aload_1         
			//    3    5:checkcast       #27  <Class BeanPropertyWriter>
			//    4    8:aload_2         
			//    5    9:aload_3         
			//    6   10:invokeinterface #32  <Method void BeanPropertyFilter.depositSchemaProperty(BeanPropertyWriter, JsonObjectFormatVisitor, SerializerProvider)>
			//    7   15:return          
			}

			public void depositSchemaProperty(PropertyWriter propertywriter, ObjectNode objectnode, SerializerProvider serializerprovider)
				throws JsonMappingException
			{
				src.depositSchemaProperty((BeanPropertyWriter)propertywriter, objectnode, serializerprovider);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BeanPropertyFilter val$src>
			//    2    4:aload_1         
			//    3    5:checkcast       #27  <Class BeanPropertyWriter>
			//    4    8:aload_2         
			//    5    9:aload_3         
			//    6   10:invokeinterface #37  <Method void BeanPropertyFilter.depositSchemaProperty(BeanPropertyWriter, ObjectNode, SerializerProvider)>
			//    7   15:return          
			}

			public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyWriter propertywriter)
				throws Exception
			{
				throw new UnsupportedOperationException();
			//    0    0:new             #43  <Class UnsupportedOperationException>
			//    1    3:dup             
			//    2    4:invokespecial   #44  <Method void UnsupportedOperationException()>
			//    3    7:athrow          
			}

			public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyWriter propertywriter)
				throws Exception
			{
				src.serializeAsField(obj, jsongenerator, serializerprovider, (BeanPropertyWriter)propertywriter);
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field BeanPropertyFilter val$src>
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:aload_3         
			//    5    7:aload           4
			//    6    9:checkcast       #27  <Class BeanPropertyWriter>
			//    7   12:invokeinterface #48  <Method void BeanPropertyFilter.serializeAsField(Object, JsonGenerator, SerializerProvider, BeanPropertyWriter)>
			//    8   17:return          
			}

			final BeanPropertyFilter val$src;

			
			{
				src = beanpropertyfilter;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BeanPropertyFilter val$src>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #10  <Class SimpleBeanPropertyFilter$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #16  <Method void SimpleBeanPropertyFilter$1(BeanPropertyFilter)>
	//    4    8:areturn         
	}

	public void depositSchemaProperty(BeanPropertyWriter beanpropertywriter, JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(include(beanpropertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #26  <Method boolean include(BeanPropertyWriter)>
	//*   3    5:ifeq            14
			beanpropertywriter.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #31  <Method void BeanPropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
	//    8   14:return          
	}

	public void depositSchemaProperty(BeanPropertyWriter beanpropertywriter, ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(include(beanpropertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #26  <Method boolean include(BeanPropertyWriter)>
	//*   3    5:ifeq            14
			beanpropertywriter.depositSchemaProperty(objectnode, serializerprovider);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #37  <Method void BeanPropertyWriter.depositSchemaProperty(ObjectNode, SerializerProvider)>
	//    8   14:return          
	}

	public void depositSchemaProperty(PropertyWriter propertywriter, JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(include(propertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #41  <Method boolean include(PropertyWriter)>
	//*   3    5:ifeq            14
			propertywriter.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #44  <Method void PropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
	//    8   14:return          
	}

	public void depositSchemaProperty(PropertyWriter propertywriter, ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(include(propertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #41  <Method boolean include(PropertyWriter)>
	//*   3    5:ifeq            14
			propertywriter.depositSchemaProperty(objectnode, serializerprovider);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #46  <Method void PropertyWriter.depositSchemaProperty(ObjectNode, SerializerProvider)>
	//    8   14:return          
	}

	protected boolean include(BeanPropertyWriter beanpropertywriter)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected boolean include(PropertyWriter propertywriter)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected boolean includeElement(Object obj)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyWriter propertywriter)
		throws Exception
	{
		if(includeElement(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #54  <Method boolean includeElement(Object)>
	//*   3    5:ifeq            16
			propertywriter.serializeAsElement(obj, jsongenerator, serializerprovider);
	//    4    8:aload           4
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokevirtual   #57  <Method void PropertyWriter.serializeAsElement(Object, JsonGenerator, SerializerProvider)>
	//    9   16:return          
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
		throws Exception
	{
		if(include(beanpropertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload           4
	//*   2    3:invokevirtual   #26  <Method boolean include(BeanPropertyWriter)>
	//*   3    6:ifeq            18
		{
			beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #61  <Method void BeanPropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
			return;
	//    9   17:return          
		}
		if(!jsongenerator.canOmitFields())
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #67  <Method boolean JsonGenerator.canOmitFields()>
	//*  12   22:ifne            33
			beanpropertywriter.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
	//   13   25:aload           4
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #70  <Method void BeanPropertyWriter.serializeAsOmittedField(Object, JsonGenerator, SerializerProvider)>
	//   18   33:return          
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyWriter propertywriter)
		throws Exception
	{
		if(include(propertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload           4
	//*   2    3:invokevirtual   #41  <Method boolean include(PropertyWriter)>
	//*   3    6:ifeq            18
		{
			propertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #71  <Method void PropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
			return;
	//    9   17:return          
		}
		if(!jsongenerator.canOmitFields())
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #67  <Method boolean JsonGenerator.canOmitFields()>
	//*  12   22:ifne            33
			propertywriter.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
	//   13   25:aload           4
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #72  <Method void PropertyWriter.serializeAsOmittedField(Object, JsonGenerator, SerializerProvider)>
	//   18   33:return          
	}
}
