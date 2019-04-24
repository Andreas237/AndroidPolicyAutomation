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

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #57  <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//    3    7:pop             
	//    4    8:return          
	}

	protected ObjectNode createObjectNode()
	{
		return JsonNodeFactory.instance.objectNode();
	//    0    0:getstatic       #66  <Field JsonNodeFactory JsonNodeFactory.instance>
	//    1    3:invokevirtual   #69  <Method ObjectNode JsonNodeFactory.objectNode()>
	//    2    6:areturn         
	}

	protected ObjectNode createSchemaNode(String s)
	{
		ObjectNode objectnode = createObjectNode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #73  <Method ObjectNode createObjectNode()>
	//    2    4:astore_2        
		objectnode.put("type", s);
	//    3    5:aload_2         
	//    4    6:ldc1            #75  <String "type">
	//    5    8:aload_1         
	//    6    9:invokevirtual   #81  <Method ObjectNode ObjectNode.put(String, String)>
	//    7   12:pop             
		return objectnode;
	//    8   13:aload_2         
	//    9   14:areturn         
	}

	protected ObjectNode createSchemaNode(String s, boolean flag)
	{
		s = ((String) (createSchemaNode(s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #84  <Method ObjectNode createSchemaNode(String)>
	//    3    5:astore_1        
		if(!flag)
	//*   4    6:iload_2         
	//*   5    7:ifne            24
		{
			if(!flag)
	//*   6   10:iload_2         
	//*   7   11:ifne            26
				flag = true;
	//    8   14:iconst_1        
	//    9   15:istore_2        
			else
	//*  10   16:aload_1         
	//*  11   17:ldc1            #86  <String "required">
	//*  12   19:iload_2         
	//*  13   20:invokevirtual   #88  <Method ObjectNode ObjectNode.put(String, boolean)>
	//*  14   23:pop             
	//*  15   24:aload_1         
	//*  16   25:areturn         
				flag = false;
	//   17   26:iconst_0        
	//   18   27:istore_2        
			((ObjectNode) (s)).put("required", flag);
		}
		return ((ObjectNode) (s));
	//*  19   28:goto            16
	}

	protected JsonSerializer findConvertingContentSerializer(SerializerProvider serializerprovider, BeanProperty beanproperty, JsonSerializer jsonserializer)
		throws JsonMappingException
	{
		Object obj;
		com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember;
		if(serializerprovider.getAttribute(CONVERTING_CONTENT_CONVERTER_LOCK) != null)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #29  <Field Object CONVERTING_CONTENT_CONVERTER_LOCK>
	//*   2    4:invokevirtual   #96  <Method Object SerializerProvider.getAttribute(Object)>
	//*   3    7:ifnull          12
			return jsonserializer;
	//    4   10:aload_3         
	//    5   11:areturn         
		obj = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    6   12:aload_1         
	//    7   13:invokevirtual   #100 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    8   16:astore          4
		if(obj == null || beanproperty == null)
			break MISSING_BLOCK_LABEL_149;
	//    9   18:aload           4
	//   10   20:ifnull          149
	//   11   23:aload_2         
	//   12   24:ifnull          149
		annotatedmember = beanproperty.getMember();
	//   13   27:aload_2         
	//   14   28:invokeinterface #106 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   15   33:astore          5
		if(annotatedmember == null)
			break MISSING_BLOCK_LABEL_149;
	//   16   35:aload           5
	//   17   37:ifnull          149
		serializerprovider.setAttribute(CONVERTING_CONTENT_CONVERTER_LOCK, ((Object) (Boolean.TRUE)));
	//   18   40:aload_1         
	//   19   41:getstatic       #29  <Field Object CONVERTING_CONTENT_CONVERTER_LOCK>
	//   20   44:getstatic       #112 <Field Boolean Boolean.TRUE>
	//   21   47:invokevirtual   #116 <Method SerializerProvider SerializerProvider.setAttribute(Object, Object)>
	//   22   50:pop             
		obj = ((AnnotationIntrospector) (obj)).findSerializationContentConverter(annotatedmember);
	//   23   51:aload           4
	//   24   53:aload           5
	//   25   55:invokevirtual   #122 <Method Object AnnotationIntrospector.findSerializationContentConverter(com.fasterxml.jackson.databind.introspect.AnnotatedMember)>
	//   26   58:astore          4
		serializerprovider.setAttribute(CONVERTING_CONTENT_CONVERTER_LOCK, ((Object) (null)));
	//   27   60:aload_1         
	//   28   61:getstatic       #29  <Field Object CONVERTING_CONTENT_CONVERTER_LOCK>
	//   29   64:aconst_null     
	//   30   65:invokevirtual   #116 <Method SerializerProvider SerializerProvider.setAttribute(Object, Object)>
	//   31   68:pop             
		if(obj != null)
	//*  32   69:aload           4
	//*  33   71:ifnull          149
		{
			obj = ((Object) (serializerprovider.converterInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty.getMember())), obj)));
	//   34   74:aload_1         
	//   35   75:aload_2         
	//   36   76:invokeinterface #106 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   37   81:aload           4
	//   38   83:invokevirtual   #126 <Method Converter SerializerProvider.converterInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   39   86:astore          4
			JavaType javatype = ((Converter) (obj)).getOutputType(serializerprovider.getTypeFactory());
	//   40   88:aload           4
	//   41   90:aload_1         
	//   42   91:invokevirtual   #130 <Method com.fasterxml.jackson.databind.type.TypeFactory SerializerProvider.getTypeFactory()>
	//   43   94:invokeinterface #136 <Method JavaType Converter.getOutputType(com.fasterxml.jackson.databind.type.TypeFactory)>
	//   44   99:astore          5
			beanproperty = ((BeanProperty) (jsonserializer));
	//   45  101:aload_3         
	//   46  102:astore_2        
			if(jsonserializer == null)
	//*  47  103:aload_3         
	//*  48  104:ifnonnull       124
			{
				beanproperty = ((BeanProperty) (jsonserializer));
	//   49  107:aload_3         
	//   50  108:astore_2        
				if(!javatype.isJavaLangObject())
	//*  51  109:aload           5
	//*  52  111:invokevirtual   #140 <Method boolean JavaType.isJavaLangObject()>
	//*  53  114:ifne            124
					beanproperty = ((BeanProperty) (serializerprovider.findValueSerializer(javatype)));
	//   54  117:aload_1         
	//   55  118:aload           5
	//   56  120:invokevirtual   #144 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType)>
	//   57  123:astore_2        
			}
			return ((JsonSerializer) (new StdDelegatingSerializer(((Converter) (obj)), javatype, ((JsonSerializer) (beanproperty)))));
	//   58  124:new             #146 <Class StdDelegatingSerializer>
	//   59  127:dup             
	//   60  128:aload           4
	//   61  130:aload           5
	//   62  132:aload_2         
	//   63  133:invokespecial   #149 <Method void StdDelegatingSerializer(Converter, JavaType, JsonSerializer)>
	//   64  136:areturn         
		}
		break MISSING_BLOCK_LABEL_149;
		beanproperty;
	//   65  137:astore_2        
		serializerprovider.setAttribute(CONVERTING_CONTENT_CONVERTER_LOCK, ((Object) (null)));
	//   66  138:aload_1         
	//   67  139:getstatic       #29  <Field Object CONVERTING_CONTENT_CONVERTER_LOCK>
	//   68  142:aconst_null     
	//   69  143:invokevirtual   #116 <Method SerializerProvider SerializerProvider.setAttribute(Object, Object)>
	//   70  146:pop             
		throw beanproperty;
	//   71  147:aload_2         
	//   72  148:athrow          
		return jsonserializer;
	//   73  149:aload_3         
	//   74  150:areturn         
	}

	protected Boolean findFormatFeature(SerializerProvider serializerprovider, BeanProperty beanproperty, Class class1, com.fasterxml.jackson.annotation.JsonFormat.Feature feature)
	{
		serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #156 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//    5    7:astore_1        
		if(serializerprovider != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          19
			return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)).getFeature(feature);
	//    8   12:aload_1         
	//    9   13:aload           4
	//   10   15:invokevirtual   #162 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
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
	//    4    6:invokevirtual   #167 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//    5    9:aload_3         
	//    6   10:invokeinterface #171 <Method com.fasterxml.jackson.annotation.JsonFormat$Value BeanProperty.findPropertyFormat(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//    7   15:areturn         
		else
			return serializerprovider.getDefaultPropertyFormat(class1);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokevirtual   #175 <Method com.fasterxml.jackson.annotation.JsonFormat$Value SerializerProvider.getDefaultPropertyFormat(Class)>
	//   11   21:areturn         
	}

	protected PropertyFilter findPropertyFilter(SerializerProvider serializerprovider, Object obj, Object obj1)
		throws JsonMappingException
	{
		FilterProvider filterprovider = serializerprovider.getFilterProvider();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #182 <Method FilterProvider SerializerProvider.getFilterProvider()>
	//    2    4:astore          4
		if(filterprovider == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       40
			throw JsonMappingException.from(serializerprovider, (new StringBuilder()).append("Can not resolve PropertyFilter with id '").append(obj).append("'; no FilterProvider configured").toString());
	//    5   11:aload_1         
	//    6   12:new             #184 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #185 <Method void StringBuilder()>
	//    9   19:ldc1            #187 <String "Can not resolve PropertyFilter with id '">
	//   10   21:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_2         
	//   12   25:invokevirtual   #194 <Method StringBuilder StringBuilder.append(Object)>
	//   13   28:ldc1            #196 <String "'; no FilterProvider configured">
	//   14   30:invokevirtual   #191 <Method StringBuilder StringBuilder.append(String)>
	//   15   33:invokevirtual   #200 <Method String StringBuilder.toString()>
	//   16   36:invokestatic    #204 <Method JsonMappingException JsonMappingException.from(SerializerProvider, String)>
	//   17   39:athrow          
		else
			return filterprovider.findPropertyFilter(obj, obj1);
	//   18   40:aload           4
	//   19   42:aload_2         
	//   20   43:aload_3         
	//   21   44:invokevirtual   #209 <Method PropertyFilter FilterProvider.findPropertyFilter(Object, Object)>
	//   22   47:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		return ((JsonNode) (createSchemaNode("string")));
	//    0    0:aload_0         
	//    1    1:ldc1            #213 <String "string">
	//    2    3:invokevirtual   #84  <Method ObjectNode createSchemaNode(String)>
	//    3    6:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type, boolean flag)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) ((ObjectNode)getSchema(serializerprovider, type)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #216 <Method JsonNode getSchema(SerializerProvider, Type)>
	//    4    6:checkcast       #77  <Class ObjectNode>
	//    5    9:astore_1        
		if(!flag)
	//*   6   10:iload_3         
	//*   7   11:ifne            28
		{
			if(!flag)
	//*   8   14:iload_3         
	//*   9   15:ifne            30
				flag = true;
	//   10   18:iconst_1        
	//   11   19:istore_3        
			else
	//*  12   20:aload_1         
	//*  13   21:ldc1            #86  <String "required">
	//*  14   23:iload_3         
	//*  15   24:invokevirtual   #88  <Method ObjectNode ObjectNode.put(String, boolean)>
	//*  16   27:pop             
	//*  17   28:aload_1         
	//*  18   29:areturn         
				flag = false;
	//   19   30:iconst_0        
	//   20   31:istore_3        
			((ObjectNode) (serializerprovider)).put("required", flag);
		}
		return ((JsonNode) (serializerprovider));
	//*  21   32:goto            20
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
	//    1    1:invokestatic    #226 <Method boolean ClassUtil.isJacksonStdImpl(Object)>
	//    2    4:ireturn         
	}

	public abstract void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException;

	protected void visitArrayFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, JsonSerializer jsonserializer, JavaType javatype1)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          29
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectArrayFormat(javatype)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #237 <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    5   11:astore_1        
			if(jsonformatvisitorwrapper != null && jsonserializer != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          29
	//*   8   16:aload_3         
	//*   9   17:ifnull          29
				((JsonArrayFormatVisitor) (jsonformatvisitorwrapper)).itemsFormat(((JsonFormatVisitable) (jsonserializer)), javatype1);
	//   10   20:aload_1         
	//   11   21:aload_3         
	//   12   22:aload           4
	//   13   24:invokeinterface #243 <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatVisitable, JavaType)>
		}
	//   14   29:return          
	}

	protected void visitArrayFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, JsonFormatTypes jsonformattypes)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectArrayFormat(javatype)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #237 <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    5   11:astore_1        
			if(jsonformatvisitorwrapper != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
				((JsonArrayFormatVisitor) (jsonformatvisitorwrapper)).itemsFormat(jsonformattypes);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokeinterface #248 <Method void JsonArrayFormatVisitor.itemsFormat(JsonFormatTypes)>
		}
	//   11   23:return          
	}

	protected void visitFloatFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, com.fasterxml.jackson.core.JsonParser.NumberType numbertype)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectNumberFormat(javatype)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #254 <Method JsonNumberFormatVisitor JsonFormatVisitorWrapper.expectNumberFormat(JavaType)>
	//    5   11:astore_1        
			if(jsonformatvisitorwrapper != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
				((JsonNumberFormatVisitor) (jsonformatvisitorwrapper)).numberType(numbertype);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokeinterface #260 <Method void JsonNumberFormatVisitor.numberType(com.fasterxml.jackson.core.JsonParser$NumberType)>
		}
	//   11   23:return          
	}

	protected void visitIntFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, com.fasterxml.jackson.core.JsonParser.NumberType numbertype)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          27
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectIntegerFormat(javatype)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #265 <Method JsonIntegerFormatVisitor JsonFormatVisitorWrapper.expectIntegerFormat(JavaType)>
	//    5   11:astore_1        
			if(jsonformatvisitorwrapper != null && numbertype != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          27
	//*   8   16:aload_3         
	//*   9   17:ifnull          27
				((JsonIntegerFormatVisitor) (jsonformatvisitorwrapper)).numberType(numbertype);
	//   10   20:aload_1         
	//   11   21:aload_3         
	//   12   22:invokeinterface #268 <Method void JsonIntegerFormatVisitor.numberType(com.fasterxml.jackson.core.JsonParser$NumberType)>
		}
	//   13   27:return          
	}

	protected void visitIntFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, com.fasterxml.jackson.core.JsonParser.NumberType numbertype, JsonValueFormat jsonvalueformat)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          40
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectIntegerFormat(javatype)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #265 <Method JsonIntegerFormatVisitor JsonFormatVisitorWrapper.expectIntegerFormat(JavaType)>
	//    5   11:astore_1        
			if(jsonformatvisitorwrapper != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          40
			{
				if(numbertype != null)
	//*   8   16:aload_3         
	//*   9   17:ifnull          27
					((JsonIntegerFormatVisitor) (jsonformatvisitorwrapper)).numberType(numbertype);
	//   10   20:aload_1         
	//   11   21:aload_3         
	//   12   22:invokeinterface #268 <Method void JsonIntegerFormatVisitor.numberType(com.fasterxml.jackson.core.JsonParser$NumberType)>
				if(jsonvalueformat != null)
	//*  13   27:aload           4
	//*  14   29:ifnull          40
					((JsonIntegerFormatVisitor) (jsonformatvisitorwrapper)).format(jsonvalueformat);
	//   15   32:aload_1         
	//   16   33:aload           4
	//   17   35:invokeinterface #273 <Method void JsonIntegerFormatVisitor.format(JsonValueFormat)>
			}
		}
	//   18   40:return          
	}

	protected void visitStringFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          12
			jsonformatvisitorwrapper.expectStringFormat(javatype);
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #278 <Method JsonStringFormatVisitor JsonFormatVisitorWrapper.expectStringFormat(JavaType)>
	//    5   11:pop             
	//    6   12:return          
	}

	protected void visitStringFormat(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, JsonValueFormat jsonvalueformat)
		throws JsonMappingException
	{
		if(jsonformatvisitorwrapper != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectStringFormat(javatype)));
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #278 <Method JsonStringFormatVisitor JsonFormatVisitorWrapper.expectStringFormat(JavaType)>
	//    5   11:astore_1        
			if(jsonformatvisitorwrapper != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          23
				((JsonStringFormatVisitor) (jsonformatvisitorwrapper)).format(jsonvalueformat);
	//    8   16:aload_1         
	//    9   17:aload_3         
	//   10   18:invokeinterface #282 <Method void JsonStringFormatVisitor.format(JsonValueFormat)>
		}
	//   11   23:return          
	}

	public void wrapAndThrow(SerializerProvider serializerprovider, Throwable throwable, Object obj, int i)
		throws IOException
	{
		for(; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_2         
	//    1    1:instanceof      #286 <Class InvocationTargetException>
	//    2    4:ifeq            22
	//    3    7:aload_2         
	//    4    8:invokevirtual   #292 <Method Throwable Throwable.getCause()>
	//    5   11:ifnull          22
	//    6   14:aload_2         
	//    7   15:invokevirtual   #292 <Method Throwable Throwable.getCause()>
	//    8   18:astore_2        
	//*   9   19:goto            0
		if(throwable instanceof Error)
	//*  10   22:aload_2         
	//*  11   23:instanceof      #294 <Class Error>
	//*  12   26:ifeq            34
			throw (Error)throwable;
	//   13   29:aload_2         
	//   14   30:checkcast       #294 <Class Error>
	//   15   33:athrow          
		boolean flag;
		if(serializerprovider == null || serializerprovider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS))
	//*  16   34:aload_1         
	//*  17   35:ifnull          48
	//*  18   38:aload_1         
	//*  19   39:getstatic       #300 <Field SerializationFeature SerializationFeature.WRAP_EXCEPTIONS>
	//*  20   42:invokevirtual   #304 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  21   45:ifeq            75
			flag = true;
	//   22   48:iconst_1        
	//   23   49:istore          5
		else
	//*  24   51:aload_2         
	//*  25   52:instanceof      #231 <Class IOException>
	//*  26   55:ifeq            81
	//*  27   58:iload           5
	//*  28   60:ifeq            70
	//*  29   63:aload_2         
	//*  30   64:instanceof      #51  <Class JsonMappingException>
	//*  31   67:ifne            98
	//*  32   70:aload_2         
	//*  33   71:checkcast       #231 <Class IOException>
	//*  34   74:athrow          
			flag = false;
	//   35   75:iconst_0        
	//   36   76:istore          5
		if(throwable instanceof IOException)
		{
			if(!flag || !(throwable instanceof JsonMappingException))
				throw (IOException)throwable;
		} else
	//*  37   78:goto            51
		if(!flag && (throwable instanceof RuntimeException))
	//*  38   81:iload           5
	//*  39   83:ifne            98
	//*  40   86:aload_2         
	//*  41   87:instanceof      #306 <Class RuntimeException>
	//*  42   90:ifeq            98
			throw (RuntimeException)throwable;
	//   43   93:aload_2         
	//   44   94:checkcast       #306 <Class RuntimeException>
	//   45   97:athrow          
		throw JsonMappingException.wrapWithPath(throwable, obj, i);
	//   46   98:aload_2         
	//   47   99:aload_3         
	//   48  100:iload           4
	//   49  102:invokestatic    #310 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, int)>
	//   50  105:athrow          
	}

	public void wrapAndThrow(SerializerProvider serializerprovider, Throwable throwable, Object obj, String s)
		throws IOException
	{
		for(; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause());
	//    0    0:aload_2         
	//    1    1:instanceof      #286 <Class InvocationTargetException>
	//    2    4:ifeq            22
	//    3    7:aload_2         
	//    4    8:invokevirtual   #292 <Method Throwable Throwable.getCause()>
	//    5   11:ifnull          22
	//    6   14:aload_2         
	//    7   15:invokevirtual   #292 <Method Throwable Throwable.getCause()>
	//    8   18:astore_2        
	//*   9   19:goto            0
		if(throwable instanceof Error)
	//*  10   22:aload_2         
	//*  11   23:instanceof      #294 <Class Error>
	//*  12   26:ifeq            34
			throw (Error)throwable;
	//   13   29:aload_2         
	//   14   30:checkcast       #294 <Class Error>
	//   15   33:athrow          
		boolean flag;
		if(serializerprovider == null || serializerprovider.isEnabled(SerializationFeature.WRAP_EXCEPTIONS))
	//*  16   34:aload_1         
	//*  17   35:ifnull          48
	//*  18   38:aload_1         
	//*  19   39:getstatic       #300 <Field SerializationFeature SerializationFeature.WRAP_EXCEPTIONS>
	//*  20   42:invokevirtual   #304 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  21   45:ifeq            75
			flag = true;
	//   22   48:iconst_1        
	//   23   49:istore          5
		else
	//*  24   51:aload_2         
	//*  25   52:instanceof      #231 <Class IOException>
	//*  26   55:ifeq            81
	//*  27   58:iload           5
	//*  28   60:ifeq            70
	//*  29   63:aload_2         
	//*  30   64:instanceof      #51  <Class JsonMappingException>
	//*  31   67:ifne            98
	//*  32   70:aload_2         
	//*  33   71:checkcast       #231 <Class IOException>
	//*  34   74:athrow          
			flag = false;
	//   35   75:iconst_0        
	//   36   76:istore          5
		if(throwable instanceof IOException)
		{
			if(!flag || !(throwable instanceof JsonMappingException))
				throw (IOException)throwable;
		} else
	//*  37   78:goto            51
		if(!flag && (throwable instanceof RuntimeException))
	//*  38   81:iload           5
	//*  39   83:ifne            98
	//*  40   86:aload_2         
	//*  41   87:instanceof      #306 <Class RuntimeException>
	//*  42   90:ifeq            98
			throw (RuntimeException)throwable;
	//   43   93:aload_2         
	//   44   94:checkcast       #306 <Class RuntimeException>
	//   45   97:athrow          
		throw JsonMappingException.wrapWithPath(throwable, obj, s);
	//   46   98:aload_2         
	//   47   99:aload_3         
	//   48  100:aload           4
	//   49  102:invokestatic    #314 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   50  105:athrow          
	}

	private static final Object CONVERTING_CONTENT_CONVERTER_LOCK = new Object();
	private static final long serialVersionUID = 1L;
	protected final Class _handledType;

	static 
	{
	//    0    0:new             #24  <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void Object()>
	//    3    7:putstatic       #29  <Field Object CONVERTING_CONTENT_CONVERTER_LOCK>
	//*   4   10:return          
	}
}
