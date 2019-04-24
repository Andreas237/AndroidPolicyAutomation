// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapTransformation, TransformationUtils

public final class RoundedCorners extends BitmapTransformation
{

	public RoundedCorners(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void BitmapTransformation()>
		boolean flag;
		if(i > 0)
	//*   2    4:iload_1         
	//*   3    5:ifle            13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		Preconditions.checkArgument(flag, "roundingRadius must be greater than 0.");
	//    9   15:iload_2         
	//   10   16:ldc1            #33  <String "roundingRadius must be greater than 0.">
	//   11   18:invokestatic    #39  <Method void Preconditions.checkArgument(boolean, String)>
		roundingRadius = i;
	//   12   21:aload_0         
	//   13   22:iload_1         
	//   14   23:putfield        #41  <Field int roundingRadius>
	//   15   26:return          
	}

	public RoundedCorners(Context context, int i)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #45  <Method void RoundedCorners(int)>
	//    3    5:return          
	}

	public RoundedCorners(BitmapPool bitmappool, int i)
	{
		this(i);
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:invokespecial   #45  <Method void RoundedCorners(int)>
	//    3    5:return          
	}

	public boolean equals(Object obj)
	{
		return (obj instanceof RoundedCorners) && ((RoundedCorners)obj).roundingRadius == roundingRadius;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class RoundedCorners>
	//    2    4:ifeq            23
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class RoundedCorners>
	//    5   11:getfield        #41  <Field int roundingRadius>
	//    6   14:aload_0         
	//    7   15:getfield        #41  <Field int roundingRadius>
	//    8   18:icmpne          23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public int hashCode()
	{
		return "com.bumptech.glide.load.resource.bitmap.RoundedCorners".hashCode() + roundingRadius;
	//    0    0:ldc1            #8   <String "com.bumptech.glide.load.resource.bitmap.RoundedCorners">
	//    1    2:invokevirtual   #53  <Method int String.hashCode()>
	//    2    5:aload_0         
	//    3    6:getfield        #41  <Field int roundingRadius>
	//    4    9:iadd            
	//    5   10:ireturn         
	}

	protected Bitmap transform(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		return TransformationUtils.roundedCorners(bitmappool, bitmap, i, j, roundingRadius);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:aload_0         
	//    5    6:getfield        #41  <Field int roundingRadius>
	//    6    9:invokestatic    #62  <Method Bitmap TransformationUtils.roundedCorners(BitmapPool, Bitmap, int, int, int)>
	//    7   12:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		messagedigest.update(ID_BYTES);
	//    0    0:aload_1         
	//    1    1:getstatic       #26  <Field byte[] ID_BYTES>
	//    2    4:invokevirtual   #71  <Method void MessageDigest.update(byte[])>
		messagedigest.update(ByteBuffer.allocate(4).putInt(roundingRadius).array());
	//    3    7:aload_1         
	//    4    8:iconst_4        
	//    5    9:invokestatic    #77  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field int roundingRadius>
	//    8   16:invokevirtual   #80  <Method ByteBuffer ByteBuffer.putInt(int)>
	//    9   19:invokevirtual   #84  <Method byte[] ByteBuffer.array()>
	//   10   22:invokevirtual   #71  <Method void MessageDigest.update(byte[])>
	//   11   25:return          
	}

	private static final String ID = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";
	private static final byte ID_BYTES[];
	private final int roundingRadius;

	static 
	{
		ID_BYTES = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(CHARSET);
	//    0    0:ldc1            #8   <String "com.bumptech.glide.load.resource.bitmap.RoundedCorners">
	//    1    2:getstatic       #18  <Field java.nio.charset.Charset CHARSET>
	//    2    5:invokevirtual   #24  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//    3    8:putstatic       #26  <Field byte[] ID_BYTES>
	//*   4   11:return          
	}
}
