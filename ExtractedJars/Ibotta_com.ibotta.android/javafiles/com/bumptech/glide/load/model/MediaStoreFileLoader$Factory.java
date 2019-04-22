// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model;

import android.content.Context;

// Referenced classes of package com.bumptech.glide.load.model:
//			ModelLoaderFactory, MediaStoreFileLoader, MultiModelLoaderFactory, ModelLoader

public static final class MediaStoreFileLoader$Factory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new MediaStoreFileLoader(context)));
	//    0    0:new             #9   <Class MediaStoreFileLoader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Context context>
	//    4    8:invokespecial   #25  <Method void MediaStoreFileLoader(Context)>
	//    5   11:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	private final Context context;

	public MediaStoreFileLoader$Factory(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Context context>
	//    5    9:return          
	}
}
