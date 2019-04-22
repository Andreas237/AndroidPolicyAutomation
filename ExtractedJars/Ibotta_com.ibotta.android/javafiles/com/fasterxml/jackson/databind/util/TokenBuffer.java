// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			RawValue, TokenBufferReadContext, ClassUtil

public class TokenBuffer extends JsonGenerator
{
	protected static final class Parser extends ParserMinimalBase
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
			if(getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL)
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
			static class _cls1
			{

				static final int $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[];
				static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

				static 
				{
					$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[com.fasterxml.jackson.core.JsonParser.NumberType.values().length];
				//    0    0:invokestatic    #19  <Method com.fasterxml.jackson.core.JsonParser$NumberType[] com.fasterxml.jackson.core.JsonParser$NumberType.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.INT.ordinal()] = 1;
				//    4    9:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
				//    5   12:getstatic       #25  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
				//    6   15:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
				//*  10   23:getstatic       #32  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
				//*  11   26:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
				//*  15   34:getstatic       #35  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
				//*  16   37:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
				//*  17   40:iconst_3        
				//*  18   41:iastore         
				//*  19   42:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
				//*  20   45:getstatic       #38  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
				//*  21   48:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
				//*  22   51:iconst_4        
				//*  23   52:iastore         
				//*  24   53:getstatic       #21  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
				//*  25   56:getstatic       #41  <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
				//*  26   59:invokevirtual   #29  <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
				//*  27   62:iconst_5        
				//*  28   63:iastore         
				//*  29   64:invokestatic    #46  <Method JsonToken[] JsonToken.values()>
				//*  30   67:arraylength     
				//*  31   68:newarray        int[]
				//*  32   70:putstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  33   73:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  34   76:getstatic       #52  <Field JsonToken JsonToken.START_OBJECT>
				//*  35   79:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  36   82:iconst_1        
				//*  37   83:iastore         
				//*  38   84:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  39   87:getstatic       #56  <Field JsonToken JsonToken.END_OBJECT>
				//*  40   90:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  41   93:iconst_2        
				//*  42   94:iastore         
				//*  43   95:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  44   98:getstatic       #59  <Field JsonToken JsonToken.START_ARRAY>
				//*  45  101:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  46  104:iconst_3        
				//*  47  105:iastore         
				//*  48  106:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  49  109:getstatic       #62  <Field JsonToken JsonToken.END_ARRAY>
				//*  50  112:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  51  115:iconst_4        
				//*  52  116:iastore         
				//*  53  117:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  54  120:getstatic       #65  <Field JsonToken JsonToken.FIELD_NAME>
				//*  55  123:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  56  126:iconst_5        
				//*  57  127:iastore         
				//*  58  128:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  59  131:getstatic       #68  <Field JsonToken JsonToken.VALUE_STRING>
				//*  60  134:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  61  137:bipush          6
				//*  62  139:iastore         
				//*  63  140:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  64  143:getstatic       #71  <Field JsonToken JsonToken.VALUE_NUMBER_INT>
				//*  65  146:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  66  149:bipush          7
				//*  67  151:iastore         
				//*  68  152:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  69  155:getstatic       #74  <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
				//*  70  158:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  71  161:bipush          8
				//*  72  163:iastore         
				//*  73  164:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  74  167:getstatic       #77  <Field JsonToken JsonToken.VALUE_TRUE>
				//*  75  170:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  76  173:bipush          9
				//*  77  175:iastore         
				//*  78  176:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  79  179:getstatic       #80  <Field JsonToken JsonToken.VALUE_FALSE>
				//*  80  182:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  81  185:bipush          10
				//*  82  187:iastore         
				//*  83  188:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  84  191:getstatic       #83  <Field JsonToken JsonToken.VALUE_NULL>
				//*  85  194:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  86  197:bipush          11
				//*  87  199:iastore         
				//*  88  200:getstatic       #48  <Field int[] $SwitchMap$com$fasterxml$jackson$core$JsonToken>
				//*  89  203:getstatic       #86  <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
				//*  90  206:invokevirtual   #53  <Method int JsonToken.ordinal()>
				//*  91  209:bipush          12
				//*  92  211:iastore         
				//*  93  212:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   94  213:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
					}
				//*  95  214:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   96  217:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
					}
				//*  97  218:goto            31
					catch(NoSuchFieldError nosuchfielderror2) { }
				//   98  221:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT.ordinal()] = 4;
					}
				//*  99  222:goto            42
					catch(NoSuchFieldError nosuchfielderror3) { }
				//  100  225:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 5;
					}
				//* 101  226:goto            53
					catch(NoSuchFieldError nosuchfielderror4) { }
				//  102  229:astore_0        
					$SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
					}
				//* 103  230:goto            64
					catch(NoSuchFieldError nosuchfielderror5) { }
				//  104  233:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
					}
				//* 105  234:goto            84
					catch(NoSuchFieldError nosuchfielderror6) { }
				//  106  237:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
					}
				//* 107  238:goto            95
					catch(NoSuchFieldError nosuchfielderror7) { }
				//  108  241:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
					}
				//* 109  242:goto            106
					catch(NoSuchFieldError nosuchfielderror8) { }
				//  110  245:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
					}
				//* 111  246:goto            117
					catch(NoSuchFieldError nosuchfielderror9) { }
				//  112  249:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
					}
				//* 113  250:goto            128
					catch(NoSuchFieldError nosuchfielderror10) { }
				//  114  253:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
					}
				//* 115  254:goto            140
					catch(NoSuchFieldError nosuchfielderror11) { }
				//  116  257:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
					}
				//* 117  258:goto            152
					catch(NoSuchFieldError nosuchfielderror12) { }
				//  118  261:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
					}
				//* 119  262:goto            164
					catch(NoSuchFieldError nosuchfielderror13) { }
				//  120  265:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
					}
				//* 121  266:goto            176
					catch(NoSuchFieldError nosuchfielderror14) { }
				//  122  269:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
					}
				//* 123  270:goto            188
					catch(NoSuchFieldError nosuchfielderror15) { }
				//  124  273:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
					}
				//* 125  274:goto            200
					catch(NoSuchFieldError nosuchfielderror16) { }
				//  126  277:astore_0        
				//* 127  278:return          
				}
			}

			int i = _cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[getNumberType().ordinal()];
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
		//		               1 76
		//		               2 64
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

		public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
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
				return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
		//    6   12:getstatic       #317 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
		//    7   15:areturn         
			if(number instanceof Long)
		//*   8   16:aload_1         
		//*   9   17:instanceof      #105 <Class Long>
		//*  10   20:ifeq            27
				return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
		//   11   23:getstatic       #320 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
		//   12   26:areturn         
			if(number instanceof Double)
		//*  13   27:aload_1         
		//*  14   28:instanceof      #129 <Class Double>
		//*  15   31:ifeq            38
				return com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE;
		//   16   34:getstatic       #323 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
		//   17   37:areturn         
			if(number instanceof BigDecimal)
		//*  18   38:aload_1         
		//*  19   39:instanceof      #133 <Class BigDecimal>
		//*  20   42:ifeq            49
				return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL;
		//   21   45:getstatic       #209 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
		//   22   48:areturn         
			if(number instanceof BigInteger)
		//*  23   49:aload_1         
		//*  24   50:instanceof      #116 <Class BigInteger>
		//*  25   53:ifeq            60
				return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
		//   26   56:getstatic       #326 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
		//   27   59:areturn         
			if(number instanceof Float)
		//*  28   60:aload_1         
		//*  29   61:instanceof      #131 <Class Float>
		//*  30   64:ifeq            71
				return com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT;
		//   31   67:getstatic       #329 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
		//   32   70:areturn         
			if(number instanceof Short)
		//*  33   71:aload_1         
		//*  34   72:instanceof      #56  <Class Short>
		//*  35   75:ifeq            82
				return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
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
			return _segment.findObjectId(_segmentPtr);
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
				switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
		//*  14   32:getstatic       #381 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
		//*  15   35:aload_0         
		//*  16   36:getfield        #69  <Field JsonToken _currToken>
		//*  17   39:invokevirtual   #382 <Method int JsonToken.ordinal()>
		//*  18   42:iaload          
				{
		//*  19   43:tableswitch     7 8: default 64
		//		               7 72
		//		               8 72
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
			return _segment.findTypeId(_segmentPtr);
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
				Segment segment = _segment;
		//    7   11:aload_0         
		//    8   12:getfield        #33  <Field TokenBuffer$Segment _segment>
		//    9   15:astore          4
				if(segment == null)
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
				if(i < 16 && segment.type(i) == JsonToken.FIELD_NAME)
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
				Segment segment = _segment;
		//    3    7:aload_0         
		//    4    8:getfield        #33  <Field TokenBuffer$Segment _segment>
		//    5   11:astore_2        
				if(segment == null)
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
					_segment = segment.next();
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
		protected Segment _segment;
		protected int _segmentPtr;

		public Parser(Segment segment, ObjectCodec objectcodec, boolean flag, boolean flag1, JsonStreamContext jsonstreamcontext)
		{
			super(0);
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:invokespecial   #29  <Method void ParserMinimalBase(int)>
			_location = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #31  <Field JsonLocation _location>
			_segment = segment;
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

	protected static final class Segment
	{

		private final int _objectIdIndex(int i)
		{
			return i + i + 1;
		//    0    0:iload_1         
		//    1    1:iload_1         
		//    2    2:iadd            
		//    3    3:iconst_1        
		//    4    4:iadd            
		//    5    5:ireturn         
		}

		private final int _typeIdIndex(int i)
		{
			return i + i;
		//    0    0:iload_1         
		//    1    1:iload_1         
		//    2    2:iadd            
		//    3    3:ireturn         
		}

		private final void assignNativeIds(int i, Object obj, Object obj1)
		{
			if(_nativeIds == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #63  <Field TreeMap _nativeIds>
		//*   2    4:ifnonnull       18
				_nativeIds = new TreeMap();
		//    3    7:aload_0         
		//    4    8:new             #65  <Class TreeMap>
		//    5   11:dup             
		//    6   12:invokespecial   #66  <Method void TreeMap()>
		//    7   15:putfield        #63  <Field TreeMap _nativeIds>
			if(obj != null)
		//*   8   18:aload_2         
		//*   9   19:ifnull          39
				_nativeIds.put(((Object) (Integer.valueOf(_objectIdIndex(i)))), obj);
		//   10   22:aload_0         
		//   11   23:getfield        #63  <Field TreeMap _nativeIds>
		//   12   26:aload_0         
		//   13   27:iload_1         
		//   14   28:invokespecial   #68  <Method int _objectIdIndex(int)>
		//   15   31:invokestatic    #74  <Method Integer Integer.valueOf(int)>
		//   16   34:aload_2         
		//   17   35:invokevirtual   #78  <Method Object TreeMap.put(Object, Object)>
		//   18   38:pop             
			if(obj1 != null)
		//*  19   39:aload_3         
		//*  20   40:ifnull          60
				_nativeIds.put(((Object) (Integer.valueOf(_typeIdIndex(i)))), obj1);
		//   21   43:aload_0         
		//   22   44:getfield        #63  <Field TreeMap _nativeIds>
		//   23   47:aload_0         
		//   24   48:iload_1         
		//   25   49:invokespecial   #80  <Method int _typeIdIndex(int)>
		//   26   52:invokestatic    #74  <Method Integer Integer.valueOf(int)>
		//   27   55:aload_3         
		//   28   56:invokevirtual   #78  <Method Object TreeMap.put(Object, Object)>
		//   29   59:pop             
		//   30   60:return          
		}

		private Object findObjectId(int i)
		{
			TreeMap treemap = _nativeIds;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field TreeMap _nativeIds>
		//    2    4:astore_2        
			if(treemap == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       11
				return ((Object) (null));
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return treemap.get(((Object) (Integer.valueOf(_objectIdIndex(i)))));
		//    7   11:aload_2         
		//    8   12:aload_0         
		//    9   13:iload_1         
		//   10   14:invokespecial   #68  <Method int _objectIdIndex(int)>
		//   11   17:invokestatic    #74  <Method Integer Integer.valueOf(int)>
		//   12   20:invokevirtual   #84  <Method Object TreeMap.get(Object)>
		//   13   23:areturn         
		}

		private Object findTypeId(int i)
		{
			TreeMap treemap = _nativeIds;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field TreeMap _nativeIds>
		//    2    4:astore_2        
			if(treemap == null)
		//*   3    5:aload_2         
		//*   4    6:ifnonnull       11
				return ((Object) (null));
		//    5    9:aconst_null     
		//    6   10:areturn         
			else
				return treemap.get(((Object) (Integer.valueOf(_typeIdIndex(i)))));
		//    7   11:aload_2         
		//    8   12:aload_0         
		//    9   13:iload_1         
		//   10   14:invokespecial   #80  <Method int _typeIdIndex(int)>
		//   11   17:invokestatic    #74  <Method Integer Integer.valueOf(int)>
		//   12   20:invokevirtual   #84  <Method Object TreeMap.get(Object)>
		//   13   23:areturn         
		}

		private void set(int i, JsonToken jsontoken)
		{
			long l1 = jsontoken.ordinal();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #90  <Method int JsonToken.ordinal()>
		//    2    4:i2l             
		//    3    5:lstore          5
			long l = l1;
		//    4    7:lload           5
		//    5    9:lstore_3        
			if(i > 0)
		//*   6   10:iload_1         
		//*   7   11:ifle            21
				l = l1 << (i << 2);
		//    8   14:lload           5
		//    9   16:iload_1         
		//   10   17:iconst_2        
		//   11   18:ishl            
		//   12   19:lshl            
		//   13   20:lstore_3        
			_tokenTypes = _tokenTypes | l;
		//   14   21:aload_0         
		//   15   22:aload_0         
		//   16   23:getfield        #92  <Field long _tokenTypes>
		//   17   26:lload_3         
		//   18   27:lor             
		//   19   28:putfield        #92  <Field long _tokenTypes>
		//   20   31:return          
		}

		private void set(int i, JsonToken jsontoken, Object obj)
		{
			_tokens[i] = obj;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object[] _tokens>
		//    2    4:iload_1         
		//    3    5:aload_3         
		//    4    6:aastore         
			long l1 = jsontoken.ordinal();
		//    5    7:aload_2         
		//    6    8:invokevirtual   #90  <Method int JsonToken.ordinal()>
		//    7   11:i2l             
		//    8   12:lstore          6
			long l = l1;
		//    9   14:lload           6
		//   10   16:lstore          4
			if(i > 0)
		//*  11   18:iload_1         
		//*  12   19:ifle            30
				l = l1 << (i << 2);
		//   13   22:lload           6
		//   14   24:iload_1         
		//   15   25:iconst_2        
		//   16   26:ishl            
		//   17   27:lshl            
		//   18   28:lstore          4
			_tokenTypes = _tokenTypes | l;
		//   19   30:aload_0         
		//   20   31:aload_0         
		//   21   32:getfield        #92  <Field long _tokenTypes>
		//   22   35:lload           4
		//   23   37:lor             
		//   24   38:putfield        #92  <Field long _tokenTypes>
		//   25   41:return          
		}

		private void set(int i, JsonToken jsontoken, Object obj, Object obj1)
		{
			long l1 = jsontoken.ordinal();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #90  <Method int JsonToken.ordinal()>
		//    2    4:i2l             
		//    3    5:lstore          7
			long l = l1;
		//    4    7:lload           7
		//    5    9:lstore          5
			if(i > 0)
		//*   6   11:iload_1         
		//*   7   12:ifle            23
				l = l1 << (i << 2);
		//    8   15:lload           7
		//    9   17:iload_1         
		//   10   18:iconst_2        
		//   11   19:ishl            
		//   12   20:lshl            
		//   13   21:lstore          5
			_tokenTypes = l | _tokenTypes;
		//   14   23:aload_0         
		//   15   24:lload           5
		//   16   26:aload_0         
		//   17   27:getfield        #92  <Field long _tokenTypes>
		//   18   30:lor             
		//   19   31:putfield        #92  <Field long _tokenTypes>
			assignNativeIds(i, obj, obj1);
		//   20   34:aload_0         
		//   21   35:iload_1         
		//   22   36:aload_3         
		//   23   37:aload           4
		//   24   39:invokespecial   #96  <Method void assignNativeIds(int, Object, Object)>
		//   25   42:return          
		}

		private void set(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
		{
			_tokens[i] = obj;
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object[] _tokens>
		//    2    4:iload_1         
		//    3    5:aload_3         
		//    4    6:aastore         
			long l1 = jsontoken.ordinal();
		//    5    7:aload_2         
		//    6    8:invokevirtual   #90  <Method int JsonToken.ordinal()>
		//    7   11:i2l             
		//    8   12:lstore          8
			long l = l1;
		//    9   14:lload           8
		//   10   16:lstore          6
			if(i > 0)
		//*  11   18:iload_1         
		//*  12   19:ifle            30
				l = l1 << (i << 2);
		//   13   22:lload           8
		//   14   24:iload_1         
		//   15   25:iconst_2        
		//   16   26:ishl            
		//   17   27:lshl            
		//   18   28:lstore          6
			_tokenTypes = l | _tokenTypes;
		//   19   30:aload_0         
		//   20   31:lload           6
		//   21   33:aload_0         
		//   22   34:getfield        #92  <Field long _tokenTypes>
		//   23   37:lor             
		//   24   38:putfield        #92  <Field long _tokenTypes>
			assignNativeIds(i, obj1, obj2);
		//   25   41:aload_0         
		//   26   42:iload_1         
		//   27   43:aload           4
		//   28   45:aload           5
		//   29   47:invokespecial   #96  <Method void assignNativeIds(int, Object, Object)>
		//   30   50:return          
		}

		public Segment append(int i, JsonToken jsontoken)
		{
			if(i < 16)
		//*   0    0:iload_1         
		//*   1    1:bipush          16
		//*   2    3:icmpge          14
			{
				set(i, jsontoken);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:aload_2         
		//    6    9:invokespecial   #101 <Method void set(int, JsonToken)>
				return null;
		//    7   12:aconst_null     
		//    8   13:areturn         
			} else
			{
				_next = new Segment();
		//    9   14:aload_0         
		//   10   15:new             #2   <Class TokenBuffer$Segment>
		//   11   18:dup             
		//   12   19:invokespecial   #102 <Method void TokenBuffer$Segment()>
		//   13   22:putfield        #104 <Field TokenBuffer$Segment _next>
				_next.set(0, jsontoken);
		//   14   25:aload_0         
		//   15   26:getfield        #104 <Field TokenBuffer$Segment _next>
		//   16   29:iconst_0        
		//   17   30:aload_2         
		//   18   31:invokespecial   #101 <Method void set(int, JsonToken)>
				return _next;
		//   19   34:aload_0         
		//   20   35:getfield        #104 <Field TokenBuffer$Segment _next>
		//   21   38:areturn         
			}
		}

		public Segment append(int i, JsonToken jsontoken, Object obj)
		{
			if(i < 16)
		//*   0    0:iload_1         
		//*   1    1:bipush          16
		//*   2    3:icmpge          15
			{
				set(i, jsontoken, obj);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:aload_2         
		//    6    9:aload_3         
		//    7   10:invokespecial   #107 <Method void set(int, JsonToken, Object)>
				return null;
		//    8   13:aconst_null     
		//    9   14:areturn         
			} else
			{
				_next = new Segment();
		//   10   15:aload_0         
		//   11   16:new             #2   <Class TokenBuffer$Segment>
		//   12   19:dup             
		//   13   20:invokespecial   #102 <Method void TokenBuffer$Segment()>
		//   14   23:putfield        #104 <Field TokenBuffer$Segment _next>
				_next.set(0, jsontoken, obj);
		//   15   26:aload_0         
		//   16   27:getfield        #104 <Field TokenBuffer$Segment _next>
		//   17   30:iconst_0        
		//   18   31:aload_2         
		//   19   32:aload_3         
		//   20   33:invokespecial   #107 <Method void set(int, JsonToken, Object)>
				return _next;
		//   21   36:aload_0         
		//   22   37:getfield        #104 <Field TokenBuffer$Segment _next>
		//   23   40:areturn         
			}
		}

		public Segment append(int i, JsonToken jsontoken, Object obj, Object obj1)
		{
			if(i < 16)
		//*   0    0:iload_1         
		//*   1    1:bipush          16
		//*   2    3:icmpge          17
			{
				set(i, jsontoken, obj, obj1);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:aload_2         
		//    6    9:aload_3         
		//    7   10:aload           4
		//    8   12:invokespecial   #110 <Method void set(int, JsonToken, Object, Object)>
				return null;
		//    9   15:aconst_null     
		//   10   16:areturn         
			} else
			{
				_next = new Segment();
		//   11   17:aload_0         
		//   12   18:new             #2   <Class TokenBuffer$Segment>
		//   13   21:dup             
		//   14   22:invokespecial   #102 <Method void TokenBuffer$Segment()>
		//   15   25:putfield        #104 <Field TokenBuffer$Segment _next>
				_next.set(0, jsontoken, obj, obj1);
		//   16   28:aload_0         
		//   17   29:getfield        #104 <Field TokenBuffer$Segment _next>
		//   18   32:iconst_0        
		//   19   33:aload_2         
		//   20   34:aload_3         
		//   21   35:aload           4
		//   22   37:invokespecial   #110 <Method void set(int, JsonToken, Object, Object)>
				return _next;
		//   23   40:aload_0         
		//   24   41:getfield        #104 <Field TokenBuffer$Segment _next>
		//   25   44:areturn         
			}
		}

		public Segment append(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
		{
			if(i < 16)
		//*   0    0:iload_1         
		//*   1    1:bipush          16
		//*   2    3:icmpge          19
			{
				set(i, jsontoken, obj, obj1, obj2);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:aload_2         
		//    6    9:aload_3         
		//    7   10:aload           4
		//    8   12:aload           5
		//    9   14:invokespecial   #113 <Method void set(int, JsonToken, Object, Object, Object)>
				return null;
		//   10   17:aconst_null     
		//   11   18:areturn         
			} else
			{
				_next = new Segment();
		//   12   19:aload_0         
		//   13   20:new             #2   <Class TokenBuffer$Segment>
		//   14   23:dup             
		//   15   24:invokespecial   #102 <Method void TokenBuffer$Segment()>
		//   16   27:putfield        #104 <Field TokenBuffer$Segment _next>
				_next.set(0, jsontoken, obj, obj1, obj2);
		//   17   30:aload_0         
		//   18   31:getfield        #104 <Field TokenBuffer$Segment _next>
		//   19   34:iconst_0        
		//   20   35:aload_2         
		//   21   36:aload_3         
		//   22   37:aload           4
		//   23   39:aload           5
		//   24   41:invokespecial   #113 <Method void set(int, JsonToken, Object, Object, Object)>
				return _next;
		//   25   44:aload_0         
		//   26   45:getfield        #104 <Field TokenBuffer$Segment _next>
		//   27   48:areturn         
			}
		}

		public Object get(int i)
		{
			return _tokens[i];
		//    0    0:aload_0         
		//    1    1:getfield        #46  <Field Object[] _tokens>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		public boolean hasIds()
		{
			return _nativeIds != null;
		//    0    0:aload_0         
		//    1    1:getfield        #63  <Field TreeMap _nativeIds>
		//    2    4:ifnull          9
		//    3    7:iconst_1        
		//    4    8:ireturn         
		//    5    9:iconst_0        
		//    6   10:ireturn         
		}

		public Segment next()
		{
			return _next;
		//    0    0:aload_0         
		//    1    1:getfield        #104 <Field TokenBuffer$Segment _next>
		//    2    4:areturn         
		}

		public JsonToken type(int i)
		{
			long l1 = _tokenTypes;
		//    0    0:aload_0         
		//    1    1:getfield        #92  <Field long _tokenTypes>
		//    2    4:lstore          4
			long l = l1;
		//    3    6:lload           4
		//    4    8:lstore_2        
			if(i > 0)
		//*   5    9:iload_1         
		//*   6   10:ifle            20
				l = l1 >> (i << 2);
		//    7   13:lload           4
		//    8   15:iload_1         
		//    9   16:iconst_2        
		//   10   17:ishl            
		//   11   18:lshr            
		//   12   19:lstore_2        
			i = (int)l;
		//   13   20:lload_2         
		//   14   21:l2i             
		//   15   22:istore_1        
			return TOKEN_TYPES_BY_INDEX[i & 0xf];
		//   16   23:getstatic       #24  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
		//   17   26:iload_1         
		//   18   27:bipush          15
		//   19   29:iand            
		//   20   30:aaload          
		//   21   31:areturn         
		}

		private static final JsonToken TOKEN_TYPES_BY_INDEX[];
		protected TreeMap _nativeIds;
		protected Segment _next;
		protected long _tokenTypes;
		protected final Object _tokens[] = new Object[16];

		static 
		{
			TOKEN_TYPES_BY_INDEX = new JsonToken[16];
		//    0    0:bipush          16
		//    1    2:anewarray       JsonToken[]
		//    2    5:putstatic       #24  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
			JsonToken ajsontoken[] = JsonToken.values();
		//    3    8:invokestatic    #28  <Method JsonToken[] JsonToken.values()>
		//    4   11:astore_0        
			System.arraycopy(((Object) (ajsontoken)), 1, ((Object) (TOKEN_TYPES_BY_INDEX)), 1, Math.min(15, ajsontoken.length - 1));
		//    5   12:aload_0         
		//    6   13:iconst_1        
		//    7   14:getstatic       #24  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
		//    8   17:iconst_1        
		//    9   18:bipush          15
		//   10   20:aload_0         
		//   11   21:arraylength     
		//   12   22:iconst_1        
		//   13   23:isub            
		//   14   24:invokestatic    #34  <Method int Math.min(int, int)>
		//   15   27:invokestatic    #40  <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  16   30:return          
		}


/*
		static Object access$000(Segment segment, int i)
		{
			return segment.findObjectId(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #55  <Method Object findObjectId(int)>
		//    3    5:areturn         
		}

*/


/*
		static Object access$100(Segment segment, int i)
		{
			return segment.findTypeId(i);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokespecial   #59  <Method Object findTypeId(int)>
		//    3    5:areturn         
		}

*/

		public Segment()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #44  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:bipush          16
		//    4    7:anewarray       Object[]
		//    5   10:putfield        #46  <Field Object[] _tokens>
		//    6   13:return          
		}
	}


	public TokenBuffer(JsonParser jsonparser)
	{
		this(jsonparser, ((DeserializationContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #51  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//    4    6:return          
	}

	public TokenBuffer(JsonParser jsonparser, DeserializationContext deserializationcontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void JsonGenerator()>
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		_hasNativeId = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #55  <Field boolean _hasNativeId>
		_objectCodec = jsonparser.getCodec();
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #61  <Method ObjectCodec JsonParser.getCodec()>
	//   10   16:putfield        #63  <Field ObjectCodec _objectCodec>
		_parentContext = jsonparser.getParsingContext();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #67  <Method JsonStreamContext JsonParser.getParsingContext()>
	//   14   24:putfield        #69  <Field JsonStreamContext _parentContext>
		_generatorFeatures = DEFAULT_GENERATOR_FEATURES;
	//   15   27:aload_0         
	//   16   28:getstatic       #45  <Field int DEFAULT_GENERATOR_FEATURES>
	//   17   31:putfield        #71  <Field int _generatorFeatures>
		_writeContext = JsonWriteContext.createRootContext(((com.fasterxml.jackson.core.json.DupDetector) (null)));
	//   18   34:aload_0         
	//   19   35:aconst_null     
	//   20   36:invokestatic    #77  <Method JsonWriteContext JsonWriteContext.createRootContext(com.fasterxml.jackson.core.json.DupDetector)>
	//   21   39:putfield        #79  <Field JsonWriteContext _writeContext>
		Segment segment = new Segment();
	//   22   42:new             #11  <Class TokenBuffer$Segment>
	//   23   45:dup             
	//   24   46:invokespecial   #80  <Method void TokenBuffer$Segment()>
	//   25   49:astore          4
		_last = segment;
	//   26   51:aload_0         
	//   27   52:aload           4
	//   28   54:putfield        #82  <Field TokenBuffer$Segment _last>
		_first = segment;
	//   29   57:aload_0         
	//   30   58:aload           4
	//   31   60:putfield        #84  <Field TokenBuffer$Segment _first>
		_appendAt = 0;
	//   32   63:aload_0         
	//   33   64:iconst_0        
	//   34   65:putfield        #86  <Field int _appendAt>
		_hasNativeTypeIds = jsonparser.canReadTypeId();
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:invokevirtual   #90  <Method boolean JsonParser.canReadTypeId()>
	//   38   73:putfield        #92  <Field boolean _hasNativeTypeIds>
		_hasNativeObjectIds = jsonparser.canReadObjectId();
	//   39   76:aload_0         
	//   40   77:aload_1         
	//   41   78:invokevirtual   #95  <Method boolean JsonParser.canReadObjectId()>
	//   42   81:putfield        #97  <Field boolean _hasNativeObjectIds>
		_mayHaveNativeIds = _hasNativeTypeIds | _hasNativeObjectIds;
	//   43   84:aload_0         
	//   44   85:aload_0         
	//   45   86:getfield        #92  <Field boolean _hasNativeTypeIds>
	//   46   89:aload_0         
	//   47   90:getfield        #97  <Field boolean _hasNativeObjectIds>
	//   48   93:ior             
	//   49   94:putfield        #99  <Field boolean _mayHaveNativeIds>
		if(deserializationcontext != null)
	//*  50   97:aload_2         
	//*  51   98:ifnonnull       104
	//*  52  101:goto            112
			flag = deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
	//   53  104:aload_2         
	//   54  105:getstatic       #105 <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//   55  108:invokevirtual   #111 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   56  111:istore_3        
		_forceBigDecimal = flag;
	//   57  112:aload_0         
	//   58  113:iload_3         
	//   59  114:putfield        #113 <Field boolean _forceBigDecimal>
	//   60  117:return          
	}

	public TokenBuffer(ObjectCodec objectcodec, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void JsonGenerator()>
		_hasNativeId = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #55  <Field boolean _hasNativeId>
		_objectCodec = objectcodec;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #63  <Field ObjectCodec _objectCodec>
		_generatorFeatures = DEFAULT_GENERATOR_FEATURES;
	//    8   14:aload_0         
	//    9   15:getstatic       #45  <Field int DEFAULT_GENERATOR_FEATURES>
	//   10   18:putfield        #71  <Field int _generatorFeatures>
		_writeContext = JsonWriteContext.createRootContext(((com.fasterxml.jackson.core.json.DupDetector) (null)));
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:invokestatic    #77  <Method JsonWriteContext JsonWriteContext.createRootContext(com.fasterxml.jackson.core.json.DupDetector)>
	//   14   26:putfield        #79  <Field JsonWriteContext _writeContext>
		objectcodec = ((ObjectCodec) (new Segment()));
	//   15   29:new             #11  <Class TokenBuffer$Segment>
	//   16   32:dup             
	//   17   33:invokespecial   #80  <Method void TokenBuffer$Segment()>
	//   18   36:astore_1        
		_last = ((Segment) (objectcodec));
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #82  <Field TokenBuffer$Segment _last>
		_first = ((Segment) (objectcodec));
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:putfield        #84  <Field TokenBuffer$Segment _first>
		_appendAt = 0;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #86  <Field int _appendAt>
		_hasNativeTypeIds = flag;
	//   28   52:aload_0         
	//   29   53:iload_2         
	//   30   54:putfield        #92  <Field boolean _hasNativeTypeIds>
		_hasNativeObjectIds = flag;
	//   31   57:aload_0         
	//   32   58:iload_2         
	//   33   59:putfield        #97  <Field boolean _hasNativeObjectIds>
		_mayHaveNativeIds = _hasNativeTypeIds | _hasNativeObjectIds;
	//   34   62:aload_0         
	//   35   63:aload_0         
	//   36   64:getfield        #92  <Field boolean _hasNativeTypeIds>
	//   37   67:aload_0         
	//   38   68:getfield        #97  <Field boolean _hasNativeObjectIds>
	//   39   71:ior             
	//   40   72:putfield        #99  <Field boolean _mayHaveNativeIds>
	//   41   75:return          
	}

	private final void _appendNativeIds(StringBuilder stringbuilder)
	{
		Object obj = _last.findObjectId(_appendAt - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field TokenBuffer$Segment _last>
	//    2    4:aload_0         
	//    3    5:getfield        #86  <Field int _appendAt>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:invokestatic    #120 <Method Object TokenBuffer$Segment.access$000(TokenBuffer$Segment, int)>
	//    7   13:astore_2        
		if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          41
		{
			stringbuilder.append("[objectId=");
	//   10   18:aload_1         
	//   11   19:ldc1            #122 <String "[objectId=">
	//   12   21:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			stringbuilder.append(String.valueOf(obj));
	//   14   25:aload_1         
	//   15   26:aload_2         
	//   16   27:invokestatic    #134 <Method String String.valueOf(Object)>
	//   17   30:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   18   33:pop             
			stringbuilder.append(']');
	//   19   34:aload_1         
	//   20   35:bipush          93
	//   21   37:invokevirtual   #137 <Method StringBuilder StringBuilder.append(char)>
	//   22   40:pop             
		}
		obj = _last.findTypeId(_appendAt - 1);
	//   23   41:aload_0         
	//   24   42:getfield        #82  <Field TokenBuffer$Segment _last>
	//   25   45:aload_0         
	//   26   46:getfield        #86  <Field int _appendAt>
	//   27   49:iconst_1        
	//   28   50:isub            
	//   29   51:invokestatic    #140 <Method Object TokenBuffer$Segment.access$100(TokenBuffer$Segment, int)>
	//   30   54:astore_2        
		if(obj != null)
	//*  31   55:aload_2         
	//*  32   56:ifnull          82
		{
			stringbuilder.append("[typeId=");
	//   33   59:aload_1         
	//   34   60:ldc1            #142 <String "[typeId=">
	//   35   62:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   36   65:pop             
			stringbuilder.append(String.valueOf(obj));
	//   37   66:aload_1         
	//   38   67:aload_2         
	//   39   68:invokestatic    #134 <Method String String.valueOf(Object)>
	//   40   71:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   41   74:pop             
			stringbuilder.append(']');
	//   42   75:aload_1         
	//   43   76:bipush          93
	//   44   78:invokevirtual   #137 <Method StringBuilder StringBuilder.append(char)>
	//   45   81:pop             
		}
	//   46   82:return          
	}

	private final void _checkNativeIds(JsonParser jsonparser)
		throws IOException
	{
		Object obj = jsonparser.getTypeId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #149 <Method Object JsonParser.getTypeId()>
	//    2    4:astore_2        
		_typeId = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #151 <Field Object _typeId>
		if(obj != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			_hasNativeId = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #55  <Field boolean _hasNativeId>
		jsonparser = ((JsonParser) (jsonparser.getObjectId()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #154 <Method Object JsonParser.getObjectId()>
	//   13   23:astore_1        
		_objectId = ((Object) (jsonparser));
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #156 <Field Object _objectId>
		if(jsonparser != null)
	//*  17   29:aload_1         
	//*  18   30:ifnull          38
			_hasNativeId = true;
	//   19   33:aload_0         
	//   20   34:iconst_1        
	//   21   35:putfield        #55  <Field boolean _hasNativeId>
	//   22   38:return          
	}

	public static TokenBuffer asCopyOfValue(JsonParser jsonparser)
		throws IOException
	{
		TokenBuffer tokenbuffer = new TokenBuffer(jsonparser);
	//    0    0:new             #2   <Class TokenBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #161 <Method void TokenBuffer(JsonParser)>
	//    4    8:astore_1        
		tokenbuffer.copyCurrentStructure(jsonparser);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #164 <Method void copyCurrentStructure(JsonParser)>
		return tokenbuffer;
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	protected final void _append(JsonToken jsontoken)
	{
		if(_hasNativeId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field boolean _hasNativeId>
	//*   2    4:ifeq            31
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, _objectId, _typeId)));
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field TokenBuffer$Segment _last>
	//    5   11:aload_0         
	//    6   12:getfield        #86  <Field int _appendAt>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #156 <Field Object _objectId>
	//   10   20:aload_0         
	//   11   21:getfield        #151 <Field Object _typeId>
	//   12   24:invokevirtual   #169 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object, Object)>
	//   13   27:astore_1        
		else
	//*  14   28:goto            44
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken)));
	//   15   31:aload_0         
	//   16   32:getfield        #82  <Field TokenBuffer$Segment _last>
	//   17   35:aload_0         
	//   18   36:getfield        #86  <Field int _appendAt>
	//   19   39:aload_1         
	//   20   40:invokevirtual   #172 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken)>
	//   21   43:astore_1        
		if(jsontoken == null)
	//*  22   44:aload_1         
	//*  23   45:ifnonnull       59
		{
			_appendAt = _appendAt + 1;
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #86  <Field int _appendAt>
	//   27   53:iconst_1        
	//   28   54:iadd            
	//   29   55:putfield        #86  <Field int _appendAt>
			return;
	//   30   58:return          
		} else
		{
			_last = ((Segment) (jsontoken));
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:putfield        #82  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   34   64:aload_0         
	//   35   65:iconst_1        
	//   36   66:putfield        #86  <Field int _appendAt>
			return;
	//   37   69:return          
		}
	}

	protected final void _append(JsonToken jsontoken, Object obj)
	{
		if(_hasNativeId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field boolean _hasNativeId>
	//*   2    4:ifeq            32
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, obj, _objectId, _typeId)));
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field TokenBuffer$Segment _last>
	//    5   11:aload_0         
	//    6   12:getfield        #86  <Field int _appendAt>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #156 <Field Object _objectId>
	//   11   21:aload_0         
	//   12   22:getfield        #151 <Field Object _typeId>
	//   13   25:invokevirtual   #176 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object, Object, Object)>
	//   14   28:astore_1        
		else
	//*  15   29:goto            46
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, obj)));
	//   16   32:aload_0         
	//   17   33:getfield        #82  <Field TokenBuffer$Segment _last>
	//   18   36:aload_0         
	//   19   37:getfield        #86  <Field int _appendAt>
	//   20   40:aload_1         
	//   21   41:aload_2         
	//   22   42:invokevirtual   #179 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object)>
	//   23   45:astore_1        
		if(jsontoken == null)
	//*  24   46:aload_1         
	//*  25   47:ifnonnull       61
		{
			_appendAt = _appendAt + 1;
	//   26   50:aload_0         
	//   27   51:aload_0         
	//   28   52:getfield        #86  <Field int _appendAt>
	//   29   55:iconst_1        
	//   30   56:iadd            
	//   31   57:putfield        #86  <Field int _appendAt>
			return;
	//   32   60:return          
		} else
		{
			_last = ((Segment) (jsontoken));
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:putfield        #82  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   36   66:aload_0         
	//   37   67:iconst_1        
	//   38   68:putfield        #86  <Field int _appendAt>
			return;
	//   39   71:return          
		}
	}

	protected final void _appendValue(JsonToken jsontoken)
	{
		_writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #183 <Method int JsonWriteContext.writeValue()>
	//    3    7:pop             
		if(_hasNativeId)
	//*   4    8:aload_0         
	//*   5    9:getfield        #55  <Field boolean _hasNativeId>
	//*   6   12:ifeq            39
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, _objectId, _typeId)));
	//    7   15:aload_0         
	//    8   16:getfield        #82  <Field TokenBuffer$Segment _last>
	//    9   19:aload_0         
	//   10   20:getfield        #86  <Field int _appendAt>
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #156 <Field Object _objectId>
	//   14   28:aload_0         
	//   15   29:getfield        #151 <Field Object _typeId>
	//   16   32:invokevirtual   #169 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object, Object)>
	//   17   35:astore_1        
		else
	//*  18   36:goto            52
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken)));
	//   19   39:aload_0         
	//   20   40:getfield        #82  <Field TokenBuffer$Segment _last>
	//   21   43:aload_0         
	//   22   44:getfield        #86  <Field int _appendAt>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #172 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken)>
	//   25   51:astore_1        
		if(jsontoken == null)
	//*  26   52:aload_1         
	//*  27   53:ifnonnull       67
		{
			_appendAt = _appendAt + 1;
	//   28   56:aload_0         
	//   29   57:aload_0         
	//   30   58:getfield        #86  <Field int _appendAt>
	//   31   61:iconst_1        
	//   32   62:iadd            
	//   33   63:putfield        #86  <Field int _appendAt>
			return;
	//   34   66:return          
		} else
		{
			_last = ((Segment) (jsontoken));
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:putfield        #82  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   38   72:aload_0         
	//   39   73:iconst_1        
	//   40   74:putfield        #86  <Field int _appendAt>
			return;
	//   41   77:return          
		}
	}

	protected final void _appendValue(JsonToken jsontoken, Object obj)
	{
		_writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #183 <Method int JsonWriteContext.writeValue()>
	//    3    7:pop             
		if(_hasNativeId)
	//*   4    8:aload_0         
	//*   5    9:getfield        #55  <Field boolean _hasNativeId>
	//*   6   12:ifeq            40
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, obj, _objectId, _typeId)));
	//    7   15:aload_0         
	//    8   16:getfield        #82  <Field TokenBuffer$Segment _last>
	//    9   19:aload_0         
	//   10   20:getfield        #86  <Field int _appendAt>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:getfield        #156 <Field Object _objectId>
	//   15   29:aload_0         
	//   16   30:getfield        #151 <Field Object _typeId>
	//   17   33:invokevirtual   #176 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object, Object, Object)>
	//   18   36:astore_1        
		else
	//*  19   37:goto            54
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, obj)));
	//   20   40:aload_0         
	//   21   41:getfield        #82  <Field TokenBuffer$Segment _last>
	//   22   44:aload_0         
	//   23   45:getfield        #86  <Field int _appendAt>
	//   24   48:aload_1         
	//   25   49:aload_2         
	//   26   50:invokevirtual   #179 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object)>
	//   27   53:astore_1        
		if(jsontoken == null)
	//*  28   54:aload_1         
	//*  29   55:ifnonnull       69
		{
			_appendAt = _appendAt + 1;
	//   30   58:aload_0         
	//   31   59:aload_0         
	//   32   60:getfield        #86  <Field int _appendAt>
	//   33   63:iconst_1        
	//   34   64:iadd            
	//   35   65:putfield        #86  <Field int _appendAt>
			return;
	//   36   68:return          
		} else
		{
			_last = ((Segment) (jsontoken));
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:putfield        #82  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   40   74:aload_0         
	//   41   75:iconst_1        
	//   42   76:putfield        #86  <Field int _appendAt>
			return;
	//   43   79:return          
		}
	}

	protected void _reportUnsupportedOperation()
	{
		throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
	//    0    0:new             #186 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #188 <String "Called operation not supported for TokenBuffer">
	//    3    6:invokespecial   #191 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public TokenBuffer append(TokenBuffer tokenbuffer)
		throws IOException
	{
		if(!_hasNativeTypeIds)
	//*   0    0:aload_0         
	//*   1    1:getfield        #92  <Field boolean _hasNativeTypeIds>
	//*   2    4:ifne            15
			_hasNativeTypeIds = tokenbuffer.canWriteTypeId();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #195 <Method boolean canWriteTypeId()>
	//    6   12:putfield        #92  <Field boolean _hasNativeTypeIds>
		if(!_hasNativeObjectIds)
	//*   7   15:aload_0         
	//*   8   16:getfield        #97  <Field boolean _hasNativeObjectIds>
	//*   9   19:ifne            30
			_hasNativeObjectIds = tokenbuffer.canWriteObjectId();
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #198 <Method boolean canWriteObjectId()>
	//   13   27:putfield        #97  <Field boolean _hasNativeObjectIds>
		_mayHaveNativeIds = _hasNativeTypeIds | _hasNativeObjectIds;
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #92  <Field boolean _hasNativeTypeIds>
	//   17   35:aload_0         
	//   18   36:getfield        #97  <Field boolean _hasNativeObjectIds>
	//   19   39:ior             
	//   20   40:putfield        #99  <Field boolean _mayHaveNativeIds>
		for(tokenbuffer = ((TokenBuffer) (tokenbuffer.asParser())); ((JsonParser) (tokenbuffer)).nextToken() != null; copyCurrentStructure(((JsonParser) (tokenbuffer))));
	//   21   43:aload_1         
	//   22   44:invokevirtual   #202 <Method JsonParser asParser()>
	//   23   47:astore_1        
	//   24   48:aload_1         
	//   25   49:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   26   52:ifnull          63
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #164 <Method void copyCurrentStructure(JsonParser)>
	//*  30   60:goto            48
		return this;
	//   31   63:aload_0         
	//   32   64:areturn         
	}

	public JsonParser asParser()
	{
		return asParser(_objectCodec);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field ObjectCodec _objectCodec>
	//    3    5:invokevirtual   #209 <Method JsonParser asParser(ObjectCodec)>
	//    4    8:areturn         
	}

	public JsonParser asParser(JsonParser jsonparser)
	{
		Parser parser = new Parser(_first, jsonparser.getCodec(), _hasNativeTypeIds, _hasNativeObjectIds, _parentContext);
	//    0    0:new             #8   <Class TokenBuffer$Parser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field TokenBuffer$Segment _first>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #61  <Method ObjectCodec JsonParser.getCodec()>
	//    6   12:aload_0         
	//    7   13:getfield        #92  <Field boolean _hasNativeTypeIds>
	//    8   16:aload_0         
	//    9   17:getfield        #97  <Field boolean _hasNativeObjectIds>
	//   10   20:aload_0         
	//   11   21:getfield        #69  <Field JsonStreamContext _parentContext>
	//   12   24:invokespecial   #213 <Method void TokenBuffer$Parser(TokenBuffer$Segment, ObjectCodec, boolean, boolean, JsonStreamContext)>
	//   13   27:astore_2        
		parser.setLocation(jsonparser.getTokenLocation());
	//   14   28:aload_2         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #217 <Method JsonLocation JsonParser.getTokenLocation()>
	//   17   33:invokevirtual   #221 <Method void TokenBuffer$Parser.setLocation(JsonLocation)>
		return ((JsonParser) (parser));
	//   18   36:aload_2         
	//   19   37:areturn         
	}

	public JsonParser asParser(ObjectCodec objectcodec)
	{
		return ((JsonParser) (new Parser(_first, objectcodec, _hasNativeTypeIds, _hasNativeObjectIds, _parentContext)));
	//    0    0:new             #8   <Class TokenBuffer$Parser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #84  <Field TokenBuffer$Segment _first>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #92  <Field boolean _hasNativeTypeIds>
	//    7   13:aload_0         
	//    8   14:getfield        #97  <Field boolean _hasNativeObjectIds>
	//    9   17:aload_0         
	//   10   18:getfield        #69  <Field JsonStreamContext _parentContext>
	//   11   21:invokespecial   #213 <Method void TokenBuffer$Parser(TokenBuffer$Segment, ObjectCodec, boolean, boolean, JsonStreamContext)>
	//   12   24:areturn         
	}

	public JsonParser asParserOnFirstToken()
		throws IOException
	{
		JsonParser jsonparser = asParser(_objectCodec);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field ObjectCodec _objectCodec>
	//    3    5:invokevirtual   #209 <Method JsonParser asParser(ObjectCodec)>
	//    4    8:astore_1        
		jsonparser.nextToken();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//    7   13:pop             
		return jsonparser;
	//    8   14:aload_1         
	//    9   15:areturn         
	}

	public boolean canWriteBinaryNatively()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean canWriteObjectId()
	{
		return _hasNativeObjectIds;
	//    0    0:aload_0         
	//    1    1:getfield        #97  <Field boolean _hasNativeObjectIds>
	//    2    4:ireturn         
	}

	public boolean canWriteTypeId()
	{
		return _hasNativeTypeIds;
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field boolean _hasNativeTypeIds>
	//    2    4:ireturn         
	}

	public void close()
		throws IOException
	{
		_closed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #226 <Field boolean _closed>
	//    3    5:return          
	}

	public void copyCurrentEvent(JsonParser jsonparser)
		throws IOException
	{
		if(_mayHaveNativeIds)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field boolean _mayHaveNativeIds>
	//*   2    4:ifeq            12
			_checkNativeIds(jsonparser);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #229 <Method void _checkNativeIds(JsonParser)>
		switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()])
	//*   6   12:getstatic       #233 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #236 <Method JsonToken JsonParser.getCurrentToken()>
	//*   9   19:invokevirtual   #241 <Method int JsonToken.ordinal()>
	//*  10   22:iaload          
		{
	//*  11   23:tableswitch     1 12: default 84
	//	               1 312
	//	               2 307
	//	               3 302
	//	               4 297
	//	               5 288
	//	               6 255
	//	               7 195
	//	               8 120
	//	               9 114
	//	               10 108
	//	               11 103
	//	               12 94
		default:
			throw new RuntimeException("Internal error: should never end up through this code path");
	//   12   84:new             #243 <Class RuntimeException>
	//   13   87:dup             
	//   14   88:ldc1            #245 <String "Internal error: should never end up through this code path">
	//   15   90:invokespecial   #246 <Method void RuntimeException(String)>
	//   16   93:athrow          

		case 12: // '\f'
			writeObject(jsonparser.getEmbeddedObject());
	//   17   94:aload_0         
	//   18   95:aload_1         
	//   19   96:invokevirtual   #249 <Method Object JsonParser.getEmbeddedObject()>
	//   20   99:invokevirtual   #253 <Method void writeObject(Object)>
			return;
	//   21  102:return          

		case 11: // '\013'
			writeNull();
	//   22  103:aload_0         
	//   23  104:invokevirtual   #256 <Method void writeNull()>
			return;
	//   24  107:return          

		case 10: // '\n'
			writeBoolean(false);
	//   25  108:aload_0         
	//   26  109:iconst_0        
	//   27  110:invokevirtual   #260 <Method void writeBoolean(boolean)>
			return;
	//   28  113:return          

		case 9: // '\t'
			writeBoolean(true);
	//   29  114:aload_0         
	//   30  115:iconst_1        
	//   31  116:invokevirtual   #260 <Method void writeBoolean(boolean)>
			return;
	//   32  119:return          

		case 8: // '\b'
			if(_forceBigDecimal)
	//*  33  120:aload_0         
	//*  34  121:getfield        #113 <Field boolean _forceBigDecimal>
	//*  35  124:ifeq            136
			{
				writeNumber(jsonparser.getDecimalValue());
	//   36  127:aload_0         
	//   37  128:aload_1         
	//   38  129:invokevirtual   #264 <Method BigDecimal JsonParser.getDecimalValue()>
	//   39  132:invokevirtual   #268 <Method void writeNumber(BigDecimal)>
				return;
	//   40  135:return          
			}
			switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
	//*  41  136:getstatic       #271 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  42  139:aload_1         
	//*  43  140:invokevirtual   #275 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*  44  143:invokevirtual   #278 <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  45  146:iaload          
			{
	//*  46  147:tableswitch     3 4: default 168
	//	               3 186
	//	               4 177
			default:
				writeNumber(jsonparser.getDoubleValue());
	//   47  168:aload_0         
	//   48  169:aload_1         
	//   49  170:invokevirtual   #282 <Method double JsonParser.getDoubleValue()>
	//   50  173:invokevirtual   #285 <Method void writeNumber(double)>
				return;
	//   51  176:return          

			case 4: // '\004'
				writeNumber(jsonparser.getFloatValue());
	//   52  177:aload_0         
	//   53  178:aload_1         
	//   54  179:invokevirtual   #289 <Method float JsonParser.getFloatValue()>
	//   55  182:invokevirtual   #292 <Method void writeNumber(float)>
				return;
	//   56  185:return          

			case 3: // '\003'
				writeNumber(jsonparser.getDecimalValue());
	//   57  186:aload_0         
	//   58  187:aload_1         
	//   59  188:invokevirtual   #264 <Method BigDecimal JsonParser.getDecimalValue()>
	//   60  191:invokevirtual   #268 <Method void writeNumber(BigDecimal)>
				return;
	//   61  194:return          
			}

		case 7: // '\007'
			switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
	//*  62  195:getstatic       #271 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  63  198:aload_1         
	//*  64  199:invokevirtual   #275 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*  65  202:invokevirtual   #278 <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  66  205:iaload          
			{
	//*  67  206:tableswitch     1 2: default 228
	//	               1 246
	//	               2 237
			default:
				writeNumber(jsonparser.getLongValue());
	//   68  228:aload_0         
	//   69  229:aload_1         
	//   70  230:invokevirtual   #296 <Method long JsonParser.getLongValue()>
	//   71  233:invokevirtual   #299 <Method void writeNumber(long)>
				return;
	//   72  236:return          

			case 2: // '\002'
				writeNumber(jsonparser.getBigIntegerValue());
	//   73  237:aload_0         
	//   74  238:aload_1         
	//   75  239:invokevirtual   #303 <Method BigInteger JsonParser.getBigIntegerValue()>
	//   76  242:invokevirtual   #306 <Method void writeNumber(BigInteger)>
				return;
	//   77  245:return          

			case 1: // '\001'
				writeNumber(jsonparser.getIntValue());
	//   78  246:aload_0         
	//   79  247:aload_1         
	//   80  248:invokevirtual   #309 <Method int JsonParser.getIntValue()>
	//   81  251:invokevirtual   #312 <Method void writeNumber(int)>
				return;
	//   82  254:return          
			}

		case 6: // '\006'
			if(jsonparser.hasTextCharacters())
	//*  83  255:aload_1         
	//*  84  256:invokevirtual   #315 <Method boolean JsonParser.hasTextCharacters()>
	//*  85  259:ifeq            279
			{
				writeString(jsonparser.getTextCharacters(), jsonparser.getTextOffset(), jsonparser.getTextLength());
	//   86  262:aload_0         
	//   87  263:aload_1         
	//   88  264:invokevirtual   #319 <Method char[] JsonParser.getTextCharacters()>
	//   89  267:aload_1         
	//   90  268:invokevirtual   #322 <Method int JsonParser.getTextOffset()>
	//   91  271:aload_1         
	//   92  272:invokevirtual   #325 <Method int JsonParser.getTextLength()>
	//   93  275:invokevirtual   #329 <Method void writeString(char[], int, int)>
				return;
	//   94  278:return          
			} else
			{
				writeString(jsonparser.getText());
	//   95  279:aload_0         
	//   96  280:aload_1         
	//   97  281:invokevirtual   #333 <Method String JsonParser.getText()>
	//   98  284:invokevirtual   #335 <Method void writeString(String)>
				return;
	//   99  287:return          
			}

		case 5: // '\005'
			writeFieldName(jsonparser.getCurrentName());
	//  100  288:aload_0         
	//  101  289:aload_1         
	//  102  290:invokevirtual   #338 <Method String JsonParser.getCurrentName()>
	//  103  293:invokevirtual   #341 <Method void writeFieldName(String)>
			return;
	//  104  296:return          

		case 4: // '\004'
			writeEndArray();
	//  105  297:aload_0         
	//  106  298:invokevirtual   #344 <Method void writeEndArray()>
			return;
	//  107  301:return          

		case 3: // '\003'
			writeStartArray();
	//  108  302:aload_0         
	//  109  303:invokevirtual   #347 <Method void writeStartArray()>
			return;
	//  110  306:return          

		case 2: // '\002'
			writeEndObject();
	//  111  307:aload_0         
	//  112  308:invokevirtual   #350 <Method void writeEndObject()>
			return;
	//  113  311:return          

		case 1: // '\001'
			writeStartObject();
	//  114  312:aload_0         
	//  115  313:invokevirtual   #353 <Method void writeStartObject()>
			return;
	//  116  316:return          
		}
	}

	public void copyCurrentStructure(JsonParser jsonparser)
		throws IOException
	{
		JsonToken jsontoken1 = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #236 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore          4
		JsonToken jsontoken = jsontoken1;
	//    3    6:aload           4
	//    4    8:astore_3        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    9:aload           4
	//*   6   11:getstatic       #357 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   14:if_acmpne       42
		{
			if(_mayHaveNativeIds)
	//*   8   17:aload_0         
	//*   9   18:getfield        #99  <Field boolean _mayHaveNativeIds>
	//*  10   21:ifeq            29
				_checkNativeIds(jsonparser);
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:invokespecial   #229 <Method void _checkNativeIds(JsonParser)>
			writeFieldName(jsonparser.getCurrentName());
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #338 <Method String JsonParser.getCurrentName()>
	//   17   34:invokevirtual   #341 <Method void writeFieldName(String)>
			jsontoken = jsonparser.nextToken();
	//   18   37:aload_1         
	//   19   38:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   20   41:astore_3        
		}
		if(_mayHaveNativeIds)
	//*  21   42:aload_0         
	//*  22   43:getfield        #99  <Field boolean _mayHaveNativeIds>
	//*  23   46:ifeq            54
			_checkNativeIds(jsonparser);
	//   24   49:aload_0         
	//   25   50:aload_1         
	//   26   51:invokespecial   #229 <Method void _checkNativeIds(JsonParser)>
		int i = _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()];
	//   27   54:getstatic       #233 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//   28   57:aload_3         
	//   29   58:invokevirtual   #241 <Method int JsonToken.ordinal()>
	//   30   61:iaload          
	//   31   62:istore_2        
		if(i != 1)
	//*  32   63:iload_2         
	//*  33   64:iconst_1        
	//*  34   65:icmpeq          106
		{
			if(i != 3)
	//*  35   68:iload_2         
	//*  36   69:iconst_3        
	//*  37   70:icmpeq          79
			{
				copyCurrentEvent(jsonparser);
	//   38   73:aload_0         
	//   39   74:aload_1         
	//   40   75:invokevirtual   #359 <Method void copyCurrentEvent(JsonParser)>
				return;
	//   41   78:return          
			}
			writeStartArray();
	//   42   79:aload_0         
	//   43   80:invokevirtual   #347 <Method void writeStartArray()>
			for(; jsonparser.nextToken() != JsonToken.END_ARRAY; copyCurrentStructure(jsonparser));
	//   44   83:aload_1         
	//   45   84:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   46   87:getstatic       #362 <Field JsonToken JsonToken.END_ARRAY>
	//   47   90:if_acmpeq       101
	//   48   93:aload_0         
	//   49   94:aload_1         
	//   50   95:invokevirtual   #164 <Method void copyCurrentStructure(JsonParser)>
	//*  51   98:goto            83
			writeEndArray();
	//   52  101:aload_0         
	//   53  102:invokevirtual   #344 <Method void writeEndArray()>
			return;
	//   54  105:return          
		}
		writeStartObject();
	//   55  106:aload_0         
	//   56  107:invokevirtual   #353 <Method void writeStartObject()>
		for(; jsonparser.nextToken() != JsonToken.END_OBJECT; copyCurrentStructure(jsonparser));
	//   57  110:aload_1         
	//   58  111:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   59  114:getstatic       #365 <Field JsonToken JsonToken.END_OBJECT>
	//   60  117:if_acmpeq       128
	//   61  120:aload_0         
	//   62  121:aload_1         
	//   63  122:invokevirtual   #164 <Method void copyCurrentStructure(JsonParser)>
	//*  64  125:goto            110
		writeEndObject();
	//   65  128:aload_0         
	//   66  129:invokevirtual   #350 <Method void writeEndObject()>
	//   67  132:return          
	}

	public TokenBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getCurrentTokenId() != JsonToken.FIELD_NAME.id())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #370 <Method int JsonParser.getCurrentTokenId()>
	//*   2    4:getstatic       #357 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:invokevirtual   #373 <Method int JsonToken.id()>
	//*   4   10:icmpeq          20
		{
			copyCurrentStructure(jsonparser);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokevirtual   #164 <Method void copyCurrentStructure(JsonParser)>
			return this;
	//    8   18:aload_0         
	//    9   19:areturn         
		}
		writeStartObject();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #353 <Method void writeStartObject()>
		JsonToken jsontoken;
		do
		{
			copyCurrentStructure(jsonparser);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #164 <Method void copyCurrentStructure(JsonParser)>
			jsontoken = jsonparser.nextToken();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   17   33:astore_3        
		} while(jsontoken == JsonToken.FIELD_NAME);
	//   18   34:aload_3         
	//   19   35:getstatic       #357 <Field JsonToken JsonToken.FIELD_NAME>
	//   20   38:if_acmpeq       24
		if(jsontoken != JsonToken.END_OBJECT)
	//*  21   41:aload_3         
	//*  22   42:getstatic       #365 <Field JsonToken JsonToken.END_OBJECT>
	//*  23   45:if_acmpeq       93
		{
			jsonparser = ((JsonParser) (JsonToken.END_OBJECT));
	//   24   48:getstatic       #365 <Field JsonToken JsonToken.END_OBJECT>
	//   25   51:astore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   26   52:new             #124 <Class StringBuilder>
	//   27   55:dup             
	//   28   56:invokespecial   #374 <Method void StringBuilder()>
	//   29   59:astore          4
			stringbuilder.append("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ");
	//   30   61:aload           4
	//   31   63:ldc2            #376 <String "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ">
	//   32   66:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
			stringbuilder.append(((Object) (jsontoken)));
	//   34   70:aload           4
	//   35   72:aload_3         
	//   36   73:invokevirtual   #379 <Method StringBuilder StringBuilder.append(Object)>
	//   37   76:pop             
			deserializationcontext.reportWrongTokenException(com/fasterxml/jackson/databind/util/TokenBuffer, ((JsonToken) (jsonparser)), stringbuilder.toString(), new Object[0]);
	//   38   77:aload_2         
	//   39   78:ldc1            #2   <Class TokenBuffer>
	//   40   80:aload_1         
	//   41   81:aload           4
	//   42   83:invokevirtual   #382 <Method String StringBuilder.toString()>
	//   43   86:iconst_0        
	//   44   87:anewarray       Object[]
	//   45   90:invokevirtual   #388 <Method void DeserializationContext.reportWrongTokenException(Class, JsonToken, String, Object[])>
		}
		writeEndObject();
	//   46   93:aload_0         
	//   47   94:invokevirtual   #350 <Method void writeEndObject()>
		return this;
	//   48   97:aload_0         
	//   49   98:areturn         
	}

	public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		int i = _generatorFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _generatorFeatures>
	//    2    4:istore_2        
		_generatorFeatures = feature.getMask() & i;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #393 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    6   10:iload_2         
	//    7   11:iand            
	//    8   12:putfield        #71  <Field int _generatorFeatures>
		return ((JsonGenerator) (this));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public JsonToken firstToken()
	{
		return _first.type(0);
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TokenBuffer$Segment _first>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #398 <Method JsonToken TokenBuffer$Segment.type(int)>
	//    4    8:areturn         
	}

	public void flush()
		throws IOException
	{
	//    0    0:return          
	}

	public TokenBuffer forceUseOfBigDecimal(boolean flag)
	{
		_forceBigDecimal = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #113 <Field boolean _forceBigDecimal>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public int getFeatureMask()
	{
		return _generatorFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field int _generatorFeatures>
	//    2    4:ireturn         
	}

	public volatile JsonStreamContext getOutputContext()
	{
		return ((JsonStreamContext) (getOutputContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #406 <Method JsonWriteContext getOutputContext()>
	//    2    4:areturn         
	}

	public final JsonWriteContext getOutputContext()
	{
		return _writeContext;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonWriteContext _writeContext>
	//    2    4:areturn         
	}

	public JsonGenerator overrideStdFeatures(int i, int j)
	{
		_generatorFeatures = i & j | getFeatureMask() & j;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iand            
	//    4    4:aload_0         
	//    5    5:invokevirtual   #410 <Method int getFeatureMask()>
	//    6    8:iload_2         
	//    7    9:iand            
	//    8   10:ior             
	//    9   11:putfield        #71  <Field int _generatorFeatures>
		return ((JsonGenerator) (this));
	//   10   14:aload_0         
	//   11   15:areturn         
	}

	public void serialize(JsonGenerator jsongenerator)
		throws IOException
	{
		Object obj = ((Object) (_first));
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field TokenBuffer$Segment _first>
	//    2    4:astore          7
		boolean flag2 = _mayHaveNativeIds;
	//    3    6:aload_0         
	//    4    7:getfield        #99  <Field boolean _mayHaveNativeIds>
	//    5   10:istore          5
		boolean flag;
		if(flag2 && ((Segment) (obj)).hasIds())
	//*   6   12:iload           5
	//*   7   14:ifeq            30
	//*   8   17:aload           7
	//*   9   19:invokevirtual   #415 <Method boolean TokenBuffer$Segment.hasIds()>
	//*  10   22:ifeq            30
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_2        
		else
	//*  13   27:goto            32
			flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_2        
		int j = -1;
	//   16   32:iconst_m1       
	//   17   33:istore          4
		boolean flag1 = flag;
	//   18   35:iload_2         
	//   19   36:istore_3        
		do
		{
			j++;
	//   20   37:iload           4
	//   21   39:iconst_1        
	//   22   40:iadd            
	//   23   41:istore          4
			Segment segment = ((Segment) (obj));
	//   24   43:aload           7
	//   25   45:astore          6
			int i = j;
	//   26   47:iload           4
	//   27   49:istore_2        
			if(j >= 16)
	//*  28   50:iload           4
	//*  29   52:bipush          16
	//*  30   54:icmplt          92
			{
				segment = ((Segment) (obj)).next();
	//   31   57:aload           7
	//   32   59:invokevirtual   #419 <Method TokenBuffer$Segment TokenBuffer$Segment.next()>
	//   33   62:astore          6
				if(segment == null)
	//*  34   64:aload           6
	//*  35   66:ifnonnull       70
					return;
	//   36   69:return          
				if(flag2 && segment.hasIds())
	//*  37   70:iload           5
	//*  38   72:ifeq            88
	//*  39   75:aload           6
	//*  40   77:invokevirtual   #415 <Method boolean TokenBuffer$Segment.hasIds()>
	//*  41   80:ifeq            88
					flag1 = true;
	//   42   83:iconst_1        
	//   43   84:istore_3        
				else
	//*  44   85:goto            90
					flag1 = false;
	//   45   88:iconst_0        
	//   46   89:istore_3        
				i = 0;
	//   47   90:iconst_0        
	//   48   91:istore_2        
			}
			obj = ((Object) (segment.type(i)));
	//   49   92:aload           6
	//   50   94:iload_2         
	//   51   95:invokevirtual   #398 <Method JsonToken TokenBuffer$Segment.type(int)>
	//   52   98:astore          7
			if(obj == null)
	//*  53  100:aload           7
	//*  54  102:ifnonnull       106
				return;
	//   55  105:return          
			if(flag1)
	//*  56  106:iload_3         
	//*  57  107:ifeq            148
			{
				Object obj1 = segment.findObjectId(i);
	//   58  110:aload           6
	//   59  112:iload_2         
	//   60  113:invokestatic    #120 <Method Object TokenBuffer$Segment.access$000(TokenBuffer$Segment, int)>
	//   61  116:astore          8
				if(obj1 != null)
	//*  62  118:aload           8
	//*  63  120:ifnull          129
					jsongenerator.writeObjectId(obj1);
	//   64  123:aload_1         
	//   65  124:aload           8
	//   66  126:invokevirtual   #422 <Method void JsonGenerator.writeObjectId(Object)>
				obj1 = segment.findTypeId(i);
	//   67  129:aload           6
	//   68  131:iload_2         
	//   69  132:invokestatic    #140 <Method Object TokenBuffer$Segment.access$100(TokenBuffer$Segment, int)>
	//   70  135:astore          8
				if(obj1 != null)
	//*  71  137:aload           8
	//*  72  139:ifnull          148
					jsongenerator.writeTypeId(obj1);
	//   73  142:aload_1         
	//   74  143:aload           8
	//   75  145:invokevirtual   #425 <Method void JsonGenerator.writeTypeId(Object)>
			}
			switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[((JsonToken) (obj)).ordinal()])
	//*  76  148:getstatic       #233 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  77  151:aload           7
	//*  78  153:invokevirtual   #241 <Method int JsonToken.ordinal()>
	//*  79  156:iaload          
			{
	//*  80  157:tableswitch     1 12: default 220
	//	               1 817
	//	               2 803
	//	               3 789
	//	               4 775
	//	               5 721
	//	               6 667
	//	               7 520
	//	               8 349
	//	               9 334
	//	               10 319
	//	               11 305
	//	               12 230
			default:
				throw new RuntimeException("Internal error: should never end up through this code path");
	//   81  220:new             #243 <Class RuntimeException>
	//   82  223:dup             
	//   83  224:ldc1            #245 <String "Internal error: should never end up through this code path">
	//   84  226:invokespecial   #246 <Method void RuntimeException(String)>
	//   85  229:athrow          

			case 12: // '\f'
				obj = segment.get(i);
	//   86  230:aload           6
	//   87  232:iload_2         
	//   88  233:invokevirtual   #429 <Method Object TokenBuffer$Segment.get(int)>
	//   89  236:astore          7
				if(obj instanceof RawValue)
	//*  90  238:aload           7
	//*  91  240:instanceof      #431 <Class RawValue>
	//*  92  243:ifeq            265
				{
					((RawValue)obj).serialize(jsongenerator);
	//   93  246:aload           7
	//   94  248:checkcast       #431 <Class RawValue>
	//   95  251:aload_1         
	//   96  252:invokevirtual   #433 <Method void RawValue.serialize(JsonGenerator)>
					obj = ((Object) (segment));
	//   97  255:aload           6
	//   98  257:astore          7
					j = i;
	//   99  259:iload_2         
	//  100  260:istore          4
				} else
	//* 101  262:goto            37
				if(obj instanceof JsonSerializable)
	//* 102  265:aload           7
	//* 103  267:instanceof      #435 <Class JsonSerializable>
	//* 104  270:ifeq            289
				{
					jsongenerator.writeObject(obj);
	//  105  273:aload_1         
	//  106  274:aload           7
	//  107  276:invokevirtual   #436 <Method void JsonGenerator.writeObject(Object)>
					obj = ((Object) (segment));
	//  108  279:aload           6
	//  109  281:astore          7
					j = i;
	//  110  283:iload_2         
	//  111  284:istore          4
				} else
	//* 112  286:goto            37
				{
					jsongenerator.writeEmbeddedObject(obj);
	//  113  289:aload_1         
	//  114  290:aload           7
	//  115  292:invokevirtual   #439 <Method void JsonGenerator.writeEmbeddedObject(Object)>
					obj = ((Object) (segment));
	//  116  295:aload           6
	//  117  297:astore          7
					j = i;
	//  118  299:iload_2         
	//  119  300:istore          4
				}
				break;

	//* 120  302:goto            37
			case 11: // '\013'
				jsongenerator.writeNull();
	//  121  305:aload_1         
	//  122  306:invokevirtual   #440 <Method void JsonGenerator.writeNull()>
				obj = ((Object) (segment));
	//  123  309:aload           6
	//  124  311:astore          7
				j = i;
	//  125  313:iload_2         
	//  126  314:istore          4
				break;

	//* 127  316:goto            37
			case 10: // '\n'
				jsongenerator.writeBoolean(false);
	//  128  319:aload_1         
	//  129  320:iconst_0        
	//  130  321:invokevirtual   #441 <Method void JsonGenerator.writeBoolean(boolean)>
				obj = ((Object) (segment));
	//  131  324:aload           6
	//  132  326:astore          7
				j = i;
	//  133  328:iload_2         
	//  134  329:istore          4
				break;

	//* 135  331:goto            37
			case 9: // '\t'
				jsongenerator.writeBoolean(true);
	//  136  334:aload_1         
	//  137  335:iconst_1        
	//  138  336:invokevirtual   #441 <Method void JsonGenerator.writeBoolean(boolean)>
				obj = ((Object) (segment));
	//  139  339:aload           6
	//  140  341:astore          7
				j = i;
	//  141  343:iload_2         
	//  142  344:istore          4
				break;

	//* 143  346:goto            37
			case 8: // '\b'
				obj = segment.get(i);
	//  144  349:aload           6
	//  145  351:iload_2         
	//  146  352:invokevirtual   #429 <Method Object TokenBuffer$Segment.get(int)>
	//  147  355:astore          7
				if(obj instanceof Double)
	//* 148  357:aload           7
	//* 149  359:instanceof      #443 <Class Double>
	//* 150  362:ifeq            387
				{
					jsongenerator.writeNumber(((Double)obj).doubleValue());
	//  151  365:aload_1         
	//  152  366:aload           7
	//  153  368:checkcast       #443 <Class Double>
	//  154  371:invokevirtual   #446 <Method double Double.doubleValue()>
	//  155  374:invokevirtual   #447 <Method void JsonGenerator.writeNumber(double)>
					obj = ((Object) (segment));
	//  156  377:aload           6
	//  157  379:astore          7
					j = i;
	//  158  381:iload_2         
	//  159  382:istore          4
				} else
	//* 160  384:goto            37
				if(obj instanceof BigDecimal)
	//* 161  387:aload           7
	//* 162  389:instanceof      #449 <Class BigDecimal>
	//* 163  392:ifeq            414
				{
					jsongenerator.writeNumber((BigDecimal)obj);
	//  164  395:aload_1         
	//  165  396:aload           7
	//  166  398:checkcast       #449 <Class BigDecimal>
	//  167  401:invokevirtual   #450 <Method void JsonGenerator.writeNumber(BigDecimal)>
					obj = ((Object) (segment));
	//  168  404:aload           6
	//  169  406:astore          7
					j = i;
	//  170  408:iload_2         
	//  171  409:istore          4
				} else
	//* 172  411:goto            37
				if(obj instanceof Float)
	//* 173  414:aload           7
	//* 174  416:instanceof      #452 <Class Float>
	//* 175  419:ifeq            444
				{
					jsongenerator.writeNumber(((Float)obj).floatValue());
	//  176  422:aload_1         
	//  177  423:aload           7
	//  178  425:checkcast       #452 <Class Float>
	//  179  428:invokevirtual   #455 <Method float Float.floatValue()>
	//  180  431:invokevirtual   #456 <Method void JsonGenerator.writeNumber(float)>
					obj = ((Object) (segment));
	//  181  434:aload           6
	//  182  436:astore          7
					j = i;
	//  183  438:iload_2         
	//  184  439:istore          4
				} else
	//* 185  441:goto            37
				if(obj == null)
	//* 186  444:aload           7
	//* 187  446:ifnonnull       463
				{
					jsongenerator.writeNull();
	//  188  449:aload_1         
	//  189  450:invokevirtual   #440 <Method void JsonGenerator.writeNull()>
					obj = ((Object) (segment));
	//  190  453:aload           6
	//  191  455:astore          7
					j = i;
	//  192  457:iload_2         
	//  193  458:istore          4
				} else
	//* 194  460:goto            37
				if(obj instanceof String)
	//* 195  463:aload           7
	//* 196  465:instanceof      #130 <Class String>
	//* 197  468:ifeq            490
				{
					jsongenerator.writeNumber((String)obj);
	//  198  471:aload_1         
	//  199  472:aload           7
	//  200  474:checkcast       #130 <Class String>
	//  201  477:invokevirtual   #458 <Method void JsonGenerator.writeNumber(String)>
					obj = ((Object) (segment));
	//  202  480:aload           6
	//  203  482:astore          7
					j = i;
	//  204  484:iload_2         
	//  205  485:istore          4
				} else
	//* 206  487:goto            37
				{
					throw new JsonGenerationException(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize", new Object[] {
						obj.getClass().getName()
					}), jsongenerator);
	//  207  490:new             #460 <Class JsonGenerationException>
	//  208  493:dup             
	//  209  494:ldc2            #462 <String "Unrecognized value type for VALUE_NUMBER_FLOAT: %s, cannot serialize">
	//  210  497:iconst_1        
	//  211  498:anewarray       Object[]
	//  212  501:dup             
	//  213  502:iconst_0        
	//  214  503:aload           7
	//  215  505:invokevirtual   #466 <Method Class Object.getClass()>
	//  216  508:invokevirtual   #471 <Method String Class.getName()>
	//  217  511:aastore         
	//  218  512:invokestatic    #475 <Method String String.format(String, Object[])>
	//  219  515:aload_1         
	//  220  516:invokespecial   #478 <Method void JsonGenerationException(String, JsonGenerator)>
	//  221  519:athrow          
				}
				break;

			case 7: // '\007'
				obj = segment.get(i);
	//  222  520:aload           6
	//  223  522:iload_2         
	//  224  523:invokevirtual   #429 <Method Object TokenBuffer$Segment.get(int)>
	//  225  526:astore          7
				if(obj instanceof Integer)
	//* 226  528:aload           7
	//* 227  530:instanceof      #480 <Class Integer>
	//* 228  533:ifeq            558
				{
					jsongenerator.writeNumber(((Integer)obj).intValue());
	//  229  536:aload_1         
	//  230  537:aload           7
	//  231  539:checkcast       #480 <Class Integer>
	//  232  542:invokevirtual   #483 <Method int Integer.intValue()>
	//  233  545:invokevirtual   #484 <Method void JsonGenerator.writeNumber(int)>
					obj = ((Object) (segment));
	//  234  548:aload           6
	//  235  550:astore          7
					j = i;
	//  236  552:iload_2         
	//  237  553:istore          4
				} else
	//* 238  555:goto            37
				if(obj instanceof BigInteger)
	//* 239  558:aload           7
	//* 240  560:instanceof      #486 <Class BigInteger>
	//* 241  563:ifeq            585
				{
					jsongenerator.writeNumber((BigInteger)obj);
	//  242  566:aload_1         
	//  243  567:aload           7
	//  244  569:checkcast       #486 <Class BigInteger>
	//  245  572:invokevirtual   #487 <Method void JsonGenerator.writeNumber(BigInteger)>
					obj = ((Object) (segment));
	//  246  575:aload           6
	//  247  577:astore          7
					j = i;
	//  248  579:iload_2         
	//  249  580:istore          4
				} else
	//* 250  582:goto            37
				if(obj instanceof Long)
	//* 251  585:aload           7
	//* 252  587:instanceof      #489 <Class Long>
	//* 253  590:ifeq            615
				{
					jsongenerator.writeNumber(((Long)obj).longValue());
	//  254  593:aload_1         
	//  255  594:aload           7
	//  256  596:checkcast       #489 <Class Long>
	//  257  599:invokevirtual   #492 <Method long Long.longValue()>
	//  258  602:invokevirtual   #493 <Method void JsonGenerator.writeNumber(long)>
					obj = ((Object) (segment));
	//  259  605:aload           6
	//  260  607:astore          7
					j = i;
	//  261  609:iload_2         
	//  262  610:istore          4
				} else
	//* 263  612:goto            37
				if(obj instanceof Short)
	//* 264  615:aload           7
	//* 265  617:instanceof      #495 <Class Short>
	//* 266  620:ifeq            645
				{
					jsongenerator.writeNumber(((Short)obj).shortValue());
	//  267  623:aload_1         
	//  268  624:aload           7
	//  269  626:checkcast       #495 <Class Short>
	//  270  629:invokevirtual   #499 <Method short Short.shortValue()>
	//  271  632:invokevirtual   #502 <Method void JsonGenerator.writeNumber(short)>
					obj = ((Object) (segment));
	//  272  635:aload           6
	//  273  637:astore          7
					j = i;
	//  274  639:iload_2         
	//  275  640:istore          4
				} else
	//* 276  642:goto            37
				{
					jsongenerator.writeNumber(((Number)obj).intValue());
	//  277  645:aload_1         
	//  278  646:aload           7
	//  279  648:checkcast       #504 <Class Number>
	//  280  651:invokevirtual   #505 <Method int Number.intValue()>
	//  281  654:invokevirtual   #484 <Method void JsonGenerator.writeNumber(int)>
					obj = ((Object) (segment));
	//  282  657:aload           6
	//  283  659:astore          7
					j = i;
	//  284  661:iload_2         
	//  285  662:istore          4
				}
				break;

	//* 286  664:goto            37
			case 6: // '\006'
				obj = segment.get(i);
	//  287  667:aload           6
	//  288  669:iload_2         
	//  289  670:invokevirtual   #429 <Method Object TokenBuffer$Segment.get(int)>
	//  290  673:astore          7
				if(obj instanceof SerializableString)
	//* 291  675:aload           7
	//* 292  677:instanceof      #507 <Class SerializableString>
	//* 293  680:ifeq            702
				{
					jsongenerator.writeString((SerializableString)obj);
	//  294  683:aload_1         
	//  295  684:aload           7
	//  296  686:checkcast       #507 <Class SerializableString>
	//  297  689:invokevirtual   #510 <Method void JsonGenerator.writeString(SerializableString)>
					obj = ((Object) (segment));
	//  298  692:aload           6
	//  299  694:astore          7
					j = i;
	//  300  696:iload_2         
	//  301  697:istore          4
				} else
	//* 302  699:goto            37
				{
					jsongenerator.writeString((String)obj);
	//  303  702:aload_1         
	//  304  703:aload           7
	//  305  705:checkcast       #130 <Class String>
	//  306  708:invokevirtual   #511 <Method void JsonGenerator.writeString(String)>
					obj = ((Object) (segment));
	//  307  711:aload           6
	//  308  713:astore          7
					j = i;
	//  309  715:iload_2         
	//  310  716:istore          4
				}
				break;

	//* 311  718:goto            37
			case 5: // '\005'
				obj = segment.get(i);
	//  312  721:aload           6
	//  313  723:iload_2         
	//  314  724:invokevirtual   #429 <Method Object TokenBuffer$Segment.get(int)>
	//  315  727:astore          7
				if(obj instanceof SerializableString)
	//* 316  729:aload           7
	//* 317  731:instanceof      #507 <Class SerializableString>
	//* 318  734:ifeq            756
				{
					jsongenerator.writeFieldName((SerializableString)obj);
	//  319  737:aload_1         
	//  320  738:aload           7
	//  321  740:checkcast       #507 <Class SerializableString>
	//  322  743:invokevirtual   #513 <Method void JsonGenerator.writeFieldName(SerializableString)>
					obj = ((Object) (segment));
	//  323  746:aload           6
	//  324  748:astore          7
					j = i;
	//  325  750:iload_2         
	//  326  751:istore          4
				} else
	//* 327  753:goto            37
				{
					jsongenerator.writeFieldName((String)obj);
	//  328  756:aload_1         
	//  329  757:aload           7
	//  330  759:checkcast       #130 <Class String>
	//  331  762:invokevirtual   #514 <Method void JsonGenerator.writeFieldName(String)>
					obj = ((Object) (segment));
	//  332  765:aload           6
	//  333  767:astore          7
					j = i;
	//  334  769:iload_2         
	//  335  770:istore          4
				}
				break;

	//* 336  772:goto            37
			case 4: // '\004'
				jsongenerator.writeEndArray();
	//  337  775:aload_1         
	//  338  776:invokevirtual   #515 <Method void JsonGenerator.writeEndArray()>
				obj = ((Object) (segment));
	//  339  779:aload           6
	//  340  781:astore          7
				j = i;
	//  341  783:iload_2         
	//  342  784:istore          4
				break;

	//* 343  786:goto            37
			case 3: // '\003'
				jsongenerator.writeStartArray();
	//  344  789:aload_1         
	//  345  790:invokevirtual   #516 <Method void JsonGenerator.writeStartArray()>
				obj = ((Object) (segment));
	//  346  793:aload           6
	//  347  795:astore          7
				j = i;
	//  348  797:iload_2         
	//  349  798:istore          4
				break;

	//* 350  800:goto            37
			case 2: // '\002'
				jsongenerator.writeEndObject();
	//  351  803:aload_1         
	//  352  804:invokevirtual   #517 <Method void JsonGenerator.writeEndObject()>
				obj = ((Object) (segment));
	//  353  807:aload           6
	//  354  809:astore          7
				j = i;
	//  355  811:iload_2         
	//  356  812:istore          4
				break;

	//* 357  814:goto            37
			case 1: // '\001'
				jsongenerator.writeStartObject();
	//  358  817:aload_1         
	//  359  818:invokevirtual   #518 <Method void JsonGenerator.writeStartObject()>
				obj = ((Object) (segment));
	//  360  821:aload           6
	//  361  823:astore          7
				j = i;
	//  362  825:iload_2         
	//  363  826:istore          4
				break;
			}
		} while(true);
	//* 364  828:goto            37
	}

	public JsonGenerator setFeatureMask(int i)
	{
		_generatorFeatures = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field int _generatorFeatures>
		return ((JsonGenerator) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public String toString()
	{
		boolean flag;
		int i;
		StringBuilder stringbuilder;
		JsonParser jsonparser;
		stringbuilder = new StringBuilder();
	//    0    0:new             #124 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #374 <Method void StringBuilder()>
	//    3    7:astore          4
		stringbuilder.append("[TokenBuffer: ");
	//    4    9:aload           4
	//    5   11:ldc2            #524 <String "[TokenBuffer: ">
	//    6   14:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:pop             
		jsonparser = asParser();
	//    8   18:aload_0         
	//    9   19:invokevirtual   #202 <Method JsonParser asParser()>
	//   10   22:astore          5
		boolean flag1 = _hasNativeTypeIds;
	//   11   24:aload_0         
	//   12   25:getfield        #92  <Field boolean _hasNativeTypeIds>
	//   13   28:istore_3        
		i = 0;
	//   14   29:iconst_0        
	//   15   30:istore_2        
		if(!flag1 && !_hasNativeObjectIds)
	//*  16   31:iload_3         
	//*  17   32:ifne            50
	//*  18   35:aload_0         
	//*  19   36:getfield        #97  <Field boolean _hasNativeObjectIds>
	//*  20   39:ifeq            45
	//*  21   42:goto            50
			flag = false;
	//   22   45:iconst_0        
	//   23   46:istore_1        
		else
	//*  24   47:goto            52
			flag = true;
	//   25   50:iconst_1        
	//   26   51:istore_1        
_L1:
		JsonToken jsontoken;
		try
		{
			jsontoken = jsonparser.nextToken();
	//   27   52:aload           5
	//   28   54:invokevirtual   #206 <Method JsonToken JsonParser.nextToken()>
	//   29   57:astore          6
		}
	//*  30   59:aload           6
	//*  31   61:ifnonnull       112
	//*  32   64:iload_2         
	//*  33   65:bipush          100
	//*  34   67:icmplt          98
	//*  35   70:aload           4
	//*  36   72:ldc2            #526 <String " ... (truncated ">
	//*  37   75:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  38   78:pop             
	//*  39   79:aload           4
	//*  40   81:iload_2         
	//*  41   82:bipush          100
	//*  42   84:isub            
	//*  43   85:invokevirtual   #529 <Method StringBuilder StringBuilder.append(int)>
	//*  44   88:pop             
	//*  45   89:aload           4
	//*  46   91:ldc2            #531 <String " entries)">
	//*  47   94:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  48   97:pop             
	//*  49   98:aload           4
	//*  50  100:bipush          93
	//*  51  102:invokevirtual   #137 <Method StringBuilder StringBuilder.append(char)>
	//*  52  105:pop             
	//*  53  106:aload           4
	//*  54  108:invokevirtual   #382 <Method String StringBuilder.toString()>
	//*  55  111:areturn         
	//*  56  112:iload_1         
	//*  57  113:ifeq            122
	//*  58  116:aload_0         
	//*  59  117:aload           4
	//*  60  119:invokespecial   #533 <Method void _appendNativeIds(StringBuilder)>
	//*  61  122:iload_2         
	//*  62  123:bipush          100
	//*  63  125:icmpge          187
	//*  64  128:iload_2         
	//*  65  129:ifle            141
	//*  66  132:aload           4
	//*  67  134:ldc2            #535 <String ", ">
	//*  68  137:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  69  140:pop             
	//*  70  141:aload           4
	//*  71  143:aload           6
	//*  72  145:invokevirtual   #536 <Method String JsonToken.toString()>
	//*  73  148:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  74  151:pop             
	//*  75  152:aload           6
	//*  76  154:getstatic       #357 <Field JsonToken JsonToken.FIELD_NAME>
	//*  77  157:if_acmpne       187
	//*  78  160:aload           4
	//*  79  162:bipush          40
	//*  80  164:invokevirtual   #137 <Method StringBuilder StringBuilder.append(char)>
	//*  81  167:pop             
	//*  82  168:aload           4
	//*  83  170:aload           5
	//*  84  172:invokevirtual   #338 <Method String JsonParser.getCurrentName()>
	//*  85  175:invokevirtual   #128 <Method StringBuilder StringBuilder.append(String)>
	//*  86  178:pop             
	//*  87  179:aload           4
	//*  88  181:bipush          41
	//*  89  183:invokevirtual   #137 <Method StringBuilder StringBuilder.append(char)>
	//*  90  186:pop             
	//*  91  187:iload_2         
	//*  92  188:iconst_1        
	//*  93  189:iadd            
	//*  94  190:istore_2        
	//*  95  191:goto            52
		catch(IOException ioexception)
	//*  96  194:astore          4
		{
			throw new IllegalStateException(((Throwable) (ioexception)));
	//   97  196:new             #538 <Class IllegalStateException>
	//   98  199:dup             
	//   99  200:aload           4
	//  100  202:invokespecial   #541 <Method void IllegalStateException(Throwable)>
	//  101  205:athrow          
		}
		if(jsontoken == null)
		{
			if(i >= 100)
			{
				stringbuilder.append(" ... (truncated ");
				stringbuilder.append(i - 100);
				stringbuilder.append(" entries)");
			}
			stringbuilder.append(']');
			return stringbuilder.toString();
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_122;
		_appendNativeIds(stringbuilder);
		if(i >= 100)
			break MISSING_BLOCK_LABEL_187;
		if(i <= 0)
			break MISSING_BLOCK_LABEL_141;
		stringbuilder.append(", ");
		stringbuilder.append(jsontoken.toString());
		if(jsontoken == JsonToken.FIELD_NAME)
		{
			stringbuilder.append('(');
			stringbuilder.append(jsonparser.getCurrentName());
			stringbuilder.append(')');
		}
		i++;
		  goto _L1
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #549 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #186 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #552 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
		throws IOException
	{
		base64variant = ((Base64Variant) (new byte[j]));
	//    0    0:iload           4
	//    1    2:newarray        byte[]
	//    2    4:astore_1        
		System.arraycopy(((Object) (abyte0)), i, ((Object) (base64variant)), 0, j);
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iload           4
	//    8   11:invokestatic    #559 <Method void System.arraycopy(Object, int, Object, int, int)>
		writeObject(((Object) (base64variant)));
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:invokevirtual   #253 <Method void writeObject(Object)>
	//   12   19:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		JsonToken jsontoken;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            11
			jsontoken = JsonToken.VALUE_TRUE;
	//    2    4:getstatic       #562 <Field JsonToken JsonToken.VALUE_TRUE>
	//    3    7:astore_2        
		else
	//*   4    8:goto            15
			jsontoken = JsonToken.VALUE_FALSE;
	//    5   11:getstatic       #565 <Field JsonToken JsonToken.VALUE_FALSE>
	//    6   14:astore_2        
		_appendValue(jsontoken);
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokevirtual   #567 <Method void _appendValue(JsonToken)>
	//   10   20:return          
	}

	public void writeEmbeddedObject(Object obj)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
	//    0    0:aload_0         
	//    1    1:getstatic       #570 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
	//    4    8:return          
	}

	public final void writeEndArray()
		throws IOException
	{
		_append(JsonToken.END_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #362 <Field JsonToken JsonToken.END_ARRAY>
	//    2    4:invokevirtual   #574 <Method void _append(JsonToken)>
		JsonWriteContext jsonwritecontext = _writeContext.getParent();
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field JsonWriteContext _writeContext>
	//    5   11:invokevirtual   #577 <Method JsonWriteContext JsonWriteContext.getParent()>
	//    6   14:astore_1        
		if(jsonwritecontext != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			_writeContext = jsonwritecontext;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #79  <Field JsonWriteContext _writeContext>
	//   12   24:return          
	}

	public final void writeEndObject()
		throws IOException
	{
		_append(JsonToken.END_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #365 <Field JsonToken JsonToken.END_OBJECT>
	//    2    4:invokevirtual   #574 <Method void _append(JsonToken)>
		JsonWriteContext jsonwritecontext = _writeContext.getParent();
	//    3    7:aload_0         
	//    4    8:getfield        #79  <Field JsonWriteContext _writeContext>
	//    5   11:invokevirtual   #577 <Method JsonWriteContext JsonWriteContext.getParent()>
	//    6   14:astore_1        
		if(jsonwritecontext != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			_writeContext = jsonwritecontext;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #79  <Field JsonWriteContext _writeContext>
	//   12   24:return          
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		_writeContext.writeFieldName(serializablestring.getValue());
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokeinterface #580 <Method String SerializableString.getValue()>
	//    4   10:invokevirtual   #583 <Method int JsonWriteContext.writeFieldName(String)>
	//    5   13:pop             
		_append(JsonToken.FIELD_NAME, ((Object) (serializablestring)));
	//    6   14:aload_0         
	//    7   15:getstatic       #357 <Field JsonToken JsonToken.FIELD_NAME>
	//    8   18:aload_1         
	//    9   19:invokevirtual   #585 <Method void _append(JsonToken, Object)>
	//   10   22:return          
	}

	public final void writeFieldName(String s)
		throws IOException
	{
		_writeContext.writeFieldName(s);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonWriteContext _writeContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #583 <Method int JsonWriteContext.writeFieldName(String)>
	//    4    8:pop             
		_append(JsonToken.FIELD_NAME, ((Object) (s)));
	//    5    9:aload_0         
	//    6   10:getstatic       #357 <Field JsonToken JsonToken.FIELD_NAME>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #585 <Method void _append(JsonToken, Object)>
	//    9   17:return          
	}

	public void writeNull()
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NULL);
	//    0    0:aload_0         
	//    1    1:getstatic       #588 <Field JsonToken JsonToken.VALUE_NULL>
	//    2    4:invokevirtual   #567 <Method void _appendValue(JsonToken)>
	//    3    7:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_FLOAT, ((Object) (Double.valueOf(d))));
	//    0    0:aload_0         
	//    1    1:getstatic       #591 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    2    4:dload_1         
	//    3    5:invokestatic    #594 <Method Double Double.valueOf(double)>
	//    4    8:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
	}

	public void writeNumber(float f)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_FLOAT, ((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getstatic       #591 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    2    4:fload_1         
	//    3    5:invokestatic    #597 <Method Float Float.valueOf(float)>
	//    4    8:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
	}

	public void writeNumber(int i)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_INT, ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #600 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    2    4:iload_1         
	//    3    5:invokestatic    #603 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
	}

	public void writeNumber(long l)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_INT, ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getstatic       #600 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    2    4:lload_1         
	//    3    5:invokestatic    #606 <Method Long Long.valueOf(long)>
	//    4    8:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
	}

	public void writeNumber(String s)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_FLOAT, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getstatic       #591 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
	//    4    8:return          
	}

	public void writeNumber(BigDecimal bigdecimal)
		throws IOException
	{
		if(bigdecimal == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			writeNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #256 <Method void writeNull()>
			return;
	//    4    8:return          
		} else
		{
			_appendValue(JsonToken.VALUE_NUMBER_FLOAT, ((Object) (bigdecimal)));
	//    5    9:aload_0         
	//    6   10:getstatic       #591 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
			return;
	//    9   17:return          
		}
	}

	public void writeNumber(BigInteger biginteger)
		throws IOException
	{
		if(biginteger == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			writeNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #256 <Method void writeNull()>
			return;
	//    4    8:return          
		} else
		{
			_appendValue(JsonToken.VALUE_NUMBER_INT, ((Object) (biginteger)));
	//    5    9:aload_0         
	//    6   10:getstatic       #600 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
			return;
	//    9   17:return          
		}
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_INT, ((Object) (Short.valueOf(word0))));
	//    0    0:aload_0         
	//    1    1:getstatic       #600 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    2    4:iload_1         
	//    3    5:invokestatic    #609 <Method Short Short.valueOf(short)>
	//    4    8:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
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
	//    3    5:invokevirtual   #256 <Method void writeNull()>
			return;
	//    4    8:return          
		}
		if(obj.getClass() != [B && !(obj instanceof RawValue))
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #466 <Method Class Object.getClass()>
	//*   7   13:ldc2            #611 <Class byte[]>
	//*   8   16:if_acmpeq       54
	//*   9   19:aload_1         
	//*  10   20:instanceof      #431 <Class RawValue>
	//*  11   23:ifeq            29
	//*  12   26:goto            54
		{
			ObjectCodec objectcodec = _objectCodec;
	//   13   29:aload_0         
	//   14   30:getfield        #63  <Field ObjectCodec _objectCodec>
	//   15   33:astore_2        
			if(objectcodec == null)
	//*  16   34:aload_2         
	//*  17   35:ifnonnull       47
			{
				_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
	//   18   38:aload_0         
	//   19   39:getstatic       #570 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//   20   42:aload_1         
	//   21   43:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
				return;
	//   22   46:return          
			} else
			{
				objectcodec.writeValue(((JsonGenerator) (this)), obj);
	//   23   47:aload_2         
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #616 <Method void ObjectCodec.writeValue(JsonGenerator, Object)>
				return;
	//   27   53:return          
			}
		} else
		{
			_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
	//   28   54:aload_0         
	//   29   55:getstatic       #570 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//   30   58:aload_1         
	//   31   59:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
			return;
	//   32   62:return          
		}
	}

	public void writeObjectId(Object obj)
	{
		_objectId = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #156 <Field Object _objectId>
		_hasNativeId = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #55  <Field boolean _hasNativeId>
	//    6   10:return          
	}

	public void writeRaw(char c)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #620 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRaw(SerializableString serializablestring)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #620 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #620 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRaw(char ac[], int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #620 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRawValue(String s)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, ((Object) (new RawValue(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #570 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    2    4:new             #431 <Class RawValue>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #622 <Method void RawValue(String)>
	//    6   12:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
	//    7   15:return          
	}

	public final void writeStartArray()
		throws IOException
	{
		_writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #183 <Method int JsonWriteContext.writeValue()>
	//    3    7:pop             
		_append(JsonToken.START_ARRAY);
	//    4    8:aload_0         
	//    5    9:getstatic       #625 <Field JsonToken JsonToken.START_ARRAY>
	//    6   12:invokevirtual   #574 <Method void _append(JsonToken)>
		_writeContext = _writeContext.createChildArrayContext();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field JsonWriteContext _writeContext>
	//   10   20:invokevirtual   #628 <Method JsonWriteContext JsonWriteContext.createChildArrayContext()>
	//   11   23:putfield        #79  <Field JsonWriteContext _writeContext>
	//   12   26:return          
	}

	public final void writeStartObject()
		throws IOException
	{
		_writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #183 <Method int JsonWriteContext.writeValue()>
	//    3    7:pop             
		_append(JsonToken.START_OBJECT);
	//    4    8:aload_0         
	//    5    9:getstatic       #631 <Field JsonToken JsonToken.START_OBJECT>
	//    6   12:invokevirtual   #574 <Method void _append(JsonToken)>
		_writeContext = _writeContext.createChildObjectContext();
	//    7   15:aload_0         
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field JsonWriteContext _writeContext>
	//   10   20:invokevirtual   #634 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//   11   23:putfield        #79  <Field JsonWriteContext _writeContext>
	//   12   26:return          
	}

	public void writeStartObject(Object obj)
		throws IOException
	{
		_writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #183 <Method int JsonWriteContext.writeValue()>
	//    3    7:pop             
		_append(JsonToken.START_OBJECT);
	//    4    8:aload_0         
	//    5    9:getstatic       #631 <Field JsonToken JsonToken.START_OBJECT>
	//    6   12:invokevirtual   #574 <Method void _append(JsonToken)>
		JsonWriteContext jsonwritecontext = _writeContext.createChildObjectContext();
	//    7   15:aload_0         
	//    8   16:getfield        #79  <Field JsonWriteContext _writeContext>
	//    9   19:invokevirtual   #634 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//   10   22:astore_2        
		_writeContext = jsonwritecontext;
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:putfield        #79  <Field JsonWriteContext _writeContext>
		if(obj != null)
	//*  14   28:aload_1         
	//*  15   29:ifnull          37
			jsonwritecontext.setCurrentValue(obj);
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #637 <Method void JsonWriteContext.setCurrentValue(Object)>
	//   19   37:return          
	}

	public void writeString(SerializableString serializablestring)
		throws IOException
	{
		if(serializablestring == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			writeNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #256 <Method void writeNull()>
			return;
	//    4    8:return          
		} else
		{
			_appendValue(JsonToken.VALUE_STRING, ((Object) (serializablestring)));
	//    5    9:aload_0         
	//    6   10:getstatic       #640 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
			return;
	//    9   17:return          
		}
	}

	public void writeString(String s)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
		{
			writeNull();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #256 <Method void writeNull()>
			return;
	//    4    8:return          
		} else
		{
			_appendValue(JsonToken.VALUE_STRING, ((Object) (s)));
	//    5    9:aload_0         
	//    6   10:getstatic       #640 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #572 <Method void _appendValue(JsonToken, Object)>
			return;
	//    9   17:return          
		}
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		writeString(new String(ac, i, j));
	//    0    0:aload_0         
	//    1    1:new             #130 <Class String>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #642 <Method void String(char[], int, int)>
	//    7   11:invokevirtual   #335 <Method void writeString(String)>
	//    8   14:return          
	}

	public void writeTypeId(Object obj)
	{
		_typeId = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #151 <Field Object _typeId>
		_hasNativeId = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #55  <Field boolean _hasNativeId>
	//    6   10:return          
	}

	protected static final int DEFAULT_GENERATOR_FEATURES = com.fasterxml.jackson.core.JsonGenerator.Feature.collectDefaults();
	protected int _appendAt;
	protected boolean _closed;
	protected Segment _first;
	protected boolean _forceBigDecimal;
	protected int _generatorFeatures;
	protected boolean _hasNativeId;
	protected boolean _hasNativeObjectIds;
	protected boolean _hasNativeTypeIds;
	protected Segment _last;
	protected boolean _mayHaveNativeIds;
	protected ObjectCodec _objectCodec;
	protected Object _objectId;
	protected JsonStreamContext _parentContext;
	protected Object _typeId;
	protected JsonWriteContext _writeContext;

	static 
	{
	//    0    0:invokestatic    #43  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.collectDefaults()>
	//    1    3:putstatic       #45  <Field int DEFAULT_GENERATOR_FEATURES>
	//*   2    6:return          
	}
}
