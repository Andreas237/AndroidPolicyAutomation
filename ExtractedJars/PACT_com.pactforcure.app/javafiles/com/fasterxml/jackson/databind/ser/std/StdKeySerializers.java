// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//			StdKeySerializer, StdSerializer

public class StdKeySerializers
{
	public static class Default extends StdSerializer
	{

		public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws IOException
		{
			switch(_typeId)
		//*   0    0:aload_0         
		//*   1    1:getfield        #27  <Field int _typeId>
			{
		//*   2    4:tableswitch     1 4: default 36
		//		               1 45
		//		               2 55
		//		               3 68
		//		               4 80
			default:
				jsongenerator.writeFieldName(obj.toString());
		//    3   36:aload_2         
		//    4   37:aload_1         
		//    5   38:invokevirtual   #40  <Method String Object.toString()>
		//    6   41:invokevirtual   #46  <Method void JsonGenerator.writeFieldName(String)>
				return;
		//    7   44:return          

			case 1: // '\001'
				serializerprovider.defaultSerializeDateKey((Date)obj, jsongenerator);
		//    8   45:aload_3         
		//    9   46:aload_1         
		//   10   47:checkcast       #48  <Class Date>
		//   11   50:aload_2         
		//   12   51:invokevirtual   #54  <Method void SerializerProvider.defaultSerializeDateKey(Date, JsonGenerator)>
				return;
		//   13   54:return          

			case 2: // '\002'
				serializerprovider.defaultSerializeDateKey(((Calendar)obj).getTimeInMillis(), jsongenerator);
		//   14   55:aload_3         
		//   15   56:aload_1         
		//   16   57:checkcast       #56  <Class Calendar>
		//   17   60:invokevirtual   #60  <Method long Calendar.getTimeInMillis()>
		//   18   63:aload_2         
		//   19   64:invokevirtual   #63  <Method void SerializerProvider.defaultSerializeDateKey(long, JsonGenerator)>
				return;
		//   20   67:return          

			case 3: // '\003'
				jsongenerator.writeFieldName(((Class)obj).getName());
		//   21   68:aload_2         
		//   22   69:aload_1         
		//   23   70:checkcast       #65  <Class Class>
		//   24   73:invokevirtual   #68  <Method String Class.getName()>
		//   25   76:invokevirtual   #46  <Method void JsonGenerator.writeFieldName(String)>
				return;
		//   26   79:return          

			case 4: // '\004'
				break;
			}
			if(serializerprovider.isEnabled(SerializationFeature.WRITE_ENUMS_USING_TO_STRING))
		//*  27   80:aload_3         
		//*  28   81:getstatic       #74  <Field SerializationFeature SerializationFeature.WRITE_ENUMS_USING_TO_STRING>
		//*  29   84:invokevirtual   #78  <Method boolean SerializerProvider.isEnabled(SerializationFeature)>
		//*  30   87:ifeq            101
				obj = ((Object) (obj.toString()));
		//   31   90:aload_1         
		//   32   91:invokevirtual   #40  <Method String Object.toString()>
		//   33   94:astore_1        
			else
		//*  34   95:aload_2         
		//*  35   96:aload_1         
		//*  36   97:invokevirtual   #46  <Method void JsonGenerator.writeFieldName(String)>
		//*  37  100:return          
				obj = ((Object) (((Enum)obj).name()));
		//   38  101:aload_1         
		//   39  102:checkcast       #80  <Class Enum>
		//   40  105:invokevirtual   #83  <Method String Enum.name()>
		//   41  108:astore_1        
			jsongenerator.writeFieldName(((String) (obj)));
		//*  42  109:goto            95
		}

		static final int TYPE_CALENDAR = 2;
		static final int TYPE_CLASS = 3;
		static final int TYPE_DATE = 1;
		static final int TYPE_ENUM = 4;
		static final int TYPE_TO_STRING = 5;
		protected final int _typeId;

		public Default(int i, Class class1)
		{
			super(class1, false);
		//    0    0:aload_0         
		//    1    1:aload_2         
		//    2    2:iconst_0        
		//    3    3:invokespecial   #25  <Method void StdSerializer(Class, boolean)>
			_typeId = i;
		//    4    6:aload_0         
		//    5    7:iload_1         
		//    6    8:putfield        #27  <Field int _typeId>
		//    7   11:return          
		}
	}

	public static class Dynamic extends StdSerializer
	{

