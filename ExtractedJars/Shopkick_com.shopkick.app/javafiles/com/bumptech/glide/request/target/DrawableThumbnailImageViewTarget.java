// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.request.target:
//			ThumbnailImageViewTarget

public class DrawableThumbnailImageViewTarget extends ThumbnailImageViewTarget
{

	public DrawableThumbnailImageViewTarget(ImageView imageview)
	{
		super(imageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ThumbnailImageViewTarget(ImageView)>
	//    3    5:return          
	}

	public DrawableThumbnailImageViewTarget(ImageView imageview, boolean flag)
	{
		super(imageview, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #14  <Method void ThumbnailImageViewTarget(ImageView, boolean)>
	//    4    6:return          
	}

	protected Drawable getDrawable(Drawable drawable)
	{
		return drawable;
	//    0    0:aload_1         
	//    1    1:areturn         
	}

	protected volatile Drawable getDrawable(Object obj)
	{
		return getDrawable((Drawable)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #20  <Class Drawable>
	//    3    5:invokevirtual   #22  <Method Drawable getDrawable(Drawable)>
	//    4    8:areturn         
	}
}
