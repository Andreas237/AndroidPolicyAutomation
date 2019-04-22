// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import com.bumptech.glide.gifdecoder.*;
import java.nio.ByteBuffer;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			ByteBufferGifDecoder

static class ByteBufferGifDecoder$GifDecoderFactory
{

	GifDecoder build(com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider bitmapprovider, GifHeader gifheader, ByteBuffer bytebuffer, int i)
	{
		return ((GifDecoder) (new StandardGifDecoder(bitmapprovider, gifheader, bytebuffer, i)));
	//    0    0:new             #17  <Class StandardGifDecoder>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:iload           4
	//    6    9:invokespecial   #20  <Method void StandardGifDecoder(com.bumptech.glide.gifdecoder.GifDecoder$BitmapProvider, GifHeader, ByteBuffer, int)>
	//    7   12:areturn         
	}

	ByteBufferGifDecoder$GifDecoderFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
