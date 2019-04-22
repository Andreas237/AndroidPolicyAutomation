// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			LazyBitmapDrawableResource, DrawableToBitmapConverter

public class DrawableTransformation
	implements Transformation
{

	public DrawableTransformation(Transformation transformation, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		wrapped = transformation;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Transformation wrapped>
		isRequired = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field boolean isRequired>
	//    8   14:return          
	}

	private Resource newDrawableResource(Context context, Resource resource)
	{
		return LazyBitmapDrawableResource.obtain(context.getResources(), resource);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method android.content.res.Resources Context.getResources()>
	//    2    4:aload_2         
	//    3    5:invokestatic    #38  <Method Resource LazyBitmapDrawableResource.obtain(android.content.res.Resources, Resource)>
	//    4    8:areturn         
	}

	public Transformation asBitmapDrawable()
	{
		return ((Transformation) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof DrawableTransformation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class DrawableTransformation>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((DrawableTransformation)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class DrawableTransformation>
	//    5   11:astore_1        
			return ((Object) (wrapped)).equals(((Object) (((DrawableTransformation) (obj)).wrapped)));
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field Transformation wrapped>
	//    8   16:aload_1         
	//    9   17:getfield        #19  <Field Transformation wrapped>
	//   10   20:invokevirtual   #46  <Method boolean Object.equals(Object)>
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
	//    1    1:getfield        #19  <Field Transformation wrapped>
	//    2    4:invokevirtual   #50  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public Resource transform(Context context, Resource resource, int i, int j)
	{
		Object obj1 = ((Object) (Glide.get(context).getBitmapPool()));
	//    0    0:aload_1         
	//    1    1:invokestatic    #59  <Method Glide Glide.get(Context)>
	//    2    4:invokevirtual   #63  <Method com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool Glide.getBitmapPool()>
	//    3    7:astore          6
		Object obj = ((Object) ((Drawable)resource.get()));
	//    4    9:aload_2         
	//    5   10:invokeinterface #68  <Method Object Resource.get()>
	//    6   15:checkcast       #70  <Class Drawable>
	//    7   18:astore          5
		obj1 = ((Object) (DrawableToBitmapConverter.convert(((com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool) (obj1)), ((Drawable) (obj)), i, j)));
	//    8   20:aload           6
	//    9   22:aload           5
	//   10   24:iload_3         
	//   11   25:iload           4
	//   12   27:invokestatic    #76  <Method Resource DrawableToBitmapConverter.convert(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool, Drawable, int, int)>
	//   13   30:astore          6
		if(obj1 == null)
	//*  14   32:aload           6
	//*  15   34:ifnonnull       87
			if(!isRequired)
	//*  16   37:aload_0         
	//*  17   38:getfield        #21  <Field boolean isRequired>
	//*  18   41:ifne            46
			{
				return resource;
	//   19   44:aload_2         
	//   20   45:areturn         
			} else
			{
				context = ((Context) (new StringBuilder()));
	//   21   46:new             #78  <Class StringBuilder>
	//   22   49:dup             
	//   23   50:invokespecial   #79  <Method void StringBuilder()>
	//   24   53:astore_1        
				((StringBuilder) (context)).append("Unable to convert ");
	//   25   54:aload_1         
	//   26   55:ldc1            #81  <String "Unable to convert ">
	//   27   57:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   28   60:pop             
				((StringBuilder) (context)).append(obj);
	//   29   61:aload_1         
	//   30   62:aload           5
	//   31   64:invokevirtual   #88  <Method StringBuilder StringBuilder.append(Object)>
	//   32   67:pop             
				((StringBuilder) (context)).append(" to a Bitmap");
	//   33   68:aload_1         
	//   34   69:ldc1            #90  <String " to a Bitmap">
	//   35   71:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
				throw new IllegalArgumentException(((StringBuilder) (context)).toString());
	//   37   75:new             #92  <Class IllegalArgumentException>
	//   38   78:dup             
	//   39   79:aload_1         
	//   40   80:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   41   83:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   42   86:athrow          
			}
		obj = ((Object) (wrapped.transform(context, ((Resource) (obj1)), i, j)));
	//   43   87:aload_0         
	//   44   88:getfield        #19  <Field Transformation wrapped>
	//   45   91:aload_1         
	//   46   92:aload           6
	//   47   94:iload_3         
	//   48   95:iload           4
	//   49   97:invokeinterface #101 <Method Resource Transformation.transform(Context, Resource, int, int)>
	//   50  102:astore          5
		if(obj.equals(obj1))
	//*  51  104:aload           5
	//*  52  106:aload           6
	//*  53  108:invokevirtual   #46  <Method boolean Object.equals(Object)>
	//*  54  111:ifeq            123
		{
			((Resource) (obj)).recycle();
	//   55  114:aload           5
	//   56  116:invokeinterface #104 <Method void Resource.recycle()>
			return resource;
	//   57  121:aload_2         
	//   58  122:areturn         
		} else
		{
			return newDrawableResource(context, ((Resource) (obj)));
	//   59  123:aload_0         
	//   60  124:aload_1         
	//   61  125:aload           5
	//   62  127:invokespecial   #106 <Method Resource newDrawableResource(Context, Resource)>
	//   63  130:areturn         
		}
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		wrapped.updateDiskCacheKey(messagedigest);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Transformation wrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #113 <Method void Transformation.updateDiskCacheKey(MessageDigest)>
	//    4   10:return          
	}

	private final boolean isRequired;
	private final Transformation wrapped;
}
