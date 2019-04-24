// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.*;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import java.io.IOException;
import java.lang.reflect.*;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdSerializer

public class JsonValueSerializer extends StdSerializer
	implements ContextualSerializer, JsonFormatVisitable, SchemaAware
{

	public JsonValueSerializer(JsonValueSerializer jsonvalueserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, boolean flag)
	{
		super(_notNullClass(jsonvalueserializer.handledType()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #27  <Method Class handledType()>
	//    3    5:invokestatic    #31  <Method Class _notNullClass(Class)>
	//    4    8:invokespecial   #34  <Method void StdSerializer(Class)>
		_accessorMethod = jsonvalueserializer._accessorMethod;
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getfield        #36  <Field Method _accessorMethod>
	//    8   16:putfield        #36  <Field Method _accessorMethod>
		_valueSerializer = jsonserializer;
	//    9   19:aload_0         
	//   10   20:aload_3         
	//   11   21:putfield        #38  <Field JsonSerializer _valueSerializer>
		_property = beanproperty;
	//   12   24:aload_0         
	//   13   25:aload_2         
	//   14   26:putfield        #40  <Field BeanProperty _property>
		_forceTypeInformation = flag;
	//   15   29:aload_0         
	//   16   30:iload           4
	//   17   32:putfield        #42  <Field boolean _forceTypeInformation>
	//   18   35:return          
	}

	public JsonValueSerializer(Method method, JsonSerializer jsonserializer)
	{
		super(method.getReturnType(), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #51  <Method Class Method.getReturnType()>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #54  <Method void StdSerializer(Class, boolean)>
		_accessorMethod = method;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #36  <Field Method _accessorMethod>
		_valueSerializer = jsonserializer;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #38  <Field JsonSerializer _valueSerializer>
		_property = null;
	//   11   19:aload_0         
	//   12   20:aconst_null     
	//   13   21:putfield        #40  <Field BeanProperty _property>
		_forceTypeInformation = true;
	//   14   24:aload_0         
	//   15   25:iconst_1        
	//   16   26:putfield        #42  <Field boolean _forceTypeInformation>
	//   17   29:return          
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
	//    4    6:ldc1            #57  <Class Object>
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
	//    2    2:invokeinterface #70  <Method JsonStringFormatVisitor JsonFormatVisitorWrapper.expectStringFormat(JavaType)>
	//    3    7:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*   4    8:aload_1         
	//*   5    9:ifnull          151
		{
			LinkedHashSet linkedhashset = new LinkedHashSet();
	//    6   12:new             #72  <Class LinkedHashSet>
	//    7   15:dup             
	//    8   16:invokespecial   #75  <Method void LinkedHashSet()>
	//    9   19:astore          6
			class1 = ((Class) (class1.getEnumConstants()));
	//   10   21:aload_3         
	//   11   22:invokevirtual   #81  <Method Object[] Class.getEnumConstants()>
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
	//   20   37:icmpge          143
				javatype = ((JavaType) (class1[i]));
	//   21   40:aload_3         
	//   22   41:iload           4
	//   23   43:aaload          
	//   24   44:astore_2        
				try
				{
					((Set) (linkedhashset)).add(((Object) (String.valueOf(_accessorMethod.invoke(((Object) (javatype)), new Object[0])))));
	//   25   45:aload           6
	//   26   47:aload_0         
	//   27   48:getfield        #36  <Field Method _accessorMethod>
	//   28   51:aload_2         
	//   29   52:iconst_0        
	//   30   53:anewarray       Object[]
	//   31   56:invokevirtual   #85  <Method Object Method.invoke(Object, Object[])>
	//   32   59:invokestatic    #91  <Method String String.valueOf(Object)>
	//   33   62:invokeinterface #97  <Method boolean Set.add(Object)>
	//   34   67:pop             
				}
	//*  35   68:iload           4
	//*  36   70:iconst_1        
	//*  37   71:iadd            
	//*  38   72:istore          4
	//*  39   74:goto            33
				// Misplaced declaration of an exception variable
				catch(JsonFormatVisitorWrapper jsonformatvisitorwrapper)
	//*  40   77:astore_1        
				{
					for(; (jsonformatvisitorwrapper instanceof InvocationTargetException) && ((Throwable) (jsonformatvisitorwrapper)).getCause() != null; jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (((Throwable) (jsonformatvisitorwrapper)).getCause())));
	//   41   78:aload_1         
	//   42   79:instanceof      #99  <Class InvocationTargetException>
	//   43   82:ifeq            100
	//   44   85:aload_1         
	//   45   86:invokevirtual   #105 <Method Throwable Throwable.getCause()>
	//   46   89:ifnull          100
	//   47   92:aload_1         
	//   48   93:invokevirtual   #105 <Method Throwable Throwable.getCause()>
	//   49   96:astore_1        
	//*  50   97:goto            78
					if(jsonformatvisitorwrapper instanceof Error)
	//*  51  100:aload_1         
	//*  52  101:instanceof      #107 <Class Error>
	//*  53  104:ifeq            112
						throw (Error)jsonformatvisitorwrapper;
	//   54  107:aload_1         
	//   55  108:checkcast       #107 <Class Error>
	//   56  111:athrow          
					else
						throw JsonMappingException.wrapWithPath(((Throwable) (jsonformatvisitorwrapper)), ((Object) (javatype)), (new StringBuilder()).append(_accessorMethod.getName()).append("()").toString());
	//   57  112:aload_1         
	//   58  113:aload_2         
	//   59  114:new             #109 <Class StringBuilder>
	//   60  117:dup             
	//   61  118:invokespecial   #110 <Method void StringBuilder()>
	//   62  121:aload_0         
	//   63  122:getfield        #36  <Field Method _accessorMethod>
	//   64  125:invokevirtual   #114 <Method String Method.getName()>
	//   65  128:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   66  131:ldc1            #120 <String "()">
	//   67  133:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   68  136:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   69  139:invokestatic    #127 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   70  142:athrow          
				}
				i++;
			} while(true);
			((JsonStringFormatVisitor) (jsonformatvisitorwrapper)).enumTypes(((Set) (linkedhashset)));
	//   71  143:aload_1         
	//   72  144:aload           6
	//   73  146:invokeinterface #133 <Method void JsonStringFormatVisitor.enumTypes(Set)>
		}
		return true;
	//   74  151:iconst_1        
	//   75  152:ireturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		Object obj;
		Object obj1;
		if(javatype == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       47
			obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_3        
		else
	//*   4    6:aload_3         
	//*   5    7:astore          4
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       22
	//*   8   13:aload_0         
	//*   9   14:getfield        #36  <Field Method _accessorMethod>
	//*  10   17:invokevirtual   #140 <Method Class Method.getDeclaringClass()>
	//*  11   20:astore          4
	//*  12   22:aload           4
	//*  13   24:ifnull          55
	//*  14   27:aload           4
	//*  15   29:invokevirtual   #144 <Method boolean Class.isEnum()>
	//*  16   32:ifeq            55
	//*  17   35:aload_0         
	//*  18   36:aload_1         
	//*  19   37:aload_2         
	//*  20   38:aload           4
	//*  21   40:invokevirtual   #146 <Method boolean _acceptJsonFormatVisitorForEnum(JsonFormatVisitorWrapper, JavaType, Class)>
	//*  22   43:ifeq            55
	//*  23   46:return          
			obj = ((Object) (javatype.getRawClass()));
	//   24   47:aload_2         
	//   25   48:invokevirtual   #151 <Method Class JavaType.getRawClass()>
	//   26   51:astore_3        
		obj1 = obj;
		if(obj == null)
			obj1 = ((Object) (_accessorMethod.getDeclaringClass()));
		if(obj1 != null && ((Class) (obj1)).isEnum() && _acceptJsonFormatVisitorForEnum(jsonformatvisitorwrapper, javatype, ((Class) (obj1))))
			return;
	//*  27   52:goto            6
		obj = ((Object) (_valueSerializer));
	//   28   55:aload_0         
	//   29   56:getfield        #38  <Field JsonSerializer _valueSerializer>
	//   30   59:astore_3        
		obj1 = obj;
	//   31   60:aload_3         
	//   32   61:astore          4
		if(obj == null)
	//*  33   63:aload_3         
	//*  34   64:ifnonnull       142
		{
			JavaType javatype1 = javatype;
	//   35   67:aload_2         
	//   36   68:astore_3        
			if(javatype == null)
	//*  37   69:aload_2         
	//*  38   70:ifnonnull       110
			{
				if(_property != null)
	//*  39   73:aload_0         
	//*  40   74:getfield        #40  <Field BeanProperty _property>
	//*  41   77:ifnull          90
					javatype = _property.getType();
	//   42   80:aload_0         
	//   43   81:getfield        #40  <Field BeanProperty _property>
	//   44   84:invokeinterface #157 <Method JavaType BeanProperty.getType()>
	//   45   89:astore_2        
				javatype1 = javatype;
	//   46   90:aload_2         
	//   47   91:astore_3        
				if(javatype == null)
	//*  48   92:aload_2         
	//*  49   93:ifnonnull       110
					javatype1 = jsonformatvisitorwrapper.getProvider().constructType(((Type) (_handledType)));
	//   50   96:aload_1         
	//   51   97:invokeinterface #161 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   52  102:aload_0         
	//   53  103:getfield        #165 <Field Class _handledType>
	//   54  106:invokevirtual   #171 <Method JavaType SerializerProvider.constructType(Type)>
	//   55  109:astore_3        
			}
			javatype = ((JavaType) (jsonformatvisitorwrapper.getProvider().findTypedValueSerializer(javatype1, false, _property)));
	//   56  110:aload_1         
	//   57  111:invokeinterface #161 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//   58  116:aload_3         
	//   59  117:iconst_0        
	//   60  118:aload_0         
	//   61  119:getfield        #40  <Field BeanProperty _property>
	//   62  122:invokevirtual   #175 <Method JsonSerializer SerializerProvider.findTypedValueSerializer(JavaType, boolean, BeanProperty)>
	//   63  125:astore_2        
			obj1 = ((Object) (javatype));
	//   64  126:aload_2         
	//   65  127:astore          4
			if(javatype == null)
	//*  66  129:aload_2         
	//*  67  130:ifnonnull       142
			{
				jsonformatvisitorwrapper.expectAnyFormat(javatype1);
	//   68  133:aload_1         
	//   69  134:aload_3         
	//   70  135:invokeinterface #179 <Method com.fasterxml.jackson.databind.jsonFormatVisitors.JsonAnyFormatVisitor JsonFormatVisitorWrapper.expectAnyFormat(JavaType)>
	//   71  140:pop             
				return;
	//   72  141:return          
			}
		}
		((JsonSerializer) (obj1)).acceptJsonFormatVisitor(jsonformatvisitorwrapper, ((JavaType) (null)));
	//   73  142:aload           4
	//   74  144:aload_1         
	//   75  145:aconst_null     
	//   76  146:invokevirtual   #183 <Method void JsonSerializer.acceptJsonFormatVisitor(JsonFormatVisitorWrapper, JavaType)>
	//   77  149:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		Object obj;
label0:
		{
label1:
			{
				obj = ((Object) (_valueSerializer));
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field JsonSerializer _valueSerializer>
	//    2    4:astore_3        
				if(obj != null)
					break label0;
	//    3    5:aload_3         
	//    4    6:ifnonnull       74
				if(!serializerprovider.isEnabled(MapperFeature.USE_STATIC_TYPING))
	//*   5    9:aload_1         
	//*   6   10:getstatic       #191 <Field MapperFeature MapperFeature.USE_STATIC_TYPING>
	//*   7   13:invokevirtual   #195 <Method boolean SerializerProvider.isEnabled(MapperFeature)>
	//*   8   16:ifne            37
				{
					obj = ((Object) (this));
	//    9   19:aload_0         
	//   10   20:astore_3        
					if(!Modifier.isFinal(_accessorMethod.getReturnType().getModifiers()))
						break label1;
	//   11   21:aload_0         
	//   12   22:getfield        #36  <Field Method _accessorMethod>
	//   13   25:invokevirtual   #51  <Method Class Method.getReturnType()>
	//   14   28:invokevirtual   #199 <Method int Class.getModifiers()>
	//   15   31:invokestatic    #205 <Method boolean Modifier.isFinal(int)>
	//   16   34:ifeq            72
				}
				obj = ((Object) (serializerprovider.constructType(_accessorMethod.getGenericReturnType())));
	//   17   37:aload_1         
	//   18   38:aload_0         
	//   19   39:getfield        #36  <Field Method _accessorMethod>
	//   20   42:invokevirtual   #209 <Method Type Method.getGenericReturnType()>
	//   21   45:invokevirtual   #171 <Method JavaType SerializerProvider.constructType(Type)>
	//   22   48:astore_3        
				serializerprovider = ((SerializerProvider) (serializerprovider.findPrimaryPropertySerializer(((JavaType) (obj)), beanproperty)));
	//   23   49:aload_1         
	//   24   50:aload_3         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #213 <Method JsonSerializer SerializerProvider.findPrimaryPropertySerializer(JavaType, BeanProperty)>
	//   27   55:astore_1        
				obj = ((Object) (withResolved(beanproperty, ((JsonSerializer) (serializerprovider)), isNaturalTypeWithStdHandling(((JavaType) (obj)).getRawClass(), ((JsonSerializer) (serializerprovider))))));
	//   28   56:aload_0         
	//   29   57:aload_2         
	//   30   58:aload_1         
	//   31   59:aload_0         
	//   32   60:aload_3         
	//   33   61:invokevirtual   #151 <Method Class JavaType.getRawClass()>
	//   34   64:aload_1         
	//   35   65:invokevirtual   #217 <Method boolean isNaturalTypeWithStdHandling(Class, JsonSerializer)>
	//   36   68:invokevirtual   #221 <Method JsonValueSerializer withResolved(BeanProperty, JsonSerializer, boolean)>
	//   37   71:astore_3        
			}
			return ((JsonSerializer) (obj));
	//   38   72:aload_3         
	//   39   73:areturn         
		}
		return ((JsonSerializer) (withResolved(beanproperty, serializerprovider.handlePrimaryContextualization(((JsonSerializer) (obj)), beanproperty), _forceTypeInformation)));
	//   40   74:aload_0         
	//   41   75:aload_2         
	//   42   76:aload_1         
	//   43   77:aload_3         
	//   44   78:aload_2         
	//   45   79:invokevirtual   #225 <Method JsonSerializer SerializerProvider.handlePrimaryContextualization(JsonSerializer, BeanProperty)>
	//   46   82:aload_0         
	//   47   83:getfield        #42  <Field boolean _forceTypeInformation>
	//   48   86:invokevirtual   #221 <Method JsonValueSerializer withResolved(BeanProperty, JsonSerializer, boolean)>
	//   49   89:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
		throws JsonMappingException
	{
		if(_valueSerializer instanceof SchemaAware)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field JsonSerializer _valueSerializer>
	//*   2    4:instanceof      #11  <Class SchemaAware>
	//*   3    7:ifeq            25
			return ((SchemaAware)_valueSerializer).getSchema(serializerprovider, ((Type) (null)));
	//    4   10:aload_0         
	//    5   11:getfield        #38  <Field JsonSerializer _valueSerializer>
	//    6   14:checkcast       #11  <Class SchemaAware>
	//    7   17:aload_1         
	//    8   18:aconst_null     
	//    9   19:invokeinterface #230 <Method JsonNode SchemaAware.getSchema(SerializerProvider, Type)>
	//   10   24:areturn         
		else
			return JsonSchema.getDefaultSchemaNode();
	//   11   25:invokestatic    #236 <Method JsonNode JsonSchema.getDefaultSchemaNode()>
	//   12   28:areturn         
	}

	protected boolean isNaturalTypeWithStdHandling(Class class1, JsonSerializer jsonserializer)
	{
		if(class1.isPrimitive() ? class1 != Integer.TYPE && class1 != Boolean.TYPE && class1 != Double.TYPE : class1 != java/lang/String && class1 != java/lang/Integer && class1 != java/lang/Boolean && class1 != java/lang/Double)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #239 <Method boolean Class.isPrimitive()>
	//*   2    4:ifeq            30
	//*   3    7:aload_1         
	//*   4    8:getstatic       #244 <Field Class Integer.TYPE>
	//*   5   11:if_acmpeq       54
	//*   6   14:aload_1         
	//*   7   15:getstatic       #247 <Field Class Boolean.TYPE>
	//*   8   18:if_acmpeq       54
	//*   9   21:aload_1         
	//*  10   22:getstatic       #250 <Field Class Double.TYPE>
	//*  11   25:if_acmpeq       54
			return false;
	//   12   28:iconst_0        
	//   13   29:ireturn         
		else
	//*  14   30:aload_1         
	//*  15   31:ldc1            #87  <Class String>
	//*  16   33:if_acmpeq       54
	//*  17   36:aload_1         
	//*  18   37:ldc1            #241 <Class Integer>
	//*  19   39:if_acmpeq       54
	//*  20   42:aload_1         
	//*  21   43:ldc1            #246 <Class Boolean>
	//*  22   45:if_acmpeq       54
	//*  23   48:aload_1         
	//*  24   49:ldc1            #249 <Class Double>
	//*  25   51:if_acmpne       28
			return isDefaultSerializer(jsonserializer);
	//   26   54:aload_0         
	//   27   55:aload_2         
	//   28   56:invokevirtual   #254 <Method boolean isDefaultSerializer(JsonSerializer)>
	//   29   59:ireturn         
	}

	public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		Object obj1 = _accessorMethod.invoke(obj, new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Method _accessorMethod>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #85  <Method Object Method.invoke(Object, Object[])>
	//    6   12:astore          6
		if(obj1 == null)
	//*   7   14:aload           6
	//*   8   16:ifnonnull       25
		{
			JsonSerializer jsonserializer;
			JsonSerializer jsonserializer1;
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//    9   19:aload_3         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #263 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				return;
	//   12   24:return          
			}
	//*  13   25:aload_0         
	//*  14   26:getfield        #38  <Field JsonSerializer _valueSerializer>
	//*  15   29:astore          5
	//*  16   31:aload           5
	//*  17   33:astore          4
	//*  18   35:aload           5
	//*  19   37:ifnonnull       56
	//*  20   40:aload_3         
	//*  21   41:aload           6
	//*  22   43:invokevirtual   #266 <Method Class Object.getClass()>
	//*  23   46:iconst_1        
	//*  24   47:aload_0         
	//*  25   48:getfield        #40  <Field BeanProperty _property>
	//*  26   51:invokevirtual   #269 <Method JsonSerializer SerializerProvider.findTypedValueSerializer(Class, boolean, BeanProperty)>
	//*  27   54:astore          4
	//*  28   56:aload           4
	//*  29   58:aload           6
	//*  30   60:aload_2         
	//*  31   61:aload_3         
	//*  32   62:invokevirtual   #271 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  33   65:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  34   66:astore_1        
			{
				throw obj;
	//   35   67:aload_1         
	//   36   68:athrow          
			}
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator) { }
	//   37   69:astore_2        
			break MISSING_BLOCK_LABEL_70;
		}
		jsonserializer1 = _valueSerializer;
		jsonserializer = jsonserializer1;
		if(jsonserializer1 != null)
			break MISSING_BLOCK_LABEL_56;
		jsonserializer = serializerprovider.findTypedValueSerializer(obj1.getClass(), true, _property);
		jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
		return;
		for(; (jsongenerator instanceof InvocationTargetException) && ((Throwable) (jsongenerator)).getCause() != null; jsongenerator = ((JsonGenerator) (((Throwable) (jsongenerator)).getCause())));
	//   38   70:aload_2         
	//   39   71:instanceof      #99  <Class InvocationTargetException>
	//   40   74:ifeq            92
	//   41   77:aload_2         
	//   42   78:invokevirtual   #105 <Method Throwable Throwable.getCause()>
	//   43   81:ifnull          92
	//   44   84:aload_2         
	//   45   85:invokevirtual   #105 <Method Throwable Throwable.getCause()>
	//   46   88:astore_2        
	//*  47   89:goto            70
		if(jsongenerator instanceof Error)
	//*  48   92:aload_2         
	//*  49   93:instanceof      #107 <Class Error>
	//*  50   96:ifeq            104
			throw (Error)jsongenerator;
	//   51   99:aload_2         
	//   52  100:checkcast       #107 <Class Error>
	//   53  103:athrow          
		else
			throw JsonMappingException.wrapWithPath(((Throwable) (jsongenerator)), obj, (new StringBuilder()).append(_accessorMethod.getName()).append("()").toString());
	//   54  104:aload_2         
	//   55  105:aload_1         
	//   56  106:new             #109 <Class StringBuilder>
	//   57  109:dup             
	//   58  110:invokespecial   #110 <Method void StringBuilder()>
	//   59  113:aload_0         
	//   60  114:getfield        #36  <Field Method _accessorMethod>
	//   61  117:invokevirtual   #114 <Method String Method.getName()>
	//   62  120:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   63  123:ldc1            #120 <String "()">
	//   64  125:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   65  128:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   66  131:invokestatic    #127 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   67  134:athrow          
	}

	public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
		throws IOException
	{
		Object obj1 = _accessorMethod.invoke(obj, new Object[0]);
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Method _accessorMethod>
	//    2    4:aload_1         
	//    3    5:iconst_0        
	//    4    6:anewarray       Object[]
	//    5    9:invokevirtual   #85  <Method Object Method.invoke(Object, Object[])>
	//    6   12:astore          7
		if(obj1 == null)
	//*   7   14:aload           7
	//*   8   16:ifnonnull       25
		{
			JsonSerializer jsonserializer;
			JsonSerializer jsonserializer1;
			try
			{
				serializerprovider.defaultSerializeNull(jsongenerator);
	//    9   19:aload_3         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #263 <Method void SerializerProvider.defaultSerializeNull(JsonGenerator)>
				return;
	//   12   24:return          
			}
	//*  13   25:aload_0         
	//*  14   26:getfield        #38  <Field JsonSerializer _valueSerializer>
	//*  15   29:astore          6
	//*  16   31:aload           6
	//*  17   33:ifnonnull       66
	//*  18   36:aload_3         
	//*  19   37:aload           7
	//*  20   39:invokevirtual   #266 <Method Class Object.getClass()>
	//*  21   42:aload_0         
	//*  22   43:getfield        #40  <Field BeanProperty _property>
	//*  23   46:invokevirtual   #277 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//*  24   49:astore          5
	//*  25   51:aload           5
	//*  26   53:aload           7
	//*  27   55:aload_2         
	//*  28   56:aload_3         
	//*  29   57:aload           4
	//*  30   59:invokevirtual   #279 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
	//*  31   62:return          
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  32   63:astore_1        
			{
				throw obj;
	//   33   64:aload_1         
	//   34   65:athrow          
			}
	//*  35   66:aload           6
	//*  36   68:astore          5
	//*  37   70:aload_0         
	//*  38   71:getfield        #42  <Field boolean _forceTypeInformation>
	//*  39   74:ifeq            51
	//*  40   77:aload           4
	//*  41   79:aload_1         
	//*  42   80:aload_2         
	//*  43   81:invokevirtual   #285 <Method void TypeSerializer.writeTypePrefixForScalar(Object, JsonGenerator)>
	//*  44   84:aload           6
	//*  45   86:aload           7
	//*  46   88:aload_2         
	//*  47   89:aload_3         
	//*  48   90:invokevirtual   #271 <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
	//*  49   93:aload           4
	//*  50   95:aload_1         
	//*  51   96:aload_2         
	//*  52   97:invokevirtual   #288 <Method void TypeSerializer.writeTypeSuffixForScalar(Object, JsonGenerator)>
	//*  53  100:return          
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator) { }
	//   54  101:astore_2        
			break MISSING_BLOCK_LABEL_102;
		}
		jsonserializer1 = _valueSerializer;
		if(jsonserializer1 != null) goto _L2; else goto _L1
_L1:
		jsonserializer = serializerprovider.findValueSerializer(obj1.getClass(), _property);
_L4:
		jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
		return;
_L2:
		jsonserializer = jsonserializer1;
		if(!_forceTypeInformation) goto _L4; else goto _L3
_L3:
		typeserializer.writeTypePrefixForScalar(obj, jsongenerator);
		jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
		typeserializer.writeTypeSuffixForScalar(obj, jsongenerator);
		return;
		for(; (jsongenerator instanceof InvocationTargetException) && ((Throwable) (jsongenerator)).getCause() != null; jsongenerator = ((JsonGenerator) (((Throwable) (jsongenerator)).getCause())));
	//   55  102:aload_2         
	//   56  103:instanceof      #99  <Class InvocationTargetException>
	//   57  106:ifeq            124
	//   58  109:aload_2         
	//   59  110:invokevirtual   #105 <Method Throwable Throwable.getCause()>
	//   60  113:ifnull          124
	//   61  116:aload_2         
	//   62  117:invokevirtual   #105 <Method Throwable Throwable.getCause()>
	//   63  120:astore_2        
	//*  64  121:goto            102
		if(jsongenerator instanceof Error)
	//*  65  124:aload_2         
	//*  66  125:instanceof      #107 <Class Error>
	//*  67  128:ifeq            136
			throw (Error)jsongenerator;
	//   68  131:aload_2         
	//   69  132:checkcast       #107 <Class Error>
	//   70  135:athrow          
		else
			throw JsonMappingException.wrapWithPath(((Throwable) (jsongenerator)), obj, (new StringBuilder()).append(_accessorMethod.getName()).append("()").toString());
	//   71  136:aload_2         
	//   72  137:aload_1         
	//   73  138:new             #109 <Class StringBuilder>
	//   74  141:dup             
	//   75  142:invokespecial   #110 <Method void StringBuilder()>
	//   76  145:aload_0         
	//   77  146:getfield        #36  <Field Method _accessorMethod>
	//   78  149:invokevirtual   #114 <Method String Method.getName()>
	//   79  152:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   80  155:ldc1            #120 <String "()">
	//   81  157:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   82  160:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   83  163:invokestatic    #127 <Method JsonMappingException JsonMappingException.wrapWithPath(Throwable, Object, String)>
	//   84  166:athrow          
	}

	public String toString()
	{
		return (new StringBuilder()).append("(@JsonValue serializer for method ").append(((Object) (_accessorMethod.getDeclaringClass()))).append("#").append(_accessorMethod.getName()).append(")").toString();
	//    0    0:new             #109 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #110 <Method void StringBuilder()>
	//    3    7:ldc2            #290 <String "(@JsonValue serializer for method ">
	//    4   10:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:getfield        #36  <Field Method _accessorMethod>
	//    7   17:invokevirtual   #140 <Method Class Method.getDeclaringClass()>
	//    8   20:invokevirtual   #293 <Method StringBuilder StringBuilder.append(Object)>
	//    9   23:ldc2            #295 <String "#">
	//   10   26:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   11   29:aload_0         
	//   12   30:getfield        #36  <Field Method _accessorMethod>
	//   13   33:invokevirtual   #114 <Method String Method.getName()>
	//   14   36:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   15   39:ldc2            #297 <String ")">
	//   16   42:invokevirtual   #118 <Method StringBuilder StringBuilder.append(String)>
	//   17   45:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   18   48:areturn         
	}

	public JsonValueSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, boolean flag)
	{
		if(_property == beanproperty && _valueSerializer == jsonserializer && flag == _forceTypeInformation)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field BeanProperty _property>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       26
	//*   4    8:aload_0         
	//*   5    9:getfield        #38  <Field JsonSerializer _valueSerializer>
	//*   6   12:aload_2         
	//*   7   13:if_acmpne       26
	//*   8   16:iload_3         
	//*   9   17:aload_0         
	//*  10   18:getfield        #42  <Field boolean _forceTypeInformation>
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
	//   20   34:invokespecial   #299 <Method void JsonValueSerializer(JsonValueSerializer, BeanProperty, JsonSerializer, boolean)>
	//   21   37:areturn         
	}

	protected final Method _accessorMethod;
	protected final boolean _forceTypeInformation;
	protected final BeanProperty _property;
	protected final JsonSerializer _valueSerializer;
}
