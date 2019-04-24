// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;

// Referenced classes of package com.bumptech.glide.load.model:
//			ByteArrayLoader

static class ByteArrayLoader$Fetcher
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
		return converter.getDataClass();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ByteArrayLoader$Converter converter>
	//    2    4:invokeinterface #36  <Method Class ByteArrayLoader$Converter.getDataClass()>
	//    3    9:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #46  <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, com.bumptech.glide.load.data. )
	{
		.onDataReady(converter.convert(model));
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #24  <Field ByteArrayLoader$Converter converter>
	//    3    5:aload_0         
	//    4    6:getfield        #22  <Field byte[] model>
	//    5    9:invokeinterface #52  <Method Object ByteArrayLoader$Converter.convert(byte[])>
	//    6   14:invokeinterface #58  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
	//    7   19:return          
	}

	private final r converter;
	private final byte model[];

	public ByteArrayLoader$Fetcher(byte abyte0[], r r)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		model = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field byte[] model>
		converter = r;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ByteArrayLoader$Converter converter>
	//    8   14:return          
	}
}
