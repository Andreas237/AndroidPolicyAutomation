// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//			MapperConfig, ContextAttributes, BaseSettings, HandlerInstantiator

public abstract class MapperConfigBase extends MapperConfig
	implements Serializable
{

	protected MapperConfigBase(BaseSettings basesettings, SubtypeResolver subtyperesolver, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup)
	{
		super(basesettings, DEFAULT_MAPPER_FEATURES);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #32  <Field int DEFAULT_MAPPER_FEATURES>
	//    3    5:invokespecial   #38  <Method void MapperConfig(BaseSettings, int)>
		_mixIns = simplemixinresolver;
	//    4    8:aload_0         
	//    5    9:aload_3         
	//    6   10:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = subtyperesolver;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = rootnamelookup;
	//   10   18:aload_0         
	//   11   19:aload           4
	//   12   21:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = null;
	//   13   24:aload_0         
	//   14   25:aconst_null     
	//   15   26:putfield        #46  <Field PropertyName _rootName>
		_view = null;
	//   16   29:aload_0         
	//   17   30:aconst_null     
	//   18   31:putfield        #48  <Field Class _view>
		_attributes = ContextAttributes.getEmpty();
	//   19   34:aload_0         
	//   20   35:invokestatic    #54  <Method ContextAttributes ContextAttributes.getEmpty()>
	//   21   38:putfield        #56  <Field ContextAttributes _attributes>
	//   22   41:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase)
	{
		super(((MapperConfig) (mapperconfigbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void MapperConfig(MapperConfig)>
		_mixIns = mapperconfigbase._mixIns;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    6   10:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//   10   18:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #44  <Field RootNameLookup _rootNames>
	//   14   26:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getfield        #46  <Field PropertyName _rootName>
	//   18   34:putfield        #46  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getfield        #48  <Field Class _view>
	//   22   42:putfield        #48  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   23   45:aload_0         
	//   24   46:aload_1         
	//   25   47:getfield        #56  <Field ContextAttributes _attributes>
	//   26   50:putfield        #56  <Field ContextAttributes _attributes>
	//   27   53:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, int i)
	{
		super(((MapperConfig) (mapperconfigbase)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #66  <Method void MapperConfig(MapperConfig, int)>
		_mixIns = mapperconfigbase._mixIns;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    7   11:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//   11   19:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #44  <Field RootNameLookup _rootNames>
	//   15   27:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #46  <Field PropertyName _rootName>
	//   19   35:putfield        #46  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #48  <Field Class _view>
	//   23   43:putfield        #48  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #56  <Field ContextAttributes _attributes>
	//   27   51:putfield        #56  <Field ContextAttributes _attributes>
	//   28   54:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, PropertyName propertyname)
	{
		super(((MapperConfig) (mapperconfigbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void MapperConfig(MapperConfig)>
		_mixIns = mapperconfigbase._mixIns;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    6   10:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//   10   18:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #44  <Field RootNameLookup _rootNames>
	//   14   26:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = propertyname;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #46  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #48  <Field Class _view>
	//   21   39:putfield        #48  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #56  <Field ContextAttributes _attributes>
	//   25   47:putfield        #56  <Field ContextAttributes _attributes>
	//   26   50:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, BaseSettings basesettings)
	{
		super(((MapperConfig) (mapperconfigbase)), basesettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #73  <Method void MapperConfig(MapperConfig, BaseSettings)>
		_mixIns = mapperconfigbase._mixIns;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    7   11:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//   11   19:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #44  <Field RootNameLookup _rootNames>
	//   15   27:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #46  <Field PropertyName _rootName>
	//   19   35:putfield        #46  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #48  <Field Class _view>
	//   23   43:putfield        #48  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #56  <Field ContextAttributes _attributes>
	//   27   51:putfield        #56  <Field ContextAttributes _attributes>
	//   28   54:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, ContextAttributes contextattributes)
	{
		super(((MapperConfig) (mapperconfigbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void MapperConfig(MapperConfig)>
		_mixIns = mapperconfigbase._mixIns;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    6   10:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//   10   18:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #44  <Field RootNameLookup _rootNames>
	//   14   26:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getfield        #46  <Field PropertyName _rootName>
	//   18   34:putfield        #46  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getfield        #48  <Field Class _view>
	//   22   42:putfield        #48  <Field Class _view>
		_attributes = contextattributes;
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:putfield        #56  <Field ContextAttributes _attributes>
	//   26   50:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, SimpleMixInResolver simplemixinresolver)
	{
		super(((MapperConfig) (mapperconfigbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void MapperConfig(MapperConfig)>
		_mixIns = simplemixinresolver;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//    9   15:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #44  <Field RootNameLookup _rootNames>
	//   13   23:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #46  <Field PropertyName _rootName>
	//   17   31:putfield        #46  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #48  <Field Class _view>
	//   21   39:putfield        #48  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #56  <Field ContextAttributes _attributes>
	//   25   47:putfield        #56  <Field ContextAttributes _attributes>
	//   26   50:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup)
	{
		super(((MapperConfig) (mapperconfigbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void MapperConfig(MapperConfig)>
		_mixIns = simplemixinresolver;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//    9   15:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = rootnamelookup;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #46  <Field PropertyName _rootName>
	//   16   28:putfield        #46  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getfield        #48  <Field Class _view>
	//   20   36:putfield        #48  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:getfield        #56  <Field ContextAttributes _attributes>
	//   24   44:putfield        #56  <Field ContextAttributes _attributes>
	//   25   47:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, SubtypeResolver subtyperesolver)
	{
		super(((MapperConfig) (mapperconfigbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void MapperConfig(MapperConfig)>
		_mixIns = mapperconfigbase._mixIns;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    6   10:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = subtyperesolver;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #44  <Field RootNameLookup _rootNames>
	//   13   23:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #46  <Field PropertyName _rootName>
	//   17   31:putfield        #46  <Field PropertyName _rootName>
		_view = mapperconfigbase._view;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #48  <Field Class _view>
	//   21   39:putfield        #48  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #56  <Field ContextAttributes _attributes>
	//   25   47:putfield        #56  <Field ContextAttributes _attributes>
	//   26   50:return          
	}

	protected MapperConfigBase(MapperConfigBase mapperconfigbase, Class class1)
	{
		super(((MapperConfig) (mapperconfigbase)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #60  <Method void MapperConfig(MapperConfig)>
		_mixIns = mapperconfigbase._mixIns;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    6   10:putfield        #40  <Field SimpleMixInResolver _mixIns>
		_subtypeResolver = mapperconfigbase._subtypeResolver;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//   10   18:putfield        #42  <Field SubtypeResolver _subtypeResolver>
		_rootNames = mapperconfigbase._rootNames;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #44  <Field RootNameLookup _rootNames>
	//   14   26:putfield        #44  <Field RootNameLookup _rootNames>
		_rootName = mapperconfigbase._rootName;
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:getfield        #46  <Field PropertyName _rootName>
	//   18   34:putfield        #46  <Field PropertyName _rootName>
		_view = class1;
	//   19   37:aload_0         
	//   20   38:aload_2         
	//   21   39:putfield        #48  <Field Class _view>
		_attributes = mapperconfigbase._attributes;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #56  <Field ContextAttributes _attributes>
	//   25   47:putfield        #56  <Field ContextAttributes _attributes>
	//   26   50:return          
	}

	public com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver copy()
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #88  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #90  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public final Class findMixInClassFor(Class class1)
	{
		return _mixIns.findMixInClassFor(class1);
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #96  <Method Class SimpleMixInResolver.findMixInClassFor(Class)>
	//    4    8:areturn         
	}

	public PropertyName findRootName(JavaType javatype)
	{
		if(_rootName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field PropertyName _rootName>
	//*   2    4:ifnull          12
			return _rootName;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field PropertyName _rootName>
	//    5   11:areturn         
		else
			return _rootNames.findRootName(javatype, ((MapperConfig) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field RootNameLookup _rootNames>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #104 <Method PropertyName RootNameLookup.findRootName(JavaType, MapperConfig)>
	//   11   21:areturn         
	}

	public PropertyName findRootName(Class class1)
	{
		if(_rootName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field PropertyName _rootName>
	//*   2    4:ifnull          12
			return _rootName;
	//    3    7:aload_0         
	//    4    8:getfield        #46  <Field PropertyName _rootName>
	//    5   11:areturn         
		else
			return _rootNames.findRootName(class1, ((MapperConfig) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field RootNameLookup _rootNames>
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:invokevirtual   #108 <Method PropertyName RootNameLookup.findRootName(Class, MapperConfig)>
	//   11   21:areturn         
	}

	public final Class getActiveView()
	{
		return _view;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field Class _view>
	//    2    4:areturn         
	}

	public final ContextAttributes getAttributes()
	{
		return _attributes;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field ContextAttributes _attributes>
	//    2    4:areturn         
	}

	public final PropertyName getFullRootName()
	{
		return _rootName;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field PropertyName _rootName>
	//    2    4:areturn         
	}

	public final String getRootName()
	{
		if(_rootName == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #46  <Field PropertyName _rootName>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _rootName.getSimpleName();
	//    5    9:aload_0         
	//    6   10:getfield        #46  <Field PropertyName _rootName>
	//    7   13:invokevirtual   #123 <Method String PropertyName.getSimpleName()>
	//    8   16:areturn         
	}

	public final SubtypeResolver getSubtypeResolver()
	{
		return _subtypeResolver;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field SubtypeResolver _subtypeResolver>
	//    2    4:areturn         
	}

	public final int mixInCount()
	{
		return _mixIns.localSize();
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field SimpleMixInResolver _mixIns>
	//    2    4:invokevirtual   #131 <Method int SimpleMixInResolver.localSize()>
	//    3    7:ireturn         
	}

	public abstract MapperConfigBase with(Base64Variant base64variant);

	public abstract MapperConfigBase with(AnnotationIntrospector annotationintrospector);

	public abstract MapperConfigBase with(PropertyNamingStrategy propertynamingstrategy);

	public abstract MapperConfigBase with(ContextAttributes contextattributes);

	public abstract MapperConfigBase with(HandlerInstantiator handlerinstantiator);

	public abstract MapperConfigBase with(ClassIntrospector classintrospector);

	public abstract MapperConfigBase with(VisibilityChecker visibilitychecker);

	public abstract MapperConfigBase with(SubtypeResolver subtyperesolver);

	public abstract MapperConfigBase with(TypeResolverBuilder typeresolverbuilder);

	public abstract MapperConfigBase with(TypeFactory typefactory);

	public abstract MapperConfigBase with(DateFormat dateformat);

	public abstract MapperConfigBase with(Locale locale);

	public abstract MapperConfigBase with(TimeZone timezone);

	public abstract MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

	public MapperConfigBase withAttribute(Object obj, Object obj1)
	{
		return with(getAttributes().withSharedAttribute(obj, obj1));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #150 <Method ContextAttributes getAttributes()>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #154 <Method ContextAttributes ContextAttributes.withSharedAttribute(Object, Object)>
	//    6   10:invokevirtual   #156 <Method MapperConfigBase with(ContextAttributes)>
	//    7   13:areturn         
	}

	public MapperConfigBase withAttributes(Map map)
	{
		return with(getAttributes().withSharedAttributes(map));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #150 <Method ContextAttributes getAttributes()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #163 <Method ContextAttributes ContextAttributes.withSharedAttributes(Map)>
	//    5    9:invokevirtual   #156 <Method MapperConfigBase with(ContextAttributes)>
	//    6   12:areturn         
	}

	public abstract MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

	public abstract MapperConfigBase withRootName(PropertyName propertyname);

	public MapperConfigBase withRootName(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
			return withRootName((PropertyName)null);
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:checkcast       #120 <Class PropertyName>
	//    5    9:invokevirtual   #170 <Method MapperConfigBase withRootName(PropertyName)>
	//    6   12:areturn         
		else
			return withRootName(PropertyName.construct(s));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #174 <Method PropertyName PropertyName.construct(String)>
	//   10   18:invokevirtual   #170 <Method MapperConfigBase withRootName(PropertyName)>
	//   11   21:areturn         
	}

	public abstract MapperConfigBase withView(Class class1);

	public abstract MapperConfigBase withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

	public MapperConfigBase withoutAttribute(Object obj)
	{
		return with(getAttributes().withoutSharedAttribute(obj));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #150 <Method ContextAttributes getAttributes()>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #185 <Method ContextAttributes ContextAttributes.withoutSharedAttribute(Object)>
	//    5    9:invokevirtual   #156 <Method MapperConfigBase with(ContextAttributes)>
	//    6   12:areturn         
	}

	private static final int DEFAULT_MAPPER_FEATURES = collectFeatureDefaults(com/fasterxml/jackson/databind/MapperFeature);
	protected final ContextAttributes _attributes;
	protected final SimpleMixInResolver _mixIns;
	protected final PropertyName _rootName;
	protected final RootNameLookup _rootNames;
	protected final SubtypeResolver _subtypeResolver;
	protected final Class _view;

	static 
	{
	//    0    0:ldc1            #26  <Class MapperFeature>
	//    1    2:invokestatic    #30  <Method int collectFeatureDefaults(Class)>
	//    2    5:putstatic       #32  <Field int DEFAULT_MAPPER_FEATURES>
	//*   3    8:return          
	}
}
