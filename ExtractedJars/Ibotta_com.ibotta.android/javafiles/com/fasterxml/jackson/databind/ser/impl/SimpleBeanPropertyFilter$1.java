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

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			SimpleBeanPropertyFilter

static final class SimpleBeanPropertyFilter$1
	implements PropertyFilter
{

	public void depositSchemaProperty(PropertyWriter propertywriter, JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		val$src.depositSchemaProperty((BeanPropertyWriter)propertywriter, jsonobjectformatvisitor, serializerprovider);
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
		val$src.depositSchemaProperty((BeanPropertyWriter)propertywriter, objectnode, serializerprovider);
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
		val$src.serializeAsField(obj, jsongenerator, serializerprovider, (BeanPropertyWriter)propertywriter);
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

	SimpleBeanPropertyFilter$1(BeanPropertyFilter beanpropertyfilter)
	{
		val$src = beanpropertyfilter;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BeanPropertyFilter val$src>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #20  <Method void Object()>
	//    5    9:return          
	}
}
