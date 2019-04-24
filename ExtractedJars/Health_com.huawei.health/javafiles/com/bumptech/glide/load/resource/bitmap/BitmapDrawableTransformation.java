// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapResource, LazyBitmapDrawableResource

public class BitmapDrawableTransformation
	implements Transformation
{

	public BitmapDrawableTransformation(Context context, Transformation transformation)
	{
		this(transformation);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #16  <Method void BitmapDrawableTransformation(Transformation)>
	//    3    5:return          
	}

	public BitmapDrawableTransformation(Context context, BitmapPool bitmappool, Transformation transformation)
	{
		this(transformation);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #16  <Method void BitmapDrawableTransformation(Transformation)>
	//    3    5:return          
	}

	public BitmapDrawableTransformation(Transformation transformation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		wrapped = (Transformation)Preconditions.checkNotNull(((Object) (transformation)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #31  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #7   <Class Transformation>
	//    6   12:putfield        #33  <Field Transformation wrapped>
	//    7   15:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof BitmapDrawableTransformation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class BitmapDrawableTransformation>
	//*   2    4:ifeq            26
		{
			obj = ((Object) ((BitmapDrawableTransformation)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class BitmapDrawableTransformation>
	//    5   11:astore_1        
			return wrapped.equals(((Object) (((BitmapDrawableTransformation) (obj)).wrapped)));
	//    6   12:aload_0         
	//    7   13:getfield        #33  <Field Transformation wrapped>
	//    8   16:aload_1         
	//    9   17:getfield        #33  <Field Transformation wrapped>
	//   10   20:invokeinterface #38  <Method boolean Transformation.equals(Object)>
	//   11   25:ireturn         
		} else
		{
			return false;
	//   12   26:iconst_0        
	//   13   27:ireturn         
		}
	}

	public int hashCode()
	{
		return wrapped.hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Transformation wrapped>
	//    2    4:invokeinterface #42  <Method int Transformation.hashCode()>
	//    3    9:ireturn         
	}

	public Resource transform(Context context, Resource resource, int i, int j)
	{
		BitmapResource bitmapresource = BitmapResource.obtain(((BitmapDrawable)resource.get()).getBitmap(), Glide.get(context).getBitmapPool());
	//    0    0:aload_2         
	//    1    1:invokeinterface #50  <Method Object Resource.get()>
	//    2    6:checkcast       #52  <Class BitmapDrawable>
	//    3    9:invokevirtual   #56  <Method Bitmap BitmapDrawable.getBitmap()>
	//    4   12:aload_1         
	//    5   13:invokestatic    #61  <Method Glide Glide.get(Context)>
	//    6   16:invokevirtual   #65  <Method BitmapPool Glide.getBitmapPool()>
	//    7   19:invokestatic    #71  <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//    8   22:astore          5
		Resource resource1 = wrapped.transform(context, ((Resource) (bitmapresource)), i, j);
	//    9   24:aload_0         
	//   10   25:getfield        #33  <Field Transformation wrapped>
	//   11   28:aload_1         
	//   12   29:aload           5
	//   13   31:iload_3         
	//   14   32:iload           4
	//   15   34:invokeinterface #73  <Method Resource Transformation.transform(Context, Resource, int, int)>
	//   16   39:astore          6
		if(((Object) (resource1)).equals(((Object) (bitmapresource))))
	//*  17   41:aload           6
	//*  18   43:aload           5
	//*  19   45:invokevirtual   #74  <Method boolean Object.equals(Object)>
	//*  20   48:ifeq            53
			return resource;
	//   21   51:aload_2         
	//   22   52:areturn         
		else
			return ((Resource) (LazyBitmapDrawableResource.obtain(context, (Bitmap)resource1.get())));
	//   23   53:aload_1         
	//   24   54:aload           6
	//   25   56:invokeinterface #50  <Method Object Resource.get()>
	//   26   61:checkcast       #76  <Class Bitmap>
	//   27   64:invokestatic    #81  <Method LazyBitmapDrawableResource LazyBitmapDrawableResource.obtain(Context, Bitmap)>
	//   28   67:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		wrapped.updateDiskCacheKey(messagedigest);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Transformation wrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #86  <Method void Transformation.updateDiskCacheKey(MessageDigest)>
	//    4   10:return          
	}

	private final Transformation wrapped;
}
