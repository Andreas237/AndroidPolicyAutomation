// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer, CollectionSerializer

public abstract class StaticListSerializerBase extends StdSerializer
	implements ContextualSerializer
{

	protected StaticListSerializerBase(StaticListSerializerBase staticlistserializerbase, Boolean boolean1)
	{
		super(((StdSerializer) (staticlistserializerbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void StdSerializer(StdSerializer)>
		_unwrapSingle = boolean1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #16  <Field Boolean _unwrapSingle>
	//    6   10:return          
	}

	protected StaticListSerializerBase(Class class1)
	{
		super(class1, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #23  <Method void StdSerializer(Class, boolean)>
		_unwrapSingle = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #16  <Field Boolean _unwrapSingle>
	//    7   11:return          
	}

	public abstract JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1);

	protected abstract void acceptContentVisitor(JsonArrayFormatVisitor jsonarrayformatvisitor)
		throws JsonMappingException;

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		acceptContentVisitor(jsonformatvisitorwrapper.expectArrayFormat(javatype));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokeinterface #38  <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    4    8:invokevirtual   #40  <Method void acceptContentVisitor(JsonArrayFormatVisitor)>
	//    5   11:return          
	}

	protected abstract JsonNode contentSchema();

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj;
label0:
		{
			if(beanproperty != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          45
			{
				Object obj1 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//    2    4:aload_1         
	//    3    5:invokevirtual   #51  <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    4    8:astore          4
				obj = ((Object) (beanproperty.getMember()));
	//    5   10:aload_2         
	//    6   11:invokeinterface #57  <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    7   16:astore_3        
				if(obj != null)
	//*   8   17:aload_3         
	//*   9   18:ifnull          45
				{
					obj1 = ((AnnotationIntrospector) (obj1)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
	//   10   21:aload           4
	//   11   23:aload_3         
	//   12   24:invokevirtual   #63  <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   13   27:astore          4
					if(obj1 != null)
	//*  14   29:aload           4
	//*  15   31:ifnull          45
					{
						obj = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), obj1)));
	//   16   34:aload_1         
	//   17   35:aload_3         
	//   18   36:aload           4
	//   19   38:invokevirtual   #67  <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   20   41:astore_3        
						break label0;
	//   21   42:goto            47
					}
				}
			}
			obj = null;
	//   22   45:aconst_null     
	//   23   46:astore_3        
		}
		Object obj2 = ((Object) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
	//   24   47:aload_0         
	//   25   48:aload_1         
	//   26   49:aload_2         
	//   27   50:aload_0         
	//   28   51:invokevirtual   #71  <Method Class handledType()>
	//   29   54:invokevirtual   #75  <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//   30   57:astore          4
		if(obj2 != null)
	//*  31   59:aload           4
	//*  32   61:ifnull          77
			obj2 = ((Object) (((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj2)).getFeature(com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED)));
	//   33   64:aload           4
	//   34   66:getstatic       #81  <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   35   69:invokevirtual   #87  <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   36   72:astore          4
		else
	//*  37   74:goto            80
			obj2 = null;
	//   38   77:aconst_null     
	//   39   78:astore          4
		JsonSerializer jsonserializer = findContextualConvertingSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj)));
	//   40   80:aload_0         
	//   41   81:aload_1         
	//   42   82:aload_2         
	//   43   83:aload_3         
	//   44   84:invokevirtual   #91  <Method JsonSerializer findContextualConvertingSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   45   87:astore          5
		obj = ((Object) (jsonserializer));
	//   46   89:aload           5
	//   47   91:astore_3        
		if(jsonserializer == null)
	//*  48   92:aload           5
	//*  49   94:ifnonnull       105
			obj = ((Object) (serializerprovider.findValueSerializer(java/lang/String, beanproperty)));
	//   50   97:aload_1         
	//   51   98:ldc1            #93  <Class String>
	//   52  100:aload_2         
	//   53  101:invokevirtual   #97  <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   54  104:astore_3        
		if(isDefaultSerializer(((JsonSerializer) (obj))))
	//*  55  105:aload_0         
	//*  56  106:aload_3         
	//*  57  107:invokevirtual   #101 <Method boolean isDefaultSerializer(JsonSerializer)>
	//*  58  110:ifeq            132
		{
			if(obj2 == _unwrapSingle)
	//*  59  113:aload           4
	//*  60  115:aload_0         
	//*  61  116:getfield        #16  <Field Boolean _unwrapSingle>
	//*  62  119:if_acmpne       124
				return ((JsonSerializer) (this));
	//   63  122:aload_0         
	//   64  123:areturn         
			else
				return _withResolved(beanproperty, ((Boolean) (obj2)));
	//   65  124:aload_0         
	//   66  125:aload_2         
	//   67  126:aload           4
	//   68  128:invokevirtual   #103 <Method JsonSerializer _withResolved(BeanProperty, Boolean)>
	//   69  131:areturn         
		} else
		{
			return ((JsonSerializer) (new CollectionSerializer(serializerprovider.constructType(java/lang/String), true, ((TypeSerializer) (null)), ((JsonSerializer) (obj)))));
	//   70  132:new             #105 <Class CollectionSerializer>
	//   71  135:dup             
	//   72  136:aload_1         
	//   73  137:ldc1            #93  <Class String>
	//   74  139:invokevirtual   #109 <Method JavaType SerializerProvider.constructType(Type)>
	//   75  142:iconst_1        
	//   76  143:aconst_null     
	//   77  144:aload_3         
	//   78  145:invokespecial   #112 <Method void CollectionSerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//   79  148:areturn         
		}
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		return createSchemaNode("array", true).set("items", contentSchema());
	//    0    0:aload_0         
	//    1    1:ldc1            #117 <String "array">
	//    2    3:iconst_1        
	//    3    4:invokevirtual   #121 <Method ObjectNode createSchemaNode(String, boolean)>
	//    4    7:ldc1            #123 <String "items">
	//    5    9:aload_0         
	//    6   10:invokevirtual   #125 <Method JsonNode contentSchema()>
	//    7   13:invokevirtual   #131 <Method JsonNode ObjectNode.set(String, JsonNode)>
	//    8   16:areturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (Collection)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #135 <Class Collection>
	//    4    6:invokevirtual   #138 <Method boolean isEmpty(SerializerProvider, Collection)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Collection collection)
	{
		return collection == null || collection.size() == 0;
	//    0    0:aload_2         
	//    1    1:ifnull          18
	//    2    4:aload_2         
	//    3    5:invokeinterface #142 <Method int Collection.size()>
	//    4   10:ifne            16
	//    5   13:goto            18
	//    6   16:iconst_0        
	//    7   17:ireturn         
	//    8   18:iconst_1        
	//    9   19:ireturn         
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((Collection)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #135 <Class Collection>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #150 <Method void serializeWithType(Collection, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public abstract void serializeWithType(Collection collection, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException;

	protected final Boolean _unwrapSingle;
}
