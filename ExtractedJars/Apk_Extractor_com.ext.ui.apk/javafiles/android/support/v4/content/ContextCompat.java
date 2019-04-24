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
		int j = as.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore_3        
		int i = 0;
	//    3    3:iconst_0        
	//    4    4:istore_2        
		while(i < j) 
	//*   5    5:iload_2         
	//*   6    6:iload_3         
	//*   7    7:icmpge          55
		{
			String s = as[i];
	//    8   10:aload_1         
	//    9   11:iload_2         
	//   10   12:aaload          
	//   11   13:astore          4
			if(file == null)
	//*  12   15:aload_0         
	//*  13   16:ifnonnull       36
				file = new File(s);
	//   14   19:new             #24  <Class File>
	//   15   22:dup             
	//   16   23:aload           4
	//   17   25:invokespecial   #27  <Method void File(String)>
	//   18   28:astore_0        
			else
	//*  19   29:iload_2         
	//*  20   30:iconst_1        
	//*  21   31:iadd            
	//*  22   32:istore_2        
	//*  23   33:goto            5
			if(s != null)
	//*  24   36:aload           4
	//*  25   38:ifnull          57
				file = new File(file, s);
	//   26   41:new             #24  <Class File>
	//   27   44:dup             
	//   28   45:aload_0         
	//   29   46:aload           4
	//   30   48:invokespecial   #30  <Method void File(File, String)>
	//   31   51:astore_0        
			i++;
		}
	//*  32   52:goto            29
		return file;
	//   33   55:aload_0         
	//   34   56:areturn         
	//*  35   57:goto            29
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
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.createDeviceProtectedStorageContext();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #65  <Method Context Context.createDeviceProtectedStorageContext()>
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
		File file1 = file;
	//    2    3:aload_0         
	//    3    4:astore_2        
		if(file.exists()) goto _L2; else goto _L1
	//    4    5:aload_0         
	//    5    6:invokevirtual   #71  <Method boolean File.exists()>
	//    6    9:ifne            32
_L1:
		file1 = file;
	//    7   12:aload_0         
	//    8   13:astore_2        
		if(file.mkdirs()) goto _L2; else goto _L3
	//    9   14:aload_0         
	//   10   15:invokevirtual   #74  <Method boolean File.mkdirs()>
	//   11   18:ifne            32
_L3:
		boolean flag = file.exists();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #71  <Method boolean File.exists()>
	//   14   25:istore_1        
		if(!flag) goto _L5; else goto _L4
	//   15   26:iload_1         
	//   16   27:ifeq            37
_L4:
		file1 = file;
	//   17   30:aload_0         
	//   18   31:astore_2        
_L2:
		android/support/v4/content/ContextCompat;
	//   19   32:ldc1            #2   <Class ContextCompat>
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		return file1;
	//   21   35:aload_2         
	//   22   36:areturn         
_L5:
		Log.w("ContextCompat", (new StringBuilder()).append("Unable to create files subdir ").append(file.getPath()).toString());
	//   23   37:ldc1            #8   <String "ContextCompat">
	//   24   39:new             #76  <Class StringBuilder>
	//   25   42:dup             
	//   26   43:invokespecial   #77  <Method void StringBuilder()>
	//   27   46:ldc1            #79  <String "Unable to create files subdir ">
	//   28   48:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   29   51:aload_0         
	//   30   52:invokevirtual   #87  <Method String File.getPath()>
	//   31   55:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   32   58:invokevirtual   #90  <Method String StringBuilder.toString()>
	//   33   61:invokestatic    #96  <Method int Log.w(String, String)>
	//   34   64:pop             
		file1 = null;
	//   35   65:aconst_null     
	//   36   66:astore_2        
		if(true) goto _L2; else goto _L6
	//   37   67:goto            32
