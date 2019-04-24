// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Matrix;
import android.view.View;

// Referenced classes of package android.support.transition:
//			ChangeTransform, ViewUtils

class ChangeTransform$3 extends AnimatorListenerAdapter
{

	private void setCurrentMatrix(Matrix matrix)
	{
		mTempMatrix.set(matrix);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Matrix mTempMatrix>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #51  <Method void Matrix.set(Matrix)>
		val$view.setTag(R.id.transition_transform, ((Object) (mTempMatrix)));
	//    4    8:aload_0         
	//    5    9:getfield        #33  <Field View val$view>
	//    6   12:getstatic       #57  <Field int R$id.transition_transform>
	//    7   15:aload_0         
	//    8   16:getfield        #45  <Field Matrix mTempMatrix>
	//    9   19:invokevirtual   #63  <Method void View.setTag(int, Object)>
		val$transforms.restore(val$view);
	//   10   22:aload_0         
	//   11   23:getfield        #35  <Field ChangeTransform$Transforms val$transforms>
	//   12   26:aload_0         
	//   13   27:getfield        #33  <Field View val$view>
	//   14   30:invokevirtual   #69  <Method void ChangeTransform$Transforms.restore(View)>
	//   15   33:return          
	}

	public void onAnimationCancel(Animator animator)
	{
		mIsCanceled = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #73  <Field boolean mIsCanceled>
	//    3    5:return          
	}

	public void onAnimationEnd(Animator animator)
	{
		if(!mIsCanceled)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field boolean mIsCanceled>
	//*   2    4:ifne            32
			if(val$handleParentChange && ChangeTransform.access$000(ChangeTransform.this))
	//*   3    7:aload_0         
	//*   4    8:getfield        #29  <Field boolean val$handleParentChange>
	//*   5   11:ifeq            52
	//*   6   14:aload_0         
	//*   7   15:getfield        #27  <Field ChangeTransform this$0>
	//*   8   18:invokestatic    #78  <Method boolean ChangeTransform.access$000(ChangeTransform)>
	//*   9   21:ifeq            52
			{
				setCurrentMatrix(val$finalEndMatrix);
	//   10   24:aload_0         
	//   11   25:aload_0         
	//   12   26:getfield        #31  <Field Matrix val$finalEndMatrix>
	//   13   29:invokespecial   #80  <Method void setCurrentMatrix(Matrix)>
			} else
	//*  14   32:aload_0         
	//*  15   33:getfield        #33  <Field View val$view>
	//*  16   36:aconst_null     
	//*  17   37:invokestatic    #86  <Method void ViewUtils.setAnimationMatrix(View, Matrix)>
	//*  18   40:aload_0         
	//*  19   41:getfield        #35  <Field ChangeTransform$Transforms val$transforms>
	//*  20   44:aload_0         
	//*  21   45:getfield        #33  <Field View val$view>
	//*  22   48:invokevirtual   #69  <Method void ChangeTransform$Transforms.restore(View)>
	//*  23   51:return          
			{
				val$view.setTag(R.id.transition_transform, ((Object) (null)));
	//   24   52:aload_0         
	//   25   53:getfield        #33  <Field View val$view>
	//   26   56:getstatic       #57  <Field int R$id.transition_transform>
	//   27   59:aconst_null     
	//   28   60:invokevirtual   #63  <Method void View.setTag(int, Object)>
				val$view.setTag(R.id.parent_matrix, ((Object) (null)));
	//   29   63:aload_0         
	//   30   64:getfield        #33  <Field View val$view>
	//   31   67:getstatic       #89  <Field int R$id.parent_matrix>
	//   32   70:aconst_null     
	//   33   71:invokevirtual   #63  <Method void View.setTag(int, Object)>
			}
		ViewUtils.setAnimationMatrix(val$view, ((Matrix) (null)));
		val$transforms.restore(val$view);
	//*  34   74:goto            32
	}

	public void onAnimationPause(Animator animator)
	{
		setCurrentMatrix(val$pathAnimatorMatrix.getMatrix());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #37  <Field ChangeTransform$PathAnimatorMatrix val$pathAnimatorMatrix>
	//    3    5:invokevirtual   #96  <Method Matrix ChangeTransform$PathAnimatorMatrix.getMatrix()>
	//    4    8:invokespecial   #80  <Method void setCurrentMatrix(Matrix)>
	//    5   11:return          
	}

	public void onAnimationResume(Animator animator)
	{
		ChangeTransform.access$100(val$view);
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field View val$view>
	//    2    4:invokestatic    #100 <Method void ChangeTransform.access$100(View)>
	//    3    7:return          
	}

	private boolean mIsCanceled;
	private Matrix mTempMatrix;
	final ChangeTransform this$0;
	final Matrix val$finalEndMatrix;
	final boolean val$handleParentChange;
	final thAnimatorMatrix val$pathAnimatorMatrix;
	final ansforms val$transforms;
	final View val$view;

	ChangeTransform$3()
	{
		this$0 = final_changetransform;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #27  <Field ChangeTransform this$0>
		val$handleParentChange = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #29  <Field boolean val$handleParentChange>
		val$finalEndMatrix = matrix;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #31  <Field Matrix val$finalEndMatrix>
		val$view = view1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #33  <Field View val$view>
		val$transforms = ansforms;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #35  <Field ChangeTransform$Transforms val$transforms>
		val$pathAnimatorMatrix = thAnimatorMatrix.this;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #37  <Field ChangeTransform$PathAnimatorMatrix val$pathAnimatorMatrix>
		super();
	//   18   33:aload_0         
	//   19   34:invokespecial   #40  <Method void AnimatorListenerAdapter()>
		mTempMatrix = new Matrix();
	//   20   37:aload_0         
	//   21   38:new             #42  <Class Matrix>
	//   22   41:dup             
	//   23   42:invokespecial   #43  <Method void Matrix()>
	//   24   45:putfield        #45  <Field Matrix mTempMatrix>
	//   25   48:return          
	}
}
