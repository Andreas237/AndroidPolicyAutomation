// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.data:
//			DataFetcher

public abstract class LocalUriFetcher
	implements DataFetcher
{

	public LocalUriFetcher(ContentResolver contentresolver, Uri uri1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		contentResolver = contentresolver;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field ContentResolver contentResolver>
		uri = uri1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field Uri uri>
	//    8   14:return          
	}

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
		Object obj;
		obj = data;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field Object data>
	//    2    4:astore_1        
		if(obj == null)
			break MISSING_BLOCK_LABEL_14;
	//    3    5:aload_1         
	//    4    6:ifnull          14
		close(obj);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #38  <Method void close(Object)>
		return;
	//    8   14:return          
		IOException ioexception;
		ioexception;
	//    9   15:astore_1        
	//   10   16:return          
	}

	protected abstract void close(Object obj)
		throws IOException;

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #47  <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public final void loadData(Priority priority, DataFetcher.DataCallback datacallback)
	{
		try
		{
			data = loadResource(uri, contentResolver);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field Uri uri>
	//    4    6:aload_0         
	//    5    7:getfield        #25  <Field ContentResolver contentResolver>
	//    6   10:invokevirtual   #56  <Method Object loadResource(Uri, ContentResolver)>
	//    7   13:putfield        #34  <Field Object data>
		}
	//*   8   16:aload_2         
	//*   9   17:aload_0         
	//*  10   18:getfield        #34  <Field Object data>
	//*  11   21:invokeinterface #61  <Method void DataFetcher$DataCallback.onDataReady(Object)>
	//*  12   26:return          
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*  13   27:astore_1        
		{
			if(Log.isLoggable("LocalUriFetcher", 3))
	//*  14   28:ldc1            #11  <String "LocalUriFetcher">
	//*  15   30:iconst_3        
	//*  16   31:invokestatic    #67  <Method boolean Log.isLoggable(String, int)>
	//*  17   34:ifeq            46
				Log.d("LocalUriFetcher", "Failed to open Uri", ((Throwable) (priority)));
	//   18   37:ldc1            #11  <String "LocalUriFetcher">
	//   19   39:ldc1            #69  <String "Failed to open Uri">
	//   20   41:aload_1         
	//   21   42:invokestatic    #73  <Method int Log.d(String, String, Throwable)>
	//   22   45:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   23   46:aload_2         
	//   24   47:aload_1         
	//   25   48:invokeinterface #77  <Method void DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   26   53:return          
		}
		datacallback.onDataReady(data);
	}

	protected abstract Object loadResource(Uri uri1, ContentResolver contentresolver)
		throws FileNotFoundException;

	private static final String TAG = "LocalUriFetcher";
	private final ContentResolver contentResolver;
	private Object data;
	private final Uri uri;
}
