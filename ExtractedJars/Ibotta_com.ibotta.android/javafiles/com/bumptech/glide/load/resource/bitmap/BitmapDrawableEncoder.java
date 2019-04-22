// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.*;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			BitmapResource

public class BitmapDrawableEncoder
	implements ResourceEncoder
{

	public BitmapDrawableEncoder(BitmapPool bitmappool, ResourceEncoder resourceencoder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		bitmapPool = bitmappool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field BitmapPool bitmapPool>
		encoder = resourceencoder;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field ResourceEncoder encoder>
	//    8   14:return          
	}

	public boolean encode(Resource resource, File file, Options options)
	{
		return encoder.encode(((Object) (new BitmapResource(((BitmapDrawable)resource.get()).getBitmap(), bitmapPool))), file, options);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ResourceEncoder encoder>
	//    2    4:new             #29  <Class BitmapResource>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokeinterface #35  <Method Object Resource.get()>
	//    6   14:checkcast       #37  <Class BitmapDrawable>
	//    7   17:invokevirtual   #41  <Method android.graphics.Bitmap BitmapDrawable.getBitmap()>
	//    8   20:aload_0         
	//    9   21:getfield        #19  <Field BitmapPool bitmapPool>
	//   10   24:invokespecial   #44  <Method void BitmapResource(android.graphics.Bitmap, BitmapPool)>
	//   11   27:aload_2         
	//   12   28:aload_3         
	//   13   29:invokeinterface #47  <Method boolean ResourceEncoder.encode(Object, File, Options)>
	//   14   34:ireturn         
	}

	public volatile boolean encode(Object obj, File file, Options options)
	{
		return encode((Resource)obj, file, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #31  <Class Resource>
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokevirtual   #51  <Method boolean encode(Resource, File, Options)>
	//    6   10:ireturn         
	}

	public EncodeStrategy getEncodeStrategy(Options options)
	{
		return encoder.getEncodeStrategy(options);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ResourceEncoder encoder>
	//    2    4:aload_1         
	//    3    5:invokeinterface #55  <Method EncodeStrategy ResourceEncoder.getEncodeStrategy(Options)>
	//    4   10:areturn         
	}

	private final BitmapPool bitmapPool;
	private final ResourceEncoder encoder;
}
