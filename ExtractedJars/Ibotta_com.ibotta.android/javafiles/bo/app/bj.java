// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

// Referenced classes of package bo.app:
//			bv

public class bj
	implements bv
{

	public bj(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		a = context.getSharedPreferences("com.appboy.device", 0);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:ldc1            #16  <String "com.appboy.device">
	//    5    8:iconst_0        
	//    6    9:invokevirtual   #22  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    7   12:putfield        #24  <Field SharedPreferences a>
	//    8   15:return          
	}

	private void a(String s)
	{
		android.content.SharedPreferences.Editor editor = a.edit();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SharedPreferences a>
	//    2    4:invokeinterface #32  <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    3    9:astore_2        
		editor.putString("device_id", s);
	//    4   10:aload_2         
	//    5   11:ldc1            #34  <String "device_id">
	//    6   13:aload_1         
	//    7   14:invokeinterface #40  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//    8   19:pop             
		editor.putString("persistent_device_id", b());
	//    9   20:aload_2         
	//   10   21:ldc1            #42  <String "persistent_device_id">
	//   11   23:invokestatic    #46  <Method String b()>
	//   12   26:invokeinterface #40  <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   13   31:pop             
		editor.apply();
	//   14   32:aload_2         
	//   15   33:invokeinterface #49  <Method void android.content.SharedPreferences$Editor.apply()>
	//   16   38:return          
	}

	static String b()
	{
		return String.valueOf("android_id".hashCode());
	//    0    0:ldc1            #51  <String "android_id">
	//    1    2:invokevirtual   #57  <Method int String.hashCode()>
	//    2    5:invokestatic    #61  <Method String String.valueOf(int)>
	//    3    8:areturn         
	}

	private boolean c()
	{
		if(a.contains("persistent_device_id"))
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field SharedPreferences a>
	//*   2    4:ldc1            #42  <String "persistent_device_id">
	//*   3    6:invokeinterface #67  <Method boolean SharedPreferences.contains(String)>
	//*   4   11:ifeq            38
		{
			String s = a.getString("persistent_device_id", "");
	//    5   14:aload_0         
	//    6   15:getfield        #24  <Field SharedPreferences a>
	//    7   18:ldc1            #42  <String "persistent_device_id">
	//    8   20:ldc1            #69  <String "">
	//    9   22:invokeinterface #73  <Method String SharedPreferences.getString(String, String)>
	//   10   27:astore_1        
			return b().equals(((Object) (s))) ^ true;
	//   11   28:invokestatic    #46  <Method String b()>
	//   12   31:aload_1         
	//   13   32:invokevirtual   #77  <Method boolean String.equals(Object)>
	//   14   35:iconst_1        
	//   15   36:ixor            
	//   16   37:ireturn         
		} else
		{
			return false;
	//   17   38:iconst_0        
	//   18   39:ireturn         
		}
	}

	public String a()
	{
		String s = a.getString("device_id", ((String) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field SharedPreferences a>
	//    2    4:ldc1            #34  <String "device_id">
	//    3    6:aconst_null     
	//    4    7:invokeinterface #73  <Method String SharedPreferences.getString(String, String)>
	//    5   12:astore_1        
		if(c())
	//*   6   13:aload_0         
	//*   7   14:invokespecial   #80  <Method boolean c()>
	//*   8   17:ifeq            22
			s = null;
	//    9   20:aconst_null     
	//   10   21:astore_1        
		if(s == null)
	//*  11   22:aload_1         
	//*  12   23:ifnonnull       40
		{
			s = UUID.randomUUID().toString();
	//   13   26:invokestatic    #86  <Method UUID UUID.randomUUID()>
	//   14   29:invokevirtual   #89  <Method String UUID.toString()>
	//   15   32:astore_1        
			a(s);
	//   16   33:aload_0         
	//   17   34:aload_1         
	//   18   35:invokespecial   #91  <Method void a(String)>
			return s;
	//   19   38:aload_1         
	//   20   39:areturn         
		}
		if(!a.contains("persistent_device_id"))
	//*  21   40:aload_0         
	//*  22   41:getfield        #24  <Field SharedPreferences a>
	//*  23   44:ldc1            #42  <String "persistent_device_id">
	//*  24   46:invokeinterface #67  <Method boolean SharedPreferences.contains(String)>
	//*  25   51:ifne            59
			a(s);
	//   26   54:aload_0         
	//   27   55:aload_1         
	//   28   56:invokespecial   #91  <Method void a(String)>
		return s;
	//   29   59:aload_1         
	//   30   60:areturn         
	}

	final SharedPreferences a;
}
