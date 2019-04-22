// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;

// Referenced classes of package com.bumptech.glide.load.model:
//			UnitModelLoader

private static class UnitModelLoader$UnitFetcher
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
		return resource.getClass();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Object resource>
	//    2    4:invokevirtual   #31  <Method Class Object.getClass()>
	//    3    7:areturn         
	}

	public DataSource getDataSource()
	{
		return DataSource.LOCAL;
	//    0    0:getstatic       #41  <Field DataSource DataSource.LOCAL>
	//    1    3:areturn         
	}

	public void loadData(Priority priority, com.bumptech.glide.load.data.DataFetcher.DataCallback datacallback)
	{
		datacallback.onDataReady(resource);
	//    0    0:aload_2         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field Object resource>
	//    3    5:invokeinterface #48  <Method void com.bumptech.glide.load.data.DataFetcher$DataCallback.onDataReady(Object)>
	//    4   10:return          
	}

	private final Object resource;

	UnitModelLoader$UnitFetcher(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		resource = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Object resource>
	//    5    9:return          
	}
}