_L6:
		file;
	//   38   70:astore_0        
	//*  39   71:ldc1            #2   <Class ContextCompat>
		throw file;
	//   40   73:monitorexit     
	//   41   74:aload_0         
	//   42   75:athrow          
	}

	public static File getCodeCacheDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return context.getCodeCacheDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #101 <Method File Context.getCodeCacheDir()>
	//    5   12:areturn         
		else
			return createFilesDir(new File(context.getApplicationInfo().dataDir, "code_cache"));
	//    6   13:new             #24  <Class File>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #105 <Method ApplicationInfo Context.getApplicationInfo()>
	//   10   21:getfield        #110 <Field String ApplicationInfo.dataDir>
	//   11   24:ldc1            #112 <String "code_cache">
	//   12   26:invokespecial   #115 <Method void File(String, String)>
	//   13   29:invokestatic    #117 <Method File createFilesDir(File)>
	//   14   32:areturn         
	}

	public static final int getColor(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColor(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #124 <Method int Context.getColor(int)>
	//    6   13:ireturn         
		else
			return context.getResources().getColor(i);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #128 <Method Resources Context.getResources()>
	//    9   18:iload_1         
	//   10   19:invokevirtual   #131 <Method int Resources.getColor(int)>
	//   11   22:ireturn         
	}

	public static final ColorStateList getColorStateList(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColorStateList(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #137 <Method ColorStateList Context.getColorStateList(int)>
	//    6   13:areturn         
		else
			return context.getResources().getColorStateList(i);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #128 <Method Resources Context.getResources()>
	//    9   18:iload_1         
	//   10   19:invokevirtual   #138 <Method ColorStateList Resources.getColorStateList(int)>
	//   11   22:areturn         
	}

	public static File getDataDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.getDataDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #141 <Method File Context.getDataDir()>
	//    5   12:areturn         
		context = ((Context) (context.getApplicationInfo().dataDir));
	//    6   13:aload_0         
	//    7   14:invokevirtual   #105 <Method ApplicationInfo Context.getApplicationInfo()>
	//    8   17:getfield        #110 <Field String ApplicationInfo.dataDir>
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

	public static final Drawable getDrawable(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			return context.getDrawable(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #147 <Method Drawable Context.getDrawable(int)>
	//    6   13:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   14:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          16
	//*   9   19:icmplt          31
			return context.getResources().getDrawable(i);
	//   10   22:aload_0         
	//   11   23:invokevirtual   #128 <Method Resources Context.getResources()>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #148 <Method Drawable Resources.getDrawable(int)>
	//   14   30:areturn         
		synchronized(sLock)
	//*  15   31:getstatic       #19  <Field Object sLock>
	//*  16   34:astore_2        
	//*  17   35:aload_2         
	//*  18   36:monitorenter    
		{
			if(sTempValue == null)
	//*  19   37:getstatic       #150 <Field TypedValue sTempValue>
	//*  20   40:ifnonnull       53
				sTempValue = new TypedValue();
	//   21   43:new             #152 <Class TypedValue>
	//   22   46:dup             
	//   23   47:invokespecial   #153 <Method void TypedValue()>
	//   24   50:putstatic       #150 <Field TypedValue sTempValue>
			context.getResources().getValue(i, sTempValue, true);
	//   25   53:aload_0         
	//   26   54:invokevirtual   #128 <Method Resources Context.getResources()>
	//   27   57:iload_1         
	//   28   58:getstatic       #150 <Field TypedValue sTempValue>
	//   29   61:iconst_1        
	//   30   62:invokevirtual   #157 <Method void Resources.getValue(int, TypedValue, boolean)>
			i = sTempValue.resourceId;
	//   31   65:getstatic       #150 <Field TypedValue sTempValue>
	//   32   68:getfield        #160 <Field int TypedValue.resourceId>
	//   33   71:istore_1        
		}
	//   34   72:aload_2         
	//   35   73:monitorexit     
		return context.getResources().getDrawable(i);
	//   36   74:aload_0         
	//   37   75:invokevirtual   #128 <Method Resources Context.getResources()>
	//   38   78:iload_1         
	//   39   79:invokevirtual   #148 <Method Drawable Resources.getDrawable(int)>
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
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return context.getExternalCacheDirs();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #165 <Method File[] Context.getExternalCacheDirs()>
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
	//   11   20:invokevirtual   #168 <Method File Context.getExternalCacheDir()>
	//   12   23:aastore         
	//   13   24:areturn         
	}

	public static File[] getExternalFilesDirs(Context context, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
			return context.getExternalFilesDirs(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #173 <Method File[] Context.getExternalFilesDirs(String)>
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
	//   13   22:invokevirtual   #177 <Method File Context.getExternalFilesDir(String)>
	//   14   25:aastore         
	//   15   26:areturn         
	}

	public static final File getNoBackupFilesDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return context.getNoBackupFilesDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #180 <Method File Context.getNoBackupFilesDir()>
	//    5   12:areturn         
		else
			return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
	//    6   13:new             #24  <Class File>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #105 <Method ApplicationInfo Context.getApplicationInfo()>
	//   10   21:getfield        #110 <Field String ApplicationInfo.dataDir>
	//   11   24:ldc1            #182 <String "no_backup">
	//   12   26:invokespecial   #115 <Method void File(String, String)>
	//   13   29:invokestatic    #117 <Method File createFilesDir(File)>
	//   14   32:areturn         
	}

	public static File[] getObbDirs(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return context.getObbDirs();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #185 <Method File[] Context.getObbDirs()>
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
	//   11   20:invokevirtual   #188 <Method File Context.getObbDir()>
	//   12   23:aastore         
	//   13   24:areturn         
	}

	public static boolean isDeviceProtectedStorage(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.isDeviceProtectedStorage();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #192 <Method boolean Context.isDeviceProtectedStorage()>
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
	//    3    3:invokestatic    #197 <Method boolean startActivities(Context, Intent[], Bundle)>
	//    4    6:ireturn         
	}

	public static boolean startActivities(Context context, Intent aintent[], Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          16
			context.startActivities(aintent, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #200 <Method void Context.startActivities(Intent[], Bundle)>
		else
	//*   7   14:iconst_1        
	//*   8   15:ireturn         
			context.startActivities(aintent);
	//    9   16:aload_0         
	//   10   17:aload_1         
	//   11   18:invokevirtual   #203 <Method void Context.startActivities(Intent[])>
		return true;
	//*  12   21:goto            14
	}

	public static void startActivity(Context context, Intent intent, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
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
	//*   0    0:getstatic       #62  <Field int android.os.Build$VERSION.SDK_INT>
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
