// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.StringUtils;

public class i
{

	public i(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		a = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #13  <String "com.appboy.offline.storagemap">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #19  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   12:putfield        #21  <Field SharedPreferences a>
	//    8   15:return          
	}

	public String a()
	{
		return a.getString("last_user", "");
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field SharedPreferences a>
	//    2    4:ldc1            #25  <String "last_user">
	//    3    6:ldc1            #27  <String "">
	//    4    8:invokeinterface #33  <Method String SharedPreferences.getString(String, String)>
	//    5   13:areturn         
	}

	public void a(String s)
	{
		StringUtils.checkNotNullOrEmpty(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method String StringUtils.checkNotNullOrEmpty(String)>
	//    2    4:pop             
		android.content.SharedPreferences.Editor editor = a.edit();
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field SharedPreferences a>
	//    5    9:invokeinterface #44  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   14:astore_2        
		editor.putString("last_user", s);
	//    7   15:aload_2         
	//    8   16:ldc1            #25  <String "last_user">
	//    9   18:aload_1         
	//   10   19:invokeinterface #50  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   11   24:pop             
		editor.apply();
	//   12   25:aload_2         
	//   13   26:invokeinterface #53  <Method void android.content.SharedPreferences$Editor.apply()>
	//   14   31:return          
	}

	public void b(String s)
	{
		StringUtils.checkNotNullOrEmpty(s);
	//    0    0:aload_1         
	//    1    1:invokestatic    #40  <Method String StringUtils.checkNotNullOrEmpty(String)>
	//    2    4:pop             
		android.content.SharedPreferences.Editor editor = a.edit();
	//    3    5:aload_0         
	//    4    6:getfield        #21  <Field SharedPreferences a>
	//    5    9:invokeinterface #44  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    6   14:astore_2        
		editor.putString("default_user", s);
	//    7   15:aload_2         
	//    8   16:ldc1            #56  <String "default_user">
	//    9   18:aload_1         
	//   10   19:invokeinterface #50  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   11   24:pop             
		editor.putString("last_user", s);
	//   12   25:aload_2         
	//   13   26:ldc1            #25  <String "last_user">
	//   14   28:aload_1         
	//   15   29:invokeinterface #50  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   16   34:pop             
		editor.apply();
	//   17   35:aload_2         
	//   18   36:invokeinterface #53  <Method void android.content.SharedPreferences$Editor.apply()>
	//   19   41:return          
	}

	private final SharedPreferences a;
}
