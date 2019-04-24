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

// Referenced classes of package com.fasterxml.jackson.core.base:
//			ParserMinimalBase

public abstract class ParserBase extends ParserMinimalBase
{

	protected ParserBase(IOContext iocontext, int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #131 <Method void ParserMinimalBase(int)>
		_currInputRow = 1;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #133 <Field int _currInputRow>
		_tokenInputRow = 1;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #135 <Field int _tokenInputRow>
		_numTypesValid = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #137 <Field int _numTypesValid>
		_ioContext = iocontext;
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:putfield        #139 <Field IOContext _ioContext>
		_textBuffer = iocontext.constructTextBuffer();
	//   15   25:aload_0         
	//   16   26:aload_1         
	//   17   27:invokevirtual   #145 <Method TextBuffer IOContext.constructTextBuffer()>
	//   18   30:putfield        #147 <Field TextBuffer _textBuffer>
		if(com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION.enabledIn(i))
	//*  19   33:getstatic       #153 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.STRICT_DUPLICATE_DETECTION>
	//*  20   36:iload_2         
	//*  21   37:invokevirtual   #157 <Method boolean com.fasterxml.jackson.core.JsonParser$Feature.enabledIn(int)>
	//*  22   40:ifeq            51
			iocontext = ((IOContext) (DupDetector.rootDetector(((JsonParser) (this)))));
	//   23   43:aload_0         
	//   24   44:invokestatic    #163 <Method DupDetector DupDetector.rootDetector(JsonParser)>
	//   25   47:astore_1        
		else
	//*  26   48:goto            53
			iocontext = null;
	//   27   51:aconst_null     
	//   28   52:astore_1        
		_parsingContext = JsonReadContext.createRootContext(((DupDetector) (iocontext)));
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:invokestatic    #169 <Method JsonReadContext JsonReadContext.createRootContext(DupDetector)>
	//   32   58:putfield        #171 <Field JsonReadContext _parsingContext>
	//   33   61:return          
	}

	private void _parseSlowFloat(int i)
		throws IOException
	{
		StringBuilder stringbuilder;
		if(i == 16)
	//*   0    0:iload_1         
	//*   1    1:bipush          16
	//*   2    3:icmpne          24
		{
			try
			{
				_numberBigDecimal = _textBuffer.contentsAsDecimal();
	//    3    6:aload_0         
	//    4    7:aload_0         
	//    5    8:getfield        #147 <Field TextBuffer _textBuffer>
	//    6   11:invokevirtual   #182 <Method BigDecimal TextBuffer.contentsAsDecimal()>
	//    7   14:putfield        #184 <Field BigDecimal _numberBigDecimal>
				_numTypesValid = 16;
	//    8   17:aload_0         
	//    9   18:bipush          16
	//   10   20:putfield        #137 <Field int _numTypesValid>
				return;
	//   11   23:return          
			}
	//*  12   24:aload_0         
	//*  13   25:aload_0         
	//*  14   26:getfield        #147 <Field TextBuffer _textBuffer>
	//*  15   29:invokevirtual   #188 <Method double TextBuffer.contentsAsDouble()>
	//*  16   32:putfield        #190 <Field double _numberDouble>
	//*  17   35:aload_0         
	//*  18   36:bipush          8
	//*  19   38:putfield        #137 <Field int _numTypesValid>
	//*  20   41:return          
	//*  21   42:new             #192 <Class StringBuilder>
	//*  22   45:dup             
	//*  23   46:invokespecial   #194 <Method void StringBuilder()>
	//*  24   49:astore_2        
	//*  25   50:aload_2         
	//*  26   51:ldc1            #196 <String "Malformed numeric value '">
	//*  27   53:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//*  28   56:pop             
	//*  29   57:aload_2         
	//*  30   58:aload_0         
	//*  31   59:getfield        #147 <Field TextBuffer _textBuffer>
	//*  32   62:invokevirtual   #204 <Method String TextBuffer.contentsAsString()>
	//*  33   65:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//*  34   68:pop             
	//*  35   69:aload_2         
	//*  36   70:ldc1            #206 <String "'">
	//*  37   72:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//*  38   75:pop             
	//*  39   76:aload_0         
	//*  40   77:aload_2         
	//*  41   78:invokevirtual   #209 <Method String StringBuilder.toString()>
	//*  42   81:aload_3         
	//*  43   82:invokevirtual   #213 <Method void _wrapError(String, Throwable)>
	//*  44   85:return          
			// Misplaced declaration of an exception variable
			catch(NumberFormatException numberformatexception)
			{
				stringbuilder = new StringBuilder();
			}
			break MISSING_BLOCK_LABEL_50;
		}
		_numberDouble = _textBuffer.contentsAsDouble();
		_numTypesValid = 8;
		return;
		NumberFormatException numberformatexception;
		stringbuilder.append("Malformed numeric value '");
		stringbuilder.append(_textBuffer.contentsAsString());
		stringbuilder.append("'");
		_wrapError(stringbuilder.toString(), ((Throwable) (numberformatexception)));
		return;
	//*  45   86:astore_3        
	//*  46   87:goto            42
	}

