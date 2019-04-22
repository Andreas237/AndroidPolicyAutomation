// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;

public class SharedPreferencesUtils
{

	private SharedPreferencesUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static void publishWorldReadableSharedPreferences(Context context, android.content.SharedPreferences.Editor editor, String s)
	{
		context = ((Context) (new File(context.getApplicationInfo().dataDir, "shared_prefs")));
	//    0    0:new             #14  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #20  <Method ApplicationInfo Context.getApplicationInfo()>
	//    4    8:getfield        #26  <Field String ApplicationInfo.dataDir>
	//    5   11:ldc1            #28  <String "shared_prefs">
	//    6   13:invokespecial   #31  <Method void File(String, String)>
	//    7   16:astore_0        
		File file = ((File) (context)).getParentFile();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #35  <Method File File.getParentFile()>
	//   10   21:astore_3        
		if(file != null)
	//*  11   22:aload_3         
	//*  12   23:ifnull          33
			file.setExecutable(true, false);
	//   13   26:aload_3         
	//   14   27:iconst_1        
	//   15   28:iconst_0        
	//   16   29:invokevirtual   #39  <Method boolean File.setExecutable(boolean, boolean)>
	//   17   32:pop             
		((File) (context)).setExecutable(true, false);
	//   18   33:aload_0         
	//   19   34:iconst_1        
	//   20   35:iconst_0        
	//   21   36:invokevirtual   #39  <Method boolean File.setExecutable(boolean, boolean)>
	//   22   39:pop             
		editor.commit();
	//   23   40:aload_1         
	//   24   41:invokeinterface #45  <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   25   46:pop             
		(new File(((File) (context)), String.valueOf(((Object) (s))).concat(".xml"))).setReadable(true, false);
	//   26   47:new             #14  <Class File>
	//   27   50:dup             
	//   28   51:aload_0         
	//   29   52:aload_2         
	//   30   53:invokestatic    #51  <Method String String.valueOf(Object)>
	//   31   56:ldc1            #53  <String ".xml">
	//   32   58:invokevirtual   #57  <Method String String.concat(String)>
	//   33   61:invokespecial   #60  <Method void File(File, String)>
	//   34   64:iconst_1        
	//   35   65:iconst_0        
	//   36   66:invokevirtual   #63  <Method boolean File.setReadable(boolean, boolean)>
	//   37   69:pop             
	//   38   70:return          
	}
}
