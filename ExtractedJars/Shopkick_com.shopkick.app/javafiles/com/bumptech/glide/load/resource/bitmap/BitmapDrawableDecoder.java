// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
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
		this(context.getResources(), resourcedecoder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #20  <Method Resources Context.getResources()>
	//    3    5:aload_2         
	//    4    6:invokespecial   #23  <Method void BitmapDrawableDecoder(Resources, ResourceDecoder)>
	//    5    9:return          
	}

	public BitmapDrawableDecoder(Resources resources1, ResourceDecoder resourcedecoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void Object()>
		resources = (Resources)Preconditions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #36  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #38  <Class Resources>
	//    6   12:putfield        #40  <Field Resources resources>
		decoder = (ResourceDecoder)Preconditions.checkNotNull(((Object) (resourcedecoder)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #36  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #7   <Class ResourceDecoder>
	//   11   23:putfield        #42  <Field ResourceDecoder decoder>
	//   12   26:return          
	}

	public BitmapDrawableDecoder(Resources resources1, BitmapPool bitmappool, ResourceDecoder resourcedecoder)
	{
		this(resources1, resourcedecoder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_3         
	//    3    3:invokespecial   #23  <Method void BitmapDrawableDecoder(Resources, ResourceDecoder)>
	//    4    6:return          
	}

	public Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		obj = ((Object) (decoder.decode(obj, i, j, options)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ResourceDecoder decoder>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #54  <Method Resource ResourceDecoder.decode(Object, int, int, Options)>
	//    7   14:astore_1        
		return LazyBitmapDrawableResource.obtain(resources, ((Resource) (obj)));
	//    8   15:aload_0         
	//    9   16:getfield        #40  <Field Resources resources>
	//   10   19:aload_1         
	//   11   20:invokestatic    #60  <Method Resource LazyBitmapDrawableResource.obtain(Resources, Resource)>
	//   12   23:areturn         
	}

	public boolean handles(Object obj, Options options)
		throws IOException
	{
		return decoder.handles(obj, options);
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field ResourceDecoder decoder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #66  <Method boolean ResourceDecoder.handles(Object, Options)>
	//    5   11:ireturn         
	}

	private final ResourceDecoder decoder;
	private final Resources resources;
}
