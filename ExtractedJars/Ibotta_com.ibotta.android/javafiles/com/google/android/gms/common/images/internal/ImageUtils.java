// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images.internal;

import android.content.res.Resources;
import android.graphics.*;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

public final class ImageUtils
{

	public ImageUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static Bitmap frameBitmapInCircle(Bitmap bitmap)
	{
		if(bitmap == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		int i = bitmap.getWidth();
	//    4    6:aload_0         
	//    5    7:invokevirtual   #17  <Method int Bitmap.getWidth()>
	//    6   10:istore_2        
		int j = bitmap.getHeight();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #20  <Method int Bitmap.getHeight()>
	//    9   15:istore_3        
		int k = 0;
	//   10   16:iconst_0        
	//   11   17:istore          4
		if(i >= j)
	//*  12   19:iload_2         
	//*  13   20:iload_3         
	//*  14   21:icmplt          38
		{
			k = (j - i) / 2;
	//   15   24:iload_3         
	//   16   25:iload_2         
	//   17   26:isub            
	//   18   27:iconst_2        
	//   19   28:idiv            
	//   20   29:istore          4
			i = j;
	//   21   31:iload_3         
	//   22   32:istore_2        
			j = 0;
	//   23   33:iconst_0        
	//   24   34:istore_3        
		} else
	//*  25   35:goto            44
		{
			j = (i - j) / 2;
	//   26   38:iload_2         
	//   27   39:iload_3         
	//   28   40:isub            
	//   29   41:iconst_2        
	//   30   42:idiv            
	//   31   43:istore_3        
		}
		Bitmap bitmap1 = Bitmap.createBitmap(i, i, android.graphics.Bitmap.Config.ARGB_8888);
	//   32   44:iload_2         
	//   33   45:iload_2         
	//   34   46:getstatic       #26  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   35   49:invokestatic    #30  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   36   52:astore          5
		Canvas canvas = new Canvas(bitmap1);
	//   37   54:new             #32  <Class Canvas>
	//   38   57:dup             
	//   39   58:aload           5
	//   40   60:invokespecial   #35  <Method void Canvas(Bitmap)>
	//   41   63:astore          6
		Paint paint = new Paint(1);
	//   42   65:new             #37  <Class Paint>
	//   43   68:dup             
	//   44   69:iconst_1        
	//   45   70:invokespecial   #40  <Method void Paint(int)>
	//   46   73:astore          7
		paint.setColor(0xff000000);
	//   47   75:aload           7
	//   48   77:ldc1            #41  <Int 0xff000000>
	//   49   79:invokevirtual   #44  <Method void Paint.setColor(int)>
		float f = i / 2;
	//   50   82:iload_2         
	//   51   83:iconst_2        
	//   52   84:idiv            
	//   53   85:i2f             
	//   54   86:fstore_1        
		canvas.drawCircle(f, f, f, paint);
	//   55   87:aload           6
	//   56   89:fload_1         
	//   57   90:fload_1         
	//   58   91:fload_1         
	//   59   92:aload           7
	//   60   94:invokevirtual   #48  <Method void Canvas.drawCircle(float, float, float, Paint)>
		paint.setXfermode(((android.graphics.Xfermode) (new PorterDuffXfermode(android.graphics.PorterDuff.Mode.SRC_IN))));
	//   61   97:aload           7
	//   62   99:new             #50  <Class PorterDuffXfermode>
	//   63  102:dup             
	//   64  103:getstatic       #56  <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//   65  106:invokespecial   #59  <Method void PorterDuffXfermode(android.graphics.PorterDuff$Mode)>
	//   66  109:invokevirtual   #63  <Method android.graphics.Xfermode Paint.setXfermode(android.graphics.Xfermode)>
	//   67  112:pop             
		canvas.drawBitmap(bitmap, k, j, paint);
	//   68  113:aload           6
	//   69  115:aload_0         
	//   70  116:iload           4
	//   71  118:i2f             
	//   72  119:iload_3         
	//   73  120:i2f             
	//   74  121:aload           7
	//   75  123:invokevirtual   #67  <Method void Canvas.drawBitmap(Bitmap, float, float, Paint)>
		return bitmap1;
	//   76  126:aload           5
	//   77  128:areturn         
	}

	public static Drawable frameDrawableInCircle(Resources resources, Drawable drawable)
	{
		if(drawable == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       9
			drawable = null;
	//    2    4:aconst_null     
	//    3    5:astore_1        
		else
	//*   4    6:goto            72
		if(drawable instanceof BitmapDrawable)
	//*   5    9:aload_1         
	//*   6   10:instanceof      #71  <Class BitmapDrawable>
	//*   7   13:ifeq            27
		{
			drawable = ((Drawable) (((BitmapDrawable)drawable).getBitmap()));
	//    8   16:aload_1         
	//    9   17:checkcast       #71  <Class BitmapDrawable>
	//   10   20:invokevirtual   #75  <Method Bitmap BitmapDrawable.getBitmap()>
	//   11   23:astore_1        
		} else
	//*  12   24:goto            72
		{
			Bitmap bitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), android.graphics.Bitmap.Config.ARGB_8888);
	//   13   27:aload_1         
	//   14   28:invokevirtual   #80  <Method int Drawable.getIntrinsicWidth()>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #83  <Method int Drawable.getIntrinsicHeight()>
	//   17   35:getstatic       #26  <Field android.graphics.Bitmap$Config android.graphics.Bitmap$Config.ARGB_8888>
	//   18   38:invokestatic    #30  <Method Bitmap Bitmap.createBitmap(int, int, android.graphics.Bitmap$Config)>
	//   19   41:astore_2        
			Canvas canvas = new Canvas(bitmap);
	//   20   42:new             #32  <Class Canvas>
	//   21   45:dup             
	//   22   46:aload_2         
	//   23   47:invokespecial   #35  <Method void Canvas(Bitmap)>
	//   24   50:astore_3        
			drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
	//   25   51:aload_1         
	//   26   52:iconst_0        
	//   27   53:iconst_0        
	//   28   54:aload_3         
	//   29   55:invokevirtual   #84  <Method int Canvas.getWidth()>
	//   30   58:aload_3         
	//   31   59:invokevirtual   #85  <Method int Canvas.getHeight()>
	//   32   62:invokevirtual   #89  <Method void Drawable.setBounds(int, int, int, int)>
			drawable.draw(canvas);
	//   33   65:aload_1         
	//   34   66:aload_3         
	//   35   67:invokevirtual   #93  <Method void Drawable.draw(Canvas)>
			drawable = ((Drawable) (bitmap));
	//   36   70:aload_2         
	//   37   71:astore_1        
		}
		return ((Drawable) (new BitmapDrawable(resources, frameBitmapInCircle(((Bitmap) (drawable))))));
	//   38   72:new             #71  <Class BitmapDrawable>
	//   39   75:dup             
	//   40   76:aload_0         
	//   41   77:aload_1         
	//   42   78:invokestatic    #95  <Method Bitmap frameBitmapInCircle(Bitmap)>
	//   43   81:invokespecial   #98  <Method void BitmapDrawable(Resources, Bitmap)>
	//   44   84:areturn         
	}
}
