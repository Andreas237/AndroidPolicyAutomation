// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.*;
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
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_1        
		for(int j = s.length(); i < j; i++)
	//*   6    9:aload_0         
	//*   7   10:invokevirtual   #72  <Method int String.length()>
	//*   8   13:istore_2        
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
	//*   5    7:ifeq            35
			return (new StringBuilder()).append("(CTRL-CHAR, code ").append(i).append(")").toString();
	//    6   10:new             #86  <Class StringBuilder>
	//    7   13:dup             
	//    8   14:invokespecial   #87  <Method void StringBuilder()>
	//    9   17:ldc1            #89  <String "(CTRL-CHAR, code ">
	//   10   19:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   11   22:iload_0         
	//   12   23:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   13   26:ldc1            #98  <String ")">
	//   14   28:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   15   31:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   16   34:areturn         
		if(i > 255)
	//*  17   35:iload_0         
	//*  18   36:sipush          255
	//*  19   39:icmple          88
			return (new StringBuilder()).append("'").append(c).append("' (code ").append(i).append(" / 0x").append(Integer.toHexString(i)).append(")").toString();
	//   20   42:new             #86  <Class StringBuilder>
	//   21   45:dup             
	//   22   46:invokespecial   #87  <Method void StringBuilder()>
	//   23   49:ldc1            #104 <String "'">
	//   24   51:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   25   54:iload_1         
	//   26   55:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//   27   58:ldc1            #109 <String "' (code ">
	//   28   60:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:iload_0         
	//   30   64:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   31   67:ldc1            #111 <String " / 0x">
	//   32   69:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   33   72:iload_0         
	//   34   73:invokestatic    #116 <Method String Integer.toHexString(int)>
	//   35   76:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   36   79:ldc1            #98  <String ")">
	//   37   81:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   38   84:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   39   87:areturn         
		else
			return (new StringBuilder()).append("'").append(c).append("' (code ").append(i).append(")").toString();
	//   40   88:new             #86  <Class StringBuilder>
	//   41   91:dup             
	//   42   92:invokespecial   #87  <Method void StringBuilder()>
	//   43   95:ldc1            #104 <String "'">
	//   44   97:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   45  100:iload_1         
	//   46  101:invokevirtual   #107 <Method StringBuilder StringBuilder.append(char)>
	//   47  104:ldc1            #109 <String "' (code ">
	//   48  106:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   49  109:iload_0         
	//   50  110:invokevirtual   #96  <Method StringBuilder StringBuilder.append(int)>
	//   51  113:ldc1            #98  <String ")">
	//   52  115:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   53  118:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   54  121:areturn         
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
		while(isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER) || c == '\'' && isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_SINGLE_QUOTES)) 
	//*   0    0:aload_0         
	//*   1    1:getstatic       #152 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER>
	//*   2    4:invokevirtual   #156 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifeq            12
			return c;
	//    4   10:iload_1         
	//    5   11:ireturn         
	//    6   12:iload_1         
	//    7   13:bipush          39
	//    8   15:icmpne          28
	//    9   18:aload_0         
	//   10   19:getstatic       #159 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_SINGLE_QUOTES>
	//   11   22:invokevirtual   #156 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//   12   25:ifne            10
		_reportError((new StringBuilder()).append("Unrecognized character escape ").append(_getCharDesc(((int) (c)))).toString());
	//   13   28:aload_0         
	//   14   29:new             #86  <Class StringBuilder>
	//   15   32:dup             
	//   16   33:invokespecial   #87  <Method void StringBuilder()>
	//   17   36:ldc1            #161 <String "Unrecognized character escape ">
	//   18   38:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   19   41:iload_1         
	//   20   42:invokestatic    #163 <Method String _getCharDesc(int)>
	//   21   45:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   22   48:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   23   51:invokevirtual   #140 <Method void _reportError(String)>
		return c;
	//   24   54:iload_1         
	//   25   55:ireturn         
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
		_reportInvalidEOF((new StringBuilder()).append(" in ").append(((Object) (_currToken))).toString());
	//    0    0:aload_0         
	//    1    1:new             #86  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #87  <Method void StringBuilder()>
	//    4    8:ldc1            #177 <String " in ">
	//    5   10:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_0         
	//    7   14:getfield        #179 <Field JsonToken _currToken>
	//    8   17:invokevirtual   #182 <Method StringBuilder StringBuilder.append(Object)>
	//    9   20:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   10   23:invokevirtual   #184 <Method void _reportInvalidEOF(String)>
	//   11   26:return          
	}

	protected void _reportInvalidEOF(String s)
		throws JsonParseException
	{
		_reportError((new StringBuilder()).append("Unexpected end-of-input").append(s).toString());
	//    0    0:aload_0         
	//    1    1:new             #86  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #87  <Method void StringBuilder()>
	//    4    8:ldc1            #186 <String "Unexpected end-of-input">
	//    5   10:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    6   13:aload_1         
	//    7   14:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:invokevirtual   #102 <Method String StringBuilder.toString()>
	//    9   20:invokevirtual   #140 <Method void _reportError(String)>
	//   10   23:return          
	}

	protected void _reportInvalidEOFInValue()
		throws JsonParseException
	{
		_reportInvalidEOF(" in a value");
	//    0    0:aload_0         
	//    1    1:ldc1            #189 <String " in a value">
	//    2    3:invokevirtual   #184 <Method void _reportInvalidEOF(String)>
	//    3    6:return          
	}

	protected void _reportMissingRootWS(int i)
		throws JsonParseException
	{
		_reportUnexpectedChar(i, "Expected space separating root-level values");
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc1            #192 <String "Expected space separating root-level values">
	//    3    4:invokevirtual   #196 <Method void _reportUnexpectedChar(int, String)>
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
	//    3    5:invokevirtual   #198 <Method void _reportInvalidEOF()>
		String s2 = (new StringBuilder()).append("Unexpected character (").append(_getCharDesc(i)).append(")").toString();
	//    4    8:new             #86  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #87  <Method void StringBuilder()>
	//    7   15:ldc1            #200 <String "Unexpected character (">
	//    8   17:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:iload_1         
	//   10   21:invokestatic    #163 <Method String _getCharDesc(int)>
	//   11   24:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   12   27:ldc1            #98  <String ")">
	//   13   29:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   14   32:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   15   35:astore          4
		String s1 = s2;
	//   16   37:aload           4
	//   17   39:astore_3        
		if(s != null)
	//*  18   40:aload_2         
	//*  19   41:ifnull          69
			s1 = (new StringBuilder()).append(s2).append(": ").append(s).toString();
	//   20   44:new             #86  <Class StringBuilder>
	//   21   47:dup             
	//   22   48:invokespecial   #87  <Method void StringBuilder()>
	//   23   51:aload           4
	//   24   53:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:ldc1            #202 <String ": ">
	//   26   58:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   27   61:aload_2         
	//   28   62:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   29   65:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   30   68:astore_3        
		_reportError(s1);
	//   31   69:aload_0         
	//   32   70:aload_3         
	//   33   71:invokevirtual   #140 <Method void _reportError(String)>
	//   34   74:return          
	}

	protected final void _throwInternal()
	{
		VersionUtil.throwInternal();
	//    0    0:invokestatic    #208 <Method void VersionUtil.throwInternal()>
	//    1    3:return          
	}

	protected void _throwInvalidSpace(int i)
		throws JsonParseException
	{
		i = ((int) ((char)i));
	//    0    0:iload_1         
	//    1    1:int2char        
	//    2    2:istore_1        
		_reportError((new StringBuilder()).append("Illegal character (").append(_getCharDesc(i)).append("): only regular white space (\\r, \\n, \\t) is allowed between tokens").toString());
	//    3    3:aload_0         
	//    4    4:new             #86  <Class StringBuilder>
	//    5    7:dup             
	//    6    8:invokespecial   #87  <Method void StringBuilder()>
	//    7   11:ldc1            #211 <String "Illegal character (">
	//    8   13:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//    9   16:iload_1         
	//   10   17:invokestatic    #163 <Method String _getCharDesc(int)>
	//   11   20:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:ldc1            #213 <String "): only regular white space (\\r, \\n, \\t) is allowed between tokens">
	//   13   25:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   14   28:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   15   31:invokevirtual   #140 <Method void _reportError(String)>
	//   16   34:return          
	}

	protected void _throwUnquotedSpace(int i, String s)
		throws JsonParseException
	{
		if(!isEnabled(com.fasterxml.jackson.core.JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS) || i > 32)
	//*   0    0:aload_0         
	//*   1    1:getstatic       #217 <Field com.fasterxml.jackson.core.JsonParser$Feature com.fasterxml.jackson.core.JsonParser$Feature.ALLOW_UNQUOTED_CONTROL_CHARS>
	//*   2    4:invokevirtual   #156 <Method boolean isEnabled(com.fasterxml.jackson.core.JsonParser$Feature)>
	//*   3    7:ifeq            16
	//*   4   10:iload_1         
	//*   5   11:bipush          32
	//*   6   13:icmple          54
		{
			i = ((int) ((char)i));
	//    7   16:iload_1         
	//    8   17:int2char        
	//    9   18:istore_1        
			_reportError((new StringBuilder()).append("Illegal unquoted character (").append(_getCharDesc(i)).append("): has to be escaped using backslash to be included in ").append(s).toString());
	//   10   19:aload_0         
	//   11   20:new             #86  <Class StringBuilder>
	//   12   23:dup             
	//   13   24:invokespecial   #87  <Method void StringBuilder()>
	//   14   27:ldc1            #219 <String "Illegal unquoted character (">
	//   15   29:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   16   32:iload_1         
	//   17   33:invokestatic    #163 <Method String _getCharDesc(int)>
	//   18   36:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:ldc1            #221 <String "): has to be escaped using backslash to be included in ">
	//   20   41:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:aload_2         
	//   22   45:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   23   48:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   24   51:invokevirtual   #140 <Method void _reportError(String)>
		}
	//   25   54:return          
	}

	protected final void _wrapError(String s, Throwable throwable)
		throws JsonParseException
	{
		throw _constructError(s, throwable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #225 <Method JsonParseException _constructError(String, Throwable)>
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
	//    6   12:putfield        #228 <Field JsonToken _lastClearedToken>
			_currToken = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #179 <Field JsonToken _currToken>
		}
	//   10   20:return          
	}

	public abstract void close()
		throws IOException;

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
	//    8   12:invokevirtual   #240 <Method int JsonToken.id()>
	//    9   15:ireturn         
	}

	public JsonToken getLastClearedToken()
	{
		return _lastClearedToken;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field JsonToken _lastClearedToken>
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
		boolean flag2;
		Object obj;
		flag2 = true;
	//    0    0:iconst_1        
	//    1    1:istore_3        
		obj = ((Object) (_currToken));
	//    2    2:aload_0         
	//    3    3:getfield        #179 <Field JsonToken _currToken>
	//    4    6:astore          4
		if(obj == null) goto _L2; else goto _L1
	//    5    8:aload           4
	//    6   10:ifnull          64
_L1:
		boolean flag1 = flag2;
	//    7   13:iload_3         
	//    8   14:istore_2        
		((JsonToken) (obj)).id();
	//    9   15:aload           4
	//   10   17:invokevirtual   #240 <Method int JsonToken.id()>
		JVM INSTR tableswitch 6 12: default 64
	//	               6 68
	//	               7 114
	//	               8 64
	//	               9 66
	//	               10 125
	//	               11 125
	//	               12 127;
	//   11   20:tableswitch     6 12: default 64
	//	               6 68
	//	               7 114
	//	               8 64
	//	               9 66
	//	               10 125
	//	               11 125
	//	               12 127
		   goto _L2 _L3 _L4 _L2 _L5 _L6 _L6 _L7
_L2:
		flag1 = flag;
	//   12   64:iload_1         
	//   13   65:istore_2        
_L5:
		return flag1;
	//   14   66:iload_2         
	//   15   67:ireturn         
_L3:
		obj = ((Object) (getText().trim()));
	//   16   68:aload_0         
	//   17   69:invokevirtual   #252 <Method String getText()>
	//   18   72:invokevirtual   #255 <Method String String.trim()>
	//   19   75:astore          4
		flag1 = flag2;
	//   20   77:iload_3         
	//   21   78:istore_2        
		if("true".equals(obj)) goto _L5; else goto _L8
	//   22   79:ldc2            #257 <String "true">
	//   23   82:aload           4
	//   24   84:invokevirtual   #171 <Method boolean String.equals(Object)>
	//   25   87:ifne            66
_L8:
		if("false".equals(obj))
	//*  26   90:ldc2            #259 <String "false">
	//*  27   93:aload           4
	//*  28   95:invokevirtual   #171 <Method boolean String.equals(Object)>
	//*  29   98:ifeq            103
			return false;
	//   30  101:iconst_0        
	//   31  102:ireturn         
		if(_hasTextualNull(((String) (obj))))
	//*  32  103:aload_0         
	//*  33  104:aload           4
	//*  34  106:invokevirtual   #261 <Method boolean _hasTextualNull(String)>
	//*  35  109:ifeq            64
			return false;
	//   36  112:iconst_0        
	//   37  113:ireturn         
		continue; /* Loop/switch isn't completed */
_L4:
		flag1 = flag2;
	//   38  114:iload_3         
	//   39  115:istore_2        
		if(getIntValue() != 0) goto _L5; else goto _L9
	//   40  116:aload_0         
	//   41  117:invokevirtual   #264 <Method int getIntValue()>
	//   42  120:ifne            66
_L9:
		return false;
	//   43  123:iconst_0        
	//   44  124:ireturn         
_L6:
		return false;
	//   45  125:iconst_0        
	//   46  126:ireturn         
_L7:
		Object obj1 = getEmbeddedObject();
	//   47  127:aload_0         
	//   48  128:invokevirtual   #268 <Method Object getEmbeddedObject()>
	//   49  131:astore          4
		if(obj1 instanceof Boolean)
	//*  50  133:aload           4
	//*  51  135:instanceof      #270 <Class Boolean>
	//*  52  138:ifeq            64
			return ((Boolean)obj1).booleanValue();
	//   53  141:aload           4
	//   54  143:checkcast       #270 <Class Boolean>
	//   55  146:invokevirtual   #274 <Method boolean Boolean.booleanValue()>
	//   56  149:ireturn         
		if(true) goto _L2; else goto _L10
_L10:
	}

	public double getValueAsDouble(double d)
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_3        
		if(jsontoken == null) goto _L2; else goto _L1
	//    3    5:aload_3         
	//    4    6:ifnull          56
