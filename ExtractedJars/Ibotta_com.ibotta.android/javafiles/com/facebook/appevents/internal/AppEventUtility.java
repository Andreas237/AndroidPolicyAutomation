// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.appevents.internal;

import com.facebook.internal.Utility;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AppEventUtility
{

	public static void assertIsMainThread()
	{
	//    0    0:return          
	}

	public static void assertIsNotMainThread()
	{
	//    0    0:return          
	}

	public static double normalizePrice(String s)
	{
label0:
		{
			double d;
			try
			{
				s = ((String) (Pattern.compile("[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?", 8).matcher(((CharSequence) (s)))));
	//    0    0:ldc1            #14  <String "[-+]*\\d+([\\,\\.]\\d+)*([\\.\\,]\\d+)?">
	//    1    2:bipush          8
	//    2    4:invokestatic    #20  <Method Pattern Pattern.compile(String, int)>
	//    3    7:aload_0         
	//    4    8:invokevirtual   #24  <Method Matcher Pattern.matcher(CharSequence)>
	//    5   11:astore_0        
				if(!((Matcher) (s)).find())
					break label0;
	//    6   12:aload_0         
	//    7   13:invokevirtual   #30  <Method boolean Matcher.find()>
	//    8   16:ifeq            41
				s = ((Matcher) (s)).group(0);
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #34  <Method String Matcher.group(int)>
	//   12   24:astore_0        
				d = NumberFormat.getNumberInstance(Utility.getCurrentLocale()).parse(s).doubleValue();
	//   13   25:invokestatic    #40  <Method java.util.Locale Utility.getCurrentLocale()>
	//   14   28:invokestatic    #46  <Method NumberFormat NumberFormat.getNumberInstance(java.util.Locale)>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #50  <Method Number NumberFormat.parse(String)>
	//   17   35:invokevirtual   #56  <Method double Number.doubleValue()>
	//   18   38:dstore_1        
			}
	//*  19   39:dload_1         
	//*  20   40:dreturn         
	//*  21   41:dconst_0        
	//*  22   42:dreturn         
			// Misplaced declaration of an exception variable
			catch(String s)
	//*  23   43:astore_0        
			{
				return 0.0D;
	//   24   44:dconst_0        
	//   25   45:dreturn         
			}
			return d;
		}
		return 0.0D;
	}
}
