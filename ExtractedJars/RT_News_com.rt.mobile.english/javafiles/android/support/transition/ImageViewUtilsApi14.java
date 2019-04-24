// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;

// Referenced classes of package android.support.transition:
//			ImageViewUtilsImpl, MatrixUtils

class ImageViewUtilsApi14
	implements ImageViewUtilsImpl
{

	ImageViewUtilsApi14()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}

	public void animateTransform(ImageView imageview, Matrix matrix)
	{
		imageview.setImageMatrix(matrix);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #24  <Method void ImageView.setImageMatrix(Matrix)>
	//    3    5:return          
	}

	public void reserveEndAnimateTransform(final ImageView view, Animator animator)
	{
		animator.addListener(((android.animation.Animator.AnimatorListener) (new AnimatorListenerAdapter() {

			public void onAnimationEnd(Animator animator1)
			{
				android.widget.ImageView.ScaleType scaletype = (android.widget.ImageView.ScaleType)view.getTag(R.id.save_scale_type);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ImageView val$view>
			//    2    4:getstatic       #31  <Field int R$id.save_scale_type>
			//    3    7:invokevirtual   #37  <Method Object ImageView.getTag(int)>
			//    4   10:checkcast       #39  <Class android.widget.ImageView$ScaleType>
			//    5   13:astore_2        
				view.setScaleType(scaletype);
			//    6   14:aload_0         
			//    7   15:getfield        #19  <Field ImageView val$view>
			//    8   18:aload_2         
			//    9   19:invokevirtual   #43  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
				view.setTag(R.id.save_scale_type, ((Object) (null)));
			//   10   22:aload_0         
			//   11   23:getfield        #19  <Field ImageView val$view>
			//   12   26:getstatic       #31  <Field int R$id.save_scale_type>
			//   13   29:aconst_null     
			//   14   30:invokevirtual   #47  <Method void ImageView.setTag(int, Object)>
				if(scaletype == android.widget.ImageView.ScaleType.MATRIX)
			//*  15   33:aload_2         
			//*  16   34:getstatic       #51  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
			//*  17   37:if_acmpne       71
				{
					view.setImageMatrix((Matrix)view.getTag(R.id.save_image_matrix));
			//   18   40:aload_0         
			//   19   41:getfield        #19  <Field ImageView val$view>
			//   20   44:aload_0         
			//   21   45:getfield        #19  <Field ImageView val$view>
			//   22   48:getstatic       #54  <Field int R$id.save_image_matrix>
			//   23   51:invokevirtual   #37  <Method Object ImageView.getTag(int)>
			//   24   54:checkcast       #56  <Class Matrix>
			//   25   57:invokevirtual   #60  <Method void ImageView.setImageMatrix(Matrix)>
					view.setTag(R.id.save_image_matrix, ((Object) (null)));
			//   26   60:aload_0         
			//   27   61:getfield        #19  <Field ImageView val$view>
			//   28   64:getstatic       #54  <Field int R$id.save_image_matrix>
			//   29   67:aconst_null     
			//   30   68:invokevirtual   #47  <Method void ImageView.setTag(int, Object)>
				}
				animator1.removeListener(((android.animation.Animator.AnimatorListener) (this)));
			//   31   71:aload_1         
			//   32   72:aload_0         
			//   33   73:invokevirtual   #66  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
			//   34   76:return          
			}

			final ImageViewUtilsApi14 this$0;
			final ImageView val$view;

			
			{
				this$0 = ImageViewUtilsApi14.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field ImageViewUtilsApi14 this$0>
				view = imageview;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field ImageView val$view>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
			//    8   14:return          
			}
		}
)));
	//    0    0:aload_2         
	//    1    1:new             #8   <Class ImageViewUtilsApi14$1>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #29  <Method void ImageViewUtilsApi14$1(ImageViewUtilsApi14, ImageView)>
	//    6   10:invokevirtual   #35  <Method void Animator.addListener(android.animation.Animator$AnimatorListener)>
	//    7   13:return          
	}

	public void startAnimateTransform(ImageView imageview)
	{
		android.widget.ImageView.ScaleType scaletype = imageview.getScaleType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #41  <Method android.widget.ImageView$ScaleType ImageView.getScaleType()>
	//    2    4:astore_2        
		imageview.setTag(R.id.save_scale_type, ((Object) (scaletype)));
	//    3    5:aload_1         
	//    4    6:getstatic       #47  <Field int R$id.save_scale_type>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #51  <Method void ImageView.setTag(int, Object)>
		if(scaletype == android.widget.ImageView.ScaleType.MATRIX)
	//*   7   13:aload_2         
	//*   8   14:getstatic       #57  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*   9   17:if_acmpne       34
			imageview.setTag(R.id.save_image_matrix, ((Object) (imageview.getImageMatrix())));
	//   10   20:aload_1         
	//   11   21:getstatic       #60  <Field int R$id.save_image_matrix>
	//   12   24:aload_1         
	//   13   25:invokevirtual   #64  <Method Matrix ImageView.getImageMatrix()>
	//   14   28:invokevirtual   #51  <Method void ImageView.setTag(int, Object)>
		else
	//*  15   31:goto            41
			imageview.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
	//   16   34:aload_1         
	//   17   35:getstatic       #57  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//   18   38:invokevirtual   #68  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		imageview.setImageMatrix(MatrixUtils.IDENTITY_MATRIX);
	//   19   41:aload_1         
	//   20   42:getstatic       #74  <Field Matrix MatrixUtils.IDENTITY_MATRIX>
	//   21   45:invokevirtual   #24  <Method void ImageView.setImageMatrix(Matrix)>
	//   22   48:return          
	}
}
