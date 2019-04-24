// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			TokenBuffer

protected static final class TokenBuffer$Parser extends ParserMinimalBase
{

	protected final void _checkIsNumber()
		throws JsonParseException
	{
		if(_currToken == null || !_currToken.isNumeric())
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field JsonToken _currToken>
	//*   2    4:ifnull          17
	//*   3    7:aload_0         
	//*   4    8:getfield        #60  <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #66  <Method boolean JsonToken.isNumeric()>
	//*   6   14:ifne            49
			throw _constructError((new StringBuilder()).append("Current token (").append(((Object) (_currToken))).append(") not numeric, can not use numeric value accessors").toString());
	//    7   17:aload_0         
	//    8   18:new             #68  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #70  <Method void StringBuilder()>
	//   11   25:ldc1            #72  <String "Current token (">
	//   12   27:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #60  <Field JsonToken _currToken>
	//   15   34:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//   16   37:ldc1            #81  <String ") not numeric, can not use numeric value accessors">
	//   17   39:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   18   42:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   19   45:invokevirtual   #89  <Method JsonParseException _constructError(String)>
	//   20   48:athrow          
		else
			return;
	//   21   49:return          
	}

	protected final Object _currentObject()
	{
		return _segment.get(_segmentPtr);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int _segmentPtr>
	//    4    8:invokevirtual   #98  <Method Object TokenBuffer$Segment.get(int)>
	//    5   11:areturn         
	}

	protected void _handleEOF()
		throws JsonParseException
	{
		_throwInternal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #102 <Method void _throwInternal()>
	//    2    4:return          
	}

	public boolean canReadObjectId()
	{
		return _hasNativeObjectIds;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field boolean _hasNativeObjectIds>
	//    2    4:ireturn         
	}

	public boolean canReadTypeId()
	{
		return _hasNativeTypeIds;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field boolean _hasNativeTypeIds>
	//    2    4:ireturn         
	}

