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
import com.bumptech.glide.load.resource.bitmap.VideoBitmapDecoder;
import com.bumptech.glide.signature.ObjectKey;

public class MediaStoreVideoThumbLoader
	implements ModelLoader
{
	public static class Factory
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


	MediaStoreVideoThumbLoader(Context context1)
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

	private boolean isRequestingDefaultFrame(Options options)
	{
		options = ((Options) ((Long)options.get(VideoBitmapDecoder.TARGET_FRAME)));
	//    0    0:aload_1         
	//    1    1:getstatic       #34  <Field com.bumptech.glide.load.Option VideoBitmapDecoder.TARGET_FRAME>
	//    2    4:invokevirtual   #40  <Method Object Options.get(com.bumptech.glide.load.Option)>
	//    3    7:checkcast       #42  <Class Long>
	//    4   10:astore_1        
		return options != null && ((Long) (options)).longValue() == -1L;
	//    5   11:aload_1         
	//    6   12:ifnull          28
	//    7   15:aload_1         
	//    8   16:invokevirtual   #46  <Method long Long.longValue()>
	//    9   19:ldc2w           #47  <Long -1L>
	//   10   22:lcmp            
	//   11   23:ifne            28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	public com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Uri uri, int i, int j, Options options)
	{
		if(MediaStoreUtil.isThumbnailSize(i, j) && isRequestingDefaultFrame(options))
	//*   0    0:iload_2         
	//*   1    1:iload_3         
	//*   2    2:invokestatic    #57  <Method boolean MediaStoreUtil.isThumbnailSize(int, int)>
	//*   3    5:ifeq            41
	//*   4    8:aload_0         
	//*   5    9:aload           4
	//*   6   11:invokespecial   #59  <Method boolean isRequestingDefaultFrame(Options)>
	//*   7   14:ifeq            41
			return new com.bumptech.glide.load.model.ModelLoader.LoadData(((com.bumptech.glide.load.Key) (new ObjectKey(((Object) (uri))))), ((com.bumptech.glide.load.data.DataFetcher) (ThumbFetcher.buildVideoFetcher(context, uri))));
	//    8   17:new             #61  <Class com.bumptech.glide.load.model.ModelLoader$LoadData>
	//    9   20:dup             
	//   10   21:new             #63  <Class ObjectKey>
	//   11   24:dup             
	//   12   25:aload_1         
	//   13   26:invokespecial   #66  <Method void ObjectKey(Object)>
	//   14   29:aload_0         
	//   15   30:getfield        #25  <Field Context context>
	//   16   33:aload_1         
	//   17   34:invokestatic    #72  <Method ThumbFetcher ThumbFetcher.buildVideoFetcher(Context, Uri)>
	//   18   37:invokespecial   #75  <Method void com.bumptech.glide.load.model.ModelLoader$LoadData(com.bumptech.glide.load.Key, com.bumptech.glide.load.data.DataFetcher)>
	//   19   40:areturn         
		else
			return null;
	//   20   41:aconst_null     
	//   21   42:areturn         
	}

	public volatile com.bumptech.glide.load.model.ModelLoader.LoadData buildLoadData(Object obj, int i, int j, Options options)
	{
		return buildLoadData((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #81  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #83  <Method com.bumptech.glide.load.model.ModelLoader$LoadData buildLoadData(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri)
	{
		return MediaStoreUtil.isMediaStoreVideoUri(uri);
	//    0    0:aload_1         
	//    1    1:invokestatic    #88  <Method boolean MediaStoreUtil.isMediaStoreVideoUri(Uri)>
	//    2    4:ireturn         
	}

	public volatile boolean handles(Object obj)
	{
		return handles((Uri)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #81  <Class Uri>
	//    3    5:invokevirtual   #91  <Method boolean handles(Uri)>
	//    4    8:ireturn         
	}

	private final Context context;
}
