// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.Instantiatable;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.ConfigOverrides;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.SimpleMixInResolver;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.util.RootNameLookup;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind:
//			SerializationFeature, JavaType, BeanDescription

public final class SerializationConfig extends MapperConfigBase
	implements Serializable
{

	private SerializationConfig(SerializationConfig serializationconfig, int i, int j, int k, int l, int i1, int j1)
	{
		super(((MapperConfigBase) (serializationconfig)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #36  <Method void MapperConfigBase(MapperConfigBase, int)>
		_serFeatures = j;
	//    4    6:aload_0         
	//    5    7:iload_3         
	//    6    8:putfield        #38  <Field int _serFeatures>
		_filterProvider = serializationconfig._filterProvider;
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:getfield        #40  <Field FilterProvider _filterProvider>
	//   10   16:putfield        #40  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:getfield        #42  <Field PrettyPrinter _defaultPrettyPrinter>
	//   14   24:putfield        #42  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = k;
	//   15   27:aload_0         
	//   16   28:iload           4
	//   17   30:putfield        #44  <Field int _generatorFeatures>
		_generatorFeaturesToChange = l;
	//   18   33:aload_0         
	//   19   34:iload           5
	//   20   36:putfield        #46  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = i1;
	//   21   39:aload_0         
	//   22   40:iload           6
	//   23   42:putfield        #48  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = j1;
	//   24   45:aload_0         
	//   25   46:iload           7
	//   26   48:putfield        #50  <Field int _formatWriteFeaturesToChange>
	//   27   51:return          
	}

	private SerializationConfig(SerializationConfig serializationconfig, BaseSettings basesettings)
	{
		super(((MapperConfigBase) (serializationconfig)), basesettings);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #54  <Method void MapperConfigBase(MapperConfigBase, BaseSettings)>
		_serFeatures = serializationconfig._serFeatures;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:getfield        #38  <Field int _serFeatures>
	//    7   11:putfield        #38  <Field int _serFeatures>
		_filterProvider = serializationconfig._filterProvider;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getfield        #40  <Field FilterProvider _filterProvider>
	//   11   19:putfield        #40  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = serializationconfig._defaultPrettyPrinter;
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:getfield        #42  <Field PrettyPrinter _defaultPrettyPrinter>
	//   15   27:putfield        #42  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = serializationconfig._generatorFeatures;
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:getfield        #44  <Field int _generatorFeatures>
	//   19   35:putfield        #44  <Field int _generatorFeatures>
		_generatorFeaturesToChange = serializationconfig._generatorFeaturesToChange;
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:getfield        #46  <Field int _generatorFeaturesToChange>
	//   23   43:putfield        #46  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = serializationconfig._formatWriteFeatures;
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:getfield        #48  <Field int _formatWriteFeatures>
	//   27   51:putfield        #48  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = serializationconfig._formatWriteFeaturesToChange;
	//   28   54:aload_0         
	//   29   55:aload_1         
	//   30   56:getfield        #50  <Field int _formatWriteFeaturesToChange>
	//   31   59:putfield        #50  <Field int _formatWriteFeaturesToChange>
	//   32   62:return          
	}

	public SerializationConfig(BaseSettings basesettings, SubtypeResolver subtyperesolver, SimpleMixInResolver simplemixinresolver, RootNameLookup rootnamelookup, ConfigOverrides configoverrides)
	{
		super(basesettings, subtyperesolver, simplemixinresolver, rootnamelookup, configoverrides);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aload           4
	//    5    6:aload           5
	//    6    8:invokespecial   #57  <Method void MapperConfigBase(BaseSettings, SubtypeResolver, SimpleMixInResolver, RootNameLookup, ConfigOverrides)>
		_serFeatures = collectFeatureDefaults(com/fasterxml/jackson/databind/SerializationFeature);
	//    7   11:aload_0         
	//    8   12:ldc1            #59  <Class SerializationFeature>
	//    9   14:invokestatic    #63  <Method int collectFeatureDefaults(Class)>
	//   10   17:putfield        #38  <Field int _serFeatures>
		_filterProvider = null;
	//   11   20:aload_0         
	//   12   21:aconst_null     
	//   13   22:putfield        #40  <Field FilterProvider _filterProvider>
		_defaultPrettyPrinter = DEFAULT_PRETTY_PRINTER;
	//   14   25:aload_0         
	//   15   26:getstatic       #31  <Field PrettyPrinter DEFAULT_PRETTY_PRINTER>
	//   16   29:putfield        #42  <Field PrettyPrinter _defaultPrettyPrinter>
		_generatorFeatures = 0;
	//   17   32:aload_0         
	//   18   33:iconst_0        
	//   19   34:putfield        #44  <Field int _generatorFeatures>
		_generatorFeaturesToChange = 0;
	//   20   37:aload_0         
	//   21   38:iconst_0        
	//   22   39:putfield        #46  <Field int _generatorFeaturesToChange>
		_formatWriteFeatures = 0;
	//   23   42:aload_0         
	//   24   43:iconst_0        
	//   25   44:putfield        #48  <Field int _formatWriteFeatures>
		_formatWriteFeaturesToChange = 0;
	//   26   47:aload_0         
	//   27   48:iconst_0        
	//   28   49:putfield        #50  <Field int _formatWriteFeaturesToChange>
	//   29   52:return          
	}

	protected final SerializationConfig _withBase(BaseSettings basesettings)
	{
		if(_base == basesettings)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field BaseSettings _base>
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
	//   10   16:invokespecial   #71  <Method void SerializationConfig(SerializationConfig, BaseSettings)>
	//   11   19:areturn         
	}

	protected volatile MapperConfigBase _withBase(BaseSettings basesettings)
	{
		return ((MapperConfigBase) (_withBase(basesettings)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #74  <Method SerializationConfig _withBase(BaseSettings)>
	//    3    5:areturn         
	}

	protected final SerializationConfig _withMapperFeatures(int i)
	{
		return new SerializationConfig(this, i, _serFeatures, _generatorFeatures, _generatorFeaturesToChange, _formatWriteFeatures, _formatWriteFeaturesToChange);
	//    0    0:new             #2   <Class SerializationConfig>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #38  <Field int _serFeatures>
	//    6   10:aload_0         
	//    7   11:getfield        #44  <Field int _generatorFeatures>
	//    8   14:aload_0         
	//    9   15:getfield        #46  <Field int _generatorFeaturesToChange>
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field int _formatWriteFeatures>
	//   12   22:aload_0         
	//   13   23:getfield        #50  <Field int _formatWriteFeaturesToChange>
	//   14   26:invokespecial   #78  <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   15   29:areturn         
	}

	protected volatile MapperConfigBase _withMapperFeatures(int i)
	{
		return ((MapperConfigBase) (_withMapperFeatures(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #81  <Method SerializationConfig _withMapperFeatures(int)>
	//    3    5:areturn         
	}

	public PrettyPrinter constructDefaultPrettyPrinter()
	{
		PrettyPrinter prettyprinter1 = _defaultPrettyPrinter;
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field PrettyPrinter _defaultPrettyPrinter>
	//    2    4:astore_2        
		PrettyPrinter prettyprinter = prettyprinter1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(prettyprinter1 instanceof Instantiatable)
	//*   5    7:aload_2         
	//*   6    8:instanceof      #85  <Class Instantiatable>
	//*   7   11:ifeq            27
			prettyprinter = (PrettyPrinter)((Instantiatable)prettyprinter1).createInstance();
	//    8   14:aload_2         
	//    9   15:checkcast       #85  <Class Instantiatable>
	//   10   18:invokeinterface #89  <Method Object Instantiatable.createInstance()>
	//   11   23:checkcast       #91  <Class PrettyPrinter>
	//   12   26:astore_1        
		return prettyprinter;
	//   13   27:aload_1         
	//   14   28:areturn         
	}

	public FilterProvider getFilterProvider()
	{
		return _filterProvider;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field FilterProvider _filterProvider>
	//    2    4:areturn         
	}

	public void initialize(JsonGenerator jsongenerator)
	{
		if(SerializationFeature.INDENT_OUTPUT.enabledIn(_serFeatures) && jsongenerator.getPrettyPrinter() == null)
	//*   0    0:getstatic       #99  <Field SerializationFeature SerializationFeature.INDENT_OUTPUT>
	//*   1    3:aload_0         
	//*   2    4:getfield        #38  <Field int _serFeatures>
	//*   3    7:invokevirtual   #103 <Method boolean SerializationFeature.enabledIn(int)>
	//*   4   10:ifeq            38
	//*   5   13:aload_1         
	//*   6   14:invokevirtual   #108 <Method PrettyPrinter JsonGenerator.getPrettyPrinter()>
	//*   7   17:ifnonnull       38
		{
			PrettyPrinter prettyprinter = constructDefaultPrettyPrinter();
	//    8   20:aload_0         
	//    9   21:invokevirtual   #110 <Method PrettyPrinter constructDefaultPrettyPrinter()>
	//   10   24:astore          7
			if(prettyprinter != null)
	//*  11   26:aload           7
	//*  12   28:ifnull          38
				jsongenerator.setPrettyPrinter(prettyprinter);
	//   13   31:aload_1         
	//   14   32:aload           7
	//   15   34:invokevirtual   #114 <Method JsonGenerator JsonGenerator.setPrettyPrinter(PrettyPrinter)>
	//   16   37:pop             
		}
		boolean flag = SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(_serFeatures);
	//   17   38:getstatic       #117 <Field SerializationFeature SerializationFeature.WRITE_BIGDECIMAL_AS_PLAIN>
	//   18   41:aload_0         
	//   19   42:getfield        #38  <Field int _serFeatures>
	//   20   45:invokevirtual   #103 <Method boolean SerializationFeature.enabledIn(int)>
	//   21   48:istore          6
		int l = _generatorFeaturesToChange;
	//   22   50:aload_0         
	//   23   51:getfield        #46  <Field int _generatorFeaturesToChange>
	//   24   54:istore          4
		if(l != 0 || flag)
	//*  25   56:iload           4
	//*  26   58:ifne            66
	//*  27   61:iload           6
	//*  28   63:ifeq            107
		{
			int i1 = _generatorFeatures;
	//   29   66:aload_0         
	//   30   67:getfield        #44  <Field int _generatorFeatures>
	//   31   70:istore          5
			int k = l;
	//   32   72:iload           4
	//   33   74:istore_3        
			int i = i1;
	//   34   75:iload           5
	//   35   77:istore_2        
			if(flag)
	//*  36   78:iload           6
	//*  37   80:ifeq            100
			{
				k = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.getMask();
	//   38   83:getstatic       #122 <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_BIGDECIMAL_AS_PLAIN>
	//   39   86:invokevirtual   #126 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//   40   89:istore_3        
				i = i1 | k;
	//   41   90:iload           5
	//   42   92:iload_3         
	//   43   93:ior             
	//   44   94:istore_2        
				k = l | k;
	//   45   95:iload           4
	//   46   97:iload_3         
	//   47   98:ior             
	//   48   99:istore_3        
			}
			jsongenerator.overrideStdFeatures(i, k);
	//   49  100:aload_1         
	//   50  101:iload_2         
	//   51  102:iload_3         
	//   52  103:invokevirtual   #130 <Method JsonGenerator JsonGenerator.overrideStdFeatures(int, int)>
	//   53  106:pop             
		}
		int j = _formatWriteFeaturesToChange;
	//   54  107:aload_0         
	//   55  108:getfield        #50  <Field int _formatWriteFeaturesToChange>
	//   56  111:istore_2        
		if(j != 0)
	//*  57  112:iload_2         
	//*  58  113:ifeq            126
			jsongenerator.overrideFormatFeatures(_formatWriteFeatures, j);
	//   59  116:aload_1         
	//   60  117:aload_0         
	//   61  118:getfield        #48  <Field int _formatWriteFeatures>
	//   62  121:iload_2         
	//   63  122:invokevirtual   #133 <Method JsonGenerator JsonGenerator.overrideFormatFeatures(int, int)>
	//   64  125:pop             
	//   65  126:return          
	}

	public BeanDescription introspect(JavaType javatype)
	{
		return getClassIntrospector().forSerialization(this, javatype, ((com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method ClassIntrospector getClassIntrospector()>
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:invokevirtual   #145 <Method BeanDescription ClassIntrospector.forSerialization(SerializationConfig, JavaType, com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver)>
	//    6   10:areturn         
	}

	public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature, JsonFactory jsonfactory)
	{
		if((feature.getMask() & _generatorFeaturesToChange) != 0)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #126 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//*   2    4:aload_0         
	//*   3    5:getfield        #46  <Field int _generatorFeaturesToChange>
	//*   4    8:iand            
	//*   5    9:ifeq            30
		{
			int i = _generatorFeatures;
	//    6   12:aload_0         
	//    7   13:getfield        #44  <Field int _generatorFeatures>
	//    8   16:istore_3        
			return (feature.getMask() & i) != 0;
	//    9   17:aload_1         
	//   10   18:invokevirtual   #126 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
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
	//   20   32:invokevirtual   #154 <Method boolean JsonFactory.isEnabled(com.fasterxml.jackson.core.JsonGenerator$Feature)>
	//   21   35:ireturn         
		}
	}

	public final boolean isEnabled(SerializationFeature serializationfeature)
	{
		int i = _serFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int _serFeatures>
	//    2    4:istore_2        
		return (serializationfeature.getMask() & i) != 0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #156 <Method int SerializationFeature.getMask()>
	//    5    9:iload_2         
	//    6   10:iand            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public SerializationConfig with(SerializationFeature serializationfeature)
	{
		int i = _serFeatures | serializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int _serFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method int SerializationFeature.getMask()>
	//    4    8:ior             
	//    5    9:istore_2        
		if(i == _serFeatures)
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #38  <Field int _serFeatures>
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
	//   16   26:getfield        #161 <Field int _mapperFeatures>
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #44  <Field int _generatorFeatures>
	//   20   34:aload_0         
	//   21   35:getfield        #46  <Field int _generatorFeaturesToChange>
	//   22   38:aload_0         
	//   23   39:getfield        #48  <Field int _formatWriteFeatures>
	//   24   42:aload_0         
	//   25   43:getfield        #50  <Field int _formatWriteFeaturesToChange>
	//   26   46:invokespecial   #78  <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   27   49:areturn         
	}

	public SerializationConfig without(SerializationFeature serializationfeature)
	{
		int i = _serFeatures & serializationfeature.getMask();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field int _serFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #156 <Method int SerializationFeature.getMask()>
	//    4    8:iand            
	//    5    9:istore_2        
		if(i == _serFeatures)
	//*   6   10:iload_2         
	//*   7   11:aload_0         
	//*   8   12:getfield        #38  <Field int _serFeatures>
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
	//   16   26:getfield        #161 <Field int _mapperFeatures>
	//   17   29:iload_2         
	//   18   30:aload_0         
	//   19   31:getfield        #44  <Field int _generatorFeatures>
	//   20   34:aload_0         
	//   21   35:getfield        #46  <Field int _generatorFeaturesToChange>
	//   22   38:aload_0         
	//   23   39:getfield        #48  <Field int _formatWriteFeatures>
	//   24   42:aload_0         
	//   25   43:getfield        #50  <Field int _formatWriteFeaturesToChange>
	//   26   46:invokespecial   #78  <Method void SerializationConfig(SerializationConfig, int, int, int, int, int, int)>
	//   27   49:areturn         
	}

	protected static final PrettyPrinter DEFAULT_PRETTY_PRINTER = new DefaultPrettyPrinter();
	private static final long serialVersionUID = 1L;
	protected final PrettyPrinter _defaultPrettyPrinter;
	protected final FilterProvider _filterProvider;
	protected final int _formatWriteFeatures;
	protected final int _formatWriteFeaturesToChange;
	protected final int _generatorFeatures;
	protected final int _generatorFeaturesToChange;
	protected final int _serFeatures;

	static 
	{
	//    0    0:new             #26  <Class DefaultPrettyPrinter>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void DefaultPrettyPrinter()>
	//    3    7:putstatic       #31  <Field PrettyPrinter DEFAULT_PRETTY_PRINTER>
	//*   4   10:return          
	}
}
