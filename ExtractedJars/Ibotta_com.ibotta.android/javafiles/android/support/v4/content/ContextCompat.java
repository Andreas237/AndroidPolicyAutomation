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

	public static int checkSelfPermission(Context context, String s)
	{
		if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          16
			return context.checkPermission(s, Process.myPid(), Process.myUid());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #25  <Method int Process.myPid()>
	//    5    9:invokestatic    #28  <Method int Process.myUid()>
	//    6   12:invokevirtual   #34  <Method int Context.checkPermission(String, int, int)>
	//    7   15:ireturn         
		else
			throw new IllegalArgumentException("permission is null");
	//    8   16:new             #36  <Class IllegalArgumentException>
	//    9   19:dup             
	//   10   20:ldc1            #38  <String "permission is null">
	//   11   22:invokespecial   #41  <Method void IllegalArgumentException(String)>
	//   12   25:athrow          
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
	//    3    4:invokevirtual   #50  <Method boolean File.exists()>
	//    4    7:ifne            70
	//    5   10:aload_0         
	//    6   11:invokevirtual   #53  <Method boolean File.mkdirs()>
	//    7   14:ifne            70
		flag = file.exists();
	//    8   17:aload_0         
	//    9   18:invokevirtual   #50  <Method boolean File.exists()>
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
	//   17   31:new             #55  <Class StringBuilder>
	//   18   34:dup             
	//   19   35:invokespecial   #56  <Method void StringBuilder()>
	//   20   38:astore_2        
		stringbuilder.append("Unable to create files subdir ");
	//   21   39:aload_2         
	//   22   40:ldc1            #58  <String "Unable to create files subdir ">
	//   23   42:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   24   45:pop             
		stringbuilder.append(file.getPath());
	//   25   46:aload_2         
	//   26   47:aload_0         
	//   27   48:invokevirtual   #66  <Method String File.getPath()>
	//   28   51:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   29   54:pop             
		Log.w("ContextCompat", stringbuilder.toString());
	//   30   55:ldc1            #68  <String "ContextCompat">
	//   31   57:aload_2         
	//   32   58:invokevirtual   #71  <Method String StringBuilder.toString()>
	//   33   61:invokestatic    #77  <Method int Log.w(String, String)>
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

	public static int getColor(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColor(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #90  <Method int Context.getColor(int)>
	//    6   13:ireturn         
		else
			return context.getResources().getColor(i);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #94  <Method Resources Context.getResources()>
	//    9   18:iload_1         
	//   10   19:invokevirtual   #97  <Method int Resources.getColor(int)>
	//   11   22:ireturn         
	}

	public static ColorStateList getColorStateList(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return context.getColorStateList(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #104 <Method ColorStateList Context.getColorStateList(int)>
	//    6   13:areturn         
		else
			return context.getResources().getColorStateList(i);
	//    7   14:aload_0         
	//    8   15:invokevirtual   #94  <Method Resources Context.getResources()>
	//    9   18:iload_1         
	//   10   19:invokevirtual   #105 <Method ColorStateList Resources.getColorStateList(int)>
	//   11   22:areturn         
	}

	public static Drawable getDrawable(Context context, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			return context.getDrawable(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #111 <Method Drawable Context.getDrawable(int)>
	//    6   13:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   7   14:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   17:bipush          16
	//*   9   19:icmplt          31
			return context.getResources().getDrawable(i);
	//   10   22:aload_0         
	//   11   23:invokevirtual   #94  <Method Resources Context.getResources()>
	//   12   26:iload_1         
	//   13   27:invokevirtual   #112 <Method Drawable Resources.getDrawable(int)>
	//   14   30:areturn         
		synchronized(sLock)
	//*  15   31:getstatic       #15  <Field Object sLock>
	//*  16   34:astore_2        
	//*  17   35:aload_2         
	//*  18   36:monitorenter    
		{
			if(sTempValue == null)
	//*  19   37:getstatic       #114 <Field TypedValue sTempValue>
	//*  20   40:ifnonnull       53
				sTempValue = new TypedValue();
	//   21   43:new             #116 <Class TypedValue>
	//   22   46:dup             
	//   23   47:invokespecial   #117 <Method void TypedValue()>
	//   24   50:putstatic       #114 <Field TypedValue sTempValue>
			context.getResources().getValue(i, sTempValue, true);
	//   25   53:aload_0         
	//   26   54:invokevirtual   #94  <Method Resources Context.getResources()>
	//   27   57:iload_1         
	//   28   58:getstatic       #114 <Field TypedValue sTempValue>
	//   29   61:iconst_1        
	//   30   62:invokevirtual   #121 <Method void Resources.getValue(int, TypedValue, boolean)>
			i = sTempValue.resourceId;
	//   31   65:getstatic       #114 <Field TypedValue sTempValue>
	//   32   68:getfield        #124 <Field int TypedValue.resourceId>
	//   33   71:istore_1        
		}
	//   34   72:aload_2         
	//   35   73:monitorexit     
		return context.getResources().getDrawable(i);
	//   36   74:aload_0         
	//   37   75:invokevirtual   #94  <Method Resources Context.getResources()>
	//   38   78:iload_1         
	//   39   79:invokevirtual   #112 <Method Drawable Resources.getDrawable(int)>
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
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return context.getExternalCacheDirs();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #129 <Method File[] Context.getExternalCacheDirs()>
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
	//   11   20:invokevirtual   #133 <Method File Context.getExternalCacheDir()>
	//   12   23:aastore         
	//   13   24:areturn         
	}

	public static File[] getExternalFilesDirs(Context context, String s)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          14
			return context.getExternalFilesDirs(s);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #138 <Method File[] Context.getExternalFilesDirs(String)>
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
	//   13   22:invokevirtual   #142 <Method File Context.getExternalFilesDir(String)>
	//   14   25:aastore         
	//   15   26:areturn         
	}

	public static File getNoBackupFilesDir(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return context.getNoBackupFilesDir();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #146 <Method File Context.getNoBackupFilesDir()>
	//    5   12:areturn         
		else
			return createFilesDir(new File(context.getApplicationInfo().dataDir, "no_backup"));
	//    6   13:new             #46  <Class File>
	//    7   16:dup             
	//    8   17:aload_0         
	//    9   18:invokevirtual   #150 <Method ApplicationInfo Context.getApplicationInfo()>
	//   10   21:getfield        #156 <Field String ApplicationInfo.dataDir>
	//   11   24:ldc1            #158 <String "no_backup">
	//   12   26:invokespecial   #161 <Method void File(String, String)>
	//   13   29:invokestatic    #163 <Method File createFilesDir(File)>
	//   14   32:areturn         
	}

	public static boolean isDeviceProtectedStorage(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT >= 24)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          24
	//*   2    5:icmplt          13
			return context.isDeviceProtectedStorage();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #167 <Method boolean Context.isDeviceProtectedStorage()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static boolean startActivities(Context context, Intent aintent[], Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          17
			context.startActivities(aintent, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #172 <Method void Context.startActivities(Intent[], Bundle)>
		else
	//*   7   14:goto            22
			context.startActivities(aintent);
	//    8   17:aload_0         
	//    9   18:aload_1         
	//   10   19:invokevirtual   #175 <Method void Context.startActivities(Intent[])>
		return true;
	//   11   22:iconst_1        
	//   12   23:ireturn         
	}

	public static void startActivity(Context context, Intent intent, Bundle bundle)
	{
		if(android.os.Build.VERSION.SDK_INT >= 16)
	//*   0    0:getstatic       #87  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          16
	//*   2    5:icmplt          15
		{
			context.startActivity(intent, bundle);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:invokevirtual   #180 <Method void Context.startActivity(Intent, Bundle)>
			return;
	//    7   14:return          
		} else
		{
			context.startActivity(intent);
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #183 <Method void Context.startActivity(Intent)>
			return;
	//   11   20:return          
		}
	}

	private static final Object sLock = new Object();
	private static TypedValue sTempValue;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void Object()>
	//    3    7:putstatic       #15  <Field Object sLock>
	//*   4   10:return          
	}
}
