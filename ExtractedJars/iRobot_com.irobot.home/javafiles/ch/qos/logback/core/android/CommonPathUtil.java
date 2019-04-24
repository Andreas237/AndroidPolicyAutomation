// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.android;

import android.os.Environment;
import ch.qos.logback.core.util.EnvUtil;
import ch.qos.logback.core.util.OptionHelper;
import java.io.File;

public abstract class CommonPathUtil
{

	public CommonPathUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static String getAssetsDirectoryPath()
	{
		return "assets";
	//    0    0:ldc1            #8   <String "assets">
	//    1    2:areturn         
	}

	public static String getDatabaseDirectoryPath(String s)
	{
		String s1;
		if(EnvUtil.isAndroidOS())
	//*   0    0:invokestatic    #23  <Method boolean EnvUtil.isAndroidOS()>
	//*   1    3:ifeq            16
			s1 = Environment.getDataDirectory().getAbsolutePath();
	//    2    6:invokestatic    #29  <Method File Environment.getDataDirectory()>
	//    3    9:invokevirtual   #34  <Method String File.getAbsolutePath()>
	//    4   12:astore_1        
		else
	//*   5   13:goto            19
			s1 = "/data";
	//    6   16:ldc1            #36  <String "/data">
	//    7   18:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   19:new             #38  <Class StringBuilder>
	//    9   22:dup             
	//   10   23:invokespecial   #39  <Method void StringBuilder()>
	//   11   26:astore_2        
		stringbuilder.append(s1);
	//   12   27:aload_2         
	//   13   28:aload_1         
	//   14   29:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append("/data/");
	//   16   33:aload_2         
	//   17   34:ldc1            #45  <String "/data/">
	//   18   36:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(s);
	//   20   40:aload_2         
	//   21   41:aload_0         
	//   22   42:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append("/databases");
	//   24   46:aload_2         
	//   25   47:ldc1            #47  <String "/databases">
	//   26   49:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		return stringbuilder.toString();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   30   57:areturn         
	}

	public static String getExternalStorageDirectoryPath()
	{
		if(EnvUtil.isAndroidOS())
	//*   0    0:invokestatic    #23  <Method boolean EnvUtil.isAndroidOS()>
	//*   1    3:ifeq            13
			return Environment.getExternalStorageDirectory().getAbsolutePath();
	//    2    6:invokestatic    #54  <Method File Environment.getExternalStorageDirectory()>
	//    3    9:invokevirtual   #34  <Method String File.getAbsolutePath()>
	//    4   12:areturn         
		String s1 = OptionHelper.getEnv("EXTERNAL_STORAGE");
	//    5   13:ldc1            #56  <String "EXTERNAL_STORAGE">
	//    6   15:invokestatic    #61  <Method String OptionHelper.getEnv(String)>
	//    7   18:astore_1        
		String s = s1;
	//    8   19:aload_1         
	//    9   20:astore_0        
		if(s1 == null)
	//*  10   21:aload_1         
	//*  11   22:ifnonnull       28
			s = "/sdcard";
	//   12   25:ldc1            #63  <String "/sdcard">
	//   13   27:astore_0        
		return s;
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	public static String getFilesDirectoryPath(String s)
	{
		String s1;
		if(EnvUtil.isAndroidOS())
	//*   0    0:invokestatic    #23  <Method boolean EnvUtil.isAndroidOS()>
	//*   1    3:ifeq            16
			s1 = Environment.getDataDirectory().getAbsolutePath();
	//    2    6:invokestatic    #29  <Method File Environment.getDataDirectory()>
	//    3    9:invokevirtual   #34  <Method String File.getAbsolutePath()>
	//    4   12:astore_1        
		else
	//*   5   13:goto            19
			s1 = "/data";
	//    6   16:ldc1            #36  <String "/data">
	//    7   18:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//    8   19:new             #38  <Class StringBuilder>
	//    9   22:dup             
	//   10   23:invokespecial   #39  <Method void StringBuilder()>
	//   11   26:astore_2        
		stringbuilder.append(s1);
	//   12   27:aload_2         
	//   13   28:aload_1         
	//   14   29:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:pop             
		stringbuilder.append("/data/");
	//   16   33:aload_2         
	//   17   34:ldc1            #45  <String "/data/">
	//   18   36:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(s);
	//   20   40:aload_2         
	//   21   41:aload_0         
	//   22   42:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append("/files");
	//   24   46:aload_2         
	//   25   47:ldc1            #66  <String "/files">
	//   26   49:invokevirtual   #43  <Method StringBuilder StringBuilder.append(String)>
	//   27   52:pop             
		return stringbuilder.toString();
	//   28   53:aload_2         
	//   29   54:invokevirtual   #50  <Method String StringBuilder.toString()>
	//   30   57:areturn         
	}

	public static String getMountedExternalStorageDirectoryPath()
	{
		if(EnvUtil.isAndroidOS())
	//*   0    0:invokestatic    #23  <Method boolean EnvUtil.isAndroidOS()>
	//*   1    3:ifeq            39
		{
			String s = null;
	//    2    6:aconst_null     
	//    3    7:astore_0        
			String s1 = Environment.getExternalStorageState();
	//    4    8:invokestatic    #70  <Method String Environment.getExternalStorageState()>
	//    5   11:astore_1        
			if(s1.equals("mounted") || s1.equals("mounted_ro"))
	//*   6   12:aload_1         
	//*   7   13:ldc1            #72  <String "mounted">
	//*   8   15:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*   9   18:ifne            30
	//*  10   21:aload_1         
	//*  11   22:ldc1            #80  <String "mounted_ro">
	//*  12   24:invokevirtual   #78  <Method boolean String.equals(Object)>
	//*  13   27:ifeq            37
				s = Environment.getExternalStorageDirectory().getAbsolutePath();
	//   14   30:invokestatic    #54  <Method File Environment.getExternalStorageDirectory()>
	//   15   33:invokevirtual   #34  <Method String File.getAbsolutePath()>
	//   16   36:astore_0        
			return s;
	//   17   37:aload_0         
	//   18   38:areturn         
		} else
		{
			return "/mnt/sdcard";
	//   19   39:ldc1            #82  <String "/mnt/sdcard">
	//   20   41:areturn         
		}
	}

	private static final String ASSETS_DIRECTORY = "assets";
}
