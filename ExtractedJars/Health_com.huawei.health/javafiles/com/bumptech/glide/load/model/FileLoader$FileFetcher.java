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

static class FileLoader$FileFetcher
	implements DataFetcher
{

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
		if(data != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Object data>
	//*   2    4:ifnull          22
			try
			{
				opener.close(data);
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field FileLoader$FileOpener opener>
	//    5   11:aload_0         
	//    6   12:getfield        #36  <Field Object data>
	//    7   15:invokeinterface #42  <Method void FileLoader$FileOpener.close(Object)>
				return;
	//    8   20:return          
			}
			catch(IOException ioexception) { }
	//    9   21:astore_1        
	//   10   22:return          
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
	//*   7   17:goto            47
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*   8   20:astore_1        
		{
			if(Log.isLoggable("FileLoader", 3))
	//*   9   21:ldc1            #67  <String "FileLoader">
	//*  10   23:iconst_3        
	//*  11   24:invokestatic    #73  <Method boolean Log.isLoggable(String, int)>
	//*  12   27:ifeq            39
				Log.d("FileLoader", "Failed to open file", ((Throwable) (priority)));
	//   13   30:ldc1            #67  <String "FileLoader">
	//   14   32:ldc1            #75  <String "Failed to open file">
	//   15   34:aload_1         
	//   16   35:invokestatic    #79  <Method int Log.d(String, String, Throwable)>
	//   17   38:pop             
			k.onLoadFailed(((Exception) (priority)));
	//   18   39:aload_2         
	//   19   40:aload_1         
	//   20   41:invokeinterface #85  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   21   46:return          
		}
		k.onDataReady(data);
	//   22   47:aload_2         
	//   23   48:aload_0         
	//   24   49:getfield        #36  <Field Object data>
	//   25   52:invokeinterface #88  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
	//   26   57:return          
	}

	private Object data;
	private final File file;
	private final FileLoader.FileOpener opener;

	public FileLoader$FileFetcher(File file1, FileLoader.FileOpener fileopener)
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
