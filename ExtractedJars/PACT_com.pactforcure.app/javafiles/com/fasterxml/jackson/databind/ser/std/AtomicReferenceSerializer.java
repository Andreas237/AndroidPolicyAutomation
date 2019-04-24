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
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class AtomicReferenceSerializer extends StdSerializer
	implements ContextualSerializer
{

	protected AtomicReferenceSerializer(AtomicReferenceSerializer atomicreferenceserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, NameTransformer nametransformer, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		super(((StdSerializer) (atomicreferenceserializer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #31  <Method void StdSerializer(StdSerializer)>
		_referredType = atomicreferenceserializer._referredType;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #33  <Field JavaType _referredType>
	//    6   10:putfield        #33  <Field JavaType _referredType>
		_dynamicSerializers = atomicreferenceserializer._dynamicSerializers;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #35  <Field PropertySerializerMap _dynamicSerializers>
	//   10   18:putfield        #35  <Field PropertySerializerMap _dynamicSerializers>
		_property = beanproperty;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #37  <Field BeanProperty _property>
		_valueTypeSerializer = typeserializer;
	//   14   26:aload_0         
	//   15   27:aload_3         
	//   16   28:putfield        #39  <Field TypeSerializer _valueTypeSerializer>
		_valueSerializer = jsonserializer;
	//   17   31:aload_0         
	//   18   32:aload           4
	//   19   34:putfield        #41  <Field JsonSerializer _valueSerializer>
		_unwrapper = nametransformer;
	//   20   37:aload_0         
	//   21   38:aload           5
	//   22   40:putfield        #43  <Field NameTransformer _unwrapper>
		if(include == com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS || include == com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	//*  23   43:aload           6
	//*  24   45:getstatic       #48  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  25   48:if_acmpeq       59
	//*  26   51:aload           6
	//*  27   53:getstatic       #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  28   56:if_acmpne       65
		{
			_contentInclusion = null;
	//   29   59:aload_0         
	//   30   60:aconst_null     
	//   31   61:putfield        #53  <Field com.fasterxml.jackson.annotation.JsonInclude$Include _contentInclusion>
			return;
	//   32   64:return          
		} else
		{
			_contentInclusion = include;
	//   33   65:aload_0         
	//   34   66:aload           6
	//   35   68:putfield        #53  <Field com.fasterxml.jackson.annotation.JsonInclude$Include _contentInclusion>
			return;
	//   36   71:return          
		}
	}

	public AtomicReferenceSerializer(ReferenceType referencetype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
	{
		super(((JavaType) (referencetype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void StdSerializer(JavaType)>
		_referredType = referencetype.getReferencedType();
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #66  <Method JavaType ReferenceType.getReferencedType()>
	//    6   10:putfield        #33  <Field JavaType _referredType>
		_property = null;
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:putfield        #37  <Field BeanProperty _property>
		_valueTypeSerializer = typeserializer;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #39  <Field TypeSerializer _valueTypeSerializer>
		_valueSerializer = jsonserializer;
	//   13   23:aload_0         
	//   14   24:aload           4
	//   15   26:putfield        #41  <Field JsonSerializer _valueSerializer>
		_unwrapper = null;
	//   16   29:aload_0         
	//   17   30:aconst_null     
	//   18   31:putfield        #43  <Field NameTransformer _unwrapper>
		_contentInclusion = null;
	//   19   34:aload_0         
	//   20   35:aconst_null     
	//   21   36:putfield        #53  <Field com.fasterxml.jackson.annotation.JsonInclude$Include _contentInclusion>
		_dynamicSerializers = PropertySerializerMap.emptyForProperties();
	//   22   39:aload_0         
	//   23   40:invokestatic    #72  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
	//   24   43:putfield        #35  <Field PropertySerializerMap _dynamicSerializers>
	//   25   46:return          
	}

	private final JsonSerializer _findCachedSerializer(SerializerProvider serializerprovider, Class class1)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _dynamicSerializers.serializerFor(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field PropertySerializerMap _dynamicSerializers>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #81  <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//    4    8:astore          4
		Object obj = ((Object) (jsonserializer));
	//    5   10:aload           4
	//    6   12:astore_3        
		if(jsonserializer == null)
	//*   7   13:aload           4
	//*   8   15:ifnonnull       62
		{
			obj = ((Object) (_findSerializer(serializerprovider, class1, _property)));
	//    9   18:aload_0         
	//   10   19:aload_1         
	//   11   20:aload_2         
	//   12   21:aload_0         
	//   13   22:getfield        #37  <Field BeanProperty _property>
	//   14   25:invokespecial   #85  <Method JsonSerializer _findSerializer(SerializerProvider, Class, BeanProperty)>
	//   15   28:astore_3        
			serializerprovider = ((SerializerProvider) (obj));
	//   16   29:aload_3         
	//   17   30:astore_1        
			if(_unwrapper != null)
	//*  18   31:aload_0         
	//*  19   32:getfield        #43  <Field NameTransformer _unwrapper>
	//*  20   35:ifnull          47
				serializerprovider = ((SerializerProvider) (((JsonSerializer) (obj)).unwrappingSerializer(_unwrapper)));
	//   21   38:aload_3         
	//   22   39:aload_0         
	//   23   40:getfield        #43  <Field NameTransformer _unwrapper>
	//   24   43:invokevirtual   #91  <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   25   46:astore_1        
			_dynamicSerializers = _dynamicSerializers.newWith(class1, ((JsonSerializer) (serializerprovider)));
	//   26   47:aload_0         
	//   27   48:aload_0         
	//   28   49:getfield        #35  <Field PropertySerializerMap _dynamicSerializers>
	//   29   52:aload_2         
	//   30   53:aload_1         
	//   31   54:invokevirtual   #95  <Method PropertySerializerMap PropertySerializerMap.newWith(Class, JsonSerializer)>
	//   32   57:putfield        #35  <Field PropertySerializerMap _dynamicSerializers>
			obj = ((Object) (serializerprovider));
	//   33   60:aload_1         
	//   34   61:astore_3        
		}
		return ((JsonSerializer) (obj));
	//   35   62:aload_3         
	//   36   63:areturn         
	}

	private final JsonSerializer _findSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return serializerprovider.findTypedValueSerializer(javatype, true, beanproperty);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_1        
	//    3    3:aload_3         
	//    4    4:invokevirtual   #104 <Method JsonSerializer SerializerProvider.findTypedValueSerializer(JavaType, boolean, BeanProperty)>
	//    5    7:areturn         
	}

	private final JsonSerializer _findSerializer(SerializerProvider serializerprovider, Class class1, BeanProperty beanproperty)
		throws JsonMappingException
	{
		return serializerprovider.findTypedValueSerializer(class1, true, beanproperty);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iconst_1        
	//    3    3:aload_3         
	//    4    4:invokevirtual   #108 <Method JsonSerializer SerializerProvider.findTypedValueSerializer(Class, boolean, BeanProperty)>
	//    5    7:areturn         
	}

	protected boolean _useStatic(SerializerProvider serializerprovider, BeanProperty beanproperty, JavaType javatype)
	{
		if(!javatype.isJavaLangObject()) goto _L2; else goto _L1
	//    0    0:aload_3         
	//    1    1:invokevirtual   #117 <Method boolean JavaType.isJavaLangObject()>
	//    2    4:ifeq            9
_L1:
		return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
_L2:
		if(javatype.isFinal())
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #120 <Method boolean JavaType.isFinal()>
	//*   7   13:ifeq            18
			return true;
	//    8   16:iconst_1        
	//    9   17:ireturn         
		if(javatype.useStaticType())
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #123 <Method boolean JavaType.useStaticType()>
	//*  12   22:ifeq            27
			return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		javatype = ((JavaType) (serializerprovider.getAnnotationIntrospector()));
	//   15   27:aload_1         
	//   16   28:invokevirtual   #127 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//   17   31:astore_3        
		if(javatype == null || beanproperty == null || beanproperty.getMember() == null)
			break; /* Loop/switch isn't completed */
	//   18   32:aload_3         
	//   19   33:ifnull          76
	//   20   36:aload_2         
	//   21   37:ifnull          76
	//   22   40:aload_2         
	//   23   41:invokeinterface #133 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   24   46:ifnull          76
		beanproperty = ((BeanProperty) (((AnnotationIntrospector) (javatype)).findSerializationTyping(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty.getMember())))));
	//   25   49:aload_3         
	//   26   50:aload_2         
	//   27   51:invokeinterface #133 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//   28   56:invokevirtual   #139 <Method com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing AnnotationIntrospector.findSerializationTyping(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   29   59:astore_2        
		if(beanproperty == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
	//*  30   60:aload_2         
	//*  31   61:getstatic       #145 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.STATIC>
	//*  32   64:if_acmpne       69
			return true;
	//   33   67:iconst_1        
	//   34   68:ireturn         
		if(beanproperty == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DYNAMIC) goto _L1; else goto _L3
	//   35   69:aload_2         
	//   36   70:getstatic       #148 <Field com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing com.fasterxml.jackson.databind.annotation.JsonSerialize$Typing.DYNAMIC>
	//   37   73:if_acmpeq       7
_L3:
		return serializerprovider.isEnabled(MapperFeature.USE_STATIC_TYPING);
	//   38   76:aload_1         
	//   39   77:getstatic       #154 <Field MapperFeature MapperFeature.USE_STATIC_TYPING>
	//   40   80:invokevirtual   #158 <Method boolean SerializerProvider.isEnabled(MapperFeature)>
	//   41   83:ireturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JsonSerializer jsonserializer = _valueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field JsonSerializer _valueSerializer>
	//    2    4:astore_3        
		javatype = ((JavaType) (jsonserializer));
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(jsonserializer == null)
	//*   5    7:aload_3         
	//*   6    8:ifnonnull       48
		{
			JsonSerializer jsonserializer1 = _findSerializer(jsonformatvisitorwrapper.getProvider(), _referredType, _property);
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokeinterface #166 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   10   18:aload_0         
	//   11   19:getfield        #33  <Field JavaType _referredType>
	//   12   22:aload_0         
	//   13   23:getfield        #37  <Field BeanProperty _property>
	//   14   26:invokespecial   #168 <Method JsonSerializer _findSerializer(SerializerProvider, JavaType, BeanProperty)>
	//   15   29:astore_3        
			javatype = ((JavaType) (jsonserializer1));
	//   16   30:aload_3         
	//   17   31:astore_2        
			if(_unwrapper != null)
	//*  18   32:aload_0         
	//*  19   33:getfield        #43  <Field NameTransformer _unwrapper>
	//*  20   36:ifnull          48
				javatype = ((JavaType) (jsonserializer1.unwrappingSerializer(_unwrapper)));
	//   21   39:aload_3         
	//   22   40:aload_0         
	//   23   41:getfield        #43  <Field NameTransformer _unwrapper>
	//   24   44:invokevirtual   #91  <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   25   47:astore_2        
		}
		((JsonSerializer) (javatype)).acceptJsonFormatVisitor(jsonformatvisitorwrapper, _referredType);
	//   26   48:aload_2         
	//   27   49:aload_1         
	//   28   50:aload_0         
	//   29   51:getfield        #33  <Field JavaType _referredType>
	//   30   54:invokevirtual   #170 <Method void JsonSerializer.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//   31   57:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_valueTypeSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//    2    4:astore_3        
		TypeSerializer typeserializer = ((TypeSerializer) (obj));
	//    3    5:aload_3         
	//    4    6:astore          4
		if(obj != null)
	//*   5    8:aload_3         
	//*   6    9:ifnull          19
			typeserializer = ((TypeSerializer) (obj)).forProperty(beanproperty);
	//    7   12:aload_3         
	//    8   13:aload_2         
	//    9   14:invokevirtual   #178 <Method TypeSerializer TypeSerializer.forProperty(BeanProperty)>
	//   10   17:astore          4
		obj = ((Object) (_valueSerializer));
	//   11   19:aload_0         
	//   12   20:getfield        #41  <Field JsonSerializer _valueSerializer>
	//   13   23:astore_3        
		Object obj1;
		com.fasterxml.jackson.annotation.JsonInclude.Include include;
		if(obj == null)
	//*  14   24:aload_3         
	//*  15   25:ifnonnull       121
		{
			if(_useStatic(serializerprovider, beanproperty, _referredType))
	//*  16   28:aload_0         
	//*  17   29:aload_1         
	//*  18   30:aload_2         
	//*  19   31:aload_0         
	//*  20   32:getfield        #33  <Field JavaType _referredType>
	//*  21   35:invokevirtual   #180 <Method boolean _useStatic(SerializerProvider, BeanProperty, JavaType)>
	//*  22   38:ifeq            52
				obj = ((Object) (_findSerializer(serializerprovider, _referredType, beanproperty)));
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:aload_0         
	//   26   44:getfield        #33  <Field JavaType _referredType>
	//   27   47:aload_2         
	//   28   48:invokespecial   #168 <Method JsonSerializer _findSerializer(SerializerProvider, JavaType, BeanProperty)>
	//   29   51:astore_3        
		} else
	//*  30   52:aload_0         
	//*  31   53:getfield        #53  <Field com.fasterxml.jackson.annotation.JsonInclude$Include _contentInclusion>
	//*  32   56:astore          6
	//*  33   58:aload           6
	//*  34   60:astore          5
	//*  35   62:aload_2         
	//*  36   63:ifnull          106
	//*  37   66:aload_2         
	//*  38   67:aload_1         
	//*  39   68:invokevirtual   #184 <Method com.fasterxml.jackson.databind.SerializationConfig SerializerProvider.getConfig()>
	//*  40   71:ldc1            #186 <Class AtomicReference>
	//*  41   73:invokeinterface #190 <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanProperty.findPropertyInclusion(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//*  42   78:invokevirtual   #196 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getContentInclusion()>
	//*  43   81:astore_1        
	//*  44   82:aload           6
	//*  45   84:astore          5
	//*  46   86:aload_1         
	//*  47   87:aload           6
	//*  48   89:if_acmpeq       106
	//*  49   92:aload           6
	//*  50   94:astore          5
	//*  51   96:aload_1         
	//*  52   97:getstatic       #48  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  53  100:if_acmpeq       106
	//*  54  103:aload_1         
	//*  55  104:astore          5
	//*  56  106:aload_0         
	//*  57  107:aload_2         
	//*  58  108:aload           4
	//*  59  110:aload_3         
	//*  60  111:aload_0         
	//*  61  112:getfield        #43  <Field NameTransformer _unwrapper>
	//*  62  115:aload           5
	//*  63  117:invokevirtual   #200 <Method AtomicReferenceSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, NameTransformer, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//*  64  120:areturn         
		{
			obj = ((Object) (serializerprovider.handlePrimaryContextualization(((JsonSerializer) (obj)), beanproperty)));
	//   65  121:aload_1         
	//   66  122:aload_3         
	//   67  123:aload_2         
	//   68  124:invokevirtual   #204 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   69  127:astore_3        
		}
		include = _contentInclusion;
		obj1 = ((Object) (include));
		if(beanproperty != null)
		{
			serializerprovider = ((SerializerProvider) (beanproperty.findPropertyInclusion(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializerprovider.getConfig())), java/util/concurrent/atomic/AtomicReference).getContentInclusion()));
			obj1 = ((Object) (include));
			if(serializerprovider != include)
			{
				obj1 = ((Object) (include));
				if(serializerprovider != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
					obj1 = ((Object) (serializerprovider));
			}
		}
		return ((JsonSerializer) (withResolved(beanproperty, typeserializer, ((JsonSerializer) (obj)), _unwrapper, ((com.fasterxml.jackson.annotation.JsonInclude.Include) (obj1)))));
	//*  70  128:goto            52
	}

	public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
	{
		return isEmpty(serializerprovider, (AtomicReference)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #186 <Class AtomicReference>
	//    4    6:invokevirtual   #210 <Method boolean isEmpty(SerializerProvider, AtomicReference)>
	//    5    9:ireturn         
	}

	public boolean isEmpty(SerializerProvider serializerprovider, AtomicReference atomicreference)
	{
		Object obj;
		if(atomicreference != null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
	//*   2    4:iconst_1        
	//*   3    5:ireturn         
	//*   4    6:aload_2         
	//*   5    7:invokevirtual   #214 <Method Object AtomicReference.get()>
	//*   6   10:astore          5
			if((obj = atomicreference.get()) != null)
	//*   7   12:aload           5
	//*   8   14:ifnull          4
			{
				if(_contentInclusion == null)
	//*   9   17:aload_0         
	//*  10   18:getfield        #53  <Field com.fasterxml.jackson.annotation.JsonInclude$Include _contentInclusion>
	//*  11   21:ifnonnull       26
					return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
				JsonSerializer jsonserializer1 = _valueSerializer;
	//   14   26:aload_0         
	//   15   27:getfield        #41  <Field JsonSerializer _valueSerializer>
	//   16   30:astore          4
				JsonSerializer jsonserializer = jsonserializer1;
	//   17   32:aload           4
	//   18   34:astore_3        
				if(jsonserializer1 == null)
	//*  19   35:aload           4
	//*  20   37:ifnonnull       50
					try
					{
						jsonserializer = _findCachedSerializer(serializerprovider, ((Object) (atomicreference)).getClass());
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:aload_2         
	//   24   43:invokevirtual   #220 <Method Class Object.getClass()>
	//   25   46:invokespecial   #222 <Method JsonSerializer _findCachedSerializer(SerializerProvider, Class)>
	//   26   49:astore_3        
					}
	//*  27   50:aload_3         
	//*  28   51:aload_1         
	//*  29   52:aload           5
	//*  30   54:invokevirtual   #224 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  31   57:ireturn         
					// Misplaced declaration of an exception variable
					catch(SerializerProvider serializerprovider)
	//*  32   58:astore_1        
					{
						throw new RuntimeJsonMappingException(((JsonMappingException) (serializerprovider)));
	//   33   59:new             #226 <Class RuntimeJsonMappingException>
	//   34   62:dup             
	//   35   63:aload_1         
	//   36   64:invokespecial   #229 <Method void RuntimeJsonMappingException(JsonMappingException)>
	//   37   67:athrow          
					}
				return jsonserializer.isEmpty(serializerprovider, obj);
			}
		return true;
	}

	public boolean isUnwrappingSerializer()
	{
		return _unwrapper != null;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field NameTransformer _unwrapper>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((AtomicReference)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #186 <Class AtomicReference>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #238 <Method void serialize(AtomicReference, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	public void serialize(AtomicReference atomicreference, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj = atomicreference.get();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #214 <Method Object AtomicReference.get()>
	//    2    4:astore          5
		if(obj == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       24
		{
			if(_unwrapper == null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #43  <Field NameTransformer _unwrapper>
	//*   7   15:ifnonnull       23
				serializerprovider.defaultSerializeNull(jsongenerator);
	//    8   18:aload_3         
	//    9   19:aload_2         
	//   10   20:invokevirtual   #242 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			return;
	//   11   23:return          
		}
		JsonSerializer jsonserializer = _valueSerializer;
	//   12   24:aload_0         
	//   13   25:getfield        #41  <Field JsonSerializer _valueSerializer>
	//   14   28:astore          4
		atomicreference = ((AtomicReference) (jsonserializer));
	//   15   30:aload           4
	//   16   32:astore_1        
		if(jsonserializer == null)
	//*  17   33:aload           4
	//*  18   35:ifnonnull       49
			atomicreference = ((AtomicReference) (_findCachedSerializer(serializerprovider, obj.getClass())));
	//   19   38:aload_0         
	//   20   39:aload_3         
	//   21   40:aload           5
	//   22   42:invokevirtual   #220 <Method Class Object.getClass()>
	//   23   45:invokespecial   #222 <Method JsonSerializer _findCachedSerializer(SerializerProvider, Class)>
	//   24   48:astore_1        
		if(_valueTypeSerializer != null)
	//*  25   49:aload_0         
	//*  26   50:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//*  27   53:ifnull          69
		{
			((JsonSerializer) (atomicreference)).serializeWithType(obj, jsongenerator, serializerprovider, _valueTypeSerializer);
	//   28   56:aload_1         
	//   29   57:aload           5
	//   30   59:aload_2         
	//   31   60:aload_3         
	//   32   61:aload_0         
	//   33   62:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//   34   65:invokevirtual   #246 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   35   68:return          
		} else
		{
			((JsonSerializer) (atomicreference)).serialize(obj, jsongenerator, serializerprovider);
	//   36   69:aload_1         
	//   37   70:aload           5
	//   38   72:aload_2         
	//   39   73:aload_3         
	//   40   74:invokevirtual   #248 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   41   77:return          
		}
	}

	public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		serializeWithType((AtomicReference)obj, jsongenerator, serializerprovider, typeserializer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #186 <Class AtomicReference>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #252 <Method void serializeWithType(AtomicReference, JsonGenerator, SerializerProvider, TypeSerializer)>
	//    7   12:return          
	}

	public void serializeWithType(AtomicReference atomicreference, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		if(atomicreference.get() == null)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #214 <Method Object AtomicReference.get()>
	//*   2    4:ifnonnull       20
		{
			if(_unwrapper == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #43  <Field NameTransformer _unwrapper>
	//*   5   11:ifnonnull       19
				serializerprovider.defaultSerializeNull(jsongenerator);
	//    6   14:aload_3         
	//    7   15:aload_2         
	//    8   16:invokevirtual   #242 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
			return;
	//    9   19:return          
		} else
		{
			typeserializer.writeTypePrefixForScalar(((Object) (atomicreference)), jsongenerator);
	//   10   20:aload           4
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokevirtual   #256 <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
			serialize(atomicreference, jsongenerator, serializerprovider);
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:aload_2         
	//   17   30:aload_3         
	//   18   31:invokevirtual   #238 <Method void serialize(AtomicReference, JsonGenerator, SerializerProvider)>
			typeserializer.writeTypeSuffixForScalar(((Object) (atomicreference)), jsongenerator);
	//   19   34:aload           4
	//   20   36:aload_1         
	//   21   37:aload_2         
	//   22   38:invokevirtual   #259 <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
			return;
	//   23   41:return          
		}
	}

	public JsonSerializer unwrappingSerializer(NameTransformer nametransformer)
	{
		JsonSerializer jsonserializer1 = _valueSerializer;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field JsonSerializer _valueSerializer>
	//    2    4:astore_3        
		JsonSerializer jsonserializer = jsonserializer1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(jsonserializer1 != null)
	//*   5    7:aload_3         
	//*   6    8:ifnull          17
			jsonserializer = jsonserializer1.unwrappingSerializer(nametransformer);
	//    7   11:aload_3         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #91  <Method JsonSerializer JsonSerializer.unwrappingSerializer(NameTransformer)>
	//   10   16:astore_2        
		if(_unwrapper != null)
	//*  11   17:aload_0         
	//*  12   18:getfield        #43  <Field NameTransformer _unwrapper>
	//*  13   21:ifnonnull       43
	//*  14   24:aload_0         
	//*  15   25:aload_0         
	//*  16   26:getfield        #37  <Field BeanProperty _property>
	//*  17   29:aload_0         
	//*  18   30:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//*  19   33:aload_2         
	//*  20   34:aload_1         
	//*  21   35:aload_0         
	//*  22   36:getfield        #53  <Field com.fasterxml.jackson.annotation.JsonInclude$Include _contentInclusion>
	//*  23   39:invokevirtual   #200 <Method AtomicReferenceSerializer withResolved(BeanProperty, TypeSerializer, JsonSerializer, NameTransformer, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//*  24   42:areturn         
			nametransformer = NameTransformer.chainedTransformer(nametransformer, _unwrapper);
	//   25   43:aload_1         
	//   26   44:aload_0         
	//   27   45:getfield        #43  <Field NameTransformer _unwrapper>
	//   28   48:invokestatic    #266 <Method NameTransformer NameTransformer.chainedTransformer(NameTransformer, NameTransformer)>
	//   29   51:astore_1        
		return ((JsonSerializer) (withResolved(_property, _valueTypeSerializer, jsonserializer, nametransformer, _contentInclusion)));
	//*  30   52:goto            24
	}

	protected AtomicReferenceSerializer withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, NameTransformer nametransformer, com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		if(_property == beanproperty && include == _contentInclusion && _valueTypeSerializer == typeserializer && _valueSerializer == jsonserializer && _unwrapper == nametransformer)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       44
	//*   4    8:aload           5
	//*   5   10:aload_0         
	//*   6   11:getfield        #53  <Field com.fasterxml.jackson.annotation.JsonInclude$Include _contentInclusion>
	//*   7   14:if_acmpne       44
	//*   8   17:aload_0         
	//*   9   18:getfield        #39  <Field TypeSerializer _valueTypeSerializer>
	//*  10   21:aload_2         
	//*  11   22:if_acmpne       44
	//*  12   25:aload_0         
	//*  13   26:getfield        #41  <Field JsonSerializer _valueSerializer>
	//*  14   29:aload_3         
	//*  15   30:if_acmpne       44
	//*  16   33:aload_0         
	//*  17   34:getfield        #43  <Field NameTransformer _unwrapper>
	//*  18   37:aload           4
	//*  19   39:if_acmpne       44
			return this;
	//   20   42:aload_0         
	//   21   43:areturn         
		else
			return new AtomicReferenceSerializer(this, beanproperty, typeserializer, jsonserializer, nametransformer, include);
	//   22   44:new             #2   <Class AtomicReferenceSerializer>
	//   23   47:dup             
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:aload_2         
	//   27   51:aload_3         
	//   28   52:aload           4
	//   29   54:aload           5
	//   30   56:invokespecial   #269 <Method void AtomicReferenceSerializer(AtomicReferenceSerializer, BeanProperty, TypeSerializer, JsonSerializer, NameTransformer, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//   31   59:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final com.fasterxml.jackson.annotation.JsonInclude.Include _contentInclusion;
	protected transient PropertySerializerMap _dynamicSerializers;
	protected final BeanProperty _property;
	protected final JavaType _referredType;
	protected final NameTransformer _unwrapper;
	protected final JsonSerializer _valueSerializer;
	protected final TypeSerializer _valueTypeSerializer;
}
