// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android;

import android.content.*;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

class FabricContext extends ContextWrapper
{

	public FabricContext(Context context, String s, String s1)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #12  <Method void ContextWrapper(Context)>
		componentName = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #14  <Field String componentName>
		componentPath = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #16  <Field String componentPath>
	//    9   15:return          
	}

	public File getCacheDir()
	{
		return new File(super.getCacheDir(), componentPath);
	//    0    0:new             #21  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #23  <Method File ContextWrapper.getCacheDir()>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field String componentPath>
	//    6   12:invokespecial   #26  <Method void File(File, String)>
	//    7   15:areturn         
	}

	public File getDatabasePath(String s)
	{
		File file = new File(super.getDatabasePath(s).getParentFile(), componentPath);
	//    0    0:new             #21  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #30  <Method File ContextWrapper.getDatabasePath(String)>
	//    5    9:invokevirtual   #33  <Method File File.getParentFile()>
	//    6   12:aload_0         
	//    7   13:getfield        #16  <Field String componentPath>
	//    8   16:invokespecial   #26  <Method void File(File, String)>
	//    9   19:astore_2        
		file.mkdirs();
	//   10   20:aload_2         
	//   11   21:invokevirtual   #37  <Method boolean File.mkdirs()>
	//   12   24:pop             
		return new File(file, s);
	//   13   25:new             #21  <Class File>
	//   14   28:dup             
	//   15   29:aload_2         
	//   16   30:aload_1         
	//   17   31:invokespecial   #26  <Method void File(File, String)>
	//   18   34:areturn         
	}

	public File getExternalCacheDir()
	{
		return new File(super.getExternalCacheDir(), componentPath);
	//    0    0:new             #21  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method File ContextWrapper.getExternalCacheDir()>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field String componentPath>
	//    6   12:invokespecial   #26  <Method void File(File, String)>
	//    7   15:areturn         
	}

	public File getExternalFilesDir(String s)
	{
		return new File(super.getExternalFilesDir(s), componentPath);
	//    0    0:new             #21  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #47  <Method File ContextWrapper.getExternalFilesDir(String)>
	//    5    9:aload_0         
	//    6   10:getfield        #16  <Field String componentPath>
	//    7   13:invokespecial   #26  <Method void File(File, String)>
	//    8   16:areturn         
	}

	public File getFilesDir()
	{
		return new File(super.getFilesDir(), componentPath);
	//    0    0:new             #21  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #50  <Method File ContextWrapper.getFilesDir()>
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field String componentPath>
	//    6   12:invokespecial   #26  <Method void File(File, String)>
	//    7   15:areturn         
	}

	public SharedPreferences getSharedPreferences(String s, int i)
	{
		return super.getSharedPreferences((new StringBuilder()).append(componentName).append(":").append(s).toString(), i);
	//    0    0:aload_0         
	//    1    1:new             #54  <Class StringBuilder>
	//    2    4:dup             
	//    3    5:invokespecial   #57  <Method void StringBuilder()>
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field String componentName>
	//    6   12:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:ldc1            #63  <String ":">
	//    8   17:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//    9   20:aload_1         
	//   10   21:invokevirtual   #61  <Method StringBuilder StringBuilder.append(String)>
	//   11   24:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   12   27:iload_2         
	//   13   28:invokespecial   #69  <Method SharedPreferences ContextWrapper.getSharedPreferences(String, int)>
	//   14   31:areturn         
	}

	public SQLiteDatabase openOrCreateDatabase(String s, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory)
	{
		return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(s), cursorfactory);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #72  <Method File getDatabasePath(String)>
	//    3    5:aload_3         
	//    4    6:invokestatic    #77  <Method SQLiteDatabase SQLiteDatabase.openOrCreateDatabase(File, android.database.sqlite.SQLiteDatabase$CursorFactory)>
	//    5    9:areturn         
	}

	public SQLiteDatabase openOrCreateDatabase(String s, int i, android.database.sqlite.SQLiteDatabase.CursorFactory cursorfactory, DatabaseErrorHandler databaseerrorhandler)
	{
		return SQLiteDatabase.openOrCreateDatabase(getDatabasePath(s).getPath(), cursorfactory, databaseerrorhandler);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #72  <Method File getDatabasePath(String)>
	//    3    5:invokevirtual   #82  <Method String File.getPath()>
	//    4    8:aload_3         
	//    5    9:aload           4
	//    6   11:invokestatic    #85  <Method SQLiteDatabase SQLiteDatabase.openOrCreateDatabase(String, android.database.sqlite.SQLiteDatabase$CursorFactory, DatabaseErrorHandler)>
	//    7   14:areturn         
	}

	private final String componentName;
	private final String componentPath;
}
