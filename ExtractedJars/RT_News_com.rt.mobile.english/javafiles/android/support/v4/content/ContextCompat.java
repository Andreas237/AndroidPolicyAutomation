// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.content;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.util.TypedValue;
import java.io.File;

public class ContextCompat
{

	protected ContextCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	private static transient File buildPath(File file, String as[])
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_2        
		int j = as.length;
	//    2    2:aload_1         
	//    3    3:arraylength     
	//    4    4:istore_3        
		File file1;
		for(file1 = file; i < j; file1 = file)
	//*   5    5:aload_0         
	//*   6    6:astore          4
	//*   7    8:iload_2         
	//*   8    9:iload_3         
	//*   9   10:icmpge          66
		{
			String s = as[i];
	//   10   13:aload_1         
	//   11   14:iload_2         
	//   12   15:aaload          
	//   13   16:astore          5
			if(file1 == null)
	//*  14   18:aload           4
	//*  15   20:ifnonnull       36
			{
				file = new File(s);
	//   16   23:new             #24  <Class File>
	//   17   26:dup             
	//   18   27:aload           5
	//   19   29:invokespecial   #27  <Method void File(String)>
	//   20   32:astore_0        
			} else
	//*  21   33:goto            56
			{
				file = file1;
	//   22   36:aload           4
	//   23   38:astore_0        
				if(s != null)
	//*  24   39:aload           5
	//*  25   41:ifnull          56
					file = new File(file1, s);
	//   26   44:new             #24  <Class File>
	//   27   47:dup             
	//   28   48:aload           4
	//   29   50:aload           5
	//   30   52:invokespecial   #30  <Method void File(File, String)>
	//   31   55:astore_0        
			}
			i++;
	//   32   56:iload_2         
	//   33   57:iconst_1        
	//   34   58:iadd            
	//   35   59:istore_2        
		}

