// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//			SerializerFactory

public abstract class DefaultSerializerProvider extends SerializerProvider
	implements Serializable
{
	public static final class Impl extends DefaultSerializerProvider
	{

		public Impl createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
		{
			return new Impl(((SerializerProvider) (this)), serializationconfig, serializerfactory);
		//    0    0:new             #2   <Class DefaultSerializerProvider$Impl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:invokespecial   #20  <Method void DefaultSerializerProvider$Impl(SerializerProvider, SerializationConfig, SerializerFactory)>
		//    6   10:areturn         
		}

		public volatile DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory)
		{
			return ((DefaultSerializerProvider) (createInstance(serializationconfig, serializerfactory)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #23  <Method DefaultSerializerProvider$Impl createInstance(SerializationConfig, SerializerFactory)>
		//    4    6:areturn         
		}

		private static final long serialVersionUID = 1L;

		public Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void DefaultSerializerProvider()>
		//    2    4:return          
		}

		protected Impl(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
		{
			super(serializerprovider, serializationconfig, serializerfactory);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:invokespecial   #17  <Method void DefaultSerializerProvider(SerializerProvider, SerializationConfig, SerializerFactory)>
		//    5    7:return          
		}
	}


	protected DefaultSerializerProvider()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void SerializerProvider()>
	//    2    4:return          
	}

	protected DefaultSerializerProvider(SerializerProvider serializerprovider, SerializationConfig serializationconfig, SerializerFactory serializerfactory)
	{
		super(serializerprovider, serializationconfig, serializerfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #29  <Method void SerializerProvider(SerializerProvider, SerializationConfig, SerializerFactory)>
	//    5    7:return          
	}

	private final void _serialize(JsonGenerator jsongenerator, Object obj, JsonSerializer jsonserializer)
		throws IOException
	{
		try
		{
			jsonserializer.serialize(obj, jsongenerator, ((SerializerProvider) (this)));
	//    0    0:aload_3         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:aload_0         
	//    4    4:invokevirtual   #41  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//    5    7:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*   6    8:astore_2        
		{
			throw _wrapAsIOE(jsongenerator, ((Exception) (obj)));
	//    7    9:aload_0         
	//    8   10:aload_1         
	//    9   11:aload_2         
	//   10   12:invokespecial   #45  <Method IOException _wrapAsIOE(JsonGenerator, Exception)>
	//   11   15:athrow          
		}
	}

	private final void _serialize(JsonGenerator jsongenerator, Object obj, JsonSerializer jsonserializer, PropertyName propertyname)
		throws IOException
	{
		try
		{
			jsongenerator.writeStartObject();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #54  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(propertyname.simpleAsEncoded(((com.fasterxml.jackson.databind.cfg.MapperConfig) (_config))));
	//    2    4:aload_1         
	//    3    5:aload           4
	//    4    7:aload_0         
	//    5    8:getfield        #58  <Field SerializationConfig _config>
	//    6   11:invokevirtual   #64  <Method com.fasterxml.jackson.core.SerializableString PropertyName.simpleAsEncoded(com.fasterxml.jackson.databind.cfg.MapperConfig)>
	//    7   14:invokevirtual   #68  <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
			jsonserializer.serialize(obj, jsongenerator, ((SerializerProvider) (this)));
	//    8   17:aload_3         
	//    9   18:aload_2         
	//   10   19:aload_1         
	//   11   20:aload_0         
	//   12   21:invokevirtual   #41  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			jsongenerator.writeEndObject();
	//   13   24:aload_1         
	//   14   25:invokevirtual   #71  <Method void JsonGenerator.writeEndObject()>
			return;
	//   15   28:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  16   29:astore_2        
		{
			throw _wrapAsIOE(jsongenerator, ((Exception) (obj)));
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:aload_2         
	//   20   33:invokespecial   #45  <Method IOException _wrapAsIOE(JsonGenerator, Exception)>
	//   21   36:athrow          
		}
	}

	private IOException _wrapAsIOE(JsonGenerator jsongenerator, Exception exception)
	{
		if(exception instanceof IOException)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #33  <Class IOException>
	//*   2    4:ifeq            12
			return (IOException)exception;
	//    3    7:aload_2         
	//    4    8:checkcast       #33  <Class IOException>
	//    5   11:areturn         
		String s = exception.getMessage();
	//    6   12:aload_2         
	//    7   13:invokevirtual   #76  <Method String Exception.getMessage()>
	//    8   16:astore          4
		Object obj = ((Object) (s));
	//    9   18:aload           4
	//   10   20:astore_3        
		if(s == null)
	//*  11   21:aload           4
	//*  12   23:ifnonnull       65
		{
			obj = ((Object) (new StringBuilder()));
	//   13   26:new             #78  <Class StringBuilder>
	//   14   29:dup             
	//   15   30:invokespecial   #79  <Method void StringBuilder()>
	//   16   33:astore_3        
			((StringBuilder) (obj)).append("[no message for ");
	//   17   34:aload_3         
	//   18   35:ldc1            #81  <String "[no message for ">
	//   19   37:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   20   40:pop             
			((StringBuilder) (obj)).append(((Object) (exception)).getClass().getName());
	//   21   41:aload_3         
	//   22   42:aload_2         
	//   23   43:invokevirtual   #91  <Method Class Object.getClass()>
	//   24   46:invokevirtual   #96  <Method String Class.getName()>
	//   25   49:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   26   52:pop             
			((StringBuilder) (obj)).append("]");
	//   27   53:aload_3         
	//   28   54:ldc1            #98  <String "]">
	//   29   56:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   30   59:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   31   60:aload_3         
	//   32   61:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   33   64:astore_3        
		}
		return ((IOException) (new JsonMappingException(((java.io.Closeable) (jsongenerator)), ((String) (obj)), ((Throwable) (exception)))));
	//   34   65:new             #103 <Class JsonMappingException>
	//   35   68:dup             
	//   36   69:aload_1         
	//   37   70:aload_3         
	//   38   71:aload_2         
	//   39   72:invokespecial   #106 <Method void JsonMappingException(java.io.Closeable, String, Throwable)>
	//   40   75:areturn         
	}

	protected Map _createObjectIdMap()
	{
		if(isEnabled(SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #114 <Field SerializationFeature SerializationFeature.USE_EQUALITY_FOR_OBJECT_ID>
	//*   2    4:invokevirtual   #118 <Method boolean isEnabled(SerializationFeature)>
	//*   3    7:ifeq            18
			return ((Map) (new HashMap()));
	//    4   10:new             #120 <Class HashMap>
	//    5   13:dup             
	//    6   14:invokespecial   #121 <Method void HashMap()>
	//    7   17:areturn         
		else
			return ((Map) (new IdentityHashMap()));
	//    8   18:new             #123 <Class IdentityHashMap>
	//    9   21:dup             
	//   10   22:invokespecial   #124 <Method void IdentityHashMap()>
	//   11   25:areturn         
	}

	protected void _serializeNull(JsonGenerator jsongenerator)
		throws IOException
	{
		JsonSerializer jsonserializer = getDefaultNullValueSerializer();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #131 <Method JsonSerializer getDefaultNullValueSerializer()>
	//    2    4:astore_2        
		try
		{
			jsonserializer.serialize(((Object) (null)), jsongenerator, ((SerializerProvider) (this)));
	//    3    5:aload_2         
	//    4    6:aconst_null     
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:invokevirtual   #41  <Method void JsonSerializer.serialize(Object, JsonGenerator, SerializerProvider)>
			return;
	//    8   12:return          
		}
		catch(Exception exception)
	//*   9   13:astore_2        
		{
			throw _wrapAsIOE(jsongenerator, exception);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:aload_2         
	//   13   17:invokespecial   #45  <Method IOException _wrapAsIOE(JsonGenerator, Exception)>
	//   14   20:athrow          
		}
	}

	public abstract DefaultSerializerProvider createInstance(SerializationConfig serializationconfig, SerializerFactory serializerfactory);

	public WritableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator)
	{
		Object obj1 = ((Object) (_seenObjectIds));
	//    0    0:aload_0         
	//    1    1:getfield        #137 <Field Map _seenObjectIds>
	//    2    4:astore          5
		if(obj1 == null)
	//*   3    6:aload           5
	//*   4    8:ifnonnull       22
		{
			_seenObjectIds = _createObjectIdMap();
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #139 <Method Map _createObjectIdMap()>
	//    8   16:putfield        #137 <Field Map _seenObjectIds>
		} else
	//*   9   19:goto            43
		{
			obj1 = ((Object) ((WritableObjectId)((Map) (obj1)).get(obj)));
	//   10   22:aload           5
	//   11   24:aload_1         
	//   12   25:invokeinterface #145 <Method Object Map.get(Object)>
	//   13   30:checkcast       #147 <Class WritableObjectId>
	//   14   33:astore          5
			if(obj1 != null)
	//*  15   35:aload           5
	//*  16   37:ifnull          43
				return ((WritableObjectId) (obj1));
	//   17   40:aload           5
	//   18   42:areturn         
		}
		Object obj2 = null;
	//   19   43:aconst_null     
	//   20   44:astore          6
		obj1 = ((Object) (_objectIdGenerators));
	//   21   46:aload_0         
	//   22   47:getfield        #149 <Field ArrayList _objectIdGenerators>
	//   23   50:astore          5
		if(obj1 == null)
	//*  24   52:aload           5
	//*  25   54:ifnonnull       77
		{
			_objectIdGenerators = new ArrayList(8);
	//   26   57:aload_0         
	//   27   58:new             #151 <Class ArrayList>
	//   28   61:dup             
	//   29   62:bipush          8
	//   30   64:invokespecial   #154 <Method void ArrayList(int)>
	//   31   67:putfield        #149 <Field ArrayList _objectIdGenerators>
			obj1 = obj2;
	//   32   70:aload           6
	//   33   72:astore          5
		} else
	//*  34   74:goto            128
		{
			int i = 0;
	//   35   77:iconst_0        
	//   36   78:istore_3        
			int j = ((ArrayList) (obj1)).size();
	//   37   79:aload           5
	//   38   81:invokevirtual   #158 <Method int ArrayList.size()>
	//   39   84:istore          4
			do
			{
				obj1 = obj2;
	//   40   86:aload           6
	//   41   88:astore          5
				if(i >= j)
					break;
	//   42   90:iload_3         
	//   43   91:iload           4
	//   44   93:icmpge          128
				obj1 = ((Object) ((ObjectIdGenerator)_objectIdGenerators.get(i)));
	//   45   96:aload_0         
	//   46   97:getfield        #149 <Field ArrayList _objectIdGenerators>
	//   47  100:iload_3         
	//   48  101:invokevirtual   #161 <Method Object ArrayList.get(int)>
	//   49  104:checkcast       #163 <Class ObjectIdGenerator>
	//   50  107:astore          5
				if(((ObjectIdGenerator) (obj1)).canUseFor(objectidgenerator))
	//*  51  109:aload           5
	//*  52  111:aload_2         
	//*  53  112:invokevirtual   #167 <Method boolean ObjectIdGenerator.canUseFor(ObjectIdGenerator)>
	//*  54  115:ifeq            121
					break;
	//   55  118:goto            128
				i++;
	//   56  121:iload_3         
	//   57  122:iconst_1        
	//   58  123:iadd            
	//   59  124:istore_3        
			} while(true);
	//   60  125:goto            86
		}
		obj2 = obj1;
	//   61  128:aload           5
	//   62  130:astore          6
		if(obj1 == null)
	//*  63  132:aload           5
	//*  64  134:ifnonnull       154
		{
			obj2 = ((Object) (objectidgenerator.newForSerialization(((Object) (this)))));
	//   65  137:aload_2         
	//   66  138:aload_0         
	//   67  139:invokevirtual   #171 <Method ObjectIdGenerator ObjectIdGenerator.newForSerialization(Object)>
	//   68  142:astore          6
			_objectIdGenerators.add(obj2);
	//   69  144:aload_0         
	//   70  145:getfield        #149 <Field ArrayList _objectIdGenerators>
	//   71  148:aload           6
	//   72  150:invokevirtual   #175 <Method boolean ArrayList.add(Object)>
	//   73  153:pop             
		}
		objectidgenerator = ((ObjectIdGenerator) (new WritableObjectId(((ObjectIdGenerator) (obj2)))));
	//   74  154:new             #147 <Class WritableObjectId>
	//   75  157:dup             
	//   76  158:aload           6
	//   77  160:invokespecial   #178 <Method void WritableObjectId(ObjectIdGenerator)>
	//   78  163:astore_2        
		_seenObjectIds.put(obj, ((Object) (objectidgenerator)));
	//   79  164:aload_0         
	//   80  165:getfield        #137 <Field Map _seenObjectIds>
	//   81  168:aload_1         
	//   82  169:aload_2         
	//   83  170:invokeinterface #182 <Method Object Map.put(Object, Object)>
	//   84  175:pop             
		return ((WritableObjectId) (objectidgenerator));
	//   85  176:aload_2         
	//   86  177:areturn         
	}

	public JsonGenerator getGenerator()
	{
		return _generator;
	//    0    0:aload_0         
	//    1    1:getfield        #187 <Field JsonGenerator _generator>
	//    2    4:areturn         
	}

	public Object includeFilterInstance(BeanPropertyDefinition beanpropertydefinition, Class class1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(class1 == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       8
			return ((Object) (null));
	//    4    6:aconst_null     
	//    5    7:areturn         
		HandlerInstantiator handlerinstantiator = _config.getHandlerInstantiator();
	//    6    8:aload_0         
	//    7    9:getfield        #58  <Field SerializationConfig _config>
	//    8   12:invokevirtual   #195 <Method HandlerInstantiator SerializationConfig.getHandlerInstantiator()>
	//    9   15:astore          4
		if(handlerinstantiator == null)
	//*  10   17:aload           4
	//*  11   19:ifnonnull       27
			beanpropertydefinition = ((BeanPropertyDefinition) (obj));
	//   12   22:aload_3         
	//   13   23:astore_1        
		else
	//*  14   24:goto            39
			beanpropertydefinition = ((BeanPropertyDefinition) (handlerinstantiator.includeFilterInstance(_config, beanpropertydefinition, class1)));
	//   15   27:aload           4
	//   16   29:aload_0         
	//   17   30:getfield        #58  <Field SerializationConfig _config>
	//   18   33:aload_1         
	//   19   34:aload_2         
	//   20   35:invokevirtual   #200 <Method Object HandlerInstantiator.includeFilterInstance(SerializationConfig, BeanPropertyDefinition, Class)>
	//   21   38:astore_1        
		obj = ((Object) (beanpropertydefinition));
	//   22   39:aload_1         
	//   23   40:astore_3        
		if(beanpropertydefinition == null)
	//*  24   41:aload_1         
	//*  25   42:ifnonnull       57
			obj = ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers());
	//   26   45:aload_2         
	//   27   46:aload_0         
	//   28   47:getfield        #58  <Field SerializationConfig _config>
	//   29   50:invokevirtual   #204 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//   30   53:invokestatic    #209 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   31   56:astore_3        
		return obj;
	//   32   57:aload_3         
	//   33   58:areturn         
	}

	public boolean includeFilterSuppressNulls(Object obj)
		throws JsonMappingException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return true;
	//    2    4:iconst_1        
	//    3    5:ireturn         
		boolean flag;
		try
		{
			flag = obj.equals(((Object) (null)));
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:invokevirtual   #216 <Method boolean Object.equals(Object)>
	//    7   11:istore_2        
		}
	//*   8   12:iload_2         
	//*   9   13:ireturn         
		catch(Throwable throwable)
	//*  10   14:astore_3        
		{
			String s = String.format("Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s", new Object[] {
				obj.getClass().getName(), ((Object) (throwable)).getClass().getName(), throwable.getMessage()
			});
	//   11   15:ldc1            #218 <String "Problem determining whether filter of type '%s' should filter out `null` values: (%s) %s">
	//   12   17:iconst_3        
	//   13   18:anewarray       Object[]
	//   14   21:dup             
	//   15   22:iconst_0        
	//   16   23:aload_1         
	//   17   24:invokevirtual   #91  <Method Class Object.getClass()>
	//   18   27:invokevirtual   #96  <Method String Class.getName()>
	//   19   30:aastore         
	//   20   31:dup             
	//   21   32:iconst_1        
	//   22   33:aload_3         
	//   23   34:invokevirtual   #91  <Method Class Object.getClass()>
	//   24   37:invokevirtual   #96  <Method String Class.getName()>
	//   25   40:aastore         
	//   26   41:dup             
	//   27   42:iconst_2        
	//   28   43:aload_3         
	//   29   44:invokevirtual   #219 <Method String Throwable.getMessage()>
	//   30   47:aastore         
	//   31   48:invokestatic    #225 <Method String String.format(String, Object[])>
	//   32   51:astore          4
			reportBadDefinition(obj.getClass(), s, throwable);
	//   33   53:aload_0         
	//   34   54:aload_1         
	//   35   55:invokevirtual   #91  <Method Class Object.getClass()>
	//   36   58:aload           4
	//   37   60:aload_3         
	//   38   61:invokevirtual   #229 <Method Object reportBadDefinition(Class, String, Throwable)>
	//   39   64:pop             
			return false;
	//   40   65:iconst_0        
	//   41   66:ireturn         
		}
		return flag;
	}

	public void serializePolymorphic(JsonGenerator jsongenerator, Object obj, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer)
		throws IOException
	{
		_generator = jsongenerator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #187 <Field JsonGenerator _generator>
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			_serializeNull(jsongenerator);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #233 <Method void _serializeNull(JsonGenerator)>
			return;
	//    8   14:return          
		}
		if(javatype != null && !javatype.getRawClass().isAssignableFrom(obj.getClass()))
	//*   9   15:aload_3         
	//*  10   16:ifnull          39
	//*  11   19:aload_3         
	//*  12   20:invokevirtual   #238 <Method Class JavaType.getRawClass()>
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #91  <Method Class Object.getClass()>
	//*  15   27:invokevirtual   #242 <Method boolean Class.isAssignableFrom(Class)>
	//*  16   30:ifne            39
			_reportIncompatibleRootType(obj, javatype);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #246 <Method void _reportIncompatibleRootType(Object, JavaType)>
		JsonSerializer jsonserializer1 = jsonserializer;
	//   21   39:aload           4
	//   22   41:astore          8
		if(jsonserializer == null)
	//*  23   43:aload           4
	//*  24   45:ifnonnull       81
			if(javatype != null && javatype.isContainerType())
	//*  25   48:aload_3         
	//*  26   49:ifnull          70
	//*  27   52:aload_3         
	//*  28   53:invokevirtual   #249 <Method boolean JavaType.isContainerType()>
	//*  29   56:ifeq            70
				jsonserializer1 = findValueSerializer(javatype, ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//   30   59:aload_0         
	//   31   60:aload_3         
	//   32   61:aconst_null     
	//   33   62:invokevirtual   #253 <Method JsonSerializer findValueSerializer(JavaType, com.fasterxml.jackson.databind.BeanProperty)>
	//   34   65:astore          8
			else
	//*  35   67:goto            81
				jsonserializer1 = findValueSerializer(obj.getClass(), ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//   36   70:aload_0         
	//   37   71:aload_2         
	//   38   72:invokevirtual   #91  <Method Class Object.getClass()>
	//   39   75:aconst_null     
	//   40   76:invokevirtual   #256 <Method JsonSerializer findValueSerializer(Class, com.fasterxml.jackson.databind.BeanProperty)>
	//   41   79:astore          8
		javatype = ((JavaType) (_config.getFullRootName()));
	//   42   81:aload_0         
	//   43   82:getfield        #58  <Field SerializationConfig _config>
	//   44   85:invokevirtual   #260 <Method PropertyName SerializationConfig.getFullRootName()>
	//   45   88:astore_3        
		boolean flag;
		if(javatype == null)
	//*  46   89:aload_3         
	//*  47   90:ifnonnull       147
		{
			boolean flag1 = _config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
	//   48   93:aload_0         
	//   49   94:getfield        #58  <Field SerializationConfig _config>
	//   50   97:getstatic       #263 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//   51  100:invokevirtual   #264 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   52  103:istore          7
			flag = flag1;
	//   53  105:iload           7
	//   54  107:istore          6
			if(flag1)
	//*  55  109:iload           7
	//*  56  111:ifeq            175
			{
				jsongenerator.writeStartObject();
	//   57  114:aload_1         
	//   58  115:invokevirtual   #54  <Method void JsonGenerator.writeStartObject()>
				jsongenerator.writeFieldName(_config.findRootName(obj.getClass()).simpleAsEncoded(((com.fasterxml.jackson.databind.cfg.MapperConfig) (_config))));
	//   59  118:aload_1         
	//   60  119:aload_0         
	//   61  120:getfield        #58  <Field SerializationConfig _config>
	//   62  123:aload_2         
	//   63  124:invokevirtual   #91  <Method Class Object.getClass()>
	//   64  127:invokevirtual   #268 <Method PropertyName SerializationConfig.findRootName(Class)>
	//   65  130:aload_0         
	//   66  131:getfield        #58  <Field SerializationConfig _config>
	//   67  134:invokevirtual   #64  <Method com.fasterxml.jackson.core.SerializableString PropertyName.simpleAsEncoded(com.fasterxml.jackson.databind.cfg.MapperConfig)>
	//   68  137:invokevirtual   #68  <Method void JsonGenerator.writeFieldName(com.fasterxml.jackson.core.SerializableString)>
				flag = flag1;
	//   69  140:iload           7
	//   70  142:istore          6
			}
		} else
	//*  71  144:goto            175
		if(((PropertyName) (javatype)).isEmpty())
	//*  72  147:aload_3         
	//*  73  148:invokevirtual   #271 <Method boolean PropertyName.isEmpty()>
	//*  74  151:ifeq            160
		{
			flag = false;
	//   75  154:iconst_0        
	//   76  155:istore          6
		} else
	//*  77  157:goto            175
		{
			jsongenerator.writeStartObject();
	//   78  160:aload_1         
	//   79  161:invokevirtual   #54  <Method void JsonGenerator.writeStartObject()>
			jsongenerator.writeFieldName(((PropertyName) (javatype)).getSimpleName());
	//   80  164:aload_1         
	//   81  165:aload_3         
	//   82  166:invokevirtual   #274 <Method String PropertyName.getSimpleName()>
	//   83  169:invokevirtual   #277 <Method void JsonGenerator.writeFieldName(String)>
			flag = true;
	//   84  172:iconst_1        
	//   85  173:istore          6
		}
		try
		{
			jsonserializer1.serializeWithType(obj, jsongenerator, ((SerializerProvider) (this)), typeserializer);
	//   86  175:aload           8
	//   87  177:aload_2         
	//   88  178:aload_1         
	//   89  179:aload_0         
	//   90  180:aload           5
	//   91  182:invokevirtual   #281 <Method void JsonSerializer.serializeWithType(Object, JsonGenerator, SerializerProvider, TypeSerializer)>
		}
	//*  92  185:iload           6
	//*  93  187:ifeq            194
	//*  94  190:aload_1         
	//*  95  191:invokevirtual   #71  <Method void JsonGenerator.writeEndObject()>
	//*  96  194:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  97  195:astore_2        
		{
			throw _wrapAsIOE(jsongenerator, ((Exception) (obj)));
	//   98  196:aload_0         
	//   99  197:aload_1         
	//  100  198:aload_2         
	//  101  199:invokespecial   #45  <Method IOException _wrapAsIOE(JsonGenerator, Exception)>
	//  102  202:athrow          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_194;
		jsongenerator.writeEndObject();
	}

	public void serializeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		_generator = jsongenerator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #187 <Field JsonGenerator _generator>
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			_serializeNull(jsongenerator);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #233 <Method void _serializeNull(JsonGenerator)>
			return;
	//    8   14:return          
		}
		Class class1 = obj.getClass();
	//    9   15:aload_2         
	//   10   16:invokevirtual   #91  <Method Class Object.getClass()>
	//   11   19:astore_3        
		JsonSerializer jsonserializer = findTypedValueSerializer(class1, true, ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//   12   20:aload_0         
	//   13   21:aload_3         
	//   14   22:iconst_1        
	//   15   23:aconst_null     
	//   16   24:invokevirtual   #288 <Method JsonSerializer findTypedValueSerializer(Class, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   17   27:astore          4
		PropertyName propertyname = _config.getFullRootName();
	//   18   29:aload_0         
	//   19   30:getfield        #58  <Field SerializationConfig _config>
	//   20   33:invokevirtual   #260 <Method PropertyName SerializationConfig.getFullRootName()>
	//   21   36:astore          5
		if(propertyname == null)
	//*  22   38:aload           5
	//*  23   40:ifnonnull       73
		{
			if(_config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE))
	//*  24   43:aload_0         
	//*  25   44:getfield        #58  <Field SerializationConfig _config>
	//*  26   47:getstatic       #263 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//*  27   50:invokevirtual   #264 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  28   53:ifeq            92
			{
				_serialize(jsongenerator, obj, jsonserializer, _config.findRootName(class1));
	//   29   56:aload_0         
	//   30   57:aload_1         
	//   31   58:aload_2         
	//   32   59:aload           4
	//   33   61:aload_0         
	//   34   62:getfield        #58  <Field SerializationConfig _config>
	//   35   65:aload_3         
	//   36   66:invokevirtual   #268 <Method PropertyName SerializationConfig.findRootName(Class)>
	//   37   69:invokespecial   #290 <Method void _serialize(JsonGenerator, Object, JsonSerializer, PropertyName)>
				return;
	//   38   72:return          
			}
		} else
		if(!propertyname.isEmpty())
	//*  39   73:aload           5
	//*  40   75:invokevirtual   #271 <Method boolean PropertyName.isEmpty()>
	//*  41   78:ifne            92
		{
			_serialize(jsongenerator, obj, jsonserializer, propertyname);
	//   42   81:aload_0         
	//   43   82:aload_1         
	//   44   83:aload_2         
	//   45   84:aload           4
	//   46   86:aload           5
	//   47   88:invokespecial   #290 <Method void _serialize(JsonGenerator, Object, JsonSerializer, PropertyName)>
			return;
	//   48   91:return          
		}
		_serialize(jsongenerator, obj, jsonserializer);
	//   49   92:aload_0         
	//   50   93:aload_1         
	//   51   94:aload_2         
	//   52   95:aload           4
	//   53   97:invokespecial   #292 <Method void _serialize(JsonGenerator, Object, JsonSerializer)>
	//   54  100:return          
	}

	public void serializeValue(JsonGenerator jsongenerator, Object obj, JavaType javatype)
		throws IOException
	{
		_generator = jsongenerator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #187 <Field JsonGenerator _generator>
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			_serializeNull(jsongenerator);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #233 <Method void _serializeNull(JsonGenerator)>
			return;
	//    8   14:return          
		}
		if(!javatype.getRawClass().isAssignableFrom(obj.getClass()))
	//*   9   15:aload_3         
	//*  10   16:invokevirtual   #238 <Method Class JavaType.getRawClass()>
	//*  11   19:aload_2         
	//*  12   20:invokevirtual   #91  <Method Class Object.getClass()>
	//*  13   23:invokevirtual   #242 <Method boolean Class.isAssignableFrom(Class)>
	//*  14   26:ifne            35
			_reportIncompatibleRootType(obj, javatype);
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:aload_3         
	//   18   32:invokevirtual   #246 <Method void _reportIncompatibleRootType(Object, JavaType)>
		JsonSerializer jsonserializer = findTypedValueSerializer(javatype, true, ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:iconst_1        
	//   22   38:aconst_null     
	//   23   39:invokevirtual   #296 <Method JsonSerializer findTypedValueSerializer(JavaType, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   24   42:astore          4
		PropertyName propertyname = _config.getFullRootName();
	//   25   44:aload_0         
	//   26   45:getfield        #58  <Field SerializationConfig _config>
	//   27   48:invokevirtual   #260 <Method PropertyName SerializationConfig.getFullRootName()>
	//   28   51:astore          5
		if(propertyname == null)
	//*  29   53:aload           5
	//*  30   55:ifnonnull       88
		{
			if(_config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE))
	//*  31   58:aload_0         
	//*  32   59:getfield        #58  <Field SerializationConfig _config>
	//*  33   62:getstatic       #263 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//*  34   65:invokevirtual   #264 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  35   68:ifeq            107
			{
				_serialize(jsongenerator, obj, jsonserializer, _config.findRootName(javatype));
	//   36   71:aload_0         
	//   37   72:aload_1         
	//   38   73:aload_2         
	//   39   74:aload           4
	//   40   76:aload_0         
	//   41   77:getfield        #58  <Field SerializationConfig _config>
	//   42   80:aload_3         
	//   43   81:invokevirtual   #299 <Method PropertyName SerializationConfig.findRootName(JavaType)>
	//   44   84:invokespecial   #290 <Method void _serialize(JsonGenerator, Object, JsonSerializer, PropertyName)>
				return;
	//   45   87:return          
			}
		} else
		if(!propertyname.isEmpty())
	//*  46   88:aload           5
	//*  47   90:invokevirtual   #271 <Method boolean PropertyName.isEmpty()>
	//*  48   93:ifne            107
		{
			_serialize(jsongenerator, obj, jsonserializer, propertyname);
	//   49   96:aload_0         
	//   50   97:aload_1         
	//   51   98:aload_2         
	//   52   99:aload           4
	//   53  101:aload           5
	//   54  103:invokespecial   #290 <Method void _serialize(JsonGenerator, Object, JsonSerializer, PropertyName)>
			return;
	//   55  106:return          
		}
		_serialize(jsongenerator, obj, jsonserializer);
	//   56  107:aload_0         
	//   57  108:aload_1         
	//   58  109:aload_2         
	//   59  110:aload           4
	//   60  112:invokespecial   #292 <Method void _serialize(JsonGenerator, Object, JsonSerializer)>
	//   61  115:return          
	}

	public void serializeValue(JsonGenerator jsongenerator, Object obj, JavaType javatype, JsonSerializer jsonserializer)
		throws IOException
	{
		_generator = jsongenerator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #187 <Field JsonGenerator _generator>
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       15
		{
			_serializeNull(jsongenerator);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #233 <Method void _serializeNull(JsonGenerator)>
			return;
	//    8   14:return          
		}
		if(javatype != null && !javatype.getRawClass().isAssignableFrom(obj.getClass()))
	//*   9   15:aload_3         
	//*  10   16:ifnull          39
	//*  11   19:aload_3         
	//*  12   20:invokevirtual   #238 <Method Class JavaType.getRawClass()>
	//*  13   23:aload_2         
	//*  14   24:invokevirtual   #91  <Method Class Object.getClass()>
	//*  15   27:invokevirtual   #242 <Method boolean Class.isAssignableFrom(Class)>
	//*  16   30:ifne            39
			_reportIncompatibleRootType(obj, javatype);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:invokevirtual   #246 <Method void _reportIncompatibleRootType(Object, JavaType)>
		JsonSerializer jsonserializer1 = jsonserializer;
	//   21   39:aload           4
	//   22   41:astore          5
		if(jsonserializer == null)
	//*  23   43:aload           4
	//*  24   45:ifnonnull       57
			jsonserializer1 = findTypedValueSerializer(javatype, true, ((com.fasterxml.jackson.databind.BeanProperty) (null)));
	//   25   48:aload_0         
	//   26   49:aload_3         
	//   27   50:iconst_1        
	//   28   51:aconst_null     
	//   29   52:invokevirtual   #296 <Method JsonSerializer findTypedValueSerializer(JavaType, boolean, com.fasterxml.jackson.databind.BeanProperty)>
	//   30   55:astore          5
		jsonserializer = ((JsonSerializer) (_config.getFullRootName()));
	//   31   57:aload_0         
	//   32   58:getfield        #58  <Field SerializationConfig _config>
	//   33   61:invokevirtual   #260 <Method PropertyName SerializationConfig.getFullRootName()>
	//   34   64:astore          4
		if(jsonserializer == null)
	//*  35   66:aload           4
	//*  36   68:ifnonnull       122
		{
			if(_config.isEnabled(SerializationFeature.WRAP_ROOT_VALUE))
	//*  37   71:aload_0         
	//*  38   72:getfield        #58  <Field SerializationConfig _config>
	//*  39   75:getstatic       #263 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//*  40   78:invokevirtual   #264 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  41   81:ifeq            141
			{
				if(javatype == null)
	//*  42   84:aload_3         
	//*  43   85:ifnonnull       103
					javatype = ((JavaType) (_config.findRootName(obj.getClass())));
	//   44   88:aload_0         
	//   45   89:getfield        #58  <Field SerializationConfig _config>
	//   46   92:aload_2         
	//   47   93:invokevirtual   #91  <Method Class Object.getClass()>
	//   48   96:invokevirtual   #268 <Method PropertyName SerializationConfig.findRootName(Class)>
	//   49   99:astore_3        
				else
	//*  50  100:goto            112
					javatype = ((JavaType) (_config.findRootName(javatype)));
	//   51  103:aload_0         
	//   52  104:getfield        #58  <Field SerializationConfig _config>
	//   53  107:aload_3         
	//   54  108:invokevirtual   #299 <Method PropertyName SerializationConfig.findRootName(JavaType)>
	//   55  111:astore_3        
				_serialize(jsongenerator, obj, jsonserializer1, ((PropertyName) (javatype)));
	//   56  112:aload_0         
	//   57  113:aload_1         
	//   58  114:aload_2         
	//   59  115:aload           5
	//   60  117:aload_3         
	//   61  118:invokespecial   #290 <Method void _serialize(JsonGenerator, Object, JsonSerializer, PropertyName)>
				return;
	//   62  121:return          
			}
		} else
		if(!((PropertyName) (jsonserializer)).isEmpty())
	//*  63  122:aload           4
	//*  64  124:invokevirtual   #271 <Method boolean PropertyName.isEmpty()>
	//*  65  127:ifne            141
		{
			_serialize(jsongenerator, obj, jsonserializer1, ((PropertyName) (jsonserializer)));
	//   66  130:aload_0         
	//   67  131:aload_1         
	//   68  132:aload_2         
	//   69  133:aload           5
	//   70  135:aload           4
	//   71  137:invokespecial   #290 <Method void _serialize(JsonGenerator, Object, JsonSerializer, PropertyName)>
			return;
	//   72  140:return          
		}
		_serialize(jsongenerator, obj, jsonserializer1);
	//   73  141:aload_0         
	//   74  142:aload_1         
	//   75  143:aload_2         
	//   76  144:aload           5
	//   77  146:invokespecial   #292 <Method void _serialize(JsonGenerator, Object, JsonSerializer)>
	//   78  149:return          
	}

	public JsonSerializer serializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException
	{
label0:
		{
			Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
			if(obj == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       8
				return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
			if(obj instanceof JsonSerializer)
	//*   6    8:aload_2         
	//*   7    9:instanceof      #37  <Class JsonSerializer>
	//*   8   12:ifeq            23
			{
				annotated = ((Annotated) ((JsonSerializer)obj));
	//    9   15:aload_2         
	//   10   16:checkcast       #37  <Class JsonSerializer>
	//   11   19:astore_1        
			} else
	//*  12   20:goto            226
			{
				if(!(obj instanceof Class))
	//*  13   23:aload_2         
	//*  14   24:instanceof      #93  <Class Class>
	//*  15   27:ifne            88
				{
					JavaType javatype = annotated.getType();
	//   16   30:aload_1         
	//   17   31:invokevirtual   #309 <Method JavaType Annotated.getType()>
	//   18   34:astore          4
					StringBuilder stringbuilder = new StringBuilder();
	//   19   36:new             #78  <Class StringBuilder>
	//   20   39:dup             
	//   21   40:invokespecial   #79  <Method void StringBuilder()>
	//   22   43:astore          5
					stringbuilder.append("AnnotationIntrospector returned serializer definition of type ");
	//   23   45:aload           5
	//   24   47:ldc2            #311 <String "AnnotationIntrospector returned serializer definition of type ">
	//   25   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:pop             
					stringbuilder.append(obj.getClass().getName());
	//   27   54:aload           5
	//   28   56:aload_2         
	//   29   57:invokevirtual   #91  <Method Class Object.getClass()>
	//   30   60:invokevirtual   #96  <Method String Class.getName()>
	//   31   63:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
					stringbuilder.append("; expected type JsonSerializer or Class<JsonSerializer> instead");
	//   33   67:aload           5
	//   34   69:ldc2            #313 <String "; expected type JsonSerializer or Class<JsonSerializer> instead">
	//   35   72:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   36   75:pop             
					reportBadDefinition(javatype, stringbuilder.toString());
	//   37   76:aload_0         
	//   38   77:aload           4
	//   39   79:aload           5
	//   40   81:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   41   84:invokevirtual   #316 <Method Object reportBadDefinition(JavaType, String)>
	//   42   87:pop             
				}
				obj = ((Object) ((Class)obj));
	//   43   88:aload_2         
	//   44   89:checkcast       #93  <Class Class>
	//   45   92:astore_2        
				if(obj == com/fasterxml/jackson/databind/JsonSerializer$None)
					break label0;
	//   46   93:aload_2         
	//   47   94:ldc2            #318 <Class com.fasterxml.jackson.databind.JsonSerializer$None>
	//   48   97:if_acmpeq       232
				if(ClassUtil.isBogusClass(((Class) (obj))))
	//*  49  100:aload_2         
	//*  50  101:invokestatic    #321 <Method boolean ClassUtil.isBogusClass(Class)>
	//*  51  104:ifeq            109
					return null;
	//   52  107:aconst_null     
	//   53  108:areturn         
				if(!((Class) (com/fasterxml/jackson/databind/JsonSerializer)).isAssignableFrom(((Class) (obj))))
	//*  54  109:ldc1            #37  <Class JsonSerializer>
	//*  55  111:aload_2         
	//*  56  112:invokevirtual   #242 <Method boolean Class.isAssignableFrom(Class)>
	//*  57  115:ifne            173
				{
					JavaType javatype1 = annotated.getType();
	//   58  118:aload_1         
	//   59  119:invokevirtual   #309 <Method JavaType Annotated.getType()>
	//   60  122:astore          4
					StringBuilder stringbuilder1 = new StringBuilder();
	//   61  124:new             #78  <Class StringBuilder>
	//   62  127:dup             
	//   63  128:invokespecial   #79  <Method void StringBuilder()>
	//   64  131:astore          5
					stringbuilder1.append("AnnotationIntrospector returned Class ");
	//   65  133:aload           5
	//   66  135:ldc2            #323 <String "AnnotationIntrospector returned Class ">
	//   67  138:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   68  141:pop             
					stringbuilder1.append(((Class) (obj)).getName());
	//   69  142:aload           5
	//   70  144:aload_2         
	//   71  145:invokevirtual   #96  <Method String Class.getName()>
	//   72  148:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   73  151:pop             
					stringbuilder1.append("; expected Class<JsonSerializer>");
	//   74  152:aload           5
	//   75  154:ldc2            #325 <String "; expected Class<JsonSerializer>">
	//   76  157:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   77  160:pop             
					reportBadDefinition(javatype1, stringbuilder1.toString());
	//   78  161:aload_0         
	//   79  162:aload           4
	//   80  164:aload           5
	//   81  166:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   82  169:invokevirtual   #316 <Method Object reportBadDefinition(JavaType, String)>
	//   83  172:pop             
				}
				HandlerInstantiator handlerinstantiator = _config.getHandlerInstantiator();
	//   84  173:aload_0         
	//   85  174:getfield        #58  <Field SerializationConfig _config>
	//   86  177:invokevirtual   #195 <Method HandlerInstantiator SerializationConfig.getHandlerInstantiator()>
	//   87  180:astore          4
				if(handlerinstantiator == null)
	//*  88  182:aload           4
	//*  89  184:ifnonnull       192
					annotated = ((Annotated) (obj1));
	//   90  187:aload_3         
	//   91  188:astore_1        
				else
	//*  92  189:goto            204
					annotated = ((Annotated) (handlerinstantiator.serializerInstance(_config, annotated, ((Class) (obj)))));
	//   93  192:aload           4
	//   94  194:aload_0         
	//   95  195:getfield        #58  <Field SerializationConfig _config>
	//   96  198:aload_1         
	//   97  199:aload_2         
	//   98  200:invokevirtual   #328 <Method JsonSerializer HandlerInstantiator.serializerInstance(SerializationConfig, Annotated, Class)>
	//   99  203:astore_1        
				if(annotated == null)
	//* 100  204:aload_1         
	//* 101  205:ifnonnull       226
					annotated = ((Annotated) ((JsonSerializer)ClassUtil.createInstance(((Class) (obj)), _config.canOverrideAccessModifiers())));
	//  102  208:aload_2         
	//  103  209:aload_0         
	//  104  210:getfield        #58  <Field SerializationConfig _config>
	//  105  213:invokevirtual   #204 <Method boolean SerializationConfig.canOverrideAccessModifiers()>
	//  106  216:invokestatic    #209 <Method Object ClassUtil.createInstance(Class, boolean)>
	//  107  219:checkcast       #37  <Class JsonSerializer>
	//  108  222:astore_1        
			}
	//* 109  223:goto            226
			return _handleResolvable(((JsonSerializer) (annotated)));
	//  110  226:aload_0         
	//  111  227:aload_1         
	//  112  228:invokevirtual   #332 <Method JsonSerializer _handleResolvable(JsonSerializer)>
	//  113  231:areturn         
		}
		return null;
	//  114  232:aconst_null     
	//  115  233:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected transient JsonGenerator _generator;
	protected transient ArrayList _objectIdGenerators;
	protected transient Map _seenObjectIds;
}
