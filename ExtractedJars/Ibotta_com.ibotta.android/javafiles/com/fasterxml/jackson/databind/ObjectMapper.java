// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MutableConfigOverride;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonNode, MappingJsonFactory, SerializationConfig, DeserializationConfig, 
//			MapperFeature, SerializationFeature, JavaType, DeserializationFeature, 
//			JsonDeserializer, JsonMappingException, DeserializationContext, ObjectReader, 
//			ObjectWriter, PropertyName, Module, AnnotationIntrospector, 
//			InjectableValues, PropertyNamingStrategy, AbstractTypeResolver

public class ObjectMapper extends ObjectCodec
	implements Versioned, Serializable
{

	public ObjectMapper()
	{
		this(((JsonFactory) (null)), ((DefaultSerializerProvider) (null)), ((DefaultDeserializationContext) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #102 <Method void ObjectMapper(JsonFactory, DefaultSerializerProvider, DefaultDeserializationContext)>
	//    5    7:return          
	}

	public ObjectMapper(JsonFactory jsonfactory)
	{
		this(jsonfactory, ((DefaultSerializerProvider) (null)), ((DefaultDeserializationContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #102 <Method void ObjectMapper(JsonFactory, DefaultSerializerProvider, DefaultDeserializationContext)>
	//    5    7:return          
	}

	public ObjectMapper(JsonFactory jsonfactory, DefaultSerializerProvider defaultserializerprovider, DefaultDeserializationContext defaultdeserializationcontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method void ObjectCodec()>
		_rootDeserializers = new ConcurrentHashMap(64, 0.6F, 2);
	//    2    4:aload_0         
	//    3    5:new             #106 <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:bipush          64
	//    6   11:ldc1            #107 <Float 0.6F>
	//    7   13:iconst_2        
	//    8   14:invokespecial   #110 <Method void ConcurrentHashMap(int, float, int)>
	//    9   17:putfield        #112 <Field ConcurrentHashMap _rootDeserializers>
		if(jsonfactory == null)
	//*  10   20:aload_1         
	//*  11   21:ifnonnull       39
		{
			_jsonFactory = ((JsonFactory) (new MappingJsonFactory(this)));
	//   12   24:aload_0         
	//   13   25:new             #114 <Class MappingJsonFactory>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #117 <Method void MappingJsonFactory(ObjectMapper)>
	//   17   33:putfield        #119 <Field JsonFactory _jsonFactory>
		} else
	//*  18   36:goto            60
		{
			_jsonFactory = jsonfactory;
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:putfield        #119 <Field JsonFactory _jsonFactory>
			if(jsonfactory.getCodec() == null)
	//*  22   44:aload_1         
	//*  23   45:invokevirtual   #125 <Method ObjectCodec JsonFactory.getCodec()>
	//*  24   48:ifnonnull       60
				_jsonFactory.setCodec(((ObjectCodec) (this)));
	//   25   51:aload_0         
	//   26   52:getfield        #119 <Field JsonFactory _jsonFactory>
	//   27   55:aload_0         
	//   28   56:invokevirtual   #129 <Method JsonFactory JsonFactory.setCodec(ObjectCodec)>
	//   29   59:pop             
		}
		_subtypeResolver = ((SubtypeResolver) (new StdSubtypeResolver()));
	//   30   60:aload_0         
	//   31   61:new             #131 <Class StdSubtypeResolver>
	//   32   64:dup             
	//   33   65:invokespecial   #132 <Method void StdSubtypeResolver()>
	//   34   68:putfield        #134 <Field SubtypeResolver _subtypeResolver>
		jsonfactory = ((JsonFactory) (new RootNameLookup()));
	//   35   71:new             #136 <Class RootNameLookup>
	//   36   74:dup             
	//   37   75:invokespecial   #137 <Method void RootNameLookup()>
	//   38   78:astore_1        
		_typeFactory = TypeFactory.defaultInstance();
	//   39   79:aload_0         
	//   40   80:invokestatic    #75  <Method TypeFactory TypeFactory.defaultInstance()>
	//   41   83:putfield        #139 <Field TypeFactory _typeFactory>
		SimpleMixInResolver simplemixinresolver = new SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (null)));
	//   42   86:new             #141 <Class SimpleMixInResolver>
	//   43   89:dup             
	//   44   90:aconst_null     
	//   45   91:invokespecial   #144 <Method void SimpleMixInResolver(com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//   46   94:astore          5
		_mixIns = simplemixinresolver;
	//   47   96:aload_0         
	//   48   97:aload           5
	//   49   99:putfield        #146 <Field SimpleMixInResolver _mixIns>
		BaseSettings basesettings = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
	//   50  102:getstatic       #98  <Field BaseSettings DEFAULT_BASE>
	//   51  105:aload_0         
	//   52  106:invokevirtual   #150 <Method ClassIntrospector defaultClassIntrospector()>
	//   53  109:invokevirtual   #154 <Method BaseSettings BaseSettings.withClassIntrospector(ClassIntrospector)>
	//   54  112:astore          6
		_configOverrides = new ConfigOverrides();
	//   55  114:aload_0         
	//   56  115:new             #156 <Class ConfigOverrides>
	//   57  118:dup             
	//   58  119:invokespecial   #157 <Method void ConfigOverrides()>
	//   59  122:putfield        #159 <Field ConfigOverrides _configOverrides>
		_serializationConfig = new SerializationConfig(basesettings, _subtypeResolver, simplemixinresolver, ((RootNameLookup) (jsonfactory)), _configOverrides);
	//   60  125:aload_0         
	//   61  126:new             #161 <Class SerializationConfig>
	//   62  129:dup             
	//   63  130:aload           6
	//   64  132:aload_0         
	//   65  133:getfield        #134 <Field SubtypeResolver _subtypeResolver>
	//   66  136:aload           5
	//   67  138:aload_1         
	//   68  139:aload_0         
	//   69  140:getfield        #159 <Field ConfigOverrides _configOverrides>
	//   70  143:invokespecial   #164 <Method void SerializationConfig(BaseSettings, SubtypeResolver, SimpleMixInResolver, RootNameLookup, ConfigOverrides)>
	//   71  146:putfield        #166 <Field SerializationConfig _serializationConfig>
		_deserializationConfig = new DeserializationConfig(basesettings, _subtypeResolver, simplemixinresolver, ((RootNameLookup) (jsonfactory)), _configOverrides);
	//   72  149:aload_0         
	//   73  150:new             #168 <Class DeserializationConfig>
	//   74  153:dup             
	//   75  154:aload           6
	//   76  156:aload_0         
	//   77  157:getfield        #134 <Field SubtypeResolver _subtypeResolver>
	//   78  160:aload           5
	//   79  162:aload_1         
	//   80  163:aload_0         
	//   81  164:getfield        #159 <Field ConfigOverrides _configOverrides>
	//   82  167:invokespecial   #169 <Method void DeserializationConfig(BaseSettings, SubtypeResolver, SimpleMixInResolver, RootNameLookup, ConfigOverrides)>
	//   83  170:putfield        #171 <Field DeserializationConfig _deserializationConfig>
		boolean flag = _jsonFactory.requiresPropertyOrdering();
	//   84  173:aload_0         
	//   85  174:getfield        #119 <Field JsonFactory _jsonFactory>
	//   86  177:invokevirtual   #175 <Method boolean JsonFactory.requiresPropertyOrdering()>
	//   87  180:istore          4
		if(_serializationConfig.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY) ^ flag)
	//*  88  182:aload_0         
	//*  89  183:getfield        #166 <Field SerializationConfig _serializationConfig>
	//*  90  186:getstatic       #181 <Field MapperFeature MapperFeature.SORT_PROPERTIES_ALPHABETICALLY>
	//*  91  189:invokevirtual   #185 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//*  92  192:iload           4
	//*  93  194:ixor            
	//*  94  195:ifeq            208
			configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, flag);
	//   95  198:aload_0         
	//   96  199:getstatic       #181 <Field MapperFeature MapperFeature.SORT_PROPERTIES_ALPHABETICALLY>
	//   97  202:iload           4
	//   98  204:invokevirtual   #189 <Method ObjectMapper configure(MapperFeature, boolean)>
	//   99  207:pop             
		jsonfactory = ((JsonFactory) (defaultserializerprovider));
	//  100  208:aload_2         
	//  101  209:astore_1        
		if(defaultserializerprovider == null)
	//* 102  210:aload_2         
	//* 103  211:ifnonnull       222
			jsonfactory = ((JsonFactory) (new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl()));
	//  104  214:new             #191 <Class com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl>
	//  105  217:dup             
	//  106  218:invokespecial   #192 <Method void com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl()>
	//  107  221:astore_1        
		_serializerProvider = ((DefaultSerializerProvider) (jsonfactory));
	//  108  222:aload_0         
	//  109  223:aload_1         
	//  110  224:putfield        #194 <Field DefaultSerializerProvider _serializerProvider>
		jsonfactory = ((JsonFactory) (defaultdeserializationcontext));
	//  111  227:aload_3         
	//  112  228:astore_1        
		if(defaultdeserializationcontext == null)
	//* 113  229:aload_3         
	//* 114  230:ifnonnull       244
			jsonfactory = ((JsonFactory) (new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((DeserializerFactory) (BeanDeserializerFactory.instance)))));
	//  115  233:new             #196 <Class com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl>
	//  116  236:dup             
	//  117  237:getstatic       #201 <Field BeanDeserializerFactory BeanDeserializerFactory.instance>
	//  118  240:invokespecial   #204 <Method void com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl(DeserializerFactory)>
	//  119  243:astore_1        
		_deserializationContext = ((DefaultDeserializationContext) (jsonfactory));
	//  120  244:aload_0         
	//  121  245:aload_1         
	//  122  246:putfield        #206 <Field DefaultDeserializationContext _deserializationContext>
		_serializerFactory = ((SerializerFactory) (BeanSerializerFactory.instance));
	//  123  249:aload_0         
	//  124  250:getstatic       #211 <Field BeanSerializerFactory BeanSerializerFactory.instance>
	//  125  253:putfield        #213 <Field SerializerFactory _serializerFactory>
	//  126  256:return          
	}

	private final void _configAndWriteCloseable(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
		throws IOException
	{
		Closeable closeable = (Closeable)obj;
	//    0    0:aload_2         
	//    1    1:checkcast       #221 <Class Closeable>
	//    2    4:astore          4
		_serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
	//    3    6:aload_0         
	//    4    7:aload_3         
	//    5    8:invokevirtual   #224 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokevirtual   #230 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		try
		{
			closeable.close();
	//    9   16:aload           4
	//   10   18:invokeinterface #233 <Method void Closeable.close()>
		}
	//*  11   23:aload_1         
	//*  12   24:invokevirtual   #236 <Method void JsonGenerator.close()>
	//*  13   27:return          
		// Misplaced declaration of an exception variable
		catch(SerializationConfig serializationconfig)
	//*  14   28:astore_3        
		{
			obj = null;
	//   15   29:aconst_null     
	//   16   30:astore_2        
			break MISSING_BLOCK_LABEL_38;
	//   17   31:goto            38
		}
		jsongenerator.close();
		return;
		serializationconfig;
	//   18   34:astore_3        
		obj = ((Object) (closeable));
	//   19   35:aload           4
	//   20   37:astore_2        
		ClassUtil.closeOnFailAndThrowAsIOE(jsongenerator, ((Closeable) (obj)), ((Exception) (serializationconfig)));
	//   21   38:aload_1         
	//   22   39:aload_2         
	//   23   40:aload_3         
	//   24   41:invokestatic    #242 <Method void ClassUtil.closeOnFailAndThrowAsIOE(JsonGenerator, Closeable, Exception)>
		return;
	//   25   44:return          
	}

	private final void _writeCloseableValue(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
		throws IOException
	{
		Closeable closeable = (Closeable)obj;
	//    0    0:aload_2         
	//    1    1:checkcast       #221 <Class Closeable>
	//    2    4:astore          4
		try
		{
			_serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
	//    3    6:aload_0         
	//    4    7:aload_3         
	//    5    8:invokevirtual   #224 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    6   11:aload_1         
	//    7   12:aload_2         
	//    8   13:invokevirtual   #230 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
			if(serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
	//*   9   16:aload_3         
	//*  10   17:getstatic       #250 <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//*  11   20:invokevirtual   #253 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  12   23:ifeq            30
				jsongenerator.flush();
	//   13   26:aload_1         
	//   14   27:invokevirtual   #256 <Method void JsonGenerator.flush()>
		}
	//*  15   30:aload           4
	//*  16   32:invokeinterface #233 <Method void Closeable.close()>
	//*  17   37:return          
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//*  18   38:astore_1        
		{
			ClassUtil.closeOnFailAndThrowAsIOE(((JsonGenerator) (null)), closeable, ((Exception) (jsongenerator)));
	//   19   39:aconst_null     
	//   20   40:aload           4
	//   21   42:aload_1         
	//   22   43:invokestatic    #242 <Method void ClassUtil.closeOnFailAndThrowAsIOE(JsonGenerator, Closeable, Exception)>
			return;
	//   23   46:return          
		}
		closeable.close();
	}

	protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #261 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_3        
		serializationconfig.initialize(jsongenerator);
	//    3    5:aload_3         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #265 <Method void SerializationConfig.initialize(JsonGenerator)>
		if(serializationconfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
	//*   6   10:aload_3         
	//*   7   11:getstatic       #268 <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//*   8   14:invokevirtual   #253 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*   9   17:ifeq            35
	//*  10   20:aload_2         
	//*  11   21:instanceof      #221 <Class Closeable>
	//*  12   24:ifeq            35
		{
			_configAndWriteCloseable(jsongenerator, obj, serializationconfig);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:aload_2         
	//   16   30:aload_3         
	//   17   31:invokespecial   #270 <Method void _configAndWriteCloseable(JsonGenerator, Object, SerializationConfig)>
			return;
	//   18   34:return          
		}
		try
		{
			_serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
	//   19   35:aload_0         
	//   20   36:aload_3         
	//   21   37:invokevirtual   #224 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   22   40:aload_1         
	//   23   41:aload_2         
	//   24   42:invokevirtual   #230 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		}
	//*  25   45:aload_1         
	//*  26   46:invokevirtual   #236 <Method void JsonGenerator.close()>
	//*  27   49:return          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  28   50:astore_2        
		{
			ClassUtil.closeOnFailAndThrowAsIOE(jsongenerator, ((Exception) (obj)));
	//   29   51:aload_1         
	//   30   52:aload_2         
	//   31   53:invokestatic    #273 <Method void ClassUtil.closeOnFailAndThrowAsIOE(JsonGenerator, Exception)>
			return;
	//   32   56:return          
		}
		jsongenerator.close();
	}

	protected Object _convert(Object obj, JavaType javatype)
		throws IllegalArgumentException
	{
		Object obj1;
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          36
		{
			Class class1 = javatype.getRawClass();
	//    2    4:aload_2         
	//    3    5:invokevirtual   #283 <Method Class JavaType.getRawClass()>
	//    4    8:astore_3        
			if(class1 != java/lang/Object && !javatype.hasGenericTypes() && class1.isAssignableFrom(obj.getClass()))
	//*   5    9:aload_3         
	//*   6   10:ldc2            #285 <Class Object>
	//*   7   13:if_acmpeq       36
	//*   8   16:aload_2         
	//*   9   17:invokevirtual   #288 <Method boolean JavaType.hasGenericTypes()>
	//*  10   20:ifne            36
	//*  11   23:aload_3         
	//*  12   24:aload_1         
	//*  13   25:invokevirtual   #291 <Method Class Object.getClass()>
	//*  14   28:invokevirtual   #297 <Method boolean Class.isAssignableFrom(Class)>
	//*  15   31:ifeq            36
				return obj;
	//   16   34:aload_1         
	//   17   35:areturn         
		}
		TokenBuffer tokenbuffer = new TokenBuffer(((ObjectCodec) (this)), false);
	//   18   36:new             #299 <Class TokenBuffer>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:iconst_0        
	//   22   42:invokespecial   #302 <Method void TokenBuffer(ObjectCodec, boolean)>
	//   23   45:astore          4
		obj1 = ((Object) (tokenbuffer));
	//   24   47:aload           4
	//   25   49:astore_3        
		if(isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  26   50:aload_0         
	//*  27   51:getstatic       #308 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  28   54:invokevirtual   #311 <Method boolean isEnabled(DeserializationFeature)>
	//*  29   57:ifeq            67
			obj1 = ((Object) (tokenbuffer.forceUseOfBigDecimal(true)));
	//   30   60:aload           4
	//   31   62:iconst_1        
	//   32   63:invokevirtual   #315 <Method TokenBuffer TokenBuffer.forceUseOfBigDecimal(boolean)>
	//   33   66:astore_3        
		JsonToken jsontoken;
		_serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(((JsonGenerator) (obj1)), obj);
	//   34   67:aload_0         
	//   35   68:aload_0         
	//   36   69:invokevirtual   #261 <Method SerializationConfig getSerializationConfig()>
	//   37   72:getstatic       #318 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//   38   75:invokevirtual   #322 <Method SerializationConfig SerializationConfig.without(SerializationFeature)>
	//   39   78:invokevirtual   #224 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   40   81:aload_3         
	//   41   82:aload_1         
	//   42   83:invokevirtual   #230 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		obj1 = ((Object) (((TokenBuffer) (obj1)).asParser()));
	//   43   86:aload_3         
	//   44   87:invokevirtual   #326 <Method JsonParser TokenBuffer.asParser()>
	//   45   90:astore_3        
		obj = ((Object) (getDeserializationConfig()));
	//   46   91:aload_0         
	//   47   92:invokevirtual   #330 <Method DeserializationConfig getDeserializationConfig()>
	//   48   95:astore_1        
		jsontoken = _initForReading(((JsonParser) (obj1)), javatype);
	//   49   96:aload_0         
	//   50   97:aload_3         
	//   51   98:aload_2         
	//   52   99:invokevirtual   #334 <Method JsonToken _initForReading(JsonParser, JavaType)>
	//   53  102:astore          4
		if(jsontoken == JsonToken.VALUE_NULL)
	//*  54  104:aload           4
	//*  55  106:getstatic       #340 <Field JsonToken JsonToken.VALUE_NULL>
	//*  56  109:if_acmpne       133
		{
			obj = ((Object) (createDeserializationContext(((JsonParser) (obj1)), ((DeserializationConfig) (obj)))));
	//   57  112:aload_0         
	//   58  113:aload_3         
	//   59  114:aload_1         
	//   60  115:invokevirtual   #344 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//   61  118:astore_1        
			obj = _findRootDeserializer(((DeserializationContext) (obj)), javatype).getNullValue(((DeserializationContext) (obj)));
	//   62  119:aload_0         
	//   63  120:aload_1         
	//   64  121:aload_2         
	//   65  122:invokevirtual   #348 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   66  125:aload_1         
	//   67  126:invokevirtual   #354 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   68  129:astore_1        
			break MISSING_BLOCK_LABEL_174;
	//   69  130:goto            174
		}
		if(jsontoken != JsonToken.END_ARRAY && jsontoken != JsonToken.END_OBJECT)
	//*  70  133:aload           4
	//*  71  135:getstatic       #357 <Field JsonToken JsonToken.END_ARRAY>
	//*  72  138:if_acmpeq       194
	//*  73  141:aload           4
	//*  74  143:getstatic       #360 <Field JsonToken JsonToken.END_OBJECT>
	//*  75  146:if_acmpne       152
	//*  76  149:goto            194
			try
			{
				obj = ((Object) (createDeserializationContext(((JsonParser) (obj1)), ((DeserializationConfig) (obj)))));
	//   77  152:aload_0         
	//   78  153:aload_3         
	//   79  154:aload_1         
	//   80  155:invokevirtual   #344 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//   81  158:astore_1        
				obj = _findRootDeserializer(((DeserializationContext) (obj)), javatype).deserialize(((JsonParser) (obj1)), ((DeserializationContext) (obj)));
	//   82  159:aload_0         
	//   83  160:aload_1         
	//   84  161:aload_2         
	//   85  162:invokevirtual   #348 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   86  165:aload_3         
	//   87  166:aload_1         
	//   88  167:invokevirtual   #364 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   89  170:astore_1        
			}
	//*  90  171:goto            174
	//*  91  174:aload_3         
	//*  92  175:invokevirtual   #367 <Method void JsonParser.close()>
	//*  93  178:aload_1         
	//*  94  179:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  95  180:astore_1        
			{
				throw new IllegalArgumentException(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
	//   96  181:new             #277 <Class IllegalArgumentException>
	//   97  184:dup             
	//   98  185:aload_1         
	//   99  186:invokevirtual   #371 <Method String IOException.getMessage()>
	//  100  189:aload_1         
	//  101  190:invokespecial   #374 <Method void IllegalArgumentException(String, Throwable)>
	//  102  193:athrow          
			}
		else
			obj = null;
	//  103  194:aconst_null     
	//  104  195:astore_1        
		((JsonParser) (obj1)).close();
		return obj;
	//* 105  196:goto            174
	}

	protected JsonDeserializer _findRootDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
		throws JsonMappingException
	{
		Object obj = ((Object) ((JsonDeserializer)_rootDeserializers.get(((Object) (javatype)))));
	//    0    0:aload_0         
	//    1    1:getfield        #112 <Field ConcurrentHashMap _rootDeserializers>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #380 <Method Object ConcurrentHashMap.get(Object)>
	//    4    8:checkcast       #350 <Class JsonDeserializer>
	//    5   11:astore_3        
		if(obj != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          18
			return ((JsonDeserializer) (obj));
	//    8   16:aload_3         
	//    9   17:areturn         
		obj = ((Object) (deserializationcontext.findRootValueDeserializer(javatype)));
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #386 <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//   13   23:astore_3        
		if(obj == null)
	//*  14   24:aload_3         
	//*  15   25:ifnonnull       63
		{
			obj = ((Object) (new StringBuilder()));
	//   16   28:new             #388 <Class StringBuilder>
	//   17   31:dup             
	//   18   32:invokespecial   #389 <Method void StringBuilder()>
	//   19   35:astore_3        
			((StringBuilder) (obj)).append("Cannot find a deserializer for type ");
	//   20   36:aload_3         
	//   21   37:ldc2            #391 <String "Cannot find a deserializer for type ">
	//   22   40:invokevirtual   #395 <Method StringBuilder StringBuilder.append(String)>
	//   23   43:pop             
			((StringBuilder) (obj)).append(((Object) (javatype)));
	//   24   44:aload_3         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #398 <Method StringBuilder StringBuilder.append(Object)>
	//   27   49:pop             
			return (JsonDeserializer)deserializationcontext.reportBadDefinition(javatype, ((StringBuilder) (obj)).toString());
	//   28   50:aload_1         
	//   29   51:aload_2         
	//   30   52:aload_3         
	//   31   53:invokevirtual   #401 <Method String StringBuilder.toString()>
	//   32   56:invokevirtual   #405 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   33   59:checkcast       #350 <Class JsonDeserializer>
	//   34   62:areturn         
		} else
		{
			_rootDeserializers.put(((Object) (javatype)), obj);
	//   35   63:aload_0         
	//   36   64:getfield        #112 <Field ConcurrentHashMap _rootDeserializers>
	//   37   67:aload_2         
	//   38   68:aload_3         
	//   39   69:invokevirtual   #409 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   40   72:pop             
			return ((JsonDeserializer) (obj));
	//   41   73:aload_3         
	//   42   74:areturn         
		}
	}

	protected JsonToken _initForReading(JsonParser jsonparser, JavaType javatype)
		throws IOException
	{
		_deserializationConfig.initialize(jsonparser);
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #414 <Method void DeserializationConfig.initialize(JsonParser)>
		JsonToken jsontoken = jsonparser.getCurrentToken();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #418 <Method JsonToken JsonParser.getCurrentToken()>
	//    6   12:astore_3        
		if(jsontoken == null)
	//*   7   13:aload_3         
	//*   8   14:ifnonnull       37
		{
			jsontoken = jsonparser.nextToken();
	//    9   17:aload_1         
	//   10   18:invokevirtual   #421 <Method JsonToken JsonParser.nextToken()>
	//   11   21:astore_3        
			if(jsontoken != null)
	//*  12   22:aload_3         
	//*  13   23:ifnull          28
				return jsontoken;
	//   14   26:aload_3         
	//   15   27:areturn         
			else
				throw MismatchedInputException.from(jsonparser, javatype, "No content to map due to end-of-input");
	//   16   28:aload_1         
	//   17   29:aload_2         
	//   18   30:ldc2            #423 <String "No content to map due to end-of-input">
	//   19   33:invokestatic    #429 <Method MismatchedInputException MismatchedInputException.from(JsonParser, JavaType, String)>
	//   20   36:athrow          
		} else
		{
			return jsontoken;
	//   21   37:aload_3         
	//   22   38:areturn         
		}
	}

	protected ObjectReader _newReader(DeserializationConfig deserializationconfig, JavaType javatype, Object obj, FormatSchema formatschema, InjectableValues injectablevalues)
	{
		return new ObjectReader(this, deserializationconfig, javatype, obj, formatschema, injectablevalues);
	//    0    0:new             #433 <Class ObjectReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #436 <Method void ObjectReader(ObjectMapper, DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//    9   15:areturn         
	}

	protected ObjectWriter _newWriter(SerializationConfig serializationconfig)
	{
		return new ObjectWriter(this, serializationconfig);
	//    0    0:new             #440 <Class ObjectWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #443 <Method void ObjectWriter(ObjectMapper, SerializationConfig)>
	//    5    9:areturn         
	}

	protected Object _readMapAndClose(JsonParser jsonparser, JavaType javatype)
		throws IOException
	{
		JavaType javatype1;
		Object obj1;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          5
		javatype1 = ((JavaType) (obj1));
	//    2    3:aload           5
	//    3    5:astore          4
		Object obj = ((Object) (_initForReading(jsonparser, javatype)));
	//    4    7:aload_0         
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokevirtual   #334 <Method JsonToken _initForReading(JsonParser, JavaType)>
	//    8   13:astore_3        
		javatype1 = ((JavaType) (obj1));
	//    9   14:aload           5
	//   10   16:astore          4
		DeserializationConfig deserializationconfig = getDeserializationConfig();
	//   11   18:aload_0         
	//   12   19:invokevirtual   #330 <Method DeserializationConfig getDeserializationConfig()>
	//   13   22:astore          6
		javatype1 = ((JavaType) (obj1));
	//   14   24:aload           5
	//   15   26:astore          4
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser, deserializationconfig);
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:aload           6
	//   19   32:invokevirtual   #344 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//   20   35:astore          7
		javatype1 = ((JavaType) (obj1));
	//   21   37:aload           5
	//   22   39:astore          4
		if(obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//   23   41:aload_3         
	//   24   42:getstatic       #340 <Field JsonToken JsonToken.VALUE_NULL>
	//   25   45:if_acmpne       68
_L1:
		javatype1 = ((JavaType) (obj1));
	//   26   48:aload           5
	//   27   50:astore          4
		obj = _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)), javatype).getNullValue(((DeserializationContext) (defaultdeserializationcontext)));
	//   28   52:aload_0         
	//   29   53:aload           7
	//   30   55:aload_2         
	//   31   56:invokevirtual   #348 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   32   59:aload           7
	//   33   61:invokevirtual   #354 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   34   64:astore_3        
		  goto _L3
	//*  35   65:goto            160
_L2:
		javatype1 = ((JavaType) (obj1));
	//   36   68:aload           5
	//   37   70:astore          4
		if(obj == JsonToken.END_ARRAY) goto _L5; else goto _L4
	//   38   72:aload_3         
	//   39   73:getstatic       #357 <Field JsonToken JsonToken.END_ARRAY>
	//   40   76:if_acmpeq       239
_L4:
		javatype1 = ((JavaType) (obj1));
	//   41   79:aload           5
	//   42   81:astore          4
		if(obj != JsonToken.END_OBJECT) goto _L6; else goto _L5
	//   43   83:aload_3         
	//   44   84:getstatic       #360 <Field JsonToken JsonToken.END_OBJECT>
	//   45   87:if_acmpne       93
	//*  46   90:goto            239
_L6:
		javatype1 = ((JavaType) (obj1));
	//   47   93:aload           5
	//   48   95:astore          4
		obj = ((Object) (_findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)), javatype)));
	//   49   97:aload_0         
	//   50   98:aload           7
	//   51  100:aload_2         
	//   52  101:invokevirtual   #348 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   53  104:astore_3        
		javatype1 = ((JavaType) (obj1));
	//   54  105:aload           5
	//   55  107:astore          4
		if(!deserializationconfig.useRootWrapping()) goto _L8; else goto _L7
	//   56  109:aload           6
	//   57  111:invokevirtual   #450 <Method boolean DeserializationConfig.useRootWrapping()>
	//   58  114:ifeq            136
_L7:
		javatype1 = ((JavaType) (obj1));
	//   59  117:aload           5
	//   60  119:astore          4
		try
		{
			obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), deserializationconfig, javatype, ((JsonDeserializer) (obj)));
	//   61  121:aload_0         
	//   62  122:aload_1         
	//   63  123:aload           7
	//   64  125:aload           6
	//   65  127:aload_2         
	//   66  128:aload_3         
	//   67  129:invokevirtual   #454 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, DeserializationConfig, JavaType, JsonDeserializer)>
	//   68  132:astore_3        
			break MISSING_BLOCK_LABEL_148;
	//   69  133:goto            148
		}
	//*  70  136:aload           5
	//*  71  138:astore          4
	//*  72  140:aload_3         
	//*  73  141:aload_1         
	//*  74  142:aload           7
	//*  75  144:invokevirtual   #364 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  76  147:astore_3        
	//*  77  148:aload           5
	//*  78  150:astore          4
	//*  79  152:aload           7
	//*  80  154:invokevirtual   #457 <Method void DeserializationContext.checkUnresolvedObjectId()>
	//*  81  157:goto            160
	//*  82  160:aload           5
	//*  83  162:astore          4
	//*  84  164:aload           6
	//*  85  166:getstatic       #460 <Field DeserializationFeature DeserializationFeature.FAIL_ON_TRAILING_TOKENS>
	//*  86  169:invokevirtual   #461 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//*  87  172:ifeq            187
	//*  88  175:aload           5
	//*  89  177:astore          4
	//*  90  179:aload_0         
	//*  91  180:aload_1         
	//*  92  181:aload           7
	//*  93  183:aload_2         
	//*  94  184:invokevirtual   #465 <Method void _verifyNoTrailingTokens(JsonParser, DeserializationContext, JavaType)>
	//*  95  187:aload_1         
	//*  96  188:ifnull          195
	//*  97  191:aload_1         
	//*  98  192:invokevirtual   #367 <Method void JsonParser.close()>
	//*  99  195:aload_3         
	//* 100  196:areturn         
	//* 101  197:astore_2        
	//* 102  198:goto            207
		// Misplaced declaration of an exception variable
		catch(JavaType javatype)
	//* 103  201:astore_2        
		{
			javatype1 = javatype;
	//  104  202:aload_2         
	//  105  203:astore          4
		}
		  goto _L9
_L8:
		javatype1 = ((JavaType) (obj1));
		obj = ((JsonDeserializer) (obj)).deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)));
		javatype1 = ((JavaType) (obj1));
		((DeserializationContext) (defaultdeserializationcontext)).checkUnresolvedObjectId();
