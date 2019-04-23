// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package afu.plume;

import java.util.regex.*;

public final class RegexUtil
{
	public static class CheckedPatternSyntaxException extends Exception
	{

		public String getDescription()
		{
			return pse.getDescription();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field PatternSyntaxException pse>
		//    2    4:invokevirtual   #32  <Method String PatternSyntaxException.getDescription()>
		//    3    7:areturn         
		}

		public int getIndex()
		{
			return pse.getIndex();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field PatternSyntaxException pse>
		//    2    4:invokevirtual   #36  <Method int PatternSyntaxException.getIndex()>
		//    3    7:ireturn         
		}

		public String getMessage()
		{
			return pse.getMessage();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field PatternSyntaxException pse>
		//    2    4:invokevirtual   #39  <Method String PatternSyntaxException.getMessage()>
		//    3    7:areturn         
		}

		public String getPattern()
		{
			return pse.getPattern();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field PatternSyntaxException pse>
		//    2    4:invokevirtual   #42  <Method String PatternSyntaxException.getPattern()>
		//    3    7:areturn         
		}

		private static final long serialVersionUID = 0xa4752688L;
		private final PatternSyntaxException pse;

		public CheckedPatternSyntaxException(String s, String s1, int i)
		{
			this(new PatternSyntaxException(s, s1, i));
		//    0    0:aload_0         
		//    1    1:new             #17  <Class PatternSyntaxException>
		//    2    4:dup             
		//    3    5:aload_1         
		//    4    6:aload_2         
		//    5    7:iload_3         
		//    6    8:invokespecial   #19  <Method void PatternSyntaxException(String, String, int)>
		//    7   11:invokespecial   #22  <Method void RegexUtil$CheckedPatternSyntaxException(PatternSyntaxException)>
		//    8   14:return          
		}

