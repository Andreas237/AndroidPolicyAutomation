// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdDelegatingSerializer

public abstract class StdSerializer extends JsonSerializer
	implements JsonFormatVisitable, SchemaAware, Serializable
{

	protected StdSerializer(JavaType javatype)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void JsonSerializer()>
		_handledType = javatype.getRawClass();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #38  <Method Class JavaType.getRawClass()>
	//    5    9:putfield        #40  <Field Class _handledType>
	//    6   12:return          
	}

	protected StdSerializer(StdSerializer stdserializer)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void JsonSerializer()>
		_handledType = stdserializer._handledType;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #40  <Field Class _handledType>
	//    5    9:putfield        #40  <Field Class _handledType>
	//    6   12:return          
	}

	protected StdSerializer(Class class1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void JsonSerializer()>
		_handledType = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Class _handledType>
	//    5    9:return          
	}

	protected StdSerializer(Class class1, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #32  <Method void JsonSerializer()>
		_handledType = class1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Class _handledType>
	//    5    9:return          
	}

	protected static final boolean _neitherNull(Object obj, Object obj1)
	{
		return obj != null && obj1 != null;
	//    0    0:aload_0         
	//    1    1:ifnull          10
	//    2    4:aload_1         
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	protected static final boolean _nonEmpty(Collection collection)
	{
		return collection != null && !collection.isEmpty();
	//    0    0:aload_0         
	//    1    1:ifnull          15
	//    2    4:aload_0         
	//    3    5:invokeinterface #57  <Method boolean Collection.isEmpty()>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #68  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	protected ObjectNode createSchemaNode(String s)
	{
		ObjectNode objectnode = JsonNodeFactory.instance.objectNode();
	//    0    0:getstatic       #77  <Field JsonNodeFactory JsonNodeFactory.instance>
	//    1    3:invokevirtual   #81  <Method ObjectNode JsonNodeFactory.objectNode()>
	//    2    6:astore_2        
		objectnode.put("type", s);
	//    3    7:aload_2         
	//    4    8:ldc1            #83  <String "type">
	//    5   10:aload_1         
	//    6   11:invokevirtual   #89  <Method ObjectNode ObjectNode.put(String, String)>
	//    7   14:pop             
		return objectnode;
	//    8   15:aload_2         
	//    9   16:areturn         
	}

	protected ObjectNode createSchemaNode(String s, boolean flag)
	{
		s = ((String) (createSchemaNode(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #92  <Method ObjectNode createSchemaNode(String)>
	//    3    5:astore_1        
		if(!flag)
	//*   4    6:iload_2         
	//*   5    7:ifne            20
			((ObjectNode) (s)).put("required", flag ^ true);
	//    6   10:aload_1         
	//    7   11:ldc1            #94  <String "required">
	//    8   13:iload_2         
	//    9   14:iconst_1        
	//   10   15:ixor            
	//   11   16:invokevirtual   #96  <Method ObjectNode ObjectNode.put(String, boolean)>
	//   12   19:pop             
		return ((ObjectNode) (s));
	//   13   20:aload_1         
	//   14   21:areturn         
	}

	protected JsonSerializer findAnnotatedContentSerializer(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		if(beanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          37
		{
			beanproperty = ((BeanProperty) (beanproperty.getMember()));
	//    2    4:aload_2         
	//    3    5:invokeinterface #104 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    4   10:astore_2        
			Object obj = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    5   11:aload_1         
	//    6   12:invokevirtual   #110 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    7   15:astore_3        
			if(beanproperty != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          37
			{
				obj = ((AnnotationIntrospector) (obj)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty)));
	//   10   20:aload_3         
	//   11   21:aload_2         
	//   12   22:invokevirtual   #116 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   13   25:astore_3        
				if(obj != null)
	//*  14   26:aload_3         
	//*  15   27:ifnull          37
					return serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty)), obj);
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:aload_3         
	//   19   33:invokevirtual   #120 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   20   36:areturn         
			}
		}
		return null;
	//   21   37:aconst_null     
	//   22   38:areturn         
	}

	protected JsonSerializer findContextualConvertingSerializer(SerializerProvider serializerprovider, BeanProperty beanproperty, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		Object obj;
		Map map = (Map)serializerprovider.getAttribute(KEY_CONTENT_CONVERTER_LOCK);
	//    0    0:aload_1         
	//    1    1:getstatic       #29  <Field Object KEY_CONTENT_CONVERTER_LOCK>
	//    2    4:invokevirtual   #127 <Method Object SerializerProvider.getAttribute(Object)>
	//    3    7:checkcast       #129 <Class Map>
	//    4   10:astore          5
		if(map != null)
	//*   5   12:aload           5
	//*   6   14:ifnull          34
		{
			obj = ((Object) (map));
	//    7   17:aload           5
	//    8   19:astore          4
			if(map.get(((Object) (beanproperty))) != null)
	//*   9   21:aload           5
	//*  10   23:aload_2         
	//*  11   24:invokeinterface #132 <Method Object Map.get(Object)>
	//*  12   29:ifnull          53
				return jsonserializer;
	//   13   32:aload_3         
	//   14   33:areturn         
		} else
		{
			obj = ((Object) (new IdentityHashMap()));
	//   15   34:new             #134 <Class IdentityHashMap>
	//   16   37:dup             
	//   17   38:invokespecial   #135 <Method void IdentityHashMap()>
	//   18   41:astore          4
			serializerprovider.setAttribute(KEY_CONTENT_CONVERTER_LOCK, obj);
	//   19   43:aload_1         
	//   20   44:getstatic       #29  <Field Object KEY_CONTENT_CONVERTER_LOCK>
	//   21   47:aload           4
	//   22   49:invokevirtual   #139 <Method SerializerProvider SerializerProvider.setAttribute(Object, Object)>
	//   23   52:pop             
		}
		((Map) (obj)).put(((Object) (beanproperty)), ((Object) (Boolean.TRUE)));
	//   24   53:aload           4
	//   25   55:aload_2         
	//   26   56:getstatic       #145 <Field Boolean Boolean.TRUE>
	//   27   59:invokeinterface #148 <Method Object Map.put(Object, Object)>
	//   28   64:pop             
		JsonSerializer jsonserializer1 = findConvertingContentSerializer(serializerprovider, beanproperty, jsonserializer);
	//   29   65:aload_0         
	//   30   66:aload_1         
	//   31   67:aload_2         
	//   32   68:aload_3         
	//   33   69:invokevirtual   #151 <Method JsonSerializer findConvertingContentSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   34   72:astore          5
		if(jsonserializer1 == null)
			break MISSING_BLOCK_LABEL_98;
	//   35   74:aload           5
	//   36   76:ifnull          98
		serializerprovider = ((SerializerProvider) (serializerprovider.handleSecondaryContextualization(jsonserializer1, beanproperty)));
	//   37   79:aload_1         
	//   38   80:aload           5
	//   39   82:aload_2         
	//   40   83:invokevirtual   #155 <Method JsonSerializer SerializerProvider.handleSecondaryContextualization(JsonSerializer, BeanProperty)>
	//   41   86:astore_1        
		((Map) (obj)).remove(((Object) (beanproperty)));
	//   42   87:aload           4
	//   43   89:aload_2         
	//   44   90:invokeinterface #158 <Method Object Map.remove(Object)>
	//   45   95:pop             
		return ((JsonSerializer) (serializerprovider));
	//   46   96:aload_1         
	//   47   97:areturn         
		((Map) (obj)).remove(((Object) (beanproperty)));
	//   48   98:aload           4
	//   49  100:aload_2         
	//   50  101:invokeinterface #158 <Method Object Map.remove(Object)>
	//   51  106:pop             
		return jsonserializer;
	//   52  107:aload_3         
	//   53  108:areturn         
		serializerprovider;
	//   54  109:astore_1        
		((Map) (obj)).remove(((Object) (beanproperty)));
	//   55  110:aload           4
	//   56  112:aload_2         
	//   57  113:invokeinterface #158 <Method Object Map.remove(Object)>
	//   58  118:pop             
		throw serializerprovider;
	//   59  119:aload_1         
	//   60  120:athrow          
	}

	protected JsonSerializer findConvertingContentSerializer(SerializerProvider serializerprovider, BeanProperty beanproperty, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		Object obj = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #110 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    2    4:astore          4
		if(_neitherNull(obj, ((Object) (beanproperty))))
	//*   3    6:aload           4
	//*   4    8:aload_2         
	//*   5    9:invokestatic    #162 <Method boolean _neitherNull(Object, Object)>
	//*   6   12:ifeq            105
		{
			com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
	//    7   15:aload_2         
	//    8   16:invokeinterface #104 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    9   21:astore          5
			if(annotatedmember != null)
	//*  10   23:aload           5
	//*  11   25:ifnull          105
			{
				obj = ((AnnotationIntrospector) (obj)).findSerializationContentConverter(annotatedmember);
	//   12   28:aload           4
	//   13   30:aload           5
	//   14   32:invokevirtual   #166 <Method Object AnnotationIntrospector.findSerializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)>
	//   15   35:astore          4
				if(obj != null)
	//*  16   37:aload           4
	//*  17   39:ifnull          105
				{
					obj = ((Object) (serializerprovider.converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty.getMember())), obj)));
	//   18   42:aload_1         
	//   19   43:aload_2         
	//   20   44:invokeinterface #104 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   21   49:aload           4
	//   22   51:invokevirtual   #170 <Method Converter SerializerProvider.converterInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   23   54:astore          4
					JavaType javatype = ((Converter) (obj)).getOutputType(serializerprovider.getTypeFactory());
	//   24   56:aload           4
	//   25   58:aload_1         
	//   26   59:invokevirtual   #174 <Method com.fasterxml.jackson.databind.type.TypeFactory SerializerProvider.getTypeFactory()>
	//   27   62:invokeinterface #180 <Method JavaType Converter.getOutputType(com.fasterxml.jackson.databind.type.TypeFactory)>
	//   28   67:astore          5
					beanproperty = ((BeanProperty) (jsonserializer));
	//   29   69:aload_3         
	//   30   70:astore_2        
					if(jsonserializer == null)
	//*  31   71:aload_3         
	//*  32   72:ifnonnull       92
					{
						beanproperty = ((BeanProperty) (jsonserializer));
	//   33   75:aload_3         
	//   34   76:astore_2        
						if(!javatype.isJavaLangObject())
	//*  35   77:aload           5
	//*  36   79:invokevirtual   #183 <Method boolean JavaType.isJavaLangObject()>
	//*  37   82:ifne            92
							beanproperty = ((BeanProperty) (serializerprovider.findValueSerializer(javatype)));
	//   38   85:aload_1         
	//   39   86:aload           5
	//   40   88:invokevirtual   #187 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType)>
	//   41   91:astore_2        
					}
					return ((JsonSerializer) (new StdDelegatingSerializer(((Converter) (obj)), javatype, ((JsonSerializer) (beanproperty)))));
	//   42   92:new             #189 <Class StdDelegatingSerializer>
	//   43   95:dup             
	//   44   96:aload           4
	//   45   98:aload           5
	//   46  100:aload_2         
	//   47  101:invokespecial   #192 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//   48  104:areturn         
				}
			}
		}
		return jsonserializer;
	//   49  105:aload_3         
	//   50  106:areturn         
	}

	protected Boolean findFormatFeature(SerializerProvider serializerprovider, BeanProperty beanproperty, Class class1, com.fasterxml.jackson.annotation.JsonFormat.Feature feature)
	{
		serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #199 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//    5    7:astore_1        
		if(serializerprovider != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          19
			return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getFeature(feature);
	//    8   12:aload_1         
	//    9   13:aload           4
	//   10   15:invokevirtual   #205 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   11   18:areturn         
		else
			return null;
	//   12   19:aconst_null     
	//   13   20:areturn         
	}

	protected com.fasterxml.jackson.annotation.JsonFormat.Value findFormatOverrides(SerializerProvider serializerprovider, BeanProperty beanproperty, Class class1)
	{
		if(beanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          16
			return beanproperty.findPropertyFormat(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), class1);
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #210 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//    5    9:aload_3         
	//    6   10:invokeinterface #214 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanProperty.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//    7   15:areturn         
		else
			return serializerprovider.getDefaultPropertyFormat(class1);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #218 <Method com.fasterxml.jackson.annotation.JsonFormat$Value SerializerProvider.getDefaultPropertyFormat(Class)>
	//   11   21:areturn         
	}

	protected com.fasterxml.jackson.annotation.JsonInclude.Value findIncludeOverrides(SerializerProvider serializerprovider, BeanProperty beanproperty, Class class1)
	{
		if(beanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          16
			return beanproperty.findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), class1);
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #210 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//    5    9:aload_3         
	//    6   10:invokeinterface #225 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanProperty.findPropertyInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//    7   15:areturn         
		else
			return serializerprovider.getDefaultPropertyInclusion(class1);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #229 <Method com.fasterxml.jackson.annotation.JsonInclude$Value SerializerProvider.getDefaultPropertyInclusion(Class)>
	//   11   21:areturn         
	}

	protected PropertyFilter findPropertyFilter(SerializerProvider serializerprovider, Object obj, Object obj1)
		throws JsonMappingException
	{
		FilterProvider filterprovider = serializerprovider.getFilterProvider();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #236 <Method FilterProvider SerializerProvider.getFilterProvider()>
	//    2    4:astore          4
		if(filterprovider == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       61
		{
			Class class1 = handledType();
	//    5   11:aload_0         
	//    6   12:invokevirtual   #239 <Method Class handledType()>
	//    7   15:astore          5
			StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #241 <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #242 <Method void StringBuilder()>
	//   11   24:astore          6
			stringbuilder.append("Cannot resolve PropertyFilter with id '");
	//   12   26:aload           6
	//   13   28:ldc1            #244 <String "Cannot resolve PropertyFilter with id '">
	//   14   30:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:pop             
			stringbuilder.append(obj);
	//   16   34:aload           6
	//   17   36:aload_2         
	//   18   37:invokevirtual   #251 <Method StringBuilder StringBuilder.append(Object)>
	//   19   40:pop             
			stringbuilder.append("'; no FilterProvider configured");
	//   20   41:aload           6
	//   21   43:ldc1            #253 <String "'; no FilterProvider configured">
	//   22   45:invokevirtual   #248 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
			serializerprovider.reportBadDefinition(class1, stringbuilder.toString());
	//   24   49:aload_1         
	//   25   50:aload           5
	//   26   52:aload           6
	//   27   54:invokevirtual   #257 <Method String StringBuilder.toString()>
	//   28   57:invokevirtual   #261 <Method Object SerializerProvider.reportBadDefinition(Class, String)>
	//   29   60:pop             
		}
		return filterprovider.findPropertyFilter(obj, obj1);
	//   30   61:aload           4
	//   31   63:aload_2         
	//   32   64:aload_3         
	//   33   65:invokevirtual   #266 <Method PropertyFilter FilterProvider.findPropertyFilter(Object, Object)>
	//   34   68:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		return ((JsonNode) (createSchemaNode("string")));
	//    0    0:aload_0         
	//    1    1:ldc2            #270 <String "string">
	//    2    4:invokevirtual   #92  <Method ObjectNode createSchemaNode(String)>
	//    3    7:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type, boolean flag)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) ((ObjectNode)getSchema(serializerprovider, type)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #273 <Method JsonNode getSchema(SerializerProvider, Type)>
	//    4    6:checkcast       #85  <Class ObjectNode>
	//    5    9:astore_1        
		if(!flag)
	//*   6   10:iload_3         
	//*   7   11:ifne            24
			((ObjectNode) (serializerprovider)).put("required", flag ^ true);
	//    8   14:aload_1         
	//    9   15:ldc1            #94  <String "required">
	//   10   17:iload_3         
	//   11   18:iconst_1        
	//   12   19:ixor            
	//   13   20:invokevirtual   #96  <Method ObjectNode ObjectNode.put(String, boolean)>
	//   14   23:pop             
		return ((JsonNode) (serializerprovider));
	//   15   24:aload_1         
	//   16   25:areturn         
	}

	public Class handledType()
	{
		return _handledType;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Class _handledType>
	//    2    4:areturn         
	}

	protected boolean isDefaultSerializer(JsonSerializer jsonserializer)
	{
		return ClassUtil.isJacksonStdImpl(((Object) (jsonserializer)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #282 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//    2    4:ireturn         
	}

	public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	protected void visitArrayFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, JsonSerializer jsonserializer, JavaType javatype1)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectArrayFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #293 <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    3    7:astore_1        
		if(_neitherNull(((Object) (jsonformatvisitorwrapper)), ((Object) (jsonserializer))))
	//*   4    8:aload_1         
	//*   5    9:aload_3         
	//*   6   10:invokestatic    #162 <Method boolean _neitherNull(Object, Object)>
	//*   7   13:ifeq            25
			((JsonArrayFormatVisitor) (jsonformatvisitorwrapper)).itemsFormat(((JsonFormatVisitable) (jsonserializer)), javatype1);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:aload           4
	//   11   20:invokeinterface #299 <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatVisitable, JavaType)>
	//   12   25:return          
	}

	protected void visitArrayFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, JsonFormatTypes jsonformattypes)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectArrayFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #293 <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    3    7:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          19
			((JsonArrayFormatVisitor) (jsonformatvisitorwrapper)).itemsFormat(jsonformattypes);
	//    6   12:aload_1         
	//    7   13:aload_3         
	//    8   14:invokeinterface #304 <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatTypes)>
	//    9   19:return          
	}

	protected void visitFloatFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, com.fasterxml.jackson.core.JsonParser.NumberType numbertype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectNumberFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #310 <Method JsonNumberFormatVisitor JsonFormatVisitorWrapper.expectNumberFormat(JavaType)>
	//    3    7:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          19
			((JsonNumberFormatVisitor) (jsonformatvisitorwrapper)).numberType(numbertype);
	//    6   12:aload_1         
	//    7   13:aload_3         
	//    8   14:invokeinterface #316 <Method void JsonNumberFormatVisitor.numberType(com.fasterxml.jackson.core.JsonParser$NumberType)>
	//    9   19:return          
	}

	protected void visitIntFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, com.fasterxml.jackson.core.JsonParser.NumberType numbertype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectIntegerFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #321 <Method JsonIntegerFormatVisitor JsonFormatVisitorWrapper.expectIntegerFormat(JavaType)>
	//    3    7:astore_1        
		if(_neitherNull(((Object) (jsonformatvisitorwrapper)), ((Object) (numbertype))))
	//*   4    8:aload_1         
	//*   5    9:aload_3         
	//*   6   10:invokestatic    #162 <Method boolean _neitherNull(Object, Object)>
	//*   7   13:ifeq            23
			((JsonIntegerFormatVisitor) (jsonformatvisitorwrapper)).numberType(numbertype);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokeinterface #324 <Method void JsonIntegerFormatVisitor.numberType(com.fasterxml.jackson.core.JsonParser$NumberType)>
	//   11   23:return          
	}

	protected void visitIntFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, com.fasterxml.jackson.core.JsonParser.NumberType numbertype, JsonValueFormat jsonvalueformat)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectIntegerFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #321 <Method JsonIntegerFormatVisitor JsonFormatVisitorWrapper.expectIntegerFormat(JavaType)>
	//    3    7:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          36
		{
			if(numbertype != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          23
				((JsonIntegerFormatVisitor) (jsonformatvisitorwrapper)).numberType(numbertype);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokeinterface #324 <Method void JsonIntegerFormatVisitor.numberType(com.fasterxml.jackson.core.JsonParser$NumberType)>
			if(jsonvalueformat != null)
	//*  11   23:aload           4
	//*  12   25:ifnull          36
				((JsonIntegerFormatVisitor) (jsonformatvisitorwrapper)).format(jsonvalueformat);
	//   13   28:aload_1         
	//   14   29:aload           4
	//   15   31:invokeinterface #329 <Method void JsonIntegerFormatVisitor.format(JsonValueFormat)>
		}
	//   16   36:return          
	}

	protected void visitStringFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectStringFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #334 <Method JsonStringFormatVisitor JsonFormatVisitorWrapper.expectStringFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	protected void visitStringFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, JsonValueFormat jsonvalueformat)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectStringFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #334 <Method JsonStringFormatVisitor JsonFormatVisitorWrapper.expectStringFormat(JavaType)>
	//    3    7:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          19
			((JsonStringFormatVisitor) (jsonformatvisitorwrapper)).format(jsonvalueformat);
	//    6   12:aload_1         
	//    7   13:aload_3         
	//    8   14:invokeinterface #338 <Method void JsonStringFormatVisitor.format(JsonValueFormat)>
	//    9   19:return          
	}

	public void wrapAndThrow(SerializerProvider serializerprovider, Throwable throwable, Object obj, int i)
		throws IOException
	{
		for(; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_2         
	//    1    1:instanceof      #342 <Class InvocationTargetException>
	//    2    4:ifeq            22
	//    3    7:aload_2         
	//    4    8:invokevirtual   #348 <Method Throwable Throwable.getCause()>
	//    5   11:ifnull          22
	//    6   14:aload_2         
	//    7   15:invokevirtual   #348 <Method Throwable Throwable.getCause()>
	//    8   18:astore_2        
	//*   9   19:goto            0
		ClassUtil.throwIfError(throwable);
	//   10   22:aload_2         
	//   11   23:invokestatic    #352 <Method Throwable ClassUtil.throwIfError(Throwable)>
	//   12   26:pop             
		boolean flag;
		if(serializerprovider != null && !serializerprovider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS))
	//*  13   27:aload_1         
	//*  14   28:ifnull          50
	//*  15   31:aload_1         
	//*  16   32:getstatic       #358 <Field SerializationFeature SerializationFeature.WRAP_EXCEPTIONS>
	//*  17   35:invokevirtual   #362 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  18   38:ifeq            44
	//*  19   41:goto            50
			flag = false;
	//   20   44:iconst_0        
	//   21   45:istore          5
		else
	//*  22   47:goto            53
			flag = true;
	//   23   50:iconst_1        
	//   24   51:istore          5
		if(throwable instanceof IOException)
	//*  25   53:aload_2         
	//*  26   54:instanceof      #287 <Class IOException>
	//*  27   57:ifeq            77
		{
			if(!flag || !(throwable instanceof JsonMappingException))
	//*  28   60:iload           5
	//*  29   62:ifeq            72
	//*  30   65:aload_2         
	//*  31   66:instanceof      #62  <Class JsonMappingException>
	//*  32   69:ifne            87
				throw (IOException)throwable;
	//   33   72:aload_2         
	//   34   73:checkcast       #287 <Class IOException>
	//   35   76:athrow          
		} else
		if(!flag)
	//*  36   77:iload           5
	//*  37   79:ifne            87
			ClassUtil.throwIfRTE(throwable);
	//   38   82:aload_2         
	//   39   83:invokestatic    #365 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   40   86:pop             
		throw JsonMappingException.wrapWithPath(throwable, obj, i);
	//   41   87:aload_2         
	//   42   88:aload_3         
	//   43   89:iload           4
	//   44   91:invokestatic    #369 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   45   94:athrow          
	}

	public void wrapAndThrow(SerializerProvider serializerprovider, Throwable throwable, Object obj, String s)
		throws IOException
	{
		for(; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_2         
	//    1    1:instanceof      #342 <Class InvocationTargetException>
	//    2    4:ifeq            22
	//    3    7:aload_2         
	//    4    8:invokevirtual   #348 <Method Throwable Throwable.getCause()>
	//    5   11:ifnull          22
	//    6   14:aload_2         
	//    7   15:invokevirtual   #348 <Method Throwable Throwable.getCause()>
	//    8   18:astore_2        
	//*   9   19:goto            0
		ClassUtil.throwIfError(throwable);
	//   10   22:aload_2         
	//   11   23:invokestatic    #352 <Method Throwable ClassUtil.throwIfError(Throwable)>
	//   12   26:pop             
		boolean flag;
		if(serializerprovider != null && !serializerprovider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS))
	//*  13   27:aload_1         
	//*  14   28:ifnull          50
	//*  15   31:aload_1         
	//*  16   32:getstatic       #358 <Field SerializationFeature SerializationFeature.WRAP_EXCEPTIONS>
	//*  17   35:invokevirtual   #362 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  18   38:ifeq            44
	//*  19   41:goto            50
			flag = false;
	//   20   44:iconst_0        
	//   21   45:istore          5
		else
	//*  22   47:goto            53
			flag = true;
	//   23   50:iconst_1        
	//   24   51:istore          5
		if(throwable instanceof IOException)
	//*  25   53:aload_2         
	//*  26   54:instanceof      #287 <Class IOException>
	//*  27   57:ifeq            77
		{
			if(!flag || !(throwable instanceof JsonMappingException))
	//*  28   60:iload           5
	//*  29   62:ifeq            72
	//*  30   65:aload_2         
	//*  31   66:instanceof      #62  <Class JsonMappingException>
	//*  32   69:ifne            87
				throw (IOException)throwable;
	//   33   72:aload_2         
	//   34   73:checkcast       #287 <Class IOException>
	//   35   76:athrow          
		} else
		if(!flag)
	//*  36   77:iload           5
	//*  37   79:ifne            87
			ClassUtil.throwIfRTE(throwable);
	//   38   82:aload_2         
	//   39   83:invokestatic    #365 <Method Throwable ClassUtil.throwIfRTE(Throwable)>
	//   40   86:pop             
		throw JsonMappingException.wrapWithPath(throwable, obj, s);
	//   41   87:aload_2         
	//   42   88:aload_3         
	//   43   89:aload           4
	//   44   91:invokestatic    #373 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   45   94:athrow          
	}

	private static final Object KEY_CONTENT_CONVERTER_LOCK = new Object();
	private static final long serialVersionUID = 1L;
	protected final Class _handledType;

	static 
	{
	//    0    0:new             #24  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Object()>
	//    3    7:putstatic       #29  <Field Object KEY_CONTENT_CONVERTER_LOCK>
	//*   4   10:return          
	}
}
