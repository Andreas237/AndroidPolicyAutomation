// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.media.MediaMetadataRetriever;
import android.os.ParcelFileDescriptor;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			VideoDecoder

static final class VideoDecoder$ParcelFileDescriptorInitializer
	implements r
{

	public void initialize(MediaMetadataRetriever mediametadataretriever, ParcelFileDescriptor parcelfiledescriptor)
	{
		mediametadataretriever.setDataSource(parcelfiledescriptor.getFileDescriptor());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #23  <Method java.io.FileDescriptor ParcelFileDescriptor.getFileDescriptor()>
	//    3    5:invokevirtual   #29  <Method void MediaMetadataRetriever.setDataSource(java.io.FileDescriptor)>
	//    4    8:return          
	}

	public volatile void initialize(MediaMetadataRetriever mediametadataretriever, Object obj)
	{
		initialize(mediametadataretriever, (ParcelFileDescriptor)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:checkcast       #19  <Class ParcelFileDescriptor>
	//    4    6:invokevirtual   #32  <Method void initialize(MediaMetadataRetriever, ParcelFileDescriptor)>
	//    5    9:return          
	}

	VideoDecoder$ParcelFileDescriptorInitializer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}
}
