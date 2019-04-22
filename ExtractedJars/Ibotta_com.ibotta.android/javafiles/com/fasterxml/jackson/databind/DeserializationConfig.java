// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind:
//			DeserializationFeature, JsonMappingException, JavaType, BeanDescription, 
//			AnnotationIntrospector, PropertyName

public final class DeserializationConfig extends MapperConfigBase
	implements Serializable
{

	private DeserializationConfig(DeserializationConfig deserializationconfig, int i, int j, int k, int l, int i1, int j1)
	{
		super(((MapperConfigBase) (deserializationconfig)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #27  <Method void MapperConfigBase(MapperConfigBase, int)>
		_deserFeatures = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #29  <Field int _deserFeatures>
		_nodeFactory = deserializationconfig._nodeFactory;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//   10   16:putfield        #31  <Field JsonNodeFactory _nodeFactory>
		_problemHandlers = deserializationconfig._problemHandlers;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:getfield        #33  <Field LinkedNode _problemHandlers>
	//   14   24:putfield        #33  <Field LinkedNode _problemHandlers>
		_parserFeatures = k;
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:putfield        #35  <Field int _parserFeatures>
		_parserFeaturesToChange = l;
	//   18   33:aload_0         
	//   19   34:iload           5
	//   20   36:putfield        #37  <Field int _parserFeaturesToChange>
		_formatReadFeatures = i1;
	//   21   39:aload_0         
	//   22   40:iload           6
	//   23   42:putfield        #39  <Field int _formatReadFeatures>
		_formatReadFeaturesToChange = j1;
	//   24   45:aload_0         
	//   25   46:iload           7
	//   26   48:putfield        #41  <Field int _formatReadFeaturesToChange>
	//   27   51:return          
	}

	private DeserializationConfig(DeserializationConfig deserializationconfig, BaseSettings basesettings)
	{
		super(((MapperConfigBase) (deserializationconfig)), basesettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method void MapperConfigBase(MapperConfigBase, BaseSettings)>
		_deserFeatures = deserializationconfig._deserFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #29  <Field int _deserFeatures>
	//    7   11:putfield        #29  <Field int _deserFeatures>
		_nodeFactory = deserializationconfig._nodeFactory;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//   11   19:putfield        #31  <Field JsonNodeFactory _nodeFactory>
		_problemHandlers = deserializationconfig._problemHandlers;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #33  <Field LinkedNode _problemHandlers>
	//   15   27:putfield        #33  <Field LinkedNode _problemHandlers>
		_parserFeatures = deserializationconfig._parserFeatures;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #35  <Field int _parserFeatures>
	//   19   35:putfield        #35  <Field int _parserFeatures>
		_parserFeaturesToChange = deserializationconfig._parserFeaturesToChange;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #37  <Field int _parserFeaturesToChange>
	//   23   43:putfield        #37  <Field int _parserFeaturesToChange>
		_formatReadFeatures = deserializationconfig._formatReadFeatures;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #39  <Field int _formatReadFeatures>
	//   27   51:putfield        #39  <Field int _formatReadFeatures>
		_formatReadFeaturesToChange = deserializationconfig._formatReadFeaturesToChange;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   31   59:putfield        #41  <Field int _formatReadFeaturesToChange>
	//   32   62:return          
	}

	private DeserializationConfig(DeserializationConfig deserializationconfig, LinkedNode linkednode)
	{
		super(((MapperConfigBase) (deserializationconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void MapperConfigBase(MapperConfigBase)>
		_deserFeatures = deserializationconfig._deserFeatures;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #29  <Field int _deserFeatures>
	//    6   10:putfield        #29  <Field int _deserFeatures>
		_problemHandlers = linkednode;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #33  <Field LinkedNode _problemHandlers>
		_nodeFactory = deserializationconfig._nodeFactory;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//   13   23:putfield        #31  <Field JsonNodeFactory _nodeFactory>
		_parserFeatures = deserializationconfig._parserFeatures;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #35  <Field int _parserFeatures>
	//   17   31:putfield        #35  <Field int _parserFeatures>
		_parserFeaturesToChange = deserializationconfig._parserFeaturesToChange;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #37  <Field int _parserFeaturesToChange>
	//   21   39:putfield        #37  <Field int _parserFeaturesToChange>
		_formatReadFeatures = deserializationconfig._formatReadFeatures;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #39  <Field int _formatReadFeatures>
	//   25   47:putfield        #39  <Field int _formatReadFeatures>
		_formatReadFeaturesToChange = deserializationconfig._formatReadFeaturesToChange;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   29   55:putfield        #41  <Field int _formatReadFeaturesToChange>
	//   30   58:return          
	}

	public DeserializationConfig(BaseSettings basesettings, SubtypeResolver subtyperesolver, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup, ConfigOverrides configoverrides)
	{
		super(basesettings, subtyperesolver, simplemixinresolver, rootnamelookup, configoverrides);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #55  <Method void MapperConfigBase(BaseSettings, SubtypeResolver, SimpleMixInResolver, RootNameLookup, ConfigOverrides)>
		_deserFeatures = collectFeatureDefaults(com/fasterxml/jackson/databind/DeserializationFeature);
	//    7   11:aload_0         
	//    8   12:ldc1            #57  <Class DeserializationFeature>
	//    9   14:invokestatic    #61  <Method int collectFeatureDefaults(Class)>
	//   10   17:putfield        #29  <Field int _deserFeatures>
		_nodeFactory = JsonNodeFactory.instance;
	//   11   20:aload_0         
	//   12   21:getstatic       #66  <Field JsonNodeFactory JsonNodeFactory.instance>
	//   13   24:putfield        #31  <Field JsonNodeFactory _nodeFactory>
		_problemHandlers = null;
	//   14   27:aload_0         
	//   15   28:aconst_null     
	//   16   29:putfield        #33  <Field LinkedNode _problemHandlers>
		_parserFeatures = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #35  <Field int _parserFeatures>
		_parserFeaturesToChange = 0;
	//   20   37:aload_0         
	//   21   38:iconst_0        
	//   22   39:putfield        #37  <Field int _parserFeaturesToChange>
		_formatReadFeatures = 0;
	//   23   42:aload_0         
	//   24   43:iconst_0        
	//   25   44:putfield        #39  <Field int _formatReadFeatures>
		_formatReadFeaturesToChange = 0;
	//   26   47:aload_0         
	//   27   48:iconst_0        
	//   28   49:putfield        #41  <Field int _formatReadFeaturesToChange>
	//   29   52:return          
	}

	protected final DeserializationConfig _withBase(BaseSettings basesettings)
	{
		if(_base == basesettings)
	//*   0    0:aload_0         
	//*   1    1:getfield        #72  <Field BaseSettings _base>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DeserializationConfig(this, basesettings);
	//    6   10:new             #2   <Class DeserializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #74  <Method void DeserializationConfig(DeserializationConfig, BaseSettings)>
	//   11   19:areturn         
	}

	protected volatile MapperConfigBase _withBase(BaseSettings basesettings)
	{
		return ((MapperConfigBase) (_withBase(basesettings)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #77  <Method DeserializationConfig _withBase(BaseSettings)>
	//    3    5:areturn         
	}

	protected final DeserializationConfig _withMapperFeatures(int i)
	{
		return new DeserializationConfig(this, i, _deserFeatures, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//    0    0:new             #2   <Class DeserializationConfig>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #29  <Field int _deserFeatures>
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field int _parserFeatures>
	//    8   14:aload_0         
	//    9   15:getfield        #37  <Field int _parserFeaturesToChange>
	//   10   18:aload_0         
	//   11   19:getfield        #39  <Field int _formatReadFeatures>
	//   12   22:aload_0         
	//   13   23:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   14   26:invokespecial   #81  <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   15   29:areturn         
	}

	protected volatile MapperConfigBase _withMapperFeatures(int i)
	{
		return ((MapperConfigBase) (_withMapperFeatures(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #84  <Method DeserializationConfig _withMapperFeatures(int)>
	//    3    5:areturn         
	}

	public TypeDeserializer findTypeDeserializer(JavaType javatype)
		throws JsonMappingException
	{
		Object obj1 = ((Object) (introspectClassAnnotations(javatype.getRawClass()).getClassInfo()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #94  <Method Class JavaType.getRawClass()>
	//    3    5:invokevirtual   #98  <Method BeanDescription introspectClassAnnotations(Class)>
	//    4    8:invokevirtual   #104 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    5   11:astore          4
		Object obj = ((Object) (getAnnotationIntrospector().findTypeResolver(((com.fasterxml.jackson.databind.cfg.MapperConfig) (this)), ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)), javatype)));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #108 <Method AnnotationIntrospector getAnnotationIntrospector()>
	//    8   17:aload_0         
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:invokevirtual   #114 <Method TypeResolverBuilder AnnotationIntrospector.findTypeResolver(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, JavaType)>
	//   12   24:astore_2        
		java.util.Collection collection = null;
	//   13   25:aconst_null     
	//   14   26:astore_3        
		if(obj == null)
	//*  15   27:aload_2         
	//*  16   28:ifnonnull       48
		{
			obj1 = ((Object) (getDefaultTyper(javatype)));
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #118 <Method TypeResolverBuilder getDefaultTyper(JavaType)>
	//   20   36:astore          4
			obj = obj1;
	//   21   38:aload           4
	//   22   40:astore_2        
			if(obj1 == null)
	//*  23   41:aload           4
	//*  24   43:ifnonnull       59
				return null;
	//   25   46:aconst_null     
	//   26   47:areturn         
		} else
		{
			collection = getSubtypeResolver().collectAndResolveSubtypesByTypeId(((com.fasterxml.jackson.databind.cfg.MapperConfig) (this)), ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)));
	//   27   48:aload_0         
	//   28   49:invokevirtual   #122 <Method SubtypeResolver getSubtypeResolver()>
	//   29   52:aload_0         
	//   30   53:aload           4
	//   31   55:invokevirtual   #128 <Method java.util.Collection SubtypeResolver.collectAndResolveSubtypesByTypeId(com.fasterxml.jackson.databind.cfg.MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   32   58:astore_3        
		}
		return ((TypeResolverBuilder) (obj)).buildTypeDeserializer(this, javatype, collection);
	//   33   59:aload_2         
	//   34   60:aload_0         
	//   35   61:aload_1         
	//   36   62:aload_3         
	//   37   63:invokeinterface #134 <Method TypeDeserializer TypeResolverBuilder.buildTypeDeserializer(DeserializationConfig, JavaType, java.util.Collection)>
	//   38   68:areturn         
	}

	public final int getDeserializationFeatures()
	{
		return _deserFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:ireturn         
	}

	public final JsonNodeFactory getNodeFactory()
	{
		return _nodeFactory;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//    2    4:areturn         
	}

	public LinkedNode getProblemHandlers()
	{
		return _problemHandlers;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field LinkedNode _problemHandlers>
	//    2    4:areturn         
	}

	public void initialize(JsonParser jsonparser)
	{
		int i = _parserFeaturesToChange;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field int _parserFeaturesToChange>
	//    2    4:istore_2        
		if(i != 0)
	//*   3    5:iload_2         
	//*   4    6:ifeq            19
			jsonparser.overrideStdFeatures(_parserFeatures, i);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #35  <Field int _parserFeatures>
	//    8   14:iload_2         
	//    9   15:invokevirtual   #150 <Method JsonParser JsonParser.overrideStdFeatures(int, int)>
	//   10   18:pop             
		i = _formatReadFeaturesToChange;
	//   11   19:aload_0         
	//   12   20:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   13   23:istore_2        
		if(i != 0)
	//*  14   24:iload_2         
	//*  15   25:ifeq            38
			jsonparser.overrideFormatFeatures(_formatReadFeatures, i);
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #39  <Field int _formatReadFeatures>
	//   19   33:iload_2         
	//   20   34:invokevirtual   #153 <Method JsonParser JsonParser.overrideFormatFeatures(int, int)>
	//   21   37:pop             
	//   22   38:return          
	}

	public BeanDescription introspect(JavaType javatype)
	{
		return getClassIntrospector().forDeserialization(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #165 <Method BeanDescription ClassIntrospector.forDeserialization(DeserializationConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectForBuilder(JavaType javatype)
	{
		return getClassIntrospector().forDeserializationWithBuilder(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #170 <Method BeanDescription ClassIntrospector.forDeserializationWithBuilder(DeserializationConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectForCreation(JavaType javatype)
	{
		return getClassIntrospector().forCreation(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #174 <Method BeanDescription ClassIntrospector.forCreation(DeserializationConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public final boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature, JsonFactory jsonfactory)
	{
		if((feature.getMask() & _parserFeaturesToChange) != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #181 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #37  <Field int _parserFeaturesToChange>
	//*   4    8:iand            
	//*   5    9:ifeq            30
		{
			int i = _parserFeatures;
	//    6   12:aload_0         
	//    7   13:getfield        #35  <Field int _parserFeatures>
	//    8   16:istore_3        
			return (feature.getMask() & i) != 0;
	//    9   17:aload_1         
	//   10   18:invokevirtual   #181 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//   11   21:iload_3         
	//   12   22:iand            
	//   13   23:ifeq            28
	//   14   26:iconst_1        
	//   15   27:ireturn         
	//   16   28:iconst_0        
	//   17   29:ireturn         
		} else
		{
			return jsonfactory.isEnabled(feature);
	//   18   30:aload_2         
	//   19   31:aload_1         
	//   20   32:invokevirtual   #186 <Method boolean JsonFactory.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   21   35:ireturn         
		}
	}

	public final boolean isEnabled(DeserializationFeature deserializationfeature)
	{
		int i = _deserFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:istore_2        
		return (deserializationfeature.getMask() & i) != 0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #188 <Method int DeserializationFeature.getMask()>
	//    5    9:iload_2         
	//    6   10:iand            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public boolean useRootWrapping()
	{
		if(_rootName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #194 <Field PropertyName _rootName>
	//*   2    4:ifnull          17
			return _rootName.isEmpty() ^ true;
	//    3    7:aload_0         
	//    4    8:getfield        #194 <Field PropertyName _rootName>
	//    5   11:invokevirtual   #199 <Method boolean PropertyName.isEmpty()>
	//    6   14:iconst_1        
	//    7   15:ixor            
	//    8   16:ireturn         
		else
			return isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
	//    9   17:aload_0         
	//   10   18:getstatic       #203 <Field DeserializationFeature DeserializationFeature.UNWRAP_ROOT_VALUE>
	//   11   21:invokevirtual   #205 <Method boolean isEnabled(DeserializationFeature)>
	//   12   24:ireturn         
	}

	public DeserializationConfig with(DeserializationFeature deserializationfeature)
	{
		int i = _deserFeatures | deserializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method int DeserializationFeature.getMask()>
	//    4    8:ior             
	//    5    9:istore_2        
		if(i == _deserFeatures)
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #29  <Field int _deserFeatures>
	//*   9   15:icmpne          20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, i, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   12   20:new             #2   <Class DeserializationConfig>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #210 <Field int _mapperFeatures>
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #35  <Field int _parserFeatures>
	//   20   34:aload_0         
	//   21   35:getfield        #37  <Field int _parserFeaturesToChange>
	//   22   38:aload_0         
	//   23   39:getfield        #39  <Field int _formatReadFeatures>
	//   24   42:aload_0         
	//   25   43:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   26   46:invokespecial   #81  <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   27   49:areturn         
	}

	public DeserializationConfig withHandler(DeserializationProblemHandler deserializationproblemhandler)
	{
		if(LinkedNode.contains(_problemHandlers, ((Object) (deserializationproblemhandler))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field LinkedNode _problemHandlers>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #218 <Method boolean LinkedNode.contains(LinkedNode, Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new DeserializationConfig(this, new LinkedNode(((Object) (deserializationproblemhandler)), _problemHandlers));
	//    7   13:new             #2   <Class DeserializationConfig>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:new             #214 <Class LinkedNode>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #33  <Field LinkedNode _problemHandlers>
	//   15   27:invokespecial   #221 <Method void LinkedNode(Object, LinkedNode)>
	//   16   30:invokespecial   #223 <Method void DeserializationConfig(DeserializationConfig, LinkedNode)>
	//   17   33:areturn         
	}

	public DeserializationConfig without(DeserializationFeature deserializationfeature)
	{
		int i = _deserFeatures & deserializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method int DeserializationFeature.getMask()>
	//    4    8:iand            
	//    5    9:istore_2        
		if(i == _deserFeatures)
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #29  <Field int _deserFeatures>
	//*   9   15:icmpne          20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, i, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   12   20:new             #2   <Class DeserializationConfig>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #210 <Field int _mapperFeatures>
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #35  <Field int _parserFeatures>
	//   20   34:aload_0         
	//   21   35:getfield        #37  <Field int _parserFeaturesToChange>
	//   22   38:aload_0         
	//   23   39:getfield        #39  <Field int _formatReadFeatures>
	//   24   42:aload_0         
	//   25   43:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   26   46:invokespecial   #81  <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   27   49:areturn         
	}

	private static final long serialVersionUID = 2L;
	protected final int _deserFeatures;
	protected final int _formatReadFeatures;
	protected final int _formatReadFeaturesToChange;
	protected final JsonNodeFactory _nodeFactory;
	protected final int _parserFeatures;
	protected final int _parserFeaturesToChange;
	protected final LinkedNode _problemHandlers;
}
