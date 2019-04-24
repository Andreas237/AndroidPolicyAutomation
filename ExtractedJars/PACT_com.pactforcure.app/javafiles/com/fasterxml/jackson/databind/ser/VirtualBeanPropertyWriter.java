// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.Annotations;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			BeanPropertyWriter

public abstract class VirtualBeanPropertyWriter extends BeanPropertyWriter
	implements Serializable
{

	protected VirtualBeanPropertyWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void BeanPropertyWriter()>
	//    2    4:return          
	}

	protected VirtualBeanPropertyWriter(BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype)
	{
		this(beanpropertydefinition, annotations, javatype, ((JsonSerializer) (null)), ((TypeSerializer) (null)), ((JavaType) (null)), beanpropertydefinition.findInclusion());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:aconst_null     
	//    7    7:aload_1         
	//    8    8:invokevirtual   #22  <Method com.fasterxml.jackson.annotation.JsonInclude$Value BeanPropertyDefinition.findInclusion()>
	//    9   11:invokespecial   #25  <Method void VirtualBeanPropertyWriter(BeanPropertyDefinition, Annotations, JavaType, JsonSerializer, TypeSerializer, JavaType, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   10   14:return          
	}

	protected VirtualBeanPropertyWriter(BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, JavaType javatype1, com.fasterxml.jackson.annotation.JsonInclude.Value value1)
	{
		super(beanpropertydefinition, beanpropertydefinition.getPrimaryMember(), annotations, javatype, jsonserializer, typeserializer, javatype1, _suppressNulls(value1), _suppressableValue(value1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #29  <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanPropertyDefinition.getPrimaryMember()>
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:invokestatic    #33  <Method boolean _suppressNulls(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   11   19:aload           7
	//   12   21:invokestatic    #37  <Method Object _suppressableValue(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   13   24:invokespecial   #40  <Method void BeanPropertyWriter(BeanPropertyDefinition, com.fasterxml.jackson.databind.introspect.AnnotatedMember, Annotations, JavaType, JsonSerializer, TypeSerializer, JavaType, boolean, Object)>
	//   14   27:return          
	}

	protected VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualbeanpropertywriter)
	{
		super(((BeanPropertyWriter) (virtualbeanpropertywriter)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #46  <Method void BeanPropertyWriter(BeanPropertyWriter)>
	//    3    5:return          
	}

	protected VirtualBeanPropertyWriter(VirtualBeanPropertyWriter virtualbeanpropertywriter, PropertyName propertyname)
	{
		super(((BeanPropertyWriter) (virtualbeanpropertywriter)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method void BeanPropertyWriter(BeanPropertyWriter, PropertyName)>
	//    4    6:return          
	}

	protected static boolean _suppressNulls(com.fasterxml.jackson.annotation.JsonInclude.Value value1)
	{
		if(value1 != null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
	//*   2    4:iconst_0        
	//*   3    5:ireturn         
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #56  <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//*   6   10:astore_0        
			if((value1 = ((com.fasterxml.jackson.annotation.JsonInclude.Value) (value1.getValueInclusion()))) != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS && value1 != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*   7   11:aload_0         
	//*   8   12:getstatic       #62  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*   9   15:if_acmpeq       4
	//*  10   18:aload_0         
	//*  11   19:getstatic       #65  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  12   22:if_acmpeq       4
				return true;
	//   13   25:iconst_1        
	//   14   26:ireturn         
		return false;
	}

	protected static Object _suppressableValue(com.fasterxml.jackson.annotation.JsonInclude.Value value1)
	{
		if(value1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			return ((Object) (Boolean.valueOf(false)));
	//    2    4:iconst_0        
	//    3    5:invokestatic    #71  <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:areturn         
		value1 = ((com.fasterxml.jackson.annotation.JsonInclude.Value) (value1.getValueInclusion()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #56  <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//    7   13:astore_0        
		if(value1 == com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS || value1 == com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL || value1 == com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*   8   14:aload_0         
	//*   9   15:getstatic       #62  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  10   18:if_acmpeq       35
	//*  11   21:aload_0         
	//*  12   22:getstatic       #74  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//*  13   25:if_acmpeq       35
	//*  14   28:aload_0         
	//*  15   29:getstatic       #65  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  16   32:if_acmpne       37
			return ((Object) (null));
	//   17   35:aconst_null     
	//   18   36:areturn         
		else
			return MARKER_FOR_EMPTY;
	//   19   37:getstatic       #78  <Field Object MARKER_FOR_EMPTY>
	//   20   40:areturn         
	}

	public boolean isVirtual()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1 = value(obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #88  <Method Object value(Object, JsonGenerator, SerializerProvider)>
	//    5    7:astore          6
		if(obj1 != null) goto _L2; else goto _L1
	//    6    9:aload           6
	//    7   11:ifnonnull       37
_L1:
		if(_nullSerializer == null) goto _L4; else goto _L3
	//    8   14:aload_0         
	//    9   15:getfield        #92  <Field JsonSerializer _nullSerializer>
	//   10   18:ifnull          32
_L3:
		_nullSerializer.serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   11   21:aload_0         
	//   12   22:getfield        #92  <Field JsonSerializer _nullSerializer>
	//   13   25:aconst_null     
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #97  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
_L6:
		return;
	//   17   31:return          
_L4:
		jsongenerator.writeNull();
	//   18   32:aload_2         
	//   19   33:invokevirtual   #102 <Method void JsonGenerator.writeNull()>
		return;
	//   20   36:return          
_L2:
		JsonSerializer jsonserializer1 = _serializer;
	//   21   37:aload_0         
	//   22   38:getfield        #105 <Field JsonSerializer _serializer>
	//   23   41:astore          5
		JsonSerializer jsonserializer = jsonserializer1;
	//   24   43:aload           5
	//   25   45:astore          4
		if(jsonserializer1 == null)
	//*  26   47:aload           5
	//*  27   49:ifnonnull       94
		{
			Class class1 = obj1.getClass();
	//   28   52:aload           6
	//   29   54:invokevirtual   #111 <Method Class Object.getClass()>
	//   30   57:astore          7
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   31   59:aload_0         
	//   32   60:getfield        #115 <Field PropertySerializerMap _dynamicSerializers>
	//   33   63:astore          8
			JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
	//   34   65:aload           8
	//   35   67:aload           7
	//   36   69:invokevirtual   #121 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   37   72:astore          5
			jsonserializer = jsonserializer2;
	//   38   74:aload           5
	//   39   76:astore          4
			if(jsonserializer2 == null)
	//*  40   78:aload           5
	//*  41   80:ifnonnull       94
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   42   83:aload_0         
	//   43   84:aload           8
	//   44   86:aload           7
	//   45   88:aload_3         
	//   46   89:invokevirtual   #125 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   47   92:astore          4
		}
		if(_suppressableValue != null)
	//*  48   94:aload_0         
	//*  49   95:getfield        #127 <Field Object _suppressableValue>
	//*  50   98:ifnull          150
			if(MARKER_FOR_EMPTY == _suppressableValue)
	//*  51  101:getstatic       #78  <Field Object MARKER_FOR_EMPTY>
	//*  52  104:aload_0         
	//*  53  105:getfield        #127 <Field Object _suppressableValue>
	//*  54  108:if_acmpne       130
			{
				if(jsonserializer.isEmpty(serializerprovider, obj1))
	//*  55  111:aload           4
	//*  56  113:aload_3         
	//*  57  114:aload           6
	//*  58  116:invokevirtual   #131 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  59  119:ifeq            150
				{
					serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   60  122:aload_0         
	//   61  123:aload_1         
	//   62  124:aload_2         
	//   63  125:aload_3         
	//   64  126:invokevirtual   #134 <Method void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
					return;
	//   65  129:return          
				}
			} else
			if(_suppressableValue.equals(obj1))
	//*  66  130:aload_0         
	//*  67  131:getfield        #127 <Field Object _suppressableValue>
	//*  68  134:aload           6
	//*  69  136:invokevirtual   #138 <Method boolean Object.equals(Object)>
	//*  70  139:ifeq            150
			{
				serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   71  142:aload_0         
	//   72  143:aload_1         
	//   73  144:aload_2         
	//   74  145:aload_3         
	//   75  146:invokevirtual   #134 <Method void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
				return;
	//   76  149:return          
			}
		if(obj1 != obj || !_handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
	//*  77  150:aload           6
	//*  78  152:aload_1         
	//*  79  153:if_acmpne       168
	//*  80  156:aload_0         
	//*  81  157:aload_1         
	//*  82  158:aload_2         
	//*  83  159:aload_3         
	//*  84  160:aload           4
	//*  85  162:invokevirtual   #142 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  86  165:ifne            31
			if(_typeSerializer == null)
	//*  87  168:aload_0         
	//*  88  169:getfield        #146 <Field TypeSerializer _typeSerializer>
	//*  89  172:ifnonnull       185
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   90  175:aload           4
	//   91  177:aload           6
	//   92  179:aload_2         
	//   93  180:aload_3         
	//   94  181:invokevirtual   #97  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   95  184:return          
			} else
			{
				jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
	//   96  185:aload           4
	//   97  187:aload           6
	//   98  189:aload_2         
	//   99  190:aload_3         
	//  100  191:aload_0         
	//  101  192:getfield        #146 <Field TypeSerializer _typeSerializer>
	//  102  195:invokevirtual   #150 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
				return;
	//  103  198:return          
			}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1 = value(obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #88  <Method Object value(Object, JsonGenerator, SerializerProvider)>
	//    5    7:astore          6
		if(obj1 != null) goto _L2; else goto _L1
	//    6    9:aload           6
	//    7   11:ifnonnull       40
_L1:
		if(_nullSerializer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #92  <Field JsonSerializer _nullSerializer>
	//*  10   18:ifnull          39
		{
			jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (_name)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #156 <Field com.fasterxml.jackson.core.io.SerializedString _name>
	//   14   26:invokevirtual   #160 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
			_nullSerializer.serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   15   29:aload_0         
	//   16   30:getfield        #92  <Field JsonSerializer _nullSerializer>
	//   17   33:aconst_null     
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #97  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		}
_L4:
		return;
	//   21   39:return          
_L2:
		JsonSerializer jsonserializer;
		JsonSerializer jsonserializer1 = _serializer;
	//   22   40:aload_0         
	//   23   41:getfield        #105 <Field JsonSerializer _serializer>
	//   24   44:astore          5
		jsonserializer = jsonserializer1;
	//   25   46:aload           5
	//   26   48:astore          4
		if(jsonserializer1 == null)
	//*  27   50:aload           5
	//*  28   52:ifnonnull       97
		{
			Class class1 = obj1.getClass();
	//   29   55:aload           6
	//   30   57:invokevirtual   #111 <Method Class Object.getClass()>
	//   31   60:astore          7
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   32   62:aload_0         
	//   33   63:getfield        #115 <Field PropertySerializerMap _dynamicSerializers>
	//   34   66:astore          8
			JsonSerializer jsonserializer2 = propertyserializermap.serializerFor(class1);
	//   35   68:aload           8
	//   36   70:aload           7
	//   37   72:invokevirtual   #121 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   38   75:astore          5
			jsonserializer = jsonserializer2;
	//   39   77:aload           5
	//   40   79:astore          4
			if(jsonserializer2 == null)
	//*  41   81:aload           5
	//*  42   83:ifnonnull       97
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   43   86:aload_0         
	//   44   87:aload           8
	//   45   89:aload           7
	//   46   91:aload_3         
	//   47   92:invokevirtual   #125 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   48   95:astore          4
		}
		if(_suppressableValue == null)
			break; /* Loop/switch isn't completed */
	//   49   97:aload_0         
	//   50   98:getfield        #127 <Field Object _suppressableValue>
	//   51  101:ifnull          125
		if(MARKER_FOR_EMPTY != _suppressableValue)
			break MISSING_BLOCK_LABEL_168;
	//   52  104:getstatic       #78  <Field Object MARKER_FOR_EMPTY>
	//   53  107:aload_0         
	//   54  108:getfield        #127 <Field Object _suppressableValue>
	//   55  111:if_acmpne       168
		if(jsonserializer.isEmpty(serializerprovider, obj1)) goto _L4; else goto _L3
	//   56  114:aload           4
	//   57  116:aload_3         
	//   58  117:aload           6
	//   59  119:invokevirtual   #131 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//   60  122:ifne            39
_L3:
		if(obj1 != obj || !_handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
	//*  61  125:aload           6
	//*  62  127:aload_1         
	//*  63  128:if_acmpne       143
	//*  64  131:aload_0         
	//*  65  132:aload_1         
	//*  66  133:aload_2         
	//*  67  134:aload_3         
	//*  68  135:aload           4
	//*  69  137:invokevirtual   #142 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  70  140:ifne            39
		{
			jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (_name)));
	//   71  143:aload_2         
	//   72  144:aload_0         
	//   73  145:getfield        #156 <Field com.fasterxml.jackson.core.io.SerializedString _name>
	//   74  148:invokevirtual   #160 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
			if(_typeSerializer == null)
	//*  75  151:aload_0         
	//*  76  152:getfield        #146 <Field TypeSerializer _typeSerializer>
	//*  77  155:ifnonnull       181
			{
				jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   78  158:aload           4
	//   79  160:aload           6
	//   80  162:aload_2         
	//   81  163:aload_3         
	//   82  164:invokevirtual   #97  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   83  167:return          
			} else
	//*  84  168:aload_0         
	//*  85  169:getfield        #127 <Field Object _suppressableValue>
	//*  86  172:aload           6
	//*  87  174:invokevirtual   #138 <Method boolean Object.equals(Object)>
	//*  88  177:ifeq            125
	//*  89  180:return          
			{
				jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
	//   90  181:aload           4
	//   91  183:aload           6
	//   92  185:aload_2         
	//   93  186:aload_3         
	//   94  187:aload_0         
	//   95  188:getfield        #146 <Field TypeSerializer _typeSerializer>
	//   96  191:invokevirtual   #150 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
				return;
	//   97  194:return          
			}
		}
		continue; /* Loop/switch isn't completed */
		if(_suppressableValue.equals(obj1))
			return;
		  goto _L3
		if(true) goto _L4; else goto _L5
_L5:
	}

	protected abstract Object value(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception;

	public abstract VirtualBeanPropertyWriter withConfig(MapperConfig mapperconfig, AnnotatedClass annotatedclass, BeanPropertyDefinition beanpropertydefinition, JavaType javatype);

	private static final long serialVersionUID = 1L;
}
