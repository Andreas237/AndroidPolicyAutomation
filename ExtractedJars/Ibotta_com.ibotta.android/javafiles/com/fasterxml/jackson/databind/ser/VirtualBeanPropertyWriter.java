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

	protected VirtualBeanPropertyWriter(BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, JavaType javatype1, com.fasterxml.jackson.annotation.JsonInclude.Value value1, 
			Class aclass[])
	{
		super(beanpropertydefinition, beanpropertydefinition.getPrimaryMember(), annotations, javatype, jsonserializer, typeserializer, javatype1, _suppressNulls(value1), _suppressableValue(value1), aclass);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #22  <Method com.fasterxml.jackson.databind.introspect.AnnotatedMember BeanPropertyDefinition.getPrimaryMember()>
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:aload           6
	//    9   14:aload           7
	//   10   16:invokestatic    #26  <Method boolean _suppressNulls(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   11   19:aload           7
	//   12   21:invokestatic    #30  <Method Object _suppressableValue(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   13   24:aload           8
	//   14   26:invokespecial   #33  <Method void BeanPropertyWriter(BeanPropertyDefinition, com.fasterxml.jackson.databind.introspect.AnnotatedMember, Annotations, JavaType, JsonSerializer, TypeSerializer, JavaType, boolean, Object, Class[])>
	//   15   29:return          
	}

	protected static boolean _suppressNulls(com.fasterxml.jackson.annotation.JsonInclude.Value value1)
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		if(value1 == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       8
			return false;
	//    4    6:iconst_0        
	//    5    7:ireturn         
		value1 = ((com.fasterxml.jackson.annotation.JsonInclude.Value) (value1.getValueInclusion()));
	//    6    8:aload_0         
	//    7    9:invokevirtual   #41  <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//    8   12:astore_0        
		boolean flag = flag1;
	//    9   13:iload_2         
	//   10   14:istore_1        
		if(value1 != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
	//*  11   15:aload_0         
	//*  12   16:getstatic       #47  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  13   19:if_acmpeq       33
		{
			flag = flag1;
	//   14   22:iload_2         
	//   15   23:istore_1        
			if(value1 != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*  16   24:aload_0         
	//*  17   25:getstatic       #50  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  18   28:if_acmpeq       33
				flag = true;
	//   19   31:iconst_1        
	//   20   32:istore_1        
		}
		return flag;
	//   21   33:iload_1         
	//   22   34:ireturn         
	}

	protected static Object _suppressableValue(com.fasterxml.jackson.annotation.JsonInclude.Value value1)
	{
		if(value1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       9
			return ((Object) (Boolean.valueOf(false)));
	//    2    4:iconst_0        
	//    3    5:invokestatic    #56  <Method Boolean Boolean.valueOf(boolean)>
	//    4    8:areturn         
		value1 = ((com.fasterxml.jackson.annotation.JsonInclude.Value) (value1.getValueInclusion()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #41  <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//    7   13:astore_0        
		if(value1 != com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS && value1 != com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL && value1 != com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*   8   14:aload_0         
	//*   9   15:getstatic       #47  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//*  10   18:if_acmpeq       42
	//*  11   21:aload_0         
	//*  12   22:getstatic       #59  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.NON_NULL>
	//*  13   25:if_acmpeq       42
	//*  14   28:aload_0         
	//*  15   29:getstatic       #50  <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*  16   32:if_acmpne       38
	//*  17   35:goto            42
			return MARKER_FOR_EMPTY;
	//   18   38:getstatic       #63  <Field Object MARKER_FOR_EMPTY>
	//   19   41:areturn         
		else
			return ((Object) (null));
	//   20   42:aconst_null     
	//   21   43:areturn         
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
	//    4    4:invokevirtual   #73  <Method Object value(Object, JsonGenerator, SerializerProvider)>
	//    5    7:astore          6
		if(obj1 == null)
	//*   6    9:aload           6
	//*   7   11:ifnonnull       37
			if(_nullSerializer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #77  <Field JsonSerializer _nullSerializer>
	//*  10   18:ifnull          32
			{
				_nullSerializer.serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   11   21:aload_0         
	//   12   22:getfield        #77  <Field JsonSerializer _nullSerializer>
	//   13   25:aconst_null     
	//   14   26:aload_2         
	//   15   27:aload_3         
	//   16   28:invokevirtual   #82  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
				return;
	//   17   31:return          
			} else
			{
				jsongenerator.writeNull();
	//   18   32:aload_2         
	//   19   33:invokevirtual   #87  <Method void JsonGenerator.writeNull()>
				return;
	//   20   36:return          
			}
		JsonSerializer jsonserializer1 = _serializer;
	//   21   37:aload_0         
	//   22   38:getfield        #90  <Field JsonSerializer _serializer>
	//   23   41:astore          5
		JsonSerializer jsonserializer = jsonserializer1;
	//   24   43:aload           5
	//   25   45:astore          4
		if(jsonserializer1 == null)
	//*  26   47:aload           5
	//*  27   49:ifnonnull       93
		{
			Class class1 = obj1.getClass();
	//   28   52:aload           6
	//   29   54:invokevirtual   #96  <Method Class Object.getClass()>
	//   30   57:astore          5
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   31   59:aload_0         
	//   32   60:getfield        #100 <Field PropertySerializerMap _dynamicSerializers>
	//   33   63:astore          7
			jsonserializer = propertyserializermap.serializerFor(class1);
	//   34   65:aload           7
	//   35   67:aload           5
	//   36   69:invokevirtual   #106 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   37   72:astore          4
			if(jsonserializer == null)
	//*  38   74:aload           4
	//*  39   76:ifnonnull       93
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   40   79:aload_0         
	//   41   80:aload           7
	//   42   82:aload           5
	//   43   84:aload_3         
	//   44   85:invokevirtual   #110 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   45   88:astore          4
		}
	//*  46   90:goto            93
		if(_suppressableValue != null)
	//*  47   93:aload_0         
	//*  48   94:getfield        #112 <Field Object _suppressableValue>
	//*  49   97:ifnull          149
			if(MARKER_FOR_EMPTY == _suppressableValue)
	//*  50  100:getstatic       #63  <Field Object MARKER_FOR_EMPTY>
	//*  51  103:aload_0         
	//*  52  104:getfield        #112 <Field Object _suppressableValue>
	//*  53  107:if_acmpne       129
			{
				if(jsonserializer.isEmpty(serializerprovider, obj1))
	//*  54  110:aload           4
	//*  55  112:aload_3         
	//*  56  113:aload           6
	//*  57  115:invokevirtual   #116 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  58  118:ifeq            149
				{
					serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   59  121:aload_0         
	//   60  122:aload_1         
	//   61  123:aload_2         
	//   62  124:aload_3         
	//   63  125:invokevirtual   #119 <Method void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
					return;
	//   64  128:return          
				}
			} else
			if(_suppressableValue.equals(obj1))
	//*  65  129:aload_0         
	//*  66  130:getfield        #112 <Field Object _suppressableValue>
	//*  67  133:aload           6
	//*  68  135:invokevirtual   #123 <Method boolean Object.equals(Object)>
	//*  69  138:ifeq            149
			{
				serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   70  141:aload_0         
	//   71  142:aload_1         
	//   72  143:aload_2         
	//   73  144:aload_3         
	//   74  145:invokevirtual   #119 <Method void serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
				return;
	//   75  148:return          
			}
		if(obj1 == obj && _handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
	//*  76  149:aload           6
	//*  77  151:aload_1         
	//*  78  152:if_acmpne       168
	//*  79  155:aload_0         
	//*  80  156:aload_1         
	//*  81  157:aload_2         
	//*  82  158:aload_3         
	//*  83  159:aload           4
	//*  84  161:invokevirtual   #127 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  85  164:ifeq            168
			return;
	//   86  167:return          
		if(_typeSerializer == null)
	//*  87  168:aload_0         
	//*  88  169:getfield        #131 <Field TypeSerializer _typeSerializer>
	//*  89  172:ifnonnull       185
		{
			jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   90  175:aload           4
	//   91  177:aload           6
	//   92  179:aload_2         
	//   93  180:aload_3         
	//   94  181:invokevirtual   #82  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
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
	//  101  192:getfield        #131 <Field TypeSerializer _typeSerializer>
	//  102  195:invokevirtual   #135 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//  103  198:return          
		}
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Object obj1 = value(obj, jsongenerator, serializerprovider);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokevirtual   #73  <Method Object value(Object, JsonGenerator, SerializerProvider)>
	//    5    7:astore          6
		if(obj1 == null)
	//*   6    9:aload           6
	//*   7   11:ifnonnull       40
		{
			if(_nullSerializer != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #77  <Field JsonSerializer _nullSerializer>
	//*  10   18:ifnull          39
			{
				jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (_name)));
	//   11   21:aload_2         
	//   12   22:aload_0         
	//   13   23:getfield        #141 <Field com.fasterxml.jackson.core.io.SerializedString _name>
	//   14   26:invokevirtual   #145 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
				_nullSerializer.serialize(((Object) (null)), jsongenerator, serializerprovider);
	//   15   29:aload_0         
	//   16   30:getfield        #77  <Field JsonSerializer _nullSerializer>
	//   17   33:aconst_null     
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #82  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			}
			return;
	//   21   39:return          
		}
		JsonSerializer jsonserializer1 = _serializer;
	//   22   40:aload_0         
	//   23   41:getfield        #90  <Field JsonSerializer _serializer>
	//   24   44:astore          5
		JsonSerializer jsonserializer = jsonserializer1;
	//   25   46:aload           5
	//   26   48:astore          4
		if(jsonserializer1 == null)
	//*  27   50:aload           5
	//*  28   52:ifnonnull       96
		{
			Class class1 = obj1.getClass();
	//   29   55:aload           6
	//   30   57:invokevirtual   #96  <Method Class Object.getClass()>
	//   31   60:astore          5
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
	//   32   62:aload_0         
	//   33   63:getfield        #100 <Field PropertySerializerMap _dynamicSerializers>
	//   34   66:astore          7
			jsonserializer = propertyserializermap.serializerFor(class1);
	//   35   68:aload           7
	//   36   70:aload           5
	//   37   72:invokevirtual   #106 <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
	//   38   75:astore          4
			if(jsonserializer == null)
	//*  39   77:aload           4
	//*  40   79:ifnonnull       96
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
	//   41   82:aload_0         
	//   42   83:aload           7
	//   43   85:aload           5
	//   44   87:aload_3         
	//   45   88:invokevirtual   #110 <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
	//   46   91:astore          4
		}
	//*  47   93:goto            96
		if(_suppressableValue != null)
	//*  48   96:aload_0         
	//*  49   97:getfield        #112 <Field Object _suppressableValue>
	//*  50  100:ifnull          138
			if(MARKER_FOR_EMPTY == _suppressableValue)
	//*  51  103:getstatic       #63  <Field Object MARKER_FOR_EMPTY>
	//*  52  106:aload_0         
	//*  53  107:getfield        #112 <Field Object _suppressableValue>
	//*  54  110:if_acmpne       125
			{
				if(jsonserializer.isEmpty(serializerprovider, obj1))
	//*  55  113:aload           4
	//*  56  115:aload_3         
	//*  57  116:aload           6
	//*  58  118:invokevirtual   #116 <Method boolean JsonSerializer.isEmpty(SerializerProvider, Object)>
	//*  59  121:ifeq            138
					return;
	//   60  124:return          
			} else
			if(_suppressableValue.equals(obj1))
	//*  61  125:aload_0         
	//*  62  126:getfield        #112 <Field Object _suppressableValue>
	//*  63  129:aload           6
	//*  64  131:invokevirtual   #123 <Method boolean Object.equals(Object)>
	//*  65  134:ifeq            138
				return;
	//   66  137:return          
		if(obj1 == obj && _handleSelfReference(obj, jsongenerator, serializerprovider, jsonserializer))
	//*  67  138:aload           6
	//*  68  140:aload_1         
	//*  69  141:if_acmpne       157
	//*  70  144:aload_0         
	//*  71  145:aload_1         
	//*  72  146:aload_2         
	//*  73  147:aload_3         
	//*  74  148:aload           4
	//*  75  150:invokevirtual   #127 <Method boolean _handleSelfReference(Object, JsonGenerator, SerializerProvider, JsonSerializer)>
	//*  76  153:ifeq            157
			return;
	//   77  156:return          
		jsongenerator.writeFieldName(((com.fasterxml.jackson.core.SerializableString) (_name)));
	//   78  157:aload_2         
	//   79  158:aload_0         
	//   80  159:getfield        #141 <Field com.fasterxml.jackson.core.io.SerializedString _name>
	//   81  162:invokevirtual   #145 <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
		if(_typeSerializer == null)
	//*  82  165:aload_0         
	//*  83  166:getfield        #131 <Field TypeSerializer _typeSerializer>
	//*  84  169:ifnonnull       182
		{
			jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
	//   85  172:aload           4
	//   86  174:aload           6
	//   87  176:aload_2         
	//   88  177:aload_3         
	//   89  178:invokevirtual   #82  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//   90  181:return          
		} else
		{
			jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, _typeSerializer);
	//   91  182:aload           4
	//   92  184:aload           6
	//   93  186:aload_2         
	//   94  187:aload_3         
	//   95  188:aload_0         
	//   96  189:getfield        #131 <Field TypeSerializer _typeSerializer>
	//   97  192:invokevirtual   #135 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
			return;
	//   98  195:return          
		}
	}

	protected abstract Object value(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception;

	public abstract VirtualBeanPropertyWriter withConfig(MapperConfig mapperconfig, AnnotatedClass annotatedclass, BeanPropertyDefinition beanpropertydefinition, JavaType javatype);

	private static final long serialVersionUID = 1L;
}
