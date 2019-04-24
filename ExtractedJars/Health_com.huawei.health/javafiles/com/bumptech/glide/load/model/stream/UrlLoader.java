// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.*;
import java.io.InputStream;
import java.net.URL;

public class UrlLoader
	implements ModelLoader
{
	public static class StreamFactory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new UrlLoader(multimodelloaderfactory.build(com/bumptech/glide/load/model/GlideUrl, java/io/InputStream))));
		//    0    0:new             #9   <Class UrlLoader>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:ldc1            #19  <Class GlideUrl>
		//    4    7:ldc1            #21  <Class InputStream>
		//    5    9:invokevirtual   #26  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    6   12:invokespecial   #29  <Method void UrlLoader(ModelLoader)>
		//    7   15:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		public StreamFactory()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
		//    2    4:return          
		}
	}


	public UrlLoader(ModelLoader modelloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		glideUrlLoader = modelloader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field ModelLoader glideUrlLoader>
	//    5    9:return          
	}

	public volatile com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((URL)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class URL>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #30  <Method com.bumptech.glide.load.model.ModelLoader$LoadData buildLoadData(URL, int, int, Options)>
	//    7   12:areturn         
	}

	public com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(URL url, int i, int j, Options options)
	{
		return glideUrlLoader.buildLoadData(((Object) (new GlideUrl(url))), i, j, options);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field ModelLoader glideUrlLoader>
	//    2    4:new             #32  <Class GlideUrl>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #35  <Method void GlideUrl(URL)>
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:aload           4
	//    9   16:invokeinterface #37  <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   10   21:areturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((URL)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class URL>
	//    3    5:invokevirtual   #43  <Method boolean handles(URL)>
	//    4    8:ireturn         
	}

	public boolean handles(URL url)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private final ModelLoader glideUrlLoader;
}
