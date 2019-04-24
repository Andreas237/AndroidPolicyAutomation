// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.*;
import java.util.Arrays;

public abstract class PropertySerializerMap
{
	private static final class Double extends PropertySerializerMap
	{

		public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
		{
			return ((PropertySerializerMap) (new Multi(((PropertySerializerMap) (this)), new TypeAndSerializer[] {
				new TypeAndSerializer(_type1, _serializer1), new TypeAndSerializer(_type2, _serializer2), new TypeAndSerializer(class1, jsonserializer)
			})));
		//    0    0:new             #33  <Class PropertySerializerMap$Multi>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:iconst_3        
		//    4    6:anewarray       TypeAndSerializer[]
		//    5    9:dup             
		//    6   10:iconst_0        
		//    7   11:new             #35  <Class PropertySerializerMap$TypeAndSerializer>
		//    8   14:dup             
		//    9   15:aload_0         
		//   10   16:getfield        #20  <Field Class _type1>
		//   11   19:aload_0         
		//   12   20:getfield        #22  <Field JsonSerializer _serializer1>
		//   13   23:invokespecial   #38  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
		//   14   26:aastore         
		//   15   27:dup             
		//   16   28:iconst_1        
		//   17   29:new             #35  <Class PropertySerializerMap$TypeAndSerializer>
		//   18   32:dup             
		//   19   33:aload_0         
		//   20   34:getfield        #24  <Field Class _type2>
		//   21   37:aload_0         
		//   22   38:getfield        #26  <Field JsonSerializer _serializer2>
		//   23   41:invokespecial   #38  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
		//   24   44:aastore         
		//   25   45:dup             
		//   26   46:iconst_2        
		//   27   47:new             #35  <Class PropertySerializerMap$TypeAndSerializer>
		//   28   50:dup             
		//   29   51:aload_1         
		//   30   52:aload_2         
		//   31   53:invokespecial   #38  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
		//   32   56:aastore         
		//   33   57:invokespecial   #41  <Method void PropertySerializerMap$Multi(PropertySerializerMap, PropertySerializerMap$TypeAndSerializer[])>
		//   34   60:areturn         
		}

		public JsonSerializer serializerFor(Class class1)
		{
			if(class1 == _type1)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #20  <Field Class _type1>
		//*   3    5:if_acmpne       13
				return _serializer1;
		//    4    8:aload_0         
		//    5    9:getfield        #22  <Field JsonSerializer _serializer1>
		//    6   12:areturn         
			if(class1 == _type2)
		//*   7   13:aload_1         
		//*   8   14:aload_0         
		//*   9   15:getfield        #24  <Field Class _type2>
		//*  10   18:if_acmpne       26
				return _serializer2;
		//   11   21:aload_0         
		//   12   22:getfield        #26  <Field JsonSerializer _serializer2>
		//   13   25:areturn         
			else
				return null;
		//   14   26:aconst_null     
		//   15   27:areturn         
		}

		private final JsonSerializer _serializer1;
		private final JsonSerializer _serializer2;
		private final Class _type1;
		private final Class _type2;

		public Double(PropertySerializerMap propertyserializermap, Class class1, JsonSerializer jsonserializer, Class class2, JsonSerializer jsonserializer1)
		{
			super(propertyserializermap);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #18  <Method void PropertySerializerMap(PropertySerializerMap)>
			_type1 = class1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #20  <Field Class _type1>
			_serializer1 = jsonserializer;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #22  <Field JsonSerializer _serializer1>
			_type2 = class2;
		//    9   15:aload_0         
		//   10   16:aload           4
		//   11   18:putfield        #24  <Field Class _type2>
			_serializer2 = jsonserializer1;
		//   12   21:aload_0         
		//   13   22:aload           5
		//   14   24:putfield        #26  <Field JsonSerializer _serializer2>
		//   15   27:return          
		}
	}

	private static final class Empty extends PropertySerializerMap
	{

