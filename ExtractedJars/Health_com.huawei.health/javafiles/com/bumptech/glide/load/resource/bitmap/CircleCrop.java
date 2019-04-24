// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapTransformation, TransformationUtils

public class CircleCrop extends BitmapTransformation
{

	public CircleCrop()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void BitmapTransformation()>
	//    2    4:return          
	}

	public CircleCrop(Context context)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void CircleCrop()>
	//    2    4:return          
	}

	public CircleCrop(BitmapPool bitmappool)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void CircleCrop()>
	//    2    4:return          
	}

	public boolean equals(Object obj)
	{
		return obj instanceof CircleCrop;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class CircleCrop>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".hashCode();
	//    0    0:ldc1            #8   <String "com.bumptech.glide.load.resource.bitmap.CircleCrop.1">
	//    1    2:invokevirtual   #42  <Method int String.hashCode()>
	//    2    5:ireturn         
	}

	protected Bitmap transform(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		return TransformationUtils.circleCrop(bitmappool, bitmap, i, j);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #50  <Method Bitmap TransformationUtils.circleCrop(BitmapPool, Bitmap, int, int)>
	//    5    8:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		messagedigest.update(ID_BYTES);
	//    0    0:aload_1         
	//    1    1:getstatic       #27  <Field byte[] ID_BYTES>
	//    2    4:invokevirtual   #59  <Method void MessageDigest.update(byte[])>
	//    3    7:return          
	}

	private static final String ID = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
	private static final byte ID_BYTES[];
	private static final int VERSION = 1;

	static 
	{
		ID_BYTES = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(CHARSET);
	//    0    0:ldc1            #8   <String "com.bumptech.glide.load.resource.bitmap.CircleCrop.1">
	//    1    2:getstatic       #19  <Field java.nio.charset.Charset CHARSET>
	//    2    5:invokevirtual   #25  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    3    8:putstatic       #27  <Field byte[] ID_BYTES>
	//*   4   11:return          
	}
}
