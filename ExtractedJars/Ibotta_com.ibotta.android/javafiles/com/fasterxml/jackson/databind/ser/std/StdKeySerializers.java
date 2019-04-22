// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.EnumValues;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdKeySerializer, StdSerializer

public abstract class StdKeySerializers
{
	public static class Default extends StdSerializer
	{

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			switch(_typeId)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field int _typeId>
			{
		//*   2    4:tableswitch     1 7: default 48
		//		               1 168
		//		               2 155
		//		               3 143
		//		               4 88
		//		               5 76
		//		               6 76
		//		               7 57
			default:
				jsongenerator.writeFieldName(obj.toString());
		//    3   48:aload_2         
		//    4   49:aload_1         
		//    5   50:invokevirtual   #30  <Method String Object.toString()>
		//    6   53:invokevirtual   #36  <Method void JsonGenerator.writeFieldName(String)>
				return;
		//    7   56:return          

			case 7: // '\007'
				jsongenerator.writeFieldName(serializerprovider.getConfig().getBase64Variant().encode((byte[])obj));
		//    8   57:aload_2         
		//    9   58:aload_3         
		//   10   59:invokevirtual   #42  <Method SerializationConfig SerializerProvider.getConfig()>
		//   11   62:invokevirtual   #48  <Method Base64Variant SerializationConfig.getBase64Variant()>
		//   12   65:aload_1         
		//   13   66:checkcast       #50  <Class byte[]>
		//   14   69:invokevirtual   #56  <Method String Base64Variant.encode(byte[])>
		//   15   72:invokevirtual   #36  <Method void JsonGenerator.writeFieldName(String)>
				return;
		//   16   75:return          

			case 5: // '\005'
			case 6: // '\006'
				jsongenerator.writeFieldId(((Number)obj).longValue());
		//   17   76:aload_2         
		//   18   77:aload_1         
		//   19   78:checkcast       #58  <Class Number>
		//   20   81:invokevirtual   #62  <Method long Number.longValue()>
		//   21   84:invokevirtual   #66  <Method void JsonGenerator.writeFieldId(long)>
				return;
		//   22   87:return          

			case 4: // '\004'
				if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
		//*  23   88:aload_3         
		//*  24   89:getstatic       #72  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
		//*  25   92:invokevirtual   #76  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*  26   95:ifeq            106
				{
					obj = ((Object) (obj.toString()));
		//   27   98:aload_1         
		//   28   99:invokevirtual   #30  <Method String Object.toString()>
		//   29  102:astore_1        
				} else
		//*  30  103:goto            137
				{
					obj = ((Object) ((Enum)obj));
		//   31  106:aload_1         
		//   32  107:checkcast       #78  <Class Enum>
		//   33  110:astore_1        
					if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX))
		//*  34  111:aload_3         
		//*  35  112:getstatic       #81  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_INDEX>
		//*  36  115:invokevirtual   #76  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*  37  118:ifeq            132
						obj = ((Object) (String.valueOf(((Enum) (obj)).ordinal())));
		//   38  121:aload_1         
		//   39  122:invokevirtual   #85  <Method int Enum.ordinal()>
		//   40  125:invokestatic    #91  <Method String String.valueOf(int)>
		//   41  128:astore_1        
					else
		//*  42  129:goto            137
						obj = ((Object) (((Enum) (obj)).name()));
		//   43  132:aload_1         
		//   44  133:invokevirtual   #94  <Method String Enum.name()>
		//   45  136:astore_1        
				}
				jsongenerator.writeFieldName(((String) (obj)));
		//   46  137:aload_2         
		//   47  138:aload_1         
		//   48  139:invokevirtual   #36  <Method void JsonGenerator.writeFieldName(String)>
				return;
		//   49  142:return          

			case 3: // '\003'
				jsongenerator.writeFieldName(((Class)obj).getName());
		//   50  143:aload_2         
		//   51  144:aload_1         
		//   52  145:checkcast       #96  <Class Class>
		//   53  148:invokevirtual   #99  <Method String Class.getName()>
		//   54  151:invokevirtual   #36  <Method void JsonGenerator.writeFieldName(String)>
				return;
		//   55  154:return          

			case 2: // '\002'
				serializerprovider.defaultSerializeDateKey(((Calendar)obj).getTimeInMillis(), jsongenerator);
		//   56  155:aload_3         
		//   57  156:aload_1         
		//   58  157:checkcast       #101 <Class Calendar>
		//   59  160:invokevirtual   #104 <Method long Calendar.getTimeInMillis()>
		//   60  163:aload_2         
		//   61  164:invokevirtual   #108 <Method void SerializerProvider.defaultSerializeDateKey(long, JsonGenerator)>
				return;
		//   62  167:return          

