// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.json.*;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

// Referenced classes of package com.fasterxml.jackson.core.base:
//			ParserMinimalBase

public abstract class ParserBase extends ParserMinimalBase
{

	protected ParserBase(IOContext iocontext, int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #49  <Method void ParserMinimalBase(int)>
		_currInputRow = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #51  <Field int _currInputRow>
		_tokenInputRow = 1;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #53  <Field int _tokenInputRow>
		_numTypesValid = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #55  <Field int _numTypesValid>
		_ioContext = iocontext;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #57  <Field IOContext _ioContext>
		_textBuffer = iocontext.constructTextBuffer();
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokevirtual   #63  <Method TextBuffer IOContext.constructTextBuffer()>
	//   18   30:putfield        #65  <Field TextBuffer _textBuffer>
		if(com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i))
	//*  19   33:getstatic       #71  <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.STRICT_DUPLICATE_DETECTION>
	//*  20   36:iload_2         
	//*  21   37:invokevirtual   #75  <Method boolean com.fasterxml.jackson.core.JsonParser$Feature.enabledIn(int)>
	//*  22   40:ifeq            51
			iocontext = ((IOContext) (DupDetector.rootDetector(((JsonParser) (this)))));
	//   23   43:aload_0         
	//   24   44:invokestatic    #81  <Method DupDetector DupDetector.rootDetector(JsonParser)>
	//   25   47:astore_1        
		else
	//*  26   48:goto            53
			iocontext = null;
	//   27   51:aconst_null     
	//   28   52:astore_1        
		_parsingContext = JsonReadContext.createRootContext(((DupDetector) (iocontext)));
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokestatic    #87  <Method JsonReadContext JsonReadContext.createRootContext(DupDetector)>
	//   32   58:putfield        #89  <Field JsonReadContext _parsingContext>
	//   33   61:return          
	}

	private void _parseSlowFloat(int i)
		throws IOException
	{
		if(i == 16)
	//*   0    0:iload_1         
	//*   1    1:bipush          16
	//*   2    3:icmpne          24
			try
			{
				_numberBigDecimal = _textBuffer.contentsAsDecimal();
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #65  <Field TextBuffer _textBuffer>
	//    6   11:invokevirtual   #101 <Method BigDecimal TextBuffer.contentsAsDecimal()>
	//    7   14:putfield        #103 <Field BigDecimal _numberBigDecimal>
				_numTypesValid = 16;
	//    8   17:aload_0         
	//    9   18:bipush          16
	//   10   20:putfield        #55  <Field int _numTypesValid>
				return;
	//   11   23:return          
			}
	//*  12   24:aload_0         
	//*  13   25:aload_0         
	//*  14   26:getfield        #65  <Field TextBuffer _textBuffer>
	//*  15   29:invokevirtual   #107 <Method double TextBuffer.contentsAsDouble()>
	//*  16   32:putfield        #109 <Field double _numberDouble>
	//*  17   35:aload_0         
	//*  18   36:bipush          8
	//*  19   38:putfield        #55  <Field int _numTypesValid>
	//*  20   41:return          
			catch(NumberFormatException numberformatexception)
	//*  21   42:astore_2        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   43:new             #111 <Class StringBuilder>
	//   23   46:dup             
	//   24   47:invokespecial   #114 <Method void StringBuilder()>
	//   25   50:astore_3        
				stringbuilder.append("Malformed numeric value '");
	//   26   51:aload_3         
	//   27   52:ldc1            #116 <String "Malformed numeric value '">
	//   28   54:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
				stringbuilder.append(_textBuffer.contentsAsString());
	//   30   58:aload_3         
	//   31   59:aload_0         
	//   32   60:getfield        #65  <Field TextBuffer _textBuffer>
	//   33   63:invokevirtual   #124 <Method String TextBuffer.contentsAsString()>
	//   34   66:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   35   69:pop             
				stringbuilder.append("'");
	//   36   70:aload_3         
	//   37   71:ldc1            #126 <String "'">
	//   38   73:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   39   76:pop             
				_wrapError(stringbuilder.toString(), ((Throwable) (numberformatexception)));
	//   40   77:aload_0         
	//   41   78:aload_3         
	//   42   79:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   43   82:aload_2         
	//   44   83:invokevirtual   #133 <Method void _wrapError(String, Throwable)>
				return;
	//   45   86:return          
			}
		_numberDouble = _textBuffer.contentsAsDouble();
		_numTypesValid = 8;
		return;
	}

	private void _parseSlowInt(int i)
		throws IOException
	{
		String s = _textBuffer.contentsAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #124 <Method String TextBuffer.contentsAsString()>
	//    3    7:astore          4
		int j;
		int k;
		char ac[];
		try
		{
			k = _intLength;
	//    4    9:aload_0         
	//    5   10:getfield        #137 <Field int _intLength>
	//    6   13:istore_3        
			ac = _textBuffer.getTextBuffer();
	//    7   14:aload_0         
	//    8   15:getfield        #65  <Field TextBuffer _textBuffer>
	//    9   18:invokevirtual   #141 <Method char[] TextBuffer.getTextBuffer()>
	//   10   21:astore          5
			j = _textBuffer.getTextOffset();
	//   11   23:aload_0         
	//   12   24:getfield        #65  <Field TextBuffer _textBuffer>
	//   13   27:invokevirtual   #145 <Method int TextBuffer.getTextOffset()>
	//   14   30:istore_2        
		}
	//*  15   31:iload_2         
	//*  16   32:istore_1        
	//*  17   33:aload_0         
	//*  18   34:getfield        #147 <Field boolean _numberNegative>
	//*  19   37:ifeq            44
	//*  20   40:iload_2         
	//*  21   41:iconst_1        
	//*  22   42:iadd            
	//*  23   43:istore_1        
	//*  24   44:aload           5
	//*  25   46:iload_1         
	//*  26   47:iload_3         
	//*  27   48:aload_0         
	//*  28   49:getfield        #147 <Field boolean _numberNegative>
	//*  29   52:invokestatic    #153 <Method boolean NumberInput.inLongRange(char[], int, int, boolean)>
	//*  30   55:ifeq            73
	//*  31   58:aload_0         
	//*  32   59:aload           4
	//*  33   61:invokestatic    #159 <Method long Long.parseLong(String)>
	//*  34   64:putfield        #161 <Field long _numberLong>
	//*  35   67:aload_0         
	//*  36   68:iconst_2        
	//*  37   69:putfield        #55  <Field int _numTypesValid>
	//*  38   72:return          
	//*  39   73:aload_0         
	//*  40   74:new             #163 <Class BigInteger>
	//*  41   77:dup             
	//*  42   78:aload           4
	//*  43   80:invokespecial   #166 <Method void BigInteger(String)>
	//*  44   83:putfield        #168 <Field BigInteger _numberBigInt>
	//*  45   86:aload_0         
	//*  46   87:iconst_4        
	//*  47   88:putfield        #55  <Field int _numTypesValid>
	//*  48   91:return          
		catch(NumberFormatException numberformatexception)
	//*  49   92:astore          5
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   50   94:new             #111 <Class StringBuilder>
	//   51   97:dup             
	//   52   98:invokespecial   #114 <Method void StringBuilder()>
	//   53  101:astore          6
			stringbuilder.append("Malformed numeric value '");
	//   54  103:aload           6
	//   55  105:ldc1            #116 <String "Malformed numeric value '">
	//   56  107:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   57  110:pop             
			stringbuilder.append(s);
	//   58  111:aload           6
	//   59  113:aload           4
	//   60  115:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   61  118:pop             
			stringbuilder.append("'");
	//   62  119:aload           6
	//   63  121:ldc1            #126 <String "'">
	//   64  123:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
			_wrapError(stringbuilder.toString(), ((Throwable) (numberformatexception)));
	//   66  127:aload_0         
	//   67  128:aload           6
	//   68  130:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   69  133:aload           5
	//   70  135:invokevirtual   #133 <Method void _wrapError(String, Throwable)>
			return;
	//   71  138:return          
		}
		i = j;
		if(_numberNegative)
			i = j + 1;
		if(NumberInput.inLongRange(ac, i, k, _numberNegative))
		{
			_numberLong = Long.parseLong(s);
			_numTypesValid = 2;
			return;
		}
		_numberBigInt = new BigInteger(s);
		_numTypesValid = 4;
		return;
	}

	protected static int[] growArrayBy(int ai[], int i)
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return new int[i];
	//    2    4:iload_1         
	//    3    5:newarray        int[]
	//    4    7:areturn         
		else
			return Arrays.copyOf(ai, ai.length + i);
	//    5    8:aload_0         
	//    6    9:aload_0         
	//    7   10:arraylength     
	//    8   11:iload_1         
	//    9   12:iadd            
	//   10   13:invokestatic    #175 <Method int[] Arrays.copyOf(int[], int)>
	//   11   16:areturn         
	}

	protected void _checkStdFeatureChanges(int i, int j)
	{
		int k = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
	//    0    0:getstatic       #71  <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.STRICT_DUPLICATE_DETECTION>
	//    1    3:invokevirtual   #180 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    2    6:istore_3        
		if((j & k) != 0 && (i & k) != 0)
	//*   3    7:iload_2         
	//*   4    8:iload_3         
	//*   5    9:iand            
	//*   6   10:ifeq            57
	//*   7   13:iload_1         
	//*   8   14:iload_3         
	//*   9   15:iand            
	//*  10   16:ifeq            57
		{
			if(_parsingContext.getDupDetector() == null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #89  <Field JsonReadContext _parsingContext>
	//*  13   23:invokevirtual   #184 <Method DupDetector JsonReadContext.getDupDetector()>
	//*  14   26:ifnonnull       45
			{
				_parsingContext = _parsingContext.withDupDetector(DupDetector.rootDetector(((JsonParser) (this))));
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #89  <Field JsonReadContext _parsingContext>
	//   18   34:aload_0         
	//   19   35:invokestatic    #81  <Method DupDetector DupDetector.rootDetector(JsonParser)>
	//   20   38:invokevirtual   #187 <Method JsonReadContext JsonReadContext.withDupDetector(DupDetector)>
	//   21   41:putfield        #89  <Field JsonReadContext _parsingContext>
				return;
	//   22   44:return          
			}
			_parsingContext = _parsingContext.withDupDetector(((DupDetector) (null)));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #89  <Field JsonReadContext _parsingContext>
	//   26   50:aconst_null     
	//   27   51:invokevirtual   #187 <Method JsonReadContext JsonReadContext.withDupDetector(DupDetector)>
	//   28   54:putfield        #89  <Field JsonReadContext _parsingContext>
		}
	//   29   57:return          
	}

	protected abstract void _closeInput()
		throws IOException;

	protected final int _decodeBase64Escape(Base64Variant base64variant, char c, int i)
		throws IOException
	{
		if(c == '\\')
	//*   0    0:iload_2         
	//*   1    1:bipush          92
	//*   2    3:icmpne          47
		{
			char c1 = _decodeEscaped();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #194 <Method char _decodeEscaped()>
	//    5   10:istore          4
			if(c1 <= ' ' && i == 0)
	//*   6   12:iload           4
	//*   7   14:bipush          32
	//*   8   16:icmpgt          25
	//*   9   19:iload_3         
	//*  10   20:ifne            25
				return -1;
	//   11   23:iconst_m1       
	//   12   24:ireturn         
			c = ((char) (base64variant.decodeBase64Char(c1)));
	//   13   25:aload_1         
	//   14   26:iload           4
	//   15   28:invokevirtual   #200 <Method int Base64Variant.decodeBase64Char(char)>
	//   16   31:istore_2        
			if(c >= 0)
	//*  17   32:iload_2         
	//*  18   33:iflt            38
				return ((int) (c));
	//   19   36:iload_2         
	//   20   37:ireturn         
			else
				throw reportInvalidBase64Char(base64variant, ((int) (c1)), i);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:iload           4
	//   24   42:iload_3         
	//   25   43:invokevirtual   #204 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//   26   46:athrow          
		} else
		{
			throw reportInvalidBase64Char(base64variant, ((int) (c)), i);
	//   27   47:aload_0         
	//   28   48:aload_1         
	//   29   49:iload_2         
	//   30   50:iload_3         
	//   31   51:invokevirtual   #204 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//   32   54:athrow          
		}
	}

	protected final int _decodeBase64Escape(Base64Variant base64variant, int i, int j)
		throws IOException
	{
		if(i == 92)
	//*   0    0:iload_2         
	//*   1    1:bipush          92
	//*   2    3:icmpne          46
		{
			i = ((int) (_decodeEscaped()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #194 <Method char _decodeEscaped()>
	//    5   10:istore_2        
			if(i <= 32 && j == 0)
	//*   6   11:iload_2         
	//*   7   12:bipush          32
	//*   8   14:icmpgt          23
	//*   9   17:iload_3         
	//*  10   18:ifne            23
				return -1;
	//   11   21:iconst_m1       
	//   12   22:ireturn         
			int k = base64variant.decodeBase64Char(i);
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokevirtual   #208 <Method int Base64Variant.decodeBase64Char(int)>
	//   16   28:istore          4
			if(k >= 0)
	//*  17   30:iload           4
	//*  18   32:iflt            38
				return k;
	//   19   35:iload           4
	//   20   37:ireturn         
			else
				throw reportInvalidBase64Char(base64variant, i, j);
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:iload_2         
	//   24   41:iload_3         
	//   25   42:invokevirtual   #204 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//   26   45:athrow          
		} else
		{
			throw reportInvalidBase64Char(base64variant, i, j);
	//   27   46:aload_0         
	//   28   47:aload_1         
	//   29   48:iload_2         
	//   30   49:iload_3         
	//   31   50:invokevirtual   #204 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//   32   53:athrow          
		}
	}

	protected char _decodeEscaped()
		throws IOException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #210 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #211 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	protected final int _eofAsNextChar()
		throws JsonParseException
	{
		_handleEOF();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #217 <Method void _handleEOF()>
		return -1;
	//    2    4:iconst_m1       
	//    3    5:ireturn         
	}

	protected void _finishString()
		throws IOException
	{
	//    0    0:return          
	}

	public ByteArrayBuilder _getByteArrayBuilder()
	{
		ByteArrayBuilder bytearraybuilder = _byteArrayBuilder;
	//    0    0:aload_0         
	//    1    1:getfield        #222 <Field ByteArrayBuilder _byteArrayBuilder>
	//    2    4:astore_1        
		if(bytearraybuilder == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       23
			_byteArrayBuilder = new ByteArrayBuilder();
	//    5    9:aload_0         
	//    6   10:new             #224 <Class ByteArrayBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #225 <Method void ByteArrayBuilder()>
	//    9   17:putfield        #222 <Field ByteArrayBuilder _byteArrayBuilder>
		else
	//*  10   20:goto            27
			bytearraybuilder.reset();
	//   11   23:aload_1         
	//   12   24:invokevirtual   #228 <Method void ByteArrayBuilder.reset()>
		return _byteArrayBuilder;
	//   13   27:aload_0         
	//   14   28:getfield        #222 <Field ByteArrayBuilder _byteArrayBuilder>
	//   15   31:areturn         
	}

	protected Object _getSourceReference()
	{
		if(com.fasterxml.jackson.core.JsonParser.Feature.INCLUDE_SOURCE_IN_LOCATION.enabledIn(_features))
	//*   0    0:getstatic       #233 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.INCLUDE_SOURCE_IN_LOCATION>
	//*   1    3:aload_0         
	//*   2    4:getfield        #236 <Field int _features>
	//*   3    7:invokevirtual   #75  <Method boolean com.fasterxml.jackson.core.JsonParser$Feature.enabledIn(int)>
	//*   4   10:ifeq            21
			return _ioContext.getSourceReference();
	//    5   13:aload_0         
	//    6   14:getfield        #57  <Field IOContext _ioContext>
	//    7   17:invokevirtual   #239 <Method Object IOContext.getSourceReference()>
	//    8   20:areturn         
		else
			return ((Object) (null));
	//    9   21:aconst_null     
	//   10   22:areturn         
	}

	protected void _handleEOF()
		throws JsonParseException
	{
		if(!_parsingContext.inRoot())
	//*   0    0:aload_0         
	//*   1    1:getfield        #89  <Field JsonReadContext _parsingContext>
	//*   2    4:invokevirtual   #243 <Method boolean JsonReadContext.inRoot()>
	//*   3    7:ifne            61
		{
			String s;
			if(_parsingContext.inArray())
	//*   4   10:aload_0         
	//*   5   11:getfield        #89  <Field JsonReadContext _parsingContext>
	//*   6   14:invokevirtual   #246 <Method boolean JsonReadContext.inArray()>
	//*   7   17:ifeq            26
				s = "Array";
	//    8   20:ldc1            #248 <String "Array">
	//    9   22:astore_1        
			else
	//*  10   23:goto            29
				s = "Object";
	//   11   26:ldc1            #250 <String "Object">
	//   12   28:astore_1        
			_reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", new Object[] {
				s, _parsingContext.getStartLocation(_getSourceReference())
			}), ((JsonToken) (null)));
	//   13   29:aload_0         
	//   14   30:ldc1            #252 <String ": expected close marker for %s (start marker at %s)">
	//   15   32:iconst_2        
	//   16   33:anewarray       Object[]
	//   17   36:dup             
	//   18   37:iconst_0        
	//   19   38:aload_1         
	//   20   39:aastore         
	//   21   40:dup             
	//   22   41:iconst_1        
	//   23   42:aload_0         
	//   24   43:getfield        #89  <Field JsonReadContext _parsingContext>
	//   25   46:aload_0         
	//   26   47:invokevirtual   #256 <Method Object _getSourceReference()>
	//   27   50:invokevirtual   #260 <Method JsonLocation JsonReadContext.getStartLocation(Object)>
	//   28   53:aastore         
	//   29   54:invokestatic    #266 <Method String String.format(String, Object[])>
	//   30   57:aconst_null     
	//   31   58:invokevirtual   #270 <Method void _reportInvalidEOF(String, JsonToken)>
		}
	//   32   61:return          
	}

	protected int _parseIntValue()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_NUMBER_INT && _intLength <= 9)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field JsonToken _currToken>
	//*   2    4:getstatic       #279 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       43
	//*   4   10:aload_0         
	//*   5   11:getfield        #137 <Field int _intLength>
	//*   6   14:bipush          9
	//*   7   16:icmpgt          43
		{
			int i = _textBuffer.contentsAsInt(_numberNegative);
	//    8   19:aload_0         
	//    9   20:getfield        #65  <Field TextBuffer _textBuffer>
	//   10   23:aload_0         
	//   11   24:getfield        #147 <Field boolean _numberNegative>
	//   12   27:invokevirtual   #283 <Method int TextBuffer.contentsAsInt(boolean)>
	//   13   30:istore_1        
			_numberInt = i;
	//   14   31:aload_0         
	//   15   32:iload_1         
	//   16   33:putfield        #285 <Field int _numberInt>
			_numTypesValid = 1;
	//   17   36:aload_0         
	//   18   37:iconst_1        
	//   19   38:putfield        #55  <Field int _numTypesValid>
			return i;
	//   20   41:iload_1         
	//   21   42:ireturn         
		}
		_parseNumericValue(1);
	//   22   43:aload_0         
	//   23   44:iconst_1        
	//   24   45:invokevirtual   #288 <Method void _parseNumericValue(int)>
		if((_numTypesValid & 1) == 0)
	//*  25   48:aload_0         
	//*  26   49:getfield        #55  <Field int _numTypesValid>
	//*  27   52:iconst_1        
	//*  28   53:iand            
	//*  29   54:ifne            61
			convertNumberToInt();
	//   30   57:aload_0         
	//   31   58:invokevirtual   #291 <Method void convertNumberToInt()>
		return _numberInt;
	//   32   61:aload_0         
	//   33   62:getfield        #285 <Field int _numberInt>
	//   34   65:ireturn         
	}

	protected void _parseNumericValue(int i)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field JsonToken _currToken>
	//*   2    4:getstatic       #279 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       130
		{
			int j = _intLength;
	//    4   10:aload_0         
	//    5   11:getfield        #137 <Field int _intLength>
	//    6   14:istore_2        
			if(j <= 9)
	//*   7   15:iload_2         
	//*   8   16:bipush          9
	//*   9   18:icmpgt          42
			{
				_numberInt = _textBuffer.contentsAsInt(_numberNegative);
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #65  <Field TextBuffer _textBuffer>
	//   13   26:aload_0         
	//   14   27:getfield        #147 <Field boolean _numberNegative>
	//   15   30:invokevirtual   #283 <Method int TextBuffer.contentsAsInt(boolean)>
	//   16   33:putfield        #285 <Field int _numberInt>
				_numTypesValid = 1;
	//   17   36:aload_0         
	//   18   37:iconst_1        
	//   19   38:putfield        #55  <Field int _numTypesValid>
				return;
	//   20   41:return          
			}
			if(j <= 18)
	//*  21   42:iload_2         
	//*  22   43:bipush          18
	//*  23   45:icmpgt          124
			{
				long l = _textBuffer.contentsAsLong(_numberNegative);
	//   24   48:aload_0         
	//   25   49:getfield        #65  <Field TextBuffer _textBuffer>
	//   26   52:aload_0         
	//   27   53:getfield        #147 <Field boolean _numberNegative>
	//   28   56:invokevirtual   #295 <Method long TextBuffer.contentsAsLong(boolean)>
	//   29   59:lstore_3        
				if(j == 10)
	//*  30   60:iload_2         
	//*  31   61:bipush          10
	//*  32   63:icmpne          113
					if(_numberNegative)
	//*  33   66:aload_0         
	//*  34   67:getfield        #147 <Field boolean _numberNegative>
	//*  35   70:ifeq            93
					{
						if(l >= 0x80000000L)
	//*  36   73:lload_3         
	//*  37   74:ldc2w           #296 <Long 0x80000000L>
	//*  38   77:lcmp            
	//*  39   78:iflt            113
						{
							_numberInt = (int)l;
	//   40   81:aload_0         
	//   41   82:lload_3         
	//   42   83:l2i             
	//   43   84:putfield        #285 <Field int _numberInt>
							_numTypesValid = 1;
	//   44   87:aload_0         
	//   45   88:iconst_1        
	//   46   89:putfield        #55  <Field int _numTypesValid>
							return;
	//   47   92:return          
						}
					} else
					if(l <= 0x7fffffffL)
	//*  48   93:lload_3         
	//*  49   94:ldc2w           #298 <Long 0x7fffffffL>
	//*  50   97:lcmp            
	//*  51   98:ifgt            113
					{
						_numberInt = (int)l;
	//   52  101:aload_0         
	//   53  102:lload_3         
	//   54  103:l2i             
	//   55  104:putfield        #285 <Field int _numberInt>
						_numTypesValid = 1;
	//   56  107:aload_0         
	//   57  108:iconst_1        
	//   58  109:putfield        #55  <Field int _numTypesValid>
						return;
	//   59  112:return          
					}
				_numberLong = l;
	//   60  113:aload_0         
	//   61  114:lload_3         
	//   62  115:putfield        #161 <Field long _numberLong>
				_numTypesValid = 2;
	//   63  118:aload_0         
	//   64  119:iconst_2        
	//   65  120:putfield        #55  <Field int _numTypesValid>
				return;
	//   66  123:return          
			} else
			{
				_parseSlowInt(i);
	//   67  124:aload_0         
	//   68  125:iload_1         
	//   69  126:invokespecial   #301 <Method void _parseSlowInt(int)>
				return;
	//   70  129:return          
			}
		}
		if(_currToken == JsonToken.VALUE_NUMBER_FLOAT)
	//*  71  130:aload_0         
	//*  72  131:getfield        #274 <Field JsonToken _currToken>
	//*  73  134:getstatic       #304 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  74  137:if_acmpne       146
		{
			_parseSlowFloat(i);
	//   75  140:aload_0         
	//   76  141:iload_1         
	//   77  142:invokespecial   #306 <Method void _parseSlowFloat(int)>
			return;
	//   78  145:return          
		} else
		{
			_reportError("Current token (%s) not numeric, can not use numeric value accessors", ((Object) (_currToken)));
	//   79  146:aload_0         
	//   80  147:ldc2            #308 <String "Current token (%s) not numeric, can not use numeric value accessors">
	//   81  150:aload_0         
	//   82  151:getfield        #274 <Field JsonToken _currToken>
	//   83  154:invokevirtual   #312 <Method void _reportError(String, Object)>
			return;
	//   84  157:return          
		}
	}

	protected void _releaseBuffers()
		throws IOException
	{
		_textBuffer.releaseBuffers();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #316 <Method void TextBuffer.releaseBuffers()>
		char ac[] = _nameCopyBuffer;
	//    3    7:aload_0         
	//    4    8:getfield        #318 <Field char[] _nameCopyBuffer>
	//    5   11:astore_1        
		if(ac != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          29
		{
			_nameCopyBuffer = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #318 <Field char[] _nameCopyBuffer>
			_ioContext.releaseNameCopyBuffer(ac);
	//   11   21:aload_0         
	//   12   22:getfield        #57  <Field IOContext _ioContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #322 <Method void IOContext.releaseNameCopyBuffer(char[])>
		}
	//   15   29:return          
	}

	protected void _reportMismatchedEndMarker(int i, char c)
		throws JsonParseException
	{
		JsonReadContext jsonreadcontext = getParsingContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #328 <Method JsonReadContext getParsingContext()>
	//    2    4:astore_3        
		_reportError(String.format("Unexpected close marker '%s': expected '%c' (for %s starting at %s)", new Object[] {
			Character.valueOf((char)i), Character.valueOf(c), jsonreadcontext.typeDesc(), jsonreadcontext.getStartLocation(_getSourceReference())
		}));
	//    3    5:aload_0         
	//    4    6:ldc2            #330 <String "Unexpected close marker '%s': expected '%c' (for %s starting at %s)">
	//    5    9:iconst_4        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:iload_1         
	//   10   16:int2char        
	//   11   17:invokestatic    #336 <Method Character Character.valueOf(char)>
	//   12   20:aastore         
	//   13   21:dup             
	//   14   22:iconst_1        
	//   15   23:iload_2         
	//   16   24:invokestatic    #336 <Method Character Character.valueOf(char)>
	//   17   27:aastore         
	//   18   28:dup             
	//   19   29:iconst_2        
	//   20   30:aload_3         
	//   21   31:invokevirtual   #339 <Method String JsonReadContext.typeDesc()>
	//   22   34:aastore         
	//   23   35:dup             
	//   24   36:iconst_3        
	//   25   37:aload_3         
	//   26   38:aload_0         
	//   27   39:invokevirtual   #256 <Method Object _getSourceReference()>
	//   28   42:invokevirtual   #260 <Method JsonLocation JsonReadContext.getStartLocation(Object)>
	//   29   45:aastore         
	//   30   46:invokestatic    #266 <Method String String.format(String, Object[])>
	//   31   49:invokevirtual   #341 <Method void _reportError(String)>
	//   32   52:return          
	}

	public void close()
		throws IOException
	{
		if(_closed)
			break MISSING_BLOCK_LABEL_43;
	//    0    0:aload_0         
	//    1    1:getfield        #344 <Field boolean _closed>
	//    2    4:ifne            43
		_inputPtr = Math.max(_inputPtr, _inputEnd);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #346 <Field int _inputPtr>
	//    6   12:aload_0         
	//    7   13:getfield        #348 <Field int _inputEnd>
	//    8   16:invokestatic    #354 <Method int Math.max(int, int)>
	//    9   19:putfield        #346 <Field int _inputPtr>
		_closed = true;
	//   10   22:aload_0         
	//   11   23:iconst_1        
	//   12   24:putfield        #344 <Field boolean _closed>
		_closeInput();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #356 <Method void _closeInput()>
		_releaseBuffers();
	//   15   31:aload_0         
	//   16   32:invokevirtual   #358 <Method void _releaseBuffers()>
		return;
	//   17   35:return          
		Exception exception;
		exception;
	//   18   36:astore_1        
		_releaseBuffers();
	//   19   37:aload_0         
	//   20   38:invokevirtual   #358 <Method void _releaseBuffers()>
		throw exception;
	//   21   41:aload_1         
	//   22   42:athrow          
	//   23   43:return          
	}

	protected void convertNumberToBigDecimal()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_1        
		if((i & 8) != 0)
	//*   3    5:iload_1         
	//*   4    6:bipush          8
	//*   5    8:iand            
	//*   6    9:ifeq            26
			_numberBigDecimal = NumberInput.parseBigDecimal(getText());
	//    7   12:aload_0         
	//    8   13:aload_0         
	//    9   14:invokevirtual   #362 <Method String getText()>
	//   10   17:invokestatic    #366 <Method BigDecimal NumberInput.parseBigDecimal(String)>
	//   11   20:putfield        #103 <Field BigDecimal _numberBigDecimal>
		else
	//*  12   23:goto            95
		if((i & 4) != 0)
	//*  13   26:iload_1         
	//*  14   27:iconst_4        
	//*  15   28:iand            
	//*  16   29:ifeq            50
			_numberBigDecimal = new BigDecimal(_numberBigInt);
	//   17   32:aload_0         
	//   18   33:new             #368 <Class BigDecimal>
	//   19   36:dup             
	//   20   37:aload_0         
	//   21   38:getfield        #168 <Field BigInteger _numberBigInt>
	//   22   41:invokespecial   #371 <Method void BigDecimal(BigInteger)>
	//   23   44:putfield        #103 <Field BigDecimal _numberBigDecimal>
		else
	//*  24   47:goto            95
		if((i & 2) != 0)
	//*  25   50:iload_1         
	//*  26   51:iconst_2        
	//*  27   52:iand            
	//*  28   53:ifeq            70
			_numberBigDecimal = BigDecimal.valueOf(_numberLong);
	//   29   56:aload_0         
	//   30   57:aload_0         
	//   31   58:getfield        #161 <Field long _numberLong>
	//   32   61:invokestatic    #374 <Method BigDecimal BigDecimal.valueOf(long)>
	//   33   64:putfield        #103 <Field BigDecimal _numberBigDecimal>
		else
	//*  34   67:goto            95
		if((i & 1) != 0)
	//*  35   70:iload_1         
	//*  36   71:iconst_1        
	//*  37   72:iand            
	//*  38   73:ifeq            91
			_numberBigDecimal = BigDecimal.valueOf(_numberInt);
	//   39   76:aload_0         
	//   40   77:aload_0         
	//   41   78:getfield        #285 <Field int _numberInt>
	//   42   81:i2l             
	//   43   82:invokestatic    #374 <Method BigDecimal BigDecimal.valueOf(long)>
	//   44   85:putfield        #103 <Field BigDecimal _numberBigDecimal>
		else
	//*  45   88:goto            95
			_throwInternal();
	//   46   91:aload_0         
	//   47   92:invokevirtual   #377 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 0x10;
	//   48   95:aload_0         
	//   49   96:aload_0         
	//   50   97:getfield        #55  <Field int _numTypesValid>
	//   51  100:bipush          16
	//   52  102:ior             
	//   53  103:putfield        #55  <Field int _numTypesValid>
	//   54  106:return          
	}

	protected void convertNumberToBigInteger()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_1        
		if((i & 0x10) != 0)
	//*   3    5:iload_1         
	//*   4    6:bipush          16
	//*   5    8:iand            
	//*   6    9:ifeq            26
			_numberBigInt = _numberBigDecimal.toBigInteger();
	//    7   12:aload_0         
	//    8   13:aload_0         
	//    9   14:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//   10   17:invokevirtual   #382 <Method BigInteger BigDecimal.toBigInteger()>
	//   11   20:putfield        #168 <Field BigInteger _numberBigInt>
		else
	//*  12   23:goto            95
		if((i & 2) != 0)
	//*  13   26:iload_1         
	//*  14   27:iconst_2        
	//*  15   28:iand            
	//*  16   29:ifeq            46
			_numberBigInt = BigInteger.valueOf(_numberLong);
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:getfield        #161 <Field long _numberLong>
	//   20   37:invokestatic    #385 <Method BigInteger BigInteger.valueOf(long)>
	//   21   40:putfield        #168 <Field BigInteger _numberBigInt>
		else
	//*  22   43:goto            95
		if((i & 1) != 0)
	//*  23   46:iload_1         
	//*  24   47:iconst_1        
	//*  25   48:iand            
	//*  26   49:ifeq            67
			_numberBigInt = BigInteger.valueOf(_numberInt);
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #285 <Field int _numberInt>
	//   30   57:i2l             
	//   31   58:invokestatic    #385 <Method BigInteger BigInteger.valueOf(long)>
	//   32   61:putfield        #168 <Field BigInteger _numberBigInt>
		else
	//*  33   64:goto            95
		if((i & 8) != 0)
	//*  34   67:iload_1         
	//*  35   68:bipush          8
	//*  36   70:iand            
	//*  37   71:ifeq            91
			_numberBigInt = BigDecimal.valueOf(_numberDouble).toBigInteger();
	//   38   74:aload_0         
	//   39   75:aload_0         
	//   40   76:getfield        #109 <Field double _numberDouble>
	//   41   79:invokestatic    #388 <Method BigDecimal BigDecimal.valueOf(double)>
	//   42   82:invokevirtual   #382 <Method BigInteger BigDecimal.toBigInteger()>
	//   43   85:putfield        #168 <Field BigInteger _numberBigInt>
		else
	//*  44   88:goto            95
			_throwInternal();
	//   45   91:aload_0         
	//   46   92:invokevirtual   #377 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 4;
	//   47   95:aload_0         
	//   48   96:aload_0         
	//   49   97:getfield        #55  <Field int _numTypesValid>
	//   50  100:iconst_4        
	//   51  101:ior             
	//   52  102:putfield        #55  <Field int _numTypesValid>
	//   53  105:return          
	}

	protected void convertNumberToDouble()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_1        
		if((i & 0x10) != 0)
	//*   3    5:iload_1         
	//*   4    6:bipush          16
	//*   5    8:iand            
	//*   6    9:ifeq            26
			_numberDouble = _numberBigDecimal.doubleValue();
	//    7   12:aload_0         
	//    8   13:aload_0         
	//    9   14:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//   10   17:invokevirtual   #392 <Method double BigDecimal.doubleValue()>
	//   11   20:putfield        #109 <Field double _numberDouble>
		else
	//*  12   23:goto            86
		if((i & 4) != 0)
	//*  13   26:iload_1         
	//*  14   27:iconst_4        
	//*  15   28:iand            
	//*  16   29:ifeq            46
			_numberDouble = _numberBigInt.doubleValue();
	//   17   32:aload_0         
	//   18   33:aload_0         
	//   19   34:getfield        #168 <Field BigInteger _numberBigInt>
	//   20   37:invokevirtual   #393 <Method double BigInteger.doubleValue()>
	//   21   40:putfield        #109 <Field double _numberDouble>
		else
	//*  22   43:goto            86
		if((i & 2) != 0)
	//*  23   46:iload_1         
	//*  24   47:iconst_2        
	//*  25   48:iand            
	//*  26   49:ifeq            64
			_numberDouble = _numberLong;
	//   27   52:aload_0         
	//   28   53:aload_0         
	//   29   54:getfield        #161 <Field long _numberLong>
	//   30   57:l2d             
	//   31   58:putfield        #109 <Field double _numberDouble>
		else
	//*  32   61:goto            86
		if((i & 1) != 0)
	//*  33   64:iload_1         
	//*  34   65:iconst_1        
	//*  35   66:iand            
	//*  36   67:ifeq            82
			_numberDouble = _numberInt;
	//   37   70:aload_0         
	//   38   71:aload_0         
	//   39   72:getfield        #285 <Field int _numberInt>
	//   40   75:i2d             
	//   41   76:putfield        #109 <Field double _numberDouble>
		else
	//*  42   79:goto            86
			_throwInternal();
	//   43   82:aload_0         
	//   44   83:invokevirtual   #377 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 8;
	//   45   86:aload_0         
	//   46   87:aload_0         
	//   47   88:getfield        #55  <Field int _numTypesValid>
	//   48   91:bipush          8
	//   49   93:ior             
	//   50   94:putfield        #55  <Field int _numTypesValid>
	//   51   97:return          
	}

	protected void convertNumberToInt()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_3        
		if((i & 2) != 0)
	//*   3    5:iload_3         
	//*   4    6:iconst_2        
	//*   5    7:iand            
	//*   6    8:ifeq            83
		{
			long l = _numberLong;
	//    7   11:aload_0         
	//    8   12:getfield        #161 <Field long _numberLong>
	//    9   15:lstore          4
			i = (int)l;
	//   10   17:lload           4
	//   11   19:l2i             
	//   12   20:istore_3        
			if((long)i != l)
	//*  13   21:iload_3         
	//*  14   22:i2l             
	//*  15   23:lload           4
	//*  16   25:lcmp            
	//*  17   26:ifeq            75
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   18   29:new             #111 <Class StringBuilder>
	//   19   32:dup             
	//   20   33:invokespecial   #114 <Method void StringBuilder()>
	//   21   36:astore          6
				stringbuilder.append("Numeric value (");
	//   22   38:aload           6
	//   23   40:ldc2            #395 <String "Numeric value (">
	//   24   43:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
				stringbuilder.append(getText());
	//   26   47:aload           6
	//   27   49:aload_0         
	//   28   50:invokevirtual   #362 <Method String getText()>
	//   29   53:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   30   56:pop             
				stringbuilder.append(") out of range of int");
	//   31   57:aload           6
	//   32   59:ldc2            #397 <String ") out of range of int">
	//   33   62:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   34   65:pop             
				_reportError(stringbuilder.toString());
	//   35   66:aload_0         
	//   36   67:aload           6
	//   37   69:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   38   72:invokevirtual   #341 <Method void _reportError(String)>
			}
			_numberInt = i;
	//   39   75:aload_0         
	//   40   76:iload_3         
	//   41   77:putfield        #285 <Field int _numberInt>
		} else
	//*  42   80:goto            232
		if((i & 4) != 0)
	//*  43   83:iload_3         
	//*  44   84:iconst_4        
	//*  45   85:iand            
	//*  46   86:ifeq            133
		{
			if(BI_MIN_INT.compareTo(_numberBigInt) > 0 || BI_MAX_INT.compareTo(_numberBigInt) < 0)
	//*  47   89:getstatic       #400 <Field BigInteger BI_MIN_INT>
	//*  48   92:aload_0         
	//*  49   93:getfield        #168 <Field BigInteger _numberBigInt>
	//*  50   96:invokevirtual   #404 <Method int BigInteger.compareTo(BigInteger)>
	//*  51   99:ifgt            115
	//*  52  102:getstatic       #407 <Field BigInteger BI_MAX_INT>
	//*  53  105:aload_0         
	//*  54  106:getfield        #168 <Field BigInteger _numberBigInt>
	//*  55  109:invokevirtual   #404 <Method int BigInteger.compareTo(BigInteger)>
	//*  56  112:ifge            119
				reportOverflowInt();
	//   57  115:aload_0         
	//   58  116:invokevirtual   #410 <Method void reportOverflowInt()>
			_numberInt = _numberBigInt.intValue();
	//   59  119:aload_0         
	//   60  120:aload_0         
	//   61  121:getfield        #168 <Field BigInteger _numberBigInt>
	//   62  124:invokevirtual   #413 <Method int BigInteger.intValue()>
	//   63  127:putfield        #285 <Field int _numberInt>
		} else
	//*  64  130:goto            232
		if((i & 8) != 0)
	//*  65  133:iload_3         
	//*  66  134:bipush          8
	//*  67  136:iand            
	//*  68  137:ifeq            177
		{
			double d = _numberDouble;
	//   69  140:aload_0         
	//   70  141:getfield        #109 <Field double _numberDouble>
	//   71  144:dstore_1        
			if(d < -2147483648D || d > 2147483647D)
	//*  72  145:dload_1         
	//*  73  146:ldc2w           #414 <Double -2147483648D>
	//*  74  149:dcmpg           
	//*  75  150:iflt            161
	//*  76  153:dload_1         
	//*  77  154:ldc2w           #416 <Double 2147483647D>
	//*  78  157:dcmpl           
	//*  79  158:ifle            165
				reportOverflowInt();
	//   80  161:aload_0         
	//   81  162:invokevirtual   #410 <Method void reportOverflowInt()>
			_numberInt = (int)_numberDouble;
	//   82  165:aload_0         
	//   83  166:aload_0         
	//   84  167:getfield        #109 <Field double _numberDouble>
	//   85  170:d2i             
	//   86  171:putfield        #285 <Field int _numberInt>
		} else
	//*  87  174:goto            232
		if((i & 0x10) != 0)
	//*  88  177:iload_3         
	//*  89  178:bipush          16
	//*  90  180:iand            
	//*  91  181:ifeq            228
		{
			if(BD_MIN_INT.compareTo(_numberBigDecimal) > 0 || BD_MAX_INT.compareTo(_numberBigDecimal) < 0)
	//*  92  184:getstatic       #420 <Field BigDecimal BD_MIN_INT>
	//*  93  187:aload_0         
	//*  94  188:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//*  95  191:invokevirtual   #423 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  96  194:ifgt            210
	//*  97  197:getstatic       #426 <Field BigDecimal BD_MAX_INT>
	//*  98  200:aload_0         
	//*  99  201:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//* 100  204:invokevirtual   #423 <Method int BigDecimal.compareTo(BigDecimal)>
	//* 101  207:ifge            214
				reportOverflowInt();
	//  102  210:aload_0         
	//  103  211:invokevirtual   #410 <Method void reportOverflowInt()>
			_numberInt = _numberBigDecimal.intValue();
	//  104  214:aload_0         
	//  105  215:aload_0         
	//  106  216:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//  107  219:invokevirtual   #427 <Method int BigDecimal.intValue()>
	//  108  222:putfield        #285 <Field int _numberInt>
		} else
	//* 109  225:goto            232
		{
			_throwInternal();
	//  110  228:aload_0         
	//  111  229:invokevirtual   #377 <Method void _throwInternal()>
		}
		_numTypesValid = _numTypesValid | 1;
	//  112  232:aload_0         
	//  113  233:aload_0         
	//  114  234:getfield        #55  <Field int _numTypesValid>
	//  115  237:iconst_1        
	//  116  238:ior             
	//  117  239:putfield        #55  <Field int _numTypesValid>
	//  118  242:return          
	}

	protected void convertNumberToLong()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_3        
		if((i & 1) != 0)
	//*   3    5:iload_3         
	//*   4    6:iconst_1        
	//*   5    7:iand            
	//*   6    8:ifeq            23
			_numberLong = _numberInt;
	//    7   11:aload_0         
	//    8   12:aload_0         
	//    9   13:getfield        #285 <Field int _numberInt>
	//   10   16:i2l             
	//   11   17:putfield        #161 <Field long _numberLong>
		else
	//*  12   20:goto            172
		if((i & 4) != 0)
	//*  13   23:iload_3         
	//*  14   24:iconst_4        
	//*  15   25:iand            
	//*  16   26:ifeq            73
		{
			if(BI_MIN_LONG.compareTo(_numberBigInt) > 0 || BI_MAX_LONG.compareTo(_numberBigInt) < 0)
	//*  17   29:getstatic       #431 <Field BigInteger BI_MIN_LONG>
	//*  18   32:aload_0         
	//*  19   33:getfield        #168 <Field BigInteger _numberBigInt>
	//*  20   36:invokevirtual   #404 <Method int BigInteger.compareTo(BigInteger)>
	//*  21   39:ifgt            55
	//*  22   42:getstatic       #434 <Field BigInteger BI_MAX_LONG>
	//*  23   45:aload_0         
	//*  24   46:getfield        #168 <Field BigInteger _numberBigInt>
	//*  25   49:invokevirtual   #404 <Method int BigInteger.compareTo(BigInteger)>
	//*  26   52:ifge            59
				reportOverflowLong();
	//   27   55:aload_0         
	//   28   56:invokevirtual   #437 <Method void reportOverflowLong()>
			_numberLong = _numberBigInt.longValue();
	//   29   59:aload_0         
	//   30   60:aload_0         
	//   31   61:getfield        #168 <Field BigInteger _numberBigInt>
	//   32   64:invokevirtual   #441 <Method long BigInteger.longValue()>
	//   33   67:putfield        #161 <Field long _numberLong>
		} else
	//*  34   70:goto            172
		if((i & 8) != 0)
	//*  35   73:iload_3         
	//*  36   74:bipush          8
	//*  37   76:iand            
	//*  38   77:ifeq            117
		{
			double d = _numberDouble;
	//   39   80:aload_0         
	//   40   81:getfield        #109 <Field double _numberDouble>
	//   41   84:dstore_1        
			if(d < -9.2233720368547758E+18D || d > 9.2233720368547758E+18D)
	//*  42   85:dload_1         
	//*  43   86:ldc2w           #442 <Double -9.2233720368547758E+18D>
	//*  44   89:dcmpg           
	//*  45   90:iflt            101
	//*  46   93:dload_1         
	//*  47   94:ldc2w           #444 <Double 9.2233720368547758E+18D>
	//*  48   97:dcmpl           
	//*  49   98:ifle            105
				reportOverflowLong();
	//   50  101:aload_0         
	//   51  102:invokevirtual   #437 <Method void reportOverflowLong()>
			_numberLong = (long)_numberDouble;
	//   52  105:aload_0         
	//   53  106:aload_0         
	//   54  107:getfield        #109 <Field double _numberDouble>
	//   55  110:d2l             
	//   56  111:putfield        #161 <Field long _numberLong>
		} else
	//*  57  114:goto            172
		if((i & 0x10) != 0)
	//*  58  117:iload_3         
	//*  59  118:bipush          16
	//*  60  120:iand            
	//*  61  121:ifeq            168
		{
			if(BD_MIN_LONG.compareTo(_numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(_numberBigDecimal) < 0)
	//*  62  124:getstatic       #448 <Field BigDecimal BD_MIN_LONG>
	//*  63  127:aload_0         
	//*  64  128:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//*  65  131:invokevirtual   #423 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  66  134:ifgt            150
	//*  67  137:getstatic       #451 <Field BigDecimal BD_MAX_LONG>
	//*  68  140:aload_0         
	//*  69  141:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//*  70  144:invokevirtual   #423 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  71  147:ifge            154
				reportOverflowLong();
	//   72  150:aload_0         
	//   73  151:invokevirtual   #437 <Method void reportOverflowLong()>
			_numberLong = _numberBigDecimal.longValue();
	//   74  154:aload_0         
	//   75  155:aload_0         
	//   76  156:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//   77  159:invokevirtual   #452 <Method long BigDecimal.longValue()>
	//   78  162:putfield        #161 <Field long _numberLong>
		} else
	//*  79  165:goto            172
		{
			_throwInternal();
	//   80  168:aload_0         
	//   81  169:invokevirtual   #377 <Method void _throwInternal()>
		}
		_numTypesValid = _numTypesValid | 2;
	//   82  172:aload_0         
	//   83  173:aload_0         
	//   84  174:getfield        #55  <Field int _numTypesValid>
	//   85  177:iconst_2        
	//   86  178:ior             
	//   87  179:putfield        #55  <Field int _numTypesValid>
	//   88  182:return          
	}

	public JsonParser enable(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		_features = _features | feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #236 <Field int _features>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #180 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    5    9:ior             
	//    6   10:putfield        #236 <Field int _features>
		if(feature == com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION && _parsingContext.getDupDetector() == null)
	//*   7   13:aload_1         
	//*   8   14:getstatic       #71  <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.STRICT_DUPLICATE_DETECTION>
	//*   9   17:if_acmpne       45
	//*  10   20:aload_0         
	//*  11   21:getfield        #89  <Field JsonReadContext _parsingContext>
	//*  12   24:invokevirtual   #184 <Method DupDetector JsonReadContext.getDupDetector()>
	//*  13   27:ifnonnull       45
			_parsingContext = _parsingContext.withDupDetector(DupDetector.rootDetector(((JsonParser) (this))));
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #89  <Field JsonReadContext _parsingContext>
	//   17   35:aload_0         
	//   18   36:invokestatic    #81  <Method DupDetector DupDetector.rootDetector(JsonParser)>
	//   19   39:invokevirtual   #187 <Method JsonReadContext JsonReadContext.withDupDetector(DupDetector)>
	//   20   42:putfield        #89  <Field JsonReadContext _parsingContext>
		return ((JsonParser) (this));
	//   21   45:aload_0         
	//   22   46:areturn         
	}

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_1        
		if((i & 4) == 0)
	//*   3    5:iload_1         
	//*   4    6:iconst_4        
	//*   5    7:iand            
	//*   6    8:ifne            33
		{
			if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            20
				_parseNumericValue(4);
	//    9   15:aload_0         
	//   10   16:iconst_4        
	//   11   17:invokevirtual   #288 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 4) == 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #55  <Field int _numTypesValid>
	//*  14   24:iconst_4        
	//*  15   25:iand            
	//*  16   26:ifne            33
				convertNumberToBigInteger();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #457 <Method void convertNumberToBigInteger()>
		}
		return _numberBigInt;
	//   19   33:aload_0         
	//   20   34:getfield        #168 <Field BigInteger _numberBigInt>
	//   21   37:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_binaryValue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #461 <Field byte[] _binaryValue>
	//*   2    4:ifnonnull       81
		{
			if(_currToken != JsonToken.VALUE_STRING)
	//*   3    7:aload_0         
	//*   4    8:getfield        #274 <Field JsonToken _currToken>
	//*   5   11:getstatic       #464 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       58
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    7   17:new             #111 <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #114 <Method void StringBuilder()>
	//   10   24:astore_2        
				stringbuilder.append("Current token (");
	//   11   25:aload_2         
	//   12   26:ldc2            #466 <String "Current token (">
	//   13   29:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
				stringbuilder.append(((Object) (_currToken)));
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #274 <Field JsonToken _currToken>
	//   18   38:invokevirtual   #469 <Method StringBuilder StringBuilder.append(Object)>
	//   19   41:pop             
				stringbuilder.append(") not VALUE_STRING, can not access as binary");
	//   20   42:aload_2         
	//   21   43:ldc2            #471 <String ") not VALUE_STRING, can not access as binary">
	//   22   46:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
				_reportError(stringbuilder.toString());
	//   24   50:aload_0         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   27   55:invokevirtual   #341 <Method void _reportError(String)>
			}
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #473 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   30   62:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:invokevirtual   #362 <Method String getText()>
	//   34   68:aload_2         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #477 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   37   73:aload_0         
	//   38   74:aload_2         
	//   39   75:invokevirtual   #481 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   40   78:putfield        #461 <Field byte[] _binaryValue>
		}
		return _binaryValue;
	//   41   81:aload_0         
	//   42   82:getfield        #461 <Field byte[] _binaryValue>
	//   43   85:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #346 <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _currInputRowStart;
	//    3    5:aload_0         
	//    4    6:getfield        #485 <Field int _currInputRowStart>
	//    5    9:istore_2        
		Object obj = _getSourceReference();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #256 <Method Object _getSourceReference()>
	//    8   14:astore          5
		long l = _currInputProcessed;
	//    9   16:aload_0         
	//   10   17:getfield        #487 <Field long _currInputProcessed>
	//   11   20:lstore_3        
		return new JsonLocation(obj, -1L, (long)_inputPtr + l, _currInputRow, (i - j) + 1);
	//   12   21:new             #489 <Class JsonLocation>
	//   13   24:dup             
	//   14   25:aload           5
	//   15   27:ldc2w           #490 <Long -1L>
	//   16   30:aload_0         
	//   17   31:getfield        #346 <Field int _inputPtr>
	//   18   34:i2l             
	//   19   35:lload_3         
	//   20   36:ladd            
	//   21   37:aload_0         
	//   22   38:getfield        #51  <Field int _currInputRow>
	//   23   41:iload_1         
	//   24   42:iload_2         
	//   25   43:isub            
	//   26   44:iconst_1        
	//   27   45:iadd            
	//   28   46:invokespecial   #494 <Method void JsonLocation(Object, long, long, int, int)>
	//   29   49:areturn         
	}

	public String getCurrentName()
		throws IOException
	{
		if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field JsonToken _currToken>
	//*   2    4:getstatic       #498 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       20
	//*   4   10:aload_0         
	//*   5   11:getfield        #274 <Field JsonToken _currToken>
	//*   6   14:getstatic       #501 <Field JsonToken JsonToken.START_ARRAY>
	//*   7   17:if_acmpne       37
		{
			JsonReadContext jsonreadcontext = _parsingContext.getParent();
	//    8   20:aload_0         
	//    9   21:getfield        #89  <Field JsonReadContext _parsingContext>
	//   10   24:invokevirtual   #504 <Method JsonReadContext JsonReadContext.getParent()>
	//   11   27:astore_1        
			if(jsonreadcontext != null)
	//*  12   28:aload_1         
	//*  13   29:ifnull          37
				return jsonreadcontext.getCurrentName();
	//   14   32:aload_1         
	//   15   33:invokevirtual   #506 <Method String JsonReadContext.getCurrentName()>
	//   16   36:areturn         
		}
		return _parsingContext.getCurrentName();
	//   17   37:aload_0         
	//   18   38:getfield        #89  <Field JsonReadContext _parsingContext>
	//   19   41:invokevirtual   #506 <Method String JsonReadContext.getCurrentName()>
	//   20   44:areturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_1        
		if((i & 0x10) == 0)
	//*   3    5:iload_1         
	//*   4    6:bipush          16
	//*   5    8:iand            
	//*   6    9:ifne            36
		{
			if(i == 0)
	//*   7   12:iload_1         
	//*   8   13:ifne            22
				_parseNumericValue(16);
	//    9   16:aload_0         
	//   10   17:bipush          16
	//   11   19:invokevirtual   #288 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 0x10) == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #55  <Field int _numTypesValid>
	//*  14   26:bipush          16
	//*  15   28:iand            
	//*  16   29:ifne            36
				convertNumberToBigDecimal();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #509 <Method void convertNumberToBigDecimal()>
		}
		return _numberBigDecimal;
	//   19   36:aload_0         
	//   20   37:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//   21   40:areturn         
	}

	public double getDoubleValue()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_1        
		if((i & 8) == 0)
	//*   3    5:iload_1         
	//*   4    6:bipush          8
	//*   5    8:iand            
	//*   6    9:ifne            36
		{
			if(i == 0)
	//*   7   12:iload_1         
	//*   8   13:ifne            22
				_parseNumericValue(8);
	//    9   16:aload_0         
	//   10   17:bipush          8
	//   11   19:invokevirtual   #288 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 8) == 0)
	//*  12   22:aload_0         
	//*  13   23:getfield        #55  <Field int _numTypesValid>
	//*  14   26:bipush          8
	//*  15   28:iand            
	//*  16   29:ifne            36
				convertNumberToDouble();
	//   17   32:aload_0         
	//   18   33:invokevirtual   #512 <Method void convertNumberToDouble()>
		}
		return _numberDouble;
	//   19   36:aload_0         
	//   20   37:getfield        #109 <Field double _numberDouble>
	//   21   40:dreturn         
	}

	public float getFloatValue()
		throws IOException
	{
		return (float)getDoubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #516 <Method double getDoubleValue()>
	//    2    4:d2f             
	//    3    5:freturn         
	}

	public int getIntValue()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_1        
		if((i & 1) == 0)
	//*   3    5:iload_1         
	//*   4    6:iconst_1        
	//*   5    7:iand            
	//*   6    8:ifne            30
		{
			if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            20
				return _parseIntValue();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #519 <Method int _parseIntValue()>
	//   11   19:ireturn         
			if((i & 1) == 0)
	//*  12   20:iload_1         
	//*  13   21:iconst_1        
	//*  14   22:iand            
	//*  15   23:ifne            30
				convertNumberToInt();
	//   16   26:aload_0         
	//   17   27:invokevirtual   #291 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   18   30:aload_0         
	//   19   31:getfield        #285 <Field int _numberInt>
	//   20   34:ireturn         
	}

	public long getLongValue()
		throws IOException
	{
		int i = _numTypesValid;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field int _numTypesValid>
	//    2    4:istore_1        
		if((i & 2) == 0)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:iand            
	//*   6    8:ifne            33
		{
			if(i == 0)
	//*   7   11:iload_1         
	//*   8   12:ifne            20
				_parseNumericValue(2);
	//    9   15:aload_0         
	//   10   16:iconst_2        
	//   11   17:invokevirtual   #288 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 2) == 0)
	//*  12   20:aload_0         
	//*  13   21:getfield        #55  <Field int _numTypesValid>
	//*  14   24:iconst_2        
	//*  15   25:iand            
	//*  16   26:ifne            33
				convertNumberToLong();
	//   17   29:aload_0         
	//   18   30:invokevirtual   #522 <Method void convertNumberToLong()>
		}
		return _numberLong;
	//   19   33:aload_0         
	//   20   34:getfield        #161 <Field long _numberLong>
	//   21   37:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
		throws IOException
	{
		if(_numTypesValid == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int _numTypesValid>
	//*   2    4:ifne            12
			_parseNumericValue(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #288 <Method void _parseNumericValue(int)>
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   6   12:aload_0         
	//*   7   13:getfield        #274 <Field JsonToken _currToken>
	//*   8   16:getstatic       #279 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   9   19:if_acmpne       51
		{
			int i = _numTypesValid;
	//   10   22:aload_0         
	//   11   23:getfield        #55  <Field int _numTypesValid>
	//   12   26:istore_1        
			if((i & 1) != 0)
	//*  13   27:iload_1         
	//*  14   28:iconst_1        
	//*  15   29:iand            
	//*  16   30:ifeq            37
				return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
	//   17   33:getstatic       #530 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//   18   36:areturn         
			if((i & 2) != 0)
	//*  19   37:iload_1         
	//*  20   38:iconst_2        
	//*  21   39:iand            
	//*  22   40:ifeq            47
				return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
	//   23   43:getstatic       #533 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//   24   46:areturn         
			else
				return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
	//   25   47:getstatic       #536 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//   26   50:areturn         
		}
		if((_numTypesValid & 0x10) != 0)
	//*  27   51:aload_0         
	//*  28   52:getfield        #55  <Field int _numTypesValid>
	//*  29   55:bipush          16
	//*  30   57:iand            
	//*  31   58:ifeq            65
			return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL;
	//   32   61:getstatic       #539 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//   33   64:areturn         
		else
			return com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE;
	//   34   65:getstatic       #542 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
	//   35   68:areturn         
	}

	public Number getNumberValue()
		throws IOException
	{
		if(_numTypesValid == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field int _numTypesValid>
	//*   2    4:ifne            12
			_parseNumericValue(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #288 <Method void _parseNumericValue(int)>
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   6   12:aload_0         
	//*   7   13:getfield        #274 <Field JsonToken _currToken>
	//*   8   16:getstatic       #279 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   9   19:if_acmpne       71
		{
			int i = _numTypesValid;
	//   10   22:aload_0         
	//   11   23:getfield        #55  <Field int _numTypesValid>
	//   12   26:istore_1        
			if((i & 1) != 0)
	//*  13   27:iload_1         
	//*  14   28:iconst_1        
	//*  15   29:iand            
	//*  16   30:ifeq            41
				return ((Number) (Integer.valueOf(_numberInt)));
	//   17   33:aload_0         
	//   18   34:getfield        #285 <Field int _numberInt>
	//   19   37:invokestatic    #549 <Method Integer Integer.valueOf(int)>
	//   20   40:areturn         
			if((i & 2) != 0)
	//*  21   41:iload_1         
	//*  22   42:iconst_2        
	//*  23   43:iand            
	//*  24   44:ifeq            55
				return ((Number) (Long.valueOf(_numberLong)));
	//   25   47:aload_0         
	//   26   48:getfield        #161 <Field long _numberLong>
	//   27   51:invokestatic    #552 <Method Long Long.valueOf(long)>
	//   28   54:areturn         
			if((i & 4) != 0)
	//*  29   55:iload_1         
	//*  30   56:iconst_4        
	//*  31   57:iand            
	//*  32   58:ifeq            66
				return ((Number) (_numberBigInt));
	//   33   61:aload_0         
	//   34   62:getfield        #168 <Field BigInteger _numberBigInt>
	//   35   65:areturn         
			else
				return ((Number) (_numberBigDecimal));
	//   36   66:aload_0         
	//   37   67:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//   38   70:areturn         
		}
		int j = _numTypesValid;
	//   39   71:aload_0         
	//   40   72:getfield        #55  <Field int _numTypesValid>
	//   41   75:istore_1        
		if((j & 0x10) != 0)
	//*  42   76:iload_1         
	//*  43   77:bipush          16
	//*  44   79:iand            
	//*  45   80:ifeq            88
			return ((Number) (_numberBigDecimal));
	//   46   83:aload_0         
	//   47   84:getfield        #103 <Field BigDecimal _numberBigDecimal>
	//   48   87:areturn         
		if((j & 8) == 0)
	//*  49   88:iload_1         
	//*  50   89:bipush          8
	//*  51   91:iand            
	//*  52   92:ifne            99
			_throwInternal();
	//   53   95:aload_0         
	//   54   96:invokevirtual   #377 <Method void _throwInternal()>
		return ((Number) (Double.valueOf(_numberDouble)));
	//   55   99:aload_0         
	//   56  100:getfield        #109 <Field double _numberDouble>
	//   57  103:invokestatic    #557 <Method Double Double.valueOf(double)>
	//   58  106:areturn         
	}

	public volatile JsonStreamContext getParsingContext()
	{
		return ((JsonStreamContext) (getParsingContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #328 <Method JsonReadContext getParsingContext()>
	//    2    4:areturn         
	}

	public JsonReadContext getParsingContext()
	{
		return _parsingContext;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field JsonReadContext _parsingContext>
	//    2    4:areturn         
	}

	public long getTokenCharacterOffset()
	{
		return _tokenInputTotal;
	//    0    0:aload_0         
	//    1    1:getfield        #561 <Field long _tokenInputTotal>
	//    2    4:lreturn         
	}

	public int getTokenColumnNr()
	{
		int i = _tokenInputCol;
	//    0    0:aload_0         
	//    1    1:getfield        #564 <Field int _tokenInputCol>
	//    2    4:istore_1        
		if(i < 0)
	//*   3    5:iload_1         
	//*   4    6:ifge            11
			return i;
	//    5    9:iload_1         
	//    6   10:ireturn         
		else
			return i + 1;
	//    7   11:iload_1         
	//    8   12:iconst_1        
	//    9   13:iadd            
	//   10   14:ireturn         
	}

	public int getTokenLineNr()
	{
		return _tokenInputRow;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field int _tokenInputRow>
	//    2    4:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return new JsonLocation(_getSourceReference(), -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
	//    0    0:new             #489 <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #256 <Method Object _getSourceReference()>
	//    4    8:ldc2w           #490 <Long -1L>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #568 <Method long getTokenCharacterOffset()>
	//    7   15:aload_0         
	//    8   16:invokevirtual   #570 <Method int getTokenLineNr()>
	//    9   19:aload_0         
	//   10   20:invokevirtual   #572 <Method int getTokenColumnNr()>
	//   11   23:invokespecial   #494 <Method void JsonLocation(Object, long, long, int, int)>
	//   12   26:areturn         
	}

	public boolean hasTextCharacters()
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #274 <Field JsonToken _currToken>
	//*   2    4:getstatic       #464 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(_currToken == JsonToken.FIELD_NAME)
	//*   6   12:aload_0         
	//*   7   13:getfield        #274 <Field JsonToken _currToken>
	//*   8   16:getstatic       #576 <Field JsonToken JsonToken.FIELD_NAME>
	//*   9   19:if_acmpne       27
			return _nameCopied;
	//   10   22:aload_0         
	//   11   23:getfield        #578 <Field boolean _nameCopied>
	//   12   26:ireturn         
		else
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public boolean isNaN()
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #274 <Field JsonToken _currToken>
	//    2    4:astore          4
		JsonToken jsontoken1 = JsonToken.VALUE_NUMBER_FLOAT;
	//    3    6:getstatic       #304 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//    4    9:astore          5
		boolean flag = false;
	//    5   11:iconst_0        
	//    6   12:istore_3        
		if(jsontoken == jsontoken1 && (_numTypesValid & 8) != 0)
	//*   7   13:aload           4
	//*   8   15:aload           5
	//*   9   17:if_acmpne       53
	//*  10   20:aload_0         
	//*  11   21:getfield        #55  <Field int _numTypesValid>
	//*  12   24:bipush          8
	//*  13   26:iand            
	//*  14   27:ifeq            53
		{
			double d = _numberDouble;
	//   15   30:aload_0         
	//   16   31:getfield        #109 <Field double _numberDouble>
	//   17   34:dstore_1        
			if(Double.isNaN(d) || Double.isInfinite(d))
	//*  18   35:dload_1         
	//*  19   36:invokestatic    #582 <Method boolean Double.isNaN(double)>
	//*  20   39:ifne            49
	//*  21   42:dload_1         
	//*  22   43:invokestatic    #585 <Method boolean Double.isInfinite(double)>
	//*  23   46:ifeq            51
				flag = true;
	//   24   49:iconst_1        
	//   25   50:istore_3        
			return flag;
	//   26   51:iload_3         
	//   27   52:ireturn         
		} else
		{
			return false;
	//   28   53:iconst_0        
	//   29   54:ireturn         
		}
	}

	public JsonParser overrideStdFeatures(int i, int j)
	{
		int k = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field int _features>
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
	//   19   23:putfield        #236 <Field int _features>
			_checkStdFeatureChanges(i, j);
	//   20   26:aload_0         
	//   21   27:iload_1         
	//   22   28:iload_2         
	//   23   29:invokevirtual   #589 <Method void _checkStdFeatureChanges(int, int)>
		}
		return ((JsonParser) (this));
	//   24   32:aload_0         
	//   25   33:areturn         
	}

	protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64variant, int i, int j)
		throws IllegalArgumentException
	{
		return reportInvalidBase64Char(base64variant, i, j, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:aconst_null     
	//    5    5:invokevirtual   #594 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//    6    8:areturn         
	}

	protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64variant, int i, int j, String s)
		throws IllegalArgumentException
	{
		if(i <= 32)
	//*   0    0:iload_2         
	//*   1    1:bipush          32
	//*   2    3:icmpgt          36
			base64variant = ((Base64Variant) (String.format("Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units", new Object[] {
				Integer.toHexString(i), Integer.valueOf(j + 1)
			})));
	//    3    6:ldc2            #596 <String "Illegal white space character (code 0x%s) as character #%d of 4-char base64 unit: can only used between units">
	//    4    9:iconst_2        
	//    5   10:anewarray       Object[]
	//    6   13:dup             
	//    7   14:iconst_0        
	//    8   15:iload_2         
	//    9   16:invokestatic    #600 <Method String Integer.toHexString(int)>
	//   10   19:aastore         
	//   11   20:dup             
	//   12   21:iconst_1        
	//   13   22:iload_3         
	//   14   23:iconst_1        
	//   15   24:iadd            
	//   16   25:invokestatic    #549 <Method Integer Integer.valueOf(int)>
	//   17   28:aastore         
	//   18   29:invokestatic    #266 <Method String String.format(String, Object[])>
	//   19   32:astore_1        
		else
	//*  20   33:goto            219
		if(base64variant.usesPaddingChar(i))
	//*  21   36:aload_1         
	//*  22   37:iload_2         
	//*  23   38:invokevirtual   #603 <Method boolean Base64Variant.usesPaddingChar(int)>
	//*  24   41:ifeq            108
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   25   44:new             #111 <Class StringBuilder>
	//   26   47:dup             
	//   27   48:invokespecial   #114 <Method void StringBuilder()>
	//   28   51:astore          5
			stringbuilder.append("Unexpected padding character ('");
	//   29   53:aload           5
	//   30   55:ldc2            #605 <String "Unexpected padding character ('">
	//   31   58:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   32   61:pop             
			stringbuilder.append(base64variant.getPaddingChar());
	//   33   62:aload           5
	//   34   64:aload_1         
	//   35   65:invokevirtual   #608 <Method char Base64Variant.getPaddingChar()>
	//   36   68:invokevirtual   #611 <Method StringBuilder StringBuilder.append(char)>
	//   37   71:pop             
			stringbuilder.append("') as character #");
	//   38   72:aload           5
	//   39   74:ldc2            #613 <String "') as character #">
	//   40   77:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   41   80:pop             
			stringbuilder.append(j + 1);
	//   42   81:aload           5
	//   43   83:iload_3         
	//   44   84:iconst_1        
	//   45   85:iadd            
	//   46   86:invokevirtual   #616 <Method StringBuilder StringBuilder.append(int)>
	//   47   89:pop             
			stringbuilder.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
	//   48   90:aload           5
	//   49   92:ldc2            #618 <String " of 4-char base64 unit: padding only legal as 3rd or 4th character">
	//   50   95:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   51   98:pop             
			base64variant = ((Base64Variant) (stringbuilder.toString()));
	//   52   99:aload           5
	//   53  101:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   54  104:astore_1        
		} else
	//*  55  105:goto            219
		if(Character.isDefined(i) && !Character.isISOControl(i))
	//*  56  108:iload_2         
	//*  57  109:invokestatic    #621 <Method boolean Character.isDefined(int)>
	//*  58  112:ifeq            181
	//*  59  115:iload_2         
	//*  60  116:invokestatic    #624 <Method boolean Character.isISOControl(int)>
	//*  61  119:ifeq            125
	//*  62  122:goto            181
		{
			base64variant = ((Base64Variant) (new StringBuilder()));
	//   63  125:new             #111 <Class StringBuilder>
	//   64  128:dup             
	//   65  129:invokespecial   #114 <Method void StringBuilder()>
	//   66  132:astore_1        
			((StringBuilder) (base64variant)).append("Illegal character '");
	//   67  133:aload_1         
	//   68  134:ldc2            #626 <String "Illegal character '">
	//   69  137:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   70  140:pop             
			((StringBuilder) (base64variant)).append((char)i);
	//   71  141:aload_1         
	//   72  142:iload_2         
	//   73  143:int2char        
	//   74  144:invokevirtual   #611 <Method StringBuilder StringBuilder.append(char)>
	//   75  147:pop             
			((StringBuilder) (base64variant)).append("' (code 0x");
	//   76  148:aload_1         
	//   77  149:ldc2            #628 <String "' (code 0x">
	//   78  152:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   79  155:pop             
			((StringBuilder) (base64variant)).append(Integer.toHexString(i));
	//   80  156:aload_1         
	//   81  157:iload_2         
	//   82  158:invokestatic    #600 <Method String Integer.toHexString(int)>
	//   83  161:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   84  164:pop             
			((StringBuilder) (base64variant)).append(") in base64 content");
	//   85  165:aload_1         
	//   86  166:ldc2            #630 <String ") in base64 content">
	//   87  169:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//   88  172:pop             
			base64variant = ((Base64Variant) (((StringBuilder) (base64variant)).toString()));
	//   89  173:aload_1         
	//   90  174:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   91  177:astore_1        
		} else
	//*  92  178:goto            219
		{
			base64variant = ((Base64Variant) (new StringBuilder()));
	//   93  181:new             #111 <Class StringBuilder>
	//   94  184:dup             
	//   95  185:invokespecial   #114 <Method void StringBuilder()>
	//   96  188:astore_1        
			((StringBuilder) (base64variant)).append("Illegal character (code 0x");
	//   97  189:aload_1         
	//   98  190:ldc2            #632 <String "Illegal character (code 0x">
	//   99  193:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  100  196:pop             
			((StringBuilder) (base64variant)).append(Integer.toHexString(i));
	//  101  197:aload_1         
	//  102  198:iload_2         
	//  103  199:invokestatic    #600 <Method String Integer.toHexString(int)>
	//  104  202:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  105  205:pop             
			((StringBuilder) (base64variant)).append(") in base64 content");
	//  106  206:aload_1         
	//  107  207:ldc2            #630 <String ") in base64 content">
	//  108  210:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  109  213:pop             
			base64variant = ((Base64Variant) (((StringBuilder) (base64variant)).toString()));
	//  110  214:aload_1         
	//  111  215:invokevirtual   #129 <Method String StringBuilder.toString()>
	//  112  218:astore_1        
		}
		Object obj = ((Object) (base64variant));
	//  113  219:aload_1         
	//  114  220:astore          5
		if(s != null)
	//* 115  222:aload           4
	//* 116  224:ifnull          267
		{
			obj = ((Object) (new StringBuilder()));
	//  117  227:new             #111 <Class StringBuilder>
	//  118  230:dup             
	//  119  231:invokespecial   #114 <Method void StringBuilder()>
	//  120  234:astore          5
			((StringBuilder) (obj)).append(((String) (base64variant)));
	//  121  236:aload           5
	//  122  238:aload_1         
	//  123  239:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  124  242:pop             
			((StringBuilder) (obj)).append(": ");
	//  125  243:aload           5
	//  126  245:ldc2            #634 <String ": ">
	//  127  248:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  128  251:pop             
			((StringBuilder) (obj)).append(s);
	//  129  252:aload           5
	//  130  254:aload           4
	//  131  256:invokevirtual   #120 <Method StringBuilder StringBuilder.append(String)>
	//  132  259:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  133  260:aload           5
	//  134  262:invokevirtual   #129 <Method String StringBuilder.toString()>
	//  135  265:astore          5
		}
		return new IllegalArgumentException(((String) (obj)));
	//  136  267:new             #591 <Class IllegalArgumentException>
	//  137  270:dup             
	//  138  271:aload           5
	//  139  273:invokespecial   #635 <Method void IllegalArgumentException(String)>
	//  140  276:areturn         
	}

	protected final JsonToken reset(boolean flag, int i, int j, int k)
	{
		if(j < 1 && k < 1)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:icmpge          18
	//*   3    5:iload           4
	//*   4    7:iconst_1        
	//*   5    8:icmpge          18
			return resetInt(flag, i);
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:iload_2         
	//    9   14:invokevirtual   #640 <Method JsonToken resetInt(boolean, int)>
	//   10   17:areturn         
		else
			return resetFloat(flag, i, j, k);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:iload_2         
	//   14   21:iload_3         
	//   15   22:iload           4
	//   16   24:invokevirtual   #643 <Method JsonToken resetFloat(boolean, int, int, int)>
	//   17   27:areturn         
	}

	protected final JsonToken resetAsNaN(String s, double d)
	{
		_textBuffer.resetWithString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field TextBuffer _textBuffer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #648 <Method void TextBuffer.resetWithString(String)>
		_numberDouble = d;
	//    4    8:aload_0         
	//    5    9:dload_2         
	//    6   10:putfield        #109 <Field double _numberDouble>
		_numTypesValid = 8;
	//    7   13:aload_0         
	//    8   14:bipush          8
	//    9   16:putfield        #55  <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_FLOAT;
	//   10   19:getstatic       #304 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   11   22:areturn         
	}

	protected final JsonToken resetFloat(boolean flag, int i, int j, int k)
	{
		_numberNegative = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #147 <Field boolean _numberNegative>
		_intLength = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #137 <Field int _intLength>
		_fractLength = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #650 <Field int _fractLength>
		_expLength = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #652 <Field int _expLength>
		_numTypesValid = 0;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #55  <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_FLOAT;
	//   15   26:getstatic       #304 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   16   29:areturn         
	}

	protected final JsonToken resetInt(boolean flag, int i)
	{
		_numberNegative = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #147 <Field boolean _numberNegative>
		_intLength = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #137 <Field int _intLength>
		_fractLength = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #650 <Field int _fractLength>
		_expLength = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #652 <Field int _expLength>
		_numTypesValid = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #55  <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_INT;
	//   15   25:getstatic       #279 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   16   28:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		_parsingContext.setCurrentValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field JsonReadContext _parsingContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #656 <Method void JsonReadContext.setCurrentValue(Object)>
	//    4    8:return          
	}

	public JsonParser setFeatureMask(int i)
	{
		int j = _features ^ i;
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field int _features>
	//    2    4:iload_1         
	//    3    5:ixor            
	//    4    6:istore_2        
		if(j != 0)
	//*   5    7:iload_2         
	//*   6    8:ifeq            22
		{
			_features = i;
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:putfield        #236 <Field int _features>
			_checkStdFeatureChanges(i, j);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #589 <Method void _checkStdFeatureChanges(int, int)>
		}
		return ((JsonParser) (this));
	//   14   22:aload_0         
	//   15   23:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #668 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	protected byte _binaryValue[];
	protected ByteArrayBuilder _byteArrayBuilder;
	protected boolean _closed;
	protected long _currInputProcessed;
	protected int _currInputRow;
	protected int _currInputRowStart;
	protected int _expLength;
	protected int _fractLength;
	protected int _inputEnd;
	protected int _inputPtr;
	protected int _intLength;
	protected final IOContext _ioContext;
	protected boolean _nameCopied;
	protected char _nameCopyBuffer[];
	protected JsonToken _nextToken;
	protected int _numTypesValid;
	protected BigDecimal _numberBigDecimal;
	protected BigInteger _numberBigInt;
	protected double _numberDouble;
	protected int _numberInt;
	protected long _numberLong;
	protected boolean _numberNegative;
	protected JsonReadContext _parsingContext;
	protected final TextBuffer _textBuffer;
	protected int _tokenInputCol;
	protected int _tokenInputRow;
	protected long _tokenInputTotal;
}
