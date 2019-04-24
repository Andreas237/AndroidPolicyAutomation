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
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}

	private static int getLayoutDirectionFromFirstChar(Locale locale)
	{
		switch(Character.getDirectionality(locale.getDisplayName(locale).charAt(0)))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #36  <Method String Locale.getDisplayName(Locale)>
	//*   3    5:iconst_0        
	//*   4    6:invokevirtual   #42  <Method char String.charAt(int)>
	//*   5    9:invokestatic    #48  <Method byte Character.getDirectionality(char)>
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
	//*   0    0:getstatic       #57  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return TextUtils.getLayoutDirectionFromLocale(locale);
	//    3    8:aload_0         
	//    4    9:invokestatic    #61  <Method int TextUtils.getLayoutDirectionFromLocale(Locale)>
	//    5   12:ireturn         
		if(locale != null && !locale.equals(((Object) (ROOT))))
	//*   6   13:aload_0         
	//*   7   14:ifnull          61
	//*   8   17:aload_0         
	//*   9   18:getstatic       #26  <Field Locale ROOT>
	//*  10   21:invokevirtual   #65  <Method boolean Locale.equals(Object)>
	//*  11   24:ifne            61
		{
			String s = ICUCompat.maximizeAndGetScript(locale);
	//   12   27:aload_0         
	//   13   28:invokestatic    #70  <Method String ICUCompat.maximizeAndGetScript(Locale)>
	//   14   31:astore_1        
			if(s == null)
	//*  15   32:aload_1         
	//*  16   33:ifnonnull       41
				return getLayoutDirectionFromFirstChar(locale);
	//   17   36:aload_0         
	//   18   37:invokestatic    #72  <Method int getLayoutDirectionFromFirstChar(Locale)>
	//   19   40:ireturn         
			if(s.equalsIgnoreCase("Arab") || s.equalsIgnoreCase("Hebr"))
	//*  20   41:aload_1         
	//*  21   42:ldc1            #8   <String "Arab">
	//*  22   44:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
	//*  23   47:ifne            59
	//*  24   50:aload_1         
	//*  25   51:ldc1            #11  <String "Hebr">
	//*  26   53:invokevirtual   #76  <Method boolean String.equalsIgnoreCase(String)>
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
		int i;
		StringBuilder stringbuilder;
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #57  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return TextUtils.htmlEncode(s);
	//    3    8:aload_0         
	//    4    9:invokestatic    #80  <Method String TextUtils.htmlEncode(String)>
	//    5   12:areturn         
		stringbuilder = new StringBuilder();
	//    6   13:new             #82  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #83  <Method void StringBuilder()>
	//    9   20:astore_3        
		i = 0;
	//   10   21:iconst_0        
	//   11   22:istore_2        
_L8:
		char c;
		if(i >= s.length())
			break MISSING_BLOCK_LABEL_151;
	//   12   23:iload_2         
	//   13   24:aload_0         
	//   14   25:invokevirtual   #87  <Method int String.length()>
	//   15   28:icmpge          151
		c = s.charAt(i);
	//   16   31:aload_0         
	//   17   32:iload_2         
	//   18   33:invokevirtual   #42  <Method char String.charAt(int)>
	//   19   36:istore_1        
		c;
	//   20   37:iload_1         
		JVM INSTR lookupswitch 5: default 88
	//	               34: 141
	//	               38: 121
	//	               39: 131
	//	               60: 101
	//	               62: 111;
	//   21   38:lookupswitch    5: default 88
	//	               34: 141
	//	               38: 121
	//	               39: 131
	//	               60: 101
	//	               62: 111
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L2:
		break MISSING_BLOCK_LABEL_141;
_L5:
		break; /* Loop/switch isn't completed */
_L1:
		stringbuilder.append(c);
	//   22   88:aload_3         
	//   23   89:iload_1         
	//   24   90:invokevirtual   #91  <Method StringBuilder StringBuilder.append(char)>
	//   25   93:pop             
_L9:
		i++;
	//   26   94:iload_2         
	//   27   95:iconst_1        
	//   28   96:iadd            
	//   29   97:istore_2        
		if(true) goto _L8; else goto _L7
	//   30   98:goto            23
_L7:
		stringbuilder.append("&lt;");
	//   31  101:aload_3         
	//   32  102:ldc1            #93  <String "&lt;">
	//   33  104:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   34  107:pop             
		  goto _L9
	//*  35  108:goto            94
_L6:
		stringbuilder.append("&gt;");
	//   36  111:aload_3         
	//   37  112:ldc1            #98  <String "&gt;">
	//   38  114:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   39  117:pop             
		  goto _L9
	//*  40  118:goto            94
_L3:
		stringbuilder.append("&amp;");
	//   41  121:aload_3         
	//   42  122:ldc1            #100 <String "&amp;">
	//   43  124:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   44  127:pop             
		  goto _L9
	//*  45  128:goto            94
_L4:
		stringbuilder.append("&#39;");
	//   46  131:aload_3         
	//   47  132:ldc1            #102 <String "&#39;">
	//   48  134:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   49  137:pop             
		  goto _L9
	//*  50  138:goto            94
		stringbuilder.append("&quot;");
	//   51  141:aload_3         
	//   52  142:ldc1            #104 <String "&quot;">
	//   53  144:invokevirtual   #96  <Method StringBuilder StringBuilder.append(String)>
	//   54  147:pop             
		  goto _L9
	//*  55  148:goto            94
		return stringbuilder.toString();
	//   56  151:aload_3         
	//   57  152:invokevirtual   #108 <Method String StringBuilder.toString()>
	//   58  155:areturn         
	}

	private static final String ARAB_SCRIPT_SUBTAG = "Arab";
	private static final String HEBR_SCRIPT_SUBTAG = "Hebr";
	public static final Locale ROOT = new Locale("", "");

	static 
	{
	//    0    0:new             #18  <Class Locale>
	//    1    3:dup             
	//    2    4:ldc1            #20  <String "">
	//    3    6:ldc1            #20  <String "">
	//    4    8:invokespecial   #24  <Method void Locale(String, String)>
	//    5   11:putstatic       #26  <Field Locale ROOT>
	//*   6   14:return          
	}
}
