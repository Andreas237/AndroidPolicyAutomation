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
import java.io.Serializable;
import java.util.*;

public class SimpleBeanPropertyFilter
	implements BeanPropertyFilter, PropertyFilter
{
	public static class FilterExceptFilter extends SimpleBeanPropertyFilter
		implements Serializable
	{

		protected boolean include(BeanPropertyWriter beanpropertywriter)
		{
			return _propertiesToInclude.contains(((Object) (beanpropertywriter.getName())));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Set _propertiesToInclude>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #32  <Method String BeanPropertyWriter.getName()>
		//    4    8:invokeinterface #38  <Method boolean Set.contains(Object)>
		//    5   13:ireturn         
		}

		protected boolean include(PropertyWriter propertywriter)
		{
			return _propertiesToInclude.contains(((Object) (propertywriter.getName())));
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field Set _propertiesToInclude>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #42  <Method String PropertyWriter.getName()>
		//    4    8:invokeinterface #38  <Method boolean Set.contains(Object)>
		//    5   13:ireturn         
		}

		private static final long serialVersionUID = 1L;
		protected final Set _propertiesToInclude;

		public FilterExceptFilter(Set set)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void SimpleBeanPropertyFilter()>
			_propertiesToInclude = set;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #21  <Field Set _propertiesToInclude>
		//    5    9:return          
		}
	}

	public static class SerializeExceptFilter extends SimpleBeanPropertyFilter
		implements Serializable
	{

		protected boolean include(BeanPropertyWriter beanpropertywriter)
		{
			return !_propertiesToExclude.contains(((Object) (beanpropertywriter.getName())));
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Set _propertiesToExclude>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #44  <Method String BeanPropertyWriter.getName()>
		//    4    8:invokeinterface #50  <Method boolean Set.contains(Object)>
		//    5   13:ifne            18
		//    6   16:iconst_1        
		//    7   17:ireturn         
		//    8   18:iconst_0        
		//    9   19:ireturn         
		}

		protected boolean include(PropertyWriter propertywriter)
		{
			return !_propertiesToExclude.contains(((Object) (propertywriter.getName())));
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field Set _propertiesToExclude>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #54  <Method String PropertyWriter.getName()>
		//    4    8:invokeinterface #50  <Method boolean Set.contains(Object)>
		//    5   13:ifne            18
		//    6   16:iconst_1        
		//    7   17:ireturn         
		//    8   18:iconst_0        
		//    9   19:ireturn         
		}

		static final SerializeExceptFilter INCLUDE_ALL = new SerializeExceptFilter();
		private static final long serialVersionUID = 1L;
		protected final Set _propertiesToExclude;

		static 
		{
		//    0    0:new             #2   <Class SimpleBeanPropertyFilter$SerializeExceptFilter>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void SimpleBeanPropertyFilter$SerializeExceptFilter()>
		//    3    7:putstatic       #23  <Field SimpleBeanPropertyFilter$SerializeExceptFilter INCLUDE_ALL>
		//*   4   10:return          
		}

		SerializeExceptFilter()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void SimpleBeanPropertyFilter()>
			_propertiesToExclude = Collections.emptySet();
		//    2    4:aload_0         
		//    3    5:invokestatic    #31  <Method Set Collections.emptySet()>
		//    4    8:putfield        #33  <Field Set _propertiesToExclude>
		//    5   11:return          
		}

		public SerializeExceptFilter(Set set)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void SimpleBeanPropertyFilter()>
			_propertiesToExclude = set;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #33  <Field Set _propertiesToExclude>
		//    5    9:return          
		}
	}


	protected SimpleBeanPropertyFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static SimpleBeanPropertyFilter filterOutAllExcept(Set set)
	{
		return ((SimpleBeanPropertyFilter) (new FilterExceptFilter(set)));
	//    0    0:new             #12  <Class SimpleBeanPropertyFilter$FilterExceptFilter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #26  <Method void SimpleBeanPropertyFilter$FilterExceptFilter(Set)>
	//    4    8:areturn         
	}

	public static transient SimpleBeanPropertyFilter filterOutAllExcept(String as[])
	{
		HashSet hashset = new HashSet(as.length);
	//    0    0:new             #31  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:invokespecial   #34  <Method void HashSet(int)>
	//    5    9:astore_1        
		Collections.addAll(((java.util.Collection) (hashset)), ((Object []) (as)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokestatic    #40  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//    9   15:pop             
		return ((SimpleBeanPropertyFilter) (new FilterExceptFilter(((Set) (hashset)))));
	//   10   16:new             #12  <Class SimpleBeanPropertyFilter$FilterExceptFilter>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:invokespecial   #26  <Method void SimpleBeanPropertyFilter$FilterExceptFilter(Set)>
	//   14   24:areturn         
	}

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
	//    3    5:invokespecial   #45  <Method void SimpleBeanPropertyFilter$1(BeanPropertyFilter)>
	//    4    8:areturn         
	}

	public static SimpleBeanPropertyFilter serializeAll()
	{
		return ((SimpleBeanPropertyFilter) (SerializeExceptFilter.INCLUDE_ALL));
	//    0    0:getstatic       #51  <Field SimpleBeanPropertyFilter$SerializeExceptFilter SimpleBeanPropertyFilter$SerializeExceptFilter.INCLUDE_ALL>
	//    1    3:areturn         
	}

	public static SimpleBeanPropertyFilter serializeAll(Set set)
	{
		return ((SimpleBeanPropertyFilter) (new FilterExceptFilter(set)));
	//    0    0:new             #12  <Class SimpleBeanPropertyFilter$FilterExceptFilter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #26  <Method void SimpleBeanPropertyFilter$FilterExceptFilter(Set)>
	//    4    8:areturn         
	}

	public static SimpleBeanPropertyFilter serializeAllExcept(Set set)
	{
		return ((SimpleBeanPropertyFilter) (new SerializeExceptFilter(set)));
	//    0    0:new             #15  <Class SimpleBeanPropertyFilter$SerializeExceptFilter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #55  <Method void SimpleBeanPropertyFilter$SerializeExceptFilter(Set)>
	//    4    8:areturn         
	}

	public static transient SimpleBeanPropertyFilter serializeAllExcept(String as[])
	{
		HashSet hashset = new HashSet(as.length);
	//    0    0:new             #31  <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:arraylength     
	//    4    6:invokespecial   #34  <Method void HashSet(int)>
	//    5    9:astore_1        
		Collections.addAll(((java.util.Collection) (hashset)), ((Object []) (as)));
	//    6   10:aload_1         
	//    7   11:aload_0         
	//    8   12:invokestatic    #40  <Method boolean Collections.addAll(java.util.Collection, Object[])>
	//    9   15:pop             
		return ((SimpleBeanPropertyFilter) (new SerializeExceptFilter(((Set) (hashset)))));
	//   10   16:new             #15  <Class SimpleBeanPropertyFilter$SerializeExceptFilter>
	//   11   19:dup             
	//   12   20:aload_1         
	//   13   21:invokespecial   #55  <Method void SimpleBeanPropertyFilter$SerializeExceptFilter(Set)>
	//   14   24:areturn         
	}

	public void depositSchemaProperty(BeanPropertyWriter beanpropertywriter, JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(include(beanpropertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #63  <Method boolean include(BeanPropertyWriter)>
	//*   3    5:ifeq            14
			beanpropertywriter.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #68  <Method void BeanPropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
	//    8   14:return          
	}

	public void depositSchemaProperty(BeanPropertyWriter beanpropertywriter, ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(include(beanpropertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #63  <Method boolean include(BeanPropertyWriter)>
	//*   3    5:ifeq            14
			beanpropertywriter.depositSchemaProperty(objectnode, serializerprovider);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #73  <Method void BeanPropertyWriter.depositSchemaProperty(ObjectNode, SerializerProvider)>
	//    8   14:return          
	}

	public void depositSchemaProperty(PropertyWriter propertywriter, JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(include(propertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #77  <Method boolean include(PropertyWriter)>
	//*   3    5:ifeq            14
			propertywriter.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #80  <Method void PropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
	//    8   14:return          
	}

	public void depositSchemaProperty(PropertyWriter propertywriter, ObjectNode objectnode, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		if(include(propertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #77  <Method boolean include(PropertyWriter)>
	//*   3    5:ifeq            14
			propertywriter.depositSchemaProperty(objectnode, serializerprovider);
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #82  <Method void PropertyWriter.depositSchemaProperty(ObjectNode, SerializerProvider)>
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
	//*   2    2:invokevirtual   #90  <Method boolean includeElement(Object)>
	//*   3    5:ifeq            16
			propertywriter.serializeAsElement(obj, jsongenerator, serializerprovider);
	//    4    8:aload           4
	//    5   10:aload_1         
	//    6   11:aload_2         
	//    7   12:aload_3         
	//    8   13:invokevirtual   #93  <Method void PropertyWriter.serializeAsElement(Object, JsonGenerator, SerializerProvider)>
	//    9   16:return          
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
		throws Exception
	{
		if(include(beanpropertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload           4
	//*   2    3:invokevirtual   #63  <Method boolean include(BeanPropertyWriter)>
	//*   3    6:ifeq            18
			beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #97  <Method void BeanPropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
		else
	//*   9   17:return          
		if(!jsongenerator.canOmitFields())
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #103 <Method boolean JsonGenerator.canOmitFields()>
	//*  12   22:ifne            17
		{
			beanpropertywriter.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
	//   13   25:aload           4
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #106 <Method void BeanPropertyWriter.serializeAsOmittedField(Object, JsonGenerator, SerializerProvider)>
			return;
	//   18   33:return          
		}
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyWriter propertywriter)
		throws Exception
	{
		if(include(propertywriter))
	//*   0    0:aload_0         
	//*   1    1:aload           4
	//*   2    3:invokevirtual   #77  <Method boolean include(PropertyWriter)>
	//*   3    6:ifeq            18
			propertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
	//    4    9:aload           4
	//    5   11:aload_1         
	//    6   12:aload_2         
	//    7   13:aload_3         
	//    8   14:invokevirtual   #107 <Method void PropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
		else
	//*   9   17:return          
		if(!jsongenerator.canOmitFields())
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #103 <Method boolean JsonGenerator.canOmitFields()>
	//*  12   22:ifne            17
		{
			propertywriter.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
	//   13   25:aload           4
	//   14   27:aload_1         
	//   15   28:aload_2         
	//   16   29:aload_3         
	//   17   30:invokevirtual   #108 <Method void PropertyWriter.serializeAsOmittedField(Object, JsonGenerator, SerializerProvider)>
			return;
	//   18   33:return          
		}
	}
}
