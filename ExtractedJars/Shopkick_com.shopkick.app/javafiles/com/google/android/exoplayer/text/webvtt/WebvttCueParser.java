// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.webvtt;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.Log;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer.text.webvtt:
//			WebvttParserUtil

public final class WebvttCueParser
{
	private static final class StartTag
	{

		public final String name;
		public final int position;

		public StartTag(String s, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			position = i;
		//    2    4:aload_0         
		//    3    5:iload_2         
		//    4    6:putfield        #18  <Field int position>
			name = s;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #20  <Field String name>
		//    8   14:return          
		}
	}


	public WebvttCueParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #92  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #94  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #95  <Method void StringBuilder()>
	//    6   12:putfield        #97  <Field StringBuilder textBuilder>
	//    7   15:return          
	}

	private static void applyEntity(String s, SpannableStringBuilder spannablestringbuilder)
	{
		int i;
label0:
		{
			i = s.hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int String.hashCode()>
	//    2    4:istore_2        
			if(i != 3309)
	//*   3    5:iload_2         
	//*   4    6:sipush          3309
	//*   5    9:icmpeq          76
			{
				if(i != 3464)
	//*   6   12:iload_2         
	//*   7   13:sipush          3464
	//*   8   16:icmpeq          62
				{
					if(i != 0x179c4)
	//*   9   19:iload_2         
	//*  10   20:ldc1            #106 <Int 0x179c4>
	//*  11   22:icmpeq          48
					{
						if(i == 0x337f11 && s.equals("nbsp"))
	//*  12   25:iload_2         
	//*  13   26:ldc1            #107 <Int 0x337f11>
	//*  14   28:icmpeq          34
	//*  15   31:goto            90
	//*  16   34:aload_0         
	//*  17   35:ldc1            #37  <String "nbsp">
	//*  18   37:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  19   40:ifeq            90
						{
							i = 2;
	//   20   43:iconst_2        
	//   21   44:istore_2        
							break label0;
	//   22   45:goto            92
						}
					} else
					if(s.equals("amp"))
	//*  23   48:aload_0         
	//*  24   49:ldc1            #28  <String "amp">
	//*  25   51:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  26   54:ifeq            90
					{
						i = 3;
	//   27   57:iconst_3        
	//   28   58:istore_2        
						break label0;
	//   29   59:goto            92
					}
				} else
				if(s.equals("lt"))
	//*  30   62:aload_0         
	//*  31   63:ldc1            #34  <String "lt">
	//*  32   65:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  33   68:ifeq            90
				{
					i = 0;
	//   34   71:iconst_0        
	//   35   72:istore_2        
					break label0;
	//   36   73:goto            92
				}
			} else
			if(s.equals("gt"))
	//*  37   76:aload_0         
	//*  38   77:ldc1            #31  <String "gt">
	//*  39   79:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  40   82:ifeq            90
			{
				i = 1;
	//   41   85:iconst_1        
	//   42   86:istore_2        
				break label0;
	//   43   87:goto            92
			}
			i = -1;
	//   44   90:iconst_m1       
	//   45   91:istore_2        
		}
		switch(i)
	//*  46   92:iload_2         
		{
	//*  47   93:tableswitch     0 3: default 124
	//	               0 187
	//	               1 179
	//	               2 171
	//	               3 163
		default:
			spannablestringbuilder = ((SpannableStringBuilder) (new StringBuilder()));
	//   48  124:new             #94  <Class StringBuilder>
	//   49  127:dup             
	//   50  128:invokespecial   #95  <Method void StringBuilder()>
	//   51  131:astore_1        
			((StringBuilder) (spannablestringbuilder)).append("ignoring unsupported entity: '&");
	//   52  132:aload_1         
	//   53  133:ldc1            #113 <String "ignoring unsupported entity: '&">
	//   54  135:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   55  138:pop             
			((StringBuilder) (spannablestringbuilder)).append(s);
	//   56  139:aload_1         
	//   57  140:aload_0         
	//   58  141:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   59  144:pop             
			((StringBuilder) (spannablestringbuilder)).append(";'");
	//   60  145:aload_1         
	//   61  146:ldc1            #119 <String ";'">
	//   62  148:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   63  151:pop             
			Log.w("WebvttCueParser", ((StringBuilder) (spannablestringbuilder)).toString());
	//   64  152:ldc1            #48  <String "WebvttCueParser">
	//   65  154:aload_1         
	//   66  155:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   67  158:invokestatic    #129 <Method int Log.w(String, String)>
	//   68  161:pop             
			return;
	//   69  162:return          

		case 3: // '\003'
			spannablestringbuilder.append('&');
	//   70  163:aload_1         
	//   71  164:bipush          38
	//   72  166:invokevirtual   #134 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   73  169:pop             
			return;
	//   74  170:return          

		case 2: // '\002'
			spannablestringbuilder.append(' ');
	//   75  171:aload_1         
	//   76  172:bipush          32
	//   77  174:invokevirtual   #134 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   78  177:pop             
			return;
	//   79  178:return          

		case 1: // '\001'
			spannablestringbuilder.append('>');
	//   80  179:aload_1         
	//   81  180:bipush          62
	//   82  182:invokevirtual   #134 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   83  185:pop             
			return;
	//   84  186:return          

		case 0: // '\0'
			spannablestringbuilder.append('<');
	//   85  187:aload_1         
	//   86  188:bipush          60
	//   87  190:invokevirtual   #134 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   88  193:pop             
			return;
	//   89  194:return          
		}
	}

	private static void applySpansForTag(StartTag starttag, SpannableStringBuilder spannablestringbuilder)
	{
		int i;
label0:
		{
			String s = starttag.name;
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field String WebvttCueParser$StartTag.name>
	//    2    4:astore_3        
			i = s.hashCode();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #105 <Method int String.hashCode()>
	//    5    9:istore_2        
			if(i != 98)
	//*   6   10:iload_2         
	//*   7   11:bipush          98
	//*   8   13:icmpeq          59
			{
				if(i != 105)
	//*   9   16:iload_2         
	//*  10   17:bipush          105
	//*  11   19:icmpeq          45
				{
					if(i == 117 && s.equals("u"))
	//*  12   22:iload_2         
	//*  13   23:bipush          117
	//*  14   25:icmpeq          31
	//*  15   28:goto            73
	//*  16   31:aload_3         
	//*  17   32:ldc1            #63  <String "u">
	//*  18   34:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  19   37:ifeq            73
					{
						i = 2;
	//   20   40:iconst_2        
	//   21   41:istore_2        
						break label0;
	//   22   42:goto            75
					}
				} else
				if(s.equals("i"))
	//*  23   45:aload_3         
	//*  24   46:ldc1            #57  <String "i">
	//*  25   48:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  26   51:ifeq            73
				{
					i = 1;
	//   27   54:iconst_1        
	//   28   55:istore_2        
					break label0;
	//   29   56:goto            75
				}
			} else
			if(s.equals("b"))
	//*  30   59:aload_3         
	//*  31   60:ldc1            #51  <String "b">
	//*  32   62:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  33   65:ifeq            73
			{
				i = 0;
	//   34   68:iconst_0        
	//   35   69:istore_2        
				break label0;
	//   36   70:goto            75
			}
			i = -1;
	//   37   73:iconst_m1       
	//   38   74:istore_2        
		}
		switch(i)
	//*  39   75:iload_2         
		{
	//*  40   76:tableswitch     0 2: default 104
	//	               0 150
	//	               1 127
	//	               2 105
		default:
			return;
	//   41  104:return          

		case 2: // '\002'
			spannablestringbuilder.setSpan(((Object) (new UnderlineSpan())), starttag.position, spannablestringbuilder.length(), 33);
	//   42  105:aload_1         
	//   43  106:new             #141 <Class UnderlineSpan>
	//   44  109:dup             
	//   45  110:invokespecial   #142 <Method void UnderlineSpan()>
	//   46  113:aload_0         
	//   47  114:getfield        #145 <Field int WebvttCueParser$StartTag.position>
	//   48  117:aload_1         
	//   49  118:invokevirtual   #148 <Method int SpannableStringBuilder.length()>
	//   50  121:bipush          33
	//   51  123:invokevirtual   #152 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//   52  126:return          

		case 1: // '\001'
			spannablestringbuilder.setSpan(((Object) (new StyleSpan(2))), starttag.position, spannablestringbuilder.length(), 33);
	//   53  127:aload_1         
	//   54  128:new             #154 <Class StyleSpan>
	//   55  131:dup             
	//   56  132:iconst_2        
	//   57  133:invokespecial   #157 <Method void StyleSpan(int)>
	//   58  136:aload_0         
	//   59  137:getfield        #145 <Field int WebvttCueParser$StartTag.position>
	//   60  140:aload_1         
	//   61  141:invokevirtual   #148 <Method int SpannableStringBuilder.length()>
	//   62  144:bipush          33
	//   63  146:invokevirtual   #152 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//   64  149:return          

		case 0: // '\0'
			spannablestringbuilder.setSpan(((Object) (new StyleSpan(1))), starttag.position, spannablestringbuilder.length(), 33);
	//   65  150:aload_1         
	//   66  151:new             #154 <Class StyleSpan>
	//   67  154:dup             
	//   68  155:iconst_1        
	//   69  156:invokespecial   #157 <Method void StyleSpan(int)>
	//   70  159:aload_0         
	//   71  160:getfield        #145 <Field int WebvttCueParser$StartTag.position>
	//   72  163:aload_1         
	//   73  164:invokevirtual   #148 <Method int SpannableStringBuilder.length()>
	//   74  167:bipush          33
	//   75  169:invokevirtual   #152 <Method void SpannableStringBuilder.setSpan(Object, int, int, int)>
			return;
	//   76  172:return          
		}
	}

	private static int findEndOfTag(String s, int i)
	{
		i = s.indexOf('>', i);
	//    0    0:aload_0         
	//    1    1:bipush          62
	//    2    3:iload_1         
	//    3    4:invokevirtual   #163 <Method int String.indexOf(int, int)>
	//    4    7:istore_1        
		if(i == -1)
	//*   5    8:iload_1         
	//*   6    9:iconst_m1       
	//*   7   10:icmpne          18
			return s.length();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #164 <Method int String.length()>
	//   10   17:ireturn         
		else
			return i + 1;
	//   11   18:iload_1         
	//   12   19:iconst_1        
	//   13   20:iadd            
	//   14   21:ireturn         
	}

	public static Matcher findNextCueHeader(ParsableByteArray parsablebytearray)
	{
		do
		{
			Object obj = ((Object) (parsablebytearray.readLine()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #171 <Method String ParsableByteArray.readLine()>
	//    2    4:astore_1        
			if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          58
			{
				if(COMMENT.matcher(((CharSequence) (obj))).matches())
	//*   5    9:getstatic       #84  <Field Pattern COMMENT>
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #175 <Method Matcher Pattern.matcher(CharSequence)>
	//*   8   16:invokevirtual   #181 <Method boolean Matcher.matches()>
	//*   9   19:ifeq            41
				{
					do
						obj = ((Object) (parsablebytearray.readLine()));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #171 <Method String ParsableByteArray.readLine()>
	//   12   26:astore_1        
					while(obj != null && !((String) (obj)).isEmpty());
	//   13   27:aload_1         
	//   14   28:ifnull          0
	//   15   31:aload_1         
	//   16   32:invokevirtual   #184 <Method boolean String.isEmpty()>
	//   17   35:ifne            0
				} else
	//*  18   38:goto            22
				{
					obj = ((Object) (CUE_HEADER_PATTERN.matcher(((CharSequence) (obj)))));
	//   19   41:getstatic       #80  <Field Pattern CUE_HEADER_PATTERN>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #175 <Method Matcher Pattern.matcher(CharSequence)>
	//   22   48:astore_1        
					if(((Matcher) (obj)).matches())
	//*  23   49:aload_1         
	//*  24   50:invokevirtual   #181 <Method boolean Matcher.matches()>
	//*  25   53:ifeq            0
						return ((Matcher) (obj));
	//   26   56:aload_1         
	//   27   57:areturn         
				}
			} else
			{
				return null;
	//   28   58:aconst_null     
	//   29   59:areturn         
			}
		} while(true);
	}

	private static boolean isSupportedTag(String s)
	{
		byte byte0;
label0:
		{
			switch(s.hashCode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method int String.hashCode()>
			{
			default:
				break;

	//*   2    4:lookupswitch    6: default 64
	//	               98: 137
	//	               99: 123
	//	               105: 109
	//	               117: 95
	//	               118: 81
	//	               3314158: 67
	//*   3   64:goto            151
			case 3314158: 
				if(s.equals("lang"))
	//*   4   67:aload_0         
	//*   5   68:ldc1            #60  <String "lang">
	//*   6   70:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*   7   73:ifeq            151
				{
					byte0 = 3;
	//    8   76:iconst_3        
	//    9   77:istore_1        
					break label0;
	//   10   78:goto            153
				}
				break;

			case 118: // 'v'
				if(!s.equals("v"))
					break;
	//   11   81:aload_0         
	//   12   82:ldc1            #66  <String "v">
	//   13   84:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   14   87:ifeq            151
				byte0 = 5;
	//   15   90:iconst_5        
	//   16   91:istore_1        
				break label0;
	//   17   92:goto            153

			case 117: // 'u'
				if(!s.equals("u"))
					break;
	//   18   95:aload_0         
	//   19   96:ldc1            #63  <String "u">
	//   20   98:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   21  101:ifeq            151
				byte0 = 4;
	//   22  104:iconst_4        
	//   23  105:istore_1        
				break label0;
	//   24  106:goto            153

			case 105: // 'i'
				if(!s.equals("i"))
					break;
	//   25  109:aload_0         
	//   26  110:ldc1            #57  <String "i">
	//   27  112:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   28  115:ifeq            151
				byte0 = 2;
	//   29  118:iconst_2        
	//   30  119:istore_1        
				break label0;
	//   31  120:goto            153

			case 99: // 'c'
				if(!s.equals("c"))
					break;
	//   32  123:aload_0         
	//   33  124:ldc1            #54  <String "c">
	//   34  126:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   35  129:ifeq            151
				byte0 = 1;
	//   36  132:iconst_1        
	//   37  133:istore_1        
				break label0;
	//   38  134:goto            153

			case 98: // 'b'
				if(!s.equals("b"))
					break;
	//   39  137:aload_0         
	//   40  138:ldc1            #51  <String "b">
	//   41  140:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   42  143:ifeq            151
				byte0 = 0;
	//   43  146:iconst_0        
	//   44  147:istore_1        
				break label0;
	//   45  148:goto            153
			}
			byte0 = -1;
	//   46  151:iconst_m1       
	//   47  152:istore_1        
		}
		switch(byte0)
	//*  48  153:iload_1         
		{
	//*  49  154:tableswitch     0 5: default 192
	//	               0 194
	//	               1 194
	//	               2 194
	//	               3 194
	//	               4 194
	//	               5 194
		default:
			return false;
	//   50  192:iconst_0        
	//   51  193:ireturn         

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
			return true;
	//   52  194:iconst_1        
	//   53  195:ireturn         
		}
	}

	private static boolean parseCue(Matcher matcher, ParsableByteArray parsablebytearray, WebvttCue.Builder builder, StringBuilder stringbuilder)
	{
		try
		{
			builder.setStartTime(WebvttParserUtil.parseTimestampUs(matcher.group(1))).setEndTime(WebvttParserUtil.parseTimestampUs(matcher.group(2)));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #194 <Method String Matcher.group(int)>
	//    4    6:invokestatic    #200 <Method long WebvttParserUtil.parseTimestampUs(String)>
	//    5    9:invokevirtual   #206 <Method WebvttCue$Builder WebvttCue$Builder.setStartTime(long)>
	//    6   12:aload_0         
	//    7   13:iconst_2        
	//    8   14:invokevirtual   #194 <Method String Matcher.group(int)>
	//    9   17:invokestatic    #200 <Method long WebvttParserUtil.parseTimestampUs(String)>
	//   10   20:invokevirtual   #209 <Method WebvttCue$Builder WebvttCue$Builder.setEndTime(long)>
	//   11   23:pop             
		}
	//*  12   24:aload_0         
	//*  13   25:iconst_3        
	//*  14   26:invokevirtual   #194 <Method String Matcher.group(int)>
	//*  15   29:aload_2         
	//*  16   30:invokestatic    #213 <Method void parseCueSettingsList(String, WebvttCue$Builder)>
	//*  17   33:aload_3         
	//*  18   34:iconst_0        
	//*  19   35:invokevirtual   #216 <Method void StringBuilder.setLength(int)>
	//*  20   38:aload_1         
	//*  21   39:invokevirtual   #171 <Method String ParsableByteArray.readLine()>
	//*  22   42:astore_0        
	//*  23   43:aload_0         
	//*  24   44:ifnull          80
	//*  25   47:aload_0         
	//*  26   48:invokevirtual   #184 <Method boolean String.isEmpty()>
	//*  27   51:ifne            80
	//*  28   54:aload_3         
	//*  29   55:invokevirtual   #217 <Method int StringBuilder.length()>
	//*  30   58:ifle            68
	//*  31   61:aload_3         
	//*  32   62:ldc1            #219 <String "\n">
	//*  33   64:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  34   67:pop             
	//*  35   68:aload_3         
	//*  36   69:aload_0         
	//*  37   70:invokevirtual   #222 <Method String String.trim()>
	//*  38   73:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  39   76:pop             
	//*  40   77:goto            38
	//*  41   80:aload_3         
	//*  42   81:invokevirtual   #123 <Method String StringBuilder.toString()>
	//*  43   84:aload_2         
	//*  44   85:invokestatic    #225 <Method void parseCueText(String, WebvttCue$Builder)>
	//*  45   88:iconst_1        
	//*  46   89:ireturn         
	//*  47   90:new             #94  <Class StringBuilder>
	//*  48   93:dup             
	//*  49   94:invokespecial   #95  <Method void StringBuilder()>
	//*  50   97:astore_1        
	//*  51   98:aload_1         
	//*  52   99:ldc1            #227 <String "Skipping cue with bad header: ">
	//*  53  101:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  54  104:pop             
	//*  55  105:aload_1         
	//*  56  106:aload_0         
	//*  57  107:invokevirtual   #229 <Method String Matcher.group()>
	//*  58  110:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  59  113:pop             
	//*  60  114:ldc1            #48  <String "WebvttCueParser">
	//*  61  116:aload_1         
	//*  62  117:invokevirtual   #123 <Method String StringBuilder.toString()>
	//*  63  120:invokestatic    #129 <Method int Log.w(String, String)>
	//*  64  123:pop             
	//*  65  124:iconst_0        
	//*  66  125:ireturn         
		// Misplaced declaration of an exception variable
		catch(ParsableByteArray parsablebytearray)
		{
			parsablebytearray = ((ParsableByteArray) (new StringBuilder()));
			((StringBuilder) (parsablebytearray)).append("Skipping cue with bad header: ");
			((StringBuilder) (parsablebytearray)).append(matcher.group());
			Log.w("WebvttCueParser", ((StringBuilder) (parsablebytearray)).toString());
			return false;
		}
		parseCueSettingsList(matcher.group(3), builder);
		stringbuilder.setLength(0);
		do
		{
			matcher = ((Matcher) (parsablebytearray.readLine()));
			if(matcher != null && !((String) (matcher)).isEmpty())
			{
				if(stringbuilder.length() > 0)
					stringbuilder.append("\n");
				stringbuilder.append(((String) (matcher)).trim());
			} else
			{
				parseCueText(stringbuilder.toString(), builder);
				return true;
			}
		} while(true);
	//*  67  126:astore_1        
	//*  68  127:goto            90
	}

	static void parseCueSettingsList(String s, WebvttCue.Builder builder)
	{
		s = ((String) (CUE_SETTING_PATTERN.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #88  <Field Pattern CUE_SETTING_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #175 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_0        
_L2:
		Object obj;
		String s1;
		if(!((Matcher) (s)).find())
			break; /* Loop/switch isn't completed */
	//    4    8:aload_0         
	//    5    9:invokevirtual   #232 <Method boolean Matcher.find()>
	//    6   12:ifeq            196
		obj = ((Object) (((Matcher) (s)).group(1)));
	//    7   15:aload_0         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #194 <Method String Matcher.group(int)>
	//   10   20:astore_2        
		s1 = ((Matcher) (s)).group(2);
	//   11   21:aload_0         
	//   12   22:iconst_2        
	//   13   23:invokevirtual   #194 <Method String Matcher.group(int)>
	//   14   26:astore_3        
		if("line".equals(obj))
	//*  15   27:ldc1            #234 <String "line">
	//*  16   29:aload_2         
	//*  17   30:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  18   33:ifeq            44
		{
			parseLineAttribute(s1, builder);
	//   19   36:aload_3         
	//   20   37:aload_1         
	//   21   38:invokestatic    #237 <Method void parseLineAttribute(String, WebvttCue$Builder)>
			continue; /* Loop/switch isn't completed */
	//   22   41:goto            8
		}
		if("align".equals(obj))
	//*  23   44:ldc1            #239 <String "align">
	//*  24   46:aload_2         
	//*  25   47:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  26   50:ifeq            65
		{
			builder.setTextAlignment(parseTextAlignment(s1));
	//   27   53:aload_1         
	//   28   54:aload_3         
	//   29   55:invokestatic    #243 <Method android.text.Layout$Alignment parseTextAlignment(String)>
	//   30   58:invokevirtual   #247 <Method WebvttCue$Builder WebvttCue$Builder.setTextAlignment(android.text.Layout$Alignment)>
	//   31   61:pop             
			continue; /* Loop/switch isn't completed */
	//   32   62:goto            8
		}
		if("position".equals(obj))
	//*  33   65:ldc1            #248 <String "position">
	//*  34   67:aload_2         
	//*  35   68:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  36   71:ifeq            82
		{
			parsePositionAttribute(s1, builder);
	//   37   74:aload_3         
	//   38   75:aload_1         
	//   39   76:invokestatic    #251 <Method void parsePositionAttribute(String, WebvttCue$Builder)>
			continue; /* Loop/switch isn't completed */
	//   40   79:goto            8
		}
		if("size".equals(obj))
	//*  41   82:ldc1            #253 <String "size">
	//*  42   84:aload_2         
	//*  43   85:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  44   88:ifeq            103
		{
			builder.setWidth(WebvttParserUtil.parsePercentage(s1));
	//   45   91:aload_1         
	//   46   92:aload_3         
	//   47   93:invokestatic    #257 <Method float WebvttParserUtil.parsePercentage(String)>
	//   48   96:invokevirtual   #261 <Method WebvttCue$Builder WebvttCue$Builder.setWidth(float)>
	//   49   99:pop             
			continue; /* Loop/switch isn't completed */
	//   50  100:goto            8
		}
		try
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   51  103:new             #94  <Class StringBuilder>
	//   52  106:dup             
	//   53  107:invokespecial   #95  <Method void StringBuilder()>
	//   54  110:astore          4
			stringbuilder.append("Unknown cue setting ");
	//   55  112:aload           4
	//   56  114:ldc2            #263 <String "Unknown cue setting ">
	//   57  117:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
			stringbuilder.append(((String) (obj)));
	//   59  121:aload           4
	//   60  123:aload_2         
	//   61  124:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   62  127:pop             
			stringbuilder.append(":");
	//   63  128:aload           4
	//   64  130:ldc2            #265 <String ":">
	//   65  133:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   66  136:pop             
			stringbuilder.append(s1);
	//   67  137:aload           4
	//   68  139:aload_3         
	//   69  140:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   70  143:pop             
			Log.w("WebvttCueParser", stringbuilder.toString());
	//   71  144:ldc1            #48  <String "WebvttCueParser">
	//   72  146:aload           4
	//   73  148:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   74  151:invokestatic    #129 <Method int Log.w(String, String)>
	//   75  154:pop             
		}
	//*  76  155:goto            8
	//*  77  158:new             #94  <Class StringBuilder>
	//*  78  161:dup             
	//*  79  162:invokespecial   #95  <Method void StringBuilder()>
	//*  80  165:astore_2        
	//*  81  166:aload_2         
	//*  82  167:ldc2            #267 <String "Skipping bad cue setting: ">
	//*  83  170:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  84  173:pop             
	//*  85  174:aload_2         
	//*  86  175:aload_0         
	//*  87  176:invokevirtual   #229 <Method String Matcher.group()>
	//*  88  179:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//*  89  182:pop             
	//*  90  183:ldc1            #48  <String "WebvttCueParser">
	//*  91  185:aload_2         
	//*  92  186:invokevirtual   #123 <Method String StringBuilder.toString()>
	//*  93  189:invokestatic    #129 <Method int Log.w(String, String)>
	//*  94  192:pop             
	//*  95  193:goto            8
	//*  96  196:return          
		// Misplaced declaration of an exception variable
		catch(NumberFormatException numberformatexception)
		{
			obj = ((Object) (new StringBuilder()));
			((StringBuilder) (obj)).append("Skipping bad cue setting: ");
			((StringBuilder) (obj)).append(((Matcher) (s)).group());
			Log.w("WebvttCueParser", ((StringBuilder) (obj)).toString());
		}
		if(true) goto _L2; else goto _L1
_L1:
		NumberFormatException numberformatexception;
	//*  97  197:astore_2        
	//*  98  198:goto            158
	}

	static void parseCueText(String s, WebvttCue.Builder builder)
	{
		SpannableStringBuilder spannablestringbuilder = new SpannableStringBuilder();
	//    0    0:new             #131 <Class SpannableStringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #268 <Method void SpannableStringBuilder()>
	//    3    7:astore          9
		Stack stack = new Stack();
	//    4    9:new             #270 <Class Stack>
	//    5   12:dup             
	//    6   13:invokespecial   #271 <Method void Stack()>
	//    7   16:astore          10
		for(int i = 0; i < s.length();)
	//*   8   18:iconst_0        
	//*   9   19:istore_3        
	//*  10   20:iload_3         
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #164 <Method int String.length()>
	//*  13   25:icmpge          388
		{
			char c = s.charAt(i);
	//   14   28:aload_0         
	//   15   29:iload_3         
	//   16   30:invokevirtual   #275 <Method char String.charAt(int)>
	//   17   33:istore_2        
			if(c != '&')
	//*  18   34:iload_2         
	//*  19   35:bipush          38
	//*  20   37:icmpeq          286
			{
				if(c != '<')
	//*  21   40:iload_2         
	//*  22   41:bipush          60
	//*  23   43:icmpeq          60
				{
					spannablestringbuilder.append(c);
	//   24   46:aload           9
	//   25   48:iload_2         
	//   26   49:invokevirtual   #134 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//   27   52:pop             
					i++;
	//   28   53:iload_3         
	//   29   54:iconst_1        
	//   30   55:iadd            
	//   31   56:istore_3        
				} else
	//*  32   57:goto            20
				{
					int k = i + 1;
	//   33   60:iload_3         
	//   34   61:iconst_1        
	//   35   62:iadd            
	//   36   63:istore          5
					if(k >= s.length())
	//*  37   65:iload           5
	//*  38   67:aload_0         
	//*  39   68:invokevirtual   #164 <Method int String.length()>
	//*  40   71:icmplt          80
					{
						i = k;
	//   41   74:iload           5
	//   42   76:istore_3        
					} else
	//*  43   77:goto            20
					{
						char c1 = s.charAt(k);
	//   44   80:aload_0         
	//   45   81:iload           5
	//   46   83:invokevirtual   #275 <Method char String.charAt(int)>
	//   47   86:istore          4
						byte byte0 = 1;
	//   48   88:iconst_1        
	//   49   89:istore          7
						boolean flag;
						if(c1 == '/')
	//*  50   91:iload           4
	//*  51   93:bipush          47
	//*  52   95:icmpne          104
							flag = true;
	//   53   98:iconst_1        
	//   54   99:istore          4
						else
	//*  55  101:goto            107
							flag = false;
	//   56  104:iconst_0        
	//   57  105:istore          4
						k = findEndOfTag(s, k);
	//   58  107:aload_0         
	//   59  108:iload           5
	//   60  110:invokestatic    #277 <Method int findEndOfTag(String, int)>
	//   61  113:istore          5
						int i1 = k - 2;
	//   62  115:iload           5
	//   63  117:iconst_2        
	//   64  118:isub            
	//   65  119:istore          8
						boolean flag1;
						if(s.charAt(i1) == '/')
	//*  66  121:aload_0         
	//*  67  122:iload           8
	//*  68  124:invokevirtual   #275 <Method char String.charAt(int)>
	//*  69  127:bipush          47
	//*  70  129:icmpne          138
							flag1 = true;
	//   71  132:iconst_1        
	//   72  133:istore          6
						else
	//*  73  135:goto            141
							flag1 = false;
	//   74  138:iconst_0        
	//   75  139:istore          6
						if(flag)
	//*  76  141:iload           4
	//*  77  143:ifeq            149
							byte0 = 2;
	//   78  146:iconst_2        
	//   79  147:istore          7
						if(!flag1)
	//*  80  149:iload           6
	//*  81  151:ifeq            157
	//*  82  154:goto            163
							i1 = k - 1;
	//   83  157:iload           5
	//   84  159:iconst_1        
	//   85  160:isub            
	//   86  161:istore          8
						String as[] = tokenizeTag(s.substring(i + byte0, i1));
	//   87  163:aload_0         
	//   88  164:iload_3         
	//   89  165:iload           7
	//   90  167:iadd            
	//   91  168:iload           8
	//   92  170:invokevirtual   #281 <Method String String.substring(int, int)>
	//   93  173:invokestatic    #285 <Method String[] tokenizeTag(String)>
	//   94  176:astore          11
						if(as != null && isSupportedTag(as[0]))
	//*  95  178:aload           11
	//*  96  180:ifnull          280
	//*  97  183:aload           11
	//*  98  185:iconst_0        
	//*  99  186:aaload          
	//* 100  187:invokestatic    #287 <Method boolean isSupportedTag(String)>
	//* 101  190:ifne            196
	//* 102  193:goto            280
						{
							StartTag starttag;
							if(flag)
	//* 103  196:iload           4
	//* 104  198:ifeq            247
								do
								{
									if(stack.isEmpty())
	//* 105  201:aload           10
	//* 106  203:invokevirtual   #288 <Method boolean Stack.isEmpty()>
	//* 107  206:ifeq            212
										break;
	//  108  209:goto            274
									starttag = (StartTag)stack.pop();
	//  109  212:aload           10
	//  110  214:invokevirtual   #292 <Method Object Stack.pop()>
	//  111  217:checkcast       #6   <Class WebvttCueParser$StartTag>
	//  112  220:astore          12
									applySpansForTag(starttag, spannablestringbuilder);
	//  113  222:aload           12
	//  114  224:aload           9
	//  115  226:invokestatic    #294 <Method void applySpansForTag(WebvttCueParser$StartTag, SpannableStringBuilder)>
								} while(!starttag.name.equals(((Object) (as[0]))));
	//  116  229:aload           12
	//  117  231:getfield        #139 <Field String WebvttCueParser$StartTag.name>
	//  118  234:aload           11
	//  119  236:iconst_0        
	//  120  237:aaload          
	//  121  238:invokevirtual   #111 <Method boolean String.equals(Object)>
	//  122  241:ifeq            201
							else
	//* 123  244:goto            274
							if(!flag1)
	//* 124  247:iload           6
	//* 125  249:ifne            274
								stack.push(((Object) (new StartTag(as[0], spannablestringbuilder.length()))));
	//  126  252:aload           10
	//  127  254:new             #6   <Class WebvttCueParser$StartTag>
	//  128  257:dup             
	//  129  258:aload           11
	//  130  260:iconst_0        
	//  131  261:aaload          
	//  132  262:aload           9
	//  133  264:invokevirtual   #148 <Method int SpannableStringBuilder.length()>
	//  134  267:invokespecial   #297 <Method void WebvttCueParser$StartTag(String, int)>
	//  135  270:invokevirtual   #301 <Method Object Stack.push(Object)>
	//  136  273:pop             
							i = k;
	//  137  274:iload           5
	//  138  276:istore_3        
						} else
	//* 139  277:goto            20
						{
							i = k;
	//  140  280:iload           5
	//  141  282:istore_3        
						}
					}
				}
			} else
	//* 142  283:goto            20
			{
				int j = i + 1;
	//  143  286:iload_3         
	//  144  287:iconst_1        
	//  145  288:iadd            
	//  146  289:istore          4
				i = s.indexOf(';', j);
	//  147  291:aload_0         
	//  148  292:bipush          59
	//  149  294:iload           4
	//  150  296:invokevirtual   #163 <Method int String.indexOf(int, int)>
	//  151  299:istore_3        
				int l = s.indexOf(' ', j);
	//  152  300:aload_0         
	//  153  301:bipush          32
	//  154  303:iload           4
	//  155  305:invokevirtual   #163 <Method int String.indexOf(int, int)>
	//  156  308:istore          5
				if(i == -1)
	//* 157  310:iload_3         
	//* 158  311:iconst_m1       
	//* 159  312:icmpne          321
					i = l;
	//  160  315:iload           5
	//  161  317:istore_3        
				else
	//* 162  318:goto            337
				if(l != -1)
	//* 163  321:iload           5
	//* 164  323:iconst_m1       
	//* 165  324:icmpne          330
	//* 166  327:goto            337
					i = Math.min(i, l);
	//  167  330:iload_3         
	//  168  331:iload           5
	//  169  333:invokestatic    #306 <Method int Math.min(int, int)>
	//  170  336:istore_3        
				if(i != -1)
	//* 171  337:iload_3         
	//* 172  338:iconst_m1       
	//* 173  339:icmpeq          375
				{
					applyEntity(s.substring(j, i), spannablestringbuilder);
	//  174  342:aload_0         
	//  175  343:iload           4
	//  176  345:iload_3         
	//  177  346:invokevirtual   #281 <Method String String.substring(int, int)>
	//  178  349:aload           9
	//  179  351:invokestatic    #308 <Method void applyEntity(String, SpannableStringBuilder)>
					if(i == l)
	//* 180  354:iload_3         
	//* 181  355:iload           5
	//* 182  357:icmpne          368
						spannablestringbuilder.append(" ");
	//  183  360:aload           9
	//  184  362:ldc1            #40  <String " ">
	//  185  364:invokevirtual   #311 <Method SpannableStringBuilder SpannableStringBuilder.append(CharSequence)>
	//  186  367:pop             
					i++;
	//  187  368:iload_3         
	//  188  369:iconst_1        
	//  189  370:iadd            
	//  190  371:istore_3        
				} else
	//* 191  372:goto            20
				{
					spannablestringbuilder.append(c);
	//  192  375:aload           9
	//  193  377:iload_2         
	//  194  378:invokevirtual   #134 <Method SpannableStringBuilder SpannableStringBuilder.append(char)>
	//  195  381:pop             
					i = j;
	//  196  382:iload           4
	//  197  384:istore_3        
				}
			}
		}

	//* 198  385:goto            20
		for(; !stack.isEmpty(); applySpansForTag((StartTag)stack.pop(), spannablestringbuilder));
	//  199  388:aload           10
	//  200  390:invokevirtual   #288 <Method boolean Stack.isEmpty()>
	//  201  393:ifne            412
	//  202  396:aload           10
	//  203  398:invokevirtual   #292 <Method Object Stack.pop()>
	//  204  401:checkcast       #6   <Class WebvttCueParser$StartTag>
	//  205  404:aload           9
	//  206  406:invokestatic    #294 <Method void applySpansForTag(WebvttCueParser$StartTag, SpannableStringBuilder)>
	//* 207  409:goto            388
		builder.setText(((CharSequence) (spannablestringbuilder)));
	//  208  412:aload_1         
	//  209  413:aload           9
	//  210  415:invokevirtual   #315 <Method WebvttCue$Builder WebvttCue$Builder.setText(CharSequence)>
	//  211  418:pop             
	//  212  419:return          
	}

	private static void parseLineAttribute(String s, WebvttCue.Builder builder)
		throws NumberFormatException
	{
		int i = s.indexOf(',');
	//    0    0:aload_0         
	//    1    1:bipush          44
	//    2    3:invokevirtual   #318 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		if(i != -1)
	//*   4    7:iload_2         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          37
		{
			builder.setLineAnchor(parsePositionAnchor(s.substring(i + 1)));
	//    7   12:aload_1         
	//    8   13:aload_0         
	//    9   14:iload_2         
	//   10   15:iconst_1        
	//   11   16:iadd            
	//   12   17:invokevirtual   #320 <Method String String.substring(int)>
	//   13   20:invokestatic    #324 <Method int parsePositionAnchor(String)>
	//   14   23:invokevirtual   #328 <Method WebvttCue$Builder WebvttCue$Builder.setLineAnchor(int)>
	//   15   26:pop             
			s = s.substring(0, i);
	//   16   27:aload_0         
	//   17   28:iconst_0        
	//   18   29:iload_2         
	//   19   30:invokevirtual   #281 <Method String String.substring(int, int)>
	//   20   33:astore_0        
		} else
	//*  21   34:goto            45
		{
			builder.setLineAnchor(0x80000000);
	//   22   37:aload_1         
	//   23   38:ldc2            #329 <Int 0x80000000>
	//   24   41:invokevirtual   #328 <Method WebvttCue$Builder WebvttCue$Builder.setLineAnchor(int)>
	//   25   44:pop             
		}
		if(s.endsWith("%"))
	//*  26   45:aload_0         
	//*  27   46:ldc2            #331 <String "%">
	//*  28   49:invokevirtual   #334 <Method boolean String.endsWith(String)>
	//*  29   52:ifeq            69
		{
			builder.setLine(WebvttParserUtil.parsePercentage(s)).setLineType(0);
	//   30   55:aload_1         
	//   31   56:aload_0         
	//   32   57:invokestatic    #257 <Method float WebvttParserUtil.parsePercentage(String)>
	//   33   60:invokevirtual   #337 <Method WebvttCue$Builder WebvttCue$Builder.setLine(float)>
	//   34   63:iconst_0        
	//   35   64:invokevirtual   #340 <Method WebvttCue$Builder WebvttCue$Builder.setLineType(int)>
	//   36   67:pop             
			return;
	//   37   68:return          
		} else
		{
			builder.setLine(Integer.parseInt(s)).setLineType(1);
	//   38   69:aload_1         
	//   39   70:aload_0         
	//   40   71:invokestatic    #345 <Method int Integer.parseInt(String)>
	//   41   74:i2f             
	//   42   75:invokevirtual   #337 <Method WebvttCue$Builder WebvttCue$Builder.setLine(float)>
	//   43   78:iconst_1        
	//   44   79:invokevirtual   #340 <Method WebvttCue$Builder WebvttCue$Builder.setLineType(int)>
	//   45   82:pop             
			return;
	//   46   83:return          
		}
	}

	private static int parsePositionAnchor(String s)
	{
		int i;
label0:
		{
			i = s.hashCode();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #105 <Method int String.hashCode()>
	//    2    4:istore_1        
			if(i != 0xaeb2cc55)
	//*   3    5:iload_1         
	//*   4    6:ldc2            #347 <Int 0xaeb2cc55>
	//*   5    9:icmpeq          81
			{
				if(i != 0xbff6d995)
	//*   6   12:iload_1         
	//*   7   13:ldc2            #348 <Int 0xbff6d995>
	//*   8   16:icmpeq          66
				{
					if(i != 0x188db)
	//*   9   19:iload_1         
	//*  10   20:ldc2            #349 <Int 0x188db>
	//*  11   23:icmpeq          51
					{
						if(i == 0x68ac462 && s.equals("start"))
	//*  12   26:iload_1         
	//*  13   27:ldc2            #350 <Int 0x68ac462>
	//*  14   30:icmpeq          36
	//*  15   33:goto            96
	//*  16   36:aload_0         
	//*  17   37:ldc2            #352 <String "start">
	//*  18   40:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  19   43:ifeq            96
						{
							i = 0;
	//   20   46:iconst_0        
	//   21   47:istore_1        
							break label0;
	//   22   48:goto            98
						}
					} else
					if(s.equals("end"))
	//*  23   51:aload_0         
	//*  24   52:ldc2            #354 <String "end">
	//*  25   55:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  26   58:ifeq            96
					{
						i = 3;
	//   27   61:iconst_3        
	//   28   62:istore_1        
						break label0;
	//   29   63:goto            98
					}
				} else
				if(s.equals("middle"))
	//*  30   66:aload_0         
	//*  31   67:ldc2            #356 <String "middle">
	//*  32   70:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  33   73:ifeq            96
				{
					i = 2;
	//   34   76:iconst_2        
	//   35   77:istore_1        
					break label0;
	//   36   78:goto            98
				}
			} else
			if(s.equals("center"))
	//*  37   81:aload_0         
	//*  38   82:ldc2            #358 <String "center">
	//*  39   85:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*  40   88:ifeq            96
			{
				i = 1;
	//   41   91:iconst_1        
	//   42   92:istore_1        
				break label0;
	//   43   93:goto            98
			}
			i = -1;
	//   44   96:iconst_m1       
	//   45   97:istore_1        
		}
		switch(i)
	//*  46   98:iload_1         
		{
	//*  47   99:tableswitch     0 3: default 128
	//	               0 168
	//	               1 166
	//	               2 166
	//	               3 164
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//   48  128:new             #94  <Class StringBuilder>
	//   49  131:dup             
	//   50  132:invokespecial   #95  <Method void StringBuilder()>
	//   51  135:astore_2        
			stringbuilder.append("Invalid anchor value: ");
	//   52  136:aload_2         
	//   53  137:ldc2            #360 <String "Invalid anchor value: ">
	//   54  140:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   55  143:pop             
			stringbuilder.append(s);
	//   56  144:aload_2         
	//   57  145:aload_0         
	//   58  146:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   59  149:pop             
			Log.w("WebvttCueParser", stringbuilder.toString());
	//   60  150:ldc1            #48  <String "WebvttCueParser">
	//   61  152:aload_2         
	//   62  153:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   63  156:invokestatic    #129 <Method int Log.w(String, String)>
	//   64  159:pop             
			return 0x80000000;
	//   65  160:ldc2            #329 <Int 0x80000000>
	//   66  163:ireturn         

		case 3: // '\003'
			return 2;
	//   67  164:iconst_2        
	//   68  165:ireturn         

		case 1: // '\001'
		case 2: // '\002'
			return 1;
	//   69  166:iconst_1        
	//   70  167:ireturn         

		case 0: // '\0'
			return 0;
	//   71  168:iconst_0        
	//   72  169:ireturn         
		}
	}

	private static void parsePositionAttribute(String s, WebvttCue.Builder builder)
		throws NumberFormatException
	{
		int i = s.indexOf(',');
	//    0    0:aload_0         
	//    1    1:bipush          44
	//    2    3:invokevirtual   #318 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		if(i != -1)
	//*   4    7:iload_2         
	//*   5    8:iconst_m1       
	//*   6    9:icmpeq          37
		{
			builder.setPositionAnchor(parsePositionAnchor(s.substring(i + 1)));
	//    7   12:aload_1         
	//    8   13:aload_0         
	//    9   14:iload_2         
	//   10   15:iconst_1        
	//   11   16:iadd            
	//   12   17:invokevirtual   #320 <Method String String.substring(int)>
	//   13   20:invokestatic    #324 <Method int parsePositionAnchor(String)>
	//   14   23:invokevirtual   #363 <Method WebvttCue$Builder WebvttCue$Builder.setPositionAnchor(int)>
	//   15   26:pop             
			s = s.substring(0, i);
	//   16   27:aload_0         
	//   17   28:iconst_0        
	//   18   29:iload_2         
	//   19   30:invokevirtual   #281 <Method String String.substring(int, int)>
	//   20   33:astore_0        
		} else
	//*  21   34:goto            45
		{
			builder.setPositionAnchor(0x80000000);
	//   22   37:aload_1         
	//   23   38:ldc2            #329 <Int 0x80000000>
	//   24   41:invokevirtual   #363 <Method WebvttCue$Builder WebvttCue$Builder.setPositionAnchor(int)>
	//   25   44:pop             
		}
		builder.setPosition(WebvttParserUtil.parsePercentage(s));
	//   26   45:aload_1         
	//   27   46:aload_0         
	//   28   47:invokestatic    #257 <Method float WebvttParserUtil.parsePercentage(String)>
	//   29   50:invokevirtual   #366 <Method WebvttCue$Builder WebvttCue$Builder.setPosition(float)>
	//   30   53:pop             
	//   31   54:return          
	}

	private static android.text.Layout.Alignment parseTextAlignment(String s)
	{
		byte byte0;
label0:
		{
			switch(s.hashCode())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #105 <Method int String.hashCode()>
			{
			default:
				break;

	//*   2    4:lookupswitch    6: default 64
	//	               -1364013995: 142
	//	               -1074341483: 127
	//	               100571: 112
	//	               3317767: 97
	//	               108511772: 82
	//	               109757538: 67
	//*   3   64:goto            157
			case 109757538: 
				if(s.equals("start"))
	//*   4   67:aload_0         
	//*   5   68:ldc2            #352 <String "start">
	//*   6   71:invokevirtual   #111 <Method boolean String.equals(Object)>
	//*   7   74:ifeq            157
				{
					byte0 = 0;
	//    8   77:iconst_0        
	//    9   78:istore_1        
					break label0;
	//   10   79:goto            159
				}
				break;

			case 108511772: 
				if(!s.equals("right"))
					break;
	//   11   82:aload_0         
	//   12   83:ldc2            #368 <String "right">
	//   13   86:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   14   89:ifeq            157
				byte0 = 5;
	//   15   92:iconst_5        
	//   16   93:istore_1        
				break label0;
	//   17   94:goto            159

			case 3317767: 
				if(!s.equals("left"))
					break;
	//   18   97:aload_0         
	//   19   98:ldc2            #370 <String "left">
	//   20  101:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   21  104:ifeq            157
				byte0 = 1;
	//   22  107:iconst_1        
	//   23  108:istore_1        
				break label0;
	//   24  109:goto            159

			case 100571: 
				if(!s.equals("end"))
					break;
	//   25  112:aload_0         
	//   26  113:ldc2            #354 <String "end">
	//   27  116:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   28  119:ifeq            157
				byte0 = 4;
	//   29  122:iconst_4        
	//   30  123:istore_1        
				break label0;
	//   31  124:goto            159

			case -1074341483: 
				if(!s.equals("middle"))
					break;
	//   32  127:aload_0         
	//   33  128:ldc2            #356 <String "middle">
	//   34  131:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   35  134:ifeq            157
				byte0 = 3;
	//   36  137:iconst_3        
	//   37  138:istore_1        
				break label0;
	//   38  139:goto            159

			case -1364013995: 
				if(!s.equals("center"))
					break;
	//   39  142:aload_0         
	//   40  143:ldc2            #358 <String "center">
	//   41  146:invokevirtual   #111 <Method boolean String.equals(Object)>
	//   42  149:ifeq            157
				byte0 = 2;
	//   43  152:iconst_2        
	//   44  153:istore_1        
				break label0;
	//   45  154:goto            159
			}
			byte0 = -1;
	//   46  157:iconst_m1       
	//   47  158:istore_1        
		}
		switch(byte0)
	//*  48  159:iload_1         
		{
	//*  49  160:tableswitch     0 5: default 200
	//	               0 242
	//	               1 242
	//	               2 238
	//	               3 238
	//	               4 234
	//	               5 234
		default:
			StringBuilder stringbuilder = new StringBuilder();
	//   50  200:new             #94  <Class StringBuilder>
	//   51  203:dup             
	//   52  204:invokespecial   #95  <Method void StringBuilder()>
	//   53  207:astore_2        
			stringbuilder.append("Invalid alignment value: ");
	//   54  208:aload_2         
	//   55  209:ldc2            #372 <String "Invalid alignment value: ">
	//   56  212:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   57  215:pop             
			stringbuilder.append(s);
	//   58  216:aload_2         
	//   59  217:aload_0         
	//   60  218:invokevirtual   #117 <Method StringBuilder StringBuilder.append(String)>
	//   61  221:pop             
			Log.w("WebvttCueParser", stringbuilder.toString());
	//   62  222:ldc1            #48  <String "WebvttCueParser">
	//   63  224:aload_2         
	//   64  225:invokevirtual   #123 <Method String StringBuilder.toString()>
	//   65  228:invokestatic    #129 <Method int Log.w(String, String)>
	//   66  231:pop             
			return null;
	//   67  232:aconst_null     
	//   68  233:areturn         

		case 4: // '\004'
		case 5: // '\005'
			return android.text.Layout.Alignment.ALIGN_OPPOSITE;
	//   69  234:getstatic       #378 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_OPPOSITE>
	//   70  237:areturn         

		case 2: // '\002'
		case 3: // '\003'
			return android.text.Layout.Alignment.ALIGN_CENTER;
	//   71  238:getstatic       #381 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_CENTER>
	//   72  241:areturn         

		case 0: // '\0'
		case 1: // '\001'
			return android.text.Layout.Alignment.ALIGN_NORMAL;
	//   73  242:getstatic       #384 <Field android.text.Layout$Alignment android.text.Layout$Alignment.ALIGN_NORMAL>
	//   74  245:areturn         
		}
	}

	private static String[] tokenizeTag(String s)
	{
		String s1 = s.replace("\\s+", " ").trim();
	//    0    0:aload_0         
	//    1    1:ldc2            #386 <String "\\s+">
	//    2    4:ldc1            #40  <String " ">
	//    3    6:invokevirtual   #390 <Method String String.replace(CharSequence, CharSequence)>
	//    4    9:invokevirtual   #222 <Method String String.trim()>
	//    5   12:astore_1        
		if(s1.length() == 0)
	//*   6   13:aload_1         
	//*   7   14:invokevirtual   #164 <Method int String.length()>
	//*   8   17:ifne            22
			return null;
	//    9   20:aconst_null     
	//   10   21:areturn         
		s = s1;
	//   11   22:aload_1         
	//   12   23:astore_0        
		if(s1.contains(" "))
	//*  13   24:aload_1         
	//*  14   25:ldc1            #40  <String " ">
	//*  15   27:invokevirtual   #394 <Method boolean String.contains(CharSequence)>
	//*  16   30:ifeq            45
			s = s1.substring(0, s1.indexOf(" "));
	//   17   33:aload_1         
	//   18   34:iconst_0        
	//   19   35:aload_1         
	//   20   36:ldc1            #40  <String " ">
	//   21   38:invokevirtual   #396 <Method int String.indexOf(String)>
	//   22   41:invokevirtual   #281 <Method String String.substring(int, int)>
	//   23   44:astore_0        
		return s.split("\\.");
	//   24   45:aload_0         
	//   25   46:ldc2            #398 <String "\\.">
	//   26   49:invokevirtual   #401 <Method String[] String.split(String)>
	//   27   52:areturn         
	}

	boolean parseNextValidCue(ParsableByteArray parsablebytearray, WebvttCue.Builder builder)
	{
		do
		{
			Matcher matcher = findNextCueHeader(parsablebytearray);
	//    0    0:aload_1         
	//    1    1:invokestatic    #405 <Method Matcher findNextCueHeader(ParsableByteArray)>
	//    2    4:astore_3        
			if(matcher != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          24
			{
				if(parseCue(matcher, parsablebytearray, builder, textBuilder))
	//*   5    9:aload_3         
	//*   6   10:aload_1         
	//*   7   11:aload_2         
	//*   8   12:aload_0         
	//*   9   13:getfield        #97  <Field StringBuilder textBuilder>
	//*  10   16:invokestatic    #407 <Method boolean parseCue(Matcher, ParsableByteArray, WebvttCue$Builder, StringBuilder)>
	//*  11   19:ifeq            0
					return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
			} else
			{
				return false;
	//   14   24:iconst_0        
	//   15   25:ireturn         
			}
		} while(true);
	}

	private static final char CHAR_AMPERSAND = 38;
	private static final char CHAR_GREATER_THAN = 62;
	private static final char CHAR_LESS_THAN = 60;
	private static final char CHAR_SEMI_COLON = 59;
	private static final char CHAR_SLASH = 47;
	private static final char CHAR_SPACE = 32;
	private static final Pattern COMMENT = Pattern.compile("^NOTE(( |\t).*)?$");
	public static final Pattern CUE_HEADER_PATTERN = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
	private static final Pattern CUE_SETTING_PATTERN = Pattern.compile("(\\S+?):(\\S+)");
	private static final String ENTITY_AMPERSAND = "amp";
	private static final String ENTITY_GREATER_THAN = "gt";
	private static final String ENTITY_LESS_THAN = "lt";
	private static final String ENTITY_NON_BREAK_SPACE = "nbsp";
	private static final String SPACE = " ";
	private static final int STYLE_BOLD = 1;
	private static final int STYLE_ITALIC = 2;
	private static final String TAG = "WebvttCueParser";
	private static final String TAG_BOLD = "b";
	private static final String TAG_CLASS = "c";
	private static final String TAG_ITALIC = "i";
	private static final String TAG_LANG = "lang";
	private static final String TAG_UNDERLINE = "u";
	private static final String TAG_VOICE = "v";
	private final StringBuilder textBuilder = new StringBuilder();

	static 
	{
	//    0    0:ldc1            #72  <String "^(\\S+)\\s+-->\\s+(\\S+)(.*)?$">
	//    1    2:invokestatic    #78  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #80  <Field Pattern CUE_HEADER_PATTERN>
	//    3    8:ldc1            #82  <String "^NOTE(( |\t).*)?$">
	//    4   10:invokestatic    #78  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #84  <Field Pattern COMMENT>
	//    6   16:ldc1            #86  <String "(\\S+?):(\\S+)">
	//    7   18:invokestatic    #78  <Method Pattern Pattern.compile(String)>
	//    8   21:putstatic       #88  <Field Pattern CUE_SETTING_PATTERN>
	//*   9   24:return          
	}
}
