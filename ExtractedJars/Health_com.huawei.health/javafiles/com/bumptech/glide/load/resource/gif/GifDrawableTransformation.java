// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifDrawable

public class GifDrawableTransformation
	implements Transformation
{

	public GifDrawableTransformation(Context context, Transformation transformation)
	{
		this(transformation);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:invokespecial   #16  <Method void GifDrawableTransformation(Transformation)>
	//    3    5:return          
	}

	public GifDrawableTransformation(Transformation transformation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		wrapped = (Transformation)Preconditions.checkNotNull(((Object) (transformation)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #29  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #7   <Class Transformation>
	//    6   12:putfield        #31  <Field Transformation wrapped>
	//    7   15:return          
	}

	public GifDrawableTransformation(Transformation transformation, BitmapPool bitmappool)
	{
		this(transformation);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #16  <Method void GifDrawableTransformation(Transformation)>
	//    3    5:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof GifDrawableTransformation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class GifDrawableTransformation>
	//*   2    4:ifeq            26
		{
			obj = ((Object) ((GifDrawableTransformation)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class GifDrawableTransformation>
	//    5   11:astore_1        
			return wrapped.equals(((Object) (((GifDrawableTransformation) (obj)).wrapped)));
	//    6   12:aload_0         
	//    7   13:getfield        #31  <Field Transformation wrapped>
	//    8   16:aload_1         
	//    9   17:getfield        #31  <Field Transformation wrapped>
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
	//    1    1:getfield        #31  <Field Transformation wrapped>
	//    2    4:invokeinterface #42  <Method int Transformation.hashCode()>
	//    3    9:ireturn         
	}

	public Resource transform(Context context, Resource resource, int i, int j)
	{
		GifDrawable gifdrawable = (GifDrawable)resource.get();
	//    0    0:aload_2         
	//    1    1:invokeinterface #50  <Method Object Resource.get()>
	//    2    6:checkcast       #52  <Class GifDrawable>
	//    3    9:astore          5
		Object obj = ((Object) (Glide.get(context).getBitmapPool()));
	//    4   11:aload_1         
	//    5   12:invokestatic    #57  <Method Glide Glide.get(Context)>
	//    6   15:invokevirtual   #61  <Method BitmapPool Glide.getBitmapPool()>
	//    7   18:astore          6
		obj = ((Object) (new BitmapResource(gifdrawable.getFirstFrame(), ((BitmapPool) (obj)))));
	//    8   20:new             #63  <Class BitmapResource>
	//    9   23:dup             
	//   10   24:aload           5
	//   11   26:invokevirtual   #67  <Method Bitmap GifDrawable.getFirstFrame()>
	//   12   29:aload           6
	//   13   31:invokespecial   #70  <Method void BitmapResource(Bitmap, BitmapPool)>
	//   14   34:astore          6
		context = ((Context) (wrapped.transform(context, ((Resource) (obj)), i, j)));
	//   15   36:aload_0         
	//   16   37:getfield        #31  <Field Transformation wrapped>
	//   17   40:aload_1         
	//   18   41:aload           6
	//   19   43:iload_3         
	//   20   44:iload           4
	//   21   46:invokeinterface #72  <Method Resource Transformation.transform(Context, Resource, int, int)>
	//   22   51:astore_1        
		if(!obj.equals(((Object) (context))))
	//*  23   52:aload           6
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #73  <Method boolean Object.equals(Object)>
	//*  26   58:ifne            68
			((Resource) (obj)).recycle();
	//   27   61:aload           6
	//   28   63:invokeinterface #76  <Method void Resource.recycle()>
		context = ((Context) ((Bitmap)((Resource) (context)).get()));
	//   29   68:aload_1         
	//   30   69:invokeinterface #50  <Method Object Resource.get()>
	//   31   74:checkcast       #78  <Class Bitmap>
	//   32   77:astore_1        
		gifdrawable.setFrameTransformation(wrapped, ((Bitmap) (context)));
	//   33   78:aload           5
	//   34   80:aload_0         
	//   35   81:getfield        #31  <Field Transformation wrapped>
	//   36   84:aload_1         
	//   37   85:invokevirtual   #82  <Method void GifDrawable.setFrameTransformation(Transformation, Bitmap)>
		return resource;
	//   38   88:aload_2         
	//   39   89:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		wrapped.updateDiskCacheKey(messagedigest);
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Transformation wrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #87  <Method void Transformation.updateDiskCacheKey(MessageDigest)>
	//    4   10:return          
	}

	private final Transformation wrapped;
}
