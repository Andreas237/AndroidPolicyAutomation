// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import java.io.IOException;

// Referenced classes of package com.bumptech.glide.load.resource.bitmap:
//			DrawableToBitmapConverter

public class ResourceBitmapDecoder
	implements ResourceDecoder
{

	public ResourceBitmapDecoder(ResourceDrawableDecoder resourcedrawabledecoder, BitmapPool bitmappool)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		drawableDecoder = resourcedrawabledecoder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field ResourceDrawableDecoder drawableDecoder>
		bitmapPool = bitmappool;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field BitmapPool bitmapPool>
	//    8   14:return          
	}

	public Resource decode(Uri uri, int i, int j, Options options)
	{
		uri = ((Uri) (drawableDecoder.decode(uri, i, j, options)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ResourceDrawableDecoder drawableDecoder>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #29  <Method Resource ResourceDrawableDecoder.decode(Uri, int, int, Options)>
	//    7   12:astore_1        
		if(uri == null)
	//*   8   13:aload_1         
	//*   9   14:ifnonnull       19
		{
			return null;
	//   10   17:aconst_null     
	//   11   18:areturn         
		} else
		{
			uri = ((Uri) ((Drawable)((Resource) (uri)).get()));
	//   12   19:aload_1         
	//   13   20:invokeinterface #35  <Method Object Resource.get()>
	//   14   25:checkcast       #37  <Class Drawable>
	//   15   28:astore_1        
			return DrawableToBitmapConverter.convert(bitmapPool, ((Drawable) (uri)), i, j);
	//   16   29:aload_0         
	//   17   30:getfield        #20  <Field BitmapPool bitmapPool>
	//   18   33:aload_1         
	//   19   34:iload_2         
	//   20   35:iload_3         
	//   21   36:invokestatic    #43  <Method Resource DrawableToBitmapConverter.convert(BitmapPool, Drawable, int, int)>
	//   22   39:areturn         
		}
	}

	public volatile Resource decode(Object obj, int i, int j, Options options)
		throws IOException
	{
		return decode((Uri)obj, i, j, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #52  <Class Uri>
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #53  <Method Resource decode(Uri, int, int, Options)>
	//    7   12:areturn         
	}

	public boolean handles(Uri uri, Options options)
	{
		return "android.resource".equals(((Object) (uri.getScheme())));
	//    0    0:ldc1            #58  <String "android.resource">
	//    1    2:aload_1         
	//    2    3:invokevirtual   #62  <Method String Uri.getScheme()>
	//    3    6:invokevirtual   #68  <Method boolean String.equals(Object)>
	//    4    9:ireturn         
	}

	public volatile boolean handles(Object obj, Options options)
		throws IOException
	{
		return handles((Uri)obj, options);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #52  <Class Uri>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #71  <Method boolean handles(Uri, Options)>
	//    5    9:ireturn         
	}

	private final BitmapPool bitmapPool;
	private final ResourceDrawableDecoder drawableDecoder;
}
