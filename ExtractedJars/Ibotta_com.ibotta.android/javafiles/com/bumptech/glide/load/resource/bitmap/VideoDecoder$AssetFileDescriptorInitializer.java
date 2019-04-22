// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.res.AssetFileDescriptor;
import android.media.MediaMetadataRetriever;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			VideoDecoder

private static final class VideoDecoder$AssetFileDescriptorInitializer
	implements er
{

	public void initialize(MediaMetadataRetriever mediametadataretriever, AssetFileDescriptor assetfiledescriptor)
	{
		mediametadataretriever.setDataSource(assetfiledescriptor.getFileDescriptor(), assetfiledescriptor.getStartOffset(), assetfiledescriptor.getLength());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #25  <Method java.io.FileDescriptor AssetFileDescriptor.getFileDescriptor()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #29  <Method long AssetFileDescriptor.getStartOffset()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #32  <Method long AssetFileDescriptor.getLength()>
	//    7   13:invokevirtual   #38  <Method void MediaMetadataRetriever.setDataSource(java.io.FileDescriptor, long, long)>
	//    8   16:return          
	}

	public volatile void initialize(MediaMetadataRetriever mediametadataretriever, Object obj)
	{
		initialize(mediametadataretriever, (AssetFileDescriptor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #21  <Class AssetFileDescriptor>
	//    4    6:invokevirtual   #41  <Method void initialize(MediaMetadataRetriever, AssetFileDescriptor)>
	//    5    9:return          
	}

	private VideoDecoder$AssetFileDescriptorInitializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	VideoDecoder$AssetFileDescriptorInitializer(VideoDecoder._cls1 _pcls1)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void VideoDecoder$AssetFileDescriptorInitializer()>
	//    2    4:return          
	}
}
