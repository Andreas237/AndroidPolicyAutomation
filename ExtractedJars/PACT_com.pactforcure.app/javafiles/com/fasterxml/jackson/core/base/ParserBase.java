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
	//*  22   40:ifeq            57
			iocontext = ((IOContext) (DupDetector.rootDetector(((JsonParser) (this)))));
	//   23   43:aload_0         
	//   24   44:invokestatic    #163 <Method DupDetector DupDetector.rootDetector(JsonParser)>
	//   25   47:astore_1        
		else
	//*  26   48:aload_0         
	//*  27   49:aload_1         
	//*  28   50:invokestatic    #169 <Method JsonReadContext JsonReadContext.createRootContext(DupDetector)>
	//*  29   53:putfield        #171 <Field JsonReadContext _parsingContext>
	//*  30   56:return          
			iocontext = null;
	//   31   57:aconst_null     
	//   32   58:astore_1        
		_parsingContext = JsonReadContext.createRootContext(((DupDetector) (iocontext)));
	//*  33   59:goto            48
	}

	private void _parseSlowFloat(int i)
		throws IOException
	{
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
			catch(NumberFormatException numberformatexception)
	//*  21   42:astore_2        
			{
				_wrapError((new StringBuilder()).append("Malformed numeric value '").append(_textBuffer.contentsAsString()).append("'").toString(), ((Throwable) (numberformatexception)));
	//   22   43:aload_0         
	//   23   44:new             #192 <Class StringBuilder>
	//   24   47:dup             
	//   25   48:invokespecial   #194 <Method void StringBuilder()>
	//   26   51:ldc1            #196 <String "Malformed numeric value '">
	//   27   53:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   28   56:aload_0         
	//   29   57:getfield        #147 <Field TextBuffer _textBuffer>
	//   30   60:invokevirtual   #204 <Method String TextBuffer.contentsAsString()>
	//   31   63:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   32   66:ldc1            #206 <String "'">
	//   33   68:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   34   71:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   35   74:aload_2         
	//   36   75:invokevirtual   #213 <Method void _wrapError(String, Throwable)>
			}
			break MISSING_BLOCK_LABEL_78;
		}
		_numberDouble = _textBuffer.contentsAsDouble();
		_numTypesValid = 8;
		return;
	//   37   78:return          
	}

	private void _parseSlowInt(int i, char ac[], int j, int k)
		throws IOException
	{
		String s = _textBuffer.contentsAsString();
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #204 <Method String TextBuffer.contentsAsString()>
	//    3    7:astore          5
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
		try
		{
			_numberBigInt = new BigInteger(s);
	//   19   38:aload_0         
	//   20   39:new             #96  <Class BigInteger>
	//   21   42:dup             
	//   22   43:aload           5
	//   23   45:invokespecial   #235 <Method void BigInteger(String)>
	//   24   48:putfield        #237 <Field BigInteger _numberBigInt>
			_numTypesValid = 4;
	//   25   51:aload_0         
	//   26   52:iconst_4        
	//   27   53:putfield        #137 <Field int _numTypesValid>
			return;
	//   28   56:return          
		}
		// Misplaced declaration of an exception variable
		catch(char ac[])
	//*  29   57:astore_2        
		{
			_wrapError((new StringBuilder()).append("Malformed numeric value '").append(s).append("'").toString(), ((Throwable) (ac)));
	//   30   58:aload_0         
	//   31   59:new             #192 <Class StringBuilder>
	//   32   62:dup             
	//   33   63:invokespecial   #194 <Method void StringBuilder()>
	//   34   66:ldc1            #196 <String "Malformed numeric value '">
	//   35   68:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:aload           5
	//   37   73:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   38   76:ldc1            #206 <String "'">
	//   39   78:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   40   81:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   41   84:aload_2         
	//   42   85:invokevirtual   #213 <Method void _wrapError(String, Throwable)>
		}
		return;
	//   43   88:return          
	}

	protected void _checkStdFeatureChanges(int i, int j)
	{
label0:
		{
			int k = com.fasterxml.jackson.core.JsonParser.Feature.STRICT_DUPLICATE_DETECTION.getMask();
	//    0    0:getstatic       #153 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.STRICT_DUPLICATE_DETECTION>
	//    1    3:invokevirtual   #243 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    2    6:istore_3        
			if((j & k) != 0 && (i & k) != 0)
	//*   3    7:iload_2         
	//*   4    8:iload_3         
	//*   5    9:iand            
	//*   6   10:ifeq            44
	//*   7   13:iload_1         
	//*   8   14:iload_3         
	//*   9   15:iand            
	//*  10   16:ifeq            44
			{
				if(_parsingContext.getDupDetector() != null)
					break label0;
	//   11   19:aload_0         
	//   12   20:getfield        #171 <Field JsonReadContext _parsingContext>
	//   13   23:invokevirtual   #247 <Method DupDetector JsonReadContext.getDupDetector()>
	//   14   26:ifnonnull       45
				_parsingContext = _parsingContext.withDupDetector(DupDetector.rootDetector(((JsonParser) (this))));
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #171 <Field JsonReadContext _parsingContext>
	//   18   34:aload_0         
	//   19   35:invokestatic    #163 <Method DupDetector DupDetector.rootDetector(JsonParser)>
	//   20   38:invokevirtual   #250 <Method JsonReadContext JsonReadContext.withDupDetector(DupDetector)>
	//   21   41:putfield        #171 <Field JsonReadContext _parsingContext>
			}
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
	//*  14   24:icmpgt          35
	//*  15   27:iload_3         
	//*  16   28:ifne            35
		{
			c = '\uFFFF';
	//   17   31:iconst_m1       
	//   18   32:istore_2        
		} else
	//*  19   33:iload_2         
	//*  20   34:ireturn         
		{
			int j = base64variant.decodeBase64Char(c1);
	//   21   35:aload_1         
	//   22   36:iload           4
	//   23   38:invokevirtual   #267 <Method int Base64Variant.decodeBase64Char(char)>
	//   24   41:istore          5
			c = ((char) (j));
	//   25   43:iload           5
	//   26   45:istore_2        
			if(j < 0)
	//*  27   46:iload           5
	//*  28   48:ifge            33
				throw reportInvalidBase64Char(base64variant, ((int) (c1)), i);
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:iload           4
	//   32   55:iload_3         
	//   33   56:invokevirtual   #257 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//   34   59:athrow          
		}
		return ((int) (c));
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
		char c = _decodeEscaped();
	//    9   14:aload_0         
	//   10   15:invokevirtual   #261 <Method char _decodeEscaped()>
	//   11   18:istore          5
		if(c <= ' ' && j == 0)
	//*  12   20:iload           5
	//*  13   22:bipush          32
	//*  14   24:icmpgt          35
	//*  15   27:iload_3         
	//*  16   28:ifne            35
		{
			i = -1;
	//   17   31:iconst_m1       
	//   18   32:istore_2        
		} else
	//*  19   33:iload_2         
	//*  20   34:ireturn         
		{
			int k = base64variant.decodeBase64Char(((int) (c)));
	//   21   35:aload_1         
	//   22   36:iload           5
	//   23   38:invokevirtual   #271 <Method int Base64Variant.decodeBase64Char(int)>
	//   24   41:istore          4
			i = k;
	//   25   43:iload           4
	//   26   45:istore_2        
			if(k < 0)
	//*  27   46:iload           4
	//*  28   48:ifge            33
				throw reportInvalidBase64Char(base64variant, ((int) (c)), j);
	//   29   51:aload_0         
	//   30   52:aload_1         
	//   31   53:iload           5
	//   32   55:iload_3         
	//   33   56:invokevirtual   #257 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int)>
	//   34   59:athrow          
		}
		return i;
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

	protected abstract void _finishString()
		throws IOException;

	public ByteArrayBuilder _getByteArrayBuilder()
	{
		if(_byteArrayBuilder == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field ByteArrayBuilder _byteArrayBuilder>
	//*   2    4:ifnonnull       23
			_byteArrayBuilder = new ByteArrayBuilder();
	//    3    7:aload_0         
	//    4    8:new             #287 <Class ByteArrayBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #288 <Method void ByteArrayBuilder()>
	//    7   15:putfield        #285 <Field ByteArrayBuilder _byteArrayBuilder>
		else
	//*   8   18:aload_0         
	//*   9   19:getfield        #285 <Field ByteArrayBuilder _byteArrayBuilder>
	//*  10   22:areturn         
			_byteArrayBuilder.reset();
	//   11   23:aload_0         
	//   12   24:getfield        #285 <Field ByteArrayBuilder _byteArrayBuilder>
	//   13   27:invokevirtual   #291 <Method void ByteArrayBuilder.reset()>
		return _byteArrayBuilder;
	//*  14   30:goto            18
	}

	protected void _handleEOF()
		throws JsonParseException
	{
		if(!_parsingContext.inRoot())
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field JsonReadContext _parsingContext>
	//*   2    4:invokevirtual   #295 <Method boolean JsonReadContext.inRoot()>
	//*   3    7:ifne            69
			_reportInvalidEOF((new StringBuilder()).append(": expected close marker for ").append(_parsingContext.getTypeDesc()).append(" (from ").append(((Object) (_parsingContext.getStartLocation(_ioContext.getSourceReference())))).append(")").toString());
	//    4   10:aload_0         
	//    5   11:new             #192 <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #194 <Method void StringBuilder()>
	//    8   18:ldc2            #297 <String ": expected close marker for ">
	//    9   21:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   10   24:aload_0         
	//   11   25:getfield        #171 <Field JsonReadContext _parsingContext>
	//   12   28:invokevirtual   #300 <Method String JsonReadContext.getTypeDesc()>
	//   13   31:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:ldc2            #302 <String " (from ">
	//   15   37:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   16   40:aload_0         
	//   17   41:getfield        #171 <Field JsonReadContext _parsingContext>
	//   18   44:aload_0         
	//   19   45:getfield        #139 <Field IOContext _ioContext>
	//   20   48:invokevirtual   #306 <Method Object IOContext.getSourceReference()>
	//   21   51:invokevirtual   #310 <Method JsonLocation JsonReadContext.getStartLocation(Object)>
	//   22   54:invokevirtual   #313 <Method StringBuilder StringBuilder.append(Object)>
	//   23   57:ldc2            #315 <String ")">
	//   24   60:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   25   63:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   26   66:invokevirtual   #318 <Method void _reportInvalidEOF(String)>
	//   27   69:return          
	}

	protected int _parseIntValue()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field JsonToken _currToken>
	//*   2    4:getstatic       #327 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       83
		{
			char ac[] = _textBuffer.getTextBuffer();
	//    4   10:aload_0         
	//    5   11:getfield        #147 <Field TextBuffer _textBuffer>
	//    6   14:invokevirtual   #331 <Method char[] TextBuffer.getTextBuffer()>
	//    7   17:astore          4
			int j = _textBuffer.getTextOffset();
	//    8   19:aload_0         
	//    9   20:getfield        #147 <Field TextBuffer _textBuffer>
	//   10   23:invokevirtual   #334 <Method int TextBuffer.getTextOffset()>
	//   11   26:istore_2        
			int l = _intLength;
	//   12   27:aload_0         
	//   13   28:getfield        #336 <Field int _intLength>
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
	//   30   55:invokestatic    #340 <Method int NumberInput.parseInt(char[], int, int)>
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
	//   42   73:putfield        #342 <Field int _numberInt>
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
	//   50   85:invokevirtual   #345 <Method void _parseNumericValue(int)>
		if((_numTypesValid & 1) == 0)
	//*  51   88:aload_0         
	//*  52   89:getfield        #137 <Field int _numTypesValid>
	//*  53   92:iconst_1        
	//*  54   93:iand            
	//*  55   94:ifne            101
			convertNumberToInt();
	//   56   97:aload_0         
	//   57   98:invokevirtual   #348 <Method void convertNumberToInt()>
		return _numberInt;
	//   58  101:aload_0         
	//   59  102:getfield        #342 <Field int _numberInt>
	//   60  105:ireturn         
	}

	protected void _parseNumericValue(int i)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field JsonToken _currToken>
	//*   2    4:getstatic       #327 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   3    7:if_acmpne       199
		{
			char ac[] = _textBuffer.getTextBuffer();
	//    4   10:aload_0         
	//    5   11:getfield        #147 <Field TextBuffer _textBuffer>
	//    6   14:invokevirtual   #331 <Method char[] TextBuffer.getTextBuffer()>
	//    7   17:astore          9
			int k = _textBuffer.getTextOffset();
	//    8   19:aload_0         
	//    9   20:getfield        #147 <Field TextBuffer _textBuffer>
	//   10   23:invokevirtual   #334 <Method int TextBuffer.getTextOffset()>
	//   11   26:istore_3        
			int l = _intLength;
	//   12   27:aload_0         
	//   13   28:getfield        #336 <Field int _intLength>
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
	//   30   58:invokestatic    #340 <Method int NumberInput.parseInt(char[], int, int)>
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
	//   42   76:putfield        #342 <Field int _numberInt>
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
	//   53   97:invokestatic    #351 <Method long NumberInput.parseLong(char[], int, int)>
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
	//   76  145:putfield        #342 <Field int _numberInt>
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
	//   88  167:putfield        #342 <Field int _numberInt>
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
	//  105  195:invokespecial   #353 <Method void _parseSlowInt(int, char[], int, int)>
				return;
	//  106  198:return          
			}
		}
		if(_currToken == JsonToken.VALUE_NUMBER_FLOAT)
	//* 107  199:aload_0         
	//* 108  200:getfield        #322 <Field JsonToken _currToken>
	//* 109  203:getstatic       #356 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//* 110  206:if_acmpne       215
		{
			_parseSlowFloat(i);
	//  111  209:aload_0         
	//  112  210:iload_1         
	//  113  211:invokespecial   #358 <Method void _parseSlowFloat(int)>
			return;
	//  114  214:return          
		} else
		{
			_reportError((new StringBuilder()).append("Current token (").append(((Object) (_currToken))).append(") not numeric, can not use numeric value accessors").toString());
	//  115  215:aload_0         
	//  116  216:new             #192 <Class StringBuilder>
	//  117  219:dup             
	//  118  220:invokespecial   #194 <Method void StringBuilder()>
	//  119  223:ldc2            #360 <String "Current token (">
	//  120  226:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  121  229:aload_0         
	//  122  230:getfield        #322 <Field JsonToken _currToken>
	//  123  233:invokevirtual   #313 <Method StringBuilder StringBuilder.append(Object)>
	//  124  236:ldc2            #362 <String ") not numeric, can not use numeric value accessors">
	//  125  239:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//  126  242:invokevirtual   #209 <Method String StringBuilder.toString()>
	//  127  245:invokevirtual   #365 <Method void _reportError(String)>
			return;
	//  128  248:return          
		}
	}

	protected void _releaseBuffers()
		throws IOException
	{
		_textBuffer.releaseBuffers();
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field TextBuffer _textBuffer>
	//    2    4:invokevirtual   #369 <Method void TextBuffer.releaseBuffers()>
		char ac[] = _nameCopyBuffer;
	//    3    7:aload_0         
	//    4    8:getfield        #371 <Field char[] _nameCopyBuffer>
	//    5   11:astore_1        
		if(ac != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          29
		{
			_nameCopyBuffer = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #371 <Field char[] _nameCopyBuffer>
			_ioContext.releaseNameCopyBuffer(ac);
	//   11   21:aload_0         
	//   12   22:getfield        #139 <Field IOContext _ioContext>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #375 <Method void IOContext.releaseNameCopyBuffer(char[])>
		}
	//   15   29:return          
	}

	protected void _reportMismatchedEndMarker(int i, char c)
		throws JsonParseException
	{
		String s = (new StringBuilder()).append("").append(((Object) (_parsingContext.getStartLocation(_ioContext.getSourceReference())))).toString();
	//    0    0:new             #192 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #194 <Method void StringBuilder()>
	//    3    7:ldc2            #379 <String "">
	//    4   10:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:aload_0         
	//    6   14:getfield        #171 <Field JsonReadContext _parsingContext>
	//    7   17:aload_0         
	//    8   18:getfield        #139 <Field IOContext _ioContext>
	//    9   21:invokevirtual   #306 <Method Object IOContext.getSourceReference()>
	//   10   24:invokevirtual   #310 <Method JsonLocation JsonReadContext.getStartLocation(Object)>
	//   11   27:invokevirtual   #313 <Method StringBuilder StringBuilder.append(Object)>
	//   12   30:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   13   33:astore_3        
		_reportError((new StringBuilder()).append("Unexpected close marker '").append((char)i).append("': expected '").append(c).append("' (for ").append(_parsingContext.getTypeDesc()).append(" starting at ").append(s).append(")").toString());
	//   14   34:aload_0         
	//   15   35:new             #192 <Class StringBuilder>
	//   16   38:dup             
	//   17   39:invokespecial   #194 <Method void StringBuilder()>
	//   18   42:ldc2            #381 <String "Unexpected close marker '">
	//   19   45:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:iload_1         
	//   21   49:int2char        
	//   22   50:invokevirtual   #384 <Method StringBuilder StringBuilder.append(char)>
	//   23   53:ldc2            #386 <String "': expected '">
	//   24   56:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   25   59:iload_2         
	//   26   60:invokevirtual   #384 <Method StringBuilder StringBuilder.append(char)>
	//   27   63:ldc2            #388 <String "' (for ">
	//   28   66:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   29   69:aload_0         
	//   30   70:getfield        #171 <Field JsonReadContext _parsingContext>
	//   31   73:invokevirtual   #300 <Method String JsonReadContext.getTypeDesc()>
	//   32   76:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   33   79:ldc2            #390 <String " starting at ">
	//   34   82:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   35   85:aload_3         
	//   36   86:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   37   89:ldc2            #315 <String ")">
	//   38   92:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   39   95:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   40   98:invokevirtual   #365 <Method void _reportError(String)>
	//   41  101:return          
	}

	public void close()
		throws IOException
	{
		if(_closed)
			break MISSING_BLOCK_LABEL_20;
	//    0    0:aload_0         
	//    1    1:getfield        #393 <Field boolean _closed>
	//    2    4:ifne            20
		_closed = true;
	//    3    7:aload_0         
	//    4    8:iconst_1        
	//    5    9:putfield        #393 <Field boolean _closed>
		_closeInput();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #395 <Method void _closeInput()>
		_releaseBuffers();
	//    8   16:aload_0         
	//    9   17:invokevirtual   #397 <Method void _releaseBuffers()>
		return;
	//   10   20:return          
		Exception exception;
		exception;
	//   11   21:astore_1        
		_releaseBuffers();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #397 <Method void _releaseBuffers()>
		throw exception;
	//   14   26:aload_1         
	//   15   27:athrow          
	}

	protected void convertNumberToBigDecimal()
		throws IOException
	{
		if((_numTypesValid & 8) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:bipush          8
	//*   3    6:iand            
	//*   4    7:ifeq            33
			_numberBigDecimal = NumberInput.parseBigDecimal(getText());
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #401 <Method String getText()>
	//    8   15:invokestatic    #405 <Method BigDecimal NumberInput.parseBigDecimal(String)>
	//    9   18:putfield        #184 <Field BigDecimal _numberBigDecimal>
		else
	//*  10   21:aload_0         
	//*  11   22:aload_0         
	//*  12   23:getfield        #137 <Field int _numTypesValid>
	//*  13   26:bipush          16
	//*  14   28:ior             
	//*  15   29:putfield        #137 <Field int _numTypesValid>
	//*  16   32:return          
		if((_numTypesValid & 4) != 0)
	//*  17   33:aload_0         
	//*  18   34:getfield        #137 <Field int _numTypesValid>
	//*  19   37:iconst_4        
	//*  20   38:iand            
	//*  21   39:ifeq            60
			_numberBigDecimal = new BigDecimal(_numberBigInt);
	//   22   42:aload_0         
	//   23   43:new             #114 <Class BigDecimal>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:getfield        #237 <Field BigInteger _numberBigInt>
	//   27   51:invokespecial   #118 <Method void BigDecimal(BigInteger)>
	//   28   54:putfield        #184 <Field BigDecimal _numberBigDecimal>
		else
	//*  29   57:goto            21
		if((_numTypesValid & 2) != 0)
	//*  30   60:aload_0         
	//*  31   61:getfield        #137 <Field int _numTypesValid>
	//*  32   64:iconst_2        
	//*  33   65:iand            
	//*  34   66:ifeq            83
			_numberBigDecimal = BigDecimal.valueOf(_numberLong);
	//   35   69:aload_0         
	//   36   70:aload_0         
	//   37   71:getfield        #232 <Field long _numberLong>
	//   38   74:invokestatic    #408 <Method BigDecimal BigDecimal.valueOf(long)>
	//   39   77:putfield        #184 <Field BigDecimal _numberBigDecimal>
		else
	//*  40   80:goto            21
		if((_numTypesValid & 1) != 0)
	//*  41   83:aload_0         
	//*  42   84:getfield        #137 <Field int _numTypesValid>
	//*  43   87:iconst_1        
	//*  44   88:iand            
	//*  45   89:ifeq            107
			_numberBigDecimal = BigDecimal.valueOf(_numberInt);
	//   46   92:aload_0         
	//   47   93:aload_0         
	//   48   94:getfield        #342 <Field int _numberInt>
	//   49   97:i2l             
	//   50   98:invokestatic    #408 <Method BigDecimal BigDecimal.valueOf(long)>
	//   51  101:putfield        #184 <Field BigDecimal _numberBigDecimal>
		else
	//*  52  104:goto            21
			_throwInternal();
	//   53  107:aload_0         
	//   54  108:invokevirtual   #411 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 0x10;
	//*  55  111:goto            21
	}

	protected void convertNumberToBigInteger()
		throws IOException
	{
		if((_numTypesValid & 0x10) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:bipush          16
	//*   3    6:iand            
	//*   4    7:ifeq            32
			_numberBigInt = _numberBigDecimal.toBigInteger();
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//    8   15:invokevirtual   #416 <Method BigInteger BigDecimal.toBigInteger()>
	//    9   18:putfield        #237 <Field BigInteger _numberBigInt>
		else
	//*  10   21:aload_0         
	//*  11   22:aload_0         
	//*  12   23:getfield        #137 <Field int _numTypesValid>
	//*  13   26:iconst_4        
	//*  14   27:ior             
	//*  15   28:putfield        #137 <Field int _numTypesValid>
	//*  16   31:return          
		if((_numTypesValid & 2) != 0)
	//*  17   32:aload_0         
	//*  18   33:getfield        #137 <Field int _numTypesValid>
	//*  19   36:iconst_2        
	//*  20   37:iand            
	//*  21   38:ifeq            55
			_numberBigInt = BigInteger.valueOf(_numberLong);
	//   22   41:aload_0         
	//   23   42:aload_0         
	//   24   43:getfield        #232 <Field long _numberLong>
	//   25   46:invokestatic    #100 <Method BigInteger BigInteger.valueOf(long)>
	//   26   49:putfield        #237 <Field BigInteger _numberBigInt>
		else
	//*  27   52:goto            21
		if((_numTypesValid & 1) != 0)
	//*  28   55:aload_0         
	//*  29   56:getfield        #137 <Field int _numTypesValid>
	//*  30   59:iconst_1        
	//*  31   60:iand            
	//*  32   61:ifeq            79
			_numberBigInt = BigInteger.valueOf(_numberInt);
	//   33   64:aload_0         
	//   34   65:aload_0         
	//   35   66:getfield        #342 <Field int _numberInt>
	//   36   69:i2l             
	//   37   70:invokestatic    #100 <Method BigInteger BigInteger.valueOf(long)>
	//   38   73:putfield        #237 <Field BigInteger _numberBigInt>
		else
	//*  39   76:goto            21
		if((_numTypesValid & 8) != 0)
	//*  40   79:aload_0         
	//*  41   80:getfield        #137 <Field int _numTypesValid>
	//*  42   83:bipush          8
	//*  43   85:iand            
	//*  44   86:ifeq            106
			_numberBigInt = BigDecimal.valueOf(_numberDouble).toBigInteger();
	//   45   89:aload_0         
	//   46   90:aload_0         
	//   47   91:getfield        #190 <Field double _numberDouble>
	//   48   94:invokestatic    #419 <Method BigDecimal BigDecimal.valueOf(double)>
	//   49   97:invokevirtual   #416 <Method BigInteger BigDecimal.toBigInteger()>
	//   50  100:putfield        #237 <Field BigInteger _numberBigInt>
		else
	//*  51  103:goto            21
			_throwInternal();
	//   52  106:aload_0         
	//   53  107:invokevirtual   #411 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 4;
	//*  54  110:goto            21
	}

	protected void convertNumberToDouble()
		throws IOException
	{
		if((_numTypesValid & 0x10) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:bipush          16
	//*   3    6:iand            
	//*   4    7:ifeq            33
			_numberDouble = _numberBigDecimal.doubleValue();
	//    5   10:aload_0         
	//    6   11:aload_0         
	//    7   12:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//    8   15:invokevirtual   #423 <Method double BigDecimal.doubleValue()>
	//    9   18:putfield        #190 <Field double _numberDouble>
		else
	//*  10   21:aload_0         
	//*  11   22:aload_0         
	//*  12   23:getfield        #137 <Field int _numTypesValid>
	//*  13   26:bipush          8
	//*  14   28:ior             
	//*  15   29:putfield        #137 <Field int _numTypesValid>
	//*  16   32:return          
		if((_numTypesValid & 4) != 0)
	//*  17   33:aload_0         
	//*  18   34:getfield        #137 <Field int _numTypesValid>
	//*  19   37:iconst_4        
	//*  20   38:iand            
	//*  21   39:ifeq            56
			_numberDouble = _numberBigInt.doubleValue();
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:getfield        #237 <Field BigInteger _numberBigInt>
	//   25   47:invokevirtual   #424 <Method double BigInteger.doubleValue()>
	//   26   50:putfield        #190 <Field double _numberDouble>
		else
	//*  27   53:goto            21
		if((_numTypesValid & 2) != 0)
	//*  28   56:aload_0         
	//*  29   57:getfield        #137 <Field int _numTypesValid>
	//*  30   60:iconst_2        
	//*  31   61:iand            
	//*  32   62:ifeq            77
			_numberDouble = _numberLong;
	//   33   65:aload_0         
	//   34   66:aload_0         
	//   35   67:getfield        #232 <Field long _numberLong>
	//   36   70:l2d             
	//   37   71:putfield        #190 <Field double _numberDouble>
		else
	//*  38   74:goto            21
		if((_numTypesValid & 1) != 0)
	//*  39   77:aload_0         
	//*  40   78:getfield        #137 <Field int _numTypesValid>
	//*  41   81:iconst_1        
	//*  42   82:iand            
	//*  43   83:ifeq            98
			_numberDouble = _numberInt;
	//   44   86:aload_0         
	//   45   87:aload_0         
	//   46   88:getfield        #342 <Field int _numberInt>
	//   47   91:i2d             
	//   48   92:putfield        #190 <Field double _numberDouble>
		else
	//*  49   95:goto            21
			_throwInternal();
	//   50   98:aload_0         
	//   51   99:invokevirtual   #411 <Method void _throwInternal()>
		_numTypesValid = _numTypesValid | 8;
	//*  52  102:goto            21
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
	//*  14   22:ifeq            58
				_reportError((new StringBuilder()).append("Numeric value (").append(getText()).append(") out of range of int").toString());
	//   15   25:aload_0         
	//   16   26:new             #192 <Class StringBuilder>
	//   17   29:dup             
	//   18   30:invokespecial   #194 <Method void StringBuilder()>
	//   19   33:ldc2            #426 <String "Numeric value (">
	//   20   36:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   21   39:aload_0         
	//   22   40:invokevirtual   #401 <Method String getText()>
	//   23   43:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   24   46:ldc2            #428 <String ") out of range of int">
	//   25   49:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   26   52:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   27   55:invokevirtual   #365 <Method void _reportError(String)>
			_numberInt = i;
	//   28   58:aload_0         
	//   29   59:iload_1         
	//   30   60:putfield        #342 <Field int _numberInt>
		} else
	//*  31   63:aload_0         
	//*  32   64:aload_0         
	//*  33   65:getfield        #137 <Field int _numTypesValid>
	//*  34   68:iconst_1        
	//*  35   69:ior             
	//*  36   70:putfield        #137 <Field int _numTypesValid>
	//*  37   73:return          
		if((_numTypesValid & 4) != 0)
	//*  38   74:aload_0         
	//*  39   75:getfield        #137 <Field int _numTypesValid>
	//*  40   78:iconst_4        
	//*  41   79:iand            
	//*  42   80:ifeq            127
		{
			if(BI_MIN_INT.compareTo(_numberBigInt) > 0 || BI_MAX_INT.compareTo(_numberBigInt) < 0)
	//*  43   83:getstatic       #102 <Field BigInteger BI_MIN_INT>
	//*  44   86:aload_0         
	//*  45   87:getfield        #237 <Field BigInteger _numberBigInt>
	//*  46   90:invokevirtual   #432 <Method int BigInteger.compareTo(BigInteger)>
	//*  47   93:ifgt            109
	//*  48   96:getstatic       #104 <Field BigInteger BI_MAX_INT>
	//*  49   99:aload_0         
	//*  50  100:getfield        #237 <Field BigInteger _numberBigInt>
	//*  51  103:invokevirtual   #432 <Method int BigInteger.compareTo(BigInteger)>
	//*  52  106:ifge            113
				reportOverflowInt();
	//   53  109:aload_0         
	//   54  110:invokevirtual   #435 <Method void reportOverflowInt()>
			_numberInt = _numberBigInt.intValue();
	//   55  113:aload_0         
	//   56  114:aload_0         
	//   57  115:getfield        #237 <Field BigInteger _numberBigInt>
	//   58  118:invokevirtual   #438 <Method int BigInteger.intValue()>
	//   59  121:putfield        #342 <Field int _numberInt>
		} else
	//*  60  124:goto            63
		if((_numTypesValid & 8) != 0)
	//*  61  127:aload_0         
	//*  62  128:getfield        #137 <Field int _numTypesValid>
	//*  63  131:bipush          8
	//*  64  133:iand            
	//*  65  134:ifeq            175
		{
			if(_numberDouble < -2147483648D || _numberDouble > 2147483647D)
	//*  66  137:aload_0         
	//*  67  138:getfield        #190 <Field double _numberDouble>
	//*  68  141:ldc2w           #39  <Double -2147483648D>
	//*  69  144:dcmpg           
	//*  70  145:iflt            159
	//*  71  148:aload_0         
	//*  72  149:getfield        #190 <Field double _numberDouble>
	//*  73  152:ldc2w           #29  <Double 2147483647D>
	//*  74  155:dcmpl           
	//*  75  156:ifle            163
				reportOverflowInt();
	//   76  159:aload_0         
	//   77  160:invokevirtual   #435 <Method void reportOverflowInt()>
			_numberInt = (int)_numberDouble;
	//   78  163:aload_0         
	//   79  164:aload_0         
	//   80  165:getfield        #190 <Field double _numberDouble>
	//   81  168:d2i             
	//   82  169:putfield        #342 <Field int _numberInt>
		} else
	//*  83  172:goto            63
		if((_numTypesValid & 0x10) != 0)
	//*  84  175:aload_0         
	//*  85  176:getfield        #137 <Field int _numTypesValid>
	//*  86  179:bipush          16
	//*  87  181:iand            
	//*  88  182:ifeq            229
		{
			if(BD_MIN_INT.compareTo(_numberBigDecimal) > 0 || BD_MAX_INT.compareTo(_numberBigDecimal) < 0)
	//*  89  185:getstatic       #124 <Field BigDecimal BD_MIN_INT>
	//*  90  188:aload_0         
	//*  91  189:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//*  92  192:invokevirtual   #441 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  93  195:ifgt            211
	//*  94  198:getstatic       #126 <Field BigDecimal BD_MAX_INT>
	//*  95  201:aload_0         
	//*  96  202:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//*  97  205:invokevirtual   #441 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  98  208:ifge            215
				reportOverflowInt();
	//   99  211:aload_0         
	//  100  212:invokevirtual   #435 <Method void reportOverflowInt()>
			_numberInt = _numberBigDecimal.intValue();
	//  101  215:aload_0         
	//  102  216:aload_0         
	//  103  217:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//  104  220:invokevirtual   #442 <Method int BigDecimal.intValue()>
	//  105  223:putfield        #342 <Field int _numberInt>
		} else
	//* 106  226:goto            63
		{
			_throwInternal();
	//  107  229:aload_0         
	//  108  230:invokevirtual   #411 <Method void _throwInternal()>
		}
		_numTypesValid = _numTypesValid | 1;
	//* 109  233:goto            63
	}

	protected void convertNumberToLong()
		throws IOException
	{
		if((_numTypesValid & 1) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #137 <Field int _numTypesValid>
	//*   2    4:iconst_1        
	//*   3    5:iand            
	//*   4    6:ifeq            29
			_numberLong = _numberInt;
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #342 <Field int _numberInt>
	//    8   14:i2l             
	//    9   15:putfield        #232 <Field long _numberLong>
		else
	//*  10   18:aload_0         
	//*  11   19:aload_0         
	//*  12   20:getfield        #137 <Field int _numTypesValid>
	//*  13   23:iconst_2        
	//*  14   24:ior             
	//*  15   25:putfield        #137 <Field int _numTypesValid>
	//*  16   28:return          
		if((_numTypesValid & 4) != 0)
	//*  17   29:aload_0         
	//*  18   30:getfield        #137 <Field int _numTypesValid>
	//*  19   33:iconst_4        
	//*  20   34:iand            
	//*  21   35:ifeq            82
		{
			if(BI_MIN_LONG.compareTo(_numberBigInt) > 0 || BI_MAX_LONG.compareTo(_numberBigInt) < 0)
	//*  22   38:getstatic       #108 <Field BigInteger BI_MIN_LONG>
	//*  23   41:aload_0         
	//*  24   42:getfield        #237 <Field BigInteger _numberBigInt>
	//*  25   45:invokevirtual   #432 <Method int BigInteger.compareTo(BigInteger)>
	//*  26   48:ifgt            64
	//*  27   51:getstatic       #112 <Field BigInteger BI_MAX_LONG>
	//*  28   54:aload_0         
	//*  29   55:getfield        #237 <Field BigInteger _numberBigInt>
	//*  30   58:invokevirtual   #432 <Method int BigInteger.compareTo(BigInteger)>
	//*  31   61:ifge            68
				reportOverflowLong();
	//   32   64:aload_0         
	//   33   65:invokevirtual   #446 <Method void reportOverflowLong()>
			_numberLong = _numberBigInt.longValue();
	//   34   68:aload_0         
	//   35   69:aload_0         
	//   36   70:getfield        #237 <Field BigInteger _numberBigInt>
	//   37   73:invokevirtual   #450 <Method long BigInteger.longValue()>
	//   38   76:putfield        #232 <Field long _numberLong>
		} else
	//*  39   79:goto            18
		if((_numTypesValid & 8) != 0)
	//*  40   82:aload_0         
	//*  41   83:getfield        #137 <Field int _numTypesValid>
	//*  42   86:bipush          8
	//*  43   88:iand            
	//*  44   89:ifeq            130
		{
			if(_numberDouble < -9.2233720368547758E+18D || _numberDouble > 9.2233720368547758E+18D)
	//*  45   92:aload_0         
	//*  46   93:getfield        #190 <Field double _numberDouble>
	//*  47   96:ldc2w           #45  <Double -9.2233720368547758E+18D>
	//*  48   99:dcmpg           
	//*  49  100:iflt            114
	//*  50  103:aload_0         
	//*  51  104:getfield        #190 <Field double _numberDouble>
	//*  52  107:ldc2w           #36  <Double 9.2233720368547758E+18D>
	//*  53  110:dcmpl           
	//*  54  111:ifle            118
				reportOverflowLong();
	//   55  114:aload_0         
	//   56  115:invokevirtual   #446 <Method void reportOverflowLong()>
			_numberLong = (long)_numberDouble;
	//   57  118:aload_0         
	//   58  119:aload_0         
	//   59  120:getfield        #190 <Field double _numberDouble>
	//   60  123:d2l             
	//   61  124:putfield        #232 <Field long _numberLong>
		} else
	//*  62  127:goto            18
		if((_numTypesValid & 0x10) != 0)
	//*  63  130:aload_0         
	//*  64  131:getfield        #137 <Field int _numTypesValid>
	//*  65  134:bipush          16
	//*  66  136:iand            
	//*  67  137:ifeq            184
		{
			if(BD_MIN_LONG.compareTo(_numberBigDecimal) > 0 || BD_MAX_LONG.compareTo(_numberBigDecimal) < 0)
	//*  68  140:getstatic       #120 <Field BigDecimal BD_MIN_LONG>
	//*  69  143:aload_0         
	//*  70  144:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//*  71  147:invokevirtual   #441 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  72  150:ifgt            166
	//*  73  153:getstatic       #122 <Field BigDecimal BD_MAX_LONG>
	//*  74  156:aload_0         
	//*  75  157:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//*  76  160:invokevirtual   #441 <Method int BigDecimal.compareTo(BigDecimal)>
	//*  77  163:ifge            170
				reportOverflowLong();
	//   78  166:aload_0         
	//   79  167:invokevirtual   #446 <Method void reportOverflowLong()>
			_numberLong = _numberBigDecimal.longValue();
	//   80  170:aload_0         
	//   81  171:aload_0         
	//   82  172:getfield        #184 <Field BigDecimal _numberBigDecimal>
	//   83  175:invokevirtual   #451 <Method long BigDecimal.longValue()>
	//   84  178:putfield        #232 <Field long _numberLong>
		} else
	//*  85  181:goto            18
		{
			_throwInternal();
	//   86  184:aload_0         
	//   87  185:invokevirtual   #411 <Method void _throwInternal()>
		}
		_numTypesValid = _numTypesValid | 2;
	//*  88  188:goto            18
	}

	public JsonParser disable(com.fasterxml.jackson.core.JsonParser.Feature feature)
	{
		_features = _features & ~feature.getMask();
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #456 <Field int _features>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #243 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    5    9:iconst_m1       
	//    6   10:ixor            
	//    7   11:iand            
	//    8   12:putfield        #456 <Field int _features>
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
	//    2    2:getfield        #456 <Field int _features>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #243 <Method int com.fasterxml.jackson.core.JsonParser$Feature.getMask()>
	//    5    9:ior             
	//    6   10:putfield        #456 <Field int _features>
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
	//   10   18:invokevirtual   #345 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 4) == 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #137 <Field int _numTypesValid>
	//*  13   25:iconst_4        
	//*  14   26:iand            
	//*  15   27:ifne            34
				convertNumberToBigInteger();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #460 <Method void convertNumberToBigInteger()>
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
	//*   1    1:getfield        #464 <Field byte[] _binaryValue>
	//*   2    4:ifnonnull       73
		{
			if(_currToken != JsonToken.VALUE_STRING)
	//*   3    7:aload_0         
	//*   4    8:getfield        #322 <Field JsonToken _currToken>
	//*   5   11:getstatic       #467 <Field JsonToken JsonToken.VALUE_STRING>
	//*   6   14:if_acmpeq       50
				_reportError((new StringBuilder()).append("Current token (").append(((Object) (_currToken))).append(") not VALUE_STRING, can not access as binary").toString());
	//    7   17:aload_0         
	//    8   18:new             #192 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #194 <Method void StringBuilder()>
	//   11   25:ldc2            #360 <String "Current token (">
	//   12   28:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:aload_0         
	//   14   32:getfield        #322 <Field JsonToken _currToken>
	//   15   35:invokevirtual   #313 <Method StringBuilder StringBuilder.append(Object)>
	//   16   38:ldc2            #469 <String ") not VALUE_STRING, can not access as binary">
	//   17   41:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   18   44:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   19   47:invokevirtual   #365 <Method void _reportError(String)>
			ByteArrayBuilder bytearraybuilder = _getByteArrayBuilder();
	//   20   50:aload_0         
	//   21   51:invokevirtual   #471 <Method ByteArrayBuilder _getByteArrayBuilder()>
	//   22   54:astore_2        
			_decodeBase64(getText(), bytearraybuilder, base64variant);
	//   23   55:aload_0         
	//   24   56:aload_0         
	//   25   57:invokevirtual   #401 <Method String getText()>
	//   26   60:aload_2         
	//   27   61:aload_1         
	//   28   62:invokevirtual   #475 <Method void _decodeBase64(String, ByteArrayBuilder, Base64Variant)>
			_binaryValue = bytearraybuilder.toByteArray();
	//   29   65:aload_0         
	//   30   66:aload_2         
	//   31   67:invokevirtual   #479 <Method byte[] ByteArrayBuilder.toByteArray()>
	//   32   70:putfield        #464 <Field byte[] _binaryValue>
		}
		return _binaryValue;
	//   33   73:aload_0         
	//   34   74:getfield        #464 <Field byte[] _binaryValue>
	//   35   77:areturn         
	}

	public JsonLocation getCurrentLocation()
	{
		int i = _inputPtr;
	//    0    0:aload_0         
	//    1    1:getfield        #483 <Field int _inputPtr>
	//    2    4:istore_1        
		int j = _currInputRowStart;
	//    3    5:aload_0         
	//    4    6:getfield        #485 <Field int _currInputRowStart>
	//    5    9:istore_2        
		return new JsonLocation(_ioContext.getSourceReference(), -1L, _currInputProcessed + (long)_inputPtr, _currInputRow, (i - j) + 1);
	//    6   10:new             #487 <Class JsonLocation>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:getfield        #139 <Field IOContext _ioContext>
	//   10   18:invokevirtual   #306 <Method Object IOContext.getSourceReference()>
	//   11   21:ldc2w           #488 <Long -1L>
	//   12   24:aload_0         
	//   13   25:getfield        #491 <Field long _currInputProcessed>
	//   14   28:aload_0         
	//   15   29:getfield        #483 <Field int _inputPtr>
	//   16   32:i2l             
	//   17   33:ladd            
	//   18   34:aload_0         
	//   19   35:getfield        #133 <Field int _currInputRow>
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:isub            
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:invokespecial   #494 <Method void JsonLocation(Object, long, long, int, int)>
	//   26   46:areturn         
	}

	public String getCurrentName()
		throws IOException
	{
		if(_currToken == JsonToken.START_OBJECT || _currToken == JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field JsonToken _currToken>
	//*   2    4:getstatic       #498 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       20
	//*   4   10:aload_0         
	//*   5   11:getfield        #322 <Field JsonToken _currToken>
	//*   6   14:getstatic       #501 <Field JsonToken JsonToken.START_ARRAY>
	//*   7   17:if_acmpne       31
			return _parsingContext.clearAndGetParent().getCurrentName();
	//    8   20:aload_0         
	//    9   21:getfield        #171 <Field JsonReadContext _parsingContext>
	//   10   24:invokevirtual   #505 <Method JsonReadContext JsonReadContext.clearAndGetParent()>
	//   11   27:invokevirtual   #507 <Method String JsonReadContext.getCurrentName()>
	//   12   30:areturn         
		else
			return _parsingContext.getCurrentName();
	//   13   31:aload_0         
	//   14   32:getfield        #171 <Field JsonReadContext _parsingContext>
	//   15   35:invokevirtual   #507 <Method String JsonReadContext.getCurrentName()>
	//   16   38:areturn         
	}

	public Object getCurrentValue()
	{
		return _parsingContext.getCurrentValue();
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field JsonReadContext _parsingContext>
	//    2    4:invokevirtual   #510 <Method Object JsonReadContext.getCurrentValue()>
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
	//   10   20:invokevirtual   #345 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 0x10) == 0)
	//*  11   23:aload_0         
	//*  12   24:getfield        #137 <Field int _numTypesValid>
	//*  13   27:bipush          16
	//*  14   29:iand            
	//*  15   30:ifne            37
				convertNumberToBigDecimal();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #513 <Method void convertNumberToBigDecimal()>
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
	//   10   20:invokevirtual   #345 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 8) == 0)
	//*  11   23:aload_0         
	//*  12   24:getfield        #137 <Field int _numTypesValid>
	//*  13   27:bipush          8
	//*  14   29:iand            
	//*  15   30:ifne            37
				convertNumberToDouble();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #516 <Method void convertNumberToDouble()>
		}
		return _numberDouble;
	//   18   37:aload_0         
	//   19   38:getfield        #190 <Field double _numberDouble>
	//   20   41:dreturn         
	}

	public Object getEmbeddedObject()
		throws IOException
	{
		return ((Object) (null));
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public float getFloatValue()
		throws IOException
	{
		return (float)getDoubleValue();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #521 <Method double getDoubleValue()>
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
	//    9   17:invokevirtual   #524 <Method int _parseIntValue()>
	//   10   20:ireturn         
			if((_numTypesValid & 1) == 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #137 <Field int _numTypesValid>
	//*  13   25:iconst_1        
	//*  14   26:iand            
	//*  15   27:ifne            34
				convertNumberToInt();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #348 <Method void convertNumberToInt()>
		}
		return _numberInt;
	//   18   34:aload_0         
	//   19   35:getfield        #342 <Field int _numberInt>
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
	//   10   18:invokevirtual   #345 <Method void _parseNumericValue(int)>
			if((_numTypesValid & 2) == 0)
	//*  11   21:aload_0         
	//*  12   22:getfield        #137 <Field int _numTypesValid>
	//*  13   25:iconst_2        
	//*  14   26:iand            
	//*  15   27:ifne            34
				convertNumberToLong();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #527 <Method void convertNumberToLong()>
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
	//    5    9:invokevirtual   #345 <Method void _parseNumericValue(int)>
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   6   12:aload_0         
	//*   7   13:getfield        #322 <Field JsonToken _currToken>
	//*   8   16:getstatic       #327 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   9   19:if_acmpne       52
		{
			if((_numTypesValid & 1) != 0)
	//*  10   22:aload_0         
	//*  11   23:getfield        #137 <Field int _numTypesValid>
	//*  12   26:iconst_1        
	//*  13   27:iand            
	//*  14   28:ifeq            35
				return com.fasterxml.jackson.core.JsonParser.NumberType.INT;
	//   15   31:getstatic       #535 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.INT>
	//   16   34:areturn         
			if((_numTypesValid & 2) != 0)
	//*  17   35:aload_0         
	//*  18   36:getfield        #137 <Field int _numTypesValid>
	//*  19   39:iconst_2        
	//*  20   40:iand            
	//*  21   41:ifeq            48
				return com.fasterxml.jackson.core.JsonParser.NumberType.LONG;
	//   22   44:getstatic       #538 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.LONG>
	//   23   47:areturn         
			else
				return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER;
	//   24   48:getstatic       #541 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_INTEGER>
	//   25   51:areturn         
		}
		if((_numTypesValid & 0x10) != 0)
	//*  26   52:aload_0         
	//*  27   53:getfield        #137 <Field int _numTypesValid>
	//*  28   56:bipush          16
	//*  29   58:iand            
	//*  30   59:ifeq            66
			return com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL;
	//   31   62:getstatic       #544 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.BIG_DECIMAL>
	//   32   65:areturn         
		else
			return com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE;
	//   33   66:getstatic       #547 <Field com.fasterxml.jackson.core.JsonParser$NumberType com.fasterxml.jackson.core.JsonParser$NumberType.DOUBLE>
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
	//    5    9:invokevirtual   #345 <Method void _parseNumericValue(int)>
		if(_currToken == JsonToken.VALUE_NUMBER_INT)
	//*   6   12:aload_0         
	//*   7   13:getfield        #322 <Field JsonToken _currToken>
	//*   8   16:getstatic       #327 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
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
	//   16   32:getfield        #342 <Field int _numberInt>
	//   17   35:invokestatic    #554 <Method Integer Integer.valueOf(int)>
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
	//   26   52:invokestatic    #557 <Method Long Long.valueOf(long)>
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
	//   53  101:invokevirtual   #411 <Method void _throwInternal()>
		return ((Number) (Double.valueOf(_numberDouble)));
	//   54  104:aload_0         
	//   55  105:getfield        #190 <Field double _numberDouble>
	//   56  108:invokestatic    #562 <Method Double Double.valueOf(double)>
	//   57  111:areturn         
	}

	public volatile JsonStreamContext getParsingContext()
	{
		return ((JsonStreamContext) (getParsingContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #566 <Method JsonReadContext getParsingContext()>
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
	//    1    1:getfield        #569 <Field long _tokenInputTotal>
	//    2    4:lreturn         
	}

	public int getTokenColumnNr()
	{
		int i = _tokenInputCol;
	//    0    0:aload_0         
	//    1    1:getfield        #572 <Field int _tokenInputCol>
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
	//    0    0:new             #487 <Class JsonLocation>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #139 <Field IOContext _ioContext>
	//    4    8:invokevirtual   #306 <Method Object IOContext.getSourceReference()>
	//    5   11:ldc2w           #488 <Long -1L>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #576 <Method long getTokenCharacterOffset()>
	//    8   18:aload_0         
	//    9   19:invokevirtual   #578 <Method int getTokenLineNr()>
	//   10   22:aload_0         
	//   11   23:invokevirtual   #580 <Method int getTokenColumnNr()>
	//   12   26:invokespecial   #494 <Method void JsonLocation(Object, long, long, int, int)>
	//   13   29:areturn         
	}

	public boolean hasTextCharacters()
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #322 <Field JsonToken _currToken>
	//*   2    4:getstatic       #467 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       12
			return true;
	//    4   10:iconst_1        
	//    5   11:ireturn         
		if(_currToken == JsonToken.FIELD_NAME)
	//*   6   12:aload_0         
	//*   7   13:getfield        #322 <Field JsonToken _currToken>
	//*   8   16:getstatic       #584 <Field JsonToken JsonToken.FIELD_NAME>
	//*   9   19:if_acmpne       27
			return _nameCopied;
	//   10   22:aload_0         
	//   11   23:getfield        #586 <Field boolean _nameCopied>
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
	//    1    1:getfield        #393 <Field boolean _closed>
	//    2    4:ireturn         
	}

	protected abstract boolean loadMore()
		throws IOException;

	protected final void loadMoreGuaranteed()
		throws IOException
	{
		if(!loadMore())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #591 <Method boolean loadMore()>
	//*   2    4:ifne            11
			_reportInvalidEOF();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #593 <Method void _reportInvalidEOF()>
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
	//*   4    6:getfield        #322 <Field JsonToken _currToken>
	//*   5    9:getstatic       #498 <Field JsonToken JsonToken.START_OBJECT>
	//*   6   12:if_acmpeq       27
			{
				jsonreadcontext = jsonreadcontext1;
	//    7   15:aload_3         
	//    8   16:astore_2        
				if(_currToken != JsonToken.START_ARRAY)
					break label0;
	//    9   17:aload_0         
	//   10   18:getfield        #322 <Field JsonToken _currToken>
	//   11   21:getstatic       #501 <Field JsonToken JsonToken.START_ARRAY>
	//   12   24:if_acmpne       32
			}
			jsonreadcontext = jsonreadcontext1.getParent();
	//   13   27:aload_3         
	//   14   28:invokevirtual   #597 <Method JsonReadContext JsonReadContext.getParent()>
	//   15   31:astore_2        
		}
		try
		{
			jsonreadcontext.setCurrentName(s);
	//   16   32:aload_2         
	//   17   33:aload_1         
	//   18   34:invokevirtual   #600 <Method void JsonReadContext.setCurrentName(String)>
			return;
	//   19   37:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  20   38:astore_1        
		{
			throw new IllegalStateException(((Throwable) (s)));
	//   21   39:new             #602 <Class IllegalStateException>
	//   22   42:dup             
	//   23   43:aload_1         
	//   24   44:invokespecial   #605 <Method void IllegalStateException(Throwable)>
	//   25   47:athrow          
		}
	}

	public JsonParser overrideStdFeatures(int i, int j)
	{
		int k = _features;
	//    0    0:aload_0         
	//    1    1:getfield        #456 <Field int _features>
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
	//   21   25:putfield        #456 <Field int _features>
			_checkStdFeatureChanges(i, j);
	//   22   28:aload_0         
	//   23   29:iload_1         
	//   24   30:iload_2         
	//   25   31:invokevirtual   #609 <Method void _checkStdFeatureChanges(int, int)>
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
	//    5    5:invokevirtual   #614 <Method IllegalArgumentException reportInvalidBase64Char(Base64Variant, int, int, String)>
	//    6    8:areturn         
	}

	protected IllegalArgumentException reportInvalidBase64Char(Base64Variant base64variant, int i, int j, String s)
		throws IllegalArgumentException
	{
		Object obj;
		if(i <= 32)
	//*   0    0:iload_2         
	//*   1    1:bipush          32
	//*   2    3:icmpgt          93
			base64variant = ((Base64Variant) ((new StringBuilder()).append("Illegal white space character (code 0x").append(Integer.toHexString(i)).append(") as character #").append(j + 1).append(" of 4-char base64 unit: can only used between units").toString()));
	//    3    6:new             #192 <Class StringBuilder>
	//    4    9:dup             
	//    5   10:invokespecial   #194 <Method void StringBuilder()>
	//    6   13:ldc2            #616 <String "Illegal white space character (code 0x">
	//    7   16:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    8   19:iload_2         
	//    9   20:invokestatic    #620 <Method String Integer.toHexString(int)>
	//   10   23:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc2            #622 <String ") as character #">
	//   12   29:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   13   32:iload_3         
	//   14   33:iconst_1        
	//   15   34:iadd            
	//   16   35:invokevirtual   #625 <Method StringBuilder StringBuilder.append(int)>
	//   17   38:ldc2            #627 <String " of 4-char base64 unit: can only used between units">
	//   18   41:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   19   44:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   20   47:astore_1        
		else
	//*  21   48:aload_1         
	//*  22   49:astore          5
	//*  23   51:aload           4
	//*  24   53:ifnull          83
	//*  25   56:new             #192 <Class StringBuilder>
	//*  26   59:dup             
	//*  27   60:invokespecial   #194 <Method void StringBuilder()>
	//*  28   63:aload_1         
	//*  29   64:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//*  30   67:ldc2            #629 <String ": ">
	//*  31   70:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//*  32   73:aload           4
	//*  33   75:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//*  34   78:invokevirtual   #209 <Method String StringBuilder.toString()>
	//*  35   81:astore          5
	//*  36   83:new             #611 <Class IllegalArgumentException>
	//*  37   86:dup             
	//*  38   87:aload           5
	//*  39   89:invokespecial   #630 <Method void IllegalArgumentException(String)>
	//*  40   92:areturn         
		if(base64variant.usesPaddingChar(i))
	//*  41   93:aload_1         
	//*  42   94:iload_2         
	//*  43   95:invokevirtual   #633 <Method boolean Base64Variant.usesPaddingChar(int)>
	//*  44   98:ifeq            146
			base64variant = ((Base64Variant) ((new StringBuilder()).append("Unexpected padding character ('").append(base64variant.getPaddingChar()).append("') as character #").append(j + 1).append(" of 4-char base64 unit: padding only legal as 3rd or 4th character").toString()));
	//   45  101:new             #192 <Class StringBuilder>
	//   46  104:dup             
	//   47  105:invokespecial   #194 <Method void StringBuilder()>
	//   48  108:ldc2            #635 <String "Unexpected padding character ('">
	//   49  111:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   50  114:aload_1         
	//   51  115:invokevirtual   #638 <Method char Base64Variant.getPaddingChar()>
	//   52  118:invokevirtual   #384 <Method StringBuilder StringBuilder.append(char)>
	//   53  121:ldc2            #640 <String "') as character #">
	//   54  124:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   55  127:iload_3         
	//   56  128:iconst_1        
	//   57  129:iadd            
	//   58  130:invokevirtual   #625 <Method StringBuilder StringBuilder.append(int)>
	//   59  133:ldc2            #642 <String " of 4-char base64 unit: padding only legal as 3rd or 4th character">
	//   60  136:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   61  139:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   62  142:astore_1        
		else
	//*  63  143:goto            48
		if(!Character.isDefined(i) || Character.isISOControl(i))
	//*  64  146:iload_2         
	//*  65  147:invokestatic    #647 <Method boolean Character.isDefined(int)>
	//*  66  150:ifeq            160
	//*  67  153:iload_2         
	//*  68  154:invokestatic    #650 <Method boolean Character.isISOControl(int)>
	//*  69  157:ifeq            193
			base64variant = ((Base64Variant) ((new StringBuilder()).append("Illegal character (code 0x").append(Integer.toHexString(i)).append(") in base64 content").toString()));
	//   70  160:new             #192 <Class StringBuilder>
	//   71  163:dup             
	//   72  164:invokespecial   #194 <Method void StringBuilder()>
	//   73  167:ldc2            #652 <String "Illegal character (code 0x">
	//   74  170:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   75  173:iload_2         
	//   76  174:invokestatic    #620 <Method String Integer.toHexString(int)>
	//   77  177:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   78  180:ldc2            #654 <String ") in base64 content">
	//   79  183:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   80  186:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   81  189:astore_1        
		else
	//*  82  190:goto            48
			base64variant = ((Base64Variant) ((new StringBuilder()).append("Illegal character '").append((char)i).append("' (code 0x").append(Integer.toHexString(i)).append(") in base64 content").toString()));
	//   83  193:new             #192 <Class StringBuilder>
	//   84  196:dup             
	//   85  197:invokespecial   #194 <Method void StringBuilder()>
	//   86  200:ldc2            #656 <String "Illegal character '">
	//   87  203:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   88  206:iload_2         
	//   89  207:int2char        
	//   90  208:invokevirtual   #384 <Method StringBuilder StringBuilder.append(char)>
	//   91  211:ldc2            #658 <String "' (code 0x">
	//   92  214:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   93  217:iload_2         
	//   94  218:invokestatic    #620 <Method String Integer.toHexString(int)>
	//   95  221:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   96  224:ldc2            #654 <String ") in base64 content">
	//   97  227:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   98  230:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   99  233:astore_1        
		obj = ((Object) (base64variant));
		if(s != null)
			obj = ((Object) ((new StringBuilder()).append(((String) (base64variant))).append(": ").append(s).toString()));
		return new IllegalArgumentException(((String) (obj)));
	//* 100  234:goto            48
	}

	protected void reportInvalidNumber(String s)
		throws JsonParseException
	{
		_reportError((new StringBuilder()).append("Invalid numeric value: ").append(s).toString());
	//    0    0:aload_0         
	//    1    1:new             #192 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #194 <Method void StringBuilder()>
	//    4    8:ldc2            #661 <String "Invalid numeric value: ">
	//    5   11:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_1         
	//    7   15:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:invokevirtual   #209 <Method String StringBuilder.toString()>
	//    9   21:invokevirtual   #365 <Method void _reportError(String)>
	//   10   24:return          
	}

	protected void reportOverflowInt()
		throws IOException
	{
		_reportError((new StringBuilder()).append("Numeric value (").append(getText()).append(") out of range of int (").append(0x80000000).append(" - ").append(0x7fffffff).append(")").toString());
	//    0    0:aload_0         
	//    1    1:new             #192 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #194 <Method void StringBuilder()>
	//    4    8:ldc2            #426 <String "Numeric value (">
	//    5   11:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #401 <Method String getText()>
	//    8   18:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:ldc2            #663 <String ") out of range of int (">
	//   10   24:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc2            #664 <Int 0x80000000>
	//   12   30:invokevirtual   #625 <Method StringBuilder StringBuilder.append(int)>
	//   13   33:ldc2            #666 <String " - ">
	//   14   36:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   15   39:ldc2            #667 <Int 0x7fffffff>
	//   16   42:invokevirtual   #625 <Method StringBuilder StringBuilder.append(int)>
	//   17   45:ldc2            #315 <String ")">
	//   18   48:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   19   51:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   20   54:invokevirtual   #365 <Method void _reportError(String)>
	//   21   57:return          
	}

	protected void reportOverflowLong()
		throws IOException
	{
		_reportError((new StringBuilder()).append("Numeric value (").append(getText()).append(") out of range of long (").append(0x0L).append(" - ").append(0xffffffffL).append(")").toString());
	//    0    0:aload_0         
	//    1    1:new             #192 <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #194 <Method void StringBuilder()>
	//    4    8:ldc2            #426 <String "Numeric value (">
	//    5   11:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:invokevirtual   #401 <Method String getText()>
	//    8   18:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    9   21:ldc2            #669 <String ") out of range of long (">
	//   10   24:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:ldc2w           #105 <Long 0x0L>
	//   12   30:invokevirtual   #672 <Method StringBuilder StringBuilder.append(long)>
	//   13   33:ldc2            #666 <String " - ">
	//   14   36:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   15   39:ldc2w           #109 <Long 0xffffffffL>
	//   16   42:invokevirtual   #672 <Method StringBuilder StringBuilder.append(long)>
	//   17   45:ldc2            #315 <String ")">
	//   18   48:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   19   51:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   20   54:invokevirtual   #365 <Method void _reportError(String)>
	//   21   57:return          
	}

	protected void reportUnexpectedNumberChar(int i, String s)
		throws JsonParseException
	{
		String s2 = (new StringBuilder()).append("Unexpected character (").append(_getCharDesc(i)).append(") in numeric value").toString();
	//    0    0:new             #192 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #194 <Method void StringBuilder()>
	//    3    7:ldc2            #676 <String "Unexpected character (">
	//    4   10:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    5   13:iload_1         
	//    6   14:invokestatic    #679 <Method String _getCharDesc(int)>
	//    7   17:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//    8   20:ldc2            #681 <String ") in numeric value">
	//    9   23:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   10   26:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   11   29:astore          4
		String s1 = s2;
	//   12   31:aload           4
	//   13   33:astore_3        
		if(s != null)
	//*  14   34:aload_2         
	//*  15   35:ifnull          64
			s1 = (new StringBuilder()).append(s2).append(": ").append(s).toString();
	//   16   38:new             #192 <Class StringBuilder>
	//   17   41:dup             
	//   18   42:invokespecial   #194 <Method void StringBuilder()>
	//   19   45:aload           4
	//   20   47:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   21   50:ldc2            #629 <String ": ">
	//   22   53:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   23   56:aload_2         
	//   24   57:invokevirtual   #200 <Method StringBuilder StringBuilder.append(String)>
	//   25   60:invokevirtual   #209 <Method String StringBuilder.toString()>
	//   26   63:astore_3        
		_reportError(s1);
	//   27   64:aload_0         
	//   28   65:aload_3         
	//   29   66:invokevirtual   #365 <Method void _reportError(String)>
	//   30   69:return          
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
	//    9   14:invokevirtual   #686 <Method JsonToken resetInt(boolean, int)>
	//   10   17:areturn         
		else
			return resetFloat(flag, i, j, k);
	//   11   18:aload_0         
	//   12   19:iload_1         
	//   13   20:iload_2         
	//   14   21:iload_3         
	//   15   22:iload           4
	//   16   24:invokevirtual   #689 <Method JsonToken resetFloat(boolean, int, int, int)>
	//   17   27:areturn         
	}

	protected final JsonToken resetAsNaN(String s, double d)
	{
		_textBuffer.resetWithString(s);
	//    0    0:aload_0         
	//    1    1:getfield        #147 <Field TextBuffer _textBuffer>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #694 <Method void TextBuffer.resetWithString(String)>
		_numberDouble = d;
	//    4    8:aload_0         
	//    5    9:dload_2         
	//    6   10:putfield        #190 <Field double _numberDouble>
		_numTypesValid = 8;
	//    7   13:aload_0         
	//    8   14:bipush          8
	//    9   16:putfield        #137 <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_FLOAT;
	//   10   19:getstatic       #356 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
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
	//    5    7:putfield        #336 <Field int _intLength>
		_fractLength = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #696 <Field int _fractLength>
		_expLength = k;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #698 <Field int _expLength>
		_numTypesValid = 0;
	//   12   21:aload_0         
	//   13   22:iconst_0        
	//   14   23:putfield        #137 <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_FLOAT;
	//   15   26:getstatic       #356 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
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
	//    5    7:putfield        #336 <Field int _intLength>
		_fractLength = 0;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #696 <Field int _fractLength>
		_expLength = 0;
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:putfield        #698 <Field int _expLength>
		_numTypesValid = 0;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #137 <Field int _numTypesValid>
		return JsonToken.VALUE_NUMBER_INT;
	//   15   25:getstatic       #327 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//   16   28:areturn         
	}

	public void setCurrentValue(Object obj)
	{
		_parsingContext.setCurrentValue(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field JsonReadContext _parsingContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #702 <Method void JsonReadContext.setCurrentValue(Object)>
	//    4    8:return          
	}

	public JsonParser setFeatureMask(int i)
	{
		int j = _features ^ i;
	//    0    0:aload_0         
	//    1    1:getfield        #456 <Field int _features>
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
	//    9   13:putfield        #456 <Field int _features>
			_checkStdFeatureChanges(i, j);
	//   10   16:aload_0         
	//   11   17:iload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #609 <Method void _checkStdFeatureChanges(int, int)>
		}
		return ((JsonParser) (this));
	//   14   22:aload_0         
	//   15   23:areturn         
	}

	public Version version()
	{
		return PackageVersion.VERSION;
	//    0    0:getstatic       #714 <Field Version PackageVersion.VERSION>
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
