// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.DupDetector;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;
import java.io.InputStream;

public abstract class GeneratorBase extends JsonGenerator
{

	protected GeneratorBase(int i, ObjectCodec objectcodec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void JsonGenerator()>
		WRITE_BINARY = "write a binary value";
	//    2    4:aload_0         
	//    3    5:ldc1            #56  <String "write a binary value">
	//    4    7:putfield        #58  <Field String WRITE_BINARY>
		WRITE_BOOLEAN = "write a boolean value";
	//    5   10:aload_0         
	//    6   11:ldc1            #60  <String "write a boolean value">
	//    7   13:putfield        #62  <Field String WRITE_BOOLEAN>
		WRITE_NULL = "write a null";
	//    8   16:aload_0         
	//    9   17:ldc1            #64  <String "write a null">
	//   10   19:putfield        #66  <Field String WRITE_NULL>
		WRITE_NUMBER = "write a number";
	//   11   22:aload_0         
	//   12   23:ldc1            #68  <String "write a number">
	//   13   25:putfield        #70  <Field String WRITE_NUMBER>
		WRITE_RAW = "write a raw (unencoded) value";
	//   14   28:aload_0         
	//   15   29:ldc1            #72  <String "write a raw (unencoded) value">
	//   16   31:putfield        #74  <Field String WRITE_RAW>
		WRITE_STRING = "write a string";
	//   17   34:aload_0         
	//   18   35:ldc1            #76  <String "write a string">
	//   19   37:putfield        #78  <Field String WRITE_STRING>
		_features = i;
	//   20   40:aload_0         
	//   21   41:iload_1         
	//   22   42:putfield        #80  <Field int _features>
		_objectCodec = objectcodec;
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:putfield        #82  <Field ObjectCodec _objectCodec>
		if(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i))
	//*  26   50:getstatic       #47  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*  27   53:iload_1         
	//*  28   54:invokevirtual   #86  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  29   57:ifeq            85
			objectcodec = ((ObjectCodec) (DupDetector.rootDetector(((JsonGenerator) (this)))));
	//   30   60:aload_0         
	//   31   61:invokestatic    #92  <Method DupDetector DupDetector.rootDetector(JsonGenerator)>
	//   32   64:astore_2        
		else
	//*  33   65:aload_0         
	//*  34   66:aload_2         
	//*  35   67:invokestatic    #98  <Method JsonWriteContext JsonWriteContext.createRootContext(DupDetector)>
	//*  36   70:putfield        #100 <Field JsonWriteContext _writeContext>
	//*  37   73:aload_0         
	//*  38   74:getstatic       #37  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//*  39   77:iload_1         
	//*  40   78:invokevirtual   #86  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  41   81:putfield        #102 <Field boolean _cfgNumbersAsStrings>
	//*  42   84:return          
			objectcodec = null;
	//   43   85:aconst_null     
	//   44   86:astore_2        
		_writeContext = JsonWriteContext.createRootContext(((DupDetector) (objectcodec)));
		_cfgNumbersAsStrings = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
	//*  45   87:goto            65
	}

	protected GeneratorBase(int i, ObjectCodec objectcodec, JsonWriteContext jsonwritecontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void JsonGenerator()>
		WRITE_BINARY = "write a binary value";
	//    2    4:aload_0         
	//    3    5:ldc1            #56  <String "write a binary value">
	//    4    7:putfield        #58  <Field String WRITE_BINARY>
		WRITE_BOOLEAN = "write a boolean value";
	//    5   10:aload_0         
	//    6   11:ldc1            #60  <String "write a boolean value">
	//    7   13:putfield        #62  <Field String WRITE_BOOLEAN>
		WRITE_NULL = "write a null";
	//    8   16:aload_0         
	//    9   17:ldc1            #64  <String "write a null">
	//   10   19:putfield        #66  <Field String WRITE_NULL>
		WRITE_NUMBER = "write a number";
	//   11   22:aload_0         
	//   12   23:ldc1            #68  <String "write a number">
	//   13   25:putfield        #70  <Field String WRITE_NUMBER>
		WRITE_RAW = "write a raw (unencoded) value";
	//   14   28:aload_0         
	//   15   29:ldc1            #72  <String "write a raw (unencoded) value">
	//   16   31:putfield        #74  <Field String WRITE_RAW>
		WRITE_STRING = "write a string";
	//   17   34:aload_0         
	//   18   35:ldc1            #76  <String "write a string">
	//   19   37:putfield        #78  <Field String WRITE_STRING>
		_features = i;
	//   20   40:aload_0         
	//   21   41:iload_1         
	//   22   42:putfield        #80  <Field int _features>
		_objectCodec = objectcodec;
	//   23   45:aload_0         
	//   24   46:aload_2         
	//   25   47:putfield        #82  <Field ObjectCodec _objectCodec>
		_writeContext = jsonwritecontext;
	//   26   50:aload_0         
	//   27   51:aload_3         
	//   28   52:putfield        #100 <Field JsonWriteContext _writeContext>
		_cfgNumbersAsStrings = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
	//   29   55:aload_0         
	//   30   56:getstatic       #37  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//   31   59:iload_1         
	//   32   60:invokevirtual   #86  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//   33   63:putfield        #102 <Field boolean _cfgNumbersAsStrings>
	//   34   66:return          
	}

	protected void _checkStdFeatureChanges(int i, int j)
	{
		if((DERIVED_FEATURES_MASK & j) != 0)
	//*   0    0:getstatic       #49  <Field int DERIVED_FEATURES_MASK>
	//*   1    3:iload_2         
	//*   2    4:iand            
	//*   3    5:ifne            9
	//*   4    8:return          
		{
			_cfgNumbersAsStrings = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
	//    5    9:aload_0         
	//    6   10:getstatic       #37  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #86  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//    9   17:putfield        #102 <Field boolean _cfgNumbersAsStrings>
			if(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(j))
	//*  10   20:getstatic       #44  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  11   23:iload_2         
	//*  12   24:invokevirtual   #86  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  13   27:ifeq            47
				if(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i))
	//*  14   30:getstatic       #44  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  15   33:iload_1         
	//*  16   34:invokevirtual   #86  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  17   37:ifeq            93
					setHighestNonEscapedChar(127);
	//   18   40:aload_0         
	//   19   41:bipush          127
	//   20   43:invokevirtual   #109 <Method JsonGenerator setHighestNonEscapedChar(int)>
	//   21   46:pop             
				else
	//*  22   47:getstatic       #47  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*  23   50:iload_2         
	//*  24   51:invokevirtual   #86  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  25   54:ifeq            8
	//*  26   57:getstatic       #47  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*  27   60:iload_1         
	//*  28   61:invokevirtual   #86  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  29   64:ifeq            102
	//*  30   67:aload_0         
	//*  31   68:getfield        #100 <Field JsonWriteContext _writeContext>
	//*  32   71:invokevirtual   #113 <Method DupDetector JsonWriteContext.getDupDetector()>
	//*  33   74:ifnonnull       8
	//*  34   77:aload_0         
	//*  35   78:aload_0         
	//*  36   79:getfield        #100 <Field JsonWriteContext _writeContext>
	//*  37   82:aload_0         
	//*  38   83:invokestatic    #92  <Method DupDetector DupDetector.rootDetector(JsonGenerator)>
	//*  39   86:invokevirtual   #116 <Method JsonWriteContext JsonWriteContext.withDupDetector(DupDetector)>
	//*  40   89:putfield        #100 <Field JsonWriteContext _writeContext>
	//*  41   92:return          
					setHighestNonEscapedChar(0);
	//   42   93:aload_0         
	//   43   94:iconst_0        
	//   44   95:invokevirtual   #109 <Method JsonGenerator setHighestNonEscapedChar(int)>
	//   45   98:pop             
			if(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(j))
				if(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i))
				{
					if(_writeContext.getDupDetector() == null)
					{
						_writeContext = _writeContext.withDupDetector(DupDetector.rootDetector(((JsonGenerator) (this))));
						return;
					}
				} else
	//*  46   99:goto            47
				{
					_writeContext = _writeContext.withDupDetector(((DupDetector) (null)));
	//   47  102:aload_0         
	//   48  103:aload_0         
	//   49  104:getfield        #100 <Field JsonWriteContext _writeContext>
	//   50  107:aconst_null     
	//   51  108:invokevirtual   #116 <Method JsonWriteContext JsonWriteContext.withDupDetector(DupDetector)>
	//   52  111:putfield        #100 <Field JsonWriteContext _writeContext>
					return;
	//   53  114:return          
				}
		}
	}

	protected PrettyPrinter _constructDefaultPrettyPrinter()
	{
		return ((PrettyPrinter) (new DefaultPrettyPrinter()));
	//    0    0:new             #120 <Class DefaultPrettyPrinter>
	//    1    3:dup             
	//    2    4:invokespecial   #121 <Method void DefaultPrettyPrinter()>
	//    3    7:areturn         
	}

	protected final int _decodeSurrogate(int i, int j)
		throws IOException
	{
		if(j < 56320 || j > 57343)
	//*   0    0:iload_2         
	//*   1    1:ldc1            #12  <Int 56320>
	//*   2    3:icmplt          12
	//*   3    6:iload_2         
	//*   4    7:ldc1            #14  <Int 57343>
	//*   5    9:icmple          50
			_reportError((new StringBuilder()).append("Incomplete surrogate pair: first char 0x").append(Integer.toHexString(i)).append(", second 0x").append(Integer.toHexString(j)).toString());
	//    6   12:aload_0         
	//    7   13:new             #127 <Class StringBuilder>
	//    8   16:dup             
	//    9   17:invokespecial   #128 <Method void StringBuilder()>
	//   10   20:ldc1            #130 <String "Incomplete surrogate pair: first char 0x">
	//   11   22:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   12   25:iload_1         
	//   13   26:invokestatic    #140 <Method String Integer.toHexString(int)>
	//   14   29:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   15   32:ldc1            #142 <String ", second 0x">
	//   16   34:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   17   37:iload_2         
	//   18   38:invokestatic    #140 <Method String Integer.toHexString(int)>
	//   19   41:invokevirtual   #134 <Method StringBuilder StringBuilder.append(String)>
	//   20   44:invokevirtual   #146 <Method String StringBuilder.toString()>
	//   21   47:invokevirtual   #150 <Method void _reportError(String)>
		return 0x10000 + (i - 55296 << 10) + (j - 56320);
	//   22   50:ldc1            #151 <Int 0x10000>
	//   23   52:iload_1         
	//   24   53:ldc1            #8   <Int 55296>
	//   25   55:isub            
	//   26   56:bipush          10
	//   27   58:ishl            
	//   28   59:iadd            
	//   29   60:iload_2         
	//   30   61:ldc1            #12  <Int 56320>
	//   31   63:isub            
	//   32   64:iadd            
	//   33   65:ireturn         
	}

	protected abstract void _releaseBuffers();

	protected abstract void _verifyValueWrite(String s)
		throws IOException;

	public void close()
		throws IOException
	{
		_closed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #157 <Field boolean _closed>
	//    3    5:return          
	}

	public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		int i = feature.getMask();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    2    4:istore_2        
		_features = _features & ~i;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #80  <Field int _features>
	//    6   10:iload_2         
	//    7   11:iconst_m1       
	//    8   12:ixor            
	//    9   13:iand            
	//   10   14:putfield        #80  <Field int _features>
		if((DERIVED_FEATURES_MASK & i) != 0)
	//*  11   17:getstatic       #49  <Field int DERIVED_FEATURES_MASK>
	//*  12   20:iload_2         
	//*  13   21:iand            
	//*  14   22:ifeq            37
			if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)
	//*  15   25:aload_1         
	//*  16   26:getstatic       #37  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//*  17   29:if_acmpne       39
			{
				_cfgNumbersAsStrings = false;
	//   18   32:aload_0         
	//   19   33:iconst_0        
	//   20   34:putfield        #102 <Field boolean _cfgNumbersAsStrings>
			} else
	//*  21   37:aload_0         
	//*  22   38:areturn         
			{
				if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII)
	//*  23   39:aload_1         
	//*  24   40:getstatic       #44  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  25   43:if_acmpne       54
				{
					setHighestNonEscapedChar(0);
	//   26   46:aload_0         
	//   27   47:iconst_0        
	//   28   48:invokevirtual   #109 <Method JsonGenerator setHighestNonEscapedChar(int)>
	//   29   51:pop             
					return ((JsonGenerator) (this));
	//   30   52:aload_0         
	//   31   53:areturn         
				}
				if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION)
	//*  32   54:aload_1         
	//*  33   55:getstatic       #47  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*  34   58:if_acmpne       37
				{
					_writeContext = _writeContext.withDupDetector(((DupDetector) (null)));
	//   35   61:aload_0         
	//   36   62:aload_0         
	//   37   63:getfield        #100 <Field JsonWriteContext _writeContext>
	//   38   66:aconst_null     
	//   39   67:invokevirtual   #116 <Method JsonWriteContext JsonWriteContext.withDupDetector(DupDetector)>
	//   40   70:putfield        #100 <Field JsonWriteContext _writeContext>
					return ((JsonGenerator) (this));
	//   41   73:aload_0         
	//   42   74:areturn         
				}
			}
		return ((JsonGenerator) (this));
	}

	public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		int i = feature.getMask();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    2    4:istore_2        
		_features = _features | i;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #80  <Field int _features>
	//    6   10:iload_2         
	//    7   11:ior             
	//    8   12:putfield        #80  <Field int _features>
		if((DERIVED_FEATURES_MASK & i) != 0)
	//*   9   15:getstatic       #49  <Field int DERIVED_FEATURES_MASK>
	//*  10   18:iload_2         
	//*  11   19:iand            
	//*  12   20:ifeq            35
			if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)
	//*  13   23:aload_1         
	//*  14   24:getstatic       #37  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//*  15   27:if_acmpne       37
			{
				_cfgNumbersAsStrings = true;
	//   16   30:aload_0         
	//   17   31:iconst_1        
	//   18   32:putfield        #102 <Field boolean _cfgNumbersAsStrings>
			} else
	//*  19   35:aload_0         
	//*  20   36:areturn         
			{
				if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII)
	//*  21   37:aload_1         
	//*  22   38:getstatic       #44  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  23   41:if_acmpne       53
				{
					setHighestNonEscapedChar(127);
	//   24   44:aload_0         
	//   25   45:bipush          127
	//   26   47:invokevirtual   #109 <Method JsonGenerator setHighestNonEscapedChar(int)>
	//   27   50:pop             
					return ((JsonGenerator) (this));
	//   28   51:aload_0         
	//   29   52:areturn         
				}
				if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION && _writeContext.getDupDetector() == null)
	//*  30   53:aload_1         
	//*  31   54:getstatic       #47  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*  32   57:if_acmpne       35
	//*  33   60:aload_0         
	//*  34   61:getfield        #100 <Field JsonWriteContext _writeContext>
	//*  35   64:invokevirtual   #113 <Method DupDetector JsonWriteContext.getDupDetector()>
	//*  36   67:ifnonnull       35
				{
					_writeContext = _writeContext.withDupDetector(DupDetector.rootDetector(((JsonGenerator) (this))));
	//   37   70:aload_0         
	//   38   71:aload_0         
	//   39   72:getfield        #100 <Field JsonWriteContext _writeContext>
	//   40   75:aload_0         
	//   41   76:invokestatic    #92  <Method DupDetector DupDetector.rootDetector(JsonGenerator)>
	//   42   79:invokevirtual   #116 <Method JsonWriteContext JsonWriteContext.withDupDetector(DupDetector)>
	//   43   82:putfield        #100 <Field JsonWriteContext _writeContext>
					return ((JsonGenerator) (this));
	//   44   85:aload_0         
	//   45   86:areturn         
				}
			}
		return ((JsonGenerator) (this));
	}

	public abstract void flush()
		throws IOException;

	public final ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public Object getCurrentValue()
	{
		return _writeContext.getCurrentValue();
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #167 <Method Object JsonWriteContext.getCurrentValue()>
	//    3    7:areturn         
	}

	public int getFeatureMask()
	{
		return _features;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int _features>
	//    2    4:ireturn         
	}

	public volatile JsonStreamContext getOutputContext()
	{
		return ((JsonStreamContext) (getOutputContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #173 <Method JsonWriteContext getOutputContext()>
	//    2    4:areturn         
	}

	public final JsonWriteContext getOutputContext()
	{
		return _writeContext;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field JsonWriteContext _writeContext>
	//    2    4:areturn         
	}

	public boolean isClosed()
	{
		return _closed;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field boolean _closed>
	//    2    4:ireturn         
	}

	public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		return (_features & feature.getMask()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int _features>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #41  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public JsonGenerator overrideStdFeatures(int i, int j)
	{
		int k = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field int _features>
	//    2    4:istore_3        
		i = ~j & k | i & j;
	//    3    5:iload_2         
	//    4    6:iconst_m1       
	//    5    7:ixor            
	//    6    8:iload_3         
	//    7    9:iand            
	//    8   10:iload_1         
	//    9   11:iload_2         
	//   10   12:iand            
	//   11   13:ior             
	//   12   14:istore_1        
		j = k ^ i;
	//   13   15:iload_3         
	//   14   16:iload_1         
	//   15   17:ixor            
	//   16   18:istore_2        
		if(j != 0)
	//*  17   19:iload_2         
	//*  18   20:ifeq            34
		{
			_features = i;
	//   19   23:aload_0         
	//   20   24:iload_1         
	//   21   25:putfield        #80  <Field int _features>
			_checkStdFeatureChanges(i, j);
	//   22   28:aload_0         
	//   23   29:iload_1         
	//   24   30:iload_2         
	//   25   31:invokevirtual   #181 <Method void _checkStdFeatureChanges(int, int)>
		}
		return ((JsonGenerator) (this));
	//   26   34:aload_0         
	//   27   35:areturn         
	}

	public JsonGenerator setCodec(ObjectCodec objectcodec)
	{
		_objectCodec = objectcodec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #82  <Field ObjectCodec _objectCodec>
		return ((JsonGenerator) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		_writeContext.setCurrentValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #187 <Method void JsonWriteContext.setCurrentValue(Object)>
	//    4    8:return          
	}

	public JsonGenerator setFeatureMask(int i)
	{
		int j = i ^ _features;
	//    0    0:iload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #80  <Field int _features>
	//    3    5:ixor            
	//    4    6:istore_2        
		_features = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #80  <Field int _features>
		if(j != 0)
	//*   8   12:iload_2         
	//*   9   13:ifeq            22
			_checkStdFeatureChanges(i, j);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #181 <Method void _checkStdFeatureChanges(int, int)>
		return ((JsonGenerator) (this));
	//   14   22:aload_0         
	//   15   23:areturn         
	}

	public JsonGenerator useDefaultPrettyPrinter()
	{
		if(getPrettyPrinter() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #195 <Method PrettyPrinter getPrettyPrinter()>
	//*   2    4:ifnull          9
			return ((JsonGenerator) (this));
	//    3    7:aload_0         
	//    4    8:areturn         
		else
			return setPrettyPrinter(_constructDefaultPrettyPrinter());
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #197 <Method PrettyPrinter _constructDefaultPrettyPrinter()>
	//    8   14:invokevirtual   #201 <Method JsonGenerator setPrettyPrinter(PrettyPrinter)>
	//    9   17:areturn         
	}

	public Version version()
	{
		return VersionUtil.versionFor(((Object)this).getClass());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method Class Object.getClass()>
	//    2    4:invokestatic    #215 <Method Version VersionUtil.versionFor(Class)>
	//    3    7:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #220 <Method void _reportUnsupportedOperation()>
		return 0;
	//    2    4:iconst_0        
	//    3    5:ireturn         
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		writeFieldName(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #227 <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #229 <Method void writeFieldName(String)>
	//    4   10:return          
	}

	public void writeObject(Object obj)
		throws IOException
	{
		if(obj == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			writeNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #233 <Method void writeNull()>
			return;
	//    4    8:return          
		}
		if(_objectCodec != null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #82  <Field ObjectCodec _objectCodec>
	//*   7   13:ifnull          26
		{
			_objectCodec.writeValue(((JsonGenerator) (this)), obj);
	//    8   16:aload_0         
	//    9   17:getfield        #82  <Field ObjectCodec _objectCodec>
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #239 <Method void ObjectCodec.writeValue(JsonGenerator, Object)>
			return;
	//   13   25:return          
		} else
		{
			_writeSimpleObject(obj);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #242 <Method void _writeSimpleObject(Object)>
			return;
	//   17   31:return          
		}
	}

	public void writeRawValue(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write raw value");
	//    0    0:aload_0         
	//    1    1:ldc1            #245 <String "write raw value">
	//    2    3:invokevirtual   #247 <Method void _verifyValueWrite(String)>
		writeRaw(serializablestring);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #250 <Method void writeRaw(SerializableString)>
	//    6   11:return          
	}

	public void writeRawValue(String s)
		throws IOException
	{
		_verifyValueWrite("write raw value");
	//    0    0:aload_0         
	//    1    1:ldc1            #245 <String "write raw value">
	//    2    3:invokevirtual   #247 <Method void _verifyValueWrite(String)>
		writeRaw(s);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #252 <Method void writeRaw(String)>
	//    6   11:return          
	}

	public void writeRawValue(String s, int i, int j)
		throws IOException
	{
		_verifyValueWrite("write raw value");
	//    0    0:aload_0         
	//    1    1:ldc1            #245 <String "write raw value">
	//    2    3:invokevirtual   #247 <Method void _verifyValueWrite(String)>
		writeRaw(s, i, j);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:invokevirtual   #255 <Method void writeRaw(String, int, int)>
	//    8   13:return          
	}

	public void writeRawValue(char ac[], int i, int j)
		throws IOException
	{
		_verifyValueWrite("write raw value");
	//    0    0:aload_0         
	//    1    1:ldc1            #245 <String "write raw value">
	//    2    3:invokevirtual   #247 <Method void _verifyValueWrite(String)>
		writeRaw(ac, i, j);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:invokevirtual   #258 <Method void writeRaw(char[], int, int)>
	//    8   13:return          
	}

	public void writeString(SerializableString serializablestring)
		throws IOException
	{
		writeString(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #227 <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #261 <Method void writeString(String)>
	//    4   10:return          
	}

	public void writeTree(TreeNode treenode)
		throws IOException
	{
		if(treenode == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			writeNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #233 <Method void writeNull()>
			return;
	//    4    8:return          
		}
		if(_objectCodec == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #82  <Field ObjectCodec _objectCodec>
	//*   7   13:ifnonnull       27
		{
			throw new IllegalStateException("No ObjectCodec defined");
	//    8   16:new             #265 <Class IllegalStateException>
	//    9   19:dup             
	//   10   20:ldc2            #267 <String "No ObjectCodec defined">
	//   11   23:invokespecial   #269 <Method void IllegalStateException(String)>
	//   12   26:athrow          
		} else
		{
			_objectCodec.writeValue(((JsonGenerator) (this)), ((Object) (treenode)));
	//   13   27:aload_0         
	//   14   28:getfield        #82  <Field ObjectCodec _objectCodec>
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokevirtual   #239 <Method void ObjectCodec.writeValue(JsonGenerator, Object)>
			return;
	//   18   36:return          
		}
	}

	protected static final int DERIVED_FEATURES_MASK;
	public static final int SURR1_FIRST = 55296;
	public static final int SURR1_LAST = 56319;
	public static final int SURR2_FIRST = 56320;
	public static final int SURR2_LAST = 57343;
	protected final String WRITE_BINARY;
	protected final String WRITE_BOOLEAN;
	protected final String WRITE_NULL;
	protected final String WRITE_NUMBER;
	protected final String WRITE_RAW;
	protected final String WRITE_STRING;
	protected boolean _cfgNumbersAsStrings;
	protected boolean _closed;
	protected int _features;
	protected ObjectCodec _objectCodec;
	protected JsonWriteContext _writeContext;

	static 
	{
		DERIVED_FEATURES_MASK = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask() | com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
	//    0    0:getstatic       #37  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//    1    3:invokevirtual   #41  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    2    6:getstatic       #44  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//    3    9:invokevirtual   #41  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    4   12:ior             
	//    5   13:getstatic       #47  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//    6   16:invokevirtual   #41  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    7   19:ior             
	//    8   20:putstatic       #49  <Field int DERIVED_FEATURES_MASK>
	//*   9   23:return          
	}
}
