// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.HttpUrlFetcher;
import com.bumptech.glide.load.model.*;

public class HttpGlideUrlLoader
	implements ModelLoader
{
	public static class Factory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new HttpGlideUrlLoader(modelCache)));
		//    0    0:new             #9   <Class HttpGlideUrlLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #26  <Field ModelCache modelCache>
		//    4    8:invokespecial   #33  <Method void HttpGlideUrlLoader(ModelCache)>
		//    5   11:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final ModelCache modelCache = new ModelCache(500L);

		public Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #19  <Class ModelCache>
		//    4    8:dup             
		//    5    9:ldc2w           #20  <Long 500L>
		//    6   12:invokespecial   #24  <Method void ModelCache(long)>
		//    7   15:putfield        #26  <Field ModelCache modelCache>
		//    8   18:return          
		}
	}


	public HttpGlideUrlLoader()
	{
		this(((ModelCache) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #40  <Method void HttpGlideUrlLoader(ModelCache)>
	//    3    5:return          
	}

	public HttpGlideUrlLoader(ModelCache modelcache)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Object()>
		modelCache = modelcache;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #44  <Field ModelCache modelCache>
	//    5    9:return          
	}

	public com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(GlideUrl glideurl, int i, int j, Options options)
	{
		ModelCache modelcache = modelCache;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field ModelCache modelCache>
	//    2    4:astore          6
		GlideUrl glideurl1 = glideurl;
	//    3    6:aload_1         
	//    4    7:astore          5
		if(modelcache != null)
	//*   5    9:aload           6
	//*   6   11:ifnull          49
		{
			glideurl1 = (GlideUrl)modelcache.get(((Object) (glideurl)), 0, 0);
	//    7   14:aload           6
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:iconst_0        
	//   11   19:invokevirtual   #56  <Method Object ModelCache.get(Object, int, int)>
	//   12   22:checkcast       #58  <Class GlideUrl>
	//   13   25:astore          5
			if(glideurl1 == null)
	//*  14   27:aload           5
	//*  15   29:ifnonnull       49
			{
				modelCache.put(((Object) (glideurl)), 0, 0, ((Object) (glideurl)));
	//   16   32:aload_0         
	//   17   33:getfield        #44  <Field ModelCache modelCache>
	//   18   36:aload_1         
	//   19   37:iconst_0        
	//   20   38:iconst_0        
	//   21   39:aload_1         
	//   22   40:invokevirtual   #62  <Method void ModelCache.put(Object, int, int, Object)>
				glideurl1 = glideurl;
	//   23   43:aload_1         
	//   24   44:astore          5
			}
		}
	//*  25   46:goto            49
		return new com.bumptech.glide.load.model.ModelLoader.LoadData(((com.bumptech.glide.load.Key) (glideurl1)), ((com.bumptech.glide.load.data.DataFetcher) (new HttpUrlFetcher(glideurl1, ((Integer)options.get(TIMEOUT)).intValue()))));
	//   26   49:new             #64  <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//   27   52:dup             
	//   28   53:aload           5
	//   29   55:new             #66  <Class HttpUrlFetcher>
	//   30   58:dup             
	//   31   59:aload           5
	//   32   61:aload           4
	//   33   63:getstatic       #35  <Field Option TIMEOUT>
	//   34   66:invokevirtual   #71  <Method Object Options.get(Option)>
	//   35   69:checkcast       #23  <Class Integer>
	//   36   72:invokevirtual   #75  <Method int Integer.intValue()>
	//   37   75:invokespecial   #78  <Method void HttpUrlFetcher(GlideUrl, int)>
	//   38   78:invokespecial   #81  <Method void com.bumptech.glide.load.model.ModelLoader$LoadData(com.bumptech.glide.load.Key, com.bumptech.glide.load.data.DataFetcher)>
	//   39   81:areturn         
	}

	public volatile com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((GlideUrl)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #58  <Class GlideUrl>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #85  <Method com.bumptech.glide.load.model.ModelLoader$LoadData buildLoadData(GlideUrl, int, int, Options)>
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
	//    2    2:checkcast       #58  <Class GlideUrl>
	//    3    5:invokevirtual   #90  <Method boolean handles(GlideUrl)>
	//    4    8:ireturn         
	}

	public static final Option TIMEOUT = Option.memory("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", ((Object) (Integer.valueOf(2500))));
	private final ModelCache modelCache;

	static 
	{
	//    0    0:ldc1            #21  <String "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout">
	//    1    2:sipush          2500
	//    2    5:invokestatic    #27  <Method Integer Integer.valueOf(int)>
	//    3    8:invokestatic    #33  <Method Option Option.memory(String, Object)>
	//    4   11:putstatic       #35  <Field Option TIMEOUT>
	//*   5   14:return          
	}
}
