// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.model:
//			DataUrlLoader

static final class DataUrlLoader$DataUriFetcher
	implements DataFetcher
{

	public void cancel()
	{
	//    0    0:return          
	}

	public void cleanup()
	{
		try
		{
			reader.close(data);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DataUrlLoader$DataDecoder reader>
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Object data>
	//    4    8:invokeinterface #42  <Method void DataUrlLoader$DataDecoder.close(Object)>
			return;
	//    5   13:return          
		}
		catch(IOException ioexception)
	//*   6   14:astore_1        
		{
			return;
	//    7   15:return          
		}
	}

	public Class getDataClass()
	{
		return reader.getDataClass();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field DataUrlLoader$DataDecoder reader>
	//    2    4:invokeinterface #47  <Method Class DataUrlLoader$DataDecoder.getDataClass()>
	//    3    9:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #57  <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		try
		{
			data = reader.decode(dataUri);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #27  <Field DataUrlLoader$DataDecoder reader>
	//    3    5:aload_0         
	//    4    6:getfield        #25  <Field String dataUri>
	//    5    9:invokeinterface #65  <Method Object DataUrlLoader$DataDecoder.decode(String)>
	//    6   14:putfield        #36  <Field Object data>
			datacallback.onDataReady(data);
	//    7   17:aload_2         
	//    8   18:aload_0         
	//    9   19:getfield        #36  <Field Object data>
	//   10   22:invokeinterface #70  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
			return;
	//   11   27:return          
		}
		// Misplaced declaration of an exception variable
		catch(Priority priority)
	//*  12   28:astore_1        
		{
			datacallback.onLoadFailed(((Exception) (priority)));
	//   13   29:aload_2         
	//   14   30:aload_1         
	//   15   31:invokeinterface #74  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onLoadFailed(Exception)>
		}
	//   16   36:return          
	}

	private Object data;
	private final String dataUri;
	private final DataUrlLoader.DataDecoder reader;

	public DataUrlLoader$DataUriFetcher(String s, DataUrlLoader.DataDecoder datadecoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		dataUri = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #25  <Field String dataUri>
		reader = datadecoder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #27  <Field DataUrlLoader$DataDecoder reader>
	//    8   14:return          
	}
}
