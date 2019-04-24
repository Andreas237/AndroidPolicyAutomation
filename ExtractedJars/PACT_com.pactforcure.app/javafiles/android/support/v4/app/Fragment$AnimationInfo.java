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

	private Boolean mAllowEnterTransitionOverlap;
	private Boolean mAllowReturnTransitionOverlap;
	View mAnimatingAway;
	Animator mAnimator;
	private Object mEnterTransition;
	SharedElementCallback mEnterTransitionCallback;
	boolean mEnterTransitionPostponed;
	private Object mExitTransition;
	SharedElementCallback mExitTransitionCallback;
	boolean mIsHideReplaced;
	int mNextAnim;
	int mNextTransition;
	int mNextTransitionStyle;
	private Object mReenterTransition;
	private Object mReturnTransition;
	private Object mSharedElementEnterTransition;
	private Object mSharedElementReturnTransition;
	ansitionListener mStartEnterTransitionListener;
	int mStateAfterAnimating;


/*
	static Object access$000(Fragment$AnimationInfo fragment$animationinfo)
	{
		return fragment$animationinfo.mEnterTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field Object mEnterTransition>
	//    2    4:areturn         
	}

*/


/*
	static Object access$002(Fragment$AnimationInfo fragment$animationinfo, Object obj)
	{
		fragment$animationinfo.mEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field Object mEnterTransition>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$100(Fragment$AnimationInfo fragment$animationinfo)
	{
		return fragment$animationinfo.mReturnTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Object mReturnTransition>
	//    2    4:areturn         
	}

*/


/*
	static Object access$102(Fragment$AnimationInfo fragment$animationinfo, Object obj)
	{
		fragment$animationinfo.mReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Object mReturnTransition>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$200(Fragment$AnimationInfo fragment$animationinfo)
	{
		return fragment$animationinfo.mExitTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object mExitTransition>
	//    2    4:areturn         
	}

*/


/*
	static Object access$202(Fragment$AnimationInfo fragment$animationinfo, Object obj)
	{
		fragment$animationinfo.mExitTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field Object mExitTransition>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$300(Fragment$AnimationInfo fragment$animationinfo)
	{
		return fragment$animationinfo.mReenterTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #49  <Field Object mReenterTransition>
	//    2    4:areturn         
	}

*/


/*
	static Object access$302(Fragment$AnimationInfo fragment$animationinfo, Object obj)
	{
		fragment$animationinfo.mReenterTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #49  <Field Object mReenterTransition>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$400(Fragment$AnimationInfo fragment$animationinfo)
	{
		return fragment$animationinfo.mSharedElementEnterTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object mSharedElementEnterTransition>
	//    2    4:areturn         
	}

*/


/*
	static Object access$402(Fragment$AnimationInfo fragment$animationinfo, Object obj)
	{
		fragment$animationinfo.mSharedElementEnterTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Object mSharedElementEnterTransition>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Object access$500(Fragment$AnimationInfo fragment$animationinfo)
	{
		return fragment$animationinfo.mSharedElementReturnTransition;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field Object mSharedElementReturnTransition>
	//    2    4:areturn         
	}

*/


/*
	static Object access$502(Fragment$AnimationInfo fragment$animationinfo, Object obj)
	{
		fragment$animationinfo.mSharedElementReturnTransition = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #53  <Field Object mSharedElementReturnTransition>
		return obj;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Boolean access$600(Fragment$AnimationInfo fragment$animationinfo)
	{
		return fragment$animationinfo.mAllowEnterTransitionOverlap;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Boolean mAllowEnterTransitionOverlap>
	//    2    4:areturn         
	}

*/


/*
	static Boolean access$602(Fragment$AnimationInfo fragment$animationinfo, Boolean boolean1)
	{
		fragment$animationinfo.mAllowEnterTransitionOverlap = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #76  <Field Boolean mAllowEnterTransitionOverlap>
		return boolean1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static Boolean access$700(Fragment$AnimationInfo fragment$animationinfo)
	{
		return fragment$animationinfo.mAllowReturnTransitionOverlap;
	//    0    0:aload_0         
	//    1    1:getfield        #81  <Field Boolean mAllowReturnTransitionOverlap>
	//    2    4:areturn         
	}

*/


/*
	static Boolean access$702(Fragment$AnimationInfo fragment$animationinfo, Boolean boolean1)
	{
		fragment$animationinfo.mAllowReturnTransitionOverlap = boolean1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #81  <Field Boolean mAllowReturnTransitionOverlap>
		return boolean1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/

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
