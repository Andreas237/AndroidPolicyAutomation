// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.BufferRecyclers;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.*;

// Referenced classes of package com.fasterxml.jackson.core:
//			Versioned, JsonEncoding, JsonParseException, SerializableString, 
//			ObjectCodec, JsonGenerator, JsonParser, Version

public class JsonFactory
	implements Versioned, Serializable
{
	public static final class Feature extends Enum
	{

		public static int collectDefaults()
		{
			Feature afeature[] = values();
		//    0    0:invokestatic    #51  <Method JsonFactory$Feature[] values()>
		//    1    3:astore          4
			int l = afeature.length;
		//    2    5:aload           4
		//    3    7:arraylength     
		//    4    8:istore_3        
			int i = 0;
		//    5    9:iconst_0        
		//    6   10:istore_0        
			int j;
			int k;
			for(j = 0; i < l; j = k)
		//*   7   11:iconst_0        
		//*   8   12:istore_1        
		//*   9   13:iload_0         
		//*  10   14:iload_3         
		//*  11   15:icmpge          51
			{
				Feature feature = afeature[i];
		//   12   18:aload           4
		//   13   20:iload_0         
		//   14   21:aaload          
		//   15   22:astore          5
				k = j;
		//   16   24:iload_1         
		//   17   25:istore_2        
				if(feature.enabledByDefault())
		//*  18   26:aload           5
		//*  19   28:invokevirtual   #55  <Method boolean enabledByDefault()>
		//*  20   31:ifeq            42
					k = j | feature.getMask();
		//   21   34:iload_1         
		//   22   35:aload           5
		//   23   37:invokevirtual   #58  <Method int getMask()>
		//   24   40:ior             
		//   25   41:istore_2        
				i++;
		//   26   42:iload_0         
		//   27   43:iconst_1        
		//   28   44:iadd            
		//   29   45:istore_0        
			}

		//   30   46:iload_2         
		//   31   47:istore_1        
		//*  32   48:goto            13
			return j;
		//   33   51:iload_1         
		//   34   52:ireturn         
		}

		public static Feature valueOf(String s)
		{
			return (Feature)Enum.valueOf(com/fasterxml/jackson/core/JsonFactory$Feature, s);
		//    0    0:ldc1            #2   <Class JsonFactory$Feature>
		//    1    2:aload_0         
		//    2    3:invokestatic    #63  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class JsonFactory$Feature>
		//    4    9:areturn         
		}

		public static Feature[] values()
		{
			return (Feature[])((Feature []) ($VALUES)).clone();
		//    0    0:getstatic       #37  <Field JsonFactory$Feature[] $VALUES>
		//    1    3:invokevirtual   #68  <Method Object _5B_Lcom.fasterxml.jackson.core.JsonFactory$Feature_3B_.clone()>
		//    2    6:checkcast       #64  <Class JsonFactory$Feature[]>
		//    3    9:areturn         
		}

		public boolean enabledByDefault()
		{
			return _defaultState;
		//    0    0:aload_0         
		//    1    1:getfield        #43  <Field boolean _defaultState>
		//    2    4:ireturn         
		}

		public boolean enabledIn(int i)
		{
			return (i & getMask()) != 0;
		//    0    0:iload_1         
		//    1    1:aload_0         
		//    2    2:invokevirtual   #58  <Method int getMask()>
		//    3    5:iand            
		//    4    6:ifeq            11
		//    5    9:iconst_1        
		//    6   10:ireturn         
		//    7   11:iconst_0        
		//    8   12:ireturn         
		}

		public int getMask()
		{
			return 1 << ordinal();
		//    0    0:iconst_1        
		//    1    1:aload_0         
		//    2    2:invokevirtual   #73  <Method int ordinal()>
		//    3    5:ishl            
		//    4    6:ireturn         
		}

		private static final Feature $VALUES[];
		public static final Feature CANONICALIZE_FIELD_NAMES;
		public static final Feature FAIL_ON_SYMBOL_HASH_OVERFLOW;
		public static final Feature INTERN_FIELD_NAMES;
		public static final Feature USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING;
		private final boolean _defaultState;

		static 
		{
			INTERN_FIELD_NAMES = new Feature("INTERN_FIELD_NAMES", 0, true);
		//    0    0:new             #2   <Class JsonFactory$Feature>
		//    1    3:dup             
		//    2    4:ldc1            #20  <String "INTERN_FIELD_NAMES">
		//    3    6:iconst_0        
		//    4    7:iconst_1        
		//    5    8:invokespecial   #24  <Method void JsonFactory$Feature(String, int, boolean)>
		//    6   11:putstatic       #26  <Field JsonFactory$Feature INTERN_FIELD_NAMES>
			CANONICALIZE_FIELD_NAMES = new Feature("CANONICALIZE_FIELD_NAMES", 1, true);
		//    7   14:new             #2   <Class JsonFactory$Feature>
		//    8   17:dup             
		//    9   18:ldc1            #27  <String "CANONICALIZE_FIELD_NAMES">
		//   10   20:iconst_1        
		//   11   21:iconst_1        
		//   12   22:invokespecial   #24  <Method void JsonFactory$Feature(String, int, boolean)>
		//   13   25:putstatic       #29  <Field JsonFactory$Feature CANONICALIZE_FIELD_NAMES>
			FAIL_ON_SYMBOL_HASH_OVERFLOW = new Feature("FAIL_ON_SYMBOL_HASH_OVERFLOW", 2, true);
		//   14   28:new             #2   <Class JsonFactory$Feature>
		//   15   31:dup             
		//   16   32:ldc1            #30  <String "FAIL_ON_SYMBOL_HASH_OVERFLOW">
		//   17   34:iconst_2        
		//   18   35:iconst_1        
		//   19   36:invokespecial   #24  <Method void JsonFactory$Feature(String, int, boolean)>
		//   20   39:putstatic       #32  <Field JsonFactory$Feature FAIL_ON_SYMBOL_HASH_OVERFLOW>
			USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING = new Feature("USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING", 3, true);
		//   21   42:new             #2   <Class JsonFactory$Feature>
		//   22   45:dup             
		//   23   46:ldc1            #33  <String "USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING">
		//   24   48:iconst_3        
		//   25   49:iconst_1        
		//   26   50:invokespecial   #24  <Method void JsonFactory$Feature(String, int, boolean)>
		//   27   53:putstatic       #35  <Field JsonFactory$Feature USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING>
			$VALUES = (new Feature[] {
				INTERN_FIELD_NAMES, CANONICALIZE_FIELD_NAMES, FAIL_ON_SYMBOL_HASH_OVERFLOW, USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING
			});
		//   28   56:iconst_4        
		//   29   57:anewarray       Feature[]
		//   30   60:dup             
		//   31   61:iconst_0        
		//   32   62:getstatic       #26  <Field JsonFactory$Feature INTERN_FIELD_NAMES>
		//   33   65:aastore         
		//   34   66:dup             
		//   35   67:iconst_1        
		//   36   68:getstatic       #29  <Field JsonFactory$Feature CANONICALIZE_FIELD_NAMES>
		//   37   71:aastore         
		//   38   72:dup             
		//   39   73:iconst_2        
		//   40   74:getstatic       #32  <Field JsonFactory$Feature FAIL_ON_SYMBOL_HASH_OVERFLOW>
		//   41   77:aastore         
		//   42   78:dup             
		//   43   79:iconst_3        
		//   44   80:getstatic       #35  <Field JsonFactory$Feature USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING>
		//   45   83:aastore         
		//   46   84:putstatic       #37  <Field JsonFactory$Feature[] $VALUES>
		//*  47   87:return          
		}

		private Feature(String s, int i, boolean flag)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void Enum(String, int)>
			_defaultState = flag;
		//    4    6:aload_0         
		//    5    7:iload_3         
		//    6    8:putfield        #43  <Field boolean _defaultState>
		//    7   11:return          
		}
	}


	public JsonFactory()
	{
		this(((ObjectCodec) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #67  <Method void JsonFactory(ObjectCodec)>
	//    3    5:return          
	}

	protected JsonFactory(JsonFactory jsonfactory, ObjectCodec objectcodec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		_rootCharSymbols = CharsToNameCanonicalizer.createRoot();
	//    2    4:aload_0         
	//    3    5:invokestatic    #76  <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.createRoot()>
	//    4    8:putfield        #78  <Field CharsToNameCanonicalizer _rootCharSymbols>
		_byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
	//    5   11:aload_0         
	//    6   12:invokestatic    #83  <Method ByteQuadsCanonicalizer ByteQuadsCanonicalizer.createRoot()>
	//    7   15:putfield        #85  <Field ByteQuadsCanonicalizer _byteSymbolCanonicalizer>
		_factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
	//    8   18:aload_0         
	//    9   19:getstatic       #45  <Field int DEFAULT_FACTORY_FEATURE_FLAGS>
	//   10   22:putfield        #87  <Field int _factoryFeatures>
		_parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
	//   11   25:aload_0         
	//   12   26:getstatic       #50  <Field int DEFAULT_PARSER_FEATURE_FLAGS>
	//   13   29:putfield        #89  <Field int _parserFeatures>
		_generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
	//   14   32:aload_0         
	//   15   33:getstatic       #55  <Field int DEFAULT_GENERATOR_FEATURE_FLAGS>
	//   16   36:putfield        #91  <Field int _generatorFeatures>
		_rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
	//   17   39:aload_0         
	//   18   40:getstatic       #62  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//   19   43:putfield        #93  <Field SerializableString _rootValueSeparator>
		_objectCodec = null;
	//   20   46:aload_0         
	//   21   47:aconst_null     
	//   22   48:putfield        #95  <Field ObjectCodec _objectCodec>
		_factoryFeatures = jsonfactory._factoryFeatures;
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:getfield        #87  <Field int _factoryFeatures>
	//   26   56:putfield        #87  <Field int _factoryFeatures>
		_parserFeatures = jsonfactory._parserFeatures;
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:getfield        #89  <Field int _parserFeatures>
	//   30   64:putfield        #89  <Field int _parserFeatures>
		_generatorFeatures = jsonfactory._generatorFeatures;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:getfield        #91  <Field int _generatorFeatures>
	//   34   72:putfield        #91  <Field int _generatorFeatures>
		_characterEscapes = jsonfactory._characterEscapes;
	//   35   75:aload_0         
	//   36   76:aload_1         
	//   37   77:getfield        #97  <Field CharacterEscapes _characterEscapes>
	//   38   80:putfield        #97  <Field CharacterEscapes _characterEscapes>
		_inputDecorator = jsonfactory._inputDecorator;
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:getfield        #99  <Field InputDecorator _inputDecorator>
	//   42   88:putfield        #99  <Field InputDecorator _inputDecorator>
		_outputDecorator = jsonfactory._outputDecorator;
	//   43   91:aload_0         
	//   44   92:aload_1         
	//   45   93:getfield        #101 <Field OutputDecorator _outputDecorator>
	//   46   96:putfield        #101 <Field OutputDecorator _outputDecorator>
		_rootValueSeparator = jsonfactory._rootValueSeparator;
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:getfield        #93  <Field SerializableString _rootValueSeparator>
	//   50  104:putfield        #93  <Field SerializableString _rootValueSeparator>
	//   51  107:return          
	}

	public JsonFactory(ObjectCodec objectcodec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		_rootCharSymbols = CharsToNameCanonicalizer.createRoot();
	//    2    4:aload_0         
	//    3    5:invokestatic    #76  <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.createRoot()>
	//    4    8:putfield        #78  <Field CharsToNameCanonicalizer _rootCharSymbols>
		_byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
	//    5   11:aload_0         
	//    6   12:invokestatic    #83  <Method ByteQuadsCanonicalizer ByteQuadsCanonicalizer.createRoot()>
	//    7   15:putfield        #85  <Field ByteQuadsCanonicalizer _byteSymbolCanonicalizer>
		_factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
	//    8   18:aload_0         
	//    9   19:getstatic       #45  <Field int DEFAULT_FACTORY_FEATURE_FLAGS>
	//   10   22:putfield        #87  <Field int _factoryFeatures>
		_parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
	//   11   25:aload_0         
	//   12   26:getstatic       #50  <Field int DEFAULT_PARSER_FEATURE_FLAGS>
	//   13   29:putfield        #89  <Field int _parserFeatures>
		_generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
	//   14   32:aload_0         
	//   15   33:getstatic       #55  <Field int DEFAULT_GENERATOR_FEATURE_FLAGS>
	//   16   36:putfield        #91  <Field int _generatorFeatures>
		_rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
	//   17   39:aload_0         
	//   18   40:getstatic       #62  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//   19   43:putfield        #93  <Field SerializableString _rootValueSeparator>
		_objectCodec = objectcodec;
	//   20   46:aload_0         
	//   21   47:aload_1         
	//   22   48:putfield        #95  <Field ObjectCodec _objectCodec>
	//   23   51:return          
	}

	protected IOContext _createContext(Object obj, boolean flag)
	{
		return new IOContext(_getBufferRecycler(), obj, flag);
	//    0    0:new             #105 <Class IOContext>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #109 <Method BufferRecycler _getBufferRecycler()>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #112 <Method void IOContext(BufferRecycler, Object, boolean)>
	//    7   13:areturn         
	}

	protected JsonGenerator _createGenerator(Writer writer, IOContext iocontext)
		throws IOException
	{
		writer = ((Writer) (new WriterBasedJsonGenerator(iocontext, _generatorFeatures, _objectCodec, writer)));
	//    0    0:new             #118 <Class WriterBasedJsonGenerator>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #91  <Field int _generatorFeatures>
	//    5    9:aload_0         
	//    6   10:getfield        #95  <Field ObjectCodec _objectCodec>
	//    7   13:aload_1         
	//    8   14:invokespecial   #121 <Method void WriterBasedJsonGenerator(IOContext, int, ObjectCodec, Writer)>
	//    9   17:astore_1        
		iocontext = ((IOContext) (_characterEscapes));
	//   10   18:aload_0         
	//   11   19:getfield        #97  <Field CharacterEscapes _characterEscapes>
	//   12   22:astore_2        
		if(iocontext != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          33
			((WriterBasedJsonGenerator) (writer)).setCharacterEscapes(((CharacterEscapes) (iocontext)));
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #125 <Method JsonGenerator WriterBasedJsonGenerator.setCharacterEscapes(CharacterEscapes)>
	//   18   32:pop             
		iocontext = ((IOContext) (_rootValueSeparator));
	//   19   33:aload_0         
	//   20   34:getfield        #93  <Field SerializableString _rootValueSeparator>
	//   21   37:astore_2        
		if(iocontext != DEFAULT_ROOT_VALUE_SEPARATOR)
	//*  22   38:aload_2         
	//*  23   39:getstatic       #62  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//*  24   42:if_acmpeq       51
			((WriterBasedJsonGenerator) (writer)).setRootValueSeparator(((SerializableString) (iocontext)));
	//   25   45:aload_1         
	//   26   46:aload_2         
	//   27   47:invokevirtual   #129 <Method JsonGenerator WriterBasedJsonGenerator.setRootValueSeparator(SerializableString)>
	//   28   50:pop             
		return ((JsonGenerator) (writer));
	//   29   51:aload_1         
	//   30   52:areturn         
	}

	protected JsonParser _createParser(InputStream inputstream, IOContext iocontext)
		throws IOException
	{
		return (new ByteSourceJsonBootstrapper(iocontext, inputstream)).constructParser(_parserFeatures, _objectCodec, _byteSymbolCanonicalizer, _rootCharSymbols, _factoryFeatures);
	//    0    0:new             #134 <Class ByteSourceJsonBootstrapper>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokespecial   #137 <Method void ByteSourceJsonBootstrapper(IOContext, InputStream)>
	//    5    9:aload_0         
	//    6   10:getfield        #89  <Field int _parserFeatures>
	//    7   13:aload_0         
	//    8   14:getfield        #95  <Field ObjectCodec _objectCodec>
	//    9   17:aload_0         
	//   10   18:getfield        #85  <Field ByteQuadsCanonicalizer _byteSymbolCanonicalizer>
	//   11   21:aload_0         
	//   12   22:getfield        #78  <Field CharsToNameCanonicalizer _rootCharSymbols>
	//   13   25:aload_0         
	//   14   26:getfield        #87  <Field int _factoryFeatures>
	//   15   29:invokevirtual   #141 <Method JsonParser ByteSourceJsonBootstrapper.constructParser(int, ObjectCodec, ByteQuadsCanonicalizer, CharsToNameCanonicalizer, int)>
	//   16   32:areturn         
	}

	protected JsonParser _createParser(Reader reader, IOContext iocontext)
		throws IOException
	{
		return ((JsonParser) (new ReaderBasedJsonParser(iocontext, _parserFeatures, reader, _objectCodec, _rootCharSymbols.makeChild(_factoryFeatures))));
	//    0    0:new             #144 <Class ReaderBasedJsonParser>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #89  <Field int _parserFeatures>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #95  <Field ObjectCodec _objectCodec>
	//    8   14:aload_0         
	//    9   15:getfield        #78  <Field CharsToNameCanonicalizer _rootCharSymbols>
	//   10   18:aload_0         
	//   11   19:getfield        #87  <Field int _factoryFeatures>
	//   12   22:invokevirtual   #148 <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.makeChild(int)>
	//   13   25:invokespecial   #151 <Method void ReaderBasedJsonParser(IOContext, int, Reader, ObjectCodec, CharsToNameCanonicalizer)>
	//   14   28:areturn         
	}

	protected JsonParser _createParser(byte abyte0[], int i, int j, IOContext iocontext)
		throws IOException
	{
		return (new ByteSourceJsonBootstrapper(iocontext, abyte0, i, j)).constructParser(_parserFeatures, _objectCodec, _byteSymbolCanonicalizer, _rootCharSymbols, _factoryFeatures);
	//    0    0:new             #134 <Class ByteSourceJsonBootstrapper>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:invokespecial   #155 <Method void ByteSourceJsonBootstrapper(IOContext, byte[], int, int)>
	//    7   12:aload_0         
	//    8   13:getfield        #89  <Field int _parserFeatures>
	//    9   16:aload_0         
	//   10   17:getfield        #95  <Field ObjectCodec _objectCodec>
	//   11   20:aload_0         
	//   12   21:getfield        #85  <Field ByteQuadsCanonicalizer _byteSymbolCanonicalizer>
	//   13   24:aload_0         
	//   14   25:getfield        #78  <Field CharsToNameCanonicalizer _rootCharSymbols>
	//   15   28:aload_0         
	//   16   29:getfield        #87  <Field int _factoryFeatures>
	//   17   32:invokevirtual   #141 <Method JsonParser ByteSourceJsonBootstrapper.constructParser(int, ObjectCodec, ByteQuadsCanonicalizer, CharsToNameCanonicalizer, int)>
	//   18   35:areturn         
	}

	protected JsonParser _createParser(char ac[], int i, int j, IOContext iocontext, boolean flag)
		throws IOException
	{
		return ((JsonParser) (new ReaderBasedJsonParser(iocontext, _parserFeatures, ((Reader) (null)), _objectCodec, _rootCharSymbols.makeChild(_factoryFeatures), ac, i, i + j, flag)));
	//    0    0:new             #144 <Class ReaderBasedJsonParser>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_0         
	//    4    7:getfield        #89  <Field int _parserFeatures>
	//    5   10:aconst_null     
	//    6   11:aload_0         
	//    7   12:getfield        #95  <Field ObjectCodec _objectCodec>
	//    8   15:aload_0         
	//    9   16:getfield        #78  <Field CharsToNameCanonicalizer _rootCharSymbols>
	//   10   19:aload_0         
	//   11   20:getfield        #87  <Field int _factoryFeatures>
	//   12   23:invokevirtual   #148 <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.makeChild(int)>
	//   13   26:aload_1         
	//   14   27:iload_2         
	//   15   28:iload_2         
	//   16   29:iload_3         
	//   17   30:iadd            
	//   18   31:iload           5
	//   19   33:invokespecial   #159 <Method void ReaderBasedJsonParser(IOContext, int, Reader, ObjectCodec, CharsToNameCanonicalizer, char[], int, int, boolean)>
	//   20   36:areturn         
	}

	protected JsonGenerator _createUTF8Generator(OutputStream outputstream, IOContext iocontext)
		throws IOException
	{
		outputstream = ((OutputStream) (new UTF8JsonGenerator(iocontext, _generatorFeatures, _objectCodec, outputstream)));
	//    0    0:new             #163 <Class UTF8JsonGenerator>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #91  <Field int _generatorFeatures>
	//    5    9:aload_0         
	//    6   10:getfield        #95  <Field ObjectCodec _objectCodec>
	//    7   13:aload_1         
	//    8   14:invokespecial   #166 <Method void UTF8JsonGenerator(IOContext, int, ObjectCodec, OutputStream)>
	//    9   17:astore_1        
		iocontext = ((IOContext) (_characterEscapes));
	//   10   18:aload_0         
	//   11   19:getfield        #97  <Field CharacterEscapes _characterEscapes>
	//   12   22:astore_2        
		if(iocontext != null)
	//*  13   23:aload_2         
	//*  14   24:ifnull          33
			((UTF8JsonGenerator) (outputstream)).setCharacterEscapes(((CharacterEscapes) (iocontext)));
	//   15   27:aload_1         
	//   16   28:aload_2         
	//   17   29:invokevirtual   #167 <Method JsonGenerator UTF8JsonGenerator.setCharacterEscapes(CharacterEscapes)>
	//   18   32:pop             
		iocontext = ((IOContext) (_rootValueSeparator));
	//   19   33:aload_0         
	//   20   34:getfield        #93  <Field SerializableString _rootValueSeparator>
	//   21   37:astore_2        
		if(iocontext != DEFAULT_ROOT_VALUE_SEPARATOR)
	//*  22   38:aload_2         
	//*  23   39:getstatic       #62  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//*  24   42:if_acmpeq       51
			((UTF8JsonGenerator) (outputstream)).setRootValueSeparator(((SerializableString) (iocontext)));
	//   25   45:aload_1         
	//   26   46:aload_2         
	//   27   47:invokevirtual   #168 <Method JsonGenerator UTF8JsonGenerator.setRootValueSeparator(SerializableString)>
	//   28   50:pop             
		return ((JsonGenerator) (outputstream));
	//   29   51:aload_1         
	//   30   52:areturn         
	}

	protected Writer _createWriter(OutputStream outputstream, JsonEncoding jsonencoding, IOContext iocontext)
		throws IOException
	{
		if(jsonencoding == JsonEncoding.UTF8)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #176 <Field JsonEncoding JsonEncoding.UTF8>
	//*   2    4:if_acmpne       17
			return ((Writer) (new UTF8Writer(iocontext, outputstream)));
	//    3    7:new             #178 <Class UTF8Writer>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokespecial   #181 <Method void UTF8Writer(IOContext, OutputStream)>
	//    8   16:areturn         
		else
			return ((Writer) (new OutputStreamWriter(outputstream, jsonencoding.getJavaName())));
	//    9   17:new             #183 <Class OutputStreamWriter>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #187 <Method String JsonEncoding.getJavaName()>
	//   14   26:invokespecial   #190 <Method void OutputStreamWriter(OutputStream, String)>
	//   15   29:areturn         
	}

	protected final InputStream _decorate(InputStream inputstream, IOContext iocontext)
		throws IOException
	{
		InputDecorator inputdecorator = _inputDecorator;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field InputDecorator _inputDecorator>
	//    2    4:astore_3        
		if(inputdecorator != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          22
		{
			iocontext = ((IOContext) (inputdecorator.decorate(iocontext, inputstream)));
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #198 <Method InputStream InputDecorator.decorate(IOContext, InputStream)>
	//    9   15:astore_2        
			if(iocontext != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          22
				return ((InputStream) (iocontext));
	//   12   20:aload_2         
	//   13   21:areturn         
		}
		return inputstream;
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	protected final OutputStream _decorate(OutputStream outputstream, IOContext iocontext)
		throws IOException
	{
		OutputDecorator outputdecorator = _outputDecorator;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field OutputDecorator _outputDecorator>
	//    2    4:astore_3        
		if(outputdecorator != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          22
		{
			iocontext = ((IOContext) (outputdecorator.decorate(iocontext, outputstream)));
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #204 <Method OutputStream OutputDecorator.decorate(IOContext, OutputStream)>
	//    9   15:astore_2        
			if(iocontext != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          22
				return ((OutputStream) (iocontext));
	//   12   20:aload_2         
	//   13   21:areturn         
		}
		return outputstream;
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	protected final Reader _decorate(Reader reader, IOContext iocontext)
		throws IOException
	{
		InputDecorator inputdecorator = _inputDecorator;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field InputDecorator _inputDecorator>
	//    2    4:astore_3        
		if(inputdecorator != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          22
		{
			iocontext = ((IOContext) (inputdecorator.decorate(iocontext, reader)));
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #208 <Method Reader InputDecorator.decorate(IOContext, Reader)>
	//    9   15:astore_2        
			if(iocontext != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          22
				return ((Reader) (iocontext));
	//   12   20:aload_2         
	//   13   21:areturn         
		}
		return reader;
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	protected final Writer _decorate(Writer writer, IOContext iocontext)
		throws IOException
	{
		OutputDecorator outputdecorator = _outputDecorator;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field OutputDecorator _outputDecorator>
	//    2    4:astore_3        
		if(outputdecorator != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          22
		{
			iocontext = ((IOContext) (outputdecorator.decorate(iocontext, writer)));
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #212 <Method Writer OutputDecorator.decorate(IOContext, Writer)>
	//    9   15:astore_2        
			if(iocontext != null)
	//*  10   16:aload_2         
	//*  11   17:ifnull          22
				return ((Writer) (iocontext));
	//   12   20:aload_2         
	//   13   21:areturn         
		}
		return writer;
	//   14   22:aload_1         
	//   15   23:areturn         
	}

	public BufferRecycler _getBufferRecycler()
	{
		if(Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.enabledIn(_factoryFeatures))
	//*   0    0:getstatic       #216 <Field JsonFactory$Feature JsonFactory$Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING>
	//*   1    3:aload_0         
	//*   2    4:getfield        #87  <Field int _factoryFeatures>
	//*   3    7:invokevirtual   #220 <Method boolean JsonFactory$Feature.enabledIn(int)>
	//*   4   10:ifeq            17
			return BufferRecyclers.getBufferRecycler();
	//    5   13:invokestatic    #225 <Method BufferRecycler BufferRecyclers.getBufferRecycler()>
	//    6   16:areturn         
		else
			return new BufferRecycler();
	//    7   17:new             #227 <Class BufferRecycler>
	//    8   20:dup             
	//    9   21:invokespecial   #228 <Method void BufferRecycler()>
	//   10   24:areturn         
	}

	public boolean canUseCharArrays()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public JsonGenerator createGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
		throws IOException
	{
		IOContext iocontext = _createContext(((Object) (outputstream)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #234 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_3        
		iocontext.setEncoding(jsonencoding);
	//    5    7:aload_3         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #238 <Method void IOContext.setEncoding(JsonEncoding)>
		if(jsonencoding == JsonEncoding.UTF8)
	//*   8   12:aload_2         
	//*   9   13:getstatic       #176 <Field JsonEncoding JsonEncoding.UTF8>
	//*  10   16:if_acmpne       31
			return _createUTF8Generator(_decorate(outputstream, iocontext), iocontext);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_3         
	//   15   23:invokevirtual   #240 <Method OutputStream _decorate(OutputStream, IOContext)>
	//   16   26:aload_3         
	//   17   27:invokevirtual   #242 <Method JsonGenerator _createUTF8Generator(OutputStream, IOContext)>
	//   18   30:areturn         
		else
			return _createGenerator(_decorate(_createWriter(outputstream, jsonencoding, iocontext), iocontext), iocontext);
	//   19   31:aload_0         
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:aload_1         
	//   23   35:aload_2         
	//   24   36:aload_3         
	//   25   37:invokevirtual   #244 <Method Writer _createWriter(OutputStream, JsonEncoding, IOContext)>
	//   26   40:aload_3         
	//   27   41:invokevirtual   #246 <Method Writer _decorate(Writer, IOContext)>
	//   28   44:aload_3         
	//   29   45:invokevirtual   #248 <Method JsonGenerator _createGenerator(Writer, IOContext)>
	//   30   48:areturn         
	}

	public JsonGenerator createGenerator(Writer writer)
		throws IOException
	{
		IOContext iocontext = _createContext(((Object) (writer)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #234 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		return _createGenerator(_decorate(writer, iocontext), iocontext);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokevirtual   #246 <Method Writer _decorate(Writer, IOContext)>
	//   10   14:aload_2         
	//   11   15:invokevirtual   #248 <Method JsonGenerator _createGenerator(Writer, IOContext)>
	//   12   18:areturn         
	}

	public JsonParser createParser(InputStream inputstream)
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (inputstream)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #234 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		return _createParser(_decorate(inputstream, iocontext), iocontext);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokevirtual   #255 <Method InputStream _decorate(InputStream, IOContext)>
	//   10   14:aload_2         
	//   11   15:invokevirtual   #257 <Method JsonParser _createParser(InputStream, IOContext)>
	//   12   18:areturn         
	}

	public JsonParser createParser(Reader reader)
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (reader)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #234 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		return _createParser(_decorate(reader, iocontext), iocontext);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokevirtual   #260 <Method Reader _decorate(Reader, IOContext)>
	//   10   14:aload_2         
	//   11   15:invokevirtual   #262 <Method JsonParser _createParser(Reader, IOContext)>
	//   12   18:areturn         
	}

	public JsonParser createParser(String s)
		throws IOException, JsonParseException
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #268 <Method int String.length()>
	//    2    4:istore_2        
		if(_inputDecorator == null && i <= 32768 && canUseCharArrays())
	//*   3    5:aload_0         
	//*   4    6:getfield        #99  <Field InputDecorator _inputDecorator>
	//*   5    9:ifnonnull       63
	//*   6   12:iload_2         
	//*   7   13:ldc2            #269 <Int 32768>
	//*   8   16:icmpgt          63
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #271 <Method boolean canUseCharArrays()>
	//*  11   23:ifne            29
	//*  12   26:goto            63
		{
			IOContext iocontext = _createContext(((Object) (s)), true);
	//   13   29:aload_0         
	//   14   30:aload_1         
	//   15   31:iconst_1        
	//   16   32:invokevirtual   #234 <Method IOContext _createContext(Object, boolean)>
	//   17   35:astore_3        
			char ac[] = iocontext.allocTokenBuffer(i);
	//   18   36:aload_3         
	//   19   37:iload_2         
	//   20   38:invokevirtual   #275 <Method char[] IOContext.allocTokenBuffer(int)>
	//   21   41:astore          4
			s.getChars(0, i, ac, 0);
	//   22   43:aload_1         
	//   23   44:iconst_0        
	//   24   45:iload_2         
	//   25   46:aload           4
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #279 <Method void String.getChars(int, int, char[], int)>
			return _createParser(ac, 0, i, iocontext, true);
	//   28   52:aload_0         
	//   29   53:aload           4
	//   30   55:iconst_0        
	//   31   56:iload_2         
	//   32   57:aload_3         
	//   33   58:iconst_1        
	//   34   59:invokevirtual   #281 <Method JsonParser _createParser(char[], int, int, IOContext, boolean)>
	//   35   62:areturn         
		} else
		{
			return createParser(((Reader) (new StringReader(s))));
	//   36   63:aload_0         
	//   37   64:new             #283 <Class StringReader>
	//   38   67:dup             
	//   39   68:aload_1         
	//   40   69:invokespecial   #286 <Method void StringReader(String)>
	//   41   72:invokevirtual   #288 <Method JsonParser createParser(Reader)>
	//   42   75:areturn         
		}
	}

	public JsonParser createParser(byte abyte0[])
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (abyte0)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #234 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		Object obj = ((Object) (_inputDecorator));
	//    5    7:aload_0         
	//    6    8:getfield        #99  <Field InputDecorator _inputDecorator>
	//    7   11:astore_3        
		if(obj != null)
	//*   8   12:aload_3         
	//*   9   13:ifnull          37
		{
			obj = ((Object) (((InputDecorator) (obj)).decorate(iocontext, abyte0, 0, abyte0.length)));
	//   10   16:aload_3         
	//   11   17:aload_2         
	//   12   18:aload_1         
	//   13   19:iconst_0        
	//   14   20:aload_1         
	//   15   21:arraylength     
	//   16   22:invokevirtual   #292 <Method InputStream InputDecorator.decorate(IOContext, byte[], int, int)>
	//   17   25:astore_3        
			if(obj != null)
	//*  18   26:aload_3         
	//*  19   27:ifnull          37
				return _createParser(((InputStream) (obj)), iocontext);
	//   20   30:aload_0         
	//   21   31:aload_3         
	//   22   32:aload_2         
	//   23   33:invokevirtual   #257 <Method JsonParser _createParser(InputStream, IOContext)>
	//   24   36:areturn         
		}
		return _createParser(abyte0, 0, abyte0.length, iocontext);
	//   25   37:aload_0         
	//   26   38:aload_1         
	//   27   39:iconst_0        
	//   28   40:aload_1         
	//   29   41:arraylength     
	//   30   42:aload_2         
	//   31   43:invokevirtual   #294 <Method JsonParser _createParser(byte[], int, int, IOContext)>
	//   32   46:areturn         
	}

	public JsonParser createParser(byte abyte0[], int i, int j)
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (abyte0)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #234 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore          4
		Object obj = ((Object) (_inputDecorator));
	//    5    8:aload_0         
	//    6    9:getfield        #99  <Field InputDecorator _inputDecorator>
	//    7   12:astore          5
		if(obj != null)
	//*   8   14:aload           5
	//*   9   16:ifnull          45
		{
			obj = ((Object) (((InputDecorator) (obj)).decorate(iocontext, abyte0, i, j)));
	//   10   19:aload           5
	//   11   21:aload           4
	//   12   23:aload_1         
	//   13   24:iload_2         
	//   14   25:iload_3         
	//   15   26:invokevirtual   #292 <Method InputStream InputDecorator.decorate(IOContext, byte[], int, int)>
	//   16   29:astore          5
			if(obj != null)
	//*  17   31:aload           5
	//*  18   33:ifnull          45
				return _createParser(((InputStream) (obj)), iocontext);
	//   19   36:aload_0         
	//   20   37:aload           5
	//   21   39:aload           4
	//   22   41:invokevirtual   #257 <Method JsonParser _createParser(InputStream, IOContext)>
	//   23   44:areturn         
		}
		return _createParser(abyte0, i, j, iocontext);
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:iload_2         
	//   27   48:iload_3         
	//   28   49:aload           4
	//   29   51:invokevirtual   #294 <Method JsonParser _createParser(byte[], int, int, IOContext)>
	//   30   54:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public String getFormatName()
	{
		if(((Object)this).getClass() == com/fasterxml/jackson/core/JsonFactory)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #302 <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class JsonFactory>
	//*   3    6:if_acmpne       13
			return "JSON";
	//    4    9:ldc2            #304 <String "JSON">
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	public MatchStrength hasFormat(InputAccessor inputaccessor)
		throws IOException
	{
		if(((Object)this).getClass() == com/fasterxml/jackson/core/JsonFactory)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #302 <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class JsonFactory>
	//*   3    6:if_acmpne       15
			return hasJSONFormat(inputaccessor);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #309 <Method MatchStrength hasJSONFormat(InputAccessor)>
	//    7   14:areturn         
		else
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
	}

	protected MatchStrength hasJSONFormat(InputAccessor inputaccessor)
		throws IOException
	{
		return ByteSourceJsonBootstrapper.hasJSONFormat(inputaccessor);
	//    0    0:aload_1         
	//    1    1:invokestatic    #310 <Method MatchStrength ByteSourceJsonBootstrapper.hasJSONFormat(InputAccessor)>
	//    2    4:areturn         
	}

	public final boolean isEnabled(Feature feature)
	{
		int i = _factoryFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field int _factoryFeatures>
	//    2    4:istore_2        
		return (feature.getMask() & i) != 0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #315 <Method int JsonFactory$Feature.getMask()>
	//    5    9:iload_2         
	//    6   10:iand            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public final boolean isEnabled(JsonGenerator.Feature feature)
	{
		int i = _generatorFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #91  <Field int _generatorFeatures>
	//    2    4:istore_2        
		return (feature.getMask() & i) != 0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #317 <Method int JsonGenerator$Feature.getMask()>
	//    5    9:iload_2         
	//    6   10:iand            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public final boolean isEnabled(JsonParser.Feature feature)
	{
		int i = _parserFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field int _parserFeatures>
	//    2    4:istore_2        
		return (feature.getMask() & i) != 0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #319 <Method int JsonParser$Feature.getMask()>
	//    5    9:iload_2         
	//    6   10:iand            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	protected Object readResolve()
	{
		return ((Object) (new JsonFactory(this, _objectCodec)));
	//    0    0:new             #2   <Class JsonFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #95  <Field ObjectCodec _objectCodec>
	//    5    9:invokespecial   #323 <Method void JsonFactory(JsonFactory, ObjectCodec)>
	//    6   12:areturn         
	}

	public boolean requiresPropertyOrdering()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JsonFactory setCodec(ObjectCodec objectcodec)
	{
		_objectCodec = objectcodec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #95  <Field ObjectCodec _objectCodec>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #334 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
	protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
	protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
	private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR;
	private static final long serialVersionUID = 1L;
	protected final transient ByteQuadsCanonicalizer _byteSymbolCanonicalizer;
	protected CharacterEscapes _characterEscapes;
	protected int _factoryFeatures;
	protected int _generatorFeatures;
	protected InputDecorator _inputDecorator;
	protected ObjectCodec _objectCodec;
	protected OutputDecorator _outputDecorator;
	protected int _parserFeatures;
	protected final transient CharsToNameCanonicalizer _rootCharSymbols;
	protected SerializableString _rootValueSeparator;

	static 
	{
	//    0    0:invokestatic    #43  <Method int JsonFactory$Feature.collectDefaults()>
	//    1    3:putstatic       #45  <Field int DEFAULT_FACTORY_FEATURE_FLAGS>
	//    2    6:invokestatic    #48  <Method int JsonParser$Feature.collectDefaults()>
	//    3    9:putstatic       #50  <Field int DEFAULT_PARSER_FEATURE_FLAGS>
	//    4   12:invokestatic    #53  <Method int JsonGenerator$Feature.collectDefaults()>
	//    5   15:putstatic       #55  <Field int DEFAULT_GENERATOR_FEATURE_FLAGS>
		DEFAULT_ROOT_VALUE_SEPARATOR = ((SerializableString) (DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
	//    6   18:getstatic       #60  <Field com.fasterxml.jackson.core.io.SerializedString DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR>
	//    7   21:putstatic       #62  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//*   8   24:return          
	}
}
