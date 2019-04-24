// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model.stream;

import android.content.Context;
import com.bumptech.glide.load.model.*;

// Referenced classes of package com.bumptech.glide.load.model.stream:
//			MediaStoreVideoThumbLoader

public static class MediaStoreVideoThumbLoader$Factory
	implements ModelLoaderFactory
{

	public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
	{
		return ((ModelLoader) (new MediaStoreVideoThumbLoader(context)));
	//    0    0:new             #9   <Class MediaStoreVideoThumbLoader>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Context context>
	//    4    8:invokespecial   #24  <Method void MediaStoreVideoThumbLoader(Context)>
	//    5   11:areturn         
	}

	public void teardown()
	{
	//    0    0:return          
	}

	private final Context context;

	public MediaStoreVideoThumbLoader$Factory(Context context1)
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