_L3:
		javatype1 = ((JavaType) (obj1));
		if(!deserializationconfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS))
			break MISSING_BLOCK_LABEL_187;
		javatype1 = ((JavaType) (obj1));
		_verifyNoTrailingTokens(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), javatype);
		if(jsonparser != null)
			jsonparser.close();
		return obj;
		javatype;
		break MISSING_BLOCK_LABEL_207;
_L9:
		throw javatype;
	//  106  205:aload_2         
	//  107  206:athrow          
		if(jsonparser != null)
	//* 108  207:aload_1         
	//* 109  208:ifnull          237
			if(javatype1 != null)
	//* 110  211:aload           4
	//* 111  213:ifnull          233
				try
				{
					jsonparser.close();
	//  112  216:aload_1         
	//  113  217:invokevirtual   #367 <Method void JsonParser.close()>
				}
	//* 114  220:goto            237
				// Misplaced declaration of an exception variable
				catch(JsonParser jsonparser)
	//* 115  223:astore_1        
				{
					((Throwable) (javatype1)).addSuppressed(((Throwable) (jsonparser)));
	//  116  224:aload           4
	//  117  226:aload_1         
	//  118  227:invokevirtual   #469 <Method void Throwable.addSuppressed(Throwable)>
				}
			else
	//* 119  230:goto            237
				jsonparser.close();
	//  120  233:aload_1         
	//  121  234:invokevirtual   #367 <Method void JsonParser.close()>
		throw javatype;
	//  122  237:aload_2         
	//  123  238:athrow          
