// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.cfg.PackageVersion;
import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.TreeMap;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//			RawValue

public class TokenBuffer extends JsonGenerator
{
	protected static final class Parser extends ParserMinimalBase
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
			if(getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL)
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
				//*  94  213:astore_0        
				//*  95  214:return          
				//*  96  215:astore_0        
				//*  97  216:goto            200
				//*  98  219:astore_0        
				//*  99  220:goto            188
				//* 100  223:astore_0        
				//* 101  224:goto            176
				//* 102  227:astore_0        
				//* 103  228:goto            164
				//* 104  231:astore_0        
				//* 105  232:goto            152
				//* 106  235:astore_0        
				//* 107  236:goto            140
				//* 108  239:astore_0        
				//* 109  240:goto            128
				//* 110  243:astore_0        
				//* 111  244:goto            117
				//* 112  247:astore_0        
				//* 113  248:goto            106
				//* 114  251:astore_0        
				//* 115  252:goto            95
				//* 116  255:astore_0        
				//* 117  256:goto            84
				//* 118  259:astore_0        
				//* 119  260:goto            64
				//* 120  263:astore_0        
				//* 121  264:goto            53
				//* 122  267:astore_0        
				//* 123  268:goto            42
				//* 124  271:astore_0        
				//* 125  272:goto            31
					catch(NoSuchFieldError nosuchfielderror16) { }
				//  126  275:astore_0        
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror15) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror14) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT.ordinal()] = 4;
					}
					catch(NoSuchFieldError nosuchfielderror13) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 5;
					}
					catch(NoSuchFieldError nosuchfielderror12) { }
					$SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
					}
					catch(NoSuchFieldError nosuchfielderror11) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 2;
					}
					catch(NoSuchFieldError nosuchfielderror10) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 3;
					}
					catch(NoSuchFieldError nosuchfielderror9) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
					}
					catch(NoSuchFieldError nosuchfielderror8) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
					}
					catch(NoSuchFieldError nosuchfielderror7) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 6;
					}
					catch(NoSuchFieldError nosuchfielderror6) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
					}
					catch(NoSuchFieldError nosuchfielderror5) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
					}
					catch(NoSuchFieldError nosuchfielderror4) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
					}
					catch(NoSuchFieldError nosuchfielderror3) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
					}
					catch(NoSuchFieldError nosuchfielderror2) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
					}
					catch(NoSuchFieldError nosuchfielderror1) { }
					try
					{
						$SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 12;
					}
					catch(NoSuchFieldError nosuchfielderror)
					{
						return;
					}
				//* 127  276:goto            20
				}
			}

			switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[getNumberType().ordinal()])
		//*   9   17:getstatic       #205 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
		//*  10   20:aload_0         
		//*  11   21:invokevirtual   #121 <Method com.fasterxml.jackson.core.JsonParser$NumberType getNumberType()>
		//*  12   24:invokevirtual   #209 <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
		//*  13   27:iaload          
			{
		//*  14   28:tableswitch     1 5: default 64
		//		               1 72
		//		               2 80
		//		               3 64
		//		               4 64
		//		               5 72
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

		public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
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
				return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
		//    6   12:getstatic       #242 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
		//    7   15:areturn         
			if(number instanceof Long)
		//*   8   16:aload_1         
		//*   9   17:instanceof      #244 <Class Long>
		//*  10   20:ifeq            27
				return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
		//   11   23:getstatic       #247 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
		//   12   26:areturn         
			if(number instanceof Double)
		//*  13   27:aload_1         
		//*  14   28:instanceof      #249 <Class Double>
		//*  15   31:ifeq            38
				return com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE;
		//   16   34:getstatic       #252 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
		//   17   37:areturn         
			if(number instanceof BigDecimal)
		//*  18   38:aload_1         
		//*  19   39:instanceof      #129 <Class BigDecimal>
		//*  20   42:ifeq            49
				return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL;
		//   21   45:getstatic       #127 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
		//   22   48:areturn         
			if(number instanceof BigInteger)
		//*  23   49:aload_1         
		//*  24   50:instanceof      #117 <Class BigInteger>
		//*  25   53:ifeq            60
				return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
		//   26   56:getstatic       #255 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
		//   27   59:areturn         
			if(number instanceof Float)
		//*  28   60:aload_1         
		//*  29   61:instanceof      #257 <Class Float>
		//*  30   64:ifeq            71
				return com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT;
		//   31   67:getstatic       #260 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.FLOAT>
		//   32   70:areturn         
			if(number instanceof Short)
		//*  33   71:aload_1         
		//*  34   72:instanceof      #262 <Class Short>
		//*  35   75:ifeq            82
				return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
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
				switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[_currToken.ordinal()])
		//*  33   61:getstatic       #315 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
		//*  34   64:aload_0         
		//*  35   65:getfield        #60  <Field JsonToken _currToken>
		//*  36   68:invokevirtual   #316 <Method int JsonToken.ordinal()>
		//*  37   71:iaload          
				{
		//*  38   72:tableswitch     7 8: default 96
		//		               7 104
		//		               8 104
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
				Segment segment1 = _segment;
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
				Segment segment = segment1;
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
					if(segment1 == null)
		//*  22   35:aload           4
		//*  23   37:ifnonnull       52
						segment = null;
		//   24   40:aconst_null     
		//   25   41:astore_3        
					else
		//*  26   42:aload_3         
		//*  27   43:ifnull          7
		//*  28   46:aload_3         
		//*  29   47:iload_1         
		//*  30   48:invokevirtual   #343 <Method JsonToken TokenBuffer$Segment.type(int)>
		//*  31   51:areturn         
						segment = segment1.next();
		//   32   52:aload           4
		//   33   54:invokevirtual   #355 <Method TokenBuffer$Segment TokenBuffer$Segment.next()>
		//   34   57:astore_3        
				}
				if(segment != null)
					return segment.type(i);
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
		protected Segment _segment;
		protected int _segmentPtr;

		public Parser(Segment segment, ObjectCodec objectcodec, boolean flag, boolean flag1)
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
		//*   1    1:getfield        #56  <Field TreeMap _nativeIds>
		//*   2    4:ifnonnull       18
				_nativeIds = new TreeMap();
		//    3    7:aload_0         
		//    4    8:new             #58  <Class TreeMap>
		//    5   11:dup             
		//    6   12:invokespecial   #59  <Method void TreeMap()>
		//    7   15:putfield        #56  <Field TreeMap _nativeIds>
			if(obj != null)
		//*   8   18:aload_2         
		//*   9   19:ifnull          39
				_nativeIds.put(((Object) (Integer.valueOf(_objectIdIndex(i)))), obj);
		//   10   22:aload_0         
		//   11   23:getfield        #56  <Field TreeMap _nativeIds>
		//   12   26:aload_0         
		//   13   27:iload_1         
		//   14   28:invokespecial   #61  <Method int _objectIdIndex(int)>
		//   15   31:invokestatic    #67  <Method Integer Integer.valueOf(int)>
		//   16   34:aload_2         
		//   17   35:invokevirtual   #71  <Method Object TreeMap.put(Object, Object)>
		//   18   38:pop             
			if(obj1 != null)
		//*  19   39:aload_3         
		//*  20   40:ifnull          60
				_nativeIds.put(((Object) (Integer.valueOf(_typeIdIndex(i)))), obj1);
		//   21   43:aload_0         
		//   22   44:getfield        #56  <Field TreeMap _nativeIds>
		//   23   47:aload_0         
		//   24   48:iload_1         
		//   25   49:invokespecial   #73  <Method int _typeIdIndex(int)>
		//   26   52:invokestatic    #67  <Method Integer Integer.valueOf(int)>
		//   27   55:aload_3         
		//   28   56:invokevirtual   #71  <Method Object TreeMap.put(Object, Object)>
		//   29   59:pop             
		//   30   60:return          
		}

		private void set(int i, int j, Object obj)
		{
			_tokens[i] = obj;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Object[] _tokens>
		//    2    4:iload_1         
		//    3    5:aload_3         
		//    4    6:aastore         
			long l1 = j;
		//    5    7:iload_2         
		//    6    8:i2l             
		//    7    9:lstore          6
			long l = l1;
		//    8   11:lload           6
		//    9   13:lstore          4
			if(i > 0)
		//*  10   15:iload_1         
		//*  11   16:ifle            27
				l = l1 << (i << 2);
		//   12   19:lload           6
		//   13   21:iload_1         
		//   14   22:iconst_2        
		//   15   23:ishl            
		//   16   24:lshl            
		//   17   25:lstore          4
			_tokenTypes = _tokenTypes | l;
		//   18   27:aload_0         
		//   19   28:aload_0         
		//   20   29:getfield        #77  <Field long _tokenTypes>
		//   21   32:lload           4
		//   22   34:lor             
		//   23   35:putfield        #77  <Field long _tokenTypes>
		//   24   38:return          
		}

		private void set(int i, int j, Object obj, Object obj1, Object obj2)
		{
			_tokens[i] = obj;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Object[] _tokens>
		//    2    4:iload_1         
		//    3    5:aload_3         
		//    4    6:aastore         
			long l1 = j;
		//    5    7:iload_2         
		//    6    8:i2l             
		//    7    9:lstore          8
			long l = l1;
		//    8   11:lload           8
		//    9   13:lstore          6
			if(i > 0)
		//*  10   15:iload_1         
		//*  11   16:ifle            27
				l = l1 << (i << 2);
		//   12   19:lload           8
		//   13   21:iload_1         
		//   14   22:iconst_2        
		//   15   23:ishl            
		//   16   24:lshl            
		//   17   25:lstore          6
			_tokenTypes = _tokenTypes | l;
		//   18   27:aload_0         
		//   19   28:aload_0         
		//   20   29:getfield        #77  <Field long _tokenTypes>
		//   21   32:lload           6
		//   22   34:lor             
		//   23   35:putfield        #77  <Field long _tokenTypes>
			assignNativeIds(i, obj1, obj2);
		//   24   38:aload_0         
		//   25   39:iload_1         
		//   26   40:aload           4
		//   27   42:aload           5
		//   28   44:invokespecial   #80  <Method void assignNativeIds(int, Object, Object)>
		//   29   47:return          
		}

		private void set(int i, JsonToken jsontoken)
		{
			long l1 = jsontoken.ordinal();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #85  <Method int JsonToken.ordinal()>
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
		//   16   23:getfield        #77  <Field long _tokenTypes>
		//   17   26:lload_3         
		//   18   27:lor             
		//   19   28:putfield        #77  <Field long _tokenTypes>
		//   20   31:return          
		}

		private void set(int i, JsonToken jsontoken, Object obj)
		{
			_tokens[i] = obj;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Object[] _tokens>
		//    2    4:iload_1         
		//    3    5:aload_3         
		//    4    6:aastore         
			long l1 = jsontoken.ordinal();
		//    5    7:aload_2         
		//    6    8:invokevirtual   #85  <Method int JsonToken.ordinal()>
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
		//   21   32:getfield        #77  <Field long _tokenTypes>
		//   22   35:lload           4
		//   23   37:lor             
		//   24   38:putfield        #77  <Field long _tokenTypes>
		//   25   41:return          
		}

		private void set(int i, JsonToken jsontoken, Object obj, Object obj1)
		{
			long l1 = jsontoken.ordinal();
		//    0    0:aload_2         
		//    1    1:invokevirtual   #85  <Method int JsonToken.ordinal()>
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
			_tokenTypes = _tokenTypes | l;
		//   14   23:aload_0         
		//   15   24:aload_0         
		//   16   25:getfield        #77  <Field long _tokenTypes>
		//   17   28:lload           5
		//   18   30:lor             
		//   19   31:putfield        #77  <Field long _tokenTypes>
			assignNativeIds(i, obj, obj1);
		//   20   34:aload_0         
		//   21   35:iload_1         
		//   22   36:aload_3         
		//   23   37:aload           4
		//   24   39:invokespecial   #80  <Method void assignNativeIds(int, Object, Object)>
		//   25   42:return          
		}

		private void set(int i, JsonToken jsontoken, Object obj, Object obj1, Object obj2)
		{
			_tokens[i] = obj;
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Object[] _tokens>
		//    2    4:iload_1         
		//    3    5:aload_3         
		//    4    6:aastore         
			long l1 = jsontoken.ordinal();
		//    5    7:aload_2         
		//    6    8:invokevirtual   #85  <Method int JsonToken.ordinal()>
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
			_tokenTypes = _tokenTypes | l;
		//   19   30:aload_0         
		//   20   31:aload_0         
		//   21   32:getfield        #77  <Field long _tokenTypes>
		//   22   35:lload           6
		//   23   37:lor             
		//   24   38:putfield        #77  <Field long _tokenTypes>
			assignNativeIds(i, obj1, obj2);
		//   25   41:aload_0         
		//   26   42:iload_1         
		//   27   43:aload           4
		//   28   45:aload           5
		//   29   47:invokespecial   #80  <Method void assignNativeIds(int, Object, Object)>
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
		//    6    9:invokespecial   #92  <Method void set(int, JsonToken)>
				return null;
		//    7   12:aconst_null     
		//    8   13:areturn         
			} else
			{
				_next = new Segment();
		//    9   14:aload_0         
		//   10   15:new             #2   <Class TokenBuffer$Segment>
		//   11   18:dup             
		//   12   19:invokespecial   #93  <Method void TokenBuffer$Segment()>
		//   13   22:putfield        #95  <Field TokenBuffer$Segment _next>
				_next.set(0, jsontoken);
		//   14   25:aload_0         
		//   15   26:getfield        #95  <Field TokenBuffer$Segment _next>
		//   16   29:iconst_0        
		//   17   30:aload_2         
		//   18   31:invokespecial   #92  <Method void set(int, JsonToken)>
				return _next;
		//   19   34:aload_0         
		//   20   35:getfield        #95  <Field TokenBuffer$Segment _next>
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
		//    7   10:invokespecial   #98  <Method void set(int, JsonToken, Object)>
				return null;
		//    8   13:aconst_null     
		//    9   14:areturn         
			} else
			{
				_next = new Segment();
		//   10   15:aload_0         
		//   11   16:new             #2   <Class TokenBuffer$Segment>
		//   12   19:dup             
		//   13   20:invokespecial   #93  <Method void TokenBuffer$Segment()>
		//   14   23:putfield        #95  <Field TokenBuffer$Segment _next>
				_next.set(0, jsontoken, obj);
		//   15   26:aload_0         
		//   16   27:getfield        #95  <Field TokenBuffer$Segment _next>
		//   17   30:iconst_0        
		//   18   31:aload_2         
		//   19   32:aload_3         
		//   20   33:invokespecial   #98  <Method void set(int, JsonToken, Object)>
				return _next;
		//   21   36:aload_0         
		//   22   37:getfield        #95  <Field TokenBuffer$Segment _next>
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
		//    8   12:invokespecial   #101 <Method void set(int, JsonToken, Object, Object)>
				return null;
		//    9   15:aconst_null     
		//   10   16:areturn         
			} else
			{
				_next = new Segment();
		//   11   17:aload_0         
		//   12   18:new             #2   <Class TokenBuffer$Segment>
		//   13   21:dup             
		//   14   22:invokespecial   #93  <Method void TokenBuffer$Segment()>
		//   15   25:putfield        #95  <Field TokenBuffer$Segment _next>
				_next.set(0, jsontoken, obj, obj1);
		//   16   28:aload_0         
		//   17   29:getfield        #95  <Field TokenBuffer$Segment _next>
		//   18   32:iconst_0        
		//   19   33:aload_2         
		//   20   34:aload_3         
		//   21   35:aload           4
		//   22   37:invokespecial   #101 <Method void set(int, JsonToken, Object, Object)>
				return _next;
		//   23   40:aload_0         
		//   24   41:getfield        #95  <Field TokenBuffer$Segment _next>
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
		//    9   14:invokespecial   #104 <Method void set(int, JsonToken, Object, Object, Object)>
				return null;
		//   10   17:aconst_null     
		//   11   18:areturn         
			} else
			{
				_next = new Segment();
		//   12   19:aload_0         
		//   13   20:new             #2   <Class TokenBuffer$Segment>
		//   14   23:dup             
		//   15   24:invokespecial   #93  <Method void TokenBuffer$Segment()>
		//   16   27:putfield        #95  <Field TokenBuffer$Segment _next>
				_next.set(0, jsontoken, obj, obj1, obj2);
		//   17   30:aload_0         
		//   18   31:getfield        #95  <Field TokenBuffer$Segment _next>
		//   19   34:iconst_0        
		//   20   35:aload_2         
		//   21   36:aload_3         
		//   22   37:aload           4
		//   23   39:aload           5
		//   24   41:invokespecial   #104 <Method void set(int, JsonToken, Object, Object, Object)>
				return _next;
		//   25   44:aload_0         
		//   26   45:getfield        #95  <Field TokenBuffer$Segment _next>
		//   27   48:areturn         
			}
		}

		public Segment appendRaw(int i, int j, Object obj)
		{
			if(i < 16)
		//*   0    0:iload_1         
		//*   1    1:bipush          16
		//*   2    3:icmpge          15
			{
				set(i, j, obj);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iload_2         
		//    6    9:aload_3         
		//    7   10:invokespecial   #108 <Method void set(int, int, Object)>
				return null;
		//    8   13:aconst_null     
		//    9   14:areturn         
			} else
			{
				_next = new Segment();
		//   10   15:aload_0         
		//   11   16:new             #2   <Class TokenBuffer$Segment>
		//   12   19:dup             
		//   13   20:invokespecial   #93  <Method void TokenBuffer$Segment()>
		//   14   23:putfield        #95  <Field TokenBuffer$Segment _next>
				_next.set(0, j, obj);
		//   15   26:aload_0         
		//   16   27:getfield        #95  <Field TokenBuffer$Segment _next>
		//   17   30:iconst_0        
		//   18   31:iload_2         
		//   19   32:aload_3         
		//   20   33:invokespecial   #108 <Method void set(int, int, Object)>
				return _next;
		//   21   36:aload_0         
		//   22   37:getfield        #95  <Field TokenBuffer$Segment _next>
		//   23   40:areturn         
			}
		}

		public Segment appendRaw(int i, int j, Object obj, Object obj1, Object obj2)
		{
			if(i < 16)
		//*   0    0:iload_1         
		//*   1    1:bipush          16
		//*   2    3:icmpge          19
			{
				set(i, j, obj, obj1, obj2);
		//    3    6:aload_0         
		//    4    7:iload_1         
		//    5    8:iload_2         
		//    6    9:aload_3         
		//    7   10:aload           4
		//    8   12:aload           5
		//    9   14:invokespecial   #111 <Method void set(int, int, Object, Object, Object)>
				return null;
		//   10   17:aconst_null     
		//   11   18:areturn         
			} else
			{
				_next = new Segment();
		//   12   19:aload_0         
		//   13   20:new             #2   <Class TokenBuffer$Segment>
		//   14   23:dup             
		//   15   24:invokespecial   #93  <Method void TokenBuffer$Segment()>
		//   16   27:putfield        #95  <Field TokenBuffer$Segment _next>
				_next.set(0, j, obj, obj1, obj2);
		//   17   30:aload_0         
		//   18   31:getfield        #95  <Field TokenBuffer$Segment _next>
		//   19   34:iconst_0        
		//   20   35:iload_2         
		//   21   36:aload_3         
		//   22   37:aload           4
		//   23   39:aload           5
		//   24   41:invokespecial   #111 <Method void set(int, int, Object, Object, Object)>
				return _next;
		//   25   44:aload_0         
		//   26   45:getfield        #95  <Field TokenBuffer$Segment _next>
		//   27   48:areturn         
			}
		}

		public Object findObjectId(int i)
		{
			if(_nativeIds == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #56  <Field TreeMap _nativeIds>
		//*   2    4:ifnonnull       9
				return ((Object) (null));
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return _nativeIds.get(((Object) (Integer.valueOf(_objectIdIndex(i)))));
		//    5    9:aload_0         
		//    6   10:getfield        #56  <Field TreeMap _nativeIds>
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #61  <Method int _objectIdIndex(int)>
		//   10   18:invokestatic    #67  <Method Integer Integer.valueOf(int)>
		//   11   21:invokevirtual   #117 <Method Object TreeMap.get(Object)>
		//   12   24:areturn         
		}

		public Object findTypeId(int i)
		{
			if(_nativeIds == null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #56  <Field TreeMap _nativeIds>
		//*   2    4:ifnonnull       9
				return ((Object) (null));
		//    3    7:aconst_null     
		//    4    8:areturn         
			else
				return _nativeIds.get(((Object) (Integer.valueOf(_typeIdIndex(i)))));
		//    5    9:aload_0         
		//    6   10:getfield        #56  <Field TreeMap _nativeIds>
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:invokespecial   #73  <Method int _typeIdIndex(int)>
		//   10   18:invokestatic    #67  <Method Integer Integer.valueOf(int)>
		//   11   21:invokevirtual   #117 <Method Object TreeMap.get(Object)>
		//   12   24:areturn         
		}

		public Object get(int i)
		{
			return _tokens[i];
		//    0    0:aload_0         
		//    1    1:getfield        #49  <Field Object[] _tokens>
		//    2    4:iload_1         
		//    3    5:aaload          
		//    4    6:areturn         
		}

		public boolean hasIds()
		{
			return _nativeIds != null;
		//    0    0:aload_0         
		//    1    1:getfield        #56  <Field TreeMap _nativeIds>
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
		//    1    1:getfield        #95  <Field TokenBuffer$Segment _next>
		//    2    4:areturn         
		}

		public int rawType(int i)
		{
			long l1 = _tokenTypes;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field long _tokenTypes>
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
			return (int)l & 0xf;
		//   13   20:lload_2         
		//   14   21:l2i             
		//   15   22:bipush          15
		//   16   24:iand            
		//   17   25:ireturn         
		}

		public JsonToken type(int i)
		{
			long l1 = _tokenTypes;
		//    0    0:aload_0         
		//    1    1:getfield        #77  <Field long _tokenTypes>
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
		//   16   23:getstatic       #27  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
		//   17   26:iload_1         
		//   18   27:bipush          15
		//   19   29:iand            
		//   20   30:aaload          
		//   21   31:areturn         
		}

		public static final int TOKENS_PER_SEGMENT = 16;
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
		//    2    5:putstatic       #27  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
			JsonToken ajsontoken[] = JsonToken.values();
		//    3    8:invokestatic    #31  <Method JsonToken[] JsonToken.values()>
		//    4   11:astore_0        
			System.arraycopy(((Object) (ajsontoken)), 1, ((Object) (TOKEN_TYPES_BY_INDEX)), 1, Math.min(15, ajsontoken.length - 1));
		//    5   12:aload_0         
		//    6   13:iconst_1        
		//    7   14:getstatic       #27  <Field JsonToken[] TOKEN_TYPES_BY_INDEX>
		//    8   17:iconst_1        
		//    9   18:bipush          15
		//   10   20:aload_0         
		//   11   21:arraylength     
		//   12   22:iconst_1        
		//   13   23:isub            
		//   14   24:invokestatic    #37  <Method int Math.min(int, int)>
		//   15   27:invokestatic    #43  <Method void System.arraycopy(Object, int, Object, int, int)>
		//*  16   30:return          
		}

		public Segment()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #47  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:bipush          16
		//    4    7:anewarray       Object[]
		//    5   10:putfield        #49  <Field Object[] _tokens>
		//    6   13:return          
		}
	}


	public TokenBuffer(JsonParser jsonparser)
	{
		this(jsonparser, ((DeserializationContext) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #49  <Method void TokenBuffer(JsonParser, DeserializationContext)>
	//    4    6:return          
	}

	public TokenBuffer(JsonParser jsonparser, DeserializationContext deserializationcontext)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #51  <Method void JsonGenerator()>
		_hasNativeId = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #53  <Field boolean _hasNativeId>
		_objectCodec = jsonparser.getCodec();
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #59  <Method ObjectCodec JsonParser.getCodec()>
	//   10   16:putfield        #61  <Field ObjectCodec _objectCodec>
		_generatorFeatures = DEFAULT_GENERATOR_FEATURES;
	//   11   19:aload_0         
	//   12   20:getstatic       #43  <Field int DEFAULT_GENERATOR_FEATURES>
	//   13   23:putfield        #63  <Field int _generatorFeatures>
		_writeContext = JsonWriteContext.createRootContext(((com.fasterxml.jackson.core.json.DupDetector) (null)));
	//   14   26:aload_0         
	//   15   27:aconst_null     
	//   16   28:invokestatic    #69  <Method JsonWriteContext JsonWriteContext.createRootContext(com.fasterxml.jackson.core.json.DupDetector)>
	//   17   31:putfield        #71  <Field JsonWriteContext _writeContext>
		Segment segment = new Segment();
	//   18   34:new             #11  <Class TokenBuffer$Segment>
	//   19   37:dup             
	//   20   38:invokespecial   #72  <Method void TokenBuffer$Segment()>
	//   21   41:astore          4
		_last = segment;
	//   22   43:aload_0         
	//   23   44:aload           4
	//   24   46:putfield        #74  <Field TokenBuffer$Segment _last>
		_first = segment;
	//   25   49:aload_0         
	//   26   50:aload           4
	//   27   52:putfield        #76  <Field TokenBuffer$Segment _first>
		_appendAt = 0;
	//   28   55:aload_0         
	//   29   56:iconst_0        
	//   30   57:putfield        #78  <Field int _appendAt>
		_hasNativeTypeIds = jsonparser.canReadTypeId();
	//   31   60:aload_0         
	//   32   61:aload_1         
	//   33   62:invokevirtual   #82  <Method boolean JsonParser.canReadTypeId()>
	//   34   65:putfield        #84  <Field boolean _hasNativeTypeIds>
		_hasNativeObjectIds = jsonparser.canReadObjectId();
	//   35   68:aload_0         
	//   36   69:aload_1         
	//   37   70:invokevirtual   #87  <Method boolean JsonParser.canReadObjectId()>
	//   38   73:putfield        #89  <Field boolean _hasNativeObjectIds>
		_mayHaveNativeIds = _hasNativeTypeIds | _hasNativeObjectIds;
	//   39   76:aload_0         
	//   40   77:aload_0         
	//   41   78:getfield        #84  <Field boolean _hasNativeTypeIds>
	//   42   81:aload_0         
	//   43   82:getfield        #89  <Field boolean _hasNativeObjectIds>
	//   44   85:ior             
	//   45   86:putfield        #91  <Field boolean _mayHaveNativeIds>
		if(deserializationcontext != null)
	//*  46   89:aload_2         
	//*  47   90:ifnonnull       99
	//*  48   93:aload_0         
	//*  49   94:iload_3         
	//*  50   95:putfield        #93  <Field boolean _forceBigDecimal>
	//*  51   98:return          
			flag = deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS);
	//   52   99:aload_2         
	//   53  100:getstatic       #99  <Field DeserializationFeature DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS>
	//   54  103:invokevirtual   #105 <Method boolean DeserializationContext.isEnabled(DeserializationFeature)>
	//   55  106:istore_3        
		_forceBigDecimal = flag;
	//*  56  107:goto            93
	}

	public TokenBuffer(ObjectCodec objectcodec)
	{
		this(objectcodec, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #110 <Method void TokenBuffer(ObjectCodec, boolean)>
	//    4    6:return          
	}

	public TokenBuffer(ObjectCodec objectcodec, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void JsonGenerator()>
		_hasNativeId = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #53  <Field boolean _hasNativeId>
		_objectCodec = objectcodec;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #61  <Field ObjectCodec _objectCodec>
		_generatorFeatures = DEFAULT_GENERATOR_FEATURES;
	//    8   14:aload_0         
	//    9   15:getstatic       #43  <Field int DEFAULT_GENERATOR_FEATURES>
	//   10   18:putfield        #63  <Field int _generatorFeatures>
		_writeContext = JsonWriteContext.createRootContext(((com.fasterxml.jackson.core.json.DupDetector) (null)));
	//   11   21:aload_0         
	//   12   22:aconst_null     
	//   13   23:invokestatic    #69  <Method JsonWriteContext JsonWriteContext.createRootContext(com.fasterxml.jackson.core.json.DupDetector)>
	//   14   26:putfield        #71  <Field JsonWriteContext _writeContext>
		objectcodec = ((ObjectCodec) (new Segment()));
	//   15   29:new             #11  <Class TokenBuffer$Segment>
	//   16   32:dup             
	//   17   33:invokespecial   #72  <Method void TokenBuffer$Segment()>
	//   18   36:astore_1        
		_last = ((Segment) (objectcodec));
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:putfield        #74  <Field TokenBuffer$Segment _last>
		_first = ((Segment) (objectcodec));
	//   22   42:aload_0         
	//   23   43:aload_1         
	//   24   44:putfield        #76  <Field TokenBuffer$Segment _first>
		_appendAt = 0;
	//   25   47:aload_0         
	//   26   48:iconst_0        
	//   27   49:putfield        #78  <Field int _appendAt>
		_hasNativeTypeIds = flag;
	//   28   52:aload_0         
	//   29   53:iload_2         
	//   30   54:putfield        #84  <Field boolean _hasNativeTypeIds>
		_hasNativeObjectIds = flag;
	//   31   57:aload_0         
	//   32   58:iload_2         
	//   33   59:putfield        #89  <Field boolean _hasNativeObjectIds>
		_mayHaveNativeIds = _hasNativeTypeIds | _hasNativeObjectIds;
	//   34   62:aload_0         
	//   35   63:aload_0         
	//   36   64:getfield        #84  <Field boolean _hasNativeTypeIds>
	//   37   67:aload_0         
	//   38   68:getfield        #89  <Field boolean _hasNativeObjectIds>
	//   39   71:ior             
	//   40   72:putfield        #91  <Field boolean _mayHaveNativeIds>
	//   41   75:return          
	}

	private final void _appendNativeIds(StringBuilder stringbuilder)
	{
		Object obj = _last.findObjectId(_appendAt - 1);
	//    0    0:aload_0         
	//    1    1:getfield        #74  <Field TokenBuffer$Segment _last>
	//    2    4:aload_0         
	//    3    5:getfield        #78  <Field int _appendAt>
	//    4    8:iconst_1        
	//    5    9:isub            
	//    6   10:invokevirtual   #117 <Method Object TokenBuffer$Segment.findObjectId(int)>
	//    7   13:astore_2        
		if(obj != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          37
			stringbuilder.append("[objectId=").append(String.valueOf(obj)).append(']');
	//   10   18:aload_1         
	//   11   19:ldc1            #119 <String "[objectId=">
	//   12   21:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   13   24:aload_2         
	//   14   25:invokestatic    #131 <Method String String.valueOf(Object)>
	//   15   28:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   16   31:bipush          93
	//   17   33:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   18   36:pop             
		obj = _last.findTypeId(_appendAt - 1);
	//   19   37:aload_0         
	//   20   38:getfield        #74  <Field TokenBuffer$Segment _last>
	//   21   41:aload_0         
	//   22   42:getfield        #78  <Field int _appendAt>
	//   23   45:iconst_1        
	//   24   46:isub            
	//   25   47:invokevirtual   #137 <Method Object TokenBuffer$Segment.findTypeId(int)>
	//   26   50:astore_2        
		if(obj != null)
	//*  27   51:aload_2         
	//*  28   52:ifnull          74
			stringbuilder.append("[typeId=").append(String.valueOf(obj)).append(']');
	//   29   55:aload_1         
	//   30   56:ldc1            #139 <String "[typeId=">
	//   31   58:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:aload_2         
	//   33   62:invokestatic    #131 <Method String String.valueOf(Object)>
	//   34   65:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   35   68:bipush          93
	//   36   70:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//   37   73:pop             
	//   38   74:return          
	}

	private final void _checkNativeIds(JsonParser jsonparser)
		throws IOException
	{
		Object obj = jsonparser.getTypeId();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #146 <Method Object JsonParser.getTypeId()>
	//    2    4:astore_2        
		_typeId = obj;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #148 <Field Object _typeId>
		if(obj != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			_hasNativeId = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #53  <Field boolean _hasNativeId>
		jsonparser = ((JsonParser) (jsonparser.getObjectId()));
	//   11   19:aload_1         
	//   12   20:invokevirtual   #151 <Method Object JsonParser.getObjectId()>
	//   13   23:astore_1        
		_objectId = ((Object) (jsonparser));
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #153 <Field Object _objectId>
		if(jsonparser != null)
	//*  17   29:aload_1         
	//*  18   30:ifnull          38
			_hasNativeId = true;
	//   19   33:aload_0         
	//   20   34:iconst_1        
	//   21   35:putfield        #53  <Field boolean _hasNativeId>
	//   22   38:return          
	}

	protected final void _append(JsonToken jsontoken)
	{
		if(_hasNativeId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean _hasNativeId>
	//*   2    4:ifeq            43
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, _objectId, _typeId)));
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field TokenBuffer$Segment _last>
	//    5   11:aload_0         
	//    6   12:getfield        #78  <Field int _appendAt>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #153 <Field Object _objectId>
	//   10   20:aload_0         
	//   11   21:getfield        #148 <Field Object _typeId>
	//   12   24:invokevirtual   #159 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object, Object)>
	//   13   27:astore_1        
		else
	//*  14   28:aload_1         
	//*  15   29:ifnonnull       59
	//*  16   32:aload_0         
	//*  17   33:aload_0         
	//*  18   34:getfield        #78  <Field int _appendAt>
	//*  19   37:iconst_1        
	//*  20   38:iadd            
	//*  21   39:putfield        #78  <Field int _appendAt>
	//*  22   42:return          
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken)));
	//   23   43:aload_0         
	//   24   44:getfield        #74  <Field TokenBuffer$Segment _last>
	//   25   47:aload_0         
	//   26   48:getfield        #78  <Field int _appendAt>
	//   27   51:aload_1         
	//   28   52:invokevirtual   #162 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken)>
	//   29   55:astore_1        
		if(jsontoken == null)
		{
			_appendAt = _appendAt + 1;
			return;
		} else
	//*  30   56:goto            28
		{
			_last = ((Segment) (jsontoken));
	//   31   59:aload_0         
	//   32   60:aload_1         
	//   33   61:putfield        #74  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   34   64:aload_0         
	//   35   65:iconst_1        
	//   36   66:putfield        #78  <Field int _appendAt>
			return;
	//   37   69:return          
		}
	}

	protected final void _append(JsonToken jsontoken, Object obj)
	{
		if(_hasNativeId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean _hasNativeId>
	//*   2    4:ifeq            44
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, obj, _objectId, _typeId)));
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field TokenBuffer$Segment _last>
	//    5   11:aload_0         
	//    6   12:getfield        #78  <Field int _appendAt>
	//    7   15:aload_1         
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #153 <Field Object _objectId>
	//   11   21:aload_0         
	//   12   22:getfield        #148 <Field Object _typeId>
	//   13   25:invokevirtual   #166 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object, Object, Object)>
	//   14   28:astore_1        
		else
	//*  15   29:aload_1         
	//*  16   30:ifnonnull       61
	//*  17   33:aload_0         
	//*  18   34:aload_0         
	//*  19   35:getfield        #78  <Field int _appendAt>
	//*  20   38:iconst_1        
	//*  21   39:iadd            
	//*  22   40:putfield        #78  <Field int _appendAt>
	//*  23   43:return          
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, obj)));
	//   24   44:aload_0         
	//   25   45:getfield        #74  <Field TokenBuffer$Segment _last>
	//   26   48:aload_0         
	//   27   49:getfield        #78  <Field int _appendAt>
	//   28   52:aload_1         
	//   29   53:aload_2         
	//   30   54:invokevirtual   #169 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object)>
	//   31   57:astore_1        
		if(jsontoken == null)
		{
			_appendAt = _appendAt + 1;
			return;
		} else
	//*  32   58:goto            29
		{
			_last = ((Segment) (jsontoken));
	//   33   61:aload_0         
	//   34   62:aload_1         
	//   35   63:putfield        #74  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   36   66:aload_0         
	//   37   67:iconst_1        
	//   38   68:putfield        #78  <Field int _appendAt>
			return;
	//   39   71:return          
		}
	}

	protected final void _appendRaw(int i, Object obj)
	{
		if(_hasNativeId)
	//*   0    0:aload_0         
	//*   1    1:getfield        #53  <Field boolean _hasNativeId>
	//*   2    4:ifeq            44
			obj = ((Object) (_last.appendRaw(_appendAt, i, obj, _objectId, _typeId)));
	//    3    7:aload_0         
	//    4    8:getfield        #74  <Field TokenBuffer$Segment _last>
	//    5   11:aload_0         
	//    6   12:getfield        #78  <Field int _appendAt>
	//    7   15:iload_1         
	//    8   16:aload_2         
	//    9   17:aload_0         
	//   10   18:getfield        #153 <Field Object _objectId>
	//   11   21:aload_0         
	//   12   22:getfield        #148 <Field Object _typeId>
	//   13   25:invokevirtual   #175 <Method TokenBuffer$Segment TokenBuffer$Segment.appendRaw(int, int, Object, Object, Object)>
	//   14   28:astore_2        
		else
	//*  15   29:aload_2         
	//*  16   30:ifnonnull       61
	//*  17   33:aload_0         
	//*  18   34:aload_0         
	//*  19   35:getfield        #78  <Field int _appendAt>
	//*  20   38:iconst_1        
	//*  21   39:iadd            
	//*  22   40:putfield        #78  <Field int _appendAt>
	//*  23   43:return          
			obj = ((Object) (_last.appendRaw(_appendAt, i, obj)));
	//   24   44:aload_0         
	//   25   45:getfield        #74  <Field TokenBuffer$Segment _last>
	//   26   48:aload_0         
	//   27   49:getfield        #78  <Field int _appendAt>
	//   28   52:iload_1         
	//   29   53:aload_2         
	//   30   54:invokevirtual   #178 <Method TokenBuffer$Segment TokenBuffer$Segment.appendRaw(int, int, Object)>
	//   31   57:astore_2        
		if(obj == null)
		{
			_appendAt = _appendAt + 1;
			return;
		} else
	//*  32   58:goto            29
		{
			_last = ((Segment) (obj));
	//   33   61:aload_0         
	//   34   62:aload_2         
	//   35   63:putfield        #74  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   36   66:aload_0         
	//   37   67:iconst_1        
	//   38   68:putfield        #78  <Field int _appendAt>
			return;
	//   39   71:return          
		}
	}

	protected final void _appendValue(JsonToken jsontoken)
	{
		_writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #182 <Method int JsonWriteContext.writeValue()>
	//    3    7:pop             
		if(_hasNativeId)
	//*   4    8:aload_0         
	//*   5    9:getfield        #53  <Field boolean _hasNativeId>
	//*   6   12:ifeq            51
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, _objectId, _typeId)));
	//    7   15:aload_0         
	//    8   16:getfield        #74  <Field TokenBuffer$Segment _last>
	//    9   19:aload_0         
	//   10   20:getfield        #78  <Field int _appendAt>
	//   11   23:aload_1         
	//   12   24:aload_0         
	//   13   25:getfield        #153 <Field Object _objectId>
	//   14   28:aload_0         
	//   15   29:getfield        #148 <Field Object _typeId>
	//   16   32:invokevirtual   #159 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object, Object)>
	//   17   35:astore_1        
		else
	//*  18   36:aload_1         
	//*  19   37:ifnonnull       67
	//*  20   40:aload_0         
	//*  21   41:aload_0         
	//*  22   42:getfield        #78  <Field int _appendAt>
	//*  23   45:iconst_1        
	//*  24   46:iadd            
	//*  25   47:putfield        #78  <Field int _appendAt>
	//*  26   50:return          
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken)));
	//   27   51:aload_0         
	//   28   52:getfield        #74  <Field TokenBuffer$Segment _last>
	//   29   55:aload_0         
	//   30   56:getfield        #78  <Field int _appendAt>
	//   31   59:aload_1         
	//   32   60:invokevirtual   #162 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken)>
	//   33   63:astore_1        
		if(jsontoken == null)
		{
			_appendAt = _appendAt + 1;
			return;
		} else
	//*  34   64:goto            36
		{
			_last = ((Segment) (jsontoken));
	//   35   67:aload_0         
	//   36   68:aload_1         
	//   37   69:putfield        #74  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   38   72:aload_0         
	//   39   73:iconst_1        
	//   40   74:putfield        #78  <Field int _appendAt>
			return;
	//   41   77:return          
		}
	}

	protected final void _appendValue(JsonToken jsontoken, Object obj)
	{
		_writeContext.writeValue();
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field JsonWriteContext _writeContext>
	//    2    4:invokevirtual   #182 <Method int JsonWriteContext.writeValue()>
	//    3    7:pop             
		if(_hasNativeId)
	//*   4    8:aload_0         
	//*   5    9:getfield        #53  <Field boolean _hasNativeId>
	//*   6   12:ifeq            52
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, obj, _objectId, _typeId)));
	//    7   15:aload_0         
	//    8   16:getfield        #74  <Field TokenBuffer$Segment _last>
	//    9   19:aload_0         
	//   10   20:getfield        #78  <Field int _appendAt>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:aload_0         
	//   14   26:getfield        #153 <Field Object _objectId>
	//   15   29:aload_0         
	//   16   30:getfield        #148 <Field Object _typeId>
	//   17   33:invokevirtual   #166 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object, Object, Object)>
	//   18   36:astore_1        
		else
	//*  19   37:aload_1         
	//*  20   38:ifnonnull       69
	//*  21   41:aload_0         
	//*  22   42:aload_0         
	//*  23   43:getfield        #78  <Field int _appendAt>
	//*  24   46:iconst_1        
	//*  25   47:iadd            
	//*  26   48:putfield        #78  <Field int _appendAt>
	//*  27   51:return          
			jsontoken = ((JsonToken) (_last.append(_appendAt, jsontoken, obj)));
	//   28   52:aload_0         
	//   29   53:getfield        #74  <Field TokenBuffer$Segment _last>
	//   30   56:aload_0         
	//   31   57:getfield        #78  <Field int _appendAt>
	//   32   60:aload_1         
	//   33   61:aload_2         
	//   34   62:invokevirtual   #169 <Method TokenBuffer$Segment TokenBuffer$Segment.append(int, JsonToken, Object)>
	//   35   65:astore_1        
		if(jsontoken == null)
		{
			_appendAt = _appendAt + 1;
			return;
		} else
	//*  36   66:goto            37
		{
			_last = ((Segment) (jsontoken));
	//   37   69:aload_0         
	//   38   70:aload_1         
	//   39   71:putfield        #74  <Field TokenBuffer$Segment _last>
			_appendAt = 1;
	//   40   74:aload_0         
	//   41   75:iconst_1        
	//   42   76:putfield        #78  <Field int _appendAt>
			return;
	//   43   79:return          
		}
	}

	protected void _reportUnsupportedOperation()
	{
		throw new UnsupportedOperationException("Called operation not supported for TokenBuffer");
	//    0    0:new             #185 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc1            #187 <String "Called operation not supported for TokenBuffer">
	//    3    6:invokespecial   #190 <Method void UnsupportedOperationException(String)>
	//    4    9:athrow          
	}

	public TokenBuffer append(TokenBuffer tokenbuffer)
		throws IOException
	{
		if(!_hasNativeTypeIds)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field boolean _hasNativeTypeIds>
	//*   2    4:ifne            15
			_hasNativeTypeIds = tokenbuffer.canWriteTypeId();
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokevirtual   #194 <Method boolean canWriteTypeId()>
	//    6   12:putfield        #84  <Field boolean _hasNativeTypeIds>
		if(!_hasNativeObjectIds)
	//*   7   15:aload_0         
	//*   8   16:getfield        #89  <Field boolean _hasNativeObjectIds>
	//*   9   19:ifne            30
			_hasNativeObjectIds = tokenbuffer.canWriteObjectId();
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #197 <Method boolean canWriteObjectId()>
	//   13   27:putfield        #89  <Field boolean _hasNativeObjectIds>
		_mayHaveNativeIds = _hasNativeTypeIds | _hasNativeObjectIds;
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #84  <Field boolean _hasNativeTypeIds>
	//   17   35:aload_0         
	//   18   36:getfield        #89  <Field boolean _hasNativeObjectIds>
	//   19   39:ior             
	//   20   40:putfield        #91  <Field boolean _mayHaveNativeIds>
		for(tokenbuffer = ((TokenBuffer) (tokenbuffer.asParser())); ((JsonParser) (tokenbuffer)).nextToken() != null; copyCurrentStructure(((JsonParser) (tokenbuffer))));
	//   21   43:aload_1         
	//   22   44:invokevirtual   #201 <Method JsonParser asParser()>
	//   23   47:astore_1        
	//   24   48:aload_1         
	//   25   49:invokevirtual   #205 <Method JsonToken JsonParser.nextToken()>
	//   26   52:ifnull          63
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #208 <Method void copyCurrentStructure(JsonParser)>
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
	//    2    2:getfield        #61  <Field ObjectCodec _objectCodec>
	//    3    5:invokevirtual   #211 <Method JsonParser asParser(ObjectCodec)>
	//    4    8:areturn         
	}

	public JsonParser asParser(JsonParser jsonparser)
	{
		Parser parser = new Parser(_first, jsonparser.getCodec(), _hasNativeTypeIds, _hasNativeObjectIds);
	//    0    0:new             #8   <Class TokenBuffer$Parser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #76  <Field TokenBuffer$Segment _first>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #59  <Method ObjectCodec JsonParser.getCodec()>
	//    6   12:aload_0         
	//    7   13:getfield        #84  <Field boolean _hasNativeTypeIds>
	//    8   16:aload_0         
	//    9   17:getfield        #89  <Field boolean _hasNativeObjectIds>
	//   10   20:invokespecial   #215 <Method void TokenBuffer$Parser(TokenBuffer$Segment, ObjectCodec, boolean, boolean)>
	//   11   23:astore_2        
		parser.setLocation(jsonparser.getTokenLocation());
	//   12   24:aload_2         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #219 <Method JsonLocation JsonParser.getTokenLocation()>
	//   15   29:invokevirtual   #223 <Method void TokenBuffer$Parser.setLocation(JsonLocation)>
		return ((JsonParser) (parser));
	//   16   32:aload_2         
	//   17   33:areturn         
	}

	public JsonParser asParser(ObjectCodec objectcodec)
	{
		return ((JsonParser) (new Parser(_first, objectcodec, _hasNativeTypeIds, _hasNativeObjectIds)));
	//    0    0:new             #8   <Class TokenBuffer$Parser>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #76  <Field TokenBuffer$Segment _first>
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #84  <Field boolean _hasNativeTypeIds>
	//    7   13:aload_0         
	//    8   14:getfield        #89  <Field boolean _hasNativeObjectIds>
	//    9   17:invokespecial   #215 <Method void TokenBuffer$Parser(TokenBuffer$Segment, ObjectCodec, boolean, boolean)>
	//   10   20:areturn         
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
	//    1    1:getfield        #89  <Field boolean _hasNativeObjectIds>
	//    2    4:ireturn         
	}

	public boolean canWriteTypeId()
	{
		return _hasNativeTypeIds;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field boolean _hasNativeTypeIds>
	//    2    4:ireturn         
	}

	public void close()
		throws IOException
	{
		_closed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #227 <Field boolean _closed>
	//    3    5:return          
	}

	public void copyCurrentEvent(JsonParser jsonparser)
		throws IOException
	{
		if(_mayHaveNativeIds)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field boolean _mayHaveNativeIds>
	//*   2    4:ifeq            12
			_checkNativeIds(jsonparser);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #230 <Method void _checkNativeIds(JsonParser)>
		switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()])
	//*   6   12:getstatic       #234 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #237 <Method JsonToken JsonParser.getCurrentToken()>
	//*   9   19:invokevirtual   #242 <Method int JsonToken.ordinal()>
	//*  10   22:iaload          
		{
	//*  11   23:tableswitch     1 12: default 84
	//	               1 94
	//	               2 99
	//	               3 104
	//	               4 109
	//	               5 114
	//	               6 123
	//	               7 156
	//	               8 215
	//	               9 291
	//	               10 297
	//	               11 303
	//	               12 308
		default:
			throw new RuntimeException("Internal error: should never end up through this code path");
	//   12   84:new             #244 <Class RuntimeException>
	//   13   87:dup             
	//   14   88:ldc1            #246 <String "Internal error: should never end up through this code path">
	//   15   90:invokespecial   #247 <Method void RuntimeException(String)>
	//   16   93:athrow          

		case 1: // '\001'
			writeStartObject();
	//   17   94:aload_0         
	//   18   95:invokevirtual   #250 <Method void writeStartObject()>
			return;
	//   19   98:return          

		case 2: // '\002'
			writeEndObject();
	//   20   99:aload_0         
	//   21  100:invokevirtual   #253 <Method void writeEndObject()>
			return;
	//   22  103:return          

		case 3: // '\003'
			writeStartArray();
	//   23  104:aload_0         
	//   24  105:invokevirtual   #256 <Method void writeStartArray()>
			return;
	//   25  108:return          

		case 4: // '\004'
			writeEndArray();
	//   26  109:aload_0         
	//   27  110:invokevirtual   #259 <Method void writeEndArray()>
			return;
	//   28  113:return          

		case 5: // '\005'
			writeFieldName(jsonparser.getCurrentName());
	//   29  114:aload_0         
	//   30  115:aload_1         
	//   31  116:invokevirtual   #263 <Method String JsonParser.getCurrentName()>
	//   32  119:invokevirtual   #266 <Method void writeFieldName(String)>
			return;
	//   33  122:return          

		case 6: // '\006'
			if(jsonparser.hasTextCharacters())
	//*  34  123:aload_1         
	//*  35  124:invokevirtual   #269 <Method boolean JsonParser.hasTextCharacters()>
	//*  36  127:ifeq            147
			{
				writeString(jsonparser.getTextCharacters(), jsonparser.getTextOffset(), jsonparser.getTextLength());
	//   37  130:aload_0         
	//   38  131:aload_1         
	//   39  132:invokevirtual   #273 <Method char[] JsonParser.getTextCharacters()>
	//   40  135:aload_1         
	//   41  136:invokevirtual   #276 <Method int JsonParser.getTextOffset()>
	//   42  139:aload_1         
	//   43  140:invokevirtual   #279 <Method int JsonParser.getTextLength()>
	//   44  143:invokevirtual   #283 <Method void writeString(char[], int, int)>
				return;
	//   45  146:return          
			} else
			{
				writeString(jsonparser.getText());
	//   46  147:aload_0         
	//   47  148:aload_1         
	//   48  149:invokevirtual   #286 <Method String JsonParser.getText()>
	//   49  152:invokevirtual   #288 <Method void writeString(String)>
				return;
	//   50  155:return          
			}

		case 7: // '\007'
			switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
	//*  51  156:getstatic       #291 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  52  159:aload_1         
	//*  53  160:invokevirtual   #295 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*  54  163:invokevirtual   #298 <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  55  166:iaload          
			{
	//*  56  167:tableswitch     1 2: default 188
	//	               1 197
	//	               2 206
			default:
				writeNumber(jsonparser.getLongValue());
	//   57  188:aload_0         
	//   58  189:aload_1         
	//   59  190:invokevirtual   #302 <Method long JsonParser.getLongValue()>
	//   60  193:invokevirtual   #306 <Method void writeNumber(long)>
				return;
	//   61  196:return          

			case 1: // '\001'
				writeNumber(jsonparser.getIntValue());
	//   62  197:aload_0         
	//   63  198:aload_1         
	//   64  199:invokevirtual   #309 <Method int JsonParser.getIntValue()>
	//   65  202:invokevirtual   #312 <Method void writeNumber(int)>
				return;
	//   66  205:return          

			case 2: // '\002'
				writeNumber(jsonparser.getBigIntegerValue());
	//   67  206:aload_0         
	//   68  207:aload_1         
	//   69  208:invokevirtual   #316 <Method BigInteger JsonParser.getBigIntegerValue()>
	//   70  211:invokevirtual   #319 <Method void writeNumber(BigInteger)>
				break;
			}
			return;
	//   71  214:return          

		case 8: // '\b'
			if(_forceBigDecimal)
	//*  72  215:aload_0         
	//*  73  216:getfield        #93  <Field boolean _forceBigDecimal>
	//*  74  219:ifeq            231
			{
				writeNumber(jsonparser.getDecimalValue());
	//   75  222:aload_0         
	//   76  223:aload_1         
	//   77  224:invokevirtual   #323 <Method BigDecimal JsonParser.getDecimalValue()>
	//   78  227:invokevirtual   #326 <Method void writeNumber(BigDecimal)>
				return;
	//   79  230:return          
			}
			switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
	//*  80  231:getstatic       #291 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType>
	//*  81  234:aload_1         
	//*  82  235:invokevirtual   #295 <Method com.fasterxml.jackson.core.JsonParser$NumberType JsonParser.getNumberType()>
	//*  83  238:invokevirtual   #298 <Method int com.fasterxml.jackson.core.JsonParser$NumberType.ordinal()>
	//*  84  241:iaload          
			{
	//*  85  242:tableswitch     3 4: default 264
	//	               3 273
	//	               4 282
			default:
				writeNumber(jsonparser.getDoubleValue());
	//   86  264:aload_0         
	//   87  265:aload_1         
	//   88  266:invokevirtual   #330 <Method double JsonParser.getDoubleValue()>
	//   89  269:invokevirtual   #333 <Method void writeNumber(double)>
				return;
	//   90  272:return          

			case 3: // '\003'
				writeNumber(jsonparser.getDecimalValue());
	//   91  273:aload_0         
	//   92  274:aload_1         
	//   93  275:invokevirtual   #323 <Method BigDecimal JsonParser.getDecimalValue()>
	//   94  278:invokevirtual   #326 <Method void writeNumber(BigDecimal)>
				return;
	//   95  281:return          

			case 4: // '\004'
				writeNumber(jsonparser.getFloatValue());
	//   96  282:aload_0         
	//   97  283:aload_1         
	//   98  284:invokevirtual   #337 <Method float JsonParser.getFloatValue()>
	//   99  287:invokevirtual   #340 <Method void writeNumber(float)>
				break;
			}
			return;
	//  100  290:return          

		case 9: // '\t'
			writeBoolean(true);
	//  101  291:aload_0         
	//  102  292:iconst_1        
	//  103  293:invokevirtual   #344 <Method void writeBoolean(boolean)>
			return;
	//  104  296:return          

		case 10: // '\n'
			writeBoolean(false);
	//  105  297:aload_0         
	//  106  298:iconst_0        
	//  107  299:invokevirtual   #344 <Method void writeBoolean(boolean)>
			return;
	//  108  302:return          

		case 11: // '\013'
			writeNull();
	//  109  303:aload_0         
	//  110  304:invokevirtual   #347 <Method void writeNull()>
			return;
	//  111  307:return          

		case 12: // '\f'
			writeObject(jsonparser.getEmbeddedObject());
	//  112  308:aload_0         
	//  113  309:aload_1         
	//  114  310:invokevirtual   #350 <Method Object JsonParser.getEmbeddedObject()>
	//  115  313:invokevirtual   #354 <Method void writeObject(Object)>
			return;
	//  116  316:return          
		}
	}

	public void copyCurrentStructure(JsonParser jsonparser)
		throws IOException
	{
		JsonToken jsontoken1 = jsonparser.getCurrentToken();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #237 <Method JsonToken JsonParser.getCurrentToken()>
	//    2    4:astore_3        
		JsonToken jsontoken = jsontoken1;
	//    3    5:aload_3         
	//    4    6:astore_2        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    7:aload_3         
	//*   6    8:getstatic       #358 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   11:if_acmpne       39
		{
			if(_mayHaveNativeIds)
	//*   8   14:aload_0         
	//*   9   15:getfield        #91  <Field boolean _mayHaveNativeIds>
	//*  10   18:ifeq            26
				_checkNativeIds(jsonparser);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #230 <Method void _checkNativeIds(JsonParser)>
			writeFieldName(jsonparser.getCurrentName());
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:invokevirtual   #263 <Method String JsonParser.getCurrentName()>
	//   17   31:invokevirtual   #266 <Method void writeFieldName(String)>
			jsontoken = jsonparser.nextToken();
	//   18   34:aload_1         
	//   19   35:invokevirtual   #205 <Method JsonToken JsonParser.nextToken()>
	//   20   38:astore_2        
		}
		if(_mayHaveNativeIds)
	//*  21   39:aload_0         
	//*  22   40:getfield        #91  <Field boolean _mayHaveNativeIds>
	//*  23   43:ifeq            51
			_checkNativeIds(jsonparser);
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:invokespecial   #230 <Method void _checkNativeIds(JsonParser)>
		switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
	//*  27   51:getstatic       #234 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  28   54:aload_2         
	//*  29   55:invokevirtual   #242 <Method int JsonToken.ordinal()>
	//*  30   58:iaload          
		{
	//*  31   59:tableswitch     1 3: default 84
	//	               1 117
	//	               2 84
	//	               3 90
		case 2: // '\002'
		default:
			copyCurrentEvent(jsonparser);
	//   32   84:aload_0         
	//   33   85:aload_1         
	//   34   86:invokevirtual   #360 <Method void copyCurrentEvent(JsonParser)>
			return;
	//   35   89:return          

		case 3: // '\003'
			writeStartArray();
	//   36   90:aload_0         
	//   37   91:invokevirtual   #256 <Method void writeStartArray()>
			for(; jsonparser.nextToken() != JsonToken.END_ARRAY; copyCurrentStructure(jsonparser));
	//   38   94:aload_1         
	//   39   95:invokevirtual   #205 <Method JsonToken JsonParser.nextToken()>
	//   40   98:getstatic       #363 <Field JsonToken JsonToken.END_ARRAY>
	//   41  101:if_acmpeq       112
	//   42  104:aload_0         
	//   43  105:aload_1         
	//   44  106:invokevirtual   #208 <Method void copyCurrentStructure(JsonParser)>
	//*  45  109:goto            94
			writeEndArray();
	//   46  112:aload_0         
	//   47  113:invokevirtual   #259 <Method void writeEndArray()>
			return;
	//   48  116:return          

		case 1: // '\001'
			writeStartObject();
	//   49  117:aload_0         
	//   50  118:invokevirtual   #250 <Method void writeStartObject()>
			break;
		}
		for(; jsonparser.nextToken() != JsonToken.END_OBJECT; copyCurrentStructure(jsonparser));
	//   51  121:aload_1         
	//   52  122:invokevirtual   #205 <Method JsonToken JsonParser.nextToken()>
	//   53  125:getstatic       #366 <Field JsonToken JsonToken.END_OBJECT>
	//   54  128:if_acmpeq       139
	//   55  131:aload_0         
	//   56  132:aload_1         
	//   57  133:invokevirtual   #208 <Method void copyCurrentStructure(JsonParser)>
	//*  58  136:goto            121
		writeEndObject();
	//   59  139:aload_0         
	//   60  140:invokevirtual   #253 <Method void writeEndObject()>
	//   61  143:return          
	}

	public TokenBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
		throws IOException
	{
		if(jsonparser.getCurrentTokenId() != JsonToken.FIELD_NAME.id())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #371 <Method int JsonParser.getCurrentTokenId()>
	//*   2    4:getstatic       #358 <Field JsonToken JsonToken.FIELD_NAME>
	//*   3    7:invokevirtual   #374 <Method int JsonToken.id()>
	//*   4   10:icmpeq          20
		{
			copyCurrentStructure(jsonparser);
	//    5   13:aload_0         
	//    6   14:aload_1         
	//    7   15:invokevirtual   #208 <Method void copyCurrentStructure(JsonParser)>
			return this;
	//    8   18:aload_0         
	//    9   19:areturn         
		}
		writeStartObject();
	//   10   20:aload_0         
	//   11   21:invokevirtual   #250 <Method void writeStartObject()>
		JsonToken jsontoken;
		do
		{
			copyCurrentStructure(jsonparser);
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:invokevirtual   #208 <Method void copyCurrentStructure(JsonParser)>
			jsontoken = jsonparser.nextToken();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #205 <Method JsonToken JsonParser.nextToken()>
	//   17   33:astore_3        
		} while(jsontoken == JsonToken.FIELD_NAME);
	//   18   34:aload_3         
	//   19   35:getstatic       #358 <Field JsonToken JsonToken.FIELD_NAME>
	//   20   38:if_acmpeq       24
		if(jsontoken != JsonToken.END_OBJECT)
	//*  21   41:aload_3         
	//*  22   42:getstatic       #366 <Field JsonToken JsonToken.END_OBJECT>
	//*  23   45:if_acmpeq       73
		{
			throw deserializationcontext.mappingException((new StringBuilder()).append("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ").append(((Object) (jsontoken))).toString());
	//   24   48:aload_2         
	//   25   49:new             #121 <Class StringBuilder>
	//   26   52:dup             
	//   27   53:invokespecial   #375 <Method void StringBuilder()>
	//   28   56:ldc2            #377 <String "Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ">
	//   29   59:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   30   62:aload_3         
	//   31   63:invokevirtual   #380 <Method StringBuilder StringBuilder.append(Object)>
	//   32   66:invokevirtual   #383 <Method String StringBuilder.toString()>
	//   33   69:invokevirtual   #387 <Method com.fasterxml.jackson.databind.JsonMappingException DeserializationContext.mappingException(String)>
	//   34   72:athrow          
		} else
		{
			writeEndObject();
	//   35   73:aload_0         
	//   36   74:invokevirtual   #253 <Method void writeEndObject()>
			return this;
	//   37   77:aload_0         
	//   38   78:areturn         
		}
	}

	public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		_generatorFeatures = _generatorFeatures & ~feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field int _generatorFeatures>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #392 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    5    9:iconst_m1       
	//    6   10:ixor            
	//    7   11:iand            
	//    8   12:putfield        #63  <Field int _generatorFeatures>
		return ((JsonGenerator) (this));
	//    9   15:aload_0         
	//   10   16:areturn         
	}

	public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		_generatorFeatures = _generatorFeatures | feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field int _generatorFeatures>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #392 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    5    9:ior             
	//    6   10:putfield        #63  <Field int _generatorFeatures>
		return ((JsonGenerator) (this));
	//    7   13:aload_0         
	//    8   14:areturn         
	}

	public JsonToken firstToken()
	{
		if(_first != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #76  <Field TokenBuffer$Segment _first>
	//*   2    4:ifnull          16
			return _first.type(0);
	//    3    7:aload_0         
	//    4    8:getfield        #76  <Field TokenBuffer$Segment _first>
	//    5   11:iconst_0        
	//    6   12:invokevirtual   #398 <Method JsonToken TokenBuffer$Segment.type(int)>
	//    7   15:areturn         
		else
			return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
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
	//    2    2:putfield        #93  <Field boolean _forceBigDecimal>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ObjectCodec getCodec()
	{
		return _objectCodec;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ObjectCodec _objectCodec>
	//    2    4:areturn         
	}

	public int getFeatureMask()
	{
		return _generatorFeatures;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int _generatorFeatures>
	//    2    4:ireturn         
	}

	public volatile JsonStreamContext getOutputContext()
	{
		return ((JsonStreamContext) (getOutputContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #407 <Method JsonWriteContext getOutputContext()>
	//    2    4:areturn         
	}

	public final JsonWriteContext getOutputContext()
	{
		return _writeContext;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field JsonWriteContext _writeContext>
	//    2    4:areturn         
	}

	public boolean isClosed()
	{
		return _closed;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field boolean _closed>
	//    2    4:ireturn         
	}

	public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
	{
		return (_generatorFeatures & feature.getMask()) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field int _generatorFeatures>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #392 <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.getMask()>
	//    4    8:iand            
	//    5    9:ifeq            14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public JsonGenerator overrideStdFeatures(int i, int j)
	{
		_generatorFeatures = ~j & getFeatureMask() | i & j;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:iconst_m1       
	//    3    3:ixor            
	//    4    4:aload_0         
	//    5    5:invokevirtual   #413 <Method int getFeatureMask()>
	//    6    8:iand            
	//    7    9:iload_1         
	//    8   10:iload_2         
	//    9   11:iand            
	//   10   12:ior             
	//   11   13:putfield        #63  <Field int _generatorFeatures>
		return ((JsonGenerator) (this));
	//   12   16:aload_0         
	//   13   17:areturn         
	}

	public void serialize(JsonGenerator jsongenerator)
		throws IOException
	{
		boolean flag;
		int i;
		boolean flag1;
		Segment segment;
		Object obj;
		obj = ((Object) (_first));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field TokenBuffer$Segment _first>
	//    2    4:astore          7
		i = -1;
	//    3    6:iconst_m1       
	//    4    7:istore_3        
		flag1 = _mayHaveNativeIds;
	//    5    8:aload_0         
	//    6    9:getfield        #91  <Field boolean _mayHaveNativeIds>
	//    7   12:istore          5
		int j;
		if(flag1 && ((Segment) (obj)).hasIds())
	//*   8   14:iload           5
	//*   9   16:ifeq            63
	//*  10   19:aload           7
	//*  11   21:invokevirtual   #418 <Method boolean TokenBuffer$Segment.hasIds()>
	//*  12   24:ifeq            63
			flag = true;
	//   13   27:iconst_1        
	//   14   28:istore_2        
		else
	//*  15   29:iload_3         
	//*  16   30:iconst_1        
	//*  17   31:iadd            
	//*  18   32:istore          4
	//*  19   34:iload           4
	//*  20   36:istore_3        
	//*  21   37:aload           7
	//*  22   39:astore          6
	//*  23   41:iload           4
	//*  24   43:bipush          16
	//*  25   45:icmplt          83
	//*  26   48:iconst_0        
	//*  27   49:istore_3        
	//*  28   50:aload           7
	//*  29   52:invokevirtual   #422 <Method TokenBuffer$Segment TokenBuffer$Segment.next()>
	//*  30   55:astore          6
	//*  31   57:aload           6
	//*  32   59:ifnonnull       68
	//*  33   62:return          
			flag = false;
	//   34   63:iconst_0        
	//   35   64:istore_2        
_L7:
		j = i + 1;
		i = j;
		segment = ((Segment) (obj));
		if(j < 16) goto _L2; else goto _L1
_L1:
		i = 0;
		segment = ((Segment) (obj)).next();
		if(segment != null) goto _L4; else goto _L3
_L3:
		return;
	//*  36   65:goto            29
_L4:
		if(flag1 && segment.hasIds())
	//*  37   68:iload           5
	//*  38   70:ifeq            218
	//*  39   73:aload           6
	//*  40   75:invokevirtual   #418 <Method boolean TokenBuffer$Segment.hasIds()>
	//*  41   78:ifeq            218
			flag = true;
	//   42   81:iconst_1        
	//   43   82:istore_2        
		else
	//*  44   83:aload           6
	//*  45   85:iload_3         
	//*  46   86:invokevirtual   #398 <Method JsonToken TokenBuffer$Segment.type(int)>
	//*  47   89:astore          7
	//*  48   91:aload           7
	//*  49   93:ifnull          62
	//*  50   96:iload_2         
	//*  51   97:ifeq            138
	//*  52  100:aload           6
	//*  53  102:iload_3         
	//*  54  103:invokevirtual   #117 <Method Object TokenBuffer$Segment.findObjectId(int)>
	//*  55  106:astore          8
	//*  56  108:aload           8
	//*  57  110:ifnull          119
	//*  58  113:aload_1         
	//*  59  114:aload           8
	//*  60  116:invokevirtual   #425 <Method void JsonGenerator.writeObjectId(Object)>
	//*  61  119:aload           6
	//*  62  121:iload_3         
	//*  63  122:invokevirtual   #137 <Method Object TokenBuffer$Segment.findTypeId(int)>
	//*  64  125:astore          8
	//*  65  127:aload           8
	//*  66  129:ifnull          138
	//*  67  132:aload_1         
	//*  68  133:aload           8
	//*  69  135:invokevirtual   #428 <Method void JsonGenerator.writeTypeId(Object)>
	//*  70  138:getstatic       #234 <Field int[] TokenBuffer$1.$SwitchMap$com$fasterxml$jackson$core$JsonToken>
	//*  71  141:aload           7
	//*  72  143:invokevirtual   #242 <Method int JsonToken.ordinal()>
	//*  73  146:iaload          
	//*  74  147:tableswitch     1 12: default 208
	//	               1 223
	//	               2 234
	//	               3 245
	//	               4 256
	//	               5 267
	//	               6 315
	//	               7 363
	//	               8 495
	//	               9 651
	//	               10 663
	//	               11 675
	//	               12 686
	//*  75  208:new             #244 <Class RuntimeException>
	//*  76  211:dup             
	//*  77  212:ldc1            #246 <String "Internal error: should never end up through this code path">
	//*  78  214:invokespecial   #247 <Method void RuntimeException(String)>
	//*  79  217:athrow          
			flag = false;
	//   80  218:iconst_0        
	//   81  219:istore_2        
_L2:
		obj = ((Object) (segment.type(i)));
		if(obj == null) goto _L3; else goto _L5
_L5:
		if(flag)
		{
			Object obj1 = segment.findObjectId(i);
			if(obj1 != null)
				jsongenerator.writeObjectId(obj1);
			obj1 = segment.findTypeId(i);
			if(obj1 != null)
				jsongenerator.writeTypeId(obj1);
		}
		switch(_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[((JsonToken) (obj)).ordinal()])
		{
		default:
			throw new RuntimeException("Internal error: should never end up through this code path");

	//*  82  220:goto            83
		case 1: // '\001'
			jsongenerator.writeStartObject();
	//   83  223:aload_1         
	//   84  224:invokevirtual   #429 <Method void JsonGenerator.writeStartObject()>
			obj = ((Object) (segment));
	//   85  227:aload           6
	//   86  229:astore          7
			break;

	//*  87  231:goto            29
		case 2: // '\002'
			jsongenerator.writeEndObject();
	//   88  234:aload_1         
	//   89  235:invokevirtual   #430 <Method void JsonGenerator.writeEndObject()>
			obj = ((Object) (segment));
	//   90  238:aload           6
	//   91  240:astore          7
			break;

	//*  92  242:goto            29
		case 3: // '\003'
			jsongenerator.writeStartArray();
	//   93  245:aload_1         
	//   94  246:invokevirtual   #431 <Method void JsonGenerator.writeStartArray()>
			obj = ((Object) (segment));
	//   95  249:aload           6
	//   96  251:astore          7
			break;

	//*  97  253:goto            29
		case 4: // '\004'
			jsongenerator.writeEndArray();
	//   98  256:aload_1         
	//   99  257:invokevirtual   #432 <Method void JsonGenerator.writeEndArray()>
			obj = ((Object) (segment));
	//  100  260:aload           6
	//  101  262:astore          7
			break;

	//* 102  264:goto            29
		case 5: // '\005'
			obj = segment.get(i);
	//  103  267:aload           6
	//  104  269:iload_3         
	//  105  270:invokevirtual   #435 <Method Object TokenBuffer$Segment.get(int)>
	//  106  273:astore          7
			if(obj instanceof SerializableString)
	//* 107  275:aload           7
	//* 108  277:instanceof      #437 <Class SerializableString>
	//* 109  280:ifeq            299
			{
				jsongenerator.writeFieldName((SerializableString)obj);
	//  110  283:aload_1         
	//  111  284:aload           7
	//  112  286:checkcast       #437 <Class SerializableString>
	//  113  289:invokevirtual   #440 <Method void JsonGenerator.writeFieldName(SerializableString)>
				obj = ((Object) (segment));
	//  114  292:aload           6
	//  115  294:astore          7
			} else
	//* 116  296:goto            29
			{
				jsongenerator.writeFieldName((String)obj);
	//  117  299:aload_1         
	//  118  300:aload           7
	//  119  302:checkcast       #127 <Class String>
	//  120  305:invokevirtual   #441 <Method void JsonGenerator.writeFieldName(String)>
				obj = ((Object) (segment));
	//  121  308:aload           6
	//  122  310:astore          7
			}
			break;

	//* 123  312:goto            29
		case 6: // '\006'
			obj = segment.get(i);
	//  124  315:aload           6
	//  125  317:iload_3         
	//  126  318:invokevirtual   #435 <Method Object TokenBuffer$Segment.get(int)>
	//  127  321:astore          7
			if(obj instanceof SerializableString)
	//* 128  323:aload           7
	//* 129  325:instanceof      #437 <Class SerializableString>
	//* 130  328:ifeq            347
			{
				jsongenerator.writeString((SerializableString)obj);
	//  131  331:aload_1         
	//  132  332:aload           7
	//  133  334:checkcast       #437 <Class SerializableString>
	//  134  337:invokevirtual   #443 <Method void JsonGenerator.writeString(SerializableString)>
				obj = ((Object) (segment));
	//  135  340:aload           6
	//  136  342:astore          7
			} else
	//* 137  344:goto            29
			{
				jsongenerator.writeString((String)obj);
	//  138  347:aload_1         
	//  139  348:aload           7
	//  140  350:checkcast       #127 <Class String>
	//  141  353:invokevirtual   #444 <Method void JsonGenerator.writeString(String)>
				obj = ((Object) (segment));
	//  142  356:aload           6
	//  143  358:astore          7
			}
			break;

	//* 144  360:goto            29
		case 7: // '\007'
			obj = segment.get(i);
	//  145  363:aload           6
	//  146  365:iload_3         
	//  147  366:invokevirtual   #435 <Method Object TokenBuffer$Segment.get(int)>
	//  148  369:astore          7
			if(obj instanceof Integer)
	//* 149  371:aload           7
	//* 150  373:instanceof      #446 <Class Integer>
	//* 151  376:ifeq            398
			{
				jsongenerator.writeNumber(((Integer)obj).intValue());
	//  152  379:aload_1         
	//  153  380:aload           7
	//  154  382:checkcast       #446 <Class Integer>
	//  155  385:invokevirtual   #449 <Method int Integer.intValue()>
	//  156  388:invokevirtual   #450 <Method void JsonGenerator.writeNumber(int)>
				obj = ((Object) (segment));
	//  157  391:aload           6
	//  158  393:astore          7
			} else
	//* 159  395:goto            29
			if(obj instanceof BigInteger)
	//* 160  398:aload           7
	//* 161  400:instanceof      #452 <Class BigInteger>
	//* 162  403:ifeq            422
			{
				jsongenerator.writeNumber((BigInteger)obj);
	//  163  406:aload_1         
	//  164  407:aload           7
	//  165  409:checkcast       #452 <Class BigInteger>
	//  166  412:invokevirtual   #453 <Method void JsonGenerator.writeNumber(BigInteger)>
				obj = ((Object) (segment));
	//  167  415:aload           6
	//  168  417:astore          7
			} else
	//* 169  419:goto            29
			if(obj instanceof Long)
	//* 170  422:aload           7
	//* 171  424:instanceof      #455 <Class Long>
	//* 172  427:ifeq            449
			{
				jsongenerator.writeNumber(((Long)obj).longValue());
	//  173  430:aload_1         
	//  174  431:aload           7
	//  175  433:checkcast       #455 <Class Long>
	//  176  436:invokevirtual   #458 <Method long Long.longValue()>
	//  177  439:invokevirtual   #459 <Method void JsonGenerator.writeNumber(long)>
				obj = ((Object) (segment));
	//  178  442:aload           6
	//  179  444:astore          7
			} else
	//* 180  446:goto            29
			if(obj instanceof Short)
	//* 181  449:aload           7
	//* 182  451:instanceof      #461 <Class Short>
	//* 183  454:ifeq            476
			{
				jsongenerator.writeNumber(((Short)obj).shortValue());
	//  184  457:aload_1         
	//  185  458:aload           7
	//  186  460:checkcast       #461 <Class Short>
	//  187  463:invokevirtual   #465 <Method short Short.shortValue()>
	//  188  466:invokevirtual   #468 <Method void JsonGenerator.writeNumber(short)>
				obj = ((Object) (segment));
	//  189  469:aload           6
	//  190  471:astore          7
			} else
	//* 191  473:goto            29
			{
				jsongenerator.writeNumber(((Number)obj).intValue());
	//  192  476:aload_1         
	//  193  477:aload           7
	//  194  479:checkcast       #470 <Class Number>
	//  195  482:invokevirtual   #471 <Method int Number.intValue()>
	//  196  485:invokevirtual   #450 <Method void JsonGenerator.writeNumber(int)>
				obj = ((Object) (segment));
	//  197  488:aload           6
	//  198  490:astore          7
			}
			break;

	//* 199  492:goto            29
		case 8: // '\b'
			obj = segment.get(i);
	//  200  495:aload           6
	//  201  497:iload_3         
	//  202  498:invokevirtual   #435 <Method Object TokenBuffer$Segment.get(int)>
	//  203  501:astore          7
			if(obj instanceof Double)
	//* 204  503:aload           7
	//* 205  505:instanceof      #473 <Class Double>
	//* 206  508:ifeq            530
			{
				jsongenerator.writeNumber(((Double)obj).doubleValue());
	//  207  511:aload_1         
	//  208  512:aload           7
	//  209  514:checkcast       #473 <Class Double>
	//  210  517:invokevirtual   #476 <Method double Double.doubleValue()>
	//  211  520:invokevirtual   #477 <Method void JsonGenerator.writeNumber(double)>
				obj = ((Object) (segment));
	//  212  523:aload           6
	//  213  525:astore          7
			} else
	//* 214  527:goto            29
			if(obj instanceof BigDecimal)
	//* 215  530:aload           7
	//* 216  532:instanceof      #479 <Class BigDecimal>
	//* 217  535:ifeq            554
			{
				jsongenerator.writeNumber((BigDecimal)obj);
	//  218  538:aload_1         
	//  219  539:aload           7
	//  220  541:checkcast       #479 <Class BigDecimal>
	//  221  544:invokevirtual   #480 <Method void JsonGenerator.writeNumber(BigDecimal)>
				obj = ((Object) (segment));
	//  222  547:aload           6
	//  223  549:astore          7
			} else
	//* 224  551:goto            29
			if(obj instanceof Float)
	//* 225  554:aload           7
	//* 226  556:instanceof      #482 <Class Float>
	//* 227  559:ifeq            581
			{
				jsongenerator.writeNumber(((Float)obj).floatValue());
	//  228  562:aload_1         
	//  229  563:aload           7
	//  230  565:checkcast       #482 <Class Float>
	//  231  568:invokevirtual   #485 <Method float Float.floatValue()>
	//  232  571:invokevirtual   #486 <Method void JsonGenerator.writeNumber(float)>
				obj = ((Object) (segment));
	//  233  574:aload           6
	//  234  576:astore          7
			} else
	//* 235  578:goto            29
			if(obj == null)
	//* 236  581:aload           7
	//* 237  583:ifnonnull       597
			{
				jsongenerator.writeNull();
	//  238  586:aload_1         
	//  239  587:invokevirtual   #487 <Method void JsonGenerator.writeNull()>
				obj = ((Object) (segment));
	//  240  590:aload           6
	//  241  592:astore          7
			} else
	//* 242  594:goto            29
			if(obj instanceof String)
	//* 243  597:aload           7
	//* 244  599:instanceof      #127 <Class String>
	//* 245  602:ifeq            621
			{
				jsongenerator.writeNumber((String)obj);
	//  246  605:aload_1         
	//  247  606:aload           7
	//  248  608:checkcast       #127 <Class String>
	//  249  611:invokevirtual   #489 <Method void JsonGenerator.writeNumber(String)>
				obj = ((Object) (segment));
	//  250  614:aload           6
	//  251  616:astore          7
			} else
	//* 252  618:goto            29
			{
				throw new JsonGenerationException(String.format("Unrecognized value type for VALUE_NUMBER_FLOAT: %s, can not serialize", new Object[] {
					obj.getClass().getName()
				}), jsongenerator);
	//  253  621:new             #491 <Class JsonGenerationException>
	//  254  624:dup             
	//  255  625:ldc2            #493 <String "Unrecognized value type for VALUE_NUMBER_FLOAT: %s, can not serialize">
	//  256  628:iconst_1        
	//  257  629:anewarray       Object[]
	//  258  632:dup             
	//  259  633:iconst_0        
	//  260  634:aload           7
	//  261  636:invokevirtual   #499 <Method Class Object.getClass()>
	//  262  639:invokevirtual   #504 <Method String Class.getName()>
	//  263  642:aastore         
	//  264  643:invokestatic    #508 <Method String String.format(String, Object[])>
	//  265  646:aload_1         
	//  266  647:invokespecial   #511 <Method void JsonGenerationException(String, JsonGenerator)>
	//  267  650:athrow          
			}
			break;

		case 9: // '\t'
			jsongenerator.writeBoolean(true);
	//  268  651:aload_1         
	//  269  652:iconst_1        
	//  270  653:invokevirtual   #512 <Method void JsonGenerator.writeBoolean(boolean)>
			obj = ((Object) (segment));
	//  271  656:aload           6
	//  272  658:astore          7
			break;

	//* 273  660:goto            29
		case 10: // '\n'
			jsongenerator.writeBoolean(false);
	//  274  663:aload_1         
	//  275  664:iconst_0        
	//  276  665:invokevirtual   #512 <Method void JsonGenerator.writeBoolean(boolean)>
			obj = ((Object) (segment));
	//  277  668:aload           6
	//  278  670:astore          7
			break;

	//* 279  672:goto            29
		case 11: // '\013'
			jsongenerator.writeNull();
	//  280  675:aload_1         
	//  281  676:invokevirtual   #487 <Method void JsonGenerator.writeNull()>
			obj = ((Object) (segment));
	//  282  679:aload           6
	//  283  681:astore          7
			break;

	//* 284  683:goto            29
		case 12: // '\f'
			obj = segment.get(i);
	//  285  686:aload           6
	//  286  688:iload_3         
	//  287  689:invokevirtual   #435 <Method Object TokenBuffer$Segment.get(int)>
	//  288  692:astore          7
			if(obj instanceof RawValue)
	//* 289  694:aload           7
	//* 290  696:instanceof      #514 <Class RawValue>
	//* 291  699:ifeq            718
			{
				((RawValue)obj).serialize(jsongenerator);
	//  292  702:aload           7
	//  293  704:checkcast       #514 <Class RawValue>
	//  294  707:aload_1         
	//  295  708:invokevirtual   #516 <Method void RawValue.serialize(JsonGenerator)>
				obj = ((Object) (segment));
	//  296  711:aload           6
	//  297  713:astore          7
			} else
	//* 298  715:goto            29
			{
				jsongenerator.writeObject(obj);
	//  299  718:aload_1         
	//  300  719:aload           7
	//  301  721:invokevirtual   #517 <Method void JsonGenerator.writeObject(Object)>
				obj = ((Object) (segment));
	//  302  724:aload           6
	//  303  726:astore          7
			}
			break;
		}
		if(true) goto _L7; else goto _L6
_L6:
	//* 304  728:goto            29
	}

	public JsonGenerator setCodec(ObjectCodec objectcodec)
	{
		_objectCodec = objectcodec;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field ObjectCodec _objectCodec>
		return ((JsonGenerator) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public JsonGenerator setFeatureMask(int i)
	{
		_generatorFeatures = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field int _generatorFeatures>
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
		JsonToken jsontoken;
		stringbuilder = new StringBuilder();
	//    0    0:new             #121 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #375 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("[TokenBuffer: ");
	//    4    8:aload_3         
	//    5    9:ldc2            #523 <String "[TokenBuffer: ">
	//    6   12:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		jsonparser = asParser();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #201 <Method JsonParser asParser()>
	//   10   20:astore          4
		i = 0;
	//   11   22:iconst_0        
	//   12   23:istore_2        
		if(_hasNativeTypeIds || _hasNativeObjectIds)
	//*  13   24:aload_0         
	//*  14   25:getfield        #84  <Field boolean _hasNativeTypeIds>
	//*  15   28:ifne            38
	//*  16   31:aload_0         
	//*  17   32:getfield        #89  <Field boolean _hasNativeObjectIds>
	//*  18   35:ifeq            91
			flag = true;
	//   19   38:iconst_1        
	//   20   39:istore_1        
		else
	//*  21   40:aload           4
	//*  22   42:invokevirtual   #205 <Method JsonToken JsonParser.nextToken()>
	//*  23   45:astore          5
	//*  24   47:aload           5
	//*  25   49:ifnonnull       96
	//*  26   52:iload_2         
	//*  27   53:bipush          100
	//*  28   55:icmplt          79
	//*  29   58:aload_3         
	//*  30   59:ldc2            #525 <String " ... (truncated ">
	//*  31   62:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  32   65:iload_2         
	//*  33   66:bipush          100
	//*  34   68:isub            
	//*  35   69:invokevirtual   #528 <Method StringBuilder StringBuilder.append(int)>
	//*  36   72:ldc2            #530 <String " entries)">
	//*  37   75:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  38   78:pop             
	//*  39   79:aload_3         
	//*  40   80:bipush          93
	//*  41   82:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//*  42   85:pop             
	//*  43   86:aload_3         
	//*  44   87:invokevirtual   #383 <Method String StringBuilder.toString()>
	//*  45   90:areturn         
			flag = false;
	//   46   91:iconst_0        
	//   47   92:istore_1        
_L1:
		try
		{
			jsontoken = jsonparser.nextToken();
		}
	//*  48   93:goto            40
	//*  49   96:iload_1         
	//*  50   97:ifeq            105
	//*  51  100:aload_0         
	//*  52  101:aload_3         
	//*  53  102:invokespecial   #532 <Method void _appendNativeIds(StringBuilder)>
	//*  54  105:iload_2         
	//*  55  106:bipush          100
	//*  56  108:icmpge          165
	//*  57  111:iload_2         
	//*  58  112:ifle            123
	//*  59  115:aload_3         
	//*  60  116:ldc2            #534 <String ", ">
	//*  61  119:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  62  122:pop             
	//*  63  123:aload_3         
	//*  64  124:aload           5
	//*  65  126:invokevirtual   #535 <Method String JsonToken.toString()>
	//*  66  129:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  67  132:pop             
	//*  68  133:aload           5
	//*  69  135:getstatic       #358 <Field JsonToken JsonToken.FIELD_NAME>
	//*  70  138:if_acmpne       165
	//*  71  141:aload_3         
	//*  72  142:bipush          40
	//*  73  144:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//*  74  147:pop             
	//*  75  148:aload_3         
	//*  76  149:aload           4
	//*  77  151:invokevirtual   #263 <Method String JsonParser.getCurrentName()>
	//*  78  154:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  79  157:pop             
	//*  80  158:aload_3         
	//*  81  159:bipush          41
	//*  82  161:invokevirtual   #134 <Method StringBuilder StringBuilder.append(char)>
	//*  83  164:pop             
	//*  84  165:iload_2         
	//*  85  166:iconst_1        
	//*  86  167:iadd            
	//*  87  168:istore_2        
	//*  88  169:goto            40
		catch(IOException ioexception)
	//*  89  172:astore_3        
		{
			throw new IllegalStateException(((Throwable) (ioexception)));
	//   90  173:new             #537 <Class IllegalStateException>
	//   91  176:dup             
	//   92  177:aload_3         
	//   93  178:invokespecial   #540 <Method void IllegalStateException(Throwable)>
	//   94  181:athrow          
		}
		if(jsontoken == null)
		{
			if(i >= 100)
				stringbuilder.append(" ... (truncated ").append(i - 100).append(" entries)");
			stringbuilder.append(']');
			return stringbuilder.toString();
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_105;
		_appendNativeIds(stringbuilder);
		if(i >= 100)
			break MISSING_BLOCK_LABEL_165;
		if(i <= 0)
			break MISSING_BLOCK_LABEL_123;
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

	public JsonGenerator useDefaultPrettyPrinter()
	{
		return ((JsonGenerator) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #550 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #185 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #553 <Method void UnsupportedOperationException()>
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
	//    8   11:invokestatic    #560 <Method void System.arraycopy(Object, int, Object, int, int)>
		writeObject(((Object) (base64variant)));
	//    9   14:aload_0         
	//   10   15:aload_1         
	//   11   16:invokevirtual   #354 <Method void writeObject(Object)>
	//   12   19:return          
	}

	public void writeBoolean(boolean flag)
		throws IOException
	{
		JsonToken jsontoken;
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
			jsontoken = JsonToken.VALUE_TRUE;
	//    2    4:getstatic       #563 <Field JsonToken JsonToken.VALUE_TRUE>
	//    3    7:astore_2        
		else
	//*   4    8:aload_0         
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #565 <Method void _appendValue(JsonToken)>
	//*   7   13:return          
			jsontoken = JsonToken.VALUE_FALSE;
	//    8   14:getstatic       #568 <Field JsonToken JsonToken.VALUE_FALSE>
	//    9   17:astore_2        
		_appendValue(jsontoken);
	//*  10   18:goto            8
	}

	public final void writeEndArray()
		throws IOException
	{
		_append(JsonToken.END_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #363 <Field JsonToken JsonToken.END_ARRAY>
	//    2    4:invokevirtual   #570 <Method void _append(JsonToken)>
		JsonWriteContext jsonwritecontext = _writeContext.getParent();
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field JsonWriteContext _writeContext>
	//    5   11:invokevirtual   #573 <Method JsonWriteContext JsonWriteContext.getParent()>
	//    6   14:astore_1        
		if(jsonwritecontext != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			_writeContext = jsonwritecontext;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #71  <Field JsonWriteContext _writeContext>
	//   12   24:return          
	}

	public final void writeEndObject()
		throws IOException
	{
		_append(JsonToken.END_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #366 <Field JsonToken JsonToken.END_OBJECT>
	//    2    4:invokevirtual   #570 <Method void _append(JsonToken)>
		JsonWriteContext jsonwritecontext = _writeContext.getParent();
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field JsonWriteContext _writeContext>
	//    5   11:invokevirtual   #573 <Method JsonWriteContext JsonWriteContext.getParent()>
	//    6   14:astore_1        
		if(jsonwritecontext != null)
	//*   7   15:aload_1         
	//*   8   16:ifnull          24
			_writeContext = jsonwritecontext;
	//    9   19:aload_0         
	//   10   20:aload_1         
	//   11   21:putfield        #71  <Field JsonWriteContext _writeContext>
	//   12   24:return          
	}

	public void writeFieldName(SerializableString serializablestring)
		throws IOException
	{
		_append(JsonToken.FIELD_NAME, ((Object) (serializablestring)));
	//    0    0:aload_0         
	//    1    1:getstatic       #358 <Field JsonToken JsonToken.FIELD_NAME>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #575 <Method void _append(JsonToken, Object)>
		_writeContext.writeFieldName(serializablestring.getValue());
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field JsonWriteContext _writeContext>
	//    6   12:aload_1         
	//    7   13:invokeinterface #578 <Method String SerializableString.getValue()>
	//    8   18:invokevirtual   #581 <Method int JsonWriteContext.writeFieldName(String)>
	//    9   21:pop             
	//   10   22:return          
	}

	public final void writeFieldName(String s)
		throws IOException
	{
		_append(JsonToken.FIELD_NAME, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getstatic       #358 <Field JsonToken JsonToken.FIELD_NAME>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #575 <Method void _append(JsonToken, Object)>
		_writeContext.writeFieldName(s);
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field JsonWriteContext _writeContext>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #581 <Method int JsonWriteContext.writeFieldName(String)>
	//    8   16:pop             
	//    9   17:return          
	}

	public void writeNull()
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NULL);
	//    0    0:aload_0         
	//    1    1:getstatic       #584 <Field JsonToken JsonToken.VALUE_NULL>
	//    2    4:invokevirtual   #565 <Method void _appendValue(JsonToken)>
	//    3    7:return          
	}

	public void writeNumber(double d)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_FLOAT, ((Object) (Double.valueOf(d))));
	//    0    0:aload_0         
	//    1    1:getstatic       #587 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    2    4:dload_1         
	//    3    5:invokestatic    #590 <Method Double Double.valueOf(double)>
	//    4    8:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
	}

	public void writeNumber(float f)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_FLOAT, ((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getstatic       #587 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    2    4:fload_1         
	//    3    5:invokestatic    #595 <Method Float Float.valueOf(float)>
	//    4    8:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
	}

	public void writeNumber(int i)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_INT, ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getstatic       #598 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    2    4:iload_1         
	//    3    5:invokestatic    #601 <Method Integer Integer.valueOf(int)>
	//    4    8:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
	}

	public void writeNumber(long l)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_INT, ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getstatic       #598 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    2    4:lload_1         
	//    3    5:invokestatic    #604 <Method Long Long.valueOf(long)>
	//    4    8:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
	//    5   11:return          
	}

	public void writeNumber(String s)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_FLOAT, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getstatic       #587 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
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
	//    3    5:invokevirtual   #347 <Method void writeNull()>
			return;
	//    4    8:return          
		} else
		{
			_appendValue(JsonToken.VALUE_NUMBER_FLOAT, ((Object) (bigdecimal)));
	//    5    9:aload_0         
	//    6   10:getstatic       #587 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
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
	//    3    5:invokevirtual   #347 <Method void writeNull()>
			return;
	//    4    8:return          
		} else
		{
			_appendValue(JsonToken.VALUE_NUMBER_INT, ((Object) (biginteger)));
	//    5    9:aload_0         
	//    6   10:getstatic       #598 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
			return;
	//    9   17:return          
		}
	}

	public void writeNumber(short word0)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_NUMBER_INT, ((Object) (Short.valueOf(word0))));
	//    0    0:aload_0         
	//    1    1:getstatic       #598 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//    2    4:iload_1         
	//    3    5:invokestatic    #607 <Method Short Short.valueOf(short)>
	//    4    8:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
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
	//    3    5:invokevirtual   #347 <Method void writeNull()>
			return;
	//    4    8:return          
		}
		if(obj.getClass() == [B || (obj instanceof RawValue))
	//*   5    9:aload_1         
	//*   6   10:invokevirtual   #499 <Method Class Object.getClass()>
	//*   7   13:ldc2            #609 <Class byte[]>
	//*   8   16:if_acmpeq       26
	//*   9   19:aload_1         
	//*  10   20:instanceof      #514 <Class RawValue>
	//*  11   23:ifeq            35
		{
			_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
	//   12   26:aload_0         
	//   13   27:getstatic       #612 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//   14   30:aload_1         
	//   15   31:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
			return;
	//   16   34:return          
		}
		if(_objectCodec == null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #61  <Field ObjectCodec _objectCodec>
	//*  19   39:ifnonnull       51
		{
			_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, obj);
	//   20   42:aload_0         
	//   21   43:getstatic       #612 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//   22   46:aload_1         
	//   23   47:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
			return;
	//   24   50:return          
		} else
		{
			_objectCodec.writeValue(((JsonGenerator) (this)), obj);
	//   25   51:aload_0         
	//   26   52:getfield        #61  <Field ObjectCodec _objectCodec>
	//   27   55:aload_0         
	//   28   56:aload_1         
	//   29   57:invokevirtual   #617 <Method void ObjectCodec.writeValue(JsonGenerator, Object)>
			return;
	//   30   60:return          
		}
	}

	public void writeObjectId(Object obj)
	{
		_objectId = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #153 <Field Object _objectId>
		_hasNativeId = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #53  <Field boolean _hasNativeId>
	//    6   10:return          
	}

	public void writeRaw(char c)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #621 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRaw(SerializableString serializablestring)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #621 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRaw(String s)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #621 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRaw(String s, int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #621 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRaw(char ac[], int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #621 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRawUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #621 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
	}

	public void writeRawValue(String s)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, ((Object) (new RawValue(s))));
	//    0    0:aload_0         
	//    1    1:getstatic       #612 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    2    4:new             #514 <Class RawValue>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #626 <Method void RawValue(String)>
	//    6   12:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
	//    7   15:return          
	}

	public void writeRawValue(String s, int i, int j)
		throws IOException
	{
		String s1;
label0:
		{
			if(i <= 0)
	//*   0    0:iload_2         
	//*   1    1:ifgt            15
			{
				s1 = s;
	//    2    4:aload_1         
	//    3    5:astore          4
				if(j == s.length())
					break label0;
	//    4    7:iload_3         
	//    5    8:aload_1         
	//    6    9:invokevirtual   #629 <Method int String.length()>
	//    7   12:icmpeq          25
			}
			s1 = s.substring(i, i + j);
	//    8   15:aload_1         
	//    9   16:iload_2         
	//   10   17:iload_2         
	//   11   18:iload_3         
	//   12   19:iadd            
	//   13   20:invokevirtual   #633 <Method String String.substring(int, int)>
	//   14   23:astore          4
		}
		_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, ((Object) (new RawValue(s1))));
	//   15   25:aload_0         
	//   16   26:getstatic       #612 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//   17   29:new             #514 <Class RawValue>
	//   18   32:dup             
	//   19   33:aload           4
	//   20   35:invokespecial   #626 <Method void RawValue(String)>
	//   21   38:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
	//   22   41:return          
	}

	public void writeRawValue(char ac[], int i, int j)
		throws IOException
	{
		_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, ((Object) (new String(ac, i, j))));
	//    0    0:aload_0         
	//    1    1:getstatic       #612 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//    2    4:new             #127 <Class String>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:iload_3         
	//    7   11:invokespecial   #635 <Method void String(char[], int, int)>
	//    8   14:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
	//    9   17:return          
	}

	public final void writeStartArray()
		throws IOException
	{
		_append(JsonToken.START_ARRAY);
	//    0    0:aload_0         
	//    1    1:getstatic       #638 <Field JsonToken JsonToken.START_ARRAY>
	//    2    4:invokevirtual   #570 <Method void _append(JsonToken)>
		_writeContext = _writeContext.createChildArrayContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #641 <Method JsonWriteContext JsonWriteContext.createChildArrayContext()>
	//    7   15:putfield        #71  <Field JsonWriteContext _writeContext>
	//    8   18:return          
	}

	public final void writeStartObject()
		throws IOException
	{
		_append(JsonToken.START_OBJECT);
	//    0    0:aload_0         
	//    1    1:getstatic       #644 <Field JsonToken JsonToken.START_OBJECT>
	//    2    4:invokevirtual   #570 <Method void _append(JsonToken)>
		_writeContext = _writeContext.createChildObjectContext();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #71  <Field JsonWriteContext _writeContext>
	//    6   12:invokevirtual   #647 <Method JsonWriteContext JsonWriteContext.createChildObjectContext()>
	//    7   15:putfield        #71  <Field JsonWriteContext _writeContext>
	//    8   18:return          
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
	//    3    5:invokevirtual   #347 <Method void writeNull()>
			return;
	//    4    8:return          
		} else
		{
			_appendValue(JsonToken.VALUE_STRING, ((Object) (serializablestring)));
	//    5    9:aload_0         
	//    6   10:getstatic       #650 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
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
	//    3    5:invokevirtual   #347 <Method void writeNull()>
			return;
	//    4    8:return          
		} else
		{
			_appendValue(JsonToken.VALUE_STRING, ((Object) (s)));
	//    5    9:aload_0         
	//    6   10:getstatic       #650 <Field JsonToken JsonToken.VALUE_STRING>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
			return;
	//    9   17:return          
		}
	}

	public void writeString(char ac[], int i, int j)
		throws IOException
	{
		writeString(new String(ac, i, j));
	//    0    0:aload_0         
	//    1    1:new             #127 <Class String>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:iload_2         
	//    5    7:iload_3         
	//    6    8:invokespecial   #635 <Method void String(char[], int, int)>
	//    7   11:invokevirtual   #288 <Method void writeString(String)>
	//    8   14:return          
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
	//    3    5:invokevirtual   #347 <Method void writeNull()>
			return;
	//    4    8:return          
		}
		if(_objectCodec == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #61  <Field ObjectCodec _objectCodec>
	//*   7   13:ifnonnull       25
		{
			_appendValue(JsonToken.VALUE_EMBEDDED_OBJECT, ((Object) (treenode)));
	//    8   16:aload_0         
	//    9   17:getstatic       #612 <Field JsonToken JsonToken.VALUE_EMBEDDED_OBJECT>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #592 <Method void _appendValue(JsonToken, Object)>
			return;
	//   12   24:return          
		} else
		{
			_objectCodec.writeTree(((JsonGenerator) (this)), treenode);
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field ObjectCodec _objectCodec>
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #655 <Method void ObjectCodec.writeTree(JsonGenerator, TreeNode)>
			return;
	//   18   34:return          
		}
	}

	public void writeTypeId(Object obj)
	{
		_typeId = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field Object _typeId>
		_hasNativeId = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #53  <Field boolean _hasNativeId>
	//    6   10:return          
	}

	public void writeUTF8String(byte abyte0[], int i, int j)
		throws IOException
	{
		_reportUnsupportedOperation();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #621 <Method void _reportUnsupportedOperation()>
	//    2    4:return          
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
	protected Object _typeId;
	protected JsonWriteContext _writeContext;

	static 
	{
	//    0    0:invokestatic    #41  <Method int com.fasterxml.jackson.core.JsonGenerator$Feature.collectDefaults()>
	//    1    3:putstatic       #43  <Field int DEFAULT_GENERATOR_FEATURES>
	//*   2    6:return          
	}
}
