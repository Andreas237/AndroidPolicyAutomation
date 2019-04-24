// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;

// Referenced classes of package android.support.transition:
//			ImageViewUtilsApi14

class ImageViewUtilsApi14$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		android.widget.ImageView.ScaleType scaletype = (android.widget.ImageView.ScaleType)val$view.getTag(R.id.save_scale_type);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ImageView val$view>
	//    2    4:getstatic       #31  <Field int R$id.save_scale_type>
	//    3    7:invokevirtual   #37  <Method Object ImageView.getTag(int)>
	//    4   10:checkcast       #39  <Class android.widget.ImageView$ScaleType>
	//    5   13:astore_2        
		val$view.setScaleType(scaletype);
	//    6   14:aload_0         
	//    7   15:getfield        #19  <Field ImageView val$view>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #43  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		val$view.setTag(R.id.save_scale_type, ((Object) (null)));
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
			val$view.setImageMatrix((Matrix)val$view.getTag(R.id.save_image_matrix));
	//   18   40:aload_0         
	//   19   41:getfield        #19  <Field ImageView val$view>
	//   20   44:aload_0         
	//   21   45:getfield        #19  <Field ImageView val$view>
	//   22   48:getstatic       #54  <Field int R$id.save_image_matrix>
	//   23   51:invokevirtual   #37  <Method Object ImageView.getTag(int)>
	//   24   54:checkcast       #56  <Class Matrix>
	//   25   57:invokevirtual   #60  <Method void ImageView.setImageMatrix(Matrix)>
			val$view.setTag(R.id.save_image_matrix, ((Object) (null)));
	//   26   60:aload_0         
	//   27   61:getfield        #19  <Field ImageView val$view>
	//   28   64:getstatic       #54  <Field int R$id.save_image_matrix>
	//   29   67:aconst_null     
	//   30   68:invokevirtual   #47  <Method void ImageView.setTag(int, Object)>
		}
		animator.removeListener(((android.animation.ner) (this)));
	//   31   71:aload_1         
	//   32   72:aload_0         
	//   33   73:invokevirtual   #66  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
	//   34   76:return          
	}

	final ImageViewUtilsApi14 this$0;
	final ImageView val$view;

	ImageViewUtilsApi14$1()
	{
		this$0 = final_imageviewutilsapi14;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ImageViewUtilsApi14 this$0>
		val$view = ImageView.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field ImageView val$view>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void AnimatorListenerAdapter()>
	//    8   14:return          
	}
}
