// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.exoplayer2.text.webvtt:
//			WebvttCueParser

public final class WebvttParserUtil
{

	private WebvttParserUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
	//    2    4:return          
	}

	public static Matcher findNextCueHeader(ParsableByteArray parsablebytearray)
	{
		do
		{
			Object obj = ((Object) (parsablebytearray.readLine()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method String ParsableByteArray.readLine()>
	//    2    4:astore_1        
			if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          58
			{
				if(COMMENT.matcher(((CharSequence) (obj))).matches())
	//*   5    9:getstatic       #19  <Field Pattern COMMENT>
	//*   6   12:aload_1         
	//*   7   13:invokevirtual   #39  <Method Matcher Pattern.matcher(CharSequence)>
	//*   8   16:invokevirtual   #45  <Method boolean Matcher.matches()>
	//*   9   19:ifeq            41
				{
					do
						obj = ((Object) (parsablebytearray.readLine()));
	//   10   22:aload_0         
	//   11   23:invokevirtual   #35  <Method String ParsableByteArray.readLine()>
	//   12   26:astore_1        
					while(obj != null && !((String) (obj)).isEmpty());
	//   13   27:aload_1         
	//   14   28:ifnull          0
	//   15   31:aload_1         
	//   16   32:invokevirtual   #50  <Method boolean String.isEmpty()>
	//   17   35:ifne            0
				} else
	//*  18   38:goto            22
				{
					obj = ((Object) (WebvttCueParser.CUE_HEADER_PATTERN.matcher(((CharSequence) (obj)))));
	//   19   41:getstatic       #55  <Field Pattern WebvttCueParser.CUE_HEADER_PATTERN>
	//   20   44:aload_1         
	//   21   45:invokevirtual   #39  <Method Matcher Pattern.matcher(CharSequence)>
	//   22   48:astore_1        
					if(((Matcher) (obj)).matches())
	//*  23   49:aload_1         
	//*  24   50:invokevirtual   #45  <Method boolean Matcher.matches()>
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

	public static float parsePercentage(String s)
		throws NumberFormatException
	{
		if(!s.endsWith("%"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #61  <String "%">
	//*   2    3:invokevirtual   #65  <Method boolean String.endsWith(String)>
	//*   3    6:ifne            19
			throw new NumberFormatException("Percentages must end with %");
	//    4    9:new             #59  <Class NumberFormatException>
	//    5   12:dup             
	//    6   13:ldc1            #67  <String "Percentages must end with %">
	//    7   15:invokespecial   #70  <Method void NumberFormatException(String)>
	//    8   18:athrow          
		else
			return Float.parseFloat(s.substring(0, s.length() - 1)) / 100F;
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:aload_0         
	//   12   22:invokevirtual   #74  <Method int String.length()>
	//   13   25:iconst_1        
	//   14   26:isub            
	//   15   27:invokevirtual   #78  <Method String String.substring(int, int)>
	//   16   30:invokestatic    #83  <Method float Float.parseFloat(String)>
	//   17   33:ldc1            #84  <Float 100F>
	//   18   35:fdiv            
	//   19   36:freturn         
	}

	public static long parseTimestampUs(String s)
		throws NumberFormatException
	{
		s = ((String) (Util.splitAtFirst(s, "\\.")));
	//    0    0:aload_0         
	//    1    1:ldc1            #89  <String "\\.">
	//    2    3:invokestatic    #95  <Method String[] Util.splitAtFirst(String, String)>
	//    3    6:astore_0        
		int i = 0;
	//    4    7:iconst_0        
	//    5    8:istore_1        
		String as[] = Util.split(((String) (s[0])), ":");
	//    6    9:aload_0         
	//    7   10:iconst_0        
	//    8   11:aaload          
	//    9   12:ldc1            #97  <String ":">
	//   10   14:invokestatic    #100 <Method String[] Util.split(String, String)>
	//   11   17:astore          7
		long l = 0L;
	//   12   19:lconst_0        
	//   13   20:lstore_3        
		for(int j = as.length; i < j;)
	//*  14   21:aload           7
	//*  15   23:arraylength     
	//*  16   24:istore_2        
	//*  17   25:iload_1         
	//*  18   26:iload_2         
	//*  19   27:icmpge          55
		{
			long l1 = Long.parseLong(as[i]);
	//   20   30:aload           7
	//   21   32:iload_1         
	//   22   33:aaload          
	//   23   34:invokestatic    #105 <Method long Long.parseLong(String)>
	//   24   37:lstore          5
			i++;
	//   25   39:iload_1         
	//   26   40:iconst_1        
	//   27   41:iadd            
	//   28   42:istore_1        
			l = l * 60L + l1;
	//   29   43:lload_3         
	//   30   44:ldc2w           #106 <Long 60L>
	//   31   47:lmul            
	//   32   48:lload           5
	//   33   50:ladd            
	//   34   51:lstore_3        
		}

	//*  35   52:goto            25
		long l2 = l * 1000L;
	//   36   55:lload_3         
	//   37   56:ldc2w           #108 <Long 1000L>
	//   38   59:lmul            
	//   39   60:lstore          5
		l = l2;
	//   40   62:lload           5
	//   41   64:lstore_3        
		if(s.length == 2)
	//*  42   65:aload_0         
	//*  43   66:arraylength     
	//*  44   67:iconst_2        
	//*  45   68:icmpne          81
			l = l2 + Long.parseLong(((String) (s[1])));
	//   46   71:lload           5
	//   47   73:aload_0         
	//   48   74:iconst_1        
	//   49   75:aaload          
	//   50   76:invokestatic    #105 <Method long Long.parseLong(String)>
	//   51   79:ladd            
	//   52   80:lstore_3        
		return l * 1000L;
	//   53   81:lload_3         
	//   54   82:ldc2w           #108 <Long 1000L>
	//   55   85:lmul            
	//   56   86:lreturn         
	}

	public static void validateWebvttHeaderLine(ParsableByteArray parsablebytearray)
		throws SubtitleDecoderException
	{
		parsablebytearray = ((ParsableByteArray) (parsablebytearray.readLine()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method String ParsableByteArray.readLine()>
	//    2    4:astore_0        
		if(parsablebytearray != null && HEADER.matcher(((CharSequence) (parsablebytearray))).matches())
	//*   3    5:aload_0         
	//*   4    6:ifnull          26
	//*   5    9:getstatic       #23  <Field Pattern HEADER>
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #39  <Method Matcher Pattern.matcher(CharSequence)>
	//*   8   16:invokevirtual   #45  <Method boolean Matcher.matches()>
	//*   9   19:ifne            25
	//*  10   22:goto            26
		{
			return;
	//   11   25:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   12   26:new             #115 <Class StringBuilder>
	//   13   29:dup             
	//   14   30:invokespecial   #116 <Method void StringBuilder()>
	//   15   33:astore_1        
			stringbuilder.append("Expected WEBVTT. Got ");
	//   16   34:aload_1         
	//   17   35:ldc1            #118 <String "Expected WEBVTT. Got ">
	//   18   37:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   19   40:pop             
			stringbuilder.append(((String) (parsablebytearray)));
	//   20   41:aload_1         
	//   21   42:aload_0         
	//   22   43:invokevirtual   #122 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
			throw new SubtitleDecoderException(stringbuilder.toString());
	//   24   47:new             #113 <Class SubtitleDecoderException>
	//   25   50:dup             
	//   26   51:aload_1         
	//   27   52:invokevirtual   #125 <Method String StringBuilder.toString()>
	//   28   55:invokespecial   #126 <Method void SubtitleDecoderException(String)>
	//   29   58:athrow          
		}
	}

	private static final Pattern COMMENT = Pattern.compile("^NOTE(( |\t).*)?$");
	private static final Pattern HEADER = Pattern.compile("^\uFEFF?WEBVTT(( |\t).*)?$");

	static 
	{
	//    0    0:ldc1            #11  <String "^NOTE(( |\t).*)?$">
	//    1    2:invokestatic    #17  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #19  <Field Pattern COMMENT>
	//    3    8:ldc1            #21  <String "^\uFEFF?WEBVTT(( |\t).*)?$">
	//    4   10:invokestatic    #17  <Method Pattern Pattern.compile(String)>
	//    5   13:putstatic       #23  <Field Pattern HEADER>
	//*   6   16:return          
	}
}
