// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			ArraySerializerBase

public class ObjectArraySerializer extends ArraySerializerBase
	implements ContextualSerializer
{

	public ObjectArraySerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		super([Ljava/lang/Object;);
	//    0    0:aload_0         
	//    1    1:ldc1            #23  <Class Object[]>
	//    2    3:invokespecial   #26  <Method void ArraySerializerBase(Class)>
		_elementType = javatype;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #28  <Field JavaType _elementType>
		_staticTyping = flag;
	//    6   11:aload_0         
	//    7   12:iload_2         
	//    8   13:putfield        #30  <Field boolean _staticTyping>
		_valueTypeSerializer = typeserializer;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #32  <Field TypeSerializer _valueTypeSerializer>
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   12   21:aload_0         
	//   13   22:invokestatic    #38  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   14   25:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		_elementSerializer = jsonserializer;
	//   15   28:aload_0         
	//   16   29:aload           4
	//   17   31:putfield        #42  <Field JsonSerializer _elementSerializer>
	//   18   34:return          
	}

	public ObjectArraySerializer(ObjectArraySerializer objectarrayserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		super(((ArraySerializerBase) (objectarrayserializer)), beanproperty, boolean1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload           5
	//    4    5:invokespecial   #49  <Method void ArraySerializerBase(ArraySerializerBase, BeanProperty, Boolean)>
		_elementType = objectarrayserializer._elementType;
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:getfield        #28  <Field JavaType _elementType>
	//    8   13:putfield        #28  <Field JavaType _elementType>
		_valueTypeSerializer = typeserializer;
	//    9   16:aload_0         
	//   10   17:aload_3         
	//   11   18:putfield        #32  <Field TypeSerializer _valueTypeSerializer>
		_staticTyping = objectarrayserializer._staticTyping;
	//   12   21:aload_0         
	//   13   22:aload_1         
	//   14   23:getfield        #30  <Field boolean _staticTyping>
	//   15   26:putfield        #30  <Field boolean _staticTyping>
		_dynamicSerializers = objectarrayserializer._dynamicSerializers;
	//   16   29:aload_0         
	//   17   30:aload_1         
	//   18   31:getfield        #40  <Field PropertySerializerMap _dynamicSerializers>
	//   19   34:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		_elementSerializer = jsonserializer;
	//   20   37:aload_0         
	//   21   38:aload           4
	//   22   40:putfield        #42  <Field JsonSerializer _elementSerializer>
	//   23   43:return          
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		javatype = ((JavaType) (propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #58  <Field BeanProperty _property>
	//    5    7:invokevirtual   #62  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(JavaType, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #67  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #67  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #70  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		class1 = ((Class) (propertyserializermap.findAndAddSecondarySerializer(class1, serializerprovider, _property)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload_0         
	//    4    4:getfield        #58  <Field BeanProperty _property>
	//    5    7:invokevirtual   #76  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddSecondarySerializer(Class, SerializerProvider, BeanProperty)>
	//    6   10:astore_2        
		if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
	//*   7   11:aload_1         
	//*   8   12:aload_2         
	//*   9   13:getfield        #67  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//*  10   16:if_acmpeq       27
			_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
	//   11   19:aload_0         
	//   12   20:aload_2         
	//   13   21:getfield        #67  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
	//   14   24:putfield        #40  <Field PropertySerializerMap _dynamicSerializers>
		return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
	//   15   27:aload_2         
	//   16   28:getfield        #70  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
	//   17   31:areturn         
	}

	public JsonSerializer _withResolved(BeanProperty beanproperty, Boolean boolean1)
	{
		return ((JsonSerializer) (new ObjectArraySerializer(this, beanproperty, _valueTypeSerializer, _elementSerializer, boolean1)));
	//    0    0:new             #2   <Class ObjectArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field JsonSerializer _elementSerializer>
	//    8   14:aload_2         
	//    9   15:invokespecial   #81  <Method void ObjectArraySerializer(ObjectArraySerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   10   18:areturn         
	}

	public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
	{
		return ((ContainerSerializer) (new ObjectArraySerializer(_elementType, _staticTyping, typeserializer, _elementSerializer)));
	//    0    0:new             #2   <Class ObjectArraySerializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #28  <Field JavaType _elementType>
	//    4    8:aload_0         
	//    5    9:getfield        #30  <Field boolean _staticTyping>
	//    6   12:aload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #42  <Field JsonSerializer _elementSerializer>
	//    9   17:invokespecial   #86  <Method void ObjectArraySerializer(JavaType, boolean, TypeSerializer, JsonSerializer)>
	//   10   20:areturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JsonArrayFormatVisitor jsonarrayformatvisitor = jsonformatvisitorwrapper.expectArrayFormat(javatype);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #95  <Method JsonArrayFormatVisitor JsonFormatVisitorWrapper.expectArrayFormat(JavaType)>
	//    3    7:astore          4
		if(jsonarrayformatvisitor != null)
	//*   4    9:aload           4
	//*   5   11:ifnull          57
		{
			JavaType javatype1 = _elementType;
	//    6   14:aload_0         
	//    7   15:getfield        #28  <Field JavaType _elementType>
	//    8   18:astore          5
			JsonSerializer jsonserializer = _elementSerializer;
	//    9   20:aload_0         
	//   10   21:getfield        #42  <Field JsonSerializer _elementSerializer>
	//   11   24:astore_3        
			javatype = ((JavaType) (jsonserializer));
	//   12   25:aload_3         
	//   13   26:astore_2        
			if(jsonserializer == null)
	//*  14   27:aload_3         
	//*  15   28:ifnonnull       47
				javatype = ((JavaType) (jsonformatvisitorwrapper.getProvider().findValueSerializer(javatype1, _property)));
	//   16   31:aload_1         
	//   17   32:invokeinterface #99  <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   18   37:aload           5
	//   19   39:aload_0         
	//   20   40:getfield        #58  <Field BeanProperty _property>
	//   21   43:invokevirtual   #105 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   22   46:astore_2        
			jsonarrayformatvisitor.itemsFormat(((com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable) (javatype)), javatype1);
	//   23   47:aload           4
	//   24   49:aload_2         
	//   25   50:aload           5
	//   26   52:invokeinterface #111 <Method void JsonArrayFormatVisitor.itemsFormat(com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable, JavaType)>
		}
	//   27   57:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj;
		TypeSerializer typeserializer;
		Boolean boolean1;
label0:
		{
			obj = ((Object) (_valueTypeSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    2    4:astore_3        
			typeserializer = ((TypeSerializer) (obj));
	//    3    5:aload_3         
	//    4    6:astore          4
			if(obj != null)
	//*   5    8:aload_3         
	//*   6    9:ifnull          19
				typeserializer = ((TypeSerializer) (obj)).forProperty(beanproperty);
	//    7   12:aload_3         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #119 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   10   17:astore          4
			boolean1 = null;
	//   11   19:aconst_null     
	//   12   20:astore          5
			if(beanproperty != null)
	//*  13   22:aload_2         
	//*  14   23:ifnull          67
			{
				obj = ((Object) (beanproperty.getMember()));
	//   15   26:aload_2         
	//   16   27:invokeinterface #125 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   17   32:astore_3        
				Object obj1 = ((Object) (serializerprovider.getAnnotationIntrospector()));
	//   18   33:aload_1         
	//   19   34:invokevirtual   #129 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//   20   37:astore          6
				if(obj != null)
	//*  21   39:aload_3         
	//*  22   40:ifnull          67
				{
					obj1 = ((AnnotationIntrospector) (obj1)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
	//   23   43:aload           6
	//   24   45:aload_3         
	//   25   46:invokevirtual   #135 <Method Object AnnotationIntrospector.findContentSerializer(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   26   49:astore          6
					if(obj1 != null)
	//*  27   51:aload           6
	//*  28   53:ifnull          67
					{
						obj = ((Object) (serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), obj1)));
	//   29   56:aload_1         
	//   30   57:aload_3         
	//   31   58:aload           6
	//   32   60:invokevirtual   #139 <Method JsonSerializer SerializerProvider.serializerInstance(com.fasterxml.jackson.databind.introspect.Annotated, Object)>
	//   33   63:astore_3        
						break label0;
	//   34   64:goto            69
					}
				}
			}
			obj = null;
	//   35   67:aconst_null     
	//   36   68:astore_3        
		}
		Object obj2 = ((Object) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:aload_2         
	//   40   72:aload_0         
	//   41   73:invokevirtual   #143 <Method Class handledType()>
	//   42   76:invokevirtual   #147 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//   43   79:astore          6
		if(obj2 != null)
	//*  44   81:aload           6
	//*  45   83:ifnull          96
			boolean1 = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj2)).getFeature(com.fasterxml.jackson.annotation.JsonFormat.Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED);
	//   46   86:aload           6
	//   47   88:getstatic       #153 <Field com.fasterxml.jackson.annotation.JsonFormat$Feature com.fasterxml.jackson.annotation.JsonFormat$Feature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//   48   91:invokevirtual   #159 <Method Boolean com.fasterxml.jackson.annotation.JsonFormat$Value.getFeature(com.fasterxml.jackson.annotation.JsonFormat$Feature)>
	//   49   94:astore          5
		obj2 = obj;
	//   50   96:aload_3         
	//   51   97:astore          6
		if(obj == null)
	//*  52   99:aload_3         
	//*  53  100:ifnonnull       109
			obj2 = ((Object) (_elementSerializer));
	//   54  103:aload_0         
	//   55  104:getfield        #42  <Field JsonSerializer _elementSerializer>
	//   56  107:astore          6
		obj2 = ((Object) (findContextualConvertingSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj2)))));
	//   57  109:aload_0         
	//   58  110:aload_1         
	//   59  111:aload_2         
	//   60  112:aload           6
	//   61  114:invokevirtual   #163 <Method JsonSerializer findContextualConvertingSerializer(SerializerProvider, BeanProperty, JsonSerializer)>
	//   62  117:astore          6
		obj = obj2;
	//   63  119:aload           6
	//   64  121:astore_3        
		if(obj2 == null)
	//*  65  122:aload           6
	//*  66  124:ifnonnull       172
		{
			JavaType javatype = _elementType;
	//   67  127:aload_0         
	//   68  128:getfield        #28  <Field JavaType _elementType>
	//   69  131:astore          7
			obj = obj2;
	//   70  133:aload           6
	//   71  135:astore_3        
			if(javatype != null)
	//*  72  136:aload           7
	//*  73  138:ifnull          172
			{
				obj = obj2;
	//   74  141:aload           6
	//   75  143:astore_3        
				if(_staticTyping)
	//*  76  144:aload_0         
	//*  77  145:getfield        #30  <Field boolean _staticTyping>
	//*  78  148:ifeq            172
				{
					obj = obj2;
	//   79  151:aload           6
	//   80  153:astore_3        
					if(!javatype.isJavaLangObject())
	//*  81  154:aload           7
	//*  82  156:invokevirtual   #169 <Method boolean JavaType.isJavaLangObject()>
	//*  83  159:ifne            172
						obj = ((Object) (serializerprovider.findValueSerializer(_elementType, beanproperty)));
	//   84  162:aload_1         
	//   85  163:aload_0         
	//   86  164:getfield        #28  <Field JavaType _elementType>
	//   87  167:aload_2         
	//   88  168:invokevirtual   #105 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   89  171:astore_3        
				}
			}
		}
		return ((JsonSerializer) (withResolved(beanproperty, typeserializer, ((JsonSerializer) (obj)), boolean1)));
	//   90  172:aload_0         
	//   91  173:aload_2         
	//   92  174:aload           4
	//   93  176:aload_3         
	//   94  177:aload           5
	//   95  179:invokevirtual   #173 <Method ObjectArraySerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   96  182:areturn         
	}

	public volatile boolean hasSingleElement(Object obj)
	{
		return hasSingleElement((Object[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Object[]>
	//    3    5:invokevirtual   #179 <Method boolean hasSingleElement(Object[])>
	//    4    8:ireturn         
	}

	public boolean hasSingleElement(Object aobj[])
	{
		return aobj.length == 1;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:iconst_1        
	//    3    3:icmpne          8
	//    4    6:iconst_1        
	//    5    7:ireturn         
	//    6    8:iconst_0        
	//    7    9:ireturn         
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (Object[])obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #23  <Class Object[]>
	//    4    6:invokevirtual   #184 <Method boolean isEmpty(SerializerProvider, Object[])>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object aobj[])
	{
		return aobj.length == 0;
	//    0    0:aload_2         
	//    1    1:arraylength     
	//    2    2:ifne            7
	//    3    5:iconst_1        
	//    4    6:ireturn         
	//    5    7:iconst_0        
	//    6    8:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Object[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Object[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #191 <Method void serialize(Object[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public final void serialize(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		if(i == 1 && (_unwrapSingle == null && serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) || _unwrapSingle == Boolean.TRUE))
	//*   3    4:iload           4
	//*   4    6:iconst_1        
	//*   5    7:icmpne          45
	//*   6   10:aload_0         
	//*   7   11:getfield        #195 <Field Boolean _unwrapSingle>
	//*   8   14:ifnonnull       27
	//*   9   17:aload_3         
	//*  10   18:getstatic       #200 <Field SerializationFeature SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED>
	//*  11   21:invokevirtual   #204 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifne            37
	//*  13   27:aload_0         
	//*  14   28:getfield        #195 <Field Boolean _unwrapSingle>
	//*  15   31:getstatic       #209 <Field Boolean Boolean.TRUE>
	//*  16   34:if_acmpne       45
		{
			serializeContents(aobj, jsongenerator, serializerprovider);
	//   17   37:aload_0         
	//   18   38:aload_1         
	//   19   39:aload_2         
	//   20   40:aload_3         
	//   21   41:invokevirtual   #212 <Method void serializeContents(Object[], JsonGenerator, SerializerProvider)>
			return;
	//   22   44:return          
		} else
		{
			jsongenerator.writeStartArray(i);
	//   23   45:aload_2         
	//   24   46:iload           4
	//   25   48:invokevirtual   #218 <Method void JsonGenerator.writeStartArray(int)>
			serializeContents(aobj, jsongenerator, serializerprovider);
	//   26   51:aload_0         
	//   27   52:aload_1         
	//   28   53:aload_2         
	//   29   54:aload_3         
	//   30   55:invokevirtual   #212 <Method void serializeContents(Object[], JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndArray();
	//   31   58:aload_2         
	//   32   59:invokevirtual   #222 <Method void JsonGenerator.writeEndArray()>
			return;
	//   33   62:return          
		}
	}

	public volatile void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serializeContents((Object[])obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #23  <Class Object[]>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #212 <Method void serializeContents(Object[], JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serializeContents(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		int j;
		int k;
		Object obj;
		k = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		if(k == 0)
	//*   3    4:iload           6
	//*   4    6:ifne            10
			return;
	//    5    9:return          
		JsonSerializer jsonserializer = _elementSerializer;
	//    6   10:aload_0         
	//    7   11:getfield        #42  <Field JsonSerializer _elementSerializer>
	//    8   14:astore          7
		if(jsonserializer != null)
	//*   9   16:aload           7
	//*  10   18:ifnull          31
		{
			serializeContentsUsing(aobj, jsongenerator, serializerprovider, jsonserializer);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:aload_3         
	//   15   25:aload           7
	//   16   27:invokevirtual   #228 <Method void serializeContentsUsing(Object[], JsonGenerator, SerializerProvider, JsonSerializer)>
			return;
	//   17   30:return          
		}
		if(_valueTypeSerializer != null)
	//*  18   31:aload_0         
	//*  19   32:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//*  20   35:ifnull          46
		{
			serializeTypedContents(aobj, jsongenerator, serializerprovider);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:aload_2         
	//   24   41:aload_3         
	//   25   42:invokevirtual   #231 <Method void serializeTypedContents(Object[], JsonGenerator, SerializerProvider)>
			return;
	//   26   45:return          
		}
		j = 0;
	//   27   46:iconst_0        
	//   28   47:istore          5
		i = 0;
	//   29   49:iconst_0        
	//   30   50:istore          4
		obj = null;
	//   31   52:aconst_null     
	//   32   53:astore          8
		PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   33   55:aload_0         
	//   34   56:getfield        #40  <Field PropertySerializerMap _dynamicSerializers>
	//   35   59:astore          11
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   36   61:iload           4
	//   37   63:iload           6
	//   38   65:icmpge          240
		Object obj1 = aobj[i];
	//   39   68:aload_1         
	//   40   69:iload           4
	//   41   71:aaload          
	//   42   72:astore          9
		if(obj1 == null)
	//*  43   74:aload           9
	//*  44   76:ifnonnull       95
		{
			j = i;
	//   45   79:iload           4
	//   46   81:istore          5
			obj = obj1;
	//   47   83:aload           9
	//   48   85:astore          8
			JsonSerializer jsonserializer1;
			JsonSerializer jsonserializer2;
			Class class1;
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   49   87:aload_3         
	//   50   88:aload_2         
	//   51   89:invokevirtual   #235 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_220;
	//   52   92:goto            220
			}
	//*  53   95:iload           4
	//*  54   97:istore          5
	//*  55   99:aload           9
	//*  56  101:astore          8
	//*  57  103:aload           9
	//*  58  105:invokevirtual   #240 <Method Class Object.getClass()>
	//*  59  108:astore          12
	//*  60  110:iload           4
	//*  61  112:istore          5
	//*  62  114:aload           9
	//*  63  116:astore          8
	//*  64  118:aload           11
	//*  65  120:aload           12
	//*  66  122:invokevirtual   #244 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  67  125:astore          10
	//*  68  127:aload           10
	//*  69  129:astore          7
	//*  70  131:aload           10
	//*  71  133:ifnonnull       203
	//*  72  136:iload           4
	//*  73  138:istore          5
	//*  74  140:aload           9
	//*  75  142:astore          8
	//*  76  144:aload_0         
	//*  77  145:getfield        #28  <Field JavaType _elementType>
	//*  78  148:invokevirtual   #247 <Method boolean JavaType.hasGenericTypes()>
	//*  79  151:ifeq            184
	//*  80  154:iload           4
	//*  81  156:istore          5
	//*  82  158:aload           9
	//*  83  160:astore          8
	//*  84  162:aload_0         
	//*  85  163:aload           11
	//*  86  165:aload_3         
	//*  87  166:aload_0         
	//*  88  167:getfield        #28  <Field JavaType _elementType>
	//*  89  170:aload           12
	//*  90  172:invokevirtual   #251 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//*  91  175:aload_3         
	//*  92  176:invokevirtual   #253 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, JavaType, SerializerProvider)>
	//*  93  179:astore          7
	//*  94  181:goto            203
	//*  95  184:iload           4
	//*  96  186:istore          5
	//*  97  188:aload           9
	//*  98  190:astore          8
	//*  99  192:aload_0         
	//* 100  193:aload           11
	//* 101  195:aload           12
	//* 102  197:aload_3         
	//* 103  198:invokevirtual   #255 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//* 104  201:astore          7
	//* 105  203:iload           4
	//* 106  205:istore          5
	//* 107  207:aload           9
	//* 108  209:astore          8
	//* 109  211:aload           7
	//* 110  213:aload           9
	//* 111  215:aload_2         
	//* 112  216:aload_3         
	//* 113  217:invokevirtual   #259 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//* 114  220:iload           4
	//* 115  222:iconst_1        
	//* 116  223:iadd            
	//* 117  224:istore          4
	//* 118  226:goto            61
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//* 119  229:astore_1        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (aobj)), obj, j);
	//  120  230:aload_0         
	//  121  231:aload_3         
	//  122  232:aload_1         
	//  123  233:aload           8
	//  124  235:iload           5
	//  125  237:invokevirtual   #263 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break; /* Loop/switch isn't completed */
		}
		j = i;
		obj = obj1;
		class1 = obj1.getClass();
		j = i;
		obj = obj1;
		jsonserializer2 = propertyserializermap.serializerFor(class1);
		jsonserializer1 = jsonserializer2;
		if(jsonserializer2 != null)
			break MISSING_BLOCK_LABEL_203;
		j = i;
		obj = obj1;
		if(!_elementType.hasGenericTypes())
			break MISSING_BLOCK_LABEL_184;
		j = i;
		obj = obj1;
		jsonserializer1 = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_elementType, class1), serializerprovider);
		break MISSING_BLOCK_LABEL_203;
		j = i;
		obj = obj1;
		jsonserializer1 = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
		j = i;
		obj = obj1;
		jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	//  126  240:return          
	}

	public void serializeContentsUsing(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
		throws IOException
	{
		int i;
		int j;
		TypeSerializer typeserializer;
		j = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		typeserializer = _valueTypeSerializer;
	//    3    4:aload_0         
	//    4    5:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    5    8:astore          8
		i = 0;
	//    6   10:iconst_0        
	//    7   11:istore          5
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//    8   13:iload           5
	//    9   15:iload           6
	//   10   17:icmpge          87
		Object obj = aobj[i];
	//   11   20:aload_1         
	//   12   21:iload           5
	//   13   23:aaload          
	//   14   24:astore          7
		if(obj == null)
	//*  15   26:aload           7
	//*  16   28:ifnonnull       39
		{
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   17   31:aload_3         
	//   18   32:aload_2         
	//   19   33:invokevirtual   #235 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_67;
	//   20   36:goto            67
			}
	//*  21   39:aload           8
	//*  22   41:ifnonnull       56
	//*  23   44:aload           4
	//*  24   46:aload           7
	//*  25   48:aload_2         
	//*  26   49:aload_3         
	//*  27   50:invokevirtual   #259 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  28   53:goto            67
	//*  29   56:aload           4
	//*  30   58:aload           7
	//*  31   60:aload_2         
	//*  32   61:aload_3         
	//*  33   62:aload           8
	//*  34   64:invokevirtual   #267 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  35   67:iload           5
	//*  36   69:iconst_1        
	//*  37   70:iadd            
	//*  38   71:istore          5
	//*  39   73:goto            13
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//*  40   76:astore_1        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (aobj)), obj, i);
	//   41   77:aload_0         
	//   42   78:aload_3         
	//   43   79:aload_1         
	//   44   80:aload           7
	//   45   82:iload           5
	//   46   84:invokevirtual   #263 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break; /* Loop/switch isn't completed */
		}
		if(typeserializer != null)
			break MISSING_BLOCK_LABEL_56;
		jsonserializer.serialize(obj, jsongenerator, serializerprovider);
		break MISSING_BLOCK_LABEL_67;
		jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	//   47   87:return          
	}

	public void serializeTypedContents(Object aobj[], JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		int i;
		int j;
		int k;
		Object obj;
		TypeSerializer typeserializer;
		k = aobj.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          6
		typeserializer = _valueTypeSerializer;
	//    3    4:aload_0         
	//    4    5:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//    5    8:astore          11
		j = 0;
	//    6   10:iconst_0        
	//    7   11:istore          5
		i = 0;
	//    8   13:iconst_0        
	//    9   14:istore          4
		obj = null;
	//   10   16:aconst_null     
	//   11   17:astore          7
		PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   12   19:aload_0         
	//   13   20:getfield        #40  <Field PropertySerializerMap _dynamicSerializers>
	//   14   23:astore          12
_L2:
		if(i >= k)
			break; /* Loop/switch isn't completed */
	//   15   25:iload           4
	//   16   27:iload           6
	//   17   29:icmpge          158
		Object obj1 = aobj[i];
	//   18   32:aload_1         
	//   19   33:iload           4
	//   20   35:aaload          
	//   21   36:astore          9
		if(obj1 == null)
	//*  22   38:aload           9
	//*  23   40:ifnonnull       59
		{
			j = i;
	//   24   43:iload           4
	//   25   45:istore          5
			obj = obj1;
	//   26   47:aload           9
	//   27   49:astore          7
			JsonSerializer jsonserializer;
			JsonSerializer jsonserializer1;
			Class class1;
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//   28   51:aload_3         
	//   29   52:aload_2         
	//   30   53:invokevirtual   #235 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				break MISSING_BLOCK_LABEL_138;
	//   31   56:goto            138
			}
	//*  32   59:iload           4
	//*  33   61:istore          5
	//*  34   63:aload           9
	//*  35   65:astore          7
	//*  36   67:aload           9
	//*  37   69:invokevirtual   #240 <Method Class Object.getClass()>
	//*  38   72:astore          13
	//*  39   74:iload           4
	//*  40   76:istore          5
	//*  41   78:aload           9
	//*  42   80:astore          7
	//*  43   82:aload           12
	//*  44   84:aload           13
	//*  45   86:invokevirtual   #244 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//*  46   89:astore          10
	//*  47   91:aload           10
	//*  48   93:astore          8
	//*  49   95:aload           10
	//*  50   97:ifnonnull       119
	//*  51  100:iload           4
	//*  52  102:istore          5
	//*  53  104:aload           9
	//*  54  106:astore          7
	//*  55  108:aload_0         
	//*  56  109:aload           12
	//*  57  111:aload           13
	//*  58  113:aload_3         
	//*  59  114:invokevirtual   #255 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//*  60  117:astore          8
	//*  61  119:iload           4
	//*  62  121:istore          5
	//*  63  123:aload           9
	//*  64  125:astore          7
	//*  65  127:aload           8
	//*  66  129:aload           9
	//*  67  131:aload_2         
	//*  68  132:aload_3         
	//*  69  133:aload           11
	//*  70  135:invokevirtual   #267 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  71  138:iload           4
	//*  72  140:iconst_1        
	//*  73  141:iadd            
	//*  74  142:istore          4
	//*  75  144:goto            25
			// Misplaced declaration of an exception variable
			catch(Object aobj[])
	//*  76  147:astore_1        
			{
				wrapAndThrow(serializerprovider, ((Throwable) (aobj)), obj, j);
	//   77  148:aload_0         
	//   78  149:aload_3         
	//   79  150:aload_1         
	//   80  151:aload           7
	//   81  153:iload           5
	//   82  155:invokevirtual   #263 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, int)>
			}
			break; /* Loop/switch isn't completed */
		}
		j = i;
		obj = obj1;
		class1 = obj1.getClass();
		j = i;
		obj = obj1;
		jsonserializer1 = propertyserializermap.serializerFor(class1);
		jsonserializer = jsonserializer1;
		if(jsonserializer1 != null)
			break MISSING_BLOCK_LABEL_119;
		j = i;
		obj = obj1;
		jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
		j = i;
		obj = obj1;
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
		i++;
		if(true) goto _L2; else goto _L1
_L1:
	//   83  158:return          
	}

	public ObjectArraySerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, Boolean boolean1)
	{
		if(_property == beanproperty && jsonserializer == _elementSerializer && _valueTypeSerializer == typeserializer && _unwrapSingle == boolean1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       35
	//*   4    8:aload_3         
	//*   5    9:aload_0         
	//*   6   10:getfield        #42  <Field JsonSerializer _elementSerializer>
	//*   7   13:if_acmpne       35
	//*   8   16:aload_0         
	//*   9   17:getfield        #32  <Field TypeSerializer _valueTypeSerializer>
	//*  10   20:aload_2         
	//*  11   21:if_acmpne       35
	//*  12   24:aload_0         
	//*  13   25:getfield        #195 <Field Boolean _unwrapSingle>
	//*  14   28:aload           4
	//*  15   30:if_acmpne       35
			return this;
	//   16   33:aload_0         
	//   17   34:areturn         
		else
			return new ObjectArraySerializer(this, beanproperty, typeserializer, jsonserializer, boolean1);
	//   18   35:new             #2   <Class ObjectArraySerializer>
	//   19   38:dup             
	//   20   39:aload_0         
	//   21   40:aload_1         
	//   22   41:aload_2         
	//   23   42:aload_3         
	//   24   43:aload           4
	//   25   45:invokespecial   #81  <Method void ObjectArraySerializer(ObjectArraySerializer, BeanProperty, TypeSerializer, JsonSerializer, Boolean)>
	//   26   48:areturn         
	}

	protected PropertySerializerMap _dynamicSerializers;
	protected JsonSerializer _elementSerializer;
	protected final JavaType _elementType;
	protected final boolean _staticTyping;
	protected final TypeSerializer _valueTypeSerializer;
}
