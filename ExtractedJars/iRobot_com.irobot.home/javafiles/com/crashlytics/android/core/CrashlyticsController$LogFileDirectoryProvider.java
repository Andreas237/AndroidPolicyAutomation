// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import b.a.a.a.a.f.a;
import java.io.File;

// Referenced classes of package com.crashlytics.android.core:
//			CrashlyticsController

private static final class CrashlyticsController$LogFileDirectoryProvider
	implements LogFileManager.DirectoryProvider
{

	public File getLogFileDir()
	{
		File file = new File(rootFileStore.a(), "log-files");
	//    0    0:new             #27  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field a rootFileStore>
	//    4    8:invokeinterface #32  <Method File a.a()>
	//    5   13:ldc1            #13  <String "log-files">
	//    6   15:invokespecial   #35  <Method void File(File, String)>
	//    7   18:astore_1        
		if(!file.exists())
	//*   8   19:aload_1         
	//*   9   20:invokevirtual   #39  <Method boolean File.exists()>
	//*  10   23:ifne            31
			file.mkdirs();
	//   11   26:aload_1         
	//   12   27:invokevirtual   #42  <Method boolean File.mkdirs()>
	//   13   30:pop             
		return file;
	//   14   31:aload_1         
	//   15   32:areturn         
	}

	private static final String LOG_FILES_DIR = "log-files";
	private final a rootFileStore;

	public CrashlyticsController$LogFileDirectoryProvider(a a1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		rootFileStore = a1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field a rootFileStore>
	//    5    9:return          
	}
}
