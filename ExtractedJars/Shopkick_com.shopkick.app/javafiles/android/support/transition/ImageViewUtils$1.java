// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.widget.ImageView;

// Referenced classes of package android.support.transition:
//			ImageViewUtils

static final class ImageViewUtils$1 extends AnimatorListenerAdapter
{

	public void onAnimationEnd(Animator animator)
	{
		android.widget.pe pe = (android.widget.pe)val$view.getTag(R.id.save_scale_type);
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ImageView val$view>
	//    2    4:getstatic       #27  <Field int R$id.save_scale_type>
	//    3    7:invokevirtual   #33  <Method Object ImageView.getTag(int)>
	//    4   10:checkcast       #35  <Class android.widget.ImageView$ScaleType>
	//    5   13:astore_2        
		val$view.setScaleType(pe);
	//    6   14:aload_0         
	//    7   15:getfield        #15  <Field ImageView val$view>
	//    8   18:aload_2         
	//    9   19:invokevirtual   #39  <Method void ImageView.setScaleType(android.widget.ImageView$ScaleType)>
		val$view.setTag(R.id.save_scale_type, ((Object) (null)));
	//   10   22:aload_0         
	//   11   23:getfield        #15  <Field ImageView val$view>
	//   12   26:getstatic       #27  <Field int R$id.save_scale_type>
	//   13   29:aconst_null     
	//   14   30:invokevirtual   #43  <Method void ImageView.setTag(int, Object)>
		if(pe == android.widget.pe.MATRIX)
	//*  15   33:aload_2         
	//*  16   34:getstatic       #47  <Field android.widget.ImageView$ScaleType android.widget.ImageView$ScaleType.MATRIX>
	//*  17   37:if_acmpne       70
		{
			ImageView imageview = val$view;
	//   18   40:aload_0         
	//   19   41:getfield        #15  <Field ImageView val$view>
	//   20   44:astore_2        
			imageview.setImageMatrix((Matrix)imageview.getTag(R.id.save_image_matrix));
	//   21   45:aload_2         
	//   22   46:aload_2         
	//   23   47:getstatic       #50  <Field int R$id.save_image_matrix>
	//   24   50:invokevirtual   #33  <Method Object ImageView.getTag(int)>
	//   25   53:checkcast       #52  <Class Matrix>
	//   26   56:invokevirtual   #56  <Method void ImageView.setImageMatrix(Matrix)>
			val$view.setTag(R.id.save_image_matrix, ((Object) (null)));
	//   27   59:aload_0         
	//   28   60:getfield        #15  <Field ImageView val$view>
	//   29   63:getstatic       #50  <Field int R$id.save_image_matrix>
	//   30   66:aconst_null     
	//   31   67:invokevirtual   #43  <Method void ImageView.setTag(int, Object)>
		}
		animator.removeListener(((android.animation.Listener) (this)));
	//   32   70:aload_1         
	//   33   71:aload_0         
	//   34   72:invokevirtual   #62  <Method void Animator.removeListener(android.animation.Animator$AnimatorListener)>
	//   35   75:return          
	}

	final ImageView val$view;

	ImageViewUtils$1(ImageView imageview)
	{
		val$view = imageview;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ImageView val$view>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void AnimatorListenerAdapter()>
	//    5    9:return          
	}
}
