// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.signature.ObjectKey;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoader, ModelLoaderFactory, MultiModelLoaderFactory

public class UnitModelLoader
	implements ModelLoader
{
	public static class Factory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new UnitModelLoader()));
		//    0    0:new             #9   <Class UnitModelLoader>
		//    1    3:dup             
		//    2    4:invokespecial   #18  <Method void UnitModelLoader()>
		//    3    7:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		public Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}

	static class UnitFetcher
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

		public UnitFetcher(Object obj)
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


	public UnitModelLoader()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return new ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(obj))), ((DataFetcher) (new UnitFetcher(obj))));
	//    0    0:new             #22  <Class ModelLoader$LoadData>
	//    1    3:dup             
	//    2    4:new             #24  <Class ObjectKey>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #27  <Method void ObjectKey(Object)>
	//    6   12:new             #12  <Class UnitModelLoader$UnitFetcher>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #28  <Method void UnitModelLoader$UnitFetcher(Object)>
	//   10   20:invokespecial   #31  <Method void ModelLoader$LoadData(com.bumptech.glide.load.Key, DataFetcher)>
	//   11   23:areturn         
	}

	public boolean handles(Object obj)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}
}
