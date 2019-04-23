// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DrawableTransformation

public class BitmapDrawableTransformation
	implements Transformation
{

	public BitmapDrawableTransformation(Transformation transformation)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		wrapped = (Transformation)Preconditions.checkNotNull(((Object) (new DrawableTransformation(transformation, false))));
	//    2    4:aload_0         
	//    3    5:new             #18  <Class DrawableTransformation>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:iconst_0        
	//    7   11:invokespecial   #21  <Method void DrawableTransformation(Transformation, boolean)>
	//    8   14:invokestatic    #27  <Method Object Preconditions.checkNotNull(Object)>
	//    9   17:checkcast       #7   <Class Transformation>
	//   10   20:putfield        #29  <Field Transformation wrapped>
	//   11   23:return          
	}

	private static Resource convertToBitmapDrawableResource(Resource resource)
	{
		if(resource.get() instanceof BitmapDrawable)
	//*   0    0:aload_0         
	//*   1    1:invokeinterface #40  <Method Object Resource.get()>
	//*   2    6:instanceof      #42  <Class BitmapDrawable>
	//*   3    9:ifeq            14
		{
			return resource;
	//    4   12:aload_0         
	//    5   13:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   14:new             #44  <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #45  <Method void StringBuilder()>
	//    9   21:astore_1        
			stringbuilder.append("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: ");
	//   10   22:aload_1         
	//   11   23:ldc1            #47  <String "Wrapped transformation unexpectedly returned a non BitmapDrawable resource: ">
	//   12   25:invokevirtual   #51  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:pop             
			stringbuilder.append(resource.get());
	//   14   29:aload_1         
	//   15   30:aload_0         
	//   16   31:invokeinterface #40  <Method Object Resource.get()>
	//   17   36:invokevirtual   #54  <Method StringBuilder StringBuilder.append(Object)>
	//   18   39:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   19   40:new             #56  <Class IllegalArgumentException>
	//   20   43:dup             
	//   21   44:aload_1         
	//   22   45:invokevirtual   #60  <Method String StringBuilder.toString()>
	//   23   48:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   24   51:athrow          
		}
	}

	private static Resource convertToDrawableResource(Resource resource)
	{
		return resource;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof BitmapDrawableTransformation)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class BitmapDrawableTransformation>
	//*   2    4:ifeq            24
		{
			obj = ((Object) ((BitmapDrawableTransformation)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class BitmapDrawableTransformation>
	//    5   11:astore_1        
			return ((Object) (wrapped)).equals(((Object) (((BitmapDrawableTransformation) (obj)).wrapped)));
	//    6   12:aload_0         
	//    7   13:getfield        #29  <Field Transformation wrapped>
	//    8   16:aload_1         
	//    9   17:getfield        #29  <Field Transformation wrapped>
	//   10   20:invokevirtual   #70  <Method boolean Object.equals(Object)>
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
	//    1    1:getfield        #29  <Field Transformation wrapped>
	//    2    4:invokevirtual   #74  <Method int Object.hashCode()>
	//    3    7:ireturn         
	}

	public Resource transform(Context context, Resource resource, int i, int j)
	{
		resource = convertToDrawableResource(resource);
	//    0    0:aload_2         
	//    1    1:invokestatic    #79  <Method Resource convertToDrawableResource(Resource)>
	//    2    4:astore_2        
		return convertToBitmapDrawableResource(wrapped.transform(context, resource, i, j));
	//    3    5:aload_0         
	//    4    6:getfield        #29  <Field Transformation wrapped>
	//    5    9:aload_1         
	//    6   10:aload_2         
	//    7   11:iload_3         
	//    8   12:iload           4
	//    9   14:invokeinterface #81  <Method Resource Transformation.transform(Context, Resource, int, int)>
	//   10   19:invokestatic    #83  <Method Resource convertToBitmapDrawableResource(Resource)>
	//   11   22:areturn         
	}

	public void updateDiskCacheKey(MessageDigest messagedigest)
	{
		wrapped.updateDiskCacheKey(messagedigest);
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Transformation wrapped>
	//    2    4:aload_1         
	//    3    5:invokeinterface #90  <Method void Transformation.updateDiskCacheKey(MessageDigest)>
	//    4   10:return          
	}

	private final Transformation wrapped;
}
