// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.graphics.Matrix;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			ImageViewUtilsImpl

class ImageViewUtilsApi21
	implements ImageViewUtilsImpl
{

	ImageViewUtilsApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	private void fetchAnimateTransformMethod()
	{
		if(!sAnimateTransformMethodFetched)
	//*   0    0:getstatic       #27  <Field boolean sAnimateTransformMethodFetched>
	//*   1    3:ifne            36
		{
			try
			{
				sAnimateTransformMethod = ((Class) (android/widget/ImageView)).getDeclaredMethod("animateTransform", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #29  <Class ImageView>
	//    3    8:ldc1            #31  <String "animateTransform">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #35  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #39  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #41  <Field Method sAnimateTransformMethod>
				sAnimateTransformMethod.setAccessible(true);
	//   12   25:getstatic       #41  <Field Method sAnimateTransformMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #47  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:iconst_1        
	//*  16   33:putstatic       #27  <Field boolean sAnimateTransformMethodFetched>
	//*  17   36:return          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  18   37:astore_1        
			{
				Log.i("ImageViewUtilsApi21", "Failed to retrieve animateTransform method", ((Throwable) (nosuchmethodexception)));
	//   19   38:ldc1            #13  <String "ImageViewUtilsApi21">
	//   20   40:ldc1            #49  <String "Failed to retrieve animateTransform method">
	//   21   42:aload_1         
	//   22   43:invokestatic    #55  <Method int Log.i(String, String, Throwable)>
	//   23   46:pop             
			}
			sAnimateTransformMethodFetched = true;
		}
	//*  24   47:goto            32
	}

	public void animateTransform(ImageView imageview, Matrix matrix)
	{
		fetchAnimateTransformMethod();
	//    0    0:aload_0         
	//    1    1:invokespecial   #62  <Method void fetchAnimateTransformMethod()>
		if(sAnimateTransformMethod == null)
			break MISSING_BLOCK_LABEL_26;
	//    2    4:getstatic       #41  <Field Method sAnimateTransformMethod>
	//    3    7:ifnull          26
		sAnimateTransformMethod.invoke(((Object) (imageview)), new Object[] {
			matrix
		});
	//    4   10:getstatic       #41  <Field Method sAnimateTransformMethod>
	//    5   13:aload_1         
	//    6   14:iconst_1        
	//    7   15:anewarray       Object[]
	//    8   18:dup             
	//    9   19:iconst_0        
	//   10   20:aload_2         
	//   11   21:aastore         
	//   12   22:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
	//   13   25:pop             
		return;
	//   14   26:return          
		imageview;
	//   15   27:astore_1        
		throw new RuntimeException(((InvocationTargetException) (imageview)).getCause());
	//   16   28:new             #68  <Class RuntimeException>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:invokevirtual   #72  <Method Throwable InvocationTargetException.getCause()>
	//   20   36:invokespecial   #75  <Method void RuntimeException(Throwable)>
	//   21   39:athrow          
		imageview;
	//   22   40:astore_1        
	//   23   41:return          
	}

	public void reserveEndAnimateTransform(ImageView imageview, Animator animator)
	{
	//    0    0:return          
	}

	public void startAnimateTransform(ImageView imageview)
	{
	//    0    0:return          
	}

	private static final String TAG = "ImageViewUtilsApi21";
	private static Method sAnimateTransformMethod;
	private static boolean sAnimateTransformMethodFetched;
}