		protected JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
			throws JsonMappingException
		{
			class1 = ((Class) (propertyserializermap.findAndAddKeySerializer(class1, serializerprovider, ((com.fasterxml.jackson.databind.BeanProperty) (null)))));
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aconst_null     
		//    4    4:invokevirtual   #34  <Method com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult PropertySerializerMap.findAndAddKeySerializer(Class, SerializerProvider, com.fasterxml.jackson.databind.BeanProperty)>
		//    5    7:astore_2        
			if(propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
		//*   6    8:aload_1         
		//*   7    9:aload_2         
		//*   8   10:getfield        #39  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
		//*   9   13:if_acmpeq       24
				_dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
		//   10   16:aload_0         
		//   11   17:aload_2         
		//   12   18:getfield        #39  <Field PropertySerializerMap com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.map>
		//   13   21:putfield        #25  <Field PropertySerializerMap _dynamicSerializers>
			return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
		//   14   24:aload_2         
		//   15   25:getfield        #43  <Field JsonSerializer com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap$SerializerAndMapResult.serializer>
		//   16   28:areturn         
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
		//    1    1:invokevirtual   #58  <Method Class Object.getClass()>
		//    2    4:astore          6
			PropertySerializerMap propertyserializermap = _dynamicSerializers;
		//    3    6:aload_0         
		//    4    7:getfield        #25  <Field PropertySerializerMap _dynamicSerializers>
		//    5   10:astore          7
			JsonSerializer jsonserializer1 = propertyserializermap.serializerFor(class1);
		//    6   12:aload           7
		//    7   14:aload           6
		//    8   16:invokevirtual   #62  <Method JsonSerializer PropertySerializerMap.serializerFor(Class)>
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
		//   18   36:invokevirtual   #64  <Method JsonSerializer _findAndAddDynamic(PropertySerializerMap, Class, SerializerProvider)>
		//   19   39:astore          4
			jsonserializer.serialize(obj, jsongenerator, serializerprovider);
		//   20   41:aload           4
		//   21   43:aload_1         
		//   22   44:aload_2         
		//   23   45:aload_3         
		//   24   46:invokevirtual   #68  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
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


	private StdKeySerializers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
	//    2    4:return          
	}

	public static JsonSerializer getDefault()
	{
		return DEFAULT_KEY_SERIALIZER;
	//    0    0:getstatic       #26  <Field JsonSerializer DEFAULT_KEY_SERIALIZER>
	//    1    3:areturn         
	}

	public static JsonSerializer getFallbackKeySerializer(SerializationConfig serializationconfig, Class class1)
	{
		if(class1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          35
		{
			if(class1 == java/lang/Enum)
	//*   2    4:aload_1         
	//*   3    5:ldc1            #41  <Class Enum>
	//*   4    7:if_acmpne       18
				return ((JsonSerializer) (new Dynamic()));
	//    5   10:new             #9   <Class StdKeySerializers$Dynamic>
	//    6   13:dup             
	//    7   14:invokespecial   #42  <Method void StdKeySerializers$Dynamic()>
	//    8   17:areturn         
			if(class1.isEnum())
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #48  <Method boolean Class.isEnum()>
	//*  11   22:ifeq            35
				return ((JsonSerializer) (new Default(4, class1)));
	//   12   25:new             #6   <Class StdKeySerializers$Default>
	//   13   28:dup             
	//   14   29:iconst_4        
	//   15   30:aload_1         
	//   16   31:invokespecial   #51  <Method void StdKeySerializers$Default(int, Class)>
	//   17   34:areturn         
		}
		return DEFAULT_KEY_SERIALIZER;
	//   18   35:getstatic       #26  <Field JsonSerializer DEFAULT_KEY_SERIALIZER>
	//   19   38:areturn         
	}

	public static JsonSerializer getStdKeySerializer(SerializationConfig serializationconfig, Class class1, boolean flag)
	{
		if(class1 == null || class1 == java/lang/Object)
	//*   0    0:aload_1         
	//*   1    1:ifnull          10
	//*   2    4:aload_1         
	//*   3    5:ldc1            #4   <Class Object>
	//*   4    7:if_acmpne       18
			return ((JsonSerializer) (new Dynamic()));
	//    5   10:new             #9   <Class StdKeySerializers$Dynamic>
	//    6   13:dup             
	//    7   14:invokespecial   #42  <Method void StdKeySerializers$Dynamic()>
	//    8   17:areturn         
		if(class1 == java/lang/String)
	//*   9   18:aload_1         
	//*  10   19:ldc1            #56  <Class String>
	//*  11   21:if_acmpne       28
			return DEFAULT_STRING_SERIALIZER;
	//   12   24:getstatic       #29  <Field JsonSerializer DEFAULT_STRING_SERIALIZER>
	//   13   27:areturn         
		if(class1.isPrimitive() || ((Class) (java/lang/Number)).isAssignableFrom(class1))
	//*  14   28:aload_1         
	//*  15   29:invokevirtual   #59  <Method boolean Class.isPrimitive()>
	//*  16   32:ifne            44
	//*  17   35:ldc1            #61  <Class Number>
	//*  18   37:aload_1         
	//*  19   38:invokevirtual   #65  <Method boolean Class.isAssignableFrom(Class)>
	//*  20   41:ifeq            48
			return DEFAULT_KEY_SERIALIZER;
	//   21   44:getstatic       #26  <Field JsonSerializer DEFAULT_KEY_SERIALIZER>
	//   22   47:areturn         
		if(class1 == java/lang/Class)
	//*  23   48:aload_1         
	//*  24   49:ldc1            #44  <Class Class>
	//*  25   51:if_acmpne       64
			return ((JsonSerializer) (new Default(3, class1)));
	//   26   54:new             #6   <Class StdKeySerializers$Default>
	//   27   57:dup             
	//   28   58:iconst_3        
	//   29   59:aload_1         
	//   30   60:invokespecial   #51  <Method void StdKeySerializers$Default(int, Class)>
	//   31   63:areturn         
		if(((Class) (java/util/Date)).isAssignableFrom(class1))
	//*  32   64:ldc1            #67  <Class Date>
	//*  33   66:aload_1         
	//*  34   67:invokevirtual   #65  <Method boolean Class.isAssignableFrom(Class)>
	//*  35   70:ifeq            83
			return ((JsonSerializer) (new Default(1, class1)));
	//   36   73:new             #6   <Class StdKeySerializers$Default>
	//   37   76:dup             
	//   38   77:iconst_1        
	//   39   78:aload_1         
	//   40   79:invokespecial   #51  <Method void StdKeySerializers$Default(int, Class)>
	//   41   82:areturn         
		if(((Class) (java/util/Calendar)).isAssignableFrom(class1))
	//*  42   83:ldc1            #69  <Class Calendar>
	//*  43   85:aload_1         
	//*  44   86:invokevirtual   #65  <Method boolean Class.isAssignableFrom(Class)>
	//*  45   89:ifeq            102
			return ((JsonSerializer) (new Default(2, class1)));
	//   46   92:new             #6   <Class StdKeySerializers$Default>
	//   47   95:dup             
	//   48   96:iconst_2        
	//   49   97:aload_1         
	//   50   98:invokespecial   #51  <Method void StdKeySerializers$Default(int, Class)>
	//   51  101:areturn         
		if(class1 == java/util/UUID)
	//*  52  102:aload_1         
	//*  53  103:ldc1            #71  <Class UUID>
	//*  54  105:if_acmpne       118
			return ((JsonSerializer) (new Default(5, class1)));
	//   55  108:new             #6   <Class StdKeySerializers$Default>
	//   56  111:dup             
	//   57  112:iconst_5        
	//   58  113:aload_1         
	//   59  114:invokespecial   #51  <Method void StdKeySerializers$Default(int, Class)>
	//   60  117:areturn         
		if(flag)
	//*  61  118:iload_2         
	//*  62  119:ifeq            126
			return DEFAULT_KEY_SERIALIZER;
	//   63  122:getstatic       #26  <Field JsonSerializer DEFAULT_KEY_SERIALIZER>
	//   64  125:areturn         
		else
			return null;
	//   65  126:aconst_null     
	//   66  127:areturn         
	}

	protected static final JsonSerializer DEFAULT_KEY_SERIALIZER = new StdKeySerializer();
	protected static final JsonSerializer DEFAULT_STRING_SERIALIZER = new StringKeySerializer();

	static 
	{
	//    0    0:new             #21  <Class StdKeySerializer>
	//    1    3:dup             
	//    2    4:invokespecial   #24  <Method void StdKeySerializer()>
	//    3    7:putstatic       #26  <Field JsonSerializer DEFAULT_KEY_SERIALIZER>
	//    4   10:new             #12  <Class StdKeySerializers$StringKeySerializer>
	//    5   13:dup             
	//    6   14:invokespecial   #27  <Method void StdKeySerializers$StringKeySerializer()>
	//    7   17:putstatic       #29  <Field JsonSerializer DEFAULT_STRING_SERIALIZER>
	//*   8   20:return          
	}
}
