// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			LazyBitmapDrawableResource

public class BitmapDrawableDecoder
	implements ResourceDecoder
{

	public BitmapDrawableDecoder(Context context, ResourceDecoder resourcedecoder)
	{
		this(context.getResources(), Glide.get(context).getBitmapPool(), resourcedecoder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #22  <Method Resources Context.getResources()>
	//    3    5:aload_1         
	//    4    6:invokestatic    #28  <Method Glide Glide.get(Context)>
	//    5    9:invokevirtual   #32  <Method BitmapPool Glide.getBitmapPool()>
	//    6   12:aload_2         
	//    7   13:invokespecial   #35  <Method void BitmapDrawableDecoder(Resources, BitmapPool, ResourceDecoder)>
	//    8   16:return          
	}

	public BitmapDrawableDecoder(Resources resources1, BitmapPool bitmappool, ResourceDecoder resourcedecoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void Object()>
		resources = (Resources)Preconditions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #47  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #49  <Class Resources>
	//    6   12:putfield        #51  <Field Resources resources>
		bitmapPool = (BitmapPool)Preconditions.checkNotNull(((Object) (bitmappool)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #47  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #53  <Class BitmapPool>
	//   11   23:putfield        #55  <Field BitmapPool bitmapPool>
		decoder = (ResourceDecoder)Preconditions.checkNotNull(((Object) (resourcedecoder)));
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokestatic    #47  <Method Object Preconditions.checkNotNull(Object)>
	//   15   31:checkcast       #7   <Class ResourceDecoder>
	//   16   34:putfield        #57  <Field ResourceDecoder decoder>
	//   17   37:return          
	}

	public Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		obj = ((Object) (decoder.decode(obj, i, j, options)));
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ResourceDecoder decoder>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #64  <Method Resource ResourceDecoder.decode(Object, int, int, Options)>
	//    7   14:astore_1        
		if(obj == null)
	//*   8   15:aload_1         
	//*   9   16:ifnonnull       21
			return null;
	//   10   19:aconst_null     
	//   11   20:areturn         
		else
			return ((Resource) (LazyBitmapDrawableResource.obtain(resources, bitmapPool, (Bitmap)((Resource) (obj)).get())));
	//   12   21:aload_0         
	//   13   22:getfield        #51  <Field Resources resources>
	//   14   25:aload_0         
	//   15   26:getfield        #55  <Field BitmapPool bitmapPool>
	//   16   29:aload_1         
	//   17   30:invokeinterface #69  <Method Object Resource.get()>
	//   18   35:checkcast       #71  <Class Bitmap>
	//   19   38:invokestatic    #77  <Method LazyBitmapDrawableResource LazyBitmapDrawableResource.obtain(Resources, BitmapPool, Bitmap)>
	//   20   41:areturn         
	}

	public boolean handles(Object obj, Options options)
		throws IOException
	{
		return decoder.handles(obj, options);
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field ResourceDecoder decoder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #83  <Method boolean ResourceDecoder.handles(Object, Options)>
	//    5   11:ireturn         
	}

	private final BitmapPool bitmapPool;
	private final ResourceDecoder decoder;
	private final Resources resources;
}
