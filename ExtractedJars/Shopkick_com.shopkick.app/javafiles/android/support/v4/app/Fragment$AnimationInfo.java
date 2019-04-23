// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//			Fragment, SharedElementCallback

static class Fragment$AnimationInfo
{

	Boolean mAllowEnterTransitionOverlap;
	Boolean mAllowReturnTransitionOverlap;
	View mAnimatingAway;
	Animator mAnimator;
	Object mEnterTransition;
	SharedElementCallback mEnterTransitionCallback;
	boolean mEnterTransitionPostponed;
	Object mExitTransition;
	SharedElementCallback mExitTransitionCallback;
	boolean mIsHideReplaced;
	int mNextAnim;
	int mNextTransition;
	int mNextTransitionStyle;
	Object mReenterTransition;
	Object mReturnTransition;
	Object mSharedElementEnterTransition;
	Object mSharedElementReturnTransition;
	ansitionListener mStartEnterTransitionListener;
	int mStateAfterAnimating;

	Fragment$AnimationInfo()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		mEnterTransition = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #40  <Field Object mEnterTransition>
		mReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
	//    5    9:aload_0         
	//    6   10:getstatic       #43  <Field Object Fragment.USE_DEFAULT_TRANSITION>
	//    7   13:putfield        #45  <Field Object mReturnTransition>
		mExitTransition = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #47  <Field Object mExitTransition>
		mReenterTransition = Fragment.USE_DEFAULT_TRANSITION;
	//   11   21:aload_0         
	//   12   22:getstatic       #43  <Field Object Fragment.USE_DEFAULT_TRANSITION>
	//   13   25:putfield        #49  <Field Object mReenterTransition>
		mSharedElementEnterTransition = null;
	//   14   28:aload_0         
	//   15   29:aconst_null     
	//   16   30:putfield        #51  <Field Object mSharedElementEnterTransition>
		mSharedElementReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
	//   17   33:aload_0         
	//   18   34:getstatic       #43  <Field Object Fragment.USE_DEFAULT_TRANSITION>
	//   19   37:putfield        #53  <Field Object mSharedElementReturnTransition>
		mEnterTransitionCallback = null;
	//   20   40:aload_0         
	//   21   41:aconst_null     
	//   22   42:putfield        #55  <Field SharedElementCallback mEnterTransitionCallback>
		mExitTransitionCallback = null;
	//   23   45:aload_0         
	//   24   46:aconst_null     
	//   25   47:putfield        #57  <Field SharedElementCallback mExitTransitionCallback>
	//   26   50:return          
	}
}
