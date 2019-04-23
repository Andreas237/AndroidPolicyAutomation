// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.webvtt;

import com.google.android.exoplayer.ParserException;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class WebvttParserUtil
{

	private WebvttParserUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	public static float parsePercentage(String s)
		throws NumberFormatException
	{
		if(s.endsWith("%"))
	//*   0    0:aload_0         
	//*   1    1:ldc1            #28  <String "%">
	//*   2    3:invokevirtual   #34  <Method boolean String.endsWith(String)>
	//*   3    6:ifeq            27
			return Float.parseFloat(s.substring(0, s.length() - 1)) / 100F;
	//    4    9:aload_0         
	//    5   10:iconst_0        
	//    6   11:aload_0         
	//    7   12:invokevirtual   #38  <Method int String.length()>
	//    8   15:iconst_1        
	//    9   16:isub            
	//   10   17:invokevirtual   #42  <Method String String.substring(int, int)>
	//   11   20:invokestatic    #47  <Method float Float.parseFloat(String)>
	//   12   23:ldc1            #48  <Float 100F>
	//   13   25:fdiv            
	//   14   26:freturn         
		else
			throw new NumberFormatException("Percentages must end with %");
	//   15   27:new             #26  <Class NumberFormatException>
	//   16   30:dup             
	//   17   31:ldc1            #50  <String "Percentages must end with %">
	//   18   33:invokespecial   #53  <Method void NumberFormatException(String)>
	//   19   36:athrow          
	}

	public static long parseTimestampUs(String s)
		throws NumberFormatException
	{
		s = ((String) (s.split("\\.", 2)));
	//    0    0:aload_0         
	//    1    1:ldc1            #58  <String "\\.">
	//    2    3:iconst_2        
	//    3    4:invokevirtual   #62  <Method String[] String.split(String, int)>
	//    4    7:astore_0        
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_1        
		String as[] = ((String) (s[0])).split(":");
	//    7   10:aload_0         
	//    8   11:iconst_0        
	//    9   12:aaload          
	//   10   13:ldc1            #64  <String ":">
	//   11   15:invokevirtual   #67  <Method String[] String.split(String)>
	//   12   18:astore          4
		long l = 0L;
	//   13   20:lconst_0        
	//   14   21:lstore_2        
		for(; i < as.length; i++)
	//*  15   22:iload_1         
	//*  16   23:aload           4
	//*  17   25:arraylength     
	//*  18   26:icmpge          50
			l = l * 60L + Long.parseLong(as[i]);
	//   19   29:lload_2         
	//   20   30:ldc2w           #68  <Long 60L>
	//   21   33:lmul            
	//   22   34:aload           4
	//   23   36:iload_1         
	//   24   37:aaload          
	//   25   38:invokestatic    #74  <Method long Long.parseLong(String)>
	//   26   41:ladd            
	//   27   42:lstore_2        

	//   28   43:iload_1         
	//   29   44:iconst_1        
	//   30   45:iadd            
	//   31   46:istore_1        
	//*  32   47:goto            22
		return (l * 1000L + Long.parseLong(((String) (s[1])))) * 1000L;
	//   33   50:lload_2         
	//   34   51:ldc2w           #75  <Long 1000L>
	//   35   54:lmul            
	//   36   55:aload_0         
	//   37   56:iconst_1        
	//   38   57:aaload          
	//   39   58:invokestatic    #74  <Method long Long.parseLong(String)>
	//   40   61:ladd            
	//   41   62:ldc2w           #75  <Long 1000L>
	//   42   65:lmul            
	//   43   66:lreturn         
	}

	public static void validateWebvttHeaderLine(ParsableByteArray parsablebytearray)
		throws ParserException
	{
		parsablebytearray = ((ParsableByteArray) (parsablebytearray.readLine()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method String ParsableByteArray.readLine()>
	//    2    4:astore_0        
		if(parsablebytearray != null && HEADER.matcher(((CharSequence) (parsablebytearray))).matches())
	//*   3    5:aload_0         
	//*   4    6:ifnull          23
	//*   5    9:getstatic       #18  <Field Pattern HEADER>
	//*   6   12:aload_0         
	//*   7   13:invokevirtual   #90  <Method Matcher Pattern.matcher(CharSequence)>
	//*   8   16:invokevirtual   #96  <Method boolean Matcher.matches()>
	//*   9   19:ifeq            23
		{
			return;
	//   10   22:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   11   23:new             #98  <Class StringBuilder>
	//   12   26:dup             
	//   13   27:invokespecial   #99  <Method void StringBuilder()>
	//   14   30:astore_1        
			stringbuilder.append("Expected WEBVTT. Got ");
	//   15   31:aload_1         
	//   16   32:ldc1            #101 <String "Expected WEBVTT. Got ">
	//   17   34:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
			stringbuilder.append(((String) (parsablebytearray)));
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:invokevirtual   #105 <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			throw new ParserException(stringbuilder.toString());
	//   23   44:new             #80  <Class ParserException>
	//   24   47:dup             
	//   25   48:aload_1         
	//   26   49:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   27   52:invokespecial   #109 <Method void ParserException(String)>
	//   28   55:athrow          
		}
	}

	private static final Pattern HEADER = Pattern.compile("^\uFEFF?WEBVTT(( |\t).*)?$");

	static 
	{
	//    0    0:ldc1            #10  <String "^\uFEFF?WEBVTT(( |\t).*)?$">
	//    1    2:invokestatic    #16  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #18  <Field Pattern HEADER>
	//*   3    8:return          
	}
}
