// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.ssa;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.text.*;
import com.google.android.exoplayer2.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.text.ssa:
//			SsaSubtitle

public final class SsaDecoder extends SimpleSubtitleDecoder
{

	public SsaDecoder()
	{
		this(((List) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #40  <Method void SsaDecoder(List)>
	//    3    5:return          
	}

	public SsaDecoder(List list)
	{
		super("SsaDecoder");
	//    0    0:aload_0         
	//    1    1:ldc1            #16  <String "SsaDecoder">
	//    2    3:invokespecial   #43  <Method void SimpleSubtitleDecoder(String)>
		if(list != null && !list.isEmpty())
	//*   3    6:aload_1         
	//*   4    7:ifnull          74
	//*   5   10:aload_1         
	//*   6   11:invokeinterface #49  <Method boolean List.isEmpty()>
	//*   7   16:ifne            74
		{
			haveInitializationData = true;
	//    8   19:aload_0         
	//    9   20:iconst_1        
	//   10   21:putfield        #51  <Field boolean haveInitializationData>
			String s = Util.fromUtf8Bytes((byte[])list.get(0));
	//   11   24:aload_1         
	//   12   25:iconst_0        
	//   13   26:invokeinterface #55  <Method Object List.get(int)>
	//   14   31:checkcast       #57  <Class byte[]>
	//   15   34:invokestatic    #63  <Method String Util.fromUtf8Bytes(byte[])>
	//   16   37:astore_2        
			Assertions.checkArgument(s.startsWith("Format: "));
	//   17   38:aload_2         
	//   18   39:ldc1            #11  <String "Format: ">
	//   19   41:invokevirtual   #69  <Method boolean String.startsWith(String)>
	//   20   44:invokestatic    #75  <Method void Assertions.checkArgument(boolean)>
			parseFormatLine(s);
	//   21   47:aload_0         
	//   22   48:aload_2         
	//   23   49:invokespecial   #78  <Method void parseFormatLine(String)>
			parseHeader(new ParsableByteArray((byte[])list.get(1)));
	//   24   52:aload_0         
	//   25   53:new             #80  <Class ParsableByteArray>
	//   26   56:dup             
	//   27   57:aload_1         
	//   28   58:iconst_1        
	//   29   59:invokeinterface #55  <Method Object List.get(int)>
	//   30   64:checkcast       #57  <Class byte[]>
	//   31   67:invokespecial   #83  <Method void ParsableByteArray(byte[])>
	//   32   70:invokespecial   #87  <Method void parseHeader(ParsableByteArray)>
			return;
	//   33   73:return          
		} else
		{
			haveInitializationData = false;
	//   34   74:aload_0         
	//   35   75:iconst_0        
	//   36   76:putfield        #51  <Field boolean haveInitializationData>
			return;
	//   37   79:return          
		}
	}

	private void parseDialogueLine(String s, List list, LongArray longarray)
	{
		if(formatKeyCount == 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #93  <Field int formatKeyCount>
	//*   2    4:ifne            39
		{
			list = ((List) (new StringBuilder()));
	//    3    7:new             #95  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #97  <Method void StringBuilder()>
	//    6   14:astore_2        
			((StringBuilder) (list)).append("Skipping dialogue line before complete format: ");
	//    7   15:aload_2         
	//    8   16:ldc1            #99  <String "Skipping dialogue line before complete format: ">
	//    9   18:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			((StringBuilder) (list)).append(s);
	//   11   22:aload_2         
	//   12   23:aload_1         
	//   13   24:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			Log.w("SsaDecoder", ((StringBuilder) (list)).toString());
	//   15   28:ldc1            #16  <String "SsaDecoder">
	//   16   30:aload_2         
	//   17   31:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   18   34:invokestatic    #113 <Method int Log.w(String, String)>
	//   19   37:pop             
			return;
	//   20   38:return          
		}
		String as[] = s.substring("Dialogue: ".length()).split(",", formatKeyCount);
	//   21   39:aload_1         
	//   22   40:ldc1            #8   <String "Dialogue: ">
	//   23   42:invokevirtual   #117 <Method int String.length()>
	//   24   45:invokevirtual   #121 <Method String String.substring(int)>
	//   25   48:ldc1            #123 <String ",">
	//   26   50:aload_0         
	//   27   51:getfield        #93  <Field int formatKeyCount>
	//   28   54:invokevirtual   #127 <Method String[] String.split(String, int)>
	//   29   57:astore          10
		if(as.length != formatKeyCount)
	//*  30   59:aload           10
	//*  31   61:arraylength     
	//*  32   62:aload_0         
	//*  33   63:getfield        #93  <Field int formatKeyCount>
	//*  34   66:icmpeq          101
		{
			list = ((List) (new StringBuilder()));
	//   35   69:new             #95  <Class StringBuilder>
	//   36   72:dup             
	//   37   73:invokespecial   #97  <Method void StringBuilder()>
	//   38   76:astore_2        
			((StringBuilder) (list)).append("Skipping dialogue line with fewer columns than format: ");
	//   39   77:aload_2         
	//   40   78:ldc1            #129 <String "Skipping dialogue line with fewer columns than format: ">
	//   41   80:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   42   83:pop             
			((StringBuilder) (list)).append(s);
	//   43   84:aload_2         
	//   44   85:aload_1         
	//   45   86:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   46   89:pop             
			Log.w("SsaDecoder", ((StringBuilder) (list)).toString());
	//   47   90:ldc1            #16  <String "SsaDecoder">
	//   48   92:aload_2         
	//   49   93:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   50   96:invokestatic    #113 <Method int Log.w(String, String)>
	//   51   99:pop             
			return;
	//   52  100:return          
		}
		long l2 = parseTimecodeUs(as[formatStartIndex]);
	//   53  101:aload           10
	//   54  103:aload_0         
	//   55  104:getfield        #131 <Field int formatStartIndex>
	//   56  107:aaload          
	//   57  108:invokestatic    #135 <Method long parseTimecodeUs(String)>
	//   58  111:lstore          8
		if(l2 == 0x1L)
	//*  59  113:lload           8
	//*  60  115:ldc2w           #136 <Long 0x1L>
	//*  61  118:lcmp            
	//*  62  119:ifne            154
		{
			list = ((List) (new StringBuilder()));
	//   63  122:new             #95  <Class StringBuilder>
	//   64  125:dup             
	//   65  126:invokespecial   #97  <Method void StringBuilder()>
	//   66  129:astore_2        
			((StringBuilder) (list)).append("Skipping invalid timing: ");
	//   67  130:aload_2         
	//   68  131:ldc1            #139 <String "Skipping invalid timing: ">
	//   69  133:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   70  136:pop             
			((StringBuilder) (list)).append(s);
	//   71  137:aload_2         
	//   72  138:aload_1         
	//   73  139:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//   74  142:pop             
			Log.w("SsaDecoder", ((StringBuilder) (list)).toString());
	//   75  143:ldc1            #16  <String "SsaDecoder">
	//   76  145:aload_2         
	//   77  146:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   78  149:invokestatic    #113 <Method int Log.w(String, String)>
	//   79  152:pop             
			return;
	//   80  153:return          
		}
		String s1 = as[formatEndIndex];
	//   81  154:aload           10
	//   82  156:aload_0         
	//   83  157:getfield        #141 <Field int formatEndIndex>
	//   84  160:aaload          
	//   85  161:astore          11
		long l;
		if(!s1.trim().isEmpty())
	//*  86  163:aload           11
	//*  87  165:invokevirtual   #144 <Method String String.trim()>
	//*  88  168:invokevirtual   #145 <Method boolean String.isEmpty()>
	//*  89  171:ifne            226
		{
			long l1 = parseTimecodeUs(s1);
	//   90  174:aload           11
	//   91  176:invokestatic    #135 <Method long parseTimecodeUs(String)>
	//   92  179:lstore          6
			l = l1;
	//   93  181:lload           6
	//   94  183:lstore          4
			if(l1 == 0x1L)
	//*  95  185:lload           6
	//*  96  187:ldc2w           #136 <Long 0x1L>
	//*  97  190:lcmp            
	//*  98  191:ifne            231
			{
				list = ((List) (new StringBuilder()));
	//   99  194:new             #95  <Class StringBuilder>
	//  100  197:dup             
	//  101  198:invokespecial   #97  <Method void StringBuilder()>
	//  102  201:astore_2        
				((StringBuilder) (list)).append("Skipping invalid timing: ");
	//  103  202:aload_2         
	//  104  203:ldc1            #139 <String "Skipping invalid timing: ">
	//  105  205:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  106  208:pop             
				((StringBuilder) (list)).append(s);
	//  107  209:aload_2         
	//  108  210:aload_1         
	//  109  211:invokevirtual   #103 <Method StringBuilder StringBuilder.append(String)>
	//  110  214:pop             
				Log.w("SsaDecoder", ((StringBuilder) (list)).toString());
	//  111  215:ldc1            #16  <String "SsaDecoder">
	//  112  217:aload_2         
	//  113  218:invokevirtual   #107 <Method String StringBuilder.toString()>
	//  114  221:invokestatic    #113 <Method int Log.w(String, String)>
	//  115  224:pop             
				return;
	//  116  225:return          
			}
		} else
		{
			l = 0x1L;
	//  117  226:ldc2w           #136 <Long 0x1L>
	//  118  229:lstore          4
		}
		list.add(((Object) (new Cue(((CharSequence) (as[formatTextIndex].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")))))));
	//  119  231:aload_2         
	//  120  232:new             #147 <Class Cue>
	//  121  235:dup             
	//  122  236:aload           10
	//  123  238:aload_0         
	//  124  239:getfield        #149 <Field int formatTextIndex>
	//  125  242:aaload          
	//  126  243:ldc1            #151 <String "\\{.*?\\}">
	//  127  245:ldc1            #153 <String "">
	//  128  247:invokevirtual   #157 <Method String String.replaceAll(String, String)>
	//  129  250:ldc1            #159 <String "\\\\N">
	//  130  252:ldc1            #161 <String "\n">
	//  131  254:invokevirtual   #157 <Method String String.replaceAll(String, String)>
	//  132  257:ldc1            #163 <String "\\\\n">
	//  133  259:ldc1            #161 <String "\n">
	//  134  261:invokevirtual   #157 <Method String String.replaceAll(String, String)>
	//  135  264:invokespecial   #166 <Method void Cue(CharSequence)>
	//  136  267:invokeinterface #170 <Method boolean List.add(Object)>
	//  137  272:pop             
		longarray.add(l2);
	//  138  273:aload_3         
	//  139  274:lload           8
	//  140  276:invokevirtual   #175 <Method void LongArray.add(long)>
		if(l != 0x1L)
	//* 141  279:lload           4
	//* 142  281:ldc2w           #136 <Long 0x1L>
	//* 143  284:lcmp            
	//* 144  285:ifeq            302
		{
			list.add(((Object) (null)));
	//  145  288:aload_2         
	//  146  289:aconst_null     
	//  147  290:invokeinterface #170 <Method boolean List.add(Object)>
	//  148  295:pop             
			longarray.add(l);
	//  149  296:aload_3         
	//  150  297:lload           4
	//  151  299:invokevirtual   #175 <Method void LongArray.add(long)>
		}
	//  152  302:return          
	}

	private void parseEventBody(ParsableByteArray parsablebytearray, List list, LongArray longarray)
	{
		do
		{
			String s = parsablebytearray.readLine();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #181 <Method String ParsableByteArray.readLine()>
	//    2    4:astore          4
			if(s == null)
				break;
	//    3    6:aload           4
	//    4    8:ifnull          58
			if(!haveInitializationData && s.startsWith("Format: "))
	//*   5   11:aload_0         
	//*   6   12:getfield        #51  <Field boolean haveInitializationData>
	//*   7   15:ifne            37
	//*   8   18:aload           4
	//*   9   20:ldc1            #11  <String "Format: ">
	//*  10   22:invokevirtual   #69  <Method boolean String.startsWith(String)>
	//*  11   25:ifeq            37
				parseFormatLine(s);
	//   12   28:aload_0         
	//   13   29:aload           4
	//   14   31:invokespecial   #78  <Method void parseFormatLine(String)>
			else
	//*  15   34:goto            0
			if(s.startsWith("Dialogue: "))
	//*  16   37:aload           4
	//*  17   39:ldc1            #8   <String "Dialogue: ">
	//*  18   41:invokevirtual   #69  <Method boolean String.startsWith(String)>
	//*  19   44:ifeq            0
				parseDialogueLine(s, list, longarray);
	//   20   47:aload_0         
	//   21   48:aload           4
	//   22   50:aload_2         
	//   23   51:aload_3         
	//   24   52:invokespecial   #183 <Method void parseDialogueLine(String, List, LongArray)>
		} while(true);
	//   25   55:goto            0
	//   26   58:return          
	}

	private void parseFormatLine(String s)
	{
		s = ((String) (TextUtils.split(s.substring("Format: ".length()), ",")));
	//    0    0:aload_1         
	//    1    1:ldc1            #11  <String "Format: ">
	//    2    3:invokevirtual   #117 <Method int String.length()>
	//    3    6:invokevirtual   #121 <Method String String.substring(int)>
	//    4    9:ldc1            #123 <String ",">
	//    5   11:invokestatic    #189 <Method String[] TextUtils.split(String, String)>
	//    6   14:astore_1        
		formatKeyCount = s.length;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:arraylength     
	//   10   18:putfield        #93  <Field int formatKeyCount>
		formatStartIndex = -1;
	//   11   21:aload_0         
	//   12   22:iconst_m1       
	//   13   23:putfield        #131 <Field int formatStartIndex>
		formatEndIndex = -1;
	//   14   26:aload_0         
	//   15   27:iconst_m1       
	//   16   28:putfield        #141 <Field int formatEndIndex>
		formatTextIndex = -1;
	//   17   31:aload_0         
	//   18   32:iconst_m1       
	//   19   33:putfield        #149 <Field int formatTextIndex>
		for(int j = 0; j < formatKeyCount; j++)
	//*  20   36:iconst_0        
	//*  21   37:istore_3        
	//*  22   38:iload_3         
	//*  23   39:aload_0         
	//*  24   40:getfield        #93  <Field int formatKeyCount>
	//*  25   43:icmpge          191
		{
			int i;
label0:
			{
				String s1 = Util.toLowerInvariant(((String) (s[j])).trim());
	//   26   46:aload_1         
	//   27   47:iload_3         
	//   28   48:aaload          
	//   29   49:invokevirtual   #144 <Method String String.trim()>
	//   30   52:invokestatic    #193 <Method String Util.toLowerInvariant(String)>
	//   31   55:astore          4
				i = s1.hashCode();
	//   32   57:aload           4
	//   33   59:invokevirtual   #196 <Method int String.hashCode()>
	//   34   62:istore_2        
				if(i != 0x188db)
	//*  35   63:iload_2         
	//*  36   64:ldc1            #197 <Int 0x188db>
	//*  37   66:icmpeq          114
				{
					if(i != 0x36452d)
	//*  38   69:iload_2         
	//*  39   70:ldc1            #198 <Int 0x36452d>
	//*  40   72:icmpeq          99
					{
						if(i == 0x68ac462 && s1.equals("start"))
	//*  41   75:iload_2         
	//*  42   76:ldc1            #199 <Int 0x68ac462>
	//*  43   78:icmpeq          84
	//*  44   81:goto            129
	//*  45   84:aload           4
	//*  46   86:ldc1            #201 <String "start">
	//*  47   88:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  48   91:ifeq            129
						{
							i = 0;
	//   49   94:iconst_0        
	//   50   95:istore_2        
							break label0;
	//   51   96:goto            131
						}
					} else
					if(s1.equals("text"))
	//*  52   99:aload           4
	//*  53  101:ldc1            #206 <String "text">
	//*  54  103:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  55  106:ifeq            129
					{
						i = 2;
	//   56  109:iconst_2        
	//   57  110:istore_2        
						break label0;
	//   58  111:goto            131
					}
				} else
				if(s1.equals("end"))
	//*  59  114:aload           4
	//*  60  116:ldc1            #208 <String "end">
	//*  61  118:invokevirtual   #204 <Method boolean String.equals(Object)>
	//*  62  121:ifeq            129
				{
					i = 1;
	//   63  124:iconst_1        
	//   64  125:istore_2        
					break label0;
	//   65  126:goto            131
				}
				i = -1;
	//   66  129:iconst_m1       
	//   67  130:istore_2        
			}
			switch(i)
	//*  68  131:iload_2         
			{
	//*  69  132:tableswitch     0 2: default 160
	//	               0 179
	//	               1 171
	//	               2 163
	//*  70  160:goto            184
			case 2: // '\002'
				formatTextIndex = j;
	//   71  163:aload_0         
	//   72  164:iload_3         
	//   73  165:putfield        #149 <Field int formatTextIndex>
				break;

	//*  74  168:goto            184
			case 1: // '\001'
				formatEndIndex = j;
	//   75  171:aload_0         
	//   76  172:iload_3         
	//   77  173:putfield        #141 <Field int formatEndIndex>
				break;

	//*  78  176:goto            184
			case 0: // '\0'
				formatStartIndex = j;
	//   79  179:aload_0         
	//   80  180:iload_3         
	//   81  181:putfield        #131 <Field int formatStartIndex>
				break;
			}
		}

	//   82  184:iload_3         
	//   83  185:iconst_1        
	//   84  186:iadd            
	//   85  187:istore_3        
	//*  86  188:goto            38
		if(formatStartIndex == -1 || formatEndIndex == -1 || formatTextIndex == -1)
	//*  87  191:aload_0         
	//*  88  192:getfield        #131 <Field int formatStartIndex>
	//*  89  195:iconst_m1       
	//*  90  196:icmpeq          215
	//*  91  199:aload_0         
	//*  92  200:getfield        #141 <Field int formatEndIndex>
	//*  93  203:iconst_m1       
	//*  94  204:icmpeq          215
	//*  95  207:aload_0         
	//*  96  208:getfield        #149 <Field int formatTextIndex>
	//*  97  211:iconst_m1       
	//*  98  212:icmpne          220
			formatKeyCount = 0;
	//   99  215:aload_0         
	//  100  216:iconst_0        
	//  101  217:putfield        #93  <Field int formatKeyCount>
	//  102  220:return          
	}

	private void parseHeader(ParsableByteArray parsablebytearray)
	{
		do
		{
			String s = parsablebytearray.readLine();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #181 <Method String ParsableByteArray.readLine()>
	//    2    4:astore_2        
			if(s != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          19
			{
				if(s.startsWith("[Events]"))
	//*   5    9:aload_2         
	//*   6   10:ldc1            #210 <String "[Events]">
	//*   7   12:invokevirtual   #69  <Method boolean String.startsWith(String)>
	//*   8   15:ifeq            0
					return;
	//    9   18:return          
			} else
			{
				return;
	//   10   19:return          
			}
		} while(true);
	}

	public static long parseTimecodeUs(String s)
	{
		s = ((String) (SSA_TIMECODE_PATTERN.matcher(((CharSequence) (s)))));
	//    0    0:getstatic       #35  <Field Pattern SSA_TIMECODE_PATTERN>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #214 <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_0        
		if(!((Matcher) (s)).matches())
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #219 <Method boolean Matcher.matches()>
	//*   6   12:ifne            19
			return 0x1L;
	//    7   15:ldc2w           #136 <Long 0x1L>
	//    8   18:lreturn         
		else
			return Long.parseLong(((Matcher) (s)).group(1)) * 60L * 60L * 0xf4240L + Long.parseLong(((Matcher) (s)).group(2)) * 60L * 0xf4240L + Long.parseLong(((Matcher) (s)).group(3)) * 0xf4240L + Long.parseLong(((Matcher) (s)).group(4)) * 10000L;
	//    9   19:aload_0         
	//   10   20:iconst_1        
	//   11   21:invokevirtual   #222 <Method String Matcher.group(int)>
	//   12   24:invokestatic    #227 <Method long Long.parseLong(String)>
	//   13   27:ldc2w           #228 <Long 60L>
	//   14   30:lmul            
	//   15   31:ldc2w           #228 <Long 60L>
	//   16   34:lmul            
	//   17   35:ldc2w           #230 <Long 0xf4240L>
	//   18   38:lmul            
	//   19   39:aload_0         
	//   20   40:iconst_2        
	//   21   41:invokevirtual   #222 <Method String Matcher.group(int)>
	//   22   44:invokestatic    #227 <Method long Long.parseLong(String)>
	//   23   47:ldc2w           #228 <Long 60L>
	//   24   50:lmul            
	//   25   51:ldc2w           #230 <Long 0xf4240L>
	//   26   54:lmul            
	//   27   55:ladd            
	//   28   56:aload_0         
	//   29   57:iconst_3        
	//   30   58:invokevirtual   #222 <Method String Matcher.group(int)>
	//   31   61:invokestatic    #227 <Method long Long.parseLong(String)>
	//   32   64:ldc2w           #230 <Long 0xf4240L>
	//   33   67:lmul            
	//   34   68:ladd            
	//   35   69:aload_0         
	//   36   70:iconst_4        
	//   37   71:invokevirtual   #222 <Method String Matcher.group(int)>
	//   38   74:invokestatic    #227 <Method long Long.parseLong(String)>
	//   39   77:ldc2w           #232 <Long 10000L>
	//   40   80:lmul            
	//   41   81:ladd            
	//   42   82:lreturn         
	}

	protected volatile Subtitle decode(byte abyte0[], int i, boolean flag)
		throws SubtitleDecoderException
	{
		return ((Subtitle) (decode(abyte0, i, flag)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:invokevirtual   #240 <Method SsaSubtitle decode(byte[], int, boolean)>
	//    5    7:areturn         
	}

	protected SsaSubtitle decode(byte abyte0[], int i, boolean flag)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #243 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #244 <Method void ArrayList()>
	//    3    7:astore          4
		LongArray longarray = new LongArray();
	//    4    9:new             #172 <Class LongArray>
	//    5   12:dup             
	//    6   13:invokespecial   #245 <Method void LongArray()>
	//    7   16:astore          5
		abyte0 = ((byte []) (new ParsableByteArray(abyte0, i)));
	//    8   18:new             #80  <Class ParsableByteArray>
	//    9   21:dup             
	//   10   22:aload_1         
	//   11   23:iload_2         
	//   12   24:invokespecial   #248 <Method void ParsableByteArray(byte[], int)>
	//   13   27:astore_1        
		if(!haveInitializationData)
	//*  14   28:aload_0         
	//*  15   29:getfield        #51  <Field boolean haveInitializationData>
	//*  16   32:ifne            40
			parseHeader(((ParsableByteArray) (abyte0)));
	//   17   35:aload_0         
	//   18   36:aload_1         
	//   19   37:invokespecial   #87  <Method void parseHeader(ParsableByteArray)>
		parseEventBody(((ParsableByteArray) (abyte0)), ((List) (arraylist)), longarray);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload           4
	//   23   44:aload           5
	//   24   46:invokespecial   #250 <Method void parseEventBody(ParsableByteArray, List, LongArray)>
		abyte0 = ((byte []) (new Cue[arraylist.size()]));
	//   25   49:aload           4
	//   26   51:invokevirtual   #253 <Method int ArrayList.size()>
	//   27   54:anewarray       Cue[]
	//   28   57:astore_1        
		arraylist.toArray(((Object []) (abyte0)));
	//   29   58:aload           4
	//   30   60:aload_1         
	//   31   61:invokevirtual   #257 <Method Object[] ArrayList.toArray(Object[])>
	//   32   64:pop             
		return new SsaSubtitle(((Cue []) (abyte0)), longarray.toArray());
	//   33   65:new             #259 <Class SsaSubtitle>
	//   34   68:dup             
	//   35   69:aload_1         
	//   36   70:aload           5
	//   37   72:invokevirtual   #262 <Method long[] LongArray.toArray()>
	//   38   75:invokespecial   #265 <Method void SsaSubtitle(Cue[], long[])>
	//   39   78:areturn         
	}

	private static final String DIALOGUE_LINE_PREFIX = "Dialogue: ";
	private static final String FORMAT_LINE_PREFIX = "Format: ";
	private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
	private static final String TAG = "SsaDecoder";
	private int formatEndIndex;
	private int formatKeyCount;
	private int formatStartIndex;
	private int formatTextIndex;
	private final boolean haveInitializationData;

	static 
	{
	//    0    0:ldc1            #27  <String "(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)">
	//    1    2:invokestatic    #33  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #35  <Field Pattern SSA_TIMECODE_PATTERN>
	//*   3    8:return          
	}
}
