// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import com.appboy.support.AppboyLogger;

public class dw
{

	public dw(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		b = context.getSharedPreferences("persistent.com.appboy.storage.sdk_enabled_cache", 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #25  <String "persistent.com.appboy.storage.sdk_enabled_cache">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #31  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   12:putfield        #33  <Field SharedPreferences b>
	//    8   15:return          
	}

	public void a(boolean flag)
	{
		String s = a;
	//    0    0:getstatic       #18  <Field String a>
	//    1    3:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//    2    4:new             #36  <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #37  <Method void StringBuilder()>
	//    5   11:astore_3        
		stringbuilder.append("Setting Appboy SDK disabled to: ");
	//    6   12:aload_3         
	//    7   13:ldc1            #39  <String "Setting Appboy SDK disabled to: ">
	//    8   15:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//    9   18:pop             
		stringbuilder.append(flag);
	//   10   19:aload_3         
	//   11   20:iload_1         
	//   12   21:invokevirtual   #46  <Method StringBuilder StringBuilder.append(boolean)>
	//   13   24:pop             
		AppboyLogger.i(s, stringbuilder.toString());
	//   14   25:aload_2         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   17   30:invokestatic    #54  <Method int AppboyLogger.i(String, String)>
	//   18   33:pop             
		b.edit().putBoolean("appboy_sdk_disabled", flag).apply();
	//   19   34:aload_0         
	//   20   35:getfield        #33  <Field SharedPreferences b>
	//   21   38:invokeinterface #60  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   22   43:ldc1            #62  <String "appboy_sdk_disabled">
	//   23   45:iload_1         
	//   24   46:invokeinterface #68  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putBoolean(String, boolean)>
	//   25   51:invokeinterface #71  <Method void android.content.SharedPreferences$Editor.apply()>
	//   26   56:return          
	}

	public boolean a()
	{
		return b.getBoolean("appboy_sdk_disabled", false);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field SharedPreferences b>
	//    2    4:ldc1            #62  <String "appboy_sdk_disabled">
	//    3    6:iconst_0        
	//    4    7:invokeinterface #76  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//    5   12:ireturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(bo/app/dw);
	private final SharedPreferences b;

	static 
	{
	//    0    0:ldc1            #2   <Class dw>
	//    1    2:invokestatic    #16  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #18  <Field String a>
	//*   3    8:return          
	}
}
