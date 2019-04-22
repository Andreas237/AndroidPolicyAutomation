// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model.stream;

import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.*;
import java.io.InputStream;
import java.util.*;

public class HttpUriLoader
	implements ModelLoader
{
	public static class Factory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new HttpUriLoader(multimodelloaderfactory.build(com/bumptech/glide/load/model/GlideUrl, java/io/InputStream))));
		//    0    0:new             #9   <Class HttpUriLoader>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:ldc1            #20  <Class GlideUrl>
		//    4    7:ldc1            #22  <Class InputStream>
		//    5    9:invokevirtual   #27  <Method ModelLoader MultiModelLoaderFactory.build(Class, Class)>
		//    6   12:invokespecial   #30  <Method void HttpUriLoader(ModelLoader)>
		//    7   15:areturn         
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


	public HttpUriLoader(ModelLoader modelloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #48  <Method void Object()>
		urlLoader = modelloader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #50  <Field ModelLoader urlLoader>
	//    5    9:return          
	}

	public com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Uri uri, int i, int j, Options options)
	{
		return urlLoader.buildLoadData(((Object) (new GlideUrl(uri.toString()))), i, j, options);
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field ModelLoader urlLoader>
	//    2    4:new             #57  <Class GlideUrl>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokevirtual   #63  <Method String Uri.toString()>
	//    6   12:invokespecial   #66  <Method void GlideUrl(String)>
	//    7   15:iload_2         
	//    8   16:iload_3         
	//    9   17:aload           4
	//   10   19:invokeinterface #69  <Method com.bumptech.glide.load.model.ModelLoader$LoadData ModelLoader.buildLoadData(Object, int, int, Options)>
	//   11   24:areturn         
	}

	public volatile com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #59  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #73  <Method com.bumptech.glide.load.model.ModelLoader$LoadData buildLoadData(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri)
	{
		return SCHEMES.contains(((Object) (uri.getScheme())));
	//    0    0:getstatic       #44  <Field Set SCHEMES>
	//    1    3:aload_1         
	//    2    4:invokevirtual   #78  <Method String Uri.getScheme()>
	//    3    7:invokeinterface #84  <Method boolean Set.contains(Object)>
	//    4   12:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((Uri)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #59  <Class Uri>
	//    3    5:invokevirtual   #86  <Method boolean handles(Uri)>
	//    4    8:ireturn         
	}

	private static final Set SCHEMES = Collections.unmodifiableSet(((Set) (new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[] {
		"http", "https"
	})))))))));
	private final ModelLoader urlLoader;

	static 
	{
	//    0    0:new             #20  <Class HashSet>
	//    1    3:dup             
	//    2    4:iconst_2        
	//    3    5:anewarray       String[]
	//    4    8:dup             
	//    5    9:iconst_0        
	//    6   10:ldc1            #24  <String "http">
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:ldc1            #26  <String "https">
	//   11   17:aastore         
	//   12   18:invokestatic    #32  <Method java.util.List Arrays.asList(Object[])>
	//   13   21:invokespecial   #36  <Method void HashSet(java.util.Collection)>
	//   14   24:invokestatic    #42  <Method Set Collections.unmodifiableSet(Set)>
	//   15   27:putstatic       #44  <Field Set SCHEMES>
	//*  16   30:return          
	}
}
