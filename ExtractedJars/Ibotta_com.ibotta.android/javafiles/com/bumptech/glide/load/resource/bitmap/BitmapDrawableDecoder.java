// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.content.res.Resources;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			LazyBitmapDrawableResource

public class BitmapDrawableDecoder
	implements ResourceDecoder
{

	public BitmapDrawableDecoder(Resources resources1, ResourceDecoder resourcedecoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		resources = (Resources)Preconditions.checkNotNull(((Object) (resources1)));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object)>
	//    5    9:checkcast       #26  <Class Resources>
	//    6   12:putfield        #28  <Field Resources resources>
		decoder = (ResourceDecoder)Preconditions.checkNotNull(((Object) (resourcedecoder)));
	//    7   15:aload_0         
	//    8   16:aload_2         
	//    9   17:invokestatic    #24  <Method Object Preconditions.checkNotNull(Object)>
	//   10   20:checkcast       #7   <Class ResourceDecoder>
	//   11   23:putfield        #30  <Field ResourceDecoder decoder>
	//   12   26:return          
	}

	public Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		obj = ((Object) (decoder.decode(obj, i, j, options)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ResourceDecoder decoder>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokeinterface #40  <Method Resource ResourceDecoder.decode(Object, int, int, Options)>
	//    7   14:astore_1        
		return LazyBitmapDrawableResource.obtain(resources, ((Resource) (obj)));
	//    8   15:aload_0         
	//    9   16:getfield        #28  <Field Resources resources>
	//   10   19:aload_1         
	//   11   20:invokestatic    #46  <Method Resource LazyBitmapDrawableResource.obtain(Resources, Resource)>
	//   12   23:areturn         
	}

	public boolean handles(Object obj, Options options)
		throws IOException
	{
		return decoder.handles(obj, options);
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field ResourceDecoder decoder>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #52  <Method boolean ResourceDecoder.handles(Object, Options)>
	//    5   11:ireturn         
	}

	private final ResourceDecoder decoder;
	private final Resources resources;
}
