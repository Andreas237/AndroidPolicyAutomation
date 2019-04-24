// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.io.JsonEOFException;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;

public abstract class ParserMinimalBase extends JsonParser
{

	protected ParserMinimalBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #46  <Method void JsonParser()>
	//    2    4:return          
	}

	protected ParserMinimalBase(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #50  <Method void JsonParser(int)>
	//    3    5:return          
	}

	protected static String _ascii(byte abyte0[])
	{
		try
		{
			abyte0 = ((byte []) (new String(abyte0, "US-ASCII")));
	//    0    0:new             #56  <Class String>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:ldc1            #58  <String "US-ASCII">
	//    4    7:invokespecial   #61  <Method void String(byte[], String)>
	//    5   10:astore_0        
		}
	//*   6   11:aload_0         
	//*   7   12:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*   8   13:astore_0        
		{
			throw new RuntimeException(((Throwable) (abyte0)));
	//    9   14:new             #63  <Class RuntimeException>
	//   10   17:dup             
	//   11   18:aload_0         
	//   12   19:invokespecial   #66  <Method void RuntimeException(Throwable)>
	//   13   22:athrow          
		}
		return ((String) (abyte0));
	}

	protected static byte[] _asciiBytes(String s)
	{
		byte abyte0[] = new byte[s.length()];
	//    0    0:aload_0         
	//    1    1:invokevirtual   #72  <Method int String.length()>
	//    2    4:newarray        byte[]
	//    3    6:astore_3        
		int j = s.length();
	//    4    7:aload_0         
	//    5    8:invokevirtual   #72  <Method int String.length()>
	//    6   11:istore_2        
		for(int i = 0; i < j; i++)
	//*   7   12:iconst_0        
	//*   8   13:istore_1        
	//*   9   14:iload_1         
	//*  10   15:iload_2         
	//*  11   16:icmpge          35
			abyte0[i] = (byte)s.charAt(i);
	//   12   19:aload_3         
	//   13   20:iload_1         
	//   14   21:aload_0         
	//   15   22:iload_1         
	//   16   23:invokevirtual   #76  <Method char String.charAt(int)>
	//   17   26:int2byte        
	//   18   27:bastore         

	//   19   28:iload_1         
	//   20   29:iconst_1        
	//   21   30:iadd            
	//   22   31:istore_1        
	//*  23   32:goto            14
		return abyte0;
	//   24   35:aload_3         
	//   25   36:areturn         
	}

	protected static final String _getCharDesc(int i)
	{
		char c = (char)i;
	//    0    0:iload_0         
	//    1    1:int2char        
	//    2    2:istore_1        
		if(Character.isISOControl(c))
	//*   3    3:iload_1         
	//*   4    4:invokestatic    #84  <Method boolean Character.isISOControl(char)>
	//*   5    7:ifeq            43
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #86  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #87  <Method void StringBuilder()>
	//    9   17:astore_2        
			stringbuilder.append("(CTRL-CHAR, code ");
	//   10   18:aload_2         
	//   11   19:ldc1            #89  <String "(CTRL-CHAR, code ">
	//   12   21:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			stringbuilder.append(i);
	//   14   25:aload_2         
	//   15   26:iload_0         
	//   16   27:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   17   30:pop             
			stringbuilder.append(")");
	//   18   31:aload_2         
	//   19   32:ldc1            #98  <String ")">
	//   20   34:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
			return stringbuilder.toString();
	//   22   38:aload_2         
	//   23   39:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   24   42:areturn         
		}
		if(i > 255)
	//*  25   43:iload_0         
	//*  26   44:sipush          255
	//*  27   47:icmple          112
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   28   50:new             #86  <Class StringBuilder>
	//   29   53:dup             
	//   30   54:invokespecial   #87  <Method void StringBuilder()>
	//   31   57:astore_2        
			stringbuilder1.append("'");
	//   32   58:aload_2         
	//   33   59:ldc1            #104 <String "'">
	//   34   61:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
			stringbuilder1.append(c);
	//   36   65:aload_2         
	//   37   66:iload_1         
	//   38   67:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//   39   70:pop             
			stringbuilder1.append("' (code ");
	//   40   71:aload_2         
	//   41   72:ldc1            #109 <String "' (code ">
	//   42   74:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   43   77:pop             
			stringbuilder1.append(i);
	//   44   78:aload_2         
	//   45   79:iload_0         
	//   46   80:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   47   83:pop             
			stringbuilder1.append(" / 0x");
	//   48   84:aload_2         
	//   49   85:ldc1            #111 <String " / 0x">
	//   50   87:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   51   90:pop             
			stringbuilder1.append(Integer.toHexString(i));
	//   52   91:aload_2         
	//   53   92:iload_0         
	//   54   93:invokestatic    #116 <Method String Integer.toHexString(int)>
	//   55   96:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   56   99:pop             
			stringbuilder1.append(")");
	//   57  100:aload_2         
	//   58  101:ldc1            #98  <String ")">
	//   59  103:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   60  106:pop             
			return stringbuilder1.toString();
	//   61  107:aload_2         
	//   62  108:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   63  111:areturn         
		} else
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   64  112:new             #86  <Class StringBuilder>
	//   65  115:dup             
	//   66  116:invokespecial   #87  <Method void StringBuilder()>
	//   67  119:astore_2        
			stringbuilder2.append("'");
	//   68  120:aload_2         
	//   69  121:ldc1            #104 <String "'">
	//   70  123:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   71  126:pop             
			stringbuilder2.append(c);
	//   72  127:aload_2         
	//   73  128:iload_1         
	//   74  129:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//   75  132:pop             
			stringbuilder2.append("' (code ");
	//   76  133:aload_2         
	//   77  134:ldc1            #109 <String "' (code ">
	//   78  136:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   79  139:pop             
			stringbuilder2.append(i);
	//   80  140:aload_2         
	//   81  141:iload_0         
	//   82  142:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   83  145:pop             
			stringbuilder2.append(")");
	//   84  146:aload_2         
	//   85  147:ldc1            #98  <String ")">
	//   86  149:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   87  152:pop             
			return stringbuilder2.toString();
	//   88  153:aload_2         
	//   89  154:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   90  157:areturn         
		}
	}

	protected final JsonParseException _constructError(String s, Throwable throwable)
	{
		return new JsonParseException(((JsonParser) (this)), s, throwable);
	//    0    0:new             #120 <Class JsonParseException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #123 <Method void JsonParseException(JsonParser, String, Throwable)>
	//    6   10:areturn         
	}

	protected void _decodeBase64(String s, ByteArrayBuilder bytearraybuilder, Base64Variant base64variant)
		throws IOException
	{
		try
		{
			base64variant.decode(s, bytearraybuilder);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #133 <Method void Base64Variant.decode(String, ByteArrayBuilder)>
			return;
	//    4    6:return          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
	//*   5    7:astore_1        
		{
			_reportError(((IllegalArgumentException) (s)).getMessage());
	//    6    8:aload_0         
	//    7    9:aload_1         
	//    8   10:invokevirtual   #136 <Method String IllegalArgumentException.getMessage()>
	//    9   13:invokevirtual   #140 <Method void _reportError(String)>
		}
	//   10   16:return          
	}

	protected abstract void _handleEOF()
		throws JsonParseException;

	protected char _handleUnrecognizedCharacterEscape(char c)
		throws JsonProcessingException
	{
		if(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER))
	//*   0    0:aload_0         
	//*   1    1:getstatic       #152 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER>
	//*   2    4:invokevirtual   #156 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifeq            12
			return c;
	//    4   10:iload_1         
	//    5   11:ireturn         
		if(c == '\'' && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*   6   12:iload_1         
	//*   7   13:bipush          39
	//*   8   15:icmpne          30
	//*   9   18:aload_0         
	//*  10   19:getstatic       #159 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*  11   22:invokevirtual   #156 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  12   25:ifeq            30
		{
			return c;
	//   13   28:iload_1         
	//   14   29:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   30:new             #86  <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #87  <Method void StringBuilder()>
	//   18   37:astore_2        
			stringbuilder.append("Unrecognized character escape ");
	//   19   38:aload_2         
	//   20   39:ldc1            #161 <String "Unrecognized character escape ">
	//   21   41:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			stringbuilder.append(_getCharDesc(((int) (c))));
	//   23   45:aload_2         
	//   24   46:iload_1         
	//   25   47:invokestatic    #163 <Method String _getCharDesc(int)>
	//   26   50:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			_reportError(stringbuilder.toString());
	//   28   54:aload_0         
	//   29   55:aload_2         
	//   30   56:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   31   59:invokevirtual   #140 <Method void _reportError(String)>
			return c;
	//   32   62:iload_1         
	//   33   63:ireturn         
		}
	}

	protected boolean _hasTextualNull(String s)
	{
		return "null".equals(((Object) (s)));
	//    0    0:ldc1            #167 <String "null">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #171 <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	protected final void _reportError(String s)
		throws JsonParseException
	{
		throw _constructError(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #174 <Method JsonParseException _constructError(String)>
	//    3    5:athrow          
	}

	protected void _reportInvalidEOF()
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(" in ");
	//    4    8:aload_1         
	//    5    9:ldc1            #177 <String " in ">
	//    6   11:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (_currToken)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #179 <Field JsonToken _currToken>
	//   11   20:invokevirtual   #182 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		_reportInvalidEOF(stringbuilder.toString(), _currToken);
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   16   29:aload_0         
	//   17   30:getfield        #179 <Field JsonToken _currToken>
	//   18   33:invokevirtual   #185 <Method void _reportInvalidEOF(String, JsonToken)>
	//   19   36:return          
	}

	protected void _reportInvalidEOF(String s)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Unexpected end-of-input");
	//    4    8:aload_2         
	//    5    9:ldc1            #188 <String "Unexpected end-of-input">
	//    6   11:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		throw new JsonEOFException(((JsonParser) (this)), ((JsonToken) (null)), stringbuilder.toString());
	//   12   21:new             #190 <Class JsonEOFException>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:aconst_null     
	//   16   27:aload_2         
	//   17   28:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   18   31:invokespecial   #193 <Method void JsonEOFException(JsonParser, JsonToken, String)>
	//   19   34:athrow          
	}

	protected void _reportInvalidEOF(String s, JsonToken jsontoken)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #86  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #87  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Unexpected end-of-input");
	//    4    8:aload_3         
	//    5    9:ldc1            #188 <String "Unexpected end-of-input">
	//    6   11:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		throw new JsonEOFException(((JsonParser) (this)), jsontoken, stringbuilder.toString());
	//   12   21:new             #190 <Class JsonEOFException>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   18   31:invokespecial   #193 <Method void JsonEOFException(JsonParser, JsonToken, String)>
	//   19   34:athrow          
	}

	protected void _reportInvalidEOFInValue()
		throws JsonParseException
	{
		_reportInvalidEOF(" in a value");
	//    0    0:aload_0         
	//    1    1:ldc1            #197 <String " in a value">
	//    2    3:invokevirtual   #199 <Method void _reportInvalidEOF(String)>
	//    3    6:return          
	}

	protected void _reportInvalidEOFInValue(JsonToken jsontoken)
		throws JsonParseException
	{
		String s;
		if(jsontoken == JsonToken.VALUE_STRING)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #205 <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:if_acmpne       13
			s = " in a String value";
	//    3    7:ldc1            #207 <String " in a String value">
	//    4    9:astore_2        
		else
	//*   5   10:goto            39
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   6   13:aload_1         
	//*   7   14:getstatic       #210 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   8   17:if_acmpeq       36
	//*   9   20:aload_1         
	//*  10   21:getstatic       #213 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  11   24:if_acmpne       30
	//*  12   27:goto            36
			s = " in a value";
	//   13   30:ldc1            #197 <String " in a value">
	//   14   32:astore_2        
		else
	//*  15   33:goto            39
			s = " in a Number value";
	//   16   36:ldc1            #215 <String " in a Number value">
	//   17   38:astore_2        
		_reportInvalidEOF(s, jsontoken);
	//   18   39:aload_0         
	//   19   40:aload_2         
	//   20   41:aload_1         
	//   21   42:invokevirtual   #185 <Method void _reportInvalidEOF(String, JsonToken)>
	//   22   45:return          
	}

	protected void _reportMissingRootWS(int i)
		throws JsonParseException
	{
		_reportUnexpectedChar(i, "Expected space separating root-level values");
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc1            #218 <String "Expected space separating root-level values">
	//    3    4:invokevirtual   #222 <Method void _reportUnexpectedChar(int, String)>
	//    4    7:return          
	}

	protected void _reportUnexpectedChar(int i, String s)
		throws JsonParseException
	{
		if(i < 0)
	//*   0    0:iload_1         
	//*   1    1:ifge            8
			_reportInvalidEOF();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #224 <Method void _reportInvalidEOF()>
		Object obj = ((Object) (new StringBuilder()));
	//    4    8:new             #86  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #87  <Method void StringBuilder()>
	//    7   15:astore_3        
		((StringBuilder) (obj)).append("Unexpected character (");
	//    8   16:aload_3         
	//    9   17:ldc1            #226 <String "Unexpected character (">
	//   10   19:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:pop             
		((StringBuilder) (obj)).append(_getCharDesc(i));
	//   12   23:aload_3         
	//   13   24:iload_1         
	//   14   25:invokestatic    #163 <Method String _getCharDesc(int)>
	//   15   28:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   16   31:pop             
		((StringBuilder) (obj)).append(")");
	//   17   32:aload_3         
	//   18   33:ldc1            #98  <String ")">
	//   19   35:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   20   38:pop             
		String s1 = ((StringBuilder) (obj)).toString();
	//   21   39:aload_3         
	//   22   40:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   23   43:astore          4
		obj = ((Object) (s1));
	//   24   45:aload           4
	//   25   47:astore_3        
		if(s != null)
	//*  26   48:aload_2         
	//*  27   49:ifnull          85
		{
			obj = ((Object) (new StringBuilder()));
	//   28   52:new             #86  <Class StringBuilder>
	//   29   55:dup             
	//   30   56:invokespecial   #87  <Method void StringBuilder()>
	//   31   59:astore_3        
			((StringBuilder) (obj)).append(s1);
	//   32   60:aload_3         
	//   33   61:aload           4
	//   34   63:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   35   66:pop             
			((StringBuilder) (obj)).append(": ");
	//   36   67:aload_3         
	//   37   68:ldc1            #228 <String ": ">
	//   38   70:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   39   73:pop             
			((StringBuilder) (obj)).append(s);
	//   40   74:aload_3         
	//   41   75:aload_2         
	//   42   76:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   43   79:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   44   80:aload_3         
	//   45   81:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   46   84:astore_3        
		}
		_reportError(((String) (obj)));
	//   47   85:aload_0         
	//   48   86:aload_3         
	//   49   87:invokevirtual   #140 <Method void _reportError(String)>
	//   50   90:return          
	}

	protected final void _throwInternal()
	{
		VersionUtil.throwInternal();
	//    0    0:invokestatic    #234 <Method void VersionUtil.throwInternal()>
	//    1    3:return          
	}

	protected void _throwInvalidSpace(int i)
		throws JsonParseException
	{
		i = ((int) ((char)i));
	//    0    0:iload_1         
	//    1    1:int2char        
	//    2    2:istore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    3    3:new             #86  <Class StringBuilder>
	//    4    6:dup             
	//    5    7:invokespecial   #87  <Method void StringBuilder()>
	//    6   10:astore_2        
		stringbuilder.append("Illegal character (");
	//    7   11:aload_2         
	//    8   12:ldc1            #237 <String "Illegal character (">
	//    9   14:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   10   17:pop             
		stringbuilder.append(_getCharDesc(i));
	//   11   18:aload_2         
	//   12   19:iload_1         
	//   13   20:invokestatic    #163 <Method String _getCharDesc(int)>
	//   14   23:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
		stringbuilder.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
	//   16   27:aload_2         
	//   17   28:ldc1            #239 <String "): only regular white space (\\r, \\n, \\t) is allowed between tokens">
	//   18   30:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		_reportError(stringbuilder.toString());
	//   20   34:aload_0         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   23   39:invokevirtual   #140 <Method void _reportError(String)>
	//   24   42:return          
	}

	protected void _throwUnquotedSpace(int i, String s)
		throws JsonParseException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #243 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_CONTROL_CHARS>
	//*   2    4:invokevirtual   #156 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifeq            16
	//*   4   10:iload_1         
	//*   5   11:bipush          32
	//*   6   13:icmple          64
		{
			i = ((int) ((char)i));
	//    7   16:iload_1         
	//    8   17:int2char        
	//    9   18:istore_1        
			StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #86  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #87  <Method void StringBuilder()>
	//   13   26:astore_3        
			stringbuilder.append("Illegal unquoted character (");
	//   14   27:aload_3         
	//   15   28:ldc1            #245 <String "Illegal unquoted character (">
	//   16   30:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(_getCharDesc(i));
	//   18   34:aload_3         
	//   19   35:iload_1         
	//   20   36:invokestatic    #163 <Method String _getCharDesc(int)>
	//   21   39:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append("): has to be escaped using backslash to be included in ");
	//   23   43:aload_3         
	//   24   44:ldc1            #247 <String "): has to be escaped using backslash to be included in ">
	//   25   46:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			stringbuilder.append(s);
	//   27   50:aload_3         
	//   28   51:aload_2         
	//   29   52:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
			_reportError(stringbuilder.toString());
	//   31   56:aload_0         
	//   32   57:aload_3         
	//   33   58:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   34   61:invokevirtual   #140 <Method void _reportError(String)>
		}
	//   35   64:return          
	}

	protected final void _wrapError(String s, Throwable throwable)
		throws JsonParseException
	{
		throw _constructError(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #251 <Method JsonParseException _constructError(String, Throwable)>
	//    4    6:athrow          
	}

	public void clearCurrentToken()
	{
		if(_currToken != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field JsonToken _currToken>
	//*   2    4:ifnull          20
		{
			_lastClearedToken = _currToken;
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #179 <Field JsonToken _currToken>
	//    6   12:putfield        #254 <Field JsonToken _lastClearedToken>
			_currToken = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #179 <Field JsonToken _currToken>
		}
	//   10   20:return          
	}

	public abstract void close()
		throws IOException;

	public JsonToken currentToken()
	{
		return _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:areturn         
	}

	public int currentTokenId()
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return jsontoken.id();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #261 <Method int JsonToken.id()>
	//    9   15:ireturn         
	}

	public abstract byte[] getBinaryValue(Base64Variant base64variant)
		throws IOException;

	public abstract String getCurrentName()
		throws IOException;

	public JsonToken getCurrentToken()
	{
		return _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:areturn         
	}

	public int getCurrentTokenId()
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return jsontoken.id();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #261 <Method int JsonToken.id()>
	//    9   15:ireturn         
	}

	public JsonToken getLastClearedToken()
	{
		return _lastClearedToken;
	//    0    0:aload_0         
	//    1    1:getfield        #254 <Field JsonToken _lastClearedToken>
	//    2    4:areturn         
	}

	public abstract JsonStreamContext getParsingContext();

	public abstract String getText()
		throws IOException;

	public abstract char[] getTextCharacters()
		throws IOException;

	public abstract int getTextLength()
		throws IOException;

	public abstract int getTextOffset()
		throws IOException;

	public boolean getValueAsBoolean(boolean flag)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(jsontoken != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          135
			switch(jsontoken.id())
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #261 <Method int JsonToken.id()>
			{
	//*   7   13:tableswitch     6 12: default 56
	//	               6 93
	//	               7 82
	//	               8 56
	//	               9 80
	//	               10 78
	//	               11 78
	//	               12 58
			case 8: // '\b'
			default:
				return flag;
	//    8   56:iload_1         
	//    9   57:ireturn         

			case 12: // '\f'
				Object obj = getEmbeddedObject();
	//   10   58:aload_0         
	//   11   59:invokevirtual   #280 <Method Object getEmbeddedObject()>
	//   12   62:astore_2        
				if(obj instanceof Boolean)
	//*  13   63:aload_2         
	//*  14   64:instanceof      #282 <Class Boolean>
	//*  15   67:ifeq            135
					return ((Boolean)obj).booleanValue();
	//   16   70:aload_2         
	//   17   71:checkcast       #282 <Class Boolean>
	//   18   74:invokevirtual   #286 <Method boolean Boolean.booleanValue()>
	//   19   77:ireturn         
				break;

			case 10: // '\n'
			case 11: // '\013'
				return false;
	//   20   78:iconst_0        
	//   21   79:ireturn         

			case 9: // '\t'
				return true;
	//   22   80:iconst_1        
	//   23   81:ireturn         

			case 7: // '\007'
				return getIntValue() != 0;
	//   24   82:aload_0         
	//   25   83:invokevirtual   #289 <Method int getIntValue()>
	//   26   86:ifeq            91
	//   27   89:iconst_1        
	//   28   90:ireturn         
	//   29   91:iconst_0        
	//   30   92:ireturn         

			case 6: // '\006'
				String s = getText().trim();
	//   31   93:aload_0         
	//   32   94:invokevirtual   #291 <Method String getText()>
	//   33   97:invokevirtual   #294 <Method String String.trim()>
	//   34  100:astore_2        
				if("true".equals(((Object) (s))))
	//*  35  101:ldc2            #296 <String "true">
	//*  36  104:aload_2         
	//*  37  105:invokevirtual   #171 <Method boolean String.equals(Object)>
	//*  38  108:ifeq            113
					return true;
	//   39  111:iconst_1        
	//   40  112:ireturn         
				if("false".equals(((Object) (s))))
	//*  41  113:ldc2            #298 <String "false">
	//*  42  116:aload_2         
	//*  43  117:invokevirtual   #171 <Method boolean String.equals(Object)>
	//*  44  120:ifeq            125
					return false;
	//   45  123:iconst_0        
	//   46  124:ireturn         
				if(_hasTextualNull(s))
	//*  47  125:aload_0         
	//*  48  126:aload_2         
	//*  49  127:invokevirtual   #300 <Method boolean _hasTextualNull(String)>
	//*  50  130:ifeq            135
					return false;
	//   51  133:iconst_0        
	//   52  134:ireturn         
				break;
			}
		return flag;
	//   53  135:iload_1         
	//   54  136:ireturn         
	}

	public double getValueAsDouble(double d)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_3        
		if(jsontoken != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          108
			switch(jsontoken.id())
	//*   5    9:aload_3         
	//*   6   10:invokevirtual   #261 <Method int JsonToken.id()>
			{
	//*   7   13:tableswitch     6 12: default 56
	//	               6 87
	//	               7 82
	//	               8 82
	//	               9 80
	//	               10 78
	//	               11 78
	//	               12 58
			default:
				return d;
	//    8   56:dload_1         
	//    9   57:dreturn         

			case 12: // '\f'
				Object obj = getEmbeddedObject();
	//   10   58:aload_0         
	//   11   59:invokevirtual   #280 <Method Object getEmbeddedObject()>
	//   12   62:astore_3        
				if(obj instanceof Number)
	//*  13   63:aload_3         
	//*  14   64:instanceof      #304 <Class Number>
	//*  15   67:ifeq            108
					return ((Number)obj).doubleValue();
	//   16   70:aload_3         
	//   17   71:checkcast       #304 <Class Number>
	//   18   74:invokevirtual   #308 <Method double Number.doubleValue()>
	//   19   77:dreturn         
				break;

			case 10: // '\n'
			case 11: // '\013'
				return 0.0D;
	//   20   78:dconst_0        
	//   21   79:dreturn         

			case 9: // '\t'
				return 1.0D;
	//   22   80:dconst_1        
	//   23   81:dreturn         

			case 7: // '\007'
			case 8: // '\b'
				return getDoubleValue();
	//   24   82:aload_0         
	//   25   83:invokevirtual   #311 <Method double getDoubleValue()>
	//   26   86:dreturn         

			case 6: // '\006'
				String s = getText();
	//   27   87:aload_0         
	//   28   88:invokevirtual   #291 <Method String getText()>
	//   29   91:astore_3        
				if(_hasTextualNull(s))
	//*  30   92:aload_0         
	//*  31   93:aload_3         
	//*  32   94:invokevirtual   #300 <Method boolean _hasTextualNull(String)>
	//*  33   97:ifeq            102
					return 0.0D;
	//   34  100:dconst_0        
	//   35  101:dreturn         
				else
					return NumberInput.parseAsDouble(s, d);
	//   36  102:aload_3         
	//   37  103:dload_1         
	//   38  104:invokestatic    #317 <Method double NumberInput.parseAsDouble(String, double)>
	//   39  107:dreturn         
			}
		return d;
	//   40  108:dload_1         
	//   41  109:dreturn         
	}

	public int getValueAsInt()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #210 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_1         
	//*   7   13:getstatic       #213 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return getValueAsInt(0);
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #321 <Method int getValueAsInt(int)>
	//   13   27:ireturn         
		else
			return getIntValue();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #289 <Method int getIntValue()>
	//   16   32:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_3        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #210 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       119
	//*   6   12:aload_3         
	//*   7   13:getstatic       #213 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            119
		{
			if(jsontoken != null)
	//*  10   22:aload_3         
	//*  11   23:ifnull          117
			{
				int j = jsontoken.id();
	//   12   26:aload_3         
	//   13   27:invokevirtual   #261 <Method int JsonToken.id()>
	//   14   30:istore_2        
				if(j != 6)
	//*  15   31:iload_2         
	//*  16   32:bipush          6
	//*  17   34:icmpeq          96
				{
					switch(j)
	//*  18   37:iload_2         
					{
	//*  19   38:tableswitch     9 12: default 68
	//	               9 94
	//	               10 92
	//	               11 90
	//	               12 70
					default:
						return i;
	//   20   68:iload_1         
	//   21   69:ireturn         

					case 12: // '\f'
						Object obj = getEmbeddedObject();
	//   22   70:aload_0         
	//   23   71:invokevirtual   #280 <Method Object getEmbeddedObject()>
	//   24   74:astore_3        
						if(obj instanceof Number)
	//*  25   75:aload_3         
	//*  26   76:instanceof      #304 <Class Number>
	//*  27   79:ifeq            117
							return ((Number)obj).intValue();
	//   28   82:aload_3         
	//   29   83:checkcast       #304 <Class Number>
	//   30   86:invokevirtual   #324 <Method int Number.intValue()>
	//   31   89:ireturn         
						break;

					case 11: // '\013'
						return 0;
	//   32   90:iconst_0        
	//   33   91:ireturn         

					case 10: // '\n'
						return 0;
	//   34   92:iconst_0        
	//   35   93:ireturn         

					case 9: // '\t'
						return 1;
	//   36   94:iconst_1        
	//   37   95:ireturn         
					}
				} else
				{
					String s = getText();
	//   38   96:aload_0         
	//   39   97:invokevirtual   #291 <Method String getText()>
	//   40  100:astore_3        
					if(_hasTextualNull(s))
	//*  41  101:aload_0         
	//*  42  102:aload_3         
	//*  43  103:invokevirtual   #300 <Method boolean _hasTextualNull(String)>
	//*  44  106:ifeq            111
						return 0;
	//   45  109:iconst_0        
	//   46  110:ireturn         
					else
						return NumberInput.parseAsInt(s, i);
	//   47  111:aload_3         
	//   48  112:iload_1         
	//   49  113:invokestatic    #328 <Method int NumberInput.parseAsInt(String, int)>
	//   50  116:ireturn         
				}
			}
			return i;
	//   51  117:iload_1         
	//   52  118:ireturn         
		} else
		{
			return getIntValue();
	//   53  119:aload_0         
	//   54  120:invokevirtual   #289 <Method int getIntValue()>
	//   55  123:ireturn         
		}
	}

	public long getValueAsLong()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #210 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_1         
	//*   7   13:getstatic       #213 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return getValueAsLong(0L);
	//   10   22:aload_0         
	//   11   23:lconst_0        
	//   12   24:invokevirtual   #333 <Method long getValueAsLong(long)>
	//   13   27:lreturn         
		else
			return getLongValue();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #336 <Method long getLongValue()>
	//   16   32:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore          4
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #210 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpeq       127
	//*   6   14:aload           4
	//*   7   16:getstatic       #213 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   19:if_acmpne       25
	//*   9   22:goto            127
		{
			if(jsontoken != null)
	//*  10   25:aload           4
	//*  11   27:ifnull          125
			{
				int i = jsontoken.id();
	//   12   30:aload           4
	//   13   32:invokevirtual   #261 <Method int JsonToken.id()>
	//   14   35:istore_3        
				if(i != 6)
	//*  15   36:iload_3         
	//*  16   37:bipush          6
	//*  17   39:icmpeq          101
				{
					switch(i)
	//*  18   42:iload_3         
					{
	//*  19   43:tableswitch     9 12: default 72
	//	               9 99
	//	               10 97
	//	               11 97
	//	               12 74
					default:
						return l;
	//   20   72:lload_1         
	//   21   73:lreturn         

					case 12: // '\f'
						Object obj = getEmbeddedObject();
	//   22   74:aload_0         
	//   23   75:invokevirtual   #280 <Method Object getEmbeddedObject()>
	//   24   78:astore          4
						if(obj instanceof Number)
	//*  25   80:aload           4
	//*  26   82:instanceof      #304 <Class Number>
	//*  27   85:ifeq            125
							return ((Number)obj).longValue();
	//   28   88:aload           4
	//   29   90:checkcast       #304 <Class Number>
	//   30   93:invokevirtual   #339 <Method long Number.longValue()>
	//   31   96:lreturn         
						break;

					case 10: // '\n'
					case 11: // '\013'
						return 0L;
	//   32   97:lconst_0        
	//   33   98:lreturn         

					case 9: // '\t'
						return 1L;
	//   34   99:lconst_1        
	//   35  100:lreturn         
					}
				} else
				{
					String s = getText();
	//   36  101:aload_0         
	//   37  102:invokevirtual   #291 <Method String getText()>
	//   38  105:astore          4
					if(_hasTextualNull(s))
	//*  39  107:aload_0         
	//*  40  108:aload           4
	//*  41  110:invokevirtual   #300 <Method boolean _hasTextualNull(String)>
	//*  42  113:ifeq            118
						return 0L;
	//   43  116:lconst_0        
	//   44  117:lreturn         
					else
						return NumberInput.parseAsLong(s, l);
	//   45  118:aload           4
	//   46  120:lload_1         
	//   47  121:invokestatic    #343 <Method long NumberInput.parseAsLong(String, long)>
	//   48  124:lreturn         
				}
			}
			return l;
	//   49  125:lload_1         
	//   50  126:lreturn         
		} else
		{
			return getLongValue();
	//   51  127:aload_0         
	//   52  128:invokevirtual   #336 <Method long getLongValue()>
	//   53  131:lreturn         
		}
	}

	public String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field JsonToken _currToken>
	//*   2    4:getstatic       #205 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       15
			return getText();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #291 <Method String getText()>
	//    6   14:areturn         
		if(_currToken == JsonToken.FIELD_NAME)
	//*   7   15:aload_0         
	//*   8   16:getfield        #179 <Field JsonToken _currToken>
	//*   9   19:getstatic       #347 <Field JsonToken JsonToken.FIELD_NAME>
	//*  10   22:if_acmpne       30
			return getCurrentName();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #349 <Method String getCurrentName()>
	//   13   29:areturn         
		else
			return getValueAsString(((String) (null)));
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #352 <Method String getValueAsString(String)>
	//   17   35:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field JsonToken _currToken>
	//*   2    4:getstatic       #205 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       15
			return getText();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #291 <Method String getText()>
	//    6   14:areturn         
		if(_currToken == JsonToken.FIELD_NAME)
	//*   7   15:aload_0         
	//*   8   16:getfield        #179 <Field JsonToken _currToken>
	//*   9   19:getstatic       #347 <Field JsonToken JsonToken.FIELD_NAME>
	//*  10   22:if_acmpne       30
			return getCurrentName();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #349 <Method String getCurrentName()>
	//   13   29:areturn         
		if(_currToken != null && _currToken != JsonToken.VALUE_NULL)
	//*  14   30:aload_0         
	//*  15   31:getfield        #179 <Field JsonToken _currToken>
	//*  16   34:ifnull          64
	//*  17   37:aload_0         
	//*  18   38:getfield        #179 <Field JsonToken _currToken>
	//*  19   41:getstatic       #355 <Field JsonToken JsonToken.VALUE_NULL>
	//*  20   44:if_acmpeq       64
		{
			if(!_currToken.isScalarValue())
	//*  21   47:aload_0         
	//*  22   48:getfield        #179 <Field JsonToken _currToken>
	//*  23   51:invokevirtual   #358 <Method boolean JsonToken.isScalarValue()>
	//*  24   54:ifne            59
				return s;
	//   25   57:aload_1         
	//   26   58:areturn         
			else
				return getText();
	//   27   59:aload_0         
	//   28   60:invokevirtual   #291 <Method String getText()>
	//   29   63:areturn         
		} else
		{
			return s;
	//   30   64:aload_1         
	//   31   65:areturn         
		}
	}

	public boolean hasCurrentToken()
	{
		return _currToken != null;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public abstract boolean hasTextCharacters();

	public boolean hasToken(JsonToken jsontoken)
	{
		return _currToken == jsontoken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:aload_1         
	//    3    5:if_acmpne       10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public boolean hasTokenId(int i)
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore          4
		boolean flag1 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag = false;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		if(jsontoken == null)
	//*   7   10:aload           4
	//*   8   12:ifnonnull       23
		{
			if(i == 0)
	//*   9   15:iload_1         
	//*  10   16:ifne            21
				flag = true;
	//   11   19:iconst_1        
	//   12   20:istore_2        
			return flag;
	//   13   21:iload_2         
	//   14   22:ireturn         
		}
		flag = flag1;
	//   15   23:iload_3         
	//   16   24:istore_2        
		if(jsontoken.id() == i)
	//*  17   25:aload           4
	//*  18   27:invokevirtual   #261 <Method int JsonToken.id()>
	//*  19   30:iload_1         
	//*  20   31:icmpne          36
			flag = true;
	//   21   34:iconst_1        
	//   22   35:istore_2        
		return flag;
	//   23   36:iload_2         
	//   24   37:ireturn         
	}

	public abstract boolean isClosed();

	public boolean isExpectedStartArrayToken()
	{
		return _currToken == JsonToken.START_ARRAY;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:getstatic       #369 <Field JsonToken JsonToken.START_ARRAY>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public boolean isExpectedStartObjectToken()
	{
		return _currToken == JsonToken.START_OBJECT;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:getstatic       #373 <Field JsonToken JsonToken.START_OBJECT>
	//    3    7:if_acmpne       12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public abstract JsonToken nextToken()
		throws IOException;

	public JsonToken nextValue()
		throws IOException
	{
		JsonToken jsontoken1 = nextToken();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #377 <Method JsonToken nextToken()>
	//    2    4:astore_2        
		JsonToken jsontoken = jsontoken1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #347 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   11:if_acmpne       19
			jsontoken = nextToken();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #377 <Method JsonToken nextToken()>
	//   10   18:astore_1        
		return jsontoken;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	public abstract void overrideCurrentName(String s);

	public JsonParser skipChildren()
		throws IOException
	{
		if(_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field JsonToken _currToken>
	//*   2    4:getstatic       #373 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       22
	//*   4   10:aload_0         
	//*   5   11:getfield        #179 <Field JsonToken _currToken>
	//*   6   14:getstatic       #369 <Field JsonToken JsonToken.START_ARRAY>
	//*   7   17:if_acmpeq       22
			return ((JsonParser) (this));
	//    8   20:aload_0         
	//    9   21:areturn         
		int i = 1;
	//   10   22:iconst_1        
	//   11   23:istore_1        
		int j;
		do
		{
			JsonToken jsontoken;
			do
				do
				{
					jsontoken = nextToken();
	//   12   24:aload_0         
	//   13   25:invokevirtual   #377 <Method JsonToken nextToken()>
	//   14   28:astore_3        
					if(jsontoken == null)
	//*  15   29:aload_3         
	//*  16   30:ifnonnull       39
					{
						_handleEOF();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #382 <Method void _handleEOF()>
						return ((JsonParser) (this));
	//   19   37:aload_0         
	//   20   38:areturn         
					}
					if(!jsontoken.isStructStart())
						break;
	//   21   39:aload_3         
	//   22   40:invokevirtual   #385 <Method boolean JsonToken.isStructStart()>
	//   23   43:ifeq            53
					i++;
	//   24   46:iload_1         
	//   25   47:iconst_1        
	//   26   48:iadd            
	//   27   49:istore_1        
				} while(true);
	//   28   50:goto            24
			while(!jsontoken.isStructEnd());
	//   29   53:aload_3         
	//   30   54:invokevirtual   #388 <Method boolean JsonToken.isStructEnd()>
	//   31   57:ifeq            24
			j = i - 1;
	//   32   60:iload_1         
	//   33   61:iconst_1        
	//   34   62:isub            
	//   35   63:istore_2        
			i = j;
	//   36   64:iload_2         
	//   37   65:istore_1        
		} while(j != 0);
	//   38   66:iload_2         
	//   39   67:ifne            24
		return ((JsonParser) (this));
	//   40   70:aload_0         
	//   41   71:areturn         
	}

	protected static final int INT_BACKSLASH = 92;
	protected static final int INT_COLON = 58;
	protected static final int INT_COMMA = 44;
	protected static final int INT_CR = 13;
	protected static final int INT_E = 69;
	protected static final int INT_HASH = 35;
	protected static final int INT_LBRACKET = 91;
	protected static final int INT_LCURLY = 123;
	protected static final int INT_LF = 10;
	protected static final int INT_PERIOD = 46;
	protected static final int INT_QUOTE = 34;
	protected static final int INT_RBRACKET = 93;
	protected static final int INT_RCURLY = 125;
	protected static final int INT_SLASH = 47;
	protected static final int INT_SPACE = 32;
	protected static final int INT_TAB = 9;
	protected static final int INT_e = 101;
	protected JsonToken _currToken;
	protected JsonToken _lastClearedToken;
}
