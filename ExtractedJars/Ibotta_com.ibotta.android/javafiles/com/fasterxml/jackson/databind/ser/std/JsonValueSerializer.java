// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class JsonValueSerializer extends StdSerializer
	implements JsonFormatVisitable, SchemaAware, ContextualSerializer
{
	static class TypeSerializerRerouter extends TypeSerializer
	{

		public TypeSerializer forProperty(BeanProperty beanproperty)
		{
			throw new UnsupportedOperationException();
		//    0    0:new             #25  <Class UnsupportedOperationException>
		//    1    3:dup             
		//    2    4:invokespecial   #26  <Method void UnsupportedOperationException()>
		//    3    7:athrow          
		}

		public String getPropertyName()
		{
			return _typeSerializer.getPropertyName();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field TypeSerializer _typeSerializer>
		//    2    4:invokevirtual   #30  <Method String TypeSerializer.getPropertyName()>
		//    3    7:areturn         
		}

		public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
		{
			return _typeSerializer.getTypeInclusion();
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field TypeSerializer _typeSerializer>
		//    2    4:invokevirtual   #34  <Method com.fasterxml.jackson.annotation.JsonTypeInfo$As TypeSerializer.getTypeInclusion()>
		//    3    7:areturn         
		}

		public WritableTypeId writeTypePrefix(JsonGenerator jsongenerator, WritableTypeId writabletypeid)
			throws IOException
		{
			writabletypeid.forValue = _forObject;
		//    0    0:aload_2         
		//    1    1:aload_0         
		//    2    2:getfield        #20  <Field Object _forObject>
		//    3    5:putfield        #43  <Field Object WritableTypeId.forValue>
			return _typeSerializer.writeTypePrefix(jsongenerator, writabletypeid);
		//    4    8:aload_0         
		//    5    9:getfield        #18  <Field TypeSerializer _typeSerializer>
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokevirtual   #45  <Method WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, WritableTypeId)>
		//    9   17:areturn         
		}

		public WritableTypeId writeTypeSuffix(JsonGenerator jsongenerator, WritableTypeId writabletypeid)
			throws IOException
		{
			return _typeSerializer.writeTypeSuffix(jsongenerator, writabletypeid);
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field TypeSerializer _typeSerializer>
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #49  <Method WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, WritableTypeId)>
		//    5    9:areturn         
		}

		protected final Object _forObject;
		protected final TypeSerializer _typeSerializer;

		public TypeSerializerRerouter(TypeSerializer typeserializer, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void TypeSerializer()>
			_typeSerializer = typeserializer;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field TypeSerializer _typeSerializer>
			_forObject = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Object _forObject>
		//    8   14:return          
		}
	}


	public JsonValueSerializer(AnnotatedMember annotatedmember, JsonSerializer jsonserializer)
	{
		super(annotatedmember.getType());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #32  <Method JavaType AnnotatedMember.getType()>
	//    3    5:invokespecial   #35  <Method void StdSerializer(JavaType)>
		_accessor = annotatedmember;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #37  <Field AnnotatedMember _accessor>
		_valueSerializer = jsonserializer;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #39  <Field JsonSerializer _valueSerializer>
		_property = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #41  <Field BeanProperty _property>
		_forceTypeInformation = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #43  <Field boolean _forceTypeInformation>
	//   16   28:return          
	}

	public JsonValueSerializer(JsonValueSerializer jsonvalueserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, boolean flag)
	{
		super(_notNullClass(jsonvalueserializer.handledType()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method Class handledType()>
	//    3    5:invokestatic    #55  <Method Class _notNullClass(Class)>
	//    4    8:invokespecial   #58  <Method void StdSerializer(Class)>
		_accessor = jsonvalueserializer._accessor;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getfield        #37  <Field AnnotatedMember _accessor>
	//    8   16:putfield        #37  <Field AnnotatedMember _accessor>
		_valueSerializer = jsonserializer;
	//    9   19:aload_0         
	//   10   20:aload_3         
	//   11   21:putfield        #39  <Field JsonSerializer _valueSerializer>
		_property = beanproperty;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #41  <Field BeanProperty _property>
		_forceTypeInformation = flag;
	//   15   29:aload_0         
	//   16   30:iload           4
	//   17   32:putfield        #43  <Field boolean _forceTypeInformation>
	//   18   35:return          
	}

	private static final Class _notNullClass(Class class1)
	{
		Object obj = ((Object) (class1));
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(class1 == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       9
			obj = java/lang/Object;
	//    4    6:ldc1            #61  <Class Object>
	//    5    8:astore_1        
		return ((Class) (obj));
	//    6    9:aload_1         
	//    7   10:areturn         
	}

	protected boolean _acceptJsonFormatVisitorForEnum(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype, Class class1)
		throws JsonMappingException
	{
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectStringFormat(javatype)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #74  <Method JsonStringFormatVisitor JsonFormatVisitorWrapper.expectStringFormat(JavaType)>
	//    3    7:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          146
		{
			LinkedHashSet linkedhashset = new LinkedHashSet();
	//    6   12:new             #76  <Class LinkedHashSet>
	//    7   15:dup             
	//    8   16:invokespecial   #79  <Method void LinkedHashSet()>
	//    9   19:astore          6
			class1 = ((Class) (class1.getEnumConstants()));
	//   10   21:aload_3         
	//   11   22:invokevirtual   #85  <Method Object[] Class.getEnumConstants()>
	//   12   25:astore_3        
			int j = class1.length;
	//   13   26:aload_3         
	//   14   27:arraylength     
	//   15   28:istore          5
			int i = 0;
	//   16   30:iconst_0        
	//   17   31:istore          4
			do
			{
				if(i >= j)
					break;
	//   18   33:iload           4
	//   19   35:iload           5
	//   20   37:icmpge          138
				javatype = ((JavaType) (class1[i]));
	//   21   40:aload_3         
	//   22   41:iload           4
	//   23   43:aaload          
	//   24   44:astore_2        
				try
				{
					((Set) (linkedhashset)).add(((Object) (String.valueOf(_accessor.getValue(((Object) (javatype)))))));
	//   25   45:aload           6
	//   26   47:aload_0         
	//   27   48:getfield        #37  <Field AnnotatedMember _accessor>
	//   28   51:aload_2         
	//   29   52:invokevirtual   #89  <Method Object AnnotatedMember.getValue(Object)>
	//   30   55:invokestatic    #95  <Method String String.valueOf(Object)>
	//   31   58:invokeinterface #101 <Method boolean Set.add(Object)>
	//   32   63:pop             
				}
	//*  33   64:iload           4
	//*  34   66:iconst_1        
	//*  35   67:iadd            
	//*  36   68:istore          4
	//*  37   70:goto            33
				// Misplaced declaration of an exception variable
				catch(JsonFormatVisitorWrapper jsonformatvisitorwrapper)
	//*  38   73:astore_1        
				{
					for(; (jsonformatvisitorwrapper instanceof InvocationTargetException) && ((Throwable) (jsonformatvisitorwrapper)).getCause() != null; jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (((Throwable) (jsonformatvisitorwrapper)).getCause())));
	//   39   74:aload_1         
	//   40   75:instanceof      #103 <Class InvocationTargetException>
	//   41   78:ifeq            96
	//   42   81:aload_1         
	//   43   82:invokevirtual   #109 <Method Throwable Throwable.getCause()>
	//   44   85:ifnull          96
	//   45   88:aload_1         
	//   46   89:invokevirtual   #109 <Method Throwable Throwable.getCause()>
	//   47   92:astore_1        
	//*  48   93:goto            74
					ClassUtil.throwIfError(((Throwable) (jsonformatvisitorwrapper)));
	//   49   96:aload_1         
	//   50   97:invokestatic    #115 <Method Throwable ClassUtil.throwIfError(Throwable)>
	//   51  100:pop             
					class1 = ((Class) (new StringBuilder()));
	//   52  101:new             #117 <Class StringBuilder>
	//   53  104:dup             
	//   54  105:invokespecial   #118 <Method void StringBuilder()>
	//   55  108:astore_3        
					((StringBuilder) (class1)).append(_accessor.getName());
	//   56  109:aload_3         
	//   57  110:aload_0         
	//   58  111:getfield        #37  <Field AnnotatedMember _accessor>
	//   59  114:invokevirtual   #122 <Method String AnnotatedMember.getName()>
	//   60  117:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   61  120:pop             
					((StringBuilder) (class1)).append("()");
	//   62  121:aload_3         
	//   63  122:ldc1            #128 <String "()">
	//   64  124:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   65  127:pop             
					throw JsonMappingException.wrapWithPath(((Throwable) (jsonformatvisitorwrapper)), ((Object) (javatype)), ((StringBuilder) (class1)).toString());
	//   66  128:aload_1         
	//   67  129:aload_2         
	//   68  130:aload_3         
	//   69  131:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   70  134:invokestatic    #135 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   71  137:athrow          
				}
				i++;
			} while(true);
			((JsonStringFormatVisitor) (jsonformatvisitorwrapper)).enumTypes(((Set) (linkedhashset)));
	//   72  138:aload_1         
	//   73  139:aload           6
	//   74  141:invokeinterface #141 <Method void JsonStringFormatVisitor.enumTypes(Set)>
		}
		return true;
	//   75  146:iconst_1        
	//   76  147:ireturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		JavaType javatype1 = _accessor.getType();
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnnotatedMember _accessor>
	//    2    4:invokevirtual   #32  <Method JavaType AnnotatedMember.getType()>
	//    3    7:astore          5
		Object obj = ((Object) (_accessor.getDeclaringClass()));
	//    4    9:aload_0         
	//    5   10:getfield        #37  <Field AnnotatedMember _accessor>
	//    6   13:invokevirtual   #148 <Method Class AnnotatedMember.getDeclaringClass()>
	//    7   16:astore_3        
		if(obj != null && ((Class) (obj)).isEnum() && _acceptJsonFormatVisitorForEnum(jsonformatvisitorwrapper, javatype, ((Class) (obj))))
	//*   8   17:aload_3         
	//*   9   18:ifnull          39
	//*  10   21:aload_3         
	//*  11   22:invokevirtual   #152 <Method boolean Class.isEnum()>
	//*  12   25:ifeq            39
	//*  13   28:aload_0         
	//*  14   29:aload_1         
	//*  15   30:aload_2         
	//*  16   31:aload_3         
	//*  17   32:invokevirtual   #154 <Method boolean _acceptJsonFormatVisitorForEnum(JsonFormatVisitorWrapper, JavaType, Class)>
	//*  18   35:ifeq            39
			return;
	//   19   38:return          
		JsonSerializer jsonserializer = _valueSerializer;
	//   20   39:aload_0         
	//   21   40:getfield        #39  <Field JsonSerializer _valueSerializer>
	//   22   43:astore          4
		obj = ((Object) (jsonserializer));
	//   23   45:aload           4
	//   24   47:astore_3        
		if(jsonserializer == null)
	//*  25   48:aload           4
	//*  26   50:ifnonnull       88
		{
			JsonSerializer jsonserializer1 = jsonformatvisitorwrapper.getProvider().findTypedValueSerializer(javatype1, false, _property);
	//   27   53:aload_1         
	//   28   54:invokeinterface #158 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   29   59:aload           5
	//   30   61:iconst_0        
	//   31   62:aload_0         
	//   32   63:getfield        #41  <Field BeanProperty _property>
	//   33   66:invokevirtual   #164 <Method JsonSerializer SerializerProvider.findTypedValueSerializer(JavaType, boolean, BeanProperty)>
	//   34   69:astore          4
			obj = ((Object) (jsonserializer1));
	//   35   71:aload           4
	//   36   73:astore_3        
			if(jsonserializer1 == null)
	//*  37   74:aload           4
	//*  38   76:ifnonnull       88
			{
				jsonformatvisitorwrapper.expectAnyFormat(javatype);
	//   39   79:aload_1         
	//   40   80:aload_2         
	//   41   81:invokeinterface #168 <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//   42   86:pop             
				return;
	//   43   87:return          
			}
		}
		((JsonSerializer) (obj)).acceptJsonFormatVisitor(jsonformatvisitorwrapper, javatype1);
	//   44   88:aload_3         
	//   45   89:aload_1         
	//   46   90:aload           5
	//   47   92:invokevirtual   #172 <Method void JsonSerializer.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//   48   95:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj = ((Object) (_valueSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonSerializer _valueSerializer>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       62
		{
			obj = ((Object) (_accessor.getType()));
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field AnnotatedMember _accessor>
	//    7   13:invokevirtual   #32  <Method JavaType AnnotatedMember.getType()>
	//    8   16:astore_3        
			if(!serializerprovider.isEnabled(MapperFeature.USE_STATIC_TYPING) && !((JavaType) (obj)).isFinal())
	//*   9   17:aload_1         
	//*  10   18:getstatic       #180 <Field MapperFeature MapperFeature.USE_STATIC_TYPING>
	//*  11   21:invokevirtual   #184 <Method boolean SerializerProvider.isEnabled(MapperFeature)>
	//*  12   24:ifne            39
	//*  13   27:aload_3         
	//*  14   28:invokevirtual   #189 <Method boolean JavaType.isFinal()>
	//*  15   31:ifeq            37
	//*  16   34:goto            39
			{
				return ((JsonSerializer) (this));
	//   17   37:aload_0         
	//   18   38:areturn         
			} else
			{
				serializerprovider = ((SerializerProvider) (serializerprovider.findPrimaryPropertySerializer(((JavaType) (obj)), beanproperty)));
	//   19   39:aload_1         
	//   20   40:aload_3         
	//   21   41:aload_2         
	//   22   42:invokevirtual   #193 <Method JsonSerializer SerializerProvider.findPrimaryPropertySerializer(JavaType, BeanProperty)>
	//   23   45:astore_1        
				return ((JsonSerializer) (withResolved(beanproperty, ((JsonSerializer) (serializerprovider)), isNaturalTypeWithStdHandling(((JavaType) (obj)).getRawClass(), ((JsonSerializer) (serializerprovider))))));
	//   24   46:aload_0         
	//   25   47:aload_2         
	//   26   48:aload_1         
	//   27   49:aload_0         
	//   28   50:aload_3         
	//   29   51:invokevirtual   #196 <Method Class JavaType.getRawClass()>
	//   30   54:aload_1         
	//   31   55:invokevirtual   #200 <Method boolean isNaturalTypeWithStdHandling(Class, JsonSerializer)>
	//   32   58:invokevirtual   #204 <Method JsonValueSerializer withResolved(BeanProperty, JsonSerializer, boolean)>
	//   33   61:areturn         
			}
		} else
		{
			return ((JsonSerializer) (withResolved(beanproperty, serializerprovider.handlePrimaryContextualization(((JsonSerializer) (obj)), beanproperty), _forceTypeInformation)));
	//   34   62:aload_0         
	//   35   63:aload_2         
	//   36   64:aload_1         
	//   37   65:aload_3         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #208 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   40   70:aload_0         
	//   41   71:getfield        #43  <Field boolean _forceTypeInformation>
	//   42   74:invokevirtual   #204 <Method JsonValueSerializer withResolved(BeanProperty, JsonSerializer, boolean)>
	//   43   77:areturn         
		}
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		type = ((Type) (_valueSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field JsonSerializer _valueSerializer>
	//    2    4:astore_2        
		if(type instanceof SchemaAware)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #9   <Class SchemaAware>
	//*   5    9:ifeq            24
			return ((SchemaAware)type).getSchema(serializerprovider, ((Type) (null)));
	//    6   12:aload_2         
	//    7   13:checkcast       #9   <Class SchemaAware>
	//    8   16:aload_1         
	//    9   17:aconst_null     
	//   10   18:invokeinterface #213 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type)>
	//   11   23:areturn         
		else
			return JsonSchema.getDefaultSchemaNode();
	//   12   24:invokestatic    #219 <Method JsonNode JsonSchema.getDefaultSchemaNode()>
	//   13   27:areturn         
	}

	protected boolean isNaturalTypeWithStdHandling(Class class1, JsonSerializer jsonserializer)
	{
		if(class1.isPrimitive())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #222 <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            30
		{
			if(class1 != Integer.TYPE && class1 != Boolean.TYPE && class1 != Double.TYPE)
	//*   3    7:aload_1         
	//*   4    8:getstatic       #228 <Field Class Integer.TYPE>
	//*   5   11:if_acmpeq       56
	//*   6   14:aload_1         
	//*   7   15:getstatic       #231 <Field Class Boolean.TYPE>
	//*   8   18:if_acmpeq       56
	//*   9   21:aload_1         
	//*  10   22:getstatic       #234 <Field Class Double.TYPE>
	//*  11   25:if_acmpeq       56
				return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
		} else
		if(class1 != java/lang/String && class1 != java/lang/Integer && class1 != java/lang/Boolean && class1 != java/lang/Double)
	//*  14   30:aload_1         
	//*  15   31:ldc1            #91  <Class String>
	//*  16   33:if_acmpeq       56
	//*  17   36:aload_1         
	//*  18   37:ldc1            #224 <Class Integer>
	//*  19   39:if_acmpeq       56
	//*  20   42:aload_1         
	//*  21   43:ldc1            #230 <Class Boolean>
	//*  22   45:if_acmpeq       56
	//*  23   48:aload_1         
	//*  24   49:ldc1            #233 <Class Double>
	//*  25   51:if_acmpeq       56
			return false;
	//   26   54:iconst_0        
	//   27   55:ireturn         
		return isDefaultSerializer(jsonserializer);
	//   28   56:aload_0         
	//   29   57:aload_2         
	//   30   58:invokevirtual   #238 <Method boolean isDefaultSerializer(JsonSerializer)>
	//   31   61:ireturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj2 = _accessor.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnnotatedMember _accessor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #89  <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore          6
		Object obj1;
		if(obj2 == null)
	//*   5   10:aload           6
	//*   6   12:ifnonnull       21
		{
			JsonSerializer jsonserializer;
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//    7   15:aload_3         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #247 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				return;
	//   10   20:return          
			}
	//*  11   21:aload_0         
	//*  12   22:getfield        #39  <Field JsonSerializer _valueSerializer>
	//*  13   25:astore          5
	//*  14   27:aload           5
	//*  15   29:astore          4
	//*  16   31:aload           5
	//*  17   33:ifnonnull       52
	//*  18   36:aload_3         
	//*  19   37:aload           6
	//*  20   39:invokevirtual   #250 <Method Class Object.getClass()>
	//*  21   42:iconst_1        
	//*  22   43:aload_0         
	//*  23   44:getfield        #41  <Field BeanProperty _property>
	//*  24   47:invokevirtual   #253 <Method JsonSerializer SerializerProvider.findTypedValueSerializer(Class, boolean, BeanProperty)>
	//*  25   50:astore          4
	//*  26   52:aload           4
	//*  27   54:aload           6
	//*  28   56:aload_2         
	//*  29   57:aload_3         
	//*  30   58:invokevirtual   #255 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  31   61:return          
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*  32   62:astore_2        
			{
				obj1 = ((Object) (new StringBuilder()));
	//   33   63:new             #117 <Class StringBuilder>
	//   34   66:dup             
	//   35   67:invokespecial   #118 <Method void StringBuilder()>
	//   36   70:astore          4
			}
			break MISSING_BLOCK_LABEL_72;
		}
		jsonserializer = _valueSerializer;
		obj1 = ((Object) (jsonserializer));
		if(jsonserializer != null)
			break MISSING_BLOCK_LABEL_52;
		obj1 = ((Object) (serializerprovider.findTypedValueSerializer(obj2.getClass(), true, _property)));
		((JsonSerializer) (obj1)).serialize(obj2, jsongenerator, serializerprovider);
		return;
		((StringBuilder) (obj1)).append(_accessor.getName());
	//   37   72:aload           4
	//   38   74:aload_0         
	//   39   75:getfield        #37  <Field AnnotatedMember _accessor>
	//   40   78:invokevirtual   #122 <Method String AnnotatedMember.getName()>
	//   41   81:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   42   84:pop             
		((StringBuilder) (obj1)).append("()");
	//   43   85:aload           4
	//   44   87:ldc1            #128 <String "()">
	//   45   89:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   46   92:pop             
		wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), obj, ((StringBuilder) (obj1)).toString());
	//   47   93:aload_0         
	//   48   94:aload_3         
	//   49   95:aload_2         
	//   50   96:aload_1         
	//   51   97:aload           4
	//   52   99:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   53  102:invokevirtual   #259 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
		return;
	//   54  105:return          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		Object obj2 = _accessor.getValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field AnnotatedMember _accessor>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #89  <Method Object AnnotatedMember.getValue(Object)>
	//    4    8:astore          7
		if(obj2 == null)
	//*   5   10:aload           7
	//*   6   12:ifnonnull       21
		{
			Object obj1;
			JsonSerializer jsonserializer;
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//    7   15:aload_3         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #247 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				return;
	//   10   20:return          
			}
	//*  11   21:aload_0         
	//*  12   22:getfield        #39  <Field JsonSerializer _valueSerializer>
	//*  13   25:astore          6
	//*  14   27:aload           6
	//*  15   29:ifnonnull       50
	//*  16   32:aload_3         
	//*  17   33:aload           7
	//*  18   35:invokevirtual   #250 <Method Class Object.getClass()>
	//*  19   38:aload_0         
	//*  20   39:getfield        #41  <Field BeanProperty _property>
	//*  21   42:invokevirtual   #265 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//*  22   45:astore          5
	//*  23   47:goto            97
	//*  24   50:aload           6
	//*  25   52:astore          5
	//*  26   54:aload_0         
	//*  27   55:getfield        #43  <Field boolean _forceTypeInformation>
	//*  28   58:ifeq            97
	//*  29   61:aload           4
	//*  30   63:aload_2         
	//*  31   64:aload           4
	//*  32   66:aload_1         
	//*  33   67:getstatic       #271 <Field JsonToken JsonToken.VALUE_STRING>
	//*  34   70:invokevirtual   #277 <Method WritableTypeId TypeSerializer.typeId(Object, JsonToken)>
	//*  35   73:invokevirtual   #281 <Method WritableTypeId TypeSerializer.writeTypePrefix(JsonGenerator, WritableTypeId)>
	//*  36   76:astore          5
	//*  37   78:aload           6
	//*  38   80:aload           7
	//*  39   82:aload_2         
	//*  40   83:aload_3         
	//*  41   84:invokevirtual   #255 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  42   87:aload           4
	//*  43   89:aload_2         
	//*  44   90:aload           5
	//*  45   92:invokevirtual   #284 <Method WritableTypeId TypeSerializer.writeTypeSuffix(JsonGenerator, WritableTypeId)>
	//*  46   95:pop             
	//*  47   96:return          
	//*  48   97:aload           5
	//*  49   99:aload           7
	//*  50  101:aload_2         
	//*  51  102:aload_3         
	//*  52  103:new             #13  <Class JsonValueSerializer$TypeSerializerRerouter>
	//*  53  106:dup             
	//*  54  107:aload           4
	//*  55  109:aload_1         
	//*  56  110:invokespecial   #287 <Method void JsonValueSerializer$TypeSerializerRerouter(TypeSerializer, Object)>
	//*  57  113:invokevirtual   #289 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  58  116:return          
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator)
	//*  59  117:astore_2        
			{
				typeserializer = ((TypeSerializer) (new StringBuilder()));
	//   60  118:new             #117 <Class StringBuilder>
	//   61  121:dup             
	//   62  122:invokespecial   #118 <Method void StringBuilder()>
	//   63  125:astore          4
			}
			break MISSING_BLOCK_LABEL_127;
		}
		jsonserializer = _valueSerializer;
		if(jsonserializer != null)
			break MISSING_BLOCK_LABEL_50;
		obj1 = ((Object) (serializerprovider.findValueSerializer(obj2.getClass(), _property)));
		break MISSING_BLOCK_LABEL_97;
		obj1 = ((Object) (jsonserializer));
		if(_forceTypeInformation)
		{
			obj1 = ((Object) (typeserializer.writeTypePrefix(jsongenerator, typeserializer.typeId(obj, JsonToken.VALUE_STRING))));
			jsonserializer.serialize(obj2, jsongenerator, serializerprovider);
			typeserializer.writeTypeSuffix(jsongenerator, ((WritableTypeId) (obj1)));
			return;
		}
		((JsonSerializer) (obj1)).serializeWithType(obj2, jsongenerator, serializerprovider, ((TypeSerializer) (new TypeSerializerRerouter(typeserializer, obj))));
		return;
		((StringBuilder) (typeserializer)).append(_accessor.getName());
	//   64  127:aload           4
	//   65  129:aload_0         
	//   66  130:getfield        #37  <Field AnnotatedMember _accessor>
	//   67  133:invokevirtual   #122 <Method String AnnotatedMember.getName()>
	//   68  136:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   69  139:pop             
		((StringBuilder) (typeserializer)).append("()");
	//   70  140:aload           4
	//   71  142:ldc1            #128 <String "()">
	//   72  144:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   73  147:pop             
		wrapAndThrow(serializerprovider, ((Throwable) (jsongenerator)), obj, ((StringBuilder) (typeserializer)).toString());
	//   74  148:aload_0         
	//   75  149:aload_3         
	//   76  150:aload_2         
	//   77  151:aload_1         
	//   78  152:aload           4
	//   79  154:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   80  157:invokevirtual   #259 <Method void wrapAndThrow(SerializerProvider, Throwable, Object, String)>
		return;
	//   81  160:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #117 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #118 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("(@JsonValue serializer for method ");
	//    4    8:aload_1         
	//    5    9:ldc2            #291 <String "(@JsonValue serializer for method ">
	//    6   12:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(((Object) (_accessor.getDeclaringClass())));
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #37  <Field AnnotatedMember _accessor>
	//   11   21:invokevirtual   #148 <Method Class AnnotatedMember.getDeclaringClass()>
	//   12   24:invokevirtual   #294 <Method StringBuilder StringBuilder.append(Object)>
	//   13   27:pop             
		stringbuilder.append("#");
	//   14   28:aload_1         
	//   15   29:ldc2            #296 <String "#">
	//   16   32:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		stringbuilder.append(_accessor.getName());
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #37  <Field AnnotatedMember _accessor>
	//   21   41:invokevirtual   #122 <Method String AnnotatedMember.getName()>
	//   22   44:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append(")");
	//   24   48:aload_1         
	//   25   49:ldc2            #298 <String ")">
	//   26   52:invokevirtual   #126 <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
		return stringbuilder.toString();
	//   28   56:aload_1         
	//   29   57:invokevirtual   #131 <Method String StringBuilder.toString()>
	//   30   60:areturn         
	}

	public JsonValueSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, boolean flag)
	{
		if(_property == beanproperty && _valueSerializer == jsonserializer && flag == _forceTypeInformation)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       26
	//*   4    8:aload_0         
	//*   5    9:getfield        #39  <Field JsonSerializer _valueSerializer>
	//*   6   12:aload_2         
	//*   7   13:if_acmpne       26
	//*   8   16:iload_3         
	//*   9   17:aload_0         
	//*  10   18:getfield        #43  <Field boolean _forceTypeInformation>
	//*  11   21:icmpne          26
			return this;
	//   12   24:aload_0         
	//   13   25:areturn         
		else
			return new JsonValueSerializer(this, beanproperty, jsonserializer, flag);
	//   14   26:new             #2   <Class JsonValueSerializer>
	//   15   29:dup             
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:iload_3         
	//   20   34:invokespecial   #300 <Method void JsonValueSerializer(JsonValueSerializer, BeanProperty, JsonSerializer, boolean)>
	//   21   37:areturn         
	}

	protected final AnnotatedMember _accessor;
	protected final boolean _forceTypeInformation;
	protected final BeanProperty _property;
	protected final JsonSerializer _valueSerializer;
}