_L1:
		jsontoken.id();
	//    5    9:aload_3         
	//    6   10:invokevirtual   #240 <Method int JsonToken.id()>
		JVM INSTR tableswitch 6 12: default 56
	//	               6 58
	//	               7 79
	//	               8 79
	//	               9 84
	//	               10 86
	//	               11 86
	//	               12 88;
	//    7   13:tableswitch     6 12: default 56
	//	               6 58
	//	               7 79
	//	               8 79
	//	               9 84
	//	               10 86
	//	               11 86
	//	               12 88
		   goto _L2 _L3 _L4 _L4 _L5 _L6 _L6 _L7
_L2:
		return d;
	//    8   56:dload_1         
	//    9   57:dreturn         
_L3:
		String s = getText();
	//   10   58:aload_0         
	//   11   59:invokevirtual   #252 <Method String getText()>
	//   12   62:astore_3        
		if(_hasTextualNull(s))
	//*  13   63:aload_0         
	//*  14   64:aload_3         
	//*  15   65:invokevirtual   #261 <Method boolean _hasTextualNull(String)>
	//*  16   68:ifeq            73
			return 0.0D;
	//   17   71:dconst_0        
	//   18   72:dreturn         
		else
			return NumberInput.parseAsDouble(s, d);
	//   19   73:aload_3         
	//   20   74:dload_1         
	//   21   75:invokestatic    #282 <Method double NumberInput.parseAsDouble(String, double)>
	//   22   78:dreturn         