	public void close()
		throws IOException
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field boolean _closed>
	//*   2    4:ifne            12
			_closed = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #109 <Field boolean _closed>
	//    6   12:return          
	}

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		Number number = getNumberValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method Number getNumberValue()>
	//    2    4:astore_1        
		if(number instanceof BigInteger)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #117 <Class BigInteger>
	//*   5    9:ifeq            17
			return (BigInteger)number;
	//    6   12:aload_1         
	//    7   13:checkcast       #117 <Class BigInteger>
	//    8   16:areturn         
		if(getNumberType() == com.fasterxml.jackson.core.pe.BIG_DECIMAL)
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #121 <Method com.fasterxml.jackson.core.JsonParser$NumberType getNumberType()>
	//*  11   21:getstatic       #127 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//*  12   24:if_acmpne       35
			return ((BigDecimal)number).toBigInteger();
	//   13   27:aload_1         
	//   14   28:checkcast       #129 <Class BigDecimal>
	//   15   31:invokevirtual   #132 <Method BigInteger BigDecimal.toBigInteger()>
	//   16   34:areturn         
		else
			return BigInteger.valueOf(number.longValue());
	//   17   35:aload_1         
	//   18   36:invokevirtual   #138 <Method long Number.longValue()>
	//   19   39:invokestatic    #142 <Method BigInteger BigInteger.valueOf(long)>
	//   20   42:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException, JsonParseException
	{
		if(_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field JsonToken _currToken>
	//*   2    4:getstatic       #147 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   3    7:if_acmpne       30
		{
			Object obj = _currentObject();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #149 <Method Object _currentObject()>
	//    6   14:astore_2        
			if(obj instanceof byte[])
	//*   7   15:aload_2         
	//*   8   16:instanceof      #151 <Class byte[]>
	//*   9   19:ifeq            30
				return (byte[])(byte[])obj;
	//   10   22:aload_2         
	//   11   23:checkcast       #151 <Class byte[]>
	//   12   26:checkcast       #151 <Class byte[]>
	//   13   29:areturn         
		}
		if(_currToken != JsonToken.VALUE_STRING)
	//*  14   30:aload_0         
	//*  15   31:getfield        #60  <Field JsonToken _currToken>
	//*  16   34:getstatic       #154 <Field JsonToken JsonToken.VALUE_STRING>
	//*  17   37:if_acmpeq       72
			throw _constructError((new StringBuilder()).append("Current token (").append(((Object) (_currToken))).append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary").toString());
	//   18   40:aload_0         
	//   19   41:new             #68  <Class StringBuilder>
	//   20   44:dup             
	//   21   45:invokespecial   #70  <Method void StringBuilder()>
	//   22   48:ldc1            #72  <String "Current token (">
	//   23   50:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   24   53:aload_0         
	//   25   54:getfield        #60  <Field JsonToken _currToken>
	//   26   57:invokevirtual   #79  <Method StringBuilder StringBuilder.append(Object)>
	//   27   60:ldc1            #156 <String ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary">
	//   28   62:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   29   65:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   30   68:invokevirtual   #89  <Method JsonParseException _constructError(String)>
	//   31   71:athrow          
		String s = getText();
	//   32   72:aload_0         
	//   33   73:invokevirtual   #159 <Method String getText()>
	//   34   76:astore_3        
		if(s == null)
	//*  35   77:aload_3         
	//*  36   78:ifnonnull       83
			return null;
	//   37   81:aconst_null     
	//   38   82:areturn         
		ByteArrayBuilder bytearraybuilder = _byteBuilder;
	//   39   83:aload_0         
	//   40   84:getfield        #161 <Field ByteArrayBuilder _byteBuilder>
	//   41   87:astore_2        
		if(bytearraybuilder == null)
	//*  42   88:aload_2         
	//*  43   89:ifnonnull       119
		{
			bytearraybuilder = new ByteArrayBuilder(100);
	//   44   92:new             #163 <Class ByteArrayBuilder>
	//   45   95:dup             
	//   46   96:bipush          100
	//   47   98:invokespecial   #164 <Method void ByteArrayBuilder(int)>
	//   48  101:astore_2        
			_byteBuilder = bytearraybuilder;
	//   49  102:aload_0         
	//   50  103:aload_2         
	//   51  104:putfield        #161 <Field ByteArrayBuilder _byteBuilder>
		} else
	//*  52  107:aload_0         
	//*  53  108:aload_3         
	//*  54  109:aload_2         
	//*  55  110:aload_1         
	//*  56  111:invokevirtual   #168 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
	//*  57  114:aload_2         
	//*  58  115:invokevirtual   #172 <Method byte[] ByteArrayBuilder.toByteArray()>
	//*  59  118:areturn         
		{
			_byteBuilder.reset();
	//   60  119:aload_0         
	//   61  120:getfield        #161 <Field ByteArrayBuilder _byteBuilder>
	//   62  123:invokevirtual   #175 <Method void ByteArrayBuilder.reset()>
		}
		_decodeBase64(s, bytearraybuilder, base64variant);
		return bytearraybuilder.toByteArray();
	//*  63  126:goto            107
	}

	public ObjectCodec getCodec()
	{
		return _codec;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field ObjectCodec _codec>
	//    2    4:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		if(_location == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field JsonLocation _location>
	//*   2    4:ifnonnull       11
			return JsonLocation.NA;
	//    3    7:getstatic       #184 <Field JsonLocation JsonLocation.NA>
	//    4   10:areturn         
		else
			return _location;
	//    5   11:aload_0         
	//    6   12:getfield        #31  <Field JsonLocation _location>
	//    7   15:areturn         
	}

	public String getCurrentName()
	{
		if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field JsonToken _currToken>
	//*   2    4:getstatic       #188 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       20
	//*   4   10:aload_0         
	//*   5   11:getfield        #60  <Field JsonToken _currToken>
	//*   6   14:getstatic       #191 <Field JsonToken JsonToken.START_ARRAY>
	//*   7   17:if_acmpne       31
			return _parsingContext.getParent().getCurrentName();
	//    8   20:aload_0         
	//    9   21:getfield        #45  <Field JsonReadContext _parsingContext>
	//   10   24:invokevirtual   #195 <Method JsonReadContext JsonReadContext.getParent()>
	//   11   27:invokevirtual   #197 <Method String JsonReadContext.getCurrentName()>
	//   12   30:areturn         
		else
			return _parsingContext.getCurrentName();
	//   13   31:aload_0         
	//   14   32:getfield        #45  <Field JsonReadContext _parsingContext>
	//   15   35:invokevirtual   #197 <Method String JsonReadContext.getCurrentName()>
	//   16   38:areturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException
	{
		Number number = getNumberValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method Number getNumberValue()>
	//    2    4:astore_1        
		if(number instanceof BigDecimal)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #129 <Class BigDecimal>
	//*   5    9:ifeq            17
			return (BigDecimal)number;
	//    6   12:aload_1         
	//    7   13:checkcast       #129 <Class BigDecimal>
	//    8   16:areturn         
		switch(TokenBuffer._cls1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[getNumberType().ordinal()])
	//*   9   17:getstatic       #205 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  10   20:aload_0         
	//*  11   21:invokevirtual   #121 <Method com.fasterxml.jackson.core.JsonParser$NumberType getNumberType()>
	//*  12   24:invokevirtual   #209 <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  13   27:iaload          
		{
	//*  14   28:tableswitch     1 5: default 64
	//	               1 72
	//	               2 80
	//	               3 64
	//	               4 64
	//	               5 72
		case 3: // '\003'
		case 4: // '\004'
		default:
			return BigDecimal.valueOf(number.doubleValue());
	//   15   64:aload_1         
	//   16   65:invokevirtual   #213 <Method double Number.doubleValue()>
	//   17   68:invokestatic    #216 <Method BigDecimal BigDecimal.valueOf(double)>
	//   18   71:areturn         

		case 1: // '\001'
		case 5: // '\005'
			return BigDecimal.valueOf(number.longValue());
	//   19   72:aload_1         
	//   20   73:invokevirtual   #138 <Method long Number.longValue()>
	//   21   76:invokestatic    #219 <Method BigDecimal BigDecimal.valueOf(long)>
	//   22   79:areturn         

		case 2: // '\002'
			return new BigDecimal((BigInteger)number);
	//   23   80:new             #129 <Class BigDecimal>
	//   24   83:dup             
	//   25   84:aload_1         
	//   26   85:checkcast       #117 <Class BigInteger>
	//   27   88:invokespecial   #222 <Method void BigDecimal(BigInteger)>
	//   28   91:areturn         
		}
	}

	public double getDoubleValue()
		throws IOException
	{
		return getNumberValue().doubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method Number getNumberValue()>
	//    2    4:invokevirtual   #213 <Method double Number.doubleValue()>
	//    3    7:dreturn         
	}

	public Object getEmbeddedObject()
	{
		if(_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field JsonToken _currToken>
	//*   2    4:getstatic       #147 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   3    7:if_acmpne       15
			return _currentObject();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #149 <Method Object _currentObject()>
	//    6   14:areturn         
		else
			return ((Object) (null));
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public float getFloatValue()
		throws IOException
	{
		return getNumberValue().floatValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method Number getNumberValue()>
	//    2    4:invokevirtual   #229 <Method float Number.floatValue()>
	//    3    7:freturn         
	}

	public int getIntValue()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #60  <Field JsonToken _currToken>
	//*   2    4:getstatic       #233 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       21
			return ((Number)_currentObject()).intValue();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #149 <Method Object _currentObject()>
	//    6   14:checkcast       #134 <Class Number>
	//    7   17:invokevirtual   #236 <Method int Number.intValue()>
	//    8   20:ireturn         
		else
			return getNumberValue().intValue();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #115 <Method Number getNumberValue()>
	//   11   25:invokevirtual   #236 <Method int Number.intValue()>
	//   12   28:ireturn         
	}

	public long getLongValue()
		throws IOException
	{
		return getNumberValue().longValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method Number getNumberValue()>
	//    2    4:invokevirtual   #138 <Method long Number.longValue()>
	//    3    7:lreturn         
	}

	public com.fasterxml.jackson.core.pe getNumberType()
		throws IOException
	{
		Number number = getNumberValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #115 <Method Number getNumberValue()>
	//    2    4:astore_1        
		if(number instanceof Integer)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #239 <Class Integer>
	//*   5    9:ifeq            16
			return com.fasterxml.jackson.core.pe.INT;
	//    6   12:getstatic       #242 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//    7   15:areturn         
		if(number instanceof Long)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #244 <Class Long>
	//*  10   20:ifeq            27
			return com.fasterxml.jackson.core.pe.LONG;
	//   11   23:getstatic       #247 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//   12   26:areturn         
		if(number instanceof Double)
	//*  13   27:aload_1         
	//*  14   28:instanceof      #249 <Class Double>
	//*  15   31:ifeq            38
			return com.fasterxml.jackson.core.pe.DOUBLE;
	//   16   34:getstatic       #252 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
	//   17   37:areturn         
		if(number instanceof BigDecimal)
	//*  18   38:aload_1         
	//*  19   39:instanceof      #129 <Class BigDecimal>
	//*  20   42:ifeq            49
			return com.fasterxml.jackson.core.pe.BIG_DECIMAL;
	//   21   45:getstatic       #127 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//   22   48:areturn         
		if(number instanceof BigInteger)
	//*  23   49:aload_1         
	//*  24   50:instanceof      #117 <Class BigInteger>
	//*  25   53:ifeq            60
			return com.fasterxml.jackson.core.pe.BIG_INTEGER;
	//   26   56:getstatic       #255 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//   27   59:areturn         
		if(number instanceof Float)
	//*  28   60:aload_1         
	//*  29   61:instanceof      #257 <Class Float>
	//*  30   64:ifeq            71
			return com.fasterxml.jackson.core.pe.FLOAT;
	//   31   67:getstatic       #260 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
	//   32   70:areturn         
		if(number instanceof Short)
	//*  33   71:aload_1         
	//*  34   72:instanceof      #262 <Class Short>
	//*  35   75:ifeq            82
			return com.fasterxml.jackson.core.pe.INT;
	//   36   78:getstatic       #242 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//   37   81:areturn         
		else
			return null;
	//   38   82:aconst_null     
	//   39   83:areturn         
	}

	public final Number getNumberValue()
		throws IOException
	{
		_checkIsNumber();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method void _checkIsNumber()>
		Object obj = _currentObject();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #149 <Method Object _currentObject()>
	//    4    8:astore_1        
		if(obj instanceof Number)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #134 <Class Number>
	//*   7   13:ifeq            21
			return (Number)obj;
	//    8   16:aload_1         
	//    9   17:checkcast       #134 <Class Number>
	//   10   20:areturn         
		if(obj instanceof String)
	//*  11   21:aload_1         
	//*  12   22:instanceof      #266 <Class String>
	//*  13   25:ifeq            58
		{
			obj = ((Object) ((String)obj));
	//   14   28:aload_1         
	//   15   29:checkcast       #266 <Class String>
	//   16   32:astore_1        
			if(((String) (obj)).indexOf('.') >= 0)
	//*  17   33:aload_1         
	//*  18   34:bipush          46
	//*  19   36:invokevirtual   #270 <Method int String.indexOf(int)>
	//*  20   39:iflt            50
				return ((Number) (Double.valueOf(Double.parseDouble(((String) (obj))))));
	//   21   42:aload_1         
	//   22   43:invokestatic    #274 <Method double Double.parseDouble(String)>
	//   23   46:invokestatic    #277 <Method Double Double.valueOf(double)>
	//   24   49:areturn         
			else
				return ((Number) (Long.valueOf(Long.parseLong(((String) (obj))))));
	//   25   50:aload_1         
	//   26   51:invokestatic    #281 <Method long Long.parseLong(String)>
	//   27   54:invokestatic    #284 <Method Long Long.valueOf(long)>
	//   28   57:areturn         
		}
		if(obj == null)
	//*  29   58:aload_1         
	//*  30   59:ifnonnull       64
			return null;
	//   31   62:aconst_null     
	//   32   63:areturn         
		else
			throw new IllegalStateException((new StringBuilder()).append("Internal error: entry should be a Number, but is of type ").append(obj.getClass().getName()).toString());
	//   33   64:new             #286 <Class IllegalStateException>
	//   34   67:dup             
	//   35   68:new             #68  <Class StringBuilder>
	//   36   71:dup             
	//   37   72:invokespecial   #70  <Method void StringBuilder()>
	//   38   75:ldc2            #288 <String "Internal error: entry should be a Number, but is of type ">
	//   39   78:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   40   81:aload_1         
	//   41   82:invokevirtual   #294 <Method Class Object.getClass()>
	//   42   85:invokevirtual   #299 <Method String Class.getName()>
	//   43   88:invokevirtual   #76  <Method StringBuilder StringBuilder.append(String)>
	//   44   91:invokevirtual   #85  <Method String StringBuilder.toString()>
	//   45   94:invokespecial   #302 <Method void IllegalStateException(String)>
	//   46   97:athrow          
	}

	public Object getObjectId()
	{
		return _segment.findObjectId(_segmentPtr);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int _segmentPtr>
	//    4    8:invokevirtual   #306 <Method Object TokenBuffer$Segment.findObjectId(int)>
	//    5   11:areturn         
	}

	public JsonStreamContext getParsingContext()
	{
		return ((JsonStreamContext) (_parsingContext));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field JsonReadContext _parsingContext>
	//    2    4:areturn         
	}

	public String getText()
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		if(_currToken != JsonToken.VALUE_STRING && _currToken != JsonToken.FIELD_NAME) goto _L2; else goto _L1
	//    2    2:aload_0         
	//    3    3:getfield        #60  <Field JsonToken _currToken>
	//    4    6:getstatic       #154 <Field JsonToken JsonToken.VALUE_STRING>
	//    5    9:if_acmpeq       22
	//    6   12:aload_0         
	//    7   13:getfield        #60  <Field JsonToken _currToken>
	//    8   16:getstatic       #311 <Field JsonToken JsonToken.FIELD_NAME>
	//    9   19:if_acmpne       52
_L1:
		Object obj1 = _currentObject();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #149 <Method Object _currentObject()>
	//   12   26:astore_3        
		if(!(obj1 instanceof String)) goto _L4; else goto _L3
	//   13   27:aload_3         
	//   14   28:instanceof      #266 <Class String>
	//   15   31:ifeq            41
_L3:
		String s = (String)obj1;
	//   16   34:aload_3         
	//   17   35:checkcast       #266 <Class String>
	//   18   38:astore_1        
_L6:
		return s;
	//   19   39:aload_1         
	//   20   40:areturn         
_L4:
		s = ((String) (obj));
	//   21   41:aload_2         
	//   22   42:astore_1        
		if(obj1 != null)
	//*  23   43:aload_3         
	//*  24   44:ifnull          39
			return obj1.toString();
	//   25   47:aload_3         
	//   26   48:invokevirtual   #312 <Method String Object.toString()>
	//   27   51:areturn         
		continue; /* Loop/switch isn't completed */
_L2:
		s = ((String) (obj));
	//   28   52:aload_2         
	//   29   53:astore_1        
		if(_currToken != null)
	//*  30   54:aload_0         
	//*  31   55:getfield        #60  <Field JsonToken _currToken>
	//*  32   58:ifnull          39
		{
			Object obj2;
			switch(TokenBuffer._cls1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[_currToken.ordinal()])
	//*  33   61:getstatic       #315 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  34   64:aload_0         
	//*  35   65:getfield        #60  <Field JsonToken _currToken>
	//*  36   68:invokevirtual   #316 <Method int JsonToken.ordinal()>
	//*  37   71:iaload          
			{
	//*  38   72:tableswitch     7 8: default 96
	//	               7 104
	//	               8 104
			default:
				return _currToken.asString();
	//   39   96:aload_0         
	//   40   97:getfield        #60  <Field JsonToken _currToken>
	//   41  100:invokevirtual   #319 <Method String JsonToken.asString()>
	//   42  103:areturn         

			case 7: // '\007'
			case 8: // '\b'
				obj2 = _currentObject();
	//   43  104:aload_0         
	//   44  105:invokevirtual   #149 <Method Object _currentObject()>
	//   45  108:astore_3        
				break;
			}
			s = ((String) (obj));
	//   46  109:aload_2         
	//   47  110:astore_1        
			if(obj2 != null)
	//*  48  111:aload_3         
	//*  49  112:ifnull          39
				return obj2.toString();
	//   50  115:aload_3         
	//   51  116:invokevirtual   #312 <Method String Object.toString()>
	//   52  119:areturn         
		}
		if(true) goto _L6; else goto _L5
_L5:
	}

	public char[] getTextCharacters()
	{
		String s = getText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method String getText()>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return s.toCharArray();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #324 <Method char[] String.toCharArray()>
	//    9   15:areturn         
	}

	public int getTextLength()
	{
		String s = getText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #159 <Method String getText()>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return s.length();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #328 <Method int String.length()>
	//    9   15:ireturn         
	}

	public int getTextOffset()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return getCurrentLocation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #332 <Method JsonLocation getCurrentLocation()>
	//    2    4:areturn         
	}

	public Object getTypeId()
	{
		return _segment.findTypeId(_segmentPtr);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int _segmentPtr>
	//    4    8:invokevirtual   #336 <Method Object TokenBuffer$Segment.findTypeId(int)>
	//    5   11:areturn         
	}

	public boolean hasTextCharacters()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isClosed()
	{
		return _closed;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean _closed>
	//    2    4:ireturn         
	}

	public String nextFieldName()
		throws IOException
	{
		if(!_closed && _segment != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field boolean _closed>
	//*   2    4:ifne            14
	//*   3    7:aload_0         
	//*   4    8:getfield        #33  <Field TokenBuffer$Segment _segment>
	//*   5   11:ifnonnull       16
	//*   6   14:aconst_null     
	//*   7   15:areturn         
		{
			int i = _segmentPtr + 1;
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field int _segmentPtr>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:istore_1        
			if(i < 16 && _segment.type(i) == JsonToken.FIELD_NAME)
	//*  13   23:iload_1         
	//*  14   24:bipush          16
	//*  15   26:icmpge          87
	//*  16   29:aload_0         
	//*  17   30:getfield        #33  <Field TokenBuffer$Segment _segment>
	//*  18   33:iload_1         
	//*  19   34:invokevirtual   #343 <Method JsonToken TokenBuffer$Segment.type(int)>
	//*  20   37:getstatic       #311 <Field JsonToken JsonToken.FIELD_NAME>
	//*  21   40:if_acmpne       87
			{
				_segmentPtr = i;
	//   22   43:aload_0         
	//   23   44:iload_1         
	//   24   45:putfield        #35  <Field int _segmentPtr>
				Object obj = _segment.get(i);
	//   25   48:aload_0         
	//   26   49:getfield        #33  <Field TokenBuffer$Segment _segment>
	//   27   52:iload_1         
	//   28   53:invokevirtual   #98  <Method Object TokenBuffer$Segment.get(int)>
	//   29   56:astore_2        
				if(obj instanceof String)
	//*  30   57:aload_2         
	//*  31   58:instanceof      #266 <Class String>
	//*  32   61:ifeq            79
					obj = ((Object) ((String)obj));
	//   33   64:aload_2         
	//   34   65:checkcast       #266 <Class String>
	//   35   68:astore_2        
				else
	//*  36   69:aload_0         
	//*  37   70:getfield        #45  <Field JsonReadContext _parsingContext>
	//*  38   73:aload_2         
	//*  39   74:invokevirtual   #346 <Method void JsonReadContext.setCurrentName(String)>
	//*  40   77:aload_2         
	//*  41   78:areturn         
					obj = ((Object) (obj.toString()));
	//   42   79:aload_2         
	//   43   80:invokevirtual   #312 <Method String Object.toString()>
	//   44   83:astore_2        
				_parsingContext.setCurrentName(((String) (obj)));
				return ((String) (obj));
			}
	//*  45   84:goto            69
			if(nextToken() == JsonToken.FIELD_NAME)
	//*  46   87:aload_0         
	//*  47   88:invokevirtual   #350 <Method JsonToken nextToken()>
	//*  48   91:getstatic       #311 <Field JsonToken JsonToken.FIELD_NAME>
	//*  49   94:if_acmpne       14
				return getCurrentName();
	//   50   97:aload_0         
	//   51   98:invokevirtual   #351 <Method String getCurrentName()>
	//   52  101:areturn         
		}
		return null;
	}

	public JsonToken nextToken()
		throws IOException
	{
		if(!_closed && _segment != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field boolean _closed>
	//    2    4:ifne            14
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    5   11:ifnonnull       16
_L1:
		return null;
	//    6   14:aconst_null     
	//    7   15:areturn         
_L2:
		int i = _segmentPtr + 1;
	//    8   16:aload_0         
	//    9   17:getfield        #35  <Field int _segmentPtr>
	//   10   20:iconst_1        
	//   11   21:iadd            
	//   12   22:istore_1        
		_segmentPtr = i;
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:putfield        #35  <Field int _segmentPtr>
		if(i < 16)
			break; /* Loop/switch isn't completed */
	//   16   28:iload_1         
	//   17   29:bipush          16
	//   18   31:icmplt          57
		_segmentPtr = 0;
	//   19   34:aload_0         
	//   20   35:iconst_0        
	//   21   36:putfield        #35  <Field int _segmentPtr>
		_segment = _segment.next();
	//   22   39:aload_0         
	//   23   40:aload_0         
	//   24   41:getfield        #33  <Field TokenBuffer$Segment _segment>
	//   25   44:invokevirtual   #355 <Method TokenBuffer$Segment TokenBuffer$Segment.next()>
	//   26   47:putfield        #33  <Field TokenBuffer$Segment _segment>
		if(_segment == null) goto _L1; else goto _L3
	//   27   50:aload_0         
	//   28   51:getfield        #33  <Field TokenBuffer$Segment _segment>
	//   29   54:ifnull          14
_L3:
		_currToken = _segment.type(_segmentPtr);
	//   30   57:aload_0         
	//   31   58:aload_0         
	//   32   59:getfield        #33  <Field TokenBuffer$Segment _segment>
	//   33   62:aload_0         
	//   34   63:getfield        #35  <Field int _segmentPtr>
	//   35   66:invokevirtual   #343 <Method JsonToken TokenBuffer$Segment.type(int)>
	//   36   69:putfield        #60  <Field JsonToken _currToken>
		if(_currToken != JsonToken.FIELD_NAME) goto _L5; else goto _L4
	//   37   72:aload_0         
	//   38   73:getfield        #60  <Field JsonToken _currToken>
	//   39   76:getstatic       #311 <Field JsonToken JsonToken.FIELD_NAME>
	//   40   79:if_acmpne       120
_L4:
		Object obj = _currentObject();
	//   41   82:aload_0         
	//   42   83:invokevirtual   #149 <Method Object _currentObject()>
	//   43   86:astore_2        
		if(obj instanceof String)
	//*  44   87:aload_2         
	//*  45   88:instanceof      #266 <Class String>
	//*  46   91:ifeq            112
			obj = ((Object) ((String)obj));
	//   47   94:aload_2         
	//   48   95:checkcast       #266 <Class String>
	//   49   98:astore_2        
		else
	//*  50   99:aload_0         
	//*  51  100:getfield        #45  <Field JsonReadContext _parsingContext>
	//*  52  103:aload_2         
	//*  53  104:invokevirtual   #346 <Method void JsonReadContext.setCurrentName(String)>
	//*  54  107:aload_0         
	//*  55  108:getfield        #60  <Field JsonToken _currToken>
	//*  56  111:areturn         
			obj = ((Object) (obj.toString()));
	//   57  112:aload_2         
	//   58  113:invokevirtual   #312 <Method String Object.toString()>
	//   59  116:astore_2        
		_parsingContext.setCurrentName(((String) (obj)));
_L7:
		return _currToken;
	//*  60  117:goto            99
_L5:
		if(_currToken == JsonToken.START_OBJECT)
	//*  61  120:aload_0         
	//*  62  121:getfield        #60  <Field JsonToken _currToken>
	//*  63  124:getstatic       #188 <Field JsonToken JsonToken.START_OBJECT>
	//*  64  127:if_acmpne       146
			_parsingContext = _parsingContext.createChildObjectContext(-1, -1);
	//   65  130:aload_0         
	//   66  131:aload_0         
	//   67  132:getfield        #45  <Field JsonReadContext _parsingContext>
	//   68  135:iconst_m1       
	//   69  136:iconst_m1       
	//   70  137:invokevirtual   #359 <Method JsonReadContext JsonReadContext.createChildObjectContext(int, int)>
	//   71  140:putfield        #45  <Field JsonReadContext _parsingContext>
		else
	//*  72  143:goto            107
		if(_currToken == JsonToken.START_ARRAY)
	//*  73  146:aload_0         
	//*  74  147:getfield        #60  <Field JsonToken _currToken>
	//*  75  150:getstatic       #191 <Field JsonToken JsonToken.START_ARRAY>
	//*  76  153:if_acmpne       172
			_parsingContext = _parsingContext.createChildArrayContext(-1, -1);
	//   77  156:aload_0         
	//   78  157:aload_0         
	//   79  158:getfield        #45  <Field JsonReadContext _parsingContext>
	//   80  161:iconst_m1       
	//   81  162:iconst_m1       
	//   82  163:invokevirtual   #362 <Method JsonReadContext JsonReadContext.createChildArrayContext(int, int)>
	//   83  166:putfield        #45  <Field JsonReadContext _parsingContext>
		else
	//*  84  169:goto            107
		if(_currToken == JsonToken.END_OBJECT || _currToken == JsonToken.END_ARRAY)
	//*  85  172:aload_0         
	//*  86  173:getfield        #60  <Field JsonToken _currToken>
	//*  87  176:getstatic       #365 <Field JsonToken JsonToken.END_OBJECT>
	//*  88  179:if_acmpeq       192
	//*  89  182:aload_0         
	//*  90  183:getfield        #60  <Field JsonToken _currToken>
	//*  91  186:getstatic       #368 <Field JsonToken JsonToken.END_ARRAY>
	//*  92  189:if_acmpne       107
		{
			_parsingContext = _parsingContext.getParent();
	//   93  192:aload_0         
	//   94  193:aload_0         
	//   95  194:getfield        #45  <Field JsonReadContext _parsingContext>
	//   96  197:invokevirtual   #195 <Method JsonReadContext JsonReadContext.getParent()>
	//   97  200:putfield        #45  <Field JsonReadContext _parsingContext>
			if(_parsingContext == null)
	//*  98  203:aload_0         
	//*  99  204:getfield        #45  <Field JsonReadContext _parsingContext>
	//* 100  207:ifnonnull       107
				_parsingContext = JsonReadContext.createRootContext(((com.fasterxml.jackson.core.json.DupDetector) (null)));
	//  101  210:aload_0         
	//  102  211:aconst_null     
	//  103  212:invokestatic    #43  <Method JsonReadContext JsonReadContext.createRootContext(com.fasterxml.jackson.core.json.DupDetector)>
	//  104  215:putfield        #45  <Field JsonReadContext _parsingContext>
		}
		if(true) goto _L7; else goto _L6
	//  105  218:goto            107
_L6:
	}

	public void overrideCurrentName(String s)
	{
		JsonReadContext jsonreadcontext;
label0:
		{
			JsonReadContext jsonreadcontext1 = _parsingContext;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field JsonReadContext _parsingContext>
	//    2    4:astore_3        
			if(_currToken != JsonToken.START_OBJECT)
	//*   3    5:aload_0         
	//*   4    6:getfield        #60  <Field JsonToken _currToken>
	//*   5    9:getstatic       #188 <Field JsonToken JsonToken.START_OBJECT>
	//*   6   12:if_acmpeq       27
			{
				jsonreadcontext = jsonreadcontext1;
	//    7   15:aload_3         
	//    8   16:astore_2        
				if(_currToken != JsonToken.START_ARRAY)
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #60  <Field JsonToken _currToken>
	//   11   21:getstatic       #191 <Field JsonToken JsonToken.START_ARRAY>
	//   12   24:if_acmpne       32
			}
			jsonreadcontext = jsonreadcontext1.getParent();
	//   13   27:aload_3         
	//   14   28:invokevirtual   #195 <Method JsonReadContext JsonReadContext.getParent()>
	//   15   31:astore_2        
		}
		try
		{
			jsonreadcontext.setCurrentName(s);
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #346 <Method void JsonReadContext.setCurrentName(String)>
			return;
	//   19   37:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   38:astore_1        
		{
			throw new RuntimeException(((Throwable) (s)));
	//   21   39:new             #371 <Class RuntimeException>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokespecial   #374 <Method void RuntimeException(Throwable)>
	//   25   47:athrow          
		}
	}

	public JsonToken peekNextToken()
		throws IOException
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #109 <Field boolean _closed>
	//*   2    4:ifeq            9
	//*   3    7:aconst_null     
	//*   4    8:areturn         
		{
			 1 = _segment;
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    7   13:astore          4
			int j = _segmentPtr + 1;
	//    8   15:aload_0         
	//    9   16:getfield        #35  <Field int _segmentPtr>
	//   10   19:iconst_1        
	//   11   20:iadd            
	//   12   21:istore_2        
			int i = j;
	//   13   22:iload_2         
	//   14   23:istore_1        
			  = 1;
	//   15   24:aload           4
	//   16   26:astore_3        
			if(j >= 16)
	//*  17   27:iload_2         
	//*  18   28:bipush          16
	//*  19   30:icmplt          42
			{
				i = 0;
	//   20   33:iconst_0        
	//   21   34:istore_1        
				if(1 == null)
	//*  22   35:aload           4
	//*  23   37:ifnonnull       52
					 = null;
	//   24   40:aconst_null     
	//   25   41:astore_3        
				else
	//*  26   42:aload_3         
	//*  27   43:ifnull          7
	//*  28   46:aload_3         
	//*  29   47:iload_1         
	//*  30   48:invokevirtual   #343 <Method JsonToken TokenBuffer$Segment.type(int)>
	//*  31   51:areturn         
					 = 1.next();
	//   32   52:aload           4
	//   33   54:invokevirtual   #355 <Method TokenBuffer$Segment TokenBuffer$Segment.next()>
	//   34   57:astore_3        
			}
			if( != null)
				return .type(i);
		}
		return null;
	//*  35   58:goto            42
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokevirtual   #379 <Method byte[] getBinaryValue(Base64Variant)>
	//    5    7:astore_1        
		if(base64variant != null)
	//*   6    8:aload_1         
	//*   7    9:ifnull          23
		{
			outputstream.write(((byte []) (base64variant)), 0, base64variant.length);
	//    8   12:aload_2         
	//    9   13:aload_1         
	//   10   14:iconst_0        
	//   11   15:aload_1         
	//   12   16:arraylength     
	//   13   17:invokevirtual   #385 <Method void OutputStream.write(byte[], int, int)>
			i = base64variant.length;
	//   14   20:aload_1         
	//   15   21:arraylength     
	//   16   22:istore_3        
		}
		return i;
	//   17   23:iload_3         
	//   18   24:ireturn         
	}

	public void setCodec(ObjectCodec objectcodec)
	{
		_codec = objectcodec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #37  <Field ObjectCodec _codec>
	//    3    5:return          
	}

	public void setLocation(JsonLocation jsonlocation)
	{
		_location = jsonlocation;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #31  <Field JsonLocation _location>
	//    3    5:return          
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #397 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	protected transient ByteArrayBuilder _byteBuilder;
	protected boolean _closed;
	protected ObjectCodec _codec;
	protected final boolean _hasNativeIds;
	protected final boolean _hasNativeObjectIds;
	protected final boolean _hasNativeTypeIds;
	protected JsonLocation _location;
	protected JsonReadContext _parsingContext;
	protected  _segment;
	protected int _segmentPtr;

	public TokenBuffer$Parser( , ObjectCodec objectcodec, boolean flag, boolean flag1)
	{
		super(0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #29  <Method void ParserMinimalBase(int)>
		_location = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #31  <Field JsonLocation _location>
		_segment = ;
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:putfield        #33  <Field TokenBuffer$Segment _segment>
		_segmentPtr = -1;
	//    9   15:aload_0         
	//   10   16:iconst_m1       
	//   11   17:putfield        #35  <Field int _segmentPtr>
		_codec = objectcodec;
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:putfield        #37  <Field ObjectCodec _codec>
		_parsingContext = JsonReadContext.createRootContext(((com.fasterxml.jackson.core.json.DupDetector) (null)));
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:invokestatic    #43  <Method JsonReadContext JsonReadContext.createRootContext(com.fasterxml.jackson.core.json.DupDetector)>
	//   18   30:putfield        #45  <Field JsonReadContext _parsingContext>
		_hasNativeTypeIds = flag;
	//   19   33:aload_0         
	//   20   34:iload_3         
	//   21   35:putfield        #47  <Field boolean _hasNativeTypeIds>
		_hasNativeObjectIds = flag1;
	//   22   38:aload_0         
	//   23   39:iload           4
	//   24   41:putfield        #49  <Field boolean _hasNativeObjectIds>
		_hasNativeIds = flag | flag1;
	//   25   44:aload_0         
	//   26   45:iload_3         
	//   27   46:iload           4
	//   28   48:ior             
	//   29   49:putfield        #51  <Field boolean _hasNativeIds>
	//   30   52:return          
	}
}
