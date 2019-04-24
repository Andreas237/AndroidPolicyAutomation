// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind:
//			DeserializationFeature, JsonMappingException, JavaType, BeanDescription, 
//			AnnotationIntrospector, MapperFeature, PropertyName, PropertyNamingStrategy

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

	private DeserializationConfig(DeserializationConfig deserializationconfig, PropertyName propertyname)
	{
		super(((MapperConfigBase) (deserializationconfig)), propertyname);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #46  <Method void MapperConfigBase(MapperConfigBase, PropertyName)>
		_deserFeatures = deserializationconfig._deserFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #29  <Field int _deserFeatures>
	//    7   11:putfield        #29  <Field int _deserFeatures>
		_problemHandlers = deserializationconfig._problemHandlers;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #33  <Field LinkedNode _problemHandlers>
	//   11   19:putfield        #33  <Field LinkedNode _problemHandlers>
		_nodeFactory = deserializationconfig._nodeFactory;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//   15   27:putfield        #31  <Field JsonNodeFactory _nodeFactory>
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

	private DeserializationConfig(DeserializationConfig deserializationconfig, BaseSettings basesettings)
	{
		super(((MapperConfigBase) (deserializationconfig)), basesettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #50  <Method void MapperConfigBase(MapperConfigBase, BaseSettings)>
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

	protected DeserializationConfig(DeserializationConfig deserializationconfig, ContextAttributes contextattributes)
	{
		super(((MapperConfigBase) (deserializationconfig)), contextattributes);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #54  <Method void MapperConfigBase(MapperConfigBase, ContextAttributes)>
		_deserFeatures = deserializationconfig._deserFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #29  <Field int _deserFeatures>
	//    7   11:putfield        #29  <Field int _deserFeatures>
		_problemHandlers = deserializationconfig._problemHandlers;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #33  <Field LinkedNode _problemHandlers>
	//   11   19:putfield        #33  <Field LinkedNode _problemHandlers>
		_nodeFactory = deserializationconfig._nodeFactory;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//   15   27:putfield        #31  <Field JsonNodeFactory _nodeFactory>
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

	protected DeserializationConfig(DeserializationConfig deserializationconfig, SimpleMixInResolver simplemixinresolver)
	{
		super(((MapperConfigBase) (deserializationconfig)), simplemixinresolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void MapperConfigBase(MapperConfigBase, SimpleMixInResolver)>
		_deserFeatures = deserializationconfig._deserFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #29  <Field int _deserFeatures>
	//    7   11:putfield        #29  <Field int _deserFeatures>
		_problemHandlers = deserializationconfig._problemHandlers;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #33  <Field LinkedNode _problemHandlers>
	//   11   19:putfield        #33  <Field LinkedNode _problemHandlers>
		_nodeFactory = deserializationconfig._nodeFactory;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//   15   27:putfield        #31  <Field JsonNodeFactory _nodeFactory>
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

	protected DeserializationConfig(DeserializationConfig deserializationconfig, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup)
	{
		super(((MapperConfigBase) (deserializationconfig)), simplemixinresolver, rootnamelookup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #62  <Method void MapperConfigBase(MapperConfigBase, SimpleMixInResolver, RootNameLookup)>
		_deserFeatures = deserializationconfig._deserFeatures;
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:getfield        #29  <Field int _deserFeatures>
	//    8   12:putfield        #29  <Field int _deserFeatures>
		_problemHandlers = deserializationconfig._problemHandlers;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getfield        #33  <Field LinkedNode _problemHandlers>
	//   12   20:putfield        #33  <Field LinkedNode _problemHandlers>
		_nodeFactory = deserializationconfig._nodeFactory;
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//   16   28:putfield        #31  <Field JsonNodeFactory _nodeFactory>
		_parserFeatures = deserializationconfig._parserFeatures;
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:getfield        #35  <Field int _parserFeatures>
	//   20   36:putfield        #35  <Field int _parserFeatures>
		_parserFeaturesToChange = deserializationconfig._parserFeaturesToChange;
	//   21   39:aload_0         
	//   22   40:aload_1         
	//   23   41:getfield        #37  <Field int _parserFeaturesToChange>
	//   24   44:putfield        #37  <Field int _parserFeaturesToChange>
		_formatReadFeatures = deserializationconfig._formatReadFeatures;
	//   25   47:aload_0         
	//   26   48:aload_1         
	//   27   49:getfield        #39  <Field int _formatReadFeatures>
	//   28   52:putfield        #39  <Field int _formatReadFeatures>
		_formatReadFeaturesToChange = deserializationconfig._formatReadFeaturesToChange;
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   32   60:putfield        #41  <Field int _formatReadFeaturesToChange>
	//   33   63:return          
	}

	private DeserializationConfig(DeserializationConfig deserializationconfig, SubtypeResolver subtyperesolver)
	{
		super(((MapperConfigBase) (deserializationconfig)), subtyperesolver);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #66  <Method void MapperConfigBase(MapperConfigBase, SubtypeResolver)>
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

	private DeserializationConfig(DeserializationConfig deserializationconfig, JsonNodeFactory jsonnodefactory)
	{
		super(((MapperConfigBase) (deserializationconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void MapperConfigBase(MapperConfigBase)>
		_deserFeatures = deserializationconfig._deserFeatures;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #29  <Field int _deserFeatures>
	//    6   10:putfield        #29  <Field int _deserFeatures>
		_problemHandlers = deserializationconfig._problemHandlers;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #33  <Field LinkedNode _problemHandlers>
	//   10   18:putfield        #33  <Field LinkedNode _problemHandlers>
		_nodeFactory = jsonnodefactory;
	//   11   21:aload_0         
	//   12   22:aload_2         
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

	private DeserializationConfig(DeserializationConfig deserializationconfig, LinkedNode linkednode)
	{
		super(((MapperConfigBase) (deserializationconfig)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void MapperConfigBase(MapperConfigBase)>
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

	private DeserializationConfig(DeserializationConfig deserializationconfig, Class class1)
	{
		super(((MapperConfigBase) (deserializationconfig)), class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #77  <Method void MapperConfigBase(MapperConfigBase, Class)>
		_deserFeatures = deserializationconfig._deserFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #29  <Field int _deserFeatures>
	//    7   11:putfield        #29  <Field int _deserFeatures>
		_problemHandlers = deserializationconfig._problemHandlers;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #33  <Field LinkedNode _problemHandlers>
	//   11   19:putfield        #33  <Field LinkedNode _problemHandlers>
		_nodeFactory = deserializationconfig._nodeFactory;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//   15   27:putfield        #31  <Field JsonNodeFactory _nodeFactory>
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

	public DeserializationConfig(BaseSettings basesettings, SubtypeResolver subtyperesolver, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup)
	{
		super(basesettings, subtyperesolver, simplemixinresolver, rootnamelookup);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:invokespecial   #81  <Method void MapperConfigBase(BaseSettings, SubtypeResolver, SimpleMixInResolver, RootNameLookup)>
		_deserFeatures = collectFeatureDefaults(com/fasterxml/jackson/databind/DeserializationFeature);
	//    6    9:aload_0         
	//    7   10:ldc1            #83  <Class DeserializationFeature>
	//    8   12:invokestatic    #87  <Method int collectFeatureDefaults(Class)>
	//    9   15:putfield        #29  <Field int _deserFeatures>
		_nodeFactory = JsonNodeFactory.instance;
	//   10   18:aload_0         
	//   11   19:getstatic       #92  <Field JsonNodeFactory JsonNodeFactory.instance>
	//   12   22:putfield        #31  <Field JsonNodeFactory _nodeFactory>
		_problemHandlers = null;
	//   13   25:aload_0         
	//   14   26:aconst_null     
	//   15   27:putfield        #33  <Field LinkedNode _problemHandlers>
		_parserFeatures = 0;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #35  <Field int _parserFeatures>
		_parserFeaturesToChange = 0;
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:putfield        #37  <Field int _parserFeaturesToChange>
		_formatReadFeatures = 0;
	//   22   40:aload_0         
	//   23   41:iconst_0        
	//   24   42:putfield        #39  <Field int _formatReadFeatures>
		_formatReadFeaturesToChange = 0;
	//   25   45:aload_0         
	//   26   46:iconst_0        
	//   27   47:putfield        #41  <Field int _formatReadFeaturesToChange>
	//   28   50:return          
	}

	private final DeserializationConfig _withBase(BaseSettings basesettings)
	{
		if(_base == basesettings)
	//*   0    0:aload_0         
	//*   1    1:getfield        #98  <Field BaseSettings _base>
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
	//   10   16:invokespecial   #100 <Method void DeserializationConfig(DeserializationConfig, BaseSettings)>
	//   11   19:areturn         
	}

	public TypeDeserializer findTypeDeserializer(JavaType javatype)
		throws JsonMappingException
	{
		Object obj1 = ((Object) (introspectClassAnnotations(javatype.getRawClass()).getClassInfo()));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #110 <Method Class JavaType.getRawClass()>
	//    3    5:invokevirtual   #114 <Method BeanDescription introspectClassAnnotations(Class)>
	//    4    8:invokevirtual   #120 <Method com.fasterxml.jackson.databind.introspect.AnnotatedClass BeanDescription.getClassInfo()>
	//    5   11:astore          4
		Object obj = ((Object) (getAnnotationIntrospector().findTypeResolver(((MapperConfig) (this)), ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)), javatype)));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #124 <Method AnnotationIntrospector getAnnotationIntrospector()>
	//    8   17:aload_0         
	//    9   18:aload           4
	//   10   20:aload_1         
	//   11   21:invokevirtual   #130 <Method TypeResolverBuilder AnnotationIntrospector.findTypeResolver(MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass, JavaType)>
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
	//   19   33:invokevirtual   #134 <Method TypeResolverBuilder getDefaultTyper(JavaType)>
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
			collection = getSubtypeResolver().collectAndResolveSubtypesByTypeId(((MapperConfig) (this)), ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)));
	//   27   48:aload_0         
	//   28   49:invokevirtual   #138 <Method SubtypeResolver getSubtypeResolver()>
	//   29   52:aload_0         
	//   30   53:aload           4
	//   31   55:invokevirtual   #144 <Method java.util.Collection SubtypeResolver.collectAndResolveSubtypesByTypeId(MapperConfig, com.fasterxml.jackson.databind.introspect.AnnotatedClass)>
	//   32   58:astore_3        
		}
		return ((TypeResolverBuilder) (obj)).buildTypeDeserializer(this, javatype, collection);
	//   33   59:aload_2         
	//   34   60:aload_0         
	//   35   61:aload_1         
	//   36   62:aload_3         
	//   37   63:invokeinterface #150 <Method TypeDeserializer TypeResolverBuilder.buildTypeDeserializer(DeserializationConfig, JavaType, java.util.Collection)>
	//   38   68:areturn         
	}

	public AnnotationIntrospector getAnnotationIntrospector()
	{
		if(isEnabled(MapperFeature.USE_ANNOTATIONS))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #157 <Field MapperFeature MapperFeature.USE_ANNOTATIONS>
	//*   2    4:invokevirtual   #161 <Method boolean isEnabled(MapperFeature)>
	//*   3    7:ifeq            15
			return super.getAnnotationIntrospector();
	//    4   10:aload_0         
	//    5   11:invokespecial   #162 <Method AnnotationIntrospector MapperConfigBase.getAnnotationIntrospector()>
	//    6   14:areturn         
		else
			return ((AnnotationIntrospector) (NopAnnotationIntrospector.instance));
	//    7   15:getstatic       #167 <Field NopAnnotationIntrospector NopAnnotationIntrospector.instance>
	//    8   18:areturn         
	}

	protected BaseSettings getBaseSettings()
	{
		return _base;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field BaseSettings _base>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonFormat.Value getDefaultPropertyFormat(Class class1)
	{
		return EMPTY_FORMAT;
	//    0    0:getstatic       #175 <Field com.fasterxml.jackson.annotation.JsonFormat$Value EMPTY_FORMAT>
	//    1    3:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion()
	{
		return EMPTY_INCLUDE;
	//    0    0:getstatic       #182 <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//    1    3:areturn         
	}

	public com.fasterxml.jackson.annotation.JsonInclude.Value getDefaultPropertyInclusion(Class class1)
	{
		return EMPTY_INCLUDE;
	//    0    0:getstatic       #182 <Field com.fasterxml.jackson.annotation.JsonInclude$Value EMPTY_INCLUDE>
	//    1    3:areturn         
	}

	public VisibilityChecker getDefaultVisibilityChecker()
	{
		VisibilityChecker visibilitychecker1 = super.getDefaultVisibilityChecker();
	//    0    0:aload_0         
	//    1    1:invokespecial   #188 <Method VisibilityChecker MapperConfigBase.getDefaultVisibilityChecker()>
	//    2    4:astore_2        
		VisibilityChecker visibilitychecker = visibilitychecker1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(!isEnabled(MapperFeature.AUTO_DETECT_SETTERS))
	//*   5    7:aload_0         
	//*   6    8:getstatic       #191 <Field MapperFeature MapperFeature.AUTO_DETECT_SETTERS>
	//*   7   11:invokevirtual   #161 <Method boolean isEnabled(MapperFeature)>
	//*   8   14:ifne            27
			visibilitychecker = visibilitychecker1.withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//    9   17:aload_2         
	//   10   18:getstatic       #197 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   11   21:invokeinterface #203 <Method VisibilityChecker VisibilityChecker.withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   12   26:astore_1        
		visibilitychecker1 = visibilitychecker;
	//   13   27:aload_1         
	//   14   28:astore_2        
		if(!isEnabled(MapperFeature.AUTO_DETECT_CREATORS))
	//*  15   29:aload_0         
	//*  16   30:getstatic       #206 <Field MapperFeature MapperFeature.AUTO_DETECT_CREATORS>
	//*  17   33:invokevirtual   #161 <Method boolean isEnabled(MapperFeature)>
	//*  18   36:ifne            49
			visibilitychecker1 = visibilitychecker.withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   19   39:aload_1         
	//   20   40:getstatic       #197 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   21   43:invokeinterface #209 <Method VisibilityChecker VisibilityChecker.withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   22   48:astore_2        
		visibilitychecker = visibilitychecker1;
	//   23   49:aload_2         
	//   24   50:astore_1        
		if(!isEnabled(MapperFeature.AUTO_DETECT_FIELDS))
	//*  25   51:aload_0         
	//*  26   52:getstatic       #212 <Field MapperFeature MapperFeature.AUTO_DETECT_FIELDS>
	//*  27   55:invokevirtual   #161 <Method boolean isEnabled(MapperFeature)>
	//*  28   58:ifne            71
			visibilitychecker = visibilitychecker1.withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
	//   29   61:aload_2         
	//   30   62:getstatic       #197 <Field com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility.NONE>
	//   31   65:invokeinterface #215 <Method VisibilityChecker VisibilityChecker.withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//   32   70:astore_1        
		return visibilitychecker;
	//   33   71:aload_1         
	//   34   72:areturn         
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

	public final boolean hasDeserializationFeatures(int i)
	{
		return (_deserFeatures & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final boolean hasSomeOfFeatures(int i)
	{
		return (_deserFeatures & i) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:ifeq            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public void initialize(JsonParser jsonparser)
	{
		if(_parserFeaturesToChange != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #37  <Field int _parserFeaturesToChange>
	//*   2    4:ifeq            20
			jsonparser.overrideStdFeatures(_parserFeatures, _parserFeaturesToChange);
	//    3    7:aload_1         
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field int _parserFeatures>
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field int _parserFeaturesToChange>
	//    8   16:invokevirtual   #234 <Method JsonParser JsonParser.overrideStdFeatures(int, int)>
	//    9   19:pop             
		if(_formatReadFeaturesToChange != 0)
	//*  10   20:aload_0         
	//*  11   21:getfield        #41  <Field int _formatReadFeaturesToChange>
	//*  12   24:ifeq            40
			jsonparser.overrideFormatFeatures(_formatReadFeatures, _formatReadFeaturesToChange);
	//   13   27:aload_1         
	//   14   28:aload_0         
	//   15   29:getfield        #39  <Field int _formatReadFeatures>
	//   16   32:aload_0         
	//   17   33:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   18   36:invokevirtual   #237 <Method JsonParser JsonParser.overrideFormatFeatures(int, int)>
	//   19   39:pop             
	//   20   40:return          
	}

	public BeanDescription introspect(JavaType javatype)
	{
		return getClassIntrospector().forDeserialization(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #249 <Method BeanDescription ClassIntrospector.forDeserialization(DeserializationConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectClassAnnotations(JavaType javatype)
	{
		return getClassIntrospector().forClassAnnotations(((MapperConfig) (this)), javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #254 <Method BeanDescription ClassIntrospector.forClassAnnotations(MapperConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectDirectClassAnnotations(JavaType javatype)
	{
		return getClassIntrospector().forDirectClassAnnotations(((MapperConfig) (this)), javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #258 <Method BeanDescription ClassIntrospector.forDirectClassAnnotations(MapperConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectForBuilder(JavaType javatype)
	{
		return getClassIntrospector().forDeserializationWithBuilder(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #262 <Method BeanDescription ClassIntrospector.forDeserializationWithBuilder(DeserializationConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public BeanDescription introspectForCreation(JavaType javatype)
	{
		return getClassIntrospector().forCreation(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #243 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #266 <Method BeanDescription ClassIntrospector.forCreation(DeserializationConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public final boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature, JsonFactory jsonfactory)
	{
		int i = feature.getMask();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #272 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    2    4:istore_3        
		if((_parserFeaturesToChange & i) != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #37  <Field int _parserFeaturesToChange>
	//*   5    9:iload_3         
	//*   6   10:iand            
	//*   7   11:ifeq            30
			return (_parserFeatures & feature.getMask()) != 0;
	//    8   14:aload_0         
	//    9   15:getfield        #35  <Field int _parserFeatures>
	//   10   18:aload_1         
	//   11   19:invokevirtual   #272 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
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
	//   20   32:invokevirtual   #277 <Method boolean JsonFactory.isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   21   35:ireturn         
	}

	public final boolean isEnabled(DeserializationFeature deserializationfeature)
	{
		return (_deserFeatures & deserializationfeature.getMask()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public boolean useRootWrapping()
	{
		if(_rootName != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field PropertyName _rootName>
	//*   2    4:ifnull          21
			return !_rootName.isEmpty();
	//    3    7:aload_0         
	//    4    8:getfield        #285 <Field PropertyName _rootName>
	//    5   11:invokevirtual   #290 <Method boolean PropertyName.isEmpty()>
	//    6   14:ifne            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
		else
			return isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
	//   11   21:aload_0         
	//   12   22:getstatic       #294 <Field DeserializationFeature DeserializationFeature.UNWRAP_ROOT_VALUE>
	//   13   25:invokevirtual   #296 <Method boolean isEnabled(DeserializationFeature)>
	//   14   28:ireturn         
	}

	public DeserializationConfig with(Base64Variant base64variant)
	{
		return _withBase(_base.with(base64variant));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #303 <Method BaseSettings BaseSettings.with(Base64Variant)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(FormatFeature formatfeature)
	{
		int i = _formatReadFeatures | formatfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int _formatReadFeatures>
	//    2    4:aload_1         
	//    3    5:invokeinterface #309 <Method int FormatFeature.getMask()>
	//    4   10:ior             
	//    5   11:istore_2        
		int j = _formatReadFeaturesToChange | formatfeature.getMask();
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field int _formatReadFeaturesToChange>
	//    8   16:aload_1         
	//    9   17:invokeinterface #309 <Method int FormatFeature.getMask()>
	//   10   22:ior             
	//   11   23:istore_3        
		if(_formatReadFeatures == i && _formatReadFeaturesToChange == j)
	//*  12   24:aload_0         
	//*  13   25:getfield        #39  <Field int _formatReadFeatures>
	//*  14   28:iload_2         
	//*  15   29:icmpne          42
	//*  16   32:aload_0         
	//*  17   33:getfield        #41  <Field int _formatReadFeaturesToChange>
	//*  18   36:iload_3         
	//*  19   37:icmpne          42
			return this;
	//   20   40:aload_0         
	//   21   41:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, _deserFeatures, _parserFeatures, _parserFeaturesToChange, i, j);
	//   22   42:new             #2   <Class DeserializationConfig>
	//   23   45:dup             
	//   24   46:aload_0         
	//   25   47:aload_0         
	//   26   48:getfield        #312 <Field int _mapperFeatures>
	//   27   51:aload_0         
	//   28   52:getfield        #29  <Field int _deserFeatures>
	//   29   55:aload_0         
	//   30   56:getfield        #35  <Field int _parserFeatures>
	//   31   59:aload_0         
	//   32   60:getfield        #37  <Field int _parserFeaturesToChange>
	//   33   63:iload_2         
	//   34   64:iload_3         
	//   35   65:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   36   68:areturn         
	}

	public DeserializationConfig with(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		int i = _parserFeatures | feature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int _parserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #272 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    4    8:ior             
	//    5    9:istore_2        
		int j = _parserFeaturesToChange | feature.getMask();
	//    6   10:aload_0         
	//    7   11:getfield        #37  <Field int _parserFeaturesToChange>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #272 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//   10   18:ior             
	//   11   19:istore_3        
		if(_parserFeatures == i && _parserFeaturesToChange == j)
	//*  12   20:aload_0         
	//*  13   21:getfield        #35  <Field int _parserFeatures>
	//*  14   24:iload_2         
	//*  15   25:icmpne          38
	//*  16   28:aload_0         
	//*  17   29:getfield        #37  <Field int _parserFeaturesToChange>
	//*  18   32:iload_3         
	//*  19   33:icmpne          38
			return this;
	//   20   36:aload_0         
	//   21   37:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, _deserFeatures, i, j, _formatReadFeatures, _formatReadFeaturesToChange);
	//   22   38:new             #2   <Class DeserializationConfig>
	//   23   41:dup             
	//   24   42:aload_0         
	//   25   43:aload_0         
	//   26   44:getfield        #312 <Field int _mapperFeatures>
	//   27   47:aload_0         
	//   28   48:getfield        #29  <Field int _deserFeatures>
	//   29   51:iload_2         
	//   30   52:iload_3         
	//   31   53:aload_0         
	//   32   54:getfield        #39  <Field int _formatReadFeatures>
	//   33   57:aload_0         
	//   34   58:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   35   61:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   36   64:areturn         
	}

	public DeserializationConfig with(AnnotationIntrospector annotationintrospector)
	{
		return _withBase(_base.withAnnotationIntrospector(annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #320 <Method BaseSettings BaseSettings.withAnnotationIntrospector(AnnotationIntrospector)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(DeserializationFeature deserializationfeature)
	{
		int i = _deserFeatures | deserializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
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
	//   16   26:getfield        #312 <Field int _mapperFeatures>
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #35  <Field int _parserFeatures>
	//   20   34:aload_0         
	//   21   35:getfield        #37  <Field int _parserFeaturesToChange>
	//   22   38:aload_0         
	//   23   39:getfield        #39  <Field int _formatReadFeatures>
	//   24   42:aload_0         
	//   25   43:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   26   46:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   27   49:areturn         
	}

	public transient DeserializationConfig with(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
	{
		int j = _deserFeatures | deserializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
	//    4    8:ior             
	//    5    9:istore          4
		int k = adeserializationfeature.length;
	//    6   11:aload_2         
	//    7   12:arraylength     
	//    8   13:istore          5
		for(int i = 0; i < k; i++)
	//*   9   15:iconst_0        
	//*  10   16:istore_3        
	//*  11   17:iload_3         
	//*  12   18:iload           5
	//*  13   20:icmpge          41
			j |= adeserializationfeature[i].getMask();
	//   14   23:iload           4
	//   15   25:aload_2         
	//   16   26:iload_3         
	//   17   27:aaload          
	//   18   28:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
	//   19   31:ior             
	//   20   32:istore          4

	//   21   34:iload_3         
	//   22   35:iconst_1        
	//   23   36:iadd            
	//   24   37:istore_3        
	//*  25   38:goto            17
		if(j == _deserFeatures)
	//*  26   41:iload           4
	//*  27   43:aload_0         
	//*  28   44:getfield        #29  <Field int _deserFeatures>
	//*  29   47:icmpne          52
			return this;
	//   30   50:aload_0         
	//   31   51:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, j, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   32   52:new             #2   <Class DeserializationConfig>
	//   33   55:dup             
	//   34   56:aload_0         
	//   35   57:aload_0         
	//   36   58:getfield        #312 <Field int _mapperFeatures>
	//   37   61:iload           4
	//   38   63:aload_0         
	//   39   64:getfield        #35  <Field int _parserFeatures>
	//   40   67:aload_0         
	//   41   68:getfield        #37  <Field int _parserFeaturesToChange>
	//   42   71:aload_0         
	//   43   72:getfield        #39  <Field int _formatReadFeatures>
	//   44   75:aload_0         
	//   45   76:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   46   79:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   47   82:areturn         
	}

	public DeserializationConfig with(MapperFeature mapperfeature, boolean flag)
	{
		int i;
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            24
			i = _mapperFeatures | mapperfeature.getMask();
	//    2    4:aload_0         
	//    3    5:getfield        #312 <Field int _mapperFeatures>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #324 <Method int MapperFeature.getMask()>
	//    6   12:ior             
	//    7   13:istore_3        
		else
	//*   8   14:iload_3         
	//*   9   15:aload_0         
	//*  10   16:getfield        #312 <Field int _mapperFeatures>
	//*  11   19:icmpne          39
	//*  12   22:aload_0         
	//*  13   23:areturn         
			i = _mapperFeatures & ~mapperfeature.getMask();
	//   14   24:aload_0         
	//   15   25:getfield        #312 <Field int _mapperFeatures>
	//   16   28:aload_1         
	//   17   29:invokevirtual   #324 <Method int MapperFeature.getMask()>
	//   18   32:iconst_m1       
	//   19   33:ixor            
	//   20   34:iand            
	//   21   35:istore_3        
		if(i == _mapperFeatures)
			return this;
		else
	//*  22   36:goto            14
			return new DeserializationConfig(this, i, _deserFeatures, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   23   39:new             #2   <Class DeserializationConfig>
	//   24   42:dup             
	//   25   43:aload_0         
	//   26   44:iload_3         
	//   27   45:aload_0         
	//   28   46:getfield        #29  <Field int _deserFeatures>
	//   29   49:aload_0         
	//   30   50:getfield        #35  <Field int _parserFeatures>
	//   31   53:aload_0         
	//   32   54:getfield        #37  <Field int _parserFeaturesToChange>
	//   33   57:aload_0         
	//   34   58:getfield        #39  <Field int _formatReadFeatures>
	//   35   61:aload_0         
	//   36   62:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   37   65:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   38   68:areturn         
	}

	public DeserializationConfig with(PropertyNamingStrategy propertynamingstrategy)
	{
		return _withBase(_base.withPropertyNamingStrategy(propertynamingstrategy));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #329 <Method BaseSettings BaseSettings.withPropertyNamingStrategy(PropertyNamingStrategy)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(ContextAttributes contextattributes)
	{
		if(contextattributes == _attributes)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #334 <Field ContextAttributes _attributes>
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DeserializationConfig(this, contextattributes);
	//    6   10:new             #2   <Class DeserializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #336 <Method void DeserializationConfig(DeserializationConfig, ContextAttributes)>
	//   11   19:areturn         
	}

	public DeserializationConfig with(HandlerInstantiator handlerinstantiator)
	{
		return _withBase(_base.withHandlerInstantiator(handlerinstantiator));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #341 <Method BaseSettings BaseSettings.withHandlerInstantiator(HandlerInstantiator)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(ClassIntrospector classintrospector)
	{
		return _withBase(_base.withClassIntrospector(classintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #346 <Method BaseSettings BaseSettings.withClassIntrospector(ClassIntrospector)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(VisibilityChecker visibilitychecker)
	{
		return _withBase(_base.withVisibilityChecker(visibilitychecker));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #351 <Method BaseSettings BaseSettings.withVisibilityChecker(VisibilityChecker)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(SubtypeResolver subtyperesolver)
	{
		if(_subtypeResolver == subtyperesolver)
	//*   0    0:aload_0         
	//*   1    1:getfield        #357 <Field SubtypeResolver _subtypeResolver>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DeserializationConfig(this, subtyperesolver);
	//    6   10:new             #2   <Class DeserializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #359 <Method void DeserializationConfig(DeserializationConfig, SubtypeResolver)>
	//   11   19:areturn         
	}

	public DeserializationConfig with(TypeResolverBuilder typeresolverbuilder)
	{
		return _withBase(_base.withTypeResolverBuilder(typeresolverbuilder));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #364 <Method BaseSettings BaseSettings.withTypeResolverBuilder(TypeResolverBuilder)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(JsonNodeFactory jsonnodefactory)
	{
		if(_nodeFactory == jsonnodefactory)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field JsonNodeFactory _nodeFactory>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DeserializationConfig(this, jsonnodefactory);
	//    6   10:new             #2   <Class DeserializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #368 <Method void DeserializationConfig(DeserializationConfig, JsonNodeFactory)>
	//   11   19:areturn         
	}

	public DeserializationConfig with(TypeFactory typefactory)
	{
		return _withBase(_base.withTypeFactory(typefactory));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #373 <Method BaseSettings BaseSettings.withTypeFactory(TypeFactory)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(DateFormat dateformat)
	{
		return _withBase(_base.withDateFormat(dateformat));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #378 <Method BaseSettings BaseSettings.withDateFormat(DateFormat)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(Locale locale)
	{
		return _withBase(_base.with(locale));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #382 <Method BaseSettings BaseSettings.with(Locale)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public DeserializationConfig with(TimeZone timezone)
	{
		return _withBase(_base.with(timezone));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #386 <Method BaseSettings BaseSettings.with(TimeZone)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public transient DeserializationConfig with(MapperFeature amapperfeature[])
	{
		int j = _mapperFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field int _mapperFeatures>
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
	//   15   21:invokevirtual   #324 <Method int MapperFeature.getMask()>
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
	//*  25   35:getfield        #312 <Field int _mapperFeatures>
	//*  26   38:icmpne          43
			return this;
	//   27   41:aload_0         
	//   28   42:areturn         
		else
			return new DeserializationConfig(this, j, _deserFeatures, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   29   43:new             #2   <Class DeserializationConfig>
	//   30   46:dup             
	//   31   47:aload_0         
	//   32   48:iload_3         
	//   33   49:aload_0         
	//   34   50:getfield        #29  <Field int _deserFeatures>
	//   35   53:aload_0         
	//   36   54:getfield        #35  <Field int _parserFeatures>
	//   37   57:aload_0         
	//   38   58:getfield        #37  <Field int _parserFeaturesToChange>
	//   39   61:aload_0         
	//   40   62:getfield        #39  <Field int _formatReadFeatures>
	//   41   65:aload_0         
	//   42   66:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   43   69:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   44   72:areturn         
	}

	public volatile MapperConfig with(MapperFeature mapperfeature, boolean flag)
	{
		return ((MapperConfig) (with(mapperfeature, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #390 <Method DeserializationConfig with(MapperFeature, boolean)>
	//    4    6:areturn         
	}

	public volatile MapperConfig with(MapperFeature amapperfeature[])
	{
		return ((MapperConfig) (with(amapperfeature)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #393 <Method DeserializationConfig with(MapperFeature[])>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(Base64Variant base64variant)
	{
		return ((MapperConfigBase) (with(base64variant)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #396 <Method DeserializationConfig with(Base64Variant)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(AnnotationIntrospector annotationintrospector)
	{
		return ((MapperConfigBase) (with(annotationintrospector)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #399 <Method DeserializationConfig with(AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(PropertyNamingStrategy propertynamingstrategy)
	{
		return ((MapperConfigBase) (with(propertynamingstrategy)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #402 <Method DeserializationConfig with(PropertyNamingStrategy)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(ContextAttributes contextattributes)
	{
		return ((MapperConfigBase) (with(contextattributes)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #405 <Method DeserializationConfig with(ContextAttributes)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(HandlerInstantiator handlerinstantiator)
	{
		return ((MapperConfigBase) (with(handlerinstantiator)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #408 <Method DeserializationConfig with(HandlerInstantiator)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(ClassIntrospector classintrospector)
	{
		return ((MapperConfigBase) (with(classintrospector)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #411 <Method DeserializationConfig with(ClassIntrospector)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(VisibilityChecker visibilitychecker)
	{
		return ((MapperConfigBase) (with(visibilitychecker)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #414 <Method DeserializationConfig with(VisibilityChecker)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(SubtypeResolver subtyperesolver)
	{
		return ((MapperConfigBase) (with(subtyperesolver)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #417 <Method DeserializationConfig with(SubtypeResolver)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(TypeResolverBuilder typeresolverbuilder)
	{
		return ((MapperConfigBase) (with(typeresolverbuilder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #420 <Method DeserializationConfig with(TypeResolverBuilder)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(TypeFactory typefactory)
	{
		return ((MapperConfigBase) (with(typefactory)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #423 <Method DeserializationConfig with(TypeFactory)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(DateFormat dateformat)
	{
		return ((MapperConfigBase) (with(dateformat)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #426 <Method DeserializationConfig with(DateFormat)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(Locale locale)
	{
		return ((MapperConfigBase) (with(locale)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #429 <Method DeserializationConfig with(Locale)>
	//    3    5:areturn         
	}

	public volatile MapperConfigBase with(TimeZone timezone)
	{
		return ((MapperConfigBase) (with(timezone)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #432 <Method DeserializationConfig with(TimeZone)>
	//    3    5:areturn         
	}

	public DeserializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return _withBase(_base.withAppendedAnnotationIntrospector(annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #435 <Method BaseSettings BaseSettings.withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public volatile MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return ((MapperConfigBase) (withAppendedAnnotationIntrospector(annotationintrospector)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #437 <Method DeserializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public transient DeserializationConfig withFeatures(FormatFeature aformatfeature[])
	{
		int k = _formatReadFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int _formatReadFeatures>
	//    2    4:istore          4
		int j = _formatReadFeaturesToChange;
	//    3    6:aload_0         
	//    4    7:getfield        #41  <Field int _formatReadFeaturesToChange>
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
	//   17   26:invokeinterface #309 <Method int FormatFeature.getMask()>
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
		if(_formatReadFeatures == k && _formatReadFeaturesToChange == j)
	//*  32   52:aload_0         
	//*  33   53:getfield        #39  <Field int _formatReadFeatures>
	//*  34   56:iload           4
	//*  35   58:icmpne          71
	//*  36   61:aload_0         
	//*  37   62:getfield        #41  <Field int _formatReadFeaturesToChange>
	//*  38   65:iload_3         
	//*  39   66:icmpne          71
			return this;
	//   40   69:aload_0         
	//   41   70:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, _deserFeatures, _parserFeatures, _parserFeaturesToChange, k, j);
	//   42   71:new             #2   <Class DeserializationConfig>
	//   43   74:dup             
	//   44   75:aload_0         
	//   45   76:aload_0         
	//   46   77:getfield        #312 <Field int _mapperFeatures>
	//   47   80:aload_0         
	//   48   81:getfield        #29  <Field int _deserFeatures>
	//   49   84:aload_0         
	//   50   85:getfield        #35  <Field int _parserFeatures>
	//   51   88:aload_0         
	//   52   89:getfield        #37  <Field int _parserFeaturesToChange>
	//   53   92:iload           4
	//   54   94:iload_3         
	//   55   95:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   56   98:areturn         
	}

	public transient DeserializationConfig withFeatures(com.fasterxml.jackson.core.JsonParser.Feature afeature[])
	{
		int k = _parserFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int _parserFeatures>
	//    2    4:istore          4
		int j = _parserFeaturesToChange;
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field int _parserFeaturesToChange>
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
	//   17   26:invokevirtual   #272 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
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
		if(_parserFeatures == k && _parserFeaturesToChange == j)
	//*  32   50:aload_0         
	//*  33   51:getfield        #35  <Field int _parserFeatures>
	//*  34   54:iload           4
	//*  35   56:icmpne          69
	//*  36   59:aload_0         
	//*  37   60:getfield        #37  <Field int _parserFeaturesToChange>
	//*  38   63:iload_3         
	//*  39   64:icmpne          69
			return this;
	//   40   67:aload_0         
	//   41   68:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, _deserFeatures, k, j, _formatReadFeatures, _formatReadFeaturesToChange);
	//   42   69:new             #2   <Class DeserializationConfig>
	//   43   72:dup             
	//   44   73:aload_0         
	//   45   74:aload_0         
	//   46   75:getfield        #312 <Field int _mapperFeatures>
	//   47   78:aload_0         
	//   48   79:getfield        #29  <Field int _deserFeatures>
	//   49   82:iload           4
	//   50   84:iload_3         
	//   51   85:aload_0         
	//   52   86:getfield        #39  <Field int _formatReadFeatures>
	//   53   89:aload_0         
	//   54   90:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   55   93:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   56   96:areturn         
	}

	public transient DeserializationConfig withFeatures(DeserializationFeature adeserializationfeature[])
	{
		int j = _deserFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:istore_3        
		int k = adeserializationfeature.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < k; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          33
			j |= adeserializationfeature[i].getMask();
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
	//   16   24:ior             
	//   17   25:istore_3        

	//   18   26:iload_2         
	//   19   27:iconst_1        
	//   20   28:iadd            
	//   21   29:istore_2        
	//*  22   30:goto            11
		if(j == _deserFeatures)
	//*  23   33:iload_3         
	//*  24   34:aload_0         
	//*  25   35:getfield        #29  <Field int _deserFeatures>
	//*  26   38:icmpne          43
			return this;
	//   27   41:aload_0         
	//   28   42:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, j, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   29   43:new             #2   <Class DeserializationConfig>
	//   30   46:dup             
	//   31   47:aload_0         
	//   32   48:aload_0         
	//   33   49:getfield        #312 <Field int _mapperFeatures>
	//   34   52:iload_3         
	//   35   53:aload_0         
	//   36   54:getfield        #35  <Field int _parserFeatures>
	//   37   57:aload_0         
	//   38   58:getfield        #37  <Field int _parserFeaturesToChange>
	//   39   61:aload_0         
	//   40   62:getfield        #39  <Field int _formatReadFeatures>
	//   41   65:aload_0         
	//   42   66:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   43   69:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   44   72:areturn         
	}

	public DeserializationConfig withHandler(DeserializationProblemHandler deserializationproblemhandler)
	{
		if(LinkedNode.contains(_problemHandlers, ((Object) (deserializationproblemhandler))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field LinkedNode _problemHandlers>
	//*   2    4:aload_1         
	//*   3    5:invokestatic    #449 <Method boolean LinkedNode.contains(LinkedNode, Object)>
	//*   4    8:ifeq            13
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
			return new DeserializationConfig(this, new LinkedNode(((Object) (deserializationproblemhandler)), _problemHandlers));
	//    7   13:new             #2   <Class DeserializationConfig>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:new             #445 <Class LinkedNode>
	//   11   21:dup             
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:getfield        #33  <Field LinkedNode _problemHandlers>
	//   15   27:invokespecial   #452 <Method void LinkedNode(Object, LinkedNode)>
	//   16   30:invokespecial   #454 <Method void DeserializationConfig(DeserializationConfig, LinkedNode)>
	//   17   33:areturn         
	}

	public DeserializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return _withBase(_base.withInsertedAnnotationIntrospector(annotationintrospector));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #457 <Method BaseSettings BaseSettings.withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//    5    9:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    6   12:areturn         
	}

	public volatile MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
	{
		return ((MapperConfigBase) (withInsertedAnnotationIntrospector(annotationintrospector)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #459 <Method DeserializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector)>
	//    3    5:areturn         
	}

	public DeserializationConfig withNoProblemHandlers()
	{
		if(_problemHandlers == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field LinkedNode _problemHandlers>
	//*   2    4:ifnonnull       9
			return this;
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return new DeserializationConfig(this, (LinkedNode)null);
	//    5    9:new             #2   <Class DeserializationConfig>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:aconst_null     
	//    9   15:checkcast       #445 <Class LinkedNode>
	//   10   18:invokespecial   #454 <Method void DeserializationConfig(DeserializationConfig, LinkedNode)>
	//   11   21:areturn         
	}

	public DeserializationConfig withRootName(PropertyName propertyname)
	{
		if(propertyname != null ? propertyname.equals(((Object) (_rootName))) : _rootName == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
	//*   2    4:aload_0         
	//*   3    5:getfield        #285 <Field PropertyName _rootName>
	//*   4    8:ifnonnull       24
			return this;
	//    5   11:aload_0         
	//    6   12:areturn         
		else
	//*   7   13:aload_1         
	//*   8   14:aload_0         
	//*   9   15:getfield        #285 <Field PropertyName _rootName>
	//*  10   18:invokevirtual   #467 <Method boolean PropertyName.equals(Object)>
	//*  11   21:ifne            11
			return new DeserializationConfig(this, propertyname);
	//   12   24:new             #2   <Class DeserializationConfig>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokespecial   #469 <Method void DeserializationConfig(DeserializationConfig, PropertyName)>
	//   17   33:areturn         
	}

	public volatile MapperConfigBase withRootName(PropertyName propertyname)
	{
		return ((MapperConfigBase) (withRootName(propertyname)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #472 <Method DeserializationConfig withRootName(PropertyName)>
	//    3    5:areturn         
	}

	public DeserializationConfig withView(Class class1)
	{
		if(_view == class1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #478 <Field Class _view>
	//*   2    4:aload_1         
	//*   3    5:if_acmpne       10
			return this;
	//    4    8:aload_0         
	//    5    9:areturn         
		else
			return new DeserializationConfig(this, class1);
	//    6   10:new             #2   <Class DeserializationConfig>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokespecial   #480 <Method void DeserializationConfig(DeserializationConfig, Class)>
	//   11   19:areturn         
	}

	public volatile MapperConfigBase withView(Class class1)
	{
		return ((MapperConfigBase) (withView(class1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #484 <Method DeserializationConfig withView(Class)>
	//    3    5:areturn         
	}

	public DeserializationConfig withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
	{
		return _withBase(_base.withVisibility(propertyaccessor, visibility));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #98  <Field BaseSettings _base>
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokevirtual   #489 <Method BaseSettings BaseSettings.withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    6   10:invokespecial   #305 <Method DeserializationConfig _withBase(BaseSettings)>
	//    7   13:areturn         
	}

	public volatile MapperConfigBase withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
	{
		return ((MapperConfigBase) (withVisibility(propertyaccessor, visibility)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #492 <Method DeserializationConfig withVisibility(PropertyAccessor, com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility)>
	//    4    6:areturn         
	}

	public DeserializationConfig without(FormatFeature formatfeature)
	{
		int i = _formatReadFeatures & ~formatfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int _formatReadFeatures>
	//    2    4:aload_1         
	//    3    5:invokeinterface #309 <Method int FormatFeature.getMask()>
	//    4   10:iconst_m1       
	//    5   11:ixor            
	//    6   12:iand            
	//    7   13:istore_2        
		int j = _formatReadFeaturesToChange | formatfeature.getMask();
	//    8   14:aload_0         
	//    9   15:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   10   18:aload_1         
	//   11   19:invokeinterface #309 <Method int FormatFeature.getMask()>
	//   12   24:ior             
	//   13   25:istore_3        
		if(_formatReadFeatures == i && _formatReadFeaturesToChange == j)
	//*  14   26:aload_0         
	//*  15   27:getfield        #39  <Field int _formatReadFeatures>
	//*  16   30:iload_2         
	//*  17   31:icmpne          44
	//*  18   34:aload_0         
	//*  19   35:getfield        #41  <Field int _formatReadFeaturesToChange>
	//*  20   38:iload_3         
	//*  21   39:icmpne          44
			return this;
	//   22   42:aload_0         
	//   23   43:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, _deserFeatures, _parserFeatures, _parserFeaturesToChange, i, j);
	//   24   44:new             #2   <Class DeserializationConfig>
	//   25   47:dup             
	//   26   48:aload_0         
	//   27   49:aload_0         
	//   28   50:getfield        #312 <Field int _mapperFeatures>
	//   29   53:aload_0         
	//   30   54:getfield        #29  <Field int _deserFeatures>
	//   31   57:aload_0         
	//   32   58:getfield        #35  <Field int _parserFeatures>
	//   33   61:aload_0         
	//   34   62:getfield        #37  <Field int _parserFeaturesToChange>
	//   35   65:iload_2         
	//   36   66:iload_3         
	//   37   67:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   38   70:areturn         
	}

	public DeserializationConfig without(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		int i = _parserFeatures & ~feature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int _parserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #272 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    4    8:iconst_m1       
	//    5    9:ixor            
	//    6   10:iand            
	//    7   11:istore_2        
		int j = _parserFeaturesToChange | feature.getMask();
	//    8   12:aload_0         
	//    9   13:getfield        #37  <Field int _parserFeaturesToChange>
	//   10   16:aload_1         
	//   11   17:invokevirtual   #272 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//   12   20:ior             
	//   13   21:istore_3        
		if(_parserFeatures == i && _parserFeaturesToChange == j)
	//*  14   22:aload_0         
	//*  15   23:getfield        #35  <Field int _parserFeatures>
	//*  16   26:iload_2         
	//*  17   27:icmpne          40
	//*  18   30:aload_0         
	//*  19   31:getfield        #37  <Field int _parserFeaturesToChange>
	//*  20   34:iload_3         
	//*  21   35:icmpne          40
			return this;
	//   22   38:aload_0         
	//   23   39:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, _deserFeatures, i, j, _formatReadFeatures, _formatReadFeaturesToChange);
	//   24   40:new             #2   <Class DeserializationConfig>
	//   25   43:dup             
	//   26   44:aload_0         
	//   27   45:aload_0         
	//   28   46:getfield        #312 <Field int _mapperFeatures>
	//   29   49:aload_0         
	//   30   50:getfield        #29  <Field int _deserFeatures>
	//   31   53:iload_2         
	//   32   54:iload_3         
	//   33   55:aload_0         
	//   34   56:getfield        #39  <Field int _formatReadFeatures>
	//   35   59:aload_0         
	//   36   60:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   37   63:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   38   66:areturn         
	}

	public DeserializationConfig without(DeserializationFeature deserializationfeature)
	{
		int i = _deserFeatures & ~deserializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
	//    4    8:iconst_m1       
	//    5    9:ixor            
	//    6   10:iand            
	//    7   11:istore_2        
		if(i == _deserFeatures)
	//*   8   12:iload_2         
	//*   9   13:aload_0         
	//*  10   14:getfield        #29  <Field int _deserFeatures>
	//*  11   17:icmpne          22
			return this;
	//   12   20:aload_0         
	//   13   21:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, i, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   14   22:new             #2   <Class DeserializationConfig>
	//   15   25:dup             
	//   16   26:aload_0         
	//   17   27:aload_0         
	//   18   28:getfield        #312 <Field int _mapperFeatures>
	//   19   31:iload_2         
	//   20   32:aload_0         
	//   21   33:getfield        #35  <Field int _parserFeatures>
	//   22   36:aload_0         
	//   23   37:getfield        #37  <Field int _parserFeaturesToChange>
	//   24   40:aload_0         
	//   25   41:getfield        #39  <Field int _formatReadFeatures>
	//   26   44:aload_0         
	//   27   45:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   28   48:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   29   51:areturn         
	}

	public transient DeserializationConfig without(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
	{
		int j = _deserFeatures & ~deserializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
	//    4    8:iconst_m1       
	//    5    9:ixor            
	//    6   10:iand            
	//    7   11:istore          4
		int k = adeserializationfeature.length;
	//    8   13:aload_2         
	//    9   14:arraylength     
	//   10   15:istore          5
		for(int i = 0; i < k; i++)
	//*  11   17:iconst_0        
	//*  12   18:istore_3        
	//*  13   19:iload_3         
	//*  14   20:iload           5
	//*  15   22:icmpge          45
			j &= ~adeserializationfeature[i].getMask();
	//   16   25:iload           4
	//   17   27:aload_2         
	//   18   28:iload_3         
	//   19   29:aaload          
	//   20   30:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
	//   21   33:iconst_m1       
	//   22   34:ixor            
	//   23   35:iand            
	//   24   36:istore          4

	//   25   38:iload_3         
	//   26   39:iconst_1        
	//   27   40:iadd            
	//   28   41:istore_3        
	//*  29   42:goto            19
		if(j == _deserFeatures)
	//*  30   45:iload           4
	//*  31   47:aload_0         
	//*  32   48:getfield        #29  <Field int _deserFeatures>
	//*  33   51:icmpne          56
			return this;
	//   34   54:aload_0         
	//   35   55:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, j, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   36   56:new             #2   <Class DeserializationConfig>
	//   37   59:dup             
	//   38   60:aload_0         
	//   39   61:aload_0         
	//   40   62:getfield        #312 <Field int _mapperFeatures>
	//   41   65:iload           4
	//   42   67:aload_0         
	//   43   68:getfield        #35  <Field int _parserFeatures>
	//   44   71:aload_0         
	//   45   72:getfield        #37  <Field int _parserFeaturesToChange>
	//   46   75:aload_0         
	//   47   76:getfield        #39  <Field int _formatReadFeatures>
	//   48   79:aload_0         
	//   49   80:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   50   83:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   51   86:areturn         
	}

	public transient DeserializationConfig without(MapperFeature amapperfeature[])
	{
		int j = _mapperFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #312 <Field int _mapperFeatures>
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
	//   15   21:invokevirtual   #324 <Method int MapperFeature.getMask()>
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
	//*  27   37:getfield        #312 <Field int _mapperFeatures>
	//*  28   40:icmpne          45
			return this;
	//   29   43:aload_0         
	//   30   44:areturn         
		else
			return new DeserializationConfig(this, j, _deserFeatures, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   31   45:new             #2   <Class DeserializationConfig>
	//   32   48:dup             
	//   33   49:aload_0         
	//   34   50:iload_3         
	//   35   51:aload_0         
	//   36   52:getfield        #29  <Field int _deserFeatures>
	//   37   55:aload_0         
	//   38   56:getfield        #35  <Field int _parserFeatures>
	//   39   59:aload_0         
	//   40   60:getfield        #37  <Field int _parserFeaturesToChange>
	//   41   63:aload_0         
	//   42   64:getfield        #39  <Field int _formatReadFeatures>
	//   43   67:aload_0         
	//   44   68:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   45   71:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   46   74:areturn         
	}

	public volatile MapperConfig without(MapperFeature amapperfeature[])
	{
		return ((MapperConfig) (without(amapperfeature)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #495 <Method DeserializationConfig without(MapperFeature[])>
	//    3    5:areturn         
	}

	public transient DeserializationConfig withoutFeatures(FormatFeature aformatfeature[])
	{
		int k = _formatReadFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field int _formatReadFeatures>
	//    2    4:istore          4
		int j = _formatReadFeaturesToChange;
	//    3    6:aload_0         
	//    4    7:getfield        #41  <Field int _formatReadFeaturesToChange>
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
	//   17   26:invokeinterface #309 <Method int FormatFeature.getMask()>
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
		if(_formatReadFeatures == k && _formatReadFeaturesToChange == j)
	//*  34   54:aload_0         
	//*  35   55:getfield        #39  <Field int _formatReadFeatures>
	//*  36   58:iload           4
	//*  37   60:icmpne          73
	//*  38   63:aload_0         
	//*  39   64:getfield        #41  <Field int _formatReadFeaturesToChange>
	//*  40   67:iload_3         
	//*  41   68:icmpne          73
			return this;
	//   42   71:aload_0         
	//   43   72:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, _deserFeatures, _parserFeatures, _parserFeaturesToChange, k, j);
	//   44   73:new             #2   <Class DeserializationConfig>
	//   45   76:dup             
	//   46   77:aload_0         
	//   47   78:aload_0         
	//   48   79:getfield        #312 <Field int _mapperFeatures>
	//   49   82:aload_0         
	//   50   83:getfield        #29  <Field int _deserFeatures>
	//   51   86:aload_0         
	//   52   87:getfield        #35  <Field int _parserFeatures>
	//   53   90:aload_0         
	//   54   91:getfield        #37  <Field int _parserFeaturesToChange>
	//   55   94:iload           4
	//   56   96:iload_3         
	//   57   97:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   58  100:areturn         
	}

	public transient DeserializationConfig withoutFeatures(com.fasterxml.jackson.core.JsonParser.Feature afeature[])
	{
		int k = _parserFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int _parserFeatures>
	//    2    4:istore          4
		int j = _parserFeaturesToChange;
	//    3    6:aload_0         
	//    4    7:getfield        #37  <Field int _parserFeaturesToChange>
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
	//   17   26:invokevirtual   #272 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
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
		if(_parserFeatures == k && _parserFeaturesToChange == j)
	//*  34   52:aload_0         
	//*  35   53:getfield        #35  <Field int _parserFeatures>
	//*  36   56:iload           4
	//*  37   58:icmpne          71
	//*  38   61:aload_0         
	//*  39   62:getfield        #37  <Field int _parserFeaturesToChange>
	//*  40   65:iload_3         
	//*  41   66:icmpne          71
			return this;
	//   42   69:aload_0         
	//   43   70:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, _deserFeatures, k, j, _formatReadFeatures, _formatReadFeaturesToChange);
	//   44   71:new             #2   <Class DeserializationConfig>
	//   45   74:dup             
	//   46   75:aload_0         
	//   47   76:aload_0         
	//   48   77:getfield        #312 <Field int _mapperFeatures>
	//   49   80:aload_0         
	//   50   81:getfield        #29  <Field int _deserFeatures>
	//   51   84:iload           4
	//   52   86:iload_3         
	//   53   87:aload_0         
	//   54   88:getfield        #39  <Field int _formatReadFeatures>
	//   55   91:aload_0         
	//   56   92:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   57   95:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   58   98:areturn         
	}

	public transient DeserializationConfig withoutFeatures(DeserializationFeature adeserializationfeature[])
	{
		int j = _deserFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field int _deserFeatures>
	//    2    4:istore_3        
		int k = adeserializationfeature.length;
	//    3    5:aload_1         
	//    4    6:arraylength     
	//    5    7:istore          4
		for(int i = 0; i < k; i++)
	//*   6    9:iconst_0        
	//*   7   10:istore_2        
	//*   8   11:iload_2         
	//*   9   12:iload           4
	//*  10   14:icmpge          35
			j &= ~adeserializationfeature[i].getMask();
	//   11   17:iload_3         
	//   12   18:aload_1         
	//   13   19:iload_2         
	//   14   20:aaload          
	//   15   21:invokevirtual   #279 <Method int DeserializationFeature.getMask()>
	//   16   24:iconst_m1       
	//   17   25:ixor            
	//   18   26:iand            
	//   19   27:istore_3        

	//   20   28:iload_2         
	//   21   29:iconst_1        
	//   22   30:iadd            
	//   23   31:istore_2        
	//*  24   32:goto            11
		if(j == _deserFeatures)
	//*  25   35:iload_3         
	//*  26   36:aload_0         
	//*  27   37:getfield        #29  <Field int _deserFeatures>
	//*  28   40:icmpne          45
			return this;
	//   29   43:aload_0         
	//   30   44:areturn         
		else
			return new DeserializationConfig(this, _mapperFeatures, j, _parserFeatures, _parserFeaturesToChange, _formatReadFeatures, _formatReadFeaturesToChange);
	//   31   45:new             #2   <Class DeserializationConfig>
	//   32   48:dup             
	//   33   49:aload_0         
	//   34   50:aload_0         
	//   35   51:getfield        #312 <Field int _mapperFeatures>
	//   36   54:iload_3         
	//   37   55:aload_0         
	//   38   56:getfield        #35  <Field int _parserFeatures>
	//   39   59:aload_0         
	//   40   60:getfield        #37  <Field int _parserFeaturesToChange>
	//   41   63:aload_0         
	//   42   64:getfield        #39  <Field int _formatReadFeatures>
	//   43   67:aload_0         
	//   44   68:getfield        #41  <Field int _formatReadFeaturesToChange>
	//   45   71:invokespecial   #314 <Method void DeserializationConfig(DeserializationConfig, int, int, int, int, int, int)>
	//   46   74:areturn         
	}

	private static final long serialVersionUID = 1L;
	protected final int _deserFeatures;
	protected final int _formatReadFeatures;
	protected final int _formatReadFeaturesToChange;
	protected final JsonNodeFactory _nodeFactory;
	protected final int _parserFeatures;
	protected final int _parserFeaturesToChange;
	protected final LinkedNode _problemHandlers;
}
