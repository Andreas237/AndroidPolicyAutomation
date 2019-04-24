// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapResource

public abstract class BitmapTransformation
	implements Transformation
{

	public BitmapTransformation()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public BitmapTransformation(Context context)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BitmapTransformation()>
	//    2    4:return          
	}

	public BitmapTransformation(BitmapPool bitmappool)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void BitmapTransformation()>
	//    2    4:return          
	}

	protected abstract Bitmap transform(BitmapPool bitmappool, Bitmap bitmap, int i, int j);

	public final Resource transform(Context context, Resource resource, int i, int j)
	{
		if(!Util.isValidDimensions(i, j))
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:invokestatic    #27  <Method boolean Util.isValidDimensions(int, int)>
	//*   3    6:ifne            51
			throw new IllegalArgumentException((new StringBuilder()).append("Cannot apply transformation on width: ").append(i).append(" or height: ").append(j).append(" less than or equal to zero and not Target.SIZE_ORIGINAL").toString());
	//    4    9:new             #29  <Class IllegalArgumentException>
	//    5   12:dup             
	//    6   13:new             #31  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #32  <Method void StringBuilder()>
	//    9   20:ldc1            #34  <String "Cannot apply transformation on width: ">
	//   10   22:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   11   25:iload_3         
	//   12   26:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   13   29:ldc1            #43  <String " or height: ">
	//   14   31:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   15   34:iload           4
	//   16   36:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
	//   17   39:ldc1            #45  <String " less than or equal to zero and not Target.SIZE_ORIGINAL">
	//   18   41:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
	//   19   44:invokevirtual   #49  <Method String StringBuilder.toString()>
	//   20   47:invokespecial   #52  <Method void IllegalArgumentException(String)>
	//   21   50:athrow          
		context = ((Context) (Glide.get(context).getBitmapPool()));
	//   22   51:aload_1         
	//   23   52:invokestatic    #58  <Method Glide Glide.get(Context)>
	//   24   55:invokevirtual   #62  <Method BitmapPool Glide.getBitmapPool()>
	//   25   58:astore_1        
		Bitmap bitmap = (Bitmap)resource.get();
	//   26   59:aload_2         
	//   27   60:invokeinterface #67  <Method Object Resource.get()>
	//   28   65:checkcast       #69  <Class Bitmap>
	//   29   68:astore          5
		if(i == 0x80000000)
	//*  30   70:iload_3         
	//*  31   71:ldc1            #70  <Int 0x80000000>
	//*  32   73:icmpne          85
			i = bitmap.getWidth();
	//   33   76:aload           5
	//   34   78:invokevirtual   #74  <Method int Bitmap.getWidth()>
	//   35   81:istore_3        
	//*  36   82:goto            85
		if(j == 0x80000000)
	//*  37   85:iload           4
	//*  38   87:ldc1            #70  <Int 0x80000000>
	//*  39   89:icmpne          102
			j = bitmap.getHeight();
	//   40   92:aload           5
	//   41   94:invokevirtual   #77  <Method int Bitmap.getHeight()>
	//   42   97:istore          4
	//*  43   99:goto            102
		Bitmap bitmap1 = transform(((BitmapPool) (context)), bitmap, i, j);
	//   44  102:aload_0         
	//   45  103:aload_1         
	//   46  104:aload           5
	//   47  106:iload_3         
	//   48  107:iload           4
	//   49  109:invokevirtual   #79  <Method Bitmap transform(BitmapPool, Bitmap, int, int)>
	//   50  112:astore          6
		if(((Object) (bitmap)).equals(((Object) (bitmap1))))
	//*  51  114:aload           5
	//*  52  116:aload           6
	//*  53  118:invokevirtual   #83  <Method boolean Object.equals(Object)>
	//*  54  121:ifeq            126
			return resource;
	//   55  124:aload_2         
	//   56  125:areturn         
		else
			return ((Resource) (BitmapResource.obtain(bitmap1, ((BitmapPool) (context)))));
	//   57  126:aload           6
	//   58  128:aload_1         
	//   59  129:invokestatic    #89  <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//   60  132:areturn         
	}
}
