// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class GmsVersionParser
{

	private GmsVersionParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public static int parseBuildMajorVersion(int i)
	{
		if(i == -1)
	//*   0    0:iload_0         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          7
			return -1;
	//    3    5:iconst_m1       
	//    4    6:ireturn         
		else
			return i / 0x186a0;
	//    5    7:iload_0         
	//    6    8:ldc1            #18  <Int 0x186a0>
	//    7   10:idiv            
	//    8   11:ireturn         
	}

	public static long parseBuildNumber(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return -1L;
	//    2    4:ldc2w           #23  <Long -1L>
	//    3    7:lreturn         
		s = ((String) (zzdc().matcher(((CharSequence) (s)))));
	//    4    8:invokestatic    #28  <Method Pattern zzdc()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #34  <Method Matcher Pattern.matcher(CharSequence)>
	//    7   15:astore_0        
		if(((Matcher) (s)).find())
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #40  <Method boolean Matcher.find()>
	//*  10   20:ifeq            36
		{
			s = ((Matcher) (s)).group(2);
	//   11   23:aload_0         
	//   12   24:iconst_2        
	//   13   25:invokevirtual   #44  <Method String Matcher.group(int)>
	//   14   28:astore_0        
			long l;
			try
			{
				l = Long.parseLong(s);
	//   15   29:aload_0         
	//   16   30:invokestatic    #49  <Method long Long.parseLong(String)>
	//   17   33:lstore_1        
			}
	//*  18   34:lload_1         
	//*  19   35:lreturn         
	//*  20   36:ldc2w           #23  <Long -1L>
	//*  21   39:lreturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  22   40:astore_0        
			{
				return -1L;
	//   23   41:ldc2w           #23  <Long -1L>
	//   24   44:lreturn         
			}
			return l;
		} else
		{
			return -1L;
		}
	}

	public static int parseBuildType(String s)
	{
		long l = parseVariantCode(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #54  <Method long parseVariantCode(String)>
	//    2    4:lstore_1        
		if(l == -1L)
	//*   3    5:lload_1         
	//*   4    6:ldc2w           #23  <Long -1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		else
			return (int)(l / 10000L);
	//    9   15:lload_1         
	//   10   16:ldc2w           #55  <Long 10000L>
	//   11   19:ldiv            
	//   12   20:l2i             
	//   13   21:ireturn         
	}

	public static int parseBuildVersion(int i)
	{
		if(i == -1)
	//*   0    0:iload_0         
	//*   1    1:iconst_m1       
	//*   2    2:icmpne          7
			return -1;
	//    3    5:iconst_m1       
	//    4    6:ireturn         
		else
			return i / 1000;
	//    5    7:iload_0         
	//    6    8:sipush          1000
	//    7   11:idiv            
	//    8   12:ireturn         
	}

	public static int parseScreenDensity(String s)
	{
		long l = parseVariantCode(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #54  <Method long parseVariantCode(String)>
	//    2    4:lstore_1        
		if(l == -1L)
	//*   3    5:lload_1         
	//*   4    6:ldc2w           #23  <Long -1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		else
			return (int)(l % 100L);
	//    9   15:lload_1         
	//   10   16:ldc2w           #59  <Long 100L>
	//   11   19:lrem            
	//   12   20:l2i             
	//   13   21:ireturn         
	}

	public static int parseTargetArchitecture(String s)
	{
		long l = parseVariantCode(s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #54  <Method long parseVariantCode(String)>
	//    2    4:lstore_1        
		if(l == -1L)
	//*   3    5:lload_1         
	//*   4    6:ldc2w           #23  <Long -1L>
	//*   5    9:lcmp            
	//*   6   10:ifne            15
			return -1;
	//    7   13:iconst_m1       
	//    8   14:ireturn         
		else
			return (int)((l / 100L) % 100L);
	//    9   15:lload_1         
	//   10   16:ldc2w           #59  <Long 100L>
	//   11   19:ldiv            
	//   12   20:ldc2w           #59  <Long 100L>
	//   13   23:lrem            
	//   14   24:l2i             
	//   15   25:ireturn         
	}

	public static long parseVariantCode(String s)
	{
		if(s == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return -1L;
	//    2    4:ldc2w           #23  <Long -1L>
	//    3    7:lreturn         
		s = ((String) (zzdc().matcher(((CharSequence) (s)))));
	//    4    8:invokestatic    #28  <Method Pattern zzdc()>
	//    5   11:aload_0         
	//    6   12:invokevirtual   #34  <Method Matcher Pattern.matcher(CharSequence)>
	//    7   15:astore_0        
		if(((Matcher) (s)).find())
	//*   8   16:aload_0         
	//*   9   17:invokevirtual   #40  <Method boolean Matcher.find()>
	//*  10   20:ifeq            36
		{
			s = ((Matcher) (s)).group(1);
	//   11   23:aload_0         
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #44  <Method String Matcher.group(int)>
	//   14   28:astore_0        
			long l;
			try
			{
				l = Long.parseLong(s);
	//   15   29:aload_0         
	//   16   30:invokestatic    #49  <Method long Long.parseLong(String)>
	//   17   33:lstore_1        
			}
	//*  18   34:lload_1         
	//*  19   35:lreturn         
	//*  20   36:ldc2w           #23  <Long -1L>
	//*  21   39:lreturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  22   40:astore_0        
			{
				return -1L;
	//   23   41:ldc2w           #23  <Long -1L>
	//   24   44:lreturn         
			}
			return l;
		} else
		{
			return -1L;
		}
	}

	private static Pattern zzdc()
	{
		if(zzzy == null)
	//*   0    0:getstatic       #63  <Field Pattern zzzy>
	//*   1    3:ifnonnull       14
			zzzy = Pattern.compile("\\((?:eng-)?(\\d+)-(.+?)[-)$]");
	//    2    6:ldc1            #65  <String "\\((?:eng-)?(\\d+)-(.+?)[-)$]">
	//    3    8:invokestatic    #69  <Method Pattern Pattern.compile(String)>
	//    4   11:putstatic       #63  <Field Pattern zzzy>
		return zzzy;
	//    5   14:getstatic       #63  <Field Pattern zzzy>
	//    6   17:areturn         
	}

	public static final int UNKNOWN = -1;
	private static Pattern zzzy;

	static 
	{
	//    0    0:return          
	}
}
