// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.request.target:
//			ThumbnailImageViewTarget

public class BitmapThumbnailImageViewTarget extends ThumbnailImageViewTarget
{

	public BitmapThumbnailImageViewTarget(ImageView imageview)
	{
		super(imageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ThumbnailImageViewTarget(ImageView)>
	//    3    5:return          
	}

	public BitmapThumbnailImageViewTarget(ImageView imageview, boolean flag)
	{
		super(imageview, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #14  <Method void ThumbnailImageViewTarget(ImageView, boolean)>
	//    4    6:return          
	}

	protected Drawable getDrawable(Bitmap bitmap)
	{
		return ((Drawable) (new BitmapDrawable(((ImageView)view).getResources(), bitmap)));
	//    0    0:new             #19  <Class BitmapDrawable>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field android.view.View view>
	//    4    8:checkcast       #25  <Class ImageView>
	//    5   11:invokevirtual   #29  <Method android.content.res.Resources ImageView.getResources()>
	//    6   14:aload_1         
	//    7   15:invokespecial   #32  <Method void BitmapDrawable(android.content.res.Resources, Bitmap)>
	//    8   18:areturn         
	}

	protected volatile Drawable getDrawable(Object obj)
	{
		return getDrawable((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #35  <Class Bitmap>
	//    3    5:invokevirtual   #37  <Method Drawable getDrawable(Bitmap)>
	//    4    8:areturn         
	}
}
