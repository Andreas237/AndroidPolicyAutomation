// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.data:
//			DataFetcher

public abstract class AssetPathFetcher
	implements DataFetcher
{

	public AssetPathFetcher(AssetManager assetmanager, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		assetManager = assetmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field AssetManager assetManager>
		assetPath = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field String assetPath>
	//    8   14:return          
	}

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
		Object obj = data;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field Object data>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
			return;
	//    5    9:return          
		try
		{
			close(obj);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokevirtual   #34  <Method void close(Object)>
			return;
	//    9   15:return          
		}
		catch(IOException ioexception)
	//*  10   16:astore_1        
		{
			return;
	//   11   17:return          
		}
	}

	protected abstract void close(Object obj)
		throws IOException;

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #43  <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, DataFetcher.DataCallback datacallback)
	{
		try
		{
			data = loadResource(assetManager, assetPath);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_0         
	//    3    3:getfield        #21  <Field AssetManager assetManager>
	//    4    6:aload_0         
	//    5    7:getfield        #23  <Field String assetPath>
	//    6   10:invokevirtual   #50  <Method Object loadResource(AssetManager, String)>
	//    7   13:putfield        #30  <Field Object data>
		}
	//*   8   16:aload_2         
	//*   9   17:aload_0         
	//*  10   18:getfield        #30  <Field Object data>
	//*  11   21:invokeinterface #55  <Method void DataFetcher$DataCallback.onDataReady(Object)>
	//*  12   26:return          
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*  13   27:astore_1        
		{
			if(Log.isLoggable("AssetPathFetcher", 3))
	//*  14   28:ldc1            #57  <String "AssetPathFetcher">
	//*  15   30:iconst_3        
	//*  16   31:invokestatic    #63  <Method boolean Log.isLoggable(String, int)>
	//*  17   34:ifeq            46
				Log.d("AssetPathFetcher", "Failed to load data from asset manager", ((Throwable) (priority)));
	//   18   37:ldc1            #57  <String "AssetPathFetcher">
	//   19   39:ldc1            #65  <String "Failed to load data from asset manager">
	//   20   41:aload_1         
	//   21   42:invokestatic    #69  <Method int Log.d(String, String, Throwable)>
	//   22   45:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   23   46:aload_2         
	//   24   47:aload_1         
	//   25   48:invokeinterface #73  <Method void DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   26   53:return          
		}
		datacallback.onDataReady(data);
	}

	protected abstract Object loadResource(AssetManager assetmanager, String s)
		throws IOException;

	private final AssetManager assetManager;
	private final String assetPath;
	private Object data;
}
