// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import android.text.TextUtils;
import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//			ICUCompat

public final class TextUtilsCompat
{

	private TextUtilsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	private static int getLayoutDirectionFromFirstChar(Locale locale)
	{
		switch(Character.getDirectionality(locale.getDisplayName(locale).charAt(0)))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #35  <Method String Locale.getDisplayName(Locale)>
	//*   3    5:iconst_0        
	//*   4    6:invokevirtual   #41  <Method char String.charAt(int)>
	//*   5    9:invokestatic    #47  <Method byte Character.getDirectionality(char)>
		{
	//*   6   12:tableswitch     1 2: default 36
	//	               1 38
	//	               2 38
		default:
			return 0;
	//    7   36:iconst_0        
	//    8   37:ireturn         

		case 1: // '\001'
		case 2: // '\002'
			return 1;
	//    9   38:iconst_1        
	//   10   39:ireturn         
		}
	}

	public static int getLayoutDirectionFromLocale(Locale locale)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return TextUtils.getLayoutDirectionFromLocale(locale);
	//    3    8:aload_0         
	//    4    9:invokestatic    #60  <Method int TextUtils.getLayoutDirectionFromLocale(Locale)>
	//    5   12:ireturn         
		if(locale != null && !locale.equals(((Object) (ROOT))))
	//*   6   13:aload_0         
	//*   7   14:ifnull          61
	//*   8   17:aload_0         
	//*   9   18:getstatic       #25  <Field Locale ROOT>
	//*  10   21:invokevirtual   #64  <Method boolean Locale.equals(Object)>
	//*  11   24:ifne            61
		{
			String s = ICUCompat.maximizeAndGetScript(locale);
	//   12   27:aload_0         
	//   13   28:invokestatic    #69  <Method String ICUCompat.maximizeAndGetScript(Locale)>
	//   14   31:astore_1        
			if(s == null)
	//*  15   32:aload_1         
	//*  16   33:ifnonnull       41
				return getLayoutDirectionFromFirstChar(locale);
	//   17   36:aload_0         
	//   18   37:invokestatic    #71  <Method int getLayoutDirectionFromFirstChar(Locale)>
	//   19   40:ireturn         
			if(s.equalsIgnoreCase("Arab") || s.equalsIgnoreCase("Hebr"))
	//*  20   41:aload_1         
	//*  21   42:ldc1            #8   <String "Arab">
	//*  22   44:invokevirtual   #75  <Method boolean String.equalsIgnoreCase(String)>
	//*  23   47:ifne            59
	//*  24   50:aload_1         
	//*  25   51:ldc1            #11  <String "Hebr">
	//*  26   53:invokevirtual   #75  <Method boolean String.equalsIgnoreCase(String)>
	//*  27   56:ifeq            61
				return 1;
	//   28   59:iconst_1        
	//   29   60:ireturn         
		}
		return 0;
	//   30   61:iconst_0        
	//   31   62:ireturn         
	}

	public static String htmlEncode(String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #56  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return TextUtils.htmlEncode(s);
	//    3    8:aload_0         
	//    4    9:invokestatic    #79  <Method String TextUtils.htmlEncode(String)>
	//    5   12:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//    6   13:new             #81  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #82  <Method void StringBuilder()>
	//    9   20:astore_3        
		for(int i = 0; i < s.length(); i++)
	//*  10   21:iconst_0        
	//*  11   22:istore_2        
	//*  12   23:iload_2         
	//*  13   24:aload_0         
	//*  14   25:invokevirtual   #86  <Method int String.length()>
	//*  15   28:icmpge          143
		{
			char c = s.charAt(i);
	//   16   31:aload_0         
	//   17   32:iload_2         
	//   18   33:invokevirtual   #41  <Method char String.charAt(int)>
	//   19   36:istore_1        
			if(c != '"')
	//*  20   37:iload_1         
	//*  21   38:bipush          34
	//*  22   40:icmpeq          129
			{
				if(c != '<')
	//*  23   43:iload_1         
	//*  24   44:bipush          60
	//*  25   46:icmpeq          119
				{
					if(c != '>')
	//*  26   49:iload_1         
	//*  27   50:bipush          62
	//*  28   52:icmpeq          109
						switch(c)
	//*  29   55:iload_1         
						{
	//*  30   56:tableswitch     38 39: default 80
	//	               38 99
	//	               39 89
						default:
							stringbuilder.append(c);
	//   31   80:aload_3         
	//   32   81:iload_1         
	//   33   82:invokevirtual   #90  <Method StringBuilder StringBuilder.append(char)>
	//   34   85:pop             
							break;

	//*  35   86:goto            136
						case 39: // '\''
							stringbuilder.append("&#39;");
	//   36   89:aload_3         
	//   37   90:ldc1            #92  <String "&#39;">
	//   38   92:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   39   95:pop             
							break;

	//*  40   96:goto            136
						case 38: // '&'
							stringbuilder.append("&amp;");
	//   41   99:aload_3         
	//   42  100:ldc1            #97  <String "&amp;">
	//   43  102:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   44  105:pop             
							break;
						}
					else
	//*  45  106:goto            136
						stringbuilder.append("&gt;");
	//   46  109:aload_3         
	//   47  110:ldc1            #99  <String "&gt;">
	//   48  112:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   49  115:pop             
				} else
	//*  50  116:goto            136
				{
					stringbuilder.append("&lt;");
	//   51  119:aload_3         
	//   52  120:ldc1            #101 <String "&lt;">
	//   53  122:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   54  125:pop             
				}
			} else
	//*  55  126:goto            136
			{
				stringbuilder.append("&quot;");
	//   56  129:aload_3         
	//   57  130:ldc1            #103 <String "&quot;">
	//   58  132:invokevirtual   #95  <Method StringBuilder StringBuilder.append(String)>
	//   59  135:pop             
			}
		}

	//   60  136:iload_2         
	//   61  137:iconst_1        
	//   62  138:iadd            
	//   63  139:istore_2        
	//*  64  140:goto            23
		return stringbuilder.toString();
	//   65  143:aload_3         
	//   66  144:invokevirtual   #107 <Method String StringBuilder.toString()>
	//   67  147:areturn         
	}

	private static final String ARAB_SCRIPT_SUBTAG = "Arab";
	private static final String HEBR_SCRIPT_SUBTAG = "Hebr";
	private static final Locale ROOT = new Locale("", "");

	static 
	{
	//    0    0:new             #17  <Class Locale>
	//    1    3:dup             
	//    2    4:ldc1            #19  <String "">
	//    3    6:ldc1            #19  <String "">
	//    4    8:invokespecial   #23  <Method void Locale(String, String)>
	//    5   11:putstatic       #25  <Field Locale ROOT>
	//*   6   14:return          
	}
}