_L4:
		return getDoubleValue();
	//   23   79:aload_0         
	//   24   80:invokevirtual   #286 <Method double getDoubleValue()>
	//   25   83:dreturn         
_L5:
		return 1.0D;
	//   26   84:dconst_1        
	//   27   85:dreturn         
_L6:
		return 0.0D;
	//   28   86:dconst_0        
	//   29   87:dreturn         
_L7:
		Object obj = getEmbeddedObject();
	//   30   88:aload_0         
	//   31   89:invokevirtual   #268 <Method Object getEmbeddedObject()>
	//   32   92:astore_3        
		if(obj instanceof Number)
	//*  33   93:aload_3         
	//*  34   94:instanceof      #288 <Class Number>
	//*  35   97:ifeq            56
			return ((Number)obj).doubleValue();
	//   36  100:aload_3         
	//   37  101:checkcast       #288 <Class Number>
	//   38  104:invokevirtual   #291 <Method double Number.doubleValue()>
	//   39  107:dreturn         
		if(true) goto _L2; else goto _L8
_L8:
	}

	public int getValueAsInt()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #295 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       19
	//*   6   12:aload_1         
	//*   7   13:getstatic       #298 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       24
			return getIntValue();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #264 <Method int getIntValue()>
	//   11   23:ireturn         
		else
			return getValueAsInt(0);
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:invokevirtual   #301 <Method int getValueAsInt(int)>
	//   15   29:ireturn         
	}

	public int getValueAsInt(int i)
		throws IOException
	{
		Object obj = ((Object) (_currToken));
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_3        
		int j;
		if(obj == JsonToken.VALUE_NUMBER_INT || obj == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_3         
	//*   4    6:getstatic       #295 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       19
	//*   6   12:aload_3         
	//*   7   13:getstatic       #298 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       26
		{
			j = getIntValue();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #264 <Method int getIntValue()>
	//   11   23:istore_2        
		} else
	//*  12   24:iload_2         
	//*  13   25:ireturn         
		{
			j = i;
	//   14   26:iload_1         
	//   15   27:istore_2        
			if(obj != null)
	//*  16   28:aload_3         
	//*  17   29:ifnull          24
			{
				switch(((JsonToken) (obj)).id())
	//*  18   32:aload_3         
	//*  19   33:invokevirtual   #240 <Method int JsonToken.id()>
				{
	//*  20   36:tableswitch     6 12: default 80
	//	               6 82
	//	               7 80
	//	               8 80
	//	               9 103
	//	               10 105
	//	               11 107
	//	               12 109
				case 7: // '\007'
				case 8: // '\b'
				default:
					return i;
	//   21   80:iload_1         
	//   22   81:ireturn         

				case 6: // '\006'
					obj = ((Object) (getText()));
	//   23   82:aload_0         
	//   24   83:invokevirtual   #252 <Method String getText()>
	//   25   86:astore_3        
					if(_hasTextualNull(((String) (obj))))
	//*  26   87:aload_0         
	//*  27   88:aload_3         
	//*  28   89:invokevirtual   #261 <Method boolean _hasTextualNull(String)>
	//*  29   92:ifeq            97
						return 0;
	//   30   95:iconst_0        
	//   31   96:ireturn         
					else
						return NumberInput.parseAsInt(((String) (obj)), i);
	//   32   97:aload_3         
	//   33   98:iload_1         
	//   34   99:invokestatic    #305 <Method int NumberInput.parseAsInt(String, int)>
	//   35  102:ireturn         

				case 9: // '\t'
					return 1;
	//   36  103:iconst_1        
	//   37  104:ireturn         

				case 10: // '\n'
					return 0;
	//   38  105:iconst_0        
	//   39  106:ireturn         

				case 11: // '\013'
					return 0;
	//   40  107:iconst_0        
	//   41  108:ireturn         

				case 12: // '\f'
					obj = getEmbeddedObject();
	//   42  109:aload_0         
	//   43  110:invokevirtual   #268 <Method Object getEmbeddedObject()>
	//   44  113:astore_3        
					j = i;
	//   45  114:iload_1         
	//   46  115:istore_2        
					break;
				}
				if(obj instanceof Number)
	//*  47  116:aload_3         
	//*  48  117:instanceof      #288 <Class Number>
	//*  49  120:ifeq            24
					return ((Number)obj).intValue();
	//   50  123:aload_3         
	//   51  124:checkcast       #288 <Class Number>
	//   52  127:invokevirtual   #308 <Method int Number.intValue()>
	//   53  130:ireturn         
			}
		}
		return j;
	}

	public long getValueAsLong()
		throws IOException
	{
		JsonToken jsontoken = _currToken;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore_1        
		if(jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    5:aload_1         
	//*   4    6:getstatic       #295 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5    9:if_acmpeq       19
	//*   6   12:aload_1         
	//*   7   13:getstatic       #298 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   16:if_acmpne       24
			return getLongValue();
	//    9   19:aload_0         
	//   10   20:invokevirtual   #313 <Method long getLongValue()>
	//   11   23:lreturn         
		else
			return getValueAsLong(0L);
	//   12   24:aload_0         
	//   13   25:lconst_0        
	//   14   26:invokevirtual   #316 <Method long getValueAsLong(long)>
	//   15   29:lreturn         
	}

	public long getValueAsLong(long l)
		throws IOException
	{
		Object obj = ((Object) (_currToken));
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:astore          5
		long l1;
		if(obj == JsonToken.VALUE_NUMBER_INT || obj == JsonToken.VALUE_NUMBER_FLOAT)
	//*   3    6:aload           5
	//*   4    8:getstatic       #295 <Field JsonToken JsonToken.VALUE_NUMBER_INT>
	//*   5   11:if_acmpeq       22
	//*   6   14:aload           5
	//*   7   16:getstatic       #298 <Field JsonToken JsonToken.VALUE_NUMBER_FLOAT>
	//*   8   19:if_acmpne       29
		{
			l1 = getLongValue();
	//    9   22:aload_0         
	//   10   23:invokevirtual   #313 <Method long getLongValue()>
	//   11   26:lstore_3        
		} else
	//*  12   27:lload_3         
	//*  13   28:lreturn         
		{
			l1 = l;
	//   14   29:lload_1         
	//   15   30:lstore_3        
			if(obj != null)
	//*  16   31:aload           5
	//*  17   33:ifnull          27
			{
				switch(((JsonToken) (obj)).id())
	//*  18   36:aload           5
	//*  19   38:invokevirtual   #240 <Method int JsonToken.id()>
				{
	//*  20   41:tableswitch     6 12: default 84
	//	               6 86
	//	               7 84
	//	               8 84
	//	               9 110
	//	               10 112
	//	               11 112
	//	               12 114
				case 7: // '\007'
				case 8: // '\b'
				default:
					return l;
	//   21   84:lload_1         
	//   22   85:lreturn         

				case 6: // '\006'
					obj = ((Object) (getText()));
	//   23   86:aload_0         
	//   24   87:invokevirtual   #252 <Method String getText()>
	//   25   90:astore          5
					if(_hasTextualNull(((String) (obj))))
	//*  26   92:aload_0         
	//*  27   93:aload           5
	//*  28   95:invokevirtual   #261 <Method boolean _hasTextualNull(String)>
	//*  29   98:ifeq            103
						return 0L;
	//   30  101:lconst_0        
	//   31  102:lreturn         
					else
						return NumberInput.parseAsLong(((String) (obj)), l);
	//   32  103:aload           5
	//   33  105:lload_1         
	//   34  106:invokestatic    #320 <Method long NumberInput.parseAsLong(String, long)>
	//   35  109:lreturn         

				case 9: // '\t'
					return 1L;
	//   36  110:lconst_1        
	//   37  111:lreturn         

				case 10: // '\n'
				case 11: // '\013'
					return 0L;
	//   38  112:lconst_0        
	//   39  113:lreturn         

				case 12: // '\f'
					obj = getEmbeddedObject();
	//   40  114:aload_0         
	//   41  115:invokevirtual   #268 <Method Object getEmbeddedObject()>
	//   42  118:astore          5
					l1 = l;
	//   43  120:lload_1         
	//   44  121:lstore_3        
					break;
				}
				if(obj instanceof Number)
	//*  45  122:aload           5
	//*  46  124:instanceof      #288 <Class Number>
	//*  47  127:ifeq            27
					return ((Number)obj).longValue();
	//   48  130:aload           5
	//   49  132:checkcast       #288 <Class Number>
	//   50  135:invokevirtual   #323 <Method long Number.longValue()>
	//   51  138:lreturn         
			}
		}
		return l1;
	}

	public String getValueAsString()
		throws IOException
	{
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field JsonToken _currToken>
	//*   2    4:getstatic       #327 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       15
			return getText();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #252 <Method String getText()>
	//    6   14:areturn         
		if(_currToken == JsonToken.FIELD_NAME)
	//*   7   15:aload_0         
	//*   8   16:getfield        #179 <Field JsonToken _currToken>
	//*   9   19:getstatic       #330 <Field JsonToken JsonToken.FIELD_NAME>
	//*  10   22:if_acmpne       30
			return getCurrentName();
	//   11   25:aload_0         
	//   12   26:invokevirtual   #332 <Method String getCurrentName()>
	//   13   29:areturn         
		else
			return getValueAsString(((String) (null)));
	//   14   30:aload_0         
	//   15   31:aconst_null     
	//   16   32:invokevirtual   #335 <Method String getValueAsString(String)>
	//   17   35:areturn         
	}

	public String getValueAsString(String s)
		throws IOException
	{
		String s1;
		if(_currToken == JsonToken.VALUE_STRING)
	//*   0    0:aload_0         
	//*   1    1:getfield        #179 <Field JsonToken _currToken>
	//*   2    4:getstatic       #327 <Field JsonToken JsonToken.VALUE_STRING>
	//*   3    7:if_acmpne       17
		{
			s1 = getText();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #252 <Method String getText()>
	//    6   14:astore_2        
		} else
	//*   7   15:aload_2         
	//*   8   16:areturn         
		{
			if(_currToken == JsonToken.FIELD_NAME)
	//*   9   17:aload_0         
	//*  10   18:getfield        #179 <Field JsonToken _currToken>
	//*  11   21:getstatic       #330 <Field JsonToken JsonToken.FIELD_NAME>
	//*  12   24:if_acmpne       32
				return getCurrentName();
	//   13   27:aload_0         
	//   14   28:invokevirtual   #332 <Method String getCurrentName()>
	//   15   31:areturn         
			s1 = s;
	//   16   32:aload_1         
	//   17   33:astore_2        
			if(_currToken != null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #179 <Field JsonToken _currToken>
	//*  20   38:ifnull          15
			{
				s1 = s;
	//   21   41:aload_1         
	//   22   42:astore_2        
				if(_currToken != JsonToken.VALUE_NULL)
	//*  23   43:aload_0         
	//*  24   44:getfield        #179 <Field JsonToken _currToken>
	//*  25   47:getstatic       #338 <Field JsonToken JsonToken.VALUE_NULL>
	//*  26   50:if_acmpeq       15
				{
					s1 = s;
	//   27   53:aload_1         
	//   28   54:astore_2        
					if(_currToken.isScalarValue())
	//*  29   55:aload_0         
	//*  30   56:getfield        #179 <Field JsonToken _currToken>
	//*  31   59:invokevirtual   #341 <Method boolean JsonToken.isScalarValue()>
	//*  32   62:ifeq            15
						return getText();
	//   33   65:aload_0         
	//   34   66:invokevirtual   #252 <Method String getText()>
	//   35   69:areturn         
				}
			}
		}
		return s1;
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
	//    2    4:astore_2        
		if(jsontoken != null) goto _L2; else goto _L1
	//    3    5:aload_2         
	//    4    6:ifnonnull       17
_L1:
		if(i != 0) goto _L4; else goto _L3
	//    5    9:iload_1         
	//    6   10:ifne            15
_L3:
		return true;
	//    7   13:iconst_1        
	//    8   14:ireturn         
_L4:
		return false;
	//    9   15:iconst_0        
	//   10   16:ireturn         
_L2:
		if(jsontoken.id() != i)
	//*  11   17:aload_2         
	//*  12   18:invokevirtual   #240 <Method int JsonToken.id()>
	//*  13   21:iload_1         
	//*  14   22:icmpeq          13
			return false;
	//   15   25:iconst_0        
	//   16   26:ireturn         
		if(true) goto _L3; else goto _L5
_L5:
	}

	public abstract boolean isClosed();

	public boolean isExpectedStartArrayToken()
	{
		return _currToken == JsonToken.START_ARRAY;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field JsonToken _currToken>
	//    2    4:getstatic       #352 <Field JsonToken JsonToken.START_ARRAY>
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
	//    2    4:getstatic       #356 <Field JsonToken JsonToken.START_OBJECT>
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
	//    1    1:invokevirtual   #360 <Method JsonToken nextToken()>
	//    2    4:astore_2        
		JsonToken jsontoken = jsontoken1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(jsontoken1 == JsonToken.FIELD_NAME)
	//*   5    7:aload_2         
	//*   6    8:getstatic       #330 <Field JsonToken JsonToken.FIELD_NAME>
	//*   7   11:if_acmpne       19
			jsontoken = nextToken();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #360 <Method JsonToken nextToken()>
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
	//*   2    4:getstatic       #356 <Field JsonToken JsonToken.START_OBJECT>
	//*   3    7:if_acmpeq       22
	//*   4   10:aload_0         
	//*   5   11:getfield        #179 <Field JsonToken _currToken>
	//*   6   14:getstatic       #352 <Field JsonToken JsonToken.START_ARRAY>
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
	//   13   25:invokevirtual   #360 <Method JsonToken nextToken()>
	//   14   28:astore_3        
					if(jsontoken == null)
	//*  15   29:aload_3         
	//*  16   30:ifnonnull       39
					{
						_handleEOF();
	//   17   33:aload_0         
	//   18   34:invokevirtual   #365 <Method void _handleEOF()>
						return ((JsonParser) (this));
	//   19   37:aload_0         
	//   20   38:areturn         
					}
					if(!jsontoken.isStructStart())
						break;
	//   21   39:aload_3         
	//   22   40:invokevirtual   #368 <Method boolean JsonToken.isStructStart()>
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
	//   30   54:invokevirtual   #371 <Method boolean JsonToken.isStructEnd()>
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
