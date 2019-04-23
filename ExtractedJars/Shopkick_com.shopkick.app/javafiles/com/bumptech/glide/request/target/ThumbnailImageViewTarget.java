// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.request.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.request.target:
//			ImageViewTarget, FixedSizeDrawable

public abstract class ThumbnailImageViewTarget extends ImageViewTarget
{

	public ThumbnailImageViewTarget(ImageView imageview)
	{
		super(imageview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #9   <Method void ImageViewTarget(ImageView)>
	//    3    5:return          
	}

	public ThumbnailImageViewTarget(ImageView imageview, boolean flag)
	{
		super(imageview, flag);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #14  <Method void ImageViewTarget(ImageView, boolean)>
	//    4    6:return          
	}

	protected abstract Drawable getDrawable(Object obj);

	protected void setResource(Object obj)
	{
		android.view.ViewGroup.LayoutParams layoutparams = ((ImageView)view).getLayoutParams();
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field android.view.View view>
	//    2    4:checkcast       #26  <Class ImageView>
	//    3    7:invokevirtual   #30  <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//    4   10:astore_3        
		Drawable drawable = getDrawable(obj);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #32  <Method Drawable getDrawable(Object)>
	//    8   16:astore_2        
		obj = ((Object) (drawable));
	//    9   17:aload_2         
	//   10   18:astore_1        
		if(layoutparams != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          58
		{
			obj = ((Object) (drawable));
	//   13   23:aload_2         
	//   14   24:astore_1        
			if(layoutparams.width > 0)
	//*  15   25:aload_3         
	//*  16   26:getfield        #38  <Field int android.view.ViewGroup$LayoutParams.width>
	//*  17   29:ifle            58
			{
				obj = ((Object) (drawable));
	//   18   32:aload_2         
	//   19   33:astore_1        
				if(layoutparams.height > 0)
	//*  20   34:aload_3         
	//*  21   35:getfield        #41  <Field int android.view.ViewGroup$LayoutParams.height>
	//*  22   38:ifle            58
					obj = ((Object) (new FixedSizeDrawable(drawable, layoutparams.width, layoutparams.height)));
	//   23   41:new             #43  <Class FixedSizeDrawable>
	//   24   44:dup             
	//   25   45:aload_2         
	//   26   46:aload_3         
	//   27   47:getfield        #38  <Field int android.view.ViewGroup$LayoutParams.width>
	//   28   50:aload_3         
	//   29   51:getfield        #41  <Field int android.view.ViewGroup$LayoutParams.height>
	//   30   54:invokespecial   #46  <Method void FixedSizeDrawable(Drawable, int, int)>
	//   31   57:astore_1        
			}
		}
		((ImageView)view).setImageDrawable(((Drawable) (obj)));
	//   32   58:aload_0         
	//   33   59:getfield        #24  <Field android.view.View view>
	//   34   62:checkcast       #26  <Class ImageView>
	//   35   65:aload_1         
	//   36   66:invokevirtual   #50  <Method void ImageView.setImageDrawable(Drawable)>
	//   37   69:return          
	}
}
