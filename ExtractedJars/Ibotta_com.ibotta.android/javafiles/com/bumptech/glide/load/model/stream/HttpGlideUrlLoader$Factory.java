// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.*;

// Referenced classes of package com.bumptech.glide.load.model.stream:
//			HttpGlideUrlLoader

public static class HttpGlideUrlLoader$Factory
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

	public HttpGlideUrlLoader$Factory()
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
