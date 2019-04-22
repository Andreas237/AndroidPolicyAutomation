// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			UnresolvedForwardReference, ResolvableDeserializer, DeserializerFactory, DeserializerCache

public abstract class DefaultDeserializationContext extends DeserializationContext
	implements Serializable
{
	public static final class Impl extends DefaultDeserializationContext
	{

		public DefaultDeserializationContext createInstance(DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
		{
			return ((DefaultDeserializationContext) (new Impl(this, deserializationconfig, jsonparser, injectablevalues)));
		//    0    0:new             #2   <Class DefaultDeserializationContext$Impl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:invokespecial   #27  <Method void DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl, DeserializationConfig, JsonParser, InjectableValues)>
		//    7   11:areturn         
		}

		public DefaultDeserializationContext with(DeserializerFactory deserializerfactory)
		{
			return ((DefaultDeserializationContext) (new Impl(this, deserializerfactory)));
		//    0    0:new             #2   <Class DefaultDeserializationContext$Impl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #31  <Method void DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl, DeserializerFactory)>
		//    5    9:areturn         
		}

		private static final long serialVersionUID = 1L;

		protected Impl(Impl impl, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
		{
			super(((DefaultDeserializationContext) (impl)), deserializationconfig, jsonparser, injectablevalues);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #14  <Method void DefaultDeserializationContext(DefaultDeserializationContext, DeserializationConfig, JsonParser, InjectableValues)>
		//    6    9:return          
		}

		protected Impl(Impl impl, DeserializerFactory deserializerfactory)
		{
			super(((DefaultDeserializationContext) (impl)), deserializerfactory);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #19  <Method void DefaultDeserializationContext(DefaultDeserializationContext, DeserializerFactory)>
		//    4    6:return          
		}

		public Impl(DeserializerFactory deserializerfactory)
		{
			super(deserializerfactory, ((DeserializerCache) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #23  <Method void DefaultDeserializationContext(DeserializerFactory, DeserializerCache)>
		//    4    6:return          
		}
	}


	protected DefaultDeserializationContext(DefaultDeserializationContext defaultdeserializationcontext, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
	{
		super(((DeserializationContext) (defaultdeserializationcontext)), deserializationconfig, jsonparser, injectablevalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #24  <Method void DeserializationContext(DeserializationContext, DeserializationConfig, JsonParser, InjectableValues)>
	//    6    9:return          
	}

	protected DefaultDeserializationContext(DefaultDeserializationContext defaultdeserializationcontext, DeserializerFactory deserializerfactory)
	{
		super(((DeserializationContext) (defaultdeserializationcontext)), deserializerfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #29  <Method void DeserializationContext(DeserializationContext, DeserializerFactory)>
	//    4    6:return          
	}

	protected DefaultDeserializationContext(DeserializerFactory deserializerfactory, DeserializerCache deserializercache)
	{
		super(deserializerfactory, deserializercache);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #32  <Method void DeserializationContext(DeserializerFactory, DeserializerCache)>
	//    4    6:return          
	}

	public void checkUnresolvedObjectId()
		throws UnresolvedForwardReference
	{
		Object obj1;
		if(_objectIds == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field LinkedHashMap _objectIds>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		if(!isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS))
	//*   4    8:aload_0         
	//*   5    9:getstatic       #44  <Field DeserializationFeature DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS>
	//*   6   12:invokevirtual   #48  <Method boolean isEnabled(DeserializationFeature)>
	//*   7   15:ifne            19
			return;
	//    8   18:return          
		obj1 = null;
	//    9   19:aconst_null     
	//   10   20:astore_2        
		Iterator iterator = _objectIds.entrySet().iterator();
	//   11   21:aload_0         
	//   12   22:getfield        #38  <Field LinkedHashMap _objectIds>
	//   13   25:invokevirtual   #54  <Method Set LinkedHashMap.entrySet()>
	//   14   28:invokeinterface #60  <Method Iterator Set.iterator()>
	//   15   33:astore_3        
		do
		{
label0:
			{
				Object obj3;
				do
				{
					if(!iterator.hasNext())
						break label0;
	//   16   34:aload_3         
	//   17   35:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   18   40:ifeq            162
					obj3 = ((Object) ((ReadableObjectId)((java.util.Map.Entry)iterator.next()).getValue()));
	//   19   43:aload_3         
	//   20   44:invokeinterface #70  <Method Object Iterator.next()>
	//   21   49:checkcast       #72  <Class java.util.Map$Entry>
	//   22   52:invokeinterface #75  <Method Object java.util.Map$Entry.getValue()>
	//   23   57:checkcast       #77  <Class ReadableObjectId>
	//   24   60:astore          5
				} while(!((ReadableObjectId) (obj3)).hasReferringProperties() || tryToResolveUnresolvedObjectId(((ReadableObjectId) (obj3))));
	//   25   62:aload           5
	//   26   64:invokevirtual   #80  <Method boolean ReadableObjectId.hasReferringProperties()>
	//   27   67:ifne            73
	//   28   70:goto            34
	//   29   73:aload_0         
	//   30   74:aload           5
	//   31   76:invokevirtual   #84  <Method boolean tryToResolveUnresolvedObjectId(ReadableObjectId)>
	//   32   79:ifeq            85
	//*  33   82:goto            34
				Object obj = obj1;
	//   34   85:aload_2         
	//   35   86:astore_1        
				if(obj1 == null)
	//*  36   87:aload_2         
	//*  37   88:ifnonnull       105
					obj = ((Object) (new UnresolvedForwardReference(getParser(), "Unresolved forward references for: ")));
	//   38   91:new             #36  <Class UnresolvedForwardReference>
	//   39   94:dup             
	//   40   95:aload_0         
	//   41   96:invokevirtual   #88  <Method JsonParser getParser()>
	//   42   99:ldc1            #90  <String "Unresolved forward references for: ">
	//   43  101:invokespecial   #93  <Method void UnresolvedForwardReference(JsonParser, String)>
	//   44  104:astore_1        
				Object obj2 = ((ReadableObjectId) (obj3)).getKey().key;
	//   45  105:aload           5
	//   46  107:invokevirtual   #97  <Method com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey ReadableObjectId.getKey()>
	//   47  110:getfield        #103 <Field Object com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey.key>
	//   48  113:astore          4
				obj3 = ((Object) (((ReadableObjectId) (obj3)).referringProperties()));
	//   49  115:aload           5
	//   50  117:invokevirtual   #106 <Method Iterator ReadableObjectId.referringProperties()>
	//   51  120:astore          5
				do
				{
					obj1 = obj;
	//   52  122:aload_1         
	//   53  123:astore_2        
					if(!((Iterator) (obj3)).hasNext())
						break;
	//   54  124:aload           5
	//   55  126:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   56  131:ifeq            34
					obj1 = ((Object) ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring)((Iterator) (obj3)).next()));
	//   57  134:aload           5
	//   58  136:invokeinterface #70  <Method Object Iterator.next()>
	//   59  141:checkcast       #108 <Class com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring>
	//   60  144:astore_2        
					((UnresolvedForwardReference) (obj)).addUnresolvedId(obj2, ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (obj1)).getBeanType(), ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (obj1)).getLocation());
	//   61  145:aload_1         
	//   62  146:aload           4
	//   63  148:aload_2         
	//   64  149:invokevirtual   #112 <Method Class com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring.getBeanType()>
	//   65  152:aload_2         
	//   66  153:invokevirtual   #116 <Method com.fasterxml.jackson.core.JsonLocation com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring.getLocation()>
	//   67  156:invokevirtual   #120 <Method void UnresolvedForwardReference.addUnresolvedId(Object, Class, com.fasterxml.jackson.core.JsonLocation)>
				} while(true);
	//   68  159:goto            122
			}
		} while(true);
		if(obj1 == null)
	//*  69  162:aload_2         
	//*  70  163:ifnonnull       167
			return;
	//   71  166:return          
		else
			throw obj1;
	//   72  167:aload_2         
	//   73  168:athrow          
	}

	public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues);

	protected ReadableObjectId createReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey idkey)
	{
		return new ReadableObjectId(idkey);
	//    0    0:new             #77  <Class ReadableObjectId>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #128 <Method void ReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey)>
	//    4    8:areturn         
	}

	public JsonDeserializer deserializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException
	{
label0:
		{
label1:
			{
label2:
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
					if(obj instanceof JsonDeserializer)
	//*   6    8:aload_2         
	//*   7    9:instanceof      #134 <Class JsonDeserializer>
	//*   8   12:ifeq            23
					{
						annotated = ((Annotated) ((JsonDeserializer)obj));
	//    9   15:aload_2         
	//   10   16:checkcast       #134 <Class JsonDeserializer>
	//   11   19:astore_1        
					} else
	//*  12   20:goto            112
					{
						if(!(obj instanceof Class))
							break label0;
	//   13   23:aload_2         
	//   14   24:instanceof      #136 <Class Class>
	//   15   27:ifeq            176
						obj = ((Object) ((Class)obj));
	//   16   30:aload_2         
	//   17   31:checkcast       #136 <Class Class>
	//   18   34:astore_2        
						if(obj == com/fasterxml/jackson/databind/JsonDeserializer$None)
							break label1;
	//   19   35:aload_2         
	//   20   36:ldc1            #138 <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//   21   38:if_acmpeq       174
						if(ClassUtil.isBogusClass(((Class) (obj))))
	//*  22   41:aload_2         
	//*  23   42:invokestatic    #144 <Method boolean ClassUtil.isBogusClass(Class)>
	//*  24   45:ifeq            50
							return null;
	//   25   48:aconst_null     
	//   26   49:areturn         
						if(!((Class) (com/fasterxml/jackson/databind/JsonDeserializer)).isAssignableFrom(((Class) (obj))))
							break label2;
	//   27   50:ldc1            #134 <Class JsonDeserializer>
	//   28   52:aload_2         
	//   29   53:invokevirtual   #147 <Method boolean Class.isAssignableFrom(Class)>
	//   30   56:ifeq            131
						HandlerInstantiator handlerinstantiator = _config.getHandlerInstantiator();
	//   31   59:aload_0         
	//   32   60:getfield        #151 <Field DeserializationConfig _config>
	//   33   63:invokevirtual   #157 <Method HandlerInstantiator DeserializationConfig.getHandlerInstantiator()>
	//   34   66:astore          4
						if(handlerinstantiator == null)
	//*  35   68:aload           4
	//*  36   70:ifnonnull       78
							annotated = ((Annotated) (obj1));
	//   37   73:aload_3         
	//   38   74:astore_1        
						else
	//*  39   75:goto            90
							annotated = ((Annotated) (handlerinstantiator.deserializerInstance(_config, annotated, ((Class) (obj)))));
	//   40   78:aload           4
	//   41   80:aload_0         
	//   42   81:getfield        #151 <Field DeserializationConfig _config>
	//   43   84:aload_1         
	//   44   85:aload_2         
	//   45   86:invokevirtual   #162 <Method JsonDeserializer HandlerInstantiator.deserializerInstance(DeserializationConfig, Annotated, Class)>
	//   46   89:astore_1        
						if(annotated == null)
	//*  47   90:aload_1         
	//*  48   91:ifnonnull       112
							annotated = ((Annotated) ((JsonDeserializer)ClassUtil.createInstance(((Class) (obj)), _config.canOverrideAccessModifiers())));
	//   49   94:aload_2         
	//   50   95:aload_0         
	//   51   96:getfield        #151 <Field DeserializationConfig _config>
	//   52   99:invokevirtual   #165 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//   53  102:invokestatic    #168 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   54  105:checkcast       #134 <Class JsonDeserializer>
	//   55  108:astore_1        
					}
	//*  56  109:goto            112
					if(annotated instanceof ResolvableDeserializer)
	//*  57  112:aload_1         
	//*  58  113:instanceof      #170 <Class ResolvableDeserializer>
	//*  59  116:ifeq            129
						((ResolvableDeserializer)annotated).resolve(((DeserializationContext) (this)));
	//   60  119:aload_1         
	//   61  120:checkcast       #170 <Class ResolvableDeserializer>
	//   62  123:aload_0         
	//   63  124:invokeinterface #174 <Method void ResolvableDeserializer.resolve(DeserializationContext)>
					return ((JsonDeserializer) (annotated));
	//   64  129:aload_1         
	//   65  130:areturn         
				}
				annotated = ((Annotated) (new StringBuilder()));
	//   66  131:new             #176 <Class StringBuilder>
	//   67  134:dup             
	//   68  135:invokespecial   #178 <Method void StringBuilder()>
	//   69  138:astore_1        
				((StringBuilder) (annotated)).append("AnnotationIntrospector returned Class ");
	//   70  139:aload_1         
	//   71  140:ldc1            #180 <String "AnnotationIntrospector returned Class ">
	//   72  142:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   73  145:pop             
				((StringBuilder) (annotated)).append(((Class) (obj)).getName());
	//   74  146:aload_1         
	//   75  147:aload_2         
	//   76  148:invokevirtual   #188 <Method String Class.getName()>
	//   77  151:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   78  154:pop             
				((StringBuilder) (annotated)).append("; expected Class<JsonDeserializer>");
	//   79  155:aload_1         
	//   80  156:ldc1            #190 <String "; expected Class<JsonDeserializer>">
	//   81  158:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   82  161:pop             
				throw new IllegalStateException(((StringBuilder) (annotated)).toString());
	//   83  162:new             #192 <Class IllegalStateException>
	//   84  165:dup             
	//   85  166:aload_1         
	//   86  167:invokevirtual   #195 <Method String StringBuilder.toString()>
	//   87  170:invokespecial   #198 <Method void IllegalStateException(String)>
	//   88  173:athrow          
			}
			return null;
	//   89  174:aconst_null     
	//   90  175:areturn         
		}
		annotated = ((Annotated) (new StringBuilder()));
	//   91  176:new             #176 <Class StringBuilder>
	//   92  179:dup             
	//   93  180:invokespecial   #178 <Method void StringBuilder()>
	//   94  183:astore_1        
		((StringBuilder) (annotated)).append("AnnotationIntrospector returned deserializer definition of type ");
	//   95  184:aload_1         
	//   96  185:ldc1            #200 <String "AnnotationIntrospector returned deserializer definition of type ">
	//   97  187:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   98  190:pop             
		((StringBuilder) (annotated)).append(obj.getClass().getName());
	//   99  191:aload_1         
	//  100  192:aload_2         
	//  101  193:invokevirtual   #205 <Method Class Object.getClass()>
	//  102  196:invokevirtual   #188 <Method String Class.getName()>
	//  103  199:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  104  202:pop             
		((StringBuilder) (annotated)).append("; expected type JsonDeserializer or Class<JsonDeserializer> instead");
	//  105  203:aload_1         
	//  106  204:ldc1            #207 <String "; expected type JsonDeserializer or Class<JsonDeserializer> instead">
	//  107  206:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  108  209:pop             
		throw new IllegalStateException(((StringBuilder) (annotated)).toString());
	//  109  210:new             #192 <Class IllegalStateException>
	//  110  213:dup             
	//  111  214:aload_1         
	//  112  215:invokevirtual   #195 <Method String StringBuilder.toString()>
	//  113  218:invokespecial   #198 <Method void IllegalStateException(String)>
	//  114  221:athrow          
	}

	public ReadableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator, ObjectIdResolver objectidresolver)
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		if(obj == null)
	//*   2    3:aload_1         
	//*   3    4:ifnonnull       9
			return null;
	//    4    7:aconst_null     
	//    5    8:areturn         
		com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey idkey = objectidgenerator.key(obj);
	//    6    9:aload_2         
	//    7   10:aload_1         
	//    8   11:invokevirtual   #216 <Method com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey ObjectIdGenerator.key(Object)>
	//    9   14:astore          5
		obj = ((Object) (_objectIds));
	//   10   16:aload_0         
	//   11   17:getfield        #38  <Field LinkedHashMap _objectIds>
	//   12   20:astore_1        
		if(obj == null)
	//*  13   21:aload_1         
	//*  14   22:ifnonnull       39
		{
			_objectIds = new LinkedHashMap();
	//   15   25:aload_0         
	//   16   26:new             #50  <Class LinkedHashMap>
	//   17   29:dup             
	//   18   30:invokespecial   #217 <Method void LinkedHashMap()>
	//   19   33:putfield        #38  <Field LinkedHashMap _objectIds>
		} else
	//*  20   36:goto            55
		{
			obj = ((Object) ((ReadableObjectId)((LinkedHashMap) (obj)).get(((Object) (idkey)))));
	//   21   39:aload_1         
	//   22   40:aload           5
	//   23   42:invokevirtual   #221 <Method Object LinkedHashMap.get(Object)>
	//   24   45:checkcast       #77  <Class ReadableObjectId>
	//   25   48:astore_1        
			if(obj != null)
	//*  26   49:aload_1         
	//*  27   50:ifnull          55
				return ((ReadableObjectId) (obj));
	//   28   53:aload_1         
	//   29   54:areturn         
		}
		obj = ((Object) (_objectIdResolvers));
	//   30   55:aload_0         
	//   31   56:getfield        #223 <Field List _objectIdResolvers>
	//   32   59:astore_1        
		if(obj == null)
	//*  33   60:aload_1         
	//*  34   61:ifnonnull       83
		{
			_objectIdResolvers = ((List) (new ArrayList(8)));
	//   35   64:aload_0         
	//   36   65:new             #225 <Class ArrayList>
	//   37   68:dup             
	//   38   69:bipush          8
	//   39   71:invokespecial   #228 <Method void ArrayList(int)>
	//   40   74:putfield        #223 <Field List _objectIdResolvers>
			obj = ((Object) (obj1));
	//   41   77:aload           4
	//   42   79:astore_1        
		} else
	//*  43   80:goto            122
		{
			objectidgenerator = ((ObjectIdGenerator) (((List) (obj)).iterator()));
	//   44   83:aload_1         
	//   45   84:invokeinterface #231 <Method Iterator List.iterator()>
	//   46   89:astore_2        
			do
			{
				obj = ((Object) (obj1));
	//   47   90:aload           4
	//   48   92:astore_1        
				if(!((Iterator) (objectidgenerator)).hasNext())
					break;
	//   49   93:aload_2         
	//   50   94:invokeinterface #66  <Method boolean Iterator.hasNext()>
	//   51   99:ifeq            122
				obj = ((Object) ((ObjectIdResolver)((Iterator) (objectidgenerator)).next()));
	//   52  102:aload_2         
	//   53  103:invokeinterface #70  <Method Object Iterator.next()>
	//   54  108:checkcast       #233 <Class ObjectIdResolver>
	//   55  111:astore_1        
			} while(!((ObjectIdResolver) (obj)).canUseFor(objectidresolver));
	//   56  112:aload_1         
	//   57  113:aload_3         
	//   58  114:invokeinterface #237 <Method boolean ObjectIdResolver.canUseFor(ObjectIdResolver)>
	//   59  119:ifeq            90
		}
		objectidgenerator = ((ObjectIdGenerator) (obj));
	//   60  122:aload_1         
	//   61  123:astore_2        
		if(obj == null)
	//*  62  124:aload_1         
	//*  63  125:ifnonnull       147
		{
			objectidgenerator = ((ObjectIdGenerator) (objectidresolver.newForDeserialization(((Object) (this)))));
	//   64  128:aload_3         
	//   65  129:aload_0         
	//   66  130:invokeinterface #241 <Method ObjectIdResolver ObjectIdResolver.newForDeserialization(Object)>
	//   67  135:astore_2        
			_objectIdResolvers.add(((Object) (objectidgenerator)));
	//   68  136:aload_0         
	//   69  137:getfield        #223 <Field List _objectIdResolvers>
	//   70  140:aload_2         
	//   71  141:invokeinterface #245 <Method boolean List.add(Object)>
	//   72  146:pop             
		}
		obj = ((Object) (createReadableObjectId(idkey)));
	//   73  147:aload_0         
	//   74  148:aload           5
	//   75  150:invokevirtual   #247 <Method ReadableObjectId createReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey)>
	//   76  153:astore_1        
		((ReadableObjectId) (obj)).setResolver(((ObjectIdResolver) (objectidgenerator)));
	//   77  154:aload_1         
	//   78  155:aload_2         
	//   79  156:invokevirtual   #251 <Method void ReadableObjectId.setResolver(ObjectIdResolver)>
		_objectIds.put(((Object) (idkey)), obj);
	//   80  159:aload_0         
	//   81  160:getfield        #38  <Field LinkedHashMap _objectIds>
	//   82  163:aload           5
	//   83  165:aload_1         
	//   84  166:invokevirtual   #255 <Method Object LinkedHashMap.put(Object, Object)>
	//   85  169:pop             
		return ((ReadableObjectId) (obj));
	//   86  170:aload_1         
	//   87  171:areturn         
	}

	public final KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException
	{
label0:
		{
label1:
			{
label2:
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
					if(obj instanceof KeyDeserializer)
	//*   6    8:aload_2         
	//*   7    9:instanceof      #260 <Class KeyDeserializer>
	//*   8   12:ifeq            23
					{
						annotated = ((Annotated) ((KeyDeserializer)obj));
	//    9   15:aload_2         
	//   10   16:checkcast       #260 <Class KeyDeserializer>
	//   11   19:astore_1        
					} else
	//*  12   20:goto            114
					{
						if(!(obj instanceof Class))
							break label0;
	//   13   23:aload_2         
	//   14   24:instanceof      #136 <Class Class>
	//   15   27:ifeq            179
						obj = ((Object) ((Class)obj));
	//   16   30:aload_2         
	//   17   31:checkcast       #136 <Class Class>
	//   18   34:astore_2        
						if(obj == com/fasterxml/jackson/databind/KeyDeserializer$None)
							break label1;
	//   19   35:aload_2         
	//   20   36:ldc2            #262 <Class com.fasterxml.jackson.databind.KeyDeserializer$None>
	//   21   39:if_acmpeq       177
						if(ClassUtil.isBogusClass(((Class) (obj))))
	//*  22   42:aload_2         
	//*  23   43:invokestatic    #144 <Method boolean ClassUtil.isBogusClass(Class)>
	//*  24   46:ifeq            51
							return null;
	//   25   49:aconst_null     
	//   26   50:areturn         
						if(!((Class) (com/fasterxml/jackson/databind/KeyDeserializer)).isAssignableFrom(((Class) (obj))))
							break label2;
	//   27   51:ldc2            #260 <Class KeyDeserializer>
	//   28   54:aload_2         
	//   29   55:invokevirtual   #147 <Method boolean Class.isAssignableFrom(Class)>
	//   30   58:ifeq            133
						HandlerInstantiator handlerinstantiator = _config.getHandlerInstantiator();
	//   31   61:aload_0         
	//   32   62:getfield        #151 <Field DeserializationConfig _config>
	//   33   65:invokevirtual   #157 <Method HandlerInstantiator DeserializationConfig.getHandlerInstantiator()>
	//   34   68:astore          4
						if(handlerinstantiator == null)
	//*  35   70:aload           4
	//*  36   72:ifnonnull       80
							annotated = ((Annotated) (obj1));
	//   37   75:aload_3         
	//   38   76:astore_1        
						else
	//*  39   77:goto            92
							annotated = ((Annotated) (handlerinstantiator.keyDeserializerInstance(_config, annotated, ((Class) (obj)))));
	//   40   80:aload           4
	//   41   82:aload_0         
	//   42   83:getfield        #151 <Field DeserializationConfig _config>
	//   43   86:aload_1         
	//   44   87:aload_2         
	//   45   88:invokevirtual   #265 <Method KeyDeserializer HandlerInstantiator.keyDeserializerInstance(DeserializationConfig, Annotated, Class)>
	//   46   91:astore_1        
						if(annotated == null)
	//*  47   92:aload_1         
	//*  48   93:ifnonnull       114
							annotated = ((Annotated) ((KeyDeserializer)ClassUtil.createInstance(((Class) (obj)), _config.canOverrideAccessModifiers())));
	//   49   96:aload_2         
	//   50   97:aload_0         
	//   51   98:getfield        #151 <Field DeserializationConfig _config>
	//   52  101:invokevirtual   #165 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//   53  104:invokestatic    #168 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   54  107:checkcast       #260 <Class KeyDeserializer>
	//   55  110:astore_1        
					}
	//*  56  111:goto            114
					if(annotated instanceof ResolvableDeserializer)
	//*  57  114:aload_1         
	//*  58  115:instanceof      #170 <Class ResolvableDeserializer>
	//*  59  118:ifeq            131
						((ResolvableDeserializer)annotated).resolve(((DeserializationContext) (this)));
	//   60  121:aload_1         
	//   61  122:checkcast       #170 <Class ResolvableDeserializer>
	//   62  125:aload_0         
	//   63  126:invokeinterface #174 <Method void ResolvableDeserializer.resolve(DeserializationContext)>
					return ((KeyDeserializer) (annotated));
	//   64  131:aload_1         
	//   65  132:areturn         
				}
				annotated = ((Annotated) (new StringBuilder()));
	//   66  133:new             #176 <Class StringBuilder>
	//   67  136:dup             
	//   68  137:invokespecial   #178 <Method void StringBuilder()>
	//   69  140:astore_1        
				((StringBuilder) (annotated)).append("AnnotationIntrospector returned Class ");
	//   70  141:aload_1         
	//   71  142:ldc1            #180 <String "AnnotationIntrospector returned Class ">
	//   72  144:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   73  147:pop             
				((StringBuilder) (annotated)).append(((Class) (obj)).getName());
	//   74  148:aload_1         
	//   75  149:aload_2         
	//   76  150:invokevirtual   #188 <Method String Class.getName()>
	//   77  153:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   78  156:pop             
				((StringBuilder) (annotated)).append("; expected Class<KeyDeserializer>");
	//   79  157:aload_1         
	//   80  158:ldc2            #267 <String "; expected Class<KeyDeserializer>">
	//   81  161:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   82  164:pop             
				throw new IllegalStateException(((StringBuilder) (annotated)).toString());
	//   83  165:new             #192 <Class IllegalStateException>
	//   84  168:dup             
	//   85  169:aload_1         
	//   86  170:invokevirtual   #195 <Method String StringBuilder.toString()>
	//   87  173:invokespecial   #198 <Method void IllegalStateException(String)>
	//   88  176:athrow          
			}
			return null;
	//   89  177:aconst_null     
	//   90  178:areturn         
		}
		annotated = ((Annotated) (new StringBuilder()));
	//   91  179:new             #176 <Class StringBuilder>
	//   92  182:dup             
	//   93  183:invokespecial   #178 <Method void StringBuilder()>
	//   94  186:astore_1        
		((StringBuilder) (annotated)).append("AnnotationIntrospector returned key deserializer definition of type ");
	//   95  187:aload_1         
	//   96  188:ldc2            #269 <String "AnnotationIntrospector returned key deserializer definition of type ">
	//   97  191:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//   98  194:pop             
		((StringBuilder) (annotated)).append(obj.getClass().getName());
	//   99  195:aload_1         
	//  100  196:aload_2         
	//  101  197:invokevirtual   #205 <Method Class Object.getClass()>
	//  102  200:invokevirtual   #188 <Method String Class.getName()>
	//  103  203:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  104  206:pop             
		((StringBuilder) (annotated)).append("; expected type KeyDeserializer or Class<KeyDeserializer> instead");
	//  105  207:aload_1         
	//  106  208:ldc2            #271 <String "; expected type KeyDeserializer or Class<KeyDeserializer> instead">
	//  107  211:invokevirtual   #184 <Method StringBuilder StringBuilder.append(String)>
	//  108  214:pop             
		throw new IllegalStateException(((StringBuilder) (annotated)).toString());
	//  109  215:new             #192 <Class IllegalStateException>
	//  110  218:dup             
	//  111  219:aload_1         
	//  112  220:invokevirtual   #195 <Method String StringBuilder.toString()>
	//  113  223:invokespecial   #198 <Method void IllegalStateException(String)>
	//  114  226:athrow          
	}

	protected boolean tryToResolveUnresolvedObjectId(ReadableObjectId readableobjectid)
	{
		return readableobjectid.tryToResolveUnresolved(((DeserializationContext) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #275 <Method boolean ReadableObjectId.tryToResolveUnresolved(DeserializationContext)>
	//    3    5:ireturn         
	}

	public abstract DefaultDeserializationContext with(DeserializerFactory deserializerfactory);

	private static final long serialVersionUID = 1L;
	private List _objectIdResolvers;
	protected transient LinkedHashMap _objectIds;
}
