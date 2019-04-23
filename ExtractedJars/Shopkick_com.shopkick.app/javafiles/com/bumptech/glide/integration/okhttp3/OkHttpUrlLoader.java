// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.integration.okhttp3;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.*;
import okhttp3.OkHttpClient;

// Referenced classes of package com.bumptech.glide.integration.okhttp3:
//			OkHttpStreamFetcher

public class OkHttpUrlLoader
	implements ModelLoader
{
	public static class Factory
		implements ModelLoaderFactory
	{

		private static okhttp3.Call.Factory getInternalClient()
		{
			if(internalClient != null)
				break MISSING_BLOCK_LABEL_37;
		//    0    0:getstatic       #31  <Field okhttp3.Call$Factory internalClient>
		//    1    3:ifnonnull       37
			com/bumptech/glide/integration/okhttp3/OkHttpUrlLoader$Factory;
		//    2    6:ldc1            #2   <Class OkHttpUrlLoader$Factory>
			JVM INSTR monitorenter ;
		//    3    8:monitorenter    
			if(internalClient == null)
		//*   4    9:getstatic       #31  <Field okhttp3.Call$Factory internalClient>
		//*   5   12:ifnonnull       25
				internalClient = ((okhttp3.Call.Factory) (new OkHttpClient()));
		//    6   15:new             #33  <Class OkHttpClient>
		//    7   18:dup             
		//    8   19:invokespecial   #34  <Method void OkHttpClient()>
		//    9   22:putstatic       #31  <Field okhttp3.Call$Factory internalClient>
			com/bumptech/glide/integration/okhttp3/OkHttpUrlLoader$Factory;
		//   10   25:ldc1            #2   <Class OkHttpUrlLoader$Factory>
			JVM INSTR monitorexit ;
		//   11   27:monitorexit     
			break MISSING_BLOCK_LABEL_37;
		//   12   28:goto            37
			Exception exception;
			exception;
		//   13   31:astore_0        
			com/bumptech/glide/integration/okhttp3/OkHttpUrlLoader$Factory;
		//   14   32:ldc1            #2   <Class OkHttpUrlLoader$Factory>
			JVM INSTR monitorexit ;
		//   15   34:monitorexit     
			throw exception;
		//   16   35:aload_0         
		//   17   36:athrow          
			return internalClient;
		//   18   37:getstatic       #31  <Field okhttp3.Call$Factory internalClient>
		//   19   40:areturn         
		}

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new OkHttpUrlLoader(client)));
		//    0    0:new             #9   <Class OkHttpUrlLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field okhttp3.Call$Factory client>
		//    4    8:invokespecial   #37  <Method void OkHttpUrlLoader(okhttp3.Call$Factory)>
		//    5   11:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private static volatile okhttp3.Call.Factory internalClient;
		private final okhttp3.Call.Factory client;

		public Factory()
		{
			this(getInternalClient());
		//    0    0:aload_0         
		//    1    1:invokestatic    #19  <Method okhttp3.Call$Factory getInternalClient()>
		//    2    4:invokespecial   #22  <Method void OkHttpUrlLoader$Factory(okhttp3.Call$Factory)>
		//    3    7:return          
		}

		public Factory(okhttp3.Call.Factory factory)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			client = factory;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #28  <Field okhttp3.Call$Factory client>
		//    5    9:return          
		}
	}


	public OkHttpUrlLoader(okhttp3.Call.Factory factory)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		client = factory;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field okhttp3.Call$Factory client>
	//    5    9:return          
	}

	public com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(GlideUrl glideurl, int i, int j, Options options)
	{
		return new com.bumptech.glide.load.model.ModelLoader.LoadData(((com.bumptech.glide.load.Key) (glideurl)), ((com.bumptech.glide.load.data.DataFetcher) (new OkHttpStreamFetcher(client, glideurl))));
	//    0    0:new             #26  <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:new             #28  <Class OkHttpStreamFetcher>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #20  <Field okhttp3.Call$Factory client>
	//    7   13:aload_1         
	//    8   14:invokespecial   #31  <Method void OkHttpStreamFetcher(okhttp3.Call$Factory, GlideUrl)>
	//    9   17:invokespecial   #34  <Method void com.bumptech.glide.load.model.ModelLoader$LoadData(com.bumptech.glide.load.Key, com.bumptech.glide.load.data.DataFetcher)>
	//   10   20:areturn         
	}

	public volatile com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((GlideUrl)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class GlideUrl>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #41  <Method com.bumptech.glide.load.model.ModelLoader$LoadData buildLoadData(GlideUrl, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(GlideUrl glideurl)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((GlideUrl)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #39  <Class GlideUrl>
	//    3    5:invokevirtual   #46  <Method boolean handles(GlideUrl)>
	//    4    8:ireturn         
	}

	private final okhttp3.Call.Factory client;
}
