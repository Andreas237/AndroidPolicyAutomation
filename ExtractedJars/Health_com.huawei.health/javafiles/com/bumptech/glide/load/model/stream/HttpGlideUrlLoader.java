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
		//    3    5:getfield        #24  <Field ModelCache modelCache>
		//    4    8:invokespecial   #30  <Method void HttpGlideUrlLoader(ModelCache)>
		//    5   11:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final ModelCache modelCache = new ModelCache(500);

		public Factory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #19  <Class ModelCache>
		//    4    8:dup             
		//    5    9:sipush          500
		//    6   12:invokespecial   #22  <Method void ModelCache(int)>
		//    7   15:putfield        #24  <Field ModelCache modelCache>
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
		GlideUrl glideurl1 = glideurl;
	//    0    0:aload_1         
	//    1    1:astore          5
		if(modelCache != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #44  <Field ModelCache modelCache>
	//*   4    7:ifnull          48
		{
			GlideUrl glideurl2 = (GlideUrl)modelCache.get(((Object) (glideurl)), 0, 0);
	//    5   10:aload_0         
	//    6   11:getfield        #44  <Field ModelCache modelCache>
	//    7   14:aload_1         
	//    8   15:iconst_0        
	//    9   16:iconst_0        
	//   10   17:invokevirtual   #54  <Method Object ModelCache.get(Object, int, int)>
	//   11   20:checkcast       #56  <Class GlideUrl>
	//   12   23:astore          6
			glideurl1 = glideurl2;
	//   13   25:aload           6
	//   14   27:astore          5
			if(glideurl2 == null)
	//*  15   29:aload           6
	//*  16   31:ifnonnull       48
			{
				modelCache.put(((Object) (glideurl)), 0, 0, ((Object) (glideurl)));
	//   17   34:aload_0         
	//   18   35:getfield        #44  <Field ModelCache modelCache>
	//   19   38:aload_1         
	//   20   39:iconst_0        
	//   21   40:iconst_0        
	//   22   41:aload_1         
	//   23   42:invokevirtual   #60  <Method void ModelCache.put(Object, int, int, Object)>
				glideurl1 = glideurl;
	//   24   45:aload_1         
	//   25   46:astore          5
			}
		}
		return new com.bumptech.glide.load.model.ModelLoader.LoadData(((com.bumptech.glide.load.Key) (glideurl1)), ((com.bumptech.glide.load.data.DataFetcher) (new HttpUrlFetcher(glideurl1, ((Integer)options.get(TIMEOUT)).intValue()))));
	//   26   48:new             #62  <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//   27   51:dup             
	//   28   52:aload           5
	//   29   54:new             #64  <Class HttpUrlFetcher>
	//   30   57:dup             
	//   31   58:aload           5
	//   32   60:aload           4
	//   33   62:getstatic       #35  <Field Option TIMEOUT>
	//   34   65:invokevirtual   #69  <Method Object Options.get(Option)>
	//   35   68:checkcast       #23  <Class Integer>
	//   36   71:invokevirtual   #73  <Method int Integer.intValue()>
	//   37   74:invokespecial   #76  <Method void HttpUrlFetcher(GlideUrl, int)>
	//   38   77:invokespecial   #79  <Method void com.bumptech.glide.load.model.ModelLoader$LoadData(com.bumptech.glide.load.Key, com.bumptech.glide.load.data.DataFetcher)>
	//   39   80:areturn         
	}

	public volatile com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((GlideUrl)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #56  <Class GlideUrl>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #83  <Method com.bumptech.glide.load.model.ModelLoader$LoadData buildLoadData(GlideUrl, int, int, Options)>
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
	//    2    2:checkcast       #56  <Class GlideUrl>
	//    3    5:invokevirtual   #88  <Method boolean handles(GlideUrl)>
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
