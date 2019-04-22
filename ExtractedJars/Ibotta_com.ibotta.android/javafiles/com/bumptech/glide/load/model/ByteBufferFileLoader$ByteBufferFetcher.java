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

private static final class ByteBufferFileLoader$ByteBufferFetcher
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
	//*   4    8:aload_2         
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #54  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
	//*   7   15:return          
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*   8   16:astore_1        
		{
			if(Log.isLoggable("ByteBufferFileLoader", 3))
	//*   9   17:ldc1            #56  <String "ByteBufferFileLoader">
	//*  10   19:iconst_3        
	//*  11   20:invokestatic    #62  <Method boolean Log.isLoggable(String, int)>
	//*  12   23:ifeq            35
				Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", ((Throwable) (priority)));
	//   13   26:ldc1            #56  <String "ByteBufferFileLoader">
	//   14   28:ldc1            #64  <String "Failed to obtain ByteBuffer for file">
	//   15   30:aload_1         
	//   16   31:invokestatic    #68  <Method int Log.d(String, String, Throwable)>
	//   17   34:pop             
			datacallback.onLoadFailed(((Exception) (priority)));
	//   18   35:aload_2         
	//   19   36:aload_1         
	//   20   37:invokeinterface #72  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
			return;
	//   21   42:return          
		}
		datacallback.onDataReady(((Object) (priority)));
	}

	private final File file;

	ByteBufferFileLoader$ByteBufferFetcher(File file1)
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
