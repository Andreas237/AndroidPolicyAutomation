// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.ParserException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class HlsParserUtil
{

	private HlsParserUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static Pattern compileBooleanAttrPattern(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #20  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append(s);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		stringbuilder.append("=(");
	//    8   14:aload_1         
	//    9   15:ldc1            #27  <String "=(">
	//   10   17:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("YES");
	//   12   21:aload_1         
	//   13   22:ldc1            #11  <String "YES">
	//   14   24:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append("|");
	//   16   28:aload_1         
	//   17   29:ldc1            #29  <String "|">
	//   18   31:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   19   34:pop             
		stringbuilder.append("NO");
	//   20   35:aload_1         
	//   21   36:ldc1            #8   <String "NO">
	//   22   38:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   23   41:pop             
		stringbuilder.append(")");
	//   24   42:aload_1         
	//   25   43:ldc1            #31  <String ")">
	//   26   45:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   27   48:pop             
		return Pattern.compile(stringbuilder.toString());
	//   28   49:aload_1         
	//   29   50:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   30   53:invokestatic    #40  <Method Pattern Pattern.compile(String)>
	//   31   56:areturn         
	}

	public static double parseDoubleAttr(String s, Pattern pattern, String s1)
		throws ParserException
	{
		return Double.parseDouble(parseStringAttr(s, pattern, s1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #48  <Method String parseStringAttr(String, Pattern, String)>
	//    4    6:invokestatic    #54  <Method double Double.parseDouble(String)>
	//    5    9:dreturn         
	}

	public static int parseIntAttr(String s, Pattern pattern, String s1)
		throws ParserException
	{
		return Integer.parseInt(parseStringAttr(s, pattern, s1));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokestatic    #48  <Method String parseStringAttr(String, Pattern, String)>
	//    4    6:invokestatic    #63  <Method int Integer.parseInt(String)>
	//    5    9:ireturn         
	}

	public static boolean parseOptionalBooleanAttr(String s, Pattern pattern)
	{
		s = ((String) (pattern.matcher(((CharSequence) (s)))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #69  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_0        
		if(((Matcher) (s)).find())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #75  <Method boolean Matcher.find()>
	//*   6   10:ifeq            24
			return "YES".equals(((Object) (((Matcher) (s)).group(1))));
	//    7   13:ldc1            #11  <String "YES">
	//    8   15:aload_0         
	//    9   16:iconst_1        
	//   10   17:invokevirtual   #79  <Method String Matcher.group(int)>
	//   11   20:invokevirtual   #85  <Method boolean String.equals(Object)>
	//   12   23:ireturn         
		else
			return false;
	//   13   24:iconst_0        
	//   14   25:ireturn         
	}

	public static String parseOptionalStringAttr(String s, Pattern pattern)
	{
		s = ((String) (pattern.matcher(((CharSequence) (s)))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #69  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_0        
		if(((Matcher) (s)).find())
	//*   4    6:aload_0         
	//*   5    7:invokevirtual   #75  <Method boolean Matcher.find()>
	//*   6   10:ifeq            19
			return ((Matcher) (s)).group(1);
	//    7   13:aload_0         
	//    8   14:iconst_1        
	//    9   15:invokevirtual   #79  <Method String Matcher.group(int)>
	//   10   18:areturn         
		else
			return null;
	//   11   19:aconst_null     
	//   12   20:areturn         
	}

	public static String parseStringAttr(String s, Pattern pattern, String s1)
		throws ParserException
	{
		pattern = ((Pattern) (pattern.matcher(((CharSequence) (s)))));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #69  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    5:astore_1        
		if(((Matcher) (pattern)).find() && ((Matcher) (pattern)).groupCount() == 1)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #75  <Method boolean Matcher.find()>
	//*   6   10:ifeq            27
	//*   7   13:aload_1         
	//*   8   14:invokevirtual   #91  <Method int Matcher.groupCount()>
	//*   9   17:iconst_1        
	//*  10   18:icmpne          27
		{
			return ((Matcher) (pattern)).group(1);
	//   11   21:aload_1         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #79  <Method String Matcher.group(int)>
	//   14   26:areturn         
		} else
		{
			pattern = ((Pattern) (new StringBuilder()));
	//   15   27:new             #20  <Class StringBuilder>
	//   16   30:dup             
	//   17   31:invokespecial   #21  <Method void StringBuilder()>
	//   18   34:astore_1        
			((StringBuilder) (pattern)).append("Couldn't match ");
	//   19   35:aload_1         
	//   20   36:ldc1            #93  <String "Couldn't match ">
	//   21   38:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   22   41:pop             
			((StringBuilder) (pattern)).append(s1);
	//   23   42:aload_1         
	//   24   43:aload_2         
	//   25   44:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
			((StringBuilder) (pattern)).append(" tag in ");
	//   27   48:aload_1         
	//   28   49:ldc1            #95  <String " tag in ">
	//   29   51:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
			((StringBuilder) (pattern)).append(s);
	//   31   55:aload_1         
	//   32   56:aload_0         
	//   33   57:invokevirtual   #25  <Method StringBuilder StringBuilder.append(String)>
	//   34   60:pop             
			throw new ParserException(((StringBuilder) (pattern)).toString());
	//   35   61:new             #44  <Class ParserException>
	//   36   64:dup             
	//   37   65:aload_1         
	//   38   66:invokevirtual   #35  <Method String StringBuilder.toString()>
	//   39   69:invokespecial   #98  <Method void ParserException(String)>
	//   40   72:athrow          
		}
	}

	private static final String BOOLEAN_NO = "NO";
	private static final String BOOLEAN_YES = "YES";
}
