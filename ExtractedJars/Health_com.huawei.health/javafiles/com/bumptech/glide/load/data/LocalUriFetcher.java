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
		if(data != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #34  <Field Object data>
	//*   2    4:ifnull          17
			try
			{
				close(data);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #34  <Field Object data>
	//    6   12:invokevirtual   #38  <Method void close(Object)>
				return;
	//    7   15:return          
			}
			catch(IOException ioexception) { }
	//    8   16:astore_1        
	//    9   17:return          
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
	//*   8   16:goto            46
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*   9   19:astore_1        
		{
			if(Log.isLoggable("LocalUriFetcher", 3))
	//*  10   20:ldc1            #11  <String "LocalUriFetcher">
	//*  11   22:iconst_3        
	//*  12   23:invokestatic    #62  <Method boolean Log.isLoggable(String, int)>
	//*  13   26:ifeq            38
				Log.d("LocalUriFetcher", "Failed to open Uri", ((Throwable) (priority)));
	//   14   29:ldc1            #11  <String "LocalUriFetcher">
	//   15   31:ldc1            #64  <String "Failed to open Uri">
	//   16   33:aload_1         
	//   17   34:invokestatic    #68  <Method int Log.d(String, String, Throwable)>
	//   18   37:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   19   38:aload_2         
	//   20   39:aload_1         
	//   21   40:invokeinterface #74  <Method void DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   22   45:return          
		}
		datacallback.onDataReady(data);
	//   23   46:aload_2         
	//   24   47:aload_0         
	//   25   48:getfield        #34  <Field Object data>
	//   26   51:invokeinterface #77  <Method void DataFetcher$DataCallback.onDataReady(Object)>
	//   27   56:return          
	}

	protected abstract Object loadResource(Uri uri1, ContentResolver contentresolver)
		throws FileNotFoundException;

	private static final String TAG = "LocalUriFetcher";
	private final ContentResolver contentResolver;
	private Object data;
	private final Uri uri;
}
