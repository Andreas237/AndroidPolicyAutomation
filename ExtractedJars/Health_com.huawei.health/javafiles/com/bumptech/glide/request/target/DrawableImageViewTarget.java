// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.request.target:
//			ImageViewTarget

public class DrawableImageViewTarget extends ImageViewTarget
{

	public DrawableImageViewTarget(ImageView imageview)
	{
		super(imageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ImageViewTarget(ImageView)>
	//    3    5:return          
	}

	protected void setResource(Drawable drawable)
	{
		((ImageView)view).setImageDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.view.View view>
	//    2    4:checkcast       #19  <Class ImageView>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #22  <Method void ImageView.setImageDrawable(Drawable)>
	//    5   11:return          
	}

	protected volatile void setResource(Object obj)
	{
		setResource((Drawable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #26  <Class Drawable>
	//    3    5:invokevirtual   #28  <Method void setResource(Drawable)>
	//    4    8:return          
	}
}