		public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
		{
			return ((PropertySerializerMap) (new Single(((PropertySerializerMap) (this)), class1, jsonserializer)));
		//    0    0:new             #24  <Class PropertySerializerMap$Single>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #27  <Method void PropertySerializerMap$Single(PropertySerializerMap, Class, JsonSerializer)>
		//    6   10:areturn         
		}

		public JsonSerializer serializerFor(Class class1)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public static final Empty FOR_PROPERTIES = new Empty(false);
		public static final Empty FOR_ROOT_VALUES = new Empty(true);

		static 
		{
		//    0    0:new             #2   <Class PropertySerializerMap$Empty>
		//    1    3:dup             
		//    2    4:iconst_0        
		//    3    5:invokespecial   #14  <Method void PropertySerializerMap$Empty(boolean)>
		//    4    8:putstatic       #16  <Field PropertySerializerMap$Empty FOR_PROPERTIES>
		//    5   11:new             #2   <Class PropertySerializerMap$Empty>
		//    6   14:dup             
		//    7   15:iconst_1        
		//    8   16:invokespecial   #14  <Method void PropertySerializerMap$Empty(boolean)>
		//    9   19:putstatic       #18  <Field PropertySerializerMap$Empty FOR_ROOT_VALUES>
		//*  10   22:return          
		}

		protected Empty(boolean flag)
		{
			super(flag);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #20  <Method void PropertySerializerMap(boolean)>
		//    3    5:return          
		}
	}

	private static final class Multi extends PropertySerializerMap
	{

		public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
		{
			int i = _entries.length;
		//    0    0:aload_0         
		//    1    1:getfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
		//    2    4:arraylength     
		//    3    5:istore_3        
			if(i == 8)
		//*   4    6:iload_3         
		//*   5    7:bipush          8
		//*   6    9:icmpne          37
			{
				Object obj = ((Object) (this));
		//    7   12:aload_0         
		//    8   13:astore          4
				if(_resetWhenFull)
		//*   9   15:aload_0         
		//*  10   16:getfield        #24  <Field boolean _resetWhenFull>
		//*  11   19:ifeq            34
					obj = ((Object) (new Single(((PropertySerializerMap) (this)), class1, jsonserializer)));
		//   12   22:new             #26  <Class PropertySerializerMap$Single>
		//   13   25:dup             
		//   14   26:aload_0         
		//   15   27:aload_1         
		//   16   28:aload_2         
		//   17   29:invokespecial   #29  <Method void PropertySerializerMap$Single(PropertySerializerMap, Class, JsonSerializer)>
		//   18   32:astore          4
				return ((PropertySerializerMap) (obj));
		//   19   34:aload           4
		//   20   36:areturn         
			} else
			{
				TypeAndSerializer atypeandserializer[] = (TypeAndSerializer[])Arrays.copyOf(((Object []) (_entries)), i + 1);
		//   21   37:aload_0         
		//   22   38:getfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
		//   23   41:iload_3         
		//   24   42:iconst_1        
		//   25   43:iadd            
		//   26   44:invokestatic    #35  <Method Object[] Arrays.copyOf(Object[], int)>
		//   27   47:checkcast       #36  <Class PropertySerializerMap$TypeAndSerializer[]>
		//   28   50:astore          4
				atypeandserializer[i] = new TypeAndSerializer(class1, jsonserializer);
		//   29   52:aload           4
		//   30   54:iload_3         
		//   31   55:new             #38  <Class PropertySerializerMap$TypeAndSerializer>
		//   32   58:dup             
		//   33   59:aload_1         
		//   34   60:aload_2         
		//   35   61:invokespecial   #41  <Method void PropertySerializerMap$TypeAndSerializer(Class, JsonSerializer)>
		//   36   64:aastore         
				return ((PropertySerializerMap) (new Multi(((PropertySerializerMap) (this)), atypeandserializer)));
		//   37   65:new             #2   <Class PropertySerializerMap$Multi>
		//   38   68:dup             
		//   39   69:aload_0         
		//   40   70:aload           4
		//   41   72:invokespecial   #43  <Method void PropertySerializerMap$Multi(PropertySerializerMap, PropertySerializerMap$TypeAndSerializer[])>
		//   42   75:areturn         
			}
		}

