// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapTransformation, TransformationUtils

public class FitCenter extends BitmapTransformation
{

	public FitCenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void BitmapTransformation()>
	//    2    4:return          
	}

	public boolean equals(Object obj)
	{
		return obj instanceof FitCenter;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class FitCenter>
	//    2    4:ireturn         
	}

	public int hashCode()
	{
		return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
	//    0    0:ldc1            #8   <String "com.bumptech.glide.load.resource.bitmap.FitCenter">
	//    1    2:invokevirtual   #34  <Method int String.hashCode()>
	//    2    5:ireturn         
	}

	protected Bitmap transform(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		return TransformationUtils.fitCenter(bitmappool, bitmap, i, j);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:invokestatic    #42  <Method Bitmap TransformationUtils.fitCenter(BitmapPool, Bitmap, int, int)>
	//    5    8:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		messagedigest.update(ID_BYTES);
	//    0    0:aload_1         
	//    1    1:getstatic       #24  <Field byte[] ID_BYTES>
	//    2    4:invokevirtual   #51  <Method void MessageDigest.update(byte[])>
	//    3    7:return          
	}

	private static final String ID = "com.bumptech.glide.load.resource.bitmap.FitCenter";
	private static final byte ID_BYTES[];

	static 
	{
		ID_BYTES = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(CHARSET);
	//    0    0:ldc1            #8   <String "com.bumptech.glide.load.resource.bitmap.FitCenter">
	//    1    2:getstatic       #16  <Field java.nio.charset.Charset CHARSET>
	//    2    5:invokevirtual   #22  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    3    8:putstatic       #24  <Field byte[] ID_BYTES>
	//*   4   11:return          
	}
}
