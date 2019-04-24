// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.load.model:
//			ByteBufferFileLoader

static class ByteBufferFileLoader$ByteBufferFetcher
	implements DataFetcher
{

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
	//    0    0:return          
	}

	public Class getDataClass()
	{
		return java/nio/ByteBuffer;
	//    0    0:ldc1            #27  <Class ByteBuffer>
	//    1    2:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #38  <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		try
		{
			priority = ((Priority) (ByteBufferUtil.fromFile(file)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field File file>
	//    2    4:invokestatic    #48  <Method ByteBuffer ByteBufferUtil.fromFile(File)>
	//    3    7:astore_1        
		}
	//*   4    8:goto            38
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*   5   11:astore_1        
		{
			if(Log.isLoggable("ByteBufferFileLoader", 3))
	//*   6   12:ldc1            #50  <String "ByteBufferFileLoader">
	//*   7   14:iconst_3        
	//*   8   15:invokestatic    #56  <Method boolean Log.isLoggable(String, int)>
	//*   9   18:ifeq            30
				Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", ((Throwable) (priority)));
	//   10   21:ldc1            #50  <String "ByteBufferFileLoader">
	//   11   23:ldc1            #58  <String "Failed to obtain ByteBuffer for file">
	//   12   25:aload_1         
	//   13   26:invokestatic    #62  <Method int Log.d(String, String, Throwable)>
	//   14   29:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   15   30:aload_2         
	//   16   31:aload_1         
	//   17   32:invokeinterface #68  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   18   37:return          
		}
		datacallback.onDataReady(((Object) (priority)));
	//   19   38:aload_2         
	//   20   39:aload_1         
	//   21   40:invokeinterface #72  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
	//   22   45:return          
	}

	private final File file;

	public ByteBufferFileLoader$ByteBufferFetcher(File file1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		file = file1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field File file>
	//    5    9:return          
	}
}
