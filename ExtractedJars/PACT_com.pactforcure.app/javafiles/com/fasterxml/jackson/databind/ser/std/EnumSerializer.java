// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonStringFormatVisitor;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdScalarSerializer

public class EnumSerializer extends StdScalarSerializer
	implements ContextualSerializer
{

	public EnumSerializer(EnumValues enumvalues)
	{
		this(enumvalues, ((Boolean) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #22  <Method void EnumSerializer(EnumValues, Boolean)>
	//    4    6:return          
	}

	public EnumSerializer(EnumValues enumvalues, Boolean boolean1)
	{
		super(enumvalues.getEnumClass(), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #30  <Method Class EnumValues.getEnumClass()>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #33  <Method void StdScalarSerializer(Class, boolean)>
		_values = enumvalues;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #35  <Field EnumValues _values>
		_serializeAsIndex = boolean1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #37  <Field Boolean _serializeAsIndex>
	//   11   19:return          
	}

	protected static Boolean _isShapeWrittenUsingIndex(Class class1, com.fasterxml.jackson.annotation.JsonFormat.Value value, boolean flag)
	{
		if(value == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
			value = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       20
	//*   6   10:aconst_null     
	//*   7   11:areturn         
			value = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (value.getShape()));
	//    8   12:aload_1         
	//    9   13:invokevirtual   #45  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//   10   16:astore_1        
		while(value == null || value == com.fasterxml.jackson.annotation.JsonFormat.Shape.ANY || value == com.fasterxml.jackson.annotation.JsonFormat.Shape.SCALAR) 
			return null;
	//   11   17:goto            6
	//   12   20:aload_1         
	//   13   21:getstatic       #51  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ANY>
	//   14   24:if_acmpeq       10
	//   15   27:aload_1         
	//   16   28:getstatic       #54  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.SCALAR>
	//   17   31:if_acmpeq       10
		if(value == com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING)
	//*  18   34:aload_1         
	//*  19   35:getstatic       #57  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
	//*  20   38:if_acmpne       45
			return Boolean.FALSE;
	//   21   41:getstatic       #62  <Field Boolean Boolean.FALSE>
	//   22   44:areturn         
		if(((com.fasterxml.jackson.annotation.JsonFormat.Shape) (value)).isNumeric() || value == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
	//*  23   45:aload_1         
	//*  24   46:invokevirtual   #66  <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Shape.isNumeric()>
	//*  25   49:ifne            59
	//*  26   52:aload_1         
	//*  27   53:getstatic       #69  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
	//*  28   56:if_acmpne       63
			return Boolean.TRUE;
	//   29   59:getstatic       #72  <Field Boolean Boolean.TRUE>
	//   30   62:areturn         
		value = ((com.fasterxml.jackson.annotation.JsonFormat.Value) ((new StringBuilder()).append("Unsupported serialization shape (").append(((Object) (value))).append(") for Enum ").append(class1.getName()).append(", not supported as ")));
	//   31   63:new             #74  <Class StringBuilder>
	//   32   66:dup             
	//   33   67:invokespecial   #77  <Method void StringBuilder()>
	//   34   70:ldc1            #79  <String "Unsupported serialization shape (">
	//   35   72:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:aload_1         
	//   37   76:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   38   79:ldc1            #88  <String ") for Enum ">
	//   39   81:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   40   84:aload_0         
	//   41   85:invokevirtual   #94  <Method String Class.getName()>
	//   42   88:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   43   91:ldc1            #96  <String ", not supported as ">
	//   44   93:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   45   96:astore_1        
		if(flag)
	//*  46   97:iload_2         
	//*  47   98:ifeq            125
			class1 = "class";
	//   48  101:ldc1            #98  <String "class">
	//   49  103:astore_0        
		else
	//*  50  104:new             #100 <Class IllegalArgumentException>
	//*  51  107:dup             
	//*  52  108:aload_1         
	//*  53  109:aload_0         
	//*  54  110:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//*  55  113:ldc1            #102 <String " annotation">
	//*  56  115:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//*  57  118:invokevirtual   #105 <Method String StringBuilder.toString()>
	//*  58  121:invokespecial   #108 <Method void IllegalArgumentException(String)>
	//*  59  124:athrow          
			class1 = "property";
	//   60  125:ldc1            #110 <String "property">
	//   61  127:astore_0        
		throw new IllegalArgumentException(((StringBuilder) (value)).append(((String) (class1))).append(" annotation").toString());
	//*  62  128:goto            104
	}

	public static EnumSerializer construct(Class class1, SerializationConfig serializationconfig, BeanDescription beandescription, com.fasterxml.jackson.annotation.JsonFormat.Value value)
	{
		return new EnumSerializer(EnumValues.constructFromName(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), class1), _isShapeWrittenUsingIndex(class1, value, true));
	//    0    0:new             #2   <Class EnumSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokestatic    #118 <Method EnumValues EnumValues.constructFromName(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:iconst_1        
	//    8   12:invokestatic    #120 <Method Boolean _isShapeWrittenUsingIndex(Class, com.fasterxml.jackson.annotation.JsonFormat$Value, boolean)>
	//    9   15:invokespecial   #22  <Method void EnumSerializer(EnumValues, Boolean)>
	//   10   18:areturn         
	}

	protected final boolean _serializeAsIndex(SerializerProvider serializerprovider)
	{
		if(_serializeAsIndex != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field Boolean _serializeAsIndex>
	//*   2    4:ifnull          15
			return _serializeAsIndex.booleanValue();
	//    3    7:aload_0         
	//    4    8:getfield        #37  <Field Boolean _serializeAsIndex>
	//    5   11:invokevirtual   #125 <Method boolean Boolean.booleanValue()>
	//    6   14:ireturn         
		else
			return serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
	//    7   15:aload_1         
	//    8   16:getstatic       #131 <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_INDEX>
	//    9   19:invokevirtual   #137 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//   10   22:ireturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		SerializerProvider serializerprovider = jsonformatvisitorwrapper.getProvider();
	//    0    0:aload_1         
	//    1    1:invokeinterface #147 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//    2    6:astore_3        
		if(_serializeAsIndex(serializerprovider))
	//*   3    7:aload_0         
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #149 <Method boolean _serializeAsIndex(SerializerProvider)>
	//*   6   12:ifeq            25
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.INT);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:getstatic       #155 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//   11   21:invokevirtual   #159 <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
		} else
	//*  12   24:return          
		{
			jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectStringFormat(javatype)));
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokeinterface #163 <Method JsonStringFormatVisitor JsonFormatVisitorWrapper.expectStringFormat(JavaType)>
	//   16   32:astore_1        
			if(jsonformatvisitorwrapper != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          24
			{
				javatype = ((JavaType) (new LinkedHashSet()));
	//   19   37:new             #165 <Class LinkedHashSet>
	//   20   40:dup             
	//   21   41:invokespecial   #166 <Method void LinkedHashSet()>
	//   22   44:astore_2        
				if(serializerprovider != null && serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*  23   45:aload_3         
	//*  24   46:ifnull          103
	//*  25   49:aload_3         
	//*  26   50:getstatic       #169 <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*  27   53:invokevirtual   #137 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  28   56:ifeq            103
				{
					for(Iterator iterator = _values.enums().iterator(); iterator.hasNext(); ((Set) (javatype)).add(((Object) (((Enum)iterator.next()).toString()))));
	//   29   59:aload_0         
	//   30   60:getfield        #35  <Field EnumValues _values>
	//   31   63:invokevirtual   #173 <Method List EnumValues.enums()>
	//   32   66:invokeinterface #179 <Method Iterator List.iterator()>
	//   33   71:astore_3        
	//   34   72:aload_3         
	//   35   73:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//   36   78:ifeq            149
	//   37   81:aload_2         
	//   38   82:aload_3         
	//   39   83:invokeinterface #188 <Method Object Iterator.next()>
	//   40   88:checkcast       #190 <Class Enum>
	//   41   91:invokevirtual   #191 <Method String Enum.toString()>
	//   42   94:invokeinterface #197 <Method boolean Set.add(Object)>
	//   43   99:pop             
				} else
	//*  44  100:goto            72
				{
					for(Iterator iterator1 = _values.values().iterator(); iterator1.hasNext(); ((Set) (javatype)).add(((Object) (((SerializableString)iterator1.next()).getValue()))));
	//   45  103:aload_0         
	//   46  104:getfield        #35  <Field EnumValues _values>
	//   47  107:invokevirtual   #201 <Method Collection EnumValues.values()>
	//   48  110:invokeinterface #204 <Method Iterator Collection.iterator()>
	//   49  115:astore_3        
	//   50  116:aload_3         
	//   51  117:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//   52  122:ifeq            149
	//   53  125:aload_2         
	//   54  126:aload_3         
	//   55  127:invokeinterface #188 <Method Object Iterator.next()>
	//   56  132:checkcast       #206 <Class SerializableString>
	//   57  135:invokeinterface #209 <Method String SerializableString.getValue()>
	//   58  140:invokeinterface #197 <Method boolean Set.add(Object)>
	//   59  145:pop             
				}
	//*  60  146:goto            116
				((JsonStringFormatVisitor) (jsonformatvisitorwrapper)).enumTypes(((Set) (javatype)));
	//   61  149:aload_1         
	//   62  150:aload_2         
	//   63  151:invokeinterface #215 <Method void JsonStringFormatVisitor.enumTypes(Set)>
				return;
	//   64  156:return          
			}
		}
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		EnumSerializer enumserializer = this;
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(beanproperty != null)
	//*   2    2:aload_2         
	//*   3    3:ifnull          64
		{
			serializerprovider = ((SerializerProvider) (serializerprovider.getAnnotationIntrospector().findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (beanproperty.getMember())))));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #222 <Method AnnotationIntrospector SerializerProvider.getAnnotationIntrospector()>
	//    6   10:aload_2         
	//    7   11:invokeinterface #228 <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanProperty.getMember()>
	//    8   16:invokevirtual   #234 <Method com.fasterxml.jackson.annotation.JsonFormat$Value AnnotationIntrospector.findFormat(com.fasterxml.jackson.databind.introspect.Annotated)>
	//    9   19:astore_1        
			enumserializer = this;
	//   10   20:aload_0         
	//   11   21:astore_3        
			if(serializerprovider != null)
	//*  12   22:aload_1         
	//*  13   23:ifnull          64
			{
				serializerprovider = ((SerializerProvider) (_isShapeWrittenUsingIndex(beanproperty.getType().getRawClass(), ((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)), false)));
	//   14   26:aload_2         
	//   15   27:invokeinterface #238 <Method JavaType BeanProperty.getType()>
	//   16   32:invokevirtual   #243 <Method Class JavaType.getRawClass()>
	//   17   35:aload_1         
	//   18   36:iconst_0        
	//   19   37:invokestatic    #120 <Method Boolean _isShapeWrittenUsingIndex(Class, com.fasterxml.jackson.annotation.JsonFormat$Value, boolean)>
	//   20   40:astore_1        
				enumserializer = this;
	//   21   41:aload_0         
	//   22   42:astore_3        
				if(serializerprovider != _serializeAsIndex)
	//*  23   43:aload_1         
	//*  24   44:aload_0         
	//*  25   45:getfield        #37  <Field Boolean _serializeAsIndex>
	//*  26   48:if_acmpeq       64
					enumserializer = new EnumSerializer(_values, ((Boolean) (serializerprovider)));
	//   27   51:new             #2   <Class EnumSerializer>
	//   28   54:dup             
	//   29   55:aload_0         
	//   30   56:getfield        #35  <Field EnumValues _values>
	//   31   59:aload_1         
	//   32   60:invokespecial   #22  <Method void EnumSerializer(EnumValues, Boolean)>
	//   33   63:astore_3        
			}
		}
		return ((JsonSerializer) (enumserializer));
	//   34   64:aload_3         
	//   35   65:areturn         
	}

	public EnumValues getEnumValues()
	{
		return _values;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field EnumValues _values>
	//    2    4:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		if(!_serializeAsIndex(serializerprovider)) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #149 <Method boolean _serializeAsIndex(SerializerProvider)>
	//    3    5:ifeq            18
_L1:
		ObjectNode objectnode = createSchemaNode("integer", true);
	//    4    8:aload_0         
	//    5    9:ldc1            #250 <String "integer">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #254 <Method ObjectNode createSchemaNode(String, boolean)>
	//    8   15:astore_3        
_L4:
		return ((JsonNode) (objectnode));
	//    9   16:aload_3         
	//   10   17:areturn         
_L2:
		ObjectNode objectnode1 = createSchemaNode("string", true);
	//   11   18:aload_0         
	//   12   19:ldc2            #256 <String "string">
	//   13   22:iconst_1        
	//   14   23:invokevirtual   #254 <Method ObjectNode createSchemaNode(String, boolean)>
	//   15   26:astore          4
		objectnode = objectnode1;
	//   16   28:aload           4
	//   17   30:astore_3        
		if(type == null)
			continue;
	//   18   31:aload_2         
	//   19   32:ifnull          16
		objectnode = objectnode1;
	//   20   35:aload           4
	//   21   37:astore_3        
		if(!serializerprovider.constructType(type).isEnumType())
			continue;
	//   22   38:aload_1         
	//   23   39:aload_2         
	//   24   40:invokevirtual   #260 <Method JavaType SerializerProvider.constructType(Type)>
	//   25   43:invokevirtual   #263 <Method boolean JavaType.isEnumType()>
	//   26   46:ifeq            16
		serializerprovider = ((SerializerProvider) (objectnode1.putArray("enum")));
	//   27   49:aload           4
	//   28   51:ldc2            #265 <String "enum">
	//   29   54:invokevirtual   #271 <Method ArrayNode ObjectNode.putArray(String)>
	//   30   57:astore_1        
		type = ((Type) (_values.values().iterator()));
	//   31   58:aload_0         
	//   32   59:getfield        #35  <Field EnumValues _values>
	//   33   62:invokevirtual   #201 <Method Collection EnumValues.values()>
	//   34   65:invokeinterface #204 <Method Iterator Collection.iterator()>
	//   35   70:astore_2        
		do
		{
			objectnode = objectnode1;
	//   36   71:aload           4
	//   37   73:astore_3        
			if(!((Iterator) (type)).hasNext())
				continue;
	//   38   74:aload_2         
	//   39   75:invokeinterface #184 <Method boolean Iterator.hasNext()>
	//   40   80:ifeq            16
			((ArrayNode) (serializerprovider)).add(((SerializableString)((Iterator) (type)).next()).getValue());
	//   41   83:aload_1         
	//   42   84:aload_2         
	//   43   85:invokeinterface #188 <Method Object Iterator.next()>
	//   44   90:checkcast       #206 <Class SerializableString>
	//   45   93:invokeinterface #209 <Method String SerializableString.getValue()>
	//   46   98:invokevirtual   #275 <Method ArrayNode ArrayNode.add(String)>
	//   47  101:pop             
		} while(true);
	//   48  102:goto            71
		if(true) goto _L4; else goto _L3
_L3:
	}

	public final void serialize(Enum enum, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_serializeAsIndex(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #149 <Method boolean _serializeAsIndex(SerializerProvider)>
	//*   3    5:ifeq            17
		{
			jsongenerator.writeNumber(enum.ordinal());
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #283 <Method int Enum.ordinal()>
	//    7   13:invokevirtual   #289 <Method void JsonGenerator.writeNumber(int)>
			return;
	//    8   16:return          
		}
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*   9   17:aload_3         
	//*  10   18:getstatic       #169 <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*  11   21:invokevirtual   #137 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifeq            36
		{
			jsongenerator.writeString(enum.toString());
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #191 <Method String Enum.toString()>
	//   16   32:invokevirtual   #292 <Method void JsonGenerator.writeString(String)>
			return;
	//   17   35:return          
		} else
		{
			jsongenerator.writeString(_values.serializedValueFor(enum));
	//   18   36:aload_2         
	//   19   37:aload_0         
	//   20   38:getfield        #35  <Field EnumValues _values>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #296 <Method SerializableString EnumValues.serializedValueFor(Enum)>
	//   23   45:invokevirtual   #299 <Method void JsonGenerator.writeString(SerializableString)>
			return;
	//   24   48:return          
		}
	}

	public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		serialize((Enum)obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #190 <Class Enum>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #303 <Method void serialize(Enum, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	private static final long serialVersionUID = 1L;
	protected final Boolean _serializeAsIndex;
	protected final EnumValues _values;
}
