// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifDrawable, GifFrameLoader

static class GifDrawable$GifState extends android.graphics.drawable.e
{

	public int getChangingConfigurations()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Drawable newDrawable()
	{
		return ((Drawable) (new GifDrawable(this)));
	//    0    0:new             #6   <Class GifDrawable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #31  <Method void GifDrawable(GifDrawable$GifState)>
	//    4    8:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		return newDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #34  <Method Drawable newDrawable()>
	//    2    4:areturn         
	}

	static final int GRAVITY = 119;
	final BitmapPool bitmapPool;
	final GifFrameLoader frameLoader;

	public GifDrawable$GifState(BitmapPool bitmappool, GifFrameLoader gifframeloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void android.graphics.drawable.Drawable$ConstantState()>
		bitmapPool = bitmappool;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field BitmapPool bitmapPool>
		frameLoader = gifframeloader;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field GifFrameLoader frameLoader>
	//    8   14:return          
	}
}