		public JsonSerializer serializerFor(Class class1)
		{
			int i = 0;
		//    0    0:iconst_0        
		//    1    1:istore_2        
			for(int j = _entries.length; i < j; i++)
		//*   2    2:aload_0         
		//*   3    3:getfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
		//*   4    6:arraylength     
		//*   5    7:istore_3        
		//*   6    8:iload_2         
		//*   7    9:iload_3         
		//*   8   10:icmpge          43
			{
				TypeAndSerializer typeandserializer = _entries[i];
		//    9   13:aload_0         
		//   10   14:getfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
		//   11   17:iload_2         
		//   12   18:aaload          
		//   13   19:astore          4
				if(typeandserializer.type == class1)
		//*  14   21:aload           4
		//*  15   23:getfield        #51  <Field Class PropertySerializerMap$TypeAndSerializer.type>
		//*  16   26:aload_1         
		//*  17   27:if_acmpne       36
					return typeandserializer.serializer;
		//   18   30:aload           4
		//   19   32:getfield        #55  <Field JsonSerializer PropertySerializerMap$TypeAndSerializer.serializer>
		//   20   35:areturn         
			}

		//   21   36:iload_2         
		//   22   37:iconst_1        
		//   23   38:iadd            
		//   24   39:istore_2        
		//*  25   40:goto            8
			return null;
		//   26   43:aconst_null     
		//   27   44:areturn         
		}

		private static final int MAX_ENTRIES = 8;
		private final TypeAndSerializer _entries[];

		public Multi(PropertySerializerMap propertyserializermap, TypeAndSerializer atypeandserializer[])
		{
			super(propertyserializermap);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #15  <Method void PropertySerializerMap(PropertySerializerMap)>
			_entries = atypeandserializer;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #17  <Field PropertySerializerMap$TypeAndSerializer[] _entries>
		//    6   10:return          
		}
	}

	public static final class SerializerAndMapResult
	{

		public final PropertySerializerMap map;
		public final JsonSerializer serializer;

