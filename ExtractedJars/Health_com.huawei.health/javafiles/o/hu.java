// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;

// Referenced classes of package o:
//			gw, ft

public final class hu
{

	public hu()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public static String a(Context context, String s, String s1)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore          4
		Object obj1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          5
		String s2 = ((String) (obj));
	//    4    6:aload           4
	//    5    8:astore_3        
		String s3;
		try
		{
			s3 = PreferenceManager.getDefaultSharedPreferences(context).getString(s, s1);
	//    6    9:aload_0         
	//    7   10:invokestatic    #24  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    8   13:aload_1         
	//    9   14:aload_2         
	//   10   15:invokeinterface #30  <Method String SharedPreferences.getString(String, String)>
	//   11   20:astore          6
		}
	//*  12   22:aload           5
	//*  13   24:astore_2        
	//*  14   25:aload           4
	//*  15   27:astore_3        
	//*  16   28:aload           6
	//*  17   30:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  18   33:ifne            49
	//*  19   36:aload           4
	//*  20   38:astore_3        
	//*  21   39:aload_0         
	//*  22   40:invokestatic    #40  <Method String e(Context)>
	//*  23   43:aload           6
	//*  24   45:invokestatic    #44  <Method String gw.a(String, String)>
	//*  25   48:astore_2        
	//*  26   49:aload_2         
	//*  27   50:astore_3        
	//*  28   51:aload           6
	//*  29   53:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   56:ifne            95
	//*  31   59:aload_2         
	//*  32   60:astore_3        
	//*  33   61:aload_2         
	//*  34   62:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  35   65:ifeq            95
	//*  36   68:aload_2         
	//*  37   69:astore_3        
	//*  38   70:ldc1            #46  <String "cp">
	//*  39   72:ldc1            #48  <String "TriDesEncryptError">
	//*  40   74:ldc1            #50  <String "%s,%s">
	//*  41   76:iconst_2        
	//*  42   77:anewarray       Object[]
	//*  43   80:dup             
	//*  44   81:iconst_0        
	//*  45   82:aload_1         
	//*  46   83:aastore         
	//*  47   84:dup             
	//*  48   85:iconst_1        
	//*  49   86:aload           6
	//*  50   88:aastore         
	//*  51   89:invokestatic    #56  <Method String String.format(String, Object[])>
	//*  52   92:invokestatic    #61  <Method void ft.b(String, String, String)>
	//*  53   95:aload_2         
	//*  54   96:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  55   97:astore_0        
		{
			return s2;
	//   56   98:aload_3         
	//   57   99:areturn         
		}
		s1 = ((String) (obj1));
		s2 = ((String) (obj));
		if(TextUtils.isEmpty(((CharSequence) (s3))))
			break MISSING_BLOCK_LABEL_49;
		s2 = ((String) (obj));
		s1 = gw.a(e(context), s3);
		s2 = s1;
		if(TextUtils.isEmpty(((CharSequence) (s3))))
			break MISSING_BLOCK_LABEL_95;
		s2 = s1;
		if(!TextUtils.isEmpty(((CharSequence) (s1))))
			break MISSING_BLOCK_LABEL_95;
		s2 = s1;
		ft.b("cp", "TriDesEncryptError", String.format("%s,%s", new Object[] {
			s, s3
		}));
		return s1;
	}

	public static void b(Context context, String s)
	{
		try
		{
			PreferenceManager.getDefaultSharedPreferences(context).edit().remove(s).commit();
	//    0    0:aload_0         
	//    1    1:invokestatic    #24  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//    2    4:invokeinterface #68  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:invokeinterface #74  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    5   15:invokeinterface #78  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//    6   20:pop             
			return;
	//    7   21:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   8   22:astore_0        
		{
			return;
	//    9   23:return          
		}
	}

	public static void b(Context context, String s, String s1)
	{
		try
		{
			String s2 = gw.b(e(context), s1);
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method String e(Context)>
	//    2    4:aload_2         
	//    3    5:invokestatic    #81  <Method String gw.b(String, String)>
	//    4    8:astore_3        
			if(!TextUtils.isEmpty(((CharSequence) (s1))) && TextUtils.isEmpty(((CharSequence) (s2))))
	//*   5    9:aload_2         
	//*   6   10:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   7   13:ifne            47
	//*   8   16:aload_3         
	//*   9   17:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  10   20:ifeq            47
				ft.b("cp", "TriDesDecryptError", String.format("%s,%s", new Object[] {
					s, s1
				}));
	//   11   23:ldc1            #46  <String "cp">
	//   12   25:ldc1            #83  <String "TriDesDecryptError">
	//   13   27:ldc1            #50  <String "%s,%s">
	//   14   29:iconst_2        
	//   15   30:anewarray       Object[]
	//   16   33:dup             
	//   17   34:iconst_0        
	//   18   35:aload_1         
	//   19   36:aastore         
	//   20   37:dup             
	//   21   38:iconst_1        
	//   22   39:aload_2         
	//   23   40:aastore         
	//   24   41:invokestatic    #56  <Method String String.format(String, Object[])>
	//   25   44:invokestatic    #61  <Method void ft.b(String, String, String)>
			PreferenceManager.getDefaultSharedPreferences(context).edit().putString(s, s2).commit();
	//   26   47:aload_0         
	//   27   48:invokestatic    #24  <Method SharedPreferences PreferenceManager.getDefaultSharedPreferences(Context)>
	//   28   51:invokeinterface #68  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   29   56:aload_1         
	//   30   57:aload_3         
	//   31   58:invokeinterface #87  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   32   63:invokeinterface #78  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   33   68:pop             
			return;
	//   34   69:return          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  35   70:astore_0        
		{
			return;
	//   36   71:return          
		}
	}

	private static String e(Context context)
	{
		if(TextUtils.isEmpty(((CharSequence) (b))))
	//*   0    0:getstatic       #10  <Field String b>
	//*   1    3:invokestatic    #36  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    6:ifeq            48
		{
			String s = "";
	//    3    9:ldc1            #89  <String "">
	//    4   11:astore_1        
			try
			{
				context = ((Context) (context.getApplicationContext().getPackageName()));
	//    5   12:aload_0         
	//    6   13:invokevirtual   #95  <Method Context Context.getApplicationContext()>
	//    7   16:invokevirtual   #99  <Method String Context.getPackageName()>
	//    8   19:astore_0        
			}
	//*   9   20:new             #101 <Class StringBuilder>
	//*  10   23:dup             
	//*  11   24:invokespecial   #102 <Method void StringBuilder()>
	//*  12   27:aload_0         
	//*  13   28:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//*  14   31:ldc1            #108 <String "0000000000000000000000000000">
	//*  15   33:invokevirtual   #106 <Method StringBuilder StringBuilder.append(String)>
	//*  16   36:invokevirtual   #111 <Method String StringBuilder.toString()>
	//*  17   39:iconst_0        
	//*  18   40:bipush          24
	//*  19   42:invokevirtual   #115 <Method String String.substring(int, int)>
	//*  20   45:putstatic       #10  <Field String b>
	//*  21   48:getstatic       #10  <Field String b>
	//*  22   51:areturn         
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  23   52:astore_0        
			{
				context = ((Context) (s));
	//   24   53:aload_1         
	//   25   54:astore_0        
			}
			b = (new StringBuilder()).append(((String) (context))).append("0000000000000000000000000000").toString().substring(0, 24);
		}
		return b;
	//*  26   55:goto            20
	}

	private static String b = null;

	static 
	{
	//    0    0:aconst_null     
	//    1    1:putstatic       #10  <Field String b>
	//*   2    4:return          
	}
}
