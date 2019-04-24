// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bytes.BytesResource;
import java.io.ByteArrayOutputStream;

// Referenced classes of package com.bumptech.glide.load.resource.transcode:
//			ResourceTranscoder

public class BitmapBytesTranscoder
	implements ResourceTranscoder
{

	public BitmapBytesTranscoder()
	{
		this(android.graphics.Bitmap.CompressFormat.JPEG, 100);
	//    0    0:aload_0         
	//    1    1:getstatic       #18  <Field android.graphics.Bitmap$CompressFormat android.graphics.Bitmap$CompressFormat.JPEG>
	//    2    4:bipush          100
	//    3    6:invokespecial   #21  <Method void BitmapBytesTranscoder(android.graphics.Bitmap$CompressFormat, int)>
	//    4    9:return          
	}

	public BitmapBytesTranscoder(android.graphics.Bitmap.CompressFormat compressformat, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
		compressFormat = compressformat;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #26  <Field android.graphics.Bitmap$CompressFormat compressFormat>
		quality = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #28  <Field int quality>
	//    8   14:return          
	}

	public Resource transcode(Resource resource)
	{
		ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
	//    0    0:new             #32  <Class ByteArrayOutputStream>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void ByteArrayOutputStream()>
	//    3    7:astore_2        
		((Bitmap)resource.get()).compress(compressFormat, quality, ((java.io.OutputStream) (bytearrayoutputstream)));
	//    4    8:aload_1         
	//    5    9:invokeinterface #39  <Method Object Resource.get()>
	//    6   14:checkcast       #41  <Class Bitmap>
	//    7   17:aload_0         
	//    8   18:getfield        #26  <Field android.graphics.Bitmap$CompressFormat compressFormat>
	//    9   21:aload_0         
	//   10   22:getfield        #28  <Field int quality>
	//   11   25:aload_2         
	//   12   26:invokevirtual   #45  <Method boolean Bitmap.compress(android.graphics.Bitmap$CompressFormat, int, java.io.OutputStream)>
	//   13   29:pop             
		resource.recycle();
	//   14   30:aload_1         
	//   15   31:invokeinterface #48  <Method void Resource.recycle()>
		return ((Resource) (new BytesResource(bytearrayoutputstream.toByteArray())));
	//   16   36:new             #50  <Class BytesResource>
	//   17   39:dup             
	//   18   40:aload_2         
	//   19   41:invokevirtual   #54  <Method byte[] ByteArrayOutputStream.toByteArray()>
	//   20   44:invokespecial   #57  <Method void BytesResource(byte[])>
	//   21   47:areturn         
	}

	private final android.graphics.Bitmap.CompressFormat compressFormat;
	private final int quality;
}
