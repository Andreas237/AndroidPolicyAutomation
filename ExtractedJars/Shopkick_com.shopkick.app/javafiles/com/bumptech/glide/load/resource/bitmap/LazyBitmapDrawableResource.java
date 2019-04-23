// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapResource

public final class LazyBitmapDrawableResource
	implements Resource, Initializable
{

	private LazyBitmapDrawableResource(Resources resources1, Resource resource)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		resources = (Resources)Preconditions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #28  <Class Resources>
	//    6   12:putfield        #30  <Field Resources resources>
		bitmapResource = (Resource)Preconditions.checkNotNull(((Object) (resource)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #26  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #7   <Class Resource>
	//   11   23:putfield        #32  <Field Resource bitmapResource>
	//   12   26:return          
	}

	public static Resource obtain(Resources resources1, Resource resource)
	{
		if(resource == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((Resource) (new LazyBitmapDrawableResource(resources1, resource)));
	//    4    6:new             #2   <Class LazyBitmapDrawableResource>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #41  <Method void LazyBitmapDrawableResource(Resources, Resource)>
	//    9   15:areturn         
	}

	public static LazyBitmapDrawableResource obtain(Context context, Bitmap bitmap)
	{
		return (LazyBitmapDrawableResource)obtain(context.getResources(), ((Resource) (BitmapResource.obtain(bitmap, Glide.get(context).getBitmapPool()))));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method Resources Context.getResources()>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:invokestatic    #57  <Method Glide Glide.get(Context)>
	//    5    9:invokevirtual   #61  <Method BitmapPool Glide.getBitmapPool()>
	//    6   12:invokestatic    #66  <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//    7   15:invokestatic    #68  <Method Resource obtain(Resources, Resource)>
	//    8   18:checkcast       #2   <Class LazyBitmapDrawableResource>
	//    9   21:areturn         
	}

	public static LazyBitmapDrawableResource obtain(Resources resources1, BitmapPool bitmappool, Bitmap bitmap)
	{
		return (LazyBitmapDrawableResource)obtain(resources1, ((Resource) (BitmapResource.obtain(bitmap, bitmappool))));
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_1         
	//    3    3:invokestatic    #66  <Method BitmapResource BitmapResource.obtain(Bitmap, BitmapPool)>
	//    4    6:invokestatic    #68  <Method Resource obtain(Resources, Resource)>
	//    5    9:checkcast       #2   <Class LazyBitmapDrawableResource>
	//    6   12:areturn         
	}

	public BitmapDrawable get()
	{
		return new BitmapDrawable(resources, (Bitmap)bitmapResource.get());
	//    0    0:new             #73  <Class BitmapDrawable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Resources resources>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field Resource bitmapResource>
	//    6   12:invokeinterface #76  <Method Object Resource.get()>
	//    7   17:checkcast       #78  <Class Bitmap>
	//    8   20:invokespecial   #81  <Method void BitmapDrawable(Resources, Bitmap)>
	//    9   23:areturn         
	}

	public volatile Object get()
	{
		return ((Object) (get()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #83  <Method BitmapDrawable get()>
	//    2    4:areturn         
	}

	public Class getResourceClass()
	{
		return android/graphics/drawable/BitmapDrawable;
	//    0    0:ldc1            #73  <Class BitmapDrawable>
	//    1    2:areturn         
	}

	public int getSize()
	{
		return bitmapResource.getSize();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Resource bitmapResource>
	//    2    4:invokeinterface #90  <Method int Resource.getSize()>
	//    3    9:ireturn         
	}

	public void initialize()
	{
		Resource resource = bitmapResource;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Resource bitmapResource>
	//    2    4:astore_1        
		if(resource instanceof Initializable)
	//*   3    5:aload_1         
	//*   4    6:instanceof      #9   <Class Initializable>
	//*   5    9:ifeq            21
			((Initializable)resource).initialize();
	//    6   12:aload_1         
	//    7   13:checkcast       #9   <Class Initializable>
	//    8   16:invokeinterface #93  <Method void Initializable.initialize()>
	//    9   21:return          
	}

	public void recycle()
	{
		bitmapResource.recycle();
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field Resource bitmapResource>
	//    2    4:invokeinterface #96  <Method void Resource.recycle()>
	//    3    9:return          
	}

	private final Resource bitmapResource;
	private final Resources resources;
}