			case 1: // '\001'
				serializerprovider.defaultSerializeDateKey((Date)obj, jsongenerator);
		//   63  168:aload_3         
		//   64  169:aload_1         
		//   65  170:checkcast       #110 <Class Date>
		//   66  173:aload_2         
		//   67  174:invokevirtual   #113 <Method void SerializerProvider.defaultSerializeDateKey(Date, JsonGenerator)>
				return;
		//   68  177:return          
			}
		}

		protected final int _typeId;

		public Default(int i, Class class1)
		{
			super(class1, false);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:iconst_0        
		//    3    3:invokespecial   #15  <Method void StdSerializer(Class, boolean)>
			_typeId = i;
		//    4    6:aload_0         
		//    5    7:iload_1         
		//    6    8:putfield        #17  <Field int _typeId>
		//    7   11:return          
		}
	}

	public static class Dynamic extends StdSerializer
	{

		protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
			throws JsonMappingException
		{
			if(class1 == java/lang/Object)
		//*   0    0:aload_2         
		//*   1    1:ldc1            #32  <Class Object>
		//*   2    3:if_acmpne       29
			{
				serializerprovider = ((SerializerProvider) (new Default(8, class1)));
		//    3    6:new             #34  <Class StdKeySerializers$Default>
		//    4    9:dup             
		//    5   10:bipush          8
		//    6   12:aload_2         
		//    7   13:invokespecial   #37  <Method void StdKeySerializers$Default(int, Class)>
		//    8   16:astore_3        
				_dynamicSerializers = propertyserializermap.newWith(class1, ((JsonSerializer) (serializerprovider)));
		//    9   17:aload_0         
		//   10   18:aload_1         
		//   11   19:aload_2         
		//   12   20:aload_3         
		//   13   21:invokevirtual   #41  <Method PropertySerializerMap PropertySerializerMap.newWith(Class, JsonSerializer)>
		//   14   24:putfield        #25  <Field PropertySerializerMap _dynamicSerializers>
				return ((JsonSerializer) (serializerprovider));
		//   15   27:aload_3         
		//   16   28:areturn         
			}
			class1 = ((Class) (propertyserializermap.findAndAddKeySerializer(class1, serializerprovider, ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
		//   17   29:aload_1         
		//   18   30:aload_2         
		//   19   31:aload_3         
		//   20   32:aconst_null     
		//   21   33:invokevirtual   #45  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddKeySerializer(Class, SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)>
		//   22   36:astore_2        
			if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
		//*  23   37:aload_1         
		//*  24   38:aload_2         
		//*  25   39:getfield        #50  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
		//*  26   42:if_acmpeq       53
				_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
		//   27   45:aload_0         
		//   28   46:aload_2         
		//   29   47:getfield        #50  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
		//   30   50:putfield        #25  <Field PropertySerializerMap _dynamicSerializers>
			return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
		//   31   53:aload_2         
		//   32   54:getfield        #54  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
		//   33   57:areturn         
		}

		public void acceptJsonFormatVisitor(JsonFormatVisitorWrapper jsonformatvisitorwrapper, JavaType javatype)
			throws JsonMappingException
		{
			visitStringFormat(jsonformatvisitorwrapper, javatype);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #62  <Method void visitStringFormat(JsonFormatVisitorWrapper, JavaType)>
		//    4    6:return          
		}

		Object readResolve()
		{
			_dynamicSerializers = PropertySerializerMap.emptyForProperties();
		//    0    0:aload_0         
		//    1    1:invokestatic    #23  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
		//    2    4:putfield        #25  <Field PropertySerializerMap _dynamicSerializers>
			return ((Object) (this));
		//    3    7:aload_0         
		//    4    8:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			Class class1 = obj.getClass();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #72  <Method Class Object.getClass()>
		//    2    4:astore          6
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
		//    3    6:aload_0         
		//    4    7:getfield        #25  <Field PropertySerializerMap _dynamicSerializers>
		//    5   10:astore          7
			JsonSerializer jsonserializer1 = propertyserializermap.serializerFor(class1);
		//    6   12:aload           7
		//    7   14:aload           6
		//    8   16:invokevirtual   #76  <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
		//    9   19:astore          5
			JsonSerializer jsonserializer = jsonserializer1;
		//   10   21:aload           5
		//   11   23:astore          4
			if(jsonserializer1 == null)
		//*  12   25:aload           5
		//*  13   27:ifnonnull       41
				jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
		//   14   30:aload_0         
		//   15   31:aload           7
		//   16   33:aload           6
		//   17   35:aload_3         
		//   18   36:invokevirtual   #78  <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
		//   19   39:astore          4
			jsonserializer.serialize(obj, jsongenerator, serializerprovider);
		//   20   41:aload           4
		//   21   43:aload_1         
		//   22   44:aload_2         
		//   23   45:aload_3         
		//   24   46:invokevirtual   #82  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
		//   25   49:return          
		}

		protected transient PropertySerializerMap _dynamicSerializers;

		public Dynamic()
		{
			super(java/lang/String, false);
		//    0    0:aload_0         
		//    1    1:ldc1            #14  <Class String>
		//    2    3:iconst_0        
		//    3    4:invokespecial   #17  <Method void StdSerializer(Class, boolean)>
			_dynamicSerializers = PropertySerializerMap.emptyForProperties();
		//    4    7:aload_0         
		//    5    8:invokestatic    #23  <Method PropertySerializerMap PropertySerializerMap.emptyForProperties()>
		//    6   11:putfield        #25  <Field PropertySerializerMap _dynamicSerializers>
		//    7   14:return          
		}
	}

	public static class EnumKeySerializer extends StdSerializer
	{

		public static EnumKeySerializer construct(Class class1, EnumValues enumvalues)
		{
			return new EnumKeySerializer(class1, enumvalues);
		//    0    0:new             #2   <Class StdKeySerializers$EnumKeySerializer>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #24  <Method void StdKeySerializers$EnumKeySerializer(Class, EnumValues)>
		//    5    9:areturn         
		}

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
		//*   0    0:aload_3         
		//*   1    1:getstatic       #35  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
		//*   2    4:invokevirtual   #41  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*   3    7:ifeq            19
			{
				jsongenerator.writeFieldName(obj.toString());
		//    4   10:aload_2         
		//    5   11:aload_1         
		//    6   12:invokevirtual   #47  <Method String Object.toString()>
		//    7   15:invokevirtual   #53  <Method void JsonGenerator.writeFieldName(String)>
				return;
		//    8   18:return          
			}
			obj = ((Object) ((Enum)obj));
		//    9   19:aload_1         
		//   10   20:checkcast       #55  <Class Enum>
		//   11   23:astore_1        
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_INDEX))
		//*  12   24:aload_3         
		//*  13   25:getstatic       #58  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_INDEX>
		//*  14   28:invokevirtual   #41  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*  15   31:ifeq            46
			{
				jsongenerator.writeFieldName(String.valueOf(((Enum) (obj)).ordinal()));
		//   16   34:aload_2         
		//   17   35:aload_1         
		//   18   36:invokevirtual   #62  <Method int Enum.ordinal()>
		//   19   39:invokestatic    #68  <Method String String.valueOf(int)>
		//   20   42:invokevirtual   #53  <Method void JsonGenerator.writeFieldName(String)>
				return;
		//   21   45:return          
			} else
			{
				jsongenerator.writeFieldName(_values.serializedValueFor(((Enum) (obj))));
		//   22   46:aload_2         
		//   23   47:aload_0         
		//   24   48:getfield        #17  <Field EnumValues _values>
		//   25   51:aload_1         
		//   26   52:invokevirtual   #74  <Method com.fasterxml.jackson.core.SerializableString EnumValues.serializedValueFor(Enum)>
		//   27   55:invokevirtual   #77  <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
				return;
		//   28   58:return          
			}
		}

		protected final EnumValues _values;

		protected EnumKeySerializer(Class class1, EnumValues enumvalues)
		{
			super(class1, false);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iconst_0        
		//    3    3:invokespecial   #15  <Method void StdSerializer(Class, boolean)>
			_values = enumvalues;
		//    4    6:aload_0         
		//    5    7:aload_2         
		//    6    8:putfield        #17  <Field EnumValues _values>
		//    7   11:return          
		}
	}

	public static class StringKeySerializer extends StdSerializer
	{

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			jsongenerator.writeFieldName((String)obj);
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:checkcast       #12  <Class String>
		//    3    5:invokevirtual   #26  <Method void JsonGenerator.writeFieldName(String)>
		//    4    8:return          
		}

		public StringKeySerializer()
		{
			super(java/lang/String, false);
		//    0    0:aload_0         
		//    1    1:ldc1            #12  <Class String>
		//    2    3:iconst_0        
		//    3    4:invokespecial   #15  <Method void StdSerializer(Class, boolean)>
		//    4    7:return          
		}
	}


	public static JsonSerializer getFallbackKeySerializer(SerializationConfig serializationconfig, Class class1)
	{
		if(class1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          35
		{
			if(class1 == java/lang/Enum)
	//*   2    4:aload_1         
	//*   3    5:ldc1            #37  <Class Enum>
	//*   4    7:if_acmpne       18
				return ((JsonSerializer) (new Dynamic()));
	//    5   10:new             #9   <Class StdKeySerializers$Dynamic>
	//    6   13:dup             
	//    7   14:invokespecial   #38  <Method void StdKeySerializers$Dynamic()>
	//    8   17:areturn         
			if(class1.isEnum())
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #44  <Method boolean Class.isEnum()>
	//*  11   22:ifeq            35
				return ((JsonSerializer) (EnumKeySerializer.construct(class1, EnumValues.constructFromName(((com.fasterxml.jackson.databind.cfg.MapperConfig) (serializationconfig)), class1))));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:aload_1         
	//   15   28:invokestatic    #50  <Method EnumValues EnumValues.constructFromName(com.fasterxml.jackson.databind.cfg.MapperConfig, Class)>
	//   16   31:invokestatic    #54  <Method StdKeySerializers$EnumKeySerializer StdKeySerializers$EnumKeySerializer.construct(Class, EnumValues)>
	//   17   34:areturn         
		}
		return ((JsonSerializer) (new Default(8, class1)));
	//   18   35:new             #6   <Class StdKeySerializers$Default>
	//   19   38:dup             
	//   20   39:bipush          8
	//   21   41:aload_1         
	//   22   42:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   23   45:areturn         
	}

	public static JsonSerializer getStdKeySerializer(SerializationConfig serializationconfig, Class class1, boolean flag)
	{
		if(class1 != null && class1 != java/lang/Object)
	//*   0    0:aload_1         
	//*   1    1:ifnull          205
	//*   2    4:aload_1         
	//*   3    5:ldc1            #4   <Class Object>
	//*   4    7:if_acmpne       13
	//*   5   10:goto            205
		{
			if(class1 == java/lang/String)
	//*   6   13:aload_1         
	//*   7   14:ldc1            #63  <Class String>
	//*   8   16:if_acmpne       23
				return DEFAULT_STRING_SERIALIZER;
	//    9   19:getstatic       #32  <Field JsonSerializer DEFAULT_STRING_SERIALIZER>
	//   10   22:areturn         
			serializationconfig = ((SerializationConfig) (class1));
	//   11   23:aload_1         
	//   12   24:astore_0        
			if(class1.isPrimitive())
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #66  <Method boolean Class.isPrimitive()>
	//*  15   29:ifeq            37
				serializationconfig = ((SerializationConfig) (ClassUtil.wrapperType(class1)));
	//   16   32:aload_1         
	//   17   33:invokestatic    #72  <Method Class ClassUtil.wrapperType(Class)>
	//   18   36:astore_0        
			if(serializationconfig == java/lang/Integer)
	//*  19   37:aload_0         
	//*  20   38:ldc1            #74  <Class Integer>
	//*  21   40:if_acmpne       53
				return ((JsonSerializer) (new Default(5, ((Class) (serializationconfig)))));
	//   22   43:new             #6   <Class StdKeySerializers$Default>
	//   23   46:dup             
	//   24   47:iconst_5        
	//   25   48:aload_0         
	//   26   49:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   27   52:areturn         
			if(serializationconfig == java/lang/Long)
	//*  28   53:aload_0         
	//*  29   54:ldc1            #76  <Class Long>
	//*  30   56:if_acmpne       70
				return ((JsonSerializer) (new Default(6, ((Class) (serializationconfig)))));
	//   31   59:new             #6   <Class StdKeySerializers$Default>
	//   32   62:dup             
	//   33   63:bipush          6
	//   34   65:aload_0         
	//   35   66:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   36   69:areturn         
			if(!((Class) (serializationconfig)).isPrimitive() && !((Class) (java/lang/Number)).isAssignableFrom(((Class) (serializationconfig))))
	//*  37   70:aload_0         
	//*  38   71:invokevirtual   #66  <Method boolean Class.isPrimitive()>
	//*  39   74:ifne            194
	//*  40   77:ldc1            #78  <Class Number>
	//*  41   79:aload_0         
	//*  42   80:invokevirtual   #82  <Method boolean Class.isAssignableFrom(Class)>
	//*  43   83:ifeq            89
	//*  44   86:goto            194
			{
				if(serializationconfig == java/lang/Class)
	//*  45   89:aload_0         
	//*  46   90:ldc1            #40  <Class Class>
	//*  47   92:if_acmpne       105
					return ((JsonSerializer) (new Default(3, ((Class) (serializationconfig)))));
	//   48   95:new             #6   <Class StdKeySerializers$Default>
	//   49   98:dup             
	//   50   99:iconst_3        
	//   51  100:aload_0         
	//   52  101:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   53  104:areturn         
				if(((Class) (java/util/Date)).isAssignableFrom(((Class) (serializationconfig))))
	//*  54  105:ldc1            #84  <Class Date>
	//*  55  107:aload_0         
	//*  56  108:invokevirtual   #82  <Method boolean Class.isAssignableFrom(Class)>
	//*  57  111:ifeq            124
					return ((JsonSerializer) (new Default(1, ((Class) (serializationconfig)))));
	//   58  114:new             #6   <Class StdKeySerializers$Default>
	//   59  117:dup             
	//   60  118:iconst_1        
	//   61  119:aload_0         
	//   62  120:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   63  123:areturn         
				if(((Class) (java/util/Calendar)).isAssignableFrom(((Class) (serializationconfig))))
	//*  64  124:ldc1            #86  <Class Calendar>
	//*  65  126:aload_0         
	//*  66  127:invokevirtual   #82  <Method boolean Class.isAssignableFrom(Class)>
	//*  67  130:ifeq            143
					return ((JsonSerializer) (new Default(2, ((Class) (serializationconfig)))));
	//   68  133:new             #6   <Class StdKeySerializers$Default>
	//   69  136:dup             
	//   70  137:iconst_2        
	//   71  138:aload_0         
	//   72  139:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   73  142:areturn         
				if(serializationconfig == java/util/UUID)
	//*  74  143:aload_0         
	//*  75  144:ldc1            #88  <Class UUID>
	//*  76  146:if_acmpne       160
					return ((JsonSerializer) (new Default(8, ((Class) (serializationconfig)))));
	//   77  149:new             #6   <Class StdKeySerializers$Default>
	//   78  152:dup             
	//   79  153:bipush          8
	//   80  155:aload_0         
	//   81  156:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   82  159:areturn         
				if(serializationconfig == [B)
	//*  83  160:aload_0         
	//*  84  161:ldc1            #90  <Class byte[]>
	//*  85  163:if_acmpne       177
					return ((JsonSerializer) (new Default(7, ((Class) (serializationconfig)))));
	//   86  166:new             #6   <Class StdKeySerializers$Default>
	//   87  169:dup             
	//   88  170:bipush          7
	//   89  172:aload_0         
	//   90  173:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   91  176:areturn         
				if(flag)
	//*  92  177:iload_2         
	//*  93  178:ifeq            192
					return ((JsonSerializer) (new Default(8, ((Class) (serializationconfig)))));
	//   94  181:new             #6   <Class StdKeySerializers$Default>
	//   95  184:dup             
	//   96  185:bipush          8
	//   97  187:aload_0         
	//   98  188:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//   99  191:areturn         
				else
					return null;
	//  100  192:aconst_null     
	//  101  193:areturn         
			} else
			{
				return ((JsonSerializer) (new Default(8, ((Class) (serializationconfig)))));
	//  102  194:new             #6   <Class StdKeySerializers$Default>
	//  103  197:dup             
	//  104  198:bipush          8
	//  105  200:aload_0         
	//  106  201:invokespecial   #57  <Method void StdKeySerializers$Default(int, Class)>
	//  107  204:areturn         
			}
		} else
		{
			return ((JsonSerializer) (new Dynamic()));
	//  108  205:new             #9   <Class StdKeySerializers$Dynamic>
	//  109  208:dup             
	//  110  209:invokespecial   #38  <Method void StdKeySerializers$Dynamic()>
	//  111  212:areturn         
		}
	}

	protected static final JsonSerializer DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
	protected static final JsonSerializer DEFAULT_STRING_SERIALIZER = new StringKeySerializer();

	static 
	{
	//    0    0:new             #24  <Class StdKeySerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StdKeySerializer()>
	//    3    7:putstatic       #29  <Field JsonSerializer DEFAULT_KEY_SERIALIZER>
	//    4   10:new             #15  <Class StdKeySerializers$StringKeySerializer>
	//    5   13:dup             
	//    6   14:invokespecial   #30  <Method void StdKeySerializers$StringKeySerializer()>
	//    7   17:putstatic       #32  <Field JsonSerializer DEFAULT_STRING_SERIALIZER>
	//*   8   20:return          
	}
}
