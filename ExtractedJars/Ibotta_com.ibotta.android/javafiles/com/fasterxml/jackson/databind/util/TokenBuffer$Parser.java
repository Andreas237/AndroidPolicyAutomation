// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			TokenBuffer, TokenBufferReadContext, ClassUtil

protected static final class TokenBuffer$Parser extends ParserMinimalBase
{

	private final boolean _smallerThanInt(Number number)
	{
		return (number instanceof Short) || (number instanceof Byte);
	//    0    0:aload_1         
	//    1    1:instanceof      #56  <Class Short>
	//    2    4:ifne            19
	//    3    7:aload_1         
	//    4    8:instanceof      #58  <Class Byte>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	private final boolean _smallerThanLong(Number number)
	{
		return (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
	//    0    0:aload_1         
	//    1    1:instanceof      #61  <Class Integer>
	//    2    4:ifne            26
	//    3    7:aload_1         
	//    4    8:instanceof      #56  <Class Short>
	//    5   11:ifne            26
	//    6   14:aload_1         
	//    7   15:instanceof      #58  <Class Byte>
	//    8   18:ifeq            24
	//    9   21:goto            26
	//   10   24:iconst_0        
	//   11   25:ireturn         
	//   12   26:iconst_1        
	//   13   27:ireturn         
	}

	protected final void _checkIsNumber()
		throws JsonParseException
	{
		if(_currToken != null && _currToken.isNumeric())
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field JsonToken _currToken>
	//*   2    4:ifnull          18
	//*   3    7:aload_0         
	//*   4    8:getfield        #69  <Field JsonToken _currToken>
	//*   5   11:invokevirtual   #75  <Method boolean JsonToken.isNumeric()>
	//*   6   14:ifeq            18
		{
			return;
	//    7   17:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   18:new             #77  <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #79  <Method void StringBuilder()>
	//   11   25:astore_1        
			stringbuilder.append("Current token (");
	//   12   26:aload_1         
	//   13   27:ldc1            #81  <String "Current token (">
	//   14   29:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
			stringbuilder.append(((Object) (_currToken)));
	//   16   33:aload_1         
	//   17   34:aload_0         
	//   18   35:getfield        #69  <Field JsonToken _currToken>
	//   19   38:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   20   41:pop             
			stringbuilder.append(") not numeric, cannot use numeric value accessors");
	//   21   42:aload_1         
	//   22   43:ldc1            #90  <String ") not numeric, cannot use numeric value accessors">
	//   23   45:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   24   48:pop             
			throw _constructError(stringbuilder.toString());
	//   25   49:aload_0         
	//   26   50:aload_1         
	//   27   51:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   28   54:invokevirtual   #98  <Method JsonParseException _constructError(String)>
	//   29   57:athrow          
		}
	}

	protected int _convertNumberToInt(Number number)
		throws IOException
	{
label0:
		{
			if(number instanceof Long)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #105 <Class Long>
	//*   2    4:ifeq            34
			{
				long l = number.longValue();
	//    3    7:aload_1         
	//    4    8:invokevirtual   #111 <Method long Number.longValue()>
	//    5   11:lstore          5
				int i = (int)l;
	//    6   13:lload           5
	//    7   15:l2i             
	//    8   16:istore          4
				if((long)i != l)
	//*   9   18:iload           4
	//*  10   20:i2l             
	//*  11   21:lload           5
	//*  12   23:lcmp            
	//*  13   24:ifeq            31
					reportOverflowInt();
	//   14   27:aload_0         
	//   15   28:invokevirtual   #114 <Method void reportOverflowInt()>
				return i;
	//   16   31:iload           4
	//   17   33:ireturn         
			}
			if(number instanceof BigInteger)
	//*  18   34:aload_1         
	//*  19   35:instanceof      #116 <Class BigInteger>
	//*  20   38:ifeq            76
			{
				BigInteger biginteger = (BigInteger)number;
	//   21   41:aload_1         
	//   22   42:checkcast       #116 <Class BigInteger>
	//   23   45:astore          7
				if(BI_MIN_INT.compareTo(biginteger) > 0 || BI_MAX_INT.compareTo(biginteger) < 0)
	//*  24   47:getstatic       #120 <Field BigInteger BI_MIN_INT>
	//*  25   50:aload           7
	//*  26   52:invokevirtual   #124 <Method int BigInteger.compareTo(BigInteger)>
	//*  27   55:ifgt            69
	//*  28   58:getstatic       #127 <Field BigInteger BI_MAX_INT>
	//*  29   61:aload           7
	//*  30   63:invokevirtual   #124 <Method int BigInteger.compareTo(BigInteger)>
	//*  31   66:ifge            139
					reportOverflowInt();
	//   32   69:aload_0         
	//   33   70:invokevirtual   #114 <Method void reportOverflowInt()>
			} else
	//*  34   73:goto            139
			{
				if((number instanceof Double) || (number instanceof Float))
	//*  35   76:aload_1         
	//*  36   77:instanceof      #129 <Class Double>
	//*  37   80:ifne            144
	//*  38   83:aload_1         
	//*  39   84:instanceof      #131 <Class Float>
	//*  40   87:ifeq            93
					break label0;
	//   41   90:goto            144
				if(number instanceof BigDecimal)
	//*  42   93:aload_1         
	//*  43   94:instanceof      #133 <Class BigDecimal>
	//*  44   97:ifeq            135
				{
					BigDecimal bigdecimal = (BigDecimal)number;
	//   45  100:aload_1         
	//   46  101:checkcast       #133 <Class BigDecimal>
	//   47  104:astore          7
					if(BD_MIN_INT.compareTo(bigdecimal) > 0 || BD_MAX_INT.compareTo(bigdecimal) < 0)
	//*  48  106:getstatic       #137 <Field BigDecimal BD_MIN_INT>
	//*  49  109:aload           7
	//*  50  111:invokevirtual   #140 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  51  114:ifgt            128
	//*  52  117:getstatic       #143 <Field BigDecimal BD_MAX_INT>
	//*  53  120:aload           7
	//*  54  122:invokevirtual   #140 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  55  125:ifge            139
						reportOverflowInt();
	//   56  128:aload_0         
	//   57  129:invokevirtual   #114 <Method void reportOverflowInt()>
				} else
	//*  58  132:goto            139
				{
					_throwInternal();
	//   59  135:aload_0         
	//   60  136:invokevirtual   #146 <Method void _throwInternal()>
				}
			}
			return number.intValue();
	//   61  139:aload_1         
	//   62  140:invokevirtual   #150 <Method int Number.intValue()>
	//   63  143:ireturn         
		}
		double d = number.doubleValue();
	//   64  144:aload_1         
	//   65  145:invokevirtual   #154 <Method double Number.doubleValue()>
	//   66  148:dstore_2        
		if(d < -2147483648D || d > 2147483647D)
	//*  67  149:dload_2         
	//*  68  150:ldc2w           #155 <Double -2147483648D>
	//*  69  153:dcmpg           
	//*  70  154:iflt            165
	//*  71  157:dload_2         
	//*  72  158:ldc2w           #157 <Double 2147483647D>
	//*  73  161:dcmpl           
	//*  74  162:ifle            169
			reportOverflowInt();
	//   75  165:aload_0         
	//   76  166:invokevirtual   #114 <Method void reportOverflowInt()>
		return (int)d;
	//   77  169:dload_2         
	//   78  170:d2i             
	//   79  171:ireturn         
	}

	protected long _convertNumberToLong(Number number)
		throws IOException
	{
label0:
		{
			if(number instanceof BigInteger)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #116 <Class BigInteger>
	//*   2    4:ifeq            42
			{
				BigInteger biginteger = (BigInteger)number;
	//    3    7:aload_1         
	//    4    8:checkcast       #116 <Class BigInteger>
	//    5   11:astore          4
				if(BI_MIN_LONG.compareTo(biginteger) > 0 || BI_MAX_LONG.compareTo(biginteger) < 0)
	//*   6   13:getstatic       #163 <Field BigInteger BI_MIN_LONG>
	//*   7   16:aload           4
	//*   8   18:invokevirtual   #124 <Method int BigInteger.compareTo(BigInteger)>
	//*   9   21:ifgt            35
	//*  10   24:getstatic       #166 <Field BigInteger BI_MAX_LONG>
	//*  11   27:aload           4
	//*  12   29:invokevirtual   #124 <Method int BigInteger.compareTo(BigInteger)>
	//*  13   32:ifge            105
					reportOverflowLong();
	//   14   35:aload_0         
	//   15   36:invokevirtual   #169 <Method void reportOverflowLong()>
			} else
	//*  16   39:goto            105
			{
				if((number instanceof Double) || (number instanceof Float))
	//*  17   42:aload_1         
	//*  18   43:instanceof      #129 <Class Double>
	//*  19   46:ifne            110
	//*  20   49:aload_1         
	//*  21   50:instanceof      #131 <Class Float>
	//*  22   53:ifeq            59
					break label0;
	//   23   56:goto            110
				if(number instanceof BigDecimal)
	//*  24   59:aload_1         
	//*  25   60:instanceof      #133 <Class BigDecimal>
	//*  26   63:ifeq            101
				{
					BigDecimal bigdecimal = (BigDecimal)number;
	//   27   66:aload_1         
	//   28   67:checkcast       #133 <Class BigDecimal>
	//   29   70:astore          4
					if(BD_MIN_LONG.compareTo(bigdecimal) > 0 || BD_MAX_LONG.compareTo(bigdecimal) < 0)
	//*  30   72:getstatic       #172 <Field BigDecimal BD_MIN_LONG>
	//*  31   75:aload           4
	//*  32   77:invokevirtual   #140 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  33   80:ifgt            94
	//*  34   83:getstatic       #175 <Field BigDecimal BD_MAX_LONG>
	//*  35   86:aload           4
	//*  36   88:invokevirtual   #140 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  37   91:ifge            105
						reportOverflowLong();
	//   38   94:aload_0         
	//   39   95:invokevirtual   #169 <Method void reportOverflowLong()>
				} else
	//*  40   98:goto            105
				{
					_throwInternal();
	//   41  101:aload_0         
	//   42  102:invokevirtual   #146 <Method void _throwInternal()>
				}
			}
			return number.longValue();
	//   43  105:aload_1         
	//   44  106:invokevirtual   #111 <Method long Number.longValue()>
	//   45  109:lreturn         
		}
		double d = number.doubleValue();
	//   46  110:aload_1         
	//   47  111:invokevirtual   #154 <Method double Number.doubleValue()>
	//   48  114:dstore_2        
		if(d < -9.2233720368547758E+18D || d > 9.2233720368547758E+18D)
	//*  49  115:dload_2         
	//*  50  116:ldc2w           #176 <Double -9.2233720368547758E+18D>
	//*  51  119:dcmpg           
	//*  52  120:iflt            131
	//*  53  123:dload_2         
	//*  54  124:ldc2w           #178 <Double 9.2233720368547758E+18D>
	//*  55  127:dcmpl           
	//*  56  128:ifle            135
			reportOverflowLong();
	//   57  131:aload_0         
	//   58  132:invokevirtual   #169 <Method void reportOverflowLong()>
		return (long)(int)d;
	//   59  135:dload_2         
	//   60  136:d2i             
	//   61  137:i2l             
	//   62  138:lreturn         
	}

	protected final Object _currentObject()
	{
		return _segment.get(_segmentPtr);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int _segmentPtr>
	//    4    8:invokevirtual   #187 <Method Object TokenBuffer$Segment.get(int)>
	//    5   11:areturn         
	}

	protected void _handleEOF()
		throws JsonParseException
	{
		_throwInternal();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #146 <Method void _throwInternal()>
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
	//*   1    1:getfield        #193 <Field boolean _closed>
	//*   2    4:ifne            12
			_closed = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #193 <Field boolean _closed>
	//    6   12:return          
	}

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		Number number = getNumberValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method Number getNumberValue()>
	//    2    4:astore_1        
		if(number instanceof BigInteger)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #116 <Class BigInteger>
	//*   5    9:ifeq            17
			return (BigInteger)number;
	//    6   12:aload_1         
	//    7   13:checkcast       #116 <Class BigInteger>
	//    8   16:areturn         
		if(getNumberType() == com.fasterxml.jackson.core.pe.BIG_DECIMAL)
	//*   9   17:aload_0         
	//*  10   18:invokevirtual   #203 <Method com.fasterxml.jackson.core.JsonParser$NumberType getNumberType()>
	//*  11   21:getstatic       #209 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//*  12   24:if_acmpne       35
			return ((BigDecimal)number).toBigInteger();
	//   13   27:aload_1         
	//   14   28:checkcast       #133 <Class BigDecimal>
	//   15   31:invokevirtual   #212 <Method BigInteger BigDecimal.toBigInteger()>
	//   16   34:areturn         
		else
			return BigInteger.valueOf(number.longValue());
	//   17   35:aload_1         
	//   18   36:invokevirtual   #111 <Method long Number.longValue()>
	//   19   39:invokestatic    #216 <Method BigInteger BigInteger.valueOf(long)>
	//   20   42:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException, JsonParseException
	{
		if(_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field JsonToken _currToken>
	//*   2    4:getstatic       #221 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   3    7:if_acmpne       27
		{
			Object obj = _currentObject();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #223 <Method Object _currentObject()>
	//    6   14:astore_2        
			if(obj instanceof byte[])
	//*   7   15:aload_2         
	//*   8   16:instanceof      #225 <Class byte[]>
	//*   9   19:ifeq            27
				return (byte[])obj;
	//   10   22:aload_2         
	//   11   23:checkcast       #225 <Class byte[]>
	//   12   26:areturn         
		}
		if(_currToken == JsonToken.VALUE_STRING)
	//*  13   27:aload_0         
	//*  14   28:getfield        #69  <Field JsonToken _currToken>
	//*  15   31:getstatic       #228 <Field JsonToken JsonToken.VALUE_STRING>
	//*  16   34:if_acmpne       91
		{
			String s = getText();
	//   17   37:aload_0         
	//   18   38:invokevirtual   #231 <Method String getText()>
	//   19   41:astore_3        
			if(s == null)
	//*  20   42:aload_3         
	//*  21   43:ifnonnull       48
				return null;
	//   22   46:aconst_null     
	//   23   47:areturn         
			ByteArrayBuilder bytearraybuilder = _byteBuilder;
	//   24   48:aload_0         
	//   25   49:getfield        #233 <Field ByteArrayBuilder _byteBuilder>
	//   26   52:astore_2        
			if(bytearraybuilder == null)
	//*  27   53:aload_2         
	//*  28   54:ifnonnull       75
			{
				bytearraybuilder = new ByteArrayBuilder(100);
	//   29   57:new             #235 <Class ByteArrayBuilder>
	//   30   60:dup             
	//   31   61:bipush          100
	//   32   63:invokespecial   #236 <Method void ByteArrayBuilder(int)>
	//   33   66:astore_2        
				_byteBuilder = bytearraybuilder;
	//   34   67:aload_0         
	//   35   68:aload_2         
	//   36   69:putfield        #233 <Field ByteArrayBuilder _byteBuilder>
			} else
	//*  37   72:goto            79
			{
				bytearraybuilder.reset();
	//   38   75:aload_2         
	//   39   76:invokevirtual   #239 <Method void ByteArrayBuilder.reset()>
			}
			_decodeBase64(s, bytearraybuilder, base64variant);
	//   40   79:aload_0         
	//   41   80:aload_3         
	//   42   81:aload_2         
	//   43   82:aload_1         
	//   44   83:invokevirtual   #243 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			return bytearraybuilder.toByteArray();
	//   45   86:aload_2         
	//   46   87:invokevirtual   #247 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   47   90:areturn         
		} else
		{
			base64variant = ((Base64Variant) (new StringBuilder()));
	//   48   91:new             #77  <Class StringBuilder>
	//   49   94:dup             
	//   50   95:invokespecial   #79  <Method void StringBuilder()>
	//   51   98:astore_1        
			((StringBuilder) (base64variant)).append("Current token (");
	//   52   99:aload_1         
	//   53  100:ldc1            #81  <String "Current token (">
	//   54  102:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   55  105:pop             
			((StringBuilder) (base64variant)).append(((Object) (_currToken)));
	//   56  106:aload_1         
	//   57  107:aload_0         
	//   58  108:getfield        #69  <Field JsonToken _currToken>
	//   59  111:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   60  114:pop             
			((StringBuilder) (base64variant)).append(") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary");
	//   61  115:aload_1         
	//   62  116:ldc1            #249 <String ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), cannot access as binary">
	//   63  118:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   64  121:pop             
			throw _constructError(((StringBuilder) (base64variant)).toString());
	//   65  122:aload_0         
	//   66  123:aload_1         
	//   67  124:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   68  127:invokevirtual   #98  <Method JsonParseException _constructError(String)>
	//   69  130:athrow          
		}
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
		JsonLocation jsonlocation1 = _location;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field JsonLocation _location>
	//    2    4:astore_2        
		JsonLocation jsonlocation = jsonlocation1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsonlocation1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       15
			jsonlocation = JsonLocation.NA;
	//    7   11:getstatic       #258 <Field JsonLocation JsonLocation.NA>
	//    8   14:astore_1        
		return jsonlocation;
	//    9   15:aload_1         
	//   10   16:areturn         
	}

	public String getCurrentName()
	{
		if(_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field JsonToken _currToken>
	//*   2    4:getstatic       #262 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       31
	//*   4   10:aload_0         
	//*   5   11:getfield        #69  <Field JsonToken _currToken>
	//*   6   14:getstatic       #265 <Field JsonToken JsonToken.START_ARRAY>
	//*   7   17:if_acmpne       23
	//*   8   20:goto            31
			return _parsingContext.getCurrentName();
	//    9   23:aload_0         
	//   10   24:getfield        #45  <Field TokenBufferReadContext _parsingContext>
	//   11   27:invokevirtual   #267 <Method String TokenBufferReadContext.getCurrentName()>
	//   12   30:areturn         
		else
			return _parsingContext.getParent().getCurrentName();
	//   13   31:aload_0         
	//   14   32:getfield        #45  <Field TokenBufferReadContext _parsingContext>
	//   15   35:invokevirtual   #271 <Method JsonStreamContext TokenBufferReadContext.getParent()>
	//   16   38:invokevirtual   #274 <Method String JsonStreamContext.getCurrentName()>
	//   17   41:areturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException
	{
		Number number = getNumberValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method Number getNumberValue()>
	//    2    4:astore_2        
		if(number instanceof BigDecimal)
	//*   3    5:aload_2         
	//*   4    6:instanceof      #133 <Class BigDecimal>
	//*   5    9:ifeq            17
			return (BigDecimal)number;
	//    6   12:aload_2         
	//    7   13:checkcast       #133 <Class BigDecimal>
	//    8   16:areturn         
		int i = TokenBuffer._cls1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[getNumberType().ordinal()];
	//    9   17:getstatic       #282 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #203 <Method com.fasterxml.jackson.core.JsonParser$NumberType getNumberType()>
	//   12   24:invokevirtual   #285 <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//   13   27:iaload          
	//   14   28:istore_1        
		if(i != 5)
	//*  15   29:iload_1         
	//*  16   30:iconst_5        
	//*  17   31:icmpeq          76
			switch(i)
	//*  18   34:iload_1         
			{
	//*  19   35:tableswitch     1 2: default 56
	//	               1 76
	//	               2 64
			default:
				return BigDecimal.valueOf(number.doubleValue());
	//   20   56:aload_2         
	//   21   57:invokevirtual   #154 <Method double Number.doubleValue()>
	//   22   60:invokestatic    #288 <Method BigDecimal BigDecimal.valueOf(double)>
	//   23   63:areturn         

			case 2: // '\002'
				return new BigDecimal((BigInteger)number);
	//   24   64:new             #133 <Class BigDecimal>
	//   25   67:dup             
	//   26   68:aload_2         
	//   27   69:checkcast       #116 <Class BigInteger>
	//   28   72:invokespecial   #291 <Method void BigDecimal(BigInteger)>
	//   29   75:areturn         

			case 1: // '\001'
				break;
			}
		return BigDecimal.valueOf(number.longValue());
	//   30   76:aload_2         
	//   31   77:invokevirtual   #111 <Method long Number.longValue()>
	//   32   80:invokestatic    #294 <Method BigDecimal BigDecimal.valueOf(long)>
	//   33   83:areturn         
	}

	public double getDoubleValue()
		throws IOException
	{
		return getNumberValue().doubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method Number getNumberValue()>
	//    2    4:invokevirtual   #154 <Method double Number.doubleValue()>
	//    3    7:dreturn         
	}

	public Object getEmbeddedObject()
	{
		if(_currToken == JsonToken.VALUE_EMBEDDED_OBJECT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field JsonToken _currToken>
	//*   2    4:getstatic       #221 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//*   3    7:if_acmpne       15
			return _currentObject();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #223 <Method Object _currentObject()>
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
	//    1    1:invokevirtual   #199 <Method Number getNumberValue()>
	//    2    4:invokevirtual   #301 <Method float Number.floatValue()>
	//    3    7:freturn         
	}

	public int getIntValue()
		throws IOException
	{
		Number number;
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field JsonToken _currToken>
	//*   2    4:getstatic       #305 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       21
			number = (Number)_currentObject();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #223 <Method Object _currentObject()>
	//    6   14:checkcast       #107 <Class Number>
	//    7   17:astore_1        
		else
	//*   8   18:goto            26
			number = getNumberValue();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #199 <Method Number getNumberValue()>
	//   11   25:astore_1        
		if(!(number instanceof Integer) && !_smallerThanInt(number))
	//*  12   26:aload_1         
	//*  13   27:instanceof      #61  <Class Integer>
	//*  14   30:ifne            50
	//*  15   33:aload_0         
	//*  16   34:aload_1         
	//*  17   35:invokespecial   #307 <Method boolean _smallerThanInt(Number)>
	//*  18   38:ifeq            44
	//*  19   41:goto            50
			return _convertNumberToInt(number);
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:invokevirtual   #309 <Method int _convertNumberToInt(Number)>
	//   23   49:ireturn         
		else
			return number.intValue();
	//   24   50:aload_1         
	//   25   51:invokevirtual   #150 <Method int Number.intValue()>
	//   26   54:ireturn         
	}

	public long getLongValue()
		throws IOException
	{
		Number number;
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field JsonToken _currToken>
	//*   2    4:getstatic       #305 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       21
			number = (Number)_currentObject();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #223 <Method Object _currentObject()>
	//    6   14:checkcast       #107 <Class Number>
	//    7   17:astore_1        
		else
	//*   8   18:goto            26
			number = getNumberValue();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #199 <Method Number getNumberValue()>
	//   11   25:astore_1        
		if(!(number instanceof Long) && !_smallerThanLong(number))
	//*  12   26:aload_1         
	//*  13   27:instanceof      #105 <Class Long>
	//*  14   30:ifne            50
	//*  15   33:aload_0         
	//*  16   34:aload_1         
	//*  17   35:invokespecial   #312 <Method boolean _smallerThanLong(Number)>
	//*  18   38:ifeq            44
	//*  19   41:goto            50
			return _convertNumberToLong(number);
	//   20   44:aload_0         
	//   21   45:aload_1         
	//   22   46:invokevirtual   #314 <Method long _convertNumberToLong(Number)>
	//   23   49:lreturn         
		else
			return number.longValue();
	//   24   50:aload_1         
	//   25   51:invokevirtual   #111 <Method long Number.longValue()>
	//   26   54:lreturn         
	}

	public com.fasterxml.jackson.core.pe getNumberType()
		throws IOException
	{
		Number number = getNumberValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #199 <Method Number getNumberValue()>
	//    2    4:astore_1        
		if(number instanceof Integer)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #61  <Class Integer>
	//*   5    9:ifeq            16
			return com.fasterxml.jackson.core.pe.INT;
	//    6   12:getstatic       #317 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//    7   15:areturn         
		if(number instanceof Long)
	//*   8   16:aload_1         
	//*   9   17:instanceof      #105 <Class Long>
	//*  10   20:ifeq            27
			return com.fasterxml.jackson.core.pe.LONG;
	//   11   23:getstatic       #320 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//   12   26:areturn         
		if(number instanceof Double)
	//*  13   27:aload_1         
	//*  14   28:instanceof      #129 <Class Double>
	//*  15   31:ifeq            38
			return com.fasterxml.jackson.core.pe.DOUBLE;
	//   16   34:getstatic       #323 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
	//   17   37:areturn         
		if(number instanceof BigDecimal)
	//*  18   38:aload_1         
	//*  19   39:instanceof      #133 <Class BigDecimal>
	//*  20   42:ifeq            49
			return com.fasterxml.jackson.core.pe.BIG_DECIMAL;
	//   21   45:getstatic       #209 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//   22   48:areturn         
		if(number instanceof BigInteger)
	//*  23   49:aload_1         
	//*  24   50:instanceof      #116 <Class BigInteger>
	//*  25   53:ifeq            60
			return com.fasterxml.jackson.core.pe.BIG_INTEGER;
	//   26   56:getstatic       #326 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//   27   59:areturn         
		if(number instanceof Float)
	//*  28   60:aload_1         
	//*  29   61:instanceof      #131 <Class Float>
	//*  30   64:ifeq            71
			return com.fasterxml.jackson.core.pe.FLOAT;
	//   31   67:getstatic       #329 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
	//   32   70:areturn         
		if(number instanceof Short)
	//*  33   71:aload_1         
	//*  34   72:instanceof      #56  <Class Short>
	//*  35   75:ifeq            82
			return com.fasterxml.jackson.core.pe.INT;
	//   36   78:getstatic       #317 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
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
	//    1    1:invokevirtual   #331 <Method void _checkIsNumber()>
		Object obj = _currentObject();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #223 <Method Object _currentObject()>
	//    4    8:astore_1        
		if(obj instanceof Number)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #107 <Class Number>
	//*   7   13:ifeq            21
			return (Number)obj;
	//    8   16:aload_1         
	//    9   17:checkcast       #107 <Class Number>
	//   10   20:areturn         
		if(obj instanceof String)
	//*  11   21:aload_1         
	//*  12   22:instanceof      #333 <Class String>
	//*  13   25:ifeq            58
		{
			obj = ((Object) ((String)obj));
	//   14   28:aload_1         
	//   15   29:checkcast       #333 <Class String>
	//   16   32:astore_1        
			if(((String) (obj)).indexOf('.') >= 0)
	//*  17   33:aload_1         
	//*  18   34:bipush          46
	//*  19   36:invokevirtual   #337 <Method int String.indexOf(int)>
	//*  20   39:iflt            50
				return ((Number) (Double.valueOf(Double.parseDouble(((String) (obj))))));
	//   21   42:aload_1         
	//   22   43:invokestatic    #341 <Method double Double.parseDouble(String)>
	//   23   46:invokestatic    #344 <Method Double Double.valueOf(double)>
	//   24   49:areturn         
			else
				return ((Number) (Long.valueOf(Long.parseLong(((String) (obj))))));
	//   25   50:aload_1         
	//   26   51:invokestatic    #348 <Method long Long.parseLong(String)>
	//   27   54:invokestatic    #351 <Method Long Long.valueOf(long)>
	//   28   57:areturn         
		}
		if(obj == null)
	//*  29   58:aload_1         
	//*  30   59:ifnonnull       64
		{
			return null;
	//   31   62:aconst_null     
	//   32   63:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   33   64:new             #77  <Class StringBuilder>
	//   34   67:dup             
	//   35   68:invokespecial   #79  <Method void StringBuilder()>
	//   36   71:astore_2        
			stringbuilder.append("Internal error: entry should be a Number, but is of type ");
	//   37   72:aload_2         
	//   38   73:ldc2            #353 <String "Internal error: entry should be a Number, but is of type ">
	//   39   76:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   40   79:pop             
			stringbuilder.append(obj.getClass().getName());
	//   41   80:aload_2         
	//   42   81:aload_1         
	//   43   82:invokevirtual   #359 <Method Class Object.getClass()>
	//   44   85:invokevirtual   #364 <Method String Class.getName()>
	//   45   88:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   46   91:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   47   92:new             #366 <Class IllegalStateException>
	//   48   95:dup             
	//   49   96:aload_2         
	//   50   97:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   51  100:invokespecial   #369 <Method void IllegalStateException(String)>
	//   52  103:athrow          
		}
	}

	public Object getObjectId()
	{
		return .access._mth000(_segment, _segmentPtr);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int _segmentPtr>
	//    4    8:invokestatic    #374 <Method Object TokenBuffer$Segment.access$000(TokenBuffer$Segment, int)>
	//    5   11:areturn         
	}

	public JsonStreamContext getParsingContext()
	{
		return ((JsonStreamContext) (_parsingContext));
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field TokenBufferReadContext _parsingContext>
	//    2    4:areturn         
	}

	public String getText()
	{
		if(_currToken != JsonToken.VALUE_STRING && _currToken != JsonToken.FIELD_NAME)
	//*   0    0:aload_0         
	//*   1    1:getfield        #69  <Field JsonToken _currToken>
	//*   2    4:getstatic       #228 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpeq       80
	//*   4   10:aload_0         
	//*   5   11:getfield        #69  <Field JsonToken _currToken>
	//*   6   14:getstatic       #378 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   17:if_acmpne       23
	//*   8   20:goto            80
		{
			if(_currToken == null)
	//*   9   23:aload_0         
	//*  10   24:getfield        #69  <Field JsonToken _currToken>
	//*  11   27:ifnonnull       32
				return null;
	//   12   30:aconst_null     
	//   13   31:areturn         
			switch(TokenBuffer._cls1.$SwitchMap$com$fasterxml$jackson$core$JsonToken[_currToken.ordinal()])
	//*  14   32:getstatic       #381 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  15   35:aload_0         
	//*  16   36:getfield        #69  <Field JsonToken _currToken>
	//*  17   39:invokevirtual   #382 <Method int JsonToken.ordinal()>
	//*  18   42:iaload          
			{
	//*  19   43:tableswitch     7 8: default 64
	//	               7 72
	//	               8 72
			default:
				return _currToken.asString();
	//   20   64:aload_0         
	//   21   65:getfield        #69  <Field JsonToken _currToken>
	//   22   68:invokevirtual   #385 <Method String JsonToken.asString()>
	//   23   71:areturn         

			case 7: // '\007'
			case 8: // '\b'
				return ClassUtil.nullOrToString(_currentObject());
	//   24   72:aload_0         
	//   25   73:invokevirtual   #223 <Method Object _currentObject()>
	//   26   76:invokestatic    #391 <Method String ClassUtil.nullOrToString(Object)>
	//   27   79:areturn         
			}
		}
		Object obj = _currentObject();
	//   28   80:aload_0         
	//   29   81:invokevirtual   #223 <Method Object _currentObject()>
	//   30   84:astore_1        
		if(obj instanceof String)
	//*  31   85:aload_1         
	//*  32   86:instanceof      #333 <Class String>
	//*  33   89:ifeq            97
			return (String)obj;
	//   34   92:aload_1         
	//   35   93:checkcast       #333 <Class String>
	//   36   96:areturn         
		else
			return ClassUtil.nullOrToString(obj);
	//   37   97:aload_1         
	//   38   98:invokestatic    #391 <Method String ClassUtil.nullOrToString(Object)>
	//   39  101:areturn         
	}

	public char[] getTextCharacters()
	{
		String s = getText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #231 <Method String getText()>
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
	//    8   12:invokevirtual   #396 <Method char[] String.toCharArray()>
	//    9   15:areturn         
	}

	public int getTextLength()
	{
		String s = getText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #231 <Method String getText()>
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
	//    8   12:invokevirtual   #400 <Method int String.length()>
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
	//    1    1:invokevirtual   #404 <Method JsonLocation getCurrentLocation()>
	//    2    4:areturn         
	}

	public Object getTypeId()
	{
		return .access._mth100(_segment, _segmentPtr);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    2    4:aload_0         
	//    3    5:getfield        #35  <Field int _segmentPtr>
	//    4    8:invokestatic    #408 <Method Object TokenBuffer$Segment.access$100(TokenBuffer$Segment, int)>
	//    5   11:areturn         
	}

	public boolean hasTextCharacters()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNaN()
	{
label0:
		{
			boolean flag;
label1:
			{
				Object obj = ((Object) (_currToken));
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field JsonToken _currToken>
	//    2    4:astore_3        
				JsonToken jsontoken = JsonToken.VALUE_NUMBER_FLOAT;
	//    3    5:getstatic       #413 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    4    8:astore          4
				boolean flag1 = false;
	//    5   10:iconst_0        
	//    6   11:istore_2        
				flag = false;
	//    7   12:iconst_0        
	//    8   13:istore_1        
				if(obj != jsontoken)
					break label0;
	//    9   14:aload_3         
	//   10   15:aload           4
	//   11   17:if_acmpne       87
				obj = _currentObject();
	//   12   20:aload_0         
	//   13   21:invokevirtual   #223 <Method Object _currentObject()>
	//   14   24:astore_3        
				if(obj instanceof Double)
	//*  15   25:aload_3         
	//*  16   26:instanceof      #129 <Class Double>
	//*  17   29:ifeq            55
				{
					obj = ((Object) ((Double)obj));
	//   18   32:aload_3         
	//   19   33:checkcast       #129 <Class Double>
	//   20   36:astore_3        
					if(((Double) (obj)).isNaN() || ((Double) (obj)).isInfinite())
	//*  21   37:aload_3         
	//*  22   38:invokevirtual   #415 <Method boolean Double.isNaN()>
	//*  23   41:ifne            51
	//*  24   44:aload_3         
	//*  25   45:invokevirtual   #418 <Method boolean Double.isInfinite()>
	//*  26   48:ifeq            53
						flag = true;
	//   27   51:iconst_1        
	//   28   52:istore_1        
					return flag;
	//   29   53:iload_1         
	//   30   54:ireturn         
				}
				if(!(obj instanceof Float))
					break label0;
	//   31   55:aload_3         
	//   32   56:instanceof      #131 <Class Float>
	//   33   59:ifeq            87
				obj = ((Object) ((Float)obj));
	//   34   62:aload_3         
	//   35   63:checkcast       #131 <Class Float>
	//   36   66:astore_3        
				if(!((Float) (obj)).isNaN())
	//*  37   67:aload_3         
	//*  38   68:invokevirtual   #419 <Method boolean Float.isNaN()>
	//*  39   71:ifne            83
				{
					flag = flag1;
	//   40   74:iload_2         
	//   41   75:istore_1        
					if(!((Float) (obj)).isInfinite())
						break label1;
	//   42   76:aload_3         
	//   43   77:invokevirtual   #420 <Method boolean Float.isInfinite()>
	//   44   80:ifeq            85
				}
				flag = true;
	//   45   83:iconst_1        
	//   46   84:istore_1        
			}
			return flag;
	//   47   85:iload_1         
	//   48   86:ireturn         
		}
		return false;
	//   49   87:iconst_0        
	//   50   88:ireturn         
	}

	public String nextFieldName()
		throws IOException
	{
		boolean flag = _closed;
	//    0    0:aload_0         
	//    1    1:getfield        #193 <Field boolean _closed>
	//    2    4:istore_2        
		Object obj = null;
	//    3    5:aconst_null     
	//    4    6:astore_3        
		if(!flag)
	//*   5    7:iload_2         
	//*   6    8:ifne            117
		{
			  = _segment;
	//    7   11:aload_0         
	//    8   12:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    9   15:astore          4
			if( == null)
	//*  10   17:aload           4
	//*  11   19:ifnonnull       24
				return null;
	//   12   22:aconst_null     
	//   13   23:areturn         
			int i = _segmentPtr + 1;
	//   14   24:aload_0         
	//   15   25:getfield        #35  <Field int _segmentPtr>
	//   16   28:iconst_1        
	//   17   29:iadd            
	//   18   30:istore_1        
			if(i < 16 && .type(i) == JsonToken.FIELD_NAME)
	//*  19   31:iload_1         
	//*  20   32:bipush          16
	//*  21   34:icmpge          100
	//*  22   37:aload           4
	//*  23   39:iload_1         
	//*  24   40:invokevirtual   #425 <Method JsonToken TokenBuffer$Segment.type(int)>
	//*  25   43:getstatic       #378 <Field JsonToken JsonToken.FIELD_NAME>
	//*  26   46:if_acmpne       100
			{
				_segmentPtr = i;
	//   27   49:aload_0         
	//   28   50:iload_1         
	//   29   51:putfield        #35  <Field int _segmentPtr>
				_currToken = JsonToken.FIELD_NAME;
	//   30   54:aload_0         
	//   31   55:getstatic       #378 <Field JsonToken JsonToken.FIELD_NAME>
	//   32   58:putfield        #69  <Field JsonToken _currToken>
				obj = _segment.get(i);
	//   33   61:aload_0         
	//   34   62:getfield        #33  <Field TokenBuffer$Segment _segment>
	//   35   65:iload_1         
	//   36   66:invokevirtual   #187 <Method Object TokenBuffer$Segment.get(int)>
	//   37   69:astore_3        
				if(obj instanceof String)
	//*  38   70:aload_3         
	//*  39   71:instanceof      #333 <Class String>
	//*  40   74:ifeq            85
					obj = ((Object) ((String)obj));
	//   41   77:aload_3         
	//   42   78:checkcast       #333 <Class String>
	//   43   81:astore_3        
				else
	//*  44   82:goto            90
					obj = ((Object) (obj.toString()));
	//   45   85:aload_3         
	//   46   86:invokevirtual   #426 <Method String Object.toString()>
	//   47   89:astore_3        
				_parsingContext.setCurrentName(((String) (obj)));
	//   48   90:aload_0         
	//   49   91:getfield        #45  <Field TokenBufferReadContext _parsingContext>
	//   50   94:aload_3         
	//   51   95:invokevirtual   #429 <Method void TokenBufferReadContext.setCurrentName(String)>
				return ((String) (obj));
	//   52   98:aload_3         
	//   53   99:areturn         
			}
			if(nextToken() == JsonToken.FIELD_NAME)
	//*  54  100:aload_0         
	//*  55  101:invokevirtual   #433 <Method JsonToken nextToken()>
	//*  56  104:getstatic       #378 <Field JsonToken JsonToken.FIELD_NAME>
	//*  57  107:if_acmpne       115
				obj = ((Object) (getCurrentName()));
	//   58  110:aload_0         
	//   59  111:invokevirtual   #434 <Method String getCurrentName()>
	//   60  114:astore_3        
			return ((String) (obj));
	//   61  115:aload_3         
	//   62  116:areturn         
		} else
		{
			return null;
	//   63  117:aconst_null     
	//   64  118:areturn         
		}
	}

	public JsonToken nextToken()
		throws IOException
	{
		if(!_closed)
	//*   0    0:aload_0         
	//*   1    1:getfield        #193 <Field boolean _closed>
	//*   2    4:ifne            203
		{
			  = _segment;
	//    3    7:aload_0         
	//    4    8:getfield        #33  <Field TokenBuffer$Segment _segment>
	//    5   11:astore_2        
			if( == null)
	//*   6   12:aload_2         
	//*   7   13:ifnonnull       18
				return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
			int i = _segmentPtr + 1;
	//   10   18:aload_0         
	//   11   19:getfield        #35  <Field int _segmentPtr>
	//   12   22:iconst_1        
	//   13   23:iadd            
	//   14   24:istore_1        
			_segmentPtr = i;
	//   15   25:aload_0         
	//   16   26:iload_1         
	//   17   27:putfield        #35  <Field int _segmentPtr>
			if(i >= 16)
	//*  18   30:iload_1         
	//*  19   31:bipush          16
	//*  20   33:icmplt          58
			{
				_segmentPtr = 0;
	//   21   36:aload_0         
	//   22   37:iconst_0        
	//   23   38:putfield        #35  <Field int _segmentPtr>
				_segment = .next();
	//   24   41:aload_0         
	//   25   42:aload_2         
	//   26   43:invokevirtual   #438 <Method TokenBuffer$Segment TokenBuffer$Segment.next()>
	//   27   46:putfield        #33  <Field TokenBuffer$Segment _segment>
				if(_segment == null)
	//*  28   49:aload_0         
	//*  29   50:getfield        #33  <Field TokenBuffer$Segment _segment>
	//*  30   53:ifnonnull       58
					return null;
	//   31   56:aconst_null     
	//   32   57:areturn         
			}
			_currToken = _segment.type(_segmentPtr);
	//   33   58:aload_0         
	//   34   59:aload_0         
	//   35   60:getfield        #33  <Field TokenBuffer$Segment _segment>
	//   36   63:aload_0         
	//   37   64:getfield        #35  <Field int _segmentPtr>
	//   38   67:invokevirtual   #425 <Method JsonToken TokenBuffer$Segment.type(int)>
	//   39   70:putfield        #69  <Field JsonToken _currToken>
			if(_currToken == JsonToken.FIELD_NAME)
	//*  40   73:aload_0         
	//*  41   74:getfield        #69  <Field JsonToken _currToken>
	//*  42   77:getstatic       #378 <Field JsonToken JsonToken.FIELD_NAME>
	//*  43   80:if_acmpne       119
			{
				Object obj = _currentObject();
	//   44   83:aload_0         
	//   45   84:invokevirtual   #223 <Method Object _currentObject()>
	//   46   87:astore_2        
				if(obj instanceof String)
	//*  47   88:aload_2         
	//*  48   89:instanceof      #333 <Class String>
	//*  49   92:ifeq            103
					obj = ((Object) ((String)obj));
	//   50   95:aload_2         
	//   51   96:checkcast       #333 <Class String>
	//   52   99:astore_2        
				else
	//*  53  100:goto            108
					obj = ((Object) (obj.toString()));
	//   54  103:aload_2         
	//   55  104:invokevirtual   #426 <Method String Object.toString()>
	//   56  107:astore_2        
				_parsingContext.setCurrentName(((String) (obj)));
	//   57  108:aload_0         
	//   58  109:getfield        #45  <Field TokenBufferReadContext _parsingContext>
	//   59  112:aload_2         
	//   60  113:invokevirtual   #429 <Method void TokenBufferReadContext.setCurrentName(String)>
			} else
	//*  61  116:goto            198
			if(_currToken == JsonToken.START_OBJECT)
	//*  62  119:aload_0         
	//*  63  120:getfield        #69  <Field JsonToken _currToken>
	//*  64  123:getstatic       #262 <Field JsonToken JsonToken.START_OBJECT>
	//*  65  126:if_acmpne       143
				_parsingContext = _parsingContext.createChildObjectContext();
	//   66  129:aload_0         
	//   67  130:aload_0         
	//   68  131:getfield        #45  <Field TokenBufferReadContext _parsingContext>
	//   69  134:invokevirtual   #442 <Method TokenBufferReadContext TokenBufferReadContext.createChildObjectContext()>
	//   70  137:putfield        #45  <Field TokenBufferReadContext _parsingContext>
			else
	//*  71  140:goto            198
			if(_currToken == JsonToken.START_ARRAY)
	//*  72  143:aload_0         
	//*  73  144:getfield        #69  <Field JsonToken _currToken>
	//*  74  147:getstatic       #265 <Field JsonToken JsonToken.START_ARRAY>
	//*  75  150:if_acmpne       167
				_parsingContext = _parsingContext.createChildArrayContext();
	//   76  153:aload_0         
	//   77  154:aload_0         
	//   78  155:getfield        #45  <Field TokenBufferReadContext _parsingContext>
	//   79  158:invokevirtual   #445 <Method TokenBufferReadContext TokenBufferReadContext.createChildArrayContext()>
	//   80  161:putfield        #45  <Field TokenBufferReadContext _parsingContext>
			else
	//*  81  164:goto            198
			if(_currToken == JsonToken.END_OBJECT || _currToken == JsonToken.END_ARRAY)
	//*  82  167:aload_0         
	//*  83  168:getfield        #69  <Field JsonToken _currToken>
	//*  84  171:getstatic       #448 <Field JsonToken JsonToken.END_OBJECT>
	//*  85  174:if_acmpeq       187
	//*  86  177:aload_0         
	//*  87  178:getfield        #69  <Field JsonToken _currToken>
	//*  88  181:getstatic       #451 <Field JsonToken JsonToken.END_ARRAY>
	//*  89  184:if_acmpne       198
				_parsingContext = _parsingContext.parentOrCopy();
	//   90  187:aload_0         
	//   91  188:aload_0         
	//   92  189:getfield        #45  <Field TokenBufferReadContext _parsingContext>
	//   93  192:invokevirtual   #454 <Method TokenBufferReadContext TokenBufferReadContext.parentOrCopy()>
	//   94  195:putfield        #45  <Field TokenBufferReadContext _parsingContext>
			return _currToken;
	//   95  198:aload_0         
	//   96  199:getfield        #69  <Field JsonToken _currToken>
	//   97  202:areturn         
		} else
		{
			return null;
	//   98  203:aconst_null     
	//   99  204:areturn         
		}
	}

	public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
		throws IOException
	{
		base64variant = ((Base64Variant) (getBinaryValue(base64variant)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #458 <Method byte[] getBinaryValue(Base64Variant)>
	//    3    5:astore_1        
		if(base64variant != null)
	//*   4    6:aload_1         
	//*   5    7:ifnull          21
		{
			outputstream.write(((byte []) (base64variant)), 0, base64variant.length);
	//    6   10:aload_2         
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:aload_1         
	//   10   14:arraylength     
	//   11   15:invokevirtual   #464 <Method void OutputStream.write(byte[], int, int)>
			return base64variant.length;
	//   12   18:aload_1         
	//   13   19:arraylength     
	//   14   20:ireturn         
		} else
		{
			return 0;
	//   15   21:iconst_0        
	//   16   22:ireturn         
		}
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
	//    0    0:getstatic       #474 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	protected transient ByteArrayBuilder _byteBuilder;
	protected boolean _closed;
	protected ObjectCodec _codec;
	protected final boolean _hasNativeIds;
	protected final boolean _hasNativeObjectIds;
	protected final boolean _hasNativeTypeIds;
	protected JsonLocation _location;
	protected TokenBufferReadContext _parsingContext;
	protected  _segment;
	protected int _segmentPtr;

	public TokenBuffer$Parser( , ObjectCodec objectcodec, boolean flag, boolean flag1, JsonStreamContext jsonstreamcontext)
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
		_parsingContext = TokenBufferReadContext.createRootContext(jsonstreamcontext);
	//   15   25:aload_0         
	//   16   26:aload           5
	//   17   28:invokestatic    #43  <Method TokenBufferReadContext TokenBufferReadContext.createRootContext(JsonStreamContext)>
	//   18   31:putfield        #45  <Field TokenBufferReadContext _parsingContext>
		_hasNativeTypeIds = flag;
	//   19   34:aload_0         
	//   20   35:iload_3         
	//   21   36:putfield        #47  <Field boolean _hasNativeTypeIds>
		_hasNativeObjectIds = flag1;
	//   22   39:aload_0         
	//   23   40:iload           4
	//   24   42:putfield        #49  <Field boolean _hasNativeObjectIds>
		_hasNativeIds = flag | flag1;
	//   25   45:aload_0         
	//   26   46:iload_3         
	//   27   47:iload           4
	//   28   49:ior             
	//   29   50:putfield        #51  <Field boolean _hasNativeIds>
	//   30   53:return          
	}
}
