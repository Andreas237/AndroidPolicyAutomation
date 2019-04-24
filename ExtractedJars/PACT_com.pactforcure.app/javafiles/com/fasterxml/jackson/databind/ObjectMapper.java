// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.SegmentedStringWriter;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerModifier;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.deser.Deserializers;
import com.fasterxml.jackson.databind.deser.KeyDeserializers;
import com.fasterxml.jackson.databind.deser.ValueInstantiators;
import com.fasterxml.jackson.databind.introspect.BasicClassIntrospector;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.impl.StdTypeResolverBuilder;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.TreeTraversingParser;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.databind.ser.Serializers;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.type.TypeModifier;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.*;
import java.lang.reflect.Type;
import java.net.URL;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JsonNode, MappingJsonFactory, SerializationConfig, DeserializationConfig, 
//			MapperFeature, SerializationFeature, Module, JavaType, 
//			DeserializationFeature, JsonDeserializer, JsonMappingException, DeserializationContext, 
//			ObjectReader, ObjectWriter, PropertyName, MappingIterator, 
//			AnnotationIntrospector, InjectableValues, PropertyNamingStrategy, SerializerProvider, 
//			AbstractTypeResolver

public class ObjectMapper extends ObjectCodec
	implements Versioned, Serializable
{
	public static class DefaultTypeResolverBuilder extends StdTypeResolverBuilder
		implements Serializable
	{

		public TypeDeserializer buildTypeDeserializer(DeserializationConfig deserializationconfig, JavaType javatype, Collection collection)
		{
			if(useForType(javatype))
		//*   0    0:aload_0         
		//*   1    1:aload_2         
		//*   2    2:invokevirtual   #29  <Method boolean useForType(JavaType)>
		//*   3    5:ifeq            16
				return super.buildTypeDeserializer(deserializationconfig, javatype, collection);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokespecial   #31  <Method TypeDeserializer StdTypeResolverBuilder.buildTypeDeserializer(DeserializationConfig, JavaType, Collection)>
		//    9   15:areturn         
			else
				return null;
		//   10   16:aconst_null     
		//   11   17:areturn         
		}

		public TypeSerializer buildTypeSerializer(SerializationConfig serializationconfig, JavaType javatype, Collection collection)
		{
			if(useForType(javatype))
		//*   0    0:aload_0         
		//*   1    1:aload_2         
		//*   2    2:invokevirtual   #29  <Method boolean useForType(JavaType)>
		//*   3    5:ifeq            16
				return super.buildTypeSerializer(serializationconfig, javatype, collection);
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:aload_2         
		//    7   11:aload_3         
		//    8   12:invokespecial   #37  <Method TypeSerializer StdTypeResolverBuilder.buildTypeSerializer(SerializationConfig, JavaType, Collection)>
		//    9   15:areturn         
			else
				return null;
		//   10   16:aconst_null     
		//   11   17:areturn         
		}

		public boolean useForType(JavaType javatype)
		{
			boolean flag;
			boolean flag1;
			JavaType javatype1;
			JavaType javatype2;
			JavaType javatype3;
			flag = true;
		//    0    0:iconst_1        
		//    1    1:istore_2        
			flag1 = false;
		//    2    2:iconst_0        
		//    3    3:istore_3        
			javatype1 = javatype;
		//    4    4:aload_1         
		//    5    5:astore          4
			javatype2 = javatype;
		//    6    7:aload_1         
		//    7    8:astore          5
			javatype3 = javatype;
		//    8   10:aload_1         
		//    9   11:astore          6
			static class _cls2
			{

				static final int $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping = new int[DefaultTyping.values().length];
				//    0    0:invokestatic    #18  <Method ObjectMapper$DefaultTyping[] ObjectMapper$DefaultTyping.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
					try
					{
						$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[DefaultTyping.NON_CONCRETE_AND_ARRAYS.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
				//    5   12:getstatic       #24  <Field ObjectMapper$DefaultTyping ObjectMapper$DefaultTyping.NON_CONCRETE_AND_ARRAYS>
				//    6   15:invokevirtual   #28  <Method int ObjectMapper$DefaultTyping.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
				//*  10   23:getstatic       #31  <Field ObjectMapper$DefaultTyping ObjectMapper$DefaultTyping.OBJECT_AND_NON_CONCRETE>
				//*  11   26:invokevirtual   #28  <Method int ObjectMapper$DefaultTyping.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
				//*  15   34:getstatic       #34  <Field ObjectMapper$DefaultTyping ObjectMapper$DefaultTyping.NON_FINAL>
				//*  16   37:invokevirtual   #28  <Method int ObjectMapper$DefaultTyping.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:return          
				//*  20   43:astore_0        
				//*  21   44:return          
				//*  22   45:astore_0        
				//*  23   46:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   24   49:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[DefaultTyping.OBJECT_AND_NON_CONCRETE.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror1) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping[DefaultTyping.NON_FINAL.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//*  25   50:goto            20
				}
			}

			_cls2..SwitchMap.com.fasterxml.jackson.databind.ObjectMapper.DefaultTyping[_appliesFor.ordinal()];
		//   10   13:getstatic       #44  <Field int[] ObjectMapper$2.$SwitchMap$com$fasterxml$jackson$databind$ObjectMapper$DefaultTyping>
		//   11   16:aload_0         
		//   12   17:getfield        #22  <Field ObjectMapper$DefaultTyping _appliesFor>
		//   13   20:invokevirtual   #50  <Method int ObjectMapper$DefaultTyping.ordinal()>
		//   14   23:iaload          
			JVM INSTR tableswitch 1 3: default 52
		//		               1 59
		//		               2 81
		//		               3 116;
		//   15   24:tableswitch     1 3: default 52
		//		               1 59
		//		               2 81
		//		               3 116
			   goto _L1 _L2 _L3 _L4
_L1:
			flag = javatype.isJavaLangObject();
		//   16   52:aload_1         
		//   17   53:invokevirtual   #56  <Method boolean JavaType.isJavaLangObject()>
		//   18   56:istore_2        
_L7:
			return flag;
		//   19   57:iload_2         
		//   20   58:ireturn         
_L2:
			javatype2 = javatype1;
		//   21   59:aload           4
		//   22   61:astore          5
			if(!javatype1.isArrayType()) goto _L3; else goto _L5
		//   23   63:aload           4
		//   24   65:invokevirtual   #59  <Method boolean JavaType.isArrayType()>
		//   25   68:ifeq            81
_L5:
			javatype1 = javatype1.getContentType();
		//   26   71:aload           4
		//   27   73:invokevirtual   #63  <Method JavaType JavaType.getContentType()>
		//   28   76:astore          4
			  goto _L2
		//*  29   78:goto            59
_L3:
			if(javatype2.isJavaLangObject())
				break; /* Loop/switch isn't completed */
		//   30   81:aload           5
		//   31   83:invokevirtual   #56  <Method boolean JavaType.isJavaLangObject()>
		//   32   86:ifne            114
			flag = flag1;
		//   33   89:iload_3         
		//   34   90:istore_2        
			if(javatype2.isConcrete()) goto _L7; else goto _L6
		//   35   91:aload           5
		//   36   93:invokevirtual   #66  <Method boolean JavaType.isConcrete()>
		//   37   96:ifne            57
_L6:
			flag = flag1;
		//   38   99:iload_3         
		//   39  100:istore_2        
			if(((Class) (com/fasterxml/jackson/core/TreeNode)).isAssignableFrom(javatype2.getRawClass())) goto _L7; else goto _L8
		//   40  101:ldc1            #68  <Class TreeNode>
		//   41  103:aload           5
		//   42  105:invokevirtual   #72  <Method Class JavaType.getRawClass()>
		//   43  108:invokevirtual   #78  <Method boolean Class.isAssignableFrom(Class)>
		//   44  111:ifne            57
_L8:
			return true;
		//   45  114:iconst_1        
		//   46  115:ireturn         
_L4:
			for(; javatype3.isArrayType(); javatype3 = javatype3.getContentType());
		//   47  116:aload           6
		//   48  118:invokevirtual   #59  <Method boolean JavaType.isArrayType()>
		//   49  121:ifeq            134
		//   50  124:aload           6
		//   51  126:invokevirtual   #63  <Method JavaType JavaType.getContentType()>
		//   52  129:astore          6
		//*  53  131:goto            116
			if(javatype3.isFinal() || ((Class) (com/fasterxml/jackson/core/TreeNode)).isAssignableFrom(javatype3.getRawClass()))
		//*  54  134:aload           6
		//*  55  136:invokevirtual   #81  <Method boolean JavaType.isFinal()>
		//*  56  139:ifne            157
		//*  57  142:ldc1            #68  <Class TreeNode>
		//*  58  144:aload           6
		//*  59  146:invokevirtual   #72  <Method Class JavaType.getRawClass()>
		//*  60  149:invokevirtual   #78  <Method boolean Class.isAssignableFrom(Class)>
		//*  61  152:ifne            157
		//*  62  155:iload_2         
		//*  63  156:ireturn         
				flag = false;
		//   64  157:iconst_0        
		//   65  158:istore_2        
			return flag;
		//*  66  159:goto            155
		}

		private static final long serialVersionUID = 1L;
		protected final DefaultTyping _appliesFor;

		public DefaultTypeResolverBuilder(DefaultTyping defaulttyping)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void StdTypeResolverBuilder()>
			_appliesFor = defaulttyping;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #22  <Field ObjectMapper$DefaultTyping _appliesFor>
		//    5    9:return          
		}
	}

	public static final class DefaultTyping extends Enum
	{

		public static DefaultTyping valueOf(String s)
		{
			return (DefaultTyping)Enum.valueOf(com/fasterxml/jackson/databind/ObjectMapper$DefaultTyping, s);
		//    0    0:ldc1            #2   <Class ObjectMapper$DefaultTyping>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class ObjectMapper$DefaultTyping>
		//    4    9:areturn         
		}

		public static DefaultTyping[] values()
		{
			return (DefaultTyping[])((DefaultTyping []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field ObjectMapper$DefaultTyping[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.fasterxml.jackson.databind.ObjectMapper$DefaultTyping_3B_.clone()>
		//    2    6:checkcast       #46  <Class ObjectMapper$DefaultTyping[]>
		//    3    9:areturn         
		}

		private static final DefaultTyping $VALUES[];
		public static final DefaultTyping JAVA_LANG_OBJECT;
		public static final DefaultTyping NON_CONCRETE_AND_ARRAYS;
		public static final DefaultTyping NON_FINAL;
		public static final DefaultTyping OBJECT_AND_NON_CONCRETE;

		static 
		{
			JAVA_LANG_OBJECT = new DefaultTyping("JAVA_LANG_OBJECT", 0);
		//    0    0:new             #2   <Class ObjectMapper$DefaultTyping>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "JAVA_LANG_OBJECT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void ObjectMapper$DefaultTyping(String, int)>
		//    5   10:putstatic       #24  <Field ObjectMapper$DefaultTyping JAVA_LANG_OBJECT>
			OBJECT_AND_NON_CONCRETE = new DefaultTyping("OBJECT_AND_NON_CONCRETE", 1);
		//    6   13:new             #2   <Class ObjectMapper$DefaultTyping>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "OBJECT_AND_NON_CONCRETE">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void ObjectMapper$DefaultTyping(String, int)>
		//   11   23:putstatic       #27  <Field ObjectMapper$DefaultTyping OBJECT_AND_NON_CONCRETE>
			NON_CONCRETE_AND_ARRAYS = new DefaultTyping("NON_CONCRETE_AND_ARRAYS", 2);
		//   12   26:new             #2   <Class ObjectMapper$DefaultTyping>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "NON_CONCRETE_AND_ARRAYS">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void ObjectMapper$DefaultTyping(String, int)>
		//   17   36:putstatic       #30  <Field ObjectMapper$DefaultTyping NON_CONCRETE_AND_ARRAYS>
			NON_FINAL = new DefaultTyping("NON_FINAL", 3);
		//   18   39:new             #2   <Class ObjectMapper$DefaultTyping>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "NON_FINAL">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void ObjectMapper$DefaultTyping(String, int)>
		//   23   49:putstatic       #33  <Field ObjectMapper$DefaultTyping NON_FINAL>
			$VALUES = (new DefaultTyping[] {
				JAVA_LANG_OBJECT, OBJECT_AND_NON_CONCRETE, NON_CONCRETE_AND_ARRAYS, NON_FINAL
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       DefaultTyping[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field ObjectMapper$DefaultTyping JAVA_LANG_OBJECT>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field ObjectMapper$DefaultTyping OBJECT_AND_NON_CONCRETE>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field ObjectMapper$DefaultTyping NON_CONCRETE_AND_ARRAYS>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field ObjectMapper$DefaultTyping NON_FINAL>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field ObjectMapper$DefaultTyping[] $VALUES>
		//*  43   83:return          
		}

		private DefaultTyping(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public ObjectMapper()
	{
		this(((JsonFactory) (null)), ((DefaultSerializerProvider) (null)), ((DefaultDeserializationContext) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #126 <Method void ObjectMapper(JsonFactory, DefaultSerializerProvider, DefaultDeserializationContext)>
	//    5    7:return          
	}

	public ObjectMapper(JsonFactory jsonfactory)
	{
		this(jsonfactory, ((DefaultSerializerProvider) (null)), ((DefaultDeserializationContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:aconst_null     
	//    4    4:invokespecial   #126 <Method void ObjectMapper(JsonFactory, DefaultSerializerProvider, DefaultDeserializationContext)>
	//    5    7:return          
	}

	public ObjectMapper(JsonFactory jsonfactory, DefaultSerializerProvider defaultserializerprovider, DefaultDeserializationContext defaultdeserializationcontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method void ObjectCodec()>
		_rootDeserializers = new ConcurrentHashMap(64, 0.6F, 2);
	//    2    4:aload_0         
	//    3    5:new             #130 <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:bipush          64
	//    6   11:ldc1            #131 <Float 0.6F>
	//    7   13:iconst_2        
	//    8   14:invokespecial   #134 <Method void ConcurrentHashMap(int, float, int)>
	//    9   17:putfield        #136 <Field ConcurrentHashMap _rootDeserializers>
		if(jsonfactory != null) goto _L2; else goto _L1
	//   10   20:aload_1         
	//   11   21:ifnonnull       214
_L1:
		_jsonFactory = ((JsonFactory) (new MappingJsonFactory(this)));
	//   12   24:aload_0         
	//   13   25:new             #138 <Class MappingJsonFactory>
	//   14   28:dup             
	//   15   29:aload_0         
	//   16   30:invokespecial   #141 <Method void MappingJsonFactory(ObjectMapper)>
	//   17   33:putfield        #143 <Field JsonFactory _jsonFactory>
_L4:
		_subtypeResolver = ((SubtypeResolver) (new StdSubtypeResolver()));
	//   18   36:aload_0         
	//   19   37:new             #145 <Class StdSubtypeResolver>
	//   20   40:dup             
	//   21   41:invokespecial   #146 <Method void StdSubtypeResolver()>
	//   22   44:putfield        #148 <Field SubtypeResolver _subtypeResolver>
		jsonfactory = ((JsonFactory) (new RootNameLookup()));
	//   23   47:new             #150 <Class RootNameLookup>
	//   24   50:dup             
	//   25   51:invokespecial   #151 <Method void RootNameLookup()>
	//   26   54:astore_1        
		_typeFactory = TypeFactory.defaultInstance();
	//   27   55:aload_0         
	//   28   56:invokestatic    #99  <Method TypeFactory TypeFactory.defaultInstance()>
	//   29   59:putfield        #153 <Field TypeFactory _typeFactory>
		SimpleMixInResolver simplemixinresolver = new SimpleMixInResolver(((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (null)));
	//   30   62:new             #155 <Class SimpleMixInResolver>
	//   31   65:dup             
	//   32   66:aconst_null     
	//   33   67:invokespecial   #158 <Method void SimpleMixInResolver(com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//   34   70:astore          5
		_mixIns = simplemixinresolver;
	//   35   72:aload_0         
	//   36   73:aload           5
	//   37   75:putfield        #160 <Field SimpleMixInResolver _mixIns>
		BaseSettings basesettings = DEFAULT_BASE.withClassIntrospector(defaultClassIntrospector());
	//   38   78:getstatic       #122 <Field BaseSettings DEFAULT_BASE>
	//   39   81:aload_0         
	//   40   82:invokevirtual   #164 <Method ClassIntrospector defaultClassIntrospector()>
	//   41   85:invokevirtual   #168 <Method BaseSettings BaseSettings.withClassIntrospector(ClassIntrospector)>
	//   42   88:astore          6
		_serializationConfig = new SerializationConfig(basesettings, _subtypeResolver, simplemixinresolver, ((RootNameLookup) (jsonfactory)));
	//   43   90:aload_0         
	//   44   91:new             #170 <Class SerializationConfig>
	//   45   94:dup             
	//   46   95:aload           6
	//   47   97:aload_0         
	//   48   98:getfield        #148 <Field SubtypeResolver _subtypeResolver>
	//   49  101:aload           5
	//   50  103:aload_1         
	//   51  104:invokespecial   #173 <Method void SerializationConfig(BaseSettings, SubtypeResolver, SimpleMixInResolver, RootNameLookup)>
	//   52  107:putfield        #175 <Field SerializationConfig _serializationConfig>
		_deserializationConfig = new DeserializationConfig(basesettings, _subtypeResolver, simplemixinresolver, ((RootNameLookup) (jsonfactory)));
	//   53  110:aload_0         
	//   54  111:new             #177 <Class DeserializationConfig>
	//   55  114:dup             
	//   56  115:aload           6
	//   57  117:aload_0         
	//   58  118:getfield        #148 <Field SubtypeResolver _subtypeResolver>
	//   59  121:aload           5
	//   60  123:aload_1         
	//   61  124:invokespecial   #178 <Method void DeserializationConfig(BaseSettings, SubtypeResolver, SimpleMixInResolver, RootNameLookup)>
	//   62  127:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		boolean flag = _jsonFactory.requiresPropertyOrdering();
	//   63  130:aload_0         
	//   64  131:getfield        #143 <Field JsonFactory _jsonFactory>
	//   65  134:invokevirtual   #186 <Method boolean JsonFactory.requiresPropertyOrdering()>
	//   66  137:istore          4
		if(_serializationConfig.isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY) ^ flag)
	//*  67  139:aload_0         
	//*  68  140:getfield        #175 <Field SerializationConfig _serializationConfig>
	//*  69  143:getstatic       #192 <Field MapperFeature MapperFeature.SORT_PROPERTIES_ALPHABETICALLY>
	//*  70  146:invokevirtual   #196 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//*  71  149:iload           4
	//*  72  151:ixor            
	//*  73  152:ifeq            165
			configure(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY, flag);
	//   74  155:aload_0         
	//   75  156:getstatic       #192 <Field MapperFeature MapperFeature.SORT_PROPERTIES_ALPHABETICALLY>
	//   76  159:iload           4
	//   77  161:invokevirtual   #200 <Method ObjectMapper configure(MapperFeature, boolean)>
	//   78  164:pop             
		jsonfactory = ((JsonFactory) (defaultserializerprovider));
	//   79  165:aload_2         
	//   80  166:astore_1        
		if(defaultserializerprovider == null)
	//*  81  167:aload_2         
	//*  82  168:ifnonnull       179
			jsonfactory = ((JsonFactory) (new com.fasterxml.jackson.databind.ser.DefaultSerializerProvider.Impl()));
	//   83  171:new             #202 <Class com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl>
	//   84  174:dup             
	//   85  175:invokespecial   #203 <Method void com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl()>
	//   86  178:astore_1        
		_serializerProvider = ((DefaultSerializerProvider) (jsonfactory));
	//   87  179:aload_0         
	//   88  180:aload_1         
	//   89  181:putfield        #205 <Field DefaultSerializerProvider _serializerProvider>
		jsonfactory = ((JsonFactory) (defaultdeserializationcontext));
	//   90  184:aload_3         
	//   91  185:astore_1        
		if(defaultdeserializationcontext == null)
	//*  92  186:aload_3         
	//*  93  187:ifnonnull       201
			jsonfactory = ((JsonFactory) (new com.fasterxml.jackson.databind.deser.DefaultDeserializationContext.Impl(((DeserializerFactory) (BeanDeserializerFactory.instance)))));
	//   94  190:new             #207 <Class com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl>
	//   95  193:dup             
	//   96  194:getstatic       #212 <Field BeanDeserializerFactory BeanDeserializerFactory.instance>
	//   97  197:invokespecial   #215 <Method void com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl(DeserializerFactory)>
	//   98  200:astore_1        
		_deserializationContext = ((DefaultDeserializationContext) (jsonfactory));
	//   99  201:aload_0         
	//  100  202:aload_1         
	//  101  203:putfield        #217 <Field DefaultDeserializationContext _deserializationContext>
		_serializerFactory = ((SerializerFactory) (BeanSerializerFactory.instance));
	//  102  206:aload_0         
	//  103  207:getstatic       #222 <Field BeanSerializerFactory BeanSerializerFactory.instance>
	//  104  210:putfield        #224 <Field SerializerFactory _serializerFactory>
		return;
	//  105  213:return          
_L2:
		_jsonFactory = jsonfactory;
	//  106  214:aload_0         
	//  107  215:aload_1         
	//  108  216:putfield        #143 <Field JsonFactory _jsonFactory>
		if(jsonfactory.getCodec() == null)
	//* 109  219:aload_1         
	//* 110  220:invokevirtual   #228 <Method ObjectCodec JsonFactory.getCodec()>
	//* 111  223:ifnonnull       36
			_jsonFactory.setCodec(((ObjectCodec) (this)));
	//  112  226:aload_0         
	//  113  227:getfield        #143 <Field JsonFactory _jsonFactory>
	//  114  230:aload_0         
	//  115  231:invokevirtual   #232 <Method JsonFactory JsonFactory.setCodec(ObjectCodec)>
	//  116  234:pop             
		if(true) goto _L4; else goto _L3
	//  117  235:goto            36
_L3:
	}

	protected ObjectMapper(ObjectMapper objectmapper)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #128 <Method void ObjectCodec()>
		_rootDeserializers = new ConcurrentHashMap(64, 0.6F, 2);
	//    2    4:aload_0         
	//    3    5:new             #130 <Class ConcurrentHashMap>
	//    4    8:dup             
	//    5    9:bipush          64
	//    6   11:ldc1            #131 <Float 0.6F>
	//    7   13:iconst_2        
	//    8   14:invokespecial   #134 <Method void ConcurrentHashMap(int, float, int)>
	//    9   17:putfield        #136 <Field ConcurrentHashMap _rootDeserializers>
		_jsonFactory = objectmapper._jsonFactory.copy();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:getfield        #143 <Field JsonFactory _jsonFactory>
	//   13   25:invokevirtual   #236 <Method JsonFactory JsonFactory.copy()>
	//   14   28:putfield        #143 <Field JsonFactory _jsonFactory>
		_jsonFactory.setCodec(((ObjectCodec) (this)));
	//   15   31:aload_0         
	//   16   32:getfield        #143 <Field JsonFactory _jsonFactory>
	//   17   35:aload_0         
	//   18   36:invokevirtual   #232 <Method JsonFactory JsonFactory.setCodec(ObjectCodec)>
	//   19   39:pop             
		_subtypeResolver = objectmapper._subtypeResolver;
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:getfield        #148 <Field SubtypeResolver _subtypeResolver>
	//   23   45:putfield        #148 <Field SubtypeResolver _subtypeResolver>
		_typeFactory = objectmapper._typeFactory;
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:getfield        #153 <Field TypeFactory _typeFactory>
	//   27   53:putfield        #153 <Field TypeFactory _typeFactory>
		_injectableValues = objectmapper._injectableValues;
	//   28   56:aload_0         
	//   29   57:aload_1         
	//   30   58:getfield        #238 <Field InjectableValues _injectableValues>
	//   31   61:putfield        #238 <Field InjectableValues _injectableValues>
		SimpleMixInResolver simplemixinresolver = objectmapper._mixIns.copy();
	//   32   64:aload_1         
	//   33   65:getfield        #160 <Field SimpleMixInResolver _mixIns>
	//   34   68:invokevirtual   #241 <Method SimpleMixInResolver SimpleMixInResolver.copy()>
	//   35   71:astore_2        
		_mixIns = simplemixinresolver;
	//   36   72:aload_0         
	//   37   73:aload_2         
	//   38   74:putfield        #160 <Field SimpleMixInResolver _mixIns>
		RootNameLookup rootnamelookup = new RootNameLookup();
	//   39   77:new             #150 <Class RootNameLookup>
	//   40   80:dup             
	//   41   81:invokespecial   #151 <Method void RootNameLookup()>
	//   42   84:astore_3        
		_serializationConfig = new SerializationConfig(objectmapper._serializationConfig, simplemixinresolver, rootnamelookup);
	//   43   85:aload_0         
	//   44   86:new             #170 <Class SerializationConfig>
	//   45   89:dup             
	//   46   90:aload_1         
	//   47   91:getfield        #175 <Field SerializationConfig _serializationConfig>
	//   48   94:aload_2         
	//   49   95:aload_3         
	//   50   96:invokespecial   #244 <Method void SerializationConfig(SerializationConfig, SimpleMixInResolver, RootNameLookup)>
	//   51   99:putfield        #175 <Field SerializationConfig _serializationConfig>
		_deserializationConfig = new DeserializationConfig(objectmapper._deserializationConfig, simplemixinresolver, rootnamelookup);
	//   52  102:aload_0         
	//   53  103:new             #177 <Class DeserializationConfig>
	//   54  106:dup             
	//   55  107:aload_1         
	//   56  108:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//   57  111:aload_2         
	//   58  112:aload_3         
	//   59  113:invokespecial   #247 <Method void DeserializationConfig(DeserializationConfig, SimpleMixInResolver, RootNameLookup)>
	//   60  116:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializerProvider = objectmapper._serializerProvider.copy();
	//   61  119:aload_0         
	//   62  120:aload_1         
	//   63  121:getfield        #205 <Field DefaultSerializerProvider _serializerProvider>
	//   64  124:invokevirtual   #252 <Method DefaultSerializerProvider DefaultSerializerProvider.copy()>
	//   65  127:putfield        #205 <Field DefaultSerializerProvider _serializerProvider>
		_deserializationContext = objectmapper._deserializationContext.copy();
	//   66  130:aload_0         
	//   67  131:aload_1         
	//   68  132:getfield        #217 <Field DefaultDeserializationContext _deserializationContext>
	//   69  135:invokevirtual   #257 <Method DefaultDeserializationContext DefaultDeserializationContext.copy()>
	//   70  138:putfield        #217 <Field DefaultDeserializationContext _deserializationContext>
		_serializerFactory = objectmapper._serializerFactory;
	//   71  141:aload_0         
	//   72  142:aload_1         
	//   73  143:getfield        #224 <Field SerializerFactory _serializerFactory>
	//   74  146:putfield        #224 <Field SerializerFactory _serializerFactory>
		objectmapper = ((ObjectMapper) (objectmapper._registeredModuleTypes));
	//   75  149:aload_1         
	//   76  150:getfield        #259 <Field Set _registeredModuleTypes>
	//   77  153:astore_1        
		if(objectmapper == null)
	//*  78  154:aload_1         
	//*  79  155:ifnonnull       164
		{
			_registeredModuleTypes = null;
	//   80  158:aload_0         
	//   81  159:aconst_null     
	//   82  160:putfield        #259 <Field Set _registeredModuleTypes>
			return;
	//   83  163:return          
		} else
		{
			_registeredModuleTypes = ((Set) (new LinkedHashSet(((Collection) (objectmapper)))));
	//   84  164:aload_0         
	//   85  165:new             #261 <Class LinkedHashSet>
	//   86  168:dup             
	//   87  169:aload_1         
	//   88  170:invokespecial   #264 <Method void LinkedHashSet(Collection)>
	//   89  173:putfield        #259 <Field Set _registeredModuleTypes>
			return;
	//   90  176:return          
		}
	}

	private final void _configAndWriteCloseable(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
		throws IOException
	{
		Closeable closeable;
		Object obj1;
		Closeable closeable1;
		closeable1 = (Closeable)obj;
	//    0    0:aload_2         
	//    1    1:checkcast       #270 <Class Closeable>
	//    2    4:astore          6
		closeable = closeable1;
	//    3    6:aload           6
	//    4    8:astore          4
		obj1 = ((Object) (jsongenerator));
	//    5   10:aload_1         
	//    6   11:astore          5
		_serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
	//    7   13:aload_0         
	//    8   14:aload_3         
	//    9   15:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #277 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		obj = null;
	//   13   23:aconst_null     
	//   14   24:astore_2        
		closeable = closeable1;
	//   15   25:aload           6
	//   16   27:astore          4
		obj1 = obj;
	//   17   29:aload_2         
	//   18   30:astore          5
		jsongenerator.close();
	//   19   32:aload_1         
	//   20   33:invokevirtual   #282 <Method void JsonGenerator.close()>
		closeable = null;
	//   21   36:aconst_null     
	//   22   37:astore          4
		obj1 = obj;
	//   23   39:aload_2         
	//   24   40:astore          5
		closeable1.close();
	//   25   42:aload           6
	//   26   44:invokeinterface #283 <Method void Closeable.close()>
		if(false)
	//*  27   49:iconst_0        
	//*  28   50:ifeq            65
		{
			jsongenerator = ((JsonGenerator) (com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT));
	//   29   53:getstatic       #289 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   30   56:astore_1        
			throw new NullPointerException();
	//   31   57:new             #291 <Class NullPointerException>
	//   32   60:dup             
	//   33   61:invokespecial   #292 <Method void NullPointerException()>
	//   34   64:athrow          
		}
		if(true)
			break MISSING_BLOCK_LABEL_77;
	//   35   65:iconst_0        
	//   36   66:ifeq            77
		throw new NullPointerException();
	//   37   69:new             #291 <Class NullPointerException>
	//   38   72:dup             
	//   39   73:invokespecial   #292 <Method void NullPointerException()>
	//   40   76:athrow          
		return;
	//   41   77:return          
		jsongenerator;
	//   42   78:astore_1        
		if(obj1 != null)
	//*  43   79:aload           5
	//*  44   81:ifnull          98
		{
			((JsonGenerator) (obj1)).disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//   45   84:aload           5
	//   46   86:getstatic       #289 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   47   89:invokevirtual   #296 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   48   92:pop             
			try
			{
				((JsonGenerator) (obj1)).close();
	//   49   93:aload           5
	//   50   95:invokevirtual   #282 <Method void JsonGenerator.close()>
			}
	//*  51   98:aload           4
	//*  52  100:ifnull          110
	//*  53  103:aload           4
	//*  54  105:invokeinterface #283 <Method void Closeable.close()>
	//*  55  110:aload_1         
	//*  56  111:athrow          
	//*  57  112:astore_1        
	//*  58  113:return          
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   59  114:astore_2        
		}
		if(closeable != null)
			try
			{
				closeable.close();
			}
	//*  60  115:goto            98
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   61  118:astore_2        
		throw jsongenerator;
		jsongenerator;
	//*  62  119:goto            110
	}

	private final void _writeCloseableValue(JsonGenerator jsongenerator, Object obj, SerializationConfig serializationconfig)
		throws IOException
	{
		Closeable closeable;
		Closeable closeable1;
		closeable1 = (Closeable)obj;
	//    0    0:aload_2         
	//    1    1:checkcast       #270 <Class Closeable>
	//    2    4:astore          5
		closeable = closeable1;
	//    3    6:aload           5
	//    4    8:astore          4
		_serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
	//    5   10:aload_0         
	//    6   11:aload_3         
	//    7   12:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    8   15:aload_1         
	//    9   16:aload_2         
	//   10   17:invokevirtual   #277 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		closeable = closeable1;
	//   11   20:aload           5
	//   12   22:astore          4
		if(!serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
			break MISSING_BLOCK_LABEL_42;
	//   13   24:aload_3         
	//   14   25:getstatic       #304 <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//   15   28:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   16   31:ifeq            42
		closeable = closeable1;
	//   17   34:aload           5
	//   18   36:astore          4
		jsongenerator.flush();
	//   19   38:aload_1         
	//   20   39:invokevirtual   #310 <Method void JsonGenerator.flush()>
		closeable = null;
	//   21   42:aconst_null     
	//   22   43:astore          4
		closeable1.close();
	//   23   45:aload           5
	//   24   47:invokeinterface #283 <Method void Closeable.close()>
		if(true)
			break MISSING_BLOCK_LABEL_64;
	//   25   52:iconst_0        
	//   26   53:ifeq            64
		throw new NullPointerException();
	//   27   56:new             #291 <Class NullPointerException>
	//   28   59:dup             
	//   29   60:invokespecial   #292 <Method void NullPointerException()>
	//   30   63:athrow          
		return;
	//   31   64:return          
		jsongenerator;
	//   32   65:astore_1        
		if(closeable != null)
	//*  33   66:aload           4
	//*  34   68:ifnull          78
			try
			{
				closeable.close();
	//   35   71:aload           4
	//   36   73:invokeinterface #283 <Method void Closeable.close()>
			}
	//*  37   78:aload_1         
	//*  38   79:athrow          
	//*  39   80:astore_1        
	//*  40   81:return          
			// Misplaced declaration of an exception variable
			catch(Object obj) { }
	//   41   82:astore_2        
		throw jsongenerator;
		jsongenerator;
	//*  42   83:goto            78
	}

	public static List findModules()
	{
		return findModules(((ClassLoader) (null)));
	//    0    0:aconst_null     
	//    1    1:invokestatic    #315 <Method List findModules(ClassLoader)>
	//    2    4:areturn         
	}

	public static List findModules(ClassLoader classloader)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #319 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #320 <Method void ArrayList()>
	//    3    7:astore_1        
		if(classloader == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       50
			classloader = ((ClassLoader) (ServiceLoader.load(com/fasterxml/jackson/databind/Module)));
	//    6   12:ldc2            #322 <Class Module>
	//    7   15:invokestatic    #328 <Method ServiceLoader ServiceLoader.load(Class)>
	//    8   18:astore_0        
		else
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #332 <Method Iterator ServiceLoader.iterator()>
	//*  11   23:astore_0        
	//*  12   24:aload_0         
	//*  13   25:invokeinterface #337 <Method boolean Iterator.hasNext()>
	//*  14   30:ifeq            61
	//*  15   33:aload_1         
	//*  16   34:aload_0         
	//*  17   35:invokeinterface #341 <Method Object Iterator.next()>
	//*  18   40:checkcast       #322 <Class Module>
	//*  19   43:invokevirtual   #345 <Method boolean ArrayList.add(Object)>
	//*  20   46:pop             
	//*  21   47:goto            24
			classloader = ((ClassLoader) (ServiceLoader.load(com/fasterxml/jackson/databind/Module, classloader)));
	//   22   50:ldc2            #322 <Class Module>
	//   23   53:aload_0         
	//   24   54:invokestatic    #348 <Method ServiceLoader ServiceLoader.load(Class, ClassLoader)>
	//   25   57:astore_0        
		for(classloader = ((ClassLoader) (((ServiceLoader) (classloader)).iterator())); ((Iterator) (classloader)).hasNext(); arraylist.add(((Object) ((Module)((Iterator) (classloader)).next()))));
	//*  26   58:goto            19
		return ((List) (arraylist));
	//   27   61:aload_1         
	//   28   62:areturn         
	}

	protected void _checkInvalidCopy(Class class1)
	{
		if(((Object)this).getClass() != class1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #357 <Method Class Object.getClass()>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       61
			throw new IllegalStateException((new StringBuilder()).append("Failed copy(): ").append(((Object)this).getClass().getName()).append(" (version: ").append(((Object) (version()))).append(") does not override copy(); it has to").toString());
	//    4    8:new             #359 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #361 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #362 <Method void StringBuilder()>
	//    9   19:ldc2            #364 <String "Failed copy(): ">
	//   10   22:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:aload_0         
	//   12   26:invokevirtual   #357 <Method Class Object.getClass()>
	//   13   29:invokevirtual   #374 <Method String Class.getName()>
	//   14   32:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   15   35:ldc2            #376 <String " (version: ">
	//   16   38:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   17   41:aload_0         
	//   18   42:invokevirtual   #380 <Method Version version()>
	//   19   45:invokevirtual   #383 <Method StringBuilder StringBuilder.append(Object)>
	//   20   48:ldc2            #385 <String ") does not override copy(); it has to">
	//   21   51:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   22   54:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   23   57:invokespecial   #391 <Method void IllegalStateException(String)>
	//   24   60:athrow          
		else
			return;
	//   25   61:return          
	}

	protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj)
		throws IOException
	{
		SerializationConfig serializationconfig;
		serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore          4
		serializationconfig.initialize(jsongenerator);
	//    3    6:aload           4
	//    4    8:aload_1         
	//    5    9:invokevirtual   #401 <Method void SerializationConfig.initialize(JsonGenerator)>
		if(!serializationconfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) goto _L2; else goto _L1
	//    6   12:aload           4
	//    7   14:getstatic       #404 <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//    8   17:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    9   20:ifeq            39
	//   10   23:aload_2         
	//   11   24:instanceof      #270 <Class Closeable>
	//   12   27:ifeq            39
_L1:
		_configAndWriteCloseable(jsongenerator, obj, serializationconfig);
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:aload_2         
	//   16   33:aload           4
	//   17   35:invokespecial   #406 <Method void _configAndWriteCloseable(JsonGenerator, Object, SerializationConfig)>
_L4:
		return;
	//   18   38:return          
_L2:
		boolean flag = false;
	//   19   39:iconst_0        
	//   20   40:istore_3        
		_serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
	//   21   41:aload_0         
	//   22   42:aload           4
	//   23   44:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   24   47:aload_1         
	//   25   48:aload_2         
	//   26   49:invokevirtual   #277 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		flag = true;
	//   27   52:iconst_1        
	//   28   53:istore_3        
		jsongenerator.close();
	//   29   54:aload_1         
	//   30   55:invokevirtual   #282 <Method void JsonGenerator.close()>
		if(true) goto _L4; else goto _L3
	//   31   58:iconst_1        
	//   32   59:ifne            38
_L3:
		jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//   33   62:aload_1         
	//   34   63:getstatic       #289 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   35   66:invokevirtual   #296 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   36   69:pop             
		try
		{
			jsongenerator.close();
	//   37   70:aload_1         
	//   38   71:invokevirtual   #282 <Method void JsonGenerator.close()>
			return;
	//   39   74:return          
		}
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//*  40   75:astore_1        
		{
			return;
	//   41   76:return          
		}
		obj;
	//   42   77:astore_2        
		if(!flag)
	//*  43   78:iload_3         
	//*  44   79:ifne            94
		{
			jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//   45   82:aload_1         
	//   46   83:getstatic       #289 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   47   86:invokevirtual   #296 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   48   89:pop             
			try
			{
				jsongenerator.close();
	//   49   90:aload_1         
	//   50   91:invokevirtual   #282 <Method void JsonGenerator.close()>
			}
	//*  51   94:aload_2         
	//*  52   95:athrow          
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator) { }
	//   53   96:astore_1        
		}
		throw obj;
	//*  54   97:goto            94
	}

	protected final void _configAndWriteValue(JsonGenerator jsongenerator, Object obj, Class class1)
		throws IOException
	{
		class1 = ((Class) (getSerializationConfig().withView(class1)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:aload_3         
	//    3    5:invokevirtual   #411 <Method SerializationConfig SerializationConfig.withView(Class)>
	//    4    8:astore_3        
		((SerializationConfig) (class1)).initialize(jsongenerator);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #401 <Method void SerializationConfig.initialize(JsonGenerator)>
		if(!((SerializationConfig) (class1)).isEnabled(SerializationFeature.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) goto _L2; else goto _L1
	//    8   14:aload_3         
	//    9   15:getstatic       #404 <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//   10   18:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//   11   21:ifeq            39
	//   12   24:aload_2         
	//   13   25:instanceof      #270 <Class Closeable>
	//   14   28:ifeq            39
_L1:
		_configAndWriteCloseable(jsongenerator, obj, ((SerializationConfig) (class1)));
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:aload_3         
	//   19   35:invokespecial   #406 <Method void _configAndWriteCloseable(JsonGenerator, Object, SerializationConfig)>
_L4:
		return;
	//   20   38:return          
_L2:
		boolean flag = false;
	//   21   39:iconst_0        
	//   22   40:istore          4
		_serializerProvider(((SerializationConfig) (class1))).serializeValue(jsongenerator, obj);
	//   23   42:aload_0         
	//   24   43:aload_3         
	//   25   44:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   26   47:aload_1         
	//   27   48:aload_2         
	//   28   49:invokevirtual   #277 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		flag = true;
	//   29   52:iconst_1        
	//   30   53:istore          4
		jsongenerator.close();
	//   31   55:aload_1         
	//   32   56:invokevirtual   #282 <Method void JsonGenerator.close()>
		if(true) goto _L4; else goto _L3
	//   33   59:iconst_1        
	//   34   60:ifne            38
_L3:
		jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//   35   63:aload_1         
	//   36   64:getstatic       #289 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   37   67:invokevirtual   #296 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   38   70:pop             
		try
		{
			jsongenerator.close();
	//   39   71:aload_1         
	//   40   72:invokevirtual   #282 <Method void JsonGenerator.close()>
			return;
	//   41   75:return          
		}
		// Misplaced declaration of an exception variable
		catch(JsonGenerator jsongenerator)
	//*  42   76:astore_1        
		{
			return;
	//   43   77:return          
		}
		obj;
	//   44   78:astore_2        
		if(!flag)
	//*  45   79:iload           4
	//*  46   81:ifne            96
		{
			jsongenerator.disable(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT);
	//   47   84:aload_1         
	//   48   85:getstatic       #289 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.AUTO_CLOSE_JSON_CONTENT>
	//   49   88:invokevirtual   #296 <Method JsonGenerator JsonGenerator.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   50   91:pop             
			try
			{
				jsongenerator.close();
	//   51   92:aload_1         
	//   52   93:invokevirtual   #282 <Method void JsonGenerator.close()>
			}
	//*  53   96:aload_2         
	//*  54   97:athrow          
			// Misplaced declaration of an exception variable
			catch(JsonGenerator jsongenerator) { }
	//   55   98:astore_1        
		}
		throw obj;
	//*  56   99:goto            96
	}

	protected Object _convert(Object obj, JavaType javatype)
		throws IllegalArgumentException
	{
		Object obj1;
		obj1 = ((Object) (javatype.getRawClass()));
	//    0    0:aload_2         
	//    1    1:invokevirtual   #422 <Method Class JavaType.getRawClass()>
	//    2    4:astore_3        
		if(obj1 != java/lang/Object && !javatype.hasGenericTypes() && ((Class) (obj1)).isAssignableFrom(obj.getClass()))
	//*   3    5:aload_3         
	//*   4    6:ldc2            #353 <Class Object>
	//*   5    9:if_acmpeq       32
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #425 <Method boolean JavaType.hasGenericTypes()>
	//*   8   16:ifne            32
	//*   9   19:aload_3         
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #357 <Method Class Object.getClass()>
	//*  12   24:invokevirtual   #429 <Method boolean Class.isAssignableFrom(Class)>
	//*  13   27:ifeq            32
			return obj;
	//   14   30:aload_1         
	//   15   31:areturn         
		TokenBuffer tokenbuffer = new TokenBuffer(((ObjectCodec) (this)), false);
	//   16   32:new             #431 <Class TokenBuffer>
	//   17   35:dup             
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:invokespecial   #434 <Method void TokenBuffer(ObjectCodec, boolean)>
	//   21   41:astore          4
		obj1 = ((Object) (tokenbuffer));
	//   22   43:aload           4
	//   23   45:astore_3        
		if(isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  24   46:aload_0         
	//*  25   47:getstatic       #440 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  26   50:invokevirtual   #443 <Method boolean isEnabled(DeserializationFeature)>
	//*  27   53:ifeq            63
			obj1 = ((Object) (tokenbuffer.forceUseOfBigDecimal(true)));
	//   28   56:aload           4
	//   29   58:iconst_1        
	//   30   59:invokevirtual   #447 <Method TokenBuffer TokenBuffer.forceUseOfBigDecimal(boolean)>
	//   31   62:astore_3        
		JsonToken jsontoken;
		_serializerProvider(getSerializationConfig().without(SerializationFeature.WRAP_ROOT_VALUE)).serializeValue(((JsonGenerator) (obj1)), obj);
	//   32   63:aload_0         
	//   33   64:aload_0         
	//   34   65:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//   35   68:getstatic       #450 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//   36   71:invokevirtual   #454 <Method SerializationConfig SerializationConfig.without(SerializationFeature)>
	//   37   74:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   38   77:aload_3         
	//   39   78:aload_1         
	//   40   79:invokevirtual   #277 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		obj1 = ((Object) (((TokenBuffer) (obj1)).asParser()));
	//   41   82:aload_3         
	//   42   83:invokevirtual   #458 <Method JsonParser TokenBuffer.asParser()>
	//   43   86:astore_3        
		obj = ((Object) (getDeserializationConfig()));
	//   44   87:aload_0         
	//   45   88:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//   46   91:astore_1        
		jsontoken = _initForReading(((JsonParser) (obj1)));
	//   47   92:aload_0         
	//   48   93:aload_3         
	//   49   94:invokevirtual   #466 <Method JsonToken _initForReading(JsonParser)>
	//   50   97:astore          4
		if(jsontoken != JsonToken.VALUE_NULL)
			break MISSING_BLOCK_LABEL_131;
	//   51   99:aload           4
	//   52  101:getstatic       #472 <Field JsonToken JsonToken.VALUE_NULL>
	//   53  104:if_acmpne       131
		obj = ((Object) (createDeserializationContext(((JsonParser) (obj1)), ((DeserializationConfig) (obj)))));
	//   54  107:aload_0         
	//   55  108:aload_3         
	//   56  109:aload_1         
	//   57  110:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//   58  113:astore_1        
		obj = _findRootDeserializer(((DeserializationContext) (obj)), javatype).getNullValue(((DeserializationContext) (obj)));
	//   59  114:aload_0         
	//   60  115:aload_1         
	//   61  116:aload_2         
	//   62  117:invokevirtual   #480 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   63  120:aload_1         
	//   64  121:invokevirtual   #486 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   65  124:astore_1        
_L1:
		((JsonParser) (obj1)).close();
	//   66  125:aload_3         
	//   67  126:invokevirtual   #489 <Method void JsonParser.close()>
		return obj;
	//   68  129:aload_1         
	//   69  130:areturn         
		if(jsontoken != JsonToken.END_ARRAY && jsontoken != JsonToken.END_OBJECT)
	//*  70  131:aload           4
	//*  71  133:getstatic       #492 <Field JsonToken JsonToken.END_ARRAY>
	//*  72  136:if_acmpeq       186
	//*  73  139:aload           4
	//*  74  141:getstatic       #495 <Field JsonToken JsonToken.END_OBJECT>
	//*  75  144:if_acmpne       150
	//*  76  147:goto            186
			try
			{
				obj = ((Object) (createDeserializationContext(((JsonParser) (obj1)), ((DeserializationConfig) (obj)))));
	//   77  150:aload_0         
	//   78  151:aload_3         
	//   79  152:aload_1         
	//   80  153:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//   81  156:astore_1        
				obj = _findRootDeserializer(((DeserializationContext) (obj)), javatype).deserialize(((JsonParser) (obj1)), ((DeserializationContext) (obj)));
	//   82  157:aload_0         
	//   83  158:aload_1         
	//   84  159:aload_2         
	//   85  160:invokevirtual   #480 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   86  163:aload_3         
	//   87  164:aload_1         
	//   88  165:invokevirtual   #499 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   89  168:astore_1        
			}
	//*  90  169:goto            125
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  91  172:astore_1        
			{
				throw new IllegalArgumentException(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
	//   92  173:new             #417 <Class IllegalArgumentException>
	//   93  176:dup             
	//   94  177:aload_1         
	//   95  178:invokevirtual   #502 <Method String IOException.getMessage()>
	//   96  181:aload_1         
	//   97  182:invokespecial   #505 <Method void IllegalArgumentException(String, Throwable)>
	//   98  185:athrow          
			}
		else
			obj = null;
	//   99  186:aconst_null     
	//  100  187:astore_1        
		  goto _L1
	//* 101  188:goto            125
	}

	protected PrettyPrinter _defaultPrettyPrinter()
	{
		return _serializationConfig.constructDefaultPrettyPrinter();
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    2    4:invokevirtual   #509 <Method PrettyPrinter SerializationConfig.constructDefaultPrettyPrinter()>
	//    3    7:areturn         
	}

	protected JsonDeserializer _findRootDeserializer(DeserializationContext deserializationcontext, JavaType javatype)
		throws JsonMappingException
	{
		JsonDeserializer jsondeserializer = (JsonDeserializer)_rootDeserializers.get(((Object) (javatype)));
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field ConcurrentHashMap _rootDeserializers>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #515 <Method Object ConcurrentHashMap.get(Object)>
	//    4    8:checkcast       #482 <Class JsonDeserializer>
	//    5   11:astore_3        
		if(jsondeserializer != null)
	//*   6   12:aload_3         
	//*   7   13:ifnull          18
			return jsondeserializer;
	//    8   16:aload_3         
	//    9   17:areturn         
		jsondeserializer = deserializationcontext.findRootValueDeserializer(javatype);
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #521 <Method JsonDeserializer DeserializationContext.findRootValueDeserializer(JavaType)>
	//   13   23:astore_3        
		if(jsondeserializer == null)
	//*  14   24:aload_3         
	//*  15   25:ifnonnull       53
		{
			throw JsonMappingException.from(deserializationcontext, (new StringBuilder()).append("Can not find a deserializer for type ").append(((Object) (javatype))).toString());
	//   16   28:aload_1         
	//   17   29:new             #361 <Class StringBuilder>
	//   18   32:dup             
	//   19   33:invokespecial   #362 <Method void StringBuilder()>
	//   20   36:ldc2            #523 <String "Can not find a deserializer for type ">
	//   21   39:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:aload_2         
	//   23   43:invokevirtual   #383 <Method StringBuilder StringBuilder.append(Object)>
	//   24   46:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   25   49:invokestatic    #527 <Method JsonMappingException JsonMappingException.from(DeserializationContext, String)>
	//   26   52:athrow          
		} else
		{
			_rootDeserializers.put(((Object) (javatype)), ((Object) (jsondeserializer)));
	//   27   53:aload_0         
	//   28   54:getfield        #136 <Field ConcurrentHashMap _rootDeserializers>
	//   29   57:aload_2         
	//   30   58:aload_3         
	//   31   59:invokevirtual   #531 <Method Object ConcurrentHashMap.put(Object, Object)>
	//   32   62:pop             
			return jsondeserializer;
	//   33   63:aload_3         
	//   34   64:areturn         
		}
	}

	protected JsonToken _initForReading(JsonParser jsonparser)
		throws IOException
	{
		_deserializationConfig.initialize(jsonparser);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #535 <Method void DeserializationConfig.initialize(JsonParser)>
		JsonToken jsontoken1 = jsonparser.getCurrentToken();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #539 <Method JsonToken JsonParser.getCurrentToken()>
	//    6   12:astore_3        
		JsonToken jsontoken = jsontoken1;
	//    7   13:aload_3         
	//    8   14:astore_2        
		if(jsontoken1 == null)
	//*   9   15:aload_3         
	//*  10   16:ifnonnull       38
		{
			JsonToken jsontoken2 = jsonparser.nextToken();
	//   11   19:aload_1         
	//   12   20:invokevirtual   #542 <Method JsonToken JsonParser.nextToken()>
	//   13   23:astore_3        
			jsontoken = jsontoken2;
	//   14   24:aload_3         
	//   15   25:astore_2        
			if(jsontoken2 == null)
	//*  16   26:aload_3         
	//*  17   27:ifnonnull       38
				throw JsonMappingException.from(jsonparser, "No content to map due to end-of-input");
	//   18   30:aload_1         
	//   19   31:ldc2            #544 <String "No content to map due to end-of-input">
	//   20   34:invokestatic    #547 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   21   37:athrow          
		}
		return jsontoken;
	//   22   38:aload_2         
	//   23   39:areturn         
	}

	protected ObjectReader _newReader(DeserializationConfig deserializationconfig)
	{
		return new ObjectReader(this, deserializationconfig);
	//    0    0:new             #551 <Class ObjectReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #554 <Method void ObjectReader(ObjectMapper, DeserializationConfig)>
	//    5    9:areturn         
	}

	protected ObjectReader _newReader(DeserializationConfig deserializationconfig, JavaType javatype, Object obj, FormatSchema formatschema, InjectableValues injectablevalues)
	{
		return new ObjectReader(this, deserializationconfig, javatype, obj, formatschema, injectablevalues);
	//    0    0:new             #551 <Class ObjectReader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:aload           4
	//    7   10:aload           5
	//    8   12:invokespecial   #558 <Method void ObjectReader(ObjectMapper, DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//    9   15:areturn         
	}

	protected ObjectWriter _newWriter(SerializationConfig serializationconfig)
	{
		return new ObjectWriter(this, serializationconfig);
	//    0    0:new             #562 <Class ObjectWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #565 <Method void ObjectWriter(ObjectMapper, SerializationConfig)>
	//    5    9:areturn         
	}

	protected ObjectWriter _newWriter(SerializationConfig serializationconfig, FormatSchema formatschema)
	{
		return new ObjectWriter(this, serializationconfig, formatschema);
	//    0    0:new             #562 <Class ObjectWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #569 <Method void ObjectWriter(ObjectMapper, SerializationConfig, FormatSchema)>
	//    6   10:areturn         
	}

	protected ObjectWriter _newWriter(SerializationConfig serializationconfig, JavaType javatype, PrettyPrinter prettyprinter)
	{
		return new ObjectWriter(this, serializationconfig, javatype, prettyprinter);
	//    0    0:new             #562 <Class ObjectWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #573 <Method void ObjectWriter(ObjectMapper, SerializationConfig, JavaType, PrettyPrinter)>
	//    7   11:areturn         
	}

	protected Object _readMapAndClose(JsonParser jsonparser, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		Object obj = ((Object) (_initForReading(jsonparser)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #466 <Method JsonToken _initForReading(JsonParser)>
	//    3    5:astore_3        
		if(obj != JsonToken.VALUE_NULL) goto _L2; else goto _L1
	//    4    6:aload_3         
	//    5    7:getstatic       #472 <Field JsonToken JsonToken.VALUE_NULL>
	//    6   10:if_acmpne       44
_L1:
		obj = ((Object) (createDeserializationContext(jsonparser, getDeserializationConfig())));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//   11   19:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//   12   22:astore_3        
		javatype = ((JavaType) (_findRootDeserializer(((DeserializationContext) (obj)), javatype).getNullValue(((DeserializationContext) (obj)))));
	//   13   23:aload_0         
	//   14   24:aload_3         
	//   15   25:aload_2         
	//   16   26:invokevirtual   #480 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   17   29:aload_3         
	//   18   30:invokevirtual   #486 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   19   33:astore_2        
_L3:
		jsonparser.clearCurrentToken();
	//   20   34:aload_1         
	//   21   35:invokevirtual   #580 <Method void JsonParser.clearCurrentToken()>
		DeserializationConfig deserializationconfig;
		JsonDeserializer jsondeserializer;
		try
		{
			jsonparser.close();
	//   22   38:aload_1         
	//   23   39:invokevirtual   #489 <Method void JsonParser.close()>
		}
	//*  24   42:aload_2         
	//*  25   43:areturn         
	//*  26   44:aload_3         
	//*  27   45:getstatic       #492 <Field JsonToken JsonToken.END_ARRAY>
	//*  28   48:if_acmpeq       135
	//*  29   51:aload_3         
	//*  30   52:getstatic       #495 <Field JsonToken JsonToken.END_OBJECT>
	//*  31   55:if_acmpne       61
	//*  32   58:goto            135
	//*  33   61:aload_0         
	//*  34   62:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//*  35   65:astore          4
	//*  36   67:aload_0         
	//*  37   68:aload_1         
	//*  38   69:aload           4
	//*  39   71:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//*  40   74:astore_3        
	//*  41   75:aload_0         
	//*  42   76:aload_3         
	//*  43   77:aload_2         
	//*  44   78:invokevirtual   #480 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//*  45   81:astore          5
	//*  46   83:aload           4
	//*  47   85:invokevirtual   #583 <Method boolean DeserializationConfig.useRootWrapping()>
	//*  48   88:ifeq            117
	//*  49   91:aload_0         
	//*  50   92:aload_1         
	//*  51   93:aload_3         
	//*  52   94:aload           4
	//*  53   96:aload_2         
	//*  54   97:aload           5
	//*  55   99:invokevirtual   #587 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, DeserializationConfig, JavaType, JsonDeserializer)>
	//*  56  102:astore_2        
	//*  57  103:aload_3         
	//*  58  104:invokevirtual   #590 <Method void DeserializationContext.checkUnresolvedObjectId()>
	//*  59  107:goto            34
	//*  60  110:astore_2        
	//*  61  111:aload_1         
	//*  62  112:invokevirtual   #489 <Method void JsonParser.close()>
	//*  63  115:aload_2         
	//*  64  116:athrow          
	//*  65  117:aload           5
	//*  66  119:aload_1         
	//*  67  120:aload_3         
	//*  68  121:invokevirtual   #499 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//*  69  124:astore_2        
	//*  70  125:goto            103
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser)
	//*  71  128:astore_1        
		{
			return ((Object) (javatype));
	//   72  129:aload_2         
	//   73  130:areturn         
		}
		return ((Object) (javatype));
_L2:
		if(obj == JsonToken.END_ARRAY || obj == JsonToken.END_OBJECT)
			break MISSING_BLOCK_LABEL_135;
		deserializationconfig = getDeserializationConfig();
		obj = ((Object) (createDeserializationContext(jsonparser, deserializationconfig)));
		jsondeserializer = _findRootDeserializer(((DeserializationContext) (obj)), javatype);
		if(!deserializationconfig.useRootWrapping())
			break MISSING_BLOCK_LABEL_117;
		javatype = ((JavaType) (_unwrapAndDeserialize(jsonparser, ((DeserializationContext) (obj)), deserializationconfig, javatype, jsondeserializer)));
_L4:
		((DeserializationContext) (obj)).checkUnresolvedObjectId();
		  goto _L3
		javatype;
		try
		{
			jsonparser.close();
		}
		// Misplaced declaration of an exception variable
		catch(JsonParser jsonparser) { }
	//   74  131:astore_1        
		throw javatype;
		javatype = ((JavaType) (jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (obj)))));
		  goto _L4
	//*  75  132:goto            115
		javatype = null;
	//   76  135:aconst_null     
	//   77  136:astore_2        
		  goto _L3
	//*  78  137:goto            34
	}

	protected Object _readValue(DeserializationConfig deserializationconfig, JsonParser jsonparser, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		JsonToken jsontoken = _initForReading(jsonparser);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #466 <Method JsonToken _initForReading(JsonParser)>
	//    3    5:astore          4
		if(jsontoken == JsonToken.VALUE_NULL)
	//*   4    7:aload           4
	//*   5    9:getstatic       #472 <Field JsonToken JsonToken.VALUE_NULL>
	//*   6   12:if_acmpne       39
		{
			deserializationconfig = ((DeserializationConfig) (createDeserializationContext(jsonparser, deserializationconfig)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//   11   21:astore_1        
			deserializationconfig = ((DeserializationConfig) (_findRootDeserializer(((DeserializationContext) (deserializationconfig)), javatype).getNullValue(((DeserializationContext) (deserializationconfig)))));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:aload_3         
	//   15   25:invokevirtual   #480 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #486 <Method Object JsonDeserializer.getNullValue(DeserializationContext)>
	//   18   32:astore_1        
		} else
	//*  19   33:aload_2         
	//*  20   34:invokevirtual   #580 <Method void JsonParser.clearCurrentToken()>
	//*  21   37:aload_1         
	//*  22   38:areturn         
		if(jsontoken == JsonToken.END_ARRAY || jsontoken == JsonToken.END_OBJECT)
	//*  23   39:aload           4
	//*  24   41:getstatic       #492 <Field JsonToken JsonToken.END_ARRAY>
	//*  25   44:if_acmpeq       55
	//*  26   47:aload           4
	//*  27   49:getstatic       #495 <Field JsonToken JsonToken.END_OBJECT>
	//*  28   52:if_acmpne       60
		{
			deserializationconfig = null;
	//   29   55:aconst_null     
	//   30   56:astore_1        
		} else
	//*  31   57:goto            33
		{
			DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser, deserializationconfig);
	//   32   60:aload_0         
	//   33   61:aload_2         
	//   34   62:aload_1         
	//   35   63:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//   36   66:astore          4
			JsonDeserializer jsondeserializer = _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)), javatype);
	//   37   68:aload_0         
	//   38   69:aload           4
	//   39   71:aload_3         
	//   40   72:invokevirtual   #480 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   41   75:astore          5
			if(deserializationconfig.useRootWrapping())
	//*  42   77:aload_1         
	//*  43   78:invokevirtual   #583 <Method boolean DeserializationConfig.useRootWrapping()>
	//*  44   81:ifeq            99
				deserializationconfig = ((DeserializationConfig) (_unwrapAndDeserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), deserializationconfig, javatype, jsondeserializer)));
	//   45   84:aload_0         
	//   46   85:aload_2         
	//   47   86:aload           4
	//   48   88:aload_1         
	//   49   89:aload_3         
	//   50   90:aload           5
	//   51   92:invokevirtual   #587 <Method Object _unwrapAndDeserialize(JsonParser, DeserializationContext, DeserializationConfig, JavaType, JsonDeserializer)>
	//   52   95:astore_1        
			else
	//*  53   96:goto            33
				deserializationconfig = ((DeserializationConfig) (jsondeserializer.deserialize(jsonparser, ((DeserializationContext) (defaultdeserializationcontext)))));
	//   54   99:aload           5
	//   55  101:aload_2         
	//   56  102:aload           4
	//   57  104:invokevirtual   #499 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   58  107:astore_1        
		}
		jsonparser.clearCurrentToken();
		return ((Object) (deserializationconfig));
	//*  59  108:goto            33
	}

	protected DefaultSerializerProvider _serializerProvider(SerializationConfig serializationconfig)
	{
		return _serializerProvider.createInstance(serializationconfig, _serializerFactory);
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field DefaultSerializerProvider _serializerProvider>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #224 <Field SerializerFactory _serializerFactory>
	//    5    9:invokevirtual   #596 <Method DefaultSerializerProvider DefaultSerializerProvider.createInstance(SerializationConfig, SerializerFactory)>
	//    6   12:areturn         
	}

	protected Object _unwrapAndDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, DeserializationConfig deserializationconfig, JavaType javatype, JsonDeserializer jsondeserializer)
		throws IOException
	{
		deserializationconfig = ((DeserializationConfig) (deserializationconfig.findRootName(javatype).getSimpleName()));
	//    0    0:aload_3         
	//    1    1:aload           4
	//    2    3:invokevirtual   #600 <Method PropertyName DeserializationConfig.findRootName(JavaType)>
	//    3    6:invokevirtual   #605 <Method String PropertyName.getSimpleName()>
	//    4    9:astore_3        
		if(jsonparser.getCurrentToken() != JsonToken.START_OBJECT)
	//*   5   10:aload_1         
	//*   6   11:invokevirtual   #539 <Method JsonToken JsonParser.getCurrentToken()>
	//*   7   14:getstatic       #608 <Field JsonToken JsonToken.START_OBJECT>
	//*   8   17:if_acmpeq       58
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not START_OBJECT (needed to unwrap root name '").append(((String) (deserializationconfig))).append("'), but ").append(((Object) (jsonparser.getCurrentToken()))).toString());
	//    9   20:aload_1         
	//   10   21:new             #361 <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #362 <Method void StringBuilder()>
	//   13   28:ldc2            #610 <String "Current token not START_OBJECT (needed to unwrap root name '">
	//   14   31:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:aload_3         
	//   16   35:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:ldc2            #612 <String "'), but ">
	//   18   41:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:aload_1         
	//   20   45:invokevirtual   #539 <Method JsonToken JsonParser.getCurrentToken()>
	//   21   48:invokevirtual   #383 <Method StringBuilder StringBuilder.append(Object)>
	//   22   51:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   23   54:invokestatic    #547 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   24   57:athrow          
		if(jsonparser.nextToken() != JsonToken.FIELD_NAME)
	//*  25   58:aload_1         
	//*  26   59:invokevirtual   #542 <Method JsonToken JsonParser.nextToken()>
	//*  27   62:getstatic       #615 <Field JsonToken JsonToken.FIELD_NAME>
	//*  28   65:if_acmpeq       106
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not FIELD_NAME (to contain expected root name '").append(((String) (deserializationconfig))).append("'), but ").append(((Object) (jsonparser.getCurrentToken()))).toString());
	//   29   68:aload_1         
	//   30   69:new             #361 <Class StringBuilder>
	//   31   72:dup             
	//   32   73:invokespecial   #362 <Method void StringBuilder()>
	//   33   76:ldc2            #617 <String "Current token not FIELD_NAME (to contain expected root name '">
	//   34   79:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   35   82:aload_3         
	//   36   83:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   37   86:ldc2            #612 <String "'), but ">
	//   38   89:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   39   92:aload_1         
	//   40   93:invokevirtual   #539 <Method JsonToken JsonParser.getCurrentToken()>
	//   41   96:invokevirtual   #383 <Method StringBuilder StringBuilder.append(Object)>
	//   42   99:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   43  102:invokestatic    #547 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   44  105:athrow          
		String s = jsonparser.getCurrentName();
	//   45  106:aload_1         
	//   46  107:invokevirtual   #620 <Method String JsonParser.getCurrentName()>
	//   47  110:astore          6
		if(!((String) (deserializationconfig)).equals(((Object) (s))))
	//*  48  112:aload_3         
	//*  49  113:aload           6
	//*  50  115:invokevirtual   #625 <Method boolean String.equals(Object)>
	//*  51  118:ifne            168
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Root name '").append(s).append("' does not match expected ('").append(((String) (deserializationconfig))).append("') for type ").append(((Object) (javatype))).toString());
	//   52  121:aload_1         
	//   53  122:new             #361 <Class StringBuilder>
	//   54  125:dup             
	//   55  126:invokespecial   #362 <Method void StringBuilder()>
	//   56  129:ldc2            #627 <String "Root name '">
	//   57  132:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   58  135:aload           6
	//   59  137:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   60  140:ldc2            #629 <String "' does not match expected ('">
	//   61  143:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   62  146:aload_3         
	//   63  147:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   64  150:ldc2            #631 <String "') for type ">
	//   65  153:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   66  156:aload           4
	//   67  158:invokevirtual   #383 <Method StringBuilder StringBuilder.append(Object)>
	//   68  161:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   69  164:invokestatic    #547 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   70  167:athrow          
		jsonparser.nextToken();
	//   71  168:aload_1         
	//   72  169:invokevirtual   #542 <Method JsonToken JsonParser.nextToken()>
	//   73  172:pop             
		deserializationcontext = ((DeserializationContext) (jsondeserializer.deserialize(jsonparser, deserializationcontext)));
	//   74  173:aload           5
	//   75  175:aload_1         
	//   76  176:aload_2         
	//   77  177:invokevirtual   #499 <Method Object JsonDeserializer.deserialize(JsonParser, DeserializationContext)>
	//   78  180:astore_2        
		if(jsonparser.nextToken() != JsonToken.END_OBJECT)
	//*  79  181:aload_1         
	//*  80  182:invokevirtual   #542 <Method JsonToken JsonParser.nextToken()>
	//*  81  185:getstatic       #495 <Field JsonToken JsonToken.END_OBJECT>
	//*  82  188:if_acmpeq       229
			throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Current token not END_OBJECT (to match wrapper object with root name '").append(((String) (deserializationconfig))).append("'), but ").append(((Object) (jsonparser.getCurrentToken()))).toString());
	//   83  191:aload_1         
	//   84  192:new             #361 <Class StringBuilder>
	//   85  195:dup             
	//   86  196:invokespecial   #362 <Method void StringBuilder()>
	//   87  199:ldc2            #633 <String "Current token not END_OBJECT (to match wrapper object with root name '">
	//   88  202:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   89  205:aload_3         
	//   90  206:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   91  209:ldc2            #612 <String "'), but ">
	//   92  212:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   93  215:aload_1         
	//   94  216:invokevirtual   #539 <Method JsonToken JsonParser.getCurrentToken()>
	//   95  219:invokevirtual   #383 <Method StringBuilder StringBuilder.append(Object)>
	//   96  222:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   97  225:invokestatic    #547 <Method JsonMappingException JsonMappingException.from(JsonParser, String)>
	//   98  228:athrow          
		else
			return ((Object) (deserializationcontext));
	//   99  229:aload_2         
	//  100  230:areturn         
	}

	protected void _verifySchemaType(FormatSchema formatschema)
	{
		if(formatschema != null && !_jsonFactory.canUseSchema(formatschema))
	//*   0    0:aload_1         
	//*   1    1:ifnull          65
	//*   2    4:aload_0         
	//*   3    5:getfield        #143 <Field JsonFactory _jsonFactory>
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #640 <Method boolean JsonFactory.canUseSchema(FormatSchema)>
	//*   6   12:ifne            65
			throw new IllegalArgumentException((new StringBuilder()).append("Can not use FormatSchema of type ").append(((Object) (formatschema)).getClass().getName()).append(" for format ").append(_jsonFactory.getFormatName()).toString());
	//    7   15:new             #417 <Class IllegalArgumentException>
	//    8   18:dup             
	//    9   19:new             #361 <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #362 <Method void StringBuilder()>
	//   12   26:ldc2            #642 <String "Can not use FormatSchema of type ">
	//   13   29:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:aload_1         
	//   15   33:invokevirtual   #357 <Method Class Object.getClass()>
	//   16   36:invokevirtual   #374 <Method String Class.getName()>
	//   17   39:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   18   42:ldc2            #644 <String " for format ">
	//   19   45:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:aload_0         
	//   21   49:getfield        #143 <Field JsonFactory _jsonFactory>
	//   22   52:invokevirtual   #647 <Method String JsonFactory.getFormatName()>
	//   23   55:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   24   58:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   25   61:invokespecial   #648 <Method void IllegalArgumentException(String)>
	//   26   64:athrow          
		else
			return;
	//   27   65:return          
	}

	public void acceptJsonFormatVisitor(JavaType javatype, JsonFormatVisitorWrapper jsonformatvisitorwrapper)
		throws JsonMappingException
	{
		if(javatype == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
		{
			throw new IllegalArgumentException("type must be provided");
	//    2    4:new             #417 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc2            #652 <String "type must be provided">
	//    5   11:invokespecial   #648 <Method void IllegalArgumentException(String)>
	//    6   14:athrow          
		} else
		{
			_serializerProvider(getSerializationConfig()).acceptJsonFormatVisitor(javatype, jsonformatvisitorwrapper);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//   10   20:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #654 <Method void DefaultSerializerProvider.acceptJsonFormatVisitor(JavaType, JsonFormatVisitorWrapper)>
			return;
	//   14   28:return          
		}
	}

	public void acceptJsonFormatVisitor(Class class1, JsonFormatVisitorWrapper jsonformatvisitorwrapper)
		throws JsonMappingException
	{
		acceptJsonFormatVisitor(_typeFactory.constructType(((Type) (class1))), jsonformatvisitorwrapper);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #153 <Field TypeFactory _typeFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #660 <Method void acceptJsonFormatVisitor(JavaType, JsonFormatVisitorWrapper)>
	//    7   13:return          
	}

	public ObjectMapper addHandler(DeserializationProblemHandler deserializationproblemhandler)
	{
		_deserializationConfig = _deserializationConfig.withHandler(deserializationproblemhandler);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #667 <Method DeserializationConfig DeserializationConfig.withHandler(DeserializationProblemHandler)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public ObjectMapper addMixIn(Class class1, Class class2)
	{
		_mixIns.addLocalDefinition(class1, class2);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field SimpleMixInResolver _mixIns>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #673 <Method void SimpleMixInResolver.addLocalDefinition(Class, Class)>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public final void addMixInAnnotations(Class class1, Class class2)
	{
		addMixIn(class1, class2);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #677 <Method ObjectMapper addMixIn(Class, Class)>
	//    4    6:pop             
	//    5    7:return          
	}

	public boolean canDeserialize(JavaType javatype)
	{
		return createDeserializationContext(((JsonParser) (null)), getDeserializationConfig()).hasValueDeserializerFor(javatype, ((AtomicReference) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_0         
	//    3    3:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    4    6:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokevirtual   #684 <Method boolean DefaultDeserializationContext.hasValueDeserializerFor(JavaType, AtomicReference)>
	//    8   14:ireturn         
	}

	public boolean canDeserialize(JavaType javatype, AtomicReference atomicreference)
	{
		return createDeserializationContext(((JsonParser) (null)), getDeserializationConfig()).hasValueDeserializerFor(javatype, atomicreference);
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:aload_0         
	//    3    3:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    4    6:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #684 <Method boolean DefaultDeserializationContext.hasValueDeserializerFor(JavaType, AtomicReference)>
	//    8   14:ireturn         
	}

	public boolean canSerialize(Class class1)
	{
		return _serializerProvider(getSerializationConfig()).hasSerializerFor(class1, ((AtomicReference) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:invokevirtual   #690 <Method boolean DefaultSerializerProvider.hasSerializerFor(Class, AtomicReference)>
	//    7   13:ireturn         
	}

	public boolean canSerialize(Class class1, AtomicReference atomicreference)
	{
		return _serializerProvider(getSerializationConfig()).hasSerializerFor(class1, atomicreference);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #690 <Method boolean DefaultSerializerProvider.hasSerializerFor(Class, AtomicReference)>
	//    7   13:ireturn         
	}

	public ObjectMapper clearProblemHandlers()
	{
		_deserializationConfig = _deserializationConfig.withNoProblemHandlers();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:invokevirtual   #697 <Method DeserializationConfig DeserializationConfig.withNoProblemHandlers()>
	//    4    8:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    5   11:aload_0         
	//    6   12:areturn         
	}

	public ObjectMapper configure(com.fasterxml.jackson.core.JsonGenerator.Feature feature, boolean flag)
	{
		_jsonFactory.configure(feature, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field JsonFactory _jsonFactory>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #701 <Method JsonFactory JsonFactory.configure(com.fasterxml.jackson.core.JsonGenerator$Feature, boolean)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public ObjectMapper configure(com.fasterxml.jackson.core.JsonParser.Feature feature, boolean flag)
	{
		_jsonFactory.configure(feature, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field JsonFactory _jsonFactory>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokevirtual   #705 <Method JsonFactory JsonFactory.configure(com.fasterxml.jackson.core.JsonParser$Feature, boolean)>
	//    5    9:pop             
		return this;
	//    6   10:aload_0         
	//    7   11:areturn         
	}

	public ObjectMapper configure(DeserializationFeature deserializationfeature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
			deserializationfeature = ((DeserializationFeature) (_deserializationConfig.with(deserializationfeature)));
	//    2    4:aload_0         
	//    3    5:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #710 <Method DeserializationConfig DeserializationConfig.with(DeserializationFeature)>
	//    6   12:astore_1        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:putfield        #180 <Field DeserializationConfig _deserializationConfig>
	//*  10   18:aload_0         
	//*  11   19:areturn         
			deserializationfeature = ((DeserializationFeature) (_deserializationConfig.without(deserializationfeature)));
	//   12   20:aload_0         
	//   13   21:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//   14   24:aload_1         
	//   15   25:invokevirtual   #712 <Method DeserializationConfig DeserializationConfig.without(DeserializationFeature)>
	//   16   28:astore_1        
		_deserializationConfig = ((DeserializationConfig) (deserializationfeature));
		return this;
	//*  17   29:goto            13
	}

	public ObjectMapper configure(MapperFeature mapperfeature, boolean flag)
	{
		SerializationConfig serializationconfig;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            52
			serializationconfig = _serializationConfig.with(new MapperFeature[] {
				mapperfeature
			});
	//    2    4:aload_0         
	//    3    5:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    4    8:iconst_1        
	//    5    9:anewarray       MapperFeature[]
	//    6   12:dup             
	//    7   13:iconst_0        
	//    8   14:aload_1         
	//    9   15:aastore         
	//   10   16:invokevirtual   #715 <Method SerializationConfig SerializationConfig.with(MapperFeature[])>
	//   11   19:astore_3        
		else
	//*  12   20:aload_0         
	//*  13   21:aload_3         
	//*  14   22:putfield        #175 <Field SerializationConfig _serializationConfig>
	//*  15   25:iload_2         
	//*  16   26:ifeq            71
	//*  17   29:aload_0         
	//*  18   30:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//*  19   33:iconst_1        
	//*  20   34:anewarray       MapperFeature[]
	//*  21   37:dup             
	//*  22   38:iconst_0        
	//*  23   39:aload_1         
	//*  24   40:aastore         
	//*  25   41:invokevirtual   #718 <Method DeserializationConfig DeserializationConfig.with(MapperFeature[])>
	//*  26   44:astore_1        
	//*  27   45:aload_0         
	//*  28   46:aload_1         
	//*  29   47:putfield        #180 <Field DeserializationConfig _deserializationConfig>
	//*  30   50:aload_0         
	//*  31   51:areturn         
			serializationconfig = _serializationConfig.without(new MapperFeature[] {
				mapperfeature
			});
	//   32   52:aload_0         
	//   33   53:getfield        #175 <Field SerializationConfig _serializationConfig>
	//   34   56:iconst_1        
	//   35   57:anewarray       MapperFeature[]
	//   36   60:dup             
	//   37   61:iconst_0        
	//   38   62:aload_1         
	//   39   63:aastore         
	//   40   64:invokevirtual   #720 <Method SerializationConfig SerializationConfig.without(MapperFeature[])>
	//   41   67:astore_3        
		_serializationConfig = serializationconfig;
		if(flag)
			mapperfeature = ((MapperFeature) (_deserializationConfig.with(new MapperFeature[] {
				mapperfeature
			})));
		else
	//*  42   68:goto            20
			mapperfeature = ((MapperFeature) (_deserializationConfig.without(new MapperFeature[] {
				mapperfeature
			})));
	//   43   71:aload_0         
	//   44   72:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//   45   75:iconst_1        
	//   46   76:anewarray       MapperFeature[]
	//   47   79:dup             
	//   48   80:iconst_0        
	//   49   81:aload_1         
	//   50   82:aastore         
	//   51   83:invokevirtual   #722 <Method DeserializationConfig DeserializationConfig.without(MapperFeature[])>
	//   52   86:astore_1        
		_deserializationConfig = ((DeserializationConfig) (mapperfeature));
		return this;
	//*  53   87:goto            45
	}

	public ObjectMapper configure(SerializationFeature serializationfeature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            20
			serializationfeature = ((SerializationFeature) (_serializationConfig.with(serializationfeature)));
	//    2    4:aload_0         
	//    3    5:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #725 <Method SerializationConfig SerializationConfig.with(SerializationFeature)>
	//    6   12:astore_1        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_1         
	//*   9   15:putfield        #175 <Field SerializationConfig _serializationConfig>
	//*  10   18:aload_0         
	//*  11   19:areturn         
			serializationfeature = ((SerializationFeature) (_serializationConfig.without(serializationfeature)));
	//   12   20:aload_0         
	//   13   21:getfield        #175 <Field SerializationConfig _serializationConfig>
	//   14   24:aload_1         
	//   15   25:invokevirtual   #454 <Method SerializationConfig SerializationConfig.without(SerializationFeature)>
	//   16   28:astore_1        
		_serializationConfig = ((SerializationConfig) (serializationfeature));
		return this;
	//*  17   29:goto            13
	}

	public JavaType constructType(Type type)
	{
		return _typeFactory.constructType(type);
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field TypeFactory _typeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    4    8:areturn         
	}

	public Object convertValue(Object obj, TypeReference typereference)
		throws IllegalArgumentException
	{
		return convertValue(obj, _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #153 <Field TypeFactory _typeFactory>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    6   10:invokevirtual   #732 <Method Object convertValue(Object, JavaType)>
	//    7   13:areturn         
	}

	public Object convertValue(Object obj, JavaType javatype)
		throws IllegalArgumentException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return _convert(obj, javatype);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #735 <Method Object _convert(Object, JavaType)>
	//    8   12:areturn         
	}

	public Object convertValue(Object obj, Class class1)
		throws IllegalArgumentException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return _convert(obj, _typeFactory.constructType(((Type) (class1))));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:aload_0         
	//    7    9:getfield        #153 <Field TypeFactory _typeFactory>
	//    8   12:aload_2         
	//    9   13:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//   10   16:invokevirtual   #735 <Method Object _convert(Object, JavaType)>
	//   11   19:areturn         
	}

	public ObjectMapper copy()
	{
		_checkInvalidCopy(com/fasterxml/jackson/databind/ObjectMapper);
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class ObjectMapper>
	//    2    3:invokevirtual   #740 <Method void _checkInvalidCopy(Class)>
		return new ObjectMapper(this);
	//    3    6:new             #2   <Class ObjectMapper>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:invokespecial   #741 <Method void ObjectMapper(ObjectMapper)>
	//    7   14:areturn         
	}

	public volatile TreeNode createArrayNode()
	{
		return ((TreeNode) (createArrayNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #746 <Method ArrayNode createArrayNode()>
	//    2    4:areturn         
	}

	public ArrayNode createArrayNode()
	{
		return _deserializationConfig.getNodeFactory().arrayNode();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    2    4:invokevirtual   #750 <Method JsonNodeFactory DeserializationConfig.getNodeFactory()>
	//    3    7:invokevirtual   #755 <Method ArrayNode JsonNodeFactory.arrayNode()>
	//    4   10:areturn         
	}

	protected DefaultDeserializationContext createDeserializationContext(JsonParser jsonparser, DeserializationConfig deserializationconfig)
	{
		return _deserializationContext.createInstance(deserializationconfig, jsonparser, _injectableValues);
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field DefaultDeserializationContext _deserializationContext>
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #238 <Field InjectableValues _injectableValues>
	//    6   10:invokevirtual   #758 <Method DefaultDeserializationContext DefaultDeserializationContext.createInstance(DeserializationConfig, JsonParser, InjectableValues)>
	//    7   13:areturn         
	}

	public volatile TreeNode createObjectNode()
	{
		return ((TreeNode) (createObjectNode()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #762 <Method ObjectNode createObjectNode()>
	//    2    4:areturn         
	}

	public ObjectNode createObjectNode()
	{
		return _deserializationConfig.getNodeFactory().objectNode();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    2    4:invokevirtual   #750 <Method JsonNodeFactory DeserializationConfig.getNodeFactory()>
	//    3    7:invokevirtual   #765 <Method ObjectNode JsonNodeFactory.objectNode()>
	//    4   10:areturn         
	}

	protected ClassIntrospector defaultClassIntrospector()
	{
		return ((ClassIntrospector) (new BasicClassIntrospector()));
	//    0    0:new             #767 <Class BasicClassIntrospector>
	//    1    3:dup             
	//    2    4:invokespecial   #768 <Method void BasicClassIntrospector()>
	//    3    7:areturn         
	}

	public ObjectMapper disable(DeserializationFeature deserializationfeature)
	{
		_deserializationConfig = _deserializationConfig.without(deserializationfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #712 <Method DeserializationConfig DeserializationConfig.without(DeserializationFeature)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public transient ObjectMapper disable(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
	{
		_deserializationConfig = _deserializationConfig.without(deserializationfeature, adeserializationfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #773 <Method DeserializationConfig DeserializationConfig.without(DeserializationFeature, DeserializationFeature[])>
	//    6   10:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public ObjectMapper disable(SerializationFeature serializationfeature)
	{
		_serializationConfig = _serializationConfig.without(serializationfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #454 <Method SerializationConfig SerializationConfig.without(SerializationFeature)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public transient ObjectMapper disable(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
	{
		_serializationConfig = _serializationConfig.without(serializationfeature, aserializationfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #778 <Method SerializationConfig SerializationConfig.without(SerializationFeature, SerializationFeature[])>
	//    6   10:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public transient ObjectMapper disable(com.fasterxml.jackson.core.JsonGenerator.Feature afeature[])
	{
		int j = afeature.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          32
		{
			com.fasterxml.jackson.core.JsonGenerator.Feature feature = afeature[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			_jsonFactory.disable(feature);
	//   12   15:aload_0         
	//   13   16:getfield        #143 <Field JsonFactory _jsonFactory>
	//   14   19:aload           4
	//   15   21:invokevirtual   #782 <Method JsonFactory JsonFactory.disable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   16   24:pop             
		}

	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_2        
	//*  21   29:goto            5
		return this;
	//   22   32:aload_0         
	//   23   33:areturn         
	}

	public transient ObjectMapper disable(com.fasterxml.jackson.core.JsonParser.Feature afeature[])
	{
		int j = afeature.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          32
		{
			com.fasterxml.jackson.core.JsonParser.Feature feature = afeature[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			_jsonFactory.disable(feature);
	//   12   15:aload_0         
	//   13   16:getfield        #143 <Field JsonFactory _jsonFactory>
	//   14   19:aload           4
	//   15   21:invokevirtual   #786 <Method JsonFactory JsonFactory.disable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   16   24:pop             
		}

	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_2        
	//*  21   29:goto            5
		return this;
	//   22   32:aload_0         
	//   23   33:areturn         
	}

	public transient ObjectMapper disable(MapperFeature amapperfeature[])
	{
		_deserializationConfig = _deserializationConfig.without(amapperfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #722 <Method DeserializationConfig DeserializationConfig.without(MapperFeature[])>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.without(amapperfeature);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #720 <Method SerializationConfig SerializationConfig.without(MapperFeature[])>
	//   11   21:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper disableDefaultTyping()
	{
		return setDefaultTyping(((TypeResolverBuilder) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #792 <Method ObjectMapper setDefaultTyping(TypeResolverBuilder)>
	//    3    5:areturn         
	}

	public ObjectMapper enable(DeserializationFeature deserializationfeature)
	{
		_deserializationConfig = _deserializationConfig.with(deserializationfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #710 <Method DeserializationConfig DeserializationConfig.with(DeserializationFeature)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public transient ObjectMapper enable(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
	{
		_deserializationConfig = _deserializationConfig.with(deserializationfeature, adeserializationfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #795 <Method DeserializationConfig DeserializationConfig.with(DeserializationFeature, DeserializationFeature[])>
	//    6   10:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public ObjectMapper enable(SerializationFeature serializationfeature)
	{
		_serializationConfig = _serializationConfig.with(serializationfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #725 <Method SerializationConfig SerializationConfig.with(SerializationFeature)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public transient ObjectMapper enable(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
	{
		_serializationConfig = _serializationConfig.with(serializationfeature, aserializationfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #797 <Method SerializationConfig SerializationConfig.with(SerializationFeature, SerializationFeature[])>
	//    6   10:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public transient ObjectMapper enable(com.fasterxml.jackson.core.JsonGenerator.Feature afeature[])
	{
		int j = afeature.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          32
		{
			com.fasterxml.jackson.core.JsonGenerator.Feature feature = afeature[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			_jsonFactory.enable(feature);
	//   12   15:aload_0         
	//   13   16:getfield        #143 <Field JsonFactory _jsonFactory>
	//   14   19:aload           4
	//   15   21:invokevirtual   #799 <Method JsonFactory JsonFactory.enable(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   16   24:pop             
		}

	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_2        
	//*  21   29:goto            5
		return this;
	//   22   32:aload_0         
	//   23   33:areturn         
	}

	public transient ObjectMapper enable(com.fasterxml.jackson.core.JsonParser.Feature afeature[])
	{
		int j = afeature.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          32
		{
			com.fasterxml.jackson.core.JsonParser.Feature feature = afeature[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			_jsonFactory.enable(feature);
	//   12   15:aload_0         
	//   13   16:getfield        #143 <Field JsonFactory _jsonFactory>
	//   14   19:aload           4
	//   15   21:invokevirtual   #801 <Method JsonFactory JsonFactory.enable(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   16   24:pop             
		}

	//   17   25:iload_2         
	//   18   26:iconst_1        
	//   19   27:iadd            
	//   20   28:istore_2        
	//*  21   29:goto            5
		return this;
	//   22   32:aload_0         
	//   23   33:areturn         
	}

	public transient ObjectMapper enable(MapperFeature amapperfeature[])
	{
		_deserializationConfig = _deserializationConfig.with(amapperfeature);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #718 <Method DeserializationConfig DeserializationConfig.with(MapperFeature[])>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(amapperfeature);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #715 <Method SerializationConfig SerializationConfig.with(MapperFeature[])>
	//   11   21:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper enableDefaultTyping()
	{
		return enableDefaultTyping(DefaultTyping.OBJECT_AND_NON_CONCRETE);
	//    0    0:aload_0         
	//    1    1:getstatic       #806 <Field ObjectMapper$DefaultTyping ObjectMapper$DefaultTyping.OBJECT_AND_NON_CONCRETE>
	//    2    4:invokevirtual   #809 <Method ObjectMapper enableDefaultTyping(ObjectMapper$DefaultTyping)>
	//    3    7:areturn         
	}

	public ObjectMapper enableDefaultTyping(DefaultTyping defaulttyping)
	{
		return enableDefaultTyping(defaulttyping, com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #815 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.WRAPPER_ARRAY>
	//    3    5:invokevirtual   #818 <Method ObjectMapper enableDefaultTyping(ObjectMapper$DefaultTyping, com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//    4    8:areturn         
	}

	public ObjectMapper enableDefaultTyping(DefaultTyping defaulttyping, com.fasterxml.jackson.annotation.JsonTypeInfo.As as)
	{
		if(as == com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #821 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.EXTERNAL_PROPERTY>
	//*   2    4:if_acmpne       35
			throw new IllegalArgumentException((new StringBuilder()).append("Can not use includeAs of ").append(((Object) (as))).toString());
	//    3    7:new             #417 <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:new             #361 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #362 <Method void StringBuilder()>
	//    8   18:ldc2            #823 <String "Can not use includeAs of ">
	//    9   21:invokevirtual   #368 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_2         
	//   11   25:invokevirtual   #383 <Method StringBuilder StringBuilder.append(Object)>
	//   12   28:invokevirtual   #388 <Method String StringBuilder.toString()>
	//   13   31:invokespecial   #648 <Method void IllegalArgumentException(String)>
	//   14   34:athrow          
		else
			return setDefaultTyping(((TypeResolverBuilder) (new DefaultTypeResolverBuilder(defaulttyping))).init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver) (null))).inclusion(as));
	//   15   35:aload_0         
	//   16   36:new             #14  <Class ObjectMapper$DefaultTypeResolverBuilder>
	//   17   39:dup             
	//   18   40:aload_1         
	//   19   41:invokespecial   #826 <Method void ObjectMapper$DefaultTypeResolverBuilder(ObjectMapper$DefaultTyping)>
	//   20   44:getstatic       #832 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.CLASS>
	//   21   47:aconst_null     
	//   22   48:invokeinterface #838 <Method TypeResolverBuilder TypeResolverBuilder.init(com.fasterxml.jackson.annotation.JsonTypeInfo$Id, com.fasterxml.jackson.databind.jsontype.TypeIdResolver)>
	//   23   53:aload_2         
	//   24   54:invokeinterface #842 <Method TypeResolverBuilder TypeResolverBuilder.inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//   25   59:invokevirtual   #792 <Method ObjectMapper setDefaultTyping(TypeResolverBuilder)>
	//   26   62:areturn         
	}

	public ObjectMapper enableDefaultTypingAsProperty(DefaultTyping defaulttyping, String s)
	{
		return setDefaultTyping(((TypeResolverBuilder) (new DefaultTypeResolverBuilder(defaulttyping))).init(com.fasterxml.jackson.annotation.JsonTypeInfo.Id.CLASS, ((com.fasterxml.jackson.databind.jsontype.TypeIdResolver) (null))).inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY).typeProperty(s));
	//    0    0:aload_0         
	//    1    1:new             #14  <Class ObjectMapper$DefaultTypeResolverBuilder>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #826 <Method void ObjectMapper$DefaultTypeResolverBuilder(ObjectMapper$DefaultTyping)>
	//    5    9:getstatic       #832 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$Id com.fasterxml.jackson.annotation.JsonTypeInfo$Id.CLASS>
	//    6   12:aconst_null     
	//    7   13:invokeinterface #838 <Method TypeResolverBuilder TypeResolverBuilder.init(com.fasterxml.jackson.annotation.JsonTypeInfo$Id, com.fasterxml.jackson.databind.jsontype.TypeIdResolver)>
	//    8   18:getstatic       #847 <Field com.fasterxml.jackson.annotation.JsonTypeInfo$As com.fasterxml.jackson.annotation.JsonTypeInfo$As.PROPERTY>
	//    9   21:invokeinterface #842 <Method TypeResolverBuilder TypeResolverBuilder.inclusion(com.fasterxml.jackson.annotation.JsonTypeInfo$As)>
	//   10   26:aload_2         
	//   11   27:invokeinterface #851 <Method TypeResolverBuilder TypeResolverBuilder.typeProperty(String)>
	//   12   32:invokevirtual   #792 <Method ObjectMapper setDefaultTyping(TypeResolverBuilder)>
	//   13   35:areturn         
	}

	public ObjectMapper findAndRegisterModules()
	{
		return registerModules(((Iterable) (findModules())));
	//    0    0:aload_0         
	//    1    1:invokestatic    #854 <Method List findModules()>
	//    2    4:invokevirtual   #858 <Method ObjectMapper registerModules(Iterable)>
	//    3    7:areturn         
	}

	public Class findMixInClassFor(Class class1)
	{
		return _mixIns.findMixInClassFor(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field SimpleMixInResolver _mixIns>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #862 <Method Class SimpleMixInResolver.findMixInClassFor(Class)>
	//    4    8:areturn         
	}

	public JsonSchema generateJsonSchema(Class class1)
		throws JsonMappingException
	{
		return _serializerProvider(getSerializationConfig()).generateJsonSchema(class1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #867 <Method JsonSchema DefaultSerializerProvider.generateJsonSchema(Class)>
	//    6   12:areturn         
	}

	public DateFormat getDateFormat()
	{
		return _serializationConfig.getDateFormat();
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    2    4:invokevirtual   #872 <Method DateFormat SerializationConfig.getDateFormat()>
	//    3    7:areturn         
	}

	public DeserializationConfig getDeserializationConfig()
	{
		return _deserializationConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    2    4:areturn         
	}

	public DeserializationContext getDeserializationContext()
	{
		return ((DeserializationContext) (_deserializationContext));
	//    0    0:aload_0         
	//    1    1:getfield        #217 <Field DefaultDeserializationContext _deserializationContext>
	//    2    4:areturn         
	}

	public JsonFactory getFactory()
	{
		return _jsonFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field JsonFactory _jsonFactory>
	//    2    4:areturn         
	}

	public InjectableValues getInjectableValues()
	{
		return _injectableValues;
	//    0    0:aload_0         
	//    1    1:getfield        #238 <Field InjectableValues _injectableValues>
	//    2    4:areturn         
	}

	public JsonFactory getJsonFactory()
	{
		return getFactory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #880 <Method JsonFactory getFactory()>
	//    2    4:areturn         
	}

	public JsonNodeFactory getNodeFactory()
	{
		return _deserializationConfig.getNodeFactory();
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    2    4:invokevirtual   #750 <Method JsonNodeFactory DeserializationConfig.getNodeFactory()>
	//    3    7:areturn         
	}

	public PropertyNamingStrategy getPropertyNamingStrategy()
	{
		return _serializationConfig.getPropertyNamingStrategy();
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    2    4:invokevirtual   #884 <Method PropertyNamingStrategy SerializationConfig.getPropertyNamingStrategy()>
	//    3    7:areturn         
	}

	public SerializationConfig getSerializationConfig()
	{
		return _serializationConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    2    4:areturn         
	}

	public SerializerFactory getSerializerFactory()
	{
		return _serializerFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #224 <Field SerializerFactory _serializerFactory>
	//    2    4:areturn         
	}

	public SerializerProvider getSerializerProvider()
	{
		return ((SerializerProvider) (_serializerProvider));
	//    0    0:aload_0         
	//    1    1:getfield        #205 <Field DefaultSerializerProvider _serializerProvider>
	//    2    4:areturn         
	}

	public SerializerProvider getSerializerProviderInstance()
	{
		return ((SerializerProvider) (_serializerProvider(_serializationConfig)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    4    8:areturn         
	}

	public SubtypeResolver getSubtypeResolver()
	{
		return _subtypeResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field SubtypeResolver _subtypeResolver>
	//    2    4:areturn         
	}

	public TypeFactory getTypeFactory()
	{
		return _typeFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field TypeFactory _typeFactory>
	//    2    4:areturn         
	}

	public VisibilityChecker getVisibilityChecker()
	{
		return _serializationConfig.getDefaultVisibilityChecker();
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    2    4:invokevirtual   #897 <Method VisibilityChecker SerializationConfig.getDefaultVisibilityChecker()>
	//    3    7:areturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature feature)
	{
		return _jsonFactory.isEnabled(feature);
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field JsonFactory _jsonFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #901 <Method boolean JsonFactory.isEnabled(com.fasterxml.jackson.core.JsonFactory$Feature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		return _serializationConfig.isEnabled(feature, _jsonFactory);
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #143 <Field JsonFactory _jsonFactory>
	//    5    9:invokevirtual   #905 <Method boolean SerializationConfig.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature, JsonFactory)>
	//    6   12:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		return _deserializationConfig.isEnabled(feature, _jsonFactory);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #143 <Field JsonFactory _jsonFactory>
	//    5    9:invokevirtual   #909 <Method boolean DeserializationConfig.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature, JsonFactory)>
	//    6   12:ireturn         
	}

	public boolean isEnabled(DeserializationFeature deserializationfeature)
	{
		return _deserializationConfig.isEnabled(deserializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #910 <Method boolean DeserializationConfig.isEnabled(DeserializationFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(MapperFeature mapperfeature)
	{
		return _serializationConfig.isEnabled(mapperfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #196 <Method boolean SerializationConfig.isEnabled(MapperFeature)>
	//    4    8:ireturn         
	}

	public boolean isEnabled(SerializationFeature serializationfeature)
	{
		return _serializationConfig.isEnabled(serializationfeature);
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//    4    8:ireturn         
	}

	public int mixInCount()
	{
		return _mixIns.localSize();
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field SimpleMixInResolver _mixIns>
	//    2    4:invokevirtual   #915 <Method int SimpleMixInResolver.localSize()>
	//    3    7:ireturn         
	}

	public TreeNode readTree(JsonParser jsonparser)
		throws IOException, JsonProcessingException
	{
		Object obj = ((Object) (getDeserializationConfig()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    2    4:astore_2        
		if(jsonparser.getCurrentToken() == null && jsonparser.nextToken() == null)
	//*   3    5:aload_1         
	//*   4    6:invokevirtual   #539 <Method JsonToken JsonParser.getCurrentToken()>
	//*   5    9:ifnonnull       21
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #542 <Method JsonToken JsonParser.nextToken()>
	//*   8   16:ifnonnull       21
			return null;
	//    9   19:aconst_null     
	//   10   20:areturn         
		obj = ((Object) ((JsonNode)_readValue(((DeserializationConfig) (obj)), jsonparser, JSON_NODE_TYPE)));
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:aload_1         
	//   14   24:getstatic       #72  <Field JavaType JSON_NODE_TYPE>
	//   15   27:invokevirtual   #921 <Method Object _readValue(DeserializationConfig, JsonParser, JavaType)>
	//   16   30:checkcast       #64  <Class JsonNode>
	//   17   33:astore_2        
		jsonparser = ((JsonParser) (obj));
	//   18   34:aload_2         
	//   19   35:astore_1        
		if(obj == null)
	//*  20   36:aload_2         
	//*  21   37:ifnonnull       48
			jsonparser = ((JsonParser) (getNodeFactory().nullNode()));
	//   22   40:aload_0         
	//   23   41:invokevirtual   #922 <Method JsonNodeFactory getNodeFactory()>
	//   24   44:invokevirtual   #926 <Method NullNode JsonNodeFactory.nullNode()>
	//   25   47:astore_1        
		return ((TreeNode) (jsonparser));
	//   26   48:aload_1         
	//   27   49:areturn         
	}

	public JsonNode readTree(File file)
		throws IOException, JsonProcessingException
	{
		JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(file), JSON_NODE_TYPE);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #932 <Method JsonParser JsonFactory.createParser(File)>
	//    5    9:getstatic       #72  <Field JavaType JSON_NODE_TYPE>
	//    6   12:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   15:checkcast       #64  <Class JsonNode>
	//    8   18:astore_2        
		file = ((File) (jsonnode));
	//    9   19:aload_2         
	//   10   20:astore_1        
		if(jsonnode == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       29
			file = ((File) (NullNode.instance));
	//   13   25:getstatic       #939 <Field NullNode NullNode.instance>
	//   14   28:astore_1        
		return ((JsonNode) (file));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public JsonNode readTree(InputStream inputstream)
		throws IOException, JsonProcessingException
	{
		JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(inputstream), JSON_NODE_TYPE);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #943 <Method JsonParser JsonFactory.createParser(InputStream)>
	//    5    9:getstatic       #72  <Field JavaType JSON_NODE_TYPE>
	//    6   12:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   15:checkcast       #64  <Class JsonNode>
	//    8   18:astore_2        
		inputstream = ((InputStream) (jsonnode));
	//    9   19:aload_2         
	//   10   20:astore_1        
		if(jsonnode == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       29
			inputstream = ((InputStream) (NullNode.instance));
	//   13   25:getstatic       #939 <Field NullNode NullNode.instance>
	//   14   28:astore_1        
		return ((JsonNode) (inputstream));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public JsonNode readTree(Reader reader1)
		throws IOException, JsonProcessingException
	{
		JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(reader1), JSON_NODE_TYPE);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #947 <Method JsonParser JsonFactory.createParser(Reader)>
	//    5    9:getstatic       #72  <Field JavaType JSON_NODE_TYPE>
	//    6   12:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   15:checkcast       #64  <Class JsonNode>
	//    8   18:astore_2        
		reader1 = ((Reader) (jsonnode));
	//    9   19:aload_2         
	//   10   20:astore_1        
		if(jsonnode == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       29
			reader1 = ((Reader) (NullNode.instance));
	//   13   25:getstatic       #939 <Field NullNode NullNode.instance>
	//   14   28:astore_1        
		return ((JsonNode) (reader1));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public JsonNode readTree(String s)
		throws IOException, JsonProcessingException
	{
		JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(s), JSON_NODE_TYPE);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #951 <Method JsonParser JsonFactory.createParser(String)>
	//    5    9:getstatic       #72  <Field JavaType JSON_NODE_TYPE>
	//    6   12:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   15:checkcast       #64  <Class JsonNode>
	//    8   18:astore_2        
		s = ((String) (jsonnode));
	//    9   19:aload_2         
	//   10   20:astore_1        
		if(jsonnode == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       29
			s = ((String) (NullNode.instance));
	//   13   25:getstatic       #939 <Field NullNode NullNode.instance>
	//   14   28:astore_1        
		return ((JsonNode) (s));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public JsonNode readTree(URL url)
		throws IOException, JsonProcessingException
	{
		JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(url), JSON_NODE_TYPE);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #955 <Method JsonParser JsonFactory.createParser(URL)>
	//    5    9:getstatic       #72  <Field JavaType JSON_NODE_TYPE>
	//    6   12:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   15:checkcast       #64  <Class JsonNode>
	//    8   18:astore_2        
		url = ((URL) (jsonnode));
	//    9   19:aload_2         
	//   10   20:astore_1        
		if(jsonnode == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       29
			url = ((URL) (NullNode.instance));
	//   13   25:getstatic       #939 <Field NullNode NullNode.instance>
	//   14   28:astore_1        
		return ((JsonNode) (url));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public JsonNode readTree(byte abyte0[])
		throws IOException, JsonProcessingException
	{
		JsonNode jsonnode = (JsonNode)_readMapAndClose(_jsonFactory.createParser(abyte0), JSON_NODE_TYPE);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #959 <Method JsonParser JsonFactory.createParser(byte[])>
	//    5    9:getstatic       #72  <Field JavaType JSON_NODE_TYPE>
	//    6   12:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   15:checkcast       #64  <Class JsonNode>
	//    8   18:astore_2        
		abyte0 = ((byte []) (jsonnode));
	//    9   19:aload_2         
	//   10   20:astore_1        
		if(jsonnode == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       29
			abyte0 = ((byte []) (NullNode.instance));
	//   13   25:getstatic       #939 <Field NullNode NullNode.instance>
	//   14   28:astore_1        
		return ((JsonNode) (abyte0));
	//   15   29:aload_1         
	//   16   30:areturn         
	}

	public final Object readValue(JsonParser jsonparser, ResolvedType resolvedtype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readValue(getDeserializationConfig(), jsonparser, (JavaType)resolvedtype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:checkcast       #419 <Class JavaType>
	//    6   10:invokevirtual   #921 <Method Object _readValue(DeserializationConfig, JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public Object readValue(JsonParser jsonparser, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readValue(getDeserializationConfig(), jsonparser, _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #153 <Field TypeFactory _typeFactory>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    8   14:invokevirtual   #921 <Method Object _readValue(DeserializationConfig, JsonParser, JavaType)>
	//    9   17:areturn         
	}

	public Object readValue(JsonParser jsonparser, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readValue(getDeserializationConfig(), jsonparser, javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #921 <Method Object _readValue(DeserializationConfig, JsonParser, JavaType)>
	//    6   10:areturn         
	}

	public Object readValue(JsonParser jsonparser, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readValue(getDeserializationConfig(), jsonparser, _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #153 <Field TypeFactory _typeFactory>
	//    6   10:aload_2         
	//    7   11:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    8   14:invokevirtual   #921 <Method Object _readValue(DeserializationConfig, JsonParser, JavaType)>
	//    9   17:areturn         
	}

	public Object readValue(File file, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(file), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #932 <Method JsonParser JsonFactory.createParser(File)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(File file, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(file), javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #932 <Method JsonParser JsonFactory.createParser(File)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public Object readValue(File file, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(file), _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #932 <Method JsonParser JsonFactory.createParser(File)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(InputStream inputstream, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(inputstream), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #943 <Method JsonParser JsonFactory.createParser(InputStream)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(InputStream inputstream, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(inputstream), javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #943 <Method JsonParser JsonFactory.createParser(InputStream)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public Object readValue(InputStream inputstream, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(inputstream), _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #943 <Method JsonParser JsonFactory.createParser(InputStream)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(Reader reader1, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(reader1), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #947 <Method JsonParser JsonFactory.createParser(Reader)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(Reader reader1, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(reader1), javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #947 <Method JsonParser JsonFactory.createParser(Reader)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public Object readValue(Reader reader1, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(reader1), _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #947 <Method JsonParser JsonFactory.createParser(Reader)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(String s, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(s), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #951 <Method JsonParser JsonFactory.createParser(String)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(String s, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(s), javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #951 <Method JsonParser JsonFactory.createParser(String)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public Object readValue(String s, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(s), _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #951 <Method JsonParser JsonFactory.createParser(String)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(URL url, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(url), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #955 <Method JsonParser JsonFactory.createParser(URL)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(URL url, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(url), javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #955 <Method JsonParser JsonFactory.createParser(URL)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public Object readValue(URL url, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(url), _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #955 <Method JsonParser JsonFactory.createParser(URL)>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(byte abyte0[], int i, int j, TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(abyte0, i, j), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #1001 <Method JsonParser JsonFactory.createParser(byte[], int, int)>
	//    7   11:aload_0         
	//    8   12:getfield        #153 <Field TypeFactory _typeFactory>
	//    9   15:aload           4
	//   10   17:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//   11   20:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   12   23:areturn         
	}

	public Object readValue(byte abyte0[], int i, int j, JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(abyte0, i, j), javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #1001 <Method JsonParser JsonFactory.createParser(byte[], int, int)>
	//    7   11:aload           4
	//    8   13:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    9   16:areturn         
	}

	public Object readValue(byte abyte0[], int i, int j, Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(abyte0, i, j), _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokevirtual   #1001 <Method JsonParser JsonFactory.createParser(byte[], int, int)>
	//    7   11:aload_0         
	//    8   12:getfield        #153 <Field TypeFactory _typeFactory>
	//    9   15:aload           4
	//   10   17:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//   11   20:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   12   23:areturn         
	}

	public Object readValue(byte abyte0[], TypeReference typereference)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(abyte0), _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #959 <Method JsonParser JsonFactory.createParser(byte[])>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public Object readValue(byte abyte0[], JavaType javatype)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(abyte0), javatype);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #959 <Method JsonParser JsonFactory.createParser(byte[])>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public Object readValue(byte abyte0[], Class class1)
		throws IOException, JsonParseException, JsonMappingException
	{
		return _readMapAndClose(_jsonFactory.createParser(abyte0), _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #959 <Method JsonParser JsonFactory.createParser(byte[])>
	//    5    9:aload_0         
	//    6   10:getfield        #153 <Field TypeFactory _typeFactory>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    9   17:invokevirtual   #934 <Method Object _readMapAndClose(JsonParser, JavaType)>
	//   10   20:areturn         
	}

	public MappingIterator readValues(JsonParser jsonparser, ResolvedType resolvedtype)
		throws IOException, JsonProcessingException
	{
		return readValues(jsonparser, (JavaType)resolvedtype);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #419 <Class JavaType>
	//    4    6:invokevirtual   #1017 <Method MappingIterator readValues(JsonParser, JavaType)>
	//    5    9:areturn         
	}

	public MappingIterator readValues(JsonParser jsonparser, TypeReference typereference)
		throws IOException, JsonProcessingException
	{
		return readValues(jsonparser, _typeFactory.constructType(typereference));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #153 <Field TypeFactory _typeFactory>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    6   10:invokevirtual   #1017 <Method MappingIterator readValues(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public MappingIterator readValues(JsonParser jsonparser, JavaType javatype)
		throws IOException, JsonProcessingException
	{
		DefaultDeserializationContext defaultdeserializationcontext = createDeserializationContext(jsonparser, getDeserializationConfig());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    4    6:invokevirtual   #476 <Method DefaultDeserializationContext createDeserializationContext(JsonParser, DeserializationConfig)>
	//    5    9:astore_3        
		return new MappingIterator(javatype, jsonparser, ((DeserializationContext) (defaultdeserializationcontext)), _findRootDeserializer(((DeserializationContext) (defaultdeserializationcontext)), javatype), false, ((Object) (null)));
	//    6   10:new             #1022 <Class MappingIterator>
	//    7   13:dup             
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:aload_3         
	//   11   17:aload_0         
	//   12   18:aload_3         
	//   13   19:aload_2         
	//   14   20:invokevirtual   #480 <Method JsonDeserializer _findRootDeserializer(DeserializationContext, JavaType)>
	//   15   23:iconst_0        
	//   16   24:aconst_null     
	//   17   25:invokespecial   #1025 <Method void MappingIterator(JavaType, JsonParser, DeserializationContext, JsonDeserializer, boolean, Object)>
	//   18   28:areturn         
	}

	public MappingIterator readValues(JsonParser jsonparser, Class class1)
		throws IOException, JsonProcessingException
	{
		return readValues(jsonparser, _typeFactory.constructType(((Type) (class1))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #153 <Field TypeFactory _typeFactory>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    6   10:invokevirtual   #1017 <Method MappingIterator readValues(JsonParser, JavaType)>
	//    7   13:areturn         
	}

	public volatile Iterator readValues(JsonParser jsonparser, ResolvedType resolvedtype)
		throws IOException, JsonProcessingException
	{
		return ((Iterator) (readValues(jsonparser, resolvedtype)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #1031 <Method MappingIterator readValues(JsonParser, ResolvedType)>
	//    4    6:areturn         
	}

	public volatile Iterator readValues(JsonParser jsonparser, TypeReference typereference)
		throws IOException, JsonProcessingException
	{
		return ((Iterator) (readValues(jsonparser, typereference)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #1034 <Method MappingIterator readValues(JsonParser, TypeReference)>
	//    4    6:areturn         
	}

	public volatile Iterator readValues(JsonParser jsonparser, Class class1)
		throws IOException, JsonProcessingException
	{
		return ((Iterator) (readValues(jsonparser, class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #1037 <Method MappingIterator readValues(JsonParser, Class)>
	//    4    6:areturn         
	}

	public ObjectReader reader()
	{
		return _newReader(getDeserializationConfig()).with(_injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:invokevirtual   #1041 <Method ObjectReader _newReader(DeserializationConfig)>
	//    4    8:aload_0         
	//    5    9:getfield        #238 <Field InjectableValues _injectableValues>
	//    6   12:invokevirtual   #1044 <Method ObjectReader ObjectReader.with(InjectableValues)>
	//    7   15:areturn         
	}

	public ObjectReader reader(Base64Variant base64variant)
	{
		return _newReader(getDeserializationConfig().with(base64variant));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1048 <Method DeserializationConfig DeserializationConfig.with(Base64Variant)>
	//    5    9:invokevirtual   #1041 <Method ObjectReader _newReader(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader reader(FormatSchema formatschema)
	{
		_verifySchemaType(formatschema);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1051 <Method void _verifySchemaType(FormatSchema)>
		return _newReader(getDeserializationConfig(), ((JavaType) (null)), ((Object) (null)), formatschema, _injectableValues);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    6   10:aconst_null     
	//    7   11:aconst_null     
	//    8   12:aload_1         
	//    9   13:aload_0         
	//   10   14:getfield        #238 <Field InjectableValues _injectableValues>
	//   11   17:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//   12   20:areturn         
	}

	public ObjectReader reader(TypeReference typereference)
	{
		return _newReader(getDeserializationConfig(), _typeFactory.constructType(typereference), ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_0         
	//    4    6:getfield        #153 <Field TypeFactory _typeFactory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    7   13:aconst_null     
	//    8   14:aconst_null     
	//    9   15:aload_0         
	//   10   16:getfield        #238 <Field InjectableValues _injectableValues>
	//   11   19:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//   12   22:areturn         
	}

	public ObjectReader reader(DeserializationFeature deserializationfeature)
	{
		return _newReader(getDeserializationConfig().with(deserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #710 <Method DeserializationConfig DeserializationConfig.with(DeserializationFeature)>
	//    5    9:invokevirtual   #1041 <Method ObjectReader _newReader(DeserializationConfig)>
	//    6   12:areturn         
	}

	public transient ObjectReader reader(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
	{
		return _newReader(getDeserializationConfig().with(deserializationfeature, adeserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #795 <Method DeserializationConfig DeserializationConfig.with(DeserializationFeature, DeserializationFeature[])>
	//    6   10:invokevirtual   #1041 <Method ObjectReader _newReader(DeserializationConfig)>
	//    7   13:areturn         
	}

	public ObjectReader reader(InjectableValues injectablevalues)
	{
		return _newReader(getDeserializationConfig(), ((JavaType) (null)), ((Object) (null)), ((FormatSchema) (null)), injectablevalues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aconst_null     
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aload_1         
	//    7    9:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//    8   12:areturn         
	}

	public ObjectReader reader(JavaType javatype)
	{
		return _newReader(getDeserializationConfig(), javatype, ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aload_0         
	//    7    9:getfield        #238 <Field InjectableValues _injectableValues>
	//    8   12:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//    9   15:areturn         
	}

	public ObjectReader reader(ContextAttributes contextattributes)
	{
		return _newReader(getDeserializationConfig().with(contextattributes));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1062 <Method DeserializationConfig DeserializationConfig.with(ContextAttributes)>
	//    5    9:invokevirtual   #1041 <Method ObjectReader _newReader(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectReader reader(JsonNodeFactory jsonnodefactory)
	{
		return _newReader(getDeserializationConfig()).with(jsonnodefactory);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:invokevirtual   #1041 <Method ObjectReader _newReader(DeserializationConfig)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1065 <Method ObjectReader ObjectReader.with(JsonNodeFactory)>
	//    6   12:areturn         
	}

	public ObjectReader reader(Class class1)
	{
		return _newReader(getDeserializationConfig(), _typeFactory.constructType(((Type) (class1))), ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_0         
	//    4    6:getfield        #153 <Field TypeFactory _typeFactory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    7   13:aconst_null     
	//    8   14:aconst_null     
	//    9   15:aload_0         
	//   10   16:getfield        #238 <Field InjectableValues _injectableValues>
	//   11   19:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//   12   22:areturn         
	}

	public ObjectReader readerFor(TypeReference typereference)
	{
		return _newReader(getDeserializationConfig(), _typeFactory.constructType(typereference), ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_0         
	//    4    6:getfield        #153 <Field TypeFactory _typeFactory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//    7   13:aconst_null     
	//    8   14:aconst_null     
	//    9   15:aload_0         
	//   10   16:getfield        #238 <Field InjectableValues _injectableValues>
	//   11   19:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//   12   22:areturn         
	}

	public ObjectReader readerFor(JavaType javatype)
	{
		return _newReader(getDeserializationConfig(), javatype, ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:aconst_null     
	//    6    8:aload_0         
	//    7    9:getfield        #238 <Field InjectableValues _injectableValues>
	//    8   12:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//    9   15:areturn         
	}

	public ObjectReader readerFor(Class class1)
	{
		return _newReader(getDeserializationConfig(), _typeFactory.constructType(((Type) (class1))), ((Object) (null)), ((FormatSchema) (null)), _injectableValues);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_0         
	//    4    6:getfield        #153 <Field TypeFactory _typeFactory>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    7   13:aconst_null     
	//    8   14:aconst_null     
	//    9   15:aload_0         
	//   10   16:getfield        #238 <Field InjectableValues _injectableValues>
	//   11   19:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//   12   22:areturn         
	}

	public ObjectReader readerForUpdating(Object obj)
	{
		JavaType javatype = _typeFactory.constructType(((Type) (obj.getClass())));
	//    0    0:aload_0         
	//    1    1:getfield        #153 <Field TypeFactory _typeFactory>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #357 <Method Class Object.getClass()>
	//    4    8:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//    5   11:astore_2        
		return _newReader(getDeserializationConfig(), javatype, obj, ((FormatSchema) (null)), _injectableValues);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:aconst_null     
	//   12   20:aload_0         
	//   13   21:getfield        #238 <Field InjectableValues _injectableValues>
	//   14   24:invokevirtual   #1053 <Method ObjectReader _newReader(DeserializationConfig, JavaType, Object, FormatSchema, InjectableValues)>
	//   15   27:areturn         
	}

	public ObjectReader readerWithView(Class class1)
	{
		return _newReader(getDeserializationConfig().withView(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #462 <Method DeserializationConfig getDeserializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1074 <Method DeserializationConfig DeserializationConfig.withView(Class)>
	//    5    9:invokevirtual   #1041 <Method ObjectReader _newReader(DeserializationConfig)>
	//    6   12:areturn         
	}

	public ObjectMapper registerModule(Module module)
	{
		if(isEnabled(MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #1079 <Field MapperFeature MapperFeature.IGNORE_DUPLICATE_MODULE_REGISTRATIONS>
	//*   2    4:invokevirtual   #1080 <Method boolean isEnabled(MapperFeature)>
	//*   3    7:ifeq            52
		{
			Object obj = module.getTypeId();
	//    4   10:aload_1         
	//    5   11:invokevirtual   #1083 <Method Object Module.getTypeId()>
	//    6   14:astore_2        
			if(obj != null)
	//*   7   15:aload_2         
	//*   8   16:ifnull          52
			{
				if(_registeredModuleTypes == null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #259 <Field Set _registeredModuleTypes>
	//*  11   23:ifnonnull       37
					_registeredModuleTypes = ((Set) (new LinkedHashSet()));
	//   12   26:aload_0         
	//   13   27:new             #261 <Class LinkedHashSet>
	//   14   30:dup             
	//   15   31:invokespecial   #1084 <Method void LinkedHashSet()>
	//   16   34:putfield        #259 <Field Set _registeredModuleTypes>
				if(!_registeredModuleTypes.add(obj))
	//*  17   37:aload_0         
	//*  18   38:getfield        #259 <Field Set _registeredModuleTypes>
	//*  19   41:aload_2         
	//*  20   42:invokeinterface #1087 <Method boolean Set.add(Object)>
	//*  21   47:ifne            52
					return this;
	//   22   50:aload_0         
	//   23   51:areturn         
			}
		}
		if(module.getModuleName() == null)
	//*  24   52:aload_1         
	//*  25   53:invokevirtual   #1090 <Method String Module.getModuleName()>
	//*  26   56:ifnonnull       70
			throw new IllegalArgumentException("Module without defined name");
	//   27   59:new             #417 <Class IllegalArgumentException>
	//   28   62:dup             
	//   29   63:ldc2            #1092 <String "Module without defined name">
	//   30   66:invokespecial   #648 <Method void IllegalArgumentException(String)>
	//   31   69:athrow          
		if(module.version() == null)
	//*  32   70:aload_1         
	//*  33   71:invokevirtual   #1093 <Method Version Module.version()>
	//*  34   74:ifnonnull       88
		{
			throw new IllegalArgumentException("Module without defined version");
	//   35   77:new             #417 <Class IllegalArgumentException>
	//   36   80:dup             
	//   37   81:ldc2            #1095 <String "Module without defined version">
	//   38   84:invokespecial   #648 <Method void IllegalArgumentException(String)>
	//   39   87:athrow          
		} else
		{
			module.setupModule(new Module.SetupContext() {

				public void addAbstractTypeResolver(AbstractTypeResolver abstracttyperesolver)
				{
					abstracttyperesolver = ((AbstractTypeResolver) (mapper._deserializationContext._factory.withAbstractTypeResolver(abstracttyperesolver)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
				//    4   10:aload_1         
				//    5   11:invokevirtual   #42  <Method DeserializerFactory DeserializerFactory.withAbstractTypeResolver(AbstractTypeResolver)>
				//    6   14:astore_1        
					mapper._deserializationContext = mapper._deserializationContext.with(((DeserializerFactory) (abstracttyperesolver)));
				//    7   15:aload_0         
				//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
				//    9   19:aload_0         
				//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
				//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   12   26:aload_1         
				//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
				//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   15   33:return          
				}

				public void addBeanDeserializerModifier(BeanDeserializerModifier beandeserializermodifier)
				{
					beandeserializermodifier = ((BeanDeserializerModifier) (mapper._deserializationContext._factory.withDeserializerModifier(beandeserializermodifier)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
				//    4   10:aload_1         
				//    5   11:invokevirtual   #52  <Method DeserializerFactory DeserializerFactory.withDeserializerModifier(BeanDeserializerModifier)>
				//    6   14:astore_1        
					mapper._deserializationContext = mapper._deserializationContext.with(((DeserializerFactory) (beandeserializermodifier)));
				//    7   15:aload_0         
				//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
				//    9   19:aload_0         
				//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
				//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   12   26:aload_1         
				//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
				//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   15   33:return          
				}

				public void addBeanSerializerModifier(BeanSerializerModifier beanserializermodifier)
				{
					mapper._serializerFactory = mapper._serializerFactory.withSerializerModifier(beanserializermodifier);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
				//    4    8:getfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
				//    5   11:aload_1         
				//    6   12:invokevirtual   #64  <Method SerializerFactory SerializerFactory.withSerializerModifier(BeanSerializerModifier)>
				//    7   15:putfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
				//    8   18:return          
				}

				public void addDeserializationProblemHandler(DeserializationProblemHandler deserializationproblemhandler)
				{
					mapper.addHandler(deserializationproblemhandler);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #70  <Method ObjectMapper ObjectMapper.addHandler(DeserializationProblemHandler)>
				//    4    8:pop             
				//    5    9:return          
				}

				public void addDeserializers(Deserializers deserializers)
				{
					deserializers = ((Deserializers) (mapper._deserializationContext._factory.withAdditionalDeserializers(deserializers)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
				//    4   10:aload_1         
				//    5   11:invokevirtual   #76  <Method DeserializerFactory DeserializerFactory.withAdditionalDeserializers(Deserializers)>
				//    6   14:astore_1        
					mapper._deserializationContext = mapper._deserializationContext.with(((DeserializerFactory) (deserializers)));
				//    7   15:aload_0         
				//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
				//    9   19:aload_0         
				//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
				//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   12   26:aload_1         
				//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
				//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   15   33:return          
				}

				public void addKeyDeserializers(KeyDeserializers keydeserializers)
				{
					keydeserializers = ((KeyDeserializers) (mapper._deserializationContext._factory.withAdditionalKeyDeserializers(keydeserializers)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
				//    4   10:aload_1         
				//    5   11:invokevirtual   #82  <Method DeserializerFactory DeserializerFactory.withAdditionalKeyDeserializers(KeyDeserializers)>
				//    6   14:astore_1        
					mapper._deserializationContext = mapper._deserializationContext.with(((DeserializerFactory) (keydeserializers)));
				//    7   15:aload_0         
				//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
				//    9   19:aload_0         
				//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
				//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   12   26:aload_1         
				//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
				//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   15   33:return          
				}

				public void addKeySerializers(Serializers serializers)
				{
					mapper._serializerFactory = mapper._serializerFactory.withAdditionalKeySerializers(serializers);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
				//    4    8:getfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
				//    5   11:aload_1         
				//    6   12:invokevirtual   #88  <Method SerializerFactory SerializerFactory.withAdditionalKeySerializers(Serializers)>
				//    7   15:putfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
				//    8   18:return          
				}

				public void addSerializers(Serializers serializers)
				{
					mapper._serializerFactory = mapper._serializerFactory.withAdditionalSerializers(serializers);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
				//    4    8:getfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
				//    5   11:aload_1         
				//    6   12:invokevirtual   #92  <Method SerializerFactory SerializerFactory.withAdditionalSerializers(Serializers)>
				//    7   15:putfield        #58  <Field SerializerFactory ObjectMapper._serializerFactory>
				//    8   18:return          
				}

				public void addTypeModifier(TypeModifier typemodifier)
				{
					typemodifier = ((TypeModifier) (mapper._typeFactory.withModifier(typemodifier)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:getfield        #98  <Field TypeFactory ObjectMapper._typeFactory>
				//    3    7:aload_1         
				//    4    8:invokevirtual   #104 <Method TypeFactory TypeFactory.withModifier(TypeModifier)>
				//    5   11:astore_1        
					mapper.setTypeFactory(((TypeFactory) (typemodifier)));
				//    6   12:aload_0         
				//    7   13:getfield        #20  <Field ObjectMapper val$mapper>
				//    8   16:aload_1         
				//    9   17:invokevirtual   #108 <Method ObjectMapper ObjectMapper.setTypeFactory(TypeFactory)>
				//   10   20:pop             
				//   11   21:return          
				}

				public void addValueInstantiators(ValueInstantiators valueinstantiators)
				{
					valueinstantiators = ((ValueInstantiators) (mapper._deserializationContext._factory.withValueInstantiators(valueinstantiators)));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//    3    7:getfield        #36  <Field DeserializerFactory DefaultDeserializationContext._factory>
				//    4   10:aload_1         
				//    5   11:invokevirtual   #114 <Method DeserializerFactory DeserializerFactory.withValueInstantiators(ValueInstantiators)>
				//    6   14:astore_1        
					mapper._deserializationContext = mapper._deserializationContext.with(((DeserializerFactory) (valueinstantiators)));
				//    7   15:aload_0         
				//    8   16:getfield        #20  <Field ObjectMapper val$mapper>
				//    9   19:aload_0         
				//   10   20:getfield        #20  <Field ObjectMapper val$mapper>
				//   11   23:getfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   12   26:aload_1         
				//   13   27:invokevirtual   #46  <Method DefaultDeserializationContext DefaultDeserializationContext.with(DeserializerFactory)>
				//   14   30:putfield        #30  <Field DefaultDeserializationContext ObjectMapper._deserializationContext>
				//   15   33:return          
				}

				public void appendAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
				{
					mapper._deserializationConfig = mapper._deserializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
				//    4    8:getfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
				//    5   11:aload_1         
				//    6   12:invokevirtual   #126 <Method DeserializationConfig DeserializationConfig.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
				//    7   15:putfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
					mapper._serializationConfig = mapper._serializationConfig.withAppendedAnnotationIntrospector(annotationintrospector);
				//    8   18:aload_0         
				//    9   19:getfield        #20  <Field ObjectMapper val$mapper>
				//   10   22:aload_0         
				//   11   23:getfield        #20  <Field ObjectMapper val$mapper>
				//   12   26:getfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
				//   13   29:aload_1         
				//   14   30:invokevirtual   #135 <Method SerializationConfig SerializationConfig.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
				//   15   33:putfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
				//   16   36:return          
				}

				public Version getMapperVersion()
				{
					return version();
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field ObjectMapper this$0>
				//    2    4:invokevirtual   #140 <Method Version ObjectMapper.version()>
				//    3    7:areturn         
				}

				public ObjectCodec getOwner()
				{
					return ((ObjectCodec) (mapper));
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:areturn         
				}

				public TypeFactory getTypeFactory()
				{
					return _typeFactory;
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field ObjectMapper this$0>
				//    2    4:getfield        #98  <Field TypeFactory ObjectMapper._typeFactory>
				//    3    7:areturn         
				}

				public void insertAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
				{
					mapper._deserializationConfig = mapper._deserializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
				//    4    8:getfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
				//    5   11:aload_1         
				//    6   12:invokevirtual   #150 <Method DeserializationConfig DeserializationConfig.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
				//    7   15:putfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
					mapper._serializationConfig = mapper._serializationConfig.withInsertedAnnotationIntrospector(annotationintrospector);
				//    8   18:aload_0         
				//    9   19:getfield        #20  <Field ObjectMapper val$mapper>
				//   10   22:aload_0         
				//   11   23:getfield        #20  <Field ObjectMapper val$mapper>
				//   12   26:getfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
				//   13   29:aload_1         
				//   14   30:invokevirtual   #152 <Method SerializationConfig SerializationConfig.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
				//   15   33:putfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
				//   16   36:return          
				}

				public boolean isEnabled(com.fasterxml.jackson.core.JsonFactory.Feature feature)
				{
					return mapper.isEnabled(feature);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #156 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonFactory$Feature)>
				//    4    8:ireturn         
				}

				public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
				{
					return mapper.isEnabled(feature);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #159 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
				//    4    8:ireturn         
				}

				public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
				{
					return mapper.isEnabled(feature);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #162 <Method boolean ObjectMapper.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
				//    4    8:ireturn         
				}

				public boolean isEnabled(DeserializationFeature deserializationfeature)
				{
					return mapper.isEnabled(deserializationfeature);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #165 <Method boolean ObjectMapper.isEnabled(DeserializationFeature)>
				//    4    8:ireturn         
				}

				public boolean isEnabled(MapperFeature mapperfeature)
				{
					return mapper.isEnabled(mapperfeature);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #168 <Method boolean ObjectMapper.isEnabled(MapperFeature)>
				//    4    8:ireturn         
				}

				public boolean isEnabled(SerializationFeature serializationfeature)
				{
					return mapper.isEnabled(serializationfeature);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #171 <Method boolean ObjectMapper.isEnabled(SerializationFeature)>
				//    4    8:ireturn         
				}

				public transient void registerSubtypes(NamedType anamedtype[])
				{
					mapper.registerSubtypes(anamedtype);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #175 <Method void ObjectMapper.registerSubtypes(NamedType[])>
				//    4    8:return          
				}

				public transient void registerSubtypes(Class aclass[])
				{
					mapper.registerSubtypes(aclass);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #178 <Method void ObjectMapper.registerSubtypes(Class[])>
				//    4    8:return          
				}

				public void setClassIntrospector(ClassIntrospector classintrospector)
				{
					mapper._deserializationConfig = mapper._deserializationConfig.with(classintrospector);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field ObjectMapper val$mapper>
				//    4    8:getfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
				//    5   11:aload_1         
				//    6   12:invokevirtual   #184 <Method DeserializationConfig DeserializationConfig.with(ClassIntrospector)>
				//    7   15:putfield        #120 <Field DeserializationConfig ObjectMapper._deserializationConfig>
					mapper._serializationConfig = mapper._serializationConfig.with(classintrospector);
				//    8   18:aload_0         
				//    9   19:getfield        #20  <Field ObjectMapper val$mapper>
				//   10   22:aload_0         
				//   11   23:getfield        #20  <Field ObjectMapper val$mapper>
				//   12   26:getfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
				//   13   29:aload_1         
				//   14   30:invokevirtual   #187 <Method SerializationConfig SerializationConfig.with(ClassIntrospector)>
				//   15   33:putfield        #130 <Field SerializationConfig ObjectMapper._serializationConfig>
				//   16   36:return          
				}

				public void setMixInAnnotations(Class class1, Class class2)
				{
					mapper.addMixIn(class1, class2);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokevirtual   #193 <Method ObjectMapper ObjectMapper.addMixIn(Class, Class)>
				//    5    9:pop             
				//    6   10:return          
				}

				public void setNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
				{
					mapper.setPropertyNamingStrategy(propertynamingstrategy);
				//    0    0:aload_0         
				//    1    1:getfield        #20  <Field ObjectMapper val$mapper>
				//    2    4:aload_1         
				//    3    5:invokevirtual   #200 <Method ObjectMapper ObjectMapper.setPropertyNamingStrategy(PropertyNamingStrategy)>
				//    4    8:pop             
				//    5    9:return          
				}

				final ObjectMapper this$0;
				final ObjectMapper val$mapper;

			
			{
				this$0 = ObjectMapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ObjectMapper this$0>
				mapper = objectmapper1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field ObjectMapper val$mapper>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//   40   88:aload_1         
	//   41   89:new             #10  <Class ObjectMapper$1>
	//   42   92:dup             
	//   43   93:aload_0         
	//   44   94:aload_0         
	//   45   95:invokespecial   #1098 <Method void ObjectMapper$1(ObjectMapper, ObjectMapper)>
	//   46   98:invokevirtual   #1102 <Method void Module.setupModule(Module$SetupContext)>
			return this;
	//   47  101:aload_0         
	//   48  102:areturn         
		}
	}

	public ObjectMapper registerModules(Iterable iterable)
	{
		for(iterable = ((Iterable) (iterable.iterator())); ((Iterator) (iterable)).hasNext(); registerModule((Module)((Iterator) (iterable)).next()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #1105 <Method Iterator Iterable.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #337 <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            33
	//    6   16:aload_0         
	//    7   17:aload_1         
	//    8   18:invokeinterface #341 <Method Object Iterator.next()>
	//    9   23:checkcast       #322 <Class Module>
	//   10   26:invokevirtual   #1107 <Method ObjectMapper registerModule(Module)>
	//   11   29:pop             
	//*  12   30:goto            7
		return this;
	//   13   33:aload_0         
	//   14   34:areturn         
	}

	public transient ObjectMapper registerModules(Module amodule[])
	{
		int j = amodule.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    3:iconst_0        
	//*   4    4:istore_2        
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          25
			registerModule(amodule[i]);
	//    8   10:aload_0         
	//    9   11:aload_1         
	//   10   12:iload_2         
	//   11   13:aaload          
	//   12   14:invokevirtual   #1107 <Method ObjectMapper registerModule(Module)>
	//   13   17:pop             

	//   14   18:iload_2         
	//   15   19:iconst_1        
	//   16   20:iadd            
	//   17   21:istore_2        
	//*  18   22:goto            5
		return this;
	//   19   25:aload_0         
	//   20   26:areturn         
	}

	public transient void registerSubtypes(NamedType anamedtype[])
	{
		getSubtypeResolver().registerSubtypes(anamedtype);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1113 <Method SubtypeResolver getSubtypeResolver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1117 <Method void SubtypeResolver.registerSubtypes(NamedType[])>
	//    4    8:return          
	}

	public transient void registerSubtypes(Class aclass[])
	{
		getSubtypeResolver().registerSubtypes(aclass);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #1113 <Method SubtypeResolver getSubtypeResolver()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1120 <Method void SubtypeResolver.registerSubtypes(Class[])>
	//    4    8:return          
	}

	public ObjectMapper setAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		_serializationConfig = _serializationConfig.with(annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1126 <Method SerializationConfig SerializationConfig.with(AnnotationIntrospector)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		_deserializationConfig = _deserializationConfig.with(annotationintrospector);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1129 <Method DeserializationConfig DeserializationConfig.with(AnnotationIntrospector)>
	//   11   21:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper setAnnotationIntrospectors(AnnotationIntrospector annotationintrospector, AnnotationIntrospector annotationintrospector1)
	{
		_serializationConfig = _serializationConfig.with(annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1126 <Method SerializationConfig SerializationConfig.with(AnnotationIntrospector)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		_deserializationConfig = _deserializationConfig.with(annotationintrospector1);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #1129 <Method DeserializationConfig DeserializationConfig.with(AnnotationIntrospector)>
	//   11   21:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper setBase64Variant(Base64Variant base64variant)
	{
		_serializationConfig = _serializationConfig.with(base64variant);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1136 <Method SerializationConfig SerializationConfig.with(Base64Variant)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		_deserializationConfig = _deserializationConfig.with(base64variant);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1048 <Method DeserializationConfig DeserializationConfig.with(Base64Variant)>
	//   11   21:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper setConfig(DeserializationConfig deserializationconfig)
	{
		_deserializationConfig = deserializationconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ObjectMapper setConfig(SerializationConfig serializationconfig)
	{
		_serializationConfig = serializationconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ObjectMapper setDateFormat(DateFormat dateformat)
	{
		_deserializationConfig = _deserializationConfig.with(dateformat);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1144 <Method DeserializationConfig DeserializationConfig.with(DateFormat)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(dateformat);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1147 <Method SerializationConfig SerializationConfig.with(DateFormat)>
	//   11   21:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper setDefaultPrettyPrinter(PrettyPrinter prettyprinter)
	{
		_serializationConfig = _serializationConfig.withDefaultPrettyPrinter(prettyprinter);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1153 <Method SerializationConfig SerializationConfig.withDefaultPrettyPrinter(PrettyPrinter)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public ObjectMapper setDefaultTyping(TypeResolverBuilder typeresolverbuilder)
	{
		_deserializationConfig = _deserializationConfig.with(typeresolverbuilder);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1156 <Method DeserializationConfig DeserializationConfig.with(TypeResolverBuilder)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(typeresolverbuilder);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1159 <Method SerializationConfig SerializationConfig.with(TypeResolverBuilder)>
	//   11   21:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper setFilterProvider(FilterProvider filterprovider)
	{
		_serializationConfig = _serializationConfig.withFilters(filterprovider);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1166 <Method SerializationConfig SerializationConfig.withFilters(FilterProvider)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public void setFilters(FilterProvider filterprovider)
	{
		_serializationConfig = _serializationConfig.withFilters(filterprovider);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1166 <Method SerializationConfig SerializationConfig.withFilters(FilterProvider)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
	//    6   12:return          
	}

	public Object setHandlerInstantiator(HandlerInstantiator handlerinstantiator)
	{
		_deserializationConfig = _deserializationConfig.with(handlerinstantiator);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1173 <Method DeserializationConfig DeserializationConfig.with(HandlerInstantiator)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(handlerinstantiator);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1176 <Method SerializationConfig SerializationConfig.with(HandlerInstantiator)>
	//   11   21:putfield        #175 <Field SerializationConfig _serializationConfig>
		return ((Object) (this));
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper setInjectableValues(InjectableValues injectablevalues)
	{
		_injectableValues = injectablevalues;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #238 <Field InjectableValues _injectableValues>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ObjectMapper setLocale(Locale locale)
	{
		_deserializationConfig = _deserializationConfig.with(locale);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1183 <Method DeserializationConfig DeserializationConfig.with(Locale)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(locale);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1186 <Method SerializationConfig SerializationConfig.with(Locale)>
	//   11   21:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public void setMixInAnnotations(Map map)
	{
		setMixIns(map);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1192 <Method ObjectMapper setMixIns(Map)>
	//    3    5:pop             
	//    4    6:return          
	}

	public ObjectMapper setMixInResolver(com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver mixinresolver)
	{
		mixinresolver = ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (_mixIns.withOverrides(mixinresolver)));
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field SimpleMixInResolver _mixIns>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1199 <Method SimpleMixInResolver SimpleMixInResolver.withOverrides(com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    4    8:astore_1        
		if(mixinresolver != _mixIns)
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #160 <Field SimpleMixInResolver _mixIns>
	//*   8   14:if_acmpeq       54
		{
			_mixIns = ((SimpleMixInResolver) (mixinresolver));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:putfield        #160 <Field SimpleMixInResolver _mixIns>
			_deserializationConfig = new DeserializationConfig(_deserializationConfig, ((SimpleMixInResolver) (mixinresolver)));
	//   12   22:aload_0         
	//   13   23:new             #177 <Class DeserializationConfig>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//   17   31:aload_1         
	//   18   32:invokespecial   #1202 <Method void DeserializationConfig(DeserializationConfig, SimpleMixInResolver)>
	//   19   35:putfield        #180 <Field DeserializationConfig _deserializationConfig>
			_serializationConfig = new SerializationConfig(_serializationConfig, ((SimpleMixInResolver) (mixinresolver)));
	//   20   38:aload_0         
	//   21   39:new             #170 <Class SerializationConfig>
	//   22   42:dup             
	//   23   43:aload_0         
	//   24   44:getfield        #175 <Field SerializationConfig _serializationConfig>
	//   25   47:aload_1         
	//   26   48:invokespecial   #1205 <Method void SerializationConfig(SerializationConfig, SimpleMixInResolver)>
	//   27   51:putfield        #175 <Field SerializationConfig _serializationConfig>
		}
		return this;
	//   28   54:aload_0         
	//   29   55:areturn         
	}

	public ObjectMapper setMixIns(Map map)
	{
		_mixIns.setLocalDefinitions(map);
	//    0    0:aload_0         
	//    1    1:getfield        #160 <Field SimpleMixInResolver _mixIns>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #1208 <Method void SimpleMixInResolver.setLocalDefinitions(Map)>
		return this;
	//    4    8:aload_0         
	//    5    9:areturn         
	}

	public ObjectMapper setNodeFactory(JsonNodeFactory jsonnodefactory)
	{
		_deserializationConfig = _deserializationConfig.with(jsonnodefactory);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1214 <Method DeserializationConfig DeserializationConfig.with(JsonNodeFactory)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public ObjectMapper setPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		_serializationConfig = _serializationConfig.withPropertyInclusion(value);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1220 <Method SerializationConfig SerializationConfig.withPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public ObjectMapper setPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
	{
		_serializationConfig = _serializationConfig.with(propertynamingstrategy);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1225 <Method SerializationConfig SerializationConfig.with(PropertyNamingStrategy)>
	//    5    9:putfield        #175 <Field SerializationConfig _serializationConfig>
		_deserializationConfig = _deserializationConfig.with(propertynamingstrategy);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1228 <Method DeserializationConfig DeserializationConfig.with(PropertyNamingStrategy)>
	//   11   21:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper setSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		setPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value.construct(include, com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #1236 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//    3    5:invokestatic    #1242 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.construct(com.fasterxml.jackson.annotation.JsonInclude$Include, com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//    4    8:invokevirtual   #1244 <Method ObjectMapper setPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    5   11:pop             
		return this;
	//    6   12:aload_0         
	//    7   13:areturn         
	}

	public ObjectMapper setSerializerFactory(SerializerFactory serializerfactory)
	{
		_serializerFactory = serializerfactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #224 <Field SerializerFactory _serializerFactory>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ObjectMapper setSerializerProvider(DefaultSerializerProvider defaultserializerprovider)
	{
		_serializerProvider = defaultserializerprovider;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #205 <Field DefaultSerializerProvider _serializerProvider>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ObjectMapper setSubtypeResolver(SubtypeResolver subtyperesolver)
	{
		_subtypeResolver = subtyperesolver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field SubtypeResolver _subtypeResolver>
		_deserializationConfig = _deserializationConfig.with(subtyperesolver);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1253 <Method DeserializationConfig DeserializationConfig.with(SubtypeResolver)>
	//    8   14:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(subtyperesolver);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #175 <Field SerializationConfig _serializationConfig>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #1256 <Method SerializationConfig SerializationConfig.with(SubtypeResolver)>
	//   14   26:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   15   29:aload_0         
	//   16   30:areturn         
	}

	public ObjectMapper setTimeZone(TimeZone timezone)
	{
		_deserializationConfig = _deserializationConfig.with(timezone);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1261 <Method DeserializationConfig DeserializationConfig.with(TimeZone)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(timezone);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1264 <Method SerializationConfig SerializationConfig.with(TimeZone)>
	//   11   21:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public ObjectMapper setTypeFactory(TypeFactory typefactory)
	{
		_typeFactory = typefactory;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field TypeFactory _typeFactory>
		_deserializationConfig = _deserializationConfig.with(typefactory);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1269 <Method DeserializationConfig DeserializationConfig.with(TypeFactory)>
	//    8   14:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(typefactory);
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:getfield        #175 <Field SerializationConfig _serializationConfig>
	//   12   22:aload_1         
	//   13   23:invokevirtual   #1272 <Method SerializationConfig SerializationConfig.with(TypeFactory)>
	//   14   26:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   15   29:aload_0         
	//   16   30:areturn         
	}

	public ObjectMapper setVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
	{
		_deserializationConfig = _deserializationConfig.withVisibility(propertyaccessor, visibility);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #1278 <Method DeserializationConfig DeserializationConfig.withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    6   10:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.withVisibility(propertyaccessor, visibility);
	//    7   13:aload_0         
	//    8   14:aload_0         
	//    9   15:getfield        #175 <Field SerializationConfig _serializationConfig>
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #1281 <Method SerializationConfig SerializationConfig.withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   13   23:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   14   26:aload_0         
	//   15   27:areturn         
	}

	public ObjectMapper setVisibility(VisibilityChecker visibilitychecker)
	{
		_deserializationConfig = _deserializationConfig.with(visibilitychecker);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #180 <Field DeserializationConfig _deserializationConfig>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1285 <Method DeserializationConfig DeserializationConfig.with(VisibilityChecker)>
	//    5    9:putfield        #180 <Field DeserializationConfig _deserializationConfig>
		_serializationConfig = _serializationConfig.with(visibilitychecker);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getfield        #175 <Field SerializationConfig _serializationConfig>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #1288 <Method SerializationConfig SerializationConfig.with(VisibilityChecker)>
	//   11   21:putfield        #175 <Field SerializationConfig _serializationConfig>
		return this;
	//   12   24:aload_0         
	//   13   25:areturn         
	}

	public void setVisibilityChecker(VisibilityChecker visibilitychecker)
	{
		setVisibility(visibilitychecker);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1293 <Method ObjectMapper setVisibility(VisibilityChecker)>
	//    3    5:pop             
	//    4    6:return          
	}

	public JsonParser treeAsTokens(TreeNode treenode)
	{
		return ((JsonParser) (new TreeTraversingParser((JsonNode)treenode, ((ObjectCodec) (this)))));
	//    0    0:new             #1298 <Class TreeTraversingParser>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:checkcast       #64  <Class JsonNode>
	//    4    8:aload_0         
	//    5    9:invokespecial   #1301 <Method void TreeTraversingParser(JsonNode, ObjectCodec)>
	//    6   12:areturn         
	}

	public Object treeToValue(TreeNode treenode, Class class1)
		throws JsonProcessingException
	{
		if(class1 == java/lang/Object)
			break MISSING_BLOCK_LABEL_20;
	//    0    0:aload_2         
	//    1    1:ldc2            #353 <Class Object>
	//    2    4:if_acmpeq       20
		if(class1.isAssignableFrom(((Object) (treenode)).getClass()))
	//*   3    7:aload_2         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #357 <Method Class Object.getClass()>
	//*   6   12:invokevirtual   #429 <Method boolean Class.isAssignableFrom(Class)>
	//*   7   15:ifeq            20
			return ((Object) (treenode));
	//    8   18:aload_1         
	//    9   19:areturn         
		try
		{
			treenode = ((TreeNode) (readValue(treeAsTokens(treenode), class1)));
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokevirtual   #1305 <Method JsonParser treeAsTokens(TreeNode)>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #1307 <Method Object readValue(JsonParser, Class)>
	//   16   30:astore_1        
		}
	//*  17   31:aload_1         
	//*  18   32:areturn         
		// Misplaced declaration of an exception variable
		catch(TreeNode treenode)
	//*  19   33:astore_1        
		{
			throw treenode;
	//   20   34:aload_1         
	//   21   35:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(TreeNode treenode)
	//*  22   36:astore_1        
		{
			throw new IllegalArgumentException(((IOException) (treenode)).getMessage(), ((Throwable) (treenode)));
	//   23   37:new             #417 <Class IllegalArgumentException>
	//   24   40:dup             
	//   25   41:aload_1         
	//   26   42:invokevirtual   #502 <Method String IOException.getMessage()>
	//   27   45:aload_1         
	//   28   46:invokespecial   #505 <Method void IllegalArgumentException(String, Throwable)>
	//   29   49:athrow          
		}
		return ((Object) (treenode));
	}

	public JsonNode valueToTree(Object obj)
		throws IllegalArgumentException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		TokenBuffer tokenbuffer = new TokenBuffer(((ObjectCodec) (this)), false);
	//    4    6:new             #431 <Class TokenBuffer>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:invokespecial   #434 <Method void TokenBuffer(ObjectCodec, boolean)>
	//    9   15:astore_3        
		Object obj1 = ((Object) (tokenbuffer));
	//   10   16:aload_3         
	//   11   17:astore_2        
		if(isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
	//*  12   18:aload_0         
	//*  13   19:getstatic       #440 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//*  14   22:invokevirtual   #443 <Method boolean isEnabled(DeserializationFeature)>
	//*  15   25:ifeq            34
			obj1 = ((Object) (tokenbuffer.forceUseOfBigDecimal(true)));
	//   16   28:aload_3         
	//   17   29:iconst_1        
	//   18   30:invokevirtual   #447 <Method TokenBuffer TokenBuffer.forceUseOfBigDecimal(boolean)>
	//   19   33:astore_2        
		try
		{
			writeValue(((JsonGenerator) (obj1)), obj);
	//   20   34:aload_0         
	//   21   35:aload_2         
	//   22   36:aload_1         
	//   23   37:invokevirtual   #1313 <Method void writeValue(JsonGenerator, Object)>
			obj = ((Object) (((TokenBuffer) (obj1)).asParser()));
	//   24   40:aload_2         
	//   25   41:invokevirtual   #458 <Method JsonParser TokenBuffer.asParser()>
	//   26   44:astore_1        
			obj1 = ((Object) ((JsonNode)readTree(((JsonParser) (obj)))));
	//   27   45:aload_0         
	//   28   46:aload_1         
	//   29   47:invokevirtual   #1315 <Method TreeNode readTree(JsonParser)>
	//   30   50:checkcast       #64  <Class JsonNode>
	//   31   53:astore_2        
			((JsonParser) (obj)).close();
	//   32   54:aload_1         
	//   33   55:invokevirtual   #489 <Method void JsonParser.close()>
		}
	//*  34   58:aload_2         
	//*  35   59:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  36   60:astore_1        
		{
			throw new IllegalArgumentException(((IOException) (obj)).getMessage(), ((Throwable) (obj)));
	//   37   61:new             #417 <Class IllegalArgumentException>
	//   38   64:dup             
	//   39   65:aload_1         
	//   40   66:invokevirtual   #502 <Method String IOException.getMessage()>
	//   41   69:aload_1         
	//   42   70:invokespecial   #505 <Method void IllegalArgumentException(String, Throwable)>
	//   43   73:athrow          
		}
		return ((JsonNode) (obj1));
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #1322 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public void writeTree(JsonGenerator jsongenerator, TreeNode treenode)
		throws IOException, JsonProcessingException
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_3        
		_serializerProvider(serializationconfig).serializeValue(jsongenerator, ((Object) (treenode)));
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #277 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		if(serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
	//*   9   15:aload_3         
	//*  10   16:getstatic       #304 <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//*  11   19:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  12   22:ifeq            29
			jsongenerator.flush();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #310 <Method void JsonGenerator.flush()>
	//   15   29:return          
	}

	public void writeTree(JsonGenerator jsongenerator, JsonNode jsonnode)
		throws IOException, JsonProcessingException
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_3        
		_serializerProvider(serializationconfig).serializeValue(jsongenerator, ((Object) (jsonnode)));
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #277 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
		if(serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
	//*   9   15:aload_3         
	//*  10   16:getstatic       #304 <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//*  11   19:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  12   22:ifeq            29
			jsongenerator.flush();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #310 <Method void JsonGenerator.flush()>
	//   15   29:return          
	}

	public void writeValue(JsonGenerator jsongenerator, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_3        
		if(serializationconfig.isEnabled(SerializationFeature.INDENT_OUTPUT) && jsongenerator.getPrettyPrinter() == null)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #1330 <Field SerializationFeature SerializationFeature.INDENT_OUTPUT>
	//*   5    9:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*   6   12:ifeq            31
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #1333 <Method PrettyPrinter JsonGenerator.getPrettyPrinter()>
	//*   9   19:ifnonnull       31
			jsongenerator.setPrettyPrinter(serializationconfig.constructDefaultPrettyPrinter());
	//   10   22:aload_1         
	//   11   23:aload_3         
	//   12   24:invokevirtual   #509 <Method PrettyPrinter SerializationConfig.constructDefaultPrettyPrinter()>
	//   13   27:invokevirtual   #1337 <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
	//   14   30:pop             
		if(serializationconfig.isEnabled(SerializationFeature.CLOSE_CLOSEABLE) && (obj instanceof Closeable))
	//*  15   31:aload_3         
	//*  16   32:getstatic       #404 <Field SerializationFeature SerializationFeature.CLOSE_CLOSEABLE>
	//*  17   35:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  18   38:ifeq            56
	//*  19   41:aload_2         
	//*  20   42:instanceof      #270 <Class Closeable>
	//*  21   45:ifeq            56
		{
			_writeCloseableValue(jsongenerator, obj, serializationconfig);
	//   22   48:aload_0         
	//   23   49:aload_1         
	//   24   50:aload_2         
	//   25   51:aload_3         
	//   26   52:invokespecial   #1339 <Method void _writeCloseableValue(JsonGenerator, Object, SerializationConfig)>
		} else
	//*  27   55:return          
		{
			_serializerProvider(serializationconfig).serializeValue(jsongenerator, obj);
	//   28   56:aload_0         
	//   29   57:aload_3         
	//   30   58:invokevirtual   #273 <Method DefaultSerializerProvider _serializerProvider(SerializationConfig)>
	//   31   61:aload_1         
	//   32   62:aload_2         
	//   33   63:invokevirtual   #277 <Method void DefaultSerializerProvider.serializeValue(JsonGenerator, Object)>
			if(serializationconfig.isEnabled(SerializationFeature.FLUSH_AFTER_WRITE_VALUE))
	//*  34   66:aload_3         
	//*  35   67:getstatic       #304 <Field SerializationFeature SerializationFeature.FLUSH_AFTER_WRITE_VALUE>
	//*  36   70:invokevirtual   #307 <Method boolean SerializationConfig.isEnabled(SerializationFeature)>
	//*  37   73:ifeq            55
			{
				jsongenerator.flush();
	//   38   76:aload_1         
	//   39   77:invokevirtual   #310 <Method void JsonGenerator.flush()>
				return;
	//   40   80:return          
			}
		}
	}

	public void writeValue(File file, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		_configAndWriteValue(_jsonFactory.createGenerator(file, JsonEncoding.UTF8), obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:getstatic       #1346 <Field JsonEncoding JsonEncoding.UTF8>
	//    5    9:invokevirtual   #1350 <Method JsonGenerator JsonFactory.createGenerator(File, JsonEncoding)>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #1352 <Method void _configAndWriteValue(JsonGenerator, Object)>
	//    8   16:return          
	}

	public void writeValue(OutputStream outputstream, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		_configAndWriteValue(_jsonFactory.createGenerator(outputstream, JsonEncoding.UTF8), obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:getstatic       #1346 <Field JsonEncoding JsonEncoding.UTF8>
	//    5    9:invokevirtual   #1356 <Method JsonGenerator JsonFactory.createGenerator(OutputStream, JsonEncoding)>
	//    6   12:aload_2         
	//    7   13:invokevirtual   #1352 <Method void _configAndWriteValue(JsonGenerator, Object)>
	//    8   16:return          
	}

	public void writeValue(Writer writer1, Object obj)
		throws IOException, JsonGenerationException, JsonMappingException
	{
		_configAndWriteValue(_jsonFactory.createGenerator(writer1), obj);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #143 <Field JsonFactory _jsonFactory>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1360 <Method JsonGenerator JsonFactory.createGenerator(Writer)>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #1352 <Method void _configAndWriteValue(JsonGenerator, Object)>
	//    7   13:return          
	}

	public byte[] writeValueAsBytes(Object obj)
		throws JsonProcessingException
	{
		ByteArrayBuilder bytearraybuilder = new ByteArrayBuilder(_jsonFactory._getBufferRecycler());
	//    0    0:new             #1364 <Class ByteArrayBuilder>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #143 <Field JsonFactory _jsonFactory>
	//    4    8:invokevirtual   #1368 <Method com.fasterxml.jackson.core.util.BufferRecycler JsonFactory._getBufferRecycler()>
	//    5   11:invokespecial   #1371 <Method void ByteArrayBuilder(com.fasterxml.jackson.core.util.BufferRecycler)>
	//    6   14:astore_2        
		try
		{
			_configAndWriteValue(_jsonFactory.createGenerator(((OutputStream) (bytearraybuilder)), JsonEncoding.UTF8), obj);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #143 <Field JsonFactory _jsonFactory>
	//   10   20:aload_2         
	//   11   21:getstatic       #1346 <Field JsonEncoding JsonEncoding.UTF8>
	//   12   24:invokevirtual   #1356 <Method JsonGenerator JsonFactory.createGenerator(OutputStream, JsonEncoding)>
	//   13   27:aload_1         
	//   14   28:invokevirtual   #1352 <Method void _configAndWriteValue(JsonGenerator, Object)>
		}
	//*  15   31:aload_2         
	//*  16   32:invokevirtual   #1375 <Method byte[] ByteArrayBuilder.toByteArray()>
	//*  17   35:astore_1        
	//*  18   36:aload_2         
	//*  19   37:invokevirtual   #1378 <Method void ByteArrayBuilder.release()>
	//*  20   40:aload_1         
	//*  21   41:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  22   42:astore_1        
		{
			throw obj;
	//   23   43:aload_1         
	//   24   44:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  25   45:astore_1        
		{
			throw JsonMappingException.fromUnexpectedIOE(((IOException) (obj)));
	//   26   46:aload_1         
	//   27   47:invokestatic    #1382 <Method JsonMappingException JsonMappingException.fromUnexpectedIOE(IOException)>
	//   28   50:athrow          
		}
		obj = ((Object) (bytearraybuilder.toByteArray()));
		bytearraybuilder.release();
		return ((byte []) (obj));
	}

	public String writeValueAsString(Object obj)
		throws JsonProcessingException
	{
		SegmentedStringWriter segmentedstringwriter = new SegmentedStringWriter(_jsonFactory._getBufferRecycler());
	//    0    0:new             #1386 <Class SegmentedStringWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #143 <Field JsonFactory _jsonFactory>
	//    4    8:invokevirtual   #1368 <Method com.fasterxml.jackson.core.util.BufferRecycler JsonFactory._getBufferRecycler()>
	//    5   11:invokespecial   #1387 <Method void SegmentedStringWriter(com.fasterxml.jackson.core.util.BufferRecycler)>
	//    6   14:astore_2        
		try
		{
			_configAndWriteValue(_jsonFactory.createGenerator(((Writer) (segmentedstringwriter))), obj);
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #143 <Field JsonFactory _jsonFactory>
	//   10   20:aload_2         
	//   11   21:invokevirtual   #1360 <Method JsonGenerator JsonFactory.createGenerator(Writer)>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #1352 <Method void _configAndWriteValue(JsonGenerator, Object)>
		}
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #1390 <Method String SegmentedStringWriter.getAndClear()>
	//*  16   32:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  17   33:astore_1        
		{
			throw obj;
	//   18   34:aload_1         
	//   19   35:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  20   36:astore_1        
		{
			throw JsonMappingException.fromUnexpectedIOE(((IOException) (obj)));
	//   21   37:aload_1         
	//   22   38:invokestatic    #1382 <Method JsonMappingException JsonMappingException.fromUnexpectedIOE(IOException)>
	//   23   41:athrow          
		}
		return segmentedstringwriter.getAndClear();
	}

	public ObjectWriter writer()
	{
		return _newWriter(getSerializationConfig());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    4    8:areturn         
	}

	public ObjectWriter writer(Base64Variant base64variant)
	{
		return _newWriter(getSerializationConfig().with(base64variant));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1136 <Method SerializationConfig SerializationConfig.with(Base64Variant)>
	//    5    9:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    6   12:areturn         
	}

	public ObjectWriter writer(FormatSchema formatschema)
	{
		_verifySchemaType(formatschema);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #1051 <Method void _verifySchemaType(FormatSchema)>
		return _newWriter(getSerializationConfig(), formatschema);
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #1398 <Method ObjectWriter _newWriter(SerializationConfig, FormatSchema)>
	//    8   14:areturn         
	}

	public ObjectWriter writer(PrettyPrinter prettyprinter)
	{
		PrettyPrinter prettyprinter1 = prettyprinter;
	//    0    0:aload_1         
	//    1    1:astore_2        
		if(prettyprinter == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       10
			prettyprinter1 = ObjectWriter.NULL_PRETTY_PRINTER;
	//    4    6:getstatic       #1402 <Field PrettyPrinter ObjectWriter.NULL_PRETTY_PRINTER>
	//    5    9:astore_2        
		return _newWriter(getSerializationConfig(), ((JavaType) (null)), prettyprinter1);
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    9   15:aconst_null     
	//   10   16:aload_2         
	//   11   17:invokevirtual   #1404 <Method ObjectWriter _newWriter(SerializationConfig, JavaType, PrettyPrinter)>
	//   12   20:areturn         
	}

	public ObjectWriter writer(CharacterEscapes characterescapes)
	{
		return _newWriter(getSerializationConfig()).with(characterescapes);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #1407 <Method ObjectWriter ObjectWriter.with(CharacterEscapes)>
	//    6   12:areturn         
	}

	public ObjectWriter writer(SerializationFeature serializationfeature)
	{
		return _newWriter(getSerializationConfig().with(serializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #725 <Method SerializationConfig SerializationConfig.with(SerializationFeature)>
	//    5    9:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    6   12:areturn         
	}

	public transient ObjectWriter writer(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
	{
		return _newWriter(getSerializationConfig().with(serializationfeature, aserializationfeature));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #797 <Method SerializationConfig SerializationConfig.with(SerializationFeature, SerializationFeature[])>
	//    6   10:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    7   13:areturn         
	}

	public ObjectWriter writer(ContextAttributes contextattributes)
	{
		return _newWriter(getSerializationConfig().with(contextattributes));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1413 <Method SerializationConfig SerializationConfig.with(ContextAttributes)>
	//    5    9:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    6   12:areturn         
	}

	public ObjectWriter writer(FilterProvider filterprovider)
	{
		return _newWriter(getSerializationConfig().withFilters(filterprovider));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1166 <Method SerializationConfig SerializationConfig.withFilters(FilterProvider)>
	//    5    9:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    6   12:areturn         
	}

	public ObjectWriter writer(DateFormat dateformat)
	{
		return _newWriter(getSerializationConfig().with(dateformat));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #1147 <Method SerializationConfig SerializationConfig.with(DateFormat)>
	//    5    9:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    6   12:areturn         
	}

	public ObjectWriter writerFor(TypeReference typereference)
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_2        
		if(typereference == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			typereference = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:aload_0         
	//*   8   12:aload_2         
	//*   9   13:aload_1         
	//*  10   14:aconst_null     
	//*  11   15:invokevirtual   #1404 <Method ObjectWriter _newWriter(SerializationConfig, JavaType, PrettyPrinter)>
	//*  12   18:areturn         
			typereference = ((TypeReference) (_typeFactory.constructType(typereference)));
	//   13   19:aload_0         
	//   14   20:getfield        #153 <Field TypeFactory _typeFactory>
	//   15   23:aload_1         
	//   16   24:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//   17   27:astore_1        
		return _newWriter(serializationconfig, ((JavaType) (typereference)), ((PrettyPrinter) (null)));
	//*  18   28:goto            11
	}

	public ObjectWriter writerFor(JavaType javatype)
	{
		return _newWriter(getSerializationConfig(), javatype, ((PrettyPrinter) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #1404 <Method ObjectWriter _newWriter(SerializationConfig, JavaType, PrettyPrinter)>
	//    6   10:areturn         
	}

	public ObjectWriter writerFor(Class class1)
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_2        
		if(class1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			class1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:aload_0         
	//*   8   12:aload_2         
	//*   9   13:aload_1         
	//*  10   14:aconst_null     
	//*  11   15:invokevirtual   #1404 <Method ObjectWriter _newWriter(SerializationConfig, JavaType, PrettyPrinter)>
	//*  12   18:areturn         
			class1 = ((Class) (_typeFactory.constructType(((Type) (class1)))));
	//   13   19:aload_0         
	//   14   20:getfield        #153 <Field TypeFactory _typeFactory>
	//   15   23:aload_1         
	//   16   24:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//   17   27:astore_1        
		return _newWriter(serializationconfig, ((JavaType) (class1)), ((PrettyPrinter) (null)));
	//*  18   28:goto            11
	}

	public ObjectWriter writerWithDefaultPrettyPrinter()
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_1        
		return _newWriter(serializationconfig, ((JavaType) (null)), serializationconfig.getDefaultPrettyPrinter());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:aconst_null     
	//    6    8:aload_1         
	//    7    9:invokevirtual   #1425 <Method PrettyPrinter SerializationConfig.getDefaultPrettyPrinter()>
	//    8   12:invokevirtual   #1404 <Method ObjectWriter _newWriter(SerializationConfig, JavaType, PrettyPrinter)>
	//    9   15:areturn         
	}

	public ObjectWriter writerWithType(TypeReference typereference)
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_2        
		if(typereference == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			typereference = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:aload_0         
	//*   8   12:aload_2         
	//*   9   13:aload_1         
	//*  10   14:aconst_null     
	//*  11   15:invokevirtual   #1404 <Method ObjectWriter _newWriter(SerializationConfig, JavaType, PrettyPrinter)>
	//*  12   18:areturn         
			typereference = ((TypeReference) (_typeFactory.constructType(typereference)));
	//   13   19:aload_0         
	//   14   20:getfield        #153 <Field TypeFactory _typeFactory>
	//   15   23:aload_1         
	//   16   24:invokevirtual   #730 <Method JavaType TypeFactory.constructType(TypeReference)>
	//   17   27:astore_1        
		return _newWriter(serializationconfig, ((JavaType) (typereference)), ((PrettyPrinter) (null)));
	//*  18   28:goto            11
	}

	public ObjectWriter writerWithType(JavaType javatype)
	{
		return _newWriter(getSerializationConfig(), javatype, ((PrettyPrinter) (null)));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:aconst_null     
	//    5    7:invokevirtual   #1404 <Method ObjectWriter _newWriter(SerializationConfig, JavaType, PrettyPrinter)>
	//    6   10:areturn         
	}

	public ObjectWriter writerWithType(Class class1)
	{
		SerializationConfig serializationconfig = getSerializationConfig();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    2    4:astore_2        
		if(class1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       19
			class1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:aload_0         
	//*   8   12:aload_2         
	//*   9   13:aload_1         
	//*  10   14:aconst_null     
	//*  11   15:invokevirtual   #1404 <Method ObjectWriter _newWriter(SerializationConfig, JavaType, PrettyPrinter)>
	//*  12   18:areturn         
			class1 = ((Class) (_typeFactory.constructType(((Type) (class1)))));
	//   13   19:aload_0         
	//   14   20:getfield        #153 <Field TypeFactory _typeFactory>
	//   15   23:aload_1         
	//   16   24:invokevirtual   #659 <Method JavaType TypeFactory.constructType(Type)>
	//   17   27:astore_1        
		return _newWriter(serializationconfig, ((JavaType) (class1)), ((PrettyPrinter) (null)));
	//*  18   28:goto            11
	}

	public ObjectWriter writerWithView(Class class1)
	{
		return _newWriter(getSerializationConfig().withView(class1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #397 <Method SerializationConfig getSerializationConfig()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #411 <Method SerializationConfig SerializationConfig.withView(Class)>
	//    5    9:invokevirtual   #1394 <Method ObjectWriter _newWriter(SerializationConfig)>
	//    6   12:areturn         
	}

	protected static final AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR;
	protected static final BaseSettings DEFAULT_BASE;
	private static final JavaType JSON_NODE_TYPE = SimpleType.constructUnsafe(com/fasterxml/jackson/databind/JsonNode);
	protected static final VisibilityChecker STD_VISIBILITY_CHECKER;
	protected static final PrettyPrinter _defaultPrettyPrinter = new DefaultPrettyPrinter();
	private static final long serialVersionUID = 1L;
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
	//    0    0:ldc1            #64  <Class JsonNode>
	//    1    2:invokestatic    #70  <Method SimpleType SimpleType.constructUnsafe(Class)>
	//    2    5:putstatic       #72  <Field JavaType JSON_NODE_TYPE>
		DEFAULT_ANNOTATION_INTROSPECTOR = ((AnnotationIntrospector) (new JacksonAnnotationIntrospector()));
	//    3    8:new             #74  <Class JacksonAnnotationIntrospector>
	//    4   11:dup             
	//    5   12:invokespecial   #77  <Method void JacksonAnnotationIntrospector()>
	//    6   15:putstatic       #79  <Field AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR>
		STD_VISIBILITY_CHECKER = ((VisibilityChecker) (com.fasterxml.jackson.databind.introspect.VisibilityChecker.Std.defaultInstance()));
	//    7   18:invokestatic    #85  <Method com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std.defaultInstance()>
	//    8   21:putstatic       #87  <Field VisibilityChecker STD_VISIBILITY_CHECKER>
	//    9   24:new             #89  <Class DefaultPrettyPrinter>
	//   10   27:dup             
	//   11   28:invokespecial   #90  <Method void DefaultPrettyPrinter()>
	//   12   31:putstatic       #92  <Field PrettyPrinter _defaultPrettyPrinter>
		DEFAULT_BASE = new BaseSettings(((ClassIntrospector) (null)), DEFAULT_ANNOTATION_INTROSPECTOR, STD_VISIBILITY_CHECKER, ((PropertyNamingStrategy) (null)), TypeFactory.defaultInstance(), ((TypeResolverBuilder) (null)), ((DateFormat) (StdDateFormat.instance)), ((HandlerInstantiator) (null)), Locale.getDefault(), ((TimeZone) (null)), Base64Variants.getDefaultVariant());
	//   13   34:new             #94  <Class BaseSettings>
	//   14   37:dup             
	//   15   38:aconst_null     
	//   16   39:getstatic       #79  <Field AnnotationIntrospector DEFAULT_ANNOTATION_INTROSPECTOR>
	//   17   42:getstatic       #87  <Field VisibilityChecker STD_VISIBILITY_CHECKER>
	//   18   45:aconst_null     
	//   19   46:invokestatic    #99  <Method TypeFactory TypeFactory.defaultInstance()>
	//   20   49:aconst_null     
	//   21   50:getstatic       #105 <Field StdDateFormat StdDateFormat.instance>
	//   22   53:aconst_null     
	//   23   54:invokestatic    #111 <Method Locale Locale.getDefault()>
	//   24   57:aconst_null     
	//   25   58:invokestatic    #117 <Method Base64Variant Base64Variants.getDefaultVariant()>
	//   26   61:invokespecial   #120 <Method void BaseSettings(ClassIntrospector, AnnotationIntrospector, VisibilityChecker, PropertyNamingStrategy, TypeFactory, TypeResolverBuilder, DateFormat, HandlerInstantiator, Locale, TimeZone, Base64Variant)>
	//   27   64:putstatic       #122 <Field BaseSettings DEFAULT_BASE>
	//*  28   67:return          
	}
}
