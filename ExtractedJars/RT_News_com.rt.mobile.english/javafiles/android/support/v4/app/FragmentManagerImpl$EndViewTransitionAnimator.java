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
		if(mEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean mEnded>
	//*   2    4:ifeq            14
			return mTransitionEnded ^ true;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field boolean mTransitionEnded>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:ireturn         
		if(!super.getTransformation(l, transformation))
	//*   8   14:aload_0         
	//*   9   15:lload_1         
	//*  10   16:aload_3         
	//*  11   17:invokespecial   #40  <Method boolean AnimationSet.getTransformation(long, Transformation)>
	//*  12   20:ifne            37
		{
			mEnded = true;
	//   13   23:aload_0         
	//   14   24:iconst_1        
	//   15   25:putfield        #36  <Field boolean mEnded>
			OneShotPreDrawListener.add(((View) (mParent)), ((Runnable) (this)));
	//   16   28:aload_0         
	//   17   29:getfield        #24  <Field ViewGroup mParent>
	//   18   32:aload_0         
	//   19   33:invokestatic    #46  <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   20   36:pop             
		}
		return true;
	//   21   37:iconst_1        
	//   22   38:ireturn         
	}

	public boolean getTransformation(long l, Transformation transformation, float f)
	{
		if(mEnded)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field boolean mEnded>
	//*   2    4:ifeq            14
			return mTransitionEnded ^ true;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field boolean mTransitionEnded>
	//    5   11:iconst_1        
	//    6   12:ixor            
	//    7   13:ireturn         
		if(!super.getTransformation(l, transformation, f))
	//*   8   14:aload_0         
	//*   9   15:lload_1         
	//*  10   16:aload_3         
	//*  11   17:fload           4
	//*  12   19:invokespecial   #49  <Method boolean AnimationSet.getTransformation(long, Transformation, float)>
	//*  13   22:ifne            39
		{
			mEnded = true;
	//   14   25:aload_0         
	//   15   26:iconst_1        
	//   16   27:putfield        #36  <Field boolean mEnded>
			OneShotPreDrawListener.add(((View) (mParent)), ((Runnable) (this)));
	//   17   30:aload_0         
	//   18   31:getfield        #24  <Field ViewGroup mParent>
	//   19   34:aload_0         
	//   20   35:invokestatic    #46  <Method OneShotPreDrawListener OneShotPreDrawListener.add(View, Runnable)>
	//   21   38:pop             
		}
		return true;
	//   22   39:iconst_1        
	//   23   40:ireturn         
	}

	public void run()
	{
		mParent.endViewTransition(mChild);
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ViewGroup mParent>
	//    2    4:aload_0         
	//    3    5:getfield        #26  <Field View mChild>
	//    4    8:invokevirtual   #57  <Method void ViewGroup.endViewTransition(View)>
		mTransitionEnded = true;
	//    5   11:aload_0         
	//    6   12:iconst_1        
	//    7   13:putfield        #38  <Field boolean mTransitionEnded>
	//    8   16:return          
	}

	private final View mChild;
	private boolean mEnded;
	private final ViewGroup mParent;
	private boolean mTransitionEnded;

	FragmentManagerImpl$EndViewTransitionAnimator(Animation animation, ViewGroup viewgroup, View view)
	{
		super(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokespecial   #22  <Method void AnimationSet(boolean)>
		mParent = viewgroup;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field ViewGroup mParent>
		mChild = view;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #26  <Field View mChild>
		addAnimation(animation);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #30  <Method void addAnimation(Animation)>
	//   12   20:return          
	}
}
