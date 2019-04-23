// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package android.support.v4.widget:
//			TintableImageSourceView

public class ImageViewCompat
{

	private ImageViewCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static ColorStateList getImageTintList(ImageView imageview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return imageview.getImageTintList();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #24  <Method ColorStateList ImageView.getImageTintList()>
	//    5   12:areturn         
		if(imageview instanceof TintableImageSourceView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #26  <Class TintableImageSourceView>
	//*   8   17:ifeq            30
			return ((TintableImageSourceView)imageview).getSupportImageTintList();
	//    9   20:aload_0         
	//   10   21:checkcast       #26  <Class TintableImageSourceView>
	//   11   24:invokeinterface #29  <Method ColorStateList TintableImageSourceView.getSupportImageTintList()>
	//   12   29:areturn         
		else
			return null;
	//   13   30:aconst_null     
	//   14   31:areturn         
	}

	public static android.graphics.PorterDuff.Mode getImageTintMode(ImageView imageview)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return imageview.getImageTintMode();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #36  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//    5   12:areturn         
		if(imageview instanceof TintableImageSourceView)
	//*   6   13:aload_0         
	//*   7   14:instanceof      #26  <Class TintableImageSourceView>
	//*   8   17:ifeq            30
			return ((TintableImageSourceView)imageview).getSupportImageTintMode();
	//    9   20:aload_0         
	//   10   21:checkcast       #26  <Class TintableImageSourceView>
	//   11   24:invokeinterface #39  <Method android.graphics.PorterDuff$Mode TintableImageSourceView.getSupportImageTintMode()>
	//   12   29:areturn         
		else
			return null;
	//   13   30:aconst_null     
	//   14   31:areturn         
	}

	public static void setImageTintList(ImageView imageview, ColorStateList colorstatelist)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          77
		{
			imageview.setImageTintList(colorstatelist);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #44  <Method void ImageView.setImageTintList(ColorStateList)>
			if(android.os.Build.VERSION.SDK_INT == 21)
	//*   6   13:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          21
	//*   8   18:icmpne          94
			{
				colorstatelist = ((ColorStateList) (imageview.getDrawable()));
	//    9   21:aload_0         
	//   10   22:invokevirtual   #48  <Method Drawable ImageView.getDrawable()>
	//   11   25:astore_1        
				boolean flag;
				if(imageview.getImageTintList() != null && imageview.getImageTintMode() != null)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #24  <Method ColorStateList ImageView.getImageTintList()>
	//*  14   30:ifnull          45
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #36  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//*  17   37:ifnull          45
					flag = true;
	//   18   40:iconst_1        
	//   19   41:istore_2        
				else
	//*  20   42:goto            47
					flag = false;
	//   21   45:iconst_0        
	//   22   46:istore_2        
				if(colorstatelist != null && flag)
	//*  23   47:aload_1         
	//*  24   48:ifnull          94
	//*  25   51:iload_2         
	//*  26   52:ifeq            94
				{
					if(((Drawable) (colorstatelist)).isStateful())
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #54  <Method boolean Drawable.isStateful()>
	//*  29   59:ifeq            71
						((Drawable) (colorstatelist)).setState(imageview.getDrawableState());
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:invokevirtual   #58  <Method int[] ImageView.getDrawableState()>
	//   33   67:invokevirtual   #62  <Method boolean Drawable.setState(int[])>
	//   34   70:pop             
					imageview.setImageDrawable(((Drawable) (colorstatelist)));
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #66  <Method void ImageView.setImageDrawable(Drawable)>
					return;
	//   38   76:return          
				}
			}
		} else
		if(imageview instanceof TintableImageSourceView)
	//*  39   77:aload_0         
	//*  40   78:instanceof      #26  <Class TintableImageSourceView>
	//*  41   81:ifeq            94
			((TintableImageSourceView)imageview).setSupportImageTintList(colorstatelist);
	//   42   84:aload_0         
	//   43   85:checkcast       #26  <Class TintableImageSourceView>
	//   44   88:aload_1         
	//   45   89:invokeinterface #69  <Method void TintableImageSourceView.setSupportImageTintList(ColorStateList)>
	//   46   94:return          
	}

	public static void setImageTintMode(ImageView imageview, android.graphics.PorterDuff.Mode mode)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          77
		{
			imageview.setImageTintMode(mode);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #74  <Method void ImageView.setImageTintMode(android.graphics.PorterDuff$Mode)>
			if(android.os.Build.VERSION.SDK_INT == 21)
	//*   6   13:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          21
	//*   8   18:icmpne          94
			{
				mode = ((android.graphics.PorterDuff.Mode) (imageview.getDrawable()));
	//    9   21:aload_0         
	//   10   22:invokevirtual   #48  <Method Drawable ImageView.getDrawable()>
	//   11   25:astore_1        
				boolean flag;
				if(imageview.getImageTintList() != null && imageview.getImageTintMode() != null)
	//*  12   26:aload_0         
	//*  13   27:invokevirtual   #24  <Method ColorStateList ImageView.getImageTintList()>
	//*  14   30:ifnull          45
	//*  15   33:aload_0         
	//*  16   34:invokevirtual   #36  <Method android.graphics.PorterDuff$Mode ImageView.getImageTintMode()>
	//*  17   37:ifnull          45
					flag = true;
	//   18   40:iconst_1        
	//   19   41:istore_2        
				else
	//*  20   42:goto            47
					flag = false;
	//   21   45:iconst_0        
	//   22   46:istore_2        
				if(mode != null && flag)
	//*  23   47:aload_1         
	//*  24   48:ifnull          94
	//*  25   51:iload_2         
	//*  26   52:ifeq            94
				{
					if(((Drawable) (mode)).isStateful())
	//*  27   55:aload_1         
	//*  28   56:invokevirtual   #54  <Method boolean Drawable.isStateful()>
	//*  29   59:ifeq            71
						((Drawable) (mode)).setState(imageview.getDrawableState());
	//   30   62:aload_1         
	//   31   63:aload_0         
	//   32   64:invokevirtual   #58  <Method int[] ImageView.getDrawableState()>
	//   33   67:invokevirtual   #62  <Method boolean Drawable.setState(int[])>
	//   34   70:pop             
					imageview.setImageDrawable(((Drawable) (mode)));
	//   35   71:aload_0         
	//   36   72:aload_1         
	//   37   73:invokevirtual   #66  <Method void ImageView.setImageDrawable(Drawable)>
					return;
	//   38   76:return          
				}
			}
		} else
		if(imageview instanceof TintableImageSourceView)
	//*  39   77:aload_0         
	//*  40   78:instanceof      #26  <Class TintableImageSourceView>
	//*  41   81:ifeq            94
			((TintableImageSourceView)imageview).setSupportImageTintMode(mode);
	//   42   84:aload_0         
	//   43   85:checkcast       #26  <Class TintableImageSourceView>
	//   44   88:aload_1         
	//   45   89:invokeinterface #77  <Method void TintableImageSourceView.setSupportImageTintMode(android.graphics.PorterDuff$Mode)>
	//   46   94:return          
	}
}
