// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind:
//			SerializationFeature, MapperFeature, AnnotationIntrospector, PropertyName, 
//			JavaType, BeanDescription, PropertyNamingStrategy

public final class SerializationConfig extends MapperConfigBase
	implements Serializable
{

	private SerializationConfig(SerializationConfig serializationconfig, int i, int j, int k, int l, int i1, int j1)
	{
		super(((MapperConfigBase) (serializationconfig)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #47  <Method void MapperConfigBase(MapperConfigBase, int)>
		_serFeatures = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   10   16:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:getfield        #53  <Field FilterProvider _filterProvider>
	//   14   24:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   18   32:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = k;
	//   19   35:aload_0         
	//   20   36:iload           4
	//   21   38:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = l;
	//   22   41:aload_0         
	//   23   42:iload           5
	//   24   44:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = i1;
	//   25   47:aload_0         
	//   26   48:iload           6
	//   27   50:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = j1;
	//   28   53:aload_0         
	//   29   54:iload           7
	//   30   56:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   31   59:return          
	}

	private SerializationConfig(SerializationConfig serializationconfig, com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		super(((MapperConfigBase) (serializationconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void MapperConfigBase(MapperConfigBase)>
		_serFeatures = serializationconfig._serFeatures;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #49  <Field int _serFeatures>
	//    6   10:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = value;
	//    7   13:aload_0         
	//    8   14:aload_2         
	//    9   15:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #53  <Field FilterProvider _filterProvider>
	//   13   23:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   17   31:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #57  <Field int _generatorFeatures>
	//   21   39:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #59  <Field int _generatorFeaturesToChange>
	//   25   47:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #61  <Field int _formatWriteFeatures>
	//   29   55:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   33   63:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   34   66:return          
	}

	protected SerializationConfig(SerializationConfig serializationconfig, PrettyPrinter prettyprinter)
	{
		super(((MapperConfigBase) (serializationconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void MapperConfigBase(MapperConfigBase)>
		_serFeatures = serializationconfig._serFeatures;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #49  <Field int _serFeatures>
	//    6   10:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   10   18:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:getfield        #53  <Field FilterProvider _filterProvider>
	//   14   26:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = prettyprinter;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #57  <Field int _generatorFeatures>
	//   21   39:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #59  <Field int _generatorFeaturesToChange>
	//   25   47:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #61  <Field int _formatWriteFeatures>
	//   29   55:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   33   63:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   34   66:return          
	}

	private SerializationConfig(SerializationConfig serializationconfig, PropertyName propertyname)
	{
		super(((MapperConfigBase) (serializationconfig)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #72  <Method void MapperConfigBase(MapperConfigBase, PropertyName)>
		_serFeatures = serializationconfig._serFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #49  <Field int _serFeatures>
	//    7   11:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   11   19:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #53  <Field FilterProvider _filterProvider>
	//   15   27:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   19   35:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #57  <Field int _generatorFeatures>
	//   23   43:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #59  <Field int _generatorFeaturesToChange>
	//   27   51:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #61  <Field int _formatWriteFeatures>
	//   31   59:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   35   67:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   36   70:return          
	}

	private SerializationConfig(SerializationConfig serializationconfig, BaseSettings basesettings)
	{
		super(((MapperConfigBase) (serializationconfig)), basesettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #76  <Method void MapperConfigBase(MapperConfigBase, BaseSettings)>
		_serFeatures = serializationconfig._serFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #49  <Field int _serFeatures>
	//    7   11:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   11   19:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #53  <Field FilterProvider _filterProvider>
	//   15   27:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   19   35:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #57  <Field int _generatorFeatures>
	//   23   43:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #59  <Field int _generatorFeaturesToChange>
	//   27   51:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #61  <Field int _formatWriteFeatures>
	//   31   59:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   35   67:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   36   70:return          
	}

	protected SerializationConfig(SerializationConfig serializationconfig, ContextAttributes contextattributes)
	{
		super(((MapperConfigBase) (serializationconfig)), contextattributes);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #80  <Method void MapperConfigBase(MapperConfigBase, ContextAttributes)>
		_serFeatures = serializationconfig._serFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #49  <Field int _serFeatures>
	//    7   11:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   11   19:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #53  <Field FilterProvider _filterProvider>
	//   15   27:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   19   35:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #57  <Field int _generatorFeatures>
	//   23   43:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #59  <Field int _generatorFeaturesToChange>
	//   27   51:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #61  <Field int _formatWriteFeatures>
	//   31   59:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   35   67:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   36   70:return          
	}

	protected SerializationConfig(SerializationConfig serializationconfig, SimpleMixInResolver simplemixinresolver)
	{
		super(((MapperConfigBase) (serializationconfig)), simplemixinresolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #84  <Method void MapperConfigBase(MapperConfigBase, SimpleMixInResolver)>
		_serFeatures = serializationconfig._serFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #49  <Field int _serFeatures>
	//    7   11:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   11   19:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #53  <Field FilterProvider _filterProvider>
	//   15   27:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   19   35:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #57  <Field int _generatorFeatures>
	//   23   43:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #59  <Field int _generatorFeaturesToChange>
	//   27   51:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #61  <Field int _formatWriteFeatures>
	//   31   59:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   35   67:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   36   70:return          
	}

	protected SerializationConfig(SerializationConfig serializationconfig, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup)
	{
		super(((MapperConfigBase) (serializationconfig)), simplemixinresolver, rootnamelookup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #88  <Method void MapperConfigBase(MapperConfigBase, SimpleMixInResolver, RootNameLookup)>
		_serFeatures = serializationconfig._serFeatures;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #49  <Field int _serFeatures>
	//    8   12:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   12   20:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #53  <Field FilterProvider _filterProvider>
	//   16   28:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   20   36:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:getfield        #57  <Field int _generatorFeatures>
	//   24   44:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:getfield        #59  <Field int _generatorFeaturesToChange>
	//   28   52:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:getfield        #61  <Field int _formatWriteFeatures>
	//   32   60:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   36   68:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   37   71:return          
	}

	private SerializationConfig(SerializationConfig serializationconfig, SubtypeResolver subtyperesolver)
	{
		super(((MapperConfigBase) (serializationconfig)), subtyperesolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #92  <Method void MapperConfigBase(MapperConfigBase, SubtypeResolver)>
		_serFeatures = serializationconfig._serFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #49  <Field int _serFeatures>
	//    7   11:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   11   19:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #53  <Field FilterProvider _filterProvider>
	//   15   27:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   19   35:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #57  <Field int _generatorFeatures>
	//   23   43:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #59  <Field int _generatorFeaturesToChange>
	//   27   51:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #61  <Field int _formatWriteFeatures>
	//   31   59:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   35   67:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   36   70:return          
	}

	private SerializationConfig(SerializationConfig serializationconfig, FilterProvider filterprovider)
	{
		super(((MapperConfigBase) (serializationconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #67  <Method void MapperConfigBase(MapperConfigBase)>
		_serFeatures = serializationconfig._serFeatures;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #49  <Field int _serFeatures>
	//    6   10:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   10   18:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = filterprovider;
	//   11   21:aload_0         
	//   12   22:aload_2         
	//   13   23:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   17   31:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   18   34:aload_0         
	//   19   35:aload_1         
	//   20   36:getfield        #57  <Field int _generatorFeatures>
	//   21   39:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:getfield        #59  <Field int _generatorFeaturesToChange>
	//   25   47:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:getfield        #61  <Field int _formatWriteFeatures>
	//   29   55:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   33   63:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   34   66:return          
	}

	private SerializationConfig(SerializationConfig serializationconfig, Class class1)
	{
		super(((MapperConfigBase) (serializationconfig)), class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #97  <Method void MapperConfigBase(MapperConfigBase, Class)>
		_serFeatures = serializationconfig._serFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #49  <Field int _serFeatures>
	//    7   11:putfield        #49  <Field int _serFeatures>
		_serializationInclusion = serializationconfig._serializationInclusion;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   11   19:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
		_filterProvider = serializationconfig._filterProvider;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #53  <Field FilterProvider _filterProvider>
	//   15   27:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//   19   35:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #57  <Field int _generatorFeatures>
	//   23   43:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #59  <Field int _generatorFeaturesToChange>
	//   27   51:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #61  <Field int _formatWriteFeatures>
	//   31   59:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   32   62:aload_0         
	//   33   63:aload_1         
	//   34   64:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   35   67:putfield        #63  <Field int _formatWriteFeaturesToChange>
	//   36   70:return          
	}

	public SerializationConfig(BaseSettings basesettings, SubtypeResolver subtyperesolver, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup)
	{
		super(basesettings, subtyperesolver, simplemixinresolver, rootnamelookup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #102 <Method void MapperConfigBase(BaseSettings, SubtypeResolver, SimpleMixInResolver, RootNameLookup)>
		_serFeatures = collectFeatureDefaults(com/fasterxml/jackson/databind/SerializationFeature);
	//    6    9:aload_0         
	//    7   10:ldc1            #104 <Class SerializationFeature>
	//    8   12:invokestatic    #108 <Method int collectFeatureDefaults(Class)>
	//    9   15:putfield        #49  <Field int _serFeatures>
		_filterProvider = null;
	//   10   18:aload_0         
	//   11   19:aconst_null     
	//   12   20:putfield        #53  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
	//   13   23:aload_0         
	//   14   24:getstatic       #34  <Field PrettyPrinter DEFAULT_PRETTY_PRINTER>
	//   15   27:putfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #57  <Field int _generatorFeatures>
		_generatorFeaturesToChange = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #59  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = 0;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #61  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = 0;
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:putfield        #63  <Field int _formatWriteFeaturesToChange>
		_serializationInclusion = DEFAULT_INCLUSION;
	//   28   50:aload_0         
	//   29   51:getstatic       #42  <Field com.fasterxml.jackson.annotation.JsonInclude$Value DEFAULT_INCLUSION>
	//   30   54:putfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//   31   57:return          
	}

	private final SerializationConfig _withBase(BaseSettings basesettings)
	{
		if(_base == basesettings)
	//*   0    0:aload_0         
	//*   1    1:getfield        #114 <Field BaseSettings _base>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SerializationConfig(this, basesettings);
	//    6   10:new             #2   <Class SerializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #116 <Method void SerializationConfig(SerializationConfig, BaseSettings)>
	//   11   19:areturn         
	}

	public PrettyPrinter constructDefaultPrettyPrinter()
	{
		PrettyPrinter prettyprinter1 = _defaultPrettyPrinter;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//    2    4:astore_2        
		PrettyPrinter prettyprinter = prettyprinter1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(prettyprinter1 instanceof Instantiatable)
	//*   5    7:aload_2         
	//*   6    8:instanceof      #120 <Class Instantiatable>
	//*   7   11:ifeq            27
			prettyprinter = (PrettyPrinter)((Instantiatable)prettyprinter1).createInstance();
	//    8   14:aload_2         
	//    9   15:checkcast       #120 <Class Instantiatable>
	//   10   18:invokeinterface #124 <Method Object Instantiatable.createInstance()>
	//   11   23:checkcast       #126 <Class PrettyPrinter>
	//   12   26:astore_1        
		return prettyprinter;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	public AnnotationIntrospector getAnnotationIntrospector()
	{
		if(isEnabled(MapperFeature.USE_ANNOTATIONS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #134 <Field MapperFeature MapperFeature.USE_ANNOTATIONS>
	//*   2    4:invokevirtual   #138 <Method boolean isEnabled(MapperFeature)>
	//*   3    7:ifeq            15
			return super.getAnnotationIntrospector();
	//    4   10:aload_0         
	//    5   11:invokespecial   #140 <Method AnnotationIntrospector MapperConfigBase.getAnnotationIntrospector()>
	//    6   14:areturn         
		else
			return AnnotationIntrospector.nopInstance();
	//    7   15:invokestatic    #145 <Method AnnotationIntrospector AnnotationIntrospector.nopInstance()>
	//    8   18:areturn         
	}

	public PrettyPrinter getDefaultPrettyPrinter()
	{
		return _defaultPrettyPrinter;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1)
	{
		return EMPTY_FORMAT;
	//    0    0:getstatic       #152 <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//    1    3:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion()
	{
		return _serializationInclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion(Class class1)
	{
		return _serializationInclusion;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//    2    4:areturn         
	}

	public VisibilityChecker getDefaultVisibilityChecker()
	{
		VisibilityChecker visibilitychecker1 = super.getDefaultVisibilityChecker();
	//    0    0:aload_0         
	//    1    1:invokespecial   #160 <Method VisibilityChecker MapperConfigBase.getDefaultVisibilityChecker()>
	//    2    4:astore_2        
		VisibilityChecker visibilitychecker = visibilitychecker1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(!isEnabled(MapperFeature.AUTO_DETECT_GETTERS))
	//*   5    7:aload_0         
	//*   6    8:getstatic       #163 <Field MapperFeature MapperFeature.AUTO_DETECT_GETTERS>
	//*   7   11:invokevirtual   #138 <Method boolean isEnabled(MapperFeature)>
	//*   8   14:ifne            27
			visibilitychecker = visibilitychecker1.withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//    9   17:aload_2         
	//   10   18:getstatic       #169 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   11   21:invokeinterface #175 <Method VisibilityChecker VisibilityChecker.withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   12   26:astore_1        
		visibilitychecker1 = visibilitychecker;
	//   13   27:aload_1         
	//   14   28:astore_2        
		if(!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS))
	//*  15   29:aload_0         
	//*  16   30:getstatic       #178 <Field MapperFeature MapperFeature.AUTO_DETECT_IS_GETTERS>
	//*  17   33:invokevirtual   #138 <Method boolean isEnabled(MapperFeature)>
	//*  18   36:ifne            49
			visibilitychecker1 = visibilitychecker.withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   19   39:aload_1         
	//   20   40:getstatic       #169 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   21   43:invokeinterface #181 <Method VisibilityChecker VisibilityChecker.withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   22   48:astore_2        
		visibilitychecker = visibilitychecker1;
	//   23   49:aload_2         
	//   24   50:astore_1        
		if(!isEnabled(MapperFeature.AUTO_DETECT_FIELDS))
	//*  25   51:aload_0         
	//*  26   52:getstatic       #184 <Field MapperFeature MapperFeature.AUTO_DETECT_FIELDS>
	//*  27   55:invokevirtual   #138 <Method boolean isEnabled(MapperFeature)>
	//*  28   58:ifne            71
			visibilitychecker = visibilitychecker1.withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   29   61:aload_2         
	//   30   62:getstatic       #169 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   31   65:invokeinterface #187 <Method VisibilityChecker VisibilityChecker.withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   32   70:astore_1        
		return visibilitychecker;
	//   33   71:aload_1         
	//   34   72:areturn         
	}

	public FilterProvider getFilterProvider()
	{
		return _filterProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field FilterProvider _filterProvider>
	//    2    4:areturn         
	}

	public final int getSerializationFeatures()
	{
		return _serFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:ireturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Include getSerializationInclusion()
	{
		com.fasterxml.jackson.annotation.JsonInclude.Include include1 = _serializationInclusion.getValueInclusion();
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//    2    4:invokevirtual   #198 <Method com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Value.getValueInclusion()>
	//    3    7:astore_2        
		com.fasterxml.jackson.annotation.JsonInclude.Include include = include1;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(include1 == com.fasterxml.jackson.annotation.JsonInclude.Include.USE_DEFAULTS)
	//*   6   10:aload_2         
	//*   7   11:getstatic       #204 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.USE_DEFAULTS>
	//*   8   14:if_acmpne       21
			include = com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;
	//    9   17:getstatic       #207 <Field com.fasterxml.jackson.annotation.JsonInclude$Include com.fasterxml.jackson.annotation.JsonInclude$Include.ALWAYS>
	//   10   20:astore_1        
		return include;
	//   11   21:aload_1         
	//   12   22:areturn         
	}

	public final boolean hasSerializationFeatures(int i)
	{
		return (_serFeatures & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public void initialize(JsonGenerator jsongenerator)
	{
		if(SerializationFeature.INDENT_OUTPUT.enabledIn(_serFeatures) && jsongenerator.getPrettyPrinter() == null)
	//*   0    0:getstatic       #216 <Field SerializationFeature SerializationFeature.INDENT_OUTPUT>
	//*   1    3:aload_0         
	//*   2    4:getfield        #49  <Field int _serFeatures>
	//*   3    7:invokevirtual   #219 <Method boolean SerializationFeature.enabledIn(int)>
	//*   4   10:ifeq            38
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #224 <Method PrettyPrinter JsonGenerator.getPrettyPrinter()>
	//*   7   17:ifnonnull       38
		{
			PrettyPrinter prettyprinter = constructDefaultPrettyPrinter();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #226 <Method PrettyPrinter constructDefaultPrettyPrinter()>
	//   10   24:astore          7
			if(prettyprinter != null)
	//*  11   26:aload           7
	//*  12   28:ifnull          38
				jsongenerator.setPrettyPrinter(prettyprinter);
	//   13   31:aload_1         
	//   14   32:aload           7
	//   15   34:invokevirtual   #230 <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
	//   16   37:pop             
		}
		boolean flag = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(_serFeatures);
	//   17   38:getstatic       #233 <Field SerializationFeature SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN>
	//   18   41:aload_0         
	//   19   42:getfield        #49  <Field int _serFeatures>
	//   20   45:invokevirtual   #219 <Method boolean SerializationFeature.enabledIn(int)>
	//   21   48:istore          6
		int k = _generatorFeaturesToChange;
	//   22   50:aload_0         
	//   23   51:getfield        #59  <Field int _generatorFeaturesToChange>
	//   24   54:istore          4
		if(k != 0 || flag)
	//*  25   56:iload           4
	//*  26   58:ifne            66
	//*  27   61:iload           6
	//*  28   63:ifeq            107
		{
			int l = _generatorFeatures;
	//   29   66:aload_0         
	//   30   67:getfield        #57  <Field int _generatorFeatures>
	//   31   70:istore          5
			int j = k;
	//   32   72:iload           4
	//   33   74:istore_3        
			int i = l;
	//   34   75:iload           5
	//   35   77:istore_2        
			if(flag)
	//*  36   78:iload           6
	//*  37   80:ifeq            100
			{
				j = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
	//   38   83:getstatic       #238 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_BIGDECIMAL_AS_PLAIN>
	//   39   86:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//   40   89:istore_3        
				i = l | j;
	//   41   90:iload           5
	//   42   92:iload_3         
	//   43   93:ior             
	//   44   94:istore_2        
				j = k | j;
	//   45   95:iload           4
	//   46   97:iload_3         
	//   47   98:ior             
	//   48   99:istore_3        
			}
			jsongenerator.overrideStdFeatures(i, j);
	//   49  100:aload_1         
	//   50  101:iload_2         
	//   51  102:iload_3         
	//   52  103:invokevirtual   #245 <Method JsonGenerator JsonGenerator.overrideStdFeatures(int, int)>
	//   53  106:pop             
		}
		if(_formatWriteFeaturesToChange != 0)
	//*  54  107:aload_0         
	//*  55  108:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//*  56  111:ifeq            127
			jsongenerator.overrideFormatFeatures(_formatWriteFeatures, _formatWriteFeaturesToChange);
	//   57  114:aload_1         
	//   58  115:aload_0         
	//   59  116:getfield        #61  <Field int _formatWriteFeatures>
	//   60  119:aload_0         
	//   61  120:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   62  123:invokevirtual   #248 <Method JsonGenerator JsonGenerator.overrideFormatFeatures(int, int)>
	//   63  126:pop             
	//   64  127:return          
	}

	public BeanDescription introspect(JavaType javatype)
	{
		return getClassIntrospector().forSerialization(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #260 <Method BeanDescription ClassIntrospector.forSerialization(SerializationConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectClassAnnotations(JavaType javatype)
	{
		return getClassIntrospector().forClassAnnotations(((MapperConfig) (this)), javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #266 <Method BeanDescription ClassIntrospector.forClassAnnotations(MapperConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectDirectClassAnnotations(JavaType javatype)
	{
		return getClassIntrospector().forDirectClassAnnotations(((MapperConfig) (this)), javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #254 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #270 <Method BeanDescription ClassIntrospector.forDirectClassAnnotations(MapperConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature, JsonFactory jsonfactory)
	{
		int i = feature.getMask();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    2    4:istore_3        
		if((_generatorFeaturesToChange & i) != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #59  <Field int _generatorFeaturesToChange>
	//*   5    9:iload_3         
	//*   6   10:iand            
	//*   7   11:ifeq            30
			return (_generatorFeatures & feature.getMask()) != 0;
	//    8   14:aload_0         
	//    9   15:getfield        #57  <Field int _generatorFeatures>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//   12   22:iand            
	//   13   23:ifeq            28
	//   14   26:iconst_1        
	//   15   27:ireturn         
	//   16   28:iconst_0        
	//   17   29:ireturn         
		else
			return jsonfactory.isEnabled(feature);
	//   18   30:aload_2         
	//   19   31:aload_1         
	//   20   32:invokevirtual   #276 <Method boolean JsonFactory.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   21   35:ireturn         
	}

	public final boolean isEnabled(SerializationFeature serializationfeature)
	{
		return (_serFeatures & serializationfeature.getMask()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("[SerializationConfig: flags=0x").append(Integer.toHexString(_serFeatures)).append("]").toString();
	//    0    0:new             #282 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #283 <Method void StringBuilder()>
	//    3    7:ldc2            #285 <String "[SerializationConfig: flags=0x">
	//    4   10:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:getfield        #49  <Field int _serFeatures>
	//    7   17:invokestatic    #295 <Method String Integer.toHexString(int)>
	//    8   20:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//    9   23:ldc2            #297 <String "]">
	//   10   26:invokevirtual   #289 <Method StringBuilder StringBuilder.append(String)>
	//   11   29:invokevirtual   #299 <Method String StringBuilder.toString()>
	//   12   32:areturn         
	}

	public boolean useRootWrapping()
	{
		if(_rootName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #305 <Field PropertyName _rootName>
	//*   2    4:ifnull          21
			return !_rootName.isEmpty();
	//    3    7:aload_0         
	//    4    8:getfield        #305 <Field PropertyName _rootName>
	//    5   11:invokevirtual   #310 <Method boolean PropertyName.isEmpty()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
		else
			return isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
	//   11   21:aload_0         
	//   12   22:getstatic       #313 <Field SerializationFeature SerializationFeature.WRAP_ROOT_VALUE>
	//   13   25:invokevirtual   #315 <Method boolean isEnabled(SerializationFeature)>
	//   14   28:ireturn         
	}

	public SerializationConfig with(Base64Variant base64variant)
	{
		return _withBase(_base.with(base64variant));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #322 <Method BaseSettings BaseSettings.with(Base64Variant)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(FormatFeature formatfeature)
	{
		int i = _formatWriteFeatures | formatfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _formatWriteFeatures>
	//    2    4:aload_1         
	//    3    5:invokeinterface #328 <Method int FormatFeature.getMask()>
	//    4   10:ior             
	//    5   11:istore_2        
		int j = _formatWriteFeaturesToChange | formatfeature.getMask();
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//    8   16:aload_1         
	//    9   17:invokeinterface #328 <Method int FormatFeature.getMask()>
	//   10   22:ior             
	//   11   23:istore_3        
		if(_formatWriteFeatures == i && _formatWriteFeaturesToChange == j)
	//*  12   24:aload_0         
	//*  13   25:getfield        #61  <Field int _formatWriteFeatures>
	//*  14   28:iload_2         
	//*  15   29:icmpne          42
	//*  16   32:aload_0         
	//*  17   33:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//*  18   36:iload_3         
	//*  19   37:icmpne          42
			return this;
	//   20   40:aload_0         
	//   21   41:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, _serFeatures, _generatorFeatures, _generatorFeaturesToChange, i, j);
	//   22   42:new             #2   <Class SerializationConfig>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #331 <Field int _mapperFeatures>
	//   27   51:aload_0         
	//   28   52:getfield        #49  <Field int _serFeatures>
	//   29   55:aload_0         
	//   30   56:getfield        #57  <Field int _generatorFeatures>
	//   31   59:aload_0         
	//   32   60:getfield        #59  <Field int _generatorFeaturesToChange>
	//   33   63:iload_2         
	//   34   64:iload_3         
	//   35   65:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   36   68:areturn         
	}

	public SerializationConfig with(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		int i = _generatorFeatures | feature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int _generatorFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    4    8:ior             
	//    5    9:istore_2        
		int j = _generatorFeaturesToChange | feature.getMask();
	//    6   10:aload_0         
	//    7   11:getfield        #59  <Field int _generatorFeaturesToChange>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//   10   18:ior             
	//   11   19:istore_3        
		if(_generatorFeatures == i && _generatorFeaturesToChange == j)
	//*  12   20:aload_0         
	//*  13   21:getfield        #57  <Field int _generatorFeatures>
	//*  14   24:iload_2         
	//*  15   25:icmpne          38
	//*  16   28:aload_0         
	//*  17   29:getfield        #59  <Field int _generatorFeaturesToChange>
	//*  18   32:iload_3         
	//*  19   33:icmpne          38
			return this;
	//   20   36:aload_0         
	//   21   37:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, _serFeatures, i, j, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   22   38:new             #2   <Class SerializationConfig>
	//   23   41:dup             
	//   24   42:aload_0         
	//   25   43:aload_0         
	//   26   44:getfield        #331 <Field int _mapperFeatures>
	//   27   47:aload_0         
	//   28   48:getfield        #49  <Field int _serFeatures>
	//   29   51:iload_2         
	//   30   52:iload_3         
	//   31   53:aload_0         
	//   32   54:getfield        #61  <Field int _formatWriteFeatures>
	//   33   57:aload_0         
	//   34   58:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   35   61:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   36   64:areturn         
	}

	public SerializationConfig with(AnnotationIntrospector annotationintrospector)
	{
		return _withBase(_base.withAnnotationIntrospector(annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #339 <Method BaseSettings BaseSettings.withAnnotationIntrospector(AnnotationIntrospector)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(MapperFeature mapperfeature, boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            24
			i = _mapperFeatures | mapperfeature.getMask();
	//    2    4:aload_0         
	//    3    5:getfield        #331 <Field int _mapperFeatures>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #341 <Method int MapperFeature.getMask()>
	//    6   12:ior             
	//    7   13:istore_3        
		else
	//*   8   14:iload_3         
	//*   9   15:aload_0         
	//*  10   16:getfield        #331 <Field int _mapperFeatures>
	//*  11   19:icmpne          39
	//*  12   22:aload_0         
	//*  13   23:areturn         
			i = _mapperFeatures & ~mapperfeature.getMask();
	//   14   24:aload_0         
	//   15   25:getfield        #331 <Field int _mapperFeatures>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #341 <Method int MapperFeature.getMask()>
	//   18   32:iconst_m1       
	//   19   33:ixor            
	//   20   34:iand            
	//   21   35:istore_3        
		if(i == _mapperFeatures)
			return this;
		else
	//*  22   36:goto            14
			return new SerializationConfig(this, i, _serFeatures, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   23   39:new             #2   <Class SerializationConfig>
	//   24   42:dup             
	//   25   43:aload_0         
	//   26   44:iload_3         
	//   27   45:aload_0         
	//   28   46:getfield        #49  <Field int _serFeatures>
	//   29   49:aload_0         
	//   30   50:getfield        #57  <Field int _generatorFeatures>
	//   31   53:aload_0         
	//   32   54:getfield        #59  <Field int _generatorFeaturesToChange>
	//   33   57:aload_0         
	//   34   58:getfield        #61  <Field int _formatWriteFeatures>
	//   35   61:aload_0         
	//   36   62:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   37   65:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   38   68:areturn         
	}

	public SerializationConfig with(PropertyNamingStrategy propertynamingstrategy)
	{
		return _withBase(_base.withPropertyNamingStrategy(propertynamingstrategy));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #346 <Method BaseSettings BaseSettings.withPropertyNamingStrategy(PropertyNamingStrategy)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(SerializationFeature serializationfeature)
	{
		int i = _serFeatures | serializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//    4    8:ior             
	//    5    9:istore_2        
		if(i == _serFeatures)
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #49  <Field int _serFeatures>
	//*   9   15:icmpne          20
			return this;
	//   10   18:aload_0         
	//   11   19:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, i, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   12   20:new             #2   <Class SerializationConfig>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #331 <Field int _mapperFeatures>
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #57  <Field int _generatorFeatures>
	//   20   34:aload_0         
	//   21   35:getfield        #59  <Field int _generatorFeaturesToChange>
	//   22   38:aload_0         
	//   23   39:getfield        #61  <Field int _formatWriteFeatures>
	//   24   42:aload_0         
	//   25   43:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   26   46:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   27   49:areturn         
	}

	public transient SerializationConfig with(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
	{
		int j = _serFeatures | serializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//    4    8:ior             
	//    5    9:istore          4
		int k = aserializationfeature.length;
	//    6   11:aload_2         
	//    7   12:arraylength     
	//    8   13:istore          5
		for(int i = 0; i < k; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:iload           5
	//*  13   20:icmpge          41
			j |= aserializationfeature[i].getMask();
	//   14   23:iload           4
	//   15   25:aload_2         
	//   16   26:iload_3         
	//   17   27:aaload          
	//   18   28:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//   19   31:ior             
	//   20   32:istore          4

	//   21   34:iload_3         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_3        
	//*  25   38:goto            17
		if(j == _serFeatures)
	//*  26   41:iload           4
	//*  27   43:aload_0         
	//*  28   44:getfield        #49  <Field int _serFeatures>
	//*  29   47:icmpne          52
			return this;
	//   30   50:aload_0         
	//   31   51:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, j, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   32   52:new             #2   <Class SerializationConfig>
	//   33   55:dup             
	//   34   56:aload_0         
	//   35   57:aload_0         
	//   36   58:getfield        #331 <Field int _mapperFeatures>
	//   37   61:iload           4
	//   38   63:aload_0         
	//   39   64:getfield        #57  <Field int _generatorFeatures>
	//   40   67:aload_0         
	//   41   68:getfield        #59  <Field int _generatorFeaturesToChange>
	//   42   71:aload_0         
	//   43   72:getfield        #61  <Field int _formatWriteFeatures>
	//   44   75:aload_0         
	//   45   76:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   46   79:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   47   82:areturn         
	}

	public SerializationConfig with(ContextAttributes contextattributes)
	{
		if(contextattributes == _attributes)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #353 <Field ContextAttributes _attributes>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SerializationConfig(this, contextattributes);
	//    6   10:new             #2   <Class SerializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #355 <Method void SerializationConfig(SerializationConfig, ContextAttributes)>
	//   11   19:areturn         
	}

	public SerializationConfig with(HandlerInstantiator handlerinstantiator)
	{
		return _withBase(_base.withHandlerInstantiator(handlerinstantiator));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #360 <Method BaseSettings BaseSettings.withHandlerInstantiator(HandlerInstantiator)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(ClassIntrospector classintrospector)
	{
		return _withBase(_base.withClassIntrospector(classintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #365 <Method BaseSettings BaseSettings.withClassIntrospector(ClassIntrospector)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(VisibilityChecker visibilitychecker)
	{
		return _withBase(_base.withVisibilityChecker(visibilitychecker));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #370 <Method BaseSettings BaseSettings.withVisibilityChecker(VisibilityChecker)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(SubtypeResolver subtyperesolver)
	{
		if(subtyperesolver == _subtypeResolver)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #376 <Field SubtypeResolver _subtypeResolver>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SerializationConfig(this, subtyperesolver);
	//    6   10:new             #2   <Class SerializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #378 <Method void SerializationConfig(SerializationConfig, SubtypeResolver)>
	//   11   19:areturn         
	}

	public SerializationConfig with(TypeResolverBuilder typeresolverbuilder)
	{
		return _withBase(_base.withTypeResolverBuilder(typeresolverbuilder));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #383 <Method BaseSettings BaseSettings.withTypeResolverBuilder(TypeResolverBuilder)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(TypeFactory typefactory)
	{
		return _withBase(_base.withTypeFactory(typefactory));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #389 <Method BaseSettings BaseSettings.withTypeFactory(TypeFactory)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(DateFormat dateformat)
	{
		SerializationConfig serializationconfig = new SerializationConfig(this, _base.withDateFormat(dateformat));
	//    0    0:new             #2   <Class SerializationConfig>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #114 <Field BaseSettings _base>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #394 <Method BaseSettings BaseSettings.withDateFormat(DateFormat)>
	//    7   13:invokespecial   #116 <Method void SerializationConfig(SerializationConfig, BaseSettings)>
	//    8   16:astore_2        
		if(dateformat == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       29
			return serializationconfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	//   11   21:aload_2         
	//   12   22:getstatic       #397 <Field SerializationFeature SerializationFeature.WRITE_DATES_AS_TIMESTAMPS>
	//   13   25:invokevirtual   #399 <Method SerializationConfig with(SerializationFeature)>
	//   14   28:areturn         
		else
			return serializationconfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
	//   15   29:aload_2         
	//   16   30:getstatic       #397 <Field SerializationFeature SerializationFeature.WRITE_DATES_AS_TIMESTAMPS>
	//   17   33:invokevirtual   #402 <Method SerializationConfig without(SerializationFeature)>
	//   18   36:areturn         
	}

	public SerializationConfig with(Locale locale)
	{
		return _withBase(_base.with(locale));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #406 <Method BaseSettings BaseSettings.with(Locale)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public SerializationConfig with(TimeZone timezone)
	{
		return _withBase(_base.with(timezone));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #410 <Method BaseSettings BaseSettings.with(TimeZone)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public transient SerializationConfig with(MapperFeature amapperfeature[])
	{
		int j = _mapperFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field int _mapperFeatures>
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
	//   15   21:invokevirtual   #341 <Method int MapperFeature.getMask()>
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
	//*  25   35:getfield        #331 <Field int _mapperFeatures>
	//*  26   38:icmpne          43
			return this;
	//   27   41:aload_0         
	//   28   42:areturn         
		else
			return new SerializationConfig(this, j, _serFeatures, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   29   43:new             #2   <Class SerializationConfig>
	//   30   46:dup             
	//   31   47:aload_0         
	//   32   48:iload_3         
	//   33   49:aload_0         
	//   34   50:getfield        #49  <Field int _serFeatures>
	//   35   53:aload_0         
	//   36   54:getfield        #57  <Field int _generatorFeatures>
	//   37   57:aload_0         
	//   38   58:getfield        #59  <Field int _generatorFeaturesToChange>
	//   39   61:aload_0         
	//   40   62:getfield        #61  <Field int _formatWriteFeatures>
	//   41   65:aload_0         
	//   42   66:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   43   69:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   44   72:areturn         
	}

	public volatile MapperConfig with(MapperFeature mapperfeature, boolean flag)
	{
		return ((MapperConfig) (with(mapperfeature, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #414 <Method SerializationConfig with(MapperFeature, boolean)>
	//    4    6:areturn         
	}

	public volatile MapperConfig with(MapperFeature amapperfeature[])
	{
		return ((MapperConfig) (with(amapperfeature)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #417 <Method SerializationConfig with(MapperFeature[])>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(Base64Variant base64variant)
	{
		return ((MapperConfigBase) (with(base64variant)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #420 <Method SerializationConfig with(Base64Variant)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(AnnotationIntrospector annotationintrospector)
	{
		return ((MapperConfigBase) (with(annotationintrospector)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #423 <Method SerializationConfig with(AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(PropertyNamingStrategy propertynamingstrategy)
	{
		return ((MapperConfigBase) (with(propertynamingstrategy)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #426 <Method SerializationConfig with(PropertyNamingStrategy)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(ContextAttributes contextattributes)
	{
		return ((MapperConfigBase) (with(contextattributes)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #429 <Method SerializationConfig with(ContextAttributes)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(HandlerInstantiator handlerinstantiator)
	{
		return ((MapperConfigBase) (with(handlerinstantiator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #432 <Method SerializationConfig with(HandlerInstantiator)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(ClassIntrospector classintrospector)
	{
		return ((MapperConfigBase) (with(classintrospector)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #435 <Method SerializationConfig with(ClassIntrospector)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(VisibilityChecker visibilitychecker)
	{
		return ((MapperConfigBase) (with(visibilitychecker)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #438 <Method SerializationConfig with(VisibilityChecker)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(SubtypeResolver subtyperesolver)
	{
		return ((MapperConfigBase) (with(subtyperesolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #441 <Method SerializationConfig with(SubtypeResolver)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(TypeResolverBuilder typeresolverbuilder)
	{
		return ((MapperConfigBase) (with(typeresolverbuilder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #444 <Method SerializationConfig with(TypeResolverBuilder)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(TypeFactory typefactory)
	{
		return ((MapperConfigBase) (with(typefactory)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #447 <Method SerializationConfig with(TypeFactory)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(DateFormat dateformat)
	{
		return ((MapperConfigBase) (with(dateformat)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #450 <Method SerializationConfig with(DateFormat)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(Locale locale)
	{
		return ((MapperConfigBase) (with(locale)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #453 <Method SerializationConfig with(Locale)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(TimeZone timezone)
	{
		return ((MapperConfigBase) (with(timezone)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #456 <Method SerializationConfig with(TimeZone)>
	//    3    5:areturn         
	}

	public SerializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return _withBase(_base.withAppendedAnnotationIntrospector(annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #459 <Method BaseSettings BaseSettings.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public volatile MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return ((MapperConfigBase) (withAppendedAnnotationIntrospector(annotationintrospector)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #461 <Method SerializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public SerializationConfig withDefaultPrettyPrinter(PrettyPrinter prettyprinter)
	{
		if(_defaultPrettyPrinter == prettyprinter)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field PrettyPrinter _defaultPrettyPrinter>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SerializationConfig(this, prettyprinter);
	//    6   10:new             #2   <Class SerializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #465 <Method void SerializationConfig(SerializationConfig, PrettyPrinter)>
	//   11   19:areturn         
	}

	public transient SerializationConfig withFeatures(FormatFeature aformatfeature[])
	{
		int k = _formatWriteFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _formatWriteFeatures>
	//    2    4:istore          4
		int j = _formatWriteFeaturesToChange;
	//    3    6:aload_0         
	//    4    7:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//    5   10:istore_3        
		int l = aformatfeature.length;
	//    6   11:aload_1         
	//    7   12:arraylength     
	//    8   13:istore          5
		for(int i = 0; i < l; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload           5
	//*  13   20:icmpge          52
		{
			int i1 = aformatfeature[i].getMask();
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:invokeinterface #328 <Method int FormatFeature.getMask()>
	//   18   31:istore          6
			k |= i1;
	//   19   33:iload           4
	//   20   35:iload           6
	//   21   37:ior             
	//   22   38:istore          4
			j |= i1;
	//   23   40:iload_3         
	//   24   41:iload           6
	//   25   43:ior             
	//   26   44:istore_3        
		}

	//   27   45:iload_2         
	//   28   46:iconst_1        
	//   29   47:iadd            
	//   30   48:istore_2        
	//*  31   49:goto            17
		if(_formatWriteFeatures == k && _formatWriteFeaturesToChange == j)
	//*  32   52:aload_0         
	//*  33   53:getfield        #61  <Field int _formatWriteFeatures>
	//*  34   56:iload           4
	//*  35   58:icmpne          71
	//*  36   61:aload_0         
	//*  37   62:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//*  38   65:iload_3         
	//*  39   66:icmpne          71
			return this;
	//   40   69:aload_0         
	//   41   70:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, _serFeatures, _generatorFeatures, _generatorFeaturesToChange, k, j);
	//   42   71:new             #2   <Class SerializationConfig>
	//   43   74:dup             
	//   44   75:aload_0         
	//   45   76:aload_0         
	//   46   77:getfield        #331 <Field int _mapperFeatures>
	//   47   80:aload_0         
	//   48   81:getfield        #49  <Field int _serFeatures>
	//   49   84:aload_0         
	//   50   85:getfield        #57  <Field int _generatorFeatures>
	//   51   88:aload_0         
	//   52   89:getfield        #59  <Field int _generatorFeaturesToChange>
	//   53   92:iload           4
	//   54   94:iload_3         
	//   55   95:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   56   98:areturn         
	}

	public transient SerializationConfig withFeatures(com.fasterxml.jackson.core.JsonGenerator.Feature afeature[])
	{
		int k = _generatorFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int _generatorFeatures>
	//    2    4:istore          4
		int j = _generatorFeaturesToChange;
	//    3    6:aload_0         
	//    4    7:getfield        #59  <Field int _generatorFeaturesToChange>
	//    5   10:istore_3        
		int l = afeature.length;
	//    6   11:aload_1         
	//    7   12:arraylength     
	//    8   13:istore          5
		for(int i = 0; i < l; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload           5
	//*  13   20:icmpge          50
		{
			int i1 = afeature[i].getMask();
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//   18   29:istore          6
			k |= i1;
	//   19   31:iload           4
	//   20   33:iload           6
	//   21   35:ior             
	//   22   36:istore          4
			j |= i1;
	//   23   38:iload_3         
	//   24   39:iload           6
	//   25   41:ior             
	//   26   42:istore_3        
		}

	//   27   43:iload_2         
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:istore_2        
	//*  31   47:goto            17
		if(_generatorFeatures == k && _generatorFeaturesToChange == j)
	//*  32   50:aload_0         
	//*  33   51:getfield        #57  <Field int _generatorFeatures>
	//*  34   54:iload           4
	//*  35   56:icmpne          69
	//*  36   59:aload_0         
	//*  37   60:getfield        #59  <Field int _generatorFeaturesToChange>
	//*  38   63:iload_3         
	//*  39   64:icmpne          69
			return this;
	//   40   67:aload_0         
	//   41   68:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, _serFeatures, k, j, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   42   69:new             #2   <Class SerializationConfig>
	//   43   72:dup             
	//   44   73:aload_0         
	//   45   74:aload_0         
	//   46   75:getfield        #331 <Field int _mapperFeatures>
	//   47   78:aload_0         
	//   48   79:getfield        #49  <Field int _serFeatures>
	//   49   82:iload           4
	//   50   84:iload_3         
	//   51   85:aload_0         
	//   52   86:getfield        #61  <Field int _formatWriteFeatures>
	//   53   89:aload_0         
	//   54   90:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   55   93:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   56   96:areturn         
	}

	public transient SerializationConfig withFeatures(SerializationFeature aserializationfeature[])
	{
		int j = _serFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:istore_3        
		int k = aserializationfeature.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < k; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          33
			j |= aserializationfeature[i].getMask();
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//   16   24:ior             
	//   17   25:istore_3        

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
	//*  22   30:goto            11
		if(j == _serFeatures)
	//*  23   33:iload_3         
	//*  24   34:aload_0         
	//*  25   35:getfield        #49  <Field int _serFeatures>
	//*  26   38:icmpne          43
			return this;
	//   27   41:aload_0         
	//   28   42:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, j, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   29   43:new             #2   <Class SerializationConfig>
	//   30   46:dup             
	//   31   47:aload_0         
	//   32   48:aload_0         
	//   33   49:getfield        #331 <Field int _mapperFeatures>
	//   34   52:iload_3         
	//   35   53:aload_0         
	//   36   54:getfield        #57  <Field int _generatorFeatures>
	//   37   57:aload_0         
	//   38   58:getfield        #59  <Field int _generatorFeaturesToChange>
	//   39   61:aload_0         
	//   40   62:getfield        #61  <Field int _formatWriteFeatures>
	//   41   65:aload_0         
	//   42   66:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   43   69:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   44   72:areturn         
	}

	public SerializationConfig withFilters(FilterProvider filterprovider)
	{
		if(filterprovider == _filterProvider)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #53  <Field FilterProvider _filterProvider>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SerializationConfig(this, filterprovider);
	//    6   10:new             #2   <Class SerializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #473 <Method void SerializationConfig(SerializationConfig, FilterProvider)>
	//   11   19:areturn         
	}

	public SerializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return _withBase(_base.withInsertedAnnotationIntrospector(annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #476 <Method BaseSettings BaseSettings.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//    5    9:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public volatile MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return ((MapperConfigBase) (withInsertedAnnotationIntrospector(annotationintrospector)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #478 <Method SerializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public SerializationConfig withPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Value value)
	{
		if(_serializationInclusion.equals(((Object) (value))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field com.fasterxml.jackson.annotation.JsonInclude$Value _serializationInclusion>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #484 <Method boolean com.fasterxml.jackson.annotation.JsonInclude$Value.equals(Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new SerializationConfig(this, value);
	//    7   13:new             #2   <Class SerializationConfig>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokespecial   #486 <Method void SerializationConfig(SerializationConfig, com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//   12   22:areturn         
	}

	public SerializationConfig withRootName(PropertyName propertyname)
	{
		if(propertyname != null ? propertyname.equals(((Object) (_rootName))) : _rootName == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
	//*   2    4:aload_0         
	//*   3    5:getfield        #305 <Field PropertyName _rootName>
	//*   4    8:ifnonnull       24
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #305 <Field PropertyName _rootName>
	//*  10   18:invokevirtual   #489 <Method boolean PropertyName.equals(Object)>
	//*  11   21:ifne            11
			return new SerializationConfig(this, propertyname);
	//   12   24:new             #2   <Class SerializationConfig>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokespecial   #491 <Method void SerializationConfig(SerializationConfig, PropertyName)>
	//   17   33:areturn         
	}

	public volatile MapperConfigBase withRootName(PropertyName propertyname)
	{
		return ((MapperConfigBase) (withRootName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #494 <Method SerializationConfig withRootName(PropertyName)>
	//    3    5:areturn         
	}

	public SerializationConfig withSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include include)
	{
		return withPropertyInclusion(DEFAULT_INCLUSION.withValueInclusion(include));
	//    0    0:aload_0         
	//    1    1:getstatic       #42  <Field com.fasterxml.jackson.annotation.JsonInclude$Value DEFAULT_INCLUSION>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #500 <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.withValueInclusion(com.fasterxml.jackson.annotation.JsonInclude$Include)>
	//    4    8:invokevirtual   #502 <Method SerializationConfig withPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude$Value)>
	//    5   11:areturn         
	}

	public SerializationConfig withView(Class class1)
	{
		if(_view == class1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #508 <Field Class _view>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new SerializationConfig(this, class1);
	//    6   10:new             #2   <Class SerializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #510 <Method void SerializationConfig(SerializationConfig, Class)>
	//   11   19:areturn         
	}

	public volatile MapperConfigBase withView(Class class1)
	{
		return ((MapperConfigBase) (withView(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #514 <Method SerializationConfig withView(Class)>
	//    3    5:areturn         
	}

	public SerializationConfig withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
	{
		return _withBase(_base.withVisibility(propertyaccessor, visibility));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #114 <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #519 <Method BaseSettings BaseSettings.withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    6   10:invokespecial   #324 <Method SerializationConfig _withBase(BaseSettings)>
	//    7   13:areturn         
	}

	public volatile MapperConfigBase withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
	{
		return ((MapperConfigBase) (withVisibility(propertyaccessor, visibility)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #522 <Method SerializationConfig withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    4    6:areturn         
	}

	public SerializationConfig without(FormatFeature formatfeature)
	{
		int i = _formatWriteFeatures & ~formatfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _formatWriteFeatures>
	//    2    4:aload_1         
	//    3    5:invokeinterface #328 <Method int FormatFeature.getMask()>
	//    4   10:iconst_m1       
	//    5   11:ixor            
	//    6   12:iand            
	//    7   13:istore_2        
		int j = _formatWriteFeaturesToChange | formatfeature.getMask();
	//    8   14:aload_0         
	//    9   15:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   10   18:aload_1         
	//   11   19:invokeinterface #328 <Method int FormatFeature.getMask()>
	//   12   24:ior             
	//   13   25:istore_3        
		if(_formatWriteFeatures == i && _formatWriteFeaturesToChange == j)
	//*  14   26:aload_0         
	//*  15   27:getfield        #61  <Field int _formatWriteFeatures>
	//*  16   30:iload_2         
	//*  17   31:icmpne          44
	//*  18   34:aload_0         
	//*  19   35:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//*  20   38:iload_3         
	//*  21   39:icmpne          44
			return this;
	//   22   42:aload_0         
	//   23   43:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, _serFeatures, _generatorFeatures, _generatorFeaturesToChange, i, j);
	//   24   44:new             #2   <Class SerializationConfig>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:aload_0         
	//   28   50:getfield        #331 <Field int _mapperFeatures>
	//   29   53:aload_0         
	//   30   54:getfield        #49  <Field int _serFeatures>
	//   31   57:aload_0         
	//   32   58:getfield        #57  <Field int _generatorFeatures>
	//   33   61:aload_0         
	//   34   62:getfield        #59  <Field int _generatorFeaturesToChange>
	//   35   65:iload_2         
	//   36   66:iload_3         
	//   37   67:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   38   70:areturn         
	}

	public SerializationConfig without(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		int i = _generatorFeatures & ~feature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int _generatorFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    4    8:iconst_m1       
	//    5    9:ixor            
	//    6   10:iand            
	//    7   11:istore_2        
		int j = _generatorFeaturesToChange | feature.getMask();
	//    8   12:aload_0         
	//    9   13:getfield        #59  <Field int _generatorFeaturesToChange>
	//   10   16:aload_1         
	//   11   17:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//   12   20:ior             
	//   13   21:istore_3        
		if(_generatorFeatures == i && _generatorFeaturesToChange == j)
	//*  14   22:aload_0         
	//*  15   23:getfield        #57  <Field int _generatorFeatures>
	//*  16   26:iload_2         
	//*  17   27:icmpne          40
	//*  18   30:aload_0         
	//*  19   31:getfield        #59  <Field int _generatorFeaturesToChange>
	//*  20   34:iload_3         
	//*  21   35:icmpne          40
			return this;
	//   22   38:aload_0         
	//   23   39:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, _serFeatures, i, j, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   24   40:new             #2   <Class SerializationConfig>
	//   25   43:dup             
	//   26   44:aload_0         
	//   27   45:aload_0         
	//   28   46:getfield        #331 <Field int _mapperFeatures>
	//   29   49:aload_0         
	//   30   50:getfield        #49  <Field int _serFeatures>
	//   31   53:iload_2         
	//   32   54:iload_3         
	//   33   55:aload_0         
	//   34   56:getfield        #61  <Field int _formatWriteFeatures>
	//   35   59:aload_0         
	//   36   60:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   37   63:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   38   66:areturn         
	}

	public SerializationConfig without(SerializationFeature serializationfeature)
	{
		int i = _serFeatures & ~serializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//    4    8:iconst_m1       
	//    5    9:ixor            
	//    6   10:iand            
	//    7   11:istore_2        
		if(i == _serFeatures)
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #49  <Field int _serFeatures>
	//*  11   17:icmpne          22
			return this;
	//   12   20:aload_0         
	//   13   21:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, i, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   14   22:new             #2   <Class SerializationConfig>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:getfield        #331 <Field int _mapperFeatures>
	//   19   31:iload_2         
	//   20   32:aload_0         
	//   21   33:getfield        #57  <Field int _generatorFeatures>
	//   22   36:aload_0         
	//   23   37:getfield        #59  <Field int _generatorFeaturesToChange>
	//   24   40:aload_0         
	//   25   41:getfield        #61  <Field int _formatWriteFeatures>
	//   26   44:aload_0         
	//   27   45:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   28   48:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   29   51:areturn         
	}

	public transient SerializationConfig without(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
	{
		int j = _serFeatures & ~serializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//    4    8:iconst_m1       
	//    5    9:ixor            
	//    6   10:iand            
	//    7   11:istore          4
		int k = aserializationfeature.length;
	//    8   13:aload_2         
	//    9   14:arraylength     
	//   10   15:istore          5
		for(int i = 0; i < k; i++)
	//*  11   17:iconst_0        
	//*  12   18:istore_3        
	//*  13   19:iload_3         
	//*  14   20:iload           5
	//*  15   22:icmpge          45
			j &= ~aserializationfeature[i].getMask();
	//   16   25:iload           4
	//   17   27:aload_2         
	//   18   28:iload_3         
	//   19   29:aaload          
	//   20   30:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//   21   33:iconst_m1       
	//   22   34:ixor            
	//   23   35:iand            
	//   24   36:istore          4

	//   25   38:iload_3         
	//   26   39:iconst_1        
	//   27   40:iadd            
	//   28   41:istore_3        
	//*  29   42:goto            19
		if(j == _serFeatures)
	//*  30   45:iload           4
	//*  31   47:aload_0         
	//*  32   48:getfield        #49  <Field int _serFeatures>
	//*  33   51:icmpne          56
			return this;
	//   34   54:aload_0         
	//   35   55:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, j, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   36   56:new             #2   <Class SerializationConfig>
	//   37   59:dup             
	//   38   60:aload_0         
	//   39   61:aload_0         
	//   40   62:getfield        #331 <Field int _mapperFeatures>
	//   41   65:iload           4
	//   42   67:aload_0         
	//   43   68:getfield        #57  <Field int _generatorFeatures>
	//   44   71:aload_0         
	//   45   72:getfield        #59  <Field int _generatorFeaturesToChange>
	//   46   75:aload_0         
	//   47   76:getfield        #61  <Field int _formatWriteFeatures>
	//   48   79:aload_0         
	//   49   80:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   50   83:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   51   86:areturn         
	}

	public transient SerializationConfig without(MapperFeature amapperfeature[])
	{
		int j = _mapperFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #331 <Field int _mapperFeatures>
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
	//*  10   14:icmpge          35
			j &= ~amapperfeature[i].getMask();
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:invokevirtual   #341 <Method int MapperFeature.getMask()>
	//   16   24:iconst_m1       
	//   17   25:ixor            
	//   18   26:iand            
	//   19   27:istore_3        

	//   20   28:iload_2         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_2        
	//*  24   32:goto            11
		if(j == _mapperFeatures)
	//*  25   35:iload_3         
	//*  26   36:aload_0         
	//*  27   37:getfield        #331 <Field int _mapperFeatures>
	//*  28   40:icmpne          45
			return this;
	//   29   43:aload_0         
	//   30   44:areturn         
		else
			return new SerializationConfig(this, j, _serFeatures, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   31   45:new             #2   <Class SerializationConfig>
	//   32   48:dup             
	//   33   49:aload_0         
	//   34   50:iload_3         
	//   35   51:aload_0         
	//   36   52:getfield        #49  <Field int _serFeatures>
	//   37   55:aload_0         
	//   38   56:getfield        #57  <Field int _generatorFeatures>
	//   39   59:aload_0         
	//   40   60:getfield        #59  <Field int _generatorFeaturesToChange>
	//   41   63:aload_0         
	//   42   64:getfield        #61  <Field int _formatWriteFeatures>
	//   43   67:aload_0         
	//   44   68:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   45   71:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   46   74:areturn         
	}

	public volatile MapperConfig without(MapperFeature amapperfeature[])
	{
		return ((MapperConfig) (without(amapperfeature)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #524 <Method SerializationConfig without(MapperFeature[])>
	//    3    5:areturn         
	}

	public transient SerializationConfig withoutFeatures(FormatFeature aformatfeature[])
	{
		int k = _formatWriteFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field int _formatWriteFeatures>
	//    2    4:istore          4
		int j = _formatWriteFeaturesToChange;
	//    3    6:aload_0         
	//    4    7:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//    5   10:istore_3        
		int l = aformatfeature.length;
	//    6   11:aload_1         
	//    7   12:arraylength     
	//    8   13:istore          5
		for(int i = 0; i < l; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload           5
	//*  13   20:icmpge          54
		{
			int i1 = aformatfeature[i].getMask();
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:invokeinterface #328 <Method int FormatFeature.getMask()>
	//   18   31:istore          6
			k &= ~i1;
	//   19   33:iload           4
	//   20   35:iload           6
	//   21   37:iconst_m1       
	//   22   38:ixor            
	//   23   39:iand            
	//   24   40:istore          4
			j |= i1;
	//   25   42:iload_3         
	//   26   43:iload           6
	//   27   45:ior             
	//   28   46:istore_3        
		}

	//   29   47:iload_2         
	//   30   48:iconst_1        
	//   31   49:iadd            
	//   32   50:istore_2        
	//*  33   51:goto            17
		if(_formatWriteFeatures == k && _formatWriteFeaturesToChange == j)
	//*  34   54:aload_0         
	//*  35   55:getfield        #61  <Field int _formatWriteFeatures>
	//*  36   58:iload           4
	//*  37   60:icmpne          73
	//*  38   63:aload_0         
	//*  39   64:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//*  40   67:iload_3         
	//*  41   68:icmpne          73
			return this;
	//   42   71:aload_0         
	//   43   72:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, _serFeatures, _generatorFeatures, _generatorFeaturesToChange, k, j);
	//   44   73:new             #2   <Class SerializationConfig>
	//   45   76:dup             
	//   46   77:aload_0         
	//   47   78:aload_0         
	//   48   79:getfield        #331 <Field int _mapperFeatures>
	//   49   82:aload_0         
	//   50   83:getfield        #49  <Field int _serFeatures>
	//   51   86:aload_0         
	//   52   87:getfield        #57  <Field int _generatorFeatures>
	//   53   90:aload_0         
	//   54   91:getfield        #59  <Field int _generatorFeaturesToChange>
	//   55   94:iload           4
	//   56   96:iload_3         
	//   57   97:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   58  100:areturn         
	}

	public transient SerializationConfig withoutFeatures(com.fasterxml.jackson.core.JsonGenerator.Feature afeature[])
	{
		int k = _generatorFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int _generatorFeatures>
	//    2    4:istore          4
		int j = _generatorFeaturesToChange;
	//    3    6:aload_0         
	//    4    7:getfield        #59  <Field int _generatorFeaturesToChange>
	//    5   10:istore_3        
		int l = afeature.length;
	//    6   11:aload_1         
	//    7   12:arraylength     
	//    8   13:istore          5
		for(int i = 0; i < l; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:iload           5
	//*  13   20:icmpge          52
		{
			int i1 = afeature[i].getMask();
	//   14   23:aload_1         
	//   15   24:iload_2         
	//   16   25:aaload          
	//   17   26:invokevirtual   #241 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//   18   29:istore          6
			k &= ~i1;
	//   19   31:iload           4
	//   20   33:iload           6
	//   21   35:iconst_m1       
	//   22   36:ixor            
	//   23   37:iand            
	//   24   38:istore          4
			j |= i1;
	//   25   40:iload_3         
	//   26   41:iload           6
	//   27   43:ior             
	//   28   44:istore_3        
		}

	//   29   45:iload_2         
	//   30   46:iconst_1        
	//   31   47:iadd            
	//   32   48:istore_2        
	//*  33   49:goto            17
		if(_generatorFeatures == k && _generatorFeaturesToChange == j)
	//*  34   52:aload_0         
	//*  35   53:getfield        #57  <Field int _generatorFeatures>
	//*  36   56:iload           4
	//*  37   58:icmpne          71
	//*  38   61:aload_0         
	//*  39   62:getfield        #59  <Field int _generatorFeaturesToChange>
	//*  40   65:iload_3         
	//*  41   66:icmpne          71
			return this;
	//   42   69:aload_0         
	//   43   70:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, _serFeatures, k, j, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   44   71:new             #2   <Class SerializationConfig>
	//   45   74:dup             
	//   46   75:aload_0         
	//   47   76:aload_0         
	//   48   77:getfield        #331 <Field int _mapperFeatures>
	//   49   80:aload_0         
	//   50   81:getfield        #49  <Field int _serFeatures>
	//   51   84:iload           4
	//   52   86:iload_3         
	//   53   87:aload_0         
	//   54   88:getfield        #61  <Field int _formatWriteFeatures>
	//   55   91:aload_0         
	//   56   92:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   57   95:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   58   98:areturn         
	}

	public transient SerializationConfig withoutFeatures(SerializationFeature aserializationfeature[])
	{
		int j = _serFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field int _serFeatures>
	//    2    4:istore_3        
		int k = aserializationfeature.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < k; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          35
			j &= ~aserializationfeature[i].getMask();
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:invokevirtual   #278 <Method int SerializationFeature.getMask()>
	//   16   24:iconst_m1       
	//   17   25:ixor            
	//   18   26:iand            
	//   19   27:istore_3        

	//   20   28:iload_2         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_2        
	//*  24   32:goto            11
		if(j == _serFeatures)
	//*  25   35:iload_3         
	//*  26   36:aload_0         
	//*  27   37:getfield        #49  <Field int _serFeatures>
	//*  28   40:icmpne          45
			return this;
	//   29   43:aload_0         
	//   30   44:areturn         
		else
			return new SerializationConfig(this, _mapperFeatures, j, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//   31   45:new             #2   <Class SerializationConfig>
	//   32   48:dup             
	//   33   49:aload_0         
	//   34   50:aload_0         
	//   35   51:getfield        #331 <Field int _mapperFeatures>
	//   36   54:iload_3         
	//   37   55:aload_0         
	//   38   56:getfield        #57  <Field int _generatorFeatures>
	//   39   59:aload_0         
	//   40   60:getfield        #59  <Field int _generatorFeaturesToChange>
	//   41   63:aload_0         
	//   42   64:getfield        #61  <Field int _formatWriteFeatures>
	//   43   67:aload_0         
	//   44   68:getfield        #63  <Field int _formatWriteFeaturesToChange>
	//   45   71:invokespecial   #333 <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   46   74:areturn         
	}

	protected static final com.fasterxml.jackson.annotation.JsonInclude.Value DEFAULT_INCLUSION = com.fasterxml.jackson.annotation.JsonInclude.Value.empty();
	protected static final PrettyPrinter DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
	private static final long serialVersionUID = 1L;
	protected final PrettyPrinter _defaultPrettyPrinter;
	protected final FilterProvider _filterProvider;
	protected final int _formatWriteFeatures;
	protected final int _formatWriteFeaturesToChange;
	protected final int _generatorFeatures;
	protected final int _generatorFeaturesToChange;
	protected final int _serFeatures;
	protected final com.fasterxml.jackson.annotation.JsonInclude.Value _serializationInclusion;

	static 
	{
	//    0    0:new             #29  <Class DefaultPrettyPrinter>
	//    1    3:dup             
	//    2    4:invokespecial   #32  <Method void DefaultPrettyPrinter()>
	//    3    7:putstatic       #34  <Field PrettyPrinter DEFAULT_PRETTY_PRINTER>
	//    4   10:invokestatic    #40  <Method com.fasterxml.jackson.annotation.JsonInclude$Value com.fasterxml.jackson.annotation.JsonInclude$Value.empty()>
	//    5   13:putstatic       #42  <Field com.fasterxml.jackson.annotation.JsonInclude$Value DEFAULT_INCLUSION>
	//*   6   16:return          
	}
}
