// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.*;
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

		public DefaultDeserializationContext copy()
		{
			if(((Object)this).getClass() != com/fasterxml/jackson/databind/deser/DefaultDeserializationContext$Impl)
		//*   0    0:aload_0         
		//*   1    1:invokevirtual   #35  <Method Class Object.getClass()>
		//*   2    4:ldc1            #2   <Class DefaultDeserializationContext$Impl>
		//*   3    6:if_acmpeq       14
				return copy();
		//    4    9:aload_0         
		//    5   10:invokespecial   #37  <Method DefaultDeserializationContext DefaultDeserializationContext.copy()>
		//    6   13:areturn         
			else
				return ((DefaultDeserializationContext) (new Impl(this)));
		//    7   14:new             #2   <Class DefaultDeserializationContext$Impl>
		//    8   17:dup             
		//    9   18:aload_0         
		//   10   19:invokespecial   #39  <Method void DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl)>
		//   11   22:areturn         
		}

		public DefaultDeserializationContext createInstance(DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
		{
			return ((DefaultDeserializationContext) (new Impl(this, deserializationconfig, jsonparser, injectablevalues)));
		//    0    0:new             #2   <Class DefaultDeserializationContext$Impl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:aload_3         
		//    6    8:invokespecial   #43  <Method void DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl, DeserializationConfig, JsonParser, InjectableValues)>
		//    7   11:areturn         
		}

		public DefaultDeserializationContext with(DeserializerFactory deserializerfactory)
		{
			return ((DefaultDeserializationContext) (new Impl(this, deserializerfactory)));
		//    0    0:new             #2   <Class DefaultDeserializationContext$Impl>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokespecial   #47  <Method void DefaultDeserializationContext$Impl(DefaultDeserializationContext$Impl, DeserializerFactory)>
		//    5    9:areturn         
		}

		private static final long serialVersionUID = 1L;

		protected Impl(Impl impl)
		{
			super(((DefaultDeserializationContext) (impl)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #14  <Method void DefaultDeserializationContext(DefaultDeserializationContext)>
		//    3    5:return          
		}

		protected Impl(Impl impl, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
		{
			super(((DefaultDeserializationContext) (impl)), deserializationconfig, jsonparser, injectablevalues);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:aload_3         
		//    4    4:aload           4
		//    5    6:invokespecial   #19  <Method void DefaultDeserializationContext(DefaultDeserializationContext, DeserializationConfig, JsonParser, InjectableValues)>
		//    6    9:return          
		}

		protected Impl(Impl impl, DeserializerFactory deserializerfactory)
		{
			super(((DefaultDeserializationContext) (impl)), deserializerfactory);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #23  <Method void DefaultDeserializationContext(DefaultDeserializationContext, DeserializerFactory)>
		//    4    6:return          
		}

		public Impl(DeserializerFactory deserializerfactory)
		{
			super(deserializerfactory, ((DeserializerCache) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #27  <Method void DefaultDeserializationContext(DeserializerFactory, DeserializerCache)>
		//    4    6:return          
		}
	}


	protected DefaultDeserializationContext(DefaultDeserializationContext defaultdeserializationcontext)
	{
		super(((DeserializationContext) (defaultdeserializationcontext)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #24  <Method void DeserializationContext(DeserializationContext)>
	//    3    5:return          
	}

	protected DefaultDeserializationContext(DefaultDeserializationContext defaultdeserializationcontext, DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues)
	{
		super(((DeserializationContext) (defaultdeserializationcontext)), deserializationconfig, jsonparser, injectablevalues);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #29  <Method void DeserializationContext(DeserializationContext, DeserializationConfig, JsonParser, InjectableValues)>
	//    6    9:return          
	}

	protected DefaultDeserializationContext(DefaultDeserializationContext defaultdeserializationcontext, DeserializerFactory deserializerfactory)
	{
		super(((DeserializationContext) (defaultdeserializationcontext)), deserializerfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #33  <Method void DeserializationContext(DeserializationContext, DeserializerFactory)>
	//    4    6:return          
	}

	protected DefaultDeserializationContext(DeserializerFactory deserializerfactory, DeserializerCache deserializercache)
	{
		super(deserializerfactory, deserializercache);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #36  <Method void DeserializationContext(DeserializerFactory, DeserializerCache)>
	//    4    6:return          
	}

	public void checkUnresolvedObjectId()
		throws UnresolvedForwardReference
	{
	//*   0    0:aload_0         
	//*   1    1:getfield        #42  <Field LinkedHashMap _objectIds>
	//*   2    4:ifnonnull       8
_L2:
		return;
	//    3    7:return          
		if(_objectIds == null || !isEnabled(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS)) goto _L2; else goto _L1
	//    4    8:aload_0         
	//    5    9:getstatic       #48  <Field DeserializationFeature DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS>
	//    6   12:invokevirtual   #52  <Method boolean isEnabled(DeserializationFeature)>
	//    7   15:ifeq            7
_L1:
		Object obj1;
		obj1 = null;
	//    8   18:aconst_null     
	//    9   19:astore_2        
		Iterator iterator = _objectIds.entrySet().iterator();
	//   10   20:aload_0         
	//   11   21:getfield        #42  <Field LinkedHashMap _objectIds>
	//   12   24:invokevirtual   #58  <Method Set LinkedHashMap.entrySet()>
	//   13   27:invokeinterface #64  <Method Iterator Set.iterator()>
	//   14   32:astore_3        
		do
		{
			Object obj3;
			do
			{
				if(!iterator.hasNext())
					continue; /* Loop/switch isn't completed */
	//   15   33:aload_3         
	//   16   34:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   17   39:ifeq            155
				obj3 = ((Object) ((ReadableObjectId)((java.util.Map.Entry)iterator.next()).getValue()));
	//   18   42:aload_3         
	//   19   43:invokeinterface #74  <Method Object Iterator.next()>
	//   20   48:checkcast       #76  <Class java.util.Map$Entry>
	//   21   51:invokeinterface #79  <Method Object java.util.Map$Entry.getValue()>
	//   22   56:checkcast       #81  <Class ReadableObjectId>
	//   23   59:astore          5
			} while(!((ReadableObjectId) (obj3)).hasReferringProperties() || tryToResolveUnresolvedObjectId(((ReadableObjectId) (obj3))));
	//   24   61:aload           5
	//   25   63:invokevirtual   #84  <Method boolean ReadableObjectId.hasReferringProperties()>
	//   26   66:ifeq            33
	//   27   69:aload_0         
	//   28   70:aload           5
	//   29   72:invokevirtual   #88  <Method boolean tryToResolveUnresolvedObjectId(ReadableObjectId)>
	//   30   75:ifne            33
			Object obj = obj1;
	//   31   78:aload_2         
	//   32   79:astore_1        
			if(obj1 == null)
	//*  33   80:aload_2         
	//*  34   81:ifnonnull       98
				obj = ((Object) (new UnresolvedForwardReference(getParser(), "Unresolved forward references for: ")));
	//   35   84:new             #40  <Class UnresolvedForwardReference>
	//   36   87:dup             
	//   37   88:aload_0         
	//   38   89:invokevirtual   #92  <Method JsonParser getParser()>
	//   39   92:ldc1            #94  <String "Unresolved forward references for: ">
	//   40   94:invokespecial   #97  <Method void UnresolvedForwardReference(JsonParser, String)>
	//   41   97:astore_1        
			Object obj2 = ((ReadableObjectId) (obj3)).getKey().key;
	//   42   98:aload           5
	//   43  100:invokevirtual   #101 <Method com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey ReadableObjectId.getKey()>
	//   44  103:getfield        #107 <Field Object com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey.key>
	//   45  106:astore          4
			obj3 = ((Object) (((ReadableObjectId) (obj3)).referringProperties()));
	//   46  108:aload           5
	//   47  110:invokevirtual   #110 <Method Iterator ReadableObjectId.referringProperties()>
	//   48  113:astore          5
			do
			{
				obj1 = obj;
	//   49  115:aload_1         
	//   50  116:astore_2        
				if(!((Iterator) (obj3)).hasNext())
					break;
	//   51  117:aload           5
	//   52  119:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   53  124:ifeq            33
				obj1 = ((Object) ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring)((Iterator) (obj3)).next()));
	//   54  127:aload           5
	//   55  129:invokeinterface #74  <Method Object Iterator.next()>
	//   56  134:checkcast       #112 <Class com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring>
	//   57  137:astore_2        
				((UnresolvedForwardReference) (obj)).addUnresolvedId(obj2, ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (obj1)).getBeanType(), ((com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring) (obj1)).getLocation());
	//   58  138:aload_1         
	//   59  139:aload           4
	//   60  141:aload_2         
	//   61  142:invokevirtual   #116 <Method Class com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring.getBeanType()>
	//   62  145:aload_2         
	//   63  146:invokevirtual   #120 <Method com.fasterxml.jackson.core.JsonLocation com.fasterxml.jackson.databind.deser.impl.ReadableObjectId$Referring.getLocation()>
	//   64  149:invokevirtual   #124 <Method void UnresolvedForwardReference.addUnresolvedId(Object, Class, com.fasterxml.jackson.core.JsonLocation)>
			} while(true);
	//   65  152:goto            115
		} while(true);
		if(obj1 == null) goto _L2; else goto _L3
	//   66  155:aload_2         
	//   67  156:ifnull          7
_L3:
		throw obj1;
	//   68  159:aload_2         
	//   69  160:athrow          
	}

	public DefaultDeserializationContext copy()
	{
		throw new IllegalStateException("DefaultDeserializationContext sub-class not overriding copy()");
	//    0    0:new             #129 <Class IllegalStateException>
	//    1    3:dup             
	//    2    4:ldc1            #131 <String "DefaultDeserializationContext sub-class not overriding copy()">
	//    3    6:invokespecial   #134 <Method void IllegalStateException(String)>
	//    4    9:athrow          
	}

	public abstract DefaultDeserializationContext createInstance(DeserializationConfig deserializationconfig, JsonParser jsonparser, InjectableValues injectablevalues);

	protected ReadableObjectId createReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey idkey)
	{
		return new ReadableObjectId(idkey);
	//    0    0:new             #81  <Class ReadableObjectId>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #141 <Method void ReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey)>
	//    4    8:areturn         
	}

	public JsonDeserializer deserializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException
	{
		Object obj1;
		Object obj2;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj2 = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		if(obj != null) goto _L2; else goto _L1
	//    4    5:aload_2         
	//    5    6:ifnonnull       14
_L1:
		obj = ((Object) (obj2));
	//    6    9:aload           4
	//    7   11:astore_2        
_L4:
		return ((JsonDeserializer) (obj));
	//    8   12:aload_2         
	//    9   13:areturn         
_L2:
		if(!(obj instanceof JsonDeserializer))
			break; /* Loop/switch isn't completed */
	//   10   14:aload_2         
	//   11   15:instanceof      #147 <Class JsonDeserializer>
	//   12   18:ifeq            47
		annotated = ((Annotated) ((JsonDeserializer)obj));
	//   13   21:aload_2         
	//   14   22:checkcast       #147 <Class JsonDeserializer>
	//   15   25:astore_1        
_L7:
		obj = ((Object) (annotated));
	//   16   26:aload_1         
	//   17   27:astore_2        
		if(annotated instanceof ResolvableDeserializer)
	//*  18   28:aload_1         
	//*  19   29:instanceof      #149 <Class ResolvableDeserializer>
	//*  20   32:ifeq            12
		{
			((ResolvableDeserializer)annotated).resolve(((DeserializationContext) (this)));
	//   21   35:aload_1         
	//   22   36:checkcast       #149 <Class ResolvableDeserializer>
	//   23   39:aload_0         
	//   24   40:invokeinterface #152 <Method void ResolvableDeserializer.resolve(DeserializationContext)>
			return ((JsonDeserializer) (annotated));
	//   25   45:aload_1         
	//   26   46:areturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
		Class class1;
		if(!(obj instanceof Class))
	//*  27   47:aload_2         
	//*  28   48:instanceof      #154 <Class Class>
	//*  29   51:ifne            92
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned deserializer definition of type ").append(obj.getClass().getName()).append("; expected type JsonDeserializer or Class<JsonDeserializer> instead").toString());
	//   30   54:new             #129 <Class IllegalStateException>
	//   31   57:dup             
	//   32   58:new             #156 <Class StringBuilder>
	//   33   61:dup             
	//   34   62:invokespecial   #158 <Method void StringBuilder()>
	//   35   65:ldc1            #160 <String "AnnotationIntrospector returned deserializer definition of type ">
	//   36   67:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   37   70:aload_2         
	//   38   71:invokevirtual   #169 <Method Class Object.getClass()>
	//   39   74:invokevirtual   #173 <Method String Class.getName()>
	//   40   77:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:ldc1            #175 <String "; expected type JsonDeserializer or Class<JsonDeserializer> instead">
	//   42   82:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   43   85:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   44   88:invokespecial   #134 <Method void IllegalStateException(String)>
	//   45   91:athrow          
		class1 = (Class)obj;
	//   46   92:aload_2         
	//   47   93:checkcast       #154 <Class Class>
	//   48   96:astore          5
		obj = ((Object) (obj2));
	//   49   98:aload           4
	//   50  100:astore_2        
		if(class1 == com/fasterxml/jackson/databind/JsonDeserializer$None) goto _L4; else goto _L5
	//   51  101:aload           5
	//   52  103:ldc1            #180 <Class com.fasterxml.jackson.databind.JsonDeserializer$None>
	//   53  105:if_acmpeq       12
_L5:
		obj = ((Object) (obj2));
	//   54  108:aload           4
	//   55  110:astore_2        
		if(ClassUtil.isBogusClass(class1)) goto _L4; else goto _L6
	//   56  111:aload           5
	//   57  113:invokestatic    #186 <Method boolean ClassUtil.isBogusClass(Class)>
	//   58  116:ifne            12
_L6:
		if(!((Class) (com/fasterxml/jackson/databind/JsonDeserializer)).isAssignableFrom(class1))
	//*  59  119:ldc1            #147 <Class JsonDeserializer>
	//*  60  121:aload           5
	//*  61  123:invokevirtual   #189 <Method boolean Class.isAssignableFrom(Class)>
	//*  62  126:ifne            165
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<JsonDeserializer>").toString());
	//   63  129:new             #129 <Class IllegalStateException>
	//   64  132:dup             
	//   65  133:new             #156 <Class StringBuilder>
	//   66  136:dup             
	//   67  137:invokespecial   #158 <Method void StringBuilder()>
	//   68  140:ldc1            #191 <String "AnnotationIntrospector returned Class ">
	//   69  142:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   70  145:aload           5
	//   71  147:invokevirtual   #173 <Method String Class.getName()>
	//   72  150:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   73  153:ldc1            #193 <String "; expected Class<JsonDeserializer>">
	//   74  155:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   75  158:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   76  161:invokespecial   #134 <Method void IllegalStateException(String)>
	//   77  164:athrow          
		obj = ((Object) (_config.getHandlerInstantiator()));
	//   78  165:aload_0         
	//   79  166:getfield        #197 <Field DeserializationConfig _config>
	//   80  169:invokevirtual   #203 <Method HandlerInstantiator DeserializationConfig.getHandlerInstantiator()>
	//   81  172:astore_2        
		if(obj == null)
	//*  82  173:aload_2         
	//*  83  174:ifnonnull       204
			obj = ((Object) (obj1));
	//   84  177:aload_3         
	//   85  178:astore_2        
		else
	//*  86  179:aload_2         
	//*  87  180:astore_1        
	//*  88  181:aload_2         
	//*  89  182:ifnonnull       26
	//*  90  185:aload           5
	//*  91  187:aload_0         
	//*  92  188:getfield        #197 <Field DeserializationConfig _config>
	//*  93  191:invokevirtual   #206 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//*  94  194:invokestatic    #209 <Method Object ClassUtil.createInstance(Class, boolean)>
	//*  95  197:checkcast       #147 <Class JsonDeserializer>
	//*  96  200:astore_1        
	//*  97  201:goto            26
			obj = ((Object) (((HandlerInstantiator) (obj)).deserializerInstance(_config, annotated, class1)));
	//   98  204:aload_2         
	//   99  205:aload_0         
	//  100  206:getfield        #197 <Field DeserializationConfig _config>
	//  101  209:aload_1         
	//  102  210:aload           5
	//  103  212:invokevirtual   #214 <Method JsonDeserializer HandlerInstantiator.deserializerInstance(DeserializationConfig, Annotated, Class)>
	//  104  215:astore_2        
		annotated = ((Annotated) (obj));
		if(obj == null)
			annotated = ((Annotated) ((JsonDeserializer)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers())));
		  goto _L7
	//* 105  216:goto            179
	}

	public ReadableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator)
	{
		return findObjectId(obj, objectidgenerator, ((ObjectIdResolver) (new SimpleObjectIdResolver())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:new             #221 <Class SimpleObjectIdResolver>
	//    4    6:dup             
	//    5    7:invokespecial   #222 <Method void SimpleObjectIdResolver()>
	//    6   10:invokevirtual   #225 <Method ReadableObjectId findObjectId(Object, ObjectIdGenerator, ObjectIdResolver)>
	//    7   13:areturn         
	}

	public ReadableObjectId findObjectId(Object obj, ObjectIdGenerator objectidgenerator, ObjectIdResolver objectidresolver)
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey idkey = objectidgenerator.key(obj);
	//    4    6:aload_2         
	//    5    7:aload_1         
	//    6    8:invokevirtual   #232 <Method com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey ObjectIdGenerator.key(Object)>
	//    7   11:astore          4
		if(_objectIds == null)
	//*   8   13:aload_0         
	//*   9   14:getfield        #42  <Field LinkedHashMap _objectIds>
	//*  10   17:ifnonnull       105
		{
			_objectIds = new LinkedHashMap();
	//   11   20:aload_0         
	//   12   21:new             #54  <Class LinkedHashMap>
	//   13   24:dup             
	//   14   25:invokespecial   #233 <Method void LinkedHashMap()>
	//   15   28:putfield        #42  <Field LinkedHashMap _objectIds>
		} else
	//*  16   31:aconst_null     
	//*  17   32:astore_2        
	//*  18   33:aload_0         
	//*  19   34:getfield        #235 <Field List _objectIdResolvers>
	//*  20   37:ifnonnull       124
	//*  21   40:aload_0         
	//*  22   41:new             #237 <Class ArrayList>
	//*  23   44:dup             
	//*  24   45:bipush          8
	//*  25   47:invokespecial   #240 <Method void ArrayList(int)>
	//*  26   50:putfield        #235 <Field List _objectIdResolvers>
	//*  27   53:aload_2         
	//*  28   54:astore_1        
	//*  29   55:aload_1         
	//*  30   56:astore_2        
	//*  31   57:aload_1         
	//*  32   58:ifnonnull       80
	//*  33   61:aload_3         
	//*  34   62:aload_0         
	//*  35   63:invokeinterface #246 <Method ObjectIdResolver ObjectIdResolver.newForDeserialization(Object)>
	//*  36   68:astore_2        
	//*  37   69:aload_0         
	//*  38   70:getfield        #235 <Field List _objectIdResolvers>
	//*  39   73:aload_2         
	//*  40   74:invokeinterface #252 <Method boolean List.add(Object)>
	//*  41   79:pop             
	//*  42   80:aload_0         
	//*  43   81:aload           4
	//*  44   83:invokevirtual   #254 <Method ReadableObjectId createReadableObjectId(com.fasterxml.jackson.annotation.ObjectIdGenerator$IdKey)>
	//*  45   86:astore_1        
	//*  46   87:aload_1         
	//*  47   88:aload_2         
	//*  48   89:invokevirtual   #258 <Method void ReadableObjectId.setResolver(ObjectIdResolver)>
	//*  49   92:aload_0         
	//*  50   93:getfield        #42  <Field LinkedHashMap _objectIds>
	//*  51   96:aload           4
	//*  52   98:aload_1         
	//*  53   99:invokevirtual   #262 <Method Object LinkedHashMap.put(Object, Object)>
	//*  54  102:pop             
	//*  55  103:aload_1         
	//*  56  104:areturn         
		{
			obj = ((Object) ((ReadableObjectId)_objectIds.get(((Object) (idkey)))));
	//   57  105:aload_0         
	//   58  106:getfield        #42  <Field LinkedHashMap _objectIds>
	//   59  109:aload           4
	//   60  111:invokevirtual   #266 <Method Object LinkedHashMap.get(Object)>
	//   61  114:checkcast       #81  <Class ReadableObjectId>
	//   62  117:astore_1        
			if(obj != null)
	//*  63  118:aload_1         
	//*  64  119:ifnull          31
				return ((ReadableObjectId) (obj));
	//   65  122:aload_1         
	//   66  123:areturn         
		}
		objectidgenerator = null;
		if(_objectIdResolvers == null)
		{
			_objectIdResolvers = ((List) (new ArrayList(8)));
			obj = ((Object) (objectidgenerator));
		} else
		{
			Iterator iterator = _objectIdResolvers.iterator();
	//   67  124:aload_0         
	//   68  125:getfield        #235 <Field List _objectIdResolvers>
	//   69  128:invokeinterface #267 <Method Iterator List.iterator()>
	//   70  133:astore          5
			do
			{
				obj = ((Object) (objectidgenerator));
	//   71  135:aload_2         
	//   72  136:astore_1        
				if(!iterator.hasNext())
					break;
	//   73  137:aload           5
	//   74  139:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   75  144:ifeq            55
				obj = ((Object) ((ObjectIdResolver)iterator.next()));
	//   76  147:aload           5
	//   77  149:invokeinterface #74  <Method Object Iterator.next()>
	//   78  154:checkcast       #242 <Class ObjectIdResolver>
	//   79  157:astore_1        
			} while(!((ObjectIdResolver) (obj)).canUseFor(objectidresolver));
	//   80  158:aload_1         
	//   81  159:aload_3         
	//   82  160:invokeinterface #271 <Method boolean ObjectIdResolver.canUseFor(ObjectIdResolver)>
	//   83  165:ifeq            135
		}
		objectidgenerator = ((ObjectIdGenerator) (obj));
		if(obj == null)
		{
			objectidgenerator = ((ObjectIdGenerator) (objectidresolver.newForDeserialization(((Object) (this)))));
			_objectIdResolvers.add(((Object) (objectidgenerator)));
		}
		obj = ((Object) (createReadableObjectId(idkey)));
		((ReadableObjectId) (obj)).setResolver(((ObjectIdResolver) (objectidgenerator)));
		_objectIds.put(((Object) (idkey)), obj);
		return ((ReadableObjectId) (obj));
	//*  84  168:goto            55
	}

	public final KeyDeserializer keyDeserializerInstance(Annotated annotated, Object obj)
		throws JsonMappingException
	{
		Object obj1;
		Object obj2;
		obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		obj2 = null;
	//    2    2:aconst_null     
	//    3    3:astore          4
		if(obj != null) goto _L2; else goto _L1
	//    4    5:aload_2         
	//    5    6:ifnonnull       14
_L1:
		obj = ((Object) (obj2));
	//    6    9:aload           4
	//    7   11:astore_2        
_L4:
		return ((KeyDeserializer) (obj));
	//    8   12:aload_2         
	//    9   13:areturn         
_L2:
		if(!(obj instanceof KeyDeserializer))
			break; /* Loop/switch isn't completed */
	//   10   14:aload_2         
	//   11   15:instanceof      #276 <Class KeyDeserializer>
	//   12   18:ifeq            47
		annotated = ((Annotated) ((KeyDeserializer)obj));
	//   13   21:aload_2         
	//   14   22:checkcast       #276 <Class KeyDeserializer>
	//   15   25:astore_1        
_L7:
		obj = ((Object) (annotated));
	//   16   26:aload_1         
	//   17   27:astore_2        
		if(annotated instanceof ResolvableDeserializer)
	//*  18   28:aload_1         
	//*  19   29:instanceof      #149 <Class ResolvableDeserializer>
	//*  20   32:ifeq            12
		{
			((ResolvableDeserializer)annotated).resolve(((DeserializationContext) (this)));
	//   21   35:aload_1         
	//   22   36:checkcast       #149 <Class ResolvableDeserializer>
	//   23   39:aload_0         
	//   24   40:invokeinterface #152 <Method void ResolvableDeserializer.resolve(DeserializationContext)>
			return ((KeyDeserializer) (annotated));
	//   25   45:aload_1         
	//   26   46:areturn         
		}
		if(true) goto _L4; else goto _L3
_L3:
		Class class1;
		if(!(obj instanceof Class))
	//*  27   47:aload_2         
	//*  28   48:instanceof      #154 <Class Class>
	//*  29   51:ifne            94
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned key deserializer definition of type ").append(obj.getClass().getName()).append("; expected type KeyDeserializer or Class<KeyDeserializer> instead").toString());
	//   30   54:new             #129 <Class IllegalStateException>
	//   31   57:dup             
	//   32   58:new             #156 <Class StringBuilder>
	//   33   61:dup             
	//   34   62:invokespecial   #158 <Method void StringBuilder()>
	//   35   65:ldc2            #278 <String "AnnotationIntrospector returned key deserializer definition of type ">
	//   36   68:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   37   71:aload_2         
	//   38   72:invokevirtual   #169 <Method Class Object.getClass()>
	//   39   75:invokevirtual   #173 <Method String Class.getName()>
	//   40   78:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   41   81:ldc2            #280 <String "; expected type KeyDeserializer or Class<KeyDeserializer> instead">
	//   42   84:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   43   87:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   44   90:invokespecial   #134 <Method void IllegalStateException(String)>
	//   45   93:athrow          
		class1 = (Class)obj;
	//   46   94:aload_2         
	//   47   95:checkcast       #154 <Class Class>
	//   48   98:astore          5
		obj = ((Object) (obj2));
	//   49  100:aload           4
	//   50  102:astore_2        
		if(class1 == com/fasterxml/jackson/databind/KeyDeserializer$None) goto _L4; else goto _L5
	//   51  103:aload           5
	//   52  105:ldc2            #282 <Class com.fasterxml.jackson.databind.KeyDeserializer$None>
	//   53  108:if_acmpeq       12
_L5:
		obj = ((Object) (obj2));
	//   54  111:aload           4
	//   55  113:astore_2        
		if(ClassUtil.isBogusClass(class1)) goto _L4; else goto _L6
	//   56  114:aload           5
	//   57  116:invokestatic    #186 <Method boolean ClassUtil.isBogusClass(Class)>
	//   58  119:ifne            12
_L6:
		if(!((Class) (com/fasterxml/jackson/databind/KeyDeserializer)).isAssignableFrom(class1))
	//*  59  122:ldc2            #276 <Class KeyDeserializer>
	//*  60  125:aload           5
	//*  61  127:invokevirtual   #189 <Method boolean Class.isAssignableFrom(Class)>
	//*  62  130:ifne            170
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(class1.getName()).append("; expected Class<KeyDeserializer>").toString());
	//   63  133:new             #129 <Class IllegalStateException>
	//   64  136:dup             
	//   65  137:new             #156 <Class StringBuilder>
	//   66  140:dup             
	//   67  141:invokespecial   #158 <Method void StringBuilder()>
	//   68  144:ldc1            #191 <String "AnnotationIntrospector returned Class ">
	//   69  146:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   70  149:aload           5
	//   71  151:invokevirtual   #173 <Method String Class.getName()>
	//   72  154:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   73  157:ldc2            #284 <String "; expected Class<KeyDeserializer>">
	//   74  160:invokevirtual   #164 <Method StringBuilder StringBuilder.append(String)>
	//   75  163:invokevirtual   #178 <Method String StringBuilder.toString()>
	//   76  166:invokespecial   #134 <Method void IllegalStateException(String)>
	//   77  169:athrow          
		obj = ((Object) (_config.getHandlerInstantiator()));
	//   78  170:aload_0         
	//   79  171:getfield        #197 <Field DeserializationConfig _config>
	//   80  174:invokevirtual   #203 <Method HandlerInstantiator DeserializationConfig.getHandlerInstantiator()>
	//   81  177:astore_2        
		if(obj == null)
	//*  82  178:aload_2         
	//*  83  179:ifnonnull       209
			obj = ((Object) (obj1));
	//   84  182:aload_3         
	//   85  183:astore_2        
		else
	//*  86  184:aload_2         
	//*  87  185:astore_1        
	//*  88  186:aload_2         
	//*  89  187:ifnonnull       26
	//*  90  190:aload           5
	//*  91  192:aload_0         
	//*  92  193:getfield        #197 <Field DeserializationConfig _config>
	//*  93  196:invokevirtual   #206 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//*  94  199:invokestatic    #209 <Method Object ClassUtil.createInstance(Class, boolean)>
	//*  95  202:checkcast       #276 <Class KeyDeserializer>
	//*  96  205:astore_1        
	//*  97  206:goto            26
			obj = ((Object) (((HandlerInstantiator) (obj)).keyDeserializerInstance(_config, annotated, class1)));
	//   98  209:aload_2         
	//   99  210:aload_0         
	//  100  211:getfield        #197 <Field DeserializationConfig _config>
	//  101  214:aload_1         
	//  102  215:aload           5
	//  103  217:invokevirtual   #287 <Method KeyDeserializer HandlerInstantiator.keyDeserializerInstance(DeserializationConfig, Annotated, Class)>
	//  104  220:astore_2        
		annotated = ((Annotated) (obj));
		if(obj == null)
			annotated = ((Annotated) ((KeyDeserializer)ClassUtil.createInstance(class1, _config.canOverrideAccessModifiers())));
		  goto _L7
	//* 105  221:goto            184
	}

	protected boolean tryToResolveUnresolvedObjectId(ReadableObjectId readableobjectid)
	{
		return readableobjectid.tryToResolveUnresolved(((DeserializationContext) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #291 <Method boolean ReadableObjectId.tryToResolveUnresolved(DeserializationContext)>
	//    3    5:ireturn         
	}

	public abstract DefaultDeserializationContext with(DeserializerFactory deserializerfactory);

	private static final long serialVersionUID = 1L;
	private List _objectIdResolvers;
	protected transient LinkedHashMap _objectIds;
}
