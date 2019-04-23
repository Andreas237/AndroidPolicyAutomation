// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.integration.okhttp3;

import android.content.Context;
import com.bumptech.glide.*;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.GlideModule;
import java.io.InputStream;

public class OkHttpGlideModule
	implements GlideModule
{

	public OkHttpGlideModule()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public void applyOptions(Context context, GlideBuilder glidebuilder)
	{
	//    0    0:return          
	}

	public void registerComponents(Context context, Glide glide, Registry registry)
	{
		registry.replace(com/bumptech/glide/load/model/GlideUrl, java/io/InputStream, ((com.bumptech.glide.load.model.ModelLoaderFactory) (new OkHttpUrlLoader.Factory())));
	//    0    0:aload_3         
	//    1    1:ldc1            #20  <Class GlideUrl>
	//    2    3:ldc1            #22  <Class InputStream>
	//    3    5:new             #24  <Class OkHttpUrlLoader$Factory>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void OkHttpUrlLoader$Factory()>
	//    6   12:invokevirtual   #31  <Method Registry Registry.replace(Class, Class, com.bumptech.glide.load.model.ModelLoaderFactory)>
	//    7   15:pop             
	//    8   16:return          
	}
}
