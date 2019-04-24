// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings
{

	private Strings()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:return          
	}

	public static String capitalize(String s)
	{
		if(s.length() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #32  <Method int String.length()>
	//*   2    4:ifne            9
			return s;
	//    3    7:aload_0         
	//    4    8:areturn         
		char c = s.charAt(0);
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:invokevirtual   #36  <Method char String.charAt(int)>
	//    8   14:istore_1        
		char c1 = Character.toUpperCase(c);
	//    9   15:iload_1         
	//   10   16:invokestatic    #42  <Method char Character.toUpperCase(char)>
	//   11   19:istore_2        
		if(c == c1)
	//*  12   20:iload_1         
	//*  13   21:iload_2         
	//*  14   22:icmpne          27
		{
			return s;
	//   15   25:aload_0         
	//   16   26:areturn         
		} else
		{
			s = s.substring(1);
	//   17   27:aload_0         
	//   18   28:iconst_1        
	//   19   29:invokevirtual   #46  <Method String String.substring(int)>
	//   20   32:astore_0        
			StringBuilder stringbuilder = new StringBuilder(1 + String.valueOf(((Object) (s))).length());
	//   21   33:new             #48  <Class StringBuilder>
	//   22   36:dup             
	//   23   37:iconst_1        
	//   24   38:aload_0         
	//   25   39:invokestatic    #52  <Method String String.valueOf(Object)>
	//   26   42:invokevirtual   #32  <Method int String.length()>
	//   27   45:iadd            
	//   28   46:invokespecial   #55  <Method void StringBuilder(int)>
	//   29   49:astore_3        
			stringbuilder.append(c1);
	//   30   50:aload_3         
	//   31   51:iload_2         
	//   32   52:invokevirtual   #59  <Method StringBuilder StringBuilder.append(char)>
	//   33   55:pop             
			stringbuilder.append(s);
	//   34   56:aload_3         
	//   35   57:aload_0         
	//   36   58:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   37   61:pop             
			return stringbuilder.toString();
	//   38   62:aload_3         
	//   39   63:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   40   66:areturn         
		}
	}

	public static String emptyToNull(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   2    2:aload_0         
	//*   3    3:invokestatic    #75  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   4    6:ifeq            11
			s1 = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		return s1;
	//    7   11:aload_1         
	//    8   12:areturn         
	}

	public static String format(String s, Bundle bundle)
	{
		Matcher matcher = zzaak.matcher(((CharSequence) (s)));
	//    0    0:getstatic       #19  <Field Pattern zzaak>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #82  <Method Matcher Pattern.matcher(CharSequence)>
	//    3    7:astore_2        
		if(matcher.find())
	//*   4    8:aload_2         
	//*   5    9:invokevirtual   #88  <Method boolean Matcher.find()>
	//*   6   12:ifeq            95
		{
			StringBuffer stringbuffer = new StringBuffer();
	//    7   15:new             #90  <Class StringBuffer>
	//    8   18:dup             
	//    9   19:invokespecial   #91  <Method void StringBuffer()>
	//   10   22:astore_3        
			do
			{
				s = matcher.group(1);
	//   11   23:aload_2         
	//   12   24:iconst_1        
	//   13   25:invokevirtual   #94  <Method String Matcher.group(int)>
	//   14   28:astore_0        
				Object obj = bundle.get(s);
	//   15   29:aload_1         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #100 <Method Object Bundle.get(String)>
	//   18   34:astore          4
				if(obj != null)
	//*  19   36:aload           4
	//*  20   38:ifnull          57
					s = obj.toString();
	//   21   41:aload           4
	//   22   43:invokevirtual   #101 <Method String Object.toString()>
	//   23   46:astore_0        
				else
	//*  24   47:aload_2         
	//*  25   48:aload_3         
	//*  26   49:aload_0         
	//*  27   50:invokevirtual   #105 <Method Matcher Matcher.appendReplacement(StringBuffer, String)>
	//*  28   53:pop             
	//*  29   54:goto            77
				if(bundle.containsKey(s))
	//*  30   57:aload_1         
	//*  31   58:aload_0         
	//*  32   59:invokevirtual   #109 <Method boolean Bundle.containsKey(String)>
	//*  33   62:ifeq            71
					s = "null";
	//   34   65:ldc1            #111 <String "null">
	//   35   67:astore_0        
				else
	//*  36   68:goto            47
					s = "";
	//   37   71:ldc1            #113 <String "">
	//   38   73:astore_0        
				matcher.appendReplacement(stringbuffer, s);
			} while(matcher.find());
	//   39   74:goto            47
	//   40   77:aload_2         
	//   41   78:invokevirtual   #88  <Method boolean Matcher.find()>
	//   42   81:ifne            23
			matcher.appendTail(stringbuffer);
	//   43   84:aload_2         
	//   44   85:aload_3         
	//   45   86:invokevirtual   #117 <Method StringBuffer Matcher.appendTail(StringBuffer)>
	//   46   89:pop             
			s = stringbuffer.toString();
	//   47   90:aload_3         
	//   48   91:invokevirtual   #118 <Method String StringBuffer.toString()>
	//   49   94:astore_0        
		}
		return s;
	//   50   95:aload_0         
	//   51   96:areturn         
	}

	public static boolean isEmptyOrWhitespace(String s)
	{
		return s == null || s.trim().isEmpty();
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:aload_0         
	//    3    5:invokevirtual   #122 <Method String String.trim()>
	//    4    8:invokevirtual   #124 <Method boolean String.isEmpty()>
	//    5   11:ifeq            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public static String nullToEmpty(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       9
			s1 = "";
	//    4    6:ldc1            #113 <String "">
	//    5    8:astore_1        
		return s1;
	//    6    9:aload_1         
	//    7   10:areturn         
	}

	public static String padEnd(String s, int i, char c)
	{
		Preconditions.checkNotNull(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #133 <Method Object Preconditions.checkNotNull(Object)>
	//    2    4:pop             
		if(s.length() >= i)
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #32  <Method int String.length()>
	//*   5    9:iload_1         
	//*   6   10:icmplt          15
			return s;
	//    7   13:aload_0         
	//    8   14:areturn         
		StringBuilder stringbuilder = new StringBuilder(i);
	//    9   15:new             #48  <Class StringBuilder>
	//   10   18:dup             
	//   11   19:iload_1         
	//   12   20:invokespecial   #55  <Method void StringBuilder(int)>
	//   13   23:astore          4
		stringbuilder.append(s);
	//   14   25:aload           4
	//   15   27:aload_0         
	//   16   28:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   17   31:pop             
		for(int j = s.length(); j < i; j++)
	//*  18   32:aload_0         
	//*  19   33:invokevirtual   #32  <Method int String.length()>
	//*  20   36:istore_3        
	//*  21   37:iload_3         
	//*  22   38:iload_1         
	//*  23   39:icmpge          56
			stringbuilder.append(c);
	//   24   42:aload           4
	//   25   44:iload_2         
	//   26   45:invokevirtual   #59  <Method StringBuilder StringBuilder.append(char)>
	//   27   48:pop             

	//   28   49:iload_3         
	//   29   50:iconst_1        
	//   30   51:iadd            
	//   31   52:istore_3        
	//*  32   53:goto            37
		return stringbuilder.toString();
	//   33   56:aload           4
	//   34   58:invokevirtual   #66  <Method String StringBuilder.toString()>
	//   35   61:areturn         
	}

	private static final Pattern zzaak = Pattern.compile("\\$\\{(.*?)\\}");

	static 
	{
	//    0    0:ldc1            #11  <String "\\$\\{(.*?)\\}">
	//    1    2:invokestatic    #17  <Method Pattern Pattern.compile(String)>
	//    2    5:putstatic       #19  <Field Pattern zzaak>
	//*   3    8:return          
	}
}
