// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package android.support.v4.widget:
//			h

static class h$c extends h$a
{

	public ColorStateList a(ImageView imageview)
	{
		return imageview.getImageTintList();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #20  <Method ColorStateList ImageView.getImageTintList()>
	//    2    4:areturn         
	}

	public void a(ImageView imageview, ColorStateList colorstatelist)
	{
		imageview.setImageTintList(colorstatelist);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #25  <Method void ImageView.setImageTintList(ColorStateList)>
		if(android.os.d.VERSION.SDK_INT == 21)
	//*   3    5:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpne          68
		{
			colorstatelist = ((ColorStateList) (imageview.getDrawable()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #35  <Method Drawable ImageView.getDrawable()>
	//    8   17:astore_2        
			boolean flag;
			if(imageview.getImageTintList() != null && imageview.getImageTintMode() != null)
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #20  <Method ColorStateList ImageView.getImageTintList()>
	//*  11   22:ifnull          37
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #39  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//*  14   29:ifnull          37
				flag = true;
	//   15   32:iconst_1        
	//   16   33:istore_3        
			else
	//*  17   34:goto            39
				flag = false;
	//   18   37:iconst_0        
	//   19   38:istore_3        
			if(colorstatelist != null && flag)
	//*  20   39:aload_2         
	//*  21   40:ifnull          68
	//*  22   43:iload_3         
	//*  23   44:ifeq            68
			{
				if(((Drawable) (colorstatelist)).isStateful())
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #45  <Method boolean Drawable.isStateful()>
	//*  26   51:ifeq            63
					((Drawable) (colorstatelist)).setState(imageview.getDrawableState());
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #49  <Method int[] ImageView.getDrawableState()>
	//   30   59:invokevirtual   #53  <Method boolean Drawable.setState(int[])>
	//   31   62:pop             
				imageview.setImageDrawable(((Drawable) (colorstatelist)));
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:invokevirtual   #57  <Method void ImageView.setImageDrawable(Drawable)>
			}
		}
	//   35   68:return          
	}

	public void a(ImageView imageview, android.graphics.erDuff.Mode mode)
	{
		imageview.setImageTintMode(mode);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #62  <Method void ImageView.setImageTintMode(android.graphics.PorterDuff$Mode)>
		if(android.os.d.VERSION.SDK_INT == 21)
	//*   3    5:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   4    8:bipush          21
	//*   5   10:icmpne          68
		{
			mode = ((android.graphics.erDuff.Mode) (imageview.getDrawable()));
	//    6   13:aload_1         
	//    7   14:invokevirtual   #35  <Method Drawable ImageView.getDrawable()>
	//    8   17:astore_2        
			boolean flag;
			if(imageview.getImageTintList() != null && imageview.getImageTintMode() != null)
	//*   9   18:aload_1         
	//*  10   19:invokevirtual   #20  <Method ColorStateList ImageView.getImageTintList()>
	//*  11   22:ifnull          37
	//*  12   25:aload_1         
	//*  13   26:invokevirtual   #39  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//*  14   29:ifnull          37
				flag = true;
	//   15   32:iconst_1        
	//   16   33:istore_3        
			else
	//*  17   34:goto            39
				flag = false;
	//   18   37:iconst_0        
	//   19   38:istore_3        
			if(mode != null && flag)
	//*  20   39:aload_2         
	//*  21   40:ifnull          68
	//*  22   43:iload_3         
	//*  23   44:ifeq            68
			{
				if(((Drawable) (mode)).isStateful())
	//*  24   47:aload_2         
	//*  25   48:invokevirtual   #45  <Method boolean Drawable.isStateful()>
	//*  26   51:ifeq            63
					((Drawable) (mode)).setState(imageview.getDrawableState());
	//   27   54:aload_2         
	//   28   55:aload_1         
	//   29   56:invokevirtual   #49  <Method int[] ImageView.getDrawableState()>
	//   30   59:invokevirtual   #53  <Method boolean Drawable.setState(int[])>
	//   31   62:pop             
				imageview.setImageDrawable(((Drawable) (mode)));
	//   32   63:aload_1         
	//   33   64:aload_2         
	//   34   65:invokevirtual   #57  <Method void ImageView.setImageDrawable(Drawable)>
			}
		}
	//   35   68:return          
	}

	public android.graphics.erDuff.Mode b(ImageView imageview)
	{
		return imageview.getImageTintMode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//    2    4:areturn         
	}

	h$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void h$a()>
	//    2    4:return          
	}
}
