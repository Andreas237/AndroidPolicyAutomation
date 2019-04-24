// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package android.support.v4.widget:
//			ImageViewCompat

static class ImageViewCompat$LollipopViewCompatImpl extends ImageViewCompat.BaseViewCompatImpl
{

	public ColorStateList getImageTintList(ImageView imageview)
	{
		return imageview.getImageTintList();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method ColorStateList ImageView.getImageTintList()>
	//    2    4:areturn         
	}

	public android.graphics.PorterDuff.Mode getImageTintMode(ImageView imageview)
	{
		return imageview.getImageTintMode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//    2    4:areturn         
	}

	public void setImageTintList(ImageView imageview, ColorStateList colorstatelist)
	{
		imageview.setImageTintList(colorstatelist);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #32  <Method void ImageView.setImageTintList(ColorStateList)>
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   3    5:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpne          63
		{
			colorstatelist = ((ColorStateList) (imageview.getDrawable()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #42  <Method Drawable ImageView.getDrawable()>
	//    8   17:astore_2        
			boolean flag;
			if(imageview.getImageTintList() != null && imageview.getImageTintMode() != null)
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #22  <Method ColorStateList ImageView.getImageTintList()>
	//*  11   22:ifnull          64
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #27  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//*  14   29:ifnull          64
				flag = true;
	//   15   32:iconst_1        
	//   16   33:istore_3        
			else
	//*  17   34:aload_2         
	//*  18   35:ifnull          63
	//*  19   38:iload_3         
	//*  20   39:ifeq            63
	//*  21   42:aload_2         
	//*  22   43:invokevirtual   #48  <Method boolean Drawable.isStateful()>
	//*  23   46:ifeq            58
	//*  24   49:aload_2         
	//*  25   50:aload_1         
	//*  26   51:invokevirtual   #52  <Method int[] ImageView.getDrawableState()>
	//*  27   54:invokevirtual   #56  <Method boolean Drawable.setState(int[])>
	//*  28   57:pop             
	//*  29   58:aload_1         
	//*  30   59:aload_2         
	//*  31   60:invokevirtual   #60  <Method void ImageView.setImageDrawable(Drawable)>
	//*  32   63:return          
				flag = false;
	//   33   64:iconst_0        
	//   34   65:istore_3        
			if(colorstatelist != null && flag)
			{
				if(((Drawable) (colorstatelist)).isStateful())
					((Drawable) (colorstatelist)).setState(imageview.getDrawableState());
				imageview.setImageDrawable(((Drawable) (colorstatelist)));
			}
		}
	//*  35   66:goto            34
	}

	public void setImageTintMode(ImageView imageview, android.graphics.PorterDuff.Mode mode)
	{
		imageview.setImageTintMode(mode);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #65  <Method void ImageView.setImageTintMode(android.graphics.PorterDuff$Mode)>
		if(android.os.Build.VERSION.SDK_INT == 21)
	//*   3    5:getstatic       #38  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpne          63
		{
			mode = ((android.graphics.PorterDuff.Mode) (imageview.getDrawable()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #42  <Method Drawable ImageView.getDrawable()>
	//    8   17:astore_2        
			boolean flag;
			if(imageview.getImageTintList() != null && imageview.getImageTintMode() != null)
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #22  <Method ColorStateList ImageView.getImageTintList()>
	//*  11   22:ifnull          64
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #27  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//*  14   29:ifnull          64
				flag = true;
	//   15   32:iconst_1        
	//   16   33:istore_3        
			else
	//*  17   34:aload_2         
	//*  18   35:ifnull          63
	//*  19   38:iload_3         
	//*  20   39:ifeq            63
	//*  21   42:aload_2         
	//*  22   43:invokevirtual   #48  <Method boolean Drawable.isStateful()>
	//*  23   46:ifeq            58
	//*  24   49:aload_2         
	//*  25   50:aload_1         
	//*  26   51:invokevirtual   #52  <Method int[] ImageView.getDrawableState()>
	//*  27   54:invokevirtual   #56  <Method boolean Drawable.setState(int[])>
	//*  28   57:pop             
	//*  29   58:aload_1         
	//*  30   59:aload_2         
	//*  31   60:invokevirtual   #60  <Method void ImageView.setImageDrawable(Drawable)>
	//*  32   63:return          
				flag = false;
	//   33   64:iconst_0        
	//   34   65:istore_3        
			if(mode != null && flag)
			{
				if(((Drawable) (mode)).isStateful())
					((Drawable) (mode)).setState(imageview.getDrawableState());
				imageview.setImageDrawable(((Drawable) (mode)));
			}
		}
	//*  35   66:goto            34
	}

	ImageViewCompat$LollipopViewCompatImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ImageViewCompat$BaseViewCompatImpl()>
	//    2    4:return          
	}
}