_L5:
		obj = null;
	//  124  239:aconst_null     
	//  125  240:astore_3        
		if(true) goto _L3; else goto _L10
	//  126  241:goto            160
_L10:
	}

	protected Object _readValue(DeserializationConfig deserializationconfig, JsonParser jsonparser, JavaType javatype)
		throws IOException
	{
		Object obj = ((Object) (_initForReading(jsonparser, javatype)));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #334 <Method JsonToken _initForReading(JsonParser, JavaType)>
	//    4    6:astore          4
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser, deserializationconfig);
	//    5    8:aload_0         
	//    6    9:aload_2         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #344 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//    9   14:astore          5
		if(obj == JsonToken.VALUE_NULL)
	//*  10   16:aload           4
	//*  11   18:getstatic       #340 <Field JsonToken JsonToken.VALUE_NULL>
	//*  12   21:if_acmpne       41
			obj = _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)), javatype).getNullValue(((DeserializationContext) (defaultdeserializationcontext)));
	//   13   24:aload_0         
	//   14   25:aload           5
	//   15   27:aload_3         
	//   16   28:invokevirtual   #348 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   17   31:aload           5
	//   18   33:invokevirtual   #354 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   19   36:astore          4
		else
	//*  20   38:goto            108
		if(obj != JsonToken.END_ARRAY && obj != JsonToken.END_OBJECT)
	//*  21   41:aload           4
	//*  22   43:getstatic       #357 <Field JsonToken JsonToken.END_ARRAY>
	//*  23   46:if_acmpeq       105
	//*  24   49:aload           4
	//*  25   51:getstatic       #360 <Field JsonToken JsonToken.END_OBJECT>
	//*  26   54:if_acmpne       60
	//*  27   57:goto            105
		{
			obj = ((Object) (_findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)), javatype)));
	//   28   60:aload_0         
	//   29   61:aload           5
	//   30   63:aload_3         
	//   31   64:invokevirtual   #348 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   32   67:astore          4
			if(deserializationconfig.useRootWrapping())
	//*  33   69:aload_1         
	//*  34   70:invokevirtual   #450 <Method boolean DeserializationConfig.useRootWrapping()>
	//*  35   73:ifeq            92
				obj = _unwrapAndDeserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), deserializationconfig, javatype, ((JsonDeserializer) (obj)));
	//   36   76:aload_0         
	//   37   77:aload_2         
	//   38   78:aload           5
	//   39   80:aload_1         
	//   40   81:aload_3         
	//   41   82:aload           4
	//   42   84:invokevirtual   #454 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, DeserializationConfig, JavaType, JsonDeserializer)>
	//   43   87:astore          4
			else
	//*  44   89:goto            108
				obj = ((JsonDeserializer) (obj)).deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)));
	//   45   92:aload           4
	//   46   94:aload_2         
	//   47   95:aload           5
	//   48   97:invokevirtual   #364 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   49  100:astore          4
		} else
	//*  50  102:goto            108
		{
			obj = null;
	//   51  105:aconst_null     
	//   52  106:astore          4
		}
		jsonparser.clearCurrentToken();
	//   53  108:aload_2         
	//   54  109:invokevirtual   #474 <Method void JsonParser.clearCurrentToken()>
		if(deserializationconfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS))
	//*  55  112:aload_1         
	//*  56  113:getstatic       #460 <Field DeserializationFeature DeserializationFeature.FAIL_ON_TRAILING_TOKENS>
	//*  57  116:invokevirtual   #461 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//*  58  119:ifeq            130
			_verifyNoTrailingTokens(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), javatype);
	//   59  122:aload_0         
	//   60  123:aload_2         
	//   61  124:aload           5
	//   62  126:aload_3         
	//   63  127:invokevirtual   #465 <Method void _verifyNoTrailingTokens(JsonParser, DeserializationContext, JavaType)>
		return obj;
	//   64  130:aload           4
	//   65  132:areturn         
	}

	protected DefaultSerializerProvider _serializerProvider(SerializationConfig serializationconfig)
	{
		return _serializerProvider.createInstance(serializationconfig, _serializerFactory);
	//    0    0:aload_0         
	//    1    1:getfield        #194 <Field DefaultSerializerProvider _serializerProvider>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #213 <Field SerializerFactory _serializerFactory>
	//    5    9:invokevirtual   #478 <Method DefaultSerializerProvider DefaultSerializerProvider.createInstance(SerializationConfig, SerializerFactory)>
	//    6   12:areturn         
	}

	protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer)
		throws IOException
	{
		String s = deserializationconfig.findRootName(javatype).getSimpleName();
	//    0    0:aload_3         
	//    1    1:aload           4
	//    2    3:invokevirtual   #482 <Method PropertyName DeserializationConfig.findRootName(JavaType)>
	//    3    6:invokevirtual   #487 <Method String PropertyName.getSimpleName()>
	//    4    9:astore          6
		if(jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #418 <Method JsonToken JsonParser.getCurrentToken()>
	//*   7   15:getstatic       #490 <Field JsonToken JsonToken.START_OBJECT>
	//*   8   18:if_acmpeq       49
			deserializationcontext.reportWrongTokenException(javatype, JsonToken.START_OBJECT, "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s", new Object[] {
				s, jsonparser.getCurrentToken()
			});
	//    9   21:aload_2         
	//   10   22:aload           4
	//   11   24:getstatic       #490 <Field JsonToken JsonToken.START_OBJECT>
	//   12   27:ldc2            #492 <String "Current token not START_OBJECT (needed to unwrap root name '%s'), but %s">
	//   13   30:iconst_2        
	//   14   31:anewarray       Object[]
	//   15   34:dup             
	//   16   35:iconst_0        
	//   17   36:aload           6
	//   18   38:aastore         
	//   19   39:dup             
	//   20   40:iconst_1        
	//   21   41:aload_1         
	//   22   42:invokevirtual   #418 <Method JsonToken JsonParser.getCurrentToken()>
	//   23   45:aastore         
	//   24   46:invokevirtual   #496 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		if(jsonparser.nextToken() != JsonToken.FIELD_NAME)
	//*  25   49:aload_1         
	//*  26   50:invokevirtual   #421 <Method JsonToken JsonParser.nextToken()>
	//*  27   53:getstatic       #499 <Field JsonToken JsonToken.FIELD_NAME>
	//*  28   56:if_acmpeq       87
			deserializationcontext.reportWrongTokenException(javatype, JsonToken.FIELD_NAME, "Current token not FIELD_NAME (to contain expected root name '%s'), but %s", new Object[] {
				s, jsonparser.getCurrentToken()
			});
	//   29   59:aload_2         
	//   30   60:aload           4
	//   31   62:getstatic       #499 <Field JsonToken JsonToken.FIELD_NAME>
	//   32   65:ldc2            #501 <String "Current token not FIELD_NAME (to contain expected root name '%s'), but %s">
	//   33   68:iconst_2        
	//   34   69:anewarray       Object[]
	//   35   72:dup             
	//   36   73:iconst_0        
	//   37   74:aload           6
	//   38   76:aastore         
	//   39   77:dup             
	//   40   78:iconst_1        
	//   41   79:aload_1         
	//   42   80:invokevirtual   #418 <Method JsonToken JsonParser.getCurrentToken()>
	//   43   83:aastore         
	//   44   84:invokevirtual   #496 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		String s1 = jsonparser.getCurrentName();
	//   45   87:aload_1         
	//   46   88:invokevirtual   #504 <Method String JsonParser.getCurrentName()>
	//   47   91:astore          7
		if(!s.equals(((Object) (s1))))
	//*  48   93:aload           6
	//*  49   95:aload           7
	//*  50   97:invokevirtual   #510 <Method boolean String.equals(Object)>
	//*  51  100:ifne            132
			deserializationcontext.reportInputMismatch(javatype, "Root name '%s' does not match expected ('%s') for type %s", new Object[] {
				s1, s, javatype
			});
	//   52  103:aload_2         
	//   53  104:aload           4
	//   54  106:ldc2            #512 <String "Root name '%s' does not match expected ('%s') for type %s">
	//   55  109:iconst_3        
	//   56  110:anewarray       Object[]
	//   57  113:dup             
	//   58  114:iconst_0        
	//   59  115:aload           7
	//   60  117:aastore         
	//   61  118:dup             
	//   62  119:iconst_1        
	//   63  120:aload           6
	//   64  122:aastore         
	//   65  123:dup             
	//   66  124:iconst_2        
	//   67  125:aload           4
	//   68  127:aastore         
	//   69  128:invokevirtual   #516 <Method Object DeserializationContext.reportInputMismatch(JavaType, String, Object[])>
	//   70  131:pop             
		jsonparser.nextToken();
	//   71  132:aload_1         
	//   72  133:invokevirtual   #421 <Method JsonToken JsonParser.nextToken()>
	//   73  136:pop             
		jsondeserializer = ((JsonDeserializer) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   74  137:aload           5
	//   75  139:aload_1         
	//   76  140:aload_2         
	//   77  141:invokevirtual   #364 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   78  144:astore          5
		if(jsonparser.nextToken() != JsonToken.END_OBJECT)
	//*  79  146:aload_1         
	//*  80  147:invokevirtual   #421 <Method JsonToken JsonParser.nextToken()>
	//*  81  150:getstatic       #360 <Field JsonToken JsonToken.END_OBJECT>
	//*  82  153:if_acmpeq       184
			deserializationcontext.reportWrongTokenException(javatype, JsonToken.END_OBJECT, "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s", new Object[] {
				s, jsonparser.getCurrentToken()
			});
	//   83  156:aload_2         
	//   84  157:aload           4
	//   85  159:getstatic       #360 <Field JsonToken JsonToken.END_OBJECT>
	//   86  162:ldc2            #518 <String "Current token not END_OBJECT (to match wrapper object with root name '%s'), but %s">
	//   87  165:iconst_2        
	//   88  166:anewarray       Object[]
	//   89  169:dup             
	//   90  170:iconst_0        
	//   91  171:aload           6
	//   92  173:aastore         
	//   93  174:dup             
	//   94  175:iconst_1        
	//   95  176:aload_1         
	//   96  177:invokevirtual   #418 <Method JsonToken JsonParser.getCurrentToken()>
	//   97  180:aastore         
	//   98  181:invokevirtual   #496 <Method void DeserializationContext.reportWrongTokenException(JavaType, JsonToken, String, Object[])>
		if(deserializationconfig.isEnabled(DeserializationFeature.FAIL_ON_TRAILING_TOKENS))
	//*  99  184:aload_3         
	//* 100  185:getstatic       #460 <Field DeserializationFeature DeserializationFeature.FAIL_ON_TRAILING_TOKENS>
	//* 101  188:invokevirtual   #461 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//* 102  191:ifeq            202
			_verifyNoTrailingTokens(jsonparser, deserializationcontext, javatype);
	//  103  194:aload_0         
	//  104  195:aload_1         
	//  105  196:aload_2         
	//  106  197:aload           4
	//  107  199:invokevirtual   #465 <Method void _verifyNoTrailingTokens(JsonParser, DeserializationContext, JavaType)>
		return ((Object) (jsondeserializer));
	//  108  202:aload           5
	//  109  204:areturn         
	}

	protected final void _verifyNoTrailingTokens(JsonParser jsonparser, DeserializationContext deserializationcontext, JavaType javatype)
		throws IOException
	{
		JsonToken jsontoken = jsonparser.nextToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #421 <Method JsonToken JsonParser.nextToken()>
	//    2    4:astore          4
		if(jsontoken != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          23
			deserializationcontext.reportTrailingTokens(ClassUtil.rawClass(javatype), jsonparser, jsontoken);
	//    5   11:aload_2         
	//    6   12:aload_3         
	//    7   13:invokestatic    #523 <Method Class ClassUtil.rawClass(JavaType)>
	//    8   16:aload_1         
	//    9   17:aload           4
	//   10   19:invokevirtual   #527 <Method Object DeserializationContext.reportTrailingTokens(Class, JsonParser, JsonToken)>
	//   11   22:pop             
	//   12   23:return          
	}

	public ObjectMapper addHandler(DeserializationProblemHandler deserializationproblemhandler)
	{
		_deserializationConfig = _deserializationConfig.withHandler(deserializationproblemhandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #533 <Method DeserializationConfig DeserializationConfig.withHandler(DeserializationProblemHandler)>
	//    5    9:putfield        #171 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public ObjectMapper addMixIn(Class class1, Class class2)
	{
		_mixIns.addLocalDefinition(class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field SimpleMixInResolver _mixIns>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #539 <Method void SimpleMixInResolver.addLocalDefinition(Class, Class)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public MutableConfigOverride configOverride(Class class1)
	{
		return _configOverrides.findOrCreateOverride(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field ConfigOverrides _configOverrides>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #545 <Method MutableConfigOverride ConfigOverrides.findOrCreateOverride(Class)>
	//    4    8:areturn         
	}

	public ObjectMapper configure(DeserializationFeature deserializationfeature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            16
			deserializationfeature = ((DeserializationFeature) (_deserializationConfig.with(deserializationfeature)));
	//    2    4:aload_0         
	//    3    5:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #551 <Method DeserializationConfig DeserializationConfig.with(DeserializationFeature)>
	//    6   12:astore_1        
		else
	//*   7   13:goto            25
			deserializationfeature = ((DeserializationFeature) (_deserializationConfig.without(deserializationfeature)));
	//    8   16:aload_0         
	//    9   17:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #553 <Method DeserializationConfig DeserializationConfig.without(DeserializationFeature)>
	//   12   24:astore_1        
		_deserializationConfig = ((DeserializationConfig) (deserializationfeature));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #171 <Field DeserializationConfig _deserializationConfig>
		return this;
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public ObjectMapper configure(MapperFeature mapperfeature, boolean flag)
	{
		com.fasterxml.jackson.databind.cfg.MapperConfigBase mapperconfigbase;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            23
			mapperconfigbase = _serializationConfig.with(new MapperFeature[] {
				mapperfeature
			});
	//    2    4:aload_0         
	//    3    5:getfield        #166 <Field SerializationConfig _serializationConfig>
	//    4    8:iconst_1        
	//    5    9:anewarray       MapperFeature[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:invokevirtual   #556 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.with(MapperFeature[])>
	//   11   19:astore_3        
		else
	//*  12   20:goto            39
			mapperconfigbase = _serializationConfig.without(new MapperFeature[] {
				mapperfeature
			});
	//   13   23:aload_0         
	//   14   24:getfield        #166 <Field SerializationConfig _serializationConfig>
	//   15   27:iconst_1        
	//   16   28:anewarray       MapperFeature[]
	//   17   31:dup             
	//   18   32:iconst_0        
	//   19   33:aload_1         
	//   20   34:aastore         
	//   21   35:invokevirtual   #558 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.without(MapperFeature[])>
	//   22   38:astore_3        
		_serializationConfig = (SerializationConfig)mapperconfigbase;
	//   23   39:aload_0         
	//   24   40:aload_3         
	//   25   41:checkcast       #161 <Class SerializationConfig>
	//   26   44:putfield        #166 <Field SerializationConfig _serializationConfig>
		if(flag)
	//*  27   47:iload_2         
	//*  28   48:ifeq            70
			mapperfeature = ((MapperFeature) (_deserializationConfig.with(new MapperFeature[] {
				mapperfeature
			})));
	//   29   51:aload_0         
	//   30   52:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//   31   55:iconst_1        
	//   32   56:anewarray       MapperFeature[]
	//   33   59:dup             
	//   34   60:iconst_0        
	//   35   61:aload_1         
	//   36   62:aastore         
	//   37   63:invokevirtual   #559 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.with(MapperFeature[])>
	//   38   66:astore_1        
		else
	//*  39   67:goto            86
			mapperfeature = ((MapperFeature) (_deserializationConfig.without(new MapperFeature[] {
				mapperfeature
			})));
	//   40   70:aload_0         
	//   41   71:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//   42   74:iconst_1        
	//   43   75:anewarray       MapperFeature[]
	//   44   78:dup             
	//   45   79:iconst_0        
	//   46   80:aload_1         
	//   47   81:aastore         
	//   48   82:invokevirtual   #560 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.without(MapperFeature[])>
	//   49   85:astore_1        
		_deserializationConfig = (DeserializationConfig)mapperfeature;
	//   50   86:aload_0         
	//   51   87:aload_1         
	//   52   88:checkcast       #168 <Class DeserializationConfig>
	//   53   91:putfield        #171 <Field DeserializationConfig _deserializationConfig>
		return this;
	//   54   94:aload_0         
	//   55   95:areturn         
	}

	public ObjectMapper configure(SerializationFeature serializationfeature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            16
			serializationfeature = ((SerializationFeature) (_serializationConfig.with(serializationfeature)));
	//    2    4:aload_0         
	//    3    5:getfield        #166 <Field SerializationConfig _serializationConfig>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #563 <Method SerializationConfig SerializationConfig.with(SerializationFeature)>
	//    6   12:astore_1        
		else
	//*   7   13:goto            25
			serializationfeature = ((SerializationFeature) (_serializationConfig.without(serializationfeature)));
	//    8   16:aload_0         
	//    9   17:getfield        #166 <Field SerializationConfig _serializationConfig>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #322 <Method SerializationConfig SerializationConfig.without(SerializationFeature)>
	//   12   24:astore_1        
		_serializationConfig = ((SerializationConfig) (serializationfeature));
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:putfield        #166 <Field SerializationConfig _serializationConfig>
		return this;
	//   16   30:aload_0         
	//   17   31:areturn         
	}

	public Object convertValue(Object obj, TypeReference typereference)
		throws IllegalArgumentException
	{
		return _convert(obj, _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #139 <Field TypeFactory _typeFactory>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #569 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    6   10:invokevirtual   #571 <Method Object _convert(Object, JavaType)>
	//    7   13:areturn         
	}

	public Object convertValue(Object obj, Class class1)
		throws IllegalArgumentException
	{
		return _convert(obj, _typeFactory.constructType(((java.lang.reflect.Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #139 <Field TypeFactory _typeFactory>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #576 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    6   10:invokevirtual   #571 <Method Object _convert(Object, JavaType)>
	//    7   13:areturn         
	}

	protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
	{
		return _deserializationContext.createInstance(deserializationconfig, jsonparser, _injectableValues);
	//    0    0:aload_0         
	//    1    1:getfield        #206 <Field DefaultDeserializationContext _deserializationContext>
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #579 <Field InjectableValues _injectableValues>
	//    6   10:invokevirtual   #584 <Method DefaultDeserializationContext DefaultDeserializationContext.createInstance(DeserializationConfig, JsonParser, InjectableValues)>
	//    7   13:areturn         
	}

	public ObjectNode createObjectNode()
	{
		return _deserializationConfig.getNodeFactory().objectNode();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//    2    4:invokevirtual   #590 <Method JsonNodeFactory DeserializationConfig.getNodeFactory()>
	//    3    7:invokevirtual   #595 <Method ObjectNode JsonNodeFactory.objectNode()>
	//    4   10:areturn         
	}

	protected ClassIntrospector defaultClassIntrospector()
	{
		return ((ClassIntrospector) (new BasicClassIntrospector()));
	//    0    0:new             #597 <Class BasicClassIntrospector>
	//    1    3:dup             
	//    2    4:invokespecial   #598 <Method void BasicClassIntrospector()>
	//    3    7:areturn         
	}

	public DeserializationConfig getDeserializationConfig()
	{
		return _deserializationConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//    2    4:areturn         
	}

	public JsonFactory getFactory()
	{
		return _jsonFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field JsonFactory _jsonFactory>
	//    2    4:areturn         
	}

	public JsonFactory getJsonFactory()
	{
		return getFactory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #604 <Method JsonFactory getFactory()>
	//    2    4:areturn         
	}

	public SerializationConfig getSerializationConfig()
	{
		return _serializationConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field SerializationConfig _serializationConfig>
	//    2    4:areturn         
	}

	public SubtypeResolver getSubtypeResolver()
	{
		return _subtypeResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #134 <Field SubtypeResolver _subtypeResolver>
	//    2    4:areturn         
	}

	public TypeFactory getTypeFactory()
	{
		return _typeFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field TypeFactory _typeFactory>
	//    2    4:areturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature feature)
	{
		return _jsonFactory.isEnabled(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field JsonFactory _jsonFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #611 <Method boolean JsonFactory.isEnabled(com.fasterxml.jackson.core.JsonFactory$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		return _serializationConfig.isEnabled(feature, _jsonFactory);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field SerializationConfig _serializationConfig>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field JsonFactory _jsonFactory>
	//    5    9:invokevirtual   #615 <Method boolean SerializationConfig.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature, JsonFactory)>
	//    6   12:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		return _deserializationConfig.isEnabled(feature, _jsonFactory);
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #119 <Field JsonFactory _jsonFactory>
	//    5    9:invokevirtual   #619 <Method boolean DeserializationConfig.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature, JsonFactory)>
	//    6   12:ireturn         
	}

	public boolean isEnabled(DeserializationFeature deserializationfeature)
	{
		return _deserializationConfig.isEnabled(deserializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #461 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(MapperFeature mapperfeature)
	{
		return _serializationConfig.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field SerializationConfig _serializationConfig>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #185 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(SerializationFeature serializationfeature)
	{
		return _serializationConfig.isEnabled(serializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field SerializationConfig _serializationConfig>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #253 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    4    8:ireturn         
	}

	public Object readValue(JsonParser jsonparser, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readValue(getDeserializationConfig(), jsonparser, _typeFactory.constructType(((java.lang.reflect.Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #330 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #139 <Field TypeFactory _typeFactory>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #576 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    8   14:invokevirtual   #625 <Method Object _readValue(DeserializationConfig, JsonParser, JavaType)>
	//    9   17:areturn         
	}

	public Object readValue(InputStream inputstream, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(inputstream), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #631 <Method JsonParser JsonFactory.createParser(InputStream)>
	//    5    9:aload_0         
	//    6   10:getfield        #139 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #569 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    9   17:invokevirtual   #633 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(Reader reader1, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(reader1), javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #638 <Method JsonParser JsonFactory.createParser(Reader)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #633 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public Object readValue(String s, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(s), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #643 <Method JsonParser JsonFactory.createParser(String)>
	//    5    9:aload_0         
	//    6   10:getfield        #139 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #569 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    9   17:invokevirtual   #633 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(String s, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(s), _typeFactory.constructType(((java.lang.reflect.Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #643 <Method JsonParser JsonFactory.createParser(String)>
	//    5    9:aload_0         
	//    6   10:getfield        #139 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #576 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    9   17:invokevirtual   #633 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(byte abyte0[], Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(abyte0), _typeFactory.constructType(((java.lang.reflect.Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #119 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #650 <Method JsonParser JsonFactory.createParser(byte[])>
	//    5    9:aload_0         
	//    6   10:getfield        #139 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #576 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    9   17:invokevirtual   #633 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public ObjectReader reader(TypeReference typereference)
	{
		return _newReader(getDeserializationConfig(), _typeFactory.constructType(typereference), ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #330 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_0         
	//    4    6:getfield        #139 <Field TypeFactory _typeFactory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #569 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    7   13:aconst_null     
	//    8   14:aconst_null     
	//    9   15:aload_0         
	//   10   16:getfield        #579 <Field InjectableValues _injectableValues>
	//   11   19:invokevirtual   #655 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//   12   22:areturn         
	}

	public ObjectReader reader(JavaType javatype)
	{
		return _newReader(getDeserializationConfig(), javatype, ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #330 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aload_0         
	//    7    9:getfield        #579 <Field InjectableValues _injectableValues>
	//    8   12:invokevirtual   #655 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//    9   15:areturn         
	}

	public ObjectReader reader(Class class1)
	{
		return _newReader(getDeserializationConfig(), _typeFactory.constructType(((java.lang.reflect.Type) (class1))), ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #330 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_0         
	//    4    6:getfield        #139 <Field TypeFactory _typeFactory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #576 <Method JavaType TypeFactory.constructType(java.lang.reflect.Type)>
	//    7   13:aconst_null     
	//    8   14:aconst_null     
	//    9   15:aload_0         
	//   10   16:getfield        #579 <Field InjectableValues _injectableValues>
	//   11   19:invokevirtual   #655 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//   12   22:areturn         
	}

	public ObjectMapper registerModule(Module module)
	{
		if(isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #664 <Field MapperFeature MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS>
	//*   2    4:invokevirtual   #665 <Method boolean isEnabled(MapperFeature)>
	//*   3    7:ifeq            52
		{
			Object obj = module.getTypeId();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #671 <Method Object Module.getTypeId()>
	//    6   14:astore_2        
			if(obj != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          52
			{
				if(_registeredModuleTypes == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #673 <Field Set _registeredModuleTypes>
	//*  11   23:ifnonnull       37
					_registeredModuleTypes = ((Set) (new LinkedHashSet()));
	//   12   26:aload_0         
	//   13   27:new             #675 <Class LinkedHashSet>
	//   14   30:dup             
	//   15   31:invokespecial   #676 <Method void LinkedHashSet()>
	//   16   34:putfield        #673 <Field Set _registeredModuleTypes>
				if(!_registeredModuleTypes.add(obj))
	//*  17   37:aload_0         
	//*  18   38:getfield        #673 <Field Set _registeredModuleTypes>
	//*  19   41:aload_2         
	//*  20   42:invokeinterface #681 <Method boolean Set.add(Object)>
	//*  21   47:ifne            52
					return this;
	//   22   50:aload_0         
	//   23   51:areturn         
			}
		}
		if(module.getModuleName() != null)
	//*  24   52:aload_1         
	//*  25   53:invokevirtual   #684 <Method String Module.getModuleName()>
	//*  26   56:ifnull          91
		{
			if(module.version() != null)
	//*  27   59:aload_1         
	//*  28   60:invokevirtual   #688 <Method Version Module.version()>
	//*  29   63:ifnull          80
			{
				module.setupModule(new Module.SetupContext() {

					public void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
					{
						abstracttyperesolver = ((AbstractTypeResolver) (_deserializationContext._factory.withAbstractTypeResolver(abstracttyperesolver)));
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
					//    4   10:aload_1         
					//    5   11:invokevirtual   #39  <Method DeserializerFactory DeserializerFactory.withAbstractTypeResolver(AbstractTypeResolver)>
					//    6   14:astore_1        
						ObjectMapper objectmapper = ObjectMapper.this;
					//    7   15:aload_0         
					//    8   16:getfield        #17  <Field ObjectMapper this$0>
					//    9   19:astore_2        
						objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (abstracttyperesolver)));
					//   10   20:aload_2         
					//   11   21:aload_2         
					//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   13   25:aload_1         
					//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
					//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   16   32:return          
					}

					public void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
					{
						beandeserializermodifier = ((BeanDeserializerModifier) (_deserializationContext._factory.withDeserializerModifier(beandeserializermodifier)));
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
					//    4   10:aload_1         
					//    5   11:invokevirtual   #49  <Method DeserializerFactory DeserializerFactory.withDeserializerModifier(BeanDeserializerModifier)>
					//    6   14:astore_1        
						ObjectMapper objectmapper = ObjectMapper.this;
					//    7   15:aload_0         
					//    8   16:getfield        #17  <Field ObjectMapper this$0>
					//    9   19:astore_2        
						objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (beandeserializermodifier)));
					//   10   20:aload_2         
					//   11   21:aload_2         
					//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   13   25:aload_1         
					//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
					//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   16   32:return          
					}

					public void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier)
					{
						ObjectMapper objectmapper = ObjectMapper.this;
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:astore_2        
						objectmapper._serializerFactory = objectmapper._serializerFactory.withSerializerModifier(beanserializermodifier);
					//    3    5:aload_2         
					//    4    6:aload_2         
					//    5    7:getfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
					//    6   10:aload_1         
					//    7   11:invokevirtual   #61  <Method SerializerFactory SerializerFactory.withSerializerModifier(BeanSerializerModifier)>
					//    8   14:putfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
					//    9   17:return          
					}

					public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationproblemhandler)
					{
						addHandler(deserializationproblemhandler);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #67  <Method ObjectMapper ObjectMapper.addHandler(DeserializationProblemHandler)>
					//    4    8:pop             
					//    5    9:return          
					}

					public void addDeserializers(Deserializers deserializers)
					{
						deserializers = ((Deserializers) (_deserializationContext._factory.withAdditionalDeserializers(deserializers)));
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
					//    4   10:aload_1         
					//    5   11:invokevirtual   #73  <Method DeserializerFactory DeserializerFactory.withAdditionalDeserializers(Deserializers)>
					//    6   14:astore_1        
						ObjectMapper objectmapper = ObjectMapper.this;
					//    7   15:aload_0         
					//    8   16:getfield        #17  <Field ObjectMapper this$0>
					//    9   19:astore_2        
						objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (deserializers)));
					//   10   20:aload_2         
					//   11   21:aload_2         
					//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   13   25:aload_1         
					//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
					//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   16   32:return          
					}

					public void addKeyDeserializers(KeyDeserializers keydeserializers)
					{
						keydeserializers = ((KeyDeserializers) (_deserializationContext._factory.withAdditionalKeyDeserializers(keydeserializers)));
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
					//    4   10:aload_1         
					//    5   11:invokevirtual   #79  <Method DeserializerFactory DeserializerFactory.withAdditionalKeyDeserializers(KeyDeserializers)>
					//    6   14:astore_1        
						ObjectMapper objectmapper = ObjectMapper.this;
					//    7   15:aload_0         
					//    8   16:getfield        #17  <Field ObjectMapper this$0>
					//    9   19:astore_2        
						objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (keydeserializers)));
					//   10   20:aload_2         
					//   11   21:aload_2         
					//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   13   25:aload_1         
					//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
					//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   16   32:return          
					}

					public void addKeySerializers(Serializers serializers)
					{
						ObjectMapper objectmapper = ObjectMapper.this;
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:astore_2        
						objectmapper._serializerFactory = objectmapper._serializerFactory.withAdditionalKeySerializers(serializers);
					//    3    5:aload_2         
					//    4    6:aload_2         
					//    5    7:getfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
					//    6   10:aload_1         
					//    7   11:invokevirtual   #85  <Method SerializerFactory SerializerFactory.withAdditionalKeySerializers(Serializers)>
					//    8   14:putfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
					//    9   17:return          
					}

					public void addSerializers(Serializers serializers)
					{
						ObjectMapper objectmapper = ObjectMapper.this;
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:astore_2        
						objectmapper._serializerFactory = objectmapper._serializerFactory.withAdditionalSerializers(serializers);
					//    3    5:aload_2         
					//    4    6:aload_2         
					//    5    7:getfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
					//    6   10:aload_1         
					//    7   11:invokevirtual   #89  <Method SerializerFactory SerializerFactory.withAdditionalSerializers(Serializers)>
					//    8   14:putfield        #55  <Field SerializerFactory ObjectMapper._serializerFactory>
					//    9   17:return          
					}

					public void addTypeModifier(TypeModifier typemodifier)
					{
						typemodifier = ((TypeModifier) (_typeFactory.withModifier(typemodifier)));
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:getfield        #95  <Field TypeFactory ObjectMapper._typeFactory>
					//    3    7:aload_1         
					//    4    8:invokevirtual   #101 <Method TypeFactory TypeFactory.withModifier(TypeModifier)>
					//    5   11:astore_1        
						setTypeFactory(((TypeFactory) (typemodifier)));
					//    6   12:aload_0         
					//    7   13:getfield        #17  <Field ObjectMapper this$0>
					//    8   16:aload_1         
					//    9   17:invokevirtual   #105 <Method ObjectMapper ObjectMapper.setTypeFactory(TypeFactory)>
					//   10   20:pop             
					//   11   21:return          
					}

					public void addValueInstantiators(ValueInstantiators valueinstantiators)
					{
						valueinstantiators = ((ValueInstantiators) (_deserializationContext._factory.withValueInstantiators(valueinstantiators)));
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//    3    7:getfield        #33  <Field DeserializerFactory DefaultDeserializationContext._factory>
					//    4   10:aload_1         
					//    5   11:invokevirtual   #111 <Method DeserializerFactory DeserializerFactory.withValueInstantiators(ValueInstantiators)>
					//    6   14:astore_1        
						ObjectMapper objectmapper = ObjectMapper.this;
					//    7   15:aload_0         
					//    8   16:getfield        #17  <Field ObjectMapper this$0>
					//    9   19:astore_2        
						objectmapper._deserializationContext = objectmapper._deserializationContext.with(((DeserializerFactory) (valueinstantiators)));
					//   10   20:aload_2         
					//   11   21:aload_2         
					//   12   22:getfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   13   25:aload_1         
					//   14   26:invokevirtual   #43  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
					//   15   29:putfield        #27  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
					//   16   32:return          
					}

					public void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
					{
						ObjectMapper objectmapper = ObjectMapper.this;
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:astore_2        
						objectmapper._deserializationConfig = (DeserializationConfig)objectmapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
					//    3    5:aload_2         
					//    4    6:aload_2         
					//    5    7:getfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
					//    6   10:aload_1         
					//    7   11:invokevirtual   #123 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
					//    8   14:checkcast       #119 <Class DeserializationConfig>
					//    9   17:putfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
						objectmapper = ObjectMapper.this;
					//   10   20:aload_0         
					//   11   21:getfield        #17  <Field ObjectMapper this$0>
					//   12   24:astore_2        
						objectmapper._serializationConfig = (SerializationConfig)objectmapper._serializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
					//   13   25:aload_2         
					//   14   26:aload_2         
					//   15   27:getfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
					//   16   30:aload_1         
					//   17   31:invokevirtual   #130 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
					//   18   34:checkcast       #129 <Class SerializationConfig>
					//   19   37:putfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
					//   20   40:return          
					}

					public MutableConfigOverride configOverride(Class class1)
					{
						return ObjectMapper.this.configOverride(class1);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #134 <Method MutableConfigOverride ObjectMapper.configOverride(Class)>
					//    4    8:areturn         
					}

					public Version getMapperVersion()
					{
						return version();
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:invokevirtual   #141 <Method Version ObjectMapper.version()>
					//    3    7:areturn         
					}

					public ObjectCodec getOwner()
					{
						return ((ObjectCodec) (ObjectMapper.this));
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:areturn         
					}

					public TypeFactory getTypeFactory()
					{
						return _typeFactory;
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:getfield        #95  <Field TypeFactory ObjectMapper._typeFactory>
					//    3    7:areturn         
					}

					public void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
					{
						ObjectMapper objectmapper = ObjectMapper.this;
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:astore_2        
						objectmapper._deserializationConfig = (DeserializationConfig)objectmapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
					//    3    5:aload_2         
					//    4    6:aload_2         
					//    5    7:getfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
					//    6   10:aload_1         
					//    7   11:invokevirtual   #150 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
					//    8   14:checkcast       #119 <Class DeserializationConfig>
					//    9   17:putfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
						objectmapper = ObjectMapper.this;
					//   10   20:aload_0         
					//   11   21:getfield        #17  <Field ObjectMapper this$0>
					//   12   24:astore_2        
						objectmapper._serializationConfig = (SerializationConfig)objectmapper._serializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
					//   13   25:aload_2         
					//   14   26:aload_2         
					//   15   27:getfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
					//   16   30:aload_1         
					//   17   31:invokevirtual   #151 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
					//   18   34:checkcast       #129 <Class SerializationConfig>
					//   19   37:putfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
					//   20   40:return          
					}

					public boolean isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature feature)
					{
						return ObjectMapper.this.isEnabled(feature);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #155 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonFactory$Feature)>
					//    4    8:ireturn         
					}

					public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
					{
						return ObjectMapper.this.isEnabled(feature);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #158 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
					//    4    8:ireturn         
					}

					public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
					{
						return ObjectMapper.this.isEnabled(feature);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #161 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
					//    4    8:ireturn         
					}

					public boolean isEnabled(DeserializationFeature deserializationfeature)
					{
						return ObjectMapper.this.isEnabled(deserializationfeature);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #164 <Method boolean ObjectMapper.isEnabled(DeserializationFeature)>
					//    4    8:ireturn         
					}

					public boolean isEnabled(MapperFeature mapperfeature)
					{
						return ObjectMapper.this.isEnabled(mapperfeature);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #167 <Method boolean ObjectMapper.isEnabled(MapperFeature)>
					//    4    8:ireturn         
					}

					public boolean isEnabled(SerializationFeature serializationfeature)
					{
						return ObjectMapper.this.isEnabled(serializationfeature);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #170 <Method boolean ObjectMapper.isEnabled(SerializationFeature)>
					//    4    8:ireturn         
					}

					public void registerSubtypes(Collection collection)
					{
						ObjectMapper.this.registerSubtypes(collection);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #174 <Method void ObjectMapper.registerSubtypes(Collection)>
					//    4    8:return          
					}

					public transient void registerSubtypes(NamedType anamedtype[])
					{
						ObjectMapper.this.registerSubtypes(anamedtype);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #178 <Method void ObjectMapper.registerSubtypes(NamedType[])>
					//    4    8:return          
					}

					public transient void registerSubtypes(Class aclass[])
					{
						ObjectMapper.this.registerSubtypes(aclass);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #181 <Method void ObjectMapper.registerSubtypes(Class[])>
					//    4    8:return          
					}

					public void setClassIntrospector(ClassIntrospector classintrospector)
					{
						ObjectMapper objectmapper = ObjectMapper.this;
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:astore_2        
						objectmapper._deserializationConfig = (DeserializationConfig)objectmapper._deserializationConfig.with(classintrospector);
					//    3    5:aload_2         
					//    4    6:aload_2         
					//    5    7:getfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
					//    6   10:aload_1         
					//    7   11:invokevirtual   #187 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.with(ClassIntrospector)>
					//    8   14:checkcast       #119 <Class DeserializationConfig>
					//    9   17:putfield        #117 <Field DeserializationConfig ObjectMapper._deserializationConfig>
						objectmapper = ObjectMapper.this;
					//   10   20:aload_0         
					//   11   21:getfield        #17  <Field ObjectMapper this$0>
					//   12   24:astore_2        
						objectmapper._serializationConfig = (SerializationConfig)objectmapper._serializationConfig.with(classintrospector);
					//   13   25:aload_2         
					//   14   26:aload_2         
					//   15   27:getfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
					//   16   30:aload_1         
					//   17   31:invokevirtual   #188 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.with(ClassIntrospector)>
					//   18   34:checkcast       #129 <Class SerializationConfig>
					//   19   37:putfield        #127 <Field SerializationConfig ObjectMapper._serializationConfig>
					//   20   40:return          
					}

					public void setMixInAnnotations(Class class1, Class class2)
					{
						addMixIn(class1, class2);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:aload_2         
					//    4    6:invokevirtual   #194 <Method ObjectMapper ObjectMapper.addMixIn(Class, Class)>
					//    5    9:pop             
					//    6   10:return          
					}

					public void setNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
					{
						setPropertyNamingStrategy(propertynamingstrategy);
					//    0    0:aload_0         
					//    1    1:getfield        #17  <Field ObjectMapper this$0>
					//    2    4:aload_1         
					//    3    5:invokevirtual   #201 <Method ObjectMapper ObjectMapper.setPropertyNamingStrategy(PropertyNamingStrategy)>
					//    4    8:pop             
					//    5    9:return          
					}

					final ObjectMapper this$0;

			
			{
				this$0 = ObjectMapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ObjectMapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
				}
);
	//   30   66:aload_1         
	//   31   67:new             #10  <Class ObjectMapper$1>
	//   32   70:dup             
	//   33   71:aload_0         
	//   34   72:invokespecial   #689 <Method void ObjectMapper$1(ObjectMapper)>
	//   35   75:invokevirtual   #693 <Method void Module.setupModule(Module$SetupContext)>
				return this;
	//   36   78:aload_0         
	//   37   79:areturn         
			} else
			{
				throw new IllegalArgumentException("Module without defined version");
	//   38   80:new             #277 <Class IllegalArgumentException>
	//   39   83:dup             
	//   40   84:ldc2            #695 <String "Module without defined version">
	//   41   87:invokespecial   #698 <Method void IllegalArgumentException(String)>
	//   42   90:athrow          
			}
		} else
		{
			throw new IllegalArgumentException("Module without defined name");
	//   43   91:new             #277 <Class IllegalArgumentException>
	//   44   94:dup             
	//   45   95:ldc2            #700 <String "Module without defined name">
	//   46   98:invokespecial   #698 <Method void IllegalArgumentException(String)>
	//   47  101:athrow          
		}
	}

	public void registerSubtypes(Collection collection)
	{
		getSubtypeResolver().registerSubtypes(collection);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #704 <Method SubtypeResolver getSubtypeResolver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #708 <Method void SubtypeResolver.registerSubtypes(Collection)>
	//    4    8:return          
	}

	public transient void registerSubtypes(NamedType anamedtype[])
	{
		getSubtypeResolver().registerSubtypes(anamedtype);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #704 <Method SubtypeResolver getSubtypeResolver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #712 <Method void SubtypeResolver.registerSubtypes(NamedType[])>
	//    4    8:return          
	}

	public transient void registerSubtypes(Class aclass[])
	{
		getSubtypeResolver().registerSubtypes(aclass);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #704 <Method SubtypeResolver getSubtypeResolver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #715 <Method void SubtypeResolver.registerSubtypes(Class[])>
	//    4    8:return          
	}

	public ObjectMapper setDefaultPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		_configOverrides.setDefaultInclusion(value);
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field ConfigOverrides _configOverrides>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #722 <Method void ConfigOverrides.setDefaultInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ObjectMapper setPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		return setDefaultPropertyInclusion(value);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #725 <Method ObjectMapper setDefaultPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    3    5:areturn         
	}

	public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
	{
		_serializationConfig = (SerializationConfig)_serializationConfig.with(propertynamingstrategy);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #166 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #730 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.with(PropertyNamingStrategy)>
	//    5    9:checkcast       #161 <Class SerializationConfig>
	//    6   12:putfield        #166 <Field SerializationConfig _serializationConfig>
		_deserializationConfig = (DeserializationConfig)_deserializationConfig.with(propertynamingstrategy);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #731 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.with(PropertyNamingStrategy)>
	//   12   24:checkcast       #168 <Class DeserializationConfig>
	//   13   27:putfield        #171 <Field DeserializationConfig _deserializationConfig>
		return this;
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	public ObjectMapper setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		setPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value.construct(include, include));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokestatic    #739 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.construct(com.fasterxml.jackson.annotation.JsonInclude$Include, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//    4    6:invokevirtual   #741 <Method ObjectMapper setPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultserializerprovider)
	{
		_serializerProvider = defaultserializerprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #194 <Field DefaultSerializerProvider _serializerProvider>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ObjectMapper setTypeFactory(TypeFactory typefactory)
	{
		_typeFactory = typefactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field TypeFactory _typeFactory>
		_deserializationConfig = (DeserializationConfig)_deserializationConfig.with(typefactory);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #171 <Field DeserializationConfig _deserializationConfig>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #748 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase DeserializationConfig.with(TypeFactory)>
	//    8   14:checkcast       #168 <Class DeserializationConfig>
	//    9   17:putfield        #171 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = (SerializationConfig)_serializationConfig.with(typefactory);
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:getfield        #166 <Field SerializationConfig _serializationConfig>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #749 <Method com.fasterxml.jackson.databind.cfg.MapperConfigBase SerializationConfig.with(TypeFactory)>
	//   15   29:checkcast       #161 <Class SerializationConfig>
	//   16   32:putfield        #166 <Field SerializationConfig _serializationConfig>
		return this;
	//   17   35:aload_0         
	//   18   36:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #755 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public void writeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #261 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_3        
		if(serializationconfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsongenerator.getPrettyPrinter() == null)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #761 <Field SerializationFeature SerializationFeature.INDENT_OUTPUT>
	//*   5    9:invokevirtual   #253 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*   6   12:ifeq            31
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #765 <Method com.fasterxml.jackson.core.PrettyPrinter JsonGenerator.getPrettyPrinter()>
	//*   9   19:ifnonnull       31
			jsongenerator.setPrettyPrinter(serializationconfig.constructDefaultPrettyPrinter());
	//   10   22:aload_1         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #768 <Method com.fasterxml.jackson.core.PrettyPrinter SerializationConfig.constructDefaultPrettyPrinter()>
	//   13   27:invokevirtual   #772 <Method JsonGenerator JsonGenerator.setPrettyPrinter(com.fasterxml.jackson.core.PrettyPrinter)>
	//   14   30:pop             
		if(serializationconfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
	//*  15   31:aload_3         
	//*  16   32:getstatic       #268 <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//*  17   35:invokevirtual   #253 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  18   38:ifeq            56
	//*  19   41:aload_2         
	//*  20   42:instanceof      #221 <Class Closeable>
	//*  21   45:ifeq            56
		{
			_writeCloseableValue(jsongenerator, obj, serializationconfig);
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:aload_2         
	//   25   51:aload_3         
	//   26   52:invokespecial   #774 <Method void _writeCloseableValue(JsonGenerator, Object, SerializationConfig)>
			return;
	//   27   55:return          
		}
		_serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
	//   28   56:aload_0         
	//   29   57:aload_3         
	//   30   58:invokevirtual   #224 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   31   61:aload_1         
	//   32   62:aload_2         
	//   33   63:invokevirtual   #230 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		if(serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
	//*  34   66:aload_3         
	//*  35   67:getstatic       #250 <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//*  36   70:invokevirtual   #253 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  37   73:ifeq            80
			jsongenerator.flush();
	//   38   76:aload_1         
	//   39   77:invokevirtual   #256 <Method void JsonGenerator.flush()>
	//   40   80:return          
	}

	public byte[] writeValueAsBytes(Object obj)
		throws JsonProcessingException
	{
		ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder(_jsonFactory._getBufferRecycler());
	//    0    0:new             #780 <Class ByteArrayBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #119 <Field JsonFactory _jsonFactory>
	//    4    8:invokevirtual   #784 <Method com.fasterxml.jackson.core.util.BufferRecycler JsonFactory._getBufferRecycler()>
	//    5   11:invokespecial   #787 <Method void ByteArrayBuilder(com.fasterxml.jackson.core.util.BufferRecycler)>
	//    6   14:astore_2        
		try
		{
			_configAndWriteValue(_jsonFactory.createGenerator(((java.io.OutputStream) (bytearraybuilder)), JsonEncoding.UTF8), obj);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #119 <Field JsonFactory _jsonFactory>
	//   10   20:aload_2         
	//   11   21:getstatic       #793 <Field JsonEncoding JsonEncoding.UTF8>
	//   12   24:invokevirtual   #797 <Method JsonGenerator JsonFactory.createGenerator(java.io.OutputStream, JsonEncoding)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #799 <Method void _configAndWriteValue(JsonGenerator, Object)>
		}
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #803 <Method byte[] ByteArrayBuilder.toByteArray()>
	//*  17   35:astore_1        
	//*  18   36:aload_2         
	//*  19   37:invokevirtual   #806 <Method void ByteArrayBuilder.release()>
	//*  20   40:aload_1         
	//*  21   41:areturn         
	//*  22   42:astore_1        
	//*  23   43:aload_1         
	//*  24   44:invokestatic    #810 <Method JsonMappingException JsonMappingException.fromUnexpectedIOE(IOException)>
	//*  25   47:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  26   48:astore_1        
		{
			throw obj;
	//   27   49:aload_1         
	//   28   50:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw JsonMappingException.fromUnexpectedIOE(((IOException) (obj)));
		}
		obj = ((Object) (bytearraybuilder.toByteArray()));
		bytearraybuilder.release();
		return ((byte []) (obj));
	}

	public String writeValueAsString(Object obj)
		throws JsonProcessingException
	{
		SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_jsonFactory._getBufferRecycler());
	//    0    0:new             #814 <Class SegmentedStringWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #119 <Field JsonFactory _jsonFactory>
	//    4    8:invokevirtual   #784 <Method com.fasterxml.jackson.core.util.BufferRecycler JsonFactory._getBufferRecycler()>
	//    5   11:invokespecial   #815 <Method void SegmentedStringWriter(com.fasterxml.jackson.core.util.BufferRecycler)>
	//    6   14:astore_2        
		try
		{
			_configAndWriteValue(_jsonFactory.createGenerator(((java.io.Writer) (segmentedstringwriter))), obj);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #119 <Field JsonFactory _jsonFactory>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #818 <Method JsonGenerator JsonFactory.createGenerator(java.io.Writer)>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #799 <Method void _configAndWriteValue(JsonGenerator, Object)>
		}
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #821 <Method String SegmentedStringWriter.getAndClear()>
	//*  16   32:areturn         
	//*  17   33:astore_1        
	//*  18   34:aload_1         
	//*  19   35:invokestatic    #810 <Method JsonMappingException JsonMappingException.fromUnexpectedIOE(IOException)>
	//*  20   38:athrow          
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  21   39:astore_1        
		{
			throw obj;
	//   22   40:aload_1         
	//   23   41:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
		{
			throw JsonMappingException.fromUnexpectedIOE(((IOException) (obj)));
		}
		return segmentedstringwriter.getAndClear();
	}

	public ObjectWriter writer()
	{
		return _newWriter(getSerializationConfig());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #261 <Method SerializationConfig getSerializationConfig()>
	//    3    5:invokevirtual   #825 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    4    8:areturn         
	}

	protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
	protected static final BaseSettings DEFAULT_BASE;
	private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
	private static final long serialVersionUID = 2L;
	protected final ConfigOverrides _configOverrides;
	protected DeserializationConfig _deserializationConfig;
	protected DefaultDeserializationContext _deserializationContext;
	protected InjectableValues _injectableValues;
	protected final JsonFactory _jsonFactory;
	protected SimpleMixInResolver _mixIns;
	protected Set _registeredModuleTypes;
	protected final ConcurrentHashMap _rootDeserializers;
	protected SerializationConfig _serializationConfig;
	protected SerializerFactory _serializerFactory;
	protected DefaultSerializerProvider _serializerProvider;
	protected SubtypeResolver _subtypeResolver;
	protected TypeFactory _typeFactory;

	static 
	{
	//    0    0:ldc1            #52  <Class JsonNode>
	//    1    2:invokestatic    #58  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//    2    5:putstatic       #60  <Field JavaType JSON_NODE_TYPE>
		DEFAULT_ANNOTATION_INTROSPECTOR = ((AnnotationIntrospector) (new JacksonAnnotationIntrospector()));
	//    3    8:new             #62  <Class JacksonAnnotationIntrospector>
	//    4   11:dup             
	//    5   12:invokespecial   #65  <Method void JacksonAnnotationIntrospector()>
	//    6   15:putstatic       #67  <Field AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR>
		DEFAULT_BASE = new BaseSettings(((ClassIntrospector) (null)), DEFAULT_ANNOTATION_INTROSPECTOR, ((PropertyNamingStrategy) (null)), TypeFactory.defaultInstance(), ((com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder) (null)), ((java.text.DateFormat) (StdDateFormat.instance)), ((com.fasterxml.jackson.databind.cfg.HandlerInstantiator) (null)), Locale.getDefault(), ((java.util.TimeZone) (null)), Base64Variants.getDefaultVariant());
	//    7   18:new             #69  <Class BaseSettings>
	//    8   21:dup             
	//    9   22:aconst_null     
	//   10   23:getstatic       #67  <Field AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR>
	//   11   26:aconst_null     
	//   12   27:invokestatic    #75  <Method TypeFactory TypeFactory.defaultInstance()>
	//   13   30:aconst_null     
	//   14   31:getstatic       #81  <Field StdDateFormat StdDateFormat.instance>
	//   15   34:aconst_null     
	//   16   35:invokestatic    #87  <Method Locale Locale.getDefault()>
	//   17   38:aconst_null     
	//   18   39:invokestatic    #93  <Method com.fasterxml.jackson.core.Base64Variant Base64Variants.getDefaultVariant()>
	//   19   42:invokespecial   #96  <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, PropertyNamingStrategy, TypeFactory, com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder, java.text.DateFormat, com.fasterxml.jackson.databind.cfg.HandlerInstantiator, Locale, java.util.TimeZone, com.fasterxml.jackson.core.Base64Variant)>
	//   20   45:putstatic       #98  <Field BaseSettings DEFAULT_BASE>
	//*  21   48:return          
	}
}
