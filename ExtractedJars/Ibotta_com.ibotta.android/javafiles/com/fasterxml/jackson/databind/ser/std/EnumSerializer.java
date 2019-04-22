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

	public EnumSerializer(EnumValues enumvalues, Boolean boolean1)
	{
		super(enumvalues.getEnumClass(), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #24  <Method Class EnumValues.getEnumClass()>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #27  <Method void StdScalarSerializer(Class, boolean)>
		_values = enumvalues;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #29  <Field EnumValues _values>
		_serializeAsIndex = boolean1;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #31  <Field Boolean _serializeAsIndex>
	//   11   19:return          
	}

	protected static Boolean _isShapeWrittenUsingIndex(Class class1, com.fasterxml.jackson.annotation.JsonFormat.Value value, boolean flag, Boolean boolean1)
	{
		if(value == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			value = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            14
			value = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (value.getShape()));
	//    5    9:aload_1         
	//    6   10:invokevirtual   #40  <Method com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Value.getShape()>
	//    7   13:astore_1        
		if(value == null)
	//*   8   14:aload_1         
	//*   9   15:ifnonnull       20
			return boolean1;
	//   10   18:aload_3         
	//   11   19:areturn         
		if(value != com.fasterxml.jackson.annotation.JsonFormat.Shape.ANY)
	//*  12   20:aload_1         
	//*  13   21:getstatic       #46  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ANY>
	//*  14   24:if_acmpeq       125
		{
			if(value == com.fasterxml.jackson.annotation.JsonFormat.Shape.SCALAR)
	//*  15   27:aload_1         
	//*  16   28:getstatic       #49  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.SCALAR>
	//*  17   31:if_acmpne       36
				return boolean1;
	//   18   34:aload_3         
	//   19   35:areturn         
			if(value != com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING && value != com.fasterxml.jackson.annotation.JsonFormat.Shape.NATURAL)
	//*  20   36:aload_1         
	//*  21   37:getstatic       #52  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.STRING>
	//*  22   40:if_acmpeq       121
	//*  23   43:aload_1         
	//*  24   44:getstatic       #55  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.NATURAL>
	//*  25   47:if_acmpne       53
	//*  26   50:goto            121
			{
				if(!((com.fasterxml.jackson.annotation.JsonFormat.Shape) (value)).isNumeric() && value != com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
	//*  27   53:aload_1         
	//*  28   54:invokevirtual   #59  <Method boolean com.fasterxml.jackson.annotation.JsonFormat$Shape.isNumeric()>
	//*  29   57:ifne            117
	//*  30   60:aload_1         
	//*  31   61:getstatic       #62  <Field com.fasterxml.jackson.annotation.JsonFormat$Shape com.fasterxml.jackson.annotation.JsonFormat$Shape.ARRAY>
	//*  32   64:if_acmpne       70
	//*  33   67:goto            117
				{
					boolean1 = ((Boolean) (class1.getName()));
	//   34   70:aload_0         
	//   35   71:invokevirtual   #68  <Method String Class.getName()>
	//   36   74:astore_3        
					if(flag)
	//*  37   75:iload_2         
	//*  38   76:ifeq            85
						class1 = "class";
	//   39   79:ldc1            #70  <String "class">
	//   40   81:astore_0        
					else
	//*  41   82:goto            88
						class1 = "property";
	//   42   85:ldc1            #72  <String "property">
	//   43   87:astore_0        
					throw new IllegalArgumentException(String.format("Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation", new Object[] {
						value, boolean1, class1
					}));
	//   44   88:new             #74  <Class IllegalArgumentException>
	//   45   91:dup             
	//   46   92:ldc1            #76  <String "Unsupported serialization shape (%s) for Enum %s, not supported as %s annotation">
	//   47   94:iconst_3        
	//   48   95:anewarray       Object[]
	//   49   98:dup             
	//   50   99:iconst_0        
	//   51  100:aload_1         
	//   52  101:aastore         
	//   53  102:dup             
	//   54  103:iconst_1        
	//   55  104:aload_3         
	//   56  105:aastore         
	//   57  106:dup             
	//   58  107:iconst_2        
	//   59  108:aload_0         
	//   60  109:aastore         
	//   61  110:invokestatic    #84  <Method String String.format(String, Object[])>
	//   62  113:invokespecial   #87  <Method void IllegalArgumentException(String)>
	//   63  116:athrow          
				} else
				{
					return Boolean.TRUE;
	//   64  117:getstatic       #92  <Field Boolean Boolean.TRUE>
	//   65  120:areturn         
				}
			} else
			{
				return Boolean.FALSE;
	//   66  121:getstatic       #95  <Field Boolean Boolean.FALSE>
	//   67  124:areturn         
			}
		} else
		{
			return boolean1;
	//   68  125:aload_3         
	//   69  126:areturn         
		}
	}

	public static EnumSerializer construct(Class class1, SerializationConfig serializationconfig, BeanDescription beandescription, com.fasterxml.jackson.annotation.JsonFormat.Value value)
	{
		return new EnumSerializer(EnumValues.constructFromName(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), class1), _isShapeWrittenUsingIndex(class1, value, true, ((Boolean) (null))));
	//    0    0:new             #2   <Class EnumSerializer>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokestatic    #103 <Method EnumValues EnumValues.constructFromName(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//    5    9:aload_0         
	//    6   10:aload_3         
	//    7   11:iconst_1        
	//    8   12:aconst_null     
	//    9   13:invokestatic    #105 <Method Boolean _isShapeWrittenUsingIndex(Class, com.fasterxml.jackson.annotation.JsonFormat$Value, boolean, Boolean)>
	//   10   16:invokespecial   #107 <Method void EnumSerializer(EnumValues, Boolean)>
	//   11   19:areturn         
	}

	protected final boolean _serializeAsIndex(SerializerProvider serializerprovider)
	{
		Boolean boolean1 = _serializeAsIndex;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Boolean _serializeAsIndex>
	//    2    4:astore_2        
		if(boolean1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			return boolean1.booleanValue();
	//    5    9:aload_2         
	//    6   10:invokevirtual   #112 <Method boolean Boolean.booleanValue()>
	//    7   13:ireturn         
		else
			return serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX);
	//    8   14:aload_1         
	//    9   15:getstatic       #118 <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_INDEX>
	//   10   18:invokevirtual   #124 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//   11   21:ireturn         
	}

	public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
		throws JsonMappingException
	{
		SerializerProvider serializerprovider = jsonformatvisitorwrapper.getProvider();
	//    0    0:aload_1         
	//    1    1:invokeinterface #134 <Method SerializerProvider JsonFormatVisitorWrapper.getProvider()>
	//    2    6:astore_3        
		if(_serializeAsIndex(serializerprovider))
	//*   3    7:aload_0         
	//*   4    8:aload_3         
	//*   5    9:invokevirtual   #136 <Method boolean _serializeAsIndex(SerializerProvider)>
	//*   6   12:ifeq            25
		{
			visitIntFormat(jsonformatvisitorwrapper, javatype, com.fasterxml.jackson.core.JsonParser.NumberType.INT);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:getstatic       #142 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//   11   21:invokevirtual   #146 <Method void visitIntFormat(JsonFormatVisitorWrapper, JavaType, com.fasterxml.jackson.core.JsonParser$NumberType)>
			return;
	//   12   24:return          
		}
		jsonformatvisitorwrapper = ((JsonFormatVisitorWrapper) (jsonformatvisitorwrapper.expectStringFormat(javatype)));
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:invokeinterface #150 <Method JsonStringFormatVisitor JsonFormatVisitorWrapper.expectStringFormat(JavaType)>
	//   16   32:astore_1        
		if(jsonformatvisitorwrapper != null)
	//*  17   33:aload_1         
	//*  18   34:ifnull          156
		{
			javatype = ((JavaType) (new LinkedHashSet()));
	//   19   37:new             #152 <Class LinkedHashSet>
	//   20   40:dup             
	//   21   41:invokespecial   #155 <Method void LinkedHashSet()>
	//   22   44:astore_2        
			if(serializerprovider != null && serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*  23   45:aload_3         
	//*  24   46:ifnull          103
	//*  25   49:aload_3         
	//*  26   50:getstatic       #158 <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*  27   53:invokevirtual   #124 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  28   56:ifeq            103
			{
				for(Iterator iterator = _values.enums().iterator(); iterator.hasNext(); ((Set) (javatype)).add(((Object) (((Enum)iterator.next()).toString()))));
	//   29   59:aload_0         
	//   30   60:getfield        #29  <Field EnumValues _values>
	//   31   63:invokevirtual   #162 <Method List EnumValues.enums()>
	//   32   66:invokeinterface #168 <Method Iterator List.iterator()>
	//   33   71:astore_3        
	//   34   72:aload_3         
	//   35   73:invokeinterface #173 <Method boolean Iterator.hasNext()>
	//   36   78:ifeq            149
	//   37   81:aload_2         
	//   38   82:aload_3         
	//   39   83:invokeinterface #177 <Method Object Iterator.next()>
	//   40   88:checkcast       #179 <Class Enum>
	//   41   91:invokevirtual   #182 <Method String Enum.toString()>
	//   42   94:invokeinterface #188 <Method boolean Set.add(Object)>
	//   43   99:pop             
			} else
	//*  44  100:goto            72
			{
				for(Iterator iterator1 = _values.values().iterator(); iterator1.hasNext(); ((Set) (javatype)).add(((Object) (((SerializableString)iterator1.next()).getValue()))));
	//   45  103:aload_0         
	//   46  104:getfield        #29  <Field EnumValues _values>
	//   47  107:invokevirtual   #192 <Method Collection EnumValues.values()>
	//   48  110:invokeinterface #195 <Method Iterator Collection.iterator()>
	//   49  115:astore_3        
	//   50  116:aload_3         
	//   51  117:invokeinterface #173 <Method boolean Iterator.hasNext()>
	//   52  122:ifeq            149
	//   53  125:aload_2         
	//   54  126:aload_3         
	//   55  127:invokeinterface #177 <Method Object Iterator.next()>
	//   56  132:checkcast       #197 <Class SerializableString>
	//   57  135:invokeinterface #200 <Method String SerializableString.getValue()>
	//   58  140:invokeinterface #188 <Method boolean Set.add(Object)>
	//   59  145:pop             
			}
	//*  60  146:goto            116
			((JsonStringFormatVisitor) (jsonformatvisitorwrapper)).enumTypes(((Set) (javatype)));
	//   61  149:aload_1         
	//   62  150:aload_2         
	//   63  151:invokeinterface #206 <Method void JsonStringFormatVisitor.enumTypes(Set)>
		}
	//   64  156:return          
	}

	public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (findFormatOverrides(serializerprovider, beanproperty, handledType())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #212 <Method Class handledType()>
	//    5    7:invokevirtual   #216 <Method com.fasterxml.jackson.annotation.JsonFormat$Value findFormatOverrides(SerializerProvider, BeanProperty, Class)>
	//    6   10:astore_1        
		if(serializerprovider != null)
	//*   7   11:aload_1         
	//*   8   12:ifnull          50
		{
			serializerprovider = ((SerializerProvider) (_isShapeWrittenUsingIndex(handledType(), ((com.fasterxml.jackson.annotation.JsonFormat.Value) (serializerprovider)), false, _serializeAsIndex)));
	//    9   15:aload_0         
	//   10   16:invokevirtual   #212 <Method Class handledType()>
	//   11   19:aload_1         
	//   12   20:iconst_0        
	//   13   21:aload_0         
	//   14   22:getfield        #31  <Field Boolean _serializeAsIndex>
	//   15   25:invokestatic    #105 <Method Boolean _isShapeWrittenUsingIndex(Class, com.fasterxml.jackson.annotation.JsonFormat$Value, boolean, Boolean)>
	//   16   28:astore_1        
			if(serializerprovider != _serializeAsIndex)
	//*  17   29:aload_1         
	//*  18   30:aload_0         
	//*  19   31:getfield        #31  <Field Boolean _serializeAsIndex>
	//*  20   34:if_acmpeq       50
				return ((JsonSerializer) (new EnumSerializer(_values, ((Boolean) (serializerprovider)))));
	//   21   37:new             #2   <Class EnumSerializer>
	//   22   40:dup             
	//   23   41:aload_0         
	//   24   42:getfield        #29  <Field EnumValues _values>
	//   25   45:aload_1         
	//   26   46:invokespecial   #107 <Method void EnumSerializer(EnumValues, Boolean)>
	//   27   49:areturn         
		}
		return ((JsonSerializer) (this));
	//   28   50:aload_0         
	//   29   51:areturn         
	}

	public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
	{
		if(_serializeAsIndex(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #136 <Method boolean _serializeAsIndex(SerializerProvider)>
	//*   3    5:ifeq            16
			return ((JsonNode) (createSchemaNode("integer", true)));
	//    4    8:aload_0         
	//    5    9:ldc1            #221 <String "integer">
	//    6   11:iconst_1        
	//    7   12:invokevirtual   #225 <Method ObjectNode createSchemaNode(String, boolean)>
	//    8   15:areturn         
		ObjectNode objectnode = createSchemaNode("string", true);
	//    9   16:aload_0         
	//   10   17:ldc1            #227 <String "string">
	//   11   19:iconst_1        
	//   12   20:invokevirtual   #225 <Method ObjectNode createSchemaNode(String, boolean)>
	//   13   23:astore_3        
		if(type != null && serializerprovider.constructType(type).isEnumType())
	//*  14   24:aload_2         
	//*  15   25:ifnull          90
	//*  16   28:aload_1         
	//*  17   29:aload_2         
	//*  18   30:invokevirtual   #231 <Method JavaType SerializerProvider.constructType(Type)>
	//*  19   33:invokevirtual   #236 <Method boolean JavaType.isEnumType()>
	//*  20   36:ifeq            90
		{
			serializerprovider = ((SerializerProvider) (objectnode.putArray("enum")));
	//   21   39:aload_3         
	//   22   40:ldc1            #238 <String "enum">
	//   23   42:invokevirtual   #244 <Method ArrayNode ObjectNode.putArray(String)>
	//   24   45:astore_1        
			for(type = ((Type) (_values.values().iterator())); ((Iterator) (type)).hasNext(); ((ArrayNode) (serializerprovider)).add(((SerializableString)((Iterator) (type)).next()).getValue()));
	//   25   46:aload_0         
	//   26   47:getfield        #29  <Field EnumValues _values>
	//   27   50:invokevirtual   #192 <Method Collection EnumValues.values()>
	//   28   53:invokeinterface #195 <Method Iterator Collection.iterator()>
	//   29   58:astore_2        
	//   30   59:aload_2         
	//   31   60:invokeinterface #173 <Method boolean Iterator.hasNext()>
	//   32   65:ifeq            90
	//   33   68:aload_1         
	//   34   69:aload_2         
	//   35   70:invokeinterface #177 <Method Object Iterator.next()>
	//   36   75:checkcast       #197 <Class SerializableString>
	//   37   78:invokeinterface #200 <Method String SerializableString.getValue()>
	//   38   83:invokevirtual   #248 <Method ArrayNode ArrayNode.add(String)>
	//   39   86:pop             
		}
	//*  40   87:goto            59
		return ((JsonNode) (objectnode));
	//   41   90:aload_3         
	//   42   91:areturn         
	}

	public final void serialize(Enum enum, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws IOException
	{
		if(_serializeAsIndex(serializerprovider))
	//*   0    0:aload_0         
	//*   1    1:aload_3         
	//*   2    2:invokevirtual   #136 <Method boolean _serializeAsIndex(SerializerProvider)>
	//*   3    5:ifeq            17
		{
			jsongenerator.writeNumber(enum.ordinal());
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #256 <Method int Enum.ordinal()>
	//    7   13:invokevirtual   #262 <Method void JsonGenerator.writeNumber(int)>
			return;
	//    8   16:return          
		}
		if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
	//*   9   17:aload_3         
	//*  10   18:getstatic       #158 <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
	//*  11   21:invokevirtual   #124 <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
	//*  12   24:ifeq            36
		{
			jsongenerator.writeString(enum.toString());
	//   13   27:aload_2         
	//   14   28:aload_1         
	//   15   29:invokevirtual   #182 <Method String Enum.toString()>
	//   16   32:invokevirtual   #265 <Method void JsonGenerator.writeString(String)>
			return;
	//   17   35:return          
		} else
		{
			jsongenerator.writeString(_values.serializedValueFor(enum));
	//   18   36:aload_2         
	//   19   37:aload_0         
	//   20   38:getfield        #29  <Field EnumValues _values>
	//   21   41:aload_1         
	//   22   42:invokevirtual   #269 <Method SerializableString EnumValues.serializedValueFor(Enum)>
	//   23   45:invokevirtual   #272 <Method void JsonGenerator.writeString(SerializableString)>
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
	//    2    2:checkcast       #179 <Class Enum>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #276 <Method void serialize(Enum, JsonGenerator, SerializerProvider)>
	//    6   10:return          
	}

	private static final long serialVersionUID = 1L;
	protected final Boolean _serializeAsIndex;
	protected final EnumValues _values;
}
