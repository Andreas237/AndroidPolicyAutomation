// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.lang.reflect.Type;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public abstract class StaticListSerializerBase extends StdSerializer
	implements ContextualSerializer
{

	protected StaticListSerializerBase(StaticListSerializerBase staticlistserializerbase, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((StdSerializer) (staticlistserializerbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #17  <Method void StdSerializer(StdSerializer)>
		_serializer = jsonserializer;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field JsonSerializer _serializer>
		_unwrapSingle = boolean1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #21  <Field Boolean _unwrapSingle>
	//    9   15:return          
	}

	protected StaticListSerializerBase(Class class1)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #28  <Method void StdSerializer(Class, boolean)>
		_serializer = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #19  <Field JsonSerializer _serializer>
		_unwrapSingle = null;
	//    7   11:aload_0         
	//    8   12:aconst_null     
	//    9   13:putfield        #21  <Field Boolean _unwrapSingle>
	//   10   16:return          
	}

	public abstract JsonSerializer _withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, Boolean boolean1);

	protected abstract void acceptContentVisitor(JsonArrayFormatVisitor jsonarrayformatvisitor)
		throws JsonMappingException;

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		acceptContentVisitor(jsonformatvisitorwrapper.expectArrayFormat(javatype));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #43  <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    4    8:invokevirtual   #45  <Method void acceptContentVisitor(JsonArrayFormatVisitor)>
	//    5   11:return          
	}

	protected abstract JsonNode contentSchema();

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		com.fasterxml.jackson.annotation.JsonFormat.Value value = null;
	//    2    3:aconst_null     
	//    3    4:astore          7
		Object obj3 = null;
	//    4    6:aconst_null     
	//    5    7:astore          6
		Object obj2 = ((Object) (obj3));
	//    6    9:aload           6
	//    7   11:astore          5
		if(beanproperty != null)
	//*   8   13:aload_2         
	//*   9   14:ifnull          106
		{
			obj2 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//   10   17:aload_1         
	//   11   18:invokevirtual   #56  <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//   12   21:astore          5
			obj1 = ((Object) (beanproperty.getMember()));
	//   13   23:aload_2         
	//   14   24:invokeinterface #62  <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   15   29:astore          4
			JsonSerializer jsonserializer = ((JsonSerializer) (value));
	//   16   31:aload           7
	//   17   33:astore_3        
			if(obj1 != null)
	//*  18   34:aload           4
	//*  19   36:ifnull          65
			{
				obj2 = ((AnnotationIntrospector) (obj2)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
	//   20   39:aload           5
	//   21   41:aload           4
	//   22   43:invokevirtual   #68  <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   23   46:astore          5
				jsonserializer = ((JsonSerializer) (value));
	//   24   48:aload           7
	//   25   50:astore_3        
				if(obj2 != null)
	//*  26   51:aload           5
	//*  27   53:ifnull          65
					jsonserializer = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), obj2);
	//   28   56:aload_1         
	//   29   57:aload           4
	//   30   59:aload           5
	//   31   61:invokevirtual   #72  <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   32   64:astore_3        
			}
			value = beanproperty.findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), _handledType);
	//   33   65:aload_2         
	//   34   66:aload_1         
	//   35   67:invokevirtual   #76  <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//   36   70:aload_0         
	//   37   71:getfield        #80  <Field Class _handledType>
	//   38   74:invokeinterface #84  <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanProperty.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//   39   79:astore          7
			obj1 = ((Object) (jsonserializer));
	//   40   81:aload_3         
	//   41   82:astore          4
			obj2 = ((Object) (obj3));
	//   42   84:aload           6
	//   43   86:astore          5
			if(value != null)
	//*  44   88:aload           7
	//*  45   90:ifnull          106
			{
				obj2 = ((Object) (value.getFeature(com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)));
	//   46   93:aload           7
	//   47   95:getstatic       #90  <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   48   98:invokevirtual   #96  <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   49  101:astore          5
				obj1 = ((Object) (jsonserializer));
	//   50  103:aload_3         
	//   51  104:astore          4
			}
		}
		Object obj = obj1;
	//   52  106:aload           4
	//   53  108:astore_3        
		if(obj1 == null)
	//*  54  109:aload           4
	//*  55  111:ifnonnull       119
			obj = ((Object) (_serializer));
	//   56  114:aload_0         
	//   57  115:getfield        #19  <Field JsonSerializer _serializer>
	//   58  118:astore_3        
		obj = ((Object) (findConvertingContentSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj)))));
	//   59  119:aload_0         
	//   60  120:aload_1         
	//   61  121:aload_2         
	//   62  122:aload_3         
	//   63  123:invokevirtual   #100 <Method JsonSerializer findConvertingContentSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   64  126:astore_3        
		if(obj == null)
	//*  65  127:aload_3         
	//*  66  128:ifnonnull       170
			serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(java/lang/String, beanproperty)));
	//   67  131:aload_1         
	//   68  132:ldc1            #102 <Class String>
	//   69  134:aload_2         
	//   70  135:invokevirtual   #106 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   71  138:astore_1        
		else
	//*  72  139:aload_1         
	//*  73  140:astore_3        
	//*  74  141:aload_0         
	//*  75  142:aload_1         
	//*  76  143:invokevirtual   #110 <Method boolean isDefaultSerializer(JsonSerializer)>
	//*  77  146:ifeq            151
	//*  78  149:aconst_null     
	//*  79  150:astore_3        
	//*  80  151:aload_3         
	//*  81  152:aload_0         
	//*  82  153:getfield        #19  <Field JsonSerializer _serializer>
	//*  83  156:if_acmpne       180
	//*  84  159:aload           5
	//*  85  161:aload_0         
	//*  86  162:getfield        #21  <Field Boolean _unwrapSingle>
	//*  87  165:if_acmpne       180
	//*  88  168:aload_0         
	//*  89  169:areturn         
			serializerprovider = ((SerializerProvider) (serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj)), beanproperty)));
	//   90  170:aload_1         
	//   91  171:aload_3         
	//   92  172:aload_2         
	//   93  173:invokevirtual   #114 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   94  176:astore_1        
		obj = ((Object) (serializerprovider));
		if(isDefaultSerializer(((JsonSerializer) (serializerprovider))))
			obj = null;
		if(obj == _serializer && obj2 == _unwrapSingle)
			return ((JsonSerializer) (this));
		else
	//*  95  177:goto            139
			return _withResolved(beanproperty, ((JsonSerializer) (obj)), ((Boolean) (obj2)));
	//   96  180:aload_0         
	//   97  181:aload_2         
	//   98  182:aload_3         
	//   99  183:aload           5
	//  100  185:invokevirtual   #116 <Method JsonSerializer _withResolved(BeanProperty, JsonSerializer, Boolean)>
	//  101  188:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return createSchemaNode("array", true).set("items", contentSchema());
	//    0    0:aload_0         
	//    1    1:ldc1            #121 <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #125 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #127 <String "items">
	//    5    9:aload_0         
	//    6   10:invokevirtual   #129 <Method JsonNode contentSchema()>
	//    7   13:invokevirtual   #135 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    8   16:areturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #139 <Class Collection>
	//    4    6:invokevirtual   #142 <Method boolean isEmpty(SerializerProvider, Collection)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Collection collection)
	{
		return collection == null || collection.size() == 0;
	//    0    0:aload_2         
	//    1    1:ifnull          13
	//    2    4:aload_2         
	//    3    5:invokeinterface #146 <Method int Collection.size()>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile boolean isEmpty(Object obj)
	{
		return isEmpty((Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #139 <Class Collection>
	//    3    5:invokevirtual   #151 <Method boolean isEmpty(Collection)>
	//    4    8:ireturn         
	}

	public boolean isEmpty(Collection collection)
	{
		return isEmpty(((SerializerProvider) (null)), collection);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_1         
	//    3    3:invokevirtual   #142 <Method boolean isEmpty(SerializerProvider, Collection)>
	//    4    6:ireturn         
	}

	protected final JsonSerializer _serializer;
	protected final Boolean _unwrapSingle;
}
