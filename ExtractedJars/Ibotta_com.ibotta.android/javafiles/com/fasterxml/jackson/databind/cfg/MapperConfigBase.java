// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			MapperConfig, ConfigOverride, ContextAttributes, ConfigOverrides, 
//			BaseSettings

public abstract class MapperConfigBase extends MapperConfig
	implements Serializable
{

	protected MapperConfigBase(BaseSettings basesettings, SubtypeResolver subtyperesolver, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup, ConfigOverrides configoverrides)
	{
		super(basesettings, DEFAULT_MAPPER_FEATURES);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #45  <Field int DEFAULT_MAPPER_FEATURES>
	//    3    5:invokespecial   #73  <Method void MapperConfig(BaseSettings, int)>
		_mixIns = simplemixinresolver;
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:putfield        #75  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = subtyperesolver;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #77  <Field SubtypeResolver _subtypeResolver>
		_rootNames = rootnamelookup;
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:putfield        #79  <Field RootNameLookup _rootNames>
		_rootName = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #81  <Field PropertyName _rootName>
		_view = null;
	//   16   29:aload_0         
	//   17   30:aconst_null     
	//   18   31:putfield        #83  <Field Class _view>
		_attributes = ContextAttributes.getEmpty();
	//   19   34:aload_0         
	//   20   35:invokestatic    #89  <Method ContextAttributes ContextAttributes.getEmpty()>
	//   21   38:putfield        #91  <Field ContextAttributes _attributes>
		_configOverrides = configoverrides;
	//   22   41:aload_0         
	//   23   42:aload           5
	//   24   44:putfield        #93  <Field ConfigOverrides _configOverrides>
	//   25   47:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase)
	{
		super(((MapperConfig) (mapperconfigbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #97  <Method void MapperConfig(MapperConfig)>
		_mixIns = mapperconfigbase._mixIns;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #75  <Field SimpleMixInResolver _mixIns>
	//    6   10:putfield        #75  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #77  <Field SubtypeResolver _subtypeResolver>
	//   10   18:putfield        #77  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #79  <Field RootNameLookup _rootNames>
	//   14   26:putfield        #79  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getfield        #81  <Field PropertyName _rootName>
	//   18   34:putfield        #81  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getfield        #83  <Field Class _view>
	//   22   42:putfield        #83  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:getfield        #91  <Field ContextAttributes _attributes>
	//   26   50:putfield        #91  <Field ContextAttributes _attributes>
		_configOverrides = mapperconfigbase._configOverrides;
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:getfield        #93  <Field ConfigOverrides _configOverrides>
	//   30   58:putfield        #93  <Field ConfigOverrides _configOverrides>
	//   31   61:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, int i)
	{
		super(((MapperConfig) (mapperconfigbase)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #103 <Method void MapperConfig(MapperConfig, int)>
		_mixIns = mapperconfigbase._mixIns;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #75  <Field SimpleMixInResolver _mixIns>
	//    7   11:putfield        #75  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #77  <Field SubtypeResolver _subtypeResolver>
	//   11   19:putfield        #77  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #79  <Field RootNameLookup _rootNames>
	//   15   27:putfield        #79  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #81  <Field PropertyName _rootName>
	//   19   35:putfield        #81  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #83  <Field Class _view>
	//   23   43:putfield        #83  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #91  <Field ContextAttributes _attributes>
	//   27   51:putfield        #91  <Field ContextAttributes _attributes>
		_configOverrides = mapperconfigbase._configOverrides;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #93  <Field ConfigOverrides _configOverrides>
	//   31   59:putfield        #93  <Field ConfigOverrides _configOverrides>
	//   32   62:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, BaseSettings basesettings)
	{
		super(((MapperConfig) (mapperconfigbase)), basesettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #108 <Method void MapperConfig(MapperConfig, BaseSettings)>
		_mixIns = mapperconfigbase._mixIns;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #75  <Field SimpleMixInResolver _mixIns>
	//    7   11:putfield        #75  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #77  <Field SubtypeResolver _subtypeResolver>
	//   11   19:putfield        #77  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #79  <Field RootNameLookup _rootNames>
	//   15   27:putfield        #79  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #81  <Field PropertyName _rootName>
	//   19   35:putfield        #81  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #83  <Field Class _view>
	//   23   43:putfield        #83  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #91  <Field ContextAttributes _attributes>
	//   27   51:putfield        #91  <Field ContextAttributes _attributes>
		_configOverrides = mapperconfigbase._configOverrides;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #93  <Field ConfigOverrides _configOverrides>
	//   31   59:putfield        #93  <Field ConfigOverrides _configOverrides>
	//   32   62:return          
	}

	protected abstract MapperConfigBase _withBase(BaseSettings basesettings);

	protected abstract MapperConfigBase _withMapperFeatures(int i);

	public com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver copy()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #117 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #119 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final Class findMixInClassFor(Class class1)
	{
		return _mixIns.findMixInClassFor(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field SimpleMixInResolver _mixIns>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #125 <Method Class SimpleMixInResolver.findMixInClassFor(Class)>
	//    4    8:areturn         
	}

	public PropertyName findRootName(JavaType javatype)
	{
		PropertyName propertyname = _rootName;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field PropertyName _rootName>
	//    2    4:astore_2        
		if(propertyname != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          11
			return propertyname;
	//    5    9:aload_2         
	//    6   10:areturn         
		else
			return _rootNames.findRootName(javatype, ((MapperConfig) (this)));
	//    7   11:aload_0         
	//    8   12:getfield        #79  <Field RootNameLookup _rootNames>
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #133 <Method PropertyName RootNameLookup.findRootName(JavaType, MapperConfig)>
	//   12   20:areturn         
	}

	public PropertyName findRootName(Class class1)
	{
		PropertyName propertyname = _rootName;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field PropertyName _rootName>
	//    2    4:astore_2        
		if(propertyname != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          11
			return propertyname;
	//    5    9:aload_2         
	//    6   10:areturn         
		else
			return _rootNames.findRootName(class1, ((MapperConfig) (this)));
	//    7   11:aload_0         
	//    8   12:getfield        #79  <Field RootNameLookup _rootNames>
	//    9   15:aload_1         
	//   10   16:aload_0         
	//   11   17:invokevirtual   #137 <Method PropertyName RootNameLookup.findRootName(Class, MapperConfig)>
	//   12   20:areturn         
	}

	public final Class getActiveView()
	{
		return _view;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field Class _view>
	//    2    4:areturn         
	}

	public final ContextAttributes getAttributes()
	{
		return _attributes;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field ContextAttributes _attributes>
	//    2    4:areturn         
	}

	public final ConfigOverride getConfigOverride(Class class1)
	{
		ConfigOverride configoverride = _configOverrides.findOverride(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ConfigOverrides _configOverrides>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method ConfigOverride ConfigOverrides.findOverride(Class)>
	//    4    8:astore_2        
		class1 = ((Class) (configoverride));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(configoverride == null)
	//*   7   11:aload_2         
	//*   8   12:ifnonnull       19
			class1 = ((Class) (EMPTY_OVERRIDE));
	//    9   15:getstatic       #37  <Field ConfigOverride EMPTY_OVERRIDE>
	//   10   18:astore_1        
		return ((ConfigOverride) (class1));
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultInclusion(Class class1, Class class2)
	{
		class2 = ((Class) (getConfigOverride(class2).getIncludeAsProperty()));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #154 <Method ConfigOverride getConfigOverride(Class)>
	//    3    5:invokevirtual   #158 <Method com.fasterxml.jackson.annotation.JsonInclude$Value ConfigOverride.getIncludeAsProperty()>
	//    4    8:astore_2        
		class1 = ((Class) (getDefaultPropertyInclusion(class1)));
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #162 <Method com.fasterxml.jackson.annotation.JsonInclude$Value getDefaultPropertyInclusion(Class)>
	//    8   14:astore_1        
		if(class1 == null)
	//*   9   15:aload_1         
	//*  10   16:ifnonnull       21
			return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class2));
	//   11   19:aload_2         
	//   12   20:areturn         
		else
			return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1)).withOverrides(((com.fasterxml.jackson.annotation.JsonInclude.Value) (class2)));
	//   13   21:aload_1         
	//   14   22:aload_2         
	//   15   23:invokevirtual   #168 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   16   26:areturn         
	}

	public Boolean getDefaultMergeable()
	{
		return _configOverrides.getDefaultMergeable();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ConfigOverrides _configOverrides>
	//    2    4:invokevirtual   #173 <Method Boolean ConfigOverrides.getDefaultMergeable()>
	//    3    7:areturn         
	}

	public Boolean getDefaultMergeable(Class class1)
	{
		class1 = ((Class) (_configOverrides.findOverride(class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ConfigOverrides _configOverrides>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method ConfigOverride ConfigOverrides.findOverride(Class)>
	//    4    8:astore_1        
		if(class1 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          24
		{
			class1 = ((Class) (((ConfigOverride) (class1)).getMergeable()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #177 <Method Boolean ConfigOverride.getMergeable()>
	//    9   17:astore_1        
			if(class1 != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          24
				return ((Boolean) (class1));
	//   12   22:aload_1         
	//   13   23:areturn         
		}
		return _configOverrides.getDefaultMergeable();
	//   14   24:aload_0         
	//   15   25:getfield        #93  <Field ConfigOverrides _configOverrides>
	//   16   28:invokevirtual   #173 <Method Boolean ConfigOverrides.getDefaultMergeable()>
	//   17   31:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1)
	{
		class1 = ((Class) (_configOverrides.findOverride(class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ConfigOverrides _configOverrides>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method ConfigOverride ConfigOverrides.findOverride(Class)>
	//    4    8:astore_1        
		if(class1 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          24
		{
			class1 = ((Class) (((ConfigOverride) (class1)).getFormat()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #184 <Method com.fasterxml.jackson.annotation.JsonFormat$Value ConfigOverride.getFormat()>
	//    9   17:astore_1        
			if(class1 != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          24
				return ((com.fasterxml.jackson.annotation.JsonFormat.Value) (class1));
	//   12   22:aload_1         
	//   13   23:areturn         
		}
		return EMPTY_FORMAT;
	//   14   24:getstatic       #188 <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//   15   27:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class class1)
	{
		class1 = ((Class) (_configOverrides.findOverride(class1)));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ConfigOverrides _configOverrides>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #149 <Method ConfigOverride ConfigOverrides.findOverride(Class)>
	//    4    8:astore_1        
		if(class1 != null)
	//*   5    9:aload_1         
	//*   6   10:ifnull          24
		{
			class1 = ((Class) (((ConfigOverride) (class1)).getIgnorals()));
	//    7   13:aload_1         
	//    8   14:invokevirtual   #195 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value ConfigOverride.getIgnorals()>
	//    9   17:astore_1        
			if(class1 != null)
	//*  10   18:aload_1         
	//*  11   19:ifnull          24
				return ((com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value) (class1));
	//   12   22:aload_1         
	//   13   23:areturn         
		}
		return null;
	//   14   24:aconst_null     
	//   15   25:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value getDefaultPropertyIgnorals(Class class1, AnnotatedClass annotatedclass)
	{
		AnnotationIntrospector annotationintrospector = getAnnotationIntrospector();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #201 <Method AnnotationIntrospector getAnnotationIntrospector()>
	//    2    4:astore_3        
		if(annotationintrospector == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       14
			annotatedclass = null;
	//    5    9:aconst_null     
	//    6   10:astore_2        
		else
	//*   7   11:goto            20
			annotatedclass = ((AnnotatedClass) (annotationintrospector.findPropertyIgnorals(((com.fasterxml.jackson.databind.introspect.Annotated) (annotatedclass)))));
	//    8   14:aload_3         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #207 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value AnnotationIntrospector.findPropertyIgnorals(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   11   19:astore_2        
		return com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value.merge(((com.fasterxml.jackson.annotation.JsonIgnoreProperties.Value) (annotatedclass)), getDefaultPropertyIgnorals(class1));
	//   12   20:aload_2         
	//   13   21:aload_0         
	//   14   22:aload_1         
	//   15   23:invokevirtual   #209 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value getDefaultPropertyIgnorals(Class)>
	//   16   26:invokestatic    #215 <Method com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value.merge(com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value, com.fasterxml.jackson.annotation.JsonIgnoreProperties$Value)>
	//   17   29:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion()
	{
		return _configOverrides.getDefaultInclusion();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ConfigOverrides _configOverrides>
	//    2    4:invokevirtual   #218 <Method com.fasterxml.jackson.annotation.JsonInclude$Value ConfigOverrides.getDefaultInclusion()>
	//    3    7:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion(Class class1)
	{
		class1 = ((Class) (getConfigOverride(class1).getInclude()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #154 <Method ConfigOverride getConfigOverride(Class)>
	//    3    5:invokevirtual   #221 <Method com.fasterxml.jackson.annotation.JsonInclude$Value ConfigOverride.getInclude()>
	//    4    8:astore_1        
		com.fasterxml.jackson.annotation.JsonInclude.Value value = getDefaultPropertyInclusion();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #223 <Method com.fasterxml.jackson.annotation.JsonInclude$Value getDefaultPropertyInclusion()>
	//    7   13:astore_2        
		if(value == null)
	//*   8   14:aload_2         
	//*   9   15:ifnonnull       20
			return ((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1));
	//   10   18:aload_1         
	//   11   19:areturn         
		else
			return value.withOverrides(((com.fasterxml.jackson.annotation.JsonInclude.Value) (class1)));
	//   12   20:aload_2         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #168 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withOverrides(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   15   25:areturn         
	}

	public final com.fasterxml.jackson.annotation.JsonSetter.Value getDefaultSetterInfo()
	{
		return _configOverrides.getDefaultSetterInfo();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ConfigOverrides _configOverrides>
	//    2    4:invokevirtual   #228 <Method com.fasterxml.jackson.annotation.JsonSetter$Value ConfigOverrides.getDefaultSetterInfo()>
	//    3    7:areturn         
	}

	public final VisibilityChecker getDefaultVisibilityChecker()
	{
		VisibilityChecker visibilitychecker1 = _configOverrides.getDefaultVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field ConfigOverrides _configOverrides>
	//    2    4:invokevirtual   #233 <Method VisibilityChecker ConfigOverrides.getDefaultVisibility()>
	//    3    7:astore_2        
		VisibilityChecker visibilitychecker = visibilitychecker1;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if((_mapperFeatures & AUTO_DETECT_MASK) != 0)
	//*   6   10:aload_0         
	//*   7   11:getfield        #236 <Field int _mapperFeatures>
	//*   8   14:getstatic       #67  <Field int AUTO_DETECT_MASK>
	//*   9   17:iand            
	//*  10   18:ifeq            131
		{
			visibilitychecker = visibilitychecker1;
	//   11   21:aload_2         
	//   12   22:astore_1        
			if(!isEnabled(MapperFeature.AUTO_DETECT_FIELDS))
	//*  13   23:aload_0         
	//*  14   24:getstatic       #49  <Field MapperFeature MapperFeature.AUTO_DETECT_FIELDS>
	//*  15   27:invokevirtual   #240 <Method boolean isEnabled(MapperFeature)>
	//*  16   30:ifne            43
				visibilitychecker = visibilitychecker1.withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   17   33:aload_2         
	//   18   34:getstatic       #246 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   19   37:invokeinterface #252 <Method VisibilityChecker VisibilityChecker.withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   20   42:astore_1        
			visibilitychecker1 = visibilitychecker;
	//   21   43:aload_1         
	//   22   44:astore_2        
			if(!isEnabled(MapperFeature.AUTO_DETECT_GETTERS))
	//*  23   45:aload_0         
	//*  24   46:getstatic       #56  <Field MapperFeature MapperFeature.AUTO_DETECT_GETTERS>
	//*  25   49:invokevirtual   #240 <Method boolean isEnabled(MapperFeature)>
	//*  26   52:ifne            65
				visibilitychecker1 = visibilitychecker.withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   27   55:aload_1         
	//   28   56:getstatic       #246 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   29   59:invokeinterface #255 <Method VisibilityChecker VisibilityChecker.withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   30   64:astore_2        
			visibilitychecker = visibilitychecker1;
	//   31   65:aload_2         
	//   32   66:astore_1        
			if(!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS))
	//*  33   67:aload_0         
	//*  34   68:getstatic       #59  <Field MapperFeature MapperFeature.AUTO_DETECT_IS_GETTERS>
	//*  35   71:invokevirtual   #240 <Method boolean isEnabled(MapperFeature)>
	//*  36   74:ifne            87
				visibilitychecker = visibilitychecker1.withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   37   77:aload_2         
	//   38   78:getstatic       #246 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   39   81:invokeinterface #258 <Method VisibilityChecker VisibilityChecker.withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   40   86:astore_1        
			visibilitychecker1 = visibilitychecker;
	//   41   87:aload_1         
	//   42   88:astore_2        
			if(!isEnabled(MapperFeature.AUTO_DETECT_SETTERS))
	//*  43   89:aload_0         
	//*  44   90:getstatic       #62  <Field MapperFeature MapperFeature.AUTO_DETECT_SETTERS>
	//*  45   93:invokevirtual   #240 <Method boolean isEnabled(MapperFeature)>
	//*  46   96:ifne            109
				visibilitychecker1 = visibilitychecker.withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   47   99:aload_1         
	//   48  100:getstatic       #246 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   49  103:invokeinterface #261 <Method VisibilityChecker VisibilityChecker.withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   50  108:astore_2        
			visibilitychecker = visibilitychecker1;
	//   51  109:aload_2         
	//   52  110:astore_1        
			if(!isEnabled(MapperFeature.AUTO_DETECT_CREATORS))
	//*  53  111:aload_0         
	//*  54  112:getstatic       #65  <Field MapperFeature MapperFeature.AUTO_DETECT_CREATORS>
	//*  55  115:invokevirtual   #240 <Method boolean isEnabled(MapperFeature)>
	//*  56  118:ifne            131
				visibilitychecker = visibilitychecker1.withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   57  121:aload_2         
	//   58  122:getstatic       #246 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   59  125:invokeinterface #264 <Method VisibilityChecker VisibilityChecker.withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   60  130:astore_1        
		}
		return visibilitychecker;
	//   61  131:aload_1         
	//   62  132:areturn         
	}

	public final VisibilityChecker getDefaultVisibilityChecker(Class class1, AnnotatedClass annotatedclass)
	{
		VisibilityChecker visibilitychecker1 = getDefaultVisibilityChecker();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #268 <Method VisibilityChecker getDefaultVisibilityChecker()>
	//    2    4:astore          4
		AnnotationIntrospector annotationintrospector = getAnnotationIntrospector();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #201 <Method AnnotationIntrospector getAnnotationIntrospector()>
	//    5   10:astore          5
		VisibilityChecker visibilitychecker = visibilitychecker1;
	//    6   12:aload           4
	//    7   14:astore_3        
		if(annotationintrospector != null)
	//*   8   15:aload           5
	//*   9   17:ifnull          29
			visibilitychecker = annotationintrospector.findAutoDetectVisibility(annotatedclass, visibilitychecker1);
	//   10   20:aload           5
	//   11   22:aload_2         
	//   12   23:aload           4
	//   13   25:invokevirtual   #272 <Method VisibilityChecker AnnotationIntrospector.findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)>
	//   14   28:astore_3        
		annotatedclass = ((AnnotatedClass) (_configOverrides.findOverride(class1)));
	//   15   29:aload_0         
	//   16   30:getfield        #93  <Field ConfigOverrides _configOverrides>
	//   17   33:aload_1         
	//   18   34:invokevirtual   #149 <Method ConfigOverride ConfigOverrides.findOverride(Class)>
	//   19   37:astore_2        
		class1 = ((Class) (visibilitychecker));
	//   20   38:aload_3         
	//   21   39:astore_1        
		if(annotatedclass != null)
	//*  22   40:aload_2         
	//*  23   41:ifnull          55
			class1 = ((Class) (visibilitychecker.withOverrides(((ConfigOverride) (annotatedclass)).getVisibility())));
	//   24   44:aload_3         
	//   25   45:aload_2         
	//   26   46:invokevirtual   #276 <Method com.fasterxml.jackson.annotation.JsonAutoDetect$Value ConfigOverride.getVisibility()>
	//   27   49:invokeinterface #279 <Method VisibilityChecker VisibilityChecker.withOverrides(com.fasterxml.jackson.annotation.JsonAutoDetect$Value)>
	//   28   54:astore_1        
		return ((VisibilityChecker) (class1));
	//   29   55:aload_1         
	//   30   56:areturn         
	}

	public final PropertyName getFullRootName()
	{
		return _rootName;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field PropertyName _rootName>
	//    2    4:areturn         
	}

	public final SubtypeResolver getSubtypeResolver()
	{
		return _subtypeResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field SubtypeResolver _subtypeResolver>
	//    2    4:areturn         
	}

	public final MapperConfigBase with(PropertyNamingStrategy propertynamingstrategy)
	{
		return _withBase(_base.withPropertyNamingStrategy(propertynamingstrategy));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #290 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #296 <Method BaseSettings BaseSettings.withPropertyNamingStrategy(PropertyNamingStrategy)>
	//    5    9:invokevirtual   #298 <Method MapperConfigBase _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public final MapperConfigBase with(ClassIntrospector classintrospector)
	{
		return _withBase(_base.withClassIntrospector(classintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #290 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #304 <Method BaseSettings BaseSettings.withClassIntrospector(ClassIntrospector)>
	//    5    9:invokevirtual   #298 <Method MapperConfigBase _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public final MapperConfigBase with(TypeFactory typefactory)
	{
		return _withBase(_base.withTypeFactory(typefactory));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #290 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #310 <Method BaseSettings BaseSettings.withTypeFactory(TypeFactory)>
	//    5    9:invokevirtual   #298 <Method MapperConfigBase _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public final transient MapperConfigBase with(MapperFeature amapperfeature[])
	{
		int j = _mapperFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field int _mapperFeatures>
	//    2    4:istore_3        
		int k = amapperfeature.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < k; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          33
			j |= amapperfeature[i].getMask();
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:invokevirtual   #53  <Method int MapperFeature.getMask()>
	//   16   24:ior             
	//   17   25:istore_3        

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
	//*  22   30:goto            11
		if(j == _mapperFeatures)
	//*  23   33:iload_3         
	//*  24   34:aload_0         
	//*  25   35:getfield        #236 <Field int _mapperFeatures>
	//*  26   38:icmpne          43
			return this;
	//   27   41:aload_0         
	//   28   42:areturn         
		else
			return _withMapperFeatures(j);
	//   29   43:aload_0         
	//   30   44:iload_3         
	//   31   45:invokevirtual   #314 <Method MapperConfigBase _withMapperFeatures(int)>
	//   32   48:areturn         
	}

	public final MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return _withBase(_base.withAppendedAnnotationIntrospector(annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #290 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #320 <Method BaseSettings BaseSettings.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//    5    9:invokevirtual   #298 <Method MapperConfigBase _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public final MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return _withBase(_base.withInsertedAnnotationIntrospector(annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #290 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #324 <Method BaseSettings BaseSettings.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//    5    9:invokevirtual   #298 <Method MapperConfigBase _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public final transient MapperConfigBase without(MapperFeature amapperfeature[])
	{
		int j = _mapperFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field int _mapperFeatures>
	//    2    4:istore_3        
		int k = amapperfeature.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < k; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          33
			j &= amapperfeature[i].getMask();
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:invokevirtual   #53  <Method int MapperFeature.getMask()>
	//   16   24:iand            
	//   17   25:istore_3        

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
	//*  22   30:goto            11
		if(j == _mapperFeatures)
	//*  23   33:iload_3         
	//*  24   34:aload_0         
	//*  25   35:getfield        #236 <Field int _mapperFeatures>
	//*  26   38:icmpne          43
			return this;
	//   27   41:aload_0         
	//   28   42:areturn         
		else
			return _withMapperFeatures(j);
	//   29   43:aload_0         
	//   30   44:iload_3         
	//   31   45:invokevirtual   #314 <Method MapperConfigBase _withMapperFeatures(int)>
	//   32   48:areturn         
	}

	private static final int AUTO_DETECT_MASK;
	private static final int DEFAULT_MAPPER_FEATURES = collectFeatureDefaults(com/fasterxml/jackson/databind/MapperFeature);
	protected static final ConfigOverride EMPTY_OVERRIDE = ConfigOverride.empty();
	protected final ContextAttributes _attributes;
	protected final ConfigOverrides _configOverrides;
	protected final SimpleMixInResolver _mixIns;
	protected final PropertyName _rootName;
	protected final RootNameLookup _rootNames;
	protected final SubtypeResolver _subtypeResolver;
	protected final Class _view;

	static 
	{
	//    0    0:invokestatic    #35  <Method ConfigOverride ConfigOverride.empty()>
	//    1    3:putstatic       #37  <Field ConfigOverride EMPTY_OVERRIDE>
	//    2    6:ldc1            #39  <Class MapperFeature>
	//    3    8:invokestatic    #43  <Method int collectFeatureDefaults(Class)>
	//    4   11:putstatic       #45  <Field int DEFAULT_MAPPER_FEATURES>
		AUTO_DETECT_MASK = MapperFeature.AUTO_DETECT_FIELDS.getMask() | MapperFeature.AUTO_DETECT_GETTERS.getMask() | MapperFeature.AUTO_DETECT_IS_GETTERS.getMask() | MapperFeature.AUTO_DETECT_SETTERS.getMask() | MapperFeature.AUTO_DETECT_CREATORS.getMask();
	//    5   14:getstatic       #49  <Field MapperFeature MapperFeature.AUTO_DETECT_FIELDS>
	//    6   17:invokevirtual   #53  <Method int MapperFeature.getMask()>
	//    7   20:getstatic       #56  <Field MapperFeature MapperFeature.AUTO_DETECT_GETTERS>
	//    8   23:invokevirtual   #53  <Method int MapperFeature.getMask()>
	//    9   26:ior             
	//   10   27:getstatic       #59  <Field MapperFeature MapperFeature.AUTO_DETECT_IS_GETTERS>
	//   11   30:invokevirtual   #53  <Method int MapperFeature.getMask()>
	//   12   33:ior             
	//   13   34:getstatic       #62  <Field MapperFeature MapperFeature.AUTO_DETECT_SETTERS>
	//   14   37:invokevirtual   #53  <Method int MapperFeature.getMask()>
	//   15   40:ior             
	//   16   41:getstatic       #65  <Field MapperFeature MapperFeature.AUTO_DETECT_CREATORS>
	//   17   44:invokevirtual   #53  <Method int MapperFeature.getMask()>
	//   18   47:ior             
	//   19   48:putstatic       #67  <Field int AUTO_DETECT_MASK>
	//*  20   51:return          
	}
}
