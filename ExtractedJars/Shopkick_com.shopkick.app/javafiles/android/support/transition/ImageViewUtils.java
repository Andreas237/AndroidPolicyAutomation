// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.util.Log;
import android.widget.ImageView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.transition:
//			MatrixUtils

class ImageViewUtils
{

	private ImageViewUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}

	static void animateTransform(ImageView imageview, Matrix matrix)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          14
		{
			imageview.setImageMatrix(matrix);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #37  <Method void ImageView.setImageMatrix(Matrix)>
			return;
	//    6   13:return          
		}
		fetchAnimateTransformMethod();
	//    7   14:invokestatic    #40  <Method void fetchAnimateTransformMethod()>
		Method method = sAnimateTransformMethod;
	//    8   17:getstatic       #42  <Field Method sAnimateTransformMethod>
	//    9   20:astore_2        
		if(method != null)
	//*  10   21:aload_2         
	//*  11   22:ifnull          53
			try
			{
				method.invoke(((Object) (imageview)), new Object[] {
					matrix
				});
	//   12   25:aload_2         
	//   13   26:aload_0         
	//   14   27:iconst_1        
	//   15   28:anewarray       Object[]
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:aload_1         
	//   19   34:aastore         
	//   20   35:invokevirtual   #48  <Method Object Method.invoke(Object, Object[])>
	//   21   38:pop             
				return;
	//   22   39:return          
			}
	//*  23   40:astore_0        
	//*  24   41:new             #50  <Class RuntimeException>
	//*  25   44:dup             
	//*  26   45:aload_0         
	//*  27   46:invokevirtual   #54  <Method Throwable InvocationTargetException.getCause()>
	//*  28   49:invokespecial   #57  <Method void RuntimeException(Throwable)>
	//*  29   52:athrow          
	//*  30   53:return          
			// Misplaced declaration of an exception variable
			catch(ImageView imageview)
	//*  31   54:astore_0        
			{
				return;
	//   32   55:return          
			}
			// Misplaced declaration of an exception variable
			catch(ImageView imageview)
			{
				throw new RuntimeException(((InvocationTargetException) (imageview)).getCause());
			}
		else
			return;
	}

	private static void fetchAnimateTransformMethod()
	{
		if(!sAnimateTransformMethodFetched)
	//*   0    0:getstatic       #61  <Field boolean sAnimateTransformMethodFetched>
	//*   1    3:ifne            49
		{
			try
			{
				sAnimateTransformMethod = ((Class) (android/widget/ImageView)).getDeclaredMethod("animateTransform", new Class[] {
					android/graphics/Matrix
				});
	//    2    6:ldc1            #33  <Class ImageView>
	//    3    8:ldc1            #62  <String "animateTransform">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #66  <Class Matrix>
	//    9   18:aastore         
	//   10   19:invokevirtual   #70  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #42  <Field Method sAnimateTransformMethod>
				sAnimateTransformMethod.setAccessible(true);
	//   12   25:getstatic       #42  <Field Method sAnimateTransformMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #74  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_0        
			{
				Log.i("ImageViewUtils", "Failed to retrieve animateTransform method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #10  <String "ImageViewUtils">
	//   18   38:ldc1            #76  <String "Failed to retrieve animateTransform method">
	//   19   40:aload_0         
	//   20   41:invokestatic    #82  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			sAnimateTransformMethodFetched = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #61  <Field boolean sAnimateTransformMethodFetched>
		}
	//   24   49:return          
	}

	static void reserveEndAnimateTransform(ImageView imageview, Animator animator)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          20
			animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter(imageview) {

				public void onAnimationEnd(Animator animator1)
				{
					android.widget.ImageView.ScaleType scaletype = (android.widget.ImageView.ScaleType)view.getTag(R.id.save_scale_type);
				//    0    0:aload_0         
				//    1    1:getfield        #15  <Field ImageView val$view>
				//    2    4:getstatic       #27  <Field int R$id.save_scale_type>
				//    3    7:invokevirtual   #33  <Method Object ImageView.getTag(int)>
				//    4   10:checkcast       #35  <Class android.widget.ImageView$ScaleType>
				//    5   13:astore_2        
					view.setScaleType(scaletype);
				//    6   14:aload_0         
				//    7   15:getfield        #15  <Field ImageView val$view>
				//    8   18:aload_2         
				//    9   19:invokevirtual   #39  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
					view.setTag(R.id.save_scale_type, ((Object) (null)));
				//   10   22:aload_0         
				//   11   23:getfield        #15  <Field ImageView val$view>
				//   12   26:getstatic       #27  <Field int R$id.save_scale_type>
				//   13   29:aconst_null     
				//   14   30:invokevirtual   #43  <Method void ImageView.setTag(int, Object)>
					if(scaletype == android.widget.ImageView.ScaleType.MATRIX)
				//*  15   33:aload_2         
				//*  16   34:getstatic       #47  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
				//*  17   37:if_acmpne       70
					{
						ImageView imageview1 = view;
				//   18   40:aload_0         
				//   19   41:getfield        #15  <Field ImageView val$view>
				//   20   44:astore_2        
						imageview1.setImageMatrix((Matrix)imageview1.getTag(R.id.save_image_matrix));
				//   21   45:aload_2         
				//   22   46:aload_2         
				//   23   47:getstatic       #50  <Field int R$id.save_image_matrix>
				//   24   50:invokevirtual   #33  <Method Object ImageView.getTag(int)>
				//   25   53:checkcast       #52  <Class Matrix>
				//   26   56:invokevirtual   #56  <Method void ImageView.setImageMatrix(Matrix)>
						view.setTag(R.id.save_image_matrix, ((Object) (null)));
				//   27   59:aload_0         
				//   28   60:getfield        #15  <Field ImageView val$view>
				//   29   63:getstatic       #50  <Field int R$id.save_image_matrix>
				//   30   66:aconst_null     
				//   31   67:invokevirtual   #43  <Method void ImageView.setTag(int, Object)>
					}
					animator1.removeListener(((android.animation.Animator.AnimatorListener) (this)));
				//   32   70:aload_1         
				//   33   71:aload_0         
				//   34   72:invokevirtual   #62  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
				//   35   75:return          
				}

				final ImageView val$view;

			
			{
				view = imageview;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field ImageView val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
			//    5    9:return          
			}
			}
)));
	//    3    8:aload_1         
	//    4    9:new             #6   <Class ImageViewUtils$1>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokespecial   #87  <Method void ImageViewUtils$1(ImageView)>
	//    8   17:invokevirtual   #93  <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
	//    9   20:return          
	}

	static void startAnimateTransform(ImageView imageview)
	{
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #31  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          56
		{
			android.widget.ImageView.ScaleType scaletype = imageview.getScaleType();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #98  <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//    5   12:astore_1        
			imageview.setTag(R.id.save_scale_type, ((Object) (scaletype)));
	//    6   13:aload_0         
	//    7   14:getstatic       #103 <Field int R$id.save_scale_type>
	//    8   17:aload_1         
	//    9   18:invokevirtual   #107 <Method void ImageView.setTag(int, Object)>
			if(scaletype == android.widget.ImageView.ScaleType.MATRIX)
	//*  10   21:aload_1         
	//*  11   22:getstatic       #113 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  12   25:if_acmpne       42
				imageview.setTag(R.id.save_image_matrix, ((Object) (imageview.getImageMatrix())));
	//   13   28:aload_0         
	//   14   29:getstatic       #116 <Field int R$id.save_image_matrix>
	//   15   32:aload_0         
	//   16   33:invokevirtual   #120 <Method Matrix ImageView.getImageMatrix()>
	//   17   36:invokevirtual   #107 <Method void ImageView.setTag(int, Object)>
			else
	//*  18   39:goto            49
				imageview.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//   19   42:aload_0         
	//   20   43:getstatic       #113 <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//   21   46:invokevirtual   #124 <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
			imageview.setImageMatrix(MatrixUtils.IDENTITY_MATRIX);
	//   22   49:aload_0         
	//   23   50:getstatic       #130 <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   24   53:invokevirtual   #37  <Method void ImageView.setImageMatrix(Matrix)>
		}
	//   25   56:return          
	}

	private static final String TAG = "ImageViewUtils";
	private static Method sAnimateTransformMethod;
	private static boolean sAnimateTransformMethodFetched;
}
