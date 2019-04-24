// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package io.fabric.sdk.android.services.persistence;

import android.content.Context;
import android.os.Environment;
import io.fabric.sdk.android.*;
import java.io.File;

// Referenced classes of package io.fabric.sdk.android.services.persistence:
//			FileStore

public class FileStoreImpl
	implements FileStore
{

	public FileStoreImpl(Kit kit)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		if(kit.getContext() == null)
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #22  <Method Context Kit.getContext()>
	//*   4    8:ifnonnull       21
		{
			throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
	//    5   11:new             #24  <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc1            #26  <String "Cannot get directory before context has been set. Call Fabric.with() first">
	//    8   17:invokespecial   #29  <Method void IllegalStateException(String)>
	//    9   20:athrow          
		} else
		{
			context = kit.getContext();
	//   10   21:aload_0         
	//   11   22:aload_1         
	//   12   23:invokevirtual   #22  <Method Context Kit.getContext()>
	//   13   26:putfield        #31  <Field Context context>
			contentPath = kit.getPath();
	//   14   29:aload_0         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #35  <Method String Kit.getPath()>
	//   17   34:putfield        #37  <Field String contentPath>
			legacySupport = (new StringBuilder()).append("Android/").append(context.getPackageName()).toString();
	//   18   37:aload_0         
	//   19   38:new             #39  <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #40  <Method void StringBuilder()>
	//   22   45:ldc1            #42  <String "Android/">
	//   23   47:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   24   50:aload_0         
	//   25   51:getfield        #31  <Field Context context>
	//   26   54:invokevirtual   #51  <Method String Context.getPackageName()>
	//   27   57:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   28   60:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   29   63:putfield        #56  <Field String legacySupport>
			return;
	//   30   66:return          
		}
	}

	public File getCacheDir()
	{
		return prepare(context.getCacheDir());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field Context context>
	//    3    5:invokevirtual   #61  <Method File Context.getCacheDir()>
	//    4    8:invokevirtual   #65  <Method File prepare(File)>
	//    5   11:areturn         
	}

	public File getExternalCacheDir()
	{
		File file = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(isExternalStorageAvailable())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #70  <Method boolean isExternalStorageAvailable()>
	//*   4    6:ifeq            25
			if(android.os.Build.VERSION.SDK_INT >= 8)
	//*   5    9:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          8
	//*   7   14:icmplt          31
				file = context.getExternalCacheDir();
	//    8   17:aload_0         
	//    9   18:getfield        #31  <Field Context context>
	//   10   21:invokevirtual   #78  <Method File Context.getExternalCacheDir()>
	//   11   24:astore_1        
			else
	//*  12   25:aload_0         
	//*  13   26:aload_1         
	//*  14   27:invokevirtual   #65  <Method File prepare(File)>
	//*  15   30:areturn         
				file = new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append(legacySupport).append("/cache/").append(contentPath).toString());
	//   16   31:new             #80  <Class File>
	//   17   34:dup             
	//   18   35:invokestatic    #85  <Method File Environment.getExternalStorageDirectory()>
	//   19   38:new             #39  <Class StringBuilder>
	//   20   41:dup             
	//   21   42:invokespecial   #40  <Method void StringBuilder()>
	//   22   45:aload_0         
	//   23   46:getfield        #56  <Field String legacySupport>
	//   24   49:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:ldc1            #87  <String "/cache/">
	//   26   54:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   27   57:aload_0         
	//   28   58:getfield        #37  <Field String contentPath>
	//   29   61:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   30   64:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   31   67:invokespecial   #90  <Method void File(File, String)>
	//   32   70:astore_1        
		return prepare(file);
	//*  33   71:goto            25
	}

	public File getExternalFilesDir()
	{
		File file = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if(isExternalStorageAvailable())
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #70  <Method boolean isExternalStorageAvailable()>
	//*   4    6:ifeq            26
			if(android.os.Build.VERSION.SDK_INT >= 8)
	//*   5    9:getstatic       #76  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   12:bipush          8
	//*   7   14:icmplt          32
				file = context.getExternalFilesDir(((String) (null)));
	//    8   17:aload_0         
	//    9   18:getfield        #31  <Field Context context>
	//   10   21:aconst_null     
	//   11   22:invokevirtual   #97  <Method File Context.getExternalFilesDir(String)>
	//   12   25:astore_1        
			else
	//*  13   26:aload_0         
	//*  14   27:aload_1         
	//*  15   28:invokevirtual   #65  <Method File prepare(File)>
	//*  16   31:areturn         
				file = new File(Environment.getExternalStorageDirectory(), (new StringBuilder()).append(legacySupport).append("/files/").append(contentPath).toString());
	//   17   32:new             #80  <Class File>
	//   18   35:dup             
	//   19   36:invokestatic    #85  <Method File Environment.getExternalStorageDirectory()>
	//   20   39:new             #39  <Class StringBuilder>
	//   21   42:dup             
	//   22   43:invokespecial   #40  <Method void StringBuilder()>
	//   23   46:aload_0         
	//   24   47:getfield        #56  <Field String legacySupport>
	//   25   50:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   26   53:ldc1            #99  <String "/files/">
	//   27   55:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   28   58:aload_0         
	//   29   59:getfield        #37  <Field String contentPath>
	//   30   62:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   31   65:invokevirtual   #54  <Method String StringBuilder.toString()>
	//   32   68:invokespecial   #90  <Method void File(File, String)>
	//   33   71:astore_1        
		return prepare(file);
	//*  34   72:goto            26
	}

	public File getFilesDir()
	{
		return prepare(context.getFilesDir());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #31  <Field Context context>
	//    3    5:invokevirtual   #103 <Method File Context.getFilesDir()>
	//    4    8:invokevirtual   #65  <Method File prepare(File)>
	//    5   11:areturn         
	}

	boolean isExternalStorageAvailable()
	{
		if(!"mounted".equals(((Object) (Environment.getExternalStorageState()))))
	//*   0    0:ldc1            #105 <String "mounted">
	//*   1    2:invokestatic    #108 <Method String Environment.getExternalStorageState()>
	//*   2    5:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*   3    8:ifne            25
		{
			Fabric.getLogger().w("Fabric", "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?");
	//    4   11:invokestatic    #120 <Method Logger Fabric.getLogger()>
	//    5   14:ldc1            #122 <String "Fabric">
	//    6   16:ldc1            #124 <String "External Storage is not mounted and/or writable\nHave you declared android.permission.WRITE_EXTERNAL_STORAGE in the manifest?">
	//    7   18:invokeinterface #130 <Method void Logger.w(String, String)>
			return false;
	//    8   23:iconst_0        
	//    9   24:ireturn         
		} else
		{
			return true;
	//   10   25:iconst_1        
	//   11   26:ireturn         
		}
	}

	File prepare(File file)
	{
		if(file != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          34
		{
			if(file.exists() || file.mkdirs())
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #133 <Method boolean File.exists()>
	//*   4    8:ifne            18
	//*   5   11:aload_1         
	//*   6   12:invokevirtual   #136 <Method boolean File.mkdirs()>
	//*   7   15:ifeq            20
				return file;
	//    8   18:aload_1         
	//    9   19:areturn         
			Fabric.getLogger().w("Fabric", "Couldn't create file");
	//   10   20:invokestatic    #120 <Method Logger Fabric.getLogger()>
	//   11   23:ldc1            #122 <String "Fabric">
	//   12   25:ldc1            #138 <String "Couldn't create file">
	//   13   27:invokeinterface #130 <Method void Logger.w(String, String)>
		} else
	//*  14   32:aconst_null     
	//*  15   33:areturn         
		{
			Fabric.getLogger().d("Fabric", "Null File");
	//   16   34:invokestatic    #120 <Method Logger Fabric.getLogger()>
	//   17   37:ldc1            #122 <String "Fabric">
	//   18   39:ldc1            #140 <String "Null File">
	//   19   41:invokeinterface #143 <Method void Logger.d(String, String)>
		}
		return null;
	//*  20   46:goto            32
	}

	private final String contentPath;
	private final Context context;
	private final String legacySupport;
}
