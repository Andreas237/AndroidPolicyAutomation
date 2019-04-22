// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifDrawable

public class GifDrawableTransformation
	implements Transformation
{

	public GifDrawableTransformation(Transformation transformation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		wrapped = (Transformation)Preconditions.checkNotNull(((Object) (transformation)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #21  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #7   <Class Transformation>
	//    6   12:putfield        #23  <Field Transformation wrapped>
	//    7   15:return          
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof GifDrawableTransformation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class GifDrawableTransformation>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((GifDrawableTransformation)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class GifDrawableTransformation>
	//    5   11:astore_1        
			return ((Object) (wrapped)).equals(((Object) (((GifDrawableTransformation) (obj)).wrapped)));
	//    6   12:aload_0         
	//    7   13:getfield        #23  <Field Transformation wrapped>
	//    8   16:aload_1         
	//    9   17:getfield        #23  <Field Transformation wrapped>
	//   10   20:invokevirtual   #30  <Method boolean Object.equals(Object)>
	//   11   23:ireturn         
		} else
		{
			return false;
	//   12   24:iconst_0        
	//   13   25:ireturn         
		}
	}

	public int hashCode()
	{
		return ((Object) (wrapped)).hashCode();
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Transformation wrapped>
	//    2    4:invokevirtual   #34  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public Resource transform(Context context, Resource resource, int i, int j)
	{
		GifDrawable gifdrawable = (GifDrawable)resource.get();
	//    0    0:aload_2         
	//    1    1:invokeinterface #43  <Method Object Resource.get()>
	//    2    6:checkcast       #45  <Class GifDrawable>
	//    3    9:astore          5
		Object obj = ((Object) (Glide.get(context).getBitmapPool()));
	//    4   11:aload_1         
	//    5   12:invokestatic    #50  <Method Glide Glide.get(Context)>
	//    6   15:invokevirtual   #54  <Method com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool Glide.getBitmapPool()>
	//    7   18:astore          6
		obj = ((Object) (new BitmapResource(gifdrawable.getFirstFrame(), ((com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool) (obj)))));
	//    8   20:new             #56  <Class BitmapResource>
	//    9   23:dup             
	//   10   24:aload           5
	//   11   26:invokevirtual   #60  <Method Bitmap GifDrawable.getFirstFrame()>
	//   12   29:aload           6
	//   13   31:invokespecial   #63  <Method void BitmapResource(Bitmap, com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool)>
	//   14   34:astore          6
		context = ((Context) (wrapped.transform(context, ((Resource) (obj)), i, j)));
	//   15   36:aload_0         
	//   16   37:getfield        #23  <Field Transformation wrapped>
	//   17   40:aload_1         
	//   18   41:aload           6
	//   19   43:iload_3         
	//   20   44:iload           4
	//   21   46:invokeinterface #65  <Method Resource Transformation.transform(Context, Resource, int, int)>
	//   22   51:astore_1        
		if(!obj.equals(((Object) (context))))
	//*  23   52:aload           6
	//*  24   54:aload_1         
	//*  25   55:invokevirtual   #30  <Method boolean Object.equals(Object)>
	//*  26   58:ifne            68
			((Resource) (obj)).recycle();
	//   27   61:aload           6
	//   28   63:invokeinterface #68  <Method void Resource.recycle()>
		context = ((Context) ((Bitmap)((Resource) (context)).get()));
	//   29   68:aload_1         
	//   30   69:invokeinterface #43  <Method Object Resource.get()>
	//   31   74:checkcast       #70  <Class Bitmap>
	//   32   77:astore_1        
		gifdrawable.setFrameTransformation(wrapped, ((Bitmap) (context)));
	//   33   78:aload           5
	//   34   80:aload_0         
	//   35   81:getfield        #23  <Field Transformation wrapped>
	//   36   84:aload_1         
	//   37   85:invokevirtual   #74  <Method void GifDrawable.setFrameTransformation(Transformation, Bitmap)>
		return resource;
	//   38   88:aload_2         
	//   39   89:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		wrapped.updateDiskCacheKey(messagedigest);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field Transformation wrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #81  <Method void Transformation.updateDiskCacheKey(MessageDigest)>
	//    4   10:return          
	}

	private final Transformation wrapped;
}
