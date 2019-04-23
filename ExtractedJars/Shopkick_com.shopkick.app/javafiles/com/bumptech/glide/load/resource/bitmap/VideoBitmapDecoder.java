// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			VideoDecoder

public class VideoBitmapDecoder extends VideoDecoder
{

	public VideoBitmapDecoder(Context context)
	{
		this(Glide.get(context).getBitmapPool());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #14  <Method Glide Glide.get(Context)>
	//    3    5:invokevirtual   #18  <Method BitmapPool Glide.getBitmapPool()>
	//    4    8:invokespecial   #21  <Method void VideoBitmapDecoder(BitmapPool)>
	//    5   11:return          
	}

	public VideoBitmapDecoder(BitmapPool bitmappool)
	{
		super(bitmappool, ((VideoDecoder.MediaMetadataRetrieverInitializer) (new VideoDecoder.ParcelFileDescriptorInitializer())));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:new             #24  <Class VideoDecoder$ParcelFileDescriptorInitializer>
	//    3    5:dup             
	//    4    6:invokespecial   #27  <Method void VideoDecoder$ParcelFileDescriptorInitializer()>
	//    5    9:invokespecial   #30  <Method void VideoDecoder(BitmapPool, VideoDecoder$MediaMetadataRetrieverInitializer)>
	//    6   12:return          
	}
}
