// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import android.text.TextUtils;
import com.google.android.exoplayer2.util.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.text.webvtt:
//			WebvttCssStyle

final class CssParser
{

	public CssParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #57  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #59  <Class ParsableByteArray>
	//    4    8:dup             
	//    5    9:invokespecial   #60  <Method void ParsableByteArray()>
	//    6   12:putfield        #62  <Field ParsableByteArray styleInput>
	//    7   15:aload_0         
	//    8   16:new             #64  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #65  <Method void StringBuilder()>
	//   11   23:putfield        #67  <Field StringBuilder stringBuilder>
	//   12   26:return          
	}

	private void applySelectorToStyle(WebvttCssStyle webvttcssstyle, String s)
	{
		if("".equals(((Object) (s))))
	//*   0    0:ldc1            #71  <String "">
	//*   1    2:aload_2         
	//*   2    3:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*   3    6:ifeq            10
			return;
	//    4    9:return          
		int i = s.indexOf('[');
	//    5   10:aload_2         
	//    6   11:bipush          91
	//    7   13:invokevirtual   #81  <Method int String.indexOf(int)>
	//    8   16:istore_3        
		Object obj = ((Object) (s));
	//    9   17:aload_2         
	//   10   18:astore          4
		if(i != -1)
	//*  11   20:iload_3         
	//*  12   21:iconst_m1       
	//*  13   22:icmpeq          64
		{
			obj = ((Object) (VOICE_NAME_PATTERN.matcher(((CharSequence) (s.substring(i))))));
	//   14   25:getstatic       #53  <Field Pattern VOICE_NAME_PATTERN>
	//   15   28:aload_2         
	//   16   29:iload_3         
	//   17   30:invokevirtual   #85  <Method String String.substring(int)>
	//   18   33:invokevirtual   #89  <Method Matcher Pattern.matcher(CharSequence)>
	//   19   36:astore          4
			if(((Matcher) (obj)).matches())
	//*  20   38:aload           4
	//*  21   40:invokevirtual   #95  <Method boolean Matcher.matches()>
	//*  22   43:ifeq            56
				webvttcssstyle.setTargetVoice(((Matcher) (obj)).group(1));
	//   23   46:aload_1         
	//   24   47:aload           4
	//   25   49:iconst_1        
	//   26   50:invokevirtual   #98  <Method String Matcher.group(int)>
	//   27   53:invokevirtual   #104 <Method void WebvttCssStyle.setTargetVoice(String)>
			obj = ((Object) (s.substring(0, i)));
	//   28   56:aload_2         
	//   29   57:iconst_0        
	//   30   58:iload_3         
	//   31   59:invokevirtual   #107 <Method String String.substring(int, int)>
	//   32   62:astore          4
		}
		s = ((String) (Util.split(((String) (obj)), "\\.")));
	//   33   64:aload           4
	//   34   66:ldc1            #109 <String "\\.">
	//   35   68:invokestatic    #115 <Method String[] Util.split(String, String)>
	//   36   71:astore_2        
		obj = ((Object) (s[0]));
	//   37   72:aload_2         
	//   38   73:iconst_0        
	//   39   74:aaload          
	//   40   75:astore          4
		i = ((String) (obj)).indexOf('#');
	//   41   77:aload           4
	//   42   79:bipush          35
	//   43   81:invokevirtual   #81  <Method int String.indexOf(int)>
	//   44   84:istore_3        
		if(i != -1)
	//*  45   85:iload_3         
	//*  46   86:iconst_m1       
	//*  47   87:icmpeq          116
		{
			webvttcssstyle.setTargetTagName(((String) (obj)).substring(0, i));
	//   48   90:aload_1         
	//   49   91:aload           4
	//   50   93:iconst_0        
	//   51   94:iload_3         
	//   52   95:invokevirtual   #107 <Method String String.substring(int, int)>
	//   53   98:invokevirtual   #118 <Method void WebvttCssStyle.setTargetTagName(String)>
			webvttcssstyle.setTargetId(((String) (obj)).substring(i + 1));
	//   54  101:aload_1         
	//   55  102:aload           4
	//   56  104:iload_3         
	//   57  105:iconst_1        
	//   58  106:iadd            
	//   59  107:invokevirtual   #85  <Method String String.substring(int)>
	//   60  110:invokevirtual   #121 <Method void WebvttCssStyle.setTargetId(String)>
		} else
	//*  61  113:goto            122
		{
			webvttcssstyle.setTargetTagName(((String) (obj)));
	//   62  116:aload_1         
	//   63  117:aload           4
	//   64  119:invokevirtual   #118 <Method void WebvttCssStyle.setTargetTagName(String)>
		}
		if(s.length > 1)
	//*  65  122:aload_2         
	//*  66  123:arraylength     
	//*  67  124:iconst_1        
	//*  68  125:icmple          142
			webvttcssstyle.setTargetClasses((String[])Arrays.copyOfRange(((Object []) (s)), 1, s.length));
	//   69  128:aload_1         
	//   70  129:aload_2         
	//   71  130:iconst_1        
	//   72  131:aload_2         
	//   73  132:arraylength     
	//   74  133:invokestatic    #127 <Method Object[] Arrays.copyOfRange(Object[], int, int)>
	//   75  136:checkcast       #129 <Class String[]>
	//   76  139:invokevirtual   #133 <Method void WebvttCssStyle.setTargetClasses(String[])>
	//   77  142:return          
	}

	private static boolean maybeSkipComment(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//    2    4:istore_1        
		int j = parsablebytearray.limit();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method int ParsableByteArray.limit()>
	//    5    9:istore_2        
		byte abyte0[] = parsablebytearray.data;
	//    6   10:aload_0         
	//    7   11:getfield        #146 <Field byte[] ParsableByteArray.data>
	//    8   14:astore          4
		int l;
		if(i + 2 <= j)
	//*   9   16:iload_1         
	//*  10   17:iconst_2        
	//*  11   18:iadd            
	//*  12   19:iload_2         
	//*  13   20:icmpgt          104
		{
			int k = i + 1;
	//   14   23:iload_1         
	//   15   24:iconst_1        
	//   16   25:iadd            
	//   17   26:istore_3        
			if(abyte0[i] == 47)
	//*  18   27:aload           4
	//*  19   29:iload_1         
	//*  20   30:baload          
	//*  21   31:bipush          47
	//*  22   33:icmpne          104
			{
				i = k + 1;
	//   23   36:iload_3         
	//   24   37:iconst_1        
	//   25   38:iadd            
	//   26   39:istore_1        
				if(abyte0[k] == 42)
					do
	//*  27   40:aload           4
	//*  28   42:iload_3         
	//*  29   43:baload          
	//*  30   44:bipush          42
	//*  31   46:icmpne          104
					{
						l = i + 1;
	//   32   49:iload_1         
	//   33   50:iconst_1        
	//   34   51:iadd            
	//   35   52:istore_3        
						if(l < j)
	//*  36   53:iload_3         
	//*  37   54:iload_2         
	//*  38   55:icmpge          92
						{
							if((char)abyte0[i] == '*' && (char)abyte0[l] == '/')
	//*  39   58:aload           4
	//*  40   60:iload_1         
	//*  41   61:baload          
	//*  42   62:int2char        
	//*  43   63:bipush          42
	//*  44   65:icmpne          87
	//*  45   68:aload           4
	//*  46   70:iload_3         
	//*  47   71:baload          
	//*  48   72:int2char        
	//*  49   73:bipush          47
	//*  50   75:icmpne          87
							{
								i = l + 1;
	//   51   78:iload_3         
	//   52   79:iconst_1        
	//   53   80:iadd            
	//   54   81:istore_1        
								j = i;
	//   55   82:iload_1         
	//   56   83:istore_2        
							} else
	//*  57   84:goto            49
							{
								i = l;
	//   58   87:iload_3         
	//   59   88:istore_1        
							}
						} else
	//*  60   89:goto            49
						{
							parsablebytearray.skipBytes(j - parsablebytearray.getPosition());
	//   61   92:aload_0         
	//   62   93:iload_2         
	//   63   94:aload_0         
	//   64   95:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//   65   98:isub            
	//   66   99:invokevirtual   #150 <Method void ParsableByteArray.skipBytes(int)>
							return true;
	//   67  102:iconst_1        
	//   68  103:ireturn         
						}
					} while(true);
			}
		}
		return false;
	//   69  104:iconst_0        
	//   70  105:ireturn         
	}

	private static boolean maybeSkipWhitespace(ParsableByteArray parsablebytearray)
	{
		switch(peekCharAtPosition(parsablebytearray, parsablebytearray.getPosition()))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//*   3    5:invokestatic    #155 <Method char peekCharAtPosition(ParsableByteArray, int)>
		{
	//*   4    8:lookupswitch    5: default 60
	//	               9: 62
	//	               10: 62
	//	               12: 62
	//	               13: 62
	//	               32: 62
		default:
			return false;
	//    5   60:iconst_0        
	//    6   61:ireturn         

		case 9: // '\t'
		case 10: // '\n'
		case 12: // '\f'
		case 13: // '\r'
		case 32: // ' '
			parsablebytearray.skipBytes(1);
	//    7   62:aload_0         
	//    8   63:iconst_1        
	//    9   64:invokevirtual   #150 <Method void ParsableByteArray.skipBytes(int)>
			break;
		}
		return true;
	//   10   67:iconst_1        
	//   11   68:ireturn         
	}

	private static String parseIdentifier(ParsableByteArray parsablebytearray, StringBuilder stringbuilder)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		stringbuilder.setLength(0);
	//    2    3:aload_1         
	//    3    4:iconst_0        
	//    4    5:invokevirtual   #160 <Method void StringBuilder.setLength(int)>
		int i = parsablebytearray.getPosition();
	//    5    8:aload_0         
	//    6    9:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//    7   12:istore_3        
		for(int j = parsablebytearray.limit(); i < j && !flag;)
	//*   8   13:aload_0         
	//*   9   14:invokevirtual   #142 <Method int ParsableByteArray.limit()>
	//*  10   17:istore          5
	//*  11   19:iload_3         
	//*  12   20:iload           5
	//*  13   22:icmpge          120
	//*  14   25:iload           4
	//*  15   27:ifne            120
		{
			char c = (char)parsablebytearray.data[i];
	//   16   30:aload_0         
	//   17   31:getfield        #146 <Field byte[] ParsableByteArray.data>
	//   18   34:iload_3         
	//   19   35:baload          
	//   20   36:int2char        
	//   21   37:istore_2        
			if((c < 'A' || c > 'Z') && (c < 'a' || c > 'z') && (c < '0' || c > '9') && c != '#' && c != '-' && c != '.' && c != '_')
	//*  22   38:iload_2         
	//*  23   39:bipush          65
	//*  24   41:icmplt          50
	//*  25   44:iload_2         
	//*  26   45:bipush          90
	//*  27   47:icmple          107
	//*  28   50:iload_2         
	//*  29   51:bipush          97
	//*  30   53:icmplt          62
	//*  31   56:iload_2         
	//*  32   57:bipush          122
	//*  33   59:icmple          107
	//*  34   62:iload_2         
	//*  35   63:bipush          48
	//*  36   65:icmplt          74
	//*  37   68:iload_2         
	//*  38   69:bipush          57
	//*  39   71:icmple          107
	//*  40   74:iload_2         
	//*  41   75:bipush          35
	//*  42   77:icmpeq          107
	//*  43   80:iload_2         
	//*  44   81:bipush          45
	//*  45   83:icmpeq          107
	//*  46   86:iload_2         
	//*  47   87:bipush          46
	//*  48   89:icmpeq          107
	//*  49   92:iload_2         
	//*  50   93:bipush          95
	//*  51   95:icmpne          101
	//*  52   98:goto            107
			{
				flag = true;
	//   53  101:iconst_1        
	//   54  102:istore          4
			} else
	//*  55  104:goto            19
			{
				i++;
	//   56  107:iload_3         
	//   57  108:iconst_1        
	//   58  109:iadd            
	//   59  110:istore_3        
				stringbuilder.append(c);
	//   60  111:aload_1         
	//   61  112:iload_2         
	//   62  113:invokevirtual   #164 <Method StringBuilder StringBuilder.append(char)>
	//   63  116:pop             
			}
		}

	//*  64  117:goto            19
		parsablebytearray.skipBytes(i - parsablebytearray.getPosition());
	//   65  120:aload_0         
	//   66  121:iload_3         
	//   67  122:aload_0         
	//   68  123:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//   69  126:isub            
	//   70  127:invokevirtual   #150 <Method void ParsableByteArray.skipBytes(int)>
		return stringbuilder.toString();
	//   71  130:aload_1         
	//   72  131:invokevirtual   #168 <Method String StringBuilder.toString()>
	//   73  134:areturn         
	}

	static String parseNextToken(ParsableByteArray parsablebytearray, StringBuilder stringbuilder)
	{
		skipWhitespaceAndComments(parsablebytearray);
	//    0    0:aload_0         
	//    1    1:invokestatic    #173 <Method void skipWhitespaceAndComments(ParsableByteArray)>
		if(parsablebytearray.bytesLeft() == 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #176 <Method int ParsableByteArray.bytesLeft()>
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		stringbuilder = ((StringBuilder) (parseIdentifier(parsablebytearray, stringbuilder)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #178 <Method String parseIdentifier(ParsableByteArray, StringBuilder)>
	//   10   18:astore_1        
		if(!"".equals(((Object) (stringbuilder))))
	//*  11   19:ldc1            #71  <String "">
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  14   25:ifne            30
		{
			return ((String) (stringbuilder));
	//   15   28:aload_1         
	//   16   29:areturn         
		} else
		{
			stringbuilder = new StringBuilder();
	//   17   30:new             #64  <Class StringBuilder>
	//   18   33:dup             
	//   19   34:invokespecial   #65  <Method void StringBuilder()>
	//   20   37:astore_1        
			stringbuilder.append("");
	//   21   38:aload_1         
	//   22   39:ldc1            #71  <String "">
	//   23   41:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   24   44:pop             
			stringbuilder.append((char)parsablebytearray.readUnsignedByte());
	//   25   45:aload_1         
	//   26   46:aload_0         
	//   27   47:invokevirtual   #184 <Method int ParsableByteArray.readUnsignedByte()>
	//   28   50:int2char        
	//   29   51:invokevirtual   #164 <Method StringBuilder StringBuilder.append(char)>
	//   30   54:pop             
			return stringbuilder.toString();
	//   31   55:aload_1         
	//   32   56:invokevirtual   #168 <Method String StringBuilder.toString()>
	//   33   59:areturn         
		}
	}

	private static String parsePropertyValue(ParsableByteArray parsablebytearray, StringBuilder stringbuilder)
	{
		StringBuilder stringbuilder1 = new StringBuilder();
	//    0    0:new             #64  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #65  <Method void StringBuilder()>
	//    3    7:astore          4
		boolean flag = false;
	//    4    9:iconst_0        
	//    5   10:istore_2        
		while(!flag) 
	//*   6   11:iload_2         
	//*   7   12:ifne            78
		{
			int i = parsablebytearray.getPosition();
	//    8   15:aload_0         
	//    9   16:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//   10   19:istore_3        
			String s = parseNextToken(parsablebytearray, stringbuilder);
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokestatic    #187 <Method String parseNextToken(ParsableByteArray, StringBuilder)>
	//   14   25:astore          5
			if(s == null)
	//*  15   27:aload           5
	//*  16   29:ifnonnull       34
				return null;
	//   17   32:aconst_null     
	//   18   33:areturn         
			if(!"}".equals(((Object) (s))) && !";".equals(((Object) (s))))
	//*  19   34:ldc1            #8   <String "}">
	//*  20   36:aload           5
	//*  21   38:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  22   41:ifne            68
	//*  23   44:ldc1            #189 <String ";">
	//*  24   46:aload           5
	//*  25   48:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  26   51:ifeq            57
	//*  27   54:goto            68
			{
				stringbuilder1.append(s);
	//   28   57:aload           4
	//   29   59:aload           5
	//   30   61:invokevirtual   #181 <Method StringBuilder StringBuilder.append(String)>
	//   31   64:pop             
			} else
	//*  32   65:goto            11
			{
				parsablebytearray.setPosition(i);
	//   33   68:aload_0         
	//   34   69:iload_3         
	//   35   70:invokevirtual   #192 <Method void ParsableByteArray.setPosition(int)>
				flag = true;
	//   36   73:iconst_1        
	//   37   74:istore_2        
			}
		}
	//*  38   75:goto            11
		return stringbuilder1.toString();
	//   39   78:aload           4
	//   40   80:invokevirtual   #168 <Method String StringBuilder.toString()>
	//   41   83:areturn         
	}

	private static String parseSelector(ParsableByteArray parsablebytearray, StringBuilder stringbuilder)
	{
		skipWhitespaceAndComments(parsablebytearray);
	//    0    0:aload_0         
	//    1    1:invokestatic    #173 <Method void skipWhitespaceAndComments(ParsableByteArray)>
		if(parsablebytearray.bytesLeft() < 5)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #176 <Method int ParsableByteArray.bytesLeft()>
	//*   4    8:iconst_5        
	//*   5    9:icmpge          14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		if(!"::cue".equals(((Object) (parsablebytearray.readString(5)))))
	//*   8   14:ldc1            #195 <String "::cue">
	//*   9   16:aload_0         
	//*  10   17:iconst_5        
	//*  11   18:invokevirtual   #198 <Method String ParsableByteArray.readString(int)>
	//*  12   21:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  13   24:ifne            29
			return null;
	//   14   27:aconst_null     
	//   15   28:areturn         
		int i = parsablebytearray.getPosition();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//   18   33:istore_2        
		String s = parseNextToken(parsablebytearray, stringbuilder);
	//   19   34:aload_0         
	//   20   35:aload_1         
	//   21   36:invokestatic    #187 <Method String parseNextToken(ParsableByteArray, StringBuilder)>
	//   22   39:astore_3        
		if(s == null)
	//*  23   40:aload_3         
	//*  24   41:ifnonnull       46
			return null;
	//   25   44:aconst_null     
	//   26   45:areturn         
		if("{".equals(((Object) (s))))
	//*  27   46:ldc1            #11  <String "{">
	//*  28   48:aload_3         
	//*  29   49:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  30   52:ifeq            63
		{
			parsablebytearray.setPosition(i);
	//   31   55:aload_0         
	//   32   56:iload_2         
	//   33   57:invokevirtual   #192 <Method void ParsableByteArray.setPosition(int)>
			return "";
	//   34   60:ldc1            #71  <String "">
	//   35   62:areturn         
		}
		if("(".equals(((Object) (s))))
	//*  36   63:ldc1            #200 <String "(">
	//*  37   65:aload_3         
	//*  38   66:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  39   69:ifeq            80
			s = readCueTarget(parsablebytearray);
	//   40   72:aload_0         
	//   41   73:invokestatic    #204 <Method String readCueTarget(ParsableByteArray)>
	//   42   76:astore_3        
		else
	//*  43   77:goto            82
			s = null;
	//   44   80:aconst_null     
	//   45   81:astore_3        
		parsablebytearray = ((ParsableByteArray) (parseNextToken(parsablebytearray, stringbuilder)));
	//   46   82:aload_0         
	//   47   83:aload_1         
	//   48   84:invokestatic    #187 <Method String parseNextToken(ParsableByteArray, StringBuilder)>
	//   49   87:astore_0        
		if(")".equals(((Object) (parsablebytearray))))
	//*  50   88:ldc1            #206 <String ")">
	//*  51   90:aload_0         
	//*  52   91:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  53   94:ifeq            105
		{
			if(parsablebytearray == null)
	//*  54   97:aload_0         
	//*  55   98:ifnonnull       103
				return null;
	//   56  101:aconst_null     
	//   57  102:areturn         
			else
				return s;
	//   58  103:aload_3         
	//   59  104:areturn         
		} else
		{
			return null;
	//   60  105:aconst_null     
	//   61  106:areturn         
		}
	}

	private static void parseStyleDeclaration(ParsableByteArray parsablebytearray, WebvttCssStyle webvttcssstyle, StringBuilder stringbuilder)
	{
label0:
		{
label1:
			{
				skipWhitespaceAndComments(parsablebytearray);
	//    0    0:aload_0         
	//    1    1:invokestatic    #173 <Method void skipWhitespaceAndComments(ParsableByteArray)>
				String s = parseIdentifier(parsablebytearray, stringbuilder);
	//    2    4:aload_0         
	//    3    5:aload_2         
	//    4    6:invokestatic    #178 <Method String parseIdentifier(ParsableByteArray, StringBuilder)>
	//    5    9:astore          4
				if("".equals(((Object) (s))))
	//*   6   11:ldc1            #71  <String "">
	//*   7   13:aload           4
	//*   8   15:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*   9   18:ifeq            22
					return;
	//   10   21:return          
				if(!":".equals(((Object) (parseNextToken(parsablebytearray, stringbuilder)))))
	//*  11   22:ldc1            #210 <String ":">
	//*  12   24:aload_0         
	//*  13   25:aload_2         
	//*  14   26:invokestatic    #187 <Method String parseNextToken(ParsableByteArray, StringBuilder)>
	//*  15   29:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  16   32:ifne            36
					return;
	//   17   35:return          
				skipWhitespaceAndComments(parsablebytearray);
	//   18   36:aload_0         
	//   19   37:invokestatic    #173 <Method void skipWhitespaceAndComments(ParsableByteArray)>
				String s1 = parsePropertyValue(parsablebytearray, stringbuilder);
	//   20   40:aload_0         
	//   21   41:aload_2         
	//   22   42:invokestatic    #212 <Method String parsePropertyValue(ParsableByteArray, StringBuilder)>
	//   23   45:astore          5
				if(s1 == null)
					break label0;
	//   24   47:aload           5
	//   25   49:ifnull          242
				if("".equals(((Object) (s1))))
	//*  26   52:ldc1            #71  <String "">
	//*  27   54:aload           5
	//*  28   56:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  29   59:ifeq            63
					return;
	//   30   62:return          
				int i = parsablebytearray.getPosition();
	//   31   63:aload_0         
	//   32   64:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//   33   67:istore_3        
				stringbuilder = ((StringBuilder) (parseNextToken(parsablebytearray, stringbuilder)));
	//   34   68:aload_0         
	//   35   69:aload_2         
	//   36   70:invokestatic    #187 <Method String parseNextToken(ParsableByteArray, StringBuilder)>
	//   37   73:astore_2        
				if(!";".equals(((Object) (stringbuilder))))
	//*  38   74:ldc1            #189 <String ";">
	//*  39   76:aload_2         
	//*  40   77:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  41   80:ifeq            86
	//*  42   83:goto            100
				{
					if(!"}".equals(((Object) (stringbuilder))))
						break label1;
	//   43   86:ldc1            #8   <String "}">
	//   44   88:aload_2         
	//   45   89:invokevirtual   #77  <Method boolean String.equals(Object)>
	//   46   92:ifeq            241
					parsablebytearray.setPosition(i);
	//   47   95:aload_0         
	//   48   96:iload_3         
	//   49   97:invokevirtual   #192 <Method void ParsableByteArray.setPosition(int)>
				}
				if("color".equals(((Object) (s))))
	//*  50  100:ldc1            #214 <String "color">
	//*  51  102:aload           4
	//*  52  104:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  53  107:ifeq            121
				{
					webvttcssstyle.setFontColor(ColorParser.parseCssColor(s1));
	//   54  110:aload_1         
	//   55  111:aload           5
	//   56  113:invokestatic    #220 <Method int ColorParser.parseCssColor(String)>
	//   57  116:invokevirtual   #224 <Method WebvttCssStyle WebvttCssStyle.setFontColor(int)>
	//   58  119:pop             
					return;
	//   59  120:return          
				}
				if("background-color".equals(((Object) (s))))
	//*  60  121:ldc1            #14  <String "background-color">
	//*  61  123:aload           4
	//*  62  125:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  63  128:ifeq            142
				{
					webvttcssstyle.setBackgroundColor(ColorParser.parseCssColor(s1));
	//   64  131:aload_1         
	//   65  132:aload           5
	//   66  134:invokestatic    #220 <Method int ColorParser.parseCssColor(String)>
	//   67  137:invokevirtual   #227 <Method WebvttCssStyle WebvttCssStyle.setBackgroundColor(int)>
	//   68  140:pop             
					return;
	//   69  141:return          
				}
				if("text-decoration".equals(((Object) (s))))
	//*  70  142:ldc1            #26  <String "text-decoration">
	//*  71  144:aload           4
	//*  72  146:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  73  149:ifeq            169
				{
					if("underline".equals(((Object) (s1))))
	//*  74  152:ldc1            #35  <String "underline">
	//*  75  154:aload           5
	//*  76  156:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  77  159:ifeq            240
					{
						webvttcssstyle.setUnderline(true);
	//   78  162:aload_1         
	//   79  163:iconst_1        
	//   80  164:invokevirtual   #231 <Method WebvttCssStyle WebvttCssStyle.setUnderline(boolean)>
	//   81  167:pop             
						return;
	//   82  168:return          
					}
				} else
				{
					if("font-family".equals(((Object) (s))))
	//*  83  169:ldc1            #17  <String "font-family">
	//*  84  171:aload           4
	//*  85  173:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  86  176:ifeq            187
					{
						webvttcssstyle.setFontFamily(s1);
	//   87  179:aload_1         
	//   88  180:aload           5
	//   89  182:invokevirtual   #235 <Method WebvttCssStyle WebvttCssStyle.setFontFamily(String)>
	//   90  185:pop             
						return;
	//   91  186:return          
					}
					if("font-weight".equals(((Object) (s))))
	//*  92  187:ldc1            #23  <String "font-weight">
	//*  93  189:aload           4
	//*  94  191:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  95  194:ifeq            214
					{
						if("bold".equals(((Object) (s1))))
	//*  96  197:ldc1            #29  <String "bold">
	//*  97  199:aload           5
	//*  98  201:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  99  204:ifeq            240
						{
							webvttcssstyle.setBold(true);
	//  100  207:aload_1         
	//  101  208:iconst_1        
	//  102  209:invokevirtual   #238 <Method WebvttCssStyle WebvttCssStyle.setBold(boolean)>
	//  103  212:pop             
							return;
	//  104  213:return          
						}
					} else
					if("font-style".equals(((Object) (s))) && "italic".equals(((Object) (s1))))
	//* 105  214:ldc1            #20  <String "font-style">
	//* 106  216:aload           4
	//* 107  218:invokevirtual   #77  <Method boolean String.equals(Object)>
	//* 108  221:ifeq            240
	//* 109  224:ldc1            #32  <String "italic">
	//* 110  226:aload           5
	//* 111  228:invokevirtual   #77  <Method boolean String.equals(Object)>
	//* 112  231:ifeq            240
						webvttcssstyle.setItalic(true);
	//  113  234:aload_1         
	//  114  235:iconst_1        
	//  115  236:invokevirtual   #241 <Method WebvttCssStyle WebvttCssStyle.setItalic(boolean)>
	//  116  239:pop             
				}
				return;
	//  117  240:return          
			}
			return;
	//  118  241:return          
		}
	//  119  242:return          
	}

	private static char peekCharAtPosition(ParsableByteArray parsablebytearray, int i)
	{
		return (char)parsablebytearray.data[i];
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field byte[] ParsableByteArray.data>
	//    2    4:iload_1         
	//    3    5:baload          
	//    4    6:int2char        
	//    5    7:ireturn         
	}

	private static String readCueTarget(ParsableByteArray parsablebytearray)
	{
		int i = parsablebytearray.getPosition();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//    2    4:istore_2        
		int j = parsablebytearray.limit();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #142 <Method int ParsableByteArray.limit()>
	//    5    9:istore_3        
		for(boolean flag = false; i < j && !flag; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_1        
	//*   8   12:iload_2         
	//*   9   13:iload_3         
	//*  10   14:icmpge          47
	//*  11   17:iload_1         
	//*  12   18:ifne            47
			if((char)parsablebytearray.data[i] == ')')
	//*  13   21:aload_0         
	//*  14   22:getfield        #146 <Field byte[] ParsableByteArray.data>
	//*  15   25:iload_2         
	//*  16   26:baload          
	//*  17   27:int2char        
	//*  18   28:bipush          41
	//*  19   30:icmpne          38
				flag = true;
	//   20   33:iconst_1        
	//   21   34:istore_1        
			else
	//*  22   35:goto            40
				flag = false;
	//   23   38:iconst_0        
	//   24   39:istore_1        

	//   25   40:iload_2         
	//   26   41:iconst_1        
	//   27   42:iadd            
	//   28   43:istore_2        
	//*  29   44:goto            12
		return parsablebytearray.readString(i - 1 - parsablebytearray.getPosition()).trim();
	//   30   47:aload_0         
	//   31   48:iload_2         
	//   32   49:iconst_1        
	//   33   50:isub            
	//   34   51:aload_0         
	//   35   52:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//   36   55:isub            
	//   37   56:invokevirtual   #198 <Method String ParsableByteArray.readString(int)>
	//   38   59:invokevirtual   #244 <Method String String.trim()>
	//   39   62:areturn         
	}

	static void skipStyleBlock(ParsableByteArray parsablebytearray)
	{
		while(!TextUtils.isEmpty(((CharSequence) (parsablebytearray.readLine())))) ;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #248 <Method String ParsableByteArray.readLine()>
	//    2    4:invokestatic    #254 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:ifeq            0
	//    4   10:return          
	}

	static void skipWhitespaceAndComments(ParsableByteArray parsablebytearray)
	{
		do
		{
			boolean flag = true;
	//    0    0:iconst_1        
	//    1    1:istore_1        
label0:
			do
			{
label1:
				{
					if(parsablebytearray.bytesLeft() <= 0 || !flag)
						break label1;
	//    2    2:aload_0         
	//    3    3:invokevirtual   #176 <Method int ParsableByteArray.bytesLeft()>
	//    4    6:ifle            35
	//    5    9:iload_1         
	//    6   10:ifeq            35
					if(maybeSkipWhitespace(parsablebytearray) || maybeSkipComment(parsablebytearray))
	//*   7   13:aload_0         
	//*   8   14:invokestatic    #256 <Method boolean maybeSkipWhitespace(ParsableByteArray)>
	//*   9   17:ifne            0
	//*  10   20:aload_0         
	//*  11   21:invokestatic    #258 <Method boolean maybeSkipComment(ParsableByteArray)>
	//*  12   24:ifeq            30
						break label0;
	//   13   27:goto            0
					flag = false;
	//   14   30:iconst_0        
	//   15   31:istore_1        
				}
			} while(true);
	//   16   32:goto            2
		} while(true);
	//   17   35:return          
	}

	public WebvttCssStyle parseBlock(ParsableByteArray parsablebytearray)
	{
		stringBuilder.setLength(0);
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field StringBuilder stringBuilder>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #160 <Method void StringBuilder.setLength(int)>
		int i = parsablebytearray.getPosition();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//    6   12:istore_2        
		skipStyleBlock(parsablebytearray);
	//    7   13:aload_1         
	//    8   14:invokestatic    #262 <Method void skipStyleBlock(ParsableByteArray)>
		styleInput.reset(parsablebytearray.data, parsablebytearray.getPosition());
	//    9   17:aload_0         
	//   10   18:getfield        #62  <Field ParsableByteArray styleInput>
	//   11   21:aload_1         
	//   12   22:getfield        #146 <Field byte[] ParsableByteArray.data>
	//   13   25:aload_1         
	//   14   26:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//   15   29:invokevirtual   #266 <Method void ParsableByteArray.reset(byte[], int)>
		styleInput.setPosition(i);
	//   16   32:aload_0         
	//   17   33:getfield        #62  <Field ParsableByteArray styleInput>
	//   18   36:iload_2         
	//   19   37:invokevirtual   #192 <Method void ParsableByteArray.setPosition(int)>
		parsablebytearray = ((ParsableByteArray) (parseSelector(styleInput, stringBuilder)));
	//   20   40:aload_0         
	//   21   41:getfield        #62  <Field ParsableByteArray styleInput>
	//   22   44:aload_0         
	//   23   45:getfield        #67  <Field StringBuilder stringBuilder>
	//   24   48:invokestatic    #268 <Method String parseSelector(ParsableByteArray, StringBuilder)>
	//   25   51:astore_1        
		WebvttCssStyle webvttcssstyle = null;
	//   26   52:aconst_null     
	//   27   53:astore          4
		if(parsablebytearray != null)
	//*  28   55:aload_1         
	//*  29   56:ifnull          191
		{
			if(!"{".equals(((Object) (parseNextToken(styleInput, stringBuilder)))))
	//*  30   59:ldc1            #11  <String "{">
	//*  31   61:aload_0         
	//*  32   62:getfield        #62  <Field ParsableByteArray styleInput>
	//*  33   65:aload_0         
	//*  34   66:getfield        #67  <Field StringBuilder stringBuilder>
	//*  35   69:invokestatic    #187 <Method String parseNextToken(ParsableByteArray, StringBuilder)>
	//*  36   72:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  37   75:ifne            80
				return null;
	//   38   78:aconst_null     
	//   39   79:areturn         
			WebvttCssStyle webvttcssstyle1 = new WebvttCssStyle();
	//   40   80:new             #100 <Class WebvttCssStyle>
	//   41   83:dup             
	//   42   84:invokespecial   #269 <Method void WebvttCssStyle()>
	//   43   87:astore          5
			applySelectorToStyle(webvttcssstyle1, ((String) (parsablebytearray)));
	//   44   89:aload_0         
	//   45   90:aload           5
	//   46   92:aload_1         
	//   47   93:invokespecial   #271 <Method void applySelectorToStyle(WebvttCssStyle, String)>
			parsablebytearray = null;
	//   48   96:aconst_null     
	//   49   97:astore_1        
			boolean flag = false;
	//   50   98:iconst_0        
	//   51   99:istore_2        
			do
			{
				if(flag)
					break;
	//   52  100:iload_2         
	//   53  101:ifne            175
				int j = styleInput.getPosition();
	//   54  104:aload_0         
	//   55  105:getfield        #62  <Field ParsableByteArray styleInput>
	//   56  108:invokevirtual   #139 <Method int ParsableByteArray.getPosition()>
	//   57  111:istore_3        
				parsablebytearray = ((ParsableByteArray) (parseNextToken(styleInput, stringBuilder)));
	//   58  112:aload_0         
	//   59  113:getfield        #62  <Field ParsableByteArray styleInput>
	//   60  116:aload_0         
	//   61  117:getfield        #67  <Field StringBuilder stringBuilder>
	//   62  120:invokestatic    #187 <Method String parseNextToken(ParsableByteArray, StringBuilder)>
	//   63  123:astore_1        
				if(parsablebytearray != null && !"}".equals(((Object) (parsablebytearray))))
	//*  64  124:aload_1         
	//*  65  125:ifnull          145
	//*  66  128:ldc1            #8   <String "}">
	//*  67  130:aload_1         
	//*  68  131:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  69  134:ifeq            140
	//*  70  137:goto            145
					flag = false;
	//   71  140:iconst_0        
	//   72  141:istore_2        
				else
	//*  73  142:goto            147
					flag = true;
	//   74  145:iconst_1        
	//   75  146:istore_2        
				if(!flag)
	//*  76  147:iload_2         
	//*  77  148:ifne            172
				{
					styleInput.setPosition(j);
	//   78  151:aload_0         
	//   79  152:getfield        #62  <Field ParsableByteArray styleInput>
	//   80  155:iload_3         
	//   81  156:invokevirtual   #192 <Method void ParsableByteArray.setPosition(int)>
					parseStyleDeclaration(styleInput, webvttcssstyle1, stringBuilder);
	//   82  159:aload_0         
	//   83  160:getfield        #62  <Field ParsableByteArray styleInput>
	//   84  163:aload           5
	//   85  165:aload_0         
	//   86  166:getfield        #67  <Field StringBuilder stringBuilder>
	//   87  169:invokestatic    #273 <Method void parseStyleDeclaration(ParsableByteArray, WebvttCssStyle, StringBuilder)>
				}
			} while(true);
	//   88  172:goto            100
			if("}".equals(((Object) (parsablebytearray))))
	//*  89  175:ldc1            #8   <String "}">
	//*  90  177:aload_1         
	//*  91  178:invokevirtual   #77  <Method boolean String.equals(Object)>
	//*  92  181:ifeq            188
				webvttcssstyle = webvttcssstyle1;
	//   93  184:aload           5
	//   94  186:astore          4
			return webvttcssstyle;
	//   95  188:aload           4
	//   96  190:areturn         
		} else
		{
			return null;
	//   97  191:aconst_null     
	//   98  192:areturn         
		}
	}

	private static final String BLOCK_END = "}";
	private static final String BLOCK_START = "{";
	private static final String PROPERTY_BGCOLOR = "background-color";
	private static final String PROPERTY_FONT_FAMILY = "font-family";
	private static final String PROPERTY_FONT_STYLE = "font-style";
	private static final String PROPERTY_FONT_WEIGHT = "font-weight";
	private static final String PROPERTY_TEXT_DECORATION = "text-decoration";
	private static final String VALUE_BOLD = "bold";
	private static final String VALUE_ITALIC = "italic";
	private static final String VALUE_UNDERLINE = "underline";
	private static final Pattern VOICE_NAME_PATTERN = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
	private final StringBuilder stringBuilder = new StringBuilder();
	private final ParsableByteArray styleInput = new ParsableByteArray();

	static 
	{
	//    0    0:ldc1            #45  <String "\\[voice=\"([^\"]*)\"\\]">
	//    1    2:invokestatic    #51  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #53  <Field Pattern VOICE_NAME_PATTERN>
	//*   3    8:return          
	}
}
