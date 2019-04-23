// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.*;

// Referenced classes of package android.support.v4.app:
//			FragmentManagerImpl, OneShotPreDrawListener

private static class FragmentManagerImpl$EndViewTransitionAnimator extends AnimationSet
	implements Runnable
{

	public boolean getTransformation(long l, Transformation transformation)
	{
		mAnimating = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #25  <Field boolean mAnimating>
		if(mEnded)
	//*   3    5:aload_0         
	//*   4    6:getfield        #45  <Field boolean mEnded>
	//*   5    9:ifeq            19
			return mTransitionEnded ^ true;
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field boolean mTransitionEnded>
	//    8   16:iconst_1        
	//    9   17:ixor            
	//   10   18:ireturn         
		if(!super.getTransformation(l, transformation))
	//*  11   19:aload_0         
	//*  12   20:lload_1         
	//*  13   21:aload_3         
	//*  14   22:invokespecial   #49  <Method boolean AnimationSet.getTransformation(long, Transformation)>
	//*  15   25:ifne            42
		{
			mEnded = true;
	//   16   28:aload_0         
	//   17   29:iconst_1        
	//   18   30:putfield        #45  <Field boolean mEnded>
			OneShotPreDrawListener.add(((View) (mParent)), ((Runnable) (this)));
	//   19   33:aload_0         
	//   20   34:getfield        #27  <Field ViewGroup mParent>
	//   21   37:aload_0         
	//   22   38:invokestatic    #55  <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   23   41:pop             
		}
		return true;
	//   24   42:iconst_1        
	//   25   43:ireturn         
	}

	public boolean getTransformation(long l, Transformation transformation, float f)
	{
		mAnimating = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #25  <Field boolean mAnimating>
		if(mEnded)
	//*   3    5:aload_0         
	//*   4    6:getfield        #45  <Field boolean mEnded>
	//*   5    9:ifeq            19
			return mTransitionEnded ^ true;
	//    6   12:aload_0         
	//    7   13:getfield        #47  <Field boolean mTransitionEnded>
	//    8   16:iconst_1        
	//    9   17:ixor            
	//   10   18:ireturn         
		if(!super.getTransformation(l, transformation, f))
	//*  11   19:aload_0         
	//*  12   20:lload_1         
	//*  13   21:aload_3         
	//*  14   22:fload           4
	//*  15   24:invokespecial   #58  <Method boolean AnimationSet.getTransformation(long, Transformation, float)>
	//*  16   27:ifne            44
		{
			mEnded = true;
	//   17   30:aload_0         
	//   18   31:iconst_1        
	//   19   32:putfield        #45  <Field boolean mEnded>
			OneShotPreDrawListener.add(((View) (mParent)), ((Runnable) (this)));
	//   20   35:aload_0         
	//   21   36:getfield        #27  <Field ViewGroup mParent>
	//   22   39:aload_0         
	//   23   40:invokestatic    #55  <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   24   43:pop             
		}
		return true;
	//   25   44:iconst_1        
	//   26   45:ireturn         
	}

	public void run()
	{
		if(!mEnded && mAnimating)
	//*   0    0:aload_0         
	//*   1    1:getfield        #45  <Field boolean mEnded>
	//*   2    4:ifne            29
	//*   3    7:aload_0         
	//*   4    8:getfield        #25  <Field boolean mAnimating>
	//*   5   11:ifeq            29
		{
			mAnimating = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #25  <Field boolean mAnimating>
			mParent.post(((Runnable) (this)));
	//    9   19:aload_0         
	//   10   20:getfield        #27  <Field ViewGroup mParent>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #39  <Method boolean ViewGroup.post(Runnable)>
	//   13   27:pop             
			return;
	//   14   28:return          
		} else
		{
			mParent.endViewTransition(mChild);
	//   15   29:aload_0         
	//   16   30:getfield        #27  <Field ViewGroup mParent>
	//   17   33:aload_0         
	//   18   34:getfield        #29  <Field View mChild>
	//   19   37:invokevirtual   #64  <Method void ViewGroup.endViewTransition(View)>
			mTransitionEnded = true;
	//   20   40:aload_0         
	//   21   41:iconst_1        
	//   22   42:putfield        #47  <Field boolean mTransitionEnded>
			return;
	//   23   45:return          
		}
	}

	private boolean mAnimating;
	private final View mChild;
	private boolean mEnded;
	private final ViewGroup mParent;
	private boolean mTransitionEnded;

	FragmentManagerImpl$EndViewTransitionAnimator(Animation animation, ViewGroup viewgroup, View view)
	{
		super(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #23  <Method void AnimationSet(boolean)>
		mAnimating = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #25  <Field boolean mAnimating>
		mParent = viewgroup;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #27  <Field ViewGroup mParent>
		mChild = view;
	//    9   15:aload_0         
	//   10   16:aload_3         
	//   11   17:putfield        #29  <Field View mChild>
		addAnimation(animation);
	//   12   20:aload_0         
	//   13   21:aload_1         
	//   14   22:invokevirtual   #33  <Method void addAnimation(Animation)>
		mParent.post(((Runnable) (this)));
	//   15   25:aload_0         
	//   16   26:getfield        #27  <Field ViewGroup mParent>
	//   17   29:aload_0         
	//   18   30:invokevirtual   #39  <Method boolean ViewGroup.post(Runnable)>
	//   19   33:pop             
	//   20   34:return          
	}
}
