// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.LibraryGlideModule;
import java.io.InputStream;

public final class OkHttpLibraryGlideModule extends LibraryGlideModule
{

	public OkHttpLibraryGlideModule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void LibraryGlideModule()>
	//    2    4:return          
	}

	public void registerComponents(Context context, Glide glide, Registry registry)
	{
		registry.replace(com/bumptech/glide/load/model/GlideUrl, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new OkHttpUrlLoader.Factory())));
	//    0    0:aload_3         
	//    1    1:ldc1            #14  <Class GlideUrl>
	//    2    3:ldc1            #16  <Class InputStream>
	//    3    5:new             #18  <Class OkHttpUrlLoader$Factory>
	//    4    8:dup             
	//    5    9:invokespecial   #19  <Method void OkHttpUrlLoader$Factory()>
	//    6   12:invokevirtual   #25  <Method Registry Registry.replace(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//    7   15:pop             
	//    8   16:return          
	}
}