	private void _parseSlowInt(int i, char ac[], int j, int k)
		throws IOException
	{
		String s = _textBuffer.contentsAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #204 <Method String TextBuffer.contentsAsString()>
	//    3    7:astore          5
		try
		{
			if(NumberInput.inLongRange(ac, j, k, _numberNegative))
	//*   4    9:aload_2         
	//*   5   10:iload_3         
	//*   6   11:iload           4
	//*   7   13:aload_0         
	//*   8   14:getfield        #218 <Field boolean _numberNegative>
	//*   9   17:invokestatic    #224 <Method boolean NumberInput.inLongRange(char[], int, int, boolean)>
	//*  10   20:ifeq            38
			{
				_numberLong = Long.parseLong(s);
	//   11   23:aload_0         
	//   12   24:aload           5
	//   13   26:invokestatic    #230 <Method long Long.parseLong(String)>
	//   14   29:putfield        #232 <Field long _numberLong>
				_numTypesValid = 2;
	//   15   32:aload_0         
	//   16   33:iconst_2        
	//   17   34:putfield        #137 <Field int _numTypesValid>
				return;
	//   18   37:return          
			}
		}
	//*  19   38:aload_0         
	//*  20   39:new             #96  <Class BigInteger>
	//*  21   42:dup             
	//*  22   43:aload           5
	//*  23   45:invokespecial   #235 <Method void BigInteger(String)>
	//*  24   48:putfield        #237 <Field BigInteger _numberBigInt>
	//*  25   51:aload_0         
	//*  26   52:iconst_4        
	//*  27   53:putfield        #137 <Field int _numTypesValid>
	//*  28   56:return          
		// Misplaced declaration of an exception variable
		catch(char ac[])
	//*  29   57:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   30   58:new             #192 <Class StringBuilder>
	//   31   61:dup             
	//   32   62:invokespecial   #194 <Method void StringBuilder()>
	//   33   65:astore          6
			stringbuilder.append("Malformed numeric value '");
	//   34   67:aload           6
	//   35   69:ldc1            #196 <String "Malformed numeric value '">
	//   36   71:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   37   74:pop             
			stringbuilder.append(s);
	//   38   75:aload           6
	//   39   77:aload           5
	//   40   79:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   41   82:pop             
			stringbuilder.append("'");
	//   42   83:aload           6
	//   43   85:ldc1            #206 <String "'">
	//   44   87:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   45   90:pop             
			_wrapError(stringbuilder.toString(), ((Throwable) (ac)));
	//   46   91:aload_0         
	//   47   92:aload           6
	//   48   94:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   49   97:aload_2         
	//   50   98:invokevirtual   #213 <Method void _wrapError(String, Throwable)>
			return;
	//   51  101:return          
		}
		_numberBigInt = new BigInteger(s);
		_numTypesValid = 4;
		return;
	}

	protected void _checkStdFeatureChanges(int i, int j)
	{
		int k = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
	//    0    0:getstatic       #153 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.STRICT_DUPLICATE_DETECTION>
	//    1    3:invokevirtual   #243 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
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
	//*  12   20:getfield        #171 <Field JsonReadContext _parsingContext>
	//*  13   23:invokevirtual   #247 <Method DupDetector JsonReadContext.getDupDetector()>
	//*  14   26:ifnonnull       45
			{
				_parsingContext = _parsingContext.withDupDetector(DupDetector.rootDetector(((JsonParser) (this))));
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #171 <Field JsonReadContext _parsingContext>
	//   18   34:aload_0         
	//   19   35:invokestatic    #163 <Method DupDetector DupDetector.rootDetector(JsonParser)>
	//   20   38:invokevirtual   #250 <Method JsonReadContext JsonReadContext.withDupDetector(DupDetector)>
	//   21   41:putfield        #171 <Field JsonReadContext _parsingContext>
				return;
	//   22   44:return          
			}
			_parsingContext = _parsingContext.withDupDetector(((DupDetector) (null)));
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #171 <Field JsonReadContext _parsingContext>
	//   26   50:aconst_null     
	//   27   51:invokevirtual   #250 <Method JsonReadContext JsonReadContext.withDupDetector(DupDetector)>
	//   28   54:putfield        #171 <Field JsonReadContext _parsingContext>
		}
	//   29   57:return          
	}

	protected abstract void _closeInput()
		throws IOException;

	protected final int _decodeBase64Escape(Base64Variant base64variant, char c, int i)
		throws IOException
	{
		if(c != '\\')
	//*   0    0:iload_2         
	//*   1    1:bipush          92
	//*   2    3:icmpeq          14
			throw reportInvalidBase64Char(base64variant, ((int) (c)), i);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:invokevirtual   #257 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//    8   13:athrow          
		char c1 = _decodeEscaped();
	//    9   14:aload_0         
	//   10   15:invokevirtual   #261 <Method char _decodeEscaped()>
	//   11   18:istore          4
		if(c1 <= ' ' && i == 0)
	//*  12   20:iload           4
	//*  13   22:bipush          32
	//*  14   24:icmpgt          33
	//*  15   27:iload_3         
	//*  16   28:ifne            33
			return -1;
	//   17   31:iconst_m1       
	//   18   32:ireturn         
		c = ((char) (base64variant.decodeBase64Char(c1)));
	//   19   33:aload_1         
	//   20   34:iload           4
	//   21   36:invokevirtual   #267 <Method int Base64Variant.decodeBase64Char(char)>
	//   22   39:istore_2        
		if(c < 0)
	//*  23   40:iload_2         
	//*  24   41:ifge            53
			throw reportInvalidBase64Char(base64variant, ((int) (c1)), i);
	//   25   44:aload_0         
	//   26   45:aload_1         
	//   27   46:iload           4
	//   28   48:iload_3         
	//   29   49:invokevirtual   #257 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//   30   52:athrow          
		else
			return ((int) (c));
	//   31   53:iload_2         
	//   32   54:ireturn         
	}

	protected final int _decodeBase64Escape(Base64Variant base64variant, int i, int j)
		throws IOException
	{
		if(i != 92)
	//*   0    0:iload_2         
	//*   1    1:bipush          92
	//*   2    3:icmpeq          14
			throw reportInvalidBase64Char(base64variant, i, j);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:iload_2         
	//    6    9:iload_3         
	//    7   10:invokevirtual   #257 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//    8   13:athrow          
		i = ((int) (_decodeEscaped()));
	//    9   14:aload_0         
	//   10   15:invokevirtual   #261 <Method char _decodeEscaped()>
	//   11   18:istore_2        
		if(i <= 32 && j == 0)
	//*  12   19:iload_2         
	//*  13   20:bipush          32
	//*  14   22:icmpgt          31
	//*  15   25:iload_3         
	//*  16   26:ifne            31
			return -1;
	//   17   29:iconst_m1       
	//   18   30:ireturn         
		int k = base64variant.decodeBase64Char(i);
	//   19   31:aload_1         
	//   20   32:iload_2         
	//   21   33:invokevirtual   #271 <Method int Base64Variant.decodeBase64Char(int)>
	//   22   36:istore          4
		if(k < 0)
	//*  23   38:iload           4
	//*  24   40:ifge            51
			throw reportInvalidBase64Char(base64variant, i, j);
	//   25   43:aload_0         
	//   26   44:aload_1         
	//   27   45:iload_2         
	//   28   46:iload_3         
	//   29   47:invokevirtual   #257 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//   30   50:athrow          
		else
			return k;
	//   31   51:iload           4
	//   32   53:ireturn         
	}

	protected char _decodeEscaped()
		throws IOException
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #273 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #274 <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	protected final int _eofAsNextChar()
		throws JsonParseException
	{
		_handleEOF();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #280 <Method void _handleEOF()>
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
		if(_byteArrayBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field ByteArrayBuilder _byteArrayBuilder>
	//*   2    4:ifnonnull       21
			_byteArrayBuilder = new ByteArrayBuilder();
	//    3    7:aload_0         
	//    4    8:new             #287 <Class ByteArrayBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #288 <Method void ByteArrayBuilder()>
	//    7   15:putfield        #285 <Field ByteArrayBuilder _byteArrayBuilder>
		else
	//*   8   18:goto            28
			_byteArrayBuilder.reset();
	//    9   21:aload_0         
	//   10   22:getfield        #285 <Field ByteArrayBuilder _byteArrayBuilder>
	//   11   25:invokevirtual   #291 <Method void ByteArrayBuilder.reset()>
		return _byteArrayBuilder;
	//   12   28:aload_0         
	//   13   29:getfield        #285 <Field ByteArrayBuilder _byteArrayBuilder>
	//   14   32:areturn         
	}

	protected void _handleEOF()
		throws JsonParseException
	{
		if(!_parsingContext.inRoot())
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field JsonReadContext _parsingContext>
	//*   2    4:invokevirtual   #295 <Method boolean JsonReadContext.inRoot()>
	//*   3    7:ifne            67
		{
			String s;
			if(_parsingContext.inArray())
	//*   4   10:aload_0         
	//*   5   11:getfield        #171 <Field JsonReadContext _parsingContext>
	//*   6   14:invokevirtual   #298 <Method boolean JsonReadContext.inArray()>
	//*   7   17:ifeq            27
				s = "Array";
	//    8   20:ldc2            #300 <String "Array">
	//    9   23:astore_1        
			else
	//*  10   24:goto            31
				s = "Object";
	//   11   27:ldc2            #302 <String "Object">
	//   12   30:astore_1        
			_reportInvalidEOF(String.format(": expected close marker for %s (start marker at %s)", new Object[] {
				s, _parsingContext.getStartLocation(_ioContext.getSourceReference())
			}), ((JsonToken) (null)));
	//   13   31:aload_0         
	//   14   32:ldc2            #304 <String ": expected close marker for %s (start marker at %s)">
	//   15   35:iconst_2        
	//   16   36:anewarray       Object[]
	//   17   39:dup             
	//   18   40:iconst_0        
	//   19   41:aload_1         
	//   20   42:aastore         
	//   21   43:dup             
	//   22   44:iconst_1        
	//   23   45:aload_0         
	//   24   46:getfield        #171 <Field JsonReadContext _parsingContext>
	//   25   49:aload_0         
	//   26   50:getfield        #139 <Field IOContext _ioContext>
	//   27   53:invokevirtual   #310 <Method Object IOContext.getSourceReference()>
	//   28   56:invokevirtual   #314 <Method JsonLocation JsonReadContext.getStartLocation(Object)>
	//   29   59:aastore         
	//   30   60:invokestatic    #320 <Method String String.format(String, Object[])>
	//   31   63:aconst_null     
	//   32   64:invokevirtual   #324 <Method void _reportInvalidEOF(String, JsonToken)>
		}
	//   33   67:return          
	}

	protected int _parseIntValue()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #328 <Field JsonToken _currToken>
	//*   2    4:getstatic       #333 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       83
		{
			char ac[] = _textBuffer.getTextBuffer();
	//    4   10:aload_0         
	//    5   11:getfield        #147 <Field TextBuffer _textBuffer>
	//    6   14:invokevirtual   #337 <Method char[] TextBuffer.getTextBuffer()>
	//    7   17:astore          4
			int j = _textBuffer.getTextOffset();
	//    8   19:aload_0         
	//    9   20:getfield        #147 <Field TextBuffer _textBuffer>
	//   10   23:invokevirtual   #340 <Method int TextBuffer.getTextOffset()>
	//   11   26:istore_2        
			int l = _intLength;
	//   12   27:aload_0         
	//   13   28:getfield        #342 <Field int _intLength>
	//   14   31:istore_3        
			int i = j;
	//   15   32:iload_2         
	//   16   33:istore_1        
			if(_numberNegative)
	//*  17   34:aload_0         
	//*  18   35:getfield        #218 <Field boolean _numberNegative>
	//*  19   38:ifeq            45
				i = j + 1;
	//   20   41:iload_2         
	//   21   42:iconst_1        
	//   22   43:iadd            
	//   23   44:istore_1        
			if(l <= 9)
	//*  24   45:iload_3         
	//*  25   46:bipush          9
	//*  26   48:icmpgt          83
			{
				int k = NumberInput.parseInt(ac, i, l);
	//   27   51:aload           4
	//   28   53:iload_1         
	//   29   54:iload_3         
	//   30   55:invokestatic    #346 <Method int NumberInput.parseInt(char[], int, int)>
	//   31   58:istore_2        
				i = k;
	//   32   59:iload_2         
	//   33   60:istore_1        
				if(_numberNegative)
	//*  34   61:aload_0         
	//*  35   62:getfield        #218 <Field boolean _numberNegative>
	//*  36   65:ifeq            71
					i = -k;
	//   37   68:iload_2         
	//   38   69:ineg            
	//   39   70:istore_1        
				_numberInt = i;
	//   40   71:aload_0         
	//   41   72:iload_1         
	//   42   73:putfield        #348 <Field int _numberInt>
				_numTypesValid = 1;
	//   43   76:aload_0         
	//   44   77:iconst_1        
	//   45   78:putfield        #137 <Field int _numTypesValid>
				return i;
	//   46   81:iload_1         
	//   47   82:ireturn         
			}
		}
		_parseNumericValue(1);
	//   48   83:aload_0         
	//   49   84:iconst_1        
	//   50   85:invokevirtual   #351 <Method void _parseNumericValue(int)>
		if((_numTypesValid & 1) == 0)
	//*  51   88:aload_0         
	//*  52   89:getfield        #137 <Field int _numTypesValid>
	//*  53   92:iconst_1        
	//*  54   93:iand            
	//*  55   94:ifne            101
			convertNumberToInt();
	//   56   97:aload_0         
	//   57   98:invokevirtual   #354 <Method void convertNumberToInt()>
		return _numberInt;
	//   58  101:aload_0         
	//   59  102:getfield        #348 <Field int _numberInt>
	//   60  105:ireturn         
	}

	protected void _parseNumericValue(int i)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #328 <Field JsonToken _currToken>
	//*   2    4:getstatic       #333 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       199
		{
			char ac[] = _textBuffer.getTextBuffer();
	//    4   10:aload_0         
	//    5   11:getfield        #147 <Field TextBuffer _textBuffer>
	//    6   14:invokevirtual   #337 <Method char[] TextBuffer.getTextBuffer()>
	//    7   17:astore          9
			int k = _textBuffer.getTextOffset();
	//    8   19:aload_0         
	//    9   20:getfield        #147 <Field TextBuffer _textBuffer>
	//   10   23:invokevirtual   #340 <Method int TextBuffer.getTextOffset()>
	//   11   26:istore_3        
			int l = _intLength;
	//   12   27:aload_0         
	//   13   28:getfield        #342 <Field int _intLength>
	//   14   31:istore          4
			int j = k;
	//   15   33:iload_3         
	//   16   34:istore_2        
			if(_numberNegative)
	//*  17   35:aload_0         
	//*  18   36:getfield        #218 <Field boolean _numberNegative>
	//*  19   39:ifeq            46
				j = k + 1;
	//   20   42:iload_3         
	//   21   43:iconst_1        
	//   22   44:iadd            
	//   23   45:istore_2        
			if(l <= 9)
	//*  24   46:iload           4
	//*  25   48:bipush          9
	//*  26   50:icmpgt          85
			{
				j = NumberInput.parseInt(ac, j, l);
	//   27   53:aload           9
	//   28   55:iload_2         
	//   29   56:iload           4
	//   30   58:invokestatic    #346 <Method int NumberInput.parseInt(char[], int, int)>
	//   31   61:istore_2        
				i = j;
	//   32   62:iload_2         
	//   33   63:istore_1        
				if(_numberNegative)
	//*  34   64:aload_0         
	//*  35   65:getfield        #218 <Field boolean _numberNegative>
	//*  36   68:ifeq            74
					i = -j;
	//   37   71:iload_2         
	//   38   72:ineg            
	//   39   73:istore_1        
				_numberInt = i;
	//   40   74:aload_0         
	//   41   75:iload_1         
	//   42   76:putfield        #348 <Field int _numberInt>
				_numTypesValid = 1;
	//   43   79:aload_0         
	//   44   80:iconst_1        
	//   45   81:putfield        #137 <Field int _numTypesValid>
				return;
	//   46   84:return          
			}
			if(l <= 18)
	//*  47   85:iload           4
	//*  48   87:bipush          18
	//*  49   89:icmpgt          188
			{
				long l2 = NumberInput.parseLong(ac, j, l);
	//   50   92:aload           9
	//   51   94:iload_2         
	//   52   95:iload           4
	//   53   97:invokestatic    #357 <Method long NumberInput.parseLong(char[], int, int)>
	//   54  100:lstore          7
				long l1 = l2;
	//   55  102:lload           7
	//   56  104:lstore          5
				if(_numberNegative)
	//*  57  106:aload_0         
	//*  58  107:getfield        #218 <Field boolean _numberNegative>
	//*  59  110:ifeq            118
					l1 = -l2;
	//   60  113:lload           7
	//   61  115:lneg            
	//   62  116:lstore          5
				if(l == 10)
	//*  63  118:iload           4
	//*  64  120:bipush          10
	//*  65  122:icmpne          176
					if(_numberNegative)
	//*  66  125:aload_0         
	//*  67  126:getfield        #218 <Field boolean _numberNegative>
	//*  68  129:ifeq            154
					{
						if(l1 >= 0x80000000L)
	//*  69  132:lload           5
	//*  70  134:ldc2w           #42  <Long 0x80000000L>
	//*  71  137:lcmp            
	//*  72  138:iflt            176
						{
							_numberInt = (int)l1;
	//   73  141:aload_0         
	//   74  142:lload           5
	//   75  144:l2i             
	//   76  145:putfield        #348 <Field int _numberInt>
							_numTypesValid = 1;
	//   77  148:aload_0         
	//   78  149:iconst_1        
	//   79  150:putfield        #137 <Field int _numTypesValid>
							return;
	//   80  153:return          
						}
					} else
					if(l1 <= 0x7fffffffL)
	//*  81  154:lload           5
	//*  82  156:ldc2w           #33  <Long 0x7fffffffL>
	//*  83  159:lcmp            
	//*  84  160:ifgt            176
					{
						_numberInt = (int)l1;
	//   85  163:aload_0         
	//   86  164:lload           5
	//   87  166:l2i             
	//   88  167:putfield        #348 <Field int _numberInt>
						_numTypesValid = 1;
	//   89  170:aload_0         
	//   90  171:iconst_1        
	//   91  172:putfield        #137 <Field int _numTypesValid>
						return;
	//   92  175:return          
					}
				_numberLong = l1;
	//   93  176:aload_0         
	//   94  177:lload           5
	//   95  179:putfield        #232 <Field long _numberLong>
				_numTypesValid = 2;
	//   96  182:aload_0         
	//   97  183:iconst_2        
	//   98  184:putfield        #137 <Field int _numTypesValid>
				return;
	//   99  187:return          
			} else
			{
				_parseSlowInt(i, ac, j, l);
	//  100  188:aload_0         
	//  101  189:iload_1         
	//  102  190:aload           9
	//  103  192:iload_2         
	//  104  193:iload           4
	//  105  195:invokespecial   #359 <Method void _parseSlowInt(int, char[], int, int)>
				return;
	//  106  198:return          
			}
		}
		if(_currToken == JsonToken.VALUE_NUMBER_FLOAT)
	//* 107  199:aload_0         
	//* 108  200:getfield        #328 <Field JsonToken _currToken>
	//* 109  203:getstatic       #362 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//* 110  206:if_acmpne       215
		{
			_parseSlowFloat(i);
	//  111  209:aload_0         
	//  112  210:iload_1         
	//  113  211:invokespecial   #364 <Method void _parseSlowFloat(int)>
			return;
	//  114  214:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//  115  215:new             #192 <Class StringBuilder>
	//  116  218:dup             
	//  117  219:invokespecial   #194 <Method void StringBuilder()>
	//  118  222:astore          9
			stringbuilder.append("Current token (");
	//  119  224:aload           9
	//  120  226:ldc2            #366 <String "Current token (">
	//  121  229:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  122  232:pop             
			stringbuilder.append(((Object) (_currToken)));
	//  123  233:aload           9
	//  124  235:aload_0         
	//  125  236:getfield        #328 <Field JsonToken _currToken>
	//  126  239:invokevirtual   #369 <Method StringBuilder StringBuilder.append(Object)>
	//  127  242:pop             
			stringbuilder.append(") not numeric, can not use numeric value accessors");
	//  128  243:aload           9
	//  129  245:ldc2            #371 <String ") not numeric, can not use numeric value accessors">
	//  130  248:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  131  251:pop             
			_reportError(stringbuilder.toString());
	//  132  252:aload_0         
	//  133  253:aload           9
	//  134  255:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  135  258:invokevirtual   #374 <Method void _reportError(String)>
			return;
	//  136  261:return          
		}
	}

	protected void _releaseBuffers()
		throws IOException
	{
		_textBuffer.releaseBuffers();
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #378 <Method void TextBuffer.releaseBuffers()>
		char ac[] = _nameCopyBuffer;
	//    3    7:aload_0         
	//    4    8:getfield        #380 <Field char[] _nameCopyBuffer>
	//    5   11:astore_1        
		if(ac != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          29
		{
			_nameCopyBuffer = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #380 <Field char[] _nameCopyBuffer>
			_ioContext.releaseNameCopyBuffer(ac);
	//   11   21:aload_0         
	//   12   22:getfield        #139 <Field IOContext _ioContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #384 <Method void IOContext.releaseNameCopyBuffer(char[])>
		}
	//   15   29:return          
	}

	protected void _reportMismatchedEndMarker(int i, char c)
		throws JsonParseException
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #192 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #194 <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append("");
	//    4    8:aload_3         
	//    5    9:ldc2            #388 <String "">
	//    6   12:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(((Object) (_parsingContext.getStartLocation(_ioContext.getSourceReference()))));
	//    8   16:aload_3         
	//    9   17:aload_0         
	//   10   18:getfield        #171 <Field JsonReadContext _parsingContext>
	//   11   21:aload_0         
	//   12   22:getfield        #139 <Field IOContext _ioContext>
	//   13   25:invokevirtual   #310 <Method Object IOContext.getSourceReference()>
	//   14   28:invokevirtual   #314 <Method JsonLocation JsonReadContext.getStartLocation(Object)>
	//   15   31:invokevirtual   #369 <Method StringBuilder StringBuilder.append(Object)>
	//   16   34:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   17   35:aload_3         
	//   18   36:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   19   39:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   20   40:new             #192 <Class StringBuilder>
	//   21   43:dup             
	//   22   44:invokespecial   #194 <Method void StringBuilder()>
	//   23   47:astore          4
		stringbuilder.append("Unexpected close marker '");
	//   24   49:aload           4
	//   25   51:ldc2            #390 <String "Unexpected close marker '">
	//   26   54:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   27   57:pop             
		stringbuilder.append((char)i);
	//   28   58:aload           4
	//   29   60:iload_1         
	//   30   61:int2char        
	//   31   62:invokevirtual   #393 <Method StringBuilder StringBuilder.append(char)>
	//   32   65:pop             
		stringbuilder.append("': expected '");
	//   33   66:aload           4
	//   34   68:ldc2            #395 <String "': expected '">
	//   35   71:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
		stringbuilder.append(c);
	//   37   75:aload           4
	//   38   77:iload_2         
	//   39   78:invokevirtual   #393 <Method StringBuilder StringBuilder.append(char)>
	//   40   81:pop             
		stringbuilder.append("' (for ");
	//   41   82:aload           4
	//   42   84:ldc2            #397 <String "' (for ">
	//   43   87:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   44   90:pop             
		stringbuilder.append(_parsingContext.typeDesc());
	//   45   91:aload           4
	//   46   93:aload_0         
	//   47   94:getfield        #171 <Field JsonReadContext _parsingContext>
	//   48   97:invokevirtual   #400 <Method String JsonReadContext.typeDesc()>
	//   49  100:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   50  103:pop             
		stringbuilder.append(" starting at ");
	//   51  104:aload           4
	//   52  106:ldc2            #402 <String " starting at ">
	//   53  109:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   54  112:pop             
		stringbuilder.append(((String) (obj)));
	//   55  113:aload           4
	//   56  115:aload_3         
	//   57  116:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   58  119:pop             
		stringbuilder.append(")");
	//   59  120:aload           4
	//   60  122:ldc2            #404 <String ")">
	//   61  125:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   62  128:pop             
		_reportError(stringbuilder.toString());
	//   63  129:aload_0         
	//   64  130:aload           4
	//   65  132:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   66  135:invokevirtual   #374 <Method void _reportError(String)>
	//   67  138:return          
	}

	public void close()
		throws IOException
	{
		if(_closed)
			break MISSING_BLOCK_LABEL_28;
	//    0    0:aload_0         
	//    1    1:getfield        #407 <Field boolean _closed>
	//    2    4:ifne            28
		_closed = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #407 <Field boolean _closed>
		_closeInput();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #409 <Method void _closeInput()>
		_releaseBuffers();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #411 <Method void _releaseBuffers()>
		return;
	//   10   20:return          
		Exception exception;
		exception;
	//   11   21:astore_1        
		_releaseBuffers();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #411 <Method void _releaseBuffers()>
		throw exception;
	//   14   26:aload_1         
	//   15   27:athrow          
	//   16   28:return          
	}

	protected void convertNumberToBigDecimal()
		throws IOException
	{
		if((_numTypesValid & 8) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:ifeq            24
			_numberBigDecimal = NumberInput.parseBigDecimal(getText());
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #415 <Method String getText()>
	//    8   15:invokestatic    #419 <Method BigDecimal NumberInput.parseBigDecimal(String)>
	//    9   18:putfield        #184 <Field BigDecimal _numberBigDecimal>
		else
	//*  10   21:goto            102
		if((_numTypesValid & 4) != 0)
	//*  11   24:aload_0         
	//*  12   25:getfield        #137 <Field int _numTypesValid>
	//*  13   28:iconst_4        
	//*  14   29:iand            
	//*  15   30:ifeq            51
			_numberBigDecimal = new BigDecimal(_numberBigInt);
	//   16   33:aload_0         
	//   17   34:new             #114 <Class BigDecimal>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:getfield        #237 <Field BigInteger _numberBigInt>
	//   21   42:invokespecial   #118 <Method void BigDecimal(BigInteger)>
	//   22   45:putfield        #184 <Field BigDecimal _numberBigDecimal>
		else
	//*  23   48:goto            102
		if((_numTypesValid & 2) != 0)
	//*  24   51:aload_0         
	//*  25   52:getfield        #137 <Field int _numTypesValid>
	//*  26   55:iconst_2        
	//*  27   56:iand            
	//*  28   57:ifeq            74
			_numberBigDecimal = BigDecimal.valueOf(_numberLong);
	//   29   60:aload_0         
	//   30   61:aload_0         
	//   31   62:getfield        #232 <Field long _numberLong>
	//   32   65:invokestatic    #422 <Method BigDecimal BigDecimal.valueOf(long)>
	//   33   68:putfield        #184 <Field BigDecimal _numberBigDecimal>
		else
	//*  34   71:goto            102
		if((_numTypesValid & 1) != 0)
	//*  35   74:aload_0         
	//*  36   75:getfield        #137 <Field int _numTypesValid>
	//*  37   78:iconst_1        
	//*  38   79:iand            
	//*  39   80:ifeq            98
			_numberBigDecimal = BigDecimal.valueOf(_numberInt);
	//   40   83:aload_0         
	//   41   84:aload_0         
	//   42   85:getfield        #348 <Field int _numberInt>
	//   43   88:i2l             
	//   44   89:invokestatic    #422 <Method BigDecimal BigDecimal.valueOf(long)>
	//   45   92:putfield        #184 <Field BigDecimal _numberBigDecimal>
		else
	//*  46   95:goto            102
			_throwInternal();
	//   47   98:aload_0         
	//   48   99:invokevirtual   #425 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 0x10;
	//   49  102:aload_0         
	//   50  103:aload_0         
	//   51  104:getfield        #137 <Field int _numTypesValid>
	//   52  107:bipush          16
	//   53  109:ior             
	//   54  110:putfield        #137 <Field int _numTypesValid>
	//   55  113:return          
	}

	protected void convertNumberToBigInteger()
		throws IOException
	{
		if((_numTypesValid & 0x10) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:bipush          16
	//*   3    6:iand            
	//*   4    7:ifeq            24
			_numberBigInt = _numberBigDecimal.toBigInteger();
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//    8   15:invokevirtual   #430 <Method BigInteger BigDecimal.toBigInteger()>
	//    9   18:putfield        #237 <Field BigInteger _numberBigInt>
		else
	//*  10   21:goto            102
		if((_numTypesValid & 2) != 0)
	//*  11   24:aload_0         
	//*  12   25:getfield        #137 <Field int _numTypesValid>
	//*  13   28:iconst_2        
	//*  14   29:iand            
	//*  15   30:ifeq            47
			_numberBigInt = BigInteger.valueOf(_numberLong);
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:getfield        #232 <Field long _numberLong>
	//   19   38:invokestatic    #100 <Method BigInteger BigInteger.valueOf(long)>
	//   20   41:putfield        #237 <Field BigInteger _numberBigInt>
		else
	//*  21   44:goto            102
		if((_numTypesValid & 1) != 0)
	//*  22   47:aload_0         
	//*  23   48:getfield        #137 <Field int _numTypesValid>
	//*  24   51:iconst_1        
	//*  25   52:iand            
	//*  26   53:ifeq            71
			_numberBigInt = BigInteger.valueOf(_numberInt);
	//   27   56:aload_0         
	//   28   57:aload_0         
	//   29   58:getfield        #348 <Field int _numberInt>
	//   30   61:i2l             
	//   31   62:invokestatic    #100 <Method BigInteger BigInteger.valueOf(long)>
	//   32   65:putfield        #237 <Field BigInteger _numberBigInt>
		else
	//*  33   68:goto            102
		if((_numTypesValid & 8) != 0)
	//*  34   71:aload_0         
	//*  35   72:getfield        #137 <Field int _numTypesValid>
	//*  36   75:bipush          8
	//*  37   77:iand            
	//*  38   78:ifeq            98
			_numberBigInt = BigDecimal.valueOf(_numberDouble).toBigInteger();
	//   39   81:aload_0         
	//   40   82:aload_0         
	//   41   83:getfield        #190 <Field double _numberDouble>
	//   42   86:invokestatic    #433 <Method BigDecimal BigDecimal.valueOf(double)>
	//   43   89:invokevirtual   #430 <Method BigInteger BigDecimal.toBigInteger()>
	//   44   92:putfield        #237 <Field BigInteger _numberBigInt>
		else
	//*  45   95:goto            102
			_throwInternal();
	//   46   98:aload_0         
	//   47   99:invokevirtual   #425 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 4;
	//   48  102:aload_0         
	//   49  103:aload_0         
	//   50  104:getfield        #137 <Field int _numTypesValid>
	//   51  107:iconst_4        
	//   52  108:ior             
	//   53  109:putfield        #137 <Field int _numTypesValid>
	//   54  112:return          
	}

	protected void convertNumberToDouble()
		throws IOException
	{
		if((_numTypesValid & 0x10) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:bipush          16
	//*   3    6:iand            
	//*   4    7:ifeq            24
			_numberDouble = _numberBigDecimal.doubleValue();
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//    8   15:invokevirtual   #437 <Method double BigDecimal.doubleValue()>
	//    9   18:putfield        #190 <Field double _numberDouble>
		else
	//*  10   21:goto            93
		if((_numTypesValid & 4) != 0)
	//*  11   24:aload_0         
	//*  12   25:getfield        #137 <Field int _numTypesValid>
	//*  13   28:iconst_4        
	//*  14   29:iand            
	//*  15   30:ifeq            47
			_numberDouble = _numberBigInt.doubleValue();
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:getfield        #237 <Field BigInteger _numberBigInt>
	//   19   38:invokevirtual   #438 <Method double BigInteger.doubleValue()>
	//   20   41:putfield        #190 <Field double _numberDouble>
		else
	//*  21   44:goto            93
		if((_numTypesValid & 2) != 0)
	//*  22   47:aload_0         
	//*  23   48:getfield        #137 <Field int _numTypesValid>
	//*  24   51:iconst_2        
	//*  25   52:iand            
	//*  26   53:ifeq            68
			_numberDouble = _numberLong;
	//   27   56:aload_0         
	//   28   57:aload_0         
	//   29   58:getfield        #232 <Field long _numberLong>
	//   30   61:l2d             
	//   31   62:putfield        #190 <Field double _numberDouble>
		else
	//*  32   65:goto            93
		if((_numTypesValid & 1) != 0)
	//*  33   68:aload_0         
	//*  34   69:getfield        #137 <Field int _numTypesValid>
	//*  35   72:iconst_1        
	//*  36   73:iand            
	//*  37   74:ifeq            89
			_numberDouble = _numberInt;
	//   38   77:aload_0         
	//   39   78:aload_0         
	//   40   79:getfield        #348 <Field int _numberInt>
	//   41   82:i2d             
	//   42   83:putfield        #190 <Field double _numberDouble>
		else
	//*  43   86:goto            93
			_throwInternal();
	//   44   89:aload_0         
	//   45   90:invokevirtual   #425 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 8;
	//   46   93:aload_0         
	//   47   94:aload_0         
	//   48   95:getfield        #137 <Field int _numTypesValid>
	//   49   98:bipush          8
	//   50  100:ior             
	//   51  101:putfield        #137 <Field int _numTypesValid>
	//   52  104:return          
	}

	protected void convertNumberToInt()
		throws IOException
	{
		if((_numTypesValid & 2) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifeq            74
		{
			int i = (int)_numberLong;
	//    5    9:aload_0         
	//    6   10:getfield        #232 <Field long _numberLong>
	//    7   13:l2i             
	//    8   14:istore_1        
			if((long)i != _numberLong)
	//*   9   15:iload_1         
	//*  10   16:i2l             
	//*  11   17:aload_0         
	//*  12   18:getfield        #232 <Field long _numberLong>
	//*  13   21:lcmp            
	//*  14   22:ifeq            66
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   15   25:new             #192 <Class StringBuilder>
	//   16   28:dup             
	//   17   29:invokespecial   #194 <Method void StringBuilder()>
	//   18   32:astore_2        
				stringbuilder.append("Numeric value (");
	//   19   33:aload_2         
	//   20   34:ldc2            #440 <String "Numeric value (">
	//   21   37:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   22   40:pop             
				stringbuilder.append(getText());
	//   23   41:aload_2         
	//   24   42:aload_0         
	//   25   43:invokevirtual   #415 <Method String getText()>
	//   26   46:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   27   49:pop             
				stringbuilder.append(") out of range of int");
	//   28   50:aload_2         
	//   29   51:ldc2            #442 <String ") out of range of int">
	//   30   54:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   31   57:pop             
				_reportError(stringbuilder.toString());
	//   32   58:aload_0         
	//   33   59:aload_2         
	//   34   60:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   35   63:invokevirtual   #374 <Method void _reportError(String)>
			}
			_numberInt = i;
	//   36   66:aload_0         
	//   37   67:iload_1         
	//   38   68:putfield        #348 <Field int _numberInt>
		} else
	//*  39   71:goto            233
		if((_numTypesValid & 4) != 0)
	//*  40   74:aload_0         
	//*  41   75:getfield        #137 <Field int _numTypesValid>
	//*  42   78:iconst_4        
	//*  43   79:iand            
	//*  44   80:ifeq            127
		{
			if(BI_MIN_INT.compareTo(_numberBigInt) > 0 || BI_MAX_INT.compareTo(_numberBigInt) < 0)
	//*  45   83:getstatic       #102 <Field BigInteger BI_MIN_INT>
	//*  46   86:aload_0         
	//*  47   87:getfield        #237 <Field BigInteger _numberBigInt>
	//*  48   90:invokevirtual   #446 <Method int BigInteger.compareTo(BigInteger)>
	//*  49   93:ifgt            109
	//*  50   96:getstatic       #104 <Field BigInteger BI_MAX_INT>
	//*  51   99:aload_0         
	//*  52  100:getfield        #237 <Field BigInteger _numberBigInt>
	//*  53  103:invokevirtual   #446 <Method int BigInteger.compareTo(BigInteger)>
	//*  54  106:ifge            113
				reportOverflowInt();
	//   55  109:aload_0         
	//   56  110:invokevirtual   #449 <Method void reportOverflowInt()>
			_numberInt = _numberBigInt.intValue();
	//   57  113:aload_0         
	//   58  114:aload_0         
	//   59  115:getfield        #237 <Field BigInteger _numberBigInt>
	//   60  118:invokevirtual   #452 <Method int BigInteger.intValue()>
	//   61  121:putfield        #348 <Field int _numberInt>
		} else
	//*  62  124:goto            233
		if((_numTypesValid & 8) != 0)
	//*  63  127:aload_0         
	//*  64  128:getfield        #137 <Field int _numTypesValid>
	//*  65  131:bipush          8
	//*  66  133:iand            
	//*  67  134:ifeq            175
		{
			if(_numberDouble < -2147483648D || _numberDouble > 2147483647D)
	//*  68  137:aload_0         
	//*  69  138:getfield        #190 <Field double _numberDouble>
	//*  70  141:ldc2w           #39  <Double -2147483648D>
	//*  71  144:dcmpg           
	//*  72  145:iflt            159
	//*  73  148:aload_0         
	//*  74  149:getfield        #190 <Field double _numberDouble>
	//*  75  152:ldc2w           #29  <Double 2147483647D>
	//*  76  155:dcmpl           
	//*  77  156:ifle            163
				reportOverflowInt();
	//   78  159:aload_0         
	//   79  160:invokevirtual   #449 <Method void reportOverflowInt()>
			_numberInt = (int)_numberDouble;
	//   80  163:aload_0         
	//   81  164:aload_0         
	//   82  165:getfield        #190 <Field double _numberDouble>
	//   83  168:d2i             
	//   84  169:putfield        #348 <Field int _numberInt>
		} else
	//*  85  172:goto            233
		if((_numTypesValid & 0x10) != 0)
	//*  86  175:aload_0         
	//*  87  176:getfield        #137 <Field int _numTypesValid>
	//*  88  179:bipush          16
	//*  89  181:iand            
	//*  90  182:ifeq            229
		{
			if(BD_MIN_INT.compareTo(_numberBigDecimal) > 0 || BD_MAX_INT.compareTo(_numberBigDecimal) < 0)
	//*  91  185:getstatic       #124 <Field BigDecimal BD_MIN_INT>
	//*  92  188:aload_0         
	//*  93  189:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//*  94  192:invokevirtual   #455 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  95  195:ifgt            211
	//*  96  198:getstatic       #126 <Field BigDecimal BD_MAX_INT>
	//*  97  201:aload_0         
	//*  98  202:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//*  99  205:invokevirtual   #455 <Method int BigDecimal.compareTo(BigDecimal)>
	//* 100  208:ifge            215
				reportOverflowInt();
	//  101  211:aload_0         
	//  102  212:invokevirtual   #449 <Method void reportOverflowInt()>
			_numberInt = _numberBigDecimal.intValue();
	//  103  215:aload_0         
	//  104  216:aload_0         
	//  105  217:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//  106  220:invokevirtual   #456 <Method int BigDecimal.intValue()>
	//  107  223:putfield        #348 <Field int _numberInt>
		} else
	//* 108  226:goto            233
		{
			_throwInternal();
	//  109  229:aload_0         
	//  110  230:invokevirtual   #425 <Method void _throwInternal()>
		}
		_numTypesValid = _numTypesValid | 1;
	//  111  233:aload_0         
	//  112  234:aload_0         
	//  113  235:getfield        #137 <Field int _numTypesValid>
	//  114  238:iconst_1        
	//  115  239:ior             
	//  116  240:putfield        #137 <Field int _numTypesValid>
	//  117  243:return          
	}

	protected void convertNumberToLong()
		throws IOException
	{
		if((_numTypesValid & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:ifeq            21
			_numberLong = _numberInt;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #348 <Field int _numberInt>
	//    8   14:i2l             
	//    9   15:putfield        #232 <Field long _numberLong>
		else
	//*  10   18:goto            180
		if((_numTypesValid & 4) != 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #137 <Field int _numTypesValid>
	//*  13   25:iconst_4        
	//*  14   26:iand            
	//*  15   27:ifeq            74
		{
			if(BI_MIN_LONG.compareTo(_numberBigInt) > 0 || BI_MAX_LONG.compareTo(_numberBigInt) < 0)
	//*  16   30:getstatic       #108 <Field BigInteger BI_MIN_LONG>
	//*  17   33:aload_0         
	//*  18   34:getfield        #237 <Field BigInteger _numberBigInt>
	//*  19   37:invokevirtual   #446 <Method int BigInteger.compareTo(BigInteger)>
	//*  20   40:ifgt            56
	//*  21   43:getstatic       #112 <Field BigInteger BI_MAX_LONG>
	//*  22   46:aload_0         
	//*  23   47:getfield        #237 <Field BigInteger _numberBigInt>
	//*  24   50:invokevirtual   #446 <Method int BigInteger.compareTo(BigInteger)>
	//*  25   53:ifge            60
				reportOverflowLong();
	//   26   56:aload_0         
	//   27   57:invokevirtual   #460 <Method void reportOverflowLong()>
			_numberLong = _numberBigInt.longValue();
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #237 <Field BigInteger _numberBigInt>
	//   31   65:invokevirtual   #464 <Method long BigInteger.longValue()>
	//   32   68:putfield        #232 <Field long _numberLong>
		} else
	//*  33   71:goto            180
		if((_numTypesValid & 8) != 0)
	//*  34   74:aload_0         
	//*  35   75:getfield        #137 <Field int _numTypesValid>
	//*  36   78:bipush          8
	//*  37   80:iand            
	//*  38   81:ifeq            122
		{
			if(_numberDouble < -9.2233720368547758E+18D || _numberDouble > 9.2233720368547758E+18D)
	//*  39   84:aload_0         
	//*  40   85:getfield        #190 <Field double _numberDouble>
	//*  41   88:ldc2w           #45  <Double -9.2233720368547758E+18D>
	//*  42   91:dcmpg           
	//*  43   92:iflt            106
	//*  44   95:aload_0         
	//*  45   96:getfield        #190 <Field double _numberDouble>
	//*  46   99:ldc2w           #36  <Double 9.2233720368547758E+18D>
	//*  47  102:dcmpl           
	//*  48  103:ifle            110
				reportOverflowLong();
	//   49  106:aload_0         
	//   50  107:invokevirtual   #460 <Method void reportOverflowLong()>
			_numberLong = (long)_numberDouble;
	//   51  110:aload_0         
	//   52  111:aload_0         
	//   53  112:getfield        #190 <Field double _numberDouble>
	//   54  115:d2l             
	//   55  116:putfield        #232 <Field long _numberLong>
		} else
	//*  56  119:goto            180
		if((_numTypesValid & 0x10) != 0)
	//*  57  122:aload_0         
	//*  58  123:getfield        #137 <Field int _numTypesValid>
	//*  59  126:bipush          16
	//*  60  128:iand            
	//*  61  129:ifeq            176
		{
			if(BD_MIN_LONG.compareTo(_numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(_numberBigDecimal) < 0)
	//*  62  132:getstatic       #120 <Field BigDecimal BD_MIN_LONG>
	//*  63  135:aload_0         
	//*  64  136:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//*  65  139:invokevirtual   #455 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  66  142:ifgt            158
	//*  67  145:getstatic       #122 <Field BigDecimal BD_MAX_LONG>
	//*  68  148:aload_0         
	//*  69  149:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//*  70  152:invokevirtual   #455 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  71  155:ifge            162
				reportOverflowLong();
	//   72  158:aload_0         
	//   73  159:invokevirtual   #460 <Method void reportOverflowLong()>
			_numberLong = _numberBigDecimal.longValue();
	//   74  162:aload_0         
	//   75  163:aload_0         
	//   76  164:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//   77  167:invokevirtual   #465 <Method long BigDecimal.longValue()>
	//   78  170:putfield        #232 <Field long _numberLong>
		} else
	//*  79  173:goto            180
		{
			_throwInternal();
	//   80  176:aload_0         
	//   81  177:invokevirtual   #425 <Method void _throwInternal()>
		}
		_numTypesValid = _numTypesValid | 2;
	//   82  180:aload_0         
	//   83  181:aload_0         
	//   84  182:getfield        #137 <Field int _numTypesValid>
	//   85  185:iconst_2        
	//   86  186:ior             
	//   87  187:putfield        #137 <Field int _numTypesValid>
	//   88  190:return          
	}

	public JsonParser disable(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		_features = _features & ~feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #470 <Field int _features>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #243 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    5    9:iconst_m1       
	//    6   10:ixor            
	//    7   11:iand            
	//    8   12:putfield        #470 <Field int _features>
		if(feature == com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION)
	//*   9   15:aload_1         
	//*  10   16:getstatic       #153 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.STRICT_DUPLICATE_DETECTION>
	//*  11   19:if_acmpne       34
			_parsingContext = _parsingContext.withDupDetector(((DupDetector) (null)));
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #171 <Field JsonReadContext _parsingContext>
	//   15   27:aconst_null     
	//   16   28:invokevirtual   #250 <Method JsonReadContext JsonReadContext.withDupDetector(DupDetector)>
	//   17   31:putfield        #171 <Field JsonReadContext _parsingContext>
		return ((JsonParser) (this));
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	public JsonParser enable(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		_features = _features | feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #470 <Field int _features>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #243 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    5    9:ior             
	//    6   10:putfield        #470 <Field int _features>
		if(feature == com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION && _parsingContext.getDupDetector() == null)
	//*   7   13:aload_1         
	//*   8   14:getstatic       #153 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.STRICT_DUPLICATE_DETECTION>
	//*   9   17:if_acmpne       45
	//*  10   20:aload_0         
	//*  11   21:getfield        #171 <Field JsonReadContext _parsingContext>
	//*  12   24:invokevirtual   #247 <Method DupDetector JsonReadContext.getDupDetector()>
	//*  13   27:ifnonnull       45
			_parsingContext = _parsingContext.withDupDetector(DupDetector.rootDetector(((JsonParser) (this))));
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #171 <Field JsonReadContext _parsingContext>
	//   17   35:aload_0         
	//   18   36:invokestatic    #163 <Method DupDetector DupDetector.rootDetector(JsonParser)>
	//   19   39:invokevirtual   #250 <Method JsonReadContext JsonReadContext.withDupDetector(DupDetector)>
	//   20   42:putfield        #171 <Field JsonReadContext _parsingContext>
		return ((JsonParser) (this));
	//   21   45:aload_0         
	//   22   46:areturn         
	}

	public BigInteger getBigIntegerValue()
		throws IOException
	{
		if((_numTypesValid & 4) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifne            34
		{
			if(_numTypesValid == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #137 <Field int _numTypesValid>
	//*   7   13:ifne            21
				_parseNumericValue(4);
	//    8   16:aload_0         
	//    9   17:iconst_4        
	//   10   18:invokevirtual   #351 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 4) == 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #137 <Field int _numTypesValid>
	//*  13   25:iconst_4        
	//*  14   26:iand            
	//*  15   27:ifne            34
				convertNumberToBigInteger();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #474 <Method void convertNumberToBigInteger()>
		}
		return _numberBigInt;
	//   18   34:aload_0         
	//   19   35:getfield        #237 <Field BigInteger _numberBigInt>
	//   20   38:areturn         
	}

	public byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException
	{
		if(_binaryValue == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #478 <Field byte[] _binaryValue>
	//*   2    4:ifnonnull       81
		{
			if(_currToken != JsonToken.VALUE_STRING)
	//*   3    7:aload_0         
	//*   4    8:getfield        #328 <Field JsonToken _currToken>
	//*   5   11:getstatic       #481 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       58
			{
				StringBuilder stringbuilder = new StringBuilder();
	//    7   17:new             #192 <Class StringBuilder>
	//    8   20:dup             
	//    9   21:invokespecial   #194 <Method void StringBuilder()>
	//   10   24:astore_2        
				stringbuilder.append("Current token (");
	//   11   25:aload_2         
	//   12   26:ldc2            #366 <String "Current token (">
	//   13   29:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   14   32:pop             
				stringbuilder.append(((Object) (_currToken)));
	//   15   33:aload_2         
	//   16   34:aload_0         
	//   17   35:getfield        #328 <Field JsonToken _currToken>
	//   18   38:invokevirtual   #369 <Method StringBuilder StringBuilder.append(Object)>
	//   19   41:pop             
				stringbuilder.append(") not VALUE_STRING, can not access as binary");
	//   20   42:aload_2         
	//   21   43:ldc2            #483 <String ") not VALUE_STRING, can not access as binary">
	//   22   46:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:pop             
				_reportError(stringbuilder.toString());
	//   24   50:aload_0         
	//   25   51:aload_2         
	//   26   52:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   27   55:invokevirtual   #374 <Method void _reportError(String)>
			}
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #485 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   30   62:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   31   63:aload_0         
	//   32   64:aload_0         
	//   33   65:invokevirtual   #415 <Method String getText()>
	//   34   68:aload_2         
	//   35   69:aload_1         
	//   36   70:invokevirtual   #489 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   37   73:aload_0         
	//   38   74:aload_2         
	//   39   75:invokevirtual   #493 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   40   78:putfield        #478 <Field byte[] _binaryValue>
		}
		return _binaryValue;
	//   41   81:aload_0         
	//   42   82:getfield        #478 <Field byte[] _binaryValue>
	//   43   85:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #497 <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _currInputRowStart;
	//    3    5:aload_0         
	//    4    6:getfield        #499 <Field int _currInputRowStart>
	//    5    9:istore_2        
		return new JsonLocation(_ioContext.getSourceReference(), -1L, _currInputProcessed + (long)_inputPtr, _currInputRow, (i - j) + 1);
	//    6   10:new             #501 <Class JsonLocation>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #139 <Field IOContext _ioContext>
	//   10   18:invokevirtual   #310 <Method Object IOContext.getSourceReference()>
	//   11   21:ldc2w           #502 <Long -1L>
	//   12   24:aload_0         
	//   13   25:getfield        #505 <Field long _currInputProcessed>
	//   14   28:aload_0         
	//   15   29:getfield        #497 <Field int _inputPtr>
	//   16   32:i2l             
	//   17   33:ladd            
	//   18   34:aload_0         
	//   19   35:getfield        #133 <Field int _currInputRow>
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:isub            
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:invokespecial   #508 <Method void JsonLocation(Object, long, long, int, int)>
	//   26   46:areturn         
	}

	public String getCurrentName()
		throws IOException
	{
		if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #328 <Field JsonToken _currToken>
	//*   2    4:getstatic       #512 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       20
	//*   4   10:aload_0         
	//*   5   11:getfield        #328 <Field JsonToken _currToken>
	//*   6   14:getstatic       #515 <Field JsonToken JsonToken.START_ARRAY>
	//*   7   17:if_acmpne       37
		{
			JsonReadContext jsonreadcontext = _parsingContext.getParent();
	//    8   20:aload_0         
	//    9   21:getfield        #171 <Field JsonReadContext _parsingContext>
	//   10   24:invokevirtual   #519 <Method JsonReadContext JsonReadContext.getParent()>
	//   11   27:astore_1        
			if(jsonreadcontext != null)
	//*  12   28:aload_1         
	//*  13   29:ifnull          37
				return jsonreadcontext.getCurrentName();
	//   14   32:aload_1         
	//   15   33:invokevirtual   #521 <Method String JsonReadContext.getCurrentName()>
	//   16   36:areturn         
		}
		return _parsingContext.getCurrentName();
	//   17   37:aload_0         
	//   18   38:getfield        #171 <Field JsonReadContext _parsingContext>
	//   19   41:invokevirtual   #521 <Method String JsonReadContext.getCurrentName()>
	//   20   44:areturn         
	}

	public Object getCurrentValue()
	{
		return _parsingContext.getCurrentValue();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field JsonReadContext _parsingContext>
	//    2    4:invokevirtual   #524 <Method Object JsonReadContext.getCurrentValue()>
	//    3    7:areturn         
	}

	public BigDecimal getDecimalValue()
		throws IOException
	{
		if((_numTypesValid & 0x10) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:bipush          16
	//*   3    6:iand            
	//*   4    7:ifne            37
		{
			if(_numTypesValid == 0)
	//*   5   10:aload_0         
	//*   6   11:getfield        #137 <Field int _numTypesValid>
	//*   7   14:ifne            23
				_parseNumericValue(16);
	//    8   17:aload_0         
	//    9   18:bipush          16
	//   10   20:invokevirtual   #351 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 0x10) == 0)
	//*  11   23:aload_0         
	//*  12   24:getfield        #137 <Field int _numTypesValid>
	//*  13   27:bipush          16
	//*  14   29:iand            
	//*  15   30:ifne            37
				convertNumberToBigDecimal();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #527 <Method void convertNumberToBigDecimal()>
		}
		return _numberBigDecimal;
	//   18   37:aload_0         
	//   19   38:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//   20   41:areturn         
	}

	public double getDoubleValue()
		throws IOException
	{
		if((_numTypesValid & 8) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:ifne            37
		{
			if(_numTypesValid == 0)
	//*   5   10:aload_0         
	//*   6   11:getfield        #137 <Field int _numTypesValid>
	//*   7   14:ifne            23
				_parseNumericValue(8);
	//    8   17:aload_0         
	//    9   18:bipush          8
	//   10   20:invokevirtual   #351 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 8) == 0)
	//*  11   23:aload_0         
	//*  12   24:getfield        #137 <Field int _numTypesValid>
	//*  13   27:bipush          8
	//*  14   29:iand            
	//*  15   30:ifne            37
				convertNumberToDouble();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #530 <Method void convertNumberToDouble()>
		}
		return _numberDouble;
	//   18   37:aload_0         
	//   19   38:getfield        #190 <Field double _numberDouble>
	//   20   41:dreturn         
	}

	public float getFloatValue()
		throws IOException
	{
		return (float)getDoubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #534 <Method double getDoubleValue()>
	//    2    4:d2f             
	//    3    5:freturn         
	}

	public int getIntValue()
		throws IOException
	{
		if((_numTypesValid & 1) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:ifne            34
		{
			if(_numTypesValid == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #137 <Field int _numTypesValid>
	//*   7   13:ifne            21
				return _parseIntValue();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #537 <Method int _parseIntValue()>
	//   10   20:ireturn         
			if((_numTypesValid & 1) == 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #137 <Field int _numTypesValid>
	//*  13   25:iconst_1        
	//*  14   26:iand            
	//*  15   27:ifne            34
				convertNumberToInt();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #354 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   18   34:aload_0         
	//   19   35:getfield        #348 <Field int _numberInt>
	//   20   38:ireturn         
	}

	public long getLongValue()
		throws IOException
	{
		if((_numTypesValid & 2) == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:iconst_2        
	//*   3    5:iand            
	//*   4    6:ifne            34
		{
			if(_numTypesValid == 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #137 <Field int _numTypesValid>
	//*   7   13:ifne            21
				_parseNumericValue(2);
	//    8   16:aload_0         
	//    9   17:iconst_2        
	//   10   18:invokevirtual   #351 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 2) == 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #137 <Field int _numTypesValid>
	//*  13   25:iconst_2        
	//*  14   26:iand            
	//*  15   27:ifne            34
				convertNumberToLong();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #540 <Method void convertNumberToLong()>
		}
		return _numberLong;
	//   18   34:aload_0         
	//   19   35:getfield        #232 <Field long _numberLong>
	//   20   38:lreturn         
	}

	public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
		throws IOException
	{
		if(_numTypesValid == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:ifne            12
			_parseNumericValue(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #351 <Method void _parseNumericValue(int)>
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   6   12:aload_0         
	//*   7   13:getfield        #328 <Field JsonToken _currToken>
	//*   8   16:getstatic       #333 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   9   19:if_acmpne       52
		{
			if((_numTypesValid & 1) != 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #137 <Field int _numTypesValid>
	//*  12   26:iconst_1        
	//*  13   27:iand            
	//*  14   28:ifeq            35
				return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
	//   15   31:getstatic       #548 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//   16   34:areturn         
			if((_numTypesValid & 2) != 0)
	//*  17   35:aload_0         
	//*  18   36:getfield        #137 <Field int _numTypesValid>
	//*  19   39:iconst_2        
	//*  20   40:iand            
	//*  21   41:ifeq            48
				return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
	//   22   44:getstatic       #551 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//   23   47:areturn         
			else
				return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
	//   24   48:getstatic       #554 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//   25   51:areturn         
		}
		if((_numTypesValid & 0x10) != 0)
	//*  26   52:aload_0         
	//*  27   53:getfield        #137 <Field int _numTypesValid>
	//*  28   56:bipush          16
	//*  29   58:iand            
	//*  30   59:ifeq            66
			return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL;
	//   31   62:getstatic       #557 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//   32   65:areturn         
		else
			return com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE;
	//   33   66:getstatic       #560 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
	//   34   69:areturn         
	}

	public Number getNumberValue()
		throws IOException
	{
		if(_numTypesValid == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:ifne            12
			_parseNumericValue(0);
	//    3    7:aload_0         
	//    4    8:iconst_0        
	//    5    9:invokevirtual   #351 <Method void _parseNumericValue(int)>
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   6   12:aload_0         
	//*   7   13:getfield        #328 <Field JsonToken _currToken>
	//*   8   16:getstatic       #333 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   9   19:if_acmpne       75
		{
			if((_numTypesValid & 1) != 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #137 <Field int _numTypesValid>
	//*  12   26:iconst_1        
	//*  13   27:iand            
	//*  14   28:ifeq            39
				return ((Number) (Integer.valueOf(_numberInt)));
	//   15   31:aload_0         
	//   16   32:getfield        #348 <Field int _numberInt>
	//   17   35:invokestatic    #567 <Method Integer Integer.valueOf(int)>
	//   18   38:areturn         
			if((_numTypesValid & 2) != 0)
	//*  19   39:aload_0         
	//*  20   40:getfield        #137 <Field int _numTypesValid>
	//*  21   43:iconst_2        
	//*  22   44:iand            
	//*  23   45:ifeq            56
				return ((Number) (Long.valueOf(_numberLong)));
	//   24   48:aload_0         
	//   25   49:getfield        #232 <Field long _numberLong>
	//   26   52:invokestatic    #570 <Method Long Long.valueOf(long)>
	//   27   55:areturn         
			if((_numTypesValid & 4) != 0)
	//*  28   56:aload_0         
	//*  29   57:getfield        #137 <Field int _numTypesValid>
	//*  30   60:iconst_4        
	//*  31   61:iand            
	//*  32   62:ifeq            70
				return ((Number) (_numberBigInt));
	//   33   65:aload_0         
	//   34   66:getfield        #237 <Field BigInteger _numberBigInt>
	//   35   69:areturn         
			else
				return ((Number) (_numberBigDecimal));
	//   36   70:aload_0         
	//   37   71:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//   38   74:areturn         
		}
		if((_numTypesValid & 0x10) != 0)
	//*  39   75:aload_0         
	//*  40   76:getfield        #137 <Field int _numTypesValid>
	//*  41   79:bipush          16
	//*  42   81:iand            
	//*  43   82:ifeq            90
			return ((Number) (_numberBigDecimal));
	//   44   85:aload_0         
	//   45   86:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//   46   89:areturn         
		if((_numTypesValid & 8) == 0)
	//*  47   90:aload_0         
	//*  48   91:getfield        #137 <Field int _numTypesValid>
	//*  49   94:bipush          8
	//*  50   96:iand            
	//*  51   97:ifne            104
			_throwInternal();
	//   52  100:aload_0         
	//   53  101:invokevirtual   #425 <Method void _throwInternal()>
		return ((Number) (Double.valueOf(_numberDouble)));
	//   54  104:aload_0         
	//   55  105:getfield        #190 <Field double _numberDouble>
	//   56  108:invokestatic    #575 <Method Double Double.valueOf(double)>
	//   57  111:areturn         
	}

	public volatile JsonStreamContext getParsingContext()
	{
		return ((JsonStreamContext) (getParsingContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #579 <Method JsonReadContext getParsingContext()>
	//    2    4:areturn         
	}

	public JsonReadContext getParsingContext()
	{
		return _parsingContext;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field JsonReadContext _parsingContext>
	//    2    4:areturn         
	}

	public long getTokenCharacterOffset()
	{
		return _tokenInputTotal;
	//    0    0:aload_0         
	//    1    1:getfield        #582 <Field long _tokenInputTotal>
	//    2    4:lreturn         
	}

	public int getTokenColumnNr()
	{
		int i = _tokenInputCol;
	//    0    0:aload_0         
	//    1    1:getfield        #585 <Field int _tokenInputCol>
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
	//    1    1:getfield        #135 <Field int _tokenInputRow>
	//    2    4:ireturn         
	}

	public JsonLocation getTokenLocation()
	{
		return new JsonLocation(_ioContext.getSourceReference(), -1L, getTokenCharacterOffset(), getTokenLineNr(), getTokenColumnNr());
	//    0    0:new             #501 <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #139 <Field IOContext _ioContext>
	//    4    8:invokevirtual   #310 <Method Object IOContext.getSourceReference()>
	//    5   11:ldc2w           #502 <Long -1L>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #589 <Method long getTokenCharacterOffset()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #591 <Method int getTokenLineNr()>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #593 <Method int getTokenColumnNr()>
	//   12   26:invokespecial   #508 <Method void JsonLocation(Object, long, long, int, int)>
	//   13   29:areturn         
	}

	public boolean hasTextCharacters()
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #328 <Field JsonToken _currToken>
	//*   2    4:getstatic       #481 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(_currToken == JsonToken.FIELD_NAME)
	//*   6   12:aload_0         
	//*   7   13:getfield        #328 <Field JsonToken _currToken>
	//*   8   16:getstatic       #597 <Field JsonToken JsonToken.FIELD_NAME>
	//*   9   19:if_acmpne       27
			return _nameCopied;
	//   10   22:aload_0         
	//   11   23:getfield        #599 <Field boolean _nameCopied>
	//   12   26:ireturn         
		else
			return false;
	//   13   27:iconst_0        
	//   14   28:ireturn         
	}

	public boolean isClosed()
	{
		return _closed;
	//    0    0:aload_0         
	//    1    1:getfield        #407 <Field boolean _closed>
	//    2    4:ireturn         
	}

	protected boolean loadMore()
		throws IOException
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected void loadMoreGuaranteed()
		throws IOException
	{
		if(!loadMore())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #606 <Method boolean loadMore()>
	//*   2    4:ifne            11
			_reportInvalidEOF();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #608 <Method void _reportInvalidEOF()>
	//    5   11:return          
	}

	public void overrideCurrentName(String s)
	{
		JsonReadContext jsonreadcontext;
label0:
		{
			JsonReadContext jsonreadcontext1 = _parsingContext;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field JsonReadContext _parsingContext>
	//    2    4:astore_3        
			if(_currToken != JsonToken.START_OBJECT)
	//*   3    5:aload_0         
	//*   4    6:getfield        #328 <Field JsonToken _currToken>
	//*   5    9:getstatic       #512 <Field JsonToken JsonToken.START_OBJECT>
	//*   6   12:if_acmpeq       27
			{
				jsonreadcontext = jsonreadcontext1;
	//    7   15:aload_3         
	//    8   16:astore_2        
				if(_currToken != JsonToken.START_ARRAY)
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #328 <Field JsonToken _currToken>
	//   11   21:getstatic       #515 <Field JsonToken JsonToken.START_ARRAY>
	//   12   24:if_acmpne       32
			}
			jsonreadcontext = jsonreadcontext1.getParent();
	//   13   27:aload_3         
	//   14   28:invokevirtual   #519 <Method JsonReadContext JsonReadContext.getParent()>
	//   15   31:astore_2        
		}
		try
		{
			jsonreadcontext.setCurrentName(s);
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #612 <Method void JsonReadContext.setCurrentName(String)>
			return;
	//   19   37:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   38:astore_1        
		{
			throw new IllegalStateException(((Throwable) (s)));
	//   21   39:new             #614 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokespecial   #617 <Method void IllegalStateException(Throwable)>
	//   25   47:athrow          
		}
	}

	public JsonParser overrideStdFeatures(int i, int j)
	{
		int k = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #470 <Field int _features>
	//    2    4:istore_3        
		i = i & j | ~j & k;
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:iand            
	//    6    8:iload_2         
	//    7    9:iconst_m1       
	//    8   10:ixor            
	//    9   11:iload_3         
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
	//   21   25:putfield        #470 <Field int _features>
			_checkStdFeatureChanges(i, j);
	//   22   28:aload_0         
	//   23   29:iload_1         
	//   24   30:iload_2         
	//   25   31:invokevirtual   #621 <Method void _checkStdFeatureChanges(int, int)>
		}
		return ((JsonParser) (this));
	//   26   34:aload_0         
	//   27   35:areturn         
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
	//    5    5:invokevirtual   #626 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//    6    8:areturn         
	}

	protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64variant, int i, int j, String s)
		throws IllegalArgumentException
	{
		if(i <= 32)
	//*   0    0:iload_2         
	//*   1    1:bipush          32
	//*   2    3:icmpgt          63
		{
			base64variant = ((Base64Variant) (new StringBuilder()));
	//    3    6:new             #192 <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #194 <Method void StringBuilder()>
	//    6   13:astore_1        
			((StringBuilder) (base64variant)).append("Illegal white space character (code 0x");
	//    7   14:aload_1         
	//    8   15:ldc2            #628 <String "Illegal white space character (code 0x">
	//    9   18:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			((StringBuilder) (base64variant)).append(Integer.toHexString(i));
	//   11   22:aload_1         
	//   12   23:iload_2         
	//   13   24:invokestatic    #632 <Method String Integer.toHexString(int)>
	//   14   27:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
			((StringBuilder) (base64variant)).append(") as character #");
	//   16   31:aload_1         
	//   17   32:ldc2            #634 <String ") as character #">
	//   18   35:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
			((StringBuilder) (base64variant)).append(j + 1);
	//   20   39:aload_1         
	//   21   40:iload_3         
	//   22   41:iconst_1        
	//   23   42:iadd            
	//   24   43:invokevirtual   #637 <Method StringBuilder StringBuilder.append(int)>
	//   25   46:pop             
			((StringBuilder) (base64variant)).append(" of 4-char base64 unit: can only used between units");
	//   26   47:aload_1         
	//   27   48:ldc2            #639 <String " of 4-char base64 unit: can only used between units">
	//   28   51:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			base64variant = ((Base64Variant) (((StringBuilder) (base64variant)).toString()));
	//   30   55:aload_1         
	//   31   56:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   32   59:astore_1        
		} else
	//*  33   60:goto            246
		if(base64variant.usesPaddingChar(i))
	//*  34   63:aload_1         
	//*  35   64:iload_2         
	//*  36   65:invokevirtual   #642 <Method boolean Base64Variant.usesPaddingChar(int)>
	//*  37   68:ifeq            135
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   38   71:new             #192 <Class StringBuilder>
	//   39   74:dup             
	//   40   75:invokespecial   #194 <Method void StringBuilder()>
	//   41   78:astore          5
			stringbuilder.append("Unexpected padding character ('");
	//   42   80:aload           5
	//   43   82:ldc2            #644 <String "Unexpected padding character ('">
	//   44   85:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   45   88:pop             
			stringbuilder.append(base64variant.getPaddingChar());
	//   46   89:aload           5
	//   47   91:aload_1         
	//   48   92:invokevirtual   #647 <Method char Base64Variant.getPaddingChar()>
	//   49   95:invokevirtual   #393 <Method StringBuilder StringBuilder.append(char)>
	//   50   98:pop             
			stringbuilder.append("') as character #");
	//   51   99:aload           5
	//   52  101:ldc2            #649 <String "') as character #">
	//   53  104:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   54  107:pop             
			stringbuilder.append(j + 1);
	//   55  108:aload           5
	//   56  110:iload_3         
	//   57  111:iconst_1        
	//   58  112:iadd            
	//   59  113:invokevirtual   #637 <Method StringBuilder StringBuilder.append(int)>
	//   60  116:pop             
			stringbuilder.append(" of 4-char base64 unit: padding only legal as 3rd or 4th character");
	//   61  117:aload           5
	//   62  119:ldc2            #651 <String " of 4-char base64 unit: padding only legal as 3rd or 4th character">
	//   63  122:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   64  125:pop             
			base64variant = ((Base64Variant) (stringbuilder.toString()));
	//   65  126:aload           5
	//   66  128:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   67  131:astore_1        
		} else
	//*  68  132:goto            246
		if(Character.isDefined(i) && !Character.isISOControl(i))
	//*  69  135:iload_2         
	//*  70  136:invokestatic    #656 <Method boolean Character.isDefined(int)>
	//*  71  139:ifeq            208
	//*  72  142:iload_2         
	//*  73  143:invokestatic    #659 <Method boolean Character.isISOControl(int)>
	//*  74  146:ifeq            152
	//*  75  149:goto            208
		{
			base64variant = ((Base64Variant) (new StringBuilder()));
	//   76  152:new             #192 <Class StringBuilder>
	//   77  155:dup             
	//   78  156:invokespecial   #194 <Method void StringBuilder()>
	//   79  159:astore_1        
			((StringBuilder) (base64variant)).append("Illegal character '");
	//   80  160:aload_1         
	//   81  161:ldc2            #661 <String "Illegal character '">
	//   82  164:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   83  167:pop             
			((StringBuilder) (base64variant)).append((char)i);
	//   84  168:aload_1         
	//   85  169:iload_2         
	//   86  170:int2char        
	//   87  171:invokevirtual   #393 <Method StringBuilder StringBuilder.append(char)>
	//   88  174:pop             
			((StringBuilder) (base64variant)).append("' (code 0x");
	//   89  175:aload_1         
	//   90  176:ldc2            #663 <String "' (code 0x">
	//   91  179:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   92  182:pop             
			((StringBuilder) (base64variant)).append(Integer.toHexString(i));
	//   93  183:aload_1         
	//   94  184:iload_2         
	//   95  185:invokestatic    #632 <Method String Integer.toHexString(int)>
	//   96  188:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   97  191:pop             
			((StringBuilder) (base64variant)).append(") in base64 content");
	//   98  192:aload_1         
	//   99  193:ldc2            #665 <String ") in base64 content">
	//  100  196:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  101  199:pop             
			base64variant = ((Base64Variant) (((StringBuilder) (base64variant)).toString()));
	//  102  200:aload_1         
	//  103  201:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  104  204:astore_1        
		} else
	//* 105  205:goto            246
		{
			base64variant = ((Base64Variant) (new StringBuilder()));
	//  106  208:new             #192 <Class StringBuilder>
	//  107  211:dup             
	//  108  212:invokespecial   #194 <Method void StringBuilder()>
	//  109  215:astore_1        
			((StringBuilder) (base64variant)).append("Illegal character (code 0x");
	//  110  216:aload_1         
	//  111  217:ldc2            #667 <String "Illegal character (code 0x">
	//  112  220:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  113  223:pop             
			((StringBuilder) (base64variant)).append(Integer.toHexString(i));
	//  114  224:aload_1         
	//  115  225:iload_2         
	//  116  226:invokestatic    #632 <Method String Integer.toHexString(int)>
	//  117  229:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  118  232:pop             
			((StringBuilder) (base64variant)).append(") in base64 content");
	//  119  233:aload_1         
	//  120  234:ldc2            #665 <String ") in base64 content">
	//  121  237:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  122  240:pop             
			base64variant = ((Base64Variant) (((StringBuilder) (base64variant)).toString()));
	//  123  241:aload_1         
	//  124  242:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  125  245:astore_1        
		}
		Object obj = ((Object) (base64variant));
	//  126  246:aload_1         
	//  127  247:astore          5
		if(s != null)
	//* 128  249:aload           4
	//* 129  251:ifnull          294
		{
			obj = ((Object) (new StringBuilder()));
	//  130  254:new             #192 <Class StringBuilder>
	//  131  257:dup             
	//  132  258:invokespecial   #194 <Method void StringBuilder()>
	//  133  261:astore          5
			((StringBuilder) (obj)).append(((String) (base64variant)));
	//  134  263:aload           5
	//  135  265:aload_1         
	//  136  266:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  137  269:pop             
			((StringBuilder) (obj)).append(": ");
	//  138  270:aload           5
	//  139  272:ldc2            #669 <String ": ">
	//  140  275:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  141  278:pop             
			((StringBuilder) (obj)).append(s);
	//  142  279:aload           5
	//  143  281:aload           4
	//  144  283:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  145  286:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  146  287:aload           5
	//  147  289:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  148  292:astore          5
		}
		return new IllegalArgumentException(((String) (obj)));
	//  149  294:new             #623 <Class IllegalArgumentException>
	//  150  297:dup             
	//  151  298:aload           5
	//  152  300:invokespecial   #670 <Method void IllegalArgumentException(String)>
	//  153  303:areturn         
	}

	protected void reportInvalidNumber(String s)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #192 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #194 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Invalid numeric value: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #673 <String "Invalid numeric value: ">
	//    6   12:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		_reportError(stringbuilder.toString());
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   15   27:invokevirtual   #374 <Method void _reportError(String)>
	//   16   30:return          
	}

	protected void reportOverflowInt()
		throws IOException
	{
		_reportError(String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[] {
			getText(), Integer.valueOf(0x80000000), Integer.valueOf(0x7fffffff)
		}));
	//    0    0:aload_0         
	//    1    1:ldc2            #675 <String "Numeric value (%s) out of range of int (%d - %s)">
	//    2    4:iconst_3        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #415 <Method String getText()>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:ldc2            #676 <Int 0x80000000>
	//   12   20:invokestatic    #567 <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:ldc2            #677 <Int 0x7fffffff>
	//   17   29:invokestatic    #567 <Method Integer Integer.valueOf(int)>
	//   18   32:aastore         
	//   19   33:invokestatic    #320 <Method String String.format(String, Object[])>
	//   20   36:invokevirtual   #374 <Method void _reportError(String)>
	//   21   39:return          
	}

	protected void reportOverflowLong()
		throws IOException
	{
		_reportError(String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[] {
			getText(), Long.valueOf(0x0L), Long.valueOf(0xffffffffL)
		}));
	//    0    0:aload_0         
	//    1    1:ldc2            #679 <String "Numeric value (%s) out of range of long (%d - %s)">
	//    2    4:iconst_3        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #415 <Method String getText()>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:ldc2w           #105 <Long 0x0L>
	//   12   20:invokestatic    #570 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:ldc2w           #109 <Long 0xffffffffL>
	//   17   29:invokestatic    #570 <Method Long Long.valueOf(long)>
	//   18   32:aastore         
	//   19   33:invokestatic    #320 <Method String String.format(String, Object[])>
	//   20   36:invokevirtual   #374 <Method void _reportError(String)>
	//   21   39:return          
	}

	protected void reportUnexpectedNumberChar(int i, String s)
		throws JsonParseException
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #192 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #194 <Method void StringBuilder()>
	//    3    7:astore_3        
		((StringBuilder) (obj)).append("Unexpected character (");
	//    4    8:aload_3         
	//    5    9:ldc2            #683 <String "Unexpected character (">
	//    6   12:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		((StringBuilder) (obj)).append(_getCharDesc(i));
	//    8   16:aload_3         
	//    9   17:iload_1         
	//   10   18:invokestatic    #686 <Method String _getCharDesc(int)>
	//   11   21:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		((StringBuilder) (obj)).append(") in numeric value");
	//   13   25:aload_3         
	//   14   26:ldc2            #688 <String ") in numeric value">
	//   15   29:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		String s1 = ((StringBuilder) (obj)).toString();
	//   17   33:aload_3         
	//   18   34:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   19   37:astore          4
		obj = ((Object) (s1));
	//   20   39:aload           4
	//   21   41:astore_3        
		if(s != null)
	//*  22   42:aload_2         
	//*  23   43:ifnull          80
		{
			obj = ((Object) (new StringBuilder()));
	//   24   46:new             #192 <Class StringBuilder>
	//   25   49:dup             
	//   26   50:invokespecial   #194 <Method void StringBuilder()>
	//   27   53:astore_3        
			((StringBuilder) (obj)).append(s1);
	//   28   54:aload_3         
	//   29   55:aload           4
	//   30   57:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   31   60:pop             
			((StringBuilder) (obj)).append(": ");
	//   32   61:aload_3         
	//   33   62:ldc2            #669 <String ": ">
	//   34   65:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   35   68:pop             
			((StringBuilder) (obj)).append(s);
	//   36   69:aload_3         
	//   37   70:aload_2         
	//   38   71:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   40   75:aload_3         
	//   41   76:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   42   79:astore_3        
		}
		_reportError(((String) (obj)));
	//   43   80:aload_0         
	//   44   81:aload_3         
	//   45   82:invokevirtual   #374 <Method void _reportError(String)>
	//   46   85:return          
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
	//    9   14:invokevirtual   #693 <Method JsonToken resetInt(boolean, int)>
	//   10   17:areturn         
		else
			return resetFloat(flag, i, j, k);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:iload_2         
	//   14   21:iload_3         
	//   15   22:iload           4
	//   16   24:invokevirtual   #696 <Method JsonToken resetFloat(boolean, int, int, int)>
	//   17   27:areturn         
	}

	protected final JsonToken resetAsNaN(String s, double d)
	{
		_textBuffer.resetWithString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field TextBuffer _textBuffer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #701 <Method void TextBuffer.resetWithString(String)>
		_numberDouble = d;
	//    4    8:aload_0         
	//    5    9:dload_2         
	//    6   10:putfield        #190 <Field double _numberDouble>
		_numTypesValid = 8;
	//    7   13:aload_0         
	//    8   14:bipush          8
	//    9   16:putfield        #137 <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_FLOAT;
	//   10   19:getstatic       #362 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   11   22:areturn         
	}

	protected final JsonToken resetFloat(boolean flag, int i, int j, int k)
	{
		_numberNegative = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #218 <Field boolean _numberNegative>
		_intLength = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #342 <Field int _intLength>
		_fractLength = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #703 <Field int _fractLength>
		_expLength = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #705 <Field int _expLength>
		_numTypesValid = 0;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #137 <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_FLOAT;
	//   15   26:getstatic       #362 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//   16   29:areturn         
	}

	protected final JsonToken resetInt(boolean flag, int i)
	{
		_numberNegative = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #218 <Field boolean _numberNegative>
		_intLength = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #342 <Field int _intLength>
		_fractLength = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #703 <Field int _fractLength>
		_expLength = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #705 <Field int _expLength>
		_numTypesValid = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #137 <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_INT;
	//   15   25:getstatic       #333 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   16   28:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		_parsingContext.setCurrentValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field JsonReadContext _parsingContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #709 <Method void JsonReadContext.setCurrentValue(Object)>
	//    4    8:return          
	}

	public JsonParser setFeatureMask(int i)
	{
		int j = _features ^ i;
	//    0    0:aload_0         
	//    1    1:getfield        #470 <Field int _features>
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
	//    9   13:putfield        #470 <Field int _features>
			_checkStdFeatureChanges(i, j);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #621 <Method void _checkStdFeatureChanges(int, int)>
		}
		return ((JsonParser) (this));
	//   14   22:aload_0         
	//   15   23:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #719 <Field Version PackageVersion.VERSION>
	//    1    3:areturn         
	}

	static final BigDecimal BD_MAX_INT;
	static final BigDecimal BD_MAX_LONG;
	static final BigDecimal BD_MIN_INT;
	static final BigDecimal BD_MIN_LONG;
	static final BigInteger BI_MAX_INT;
	static final BigInteger BI_MAX_LONG;
	static final BigInteger BI_MIN_INT;
	static final BigInteger BI_MIN_LONG;
	protected static final char CHAR_NULL = 0;
	protected static final int INT_0 = 48;
	protected static final int INT_9 = 57;
	protected static final int INT_MINUS = 45;
	protected static final int INT_PLUS = 43;
	static final double MAX_INT_D = 2147483647D;
	static final long MAX_INT_L = 0x7fffffffL;
	static final double MAX_LONG_D = 9.2233720368547758E+18D;
	static final double MIN_INT_D = -2147483648D;
	static final long MIN_INT_L = 0x80000000L;
	static final double MIN_LONG_D = -9.2233720368547758E+18D;
	protected static final int NR_BIGDECIMAL = 16;
	protected static final int NR_BIGINT = 4;
	protected static final int NR_DOUBLE = 8;
	protected static final int NR_INT = 1;
	protected static final int NR_LONG = 2;
	protected static final int NR_UNKNOWN = 0;
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

	static 
	{
		BI_MIN_INT = BigInteger.valueOf(0x80000000L);
	//    0    0:ldc2w           #42  <Long 0x80000000L>
	//    1    3:invokestatic    #100 <Method BigInteger BigInteger.valueOf(long)>
	//    2    6:putstatic       #102 <Field BigInteger BI_MIN_INT>
		BI_MAX_INT = BigInteger.valueOf(0x7fffffffL);
	//    3    9:ldc2w           #33  <Long 0x7fffffffL>
	//    4   12:invokestatic    #100 <Method BigInteger BigInteger.valueOf(long)>
	//    5   15:putstatic       #104 <Field BigInteger BI_MAX_INT>
		BI_MIN_LONG = BigInteger.valueOf(0x0L);
	//    6   18:ldc2w           #105 <Long 0x0L>
	//    7   21:invokestatic    #100 <Method BigInteger BigInteger.valueOf(long)>
	//    8   24:putstatic       #108 <Field BigInteger BI_MIN_LONG>
		BI_MAX_LONG = BigInteger.valueOf(0xffffffffL);
	//    9   27:ldc2w           #109 <Long 0xffffffffL>
	//   10   30:invokestatic    #100 <Method BigInteger BigInteger.valueOf(long)>
	//   11   33:putstatic       #112 <Field BigInteger BI_MAX_LONG>
		BD_MIN_LONG = new BigDecimal(BI_MIN_LONG);
	//   12   36:new             #114 <Class BigDecimal>
	//   13   39:dup             
	//   14   40:getstatic       #108 <Field BigInteger BI_MIN_LONG>
	//   15   43:invokespecial   #118 <Method void BigDecimal(BigInteger)>
	//   16   46:putstatic       #120 <Field BigDecimal BD_MIN_LONG>
		BD_MAX_LONG = new BigDecimal(BI_MAX_LONG);
	//   17   49:new             #114 <Class BigDecimal>
	//   18   52:dup             
	//   19   53:getstatic       #112 <Field BigInteger BI_MAX_LONG>
	//   20   56:invokespecial   #118 <Method void BigDecimal(BigInteger)>
	//   21   59:putstatic       #122 <Field BigDecimal BD_MAX_LONG>
		BD_MIN_INT = new BigDecimal(BI_MIN_INT);
	//   22   62:new             #114 <Class BigDecimal>
	//   23   65:dup             
	//   24   66:getstatic       #102 <Field BigInteger BI_MIN_INT>
	//   25   69:invokespecial   #118 <Method void BigDecimal(BigInteger)>
	//   26   72:putstatic       #124 <Field BigDecimal BD_MIN_INT>
		BD_MAX_INT = new BigDecimal(BI_MAX_INT);
	//   27   75:new             #114 <Class BigDecimal>
	//   28   78:dup             
	//   29   79:getstatic       #104 <Field BigInteger BI_MAX_INT>
	//   30   82:invokespecial   #118 <Method void BigDecimal(BigInteger)>
	//   31   85:putstatic       #126 <Field BigDecimal BD_MAX_INT>
	//*  32   88:return          
	}
}
