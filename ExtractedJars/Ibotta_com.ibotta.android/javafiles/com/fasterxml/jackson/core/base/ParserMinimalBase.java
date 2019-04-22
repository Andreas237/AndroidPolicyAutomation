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
import java.math.BigDecimal;
import java.math.BigInteger;

public abstract class ParserMinimalBase extends JsonParser
{

	protected ParserMinimalBase(int i)
	{
		super(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #67  <Method void JsonParser(int)>
	//    3    5:return          
	}

	protected static final String _getCharDesc(int i)
	{
		char c = (char)i;
	//    0    0:iload_0         
	//    1    1:int2char        
	//    2    2:istore_1        
		if(Character.isISOControl(c))
	//*   3    3:iload_1         
	//*   4    4:invokestatic    #75  <Method boolean Character.isISOControl(char)>
	//*   5    7:ifeq            43
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   10:new             #77  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #79  <Method void StringBuilder()>
	//    9   17:astore_2        
			stringbuilder.append("(CTRL-CHAR, code ");
	//   10   18:aload_2         
	//   11   19:ldc1            #81  <String "(CTRL-CHAR, code ">
	//   12   21:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   13   24:pop             
			stringbuilder.append(i);
	//   14   25:aload_2         
	//   15   26:iload_0         
	//   16   27:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   17   30:pop             
			stringbuilder.append(")");
	//   18   31:aload_2         
	//   19   32:ldc1            #90  <String ")">
	//   20   34:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   21   37:pop             
			return stringbuilder.toString();
	//   22   38:aload_2         
	//   23   39:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   24   42:areturn         
		}
		if(i > 255)
	//*  25   43:iload_0         
	//*  26   44:sipush          255
	//*  27   47:icmple          112
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   28   50:new             #77  <Class StringBuilder>
	//   29   53:dup             
	//   30   54:invokespecial   #79  <Method void StringBuilder()>
	//   31   57:astore_2        
			stringbuilder1.append("'");
	//   32   58:aload_2         
	//   33   59:ldc1            #96  <String "'">
	//   34   61:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   35   64:pop             
			stringbuilder1.append(c);
	//   36   65:aload_2         
	//   37   66:iload_1         
	//   38   67:invokevirtual   #99  <Method StringBuilder StringBuilder.append(char)>
	//   39   70:pop             
			stringbuilder1.append("' (code ");
	//   40   71:aload_2         
	//   41   72:ldc1            #101 <String "' (code ">
	//   42   74:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   43   77:pop             
			stringbuilder1.append(i);
	//   44   78:aload_2         
	//   45   79:iload_0         
	//   46   80:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   47   83:pop             
			stringbuilder1.append(" / 0x");
	//   48   84:aload_2         
	//   49   85:ldc1            #103 <String " / 0x">
	//   50   87:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   51   90:pop             
			stringbuilder1.append(Integer.toHexString(i));
	//   52   91:aload_2         
	//   53   92:iload_0         
	//   54   93:invokestatic    #108 <Method String Integer.toHexString(int)>
	//   55   96:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   56   99:pop             
			stringbuilder1.append(")");
	//   57  100:aload_2         
	//   58  101:ldc1            #90  <String ")">
	//   59  103:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   60  106:pop             
			return stringbuilder1.toString();
	//   61  107:aload_2         
	//   62  108:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   63  111:areturn         
		} else
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//   64  112:new             #77  <Class StringBuilder>
	//   65  115:dup             
	//   66  116:invokespecial   #79  <Method void StringBuilder()>
	//   67  119:astore_2        
			stringbuilder2.append("'");
	//   68  120:aload_2         
	//   69  121:ldc1            #96  <String "'">
	//   70  123:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   71  126:pop             
			stringbuilder2.append(c);
	//   72  127:aload_2         
	//   73  128:iload_1         
	//   74  129:invokevirtual   #99  <Method StringBuilder StringBuilder.append(char)>
	//   75  132:pop             
			stringbuilder2.append("' (code ");
	//   76  133:aload_2         
	//   77  134:ldc1            #101 <String "' (code ">
	//   78  136:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   79  139:pop             
			stringbuilder2.append(i);
	//   80  140:aload_2         
	//   81  141:iload_0         
	//   82  142:invokevirtual   #88  <Method StringBuilder StringBuilder.append(int)>
	//   83  145:pop             
			stringbuilder2.append(")");
	//   84  146:aload_2         
	//   85  147:ldc1            #90  <String ")">
	//   86  149:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   87  152:pop             
			return stringbuilder2.toString();
	//   88  153:aload_2         
	//   89  154:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   90  157:areturn         
		}
	}

	protected final JsonParseException _constructError(String s, Throwable throwable)
	{
		return new JsonParseException(((JsonParser) (this)), s, throwable);
	//    0    0:new             #112 <Class JsonParseException>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokespecial   #115 <Method void JsonParseException(JsonParser, String, Throwable)>
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
	//    3    3:invokevirtual   #127 <Method void Base64Variant.decode(String, ByteArrayBuilder)>
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
	//    8   10:invokevirtual   #130 <Method String IllegalArgumentException.getMessage()>
	//    9   13:invokevirtual   #134 <Method void _reportError(String)>
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
	//*   1    1:getstatic       #146 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER>
	//*   2    4:invokevirtual   #150 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifeq            12
			return c;
	//    4   10:iload_1         
	//    5   11:ireturn         
		if(c == '\'' && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES))
	//*   6   12:iload_1         
	//*   7   13:bipush          39
	//*   8   15:icmpne          30
	//*   9   18:aload_0         
	//*  10   19:getstatic       #153 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//*  11   22:invokevirtual   #150 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*  12   25:ifeq            30
		{
			return c;
	//   13   28:iload_1         
	//   14   29:ireturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   15   30:new             #77  <Class StringBuilder>
	//   16   33:dup             
	//   17   34:invokespecial   #79  <Method void StringBuilder()>
	//   18   37:astore_2        
			stringbuilder.append("Unrecognized character escape ");
	//   19   38:aload_2         
	//   20   39:ldc1            #155 <String "Unrecognized character escape ">
	//   21   41:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   22   44:pop             
			stringbuilder.append(_getCharDesc(((int) (c))));
	//   23   45:aload_2         
	//   24   46:iload_1         
	//   25   47:invokestatic    #157 <Method String _getCharDesc(int)>
	//   26   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
			_reportError(stringbuilder.toString());
	//   28   54:aload_0         
	//   29   55:aload_2         
	//   30   56:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   31   59:invokevirtual   #134 <Method void _reportError(String)>
			return c;
	//   32   62:iload_1         
	//   33   63:ireturn         
		}
	}

	protected boolean _hasTextualNull(String s)
	{
		return "null".equals(((Object) (s)));
	//    0    0:ldc1            #161 <String "null">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #167 <Method boolean String.equals(Object)>
	//    3    6:ireturn         
	}

	protected final void _reportError(String s)
		throws JsonParseException
	{
		throw _constructError(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #170 <Method JsonParseException _constructError(String)>
	//    3    5:athrow          
	}

	protected final void _reportError(String s, Object obj)
		throws JsonParseException
	{
		throw _constructError(String.format(s, new Object[] {
			obj
		}));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_1        
	//    3    3:anewarray       Object[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:invokestatic    #177 <Method String String.format(String, Object[])>
	//    9   13:invokevirtual   #170 <Method JsonParseException _constructError(String)>
	//   10   16:athrow          
	}

	protected final void _reportError(String s, Object obj, Object obj1)
		throws JsonParseException
	{
		throw _constructError(String.format(s, new Object[] {
			obj, obj1
		}));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_2        
	//    3    3:anewarray       Object[]
	//    4    6:dup             
	//    5    7:iconst_0        
	//    6    8:aload_2         
	//    7    9:aastore         
	//    8   10:dup             
	//    9   11:iconst_1        
	//   10   12:aload_3         
	//   11   13:aastore         
	//   12   14:invokestatic    #177 <Method String String.format(String, Object[])>
	//   13   17:invokevirtual   #170 <Method JsonParseException _constructError(String)>
	//   14   20:athrow          
	}

	protected void _reportInvalidEOF()
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(" in ");
	//    4    8:aload_1         
	//    5    9:ldc1            #181 <String " in ">
	//    6   11:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(((Object) (_currToken)));
	//    8   15:aload_1         
	//    9   16:aload_0         
	//   10   17:getfield        #183 <Field JsonToken _currToken>
	//   11   20:invokevirtual   #186 <Method StringBuilder StringBuilder.append(Object)>
	//   12   23:pop             
		_reportInvalidEOF(stringbuilder.toString(), _currToken);
	//   13   24:aload_0         
	//   14   25:aload_1         
	//   15   26:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   16   29:aload_0         
	//   17   30:getfield        #183 <Field JsonToken _currToken>
	//   18   33:invokevirtual   #189 <Method void _reportInvalidEOF(String, JsonToken)>
	//   19   36:return          
	}

	protected void _reportInvalidEOF(String s, JsonToken jsontoken)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Unexpected end-of-input");
	//    4    8:aload_3         
	//    5    9:ldc1            #191 <String "Unexpected end-of-input">
	//    6   11:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_3         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		throw new JsonEOFException(((JsonParser) (this)), jsontoken, stringbuilder.toString());
	//   12   21:new             #193 <Class JsonEOFException>
	//   13   24:dup             
	//   14   25:aload_0         
	//   15   26:aload_2         
	//   16   27:aload_3         
	//   17   28:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   18   31:invokespecial   #196 <Method void JsonEOFException(JsonParser, JsonToken, String)>
	//   19   34:athrow          
	}

	protected void _reportInvalidEOFInValue(JsonToken jsontoken)
		throws JsonParseException
	{
		String s;
		if(jsontoken == JsonToken.VALUE_STRING)
	//*   0    0:aload_1         
	//*   1    1:getstatic       #203 <Field JsonToken JsonToken.VALUE_STRING>
	//*   2    4:if_acmpne       13
			s = " in a String value";
	//    3    7:ldc1            #205 <String " in a String value">
	//    4    9:astore_2        
		else
	//*   5   10:goto            39
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   6   13:aload_1         
	//*   7   14:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   8   17:if_acmpeq       36
	//*   9   20:aload_1         
	//*  10   21:getstatic       #211 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*  11   24:if_acmpne       30
	//*  12   27:goto            36
			s = " in a value";
	//   13   30:ldc1            #213 <String " in a value">
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
	//   21   42:invokevirtual   #189 <Method void _reportInvalidEOF(String, JsonToken)>
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
		String s1 = String.format("Unexpected character (%s)", new Object[] {
			_getCharDesc(i)
		});
	//    4    8:ldc1            #226 <String "Unexpected character (%s)">
	//    5   10:iconst_1        
	//    6   11:anewarray       Object[]
	//    7   14:dup             
	//    8   15:iconst_0        
	//    9   16:iload_1         
	//   10   17:invokestatic    #157 <Method String _getCharDesc(int)>
	//   11   20:aastore         
	//   12   21:invokestatic    #177 <Method String String.format(String, Object[])>
	//   13   24:astore          4
		Object obj = ((Object) (s1));
	//   14   26:aload           4
	//   15   28:astore_3        
		if(s != null)
	//*  16   29:aload_2         
	//*  17   30:ifnull          66
		{
			obj = ((Object) (new StringBuilder()));
	//   18   33:new             #77  <Class StringBuilder>
	//   19   36:dup             
	//   20   37:invokespecial   #79  <Method void StringBuilder()>
	//   21   40:astore_3        
			((StringBuilder) (obj)).append(s1);
	//   22   41:aload_3         
	//   23   42:aload           4
	//   24   44:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			((StringBuilder) (obj)).append(": ");
	//   26   48:aload_3         
	//   27   49:ldc1            #228 <String ": ">
	//   28   51:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
			((StringBuilder) (obj)).append(s);
	//   30   55:aload_3         
	//   31   56:aload_2         
	//   32   57:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   34   61:aload_3         
	//   35   62:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   36   65:astore_3        
		}
		_reportError(((String) (obj)));
	//   37   66:aload_0         
	//   38   67:aload_3         
	//   39   68:invokevirtual   #134 <Method void _reportError(String)>
	//   40   71:return          
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
	//    3    3:new             #77  <Class StringBuilder>
	//    4    6:dup             
	//    5    7:invokespecial   #79  <Method void StringBuilder()>
	//    6   10:astore_2        
		stringbuilder.append("Illegal character (");
	//    7   11:aload_2         
	//    8   12:ldc1            #237 <String "Illegal character (">
	//    9   14:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   10   17:pop             
		stringbuilder.append(_getCharDesc(i));
	//   11   18:aload_2         
	//   12   19:iload_1         
	//   13   20:invokestatic    #157 <Method String _getCharDesc(int)>
	//   14   23:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
		stringbuilder.append("): only regular white space (\\r, \\n, \\t) is allowed between tokens");
	//   16   27:aload_2         
	//   17   28:ldc1            #239 <String "): only regular white space (\\r, \\n, \\t) is allowed between tokens">
	//   18   30:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   19   33:pop             
		_reportError(stringbuilder.toString());
	//   20   34:aload_0         
	//   21   35:aload_2         
	//   22   36:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   23   39:invokevirtual   #134 <Method void _reportError(String)>
	//   24   42:return          
	}

	protected void _throwUnquotedSpace(int i, String s)
		throws JsonParseException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #243 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_CONTROL_CHARS>
	//*   2    4:invokevirtual   #150 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
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
	//   10   19:new             #77  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #79  <Method void StringBuilder()>
	//   13   26:astore_3        
			stringbuilder.append("Illegal unquoted character (");
	//   14   27:aload_3         
	//   15   28:ldc1            #245 <String "Illegal unquoted character (">
	//   16   30:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
			stringbuilder.append(_getCharDesc(i));
	//   18   34:aload_3         
	//   19   35:iload_1         
	//   20   36:invokestatic    #157 <Method String _getCharDesc(int)>
	//   21   39:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   22   42:pop             
			stringbuilder.append("): has to be escaped using backslash to be included in ");
	//   23   43:aload_3         
	//   24   44:ldc1            #247 <String "): has to be escaped using backslash to be included in ">
	//   25   46:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   26   49:pop             
			stringbuilder.append(s);
	//   27   50:aload_3         
	//   28   51:aload_2         
	//   29   52:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   30   55:pop             
			_reportError(stringbuilder.toString());
	//   31   56:aload_0         
	//   32   57:aload_3         
	//   33   58:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   34   61:invokevirtual   #134 <Method void _reportError(String)>
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
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          19
		{
			_lastClearedToken = jsontoken;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #254 <Field JsonToken _lastClearedToken>
			_currToken = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #183 <Field JsonToken _currToken>
		}
	//   11   19:return          
	}

	public JsonToken currentToken()
	{
		return _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:areturn         
	}

	public abstract String getCurrentName()
		throws IOException;

	public JsonToken getCurrentToken()
	{
		return _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:areturn         
	}

	public int getCurrentTokenId()
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
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
	//    8   12:invokevirtual   #263 <Method int JsonToken.id()>
	//    9   15:ireturn         
	}

	public abstract String getText()
		throws IOException;

	public int getValueAsInt()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_1         
	//*   7   13:getstatic       #211 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return getValueAsInt(0);
	//   10   22:aload_0         
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #268 <Method int getValueAsInt(int)>
	//   13   27:ireturn         
		else
			return getIntValue();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #271 <Method int getIntValue()>
	//   16   32:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:astore_3        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       119
	//*   6   12:aload_3         
	//*   7   13:getstatic       #211 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            119
		{
			if(jsontoken != null)
	//*  10   22:aload_3         
	//*  11   23:ifnull          117
			{
				int j = jsontoken.id();
	//   12   26:aload_3         
	//   13   27:invokevirtual   #263 <Method int JsonToken.id()>
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
	//   23   71:invokevirtual   #275 <Method Object getEmbeddedObject()>
	//   24   74:astore_3        
						if(obj instanceof Number)
	//*  25   75:aload_3         
	//*  26   76:instanceof      #277 <Class Number>
	//*  27   79:ifeq            117
							return ((Number)obj).intValue();
	//   28   82:aload_3         
	//   29   83:checkcast       #277 <Class Number>
	//   30   86:invokevirtual   #280 <Method int Number.intValue()>
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
	//   39   97:invokevirtual   #282 <Method String getText()>
	//   40  100:astore_3        
					if(_hasTextualNull(s))
	//*  41  101:aload_0         
	//*  42  102:aload_3         
	//*  43  103:invokevirtual   #284 <Method boolean _hasTextualNull(String)>
	//*  44  106:ifeq            111
						return 0;
	//   45  109:iconst_0        
	//   46  110:ireturn         
					else
						return NumberInput.parseAsInt(s, i);
	//   47  111:aload_3         
	//   48  112:iload_1         
	//   49  113:invokestatic    #290 <Method int NumberInput.parseAsInt(String, int)>
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
	//   54  120:invokevirtual   #271 <Method int getIntValue()>
	//   55  123:ireturn         
		}
	}

	public long getValueAsLong()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       28
	//*   6   12:aload_1         
	//*   7   13:getstatic       #211 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       22
	//*   9   19:goto            28
			return getValueAsLong(0L);
	//   10   22:aload_0         
	//   11   23:lconst_0        
	//   12   24:invokevirtual   #295 <Method long getValueAsLong(long)>
	//   13   27:lreturn         
		else
			return getLongValue();
	//   14   28:aload_0         
	//   15   29:invokevirtual   #298 <Method long getLongValue()>
	//   16   32:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:astore          4
		if(jsontoken != JsonToken.VALUE_NUMBER_INT && jsontoken != JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    6:aload           4
	//*   4    8:getstatic       #208 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpeq       127
	//*   6   14:aload           4
	//*   7   16:getstatic       #211 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   19:if_acmpne       25
	//*   9   22:goto            127
		{
			if(jsontoken != null)
	//*  10   25:aload           4
	//*  11   27:ifnull          125
			{
				int i = jsontoken.id();
	//   12   30:aload           4
	//   13   32:invokevirtual   #263 <Method int JsonToken.id()>
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
	//   23   75:invokevirtual   #275 <Method Object getEmbeddedObject()>
	//   24   78:astore          4
						if(obj instanceof Number)
	//*  25   80:aload           4
	//*  26   82:instanceof      #277 <Class Number>
	//*  27   85:ifeq            125
							return ((Number)obj).longValue();
	//   28   88:aload           4
	//   29   90:checkcast       #277 <Class Number>
	//   30   93:invokevirtual   #301 <Method long Number.longValue()>
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
	//   37  102:invokevirtual   #282 <Method String getText()>
	//   38  105:astore          4
					if(_hasTextualNull(s))
	//*  39  107:aload_0         
	//*  40  108:aload           4
	//*  41  110:invokevirtual   #284 <Method boolean _hasTextualNull(String)>
	//*  42  113:ifeq            118
						return 0L;
	//   43  116:lconst_0        
	//   44  117:lreturn         
					else
						return NumberInput.parseAsLong(s, l);
	//   45  118:aload           4
	//   46  120:lload_1         
	//   47  121:invokestatic    #305 <Method long NumberInput.parseAsLong(String, long)>
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
	//   52  128:invokevirtual   #298 <Method long getLongValue()>
	//   53  131:lreturn         
		}
	}

	public String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field JsonToken _currToken>
	//*   2    4:getstatic       #203 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       15
			return getText();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #282 <Method String getText()>
	//    6   14:areturn         
		if(_currToken == JsonToken.FIELD_NAME)
	//*   7   15:aload_0         
	//*   8   16:getfield        #183 <Field JsonToken _currToken>
	//*   9   19:getstatic       #309 <Field JsonToken JsonToken.FIELD_NAME>
	//*  10   22:if_acmpne       30
			return getCurrentName();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #311 <Method String getCurrentName()>
	//   13   29:areturn         
		else
			return getValueAsString(((String) (null)));
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #314 <Method String getValueAsString(String)>
	//   17   35:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field JsonToken _currToken>
	//*   2    4:getstatic       #203 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       15
			return getText();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #282 <Method String getText()>
	//    6   14:areturn         
		if(_currToken == JsonToken.FIELD_NAME)
	//*   7   15:aload_0         
	//*   8   16:getfield        #183 <Field JsonToken _currToken>
	//*   9   19:getstatic       #309 <Field JsonToken JsonToken.FIELD_NAME>
	//*  10   22:if_acmpne       30
			return getCurrentName();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #311 <Method String getCurrentName()>
	//   13   29:areturn         
		JsonToken jsontoken = _currToken;
	//   14   30:aload_0         
	//   15   31:getfield        #183 <Field JsonToken _currToken>
	//   16   34:astore_2        
		if(jsontoken != null && jsontoken != JsonToken.VALUE_NULL)
	//*  17   35:aload_2         
	//*  18   36:ifnull          63
	//*  19   39:aload_2         
	//*  20   40:getstatic       #317 <Field JsonToken JsonToken.VALUE_NULL>
	//*  21   43:if_acmpeq       63
		{
			if(!_currToken.isScalarValue())
	//*  22   46:aload_0         
	//*  23   47:getfield        #183 <Field JsonToken _currToken>
	//*  24   50:invokevirtual   #321 <Method boolean JsonToken.isScalarValue()>
	//*  25   53:ifne            58
				return s;
	//   26   56:aload_1         
	//   27   57:areturn         
			else
				return getText();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #282 <Method String getText()>
	//   30   62:areturn         
		} else
		{
			return s;
	//   31   63:aload_1         
	//   32   64:areturn         
		}
	}

	public boolean hasCurrentToken()
	{
		return _currToken != null;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasToken(JsonToken jsontoken)
	{
		return _currToken == jsontoken;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
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
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:astore_2        
		if(jsontoken == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       17
			return i == 0;
	//    5    9:iload_1         
	//    6   10:ifne            15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
		return jsontoken.id() == i;
	//   11   17:aload_2         
	//   12   18:invokevirtual   #263 <Method int JsonToken.id()>
	//   13   21:iload_1         
	//   14   22:icmpne          27
	//   15   25:iconst_1        
	//   16   26:ireturn         
	//   17   27:iconst_0        
	//   18   28:ireturn         
	}

	public boolean isExpectedStartArrayToken()
	{
		return _currToken == JsonToken.START_ARRAY;
	//    0    0:aload_0         
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:getstatic       #330 <Field JsonToken JsonToken.START_ARRAY>
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
	//    1    1:getfield        #183 <Field JsonToken _currToken>
	//    2    4:getstatic       #334 <Field JsonToken JsonToken.START_OBJECT>
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
	//    1    1:invokevirtual   #338 <Method JsonToken nextToken()>
	//    2    4:astore_2        
		JsonToken jsontoken = jsontoken1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #309 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   11:if_acmpne       19
			jsontoken = nextToken();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #338 <Method JsonToken nextToken()>
	//   10   18:astore_1        
		return jsontoken;
	//   11   19:aload_1         
	//   12   20:areturn         
	}

	protected void reportInvalidNumber(String s)
		throws JsonParseException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #77  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("Invalid numeric value: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #341 <String "Invalid numeric value: ">
	//    6   12:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		_reportError(stringbuilder.toString());
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   15   27:invokevirtual   #134 <Method void _reportError(String)>
	//   16   30:return          
	}

	protected void reportOverflowInt()
		throws IOException
	{
		_reportError(String.format("Numeric value (%s) out of range of int (%d - %s)", new Object[] {
			getText(), Integer.valueOf(0x80000000), Integer.valueOf(0x7fffffff)
		}));
	//    0    0:aload_0         
	//    1    1:ldc2            #344 <String "Numeric value (%s) out of range of int (%d - %s)">
	//    2    4:iconst_3        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #282 <Method String getText()>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:ldc2            #345 <Int 0x80000000>
	//   12   20:invokestatic    #348 <Method Integer Integer.valueOf(int)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:ldc2            #349 <Int 0x7fffffff>
	//   17   29:invokestatic    #348 <Method Integer Integer.valueOf(int)>
	//   18   32:aastore         
	//   19   33:invokestatic    #177 <Method String String.format(String, Object[])>
	//   20   36:invokevirtual   #134 <Method void _reportError(String)>
	//   21   39:return          
	}

	protected void reportOverflowLong()
		throws IOException
	{
		_reportError(String.format("Numeric value (%s) out of range of long (%d - %s)", new Object[] {
			getText(), Long.valueOf(0x0L), Long.valueOf(0xffffffffL)
		}));
	//    0    0:aload_0         
	//    1    1:ldc2            #352 <String "Numeric value (%s) out of range of long (%d - %s)">
	//    2    4:iconst_3        
	//    3    5:anewarray       Object[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:aload_0         
	//    7   11:invokevirtual   #282 <Method String getText()>
	//    8   14:aastore         
	//    9   15:dup             
	//   10   16:iconst_1        
	//   11   17:ldc2w           #42  <Long 0x0L>
	//   12   20:invokestatic    #357 <Method Long Long.valueOf(long)>
	//   13   23:aastore         
	//   14   24:dup             
	//   15   25:iconst_2        
	//   16   26:ldc2w           #46  <Long 0xffffffffL>
	//   17   29:invokestatic    #357 <Method Long Long.valueOf(long)>
	//   18   32:aastore         
	//   19   33:invokestatic    #177 <Method String String.format(String, Object[])>
	//   20   36:invokevirtual   #134 <Method void _reportError(String)>
	//   21   39:return          
	}

	protected void reportUnexpectedNumberChar(int i, String s)
		throws JsonParseException
	{
		String s1 = String.format("Unexpected character (%s) in numeric value", new Object[] {
			_getCharDesc(i)
		});
	//    0    0:ldc2            #360 <String "Unexpected character (%s) in numeric value">
	//    1    3:iconst_1        
	//    2    4:anewarray       Object[]
	//    3    7:dup             
	//    4    8:iconst_0        
	//    5    9:iload_1         
	//    6   10:invokestatic    #157 <Method String _getCharDesc(int)>
	//    7   13:aastore         
	//    8   14:invokestatic    #177 <Method String String.format(String, Object[])>
	//    9   17:astore          4
		Object obj = ((Object) (s1));
	//   10   19:aload           4
	//   11   21:astore_3        
		if(s != null)
	//*  12   22:aload_2         
	//*  13   23:ifnull          59
		{
			obj = ((Object) (new StringBuilder()));
	//   14   26:new             #77  <Class StringBuilder>
	//   15   29:dup             
	//   16   30:invokespecial   #79  <Method void StringBuilder()>
	//   17   33:astore_3        
			((StringBuilder) (obj)).append(s1);
	//   18   34:aload_3         
	//   19   35:aload           4
	//   20   37:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   21   40:pop             
			((StringBuilder) (obj)).append(": ");
	//   22   41:aload_3         
	//   23   42:ldc1            #228 <String ": ">
	//   24   44:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			((StringBuilder) (obj)).append(s);
	//   26   48:aload_3         
	//   27   49:aload_2         
	//   28   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   30   54:aload_3         
	//   31   55:invokevirtual   #94  <Method String StringBuilder.toString()>
	//   32   58:astore_3        
		}
		_reportError(((String) (obj)));
	//   33   59:aload_0         
	//   34   60:aload_3         
	//   35   61:invokevirtual   #134 <Method void _reportError(String)>
	//   36   64:return          
	}

	public JsonParser skipChildren()
		throws IOException
	{
		if(_currToken != JsonToken.START_OBJECT && _currToken != JsonToken.START_ARRAY)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field JsonToken _currToken>
	//*   2    4:getstatic       #334 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       22
	//*   4   10:aload_0         
	//*   5   11:getfield        #183 <Field JsonToken _currToken>
	//*   6   14:getstatic       #330 <Field JsonToken JsonToken.START_ARRAY>
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
	//   13   25:invokevirtual   #338 <Method JsonToken nextToken()>
	//   14   28:astore_3        
					if(jsontoken == null)
	//*  15   29:aload_3         
	//*  16   30:ifnonnull       39
					{
						_handleEOF();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #364 <Method void _handleEOF()>
						return ((JsonParser) (this));
	//   19   37:aload_0         
	//   20   38:areturn         
					}
					if(!jsontoken.isStructStart())
						break;
	//   21   39:aload_3         
	//   22   40:invokevirtual   #367 <Method boolean JsonToken.isStructStart()>
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
	//   30   54:invokevirtual   #370 <Method boolean JsonToken.isStructEnd()>
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

	protected static final BigDecimal BD_MAX_INT;
	protected static final BigDecimal BD_MAX_LONG;
	protected static final BigDecimal BD_MIN_INT;
	protected static final BigDecimal BD_MIN_LONG;
	protected static final BigInteger BI_MAX_INT;
	protected static final BigInteger BI_MAX_LONG;
	protected static final BigInteger BI_MIN_INT;
	protected static final BigInteger BI_MIN_LONG;
	protected static final byte NO_BYTES[] = new byte[0];
	protected static final int NO_INTS[] = new int[0];
	protected JsonToken _currToken;
	protected JsonToken _lastClearedToken;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        byte[]
	//    2    3:putstatic       #25  <Field byte[] NO_BYTES>
	//    3    6:iconst_0        
	//    4    7:newarray        int[]
	//    5    9:putstatic       #27  <Field int[] NO_INTS>
		BI_MIN_INT = BigInteger.valueOf(0x80000000L);
	//    6   12:ldc2w           #28  <Long 0x80000000L>
	//    7   15:invokestatic    #35  <Method BigInteger BigInteger.valueOf(long)>
	//    8   18:putstatic       #37  <Field BigInteger BI_MIN_INT>
		BI_MAX_INT = BigInteger.valueOf(0x7fffffffL);
	//    9   21:ldc2w           #38  <Long 0x7fffffffL>
	//   10   24:invokestatic    #35  <Method BigInteger BigInteger.valueOf(long)>
	//   11   27:putstatic       #41  <Field BigInteger BI_MAX_INT>
		BI_MIN_LONG = BigInteger.valueOf(0x0L);
	//   12   30:ldc2w           #42  <Long 0x0L>
	//   13   33:invokestatic    #35  <Method BigInteger BigInteger.valueOf(long)>
	//   14   36:putstatic       #45  <Field BigInteger BI_MIN_LONG>
		BI_MAX_LONG = BigInteger.valueOf(0xffffffffL);
	//   15   39:ldc2w           #46  <Long 0xffffffffL>
	//   16   42:invokestatic    #35  <Method BigInteger BigInteger.valueOf(long)>
	//   17   45:putstatic       #49  <Field BigInteger BI_MAX_LONG>
		BD_MIN_LONG = new BigDecimal(BI_MIN_LONG);
	//   18   48:new             #51  <Class BigDecimal>
	//   19   51:dup             
	//   20   52:getstatic       #45  <Field BigInteger BI_MIN_LONG>
	//   21   55:invokespecial   #55  <Method void BigDecimal(BigInteger)>
	//   22   58:putstatic       #57  <Field BigDecimal BD_MIN_LONG>
		BD_MAX_LONG = new BigDecimal(BI_MAX_LONG);
	//   23   61:new             #51  <Class BigDecimal>
	//   24   64:dup             
	//   25   65:getstatic       #49  <Field BigInteger BI_MAX_LONG>
	//   26   68:invokespecial   #55  <Method void BigDecimal(BigInteger)>
	//   27   71:putstatic       #59  <Field BigDecimal BD_MAX_LONG>
		BD_MIN_INT = new BigDecimal(BI_MIN_INT);
	//   28   74:new             #51  <Class BigDecimal>
	//   29   77:dup             
	//   30   78:getstatic       #37  <Field BigInteger BI_MIN_INT>
	//   31   81:invokespecial   #55  <Method void BigDecimal(BigInteger)>
	//   32   84:putstatic       #61  <Field BigDecimal BD_MIN_INT>
		BD_MAX_INT = new BigDecimal(BI_MAX_INT);
	//   33   87:new             #51  <Class BigDecimal>
	//   34   90:dup             
	//   35   91:getstatic       #41  <Field BigInteger BI_MAX_INT>
	//   36   94:invokespecial   #55  <Method void BigDecimal(BigInteger)>
	//   37   97:putstatic       #63  <Field BigDecimal BD_MAX_INT>
	//*  38  100:return          
	}
}
