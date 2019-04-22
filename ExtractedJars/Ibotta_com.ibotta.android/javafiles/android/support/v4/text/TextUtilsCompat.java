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

	private static int getLayoutDirectionFromFirstChar(Locale locale)
	{
		switch(Character.getDirectionality(locale.getDisplayName(locale).charAt(0)))
	//*   0    0:aload_0         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #26  <Method String Locale.getDisplayName(Locale)>
	//*   3    5:iconst_0        
	//*   4    6:invokevirtual   #32  <Method char String.charAt(int)>
	//*   5    9:invokestatic    #38  <Method byte Character.getDirectionality(char)>
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
	//*   0    0:getstatic       #47  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			return TextUtils.getLayoutDirectionFromLocale(locale);
	//    3    8:aload_0         
	//    4    9:invokestatic    #51  <Method int TextUtils.getLayoutDirectionFromLocale(Locale)>
	//    5   12:ireturn         
		if(locale != null && !locale.equals(((Object) (ROOT))))
	//*   6   13:aload_0         
	//*   7   14:ifnull          61
	//*   8   17:aload_0         
	//*   9   18:getstatic       #18  <Field Locale ROOT>
	//*  10   21:invokevirtual   #55  <Method boolean Locale.equals(Object)>
	//*  11   24:ifne            61
		{
			String s = ICUCompat.maximizeAndGetScript(locale);
	//   12   27:aload_0         
	//   13   28:invokestatic    #60  <Method String ICUCompat.maximizeAndGetScript(Locale)>
	//   14   31:astore_1        
			if(s == null)
	//*  15   32:aload_1         
	//*  16   33:ifnonnull       41
				return getLayoutDirectionFromFirstChar(locale);
	//   17   36:aload_0         
	//   18   37:invokestatic    #62  <Method int getLayoutDirectionFromFirstChar(Locale)>
	//   19   40:ireturn         
			if(s.equalsIgnoreCase("Arab") || s.equalsIgnoreCase("Hebr"))
	//*  20   41:aload_1         
	//*  21   42:ldc1            #64  <String "Arab">
	//*  22   44:invokevirtual   #68  <Method boolean String.equalsIgnoreCase(String)>
	//*  23   47:ifne            59
	//*  24   50:aload_1         
	//*  25   51:ldc1            #70  <String "Hebr">
	//*  26   53:invokevirtual   #68  <Method boolean String.equalsIgnoreCase(String)>
	//*  27   56:ifeq            61
				return 1;
	//   28   59:iconst_1        
	//   29   60:ireturn         
		}
		return 0;
	//   30   61:iconst_0        
	//   31   62:ireturn         
	}

	private static final Locale ROOT = new Locale("", "");

	static 
	{
	//    0    0:new             #10  <Class Locale>
	//    1    3:dup             
	//    2    4:ldc1            #12  <String "">
	//    3    6:ldc1            #12  <String "">
	//    4    8:invokespecial   #16  <Method void Locale(String, String)>
	//    5   11:putstatic       #18  <Field Locale ROOT>
	//*   6   14:return          
	}
}
