// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
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

	public boolean equals(Object obj)
	{
		boolean flag1 = obj instanceof RoundedCorners;
	//    0    0:aload_1         
	//    1    1:instanceof      #2   <Class RoundedCorners>
	//    2    4:istore_3        
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		if(flag1)
	//*   5    7:iload_3         
	//*   6    8:ifeq            31
		{
			obj = ((Object) ((RoundedCorners)obj));
	//    7   11:aload_1         
	//    8   12:checkcast       #2   <Class RoundedCorners>
	//    9   15:astore_1        
			if(roundingRadius == ((RoundedCorners) (obj)).roundingRadius)
	//*  10   16:aload_0         
	//*  11   17:getfield        #41  <Field int roundingRadius>
	//*  12   20:aload_1         
	//*  13   21:getfield        #41  <Field int roundingRadius>
	//*  14   24:icmpne          29
				flag = true;
	//   15   27:iconst_1        
	//   16   28:istore_2        
			return flag;
	//   17   29:iload_2         
	//   18   30:ireturn         
		} else
		{
			return false;
	//   19   31:iconst_0        
	//   20   32:ireturn         
		}
	}

	public int hashCode()
	{
		return Util.hashCode("com.bumptech.glide.load.resource.bitmap.RoundedCorners".hashCode(), Util.hashCode(roundingRadius));
	//    0    0:ldc1            #8   <String "com.bumptech.glide.load.resource.bitmap.RoundedCorners">
	//    1    2:invokevirtual   #47  <Method int String.hashCode()>
	//    2    5:aload_0         
	//    3    6:getfield        #41  <Field int roundingRadius>
	//    4    9:invokestatic    #52  <Method int Util.hashCode(int)>
	//    5   12:invokestatic    #55  <Method int Util.hashCode(int, int)>
	//    6   15:ireturn         
	}

	protected Bitmap transform(BitmapPool bitmappool, Bitmap bitmap, int i, int j)
	{
		return TransformationUtils.roundedCorners(bitmappool, bitmap, roundingRadius);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_0         
	//    3    3:getfield        #41  <Field int roundingRadius>
	//    4    6:invokestatic    #64  <Method Bitmap TransformationUtils.roundedCorners(BitmapPool, Bitmap, int)>
	//    5    9:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		messagedigest.update(ID_BYTES);
	//    0    0:aload_1         
	//    1    1:getstatic       #26  <Field byte[] ID_BYTES>
	//    2    4:invokevirtual   #73  <Method void MessageDigest.update(byte[])>
		messagedigest.update(ByteBuffer.allocate(4).putInt(roundingRadius).array());
	//    3    7:aload_1         
	//    4    8:iconst_4        
	//    5    9:invokestatic    #79  <Method ByteBuffer ByteBuffer.allocate(int)>
	//    6   12:aload_0         
	//    7   13:getfield        #41  <Field int roundingRadius>
	//    8   16:invokevirtual   #82  <Method ByteBuffer ByteBuffer.putInt(int)>
	//    9   19:invokevirtual   #86  <Method byte[] ByteBuffer.array()>
	//   10   22:invokevirtual   #73  <Method void MessageDigest.update(byte[])>
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
