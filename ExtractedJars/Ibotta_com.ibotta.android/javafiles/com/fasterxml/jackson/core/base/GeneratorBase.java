// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.json.*;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

public abstract class GeneratorBase extends JsonGenerator
{

	protected GeneratorBase(int i, ObjectCodec objectcodec)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void JsonGenerator()>
		_features = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #41  <Field int _features>
		_objectCodec = objectcodec;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #43  <Field ObjectCodec _objectCodec>
		if(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i))
	//*   8   14:getstatic       #32  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*   9   17:iload_1         
	//*  10   18:invokevirtual   #47  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  11   21:ifeq            32
			objectcodec = ((ObjectCodec) (DupDetector.rootDetector(((JsonGenerator) (this)))));
	//   12   24:aload_0         
	//   13   25:invokestatic    #53  <Method DupDetector DupDetector.rootDetector(JsonGenerator)>
	//   14   28:astore_2        
		else
	//*  15   29:goto            34
			objectcodec = null;
	//   16   32:aconst_null     
	//   17   33:astore_2        
		_writeContext = JsonWriteContext.createRootContext(((DupDetector) (objectcodec)));
	//   18   34:aload_0         
	//   19   35:aload_2         
	//   20   36:invokestatic    #59  <Method JsonWriteContext JsonWriteContext.createRootContext(DupDetector)>
	//   21   39:putfield        #61  <Field JsonWriteContext _writeContext>
		_cfgNumbersAsStrings = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
	//   22   42:aload_0         
	//   23   43:getstatic       #22  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//   24   46:iload_1         
	//   25   47:invokevirtual   #47  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//   26   50:putfield        #63  <Field boolean _cfgNumbersAsStrings>
	//   27   53:return          
	}

	protected String _asString(BigDecimal bigdecimal)
		throws IOException
	{
		if(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN.enabledIn(_features))
	//*   0    0:getstatic       #70  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_BIGDECIMAL_AS_PLAIN>
	//*   1    3:aload_0         
	//*   2    4:getfield        #41  <Field int _features>
	//*   3    7:invokevirtual   #47  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*   4   10:ifeq            75
		{
			int i = bigdecimal.scale();
	//    5   13:aload_1         
	//    6   14:invokevirtual   #75  <Method int BigDecimal.scale()>
	//    7   17:istore_2        
			if(i < -9999 || i > 9999)
	//*   8   18:iload_2         
	//*   9   19:sipush          -9999
	//*  10   22:icmplt          32
	//*  11   25:iload_2         
	//*  12   26:sipush          9999
	//*  13   29:icmple          70
				_reportError(String.format("Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]", new Object[] {
					Integer.valueOf(i), Integer.valueOf(9999), Integer.valueOf(9999)
				}));
	//   14   32:aload_0         
	//   15   33:ldc1            #77  <String "Attempt to write plain `java.math.BigDecimal` (see JsonGenerator.Feature.WRITE_BIGDECIMAL_AS_PLAIN) with illegal scale (%d): needs to be between [-%d, %d]">
	//   16   35:iconst_3        
	//   17   36:anewarray       Object[]
	//   18   39:dup             
	//   19   40:iconst_0        
	//   20   41:iload_2         
	//   21   42:invokestatic    #85  <Method Integer Integer.valueOf(int)>
	//   22   45:aastore         
	//   23   46:dup             
	//   24   47:iconst_1        
	//   25   48:sipush          9999
	//   26   51:invokestatic    #85  <Method Integer Integer.valueOf(int)>
	//   27   54:aastore         
	//   28   55:dup             
	//   29   56:iconst_2        
	//   30   57:sipush          9999
	//   31   60:invokestatic    #85  <Method Integer Integer.valueOf(int)>
	//   32   63:aastore         
	//   33   64:invokestatic    #91  <Method String String.format(String, Object[])>
	//   34   67:invokevirtual   #95  <Method void _reportError(String)>
			return bigdecimal.toPlainString();
	//   35   70:aload_1         
	//   36   71:invokevirtual   #99  <Method String BigDecimal.toPlainString()>
	//   37   74:areturn         
		} else
		{
			return bigdecimal.toString();
	//   38   75:aload_1         
	//   39   76:invokevirtual   #102 <Method String BigDecimal.toString()>
	//   40   79:areturn         
		}
	}

	protected void _checkStdFeatureChanges(int i, int j)
	{
		if((DERIVED_FEATURES_MASK & j) == 0)
	//*   0    0:getstatic       #34  <Field int DERIVED_FEATURES_MASK>
	//*   1    3:iload_2         
	//*   2    4:iand            
	//*   3    5:ifne            9
			return;
	//    4    8:return          
		_cfgNumbersAsStrings = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.enabledIn(i);
	//    5    9:aload_0         
	//    6   10:getstatic       #22  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #47  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//    9   17:putfield        #63  <Field boolean _cfgNumbersAsStrings>
		if(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(j))
	//*  10   20:getstatic       #29  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  11   23:iload_2         
	//*  12   24:invokevirtual   #47  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  13   27:ifeq            56
			if(com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.enabledIn(i))
	//*  14   30:getstatic       #29  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  15   33:iload_1         
	//*  16   34:invokevirtual   #47  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  17   37:ifeq            50
				setHighestNonEscapedChar(127);
	//   18   40:aload_0         
	//   19   41:bipush          127
	//   20   43:invokevirtual   #109 <Method JsonGenerator setHighestNonEscapedChar(int)>
	//   21   46:pop             
			else
	//*  22   47:goto            56
				setHighestNonEscapedChar(0);
	//   23   50:aload_0         
	//   24   51:iconst_0        
	//   25   52:invokevirtual   #109 <Method JsonGenerator setHighestNonEscapedChar(int)>
	//   26   55:pop             
		if(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(j))
	//*  27   56:getstatic       #32  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*  28   59:iload_2         
	//*  29   60:invokevirtual   #47  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  30   63:ifeq            114
			if(com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i))
	//*  31   66:getstatic       #32  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*  32   69:iload_1         
	//*  33   70:invokevirtual   #47  <Method boolean com.fasterxml.jackson.core.JsonGenerator$Feature.enabledIn(int)>
	//*  34   73:ifeq            102
			{
				if(_writeContext.getDupDetector() == null)
	//*  35   76:aload_0         
	//*  36   77:getfield        #61  <Field JsonWriteContext _writeContext>
	//*  37   80:invokevirtual   #113 <Method DupDetector JsonWriteContext.getDupDetector()>
	//*  38   83:ifnonnull       114
				{
					_writeContext = _writeContext.withDupDetector(DupDetector.rootDetector(((JsonGenerator) (this))));
	//   39   86:aload_0         
	//   40   87:aload_0         
	//   41   88:getfield        #61  <Field JsonWriteContext _writeContext>
	//   42   91:aload_0         
	//   43   92:invokestatic    #53  <Method DupDetector DupDetector.rootDetector(JsonGenerator)>
	//   44   95:invokevirtual   #116 <Method JsonWriteContext JsonWriteContext.withDupDetector(DupDetector)>
	//   45   98:putfield        #61  <Field JsonWriteContext _writeContext>
					return;
	//   46  101:return          
				}
			} else
			{
				_writeContext = _writeContext.withDupDetector(((DupDetector) (null)));
	//   47  102:aload_0         
	//   48  103:aload_0         
	//   49  104:getfield        #61  <Field JsonWriteContext _writeContext>
	//   50  107:aconst_null     
	//   51  108:invokevirtual   #116 <Method JsonWriteContext JsonWriteContext.withDupDetector(DupDetector)>
	//   52  111:putfield        #61  <Field JsonWriteContext _writeContext>
			}
	//   53  114:return          
	}

	protected final int _decodeSurrogate(int i, int j)
		throws IOException
	{
		if(j < 56320 || j > 57343)
	//*   0    0:iload_2         
	//*   1    1:ldc1            #119 <Int 56320>
	//*   2    3:icmplt          12
	//*   3    6:iload_2         
	//*   4    7:ldc1            #120 <Int 57343>
	//*   5    9:icmple          60
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #122 <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #123 <Method void StringBuilder()>
	//    9   19:astore_3        
			stringbuilder.append("Incomplete surrogate pair: first char 0x");
	//   10   20:aload_3         
	//   11   21:ldc1            #125 <String "Incomplete surrogate pair: first char 0x">
	//   12   23:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(Integer.toHexString(i));
	//   14   27:aload_3         
	//   15   28:iload_1         
	//   16   29:invokestatic    #133 <Method String Integer.toHexString(int)>
	//   17   32:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			stringbuilder.append(", second 0x");
	//   19   36:aload_3         
	//   20   37:ldc1            #135 <String ", second 0x">
	//   21   39:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append(Integer.toHexString(j));
	//   23   43:aload_3         
	//   24   44:iload_2         
	//   25   45:invokestatic    #133 <Method String Integer.toHexString(int)>
	//   26   48:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   27   51:pop             
			_reportError(stringbuilder.toString());
	//   28   52:aload_0         
	//   29   53:aload_3         
	//   30   54:invokevirtual   #136 <Method String StringBuilder.toString()>
	//   31   57:invokevirtual   #95  <Method void _reportError(String)>
		}
		return (i - 55296 << 10) + 0x10000 + (j - 56320);
	//   32   60:iload_1         
	//   33   61:ldc1            #137 <Int 55296>
	//   34   63:isub            
	//   35   64:bipush          10
	//   36   66:ishl            
	//   37   67:ldc1            #138 <Int 0x10000>
	//   38   69:iadd            
	//   39   70:iload_2         
	//   40   71:ldc1            #119 <Int 56320>
	//   41   73:isub            
	//   42   74:iadd            
	//   43   75:ireturn         
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
	//    2    2:putfield        #143 <Field boolean _closed>
	//    3    5:return          
	}

	public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		int i = feature.getMask();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    2    4:istore_2        
		_features = _features & i;
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #41  <Field int _features>
	//    6   10:iload_2         
	//    7   11:iand            
	//    8   12:putfield        #41  <Field int _features>
		if((i & DERIVED_FEATURES_MASK) != 0)
	//*   9   15:iload_2         
	//*  10   16:getstatic       #34  <Field int DERIVED_FEATURES_MASK>
	//*  11   19:iand            
	//*  12   20:ifeq            71
		{
			if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)
	//*  13   23:aload_1         
	//*  14   24:getstatic       #22  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//*  15   27:if_acmpne       37
			{
				_cfgNumbersAsStrings = false;
	//   16   30:aload_0         
	//   17   31:iconst_0        
	//   18   32:putfield        #63  <Field boolean _cfgNumbersAsStrings>
				return ((JsonGenerator) (this));
	//   19   35:aload_0         
	//   20   36:areturn         
			}
			if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII)
	//*  21   37:aload_1         
	//*  22   38:getstatic       #29  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//*  23   41:if_acmpne       52
			{
				setHighestNonEscapedChar(0);
	//   24   44:aload_0         
	//   25   45:iconst_0        
	//   26   46:invokevirtual   #109 <Method JsonGenerator setHighestNonEscapedChar(int)>
	//   27   49:pop             
				return ((JsonGenerator) (this));
	//   28   50:aload_0         
	//   29   51:areturn         
			}
			if(feature == com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION)
	//*  30   52:aload_1         
	//*  31   53:getstatic       #32  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//*  32   56:if_acmpne       71
				_writeContext = _writeContext.withDupDetector(((DupDetector) (null)));
	//   33   59:aload_0         
	//   34   60:aload_0         
	//   35   61:getfield        #61  <Field JsonWriteContext _writeContext>
	//   36   64:aconst_null     
	//   37   65:invokevirtual   #116 <Method JsonWriteContext JsonWriteContext.withDupDetector(DupDetector)>
	//   38   68:putfield        #61  <Field JsonWriteContext _writeContext>
		}
		return ((JsonGenerator) (this));
	//   39   71:aload_0         
	//   40   72:areturn         
	}

	public int getFeatureMask()
	{
		return _features;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int _features>
	//    2    4:ireturn         
	}

	public JsonStreamContext getOutputContext()
	{
		return ((JsonStreamContext) (_writeContext));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JsonWriteContext _writeContext>
	//    2    4:areturn         
	}

	public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		int i = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int _features>
	//    2    4:istore_2        
		return (feature.getMask() & i) != 0;
	//    3    5:aload_1         
	//    4    6:invokevirtual   #26  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    5    9:iload_2         
	//    6   10:iand            
	//    7   11:ifeq            16
	//    8   14:iconst_1        
	//    9   15:ireturn         
	//   10   16:iconst_0        
	//   11   17:ireturn         
	}

	public JsonGenerator overrideStdFeatures(int i, int j)
	{
		int k = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int _features>
	//    2    4:istore_3        
		i = i & j | j & k;
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iand            
	//    6    8:iload_2         
	//    7    9:iload_3         
	//    8   10:iand            
	//    9   11:ior             
	//   10   12:istore_1        
		j = k ^ i;
	//   11   13:iload_3         
	//   12   14:iload_1         
	//   13   15:ixor            
	//   14   16:istore_2        
		if(j != 0)
	//*  15   17:iload_2         
	//*  16   18:ifeq            32
		{
			_features = i;
	//   17   21:aload_0         
	//   18   22:iload_1         
	//   19   23:putfield        #41  <Field int _features>
			_checkStdFeatureChanges(i, j);
	//   20   26:aload_0         
	//   21   27:iload_1         
	//   22   28:iload_2         
	//   23   29:invokevirtual   #154 <Method void _checkStdFeatureChanges(int, int)>
		}
		return ((JsonGenerator) (this));
	//   24   32:aload_0         
	//   25   33:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		_writeContext.setCurrentValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #158 <Method void JsonWriteContext.setCurrentValue(Object)>
	//    4    8:return          
	}

	public JsonGenerator setFeatureMask(int i)
	{
		int j = _features ^ i;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field int _features>
	//    2    4:iload_1         
	//    3    5:ixor            
	//    4    6:istore_2        
		_features = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #41  <Field int _features>
		if(j != 0)
	//*   8   12:iload_2         
	//*   9   13:ifeq            22
			_checkStdFeatureChanges(i, j);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #154 <Method void _checkStdFeatureChanges(int, int)>
		return ((JsonGenerator) (this));
	//   14   22:aload_0         
	//   15   23:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #169 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #174 <Method void _reportUnsupportedOperation()>
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
	//    2    2:invokeinterface #181 <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #183 <Method void writeFieldName(String)>
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
	//    3    5:invokevirtual   #187 <Method void writeNull()>
			return;
	//    4    8:return          
		}
		ObjectCodec objectcodec = _objectCodec;
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field ObjectCodec _objectCodec>
	//    7   13:astore_2        
		if(objectcodec != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          25
		{
			objectcodec.writeValue(((JsonGenerator) (this)), obj);
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #193 <Method void ObjectCodec.writeValue(JsonGenerator, Object)>
			return;
	//   14   24:return          
		} else
		{
			_writeSimpleObject(obj);
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokevirtual   #196 <Method void _writeSimpleObject(Object)>
			return;
	//   18   30:return          
		}
	}

	public void writeRawValue(SerializableString serializablestring)
		throws IOException
	{
		_verifyValueWrite("write raw value");
	//    0    0:aload_0         
	//    1    1:ldc1            #199 <String "write raw value">
	//    2    3:invokevirtual   #201 <Method void _verifyValueWrite(String)>
		writeRaw(serializablestring);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #204 <Method void writeRaw(SerializableString)>
	//    6   11:return          
	}

	public void writeRawValue(String s)
		throws IOException
	{
		_verifyValueWrite("write raw value");
	//    0    0:aload_0         
	//    1    1:ldc1            #199 <String "write raw value">
	//    2    3:invokevirtual   #201 <Method void _verifyValueWrite(String)>
		writeRaw(s);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:invokevirtual   #206 <Method void writeRaw(String)>
	//    6   11:return          
	}

	public void writeStartObject(Object obj)
		throws IOException
	{
		writeStartObject();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #209 <Method void writeStartObject()>
		JsonWriteContext jsonwritecontext = _writeContext;
	//    2    4:aload_0         
	//    3    5:getfield        #61  <Field JsonWriteContext _writeContext>
	//    4    8:astore_2        
		if(jsonwritecontext != null && obj != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          22
	//*   7   13:aload_1         
	//*   8   14:ifnull          22
			jsonwritecontext.setCurrentValue(obj);
	//    9   17:aload_2         
	//   10   18:aload_1         
	//   11   19:invokevirtual   #158 <Method void JsonWriteContext.setCurrentValue(Object)>
		setCurrentValue(obj);
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #210 <Method void setCurrentValue(Object)>
	//   15   27:return          
	}

	public void writeString(SerializableString serializablestring)
		throws IOException
	{
		writeString(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #181 <Method String SerializableString.getValue()>
	//    3    7:invokevirtual   #213 <Method void writeString(String)>
	//    4   10:return          
	}

	protected static final int DERIVED_FEATURES_MASK;
	protected boolean _cfgNumbersAsStrings;
	protected boolean _closed;
	protected int _features;
	protected ObjectCodec _objectCodec;
	protected JsonWriteContext _writeContext;

	static 
	{
		DERIVED_FEATURES_MASK = com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS.getMask() | com.fasterxml.jackson.core.JsonGenerator.Feature.ESCAPE_NON_ASCII.getMask() | com.fasterxml.jackson.core.JsonGenerator.Feature.STRICT_DUPLICATE_DETECTION.getMask();
	//    0    0:getstatic       #22  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.WRITE_NUMBERS_AS_STRINGS>
	//    1    3:invokevirtual   #26  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    2    6:getstatic       #29  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.ESCAPE_NON_ASCII>
	//    3    9:invokevirtual   #26  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    4   12:ior             
	//    5   13:getstatic       #32  <Field com.fasterxml.jackson.core.JsonGenerator$Feature com.fasterxml.jackson.core.JsonGenerator$Feature.STRICT_DUPLICATE_DETECTION>
	//    6   16:invokevirtual   #26  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    7   19:ior             
	//    8   20:putstatic       #34  <Field int DERIVED_FEATURES_MASK>
	//*   9   23:return          
	}
}
