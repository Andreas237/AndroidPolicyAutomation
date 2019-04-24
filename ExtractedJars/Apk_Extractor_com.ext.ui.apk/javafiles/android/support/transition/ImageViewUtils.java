// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.widget.ImageView;

// Referenced classes of package android.support.transition:
//			ImageViewUtilsApi21, ImageViewUtilsApi14, ImageViewUtilsImpl

class ImageViewUtils
{

	ImageViewUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	static void animateTransform(ImageView imageview, Matrix matrix)
	{
		IMPL.animateTransform(imageview, matrix);
	//    0    0:getstatic       #21  <Field ImageViewUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #32  <Method void ImageViewUtilsImpl.animateTransform(ImageView, Matrix)>
	//    4   10:return          
	}

	static void reserveEndAnimateTransform(ImageView imageview, Animator animator)
	{
		IMPL.reserveEndAnimateTransform(imageview, animator);
	//    0    0:getstatic       #21  <Field ImageViewUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method void ImageViewUtilsImpl.reserveEndAnimateTransform(ImageView, Animator)>
	//    4   10:return          
	}

	static void startAnimateTransform(ImageView imageview)
	{
		IMPL.startAnimateTransform(imageview);
	//    0    0:getstatic       #21  <Field ImageViewUtilsImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokeinterface #40  <Method void ImageViewUtilsImpl.startAnimateTransform(ImageView)>
	//    3    9:return          
	}

	private static final ImageViewUtilsImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #14  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			IMPL = ((ImageViewUtilsImpl) (new ImageViewUtilsApi21()));
	//    3    8:new             #16  <Class ImageViewUtilsApi21>
	//    4   11:dup             
	//    5   12:invokespecial   #19  <Method void ImageViewUtilsApi21()>
	//    6   15:putstatic       #21  <Field ImageViewUtilsImpl IMPL>
	//    7   18:return          
		else
			IMPL = ((ImageViewUtilsImpl) (new ImageViewUtilsApi14()));
	//    8   19:new             #23  <Class ImageViewUtilsApi14>
	//    9   22:dup             
	//   10   23:invokespecial   #24  <Method void ImageViewUtilsApi14()>
	//   11   26:putstatic       #21  <Field ImageViewUtilsImpl IMPL>
	//*  12   29:return          
	}
}
