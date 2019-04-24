// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.model.stream;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.data.mediastore.ThumbFetcher;
import com.bumptech.glide.load.model.*;
import com.bumptech.glide.signature.ObjectKey;

public class MediaStoreImageThumbLoader
	implements ModelLoader
{
	public static class Factory
		implements ModelLoaderFactory
	{

		public ModelLoader build(MultiModelLoaderFactory multimodelloaderfactory)
		{
			return ((ModelLoader) (new MediaStoreImageThumbLoader(context)));
		//    0    0:new             #9   <Class MediaStoreImageThumbLoader>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #19  <Field Context context>
		//    4    8:invokespecial   #24  <Method void MediaStoreImageThumbLoader(Context)>
		//    5   11:areturn         
		}

		public void teardown()
		{
		//    0    0:return          
		}

		private final Context context;

		public Factory(Context context1)
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


	public MediaStoreImageThumbLoader(Context context1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		context = context1.getApplicationContext();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method Context Context.getApplicationContext()>
	//    5    9:putfield        #25  <Field Context context>
	//    6   12:return          
	}

	public com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Uri uri, int i, int j, Options options)
	{
		if(MediaStoreUtil.isThumbnailSize(i, j))
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:invokestatic    #34  <Method boolean MediaStoreUtil.isThumbnailSize(int, int)>
	//*   3    5:ifeq            32
			return new com.bumptech.glide.load.model.ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(((Object) (uri))))), ((com.bumptech.glide.load.data.DataFetcher) (ThumbFetcher.buildImageFetcher(context, uri))));
	//    4    8:new             #36  <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//    5   11:dup             
	//    6   12:new             #38  <Class ObjectKey>
	//    7   15:dup             
	//    8   16:aload_1         
	//    9   17:invokespecial   #41  <Method void ObjectKey(Object)>
	//   10   20:aload_0         
	//   11   21:getfield        #25  <Field Context context>
	//   12   24:aload_1         
	//   13   25:invokestatic    #47  <Method ThumbFetcher ThumbFetcher.buildImageFetcher(Context, Uri)>
	//   14   28:invokespecial   #50  <Method void com.bumptech.glide.load.model.ModelLoader$LoadData(com.bumptech.glide.load.Key, com.bumptech.glide.load.data.DataFetcher)>
	//   15   31:areturn         
		else
			return null;
	//   16   32:aconst_null     
	//   17   33:areturn         
	}

	public volatile com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #55  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #57  <Method com.bumptech.glide.load.model.ModelLoader$LoadData buildLoadData(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri)
	{
		return MediaStoreUtil.isMediaStoreImageUri(uri);
	//    0    0:aload_1         
	//    1    1:invokestatic    #62  <Method boolean MediaStoreUtil.isMediaStoreImageUri(Uri)>
	//    2    4:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((Uri)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #55  <Class Uri>
	//    3    5:invokevirtual   #65  <Method boolean handles(Uri)>
	//    4    8:ireturn         
	}

	public final Context context;
}
