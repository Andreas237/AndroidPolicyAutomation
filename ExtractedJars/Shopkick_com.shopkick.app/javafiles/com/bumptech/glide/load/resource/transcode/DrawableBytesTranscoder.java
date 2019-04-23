// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.load.resource.gif.GifDrawable;

// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			ResourceTranscoder

public final class DrawableBytesTranscoder
	implements ResourceTranscoder
{

	public DrawableBytesTranscoder(BitmapPool bitmappool, ResourceTranscoder resourcetranscoder, ResourceTranscoder resourcetranscoder1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		bitmapPool = bitmappool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field BitmapPool bitmapPool>
		bitmapBytesTranscoder = resourcetranscoder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ResourceTranscoder bitmapBytesTranscoder>
		gifDrawableBytesTranscoder = resourcetranscoder1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field ResourceTranscoder gifDrawableBytesTranscoder>
	//   11   19:return          
	}

	private static Resource toGifDrawableResource(Resource resource)
	{
		return resource;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public Resource transcode(Resource resource, Options options)
	{
		Drawable drawable = (Drawable)resource.get();
	//    0    0:aload_1         
	//    1    1:invokeinterface #43  <Method Object Resource.get()>
	//    2    6:checkcast       #45  <Class Drawable>
	//    3    9:astore_3        
		if(drawable instanceof BitmapDrawable)
	//*   4   10:aload_3         
	//*   5   11:instanceof      #47  <Class BitmapDrawable>
	//*   6   14:ifeq            42
			return bitmapBytesTranscoder.transcode(((Resource) (BitmapResource.obtain(((BitmapDrawable)drawable).getBitmap(), bitmapPool))), options);
	//    7   17:aload_0         
	//    8   18:getfield        #24  <Field ResourceTranscoder bitmapBytesTranscoder>
	//    9   21:aload_3         
	//   10   22:checkcast       #47  <Class BitmapDrawable>
	//   11   25:invokevirtual   #51  <Method android.graphics.Bitmap BitmapDrawable.getBitmap()>
	//   12   28:aload_0         
	//   13   29:getfield        #22  <Field BitmapPool bitmapPool>
	//   14   32:invokestatic    #57  <Method BitmapResource BitmapResource.obtain(android.graphics.Bitmap, BitmapPool)>
	//   15   35:aload_2         
	//   16   36:invokeinterface #59  <Method Resource ResourceTranscoder.transcode(Resource, Options)>
	//   17   41:areturn         
		if(drawable instanceof GifDrawable)
	//*  18   42:aload_3         
	//*  19   43:instanceof      #61  <Class GifDrawable>
	//*  20   46:ifeq            64
			return gifDrawableBytesTranscoder.transcode(toGifDrawableResource(resource), options);
	//   21   49:aload_0         
	//   22   50:getfield        #26  <Field ResourceTranscoder gifDrawableBytesTranscoder>
	//   23   53:aload_1         
	//   24   54:invokestatic    #63  <Method Resource toGifDrawableResource(Resource)>
	//   25   57:aload_2         
	//   26   58:invokeinterface #59  <Method Resource ResourceTranscoder.transcode(Resource, Options)>
	//   27   63:areturn         
		else
			return null;
	//   28   64:aconst_null     
	//   29   65:areturn         
	}

	private final ResourceTranscoder bitmapBytesTranscoder;
	private final BitmapPool bitmapPool;
	private final ResourceTranscoder gifDrawableBytesTranscoder;
}
