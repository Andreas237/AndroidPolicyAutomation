// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.gif;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.bumptech.glide.load.resource.gif:
//			GifDrawable, GifFrameLoader

static final class GifDrawable$GifState extends android.graphics.drawable.e
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
	//    3    5:invokespecial   #26  <Method void GifDrawable(GifDrawable$GifState)>
	//    4    8:areturn         
	}

	public Drawable newDrawable(Resources resources)
	{
		return newDrawable();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #30  <Method Drawable newDrawable()>
	//    2    4:areturn         
	}

	final GifFrameLoader frameLoader;

	GifDrawable$GifState(GifFrameLoader gifframeloader)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void android.graphics.drawable.Drawable$ConstantState()>
		frameLoader = gifframeloader;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field GifFrameLoader frameLoader>
	//    5    9:return          
	}
}
