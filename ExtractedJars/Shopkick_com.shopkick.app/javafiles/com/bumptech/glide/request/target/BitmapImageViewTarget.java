// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.request.target:
//			ImageViewTarget

public class BitmapImageViewTarget extends ImageViewTarget
{

	public BitmapImageViewTarget(ImageView imageview)
	{
		super(imageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ImageViewTarget(ImageView)>
	//    3    5:return          
	}

	public BitmapImageViewTarget(ImageView imageview, boolean flag)
	{
		super(imageview, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #14  <Method void ImageViewTarget(ImageView, boolean)>
	//    4    6:return          
	}

	protected void setResource(Bitmap bitmap)
	{
		((ImageView)view).setImageBitmap(bitmap);
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field android.view.View view>
	//    2    4:checkcast       #23  <Class ImageView>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #26  <Method void ImageView.setImageBitmap(Bitmap)>
	//    5   11:return          
	}

	protected volatile void setResource(Object obj)
	{
		setResource((Bitmap)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #29  <Class Bitmap>
	//    3    5:invokevirtual   #31  <Method void setResource(Bitmap)>
	//    4    8:return          
	}
}
