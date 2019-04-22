// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.ReferenceType;
import com.fasterxml.jackson.databind.util.*;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public abstract class ReferenceTypeSerializer extends StdSerializer
	implements ContextualSerializer
{

	protected ReferenceTypeSerializer(ReferenceTypeSerializer referencetypeserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, NameTransformer nametransformer, Object obj, boolean flag)
	{
		super(((StdSerializer) (referencetypeserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #47  <Method void StdSerializer(StdSerializer)>
		_referredType = referencetypeserializer._referredType;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #49  <Field JavaType _referredType>
	//    6   10:putfield        #49  <Field JavaType _referredType>
		_dynamicSerializers = referencetypeserializer._dynamicSerializers;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #51  <Field PropertySerializerMap _dynamicSerializers>
	//   10   18:putfield        #51  <Field PropertySerializerMap _dynamicSerializers>
		_property = beanproperty;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #53  <Field BeanProperty _property>
		_valueTypeSerializer = typeserializer;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #55  <Field TypeSerializer _valueTypeSerializer>
		_valueSerializer = jsonserializer;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #57  <Field JsonSerializer _valueSerializer>
		_unwrapper = nametransformer;
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:putfield        #59  <Field NameTransformer _unwrapper>
		_suppressableValue = obj;
	//   23   43:aload_0         
	//   24   44:aload           6
	//   25   46:putfield        #61  <Field Object _suppressableValue>
		_suppressNulls = flag;
	//   26   49:aload_0         
	//   27   50:iload           7
	//   28   52:putfield        #63  <Field boolean _suppressNulls>
	//   29   55:return          
	}

	public ReferenceTypeSerializer(ReferenceType referencetype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		super(((JavaType) (referencetype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #69  <Method void StdSerializer(JavaType)>
		_referredType = referencetype.getReferencedType();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #75  <Method JavaType ReferenceType.getReferencedType()>
	//    6   10:putfield        #49  <Field JavaType _referredType>
		_property = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #53  <Field BeanProperty _property>
		_valueTypeSerializer = typeserializer;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #55  <Field TypeSerializer _valueTypeSerializer>
		_valueSerializer = jsonserializer;
	//   13   23:aload_0         
	//   14   24:aload           4
	//   15   26:putfield        #57  <Field JsonSerializer _valueSerializer>
		_unwrapper = null;
	//   16   29:aload_0         
	//   17   30:aconst_null     
	//   18   31:putfield        #59  <Field NameTransformer _unwrapper>
		_suppressableValue = null;
	//   19   34:aload_0         
	//   20   35:aconst_null     
	//   21   36:putfield        #61  <Field Object _suppressableValue>
		_suppressNulls = false;
	//   22   39:aload_0         
	//   23   40:iconst_0        
	//   24   41:putfield        #63  <Field boolean _suppressNulls>
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   25   44:aload_0         
	//   26   45:invokestatic    #81  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   27   48:putfield        #51  <Field PropertySerializerMap _dynamicSerializers>
	//   28   51:return          
	}

	private final JsonSerializer _findCachedSerializer(SerializerProvider serializerprovider, Class class1)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _dynamicSerializers.serializerFor(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field PropertySerializerMap _dynamicSerializers>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #90  <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//    4    8:astore          4
		Object obj = ((Object) (jsonserializer));
	//    5   10:aload           4
	//    6   12:astore_3        
		if(jsonserializer == null)
	//*   7   13:aload           4
	//*   8   15:ifnonnull       92
		{
			if(_referredType.hasGenericTypes())
	//*   9   18:aload_0         
	//*  10   19:getfield        #49  <Field JavaType _referredType>
	//*  11   22:invokevirtual   #96  <Method boolean JavaType.hasGenericTypes()>
	//*  12   25:ifeq            49
				serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(serializerprovider.constructSpecializedType(_referredType, class1), _property)));
	//   13   28:aload_1         
	//   14   29:aload_1         
	//   15   30:aload_0         
	//   16   31:getfield        #49  <Field JavaType _referredType>
	//   17   34:aload_2         
	//   18   35:invokevirtual   #102 <Method JavaType SerializerProvider.constructSpecializedType(JavaType, Class)>
	//   19   38:aload_0         
	//   20   39:getfield        #53  <Field BeanProperty _property>
	//   21   42:invokevirtual   #106 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//   22   45:astore_1        
			else
	//*  23   46:goto            59
				serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(class1, _property)));
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:aload_0         
	//   27   52:getfield        #53  <Field BeanProperty _property>
	//   28   55:invokevirtual   #109 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//   29   58:astore_1        
			obj = ((Object) (_unwrapper));
	//   30   59:aload_0         
	//   31   60:getfield        #59  <Field NameTransformer _unwrapper>
	//   32   63:astore_3        
			if(obj != null)
	//*  33   64:aload_3         
	//*  34   65:ifnull          77
				serializerprovider = ((SerializerProvider) (((JsonSerializer) (serializerprovider)).unwrappingSerializer(((NameTransformer) (obj)))));
	//   35   68:aload_1         
	//   36   69:aload_3         
	//   37   70:invokevirtual   #115 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   38   73:astore_1        
	//*  39   74:goto            77
			_dynamicSerializers = _dynamicSerializers.newWith(class1, ((JsonSerializer) (serializerprovider)));
	//   40   77:aload_0         
	//   41   78:aload_0         
	//   42   79:getfield        #51  <Field PropertySerializerMap _dynamicSerializers>
	//   43   82:aload_2         
	//   44   83:aload_1         
	//   45   84:invokevirtual   #119 <Method PropertySerializerMap PropertySerializerMap.newWith(Class, JsonSerializer)>
	//   46   87:putfield        #51  <Field PropertySerializerMap _dynamicSerializers>
			obj = ((Object) (serializerprovider));
	//   47   90:aload_1         
	//   48   91:astore_3        
		}
		return ((JsonSerializer) (obj));
	//   49   92:aload_3         
	//   50   93:areturn         
	}

	private final JsonSerializer _findSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return serializerprovider.findValueSerializer(javatype, beanproperty);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #106 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//    4    6:areturn         
	}

	protected abstract Object _getReferenced(Object obj);

	protected abstract Object _getReferencedIfPresent(Object obj);

	protected abstract boolean _isValuePresent(Object obj);

	protected boolean _useStatic(SerializerProvider serializerprovider, BeanProperty beanproperty, JavaType javatype)
	{
		if(javatype.isJavaLangObject())
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #134 <Method boolean JavaType.isJavaLangObject()>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(javatype.isFinal())
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #137 <Method boolean JavaType.isFinal()>
	//*   7   13:ifeq            18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(javatype.useStaticType())
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #140 <Method boolean JavaType.useStaticType()>
	//*  12   22:ifeq            27
			return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		javatype = ((JavaType) (serializerprovider.getAnnotationIntrospector()));
	//   15   27:aload_1         
	//   16   28:invokevirtual   #144 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//   17   31:astore_3        
		if(javatype != null && beanproperty != null && beanproperty.getMember() != null)
	//*  18   32:aload_3         
	//*  19   33:ifnull          78
	//*  20   36:aload_2         
	//*  21   37:ifnull          78
	//*  22   40:aload_2         
	//*  23   41:invokeinterface #150 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//*  24   46:ifnull          78
		{
			beanproperty = ((BeanProperty) (((AnnotationIntrospector) (javatype)).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty.getMember())))));
	//   25   49:aload_3         
	//   26   50:aload_2         
	//   27   51:invokeinterface #150 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   28   56:invokevirtual   #156 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   29   59:astore_2        
			if(beanproperty == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
	//*  30   60:aload_2         
	//*  31   61:getstatic       #162 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.STATIC>
	//*  32   64:if_acmpne       69
				return true;
	//   33   67:iconst_1        
	//   34   68:ireturn         
			if(beanproperty == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DYNAMIC)
	//*  35   69:aload_2         
	//*  36   70:getstatic       #165 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.DYNAMIC>
	//*  37   73:if_acmpne       78
				return false;
	//   38   76:iconst_0        
	//   39   77:ireturn         
		}
		return serializerprovider.isEnabled(MapperFeature.USE_STATIC_TYPING);
	//   40   78:aload_1         
	//   41   79:getstatic       #171 <Field MapperFeature MapperFeature.USE_STATIC_TYPING>
	//   42   82:invokevirtual   #175 <Method boolean SerializerProvider.isEnabled(MapperFeature)>
	//   43   85:ireturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _valueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JsonSerializer _valueSerializer>
	//    2    4:astore_3        
		javatype = ((JavaType) (jsonserializer));
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(jsonserializer == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       50
		{
			JsonSerializer jsonserializer1 = _findSerializer(jsonformatvisitorwrapper.getProvider(), _referredType, _property);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokeinterface #183 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   10   18:aload_0         
	//   11   19:getfield        #49  <Field JavaType _referredType>
	//   12   22:aload_0         
	//   13   23:getfield        #53  <Field BeanProperty _property>
	//   14   26:invokespecial   #185 <Method JsonSerializer _findSerializer(SerializerProvider, JavaType, BeanProperty)>
	//   15   29:astore_3        
			NameTransformer nametransformer = _unwrapper;
	//   16   30:aload_0         
	//   17   31:getfield        #59  <Field NameTransformer _unwrapper>
	//   18   34:astore          4
			javatype = ((JavaType) (jsonserializer1));
	//   19   36:aload_3         
	//   20   37:astore_2        
			if(nametransformer != null)
	//*  21   38:aload           4
	//*  22   40:ifnull          50
				javatype = ((JavaType) (jsonserializer1.unwrappingSerializer(nametransformer)));
	//   23   43:aload_3         
	//   24   44:aload           4
	//   25   46:invokevirtual   #115 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   26   49:astore_2        
		}
		((JsonSerializer) (javatype)).acceptJsonFormatVisitor(jsonformatvisitorwrapper, _referredType);
	//   27   50:aload_2         
	//   28   51:aload_1         
	//   29   52:aload_0         
	//   30   53:getfield        #49  <Field JavaType _referredType>
	//   31   56:invokevirtual   #187 <Method void JsonSerializer.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//   32   59:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj1;
label0:
		{
			Object obj = ((Object) (_valueTypeSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field TypeSerializer _valueTypeSerializer>
	//    2    4:astore          6
			obj1 = obj;
	//    3    6:aload           6
	//    4    8:astore          7
			if(obj != null)
	//*   5   10:aload           6
	//*   6   12:ifnull          23
				obj1 = ((Object) (((TypeSerializer) (obj)).forProperty(beanproperty)));
	//    7   15:aload           6
	//    8   17:aload_2         
	//    9   18:invokevirtual   #195 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   10   21:astore          7
			Object obj2 = ((Object) (findAnnotatedContentSerializer(serializerprovider, beanproperty)));
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:aload_2         
	//   14   26:invokevirtual   #198 <Method JsonSerializer findAnnotatedContentSerializer(SerializerProvider, BeanProperty)>
	//   15   29:astore          8
			obj = obj2;
	//   16   31:aload           8
	//   17   33:astore          6
			if(obj2 == null)
	//*  18   35:aload           8
	//*  19   37:ifnonnull       88
			{
				obj = ((Object) (_valueSerializer));
	//   20   40:aload_0         
	//   21   41:getfield        #57  <Field JsonSerializer _valueSerializer>
	//   22   44:astore          6
				if(obj == null)
	//*  23   46:aload           6
	//*  24   48:ifnonnull       79
				{
					if(_useStatic(serializerprovider, beanproperty, _referredType))
	//*  25   51:aload_0         
	//*  26   52:aload_1         
	//*  27   53:aload_2         
	//*  28   54:aload_0         
	//*  29   55:getfield        #49  <Field JavaType _referredType>
	//*  30   58:invokevirtual   #200 <Method boolean _useStatic(SerializerProvider, BeanProperty, JavaType)>
	//*  31   61:ifeq            88
						obj = ((Object) (_findSerializer(serializerprovider, _referredType, beanproperty)));
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:aload_0         
	//   35   67:getfield        #49  <Field JavaType _referredType>
	//   36   70:aload_2         
	//   37   71:invokespecial   #185 <Method JsonSerializer _findSerializer(SerializerProvider, JavaType, BeanProperty)>
	//   38   74:astore          6
				} else
	//*  39   76:goto            88
				{
					obj = ((Object) (serializerprovider.handlePrimaryContextualization(((JsonSerializer) (obj)), beanproperty)));
	//   40   79:aload_1         
	//   41   80:aload           6
	//   42   82:aload_2         
	//   43   83:invokevirtual   #204 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   44   86:astore          6
				}
			}
			if(_property == beanproperty && _valueTypeSerializer == obj1 && _valueSerializer == obj)
	//*  45   88:aload_0         
	//*  46   89:getfield        #53  <Field BeanProperty _property>
	//*  47   92:aload_2         
	//*  48   93:if_acmpne       120
	//*  49   96:aload_0         
	//*  50   97:getfield        #55  <Field TypeSerializer _valueTypeSerializer>
	//*  51  100:aload           7
	//*  52  102:if_acmpne       120
	//*  53  105:aload_0         
	//*  54  106:getfield        #57  <Field JsonSerializer _valueSerializer>
	//*  55  109:aload           6
	//*  56  111:if_acmpne       120
				obj = ((Object) (this));
	//   57  114:aload_0         
	//   58  115:astore          6
			else
	//*  59  117:goto            135
				obj = ((Object) (withResolved(beanproperty, ((TypeSerializer) (obj1)), ((JsonSerializer) (obj)), _unwrapper)));
	//   60  120:aload_0         
	//   61  121:aload_2         
	//   62  122:aload           7
	//   63  124:aload           6
	//   64  126:aload_0         
	//   65  127:getfield        #59  <Field NameTransformer _unwrapper>
	//   66  130:invokevirtual   #208 <Method ReferenceTypeSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, NameTransformer)>
	//   67  133:astore          6
			obj1 = obj;
	//   68  135:aload           6
	//   69  137:astore          7
			if(beanproperty == null)
				break label0;
	//   70  139:aload_2         
	//   71  140:ifnull          398
			obj2 = ((Object) (beanproperty.findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), handledType())));
	//   72  143:aload_2         
	//   73  144:aload_1         
	//   74  145:invokevirtual   #212 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//   75  148:aload_0         
	//   76  149:invokevirtual   #216 <Method Class handledType()>
	//   77  152:invokeinterface #220 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanProperty.findPropertyInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//   78  157:astore          8
			obj1 = obj;
	//   79  159:aload           6
	//   80  161:astore          7
			if(obj2 == null)
				break label0;
	//   81  163:aload           8
	//   82  165:ifnull          398
			beanproperty = ((BeanProperty) (((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj2)).getContentInclusion()));
	//   83  168:aload           8
	//   84  170:invokevirtual   #226 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//   85  173:astore_2        
			obj1 = obj;
	//   86  174:aload           6
	//   87  176:astore          7
			if(beanproperty == com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
				break label0;
	//   88  178:aload_2         
	//   89  179:getstatic       #229 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//   90  182:if_acmpeq       398
			static class _cls1
			{

				static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[com.fasterxml.jackson.annotation.JsonInclude.Include.values().length];
				//    0    0:invokestatic    #18  <Method com.fasterxml.jackson.annotation.JsonInclude$Include[] com.fasterxml.jackson.annotation.JsonInclude$Include.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//    5   12:getstatic       #24  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_DEFAULT>
				//    6   15:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  10   23:getstatic       #31  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_ABSENT>
				//*  11   26:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  15   34:getstatic       #34  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
				//*  16   37:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  20   45:getstatic       #37  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.CUSTOM>
				//*  21   48:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  25   56:getstatic       #40  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
				//*  26   59:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
				//*  30   67:getstatic       #43  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
				//*  31   70:invokevirtual   #28  <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
				//*  32   73:bipush          6
				//*  33   75:iastore         
				//*  34   76:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   35   77:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_ABSENT.ordinal()] = 2;
					}
				//*  36   78:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   37   81:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY.ordinal()] = 3;
					}
				//*  38   82:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   39   85:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.CUSTOM.ordinal()] = 4;
					}
				//*  40   86:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//   41   89:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL.ordinal()] = 5;
					}
				//*  42   90:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//   43   93:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS.ordinal()] = 6;
					}
				//*  44   94:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//   45   97:astore_0        
				//*  46   98:return          
				}
			}

			int i = _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (beanproperty)).ordinal()];
	//   91  185:getstatic       #233 <Field int[] ReferenceTypeSerializer$1.$SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include>
	//   92  188:aload_2         
	//   93  189:invokevirtual   #237 <Method int com.fasterxml.jackson.annotation.JsonInclude$Include.ordinal()>
	//   94  192:iaload          
	//   95  193:istore_3        
			obj1 = null;
	//   96  194:aconst_null     
	//   97  195:astore          7
			boolean flag1 = true;
	//   98  197:iconst_1        
	//   99  198:istore          5
			beanproperty = ((BeanProperty) (obj1));
	//  100  200:aload           7
	//  101  202:astore_2        
			boolean flag = flag1;
	//  102  203:iload           5
	//  103  205:istore          4
			switch(i)
	//* 104  207:iload_3         
			{
	//* 105  208:tableswitch     1 5: default 244
	//	               1 324
	//	               2 296
	//	               3 285
	//	               4 253
	//	               5 367
			default:
				flag = false;
	//  106  244:iconst_0        
	//  107  245:istore          4
				beanproperty = ((BeanProperty) (obj1));
	//  108  247:aload           7
	//  109  249:astore_2        
				break;

	//* 110  250:goto            367
			case 4: // '\004'
				beanproperty = ((BeanProperty) (serializerprovider.includeFilterInstance(((com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition) (null)), ((com.fasterxml.jackson.annotation.JsonInclude.Value) (obj2)).getContentFilter())));
	//  111  253:aload_1         
	//  112  254:aconst_null     
	//  113  255:aload           8
	//  114  257:invokevirtual   #240 <Method Class com.fasterxml.jackson.annotation.JsonInclude$Value.getContentFilter()>
	//  115  260:invokevirtual   #244 <Method Object SerializerProvider.includeFilterInstance(com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition, Class)>
	//  116  263:astore_2        
				if(beanproperty == null)
	//* 117  264:aload_2         
	//* 118  265:ifnonnull       275
					flag = flag1;
	//  119  268:iload           5
	//  120  270:istore          4
				else
	//* 121  272:goto            367
					flag = serializerprovider.includeFilterSuppressNulls(((Object) (beanproperty)));
	//  122  275:aload_1         
	//  123  276:aload_2         
	//  124  277:invokevirtual   #247 <Method boolean SerializerProvider.includeFilterSuppressNulls(Object)>
	//  125  280:istore          4
				break;

	//* 126  282:goto            367
			case 3: // '\003'
				beanproperty = ((BeanProperty) (MARKER_FOR_EMPTY));
	//  127  285:getstatic       #41  <Field Object MARKER_FOR_EMPTY>
	//  128  288:astore_2        
				flag = flag1;
	//  129  289:iload           5
	//  130  291:istore          4
				break;

	//* 131  293:goto            367
			case 2: // '\002'
				beanproperty = ((BeanProperty) (obj1));
	//  132  296:aload           7
	//  133  298:astore_2        
				flag = flag1;
	//  134  299:iload           5
	//  135  301:istore          4
				if(_referredType.isReferenceType())
	//* 136  303:aload_0         
	//* 137  304:getfield        #49  <Field JavaType _referredType>
	//* 138  307:invokevirtual   #250 <Method boolean JavaType.isReferenceType()>
	//* 139  310:ifeq            367
				{
					beanproperty = ((BeanProperty) (MARKER_FOR_EMPTY));
	//  140  313:getstatic       #41  <Field Object MARKER_FOR_EMPTY>
	//  141  316:astore_2        
					flag = flag1;
	//  142  317:iload           5
	//  143  319:istore          4
				}
				break;

	//* 144  321:goto            367
			case 1: // '\001'
				serializerprovider = ((SerializerProvider) (BeanUtil.getDefaultValue(_referredType)));
	//  145  324:aload_0         
	//  146  325:getfield        #49  <Field JavaType _referredType>
	//  147  328:invokestatic    #256 <Method Object BeanUtil.getDefaultValue(JavaType)>
	//  148  331:astore_1        
				beanproperty = ((BeanProperty) (serializerprovider));
	//  149  332:aload_1         
	//  150  333:astore_2        
				flag = flag1;
	//  151  334:iload           5
	//  152  336:istore          4
				if(serializerprovider != null)
	//* 153  338:aload_1         
	//* 154  339:ifnull          367
				{
					beanproperty = ((BeanProperty) (serializerprovider));
	//  155  342:aload_1         
	//  156  343:astore_2        
					flag = flag1;
	//  157  344:iload           5
	//  158  346:istore          4
					if(((Object) (serializerprovider)).getClass().isArray())
	//* 159  348:aload_1         
	//* 160  349:invokevirtual   #261 <Method Class Object.getClass()>
	//* 161  352:invokevirtual   #266 <Method boolean Class.isArray()>
	//* 162  355:ifeq            367
					{
						beanproperty = ((BeanProperty) (ArrayBuilders.getArrayComparator(((Object) (serializerprovider)))));
	//  163  358:aload_1         
	//  164  359:invokestatic    #271 <Method Object ArrayBuilders.getArrayComparator(Object)>
	//  165  362:astore_2        
						flag = flag1;
	//  166  363:iload           5
	//  167  365:istore          4
					}
				}
				break;

			case 5: // '\005'
				break;
			}
			if(_suppressableValue == beanproperty)
	//* 168  367:aload_0         
	//* 169  368:getfield        #61  <Field Object _suppressableValue>
	//* 170  371:aload_2         
	//* 171  372:if_acmpne       388
			{
				obj1 = obj;
	//  172  375:aload           6
	//  173  377:astore          7
				if(_suppressNulls == flag)
					break label0;
	//  174  379:aload_0         
	//  175  380:getfield        #63  <Field boolean _suppressNulls>
	//  176  383:iload           4
	//  177  385:icmpeq          398
			}
			obj1 = ((Object) (((ReferenceTypeSerializer) (obj)).withContentInclusion(((Object) (beanproperty)), flag)));
	//  178  388:aload           6
	//  179  390:aload_2         
	//  180  391:iload           4
	//  181  393:invokevirtual   #275 <Method ReferenceTypeSerializer withContentInclusion(Object, boolean)>
	//  182  396:astore          7
		}
		return ((JsonSerializer) (obj1));
	//  183  398:aload           7
	//  184  400:areturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		if(!_isValuePresent(obj))
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokevirtual   #280 <Method boolean _isValuePresent(Object)>
	//*   3    5:ifne            10
			return true;
	//    4    8:iconst_1        
	//    5    9:ireturn         
		Object obj2 = _getReferenced(obj);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #282 <Method Object _getReferenced(Object)>
	//    9   15:astore          4
		if(obj2 == null)
	//*  10   17:aload           4
	//*  11   19:ifnonnull       27
			return _suppressNulls;
	//   12   22:aload_0         
	//   13   23:getfield        #63  <Field boolean _suppressNulls>
	//   14   26:ireturn         
		if(_suppressableValue == null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #61  <Field Object _suppressableValue>
	//*  17   31:ifnonnull       36
			return false;
	//   18   34:iconst_0        
	//   19   35:ireturn         
		Object obj1 = ((Object) (_valueSerializer));
	//   20   36:aload_0         
	//   21   37:getfield        #57  <Field JsonSerializer _valueSerializer>
	//   22   40:astore_3        
		obj = obj1;
	//   23   41:aload_3         
	//   24   42:astore_2        
		if(obj1 == null)
	//*  25   43:aload_3         
	//*  26   44:ifnonnull       71
			try
			{
				obj = ((Object) (_findCachedSerializer(serializerprovider, obj2.getClass())));
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:aload           4
	//   30   51:invokevirtual   #261 <Method Class Object.getClass()>
	//   31   54:invokespecial   #284 <Method JsonSerializer _findCachedSerializer(SerializerProvider, Class)>
	//   32   57:astore_2        
			}
	//*  33   58:goto            71
			// Misplaced declaration of an exception variable
			catch(SerializerProvider serializerprovider)
	//*  34   61:astore_1        
			{
				throw new RuntimeJsonMappingException(((JsonMappingException) (serializerprovider)));
	//   35   62:new             #286 <Class RuntimeJsonMappingException>
	//   36   65:dup             
	//   37   66:aload_1         
	//   38   67:invokespecial   #289 <Method void RuntimeJsonMappingException(JsonMappingException)>
	//   39   70:athrow          
			}
		obj1 = _suppressableValue;
	//   40   71:aload_0         
	//   41   72:getfield        #61  <Field Object _suppressableValue>
	//   42   75:astore_3        
		if(obj1 == MARKER_FOR_EMPTY)
	//*  43   76:aload_3         
	//*  44   77:getstatic       #41  <Field Object MARKER_FOR_EMPTY>
	//*  45   80:if_acmpne       91
			return ((JsonSerializer) (obj)).isEmpty(serializerprovider, obj2);
	//   46   83:aload_2         
	//   47   84:aload_1         
	//   48   85:aload           4
	//   49   87:invokevirtual   #291 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//   50   90:ireturn         
		else
			return obj1.equals(obj2);
	//   51   91:aload_3         
	//   52   92:aload           4
	//   53   94:invokevirtual   #294 <Method boolean Object.equals(Object)>
	//   54   97:ireturn         
	}

	public boolean isUnwrappingSerializer()
	{
		return _unwrapper != null;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field NameTransformer _unwrapper>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj2 = _getReferencedIfPresent(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #302 <Method Object _getReferencedIfPresent(Object)>
	//    3    5:astore          5
		if(obj2 == null)
	//*   4    7:aload           5
	//*   5    9:ifnonnull       25
		{
			if(_unwrapper == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #59  <Field NameTransformer _unwrapper>
	//*   8   16:ifnonnull       24
				serializerprovider.defaultSerializeNull(jsongenerator);
	//    9   19:aload_3         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #306 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			return;
	//   12   24:return          
		}
		Object obj1 = ((Object) (_valueSerializer));
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field JsonSerializer _valueSerializer>
	//   15   29:astore          4
		obj = obj1;
	//   16   31:aload           4
	//   17   33:astore_1        
		if(obj1 == null)
	//*  18   34:aload           4
	//*  19   36:ifnonnull       50
			obj = ((Object) (_findCachedSerializer(serializerprovider, obj2.getClass())));
	//   20   39:aload_0         
	//   21   40:aload_3         
	//   22   41:aload           5
	//   23   43:invokevirtual   #261 <Method Class Object.getClass()>
	//   24   46:invokespecial   #284 <Method JsonSerializer _findCachedSerializer(SerializerProvider, Class)>
	//   25   49:astore_1        
		obj1 = ((Object) (_valueTypeSerializer));
	//   26   50:aload_0         
	//   27   51:getfield        #55  <Field TypeSerializer _valueTypeSerializer>
	//   28   54:astore          4
		if(obj1 != null)
	//*  29   56:aload           4
	//*  30   58:ifnull          72
		{
			((JsonSerializer) (obj)).serializeWithType(obj2, jsongenerator, serializerprovider, ((TypeSerializer) (obj1)));
	//   31   61:aload_1         
	//   32   62:aload           5
	//   33   64:aload_2         
	//   34   65:aload_3         
	//   35   66:aload           4
	//   36   68:invokevirtual   #310 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   37   71:return          
		} else
		{
			((JsonSerializer) (obj)).serialize(obj2, jsongenerator, serializerprovider);
	//   38   72:aload_1         
	//   39   73:aload           5
	//   40   75:aload_2         
	//   41   76:aload_3         
	//   42   77:invokevirtual   #312 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   43   80:return          
		}
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		Object obj1 = _getReferencedIfPresent(obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #302 <Method Object _getReferencedIfPresent(Object)>
	//    3    5:astore          6
		if(obj1 == null)
	//*   4    7:aload           6
	//*   5    9:ifnonnull       25
		{
			if(_unwrapper == null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #59  <Field NameTransformer _unwrapper>
	//*   8   16:ifnonnull       24
				serializerprovider.defaultSerializeNull(jsongenerator);
	//    9   19:aload_3         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #306 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			return;
	//   12   24:return          
		}
		JsonSerializer jsonserializer = _valueSerializer;
	//   13   25:aload_0         
	//   14   26:getfield        #57  <Field JsonSerializer _valueSerializer>
	//   15   29:astore          5
		obj = ((Object) (jsonserializer));
	//   16   31:aload           5
	//   17   33:astore_1        
		if(jsonserializer == null)
	//*  18   34:aload           5
	//*  19   36:ifnonnull       50
			obj = ((Object) (_findCachedSerializer(serializerprovider, obj1.getClass())));
	//   20   39:aload_0         
	//   21   40:aload_3         
	//   22   41:aload           6
	//   23   43:invokevirtual   #261 <Method Class Object.getClass()>
	//   24   46:invokespecial   #284 <Method JsonSerializer _findCachedSerializer(SerializerProvider, Class)>
	//   25   49:astore_1        
		((JsonSerializer) (obj)).serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
	//   26   50:aload_1         
	//   27   51:aload           6
	//   28   53:aload_2         
	//   29   54:aload_3         
	//   30   55:aload           4
	//   31   57:invokevirtual   #310 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//   32   60:return          
	}

	public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
	{
		Object obj = ((Object) (_valueSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field JsonSerializer _valueSerializer>
	//    2    4:astore_3        
		JsonSerializer jsonserializer = ((JsonSerializer) (obj));
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(obj != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          17
			jsonserializer = ((JsonSerializer) (obj)).unwrappingSerializer(nametransformer);
	//    7   11:aload_3         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #115 <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   10   16:astore_2        
		obj = ((Object) (_unwrapper));
	//   11   17:aload_0         
	//   12   18:getfield        #59  <Field NameTransformer _unwrapper>
	//   13   21:astore_3        
		if(obj != null)
	//*  14   22:aload_3         
	//*  15   23:ifnonnull       29
	//*  16   26:goto            35
			nametransformer = NameTransformer.chainedTransformer(nametransformer, ((NameTransformer) (obj)));
	//   17   29:aload_1         
	//   18   30:aload_3         
	//   19   31:invokestatic    #320 <Method NameTransformer NameTransformer.chainedTransformer(NameTransformer, NameTransformer)>
	//   20   34:astore_1        
		if(_valueSerializer == jsonserializer && _unwrapper == nametransformer)
	//*  21   35:aload_0         
	//*  22   36:getfield        #57  <Field JsonSerializer _valueSerializer>
	//*  23   39:aload_2         
	//*  24   40:if_acmpne       53
	//*  25   43:aload_0         
	//*  26   44:getfield        #59  <Field NameTransformer _unwrapper>
	//*  27   47:aload_1         
	//*  28   48:if_acmpne       53
			return ((JsonSerializer) (this));
	//   29   51:aload_0         
	//   30   52:areturn         
		else
			return ((JsonSerializer) (withResolved(_property, _valueTypeSerializer, jsonserializer, nametransformer)));
	//   31   53:aload_0         
	//   32   54:aload_0         
	//   33   55:getfield        #53  <Field BeanProperty _property>
	//   34   58:aload_0         
	//   35   59:getfield        #55  <Field TypeSerializer _valueTypeSerializer>
	//   36   62:aload_2         
	//   37   63:aload_1         
	//   38   64:invokevirtual   #208 <Method ReferenceTypeSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, NameTransformer)>
	//   39   67:areturn         
	}

	public abstract ReferenceTypeSerializer withContentInclusion(Object obj, boolean flag);

	protected abstract ReferenceTypeSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, NameTransformer nametransformer);

	public static final Object MARKER_FOR_EMPTY;
	private static final long serialVersionUID = 1L;
	protected transient PropertySerializerMap _dynamicSerializers;
	protected final BeanProperty _property;
	protected final JavaType _referredType;
	protected final boolean _suppressNulls;
	protected final Object _suppressableValue;
	protected final NameTransformer _unwrapper;
	protected final JsonSerializer _valueSerializer;
	protected final TypeSerializer _valueTypeSerializer;

	static 
	{
		MARKER_FOR_EMPTY = ((Object) (com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY));
	//    0    0:getstatic       #39  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_EMPTY>
	//    1    3:putstatic       #41  <Field Object MARKER_FOR_EMPTY>
	//*   2    6:return          
	}
}
