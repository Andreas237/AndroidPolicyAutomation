// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.ndk;

import io.fabric.sdk.android.services.common.CurrentTimeProvider;
import io.fabric.sdk.android.services.common.SystemCurrentTimeProvider;
import io.fabric.sdk.android.services.persistence.FileStore;
import java.io.File;

// Referenced classes of package com.crashlytics.android.ndk:
//			CrashFileManager

class TimeBasedCrashFileManager
	implements CrashFileManager
{

	public TimeBasedCrashFileManager(FileStore filestore)
	{
		this(filestore, ((CurrentTimeProvider) (new SystemCurrentTimeProvider())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #23  <Class SystemCurrentTimeProvider>
	//    3    5:dup             
	//    4    6:invokespecial   #25  <Method void SystemCurrentTimeProvider()>
	//    5    9:invokespecial   #28  <Method void TimeBasedCrashFileManager(FileStore, CurrentTimeProvider)>
	//    6   12:return          
	}

	TimeBasedCrashFileManager(FileStore filestore, CurrentTimeProvider currenttimeprovider)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
		fileStore = filestore;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #31  <Field FileStore fileStore>
		timeProvider = currenttimeprovider;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #33  <Field CurrentTimeProvider timeProvider>
	//    8   14:return          
	}

	private File findLatestCrashFileByValue()
	{
		File afile[] = getFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method File[] getFiles()>
	//    2    4:astore          10
		File file = null;
	//    3    6:aconst_null     
	//    4    7:astore          8
		long l = 0L;
	//    5    9:lconst_0        
	//    6   10:lstore_2        
		for(int i = 0; i < afile.length;)
	//*   7   11:iconst_0        
	//*   8   12:istore_1        
	//*   9   13:iload_1         
	//*  10   14:aload           10
	//*  11   16:arraylength     
	//*  12   17:icmpge          68
		{
			File file1 = afile[i];
	//   13   20:aload           10
	//   14   22:iload_1         
	//   15   23:aaload          
	//   16   24:astore          9
			long l2 = Long.parseLong(stripExtension(file1.getName()));
	//   17   26:aload_0         
	//   18   27:aload           9
	//   19   29:invokevirtual   #43  <Method String File.getName()>
	//   20   32:invokespecial   #47  <Method String stripExtension(String)>
	//   21   35:invokestatic    #53  <Method long Long.parseLong(String)>
	//   22   38:lstore          6
			long l1 = l;
	//   23   40:lload_2         
	//   24   41:lstore          4
			if(l2 > l)
	//*  25   43:lload           6
	//*  26   45:lload_2         
	//*  27   46:lcmp            
	//*  28   47:ifle            58
			{
				file = file1;
	//   29   50:aload           9
	//   30   52:astore          8
				l1 = l2;
	//   31   54:lload           6
	//   32   56:lstore          4
			}
			i++;
	//   33   58:iload_1         
	//   34   59:iconst_1        
	//   35   60:iadd            
	//   36   61:istore_1        
			l = l1;
	//   37   62:lload           4
	//   38   64:lstore_2        
		}

	//*  39   65:goto            13
		return file;
	//   40   68:aload           8
	//   41   70:areturn         
	}

	private File getDataDirectory()
	{
		return fileStore.getFilesDir();
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field FileStore fileStore>
	//    2    4:invokeinterface #59  <Method File FileStore.getFilesDir()>
	//    3    9:areturn         
	}

	private File[] getFiles()
	{
		File afile1[] = getDataDirectory().listFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #61  <Method File getDataDirectory()>
	//    2    4:invokevirtual   #64  <Method File[] File.listFiles()>
	//    3    7:astore_2        
		File afile[] = afile1;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(afile1 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			afile = EMPTY_FILES;
	//    8   14:getstatic       #18  <Field File[] EMPTY_FILES>
	//    9   17:astore_1        
		return afile;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	private String stripExtension(String s)
	{
		return s.substring(0, s.length() - 9);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:aload_1         
	//    3    3:invokevirtual   #70  <Method int String.length()>
	//    4    6:bipush          9
	//    5    8:isub            
	//    6    9:invokevirtual   #74  <Method String String.substring(int, int)>
	//    7   12:areturn         
	}

	public void clearCrashFiles()
	{
		File afile[] = getFiles();
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method File[] getFiles()>
	//    2    4:astore_3        
		int j = afile.length;
	//    3    5:aload_3         
	//    4    6:arraylength     
	//    5    7:istore_2        
		for(int i = 0; i < j; i++)
	//*   6    8:iconst_0        
	//*   7    9:istore_1        
	//*   8   10:iload_1         
	//*   9   11:iload_2         
	//*  10   12:icmpge          29
			afile[i].delete();
	//   11   15:aload_3         
	//   12   16:iload_1         
	//   13   17:aaload          
	//   14   18:invokevirtual   #79  <Method boolean File.delete()>
	//   15   21:pop             

	//   16   22:iload_1         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_1        
	//*  20   26:goto            10
	//   21   29:return          
	}

	public File getLastWrittenCrashFile()
	{
		return findLatestCrashFileByValue();
	//    0    0:aload_0         
	//    1    1:invokespecial   #82  <Method File findLatestCrashFileByValue()>
	//    2    4:areturn         
	}

	public File getNewCrashFile()
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #85  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #86  <Method void StringBuilder()>
	//    3    7:astore_1        
		((StringBuilder) (obj)).append(timeProvider.getCurrentTimeMillis());
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field CurrentTimeProvider timeProvider>
	//    7   13:invokeinterface #92  <Method long CurrentTimeProvider.getCurrentTimeMillis()>
	//    8   18:invokevirtual   #96  <Method StringBuilder StringBuilder.append(long)>
	//    9   21:pop             
		((StringBuilder) (obj)).append(".ndk.json");
	//   10   22:aload_1         
	//   11   23:ldc1            #98  <String ".ndk.json">
	//   12   25:invokevirtual   #101 <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   14   29:aload_1         
	//   15   30:invokevirtual   #104 <Method String StringBuilder.toString()>
	//   16   33:astore_1        
		return new File(getDataDirectory(), ((String) (obj)));
	//   17   34:new             #16  <Class File>
	//   18   37:dup             
	//   19   38:aload_0         
	//   20   39:invokespecial   #61  <Method File getDataDirectory()>
	//   21   42:aload_1         
	//   22   43:invokespecial   #107 <Method void File(File, String)>
	//   23   46:areturn         
	}

	private static final File EMPTY_FILES[] = new File[0];
	private final FileStore fileStore;
	private final CurrentTimeProvider timeProvider;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       File[]
	//    2    4:putstatic       #18  <Field File[] EMPTY_FILES>
	//*   3    7:return          
	}
}