		public CheckedPatternSyntaxException(PatternSyntaxException patternsyntaxexception)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Exception()>
			pse = patternsyntaxexception;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field PatternSyntaxException pse>
		//    5    9:return          
		}
	}


	private RegexUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		throw new Error("do not instantiate");
	//    2    4:new             #13  <Class Error>
	//    3    7:dup             
	//    4    8:ldc1            #15  <String "do not instantiate">
	//    5   10:invokespecial   #18  <Method void Error(String)>
	//    6   13:athrow          
	}

	public static String asRegex(String s)
	{
		return asRegex(s, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #24  <Method String asRegex(String, int)>
	//    3    5:areturn         
	}

	public static String asRegex(String s, int i)
	{
		int j;
		try
		{
			j = getGroupCount(Pattern.compile(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method Pattern Pattern.compile(String)>
	//    2    4:invokestatic    #36  <Method int getGroupCount(Pattern)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:iload_1         
	//*   6   10:icmplt          15
	//*   7   13:aload_0         
	//*   8   14:areturn         
	//*   9   15:new             #13  <Class Error>
	//*  10   18:dup             
	//*  11   19:aload_0         
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:invokestatic    #40  <Method String regexErrorMessage(String, int, int)>
	//*  15   25:invokespecial   #18  <Method void Error(String)>
	//*  16   28:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  17   29:astore_0        
		{
			throw new Error(((Throwable) (s)));
	//   18   30:new             #13  <Class Error>
	//   19   33:dup             
	//   20   34:aload_0         
	//   21   35:invokespecial   #43  <Method void Error(Throwable)>
	//   22   38:athrow          
		}
		if(j >= i)
			return s;
		throw new Error(regexErrorMessage(s, i, j));
	}

	private static int getGroupCount(Pattern pattern)
	{
		return pattern.matcher("").groupCount();
	//    0    0:aload_0         
	//    1    1:ldc1            #45  <String "">
	//    2    3:invokevirtual   #49  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    6:invokevirtual   #55  <Method int Matcher.groupCount()>
	//    4    9:ireturn         
	}

	public static boolean isRegex(char c)
	{
		return isRegex(Character.toString(c));
	//    0    0:iload_0         
	//    1    1:invokestatic    #63  <Method String Character.toString(char)>
	//    2    4:invokestatic    #66  <Method boolean isRegex(String)>
	//    3    7:ireturn         
	}

	public static boolean isRegex(String s)
	{
		return isRegex(s, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #69  <Method boolean isRegex(String, int)>
	//    3    5:ireturn         
	}

	public static boolean isRegex(String s, int i)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		try
		{
			s = ((String) (Pattern.compile(s)));
	//    2    2:aload_0         
	//    3    3:invokestatic    #32  <Method Pattern Pattern.compile(String)>
	//    4    6:astore_0        
		}
	//*   5    7:aload_0         
	//*   6    8:invokestatic    #36  <Method int getGroupCount(Pattern)>
	//*   7   11:iload_1         
	//*   8   12:icmplt          17
	//*   9   15:iconst_1        
	//*  10   16:istore_2        
	//*  11   17:iload_2         
	//*  12   18:ireturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  13   19:astore_0        
		{
			return false;
	//   14   20:iconst_0        
	//   15   21:ireturn         
		}
		if(getGroupCount(((Pattern) (s))) >= i)
			flag = true;
		return flag;
	}

	public static String regexError(String s)
	{
		return regexError(s, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #72  <Method String regexError(String, int)>
	//    3    5:areturn         
	}

	public static String regexError(String s, int i)
	{
		int j;
		try
		{
			j = getGroupCount(Pattern.compile(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method Pattern Pattern.compile(String)>
	//    2    4:invokestatic    #36  <Method int getGroupCount(Pattern)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:iload_1         
	//*   6   10:icmpge          22
	//*   7   13:aload_0         
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:invokestatic    #40  <Method String regexErrorMessage(String, int, int)>
	//*  11   19:astore_0        
	//*  12   20:aload_0         
	//*  13   21:areturn         
	//*  14   22:aconst_null     
	//*  15   23:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  16   24:astore_0        
		{
			return ((PatternSyntaxException) (s)).getMessage();
	//   17   25:aload_0         
	//   18   26:invokevirtual   #76  <Method String PatternSyntaxException.getMessage()>
	//   19   29:areturn         
		}
		if(j >= i)
			break MISSING_BLOCK_LABEL_22;
		s = regexErrorMessage(s, i, j);
		return s;
		return null;
	}

	private static String regexErrorMessage(String s, int i, int j)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #78  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #79  <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("regex \"");
	//    4    8:aload_3         
	//    5    9:ldc1            #81  <String "regex \"">
	//    6   11:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("\" has ");
	//   12   21:aload_3         
	//   13   22:ldc1            #87  <String "\" has ">
	//   14   24:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		stringbuilder.append(j);
	//   16   28:aload_3         
	//   17   29:iload_2         
	//   18   30:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
	//   19   33:pop             
		stringbuilder.append(" groups, but ");
	//   20   34:aload_3         
	//   21   35:ldc1            #92  <String " groups, but ">
	//   22   37:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   23   40:pop             
		stringbuilder.append(i);
	//   24   41:aload_3         
	//   25   42:iload_1         
	//   26   43:invokevirtual   #90  <Method StringBuilder StringBuilder.append(int)>
	//   27   46:pop             
		stringbuilder.append(" groups are needed.");
	//   28   47:aload_3         
	//   29   48:ldc1            #94  <String " groups are needed.">
	//   30   50:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   31   53:pop             
		return stringbuilder.toString();
	//   32   54:aload_3         
	//   33   55:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   34   58:areturn         
	}

	public static PatternSyntaxException regexException(String s)
	{
		return regexException(s, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #101 <Method PatternSyntaxException regexException(String, int)>
	//    3    5:areturn         
	}

	public static PatternSyntaxException regexException(String s, int i)
	{
		int j;
		try
		{
			j = getGroupCount(Pattern.compile(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #32  <Method Pattern Pattern.compile(String)>
	//    2    4:invokestatic    #36  <Method int getGroupCount(Pattern)>
	//    3    7:istore_2        
		}
	//*   4    8:iload_2         
	//*   5    9:iload_1         
	//*   6   10:icmpge          31
	//*   7   13:new             #26  <Class PatternSyntaxException>
	//*   8   16:dup             
	//*   9   17:aload_0         
	//*  10   18:iload_1         
	//*  11   19:iload_2         
	//*  12   20:invokestatic    #40  <Method String regexErrorMessage(String, int, int)>
	//*  13   23:aload_0         
	//*  14   24:iconst_m1       
	//*  15   25:invokespecial   #104 <Method void PatternSyntaxException(String, String, int)>
	//*  16   28:astore_0        
	//*  17   29:aload_0         
	//*  18   30:areturn         
	//*  19   31:aconst_null     
	//*  20   32:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  21   33:astore_0        
		{
			return ((PatternSyntaxException) (s));
	//   22   34:aload_0         
	//   23   35:areturn         
		}
		if(j >= i)
			break MISSING_BLOCK_LABEL_31;
		s = ((String) (new PatternSyntaxException(regexErrorMessage(s, i, j), s, -1)));
		return ((PatternSyntaxException) (s));
		return null;
	}
}
