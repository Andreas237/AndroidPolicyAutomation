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
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.core.io.UTF8Writer;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.fasterxml.jackson.core.json.PackageVersion;
import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.core.json.UTF8JsonGenerator;
import com.fasterxml.jackson.core.json.WriterBasedJsonGenerator;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.*;
import java.lang.ref.SoftReference;
import java.net.URL;

// Referenced classes of package com.fasterxml.jackson.core:
//			Versioned, JsonEncoding, FormatSchema, JsonParseException, 
//			SerializableString, ObjectCodec, JsonGenerator, JsonParser, 
//			Version

public class JsonFactory
	implements Versioned, Serializable
{
	public static final class Feature extends Enum
	{

		public static int collectDefaults()
		{
			int j = 0;
		//    0    0:iconst_0        
		//    1    1:istore_1        
			Feature afeature[] = values();
		//    2    2:invokestatic    #51  <Method JsonFactory$Feature[] values()>
		//    3    5:astore          4
			int l = afeature.length;
		//    4    7:aload           4
		//    5    9:arraylength     
		//    6   10:istore_3        
			for(int i = 0; i < l;)
		//*   7   11:iconst_0        
		//*   8   12:istore_0        
		//*   9   13:iload_0         
		//*  10   14:iload_3         
		//*  11   15:icmpge          51
			{
				Feature feature = afeature[i];
		//   12   18:aload           4
		//   13   20:iload_0         
		//   14   21:aaload          
		//   15   22:astore          5
				int k = j;
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
				j = k;
		//   30   46:iload_2         
		//   31   47:istore_1        
			}

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
			return (getMask() & i) != 0;
		//    0    0:aload_0         
		//    1    1:invokevirtual   #58  <Method int getMask()>
		//    2    4:iload_1         
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
	//    2    2:invokespecial   #80  <Method void JsonFactory(ObjectCodec)>
	//    3    5:return          
	}

	protected JsonFactory(JsonFactory jsonfactory, ObjectCodec objectcodec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		_rootCharSymbols = CharsToNameCanonicalizer.createRoot();
	//    2    4:aload_0         
	//    3    5:invokestatic    #88  <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.createRoot()>
	//    4    8:putfield        #90  <Field CharsToNameCanonicalizer _rootCharSymbols>
		_byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
	//    5   11:aload_0         
	//    6   12:invokestatic    #95  <Method ByteQuadsCanonicalizer ByteQuadsCanonicalizer.createRoot()>
	//    7   15:putfield        #97  <Field ByteQuadsCanonicalizer _byteSymbolCanonicalizer>
		_factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
	//    8   18:aload_0         
	//    9   19:getstatic       #52  <Field int DEFAULT_FACTORY_FEATURE_FLAGS>
	//   10   22:putfield        #99  <Field int _factoryFeatures>
		_parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
	//   11   25:aload_0         
	//   12   26:getstatic       #57  <Field int DEFAULT_PARSER_FEATURE_FLAGS>
	//   13   29:putfield        #101 <Field int _parserFeatures>
		_generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
	//   14   32:aload_0         
	//   15   33:getstatic       #62  <Field int DEFAULT_GENERATOR_FEATURE_FLAGS>
	//   16   36:putfield        #103 <Field int _generatorFeatures>
		_rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
	//   17   39:aload_0         
	//   18   40:getstatic       #69  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//   19   43:putfield        #105 <Field SerializableString _rootValueSeparator>
		_objectCodec = null;
	//   20   46:aload_0         
	//   21   47:aconst_null     
	//   22   48:putfield        #107 <Field ObjectCodec _objectCodec>
		_factoryFeatures = jsonfactory._factoryFeatures;
	//   23   51:aload_0         
	//   24   52:aload_1         
	//   25   53:getfield        #99  <Field int _factoryFeatures>
	//   26   56:putfield        #99  <Field int _factoryFeatures>
		_parserFeatures = jsonfactory._parserFeatures;
	//   27   59:aload_0         
	//   28   60:aload_1         
	//   29   61:getfield        #101 <Field int _parserFeatures>
	//   30   64:putfield        #101 <Field int _parserFeatures>
		_generatorFeatures = jsonfactory._generatorFeatures;
	//   31   67:aload_0         
	//   32   68:aload_1         
	//   33   69:getfield        #103 <Field int _generatorFeatures>
	//   34   72:putfield        #103 <Field int _generatorFeatures>
		_characterEscapes = jsonfactory._characterEscapes;
	//   35   75:aload_0         
	//   36   76:aload_1         
	//   37   77:getfield        #109 <Field CharacterEscapes _characterEscapes>
	//   38   80:putfield        #109 <Field CharacterEscapes _characterEscapes>
		_inputDecorator = jsonfactory._inputDecorator;
	//   39   83:aload_0         
	//   40   84:aload_1         
	//   41   85:getfield        #111 <Field InputDecorator _inputDecorator>
	//   42   88:putfield        #111 <Field InputDecorator _inputDecorator>
		_outputDecorator = jsonfactory._outputDecorator;
	//   43   91:aload_0         
	//   44   92:aload_1         
	//   45   93:getfield        #113 <Field OutputDecorator _outputDecorator>
	//   46   96:putfield        #113 <Field OutputDecorator _outputDecorator>
		_rootValueSeparator = jsonfactory._rootValueSeparator;
	//   47   99:aload_0         
	//   48  100:aload_1         
	//   49  101:getfield        #105 <Field SerializableString _rootValueSeparator>
	//   50  104:putfield        #105 <Field SerializableString _rootValueSeparator>
	//   51  107:return          
	}

	public JsonFactory(ObjectCodec objectcodec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method void Object()>
		_rootCharSymbols = CharsToNameCanonicalizer.createRoot();
	//    2    4:aload_0         
	//    3    5:invokestatic    #88  <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.createRoot()>
	//    4    8:putfield        #90  <Field CharsToNameCanonicalizer _rootCharSymbols>
		_byteSymbolCanonicalizer = ByteQuadsCanonicalizer.createRoot();
	//    5   11:aload_0         
	//    6   12:invokestatic    #95  <Method ByteQuadsCanonicalizer ByteQuadsCanonicalizer.createRoot()>
	//    7   15:putfield        #97  <Field ByteQuadsCanonicalizer _byteSymbolCanonicalizer>
		_factoryFeatures = DEFAULT_FACTORY_FEATURE_FLAGS;
	//    8   18:aload_0         
	//    9   19:getstatic       #52  <Field int DEFAULT_FACTORY_FEATURE_FLAGS>
	//   10   22:putfield        #99  <Field int _factoryFeatures>
		_parserFeatures = DEFAULT_PARSER_FEATURE_FLAGS;
	//   11   25:aload_0         
	//   12   26:getstatic       #57  <Field int DEFAULT_PARSER_FEATURE_FLAGS>
	//   13   29:putfield        #101 <Field int _parserFeatures>
		_generatorFeatures = DEFAULT_GENERATOR_FEATURE_FLAGS;
	//   14   32:aload_0         
	//   15   33:getstatic       #62  <Field int DEFAULT_GENERATOR_FEATURE_FLAGS>
	//   16   36:putfield        #103 <Field int _generatorFeatures>
		_rootValueSeparator = DEFAULT_ROOT_VALUE_SEPARATOR;
	//   17   39:aload_0         
	//   18   40:getstatic       #69  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//   19   43:putfield        #105 <Field SerializableString _rootValueSeparator>
		_objectCodec = objectcodec;
	//   20   46:aload_0         
	//   21   47:aload_1         
	//   22   48:putfield        #107 <Field ObjectCodec _objectCodec>
	//   23   51:return          
	}

	protected void _checkInvalidCopy(Class class1)
	{
		if(((Object)this).getClass() != class1)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #119 <Method Class Object.getClass()>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       58
			throw new IllegalStateException((new StringBuilder()).append("Failed copy(): ").append(((Object)this).getClass().getName()).append(" (version: ").append(((Object) (version()))).append(") does not override copy(); it has to").toString());
	//    4    8:new             #121 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:new             #123 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #124 <Method void StringBuilder()>
	//    9   19:ldc1            #126 <String "Failed copy(): ">
	//   10   21:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   11   24:aload_0         
	//   12   25:invokevirtual   #119 <Method Class Object.getClass()>
	//   13   28:invokevirtual   #136 <Method String Class.getName()>
	//   14   31:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   15   34:ldc1            #138 <String " (version: ">
	//   16   36:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:aload_0         
	//   18   40:invokevirtual   #142 <Method Version version()>
	//   19   43:invokevirtual   #145 <Method StringBuilder StringBuilder.append(Object)>
	//   20   46:ldc1            #147 <String ") does not override copy(); it has to">
	//   21   48:invokevirtual   #130 <Method StringBuilder StringBuilder.append(String)>
	//   22   51:invokevirtual   #150 <Method String StringBuilder.toString()>
	//   23   54:invokespecial   #153 <Method void IllegalStateException(String)>
	//   24   57:athrow          
		else
			return;
	//   25   58:return          
	}

	protected IOContext _createContext(Object obj, boolean flag)
	{
		return new IOContext(_getBufferRecycler(), obj, flag);
	//    0    0:new             #159 <Class IOContext>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #163 <Method BufferRecycler _getBufferRecycler()>
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #166 <Method void IOContext(BufferRecycler, Object, boolean)>
	//    7   13:areturn         
	}

	protected JsonGenerator _createGenerator(Writer writer, IOContext iocontext)
		throws IOException
	{
		writer = ((Writer) (new WriterBasedJsonGenerator(iocontext, _generatorFeatures, _objectCodec, writer)));
	//    0    0:new             #172 <Class WriterBasedJsonGenerator>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #103 <Field int _generatorFeatures>
	//    5    9:aload_0         
	//    6   10:getfield        #107 <Field ObjectCodec _objectCodec>
	//    7   13:aload_1         
	//    8   14:invokespecial   #175 <Method void WriterBasedJsonGenerator(IOContext, int, ObjectCodec, Writer)>
	//    9   17:astore_1        
		if(_characterEscapes != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #109 <Field CharacterEscapes _characterEscapes>
	//*  12   22:ifnull          34
			((WriterBasedJsonGenerator) (writer)).setCharacterEscapes(_characterEscapes);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #109 <Field CharacterEscapes _characterEscapes>
	//   16   30:invokevirtual   #179 <Method JsonGenerator WriterBasedJsonGenerator.setCharacterEscapes(CharacterEscapes)>
	//   17   33:pop             
		iocontext = ((IOContext) (_rootValueSeparator));
	//   18   34:aload_0         
	//   19   35:getfield        #105 <Field SerializableString _rootValueSeparator>
	//   20   38:astore_2        
		if(iocontext != DEFAULT_ROOT_VALUE_SEPARATOR)
	//*  21   39:aload_2         
	//*  22   40:getstatic       #69  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//*  23   43:if_acmpeq       52
			((WriterBasedJsonGenerator) (writer)).setRootValueSeparator(((SerializableString) (iocontext)));
	//   24   46:aload_1         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #183 <Method JsonGenerator WriterBasedJsonGenerator.setRootValueSeparator(SerializableString)>
	//   27   51:pop             
		return ((JsonGenerator) (writer));
	//   28   52:aload_1         
	//   29   53:areturn         
	}

	protected JsonParser _createParser(InputStream inputstream, IOContext iocontext)
		throws IOException
	{
		return (new ByteSourceJsonBootstrapper(iocontext, inputstream)).constructParser(_parserFeatures, _objectCodec, _byteSymbolCanonicalizer, _rootCharSymbols, _factoryFeatures);
	//    0    0:new             #188 <Class ByteSourceJsonBootstrapper>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_1         
	//    4    6:invokespecial   #191 <Method void ByteSourceJsonBootstrapper(IOContext, InputStream)>
	//    5    9:aload_0         
	//    6   10:getfield        #101 <Field int _parserFeatures>
	//    7   13:aload_0         
	//    8   14:getfield        #107 <Field ObjectCodec _objectCodec>
	//    9   17:aload_0         
	//   10   18:getfield        #97  <Field ByteQuadsCanonicalizer _byteSymbolCanonicalizer>
	//   11   21:aload_0         
	//   12   22:getfield        #90  <Field CharsToNameCanonicalizer _rootCharSymbols>
	//   13   25:aload_0         
	//   14   26:getfield        #99  <Field int _factoryFeatures>
	//   15   29:invokevirtual   #195 <Method JsonParser ByteSourceJsonBootstrapper.constructParser(int, ObjectCodec, ByteQuadsCanonicalizer, CharsToNameCanonicalizer, int)>
	//   16   32:areturn         
	}

	protected JsonParser _createParser(Reader reader, IOContext iocontext)
		throws IOException
	{
		return ((JsonParser) (new ReaderBasedJsonParser(iocontext, _parserFeatures, reader, _objectCodec, _rootCharSymbols.makeChild(_factoryFeatures))));
	//    0    0:new             #198 <Class ReaderBasedJsonParser>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #101 <Field int _parserFeatures>
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #107 <Field ObjectCodec _objectCodec>
	//    8   14:aload_0         
	//    9   15:getfield        #90  <Field CharsToNameCanonicalizer _rootCharSymbols>
	//   10   18:aload_0         
	//   11   19:getfield        #99  <Field int _factoryFeatures>
	//   12   22:invokevirtual   #202 <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.makeChild(int)>
	//   13   25:invokespecial   #205 <Method void ReaderBasedJsonParser(IOContext, int, Reader, ObjectCodec, CharsToNameCanonicalizer)>
	//   14   28:areturn         
	}

	protected JsonParser _createParser(byte abyte0[], int i, int j, IOContext iocontext)
		throws IOException
	{
		return (new ByteSourceJsonBootstrapper(iocontext, abyte0, i, j)).constructParser(_parserFeatures, _objectCodec, _byteSymbolCanonicalizer, _rootCharSymbols, _factoryFeatures);
	//    0    0:new             #188 <Class ByteSourceJsonBootstrapper>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_1         
	//    4    7:iload_2         
	//    5    8:iload_3         
	//    6    9:invokespecial   #209 <Method void ByteSourceJsonBootstrapper(IOContext, byte[], int, int)>
	//    7   12:aload_0         
	//    8   13:getfield        #101 <Field int _parserFeatures>
	//    9   16:aload_0         
	//   10   17:getfield        #107 <Field ObjectCodec _objectCodec>
	//   11   20:aload_0         
	//   12   21:getfield        #97  <Field ByteQuadsCanonicalizer _byteSymbolCanonicalizer>
	//   13   24:aload_0         
	//   14   25:getfield        #90  <Field CharsToNameCanonicalizer _rootCharSymbols>
	//   15   28:aload_0         
	//   16   29:getfield        #99  <Field int _factoryFeatures>
	//   17   32:invokevirtual   #195 <Method JsonParser ByteSourceJsonBootstrapper.constructParser(int, ObjectCodec, ByteQuadsCanonicalizer, CharsToNameCanonicalizer, int)>
	//   18   35:areturn         
	}

	protected JsonParser _createParser(char ac[], int i, int j, IOContext iocontext, boolean flag)
		throws IOException
	{
		return ((JsonParser) (new ReaderBasedJsonParser(iocontext, _parserFeatures, ((Reader) (null)), _objectCodec, _rootCharSymbols.makeChild(_factoryFeatures), ac, i, i + j, flag)));
	//    0    0:new             #198 <Class ReaderBasedJsonParser>
	//    1    3:dup             
	//    2    4:aload           4
	//    3    6:aload_0         
	//    4    7:getfield        #101 <Field int _parserFeatures>
	//    5   10:aconst_null     
	//    6   11:aload_0         
	//    7   12:getfield        #107 <Field ObjectCodec _objectCodec>
	//    8   15:aload_0         
	//    9   16:getfield        #90  <Field CharsToNameCanonicalizer _rootCharSymbols>
	//   10   19:aload_0         
	//   11   20:getfield        #99  <Field int _factoryFeatures>
	//   12   23:invokevirtual   #202 <Method CharsToNameCanonicalizer CharsToNameCanonicalizer.makeChild(int)>
	//   13   26:aload_1         
	//   14   27:iload_2         
	//   15   28:iload_2         
	//   16   29:iload_3         
	//   17   30:iadd            
	//   18   31:iload           5
	//   19   33:invokespecial   #213 <Method void ReaderBasedJsonParser(IOContext, int, Reader, ObjectCodec, CharsToNameCanonicalizer, char[], int, int, boolean)>
	//   20   36:areturn         
	}

	protected JsonGenerator _createUTF8Generator(OutputStream outputstream, IOContext iocontext)
		throws IOException
	{
		outputstream = ((OutputStream) (new UTF8JsonGenerator(iocontext, _generatorFeatures, _objectCodec, outputstream)));
	//    0    0:new             #217 <Class UTF8JsonGenerator>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:aload_0         
	//    4    6:getfield        #103 <Field int _generatorFeatures>
	//    5    9:aload_0         
	//    6   10:getfield        #107 <Field ObjectCodec _objectCodec>
	//    7   13:aload_1         
	//    8   14:invokespecial   #220 <Method void UTF8JsonGenerator(IOContext, int, ObjectCodec, OutputStream)>
	//    9   17:astore_1        
		if(_characterEscapes != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #109 <Field CharacterEscapes _characterEscapes>
	//*  12   22:ifnull          34
			((UTF8JsonGenerator) (outputstream)).setCharacterEscapes(_characterEscapes);
	//   13   25:aload_1         
	//   14   26:aload_0         
	//   15   27:getfield        #109 <Field CharacterEscapes _characterEscapes>
	//   16   30:invokevirtual   #221 <Method JsonGenerator UTF8JsonGenerator.setCharacterEscapes(CharacterEscapes)>
	//   17   33:pop             
		iocontext = ((IOContext) (_rootValueSeparator));
	//   18   34:aload_0         
	//   19   35:getfield        #105 <Field SerializableString _rootValueSeparator>
	//   20   38:astore_2        
		if(iocontext != DEFAULT_ROOT_VALUE_SEPARATOR)
	//*  21   39:aload_2         
	//*  22   40:getstatic       #69  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//*  23   43:if_acmpeq       52
			((UTF8JsonGenerator) (outputstream)).setRootValueSeparator(((SerializableString) (iocontext)));
	//   24   46:aload_1         
	//   25   47:aload_2         
	//   26   48:invokevirtual   #222 <Method JsonGenerator UTF8JsonGenerator.setRootValueSeparator(SerializableString)>
	//   27   51:pop             
		return ((JsonGenerator) (outputstream));
	//   28   52:aload_1         
	//   29   53:areturn         
	}

	protected Writer _createWriter(OutputStream outputstream, JsonEncoding jsonencoding, IOContext iocontext)
		throws IOException
	{
		if(jsonencoding == JsonEncoding.UTF8)
	//*   0    0:aload_2         
	//*   1    1:getstatic       #230 <Field JsonEncoding JsonEncoding.UTF8>
	//*   2    4:if_acmpne       17
			return ((Writer) (new UTF8Writer(iocontext, outputstream)));
	//    3    7:new             #232 <Class UTF8Writer>
	//    4   10:dup             
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokespecial   #235 <Method void UTF8Writer(IOContext, OutputStream)>
	//    8   16:areturn         
		else
			return ((Writer) (new OutputStreamWriter(outputstream, jsonencoding.getJavaName())));
	//    9   17:new             #237 <Class OutputStreamWriter>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokevirtual   #240 <Method String JsonEncoding.getJavaName()>
	//   14   26:invokespecial   #243 <Method void OutputStreamWriter(OutputStream, String)>
	//   15   29:areturn         
	}

	protected final InputStream _decorate(InputStream inputstream, IOContext iocontext)
		throws IOException
	{
		if(_inputDecorator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field InputDecorator _inputDecorator>
	//*   2    4:ifnull          23
		{
			iocontext = ((IOContext) (_inputDecorator.decorate(iocontext, inputstream)));
	//    3    7:aload_0         
	//    4    8:getfield        #111 <Field InputDecorator _inputDecorator>
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #251 <Method InputStream InputDecorator.decorate(IOContext, InputStream)>
	//    8   16:astore_2        
			if(iocontext != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          23
				return ((InputStream) (iocontext));
	//   11   21:aload_2         
	//   12   22:areturn         
		}
		return inputstream;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	protected final OutputStream _decorate(OutputStream outputstream, IOContext iocontext)
		throws IOException
	{
		if(_outputDecorator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field OutputDecorator _outputDecorator>
	//*   2    4:ifnull          23
		{
			iocontext = ((IOContext) (_outputDecorator.decorate(iocontext, outputstream)));
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field OutputDecorator _outputDecorator>
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #257 <Method OutputStream OutputDecorator.decorate(IOContext, OutputStream)>
	//    8   16:astore_2        
			if(iocontext != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          23
				return ((OutputStream) (iocontext));
	//   11   21:aload_2         
	//   12   22:areturn         
		}
		return outputstream;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	protected final Reader _decorate(Reader reader, IOContext iocontext)
		throws IOException
	{
		if(_inputDecorator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field InputDecorator _inputDecorator>
	//*   2    4:ifnull          23
		{
			iocontext = ((IOContext) (_inputDecorator.decorate(iocontext, reader)));
	//    3    7:aload_0         
	//    4    8:getfield        #111 <Field InputDecorator _inputDecorator>
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #261 <Method Reader InputDecorator.decorate(IOContext, Reader)>
	//    8   16:astore_2        
			if(iocontext != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          23
				return ((Reader) (iocontext));
	//   11   21:aload_2         
	//   12   22:areturn         
		}
		return reader;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	protected final Writer _decorate(Writer writer, IOContext iocontext)
		throws IOException
	{
		if(_outputDecorator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #113 <Field OutputDecorator _outputDecorator>
	//*   2    4:ifnull          23
		{
			iocontext = ((IOContext) (_outputDecorator.decorate(iocontext, writer)));
	//    3    7:aload_0         
	//    4    8:getfield        #113 <Field OutputDecorator _outputDecorator>
	//    5   11:aload_2         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #265 <Method Writer OutputDecorator.decorate(IOContext, Writer)>
	//    8   16:astore_2        
			if(iocontext != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          23
				return ((Writer) (iocontext));
	//   11   21:aload_2         
	//   12   22:areturn         
		}
		return writer;
	//   13   23:aload_1         
	//   14   24:areturn         
	}

	public BufferRecycler _getBufferRecycler()
	{
		if(isEnabled(Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #269 <Field JsonFactory$Feature JsonFactory$Feature.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING>
	//*   2    4:invokevirtual   #273 <Method boolean isEnabled(JsonFactory$Feature)>
	//*   3    7:ifeq            67
		{
			Object obj = ((Object) ((SoftReference)_recyclerRef.get()));
	//    4   10:getstatic       #76  <Field ThreadLocal _recyclerRef>
	//    5   13:invokevirtual   #277 <Method Object ThreadLocal.get()>
	//    6   16:checkcast       #279 <Class SoftReference>
	//    7   19:astore_1        
			Object obj1;
			if(obj == null)
	//*   8   20:aload_1         
	//*   9   21:ifnonnull       56
				obj = null;
	//   10   24:aconst_null     
	//   11   25:astore_1        
			else
	//*  12   26:aload_1         
	//*  13   27:astore_2        
	//*  14   28:aload_1         
	//*  15   29:ifnonnull       54
	//*  16   32:new             #281 <Class BufferRecycler>
	//*  17   35:dup             
	//*  18   36:invokespecial   #282 <Method void BufferRecycler()>
	//*  19   39:astore_2        
	//*  20   40:getstatic       #76  <Field ThreadLocal _recyclerRef>
	//*  21   43:new             #279 <Class SoftReference>
	//*  22   46:dup             
	//*  23   47:aload_2         
	//*  24   48:invokespecial   #285 <Method void SoftReference(Object)>
	//*  25   51:invokevirtual   #288 <Method void ThreadLocal.set(Object)>
	//*  26   54:aload_2         
	//*  27   55:areturn         
				obj = ((Object) ((BufferRecycler)((SoftReference) (obj)).get()));
	//   28   56:aload_1         
	//   29   57:invokevirtual   #289 <Method Object SoftReference.get()>
	//   30   60:checkcast       #281 <Class BufferRecycler>
	//   31   63:astore_1        
			obj1 = obj;
			if(obj == null)
			{
				obj1 = ((Object) (new BufferRecycler()));
				_recyclerRef.set(((Object) (new SoftReference(obj1))));
			}
			return ((BufferRecycler) (obj1));
		} else
	//*  32   64:goto            26
		{
			return new BufferRecycler();
	//   33   67:new             #281 <Class BufferRecycler>
	//   34   70:dup             
	//   35   71:invokespecial   #282 <Method void BufferRecycler()>
	//   36   74:areturn         
		}
	}

	protected InputStream _optimizedStreamFromURL(URL url)
		throws IOException
	{
		if("file".equals(((Object) (url.getProtocol()))))
	//*   0    0:ldc2            #293 <String "file">
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #298 <Method String URL.getProtocol()>
	//*   3    7:invokevirtual   #304 <Method boolean String.equals(Object)>
	//*   4   10:ifeq            53
		{
			String s = url.getHost();
	//    5   13:aload_1         
	//    6   14:invokevirtual   #307 <Method String URL.getHost()>
	//    7   17:astore_2        
			if((s == null || s.length() == 0) && url.getPath().indexOf('%') < 0)
	//*   8   18:aload_2         
	//*   9   19:ifnull          29
	//*  10   22:aload_2         
	//*  11   23:invokevirtual   #310 <Method int String.length()>
	//*  12   26:ifne            53
	//*  13   29:aload_1         
	//*  14   30:invokevirtual   #313 <Method String URL.getPath()>
	//*  15   33:bipush          37
	//*  16   35:invokevirtual   #317 <Method int String.indexOf(int)>
	//*  17   38:ifge            53
				return ((InputStream) (new FileInputStream(url.getPath())));
	//   18   41:new             #319 <Class FileInputStream>
	//   19   44:dup             
	//   20   45:aload_1         
	//   21   46:invokevirtual   #313 <Method String URL.getPath()>
	//   22   49:invokespecial   #320 <Method void FileInputStream(String)>
	//   23   52:areturn         
		}
		return url.openStream();
	//   24   53:aload_1         
	//   25   54:invokevirtual   #324 <Method InputStream URL.openStream()>
	//   26   57:areturn         
	}

	public boolean canHandleBinaryNatively()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean canUseCharArrays()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canUseSchema(FormatSchema formatschema)
	{
		String s = getFormatName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method String getFormatName()>
	//    2    4:astore_2        
		return s != null && s.equals(((Object) (formatschema.getSchemaType())));
	//    3    5:aload_2         
	//    4    6:ifnull          24
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #337 <Method String FormatSchema.getSchemaType()>
	//    8   16:invokevirtual   #304 <Method boolean String.equals(Object)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	public final JsonFactory configure(Feature feature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            10
			return enable(feature);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #343 <Method JsonFactory enable(JsonFactory$Feature)>
	//    5    9:areturn         
		else
			return disable(feature);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #346 <Method JsonFactory disable(JsonFactory$Feature)>
	//    9   15:areturn         
	}

	public final JsonFactory configure(JsonGenerator.Feature feature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            10
			return enable(feature);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #350 <Method JsonFactory enable(JsonGenerator$Feature)>
	//    5    9:areturn         
		else
			return disable(feature);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #352 <Method JsonFactory disable(JsonGenerator$Feature)>
	//    9   15:areturn         
	}

	public final JsonFactory configure(JsonParser.Feature feature, boolean flag)
	{
		if(flag)
	//*   0    0:iload_2         
	//*   1    1:ifeq            10
			return enable(feature);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #356 <Method JsonFactory enable(JsonParser$Feature)>
	//    5    9:areturn         
		else
			return disable(feature);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #358 <Method JsonFactory disable(JsonParser$Feature)>
	//    9   15:areturn         
	}

	public JsonFactory copy()
	{
		_checkInvalidCopy(com/fasterxml/jackson/core/JsonFactory);
	//    0    0:aload_0         
	//    1    1:ldc1            #2   <Class JsonFactory>
	//    2    3:invokevirtual   #362 <Method void _checkInvalidCopy(Class)>
		return new JsonFactory(this, ((ObjectCodec) (null)));
	//    3    6:new             #2   <Class JsonFactory>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:aconst_null     
	//    7   12:invokespecial   #364 <Method void JsonFactory(JsonFactory, ObjectCodec)>
	//    8   15:areturn         
	}

	public JsonGenerator createGenerator(File file, JsonEncoding jsonencoding)
		throws IOException
	{
		file = ((File) (new FileOutputStream(file)));
	//    0    0:new             #368 <Class FileOutputStream>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #371 <Method void FileOutputStream(File)>
	//    4    8:astore_1        
		IOContext iocontext = _createContext(((Object) (file)), true);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:iconst_1        
	//    8   12:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    9   15:astore_3        
		iocontext.setEncoding(jsonencoding);
	//   10   16:aload_3         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #377 <Method void IOContext.setEncoding(JsonEncoding)>
		if(jsonencoding == JsonEncoding.UTF8)
	//*  13   21:aload_2         
	//*  14   22:getstatic       #230 <Field JsonEncoding JsonEncoding.UTF8>
	//*  15   25:if_acmpne       40
			return _createUTF8Generator(_decorate(((OutputStream) (file)), iocontext), iocontext);
	//   16   28:aload_0         
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:aload_3         
	//   20   32:invokevirtual   #379 <Method OutputStream _decorate(OutputStream, IOContext)>
	//   21   35:aload_3         
	//   22   36:invokevirtual   #381 <Method JsonGenerator _createUTF8Generator(OutputStream, IOContext)>
	//   23   39:areturn         
		else
			return _createGenerator(_decorate(_createWriter(((OutputStream) (file)), jsonencoding, iocontext), iocontext), iocontext);
	//   24   40:aload_0         
	//   25   41:aload_0         
	//   26   42:aload_0         
	//   27   43:aload_1         
	//   28   44:aload_2         
	//   29   45:aload_3         
	//   30   46:invokevirtual   #383 <Method Writer _createWriter(OutputStream, JsonEncoding, IOContext)>
	//   31   49:aload_3         
	//   32   50:invokevirtual   #385 <Method Writer _decorate(Writer, IOContext)>
	//   33   53:aload_3         
	//   34   54:invokevirtual   #387 <Method JsonGenerator _createGenerator(Writer, IOContext)>
	//   35   57:areturn         
	}

	public JsonGenerator createGenerator(OutputStream outputstream)
		throws IOException
	{
		return createGenerator(outputstream, JsonEncoding.UTF8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #230 <Field JsonEncoding JsonEncoding.UTF8>
	//    3    5:invokevirtual   #391 <Method JsonGenerator createGenerator(OutputStream, JsonEncoding)>
	//    4    8:areturn         
	}

	public JsonGenerator createGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
		throws IOException
	{
		IOContext iocontext = _createContext(((Object) (outputstream)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_3        
		iocontext.setEncoding(jsonencoding);
	//    5    7:aload_3         
	//    6    8:aload_2         
	//    7    9:invokevirtual   #377 <Method void IOContext.setEncoding(JsonEncoding)>
		if(jsonencoding == JsonEncoding.UTF8)
	//*   8   12:aload_2         
	//*   9   13:getstatic       #230 <Field JsonEncoding JsonEncoding.UTF8>
	//*  10   16:if_acmpne       31
			return _createUTF8Generator(_decorate(outputstream, iocontext), iocontext);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:aload_3         
	//   15   23:invokevirtual   #379 <Method OutputStream _decorate(OutputStream, IOContext)>
	//   16   26:aload_3         
	//   17   27:invokevirtual   #381 <Method JsonGenerator _createUTF8Generator(OutputStream, IOContext)>
	//   18   30:areturn         
		else
			return _createGenerator(_decorate(_createWriter(outputstream, jsonencoding, iocontext), iocontext), iocontext);
	//   19   31:aload_0         
	//   20   32:aload_0         
	//   21   33:aload_0         
	//   22   34:aload_1         
	//   23   35:aload_2         
	//   24   36:aload_3         
	//   25   37:invokevirtual   #383 <Method Writer _createWriter(OutputStream, JsonEncoding, IOContext)>
	//   26   40:aload_3         
	//   27   41:invokevirtual   #385 <Method Writer _decorate(Writer, IOContext)>
	//   28   44:aload_3         
	//   29   45:invokevirtual   #387 <Method JsonGenerator _createGenerator(Writer, IOContext)>
	//   30   48:areturn         
	}

	public JsonGenerator createGenerator(Writer writer)
		throws IOException
	{
		IOContext iocontext = _createContext(((Object) (writer)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		return _createGenerator(_decorate(writer, iocontext), iocontext);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokevirtual   #385 <Method Writer _decorate(Writer, IOContext)>
	//   10   14:aload_2         
	//   11   15:invokevirtual   #387 <Method JsonGenerator _createGenerator(Writer, IOContext)>
	//   12   18:areturn         
	}

	public JsonGenerator createJsonGenerator(OutputStream outputstream)
		throws IOException
	{
		return createGenerator(outputstream, JsonEncoding.UTF8);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #230 <Field JsonEncoding JsonEncoding.UTF8>
	//    3    5:invokevirtual   #391 <Method JsonGenerator createGenerator(OutputStream, JsonEncoding)>
	//    4    8:areturn         
	}

	public JsonGenerator createJsonGenerator(OutputStream outputstream, JsonEncoding jsonencoding)
		throws IOException
	{
		return createGenerator(outputstream, jsonencoding);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #391 <Method JsonGenerator createGenerator(OutputStream, JsonEncoding)>
	//    4    6:areturn         
	}

	public JsonGenerator createJsonGenerator(Writer writer)
		throws IOException
	{
		return createGenerator(writer);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #397 <Method JsonGenerator createGenerator(Writer)>
	//    3    5:areturn         
	}

	public JsonParser createJsonParser(File file)
		throws IOException, JsonParseException
	{
		return createParser(file);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #404 <Method JsonParser createParser(File)>
	//    3    5:areturn         
	}

	public JsonParser createJsonParser(InputStream inputstream)
		throws IOException, JsonParseException
	{
		return createParser(inputstream);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #407 <Method JsonParser createParser(InputStream)>
	//    3    5:areturn         
	}

	public JsonParser createJsonParser(Reader reader)
		throws IOException, JsonParseException
	{
		return createParser(reader);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #410 <Method JsonParser createParser(Reader)>
	//    3    5:areturn         
	}

	public JsonParser createJsonParser(String s)
		throws IOException, JsonParseException
	{
		return createParser(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #413 <Method JsonParser createParser(String)>
	//    3    5:areturn         
	}

	public JsonParser createJsonParser(URL url)
		throws IOException, JsonParseException
	{
		return createParser(url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #416 <Method JsonParser createParser(URL)>
	//    3    5:areturn         
	}

	public JsonParser createJsonParser(byte abyte0[])
		throws IOException, JsonParseException
	{
		return createParser(abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #419 <Method JsonParser createParser(byte[])>
	//    3    5:areturn         
	}

	public JsonParser createJsonParser(byte abyte0[], int i, int j)
		throws IOException, JsonParseException
	{
		return createParser(abyte0, i, j);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #422 <Method JsonParser createParser(byte[], int, int)>
	//    5    7:areturn         
	}

	public JsonParser createParser(File file)
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (file)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		return _createParser(_decorate(((InputStream) (new FileInputStream(file))), iocontext), iocontext);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:new             #319 <Class FileInputStream>
	//    8   12:dup             
	//    9   13:aload_1         
	//   10   14:invokespecial   #423 <Method void FileInputStream(File)>
	//   11   17:aload_2         
	//   12   18:invokevirtual   #425 <Method InputStream _decorate(InputStream, IOContext)>
	//   13   21:aload_2         
	//   14   22:invokevirtual   #427 <Method JsonParser _createParser(InputStream, IOContext)>
	//   15   25:areturn         
	}

	public JsonParser createParser(InputStream inputstream)
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (inputstream)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		return _createParser(_decorate(inputstream, iocontext), iocontext);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokevirtual   #425 <Method InputStream _decorate(InputStream, IOContext)>
	//   10   14:aload_2         
	//   11   15:invokevirtual   #427 <Method JsonParser _createParser(InputStream, IOContext)>
	//   12   18:areturn         
	}

	public JsonParser createParser(Reader reader)
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (reader)), false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		return _createParser(_decorate(reader, iocontext), iocontext);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:aload_2         
	//    9   11:invokevirtual   #429 <Method Reader _decorate(Reader, IOContext)>
	//   10   14:aload_2         
	//   11   15:invokevirtual   #431 <Method JsonParser _createParser(Reader, IOContext)>
	//   12   18:areturn         
	}

	public JsonParser createParser(String s)
		throws IOException, JsonParseException
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #310 <Method int String.length()>
	//    2    4:istore_2        
		if(_inputDecorator != null || i > 32768 || !canUseCharArrays())
	//*   3    5:aload_0         
	//*   4    6:getfield        #111 <Field InputDecorator _inputDecorator>
	//*   5    9:ifnonnull       26
	//*   6   12:iload_2         
	//*   7   13:ldc2            #432 <Int 32768>
	//*   8   16:icmpgt          26
	//*   9   19:aload_0         
	//*  10   20:invokevirtual   #434 <Method boolean canUseCharArrays()>
	//*  11   23:ifne            39
		{
			return createParser(((Reader) (new StringReader(s))));
	//   12   26:aload_0         
	//   13   27:new             #436 <Class StringReader>
	//   14   30:dup             
	//   15   31:aload_1         
	//   16   32:invokespecial   #437 <Method void StringReader(String)>
	//   17   35:invokevirtual   #410 <Method JsonParser createParser(Reader)>
	//   18   38:areturn         
		} else
		{
			IOContext iocontext = _createContext(((Object) (s)), true);
	//   19   39:aload_0         
	//   20   40:aload_1         
	//   21   41:iconst_1        
	//   22   42:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//   23   45:astore_3        
			char ac[] = iocontext.allocTokenBuffer(i);
	//   24   46:aload_3         
	//   25   47:iload_2         
	//   26   48:invokevirtual   #441 <Method char[] IOContext.allocTokenBuffer(int)>
	//   27   51:astore          4
			s.getChars(0, i, ac, 0);
	//   28   53:aload_1         
	//   29   54:iconst_0        
	//   30   55:iload_2         
	//   31   56:aload           4
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #445 <Method void String.getChars(int, int, char[], int)>
			return _createParser(ac, 0, i, iocontext, true);
	//   34   62:aload_0         
	//   35   63:aload           4
	//   36   65:iconst_0        
	//   37   66:iload_2         
	//   38   67:aload_3         
	//   39   68:iconst_1        
	//   40   69:invokevirtual   #447 <Method JsonParser _createParser(char[], int, int, IOContext, boolean)>
	//   41   72:areturn         
		}
	}

	public JsonParser createParser(URL url)
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (url)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		return _createParser(_decorate(_optimizedStreamFromURL(url), iocontext), iocontext);
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:aload_0         
	//    8   10:aload_1         
	//    9   11:invokevirtual   #449 <Method InputStream _optimizedStreamFromURL(URL)>
	//   10   14:aload_2         
	//   11   15:invokevirtual   #425 <Method InputStream _decorate(InputStream, IOContext)>
	//   12   18:aload_2         
	//   13   19:invokevirtual   #427 <Method JsonParser _createParser(InputStream, IOContext)>
	//   14   22:areturn         
	}

	public JsonParser createParser(byte abyte0[])
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (abyte0)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore_2        
		if(_inputDecorator != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #111 <Field InputDecorator _inputDecorator>
	//*   7   11:ifnull          38
		{
			InputStream inputstream = _inputDecorator.decorate(iocontext, abyte0, 0, abyte0.length);
	//    8   14:aload_0         
	//    9   15:getfield        #111 <Field InputDecorator _inputDecorator>
	//   10   18:aload_2         
	//   11   19:aload_1         
	//   12   20:iconst_0        
	//   13   21:aload_1         
	//   14   22:arraylength     
	//   15   23:invokevirtual   #452 <Method InputStream InputDecorator.decorate(IOContext, byte[], int, int)>
	//   16   26:astore_3        
			if(inputstream != null)
	//*  17   27:aload_3         
	//*  18   28:ifnull          38
				return _createParser(inputstream, iocontext);
	//   19   31:aload_0         
	//   20   32:aload_3         
	//   21   33:aload_2         
	//   22   34:invokevirtual   #427 <Method JsonParser _createParser(InputStream, IOContext)>
	//   23   37:areturn         
		}
		return _createParser(abyte0, 0, abyte0.length, iocontext);
	//   24   38:aload_0         
	//   25   39:aload_1         
	//   26   40:iconst_0        
	//   27   41:aload_1         
	//   28   42:arraylength     
	//   29   43:aload_2         
	//   30   44:invokevirtual   #454 <Method JsonParser _createParser(byte[], int, int, IOContext)>
	//   31   47:areturn         
	}

	public JsonParser createParser(byte abyte0[], int i, int j)
		throws IOException, JsonParseException
	{
		IOContext iocontext = _createContext(((Object) (abyte0)), true);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//    4    6:astore          4
		if(_inputDecorator != null)
	//*   5    8:aload_0         
	//*   6    9:getfield        #111 <Field InputDecorator _inputDecorator>
	//*   7   12:ifnull          43
		{
			InputStream inputstream = _inputDecorator.decorate(iocontext, abyte0, i, j);
	//    8   15:aload_0         
	//    9   16:getfield        #111 <Field InputDecorator _inputDecorator>
	//   10   19:aload           4
	//   11   21:aload_1         
	//   12   22:iload_2         
	//   13   23:iload_3         
	//   14   24:invokevirtual   #452 <Method InputStream InputDecorator.decorate(IOContext, byte[], int, int)>
	//   15   27:astore          5
			if(inputstream != null)
	//*  16   29:aload           5
	//*  17   31:ifnull          43
				return _createParser(inputstream, iocontext);
	//   18   34:aload_0         
	//   19   35:aload           5
	//   20   37:aload           4
	//   21   39:invokevirtual   #427 <Method JsonParser _createParser(InputStream, IOContext)>
	//   22   42:areturn         
		}
		return _createParser(abyte0, i, j, iocontext);
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:iload_2         
	//   26   46:iload_3         
	//   27   47:aload           4
	//   28   49:invokevirtual   #454 <Method JsonParser _createParser(byte[], int, int, IOContext)>
	//   29   52:areturn         
	}

	public JsonParser createParser(char ac[])
		throws IOException
	{
		return createParser(ac, 0, ac.length);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:aload_1         
	//    4    4:arraylength     
	//    5    5:invokevirtual   #458 <Method JsonParser createParser(char[], int, int)>
	//    6    8:areturn         
	}

	public JsonParser createParser(char ac[], int i, int j)
		throws IOException
	{
		if(_inputDecorator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field InputDecorator _inputDecorator>
	//*   2    4:ifnull          22
			return createParser(((Reader) (new CharArrayReader(ac, i, j))));
	//    3    7:aload_0         
	//    4    8:new             #460 <Class CharArrayReader>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:iload_2         
	//    8   14:iload_3         
	//    9   15:invokespecial   #463 <Method void CharArrayReader(char[], int, int)>
	//   10   18:invokevirtual   #410 <Method JsonParser createParser(Reader)>
	//   11   21:areturn         
		else
			return _createParser(ac, i, j, _createContext(((Object) (ac)), true), false);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:iload_3         
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:iconst_1        
	//   19   29:invokevirtual   #373 <Method IOContext _createContext(Object, boolean)>
	//   20   32:iconst_0        
	//   21   33:invokevirtual   #447 <Method JsonParser _createParser(char[], int, int, IOContext, boolean)>
	//   22   36:areturn         
	}

	public JsonFactory disable(Feature feature)
	{
		_factoryFeatures = _factoryFeatures & ~feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #99  <Field int _factoryFeatures>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #466 <Method int JsonFactory$Feature.getMask()>
	//    5    9:iconst_m1       
	//    6   10:ixor            
	//    7   11:iand            
	//    8   12:putfield        #99  <Field int _factoryFeatures>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public JsonFactory disable(JsonGenerator.Feature feature)
	{
		_generatorFeatures = _generatorFeatures & ~feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #103 <Field int _generatorFeatures>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #467 <Method int JsonGenerator$Feature.getMask()>
	//    5    9:iconst_m1       
	//    6   10:ixor            
	//    7   11:iand            
	//    8   12:putfield        #103 <Field int _generatorFeatures>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public JsonFactory disable(JsonParser.Feature feature)
	{
		_parserFeatures = _parserFeatures & ~feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #101 <Field int _parserFeatures>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #468 <Method int JsonParser$Feature.getMask()>
	//    5    9:iconst_m1       
	//    6   10:ixor            
	//    7   11:iand            
	//    8   12:putfield        #101 <Field int _parserFeatures>
		return this;
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public JsonFactory enable(Feature feature)
	{
		_factoryFeatures = _factoryFeatures | feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #99  <Field int _factoryFeatures>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #466 <Method int JsonFactory$Feature.getMask()>
	//    5    9:ior             
	//    6   10:putfield        #99  <Field int _factoryFeatures>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public JsonFactory enable(JsonGenerator.Feature feature)
	{
		_generatorFeatures = _generatorFeatures | feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #103 <Field int _generatorFeatures>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #467 <Method int JsonGenerator$Feature.getMask()>
	//    5    9:ior             
	//    6   10:putfield        #103 <Field int _generatorFeatures>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public JsonFactory enable(JsonParser.Feature feature)
	{
		_parserFeatures = _parserFeatures | feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #101 <Field int _parserFeatures>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #468 <Method int JsonParser$Feature.getMask()>
	//    5    9:ior             
	//    6   10:putfield        #101 <Field int _parserFeatures>
		return this;
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public CharacterEscapes getCharacterEscapes()
	{
		return _characterEscapes;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field CharacterEscapes _characterEscapes>
	//    2    4:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public String getFormatName()
	{
		if(((Object)this).getClass() == com/fasterxml/jackson/core/JsonFactory)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #119 <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class JsonFactory>
	//*   3    6:if_acmpne       12
			return "JSON";
	//    4    9:ldc1            #21  <String "JSON">
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public Class getFormatReadFeatureType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Class getFormatWriteFeatureType()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public InputDecorator getInputDecorator()
	{
		return _inputDecorator;
	//    0    0:aload_0         
	//    1    1:getfield        #111 <Field InputDecorator _inputDecorator>
	//    2    4:areturn         
	}

	public OutputDecorator getOutputDecorator()
	{
		return _outputDecorator;
	//    0    0:aload_0         
	//    1    1:getfield        #113 <Field OutputDecorator _outputDecorator>
	//    2    4:areturn         
	}

	public String getRootValueSeparator()
	{
		if(_rootValueSeparator == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field SerializableString _rootValueSeparator>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return _rootValueSeparator.getValue();
	//    5    9:aload_0         
	//    6   10:getfield        #105 <Field SerializableString _rootValueSeparator>
	//    7   13:invokeinterface #485 <Method String SerializableString.getValue()>
	//    8   18:areturn         
	}

	public MatchStrength hasFormat(InputAccessor inputaccessor)
		throws IOException
	{
		if(((Object)this).getClass() == com/fasterxml/jackson/core/JsonFactory)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #119 <Method Class Object.getClass()>
	//*   2    4:ldc1            #2   <Class JsonFactory>
	//*   3    6:if_acmpne       15
			return hasJSONFormat(inputaccessor);
	//    4    9:aload_0         
	//    5   10:aload_1         
	//    6   11:invokevirtual   #490 <Method MatchStrength hasJSONFormat(InputAccessor)>
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
	//    1    1:invokestatic    #491 <Method MatchStrength ByteSourceJsonBootstrapper.hasJSONFormat(InputAccessor)>
	//    2    4:areturn         
	}

	public final boolean isEnabled(Feature feature)
	{
		return (_factoryFeatures & feature.getMask()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int _factoryFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #466 <Method int JsonFactory$Feature.getMask()>
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final boolean isEnabled(JsonGenerator.Feature feature)
	{
		return (_generatorFeatures & feature.getMask()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int _generatorFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #467 <Method int JsonGenerator$Feature.getMask()>
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final boolean isEnabled(JsonParser.Feature feature)
	{
		return (_parserFeatures & feature.getMask()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field int _parserFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #468 <Method int JsonParser$Feature.getMask()>
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	protected Object readResolve()
	{
		return ((Object) (new JsonFactory(this, _objectCodec)));
	//    0    0:new             #2   <Class JsonFactory>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #107 <Field ObjectCodec _objectCodec>
	//    5    9:invokespecial   #364 <Method void JsonFactory(JsonFactory, ObjectCodec)>
	//    6   12:areturn         
	}

	public boolean requiresCustomCodec()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean requiresPropertyOrdering()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JsonFactory setCharacterEscapes(CharacterEscapes characterescapes)
	{
		_characterEscapes = characterescapes;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #109 <Field CharacterEscapes _characterEscapes>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JsonFactory setCodec(ObjectCodec objectcodec)
	{
		_objectCodec = objectcodec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #107 <Field ObjectCodec _objectCodec>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JsonFactory setInputDecorator(InputDecorator inputdecorator)
	{
		_inputDecorator = inputdecorator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #111 <Field InputDecorator _inputDecorator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JsonFactory setOutputDecorator(OutputDecorator outputdecorator)
	{
		_outputDecorator = outputdecorator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #113 <Field OutputDecorator _outputDecorator>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JsonFactory setRootValueSeparator(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       13
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:aload_0         
	//*   5    7:aload_1         
	//*   6    8:putfield        #105 <Field SerializableString _rootValueSeparator>
	//*   7   11:aload_0         
	//*   8   12:areturn         
			s = ((String) (new SerializedString(s)));
	//    9   13:new             #506 <Class SerializedString>
	//   10   16:dup             
	//   11   17:aload_1         
	//   12   18:invokespecial   #507 <Method void SerializedString(String)>
	//   13   21:astore_1        
		_rootValueSeparator = ((SerializableString) (s));
		return this;
	//*  14   22:goto            6
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #513 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = Feature.collectDefaults();
	protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();
	protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
	private static final SerializableString DEFAULT_ROOT_VALUE_SEPARATOR;
	public static final String FORMAT_NAME_JSON = "JSON";
	protected static final ThreadLocal _recyclerRef = new ThreadLocal();
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
	//    0    0:invokestatic    #50  <Method int JsonFactory$Feature.collectDefaults()>
	//    1    3:putstatic       #52  <Field int DEFAULT_FACTORY_FEATURE_FLAGS>
	//    2    6:invokestatic    #55  <Method int JsonParser$Feature.collectDefaults()>
	//    3    9:putstatic       #57  <Field int DEFAULT_PARSER_FEATURE_FLAGS>
	//    4   12:invokestatic    #60  <Method int JsonGenerator$Feature.collectDefaults()>
	//    5   15:putstatic       #62  <Field int DEFAULT_GENERATOR_FEATURE_FLAGS>
		DEFAULT_ROOT_VALUE_SEPARATOR = ((SerializableString) (DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR));
	//    6   18:getstatic       #67  <Field SerializedString DefaultPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR>
	//    7   21:putstatic       #69  <Field SerializableString DEFAULT_ROOT_VALUE_SEPARATOR>
	//    8   24:new             #71  <Class ThreadLocal>
	//    9   27:dup             
	//   10   28:invokespecial   #74  <Method void ThreadLocal()>
	//   11   31:putstatic       #76  <Field ThreadLocal _recyclerRef>
	//*  12   34:return          
	}
}
