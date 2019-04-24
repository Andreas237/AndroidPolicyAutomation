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
	//    1    1:invokespecial   #22  <Method void Object()>
		assetManager = assetmanager;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #24  <Field AssetManager assetManager>
		assetPath = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #26  <Field String assetPath>
	//    8   14:return          
	}

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
		if(data == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object data>
	//*   2    4:ifnonnull       8
			return;
	//    3    7:return          
		try
		{
			close(data);
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:getfield        #33  <Field Object data>
	//    7   13:invokevirtual   #37  <Method void close(Object)>
			return;
	//    8   16:return          
		}
		catch(IOException ioexception)
	//*   9   17:astore_1        
		{
			return;
	//   10   18:return          
		}
	}

	protected abstract void close(Object obj)
		throws IOException;

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #46  <Field DataSource DataSource.LOCAL>
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
	//    3    3:getfield        #24  <Field AssetManager assetManager>
	//    4    6:aload_0         
	//    5    7:getfield        #26  <Field String assetPath>
	//    6   10:invokevirtual   #53  <Method Object loadResource(AssetManager, String)>
	//    7   13:putfield        #33  <Field Object data>
		}
	//*   8   16:goto            46
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*   9   19:astore_1        
		{
			if(Log.isLoggable("AssetPathFetcher", 3))
	//*  10   20:ldc1            #11  <String "AssetPathFetcher">
	//*  11   22:iconst_3        
	//*  12   23:invokestatic    #59  <Method boolean Log.isLoggable(String, int)>
	//*  13   26:ifeq            38
				Log.d("AssetPathFetcher", "Failed to load data from asset manager", ((Throwable) (priority)));
	//   14   29:ldc1            #11  <String "AssetPathFetcher">
	//   15   31:ldc1            #61  <String "Failed to load data from asset manager">
	//   16   33:aload_1         
	//   17   34:invokestatic    #65  <Method int Log.d(String, String, Throwable)>
	//   18   37:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   19   38:aload_2         
	//   20   39:aload_1         
	//   21   40:invokeinterface #71  <Method void DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   22   45:return          
		}
		datacallback.onDataReady(data);
	//   23   46:aload_2         
	//   24   47:aload_0         
	//   25   48:getfield        #33  <Field Object data>
	//   26   51:invokeinterface #74  <Method void DataFetcher$DataCallback.onDataReady(Object)>
	//   27   56:return          
	}

	protected abstract Object loadResource(AssetManager assetmanager, String s)
		throws IOException;

	private static final String TAG = "AssetPathFetcher";
	private final AssetManager assetManager;
	private final String assetPath;
	private Object data;
}
