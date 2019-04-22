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

	protected abstract Bitmap transform(BitmapPool bitmappool, Bitmap bitmap, int i, int j);

	public final Resource transform(Context context, Resource resource, int i, int j)
	{
		if(Util.isValidDimensions(i, j))
	//*   0    0:iload_3         
	//*   1    1:iload           4
	//*   2    3:invokestatic    #22  <Method boolean Util.isValidDimensions(int, int)>
	//*   3    6:ifeq            91
		{
			context = ((Context) (Glide.get(context).getBitmapPool()));
	//    4    9:aload_1         
	//    5   10:invokestatic    #28  <Method Glide Glide.get(Context)>
	//    6   13:invokevirtual   #32  <Method BitmapPool Glide.getBitmapPool()>
	//    7   16:astore_1        
			Bitmap bitmap = (Bitmap)resource.get();
	//    8   17:aload_2         
	//    9   18:invokeinterface #37  <Method Object Resource.get()>
	//   10   23:checkcast       #39  <Class Bitmap>
	//   11   26:astore          6
			int k = i;
	//   12   28:iload_3         
	//   13   29:istore          5
			if(i == 0x80000000)
	//*  14   31:iload_3         
	//*  15   32:ldc1            #40  <Int 0x80000000>
	//*  16   34:icmpne          44
				k = bitmap.getWidth();
	//   17   37:aload           6
	//   18   39:invokevirtual   #44  <Method int Bitmap.getWidth()>
	//   19   42:istore          5
			i = j;
	//   20   44:iload           4
	//   21   46:istore_3        
			if(j == 0x80000000)
	//*  22   47:iload           4
	//*  23   49:ldc1            #40  <Int 0x80000000>
	//*  24   51:icmpne          60
				i = bitmap.getHeight();
	//   25   54:aload           6
	//   26   56:invokevirtual   #47  <Method int Bitmap.getHeight()>
	//   27   59:istore_3        
			Bitmap bitmap1 = transform(((BitmapPool) (context)), bitmap, k, i);
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:aload           6
	//   31   64:iload           5
	//   32   66:iload_3         
	//   33   67:invokevirtual   #49  <Method Bitmap transform(BitmapPool, Bitmap, int, int)>
	//   34   70:astore          7
			if(((Object) (bitmap)).equals(((Object) (bitmap1))))
	//*  35   72:aload           6
	//*  36   74:aload           7
	//*  37   76:invokevirtual   #53  <Method boolean Object.equals(Object)>
	//*  38   79:ifeq            84
				return resource;
	//   39   82:aload_2         
	//   40   83:areturn         
			else
				return ((Resource) (BitmapResource.obtain(bitmap1, ((BitmapPool) (context)))));
	//   41   84:aload           7
	//   42   86:aload_1         
	//   43   87:invokestatic    #59  <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//   44   90:areturn         
		} else
		{
			context = ((Context) (new StringBuilder()));
	//   45   91:new             #61  <Class StringBuilder>
	//   46   94:dup             
	//   47   95:invokespecial   #62  <Method void StringBuilder()>
	//   48   98:astore_1        
			((StringBuilder) (context)).append("Cannot apply transformation on width: ");
	//   49   99:aload_1         
	//   50  100:ldc1            #64  <String "Cannot apply transformation on width: ">
	//   51  102:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   52  105:pop             
			((StringBuilder) (context)).append(i);
	//   53  106:aload_1         
	//   54  107:iload_3         
	//   55  108:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   56  111:pop             
			((StringBuilder) (context)).append(" or height: ");
	//   57  112:aload_1         
	//   58  113:ldc1            #73  <String " or height: ">
	//   59  115:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   60  118:pop             
			((StringBuilder) (context)).append(j);
	//   61  119:aload_1         
	//   62  120:iload           4
	//   63  122:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   64  125:pop             
			((StringBuilder) (context)).append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
	//   65  126:aload_1         
	//   66  127:ldc1            #75  <String " less than or equal to zero and not Target.SIZE_ORIGINAL">
	//   67  129:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//   68  132:pop             
			throw new IllegalArgumentException(((StringBuilder) (context)).toString());
	//   69  133:new             #77  <Class IllegalArgumentException>
	//   70  136:dup             
	//   71  137:aload_1         
	//   72  138:invokevirtual   #81  <Method String StringBuilder.toString()>
	//   73  141:invokespecial   #84  <Method void IllegalArgumentException(String)>
	//   74  144:athrow          
		}
	}
}
