// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ExifInterfaceImageHeaderParser
	implements ImageHeaderParser
{

	public ExifInterfaceImageHeaderParser()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public int getOrientation(InputStream inputstream, ArrayPool arraypool)
		throws IOException
	{
		int i = (new ExifInterface(inputstream)).getAttributeInt("Orientation", 1);
	//    0    0:new             #21  <Class ExifInterface>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #24  <Method void ExifInterface(InputStream)>
	//    4    8:ldc1            #26  <String "Orientation">
	//    5   10:iconst_1        
	//    6   11:invokevirtual   #30  <Method int ExifInterface.getAttributeInt(String, int)>
	//    7   14:istore_3        
		if(i == 0)
	//*   8   15:iload_3         
	//*   9   16:ifne            21
			return -1;
	//   10   19:iconst_m1       
	//   11   20:ireturn         
		else
			return i;
	//   12   21:iload_3         
	//   13   22:ireturn         
	}

	public int getOrientation(ByteBuffer bytebuffer, ArrayPool arraypool)
		throws IOException
	{
		return getOrientation(ByteBufferUtil.toStream(bytebuffer), arraypool);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #39  <Method InputStream ByteBufferUtil.toStream(ByteBuffer)>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #41  <Method int getOrientation(InputStream, ArrayPool)>
	//    5    9:ireturn         
	}

	public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(InputStream inputstream)
		throws IOException
	{
		return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
	//    0    0:getstatic       #49  <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN>
	//    1    3:areturn         
	}

	public com.bumptech.glide.load.ImageHeaderParser.ImageType getType(ByteBuffer bytebuffer)
		throws IOException
	{
		return com.bumptech.glide.load.ImageHeaderParser.ImageType.UNKNOWN;
	//    0    0:getstatic       #49  <Field com.bumptech.glide.load.ImageHeaderParser$ImageType com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN>
	//    1    3:areturn         
	}
}
