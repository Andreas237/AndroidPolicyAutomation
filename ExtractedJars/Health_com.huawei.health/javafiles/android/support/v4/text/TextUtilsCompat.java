// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.text;

import java.util.Locale;

// Referenced classes of package android.support.v4.text:
//			ICUCompat, TextUtilsCompatJellybeanMr1

public final class TextUtilsCompat
{
	static class TextUtilsCompatImpl
	{

		private static int getLayoutDirectionFromFirstChar(Locale locale)
		{
			switch(Character.getDirectionality(locale.getDisplayName(locale).charAt(0)))
		//*   0    0:aload_0         
		//*   1    1:aload_0         
		//*   2    2:invokevirtual   #21  <Method String Locale.getDisplayName(Locale)>
		//*   3    5:iconst_0        
		//*   4    6:invokevirtual   #27  <Method char String.charAt(int)>
		//*   5    9:invokestatic    #33  <Method byte Character.getDirectionality(char)>
			{
		//*   6   12:tableswitch     0 2: default 40
		//		               0 45
		//		               1 43
		//		               2 43
		//*   7   40:goto            45
			case 1: // '\001'
			case 2: // '\002'
				return 1;
		//    8   43:iconst_1        
		//    9   44:ireturn         
			}
			return 0;
		//   10   45:iconst_0        
		//   11   46:ireturn         
		}

		public int getLayoutDirectionFromLocale(Locale locale)
		{
			if(locale != null && !locale.equals(((Object) (TextUtilsCompat.ROOT))))
		//*   0    0:aload_1         
		//*   1    1:ifnull          50
		//*   2    4:aload_1         
		//*   3    5:getstatic       #40  <Field Locale TextUtilsCompat.ROOT>
		//*   4    8:invokevirtual   #44  <Method boolean Locale.equals(Object)>
		//*   5   11:ifne            50
			{
				String s = ICUCompat.maximizeAndGetScript(locale);
		//    6   14:aload_1         
		//    7   15:invokestatic    #49  <Method String ICUCompat.maximizeAndGetScript(Locale)>
		//    8   18:astore_2        
				if(s == null)
		//*   9   19:aload_2         
		//*  10   20:ifnonnull       28
					return getLayoutDirectionFromFirstChar(locale);
		//   11   23:aload_1         
		//   12   24:invokestatic    #51  <Method int getLayoutDirectionFromFirstChar(Locale)>
		//   13   27:ireturn         
				if(s.equalsIgnoreCase(TextUtilsCompat.ARAB_SCRIPT_SUBTAG) || s.equalsIgnoreCase(TextUtilsCompat.HEBR_SCRIPT_SUBTAG))
		//*  14   28:aload_2         
		//*  15   29:getstatic       #55  <Field String TextUtilsCompat.ARAB_SCRIPT_SUBTAG>
		//*  16   32:invokevirtual   #59  <Method boolean String.equalsIgnoreCase(String)>
		//*  17   35:ifne            48
		//*  18   38:aload_2         
		//*  19   39:getstatic       #62  <Field String TextUtilsCompat.HEBR_SCRIPT_SUBTAG>
		//*  20   42:invokevirtual   #59  <Method boolean String.equalsIgnoreCase(String)>
		//*  21   45:ifeq            50
					return 1;
		//   22   48:iconst_1        
		//   23   49:ireturn         
			}
			return 0;
		//   24   50:iconst_0        
		//   25   51:ireturn         
		}

		public String htmlEncode(String s)
		{
			StringBuilder stringbuilder = new StringBuilder();
		//    0    0:new             #66  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:invokespecial   #67  <Method void StringBuilder()>
		//    3    7:astore          4
			for(int i = 0; i < s.length(); i++)
		//*   4    9:iconst_0        
		//*   5   10:istore_3        
		//*   6   11:iload_3         
		//*   7   12:aload_1         
		//*   8   13:invokevirtual   #71  <Method int String.length()>
		//*   9   16:icmpge          148
			{
				char c = s.charAt(i);
		//   10   19:aload_1         
		//   11   20:iload_3         
		//   12   21:invokevirtual   #27  <Method char String.charAt(int)>
		//   13   24:istore_2        
				switch(c)
		//*  14   25:iload_2         
				{
		//*  15   26:lookupswitch    5: default 76
		//		               34: 123
		//		               38: 101
		//		               39: 112
		//		               60: 79
		//		               62: 90
		//*  16   76:goto            134
				case 60: // '<'
					stringbuilder.append("&lt;");
		//   17   79:aload           4
		//   18   81:ldc1            #73  <String "&lt;">
		//   19   83:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   20   86:pop             
					break;

		//*  21   87:goto            141
				case 62: // '>'
					stringbuilder.append("&gt;");
		//   22   90:aload           4
		//   23   92:ldc1            #79  <String "&gt;">
		//   24   94:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   25   97:pop             
					break;

		//*  26   98:goto            141
				case 38: // '&'
					stringbuilder.append("&amp;");
		//   27  101:aload           4
		//   28  103:ldc1            #81  <String "&amp;">
		//   29  105:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   30  108:pop             
					break;

		//*  31  109:goto            141
				case 39: // '\''
					stringbuilder.append("&#39;");
		//   32  112:aload           4
		//   33  114:ldc1            #83  <String "&#39;">
		//   34  116:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   35  119:pop             
					break;

		//*  36  120:goto            141
				case 34: // '"'
					stringbuilder.append("&quot;");
		//   37  123:aload           4
		//   38  125:ldc1            #85  <String "&quot;">
		//   39  127:invokevirtual   #77  <Method StringBuilder StringBuilder.append(String)>
		//   40  130:pop             
					break;

		//*  41  131:goto            141
				default:
					stringbuilder.append(c);
		//   42  134:aload           4
		//   43  136:iload_2         
		//   44  137:invokevirtual   #88  <Method StringBuilder StringBuilder.append(char)>
		//   45  140:pop             
					break;
				}
			}

		//   46  141:iload_3         
		//   47  142:iconst_1        
		//   48  143:iadd            
		//   49  144:istore_3        
		//*  50  145:goto            11
			return stringbuilder.toString();
		//   51  148:aload           4
		//   52  150:invokevirtual   #92  <Method String StringBuilder.toString()>
		//   53  153:areturn         
		}

		TextUtilsCompatImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}

	static class TextUtilsCompatJellybeanMr1Impl extends TextUtilsCompatImpl
	{

		public int getLayoutDirectionFromLocale(Locale locale)
		{
			return TextUtilsCompatJellybeanMr1.getLayoutDirectionFromLocale(locale);
		//    0    0:aload_1         
		//    1    1:invokestatic    #19  <Method int TextUtilsCompatJellybeanMr1.getLayoutDirectionFromLocale(Locale)>
		//    2    4:ireturn         
		}

		public String htmlEncode(String s)
		{
			return TextUtilsCompatJellybeanMr1.htmlEncode(s);
		//    0    0:aload_1         
		//    1    1:invokestatic    #25  <Method String TextUtilsCompatJellybeanMr1.htmlEncode(String)>
		//    2    4:areturn         
		}

		TextUtilsCompatJellybeanMr1Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void TextUtilsCompat$TextUtilsCompatImpl()>
		//    2    4:return          
		}
	}


	private TextUtilsCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #50  <Method void Object()>
	//    2    4:return          
	}

	public static int getLayoutDirectionFromLocale(Locale locale)
	{
		return IMPL.getLayoutDirectionFromLocale(locale);
	//    0    0:getstatic       #30  <Field TextUtilsCompat$TextUtilsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #55  <Method int TextUtilsCompat$TextUtilsCompatImpl.getLayoutDirectionFromLocale(Locale)>
	//    3    7:ireturn         
	}

	public static String htmlEncode(String s)
	{
		return IMPL.htmlEncode(s);
	//    0    0:getstatic       #30  <Field TextUtilsCompat$TextUtilsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #61  <Method String TextUtilsCompat$TextUtilsCompatImpl.htmlEncode(String)>
	//    3    7:areturn         
	}

	static String ARAB_SCRIPT_SUBTAG = "Arab";
	static String HEBR_SCRIPT_SUBTAG = "Hebr";
	private static final TextUtilsCompatImpl IMPL;
	public static final Locale ROOT = new Locale("", "");

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #25  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          21
			IMPL = ((TextUtilsCompatImpl) (new TextUtilsCompatJellybeanMr1Impl()));
	//    3    8:new             #9   <Class TextUtilsCompat$TextUtilsCompatJellybeanMr1Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #28  <Method void TextUtilsCompat$TextUtilsCompatJellybeanMr1Impl()>
	//    6   15:putstatic       #30  <Field TextUtilsCompat$TextUtilsCompatImpl IMPL>
		else
	//*   7   18:goto            31
			IMPL = new TextUtilsCompatImpl();
	//    8   21:new             #6   <Class TextUtilsCompat$TextUtilsCompatImpl>
	//    9   24:dup             
	//   10   25:invokespecial   #31  <Method void TextUtilsCompat$TextUtilsCompatImpl()>
	//   11   28:putstatic       #30  <Field TextUtilsCompat$TextUtilsCompatImpl IMPL>
	//   12   31:new             #33  <Class Locale>
	//   13   34:dup             
	//   14   35:ldc1            #35  <String "">
	//   15   37:ldc1            #35  <String "">
	//   16   39:invokespecial   #38  <Method void Locale(String, String)>
	//   17   42:putstatic       #40  <Field Locale ROOT>
	//   18   45:ldc1            #42  <String "Arab">
	//   19   47:putstatic       #44  <Field String ARAB_SCRIPT_SUBTAG>
	//   20   50:ldc1            #46  <String "Hebr">
	//   21   52:putstatic       #48  <Field String HEBR_SCRIPT_SUBTAG>
	//*  22   55:return          
	}
}
