// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.*;

// Referenced classes of package com.bumptech.glide.load.model:
//			FileLoader

private static final class FileLoader$FileFetcher
	implements DataFetcher
{

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
		Object obj;
		obj = data;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Object data>
	//    2    4:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_19;
	//    3    5:aload_1         
	//    4    6:ifnull          19
		opener.close(obj);
	//    5    9:aload_0         
	//    6   10:getfield        #27  <Field FileLoader$FileOpener opener>
	//    7   13:aload_1         
	//    8   14:invokeinterface #42  <Method void FileLoader$FileOpener.close(Object)>
		return;
	//    9   19:return          
		IOException ioexception;
		ioexception;
	//   10   20:astore_1        
	//   11   21:return          
	}

	public Class getDataClass()
	{
		return opener.getDataClass();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field FileLoader$FileOpener opener>
	//    2    4:invokeinterface #47  <Method Class FileLoader$FileOpener.getDataClass()>
	//    3    9:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #57  <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, com.bumptech.glide.load.data.k k)
	{
		try
		{
			data = opener.open(file);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field FileLoader$FileOpener opener>
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field File file>
	//    5    9:invokeinterface #65  <Method Object FileLoader$FileOpener.open(File)>
	//    6   14:putfield        #36  <Field Object data>
		}
	//*   7   17:aload_2         
	//*   8   18:aload_0         
	//*   9   19:getfield        #36  <Field Object data>
	//*  10   22:invokeinterface #70  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
	//*  11   27:return          
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*  12   28:astore_1        
		{
			if(Log.isLoggable("FileLoader", 3))
	//*  13   29:ldc1            #72  <String "FileLoader">
	//*  14   31:iconst_3        
	//*  15   32:invokestatic    #78  <Method boolean Log.isLoggable(String, int)>
	//*  16   35:ifeq            47
				Log.d("FileLoader", "Failed to open file", ((Throwable) (priority)));
	//   17   38:ldc1            #72  <String "FileLoader">
	//   18   40:ldc1            #80  <String "Failed to open file">
	//   19   42:aload_1         
	//   20   43:invokestatic    #84  <Method int Log.d(String, String, Throwable)>
	//   21   46:pop             
			k.onLoadFailed(((Exception) (priority)));
	//   22   47:aload_2         
	//   23   48:aload_1         
	//   24   49:invokeinterface #88  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   25   54:return          
		}
		k.onDataReady(data);
	}

	private Object data;
	private final File file;
	private final FileLoader.FileOpener opener;

	FileLoader$FileFetcher(File file1, FileLoader.FileOpener fileopener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		file = file1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field File file>
		opener = fileopener;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field FileLoader$FileOpener opener>
	//    8   14:return          
	}
}