	//   36   60:aload_0         
	//   37   61:astore          4
	//*  38   63:goto            8
		return file1;
	//   39   66:aload           4
	//   40   68:areturn         
	}

	public static int checkSelfPermission(Context context, String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("permission is null");
	//    2    4:new             #35  <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #37  <String "permission is null">
	//    5   10:invokespecial   #38  <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		else
			return context.checkPermission(s, Process.myPid(), Process.myUid());
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokestatic    #44  <Method int Process.myPid()>
	//   10   19:invokestatic    #47  <Method int Process.myUid()>
	//   11   22:invokevirtual   #53  <Method int Context.checkPermission(String, int, int)>
	//   12   25:ireturn         
	}

	public static Context createDeviceProtectedStorageContext(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.createDeviceProtectedStorageContext();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #66  <Method Context Context.createDeviceProtectedStorageContext()>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	private static File createFilesDir(File file)
	{
		android/support/v4/content/ContextCompat;
	//    0    0:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		boolean flag;
		if(file.exists() || file.mkdirs())
			break MISSING_BLOCK_LABEL_70;
	//    2    3:aload_0         
	//    3    4:invokevirtual   #73  <Method boolean File.exists()>
	//    4    7:ifne            70
	//    5   10:aload_0         
	//    6   11:invokevirtual   #76  <Method boolean File.mkdirs()>
	//    7   14:ifne            70
		flag = file.exists();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #73  <Method boolean File.exists()>
	//   10   21:istore_1        
		if(!flag)
			break MISSING_BLOCK_LABEL_31;
	//   11   22:iload_1         
	//   12   23:ifeq            31
		android/support/v4/content/ContextCompat;
	//   13   26:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorexit ;
	//   14   28:monitorexit     
		return file;
	//   15   29:aload_0         
	//   16   30:areturn         
		StringBuilder stringbuilder = new StringBuilder();
	//   17   31:new             #78  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #79  <Method void StringBuilder()>
	//   20   38:astore_2        
		stringbuilder.append("Unable to create files subdir ");
	//   21   39:aload_2         
	//   22   40:ldc1            #81  <String "Unable to create files subdir ">
	//   23   42:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		stringbuilder.append(file.getPath());
	//   25   46:aload_2         
	//   26   47:aload_0         
	//   27   48:invokevirtual   #89  <Method String File.getPath()>
	//   28   51:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		Log.w("ContextCompat", stringbuilder.toString());
	//   30   55:ldc1            #8   <String "ContextCompat">
	//   31   57:aload_2         
	//   32   58:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   33   61:invokestatic    #98  <Method int Log.w(String, String)>
	//   34   64:pop             
		android/support/v4/content/ContextCompat;
	//   35   65:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorexit ;
	//   36   67:monitorexit     
		return null;
	//   37   68:aconst_null     
	//   38   69:areturn         
		android/support/v4/content/ContextCompat;
	//   39   70:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorexit ;
	//   40   72:monitorexit     
		return file;
	//   41   73:aload_0         
	//   42   74:areturn         
		file;
	//   43   75:astore_0        
	//*  44   76:ldc1            #2   <Class ContextCompat>
		throw file;
	//   45   78:monitorexit     
	//   46   79:aload_0         
	//   47   80:athrow          
	}

	public static File getCodeCacheDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return context.getCodeCacheDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #103 <Method File Context.getCodeCacheDir()>
	//    5   12:areturn         
		else
			return createFilesDir(new File(context.getApplicationInfo().dataDir, "code_cache"));
	//    6   13:new             #24  <Class File>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #107 <Method ApplicationInfo Context.getApplicationInfo()>
	//   10   21:getfield        #112 <Field String ApplicationInfo.dataDir>
	//   11   24:ldc1            #114 <String "code_cache">
	//   12   26:invokespecial   #117 <Method void File(String, String)>
	//   13   29:invokestatic    #119 <Method File createFilesDir(File)>
	//   14   32:areturn         
	}

	public static int getColor(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColor(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #126 <Method int Context.getColor(int)>
	//    6   13:ireturn         
		else
			return context.getResources().getColor(i);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #130 <Method Resources Context.getResources()>
	//    9   18:iload_1         
	//   10   19:invokevirtual   #133 <Method int Resources.getColor(int)>
	//   11   22:ireturn         
	}

	public static ColorStateList getColorStateList(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColorStateList(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #138 <Method ColorStateList Context.getColorStateList(int)>
	//    6   13:areturn         
		else
			return context.getResources().getColorStateList(i);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #130 <Method Resources Context.getResources()>
	//    9   18:iload_1         
	//   10   19:invokevirtual   #139 <Method ColorStateList Resources.getColorStateList(int)>
	//   11   22:areturn         
	}

	public static File getDataDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.getDataDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #142 <Method File Context.getDataDir()>
	//    5   12:areturn         
		context = ((Context) (context.getApplicationInfo().dataDir));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #107 <Method ApplicationInfo Context.getApplicationInfo()>
	//    8   17:getfield        #112 <Field String ApplicationInfo.dataDir>
	//    9   20:astore_0        
		if(context != null)
	//*  10   21:aload_0         
	//*  11   22:ifnull          34
			return new File(((String) (context)));
	//   12   25:new             #24  <Class File>
	//   13   28:dup             
	//   14   29:aload_0         
	//   15   30:invokespecial   #27  <Method void File(String)>
	//   16   33:areturn         
		else
			return null;
	//   17   34:aconst_null     
	//   18   35:areturn         
	}

	public static Drawable getDrawable(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			return context.getDrawable(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #148 <Method Drawable Context.getDrawable(int)>
	//    6   13:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   14:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          16
	//*   9   19:icmplt          31
			return context.getResources().getDrawable(i);
	//   10   22:aload_0         
	//   11   23:invokevirtual   #130 <Method Resources Context.getResources()>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #149 <Method Drawable Resources.getDrawable(int)>
	//   14   30:areturn         
		synchronized(sLock)
	//*  15   31:getstatic       #19  <Field Object sLock>
	//*  16   34:astore_2        
	//*  17   35:aload_2         
	//*  18   36:monitorenter    
		{
			if(sTempValue == null)
	//*  19   37:getstatic       #151 <Field TypedValue sTempValue>
	//*  20   40:ifnonnull       53
				sTempValue = new TypedValue();
	//   21   43:new             #153 <Class TypedValue>
	//   22   46:dup             
	//   23   47:invokespecial   #154 <Method void TypedValue()>
	//   24   50:putstatic       #151 <Field TypedValue sTempValue>
			context.getResources().getValue(i, sTempValue, true);
	//   25   53:aload_0         
	//   26   54:invokevirtual   #130 <Method Resources Context.getResources()>
	//   27   57:iload_1         
	//   28   58:getstatic       #151 <Field TypedValue sTempValue>
	//   29   61:iconst_1        
	//   30   62:invokevirtual   #158 <Method void Resources.getValue(int, TypedValue, boolean)>
			i = sTempValue.resourceId;
	//   31   65:getstatic       #151 <Field TypedValue sTempValue>
	//   32   68:getfield        #161 <Field int TypedValue.resourceId>
	//   33   71:istore_1        
		}
	//   34   72:aload_2         
	//   35   73:monitorexit     
		return context.getResources().getDrawable(i);
	//   36   74:aload_0         
	//   37   75:invokevirtual   #130 <Method Resources Context.getResources()>
	//   38   78:iload_1         
	//   39   79:invokevirtual   #149 <Method Drawable Resources.getDrawable(int)>
	//   40   82:areturn         
		context;
	//   41   83:astore_0        
		obj;
	//   42   84:aload_2         
		JVM INSTR monitorexit ;
	//   43   85:monitorexit     
		throw context;
	//   44   86:aload_0         
	//   45   87:athrow          
	}

	public static File[] getExternalCacheDirs(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return context.getExternalCacheDirs();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #166 <Method File[] Context.getExternalCacheDirs()>
	//    5   12:areturn         
		else
			return (new File[] {
				context.getExternalCacheDir()
			});
	//    6   13:iconst_1        
	//    7   14:anewarray       File[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:invokevirtual   #169 <Method File Context.getExternalCacheDir()>
	//   12   23:aastore         
	//   13   24:areturn         
	}

	public static File[] getExternalFilesDirs(Context context, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
			return context.getExternalFilesDirs(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #174 <Method File[] Context.getExternalFilesDirs(String)>
	//    6   13:areturn         
		else
			return (new File[] {
				context.getExternalFilesDir(s)
			});
	//    7   14:iconst_1        
	//    8   15:anewarray       File[]
	//    9   18:dup             
	//   10   19:iconst_0        
	//   11   20:aload_0         
	//   12   21:aload_1         
	//   13   22:invokevirtual   #178 <Method File Context.getExternalFilesDir(String)>
	//   14   25:aastore         
	//   15   26:areturn         
	}

	public static File getNoBackupFilesDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return context.getNoBackupFilesDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #181 <Method File Context.getNoBackupFilesDir()>
	//    5   12:areturn         
		else
			return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
	//    6   13:new             #24  <Class File>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #107 <Method ApplicationInfo Context.getApplicationInfo()>
	//   10   21:getfield        #112 <Field String ApplicationInfo.dataDir>
	//   11   24:ldc1            #183 <String "no_backup">
	//   12   26:invokespecial   #117 <Method void File(String, String)>
	//   13   29:invokestatic    #119 <Method File createFilesDir(File)>
	//   14   32:areturn         
	}

	public static File[] getObbDirs(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return context.getObbDirs();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #186 <Method File[] Context.getObbDirs()>
	//    5   12:areturn         
		else
			return (new File[] {
				context.getObbDir()
			});
	//    6   13:iconst_1        
	//    7   14:anewarray       File[]
	//    8   17:dup             
	//    9   18:iconst_0        
	//   10   19:aload_0         
	//   11   20:invokevirtual   #189 <Method File Context.getObbDir()>
	//   12   23:aastore         
	//   13   24:areturn         
	}

	public static boolean isDeviceProtectedStorage(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.isDeviceProtectedStorage();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #193 <Method boolean Context.isDeviceProtectedStorage()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean startActivities(Context context, Intent aintent[])
	{
		return startActivities(context, aintent, ((Bundle) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #198 <Method boolean startActivities(Context, Intent[], Bundle)>
	//    4    6:ireturn         
	}

	public static boolean startActivities(Context context, Intent aintent[], Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			context.startActivities(aintent, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #201 <Method void Context.startActivities(Intent[], Bundle)>
		else
	//*   7   14:goto            22
			context.startActivities(aintent);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #204 <Method void Context.startActivities(Intent[])>
		return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
	}

	public static void startActivity(Context context, Intent intent, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          15
		{
			context.startActivity(intent, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #209 <Method void Context.startActivity(Intent, Bundle)>
			return;
	//    7   14:return          
		} else
		{
			context.startActivity(intent);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #212 <Method void Context.startActivity(Intent)>
			return;
	//   11   20:return          
		}
	}

	public static void startForegroundService(Context context, Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #63  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
		{
			context.startForegroundService(intent);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #217 <Method android.content.ComponentName Context.startForegroundService(Intent)>
	//    6   13:pop             
			return;
	//    7   14:return          
		} else
		{
			context.startService(intent);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #220 <Method android.content.ComponentName Context.startService(Intent)>
	//   11   20:pop             
			return;
	//   12   21:return          
		}
	}

	private static final String TAG = "ContextCompat";
	private static final Object sLock = new Object();
	private static TypedValue sTempValue;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #17  <Method void Object()>
	//    3    7:putstatic       #19  <Field Object sLock>
	//*   4   10:return          
	}
}