		public SerializerAndMapResult(JsonSerializer jsonserializer, PropertySerializerMap propertyserializermap)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			serializer = jsonserializer;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field JsonSerializer serializer>
			map = propertyserializermap;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #21  <Field PropertySerializerMap map>
		//    8   14:return          
		}
	}

	private static final class Single extends PropertySerializerMap
	{

		public PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer)
		{
			return ((PropertySerializerMap) (new Double(((PropertySerializerMap) (this)), _type, _serializer, class1, jsonserializer)));
		//    0    0:new             #27  <Class PropertySerializerMap$Double>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_0         
		//    4    6:getfield        #18  <Field Class _type>
		//    5    9:aload_0         
		//    6   10:getfield        #20  <Field JsonSerializer _serializer>
		//    7   13:aload_1         
		//    8   14:aload_2         
		//    9   15:invokespecial   #30  <Method void PropertySerializerMap$Double(PropertySerializerMap, Class, JsonSerializer, Class, JsonSerializer)>
		//   10   18:areturn         
		}

		public JsonSerializer serializerFor(Class class1)
		{
			if(class1 == _type)
		//*   0    0:aload_1         
		//*   1    1:aload_0         
		//*   2    2:getfield        #18  <Field Class _type>
		//*   3    5:if_acmpne       13
				return _serializer;
		//    4    8:aload_0         
		//    5    9:getfield        #20  <Field JsonSerializer _serializer>
		//    6   12:areturn         
			else
				return null;
		//    7   13:aconst_null     
		//    8   14:areturn         
		}

		private final JsonSerializer _serializer;
		private final Class _type;

		public Single(PropertySerializerMap propertyserializermap, Class class1, JsonSerializer jsonserializer)
		{
			super(propertyserializermap);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #16  <Method void PropertySerializerMap(PropertySerializerMap)>
			_type = class1;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #18  <Field Class _type>
			_serializer = jsonserializer;
		//    6   10:aload_0         
		//    7   11:aload_3         
		//    8   12:putfield        #20  <Field JsonSerializer _serializer>
		//    9   15:return          
		}
	}

	private static final class TypeAndSerializer
	{

		public final JsonSerializer serializer;
		public final Class type;

		public TypeAndSerializer(Class class1, JsonSerializer jsonserializer)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			type = class1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field Class type>
			serializer = jsonserializer;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field JsonSerializer serializer>
		//    8   14:return          
		}
	}


	protected PropertySerializerMap(PropertySerializerMap propertyserializermap)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		_resetWhenFull = propertyserializermap._resetWhenFull;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:getfield        #31  <Field boolean _resetWhenFull>
	//    5    9:putfield        #31  <Field boolean _resetWhenFull>
	//    6   12:return          
	}

	protected PropertySerializerMap(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		_resetWhenFull = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #31  <Field boolean _resetWhenFull>
	//    5    9:return          
	}

	public static PropertySerializerMap emptyForProperties()
	{
		return ((PropertySerializerMap) (Empty.FOR_PROPERTIES));
	//    0    0:getstatic       #39  <Field PropertySerializerMap$Empty PropertySerializerMap$Empty.FOR_PROPERTIES>
	//    1    3:areturn         
	}

	public static PropertySerializerMap emptyForRootValues()
	{
		return ((PropertySerializerMap) (Empty.FOR_ROOT_VALUES));
	//    0    0:getstatic       #43  <Field PropertySerializerMap$Empty PropertySerializerMap$Empty.FOR_ROOT_VALUES>
	//    1    3:areturn         
	}

	public static PropertySerializerMap emptyMap()
	{
		return emptyForProperties();
	//    0    0:invokestatic    #47  <Method PropertySerializerMap emptyForProperties()>
	//    1    3:areturn         
	}

	public final SerializerAndMapResult addSerializer(JavaType javatype, JsonSerializer jsonserializer)
	{
		return new SerializerAndMapResult(jsonserializer, newWith(javatype.getRawClass(), jsonserializer));
	//    0    0:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//    8   14:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//    9   17:areturn         
	}

	public final SerializerAndMapResult addSerializer(Class class1, JsonSerializer jsonserializer)
	{
		return new SerializerAndMapResult(jsonserializer, newWith(class1, jsonserializer));
	//    0    0:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//    7   11:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//    8   14:areturn         
	}

	public final SerializerAndMapResult findAndAddKeySerializer(Class class1, SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.findKeySerializer(class1, beanproperty)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #77  <Method JsonSerializer SerializerProvider.findKeySerializer(Class, BeanProperty)>
	//    4    6:astore_2        
		return new SerializerAndMapResult(((JsonSerializer) (serializerprovider)), newWith(class1, ((JsonSerializer) (serializerprovider))));
	//    5    7:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//   12   18:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//   13   21:areturn         
	}

	public final SerializerAndMapResult findAndAddPrimarySerializer(JavaType javatype, SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.findPrimaryPropertySerializer(javatype, beanproperty)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #85  <Method JsonSerializer SerializerProvider.findPrimaryPropertySerializer(JavaType, BeanProperty)>
	//    4    6:astore_2        
		return new SerializerAndMapResult(((JsonSerializer) (serializerprovider)), newWith(javatype.getRawClass(), ((JsonSerializer) (serializerprovider))));
	//    5    7:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//   11   17:aload_2         
	//   12   18:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//   13   21:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//   14   24:areturn         
	}

	public final SerializerAndMapResult findAndAddPrimarySerializer(Class class1, SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.findPrimaryPropertySerializer(class1, beanproperty)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #87  <Method JsonSerializer SerializerProvider.findPrimaryPropertySerializer(Class, BeanProperty)>
	//    4    6:astore_2        
		return new SerializerAndMapResult(((JsonSerializer) (serializerprovider)), newWith(class1, ((JsonSerializer) (serializerprovider))));
	//    5    7:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//   12   18:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//   13   21:areturn         
	}

	public final SerializerAndMapResult findAndAddRootValueSerializer(JavaType javatype, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.findTypedValueSerializer(javatype, false, ((BeanProperty) (null)))));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #93  <Method JsonSerializer SerializerProvider.findTypedValueSerializer(JavaType, boolean, BeanProperty)>
	//    5    7:astore_2        
		return new SerializerAndMapResult(((JsonSerializer) (serializerprovider)), newWith(javatype.getRawClass(), ((JsonSerializer) (serializerprovider))));
	//    6    8:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    7   11:dup             
	//    8   12:aload_2         
	//    9   13:aload_0         
	//   10   14:aload_1         
	//   11   15:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//   12   18:aload_2         
	//   13   19:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//   14   22:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//   15   25:areturn         
	}

	public final SerializerAndMapResult findAndAddRootValueSerializer(Class class1, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.findTypedValueSerializer(class1, false, ((BeanProperty) (null)))));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #97  <Method JsonSerializer SerializerProvider.findTypedValueSerializer(Class, boolean, BeanProperty)>
	//    5    7:astore_2        
		return new SerializerAndMapResult(((JsonSerializer) (serializerprovider)), newWith(class1, ((JsonSerializer) (serializerprovider))));
	//    6    8:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    7   11:dup             
	//    8   12:aload_2         
	//    9   13:aload_0         
	//   10   14:aload_1         
	//   11   15:aload_2         
	//   12   16:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//   13   19:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//   14   22:areturn         
	}

	public final SerializerAndMapResult findAndAddSecondarySerializer(JavaType javatype, SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(javatype, beanproperty)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #102 <Method JsonSerializer SerializerProvider.findValueSerializer(JavaType, BeanProperty)>
	//    4    6:astore_2        
		return new SerializerAndMapResult(((JsonSerializer) (serializerprovider)), newWith(javatype.getRawClass(), ((JsonSerializer) (serializerprovider))));
	//    5    7:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:invokevirtual   #56  <Method Class JavaType.getRawClass()>
	//   11   17:aload_2         
	//   12   18:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//   13   21:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//   14   24:areturn         
	}

	public final SerializerAndMapResult findAndAddSecondarySerializer(Class class1, SerializerProvider serializerprovider, BeanProperty beanproperty)
		throws JsonMappingException
	{
		serializerprovider = ((SerializerProvider) (serializerprovider.findValueSerializer(class1, beanproperty)));
	//    0    0:aload_2         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #104 <Method JsonSerializer SerializerProvider.findValueSerializer(Class, BeanProperty)>
	//    4    6:astore_2        
		return new SerializerAndMapResult(((JsonSerializer) (serializerprovider)), newWith(class1, ((JsonSerializer) (serializerprovider))));
	//    5    7:new             #15  <Class PropertySerializerMap$SerializerAndMapResult>
	//    6   10:dup             
	//    7   11:aload_2         
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokevirtual   #60  <Method PropertySerializerMap newWith(Class, JsonSerializer)>
	//   12   18:invokespecial   #63  <Method void PropertySerializerMap$SerializerAndMapResult(JsonSerializer, PropertySerializerMap)>
	//   13   21:areturn         
	}

	public abstract PropertySerializerMap newWith(Class class1, JsonSerializer jsonserializer);

	public abstract JsonSerializer serializerFor(Class class1);

	protected final boolean _resetWhenFull;
}
