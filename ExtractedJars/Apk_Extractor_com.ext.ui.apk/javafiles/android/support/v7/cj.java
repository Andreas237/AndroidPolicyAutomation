// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.Environment;
import com.ext.ui.ExtractorApplication;
import java.io.File;

public class cj
{

	private cj()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #93  <Method void Object()>
		k = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #95  <Field SharedPreferences k>
		k = ExtractorApplication.a.getSharedPreferences(ExtractorApplication.a.getResources().getString(0x7f0d0009), 0);
	//    5    9:aload_0         
	//    6   10:getstatic       #29  <Field Context ExtractorApplication.a>
	//    7   13:getstatic       #29  <Field Context ExtractorApplication.a>
	//    8   16:invokevirtual   #35  <Method Resources Context.getResources()>
	//    9   19:ldc1            #96  <Int 0x7f0d0009>
	//   10   21:invokevirtual   #42  <Method String Resources.getString(int)>
	//   11   24:iconst_0        
	//   12   25:invokevirtual   #100 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   13   28:putfield        #95  <Field SharedPreferences k>
		b();
	//   14   31:aload_0         
	//   15   32:invokespecial   #102 <Method void b()>
	//   16   35:return          
	}

	public static cj a()
	{
		return j;
	//    0    0:getstatic       #91  <Field cj j>
	//    1    3:areturn         
	}

	private void b()
	{
	//    0    0:return          
	}

	public boolean a(String s, String s1)
	{
		return k.edit().putString(s, s1).commit();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field SharedPreferences k>
	//    2    4:invokeinterface #110 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:aload_2         
	//    5   11:invokeinterface #116 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    6   16:invokeinterface #120 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//    7   21:ireturn         
	}

	public boolean a(String s, boolean flag)
	{
		return k.edit().putBoolean(s, flag).commit();
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field SharedPreferences k>
	//    2    4:invokeinterface #110 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:aload_1         
	//    4   10:iload_2         
	//    5   11:invokeinterface #125 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//    6   16:invokeinterface #120 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//    7   21:ireturn         
	}

	public String b(String s, String s1)
	{
		return k.getString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field SharedPreferences k>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #128 <Method String SharedPreferences.getString(String, String)>
	//    5   11:areturn         
	}

	public boolean b(String s, boolean flag)
	{
		return k.getBoolean(s, flag);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field SharedPreferences k>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokeinterface #131 <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   11:ireturn         
	}

	public String c(String s, String s1)
	{
		return k.getString(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #95  <Field SharedPreferences k>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #128 <Method String SharedPreferences.getString(String, String)>
	//    5   11:areturn         
	}

	public static String a;
	public static String b;
	public static String c;
	public static String d;
	public static String e;
	public static String f;
	public static String g = "key_premium";
	public static final String h;
	private static String i;
	private static cj j = new cj();
	private SharedPreferences k;

	static 
	{
		a = "/ExtractedApks/";
	//    0    0:ldc1            #22  <String "/ExtractedApks/">
	//    1    2:putstatic       #24  <Field String a>
		b = ExtractorApplication.a.getResources().getString(0x7f0d000c);
	//    2    5:getstatic       #29  <Field Context ExtractorApplication.a>
	//    3    8:invokevirtual   #35  <Method Resources Context.getResources()>
	//    4   11:ldc1            #36  <Int 0x7f0d000c>
	//    5   13:invokevirtual   #42  <Method String Resources.getString(int)>
	//    6   16:putstatic       #44  <Field String b>
		c = ExtractorApplication.a.getResources().getString(0x7f0d000b);
	//    7   19:getstatic       #29  <Field Context ExtractorApplication.a>
	//    8   22:invokevirtual   #35  <Method Resources Context.getResources()>
	//    9   25:ldc1            #45  <Int 0x7f0d000b>
	//   10   27:invokevirtual   #42  <Method String Resources.getString(int)>
	//   11   30:putstatic       #47  <Field String c>
		d = ExtractorApplication.a.getResources().getString(0x7f0d000a);
	//   12   33:getstatic       #29  <Field Context ExtractorApplication.a>
	//   13   36:invokevirtual   #35  <Method Resources Context.getResources()>
	//   14   39:ldc1            #48  <Int 0x7f0d000a>
	//   15   41:invokevirtual   #42  <Method String Resources.getString(int)>
	//   16   44:putstatic       #50  <Field String d>
		e = ExtractorApplication.a.getResources().getString(0x7f0d004d);
	//   17   47:getstatic       #29  <Field Context ExtractorApplication.a>
	//   18   50:invokevirtual   #35  <Method Resources Context.getResources()>
	//   19   53:ldc1            #51  <Int 0x7f0d004d>
	//   20   55:invokevirtual   #42  <Method String Resources.getString(int)>
	//   21   58:putstatic       #53  <Field String e>
		f = ExtractorApplication.a.getResources().getString(0x7f0d0056);
	//   22   61:getstatic       #29  <Field Context ExtractorApplication.a>
	//   23   64:invokevirtual   #35  <Method Resources Context.getResources()>
	//   24   67:ldc1            #54  <Int 0x7f0d0056>
	//   25   69:invokevirtual   #42  <Method String Resources.getString(int)>
	//   26   72:putstatic       #56  <Field String f>
	//   27   75:ldc1            #58  <String "key_premium">
	//   28   77:putstatic       #60  <Field String g>
		i = (new StringBuilder()).append(Environment.getExternalStorageDirectory().getAbsolutePath()).append(a).toString();
	//   29   80:new             #62  <Class StringBuilder>
	//   30   83:dup             
	//   31   84:invokespecial   #65  <Method void StringBuilder()>
	//   32   87:invokestatic    #71  <Method File Environment.getExternalStorageDirectory()>
	//   33   90:invokevirtual   #77  <Method String File.getAbsolutePath()>
	//   34   93:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   35   96:getstatic       #24  <Field String a>
	//   36   99:invokevirtual   #81  <Method StringBuilder StringBuilder.append(String)>
	//   37  102:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   38  105:putstatic       #86  <Field String i>
		h = i;
	//   39  108:getstatic       #86  <Field String i>
	//   40  111:putstatic       #88  <Field String h>
	//   41  114:new             #2   <Class cj>
	//   42  117:dup             
	//   43  118:invokespecial   #89  <Method void cj()>
	//   44  121:putstatic       #91  <Field cj j>
	//*  45  124:return          
	}
}
